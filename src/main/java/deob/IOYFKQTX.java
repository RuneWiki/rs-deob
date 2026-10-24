package deob;

@ObfuscatedName("IOYFKQTX")
public class IOYFKQTX {

	@ObfuscatedName("IOYFKQTX.d")
	public int[] field846 = new int[2];

	@ObfuscatedName("IOYFKQTX.e")
	public int[][][] field847 = new int[2][2][4];

	@ObfuscatedName("IOYFKQTX.f")
	public int[][][] field848 = new int[2][2][4];

	@ObfuscatedName("IOYFKQTX.g")
	public int[] field849 = new int[2];

	@ObfuscatedName("IOYFKQTX.h")
	public static float[][] field850 = new float[2][8];

	@ObfuscatedName("IOYFKQTX.i")
	public static int[][] field851 = new int[2][8];

	@ObfuscatedName("IOYFKQTX.j")
	public static float field852;

	@ObfuscatedName("IOYFKQTX.k")
	public static int field853;

	@ObfuscatedName("IOYFKQTX.a(IIIF)F")
	public float method361(int arg0, int arg1, float arg2) {
		float var4 = (field848[arg1][1][arg0] - field848[arg1][0][arg0]) * arg2 + field848[arg1][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("IOYFKQTX.a(BF)F")
	public float method362(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("IOYFKQTX.a(IIZF)F")
	public float method363(int arg0, int arg1, float arg2) {
		float var4 = (field847[arg1][1][arg0] - field847[arg1][0][arg0]) * arg2 + field847[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method362(var4);
	}

	@ObfuscatedName("IOYFKQTX.a(IFI)I")
	public int method364(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field849[1] - field849[0]) * arg1 + field849[0];
			var3 *= 0.0030517578F;
			field852 = (float) Math.pow(0.1D, var3 / 20.0F);
			field853 = (int) (field852 * 65536.0F);
		}

		if (field846[arg0] == 0) {
			return 0;
		}

		float var4 = method361(0, arg0, arg1);
		field850[arg0][0] = var4 * -2.0F * (float) Math.cos(method363(0, arg0, arg1));
		field850[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field846[arg0]; var5++) {
			float var6 = method361(var5, arg0, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method363(var5, arg0, arg1));
			float var8 = var6 * var6;
			field850[arg0][var5 * 2 + 1] = field850[arg0][var5 * 2 - 1] * var8;
			field850[arg0][var5 * 2] = field850[arg0][var5 * 2 - 1] * var7 + field850[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field850[arg0][var9] += field850[arg0][var9 - 1] * var7 + field850[arg0][var9 - 2] * var8;
			}

			field850[arg0][1] += field850[arg0][0] * var7 + var8;
			field850[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field846[0] * 2; var10++) {
				field850[0][var10] *= field852;
			}
		}

		for (int var11 = 0; var11 < field846[arg0] * 2; var11++) {
			field851[arg0][var11] = (int) (field850[arg0][var11] * 65536.0F);
		}

		return field846[arg0] * 2;
	}

	@ObfuscatedName("IOYFKQTX.a(LANPSASQF;LEYMNCFMK;I)V")
	public final void method365(ANPSASQF arg0, EYMNCFMK arg1) {
		int var3 = arg1.method239();
		field846[0] = var3 >> 4;
		field846[1] = var3 & 0xF;
		if (var3 == 0) {
			field849[0] = field849[1] = 0;
		} else {
			field849[0] = arg1.method241();
			field849[1] = arg1.method241();
			int var4 = arg1.method239();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field846[var5]; var6++) {
					field847[var5][0][var6] = arg1.method241();
					field848[var5][0][var6] = arg1.method241();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field846[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field847[var7][1][var8] = field847[var7][0][var8];
						field848[var7][1][var8] = field848[var7][0][var8];
					} else {
						field847[var7][1][var8] = arg1.method241();
						field848[var7][1][var8] = arg1.method241();
					}
				}
			}

			if (var4 != 0 || field849[1] != field849[0]) {
				arg0.method4(arg1);
			}
		}
	}
}
