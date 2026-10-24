package deob;

@ObfuscatedName("VSUYIIVA")
public final class VSUYIIVA {

	@ObfuscatedName("VSUYIIVA.e")
	public int field1360;

	@ObfuscatedName("VSUYIIVA.j")
	public boolean field1365;

	@ObfuscatedName("VSUYIIVA.d")
	public byte[] field1359;

	@ObfuscatedName("VSUYIIVA.f")
	public int[] field1361;

	@ObfuscatedName("VSUYIIVA.g")
	public int[] field1362;

	@ObfuscatedName("VSUYIIVA.h")
	public int[] field1363;

	@ObfuscatedName("VSUYIIVA.i")
	public int[] field1364;

	public VSUYIIVA(byte[] arg0) {
		method569(arg0);
	}

	@ObfuscatedName("VSUYIIVA.a([BI)V")
	public void method569(byte[] arg0) {
		CFARFRSG var2 = new CFARFRSG(arg0);
		int var3 = var2.method34();
		int var4 = var2.method34();
		if (var3 == var4) {
			field1359 = arg0;
			field1365 = false;
		} else {
			byte[] var5 = new byte[var3];
			IGMYNIAR.method312(var5, var3, arg0, var4, 6);
			field1359 = var5;
			var2 = new CFARFRSG(field1359);
			field1365 = true;
		}

		field1360 = var2.method32();
		field1361 = new int[field1360];
		field1362 = new int[field1360];
		field1363 = new int[field1360];
		field1364 = new int[field1360];
		int var6 = field1360 * 10 + var2.field44;
		for (int var7 = 0; var7 < field1360; var7++) {
			field1361[var7] = var2.method35();
			field1362[var7] = var2.method34();
			field1363[var7] = var2.method34();
			field1364[var7] = var6;
			var6 += field1363[var7];
		}
	}

	@ObfuscatedName("VSUYIIVA.a(Ljava/lang/String;[B)[B")
	public byte[] method570(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1360; var5++) {
			if (field1361[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1362[var5]];
				}

				if (field1365) {
					for (int var6 = 0; var6 < field1362[var5]; var6++) {
						arg1[var6] = field1359[field1364[var5] + var6];
					}
				} else {
					IGMYNIAR.method312(arg1, field1362[var5], field1359, field1363[var5], field1364[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
