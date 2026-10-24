package deob;

@ObfuscatedName("XDCFWJPT")
public class XDCFWJPT {

	@ObfuscatedName("XDCFWJPT.h")
	public int field1321 = -1;

	@ObfuscatedName("XDCFWJPT.i")
	public boolean field1322 = false;

	@ObfuscatedName("XDCFWJPT.j")
	public boolean field1323 = true;

	@ObfuscatedName("XDCFWJPT.d")
	public static int field1317;

	@ObfuscatedName("XDCFWJPT.g")
	public int field1320;

	@ObfuscatedName("XDCFWJPT.k")
	public int field1324;

	@ObfuscatedName("XDCFWJPT.l")
	public int field1325;

	@ObfuscatedName("XDCFWJPT.m")
	public int field1326;

	@ObfuscatedName("XDCFWJPT.n")
	public int field1327;

	@ObfuscatedName("XDCFWJPT.o")
	public int field1328;

	@ObfuscatedName("XDCFWJPT.p")
	public int field1329;

	@ObfuscatedName("XDCFWJPT.f")
	public String field1319;

	@ObfuscatedName("XDCFWJPT.e")
	public static XDCFWJPT[] field1318;

	@ObfuscatedName("XDCFWJPT.a(LOTSGNSQM;Z)V")
	public static void method516(OTSGNSQM arg0) {
		YOXDZEVD var1 = new YOXDZEVD(arg0.method376("flo.dat", null));
		field1317 = var1.method551();
		if (field1318 == null) {
			field1318 = new XDCFWJPT[field1317];
		}

		for (int var2 = 0; var2 < field1317; var2++) {
			if (field1318[var2] == null) {
				field1318[var2] = new XDCFWJPT();
			}

			field1318[var2].method517(var1);
		}
	}

	@ObfuscatedName("XDCFWJPT.a(BLYOXDZEVD;)V")
	public void method517(YOXDZEVD arg0) {
		while (true) {
			int var2 = arg0.method549();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1320 = arg0.method553();
				method518(field1320);
			} else if (var2 == 2) {
				field1321 = arg0.method549();
			} else if (var2 == 3) {
				field1322 = true;
			} else if (var2 == 5) {
				field1323 = false;
			} else if (var2 == 6) {
				field1319 = arg0.method556();
			} else if (var2 == 7) {
				int var3 = field1324;
				int var4 = field1325;
				int var5 = field1326;
				int var6 = field1327;
				int var7 = arg0.method553();
				method518(var7);
				field1324 = var3;
				field1325 = var4;
				field1326 = var5;
				field1327 = var6;
				field1328 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("XDCFWJPT.a(ZI)V")
	public void method518(int arg0) {
		double var2 = (arg0 >> 16 & 0xFF) / 256.0D;
		double var4 = (arg0 >> 8 & 0xFF) / 256.0D;
		double var6 = (arg0 & 0xFF) / 256.0D;
		double var8 = var2;
		if (var4 < var2) {
			var8 = var4;
		}

		if (var6 < var8) {
			var8 = var6;
		}

		double var10 = var2;
		if (var4 > var2) {
			var10 = var4;
		}

		if (var6 > var10) {
			var10 = var6;
		}

		double var12 = 0.0D;
		double var14 = 0.0D;
		double var16 = (var8 + var10) / 2.0D;
		if (var8 != var10) {
			if (var16 < 0.5D) {
				var14 = (var10 - var8) / (var8 + var10);
			}

			if (var16 >= 0.5D) {
				var14 = (var10 - var8) / (2.0D - var10 - var8);
			}

			if (var2 == var10) {
				var12 = (var4 - var6) / (var10 - var8);
			} else if (var4 == var10) {
				var12 = (var6 - var2) / (var10 - var8) + 2.0D;
			} else if (var6 == var10) {
				var12 = (var2 - var4) / (var10 - var8) + 4.0D;
			}
		}

		var12 /= 6.0D;
		field1324 = (int) (var12 * 256.0D);
		field1325 = (int) (var14 * 256.0D);
		field1326 = (int) (var16 * 256.0D);

		if (field1325 < 0) {
			field1325 = 0;
		} else if (field1325 > 255) {
			field1325 = 255;
		}

		if (field1326 < 0) {
			field1326 = 0;
		} else if (field1326 > 255) {
			field1326 = 255;
		}

		if (var16 > 0.5D) {
			field1328 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1328 = (int) (var14 * var16 * 512.0D);
		}

		if (field1328 < 1) {
			field1328 = 1;
		}

		field1327 = (int) (field1328 * var12);
		int var18 = field1324 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1325 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1326 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1329 = method519(var18, var19, var20);
	}

	@ObfuscatedName("XDCFWJPT.a(III)I")
	public final int method519(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}

		if (arg2 > 192) {
			arg1 /= 2;
		}

		if (arg2 > 217) {
			arg1 /= 2;
		}

		if (arg2 > 243) {
			arg1 /= 2;
		}

		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}
}
