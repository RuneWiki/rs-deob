package deob;

@ObfuscatedName("YXUDALYQ")
public class YXUDALYQ {

	@ObfuscatedName("YXUDALYQ.j")
	public int[] field1459 = new int[5];

	@ObfuscatedName("YXUDALYQ.k")
	public int[] field1460 = new int[5];

	@ObfuscatedName("YXUDALYQ.l")
	public int[] field1461 = new int[5];

	@ObfuscatedName("YXUDALYQ.n")
	public int field1463 = 100;

	@ObfuscatedName("YXUDALYQ.q")
	public int field1466 = 500;

	@ObfuscatedName("YXUDALYQ.v")
	public static int[] field1471 = new int[5];

	@ObfuscatedName("YXUDALYQ.w")
	public static int[] field1472 = new int[5];

	@ObfuscatedName("YXUDALYQ.x")
	public static int[] field1473 = new int[5];

	@ObfuscatedName("YXUDALYQ.y")
	public static int[] field1474 = new int[5];

	@ObfuscatedName("YXUDALYQ.z")
	public static int[] field1475 = new int[5];

	@ObfuscatedName("YXUDALYQ.m")
	public int field1462;

	@ObfuscatedName("YXUDALYQ.r")
	public int field1467;

	@ObfuscatedName("YXUDALYQ.b")
	public JZEFIVMF field1451;

	@ObfuscatedName("YXUDALYQ.c")
	public JZEFIVMF field1452;

	@ObfuscatedName("YXUDALYQ.d")
	public JZEFIVMF field1453;

	@ObfuscatedName("YXUDALYQ.e")
	public JZEFIVMF field1454;

	@ObfuscatedName("YXUDALYQ.f")
	public JZEFIVMF field1455;

	@ObfuscatedName("YXUDALYQ.g")
	public JZEFIVMF field1456;

	@ObfuscatedName("YXUDALYQ.h")
	public JZEFIVMF field1457;

	@ObfuscatedName("YXUDALYQ.i")
	public JZEFIVMF field1458;

	@ObfuscatedName("YXUDALYQ.p")
	public JZEFIVMF field1465;

	@ObfuscatedName("YXUDALYQ.o")
	public XALWVYUP field1464;

	@ObfuscatedName("YXUDALYQ.s")
	public static int[] field1468;

	@ObfuscatedName("YXUDALYQ.t")
	public static int[] field1469;

	@ObfuscatedName("YXUDALYQ.u")
	public static int[] field1470;

	@ObfuscatedName("YXUDALYQ.a()V")
	public static final void method572() {
		field1469 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1469[var0] = 1;
			} else {
				field1469[var0] = -1;
			}
		}

		field1470 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1470[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1468 = new int[220500];
	}

	@ObfuscatedName("YXUDALYQ.a(II)[I")
	public final int[] method573(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1468[var3] = 0;
		}

		if (arg1 < 10) {
			return field1468;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1451.method311();
		field1452.method311();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1453 != null) {
			field1453.method311();
			field1454.method311();
			var6 = (int) ((field1453.field649 - field1453.field648) * 32.768D / var4);
			var7 = (int) (field1453.field648 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1455 != null) {
			field1455.method311();
			field1456.method311();
			var9 = (int) ((field1455.field649 - field1455.field648) * 32.768D / var4);
			var10 = (int) (field1455.field648 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1459[var12] != 0) {
				field1471[var12] = 0;
				field1472[var12] = (int) (field1461[var12] * var4);
				field1473[var12] = (field1459[var12] << 14) / 100;
				field1474[var12] = (int) ((field1451.field649 - field1451.field648) * 32.768D * Math.pow(1.0057929410678534D, field1460[var12]) / var4);
				field1475[var12] = (int) (field1451.field648 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1451.method312(arg0);
			int var15 = field1452.method312(arg0);

			if (field1453 != null) {
				int var16 = field1453.method312(arg0);
				int var17 = field1454.method312(arg0);
				var14 += method574(var17, field1453.field650, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1455 != null) {
				int var18 = field1455.method312(arg0);
				int var19 = field1456.method312(arg0);
				var15 = var15 * ((method574(var19, field1455.field650, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1459[var20] != 0) {
					int var21 = field1472[var20] + var13;
					if (var21 < arg0) {
						field1468[var21] += method574(field1473[var20] * var15 >> 15, field1451.field650, field1471[var20]);
						field1471[var20] += (field1474[var20] * var14 >> 16) + field1475[var20];
					}
				}
			}
		}

		if (field1457 != null) {
			field1457.method311();
			field1458.method311();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1457.method312(arg0);
				int var27 = field1458.method312(arg0);
				int var28;
				if (var24) {
					var28 = ((field1457.field649 - field1457.field648) * var26 >> 8) + field1457.field648;
				} else {
					var28 = ((field1457.field649 - field1457.field648) * var27 >> 8) + field1457.field648;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1468[var25] = 0;
				}
			}
		}

		if (field1462 > 0 && field1463 > 0) {
			int var29 = (int) (field1462 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1468[var30] += field1468[var30 - var29] * field1463 / 100;
			}
		}

		if (field1464.field1313[0] > 0 || field1464.field1313[1] > 0) {
			field1465.method311();
			int var31 = field1465.method312(arg0 + 1);
			int var32 = field1464.method484(0, var31 / 65536.0F);
			int var33 = field1464.method484(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1468[var32 + var34] * (long) XALWVYUP.field1320 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1468[var32 + var34 - var37 - 1] * (long) XALWVYUP.field1318[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1468[var34 - var38 - 1] * (long) XALWVYUP.field1318[1][var38] >> 16);
					}

					field1468[var34] = var36;
					var31 = field1465.method312(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1468[var32 + var34] * (long) XALWVYUP.field1320 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1468[var32 + var34 - var42 - 1] * (long) XALWVYUP.field1318[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1468[var34 - var43 - 1] * (long) XALWVYUP.field1318[1][var43] >> 16);
						}

						field1468[var34] = var41;
						var31 = field1465.method312(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1464.method484(0, var31 / 65536.0F);
					var33 = field1464.method484(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1468[var32 + var34 - var45 - 1] * (long) XALWVYUP.field1318[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1468[var34 - var46 - 1] * (long) XALWVYUP.field1318[1][var46] >> 16);
					}

					field1468[var34] = var44;
					field1465.method312(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1468[var48] < -32768) {
				field1468[var48] = -32768;
			}

			if (field1468[var48] > 32767) {
				field1468[var48] = 32767;
			}
		}

		return field1468;
	}

	@ObfuscatedName("YXUDALYQ.a(BIII)I")
	public final int method574(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field1470[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field1469[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("YXUDALYQ.a(LFTMSICIZ;I)V")
	public final void method575(FTMSICIZ arg0) {
		field1451 = new JZEFIVMF();
		field1451.method309(arg0);
		field1452 = new JZEFIVMF();
		field1452.method309(arg0);
		int var2 = arg0.method213();
		if (var2 != 0) {
			arg0.field535--;
			field1453 = new JZEFIVMF();
			field1453.method309(arg0);
			field1454 = new JZEFIVMF();
			field1454.method309(arg0);
		}

		int var3 = arg0.method213();
		if (var3 != 0) {
			arg0.field535--;
			field1455 = new JZEFIVMF();
			field1455.method309(arg0);
			field1456 = new JZEFIVMF();
			field1456.method309(arg0);
		}

		int var4 = arg0.method213();
		if (var4 != 0) {
			arg0.field535--;
			field1457 = new JZEFIVMF();
			field1457.method309(arg0);
			field1458 = new JZEFIVMF();
			field1458.method309(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method227();
			if (var6 == 0) {
				break;
			}

			field1459[var5] = var6;
			field1460[var5] = arg0.method226();
			field1461[var5] = arg0.method227();
		}

		field1462 = arg0.method227();
		field1463 = arg0.method227();
		field1466 = arg0.method215();
		field1467 = arg0.method215();
		field1464 = new XALWVYUP();
		field1465 = new JZEFIVMF();
		field1464.method485(field1465, arg0);
	}
}
