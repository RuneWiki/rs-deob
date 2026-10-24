package deob;

@ObfuscatedName("TDNGNEZO")
public class TDNGNEZO {

	@ObfuscatedName("TDNGNEZO.i")
	public int[] field1384 = new int[5];

	@ObfuscatedName("TDNGNEZO.j")
	public int[] field1385 = new int[5];

	@ObfuscatedName("TDNGNEZO.k")
	public int[] field1386 = new int[5];

	@ObfuscatedName("TDNGNEZO.m")
	public int field1388 = 100;

	@ObfuscatedName("TDNGNEZO.p")
	public int field1391 = 500;

	@ObfuscatedName("TDNGNEZO.u")
	public static int[] field1396 = new int[5];

	@ObfuscatedName("TDNGNEZO.v")
	public static int[] field1397 = new int[5];

	@ObfuscatedName("TDNGNEZO.w")
	public static int[] field1398 = new int[5];

	@ObfuscatedName("TDNGNEZO.x")
	public static int[] field1399 = new int[5];

	@ObfuscatedName("TDNGNEZO.y")
	public static int[] field1400 = new int[5];

	@ObfuscatedName("TDNGNEZO.l")
	public int field1387;

	@ObfuscatedName("TDNGNEZO.q")
	public int field1392;

	@ObfuscatedName("TDNGNEZO.n")
	public BVWZSTJJ field1389;

	@ObfuscatedName("TDNGNEZO.a")
	public TPZZASFL field1376;

	@ObfuscatedName("TDNGNEZO.b")
	public TPZZASFL field1377;

	@ObfuscatedName("TDNGNEZO.c")
	public TPZZASFL field1378;

	@ObfuscatedName("TDNGNEZO.d")
	public TPZZASFL field1379;

	@ObfuscatedName("TDNGNEZO.e")
	public TPZZASFL field1380;

	@ObfuscatedName("TDNGNEZO.f")
	public TPZZASFL field1381;

	@ObfuscatedName("TDNGNEZO.g")
	public TPZZASFL field1382;

	@ObfuscatedName("TDNGNEZO.h")
	public TPZZASFL field1383;

	@ObfuscatedName("TDNGNEZO.o")
	public TPZZASFL field1390;

	@ObfuscatedName("TDNGNEZO.r")
	public static int[] field1393;

	@ObfuscatedName("TDNGNEZO.s")
	public static int[] field1394;

	@ObfuscatedName("TDNGNEZO.t")
	public static int[] field1395;

	@ObfuscatedName("TDNGNEZO.a()V")
	public static final void method543() {
		field1394 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1394[var0] = 1;
			} else {
				field1394[var0] = -1;
			}
		}

		field1395 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1395[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1393 = new int[220500];
	}

	@ObfuscatedName("TDNGNEZO.a(II)[I")
	public final int[] method544(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1393[var3] = 0;
		}

		if (arg1 < 10) {
			return field1393;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1376.method572();
		field1377.method572();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1378 != null) {
			field1378.method572();
			field1379.method572();
			var6 = (int) ((field1378.field1429 - field1378.field1428) * 32.768D / var4);
			var7 = (int) (field1378.field1428 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1380 != null) {
			field1380.method572();
			field1381.method572();
			var9 = (int) ((field1380.field1429 - field1380.field1428) * 32.768D / var4);
			var10 = (int) (field1380.field1428 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1384[var12] != 0) {
				field1396[var12] = 0;
				field1397[var12] = (int) (field1386[var12] * var4);
				field1398[var12] = (field1384[var12] << 14) / 100;
				field1399[var12] = (int) ((field1376.field1429 - field1376.field1428) * 32.768D * Math.pow(1.0057929410678534D, field1385[var12]) / var4);
				field1400[var12] = (int) (field1376.field1428 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1376.method573(arg0);
			int var15 = field1377.method573(arg0);

			if (field1378 != null) {
				int var16 = field1378.method573(arg0);
				int var17 = field1379.method573(arg0);
				var14 += method545(var17, field1378.field1430, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1380 != null) {
				int var18 = field1380.method573(arg0);
				int var19 = field1381.method573(arg0);
				var15 = var15 * ((method545(var19, field1380.field1430, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1384[var20] != 0) {
					int var21 = field1397[var20] + var13;
					if (var21 < arg0) {
						field1393[var21] += method545(field1398[var20] * var15 >> 15, field1376.field1430, field1396[var20]);
						field1396[var20] += (field1399[var20] * var14 >> 16) + field1400[var20];
					}
				}
			}
		}

		if (field1382 != null) {
			field1382.method572();
			field1383.method572();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1382.method573(arg0);
				int var27 = field1383.method573(arg0);
				int var28;
				if (var24) {
					var28 = ((field1382.field1429 - field1382.field1428) * var26 >> 8) + field1382.field1428;
				} else {
					var28 = ((field1382.field1429 - field1382.field1428) * var27 >> 8) + field1382.field1428;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1393[var25] = 0;
				}
			}
		}

		if (field1387 > 0 && field1388 > 0) {
			int var29 = (int) (field1387 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1393[var30] += field1393[var30 - var29] * field1388 / 100;
			}
		}

		if (field1389.field101[0] > 0 || field1389.field101[1] > 0) {
			field1390.method572();
			int var31 = field1390.method573(arg0 + 1);
			int var32 = field1389.method46(var31 / 65536.0F, 0);
			int var33 = field1389.method46(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1393[var32 + var34] * (long) BVWZSTJJ.field108 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1393[var32 + var34 - var37 - 1] * (long) BVWZSTJJ.field106[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1393[var34 - var38 - 1] * (long) BVWZSTJJ.field106[1][var38] >> 16);
					}

					field1393[var34] = var36;
					var31 = field1390.method573(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1393[var32 + var34] * (long) BVWZSTJJ.field108 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1393[var32 + var34 - var42 - 1] * (long) BVWZSTJJ.field106[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1393[var34 - var43 - 1] * (long) BVWZSTJJ.field106[1][var43] >> 16);
						}

						field1393[var34] = var41;
						var31 = field1390.method573(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1389.method46(var31 / 65536.0F, 0);
					var33 = field1389.method46(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1393[var32 + var34 - var45 - 1] * (long) BVWZSTJJ.field106[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1393[var34 - var46 - 1] * (long) BVWZSTJJ.field106[1][var46] >> 16);
					}

					field1393[var34] = var44;
					field1390.method573(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1393[var48] < -32768) {
				field1393[var48] = -32768;
			}

			if (field1393[var48] > 32767) {
				field1393[var48] = 32767;
			}
		}

		return field1393;
	}

	@ObfuscatedName("TDNGNEZO.a(IZII)I")
	public final int method545(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field1395[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field1394[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("TDNGNEZO.a(ILMVHXDWGI;)V")
	public final void method546(MVHXDWGI arg0) {
		field1376 = new TPZZASFL();
		field1376.method570(arg0);
		field1377 = new TPZZASFL();
		field1377.method570(arg0);
		int var2 = arg0.method357();
		if (var2 != 0) {
			arg0.field1014--;
			field1378 = new TPZZASFL();
			field1378.method570(arg0);
			field1379 = new TPZZASFL();
			field1379.method570(arg0);
		}

		int var3 = arg0.method357();
		if (var3 != 0) {
			arg0.field1014--;
			field1380 = new TPZZASFL();
			field1380.method570(arg0);
			field1381 = new TPZZASFL();
			field1381.method570(arg0);
		}

		int var4 = arg0.method357();
		if (var4 != 0) {
			arg0.field1014--;
			field1382 = new TPZZASFL();
			field1382.method570(arg0);
			field1383 = new TPZZASFL();
			field1383.method570(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method371();
			if (var6 == 0) {
				break;
			}

			field1384[var5] = var6;
			field1385[var5] = arg0.method370();
			field1386[var5] = arg0.method371();
		}

		field1387 = arg0.method371();
		field1388 = arg0.method371();
		field1391 = arg0.method359();
		field1392 = arg0.method359();
		field1389 = new BVWZSTJJ();
		field1390 = new TPZZASFL();
		field1389.method47(field1390, arg0);
	}
}
