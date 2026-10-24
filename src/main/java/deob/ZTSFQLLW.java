package deob;

@ObfuscatedName("ZTSFQLLW")
public class ZTSFQLLW {

	@ObfuscatedName("ZTSFQLLW.h")
	public ACLAPANL[] field1480 = new ACLAPANL[10];

	@ObfuscatedName("ZTSFQLLW.d")
	public static ZTSFQLLW[] field1476 = new ZTSFQLLW[5000];

	@ObfuscatedName("ZTSFQLLW.e")
	public static int[] field1477 = new int[5000];

	@ObfuscatedName("ZTSFQLLW.i")
	public int field1481;

	@ObfuscatedName("ZTSFQLLW.j")
	public int field1482;

	@ObfuscatedName("ZTSFQLLW.g")
	public static XOUQUKZW field1479;

	@ObfuscatedName("ZTSFQLLW.f")
	public static byte[] field1478;

	@ObfuscatedName("ZTSFQLLW.a(ILXOUQUKZW;)V")
	public static final void method586(XOUQUKZW arg0) {
		field1478 = new byte[441000];
		field1479 = new XOUQUKZW(field1478);
		ACLAPANL.method7();

		while (true) {
			int var1 = arg0.method523();
			if (var1 == 0xFFFF) {
				return;
			}

			field1476[var1] = new ZTSFQLLW();
			field1476[var1].method588(arg0);
			field1477[var1] = field1476[var1].method589();
		}
	}

	@ObfuscatedName("ZTSFQLLW.a(IBI)LXOUQUKZW;")
	public static final XOUQUKZW method587(int arg0, int arg1) {
		if (field1476[arg1] != null) {
			ZTSFQLLW var2 = field1476[arg1];
			return var2.method590(arg0);
		}

		return null;
	}

	@ObfuscatedName("ZTSFQLLW.a(BLXOUQUKZW;)V")
	public final void method588(XOUQUKZW arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method521();
			if (var3 != 0) {
				arg0.field1367--;
				field1480[var2] = new ACLAPANL();
				field1480[var2].method10(arg0);
			}
		}

		field1481 = arg0.method523();
		field1482 = arg0.method523();
	}

	@ObfuscatedName("ZTSFQLLW.a(B)I")
	public final int method589() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1480[var2] != null && field1480[var2].field27 / 20 < var1) {
				var1 = field1480[var2].field27 / 20;
			}
		}

		if (field1481 < field1482 && field1481 / 20 < var1) {
			var1 = field1481 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1480[var3] != null) {
					field1480[var3].field27 -= var1 * 20;
				}
			}

			if (field1481 < field1482) {
				field1481 -= var1 * 20;
				field1482 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("ZTSFQLLW.a(II)LXOUQUKZW;")
	public final XOUQUKZW method590(int arg0) {
		int var2 = method591(arg0);
		field1479.field1367 = 0;
		field1479.method515(0x52494646);
		field1479.method516(var2 + 36);
		field1479.method515(0x57415645);
		field1479.method515(0x666D7420);
		field1479.method516(16);
		field1479.method513(1);
		field1479.method513(1);
		field1479.method516(22050);
		field1479.method516(22050);
		field1479.method513(1);
		field1479.method513(8);
		field1479.method515(0x64617461);
		field1479.method516(var2);
		field1479.field1367 += var2;
		return field1479;
	}

	@ObfuscatedName("ZTSFQLLW.a(I)I")
	public final int method591(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1480[var3] != null && field1480[var3].field27 + field1480[var3].field26 > var2) {
				var2 = field1480[var3].field27 + field1480[var3].field26;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1481 * 22050 / 1000;
		int var6 = field1482 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1478[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1480[var9] != null) {
				int var10 = field1480[var9].field26 * 22050 / 1000;
				int var11 = field1480[var9].field27 * 22050 / 1000;
				int[] var12 = field1480[var9].method8(var10, field1480[var9].field26);
				for (int var13 = 0; var13 < var10; var13++) {
					field1478[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				field1478[var14 + var15] = field1478[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1478[var17 + var18] = field1478[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
