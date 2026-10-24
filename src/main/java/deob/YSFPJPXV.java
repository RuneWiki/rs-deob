package deob;

@ObfuscatedName("YSFPJPXV")
public class YSFPJPXV {

	@ObfuscatedName("YSFPJPXV.c")
	public int[] field1440 = new int[2];

	@ObfuscatedName("YSFPJPXV.d")
	public int[][][] field1441 = new int[2][2][4];

	@ObfuscatedName("YSFPJPXV.e")
	public int[][][] field1442 = new int[2][2][4];

	@ObfuscatedName("YSFPJPXV.f")
	public int[] field1443 = new int[2];

	@ObfuscatedName("YSFPJPXV.g")
	public static float[][] field1444 = new float[2][8];

	@ObfuscatedName("YSFPJPXV.h")
	public static int[][] field1445 = new int[2][8];

	@ObfuscatedName("YSFPJPXV.i")
	public static float field1446;

	@ObfuscatedName("YSFPJPXV.j")
	public static int field1447;

	@ObfuscatedName("YSFPJPXV.a(IFIZ)F")
	public float method583(int arg0, float arg1, int arg2) {
		float var4 = (field1442[arg0][1][arg2] - field1442[arg0][0][arg2]) * arg1 + field1442[arg0][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("YSFPJPXV.a(IF)F")
	public float method584(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("YSFPJPXV.a(IIFI)F")
	public float method585(int arg0, int arg1, float arg2) {
		float var4 = (field1441[arg0][1][arg1] - field1441[arg0][0][arg1]) * arg2 + field1441[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method584(var4);
	}

	@ObfuscatedName("YSFPJPXV.a(IIF)I")
	public int method586(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1443[1] - field1443[0]) * arg1 + field1443[0];
			var3 *= 0.0030517578F;
			field1446 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1447 = (int) (field1446 * 65536.0F);
		}

		if (field1440[arg0] == 0) {
			return 0;
		}

		float var4 = method583(arg0, arg1, 0);
		field1444[arg0][0] = var4 * -2.0F * (float) Math.cos(method585(arg0, 0, arg1));
		field1444[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1440[arg0]; var5++) {
			float var6 = method583(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method585(arg0, var5, arg1));
			float var8 = var6 * var6;
			field1444[arg0][var5 * 2 + 1] = field1444[arg0][var5 * 2 - 1] * var8;
			field1444[arg0][var5 * 2] = field1444[arg0][var5 * 2 - 1] * var7 + field1444[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1444[arg0][var9] += field1444[arg0][var9 - 1] * var7 + field1444[arg0][var9 - 2] * var8;
			}

			field1444[arg0][1] += field1444[arg0][0] * var7 + var8;
			field1444[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1440[0] * 2; var10++) {
				field1444[0][var10] *= field1446;
			}
		}

		for (int var11 = 0; var11 < field1440[arg0] * 2; var11++) {
			field1445[arg0][var11] = (int) (field1444[arg0][var11] * 65536.0F);
		}

		return field1440[arg0] * 2;
	}

	@ObfuscatedName("YSFPJPXV.a(LEGCCHUZS;ILUPKVWWFD;)V")
	public final void method587(EGCCHUZS arg0, UPKVWWFD arg1) {
		int var3 = arg0.method261();
		field1440[0] = var3 >> 4;
		field1440[1] = var3 & 0xF;
		if (var3 == 0) {
			field1443[0] = field1443[1] = 0;
		} else {
			field1443[0] = arg0.method263();
			field1443[1] = arg0.method263();
			int var4 = arg0.method261();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1440[var5]; var6++) {
					field1441[var5][0][var6] = arg0.method263();
					field1442[var5][0][var6] = arg0.method263();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1440[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1441[var7][1][var8] = field1441[var7][0][var8];
						field1442[var7][1][var8] = field1442[var7][0][var8];
					} else {
						field1441[var7][1][var8] = arg0.method263();
						field1442[var7][1][var8] = arg0.method263();
					}
				}
			}

			if (var4 != 0 || field1443[1] != field1443[0]) {
				arg1.method550(arg0);
			}
		}
	}
}
