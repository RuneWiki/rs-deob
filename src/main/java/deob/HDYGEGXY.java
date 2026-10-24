package deob;

@ObfuscatedName("HDYGEGXY")
public final class HDYGEGXY extends XETERYIW {

	@ObfuscatedName("HDYGEGXY.rb")
	public int[] field714 = new int[5];

	@ObfuscatedName("HDYGEGXY.tb")
	public boolean field716 = false;

	@ObfuscatedName("HDYGEGXY.vb")
	public int field718 = -1;

	@ObfuscatedName("HDYGEGXY.Bb")
	public int[] field723 = new int[12];

	@ObfuscatedName("HDYGEGXY.Nb")
	public int field732 = -1;

	@ObfuscatedName("HDYGEGXY.Ob")
	public boolean field733 = false;

	@ObfuscatedName("HDYGEGXY.Ub")
	public long field739 = -1L;

	@ObfuscatedName("HDYGEGXY.xb")
	public static ZPNSJLZE field719 = new ZPNSJLZE(260);

	@ObfuscatedName("HDYGEGXY.sb")
	public int field715;

	@ObfuscatedName("HDYGEGXY.ub")
	public int field717;

	@ObfuscatedName("HDYGEGXY.yb")
	public int field720;

	@ObfuscatedName("HDYGEGXY.zb")
	public int field721;

	@ObfuscatedName("HDYGEGXY.Eb")
	public int field725;

	@ObfuscatedName("HDYGEGXY.Gb")
	public int field726;

	@ObfuscatedName("HDYGEGXY.Hb")
	public int field727;

	@ObfuscatedName("HDYGEGXY.Ib")
	public int field728;

	@ObfuscatedName("HDYGEGXY.Jb")
	public int field729;

	@ObfuscatedName("HDYGEGXY.Mb")
	public int field731;

	@ObfuscatedName("HDYGEGXY.Qb")
	public int field735;

	@ObfuscatedName("HDYGEGXY.Rb")
	public int field736;

	@ObfuscatedName("HDYGEGXY.Sb")
	public int field737;

	@ObfuscatedName("HDYGEGXY.Tb")
	public int field738;

	@ObfuscatedName("HDYGEGXY.Cb")
	public long field724;

	@ObfuscatedName("HDYGEGXY.Kb")
	public CSGBDGDY field730;

	@ObfuscatedName("HDYGEGXY.Ab")
	public GALAVQEJ field722;

	@ObfuscatedName("HDYGEGXY.Pb")
	public String field734;

	@ObfuscatedName("HDYGEGXY.c(I)LCSGBDGDY;")
	public final CSGBDGDY method249() {
		if (field722 != null) {
			int var1 = -1;
			if (field1391 >= 0 && field1394 == 0) {
				var1 = PNPNYEVW.field1058[field1391].field1060[field1392];
			} else if (field1356 >= 0) {
				var1 = PNPNYEVW.field1058[field1356].field1060[field1357];
			}

			return field722.method205(var1, null, -1);
		}

		long var3 = field724;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1391 >= 0 && field1394 == 0) {
			PNPNYEVW var9 = PNPNYEVW.field1058[field1391];
			var5 = var9.field1060[field1392];

			if (field1356 >= 0 && field1403 != field1356) {
				var6 = PNPNYEVW.field1058[field1356].field1060[field1357];
			}

			if (var9.field1067 >= 0) {
				var7 = var9.field1067;
				var3 += var7 - field723[5] << 40;
			}

			if (var9.field1068 >= 0) {
				var8 = var9.field1068;
				var3 += var8 - field723[3] << 48;
			}
		} else if (field1356 >= 0) {
			var5 = PNPNYEVW.field1058[field1356].field1060[field1357];
		}

		CSGBDGDY var10 = (CSGBDGDY) field719.method586(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field723[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !RPRWOACX.field1172[var13 - 256].method433()) {
					var11 = true;
				}

				if (var13 >= 512 && !HVTLSJTR.method254(var13 - 512).method261(field717)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field739 != -1L) {
					var10 = (CSGBDGDY) field719.method586(field739);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			CSGBDGDY[] var14 = new CSGBDGDY[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field723[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					CSGBDGDY var18 = RPRWOACX.field1172[var17 - 256].method434();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					CSGBDGDY var19 = HVTLSJTR.method254(var17 - 512).method262(field717);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new CSGBDGDY(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field714[var20] != 0) {
					var10.method174(client.field154[var20][0], client.field154[var20][field714[var20]]);

					if (var20 == 1) {
						var10.method174(client.field277[0], client.field277[field714[var20]]);
					}
				}
			}

			var10.method167();
			var10.method177(64, 850, -30, -50, -30, true);
			field719.method587(var10, var3);
			field739 = var3;
		}

		if (field716) {
			return var10;
		}

		CSGBDGDY var21 = CSGBDGDY.field498;
		var21.method162(var10, KDJQGGIG.method285(var5) & KDJQGGIG.method285(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method169(var5, PNPNYEVW.field1058[field1391].field1064, var6);
		} else if (var5 != -1) {
			var21.method168(var5);
		}

		var21.method164();
		var21.field535 = null;
		var21.field534 = null;
		return var21;
	}

	@ObfuscatedName("HDYGEGXY.a(I)Z")
	public final boolean method250() {
		if (!field733) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("HDYGEGXY.a(Z)LCSGBDGDY;")
	public final CSGBDGDY method187() {
		if (!field733) {
			return null;
		}

		CSGBDGDY var1 = method249();
		if (var1 == null) {
			return null;
		}

		field1409 = var1.field1474;
		var1.field536 = true;

		if (field716) {
			return var1;
		}

		if (field1359 != -1 && field1360 != -1) {
			FXNZCBPL var2 = FXNZCBPL.field620[field1359];
			CSGBDGDY var3 = var2.method202();
			if (var3 != null) {
				CSGBDGDY var4 = new CSGBDGDY(true, KDJQGGIG.method285(field1360), var3, false);
				var4.method173(-field1363, 0, 0);
				var4.method167();
				var4.method168(var2.field624.field1060[field1360]);
				var4.field535 = null;
				var4.field534 = null;

				if (var2.field627 != 128 || var2.field628 != 128) {
					var4.method176(var2.field627, var2.field628, var2.field627);
				}

				var4.method177(var2.field630 + 64, var2.field631 + 850, -30, -50, -30, true);
				CSGBDGDY[] var5 = new CSGBDGDY[] { var1, var4 };
				var1 = new CSGBDGDY(2, var5, true);
			}
		}

		if (field730 != null) {
			if (client.field453 >= field721) {
				field730 = null;
			}

			if (client.field453 >= field720 && client.field453 < field721) {
				CSGBDGDY var6 = field730;
				var6.method173(field728 - field726, field727 - field1405, field729 - field1406);

				if (field1385 == 512) {
					var6.method171();
					var6.method171();
					var6.method171();
				} else if (field1385 == 1024) {
					var6.method171();
					var6.method171();
				} else if (field1385 == 1536) {
					var6.method171();
				}

				CSGBDGDY[] var7 = new CSGBDGDY[] { var1, var6 };
				var1 = new CSGBDGDY(2, var7, true);

				if (field1385 == 512) {
					var6.method171();
				} else if (field1385 == 1024) {
					var6.method171();
					var6.method171();
				} else if (field1385 == 1536) {
					var6.method171();
					var6.method171();
					var6.method171();
				}

				var6.method173(field726 - field728, field1405 - field727, field1406 - field729);
			}
		}

		var1.field536 = true;
		return var1;
	}

	@ObfuscatedName("HDYGEGXY.d(I)LCSGBDGDY;")
	public final CSGBDGDY method251() {
		if (!field733) {
			return null;
		}

		if (field722 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field723[var2];
				if (var3 >= 256 && var3 < 512 && !RPRWOACX.field1172[var3 - 256].method435()) {
					var1 = true;
				}

				if (var3 >= 512 && !HVTLSJTR.method254(var3 - 512).method259(field717)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			CSGBDGDY[] var4 = new CSGBDGDY[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field723[var6];
				if (var7 >= 256 && var7 < 512) {
					CSGBDGDY var8 = RPRWOACX.field1172[var7 - 256].method436();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					CSGBDGDY var9 = HVTLSJTR.method254(var7 - 512).method260(field717);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			CSGBDGDY var10 = new CSGBDGDY(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field714[var11] != 0) {
					var10.method174(client.field154[var11][0], client.field154[var11][field714[var11]]);

					if (var11 == 1) {
						var10.method174(client.field277[0], client.field277[field714[var11]]);
					}
				}
			}

			return var10;
		}

		return field722.method204();
	}

	@ObfuscatedName("HDYGEGXY.a(LNHEPCMLW;Z)V")
	public final void method252(NHEPCMLW arg0) {
		arg0.field965 = 0;
		field717 = arg0.method349();
		field732 = arg0.method350();
		field718 = arg0.method350();
		field722 = null;
		field731 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method349();
			if (var3 == 0) {
				field723[var2] = 0;
			} else {
				int var4 = arg0.method349();
				field723[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field723[0] == 0xFFFF) {
					field722 = GALAVQEJ.method203(arg0.method351());
					break;
				}

				if (field723[var2] >= 512 && field723[var2] - 512 < HVTLSJTR.field774) {
					int var5 = HVTLSJTR.method254(field723[var2] - 512).field781;
					if (var5 != 0) {
						field731 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method349();
			if (var7 < 0 || var7 >= client.field154[var6].length) {
				var7 = 0;
			}

			field714[var6] = var7;
		}

		field1403 = arg0.method351();
		if (field1403 == 0xFFFF) {
			field1403 = -1;
		}

		field1404 = arg0.method351();
		if (field1404 == 0xFFFF) {
			field1404 = -1;
		}

		field1399 = arg0.method351();
		if (field1399 == 0xFFFF) {
			field1399 = -1;
		}

		field1400 = arg0.method351();
		if (field1400 == 0xFFFF) {
			field1400 = -1;
		}

		field1401 = arg0.method351();
		if (field1401 == 0xFFFF) {
			field1401 = -1;
		}

		field1402 = arg0.method351();
		if (field1402 == 0xFFFF) {
			field1402 = -1;
		}

		field1386 = arg0.method351();
		if (field1386 == 0xFFFF) {
			field1386 = -1;
		}

		field734 = UJPWWGLO.method508(UJPWWGLO.method505(arg0.method355()));
		field725 = arg0.method349();
		field715 = arg0.method351();
		field733 = true;
		field724 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field724 <<= 4;
			if (field723[var8] >= 256) {
				field724 += field723[var8] - 256;
			}
		}

		if (field723[0] >= 256) {
			field724 += field723[0] - 256 >> 4;
		}

		if (field723[1] >= 256) {
			field724 += field723[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field724 <<= 3;
			field724 += field714[var9];
		}

		field724 <<= 1;
		field724 += field717;
	}
}
