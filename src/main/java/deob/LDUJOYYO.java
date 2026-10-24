package deob;

@ObfuscatedName("LDUJOYYO")
public final class LDUJOYYO {

	@ObfuscatedName("LDUJOYYO.l")
	public boolean field873 = true;

	@ObfuscatedName("LDUJOYYO.m")
	public int field874;

	@ObfuscatedName("LDUJOYYO.n")
	public int field875;

	@ObfuscatedName("LDUJOYYO.o")
	public int field876;

	@ObfuscatedName("LDUJOYYO.p")
	public int field877;

	@ObfuscatedName("LDUJOYYO.b")
	public int[] field863;

	@ObfuscatedName("LDUJOYYO.c")
	public int[] field864;

	@ObfuscatedName("LDUJOYYO.d")
	public int[] field865;

	@ObfuscatedName("LDUJOYYO.h")
	public int[] field869;

	@ObfuscatedName("LDUJOYYO.i")
	public int[] field870;

	@ObfuscatedName("LDUJOYYO.j")
	public int[] field871;

	@ObfuscatedName("LDUJOYYO.e")
	public int[] field866;

	@ObfuscatedName("LDUJOYYO.f")
	public int[] field867;

	@ObfuscatedName("LDUJOYYO.g")
	public int[] field868;

	@ObfuscatedName("LDUJOYYO.k")
	public int[] field872;

	@ObfuscatedName("LDUJOYYO.q")
	public static int[] field878 = new int[6];

	@ObfuscatedName("LDUJOYYO.r")
	public static int[] field879 = new int[6];

	@ObfuscatedName("LDUJOYYO.s")
	public static int[] field880 = new int[6];

	@ObfuscatedName("LDUJOYYO.t")
	public static int[] field881 = new int[6];

	@ObfuscatedName("LDUJOYYO.u")
	public static int[] field882 = new int[6];

	@ObfuscatedName("LDUJOYYO.v")
	public static int[] field883 = new int[] { 1, 0 };

	@ObfuscatedName("LDUJOYYO.w")
	public static int[] field884 = new int[] { 2, 1 };

	@ObfuscatedName("LDUJOYYO.x")
	public static int[] field885 = new int[] { 3, 3 };

	@ObfuscatedName("LDUJOYYO.y")
	public static final int[][] field886 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("LDUJOYYO.z")
	public static final int[][] field887 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public LDUJOYYO(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg7 != arg16 || arg7 != arg8 || arg7 != arg18) {
			field873 = false;
		}

		field874 = arg10;
		field875 = arg3;
		field876 = arg14;
		field877 = arg12;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field886[arg10];
		int var25 = var24.length;
		field863 = new int[var25];
		field864 = new int[var25];
		field865 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg2 * var20;
		int var29 = arg6 * var20;
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
				var34 = arg7;
				var35 = arg5;
				var36 = arg13;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg7 + arg16 >> 1;
				var35 = arg0 + arg5 >> 1;
				var36 = arg13 + arg15 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg16;
				var35 = arg0;
				var36 = arg15;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg16 >> 1;
				var35 = arg0 + arg1 >> 1;
				var36 = arg9 + arg15 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg8;
				var35 = arg1;
				var36 = arg9;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg8 + arg18 >> 1;
				var35 = arg1 + arg17 >> 1;
				var36 = arg9 + arg11 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg18;
				var35 = arg17;
				var36 = arg11;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg7 + arg18 >> 1;
				var35 = arg5 + arg17 >> 1;
				var36 = arg11 + arg13 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg7 + arg16 >> 1;
				var35 = arg0 + arg5 >> 1;
				var36 = arg13 + arg15 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg8 + arg16 >> 1;
				var35 = arg0 + arg1 >> 1;
				var36 = arg9 + arg15 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg8 + arg18 >> 1;
				var35 = arg1 + arg17 >> 1;
				var36 = arg9 + arg11 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg18 >> 1;
				var35 = arg5 + arg17 >> 1;
				var36 = arg11 + arg13 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg7;
				var35 = arg5;
				var36 = arg13;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg16;
				var35 = arg0;
				var36 = arg15;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg8;
				var35 = arg1;
				var36 = arg9;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg18;
				var35 = arg17;
				var36 = arg11;
			}

			field863[var30] = var32;
			field864[var30] = var34;
			field865[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field887[arg10];
		int var38 = var37.length / 4;
		field869 = new int[var38];
		field870 = new int[var38];
		field871 = new int[var38];
		field866 = new int[var38];
		field867 = new int[var38];
		field868 = new int[var38];

		if (arg4 != -1) {
			field872 = new int[var38];
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

			field869[var40] = var42;
			field870[var40] = var43;
			field871[var40] = var44;

			if (var41 == 0) {
				field866[var40] = var26[var42];
				field867[var40] = var26[var43];
				field868[var40] = var26[var44];

				if (field872 != null) {
					field872[var40] = -1;
				}
			} else {
				field866[var40] = var27[var42];
				field867[var40] = var27[var43];
				field868[var40] = var27[var44];

				if (field872 != null) {
					field872[var40] = arg4;
				}
			}
		}

		int var45 = arg7;
		int var46 = arg16;

		if (arg16 < arg7) {
			var45 = arg16;
		}

		if (arg16 > arg16) {
			var46 = arg16;
		}

		if (arg8 < var45) {
			var45 = arg8;
		}

		if (arg8 > var46) {
			var46 = arg8;
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
