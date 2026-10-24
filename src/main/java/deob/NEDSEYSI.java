package deob;

@ObfuscatedName("NEDSEYSI")
public class NEDSEYSI {

	@ObfuscatedName("NEDSEYSI.g")
	public int field899 = -1;

	@ObfuscatedName("NEDSEYSI.h")
	public boolean field900 = false;

	@ObfuscatedName("NEDSEYSI.i")
	public boolean field901 = true;

	@ObfuscatedName("NEDSEYSI.c")
	public static int field895;

	@ObfuscatedName("NEDSEYSI.f")
	public int field898;

	@ObfuscatedName("NEDSEYSI.j")
	public int field902;

	@ObfuscatedName("NEDSEYSI.k")
	public int field903;

	@ObfuscatedName("NEDSEYSI.l")
	public int field904;

	@ObfuscatedName("NEDSEYSI.m")
	public int field905;

	@ObfuscatedName("NEDSEYSI.n")
	public int field906;

	@ObfuscatedName("NEDSEYSI.o")
	public int field907;

	@ObfuscatedName("NEDSEYSI.e")
	public String field897;

	@ObfuscatedName("NEDSEYSI.d")
	public static NEDSEYSI[] field896;

	@ObfuscatedName("NEDSEYSI.a(ILHRXSNEYZ;)V")
	public static void method381(HRXSNEYZ arg0) {
		JHKSAGUC var1 = new JHKSAGUC(arg0.method289("flo.dat", null));
		field895 = var1.method308();
		if (field896 == null) {
			field896 = new NEDSEYSI[field895];
		}

		for (int var2 = 0; var2 < field895; var2++) {
			if (field896[var2] == null) {
				field896[var2] = new NEDSEYSI();
			}

			field896[var2].method382(var1);
		}
	}

	@ObfuscatedName("NEDSEYSI.a(LJHKSAGUC;I)V")
	public void method382(JHKSAGUC arg0) {
		while (true) {
			int var2 = arg0.method306();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field898 = arg0.method310();
				method383(field898);
			} else if (var2 == 2) {
				field899 = arg0.method306();
			} else if (var2 == 3) {
				field900 = true;
			} else if (var2 == 5) {
				field901 = false;
			} else if (var2 == 6) {
				field897 = arg0.method313();
			} else if (var2 == 7) {
				int var3 = field902;
				int var4 = field903;
				int var5 = field904;
				int var6 = field905;
				int var7 = arg0.method310();
				method383(var7);
				field902 = var3;
				field903 = var4;
				field904 = var5;
				field905 = var6;
				field906 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("NEDSEYSI.a(II)V")
	public void method383(int arg0) {
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
		field902 = (int) (var12 * 256.0D);
		field903 = (int) (var14 * 256.0D);
		field904 = (int) (var16 * 256.0D);

		if (field903 < 0) {
			field903 = 0;
		} else if (field903 > 255) {
			field903 = 255;
		}

		if (field904 < 0) {
			field904 = 0;
		} else if (field904 > 255) {
			field904 = 255;
		}

		if (var16 > 0.5D) {
			field906 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field906 = (int) (var14 * var16 * 512.0D);
		}

		if (field906 < 1) {
			field906 = 1;
		}

		field905 = (int) (field906 * var12);
		int var18 = field902 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field903 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field904 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field907 = method384(var18, var19, var20);
	}

	@ObfuscatedName("NEDSEYSI.a(III)I")
	public final int method384(int arg0, int arg1, int arg2) {
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
