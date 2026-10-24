package deob;

@ObfuscatedName("LKPVZAQN")
public final class LKPVZAQN {

	@ObfuscatedName("LKPVZAQN.e")
	public int field979;

	@ObfuscatedName("LKPVZAQN.j")
	public boolean field984;

	@ObfuscatedName("LKPVZAQN.d")
	public byte[] field978;

	@ObfuscatedName("LKPVZAQN.f")
	public int[] field980;

	@ObfuscatedName("LKPVZAQN.g")
	public int[] field981;

	@ObfuscatedName("LKPVZAQN.h")
	public int[] field982;

	@ObfuscatedName("LKPVZAQN.i")
	public int[] field983;

	public LKPVZAQN(byte[] arg0) {
		method322(arg0);
	}

	@ObfuscatedName("LKPVZAQN.a(Z[B)V")
	public void method322(byte[] arg0) {
		WBEWPIXO var2 = new WBEWPIXO(arg0);
		int var3 = var2.method519();
		int var4 = var2.method519();
		if (var3 == var4) {
			field978 = arg0;
			field984 = false;
		} else {
			byte[] var5 = new byte[var3];
			XHIFBSUC.method570(var5, var3, arg0, var4, 6);
			field978 = var5;
			var2 = new WBEWPIXO(field978);
			field984 = true;
		}

		field979 = var2.method517();
		field980 = new int[field979];
		field981 = new int[field979];
		field982 = new int[field979];
		field983 = new int[field979];
		int var6 = field979 * 10 + var2.field1401;
		for (int var7 = 0; var7 < field979; var7++) {
			field980[var7] = var2.method520();
			field981[var7] = var2.method519();
			field982[var7] = var2.method519();
			field983[var7] = var6;
			var6 += field982[var7];
		}
	}

	@ObfuscatedName("LKPVZAQN.a(Ljava/lang/String;[B)[B")
	public byte[] method323(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field979; var5++) {
			if (field980[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field981[var5]];
				}

				if (field984) {
					for (int var6 = 0; var6 < field981[var5]; var6++) {
						arg1[var6] = field978[field983[var5] + var6];
					}
				} else {
					XHIFBSUC.method570(arg1, field981[var5], field978, field982[var5], field983[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
