package deob;

@ObfuscatedName("ZOZPAWWH")
public class ZOZPAWWH {

	@ObfuscatedName("ZOZPAWWH.j")
	public int[] field1465 = new int[5];

	@ObfuscatedName("ZOZPAWWH.k")
	public int[] field1466 = new int[5];

	@ObfuscatedName("ZOZPAWWH.l")
	public int[] field1467 = new int[5];

	@ObfuscatedName("ZOZPAWWH.n")
	public int field1469 = 100;

	@ObfuscatedName("ZOZPAWWH.q")
	public int field1472 = 500;

	@ObfuscatedName("ZOZPAWWH.v")
	public static int[] field1477 = new int[5];

	@ObfuscatedName("ZOZPAWWH.w")
	public static int[] field1478 = new int[5];

	@ObfuscatedName("ZOZPAWWH.x")
	public static int[] field1479 = new int[5];

	@ObfuscatedName("ZOZPAWWH.y")
	public static int[] field1480 = new int[5];

	@ObfuscatedName("ZOZPAWWH.z")
	public static int[] field1481 = new int[5];

	@ObfuscatedName("ZOZPAWWH.m")
	public int field1468;

	@ObfuscatedName("ZOZPAWWH.r")
	public int field1473;

	@ObfuscatedName("ZOZPAWWH.o")
	public AWPNKCCI field1470;

	@ObfuscatedName("ZOZPAWWH.b")
	public LRDFYKJP field1457;

	@ObfuscatedName("ZOZPAWWH.c")
	public LRDFYKJP field1458;

	@ObfuscatedName("ZOZPAWWH.d")
	public LRDFYKJP field1459;

	@ObfuscatedName("ZOZPAWWH.e")
	public LRDFYKJP field1460;

	@ObfuscatedName("ZOZPAWWH.f")
	public LRDFYKJP field1461;

	@ObfuscatedName("ZOZPAWWH.g")
	public LRDFYKJP field1462;

	@ObfuscatedName("ZOZPAWWH.h")
	public LRDFYKJP field1463;

	@ObfuscatedName("ZOZPAWWH.i")
	public LRDFYKJP field1464;

	@ObfuscatedName("ZOZPAWWH.p")
	public LRDFYKJP field1471;

	@ObfuscatedName("ZOZPAWWH.s")
	public static int[] field1474;

	@ObfuscatedName("ZOZPAWWH.t")
	public static int[] field1475;

	@ObfuscatedName("ZOZPAWWH.u")
	public static int[] field1476;

	@ObfuscatedName("ZOZPAWWH.a()V")
	public static final void method588() {
		field1475 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1475[var0] = 1;
			} else {
				field1475[var0] = -1;
			}
		}

		field1476 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1476[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1474 = new int[220500];
	}

	@ObfuscatedName("ZOZPAWWH.a(II)[I")
	public final int[] method589(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1474[var3] = 0;
		}

		if (arg1 < 10) {
			return field1474;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1457.method263();
		field1458.method263();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1459 != null) {
			field1459.method263();
			field1460.method263();
			var6 = (int) ((field1459.field776 - field1459.field775) * 32.768D / var4);
			var7 = (int) (field1459.field775 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1461 != null) {
			field1461.method263();
			field1462.method263();
			var9 = (int) ((field1461.field776 - field1461.field775) * 32.768D / var4);
			var10 = (int) (field1461.field775 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1465[var12] != 0) {
				field1477[var12] = 0;
				field1478[var12] = (int) (field1467[var12] * var4);
				field1479[var12] = (field1465[var12] << 14) / 100;
				field1480[var12] = (int) ((field1457.field776 - field1457.field775) * 32.768D * Math.pow(1.0057929410678534D, field1466[var12]) / var4);
				field1481[var12] = (int) (field1457.field775 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1457.method264(arg0);
			int var15 = field1458.method264(arg0);

			if (field1459 != null) {
				int var16 = field1459.method264(arg0);
				int var17 = field1460.method264(arg0);
				var14 += method590(field1459.field777, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1461 != null) {
				int var18 = field1461.method264(arg0);
				int var19 = field1462.method264(arg0);
				var15 = var15 * ((method590(field1461.field777, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1465[var20] != 0) {
					int var21 = field1478[var20] + var13;
					if (var21 < arg0) {
						field1474[var21] += method590(field1457.field777, field1479[var20] * var15 >> 15, field1477[var20]);
						field1477[var20] += (field1480[var20] * var14 >> 16) + field1481[var20];
					}
				}
			}
		}

		if (field1463 != null) {
			field1463.method263();
			field1464.method263();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1463.method264(arg0);
				int var27 = field1464.method264(arg0);
				int var28;
				if (var24) {
					var28 = ((field1463.field776 - field1463.field775) * var26 >> 8) + field1463.field775;
				} else {
					var28 = ((field1463.field776 - field1463.field775) * var27 >> 8) + field1463.field775;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1474[var25] = 0;
				}
			}
		}

		if (field1468 > 0 && field1469 > 0) {
			int var29 = (int) (field1468 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1474[var30] += field1474[var30 - var29] * field1469 / 100;
			}
		}

		if (field1470.field17[0] > 0 || field1470.field17[1] > 0) {
			field1471.method263();
			int var31 = field1471.method264(arg0 + 1);
			int var32 = field1470.method19(var31 / 65536.0F, 0);
			int var33 = field1470.method19(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1474[var32 + var34] * (long) AWPNKCCI.field24 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1474[var32 + var34 - var37 - 1] * (long) AWPNKCCI.field22[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1474[var34 - var38 - 1] * (long) AWPNKCCI.field22[1][var38] >> 16);
					}

					field1474[var34] = var36;
					var31 = field1471.method264(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1474[var32 + var34] * (long) AWPNKCCI.field24 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1474[var32 + var34 - var42 - 1] * (long) AWPNKCCI.field22[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1474[var34 - var43 - 1] * (long) AWPNKCCI.field22[1][var43] >> 16);
						}

						field1474[var34] = var41;
						var31 = field1471.method264(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1470.method19(var31 / 65536.0F, 0);
					var33 = field1470.method19(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1474[var32 + var34 - var45 - 1] * (long) AWPNKCCI.field22[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1474[var34 - var46 - 1] * (long) AWPNKCCI.field22[1][var46] >> 16);
					}

					field1474[var34] = var44;
					field1471.method264(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1474[var48] < -32768) {
				field1474[var48] = -32768;
			}

			if (field1474[var48] > 32767) {
				field1474[var48] = 32767;
			}
		}

		return field1474;
	}

	@ObfuscatedName("ZOZPAWWH.a(IIBI)I")
	public final int method590(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field1476[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field1475[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("ZOZPAWWH.a(LMUKVLYLC;Z)V")
	public final void method591(MUKVLYLC arg0) {
		field1457 = new LRDFYKJP();
		field1457.method261(arg0);
		field1458 = new LRDFYKJP();
		field1458.method261(arg0);
		int var2 = arg0.method292();
		if (var2 != 0) {
			arg0.field812--;
			field1459 = new LRDFYKJP();
			field1459.method261(arg0);
			field1460 = new LRDFYKJP();
			field1460.method261(arg0);
		}

		int var3 = arg0.method292();
		if (var3 != 0) {
			arg0.field812--;
			field1461 = new LRDFYKJP();
			field1461.method261(arg0);
			field1462 = new LRDFYKJP();
			field1462.method261(arg0);
		}

		int var4 = arg0.method292();
		if (var4 != 0) {
			arg0.field812--;
			field1463 = new LRDFYKJP();
			field1463.method261(arg0);
			field1464 = new LRDFYKJP();
			field1464.method261(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method306();
			if (var6 == 0) {
				break;
			}

			field1465[var5] = var6;
			field1466[var5] = arg0.method305();
			field1467[var5] = arg0.method306();
		}

		field1468 = arg0.method306();
		field1469 = arg0.method306();
		field1472 = arg0.method294();
		field1473 = arg0.method294();
		field1470 = new AWPNKCCI();
		field1471 = new LRDFYKJP();
		field1470.method20(arg0, field1471);
	}
}
