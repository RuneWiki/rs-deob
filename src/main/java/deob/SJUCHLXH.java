package deob;

@ObfuscatedName("SJUCHLXH")
public final class SJUCHLXH extends BBWFUJHQ {

	@ObfuscatedName("SJUCHLXH.tb")
	public int[] field1102 = new int[12];

	@ObfuscatedName("SJUCHLXH.ub")
	public boolean field1103 = false;

	@ObfuscatedName("SJUCHLXH.yb")
	public boolean field1107 = false;

	@ObfuscatedName("SJUCHLXH.Kb")
	public long field1117 = -1L;

	@ObfuscatedName("SJUCHLXH.Sb")
	public int[] field1124 = new int[5];

	@ObfuscatedName("SJUCHLXH.Cb")
	public static WMYPWVZI field1109 = new WMYPWVZI(260);

	@ObfuscatedName("SJUCHLXH.vb")
	public int field1104;

	@ObfuscatedName("SJUCHLXH.wb")
	public int field1105;

	@ObfuscatedName("SJUCHLXH.xb")
	public int field1106;

	@ObfuscatedName("SJUCHLXH.zb")
	public int field1108;

	@ObfuscatedName("SJUCHLXH.Eb")
	public int field1111;

	@ObfuscatedName("SJUCHLXH.Fb")
	public int field1112;

	@ObfuscatedName("SJUCHLXH.Gb")
	public int field1113;

	@ObfuscatedName("SJUCHLXH.Hb")
	public int field1114;

	@ObfuscatedName("SJUCHLXH.Ib")
	public int field1115;

	@ObfuscatedName("SJUCHLXH.Lb")
	public int field1118;

	@ObfuscatedName("SJUCHLXH.Nb")
	public int field1119;

	@ObfuscatedName("SJUCHLXH.Ob")
	public int field1120;

	@ObfuscatedName("SJUCHLXH.Pb")
	public int field1121;

	@ObfuscatedName("SJUCHLXH.Tb")
	public int field1125;

	@ObfuscatedName("SJUCHLXH.Vb")
	public int field1126;

	@ObfuscatedName("SJUCHLXH.Rb")
	public long field1123;

	@ObfuscatedName("SJUCHLXH.Db")
	public WHKCNEXD field1110;

	@ObfuscatedName("SJUCHLXH.Qb")
	public YABPKWWG field1122;

	@ObfuscatedName("SJUCHLXH.Jb")
	public String field1116;

	@ObfuscatedName("SJUCHLXH.a(ILIMUIZRAF;)V")
	public final void method452(IMUIZRAF arg0) {
		arg0.field714 = 0;
		field1118 = arg0.method238();
		field1108 = arg0.method238();
		field1110 = null;
		field1104 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method238();
			if (var3 == 0) {
				field1102[var2] = 0;
			} else {
				int var4 = arg0.method238();
				field1102[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1102[0] == 0xFFFF) {
					field1110 = WHKCNEXD.method521(arg0.method240());
					break;
				}

				if (field1102[var2] >= 512 && field1102[var2] - 512 < SFKBIDFK.field988) {
					int var5 = SFKBIDFK.method438(field1102[var2] - 512).field989;
					if (var5 != 0) {
						field1104 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method238();
			if (var7 < 0 || var7 >= client.field174[var6].length) {
				var7 = 0;
			}

			field1124[var6] = var7;
		}

		field78 = arg0.method240();
		if (field78 == 0xFFFF) {
			field78 = -1;
		}

		field79 = arg0.method240();
		if (field79 == 0xFFFF) {
			field79 = -1;
		}

		field62 = arg0.method240();
		if (field62 == 0xFFFF) {
			field62 = -1;
		}

		field63 = arg0.method240();
		if (field63 == 0xFFFF) {
			field63 = -1;
		}

		field64 = arg0.method240();
		if (field64 == 0xFFFF) {
			field64 = -1;
		}

		field65 = arg0.method240();
		if (field65 == 0xFFFF) {
			field65 = -1;
		}

		field77 = arg0.method240();
		if (field77 == 0xFFFF) {
			field77 = -1;
		}

		field1116 = JYGZTITV.method322(JYGZTITV.method319(arg0.method244()));
		field1115 = arg0.method238();
		field1126 = arg0.method240();
		field1103 = true;
		field1123 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1123 <<= 4;
			if (field1102[var8] >= 256) {
				field1123 += field1102[var8] - 256;
			}
		}

		if (field1102[0] >= 256) {
			field1123 += field1102[0] - 256 >> 4;
		}

		if (field1102[1] >= 256) {
			field1123 += field1102[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1123 <<= 3;
			field1123 += field1124[var9];
		}

		field1123 <<= 1;
		field1123 += field1118;
	}

	@ObfuscatedName("SJUCHLXH.b(I)Z")
	public final boolean method21() {
		if (!field1103) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("SJUCHLXH.a(B)LYABPKWWG;")
	public final YABPKWWG method453() {
		if (!field1103) {
			return null;
		}

		if (field1110 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1102[var2];
				if (var3 >= 256 && var3 < 512 && !BDUNOHSG.field85[var3 - 256].method26()) {
					var1 = true;
				}

				if (var3 >= 512 && !SFKBIDFK.method438(var3 - 512).method437(field1118)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			YABPKWWG[] var4 = new YABPKWWG[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1102[var6];
				if (var7 >= 256 && var7 < 512) {
					YABPKWWG var8 = BDUNOHSG.field85[var7 - 256].method27();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					YABPKWWG var9 = SFKBIDFK.method438(var7 - 512).method435(field1118);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			YABPKWWG var10 = new YABPKWWG(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1124[var11] != 0) {
					var10.method562(client.field174[var11][0], client.field174[var11][field1124[var11]]);

					if (var11 == 1) {
						var10.method562(client.field416[0], client.field416[field1124[var11]]);
					}
				}
			}

			return var10;
		}

		return field1110.method522();
	}

	@ObfuscatedName("SJUCHLXH.a(Z)LYABPKWWG;")
	public final YABPKWWG method16() {
		if (!field1103) {
			return null;
		}

		YABPKWWG var1 = method454();
		if (var1 == null) {
			return null;
		}

		field47 = var1.field28;
		var1.field1416 = true;

		if (field1107) {
			return var1;
		}

		if (field70 != -1 && field71 != -1) {
			CIVOPMKV var2 = CIVOPMKV.field114[field70];
			YABPKWWG var3 = var2.method32();
			if (var3 != null) {
				YABPKWWG var4 = new YABPKWWG(var3, HQHBJEDA.method219(field71), true, false);
				var4.method561(0, 0, -field74);
				var4.method555();
				var4.method556(var2.field118.field1463[field71]);
				var4.field1415 = null;
				var4.field1414 = null;

				if (var2.field121 != 128 || var2.field122 != 128) {
					var4.method564(var2.field122, var2.field121, var2.field121);
				}

				var4.method565(var2.field124 + 64, var2.field125 + 850, -30, -50, -30, true);
				YABPKWWG[] var5 = new YABPKWWG[] { var1, var4 };
				var1 = new YABPKWWG(2, var5, true);
			}
		}

		if (field1122 != null) {
			if (client.field538 >= field1106) {
				field1122 = null;
			}

			if (client.field538 >= field1105 && client.field538 < field1106) {
				YABPKWWG var6 = field1122;
				var6.method561(field1121 - field42, field1119 - field41, field1120 - field1125);

				if (field83 == 512) {
					var6.method559();
					var6.method559();
					var6.method559();
				} else if (field83 == 1024) {
					var6.method559();
					var6.method559();
				} else if (field83 == 1536) {
					var6.method559();
				}

				YABPKWWG[] var7 = new YABPKWWG[] { var1, var6 };
				var1 = new YABPKWWG(2, var7, true);

				if (field83 == 512) {
					var6.method559();
				} else if (field83 == 1024) {
					var6.method559();
					var6.method559();
				} else if (field83 == 1536) {
					var6.method559();
					var6.method559();
					var6.method559();
				}

				var6.method561(field42 - field1121, field41 - field1119, field1125 - field1120);
			}
		}

		var1.field1416 = true;
		return var1;
	}

	@ObfuscatedName("SJUCHLXH.c(I)LYABPKWWG;")
	public final YABPKWWG method454() {
		if (field1110 != null) {
			int var1 = -1;
			if (field31 >= 0 && field34 == 0) {
				var1 = ZKWMIVTX.field1461[field31].field1463[field32];
			} else if (field57 >= 0) {
				var1 = ZKWMIVTX.field1461[field57].field1463[field58];
			}

			return field1110.method520(null, var1, -1);
		}

		long var3 = field1123;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field31 >= 0 && field34 == 0) {
			ZKWMIVTX var9 = ZKWMIVTX.field1461[field31];
			var5 = var9.field1463[field32];

			if (field57 >= 0 && field78 != field57) {
				var6 = ZKWMIVTX.field1461[field57].field1463[field58];
			}

			if (var9.field1470 >= 0) {
				var7 = var9.field1470;
				var3 += var7 - field1102[5] << 40;
			}

			if (var9.field1471 >= 0) {
				var8 = var9.field1471;
				var3 += var8 - field1102[3] << 48;
			}
		} else if (field57 >= 0) {
			var5 = ZKWMIVTX.field1461[field57].field1463[field58];
		}

		YABPKWWG var10 = (YABPKWWG) field1109.method525(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1102[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !BDUNOHSG.field85[var13 - 256].method24()) {
					var11 = true;
				}

				if (var13 >= 512 && !SFKBIDFK.method438(var13 - 512).method440(field1118)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1117 != -1L) {
					var10 = (YABPKWWG) field1109.method525(field1117);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			YABPKWWG[] var14 = new YABPKWWG[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1102[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					YABPKWWG var18 = BDUNOHSG.field85[var17 - 256].method25();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					YABPKWWG var19 = SFKBIDFK.method438(var17 - 512).method443(field1118);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new YABPKWWG(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1124[var20] != 0) {
					var10.method562(client.field174[var20][0], client.field174[var20][field1124[var20]]);

					if (var20 == 1) {
						var10.method562(client.field416[0], client.field416[field1124[var20]]);
					}
				}
			}

			var10.method555();
			var10.method565(64, 850, -30, -50, -30, true);
			field1109.method526(var3, var10);
			field1117 = var3;
		}

		if (field1107) {
			return var10;
		}

		YABPKWWG var21 = YABPKWWG.field1378;
		var21.method550(var10, HQHBJEDA.method219(var5) & HQHBJEDA.method219(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method557(ZKWMIVTX.field1461[field31].field1467, var6, var5);
		} else if (var5 != -1) {
			var21.method556(var5);
		}

		var21.method552();
		var21.field1415 = null;
		var21.field1414 = null;
		return var21;
	}
}
