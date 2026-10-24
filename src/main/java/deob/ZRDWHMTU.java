package deob;

@ObfuscatedName("ZRDWHMTU")
public final class ZRDWHMTU {

	@ObfuscatedName("ZRDWHMTU.a")
	public int field1481;

	@ObfuscatedName("ZRDWHMTU.b")
	public MXUYAYVV[] field1482;

	public ZRDWHMTU(int arg0) {
		field1481 = arg0;
		field1482 = new MXUYAYVV[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			MXUYAYVV var3 = field1482[var2] = new MXUYAYVV();
			var3.field1077 = var3;
			var3.field1078 = var3;
		}
	}

	@ObfuscatedName("ZRDWHMTU.a(J)LMXUYAYVV;")
	public MXUYAYVV method561(long arg0) {
		MXUYAYVV var3 = field1482[(int) (arg0 & field1481 - 1)];
		for (MXUYAYVV var4 = var3.field1077; var4 != var3; var4 = var4.field1077) {
			if (var4.field1076 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ZRDWHMTU.a(JLMXUYAYVV;I)V")
	public void method562(long arg0, MXUYAYVV arg1) {
		if (arg1.field1078 != null) {
			arg1.method430();
		}

		MXUYAYVV var4 = field1482[(int) (arg0 & field1481 - 1)];
		arg1.field1078 = var4.field1078;
		arg1.field1077 = var4;
		arg1.field1078.field1077 = arg1;
		arg1.field1077.field1078 = arg1;
		arg1.field1076 = arg0;
	}
}
