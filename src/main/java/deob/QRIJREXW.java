package deob;

@ObfuscatedName("QRIJREXW")
public class QRIJREXW {

	@ObfuscatedName("QRIJREXW.g")
	public int field1313 = -1;

	@ObfuscatedName("QRIJREXW.h")
	public boolean field1314 = false;

	@ObfuscatedName("QRIJREXW.i")
	public boolean field1315 = true;

	@ObfuscatedName("QRIJREXW.c")
	public static int field1309;

	@ObfuscatedName("QRIJREXW.f")
	public int field1312;

	@ObfuscatedName("QRIJREXW.j")
	public int field1316;

	@ObfuscatedName("QRIJREXW.k")
	public int field1317;

	@ObfuscatedName("QRIJREXW.l")
	public int field1318;

	@ObfuscatedName("QRIJREXW.m")
	public int field1319;

	@ObfuscatedName("QRIJREXW.n")
	public int field1320;

	@ObfuscatedName("QRIJREXW.o")
	public int field1321;

	@ObfuscatedName("QRIJREXW.e")
	public String field1311;

	@ObfuscatedName("QRIJREXW.d")
	public static QRIJREXW[] field1310;

	@ObfuscatedName("QRIJREXW.a(LLKPVZAQN;I)V")
	public static void method450(LKPVZAQN arg0) {
		WBEWPIXO var1 = new WBEWPIXO(arg0.method323("flo.dat", null));
		field1309 = var1.method517();
		if (field1310 == null) {
			field1310 = new QRIJREXW[field1309];
		}

		for (int var2 = 0; var2 < field1309; var2++) {
			if (field1310[var2] == null) {
				field1310[var2] = new QRIJREXW();
			}

			field1310[var2].method451(var1);
		}
	}

	@ObfuscatedName("QRIJREXW.a(LWBEWPIXO;I)V")
	public void method451(WBEWPIXO arg0) {
		while (true) {
			int var2 = arg0.method515();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1312 = arg0.method519();
				method452(field1312);
			} else if (var2 == 2) {
				field1313 = arg0.method515();
			} else if (var2 == 3) {
				field1314 = true;
			} else if (var2 == 5) {
				field1315 = false;
			} else if (var2 == 6) {
				field1311 = arg0.method522();
			} else if (var2 == 7) {
				int var3 = field1316;
				int var4 = field1317;
				int var5 = field1318;
				int var6 = field1319;
				int var7 = arg0.method519();
				method452(var7);
				field1316 = var3;
				field1317 = var4;
				field1318 = var5;
				field1319 = var6;
				field1320 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("QRIJREXW.a(ZI)V")
	public void method452(int arg0) {
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
		field1316 = (int) (var12 * 256.0D);
		field1317 = (int) (var14 * 256.0D);
		field1318 = (int) (var16 * 256.0D);

		if (field1317 < 0) {
			field1317 = 0;
		} else if (field1317 > 255) {
			field1317 = 255;
		}

		if (field1318 < 0) {
			field1318 = 0;
		} else if (field1318 > 255) {
			field1318 = 255;
		}

		if (var16 > 0.5D) {
			field1320 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1320 = (int) (var14 * var16 * 512.0D);
		}

		if (field1320 < 1) {
			field1320 = 1;
		}

		field1319 = (int) (field1320 * var12);
		int var18 = field1316 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1317 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1318 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1321 = method453(var18, var19, var20);
	}

	@ObfuscatedName("QRIJREXW.a(III)I")
	public final int method453(int arg0, int arg1, int arg2) {
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
