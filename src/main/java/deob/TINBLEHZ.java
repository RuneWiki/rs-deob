package deob;

@ObfuscatedName("TINBLEHZ")
public final class TINBLEHZ extends AQPBLKMD {

	@ObfuscatedName("TINBLEHZ.tb")
	public long field1359 = -1L;

	@ObfuscatedName("TINBLEHZ.Bb")
	public int[] field1366 = new int[5];

	@ObfuscatedName("TINBLEHZ.Cb")
	public boolean field1367 = false;

	@ObfuscatedName("TINBLEHZ.Fb")
	public int[] field1369 = new int[12];

	@ObfuscatedName("TINBLEHZ.Mb")
	public int field1376 = -1;

	@ObfuscatedName("TINBLEHZ.Ob")
	public int field1378 = -1;

	@ObfuscatedName("TINBLEHZ.Pb")
	public boolean field1379 = false;

	@ObfuscatedName("TINBLEHZ.zb")
	public static LXKBDSHJ field1365 = new LXKBDSHJ(260);

	@ObfuscatedName("TINBLEHZ.pb")
	public int field1355;

	@ObfuscatedName("TINBLEHZ.qb")
	public int field1356;

	@ObfuscatedName("TINBLEHZ.rb")
	public int field1357;

	@ObfuscatedName("TINBLEHZ.sb")
	public int field1358;

	@ObfuscatedName("TINBLEHZ.ub")
	public int field1360;

	@ObfuscatedName("TINBLEHZ.vb")
	public int field1361;

	@ObfuscatedName("TINBLEHZ.wb")
	public int field1362;

	@ObfuscatedName("TINBLEHZ.xb")
	public int field1363;

	@ObfuscatedName("TINBLEHZ.Db")
	public int field1368;

	@ObfuscatedName("TINBLEHZ.Gb")
	public int field1370;

	@ObfuscatedName("TINBLEHZ.Hb")
	public int field1371;

	@ObfuscatedName("TINBLEHZ.Ib")
	public int field1372;

	@ObfuscatedName("TINBLEHZ.Kb")
	public int field1374;

	@ObfuscatedName("TINBLEHZ.Nb")
	public int field1377;

	@ObfuscatedName("TINBLEHZ.yb")
	public long field1364;

	@ObfuscatedName("TINBLEHZ.Jb")
	public OGORHYVW field1373;

	@ObfuscatedName("TINBLEHZ.Lb")
	public YXSRFNQD field1375;

	@ObfuscatedName("TINBLEHZ.Qb")
	public String field1380;

	@ObfuscatedName("TINBLEHZ.a(B)LOGORHYVW;")
	public final OGORHYVW method514() {
		if (field1375 != null) {
			int var1 = -1;
			if (field42 >= 0 && field45 == 0) {
				var1 = KSVXFIAD.field1002[field42].field1004[field43];
			} else if (field48 >= 0) {
				var1 = KSVXFIAD.field1002[field48].field1004[field49];
			}

			return field1375.method595(null, -1, var1);
		}

		long var3 = field1364;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field42 >= 0 && field45 == 0) {
			KSVXFIAD var9 = KSVXFIAD.field1002[field42];
			var5 = var9.field1004[field43];

			if (field48 >= 0 && field60 != field48) {
				var6 = KSVXFIAD.field1002[field48].field1004[field49];
			}

			if (var9.field1011 >= 0) {
				var7 = var9.field1011;
				var3 += var7 - field1369[5] << 40;
			}

			if (var9.field1012 >= 0) {
				var8 = var9.field1012;
				var3 += var8 - field1369[3] << 48;
			}
		} else if (field48 >= 0) {
			var5 = KSVXFIAD.field1002[field48].field1004[field49];
		}

		OGORHYVW var10 = (OGORHYVW) field1365.method413(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1369[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !NTHXISGN.field1096[var13 - 256].method425()) {
					var11 = true;
				}

				if (var13 >= 512 && !SNJEZIDX.method482(var13 - 512).method488(field1362)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1359 != -1L) {
					var10 = (OGORHYVW) field1365.method413(field1359);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			OGORHYVW[] var14 = new OGORHYVW[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1369[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					OGORHYVW var18 = NTHXISGN.field1096[var17 - 256].method426();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					OGORHYVW var19 = SNJEZIDX.method482(var17 - 512).method489(field1362);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new OGORHYVW(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1366[var20] != 0) {
					var10.method447(client.field327[var20][0], client.field327[var20][field1366[var20]]);

					if (var20 == 1) {
						var10.method447(client.field285[0], client.field285[field1366[var20]]);
					}
				}
			}

			var10.method440();
			var10.method450(64, 850, -30, -50, -30, true);
			field1365.method414(var10, var3);
			field1359 = var3;
		}

		if (field1379) {
			return var10;
		}

		OGORHYVW var21 = OGORHYVW.field1104;
		var21.method435(var10, OYJABRDD.method467(var5) & OYJABRDD.method467(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method442(KSVXFIAD.field1002[field42].field1008, var5, var6);
		} else if (var5 != -1) {
			var21.method441(var5);
		}

		var21.method437();
		var21.field1140 = null;
		var21.field1139 = null;
		return var21;
	}

	@ObfuscatedName("TINBLEHZ.b(B)LOGORHYVW;")
	public final OGORHYVW method515() {
		if (!field1367) {
			return null;
		}

		if (field1375 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1369[var2];
				if (var3 >= 256 && var3 < 512 && !NTHXISGN.field1096[var3 - 256].method427()) {
					var1 = true;
				}

				if (var3 >= 512 && !SNJEZIDX.method482(var3 - 512).method484(field1362)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			OGORHYVW[] var4 = new OGORHYVW[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1369[var6];
				if (var7 >= 256 && var7 < 512) {
					OGORHYVW var8 = NTHXISGN.field1096[var7 - 256].method428();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					OGORHYVW var9 = SNJEZIDX.method482(var7 - 512).method491(field1362);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			OGORHYVW var10 = new OGORHYVW(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1366[var11] != 0) {
					var10.method447(client.field327[var11][0], client.field327[var11][field1366[var11]]);

					if (var11 == 1) {
						var10.method447(client.field285[0], client.field285[field1366[var11]]);
					}
				}
			}

			return var10;
		}

		return field1375.method596();
	}

	@ObfuscatedName("TINBLEHZ.a(I)LOGORHYVW;")
	public final OGORHYVW method5() {
		if (!field1367) {
			return null;
		}

		OGORHYVW var1 = method514();
		if (var1 == null) {
			return null;
		}

		field51 = var1.field628;
		var1.field1141 = true;

		if (field1379) {
			return var1;
		}

		if (field16 != -1 && field17 != -1) {
			HTOEUNMD var2 = HTOEUNMD.field772[field16];
			OGORHYVW var3 = var2.method245();
			if (var3 != null) {
				OGORHYVW var4 = new OGORHYVW(true, var3, OYJABRDD.method467(field17), false);
				var4.method446(-field20, 0, 0);
				var4.method440();
				var4.method441(var2.field776.field1004[field17]);
				var4.field1140 = null;
				var4.field1139 = null;

				if (var2.field779 != 128 || var2.field780 != 128) {
					var4.method449(var2.field779, var2.field779, var2.field780);
				}

				var4.method450(var2.field782 + 64, var2.field783 + 850, -30, -50, -30, true);
				OGORHYVW[] var5 = new OGORHYVW[] { var1, var4 };
				var1 = new OGORHYVW(2, true, var5);
			}
		}

		if (field1373 != null) {
			if (client.field456 >= field1361) {
				field1373 = null;
			}

			if (client.field456 >= field1360 && client.field456 < field1361) {
				OGORHYVW var6 = field1373;
				var6.method446(field1371 - field1377, field1370 - field26, field1372 - field27);

				if (field70 == 512) {
					var6.method444();
					var6.method444();
					var6.method444();
				} else if (field70 == 1024) {
					var6.method444();
					var6.method444();
				} else if (field70 == 1536) {
					var6.method444();
				}

				OGORHYVW[] var7 = new OGORHYVW[] { var1, var6 };
				var1 = new OGORHYVW(2, true, var7);

				if (field70 == 512) {
					var6.method444();
				} else if (field70 == 1024) {
					var6.method444();
					var6.method444();
				} else if (field70 == 1536) {
					var6.method444();
					var6.method444();
					var6.method444();
				}

				var6.method446(field1377 - field1371, field26 - field1370, field27 - field1372);
			}
		}

		var1.field1141 = true;
		return var1;
	}

	@ObfuscatedName("TINBLEHZ.c(I)Z")
	public final boolean method8() {
		if (!field1367) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("TINBLEHZ.a(LTKPFKOXP;I)V")
	public final void method516(TKPFKOXP arg0) {
		arg0.field1382 = 0;
		field1362 = arg0.method529();
		field1378 = arg0.method530();
		field1376 = arg0.method530();
		field1375 = null;
		field1363 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method529();
			if (var3 == 0) {
				field1369[var2] = 0;
			} else {
				int var4 = arg0.method529();
				field1369[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1369[0] == 0xFFFF) {
					field1375 = YXSRFNQD.method598(arg0.method531());
					break;
				}

				if (field1369[var2] >= 512 && field1369[var2] - 512 < SNJEZIDX.field1246) {
					int var5 = SNJEZIDX.method482(field1369[var2] - 512).field1262;
					if (var5 != 0) {
						field1363 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method529();
			if (var7 < 0 || var7 >= client.field327[var6].length) {
				var7 = 0;
			}

			field1366[var6] = var7;
		}

		field60 = arg0.method531();
		if (field60 == 0xFFFF) {
			field60 = -1;
		}

		field61 = arg0.method531();
		if (field61 == 0xFFFF) {
			field61 = -1;
		}

		field21 = arg0.method531();
		if (field21 == 0xFFFF) {
			field21 = -1;
		}

		field22 = arg0.method531();
		if (field22 == 0xFFFF) {
			field22 = -1;
		}

		field23 = arg0.method531();
		if (field23 == 0xFFFF) {
			field23 = -1;
		}

		field24 = arg0.method531();
		if (field24 == 0xFFFF) {
			field24 = -1;
		}

		field59 = arg0.method531();
		if (field59 == 0xFFFF) {
			field59 = -1;
		}

		field1380 = DQKGVELR.method186(DQKGVELR.method183(arg0.method535()));
		field1374 = arg0.method529();
		field1368 = arg0.method531();
		field1367 = true;
		field1364 = 0L;
		int var8 = field1369[5];
		int var9 = field1369[9];
		field1369[5] = var9;
		field1369[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1364 <<= 4;
			if (field1369[var10] >= 256) {
				field1364 += field1369[var10] - 256;
			}
		}

		if (field1369[0] >= 256) {
			field1364 += field1369[0] - 256 >> 4;
		}

		if (field1369[1] >= 256) {
			field1364 += field1369[1] - 256 >> 8;
		}

		field1369[5] = var8;
		field1369[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1364 <<= 3;
			field1364 += field1366[var11];
		}

		field1364 <<= 1;
		field1364 += field1362;
	}
}
