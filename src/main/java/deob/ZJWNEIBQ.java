package deob;

@ObfuscatedName("ZJWNEIBQ")
public class ZJWNEIBQ {

	@ObfuscatedName("ZJWNEIBQ.j")
	public int[] field1500 = new int[5];

	@ObfuscatedName("ZJWNEIBQ.k")
	public int[] field1501 = new int[5];

	@ObfuscatedName("ZJWNEIBQ.l")
	public int[] field1502 = new int[5];

	@ObfuscatedName("ZJWNEIBQ.n")
	public int field1504 = 100;

	@ObfuscatedName("ZJWNEIBQ.q")
	public int field1507 = 500;

	@ObfuscatedName("ZJWNEIBQ.v")
	public static int[] field1512 = new int[5];

	@ObfuscatedName("ZJWNEIBQ.w")
	public static int[] field1513 = new int[5];

	@ObfuscatedName("ZJWNEIBQ.x")
	public static int[] field1514 = new int[5];

	@ObfuscatedName("ZJWNEIBQ.y")
	public static int[] field1515 = new int[5];

	@ObfuscatedName("ZJWNEIBQ.z")
	public static int[] field1516 = new int[5];

	@ObfuscatedName("ZJWNEIBQ.m")
	public int field1503;

	@ObfuscatedName("ZJWNEIBQ.r")
	public int field1508;

	@ObfuscatedName("ZJWNEIBQ.b")
	public HCHPPCNY field1492;

	@ObfuscatedName("ZJWNEIBQ.c")
	public HCHPPCNY field1493;

	@ObfuscatedName("ZJWNEIBQ.d")
	public HCHPPCNY field1494;

	@ObfuscatedName("ZJWNEIBQ.e")
	public HCHPPCNY field1495;

	@ObfuscatedName("ZJWNEIBQ.f")
	public HCHPPCNY field1496;

	@ObfuscatedName("ZJWNEIBQ.g")
	public HCHPPCNY field1497;

	@ObfuscatedName("ZJWNEIBQ.h")
	public HCHPPCNY field1498;

	@ObfuscatedName("ZJWNEIBQ.i")
	public HCHPPCNY field1499;

	@ObfuscatedName("ZJWNEIBQ.p")
	public HCHPPCNY field1506;

	@ObfuscatedName("ZJWNEIBQ.o")
	public PTIFANAY field1505;

	@ObfuscatedName("ZJWNEIBQ.s")
	public static int[] field1509;

	@ObfuscatedName("ZJWNEIBQ.t")
	public static int[] field1510;

	@ObfuscatedName("ZJWNEIBQ.u")
	public static int[] field1511;

	@ObfuscatedName("ZJWNEIBQ.a()V")
	public static final void method601() {
		field1510 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1510[var0] = 1;
			} else {
				field1510[var0] = -1;
			}
		}

		field1511 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1511[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1509 = new int[220500];
	}

	@ObfuscatedName("ZJWNEIBQ.a(II)[I")
	public final int[] method602(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1509[var3] = 0;
		}

		if (arg1 < 10) {
			return field1509;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1492.method318();
		field1493.method318();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1494 != null) {
			field1494.method318();
			field1495.method318();
			var6 = (int) ((field1494.field642 - field1494.field641) * 32.768D / var4);
			var7 = (int) (field1494.field641 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1496 != null) {
			field1496.method318();
			field1497.method318();
			var9 = (int) ((field1496.field642 - field1496.field641) * 32.768D / var4);
			var10 = (int) (field1496.field641 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1500[var12] != 0) {
				field1512[var12] = 0;
				field1513[var12] = (int) (field1502[var12] * var4);
				field1514[var12] = (field1500[var12] << 14) / 100;
				field1515[var12] = (int) ((field1492.field642 - field1492.field641) * 32.768D * Math.pow(1.0057929410678534D, field1501[var12]) / var4);
				field1516[var12] = (int) (field1492.field641 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1492.method319(arg0);
			int var15 = field1493.method319(arg0);

			if (field1494 != null) {
				int var16 = field1494.method319(arg0);
				int var17 = field1495.method319(arg0);
				var14 += method603(var17, var8, field1494.field643) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1496 != null) {
				int var18 = field1496.method319(arg0);
				int var19 = field1497.method319(arg0);
				var15 = var15 * ((method603(var19, var11, field1496.field643) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1500[var20] != 0) {
					int var21 = field1513[var20] + var13;
					if (var21 < arg0) {
						field1509[var21] += method603(field1514[var20] * var15 >> 15, field1512[var20], field1492.field643);
						field1512[var20] += (field1515[var20] * var14 >> 16) + field1516[var20];
					}
				}
			}
		}

		if (field1498 != null) {
			field1498.method318();
			field1499.method318();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1498.method319(arg0);
				int var27 = field1499.method319(arg0);
				int var28;
				if (var24) {
					var28 = ((field1498.field642 - field1498.field641) * var26 >> 8) + field1498.field641;
				} else {
					var28 = ((field1498.field642 - field1498.field641) * var27 >> 8) + field1498.field641;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1509[var25] = 0;
				}
			}
		}

		if (field1503 > 0 && field1504 > 0) {
			int var29 = (int) (field1503 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1509[var30] += field1509[var30 - var29] * field1504 / 100;
			}
		}

		if (field1505.field978[0] > 0 || field1505.field978[1] > 0) {
			field1506.method318();
			int var31 = field1506.method319(arg0 + 1);
			int var32 = field1505.method434(var31 / 65536.0F, 0);
			int var33 = field1505.method434(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1509[var32 + var34] * (long) PTIFANAY.field985 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1509[var32 + var34 - var37 - 1] * (long) PTIFANAY.field983[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1509[var34 - var38 - 1] * (long) PTIFANAY.field983[1][var38] >> 16);
					}

					field1509[var34] = var36;
					var31 = field1506.method319(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1509[var32 + var34] * (long) PTIFANAY.field985 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1509[var32 + var34 - var42 - 1] * (long) PTIFANAY.field983[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1509[var34 - var43 - 1] * (long) PTIFANAY.field983[1][var43] >> 16);
						}

						field1509[var34] = var41;
						var31 = field1506.method319(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1505.method434(var31 / 65536.0F, 0);
					var33 = field1505.method434(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1509[var32 + var34 - var45 - 1] * (long) PTIFANAY.field983[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1509[var34 - var46 - 1] * (long) PTIFANAY.field983[1][var46] >> 16);
					}

					field1509[var34] = var44;
					field1506.method319(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1509[var48] < -32768) {
				field1509[var48] = -32768;
			}

			if (field1509[var48] > 32767) {
				field1509[var48] = 32767;
			}
		}

		return field1509;
	}

	@ObfuscatedName("ZJWNEIBQ.a(IIII)I")
	public final int method603(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg2 == 2) {
			return field1511[arg1 & 0x7FFF] * arg0 >> 14;
		}

		if (arg2 == 3) {
			return ((arg1 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg2 == 4) {
			return field1510[arg1 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("ZJWNEIBQ.a(ILBSNPYLEV;)V")
	public final void method604(BSNPYLEV arg0) {
		field1492 = new HCHPPCNY();
		field1492.method316(arg0);
		field1493 = new HCHPPCNY();
		field1493.method316(arg0);
		int var2 = arg0.method47();
		if (var2 != 0) {
			arg0.field55--;
			field1494 = new HCHPPCNY();
			field1494.method316(arg0);
			field1495 = new HCHPPCNY();
			field1495.method316(arg0);
		}

		int var3 = arg0.method47();
		if (var3 != 0) {
			arg0.field55--;
			field1496 = new HCHPPCNY();
			field1496.method316(arg0);
			field1497 = new HCHPPCNY();
			field1497.method316(arg0);
		}

		int var4 = arg0.method47();
		if (var4 != 0) {
			arg0.field55--;
			field1498 = new HCHPPCNY();
			field1498.method316(arg0);
			field1499 = new HCHPPCNY();
			field1499.method316(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method61();
			if (var6 == 0) {
				break;
			}

			field1500[var5] = var6;
			field1501[var5] = arg0.method60();
			field1502[var5] = arg0.method61();
		}

		field1503 = arg0.method61();
		field1504 = arg0.method61();
		field1507 = arg0.method49();
		field1508 = arg0.method49();
		field1505 = new PTIFANAY();
		field1506 = new HCHPPCNY();
		field1505.method435(arg0, field1506);
	}
}
