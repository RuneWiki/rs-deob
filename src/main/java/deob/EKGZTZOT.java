package deob;

@ObfuscatedName("EKGZTZOT")
public final class EKGZTZOT {

	@ObfuscatedName("EKGZTZOT.c")
	public int field575;

	@ObfuscatedName("EKGZTZOT.d")
	public AJSSLSFA[] field576;

	public EKGZTZOT(int arg0) {
		field575 = arg0;
		field576 = new AJSSLSFA[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			AJSSLSFA var3 = field576[var2] = new AJSSLSFA();
			var3.field11 = var3;
			var3.field12 = var3;
		}
	}

	@ObfuscatedName("EKGZTZOT.a(J)LAJSSLSFA;")
	public AJSSLSFA method227(long arg0) {
		AJSSLSFA var3 = field576[(int) (arg0 & field575 - 1)];
		for (AJSSLSFA var4 = var3.field11; var4 != var3; var4 = var4.field11) {
			if (var4.field10 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("EKGZTZOT.a(LAJSSLSFA;JI)V")
	public void method228(AJSSLSFA arg0, long arg1) {
		if (arg0.field12 != null) {
			arg0.method1();
		}

		AJSSLSFA var4 = field576[(int) (arg1 & field575 - 1)];
		arg0.field12 = var4.field12;
		arg0.field11 = var4;
		arg0.field12.field11 = arg0;
		arg0.field11.field12 = arg0;
		arg0.field10 = arg1;
	}
}
