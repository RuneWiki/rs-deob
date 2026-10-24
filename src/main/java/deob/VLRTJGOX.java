package deob;

@ObfuscatedName("VLRTJGOX")
public class VLRTJGOX {

	@ObfuscatedName("VLRTJGOX.e")
	public int[] field1435 = new int[2];

	@ObfuscatedName("VLRTJGOX.f")
	public int[][][] field1436 = new int[2][2][4];

	@ObfuscatedName("VLRTJGOX.g")
	public int[][][] field1437 = new int[2][2][4];

	@ObfuscatedName("VLRTJGOX.h")
	public int[] field1438 = new int[2];

	@ObfuscatedName("VLRTJGOX.i")
	public static float[][] field1439 = new float[2][8];

	@ObfuscatedName("VLRTJGOX.j")
	public static int[][] field1440 = new int[2][8];

	@ObfuscatedName("VLRTJGOX.k")
	public static float field1441;

	@ObfuscatedName("VLRTJGOX.l")
	public static int field1442;

	@ObfuscatedName("VLRTJGOX.a(IZIF)F")
	public float method556(int arg0, int arg1, float arg2) {
		float var4 = (field1437[arg0][1][arg1] - field1437[arg0][0][arg1]) * arg2 + field1437[arg0][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("VLRTJGOX.a(FZ)F")
	public float method557(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("VLRTJGOX.a(IIIF)F")
	public float method558(int arg0, int arg1, float arg2) {
		float var4 = (field1436[arg1][1][arg0] - field1436[arg1][0][arg0]) * arg2 + field1436[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method557(var4);
	}

	@ObfuscatedName("VLRTJGOX.a(IFI)I")
	public int method559(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1438[1] - field1438[0]) * arg1 + field1438[0];
			var3 *= 0.0030517578F;
			field1441 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1442 = (int) (field1441 * 65536.0F);
		}

		if (field1435[arg0] == 0) {
			return 0;
		}

		float var4 = method556(arg0, 0, arg1);
		field1439[arg0][0] = var4 * -2.0F * (float) Math.cos(method558(0, arg0, arg1));
		field1439[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1435[arg0]; var5++) {
			float var6 = method556(arg0, var5, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method558(var5, arg0, arg1));
			float var8 = var6 * var6;
			field1439[arg0][var5 * 2 + 1] = field1439[arg0][var5 * 2 - 1] * var8;
			field1439[arg0][var5 * 2] = field1439[arg0][var5 * 2 - 1] * var7 + field1439[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1439[arg0][var9] += field1439[arg0][var9 - 1] * var7 + field1439[arg0][var9 - 2] * var8;
			}

			field1439[arg0][1] += field1439[arg0][0] * var7 + var8;
			field1439[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1435[0] * 2; var10++) {
				field1439[0][var10] *= field1441;
			}
		}

		for (int var11 = 0; var11 < field1435[arg0] * 2; var11++) {
			field1440[arg0][var11] = (int) (field1439[arg0][var11] * 65536.0F);
		}

		return field1435[arg0] * 2;
	}

	@ObfuscatedName("VLRTJGOX.a(LRGCGKKUR;LSHSBXUIJ;I)V")
	public final void method560(RGCGKKUR arg0, SHSBXUIJ arg1) {
		int var3 = arg0.method455();
		field1435[0] = var3 >> 4;
		field1435[1] = var3 & 0xF;
		if (var3 == 0) {
			field1438[0] = field1438[1] = 0;
		} else {
			field1438[0] = arg0.method457();
			field1438[1] = arg0.method457();
			int var4 = arg0.method455();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1435[var5]; var6++) {
					field1436[var5][0][var6] = arg0.method457();
					field1437[var5][0][var6] = arg0.method457();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1435[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1436[var7][1][var8] = field1436[var7][0][var8];
						field1437[var7][1][var8] = field1437[var7][0][var8];
					} else {
						field1436[var7][1][var8] = arg0.method457();
						field1437[var7][1][var8] = arg0.method457();
					}
				}
			}

			if (var4 != 0 || field1438[1] != field1438[0]) {
				arg1.method494(arg0);
			}
		}
	}
}
