package deob;

@ObfuscatedName("DJKDKZEW")
public class DJKDKZEW {

	@ObfuscatedName("DJKDKZEW.b")
	public int[] field577 = new int[2];

	@ObfuscatedName("DJKDKZEW.c")
	public int[][][] field578 = new int[2][2][4];

	@ObfuscatedName("DJKDKZEW.d")
	public int[][][] field579 = new int[2][2][4];

	@ObfuscatedName("DJKDKZEW.e")
	public int[] field580 = new int[2];

	@ObfuscatedName("DJKDKZEW.f")
	public static float[][] field581 = new float[2][8];

	@ObfuscatedName("DJKDKZEW.g")
	public static int[][] field582 = new int[2][8];

	@ObfuscatedName("DJKDKZEW.h")
	public static float field583;

	@ObfuscatedName("DJKDKZEW.i")
	public static int field584;

	@ObfuscatedName("DJKDKZEW.a(IIFI)F")
	public float method209(int arg0, float arg1, int arg2) {
		float var4 = (field579[arg2][1][arg0] - field579[arg2][0][arg0]) * arg1 + field579[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("DJKDKZEW.a(IF)F")
	public float method210(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("DJKDKZEW.a(IIIF)F")
	public float method211(int arg0, int arg1, float arg2) {
		float var4 = (field578[arg0][1][arg1] - field578[arg0][0][arg1]) * arg2 + field578[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method210(var4);
	}

	@ObfuscatedName("DJKDKZEW.a(FZI)I")
	public int method212(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field580[1] - field580[0]) * arg0 + field580[0];
			var3 *= 0.0030517578F;
			field583 = (float) Math.pow(0.1D, var3 / 20.0F);
			field584 = (int) (field583 * 65536.0F);
		}

		if (field577[arg1] == 0) {
			return 0;
		}

		float var4 = method209(0, arg0, arg1);
		field581[arg1][0] = var4 * -2.0F * (float) Math.cos(method211(arg1, 0, arg0));
		field581[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field577[arg1]; var5++) {
			float var6 = method209(var5, arg0, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method211(arg1, var5, arg0));
			float var8 = var6 * var6;
			field581[arg1][var5 * 2 + 1] = field581[arg1][var5 * 2 - 1] * var8;
			field581[arg1][var5 * 2] = field581[arg1][var5 * 2 - 1] * var7 + field581[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field581[arg1][var9] += field581[arg1][var9 - 1] * var7 + field581[arg1][var9 - 2] * var8;
			}

			field581[arg1][1] += field581[arg1][0] * var7 + var8;
			field581[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field577[0] * 2; var10++) {
				field581[0][var10] *= field583;
			}
		}

		for (int var11 = 0; var11 < field577[arg1] * 2; var11++) {
			field582[arg1][var11] = (int) (field581[arg1][var11] * 65536.0F);
		}

		return field577[arg1] * 2;
	}

	@ObfuscatedName("DJKDKZEW.a(LENGZWEMK;LPKHWFJLM;I)V")
	public final void method213(ENGZWEMK arg0, PKHWFJLM arg1) {
		int var3 = arg1.method330();
		field577[0] = var3 >> 4;
		field577[1] = var3 & 0xF;
		if (var3 == 0) {
			field580[0] = field580[1] = 0;
		} else {
			field580[0] = arg1.method332();
			field580[1] = arg1.method332();
			int var4 = arg1.method330();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field577[var5]; var6++) {
					field578[var5][0][var6] = arg1.method332();
					field579[var5][0][var6] = arg1.method332();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field577[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field578[var7][1][var8] = field578[var7][0][var8];
						field579[var7][1][var8] = field579[var7][0][var8];
					} else {
						field578[var7][1][var8] = arg1.method332();
						field579[var7][1][var8] = arg1.method332();
					}
				}
			}

			if (var4 != 0 || field580[1] != field580[0]) {
				arg0.method222(arg1);
			}
		}
	}
}
