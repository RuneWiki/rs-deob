package deob;

@ObfuscatedName("OYVSGGSR")
public class OYVSGGSR {

	@ObfuscatedName("OYVSGGSR.b")
	public int[] field1082 = new int[2];

	@ObfuscatedName("OYVSGGSR.c")
	public int[][][] field1083 = new int[2][2][4];

	@ObfuscatedName("OYVSGGSR.d")
	public int[][][] field1084 = new int[2][2][4];

	@ObfuscatedName("OYVSGGSR.e")
	public int[] field1085 = new int[2];

	@ObfuscatedName("OYVSGGSR.f")
	public static float[][] field1086 = new float[2][8];

	@ObfuscatedName("OYVSGGSR.g")
	public static int[][] field1087 = new int[2][8];

	@ObfuscatedName("OYVSGGSR.h")
	public static float field1088;

	@ObfuscatedName("OYVSGGSR.i")
	public static int field1089;

	@ObfuscatedName("OYVSGGSR.a(IFII)F")
	public float method323(int arg0, float arg1, int arg2) {
		float var4 = (field1084[arg2][1][arg0] - field1084[arg2][0][arg0]) * arg1 + field1084[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("OYVSGGSR.a(IF)F")
	public float method324(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("OYVSGGSR.a(IZFI)F")
	public float method325(int arg0, float arg1, int arg2) {
		float var4 = (field1083[arg2][1][arg0] - field1083[arg2][0][arg0]) * arg1 + field1083[arg2][0][arg0];
		var4 *= 1.2207031E-4F;
		return method324(var4);
	}

	@ObfuscatedName("OYVSGGSR.a(IIF)I")
	public int method326(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1085[1] - field1085[0]) * arg1 + field1085[0];
			var3 *= 0.0030517578F;
			field1088 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1089 = (int) (field1088 * 65536.0F);
		}

		if (field1082[arg0] == 0) {
			return 0;
		}

		float var4 = method323(0, arg1, arg0);
		field1086[arg0][0] = var4 * -2.0F * (float) Math.cos(method325(0, arg1, arg0));
		field1086[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1082[arg0]; var5++) {
			float var6 = method323(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method325(var5, arg1, arg0));
			float var8 = var6 * var6;
			field1086[arg0][var5 * 2 + 1] = field1086[arg0][var5 * 2 - 1] * var8;
			field1086[arg0][var5 * 2] = field1086[arg0][var5 * 2 - 1] * var7 + field1086[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1086[arg0][var9] += field1086[arg0][var9 - 1] * var7 + field1086[arg0][var9 - 2] * var8;
			}

			field1086[arg0][1] += field1086[arg0][0] * var7 + var8;
			field1086[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1082[0] * 2; var10++) {
				field1086[0][var10] *= field1088;
			}
		}

		for (int var11 = 0; var11 < field1082[arg0] * 2; var11++) {
			field1087[arg0][var11] = (int) (field1086[arg0][var11] * 65536.0F);
		}

		return field1082[arg0] * 2;
	}

	@ObfuscatedName("OYVSGGSR.a(ILPQBRPYKE;LKEEMQUKU;)V")
	public final void method327(PQBRPYKE arg0, KEEMQUKU arg1) {
		int var3 = arg0.method340();
		field1082[0] = var3 >> 4;
		field1082[1] = var3 & 0xF;
		if (var3 == 0) {
			field1085[0] = field1085[1] = 0;
		} else {
			field1085[0] = arg0.method342();
			field1085[1] = arg0.method342();
			int var4 = arg0.method340();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1082[var5]; var6++) {
					field1083[var5][0][var6] = arg0.method342();
					field1084[var5][0][var6] = arg0.method342();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1082[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1083[var7][1][var8] = field1083[var7][0][var8];
						field1084[var7][1][var8] = field1084[var7][0][var8];
					} else {
						field1083[var7][1][var8] = arg0.method342();
						field1084[var7][1][var8] = arg0.method342();
					}
				}
			}

			if (var4 != 0 || field1085[1] != field1085[0]) {
				arg1.method273(arg0);
			}
		}
	}
}
