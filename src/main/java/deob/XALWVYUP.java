package deob;

@ObfuscatedName("XALWVYUP")
public class XALWVYUP {

	@ObfuscatedName("XALWVYUP.c")
	public int[] field1313 = new int[2];

	@ObfuscatedName("XALWVYUP.d")
	public int[][][] field1314 = new int[2][2][4];

	@ObfuscatedName("XALWVYUP.e")
	public int[][][] field1315 = new int[2][2][4];

	@ObfuscatedName("XALWVYUP.f")
	public int[] field1316 = new int[2];

	@ObfuscatedName("XALWVYUP.g")
	public static float[][] field1317 = new float[2][8];

	@ObfuscatedName("XALWVYUP.h")
	public static int[][] field1318 = new int[2][8];

	@ObfuscatedName("XALWVYUP.i")
	public static float field1319;

	@ObfuscatedName("XALWVYUP.j")
	public static int field1320;

	@ObfuscatedName("XALWVYUP.a(BFII)F")
	public float method481(float arg0, int arg1, int arg2) {
		float var4 = (field1315[arg2][1][arg1] - field1315[arg2][0][arg1]) * arg0 + field1315[arg2][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("XALWVYUP.a(ZF)F")
	public float method482(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("XALWVYUP.a(IFII)F")
	public float method483(float arg0, int arg1, int arg2) {
		float var4 = (field1314[arg1][1][arg2] - field1314[arg1][0][arg2]) * arg0 + field1314[arg1][0][arg2];
		var4 *= 1.2207031E-4F;
		return method482(var4);
	}

	@ObfuscatedName("XALWVYUP.a(IZF)I")
	public int method484(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1316[1] - field1316[0]) * arg1 + field1316[0];
			var3 *= 0.0030517578F;
			field1319 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1320 = (int) (field1319 * 65536.0F);
		}

		if (field1313[arg0] == 0) {
			return 0;
		}

		float var4 = method481(arg1, 0, arg0);
		field1317[arg0][0] = var4 * -2.0F * (float) Math.cos(method483(arg1, arg0, 0));
		field1317[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1313[arg0]; var5++) {
			float var6 = method481(arg1, var5, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method483(arg1, arg0, var5));
			float var8 = var6 * var6;
			field1317[arg0][var5 * 2 + 1] = field1317[arg0][var5 * 2 - 1] * var8;
			field1317[arg0][var5 * 2] = field1317[arg0][var5 * 2 - 1] * var7 + field1317[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1317[arg0][var9] += field1317[arg0][var9 - 1] * var7 + field1317[arg0][var9 - 2] * var8;
			}

			field1317[arg0][1] += field1317[arg0][0] * var7 + var8;
			field1317[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1313[0] * 2; var10++) {
				field1317[0][var10] *= field1319;
			}
		}

		for (int var11 = 0; var11 < field1313[arg0] * 2; var11++) {
			field1318[arg0][var11] = (int) (field1317[arg0][var11] * 65536.0F);
		}

		return field1313[arg0] * 2;
	}

	@ObfuscatedName("XALWVYUP.a(LJZEFIVMF;LFTMSICIZ;I)V")
	public final void method485(JZEFIVMF arg0, FTMSICIZ arg1) {
		int var3 = arg1.method213();
		field1313[0] = var3 >> 4;
		field1313[1] = var3 & 0xF;
		if (var3 == 0) {
			field1316[0] = field1316[1] = 0;
		} else {
			field1316[0] = arg1.method215();
			field1316[1] = arg1.method215();
			int var4 = arg1.method213();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1313[var5]; var6++) {
					field1314[var5][0][var6] = arg1.method215();
					field1315[var5][0][var6] = arg1.method215();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1313[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1314[var7][1][var8] = field1314[var7][0][var8];
						field1315[var7][1][var8] = field1315[var7][0][var8];
					} else {
						field1314[var7][1][var8] = arg1.method215();
						field1315[var7][1][var8] = arg1.method215();
					}
				}
			}

			if (var4 != 0 || field1316[1] != field1316[0]) {
				arg0.method310(arg1);
			}
		}
	}
}
