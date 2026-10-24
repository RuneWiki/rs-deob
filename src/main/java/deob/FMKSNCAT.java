package deob;

@ObfuscatedName("FMKSNCAT")
public class FMKSNCAT {

	@ObfuscatedName("FMKSNCAT.i")
	public int[] field605 = new int[5];

	@ObfuscatedName("FMKSNCAT.j")
	public int[] field606 = new int[5];

	@ObfuscatedName("FMKSNCAT.k")
	public int[] field607 = new int[5];

	@ObfuscatedName("FMKSNCAT.m")
	public int field609 = 100;

	@ObfuscatedName("FMKSNCAT.p")
	public int field612 = 500;

	@ObfuscatedName("FMKSNCAT.u")
	public static int[] field617 = new int[5];

	@ObfuscatedName("FMKSNCAT.v")
	public static int[] field618 = new int[5];

	@ObfuscatedName("FMKSNCAT.w")
	public static int[] field619 = new int[5];

	@ObfuscatedName("FMKSNCAT.x")
	public static int[] field620 = new int[5];

	@ObfuscatedName("FMKSNCAT.y")
	public static int[] field621 = new int[5];

	@ObfuscatedName("FMKSNCAT.l")
	public int field608;

	@ObfuscatedName("FMKSNCAT.q")
	public int field613;

	@ObfuscatedName("FMKSNCAT.a")
	public FGSQUADF field597;

	@ObfuscatedName("FMKSNCAT.b")
	public FGSQUADF field598;

	@ObfuscatedName("FMKSNCAT.c")
	public FGSQUADF field599;

	@ObfuscatedName("FMKSNCAT.d")
	public FGSQUADF field600;

	@ObfuscatedName("FMKSNCAT.e")
	public FGSQUADF field601;

	@ObfuscatedName("FMKSNCAT.f")
	public FGSQUADF field602;

	@ObfuscatedName("FMKSNCAT.g")
	public FGSQUADF field603;

	@ObfuscatedName("FMKSNCAT.h")
	public FGSQUADF field604;

	@ObfuscatedName("FMKSNCAT.o")
	public FGSQUADF field611;

	@ObfuscatedName("FMKSNCAT.n")
	public ZOMUFNUM field610;

	@ObfuscatedName("FMKSNCAT.r")
	public static int[] field614;

	@ObfuscatedName("FMKSNCAT.s")
	public static int[] field615;

	@ObfuscatedName("FMKSNCAT.t")
	public static int[] field616;

	@ObfuscatedName("FMKSNCAT.a()V")
	public static final void method193() {
		field615 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field615[var0] = 1;
			} else {
				field615[var0] = -1;
			}
		}

		field616 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field616[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field614 = new int[220500];
	}

	@ObfuscatedName("FMKSNCAT.a(II)[I")
	public final int[] method194(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field614[var3] = 0;
		}

		if (arg1 < 10) {
			return field614;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field597.method178();
		field598.method178();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field599 != null) {
			field599.method178();
			field600.method178();
			var6 = (int) ((field599.field583 - field599.field582) * 32.768D / var4);
			var7 = (int) (field599.field582 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field601 != null) {
			field601.method178();
			field602.method178();
			var9 = (int) ((field601.field583 - field601.field582) * 32.768D / var4);
			var10 = (int) (field601.field582 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field605[var12] != 0) {
				field617[var12] = 0;
				field618[var12] = (int) (field607[var12] * var4);
				field619[var12] = (field605[var12] << 14) / 100;
				field620[var12] = (int) ((field597.field583 - field597.field582) * 32.768D * Math.pow(1.0057929410678534D, field606[var12]) / var4);
				field621[var12] = (int) (field597.field582 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field597.method179(arg0);
			int var15 = field598.method179(arg0);

			if (field599 != null) {
				int var16 = field599.method179(arg0);
				int var17 = field600.method179(arg0);
				var14 += method195(field599.field584, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field601 != null) {
				int var18 = field601.method179(arg0);
				int var19 = field602.method179(arg0);
				var15 = var15 * ((method195(field601.field584, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field605[var20] != 0) {
					int var21 = field618[var20] + var13;
					if (var21 < arg0) {
						field614[var21] += method195(field597.field584, field619[var20] * var15 >> 15, field617[var20]);
						field617[var20] += (field620[var20] * var14 >> 16) + field621[var20];
					}
				}
			}
		}

		if (field603 != null) {
			field603.method178();
			field604.method178();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field603.method179(arg0);
				int var27 = field604.method179(arg0);
				int var28;
				if (var24) {
					var28 = ((field603.field583 - field603.field582) * var26 >> 8) + field603.field582;
				} else {
					var28 = ((field603.field583 - field603.field582) * var27 >> 8) + field603.field582;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field614[var25] = 0;
				}
			}
		}

		if (field608 > 0 && field609 > 0) {
			int var29 = (int) (field608 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field614[var30] += field614[var30 - var29] * field609 / 100;
			}
		}

		if (field610.field1486[0] > 0 || field610.field1486[1] > 0) {
			field611.method178();
			int var31 = field611.method179(arg0 + 1);
			int var32 = field610.method586(0, var31 / 65536.0F);
			int var33 = field610.method586(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field614[var32 + var34] * (long) ZOMUFNUM.field1493 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field614[var32 + var34 - var37 - 1] * (long) ZOMUFNUM.field1491[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field614[var34 - var38 - 1] * (long) ZOMUFNUM.field1491[1][var38] >> 16);
					}

					field614[var34] = var36;
					var31 = field611.method179(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field614[var32 + var34] * (long) ZOMUFNUM.field1493 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field614[var32 + var34 - var42 - 1] * (long) ZOMUFNUM.field1491[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field614[var34 - var43 - 1] * (long) ZOMUFNUM.field1491[1][var43] >> 16);
						}

						field614[var34] = var41;
						var31 = field611.method179(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field610.method586(0, var31 / 65536.0F);
					var33 = field610.method586(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field614[var32 + var34 - var45 - 1] * (long) ZOMUFNUM.field1491[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field614[var34 - var46 - 1] * (long) ZOMUFNUM.field1491[1][var46] >> 16);
					}

					field614[var34] = var44;
					field611.method179(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field614[var48] < -32768) {
				field614[var48] = -32768;
			}

			if (field614[var48] > 32767) {
				field614[var48] = 32767;
			}
		}

		return field614;
	}

	@ObfuscatedName("FMKSNCAT.a(IIII)I")
	public final int method195(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field616[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field615[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("FMKSNCAT.a(BLNQUAUMDT;)V")
	public final void method196(NQUAUMDT arg0) {
		field597 = new FGSQUADF();
		field597.method176(arg0);
		field598 = new FGSQUADF();
		field598.method176(arg0);
		int var2 = arg0.method339();
		if (var2 != 0) {
			arg0.field929--;
			field599 = new FGSQUADF();
			field599.method176(arg0);
			field600 = new FGSQUADF();
			field600.method176(arg0);
		}

		int var3 = arg0.method339();
		if (var3 != 0) {
			arg0.field929--;
			field601 = new FGSQUADF();
			field601.method176(arg0);
			field602 = new FGSQUADF();
			field602.method176(arg0);
		}

		int var4 = arg0.method339();
		if (var4 != 0) {
			arg0.field929--;
			field603 = new FGSQUADF();
			field603.method176(arg0);
			field604 = new FGSQUADF();
			field604.method176(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method353();
			if (var6 == 0) {
				break;
			}

			field605[var5] = var6;
			field606[var5] = arg0.method352();
			field607[var5] = arg0.method353();
		}

		field608 = arg0.method353();
		field609 = arg0.method353();
		field612 = arg0.method341();
		field613 = arg0.method341();
		field610 = new ZOMUFNUM();
		field611 = new FGSQUADF();
		field610.method587(arg0, field611);
	}
}
