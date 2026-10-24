package deob;

@ObfuscatedName("JUIUBOIF")
public class JUIUBOIF {

	@ObfuscatedName("JUIUBOIF.l")
	public int[] field783 = new int[5];

	@ObfuscatedName("JUIUBOIF.m")
	public int[] field784 = new int[5];

	@ObfuscatedName("JUIUBOIF.n")
	public int[] field785 = new int[5];

	@ObfuscatedName("JUIUBOIF.p")
	public int field787 = 100;

	@ObfuscatedName("JUIUBOIF.s")
	public int field790 = 500;

	@ObfuscatedName("JUIUBOIF.x")
	public static int[] field795 = new int[5];

	@ObfuscatedName("JUIUBOIF.y")
	public static int[] field796 = new int[5];

	@ObfuscatedName("JUIUBOIF.z")
	public static int[] field797 = new int[5];

	@ObfuscatedName("JUIUBOIF.A")
	public static int[] field798 = new int[5];

	@ObfuscatedName("JUIUBOIF.B")
	public static int[] field799 = new int[5];

	@ObfuscatedName("JUIUBOIF.o")
	public int field786;

	@ObfuscatedName("JUIUBOIF.t")
	public int field791;

	@ObfuscatedName("JUIUBOIF.q")
	public EQHIVIBA field788;

	@ObfuscatedName("JUIUBOIF.d")
	public VMVYFNTB field775;

	@ObfuscatedName("JUIUBOIF.e")
	public VMVYFNTB field776;

	@ObfuscatedName("JUIUBOIF.f")
	public VMVYFNTB field777;

	@ObfuscatedName("JUIUBOIF.g")
	public VMVYFNTB field778;

	@ObfuscatedName("JUIUBOIF.h")
	public VMVYFNTB field779;

	@ObfuscatedName("JUIUBOIF.i")
	public VMVYFNTB field780;

	@ObfuscatedName("JUIUBOIF.j")
	public VMVYFNTB field781;

	@ObfuscatedName("JUIUBOIF.k")
	public VMVYFNTB field782;

	@ObfuscatedName("JUIUBOIF.r")
	public VMVYFNTB field789;

	@ObfuscatedName("JUIUBOIF.u")
	public static int[] field792;

	@ObfuscatedName("JUIUBOIF.v")
	public static int[] field793;

	@ObfuscatedName("JUIUBOIF.w")
	public static int[] field794;

	@ObfuscatedName("JUIUBOIF.a()V")
	public static final void method301() {
		field793 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field793[var0] = 1;
			} else {
				field793[var0] = -1;
			}
		}

		field794 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field794[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field792 = new int[220500];
	}

	@ObfuscatedName("JUIUBOIF.a(II)[I")
	public final int[] method302(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field792[var3] = 0;
		}

		if (arg1 < 10) {
			return field792;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field775.method515();
		field776.method515();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field777 != null) {
			field777.method515();
			field778.method515();
			var6 = (int) ((field777.field1372 - field777.field1371) * 32.768D / var4);
			var7 = (int) (field777.field1371 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field779 != null) {
			field779.method515();
			field780.method515();
			var9 = (int) ((field779.field1372 - field779.field1371) * 32.768D / var4);
			var10 = (int) (field779.field1371 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field783[var12] != 0) {
				field795[var12] = 0;
				field796[var12] = (int) (field785[var12] * var4);
				field797[var12] = (field783[var12] << 14) / 100;
				field798[var12] = (int) ((field775.field1372 - field775.field1371) * 32.768D * Math.pow(1.0057929410678534D, field784[var12]) / var4);
				field799[var12] = (int) (field775.field1371 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field775.method516(arg0);
			int var15 = field776.method516(arg0);

			if (field777 != null) {
				int var16 = field777.method516(arg0);
				int var17 = field778.method516(arg0);
				var14 += method303(var8, field777.field1373, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field779 != null) {
				int var18 = field779.method516(arg0);
				int var19 = field780.method516(arg0);
				var15 = var15 * ((method303(var11, field779.field1373, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field783[var20] != 0) {
					int var21 = field796[var20] + var13;
					if (var21 < arg0) {
						field792[var21] += method303(field795[var20], field775.field1373, field797[var20] * var15 >> 15);
						field795[var20] += (field798[var20] * var14 >> 16) + field799[var20];
					}
				}
			}
		}

		if (field781 != null) {
			field781.method515();
			field782.method515();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field781.method516(arg0);
				int var27 = field782.method516(arg0);
				int var28;
				if (var24) {
					var28 = ((field781.field1372 - field781.field1371) * var26 >> 8) + field781.field1371;
				} else {
					var28 = ((field781.field1372 - field781.field1371) * var27 >> 8) + field781.field1371;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field792[var25] = 0;
				}
			}
		}

		if (field786 > 0 && field787 > 0) {
			int var29 = (int) (field786 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field792[var30] += field792[var30 - var29] * field787 / 100;
			}
		}

		if (field788.field581[0] > 0 || field788.field581[1] > 0) {
			field789.method515();
			int var31 = field789.method516(arg0 + 1);
			int var32 = field788.method190(var31 / 65536.0F, 0);
			int var33 = field788.method190(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field792[var32 + var34] * (long) EQHIVIBA.field588 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field792[var32 + var34 - var37 - 1] * (long) EQHIVIBA.field586[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field792[var34 - var38 - 1] * (long) EQHIVIBA.field586[1][var38] >> 16);
					}

					field792[var34] = var36;
					var31 = field789.method516(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field792[var32 + var34] * (long) EQHIVIBA.field588 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field792[var32 + var34 - var42 - 1] * (long) EQHIVIBA.field586[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field792[var34 - var43 - 1] * (long) EQHIVIBA.field586[1][var43] >> 16);
						}

						field792[var34] = var41;
						var31 = field789.method516(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field788.method190(var31 / 65536.0F, 0);
					var33 = field788.method190(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field792[var32 + var34 - var45 - 1] * (long) EQHIVIBA.field586[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field792[var34 - var46 - 1] * (long) EQHIVIBA.field586[1][var46] >> 16);
					}

					field792[var34] = var44;
					field789.method516(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field792[var48] < -32768) {
				field792[var48] = -32768;
			}

			if (field792[var48] > 32767) {
				field792[var48] = 32767;
			}
		}

		return field792;
	}

	@ObfuscatedName("JUIUBOIF.a(IBII)I")
	public final int method303(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field794[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field793[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("JUIUBOIF.a(BLXJCNBMKS;)V")
	public final void method304(XJCNBMKS arg0) {
		field775 = new VMVYFNTB();
		field775.method513(arg0);
		field776 = new VMVYFNTB();
		field776.method513(arg0);
		int var2 = arg0.method534();
		if (var2 != 0) {
			arg0.field1403--;
			field777 = new VMVYFNTB();
			field777.method513(arg0);
			field778 = new VMVYFNTB();
			field778.method513(arg0);
		}

		int var3 = arg0.method534();
		if (var3 != 0) {
			arg0.field1403--;
			field779 = new VMVYFNTB();
			field779.method513(arg0);
			field780 = new VMVYFNTB();
			field780.method513(arg0);
		}

		int var4 = arg0.method534();
		if (var4 != 0) {
			arg0.field1403--;
			field781 = new VMVYFNTB();
			field781.method513(arg0);
			field782 = new VMVYFNTB();
			field782.method513(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method548();
			if (var6 == 0) {
				break;
			}

			field783[var5] = var6;
			field784[var5] = arg0.method547();
			field785[var5] = arg0.method548();
		}

		field786 = arg0.method548();
		field787 = arg0.method548();
		field790 = arg0.method536();
		field791 = arg0.method536();
		field788 = new EQHIVIBA();
		field789 = new VMVYFNTB();
		field788.method191(arg0, field789);
	}
}
