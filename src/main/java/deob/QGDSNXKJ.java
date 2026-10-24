package deob;

@ObfuscatedName("QGDSNXKJ")
public final class QGDSNXKJ extends SRUOAWPS {

	@ObfuscatedName("QGDSNXKJ.ub")
	public boolean field1104 = false;

	@ObfuscatedName("QGDSNXKJ.yb")
	public int[] field1108 = new int[5];

	@ObfuscatedName("QGDSNXKJ.Ab")
	public boolean field1109 = false;

	@ObfuscatedName("QGDSNXKJ.Bb")
	public long field1110 = -1L;

	@ObfuscatedName("QGDSNXKJ.Ib")
	public int field1116 = -1;

	@ObfuscatedName("QGDSNXKJ.Pb")
	public int field1123 = -1;

	@ObfuscatedName("QGDSNXKJ.Sb")
	public int[] field1125 = new int[12];

	@ObfuscatedName("QGDSNXKJ.tb")
	public static WIUIWDML field1103 = new WIUIWDML(260);

	@ObfuscatedName("QGDSNXKJ.rb")
	public int field1101;

	@ObfuscatedName("QGDSNXKJ.sb")
	public int field1102;

	@ObfuscatedName("QGDSNXKJ.wb")
	public int field1106;

	@ObfuscatedName("QGDSNXKJ.Cb")
	public int field1111;

	@ObfuscatedName("QGDSNXKJ.Db")
	public int field1112;

	@ObfuscatedName("QGDSNXKJ.Eb")
	public int field1113;

	@ObfuscatedName("QGDSNXKJ.Fb")
	public int field1114;

	@ObfuscatedName("QGDSNXKJ.Gb")
	public int field1115;

	@ObfuscatedName("QGDSNXKJ.Kb")
	public int field1118;

	@ObfuscatedName("QGDSNXKJ.Lb")
	public int field1119;

	@ObfuscatedName("QGDSNXKJ.Mb")
	public int field1120;

	@ObfuscatedName("QGDSNXKJ.Ob")
	public int field1122;

	@ObfuscatedName("QGDSNXKJ.Qb")
	public int field1124;

	@ObfuscatedName("QGDSNXKJ.Tb")
	public int field1126;

	@ObfuscatedName("QGDSNXKJ.xb")
	public long field1107;

	@ObfuscatedName("QGDSNXKJ.Nb")
	public PSGMMDJS field1121;

	@ObfuscatedName("QGDSNXKJ.Jb")
	public YIBRLAQY field1117;

	@ObfuscatedName("QGDSNXKJ.vb")
	public String field1105;

	@ObfuscatedName("QGDSNXKJ.a(BLPKHWFJLM;)V")
	public final void method447(PKHWFJLM arg0) {
		arg0.field971 = 0;
		field1111 = arg0.method330();
		field1123 = arg0.method331();
		field1116 = arg0.method331();
		field1117 = null;
		field1124 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method330();
			if (var3 == 0) {
				field1125[var2] = 0;
			} else {
				int var4 = arg0.method330();
				field1125[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1125[0] == 0xFFFF) {
					field1117 = YIBRLAQY.method579(arg0.method332());
					break;
				}

				if (field1125[var2] >= 512 && field1125[var2] - 512 < HCJYZKIH.field751) {
					int var5 = HCJYZKIH.method236(field1125[var2] - 512).field735;
					if (var5 != 0) {
						field1124 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method330();
			if (var7 < 0 || var7 >= client.field503[var6].length) {
				var7 = 0;
			}

			field1108[var6] = var7;
		}

		field1239 = arg0.method332();
		if (field1239 == 0xFFFF) {
			field1239 = -1;
		}

		field1240 = arg0.method332();
		if (field1240 == 0xFFFF) {
			field1240 = -1;
		}

		field1287 = arg0.method332();
		if (field1287 == 0xFFFF) {
			field1287 = -1;
		}

		field1288 = arg0.method332();
		if (field1288 == 0xFFFF) {
			field1288 = -1;
		}

		field1289 = arg0.method332();
		if (field1289 == 0xFFFF) {
			field1289 = -1;
		}

		field1290 = arg0.method332();
		if (field1290 == 0xFFFF) {
			field1290 = -1;
		}

		field1244 = arg0.method332();
		if (field1244 == 0xFFFF) {
			field1244 = -1;
		}

		field1105 = MYWERTTF.method304(MYWERTTF.method301(arg0.method336()));
		field1106 = arg0.method330();
		field1126 = arg0.method332();
		field1104 = true;
		field1107 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1107 <<= 4;
			if (field1125[var8] >= 256) {
				field1107 += field1125[var8] - 256;
			}
		}

		if (field1125[0] >= 256) {
			field1107 += field1125[0] - 256 >> 4;
		}

		if (field1125[1] >= 256) {
			field1107 += field1125[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1107 <<= 3;
			field1107 += field1108[var9];
		}

		field1107 <<= 1;
		field1107 += field1111;
	}

	@ObfuscatedName("QGDSNXKJ.a(I)LPSGMMDJS;")
	public final PSGMMDJS method196() {
		if (!field1104) {
			return null;
		}

		PSGMMDJS var1 = method448();
		if (var1 == null) {
			return null;
		}

		field1265 = var1.field1322;
		var1.field1029 = true;

		if (field1109) {
			return var1;
		}

		if (field1281 != -1 && field1282 != -1) {
			HTWOTIWO var2 = HTWOTIWO.field778[field1281];
			PSGMMDJS var3 = var2.method251();
			if (var3 != null) {
				PSGMMDJS var4 = new PSGMMDJS(var3, AOFTXYIM.method5(field1282), true, false);
				var4.method423(-field1285, 0, 0);
				var4.method417();
				var4.method418(var2.field782.field588[field1282]);
				var4.field1028 = null;
				var4.field1027 = null;

				if (var2.field785 != 128 || var2.field786 != 128) {
					var4.method426(var2.field786, var2.field785, var2.field785);
				}

				var4.method427(var2.field788 + 64, var2.field789 + 850, -30, -50, -30, true);
				PSGMMDJS[] var5 = new PSGMMDJS[] { var1, var4 };
				var1 = new PSGMMDJS(2, var5, true);
			}
		}

		if (field1121 != null) {
			if (client.field468 >= field1102) {
				field1121 = null;
			}

			if (client.field468 >= field1101 && client.field468 < field1102) {
				PSGMMDJS var6 = field1121;
				var6.method423(field1119 - field1122, field1120 - field1271, field1118 - field1270);

				if (field1280 == 512) {
					var6.method421();
					var6.method421();
					var6.method421();
				} else if (field1280 == 1024) {
					var6.method421();
					var6.method421();
				} else if (field1280 == 1536) {
					var6.method421();
				}

				PSGMMDJS[] var7 = new PSGMMDJS[] { var1, var6 };
				var1 = new PSGMMDJS(2, var7, true);

				if (field1280 == 512) {
					var6.method421();
				} else if (field1280 == 1024) {
					var6.method421();
					var6.method421();
				} else if (field1280 == 1536) {
					var6.method421();
					var6.method421();
					var6.method421();
				}

				var6.method423(field1122 - field1119, field1271 - field1120, field1270 - field1118);
			}
		}

		var1.field1029 = true;
		return var1;
	}

	@ObfuscatedName("QGDSNXKJ.b(I)LPSGMMDJS;")
	public final PSGMMDJS method448() {
		if (field1117 != null) {
			int var1 = -1;
			if (field1245 >= 0 && field1248 == 0) {
				var1 = DWUJPTWU.field586[field1245].field588[field1246];
			} else if (field1273 >= 0) {
				var1 = DWUJPTWU.field586[field1273].field588[field1274];
			}

			return field1117.method581(var1, -1, null);
		}

		long var3 = field1107;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1245 >= 0 && field1248 == 0) {
			DWUJPTWU var9 = DWUJPTWU.field586[field1245];
			var5 = var9.field588[field1246];

			if (field1273 >= 0 && field1273 != field1239) {
				var6 = DWUJPTWU.field586[field1273].field588[field1274];
			}

			if (var9.field595 >= 0) {
				var7 = var9.field595;
				var3 += var7 - field1125[5] << 40;
			}

			if (var9.field596 >= 0) {
				var8 = var9.field596;
				var3 += var8 - field1125[3] << 48;
			}
		} else if (field1273 >= 0) {
			var5 = DWUJPTWU.field586[field1273].field588[field1274];
		}

		PSGMMDJS var10 = (PSGMMDJS) field1103.method519(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1125[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !PTKBILNJ.field1064[var13 - 256].method438()) {
					var11 = true;
				}

				if (var13 >= 512 && !HCJYZKIH.method236(var13 - 512).method235(field1111)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1110 != -1L) {
					var10 = (PSGMMDJS) field1103.method519(field1110);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			PSGMMDJS[] var14 = new PSGMMDJS[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1125[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					PSGMMDJS var18 = PTKBILNJ.field1064[var17 - 256].method439();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					PSGMMDJS var19 = HCJYZKIH.method236(var17 - 512).method238(field1111);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new PSGMMDJS(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1108[var20] != 0) {
					var10.method424(client.field503[var20][0], client.field503[var20][field1108[var20]]);

					if (var20 == 1) {
						var10.method424(client.field476[0], client.field476[field1108[var20]]);
					}
				}
			}

			var10.method417();
			var10.method427(64, 850, -30, -50, -30, true);
			field1103.method520(var3, var10);
			field1110 = var3;
		}

		if (field1109) {
			return var10;
		}

		PSGMMDJS var21 = PSGMMDJS.field991;
		var21.method412(var10, AOFTXYIM.method5(var5) & AOFTXYIM.method5(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method419(DWUJPTWU.field586[field1245].field592, var6, var5);
		} else if (var5 != -1) {
			var21.method418(var5);
		}

		var21.method414();
		var21.field1028 = null;
		var21.field1027 = null;
		return var21;
	}

	@ObfuscatedName("QGDSNXKJ.c(B)LPSGMMDJS;")
	public final PSGMMDJS method449() {
		if (!field1104) {
			return null;
		}

		if (field1117 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1125[var2];
				if (var3 >= 256 && var3 < 512 && !PTKBILNJ.field1064[var3 - 256].method440()) {
					var1 = true;
				}

				if (var3 >= 512 && !HCJYZKIH.method236(var3 - 512).method231(field1111)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			PSGMMDJS[] var4 = new PSGMMDJS[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1125[var6];
				if (var7 >= 256 && var7 < 512) {
					PSGMMDJS var8 = PTKBILNJ.field1064[var7 - 256].method441();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					PSGMMDJS var9 = HCJYZKIH.method236(var7 - 512).method242(field1111);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			PSGMMDJS var10 = new PSGMMDJS(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1108[var11] != 0) {
					var10.method424(client.field503[var11][0], client.field503[var11][field1108[var11]]);

					if (var11 == 1) {
						var10.method424(client.field476[0], client.field476[field1108[var11]]);
					}
				}
			}

			return var10;
		}

		return field1117.method582();
	}

	@ObfuscatedName("QGDSNXKJ.a(B)Z")
	public final boolean method316() {
		if (!field1104) {
			return false;
		}

		return true;
	}
}
