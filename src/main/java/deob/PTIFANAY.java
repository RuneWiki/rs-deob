package deob;

@ObfuscatedName("PTIFANAY")
public class PTIFANAY {

	@ObfuscatedName("PTIFANAY.c")
	public int[] field978 = new int[2];

	@ObfuscatedName("PTIFANAY.d")
	public int[][][] field979 = new int[2][2][4];

	@ObfuscatedName("PTIFANAY.e")
	public int[][][] field980 = new int[2][2][4];

	@ObfuscatedName("PTIFANAY.f")
	public int[] field981 = new int[2];

	@ObfuscatedName("PTIFANAY.g")
	public static float[][] field982 = new float[2][8];

	@ObfuscatedName("PTIFANAY.h")
	public static int[][] field983 = new int[2][8];

	@ObfuscatedName("PTIFANAY.i")
	public static float field984;

	@ObfuscatedName("PTIFANAY.j")
	public static int field985;

	@ObfuscatedName("PTIFANAY.a(IIIF)F")
	public float method431(int arg0, int arg1, float arg2) {
		float var4 = (field980[arg1][1][arg0] - field980[arg1][0][arg0]) * arg2 + field980[arg1][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("PTIFANAY.a(IF)F")
	public float method432(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("PTIFANAY.b(IIIF)F")
	public float method433(int arg0, int arg1, float arg2) {
		float var4 = (field979[arg1][1][arg0] - field979[arg1][0][arg0]) * arg2 + field979[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method432(var4);
	}

	@ObfuscatedName("PTIFANAY.a(IFI)I")
	public int method434(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field981[1] - field981[0]) * arg0 + field981[0];
			var3 *= 0.0030517578F;
			field984 = (float) Math.pow(0.1D, var3 / 20.0F);
			field985 = (int) (field984 * 65536.0F);
		}

		if (field978[arg1] == 0) {
			return 0;
		}

		float var4 = method431(0, arg1, arg0);
		field982[arg1][0] = var4 * -2.0F * (float) Math.cos(method433(0, arg1, arg0));
		field982[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field978[arg1]; var5++) {
			float var6 = method431(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method433(var5, arg1, arg0));
			float var8 = var6 * var6;
			field982[arg1][var5 * 2 + 1] = field982[arg1][var5 * 2 - 1] * var8;
			field982[arg1][var5 * 2] = field982[arg1][var5 * 2 - 1] * var7 + field982[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field982[arg1][var9] += field982[arg1][var9 - 1] * var7 + field982[arg1][var9 - 2] * var8;
			}

			field982[arg1][1] += field982[arg1][0] * var7 + var8;
			field982[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field978[0] * 2; var10++) {
				field982[0][var10] *= field984;
			}
		}

		for (int var11 = 0; var11 < field978[arg1] * 2; var11++) {
			field983[arg1][var11] = (int) (field982[arg1][var11] * 65536.0F);
		}

		return field978[arg1] * 2;
	}

	@ObfuscatedName("PTIFANAY.a(BLBSNPYLEV;LHCHPPCNY;)V")
	public final void method435(BSNPYLEV arg0, HCHPPCNY arg1) {
		int var3 = arg0.method47();
		field978[0] = var3 >> 4;
		field978[1] = var3 & 0xF;
		if (var3 == 0) {
			field981[0] = field981[1] = 0;
		} else {
			field981[0] = arg0.method49();
			field981[1] = arg0.method49();
			int var4 = arg0.method47();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field978[var5]; var6++) {
					field979[var5][0][var6] = arg0.method49();
					field980[var5][0][var6] = arg0.method49();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field978[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field979[var7][1][var8] = field979[var7][0][var8];
						field980[var7][1][var8] = field980[var7][0][var8];
					} else {
						field979[var7][1][var8] = arg0.method49();
						field980[var7][1][var8] = arg0.method49();
					}
				}
			}

			if (var4 != 0 || field981[1] != field981[0]) {
				arg1.method317(arg0);
			}
		}
	}
}
