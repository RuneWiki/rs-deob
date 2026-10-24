package deob;

@ObfuscatedName("DOXIUUVA")
public final class DOXIUUVA {

	@ObfuscatedName("DOXIUUVA.k")
	public boolean field620 = true;

	@ObfuscatedName("DOXIUUVA.l")
	public int field621;

	@ObfuscatedName("DOXIUUVA.m")
	public int field622;

	@ObfuscatedName("DOXIUUVA.n")
	public int field623;

	@ObfuscatedName("DOXIUUVA.o")
	public int field624;

	@ObfuscatedName("DOXIUUVA.a")
	public int[] field610;

	@ObfuscatedName("DOXIUUVA.b")
	public int[] field611;

	@ObfuscatedName("DOXIUUVA.c")
	public int[] field612;

	@ObfuscatedName("DOXIUUVA.g")
	public int[] field616;

	@ObfuscatedName("DOXIUUVA.h")
	public int[] field617;

	@ObfuscatedName("DOXIUUVA.i")
	public int[] field618;

	@ObfuscatedName("DOXIUUVA.d")
	public int[] field613;

	@ObfuscatedName("DOXIUUVA.e")
	public int[] field614;

	@ObfuscatedName("DOXIUUVA.f")
	public int[] field615;

	@ObfuscatedName("DOXIUUVA.j")
	public int[] field619;

	@ObfuscatedName("DOXIUUVA.p")
	public static int[] field625 = new int[6];

	@ObfuscatedName("DOXIUUVA.q")
	public static int[] field626 = new int[6];

	@ObfuscatedName("DOXIUUVA.r")
	public static int[] field627 = new int[6];

	@ObfuscatedName("DOXIUUVA.s")
	public static int[] field628 = new int[6];

	@ObfuscatedName("DOXIUUVA.t")
	public static int[] field629 = new int[6];

	@ObfuscatedName("DOXIUUVA.u")
	public static int[] field630 = new int[] { 1, 0 };

	@ObfuscatedName("DOXIUUVA.v")
	public static int[] field631 = new int[] { 2, 1 };

	@ObfuscatedName("DOXIUUVA.w")
	public static int[] field632 = new int[] { 3, 3 };

	@ObfuscatedName("DOXIUUVA.x")
	public static final int[][] field633 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("DOXIUUVA.y")
	public static final int[][] field634 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public DOXIUUVA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg0 != arg4 || arg0 != arg13 || arg0 != arg8) {
			field620 = false;
		}

		field621 = arg5;
		field622 = arg10;
		field623 = arg16;
		field624 = arg18;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field633[arg5];
		int var25 = var24.length;
		field610 = new int[var25];
		field611 = new int[var25];
		field612 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg2 * var20;
		int var29 = arg14 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg10 - arg10 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg10 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg10 - 13 & 0x3) + 13;
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
				var35 = arg12;
				var36 = arg11;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg0 + arg4 >> 1;
				var35 = arg12 + arg17 >> 1;
				var36 = arg6 + arg11 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg4;
				var35 = arg17;
				var36 = arg6;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg4 + arg13 >> 1;
				var35 = arg9 + arg17 >> 1;
				var36 = arg6 + arg15 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg13;
				var35 = arg9;
				var36 = arg15;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg8 + arg13 >> 1;
				var35 = arg3 + arg9 >> 1;
				var36 = arg1 + arg15 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg8;
				var35 = arg3;
				var36 = arg1;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg0 + arg8 >> 1;
				var35 = arg3 + arg12 >> 1;
				var36 = arg1 + arg11 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg0 + arg4 >> 1;
				var35 = arg12 + arg17 >> 1;
				var36 = arg6 + arg11 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg4 + arg13 >> 1;
				var35 = arg9 + arg17 >> 1;
				var36 = arg6 + arg15 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg8 + arg13 >> 1;
				var35 = arg3 + arg9 >> 1;
				var36 = arg1 + arg15 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg0 + arg8 >> 1;
				var35 = arg3 + arg12 >> 1;
				var36 = arg1 + arg11 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg0;
				var35 = arg12;
				var36 = arg11;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg4;
				var35 = arg17;
				var36 = arg6;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg13;
				var35 = arg9;
				var36 = arg15;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg8;
				var35 = arg3;
				var36 = arg1;
			}

			field610[var30] = var32;
			field611[var30] = var34;
			field612[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field634[arg5];
		int var38 = var37.length / 4;
		field616 = new int[var38];
		field617 = new int[var38];
		field618 = new int[var38];
		field613 = new int[var38];
		field614 = new int[var38];
		field615 = new int[var38];

		if (arg7 != -1) {
			field619 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg10 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg10 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg10 & 0x3;
			}

			field616[var40] = var42;
			field617[var40] = var43;
			field618[var40] = var44;

			if (var41 == 0) {
				field613[var40] = var26[var42];
				field614[var40] = var26[var43];
				field615[var40] = var26[var44];

				if (field619 != null) {
					field619[var40] = -1;
				}
			} else {
				field613[var40] = var27[var42];
				field614[var40] = var27[var43];
				field615[var40] = var27[var44];

				if (field619 != null) {
					field619[var40] = arg7;
				}
			}
		}

		int var45 = arg0;
		int var46 = arg4;

		if (arg4 < arg0) {
			var45 = arg4;
		}

		if (arg4 > arg4) {
			var46 = arg4;
		}

		if (arg13 < var45) {
			var45 = arg13;
		}

		if (arg13 > var46) {
			var46 = arg13;
		}

		if (arg8 < var45) {
			var45 = arg8;
		}

		if (arg8 > var46) {
			var46 = arg8;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
