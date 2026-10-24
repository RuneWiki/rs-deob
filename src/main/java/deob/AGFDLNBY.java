package deob;

@ObfuscatedName("AGFDLNBY")
public final class AGFDLNBY extends YOWFBYTG {

	@ObfuscatedName("AGFDLNBY.tb")
	public int[] field4 = new int[12];

	@ObfuscatedName("AGFDLNBY.ub")
	public int[] field5 = new int[5];

	@ObfuscatedName("AGFDLNBY.Gb")
	public boolean field15 = false;

	@ObfuscatedName("AGFDLNBY.Ob")
	public long field22 = -1L;

	@ObfuscatedName("AGFDLNBY.Rb")
	public boolean field25 = false;

	@ObfuscatedName("AGFDLNBY.Fb")
	public static GOHJFVWE field14 = new GOHJFVWE(260);

	@ObfuscatedName("AGFDLNBY.qb")
	public int field1;

	@ObfuscatedName("AGFDLNBY.Db")
	public int field12;

	@ObfuscatedName("AGFDLNBY.Eb")
	public int field13;

	@ObfuscatedName("AGFDLNBY.Hb")
	public int field16;

	@ObfuscatedName("AGFDLNBY.Ib")
	public int field17;

	@ObfuscatedName("AGFDLNBY.Jb")
	public int field18;

	@ObfuscatedName("AGFDLNBY.Kb")
	public int field19;

	@ObfuscatedName("AGFDLNBY.Lb")
	public int field20;

	@ObfuscatedName("AGFDLNBY.Mb")
	public int field21;

	@ObfuscatedName("AGFDLNBY.Qb")
	public int field24;

	@ObfuscatedName("AGFDLNBY.sb")
	public int field3;

	@ObfuscatedName("AGFDLNBY.wb")
	public int field6;

	@ObfuscatedName("AGFDLNBY.xb")
	public int field7;

	@ObfuscatedName("AGFDLNBY.yb")
	public int field8;

	@ObfuscatedName("AGFDLNBY.zb")
	public int field9;

	@ObfuscatedName("AGFDLNBY.Pb")
	public long field23;

	@ObfuscatedName("AGFDLNBY.rb")
	public FKIKYVJJ field2;

	@ObfuscatedName("AGFDLNBY.Ab")
	public OIBEFFXI field10;

	@ObfuscatedName("AGFDLNBY.Bb")
	public String field11;

	@ObfuscatedName("AGFDLNBY.a(I)Z")
	public final boolean method1() {
		if (!field15) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("AGFDLNBY.a(Z)LOIBEFFXI;")
	public final OIBEFFXI method2() {
		if (!field15) {
			return null;
		}

		OIBEFFXI var1 = method5();
		if (var1 == null) {
			return null;
		}

		field1359 = var1.field1333;
		var1.field986 = true;

		if (field25) {
			return var1;
		}

		if (field1381 != -1 && field1382 != -1) {
			IDQQUVDL var2 = IDQQUVDL.field738[field1381];
			OIBEFFXI var3 = var2.method233();
			if (var3 != null) {
				OIBEFFXI var4 = new OIBEFFXI(false, true, var3, UXVWESOT.method455(field1382));
				var4.method359(0, 0, -field1385);
				var4.method353();
				var4.method354(var2.field742.field152[field1382]);
				var4.field985 = null;
				var4.field984 = null;

				if (var2.field745 != 128 || var2.field746 != 128) {
					var4.method362(var2.field746, var2.field745, var2.field745);
				}

				var4.method363(var2.field748 + 64, var2.field749 + 850, -30, -50, -30, true);
				OIBEFFXI[] var5 = new OIBEFFXI[] { var1, var4 };
				var1 = new OIBEFFXI(2, var5, true);
			}
		}

		if (field10 != null) {
			if (client.field316 >= field21) {
				field10 = null;
			}

			if (client.field316 >= field20 && client.field316 < field21) {
				OIBEFFXI var6 = field10;
				var6.method359(field9 - field1371, field7 - field1370, field8 - field6);

				if (field1363 == 512) {
					var6.method357();
					var6.method357();
					var6.method357();
				} else if (field1363 == 1024) {
					var6.method357();
					var6.method357();
				} else if (field1363 == 1536) {
					var6.method357();
				}

				OIBEFFXI[] var7 = new OIBEFFXI[] { var1, var6 };
				var1 = new OIBEFFXI(2, var7, true);

				if (field1363 == 512) {
					var6.method357();
				} else if (field1363 == 1024) {
					var6.method357();
					var6.method357();
				} else if (field1363 == 1536) {
					var6.method357();
					var6.method357();
					var6.method357();
				}

				var6.method359(field1371 - field9, field1370 - field7, field6 - field8);
			}
		}

		var1.field986 = true;
		return var1;
	}

	@ObfuscatedName("AGFDLNBY.b(I)LOIBEFFXI;")
	public final OIBEFFXI method3() {
		if (!field15) {
			return null;
		}

		if (field2 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field4[var2];
				if (var3 >= 256 && var3 < 512 && !XAYNDIOJ.field1286[var3 - 256].method512()) {
					var1 = true;
				}

				if (var3 >= 512 && !AIEFUHUQ.method13(var3 - 512).method8(field12)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			OIBEFFXI[] var4 = new OIBEFFXI[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field4[var6];
				if (var7 >= 256 && var7 < 512) {
					OIBEFFXI var8 = XAYNDIOJ.field1286[var7 - 256].method513();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					OIBEFFXI var9 = AIEFUHUQ.method13(var7 - 512).method18(field12);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			OIBEFFXI var10 = new OIBEFFXI(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field5[var11] != 0) {
					var10.method360(client.field488[var11][0], client.field488[var11][field5[var11]]);

					if (var11 == 1) {
						var10.method360(client.field535[0], client.field535[field5[var11]]);
					}
				}
			}

			return var10;
		}

		return field2.method205();
	}

	@ObfuscatedName("AGFDLNBY.a(ILYOXDZEVD;)V")
	public final void method4(YOXDZEVD arg0) {
		arg0.field1393 = 0;
		field12 = arg0.method549();
		field24 = arg0.method549();
		field2 = null;
		field1 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method549();
			if (var3 == 0) {
				field4[var2] = 0;
			} else {
				int var4 = arg0.method549();
				field4[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field4[0] == 0xFFFF) {
					field2 = FKIKYVJJ.method202(arg0.method551());
					break;
				}

				if (field4[var2] >= 512 && field4[var2] - 512 < AIEFUHUQ.field57) {
					int var5 = AIEFUHUQ.method13(field4[var2] - 512).field90;
					if (var5 != 0) {
						field1 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method549();
			if (var7 < 0 || var7 >= client.field488[var6].length) {
				var7 = 0;
			}

			field5[var6] = var7;
		}

		field1387 = arg0.method551();
		if (field1387 == 0xFFFF) {
			field1387 = -1;
		}

		field1388 = arg0.method551();
		if (field1388 == 0xFFFF) {
			field1388 = -1;
		}

		field1366 = arg0.method551();
		if (field1366 == 0xFFFF) {
			field1366 = -1;
		}

		field1367 = arg0.method551();
		if (field1367 == 0xFFFF) {
			field1367 = -1;
		}

		field1368 = arg0.method551();
		if (field1368 == 0xFFFF) {
			field1368 = -1;
		}

		field1369 = arg0.method551();
		if (field1369 == 0xFFFF) {
			field1369 = -1;
		}

		field1358 = arg0.method551();
		if (field1358 == 0xFFFF) {
			field1358 = -1;
		}

		field11 = FWDMWOLO.method213(FWDMWOLO.method210(arg0.method555()));
		field3 = arg0.method549();
		field13 = arg0.method551();
		field15 = true;
		field23 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field23 <<= 4;
			if (field4[var8] >= 256) {
				field23 += field4[var8] - 256;
			}
		}

		if (field4[0] >= 256) {
			field23 += field4[0] - 256 >> 4;
		}

		if (field4[1] >= 256) {
			field23 += field4[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field23 <<= 3;
			field23 += field5[var9];
		}

		field23 <<= 1;
		field23 += field12;
	}

	@ObfuscatedName("AGFDLNBY.c(I)LOIBEFFXI;")
	public final OIBEFFXI method5() {
		if (field2 != null) {
			int var1 = -1;
			if (field1376 >= 0 && field1379 == 0) {
				var1 = CGWBYVFN.field150[field1376].field152[field1377];
			} else if (field1373 >= 0) {
				var1 = CGWBYVFN.field150[field1373].field152[field1374];
			}

			return field2.method208(null, var1, -1);
		}

		long var3 = field23;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1376 >= 0 && field1379 == 0) {
			CGWBYVFN var9 = CGWBYVFN.field150[field1376];
			var5 = var9.field152[field1377];

			if (field1373 >= 0 && field1387 != field1373) {
				var6 = CGWBYVFN.field150[field1373].field152[field1374];
			}

			if (var9.field159 >= 0) {
				var7 = var9.field159;
				var3 += var7 - field4[5] << 40;
			}

			if (var9.field160 >= 0) {
				var8 = var9.field160;
				var3 += var8 - field4[3] << 48;
			}
		} else if (field1373 >= 0) {
			var5 = CGWBYVFN.field150[field1373].field152[field1374];
		}

		OIBEFFXI var10 = (OIBEFFXI) field14.method227(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field4[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !XAYNDIOJ.field1286[var13 - 256].method510()) {
					var11 = true;
				}

				if (var13 >= 512 && !AIEFUHUQ.method13(var13 - 512).method9(field12)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field22 != -1L) {
					var10 = (OIBEFFXI) field14.method227(field22);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			OIBEFFXI[] var14 = new OIBEFFXI[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field4[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					OIBEFFXI var18 = XAYNDIOJ.field1286[var17 - 256].method511();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					OIBEFFXI var19 = AIEFUHUQ.method13(var17 - 512).method11(field12);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new OIBEFFXI(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field5[var20] != 0) {
					var10.method360(client.field488[var20][0], client.field488[var20][field5[var20]]);

					if (var20 == 1) {
						var10.method360(client.field535[0], client.field535[field5[var20]]);
					}
				}
			}

			var10.method353();
			var10.method363(64, 850, -30, -50, -30, true);
			field14.method228(var10, var3);
			field22 = var3;
		}

		if (field25) {
			return var10;
		}

		OIBEFFXI var21 = OIBEFFXI.field948;
		var21.method348(UXVWESOT.method455(var5) & UXVWESOT.method455(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method355(CGWBYVFN.field150[field1376].field156, var5, var6);
		} else if (var5 != -1) {
			var21.method354(var5);
		}

		var21.method350();
		var21.field985 = null;
		var21.field984 = null;
		return var21;
	}
}
