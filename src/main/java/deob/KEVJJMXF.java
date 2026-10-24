package deob;

@ObfuscatedName("KEVJJMXF")
public class KEVJJMXF {

	@ObfuscatedName("KEVJJMXF.k")
	public int[] field889 = new int[5];

	@ObfuscatedName("KEVJJMXF.l")
	public int[] field890 = new int[5];

	@ObfuscatedName("KEVJJMXF.m")
	public int[] field891 = new int[5];

	@ObfuscatedName("KEVJJMXF.o")
	public int field893 = 100;

	@ObfuscatedName("KEVJJMXF.r")
	public int field896 = 500;

	@ObfuscatedName("KEVJJMXF.w")
	public static int[] field901 = new int[5];

	@ObfuscatedName("KEVJJMXF.x")
	public static int[] field902 = new int[5];

	@ObfuscatedName("KEVJJMXF.y")
	public static int[] field903 = new int[5];

	@ObfuscatedName("KEVJJMXF.z")
	public static int[] field904 = new int[5];

	@ObfuscatedName("KEVJJMXF.A")
	public static int[] field905 = new int[5];

	@ObfuscatedName("KEVJJMXF.n")
	public int field892;

	@ObfuscatedName("KEVJJMXF.s")
	public int field897;

	@ObfuscatedName("KEVJJMXF.c")
	public MWRZAKOJ field881;

	@ObfuscatedName("KEVJJMXF.d")
	public MWRZAKOJ field882;

	@ObfuscatedName("KEVJJMXF.e")
	public MWRZAKOJ field883;

	@ObfuscatedName("KEVJJMXF.f")
	public MWRZAKOJ field884;

	@ObfuscatedName("KEVJJMXF.g")
	public MWRZAKOJ field885;

	@ObfuscatedName("KEVJJMXF.h")
	public MWRZAKOJ field886;

	@ObfuscatedName("KEVJJMXF.i")
	public MWRZAKOJ field887;

	@ObfuscatedName("KEVJJMXF.j")
	public MWRZAKOJ field888;

	@ObfuscatedName("KEVJJMXF.q")
	public MWRZAKOJ field895;

	@ObfuscatedName("KEVJJMXF.p")
	public URKVTZGT field894;

	@ObfuscatedName("KEVJJMXF.t")
	public static int[] field898;

	@ObfuscatedName("KEVJJMXF.u")
	public static int[] field899;

	@ObfuscatedName("KEVJJMXF.v")
	public static int[] field900;

	@ObfuscatedName("KEVJJMXF.a()V")
	public static final void method327() {
		field899 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field899[var0] = 1;
			} else {
				field899[var0] = -1;
			}
		}

		field900 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field900[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field898 = new int[220500];
	}

	@ObfuscatedName("KEVJJMXF.a(II)[I")
	public final int[] method328(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field898[var3] = 0;
		}

		if (arg1 < 10) {
			return field898;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field881.method360();
		field882.method360();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field883 != null) {
			field883.method360();
			field884.method360();
			var6 = (int) ((field883.field1067 - field883.field1066) * 32.768D / var4);
			var7 = (int) (field883.field1066 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field885 != null) {
			field885.method360();
			field886.method360();
			var9 = (int) ((field885.field1067 - field885.field1066) * 32.768D / var4);
			var10 = (int) (field885.field1066 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field889[var12] != 0) {
				field901[var12] = 0;
				field902[var12] = (int) (field891[var12] * var4);
				field903[var12] = (field889[var12] << 14) / 100;
				field904[var12] = (int) ((field881.field1067 - field881.field1066) * 32.768D * Math.pow(1.0057929410678534D, field890[var12]) / var4);
				field905[var12] = (int) (field881.field1066 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field881.method361(arg0);
			int var15 = field882.method361(arg0);

			if (field883 != null) {
				int var16 = field883.method361(arg0);
				int var17 = field884.method361(arg0);
				var14 += method329(var8, var17, field883.field1068) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field885 != null) {
				int var18 = field885.method361(arg0);
				int var19 = field886.method361(arg0);
				var15 = var15 * ((method329(var11, var19, field885.field1068) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field889[var20] != 0) {
					int var21 = field902[var20] + var13;
					if (var21 < arg0) {
						field898[var21] += method329(field901[var20], field903[var20] * var15 >> 15, field881.field1068);
						field901[var20] += (field904[var20] * var14 >> 16) + field905[var20];
					}
				}
			}
		}

		if (field887 != null) {
			field887.method360();
			field888.method360();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field887.method361(arg0);
				int var27 = field888.method361(arg0);
				int var28;
				if (var24) {
					var28 = ((field887.field1067 - field887.field1066) * var26 >> 8) + field887.field1066;
				} else {
					var28 = ((field887.field1067 - field887.field1066) * var27 >> 8) + field887.field1066;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field898[var25] = 0;
				}
			}
		}

		if (field892 > 0 && field893 > 0) {
			int var29 = (int) (field892 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field898[var30] += field898[var30 - var29] * field893 / 100;
			}
		}

		if (field894.field1383[0] > 0 || field894.field1383[1] > 0) {
			field895.method360();
			int var31 = field895.method361(arg0 + 1);
			int var32 = field894.method520(0, var31 / 65536.0F);
			int var33 = field894.method520(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field898[var32 + var34] * (long) URKVTZGT.field1390 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field898[var32 + var34 - var37 - 1] * (long) URKVTZGT.field1388[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field898[var34 - var38 - 1] * (long) URKVTZGT.field1388[1][var38] >> 16);
					}

					field898[var34] = var36;
					var31 = field895.method361(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field898[var32 + var34] * (long) URKVTZGT.field1390 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field898[var32 + var34 - var42 - 1] * (long) URKVTZGT.field1388[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field898[var34 - var43 - 1] * (long) URKVTZGT.field1388[1][var43] >> 16);
						}

						field898[var34] = var41;
						var31 = field895.method361(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field894.method520(0, var31 / 65536.0F);
					var33 = field894.method520(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field898[var32 + var34 - var45 - 1] * (long) URKVTZGT.field1388[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field898[var34 - var46 - 1] * (long) URKVTZGT.field1388[1][var46] >> 16);
					}

					field898[var34] = var44;
					field895.method361(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field898[var48] < -32768) {
				field898[var48] = -32768;
			}

			if (field898[var48] > 32767) {
				field898[var48] = 32767;
			}
		}

		return field898;
	}

	@ObfuscatedName("KEVJJMXF.a(BIII)I")
	public final int method329(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg2 == 2) {
			return field900[arg0 & 0x7FFF] * arg1 >> 14;
		}

		if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg2 == 4) {
			return field899[arg0 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("KEVJJMXF.a(LIUVBENCV;B)V")
	public final void method330(IUVBENCV arg0) {
		field881 = new MWRZAKOJ();
		field881.method358(arg0);
		field882 = new MWRZAKOJ();
		field882.method358(arg0);
		int var2 = arg0.method245();
		if (var2 != 0) {
			arg0.field733--;
			field883 = new MWRZAKOJ();
			field883.method358(arg0);
			field884 = new MWRZAKOJ();
			field884.method358(arg0);
		}

		int var3 = arg0.method245();
		if (var3 != 0) {
			arg0.field733--;
			field885 = new MWRZAKOJ();
			field885.method358(arg0);
			field886 = new MWRZAKOJ();
			field886.method358(arg0);
		}

		int var4 = arg0.method245();
		if (var4 != 0) {
			arg0.field733--;
			field887 = new MWRZAKOJ();
			field887.method358(arg0);
			field888 = new MWRZAKOJ();
			field888.method358(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method259();
			if (var6 == 0) {
				break;
			}

			field889[var5] = var6;
			field890[var5] = arg0.method258();
			field891[var5] = arg0.method259();
		}

		field892 = arg0.method259();
		field893 = arg0.method259();
		field896 = arg0.method247();
		field897 = arg0.method247();
		field894 = new URKVTZGT();
		field895 = new MWRZAKOJ();
		field894.method521(arg0, field895);
	}
}
