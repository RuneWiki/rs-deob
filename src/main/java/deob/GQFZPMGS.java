package deob;

@ObfuscatedName("GQFZPMGS")
public class GQFZPMGS {

	@ObfuscatedName("GQFZPMGS.g")
	public int field650 = -1;

	@ObfuscatedName("GQFZPMGS.h")
	public boolean field651 = false;

	@ObfuscatedName("GQFZPMGS.i")
	public boolean field652 = true;

	@ObfuscatedName("GQFZPMGS.c")
	public static int field646;

	@ObfuscatedName("GQFZPMGS.f")
	public int field649;

	@ObfuscatedName("GQFZPMGS.j")
	public int field653;

	@ObfuscatedName("GQFZPMGS.k")
	public int field654;

	@ObfuscatedName("GQFZPMGS.l")
	public int field655;

	@ObfuscatedName("GQFZPMGS.m")
	public int field656;

	@ObfuscatedName("GQFZPMGS.n")
	public int field657;

	@ObfuscatedName("GQFZPMGS.o")
	public int field658;

	@ObfuscatedName("GQFZPMGS.e")
	public String field648;

	@ObfuscatedName("GQFZPMGS.d")
	public static GQFZPMGS[] field647;

	@ObfuscatedName("GQFZPMGS.a(LBYZSQZUF;Z)V")
	public static void method211(BYZSQZUF arg0) {
		IMUIZRAF var1 = new IMUIZRAF(arg0.method29("flo.dat", null));
		field646 = var1.method240();
		if (field647 == null) {
			field647 = new GQFZPMGS[field646];
		}

		for (int var2 = 0; var2 < field646; var2++) {
			if (field647[var2] == null) {
				field647[var2] = new GQFZPMGS();
			}

			field647[var2].method212(var1);
		}
	}

	@ObfuscatedName("GQFZPMGS.a(ILIMUIZRAF;)V")
	public void method212(IMUIZRAF arg0) {
		while (true) {
			int var2 = arg0.method238();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field649 = arg0.method242();
				method213(field649);
			} else if (var2 == 2) {
				field650 = arg0.method238();
			} else if (var2 == 3) {
				field651 = true;
			} else if (var2 == 5) {
				field652 = false;
			} else if (var2 == 6) {
				field648 = arg0.method245();
			} else if (var2 == 7) {
				int var3 = field653;
				int var4 = field654;
				int var5 = field655;
				int var6 = field656;
				int var7 = arg0.method242();
				method213(var7);
				field653 = var3;
				field654 = var4;
				field655 = var5;
				field656 = var6;
				field657 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("GQFZPMGS.a(II)V")
	public void method213(int arg0) {
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
		field653 = (int) (var12 * 256.0D);
		field654 = (int) (var14 * 256.0D);
		field655 = (int) (var16 * 256.0D);

		if (field654 < 0) {
			field654 = 0;
		} else if (field654 > 255) {
			field654 = 255;
		}

		if (field655 < 0) {
			field655 = 0;
		} else if (field655 > 255) {
			field655 = 255;
		}

		if (var16 > 0.5D) {
			field657 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field657 = (int) (var14 * var16 * 512.0D);
		}

		if (field657 < 1) {
			field657 = 1;
		}

		field656 = (int) (field657 * var12);
		int var18 = field653 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field654 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field655 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field658 = method214(var18, var19, var20);
	}

	@ObfuscatedName("GQFZPMGS.a(III)I")
	public final int method214(int arg0, int arg1, int arg2) {
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
