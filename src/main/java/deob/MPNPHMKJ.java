package deob;

@ObfuscatedName("MPNPHMKJ")
public final class MPNPHMKJ {

	@ObfuscatedName("MPNPHMKJ.c")
	public int field877;

	@ObfuscatedName("MPNPHMKJ.d")
	public NQPZRHXK[] field878;

	public MPNPHMKJ(int arg0) {
		field877 = arg0;
		field878 = new NQPZRHXK[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			NQPZRHXK var3 = field878[var2] = new NQPZRHXK();
			var3.field926 = var3;
			var3.field927 = var3;
		}
	}

	@ObfuscatedName("MPNPHMKJ.a(J)LNQPZRHXK;")
	public NQPZRHXK method264(long arg0) {
		NQPZRHXK var3 = field878[(int) (arg0 & field877 - 1)];
		for (NQPZRHXK var4 = var3.field926; var4 != var3; var4 = var4.field926) {
			if (var4.field925 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("MPNPHMKJ.a(JLNQPZRHXK;I)V")
	public void method265(long arg0, NQPZRHXK arg1) {
		if (arg1.field927 != null) {
			arg1.method326();
		}

		NQPZRHXK var4 = field878[(int) (arg0 & field877 - 1)];
		arg1.field927 = var4.field927;
		arg1.field926 = var4;
		arg1.field927.field926 = arg1;
		arg1.field926.field927 = arg1;
		arg1.field925 = arg0;
	}
}
