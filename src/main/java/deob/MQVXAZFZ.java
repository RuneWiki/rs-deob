package deob;

@ObfuscatedName("MQVXAZFZ")
public class MQVXAZFZ {

	@ObfuscatedName("MQVXAZFZ.g")
	public int field914 = -1;

	@ObfuscatedName("MQVXAZFZ.h")
	public boolean field915 = false;

	@ObfuscatedName("MQVXAZFZ.i")
	public boolean field916 = true;

	@ObfuscatedName("MQVXAZFZ.c")
	public static int field910;

	@ObfuscatedName("MQVXAZFZ.f")
	public int field913;

	@ObfuscatedName("MQVXAZFZ.j")
	public int field917;

	@ObfuscatedName("MQVXAZFZ.k")
	public int field918;

	@ObfuscatedName("MQVXAZFZ.l")
	public int field919;

	@ObfuscatedName("MQVXAZFZ.m")
	public int field920;

	@ObfuscatedName("MQVXAZFZ.n")
	public int field921;

	@ObfuscatedName("MQVXAZFZ.o")
	public int field922;

	@ObfuscatedName("MQVXAZFZ.e")
	public String field912;

	@ObfuscatedName("MQVXAZFZ.d")
	public static MQVXAZFZ[] field911;

	@ObfuscatedName("MQVXAZFZ.a(ILQKFGLETG;)V")
	public static void method358(QKFGLETG arg0) {
		XJCNBMKS var1 = new XJCNBMKS(arg0.method402("flo.dat", null));
		field910 = var1.method536();
		if (field911 == null) {
			field911 = new MQVXAZFZ[field910];
		}

		for (int var2 = 0; var2 < field910; var2++) {
			if (field911[var2] == null) {
				field911[var2] = new MQVXAZFZ();
			}

			field911[var2].method359(var1);
		}
	}

	@ObfuscatedName("MQVXAZFZ.a(BLXJCNBMKS;)V")
	public void method359(XJCNBMKS arg0) {
		while (true) {
			int var2 = arg0.method534();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field913 = arg0.method538();
				method360(field913);
			} else if (var2 == 2) {
				field914 = arg0.method534();
			} else if (var2 == 3) {
				field915 = true;
			} else if (var2 == 5) {
				field916 = false;
			} else if (var2 == 6) {
				field912 = arg0.method541();
			} else if (var2 == 7) {
				int var3 = field917;
				int var4 = field918;
				int var5 = field919;
				int var6 = field920;
				int var7 = arg0.method538();
				method360(var7);
				field917 = var3;
				field918 = var4;
				field919 = var5;
				field920 = var6;
				field921 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("MQVXAZFZ.a(BI)V")
	public void method360(int arg0) {
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
		field917 = (int) (var12 * 256.0D);
		field918 = (int) (var14 * 256.0D);
		field919 = (int) (var16 * 256.0D);

		if (field918 < 0) {
			field918 = 0;
		} else if (field918 > 255) {
			field918 = 255;
		}

		if (field919 < 0) {
			field919 = 0;
		} else if (field919 > 255) {
			field919 = 255;
		}

		if (var16 > 0.5D) {
			field921 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field921 = (int) (var14 * var16 * 512.0D);
		}

		if (field921 < 1) {
			field921 = 1;
		}

		field920 = (int) (field921 * var12);
		int var18 = field917 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field918 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field919 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field922 = method361(var18, var19, var20);
	}

	@ObfuscatedName("MQVXAZFZ.a(III)I")
	public final int method361(int arg0, int arg1, int arg2) {
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
