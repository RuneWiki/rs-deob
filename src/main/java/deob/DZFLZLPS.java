package deob;

@ObfuscatedName("DZFLZLPS")
public class DZFLZLPS {

	@ObfuscatedName("DZFLZLPS.k")
	public int[] field610 = new int[5];

	@ObfuscatedName("DZFLZLPS.l")
	public int[] field611 = new int[5];

	@ObfuscatedName("DZFLZLPS.m")
	public int[] field612 = new int[5];

	@ObfuscatedName("DZFLZLPS.o")
	public int field614 = 100;

	@ObfuscatedName("DZFLZLPS.r")
	public int field617 = 500;

	@ObfuscatedName("DZFLZLPS.w")
	public static int[] field622 = new int[5];

	@ObfuscatedName("DZFLZLPS.x")
	public static int[] field623 = new int[5];

	@ObfuscatedName("DZFLZLPS.y")
	public static int[] field624 = new int[5];

	@ObfuscatedName("DZFLZLPS.z")
	public static int[] field625 = new int[5];

	@ObfuscatedName("DZFLZLPS.A")
	public static int[] field626 = new int[5];

	@ObfuscatedName("DZFLZLPS.n")
	public int field613;

	@ObfuscatedName("DZFLZLPS.s")
	public int field618;

	@ObfuscatedName("DZFLZLPS.p")
	public DJKDKZEW field615;

	@ObfuscatedName("DZFLZLPS.c")
	public ENGZWEMK field602;

	@ObfuscatedName("DZFLZLPS.d")
	public ENGZWEMK field603;

	@ObfuscatedName("DZFLZLPS.e")
	public ENGZWEMK field604;

	@ObfuscatedName("DZFLZLPS.f")
	public ENGZWEMK field605;

	@ObfuscatedName("DZFLZLPS.g")
	public ENGZWEMK field606;

	@ObfuscatedName("DZFLZLPS.h")
	public ENGZWEMK field607;

	@ObfuscatedName("DZFLZLPS.i")
	public ENGZWEMK field608;

	@ObfuscatedName("DZFLZLPS.j")
	public ENGZWEMK field609;

	@ObfuscatedName("DZFLZLPS.q")
	public ENGZWEMK field616;

	@ObfuscatedName("DZFLZLPS.t")
	public static int[] field619;

	@ObfuscatedName("DZFLZLPS.u")
	public static int[] field620;

	@ObfuscatedName("DZFLZLPS.v")
	public static int[] field621;

	@ObfuscatedName("DZFLZLPS.a()V")
	public static final void method217() {
		field620 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field620[var0] = 1;
			} else {
				field620[var0] = -1;
			}
		}

		field621 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field621[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field619 = new int[220500];
	}

	@ObfuscatedName("DZFLZLPS.a(II)[I")
	public final int[] method218(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field619[var3] = 0;
		}

		if (arg1 < 10) {
			return field619;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field602.method223();
		field603.method223();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field604 != null) {
			field604.method223();
			field605.method223();
			var6 = (int) ((field604.field679 - field604.field678) * 32.768D / var4);
			var7 = (int) (field604.field678 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field606 != null) {
			field606.method223();
			field607.method223();
			var9 = (int) ((field606.field679 - field606.field678) * 32.768D / var4);
			var10 = (int) (field606.field678 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field610[var12] != 0) {
				field622[var12] = 0;
				field623[var12] = (int) (field612[var12] * var4);
				field624[var12] = (field610[var12] << 14) / 100;
				field625[var12] = (int) ((field602.field679 - field602.field678) * 32.768D * Math.pow(1.0057929410678534D, field611[var12]) / var4);
				field626[var12] = (int) (field602.field678 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field602.method224(arg0);
			int var15 = field603.method224(arg0);

			if (field604 != null) {
				int var16 = field604.method224(arg0);
				int var17 = field605.method224(arg0);
				var14 += method219(field604.field680, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field606 != null) {
				int var18 = field606.method224(arg0);
				int var19 = field607.method224(arg0);
				var15 = var15 * ((method219(field606.field680, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field610[var20] != 0) {
					int var21 = field623[var20] + var13;
					if (var21 < arg0) {
						field619[var21] += method219(field602.field680, field624[var20] * var15 >> 15, field622[var20]);
						field622[var20] += (field625[var20] * var14 >> 16) + field626[var20];
					}
				}
			}
		}

		if (field608 != null) {
			field608.method223();
			field609.method223();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field608.method224(arg0);
				int var27 = field609.method224(arg0);
				int var28;
				if (var24) {
					var28 = ((field608.field679 - field608.field678) * var26 >> 8) + field608.field678;
				} else {
					var28 = ((field608.field679 - field608.field678) * var27 >> 8) + field608.field678;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field619[var25] = 0;
				}
			}
		}

		if (field613 > 0 && field614 > 0) {
			int var29 = (int) (field613 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field619[var30] += field619[var30 - var29] * field614 / 100;
			}
		}

		if (field615.field577[0] > 0 || field615.field577[1] > 0) {
			field616.method223();
			int var31 = field616.method224(arg0 + 1);
			int var32 = field615.method212(var31 / 65536.0F, 0);
			int var33 = field615.method212(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field619[var32 + var34] * (long) DJKDKZEW.field584 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field619[var32 + var34 - var37 - 1] * (long) DJKDKZEW.field582[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field619[var34 - var38 - 1] * (long) DJKDKZEW.field582[1][var38] >> 16);
					}

					field619[var34] = var36;
					var31 = field616.method224(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field619[var32 + var34] * (long) DJKDKZEW.field584 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field619[var32 + var34 - var42 - 1] * (long) DJKDKZEW.field582[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field619[var34 - var43 - 1] * (long) DJKDKZEW.field582[1][var43] >> 16);
						}

						field619[var34] = var41;
						var31 = field616.method224(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field615.method212(var31 / 65536.0F, 0);
					var33 = field615.method212(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field619[var32 + var34 - var45 - 1] * (long) DJKDKZEW.field582[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field619[var34 - var46 - 1] * (long) DJKDKZEW.field582[1][var46] >> 16);
					}

					field619[var34] = var44;
					field616.method224(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field619[var48] < -32768) {
				field619[var48] = -32768;
			}

			if (field619[var48] > 32767) {
				field619[var48] = 32767;
			}
		}

		return field619;
	}

	@ObfuscatedName("DZFLZLPS.a(IIII)I")
	public final int method219(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field621[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field620[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("DZFLZLPS.a(LPKHWFJLM;Z)V")
	public final void method220(PKHWFJLM arg0) {
		field602 = new ENGZWEMK();
		field602.method221(arg0);
		field603 = new ENGZWEMK();
		field603.method221(arg0);
		int var2 = arg0.method330();
		if (var2 != 0) {
			arg0.field971--;
			field604 = new ENGZWEMK();
			field604.method221(arg0);
			field605 = new ENGZWEMK();
			field605.method221(arg0);
		}

		int var3 = arg0.method330();
		if (var3 != 0) {
			arg0.field971--;
			field606 = new ENGZWEMK();
			field606.method221(arg0);
			field607 = new ENGZWEMK();
			field607.method221(arg0);
		}

		int var4 = arg0.method330();
		if (var4 != 0) {
			arg0.field971--;
			field608 = new ENGZWEMK();
			field608.method221(arg0);
			field609 = new ENGZWEMK();
			field609.method221(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method344();
			if (var6 == 0) {
				break;
			}

			field610[var5] = var6;
			field611[var5] = arg0.method343();
			field612[var5] = arg0.method344();
		}

		field613 = arg0.method344();
		field614 = arg0.method344();
		field617 = arg0.method332();
		field618 = arg0.method332();
		field615 = new DJKDKZEW();
		field616 = new ENGZWEMK();
		field615.method213(field616, arg0);
	}
}
