package deob;

@ObfuscatedName("BBMKAXRK")
public final class BBMKAXRK {

	@ObfuscatedName("BBMKAXRK.c")
	public int field124;

	@ObfuscatedName("BBMKAXRK.h")
	public boolean field129;

	@ObfuscatedName("BBMKAXRK.b")
	public byte[] field123;

	@ObfuscatedName("BBMKAXRK.d")
	public int[] field125;

	@ObfuscatedName("BBMKAXRK.e")
	public int[] field126;

	@ObfuscatedName("BBMKAXRK.f")
	public int[] field127;

	@ObfuscatedName("BBMKAXRK.g")
	public int[] field128;

	public BBMKAXRK(byte[] arg0) {
		method29(arg0);
	}

	@ObfuscatedName("BBMKAXRK.a(B[B)V")
	public void method29(byte[] arg0) {
		EILHLJCE var2 = new EILHLJCE(arg0);
		int var3 = var2.method228();
		int var4 = var2.method228();
		if (var3 == var4) {
			field123 = arg0;
			field129 = false;
		} else {
			byte[] var5 = new byte[var3];
			CGPATBOH.method36(var5, var3, arg0, var4, 6);
			field123 = var5;
			var2 = new EILHLJCE(field123);
			field129 = true;
		}

		field124 = var2.method226();
		field125 = new int[field124];
		field126 = new int[field124];
		field127 = new int[field124];
		field128 = new int[field124];
		int var6 = field124 * 10 + var2.field684;
		for (int var7 = 0; var7 < field124; var7++) {
			field125[var7] = var2.method229();
			field126[var7] = var2.method228();
			field127[var7] = var2.method228();
			field128[var7] = var6;
			var6 += field127[var7];
		}
	}

	@ObfuscatedName("BBMKAXRK.a(Ljava/lang/String;[B)[B")
	public byte[] method30(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field124; var5++) {
			if (field125[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field126[var5]];
				}

				if (field129) {
					for (int var6 = 0; var6 < field126[var5]; var6++) {
						arg1[var6] = field123[field128[var5] + var6];
					}
				} else {
					CGPATBOH.method36(arg1, field126[var5], field123, field127[var5], field128[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
