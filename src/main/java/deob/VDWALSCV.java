package deob;

@ObfuscatedName("VDWALSCV")
public class VDWALSCV {

	@ObfuscatedName("VDWALSCV.g")
	public int field1326 = -1;

	@ObfuscatedName("VDWALSCV.h")
	public boolean field1327 = false;

	@ObfuscatedName("VDWALSCV.i")
	public boolean field1328 = true;

	@ObfuscatedName("VDWALSCV.c")
	public static int field1322;

	@ObfuscatedName("VDWALSCV.f")
	public int field1325;

	@ObfuscatedName("VDWALSCV.j")
	public int field1329;

	@ObfuscatedName("VDWALSCV.k")
	public int field1330;

	@ObfuscatedName("VDWALSCV.l")
	public int field1331;

	@ObfuscatedName("VDWALSCV.m")
	public int field1332;

	@ObfuscatedName("VDWALSCV.n")
	public int field1333;

	@ObfuscatedName("VDWALSCV.o")
	public int field1334;

	@ObfuscatedName("VDWALSCV.e")
	public String field1324;

	@ObfuscatedName("VDWALSCV.d")
	public static VDWALSCV[] field1323;

	@ObfuscatedName("VDWALSCV.a(LSMIVAFST;I)V")
	public static void method535(SMIVAFST arg0) {
		BSNPYLEV var1 = new BSNPYLEV(arg0.method512("flo.dat", null));
		field1322 = var1.method49();
		if (field1323 == null) {
			field1323 = new VDWALSCV[field1322];
		}

		for (int var2 = 0; var2 < field1322; var2++) {
			if (field1323[var2] == null) {
				field1323[var2] = new VDWALSCV();
			}

			field1323[var2].method536(var1);
		}
	}

	@ObfuscatedName("VDWALSCV.a(ILBSNPYLEV;)V")
	public void method536(BSNPYLEV arg0) {
		while (true) {
			int var2 = arg0.method47();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1325 = arg0.method51();
				method537(field1325);
			} else if (var2 == 2) {
				field1326 = arg0.method47();
			} else if (var2 == 3) {
				field1327 = true;
			} else if (var2 == 5) {
				field1328 = false;
			} else if (var2 == 6) {
				field1324 = arg0.method54();
			} else if (var2 == 7) {
				int var3 = field1329;
				int var4 = field1330;
				int var5 = field1331;
				int var6 = field1332;
				int var7 = arg0.method51();
				method537(var7);
				field1329 = var3;
				field1330 = var4;
				field1331 = var5;
				field1332 = var6;
				field1333 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("VDWALSCV.a(II)V")
	public void method537(int arg0) {
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
		field1329 = (int) (var12 * 256.0D);
		field1330 = (int) (var14 * 256.0D);
		field1331 = (int) (var16 * 256.0D);

		if (field1330 < 0) {
			field1330 = 0;
		} else if (field1330 > 255) {
			field1330 = 255;
		}

		if (field1331 < 0) {
			field1331 = 0;
		} else if (field1331 > 255) {
			field1331 = 255;
		}

		if (var16 > 0.5D) {
			field1333 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1333 = (int) (var14 * var16 * 512.0D);
		}

		if (field1333 < 1) {
			field1333 = 1;
		}

		field1332 = (int) (field1333 * var12);
		int var18 = field1329 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1330 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1331 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1334 = method538(var18, var19, var20);
	}

	@ObfuscatedName("VDWALSCV.a(III)I")
	public final int method538(int arg0, int arg1, int arg2) {
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
