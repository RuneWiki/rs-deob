package deob;

@ObfuscatedName("QAJCAYDZ")
public final class QAJCAYDZ extends ZOMFWUWL {

	@ObfuscatedName("QAJCAYDZ.yb")
	public long field1240 = -1L;

	@ObfuscatedName("QAJCAYDZ.zb")
	public int field1241 = -1;

	@ObfuscatedName("QAJCAYDZ.Ab")
	public int field1242 = -1;

	@ObfuscatedName("QAJCAYDZ.Fb")
	public boolean field1246 = false;

	@ObfuscatedName("QAJCAYDZ.Lb")
	public int[] field1252 = new int[12];

	@ObfuscatedName("QAJCAYDZ.Pb")
	public int[] field1256 = new int[5];

	@ObfuscatedName("QAJCAYDZ.Qb")
	public boolean field1257 = false;

	@ObfuscatedName("QAJCAYDZ.Gb")
	public static AKUDQPZE field1247 = new AKUDQPZE(260);

	@ObfuscatedName("QAJCAYDZ.sb")
	public int field1236;

	@ObfuscatedName("QAJCAYDZ.tb")
	public int field1237;

	@ObfuscatedName("QAJCAYDZ.ub")
	public int field1238;

	@ObfuscatedName("QAJCAYDZ.vb")
	public int field1239;

	@ObfuscatedName("QAJCAYDZ.Db")
	public int field1244;

	@ObfuscatedName("QAJCAYDZ.Eb")
	public int field1245;

	@ObfuscatedName("QAJCAYDZ.Hb")
	public int field1248;

	@ObfuscatedName("QAJCAYDZ.Ib")
	public int field1249;

	@ObfuscatedName("QAJCAYDZ.Jb")
	public int field1250;

	@ObfuscatedName("QAJCAYDZ.Mb")
	public int field1253;

	@ObfuscatedName("QAJCAYDZ.Nb")
	public int field1254;

	@ObfuscatedName("QAJCAYDZ.Sb")
	public int field1259;

	@ObfuscatedName("QAJCAYDZ.Tb")
	public int field1260;

	@ObfuscatedName("QAJCAYDZ.Ub")
	public int field1261;

	@ObfuscatedName("QAJCAYDZ.Bb")
	public long field1243;

	@ObfuscatedName("QAJCAYDZ.Rb")
	public AUWOQLEO field1258;

	@ObfuscatedName("QAJCAYDZ.Kb")
	public IGXVZOHI field1251;

	@ObfuscatedName("QAJCAYDZ.Ob")
	public String field1255;

	@ObfuscatedName("QAJCAYDZ.c(I)LIGXVZOHI;")
	public final IGXVZOHI method519() {
		if (!field1246) {
			return null;
		}

		if (field1258 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1252[var2];
				if (var3 >= 256 && var3 < 512 && !ZWYXHQWS.field1507[var3 - 256].method599()) {
					var1 = true;
				}

				if (var3 >= 512 && !WMJBOJYO.method560(var3 - 512).method564(field1259)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			IGXVZOHI[] var4 = new IGXVZOHI[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1252[var6];
				if (var7 >= 256 && var7 < 512) {
					IGXVZOHI var8 = ZWYXHQWS.field1507[var7 - 256].method600();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					IGXVZOHI var9 = WMJBOJYO.method560(var7 - 512).method562(field1259);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			IGXVZOHI var10 = new IGXVZOHI(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1256[var11] != 0) {
					var10.method368(client.field393[var11][0], client.field393[var11][field1256[var11]]);

					if (var11 == 1) {
						var10.method368(client.field467[0], client.field467[field1256[var11]]);
					}
				}
			}

			return var10;
		}

		return field1258.method11();
	}

	@ObfuscatedName("QAJCAYDZ.a(I)LIGXVZOHI;")
	public final IGXVZOHI method25() {
		if (!field1246) {
			return null;
		}

		IGXVZOHI var1 = method520();
		if (var1 == null) {
			return null;
		}

		field1472 = var1.field51;
		var1.field811 = true;

		if (field1257) {
			return var1;
		}

		if (field1501 != -1 && field1502 != -1) {
			VCTVXSNH var2 = VCTVXSNH.field1348[field1501];
			IGXVZOHI var3 = var2.method555();
			if (var3 != null) {
				IGXVZOHI var4 = new IGXVZOHI(true, var3, false, ICYGYVTE.method349(field1502));
				var4.method367(0, 0, -field1505);
				var4.method361();
				var4.method362(var2.field1352.field55[field1502]);
				var4.field810 = null;
				var4.field809 = null;

				if (var2.field1355 != 128 || var2.field1356 != 128) {
					var4.method370(var2.field1355, var2.field1356, var2.field1355);
				}

				var4.method371(var2.field1358 + 64, var2.field1359 + 850, -30, -50, -30, true);
				IGXVZOHI[] var5 = new IGXVZOHI[] { var1, var4 };
				var1 = new IGXVZOHI(2, var5, true);
			}
		}

		if (field1251 != null) {
			if (client.field123 >= field1245) {
				field1251 = null;
			}

			if (client.field123 >= field1244 && client.field123 < field1245) {
				IGXVZOHI var6 = field1251;
				var6.method367(field1248 - field1478, field1250 - field1479, field1249 - field1254);

				if (field1477 == 512) {
					var6.method365();
					var6.method365();
					var6.method365();
				} else if (field1477 == 1024) {
					var6.method365();
					var6.method365();
				} else if (field1477 == 1536) {
					var6.method365();
				}

				IGXVZOHI[] var7 = new IGXVZOHI[] { var1, var6 };
				var1 = new IGXVZOHI(2, var7, true);

				if (field1477 == 512) {
					var6.method365();
				} else if (field1477 == 1024) {
					var6.method365();
					var6.method365();
				} else if (field1477 == 1536) {
					var6.method365();
					var6.method365();
					var6.method365();
				}

				var6.method367(field1478 - field1248, field1479 - field1250, field1254 - field1249);
			}
		}

		var1.field811 = true;
		return var1;
	}

	@ObfuscatedName("QAJCAYDZ.a(B)LIGXVZOHI;")
	public final IGXVZOHI method520() {
		if (field1258 != null) {
			int var1 = -1;
			if (field1452 >= 0 && field1455 == 0) {
				var1 = BZONLWPM.field53[field1452].field55[field1453];
			} else if (field1497 >= 0) {
				var1 = BZONLWPM.field53[field1497].field55[field1498];
			}

			return field1258.method7(-1, var1, null);
		}

		long var3 = field1243;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1452 >= 0 && field1455 == 0) {
			BZONLWPM var9 = BZONLWPM.field53[field1452];
			var5 = var9.field55[field1453];

			if (field1497 >= 0 && field1497 != field1475) {
				var6 = BZONLWPM.field53[field1497].field55[field1498];
			}

			if (var9.field62 >= 0) {
				var7 = var9.field62;
				var3 += var7 - field1252[5] << 40;
			}

			if (var9.field63 >= 0) {
				var8 = var9.field63;
				var3 += var8 - field1252[3] << 48;
			}
		} else if (field1497 >= 0) {
			var5 = BZONLWPM.field53[field1497].field55[field1498];
		}

		IGXVZOHI var10 = (IGXVZOHI) field1247.method1(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1252[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !ZWYXHQWS.field1507[var13 - 256].method597()) {
					var11 = true;
				}

				if (var13 >= 512 && !WMJBOJYO.method560(var13 - 512).method559(field1259)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1240 != -1L) {
					var10 = (IGXVZOHI) field1247.method1(field1240);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			IGXVZOHI[] var14 = new IGXVZOHI[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1252[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					IGXVZOHI var18 = ZWYXHQWS.field1507[var17 - 256].method598();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					IGXVZOHI var19 = WMJBOJYO.method560(var17 - 512).method569(field1259);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new IGXVZOHI(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1256[var20] != 0) {
					var10.method368(client.field393[var20][0], client.field393[var20][field1256[var20]]);

					if (var20 == 1) {
						var10.method368(client.field467[0], client.field467[field1256[var20]]);
					}
				}
			}

			var10.method361();
			var10.method371(64, 850, -30, -50, -30, true);
			field1247.method2(var10, var3);
			field1240 = var3;
		}

		if (field1257) {
			return var10;
		}

		IGXVZOHI var21 = IGXVZOHI.field773;
		var21.method356(var10, ICYGYVTE.method349(var5) & ICYGYVTE.method349(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method363(BZONLWPM.field53[field1452].field59, var6, var5);
		} else if (var5 != -1) {
			var21.method362(var5);
		}

		var21.method358();
		var21.field810 = null;
		var21.field809 = null;
		return var21;
	}

	@ObfuscatedName("QAJCAYDZ.a(Z)Z")
	public final boolean method29() {
		if (!field1246) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("QAJCAYDZ.a(LEGCCHUZS;I)V")
	public final void method521(EGCCHUZS arg0) {
		arg0.field589 = 0;
		field1259 = arg0.method261();
		field1241 = arg0.method262();
		field1242 = arg0.method262();
		field1258 = null;
		field1261 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method261();
			if (var3 == 0) {
				field1252[var2] = 0;
			} else {
				int var4 = arg0.method261();
				field1252[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1252[0] == 0xFFFF) {
					field1258 = AUWOQLEO.method9(arg0.method263());
					break;
				}

				if (field1252[var2] >= 512 && field1252[var2] - 512 < WMJBOJYO.field1396) {
					int var5 = WMJBOJYO.method560(field1252[var2] - 512).field1394;
					if (var5 != 0) {
						field1261 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method261();
			if (var7 < 0 || var7 >= client.field393[var6].length) {
				var7 = 0;
			}

			field1256[var6] = var7;
		}

		field1475 = arg0.method263();
		if (field1475 == 0xFFFF) {
			field1475 = -1;
		}

		field1476 = arg0.method263();
		if (field1476 == 0xFFFF) {
			field1476 = -1;
		}

		field1460 = arg0.method263();
		if (field1460 == 0xFFFF) {
			field1460 = -1;
		}

		field1461 = arg0.method263();
		if (field1461 == 0xFFFF) {
			field1461 = -1;
		}

		field1462 = arg0.method263();
		if (field1462 == 0xFFFF) {
			field1462 = -1;
		}

		field1463 = arg0.method263();
		if (field1463 == 0xFFFF) {
			field1463 = -1;
		}

		field1492 = arg0.method263();
		if (field1492 == 0xFFFF) {
			field1492 = -1;
		}

		field1255 = XXUUHLAE.method578(XXUUHLAE.method575(arg0.method267()));
		field1260 = arg0.method261();
		field1253 = arg0.method263();
		field1246 = true;
		field1243 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1243 <<= 4;
			if (field1252[var8] >= 256) {
				field1243 += field1252[var8] - 256;
			}
		}

		if (field1252[0] >= 256) {
			field1243 += field1252[0] - 256 >> 4;
		}

		if (field1252[1] >= 256) {
			field1243 += field1252[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1243 <<= 3;
			field1243 += field1256[var9];
		}

		field1243 <<= 1;
		field1243 += field1259;
	}
}
