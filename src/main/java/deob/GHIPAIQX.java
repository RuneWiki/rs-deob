package deob;

@ObfuscatedName("GHIPAIQX")
public class GHIPAIQX {

	@ObfuscatedName("GHIPAIQX.c")
	public int[] field700 = new int[2];

	@ObfuscatedName("GHIPAIQX.d")
	public int[][][] field701 = new int[2][2][4];

	@ObfuscatedName("GHIPAIQX.e")
	public int[][][] field702 = new int[2][2][4];

	@ObfuscatedName("GHIPAIQX.f")
	public int[] field703 = new int[2];

	@ObfuscatedName("GHIPAIQX.g")
	public static float[][] field704 = new float[2][8];

	@ObfuscatedName("GHIPAIQX.h")
	public static int[][] field705 = new int[2][8];

	@ObfuscatedName("GHIPAIQX.i")
	public static float field706;

	@ObfuscatedName("GHIPAIQX.j")
	public static int field707;

	@ObfuscatedName("GHIPAIQX.a(FBII)F")
	public float method227(float arg0, int arg1, int arg2) {
		float var4 = (field702[arg1][1][arg2] - field702[arg1][0][arg2]) * arg0 + field702[arg1][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("GHIPAIQX.a(IF)F")
	public float method228(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("GHIPAIQX.a(IFII)F")
	public float method229(int arg0, float arg1, int arg2) {
		float var4 = (field701[arg0][1][arg2] - field701[arg0][0][arg2]) * arg1 + field701[arg0][0][arg2];
		var4 *= 1.2207031E-4F;
		return method228(var4);
	}

	@ObfuscatedName("GHIPAIQX.a(FII)I")
	public int method230(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field703[1] - field703[0]) * arg0 + field703[0];
			var3 *= 0.0030517578F;
			field706 = (float) Math.pow(0.1D, var3 / 20.0F);
			field707 = (int) (field706 * 65536.0F);
		}

		if (field700[arg1] == 0) {
			return 0;
		}

		float var4 = method227(arg0, arg1, 0);
		field704[arg1][0] = var4 * -2.0F * (float) Math.cos(method229(arg1, arg0, 0));
		field704[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field700[arg1]; var5++) {
			float var6 = method227(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method229(arg1, arg0, var5));
			float var8 = var6 * var6;
			field704[arg1][var5 * 2 + 1] = field704[arg1][var5 * 2 - 1] * var8;
			field704[arg1][var5 * 2] = field704[arg1][var5 * 2 - 1] * var7 + field704[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field704[arg1][var9] += field704[arg1][var9 - 1] * var7 + field704[arg1][var9 - 2] * var8;
			}

			field704[arg1][1] += field704[arg1][0] * var7 + var8;
			field704[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field700[0] * 2; var10++) {
				field704[0][var10] *= field706;
			}
		}

		for (int var11 = 0; var11 < field700[arg1] * 2; var11++) {
			field705[arg1][var11] = (int) (field704[arg1][var11] * 65536.0F);
		}

		return field700[arg1] * 2;
	}

	@ObfuscatedName("GHIPAIQX.a(ZLLYKGAWTC;LGLMIQHJI;)V")
	public final void method231(LYKGAWTC arg0, GLMIQHJI arg1) {
		int var3 = arg1.method244();
		field700[0] = var3 >> 4;
		field700[1] = var3 & 0xF;
		if (var3 == 0) {
			field703[0] = field703[1] = 0;
		} else {
			field703[0] = arg1.method246();
			field703[1] = arg1.method246();
			int var4 = arg1.method244();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field700[var5]; var6++) {
					field701[var5][0][var6] = arg1.method246();
					field702[var5][0][var6] = arg1.method246();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field700[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field701[var7][1][var8] = field701[var7][0][var8];
						field702[var7][1][var8] = field702[var7][0][var8];
					} else {
						field701[var7][1][var8] = arg1.method246();
						field702[var7][1][var8] = arg1.method246();
					}
				}
			}

			if (var4 != 0 || field703[1] != field703[0]) {
				arg0.method386(arg1);
			}
		}
	}
}
