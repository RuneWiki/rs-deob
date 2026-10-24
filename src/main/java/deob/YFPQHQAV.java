package deob;

@ObfuscatedName("YFPQHQAV")
public final class YFPQHQAV extends QQSLPTGQ {

	@ObfuscatedName("YFPQHQAV.rb")
	public boolean field1399 = false;

	@ObfuscatedName("YFPQHQAV.tb")
	public int[] field1401 = new int[5];

	@ObfuscatedName("YFPQHQAV.vb")
	public int field1403 = -1;

	@ObfuscatedName("YFPQHQAV.Db")
	public int field1409 = -1;

	@ObfuscatedName("YFPQHQAV.Fb")
	public int[] field1410 = new int[12];

	@ObfuscatedName("YFPQHQAV.Gb")
	public boolean field1411 = false;

	@ObfuscatedName("YFPQHQAV.Kb")
	public long field1414 = -1L;

	@ObfuscatedName("YFPQHQAV.sb")
	public static FFRFJBIR field1400 = new FFRFJBIR(260);

	@ObfuscatedName("YFPQHQAV.ub")
	public int field1402;

	@ObfuscatedName("YFPQHQAV.yb")
	public int field1404;

	@ObfuscatedName("YFPQHQAV.zb")
	public int field1405;

	@ObfuscatedName("YFPQHQAV.Ab")
	public int field1406;

	@ObfuscatedName("YFPQHQAV.Cb")
	public int field1408;

	@ObfuscatedName("YFPQHQAV.Ib")
	public int field1412;

	@ObfuscatedName("YFPQHQAV.Mb")
	public int field1415;

	@ObfuscatedName("YFPQHQAV.Nb")
	public int field1416;

	@ObfuscatedName("YFPQHQAV.Ob")
	public int field1417;

	@ObfuscatedName("YFPQHQAV.Pb")
	public int field1418;

	@ObfuscatedName("YFPQHQAV.Qb")
	public int field1419;

	@ObfuscatedName("YFPQHQAV.Rb")
	public int field1420;

	@ObfuscatedName("YFPQHQAV.Sb")
	public int field1421;

	@ObfuscatedName("YFPQHQAV.Tb")
	public int field1422;

	@ObfuscatedName("YFPQHQAV.Jb")
	public long field1413;

	@ObfuscatedName("YFPQHQAV.Bb")
	public KUGNQTGL field1407;

	@ObfuscatedName("YFPQHQAV.qb")
	public RDFTXEYV field1398;

	@ObfuscatedName("YFPQHQAV.Ub")
	public String field1423;

	@ObfuscatedName("YFPQHQAV.a(Z)LKUGNQTGL;")
	public final KUGNQTGL method547() {
		if (!field1411) {
			return null;
		}

		if (field1398 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1410[var2];
				if (var3 >= 256 && var3 < 512 && !XPVGEAJJ.field1385[var3 - 256].method542()) {
					var1 = true;
				}

				if (var3 >= 512 && !NCBEIRPV.method390(var3 - 512).method383(field1421)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			KUGNQTGL[] var4 = new KUGNQTGL[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1410[var6];
				if (var7 >= 256 && var7 < 512) {
					KUGNQTGL var8 = XPVGEAJJ.field1385[var7 - 256].method543();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					KUGNQTGL var9 = NCBEIRPV.method390(var7 - 512).method384(field1421);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			KUGNQTGL var10 = new KUGNQTGL(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1401[var11] != 0) {
					var10.method344(client.field408[var11][0], client.field408[var11][field1401[var11]]);

					if (var11 == 1) {
						var10.method344(client.field172[0], client.field172[field1401[var11]]);
					}
				}
			}

			return var10;
		}

		return field1398.method437();
	}

	@ObfuscatedName("YFPQHQAV.b(I)Z")
	public final boolean method433() {
		if (!field1411) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("YFPQHQAV.a(ILFTMSICIZ;)V")
	public final void method548(FTMSICIZ arg0) {
		arg0.field535 = 0;
		field1421 = arg0.method213();
		field1409 = arg0.method214();
		field1403 = arg0.method214();
		field1398 = null;
		field1408 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method213();
			if (var3 == 0) {
				field1410[var2] = 0;
			} else {
				int var4 = arg0.method213();
				field1410[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1410[0] == 0xFFFF) {
					field1398 = RDFTXEYV.method439(arg0.method215());
					break;
				}

				if (field1410[var2] >= 512 && field1410[var2] - 512 < NCBEIRPV.field838) {
					int var5 = NCBEIRPV.method390(field1410[var2] - 512).field865;
					if (var5 != 0) {
						field1408 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method213();
			if (var7 < 0 || var7 >= client.field408[var6].length) {
				var7 = 0;
			}

			field1401[var6] = var7;
		}

		field1113 = arg0.method215();
		if (field1113 == 0xFFFF) {
			field1113 = -1;
		}

		field1114 = arg0.method215();
		if (field1114 == 0xFFFF) {
			field1114 = -1;
		}

		field1096 = arg0.method215();
		if (field1096 == 0xFFFF) {
			field1096 = -1;
		}

		field1097 = arg0.method215();
		if (field1097 == 0xFFFF) {
			field1097 = -1;
		}

		field1098 = arg0.method215();
		if (field1098 == 0xFFFF) {
			field1098 = -1;
		}

		field1099 = arg0.method215();
		if (field1099 == 0xFFFF) {
			field1099 = -1;
		}

		field1116 = arg0.method215();
		if (field1116 == 0xFFFF) {
			field1116 = -1;
		}

		field1423 = RPCTGZHI.method449(RPCTGZHI.method446(arg0.method219()));
		field1422 = arg0.method213();
		field1412 = arg0.method215();
		field1411 = true;
		field1413 = 0L;
		int var8 = field1410[5];
		int var9 = field1410[9];
		field1410[5] = var9;
		field1410[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1413 <<= 4;
			if (field1410[var10] >= 256) {
				field1413 += field1410[var10] - 256;
			}
		}

		if (field1410[0] >= 256) {
			field1413 += field1410[0] - 256 >> 4;
		}

		if (field1410[1] >= 256) {
			field1413 += field1410[1] - 256 >> 8;
		}

		field1410[5] = var8;
		field1410[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1413 <<= 3;
			field1413 += field1401[var11];
		}

		field1413 <<= 1;
		field1413 += field1421;
	}

	@ObfuscatedName("YFPQHQAV.a(B)LKUGNQTGL;")
	public final KUGNQTGL method40() {
		if (!field1411) {
			return null;
		}

		KUGNQTGL var1 = method549();
		if (var1 == null) {
			return null;
		}

		field1122 = var1.field1450;
		var1.field703 = true;

		if (field1399) {
			return var1;
		}

		if (field1077 != -1 && field1078 != -1) {
			JXKRPXFX var2 = JXKRPXFX.field632[field1077];
			KUGNQTGL var3 = var2.method308();
			if (var3 != null) {
				KUGNQTGL var4 = new KUGNQTGL(var3, false, true, SCWTQUFK.method455(field1078));
				var4.method343(0, 0, -field1081);
				var4.method337();
				var4.method338(var2.field636.field953[field1078]);
				var4.field702 = null;
				var4.field701 = null;

				if (var2.field639 != 128 || var2.field640 != 128) {
					var4.method346(var2.field639, var2.field639, var2.field640);
				}

				var4.method347(var2.field642 + 64, var2.field643 + 850, -30, -50, -30, true);
				KUGNQTGL[] var5 = new KUGNQTGL[] { var1, var4 };
				var1 = new KUGNQTGL(var5, true, 2);
			}
		}

		if (field1407 != null) {
			if (client.field231 >= field1420) {
				field1407 = null;
			}

			if (client.field231 >= field1419 && client.field231 < field1420) {
				KUGNQTGL var6 = field1407;
				var6.method343(field1404 - field1082, field1406 - field1083, field1405 - field1402);

				if (field1127 == 512) {
					var6.method341();
					var6.method341();
					var6.method341();
				} else if (field1127 == 1024) {
					var6.method341();
					var6.method341();
				} else if (field1127 == 1536) {
					var6.method341();
				}

				KUGNQTGL[] var7 = new KUGNQTGL[] { var1, var6 };
				var1 = new KUGNQTGL(var7, true, 2);

				if (field1127 == 512) {
					var6.method341();
				} else if (field1127 == 1024) {
					var6.method341();
					var6.method341();
				} else if (field1127 == 1536) {
					var6.method341();
					var6.method341();
					var6.method341();
				}

				var6.method343(field1082 - field1404, field1083 - field1406, field1402 - field1405);
			}
		}

		var1.field703 = true;
		return var1;
	}

	@ObfuscatedName("YFPQHQAV.b(Z)LKUGNQTGL;")
	public final KUGNQTGL method549() {
		if (field1398 != null) {
			int var1 = -1;
			if (field1105 >= 0 && field1108 == 0) {
				var1 = PQTJDTHH.field951[field1105].field953[field1106];
			} else if (field1102 >= 0) {
				var1 = PQTJDTHH.field951[field1102].field953[field1103];
			}

			return field1398.method435(var1, -1, null);
		}

		long var3 = field1413;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1105 >= 0 && field1108 == 0) {
			PQTJDTHH var9 = PQTJDTHH.field951[field1105];
			var5 = var9.field953[field1106];

			if (field1102 >= 0 && field1113 != field1102) {
				var6 = PQTJDTHH.field951[field1102].field953[field1103];
			}

			if (var9.field960 >= 0) {
				var7 = var9.field960;
				var3 += var7 - field1410[5] << 40;
			}

			if (var9.field961 >= 0) {
				var8 = var9.field961;
				var3 += var8 - field1410[3] << 48;
			}
		} else if (field1102 >= 0) {
			var5 = PQTJDTHH.field951[field1102].field953[field1103];
		}

		KUGNQTGL var10 = (KUGNQTGL) field1400.method198(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1410[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !XPVGEAJJ.field1385[var13 - 256].method540()) {
					var11 = true;
				}

				if (var13 >= 512 && !NCBEIRPV.method390(var13 - 512).method387(field1421)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1414 != -1L) {
					var10 = (KUGNQTGL) field1400.method198(field1414);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			KUGNQTGL[] var14 = new KUGNQTGL[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1410[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					KUGNQTGL var18 = XPVGEAJJ.field1385[var17 - 256].method541();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					KUGNQTGL var19 = NCBEIRPV.method390(var17 - 512).method379(field1421);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new KUGNQTGL(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1401[var20] != 0) {
					var10.method344(client.field408[var20][0], client.field408[var20][field1401[var20]]);

					if (var20 == 1) {
						var10.method344(client.field172[0], client.field172[field1401[var20]]);
					}
				}
			}

			var10.method337();
			var10.method347(64, 850, -30, -50, -30, true);
			field1400.method199(var3, var10);
			field1414 = var3;
		}

		if (field1399) {
			return var10;
		}

		KUGNQTGL var21 = KUGNQTGL.field666;
		var21.method332(SCWTQUFK.method455(var5) & SCWTQUFK.method455(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method339(var5, var6, PQTJDTHH.field951[field1105].field957);
		} else if (var5 != -1) {
			var21.method338(var5);
		}

		var21.method334();
		var21.field702 = null;
		var21.field701 = null;
		return var21;
	}
}
