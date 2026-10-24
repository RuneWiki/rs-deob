package deob;

@ObfuscatedName("CHKMTWJC")
public final class CHKMTWJC extends NXRPKSXU {

	@ObfuscatedName("CHKMTWJC.tb")
	public int field84 = -1;

	@ObfuscatedName("CHKMTWJC.vb")
	public int field86 = -1;

	@ObfuscatedName("CHKMTWJC.wb")
	public boolean field87 = false;

	@ObfuscatedName("CHKMTWJC.xb")
	public int[] field88 = new int[12];

	@ObfuscatedName("CHKMTWJC.Ab")
	public long field90 = -1L;

	@ObfuscatedName("CHKMTWJC.Bb")
	public int[] field91 = new int[5];

	@ObfuscatedName("CHKMTWJC.Cb")
	public boolean field92 = false;

	@ObfuscatedName("CHKMTWJC.sb")
	public static UECXVCCS field83 = new UECXVCCS(260);

	@ObfuscatedName("CHKMTWJC.Nb")
	public int field101;

	@ObfuscatedName("CHKMTWJC.Ob")
	public int field102;

	@ObfuscatedName("CHKMTWJC.Pb")
	public int field103;

	@ObfuscatedName("CHKMTWJC.Qb")
	public int field104;

	@ObfuscatedName("CHKMTWJC.Rb")
	public int field105;

	@ObfuscatedName("CHKMTWJC.Sb")
	public int field106;

	@ObfuscatedName("CHKMTWJC.Tb")
	public int field107;

	@ObfuscatedName("CHKMTWJC.ub")
	public int field85;

	@ObfuscatedName("CHKMTWJC.zb")
	public int field89;

	@ObfuscatedName("CHKMTWJC.Eb")
	public int field94;

	@ObfuscatedName("CHKMTWJC.Fb")
	public int field95;

	@ObfuscatedName("CHKMTWJC.Gb")
	public int field96;

	@ObfuscatedName("CHKMTWJC.Hb")
	public int field97;

	@ObfuscatedName("CHKMTWJC.Ib")
	public int field98;

	@ObfuscatedName("CHKMTWJC.Mb")
	public long field100;

	@ObfuscatedName("CHKMTWJC.Ub")
	public CADBNSXE field108;

	@ObfuscatedName("CHKMTWJC.Db")
	public VWKJSKWX field93;

	@ObfuscatedName("CHKMTWJC.Lb")
	public String field99;

	@ObfuscatedName("CHKMTWJC.a(Z)Z")
	public final boolean method38() {
		if (!field87) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("CHKMTWJC.c(I)LCADBNSXE;")
	public final CADBNSXE method39() {
		if (!field87) {
			return null;
		}

		if (field93 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field88[var2];
				if (var3 >= 256 && var3 < 512 && !NQIAMATB.field981[var3 - 256].method340()) {
					var1 = true;
				}

				if (var3 >= 512 && !PICYKCUA.method418(var3 - 512).method415(field102)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			CADBNSXE[] var4 = new CADBNSXE[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field88[var6];
				if (var7 >= 256 && var7 < 512) {
					CADBNSXE var8 = NQIAMATB.field981[var7 - 256].method341();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					CADBNSXE var9 = PICYKCUA.method418(var7 - 512).method410(field102);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			CADBNSXE var10 = new CADBNSXE(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field91[var11] != 0) {
					var10.method25(client.field292[var11][0], client.field292[var11][field91[var11]]);

					if (var11 == 1) {
						var10.method25(client.field384[0], client.field384[field91[var11]]);
					}
				}
			}

			return var10;
		}

		return field93.method575();
	}

	@ObfuscatedName("CHKMTWJC.a(I)LCADBNSXE;")
	public final CADBNSXE method40() {
		if (!field87) {
			return null;
		}

		CADBNSXE var1 = method41();
		if (var1 == null) {
			return null;
		}

		field1049 = var1.field852;
		var1.field49 = true;

		if (field92) {
			return var1;
		}

		if (field996 != -1 && field997 != -1) {
			XWNROHZR var2 = XWNROHZR.field1439[field996];
			CADBNSXE var3 = var2.method589();
			if (var3 != null) {
				CADBNSXE var4 = new CADBNSXE(false, DFGNFGZH.method215(field997), var3, true);
				var4.method24(-field1000, 0, 0);
				var4.method18();
				var4.method19(var2.field1443.field1359[field997]);
				var4.field48 = null;
				var4.field47 = null;

				if (var2.field1446 != 128 || var2.field1447 != 128) {
					var4.method27(var2.field1446, var2.field1447, var2.field1446);
				}

				var4.method28(var2.field1449 + 64, var2.field1450 + 850, -30, -50, -30, true);
				CADBNSXE[] var5 = new CADBNSXE[] { var1, var4 };
				var1 = new CADBNSXE(true, var5, 2);
			}
		}

		if (field108 != null) {
			if (client.field449 >= field104) {
				field108 = null;
			}

			if (client.field449 >= field103 && client.field449 < field104) {
				CADBNSXE var6 = field108;
				var6.method24(field106 - field85, field107 - field1015, field105 - field1014);

				if (field1020 == 512) {
					var6.method22();
					var6.method22();
					var6.method22();
				} else if (field1020 == 1024) {
					var6.method22();
					var6.method22();
				} else if (field1020 == 1536) {
					var6.method22();
				}

				CADBNSXE[] var7 = new CADBNSXE[] { var1, var6 };
				var1 = new CADBNSXE(true, var7, 2);

				if (field1020 == 512) {
					var6.method22();
				} else if (field1020 == 1024) {
					var6.method22();
					var6.method22();
				} else if (field1020 == 1536) {
					var6.method22();
					var6.method22();
					var6.method22();
				}

				var6.method24(field85 - field106, field1015 - field107, field1014 - field105);
			}
		}

		var1.field49 = true;
		return var1;
	}

	@ObfuscatedName("CHKMTWJC.b(Z)LCADBNSXE;")
	public final CADBNSXE method41() {
		if (field93 != null) {
			int var1 = -1;
			if (field1044 >= 0 && field1047 == 0) {
				var1 = UVDKTGZK.field1357[field1044].field1359[field1045];
			} else if (field1017 >= 0) {
				var1 = UVDKTGZK.field1357[field1017].field1359[field1018];
			}

			return field93.method572(-1, var1, null);
		}

		long var3 = field100;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1044 >= 0 && field1047 == 0) {
			UVDKTGZK var9 = UVDKTGZK.field1357[field1044];
			var5 = var9.field1359[field1045];

			if (field1017 >= 0 && field1017 != field1011) {
				var6 = UVDKTGZK.field1357[field1017].field1359[field1018];
			}

			if (var9.field1366 >= 0) {
				var7 = var9.field1366;
				var3 += var7 - field88[5] << 40;
			}

			if (var9.field1367 >= 0) {
				var8 = var9.field1367;
				var3 += var8 - field88[3] << 48;
			}
		} else if (field1017 >= 0) {
			var5 = UVDKTGZK.field1357[field1017].field1359[field1018];
		}

		CADBNSXE var10 = (CADBNSXE) field83.method538(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field88[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !NQIAMATB.field981[var13 - 256].method338()) {
					var11 = true;
				}

				if (var13 >= 512 && !PICYKCUA.method418(var13 - 512).method409(field102)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field90 != -1L) {
					var10 = (CADBNSXE) field83.method538(field90);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			CADBNSXE[] var14 = new CADBNSXE[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field88[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					CADBNSXE var18 = NQIAMATB.field981[var17 - 256].method339();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					CADBNSXE var19 = PICYKCUA.method418(var17 - 512).method411(field102);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new CADBNSXE(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field91[var20] != 0) {
					var10.method25(client.field292[var20][0], client.field292[var20][field91[var20]]);

					if (var20 == 1) {
						var10.method25(client.field384[0], client.field384[field91[var20]]);
					}
				}
			}

			var10.method18();
			var10.method28(64, 850, -30, -50, -30, true);
			field83.method539(var10, var3);
			field90 = var3;
		}

		if (field92) {
			return var10;
		}

		CADBNSXE var21 = CADBNSXE.field12;
		var21.method13(var10, DFGNFGZH.method215(var5) & DFGNFGZH.method215(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method20(var5, var6, UVDKTGZK.field1357[field1044].field1363);
		} else if (var5 != -1) {
			var21.method19(var5);
		}

		var21.method15();
		var21.field48 = null;
		var21.field47 = null;
		return var21;
	}

	@ObfuscatedName("CHKMTWJC.a(BLMLYYHULT;)V")
	public final void method42(MLYYHULT arg0) {
		arg0.field963 = 0;
		field102 = arg0.method296();
		field86 = arg0.method297();
		field84 = arg0.method297();
		field93 = null;
		field98 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method296();
			if (var3 == 0) {
				field88[var2] = 0;
			} else {
				int var4 = arg0.method296();
				field88[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field88[0] == 0xFFFF) {
					field93 = VWKJSKWX.method574(arg0.method298());
					break;
				}

				if (field88[var2] >= 512 && field88[var2] - 512 < PICYKCUA.field1097) {
					int var5 = PICYKCUA.method418(field88[var2] - 512).field1091;
					if (var5 != 0) {
						field98 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method296();
			if (var7 < 0 || var7 >= client.field292[var6].length) {
				var7 = 0;
			}

			field91[var6] = var7;
		}

		field1011 = arg0.method298();
		if (field1011 == 0xFFFF) {
			field1011 = -1;
		}

		field1012 = arg0.method298();
		if (field1012 == 0xFFFF) {
			field1012 = -1;
		}

		field1021 = arg0.method298();
		if (field1021 == 0xFFFF) {
			field1021 = -1;
		}

		field1022 = arg0.method298();
		if (field1022 == 0xFFFF) {
			field1022 = -1;
		}

		field1023 = arg0.method298();
		if (field1023 == 0xFFFF) {
			field1023 = -1;
		}

		field1024 = arg0.method298();
		if (field1024 == 0xFFFF) {
			field1024 = -1;
		}

		field1043 = arg0.method298();
		if (field1043 == 0xFFFF) {
			field1043 = -1;
		}

		field99 = XBRLLWQI.method585(XBRLLWQI.method582(arg0.method302()));
		field101 = arg0.method296();
		field89 = arg0.method298();
		field87 = true;
		field100 = 0L;
		int var8 = field88[5];
		int var9 = field88[9];
		field88[5] = var9;
		field88[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field100 <<= 4;
			if (field88[var10] >= 256) {
				field100 += field88[var10] - 256;
			}
		}

		if (field88[0] >= 256) {
			field100 += field88[0] - 256 >> 4;
		}

		if (field88[1] >= 256) {
			field100 += field88[1] - 256 >> 8;
		}

		field88[5] = var8;
		field88[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field100 <<= 3;
			field100 += field91[var11];
		}

		field100 <<= 1;
		field100 += field102;
	}
}
