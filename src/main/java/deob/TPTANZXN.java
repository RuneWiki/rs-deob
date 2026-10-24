package deob;

@ObfuscatedName("TPTANZXN")
public final class TPTANZXN extends XOZCTLMB {

	@ObfuscatedName("TPTANZXN.xb")
	public int[] field1240 = new int[12];

	@ObfuscatedName("TPTANZXN.Bb")
	public boolean field1244 = false;

	@ObfuscatedName("TPTANZXN.Fb")
	public long field1247 = -1L;

	@ObfuscatedName("TPTANZXN.Mb")
	public int field1253 = -1;

	@ObfuscatedName("TPTANZXN.Ob")
	public int field1255 = -1;

	@ObfuscatedName("TPTANZXN.Sb")
	public boolean field1258 = false;

	@ObfuscatedName("TPTANZXN.Ub")
	public int[] field1260 = new int[5];

	@ObfuscatedName("TPTANZXN.Nb")
	public static YITKGHWB field1254 = new YITKGHWB(260);

	@ObfuscatedName("TPTANZXN.sb")
	public int field1236;

	@ObfuscatedName("TPTANZXN.tb")
	public int field1237;

	@ObfuscatedName("TPTANZXN.ub")
	public int field1238;

	@ObfuscatedName("TPTANZXN.vb")
	public int field1239;

	@ObfuscatedName("TPTANZXN.yb")
	public int field1241;

	@ObfuscatedName("TPTANZXN.zb")
	public int field1242;

	@ObfuscatedName("TPTANZXN.Ab")
	public int field1243;

	@ObfuscatedName("TPTANZXN.Eb")
	public int field1246;

	@ObfuscatedName("TPTANZXN.Gb")
	public int field1248;

	@ObfuscatedName("TPTANZXN.Hb")
	public int field1249;

	@ObfuscatedName("TPTANZXN.Ib")
	public int field1250;

	@ObfuscatedName("TPTANZXN.Kb")
	public int field1252;

	@ObfuscatedName("TPTANZXN.Rb")
	public int field1257;

	@ObfuscatedName("TPTANZXN.Tb")
	public int field1259;

	@ObfuscatedName("TPTANZXN.Pb")
	public long field1256;

	@ObfuscatedName("TPTANZXN.Jb")
	public FLXAIVEA field1251;

	@ObfuscatedName("TPTANZXN.Db")
	public JRELGTVY field1245;

	@ObfuscatedName("TPTANZXN.Vb")
	public String field1261;

	@ObfuscatedName("TPTANZXN.a(LPQBRPYKE;I)V")
	public final void method456(PQBRPYKE arg0) {
		arg0.field1091 = 0;
		field1246 = arg0.method340();
		field1253 = arg0.method341();
		field1255 = arg0.method341();
		field1245 = null;
		field1257 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method340();
			if (var3 == 0) {
				field1240[var2] = 0;
			} else {
				int var4 = arg0.method340();
				field1240[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1240[0] == 0xFFFF) {
					field1245 = JRELGTVY.method269(arg0.method342());
					break;
				}

				if (field1240[var2] >= 512 && field1240[var2] - 512 < TGAGWNUA.field1216) {
					int var5 = TGAGWNUA.method453(field1240[var2] - 512).field1233;
					if (var5 != 0) {
						field1257 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method340();
			if (var7 < 0 || var7 >= client.field468[var6].length) {
				var7 = 0;
			}

			field1260[var6] = var7;
		}

		field1414 = arg0.method342();
		if (field1414 == 0xFFFF) {
			field1414 = -1;
		}

		field1415 = arg0.method342();
		if (field1415 == 0xFFFF) {
			field1415 = -1;
		}

		field1388 = arg0.method342();
		if (field1388 == 0xFFFF) {
			field1388 = -1;
		}

		field1389 = arg0.method342();
		if (field1389 == 0xFFFF) {
			field1389 = -1;
		}

		field1390 = arg0.method342();
		if (field1390 == 0xFFFF) {
			field1390 = -1;
		}

		field1391 = arg0.method342();
		if (field1391 == 0xFFFF) {
			field1391 = -1;
		}

		field1430 = arg0.method342();
		if (field1430 == 0xFFFF) {
			field1430 = -1;
		}

		field1261 = VUKQGAWR.method541(VUKQGAWR.method538(arg0.method346()));
		field1252 = arg0.method340();
		field1243 = arg0.method342();
		field1244 = true;
		field1256 = 0L;
		int var8 = field1240[5];
		int var9 = field1240[9];
		field1240[5] = var9;
		field1240[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1256 <<= 4;
			if (field1240[var10] >= 256) {
				field1256 += field1240[var10] - 256;
			}
		}

		if (field1240[0] >= 256) {
			field1256 += field1240[0] - 256 >> 4;
		}

		if (field1240[1] >= 256) {
			field1256 += field1240[1] - 256 >> 8;
		}

		field1240[5] = var8;
		field1240[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1256 <<= 3;
			field1256 += field1260[var11];
		}

		field1256 <<= 1;
		field1256 += field1246;
	}

	@ObfuscatedName("TPTANZXN.b(I)Z")
	public final boolean method442() {
		if (!field1244) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("TPTANZXN.c(I)LFLXAIVEA;")
	public final FLXAIVEA method457() {
		if (field1245 != null) {
			int var1 = -1;
			if (field1424 >= 0 && field1427 == 0) {
				var1 = BKDXLPEF.field75[field1424].field77[field1425];
			} else if (field1400 >= 0) {
				var1 = BKDXLPEF.field75[field1400].field77[field1401];
			}

			return field1245.method270(null, -1, var1);
		}

		long var3 = field1256;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1424 >= 0 && field1427 == 0) {
			BKDXLPEF var9 = BKDXLPEF.field75[field1424];
			var5 = var9.field77[field1425];

			if (field1400 >= 0 && field1414 != field1400) {
				var6 = BKDXLPEF.field75[field1400].field77[field1401];
			}

			if (var9.field84 >= 0) {
				var7 = var9.field84;
				var3 += var7 - field1240[5] << 40;
			}

			if (var9.field85 >= 0) {
				var8 = var9.field85;
				var3 += var8 - field1240[3] << 48;
			}
		} else if (field1400 >= 0) {
			var5 = BKDXLPEF.field75[field1400].field77[field1401];
		}

		FLXAIVEA var10 = (FLXAIVEA) field1254.method572(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1240[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !YUTTZGSS.field1488[var13 - 256].method581()) {
					var11 = true;
				}

				if (var13 >= 512 && !TGAGWNUA.method453(var13 - 512).method452(field1246)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1247 != -1L) {
					var10 = (FLXAIVEA) field1254.method572(field1247);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			FLXAIVEA[] var14 = new FLXAIVEA[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1240[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					FLXAIVEA var18 = YUTTZGSS.field1488[var17 - 256].method582();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					FLXAIVEA var19 = TGAGWNUA.method453(var17 - 512).method447(field1246);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new FLXAIVEA(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1260[var20] != 0) {
					var10.method232(client.field468[var20][0], client.field468[var20][field1260[var20]]);

					if (var20 == 1) {
						var10.method232(client.field525[0], client.field525[field1260[var20]]);
					}
				}
			}

			var10.method225();
			var10.method235(64, 850, -30, -50, -30, true);
			field1254.method573(var10, var3);
			field1247 = var3;
		}

		if (field1258) {
			return var10;
		}

		FLXAIVEA var21 = FLXAIVEA.field680;
		var21.method220(NFWEZFJY.method302(var5) & NFWEZFJY.method302(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method227(var6, var5, BKDXLPEF.field75[field1424].field81);
		} else if (var5 != -1) {
			var21.method226(var5);
		}

		var21.method222();
		var21.field716 = null;
		var21.field715 = null;
		return var21;
	}

	@ObfuscatedName("TPTANZXN.d(I)LFLXAIVEA;")
	public final FLXAIVEA method458() {
		if (!field1244) {
			return null;
		}

		if (field1245 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1240[var2];
				if (var3 >= 256 && var3 < 512 && !YUTTZGSS.field1488[var3 - 256].method583()) {
					var1 = true;
				}

				if (var3 >= 512 && !TGAGWNUA.method453(var3 - 512).method450(field1246)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			FLXAIVEA[] var4 = new FLXAIVEA[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1240[var6];
				if (var7 >= 256 && var7 < 512) {
					FLXAIVEA var8 = YUTTZGSS.field1488[var7 - 256].method584();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					FLXAIVEA var9 = TGAGWNUA.method453(var7 - 512).method444(field1246);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			FLXAIVEA var10 = new FLXAIVEA(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1260[var11] != 0) {
					var10.method232(client.field468[var11][0], client.field468[var11][field1260[var11]]);

					if (var11 == 1) {
						var10.method232(client.field525[0], client.field525[field1260[var11]]);
					}
				}
			}

			return var10;
		}

		return field1245.method271();
	}

	@ObfuscatedName("TPTANZXN.a(B)LFLXAIVEA;")
	public final FLXAIVEA method190() {
		if (!field1244) {
			return null;
		}

		FLXAIVEA var1 = method457();
		if (var1 == null) {
			return null;
		}

		field1421 = var1.field770;
		var1.field717 = true;

		if (field1258) {
			return var1;
		}

		if (field1407 != -1 && field1408 != -1) {
			OKJTNJLE var2 = OKJTNJLE.field1046[field1407];
			FLXAIVEA var3 = var2.method305();
			if (var3 != null) {
				FLXAIVEA var4 = new FLXAIVEA(var3, NFWEZFJY.method302(field1408), true, false);
				var4.method231(0, -field1411, 0);
				var4.method225();
				var4.method226(var2.field1050.field77[field1408]);
				var4.field716 = null;
				var4.field715 = null;

				if (var2.field1053 != 128 || var2.field1054 != 128) {
					var4.method234(var2.field1053, var2.field1053, var2.field1054);
				}

				var4.method235(var2.field1056 + 64, var2.field1057 + 850, -30, -50, -30, true);
				FLXAIVEA[] var5 = new FLXAIVEA[] { var1, var4 };
				var1 = new FLXAIVEA(2, true, var5);
			}
		}

		if (field1251 != null) {
			if (client.field526 >= field1242) {
				field1251 = null;
			}

			if (client.field526 >= field1241 && client.field526 < field1242) {
				FLXAIVEA var6 = field1251;
				var6.method231(field1250 - field1397, field1249 - field1259, field1248 - field1396);

				if (field1387 == 512) {
					var6.method229();
					var6.method229();
					var6.method229();
				} else if (field1387 == 1024) {
					var6.method229();
					var6.method229();
				} else if (field1387 == 1536) {
					var6.method229();
				}

				FLXAIVEA[] var7 = new FLXAIVEA[] { var1, var6 };
				var1 = new FLXAIVEA(2, true, var7);

				if (field1387 == 512) {
					var6.method229();
				} else if (field1387 == 1024) {
					var6.method229();
					var6.method229();
				} else if (field1387 == 1536) {
					var6.method229();
					var6.method229();
					var6.method229();
				}

				var6.method231(field1397 - field1250, field1259 - field1249, field1396 - field1248);
			}
		}

		var1.field717 = true;
		return var1;
	}
}
