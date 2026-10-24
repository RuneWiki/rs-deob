package deob;

@ObfuscatedName("QXFWPOFL")
public class QXFWPOFL {

	@ObfuscatedName("QXFWPOFL.f")
	public int field1131 = -1;

	@ObfuscatedName("QXFWPOFL.g")
	public boolean field1132 = false;

	@ObfuscatedName("QXFWPOFL.h")
	public boolean field1133 = true;

	@ObfuscatedName("QXFWPOFL.b")
	public static int field1127;

	@ObfuscatedName("QXFWPOFL.e")
	public int field1130;

	@ObfuscatedName("QXFWPOFL.i")
	public int field1134;

	@ObfuscatedName("QXFWPOFL.j")
	public int field1135;

	@ObfuscatedName("QXFWPOFL.k")
	public int field1136;

	@ObfuscatedName("QXFWPOFL.l")
	public int field1137;

	@ObfuscatedName("QXFWPOFL.m")
	public int field1138;

	@ObfuscatedName("QXFWPOFL.n")
	public int field1139;

	@ObfuscatedName("QXFWPOFL.d")
	public String field1129;

	@ObfuscatedName("QXFWPOFL.c")
	public static QXFWPOFL[] field1128;

	@ObfuscatedName("QXFWPOFL.a(ILTXPLZUUI;)V")
	public static void method450(TXPLZUUI arg0) {
		PKHWFJLM var1 = new PKHWFJLM(arg0.method506("flo.dat", null));
		field1127 = var1.method332();
		if (field1128 == null) {
			field1128 = new QXFWPOFL[field1127];
		}

		for (int var2 = 0; var2 < field1127; var2++) {
			if (field1128[var2] == null) {
				field1128[var2] = new QXFWPOFL();
			}

			field1128[var2].method451(var1);
		}
	}

	@ObfuscatedName("QXFWPOFL.a(LPKHWFJLM;Z)V")
	public void method451(PKHWFJLM arg0) {
		while (true) {
			int var2 = arg0.method330();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1130 = arg0.method334();
				method452(field1130);
			} else if (var2 == 2) {
				field1131 = arg0.method330();
			} else if (var2 == 3) {
				field1132 = true;
			} else if (var2 == 5) {
				field1133 = false;
			} else if (var2 == 6) {
				field1129 = arg0.method337();
			} else if (var2 == 7) {
				int var3 = field1134;
				int var4 = field1135;
				int var5 = field1136;
				int var6 = field1137;
				int var7 = arg0.method334();
				method452(var7);
				field1134 = var3;
				field1135 = var4;
				field1136 = var5;
				field1137 = var6;
				field1138 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("QXFWPOFL.a(IB)V")
	public void method452(int arg0) {
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
		field1134 = (int) (var12 * 256.0D);
		field1135 = (int) (var14 * 256.0D);
		field1136 = (int) (var16 * 256.0D);

		if (field1135 < 0) {
			field1135 = 0;
		} else if (field1135 > 255) {
			field1135 = 255;
		}

		if (field1136 < 0) {
			field1136 = 0;
		} else if (field1136 > 255) {
			field1136 = 255;
		}

		if (var16 > 0.5D) {
			field1138 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1138 = (int) (var14 * var16 * 512.0D);
		}

		if (field1138 < 1) {
			field1138 = 1;
		}

		field1137 = (int) (field1138 * var12);
		int var18 = field1134 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1135 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1136 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1139 = method453(var18, var19, var20);
	}

	@ObfuscatedName("QXFWPOFL.a(III)I")
	public final int method453(int arg0, int arg1, int arg2) {
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
