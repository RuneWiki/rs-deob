package deob;

@ObfuscatedName("FIGUVTWB")
public final class FIGUVTWB {

	@ObfuscatedName("FIGUVTWB.f")
	public int field584;

	@ObfuscatedName("FIGUVTWB.k")
	public boolean field589;

	@ObfuscatedName("FIGUVTWB.e")
	public byte[] field583;

	@ObfuscatedName("FIGUVTWB.g")
	public int[] field585;

	@ObfuscatedName("FIGUVTWB.h")
	public int[] field586;

	@ObfuscatedName("FIGUVTWB.i")
	public int[] field587;

	@ObfuscatedName("FIGUVTWB.j")
	public int[] field588;

	public FIGUVTWB(byte[] arg0) {
		method208(arg0);
	}

	@ObfuscatedName("FIGUVTWB.a(B[B)V")
	public void method208(byte[] arg0) {
		MUKVLYLC var2 = new MUKVLYLC(arg0);
		int var3 = var2.method296();
		int var4 = var2.method296();
		if (var3 == var4) {
			field583 = arg0;
			field589 = false;
		} else {
			byte[] var5 = new byte[var3];
			WEYNEKNM.method560(var5, var3, arg0, var4, 6);
			field583 = var5;
			var2 = new MUKVLYLC(field583);
			field589 = true;
		}

		field584 = var2.method294();
		field585 = new int[field584];
		field586 = new int[field584];
		field587 = new int[field584];
		field588 = new int[field584];
		int var6 = field584 * 10 + var2.field812;
		for (int var7 = 0; var7 < field584; var7++) {
			field585[var7] = var2.method297();
			field586[var7] = var2.method296();
			field587[var7] = var2.method296();
			field588[var7] = var6;
			var6 += field587[var7];
		}
	}

	@ObfuscatedName("FIGUVTWB.a(Ljava/lang/String;[B)[B")
	public byte[] method209(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field584; var5++) {
			if (field585[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field586[var5]];
				}

				if (field589) {
					for (int var6 = 0; var6 < field586[var5]; var6++) {
						arg1[var6] = field583[field588[var5] + var6];
					}
				} else {
					WEYNEKNM.method560(arg1, field586[var5], field583, field587[var5], field588[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
