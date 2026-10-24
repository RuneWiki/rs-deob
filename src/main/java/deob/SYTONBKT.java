package deob;

@ObfuscatedName("SYTONBKT")
public class SYTONBKT {

	@ObfuscatedName("SYTONBKT.e")
	public int field1173 = -1;

	@ObfuscatedName("SYTONBKT.f")
	public boolean field1174 = false;

	@ObfuscatedName("SYTONBKT.g")
	public boolean field1175 = true;

	@ObfuscatedName("SYTONBKT.a")
	public static int field1169;

	@ObfuscatedName("SYTONBKT.d")
	public int field1172;

	@ObfuscatedName("SYTONBKT.h")
	public int field1176;

	@ObfuscatedName("SYTONBKT.i")
	public int field1177;

	@ObfuscatedName("SYTONBKT.j")
	public int field1178;

	@ObfuscatedName("SYTONBKT.k")
	public int field1179;

	@ObfuscatedName("SYTONBKT.l")
	public int field1180;

	@ObfuscatedName("SYTONBKT.m")
	public int field1181;

	@ObfuscatedName("SYTONBKT.c")
	public String field1171;

	@ObfuscatedName("SYTONBKT.b")
	public static SYTONBKT[] field1170;

	@ObfuscatedName("SYTONBKT.a(ILBBMKAXRK;)V")
	public static void method449(BBMKAXRK arg0) {
		EILHLJCE var1 = new EILHLJCE(arg0.method30("flo.dat", null));
		field1169 = var1.method226();
		if (field1170 == null) {
			field1170 = new SYTONBKT[field1169];
		}

		for (int var2 = 0; var2 < field1169; var2++) {
			if (field1170[var2] == null) {
				field1170[var2] = new SYTONBKT();
			}

			field1170[var2].method450(var1);
		}
	}

	@ObfuscatedName("SYTONBKT.a(LEILHLJCE;B)V")
	public void method450(EILHLJCE arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1172 = arg0.method228();
				method451(field1172);
			} else if (var2 == 2) {
				field1173 = arg0.method224();
			} else if (var2 == 3) {
				field1174 = true;
			} else if (var2 == 5) {
				field1175 = false;
			} else if (var2 == 6) {
				field1171 = arg0.method231();
			} else if (var2 == 7) {
				int var3 = field1176;
				int var4 = field1177;
				int var5 = field1178;
				int var6 = field1179;
				int var7 = arg0.method228();
				method451(var7);
				field1176 = var3;
				field1177 = var4;
				field1178 = var5;
				field1179 = var6;
				field1180 = var6;
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("SYTONBKT.a(II)V")
	public void method451(int arg0) {
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
		field1176 = (int) (var12 * 256.0D);
		field1177 = (int) (var14 * 256.0D);
		field1178 = (int) (var16 * 256.0D);

		if (field1177 < 0) {
			field1177 = 0;
		} else if (field1177 > 255) {
			field1177 = 255;
		}

		if (field1178 < 0) {
			field1178 = 0;
		} else if (field1178 > 255) {
			field1178 = 255;
		}

		if (var16 > 0.5D) {
			field1180 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1180 = (int) (var14 * var16 * 512.0D);
		}

		if (field1180 < 1) {
			field1180 = 1;
		}

		field1179 = (int) (field1180 * var12);
		int var18 = field1176 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1177 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1178 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1181 = method452(var18, var19, var20);
	}

	@ObfuscatedName("SYTONBKT.a(III)I")
	public final int method452(int arg0, int arg1, int arg2) {
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
