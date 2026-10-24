package deob;

@ObfuscatedName("WTXWLORU")
public class WTXWLORU {

	@ObfuscatedName("WTXWLORU.i")
	public TDNGNEZO[] field1469 = new TDNGNEZO[10];

	@ObfuscatedName("WTXWLORU.e")
	public static WTXWLORU[] field1465 = new WTXWLORU[5000];

	@ObfuscatedName("WTXWLORU.f")
	public static int[] field1466 = new int[5000];

	@ObfuscatedName("WTXWLORU.j")
	public int field1470;

	@ObfuscatedName("WTXWLORU.k")
	public int field1471;

	@ObfuscatedName("WTXWLORU.h")
	public static MVHXDWGI field1468;

	@ObfuscatedName("WTXWLORU.g")
	public static byte[] field1467;

	@ObfuscatedName("WTXWLORU.a(BLMVHXDWGI;)V")
	public static final void method580(MVHXDWGI arg0) {
		field1467 = new byte[441000];
		field1468 = new MVHXDWGI(field1467);
		TDNGNEZO.method543();

		while (true) {
			int var1 = arg0.method359();
			if (var1 == 0xFFFF) {
				return;
			}

			field1465[var1] = new WTXWLORU();
			field1465[var1].method582(arg0);
			field1466[var1] = field1465[var1].method583();
		}
	}

	@ObfuscatedName("WTXWLORU.a(ZII)LMVHXDWGI;")
	public static final MVHXDWGI method581(int arg0, int arg1) {
		if (field1465[arg1] != null) {
			WTXWLORU var2 = field1465[arg1];
			return var2.method584(arg0);
		}

		return null;
	}

	@ObfuscatedName("WTXWLORU.a(ILMVHXDWGI;)V")
	public final void method582(MVHXDWGI arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method357();
			if (var3 != 0) {
				arg0.field1014--;
				field1469[var2] = new TDNGNEZO();
				field1469[var2].method546(arg0);
			}
		}

		field1470 = arg0.method359();
		field1471 = arg0.method359();
	}

	@ObfuscatedName("WTXWLORU.a(I)I")
	public final int method583() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1469[var2] != null && field1469[var2].field1392 / 20 < var1) {
				var1 = field1469[var2].field1392 / 20;
			}
		}

		if (field1470 < field1471 && field1470 / 20 < var1) {
			var1 = field1470 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1469[var3] != null) {
					field1469[var3].field1392 -= var1 * 20;
				}
			}

			if (field1470 < field1471) {
				field1470 -= var1 * 20;
				field1471 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("WTXWLORU.a(IZ)LMVHXDWGI;")
	public final MVHXDWGI method584(int arg0) {
		int var2 = method585(arg0);
		field1468.field1014 = 0;
		field1468.method351(0x52494646);
		field1468.method352(var2 + 36);
		field1468.method351(0x57415645);
		field1468.method351(0x666D7420);
		field1468.method352(16);
		field1468.method349(1);
		field1468.method349(1);
		field1468.method352(22050);
		field1468.method352(22050);
		field1468.method349(1);
		field1468.method349(8);
		field1468.method351(0x64617461);
		field1468.method352(var2);
		field1468.field1014 += var2;
		return field1468;
	}

	@ObfuscatedName("WTXWLORU.b(I)I")
	public final int method585(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1469[var3] != null && field1469[var3].field1392 + field1469[var3].field1391 > var2) {
				var2 = field1469[var3].field1392 + field1469[var3].field1391;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1470 * 22050 / 1000;
		int var6 = field1471 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1467[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1469[var9] != null) {
				int var10 = field1469[var9].field1391 * 22050 / 1000;
				int var11 = field1469[var9].field1392 * 22050 / 1000;
				int[] var12 = field1469[var9].method544(var10, field1469[var9].field1391);
				for (int var13 = 0; var13 < var10; var13++) {
					field1467[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1467[var14 + var15] = field1467[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1467[var17 + var18] = field1467[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
