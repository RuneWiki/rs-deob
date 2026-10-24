package deob;

@ObfuscatedName("GLZZOSSI")
public class GLZZOSSI {

	@ObfuscatedName("GLZZOSSI.a")
	public int[] field604 = new int[2];

	@ObfuscatedName("GLZZOSSI.b")
	public int[][][] field605 = new int[2][2][4];

	@ObfuscatedName("GLZZOSSI.c")
	public int[][][] field606 = new int[2][2][4];

	@ObfuscatedName("GLZZOSSI.d")
	public int[] field607 = new int[2];

	@ObfuscatedName("GLZZOSSI.e")
	public static float[][] field608 = new float[2][8];

	@ObfuscatedName("GLZZOSSI.f")
	public static int[][] field609 = new int[2][8];

	@ObfuscatedName("GLZZOSSI.g")
	public static float field610;

	@ObfuscatedName("GLZZOSSI.h")
	public static int field611;

	@ObfuscatedName("GLZZOSSI.a(FIZI)F")
	public float method251(float arg0, int arg1, int arg2) {
		float var4 = (field606[arg1][1][arg2] - field606[arg1][0][arg2]) * arg0 + field606[arg1][0][arg2];
		var4 *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, -var4 / 20.0F);
	}

	@ObfuscatedName("GLZZOSSI.a(ZF)F")
	public float method252(float arg0) {
		float var2 = (float) Math.pow(2.0D, arg0) * 32.703197F;
		return var2 * 3.1415927F / 11025.0F;
	}

	@ObfuscatedName("GLZZOSSI.a(FZII)F")
	public float method253(float arg0, int arg1, int arg2) {
		float var4 = (field605[arg1][1][arg2] - field605[arg1][0][arg2]) * arg0 + field605[arg1][0][arg2];
		var4 *= 1.2207031E-4F;
		return method252(var4);
	}

	@ObfuscatedName("GLZZOSSI.a(IIF)I")
	public int method254(int arg0, float arg1) {
		if (arg0 == 0) {
			float var3 = (field607[1] - field607[0]) * arg1 + field607[0];
			var3 *= 0.0030517578F;
			field610 = (float) Math.pow(0.1D, var3 / 20.0F);
			field611 = (int) (field610 * 65536.0F);
		}

		if (field604[arg0] == 0) {
			return 0;
		}

		float var4 = method251(arg1, arg0, 0);
		field608[arg0][0] = var4 * -2.0F * (float) Math.cos(method253(arg1, arg0, 0));
		field608[arg0][1] = var4 * var4;
		for (int var5 = 1; var5 < field604[arg0]; var5++) {
			float var6 = method251(arg1, arg0, var5);
			float var7 = var6 * -2.0F * (float) Math.cos(method253(arg1, arg0, var5));
			float var8 = var6 * var6;
			field608[arg0][var5 * 2 + 1] = field608[arg0][var5 * 2 - 1] * var8;
			field608[arg0][var5 * 2] = field608[arg0][var5 * 2 - 1] * var7 + field608[arg0][var5 * 2 - 2] * var8;
			for (int var9 = var5 * 2 - 1; var9 >= 2; var9--) {
				field608[arg0][var9] += field608[arg0][var9 - 1] * var7 + field608[arg0][var9 - 2] * var8;
			}

			field608[arg0][1] += field608[arg0][0] * var7 + var8;
			field608[arg0][0] += var7;
		}

		if (arg0 == 0) {
			for (int var10 = 0; var10 < field604[0] * 2; var10++) {
				field608[0][var10] *= field610;
			}
		}

		for (int var11 = 0; var11 < field604[arg0] * 2; var11++) {
			field609[arg0][var11] = (int) (field608[arg0][var11] * 65536.0F);
		}

		return field604[arg0] * 2;
	}

	@ObfuscatedName("GLZZOSSI.a(LDNRIFKTO;LGJKLDIZT;B)V")
	public final void method255(DNRIFKTO arg0, GJKLDIZT arg1) {
		int var3 = arg0.method189();
		field604[0] = var3 >> 4;
		field604[1] = var3 & 0xF;
		if (var3 == 0) {
			field607[0] = field607[1] = 0;
		} else {
			field607[0] = arg0.method191();
			field607[1] = arg0.method191();
			int var4 = arg0.method189();

			for (int var5 = 0; var5 < 2; var5++) {
				for (int var6 = 0; var6 < field604[var5]; var6++) {
					field605[var5][0][var6] = arg0.method191();
					field606[var5][0][var6] = arg0.method191();
				}
			}

			for (int var7 = 0; var7 < 2; var7++) {
				for (int var8 = 0; var8 < field604[var7]; var8++) {
					if ((var4 & 1 << var7 * 4 << var8) == 0) {
						field605[var7][1][var8] = field605[var7][0][var8];
						field606[var7][1][var8] = field606[var7][0][var8];
					} else {
						field605[var7][1][var8] = arg0.method191();
						field606[var7][1][var8] = arg0.method191();
					}
				}
			}

			if (var4 != 0 || field607[1] != field607[0]) {
				arg1.method248(arg0);
			}
		}
	}
}
