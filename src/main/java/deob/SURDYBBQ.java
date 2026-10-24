package deob;

@ObfuscatedName("SURDYBBQ")
public class SURDYBBQ {

	@ObfuscatedName("SURDYBBQ.k")
	public int[] field1348 = new int[5];

	@ObfuscatedName("SURDYBBQ.l")
	public int[] field1349 = new int[5];

	@ObfuscatedName("SURDYBBQ.m")
	public int[] field1350 = new int[5];

	@ObfuscatedName("SURDYBBQ.o")
	public int field1352 = 100;

	@ObfuscatedName("SURDYBBQ.r")
	public int field1355 = 500;

	@ObfuscatedName("SURDYBBQ.w")
	public static int[] field1360 = new int[5];

	@ObfuscatedName("SURDYBBQ.x")
	public static int[] field1361 = new int[5];

	@ObfuscatedName("SURDYBBQ.y")
	public static int[] field1362 = new int[5];

	@ObfuscatedName("SURDYBBQ.z")
	public static int[] field1363 = new int[5];

	@ObfuscatedName("SURDYBBQ.A")
	public static int[] field1364 = new int[5];

	@ObfuscatedName("SURDYBBQ.n")
	public int field1351;

	@ObfuscatedName("SURDYBBQ.s")
	public int field1356;

	@ObfuscatedName("SURDYBBQ.p")
	public PXSNRSMR field1353;

	@ObfuscatedName("SURDYBBQ.c")
	public TAISOUDS field1340;

	@ObfuscatedName("SURDYBBQ.d")
	public TAISOUDS field1341;

	@ObfuscatedName("SURDYBBQ.e")
	public TAISOUDS field1342;

	@ObfuscatedName("SURDYBBQ.f")
	public TAISOUDS field1343;

	@ObfuscatedName("SURDYBBQ.g")
	public TAISOUDS field1344;

	@ObfuscatedName("SURDYBBQ.h")
	public TAISOUDS field1345;

	@ObfuscatedName("SURDYBBQ.i")
	public TAISOUDS field1346;

	@ObfuscatedName("SURDYBBQ.j")
	public TAISOUDS field1347;

	@ObfuscatedName("SURDYBBQ.q")
	public TAISOUDS field1354;

	@ObfuscatedName("SURDYBBQ.t")
	public static int[] field1357;

	@ObfuscatedName("SURDYBBQ.u")
	public static int[] field1358;

	@ObfuscatedName("SURDYBBQ.v")
	public static int[] field1359;

	@ObfuscatedName("SURDYBBQ.a()V")
	public static final void method567() {
		field1358 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1358[var0] = 1;
			} else {
				field1358[var0] = -1;
			}
		}

		field1359 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1359[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1357 = new int[220500];
	}

	@ObfuscatedName("SURDYBBQ.a(II)[I")
	public final int[] method568(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1357[var3] = 0;
		}

		if (arg1 < 10) {
			return field1357;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1340.method573();
		field1341.method573();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1342 != null) {
			field1342.method573();
			field1343.method573();
			var6 = (int) ((field1342.field1369 - field1342.field1368) * 32.768D / var4);
			var7 = (int) (field1342.field1368 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1344 != null) {
			field1344.method573();
			field1345.method573();
			var9 = (int) ((field1344.field1369 - field1344.field1368) * 32.768D / var4);
			var10 = (int) (field1344.field1368 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1348[var12] != 0) {
				field1360[var12] = 0;
				field1361[var12] = (int) (field1350[var12] * var4);
				field1362[var12] = (field1348[var12] << 14) / 100;
				field1363[var12] = (int) ((field1340.field1369 - field1340.field1368) * 32.768D * Math.pow(1.0057929410678534D, field1349[var12]) / var4);
				field1364[var12] = (int) (field1340.field1368 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1340.method574(arg0);
			int var15 = field1341.method574(arg0);

			if (field1342 != null) {
				int var16 = field1342.method574(arg0);
				int var17 = field1343.method574(arg0);
				var14 += method569(var8, var17, field1342.field1370) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1344 != null) {
				int var18 = field1344.method574(arg0);
				int var19 = field1345.method574(arg0);
				var15 = var15 * ((method569(var11, var19, field1344.field1370) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1348[var20] != 0) {
					int var21 = field1361[var20] + var13;
					if (var21 < arg0) {
						field1357[var21] += method569(field1360[var20], field1362[var20] * var15 >> 15, field1340.field1370);
						field1360[var20] += (field1363[var20] * var14 >> 16) + field1364[var20];
					}
				}
			}
		}

		if (field1346 != null) {
			field1346.method573();
			field1347.method573();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1346.method574(arg0);
				int var27 = field1347.method574(arg0);
				int var28;
				if (var24) {
					var28 = ((field1346.field1369 - field1346.field1368) * var26 >> 8) + field1346.field1368;
				} else {
					var28 = ((field1346.field1369 - field1346.field1368) * var27 >> 8) + field1346.field1368;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1357[var25] = 0;
				}
			}
		}

		if (field1351 > 0 && field1352 > 0) {
			int var29 = (int) (field1351 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1357[var30] += field1357[var30 - var29] * field1352 / 100;
			}
		}

		if (field1353.field1260[0] > 0 || field1353.field1260[1] > 0) {
			field1354.method573();
			int var31 = field1354.method574(arg0 + 1);
			int var32 = field1353.method535(0, var31 / 65536.0F);
			int var33 = field1353.method535(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1357[var32 + var34] * (long) PXSNRSMR.field1267 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1357[var32 + var34 - var37 - 1] * (long) PXSNRSMR.field1265[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1357[var34 - var38 - 1] * (long) PXSNRSMR.field1265[1][var38] >> 16);
					}

					field1357[var34] = var36;
					var31 = field1354.method574(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1357[var32 + var34] * (long) PXSNRSMR.field1267 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1357[var32 + var34 - var42 - 1] * (long) PXSNRSMR.field1265[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1357[var34 - var43 - 1] * (long) PXSNRSMR.field1265[1][var43] >> 16);
						}

						field1357[var34] = var41;
						var31 = field1354.method574(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1353.method535(0, var31 / 65536.0F);
					var33 = field1353.method535(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1357[var32 + var34 - var45 - 1] * (long) PXSNRSMR.field1265[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1357[var34 - var46 - 1] * (long) PXSNRSMR.field1265[1][var46] >> 16);
					}

					field1357[var34] = var44;
					field1354.method574(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1357[var48] < -32768) {
				field1357[var48] = -32768;
			}

			if (field1357[var48] > 32767) {
				field1357[var48] = 32767;
			}
		}

		return field1357;
	}

	@ObfuscatedName("SURDYBBQ.a(IIII)I")
	public final int method569(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg2 == 2) {
			return field1359[arg0 & 0x7FFF] * arg1 >> 14;
		}

		if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg2 == 4) {
			return field1358[arg0 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("SURDYBBQ.a(ZLLZWRHABP;)V")
	public final void method570(LZWRHABP arg0) {
		field1340 = new TAISOUDS();
		field1340.method571(arg0);
		field1341 = new TAISOUDS();
		field1341.method571(arg0);
		int var2 = arg0.method463();
		if (var2 != 0) {
			arg0.field1139--;
			field1342 = new TAISOUDS();
			field1342.method571(arg0);
			field1343 = new TAISOUDS();
			field1343.method571(arg0);
		}

		int var3 = arg0.method463();
		if (var3 != 0) {
			arg0.field1139--;
			field1344 = new TAISOUDS();
			field1344.method571(arg0);
			field1345 = new TAISOUDS();
			field1345.method571(arg0);
		}

		int var4 = arg0.method463();
		if (var4 != 0) {
			arg0.field1139--;
			field1346 = new TAISOUDS();
			field1346.method571(arg0);
			field1347 = new TAISOUDS();
			field1347.method571(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method477();
			if (var6 == 0) {
				break;
			}

			field1348[var5] = var6;
			field1349[var5] = arg0.method476();
			field1350[var5] = arg0.method477();
		}

		field1351 = arg0.method477();
		field1352 = arg0.method477();
		field1355 = arg0.method465();
		field1356 = arg0.method465();
		field1353 = new PXSNRSMR();
		field1354 = new TAISOUDS();
		field1353.method536(arg0, field1354);
	}
}
