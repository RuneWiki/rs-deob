package deob;

@ObfuscatedName("BVWZSTJJ")
public class BVWZSTJJ {

	@ObfuscatedName("BVWZSTJJ.b")
	public int[] field101 = new int[2];

	@ObfuscatedName("BVWZSTJJ.c")
	public int[][][] field102 = new int[2][2][4];

	@ObfuscatedName("BVWZSTJJ.d")
	public int[][][] field103 = new int[2][2][4];

	@ObfuscatedName("BVWZSTJJ.e")
	public int[] field104 = new int[2];

	@ObfuscatedName("BVWZSTJJ.f")
	public static float[][] field105 = new float[2][8];

	@ObfuscatedName("BVWZSTJJ.g")
	public static int[][] field106 = new int[2][8];

	@ObfuscatedName("BVWZSTJJ.h")
	public static float field107;

	@ObfuscatedName("BVWZSTJJ.i")
	public static int field108;

	@ObfuscatedName("BVWZSTJJ.a(IIFI)F")
	public float method43(int arg0, int arg1, float arg2) {
		float var4 = (field103[arg1][1][arg0] - field103[arg1][0][arg0]) * arg2 + field103[arg1][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("BVWZSTJJ.a(ZF)F")
	public float method44(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("BVWZSTJJ.a(FIII)F")
	public float method45(float arg0, int arg1, int arg2) {
		float var4 = (field102[arg1][1][arg2] - field102[arg1][0][arg2]) * arg0 + field102[arg1][0][arg2];
		var4 *= 1.2207031E-4F;
		return method44(var4);
	}

	@ObfuscatedName("BVWZSTJJ.a(BFI)I")
	public int method46(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field104[1] - field104[0]) * arg0 + field104[0];
			var3 *= 0.0030517578F;
			field107 = (float) Math.pow(0.1D, var3 / 20.0F);
			field108 = (int) (field107 * 65536.0F);
		}

		if (field101[arg1] == 0) {
			return 0;
		}

		float var4 = method43(0, arg1, arg0);
		field105[arg1][0] = var4 * -2.0F * (float) Math.cos(method45(arg0, arg1, 0));
		field105[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field101[arg1]; var5++) {
			float var6 = method43(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method45(arg0, arg1, var5));
			float var8 = var6 * var6;
			field105[arg1][var5 * 2 + 1] = field105[arg1][var5 * 2 - 1] * var8;
			field105[arg1][var5 * 2] = field105[arg1][var5 * 2 - 1] * var7 + field105[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field105[arg1][var9] += field105[arg1][var9 - 1] * var7 + field105[arg1][var9 - 2] * var8;
			}

			field105[arg1][1] += field105[arg1][0] * var7 + var8;
			field105[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field101[0] * 2; var10++) {
				field105[0][var10] *= field107;
			}
		}

		for (int var11 = 0; var11 < field101[arg1] * 2; var11++) {
			field106[arg1][var11] = (int) (field105[arg1][var11] * 65536.0F);
		}

		return field101[arg1] * 2;
	}

	@ObfuscatedName("BVWZSTJJ.a(LTPZZASFL;LMVHXDWGI;B)V")
	public final void method47(TPZZASFL arg0, MVHXDWGI arg1) {
		int var3 = arg1.method357();
		field101[0] = var3 >> 4;
		field101[1] = var3 & 0xF;
		if (var3 == 0) {
			field104[0] = field104[1] = 0;
		} else {
			field104[0] = arg1.method359();
			field104[1] = arg1.method359();
			int var4 = arg1.method357();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field101[var5]; var6++) {
					field102[var5][0][var6] = arg1.method359();
					field103[var5][0][var6] = arg1.method359();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field101[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field102[var7][1][var8] = field102[var7][0][var8];
						field103[var7][1][var8] = field103[var7][0][var8];
					} else {
						field102[var7][1][var8] = arg1.method359();
						field103[var7][1][var8] = arg1.method359();
					}
				}
			}

			if (var4 != 0 || field104[1] != field104[0]) {
				arg0.method571(arg1);
			}
		}
	}
}
