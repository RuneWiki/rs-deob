package deob;

@ObfuscatedName("URKVTZGT")
public class URKVTZGT {

	@ObfuscatedName("URKVTZGT.b")
	public int[] field1383 = new int[2];

	@ObfuscatedName("URKVTZGT.c")
	public int[][][] field1384 = new int[2][2][4];

	@ObfuscatedName("URKVTZGT.d")
	public int[][][] field1385 = new int[2][2][4];

	@ObfuscatedName("URKVTZGT.e")
	public int[] field1386 = new int[2];

	@ObfuscatedName("URKVTZGT.f")
	public static float[][] field1387 = new float[2][8];

	@ObfuscatedName("URKVTZGT.g")
	public static int[][] field1388 = new int[2][8];

	@ObfuscatedName("URKVTZGT.h")
	public static float field1389;

	@ObfuscatedName("URKVTZGT.i")
	public static int field1390;

	@ObfuscatedName("URKVTZGT.a(IBFI)F")
	public float method517(int arg0, float arg1, int arg2) {
		float var4 = (field1385[arg2][1][arg0] - field1385[arg2][0][arg0]) * arg1 + field1385[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("URKVTZGT.a(IF)F")
	public float method518(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("URKVTZGT.a(IIIF)F")
	public float method519(int arg0, int arg1, float arg2) {
		float var4 = (field1384[arg0][1][arg1] - field1384[arg0][0][arg1]) * arg2 + field1384[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method518(var4);
	}

	@ObfuscatedName("URKVTZGT.a(IIF)I")
	public int method520(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1386[1] - field1386[0]) * arg1 + field1386[0];
			var3 *= 0.0030517578F;
			field1389 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1390 = (int) (field1389 * 65536.0F);
		}

		if (field1383[arg0] == 0) {
			return 0;
		}

		float var4 = method517(0, arg1, arg0);
		field1387[arg0][0] = var4 * -2.0F * (float) Math.cos(method519(arg0, 0, arg1));
		field1387[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1383[arg0]; var5++) {
			float var6 = method517(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method519(arg0, var5, arg1));
			float var8 = var6 * var6;
			field1387[arg0][var5 * 2 + 1] = field1387[arg0][var5 * 2 - 1] * var8;
			field1387[arg0][var5 * 2] = field1387[arg0][var5 * 2 - 1] * var7 + field1387[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1387[arg0][var9] += field1387[arg0][var9 - 1] * var7 + field1387[arg0][var9 - 2] * var8;
			}

			field1387[arg0][1] += field1387[arg0][0] * var7 + var8;
			field1387[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1383[0] * 2; var10++) {
				field1387[0][var10] *= field1389;
			}
		}

		for (int var11 = 0; var11 < field1383[arg0] * 2; var11++) {
			field1388[arg0][var11] = (int) (field1387[arg0][var11] * 65536.0F);
		}

		return field1383[arg0] * 2;
	}

	@ObfuscatedName("URKVTZGT.a(LIUVBENCV;LMWRZAKOJ;I)V")
	public final void method521(IUVBENCV arg0, MWRZAKOJ arg1) {
		int var3 = arg0.method245();
		field1383[0] = var3 >> 4;
		field1383[1] = var3 & 0xF;
		if (var3 == 0) {
			field1386[0] = field1386[1] = 0;
		} else {
			field1386[0] = arg0.method247();
			field1386[1] = arg0.method247();
			int var4 = arg0.method245();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1383[var5]; var6++) {
					field1384[var5][0][var6] = arg0.method247();
					field1385[var5][0][var6] = arg0.method247();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1383[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1384[var7][1][var8] = field1384[var7][0][var8];
						field1385[var7][1][var8] = field1385[var7][0][var8];
					} else {
						field1384[var7][1][var8] = arg0.method247();
						field1385[var7][1][var8] = arg0.method247();
					}
				}
			}

			if (var4 != 0 || field1386[1] != field1386[0]) {
				arg1.method359(arg0);
			}
		}
	}
}
