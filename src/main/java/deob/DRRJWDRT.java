package deob;

@ObfuscatedName("DRRJWDRT")
public class DRRJWDRT {

	@ObfuscatedName("DRRJWDRT.c")
	public int[] field541 = new int[2];

	@ObfuscatedName("DRRJWDRT.d")
	public int[][][] field542 = new int[2][2][4];

	@ObfuscatedName("DRRJWDRT.e")
	public int[][][] field543 = new int[2][2][4];

	@ObfuscatedName("DRRJWDRT.f")
	public int[] field544 = new int[2];

	@ObfuscatedName("DRRJWDRT.g")
	public static float[][] field545 = new float[2][8];

	@ObfuscatedName("DRRJWDRT.h")
	public static int[][] field546 = new int[2][8];

	@ObfuscatedName("DRRJWDRT.i")
	public static float field547;

	@ObfuscatedName("DRRJWDRT.j")
	public static int field548;

	@ObfuscatedName("DRRJWDRT.a(IFII)F")
	public float method259(int arg0, float arg1, int arg2) {
		float var4 = (field543[arg0][1][arg2] - field543[arg0][0][arg2]) * arg1 + field543[arg0][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("DRRJWDRT.a(FI)F")
	public float method260(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("DRRJWDRT.a(IIIF)F")
	public float method261(int arg0, int arg1, float arg2) {
		float var4 = (field542[arg0][1][arg1] - field542[arg0][0][arg1]) * arg2 + field542[arg0][0][arg1];
		var4 *= 1.2207031E-4F;
		return method260(var4);
	}

	@ObfuscatedName("DRRJWDRT.a(ZIF)I")
	public int method262(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field544[1] - field544[0]) * arg1 + field544[0];
			var3 *= 0.0030517578F;
			field547 = (float) Math.pow(0.1D, var3 / 20.0F);
			field548 = (int) (field547 * 65536.0F);
		}

		if (field541[arg0] == 0) {
			return 0;
		}

		float var4 = method259(arg0, arg1, 0);
		field545[arg0][0] = var4 * -2.0F * (float) Math.cos(method261(arg0, 0, arg1));
		field545[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field541[arg0]; var5++) {
			float var6 = method259(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method261(arg0, var5, arg1));
			float var8 = var6 * var6;
			field545[arg0][var5 * 2 + 1] = field545[arg0][var5 * 2 - 1] * var8;
			field545[arg0][var5 * 2] = field545[arg0][var5 * 2 - 1] * var7 + field545[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field545[arg0][var9] += field545[arg0][var9 - 1] * var7 + field545[arg0][var9 - 2] * var8;
			}

			field545[arg0][1] += field545[arg0][0] * var7 + var8;
			field545[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field541[0] * 2; var10++) {
				field545[0][var10] *= field547;
			}
		}

		for (int var11 = 0; var11 < field541[arg0] * 2; var11++) {
			field546[arg0][var11] = (int) (field545[arg0][var11] * 65536.0F);
		}

		return field541[arg0] * 2;
	}

	@ObfuscatedName("DRRJWDRT.a(LDNFIVRJB;BLCFARFRSG;)V")
	public final void method263(DNFIVRJB arg0, CFARFRSG arg1) {
		int var3 = arg1.method30();
		field541[0] = var3 >> 4;
		field541[1] = var3 & 0xF;
		if (var3 == 0) {
			field544[0] = field544[1] = 0;
		} else {
			field544[0] = arg1.method32();
			field544[1] = arg1.method32();
			int var4 = arg1.method30();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field541[var5]; var6++) {
					field542[var5][0][var6] = arg1.method32();
					field543[var5][0][var6] = arg1.method32();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field541[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field542[var7][1][var8] = field542[var7][0][var8];
						field543[var7][1][var8] = field543[var7][0][var8];
					} else {
						field542[var7][1][var8] = arg1.method32();
						field543[var7][1][var8] = arg1.method32();
					}
				}
			}

			if (var4 != 0 || field544[1] != field544[0]) {
				arg0.method256(arg1);
			}
		}
	}
}
