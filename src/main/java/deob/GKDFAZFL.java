package deob;

@ObfuscatedName("GKDFAZFL")
public class GKDFAZFL {

	@ObfuscatedName("GKDFAZFL.c")
	public int[] field713 = new int[2];

	@ObfuscatedName("GKDFAZFL.d")
	public int[][][] field714 = new int[2][2][4];

	@ObfuscatedName("GKDFAZFL.e")
	public int[][][] field715 = new int[2][2][4];

	@ObfuscatedName("GKDFAZFL.f")
	public int[] field716 = new int[2];

	@ObfuscatedName("GKDFAZFL.g")
	public static float[][] field717 = new float[2][8];

	@ObfuscatedName("GKDFAZFL.h")
	public static int[][] field718 = new int[2][8];

	@ObfuscatedName("GKDFAZFL.i")
	public static float field719;

	@ObfuscatedName("GKDFAZFL.j")
	public static int field720;

	@ObfuscatedName("GKDFAZFL.a(IZFI)F")
	public float method290(int arg0, float arg1, int arg2) {
		float var4 = (field715[arg2][1][arg0] - field715[arg2][0][arg0]) * arg1 + field715[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("GKDFAZFL.a(FZ)F")
	public float method291(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("GKDFAZFL.a(IIFI)F")
	public float method292(int arg0, float arg1, int arg2) {
		float var4 = (field714[arg0][1][arg2] - field714[arg0][0][arg2]) * arg1 + field714[arg0][0][arg2];
		var4 *= 1.2207031E-4F;
		return method291(var4);
	}

	@ObfuscatedName("GKDFAZFL.a(FII)I")
	public int method293(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field716[1] - field716[0]) * arg0 + field716[0];
			var3 *= 0.0030517578F;
			field719 = (float) Math.pow(0.1D, var3 / 20.0F);
			field720 = (int) (field719 * 65536.0F);
		}

		if (field713[arg1] == 0) {
			return 0;
		}

		float var4 = method290(0, arg0, arg1);
		field717[arg1][0] = var4 * -2.0F * (float) Math.cos(method292(arg1, arg0, 0));
		field717[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field713[arg1]; var5++) {
			float var6 = method290(var5, arg0, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method292(arg1, arg0, var5));
			float var8 = var6 * var6;
			field717[arg1][var5 * 2 + 1] = field717[arg1][var5 * 2 - 1] * var8;
			field717[arg1][var5 * 2] = field717[arg1][var5 * 2 - 1] * var7 + field717[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field717[arg1][var9] += field717[arg1][var9 - 1] * var7 + field717[arg1][var9 - 2] * var8;
			}

			field717[arg1][1] += field717[arg1][0] * var7 + var8;
			field717[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field713[0] * 2; var10++) {
				field717[0][var10] *= field719;
			}
		}

		for (int var11 = 0; var11 < field713[arg1] * 2; var11++) {
			field718[arg1][var11] = (int) (field717[arg1][var11] * 65536.0F);
		}

		return field713[arg1] * 2;
	}

	@ObfuscatedName("GKDFAZFL.a(LCMGGUSPR;ILJOBKQXED;)V")
	public final void method294(CMGGUSPR arg0, JOBKQXED arg1) {
		int var3 = arg0.method194();
		field713[0] = var3 >> 4;
		field713[1] = var3 & 0xF;
		if (var3 == 0) {
			field716[0] = field716[1] = 0;
		} else {
			field716[0] = arg0.method196();
			field716[1] = arg0.method196();
			int var4 = arg0.method194();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field713[var5]; var6++) {
					field714[var5][0][var6] = arg0.method196();
					field715[var5][0][var6] = arg0.method196();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field713[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field714[var7][1][var8] = field714[var7][0][var8];
						field715[var7][1][var8] = field715[var7][0][var8];
					} else {
						field714[var7][1][var8] = arg0.method196();
						field715[var7][1][var8] = arg0.method196();
					}
				}
			}

			if (var4 != 0 || field716[1] != field716[0]) {
				arg1.method338(arg0);
			}
		}
	}
}
