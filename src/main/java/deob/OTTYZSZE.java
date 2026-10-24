package deob;

@ObfuscatedName("OTTYZSZE")
public final class OTTYZSZE extends YHEHTOVP {

	@ObfuscatedName("OTTYZSZE.zb")
	public long field1031 = -1L;

	@ObfuscatedName("OTTYZSZE.Bb")
	public int[] field1033 = new int[12];

	@ObfuscatedName("OTTYZSZE.Cb")
	public boolean field1034 = false;

	@ObfuscatedName("OTTYZSZE.Jb")
	public boolean field1039 = false;

	@ObfuscatedName("OTTYZSZE.Kb")
	public int[] field1040 = new int[5];

	@ObfuscatedName("OTTYZSZE.Hb")
	public static JLTMYUOM field1037 = new JLTMYUOM(260);

	@ObfuscatedName("OTTYZSZE.rb")
	public int field1023;

	@ObfuscatedName("OTTYZSZE.sb")
	public int field1024;

	@ObfuscatedName("OTTYZSZE.tb")
	public int field1025;

	@ObfuscatedName("OTTYZSZE.ub")
	public int field1026;

	@ObfuscatedName("OTTYZSZE.vb")
	public int field1027;

	@ObfuscatedName("OTTYZSZE.yb")
	public int field1030;

	@ObfuscatedName("OTTYZSZE.Ab")
	public int field1032;

	@ObfuscatedName("OTTYZSZE.Fb")
	public int field1035;

	@ObfuscatedName("OTTYZSZE.Mb")
	public int field1041;

	@ObfuscatedName("OTTYZSZE.Nb")
	public int field1042;

	@ObfuscatedName("OTTYZSZE.Ob")
	public int field1043;

	@ObfuscatedName("OTTYZSZE.Pb")
	public int field1044;

	@ObfuscatedName("OTTYZSZE.Qb")
	public int field1045;

	@ObfuscatedName("OTTYZSZE.Rb")
	public int field1046;

	@ObfuscatedName("OTTYZSZE.Tb")
	public int field1047;

	@ObfuscatedName("OTTYZSZE.Gb")
	public long field1036;

	@ObfuscatedName("OTTYZSZE.wb")
	public FUTAQMCE field1028;

	@ObfuscatedName("OTTYZSZE.xb")
	public NHTDEVDA field1029;

	@ObfuscatedName("OTTYZSZE.Ib")
	public String field1038;

	@ObfuscatedName("OTTYZSZE.b(I)Z")
	public final boolean method245() {
		if (!field1039) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("OTTYZSZE.d(I)LFUTAQMCE;")
	public final FUTAQMCE method389() {
		if (field1029 != null) {
			int var1 = -1;
			if (field1450 >= 0 && field1453 == 0) {
				var1 = GMRGYXFL.field720[field1450].field722[field1451];
			} else if (field1444 >= 0) {
				var1 = GMRGYXFL.field720[field1444].field722[field1445];
			}

			return field1029.method367(null, -1, var1);
		}

		long var3 = field1036;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1450 >= 0 && field1453 == 0) {
			GMRGYXFL var9 = GMRGYXFL.field720[field1450];
			var5 = var9.field722[field1451];

			if (field1444 >= 0 && field1444 != field1431) {
				var6 = GMRGYXFL.field720[field1444].field722[field1445];
			}

			if (var9.field729 >= 0) {
				var7 = var9.field729;
				var3 += var7 - field1033[5] << 40;
			}

			if (var9.field730 >= 0) {
				var8 = var9.field730;
				var3 += var8 - field1033[3] << 48;
			}
		} else if (field1444 >= 0) {
			var5 = GMRGYXFL.field720[field1444].field722[field1445];
		}

		FUTAQMCE var10 = (FUTAQMCE) field1037.method297(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1033[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !OQTGDMNX.field1016[var13 - 256].method385()) {
					var11 = true;
				}

				if (var13 >= 512 && !AOLTHQTO.method13(var13 - 512).method9(field1035)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1031 != -1L) {
					var10 = (FUTAQMCE) field1037.method297(field1031);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			FUTAQMCE[] var14 = new FUTAQMCE[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1033[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					FUTAQMCE var18 = OQTGDMNX.field1016[var17 - 256].method386();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					FUTAQMCE var19 = AOLTHQTO.method13(var17 - 512).method7(field1035);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new FUTAQMCE(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1040[var20] != 0) {
					var10.method264(client.field501[var20][0], client.field501[var20][field1040[var20]]);

					if (var20 == 1) {
						var10.method264(client.field399[0], client.field399[field1040[var20]]);
					}
				}
			}

			var10.method257();
			var10.method267(64, 850, -30, -50, -30, true);
			field1037.method298(var3, var10);
			field1031 = var3;
		}

		if (field1034) {
			return var10;
		}

		FUTAQMCE var21 = FUTAQMCE.field633;
		var21.method252(RYVJCVCB.method428(var5) & RYVJCVCB.method428(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method259(GMRGYXFL.field720[field1450].field726, var5, var6);
		} else if (var5 != -1) {
			var21.method258(var5);
		}

		var21.method254();
		var21.field670 = null;
		var21.field669 = null;
		return var21;
	}

	@ObfuscatedName("OTTYZSZE.a(ZLXJCNBMKS;)V")
	public final void method390(XJCNBMKS arg0) {
		arg0.field1403 = 0;
		field1035 = arg0.method534();
		field1047 = arg0.method534();
		field1029 = null;
		field1032 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method534();
			if (var3 == 0) {
				field1033[var2] = 0;
			} else {
				int var4 = arg0.method534();
				field1033[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1033[0] == 0xFFFF) {
					field1029 = NHTDEVDA.method368(arg0.method536());
					break;
				}

				if (field1033[var2] >= 512 && field1033[var2] - 512 < AOLTHQTO.field44) {
					int var5 = AOLTHQTO.method13(field1033[var2] - 512).field70;
					if (var5 != 0) {
						field1032 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method534();
			if (var7 < 0 || var7 >= client.field501[var6].length) {
				var7 = 0;
			}

			field1040[var6] = var7;
		}

		field1431 = arg0.method536();
		if (field1431 == 0xFFFF) {
			field1431 = -1;
		}

		field1432 = arg0.method536();
		if (field1432 == 0xFFFF) {
			field1432 = -1;
		}

		field1465 = arg0.method536();
		if (field1465 == 0xFFFF) {
			field1465 = -1;
		}

		field1466 = arg0.method536();
		if (field1466 == 0xFFFF) {
			field1466 = -1;
		}

		field1467 = arg0.method536();
		if (field1467 == 0xFFFF) {
			field1467 = -1;
		}

		field1468 = arg0.method536();
		if (field1468 == 0xFFFF) {
			field1468 = -1;
		}

		field1425 = arg0.method536();
		if (field1425 == 0xFFFF) {
			field1425 = -1;
		}

		field1038 = UWUPOZSY.method490(UWUPOZSY.method487(arg0.method540()));
		field1030 = arg0.method534();
		field1045 = arg0.method536();
		field1039 = true;
		field1036 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1036 <<= 4;
			if (field1033[var8] >= 256) {
				field1036 += field1033[var8] - 256;
			}
		}

		if (field1033[0] >= 256) {
			field1036 += field1033[0] - 256 >> 4;
		}

		if (field1033[1] >= 256) {
			field1036 += field1033[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1036 <<= 3;
			field1036 += field1040[var9];
		}

		field1036 <<= 1;
		field1036 += field1035;
	}

	@ObfuscatedName("OTTYZSZE.a(Z)LFUTAQMCE;")
	public final FUTAQMCE method391() {
		if (!field1039) {
			return null;
		}

		if (field1029 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1033[var2];
				if (var3 >= 256 && var3 < 512 && !OQTGDMNX.field1016[var3 - 256].method387()) {
					var1 = true;
				}

				if (var3 >= 512 && !AOLTHQTO.method13(var3 - 512).method16(field1035)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			FUTAQMCE[] var4 = new FUTAQMCE[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1033[var6];
				if (var7 >= 256 && var7 < 512) {
					FUTAQMCE var8 = OQTGDMNX.field1016[var7 - 256].method388();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					FUTAQMCE var9 = AOLTHQTO.method13(var7 - 512).method11(field1035);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			FUTAQMCE var10 = new FUTAQMCE(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1040[var11] != 0) {
					var10.method264(client.field501[var11][0], client.field501[var11][field1040[var11]]);

					if (var11 == 1) {
						var10.method264(client.field399[0], client.field399[field1040[var11]]);
					}
				}
			}

			return var10;
		}

		return field1029.method366();
	}

	@ObfuscatedName("OTTYZSZE.a(I)LFUTAQMCE;")
	public final FUTAQMCE method2() {
		if (!field1039) {
			return null;
		}

		FUTAQMCE var1 = method389();
		if (var1 == null) {
			return null;
		}

		field1459 = var1.field976;
		var1.field671 = true;

		if (field1034) {
			return var1;
		}

		if (field1426 != -1 && field1427 != -1) {
			VSBOWDVL var2 = VSBOWDVL.field1380[field1426];
			FUTAQMCE var3 = var2.method519();
			if (var3 != null) {
				FUTAQMCE var4 = new FUTAQMCE(var3, false, true, RYVJCVCB.method428(field1427));
				var4.method263(0, -field1430, 0);
				var4.method257();
				var4.method258(var2.field1384.field722[field1427]);
				var4.field670 = null;
				var4.field669 = null;

				if (var2.field1387 != 128 || var2.field1388 != 128) {
					var4.method266(var2.field1387, var2.field1388, var2.field1387);
				}

				var4.method267(var2.field1390 + 64, var2.field1391 + 850, -30, -50, -30, true);
				FUTAQMCE[] var5 = new FUTAQMCE[] { var1, var4 };
				var1 = new FUTAQMCE(2, var5, true);
			}
		}

		if (field1028 != null) {
			if (client.field376 >= field1024) {
				field1028 = null;
			}

			if (client.field376 >= field1023 && client.field376 < field1024) {
				FUTAQMCE var6 = field1028;
				var6.method263(field1027 - field1473, field1026 - field1046, field1025 - field1472);

				if (field1447 == 512) {
					var6.method261();
					var6.method261();
					var6.method261();
				} else if (field1447 == 1024) {
					var6.method261();
					var6.method261();
				} else if (field1447 == 1536) {
					var6.method261();
				}

				FUTAQMCE[] var7 = new FUTAQMCE[] { var1, var6 };
				var1 = new FUTAQMCE(2, var7, true);

				if (field1447 == 512) {
					var6.method261();
				} else if (field1447 == 1024) {
					var6.method261();
					var6.method261();
				} else if (field1447 == 1536) {
					var6.method261();
					var6.method261();
					var6.method261();
				}

				var6.method263(field1473 - field1027, field1046 - field1026, field1472 - field1025);
			}
		}

		var1.field671 = true;
		return var1;
	}
}
