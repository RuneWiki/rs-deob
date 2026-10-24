package deob;

@ObfuscatedName("ZQANNJZE")
public final class ZQANNJZE extends EGCNSKZO {

	@ObfuscatedName("ZQANNJZE.sb")
	public boolean field1446 = false;

	@ObfuscatedName("ZQANNJZE.zb")
	public boolean field1452 = false;

	@ObfuscatedName("ZQANNJZE.Db")
	public int[] field1456 = new int[5];

	@ObfuscatedName("ZQANNJZE.Eb")
	public int field1457 = -1;

	@ObfuscatedName("ZQANNJZE.Kb")
	public int[] field1462 = new int[12];

	@ObfuscatedName("ZQANNJZE.Mb")
	public int field1464 = -1;

	@ObfuscatedName("ZQANNJZE.Sb")
	public long field1470 = -1L;

	@ObfuscatedName("ZQANNJZE.Gb")
	public static ZYLCKQCD field1459 = new ZYLCKQCD(260);

	@ObfuscatedName("ZQANNJZE.tb")
	public int field1447;

	@ObfuscatedName("ZQANNJZE.ub")
	public int field1448;

	@ObfuscatedName("ZQANNJZE.vb")
	public int field1449;

	@ObfuscatedName("ZQANNJZE.wb")
	public int field1450;

	@ObfuscatedName("ZQANNJZE.Bb")
	public int field1454;

	@ObfuscatedName("ZQANNJZE.Cb")
	public int field1455;

	@ObfuscatedName("ZQANNJZE.Hb")
	public int field1460;

	@ObfuscatedName("ZQANNJZE.Jb")
	public int field1461;

	@ObfuscatedName("ZQANNJZE.Nb")
	public int field1465;

	@ObfuscatedName("ZQANNJZE.Ob")
	public int field1466;

	@ObfuscatedName("ZQANNJZE.Pb")
	public int field1467;

	@ObfuscatedName("ZQANNJZE.Qb")
	public int field1468;

	@ObfuscatedName("ZQANNJZE.Rb")
	public int field1469;

	@ObfuscatedName("ZQANNJZE.Ub")
	public int field1471;

	@ObfuscatedName("ZQANNJZE.Fb")
	public long field1458;

	@ObfuscatedName("ZQANNJZE.xb")
	public POJFANDE field1451;

	@ObfuscatedName("ZQANNJZE.Ab")
	public WZSDIPBR field1453;

	@ObfuscatedName("ZQANNJZE.Lb")
	public String field1463;

	@ObfuscatedName("ZQANNJZE.a(ILPGNBHFUF;)V")
	public final void method594(PGNBHFUF arg0) {
		arg0.field1082 = 0;
		field1447 = arg0.method420();
		field1464 = arg0.method421();
		field1457 = arg0.method421();
		field1453 = null;
		field1465 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method420();
			if (var3 == 0) {
				field1462[var2] = 0;
			} else {
				int var4 = arg0.method420();
				field1462[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1462[0] == 0xFFFF) {
					field1453 = WZSDIPBR.method525(arg0.method422());
					break;
				}

				if (field1462[var2] >= 512 && field1462[var2] - 512 < IBYWZZZK.field760) {
					int var5 = IBYWZZZK.method290(field1462[var2] - 512).field761;
					if (var5 != 0) {
						field1465 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method420();
			if (var7 < 0 || var7 >= client.field327[var6].length) {
				var7 = 0;
			}

			field1456[var6] = var7;
		}

		field656 = arg0.method422();
		if (field656 == 0xFFFF) {
			field656 = -1;
		}

		field657 = arg0.method422();
		if (field657 == 0xFFFF) {
			field657 = -1;
		}

		field636 = arg0.method422();
		if (field636 == 0xFFFF) {
			field636 = -1;
		}

		field637 = arg0.method422();
		if (field637 == 0xFFFF) {
			field637 = -1;
		}

		field638 = arg0.method422();
		if (field638 == 0xFFFF) {
			field638 = -1;
		}

		field639 = arg0.method422();
		if (field639 == 0xFFFF) {
			field639 = -1;
		}

		field651 = arg0.method422();
		if (field651 == 0xFFFF) {
			field651 = -1;
		}

		field1463 = ZMJDGKKV.method592(ZMJDGKKV.method589(arg0.method426()));
		field1461 = arg0.method420();
		field1460 = arg0.method422();
		field1452 = true;
		field1458 = 0L;
		int var8 = field1462[5];
		int var9 = field1462[9];
		field1462[5] = var9;
		field1462[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1458 <<= 4;
			if (field1462[var10] >= 256) {
				field1458 += field1462[var10] - 256;
			}
		}

		if (field1462[0] >= 256) {
			field1458 += field1462[0] - 256 >> 4;
		}

		if (field1462[1] >= 256) {
			field1458 += field1462[1] - 256 >> 8;
		}

		field1462[5] = var8;
		field1462[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1458 <<= 3;
			field1458 += field1456[var11];
		}

		field1458 <<= 1;
		field1458 += field1447;
	}

	@ObfuscatedName("ZQANNJZE.c(Z)LPOJFANDE;")
	public final POJFANDE method595() {
		if (field1453 != null) {
			int var1 = -1;
			if (field645 >= 0 && field648 == 0) {
				var1 = KIZBPSHZ.field888[field645].field890[field646];
			} else if (field615 >= 0) {
				var1 = KIZBPSHZ.field888[field615].field890[field616];
			}

			return field1453.method527(null, var1, -1);
		}

		long var3 = field1458;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field645 >= 0 && field648 == 0) {
			KIZBPSHZ var9 = KIZBPSHZ.field888[field645];
			var5 = var9.field890[field646];

			if (field615 >= 0 && field656 != field615) {
				var6 = KIZBPSHZ.field888[field615].field890[field616];
			}

			if (var9.field897 >= 0) {
				var7 = var9.field897;
				var3 += var7 - field1462[5] << 40;
			}

			if (var9.field898 >= 0) {
				var8 = var9.field898;
				var3 += var8 - field1462[3] << 48;
			}
		} else if (field615 >= 0) {
			var5 = KIZBPSHZ.field888[field615].field890[field616];
		}

		POJFANDE var10 = (POJFANDE) field1459.method599(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1462[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !IEVJZYTE.field792[var13 - 256].method303()) {
					var11 = true;
				}

				if (var13 >= 512 && !IBYWZZZK.method290(var13 - 512).method289(field1447)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1470 != -1L) {
					var10 = (POJFANDE) field1459.method599(field1470);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			POJFANDE[] var14 = new POJFANDE[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1462[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					POJFANDE var18 = IEVJZYTE.field792[var17 - 256].method304();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					POJFANDE var19 = IBYWZZZK.method290(var17 - 512).method292(field1447);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new POJFANDE(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1456[var20] != 0) {
					var10.method474(client.field327[var20][0], client.field327[var20][field1456[var20]]);

					if (var20 == 1) {
						var10.method474(client.field459[0], client.field459[field1456[var20]]);
					}
				}
			}

			var10.method467();
			var10.method477(64, 850, -30, -50, -30, true);
			field1459.method600(var10, var3);
			field1470 = var3;
		}

		if (field1446) {
			return var10;
		}

		POJFANDE var21 = POJFANDE.field1095;
		var21.method462(var10, HVIFHYEW.method287(var5) & HVIFHYEW.method287(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method469(KIZBPSHZ.field888[field645].field894, var5, var6);
		} else if (var5 != -1) {
			var21.method468(var5);
		}

		var21.method464();
		var21.field1131 = null;
		var21.field1130 = null;
		return var21;
	}

	@ObfuscatedName("ZQANNJZE.a(Z)LPOJFANDE;")
	public final POJFANDE method54() {
		if (!field1452) {
			return null;
		}

		POJFANDE var1 = method595();
		if (var1 == null) {
			return null;
		}

		field640 = var1.field1277;
		var1.field1132 = true;

		if (field1446) {
			return var1;
		}

		if (field622 != -1 && field623 != -1) {
			BUIWQSXJ var2 = BUIWQSXJ.field30[field622];
			POJFANDE var3 = var2.method62();
			if (var3 != null) {
				POJFANDE var4 = new POJFANDE(HVIFHYEW.method287(field623), true, false, var3);
				var4.method473(-field626, 0, 0);
				var4.method467();
				var4.method468(var2.field34.field890[field623]);
				var4.field1131 = null;
				var4.field1130 = null;

				if (var2.field37 != 128 || var2.field38 != 128) {
					var4.method476(var2.field38, var2.field37, var2.field37);
				}

				var4.method477(var2.field40 + 64, var2.field41 + 850, -30, -50, -30, true);
				POJFANDE[] var5 = new POJFANDE[] { var1, var4 };
				var1 = new POJFANDE(true, var5, 2);
			}
		}

		if (field1451 != null) {
			if (client.field456 >= field1455) {
				field1451 = null;
			}

			if (client.field456 >= field1454 && client.field456 < field1455) {
				POJFANDE var6 = field1451;
				var6.method473(field1449 - field1471, field1448 - field628, field1450 - field629);

				if (field632 == 512) {
					var6.method471();
					var6.method471();
					var6.method471();
				} else if (field632 == 1024) {
					var6.method471();
					var6.method471();
				} else if (field632 == 1536) {
					var6.method471();
				}

				POJFANDE[] var7 = new POJFANDE[] { var1, var6 };
				var1 = new POJFANDE(true, var7, 2);

				if (field632 == 512) {
					var6.method471();
				} else if (field632 == 1024) {
					var6.method471();
					var6.method471();
				} else if (field632 == 1536) {
					var6.method471();
					var6.method471();
					var6.method471();
				}

				var6.method473(field1471 - field1449, field628 - field1448, field629 - field1450);
			}
		}

		var1.field1132 = true;
		return var1;
	}

	@ObfuscatedName("ZQANNJZE.a(I)LPOJFANDE;")
	public final POJFANDE method596() {
		if (!field1452) {
			return null;
		}

		if (field1453 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1462[var2];
				if (var3 >= 256 && var3 < 512 && !IEVJZYTE.field792[var3 - 256].method305()) {
					var1 = true;
				}

				if (var3 >= 512 && !IBYWZZZK.method290(var3 - 512).method296(field1447)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			POJFANDE[] var4 = new POJFANDE[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1462[var6];
				if (var7 >= 256 && var7 < 512) {
					POJFANDE var8 = IEVJZYTE.field792[var7 - 256].method306();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					POJFANDE var9 = IBYWZZZK.method290(var7 - 512).method300(field1447);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			POJFANDE var10 = new POJFANDE(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1456[var11] != 0) {
					var10.method474(client.field327[var11][0], client.field327[var11][field1456[var11]]);

					if (var11 == 1) {
						var10.method474(client.field459[0], client.field459[field1456[var11]]);
					}
				}
			}

			return var10;
		}

		return field1453.method528();
	}

	@ObfuscatedName("ZQANNJZE.a(B)Z")
	public final boolean method263() {
		if (!field1452) {
			return false;
		}

		return true;
	}
}
