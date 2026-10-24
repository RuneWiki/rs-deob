package deob;

@ObfuscatedName("EPIGJXFD")
public class EPIGJXFD {

	@ObfuscatedName("EPIGJXFD.g")
	public int field624 = -1;

	@ObfuscatedName("EPIGJXFD.h")
	public boolean field625 = false;

	@ObfuscatedName("EPIGJXFD.i")
	public boolean field626 = true;

	@ObfuscatedName("EPIGJXFD.c")
	public static int field620;

	@ObfuscatedName("EPIGJXFD.f")
	public int field623;

	@ObfuscatedName("EPIGJXFD.j")
	public int field627;

	@ObfuscatedName("EPIGJXFD.k")
	public int field628;

	@ObfuscatedName("EPIGJXFD.l")
	public int field629;

	@ObfuscatedName("EPIGJXFD.m")
	public int field630;

	@ObfuscatedName("EPIGJXFD.n")
	public int field631;

	@ObfuscatedName("EPIGJXFD.o")
	public int field632;

	@ObfuscatedName("EPIGJXFD.e")
	public String field622;

	@ObfuscatedName("EPIGJXFD.d")
	public static EPIGJXFD[] field621;

	@ObfuscatedName("EPIGJXFD.a(ILSYUGXMZF;)V")
	public static void method243(SYUGXMZF arg0) {
		KHOMSBHW var1 = new KHOMSBHW(arg0.method551("flo.dat", null));
		field620 = var1.method351();
		if (field621 == null) {
			field621 = new EPIGJXFD[field620];
		}

		for (int var2 = 0; var2 < field620; var2++) {
			if (field621[var2] == null) {
				field621[var2] = new EPIGJXFD();
			}

			field621[var2].method244(var1);
		}
	}

	@ObfuscatedName("EPIGJXFD.a(LKHOMSBHW;I)V")
	public void method244(KHOMSBHW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field623 = arg0.method353();
				method245(field623);
			} else if (var2 == 2) {
				field624 = arg0.method349();
			} else if (var2 == 3) {
				field625 = true;
			} else if (var2 == 5) {
				field626 = false;
			} else if (var2 == 6) {
				field622 = arg0.method356();
			} else if (var2 == 7) {
				int var3 = field627;
				int var4 = field628;
				int var5 = field629;
				int var6 = field630;
				int var7 = arg0.method353();
				method245(var7);
				field627 = var3;
				field628 = var4;
				field629 = var5;
				field630 = var6;
				field631 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("EPIGJXFD.a(BI)V")
	public void method245(int arg0) {
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
		field627 = (int) (var12 * 256.0D);
		field628 = (int) (var14 * 256.0D);
		field629 = (int) (var16 * 256.0D);

		if (field628 < 0) {
			field628 = 0;
		} else if (field628 > 255) {
			field628 = 255;
		}

		if (field629 < 0) {
			field629 = 0;
		} else if (field629 > 255) {
			field629 = 255;
		}

		if (var16 > 0.5D) {
			field631 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field631 = (int) (var14 * var16 * 512.0D);
		}

		if (field631 < 1) {
			field631 = 1;
		}

		field630 = (int) (field631 * var12);
		int var18 = field627 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field628 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field629 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field632 = method246(var18, var19, var20);
	}

	@ObfuscatedName("EPIGJXFD.a(III)I")
	public final int method246(int arg0, int arg1, int arg2) {
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
