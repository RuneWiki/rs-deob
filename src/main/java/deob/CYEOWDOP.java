package deob;

@ObfuscatedName("CYEOWDOP")
public class CYEOWDOP extends NZLAJIAU {

	@ObfuscatedName("CYEOWDOP.q")
	public static int field639;

	@ObfuscatedName("CYEOWDOP.r")
	public static int field640;

	@ObfuscatedName("CYEOWDOP.s")
	public static int field641;

	@ObfuscatedName("CYEOWDOP.t")
	public static int field642;

	@ObfuscatedName("CYEOWDOP.u")
	public static int field643;

	@ObfuscatedName("CYEOWDOP.v")
	public static int field644;

	@ObfuscatedName("CYEOWDOP.w")
	public static int field645;

	@ObfuscatedName("CYEOWDOP.x")
	public static int field646;

	@ObfuscatedName("CYEOWDOP.y")
	public static int field647;

	@ObfuscatedName("CYEOWDOP.p")
	public static int[] field638;

	@ObfuscatedName("CYEOWDOP.a(II[IB)V")
	public static void method224(int arg0, int arg1, int[] arg2) {
		field638 = arg2;
		field639 = arg1;
		field640 = arg0;
		method226(arg1, 0, arg0, 0);
	}

	@ObfuscatedName("CYEOWDOP.a(I)V")
	public static void method225() {
		field643 = 0;
		field641 = 0;
		field644 = field639;
		field642 = field640;
		field645 = field644 - 1;
		field646 = field644 / 2;
	}

	@ObfuscatedName("CYEOWDOP.a(IZIII)V")
	public static void method226(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 < 0) {
			arg3 = 0;
		}

		if (arg1 < 0) {
			arg1 = 0;
		}

		if (arg0 > field639) {
			arg0 = field639;
		}

		if (arg2 > field640) {
			arg2 = field640;
		}

		field643 = arg3;
		field641 = arg1;
		field644 = arg0;
		field642 = arg2;
		field645 = field644 - 1;
		field646 = field644 / 2;
		field647 = field642 / 2;
	}

	@ObfuscatedName("CYEOWDOP.a(B)V")
	public static void method227() {
		int var0 = field640 * field639;
		for (int var1 = 0; var1 < var0; var1++) {
			field638[var1] = 0;
		}
	}

	@ObfuscatedName("CYEOWDOP.a(BIIIIII)V")
	public static void method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg4 < field643) {
			arg1 -= field643 - arg4;
			arg4 = field643;
		}

		if (arg5 < field641) {
			arg0 -= field641 - arg5;
			arg5 = field641;
		}

		if (arg1 + arg4 > field644) {
			arg1 = field644 - arg4;
		}

		if (arg0 + arg5 > field642) {
			arg0 = field642 - arg5;
		}

		int var6 = 256 - arg2;
		int var7 = (arg3 >> 16 & 0xFF) * arg2;
		int var8 = (arg3 >> 8 & 0xFF) * arg2;
		int var9 = (arg3 & 0xFF) * arg2;
		int var10 = field639 - arg1;
		int var11 = field639 * arg5 + arg4;
		for (int var12 = 0; var12 < arg0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = (field638[var11] >> 16 & 0xFF) * var6;
				int var15 = (field638[var11] >> 8 & 0xFF) * var6;
				int var16 = (field638[var11] & 0xFF) * var6;
				int var17 = (var9 + var16 >> 8) + (var7 + var14 >> 8 << 16) + (var8 + var15 >> 8 << 8);
				field638[var11++] = var17;
			}

			var11 += var10;
		}
	}

	@ObfuscatedName("CYEOWDOP.a(IIIIII)V")
	public static void method229(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg2 < field643) {
			arg1 -= field643 - arg2;
			arg2 = field643;
		}

		if (arg3 < field641) {
			arg4 -= field641 - arg3;
			arg3 = field641;
		}

		if (arg1 + arg2 > field644) {
			arg1 = field644 - arg2;
		}

		if (arg3 + arg4 > field642) {
			arg4 = field642 - arg3;
		}

		int var5 = field639 - arg1;
		int var6 = field639 * arg3 + arg2;
		for (int var7 = -arg4; var7 < 0; var7++) {
			for (int var8 = -arg1; var8 < 0; var8++) {
				field638[var6++] = arg0;
			}

			var6 += var5;
		}
	}

	@ObfuscatedName("CYEOWDOP.a(IIIIBI)V")
	public static void method230(int arg0, int arg1, int arg2, int arg3, int arg4) {
		method232(arg2, arg1, arg0, arg4);
		method232(arg2, arg1, arg0, arg3 + arg4 - 1);
		method234(arg4, arg0, arg3, arg2);
		method234(arg4, arg0 + arg1 - 1, arg3, arg2);
	}

	@ObfuscatedName("CYEOWDOP.a(IIIBIII)V")
	public static void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		method233(arg0, arg3, arg2, arg1, arg4);
		method233(arg0, arg3, arg2, arg1 + arg5 - 1, arg4);

		if (arg5 >= 3) {
			method235(arg5 - 2, arg2, arg1 + 1, arg0, arg4);
			method235(arg5 - 2, arg2 + arg3 - 1, arg1 + 1, arg0, arg4);
		}
	}

	@ObfuscatedName("CYEOWDOP.a(IIIIB)V")
	public static void method232(int arg0, int arg1, int arg2, int arg3) {
		if (arg3 >= field641 && arg3 < field642) {
			if (arg2 < field643) {
				arg1 -= field643 - arg2;
				arg2 = field643;
			}

			if (arg1 + arg2 > field644) {
				arg1 = field644 - arg2;
			}

			int var4 = field639 * arg3 + arg2;
			for (int var5 = 0; var5 < arg1; var5++) {
				field638[var4 + var5] = arg0;
			}
		}
	}

	@ObfuscatedName("CYEOWDOP.b(IIIIII)V")
	public static void method233(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg3 >= field641 && arg3 < field642) {
			if (arg2 < field643) {
				arg1 -= field643 - arg2;
				arg2 = field643;
			}

			if (arg1 + arg2 > field644) {
				arg1 = field644 - arg2;
			}

			int var5 = 256 - arg0;
			int var6 = (arg4 >> 16 & 0xFF) * arg0;
			int var7 = (arg4 >> 8 & 0xFF) * arg0;
			int var8 = (arg4 & 0xFF) * arg0;
			int var9 = field639 * arg3 + arg2;
			for (int var10 = 0; var10 < arg1; var10++) {
				int var11 = (field638[var9] >> 16 & 0xFF) * var5;
				int var12 = (field638[var9] >> 8 & 0xFF) * var5;
				int var13 = (field638[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field638[var9++] = var14;
			}
		}
	}

	@ObfuscatedName("CYEOWDOP.b(IIIIB)V")
	public static void method234(int arg0, int arg1, int arg2, int arg3) {
		if (arg1 >= field643 && arg1 < field644) {
			if (arg0 < field641) {
				arg2 -= field641 - arg0;
				arg0 = field641;
			}

			if (arg0 + arg2 > field642) {
				arg2 = field642 - arg0;
			}

			int var4 = field639 * arg0 + arg1;
			for (int var5 = 0; var5 < arg2; var5++) {
				field638[field639 * var5 + var4] = arg3;
			}
		}
	}

	@ObfuscatedName("CYEOWDOP.c(IIIIII)V")
	public static void method235(int arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg1 >= field643 && arg1 < field644) {
			if (arg2 < field641) {
				arg0 -= field641 - arg2;
				arg2 = field641;
			}

			if (arg0 + arg2 > field642) {
				arg0 = field642 - arg2;
			}

			int var5 = 256 - arg3;
			int var6 = (arg4 >> 16 & 0xFF) * arg3;
			int var7 = (arg4 >> 8 & 0xFF) * arg3;
			int var8 = (arg4 & 0xFF) * arg3;
			int var9 = field639 * arg2 + arg1;
			for (int var10 = 0; var10 < arg0; var10++) {
				int var11 = (field638[var9] >> 16 & 0xFF) * var5;
				int var12 = (field638[var9] >> 8 & 0xFF) * var5;
				int var13 = (field638[var9] & 0xFF) * var5;
				int var14 = (var8 + var13 >> 8) + (var6 + var11 >> 8 << 16) + (var7 + var12 >> 8 << 8);
				field638[var9] = var14;
				var9 += field639;
			}
		}
	}
}
