package deob;

@ObfuscatedName("IIXKZWNC")
public class IIXKZWNC {

	@ObfuscatedName("IIXKZWNC.e")
	public int[] field925 = new int[2];

	@ObfuscatedName("IIXKZWNC.f")
	public int[][][] field926 = new int[2][2][4];

	@ObfuscatedName("IIXKZWNC.g")
	public int[][][] field927 = new int[2][2][4];

	@ObfuscatedName("IIXKZWNC.h")
	public int[] field928 = new int[2];

	@ObfuscatedName("IIXKZWNC.i")
	public static float[][] field929 = new float[2][8];

	@ObfuscatedName("IIXKZWNC.j")
	public static int[][] field930 = new int[2][8];

	@ObfuscatedName("IIXKZWNC.k")
	public static float field931;

	@ObfuscatedName("IIXKZWNC.l")
	public static int field932;

	@ObfuscatedName("IIXKZWNC.a(FIII)F")
	public float method394(float arg0, int arg1, int arg2) {
		float var4 = (field927[arg2][1][arg1] - field927[arg2][0][arg1]) * arg0 + field927[arg2][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("IIXKZWNC.a(IF)F")
	public float method395(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("IIXKZWNC.a(IFII)F")
	public float method396(float arg0, int arg1, int arg2) {
		float var4 = (field926[arg2][1][arg1] - field926[arg2][0][arg1]) * arg0 + field926[arg2][0][arg1];
		var4 *= 1.2207031E-4F;
		return method395(var4);
	}

	@ObfuscatedName("IIXKZWNC.a(FZI)I")
	public int method397(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field928[1] - field928[0]) * arg0 + field928[0];
			var3 *= 0.0030517578F;
			field931 = (float) Math.pow(0.1D, var3 / 20.0F);
			field932 = (int) (field931 * 65536.0F);
		}

		if (field925[arg1] == 0) {
			return 0;
		}

		float var4 = method394(arg0, 0, arg1);
		field929[arg1][0] = var4 * -2.0F * (float) Math.cos(method396(arg0, 0, arg1));
		field929[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field925[arg1]; var5++) {
			float var6 = method394(arg0, var5, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method396(arg0, var5, arg1));
			float var8 = var6 * var6;
			field929[arg1][var5 * 2 + 1] = field929[arg1][var5 * 2 - 1] * var8;
			field929[arg1][var5 * 2] = field929[arg1][var5 * 2 - 1] * var7 + field929[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field929[arg1][var9] += field929[arg1][var9 - 1] * var7 + field929[arg1][var9 - 2] * var8;
			}

			field929[arg1][1] += field929[arg1][0] * var7 + var8;
			field929[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field925[0] * 2; var10++) {
				field929[0][var10] *= field931;
			}
		}

		for (int var11 = 0; var11 < field925[arg1] * 2; var11++) {
			field930[arg1][var11] = (int) (field929[arg1][var11] * 65536.0F);
		}

		return field925[arg1] * 2;
	}

	@ObfuscatedName("IIXKZWNC.a(LVQRBOQUI;ILCKBTFRZM;)V")
	public final void method398(VQRBOQUI arg0, CKBTFRZM arg1) {
		int var3 = arg1.method44();
		field925[0] = var3 >> 4;
		field925[1] = var3 & 0xF;
		if (var3 == 0) {
			field928[0] = field928[1] = 0;
		} else {
			field928[0] = arg1.method46();
			field928[1] = arg1.method46();
			int var4 = arg1.method44();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field925[var5]; var6++) {
					field926[var5][0][var6] = arg1.method46();
					field927[var5][0][var6] = arg1.method46();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field925[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field926[var7][1][var8] = field926[var7][0][var8];
						field927[var7][1][var8] = field927[var7][0][var8];
					} else {
						field926[var7][1][var8] = arg1.method46();
						field927[var7][1][var8] = arg1.method46();
					}
				}
			}

			if (var4 != 0 || field928[1] != field928[0]) {
				arg0.method579(arg1);
			}
		}
	}
}
