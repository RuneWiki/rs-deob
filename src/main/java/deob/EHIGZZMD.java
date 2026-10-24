package deob;

@ObfuscatedName("EHIGZZMD")
public final class EHIGZZMD {

	@ObfuscatedName("EHIGZZMD.c")
	public int field550;

	@ObfuscatedName("EHIGZZMD.d")
	public BLBQHZXT[] field551;

	public EHIGZZMD(int arg0) {
		field550 = arg0;
		field551 = new BLBQHZXT[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			BLBQHZXT var3 = field551[var2] = new BLBQHZXT();
			var3.field44 = var3;
			var3.field45 = var3;
		}
	}

	@ObfuscatedName("EHIGZZMD.a(J)LBLBQHZXT;")
	public BLBQHZXT method185(long arg0) {
		BLBQHZXT var3 = field551[(int) (arg0 & field550 - 1)];
		for (BLBQHZXT var4 = var3.field44; var4 != var3; var4 = var4.field44) {
			if (var4.field43 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("EHIGZZMD.a(JLBLBQHZXT;I)V")
	public void method186(long arg0, BLBQHZXT arg1) {
		if (arg1.field45 != null) {
			arg1.method14();
		}

		BLBQHZXT var4 = field551[(int) (arg0 & field550 - 1)];
		arg1.field45 = var4.field45;
		arg1.field44 = var4;
		arg1.field45.field44 = arg1;
		arg1.field44.field45 = arg1;
		arg1.field43 = arg0;
	}
}
