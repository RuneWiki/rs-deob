package deob;

@ObfuscatedName("AJSSLSFA")
public class AJSSLSFA {

	@ObfuscatedName("AJSSLSFA.b")
	public long field10;

	@ObfuscatedName("AJSSLSFA.c")
	public AJSSLSFA field11;

	@ObfuscatedName("AJSSLSFA.d")
	public AJSSLSFA field12;

	@ObfuscatedName("AJSSLSFA.a()V")
	public void method1() {
		if (field12 != null) {
			field12.field11 = field11;
			field11.field12 = field12;
			field11 = null;
			field12 = null;
		}
	}
}
