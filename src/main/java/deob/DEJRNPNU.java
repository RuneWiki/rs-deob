package deob;

@ObfuscatedName("DEJRNPNU")
public final class DEJRNPNU {

	@ObfuscatedName("DEJRNPNU.k")
	public boolean field594 = true;

	@ObfuscatedName("DEJRNPNU.l")
	public int field595;

	@ObfuscatedName("DEJRNPNU.m")
	public int field596;

	@ObfuscatedName("DEJRNPNU.n")
	public int field597;

	@ObfuscatedName("DEJRNPNU.o")
	public int field598;

	@ObfuscatedName("DEJRNPNU.a")
	public int[] field584;

	@ObfuscatedName("DEJRNPNU.b")
	public int[] field585;

	@ObfuscatedName("DEJRNPNU.c")
	public int[] field586;

	@ObfuscatedName("DEJRNPNU.g")
	public int[] field590;

	@ObfuscatedName("DEJRNPNU.h")
	public int[] field591;

	@ObfuscatedName("DEJRNPNU.i")
	public int[] field592;

	@ObfuscatedName("DEJRNPNU.d")
	public int[] field587;

	@ObfuscatedName("DEJRNPNU.e")
	public int[] field588;

	@ObfuscatedName("DEJRNPNU.f")
	public int[] field589;

	@ObfuscatedName("DEJRNPNU.j")
	public int[] field593;

	@ObfuscatedName("DEJRNPNU.p")
	public static int[] field599 = new int[6];

	@ObfuscatedName("DEJRNPNU.q")
	public static int[] field600 = new int[6];

	@ObfuscatedName("DEJRNPNU.r")
	public static int[] field601 = new int[6];

	@ObfuscatedName("DEJRNPNU.s")
	public static int[] field602 = new int[6];

	@ObfuscatedName("DEJRNPNU.t")
	public static int[] field603 = new int[6];

	@ObfuscatedName("DEJRNPNU.u")
	public static int[] field604 = new int[] { 1, 0 };

	@ObfuscatedName("DEJRNPNU.v")
	public static int[] field605 = new int[] { 2, 1 };

	@ObfuscatedName("DEJRNPNU.w")
	public static int[] field606 = new int[] { 3, 3 };

	@ObfuscatedName("DEJRNPNU.x")
	public static final int[][] field607 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("DEJRNPNU.y")
	public static final int[][] field608 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public DEJRNPNU(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg4 != arg10 || arg4 != arg11 || arg4 != arg18) {
			field594 = false;
		}

		field595 = arg7;
		field596 = arg15;
		field597 = arg0;
		field598 = arg3;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field607[arg7];
		int var25 = var24.length;
		field584 = new int[var25];
		field585 = new int[var25];
		field586 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg14 * var20;
		int var29 = arg9 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg15 - arg15 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg15 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg15 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg4;
				var35 = arg1;
				var36 = arg8;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg4 + arg10 >> 1;
				var35 = arg1 + arg17 >> 1;
				var36 = arg2 + arg8 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg10;
				var35 = arg17;
				var36 = arg2;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg10 + arg11 >> 1;
				var35 = arg6 + arg17 >> 1;
				var36 = arg2 + arg16 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg11;
				var35 = arg6;
				var36 = arg16;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg11 + arg18 >> 1;
				var35 = arg5 + arg6 >> 1;
				var36 = arg12 + arg16 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg18;
				var35 = arg5;
				var36 = arg12;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg4 + arg18 >> 1;
				var35 = arg1 + arg5 >> 1;
				var36 = arg8 + arg12 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg4 + arg10 >> 1;
				var35 = arg1 + arg17 >> 1;
				var36 = arg2 + arg8 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg10 + arg11 >> 1;
				var35 = arg6 + arg17 >> 1;
				var36 = arg2 + arg16 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg11 + arg18 >> 1;
				var35 = arg5 + arg6 >> 1;
				var36 = arg12 + arg16 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg4 + arg18 >> 1;
				var35 = arg1 + arg5 >> 1;
				var36 = arg8 + arg12 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg4;
				var35 = arg1;
				var36 = arg8;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg10;
				var35 = arg17;
				var36 = arg2;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg11;
				var35 = arg6;
				var36 = arg16;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg18;
				var35 = arg5;
				var36 = arg12;
			}

			field584[var30] = var32;
			field585[var30] = var34;
			field586[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field608[arg7];
		int var38 = var37.length / 4;
		field590 = new int[var38];
		field591 = new int[var38];
		field592 = new int[var38];
		field587 = new int[var38];
		field588 = new int[var38];
		field589 = new int[var38];

		if (arg13 != -1) {
			field593 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg15 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg15 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg15 & 0x3;
			}

			field590[var40] = var42;
			field591[var40] = var43;
			field592[var40] = var44;

			if (var41 == 0) {
				field587[var40] = var26[var42];
				field588[var40] = var26[var43];
				field589[var40] = var26[var44];

				if (field593 != null) {
					field593[var40] = -1;
				}
			} else {
				field587[var40] = var27[var42];
				field588[var40] = var27[var43];
				field589[var40] = var27[var44];

				if (field593 != null) {
					field593[var40] = arg13;
				}
			}
		}

		int var45 = arg4;
		int var46 = arg10;

		if (arg10 < arg4) {
			var45 = arg10;
		}

		if (arg10 > arg10) {
			var46 = arg10;
		}

		if (arg11 < var45) {
			var45 = arg11;
		}

		if (arg11 > var46) {
			var46 = arg11;
		}

		if (arg18 < var45) {
			var45 = arg18;
		}

		if (arg18 > var46) {
			var46 = arg18;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
