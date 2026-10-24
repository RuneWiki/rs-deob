package deob;

@ObfuscatedName("XDUWEFUG")
public class XDUWEFUG {

	@ObfuscatedName("XDUWEFUG.j")
	public int[] field1395 = new int[5];

	@ObfuscatedName("XDUWEFUG.k")
	public int[] field1396 = new int[5];

	@ObfuscatedName("XDUWEFUG.l")
	public int[] field1397 = new int[5];

	@ObfuscatedName("XDUWEFUG.n")
	public int field1399 = 100;

	@ObfuscatedName("XDUWEFUG.q")
	public int field1402 = 500;

	@ObfuscatedName("XDUWEFUG.v")
	public static int[] field1407 = new int[5];

	@ObfuscatedName("XDUWEFUG.w")
	public static int[] field1408 = new int[5];

	@ObfuscatedName("XDUWEFUG.x")
	public static int[] field1409 = new int[5];

	@ObfuscatedName("XDUWEFUG.y")
	public static int[] field1410 = new int[5];

	@ObfuscatedName("XDUWEFUG.z")
	public static int[] field1411 = new int[5];

	@ObfuscatedName("XDUWEFUG.m")
	public int field1398;

	@ObfuscatedName("XDUWEFUG.r")
	public int field1403;

	@ObfuscatedName("XDUWEFUG.o")
	public BVZJQTSH field1400;

	@ObfuscatedName("XDUWEFUG.b")
	public LMFHFXBO field1387;

	@ObfuscatedName("XDUWEFUG.c")
	public LMFHFXBO field1388;

	@ObfuscatedName("XDUWEFUG.d")
	public LMFHFXBO field1389;

	@ObfuscatedName("XDUWEFUG.e")
	public LMFHFXBO field1390;

	@ObfuscatedName("XDUWEFUG.f")
	public LMFHFXBO field1391;

	@ObfuscatedName("XDUWEFUG.g")
	public LMFHFXBO field1392;

	@ObfuscatedName("XDUWEFUG.h")
	public LMFHFXBO field1393;

	@ObfuscatedName("XDUWEFUG.i")
	public LMFHFXBO field1394;

	@ObfuscatedName("XDUWEFUG.p")
	public LMFHFXBO field1401;

	@ObfuscatedName("XDUWEFUG.s")
	public static int[] field1404;

	@ObfuscatedName("XDUWEFUG.t")
	public static int[] field1405;

	@ObfuscatedName("XDUWEFUG.u")
	public static int[] field1406;

	@ObfuscatedName("XDUWEFUG.a()V")
	public static final void method552() {
		field1405 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1405[var0] = 1;
			} else {
				field1405[var0] = -1;
			}
		}

		field1406 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1406[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1404 = new int[220500];
	}

	@ObfuscatedName("XDUWEFUG.a(II)[I")
	public final int[] method553(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1404[var3] = 0;
		}

		if (arg1 < 10) {
			return field1404;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1387.method358();
		field1388.method358();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1389 != null) {
			field1389.method358();
			field1390.method358();
			var6 = (int) ((field1389.field994 - field1389.field993) * 32.768D / var4);
			var7 = (int) (field1389.field993 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1391 != null) {
			field1391.method358();
			field1392.method358();
			var9 = (int) ((field1391.field994 - field1391.field993) * 32.768D / var4);
			var10 = (int) (field1391.field993 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1395[var12] != 0) {
				field1407[var12] = 0;
				field1408[var12] = (int) (field1397[var12] * var4);
				field1409[var12] = (field1395[var12] << 14) / 100;
				field1410[var12] = (int) ((field1387.field994 - field1387.field993) * 32.768D * Math.pow(1.0057929410678534D, field1396[var12]) / var4);
				field1411[var12] = (int) (field1387.field993 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1387.method359(arg0);
			int var15 = field1388.method359(arg0);

			if (field1389 != null) {
				int var16 = field1389.method359(arg0);
				int var17 = field1390.method359(arg0);
				var14 += method554(var8, field1389.field995, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1391 != null) {
				int var18 = field1391.method359(arg0);
				int var19 = field1392.method359(arg0);
				var15 = var15 * ((method554(var11, field1391.field995, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1395[var20] != 0) {
					int var21 = field1408[var20] + var13;
					if (var21 < arg0) {
						field1404[var21] += method554(field1407[var20], field1387.field995, field1409[var20] * var15 >> 15);
						field1407[var20] += (field1410[var20] * var14 >> 16) + field1411[var20];
					}
				}
			}
		}

		if (field1393 != null) {
			field1393.method358();
			field1394.method358();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1393.method359(arg0);
				int var27 = field1394.method359(arg0);
				int var28;
				if (var24) {
					var28 = ((field1393.field994 - field1393.field993) * var26 >> 8) + field1393.field993;
				} else {
					var28 = ((field1393.field994 - field1393.field993) * var27 >> 8) + field1393.field993;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1404[var25] = 0;
				}
			}
		}

		if (field1398 > 0 && field1399 > 0) {
			int var29 = (int) (field1398 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1404[var30] += field1404[var30 - var29] * field1399 / 100;
			}
		}

		if (field1400.field54[0] > 0 || field1400.field54[1] > 0) {
			field1401.method358();
			int var31 = field1401.method359(arg0 + 1);
			int var32 = field1400.method25(var31 / 65536.0F, 0);
			int var33 = field1400.method25(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1404[var32 + var34] * (long) BVZJQTSH.field61 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1404[var32 + var34 - var37 - 1] * (long) BVZJQTSH.field59[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1404[var34 - var38 - 1] * (long) BVZJQTSH.field59[1][var38] >> 16);
					}

					field1404[var34] = var36;
					var31 = field1401.method359(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1404[var32 + var34] * (long) BVZJQTSH.field61 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1404[var32 + var34 - var42 - 1] * (long) BVZJQTSH.field59[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1404[var34 - var43 - 1] * (long) BVZJQTSH.field59[1][var43] >> 16);
						}

						field1404[var34] = var41;
						var31 = field1401.method359(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1400.method25(var31 / 65536.0F, 0);
					var33 = field1400.method25(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1404[var32 + var34 - var45 - 1] * (long) BVZJQTSH.field59[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1404[var34 - var46 - 1] * (long) BVZJQTSH.field59[1][var46] >> 16);
					}

					field1404[var34] = var44;
					field1401.method359(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1404[var48] < -32768) {
				field1404[var48] = -32768;
			}

			if (field1404[var48] > 32767) {
				field1404[var48] = 32767;
			}
		}

		return field1404;
	}

	@ObfuscatedName("XDUWEFUG.a(IIIB)I")
	public final int method554(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field1406[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field1405[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("XDUWEFUG.a(LMNKDCXXG;I)V")
	public final void method555(MNKDCXXG arg0) {
		field1387 = new LMFHFXBO();
		field1387.method356(arg0);
		field1388 = new LMFHFXBO();
		field1388.method356(arg0);
		int var2 = arg0.method386();
		if (var2 != 0) {
			arg0.field1055--;
			field1389 = new LMFHFXBO();
			field1389.method356(arg0);
			field1390 = new LMFHFXBO();
			field1390.method356(arg0);
		}

		int var3 = arg0.method386();
		if (var3 != 0) {
			arg0.field1055--;
			field1391 = new LMFHFXBO();
			field1391.method356(arg0);
			field1392 = new LMFHFXBO();
			field1392.method356(arg0);
		}

		int var4 = arg0.method386();
		if (var4 != 0) {
			arg0.field1055--;
			field1393 = new LMFHFXBO();
			field1393.method356(arg0);
			field1394 = new LMFHFXBO();
			field1394.method356(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method400();
			if (var6 == 0) {
				break;
			}

			field1395[var5] = var6;
			field1396[var5] = arg0.method399();
			field1397[var5] = arg0.method400();
		}

		field1398 = arg0.method400();
		field1399 = arg0.method400();
		field1402 = arg0.method388();
		field1403 = arg0.method388();
		field1400 = new BVZJQTSH();
		field1401 = new LMFHFXBO();
		field1400.method26(arg0, field1401);
	}
}
