package deob;

@ObfuscatedName("XOJZVVDK")
public final class XOJZVVDK {

	@ObfuscatedName("XOJZVVDK.b")
	public int field1370;

	@ObfuscatedName("XOJZVVDK.g")
	public boolean field1375;

	@ObfuscatedName("XOJZVVDK.a")
	public byte[] field1369;

	@ObfuscatedName("XOJZVVDK.c")
	public int[] field1371;

	@ObfuscatedName("XOJZVVDK.d")
	public int[] field1372;

	@ObfuscatedName("XOJZVVDK.e")
	public int[] field1373;

	@ObfuscatedName("XOJZVVDK.f")
	public int[] field1374;

	public XOJZVVDK(byte[] arg0) {
		method559(arg0);
	}

	@ObfuscatedName("XOJZVVDK.a([BZ)V")
	public void method559(byte[] arg0) {
		PQBRPYKE var2 = new PQBRPYKE(arg0);
		int var3 = var2.method344();
		int var4 = var2.method344();
		if (var3 == var4) {
			field1369 = arg0;
			field1375 = false;
		} else {
			byte[] var5 = new byte[var3];
			GGLVRNPM.method248(var5, var3, arg0, var4, 6);
			field1369 = var5;
			var2 = new PQBRPYKE(field1369);
			field1375 = true;
		}

		field1370 = var2.method342();
		field1371 = new int[field1370];
		field1372 = new int[field1370];
		field1373 = new int[field1370];
		field1374 = new int[field1370];
		int var6 = field1370 * 10 + var2.field1091;
		for (int var7 = 0; var7 < field1370; var7++) {
			field1371[var7] = var2.method345();
			field1372[var7] = var2.method344();
			field1373[var7] = var2.method344();
			field1374[var7] = var6;
			var6 += field1373[var7];
		}
	}

	@ObfuscatedName("XOJZVVDK.a(Ljava/lang/String;[B)[B")
	public byte[] method560(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1370; var5++) {
			if (field1371[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1372[var5]];
				}

				if (field1375) {
					for (int var6 = 0; var6 < field1372[var5]; var6++) {
						arg1[var6] = field1369[field1374[var5] + var6];
					}
				} else {
					GGLVRNPM.method248(arg1, field1372[var5], field1369, field1373[var5], field1374[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
