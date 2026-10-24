package deob;

@ObfuscatedName("RSGRNXCC")
public class RSGRNXCC {

	@ObfuscatedName("RSGRNXCC.f")
	public int field1117 = -1;

	@ObfuscatedName("RSGRNXCC.g")
	public boolean field1118 = false;

	@ObfuscatedName("RSGRNXCC.h")
	public boolean field1119 = true;

	@ObfuscatedName("RSGRNXCC.b")
	public static int field1113;

	@ObfuscatedName("RSGRNXCC.e")
	public int field1116;

	@ObfuscatedName("RSGRNXCC.i")
	public int field1120;

	@ObfuscatedName("RSGRNXCC.j")
	public int field1121;

	@ObfuscatedName("RSGRNXCC.k")
	public int field1122;

	@ObfuscatedName("RSGRNXCC.l")
	public int field1123;

	@ObfuscatedName("RSGRNXCC.m")
	public int field1124;

	@ObfuscatedName("RSGRNXCC.n")
	public int field1125;

	@ObfuscatedName("RSGRNXCC.d")
	public String field1115;

	@ObfuscatedName("RSGRNXCC.c")
	public static RSGRNXCC[] field1114;

	@ObfuscatedName("RSGRNXCC.a(ILMAARFNGV;)V")
	public static void method390(MAARFNGV arg0) {
		EMWAMCXW var1 = new EMWAMCXW(arg0.method332("flo.dat", null));
		field1113 = var1.method219();
		if (field1114 == null) {
			field1114 = new RSGRNXCC[field1113];
		}

		for (int var2 = 0; var2 < field1113; var2++) {
			if (field1114[var2] == null) {
				field1114[var2] = new RSGRNXCC();
			}

			field1114[var2].method391(var1);
		}
	}

	@ObfuscatedName("RSGRNXCC.a(ILEMWAMCXW;)V")
	public void method391(EMWAMCXW arg0) {
		while (true) {
			int var2 = arg0.method217();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1116 = arg0.method221();
				method392(field1116);
			} else if (var2 == 2) {
				field1117 = arg0.method217();
			} else if (var2 == 3) {
				field1118 = true;
			} else if (var2 == 5) {
				field1119 = false;
			} else if (var2 == 6) {
				field1115 = arg0.method224();
			} else if (var2 == 7) {
				int var3 = field1120;
				int var4 = field1121;
				int var5 = field1122;
				int var6 = field1123;
				int var7 = arg0.method221();
				method392(var7);
				field1120 = var3;
				field1121 = var4;
				field1122 = var5;
				field1123 = var6;
				field1124 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("RSGRNXCC.a(IB)V")
	public void method392(int arg0) {
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
		field1120 = (int) (var12 * 256.0D);
		field1121 = (int) (var14 * 256.0D);
		field1122 = (int) (var16 * 256.0D);

		if (field1121 < 0) {
			field1121 = 0;
		} else if (field1121 > 255) {
			field1121 = 255;
		}

		if (field1122 < 0) {
			field1122 = 0;
		} else if (field1122 > 255) {
			field1122 = 255;
		}

		if (var16 > 0.5D) {
			field1124 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1124 = (int) (var14 * var16 * 512.0D);
		}

		if (field1124 < 1) {
			field1124 = 1;
		}

		field1123 = (int) (field1124 * var12);
		int var18 = field1120 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1121 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1122 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1125 = method393(var18, var19, var20);
	}

	@ObfuscatedName("RSGRNXCC.a(III)I")
	public final int method393(int arg0, int arg1, int arg2) {
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
