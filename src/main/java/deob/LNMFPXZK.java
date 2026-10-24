package deob;

@ObfuscatedName("LNMFPXZK")
public class LNMFPXZK {

	@ObfuscatedName("LNMFPXZK.c")
	public int[] field816 = new int[2];

	@ObfuscatedName("LNMFPXZK.d")
	public int[][][] field817 = new int[2][2][4];

	@ObfuscatedName("LNMFPXZK.e")
	public int[][][] field818 = new int[2][2][4];

	@ObfuscatedName("LNMFPXZK.f")
	public int[] field819 = new int[2];

	@ObfuscatedName("LNMFPXZK.g")
	public static float[][] field820 = new float[2][8];

	@ObfuscatedName("LNMFPXZK.h")
	public static int[][] field821 = new int[2][8];

	@ObfuscatedName("LNMFPXZK.i")
	public static float field822;

	@ObfuscatedName("LNMFPXZK.j")
	public static int field823;

	@ObfuscatedName("LNMFPXZK.a(FIII)F")
	public float method363(float arg0, int arg1, int arg2) {
		float var4 = (field818[arg2][1][arg1] - field818[arg2][0][arg1]) * arg0 + field818[arg2][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("LNMFPXZK.a(FI)F")
	public float method364(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("LNMFPXZK.b(FIII)F")
	public float method365(float arg0, int arg1, int arg2) {
		float var4 = (field817[arg1][1][arg2] - field817[arg1][0][arg2]) * arg0 + field817[arg1][0][arg2];
		var4 *= 1.2207031E-4F;
		return method364(var4);
	}

	@ObfuscatedName("LNMFPXZK.a(FII)I")
	public int method366(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field819[1] - field819[0]) * arg0 + field819[0];
			var3 *= 0.0030517578F;
			field822 = (float) Math.pow(0.1D, var3 / 20.0F);
			field823 = (int) (field822 * 65536.0F);
		}

		if (field816[arg1] == 0) {
			return 0;
		}

		float var4 = method363(arg0, 0, arg1);
		field820[arg1][0] = var4 * -2.0F * (float) Math.cos(method365(arg0, arg1, 0));
		field820[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field816[arg1]; var5++) {
			float var6 = method363(arg0, var5, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method365(arg0, arg1, var5));
			float var8 = var6 * var6;
			field820[arg1][var5 * 2 + 1] = field820[arg1][var5 * 2 - 1] * var8;
			field820[arg1][var5 * 2] = field820[arg1][var5 * 2 - 1] * var7 + field820[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field820[arg1][var9] += field820[arg1][var9 - 1] * var7 + field820[arg1][var9 - 2] * var8;
			}

			field820[arg1][1] += field820[arg1][0] * var7 + var8;
			field820[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field816[0] * 2; var10++) {
				field820[0][var10] *= field822;
			}
		}

		for (int var11 = 0; var11 < field816[arg1] * 2; var11++) {
			field821[arg1][var11] = (int) (field820[arg1][var11] * 65536.0F);
		}

		return field816[arg1] * 2;
	}

	@ObfuscatedName("LNMFPXZK.a(LSSKEPHYP;ILJHKSAGUC;)V")
	public final void method367(SSKEPHYP arg0, JHKSAGUC arg1) {
		int var3 = arg1.method306();
		field816[0] = var3 >> 4;
		field816[1] = var3 & 0xF;
		if (var3 == 0) {
			field819[0] = field819[1] = 0;
		} else {
			field819[0] = arg1.method308();
			field819[1] = arg1.method308();
			int var4 = arg1.method306();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field816[var5]; var6++) {
					field817[var5][0][var6] = arg1.method308();
					field818[var5][0][var6] = arg1.method308();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field816[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field817[var7][1][var8] = field817[var7][0][var8];
						field818[var7][1][var8] = field818[var7][0][var8];
					} else {
						field817[var7][1][var8] = arg1.method308();
						field818[var7][1][var8] = arg1.method308();
					}
				}
			}

			if (var4 != 0 || field819[1] != field819[0]) {
				arg0.method480(arg1);
			}
		}
	}
}
