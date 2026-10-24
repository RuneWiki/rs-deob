package deob;

@ObfuscatedName("KJOXMCRE")
public class KJOXMCRE {

	@ObfuscatedName("KJOXMCRE.f")
	public int field908 = -1;

	@ObfuscatedName("KJOXMCRE.g")
	public boolean field909 = false;

	@ObfuscatedName("KJOXMCRE.h")
	public boolean field910 = true;

	@ObfuscatedName("KJOXMCRE.b")
	public static int field904;

	@ObfuscatedName("KJOXMCRE.e")
	public int field907;

	@ObfuscatedName("KJOXMCRE.i")
	public int field911;

	@ObfuscatedName("KJOXMCRE.j")
	public int field912;

	@ObfuscatedName("KJOXMCRE.k")
	public int field913;

	@ObfuscatedName("KJOXMCRE.l")
	public int field914;

	@ObfuscatedName("KJOXMCRE.m")
	public int field915;

	@ObfuscatedName("KJOXMCRE.n")
	public int field916;

	@ObfuscatedName("KJOXMCRE.d")
	public String field906;

	@ObfuscatedName("KJOXMCRE.c")
	public static KJOXMCRE[] field905;

	@ObfuscatedName("KJOXMCRE.a(LMNPBQFWE;B)V")
	public static void method355(MNPBQFWE arg0) {
		BJPWOXRJ var1 = new BJPWOXRJ(arg0.method429("flo.dat", null));
		field904 = var1.method17();
		if (field905 == null) {
			field905 = new KJOXMCRE[field904];
		}

		for (int var2 = 0; var2 < field904; var2++) {
			if (field905[var2] == null) {
				field905[var2] = new KJOXMCRE();
			}

			field905[var2].method356(var1);
		}
	}

	@ObfuscatedName("KJOXMCRE.a(ILBJPWOXRJ;)V")
	public void method356(BJPWOXRJ arg0) {
		while (true) {
			int var2 = arg0.method15();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field907 = arg0.method19();
				method357(field907);
			} else if (var2 == 2) {
				field908 = arg0.method15();
			} else if (var2 == 3) {
				field909 = true;
			} else if (var2 == 5) {
				field910 = false;
			} else if (var2 == 6) {
				field906 = arg0.method22();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("KJOXMCRE.a(IZ)V")
	public void method357(int arg0) {
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
		field911 = (int) (var12 * 256.0D);
		field912 = (int) (var14 * 256.0D);
		field913 = (int) (var16 * 256.0D);

		if (field912 < 0) {
			field912 = 0;
		} else if (field912 > 255) {
			field912 = 255;
		}

		if (field913 < 0) {
			field913 = 0;
		} else if (field913 > 255) {
			field913 = 255;
		}

		if (var16 > 0.5D) {
			field915 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field915 = (int) (var14 * var16 * 512.0D);
		}

		if (field915 < 1) {
			field915 = 1;
		}

		field914 = (int) (field915 * var12);
		int var18 = field911 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field912 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field913 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field916 = method358(var18, var19, var20);
	}

	@ObfuscatedName("KJOXMCRE.a(III)I")
	public final int method358(int arg0, int arg1, int arg2) {
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
