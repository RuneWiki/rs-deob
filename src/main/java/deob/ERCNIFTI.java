package deob;

@ObfuscatedName("ERCNIFTI")
public class ERCNIFTI {

	@ObfuscatedName("ERCNIFTI.d")
	public int[] field600 = new int[2];

	@ObfuscatedName("ERCNIFTI.e")
	public int[][][] field601 = new int[2][2][4];

	@ObfuscatedName("ERCNIFTI.f")
	public int[][][] field602 = new int[2][2][4];

	@ObfuscatedName("ERCNIFTI.g")
	public int[] field603 = new int[2];

	@ObfuscatedName("ERCNIFTI.h")
	public static float[][] field604 = new float[2][8];

	@ObfuscatedName("ERCNIFTI.i")
	public static int[][] field605 = new int[2][8];

	@ObfuscatedName("ERCNIFTI.j")
	public static float field606;

	@ObfuscatedName("ERCNIFTI.k")
	public static int field607;

	@ObfuscatedName("ERCNIFTI.a(FIII)F")
	public float method235(float arg0, int arg1, int arg2) {
		float var4 = (field602[arg1][1][arg2] - field602[arg1][0][arg2]) * arg0 + field602[arg1][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("ERCNIFTI.a(IF)F")
	public float method236(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("ERCNIFTI.a(IIIF)F")
	public float method237(int arg0, int arg1, float arg2) {
		float var4 = (field601[arg0][1][arg1] - field601[arg0][0][arg1]) * arg2 + field601[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method236(var4);
	}

	@ObfuscatedName("ERCNIFTI.a(FII)I")
	public int method238(float arg0, int arg1) {
		if (arg1 == 0) {
			float var3 = (field603[1] - field603[0]) * arg0 + field603[0];
			var3 *= 0.0030517578F;
			field606 = (float) Math.pow(0.1D, var3 / 20.0F);
			field607 = (int) (field606 * 65536.0F);
		}

		if (field600[arg1] == 0) {
			return 0;
		}

		float var4 = method235(arg0, arg1, 0);
		field604[arg1][0] = var4 * -2.0F * (float) Math.cos(method237(arg1, 0, arg0));
		field604[arg1][1] = var4 * var4;
		for (int var5 = 1; var5 < field600[arg1]; var5++) {
			float var6 = method235(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method237(arg1, var5, arg0));
			float var8 = var6 * var6;
			field604[arg1][var5 * 2 + 1] = field604[arg1][var5 * 2 - 1] * var8;
			field604[arg1][var5 * 2] = field604[arg1][var5 * 2 - 1] * var7 + field604[arg1][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field604[arg1][var9] += field604[arg1][var9 - 1] * var7 + field604[arg1][var9 - 2] * var8;
			}

			field604[arg1][1] += field604[arg1][0] * var7 + var8;
			field604[arg1][0] += var7;
		}

		if (arg1 == 0) {
			for (int var10 = 0; var10 < field600[0] * 2; var10++) {
				field604[0][var10] *= field606;
			}
		}

		for (int var11 = 0; var11 < field600[arg1] * 2; var11++) {
			field605[arg1][var11] = (int) (field604[arg1][var11] * 65536.0F);
		}

		return field600[arg1] * 2;
	}

	@ObfuscatedName("ERCNIFTI.a(ZLLDILQFVA;LNXAZLFDC;)V")
	public final void method239(LDILQFVA arg0, NXAZLFDC arg1) {
		int var3 = arg0.method402();
		field600[0] = var3 >> 4;
		field600[1] = var3 & 0xF;
		if (var3 == 0) {
			field603[0] = field603[1] = 0;
		} else {
			field603[0] = arg0.method404();
			field603[1] = arg0.method404();
			int var4 = arg0.method402();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field600[var5]; var6++) {
					field601[var5][0][var6] = arg0.method404();
					field602[var5][0][var6] = arg0.method404();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field600[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field601[var7][1][var8] = field601[var7][0][var8];
						field602[var7][1][var8] = field602[var7][0][var8];
					} else {
						field601[var7][1][var8] = arg0.method404();
						field602[var7][1][var8] = arg0.method404();
					}
				}
			}

			if (var4 != 0 || field603[1] != field603[0]) {
				arg1.method499(arg0);
			}
		}
	}
}
