package deob;

@ObfuscatedName("BEBSUZBY")
public class BEBSUZBY {

	@ObfuscatedName("BEBSUZBY.a")
	public long field123;

	@ObfuscatedName("BEBSUZBY.b")
	public BEBSUZBY field124;

	@ObfuscatedName("BEBSUZBY.c")
	public BEBSUZBY field125;

	@ObfuscatedName("BEBSUZBY.a()V")
	public void method41() {
		if (field125 != null) {
			field125.field124 = field124;
			field124.field125 = field125;
			field124 = null;
			field125 = null;
		}
	}
}
