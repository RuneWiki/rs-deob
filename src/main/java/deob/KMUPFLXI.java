package deob;

@ObfuscatedName("KMUPFLXI")
public class KMUPFLXI {

	@ObfuscatedName("KMUPFLXI.a")
	public long field841;

	@ObfuscatedName("KMUPFLXI.b")
	public KMUPFLXI field842;

	@ObfuscatedName("KMUPFLXI.c")
	public KMUPFLXI field843;

	@ObfuscatedName("KMUPFLXI.a()V")
	public void method272() {
		if (field843 != null) {
			field843.field842 = field842;
			field842.field843 = field843;
			field842 = null;
			field843 = null;
		}
	}
}
