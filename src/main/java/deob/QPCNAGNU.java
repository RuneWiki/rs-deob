package deob;

@ObfuscatedName("QPCNAGNU")
public class QPCNAGNU {

	@ObfuscatedName("QPCNAGNU.b")
	public int[] field1152 = new int[2];

	@ObfuscatedName("QPCNAGNU.c")
	public int[][][] field1153 = new int[2][2][4];

	@ObfuscatedName("QPCNAGNU.d")
	public int[][][] field1154 = new int[2][2][4];

	@ObfuscatedName("QPCNAGNU.e")
	public int[] field1155 = new int[2];

	@ObfuscatedName("QPCNAGNU.f")
	public static float[][] field1156 = new float[2][8];

	@ObfuscatedName("QPCNAGNU.g")
	public static int[][] field1157 = new int[2][8];

	@ObfuscatedName("QPCNAGNU.h")
	public static float field1158;

	@ObfuscatedName("QPCNAGNU.i")
	public static int field1159;

	@ObfuscatedName("QPCNAGNU.a(FIBI)F")
	public float method348(float arg0, int arg1, int arg2) {
		float var4 = (field1154[arg2][1][arg1] - field1154[arg2][0][arg1]) * arg0 + field1154[arg2][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("QPCNAGNU.a(FB)F")
	public float method349(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("QPCNAGNU.a(IFII)F")
	public float method350(int arg0, float arg1, int arg2) {
		float var4 = (field1153[arg2][1][arg0] - field1153[arg2][0][arg0]) * arg1 + field1153[arg2][0][arg0];
		var4 *= 1.2207031E-4F;
		return method349(var4);
	}

	@ObfuscatedName("QPCNAGNU.a(IIF)I")
	public int method351(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1155[1] - field1155[0]) * arg1 + field1155[0];
			var3 *= 0.0030517578F;
			field1158 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1159 = (int) (field1158 * 65536.0F);
		}

		if (field1152[arg0] == 0) {
			return 0;
		}

		float var4 = method348(arg1, 0, arg0);
		field1156[arg0][0] = var4 * -2.0F * (float) Math.cos(method350(0, arg1, arg0));
		field1156[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1152[arg0]; var5++) {
			float var6 = method348(arg1, var5, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method350(var5, arg1, arg0));
			float var8 = var6 * var6;
			field1156[arg0][var5 * 2 + 1] = field1156[arg0][var5 * 2 - 1] * var8;
			field1156[arg0][var5 * 2] = field1156[arg0][var5 * 2 - 1] * var7 + field1156[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1156[arg0][var9] += field1156[arg0][var9 - 1] * var7 + field1156[arg0][var9 - 2] * var8;
			}

			field1156[arg0][1] += field1156[arg0][0] * var7 + var8;
			field1156[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1152[0] * 2; var10++) {
				field1156[0][var10] *= field1158;
			}
		}

		for (int var11 = 0; var11 < field1152[arg0] * 2; var11++) {
			field1157[arg0][var11] = (int) (field1156[arg0][var11] * 65536.0F);
		}

		return field1152[arg0] * 2;
	}

	@ObfuscatedName("QPCNAGNU.a(LJDDBCSRY;ILXGRGMPUQ;)V")
	public final void method352(JDDBCSRY arg0, XGRGMPUQ arg1) {
		int var3 = arg1.method465();
		field1152[0] = var3 >> 4;
		field1152[1] = var3 & 0xF;
		if (var3 == 0) {
			field1155[0] = field1155[1] = 0;
		} else {
			field1155[0] = arg1.method467();
			field1155[1] = arg1.method467();
			int var4 = arg1.method465();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1152[var5]; var6++) {
					field1153[var5][0][var6] = arg1.method467();
					field1154[var5][0][var6] = arg1.method467();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1152[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1153[var7][1][var8] = field1153[var7][0][var8];
						field1154[var7][1][var8] = field1154[var7][0][var8];
					} else {
						field1153[var7][1][var8] = arg1.method467();
						field1154[var7][1][var8] = arg1.method467();
					}
				}
			}

			if (var4 != 0 || field1155[1] != field1155[0]) {
				arg0.method258(arg1);
			}
		}
	}
}
