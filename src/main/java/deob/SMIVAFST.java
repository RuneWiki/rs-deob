package deob;

@ObfuscatedName("SMIVAFST")
public final class SMIVAFST {

	@ObfuscatedName("SMIVAFST.f")
	public int field1277;

	@ObfuscatedName("SMIVAFST.k")
	public boolean field1282;

	@ObfuscatedName("SMIVAFST.e")
	public byte[] field1276;

	@ObfuscatedName("SMIVAFST.g")
	public int[] field1278;

	@ObfuscatedName("SMIVAFST.h")
	public int[] field1279;

	@ObfuscatedName("SMIVAFST.i")
	public int[] field1280;

	@ObfuscatedName("SMIVAFST.j")
	public int[] field1281;

	public SMIVAFST(byte[] arg0) {
		method511(arg0);
	}

	@ObfuscatedName("SMIVAFST.a(Z[B)V")
	public void method511(byte[] arg0) {
		BSNPYLEV var2 = new BSNPYLEV(arg0);
		int var3 = var2.method51();
		int var4 = var2.method51();
		if (var3 == var4) {
			field1276 = arg0;
			field1282 = false;
		} else {
			byte[] var5 = new byte[var3];
			LIIJYOUX.method355(var5, var3, arg0, var4, 6);
			field1276 = var5;
			var2 = new BSNPYLEV(field1276);
			field1282 = true;
		}

		field1277 = var2.method49();
		field1278 = new int[field1277];
		field1279 = new int[field1277];
		field1280 = new int[field1277];
		field1281 = new int[field1277];
		int var6 = field1277 * 10 + var2.field55;
		for (int var7 = 0; var7 < field1277; var7++) {
			field1278[var7] = var2.method52();
			field1279[var7] = var2.method51();
			field1280[var7] = var2.method51();
			field1281[var7] = var6;
			var6 += field1280[var7];
		}
	}

	@ObfuscatedName("SMIVAFST.a(Ljava/lang/String;[B)[B")
	public byte[] method512(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1277; var5++) {
			if (field1278[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1279[var5]];
				}

				if (field1282) {
					for (int var6 = 0; var6 < field1279[var5]; var6++) {
						arg1[var6] = field1276[field1281[var5] + var6];
					}
				} else {
					LIIJYOUX.method355(arg1, field1279[var5], field1276, field1280[var5], field1281[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
