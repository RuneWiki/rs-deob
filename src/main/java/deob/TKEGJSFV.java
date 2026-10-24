package deob;

@ObfuscatedName("TKEGJSFV")
public final class TKEGJSFV {

	@ObfuscatedName("TKEGJSFV.d")
	public int field1295;

	@ObfuscatedName("TKEGJSFV.i")
	public boolean field1300;

	@ObfuscatedName("TKEGJSFV.c")
	public byte[] field1294;

	@ObfuscatedName("TKEGJSFV.e")
	public int[] field1296;

	@ObfuscatedName("TKEGJSFV.f")
	public int[] field1297;

	@ObfuscatedName("TKEGJSFV.g")
	public int[] field1298;

	@ObfuscatedName("TKEGJSFV.h")
	public int[] field1299;

	public TKEGJSFV(byte[] arg0) {
		method541(arg0);
	}

	@ObfuscatedName("TKEGJSFV.a([BZ)V")
	public void method541(byte[] arg0) {
		EGCCHUZS var2 = new EGCCHUZS(arg0);
		int var3 = var2.method265();
		int var4 = var2.method265();
		if (var3 == var4) {
			field1294 = arg0;
			field1300 = false;
		} else {
			byte[] var5 = new byte[var3];
			KFPFAVGB.method400(var5, var3, arg0, var4, 6);
			field1294 = var5;
			var2 = new EGCCHUZS(field1294);
			field1300 = true;
		}

		field1295 = var2.method263();
		field1296 = new int[field1295];
		field1297 = new int[field1295];
		field1298 = new int[field1295];
		field1299 = new int[field1295];
		int var6 = field1295 * 10 + var2.field589;
		for (int var7 = 0; var7 < field1295; var7++) {
			field1296[var7] = var2.method266();
			field1297[var7] = var2.method265();
			field1298[var7] = var2.method265();
			field1299[var7] = var6;
			var6 += field1298[var7];
		}
	}

	@ObfuscatedName("TKEGJSFV.a(Ljava/lang/String;[B)[B")
	public byte[] method542(String arg0, byte[] arg1) {
		int var3 = 0;
		arg0 = arg0.toUpperCase();
		for (int var4 = 0; var4 < arg0.length(); var4++) {
			var3 = var3 * 61 + arg0.charAt(var4) - 32;
		}

		for (int var5 = 0; var5 < field1295; var5++) {
			if (field1296[var5] == var3) {
				if (arg1 == null) {
					arg1 = new byte[field1297[var5]];
				}

				if (field1300) {
					for (int var6 = 0; var6 < field1297[var5]; var6++) {
						arg1[var6] = field1294[field1299[var5] + var6];
					}
				} else {
					KFPFAVGB.method400(arg1, field1297[var5], field1294, field1298[var5], field1299[var5]);
				}

				return arg1;
			}
		}

		return null;
	}
}
