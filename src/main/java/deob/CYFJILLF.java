package deob;

@ObfuscatedName("CYFJILLF")
public class CYFJILLF {

	@ObfuscatedName("CYFJILLF.j")
	public int[] field595 = new int[5];

	@ObfuscatedName("CYFJILLF.k")
	public int[] field596 = new int[5];

	@ObfuscatedName("CYFJILLF.l")
	public int[] field597 = new int[5];

	@ObfuscatedName("CYFJILLF.n")
	public int field599 = 100;

	@ObfuscatedName("CYFJILLF.q")
	public int field602 = 500;

	@ObfuscatedName("CYFJILLF.v")
	public static int[] field607 = new int[5];

	@ObfuscatedName("CYFJILLF.w")
	public static int[] field608 = new int[5];

	@ObfuscatedName("CYFJILLF.x")
	public static int[] field609 = new int[5];

	@ObfuscatedName("CYFJILLF.y")
	public static int[] field610 = new int[5];

	@ObfuscatedName("CYFJILLF.z")
	public static int[] field611 = new int[5];

	@ObfuscatedName("CYFJILLF.m")
	public int field598;

	@ObfuscatedName("CYFJILLF.r")
	public int field603;

	@ObfuscatedName("CYFJILLF.b")
	public RRWCTNMK field587;

	@ObfuscatedName("CYFJILLF.c")
	public RRWCTNMK field588;

	@ObfuscatedName("CYFJILLF.d")
	public RRWCTNMK field589;

	@ObfuscatedName("CYFJILLF.e")
	public RRWCTNMK field590;

	@ObfuscatedName("CYFJILLF.f")
	public RRWCTNMK field591;

	@ObfuscatedName("CYFJILLF.g")
	public RRWCTNMK field592;

	@ObfuscatedName("CYFJILLF.h")
	public RRWCTNMK field593;

	@ObfuscatedName("CYFJILLF.i")
	public RRWCTNMK field594;

	@ObfuscatedName("CYFJILLF.p")
	public RRWCTNMK field601;

	@ObfuscatedName("CYFJILLF.o")
	public UVAKRMXV field600;

	@ObfuscatedName("CYFJILLF.s")
	public static int[] field604;

	@ObfuscatedName("CYFJILLF.t")
	public static int[] field605;

	@ObfuscatedName("CYFJILLF.u")
	public static int[] field606;

	@ObfuscatedName("CYFJILLF.a()V")
	public static final void method182() {
		field605 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field605[var0] = 1;
			} else {
				field605[var0] = -1;
			}
		}

		field606 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field606[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field604 = new int[220500];
	}

	@ObfuscatedName("CYFJILLF.a(II)[I")
	public final int[] method183(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field604[var3] = 0;
		}

		if (arg1 < 10) {
			return field604;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field587.method445();
		field588.method445();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field589 != null) {
			field589.method445();
			field590.method445();
			var6 = (int) ((field589.field1152 - field589.field1151) * 32.768D / var4);
			var7 = (int) (field589.field1151 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field591 != null) {
			field591.method445();
			field592.method445();
			var9 = (int) ((field591.field1152 - field591.field1151) * 32.768D / var4);
			var10 = (int) (field591.field1151 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field595[var12] != 0) {
				field607[var12] = 0;
				field608[var12] = (int) (field597[var12] * var4);
				field609[var12] = (field595[var12] << 14) / 100;
				field610[var12] = (int) ((field587.field1152 - field587.field1151) * 32.768D * Math.pow(1.0057929410678534D, field596[var12]) / var4);
				field611[var12] = (int) (field587.field1151 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field587.method446(arg0);
			int var15 = field588.method446(arg0);

			if (field589 != null) {
				int var16 = field589.method446(arg0);
				int var17 = field590.method446(arg0);
				var14 += method184(var8, var17, field589.field1153) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field591 != null) {
				int var18 = field591.method446(arg0);
				int var19 = field592.method446(arg0);
				var15 = var15 * ((method184(var11, var19, field591.field1153) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field595[var20] != 0) {
					int var21 = field608[var20] + var13;
					if (var21 < arg0) {
						field604[var21] += method184(field607[var20], field609[var20] * var15 >> 15, field587.field1153);
						field607[var20] += (field610[var20] * var14 >> 16) + field611[var20];
					}
				}
			}
		}

		if (field593 != null) {
			field593.method445();
			field594.method445();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field593.method446(arg0);
				int var27 = field594.method446(arg0);
				int var28;
				if (var24) {
					var28 = ((field593.field1152 - field593.field1151) * var26 >> 8) + field593.field1151;
				} else {
					var28 = ((field593.field1152 - field593.field1151) * var27 >> 8) + field593.field1151;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field604[var25] = 0;
				}
			}
		}

		if (field598 > 0 && field599 > 0) {
			int var29 = (int) (field598 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field604[var30] += field604[var30 - var29] * field599 / 100;
			}
		}

		if (field600.field1239[0] > 0 || field600.field1239[1] > 0) {
			field601.method445();
			int var31 = field601.method446(arg0 + 1);
			int var32 = field600.method474(var31 / 65536.0F, 0);
			int var33 = field600.method474(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field604[var32 + var34] * (long) UVAKRMXV.field1246 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field604[var32 + var34 - var37 - 1] * (long) UVAKRMXV.field1244[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field604[var34 - var38 - 1] * (long) UVAKRMXV.field1244[1][var38] >> 16);
					}

					field604[var34] = var36;
					var31 = field601.method446(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field604[var32 + var34] * (long) UVAKRMXV.field1246 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field604[var32 + var34 - var42 - 1] * (long) UVAKRMXV.field1244[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field604[var34 - var43 - 1] * (long) UVAKRMXV.field1244[1][var43] >> 16);
						}

						field604[var34] = var41;
						var31 = field601.method446(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field600.method474(var31 / 65536.0F, 0);
					var33 = field600.method474(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field604[var32 + var34 - var45 - 1] * (long) UVAKRMXV.field1244[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field604[var34 - var46 - 1] * (long) UVAKRMXV.field1244[1][var46] >> 16);
					}

					field604[var34] = var44;
					field601.method446(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field604[var48] < -32768) {
				field604[var48] = -32768;
			}

			if (field604[var48] > 32767) {
				field604[var48] = 32767;
			}
		}

		return field604;
	}

	@ObfuscatedName("CYFJILLF.a(IIII)I")
	public final int method184(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg2 == 2) {
			return field606[arg0 & 0x7FFF] * arg1 >> 14;
		}

		if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg2 == 4) {
			return field605[arg0 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("CYFJILLF.a(LEILHLJCE;B)V")
	public final void method185(EILHLJCE arg0) {
		field587 = new RRWCTNMK();
		field587.method443(arg0);
		field588 = new RRWCTNMK();
		field588.method443(arg0);
		int var2 = arg0.method224();
		if (var2 != 0) {
			arg0.field684--;
			field589 = new RRWCTNMK();
			field589.method443(arg0);
			field590 = new RRWCTNMK();
			field590.method443(arg0);
		}

		int var3 = arg0.method224();
		if (var3 != 0) {
			arg0.field684--;
			field591 = new RRWCTNMK();
			field591.method443(arg0);
			field592 = new RRWCTNMK();
			field592.method443(arg0);
		}

		int var4 = arg0.method224();
		if (var4 != 0) {
			arg0.field684--;
			field593 = new RRWCTNMK();
			field593.method443(arg0);
			field594 = new RRWCTNMK();
			field594.method443(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method238();
			if (var6 == 0) {
				break;
			}

			field595[var5] = var6;
			field596[var5] = arg0.method237();
			field597[var5] = arg0.method238();
		}

		field598 = arg0.method238();
		field599 = arg0.method238();
		field602 = arg0.method226();
		field603 = arg0.method226();
		field600 = new UVAKRMXV();
		field601 = new RRWCTNMK();
		field600.method475(field601, arg0);
	}
}
