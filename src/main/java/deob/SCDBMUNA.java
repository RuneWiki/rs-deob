package deob;

@ObfuscatedName("SCDBMUNA")
public class SCDBMUNA {

	@ObfuscatedName("SCDBMUNA.a")
	public static int field1214;

	@ObfuscatedName("SCDBMUNA.e")
	public int field1218 = -1;

	@ObfuscatedName("SCDBMUNA.f")
	public boolean field1219 = false;

	@ObfuscatedName("SCDBMUNA.g")
	public boolean field1220 = true;

	@ObfuscatedName("SCDBMUNA.d")
	public int field1217;

	@ObfuscatedName("SCDBMUNA.h")
	public int field1221;

	@ObfuscatedName("SCDBMUNA.i")
	public int field1222;

	@ObfuscatedName("SCDBMUNA.j")
	public int field1223;

	@ObfuscatedName("SCDBMUNA.k")
	public int field1224;

	@ObfuscatedName("SCDBMUNA.l")
	public int field1225;

	@ObfuscatedName("SCDBMUNA.m")
	public int field1226;

	@ObfuscatedName("SCDBMUNA.c")
	public String field1216;

	@ObfuscatedName("SCDBMUNA.b")
	public static SCDBMUNA[] field1215;

	@ObfuscatedName("SCDBMUNA.a(LDYBMLHQM;Z)V")
	public static void method475(DYBMLHQM arg0) {
		INLHDAGO var1 = new INLHDAGO(arg0.method248("flo.dat", null));
		field1214 = var1.method310();
		if (field1215 == null) {
			field1215 = new SCDBMUNA[field1214];
		}

		for (int var2 = 0; var2 < field1214; var2++) {
			if (field1215[var2] == null) {
				field1215[var2] = new SCDBMUNA();
			}

			field1215[var2].method476(var1);
		}
	}

	@ObfuscatedName("SCDBMUNA.a(ILINLHDAGO;)V")
	public void method476(INLHDAGO arg0) {
		while (true) {
			int var2 = arg0.method308();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1217 = arg0.method312();
				method477(field1217);
			} else if (var2 == 2) {
				field1218 = arg0.method308();
			} else if (var2 == 3) {
				field1219 = true;
			} else if (var2 == 5) {
				field1220 = false;
			} else if (var2 == 6) {
				field1216 = arg0.method315();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("SCDBMUNA.a(II)V")
	public void method477(int arg0) {
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
		field1221 = (int) (var12 * 256.0D);
		field1222 = (int) (var14 * 256.0D);
		field1223 = (int) (var16 * 256.0D);

		if (field1222 < 0) {
			field1222 = 0;
		} else if (field1222 > 255) {
			field1222 = 255;
		}

		if (field1223 < 0) {
			field1223 = 0;
		} else if (field1223 > 255) {
			field1223 = 255;
		}

		if (var16 > 0.5D) {
			field1225 = (int) ((1.0D - var16) * var14 * 512.0D);
		} else {
			field1225 = (int) (var14 * var16 * 512.0D);
		}

		if (field1225 < 1) {
			field1225 = 1;
		}

		field1224 = (int) (field1225 * var12);
		int var18 = field1221 + (int) (Math.random() * 16.0D) - 8;
		if (var18 < 0) {
			var18 = 0;
		} else if (var18 > 255) {
			var18 = 255;
		}

		int var19 = field1222 + (int) (Math.random() * 48.0D) - 24;
		if (var19 < 0) {
			var19 = 0;
		} else if (var19 > 255) {
			var19 = 255;
		}

		int var20 = field1223 + (int) (Math.random() * 48.0D) - 24;
		if (var20 < 0) {
			var20 = 0;
		} else if (var20 > 255) {
			var20 = 255;
		}

		field1226 = method478(var18, var19, var20);
	}

	@ObfuscatedName("SCDBMUNA.a(III)I")
	public final int method478(int arg0, int arg1, int arg2) {
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
