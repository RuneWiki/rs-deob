package deob;

@ObfuscatedName("FBZMYCDC")
public class FBZMYCDC {

	@ObfuscatedName("FBZMYCDC.f")
	public int field683 = -1;

	@ObfuscatedName("FBZMYCDC.g")
	public boolean field684 = false;

	@ObfuscatedName("FBZMYCDC.h")
	public boolean field685 = true;

	@ObfuscatedName("FBZMYCDC.b")
	public static int field679;

	@ObfuscatedName("FBZMYCDC.e")
	public int field682;

	@ObfuscatedName("FBZMYCDC.i")
	public int field686;

	@ObfuscatedName("FBZMYCDC.j")
	public int field687;

	@ObfuscatedName("FBZMYCDC.k")
	public int field688;

	@ObfuscatedName("FBZMYCDC.l")
	public int field689;

	@ObfuscatedName("FBZMYCDC.m")
	public int field690;

	@ObfuscatedName("FBZMYCDC.n")
	public int field691;

	@ObfuscatedName("FBZMYCDC.d")
	public String field681;

	@ObfuscatedName("FBZMYCDC.c")
	public static FBZMYCDC[] field680;

	@ObfuscatedName("FBZMYCDC.a(BLJUPFHAZZ;)V")
	public static void method197(JUPFHAZZ arg0) {
		TKPFKOXP var1 = new TKPFKOXP(arg0.method372("flo.dat", null));
		field679 = var1.method531();
		if (field680 == null) {
			field680 = new FBZMYCDC[field679];
		}

		for (int var2 = 0; var2 < field679; var2++) {
			if (field680[var2] == null) {
				field680[var2] = new FBZMYCDC();
			}

			field680[var2].method198(var1);
		}
	}

	@ObfuscatedName("FBZMYCDC.a(LTKPFKOXP;B)V")
	public void method198(TKPFKOXP arg0) {
		while (true) {
			int var2 = arg0.method529();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field682 = arg0.method533();
				method199(field682);
			} else if (var2 == 2) {
				field683 = arg0.method529();
			} else if (var2 == 3) {
				field684 = true;
			} else if (var2 == 5) {
				field685 = false;
			} else if (var2 == 6) {
				field681 = arg0.method536();
			} else if (var2 == 7) {
				int var3 = field686;
				int var4 = field687;
				int var5 = field688;
				int var6 = field689;
				int var7 = arg0.method533();
				method199(var7);
				field686 = var3;
				field687 = var4;
				field688 = var5;
				field689 = var6;
				field690 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("FBZMYCDC.a(II)V")
	public void method199(int arg0) {
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
		field686 = (int) (var12 * 256.0D);
		field687 = (int) (var14 * 256.0D);
		field688 = (int) (var16 * 256.0D);

		if (field687 < 0) {
			field687 = 0;
		} else if (field687 > 255) {
			field687 = 255;
		}

		if (field688 < 0) {
			field688 = 0;
		} else if (field688 > 255) {
			field688 = 255;
		}

		if (var16 > 0.5D) {
			field690 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field690 = (int) (var14 * var16 * 512.0D);
		}

		if (field690 < 1) {
			field690 = 1;
		}

		field689 = (int) (field690 * var12);
		int var18 = field686 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field687 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field688 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field691 = method200(var18, var19, var20);
	}

	@ObfuscatedName("FBZMYCDC.a(III)I")
	public final int method200(int arg0, int arg1, int arg2) {
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
