package deob;

@ObfuscatedName("QEWPNZTS")
public class QEWPNZTS {

	@ObfuscatedName("QEWPNZTS.c")
	public int[] field1117 = new int[2];

	@ObfuscatedName("QEWPNZTS.d")
	public int[][][] field1118 = new int[2][2][4];

	@ObfuscatedName("QEWPNZTS.e")
	public int[][][] field1119 = new int[2][2][4];

	@ObfuscatedName("QEWPNZTS.f")
	public int[] field1120 = new int[2];

	@ObfuscatedName("QEWPNZTS.g")
	public static float[][] field1121 = new float[2][8];

	@ObfuscatedName("QEWPNZTS.h")
	public static int[][] field1122 = new int[2][8];

	@ObfuscatedName("QEWPNZTS.i")
	public static float field1123;

	@ObfuscatedName("QEWPNZTS.j")
	public static int field1124;

	@ObfuscatedName("QEWPNZTS.a(IZFI)F")
	public float method495(int arg0, float arg1, int arg2) {
		float var4 = (field1119[arg0][1][arg2] - field1119[arg0][0][arg2]) * arg1 + field1119[arg0][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("QEWPNZTS.a(IF)F")
	public float method496(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("QEWPNZTS.a(ZFII)F")
	public float method497(float arg0, int arg1, int arg2) {
		float var4 = (field1118[arg2][1][arg1] - field1118[arg2][0][arg1]) * arg0 + field1118[arg2][0][arg1];
		var4 *= 1.2207031E-4F;
		return method496(var4);
	}

	@ObfuscatedName("QEWPNZTS.a(FII)I")
	public int method498(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field1120[1] - field1120[0]) * arg0 + field1120[0];
			var3 *= 0.0030517578F;
			field1123 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1124 = (int) (field1123 * 65536.0F);
		}

		if (field1117[arg1] == 0) {
			return 0;
		}

		float var4 = method495(arg1, arg0, 0);
		field1121[arg1][0] = var4 * -2.0F * (float) Math.cos(method497(arg0, 0, arg1));
		field1121[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field1117[arg1]; var5++) {
			float var6 = method495(arg1, arg0, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method497(arg0, var5, arg1));
			float var8 = var6 * var6;
			field1121[arg1][var5 * 2 + 1] = field1121[arg1][var5 * 2 - 1] * var8;
			field1121[arg1][var5 * 2] = field1121[arg1][var5 * 2 - 1] * var7 + field1121[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1121[arg1][var9] += field1121[arg1][var9 - 1] * var7 + field1121[arg1][var9 - 2] * var8;
			}

			field1121[arg1][1] += field1121[arg1][0] * var7 + var8;
			field1121[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field1117[0] * 2; var10++) {
				field1121[0][var10] *= field1123;
			}
		}

		for (int var11 = 0; var11 < field1117[arg1] * 2; var11++) {
			field1122[arg1][var11] = (int) (field1121[arg1][var11] * 65536.0F);
		}

		return field1117[arg1] * 2;
	}

	@ObfuscatedName("QEWPNZTS.a(LKMZLAUEV;LKHOMSBHW;B)V")
	public final void method499(KMZLAUEV arg0, KHOMSBHW arg1) {
		int var3 = arg1.method349();
		field1117[0] = var3 >> 4;
		field1117[1] = var3 & 0xF;
		if (var3 == 0) {
			field1120[0] = field1120[1] = 0;
		} else {
			field1120[0] = arg1.method351();
			field1120[1] = arg1.method351();
			int var4 = arg1.method349();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1117[var5]; var6++) {
					field1118[var5][0][var6] = arg1.method351();
					field1119[var5][0][var6] = arg1.method351();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1117[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1118[var7][1][var8] = field1118[var7][0][var8];
						field1119[var7][1][var8] = field1119[var7][0][var8];
					} else {
						field1118[var7][1][var8] = arg1.method351();
						field1119[var7][1][var8] = arg1.method351();
					}
				}
			}

			if (var4 != 0 || field1120[1] != field1120[0]) {
				arg0.method395(arg1);
			}
		}
	}
}
