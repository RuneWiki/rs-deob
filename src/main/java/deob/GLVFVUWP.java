package deob;

@ObfuscatedName("GLVFVUWP")
public class GLVFVUWP {

	@ObfuscatedName("GLVFVUWP.f")
	public int field672 = -1;

	@ObfuscatedName("GLVFVUWP.g")
	public boolean field673 = false;

	@ObfuscatedName("GLVFVUWP.h")
	public boolean field674 = true;

	@ObfuscatedName("GLVFVUWP.b")
	public static int field668;

	@ObfuscatedName("GLVFVUWP.e")
	public int field671;

	@ObfuscatedName("GLVFVUWP.i")
	public int field675;

	@ObfuscatedName("GLVFVUWP.j")
	public int field676;

	@ObfuscatedName("GLVFVUWP.k")
	public int field677;

	@ObfuscatedName("GLVFVUWP.l")
	public int field678;

	@ObfuscatedName("GLVFVUWP.m")
	public int field679;

	@ObfuscatedName("GLVFVUWP.n")
	public int field680;

	@ObfuscatedName("GLVFVUWP.d")
	public String field670;

	@ObfuscatedName("GLVFVUWP.c")
	public static GLVFVUWP[] field669;

	@ObfuscatedName("GLVFVUWP.a(ILTKEGJSFV;)V")
	public static void method315(TKEGJSFV arg0) {
		EGCCHUZS var1 = new EGCCHUZS(arg0.method542("flo.dat", null));
		field668 = var1.method263();
		if (field669 == null) {
			field669 = new GLVFVUWP[field668];
		}

		for (int var2 = 0; var2 < field668; var2++) {
			if (field669[var2] == null) {
				field669[var2] = new GLVFVUWP();
			}

			field669[var2].method316(var1);
		}
	}

	@ObfuscatedName("GLVFVUWP.a(LEGCCHUZS;Z)V")
	public void method316(EGCCHUZS arg0) {
		while (true) {
			int var2 = arg0.method261();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field671 = arg0.method265();
				method317(field671);
			} else if (var2 == 2) {
				field672 = arg0.method261();
			} else if (var2 == 3) {
				field673 = true;
			} else if (var2 == 5) {
				field674 = false;
			} else if (var2 == 6) {
				field670 = arg0.method268();
			} else if (var2 == 7) {
				int var3 = field675;
				int var4 = field676;
				int var5 = field677;
				int var6 = field678;
				int var7 = arg0.method265();
				method317(var7);
				field675 = var3;
				field676 = var4;
				field677 = var5;
				field678 = var6;
				field679 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("GLVFVUWP.a(II)V")
	public void method317(int arg0) {
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
		field675 = (int) (var12 * 256.0D);
		field676 = (int) (var14 * 256.0D);
		field677 = (int) (var16 * 256.0D);

		if (field676 < 0) {
			field676 = 0;
		} else if (field676 > 255) {
			field676 = 255;
		}

		if (field677 < 0) {
			field677 = 0;
		} else if (field677 > 255) {
			field677 = 255;
		}

		if (var16 > 0.5D) {
			field679 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field679 = (int) (var14 * var16 * 512.0D);
		}

		if (field679 < 1) {
			field679 = 1;
		}

		field678 = (int) (field679 * var12);
		int var18 = field675 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field676 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field677 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field680 = method318(var18, var19, var20);
	}

	@ObfuscatedName("GLVFVUWP.a(III)I")
	public final int method318(int arg0, int arg1, int arg2) {
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
