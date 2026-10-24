package deob;

@ObfuscatedName("ABHGPSRU")
public class ABHGPSRU {

	@ObfuscatedName("ABHGPSRU.a")
	public long field1;

	@ObfuscatedName("ABHGPSRU.b")
	public ABHGPSRU field2;

	@ObfuscatedName("ABHGPSRU.c")
	public ABHGPSRU field3;

	@ObfuscatedName("ABHGPSRU.a()V")
	public void method1() {
		if (field3 != null) {
			field3.field2 = field2;
			field2.field3 = field3;
			field2 = null;
			field3 = null;
		}
	}
}
