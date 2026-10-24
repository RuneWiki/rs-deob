package deob;

@ObfuscatedName("VOBEDSID")
public final class VOBEDSID {

	@ObfuscatedName("VOBEDSID.k")
	public boolean field1292 = true;

	@ObfuscatedName("VOBEDSID.l")
	public int field1293;

	@ObfuscatedName("VOBEDSID.m")
	public int field1294;

	@ObfuscatedName("VOBEDSID.n")
	public int field1295;

	@ObfuscatedName("VOBEDSID.o")
	public int field1296;

	@ObfuscatedName("VOBEDSID.a")
	public int[] field1282;

	@ObfuscatedName("VOBEDSID.b")
	public int[] field1283;

	@ObfuscatedName("VOBEDSID.c")
	public int[] field1284;

	@ObfuscatedName("VOBEDSID.g")
	public int[] field1288;

	@ObfuscatedName("VOBEDSID.h")
	public int[] field1289;

	@ObfuscatedName("VOBEDSID.i")
	public int[] field1290;

	@ObfuscatedName("VOBEDSID.d")
	public int[] field1285;

	@ObfuscatedName("VOBEDSID.e")
	public int[] field1286;

	@ObfuscatedName("VOBEDSID.f")
	public int[] field1287;

	@ObfuscatedName("VOBEDSID.j")
	public int[] field1291;

	@ObfuscatedName("VOBEDSID.p")
	public static int[] field1297 = new int[6];

	@ObfuscatedName("VOBEDSID.q")
	public static int[] field1298 = new int[6];

	@ObfuscatedName("VOBEDSID.r")
	public static int[] field1299 = new int[6];

	@ObfuscatedName("VOBEDSID.s")
	public static int[] field1300 = new int[6];

	@ObfuscatedName("VOBEDSID.t")
	public static int[] field1301 = new int[6];

	@ObfuscatedName("VOBEDSID.u")
	public static int[] field1302 = new int[] { 1, 0 };

	@ObfuscatedName("VOBEDSID.v")
	public static int[] field1303 = new int[] { 2, 1 };

	@ObfuscatedName("VOBEDSID.w")
	public static int[] field1304 = new int[] { 3, 3 };

	@ObfuscatedName("VOBEDSID.x")
	public static final int[][] field1305 = new int[][] { { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 6 }, { 1, 3, 5, 7, 2, 6 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 2, 8 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 11, 12 }, { 1, 3, 5, 7, 13, 14 } };

	@ObfuscatedName("VOBEDSID.y")
	public static final int[][] field1306 = new int[][] { { 0, 1, 2, 3, 0, 0, 1, 3 }, { 1, 1, 2, 3, 1, 0, 1, 3 }, { 0, 1, 2, 3, 1, 0, 1, 3 }, { 0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3 }, { 0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4 }, { 0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4 }, { 0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3 }, { 0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3 }, { 0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5 }, { 0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5 }, { 0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3 }, { 1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3 }, { 1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5 } };

	public VOBEDSID(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
		if (arg3 != arg10 || arg1 != arg3 || arg2 != arg3) {
			field1292 = false;
		}

		field1293 = arg4;
		field1294 = arg16;
		field1295 = arg13;
		field1296 = arg17;
		short var20 = 128;
		int var21 = var20 / 2;
		int var22 = var20 / 4;
		int var23 = var20 * 3 / 4;
		int[] var24 = field1305[arg4];
		int var25 = var24.length;
		field1282 = new int[var25];
		field1283 = new int[var25];
		field1284 = new int[var25];
		int[] var26 = new int[var25];
		int[] var27 = new int[var25];
		int var28 = arg12 * var20;
		int var29 = arg9 * var20;
		for (int var30 = 0; var30 < var25; var30++) {
			int var31 = var24[var30];
			if ((var31 & 0x1) == 0 && var31 <= 8) {
				var31 = (var31 - arg16 - arg16 - 1 & 0x7) + 1;
			}

			if (var31 > 8 && var31 <= 12) {
				var31 = (var31 - arg16 - 9 & 0x3) + 9;
			}

			if (var31 > 12 && var31 <= 16) {
				var31 = (var31 - arg16 - 13 & 0x3) + 13;
			}

			int var32;
			int var33;
			int var34;
			int var35;
			int var36;
			if (var31 == 1) {
				var32 = var28;
				var33 = var29;
				var34 = arg3;
				var35 = arg5;
				var36 = arg11;
			} else if (var31 == 2) {
				var32 = var21 + var28;
				var33 = var29;
				var34 = arg3 + arg10 >> 1;
				var35 = arg5 + arg7 >> 1;
				var36 = arg11 + arg14 >> 1;
			} else if (var31 == 3) {
				var32 = var20 + var28;
				var33 = var29;
				var34 = arg10;
				var35 = arg7;
				var36 = arg14;
			} else if (var31 == 4) {
				var32 = var20 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg10 >> 1;
				var35 = arg7 + arg15 >> 1;
				var36 = arg14 + arg18 >> 1;
			} else if (var31 == 5) {
				var32 = var20 + var28;
				var33 = var20 + var29;
				var34 = arg1;
				var35 = arg15;
				var36 = arg18;
			} else if (var31 == 6) {
				var32 = var21 + var28;
				var33 = var20 + var29;
				var34 = arg1 + arg2 >> 1;
				var35 = arg0 + arg15 >> 1;
				var36 = arg8 + arg18 >> 1;
			} else if (var31 == 7) {
				var32 = var28;
				var33 = var20 + var29;
				var34 = arg2;
				var35 = arg0;
				var36 = arg8;
			} else if (var31 == 8) {
				var32 = var28;
				var33 = var21 + var29;
				var34 = arg2 + arg3 >> 1;
				var35 = arg0 + arg5 >> 1;
				var36 = arg8 + arg11 >> 1;
			} else if (var31 == 9) {
				var32 = var21 + var28;
				var33 = var22 + var29;
				var34 = arg3 + arg10 >> 1;
				var35 = arg5 + arg7 >> 1;
				var36 = arg11 + arg14 >> 1;
			} else if (var31 == 10) {
				var32 = var23 + var28;
				var33 = var21 + var29;
				var34 = arg1 + arg10 >> 1;
				var35 = arg7 + arg15 >> 1;
				var36 = arg14 + arg18 >> 1;
			} else if (var31 == 11) {
				var32 = var21 + var28;
				var33 = var23 + var29;
				var34 = arg1 + arg2 >> 1;
				var35 = arg0 + arg15 >> 1;
				var36 = arg8 + arg18 >> 1;
			} else if (var31 == 12) {
				var32 = var22 + var28;
				var33 = var21 + var29;
				var34 = arg2 + arg3 >> 1;
				var35 = arg0 + arg5 >> 1;
				var36 = arg8 + arg11 >> 1;
			} else if (var31 == 13) {
				var32 = var22 + var28;
				var33 = var22 + var29;
				var34 = arg3;
				var35 = arg5;
				var36 = arg11;
			} else if (var31 == 14) {
				var32 = var23 + var28;
				var33 = var22 + var29;
				var34 = arg10;
				var35 = arg7;
				var36 = arg14;
			} else if (var31 == 15) {
				var32 = var23 + var28;
				var33 = var23 + var29;
				var34 = arg1;
				var35 = arg15;
				var36 = arg18;
			} else {
				var32 = var22 + var28;
				var33 = var23 + var29;
				var34 = arg2;
				var35 = arg0;
				var36 = arg8;
			}

			field1282[var30] = var32;
			field1283[var30] = var34;
			field1284[var30] = var33;
			var26[var30] = var35;
			var27[var30] = var36;
		}

		int[] var37 = field1306[arg4];
		int var38 = var37.length / 4;
		field1288 = new int[var38];
		field1289 = new int[var38];
		field1290 = new int[var38];
		field1285 = new int[var38];
		field1286 = new int[var38];
		field1287 = new int[var38];

		if (arg6 != -1) {
			field1291 = new int[var38];
		}

		int var39 = 0;
		for (int var40 = 0; var40 < var38; var40++) {
			int var41 = var37[var39];
			int var42 = var37[var39 + 1];
			int var43 = var37[var39 + 2];
			int var44 = var37[var39 + 3];
			var39 += 4;

			if (var42 < 4) {
				var42 = var42 - arg16 & 0x3;
			}

			if (var43 < 4) {
				var43 = var43 - arg16 & 0x3;
			}

			if (var44 < 4) {
				var44 = var44 - arg16 & 0x3;
			}

			field1288[var40] = var42;
			field1289[var40] = var43;
			field1290[var40] = var44;

			if (var41 == 0) {
				field1285[var40] = var26[var42];
				field1286[var40] = var26[var43];
				field1287[var40] = var26[var44];

				if (field1291 != null) {
					field1291[var40] = -1;
				}
			} else {
				field1285[var40] = var27[var42];
				field1286[var40] = var27[var43];
				field1287[var40] = var27[var44];

				if (field1291 != null) {
					field1291[var40] = arg6;
				}
			}
		}

		int var45 = arg3;
		int var46 = arg10;

		if (arg10 < arg3) {
			var45 = arg10;
		}

		if (arg10 > arg10) {
			var46 = arg10;
		}

		if (arg1 < var45) {
			var45 = arg1;
		}

		if (arg1 > var46) {
			var46 = arg1;
		}

		if (arg2 < var45) {
			var45 = arg2;
		}

		if (arg2 > var46) {
			var46 = arg2;
		}

		var45 /= 14;
		var46 /= 14;
	}
}
