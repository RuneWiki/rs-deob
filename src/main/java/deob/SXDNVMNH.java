package deob;

@ObfuscatedName("SXDNVMNH")
public class SXDNVMNH {

	@ObfuscatedName("SXDNVMNH.e")
	public int field1256 = -1;

	@ObfuscatedName("SXDNVMNH.f")
	public boolean field1257 = false;

	@ObfuscatedName("SXDNVMNH.g")
	public boolean field1258 = true;

	@ObfuscatedName("SXDNVMNH.a")
	public static int field1252;

	@ObfuscatedName("SXDNVMNH.d")
	public int field1255;

	@ObfuscatedName("SXDNVMNH.h")
	public int field1259;

	@ObfuscatedName("SXDNVMNH.i")
	public int field1260;

	@ObfuscatedName("SXDNVMNH.j")
	public int field1261;

	@ObfuscatedName("SXDNVMNH.k")
	public int field1262;

	@ObfuscatedName("SXDNVMNH.l")
	public int field1263;

	@ObfuscatedName("SXDNVMNH.m")
	public int field1264;

	@ObfuscatedName("SXDNVMNH.c")
	public String field1254;

	@ObfuscatedName("SXDNVMNH.b")
	public static SXDNVMNH[] field1253;

	@ObfuscatedName("SXDNVMNH.a(LGWOEELWB;B)V")
	public static void method482(GWOEELWB arg0) {
		MLYYHULT var1 = new MLYYHULT(arg0.method249("flo.dat", null));
		field1252 = var1.method298();
		if (field1253 == null) {
			field1253 = new SXDNVMNH[field1252];
		}

		for (int var2 = 0; var2 < field1252; var2++) {
			if (field1253[var2] == null) {
				field1253[var2] = new SXDNVMNH();
			}

			field1253[var2].method483(var1);
		}
	}

	@ObfuscatedName("SXDNVMNH.a(LMLYYHULT;B)V")
	public void method483(MLYYHULT arg0) {
		while (true) {
			int var2 = arg0.method296();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1255 = arg0.method300();
				method484(field1255);
			} else if (var2 == 2) {
				field1256 = arg0.method296();
			} else if (var2 == 3) {
				field1257 = true;
			} else if (var2 == 5) {
				field1258 = false;
			} else if (var2 == 6) {
				field1254 = arg0.method303();
			} else if (var2 == 7) {
				int var3 = field1259;
				int var4 = field1260;
				int var5 = field1261;
				int var6 = field1262;
				int var7 = arg0.method300();
				method484(var7);
				field1259 = var3;
				field1260 = var4;
				field1261 = var5;
				field1262 = var6;
				field1263 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("SXDNVMNH.a(II)V")
	public void method484(int arg0) {
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
		field1259 = (int) (var12 * 256.0D);
		field1260 = (int) (var14 * 256.0D);
		field1261 = (int) (var16 * 256.0D);

		if (field1260 < 0) {
			field1260 = 0;
		} else if (field1260 > 255) {
			field1260 = 255;
		}

		if (field1261 < 0) {
			field1261 = 0;
		} else if (field1261 > 255) {
			field1261 = 255;
		}

		if (var16 > 0.5D) {
			field1263 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1263 = (int) (var14 * var16 * 512.0D);
		}

		if (field1263 < 1) {
			field1263 = 1;
		}

		field1262 = (int) (field1263 * var12);
		int var18 = field1259 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1260 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1261 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1264 = method485(var18, var19, var20);
	}

	@ObfuscatedName("SXDNVMNH.a(III)I")
	public final int method485(int arg0, int arg1, int arg2) {
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
