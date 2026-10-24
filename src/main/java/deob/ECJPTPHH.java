package deob;

@ObfuscatedName("ECJPTPHH")
public class ECJPTPHH {

	@ObfuscatedName("ECJPTPHH.h")
	public int field570 = -1;

	@ObfuscatedName("ECJPTPHH.i")
	public boolean field571 = false;

	@ObfuscatedName("ECJPTPHH.j")
	public boolean field572 = true;

	@ObfuscatedName("ECJPTPHH.d")
	public static int field566;

	@ObfuscatedName("ECJPTPHH.g")
	public int field569;

	@ObfuscatedName("ECJPTPHH.k")
	public int field573;

	@ObfuscatedName("ECJPTPHH.l")
	public int field574;

	@ObfuscatedName("ECJPTPHH.m")
	public int field575;

	@ObfuscatedName("ECJPTPHH.n")
	public int field576;

	@ObfuscatedName("ECJPTPHH.o")
	public int field577;

	@ObfuscatedName("ECJPTPHH.p")
	public int field578;

	@ObfuscatedName("ECJPTPHH.f")
	public String field568;

	@ObfuscatedName("ECJPTPHH.e")
	public static ECJPTPHH[] field567;

	@ObfuscatedName("ECJPTPHH.a(ILRVLWVPJQ;)V")
	public static void method180(RVLWVPJQ arg0) {
		UAWAYCTK var1 = new UAWAYCTK(arg0.method424("flo.dat", null));
		field566 = var1.method457();
		if (field567 == null) {
			field567 = new ECJPTPHH[field566];
		}

		for (int var2 = 0; var2 < field566; var2++) {
			if (field567[var2] == null) {
				field567[var2] = new ECJPTPHH();
			}

			field567[var2].method181(var1);
		}
	}

	@ObfuscatedName("ECJPTPHH.a(ILUAWAYCTK;)V")
	public void method181(UAWAYCTK arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field569 = arg0.method459();
				method182(field569);
			} else if (var2 == 2) {
				field570 = arg0.method455();
			} else if (var2 == 3) {
				field571 = true;
			} else if (var2 == 5) {
				field572 = false;
			} else if (var2 == 6) {
				field568 = arg0.method462();
			} else if (var2 == 7) {
				int var3 = field573;
				int var4 = field574;
				int var5 = field575;
				int var6 = field576;
				int var7 = arg0.method459();
				method182(var7);
				field573 = var3;
				field574 = var4;
				field575 = var5;
				field576 = var6;
				field577 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("ECJPTPHH.a(II)V")
	public void method182(int arg0) {
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
		field573 = (int) (var12 * 256.0D);
		field574 = (int) (var14 * 256.0D);
		field575 = (int) (var16 * 256.0D);

		if (field574 < 0) {
			field574 = 0;
		} else if (field574 > 255) {
			field574 = 255;
		}

		if (field575 < 0) {
			field575 = 0;
		} else if (field575 > 255) {
			field575 = 255;
		}

		if (var16 > 0.5D) {
			field577 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field577 = (int) (var14 * var16 * 512.0D);
		}

		if (field577 < 1) {
			field577 = 1;
		}

		field576 = (int) (field577 * var12);
		int var18 = field573 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field574 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field575 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field578 = method183(var18, var19, var20);
	}

	@ObfuscatedName("ECJPTPHH.a(III)I")
	public final int method183(int arg0, int arg1, int arg2) {
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
