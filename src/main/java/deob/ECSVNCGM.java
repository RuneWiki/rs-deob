package deob;

@ObfuscatedName("ECSVNCGM")
public class ECSVNCGM {

	@ObfuscatedName("ECSVNCGM.e")
	public int field555 = -1;

	@ObfuscatedName("ECSVNCGM.f")
	public boolean field556 = false;

	@ObfuscatedName("ECSVNCGM.g")
	public boolean field557 = true;

	@ObfuscatedName("ECSVNCGM.a")
	public static int field551;

	@ObfuscatedName("ECSVNCGM.d")
	public int field554;

	@ObfuscatedName("ECSVNCGM.h")
	public int field558;

	@ObfuscatedName("ECSVNCGM.i")
	public int field559;

	@ObfuscatedName("ECSVNCGM.j")
	public int field560;

	@ObfuscatedName("ECSVNCGM.k")
	public int field561;

	@ObfuscatedName("ECSVNCGM.l")
	public int field562;

	@ObfuscatedName("ECSVNCGM.m")
	public int field563;

	@ObfuscatedName("ECSVNCGM.c")
	public String field553;

	@ObfuscatedName("ECSVNCGM.b")
	public static ECSVNCGM[] field552;

	@ObfuscatedName("ECSVNCGM.a(ILCVNWKEAW;)V")
	public static void method211(CVNWKEAW arg0) {
		XOUQUKZW var1 = new XOUQUKZW(arg0.method180("flo.dat", null));
		field551 = var1.method523();
		if (field552 == null) {
			field552 = new ECSVNCGM[field551];
		}

		for (int var2 = 0; var2 < field551; var2++) {
			if (field552[var2] == null) {
				field552[var2] = new ECSVNCGM();
			}

			field552[var2].method212(var1);
		}
	}

	@ObfuscatedName("ECSVNCGM.a(BLXOUQUKZW;)V")
	public void method212(XOUQUKZW arg0) {
		while (true) {
			int var2 = arg0.method521();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field554 = arg0.method525();
				method213(field554);
			} else if (var2 == 2) {
				field555 = arg0.method521();
			} else if (var2 == 3) {
				field556 = true;
			} else if (var2 == 5) {
				field557 = false;
			} else if (var2 == 6) {
				field553 = arg0.method528();
			} else if (var2 == 7) {
				int var3 = field558;
				int var4 = field559;
				int var5 = field560;
				int var6 = field561;
				int var7 = arg0.method525();
				method213(var7);
				field558 = var3;
				field559 = var4;
				field560 = var5;
				field561 = var6;
				field562 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("ECSVNCGM.a(II)V")
	public void method213(int arg0) {
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
		field558 = (int) (var12 * 256.0D);
		field559 = (int) (var14 * 256.0D);
		field560 = (int) (var16 * 256.0D);

		if (field559 < 0) {
			field559 = 0;
		} else if (field559 > 255) {
			field559 = 255;
		}

		if (field560 < 0) {
			field560 = 0;
		} else if (field560 > 255) {
			field560 = 255;
		}

		if (var16 > 0.5D) {
			field562 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field562 = (int) (var14 * var16 * 512.0D);
		}

		if (field562 < 1) {
			field562 = 1;
		}

		field561 = (int) (field562 * var12);
		int var18 = field558 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field559 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field560 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field563 = method214(var18, var19, var20);
	}

	@ObfuscatedName("ECSVNCGM.a(III)I")
	public final int method214(int arg0, int arg1, int arg2) {
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
