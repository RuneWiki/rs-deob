package deob;

@ObfuscatedName("WBMSJJDO")
public class WBMSJJDO {

	@ObfuscatedName("WBMSJJDO.h")
	public FFMSWDBM[] field1335 = new FFMSWDBM[10];

	@ObfuscatedName("WBMSJJDO.d")
	public static WBMSJJDO[] field1331 = new WBMSJJDO[5000];

	@ObfuscatedName("WBMSJJDO.e")
	public static int[] field1332 = new int[5000];

	@ObfuscatedName("WBMSJJDO.i")
	public int field1336;

	@ObfuscatedName("WBMSJJDO.j")
	public int field1337;

	@ObfuscatedName("WBMSJJDO.g")
	public static TQYMAXSO field1334;

	@ObfuscatedName("WBMSJJDO.f")
	public static byte[] field1333;

	@ObfuscatedName("WBMSJJDO.a(BLTQYMAXSO;)V")
	public static final void method544(TQYMAXSO arg0) {
		field1333 = new byte[441000];
		field1334 = new TQYMAXSO(field1333);
		FFMSWDBM.method195();

		while (true) {
			int var1 = arg0.method470();
			if (var1 == 0xFFFF) {
				return;
			}

			field1331[var1] = new WBMSJJDO();
			field1331[var1].method546(arg0);
			field1332[var1] = field1331[var1].method547();
		}
	}

	@ObfuscatedName("WBMSJJDO.a(BII)LTQYMAXSO;")
	public static final TQYMAXSO method545(int arg0, int arg1) {
		if (field1331[arg1] != null) {
			WBMSJJDO var2 = field1331[arg1];
			return var2.method548(arg0);
		}

		return null;
	}

	@ObfuscatedName("WBMSJJDO.a(ILTQYMAXSO;)V")
	public final void method546(TQYMAXSO arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method468();
			if (var3 != 0) {
				arg0.field1263--;
				field1335[var2] = new FFMSWDBM();
				field1335[var2].method198(arg0);
			}
		}

		field1336 = arg0.method470();
		field1337 = arg0.method470();
	}

	@ObfuscatedName("WBMSJJDO.a(I)I")
	public final int method547() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1335[var2] != null && field1335[var2].field614 / 20 < var1) {
				var1 = field1335[var2].field614 / 20;
			}
		}

		if (field1336 < field1337 && field1336 / 20 < var1) {
			var1 = field1336 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1335[var3] != null) {
					field1335[var3].field614 -= var1 * 20;
				}
			}

			if (field1336 < field1337) {
				field1336 -= var1 * 20;
				field1337 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("WBMSJJDO.a(II)LTQYMAXSO;")
	public final TQYMAXSO method548(int arg0) {
		int var2 = method549(arg0);
		field1334.field1263 = 0;
		field1334.method462(0x52494646);
		field1334.method463(var2 + 36);
		field1334.method462(0x57415645);
		field1334.method462(0x666D7420);
		field1334.method463(16);
		field1334.method460(1);
		field1334.method460(1);
		field1334.method463(22050);
		field1334.method463(22050);
		field1334.method460(1);
		field1334.method460(8);
		field1334.method462(0x64617461);
		field1334.method463(var2);
		field1334.field1263 += var2;
		return field1334;
	}

	@ObfuscatedName("WBMSJJDO.b(I)I")
	public final int method549(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1335[var3] != null && field1335[var3].field614 + field1335[var3].field613 > var2) {
				var2 = field1335[var3].field614 + field1335[var3].field613;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1336 * 22050 / 1000;
		int var6 = field1337 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1333[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1335[var9] != null) {
				int var10 = field1335[var9].field613 * 22050 / 1000;
				int var11 = field1335[var9].field614 * 22050 / 1000;
				int[] var12 = field1335[var9].method196(var10, field1335[var9].field613);
				for (int var13 = 0; var13 < var10; var13++) {
					field1333[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1333[var14 + var15] = field1333[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1333[var17 + var18] = field1333[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
