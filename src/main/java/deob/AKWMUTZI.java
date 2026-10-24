package deob;

@ObfuscatedName("AKWMUTZI")
public class AKWMUTZI {

	@ObfuscatedName("AKWMUTZI.f")
	public int field31 = -1;

	@ObfuscatedName("AKWMUTZI.g")
	public boolean field32 = false;

	@ObfuscatedName("AKWMUTZI.h")
	public boolean field33 = true;

	@ObfuscatedName("AKWMUTZI.b")
	public static int field27;

	@ObfuscatedName("AKWMUTZI.e")
	public int field30;

	@ObfuscatedName("AKWMUTZI.i")
	public int field34;

	@ObfuscatedName("AKWMUTZI.j")
	public int field35;

	@ObfuscatedName("AKWMUTZI.k")
	public int field36;

	@ObfuscatedName("AKWMUTZI.l")
	public int field37;

	@ObfuscatedName("AKWMUTZI.m")
	public int field38;

	@ObfuscatedName("AKWMUTZI.n")
	public int field39;

	@ObfuscatedName("AKWMUTZI.d")
	public String field29;

	@ObfuscatedName("AKWMUTZI.c")
	public static AKWMUTZI[] field28;

	@ObfuscatedName("AKWMUTZI.a(LFUZJMGZB;I)V")
	public static void method3(FUZJMGZB arg0) {
		LBBVYYXO var1 = new LBBVYYXO(arg0.method277("flo.dat", null));
		field27 = var1.method371();
		if (field28 == null) {
			field28 = new AKWMUTZI[field27];
		}

		for (int var2 = 0; var2 < field27; var2++) {
			if (field28[var2] == null) {
				field28[var2] = new AKWMUTZI();
			}

			field28[var2].method4(var1);
		}
	}

	@ObfuscatedName("AKWMUTZI.a(LLBBVYYXO;B)V")
	public void method4(LBBVYYXO arg0) {
		while (true) {
			int var2 = arg0.method369();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field30 = arg0.method373();
				method5(field30);
			} else if (var2 == 2) {
				field31 = arg0.method369();
			} else if (var2 == 3) {
				field32 = true;
			} else if (var2 == 5) {
				field33 = false;
			} else if (var2 == 6) {
				field29 = arg0.method376();
			} else if (var2 == 7) {
				int var3 = field34;
				int var4 = field35;
				int var5 = field36;
				int var6 = field37;
				int var7 = arg0.method373();
				method5(var7);
				field34 = var3;
				field35 = var4;
				field36 = var5;
				field37 = var6;
				field38 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("AKWMUTZI.a(II)V")
	public void method5(int arg0) {
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
		field34 = (int) (var12 * 256.0D);
		field35 = (int) (var14 * 256.0D);
		field36 = (int) (var16 * 256.0D);

		if (field35 < 0) {
			field35 = 0;
		} else if (field35 > 255) {
			field35 = 255;
		}

		if (field36 < 0) {
			field36 = 0;
		} else if (field36 > 255) {
			field36 = 255;
		}

		if (var16 > 0.5D) {
			field38 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field38 = (int) (var14 * var16 * 512.0D);
		}

		if (field38 < 1) {
			field38 = 1;
		}

		field37 = (int) (field38 * var12);
		int var18 = field34 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field35 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field36 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field39 = method6(var18, var19, var20);
	}

	@ObfuscatedName("AKWMUTZI.a(III)I")
	public final int method6(int arg0, int arg1, int arg2) {
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
