package deob;

@ObfuscatedName("ISLZFAII")
public final class ISLZFAII extends UOUXSBLI {

	@ObfuscatedName("ISLZFAII.xb")
	public int field1024 = -1;

	@ObfuscatedName("ISLZFAII.yb")
	public boolean field1025 = false;

	@ObfuscatedName("ISLZFAII.Gb")
	public long field1030 = -1L;

	@ObfuscatedName("ISLZFAII.Lb")
	public int[] field1035 = new int[12];

	@ObfuscatedName("ISLZFAII.Nb")
	public boolean field1037 = false;

	@ObfuscatedName("ISLZFAII.Rb")
	public int[] field1041 = new int[5];

	@ObfuscatedName("ISLZFAII.Sb")
	public int field1042 = -1;

	@ObfuscatedName("ISLZFAII.wb")
	public static LSUWSJDO field1023 = new LSUWSJDO(260);

	@ObfuscatedName("ISLZFAII.sb")
	public int field1019;

	@ObfuscatedName("ISLZFAII.tb")
	public int field1020;

	@ObfuscatedName("ISLZFAII.ub")
	public int field1021;

	@ObfuscatedName("ISLZFAII.zb")
	public int field1026;

	@ObfuscatedName("ISLZFAII.Cb")
	public int field1027;

	@ObfuscatedName("ISLZFAII.Eb")
	public int field1028;

	@ObfuscatedName("ISLZFAII.Fb")
	public int field1029;

	@ObfuscatedName("ISLZFAII.Hb")
	public int field1031;

	@ObfuscatedName("ISLZFAII.Ib")
	public int field1032;

	@ObfuscatedName("ISLZFAII.Jb")
	public int field1033;

	@ObfuscatedName("ISLZFAII.Kb")
	public int field1034;

	@ObfuscatedName("ISLZFAII.Mb")
	public int field1036;

	@ObfuscatedName("ISLZFAII.Ob")
	public int field1038;

	@ObfuscatedName("ISLZFAII.Qb")
	public int field1040;

	@ObfuscatedName("ISLZFAII.rb")
	public long field1018;

	@ObfuscatedName("ISLZFAII.Ub")
	public DUHKBPRV field1043;

	@ObfuscatedName("ISLZFAII.vb")
	public LSSDQDBV field1022;

	@ObfuscatedName("ISLZFAII.Pb")
	public String field1039;

	@ObfuscatedName("ISLZFAII.a(LLZWRHABP;B)V")
	public final void method395(LZWRHABP arg0) {
		arg0.field1139 = 0;
		field1040 = arg0.method463();
		field1042 = arg0.method464();
		field1024 = arg0.method464();
		field1043 = null;
		field1036 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method463();
			if (var3 == 0) {
				field1035[var2] = 0;
			} else {
				int var4 = arg0.method463();
				field1035[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1035[0] == 0xFFFF) {
					field1043 = DUHKBPRV.method242(arg0.method465());
					break;
				}

				if (field1035[var2] >= 512 && field1035[var2] - 512 < HHBFOKVP.field941) {
					int var5 = HHBFOKVP.method367(field1035[var2] - 512).field950;
					if (var5 != 0) {
						field1036 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method463();
			if (var7 < 0 || var7 >= client.field458[var6].length) {
				var7 = 0;
			}

			field1041[var6] = var7;
		}

		field1403 = arg0.method465();
		if (field1403 == 0xFFFF) {
			field1403 = -1;
		}

		field1404 = arg0.method465();
		if (field1404 == 0xFFFF) {
			field1404 = -1;
		}

		field1377 = arg0.method465();
		if (field1377 == 0xFFFF) {
			field1377 = -1;
		}

		field1378 = arg0.method465();
		if (field1378 == 0xFFFF) {
			field1378 = -1;
		}

		field1379 = arg0.method465();
		if (field1379 == 0xFFFF) {
			field1379 = -1;
		}

		field1380 = arg0.method465();
		if (field1380 == 0xFFFF) {
			field1380 = -1;
		}

		field1401 = arg0.method465();
		if (field1401 == 0xFFFF) {
			field1401 = -1;
		}

		field1039 = CSEYUXAS.method220(CSEYUXAS.method217(arg0.method469()));
		field1026 = arg0.method463();
		field1027 = arg0.method465();
		field1025 = true;
		field1018 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1018 <<= 4;
			if (field1035[var8] >= 256) {
				field1018 += field1035[var8] - 256;
			}
		}

		if (field1035[0] >= 256) {
			field1018 += field1035[0] - 256 >> 4;
		}

		if (field1035[1] >= 256) {
			field1018 += field1035[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1018 <<= 3;
			field1018 += field1041[var9];
		}

		field1018 <<= 1;
		field1018 += field1040;
	}

	@ObfuscatedName("ISLZFAII.b(I)LLSSDQDBV;")
	public final LSSDQDBV method396() {
		if (!field1025) {
			return null;
		}

		if (field1043 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1035[var2];
				if (var3 >= 256 && var3 < 512 && !BGEILVDT.field100[var3 - 256].method24()) {
					var1 = true;
				}

				if (var3 >= 512 && !HHBFOKVP.method367(var3 - 512).method365(field1040)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			LSSDQDBV[] var4 = new LSSDQDBV[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1035[var6];
				if (var7 >= 256 && var7 < 512) {
					LSSDQDBV var8 = BGEILVDT.field100[var7 - 256].method25();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					LSSDQDBV var9 = HHBFOKVP.method367(var7 - 512).method364(field1040);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			LSSDQDBV var10 = new LSSDQDBV(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1041[var11] != 0) {
					var10.method437(client.field458[var11][0], client.field458[var11][field1041[var11]]);

					if (var11 == 1) {
						var10.method437(client.field506[0], client.field506[field1041[var11]]);
					}
				}
			}

			return var10;
		}

		return field1043.method241();
	}

	@ObfuscatedName("ISLZFAII.b(B)Z")
	public final boolean method397() {
		if (!field1025) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("ISLZFAII.c(I)LLSSDQDBV;")
	public final LSSDQDBV method398() {
		if (field1043 != null) {
			int var1 = -1;
			if (field1388 >= 0 && field1391 == 0) {
				var1 = WOTIAWQC.field1470[field1388].field1472[field1389];
			} else if (field1411 >= 0) {
				var1 = WOTIAWQC.field1470[field1411].field1472[field1412];
			}

			return field1043.method240(null, -1, var1);
		}

		long var3 = field1018;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1388 >= 0 && field1391 == 0) {
			WOTIAWQC var9 = WOTIAWQC.field1470[field1388];
			var5 = var9.field1472[field1389];

			if (field1411 >= 0 && field1411 != field1403) {
				var6 = WOTIAWQC.field1470[field1411].field1472[field1412];
			}

			if (var9.field1479 >= 0) {
				var7 = var9.field1479;
				var3 += var7 - field1035[5] << 40;
			}

			if (var9.field1480 >= 0) {
				var8 = var9.field1480;
				var3 += var8 - field1035[3] << 48;
			}
		} else if (field1411 >= 0) {
			var5 = WOTIAWQC.field1470[field1411].field1472[field1412];
		}

		LSSDQDBV var10 = (LSSDQDBV) field1023.method448(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1035[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !BGEILVDT.field100[var13 - 256].method22()) {
					var11 = true;
				}

				if (var13 >= 512 && !HHBFOKVP.method367(var13 - 512).method361(field1040)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1030 != -1L) {
					var10 = (LSSDQDBV) field1023.method448(field1030);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			LSSDQDBV[] var14 = new LSSDQDBV[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1035[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					LSSDQDBV var18 = BGEILVDT.field100[var17 - 256].method23();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					LSSDQDBV var19 = HHBFOKVP.method367(var17 - 512).method360(field1040);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new LSSDQDBV(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1041[var20] != 0) {
					var10.method437(client.field458[var20][0], client.field458[var20][field1041[var20]]);

					if (var20 == 1) {
						var10.method437(client.field506[0], client.field506[field1041[var20]]);
					}
				}
			}

			var10.method430();
			var10.method440(64, 850, -30, -50, -30, true);
			field1023.method449(var10, var3);
			field1030 = var3;
		}

		if (field1037) {
			return var10;
		}

		LSSDQDBV var21 = LSSDQDBV.field1059;
		var21.method425(var10, YGZNOIUP.method599(var5) & YGZNOIUP.method599(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method432(var5, WOTIAWQC.field1470[field1388].field1476, var6);
		} else if (var5 != -1) {
			var21.method431(var5);
		}

		var21.method427();
		var21.field1096 = null;
		var21.field1095 = null;
		return var21;
	}

	@ObfuscatedName("ISLZFAII.a(B)LLSSDQDBV;")
	public final LSSDQDBV method6() {
		if (!field1025) {
			return null;
		}

		LSSDQDBV var1 = method398();
		if (var1 == null) {
			return null;
		}

		field1382 = var1.field7;
		var1.field1097 = true;

		if (field1037) {
			return var1;
		}

		if (field1415 != -1 && field1416 != -1) {
			IMWZJOXU var2 = IMWZJOXU.field992[field1415];
			LSSDQDBV var3 = var2.method378();
			if (var3 != null) {
				LSSDQDBV var4 = new LSSDQDBV(false, var3, YGZNOIUP.method599(field1416), true);
				var4.method436(0, 0, -field1419);
				var4.method430();
				var4.method431(var2.field996.field1472[field1416]);
				var4.field1096 = null;
				var4.field1095 = null;

				if (var2.field999 != 128 || var2.field1000 != 128) {
					var4.method439(var2.field1000, var2.field999, var2.field999);
				}

				var4.method440(var2.field1002 + 64, var2.field1003 + 850, -30, -50, -30, true);
				LSSDQDBV[] var5 = new LSSDQDBV[] { var1, var4 };
				var1 = new LSSDQDBV(true, 2, var5);
			}
		}

		if (field1022 != null) {
			if (client.field211 >= field1029) {
				field1022 = null;
			}

			if (client.field211 >= field1028 && client.field211 < field1029) {
				LSSDQDBV var6 = field1022;
				var6.method436(field1021 - field1396, field1019 - field1395, field1020 - field1038);

				if (field1381 == 512) {
					var6.method434();
					var6.method434();
					var6.method434();
				} else if (field1381 == 1024) {
					var6.method434();
					var6.method434();
				} else if (field1381 == 1536) {
					var6.method434();
				}

				LSSDQDBV[] var7 = new LSSDQDBV[] { var1, var6 };
				var1 = new LSSDQDBV(true, 2, var7);

				if (field1381 == 512) {
					var6.method434();
				} else if (field1381 == 1024) {
					var6.method434();
					var6.method434();
				} else if (field1381 == 1536) {
					var6.method434();
					var6.method434();
					var6.method434();
				}

				var6.method436(field1396 - field1021, field1395 - field1019, field1038 - field1020);
			}
		}

		var1.field1097 = true;
		return var1;
	}
}
