package deob;

@ObfuscatedName("RPFMUSNN")
public final class RPFMUSNN {

	@ObfuscatedName("RPFMUSNN.c")
	public int field1204;

	@ObfuscatedName("RPFMUSNN.h")
	public boolean field1209;

	@ObfuscatedName("RPFMUSNN.b")
	public byte[] field1203;

	@ObfuscatedName("RPFMUSNN.d")
	public int[] field1205;

	@ObfuscatedName("RPFMUSNN.e")
	public int[] field1206;

	@ObfuscatedName("RPFMUSNN.f")
	public int[] field1207;

	@ObfuscatedName("RPFMUSNN.g")
	public int[] field1208;

	public RPFMUSNN(byte[] arg0) {
		method413(arg0);
	}

	@ObfuscatedName("RPFMUSNN.a([BI)V")
	public void method413(byte[] arg0) {
		WNCFPLWV var2 = new WNCFPLWV(arg0);
		int var3 = var2.method506();
		int var4 = var2.method506();
		if (var3 == var4) {
			field1203 = arg0;
			field1209 = false;
		} else {
			byte[] var5 = new byte[var3];
			ZFQJRIIP.method584(var5, var3, arg0, var4, 6);
			field1203 = var5;
			var2 = new WNCFPLWV(field1203);
			field1209 = true;
		}

		field1204 = var2.method504();
		field1205 = new int[field1204];
		field1206 = new int[field1204];
		field1207 = new int[field1204];
		field1208 = new int[field1204];
		int var6 = field1204 * 10 + var2.field1375;
		for (int var7 = 0; var7 < field1204; var7++) {
			field1205[var7] = var2.method507();
			field1206[var7] = var2.method506();
			field1207[var7] = var2.method506();
			field1208[var7] = var6;
			var6 += field1207[var7];
		}
	}

	@ObfuscatedName("RPFMUSNN.a(Ljava/lang/String;[B)[B")
	public byte[] method414(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1204; var5++) {
			if (field1205[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1206[var5]];
				}

				if (field1209) {
					for (int var6 = 0; var6 < field1206[var5]; var6++) {
						arg1[var6] = field1203[field1208[var5] + var6];
					}
				} else {
					ZFQJRIIP.method584(arg1, field1206[var5], field1203, field1207[var5], field1208[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
