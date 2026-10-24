package deob;

@ObfuscatedName("CGCAZMIE")
public class CGCAZMIE {

	@ObfuscatedName("CGCAZMIE.e")
	public int[] field53 = new int[2];

	@ObfuscatedName("CGCAZMIE.f")
	public int[][][] field54 = new int[2][2][4];

	@ObfuscatedName("CGCAZMIE.g")
	public int[][][] field55 = new int[2][2][4];

	@ObfuscatedName("CGCAZMIE.h")
	public int[] field56 = new int[2];

	@ObfuscatedName("CGCAZMIE.i")
	public static float[][] field57 = new float[2][8];

	@ObfuscatedName("CGCAZMIE.j")
	public static int[][] field58 = new int[2][8];

	@ObfuscatedName("CGCAZMIE.k")
	public static float field59;

	@ObfuscatedName("CGCAZMIE.l")
	public static int field60;

	@ObfuscatedName("CGCAZMIE.a(IIFI)F")
	public float method27(int arg0, int arg1, float arg2) {
		float var4 = (field55[arg0][1][arg1] - field55[arg0][0][arg1]) * arg2 + field55[arg0][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("CGCAZMIE.a(ZF)F")
	public float method28(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("CGCAZMIE.a(IFIB)F")
	public float method29(int arg0, float arg1, int arg2) {
		float var4 = (field54[arg2][1][arg0] - field54[arg2][0][arg0]) * arg1 + field54[arg2][0][arg0];
		var4 *= 1.2207031E-4F;
		return method28(var4);
	}

	@ObfuscatedName("CGCAZMIE.a(FII)I")
	public int method30(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field56[1] - field56[0]) * arg0 + field56[0];
			var3 *= 0.0030517578F;
			field59 = (float) Math.pow(0.1D, var3 / 20.0F);
			field60 = (int) (field59 * 65536.0F);
		}

		if (field53[arg1] == 0) {
			return 0;
		}

		float var4 = method27(arg1, 0, arg0);
		field57[arg1][0] = var4 * -2.0F * (float) Math.cos(method29(0, arg0, arg1));
		field57[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field53[arg1]; var5++) {
			float var6 = method27(arg1, var5, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method29(var5, arg0, arg1));
			float var8 = var6 * var6;
			field57[arg1][var5 * 2 + 1] = field57[arg1][var5 * 2 - 1] * var8;
			field57[arg1][var5 * 2] = field57[arg1][var5 * 2 - 1] * var7 + field57[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field57[arg1][var9] += field57[arg1][var9 - 1] * var7 + field57[arg1][var9 - 2] * var8;
			}

			field57[arg1][1] += field57[arg1][0] * var7 + var8;
			field57[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field53[0] * 2; var10++) {
				field57[0][var10] *= field59;
			}
		}

		for (int var11 = 0; var11 < field53[arg1] * 2; var11++) {
			field58[arg1][var11] = (int) (field57[arg1][var11] * 65536.0F);
		}

		return field53[arg1] * 2;
	}

	@ObfuscatedName("CGCAZMIE.a(ZLXQPFGONL;LQOBPOZUC;)V")
	public final void method31(XQPFGONL arg0, QOBPOZUC arg1) {
		int var3 = arg0.method478();
		field53[0] = var3 >> 4;
		field53[1] = var3 & 0xF;
		if (var3 == 0) {
			field56[0] = field56[1] = 0;
		} else {
			field56[0] = arg0.method480();
			field56[1] = arg0.method480();
			int var4 = arg0.method478();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field53[var5]; var6++) {
					field54[var5][0][var6] = arg0.method480();
					field55[var5][0][var6] = arg0.method480();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field53[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field54[var7][1][var8] = field54[var7][0][var8];
						field55[var7][1][var8] = field55[var7][0][var8];
					} else {
						field54[var7][1][var8] = arg0.method480();
						field55[var7][1][var8] = arg0.method480();
					}
				}
			}

			if (var4 != 0 || field56[1] != field56[0]) {
				arg1.method391(arg0);
			}
		}
	}
}
