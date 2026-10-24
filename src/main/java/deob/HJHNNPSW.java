package deob;

@ObfuscatedName("HJHNNPSW")
public class HJHNNPSW {

	@ObfuscatedName("HJHNNPSW.l")
	public int[] field637 = new int[5];

	@ObfuscatedName("HJHNNPSW.m")
	public int[] field638 = new int[5];

	@ObfuscatedName("HJHNNPSW.n")
	public int[] field639 = new int[5];

	@ObfuscatedName("HJHNNPSW.p")
	public int field641 = 100;

	@ObfuscatedName("HJHNNPSW.s")
	public int field644 = 500;

	@ObfuscatedName("HJHNNPSW.x")
	public static int[] field649 = new int[5];

	@ObfuscatedName("HJHNNPSW.y")
	public static int[] field650 = new int[5];

	@ObfuscatedName("HJHNNPSW.z")
	public static int[] field651 = new int[5];

	@ObfuscatedName("HJHNNPSW.A")
	public static int[] field652 = new int[5];

	@ObfuscatedName("HJHNNPSW.B")
	public static int[] field653 = new int[5];

	@ObfuscatedName("HJHNNPSW.o")
	public int field640;

	@ObfuscatedName("HJHNNPSW.t")
	public int field645;

	@ObfuscatedName("HJHNNPSW.q")
	public RHVCMDPL field642;

	@ObfuscatedName("HJHNNPSW.d")
	public XJHYQMBH field629;

	@ObfuscatedName("HJHNNPSW.e")
	public XJHYQMBH field630;

	@ObfuscatedName("HJHNNPSW.f")
	public XJHYQMBH field631;

	@ObfuscatedName("HJHNNPSW.g")
	public XJHYQMBH field632;

	@ObfuscatedName("HJHNNPSW.h")
	public XJHYQMBH field633;

	@ObfuscatedName("HJHNNPSW.i")
	public XJHYQMBH field634;

	@ObfuscatedName("HJHNNPSW.j")
	public XJHYQMBH field635;

	@ObfuscatedName("HJHNNPSW.k")
	public XJHYQMBH field636;

	@ObfuscatedName("HJHNNPSW.r")
	public XJHYQMBH field643;

	@ObfuscatedName("HJHNNPSW.u")
	public static int[] field646;

	@ObfuscatedName("HJHNNPSW.v")
	public static int[] field647;

	@ObfuscatedName("HJHNNPSW.w")
	public static int[] field648;

	@ObfuscatedName("HJHNNPSW.a()V")
	public static final void method240() {
		field647 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field647[var0] = 1;
			} else {
				field647[var0] = -1;
			}
		}

		field648 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field648[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field646 = new int[220500];
	}

	@ObfuscatedName("HJHNNPSW.a(II)[I")
	public final int[] method241(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field646[var3] = 0;
		}

		if (arg1 < 10) {
			return field646;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field629.method592();
		field630.method592();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field631 != null) {
			field631.method592();
			field632.method592();
			var6 = (int) ((field631.field1478 - field631.field1477) * 32.768D / var4);
			var7 = (int) (field631.field1477 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field633 != null) {
			field633.method592();
			field634.method592();
			var9 = (int) ((field633.field1478 - field633.field1477) * 32.768D / var4);
			var10 = (int) (field633.field1477 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field637[var12] != 0) {
				field649[var12] = 0;
				field650[var12] = (int) (field639[var12] * var4);
				field651[var12] = (field637[var12] << 14) / 100;
				field652[var12] = (int) ((field629.field1478 - field629.field1477) * 32.768D * Math.pow(1.0057929410678534D, field638[var12]) / var4);
				field653[var12] = (int) (field629.field1477 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field629.method593(arg0);
			int var15 = field630.method593(arg0);

			if (field631 != null) {
				int var16 = field631.method593(arg0);
				int var17 = field632.method593(arg0);
				var14 += method242(field631.field1479, var8, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field633 != null) {
				int var18 = field633.method593(arg0);
				int var19 = field634.method593(arg0);
				var15 = var15 * ((method242(field633.field1479, var11, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field637[var20] != 0) {
					int var21 = field650[var20] + var13;
					if (var21 < arg0) {
						field646[var21] += method242(field629.field1479, field649[var20], field651[var20] * var15 >> 15);
						field649[var20] += (field652[var20] * var14 >> 16) + field653[var20];
					}
				}
			}
		}

		if (field635 != null) {
			field635.method592();
			field636.method592();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field635.method593(arg0);
				int var27 = field636.method593(arg0);
				int var28;
				if (var24) {
					var28 = ((field635.field1478 - field635.field1477) * var26 >> 8) + field635.field1477;
				} else {
					var28 = ((field635.field1478 - field635.field1477) * var27 >> 8) + field635.field1477;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field646[var25] = 0;
				}
			}
		}

		if (field640 > 0 && field641 > 0) {
			int var29 = (int) (field640 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field646[var30] += field646[var30 - var29] * field641 / 100;
			}
		}

		if (field642.field1192[0] > 0 || field642.field1192[1] > 0) {
			field643.method592();
			int var31 = field643.method593(arg0 + 1);
			int var32 = field642.method444(0, var31 / 65536.0F);
			int var33 = field642.method444(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field646[var32 + var34] * (long) RHVCMDPL.field1199 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field646[var32 + var34 - var37 - 1] * (long) RHVCMDPL.field1197[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field646[var34 - var38 - 1] * (long) RHVCMDPL.field1197[1][var38] >> 16);
					}

					field646[var34] = var36;
					var31 = field643.method593(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field646[var32 + var34] * (long) RHVCMDPL.field1199 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field646[var32 + var34 - var42 - 1] * (long) RHVCMDPL.field1197[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field646[var34 - var43 - 1] * (long) RHVCMDPL.field1197[1][var43] >> 16);
						}

						field646[var34] = var41;
						var31 = field643.method593(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field642.method444(0, var31 / 65536.0F);
					var33 = field642.method444(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field646[var32 + var34 - var45 - 1] * (long) RHVCMDPL.field1197[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field646[var34 - var46 - 1] * (long) RHVCMDPL.field1197[1][var46] >> 16);
					}

					field646[var34] = var44;
					field643.method593(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field646[var48] < -32768) {
				field646[var48] = -32768;
			}

			if (field646[var48] > 32767) {
				field646[var48] = 32767;
			}
		}

		return field646;
	}

	@ObfuscatedName("HJHNNPSW.a(IIII)I")
	public final int method242(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg0 == 2) {
			return field648[arg1 & 0x7FFF] * arg2 >> 14;
		}

		if (arg0 == 3) {
			return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg0 == 4) {
			return field647[arg1 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("HJHNNPSW.a(ILSVWJKJVI;)V")
	public final void method243(SVWJKJVI arg0) {
		field629 = new XJHYQMBH();
		field629.method590(arg0);
		field630 = new XJHYQMBH();
		field630.method590(arg0);
		int var2 = arg0.method461();
		if (var2 != 0) {
			arg0.field1263--;
			field631 = new XJHYQMBH();
			field631.method590(arg0);
			field632 = new XJHYQMBH();
			field632.method590(arg0);
		}

		int var3 = arg0.method461();
		if (var3 != 0) {
			arg0.field1263--;
			field633 = new XJHYQMBH();
			field633.method590(arg0);
			field634 = new XJHYQMBH();
			field634.method590(arg0);
		}

		int var4 = arg0.method461();
		if (var4 != 0) {
			arg0.field1263--;
			field635 = new XJHYQMBH();
			field635.method590(arg0);
			field636 = new XJHYQMBH();
			field636.method590(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method475();
			if (var6 == 0) {
				break;
			}

			field637[var5] = var6;
			field638[var5] = arg0.method474();
			field639[var5] = arg0.method475();
		}

		field640 = arg0.method475();
		field641 = arg0.method475();
		field644 = arg0.method463();
		field645 = arg0.method463();
		field642 = new RHVCMDPL();
		field643 = new XJHYQMBH();
		field642.method445(field643, arg0);
	}
}
