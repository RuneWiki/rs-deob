package deob;

@ObfuscatedName("GJBKSAZL")
public class GJBKSAZL {

	@ObfuscatedName("GJBKSAZL.j")
	public int[] field643 = new int[5];

	@ObfuscatedName("GJBKSAZL.k")
	public int[] field644 = new int[5];

	@ObfuscatedName("GJBKSAZL.l")
	public int[] field645 = new int[5];

	@ObfuscatedName("GJBKSAZL.n")
	public int field647 = 100;

	@ObfuscatedName("GJBKSAZL.q")
	public int field650 = 500;

	@ObfuscatedName("GJBKSAZL.v")
	public static int[] field655 = new int[5];

	@ObfuscatedName("GJBKSAZL.w")
	public static int[] field656 = new int[5];

	@ObfuscatedName("GJBKSAZL.x")
	public static int[] field657 = new int[5];

	@ObfuscatedName("GJBKSAZL.y")
	public static int[] field658 = new int[5];

	@ObfuscatedName("GJBKSAZL.z")
	public static int[] field659 = new int[5];

	@ObfuscatedName("GJBKSAZL.m")
	public int field646;

	@ObfuscatedName("GJBKSAZL.r")
	public int field651;

	@ObfuscatedName("GJBKSAZL.b")
	public DNFIVRJB field635;

	@ObfuscatedName("GJBKSAZL.c")
	public DNFIVRJB field636;

	@ObfuscatedName("GJBKSAZL.d")
	public DNFIVRJB field637;

	@ObfuscatedName("GJBKSAZL.e")
	public DNFIVRJB field638;

	@ObfuscatedName("GJBKSAZL.f")
	public DNFIVRJB field639;

	@ObfuscatedName("GJBKSAZL.g")
	public DNFIVRJB field640;

	@ObfuscatedName("GJBKSAZL.h")
	public DNFIVRJB field641;

	@ObfuscatedName("GJBKSAZL.i")
	public DNFIVRJB field642;

	@ObfuscatedName("GJBKSAZL.p")
	public DNFIVRJB field649;

	@ObfuscatedName("GJBKSAZL.o")
	public DRRJWDRT field648;

	@ObfuscatedName("GJBKSAZL.s")
	public static int[] field652;

	@ObfuscatedName("GJBKSAZL.t")
	public static int[] field653;

	@ObfuscatedName("GJBKSAZL.u")
	public static int[] field654;

	@ObfuscatedName("GJBKSAZL.a()V")
	public static final void method296() {
		field653 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field653[var0] = 1;
			} else {
				field653[var0] = -1;
			}
		}

		field654 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field654[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field652 = new int[220500];
	}

	@ObfuscatedName("GJBKSAZL.a(II)[I")
	public final int[] method297(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field652[var3] = 0;
		}

		if (arg1 < 10) {
			return field652;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field635.method257();
		field636.method257();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field637 != null) {
			field637.method257();
			field638.method257();
			var6 = (int) ((field637.field534 - field637.field533) * 32.768D / var4);
			var7 = (int) (field637.field533 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field639 != null) {
			field639.method257();
			field640.method257();
			var9 = (int) ((field639.field534 - field639.field533) * 32.768D / var4);
			var10 = (int) (field639.field533 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field643[var12] != 0) {
				field655[var12] = 0;
				field656[var12] = (int) (field645[var12] * var4);
				field657[var12] = (field643[var12] << 14) / 100;
				field658[var12] = (int) ((field635.field534 - field635.field533) * 32.768D * Math.pow(1.0057929410678534D, field644[var12]) / var4);
				field659[var12] = (int) (field635.field533 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field635.method258(arg0);
			int var15 = field636.method258(arg0);

			if (field637 != null) {
				int var16 = field637.method258(arg0);
				int var17 = field638.method258(arg0);
				var14 += method298(var17, field637.field535, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field639 != null) {
				int var18 = field639.method258(arg0);
				int var19 = field640.method258(arg0);
				var15 = var15 * ((method298(var19, field639.field535, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field643[var20] != 0) {
					int var21 = field656[var20] + var13;
					if (var21 < arg0) {
						field652[var21] += method298(field657[var20] * var15 >> 15, field635.field535, field655[var20]);
						field655[var20] += (field658[var20] * var14 >> 16) + field659[var20];
					}
				}
			}
		}

		if (field641 != null) {
			field641.method257();
			field642.method257();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field641.method258(arg0);
				int var27 = field642.method258(arg0);
				int var28;
				if (var24) {
					var28 = ((field641.field534 - field641.field533) * var26 >> 8) + field641.field533;
				} else {
					var28 = ((field641.field534 - field641.field533) * var27 >> 8) + field641.field533;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field652[var25] = 0;
				}
			}
		}

		if (field646 > 0 && field647 > 0) {
			int var29 = (int) (field646 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field652[var30] += field652[var30 - var29] * field647 / 100;
			}
		}

		if (field648.field541[0] > 0 || field648.field541[1] > 0) {
			field649.method257();
			int var31 = field649.method258(arg0 + 1);
			int var32 = field648.method262(0, var31 / 65536.0F);
			int var33 = field648.method262(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field652[var32 + var34] * (long) DRRJWDRT.field548 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field652[var32 + var34 - var37 - 1] * (long) DRRJWDRT.field546[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field652[var34 - var38 - 1] * (long) DRRJWDRT.field546[1][var38] >> 16);
					}

					field652[var34] = var36;
					var31 = field649.method258(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field652[var32 + var34] * (long) DRRJWDRT.field548 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field652[var32 + var34 - var42 - 1] * (long) DRRJWDRT.field546[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field652[var34 - var43 - 1] * (long) DRRJWDRT.field546[1][var43] >> 16);
						}

						field652[var34] = var41;
						var31 = field649.method258(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field648.method262(0, var31 / 65536.0F);
					var33 = field648.method262(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field652[var32 + var34 - var45 - 1] * (long) DRRJWDRT.field546[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field652[var34 - var46 - 1] * (long) DRRJWDRT.field546[1][var46] >> 16);
					}

					field652[var34] = var44;
					field649.method258(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field652[var48] < -32768) {
				field652[var48] = -32768;
			}

			if (field652[var48] > 32767) {
				field652[var48] = 32767;
			}
		}

		return field652;
	}

	@ObfuscatedName("GJBKSAZL.a(IIII)I")
	public final int method298(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg0;
			}

			return -arg0;
		}

		if (arg1 == 2) {
			return field654[arg2 & 0x7FFF] * arg0 >> 14;
		}

		if (arg1 == 3) {
			return ((arg2 & 0x7FFF) * arg0 >> 14) - arg0;
		}

		if (arg1 == 4) {
			return field653[arg2 / 2607 & 0x7FFF] * arg0;
		}

		return 0;
	}

	@ObfuscatedName("GJBKSAZL.a(LCFARFRSG;I)V")
	public final void method299(CFARFRSG arg0) {
		field635 = new DNFIVRJB();
		field635.method255(arg0);
		field636 = new DNFIVRJB();
		field636.method255(arg0);
		int var2 = arg0.method30();
		if (var2 != 0) {
			arg0.field44--;
			field637 = new DNFIVRJB();
			field637.method255(arg0);
			field638 = new DNFIVRJB();
			field638.method255(arg0);
		}

		int var3 = arg0.method30();
		if (var3 != 0) {
			arg0.field44--;
			field639 = new DNFIVRJB();
			field639.method255(arg0);
			field640 = new DNFIVRJB();
			field640.method255(arg0);
		}

		int var4 = arg0.method30();
		if (var4 != 0) {
			arg0.field44--;
			field641 = new DNFIVRJB();
			field641.method255(arg0);
			field642 = new DNFIVRJB();
			field642.method255(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method44();
			if (var6 == 0) {
				break;
			}

			field643[var5] = var6;
			field644[var5] = arg0.method43();
			field645[var5] = arg0.method44();
		}

		field646 = arg0.method44();
		field647 = arg0.method44();
		field650 = arg0.method32();
		field651 = arg0.method32();
		field648 = new DRRJWDRT();
		field649 = new DNFIVRJB();
		field648.method263(field649, arg0);
	}
}
