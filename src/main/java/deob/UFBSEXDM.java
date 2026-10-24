package deob;

@ObfuscatedName("UFBSEXDM")
public class UFBSEXDM {

	@ObfuscatedName("UFBSEXDM.j")
	public int[] field1292 = new int[5];

	@ObfuscatedName("UFBSEXDM.k")
	public int[] field1293 = new int[5];

	@ObfuscatedName("UFBSEXDM.l")
	public int[] field1294 = new int[5];

	@ObfuscatedName("UFBSEXDM.n")
	public int field1296 = 100;

	@ObfuscatedName("UFBSEXDM.q")
	public int field1299 = 500;

	@ObfuscatedName("UFBSEXDM.v")
	public static int[] field1304 = new int[5];

	@ObfuscatedName("UFBSEXDM.w")
	public static int[] field1305 = new int[5];

	@ObfuscatedName("UFBSEXDM.x")
	public static int[] field1306 = new int[5];

	@ObfuscatedName("UFBSEXDM.y")
	public static int[] field1307 = new int[5];

	@ObfuscatedName("UFBSEXDM.z")
	public static int[] field1308 = new int[5];

	@ObfuscatedName("UFBSEXDM.m")
	public int field1295;

	@ObfuscatedName("UFBSEXDM.r")
	public int field1300;

	@ObfuscatedName("UFBSEXDM.o")
	public LOQKYCGM field1297;

	@ObfuscatedName("UFBSEXDM.b")
	public TMVRZUVH field1284;

	@ObfuscatedName("UFBSEXDM.c")
	public TMVRZUVH field1285;

	@ObfuscatedName("UFBSEXDM.d")
	public TMVRZUVH field1286;

	@ObfuscatedName("UFBSEXDM.e")
	public TMVRZUVH field1287;

	@ObfuscatedName("UFBSEXDM.f")
	public TMVRZUVH field1288;

	@ObfuscatedName("UFBSEXDM.g")
	public TMVRZUVH field1289;

	@ObfuscatedName("UFBSEXDM.h")
	public TMVRZUVH field1290;

	@ObfuscatedName("UFBSEXDM.i")
	public TMVRZUVH field1291;

	@ObfuscatedName("UFBSEXDM.p")
	public TMVRZUVH field1298;

	@ObfuscatedName("UFBSEXDM.s")
	public static int[] field1301;

	@ObfuscatedName("UFBSEXDM.t")
	public static int[] field1302;

	@ObfuscatedName("UFBSEXDM.u")
	public static int[] field1303;

	@ObfuscatedName("UFBSEXDM.a()V")
	public static final void method495() {
		field1302 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1302[var0] = 1;
			} else {
				field1302[var0] = -1;
			}
		}

		field1303 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1303[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1301 = new int[220500];
	}

	@ObfuscatedName("UFBSEXDM.a(II)[I")
	public final int[] method496(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1301[var3] = 0;
		}

		if (arg1 < 10) {
			return field1301;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1284.method490();
		field1285.method490();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1286 != null) {
			field1286.method490();
			field1287.method490();
			var6 = (int) ((field1286.field1271 - field1286.field1270) * 32.768D / var4);
			var7 = (int) (field1286.field1270 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1288 != null) {
			field1288.method490();
			field1289.method490();
			var9 = (int) ((field1288.field1271 - field1288.field1270) * 32.768D / var4);
			var10 = (int) (field1288.field1270 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1292[var12] != 0) {
				field1304[var12] = 0;
				field1305[var12] = (int) (field1294[var12] * var4);
				field1306[var12] = (field1292[var12] << 14) / 100;
				field1307[var12] = (int) ((field1284.field1271 - field1284.field1270) * 32.768D * Math.pow(1.0057929410678534D, field1293[var12]) / var4);
				field1308[var12] = (int) (field1284.field1270 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1284.method491(arg0);
			int var15 = field1285.method491(arg0);

			if (field1286 != null) {
				int var16 = field1286.method491(arg0);
				int var17 = field1287.method491(arg0);
				var14 += method497(var8, field1286.field1272, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1288 != null) {
				int var18 = field1288.method491(arg0);
				int var19 = field1289.method491(arg0);
				var15 = var15 * ((method497(var11, field1288.field1272, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1292[var20] != 0) {
					int var21 = field1305[var20] + var13;
					if (var21 < arg0) {
						field1301[var21] += method497(field1304[var20], field1284.field1272, field1306[var20] * var15 >> 15);
						field1304[var20] += (field1307[var20] * var14 >> 16) + field1308[var20];
					}
				}
			}
		}

		if (field1290 != null) {
			field1290.method490();
			field1291.method490();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1290.method491(arg0);
				int var27 = field1291.method491(arg0);
				int var28;
				if (var24) {
					var28 = ((field1290.field1271 - field1290.field1270) * var26 >> 8) + field1290.field1270;
				} else {
					var28 = ((field1290.field1271 - field1290.field1270) * var27 >> 8) + field1290.field1270;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1301[var25] = 0;
				}
			}
		}

		if (field1295 > 0 && field1296 > 0) {
			int var29 = (int) (field1295 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1301[var30] += field1301[var30 - var29] * field1296 / 100;
			}
		}

		if (field1297.field864[0] > 0 || field1297.field864[1] > 0) {
			field1298.method490();
			int var31 = field1298.method491(arg0 + 1);
			int var32 = field1297.method306(var31 / 65536.0F, 0);
			int var33 = field1297.method306(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1301[var32 + var34] * (long) LOQKYCGM.field871 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1301[var32 + var34 - var37 - 1] * (long) LOQKYCGM.field869[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1301[var34 - var38 - 1] * (long) LOQKYCGM.field869[1][var38] >> 16);
					}

					field1301[var34] = var36;
					var31 = field1298.method491(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1301[var32 + var34] * (long) LOQKYCGM.field871 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1301[var32 + var34 - var42 - 1] * (long) LOQKYCGM.field869[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1301[var34 - var43 - 1] * (long) LOQKYCGM.field869[1][var43] >> 16);
						}

						field1301[var34] = var41;
						var31 = field1298.method491(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1297.method306(var31 / 65536.0F, 0);
					var33 = field1297.method306(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1301[var32 + var34 - var45 - 1] * (long) LOQKYCGM.field869[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1301[var34 - var46 - 1] * (long) LOQKYCGM.field869[1][var46] >> 16);
					}

					field1301[var34] = var44;
					field1298.method491(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1301[var48] < -32768) {
				field1301[var48] = -32768;
			}

			if (field1301[var48] > 32767) {
				field1301[var48] = 32767;
			}
		}

		return field1301;
	}

	@ObfuscatedName("UFBSEXDM.a(IIII)I")
	public final int method497(int arg0, int arg1, int arg2) {
		if (arg1 == 1) {
			if ((arg0 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg1 == 2) {
			return field1303[arg0 & 0x7FFF] * arg2 >> 14;
		}

		if (arg1 == 3) {
			return ((arg0 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg1 == 4) {
			return field1302[arg0 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("UFBSEXDM.a(LGHHPHSRU;I)V")
	public final void method498(GHHPHSRU arg0) {
		field1284 = new TMVRZUVH();
		field1284.method488(arg0);
		field1285 = new TMVRZUVH();
		field1285.method488(arg0);
		int var2 = arg0.method202();
		if (var2 != 0) {
			arg0.field667--;
			field1286 = new TMVRZUVH();
			field1286.method488(arg0);
			field1287 = new TMVRZUVH();
			field1287.method488(arg0);
		}

		int var3 = arg0.method202();
		if (var3 != 0) {
			arg0.field667--;
			field1288 = new TMVRZUVH();
			field1288.method488(arg0);
			field1289 = new TMVRZUVH();
			field1289.method488(arg0);
		}

		int var4 = arg0.method202();
		if (var4 != 0) {
			arg0.field667--;
			field1290 = new TMVRZUVH();
			field1290.method488(arg0);
			field1291 = new TMVRZUVH();
			field1291.method488(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method216();
			if (var6 == 0) {
				break;
			}

			field1292[var5] = var6;
			field1293[var5] = arg0.method215();
			field1294[var5] = arg0.method216();
		}

		field1295 = arg0.method216();
		field1296 = arg0.method216();
		field1299 = arg0.method204();
		field1300 = arg0.method204();
		field1297 = new LOQKYCGM();
		field1298 = new TMVRZUVH();
		field1297.method307(field1298, arg0);
	}
}
