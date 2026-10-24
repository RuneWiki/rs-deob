package deob;

@ObfuscatedName("YOJCLTLA")
public class YOJCLTLA {

	@ObfuscatedName("YOJCLTLA.g")
	public int field1475 = -1;

	@ObfuscatedName("YOJCLTLA.h")
	public boolean field1476 = false;

	@ObfuscatedName("YOJCLTLA.i")
	public boolean field1477 = true;

	@ObfuscatedName("YOJCLTLA.c")
	public static int field1471;

	@ObfuscatedName("YOJCLTLA.f")
	public int field1474;

	@ObfuscatedName("YOJCLTLA.j")
	public int field1478;

	@ObfuscatedName("YOJCLTLA.k")
	public int field1479;

	@ObfuscatedName("YOJCLTLA.l")
	public int field1480;

	@ObfuscatedName("YOJCLTLA.m")
	public int field1481;

	@ObfuscatedName("YOJCLTLA.n")
	public int field1482;

	@ObfuscatedName("YOJCLTLA.o")
	public int field1483;

	@ObfuscatedName("YOJCLTLA.e")
	public String field1473;

	@ObfuscatedName("YOJCLTLA.d")
	public static YOJCLTLA[] field1472;

	@ObfuscatedName("YOJCLTLA.a(LVSUYIIVA;I)V")
	public static void method583(VSUYIIVA arg0) {
		CFARFRSG var1 = new CFARFRSG(arg0.method570("flo.dat", null));
		field1471 = var1.method32();
		if (field1472 == null) {
			field1472 = new YOJCLTLA[field1471];
		}

		for (int var2 = 0; var2 < field1471; var2++) {
			if (field1472[var2] == null) {
				field1472[var2] = new YOJCLTLA();
			}

			field1472[var2].method584(var1);
		}
	}

	@ObfuscatedName("YOJCLTLA.a(LCFARFRSG;I)V")
	public void method584(CFARFRSG arg0) {
		while (true) {
			int var2 = arg0.method30();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1474 = arg0.method34();
				method585(field1474);
			} else if (var2 == 2) {
				field1475 = arg0.method30();
			} else if (var2 == 3) {
				field1476 = true;
			} else if (var2 == 5) {
				field1477 = false;
			} else if (var2 == 6) {
				field1473 = arg0.method37();
			} else if (var2 == 7) {
				int var3 = field1478;
				int var4 = field1479;
				int var5 = field1480;
				int var6 = field1481;
				int var7 = arg0.method34();
				method585(var7);
				field1478 = var3;
				field1479 = var4;
				field1480 = var5;
				field1481 = var6;
				field1482 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("YOJCLTLA.a(IB)V")
	public void method585(int arg0) {
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
		field1478 = (int) (var12 * 256.0D);
		field1479 = (int) (var14 * 256.0D);
		field1480 = (int) (var16 * 256.0D);

		if (field1479 < 0) {
			field1479 = 0;
		} else if (field1479 > 255) {
			field1479 = 255;
		}

		if (field1480 < 0) {
			field1480 = 0;
		} else if (field1480 > 255) {
			field1480 = 255;
		}

		if (var16 > 0.5D) {
			field1482 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1482 = (int) (var14 * var16 * 512.0D);
		}

		if (field1482 < 1) {
			field1482 = 1;
		}

		field1481 = (int) (field1482 * var12);
		int var18 = field1478 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1479 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1480 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1483 = method586(var18, var19, var20);
	}

	@ObfuscatedName("YOJCLTLA.a(III)I")
	public final int method586(int arg0, int arg1, int arg2) {
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
