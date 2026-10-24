package deob;

@ObfuscatedName("WSKKAWXJ")
public class WSKKAWXJ {

	@ObfuscatedName("WSKKAWXJ.b")
	public int[] field1413 = new int[2];

	@ObfuscatedName("WSKKAWXJ.c")
	public int[][][] field1414 = new int[2][2][4];

	@ObfuscatedName("WSKKAWXJ.d")
	public int[][][] field1415 = new int[2][2][4];

	@ObfuscatedName("WSKKAWXJ.e")
	public int[] field1416 = new int[2];

	@ObfuscatedName("WSKKAWXJ.f")
	public static float[][] field1417 = new float[2][8];

	@ObfuscatedName("WSKKAWXJ.g")
	public static int[][] field1418 = new int[2][8];

	@ObfuscatedName("WSKKAWXJ.h")
	public static float field1419;

	@ObfuscatedName("WSKKAWXJ.i")
	public static int field1420;

	@ObfuscatedName("WSKKAWXJ.a(FIII)F")
	public float method553(float arg0, int arg1, int arg2) {
		float var4 = (field1415[arg2][1][arg1] - field1415[arg2][0][arg1]) * arg0 + field1415[arg2][0][arg1];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("WSKKAWXJ.a(BF)F")
	public float method554(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("WSKKAWXJ.a(IIFI)F")
	public float method555(int arg0, int arg1, float arg2) {
		float var4 = (field1414[arg0][1][arg1] - field1414[arg0][0][arg1]) * arg2 + field1414[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method554(var4);
	}

	@ObfuscatedName("WSKKAWXJ.a(FIZ)I")
	public int method556(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field1416[1] - field1416[0]) * arg0 + field1416[0];
			var3 *= 0.0030517578F;
			field1419 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1420 = (int) (field1419 * 65536.0F);
		}

		if (field1413[arg1] == 0) {
			return 0;
		}

		float var4 = method553(arg0, 0, arg1);
		field1417[arg1][0] = var4 * -2.0F * (float) Math.cos(method555(arg1, 0, arg0));
		field1417[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field1413[arg1]; var5++) {
			float var6 = method553(arg0, var5, arg1);
			float var7 = var6 * -2.0F * (float) Math.cos(method555(arg1, var5, arg0));
			float var8 = var6 * var6;
			field1417[arg1][var5 * 2 + 1] = field1417[arg1][var5 * 2 - 1] * var8;
			field1417[arg1][var5 * 2] = field1417[arg1][var5 * 2 - 1] * var7 + field1417[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1417[arg1][var9] += field1417[arg1][var9 - 1] * var7 + field1417[arg1][var9 - 2] * var8;
			}

			field1417[arg1][1] += field1417[arg1][0] * var7 + var8;
			field1417[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field1413[0] * 2; var10++) {
				field1417[0][var10] *= field1419;
			}
		}

		for (int var11 = 0; var11 < field1413[arg1] * 2; var11++) {
			field1418[arg1][var11] = (int) (field1417[arg1][var11] * 65536.0F);
		}

		return field1413[arg1] * 2;
	}

	@ObfuscatedName("WSKKAWXJ.a(LWBEWPIXO;LGTUIGVXS;I)V")
	public final void method557(WBEWPIXO arg0, GTUIGVXS arg1) {
		int var3 = arg0.method515();
		field1413[0] = var3 >> 4;
		field1413[1] = var3 & 0xF;
		if (var3 == 0) {
			field1416[0] = field1416[1] = 0;
		} else {
			field1416[0] = arg0.method517();
			field1416[1] = arg0.method517();
			int var4 = arg0.method515();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1413[var5]; var6++) {
					field1414[var5][0][var6] = arg0.method517();
					field1415[var5][0][var6] = arg0.method517();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1413[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1414[var7][1][var8] = field1414[var7][0][var8];
						field1415[var7][1][var8] = field1415[var7][0][var8];
					} else {
						field1414[var7][1][var8] = arg0.method517();
						field1415[var7][1][var8] = arg0.method517();
					}
				}
			}

			if (var4 != 0 || field1416[1] != field1416[0]) {
				arg1.method270(arg0);
			}
		}
	}
}
