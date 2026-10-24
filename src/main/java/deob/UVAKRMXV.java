package deob;

@ObfuscatedName("UVAKRMXV")
public class UVAKRMXV {

	@ObfuscatedName("UVAKRMXV.b")
	public int[] field1239 = new int[2];

	@ObfuscatedName("UVAKRMXV.c")
	public int[][][] field1240 = new int[2][2][4];

	@ObfuscatedName("UVAKRMXV.d")
	public int[][][] field1241 = new int[2][2][4];

	@ObfuscatedName("UVAKRMXV.e")
	public int[] field1242 = new int[2];

	@ObfuscatedName("UVAKRMXV.f")
	public static float[][] field1243 = new float[2][8];

	@ObfuscatedName("UVAKRMXV.g")
	public static int[][] field1244 = new int[2][8];

	@ObfuscatedName("UVAKRMXV.h")
	public static float field1245;

	@ObfuscatedName("UVAKRMXV.i")
	public static int field1246;

	@ObfuscatedName("UVAKRMXV.a(FIII)F")
	public float method471(float arg0, int arg1, int arg2) {
		float var4 = (field1241[arg1][1][arg2] - field1241[arg1][0][arg2]) * arg0 + field1241[arg1][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("UVAKRMXV.a(FI)F")
	public float method472(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("UVAKRMXV.a(IFII)F")
	public float method473(int arg0, float arg1, int arg2) {
		float var4 = (field1240[arg0][1][arg2] - field1240[arg0][0][arg2]) * arg1 + field1240[arg0][0][arg2];
		var4 *= 1.2207031E-4F;
		return method472(var4);
	}

	@ObfuscatedName("UVAKRMXV.a(ZFI)I")
	public int method474(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field1242[1] - field1242[0]) * arg0 + field1242[0];
			var3 *= 0.0030517578F;
			field1245 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1246 = (int) (field1245 * 65536.0F);
		}

		if (field1239[arg1] == 0) {
			return 0;
		}

		float var4 = method471(arg0, arg1, 0);
		field1243[arg1][0] = var4 * -2.0F * (float) Math.cos(method473(arg1, arg0, 0));
		field1243[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field1239[arg1]; var5++) {
			float var6 = method471(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method473(arg1, arg0, var5));
			float var8 = var6 * var6;
			field1243[arg1][var5 * 2 + 1] = field1243[arg1][var5 * 2 - 1] * var8;
			field1243[arg1][var5 * 2] = field1243[arg1][var5 * 2 - 1] * var7 + field1243[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1243[arg1][var9] += field1243[arg1][var9 - 1] * var7 + field1243[arg1][var9 - 2] * var8;
			}

			field1243[arg1][1] += field1243[arg1][0] * var7 + var8;
			field1243[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field1239[0] * 2; var10++) {
				field1243[0][var10] *= field1245;
			}
		}

		for (int var11 = 0; var11 < field1239[arg1] * 2; var11++) {
			field1244[arg1][var11] = (int) (field1243[arg1][var11] * 65536.0F);
		}

		return field1239[arg1] * 2;
	}

	@ObfuscatedName("UVAKRMXV.a(LRRWCTNMK;LEILHLJCE;I)V")
	public final void method475(RRWCTNMK arg0, EILHLJCE arg1) {
		int var3 = arg1.method224();
		field1239[0] = var3 >> 4;
		field1239[1] = var3 & 0xF;
		if (var3 == 0) {
			field1242[0] = field1242[1] = 0;
		} else {
			field1242[0] = arg1.method226();
			field1242[1] = arg1.method226();
			int var4 = arg1.method224();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1239[var5]; var6++) {
					field1240[var5][0][var6] = arg1.method226();
					field1241[var5][0][var6] = arg1.method226();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1239[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1240[var7][1][var8] = field1240[var7][0][var8];
						field1241[var7][1][var8] = field1241[var7][0][var8];
					} else {
						field1240[var7][1][var8] = arg1.method226();
						field1241[var7][1][var8] = arg1.method226();
					}
				}
			}

			if (var4 != 0 || field1242[1] != field1242[0]) {
				arg0.method444(arg1);
			}
		}
	}
}
