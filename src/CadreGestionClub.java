
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;
public class CadreGestionClub extends JFrame{
	
	
	public CadreGestionClub(String titre) {
		
		super(titre);
		Container c=this.getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.add(panneauPrincipal());
		

		pack();
		
	}
	
	JPanel panneauPrincipal() {
				
		JPanel p=new JPanel();
		
		p.setLayout(new BorderLayout());
		
		p.add(panneauGrandCentre(),BorderLayout.CENTER);
		
		JPanel panneauGrandSud =new JPanel();
		p.add(panneauGrandSud,BorderLayout.SOUTH);
		
		JButton ok=new JButton("ok");
		JButton annuler=new JButton("annuler");
		panneauGrandSud.add(ok);
		
		panneauGrandSud.add(annuler);
		ok.setPreferredSize(annuler.getPreferredSize());
		panneauGrandSud.setLayout(new FlowLayout());
		
		JPanel panneauGrandEst =new JPanel();
		p.add(panneauGrandEst,BorderLayout.EAST);
		panneauGrandEst.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLUE), "Loisirs"));
		GridLayout gr=new GridLayout(0,1);
		panneauGrandEst.setLayout(gr);
		JCheckBox[] tab= new JCheckBox[Loisir.NOMBRE];
		for(int i=0;i<Loisir.NOMBRE;i++)
			{tab[i]=new JCheckBox(Loisir.values()[i].toString());}
		for(JCheckBox ex : tab) {
			panneauGrandEst.add(ex);
			}
		
		
		
		
		return p;
		
		
	}
	
	JPanel panneauGrandCentre() {
		
		
		JPanel p=new JPanel ();
		p.setLayout(new BorderLayout(50,50));
		Border b=BorderFactory.createBevelBorder(BevelBorder.RAISED, Color.cyan, Color.green);
		p.setBorder(b);
		
		
		JPanel panneauPetitNord =new JPanel();
		JPanel panneauPetitSud =new JPanel();
		
		
		p.add(panneauPetitNord,BorderLayout.NORTH);
		p.add(panneauPetitSud,BorderLayout.SOUTH);
		
		GridLayout gr= new GridLayout(0,1);
		panneauPetitNord.setLayout(gr);
		
		JLabel nom=new JLabel("Nom :");
		panneauPetitNord.add(nom);
		panneauPetitNord.add(new JTextField(50));
		
		JLabel prenom=new JLabel("Prenom :");
		panneauPetitNord.add(prenom);
		panneauPetitNord.add(new JTextField(50));
		
		JLabel adresse=new JLabel("Adresse:");
		panneauPetitNord.add(adresse);
		
		
		JTextArea tx=new JTextArea(10,10);
		p.add(tx);
		
		JLabel sexe=new JLabel("Sexe");
		JRadioButton j1=new JRadioButton("Homme");
		JRadioButton j2=new JRadioButton("Femme");
		ButtonGroup br=new ButtonGroup();
		br.add(j1);
		br.add(j2);
		
		panneauPetitSud.add(sexe);
		panneauPetitSud.add(j1);
		panneauPetitSud.add(j2);
		
		return p;
		
		
	}

}
