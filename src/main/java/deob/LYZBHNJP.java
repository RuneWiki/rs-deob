package deob;

@ObfuscatedName("LYZBHNJP")
public final class LYZBHNJP {

	@ObfuscatedName("LYZBHNJP.f")
	public int field897;

	@ObfuscatedName("LYZBHNJP.k")
	public boolean field902;

	@ObfuscatedName("LYZBHNJP.e")
	public byte[] field896;

	@ObfuscatedName("LYZBHNJP.g")
	public int[] field898;

	@ObfuscatedName("LYZBHNJP.h")
	public int[] field899;

	@ObfuscatedName("LYZBHNJP.i")
	public int[] field900;

	@ObfuscatedName("LYZBHNJP.j")
	public int[] field901;

	public LYZBHNJP(byte[] arg0) {
		method289(arg0);
	}

	@ObfuscatedName("LYZBHNJP.a([BI)V")
	public void method289(byte[] arg0) {
		ZOMNSJJM var2 = new ZOMNSJJM(arg0);
		int var3 = var2.method551();
		int var4 = var2.method551();
		if (var3 == var4) {
			field896 = arg0;
			field902 = false;
		} else {
			byte[] var5 = new byte[var3];
			TDANEECQ.method430(var5, var3, arg0, var4, 6);
			field896 = var5;
			var2 = new ZOMNSJJM(field896);
			field902 = true;
		}

		field897 = var2.method549();
		field898 = new int[field897];
		field899 = new int[field897];
		field900 = new int[field897];
		field901 = new int[field897];
		int var6 = field897 * 10 + var2.field1457;
		for (int var7 = 0; var7 < field897; var7++) {
			field898[var7] = var2.method552();
			field899[var7] = var2.method551();
			field900[var7] = var2.method551();
			field901[var7] = var6;
			var6 += field900[var7];
		}
	}

	@ObfuscatedName("LYZBHNJP.a(Ljava/lang/String;[B)[B")
	public byte[] method290(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field897; var5++) {
			if (field898[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field899[var5]];
				}

				if (field902) {
					for (int var6 = 0; var6 < field899[var5]; var6++) {
						arg1[var6] = field896[field901[var5] + var6];
					}
				} else {
					TDANEECQ.method430(arg1, field899[var5], field896, field900[var5], field901[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
