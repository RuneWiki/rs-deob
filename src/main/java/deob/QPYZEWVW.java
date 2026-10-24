package deob;

@ObfuscatedName("QPYZEWVW")
public class QPYZEWVW {

	@ObfuscatedName("QPYZEWVW.d")
	public int[] field1045 = new int[2];

	@ObfuscatedName("QPYZEWVW.e")
	public int[][][] field1046 = new int[2][2][4];

	@ObfuscatedName("QPYZEWVW.f")
	public int[][][] field1047 = new int[2][2][4];

	@ObfuscatedName("QPYZEWVW.g")
	public int[] field1048 = new int[2];

	@ObfuscatedName("QPYZEWVW.h")
	public static float[][] field1049 = new float[2][8];

	@ObfuscatedName("QPYZEWVW.i")
	public static int[][] field1050 = new int[2][8];

	@ObfuscatedName("QPYZEWVW.j")
	public static float field1051;

	@ObfuscatedName("QPYZEWVW.k")
	public static int field1052;

	@ObfuscatedName("QPYZEWVW.a(FIII)F")
	public float method392(float arg0, int arg1, int arg2) {
		float var4 = (field1047[arg2][1][arg1] - field1047[arg2][0][arg1]) * arg0 + field1047[arg2][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("QPYZEWVW.a(FI)F")
	public float method393(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("QPYZEWVW.a(IIIF)F")
	public float method394(int arg0, int arg1, float arg2) {
		float var4 = (field1046[arg0][1][arg1] - field1046[arg0][0][arg1]) * arg2 + field1046[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method393(var4);
	}

	@ObfuscatedName("QPYZEWVW.a(IFI)I")
	public int method395(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field1048[1] - field1048[0]) * arg0 + field1048[0];
			var3 *= 0.0030517578F;
			field1051 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1052 = (int) (field1051 * 65536.0F);
		}

		if (field1045[arg1] == 0) {
			return 0;
		}

		float var4 = method392(arg0, 0, arg1);
		field1049[arg1][0] = var4 * -2.0F * (float) Math.cos(method394(arg1, 0, arg0));
		field1049[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field1045[arg1]; var5++) {
			float var6 = method392(arg0, var5, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method394(arg1, var5, arg0));
			float var8 = var6 * var6;
			field1049[arg1][var5 * 2 + 1] = field1049[arg1][var5 * 2 - 1] * var8;
			field1049[arg1][var5 * 2] = field1049[arg1][var5 * 2 - 1] * var7 + field1049[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1049[arg1][var9] += field1049[arg1][var9 - 1] * var7 + field1049[arg1][var9 - 2] * var8;
			}

			field1049[arg1][1] += field1049[arg1][0] * var7 + var8;
			field1049[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field1045[0] * 2; var10++) {
				field1049[0][var10] *= field1051;
			}
		}

		for (int var11 = 0; var11 < field1045[arg1] * 2; var11++) {
			field1050[arg1][var11] = (int) (field1049[arg1][var11] * 65536.0F);
		}

		return field1045[arg1] * 2;
	}

	@ObfuscatedName("QPYZEWVW.a(LLSSFLBMP;LWNCFPLWV;Z)V")
	public final void method396(LSSFLBMP arg0, WNCFPLWV arg1) {
		int var3 = arg1.method502();
		field1045[0] = var3 >> 4;
		field1045[1] = var3 & 0xF;
		if (var3 == 0) {
			field1048[0] = field1048[1] = 0;
		} else {
			field1048[0] = arg1.method504();
			field1048[1] = arg1.method504();
			int var4 = arg1.method502();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1045[var5]; var6++) {
					field1046[var5][0][var6] = arg1.method504();
					field1047[var5][0][var6] = arg1.method504();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1045[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1046[var7][1][var8] = field1046[var7][0][var8];
						field1047[var7][1][var8] = field1047[var7][0][var8];
					} else {
						field1046[var7][1][var8] = arg1.method504();
						field1047[var7][1][var8] = arg1.method504();
					}
				}
			}

			if (var4 != 0 || field1048[1] != field1048[0]) {
				arg0.method324(arg1);
			}
		}
	}
}
