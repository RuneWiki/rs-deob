package deob;

@ObfuscatedName("IGZZCJOU")
public class IGZZCJOU extends IZSDUVJF {

	@ObfuscatedName("IGZZCJOU.n")
	public static int field796;

	@ObfuscatedName("IGZZCJOU.o")
	public static int field797;

	@ObfuscatedName("IGZZCJOU.p")
	public static int field798;

	@ObfuscatedName("IGZZCJOU.q")
	public static int field799;

	@ObfuscatedName("IGZZCJOU.r")
	public static int field800;

	@ObfuscatedName("IGZZCJOU.s")
	public static int field801;

	@ObfuscatedName("IGZZCJOU.t")
	public static int field802;

	@ObfuscatedName("IGZZCJOU.u")
	public static int field803;

	@ObfuscatedName("IGZZCJOU.v")
	public static int field804;

	@ObfuscatedName("IGZZCJOU.m")
	public static int[] field795;

	@ObfuscatedName("IGZZCJOU.a([IBII)V")
	public static void method240(int[] arg0, int arg1, int arg2) {
		field795 = arg0;
		field796 = arg1;
		field797 = arg2;
		method242(0, arg2, 0, arg1);
	}

	@ObfuscatedName("IGZZCJOU.a(I)V")
	public static void method241() {
		field800 = 0;
		field798 = 0;
		field801 = field796;
		field799 = field797;
		field802 = field801 - 1;
		field803 = field801 / 2;
	}

	@ObfuscatedName("IGZZCJOU.a(BIIII)V")
	public static void method242(int arg0, int arg1, int arg2, int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}

		if (arg2 < 0) {
			arg2 = 0;
		}

		if (arg3 > field796) {
			arg3 = field796;
		}

		if (arg1 > field797) {
			arg1 = field797;
		}

		field800 = arg0;
		field798 = arg2;
		field801 = arg3;
		field799 = arg1;
		field802 = field801 - 1;
		field803 = field801 / 2;
		field804 = field799 / 2;
	}

	@ObfuscatedName("IGZZCJOU.a(B)V")
	public static void method243() {
		int var0 = field797 * field796;
		for (int var1 = 0; var1 < var0; var1++) {
			field795[var1] = 0;
		}
	}

	@ObfuscatedName("IGZZCJOU.a(IIIIIII)V")
	public static void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 < field800) {
			arg3 -= field800 - arg1;
			arg1 = field800;
		}

		if (arg5 < field798) {
			arg4 -= field798 - arg5;
			arg5 = field798;
		}

		if (arg1 + arg3 > field801) {
			arg3 = field801 - arg1;
		}

		if (arg4 + arg5 > field799) {
			arg4 = field799 - arg5;
		}

		int var6 = 256 - arg2;
		int var7 = (arg0 >> 16 & 0xFF) * arg2;
		int var8 = (arg0 >> 8 & 0xFF) * arg2;
		int var9 = (arg0 & 0xFF) * arg2;
		int var10 = field796 - arg3;
		int var11 = field796 * arg5 + arg1;
		for (int var12 = 0; var12 < arg4; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = (field795[var11] >> 16 & 0xFF) * var6;
				int var15 = (field795[var11] >> 8 & 0xFF) * var6;
				int var16 = (field795[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field795[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("IGZZCJOU.a(IIIZII)V")
	public static void method245(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < field800) {
			arg3 -= field800 - arg2;
			arg2 = field800;
		}

		if (arg0 < field798) {
			arg4 -= field798 - arg0;
			arg0 = field798;
		}

		if (arg2 + arg3 > field801) {
			arg3 = field801 - arg2;
		}

		if (arg0 + arg4 > field799) {
			arg4 = field799 - arg0;
		}

		int var5 = field796 - arg3;
		int var6 = field796 * arg0 + arg2;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg3; var8 < 0; var8++) {
				field795[var6++] = arg1;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("IGZZCJOU.a(ZIIIII)V")
	public static void method246(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method248(arg0, arg1, arg2, arg3);
		method248(arg0, arg1 + arg4 - 1, arg2, arg3);
		method250(arg4, arg1, arg0, arg3);
		method250(arg4, arg1, arg0, arg2 + arg3 - 1);
	}

	@ObfuscatedName("IGZZCJOU.a(IIZIIII)V")
	public static void method247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method249(arg4, arg2, arg0, arg3, arg1);
		method249(arg4, arg2, arg0, arg3, arg1 + arg5 - 1);

		if (arg5 >= 3) {
			method251(arg5 - 2, arg2, arg1 + 1, arg3, arg0);
			method251(arg5 - 2, arg2, arg1 + 1, arg3 + arg4 - 1, arg0);
		}
	}

	@ObfuscatedName("IGZZCJOU.a(IIIIZ)V")
	public static void method248(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field798 && arg1 < field799) {
			if (arg3 < field800) {
				arg2 -= field800 - arg3;
				arg3 = field800;
			}

			if (arg2 + arg3 > field801) {
				arg2 = field801 - arg3;
			}

			int var4 = field796 * arg1 + arg3;
			for (int var5 = 0; var5 < arg2; var5++) {
				field795[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("IGZZCJOU.a(IIIIIZ)V")
	public static void method249(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg4 >= field798 && arg4 < field799) {
			if (arg3 < field800) {
				arg0 -= field800 - arg3;
				arg3 = field800;
			}

			if (arg0 + arg3 > field801) {
				arg0 = field801 - arg3;
			}

			int var5 = 256 - arg2;
			int var6 = (arg1 >> 16 & 0xFF) * arg2;
			int var7 = (arg1 >> 8 & 0xFF) * arg2;
			int var8 = (arg1 & 0xFF) * arg2;
			int var9 = field796 * arg4 + arg3;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field795[var9] >> 16 & 0xFF) * var5;
				int var12 = (field795[var9] >> 8 & 0xFF) * var5;
				int var13 = (field795[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field795[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("IGZZCJOU.a(IIIII)V")
	public static void method250(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field800 && arg3 < field801) {
			if (arg1 < field798) {
				arg0 -= field798 - arg1;
				arg1 = field798;
			}

			if (arg0 + arg1 > field799) {
				arg0 = field799 - arg1;
			}

			int var4 = field796 * arg1 + arg3;
			for (int var5 = 0; var5 < arg0; var5++) {
				field795[field796 * var5 + var4] = arg2;
			}
		}
	}

	@ObfuscatedName("IGZZCJOU.a(IIIIIB)V")
	public static void method251(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field800 && arg3 < field801) {
			if (arg2 < field798) {
				arg0 -= field798 - arg2;
				arg2 = field798;
			}

			if (arg0 + arg2 > field799) {
				arg0 = field799 - arg2;
			}

			int var5 = 256 - arg4;
			int var6 = (arg1 >> 16 & 0xFF) * arg4;
			int var7 = (arg1 >> 8 & 0xFF) * arg4;
			int var8 = (arg1 & 0xFF) * arg4;
			int var9 = field796 * arg2 + arg3;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field795[var9] >> 16 & 0xFF) * var5;
				int var12 = (field795[var9] >> 8 & 0xFF) * var5;
				int var13 = (field795[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field795[var9] = var14;
				var9 += field796;
			}
		}
	}
}
