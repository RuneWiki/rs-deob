package deob;

@ObfuscatedName("BMQRLUHC")
public class BMQRLUHC {

	@ObfuscatedName("BMQRLUHC.b")
	public int[] field21 = new int[2];

	@ObfuscatedName("BMQRLUHC.c")
	public int[][][] field22 = new int[2][2][4];

	@ObfuscatedName("BMQRLUHC.d")
	public int[][][] field23 = new int[2][2][4];

	@ObfuscatedName("BMQRLUHC.e")
	public int[] field24 = new int[2];

	@ObfuscatedName("BMQRLUHC.f")
	public static float[][] field25 = new float[2][8];

	@ObfuscatedName("BMQRLUHC.g")
	public static int[][] field26 = new int[2][8];

	@ObfuscatedName("BMQRLUHC.h")
	public static float field27;

	@ObfuscatedName("BMQRLUHC.i")
	public static int field28;

	@ObfuscatedName("BMQRLUHC.a(IIIF)F")
	public float method55(int arg0, int arg1, float arg2) {
		float var4 = (field23[arg0][1][arg1] - field23[arg0][0][arg1]) * arg2 + field23[arg0][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("BMQRLUHC.a(IF)F")
	public float method56(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("BMQRLUHC.a(FIBI)F")
	public float method57(float arg0, int arg1, int arg2) {
		float var4 = (field22[arg1][1][arg2] - field22[arg1][0][arg2]) * arg0 + field22[arg1][0][arg2];
		var4 *= 1.2207031E-4F;
		return method56(var4);
	}

	@ObfuscatedName("BMQRLUHC.a(IFI)I")
	public int method58(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field24[1] - field24[0]) * arg0 + field24[0];
			var3 *= 0.0030517578F;
			field27 = (float) Math.pow(0.1D, var3 / 20.0F);
			field28 = (int) (field27 * 65536.0F);
		}

		if (field21[arg1] == 0) {
			return 0;
		}

		float var4 = method55(arg1, 0, arg0);
		field25[arg1][0] = var4 * -2.0F * (float) Math.cos(method57(arg0, arg1, 0));
		field25[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field21[arg1]; var5++) {
			float var6 = method55(arg1, var5, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method57(arg0, arg1, var5));
			float var8 = var6 * var6;
			field25[arg1][var5 * 2 + 1] = field25[arg1][var5 * 2 - 1] * var8;
			field25[arg1][var5 * 2] = field25[arg1][var5 * 2 - 1] * var7 + field25[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field25[arg1][var9] += field25[arg1][var9 - 1] * var7 + field25[arg1][var9 - 2] * var8;
			}

			field25[arg1][1] += field25[arg1][0] * var7 + var8;
			field25[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field21[0] * 2; var10++) {
				field25[0][var10] *= field27;
			}
		}

		for (int var11 = 0; var11 < field21[arg1] * 2; var11++) {
			field26[arg1][var11] = (int) (field25[arg1][var11] * 65536.0F);
		}

		return field21[arg1] * 2;
	}

	@ObfuscatedName("BMQRLUHC.a(BLPGNBHFUF;LYJSRODCC;)V")
	public final void method59(PGNBHFUF arg0, YJSRODCC arg1) {
		int var3 = arg0.method420();
		field21[0] = var3 >> 4;
		field21[1] = var3 & 0xF;
		if (var3 == 0) {
			field24[0] = field24[1] = 0;
		} else {
			field24[0] = arg0.method422();
			field24[1] = arg0.method422();
			int var4 = arg0.method420();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field21[var5]; var6++) {
					field22[var5][0][var6] = arg0.method422();
					field23[var5][0][var6] = arg0.method422();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field21[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field22[var7][1][var8] = field22[var7][0][var8];
						field23[var7][1][var8] = field23[var7][0][var8];
					} else {
						field22[var7][1][var8] = arg0.method422();
						field23[var7][1][var8] = arg0.method422();
					}
				}
			}

			if (var4 != 0 || field24[1] != field24[0]) {
				arg1.method572(arg0);
			}
		}
	}
}
