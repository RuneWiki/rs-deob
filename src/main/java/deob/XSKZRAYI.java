package deob;

@ObfuscatedName("XSKZRAYI")
public class XSKZRAYI {

	@ObfuscatedName("XSKZRAYI.d")
	public int[] field1344 = new int[2];

	@ObfuscatedName("XSKZRAYI.e")
	public int[][][] field1345 = new int[2][2][4];

	@ObfuscatedName("XSKZRAYI.f")
	public int[][][] field1346 = new int[2][2][4];

	@ObfuscatedName("XSKZRAYI.g")
	public int[] field1347 = new int[2];

	@ObfuscatedName("XSKZRAYI.h")
	public static float[][] field1348 = new float[2][8];

	@ObfuscatedName("XSKZRAYI.i")
	public static int[][] field1349 = new int[2][8];

	@ObfuscatedName("XSKZRAYI.j")
	public static float field1350;

	@ObfuscatedName("XSKZRAYI.k")
	public static int field1351;

	@ObfuscatedName("XSKZRAYI.a(FIBI)F")
	public float method531(float arg0, int arg1, int arg2) {
		float var4 = (field1346[arg1][1][arg2] - field1346[arg1][0][arg2]) * arg0 + field1346[arg1][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("XSKZRAYI.a(BF)F")
	public float method532(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("XSKZRAYI.a(IFII)F")
	public float method533(int arg0, float arg1, int arg2) {
		float var4 = (field1345[arg0][1][arg2] - field1345[arg0][0][arg2]) * arg1 + field1345[arg0][0][arg2];
		var4 *= 1.2207031E-4F;
		return method532(var4);
	}

	@ObfuscatedName("XSKZRAYI.a(BIF)I")
	public int method534(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1347[1] - field1347[0]) * arg1 + field1347[0];
			var3 *= 0.0030517578F;
			field1350 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1351 = (int) (field1350 * 65536.0F);
		}

		if (field1344[arg0] == 0) {
			return 0;
		}

		float var4 = method531(arg1, arg0, 0);
		field1348[arg0][0] = var4 * -2.0F * (float) Math.cos(method533(arg0, arg1, 0));
		field1348[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1344[arg0]; var5++) {
			float var6 = method531(arg1, arg0, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method533(arg0, arg1, var5));
			float var8 = var6 * var6;
			field1348[arg0][var5 * 2 + 1] = field1348[arg0][var5 * 2 - 1] * var8;
			field1348[arg0][var5 * 2] = field1348[arg0][var5 * 2 - 1] * var7 + field1348[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1348[arg0][var9] += field1348[arg0][var9 - 1] * var7 + field1348[arg0][var9 - 2] * var8;
			}

			field1348[arg0][1] += field1348[arg0][0] * var7 + var8;
			field1348[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1344[0] * 2; var10++) {
				field1348[0][var10] *= field1350;
			}
		}

		for (int var11 = 0; var11 < field1344[arg0] * 2; var11++) {
			field1349[arg0][var11] = (int) (field1348[arg0][var11] * 65536.0F);
		}

		return field1344[arg0] * 2;
	}

	@ObfuscatedName("XSKZRAYI.a(LUHTSXKVU;ILRSWRPCHR;)V")
	public final void method535(UHTSXKVU arg0, RSWRPCHR arg1) {
		int var3 = arg1.method388();
		field1344[0] = var3 >> 4;
		field1344[1] = var3 & 0xF;
		if (var3 == 0) {
			field1347[0] = field1347[1] = 0;
		} else {
			field1347[0] = arg1.method390();
			field1347[1] = arg1.method390();
			int var4 = arg1.method388();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1344[var5]; var6++) {
					field1345[var5][0][var6] = arg1.method390();
					field1346[var5][0][var6] = arg1.method390();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1344[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1345[var7][1][var8] = field1345[var7][0][var8];
						field1346[var7][1][var8] = field1346[var7][0][var8];
					} else {
						field1345[var7][1][var8] = arg1.method390();
						field1346[var7][1][var8] = arg1.method390();
					}
				}
			}

			if (var4 != 0 || field1347[1] != field1347[0]) {
				arg0.method446(arg1);
			}
		}
	}
}
