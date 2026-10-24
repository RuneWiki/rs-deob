package deob;

@ObfuscatedName("IIPNJDNO")
public class IIPNJDNO extends EEYSIGWL {

	@ObfuscatedName("IIPNJDNO.m")
	public static int field812;

	@ObfuscatedName("IIPNJDNO.n")
	public static int field813;

	@ObfuscatedName("IIPNJDNO.o")
	public static int field814;

	@ObfuscatedName("IIPNJDNO.p")
	public static int field815;

	@ObfuscatedName("IIPNJDNO.q")
	public static int field816;

	@ObfuscatedName("IIPNJDNO.r")
	public static int field817;

	@ObfuscatedName("IIPNJDNO.s")
	public static int field818;

	@ObfuscatedName("IIPNJDNO.t")
	public static int field819;

	@ObfuscatedName("IIPNJDNO.u")
	public static int field820;

	@ObfuscatedName("IIPNJDNO.l")
	public static int[] field811;

	@ObfuscatedName("IIPNJDNO.a([IIIZ)V")
	public static void method317(int[] arg0, int arg1, int arg2) {
		field811 = arg0;
		field812 = arg2;
		field813 = arg1;
		method319(arg2, 0, 0, arg1);
	}

	@ObfuscatedName("IIPNJDNO.a(I)V")
	public static void method318() {
		field816 = 0;
		field814 = 0;
		field817 = field812;
		field815 = field813;
		field818 = field817 - 1;
		field819 = field817 / 2;
	}

	@ObfuscatedName("IIPNJDNO.a(IIIII)V")
	public static void method319(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 > field812) {
			arg0 = field812;
		}

		if (arg3 > field813) {
			arg3 = field813;
		}

		field816 = arg2;
		field814 = arg1;
		field817 = arg0;
		field815 = arg3;
		field818 = field817 - 1;
		field819 = field817 / 2;
		field820 = field815 / 2;
	}

	@ObfuscatedName("IIPNJDNO.b(I)V")
	public static void method320() {
		int var0 = field813 * field812;
		for (int var1 = 0; var1 < var0; var1++) {
			field811[var1] = 0;
		}
	}

	@ObfuscatedName("IIPNJDNO.a(IIIIIII)V")
	public static void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field816) {
			arg3 -= field816 - arg4;
			arg4 = field816;
		}

		if (arg1 < field814) {
			arg0 -= field814 - arg1;
			arg1 = field814;
		}

		if (arg3 + arg4 > field817) {
			arg3 = field817 - arg4;
		}

		if (arg0 + arg1 > field815) {
			arg0 = field815 - arg1;
		}

		int var6 = 256 - arg2;
		int var7 = (arg5 >> 16 & 0xFF) * arg2;
		int var8 = (arg5 >> 8 & 0xFF) * arg2;
		int var9 = (arg5 & 0xFF) * arg2;
		int var10 = field812 - arg3;
		int var11 = field812 * arg1 + arg4;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field811[var11] >> 16 & 0xFF) * var6;
				int var15 = (field811[var11] >> 8 & 0xFF) * var6;
				int var16 = (field811[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field811[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("IIPNJDNO.a(BIIIII)V")
	public static void method322(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 < field816) {
			arg3 -= field816 - arg1;
			arg1 = field816;
		}

		if (arg0 < field814) {
			arg4 -= field814 - arg0;
			arg0 = field814;
		}

		if (arg1 + arg3 > field817) {
			arg3 = field817 - arg1;
		}

		if (arg0 + arg4 > field815) {
			arg4 = field815 - arg0;
		}

		int var5 = field812 - arg3;
		int var6 = field812 * arg0 + arg1;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field811[var6++] = arg2;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("IIPNJDNO.a(IIIIBI)V")
	public static void method323(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method325(arg1, arg0, arg3, arg2);
		method325(arg1, arg0, arg3, arg2 + arg4 - 1);
		method327(arg1, arg4, arg3, arg2);
		method327(arg1, arg4, arg0 + arg3 - 1, arg2);
	}

	@ObfuscatedName("IIPNJDNO.b(IIIIIII)V")
	public static void method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method326(arg5, arg0, arg1, arg4, arg2);
		method326(arg5, arg0, arg1, arg3 + arg4 - 1, arg2);

		if (arg3 >= 3) {
			method328(arg4 + 1, arg0, arg5, arg3 - 2, arg2);
			method328(arg4 + 1, arg0, arg1 + arg5 - 1, arg3 - 2, arg2);
		}
	}

	@ObfuscatedName("IIPNJDNO.a(BIIII)V")
	public static void method325(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field814 && arg3 < field815) {
			if (arg2 < field816) {
				arg1 -= field816 - arg2;
				arg2 = field816;
			}

			if (arg1 + arg2 > field817) {
				arg1 = field817 - arg2;
			}

			int var4 = field812 * arg3 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field811[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("IIPNJDNO.a(IZIIII)V")
	public static void method326(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field814 && arg3 < field815) {
			if (arg0 < field816) {
				arg2 -= field816 - arg0;
				arg0 = field816;
			}

			if (arg0 + arg2 > field817) {
				arg2 = field817 - arg0;
			}

			int var5 = 256 - arg1;
			int var6 = (arg4 >> 16 & 0xFF) * arg1;
			int var7 = (arg4 >> 8 & 0xFF) * arg1;
			int var8 = (arg4 & 0xFF) * arg1;
			int var9 = field812 * arg3 + arg0;
			for (int var10 = 0; var10 < arg2; var10++) {
				int var11 = (field811[var9] >> 16 & 0xFF) * var5;
				int var12 = (field811[var9] >> 8 & 0xFF) * var5;
				int var13 = (field811[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field811[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("IIPNJDNO.b(IIIII)V")
	public static void method327(int arg0, int arg1, int arg2, int arg3) {
		if (arg2 >= field816 && arg2 < field817) {
			if (arg3 < field814) {
				arg1 -= field814 - arg3;
				arg3 = field814;
			}

			if (arg1 + arg3 > field815) {
				arg1 = field815 - arg3;
			}

			int var4 = field812 * arg3 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field811[field812 * var5 + var4] = arg0;
			}
		}
	}

	@ObfuscatedName("IIPNJDNO.b(IIIIBI)V")
	public static void method328(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 >= field816 && arg2 < field817) {
			if (arg0 < field814) {
				arg3 -= field814 - arg0;
				arg0 = field814;
			}

			if (arg0 + arg3 > field815) {
				arg3 = field815 - arg0;
			}

			int var5 = 256 - arg1;
			int var6 = (arg4 >> 16 & 0xFF) * arg1;
			int var7 = (arg4 >> 8 & 0xFF) * arg1;
			int var8 = (arg4 & 0xFF) * arg1;
			int var9 = field812 * arg0 + arg2;
			for (int var10 = 0; var10 < arg3; var10++) {
				int var11 = (field811[var9] >> 16 & 0xFF) * var5;
				int var12 = (field811[var9] >> 8 & 0xFF) * var5;
				int var13 = (field811[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field811[var9] = var14;
				var9 += field812;
			}
		}
	}
}
