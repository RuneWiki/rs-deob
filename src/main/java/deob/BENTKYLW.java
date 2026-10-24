package deob;

@ObfuscatedName("BENTKYLW")
public final class BENTKYLW {

	@ObfuscatedName("BENTKYLW.l")
	public boolean field81 = true;

	@ObfuscatedName("BENTKYLW.m")
	public int field82;

	@ObfuscatedName("BENTKYLW.n")
	public int field83;

	@ObfuscatedName("BENTKYLW.o")
	public int field84;

	@ObfuscatedName("BENTKYLW.p")
	public int field85;

	@ObfuscatedName("BENTKYLW.b")
	public int[] field71;

	@ObfuscatedName("BENTKYLW.c")
	public int[] field72;

	@ObfuscatedName("BENTKYLW.d")
	public int[] field73;

	@ObfuscatedName("BENTKYLW.h")
	public int[] field77;

	@ObfuscatedName("BENTKYLW.i")
	public int[] field78;

	@ObfuscatedName("BENTKYLW.j")
	public int[] field79;

	@ObfuscatedName("BENTKYLW.e")
	public int[] field74;

	@ObfuscatedName("BENTKYLW.f")
	public int[] field75;

	@ObfuscatedName("BENTKYLW.g")
	public int[] field76;

	@ObfuscatedName("BENTKYLW.k")
	public int[] field80;

	@ObfuscatedName("BENTKYLW.q")
	public static int[] field86 = new int[6];

	@ObfuscatedName("BENTKYLW.r")
	public static int[] field87 = new int[6];

	@ObfuscatedName("BENTKYLW.s")
	public static int[] field88 = new int[6];

	@ObfuscatedName("BENTKYLW.t")
	public static int[] field89 = new int[6];

	@ObfuscatedName("BENTKYLW.u")
	public static int[] field90 = new int[6];

	@ObfuscatedName("BENTKYLW.v")
	public static int[] field91 = new int[] { 1, 0 };

	@ObfuscatedName("BENTKYLW.w")
	public static int[] field92 = new int[] { 2, 1 };

	@ObfuscatedName("BENTKYLW.x")
	public static int[] field93 = new int[] { 3, 3 };

	@ObfuscatedName("BENTKYLW.y")
	public static final int[][] field94 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("BENTKYLW.z")
	public static final int[][] field95 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public BENTKYLW(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg6 != arg17 || arg6 != arg7 || arg6 != arg13) {
			field81 = false;
		}

		field82 = arg1;
		field83 = arg0;
		field84 = arg14;
		field85 = arg8;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field94[arg1];
		int var25 = var24.length;
		field71 = new int[var25];
		field72 = new int[var25];
		field73 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg15 * var20;
		int var29 = arg16 * var20;
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
				var34 = arg6;
				var35 = arg9;
				var36 = arg4;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg6 + arg17 >> 1;
				var35 = arg9 + arg11 >> 1;
				var36 = arg4 + arg18 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg17;
				var35 = arg11;
				var36 = arg18;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg17 >> 1;
				var35 = arg3 + arg11 >> 1;
				var36 = arg10 + arg18 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg7;
				var35 = arg3;
				var36 = arg10;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg7 + arg13 >> 1;
				var35 = arg3 + arg5 >> 1;
				var36 = arg2 + arg10 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg13;
				var35 = arg5;
				var36 = arg2;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg6 + arg13 >> 1;
				var35 = arg5 + arg9 >> 1;
				var36 = arg2 + arg4 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg6 + arg17 >> 1;
				var35 = arg9 + arg11 >> 1;
				var36 = arg4 + arg18 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg17 >> 1;
				var35 = arg3 + arg11 >> 1;
				var36 = arg10 + arg18 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg7 + arg13 >> 1;
				var35 = arg3 + arg5 >> 1;
				var36 = arg2 + arg10 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg6 + arg13 >> 1;
				var35 = arg5 + arg9 >> 1;
				var36 = arg2 + arg4 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg6;
				var35 = arg9;
				var36 = arg4;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg17;
				var35 = arg11;
				var36 = arg18;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg7;
				var35 = arg3;
				var36 = arg10;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg13;
				var35 = arg5;
				var36 = arg2;
			}

			field71[var30] = var32;
			field72[var30] = var34;
			field73[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field95[arg1];
		int var38 = var37.length / 4;
		field77 = new int[var38];
		field78 = new int[var38];
		field79 = new int[var38];
		field74 = new int[var38];
		field75 = new int[var38];
		field76 = new int[var38];

		if (arg12 != -1) {
			field80 = new int[var38];
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

			field77[var40] = var42;
			field78[var40] = var43;
			field79[var40] = var44;

			if (var41 == 0) {
				field74[var40] = var26[var42];
				field75[var40] = var26[var43];
				field76[var40] = var26[var44];

				if (field80 != null) {
					field80[var40] = -1;
				}
			} else {
				field74[var40] = var27[var42];
				field75[var40] = var27[var43];
				field76[var40] = var27[var44];

				if (field80 != null) {
					field80[var40] = arg12;
				}
			}
		}

		int var45 = arg6;
		int var46 = arg17;

		if (arg17 < arg6) {
			var45 = arg17;
		}

		if (arg17 > arg17) {
			var46 = arg17;
		}

		if (arg7 < var45) {
			var45 = arg7;
		}

		if (arg7 > var46) {
			var46 = arg7;
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
