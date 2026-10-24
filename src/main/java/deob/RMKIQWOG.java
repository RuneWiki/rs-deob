package deob;

@ObfuscatedName("RMKIQWOG")
public class RMKIQWOG {

	@ObfuscatedName("RMKIQWOG.f")
	public int[] field1128 = new int[2];

	@ObfuscatedName("RMKIQWOG.g")
	public int[][][] field1129 = new int[2][2][4];

	@ObfuscatedName("RMKIQWOG.h")
	public int[][][] field1130 = new int[2][2][4];

	@ObfuscatedName("RMKIQWOG.i")
	public int[] field1131 = new int[2];

	@ObfuscatedName("RMKIQWOG.j")
	public static float[][] field1132 = new float[2][8];

	@ObfuscatedName("RMKIQWOG.k")
	public static int[][] field1133 = new int[2][8];

	@ObfuscatedName("RMKIQWOG.l")
	public static float field1134;

	@ObfuscatedName("RMKIQWOG.m")
	public static int field1135;

	@ObfuscatedName("RMKIQWOG.a(FIIB)F")
	public float method416(float arg0, int arg1, int arg2) {
		float var4 = (field1130[arg1][1][arg2] - field1130[arg1][0][arg2]) * arg0 + field1130[arg1][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("RMKIQWOG.a(FB)F")
	public float method417(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("RMKIQWOG.a(IIFI)F")
	public float method418(int arg0, int arg1, float arg2) {
		float var4 = (field1129[arg1][1][arg0] - field1129[arg1][0][arg0]) * arg2 + field1129[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method417(var4);
	}

	@ObfuscatedName("RMKIQWOG.a(BIF)I")
	public int method419(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1131[1] - field1131[0]) * arg1 + field1131[0];
			var3 *= 0.0030517578F;
			field1134 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1135 = (int) (field1134 * 65536.0F);
		}

		if (field1128[arg0] == 0) {
			return 0;
		}

		float var4 = method416(arg1, arg0, 0);
		field1132[arg0][0] = var4 * -2.0F * (float) Math.cos(method418(0, arg0, arg1));
		field1132[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1128[arg0]; var5++) {
			float var6 = method416(arg1, arg0, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method418(var5, arg0, arg1));
			float var8 = var6 * var6;
			field1132[arg0][var5 * 2 + 1] = field1132[arg0][var5 * 2 - 1] * var8;
			field1132[arg0][var5 * 2] = field1132[arg0][var5 * 2 - 1] * var7 + field1132[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1132[arg0][var9] += field1132[arg0][var9 - 1] * var7 + field1132[arg0][var9 - 2] * var8;
			}

			field1132[arg0][1] += field1132[arg0][0] * var7 + var8;
			field1132[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1128[0] * 2; var10++) {
				field1132[0][var10] *= field1134;
			}
		}

		for (int var11 = 0; var11 < field1128[arg0] * 2; var11++) {
			field1133[arg0][var11] = (int) (field1132[arg0][var11] * 65536.0F);
		}

		return field1128[arg0] * 2;
	}

	@ObfuscatedName("RMKIQWOG.a(LUAWAYCTK;ILMMADHCLT;)V")
	public final void method420(UAWAYCTK arg0, MMADHCLT arg1) {
		int var3 = arg0.method455();
		field1128[0] = var3 >> 4;
		field1128[1] = var3 & 0xF;
		if (var3 == 0) {
			field1131[0] = field1131[1] = 0;
		} else {
			field1131[0] = arg0.method457();
			field1131[1] = arg0.method457();
			int var4 = arg0.method455();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1128[var5]; var6++) {
					field1129[var5][0][var6] = arg0.method457();
					field1130[var5][0][var6] = arg0.method457();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1128[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1129[var7][1][var8] = field1129[var7][0][var8];
						field1130[var7][1][var8] = field1130[var7][0][var8];
					} else {
						field1129[var7][1][var8] = arg0.method457();
						field1130[var7][1][var8] = arg0.method457();
					}
				}
			}

			if (var4 != 0 || field1131[1] != field1131[0]) {
				arg1.method325(arg0);
			}
		}
	}
}
