package deob;

@ObfuscatedName("OMGTLVPK")
public class OMGTLVPK {

	@ObfuscatedName("OMGTLVPK.f")
	public int field905 = -1;

	@ObfuscatedName("OMGTLVPK.g")
	public boolean field906 = false;

	@ObfuscatedName("OMGTLVPK.h")
	public boolean field907 = true;

	@ObfuscatedName("OMGTLVPK.b")
	public static int field901;

	@ObfuscatedName("OMGTLVPK.e")
	public int field904;

	@ObfuscatedName("OMGTLVPK.i")
	public int field908;

	@ObfuscatedName("OMGTLVPK.j")
	public int field909;

	@ObfuscatedName("OMGTLVPK.k")
	public int field910;

	@ObfuscatedName("OMGTLVPK.l")
	public int field911;

	@ObfuscatedName("OMGTLVPK.m")
	public int field912;

	@ObfuscatedName("OMGTLVPK.n")
	public int field913;

	@ObfuscatedName("OMGTLVPK.d")
	public String field903;

	@ObfuscatedName("OMGTLVPK.c")
	public static OMGTLVPK[] field902;

	@ObfuscatedName("OMGTLVPK.a(BLRPFMUSNN;)V")
	public static void method381(RPFMUSNN arg0) {
		WNCFPLWV var1 = new WNCFPLWV(arg0.method414("flo.dat", null));
		field901 = var1.method504();
		if (field902 == null) {
			field902 = new OMGTLVPK[field901];
		}

		for (int var2 = 0; var2 < field901; var2++) {
			if (field902[var2] == null) {
				field902[var2] = new OMGTLVPK();
			}

			field902[var2].method382(var1);
		}
	}

	@ObfuscatedName("OMGTLVPK.a(ILWNCFPLWV;)V")
	public void method382(WNCFPLWV arg0) {
		while (true) {
			int var2 = arg0.method502();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field904 = arg0.method506();
				method383(field904);
			} else if (var2 == 2) {
				field905 = arg0.method502();
			} else if (var2 == 3) {
				field906 = true;
			} else if (var2 == 5) {
				field907 = false;
			} else if (var2 == 6) {
				field903 = arg0.method509();
			} else if (var2 == 7) {
				int var3 = field908;
				int var4 = field909;
				int var5 = field910;
				int var6 = field911;
				int var7 = arg0.method506();
				method383(var7);
				field908 = var3;
				field909 = var4;
				field910 = var5;
				field911 = var6;
				field912 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("OMGTLVPK.a(II)V")
	public void method383(int arg0) {
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
		field908 = (int) (var12 * 256.0D);
		field909 = (int) (var14 * 256.0D);
		field910 = (int) (var16 * 256.0D);

		if (field909 < 0) {
			field909 = 0;
		} else if (field909 > 255) {
			field909 = 255;
		}

		if (field910 < 0) {
			field910 = 0;
		} else if (field910 > 255) {
			field910 = 255;
		}

		if (var16 > 0.5D) {
			field912 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field912 = (int) (var14 * var16 * 512.0D);
		}

		if (field912 < 1) {
			field912 = 1;
		}

		field911 = (int) (field912 * var12);
		int var18 = field908 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field909 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field910 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field913 = method384(var18, var19, var20);
	}

	@ObfuscatedName("OMGTLVPK.a(III)I")
	public final int method384(int arg0, int arg1, int arg2) {
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
