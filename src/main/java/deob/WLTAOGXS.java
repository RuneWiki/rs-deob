package deob;

@ObfuscatedName("WLTAOGXS")
public class WLTAOGXS {

	@ObfuscatedName("WLTAOGXS.j")
	public int[] field1347 = new int[5];

	@ObfuscatedName("WLTAOGXS.k")
	public int[] field1348 = new int[5];

	@ObfuscatedName("WLTAOGXS.l")
	public int[] field1349 = new int[5];

	@ObfuscatedName("WLTAOGXS.n")
	public int field1351 = 100;

	@ObfuscatedName("WLTAOGXS.q")
	public int field1354 = 500;

	@ObfuscatedName("WLTAOGXS.v")
	public static int[] field1359 = new int[5];

	@ObfuscatedName("WLTAOGXS.w")
	public static int[] field1360 = new int[5];

	@ObfuscatedName("WLTAOGXS.x")
	public static int[] field1361 = new int[5];

	@ObfuscatedName("WLTAOGXS.y")
	public static int[] field1362 = new int[5];

	@ObfuscatedName("WLTAOGXS.z")
	public static int[] field1363 = new int[5];

	@ObfuscatedName("WLTAOGXS.m")
	public int field1350;

	@ObfuscatedName("WLTAOGXS.r")
	public int field1355;

	@ObfuscatedName("WLTAOGXS.o")
	public GHIPAIQX field1352;

	@ObfuscatedName("WLTAOGXS.b")
	public LYKGAWTC field1339;

	@ObfuscatedName("WLTAOGXS.c")
	public LYKGAWTC field1340;

	@ObfuscatedName("WLTAOGXS.d")
	public LYKGAWTC field1341;

	@ObfuscatedName("WLTAOGXS.e")
	public LYKGAWTC field1342;

	@ObfuscatedName("WLTAOGXS.f")
	public LYKGAWTC field1343;

	@ObfuscatedName("WLTAOGXS.g")
	public LYKGAWTC field1344;

	@ObfuscatedName("WLTAOGXS.h")
	public LYKGAWTC field1345;

	@ObfuscatedName("WLTAOGXS.i")
	public LYKGAWTC field1346;

	@ObfuscatedName("WLTAOGXS.p")
	public LYKGAWTC field1353;

	@ObfuscatedName("WLTAOGXS.s")
	public static int[] field1356;

	@ObfuscatedName("WLTAOGXS.t")
	public static int[] field1357;

	@ObfuscatedName("WLTAOGXS.u")
	public static int[] field1358;

	@ObfuscatedName("WLTAOGXS.a()V")
	public static final void method551() {
		field1357 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1357[var0] = 1;
			} else {
				field1357[var0] = -1;
			}
		}

		field1358 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1358[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1356 = new int[220500];
	}

	@ObfuscatedName("WLTAOGXS.a(II)[I")
	public final int[] method552(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1356[var3] = 0;
		}

		if (arg1 < 10) {
			return field1356;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1339.method387();
		field1340.method387();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1341 != null) {
			field1341.method387();
			field1342.method387();
			var6 = (int) ((field1341.field902 - field1341.field901) * 32.768D / var4);
			var7 = (int) (field1341.field901 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1343 != null) {
			field1343.method387();
			field1344.method387();
			var9 = (int) ((field1343.field902 - field1343.field901) * 32.768D / var4);
			var10 = (int) (field1343.field901 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1347[var12] != 0) {
				field1359[var12] = 0;
				field1360[var12] = (int) (field1349[var12] * var4);
				field1361[var12] = (field1347[var12] << 14) / 100;
				field1362[var12] = (int) ((field1339.field902 - field1339.field901) * 32.768D * Math.pow(1.0057929410678534D, field1348[var12]) / var4);
				field1363[var12] = (int) (field1339.field901 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1339.method388(arg0);
			int var15 = field1340.method388(arg0);

			if (field1341 != null) {
				int var16 = field1341.method388(arg0);
				int var17 = field1342.method388(arg0);
				var14 += method553(field1341.field903, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1343 != null) {
				int var18 = field1343.method388(arg0);
				int var19 = field1344.method388(arg0);
				var15 = var15 * ((method553(field1343.field903, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1347[var20] != 0) {
					int var21 = field1360[var20] + var13;
					if (var21 < arg0) {
						field1356[var21] += method553(field1339.field903, field1361[var20] * var15 >> 15, field1359[var20]);
						field1359[var20] += (field1362[var20] * var14 >> 16) + field1363[var20];
					}
				}
			}
		}

		if (field1345 != null) {
			field1345.method387();
			field1346.method387();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1345.method388(arg0);
				int var27 = field1346.method388(arg0);
				int var28;
				if (var24) {
					var28 = ((field1345.field902 - field1345.field901) * var26 >> 8) + field1345.field901;
				} else {
					var28 = ((field1345.field902 - field1345.field901) * var27 >> 8) + field1345.field901;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1356[var25] = 0;
				}
			}
		}

		if (field1350 > 0 && field1351 > 0) {
			int var29 = (int) (field1350 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1356[var30] += field1356[var30 - var29] * field1351 / 100;
			}
		}

		if (field1352.field700[0] > 0 || field1352.field700[1] > 0) {
			field1353.method387();
			int var31 = field1353.method388(arg0 + 1);
			int var32 = field1352.method230(var31 / 65536.0F, 0);
			int var33 = field1352.method230(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1356[var32 + var34] * (long) GHIPAIQX.field707 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1356[var32 + var34 - var37 - 1] * (long) GHIPAIQX.field705[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1356[var34 - var38 - 1] * (long) GHIPAIQX.field705[1][var38] >> 16);
					}

					field1356[var34] = var36;
					var31 = field1353.method388(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1356[var32 + var34] * (long) GHIPAIQX.field707 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1356[var32 + var34 - var42 - 1] * (long) GHIPAIQX.field705[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1356[var34 - var43 - 1] * (long) GHIPAIQX.field705[1][var43] >> 16);
						}

						field1356[var34] = var41;
						var31 = field1353.method388(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1352.method230(var31 / 65536.0F, 0);
					var33 = field1352.method230(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1356[var32 + var34 - var45 - 1] * (long) GHIPAIQX.field705[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1356[var34 - var46 - 1] * (long) GHIPAIQX.field705[1][var46] >> 16);
					}

					field1356[var34] = var44;
					field1353.method388(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1356[var48] < -32768) {
				field1356[var48] = -32768;
			}

			if (field1356[var48] > 32767) {
				field1356[var48] = 32767;
			}
		}

		return field1356;
	}

	@ObfuscatedName("WLTAOGXS.a(IIII)I")
	public final int method553(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field1358[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field1357[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("WLTAOGXS.a(BLGLMIQHJI;)V")
	public final void method554(GLMIQHJI arg0) {
		field1339 = new LYKGAWTC();
		field1339.method385(arg0);
		field1340 = new LYKGAWTC();
		field1340.method385(arg0);
		int var2 = arg0.method244();
		if (var2 != 0) {
			arg0.field709--;
			field1341 = new LYKGAWTC();
			field1341.method385(arg0);
			field1342 = new LYKGAWTC();
			field1342.method385(arg0);
		}

		int var3 = arg0.method244();
		if (var3 != 0) {
			arg0.field709--;
			field1343 = new LYKGAWTC();
			field1343.method385(arg0);
			field1344 = new LYKGAWTC();
			field1344.method385(arg0);
		}

		int var4 = arg0.method244();
		if (var4 != 0) {
			arg0.field709--;
			field1345 = new LYKGAWTC();
			field1345.method385(arg0);
			field1346 = new LYKGAWTC();
			field1346.method385(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method258();
			if (var6 == 0) {
				break;
			}

			field1347[var5] = var6;
			field1348[var5] = arg0.method257();
			field1349[var5] = arg0.method258();
		}

		field1350 = arg0.method258();
		field1351 = arg0.method258();
		field1354 = arg0.method246();
		field1355 = arg0.method246();
		field1352 = new GHIPAIQX();
		field1353 = new LYKGAWTC();
		field1352.method231(field1353, arg0);
	}
}
