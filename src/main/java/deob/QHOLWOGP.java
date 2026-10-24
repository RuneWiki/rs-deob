package deob;

@ObfuscatedName("QHOLWOGP")
public final class QHOLWOGP {

	@ObfuscatedName("QHOLWOGP.b")
	public IVMCUDWL field1257 = new IVMCUDWL();

	@ObfuscatedName("QHOLWOGP.c")
	public IVMCUDWL field1258;

	public QHOLWOGP() {
		field1257.field745 = field1257;
		field1257.field746 = field1257;
	}

	@ObfuscatedName("QHOLWOGP.a(LIVMCUDWL;)V")
	public void method441(IVMCUDWL arg0) {
		if (arg0.field746 != null) {
			arg0.method282();
		}

		arg0.field746 = field1257.field746;
		arg0.field745 = field1257;
		arg0.field746.field745 = arg0;
		arg0.field745.field746 = arg0;
	}

	@ObfuscatedName("QHOLWOGP.a()LIVMCUDWL;")
	public IVMCUDWL method442() {
		IVMCUDWL var1 = field1257.field745;
		if (field1257 == var1) {
			return null;
		} else {
			var1.method282();
			return var1;
		}
	}

	@ObfuscatedName("QHOLWOGP.b()LIVMCUDWL;")
	public IVMCUDWL method443() {
		IVMCUDWL var1 = field1257.field745;
		if (field1257 == var1) {
			field1258 = null;
			return null;
		} else {
			field1258 = var1.field745;
			return var1;
		}
	}

	@ObfuscatedName("QHOLWOGP.a(B)LIVMCUDWL;")
	public IVMCUDWL method444() {
		IVMCUDWL var1 = field1258;
		if (field1257 == var1) {
			field1258 = null;
			return null;
		} else {
			field1258 = var1.field745;
			return var1;
		}
	}

	@ObfuscatedName("QHOLWOGP.c()I")
	public int method445() {
		int var1 = 0;
		for (IVMCUDWL var2 = field1257.field745; var2 != field1257; var2 = var2.field745) {
			var1++;
		}

		return var1;
	}
}
