package deob;

@ObfuscatedName("HNBDHXHI")
public class HNBDHXHI {

	@ObfuscatedName("HNBDHXHI.e")
	public int field826 = -1;

	@ObfuscatedName("HNBDHXHI.f")
	public boolean field827 = false;

	@ObfuscatedName("HNBDHXHI.g")
	public boolean field828 = true;

	@ObfuscatedName("HNBDHXHI.a")
	public static int field822;

	@ObfuscatedName("HNBDHXHI.d")
	public int field825;

	@ObfuscatedName("HNBDHXHI.h")
	public int field829;

	@ObfuscatedName("HNBDHXHI.i")
	public int field830;

	@ObfuscatedName("HNBDHXHI.j")
	public int field831;

	@ObfuscatedName("HNBDHXHI.k")
	public int field832;

	@ObfuscatedName("HNBDHXHI.l")
	public int field833;

	@ObfuscatedName("HNBDHXHI.m")
	public int field834;

	@ObfuscatedName("HNBDHXHI.c")
	public String field824;

	@ObfuscatedName("HNBDHXHI.b")
	public static HNBDHXHI[] field823;

	@ObfuscatedName("HNBDHXHI.a(LHBJEXSJX;Z)V")
	public static void method349(HBJEXSJX arg0) {
		EYMNCFMK var1 = new EYMNCFMK(arg0.method348("flo.dat", null));
		field822 = var1.method241();
		if (field823 == null) {
			field823 = new HNBDHXHI[field822];
		}

		for (int var2 = 0; var2 < field822; var2++) {
			if (field823[var2] == null) {
				field823[var2] = new HNBDHXHI();
			}

			field823[var2].method350(var1);
		}
	}

	@ObfuscatedName("HNBDHXHI.a(BLEYMNCFMK;)V")
	public void method350(EYMNCFMK arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field825 = arg0.method243();
				method351(field825);
			} else if (var2 == 2) {
				field826 = arg0.method239();
			} else if (var2 == 3) {
				field827 = true;
			} else if (var2 == 5) {
				field828 = false;
			} else if (var2 == 6) {
				field824 = arg0.method246();
			} else if (var2 == 7) {
				int var3 = field829;
				int var4 = field830;
				int var5 = field831;
				int var6 = field832;
				int var7 = arg0.method243();
				method351(var7);
				field829 = var3;
				field830 = var4;
				field831 = var5;
				field832 = var6;
				field833 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("HNBDHXHI.a(ZI)V")
	public void method351(int arg0) {
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
		field829 = (int) (var12 * 256.0D);
		field830 = (int) (var14 * 256.0D);
		field831 = (int) (var16 * 256.0D);

		if (field830 < 0) {
			field830 = 0;
		} else if (field830 > 255) {
			field830 = 255;
		}

		if (field831 < 0) {
			field831 = 0;
		} else if (field831 > 255) {
			field831 = 255;
		}

		if (var16 > 0.5D) {
			field833 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field833 = (int) (var14 * var16 * 512.0D);
		}

		if (field833 < 1) {
			field833 = 1;
		}

		field832 = (int) (field833 * var12);
		int var18 = field829 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field830 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field831 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field834 = method352(var18, var19, var20);
	}

	@ObfuscatedName("HNBDHXHI.a(III)I")
	public final int method352(int arg0, int arg1, int arg2) {
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
