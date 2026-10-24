package deob;

@ObfuscatedName("XMUSTGGV")
public final class XMUSTGGV {

	@ObfuscatedName("XMUSTGGV.k")
	public boolean field1454 = true;

	@ObfuscatedName("XMUSTGGV.l")
	public int field1455;

	@ObfuscatedName("XMUSTGGV.m")
	public int field1456;

	@ObfuscatedName("XMUSTGGV.n")
	public int field1457;

	@ObfuscatedName("XMUSTGGV.o")
	public int field1458;

	@ObfuscatedName("XMUSTGGV.a")
	public int[] field1444;

	@ObfuscatedName("XMUSTGGV.b")
	public int[] field1445;

	@ObfuscatedName("XMUSTGGV.c")
	public int[] field1446;

	@ObfuscatedName("XMUSTGGV.g")
	public int[] field1450;

	@ObfuscatedName("XMUSTGGV.h")
	public int[] field1451;

	@ObfuscatedName("XMUSTGGV.i")
	public int[] field1452;

	@ObfuscatedName("XMUSTGGV.d")
	public int[] field1447;

	@ObfuscatedName("XMUSTGGV.e")
	public int[] field1448;

	@ObfuscatedName("XMUSTGGV.f")
	public int[] field1449;

	@ObfuscatedName("XMUSTGGV.j")
	public int[] field1453;

	@ObfuscatedName("XMUSTGGV.p")
	public static int[] field1459 = new int[6];

	@ObfuscatedName("XMUSTGGV.q")
	public static int[] field1460 = new int[6];

	@ObfuscatedName("XMUSTGGV.r")
	public static int[] field1461 = new int[6];

	@ObfuscatedName("XMUSTGGV.s")
	public static int[] field1462 = new int[6];

	@ObfuscatedName("XMUSTGGV.t")
	public static int[] field1463 = new int[6];

	@ObfuscatedName("XMUSTGGV.u")
	public static int[] field1464 = new int[] { 1, 0 };

	@ObfuscatedName("XMUSTGGV.v")
	public static int[] field1465 = new int[] { 2, 1 };

	@ObfuscatedName("XMUSTGGV.w")
	public static int[] field1466 = new int[] { 3, 3 };

	@ObfuscatedName("XMUSTGGV.x")
	public static final int[][] field1467 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("XMUSTGGV.y")
	public static final int[][] field1468 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public XMUSTGGV(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg4 != arg7 || arg4 != arg8 || arg4 != arg5) {
			field1454 = false;
		}

		field1455 = arg17;
		field1456 = arg15;
		field1457 = arg14;
		field1458 = arg2;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1467[arg17];
		int var25 = var24.length;
		field1444 = new int[var25];
		field1445 = new int[var25];
		field1446 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg3 * var20;
		int var29 = arg6 * var20;
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
				var36 = arg0;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg4 + arg7 >> 1;
				var35 = arg1 + arg9 >> 1;
				var36 = arg0 + arg16 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg7;
				var35 = arg9;
				var36 = arg16;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg8 >> 1;
				var35 = arg9 + arg11 >> 1;
				var36 = arg13 + arg16 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg8;
				var35 = arg11;
				var36 = arg13;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg5 + arg8 >> 1;
				var35 = arg11 + arg12 >> 1;
				var36 = arg13 + arg18 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg5;
				var35 = arg12;
				var36 = arg18;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg4 + arg5 >> 1;
				var35 = arg1 + arg12 >> 1;
				var36 = arg0 + arg18 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg4 + arg7 >> 1;
				var35 = arg1 + arg9 >> 1;
				var36 = arg0 + arg16 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg7 + arg8 >> 1;
				var35 = arg9 + arg11 >> 1;
				var36 = arg13 + arg16 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg5 + arg8 >> 1;
				var35 = arg11 + arg12 >> 1;
				var36 = arg13 + arg18 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg4 + arg5 >> 1;
				var35 = arg1 + arg12 >> 1;
				var36 = arg0 + arg18 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg4;
				var35 = arg1;
				var36 = arg0;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg7;
				var35 = arg9;
				var36 = arg16;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg8;
				var35 = arg11;
				var36 = arg13;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg5;
				var35 = arg12;
				var36 = arg18;
			}

			field1444[var30] = var32;
			field1445[var30] = var34;
			field1446[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1468[arg17];
		int var38 = var37.length / 4;
		field1450 = new int[var38];
		field1451 = new int[var38];
		field1452 = new int[var38];
		field1447 = new int[var38];
		field1448 = new int[var38];
		field1449 = new int[var38];

		if (arg10 != -1) {
			field1453 = new int[var38];
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

			field1450[var40] = var42;
			field1451[var40] = var43;
			field1452[var40] = var44;

			if (var41 == 0) {
				field1447[var40] = var26[var42];
				field1448[var40] = var26[var43];
				field1449[var40] = var26[var44];

				if (field1453 != null) {
					field1453[var40] = -1;
				}
			} else {
				field1447[var40] = var27[var42];
				field1448[var40] = var27[var43];
				field1449[var40] = var27[var44];

				if (field1453 != null) {
					field1453[var40] = arg10;
				}
			}
		}

		int var45 = arg4;
		int var46 = arg7;

		if (arg7 < arg4) {
			var45 = arg7;
		}

		if (arg7 > arg7) {
			var46 = arg7;
		}

		if (arg8 < var45) {
			var45 = arg8;
		}

		if (arg8 > var46) {
			var46 = arg8;
		}

		if (arg5 < var45) {
			var45 = arg5;
		}

		if (arg5 > var46) {
			var46 = arg5;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
