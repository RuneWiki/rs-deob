package deob;

@ObfuscatedName("ECQQOXBD")
public final class ECQQOXBD {

	@ObfuscatedName("ECQQOXBD.b")
	public int field549;

	@ObfuscatedName("ECQQOXBD.c")
	public TLIWLEHU[] field550;

	public ECQQOXBD(int arg0) {
		field549 = arg0;
		field550 = new TLIWLEHU[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			TLIWLEHU var3 = field550[var2] = new TLIWLEHU();
			var3.field1294 = var3;
			var3.field1295 = var3;
		}
	}

	@ObfuscatedName("ECQQOXBD.a(J)LTLIWLEHU;")
	public TLIWLEHU method209(long arg0) {
		TLIWLEHU var3 = field550[(int) (arg0 & field549 - 1)];
		for (TLIWLEHU var4 = var3.field1294; var4 != var3; var4 = var4.field1294) {
			if (var4.field1293 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("ECQQOXBD.a(JLTLIWLEHU;Z)V")
	public void method210(long arg0, TLIWLEHU arg1) {
		if (arg1.field1295 != null) {
			arg1.method471();
		}

		TLIWLEHU var4 = field550[(int) (arg0 & field549 - 1)];
		arg1.field1295 = var4.field1295;
		arg1.field1294 = var4;
		arg1.field1295.field1294 = arg1;
		arg1.field1294.field1295 = arg1;
		arg1.field1293 = arg0;
	}
}
