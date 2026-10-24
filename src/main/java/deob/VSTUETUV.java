package deob;

@ObfuscatedName("VSTUETUV")
public class VSTUETUV {

	@ObfuscatedName("VSTUETUV.l")
	public int[] field1315 = new int[5];

	@ObfuscatedName("VSTUETUV.m")
	public int[] field1316 = new int[5];

	@ObfuscatedName("VSTUETUV.n")
	public int[] field1317 = new int[5];

	@ObfuscatedName("VSTUETUV.p")
	public int field1319 = 100;

	@ObfuscatedName("VSTUETUV.s")
	public int field1322 = 500;

	@ObfuscatedName("VSTUETUV.x")
	public static int[] field1327 = new int[5];

	@ObfuscatedName("VSTUETUV.y")
	public static int[] field1328 = new int[5];

	@ObfuscatedName("VSTUETUV.z")
	public static int[] field1329 = new int[5];

	@ObfuscatedName("VSTUETUV.A")
	public static int[] field1330 = new int[5];

	@ObfuscatedName("VSTUETUV.B")
	public static int[] field1331 = new int[5];

	@ObfuscatedName("VSTUETUV.o")
	public int field1318;

	@ObfuscatedName("VSTUETUV.t")
	public int field1323;

	@ObfuscatedName("VSTUETUV.q")
	public ERCNIFTI field1320;

	@ObfuscatedName("VSTUETUV.d")
	public NXAZLFDC field1307;

	@ObfuscatedName("VSTUETUV.e")
	public NXAZLFDC field1308;

	@ObfuscatedName("VSTUETUV.f")
	public NXAZLFDC field1309;

	@ObfuscatedName("VSTUETUV.g")
	public NXAZLFDC field1310;

	@ObfuscatedName("VSTUETUV.h")
	public NXAZLFDC field1311;

	@ObfuscatedName("VSTUETUV.i")
	public NXAZLFDC field1312;

	@ObfuscatedName("VSTUETUV.j")
	public NXAZLFDC field1313;

	@ObfuscatedName("VSTUETUV.k")
	public NXAZLFDC field1314;

	@ObfuscatedName("VSTUETUV.r")
	public NXAZLFDC field1321;

	@ObfuscatedName("VSTUETUV.u")
	public static int[] field1324;

	@ObfuscatedName("VSTUETUV.v")
	public static int[] field1325;

	@ObfuscatedName("VSTUETUV.w")
	public static int[] field1326;

	@ObfuscatedName("VSTUETUV.a()V")
	public static final void method557() {
		field1325 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1325[var0] = 1;
			} else {
				field1325[var0] = -1;
			}
		}

		field1326 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1326[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1324 = new int[220500];
	}

	@ObfuscatedName("VSTUETUV.a(II)[I")
	public final int[] method558(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1324[var3] = 0;
		}

		if (arg1 < 10) {
			return field1324;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1307.method500();
		field1308.method500();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1309 != null) {
			field1309.method500();
			field1310.method500();
			var6 = (int) ((field1309.field986 - field1309.field985) * 32.768D / var4);
			var7 = (int) (field1309.field985 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1311 != null) {
			field1311.method500();
			field1312.method500();
			var9 = (int) ((field1311.field986 - field1311.field985) * 32.768D / var4);
			var10 = (int) (field1311.field985 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1315[var12] != 0) {
				field1327[var12] = 0;
				field1328[var12] = (int) (field1317[var12] * var4);
				field1329[var12] = (field1315[var12] << 14) / 100;
				field1330[var12] = (int) ((field1307.field986 - field1307.field985) * 32.768D * Math.pow(1.0057929410678534D, field1316[var12]) / var4);
				field1331[var12] = (int) (field1307.field985 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1307.method501(arg0);
			int var15 = field1308.method501(arg0);

			if (field1309 != null) {
				int var16 = field1309.method501(arg0);
				int var17 = field1310.method501(arg0);
				var14 += method559(field1309.field987, var8, var17) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1311 != null) {
				int var18 = field1311.method501(arg0);
				int var19 = field1312.method501(arg0);
				var15 = var15 * ((method559(field1311.field987, var11, var19) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1315[var20] != 0) {
					int var21 = field1328[var20] + var13;
					if (var21 < arg0) {
						field1324[var21] += method559(field1307.field987, field1327[var20], field1329[var20] * var15 >> 15);
						field1327[var20] += (field1330[var20] * var14 >> 16) + field1331[var20];
					}
				}
			}
		}

		if (field1313 != null) {
			field1313.method500();
			field1314.method500();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1313.method501(arg0);
				int var27 = field1314.method501(arg0);
				int var28;
				if (var24) {
					var28 = ((field1313.field986 - field1313.field985) * var26 >> 8) + field1313.field985;
				} else {
					var28 = ((field1313.field986 - field1313.field985) * var27 >> 8) + field1313.field985;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1324[var25] = 0;
				}
			}
		}

		if (field1318 > 0 && field1319 > 0) {
			int var29 = (int) (field1318 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1324[var30] += field1324[var30 - var29] * field1319 / 100;
			}
		}

		if (field1320.field600[0] > 0 || field1320.field600[1] > 0) {
			field1321.method500();
			int var31 = field1321.method501(arg0 + 1);
			int var32 = field1320.method238(var31 / 65536.0F, 0);
			int var33 = field1320.method238(var31 / 65536.0F, 1);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1324[var32 + var34] * (long) ERCNIFTI.field607 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1324[var32 + var34 - var37 - 1] * (long) ERCNIFTI.field605[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1324[var34 - var38 - 1] * (long) ERCNIFTI.field605[1][var38] >> 16);
					}

					field1324[var34] = var36;
					var31 = field1321.method501(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1324[var32 + var34] * (long) ERCNIFTI.field607 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1324[var32 + var34 - var42 - 1] * (long) ERCNIFTI.field605[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1324[var34 - var43 - 1] * (long) ERCNIFTI.field605[1][var43] >> 16);
						}

						field1324[var34] = var41;
						var31 = field1321.method501(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1320.method238(var31 / 65536.0F, 0);
					var33 = field1320.method238(var31 / 65536.0F, 1);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1324[var32 + var34 - var45 - 1] * (long) ERCNIFTI.field605[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1324[var34 - var46 - 1] * (long) ERCNIFTI.field605[1][var46] >> 16);
					}

					field1324[var34] = var44;
					field1321.method501(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1324[var48] < -32768) {
				field1324[var48] = -32768;
			}

			if (field1324[var48] > 32767) {
				field1324[var48] = 32767;
			}
		}

		return field1324;
	}

	@ObfuscatedName("VSTUETUV.a(IIII)I")
	public final int method559(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg1 & 0x7FFF) < 16384) {
				return arg2;
			}

			return -arg2;
		}

		if (arg0 == 2) {
			return field1326[arg1 & 0x7FFF] * arg2 >> 14;
		}

		if (arg0 == 3) {
			return ((arg1 & 0x7FFF) * arg2 >> 14) - arg2;
		}

		if (arg0 == 4) {
			return field1325[arg1 / 2607 & 0x7FFF] * arg2;
		}

		return 0;
	}

	@ObfuscatedName("VSTUETUV.a(LLDILQFVA;I)V")
	public final void method560(LDILQFVA arg0) {
		field1307 = new NXAZLFDC();
		field1307.method498(arg0);
		field1308 = new NXAZLFDC();
		field1308.method498(arg0);
		int var2 = arg0.method402();
		if (var2 != 0) {
			arg0.field902--;
			field1309 = new NXAZLFDC();
			field1309.method498(arg0);
			field1310 = new NXAZLFDC();
			field1310.method498(arg0);
		}

		int var3 = arg0.method402();
		if (var3 != 0) {
			arg0.field902--;
			field1311 = new NXAZLFDC();
			field1311.method498(arg0);
			field1312 = new NXAZLFDC();
			field1312.method498(arg0);
		}

		int var4 = arg0.method402();
		if (var4 != 0) {
			arg0.field902--;
			field1313 = new NXAZLFDC();
			field1313.method498(arg0);
			field1314 = new NXAZLFDC();
			field1314.method498(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method416();
			if (var6 == 0) {
				break;
			}

			field1315[var5] = var6;
			field1316[var5] = arg0.method415();
			field1317[var5] = arg0.method416();
		}

		field1318 = arg0.method416();
		field1319 = arg0.method416();
		field1322 = arg0.method404();
		field1323 = arg0.method404();
		field1320 = new ERCNIFTI();
		field1321 = new NXAZLFDC();
		field1320.method239(arg0, field1321);
	}
}
