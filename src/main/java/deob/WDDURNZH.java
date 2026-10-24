package deob;

@ObfuscatedName("WDDURNZH")
public class WDDURNZH {

	@ObfuscatedName("WDDURNZH.h")
	public int field1336 = -1;

	@ObfuscatedName("WDDURNZH.i")
	public boolean field1337 = false;

	@ObfuscatedName("WDDURNZH.j")
	public boolean field1338 = true;

	@ObfuscatedName("WDDURNZH.d")
	public static int field1332;

	@ObfuscatedName("WDDURNZH.g")
	public int field1335;

	@ObfuscatedName("WDDURNZH.k")
	public int field1339;

	@ObfuscatedName("WDDURNZH.l")
	public int field1340;

	@ObfuscatedName("WDDURNZH.m")
	public int field1341;

	@ObfuscatedName("WDDURNZH.n")
	public int field1342;

	@ObfuscatedName("WDDURNZH.o")
	public int field1343;

	@ObfuscatedName("WDDURNZH.p")
	public int field1344;

	@ObfuscatedName("WDDURNZH.f")
	public String field1334;

	@ObfuscatedName("WDDURNZH.e")
	public static WDDURNZH[] field1333;

	@ObfuscatedName("WDDURNZH.a(ILSPZBTZXL;)V")
	public static void method561(SPZBTZXL arg0) {
		LDILQFVA var1 = new LDILQFVA(arg0.method515("flo.dat", null));
		field1332 = var1.method404();
		if (field1333 == null) {
			field1333 = new WDDURNZH[field1332];
		}

		for (int var2 = 0; var2 < field1332; var2++) {
			if (field1333[var2] == null) {
				field1333[var2] = new WDDURNZH();
			}

			field1333[var2].method562(var1);
		}
	}

	@ObfuscatedName("WDDURNZH.a(LLDILQFVA;I)V")
	public void method562(LDILQFVA arg0) {
		while (true) {
			int var2 = arg0.method402();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1335 = arg0.method406();
				method563(field1335);
			} else if (var2 == 2) {
				field1336 = arg0.method402();
			} else if (var2 == 3) {
				field1337 = true;
			} else if (var2 == 5) {
				field1338 = false;
			} else if (var2 == 6) {
				field1334 = arg0.method409();
			} else if (var2 == 7) {
				int var3 = field1339;
				int var4 = field1340;
				int var5 = field1341;
				int var6 = field1342;
				int var7 = arg0.method406();
				method563(var7);
				field1339 = var3;
				field1340 = var4;
				field1341 = var5;
				field1342 = var6;
				field1343 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("WDDURNZH.a(IZ)V")
	public void method563(int arg0) {
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
		field1339 = (int) (var12 * 256.0D);
		field1340 = (int) (var14 * 256.0D);
		field1341 = (int) (var16 * 256.0D);

		if (field1340 < 0) {
			field1340 = 0;
		} else if (field1340 > 255) {
			field1340 = 255;
		}

		if (field1341 < 0) {
			field1341 = 0;
		} else if (field1341 > 255) {
			field1341 = 255;
		}

		if (var16 > 0.5D) {
			field1343 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1343 = (int) (var14 * var16 * 512.0D);
		}

		if (field1343 < 1) {
			field1343 = 1;
		}

		field1342 = (int) (field1343 * var12);
		int var18 = field1339 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1340 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1341 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1344 = method564(var18, var19, var20);
	}

	@ObfuscatedName("WDDURNZH.a(III)I")
	public final int method564(int arg0, int arg1, int arg2) {
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
