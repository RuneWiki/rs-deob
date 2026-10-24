package deob;

@ObfuscatedName("QIVQUKBA")
public final class QIVQUKBA extends OVZHBYZU {

	@ObfuscatedName("QIVQUKBA.pb")
	public int[] field1089 = new int[5];

	@ObfuscatedName("QIVQUKBA.Eb")
	public long field1103 = -1L;

	@ObfuscatedName("QIVQUKBA.Kb")
	public int[] field1109 = new int[12];

	@ObfuscatedName("QIVQUKBA.Mb")
	public boolean field1111 = false;

	@ObfuscatedName("QIVQUKBA.Nb")
	public boolean field1112 = false;

	@ObfuscatedName("QIVQUKBA.Cb")
	public static ISXEOURU field1101 = new ISXEOURU(260);

	@ObfuscatedName("QIVQUKBA.qb")
	public int field1090;

	@ObfuscatedName("QIVQUKBA.rb")
	public int field1091;

	@ObfuscatedName("QIVQUKBA.sb")
	public int field1092;

	@ObfuscatedName("QIVQUKBA.tb")
	public int field1093;

	@ObfuscatedName("QIVQUKBA.ub")
	public int field1094;

	@ObfuscatedName("QIVQUKBA.vb")
	public int field1095;

	@ObfuscatedName("QIVQUKBA.wb")
	public int field1096;

	@ObfuscatedName("QIVQUKBA.xb")
	public int field1097;

	@ObfuscatedName("QIVQUKBA.yb")
	public int field1098;

	@ObfuscatedName("QIVQUKBA.zb")
	public int field1099;

	@ObfuscatedName("QIVQUKBA.Db")
	public int field1102;

	@ObfuscatedName("QIVQUKBA.Fb")
	public int field1104;

	@ObfuscatedName("QIVQUKBA.Gb")
	public int field1105;

	@ObfuscatedName("QIVQUKBA.Ib")
	public int field1107;

	@ObfuscatedName("QIVQUKBA.Jb")
	public int field1108;

	@ObfuscatedName("QIVQUKBA.Lb")
	public long field1110;

	@ObfuscatedName("QIVQUKBA.Ab")
	public CCYECDYX field1100;

	@ObfuscatedName("QIVQUKBA.Ob")
	public ZDMOUFDZ field1113;

	@ObfuscatedName("QIVQUKBA.Hb")
	public String field1106;

	@ObfuscatedName("QIVQUKBA.a(Z)Z")
	public final boolean method369() {
		if (!field1111) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("QIVQUKBA.a(ZLZOMNSJJM;)V")
	public final void method374(ZOMNSJJM arg0) {
		arg0.field1457 = 0;
		field1102 = arg0.method547();
		field1091 = arg0.method547();
		field1113 = null;
		field1090 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method547();
			if (var3 == 0) {
				field1109[var2] = 0;
			} else {
				int var4 = arg0.method547();
				field1109[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1109[0] == 0xFFFF) {
					field1113 = ZDMOUFDZ.method529(arg0.method549());
					break;
				}

				if (field1109[var2] >= 512 && field1109[var2] - 512 < SWITYBRD.field1201) {
					int var5 = SWITYBRD.method416(field1109[var2] - 512).field1247;
					if (var5 != 0) {
						field1090 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method547();
			if (var7 < 0 || var7 >= client.field208[var6].length) {
				var7 = 0;
			}

			field1089[var6] = var7;
		}

		field1047 = arg0.method549();
		if (field1047 == 0xFFFF) {
			field1047 = -1;
		}

		field1048 = arg0.method549();
		if (field1048 == 0xFFFF) {
			field1048 = -1;
		}

		field1042 = arg0.method549();
		if (field1042 == 0xFFFF) {
			field1042 = -1;
		}

		field1043 = arg0.method549();
		if (field1043 == 0xFFFF) {
			field1043 = -1;
		}

		field1044 = arg0.method549();
		if (field1044 == 0xFFFF) {
			field1044 = -1;
		}

		field1045 = arg0.method549();
		if (field1045 == 0xFFFF) {
			field1045 = -1;
		}

		field1059 = arg0.method549();
		if (field1059 == 0xFFFF) {
			field1059 = -1;
		}

		field1106 = LBRUMXRC.method257(LBRUMXRC.method254(arg0.method553()));
		field1104 = arg0.method547();
		field1096 = arg0.method549();
		field1111 = true;
		field1110 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1110 <<= 4;
			if (field1109[var8] >= 256) {
				field1110 += field1109[var8] - 256;
			}
		}

		if (field1109[0] >= 256) {
			field1110 += field1109[0] - 256 >> 4;
		}

		if (field1109[1] >= 256) {
			field1110 += field1109[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1110 <<= 3;
			field1110 += field1089[var9];
		}

		field1110 <<= 1;
		field1110 += field1102;
	}

	@ObfuscatedName("QIVQUKBA.c(Z)LCCYECDYX;")
	public final CCYECDYX method375() {
		if (field1113 != null) {
			int var1 = -1;
			if (field1081 >= 0 && field1084 == 0) {
				var1 = ISUBRNPG.field786[field1081].field788[field1082];
			} else if (field1034 >= 0) {
				var1 = ISUBRNPG.field786[field1034].field788[field1035];
			}

			return field1113.method530(-1, var1, null);
		}

		long var3 = field1110;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1081 >= 0 && field1084 == 0) {
			ISUBRNPG var9 = ISUBRNPG.field786[field1081];
			var5 = var9.field788[field1082];

			if (field1034 >= 0 && field1047 != field1034) {
				var6 = ISUBRNPG.field786[field1034].field788[field1035];
			}

			if (var9.field795 >= 0) {
				var7 = var9.field795;
				var3 += var7 - field1109[5] << 40;
			}

			if (var9.field796 >= 0) {
				var8 = var9.field796;
				var3 += var8 - field1109[3] << 48;
			}
		} else if (field1034 >= 0) {
			var5 = ISUBRNPG.field786[field1034].field788[field1035];
		}

		CCYECDYX var10 = (CCYECDYX) field1101.method228(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1109[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !FAQFGVMF.field759[var13 - 256].method217()) {
					var11 = true;
				}

				if (var13 >= 512 && !SWITYBRD.method416(var13 - 512).method414(field1102)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1103 != -1L) {
					var10 = (CCYECDYX) field1101.method228(field1103);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			CCYECDYX[] var14 = new CCYECDYX[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1109[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					CCYECDYX var18 = FAQFGVMF.field759[var17 - 256].method218();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					CCYECDYX var19 = SWITYBRD.method416(var17 - 512).method417(field1102);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new CCYECDYX(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1089[var20] != 0) {
					var10.method25(client.field208[var20][0], client.field208[var20][field1089[var20]]);

					if (var20 == 1) {
						var10.method25(client.field473[0], client.field473[field1089[var20]]);
					}
				}
			}

			var10.method18();
			var10.method28(64, 850, -30, -50, -30, true);
			field1101.method229(var3, var10);
			field1103 = var3;
		}

		if (field1112) {
			return var10;
		}

		CCYECDYX var21 = CCYECDYX.field22;
		var21.method13(RKTGZGSS.method383(var5) & RKTGZGSS.method383(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method20(ISUBRNPG.field786[field1081].field792, var5, var6);
		} else if (var5 != -1) {
			var21.method19(var5);
		}

		var21.method15();
		var21.field59 = null;
		var21.field58 = null;
		return var21;
	}

	@ObfuscatedName("QIVQUKBA.a(B)LCCYECDYX;")
	public final CCYECDYX method181() {
		if (!field1111) {
			return null;
		}

		CCYECDYX var1 = method375();
		if (var1 == null) {
			return null;
		}

		field1049 = var1.field1289;
		var1.field60 = true;

		if (field1112) {
			return var1;
		}

		if (field1037 != -1 && field1038 != -1) {
			ZSSCYSIO var2 = ZSSCYSIO.field1476[field1037];
			CCYECDYX var3 = var2.method590();
			if (var3 != null) {
				CCYECDYX var4 = new CCYECDYX(RKTGZGSS.method383(field1038), var3, false, true);
				var4.method24(0, 0, -field1041);
				var4.method18();
				var4.method19(var2.field1480.field788[field1038]);
				var4.field59 = null;
				var4.field58 = null;

				if (var2.field1483 != 128 || var2.field1484 != 128) {
					var4.method27(var2.field1483, var2.field1484, var2.field1483);
				}

				var4.method28(var2.field1486 + 64, var2.field1487 + 850, -30, -50, -30, true);
				CCYECDYX[] var5 = new CCYECDYX[] { var1, var4 };
				var1 = new CCYECDYX(true, var5, 2);
			}
		}

		if (field1100 != null) {
			if (client.field399 >= field1108) {
				field1100 = null;
			}

			if (client.field399 >= field1107 && client.field399 < field1108) {
				CCYECDYX var6 = field1100;
				var6.method24(field1097 - field1069, field1099 - field1070, field1098 - field1105);

				if (field1064 == 512) {
					var6.method22();
					var6.method22();
					var6.method22();
				} else if (field1064 == 1024) {
					var6.method22();
					var6.method22();
				} else if (field1064 == 1536) {
					var6.method22();
				}

				CCYECDYX[] var7 = new CCYECDYX[] { var1, var6 };
				var1 = new CCYECDYX(true, var7, 2);

				if (field1064 == 512) {
					var6.method22();
				} else if (field1064 == 1024) {
					var6.method22();
					var6.method22();
				} else if (field1064 == 1536) {
					var6.method22();
					var6.method22();
					var6.method22();
				}

				var6.method24(field1069 - field1097, field1070 - field1099, field1105 - field1098);
			}
		}

		var1.field60 = true;
		return var1;
	}

	@ObfuscatedName("QIVQUKBA.b(B)LCCYECDYX;")
	public final CCYECDYX method376() {
		if (!field1111) {
			return null;
		}

		if (field1113 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1109[var2];
				if (var3 >= 256 && var3 < 512 && !FAQFGVMF.field759[var3 - 256].method219()) {
					var1 = true;
				}

				if (var3 >= 512 && !SWITYBRD.method416(var3 - 512).method411(field1102)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			CCYECDYX[] var4 = new CCYECDYX[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1109[var6];
				if (var7 >= 256 && var7 < 512) {
					CCYECDYX var8 = FAQFGVMF.field759[var7 - 256].method220();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					CCYECDYX var9 = SWITYBRD.method416(var7 - 512).method415(field1102);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			CCYECDYX var10 = new CCYECDYX(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1089[var11] != 0) {
					var10.method25(client.field208[var11][0], client.field208[var11][field1089[var11]]);

					if (var11 == 1) {
						var10.method25(client.field473[0], client.field473[field1089[var11]]);
					}
				}
			}

			return var10;
		}

		return field1113.method533();
	}
}
