package deob;

@ObfuscatedName("OGKECTLC")
public class OGKECTLC {

	@ObfuscatedName("OGKECTLC.c")
	public long field1076;

	@ObfuscatedName("OGKECTLC.d")
	public OGKECTLC field1077;

	@ObfuscatedName("OGKECTLC.e")
	public OGKECTLC field1078;

	@ObfuscatedName("OGKECTLC.a()V")
	public void method450() {
		if (field1078 != null) {
			field1078.field1077 = field1077;
			field1077.field1078 = field1078;
			field1077 = null;
			field1078 = null;
		}
	}
}
