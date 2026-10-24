package deob;

@ObfuscatedName("EHKXAJCO")
public class EHKXAJCO {

	@ObfuscatedName("EHKXAJCO.g")
	public int field706 = -1;

	@ObfuscatedName("EHKXAJCO.h")
	public boolean field707 = false;

	@ObfuscatedName("EHKXAJCO.i")
	public boolean field708 = true;

	@ObfuscatedName("EHKXAJCO.c")
	public static int field702;

	@ObfuscatedName("EHKXAJCO.f")
	public int field705;

	@ObfuscatedName("EHKXAJCO.j")
	public int field709;

	@ObfuscatedName("EHKXAJCO.k")
	public int field710;

	@ObfuscatedName("EHKXAJCO.l")
	public int field711;

	@ObfuscatedName("EHKXAJCO.m")
	public int field712;

	@ObfuscatedName("EHKXAJCO.n")
	public int field713;

	@ObfuscatedName("EHKXAJCO.o")
	public int field714;

	@ObfuscatedName("EHKXAJCO.e")
	public String field704;

	@ObfuscatedName("EHKXAJCO.d")
	public static EHKXAJCO[] field703;

	@ObfuscatedName("EHKXAJCO.a(ILSRZUEVOD;)V")
	public static void method282(SRZUEVOD arg0) {
		LZWRHABP var1 = new LZWRHABP(arg0.method566("flo.dat", null));
		field702 = var1.method465();
		if (field703 == null) {
			field703 = new EHKXAJCO[field702];
		}

		for (int var2 = 0; var2 < field702; var2++) {
			if (field703[var2] == null) {
				field703[var2] = new EHKXAJCO();
			}

			field703[var2].method283(var1);
		}
	}

	@ObfuscatedName("EHKXAJCO.a(ZLLZWRHABP;)V")
	public void method283(LZWRHABP arg0) {
		while (true) {
			int var2 = arg0.method463();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field705 = arg0.method467();
				method284(field705);
			} else if (var2 == 2) {
				field706 = arg0.method463();
			} else if (var2 == 3) {
				field707 = true;
			} else if (var2 == 5) {
				field708 = false;
			} else if (var2 == 6) {
				field704 = arg0.method470();
			} else if (var2 == 7) {
				int var3 = field709;
				int var4 = field710;
				int var5 = field711;
				int var6 = field712;
				int var7 = arg0.method467();
				method284(var7);
				field709 = var3;
				field710 = var4;
				field711 = var5;
				field712 = var6;
				field713 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("EHKXAJCO.a(II)V")
	public void method284(int arg0) {
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
		field709 = (int) (var12 * 256.0D);
		field710 = (int) (var14 * 256.0D);
		field711 = (int) (var16 * 256.0D);

		if (field710 < 0) {
			field710 = 0;
		} else if (field710 > 255) {
			field710 = 255;
		}

		if (field711 < 0) {
			field711 = 0;
		} else if (field711 > 255) {
			field711 = 255;
		}

		if (var16 > 0.5D) {
			field713 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field713 = (int) (var14 * var16 * 512.0D);
		}

		if (field713 < 1) {
			field713 = 1;
		}

		field712 = (int) (field713 * var12);
		int var18 = field709 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field710 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field711 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field714 = method285(var18, var19, var20);
	}

	@ObfuscatedName("EHKXAJCO.a(III)I")
	public final int method285(int arg0, int arg1, int arg2) {
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
