package deob;

@ObfuscatedName("WQWDCUWR")
public final class WQWDCUWR extends RODHPQMW {

	@ObfuscatedName("WQWDCUWR.rb")
	public int field1415 = -1;

	@ObfuscatedName("WQWDCUWR.Db")
	public int field1425 = -1;

	@ObfuscatedName("WQWDCUWR.Gb")
	public int[] field1428 = new int[12];

	@ObfuscatedName("WQWDCUWR.Ib")
	public boolean field1430 = false;

	@ObfuscatedName("WQWDCUWR.Kb")
	public boolean field1432 = false;

	@ObfuscatedName("WQWDCUWR.Lb")
	public int[] field1433 = new int[5];

	@ObfuscatedName("WQWDCUWR.Mb")
	public long field1434 = -1L;

	@ObfuscatedName("WQWDCUWR.nb")
	public static DSCQIAPU field1411 = new DSCQIAPU(260);

	@ObfuscatedName("WQWDCUWR.ob")
	public int field1412;

	@ObfuscatedName("WQWDCUWR.pb")
	public int field1413;

	@ObfuscatedName("WQWDCUWR.qb")
	public int field1414;

	@ObfuscatedName("WQWDCUWR.sb")
	public int field1416;

	@ObfuscatedName("WQWDCUWR.tb")
	public int field1417;

	@ObfuscatedName("WQWDCUWR.ub")
	public int field1418;

	@ObfuscatedName("WQWDCUWR.wb")
	public int field1420;

	@ObfuscatedName("WQWDCUWR.yb")
	public int field1421;

	@ObfuscatedName("WQWDCUWR.zb")
	public int field1422;

	@ObfuscatedName("WQWDCUWR.Ab")
	public int field1423;

	@ObfuscatedName("WQWDCUWR.Bb")
	public int field1424;

	@ObfuscatedName("WQWDCUWR.Eb")
	public int field1426;

	@ObfuscatedName("WQWDCUWR.Hb")
	public int field1429;

	@ObfuscatedName("WQWDCUWR.Ob")
	public int field1435;

	@ObfuscatedName("WQWDCUWR.Jb")
	public long field1431;

	@ObfuscatedName("WQWDCUWR.Pb")
	public BJGOYLYN field1436;

	@ObfuscatedName("WQWDCUWR.vb")
	public UNLYQRUD field1419;

	@ObfuscatedName("WQWDCUWR.Fb")
	public String field1427;

	@ObfuscatedName("WQWDCUWR.a(B)LUNLYQRUD;")
	public final UNLYQRUD method10() {
		if (!field1430) {
			return null;
		}

		UNLYQRUD var1 = method543();
		if (var1 == null) {
			return null;
		}

		field1151 = var1.field53;
		var1.field1300 = true;

		if (field1432) {
			return var1;
		}

		if (field1170 != -1 && field1171 != -1) {
			TYXORIIC var2 = TYXORIIC.field1248[field1170];
			UNLYQRUD var3 = var2.method436();
			if (var3 != null) {
				UNLYQRUD var4 = new UNLYQRUD(true, var3, false, DHMWVSMI.method178(field1171));
				var4.method455(-field1174, 0, 0);
				var4.method449();
				var4.method450(var2.field1252.field1008[field1171]);
				var4.field1299 = null;
				var4.field1298 = null;

				if (var2.field1255 != 128 || var2.field1256 != 128) {
					var4.method458(var2.field1255, var2.field1256, var2.field1255);
				}

				var4.method459(var2.field1258 + 64, var2.field1259 + 850, -30, -50, -30, true);
				UNLYQRUD[] var5 = new UNLYQRUD[] { var1, var4 };
				var1 = new UNLYQRUD(2, var5, true);
			}
		}

		if (field1419 != null) {
			if (client.field230 >= field1414) {
				field1419 = null;
			}

			if (client.field230 >= field1413 && client.field230 < field1414) {
				UNLYQRUD var6 = field1419;
				var6.method455(field1417 - field1412, field1418 - field1196, field1416 - field1195);

				if (field1198 == 512) {
					var6.method453();
					var6.method453();
					var6.method453();
				} else if (field1198 == 1024) {
					var6.method453();
					var6.method453();
				} else if (field1198 == 1536) {
					var6.method453();
				}

				UNLYQRUD[] var7 = new UNLYQRUD[] { var1, var6 };
				var1 = new UNLYQRUD(2, var7, true);

				if (field1198 == 512) {
					var6.method453();
				} else if (field1198 == 1024) {
					var6.method453();
					var6.method453();
				} else if (field1198 == 1536) {
					var6.method453();
					var6.method453();
					var6.method453();
				}

				var6.method455(field1412 - field1417, field1196 - field1418, field1195 - field1416);
			}
		}

		var1.field1300 = true;
		return var1;
	}

	@ObfuscatedName("WQWDCUWR.b(I)LUNLYQRUD;")
	public final UNLYQRUD method542() {
		if (!field1430) {
			return null;
		}

		if (field1436 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1428[var2];
				if (var3 >= 256 && var3 < 512 && !SECEMLXT.field1211[var3 - 256].method419()) {
					var1 = true;
				}

				if (var3 >= 512 && !FROOEMOI.method218(var3 - 512).method225(field1420)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			UNLYQRUD[] var4 = new UNLYQRUD[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1428[var6];
				if (var7 >= 256 && var7 < 512) {
					UNLYQRUD var8 = SECEMLXT.field1211[var7 - 256].method420();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					UNLYQRUD var9 = FROOEMOI.method218(var7 - 512).method219(field1420);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			UNLYQRUD var10 = new UNLYQRUD(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1433[var11] != 0) {
					var10.method456(client.field243[var11][0], client.field243[var11][field1433[var11]]);

					if (var11 == 1) {
						var10.method456(client.field434[0], client.field434[field1433[var11]]);
					}
				}
			}

			return var10;
		}

		return field1436.method7();
	}

	@ObfuscatedName("WQWDCUWR.b(B)Z")
	public final boolean method408() {
		if (!field1430) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("WQWDCUWR.c(B)LUNLYQRUD;")
	public final UNLYQRUD method543() {
		if (field1436 != null) {
			int var1 = -1;
			if (field1162 >= 0 && field1165 == 0) {
				var1 = PVVHTYPN.field1006[field1162].field1008[field1163];
			} else if (field1199 >= 0) {
				var1 = PVVHTYPN.field1006[field1199].field1008[field1200];
			}

			return field1436.method2(-1, null, var1);
		}

		long var3 = field1431;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1162 >= 0 && field1165 == 0) {
			PVVHTYPN var9 = PVVHTYPN.field1006[field1162];
			var5 = var9.field1008[field1163];

			if (field1199 >= 0 && field1199 != field1149) {
				var6 = PVVHTYPN.field1006[field1199].field1008[field1200];
			}

			if (var9.field1015 >= 0) {
				var7 = var9.field1015;
				var3 += var7 - field1428[5] << 40;
			}

			if (var9.field1016 >= 0) {
				var8 = var9.field1016;
				var3 += var8 - field1428[3] << 48;
			}
		} else if (field1199 >= 0) {
			var5 = PVVHTYPN.field1006[field1199].field1008[field1200];
		}

		UNLYQRUD var10 = (UNLYQRUD) field1411.method179(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1428[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !SECEMLXT.field1211[var13 - 256].method417()) {
					var11 = true;
				}

				if (var13 >= 512 && !FROOEMOI.method218(var13 - 512).method227(field1420)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1434 != -1L) {
					var10 = (UNLYQRUD) field1411.method179(field1434);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			UNLYQRUD[] var14 = new UNLYQRUD[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1428[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					UNLYQRUD var18 = SECEMLXT.field1211[var17 - 256].method418();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					UNLYQRUD var19 = FROOEMOI.method218(var17 - 512).method221(field1420);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new UNLYQRUD(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1433[var20] != 0) {
					var10.method456(client.field243[var20][0], client.field243[var20][field1433[var20]]);

					if (var20 == 1) {
						var10.method456(client.field434[0], client.field434[field1433[var20]]);
					}
				}
			}

			var10.method449();
			var10.method459(64, 850, -30, -50, -30, true);
			field1411.method180(var10, var3);
			field1434 = var3;
		}

		if (field1432) {
			return var10;
		}

		UNLYQRUD var21 = UNLYQRUD.field1263;
		var21.method444(DHMWVSMI.method178(var5) & DHMWVSMI.method178(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method451(var6, var5, PVVHTYPN.field1006[field1162].field1012);
		} else if (var5 != -1) {
			var21.method450(var5);
		}

		var21.method446();
		var21.field1299 = null;
		var21.field1298 = null;
		return var21;
	}

	@ObfuscatedName("WQWDCUWR.a(LWNCFPLWV;I)V")
	public final void method544(WNCFPLWV arg0) {
		arg0.field1375 = 0;
		field1420 = arg0.method502();
		field1415 = arg0.method503();
		field1425 = arg0.method503();
		field1436 = null;
		field1426 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method502();
			if (var3 == 0) {
				field1428[var2] = 0;
			} else {
				int var4 = arg0.method502();
				field1428[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1428[0] == 0xFFFF) {
					field1436 = BJGOYLYN.method4(arg0.method504());
					break;
				}

				if (field1428[var2] >= 512 && field1428[var2] - 512 < FROOEMOI.field624) {
					int var5 = FROOEMOI.method218(field1428[var2] - 512).field658;
					if (var5 != 0) {
						field1426 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method502();
			if (var7 < 0 || var7 >= client.field243[var6].length) {
				var7 = 0;
			}

			field1433[var6] = var7;
		}

		field1149 = arg0.method504();
		if (field1149 == 0xFFFF) {
			field1149 = -1;
		}

		field1150 = arg0.method504();
		if (field1150 == 0xFFFF) {
			field1150 = -1;
		}

		field1185 = arg0.method504();
		if (field1185 == 0xFFFF) {
			field1185 = -1;
		}

		field1186 = arg0.method504();
		if (field1186 == 0xFFFF) {
			field1186 = -1;
		}

		field1187 = arg0.method504();
		if (field1187 == 0xFFFF) {
			field1187 = -1;
		}

		field1188 = arg0.method504();
		if (field1188 == 0xFFFF) {
			field1188 = -1;
		}

		field1154 = arg0.method504();
		if (field1154 == 0xFFFF) {
			field1154 = -1;
		}

		field1427 = HCBZAWVW.method290(HCBZAWVW.method287(arg0.method508()));
		field1435 = arg0.method502();
		field1429 = arg0.method504();
		field1430 = true;
		field1431 = 0L;
		int var8 = field1428[5];
		int var9 = field1428[9];
		field1428[5] = var9;
		field1428[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1431 <<= 4;
			if (field1428[var10] >= 256) {
				field1431 += field1428[var10] - 256;
			}
		}

		if (field1428[0] >= 256) {
			field1431 += field1428[0] - 256 >> 4;
		}

		if (field1428[1] >= 256) {
			field1431 += field1428[1] - 256 >> 8;
		}

		field1428[5] = var8;
		field1428[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1431 <<= 3;
			field1431 += field1433[var11];
		}

		field1431 <<= 1;
		field1431 += field1420;
	}
}
