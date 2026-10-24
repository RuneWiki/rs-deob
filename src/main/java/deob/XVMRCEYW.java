package deob;

@ObfuscatedName("XVMRCEYW")
public final class XVMRCEYW extends XEGGEBDS {

	@ObfuscatedName("XVMRCEYW.wb")
	public boolean field1372 = false;

	@ObfuscatedName("XVMRCEYW.Gb")
	public int[] field1381 = new int[12];

	@ObfuscatedName("XVMRCEYW.Mb")
	public long field1387 = -1L;

	@ObfuscatedName("XVMRCEYW.Ob")
	public int field1389 = -1;

	@ObfuscatedName("XVMRCEYW.Rb")
	public int[] field1392 = new int[5];

	@ObfuscatedName("XVMRCEYW.Sb")
	public int field1393 = -1;

	@ObfuscatedName("XVMRCEYW.Ub")
	public boolean field1395 = false;

	@ObfuscatedName("XVMRCEYW.Hb")
	public static ULDYKUPK field1382 = new ULDYKUPK(260);

	@ObfuscatedName("XVMRCEYW.ub")
	public int field1371;

	@ObfuscatedName("XVMRCEYW.xb")
	public int field1373;

	@ObfuscatedName("XVMRCEYW.yb")
	public int field1374;

	@ObfuscatedName("XVMRCEYW.zb")
	public int field1375;

	@ObfuscatedName("XVMRCEYW.Eb")
	public int field1379;

	@ObfuscatedName("XVMRCEYW.Fb")
	public int field1380;

	@ObfuscatedName("XVMRCEYW.Ib")
	public int field1383;

	@ObfuscatedName("XVMRCEYW.Jb")
	public int field1384;

	@ObfuscatedName("XVMRCEYW.Kb")
	public int field1385;

	@ObfuscatedName("XVMRCEYW.Lb")
	public int field1386;

	@ObfuscatedName("XVMRCEYW.Nb")
	public int field1388;

	@ObfuscatedName("XVMRCEYW.Qb")
	public int field1391;

	@ObfuscatedName("XVMRCEYW.Tb")
	public int field1394;

	@ObfuscatedName("XVMRCEYW.Vb")
	public int field1396;

	@ObfuscatedName("XVMRCEYW.Db")
	public long field1378;

	@ObfuscatedName("XVMRCEYW.Bb")
	public APPQAEOL field1377;

	@ObfuscatedName("XVMRCEYW.Ab")
	public JUQSYEMB field1376;

	@ObfuscatedName("XVMRCEYW.Pb")
	public String field1390;

	@ObfuscatedName("XVMRCEYW.a(LNQUAUMDT;Z)V")
	public final void method558(NQUAUMDT arg0) {
		arg0.field929 = 0;
		field1394 = arg0.method339();
		field1393 = arg0.method340();
		field1389 = arg0.method340();
		field1377 = null;
		field1396 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method339();
			if (var3 == 0) {
				field1381[var2] = 0;
			} else {
				int var4 = arg0.method339();
				field1381[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1381[0] == 0xFFFF) {
					field1377 = APPQAEOL.method10(arg0.method341());
					break;
				}

				if (field1381[var2] >= 512 && field1381[var2] - 512 < ULRRTYRQ.field1160) {
					int var5 = ULRRTYRQ.method520(field1381[var2] - 512).field1173;
					if (var5 != 0) {
						field1396 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method339();
			if (var7 < 0 || var7 >= client.field147[var6].length) {
				var7 = 0;
			}

			field1392[var6] = var7;
		}

		field1360 = arg0.method341();
		if (field1360 == 0xFFFF) {
			field1360 = -1;
		}

		field1361 = arg0.method341();
		if (field1361 == 0xFFFF) {
			field1361 = -1;
		}

		field1333 = arg0.method341();
		if (field1333 == 0xFFFF) {
			field1333 = -1;
		}

		field1334 = arg0.method341();
		if (field1334 == 0xFFFF) {
			field1334 = -1;
		}

		field1335 = arg0.method341();
		if (field1335 == 0xFFFF) {
			field1335 = -1;
		}

		field1336 = arg0.method341();
		if (field1336 == 0xFFFF) {
			field1336 = -1;
		}

		field1354 = arg0.method341();
		if (field1354 == 0xFFFF) {
			field1354 = -1;
		}

		field1390 = SISNGPYM.method432(SISNGPYM.method429(arg0.method345()));
		field1391 = arg0.method339();
		field1388 = arg0.method341();
		field1372 = true;
		field1378 = 0L;
		int var8 = field1381[5];
		int var9 = field1381[9];
		field1381[5] = var9;
		field1381[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1378 <<= 4;
			if (field1381[var10] >= 256) {
				field1378 += field1381[var10] - 256;
			}
		}

		if (field1381[0] >= 256) {
			field1378 += field1381[0] - 256 >> 4;
		}

		if (field1381[1] >= 256) {
			field1378 += field1381[1] - 256 >> 8;
		}

		field1381[5] = var8;
		field1381[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1378 <<= 3;
			field1378 += field1392[var11];
		}

		field1378 <<= 1;
		field1378 += field1394;
	}

	@ObfuscatedName("XVMRCEYW.c(I)LJUQSYEMB;")
	public final JUQSYEMB method559() {
		if (!field1372) {
			return null;
		}

		if (field1377 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1381[var2];
				if (var3 >= 256 && var3 < 512 && !TMMXBYBU.field1075[var3 - 256].method454()) {
					var1 = true;
				}

				if (var3 >= 512 && !ULRRTYRQ.method520(var3 - 512).method516(field1394)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			JUQSYEMB[] var4 = new JUQSYEMB[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1381[var6];
				if (var7 >= 256 && var7 < 512) {
					JUQSYEMB var8 = TMMXBYBU.field1075[var7 - 256].method455();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					JUQSYEMB var9 = ULRRTYRQ.method520(var7 - 512).method513(field1394);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			JUQSYEMB var10 = new JUQSYEMB(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1392[var11] != 0) {
					var10.method226(client.field147[var11][0], client.field147[var11][field1392[var11]]);

					if (var11 == 1) {
						var10.method226(client.field419[0], client.field419[field1392[var11]]);
					}
				}
			}

			return var10;
		}

		return field1377.method12();
	}

	@ObfuscatedName("XVMRCEYW.b(I)Z")
	public final boolean method166() {
		if (!field1372) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("XVMRCEYW.a(I)LJUQSYEMB;")
	public final JUQSYEMB method167() {
		if (!field1372) {
			return null;
		}

		JUQSYEMB var1 = method560();
		if (var1 == null) {
			return null;
		}

		field1338 = var1.field1049;
		var1.field713 = true;

		if (field1395) {
			return var1;
		}

		if (field1328 != -1 && field1329 != -1) {
			PHXJLMVH var2 = PHXJLMVH.field975[field1328];
			JUQSYEMB var3 = var2.method414();
			if (var3 != null) {
				JUQSYEMB var4 = new JUQSYEMB(false, true, var3, YYYUATIU.method579(field1329));
				var4.method225(0, 0, -field1332);
				var4.method219();
				var4.method220(var2.field979.field830[field1329]);
				var4.field712 = null;
				var4.field711 = null;

				if (var2.field982 != 128 || var2.field983 != 128) {
					var4.method228(var2.field982, var2.field983, var2.field982);
				}

				var4.method229(var2.field985 + 64, var2.field986 + 850, -30, -50, -30, true);
				JUQSYEMB[] var5 = new JUQSYEMB[] { var1, var4 };
				var1 = new JUQSYEMB(true, var5, 2);
			}
		}

		if (field1376 != null) {
			if (client.field512 >= field1380) {
				field1376 = null;
			}

			if (client.field512 >= field1379 && client.field512 < field1380) {
				JUQSYEMB var6 = field1376;
				var6.method225(field1375 - field1343, field1373 - field1342, field1374 - field1371);

				if (field1340 == 512) {
					var6.method223();
					var6.method223();
					var6.method223();
				} else if (field1340 == 1024) {
					var6.method223();
					var6.method223();
				} else if (field1340 == 1536) {
					var6.method223();
				}

				JUQSYEMB[] var7 = new JUQSYEMB[] { var1, var6 };
				var1 = new JUQSYEMB(true, var7, 2);

				if (field1340 == 512) {
					var6.method223();
				} else if (field1340 == 1024) {
					var6.method223();
					var6.method223();
				} else if (field1340 == 1536) {
					var6.method223();
					var6.method223();
					var6.method223();
				}

				var6.method225(field1343 - field1375, field1342 - field1373, field1371 - field1374);
			}
		}

		var1.field713 = true;
		return var1;
	}

	@ObfuscatedName("XVMRCEYW.d(I)LJUQSYEMB;")
	public final JUQSYEMB method560() {
		if (field1377 != null) {
			int var1 = -1;
			if (field1345 >= 0 && field1348 == 0) {
				var1 = KYGPROVJ.field828[field1345].field830[field1346];
			} else if (field1323 >= 0) {
				var1 = KYGPROVJ.field828[field1323].field830[field1324];
			}

			return field1377.method7(-1, null, var1);
		}

		long var3 = field1378;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1345 >= 0 && field1348 == 0) {
			KYGPROVJ var9 = KYGPROVJ.field828[field1345];
			var5 = var9.field830[field1346];

			if (field1323 >= 0 && field1360 != field1323) {
				var6 = KYGPROVJ.field828[field1323].field830[field1324];
			}

			if (var9.field837 >= 0) {
				var7 = var9.field837;
				var3 += var7 - field1381[5] << 40;
			}

			if (var9.field838 >= 0) {
				var8 = var9.field838;
				var3 += var8 - field1381[3] << 48;
			}
		} else if (field1323 >= 0) {
			var5 = KYGPROVJ.field828[field1323].field830[field1324];
		}

		JUQSYEMB var10 = (JUQSYEMB) field1382.method509(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1381[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !TMMXBYBU.field1075[var13 - 256].method452()) {
					var11 = true;
				}

				if (var13 >= 512 && !ULRRTYRQ.method520(var13 - 512).method522(field1394)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1387 != -1L) {
					var10 = (JUQSYEMB) field1382.method509(field1387);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			JUQSYEMB[] var14 = new JUQSYEMB[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1381[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					JUQSYEMB var18 = TMMXBYBU.field1075[var17 - 256].method453();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					JUQSYEMB var19 = ULRRTYRQ.method520(var17 - 512).method517(field1394);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new JUQSYEMB(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1392[var20] != 0) {
					var10.method226(client.field147[var20][0], client.field147[var20][field1392[var20]]);

					if (var20 == 1) {
						var10.method226(client.field419[0], client.field419[field1392[var20]]);
					}
				}
			}

			var10.method219();
			var10.method229(64, 850, -30, -50, -30, true);
			field1382.method510(var3, var10);
			field1387 = var3;
		}

		if (field1395) {
			return var10;
		}

		JUQSYEMB var21 = JUQSYEMB.field676;
		var21.method214(YYYUATIU.method579(var5) & YYYUATIU.method579(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method221(var5, var6, KYGPROVJ.field828[field1345].field834);
		} else if (var5 != -1) {
			var21.method220(var5);
		}

		var21.method216();
		var21.field712 = null;
		var21.field711 = null;
		return var21;
	}
}
