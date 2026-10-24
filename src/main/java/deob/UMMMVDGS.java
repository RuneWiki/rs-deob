package deob;

@ObfuscatedName("UMMMVDGS")
public class UMMMVDGS {

	@ObfuscatedName("UMMMVDGS.f")
	public int field1280 = -1;

	@ObfuscatedName("UMMMVDGS.g")
	public boolean field1281 = false;

	@ObfuscatedName("UMMMVDGS.h")
	public boolean field1282 = true;

	@ObfuscatedName("UMMMVDGS.b")
	public static int field1276;

	@ObfuscatedName("UMMMVDGS.e")
	public int field1279;

	@ObfuscatedName("UMMMVDGS.i")
	public int field1283;

	@ObfuscatedName("UMMMVDGS.j")
	public int field1284;

	@ObfuscatedName("UMMMVDGS.k")
	public int field1285;

	@ObfuscatedName("UMMMVDGS.l")
	public int field1286;

	@ObfuscatedName("UMMMVDGS.m")
	public int field1287;

	@ObfuscatedName("UMMMVDGS.n")
	public int field1288;

	@ObfuscatedName("UMMMVDGS.d")
	public String field1278;

	@ObfuscatedName("UMMMVDGS.c")
	public static UMMMVDGS[] field1277;

	@ObfuscatedName("UMMMVDGS.a(ILINOFEYKQ;)V")
	public static void method510(INOFEYKQ arg0) {
		NHEPCMLW var1 = new NHEPCMLW(arg0.method277("flo.dat", null));
		field1276 = var1.method351();
		if (field1277 == null) {
			field1277 = new UMMMVDGS[field1276];
		}

		for (int var2 = 0; var2 < field1276; var2++) {
			if (field1277[var2] == null) {
				field1277[var2] = new UMMMVDGS();
			}

			field1277[var2].method511(var1);
		}
	}

	@ObfuscatedName("UMMMVDGS.a(ZLNHEPCMLW;)V")
	public void method511(NHEPCMLW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1279 = arg0.method353();
				method512(field1279);
			} else if (var2 == 2) {
				field1280 = arg0.method349();
			} else if (var2 == 3) {
				field1281 = true;
			} else if (var2 == 5) {
				field1282 = false;
			} else if (var2 == 6) {
				field1278 = arg0.method356();
			} else if (var2 == 7) {
				int var3 = field1283;
				int var4 = field1284;
				int var5 = field1285;
				int var6 = field1286;
				int var7 = arg0.method353();
				method512(var7);
				field1283 = var3;
				field1284 = var4;
				field1285 = var5;
				field1286 = var6;
				field1287 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("UMMMVDGS.a(ZI)V")
	public void method512(int arg0) {
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
		field1283 = (int) (var12 * 256.0D);
		field1284 = (int) (var14 * 256.0D);
		field1285 = (int) (var16 * 256.0D);

		if (field1284 < 0) {
			field1284 = 0;
		} else if (field1284 > 255) {
			field1284 = 255;
		}

		if (field1285 < 0) {
			field1285 = 0;
		} else if (field1285 > 255) {
			field1285 = 255;
		}

		if (var16 > 0.5D) {
			field1287 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1287 = (int) (var14 * var16 * 512.0D);
		}

		if (field1287 < 1) {
			field1287 = 1;
		}

		field1286 = (int) (field1287 * var12);
		int var18 = field1283 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1284 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1285 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1288 = method513(var18, var19, var20);
	}

	@ObfuscatedName("UMMMVDGS.a(III)I")
	public final int method513(int arg0, int arg1, int arg2) {
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
