package essai;



public class Pair implements Cloneable   {
	 int n ;
	 String  s ;
	public Pair (int nn , String ss) {
		n= nn ;
		s= ss;
	}
	public boolean equals (Pair p){
		if (this.n != p.n)
			return false ;
		  int t1 , t2 ,i ;
		t1=this.s.length() ;
		t2=p.s.length() ;
		if (t1>t2) 
		i=t2 ;
		else 
			i=t1 ;
		
		
		for ( i=0 ; i<s.length();i++){
		if (this.s.charAt(i)!= p.s.charAt(i))
			return  false; 
		
		else
			return  true ;
		
		
		
	}
		return true;
		}

	public Pair clone() throws CloneNotSupportedException{
		Pair pc = (Pair) super.clone() ;
		return pc ;
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		Pair pr = new Pair(5,"bjr");
		pr.n = 5 ;
		Pair prc = pr.clone() ;
		System.out.println(pr.n+" et "+pr.s+" contre "+prc.n+" et "+prc.s);
		boolean x = pr.equals( prc ) ;
		if (x=true) 
			System.out.println("clonage reggfgfgussi");
		else System.out.println("clonage echoué ");
		
		
	}
	
}
