package deob;

@ObfuscatedName("FZSTUTEM")
public final class FZSTUTEM {

	@ObfuscatedName("FZSTUTEM.l")
	public boolean field642 = true;

	@ObfuscatedName("FZSTUTEM.m")
	public int field643;

	@ObfuscatedName("FZSTUTEM.n")
	public int field644;

	@ObfuscatedName("FZSTUTEM.o")
	public int field645;

	@ObfuscatedName("FZSTUTEM.p")
	public int field646;

	@ObfuscatedName("FZSTUTEM.b")
	public int[] field632;

	@ObfuscatedName("FZSTUTEM.c")
	public int[] field633;

	@ObfuscatedName("FZSTUTEM.d")
	public int[] field634;

	@ObfuscatedName("FZSTUTEM.h")
	public int[] field638;

	@ObfuscatedName("FZSTUTEM.i")
	public int[] field639;

	@ObfuscatedName("FZSTUTEM.j")
	public int[] field640;

	@ObfuscatedName("FZSTUTEM.e")
	public int[] field635;

	@ObfuscatedName("FZSTUTEM.f")
	public int[] field636;

	@ObfuscatedName("FZSTUTEM.g")
	public int[] field637;

	@ObfuscatedName("FZSTUTEM.k")
	public int[] field641;

	@ObfuscatedName("FZSTUTEM.q")
	public static int[] field647 = new int[6];

	@ObfuscatedName("FZSTUTEM.r")
	public static int[] field648 = new int[6];

	@ObfuscatedName("FZSTUTEM.s")
	public static int[] field649 = new int[6];

	@ObfuscatedName("FZSTUTEM.t")
	public static int[] field650 = new int[6];

	@ObfuscatedName("FZSTUTEM.u")
	public static int[] field651 = new int[6];

	@ObfuscatedName("FZSTUTEM.v")
	public static int[] field652 = new int[] { 1, 0 };

	@ObfuscatedName("FZSTUTEM.w")
	public static int[] field653 = new int[] { 2, 1 };

	@ObfuscatedName("FZSTUTEM.x")
	public static int[] field654 = new int[] { 3, 3 };

	@ObfuscatedName("FZSTUTEM.y")
	public static final int[][] field655 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("FZSTUTEM.z")
	public static final int[][] field656 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public FZSTUTEM(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg1 != arg7 || arg7 != arg11 || arg0 != arg7) {
			field642 = false;
		}

		field643 = arg6;
		field644 = arg2;
		field645 = arg17;
		field646 = arg12;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field655[arg6];
		int var25 = var24.length;
		field632 = new int[var25];
		field633 = new int[var25];
		field634 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg3 * var20;
		int var29 = arg14 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg2 - arg2 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg2 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg2 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg7;
				var35 = arg13;
				var36 = arg18;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg1 + arg7 >> 1;
				var35 = arg8 + arg13 >> 1;
				var36 = arg10 + arg18 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg1;
				var35 = arg8;
				var36 = arg10;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg11 >> 1;
				var35 = arg8 + arg16 >> 1;
				var36 = arg9 + arg10 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg11;
				var35 = arg16;
				var36 = arg9;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg0 + arg11 >> 1;
				var35 = arg5 + arg16 >> 1;
				var36 = arg9 + arg15 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg0;
				var35 = arg5;
				var36 = arg15;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg0 + arg7 >> 1;
				var35 = arg5 + arg13 >> 1;
				var36 = arg15 + arg18 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg1 + arg7 >> 1;
				var35 = arg8 + arg13 >> 1;
				var36 = arg10 + arg18 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg11 >> 1;
				var35 = arg8 + arg16 >> 1;
				var36 = arg9 + arg10 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg0 + arg11 >> 1;
				var35 = arg5 + arg16 >> 1;
				var36 = arg9 + arg15 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg7 >> 1;
				var35 = arg5 + arg13 >> 1;
				var36 = arg15 + arg18 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg7;
				var35 = arg13;
				var36 = arg18;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg1;
				var35 = arg8;
				var36 = arg10;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg11;
				var35 = arg16;
				var36 = arg9;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg0;
				var35 = arg5;
				var36 = arg15;
			}

			field632[var30] = var32;
			field633[var30] = var34;
			field634[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field656[arg6];
		int var38 = var37.length / 4;
		field638 = new int[var38];
		field639 = new int[var38];
		field640 = new int[var38];
		field635 = new int[var38];
		field636 = new int[var38];
		field637 = new int[var38];

		if (arg4 != -1) {
			field641 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg2 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg2 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg2 & 0x3;
			}

			field638[var40] = var42;
			field639[var40] = var43;
			field640[var40] = var44;

			if (var41 == 0) {
				field635[var40] = var26[var42];
				field636[var40] = var26[var43];
				field637[var40] = var26[var44];

				if (field641 != null) {
					field641[var40] = -1;
				}
			} else {
				field635[var40] = var27[var42];
				field636[var40] = var27[var43];
				field637[var40] = var27[var44];

				if (field641 != null) {
					field641[var40] = arg4;
				}
			}
		}

		int var45 = arg7;
		int var46 = arg1;

		if (arg1 < arg7) {
			var45 = arg1;
		}

		if (arg1 > arg1) {
			var46 = arg1;
		}

		if (arg11 < var45) {
			var45 = arg11;
		}

		if (arg11 > var46) {
			var46 = arg11;
		}

		if (arg0 < var45) {
			var45 = arg0;
		}

		if (arg0 > var46) {
			var46 = arg0;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
