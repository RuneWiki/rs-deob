package deob;

@ObfuscatedName("ADELCBNY")
public class ADELCBNY {

	@ObfuscatedName("ADELCBNY.b")
	public int[] field1 = new int[2];

	@ObfuscatedName("ADELCBNY.c")
	public int[][][] field2 = new int[2][2][4];

	@ObfuscatedName("ADELCBNY.d")
	public int[][][] field3 = new int[2][2][4];

	@ObfuscatedName("ADELCBNY.e")
	public int[] field4 = new int[2];

	@ObfuscatedName("ADELCBNY.f")
	public static float[][] field5 = new float[2][8];

	@ObfuscatedName("ADELCBNY.g")
	public static int[][] field6 = new int[2][8];

	@ObfuscatedName("ADELCBNY.h")
	public static float field7;

	@ObfuscatedName("ADELCBNY.i")
	public static int field8;

	@ObfuscatedName("ADELCBNY.a(IIIF)F")
	public float method1(int arg0, int arg1, float arg2) {
		float var4 = (field3[arg1][1][arg0] - field3[arg1][0][arg0]) * arg2 + field3[arg1][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("ADELCBNY.a(FI)F")
	public float method2(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("ADELCBNY.a(IBFI)F")
	public float method3(int arg0, float arg1, int arg2) {
		float var4 = (field2[arg0][1][arg2] - field2[arg0][0][arg2]) * arg1 + field2[arg0][0][arg2];
		var4 *= 1.2207031E-4F;
		return method2(var4);
	}

	@ObfuscatedName("ADELCBNY.a(IBF)I")
	public int method4(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field4[1] - field4[0]) * arg1 + field4[0];
			var3 *= 0.0030517578F;
			field7 = (float) Math.pow(0.1D, var3 / 20.0F);
			field8 = (int) (field7 * 65536.0F);
		}

		if (field1[arg0] == 0) {
			return 0;
		}

		float var4 = method1(0, arg0, arg1);
		field5[arg0][0] = var4 * -2.0F * (float) Math.cos(method3(arg0, arg1, 0));
		field5[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1[arg0]; var5++) {
			float var6 = method1(var5, arg0, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method3(arg0, arg1, var5));
			float var8 = var6 * var6;
			field5[arg0][var5 * 2 + 1] = field5[arg0][var5 * 2 - 1] * var8;
			field5[arg0][var5 * 2] = field5[arg0][var5 * 2 - 1] * var7 + field5[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field5[arg0][var9] += field5[arg0][var9 - 1] * var7 + field5[arg0][var9 - 2] * var8;
			}

			field5[arg0][1] += field5[arg0][0] * var7 + var8;
			field5[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1[0] * 2; var10++) {
				field5[0][var10] *= field7;
			}
		}

		for (int var11 = 0; var11 < field1[arg0] * 2; var11++) {
			field6[arg0][var11] = (int) (field5[arg0][var11] * 65536.0F);
		}

		return field1[arg0] * 2;
	}

	@ObfuscatedName("ADELCBNY.a(LIMUIZRAF;LTDXKKGZV;I)V")
	public final void method5(IMUIZRAF arg0, TDXKKGZV arg1) {
		int var3 = arg0.method238();
		field1[0] = var3 >> 4;
		field1[1] = var3 & 0xF;
		if (var3 == 0) {
			field4[0] = field4[1] = 0;
		} else {
			field4[0] = arg0.method240();
			field4[1] = arg0.method240();
			int var4 = arg0.method238();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1[var5]; var6++) {
					field2[var5][0][var6] = arg0.method240();
					field3[var5][0][var6] = arg0.method240();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field2[var7][1][var8] = field2[var7][0][var8];
						field3[var7][1][var8] = field3[var7][0][var8];
					} else {
						field2[var7][1][var8] = arg0.method240();
						field3[var7][1][var8] = arg0.method240();
					}
				}
			}

			if (var4 != 0 || field4[1] != field4[0]) {
				arg1.method486(arg0);
			}
		}
	}
}
