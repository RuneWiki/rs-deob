package deob;

@ObfuscatedName("VJDNWPCM")
public final class VJDNWPCM extends DBHOKPMQ {

	@ObfuscatedName("VJDNWPCM.tb")
	public long field1392 = -1L;

	@ObfuscatedName("VJDNWPCM.Bb")
	public boolean field1400 = false;

	@ObfuscatedName("VJDNWPCM.Cb")
	public int[] field1401 = new int[12];

	@ObfuscatedName("VJDNWPCM.Eb")
	public int[] field1403 = new int[5];

	@ObfuscatedName("VJDNWPCM.Lb")
	public boolean field1410 = false;

	@ObfuscatedName("VJDNWPCM.Ob")
	public int field1412 = -1;

	@ObfuscatedName("VJDNWPCM.Qb")
	public int field1414 = -1;

	@ObfuscatedName("VJDNWPCM.Pb")
	public static QASTZCLF field1413 = new QASTZCLF(260);

	@ObfuscatedName("VJDNWPCM.ub")
	public int field1393;

	@ObfuscatedName("VJDNWPCM.vb")
	public int field1394;

	@ObfuscatedName("VJDNWPCM.wb")
	public int field1395;

	@ObfuscatedName("VJDNWPCM.xb")
	public int field1396;

	@ObfuscatedName("VJDNWPCM.yb")
	public int field1397;

	@ObfuscatedName("VJDNWPCM.zb")
	public int field1398;

	@ObfuscatedName("VJDNWPCM.Fb")
	public int field1404;

	@ObfuscatedName("VJDNWPCM.Gb")
	public int field1405;

	@ObfuscatedName("VJDNWPCM.Hb")
	public int field1406;

	@ObfuscatedName("VJDNWPCM.Jb")
	public int field1408;

	@ObfuscatedName("VJDNWPCM.Kb")
	public int field1409;

	@ObfuscatedName("VJDNWPCM.Nb")
	public int field1411;

	@ObfuscatedName("VJDNWPCM.Rb")
	public int field1415;

	@ObfuscatedName("VJDNWPCM.Sb")
	public int field1416;

	@ObfuscatedName("VJDNWPCM.rb")
	public long field1391;

	@ObfuscatedName("VJDNWPCM.Ib")
	public JJMVUSJJ field1407;

	@ObfuscatedName("VJDNWPCM.Ab")
	public NIJEYEOX field1399;

	@ObfuscatedName("VJDNWPCM.Db")
	public String field1402;

	@ObfuscatedName("VJDNWPCM.a(B)LJJMVUSJJ;")
	public final JJMVUSJJ method214() {
		if (!field1400) {
			return null;
		}

		JJMVUSJJ var1 = method523();
		if (var1 == null) {
			return null;
		}

		field541 = var1.field1343;
		var1.field835 = true;

		if (field1410) {
			return var1;
		}

		if (field529 != -1 && field530 != -1) {
			EBBSHPSJ var2 = EBBSHPSJ.field609[field529];
			JJMVUSJJ var3 = var2.method210();
			if (var3 != null) {
				JJMVUSJJ var4 = new JJMVUSJJ(true, OJYMITMR.method382(field530), false, var3);
				var4.method313(0, -field533, 0);
				var4.method307();
				var4.method308(var2.field613.field1434[field530]);
				var4.field834 = null;
				var4.field833 = null;

				if (var2.field616 != 128 || var2.field617 != 128) {
					var4.method316(var2.field617, var2.field616, var2.field616);
				}

				var4.method317(var2.field619 + 64, var2.field620 + 850, -30, -50, -30, true);
				JJMVUSJJ[] var5 = new JJMVUSJJ[] { var1, var4 };
				var1 = new JJMVUSJJ(var5, 2, true);
			}
		}

		if (field1407 != null) {
			if (client.field292 >= field1416) {
				field1407 = null;
			}

			if (client.field292 >= field1415 && client.field292 < field1416) {
				JJMVUSJJ var6 = field1407;
				var6.method313(field1404 - field548, field1405 - field1393, field1406 - field549);

				if (field528 == 512) {
					var6.method311();
					var6.method311();
					var6.method311();
				} else if (field528 == 1024) {
					var6.method311();
					var6.method311();
				} else if (field528 == 1536) {
					var6.method311();
				}

				JJMVUSJJ[] var7 = new JJMVUSJJ[] { var1, var6 };
				var1 = new JJMVUSJJ(var7, 2, true);

				if (field528 == 512) {
					var6.method311();
				} else if (field528 == 1024) {
					var6.method311();
					var6.method311();
				} else if (field528 == 1536) {
					var6.method311();
					var6.method311();
					var6.method311();
				}

				var6.method313(field548 - field1404, field1393 - field1405, field549 - field1406);
			}
		}

		var1.field835 = true;
		return var1;
	}

	@ObfuscatedName("VJDNWPCM.b(I)LJJMVUSJJ;")
	public final JJMVUSJJ method522() {
		if (!field1400) {
			return null;
		}

		if (field1399 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1401[var2];
				if (var3 >= 256 && var3 < 512 && !WINORGIB.field1418[var3 - 256].method529()) {
					var1 = true;
				}

				if (var3 >= 512 && !IXFCVZPT.method285(var3 - 512).method294(field1409)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			JJMVUSJJ[] var4 = new JJMVUSJJ[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1401[var6];
				if (var7 >= 256 && var7 < 512) {
					JJMVUSJJ var8 = WINORGIB.field1418[var7 - 256].method530();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					JJMVUSJJ var9 = IXFCVZPT.method285(var7 - 512).method290(field1409);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			JJMVUSJJ var10 = new JJMVUSJJ(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1403[var11] != 0) {
					var10.method314(client.field156[var11][0], client.field156[var11][field1403[var11]]);

					if (var11 == 1) {
						var10.method314(client.field304[0], client.field304[field1403[var11]]);
					}
				}
			}

			return var10;
		}

		return field1399.method364();
	}

	@ObfuscatedName("VJDNWPCM.a(I)Z")
	public final boolean method203() {
		if (!field1400) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("VJDNWPCM.c(I)LJJMVUSJJ;")
	public final JJMVUSJJ method523() {
		if (field1399 != null) {
			int var1 = -1;
			if (field543 >= 0 && field546 == 0) {
				var1 = XTKQUJNF.field1432[field543].field1434[field544];
			} else if (field562 >= 0) {
				var1 = XTKQUJNF.field1432[field562].field1434[field563];
			}

			return field1399.method368(var1, -1, null);
		}

		long var3 = field1391;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field543 >= 0 && field546 == 0) {
			XTKQUJNF var9 = XTKQUJNF.field1432[field543];
			var5 = var9.field1434[field544];

			if (field562 >= 0 && field562 != field535) {
				var6 = XTKQUJNF.field1432[field562].field1434[field563];
			}

			if (var9.field1441 >= 0) {
				var7 = var9.field1441;
				var3 += var7 - field1401[5] << 40;
			}

			if (var9.field1442 >= 0) {
				var8 = var9.field1442;
				var3 += var8 - field1401[3] << 48;
			}
		} else if (field562 >= 0) {
			var5 = XTKQUJNF.field1432[field562].field1434[field563];
		}

		JJMVUSJJ var10 = (JJMVUSJJ) field1413.method438(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1401[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !WINORGIB.field1418[var13 - 256].method527()) {
					var11 = true;
				}

				if (var13 >= 512 && !IXFCVZPT.method285(var13 - 512).method286(field1409)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1392 != -1L) {
					var10 = (JJMVUSJJ) field1413.method438(field1392);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			JJMVUSJJ[] var14 = new JJMVUSJJ[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1401[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					JJMVUSJJ var18 = WINORGIB.field1418[var17 - 256].method528();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					JJMVUSJJ var19 = IXFCVZPT.method285(var17 - 512).method289(field1409);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new JJMVUSJJ(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1403[var20] != 0) {
					var10.method314(client.field156[var20][0], client.field156[var20][field1403[var20]]);

					if (var20 == 1) {
						var10.method314(client.field304[0], client.field304[field1403[var20]]);
					}
				}
			}

			var10.method307();
			var10.method317(64, 850, -30, -50, -30, true);
			field1413.method439(var10, var3);
			field1392 = var3;
		}

		if (field1410) {
			return var10;
		}

		JJMVUSJJ var21 = JJMVUSJJ.field798;
		var21.method302(var10, OJYMITMR.method382(var5) & OJYMITMR.method382(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method309(var6, XTKQUJNF.field1432[field543].field1438, var5);
		} else if (var5 != -1) {
			var21.method308(var5);
		}

		var21.method304();
		var21.field834 = null;
		var21.field833 = null;
		return var21;
	}

	@ObfuscatedName("VJDNWPCM.a(ZLIUVBENCV;)V")
	public final void method524(IUVBENCV arg0) {
		arg0.field733 = 0;
		field1409 = arg0.method245();
		field1412 = arg0.method246();
		field1414 = arg0.method246();
		field1399 = null;
		field1411 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method245();
			if (var3 == 0) {
				field1401[var2] = 0;
			} else {
				int var4 = arg0.method245();
				field1401[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1401[0] == 0xFFFF) {
					field1399 = NIJEYEOX.method363(arg0.method247());
					break;
				}

				if (field1401[var2] >= 512 && field1401[var2] - 512 < IXFCVZPT.field757) {
					int var5 = IXFCVZPT.method285(field1401[var2] - 512).field775;
					if (var5 != 0) {
						field1411 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method245();
			if (var7 < 0 || var7 >= client.field156[var6].length) {
				var7 = 0;
			}

			field1403[var6] = var7;
		}

		field535 = arg0.method247();
		if (field535 == 0xFFFF) {
			field535 = -1;
		}

		field536 = arg0.method247();
		if (field536 == 0xFFFF) {
			field536 = -1;
		}

		field524 = arg0.method247();
		if (field524 == 0xFFFF) {
			field524 = -1;
		}

		field525 = arg0.method247();
		if (field525 == 0xFFFF) {
			field525 = -1;
		}

		field526 = arg0.method247();
		if (field526 == 0xFFFF) {
			field526 = -1;
		}

		field527 = arg0.method247();
		if (field527 == 0xFFFF) {
			field527 = -1;
		}

		field566 = arg0.method247();
		if (field566 == 0xFFFF) {
			field566 = -1;
		}

		field1402 = RSIGORUG.method456(RSIGORUG.method453(arg0.method251()));
		field1408 = arg0.method245();
		field1398 = arg0.method247();
		field1400 = true;
		field1391 = 0L;
		int var8 = field1401[5];
		int var9 = field1401[9];
		field1401[5] = var9;
		field1401[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1391 <<= 4;
			if (field1401[var10] >= 256) {
				field1391 += field1401[var10] - 256;
			}
		}

		if (field1401[0] >= 256) {
			field1391 += field1401[0] - 256 >> 4;
		}

		if (field1401[1] >= 256) {
			field1391 += field1401[1] - 256 >> 8;
		}

		field1401[5] = var8;
		field1401[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1391 <<= 3;
			field1391 += field1403[var11];
		}

		field1391 <<= 1;
		field1391 += field1409;
	}
}
