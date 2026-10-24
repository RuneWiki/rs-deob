package deob;

@ObfuscatedName("FCAOQJWY")
public class FCAOQJWY {

	@ObfuscatedName("FCAOQJWY.d")
	public int[] field595 = new int[2];

	@ObfuscatedName("FCAOQJWY.e")
	public int[][][] field596 = new int[2][2][4];

	@ObfuscatedName("FCAOQJWY.f")
	public int[][][] field597 = new int[2][2][4];

	@ObfuscatedName("FCAOQJWY.g")
	public int[] field598 = new int[2];

	@ObfuscatedName("FCAOQJWY.h")
	public static float[][] field599 = new float[2][8];

	@ObfuscatedName("FCAOQJWY.i")
	public static int[][] field600 = new int[2][8];

	@ObfuscatedName("FCAOQJWY.j")
	public static float field601;

	@ObfuscatedName("FCAOQJWY.k")
	public static int field602;

	@ObfuscatedName("FCAOQJWY.a(BFII)F")
	public float method224(float arg0, int arg1, int arg2) {
		float var4 = (field597[arg1][1][arg2] - field597[arg1][0][arg2]) * arg0 + field597[arg1][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("FCAOQJWY.a(BF)F")
	public float method225(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("FCAOQJWY.a(IIIF)F")
	public float method226(int arg0, int arg1, float arg2) {
		float var4 = (field596[arg0][1][arg1] - field596[arg0][0][arg1]) * arg2 + field596[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method225(var4);
	}

	@ObfuscatedName("FCAOQJWY.a(FIZ)I")
	public int method227(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field598[1] - field598[0]) * arg0 + field598[0];
			var3 *= 0.0030517578F;
			field601 = (float) Math.pow(0.1D, var3 / 20.0F);
			field602 = (int) (field601 * 65536.0F);
		}

		if (field595[arg1] == 0) {
			return 0;
		}

		float var4 = method224(arg0, arg1, 0);
		field599[arg1][0] = var4 * -2.0F * (float) Math.cos(method226(arg1, 0, arg0));
		field599[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field595[arg1]; var5++) {
			float var6 = method224(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method226(arg1, var5, arg0));
			float var8 = var6 * var6;
			field599[arg1][var5 * 2 + 1] = field599[arg1][var5 * 2 - 1] * var8;
			field599[arg1][var5 * 2] = field599[arg1][var5 * 2 - 1] * var7 + field599[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field599[arg1][var9] += field599[arg1][var9 - 1] * var7 + field599[arg1][var9 - 2] * var8;
			}

			field599[arg1][1] += field599[arg1][0] * var7 + var8;
			field599[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field595[0] * 2; var10++) {
				field599[0][var10] *= field601;
			}
		}

		for (int var11 = 0; var11 < field595[arg1] * 2; var11++) {
			field600[arg1][var11] = (int) (field599[arg1][var11] * 65536.0F);
		}

		return field595[arg1] * 2;
	}

	@ObfuscatedName("FCAOQJWY.a(LBJPHZZMM;LXOUQUKZW;B)V")
	public final void method228(BJPHZZMM arg0, XOUQUKZW arg1) {
		int var3 = arg1.method521();
		field595[0] = var3 >> 4;
		field595[1] = var3 & 0xF;
		if (var3 == 0) {
			field598[0] = field598[1] = 0;
		} else {
			field598[0] = arg1.method523();
			field598[1] = arg1.method523();
			int var4 = arg1.method521();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field595[var5]; var6++) {
					field596[var5][0][var6] = arg1.method523();
					field597[var5][0][var6] = arg1.method523();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field595[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field596[var7][1][var8] = field596[var7][0][var8];
						field597[var7][1][var8] = field597[var7][0][var8];
					} else {
						field596[var7][1][var8] = arg1.method523();
						field597[var7][1][var8] = arg1.method523();
					}
				}
			}

			if (var4 != 0 || field598[1] != field598[0]) {
				arg0.method31(arg1);
			}
		}
	}
}
