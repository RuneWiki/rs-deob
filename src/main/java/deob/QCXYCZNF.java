package deob;

@ObfuscatedName("QCXYCZNF")
public class QCXYCZNF {

	@ObfuscatedName("QCXYCZNF.j")
	public int[] field955 = new int[5];

	@ObfuscatedName("QCXYCZNF.k")
	public int[] field956 = new int[5];

	@ObfuscatedName("QCXYCZNF.l")
	public int[] field957 = new int[5];

	@ObfuscatedName("QCXYCZNF.n")
	public int field959 = 100;

	@ObfuscatedName("QCXYCZNF.q")
	public int field962 = 500;

	@ObfuscatedName("QCXYCZNF.v")
	public static int[] field967 = new int[5];

	@ObfuscatedName("QCXYCZNF.w")
	public static int[] field968 = new int[5];

	@ObfuscatedName("QCXYCZNF.x")
	public static int[] field969 = new int[5];

	@ObfuscatedName("QCXYCZNF.y")
	public static int[] field970 = new int[5];

	@ObfuscatedName("QCXYCZNF.z")
	public static int[] field971 = new int[5];

	@ObfuscatedName("QCXYCZNF.m")
	public int field958;

	@ObfuscatedName("QCXYCZNF.r")
	public int field963;

	@ObfuscatedName("QCXYCZNF.o")
	public LNMFPXZK field960;

	@ObfuscatedName("QCXYCZNF.b")
	public SSKEPHYP field947;

	@ObfuscatedName("QCXYCZNF.c")
	public SSKEPHYP field948;

	@ObfuscatedName("QCXYCZNF.d")
	public SSKEPHYP field949;

	@ObfuscatedName("QCXYCZNF.e")
	public SSKEPHYP field950;

	@ObfuscatedName("QCXYCZNF.f")
	public SSKEPHYP field951;

	@ObfuscatedName("QCXYCZNF.g")
	public SSKEPHYP field952;

	@ObfuscatedName("QCXYCZNF.h")
	public SSKEPHYP field953;

	@ObfuscatedName("QCXYCZNF.i")
	public SSKEPHYP field954;

	@ObfuscatedName("QCXYCZNF.p")
	public SSKEPHYP field961;

	@ObfuscatedName("QCXYCZNF.s")
	public static int[] field964;

	@ObfuscatedName("QCXYCZNF.t")
	public static int[] field965;

	@ObfuscatedName("QCXYCZNF.u")
	public static int[] field966;

	@ObfuscatedName("QCXYCZNF.a()V")
	public static final void method413() {
		field965 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field965[var0] = 1;
			} else {
				field965[var0] = -1;
			}
		}

		field966 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field966[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field964 = new int[220500];
	}

	@ObfuscatedName("QCXYCZNF.a(II)[I")
	public final int[] method414(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field964[var3] = 0;
		}

		if (arg1 < 10) {
			return field964;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field947.method481();
		field948.method481();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field949 != null) {
			field949.method481();
			field950.method481();
			var6 = (int) ((field949.field1166 - field949.field1165) * 32.768D / var4);
			var7 = (int) (field949.field1165 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field951 != null) {
			field951.method481();
			field952.method481();
			var9 = (int) ((field951.field1166 - field951.field1165) * 32.768D / var4);
			var10 = (int) (field951.field1165 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field955[var12] != 0) {
				field967[var12] = 0;
				field968[var12] = (int) (field957[var12] * var4);
				field969[var12] = (field955[var12] << 14) / 100;
				field970[var12] = (int) ((field947.field1166 - field947.field1165) * 32.768D * Math.pow(1.0057929410678534D, field956[var12]) / var4);
				field971[var12] = (int) (field947.field1165 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field947.method482(arg0);
			int var15 = field948.method482(arg0);

			if (field949 != null) {
				int var16 = field949.method482(arg0);
				int var17 = field950.method482(arg0);
				var14 += method415(field949.field1167, var8, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field951 != null) {
				int var18 = field951.method482(arg0);
				int var19 = field952.method482(arg0);
				var15 = var15 * ((method415(field951.field1167, var11, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field955[var20] != 0) {
					int var21 = field968[var20] + var13;
					if (var21 < arg0) {
						field964[var21] += method415(field947.field1167, field967[var20], field969[var20] * var15 >> 15);
						field967[var20] += (field970[var20] * var14 >> 16) + field971[var20];
					}
				}
			}
		}

		if (field953 != null) {
			field953.method481();
			field954.method481();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field953.method482(arg0);
				int var27 = field954.method482(arg0);
				int var28;
				if (var24) {
					var28 = ((field953.field1166 - field953.field1165) * var26 >> 8) + field953.field1165;
				} else {
					var28 = ((field953.field1166 - field953.field1165) * var27 >> 8) + field953.field1165;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field964[var25] = 0;
				}
			}
		}

		if (field958 > 0 && field959 > 0) {
			int var29 = (int) (field958 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field964[var30] += field964[var30 - var29] * field959 / 100;
			}
		}

		if (field960.field816[0] > 0 || field960.field816[1] > 0) {
			field961.method481();
			int var31 = field961.method482(arg0 + 1);
			int var32 = field960.method366(var31 / 65536.0F, 0);
			int var33 = field960.method366(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field964[var32 + var34] * (long) LNMFPXZK.field823 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field964[var32 + var34 - var37 - 1] * (long) LNMFPXZK.field821[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field964[var34 - var38 - 1] * (long) LNMFPXZK.field821[1][var38] >> 16);
					}

					field964[var34] = var36;
					var31 = field961.method482(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field964[var32 + var34] * (long) LNMFPXZK.field823 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field964[var32 + var34 - var42 - 1] * (long) LNMFPXZK.field821[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field964[var34 - var43 - 1] * (long) LNMFPXZK.field821[1][var43] >> 16);
						}

						field964[var34] = var41;
						var31 = field961.method482(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field960.method366(var31 / 65536.0F, 0);
					var33 = field960.method366(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field964[var32 + var34 - var45 - 1] * (long) LNMFPXZK.field821[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field964[var34 - var46 - 1] * (long) LNMFPXZK.field821[1][var46] >> 16);
					}

					field964[var34] = var44;
					field961.method482(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field964[var48] < -32768) {
				field964[var48] = -32768;
			}

			if (field964[var48] > 32767) {
				field964[var48] = 32767;
			}
		}

		return field964;
	}

	@ObfuscatedName("QCXYCZNF.a(ZIII)I")
	public final int method415(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg0 == 2) {
			return field966[arg1 & 0x7FFF] * arg2 >> 14;
		}

		if (arg0 == 3) {
			return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg0 == 4) {
			return field965[arg1 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("QCXYCZNF.a(LJHKSAGUC;I)V")
	public final void method416(JHKSAGUC arg0) {
		field947 = new SSKEPHYP();
		field947.method479(arg0);
		field948 = new SSKEPHYP();
		field948.method479(arg0);
		int var2 = arg0.method306();
		if (var2 != 0) {
			arg0.field752--;
			field949 = new SSKEPHYP();
			field949.method479(arg0);
			field950 = new SSKEPHYP();
			field950.method479(arg0);
		}

		int var3 = arg0.method306();
		if (var3 != 0) {
			arg0.field752--;
			field951 = new SSKEPHYP();
			field951.method479(arg0);
			field952 = new SSKEPHYP();
			field952.method479(arg0);
		}

		int var4 = arg0.method306();
		if (var4 != 0) {
			arg0.field752--;
			field953 = new SSKEPHYP();
			field953.method479(arg0);
			field954 = new SSKEPHYP();
			field954.method479(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method320();
			if (var6 == 0) {
				break;
			}

			field955[var5] = var6;
			field956[var5] = arg0.method319();
			field957[var5] = arg0.method320();
		}

		field958 = arg0.method320();
		field959 = arg0.method320();
		field962 = arg0.method308();
		field963 = arg0.method308();
		field960 = new LNMFPXZK();
		field961 = new SSKEPHYP();
		field960.method367(field961, arg0);
	}
}
