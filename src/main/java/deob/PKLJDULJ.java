package deob;

@ObfuscatedName("PKLJDULJ")
public class PKLJDULJ {

	@ObfuscatedName("PKLJDULJ.c")
	public int[] field1049 = new int[2];

	@ObfuscatedName("PKLJDULJ.d")
	public int[][][] field1050 = new int[2][2][4];

	@ObfuscatedName("PKLJDULJ.e")
	public int[][][] field1051 = new int[2][2][4];

	@ObfuscatedName("PKLJDULJ.f")
	public int[] field1052 = new int[2];

	@ObfuscatedName("PKLJDULJ.g")
	public static float[][] field1053 = new float[2][8];

	@ObfuscatedName("PKLJDULJ.h")
	public static int[][] field1054 = new int[2][8];

	@ObfuscatedName("PKLJDULJ.i")
	public static float field1055;

	@ObfuscatedName("PKLJDULJ.j")
	public static int field1056;

	@ObfuscatedName("PKLJDULJ.a(ZIIF)F")
	public float method421(int arg0, int arg1, float arg2) {
		float var4 = (field1051[arg1][1][arg0] - field1051[arg1][0][arg0]) * arg2 + field1051[arg1][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("PKLJDULJ.a(FZ)F")
	public float method422(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("PKLJDULJ.b(ZIIF)F")
	public float method423(int arg0, int arg1, float arg2) {
		float var4 = (field1050[arg0][1][arg1] - field1050[arg0][0][arg1]) * arg2 + field1050[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method422(var4);
	}

	@ObfuscatedName("PKLJDULJ.a(FII)I")
	public int method424(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field1052[1] - field1052[0]) * arg0 + field1052[0];
			var3 *= 0.0030517578F;
			field1055 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1056 = (int) (field1055 * 65536.0F);
		}

		if (field1049[arg1] == 0) {
			return 0;
		}

		float var4 = method421(0, arg1, arg0);
		field1053[arg1][0] = var4 * -2.0F * (float) Math.cos(method423(arg1, 0, arg0));
		field1053[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field1049[arg1]; var5++) {
			float var6 = method421(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method423(arg1, var5, arg0));
			float var8 = var6 * var6;
			field1053[arg1][var5 * 2 + 1] = field1053[arg1][var5 * 2 - 1] * var8;
			field1053[arg1][var5 * 2] = field1053[arg1][var5 * 2 - 1] * var7 + field1053[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1053[arg1][var9] += field1053[arg1][var9 - 1] * var7 + field1053[arg1][var9 - 2] * var8;
			}

			field1053[arg1][1] += field1053[arg1][0] * var7 + var8;
			field1053[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field1049[0] * 2; var10++) {
				field1053[0][var10] *= field1055;
			}
		}

		for (int var11 = 0; var11 < field1049[arg1] * 2; var11++) {
			field1054[arg1][var11] = (int) (field1053[arg1][var11] * 65536.0F);
		}

		return field1049[arg1] * 2;
	}

	@ObfuscatedName("PKLJDULJ.a(ILNHEPCMLW;LAUPOWMGG;)V")
	public final void method425(NHEPCMLW arg0, AUPOWMGG arg1) {
		int var3 = arg0.method349();
		field1049[0] = var3 >> 4;
		field1049[1] = var3 & 0xF;
		if (var3 == 0) {
			field1052[0] = field1052[1] = 0;
		} else {
			field1052[0] = arg0.method351();
			field1052[1] = arg0.method351();
			int var4 = arg0.method349();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1049[var5]; var6++) {
					field1050[var5][0][var6] = arg0.method351();
					field1051[var5][0][var6] = arg0.method351();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1049[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1050[var7][1][var8] = field1050[var7][0][var8];
						field1051[var7][1][var8] = field1051[var7][0][var8];
					} else {
						field1050[var7][1][var8] = arg0.method351();
						field1051[var7][1][var8] = arg0.method351();
					}
				}
			}

			if (var4 != 0 || field1052[1] != field1052[0]) {
				arg1.method2(arg0);
			}
		}
	}
}
