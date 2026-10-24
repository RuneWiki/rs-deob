package deob;

@ObfuscatedName("QMCMKVTF")
public class QMCMKVTF {

	@ObfuscatedName("QMCMKVTF.e")
	public int[] field1023 = new int[2];

	@ObfuscatedName("QMCMKVTF.f")
	public int[][][] field1024 = new int[2][2][4];

	@ObfuscatedName("QMCMKVTF.g")
	public int[][][] field1025 = new int[2][2][4];

	@ObfuscatedName("QMCMKVTF.h")
	public int[] field1026 = new int[2];

	@ObfuscatedName("QMCMKVTF.i")
	public static float[][] field1027 = new float[2][8];

	@ObfuscatedName("QMCMKVTF.j")
	public static int[][] field1028 = new int[2][8];

	@ObfuscatedName("QMCMKVTF.k")
	public static float field1029;

	@ObfuscatedName("QMCMKVTF.l")
	public static int field1030;

	@ObfuscatedName("QMCMKVTF.a(IIIF)F")
	public float method368(int arg0, int arg1, float arg2) {
		float var4 = (field1025[arg0][1][arg1] - field1025[arg0][0][arg1]) * arg2 + field1025[arg0][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("QMCMKVTF.a(FI)F")
	public float method369(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("QMCMKVTF.b(IIIF)F")
	public float method370(int arg0, int arg1, float arg2) {
		float var4 = (field1024[arg1][1][arg0] - field1024[arg1][0][arg0]) * arg2 + field1024[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method369(var4);
	}

	@ObfuscatedName("QMCMKVTF.a(IZF)I")
	public int method371(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1026[1] - field1026[0]) * arg1 + field1026[0];
			var3 *= 0.0030517578F;
			field1029 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1030 = (int) (field1029 * 65536.0F);
		}

		if (field1023[arg0] == 0) {
			return 0;
		}

		float var4 = method368(arg0, 0, arg1);
		field1027[arg0][0] = var4 * -2.0F * (float) Math.cos(method370(0, arg0, arg1));
		field1027[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1023[arg0]; var5++) {
			float var6 = method368(arg0, var5, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method370(var5, arg0, arg1));
			float var8 = var6 * var6;
			field1027[arg0][var5 * 2 + 1] = field1027[arg0][var5 * 2 - 1] * var8;
			field1027[arg0][var5 * 2] = field1027[arg0][var5 * 2 - 1] * var7 + field1027[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1027[arg0][var9] += field1027[arg0][var9 - 1] * var7 + field1027[arg0][var9 - 2] * var8;
			}

			field1027[arg0][1] += field1027[arg0][0] * var7 + var8;
			field1027[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1023[0] * 2; var10++) {
				field1027[0][var10] *= field1029;
			}
		}

		for (int var11 = 0; var11 < field1023[arg0] * 2; var11++) {
			field1028[arg0][var11] = (int) (field1027[arg0][var11] * 65536.0F);
		}

		return field1023[arg0] * 2;
	}

	@ObfuscatedName("QMCMKVTF.a(ZLEMWAMCXW;LISLGIOFS;)V")
	public final void method372(EMWAMCXW arg0, ISLGIOFS arg1) {
		int var3 = arg0.method217();
		field1023[0] = var3 >> 4;
		field1023[1] = var3 & 0xF;
		if (var3 == 0) {
			field1026[0] = field1026[1] = 0;
		} else {
			field1026[0] = arg0.method219();
			field1026[1] = arg0.method219();
			int var4 = arg0.method217();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1023[var5]; var6++) {
					field1024[var5][0][var6] = arg0.method219();
					field1025[var5][0][var6] = arg0.method219();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1023[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1024[var7][1][var8] = field1024[var7][0][var8];
						field1025[var7][1][var8] = field1025[var7][0][var8];
					} else {
						field1024[var7][1][var8] = arg0.method219();
						field1025[var7][1][var8] = arg0.method219();
					}
				}
			}

			if (var4 != 0 || field1026[1] != field1026[0]) {
				arg1.method296(arg0);
			}
		}
	}
}
