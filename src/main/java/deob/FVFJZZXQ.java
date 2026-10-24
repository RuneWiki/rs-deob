package deob;

@ObfuscatedName("FVFJZZXQ")
public final class FVFJZZXQ extends QQAAMZPI {

	@ObfuscatedName("FVFJZZXQ.sb")
	public long field604 = -1L;

	@ObfuscatedName("FVFJZZXQ.ub")
	public boolean field606 = false;

	@ObfuscatedName("FVFJZZXQ.wb")
	public int[] field608 = new int[12];

	@ObfuscatedName("FVFJZZXQ.Ub")
	public boolean field624 = false;

	@ObfuscatedName("FVFJZZXQ.Vb")
	public int[] field625 = new int[5];

	@ObfuscatedName("FVFJZZXQ.Rb")
	public static OOTLZHQB field623 = new OOTLZHQB(260);

	@ObfuscatedName("FVFJZZXQ.tb")
	public int field605;

	@ObfuscatedName("FVFJZZXQ.vb")
	public int field607;

	@ObfuscatedName("FVFJZZXQ.Bb")
	public int field611;

	@ObfuscatedName("FVFJZZXQ.Cb")
	public int field612;

	@ObfuscatedName("FVFJZZXQ.Db")
	public int field613;

	@ObfuscatedName("FVFJZZXQ.Eb")
	public int field614;

	@ObfuscatedName("FVFJZZXQ.Hb")
	public int field616;

	@ObfuscatedName("FVFJZZXQ.Kb")
	public int field617;

	@ObfuscatedName("FVFJZZXQ.Lb")
	public int field618;

	@ObfuscatedName("FVFJZZXQ.Nb")
	public int field619;

	@ObfuscatedName("FVFJZZXQ.Ob")
	public int field620;

	@ObfuscatedName("FVFJZZXQ.Pb")
	public int field621;

	@ObfuscatedName("FVFJZZXQ.Qb")
	public int field622;

	@ObfuscatedName("FVFJZZXQ.Wb")
	public int field626;

	@ObfuscatedName("FVFJZZXQ.Xb")
	public int field627;

	@ObfuscatedName("FVFJZZXQ.zb")
	public long field610;

	@ObfuscatedName("FVFJZZXQ.yb")
	public RBTWCHLG field609;

	@ObfuscatedName("FVFJZZXQ.Fb")
	public RTQSBWRH field615;

	@ObfuscatedName("FVFJZZXQ.rb")
	public String field603;

	@ObfuscatedName("FVFJZZXQ.a(LJHKSAGUC;I)V")
	public final void method243(JHKSAGUC arg0) {
		arg0.field752 = 0;
		field626 = arg0.method306();
		field607 = arg0.method306();
		field609 = null;
		field616 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method306();
			if (var3 == 0) {
				field608[var2] = 0;
			} else {
				int var4 = arg0.method306();
				field608[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field608[0] == 0xFFFF) {
					field609 = RBTWCHLG.method449(arg0.method308());
					break;
				}

				if (field608[var2] >= 512 && field608[var2] - 512 < MACPVTEQ.field862) {
					int var5 = MACPVTEQ.method374(field608[var2] - 512).field870;
					if (var5 != 0) {
						field616 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method306();
			if (var7 < 0 || var7 >= client.field274[var6].length) {
				var7 = 0;
			}

			field625[var6] = var7;
		}

		field1009 = arg0.method308();
		if (field1009 == 0xFFFF) {
			field1009 = -1;
		}

		field1010 = arg0.method308();
		if (field1010 == 0xFFFF) {
			field1010 = -1;
		}

		field1041 = arg0.method308();
		if (field1041 == 0xFFFF) {
			field1041 = -1;
		}

		field1042 = arg0.method308();
		if (field1042 == 0xFFFF) {
			field1042 = -1;
		}

		field1043 = arg0.method308();
		if (field1043 == 0xFFFF) {
			field1043 = -1;
		}

		field1044 = arg0.method308();
		if (field1044 == 0xFFFF) {
			field1044 = -1;
		}

		field1028 = arg0.method308();
		if (field1028 == 0xFFFF) {
			field1028 = -1;
		}

		field603 = XNWHEMGT.method580(XNWHEMGT.method577(arg0.method312()));
		field627 = arg0.method306();
		field605 = arg0.method308();
		field606 = true;
		field610 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field610 <<= 4;
			if (field608[var8] >= 256) {
				field610 += field608[var8] - 256;
			}
		}

		if (field608[0] >= 256) {
			field610 += field608[0] - 256 >> 4;
		}

		if (field608[1] >= 256) {
			field610 += field608[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field610 <<= 3;
			field610 += field625[var9];
		}

		field610 <<= 1;
		field610 += field626;
	}

	@ObfuscatedName("FVFJZZXQ.a(Z)Z")
	public final boolean method244() {
		if (!field606) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("FVFJZZXQ.a(I)LRTQSBWRH;")
	public final RTQSBWRH method199() {
		if (!field606) {
			return null;
		}

		RTQSBWRH var1 = method246();
		if (var1 == null) {
			return null;
		}

		field1024 = var1.field602;
		var1.field1128 = true;

		if (field624) {
			return var1;
		}

		if (field991 != -1 && field992 != -1) {
			UAVNMKVJ var2 = UAVNMKVJ.field1333[field991];
			RTQSBWRH var3 = var2.method502();
			if (var3 != null) {
				RTQSBWRH var4 = new RTQSBWRH(true, EMBMBPSC.method229(field992), var3, false);
				var4.method467(-field995, 0, 0);
				var4.method461();
				var4.method462(var2.field1337.field797[field992]);
				var4.field1127 = null;
				var4.field1126 = null;

				if (var2.field1340 != 128 || var2.field1341 != 128) {
					var4.method470(var2.field1341, var2.field1340, var2.field1340);
				}

				var4.method471(var2.field1343 + 64, var2.field1344 + 850, -30, -50, -30, true);
				RTQSBWRH[] var5 = new RTQSBWRH[] { var1, var4 };
				var1 = new RTQSBWRH(var5, true, 2);
			}
		}

		if (field615 != null) {
			if (client.field236 >= field618) {
				field615 = null;
			}

			if (client.field236 >= field617 && client.field236 < field618) {
				RTQSBWRH var6 = field615;
				var6.method467(field613 - field611, field612 - field1019, field614 - field1020);

				if (field997 == 512) {
					var6.method465();
					var6.method465();
					var6.method465();
				} else if (field997 == 1024) {
					var6.method465();
					var6.method465();
				} else if (field997 == 1536) {
					var6.method465();
				}

				RTQSBWRH[] var7 = new RTQSBWRH[] { var1, var6 };
				var1 = new RTQSBWRH(var7, true, 2);

				if (field997 == 512) {
					var6.method465();
				} else if (field997 == 1024) {
					var6.method465();
					var6.method465();
				} else if (field997 == 1536) {
					var6.method465();
					var6.method465();
					var6.method465();
				}

				var6.method467(field611 - field613, field1019 - field612, field1020 - field614);
			}
		}

		var1.field1128 = true;
		return var1;
	}

	@ObfuscatedName("FVFJZZXQ.c(I)LRTQSBWRH;")
	public final RTQSBWRH method245() {
		if (!field606) {
			return null;
		}

		if (field609 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field608[var2];
				if (var3 >= 256 && var3 < 512 && !DQSOHZWU.field549[var3 - 256].method217()) {
					var1 = true;
				}

				if (var3 >= 512 && !MACPVTEQ.method374(var3 - 512).method372(field626)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			RTQSBWRH[] var4 = new RTQSBWRH[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field608[var6];
				if (var7 >= 256 && var7 < 512) {
					RTQSBWRH var8 = DQSOHZWU.field549[var7 - 256].method218();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					RTQSBWRH var9 = MACPVTEQ.method374(var7 - 512).method377(field626);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			RTQSBWRH var10 = new RTQSBWRH(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field625[var11] != 0) {
					var10.method468(client.field274[var11][0], client.field274[var11][field625[var11]]);

					if (var11 == 1) {
						var10.method468(client.field404[0], client.field404[field625[var11]]);
					}
				}
			}

			return var10;
		}

		return field609.method447();
	}

	@ObfuscatedName("FVFJZZXQ.d(I)LRTQSBWRH;")
	public final RTQSBWRH method246() {
		if (field609 != null) {
			int var1 = -1;
			if (field1035 >= 0 && field1038 == 0) {
				var1 = LCRVYGCP.field795[field1035].field797[field1036];
			} else if (field1013 >= 0) {
				var1 = LCRVYGCP.field795[field1013].field797[field1014];
			}

			return field609.method443(null, -1, var1);
		}

		long var3 = field610;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1035 >= 0 && field1038 == 0) {
			LCRVYGCP var9 = LCRVYGCP.field795[field1035];
			var5 = var9.field797[field1036];

			if (field1013 >= 0 && field1013 != field1009) {
				var6 = LCRVYGCP.field795[field1013].field797[field1014];
			}

			if (var9.field804 >= 0) {
				var7 = var9.field804;
				var3 += var7 - field608[5] << 40;
			}

			if (var9.field805 >= 0) {
				var8 = var9.field805;
				var3 += var8 - field608[3] << 48;
			}
		} else if (field1013 >= 0) {
			var5 = LCRVYGCP.field795[field1013].field797[field1014];
		}

		RTQSBWRH var10 = (RTQSBWRH) field623.method386(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field608[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !DQSOHZWU.field549[var13 - 256].method215()) {
					var11 = true;
				}

				if (var13 >= 512 && !MACPVTEQ.method374(var13 - 512).method378(field626)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field604 != -1L) {
					var10 = (RTQSBWRH) field623.method386(field604);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			RTQSBWRH[] var14 = new RTQSBWRH[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field608[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					RTQSBWRH var18 = DQSOHZWU.field549[var17 - 256].method216();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					RTQSBWRH var19 = MACPVTEQ.method374(var17 - 512).method370(field626);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new RTQSBWRH(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field625[var20] != 0) {
					var10.method468(client.field274[var20][0], client.field274[var20][field625[var20]]);

					if (var20 == 1) {
						var10.method468(client.field404[0], client.field404[field625[var20]]);
					}
				}
			}

			var10.method461();
			var10.method471(64, 850, -30, -50, -30, true);
			field623.method387(var3, var10);
			field604 = var3;
		}

		if (field624) {
			return var10;
		}

		RTQSBWRH var21 = RTQSBWRH.field1090;
		var21.method456(EMBMBPSC.method229(var5) & EMBMBPSC.method229(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method463(LCRVYGCP.field795[field1035].field801, var6, var5);
		} else if (var5 != -1) {
			var21.method462(var5);
		}

		var21.method458();
		var21.field1127 = null;
		var21.field1126 = null;
		return var21;
	}
}
