package deob;

@ObfuscatedName("ZENSICXR")
public class ZENSICXR {

	@ObfuscatedName("ZENSICXR.g")
	public int[] field1494 = new int[2];

	@ObfuscatedName("ZENSICXR.h")
	public int[][][] field1495 = new int[2][2][4];

	@ObfuscatedName("ZENSICXR.i")
	public int[][][] field1496 = new int[2][2][4];

	@ObfuscatedName("ZENSICXR.j")
	public int[] field1497 = new int[2];

	@ObfuscatedName("ZENSICXR.k")
	public static float[][] field1498 = new float[2][8];

	@ObfuscatedName("ZENSICXR.l")
	public static int[][] field1499 = new int[2][8];

	@ObfuscatedName("ZENSICXR.m")
	public static float field1500;

	@ObfuscatedName("ZENSICXR.n")
	public static int field1501;

	@ObfuscatedName("ZENSICXR.a(IFBI)F")
	public float method584(int arg0, float arg1, int arg2) {
		float var4 = (field1496[arg2][1][arg0] - field1496[arg2][0][arg0]) * arg1 + field1496[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("ZENSICXR.a(FB)F")
	public float method585(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("ZENSICXR.a(IIFI)F")
	public float method586(int arg0, int arg1, float arg2) {
		float var4 = (field1495[arg1][1][arg0] - field1495[arg1][0][arg0]) * arg2 + field1495[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method585(var4);
	}

	@ObfuscatedName("ZENSICXR.a(IFB)I")
	public int method587(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1497[1] - field1497[0]) * arg1 + field1497[0];
			var3 *= 0.0030517578F;
			field1500 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1501 = (int) (field1500 * 65536.0F);
		}

		if (field1494[arg0] == 0) {
			return 0;
		}

		float var4 = method584(0, arg1, arg0);
		field1498[arg0][0] = var4 * -2.0F * (float) Math.cos(method586(0, arg0, arg1));
		field1498[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1494[arg0]; var5++) {
			float var6 = method584(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method586(var5, arg0, arg1));
			float var8 = var6 * var6;
			field1498[arg0][var5 * 2 + 1] = field1498[arg0][var5 * 2 - 1] * var8;
			field1498[arg0][var5 * 2] = field1498[arg0][var5 * 2 - 1] * var7 + field1498[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1498[arg0][var9] += field1498[arg0][var9 - 1] * var7 + field1498[arg0][var9 - 2] * var8;
			}

			field1498[arg0][1] += field1498[arg0][0] * var7 + var8;
			field1498[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1494[0] * 2; var10++) {
				field1498[0][var10] *= field1500;
			}
		}

		for (int var11 = 0; var11 < field1494[arg0] * 2; var11++) {
			field1499[arg0][var11] = (int) (field1498[arg0][var11] * 65536.0F);
		}

		return field1494[arg0] * 2;
	}

	@ObfuscatedName("ZENSICXR.a(LHXORSAZH;ILTQYMAXSO;)V")
	public final void method588(HXORSAZH arg0, TQYMAXSO arg1) {
		int var3 = arg1.method468();
		field1494[0] = var3 >> 4;
		field1494[1] = var3 & 0xF;
		if (var3 == 0) {
			field1497[0] = field1497[1] = 0;
		} else {
			field1497[0] = arg1.method470();
			field1497[1] = arg1.method470();
			int var4 = arg1.method468();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1494[var5]; var6++) {
					field1495[var5][0][var6] = arg1.method470();
					field1496[var5][0][var6] = arg1.method470();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1494[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1495[var7][1][var8] = field1495[var7][0][var8];
						field1496[var7][1][var8] = field1496[var7][0][var8];
					} else {
						field1495[var7][1][var8] = arg1.method470();
						field1496[var7][1][var8] = arg1.method470();
					}
				}
			}

			if (var4 != 0 || field1497[1] != field1497[0]) {
				arg0.method223(arg1);
			}
		}
	}
}
