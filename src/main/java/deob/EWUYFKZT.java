package deob;

@ObfuscatedName("EWUYFKZT")
public class EWUYFKZT {

	@ObfuscatedName("EWUYFKZT.c")
	public int[] field671 = new int[2];

	@ObfuscatedName("EWUYFKZT.d")
	public int[][][] field672 = new int[2][2][4];

	@ObfuscatedName("EWUYFKZT.e")
	public int[][][] field673 = new int[2][2][4];

	@ObfuscatedName("EWUYFKZT.f")
	public int[] field674 = new int[2];

	@ObfuscatedName("EWUYFKZT.g")
	public static float[][] field675 = new float[2][8];

	@ObfuscatedName("EWUYFKZT.h")
	public static int[][] field676 = new int[2][8];

	@ObfuscatedName("EWUYFKZT.i")
	public static float field677;

	@ObfuscatedName("EWUYFKZT.j")
	public static int field678;

	@ObfuscatedName("EWUYFKZT.a(IFZI)F")
	public float method192(int arg0, float arg1, int arg2) {
		float var4 = (field673[arg0][1][arg2] - field673[arg0][0][arg2]) * arg1 + field673[arg0][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("EWUYFKZT.a(FB)F")
	public float method193(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("EWUYFKZT.a(IIIF)F")
	public float method194(int arg0, int arg1, float arg2) {
		float var4 = (field672[arg1][1][arg0] - field672[arg1][0][arg0]) * arg2 + field672[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method193(var4);
	}

	@ObfuscatedName("EWUYFKZT.a(IIF)I")
	public int method195(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field674[1] - field674[0]) * arg1 + field674[0];
			var3 *= 0.0030517578F;
			field677 = (float) Math.pow(0.1D, var3 / 20.0F);
			field678 = (int) (field677 * 65536.0F);
		}

		if (field671[arg0] == 0) {
			return 0;
		}

		float var4 = method192(arg0, arg1, 0);
		field675[arg0][0] = var4 * -2.0F * (float) Math.cos(method194(0, arg0, arg1));
		field675[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field671[arg0]; var5++) {
			float var6 = method192(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method194(var5, arg0, arg1));
			float var8 = var6 * var6;
			field675[arg0][var5 * 2 + 1] = field675[arg0][var5 * 2 - 1] * var8;
			field675[arg0][var5 * 2] = field675[arg0][var5 * 2 - 1] * var7 + field675[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field675[arg0][var9] += field675[arg0][var9 - 1] * var7 + field675[arg0][var9 - 2] * var8;
			}

			field675[arg0][1] += field675[arg0][0] * var7 + var8;
			field675[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field671[0] * 2; var10++) {
				field675[0][var10] *= field677;
			}
		}

		for (int var11 = 0; var11 < field671[arg0] * 2; var11++) {
			field676[arg0][var11] = (int) (field675[arg0][var11] * 65536.0F);
		}

		return field671[arg0] * 2;
	}

	@ObfuscatedName("EWUYFKZT.a(LTKPFKOXP;ILVRTTZTTM;)V")
	public final void method196(TKPFKOXP arg0, VRTTZTTM arg1) {
		int var3 = arg0.method529();
		field671[0] = var3 >> 4;
		field671[1] = var3 & 0xF;
		if (var3 == 0) {
			field674[0] = field674[1] = 0;
		} else {
			field674[0] = arg0.method531();
			field674[1] = arg0.method531();
			int var4 = arg0.method529();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field671[var5]; var6++) {
					field672[var5][0][var6] = arg0.method531();
					field673[var5][0][var6] = arg0.method531();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field671[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field672[var7][1][var8] = field672[var7][0][var8];
						field673[var7][1][var8] = field673[var7][0][var8];
					} else {
						field672[var7][1][var8] = arg0.method531();
						field673[var7][1][var8] = arg0.method531();
					}
				}
			}

			if (var4 != 0 || field674[1] != field674[0]) {
				arg1.method583(arg0);
			}
		}
	}
}
