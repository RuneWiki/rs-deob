package deob;

@ObfuscatedName("BVZJQTSH")
public class BVZJQTSH {

	@ObfuscatedName("BVZJQTSH.d")
	public int[] field54 = new int[2];

	@ObfuscatedName("BVZJQTSH.e")
	public int[][][] field55 = new int[2][2][4];

	@ObfuscatedName("BVZJQTSH.f")
	public int[][][] field56 = new int[2][2][4];

	@ObfuscatedName("BVZJQTSH.g")
	public int[] field57 = new int[2];

	@ObfuscatedName("BVZJQTSH.h")
	public static float[][] field58 = new float[2][8];

	@ObfuscatedName("BVZJQTSH.i")
	public static int[][] field59 = new int[2][8];

	@ObfuscatedName("BVZJQTSH.j")
	public static float field60;

	@ObfuscatedName("BVZJQTSH.k")
	public static int field61;

	@ObfuscatedName("BVZJQTSH.a(ZIFI)F")
	public float method22(int arg0, float arg1, int arg2) {
		float var4 = (field56[arg2][1][arg0] - field56[arg2][0][arg0]) * arg1 + field56[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("BVZJQTSH.a(BF)F")
	public float method23(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("BVZJQTSH.a(BFII)F")
	public float method24(float arg0, int arg1, int arg2) {
		float var4 = (field55[arg1][1][arg2] - field55[arg1][0][arg2]) * arg0 + field55[arg1][0][arg2];
		var4 *= 1.2207031E-4F;
		return method23(var4);
	}

	@ObfuscatedName("BVZJQTSH.a(BFI)I")
	public int method25(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field57[1] - field57[0]) * arg0 + field57[0];
			var3 *= 0.0030517578F;
			field60 = (float) Math.pow(0.1D, var3 / 20.0F);
			field61 = (int) (field60 * 65536.0F);
		}

		if (field54[arg1] == 0) {
			return 0;
		}

		float var4 = method22(0, arg0, arg1);
		field58[arg1][0] = var4 * -2.0F * (float) Math.cos(method24(arg0, arg1, 0));
		field58[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field54[arg1]; var5++) {
			float var6 = method22(var5, arg0, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method24(arg0, arg1, var5));
			float var8 = var6 * var6;
			field58[arg1][var5 * 2 + 1] = field58[arg1][var5 * 2 - 1] * var8;
			field58[arg1][var5 * 2] = field58[arg1][var5 * 2 - 1] * var7 + field58[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field58[arg1][var9] += field58[arg1][var9 - 1] * var7 + field58[arg1][var9 - 2] * var8;
			}

			field58[arg1][1] += field58[arg1][0] * var7 + var8;
			field58[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field54[0] * 2; var10++) {
				field58[0][var10] *= field60;
			}
		}

		for (int var11 = 0; var11 < field54[arg1] * 2; var11++) {
			field59[arg1][var11] = (int) (field58[arg1][var11] * 65536.0F);
		}

		return field54[arg1] * 2;
	}

	@ObfuscatedName("BVZJQTSH.a(LMNKDCXXG;ZLLMFHFXBO;)V")
	public final void method26(MNKDCXXG arg0, LMFHFXBO arg1) {
		int var3 = arg0.method386();
		field54[0] = var3 >> 4;
		field54[1] = var3 & 0xF;
		if (var3 == 0) {
			field57[0] = field57[1] = 0;
		} else {
			field57[0] = arg0.method388();
			field57[1] = arg0.method388();
			int var4 = arg0.method386();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field54[var5]; var6++) {
					field55[var5][0][var6] = arg0.method388();
					field56[var5][0][var6] = arg0.method388();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field54[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field55[var7][1][var8] = field55[var7][0][var8];
						field56[var7][1][var8] = field56[var7][0][var8];
					} else {
						field55[var7][1][var8] = arg0.method388();
						field56[var7][1][var8] = arg0.method388();
					}
				}
			}

			if (var4 != 0 || field57[1] != field57[0]) {
				arg1.method357(arg0);
			}
		}
	}
}
