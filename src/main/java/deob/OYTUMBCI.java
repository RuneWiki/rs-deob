package deob;

@ObfuscatedName("OYTUMBCI")
public class OYTUMBCI {

	@ObfuscatedName("OYTUMBCI.b")
	public long field1072;

	@ObfuscatedName("OYTUMBCI.c")
	public OYTUMBCI field1073;

	@ObfuscatedName("OYTUMBCI.d")
	public OYTUMBCI field1074;

	@ObfuscatedName("OYTUMBCI.a()V")
	public void method367() {
		if (field1074 != null) {
			field1074.field1073 = field1073;
			field1073.field1074 = field1074;
			field1073 = null;
			field1074 = null;
		}
	}
}
