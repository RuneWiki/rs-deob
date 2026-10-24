package deob;

@ObfuscatedName("KVKPXLHS")
public class KVKPXLHS {

	@ObfuscatedName("KVKPXLHS.c")
	public int[] field725 = new int[2];

	@ObfuscatedName("KVKPXLHS.d")
	public int[][][] field726 = new int[2][2][4];

	@ObfuscatedName("KVKPXLHS.e")
	public int[][][] field727 = new int[2][2][4];

	@ObfuscatedName("KVKPXLHS.f")
	public int[] field728 = new int[2];

	@ObfuscatedName("KVKPXLHS.g")
	public static float[][] field729 = new float[2][8];

	@ObfuscatedName("KVKPXLHS.h")
	public static int[][] field730 = new int[2][8];

	@ObfuscatedName("KVKPXLHS.i")
	public static float field731;

	@ObfuscatedName("KVKPXLHS.j")
	public static int field732;

	@ObfuscatedName("KVKPXLHS.a(IIFI)F")
	public float method265(int arg0, float arg1, int arg2) {
		float var4 = (field727[arg0][1][arg2] - field727[arg0][0][arg2]) * arg1 + field727[arg0][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("KVKPXLHS.a(IF)F")
	public float method266(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("KVKPXLHS.a(IFII)F")
	public float method267(float arg0, int arg1, int arg2) {
		float var4 = (field726[arg2][1][arg1] - field726[arg2][0][arg1]) * arg0 + field726[arg2][0][arg1];
		var4 *= 1.2207031E-4F;
		return method266(var4);
	}

	@ObfuscatedName("KVKPXLHS.a(IZF)I")
	public int method268(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field728[1] - field728[0]) * arg1 + field728[0];
			var3 *= 0.0030517578F;
			field731 = (float) Math.pow(0.1D, var3 / 20.0F);
			field732 = (int) (field731 * 65536.0F);
		}

		if (field725[arg0] == 0) {
			return 0;
		}

		float var4 = method265(arg0, arg1, 0);
		field729[arg0][0] = var4 * -2.0F * (float) Math.cos(method267(arg1, 0, arg0));
		field729[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field725[arg0]; var5++) {
			float var6 = method265(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method267(arg1, var5, arg0));
			float var8 = var6 * var6;
			field729[arg0][var5 * 2 + 1] = field729[arg0][var5 * 2 - 1] * var8;
			field729[arg0][var5 * 2] = field729[arg0][var5 * 2 - 1] * var7 + field729[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field729[arg0][var9] += field729[arg0][var9 - 1] * var7 + field729[arg0][var9 - 2] * var8;
			}

			field729[arg0][1] += field729[arg0][0] * var7 + var8;
			field729[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field725[0] * 2; var10++) {
				field729[0][var10] *= field731;
			}
		}

		for (int var11 = 0; var11 < field725[arg0] * 2; var11++) {
			field730[arg0][var11] = (int) (field729[arg0][var11] * 65536.0F);
		}

		return field725[arg0] * 2;
	}

	@ObfuscatedName("KVKPXLHS.a(BLRPKBYPNF;LMQZHAILV;)V")
	public final void method269(RPKBYPNF arg0, MQZHAILV arg1) {
		int var3 = arg1.method325();
		field725[0] = var3 >> 4;
		field725[1] = var3 & 0xF;
		if (var3 == 0) {
			field728[0] = field728[1] = 0;
		} else {
			field728[0] = arg1.method327();
			field728[1] = arg1.method327();
			int var4 = arg1.method325();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field725[var5]; var6++) {
					field726[var5][0][var6] = arg1.method327();
					field727[var5][0][var6] = arg1.method327();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field725[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field726[var7][1][var8] = field726[var7][0][var8];
						field727[var7][1][var8] = field727[var7][0][var8];
					} else {
						field726[var7][1][var8] = arg1.method327();
						field727[var7][1][var8] = arg1.method327();
					}
				}
			}

			if (var4 != 0 || field728[1] != field728[0]) {
				arg0.method474(arg1);
			}
		}
	}
}
