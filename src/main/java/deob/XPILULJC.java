package deob;

@ObfuscatedName("XPILULJC")
public class XPILULJC {

	@ObfuscatedName("XPILULJC.j")
	public int[] field1375 = new int[5];

	@ObfuscatedName("XPILULJC.k")
	public int[] field1376 = new int[5];

	@ObfuscatedName("XPILULJC.l")
	public int[] field1377 = new int[5];

	@ObfuscatedName("XPILULJC.n")
	public int field1379 = 100;

	@ObfuscatedName("XPILULJC.q")
	public int field1382 = 500;

	@ObfuscatedName("XPILULJC.v")
	public static int[] field1387 = new int[5];

	@ObfuscatedName("XPILULJC.w")
	public static int[] field1388 = new int[5];

	@ObfuscatedName("XPILULJC.x")
	public static int[] field1389 = new int[5];

	@ObfuscatedName("XPILULJC.y")
	public static int[] field1390 = new int[5];

	@ObfuscatedName("XPILULJC.z")
	public static int[] field1391 = new int[5];

	@ObfuscatedName("XPILULJC.m")
	public int field1378;

	@ObfuscatedName("XPILULJC.r")
	public int field1383;

	@ObfuscatedName("XPILULJC.o")
	public DQYHQSPL field1380;

	@ObfuscatedName("XPILULJC.b")
	public RSNWTZPO field1367;

	@ObfuscatedName("XPILULJC.c")
	public RSNWTZPO field1368;

	@ObfuscatedName("XPILULJC.d")
	public RSNWTZPO field1369;

	@ObfuscatedName("XPILULJC.e")
	public RSNWTZPO field1370;

	@ObfuscatedName("XPILULJC.f")
	public RSNWTZPO field1371;

	@ObfuscatedName("XPILULJC.g")
	public RSNWTZPO field1372;

	@ObfuscatedName("XPILULJC.h")
	public RSNWTZPO field1373;

	@ObfuscatedName("XPILULJC.i")
	public RSNWTZPO field1374;

	@ObfuscatedName("XPILULJC.p")
	public RSNWTZPO field1381;

	@ObfuscatedName("XPILULJC.s")
	public static int[] field1384;

	@ObfuscatedName("XPILULJC.t")
	public static int[] field1385;

	@ObfuscatedName("XPILULJC.u")
	public static int[] field1386;

	@ObfuscatedName("XPILULJC.a()V")
	public static final void method522() {
		field1385 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1385[var0] = 1;
			} else {
				field1385[var0] = -1;
			}
		}

		field1386 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1386[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1384 = new int[220500];
	}

	@ObfuscatedName("XPILULJC.a(II)[I")
	public final int[] method523(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1384[var3] = 0;
		}

		if (arg1 < 10) {
			return field1384;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1367.method467();
		field1368.method467();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1369 != null) {
			field1369.method467();
			field1370.method467();
			var6 = (int) ((field1369.field1206 - field1369.field1205) * 32.768D / var4);
			var7 = (int) (field1369.field1205 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1371 != null) {
			field1371.method467();
			field1372.method467();
			var9 = (int) ((field1371.field1206 - field1371.field1205) * 32.768D / var4);
			var10 = (int) (field1371.field1205 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1375[var12] != 0) {
				field1387[var12] = 0;
				field1388[var12] = (int) (field1377[var12] * var4);
				field1389[var12] = (field1375[var12] << 14) / 100;
				field1390[var12] = (int) ((field1367.field1206 - field1367.field1205) * 32.768D * Math.pow(1.0057929410678534D, field1376[var12]) / var4);
				field1391[var12] = (int) (field1367.field1205 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1367.method468(arg0);
			int var15 = field1368.method468(arg0);

			if (field1369 != null) {
				int var16 = field1369.method468(arg0);
				int var17 = field1370.method468(arg0);
				var14 += method524(var8, field1369.field1207, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1371 != null) {
				int var18 = field1371.method468(arg0);
				int var19 = field1372.method468(arg0);
				var15 = var15 * ((method524(var11, field1371.field1207, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1375[var20] != 0) {
					int var21 = field1388[var20] + var13;
					if (var21 < arg0) {
						field1384[var21] += method524(field1387[var20], field1367.field1207, field1389[var20] * var15 >> 15);
						field1387[var20] += (field1390[var20] * var14 >> 16) + field1391[var20];
					}
				}
			}
		}

		if (field1373 != null) {
			field1373.method467();
			field1374.method467();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1373.method468(arg0);
				int var27 = field1374.method468(arg0);
				int var28;
				if (var24) {
					var28 = ((field1373.field1206 - field1373.field1205) * var26 >> 8) + field1373.field1205;
				} else {
					var28 = ((field1373.field1206 - field1373.field1205) * var27 >> 8) + field1373.field1205;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1384[var25] = 0;
				}
			}
		}

		if (field1378 > 0 && field1379 > 0) {
			int var29 = (int) (field1378 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1384[var30] += field1384[var30 - var29] * field1379 / 100;
			}
		}

		if (field1380.field681[0] > 0 || field1380.field681[1] > 0) {
			field1381.method467();
			int var31 = field1381.method468(arg0 + 1);
			int var32 = field1380.method245(0, var31 / 65536.0F);
			int var33 = field1380.method245(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1384[var32 + var34] * (long) DQYHQSPL.field688 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1384[var32 + var34 - var37 - 1] * (long) DQYHQSPL.field686[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1384[var34 - var38 - 1] * (long) DQYHQSPL.field686[1][var38] >> 16);
					}

					field1384[var34] = var36;
					var31 = field1381.method468(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1384[var32 + var34] * (long) DQYHQSPL.field688 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1384[var32 + var34 - var42 - 1] * (long) DQYHQSPL.field686[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1384[var34 - var43 - 1] * (long) DQYHQSPL.field686[1][var43] >> 16);
						}

						field1384[var34] = var41;
						var31 = field1381.method468(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1380.method245(0, var31 / 65536.0F);
					var33 = field1380.method245(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1384[var32 + var34 - var45 - 1] * (long) DQYHQSPL.field686[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1384[var34 - var46 - 1] * (long) DQYHQSPL.field686[1][var46] >> 16);
					}

					field1384[var34] = var44;
					field1381.method468(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1384[var48] < -32768) {
				field1384[var48] = -32768;
			}

			if (field1384[var48] > 32767) {
				field1384[var48] = 32767;
			}
		}

		return field1384;
	}

	@ObfuscatedName("XPILULJC.a(IIII)I")
	public final int method524(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field1386[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field1385[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("XPILULJC.a(ILINLHDAGO;)V")
	public final void method525(INLHDAGO arg0) {
		field1367 = new RSNWTZPO();
		field1367.method465(arg0);
		field1368 = new RSNWTZPO();
		field1368.method465(arg0);
		int var2 = arg0.method308();
		if (var2 != 0) {
			arg0.field969--;
			field1369 = new RSNWTZPO();
			field1369.method465(arg0);
			field1370 = new RSNWTZPO();
			field1370.method465(arg0);
		}

		int var3 = arg0.method308();
		if (var3 != 0) {
			arg0.field969--;
			field1371 = new RSNWTZPO();
			field1371.method465(arg0);
			field1372 = new RSNWTZPO();
			field1372.method465(arg0);
		}

		int var4 = arg0.method308();
		if (var4 != 0) {
			arg0.field969--;
			field1373 = new RSNWTZPO();
			field1373.method465(arg0);
			field1374 = new RSNWTZPO();
			field1374.method465(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method322();
			if (var6 == 0) {
				break;
			}

			field1375[var5] = var6;
			field1376[var5] = arg0.method321();
			field1377[var5] = arg0.method322();
		}

		field1378 = arg0.method322();
		field1379 = arg0.method322();
		field1382 = arg0.method310();
		field1383 = arg0.method310();
		field1380 = new DQYHQSPL();
		field1381 = new RSNWTZPO();
		field1380.method246(field1381, arg0);
	}
}
