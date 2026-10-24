package deob;

@ObfuscatedName("VUJNNHKQ")
public class VUJNNHKQ {

	@ObfuscatedName("VUJNNHKQ.i")
	public int[] field1323 = new int[5];

	@ObfuscatedName("VUJNNHKQ.j")
	public int[] field1324 = new int[5];

	@ObfuscatedName("VUJNNHKQ.k")
	public int[] field1325 = new int[5];

	@ObfuscatedName("VUJNNHKQ.m")
	public int field1327 = 100;

	@ObfuscatedName("VUJNNHKQ.p")
	public int field1330 = 500;

	@ObfuscatedName("VUJNNHKQ.u")
	public static int[] field1335 = new int[5];

	@ObfuscatedName("VUJNNHKQ.v")
	public static int[] field1336 = new int[5];

	@ObfuscatedName("VUJNNHKQ.w")
	public static int[] field1337 = new int[5];

	@ObfuscatedName("VUJNNHKQ.x")
	public static int[] field1338 = new int[5];

	@ObfuscatedName("VUJNNHKQ.y")
	public static int[] field1339 = new int[5];

	@ObfuscatedName("VUJNNHKQ.l")
	public int field1326;

	@ObfuscatedName("VUJNNHKQ.q")
	public int field1331;

	@ObfuscatedName("VUJNNHKQ.a")
	public MMADHCLT field1315;

	@ObfuscatedName("VUJNNHKQ.b")
	public MMADHCLT field1316;

	@ObfuscatedName("VUJNNHKQ.c")
	public MMADHCLT field1317;

	@ObfuscatedName("VUJNNHKQ.d")
	public MMADHCLT field1318;

	@ObfuscatedName("VUJNNHKQ.e")
	public MMADHCLT field1319;

	@ObfuscatedName("VUJNNHKQ.f")
	public MMADHCLT field1320;

	@ObfuscatedName("VUJNNHKQ.g")
	public MMADHCLT field1321;

	@ObfuscatedName("VUJNNHKQ.h")
	public MMADHCLT field1322;

	@ObfuscatedName("VUJNNHKQ.o")
	public MMADHCLT field1329;

	@ObfuscatedName("VUJNNHKQ.n")
	public RMKIQWOG field1328;

	@ObfuscatedName("VUJNNHKQ.r")
	public static int[] field1332;

	@ObfuscatedName("VUJNNHKQ.s")
	public static int[] field1333;

	@ObfuscatedName("VUJNNHKQ.t")
	public static int[] field1334;

	@ObfuscatedName("VUJNNHKQ.a()V")
	public static final void method514() {
		field1333 = new int[32768];
		for (int var0 = 0; var0 < 32768; var0++) {
			if (Math.random() > 0.5D) {
				field1333[var0] = 1;
			} else {
				field1333[var0] = -1;
			}
		}

		field1334 = new int[32768];
		for (int var1 = 0; var1 < 32768; var1++) {
			field1334[var1] = (int) (Math.sin(var1 / 5215.1903D) * 16384.0D);
		}

		field1332 = new int[220500];
	}

	@ObfuscatedName("VUJNNHKQ.a(II)[I")
	public final int[] method515(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; var3++) {
			field1332[var3] = 0;
		}

		if (arg1 < 10) {
			return field1332;
		}

		double var4 = arg0 / (arg1 + 0.0D);
		field1315.method326();
		field1316.method326();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;

		if (field1317 != null) {
			field1317.method326();
			field1318.method326();
			var6 = (int) ((field1317.field932 - field1317.field931) * 32.768D / var4);
			var7 = (int) (field1317.field931 * 32.768D / var4);
		}

		int var9 = 0;
		int var10 = 0;
		int var11 = 0;

		if (field1319 != null) {
			field1319.method326();
			field1320.method326();
			var9 = (int) ((field1319.field932 - field1319.field931) * 32.768D / var4);
			var10 = (int) (field1319.field931 * 32.768D / var4);
		}

		for (int var12 = 0; var12 < 5; var12++) {
			if (field1323[var12] != 0) {
				field1335[var12] = 0;
				field1336[var12] = (int) (field1325[var12] * var4);
				field1337[var12] = (field1323[var12] << 14) / 100;
				field1338[var12] = (int) ((field1315.field932 - field1315.field931) * 32.768D * Math.pow(1.0057929410678534D, field1324[var12]) / var4);
				field1339[var12] = (int) (field1315.field931 * 32.768D / var4);
			}
		}

		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = field1315.method327(arg0);
			int var15 = field1316.method327(arg0);

			if (field1317 != null) {
				int var16 = field1317.method327(arg0);
				int var17 = field1318.method327(arg0);
				var14 += method516(field1317.field933, var17, var8) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}

			if (field1319 != null) {
				int var18 = field1319.method327(arg0);
				int var19 = field1320.method327(arg0);
				var15 = var15 * ((method516(field1319.field933, var19, var11) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}

			for (int var20 = 0; var20 < 5; var20++) {
				if (field1323[var20] != 0) {
					int var21 = field1336[var20] + var13;
					if (var21 < arg0) {
						field1332[var21] += method516(field1315.field933, field1337[var20] * var15 >> 15, field1335[var20]);
						field1335[var20] += (field1338[var20] * var14 >> 16) + field1339[var20];
					}
				}
			}
		}

		if (field1321 != null) {
			field1321.method326();
			field1322.method326();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = field1321.method327(arg0);
				int var27 = field1322.method327(arg0);
				int var28;
				if (var24) {
					var28 = ((field1321.field932 - field1321.field931) * var26 >> 8) + field1321.field931;
				} else {
					var28 = ((field1321.field932 - field1321.field931) * var27 >> 8) + field1321.field931;
				}

				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}

				if (var24) {
					field1332[var25] = 0;
				}
			}
		}

		if (field1326 > 0 && field1327 > 0) {
			int var29 = (int) (field1326 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1332[var30] += field1332[var30 - var29] * field1327 / 100;
			}
		}

		if (field1328.field1128[0] > 0 || field1328.field1128[1] > 0) {
			field1329.method326();
			int var31 = field1329.method327(arg0 + 1);
			int var32 = field1328.method419(0, var31 / 65536.0F);
			int var33 = field1328.method419(1, var31 / 65536.0F);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}

				while (var34 < var35) {
					int var36 = (int) (field1332[var32 + var34] * (long) RMKIQWOG.field1135 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) (field1332[var32 + var34 - var37 - 1] * (long) RMKIQWOG.field1133[0][var37] >> 16);
					}

					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) (field1332[var34 - var38 - 1] * (long) RMKIQWOG.field1133[1][var38] >> 16);
					}

					field1332[var34] = var36;
					var31 = field1329.method327(arg0 + 1);
					var34++;
				}

				short var39 = 128;
				int var40 = var39;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}

					while (var34 < var40) {
						int var41 = (int) (field1332[var32 + var34] * (long) RMKIQWOG.field1135 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) (field1332[var32 + var34 - var42 - 1] * (long) RMKIQWOG.field1133[0][var42] >> 16);
						}

						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) (field1332[var34 - var43 - 1] * (long) RMKIQWOG.field1133[1][var43] >> 16);
						}

						field1332[var34] = var41;
						var31 = field1329.method327(arg0 + 1);
						var34++;
					}

					if (var34 >= arg0 - var32) {
						break;
					}

					var32 = field1328.method419(0, var31 / 65536.0F);
					var33 = field1328.method419(1, var31 / 65536.0F);
					var40 += var39;
				}

				while (var34 < arg0) {
					int var44 = 0;
					for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
						var44 += (int) (field1332[var32 + var34 - var45 - 1] * (long) RMKIQWOG.field1133[0][var45] >> 16);
					}

					for (int var46 = 0; var46 < var33; var46++) {
						var44 -= (int) (field1332[var34 - var46 - 1] * (long) RMKIQWOG.field1133[1][var46] >> 16);
					}

					field1332[var34] = var44;
					field1329.method327(arg0 + 1);
					var34++;
				}
			}
		}

		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1332[var48] < -32768) {
				field1332[var48] = -32768;
			}

			if (field1332[var48] > 32767) {
				field1332[var48] = 32767;
			}
		}

		return field1332;
	}

	@ObfuscatedName("VUJNNHKQ.a(IIZI)I")
	public final int method516(int arg0, int arg1, int arg2) {
		if (arg0 == 1) {
			if ((arg2 & 0x7FFF) < 16384) {
				return arg1;
			}

			return -arg1;
		}

		if (arg0 == 2) {
			return field1334[arg2 & 0x7FFF] * arg1 >> 14;
		}

		if (arg0 == 3) {
			return ((arg2 & 0x7FFF) * arg1 >> 14) - arg1;
		}

		if (arg0 == 4) {
			return field1333[arg2 / 2607 & 0x7FFF] * arg1;
		}

		return 0;
	}

	@ObfuscatedName("VUJNNHKQ.a(ILUAWAYCTK;)V")
	public final void method517(UAWAYCTK arg0) {
		field1315 = new MMADHCLT();
		field1315.method324(arg0);
		field1316 = new MMADHCLT();
		field1316.method324(arg0);
		int var2 = arg0.method455();
		if (var2 != 0) {
			arg0.field1252--;
			field1317 = new MMADHCLT();
			field1317.method324(arg0);
			field1318 = new MMADHCLT();
			field1318.method324(arg0);
		}

		int var3 = arg0.method455();
		if (var3 != 0) {
			arg0.field1252--;
			field1319 = new MMADHCLT();
			field1319.method324(arg0);
			field1320 = new MMADHCLT();
			field1320.method324(arg0);
		}

		int var4 = arg0.method455();
		if (var4 != 0) {
			arg0.field1252--;
			field1321 = new MMADHCLT();
			field1321.method324(arg0);
			field1322 = new MMADHCLT();
			field1322.method324(arg0);
		}

		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method469();
			if (var6 == 0) {
				break;
			}

			field1323[var5] = var6;
			field1324[var5] = arg0.method468();
			field1325[var5] = arg0.method469();
		}

		field1326 = arg0.method469();
		field1327 = arg0.method469();
		field1330 = arg0.method457();
		field1331 = arg0.method457();
		field1328 = new RMKIQWOG();
		field1329 = new MMADHCLT();
		field1328.method420(arg0, field1329);
	}
}
