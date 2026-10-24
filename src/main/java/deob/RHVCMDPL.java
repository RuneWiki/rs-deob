package deob;

@ObfuscatedName("RHVCMDPL")
public class RHVCMDPL {

	@ObfuscatedName("RHVCMDPL.b")
	public int[] field1192 = new int[2];

	@ObfuscatedName("RHVCMDPL.c")
	public int[][][] field1193 = new int[2][2][4];

	@ObfuscatedName("RHVCMDPL.d")
	public int[][][] field1194 = new int[2][2][4];

	@ObfuscatedName("RHVCMDPL.e")
	public int[] field1195 = new int[2];

	@ObfuscatedName("RHVCMDPL.f")
	public static float[][] field1196 = new float[2][8];

	@ObfuscatedName("RHVCMDPL.g")
	public static int[][] field1197 = new int[2][8];

	@ObfuscatedName("RHVCMDPL.h")
	public static float field1198;

	@ObfuscatedName("RHVCMDPL.i")
	public static int field1199;

	@ObfuscatedName("RHVCMDPL.a(IIFI)F")
	public float method441(int arg0, float arg1, int arg2) {
		float var4 = (field1194[arg2][1][arg0] - field1194[arg2][0][arg0]) * arg1 + field1194[arg2][0][arg0];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("RHVCMDPL.a(FI)F")
	public float method442(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("RHVCMDPL.a(IIIF)F")
	public float method443(int arg0, int arg1, float arg2) {
		float var4 = (field1193[arg1][1][arg0] - field1193[arg1][0][arg0]) * arg2 + field1193[arg1][0][arg0];
		var4 *= 1.2207031E-4F;
		return method442(var4);
	}

	@ObfuscatedName("RHVCMDPL.a(IIF)I")
	public int method444(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field1195[1] - field1195[0]) * arg1 + field1195[0];
			var3 *= 0.0030517578F;
			field1198 = (float) Math.pow(0.1D, var3 / 20.0F);
			field1199 = (int) (field1198 * 65536.0F);
		}

		if (field1192[arg0] == 0) {
			return 0;
		}

		float var4 = method441(0, arg1, arg0);
		field1196[arg0][0] = var4 * -2.0F * (float) Math.cos(method443(0, arg0, arg1));
		field1196[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field1192[arg0]; var5++) {
			float var6 = method441(var5, arg1, arg0);
			float var7 = var6 * -2.0F * (float) Math.cos(method443(var5, arg0, arg1));
			float var8 = var6 * var6;
			field1196[arg0][var5 * 2 + 1] = field1196[arg0][var5 * 2 - 1] * var8;
			field1196[arg0][var5 * 2] = field1196[arg0][var5 * 2 - 1] * var7 + field1196[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field1196[arg0][var9] += field1196[arg0][var9 - 1] * var7 + field1196[arg0][var9 - 2] * var8;
			}

			field1196[arg0][1] += field1196[arg0][0] * var7 + var8;
			field1196[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field1192[0] * 2; var10++) {
				field1196[0][var10] *= field1198;
			}
		}

		for (int var11 = 0; var11 < field1192[arg0] * 2; var11++) {
			field1197[arg0][var11] = (int) (field1196[arg0][var11] * 65536.0F);
		}

		return field1192[arg0] * 2;
	}

	@ObfuscatedName("RHVCMDPL.a(LXJHYQMBH;ZLSVWJKJVI;)V")
	public final void method445(XJHYQMBH arg0, SVWJKJVI arg1) {
		int var3 = arg1.method461();
		field1192[0] = var3 >> 4;
		field1192[1] = var3 & 0xF;
		if (var3 == 0) {
			field1195[0] = field1195[1] = 0;
		} else {
			field1195[0] = arg1.method463();
			field1195[1] = arg1.method463();
			int var4 = arg1.method461();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field1192[var5]; var6++) {
					field1193[var5][0][var6] = arg1.method463();
					field1194[var5][0][var6] = arg1.method463();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field1192[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field1193[var7][1][var8] = field1193[var7][0][var8];
						field1194[var7][1][var8] = field1194[var7][0][var8];
					} else {
						field1193[var7][1][var8] = arg1.method463();
						field1194[var7][1][var8] = arg1.method463();
					}
				}
			}

			if (var4 != 0 || field1195[1] != field1195[0]) {
				arg0.method591(arg1);
			}
		}
	}
}
