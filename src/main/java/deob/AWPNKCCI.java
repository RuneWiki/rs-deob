package deob;

@ObfuscatedName("AWPNKCCI")
public class AWPNKCCI {

	@ObfuscatedName("AWPNKCCI.c")
	public int[] field17 = new int[2];

	@ObfuscatedName("AWPNKCCI.d")
	public int[][][] field18 = new int[2][2][4];

	@ObfuscatedName("AWPNKCCI.e")
	public int[][][] field19 = new int[2][2][4];

	@ObfuscatedName("AWPNKCCI.f")
	public int[] field20 = new int[2];

	@ObfuscatedName("AWPNKCCI.g")
	public static float[][] field21 = new float[2][8];

	@ObfuscatedName("AWPNKCCI.h")
	public static int[][] field22 = new int[2][8];

	@ObfuscatedName("AWPNKCCI.i")
	public static float field23;

	@ObfuscatedName("AWPNKCCI.j")
	public static int field24;

	@ObfuscatedName("AWPNKCCI.a(IFII)F")
	public float method16(float arg0, int arg1, int arg2) {
		float var4 = (field19[arg1][1][arg2] - field19[arg1][0][arg2]) * arg0 + field19[arg1][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("AWPNKCCI.a(FZ)F")
	public float method17(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("AWPNKCCI.a(IZIF)F")
	public float method18(int arg0, int arg1, float arg2) {
		float var4 = (field18[arg1][1][arg0] - field18[arg1][0][arg0]) * arg2 + field18[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method17(var4);
	}

	@ObfuscatedName("AWPNKCCI.a(FII)I")
	public int method19(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field20[1] - field20[0]) * arg0 + field20[0];
			var3 *= 0.0030517578F;
			field23 = (float) Math.pow(0.1D, var3 / 20.0F);
			field24 = (int) (field23 * 65536.0F);
		}

		if (field17[arg1] == 0) {
			return 0;
		}

		float var4 = method16(arg0, arg1, 0);
		field21[arg1][0] = var4 * -2.0F * (float) Math.cos(method18(0, arg1, arg0));
		field21[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field17[arg1]; var5++) {
			float var6 = method16(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method18(var5, arg1, arg0));
			float var8 = var6 * var6;
			field21[arg1][var5 * 2 + 1] = field21[arg1][var5 * 2 - 1] * var8;
			field21[arg1][var5 * 2] = field21[arg1][var5 * 2 - 1] * var7 + field21[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field21[arg1][var9] += field21[arg1][var9 - 1] * var7 + field21[arg1][var9 - 2] * var8;
			}

			field21[arg1][1] += field21[arg1][0] * var7 + var8;
			field21[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field17[0] * 2; var10++) {
				field21[0][var10] *= field23;
			}
		}

		for (int var11 = 0; var11 < field17[arg1] * 2; var11++) {
			field22[arg1][var11] = (int) (field21[arg1][var11] * 65536.0F);
		}

		return field17[arg1] * 2;
	}

	@ObfuscatedName("AWPNKCCI.a(ILMUKVLYLC;LLRDFYKJP;)V")
	public final void method20(MUKVLYLC arg0, LRDFYKJP arg1) {
		int var3 = arg0.method292();
		field17[0] = var3 >> 4;
		field17[1] = var3 & 0xF;
		if (var3 == 0) {
			field20[0] = field20[1] = 0;
		} else {
			field20[0] = arg0.method294();
			field20[1] = arg0.method294();
			int var4 = arg0.method292();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field17[var5]; var6++) {
					field18[var5][0][var6] = arg0.method294();
					field19[var5][0][var6] = arg0.method294();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field17[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field18[var7][1][var8] = field18[var7][0][var8];
						field19[var7][1][var8] = field19[var7][0][var8];
					} else {
						field18[var7][1][var8] = arg0.method294();
						field19[var7][1][var8] = arg0.method294();
					}
				}
			}

			if (var4 != 0 || field20[1] != field20[0]) {
				arg1.method262(arg0);
			}
		}
	}
}
