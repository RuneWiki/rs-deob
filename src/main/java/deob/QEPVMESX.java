package deob;

@ObfuscatedName("QEPVMESX")
public class QEPVMESX {

	@ObfuscatedName("QEPVMESX.b")
	public long field1023;

	@ObfuscatedName("QEPVMESX.c")
	public QEPVMESX field1024;

	@ObfuscatedName("QEPVMESX.d")
	public QEPVMESX field1025;

	@ObfuscatedName("QEPVMESX.a()V")
	public void method418() {
		if (field1025 != null) {
			field1025.field1024 = field1024;
			field1024.field1025 = field1025;
			field1024 = null;
			field1025 = null;
		}
	}
}
