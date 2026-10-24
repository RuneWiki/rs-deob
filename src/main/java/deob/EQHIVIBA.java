package deob;

@ObfuscatedName("EQHIVIBA")
public class EQHIVIBA {

	@ObfuscatedName("EQHIVIBA.c")
	public int[] field581 = new int[2];

	@ObfuscatedName("EQHIVIBA.d")
	public int[][][] field582 = new int[2][2][4];

	@ObfuscatedName("EQHIVIBA.e")
	public int[][][] field583 = new int[2][2][4];

	@ObfuscatedName("EQHIVIBA.f")
	public int[] field584 = new int[2];

	@ObfuscatedName("EQHIVIBA.g")
	public static float[][] field585 = new float[2][8];

	@ObfuscatedName("EQHIVIBA.h")
	public static int[][] field586 = new int[2][8];

	@ObfuscatedName("EQHIVIBA.i")
	public static float field587;

	@ObfuscatedName("EQHIVIBA.j")
	public static int field588;

	@ObfuscatedName("EQHIVIBA.a(IBIF)F")
	public float method187(int arg0, int arg1, float arg2) {
		float var4 = (field583[arg0][1][arg1] - field583[arg0][0][arg1]) * arg2 + field583[arg0][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("EQHIVIBA.a(FB)F")
	public float method188(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("EQHIVIBA.a(IFII)F")
	public float method189(int arg0, float arg1, int arg2) {
		float var4 = (field582[arg2][1][arg0] - field582[arg2][0][arg0]) * arg1 + field582[arg2][0][arg0];
		var4 *= 1.2207031E-4F;
		return method188(var4);
	}

	@ObfuscatedName("EQHIVIBA.a(IFI)I")
	public int method190(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field584[1] - field584[0]) * arg0 + field584[0];
			var3 *= 0.0030517578F;
			field587 = (float) Math.pow(0.1D, var3 / 20.0F);
			field588 = (int) (field587 * 65536.0F);
		}

		if (field581[arg1] == 0) {
			return 0;
		}

		float var4 = method187(arg1, 0, arg0);
		field585[arg1][0] = var4 * -2.0F * (float) Math.cos(method189(0, arg0, arg1));
		field585[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field581[arg1]; var5++) {
			float var6 = method187(arg1, var5, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method189(var5, arg0, arg1));
			float var8 = var6 * var6;
			field585[arg1][var5 * 2 + 1] = field585[arg1][var5 * 2 - 1] * var8;
			field585[arg1][var5 * 2] = field585[arg1][var5 * 2 - 1] * var7 + field585[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field585[arg1][var9] += field585[arg1][var9 - 1] * var7 + field585[arg1][var9 - 2] * var8;
			}

			field585[arg1][1] += field585[arg1][0] * var7 + var8;
			field585[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field581[0] * 2; var10++) {
				field585[0][var10] *= field587;
			}
		}

		for (int var11 = 0; var11 < field581[arg1] * 2; var11++) {
			field586[arg1][var11] = (int) (field585[arg1][var11] * 65536.0F);
		}

		return field581[arg1] * 2;
	}

	@ObfuscatedName("EQHIVIBA.a(LXJCNBMKS;LVMVYFNTB;I)V")
	public final void method191(XJCNBMKS arg0, VMVYFNTB arg1) {
		int var3 = arg0.method534();
		field581[0] = var3 >> 4;
		field581[1] = var3 & 0xF;
		if (var3 == 0) {
			field584[0] = field584[1] = 0;
		} else {
			field584[0] = arg0.method536();
			field584[1] = arg0.method536();
			int var4 = arg0.method534();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field581[var5]; var6++) {
					field582[var5][0][var6] = arg0.method536();
					field583[var5][0][var6] = arg0.method536();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field581[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field582[var7][1][var8] = field582[var7][0][var8];
						field583[var7][1][var8] = field583[var7][0][var8];
					} else {
						field582[var7][1][var8] = arg0.method536();
						field583[var7][1][var8] = arg0.method536();
					}
				}
			}

			if (var4 != 0 || field584[1] != field584[0]) {
				arg1.method514(arg0);
			}
		}
	}
}
