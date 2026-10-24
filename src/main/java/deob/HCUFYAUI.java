package deob;

@ObfuscatedName("HCUFYAUI")
public class HCUFYAUI {

	@ObfuscatedName("HCUFYAUI.f")
	public int field627 = -1;

	@ObfuscatedName("HCUFYAUI.g")
	public boolean field628 = false;

	@ObfuscatedName("HCUFYAUI.h")
	public boolean field629 = true;

	@ObfuscatedName("HCUFYAUI.b")
	public static int field623;

	@ObfuscatedName("HCUFYAUI.e")
	public int field626;

	@ObfuscatedName("HCUFYAUI.i")
	public int field630;

	@ObfuscatedName("HCUFYAUI.j")
	public int field631;

	@ObfuscatedName("HCUFYAUI.k")
	public int field632;

	@ObfuscatedName("HCUFYAUI.l")
	public int field633;

	@ObfuscatedName("HCUFYAUI.m")
	public int field634;

	@ObfuscatedName("HCUFYAUI.n")
	public int field635;

	@ObfuscatedName("HCUFYAUI.d")
	public String field625;

	@ObfuscatedName("HCUFYAUI.c")
	public static HCUFYAUI[] field624;

	@ObfuscatedName("HCUFYAUI.a(LFNOQZAYQ;I)V")
	public static void method263(FNOQZAYQ arg0) {
		DNRIFKTO var1 = new DNRIFKTO(arg0.method246("flo.dat", null));
		field623 = var1.method191();
		if (field624 == null) {
			field624 = new HCUFYAUI[field623];
		}

		for (int var2 = 0; var2 < field623; var2++) {
			if (field624[var2] == null) {
				field624[var2] = new HCUFYAUI();
			}

			field624[var2].method264(var1);
		}
	}

	@ObfuscatedName("HCUFYAUI.a(LDNRIFKTO;I)V")
	public void method264(DNRIFKTO arg0) {
		while (true) {
			int var2 = arg0.method189();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field626 = arg0.method193();
				method265(field626);
			} else if (var2 == 2) {
				field627 = arg0.method189();
			} else if (var2 == 3) {
				field628 = true;
			} else if (var2 == 5) {
				field629 = false;
			} else if (var2 == 6) {
				field625 = arg0.method196();
			} else if (var2 == 7) {
				int var3 = field630;
				int var4 = field631;
				int var5 = field632;
				int var6 = field633;
				int var7 = arg0.method193();
				method265(var7);
				field630 = var3;
				field631 = var4;
				field632 = var5;
				field633 = var6;
				field634 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("HCUFYAUI.a(II)V")
	public void method265(int arg0) {
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
		field630 = (int) (var12 * 256.0D);
		field631 = (int) (var14 * 256.0D);
		field632 = (int) (var16 * 256.0D);

		if (field631 < 0) {
			field631 = 0;
		} else if (field631 > 255) {
			field631 = 255;
		}

		if (field632 < 0) {
			field632 = 0;
		} else if (field632 > 255) {
			field632 = 255;
		}

		if (var16 > 0.5D) {
			field634 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field634 = (int) (var14 * var16 * 512.0D);
		}

		if (field634 < 1) {
			field634 = 1;
		}

		field633 = (int) (field634 * var12);
		int var18 = field630 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field631 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field632 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field635 = method266(var18, var19, var20);
	}

	@ObfuscatedName("HCUFYAUI.a(III)I")
	public final int method266(int arg0, int arg1, int arg2) {
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
