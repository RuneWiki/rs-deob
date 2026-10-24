package deob;

@ObfuscatedName("TFMGYYZY")
public class TFMGYYZY {

	@ObfuscatedName("TFMGYYZY.f")
	public int field1294 = -1;

	@ObfuscatedName("TFMGYYZY.g")
	public boolean field1295 = false;

	@ObfuscatedName("TFMGYYZY.h")
	public boolean field1296 = true;

	@ObfuscatedName("TFMGYYZY.b")
	public static int field1290;

	@ObfuscatedName("TFMGYYZY.e")
	public int field1293;

	@ObfuscatedName("TFMGYYZY.i")
	public int field1297;

	@ObfuscatedName("TFMGYYZY.j")
	public int field1298;

	@ObfuscatedName("TFMGYYZY.k")
	public int field1299;

	@ObfuscatedName("TFMGYYZY.l")
	public int field1300;

	@ObfuscatedName("TFMGYYZY.m")
	public int field1301;

	@ObfuscatedName("TFMGYYZY.n")
	public int field1302;

	@ObfuscatedName("TFMGYYZY.d")
	public String field1292;

	@ObfuscatedName("TFMGYYZY.c")
	public static TFMGYYZY[] field1291;

	@ObfuscatedName("TFMGYYZY.a(ZLAKPFVPPG;)V")
	public static void method468(AKPFVPPG arg0) {
		FTMSICIZ var1 = new FTMSICIZ(arg0.method7("flo.dat", null));
		field1290 = var1.method215();
		if (field1291 == null) {
			field1291 = new TFMGYYZY[field1290];
		}

		for (int var2 = 0; var2 < field1290; var2++) {
			if (field1291[var2] == null) {
				field1291[var2] = new TFMGYYZY();
			}

			field1291[var2].method469(var1);
		}
	}

	@ObfuscatedName("TFMGYYZY.a(LFTMSICIZ;I)V")
	public void method469(FTMSICIZ arg0) {
		while (true) {
			int var2 = arg0.method213();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1293 = arg0.method217();
				method470(field1293);
			} else if (var2 == 2) {
				field1294 = arg0.method213();
			} else if (var2 == 3) {
				field1295 = true;
			} else if (var2 == 5) {
				field1296 = false;
			} else if (var2 == 6) {
				field1292 = arg0.method220();
			} else if (var2 == 7) {
				int var3 = field1297;
				int var4 = field1298;
				int var5 = field1299;
				int var6 = field1300;
				int var7 = arg0.method217();
				method470(var7);
				field1297 = var3;
				field1298 = var4;
				field1299 = var5;
				field1300 = var6;
				field1301 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("TFMGYYZY.a(IZ)V")
	public void method470(int arg0) {
		if (arg0 == 0xFF00FF) {
			arg0 = 0;
		}

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
		field1297 = (int) (var12 * 256.0D);
		field1298 = (int) (var14 * 256.0D);
		field1299 = (int) (var16 * 256.0D);

		if (field1298 < 0) {
			field1298 = 0;
		} else if (field1298 > 255) {
			field1298 = 255;
		}

		if (field1299 < 0) {
			field1299 = 0;
		} else if (field1299 > 255) {
			field1299 = 255;
		}

		if (var16 > 0.5D) {
			field1301 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1301 = (int) (var14 * var16 * 512.0D);
		}

		if (field1301 < 1) {
			field1301 = 1;
		}

		field1300 = (int) (field1301 * var12);
		int var18 = field1297 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1298 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1299 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1302 = method471(var18, var19, var20);
	}

	@ObfuscatedName("TFMGYYZY.a(III)I")
	public final int method471(int arg0, int arg1, int arg2) {
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
