package deob;

@ObfuscatedName("LOQKYCGM")
public class LOQKYCGM {

	@ObfuscatedName("LOQKYCGM.d")
	public int[] field864 = new int[2];

	@ObfuscatedName("LOQKYCGM.e")
	public int[][][] field865 = new int[2][2][4];

	@ObfuscatedName("LOQKYCGM.f")
	public int[][][] field866 = new int[2][2][4];

	@ObfuscatedName("LOQKYCGM.g")
	public int[] field867 = new int[2];

	@ObfuscatedName("LOQKYCGM.h")
	public static float[][] field868 = new float[2][8];

	@ObfuscatedName("LOQKYCGM.i")
	public static int[][] field869 = new int[2][8];

	@ObfuscatedName("LOQKYCGM.j")
	public static float field870;

	@ObfuscatedName("LOQKYCGM.k")
	public static int field871;

	@ObfuscatedName("LOQKYCGM.a(FIII)F")
	public float method303(float arg0, int arg1, int arg2) {
		float var4 = (field866[arg1][1][arg2] - field866[arg1][0][arg2]) * arg0 + field866[arg1][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("LOQKYCGM.a(ZF)F")
	public float method304(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("LOQKYCGM.a(IIIF)F")
	public float method305(int arg0, int arg1, float arg2) {
		float var4 = (field865[arg0][1][arg1] - field865[arg0][0][arg1]) * arg2 + field865[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method304(var4);
	}

	@ObfuscatedName("LOQKYCGM.a(FIB)I")
	public int method306(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field867[1] - field867[0]) * arg0 + field867[0];
			var3 *= 0.0030517578F;
			field870 = (float) Math.pow(0.1D, var3 / 20.0F);
			field871 = (int) (field870 * 65536.0F);
		}

		if (field864[arg1] == 0) {
			return 0;
		}

		float var4 = method303(arg0, arg1, 0);
		field868[arg1][0] = var4 * -2.0F * (float) Math.cos(method305(arg1, 0, arg0));
		field868[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field864[arg1]; var5++) {
			float var6 = method303(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method305(arg1, var5, arg0));
			float var8 = var6 * var6;
			field868[arg1][var5 * 2 + 1] = field868[arg1][var5 * 2 - 1] * var8;
			field868[arg1][var5 * 2] = field868[arg1][var5 * 2 - 1] * var7 + field868[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field868[arg1][var9] += field868[arg1][var9 - 1] * var7 + field868[arg1][var9 - 2] * var8;
			}

			field868[arg1][1] += field868[arg1][0] * var7 + var8;
			field868[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field864[0] * 2; var10++) {
				field868[0][var10] *= field870;
			}
		}

		for (int var11 = 0; var11 < field864[arg1] * 2; var11++) {
			field869[arg1][var11] = (int) (field868[arg1][var11] * 65536.0F);
		}

		return field864[arg1] * 2;
	}

	@ObfuscatedName("LOQKYCGM.a(ILTMVRZUVH;LGHHPHSRU;)V")
	public final void method307(TMVRZUVH arg0, GHHPHSRU arg1) {
		int var3 = arg1.method202();
		field864[0] = var3 >> 4;
		field864[1] = var3 & 0xF;
		if (var3 == 0) {
			field867[0] = field867[1] = 0;
		} else {
			field867[0] = arg1.method204();
			field867[1] = arg1.method204();
			int var4 = arg1.method202();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field864[var5]; var6++) {
					field865[var5][0][var6] = arg1.method204();
					field866[var5][0][var6] = arg1.method204();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field864[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field865[var7][1][var8] = field865[var7][0][var8];
						field866[var7][1][var8] = field866[var7][0][var8];
					} else {
						field865[var7][1][var8] = arg1.method204();
						field866[var7][1][var8] = arg1.method204();
					}
				}
			}

			if (var4 != 0 || field867[1] != field867[0]) {
				arg0.method489(arg1);
			}
		}
	}
}
