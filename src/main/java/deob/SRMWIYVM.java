package deob;

@ObfuscatedName("SRMWIYVM")
public final class SRMWIYVM extends CELKGLWS {

	@ObfuscatedName("SRMWIYVM.Bb")
	public int[] field1356 = new int[5];

	@ObfuscatedName("SRMWIYVM.Cb")
	public boolean field1357 = false;

	@ObfuscatedName("SRMWIYVM.Eb")
	public long field1359 = -1L;

	@ObfuscatedName("SRMWIYVM.Ib")
	public int[] field1362 = new int[12];

	@ObfuscatedName("SRMWIYVM.Kb")
	public int field1364 = -1;

	@ObfuscatedName("SRMWIYVM.Sb")
	public int field1370 = -1;

	@ObfuscatedName("SRMWIYVM.Ub")
	public boolean field1372 = false;

	@ObfuscatedName("SRMWIYVM.Ab")
	public static NQQFCAPC field1355 = new NQQFCAPC(260);

	@ObfuscatedName("SRMWIYVM.sb")
	public int field1348;

	@ObfuscatedName("SRMWIYVM.tb")
	public int field1349;

	@ObfuscatedName("SRMWIYVM.ub")
	public int field1350;

	@ObfuscatedName("SRMWIYVM.vb")
	public int field1351;

	@ObfuscatedName("SRMWIYVM.wb")
	public int field1352;

	@ObfuscatedName("SRMWIYVM.Db")
	public int field1358;

	@ObfuscatedName("SRMWIYVM.Gb")
	public int field1360;

	@ObfuscatedName("SRMWIYVM.Hb")
	public int field1361;

	@ObfuscatedName("SRMWIYVM.Jb")
	public int field1363;

	@ObfuscatedName("SRMWIYVM.Mb")
	public int field1365;

	@ObfuscatedName("SRMWIYVM.Nb")
	public int field1366;

	@ObfuscatedName("SRMWIYVM.Ob")
	public int field1367;

	@ObfuscatedName("SRMWIYVM.Pb")
	public int field1368;

	@ObfuscatedName("SRMWIYVM.Vb")
	public int field1373;

	@ObfuscatedName("SRMWIYVM.yb")
	public long field1354;

	@ObfuscatedName("SRMWIYVM.Qb")
	public FCIDIKVY field1369;

	@ObfuscatedName("SRMWIYVM.xb")
	public PJGEBWSY field1353;

	@ObfuscatedName("SRMWIYVM.Tb")
	public String field1371;

	@ObfuscatedName("SRMWIYVM.a(ILWBEWPIXO;)V")
	public final void method454(WBEWPIXO arg0) {
		arg0.field1401 = 0;
		field1358 = arg0.method515();
		field1364 = arg0.method516();
		field1370 = arg0.method516();
		field1353 = null;
		field1373 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method515();
			if (var3 == 0) {
				field1362[var2] = 0;
			} else {
				int var4 = arg0.method515();
				field1362[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1362[0] == 0xFFFF) {
					field1353 = PJGEBWSY.method393(arg0.method517());
					break;
				}

				if (field1362[var2] >= 512 && field1362[var2] - 512 < AAHIRSBF.field16) {
					int var5 = AAHIRSBF.method7(field1362[var2] - 512).field46;
					if (var5 != 0) {
						field1373 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method515();
			if (var7 < 0 || var7 >= client.field337[var6].length) {
				var7 = 0;
			}

			field1356[var6] = var7;
		}

		field195 = arg0.method517();
		if (field195 == 0xFFFF) {
			field195 = -1;
		}

		field196 = arg0.method517();
		if (field196 == 0xFFFF) {
			field196 = -1;
		}

		field148 = arg0.method517();
		if (field148 == 0xFFFF) {
			field148 = -1;
		}

		field149 = arg0.method517();
		if (field149 == 0xFFFF) {
			field149 = -1;
		}

		field150 = arg0.method517();
		if (field150 == 0xFFFF) {
			field150 = -1;
		}

		field151 = arg0.method517();
		if (field151 == 0xFFFF) {
			field151 = -1;
		}

		field189 = arg0.method517();
		if (field189 == 0xFFFF) {
			field189 = -1;
		}

		field1371 = XLAXYQGJ.method582(XLAXYQGJ.method579(arg0.method521()));
		field1363 = arg0.method515();
		field1352 = arg0.method517();
		field1372 = true;
		field1354 = 0L;
		int var8 = field1362[5];
		int var9 = field1362[9];
		field1362[5] = var9;
		field1362[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1354 <<= 4;
			if (field1362[var10] >= 256) {
				field1354 += field1362[var10] - 256;
			}
		}

		if (field1362[0] >= 256) {
			field1354 += field1362[0] - 256 >> 4;
		}

		if (field1362[1] >= 256) {
			field1354 += field1362[1] - 256 >> 8;
		}

		field1362[5] = var8;
		field1362[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1354 <<= 3;
			field1354 += field1356[var11];
		}

		field1354 <<= 1;
		field1354 += field1358;
	}

	@ObfuscatedName("SRMWIYVM.b(Z)LFCIDIKVY;")
	public final FCIDIKVY method455() {
		if (!field1372) {
			return null;
		}

		if (field1353 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1362[var2];
				if (var3 >= 256 && var3 < 512 && !FDNUHSLC.field752[var3 - 256].method229()) {
					var1 = true;
				}

				if (var3 >= 512 && !AAHIRSBF.method7(var3 - 512).method2(field1358)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			FCIDIKVY[] var4 = new FCIDIKVY[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1362[var6];
				if (var7 >= 256 && var7 < 512) {
					FCIDIKVY var8 = FDNUHSLC.field752[var7 - 256].method230();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					FCIDIKVY var9 = AAHIRSBF.method7(var7 - 512).method6(field1358);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			FCIDIKVY var10 = new FCIDIKVY(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1356[var11] != 0) {
					var10.method213(client.field337[var11][0], client.field337[var11][field1356[var11]]);

					if (var11 == 1) {
						var10.method213(client.field475[0], client.field475[field1356[var11]]);
					}
				}
			}

			return var10;
		}

		return field1353.method395();
	}

	@ObfuscatedName("SRMWIYVM.a(I)LFCIDIKVY;")
	public final FCIDIKVY method187() {
		if (!field1372) {
			return null;
		}

		FCIDIKVY var1 = method456();
		if (var1 == null) {
			return null;
		}

		field190 = var1.field660;
		var1.field717 = true;

		if (field1357) {
			return var1;
		}

		if (field165 != -1 && field166 != -1) {
			XBHNZKGU var2 = XBHNZKGU.field1435[field165];
			FCIDIKVY var3 = var2.method563();
			if (var3 != null) {
				FCIDIKVY var4 = new FCIDIKVY(false, FGGKJQKK.method235(field166), var3, true);
				var4.method212(0, -field169, 0);
				var4.method206();
				var4.method207(var2.field1439.field1476[field166]);
				var4.field716 = null;
				var4.field715 = null;

				if (var2.field1442 != 128 || var2.field1443 != 128) {
					var4.method215(var2.field1442, var2.field1442, var2.field1443);
				}

				var4.method216(var2.field1445 + 64, var2.field1446 + 850, -30, -50, -30, true);
				FCIDIKVY[] var5 = new FCIDIKVY[] { var1, var4 };
				var1 = new FCIDIKVY(true, var5, 2);
			}
		}

		if (field1369 != null) {
			if (client.field552 >= field1361) {
				field1369 = null;
			}

			if (client.field552 >= field1360 && client.field552 < field1361) {
				FCIDIKVY var6 = field1369;
				var6.method212(field1368 - field192, field1367 - field1365, field1366 - field191);

				if (field194 == 512) {
					var6.method210();
					var6.method210();
					var6.method210();
				} else if (field194 == 1024) {
					var6.method210();
					var6.method210();
				} else if (field194 == 1536) {
					var6.method210();
				}

				FCIDIKVY[] var7 = new FCIDIKVY[] { var1, var6 };
				var1 = new FCIDIKVY(true, var7, 2);

				if (field194 == 512) {
					var6.method210();
				} else if (field194 == 1024) {
					var6.method210();
					var6.method210();
				} else if (field194 == 1536) {
					var6.method210();
					var6.method210();
					var6.method210();
				}

				var6.method212(field192 - field1368, field1365 - field1367, field191 - field1366);
			}
		}

		var1.field717 = true;
		return var1;
	}

	@ObfuscatedName("SRMWIYVM.b(I)Z")
	public final boolean method42() {
		if (!field1372) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("SRMWIYVM.a(B)LFCIDIKVY;")
	public final FCIDIKVY method456() {
		if (field1353 != null) {
			int var1 = -1;
			if (field183 >= 0 && field186 == 0) {
				var1 = XETSOHUA.field1474[field183].field1476[field184];
			} else if (field145 >= 0) {
				var1 = XETSOHUA.field1474[field145].field1476[field146];
			}

			return field1353.method396(null, var1, -1);
		}

		long var3 = field1354;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field183 >= 0 && field186 == 0) {
			XETSOHUA var9 = XETSOHUA.field1474[field183];
			var5 = var9.field1476[field184];

			if (field145 >= 0 && field195 != field145) {
				var6 = XETSOHUA.field1474[field145].field1476[field146];
			}

			if (var9.field1483 >= 0) {
				var7 = var9.field1483;
				var3 += var7 - field1362[5] << 40;
			}

			if (var9.field1484 >= 0) {
				var8 = var9.field1484;
				var3 += var8 - field1362[3] << 48;
			}
		} else if (field145 >= 0) {
			var5 = XETSOHUA.field1474[field145].field1476[field146];
		}

		FCIDIKVY var10 = (FCIDIKVY) field1355.method334(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1362[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !FDNUHSLC.field752[var13 - 256].method227()) {
					var11 = true;
				}

				if (var13 >= 512 && !AAHIRSBF.method7(var13 - 512).method13(field1358)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1359 != -1L) {
					var10 = (FCIDIKVY) field1355.method334(field1359);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			FCIDIKVY[] var14 = new FCIDIKVY[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1362[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					FCIDIKVY var18 = FDNUHSLC.field752[var17 - 256].method228();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					FCIDIKVY var19 = AAHIRSBF.method7(var17 - 512).method3(field1358);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new FCIDIKVY(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1356[var20] != 0) {
					var10.method213(client.field337[var20][0], client.field337[var20][field1356[var20]]);

					if (var20 == 1) {
						var10.method213(client.field475[0], client.field475[field1356[var20]]);
					}
				}
			}

			var10.method206();
			var10.method216(64, 850, -30, -50, -30, true);
			field1355.method335(var3, var10);
			field1359 = var3;
		}

		if (field1357) {
			return var10;
		}

		FCIDIKVY var21 = FCIDIKVY.field680;
		var21.method201(FGGKJQKK.method235(var5) & FGGKJQKK.method235(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method208(XETSOHUA.field1474[field183].field1480, var5, var6);
		} else if (var5 != -1) {
			var21.method207(var5);
		}

		var21.method203();
		var21.field716 = null;
		var21.field715 = null;
		return var21;
	}
}
