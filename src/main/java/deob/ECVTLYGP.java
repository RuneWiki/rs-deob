package deob;

@ObfuscatedName("ECVTLYGP")
public class ECVTLYGP {

	@ObfuscatedName("ECVTLYGP.c")
	public int[] field632 = new int[2];

	@ObfuscatedName("ECVTLYGP.d")
	public int[][][] field633 = new int[2][2][4];

	@ObfuscatedName("ECVTLYGP.e")
	public int[][][] field634 = new int[2][2][4];

	@ObfuscatedName("ECVTLYGP.f")
	public int[] field635 = new int[2];

	@ObfuscatedName("ECVTLYGP.g")
	public static float[][] field636 = new float[2][8];

	@ObfuscatedName("ECVTLYGP.h")
	public static int[][] field637 = new int[2][8];

	@ObfuscatedName("ECVTLYGP.i")
	public static float field638;

	@ObfuscatedName("ECVTLYGP.j")
	public static int field639;

	@ObfuscatedName("ECVTLYGP.a(IFII)F")
	public float method194(int arg0, float arg1, int arg2) {
		float var4 = (field634[arg0][1][arg2] - field634[arg0][0][arg2]) * arg1 + field634[arg0][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("ECVTLYGP.a(IF)F")
	public float method195(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("ECVTLYGP.a(FIII)F")
	public float method196(float arg0, int arg1, int arg2) {
		float var4 = (field633[arg2][1][arg1] - field633[arg2][0][arg1]) * arg0 + field633[arg2][0][arg1];
		var4 *= 1.2207031E-4F;
		return method195(var4);
	}

	@ObfuscatedName("ECVTLYGP.a(IIF)I")
	public int method197(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field635[1] - field635[0]) * arg1 + field635[0];
			var3 *= 0.0030517578F;
			field638 = (float) Math.pow(0.1D, var3 / 20.0F);
			field639 = (int) (field638 * 65536.0F);
		}

		if (field632[arg0] == 0) {
			return 0;
		}

		float var4 = method194(arg0, arg1, 0);
		field636[arg0][0] = var4 * -2.0F * (float) Math.cos(method196(arg1, 0, arg0));
		field636[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field632[arg0]; var5++) {
			float var6 = method194(arg0, arg1, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method196(arg1, var5, arg0));
			float var8 = var6 * var6;
			field636[arg0][var5 * 2 + 1] = field636[arg0][var5 * 2 - 1] * var8;
			field636[arg0][var5 * 2] = field636[arg0][var5 * 2 - 1] * var7 + field636[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field636[arg0][var9] += field636[arg0][var9 - 1] * var7 + field636[arg0][var9 - 2] * var8;
			}

			field636[arg0][1] += field636[arg0][0] * var7 + var8;
			field636[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field632[0] * 2; var10++) {
				field636[0][var10] *= field638;
			}
		}

		for (int var11 = 0; var11 < field632[arg0] * 2; var11++) {
			field637[arg0][var11] = (int) (field636[arg0][var11] * 65536.0F);
		}

		return field632[arg0] * 2;
	}

	@ObfuscatedName("ECVTLYGP.a(BLYOXDZEVD;LNSRSHTPL;)V")
	public final void method198(YOXDZEVD arg0, NSRSHTPL arg1) {
		int var3 = arg0.method549();
		field632[0] = var3 >> 4;
		field632[1] = var3 & 0xF;
		if (var3 == 0) {
			field635[0] = field635[1] = 0;
		} else {
			field635[0] = arg0.method551();
			field635[1] = arg0.method551();
			int var4 = arg0.method549();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field632[var5]; var6++) {
					field633[var5][0][var6] = arg0.method551();
					field634[var5][0][var6] = arg0.method551();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field632[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field633[var7][1][var8] = field633[var7][0][var8];
						field634[var7][1][var8] = field634[var7][0][var8];
					} else {
						field633[var7][1][var8] = arg0.method551();
						field634[var7][1][var8] = arg0.method551();
					}
				}
			}

			if (var4 != 0 || field635[1] != field635[0]) {
				arg1.method339(arg0);
			}
		}
	}
}
