package deob;

@ObfuscatedName("YTVETJJL")
public class YTVETJJL {

	@ObfuscatedName("YTVETJJL.h")
	public int field1439 = -1;

	@ObfuscatedName("YTVETJJL.i")
	public boolean field1440 = false;

	@ObfuscatedName("YTVETJJL.j")
	public boolean field1441 = true;

	@ObfuscatedName("YTVETJJL.d")
	public static int field1435;

	@ObfuscatedName("YTVETJJL.g")
	public int field1438;

	@ObfuscatedName("YTVETJJL.k")
	public int field1442;

	@ObfuscatedName("YTVETJJL.l")
	public int field1443;

	@ObfuscatedName("YTVETJJL.m")
	public int field1444;

	@ObfuscatedName("YTVETJJL.n")
	public int field1445;

	@ObfuscatedName("YTVETJJL.o")
	public int field1446;

	@ObfuscatedName("YTVETJJL.p")
	public int field1447;

	@ObfuscatedName("YTVETJJL.f")
	public String field1437;

	@ObfuscatedName("YTVETJJL.e")
	public static YTVETJJL[] field1436;

	@ObfuscatedName("YTVETJJL.a(LFIGUVTWB;Z)V")
	public static void method568(FIGUVTWB arg0) {
		MUKVLYLC var1 = new MUKVLYLC(arg0.method209("flo.dat", null));
		field1435 = var1.method294();
		if (field1436 == null) {
			field1436 = new YTVETJJL[field1435];
		}

		for (int var2 = 0; var2 < field1435; var2++) {
			if (field1436[var2] == null) {
				field1436[var2] = new YTVETJJL();
			}

			field1436[var2].method569(var1);
		}
	}

	@ObfuscatedName("YTVETJJL.a(LMUKVLYLC;Z)V")
	public void method569(MUKVLYLC arg0) {
		while (true) {
			int var2 = arg0.method292();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1438 = arg0.method296();
				method570(field1438);
			} else if (var2 == 2) {
				field1439 = arg0.method292();
			} else if (var2 == 3) {
				field1440 = true;
			} else if (var2 == 5) {
				field1441 = false;
			} else if (var2 == 6) {
				field1437 = arg0.method299();
			} else if (var2 == 7) {
				int var3 = field1442;
				int var4 = field1443;
				int var5 = field1444;
				int var6 = field1445;
				int var7 = arg0.method296();
				method570(var7);
				field1442 = var3;
				field1443 = var4;
				field1444 = var5;
				field1445 = var6;
				field1446 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("YTVETJJL.a(IB)V")
	public void method570(int arg0) {
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
		field1442 = (int) (var12 * 256.0D);
		field1443 = (int) (var14 * 256.0D);
		field1444 = (int) (var16 * 256.0D);

		if (field1443 < 0) {
			field1443 = 0;
		} else if (field1443 > 255) {
			field1443 = 255;
		}

		if (field1444 < 0) {
			field1444 = 0;
		} else if (field1444 > 255) {
			field1444 = 255;
		}

		if (var16 > 0.5D) {
			field1446 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1446 = (int) (var14 * var16 * 512.0D);
		}

		if (field1446 < 1) {
			field1446 = 1;
		}

		field1445 = (int) (field1446 * var12);
		int var18 = field1442 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1443 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1444 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1447 = method571(var18, var19, var20);
	}

	@ObfuscatedName("YTVETJJL.a(III)I")
	public final int method571(int arg0, int arg1, int arg2) {
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
