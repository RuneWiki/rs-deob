package deob;

@ObfuscatedName("DQYHQSPL")
public class DQYHQSPL {

	@ObfuscatedName("DQYHQSPL.c")
	public int[] field681 = new int[2];

	@ObfuscatedName("DQYHQSPL.d")
	public int[][][] field682 = new int[2][2][4];

	@ObfuscatedName("DQYHQSPL.e")
	public int[][][] field683 = new int[2][2][4];

	@ObfuscatedName("DQYHQSPL.f")
	public int[] field684 = new int[2];

	@ObfuscatedName("DQYHQSPL.g")
	public static float[][] field685 = new float[2][8];

	@ObfuscatedName("DQYHQSPL.h")
	public static int[][] field686 = new int[2][8];

	@ObfuscatedName("DQYHQSPL.i")
	public static float field687;

	@ObfuscatedName("DQYHQSPL.j")
	public static int field688;

	@ObfuscatedName("DQYHQSPL.a(IIFI)F")
	public float method242(int arg0, float arg1, int arg2) {
		float var4 = (field683[arg0][1][arg2] - field683[arg0][0][arg2]) * arg1 + field683[arg0][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("DQYHQSPL.a(IF)F")
	public float method243(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("DQYHQSPL.a(ZFII)F")
	public float method244(float arg0, int arg1, int arg2) {
		float var4 = (field682[arg1][1][arg2] - field682[arg1][0][arg2]) * arg0 + field682[arg1][0][arg2];
		var4 *= 1.2207031E-4F;
		return method243(var4);
	}

	@ObfuscatedName("DQYHQSPL.a(IIF)I")
	public int method245(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field684[1] - field684[0]) * arg1 + field684[0];
			var3 *= 0.0030517578F;
			field687 = (float) Math.pow(0.1D, var3 / 20.0F);
			field688 = (int) (field687 * 65536.0F);
		}

		if (field681[arg0] == 0) {
			return 0;
		}

		float var4 = method242(arg0, arg1, 0);
		field685[arg0][0] = var4 * -2.0F * (float) Math.cos(method244(arg1, arg0, 0));
		field685[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field681[arg0]; var5++) {
			float var6 = method242(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method244(arg1, arg0, var5));
			float var8 = var6 * var6;
			field685[arg0][var5 * 2 + 1] = field685[arg0][var5 * 2 - 1] * var8;
			field685[arg0][var5 * 2] = field685[arg0][var5 * 2 - 1] * var7 + field685[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field685[arg0][var9] += field685[arg0][var9 - 1] * var7 + field685[arg0][var9 - 2] * var8;
			}

			field685[arg0][1] += field685[arg0][0] * var7 + var8;
			field685[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field681[0] * 2; var10++) {
				field685[0][var10] *= field687;
			}
		}

		for (int var11 = 0; var11 < field681[arg0] * 2; var11++) {
			field686[arg0][var11] = (int) (field685[arg0][var11] * 65536.0F);
		}

		return field681[arg0] * 2;
	}

	@ObfuscatedName("DQYHQSPL.a(ILRSNWTZPO;LINLHDAGO;)V")
	public final void method246(RSNWTZPO arg0, INLHDAGO arg1) {
		int var3 = arg1.method308();
		field681[0] = var3 >> 4;
		field681[1] = var3 & 0xF;
		if (var3 == 0) {
			field684[0] = field684[1] = 0;
		} else {
			field684[0] = arg1.method310();
			field684[1] = arg1.method310();
			int var4 = arg1.method308();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field681[var5]; var6++) {
					field682[var5][0][var6] = arg1.method310();
					field683[var5][0][var6] = arg1.method310();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field681[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field682[var7][1][var8] = field682[var7][0][var8];
						field683[var7][1][var8] = field683[var7][0][var8];
					} else {
						field682[var7][1][var8] = arg1.method310();
						field683[var7][1][var8] = arg1.method310();
					}
				}
			}

			if (var4 != 0 || field684[1] != field684[0]) {
				arg0.method466(arg1);
			}
		}
	}
}
