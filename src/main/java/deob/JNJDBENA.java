package deob;

@ObfuscatedName("JNJDBENA")
public class JNJDBENA extends OGGHOMII {

	@ObfuscatedName("JNJDBENA.n")
	public static int field810;

	@ObfuscatedName("JNJDBENA.o")
	public static int field811;

	@ObfuscatedName("JNJDBENA.p")
	public static int field812;

	@ObfuscatedName("JNJDBENA.q")
	public static int field813;

	@ObfuscatedName("JNJDBENA.r")
	public static int field814;

	@ObfuscatedName("JNJDBENA.s")
	public static int field815;

	@ObfuscatedName("JNJDBENA.t")
	public static int field816;

	@ObfuscatedName("JNJDBENA.u")
	public static int field817;

	@ObfuscatedName("JNJDBENA.v")
	public static int field818;

	@ObfuscatedName("JNJDBENA.m")
	public static int[] field809;

	@ObfuscatedName("JNJDBENA.a(IIB[I)V")
	public static void method283(int arg0, int arg1, int[] arg2) {
		field809 = arg2;
		field810 = arg0;
		field811 = arg1;
		method285(0, 0, arg1, arg0);
	}

	@ObfuscatedName("JNJDBENA.a(I)V")
	public static void method284() {
		field814 = 0;
		field812 = 0;
		field815 = field810;
		field813 = field811;
		field816 = field815 - 1;
		field817 = field815 / 2;
	}

	@ObfuscatedName("JNJDBENA.a(IIIII)V")
	public static void method285(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg3 > field810) {
			arg3 = field810;
		}

		if (arg2 > field811) {
			arg2 = field811;
		}

		field814 = arg0;
		field812 = arg1;
		field815 = arg3;
		field813 = arg2;
		field816 = field815 - 1;
		field817 = field815 / 2;
		field818 = field813 / 2;
	}

	@ObfuscatedName("JNJDBENA.b(I)V")
	public static void method286() {
		int var0 = field811 * field810;
		for (int var1 = 0; var1 < var0; var1++) {
			field809[var1] = 0;
		}
	}

	@ObfuscatedName("JNJDBENA.a(IIIIIIZ)V")
	public static void method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 < field814) {
			arg1 -= field814 - arg3;
			arg3 = field814;
		}

		if (arg4 < field812) {
			arg5 -= field812 - arg4;
			arg4 = field812;
		}

		if (arg1 + arg3 > field815) {
			arg1 = field815 - arg3;
		}

		if (arg4 + arg5 > field813) {
			arg5 = field813 - arg4;
		}

		int var6 = 256 - arg0;
		int var7 = (arg2 >> 16 & 0xFF) * arg0;
		int var8 = (arg2 >> 8 & 0xFF) * arg0;
		int var9 = (arg2 & 0xFF) * arg0;
		int var10 = field810 - arg1;
		int var11 = field810 * arg4 + arg3;
		for (int var12 = 0; var12 < arg5; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field809[var11] >> 16 & 0xFF) * var6;
				int var15 = (field809[var11] >> 8 & 0xFF) * var6;
				int var16 = (field809[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field809[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("JNJDBENA.a(IIIIII)V")
	public static void method288(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 < field814) {
			arg2 -= field814 - arg0;
			arg0 = field814;
		}

		if (arg1 < field812) {
			arg4 -= field812 - arg1;
			arg1 = field812;
		}

		if (arg0 + arg2 > field815) {
			arg2 = field815 - arg0;
		}

		if (arg1 + arg4 > field813) {
			arg4 = field813 - arg1;
		}

		int var5 = field810 - arg2;
		int var6 = field810 * arg1 + arg0;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg2; var8 < 0; var8++) {
				field809[var6++] = arg3;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("JNJDBENA.b(IIIIII)V")
	public static void method289(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method291(arg0, arg1, arg3, arg2);
		method291(arg0, arg1, arg3, arg2 + arg4 - 1);
		method293(arg4, arg3, arg0, arg2);
		method293(arg4, arg3, arg0 + arg1 - 1, arg2);
	}

	@ObfuscatedName("JNJDBENA.a(IIIIIII)V")
	public static void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method292(arg0, arg4, arg5, arg2, arg3);
		method292(arg0, arg4, arg5, arg2, arg1 + arg3 - 1);

		if (arg1 >= 3) {
			method294(arg4, arg0, arg5, arg1 - 2, arg3 + 1);
			method294(arg2 + arg4 - 1, arg0, arg5, arg1 - 2, arg3 + 1);
		}
	}

	@ObfuscatedName("JNJDBENA.b(IIIII)V")
	public static void method291(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field812 && arg3 < field813) {
			if (arg0 < field814) {
				arg1 -= field814 - arg0;
				arg0 = field814;
			}

			if (arg0 + arg1 > field815) {
				arg1 = field815 - arg0;
			}

			int var4 = field810 * arg3 + arg0;
			for (int var5 = 0; var5 < arg1; var5++) {
				field809[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("JNJDBENA.c(IIIIII)V")
	public static void method292(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field812 && arg4 < field813) {
			if (arg1 < field814) {
				arg3 -= field814 - arg1;
				arg1 = field814;
			}

			if (arg1 + arg3 > field815) {
				arg3 = field815 - arg1;
			}

			int var5 = 256 - arg0;
			int var6 = (arg2 >> 16 & 0xFF) * arg0;
			int var7 = (arg2 >> 8 & 0xFF) * arg0;
			int var8 = (arg2 & 0xFF) * arg0;
			int var9 = field810 * arg4 + arg1;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field809[var9] >> 16 & 0xFF) * var5;
				int var12 = (field809[var9] >> 8 & 0xFF) * var5;
				int var13 = (field809[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field809[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("JNJDBENA.c(IIIII)V")
	public static void method293(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field814 && arg2 < field815) {
			if (arg3 < field812) {
				arg0 -= field812 - arg3;
				arg3 = field812;
			}

			if (arg0 + arg3 > field813) {
				arg0 = field813 - arg3;
			}

			int var4 = field810 * arg3 + arg2;
			for (int var5 = 0; var5 < arg0; var5++) {
				field809[field810 * var5 + var4] = arg1;
			}
		}
	}

	@ObfuscatedName("JNJDBENA.d(IIIIII)V")
	public static void method294(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 >= field814 && arg0 < field815) {
			if (arg4 < field812) {
				arg3 -= field812 - arg4;
				arg4 = field812;
			}

			if (arg3 + arg4 > field813) {
				arg3 = field813 - arg4;
			}

			int var5 = 256 - arg1;
			int var6 = (arg2 >> 16 & 0xFF) * arg1;
			int var7 = (arg2 >> 8 & 0xFF) * arg1;
			int var8 = (arg2 & 0xFF) * arg1;
			int var9 = field810 * arg4 + arg0;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field809[var9] >> 16 & 0xFF) * var5;
				int var12 = (field809[var9] >> 8 & 0xFF) * var5;
				int var13 = (field809[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field809[var9] = var14;
				var9 += field810;
			}
		}
	}
}
