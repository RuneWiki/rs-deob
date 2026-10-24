package deob;

@ObfuscatedName("RFLXBNRG")
public class RFLXBNRG {

	@ObfuscatedName("RFLXBNRG.c")
	public int[] field1153 = new int[2];

	@ObfuscatedName("RFLXBNRG.d")
	public int[][][] field1154 = new int[2][2][4];

	@ObfuscatedName("RFLXBNRG.e")
	public int[][][] field1155 = new int[2][2][4];

	@ObfuscatedName("RFLXBNRG.f")
	public int[] field1156 = new int[2];

	@ObfuscatedName("RFLXBNRG.g")
	public static float[][] field1157 = new float[2][8];

	@ObfuscatedName("RFLXBNRG.h")
	public static int[][] field1158 = new int[2][8];

	@ObfuscatedName("RFLXBNRG.i")
	public static float field1159;

	@ObfuscatedName("RFLXBNRG.j")
	public static int field1160;

	@ObfuscatedName("RFLXBNRG.a(IFBI)F")
	public float method436(int arg0, float arg1, int arg2) {
		float var4 = (field1155[arg0][1][arg2] - field1155[arg0][0][arg2]) * arg1 + field1155[arg0][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("RFLXBNRG.a(FB)F")
	public float method437(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("RFLXBNRG.a(IIIF)F")
	public float method438(int arg0, int arg1, float arg2) {
		float var4 = (field1154[arg0][1][arg1] - field1154[arg0][0][arg1]) * arg2 + field1154[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method437(var4);
	}

	@ObfuscatedName("RFLXBNRG.a(IIF)I")
	public int method439(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1156[1] - field1156[0]) * arg1 + field1156[0];
			var3 *= 0.0030517578F;
			field1159 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1160 = (int) (field1159 * 65536.0F);
		}

		if (field1153[arg0] == 0) {
			return 0;
		}

		float var4 = method436(arg0, arg1, 0);
		field1157[arg0][0] = var4 * -2.0F * (float) Math.cos(method438(arg0, 0, arg1));
		field1157[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1153[arg0]; var5++) {
			float var6 = method436(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method438(arg0, var5, arg1));
			float var8 = var6 * var6;
			field1157[arg0][var5 * 2 + 1] = field1157[arg0][var5 * 2 - 1] * var8;
			field1157[arg0][var5 * 2] = field1157[arg0][var5 * 2 - 1] * var7 + field1157[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1157[arg0][var9] += field1157[arg0][var9 - 1] * var7 + field1157[arg0][var9 - 2] * var8;
			}

			field1157[arg0][1] += field1157[arg0][0] * var7 + var8;
			field1157[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1153[0] * 2; var10++) {
				field1157[0][var10] *= field1159;
			}
		}

		for (int var11 = 0; var11 < field1153[arg0] * 2; var11++) {
			field1158[arg0][var11] = (int) (field1157[arg0][var11] * 65536.0F);
		}

		return field1153[arg0] * 2;
	}

	@ObfuscatedName("RFLXBNRG.a(ILVJXKRAVR;LMLYYHULT;)V")
	public final void method440(VJXKRAVR arg0, MLYYHULT arg1) {
		int var3 = arg1.method296();
		field1153[0] = var3 >> 4;
		field1153[1] = var3 & 0xF;
		if (var3 == 0) {
			field1156[0] = field1156[1] = 0;
		} else {
			field1156[0] = arg1.method298();
			field1156[1] = arg1.method298();
			int var4 = arg1.method296();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1153[var5]; var6++) {
					field1154[var5][0][var6] = arg1.method298();
					field1155[var5][0][var6] = arg1.method298();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1153[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1154[var7][1][var8] = field1154[var7][0][var8];
						field1155[var7][1][var8] = field1155[var7][0][var8];
					} else {
						field1154[var7][1][var8] = arg1.method298();
						field1155[var7][1][var8] = arg1.method298();
					}
				}
			}

			if (var4 != 0 || field1156[1] != field1156[0]) {
				arg0.method565(arg1);
			}
		}
	}
}
