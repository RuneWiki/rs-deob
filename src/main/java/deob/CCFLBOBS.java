package deob;

@ObfuscatedName("CCFLBOBS")
public class CCFLBOBS extends FFAASUKE {

	@ObfuscatedName("CCFLBOBS.m")
	public static int field91;

	@ObfuscatedName("CCFLBOBS.n")
	public static int field92;

	@ObfuscatedName("CCFLBOBS.o")
	public static int field93;

	@ObfuscatedName("CCFLBOBS.p")
	public static int field94;

	@ObfuscatedName("CCFLBOBS.q")
	public static int field95;

	@ObfuscatedName("CCFLBOBS.r")
	public static int field96;

	@ObfuscatedName("CCFLBOBS.s")
	public static int field97;

	@ObfuscatedName("CCFLBOBS.t")
	public static int field98;

	@ObfuscatedName("CCFLBOBS.u")
	public static int field99;

	@ObfuscatedName("CCFLBOBS.l")
	public static int[] field90;

	@ObfuscatedName("CCFLBOBS.a(I[III)V")
	public static void method138(int arg0, int[] arg1, int arg2) {
		field90 = arg1;
		field91 = arg2;
		field92 = arg0;
		method140(0, 0, arg2, arg0);
	}

	@ObfuscatedName("CCFLBOBS.a(I)V")
	public static void method139() {
		field95 = 0;
		field93 = 0;
		field96 = field91;
		field94 = field92;
		field97 = field96 - 1;
		field98 = field96 / 2;
	}

	@ObfuscatedName("CCFLBOBS.a(IZIII)V")
	public static void method140(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg2 > field91) {
			arg2 = field91;
		}

		if (arg3 > field92) {
			arg3 = field92;
		}

		field95 = arg0;
		field93 = arg1;
		field96 = arg2;
		field94 = arg3;
		field97 = field96 - 1;
		field98 = field96 / 2;
		field99 = field94 / 2;
	}

	@ObfuscatedName("CCFLBOBS.a(Z)V")
	public static void method141() {
		int var0 = field92 * field91;
		for (int var1 = 0; var1 < var0; var1++) {
			field90[var1] = 0;
		}
	}

	@ObfuscatedName("CCFLBOBS.a(IIIIIII)V")
	public static void method142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 < field95) {
			arg3 -= field95 - arg2;
			arg2 = field95;
		}

		if (arg4 < field93) {
			arg0 -= field93 - arg4;
			arg4 = field93;
		}

		if (arg2 + arg3 > field96) {
			arg3 = field96 - arg2;
		}

		if (arg0 + arg4 > field94) {
			arg0 = field94 - arg4;
		}

		int var6 = 256 - arg5;
		int var7 = (arg1 >> 16 & 0xFF) * arg5;
		int var8 = (arg1 >> 8 & 0xFF) * arg5;
		int var9 = (arg1 & 0xFF) * arg5;
		int var10 = field91 - arg3;
		int var11 = field91 * arg4 + arg2;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field90[var11] >> 16 & 0xFF) * var6;
				int var15 = (field90[var11] >> 8 & 0xFF) * var6;
				int var16 = (field90[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field90[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("CCFLBOBS.a(IIIIIZ)V")
	public static void method143(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field95) {
			arg3 -= field95 - arg1;
			arg1 = field95;
		}

		if (arg2 < field93) {
			arg4 -= field93 - arg2;
			arg2 = field93;
		}

		if (arg1 + arg3 > field96) {
			arg3 = field96 - arg1;
		}

		if (arg2 + arg4 > field94) {
			arg4 = field94 - arg2;
		}

		int var5 = field91 - arg3;
		int var6 = field91 * arg2 + arg1;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field90[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("CCFLBOBS.a(IIIIII)V")
	public static void method144(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method146(arg4, arg2, arg1, arg0);
		method146(arg4, arg2, arg1, arg0 + arg3 - 1);
		method148(arg1, arg3, arg2, arg0);
		method148(arg1, arg3, arg2 + arg4 - 1, arg0);
	}

	@ObfuscatedName("CCFLBOBS.b(IIIIIII)V")
	public static void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method147(arg1, arg5, arg0, arg2, arg4);
		method147(arg1, arg5, arg0, arg2 + arg3 - 1, arg4);

		if (arg3 >= 3) {
			method149(arg5, arg2 + 1, arg1, arg4, arg3 - 2);
			method149(arg5, arg2 + 1, arg0 + arg1 - 1, arg4, arg3 - 2);
		}
	}

	@ObfuscatedName("CCFLBOBS.a(IIIII)V")
	public static void method146(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field93 && arg3 < field94) {
			if (arg1 < field95) {
				arg0 -= field95 - arg1;
				arg1 = field95;
			}

			if (arg0 + arg1 > field96) {
				arg0 = field96 - arg1;
			}

			int var4 = field91 * arg3 + arg1;
			for (int var5 = 0; var5 < arg0; var5++) {
				field90[var4 + var5] = arg2;
			}
		}
	}

	@ObfuscatedName("CCFLBOBS.b(IIIIII)V")
	public static void method147(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field93 && arg3 < field94) {
			if (arg0 < field95) {
				arg2 -= field95 - arg0;
				arg0 = field95;
			}

			if (arg0 + arg2 > field96) {
				arg2 = field96 - arg0;
			}

			int var5 = 256 - arg4;
			int var6 = (arg1 >> 16 & 0xFF) * arg4;
			int var7 = (arg1 >> 8 & 0xFF) * arg4;
			int var8 = (arg1 & 0xFF) * arg4;
			int var9 = field91 * arg3 + arg0;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field90[var9] >> 16 & 0xFF) * var5;
				int var12 = (field90[var9] >> 8 & 0xFF) * var5;
				int var13 = (field90[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field90[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("CCFLBOBS.a(IIIZI)V")
	public static void method148(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field95 && arg2 < field96) {
			if (arg3 < field93) {
				arg1 -= field93 - arg3;
				arg3 = field93;
			}

			if (arg1 + arg3 > field94) {
				arg1 = field94 - arg3;
			}

			int var4 = field91 * arg3 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field90[field91 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("CCFLBOBS.c(IIIIII)V")
	public static void method149(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field95 && arg2 < field96) {
			if (arg1 < field93) {
				arg4 -= field93 - arg1;
				arg1 = field93;
			}

			if (arg1 + arg4 > field94) {
				arg4 = field94 - arg1;
			}

			int var5 = 256 - arg3;
			int var6 = (arg0 >> 16 & 0xFF) * arg3;
			int var7 = (arg0 >> 8 & 0xFF) * arg3;
			int var8 = (arg0 & 0xFF) * arg3;
			int var9 = field91 * arg1 + arg2;
			for (int var10 = 0; var10 < arg4; var10++) {
				int var11 = (field90[var9] >> 16 & 0xFF) * var5;
				int var12 = (field90[var9] >> 8 & 0xFF) * var5;
				int var13 = (field90[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field90[var9] = var14;
				var9 += field91;
			}
		}
	}
}
