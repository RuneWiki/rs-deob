package deob;

@ObfuscatedName("DEHYKQII")
public final class DEHYKQII extends JFHWDRLM {

	@ObfuscatedName("DEHYKQII.sb")
	public int[] field530 = new int[5];

	@ObfuscatedName("DEHYKQII.ub")
	public int[] field532 = new int[12];

	@ObfuscatedName("DEHYKQII.zb")
	public boolean field536 = false;

	@ObfuscatedName("DEHYKQII.Cb")
	public boolean field539 = false;

	@ObfuscatedName("DEHYKQII.Pb")
	public int field551 = -1;

	@ObfuscatedName("DEHYKQII.Qb")
	public long field552 = -1L;

	@ObfuscatedName("DEHYKQII.Rb")
	public int field553 = -1;

	@ObfuscatedName("DEHYKQII.Bb")
	public static JGECYJMS field538 = new JGECYJMS(260);

	@ObfuscatedName("DEHYKQII.pb")
	public int field528;

	@ObfuscatedName("DEHYKQII.rb")
	public int field529;

	@ObfuscatedName("DEHYKQII.tb")
	public int field531;

	@ObfuscatedName("DEHYKQII.wb")
	public int field533;

	@ObfuscatedName("DEHYKQII.xb")
	public int field534;

	@ObfuscatedName("DEHYKQII.yb")
	public int field535;

	@ObfuscatedName("DEHYKQII.Db")
	public int field540;

	@ObfuscatedName("DEHYKQII.Gb")
	public int field542;

	@ObfuscatedName("DEHYKQII.Hb")
	public int field543;

	@ObfuscatedName("DEHYKQII.Ib")
	public int field544;

	@ObfuscatedName("DEHYKQII.Kb")
	public int field546;

	@ObfuscatedName("DEHYKQII.Lb")
	public int field547;

	@ObfuscatedName("DEHYKQII.Mb")
	public int field548;

	@ObfuscatedName("DEHYKQII.Nb")
	public int field549;

	@ObfuscatedName("DEHYKQII.Ab")
	public long field537;

	@ObfuscatedName("DEHYKQII.Jb")
	public KDWDYCIL field545;

	@ObfuscatedName("DEHYKQII.Ob")
	public YANZSPIT field550;

	@ObfuscatedName("DEHYKQII.Eb")
	public String field541;

	@ObfuscatedName("DEHYKQII.c(I)LKDWDYCIL;")
	public final KDWDYCIL method184() {
		if (!field539) {
			return null;
		}

		if (field550 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field532[var2];
				if (var3 >= 256 && var3 < 512 && !DOOZRHTX.field555[var3 - 256].method193()) {
					var1 = true;
				}

				if (var3 >= 512 && !YDSJAZFL.method575(var3 - 512).method569(field531)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			KDWDYCIL[] var4 = new KDWDYCIL[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field532[var6];
				if (var7 >= 256 && var7 < 512) {
					KDWDYCIL var8 = DOOZRHTX.field555[var7 - 256].method194();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					KDWDYCIL var9 = YDSJAZFL.method575(var7 - 512).method576(field531);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			KDWDYCIL var10 = new KDWDYCIL(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field530[var11] != 0) {
					var10.method260(client.field242[var11][0], client.field242[var11][field530[var11]]);

					if (var11 == 1) {
						var10.method260(client.field499[0], client.field499[field530[var11]]);
					}
				}
			}

			return var10;
		}

		return field550.method564();
	}

	@ObfuscatedName("DEHYKQII.a(I)LKDWDYCIL;")
	public final KDWDYCIL method185() {
		if (!field539) {
			return null;
		}

		KDWDYCIL var1 = method186();
		if (var1 == null) {
			return null;
		}

		field695 = var1.field666;
		var1.field798 = true;

		if (field536) {
			return var1;
		}

		if (field722 != -1 && field723 != -1) {
			QUXKFXEA var2 = QUXKFXEA.field1148[field722];
			KDWDYCIL var3 = var2.method413();
			if (var3 != null) {
				KDWDYCIL var4 = new KDWDYCIL(false, var3, SGSYCWFB.method423(field723), true);
				var4.method259(0, -field726, 0);
				var4.method253();
				var4.method254(var2.field1152.field869[field723]);
				var4.field797 = null;
				var4.field796 = null;

				if (var2.field1155 != 128 || var2.field1156 != 128) {
					var4.method262(var2.field1155, var2.field1155, var2.field1156);
				}

				var4.method263(var2.field1158 + 64, var2.field1159 + 850, -30, -50, -30, true);
				KDWDYCIL[] var5 = new KDWDYCIL[] { var1, var4 };
				var1 = new KDWDYCIL(var5, 2, true);
			}
		}

		if (field545 != null) {
			if (client.field258 >= field535) {
				field545 = null;
			}

			if (client.field258 >= field534 && client.field258 < field535) {
				KDWDYCIL var6 = field545;
				var6.method259(field542 - field734, field543 - field540, field544 - field735);

				if (field685 == 512) {
					var6.method257();
					var6.method257();
					var6.method257();
				} else if (field685 == 1024) {
					var6.method257();
					var6.method257();
				} else if (field685 == 1536) {
					var6.method257();
				}

				KDWDYCIL[] var7 = new KDWDYCIL[] { var1, var6 };
				var1 = new KDWDYCIL(var7, 2, true);

				if (field685 == 512) {
					var6.method257();
				} else if (field685 == 1024) {
					var6.method257();
					var6.method257();
				} else if (field685 == 1536) {
					var6.method257();
					var6.method257();
					var6.method257();
				}

				var6.method259(field734 - field542, field540 - field543, field735 - field544);
			}
		}

		var1.field798 = true;
		return var1;
	}

	@ObfuscatedName("DEHYKQII.d(I)LKDWDYCIL;")
	public final KDWDYCIL method186() {
		if (field550 != null) {
			int var1 = -1;
			if (field717 >= 0 && field720 == 0) {
				var1 = LMDSPIVT.field867[field717].field869[field718];
			} else if (field713 >= 0) {
				var1 = LMDSPIVT.field867[field713].field869[field714];
			}

			return field550.method561(null, var1, -1);
		}

		long var3 = field537;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field717 >= 0 && field720 == 0) {
			LMDSPIVT var9 = LMDSPIVT.field867[field717];
			var5 = var9.field869[field718];

			if (field713 >= 0 && field713 != field693) {
				var6 = LMDSPIVT.field867[field713].field869[field714];
			}

			if (var9.field876 >= 0) {
				var7 = var9.field876;
				var3 += var7 - field532[5] << 40;
			}

			if (var9.field877 >= 0) {
				var8 = var9.field877;
				var3 += var8 - field532[3] << 48;
			}
		} else if (field713 >= 0) {
			var5 = LMDSPIVT.field867[field713].field869[field714];
		}

		KDWDYCIL var10 = (KDWDYCIL) field538.method230(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field532[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !DOOZRHTX.field555[var13 - 256].method191()) {
					var11 = true;
				}

				if (var13 >= 512 && !YDSJAZFL.method575(var13 - 512).method579(field531)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field552 != -1L) {
					var10 = (KDWDYCIL) field538.method230(field552);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			KDWDYCIL[] var14 = new KDWDYCIL[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field532[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					KDWDYCIL var18 = DOOZRHTX.field555[var17 - 256].method192();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					KDWDYCIL var19 = YDSJAZFL.method575(var17 - 512).method578(field531);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new KDWDYCIL(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field530[var20] != 0) {
					var10.method260(client.field242[var20][0], client.field242[var20][field530[var20]]);

					if (var20 == 1) {
						var10.method260(client.field499[0], client.field499[field530[var20]]);
					}
				}
			}

			var10.method253();
			var10.method263(64, 850, -30, -50, -30, true);
			field538.method231(var3, var10);
			field552 = var3;
		}

		if (field536) {
			return var10;
		}

		KDWDYCIL var21 = KDWDYCIL.field761;
		var21.method248(SGSYCWFB.method423(var5) & SGSYCWFB.method423(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method255(var6, var5, LMDSPIVT.field867[field717].field873);
		} else if (var5 != -1) {
			var21.method254(var5);
		}

		var21.method250();
		var21.field797 = null;
		var21.field796 = null;
		return var21;
	}

	@ObfuscatedName("DEHYKQII.a(ILTQYMAXSO;)V")
	public final void method187(TQYMAXSO arg0) {
		arg0.field1263 = 0;
		field531 = arg0.method468();
		field551 = arg0.method469();
		field553 = arg0.method469();
		field550 = null;
		field528 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method468();
			if (var3 == 0) {
				field532[var2] = 0;
			} else {
				int var4 = arg0.method468();
				field532[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field532[0] == 0xFFFF) {
					field550 = YANZSPIT.method563(arg0.method470());
					break;
				}

				if (field532[var2] >= 512 && field532[var2] - 512 < YDSJAZFL.field1451) {
					int var5 = YDSJAZFL.method575(field532[var2] - 512).field1477;
					if (var5 != 0) {
						field528 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method468();
			if (var7 < 0 || var7 >= client.field242[var6].length) {
				var7 = 0;
			}

			field530[var6] = var7;
		}

		field693 = arg0.method470();
		if (field693 == 0xFFFF) {
			field693 = -1;
		}

		field694 = arg0.method470();
		if (field694 == 0xFFFF) {
			field694 = -1;
		}

		field727 = arg0.method470();
		if (field727 == 0xFFFF) {
			field727 = -1;
		}

		field728 = arg0.method470();
		if (field728 == 0xFFFF) {
			field728 = -1;
		}

		field729 = arg0.method470();
		if (field729 == 0xFFFF) {
			field729 = -1;
		}

		field730 = arg0.method470();
		if (field730 == 0xFFFF) {
			field730 = -1;
		}

		field688 = arg0.method470();
		if (field688 == 0xFFFF) {
			field688 = -1;
		}

		field541 = PZGHUCRX.method409(PZGHUCRX.method406(arg0.method474()));
		field533 = arg0.method468();
		field529 = arg0.method470();
		field539 = true;
		field537 = 0L;
		int var8 = field532[5];
		int var9 = field532[9];
		field532[5] = var9;
		field532[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field537 <<= 4;
			if (field532[var10] >= 256) {
				field537 += field532[var10] - 256;
			}
		}

		if (field532[0] >= 256) {
			field537 += field532[0] - 256 >> 4;
		}

		if (field532[1] >= 256) {
			field537 += field532[1] - 256 >> 8;
		}

		field532[5] = var8;
		field532[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field537 <<= 3;
			field537 += field530[var11];
		}

		field537 <<= 1;
		field537 += field531;
	}

	@ObfuscatedName("DEHYKQII.a(Z)Z")
	public final boolean method188() {
		if (!field539) {
			return false;
		}

		return true;
	}
}
