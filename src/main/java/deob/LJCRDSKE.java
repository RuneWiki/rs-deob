package deob;

@ObfuscatedName("LJCRDSKE")
public final class LJCRDSKE {

	@ObfuscatedName("LJCRDSKE.d")
	public int field887;

	@ObfuscatedName("LJCRDSKE.e")
	public XNCSKJMM[] field888;

	public LJCRDSKE(int arg0) {
		field887 = arg0;
		field888 = new XNCSKJMM[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			XNCSKJMM var3 = field888[var2] = new XNCSKJMM();
			var3.field1430 = var3;
			var3.field1431 = var3;
		}
	}

	@ObfuscatedName("LJCRDSKE.a(J)LXNCSKJMM;")
	public XNCSKJMM method366(long arg0) {
		XNCSKJMM var3 = field888[(int) (arg0 & field887 - 1)];
		for (XNCSKJMM var4 = var3.field1430; var4 != var3; var4 = var4.field1430) {
			if (var4.field1429 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("LJCRDSKE.a(BLXNCSKJMM;J)V")
	public void method367(XNCSKJMM arg0, long arg1) {
		if (arg0.field1431 != null) {
			arg0.method582();
		}

		XNCSKJMM var4 = field888[(int) (arg1 & field887 - 1)];
		arg0.field1431 = var4.field1431;
		arg0.field1430 = var4;
		arg0.field1431.field1430 = arg0;
		arg0.field1430.field1431 = arg0;
		arg0.field1429 = arg1;
	}
}
