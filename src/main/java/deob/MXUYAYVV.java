package deob;

@ObfuscatedName("MXUYAYVV")
public class MXUYAYVV {

	@ObfuscatedName("MXUYAYVV.a")
	public long field1076;

	@ObfuscatedName("MXUYAYVV.b")
	public MXUYAYVV field1077;

	@ObfuscatedName("MXUYAYVV.c")
	public MXUYAYVV field1078;

	@ObfuscatedName("MXUYAYVV.a()V")
	public void method430() {
		if (field1078 != null) {
			field1078.field1077 = field1077;
			field1077.field1078 = field1078;
			field1077 = null;
			field1078 = null;
		}
	}
}
