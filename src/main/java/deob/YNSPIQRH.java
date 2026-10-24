package deob;

@ObfuscatedName("YNSPIQRH")
public final class YNSPIQRH extends UKUMCXZT {

	@ObfuscatedName("YNSPIQRH.tb")
	public long field1424 = -1L;

	@ObfuscatedName("YNSPIQRH.ub")
	public int[] field1425 = new int[5];

	@ObfuscatedName("YNSPIQRH.Pb")
	public int[] field1441 = new int[12];

	@ObfuscatedName("YNSPIQRH.Rb")
	public boolean field1443 = false;

	@ObfuscatedName("YNSPIQRH.Tb")
	public boolean field1445 = false;

	@ObfuscatedName("YNSPIQRH.Bb")
	public static TUCAQTOR field1430 = new TUCAQTOR(260);

	@ObfuscatedName("YNSPIQRH.qb")
	public int field1421;

	@ObfuscatedName("YNSPIQRH.rb")
	public int field1422;

	@ObfuscatedName("YNSPIQRH.wb")
	public int field1426;

	@ObfuscatedName("YNSPIQRH.xb")
	public int field1427;

	@ObfuscatedName("YNSPIQRH.yb")
	public int field1428;

	@ObfuscatedName("YNSPIQRH.Cb")
	public int field1431;

	@ObfuscatedName("YNSPIQRH.Fb")
	public int field1433;

	@ObfuscatedName("YNSPIQRH.Gb")
	public int field1434;

	@ObfuscatedName("YNSPIQRH.Hb")
	public int field1435;

	@ObfuscatedName("YNSPIQRH.Ib")
	public int field1436;

	@ObfuscatedName("YNSPIQRH.Mb")
	public int field1438;

	@ObfuscatedName("YNSPIQRH.Nb")
	public int field1439;

	@ObfuscatedName("YNSPIQRH.Ob")
	public int field1440;

	@ObfuscatedName("YNSPIQRH.Qb")
	public int field1442;

	@ObfuscatedName("YNSPIQRH.Sb")
	public int field1444;

	@ObfuscatedName("YNSPIQRH.Eb")
	public long field1432;

	@ObfuscatedName("YNSPIQRH.zb")
	public GEUHTGZJ field1429;

	@ObfuscatedName("YNSPIQRH.sb")
	public UGDYQAXI field1423;

	@ObfuscatedName("YNSPIQRH.Lb")
	public String field1437;

	@ObfuscatedName("YNSPIQRH.c(I)LGEUHTGZJ;")
	public final GEUHTGZJ method592() {
		if (field1423 != null) {
			int var1 = -1;
			if (field1339 >= 0 && field1342 == 0) {
				var1 = EJHGNUGE.field604[field1339].field606[field1340];
			} else if (field1354 >= 0) {
				var1 = EJHGNUGE.field604[field1354].field606[field1355];
			}

			return field1423.method575(-1, var1, null);
		}

		long var3 = field1432;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1339 >= 0 && field1342 == 0) {
			EJHGNUGE var9 = EJHGNUGE.field604[field1339];
			var5 = var9.field606[field1340];

			if (field1354 >= 0 && field1354 != field1332) {
				var6 = EJHGNUGE.field604[field1354].field606[field1355];
			}

			if (var9.field613 >= 0) {
				var7 = var9.field613;
				var3 += var7 - field1441[5] << 40;
			}

			if (var9.field614 >= 0) {
				var8 = var9.field614;
				var3 += var8 - field1441[3] << 48;
			}
		} else if (field1354 >= 0) {
			var5 = EJHGNUGE.field604[field1354].field606[field1355];
		}

		GEUHTGZJ var10 = (GEUHTGZJ) field1430.method566(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1441[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !PJCTWSQI.field1076[var13 - 256].method470()) {
					var11 = true;
				}

				if (var13 >= 512 && !FZACNING.method278(var13 - 512).method272(field1444)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1424 != -1L) {
					var10 = (GEUHTGZJ) field1430.method566(field1424);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			GEUHTGZJ[] var14 = new GEUHTGZJ[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1441[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					GEUHTGZJ var18 = PJCTWSQI.field1076[var17 - 256].method471();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					GEUHTGZJ var19 = FZACNING.method278(var17 - 512).method274(field1444);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new GEUHTGZJ(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1425[var20] != 0) {
					var10.method299(client.field519[var20][0], client.field519[var20][field1425[var20]]);

					if (var20 == 1) {
						var10.method299(client.field524[0], client.field524[field1425[var20]]);
					}
				}
			}

			var10.method292();
			var10.method302(64, 850, -30, -50, -30, true);
			field1430.method567(var10, var3);
			field1424 = var3;
		}

		if (field1445) {
			return var10;
		}

		GEUHTGZJ var21 = GEUHTGZJ.field709;
		var21.method287(var10, QWCFKPFT.method504(var5) & QWCFKPFT.method504(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method294(var5, EJHGNUGE.field604[field1339].field610, var6);
		} else if (var5 != -1) {
			var21.method293(var5);
		}

		var21.method289();
		var21.field746 = null;
		var21.field745 = null;
		return var21;
	}

	@ObfuscatedName("YNSPIQRH.a(LKHOMSBHW;Z)V")
	public final void method593(KHOMSBHW arg0) {
		arg0.field934 = 0;
		field1444 = arg0.method349();
		field1421 = arg0.method349();
		field1423 = null;
		field1438 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method349();
			if (var3 == 0) {
				field1441[var2] = 0;
			} else {
				int var4 = arg0.method349();
				field1441[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1441[0] == 0xFFFF) {
					field1423 = UGDYQAXI.method570(arg0.method351());
					break;
				}

				if (field1441[var2] >= 512 && field1441[var2] - 512 < FZACNING.field660) {
					int var5 = FZACNING.method278(field1441[var2] - 512).field677;
					if (var5 != 0) {
						field1438 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method349();
			if (var7 < 0 || var7 >= client.field519[var6].length) {
				var7 = 0;
			}

			field1425[var6] = var7;
		}

		field1332 = arg0.method351();
		if (field1332 == 0xFFFF) {
			field1332 = -1;
		}

		field1333 = arg0.method351();
		if (field1333 == 0xFFFF) {
			field1333 = -1;
		}

		field1347 = arg0.method351();
		if (field1347 == 0xFFFF) {
			field1347 = -1;
		}

		field1348 = arg0.method351();
		if (field1348 == 0xFFFF) {
			field1348 = -1;
		}

		field1349 = arg0.method351();
		if (field1349 == 0xFFFF) {
			field1349 = -1;
		}

		field1350 = arg0.method351();
		if (field1350 == 0xFFFF) {
			field1350 = -1;
		}

		field1369 = arg0.method351();
		if (field1369 == 0xFFFF) {
			field1369 = -1;
		}

		field1437 = UMKVTRLP.method584(UMKVTRLP.method581(arg0.method355()));
		field1422 = arg0.method349();
		field1442 = arg0.method351();
		field1443 = true;
		field1432 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1432 <<= 4;
			if (field1441[var8] >= 256) {
				field1432 += field1441[var8] - 256;
			}
		}

		if (field1441[0] >= 256) {
			field1432 += field1441[0] - 256 >> 4;
		}

		if (field1441[1] >= 256) {
			field1432 += field1441[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1432 <<= 3;
			field1432 += field1425[var9];
		}

		field1432 <<= 1;
		field1432 += field1444;
	}

	@ObfuscatedName("YNSPIQRH.b(I)Z")
	public final boolean method263() {
		if (!field1443) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("YNSPIQRH.a(B)LGEUHTGZJ;")
	public final GEUHTGZJ method221() {
		if (!field1443) {
			return null;
		}

		GEUHTGZJ var1 = method592();
		if (var1 == null) {
			return null;
		}

		field1353 = var1.field570;
		var1.field747 = true;

		if (field1445) {
			return var1;
		}

		if (field1370 != -1 && field1371 != -1) {
			IDBAHLFM var2 = IDBAHLFM.field805[field1370];
			GEUHTGZJ var3 = var2.method323();
			if (var3 != null) {
				GEUHTGZJ var4 = new GEUHTGZJ(QWCFKPFT.method504(field1371), var3, false, true);
				var4.method298(0, -field1374, 0);
				var4.method292();
				var4.method293(var2.field809.field606[field1371]);
				var4.field746 = null;
				var4.field745 = null;

				if (var2.field812 != 128 || var2.field813 != 128) {
					var4.method301(var2.field813, var2.field812, var2.field812);
				}

				var4.method302(var2.field815 + 64, var2.field816 + 850, -30, -50, -30, true);
				GEUHTGZJ[] var5 = new GEUHTGZJ[] { var1, var4 };
				var1 = new GEUHTGZJ(var5, 2, true);
			}
		}

		if (field1429 != null) {
			if (client.field420 >= field1440) {
				field1429 = null;
			}

			if (client.field420 >= field1439 && client.field420 < field1440) {
				GEUHTGZJ var6 = field1429;
				var6.method298(field1426 - field1326, field1427 - field1431, field1428 - field1327);

				if (field1344 == 512) {
					var6.method296();
					var6.method296();
					var6.method296();
				} else if (field1344 == 1024) {
					var6.method296();
					var6.method296();
				} else if (field1344 == 1536) {
					var6.method296();
				}

				GEUHTGZJ[] var7 = new GEUHTGZJ[] { var1, var6 };
				var1 = new GEUHTGZJ(var7, 2, true);

				if (field1344 == 512) {
					var6.method296();
				} else if (field1344 == 1024) {
					var6.method296();
					var6.method296();
				} else if (field1344 == 1536) {
					var6.method296();
					var6.method296();
					var6.method296();
				}

				var6.method298(field1326 - field1426, field1431 - field1427, field1327 - field1428);
			}
		}

		var1.field747 = true;
		return var1;
	}

	@ObfuscatedName("YNSPIQRH.d(I)LGEUHTGZJ;")
	public final GEUHTGZJ method594() {
		if (!field1443) {
			return null;
		}

		if (field1423 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1441[var2];
				if (var3 >= 256 && var3 < 512 && !PJCTWSQI.field1076[var3 - 256].method472()) {
					var1 = true;
				}

				if (var3 >= 512 && !FZACNING.method278(var3 - 512).method268(field1444)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			GEUHTGZJ[] var4 = new GEUHTGZJ[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1441[var6];
				if (var7 >= 256 && var7 < 512) {
					GEUHTGZJ var8 = PJCTWSQI.field1076[var7 - 256].method473();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					GEUHTGZJ var9 = FZACNING.method278(var7 - 512).method270(field1444);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			GEUHTGZJ var10 = new GEUHTGZJ(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1425[var11] != 0) {
					var10.method299(client.field519[var11][0], client.field519[var11][field1425[var11]]);

					if (var11 == 1) {
						var10.method299(client.field524[0], client.field524[field1425[var11]]);
					}
				}
			}

			return var10;
		}

		return field1423.method571();
	}
}
