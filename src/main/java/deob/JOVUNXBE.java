package deob;

@ObfuscatedName("JOVUNXBE")
public class JOVUNXBE extends CYIKEZWP {

	@ObfuscatedName("JOVUNXBE.p")
	public static int field851;

	@ObfuscatedName("JOVUNXBE.q")
	public static int field852;

	@ObfuscatedName("JOVUNXBE.r")
	public static int field853;

	@ObfuscatedName("JOVUNXBE.s")
	public static int field854;

	@ObfuscatedName("JOVUNXBE.t")
	public static int field855;

	@ObfuscatedName("JOVUNXBE.u")
	public static int field856;

	@ObfuscatedName("JOVUNXBE.v")
	public static int field857;

	@ObfuscatedName("JOVUNXBE.w")
	public static int field858;

	@ObfuscatedName("JOVUNXBE.x")
	public static int field859;

	@ObfuscatedName("JOVUNXBE.o")
	public static int[] field850;

	@ObfuscatedName("JOVUNXBE.a([IIII)V")
	public static void method380(int[] arg0, int arg1, int arg2) {
		field850 = arg0;
		field851 = arg1;
		field852 = arg2;
		method382(arg1, 0, 0, arg2);
	}

	@ObfuscatedName("JOVUNXBE.a(B)V")
	public static void method381() {
		field855 = 0;
		field853 = 0;
		field856 = field851;
		field854 = field852;
		field857 = field856 - 1;
		field858 = field856 / 2;
	}

	@ObfuscatedName("JOVUNXBE.a(IIIII)V")
	public static void method382(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg0 > field851) {
			arg0 = field851;
		}

		if (arg3 > field852) {
			arg3 = field852;
		}

		field855 = arg1;
		field853 = arg2;
		field856 = arg0;
		field854 = arg3;
		field857 = field856 - 1;
		field858 = field856 / 2;
		field859 = field854 / 2;
	}

	@ObfuscatedName("JOVUNXBE.b(B)V")
	public static void method383() {
		int var0 = field852 * field851;
		for (int var1 = 0; var1 < var0; var1++) {
			field850[var1] = 0;
		}
	}

	@ObfuscatedName("JOVUNXBE.a(IIIIIIZ)V")
	public static void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field855) {
			arg1 -= field855 - arg4;
			arg4 = field855;
		}

		if (arg2 < field853) {
			arg3 -= field853 - arg2;
			arg2 = field853;
		}

		if (arg1 + arg4 > field856) {
			arg1 = field856 - arg4;
		}

		if (arg2 + arg3 > field854) {
			arg3 = field854 - arg2;
		}

		int var6 = 256 - arg0;
		int var7 = (arg5 >> 16 & 0xFF) * arg0;
		int var8 = (arg5 >> 8 & 0xFF) * arg0;
		int var9 = (arg5 & 0xFF) * arg0;
		int var10 = field851 - arg1;
		int var11 = field851 * arg2 + arg4;
		for (int var12 = 0; var12 < arg3; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field850[var11] >> 16 & 0xFF) * var6;
				int var15 = (field850[var11] >> 8 & 0xFF) * var6;
				int var16 = (field850[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field850[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("JOVUNXBE.a(IIIIBI)V")
	public static void method385(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 < field855) {
			arg1 -= field855 - arg3;
			arg3 = field855;
		}

		if (arg0 < field853) {
			arg2 -= field853 - arg0;
			arg0 = field853;
		}

		if (arg1 + arg3 > field856) {
			arg1 = field856 - arg3;
		}

		if (arg0 + arg2 > field854) {
			arg2 = field854 - arg0;
		}

		int var5 = field851 - arg1;
		int var6 = field851 * arg0 + arg3;
		for (int var7 = -arg2; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field850[var6++] = arg4;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("JOVUNXBE.a(IIIIII)V")
	public static void method386(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method388(arg4, arg3, arg0, arg2);
		method388(arg1 + arg4 - 1, arg3, arg0, arg2);
		method390(arg4, arg3, arg2, arg1);
		method390(arg4, arg0 + arg3 - 1, arg2, arg1);
	}

	@ObfuscatedName("JOVUNXBE.a(BIIIIII)V")
	public static void method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method389(arg2, arg3, arg5, arg1, arg4);
		method389(arg2, arg3, arg5, arg0 + arg1 - 1, arg4);

		if (arg0 >= 3) {
			method391(arg4, arg0 - 2, arg1 + 1, arg5, arg2);
			method391(arg4, arg0 - 2, arg1 + 1, arg3 + arg5 - 1, arg2);
		}
	}

	@ObfuscatedName("JOVUNXBE.b(IIIII)V")
	public static void method388(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 >= field853 && arg0 < field854) {
			if (arg1 < field855) {
				arg2 -= field855 - arg1;
				arg1 = field855;
			}

			if (arg1 + arg2 > field856) {
				arg2 = field856 - arg1;
			}

			int var4 = field851 * arg0 + arg1;
			for (int var5 = 0; var5 < arg2; var5++) {
				field850[var4 + var5] = arg3;
			}
		}
	}

	@ObfuscatedName("JOVUNXBE.b(IIIIII)V")
	public static void method389(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field853 && arg3 < field854) {
			if (arg2 < field855) {
				arg1 -= field855 - arg2;
				arg2 = field855;
			}

			if (arg1 + arg2 > field856) {
				arg1 = field856 - arg2;
			}

			int var5 = 256 - arg4;
			int var6 = (arg0 >> 16 & 0xFF) * arg4;
			int var7 = (arg0 >> 8 & 0xFF) * arg4;
			int var8 = (arg0 & 0xFF) * arg4;
			int var9 = field851 * arg3 + arg2;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field850[var9] >> 16 & 0xFF) * var5;
				int var12 = (field850[var9] >> 8 & 0xFF) * var5;
				int var13 = (field850[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field850[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("JOVUNXBE.a(IIIZI)V")
	public static void method390(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field855 && arg1 < field856) {
			if (arg0 < field853) {
				arg3 -= field853 - arg0;
				arg0 = field853;
			}

			if (arg0 + arg3 > field854) {
				arg3 = field854 - arg0;
			}

			int var4 = field851 * arg0 + arg1;
			for (int var5 = 0; var5 < arg3; var5++) {
				field850[field851 * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("JOVUNXBE.c(IIIIII)V")
	public static void method391(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field855 && arg3 < field856) {
			if (arg2 < field853) {
				arg1 -= field853 - arg2;
				arg2 = field853;
			}

			if (arg1 + arg2 > field854) {
				arg1 = field854 - arg2;
			}

			int var5 = 256 - arg0;
			int var6 = (arg4 >> 16 & 0xFF) * arg0;
			int var7 = (arg4 >> 8 & 0xFF) * arg0;
			int var8 = (arg4 & 0xFF) * arg0;
			int var9 = field851 * arg2 + arg3;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field850[var9] >> 16 & 0xFF) * var5;
				int var12 = (field850[var9] >> 8 & 0xFF) * var5;
				int var13 = (field850[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field850[var9] = var14;
				var9 += field851;
			}
		}
	}
}
