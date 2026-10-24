package deob;

@ObfuscatedName("BEGVKNAP")
public final class BEGVKNAP {

	@ObfuscatedName("BEGVKNAP.c")
	public int field56;

	@ObfuscatedName("BEGVKNAP.d")
	public DOUWNVSH[] field57;

	public BEGVKNAP(int arg0) {
		field56 = arg0;
		field57 = new DOUWNVSH[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			DOUWNVSH var3 = field57[var2] = new DOUWNVSH();
			var3.field633 = var3;
			var3.field634 = var3;
		}
	}

	@ObfuscatedName("BEGVKNAP.a(J)LDOUWNVSH;")
	public DOUWNVSH method36(long arg0) {
		DOUWNVSH var3 = field57[(int) (arg0 & field56 - 1)];
		for (DOUWNVSH var4 = var3.field633; var4 != var3; var4 = var4.field633) {
			if (var4.field632 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("BEGVKNAP.a(BJLDOUWNVSH;)V")
	public void method37(long arg0, DOUWNVSH arg1) {
		if (arg1.field634 != null) {
			arg1.method205();
		}

		DOUWNVSH var4 = field57[(int) (arg0 & field56 - 1)];
		arg1.field634 = var4.field634;
		arg1.field633 = var4;
		arg1.field634.field633 = arg1;
		arg1.field633.field634 = arg1;
		arg1.field632 = arg0;
	}
}
