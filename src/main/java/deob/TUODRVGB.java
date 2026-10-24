package deob;

@ObfuscatedName("TUODRVGB")
public class TUODRVGB {

	@ObfuscatedName("TUODRVGB.g")
	public int[] field1266 = new int[2];

	@ObfuscatedName("TUODRVGB.h")
	public int[][][] field1267 = new int[2][2][4];

	@ObfuscatedName("TUODRVGB.i")
	public int[][][] field1268 = new int[2][2][4];

	@ObfuscatedName("TUODRVGB.j")
	public int[] field1269 = new int[2];

	@ObfuscatedName("TUODRVGB.k")
	public static float[][] field1270 = new float[2][8];

	@ObfuscatedName("TUODRVGB.l")
	public static int[][] field1271 = new int[2][8];

	@ObfuscatedName("TUODRVGB.m")
	public static float field1272;

	@ObfuscatedName("TUODRVGB.n")
	public static int field1273;

	@ObfuscatedName("TUODRVGB.a(BIIF)F")
	public float method443(int arg0, int arg1, float arg2) {
		float var4 = (field1268[arg1][1][arg0] - field1268[arg1][0][arg0]) * arg2 + field1268[arg1][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("TUODRVGB.a(FI)F")
	public float method444(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("TUODRVGB.a(FBII)F")
	public float method445(float arg0, int arg1, int arg2) {
		float var4 = (field1267[arg1][1][arg2] - field1267[arg1][0][arg2]) * arg0 + field1267[arg1][0][arg2];
		var4 *= 1.2207031E-4F;
		return method444(var4);
	}

	@ObfuscatedName("TUODRVGB.a(IIF)I")
	public int method446(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1269[1] - field1269[0]) * arg1 + field1269[0];
			var3 *= 0.0030517578F;
			field1272 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1273 = (int) (field1272 * 65536.0F);
		}

		if (field1266[arg0] == 0) {
			return 0;
		}

		float var4 = method443(0, arg0, arg1);
		field1270[arg0][0] = var4 * -2.0F * (float) Math.cos(method445(arg1, arg0, 0));
		field1270[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1266[arg0]; var5++) {
			float var6 = method443(var5, arg0, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method445(arg1, arg0, var5));
			float var8 = var6 * var6;
			field1270[arg0][var5 * 2 + 1] = field1270[arg0][var5 * 2 - 1] * var8;
			field1270[arg0][var5 * 2] = field1270[arg0][var5 * 2 - 1] * var7 + field1270[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1270[arg0][var9] += field1270[arg0][var9 - 1] * var7 + field1270[arg0][var9 - 2] * var8;
			}

			field1270[arg0][1] += field1270[arg0][0] * var7 + var8;
			field1270[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1266[0] * 2; var10++) {
				field1270[0][var10] *= field1272;
			}
		}

		for (int var11 = 0; var11 < field1266[arg0] * 2; var11++) {
			field1271[arg0][var11] = (int) (field1270[arg0][var11] * 65536.0F);
		}

		return field1266[arg0] * 2;
	}

	@ObfuscatedName("TUODRVGB.a(LXCOYGYOS;ILZOMNSJJM;)V")
	public final void method447(XCOYGYOS arg0, ZOMNSJJM arg1) {
		int var3 = arg1.method547();
		field1266[0] = var3 >> 4;
		field1266[1] = var3 & 0xF;
		if (var3 == 0) {
			field1269[0] = field1269[1] = 0;
		} else {
			field1269[0] = arg1.method549();
			field1269[1] = arg1.method549();
			int var4 = arg1.method547();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1266[var5]; var6++) {
					field1267[var5][0][var6] = arg1.method549();
					field1268[var5][0][var6] = arg1.method549();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1266[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1267[var7][1][var8] = field1267[var7][0][var8];
						field1268[var7][1][var8] = field1268[var7][0][var8];
					} else {
						field1267[var7][1][var8] = arg1.method549();
						field1268[var7][1][var8] = arg1.method549();
					}
				}
			}

			if (var4 != 0 || field1269[1] != field1269[0]) {
				arg0.method455(arg1);
			}
		}
	}
}
