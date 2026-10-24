package deob;

@ObfuscatedName("DLTZHIVW")
public final class DLTZHIVW {

	@ObfuscatedName("DLTZHIVW.k")
	public boolean field501 = true;

	@ObfuscatedName("DLTZHIVW.l")
	public int field502;

	@ObfuscatedName("DLTZHIVW.m")
	public int field503;

	@ObfuscatedName("DLTZHIVW.n")
	public int field504;

	@ObfuscatedName("DLTZHIVW.o")
	public int field505;

	@ObfuscatedName("DLTZHIVW.a")
	public int[] field491;

	@ObfuscatedName("DLTZHIVW.b")
	public int[] field492;

	@ObfuscatedName("DLTZHIVW.c")
	public int[] field493;

	@ObfuscatedName("DLTZHIVW.g")
	public int[] field497;

	@ObfuscatedName("DLTZHIVW.h")
	public int[] field498;

	@ObfuscatedName("DLTZHIVW.i")
	public int[] field499;

	@ObfuscatedName("DLTZHIVW.d")
	public int[] field494;

	@ObfuscatedName("DLTZHIVW.e")
	public int[] field495;

	@ObfuscatedName("DLTZHIVW.f")
	public int[] field496;

	@ObfuscatedName("DLTZHIVW.j")
	public int[] field500;

	@ObfuscatedName("DLTZHIVW.p")
	public static int[] field506 = new int[6];

	@ObfuscatedName("DLTZHIVW.q")
	public static int[] field507 = new int[6];

	@ObfuscatedName("DLTZHIVW.r")
	public static int[] field508 = new int[6];

	@ObfuscatedName("DLTZHIVW.s")
	public static int[] field509 = new int[6];

	@ObfuscatedName("DLTZHIVW.t")
	public static int[] field510 = new int[6];

	@ObfuscatedName("DLTZHIVW.u")
	public static int[] field511 = new int[] { 1, 0 };

	@ObfuscatedName("DLTZHIVW.v")
	public static int[] field512 = new int[] { 2, 1 };

	@ObfuscatedName("DLTZHIVW.w")
	public static int[] field513 = new int[] { 3, 3 };

	@ObfuscatedName("DLTZHIVW.x")
	public static final int[][] field514 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("DLTZHIVW.y")
	public static final int[][] field515 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public DLTZHIVW(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg11 != arg18 || arg4 != arg18 || arg1 != arg18) {
			field501 = false;
		}

		field502 = arg7;
		field503 = arg3;
		field504 = arg15;
		field505 = arg0;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field514[arg7];
		int var25 = var24.length;
		field491 = new int[var25];
		field492 = new int[var25];
		field493 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg8 * var20;
		int var29 = arg16 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg3 - arg3 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg3 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg3 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg18;
				var35 = arg9;
				var36 = arg12;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg11 + arg18 >> 1;
				var35 = arg9 + arg13 >> 1;
				var36 = arg12 + arg17 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg11;
				var35 = arg13;
				var36 = arg17;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg4 + arg11 >> 1;
				var35 = arg5 + arg13 >> 1;
				var36 = arg6 + arg17 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg4;
				var35 = arg5;
				var36 = arg6;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg1 + arg4 >> 1;
				var35 = arg5 + arg14 >> 1;
				var36 = arg2 + arg6 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg1;
				var35 = arg14;
				var36 = arg2;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg1 + arg18 >> 1;
				var35 = arg9 + arg14 >> 1;
				var36 = arg2 + arg12 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg11 + arg18 >> 1;
				var35 = arg9 + arg13 >> 1;
				var36 = arg12 + arg17 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg4 + arg11 >> 1;
				var35 = arg5 + arg13 >> 1;
				var36 = arg6 + arg17 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg1 + arg4 >> 1;
				var35 = arg5 + arg14 >> 1;
				var36 = arg2 + arg6 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg18 >> 1;
				var35 = arg9 + arg14 >> 1;
				var36 = arg2 + arg12 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg18;
				var35 = arg9;
				var36 = arg12;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg11;
				var35 = arg13;
				var36 = arg17;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg4;
				var35 = arg5;
				var36 = arg6;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg1;
				var35 = arg14;
				var36 = arg2;
			}

			field491[var30] = var32;
			field492[var30] = var34;
			field493[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field515[arg7];
		int var38 = var37.length / 4;
		field497 = new int[var38];
		field498 = new int[var38];
		field499 = new int[var38];
		field494 = new int[var38];
		field495 = new int[var38];
		field496 = new int[var38];

		if (arg10 != -1) {
			field500 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg3 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg3 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg3 & 0x3;
			}

			field497[var40] = var42;
			field498[var40] = var43;
			field499[var40] = var44;

			if (var41 == 0) {
				field494[var40] = var26[var42];
				field495[var40] = var26[var43];
				field496[var40] = var26[var44];

				if (field500 != null) {
					field500[var40] = -1;
				}
			} else {
				field494[var40] = var27[var42];
				field495[var40] = var27[var43];
				field496[var40] = var27[var44];

				if (field500 != null) {
					field500[var40] = arg10;
				}
			}
		}

		int var45 = arg18;
		int var46 = arg11;

		if (arg11 < arg18) {
			var45 = arg11;
		}

		if (arg11 > arg11) {
			var46 = arg11;
		}

		if (arg4 < var45) {
			var45 = arg4;
		}

		if (arg4 > var46) {
			var46 = arg4;
		}

		if (arg1 < var45) {
			var45 = arg1;
		}

		if (arg1 > var46) {
			var46 = arg1;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
