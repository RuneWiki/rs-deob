package deob;

@ObfuscatedName("FRCEFZJC")
public final class FRCEFZJC {

	@ObfuscatedName("FRCEFZJC.k")
	public boolean field632 = true;

	@ObfuscatedName("FRCEFZJC.l")
	public int field633;

	@ObfuscatedName("FRCEFZJC.m")
	public int field634;

	@ObfuscatedName("FRCEFZJC.n")
	public int field635;

	@ObfuscatedName("FRCEFZJC.o")
	public int field636;

	@ObfuscatedName("FRCEFZJC.a")
	public int[] field622;

	@ObfuscatedName("FRCEFZJC.b")
	public int[] field623;

	@ObfuscatedName("FRCEFZJC.c")
	public int[] field624;

	@ObfuscatedName("FRCEFZJC.g")
	public int[] field628;

	@ObfuscatedName("FRCEFZJC.h")
	public int[] field629;

	@ObfuscatedName("FRCEFZJC.i")
	public int[] field630;

	@ObfuscatedName("FRCEFZJC.d")
	public int[] field625;

	@ObfuscatedName("FRCEFZJC.e")
	public int[] field626;

	@ObfuscatedName("FRCEFZJC.f")
	public int[] field627;

	@ObfuscatedName("FRCEFZJC.j")
	public int[] field631;

	@ObfuscatedName("FRCEFZJC.p")
	public static int[] field637 = new int[6];

	@ObfuscatedName("FRCEFZJC.q")
	public static int[] field638 = new int[6];

	@ObfuscatedName("FRCEFZJC.r")
	public static int[] field639 = new int[6];

	@ObfuscatedName("FRCEFZJC.s")
	public static int[] field640 = new int[6];

	@ObfuscatedName("FRCEFZJC.t")
	public static int[] field641 = new int[6];

	@ObfuscatedName("FRCEFZJC.u")
	public static int[] field642 = new int[] { 1, 0 };

	@ObfuscatedName("FRCEFZJC.v")
	public static int[] field643 = new int[] { 2, 1 };

	@ObfuscatedName("FRCEFZJC.w")
	public static int[] field644 = new int[] { 3, 3 };

	@ObfuscatedName("FRCEFZJC.x")
	public static final int[][] field645 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("FRCEFZJC.y")
	public static final int[][] field646 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public FRCEFZJC(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg0 != arg16 || arg0 != arg2 || arg0 != arg13) {
			field632 = false;
		}

		field633 = arg14;
		field634 = arg3;
		field635 = arg15;
		field636 = arg12;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field645[arg14];
		int var25 = var24.length;
		field622 = new int[var25];
		field623 = new int[var25];
		field624 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg18 * var20;
		int var29 = arg17 * var20;
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
				var34 = arg0;
				var35 = arg5;
				var36 = arg6;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg0 + arg16 >> 1;
				var35 = arg5 + arg10 >> 1;
				var36 = arg6 + arg11 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg16;
				var35 = arg10;
				var36 = arg11;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg2 + arg16 >> 1;
				var35 = arg9 + arg10 >> 1;
				var36 = arg8 + arg11 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg2;
				var35 = arg9;
				var36 = arg8;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg2 + arg13 >> 1;
				var35 = arg7 + arg9 >> 1;
				var36 = arg1 + arg8 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg13;
				var35 = arg7;
				var36 = arg1;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg0 + arg13 >> 1;
				var35 = arg5 + arg7 >> 1;
				var36 = arg1 + arg6 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg0 + arg16 >> 1;
				var35 = arg5 + arg10 >> 1;
				var36 = arg6 + arg11 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg2 + arg16 >> 1;
				var35 = arg9 + arg10 >> 1;
				var36 = arg8 + arg11 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg2 + arg13 >> 1;
				var35 = arg7 + arg9 >> 1;
				var36 = arg1 + arg8 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg13 >> 1;
				var35 = arg5 + arg7 >> 1;
				var36 = arg1 + arg6 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg0;
				var35 = arg5;
				var36 = arg6;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg16;
				var35 = arg10;
				var36 = arg11;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg2;
				var35 = arg9;
				var36 = arg8;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg13;
				var35 = arg7;
				var36 = arg1;
			}

			field622[var30] = var32;
			field623[var30] = var34;
			field624[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field646[arg14];
		int var38 = var37.length / 4;
		field628 = new int[var38];
		field629 = new int[var38];
		field630 = new int[var38];
		field625 = new int[var38];
		field626 = new int[var38];
		field627 = new int[var38];

		if (arg4 != -1) {
			field631 = new int[var38];
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

			field628[var40] = var42;
			field629[var40] = var43;
			field630[var40] = var44;

			if (var41 == 0) {
				field625[var40] = var26[var42];
				field626[var40] = var26[var43];
				field627[var40] = var26[var44];

				if (field631 != null) {
					field631[var40] = -1;
				}
			} else {
				field625[var40] = var27[var42];
				field626[var40] = var27[var43];
				field627[var40] = var27[var44];

				if (field631 != null) {
					field631[var40] = arg4;
				}
			}
		}

		int var45 = arg0;
		int var46 = arg16;

		if (arg16 < arg0) {
			var45 = arg16;
		}

		if (arg16 > arg16) {
			var46 = arg16;
		}

		if (arg2 < var45) {
			var45 = arg2;
		}

		if (arg2 > var46) {
			var46 = arg2;
		}

		if (arg13 < var45) {
			var45 = arg13;
		}

		if (arg13 > var46) {
			var46 = arg13;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
