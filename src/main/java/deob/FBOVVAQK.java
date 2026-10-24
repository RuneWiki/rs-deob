package deob;

@ObfuscatedName("FBOVVAQK")
public class FBOVVAQK extends AGCGSOQI {

	@ObfuscatedName("FBOVVAQK.n")
	public static int field592;

	@ObfuscatedName("FBOVVAQK.o")
	public static int field593;

	@ObfuscatedName("FBOVVAQK.p")
	public static int field594;

	@ObfuscatedName("FBOVVAQK.q")
	public static int field595;

	@ObfuscatedName("FBOVVAQK.r")
	public static int field596;

	@ObfuscatedName("FBOVVAQK.s")
	public static int field597;

	@ObfuscatedName("FBOVVAQK.t")
	public static int field598;

	@ObfuscatedName("FBOVVAQK.u")
	public static int field599;

	@ObfuscatedName("FBOVVAQK.v")
	public static int field600;

	@ObfuscatedName("FBOVVAQK.m")
	public static int[] field591;

	@ObfuscatedName("FBOVVAQK.a([IIII)V")
	public static void method230(int[] arg0, int arg1, int arg2) {
		field591 = arg0;
		field592 = arg1;
		field593 = arg2;
		method232(arg1, 0, arg2, 0);
	}

	@ObfuscatedName("FBOVVAQK.a(Z)V")
	public static void method231() {
		field596 = 0;
		field594 = 0;
		field597 = field592;
		field595 = field593;
		field598 = field597 - 1;
		field599 = field597 / 2;
	}

	@ObfuscatedName("FBOVVAQK.a(IIBII)V")
	public static void method232(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg0 > field592) {
			arg0 = field592;
		}

		if (arg2 > field593) {
			arg2 = field593;
		}

		field596 = arg1;
		field594 = arg3;
		field597 = arg0;
		field595 = arg2;
		field598 = field597 - 1;
		field599 = field597 / 2;
		field600 = field595 / 2;
	}

	@ObfuscatedName("FBOVVAQK.b(Z)V")
	public static void method233() {
		int var0 = field593 * field592;
		for (int var1 = 0; var1 < var0; var1++) {
			field591[var1] = 0;
		}
	}

	@ObfuscatedName("FBOVVAQK.a(IIIIZII)V")
	public static void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field596) {
			arg3 -= field596 - arg1;
			arg1 = field596;
		}

		if (arg0 < field594) {
			arg4 -= field594 - arg0;
			arg0 = field594;
		}

		if (arg1 + arg3 > field597) {
			arg3 = field597 - arg1;
		}

		if (arg0 + arg4 > field595) {
			arg4 = field595 - arg0;
		}

		int var6 = 256 - arg2;
		int var7 = (arg5 >> 16 & 0xFF) * arg2;
		int var8 = (arg5 >> 8 & 0xFF) * arg2;
		int var9 = (arg5 & 0xFF) * arg2;
		int var10 = field592 - arg3;
		int var11 = field592 * arg0 + arg1;
		for (int var12 = 0; var12 < arg4; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field591[var11] >> 16 & 0xFF) * var6;
				int var15 = (field591[var11] >> 8 & 0xFF) * var6;
				int var16 = (field591[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field591[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("FBOVVAQK.a(ZIIIII)V")
	public static void method235(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 < field596) {
			arg1 -= field596 - arg4;
			arg4 = field596;
		}

		if (arg2 < field594) {
			arg0 -= field594 - arg2;
			arg2 = field594;
		}

		if (arg1 + arg4 > field597) {
			arg1 = field597 - arg4;
		}

		if (arg0 + arg2 > field595) {
			arg0 = field595 - arg2;
		}

		int var5 = field592 - arg1;
		int var6 = field592 * arg2 + arg4;
		for (int var7 = -arg0; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field591[var6++] = arg3;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("FBOVVAQK.a(IIIIII)V")
	public static void method236(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method238(arg2, arg3, arg1, arg4);
		method238(arg2, arg3, arg1, arg0 + arg4 - 1);
		method240(arg1, arg4, arg3, arg0);
		method240(arg1 + arg2 - 1, arg4, arg3, arg0);
	}

	@ObfuscatedName("FBOVVAQK.a(IIIIIIZ)V")
	public static void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method239(arg0, arg5, arg1, arg3, arg4);
		method239(arg0, arg5, arg1 + arg2 - 1, arg3, arg4);

		if (arg2 >= 3) {
			method241(arg5, arg2 - 2, arg0, arg3, arg1 + 1);
			method241(arg4 + arg5 - 1, arg2 - 2, arg0, arg3, arg1 + 1);
		}
	}

	@ObfuscatedName("FBOVVAQK.a(IIIII)V")
	public static void method238(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field594 && arg3 < field595) {
			if (arg2 < field596) {
				arg0 -= field596 - arg2;
				arg2 = field596;
			}

			if (arg0 + arg2 > field597) {
				arg0 = field597 - arg2;
			}

			int var4 = field592 * arg3 + arg2;
			for (int var5 = 0; var5 < arg0; var5++) {
				field591[var4 + var5] = arg1;
			}
		}
	}

	@ObfuscatedName("FBOVVAQK.b(IIIIII)V")
	public static void method239(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field594 && arg2 < field595) {
			if (arg1 < field596) {
				arg4 -= field596 - arg1;
				arg1 = field596;
			}

			if (arg1 + arg4 > field597) {
				arg4 = field597 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg3 >> 16 & 0xFF) * arg0;
			int var7 = (arg3 >> 8 & 0xFF) * arg0;
			int var8 = (arg3 & 0xFF) * arg0;
			int var9 = field592 * arg2 + arg1;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field591[var9] >> 16 & 0xFF) * var5;
				int var12 = (field591[var9] >> 8 & 0xFF) * var5;
				int var13 = (field591[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field591[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("FBOVVAQK.b(IIIII)V")
	public static void method240(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field596 && arg0 < field597) {
			if (arg1 < field594) {
				arg3 -= field594 - arg1;
				arg1 = field594;
			}

			if (arg1 + arg3 > field595) {
				arg3 = field595 - arg1;
			}

			int var4 = field592 * arg1 + arg0;
			for (int var5 = 0; var5 < arg3; var5++) {
				field591[field592 * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("FBOVVAQK.a(IBIIII)V")
	public static void method241(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field596 && arg0 < field597) {
			if (arg4 < field594) {
				arg1 -= field594 - arg4;
				arg4 = field594;
			}

			if (arg1 + arg4 > field595) {
				arg1 = field595 - arg4;
			}

			int var5 = 256 - arg2;
			int var6 = (arg3 >> 16 & 0xFF) * arg2;
			int var7 = (arg3 >> 8 & 0xFF) * arg2;
			int var8 = (arg3 & 0xFF) * arg2;
			int var9 = field592 * arg4 + arg0;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field591[var9] >> 16 & 0xFF) * var5;
				int var12 = (field591[var9] >> 8 & 0xFF) * var5;
				int var13 = (field591[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field591[var9] = var14;
				var9 += field592;
			}
		}
	}
}
