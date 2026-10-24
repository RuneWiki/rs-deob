package deob;

@ObfuscatedName("JJYRPNAX")
public final class JJYRPNAX {

	@ObfuscatedName("JJYRPNAX.d")
	public int field788;

	@ObfuscatedName("JJYRPNAX.e")
	public LTTSKENL[] field789;

	public JJYRPNAX(int arg0) {
		field788 = arg0;
		field789 = new LTTSKENL[arg0];
		for (int var2 = 0; var2 < arg0; var2++) {
			LTTSKENL var3 = field789[var2] = new LTTSKENL();
			var3.field829 = var3;
			var3.field830 = var3;
		}
	}

	@ObfuscatedName("JJYRPNAX.a(J)LLTTSKENL;")
	public LTTSKENL method315(long arg0) {
		LTTSKENL var3 = field789[(int) (arg0 & field788 - 1)];
		for (LTTSKENL var4 = var3.field829; var4 != var3; var4 = var4.field829) {
			if (var4.field828 == arg0) {
				return var4;
			}
		}

		return null;
	}

	@ObfuscatedName("JJYRPNAX.a(LLTTSKENL;ZJ)V")
	public void method316(LTTSKENL arg0, long arg1) {
		if (arg0.field830 != null) {
			arg0.method327();
		}

		LTTSKENL var4 = field789[(int) (arg1 & field788 - 1)];
		arg0.field830 = var4.field830;
		arg0.field829 = var4;
		arg0.field830.field829 = arg0;
		arg0.field829.field830 = arg0;
		arg0.field828 = arg1;
	}
}
