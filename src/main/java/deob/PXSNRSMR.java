package deob;

@ObfuscatedName("PXSNRSMR")
public class PXSNRSMR {

	@ObfuscatedName("PXSNRSMR.c")
	public int[] field1260 = new int[2];

	@ObfuscatedName("PXSNRSMR.d")
	public int[][][] field1261 = new int[2][2][4];

	@ObfuscatedName("PXSNRSMR.e")
	public int[][][] field1262 = new int[2][2][4];

	@ObfuscatedName("PXSNRSMR.f")
	public int[] field1263 = new int[2];

	@ObfuscatedName("PXSNRSMR.g")
	public static float[][] field1264 = new float[2][8];

	@ObfuscatedName("PXSNRSMR.h")
	public static int[][] field1265 = new int[2][8];

	@ObfuscatedName("PXSNRSMR.i")
	public static float field1266;

	@ObfuscatedName("PXSNRSMR.j")
	public static int field1267;

	@ObfuscatedName("PXSNRSMR.a(ZIFI)F")
	public float method532(int arg0, float arg1, int arg2) {
		float var4 = (field1262[arg2][1][arg0] - field1262[arg2][0][arg0]) * arg1 + field1262[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("PXSNRSMR.a(IF)F")
	public float method533(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("PXSNRSMR.a(FBII)F")
	public float method534(float arg0, int arg1, int arg2) {
		float var4 = (field1261[arg2][1][arg1] - field1261[arg2][0][arg1]) * arg0 + field1261[arg2][0][arg1];
		var4 *= 1.2207031E-4F;
		return method533(var4);
	}

	@ObfuscatedName("PXSNRSMR.a(IFI)I")
	public int method535(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1263[1] - field1263[0]) * arg1 + field1263[0];
			var3 *= 0.0030517578F;
			field1266 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1267 = (int) (field1266 * 65536.0F);
		}

		if (field1260[arg0] == 0) {
			return 0;
		}

		float var4 = method532(0, arg1, arg0);
		field1264[arg0][0] = var4 * -2.0F * (float) Math.cos(method534(arg1, 0, arg0));
		field1264[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1260[arg0]; var5++) {
			float var6 = method532(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method534(arg1, var5, arg0));
			float var8 = var6 * var6;
			field1264[arg0][var5 * 2 + 1] = field1264[arg0][var5 * 2 - 1] * var8;
			field1264[arg0][var5 * 2] = field1264[arg0][var5 * 2 - 1] * var7 + field1264[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1264[arg0][var9] += field1264[arg0][var9 - 1] * var7 + field1264[arg0][var9 - 2] * var8;
			}

			field1264[arg0][1] += field1264[arg0][0] * var7 + var8;
			field1264[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1260[0] * 2; var10++) {
				field1264[0][var10] *= field1266;
			}
		}

		for (int var11 = 0; var11 < field1260[arg0] * 2; var11++) {
			field1265[arg0][var11] = (int) (field1264[arg0][var11] * 65536.0F);
		}

		return field1260[arg0] * 2;
	}

	@ObfuscatedName("PXSNRSMR.a(LLZWRHABP;LTAISOUDS;I)V")
	public final void method536(LZWRHABP arg0, TAISOUDS arg1) {
		int var3 = arg0.method463();
		field1260[0] = var3 >> 4;
		field1260[1] = var3 & 0xF;
		if (var3 == 0) {
			field1263[0] = field1263[1] = 0;
		} else {
			field1263[0] = arg0.method465();
			field1263[1] = arg0.method465();
			int var4 = arg0.method463();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1260[var5]; var6++) {
					field1261[var5][0][var6] = arg0.method465();
					field1262[var5][0][var6] = arg0.method465();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1260[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1261[var7][1][var8] = field1261[var7][0][var8];
						field1262[var7][1][var8] = field1262[var7][0][var8];
					} else {
						field1261[var7][1][var8] = arg0.method465();
						field1262[var7][1][var8] = arg0.method465();
					}
				}
			}

			if (var4 != 0 || field1263[1] != field1263[0]) {
				arg1.method572(arg0);
			}
		}
	}
}
