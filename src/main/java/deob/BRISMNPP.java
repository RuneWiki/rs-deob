package deob;

@ObfuscatedName("BRISMNPP")
public class BRISMNPP {

	@ObfuscatedName("BRISMNPP.a")
	public long field99;

	@ObfuscatedName("BRISMNPP.b")
	public BRISMNPP field100;

	@ObfuscatedName("BRISMNPP.c")
	public BRISMNPP field101;

	@ObfuscatedName("BRISMNPP.a()V")
	public void method20() {
		if (field101 != null) {
			field101.field100 = field100;
			field100.field101 = field101;
			field100 = null;
			field101 = null;
		}
	}
}
