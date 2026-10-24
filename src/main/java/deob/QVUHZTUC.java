package deob;

@ObfuscatedName("QVUHZTUC")
public final class QVUHZTUC extends NUUJCJXB {

	@ObfuscatedName("QVUHZTUC.vb")
	public int[] field1235 = new int[12];

	@ObfuscatedName("QVUHZTUC.Gb")
	public boolean field1246 = false;

	@ObfuscatedName("QVUHZTUC.Hb")
	public int[] field1247 = new int[5];

	@ObfuscatedName("QVUHZTUC.Jb")
	public boolean field1248 = false;

	@ObfuscatedName("QVUHZTUC.Tb")
	public long field1256 = -1L;

	@ObfuscatedName("QVUHZTUC.xb")
	public static JETHVCIV field1237 = new JETHVCIV(260);

	@ObfuscatedName("QVUHZTUC.ub")
	public int field1234;

	@ObfuscatedName("QVUHZTUC.yb")
	public int field1238;

	@ObfuscatedName("QVUHZTUC.zb")
	public int field1239;

	@ObfuscatedName("QVUHZTUC.Ab")
	public int field1240;

	@ObfuscatedName("QVUHZTUC.Cb")
	public int field1242;

	@ObfuscatedName("QVUHZTUC.Db")
	public int field1243;

	@ObfuscatedName("QVUHZTUC.Eb")
	public int field1244;

	@ObfuscatedName("QVUHZTUC.Fb")
	public int field1245;

	@ObfuscatedName("QVUHZTUC.Mb")
	public int field1250;

	@ObfuscatedName("QVUHZTUC.Ob")
	public int field1251;

	@ObfuscatedName("QVUHZTUC.Pb")
	public int field1252;

	@ObfuscatedName("QVUHZTUC.Qb")
	public int field1253;

	@ObfuscatedName("QVUHZTUC.Sb")
	public int field1255;

	@ObfuscatedName("QVUHZTUC.Vb")
	public int field1257;

	@ObfuscatedName("QVUHZTUC.Wb")
	public int field1258;

	@ObfuscatedName("QVUHZTUC.Rb")
	public long field1254;

	@ObfuscatedName("QVUHZTUC.Bb")
	public JLNSJQDR field1241;

	@ObfuscatedName("QVUHZTUC.Lb")
	public RRZTMHXJ field1249;

	@ObfuscatedName("QVUHZTUC.wb")
	public String field1236;

	@ObfuscatedName("QVUHZTUC.a(B)LJLNSJQDR;")
	public final JLNSJQDR method465() {
		if (field1249 != null) {
			int var1 = -1;
			if (field1132 >= 0 && field1135 == 0) {
				var1 = OXBPHQKK.field1152[field1132].field1154[field1133];
			} else if (field1124 >= 0) {
				var1 = OXBPHQKK.field1152[field1124].field1154[field1125];
			}

			return field1249.method485(null, var1, -1);
		}

		long var3 = field1254;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1132 >= 0 && field1135 == 0) {
			OXBPHQKK var9 = OXBPHQKK.field1152[field1132];
			var5 = var9.field1154[field1133];

			if (field1124 >= 0 && field1140 != field1124) {
				var6 = OXBPHQKK.field1152[field1124].field1154[field1125];
			}

			if (var9.field1161 >= 0) {
				var7 = var9.field1161;
				var3 += var7 - field1235[5] << 40;
			}

			if (var9.field1162 >= 0) {
				var8 = var9.field1162;
				var3 += var8 - field1235[3] << 48;
			}
		} else if (field1124 >= 0) {
			var5 = OXBPHQKK.field1152[field1124].field1154[field1125];
		}

		JLNSJQDR var10 = (JLNSJQDR) field1237.method315(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1235[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !RHGWIWMQ.field1268[var13 - 256].method478()) {
					var11 = true;
				}

				if (var13 >= 512 && !LGNJKIJR.method409(var13 - 512).method411(field1234)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1256 != -1L) {
					var10 = (JLNSJQDR) field1237.method315(field1256);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			JLNSJQDR[] var14 = new JLNSJQDR[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1235[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					JLNSJQDR var18 = RHGWIWMQ.field1268[var17 - 256].method479();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					JLNSJQDR var19 = LGNJKIJR.method409(var17 - 512).method412(field1234);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new JLNSJQDR(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1247[var20] != 0) {
					var10.method342(client.field102[var20][0], client.field102[var20][field1247[var20]]);

					if (var20 == 1) {
						var10.method342(client.field394[0], client.field394[field1247[var20]]);
					}
				}
			}

			var10.method335();
			var10.method345(64, 850, -30, -50, -30, true);
			field1237.method316(var10, var3);
			field1256 = var3;
		}

		if (field1248) {
			return var10;
		}

		JLNSJQDR var21 = JLNSJQDR.field817;
		var21.method330(var10, UIZESDZR.method524(var5) & UIZESDZR.method524(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method337(OXBPHQKK.field1152[field1132].field1158, var5, var6);
		} else if (var5 != -1) {
			var21.method336(var5);
		}

		var21.method332();
		var21.field854 = null;
		var21.field853 = null;
		return var21;
	}

	@ObfuscatedName("QVUHZTUC.a(I)LJLNSJQDR;")
	public final JLNSJQDR method2() {
		if (!field1246) {
			return null;
		}

		JLNSJQDR var1 = method465();
		if (var1 == null) {
			return null;
		}

		field1110 = var1.field3;
		var1.field855 = true;

		if (field1248) {
			return var1;
		}

		if (field1099 != -1 && field1100 != -1) {
			MKJLFPRH var2 = MKJLFPRH.field1051[field1099];
			JLNSJQDR var3 = var2.method423();
			if (var3 != null) {
				JLNSJQDR var4 = new JLNSJQDR(UIZESDZR.method524(field1100), false, true, var3);
				var4.method341(-field1103, 0, 0);
				var4.method335();
				var4.method336(var2.field1055.field1154[field1100]);
				var4.field854 = null;
				var4.field853 = null;

				if (var2.field1058 != 128 || var2.field1059 != 128) {
					var4.method344(var2.field1058, var2.field1059, var2.field1058);
				}

				var4.method345(var2.field1061 + 64, var2.field1062 + 850, -30, -50, -30, true);
				JLNSJQDR[] var5 = new JLNSJQDR[] { var1, var4 };
				var1 = new JLNSJQDR(true, var5, 2);
			}
		}

		if (field1241 != null) {
			if (client.field239 >= field1253) {
				field1241 = null;
			}

			if (client.field239 >= field1252 && client.field239 < field1253) {
				JLNSJQDR var6 = field1241;
				var6.method341(field1239 - field1255, field1240 - field1112, field1238 - field1111);

				if (field1096 == 512) {
					var6.method339();
					var6.method339();
					var6.method339();
				} else if (field1096 == 1024) {
					var6.method339();
					var6.method339();
				} else if (field1096 == 1536) {
					var6.method339();
				}

				JLNSJQDR[] var7 = new JLNSJQDR[] { var1, var6 };
				var1 = new JLNSJQDR(true, var7, 2);

				if (field1096 == 512) {
					var6.method339();
				} else if (field1096 == 1024) {
					var6.method339();
					var6.method339();
				} else if (field1096 == 1536) {
					var6.method339();
					var6.method339();
					var6.method339();
				}

				var6.method341(field1255 - field1239, field1112 - field1240, field1111 - field1238);
			}
		}

		var1.field855 = true;
		return var1;
	}

	@ObfuscatedName("QVUHZTUC.b(I)LJLNSJQDR;")
	public final JLNSJQDR method466() {
		if (!field1246) {
			return null;
		}

		if (field1249 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1235[var2];
				if (var3 >= 256 && var3 < 512 && !RHGWIWMQ.field1268[var3 - 256].method480()) {
					var1 = true;
				}

				if (var3 >= 512 && !LGNJKIJR.method409(var3 - 512).method414(field1234)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			JLNSJQDR[] var4 = new JLNSJQDR[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1235[var6];
				if (var7 >= 256 && var7 < 512) {
					JLNSJQDR var8 = RHGWIWMQ.field1268[var7 - 256].method481();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					JLNSJQDR var9 = LGNJKIJR.method409(var7 - 512).method410(field1234);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			JLNSJQDR var10 = new JLNSJQDR(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1247[var11] != 0) {
					var10.method342(client.field102[var11][0], client.field102[var11][field1247[var11]]);

					if (var11 == 1) {
						var10.method342(client.field394[0], client.field394[field1247[var11]]);
					}
				}
			}

			return var10;
		}

		return field1249.method486();
	}

	@ObfuscatedName("QVUHZTUC.a(BLBJPWOXRJ;)V")
	public final void method467(BJPWOXRJ arg0) {
		arg0.field5 = 0;
		field1234 = arg0.method15();
		field1258 = arg0.method15();
		field1249 = null;
		field1250 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method15();
			if (var3 == 0) {
				field1235[var2] = 0;
			} else {
				int var4 = arg0.method15();
				field1235[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1235[0] == 0xFFFF) {
					field1249 = RRZTMHXJ.method488(arg0.method17());
					break;
				}

				if (field1235[var2] >= 512 && field1235[var2] - 512 < LGNJKIJR.field1003) {
					int var5 = LGNJKIJR.method409(field1235[var2] - 512).field1010;
					if (var5 != 0) {
						field1250 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method15();
			if (var7 < 0 || var7 >= client.field102[var6].length) {
				var7 = 0;
			}

			field1247[var6] = var7;
		}

		field1140 = arg0.method17();
		if (field1140 == 0xFFFF) {
			field1140 = -1;
		}

		field1141 = arg0.method17();
		if (field1141 == 0xFFFF) {
			field1141 = -1;
		}

		field1128 = arg0.method17();
		if (field1128 == 0xFFFF) {
			field1128 = -1;
		}

		field1129 = arg0.method17();
		if (field1129 == 0xFFFF) {
			field1129 = -1;
		}

		field1130 = arg0.method17();
		if (field1130 == 0xFFFF) {
			field1130 = -1;
		}

		field1131 = arg0.method17();
		if (field1131 == 0xFFFF) {
			field1131 = -1;
		}

		field1104 = arg0.method17();
		if (field1104 == 0xFFFF) {
			field1104 = -1;
		}

		field1236 = PQGPOSRV.method463(PQGPOSRV.method460(arg0.method21()));
		field1251 = arg0.method15();
		field1257 = arg0.method17();
		field1246 = true;
		field1254 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1254 <<= 4;
			if (field1235[var8] >= 256) {
				field1254 += field1235[var8] - 256;
			}
		}

		if (field1235[0] >= 256) {
			field1254 += field1235[0] - 256 >> 4;
		}

		if (field1235[1] >= 256) {
			field1254 += field1235[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1254 <<= 3;
			field1254 += field1247[var9];
		}

		field1254 <<= 1;
		field1254 += field1234;
	}

	@ObfuscatedName("QVUHZTUC.a(Z)Z")
	public final boolean method297() {
		if (!field1246) {
			return false;
		}

		return true;
	}
}
