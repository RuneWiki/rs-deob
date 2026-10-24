package deob;

@ObfuscatedName("ZOMUFNUM")
public class ZOMUFNUM {

	@ObfuscatedName("ZOMUFNUM.d")
	public int[] field1486 = new int[2];

	@ObfuscatedName("ZOMUFNUM.e")
	public int[][][] field1487 = new int[2][2][4];

	@ObfuscatedName("ZOMUFNUM.f")
	public int[][][] field1488 = new int[2][2][4];

	@ObfuscatedName("ZOMUFNUM.g")
	public int[] field1489 = new int[2];

	@ObfuscatedName("ZOMUFNUM.h")
	public static float[][] field1490 = new float[2][8];

	@ObfuscatedName("ZOMUFNUM.i")
	public static int[][] field1491 = new int[2][8];

	@ObfuscatedName("ZOMUFNUM.j")
	public static float field1492;

	@ObfuscatedName("ZOMUFNUM.k")
	public static int field1493;

	@ObfuscatedName("ZOMUFNUM.a(IBFI)F")
	public float method583(int arg0, float arg1, int arg2) {
		float var4 = (field1488[arg2][1][arg0] - field1488[arg2][0][arg0]) * arg1 + field1488[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("ZOMUFNUM.a(IF)F")
	public float method584(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("ZOMUFNUM.a(BIIF)F")
	public float method585(int arg0, int arg1, float arg2) {
		float var4 = (field1487[arg0][1][arg1] - field1487[arg0][0][arg1]) * arg2 + field1487[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method584(var4);
	}

	@ObfuscatedName("ZOMUFNUM.a(IIF)I")
	public int method586(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1489[1] - field1489[0]) * arg1 + field1489[0];
			var3 *= 0.0030517578F;
			field1492 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1493 = (int) (field1492 * 65536.0F);
		}

		if (field1486[arg0] == 0) {
			return 0;
		}

		float var4 = method583(0, arg1, arg0);
		field1490[arg0][0] = var4 * -2.0F * (float) Math.cos(method585(arg0, 0, arg1));
		field1490[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1486[arg0]; var5++) {
			float var6 = method583(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method585(arg0, var5, arg1));
			float var8 = var6 * var6;
			field1490[arg0][var5 * 2 + 1] = field1490[arg0][var5 * 2 - 1] * var8;
			field1490[arg0][var5 * 2] = field1490[arg0][var5 * 2 - 1] * var7 + field1490[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1490[arg0][var9] += field1490[arg0][var9 - 1] * var7 + field1490[arg0][var9 - 2] * var8;
			}

			field1490[arg0][1] += field1490[arg0][0] * var7 + var8;
			field1490[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1486[0] * 2; var10++) {
				field1490[0][var10] *= field1492;
			}
		}

		for (int var11 = 0; var11 < field1486[arg0] * 2; var11++) {
			field1491[arg0][var11] = (int) (field1490[arg0][var11] * 65536.0F);
		}

		return field1486[arg0] * 2;
	}

	@ObfuscatedName("ZOMUFNUM.a(LNQUAUMDT;ILFGSQUADF;)V")
	public final void method587(NQUAUMDT arg0, FGSQUADF arg1) {
		int var3 = arg0.method339();
		field1486[0] = var3 >> 4;
		field1486[1] = var3 & 0xF;
		if (var3 == 0) {
			field1489[0] = field1489[1] = 0;
		} else {
			field1489[0] = arg0.method341();
			field1489[1] = arg0.method341();
			int var4 = arg0.method339();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1486[var5]; var6++) {
					field1487[var5][0][var6] = arg0.method341();
					field1488[var5][0][var6] = arg0.method341();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1486[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1487[var7][1][var8] = field1487[var7][0][var8];
						field1488[var7][1][var8] = field1488[var7][0][var8];
					} else {
						field1487[var7][1][var8] = arg0.method341();
						field1488[var7][1][var8] = arg0.method341();
					}
				}
			}

			if (var4 != 0 || field1489[1] != field1489[0]) {
				arg1.method177(arg0);
			}
		}
	}
}
