package deob;

@ObfuscatedName("IMXTJGZE")
public class IMXTJGZE {

	@ObfuscatedName("IMXTJGZE.h")
	public int field776 = -1;

	@ObfuscatedName("IMXTJGZE.i")
	public boolean field777 = false;

	@ObfuscatedName("IMXTJGZE.j")
	public boolean field778 = true;

	@ObfuscatedName("IMXTJGZE.d")
	public static int field772;

	@ObfuscatedName("IMXTJGZE.g")
	public int field775;

	@ObfuscatedName("IMXTJGZE.k")
	public int field779;

	@ObfuscatedName("IMXTJGZE.l")
	public int field780;

	@ObfuscatedName("IMXTJGZE.m")
	public int field781;

	@ObfuscatedName("IMXTJGZE.n")
	public int field782;

	@ObfuscatedName("IMXTJGZE.o")
	public int field783;

	@ObfuscatedName("IMXTJGZE.p")
	public int field784;

	@ObfuscatedName("IMXTJGZE.f")
	public String field774;

	@ObfuscatedName("IMXTJGZE.e")
	public static IMXTJGZE[] field773;

	@ObfuscatedName("IMXTJGZE.a(LLYZBHNJP;I)V")
	public static void method221(LYZBHNJP arg0) {
		ZOMNSJJM var1 = new ZOMNSJJM(arg0.method290("flo.dat", null));
		field772 = var1.method549();
		if (field773 == null) {
			field773 = new IMXTJGZE[field772];
		}

		for (int var2 = 0; var2 < field772; var2++) {
			if (field773[var2] == null) {
				field773[var2] = new IMXTJGZE();
			}

			field773[var2].method222(var1);
		}
	}

	@ObfuscatedName("IMXTJGZE.a(LZOMNSJJM;B)V")
	public void method222(ZOMNSJJM arg0) {
		while (true) {
			int var2 = arg0.method547();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field775 = arg0.method551();
				method223(field775);
			} else if (var2 == 2) {
				field776 = arg0.method547();
			} else if (var2 == 3) {
				field777 = true;
			} else if (var2 == 5) {
				field778 = false;
			} else if (var2 == 6) {
				field774 = arg0.method554();
			} else if (var2 == 7) {
				int var3 = field779;
				int var4 = field780;
				int var5 = field781;
				int var6 = field782;
				int var7 = arg0.method551();
				method223(var7);
				field779 = var3;
				field780 = var4;
				field781 = var5;
				field782 = var6;
				field783 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("IMXTJGZE.a(II)V")
	public void method223(int arg0) {
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
		field779 = (int) (var12 * 256.0D);
		field780 = (int) (var14 * 256.0D);
		field781 = (int) (var16 * 256.0D);

		if (field780 < 0) {
			field780 = 0;
		} else if (field780 > 255) {
			field780 = 255;
		}

		if (field781 < 0) {
			field781 = 0;
		} else if (field781 > 255) {
			field781 = 255;
		}

		if (var16 > 0.5D) {
			field783 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field783 = (int) (var14 * var16 * 512.0D);
		}

		if (field783 < 1) {
			field783 = 1;
		}

		field782 = (int) (field783 * var12);
		int var18 = field779 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field780 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field781 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field784 = method224(var18, var19, var20);
	}

	@ObfuscatedName("IMXTJGZE.a(III)I")
	public final int method224(int arg0, int arg1, int arg2) {
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
