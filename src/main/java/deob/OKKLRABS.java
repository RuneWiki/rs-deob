package deob;

@ObfuscatedName("OKKLRABS")
public class OKKLRABS {

	@ObfuscatedName("OKKLRABS.c")
	public int[] field1143 = new int[2];

	@ObfuscatedName("OKKLRABS.d")
	public int[][][] field1144 = new int[2][2][4];

	@ObfuscatedName("OKKLRABS.e")
	public int[][][] field1145 = new int[2][2][4];

	@ObfuscatedName("OKKLRABS.f")
	public int[] field1146 = new int[2];

	@ObfuscatedName("OKKLRABS.g")
	public static float[][] field1147 = new float[2][8];

	@ObfuscatedName("OKKLRABS.h")
	public static int[][] field1148 = new int[2][8];

	@ObfuscatedName("OKKLRABS.i")
	public static float field1149;

	@ObfuscatedName("OKKLRABS.j")
	public static int field1150;

	@ObfuscatedName("OKKLRABS.a(IBFI)F")
	public float method451(int arg0, float arg1, int arg2) {
		float var4 = (field1145[arg0][1][arg2] - field1145[arg0][0][arg2]) * arg1 + field1145[arg0][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("OKKLRABS.a(ZF)F")
	public float method452(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("OKKLRABS.a(IFBI)F")
	public float method453(int arg0, float arg1, int arg2) {
		float var4 = (field1144[arg0][1][arg2] - field1144[arg0][0][arg2]) * arg1 + field1144[arg0][0][arg2];
		var4 *= 1.2207031E-4F;
		return method452(var4);
	}

	@ObfuscatedName("OKKLRABS.a(ZFI)I")
	public int method454(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field1146[1] - field1146[0]) * arg0 + field1146[0];
			var3 *= 0.0030517578F;
			field1149 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1150 = (int) (field1149 * 65536.0F);
		}

		if (field1143[arg1] == 0) {
			return 0;
		}

		float var4 = method451(arg1, arg0, 0);
		field1147[arg1][0] = var4 * -2.0F * (float) Math.cos(method453(arg1, arg0, 0));
		field1147[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field1143[arg1]; var5++) {
			float var6 = method451(arg1, arg0, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method453(arg1, arg0, var5));
			float var8 = var6 * var6;
			field1147[arg1][var5 * 2 + 1] = field1147[arg1][var5 * 2 - 1] * var8;
			field1147[arg1][var5 * 2] = field1147[arg1][var5 * 2 - 1] * var7 + field1147[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1147[arg1][var9] += field1147[arg1][var9 - 1] * var7 + field1147[arg1][var9 - 2] * var8;
			}

			field1147[arg1][1] += field1147[arg1][0] * var7 + var8;
			field1147[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field1143[0] * 2; var10++) {
				field1147[0][var10] *= field1149;
			}
		}

		for (int var11 = 0; var11 < field1143[arg1] * 2; var11++) {
			field1148[arg1][var11] = (int) (field1147[arg1][var11] * 65536.0F);
		}

		return field1143[arg1] * 2;
	}

	@ObfuscatedName("OKKLRABS.a(LBJPWOXRJ;ILXJOITHUI;)V")
	public final void method455(BJPWOXRJ arg0, XJOITHUI arg1) {
		int var3 = arg0.method15();
		field1143[0] = var3 >> 4;
		field1143[1] = var3 & 0xF;
		if (var3 == 0) {
			field1146[0] = field1146[1] = 0;
		} else {
			field1146[0] = arg0.method17();
			field1146[1] = arg0.method17();
			int var4 = arg0.method15();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1143[var5]; var6++) {
					field1144[var5][0][var6] = arg0.method17();
					field1145[var5][0][var6] = arg0.method17();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1143[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1144[var7][1][var8] = field1144[var7][0][var8];
						field1145[var7][1][var8] = field1145[var7][0][var8];
					} else {
						field1144[var7][1][var8] = arg0.method17();
						field1145[var7][1][var8] = arg0.method17();
					}
				}
			}

			if (var4 != 0 || field1146[1] != field1146[0]) {
				arg1.method539(arg0);
			}
		}
	}
}
