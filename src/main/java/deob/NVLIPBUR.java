package deob;

@ObfuscatedName("NVLIPBUR")
public class NVLIPBUR {

	@ObfuscatedName("NVLIPBUR.h")
	public int field1118 = -1;

	@ObfuscatedName("NVLIPBUR.i")
	public boolean field1119 = false;

	@ObfuscatedName("NVLIPBUR.j")
	public boolean field1120 = true;

	@ObfuscatedName("NVLIPBUR.d")
	public static int field1114;

	@ObfuscatedName("NVLIPBUR.g")
	public int field1117;

	@ObfuscatedName("NVLIPBUR.k")
	public int field1121;

	@ObfuscatedName("NVLIPBUR.l")
	public int field1122;

	@ObfuscatedName("NVLIPBUR.m")
	public int field1123;

	@ObfuscatedName("NVLIPBUR.n")
	public int field1124;

	@ObfuscatedName("NVLIPBUR.o")
	public int field1125;

	@ObfuscatedName("NVLIPBUR.p")
	public int field1126;

	@ObfuscatedName("NVLIPBUR.f")
	public String field1116;

	@ObfuscatedName("NVLIPBUR.e")
	public static NVLIPBUR[] field1115;

	@ObfuscatedName("NVLIPBUR.a(ZLMJLXHQTQ;)V")
	public static void method324(MJLXHQTQ arg0) {
		XGRGMPUQ var1 = new XGRGMPUQ(arg0.method317("flo.dat", null));
		field1114 = var1.method467();
		if (field1115 == null) {
			field1115 = new NVLIPBUR[field1114];
		}

		for (int var2 = 0; var2 < field1114; var2++) {
			if (field1115[var2] == null) {
				field1115[var2] = new NVLIPBUR();
			}

			field1115[var2].method325(var1);
		}
	}

	@ObfuscatedName("NVLIPBUR.a(ZLXGRGMPUQ;)V")
	public void method325(XGRGMPUQ arg0) {
		while (true) {
			int var2 = arg0.method465();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1117 = arg0.method469();
				method326(field1117);
			} else if (var2 == 2) {
				field1118 = arg0.method465();
			} else if (var2 == 3) {
				field1119 = true;
			} else if (var2 == 5) {
				field1120 = false;
			} else if (var2 == 6) {
				field1116 = arg0.method472();
			} else if (var2 == 7) {
				int var3 = field1121;
				int var4 = field1122;
				int var5 = field1123;
				int var6 = field1124;
				int var7 = arg0.method469();
				method326(var7);
				field1121 = var3;
				field1122 = var4;
				field1123 = var5;
				field1124 = var6;
				field1125 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("NVLIPBUR.a(II)V")
	public void method326(int arg0) {
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
		field1121 = (int) (var12 * 256.0D);
		field1122 = (int) (var14 * 256.0D);
		field1123 = (int) (var16 * 256.0D);

		if (field1122 < 0) {
			field1122 = 0;
		} else if (field1122 > 255) {
			field1122 = 255;
		}

		if (field1123 < 0) {
			field1123 = 0;
		} else if (field1123 > 255) {
			field1123 = 255;
		}

		if (var16 > 0.5D) {
			field1125 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1125 = (int) (var14 * var16 * 512.0D);
		}

		if (field1125 < 1) {
			field1125 = 1;
		}

		field1124 = (int) (field1125 * var12);
		int var18 = field1121 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1122 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1123 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1126 = method327(var18, var19, var20);
	}

	@ObfuscatedName("NVLIPBUR.a(III)I")
	public final int method327(int arg0, int arg1, int arg2) {
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
