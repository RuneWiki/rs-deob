package deob;

@ObfuscatedName("HTETLVWM")
public final class HTETLVWM {

	@ObfuscatedName("HTETLVWM.l")
	public boolean field730 = true;

	@ObfuscatedName("HTETLVWM.m")
	public int field731;

	@ObfuscatedName("HTETLVWM.n")
	public int field732;

	@ObfuscatedName("HTETLVWM.o")
	public int field733;

	@ObfuscatedName("HTETLVWM.p")
	public int field734;

	@ObfuscatedName("HTETLVWM.b")
	public int[] field720;

	@ObfuscatedName("HTETLVWM.c")
	public int[] field721;

	@ObfuscatedName("HTETLVWM.d")
	public int[] field722;

	@ObfuscatedName("HTETLVWM.h")
	public int[] field726;

	@ObfuscatedName("HTETLVWM.i")
	public int[] field727;

	@ObfuscatedName("HTETLVWM.j")
	public int[] field728;

	@ObfuscatedName("HTETLVWM.e")
	public int[] field723;

	@ObfuscatedName("HTETLVWM.f")
	public int[] field724;

	@ObfuscatedName("HTETLVWM.g")
	public int[] field725;

	@ObfuscatedName("HTETLVWM.k")
	public int[] field729;

	@ObfuscatedName("HTETLVWM.q")
	public static int[] field735 = new int[6];

	@ObfuscatedName("HTETLVWM.r")
	public static int[] field736 = new int[6];

	@ObfuscatedName("HTETLVWM.s")
	public static int[] field737 = new int[6];

	@ObfuscatedName("HTETLVWM.t")
	public static int[] field738 = new int[6];

	@ObfuscatedName("HTETLVWM.u")
	public static int[] field739 = new int[6];

	@ObfuscatedName("HTETLVWM.v")
	public static int[] field740 = new int[] { 1, 0 };

	@ObfuscatedName("HTETLVWM.w")
	public static int[] field741 = new int[] { 2, 1 };

	@ObfuscatedName("HTETLVWM.x")
	public static int[] field742 = new int[] { 3, 3 };

	@ObfuscatedName("HTETLVWM.y")
	public static final int[][] field743 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("HTETLVWM.z")
	public static final int[][] field744 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public HTETLVWM(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg6 != arg13 || arg13 != arg17 || arg10 != arg13) {
			field730 = false;
		}

		field731 = arg18;
		field732 = arg0;
		field733 = arg15;
		field734 = arg5;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field743[arg18];
		int var25 = var24.length;
		field720 = new int[var25];
		field721 = new int[var25];
		field722 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg3 * var20;
		int var29 = arg9 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg0 - arg0 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg0 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg0 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg13;
				var35 = arg11;
				var36 = arg14;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg6 + arg13 >> 1;
				var35 = arg8 + arg11 >> 1;
				var36 = arg4 + arg14 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg6;
				var35 = arg8;
				var36 = arg4;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg6 + arg17 >> 1;
				var35 = arg7 + arg8 >> 1;
				var36 = arg4 + arg16 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg17;
				var35 = arg7;
				var36 = arg16;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg10 + arg17 >> 1;
				var35 = arg1 + arg7 >> 1;
				var36 = arg2 + arg16 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg10;
				var35 = arg1;
				var36 = arg2;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg10 + arg13 >> 1;
				var35 = arg1 + arg11 >> 1;
				var36 = arg2 + arg14 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg6 + arg13 >> 1;
				var35 = arg8 + arg11 >> 1;
				var36 = arg4 + arg14 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg6 + arg17 >> 1;
				var35 = arg7 + arg8 >> 1;
				var36 = arg4 + arg16 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg10 + arg17 >> 1;
				var35 = arg1 + arg7 >> 1;
				var36 = arg2 + arg16 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg10 + arg13 >> 1;
				var35 = arg1 + arg11 >> 1;
				var36 = arg2 + arg14 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg13;
				var35 = arg11;
				var36 = arg14;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg6;
				var35 = arg8;
				var36 = arg4;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg17;
				var35 = arg7;
				var36 = arg16;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg10;
				var35 = arg1;
				var36 = arg2;
			}

			field720[var30] = var32;
			field721[var30] = var34;
			field722[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field744[arg18];
		int var38 = var37.length / 4;
		field726 = new int[var38];
		field727 = new int[var38];
		field728 = new int[var38];
		field723 = new int[var38];
		field724 = new int[var38];
		field725 = new int[var38];

		if (arg12 != -1) {
			field729 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg0 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg0 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg0 & 0x3;
			}

			field726[var40] = var42;
			field727[var40] = var43;
			field728[var40] = var44;

			if (var41 == 0) {
				field723[var40] = var26[var42];
				field724[var40] = var26[var43];
				field725[var40] = var26[var44];

				if (field729 != null) {
					field729[var40] = -1;
				}
			} else {
				field723[var40] = var27[var42];
				field724[var40] = var27[var43];
				field725[var40] = var27[var44];

				if (field729 != null) {
					field729[var40] = arg12;
				}
			}
		}

		int var45 = arg13;
		int var46 = arg6;

		if (arg6 < arg13) {
			var45 = arg6;
		}

		if (arg6 > arg6) {
			var46 = arg6;
		}

		if (arg17 < var45) {
			var45 = arg17;
		}

		if (arg17 > var46) {
			var46 = arg17;
		}

		if (arg10 < var45) {
			var45 = arg10;
		}

		if (arg10 > var46) {
			var46 = arg10;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
