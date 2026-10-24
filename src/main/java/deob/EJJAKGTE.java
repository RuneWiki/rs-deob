package deob;

@ObfuscatedName("EJJAKGTE")
public final class EJJAKGTE extends GSULPWKR {

	@ObfuscatedName("EJJAKGTE.sb")
	public int[] field548 = new int[12];

	@ObfuscatedName("EJJAKGTE.xb")
	public int field551 = -1;

	@ObfuscatedName("EJJAKGTE.zb")
	public long field553 = -1L;

	@ObfuscatedName("EJJAKGTE.Ab")
	public int[] field554 = new int[5];

	@ObfuscatedName("EJJAKGTE.Gb")
	public boolean field559 = false;

	@ObfuscatedName("EJJAKGTE.Mb")
	public int field565 = -1;

	@ObfuscatedName("EJJAKGTE.Sb")
	public boolean field570 = false;

	@ObfuscatedName("EJJAKGTE.Hb")
	public static VNWSQIXW field560 = new VNWSQIXW(260);

	@ObfuscatedName("EJJAKGTE.qb")
	public int field547;

	@ObfuscatedName("EJJAKGTE.wb")
	public int field550;

	@ObfuscatedName("EJJAKGTE.Cb")
	public int field555;

	@ObfuscatedName("EJJAKGTE.Db")
	public int field556;

	@ObfuscatedName("EJJAKGTE.Eb")
	public int field557;

	@ObfuscatedName("EJJAKGTE.Ib")
	public int field561;

	@ObfuscatedName("EJJAKGTE.Jb")
	public int field562;

	@ObfuscatedName("EJJAKGTE.Kb")
	public int field563;

	@ObfuscatedName("EJJAKGTE.Lb")
	public int field564;

	@ObfuscatedName("EJJAKGTE.Nb")
	public int field566;

	@ObfuscatedName("EJJAKGTE.Ob")
	public int field567;

	@ObfuscatedName("EJJAKGTE.Qb")
	public int field568;

	@ObfuscatedName("EJJAKGTE.Tb")
	public int field571;

	@ObfuscatedName("EJJAKGTE.Wb")
	public int field572;

	@ObfuscatedName("EJJAKGTE.Rb")
	public long field569;

	@ObfuscatedName("EJJAKGTE.tb")
	public DDJHHGTJ field549;

	@ObfuscatedName("EJJAKGTE.Fb")
	public OQIGXOFQ field558;

	@ObfuscatedName("EJJAKGTE.yb")
	public String field552;

	@ObfuscatedName("EJJAKGTE.b(I)Z")
	public final boolean method169() {
		if (!field570) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("EJJAKGTE.a(B)LOQIGXOFQ;")
	public final OQIGXOFQ method170() {
		if (field549 != null) {
			int var1 = -1;
			if (field736 >= 0 && field739 == 0) {
				var1 = VYCKCNXO.field1339[field736].field1341[field737];
			} else if (field729 >= 0) {
				var1 = VYCKCNXO.field1339[field729].field1341[field730];
			}

			return field549.method158(null, var1, -1);
		}

		long var3 = field569;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field736 >= 0 && field739 == 0) {
			VYCKCNXO var9 = VYCKCNXO.field1339[field736];
			var5 = var9.field1341[field737];

			if (field729 >= 0 && field765 != field729) {
				var6 = VYCKCNXO.field1339[field729].field1341[field730];
			}

			if (var9.field1348 >= 0) {
				var7 = var9.field1348;
				var3 += var7 - field548[5] << 40;
			}

			if (var9.field1349 >= 0) {
				var8 = var9.field1349;
				var3 += var8 - field548[3] << 48;
			}
		} else if (field729 >= 0) {
			var5 = VYCKCNXO.field1339[field729].field1341[field730];
		}

		OQIGXOFQ var10 = (OQIGXOFQ) field560.method507(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field548[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !FGIDBWCJ.field647[var13 - 256].method186()) {
					var11 = true;
				}

				if (var13 >= 512 && !ZKNJTNWP.method590(var13 - 512).method599(field572)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field553 != -1L) {
					var10 = (OQIGXOFQ) field560.method507(field553);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			OQIGXOFQ[] var14 = new OQIGXOFQ[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field548[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					OQIGXOFQ var18 = FGIDBWCJ.field647[var17 - 256].method187();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					OQIGXOFQ var19 = ZKNJTNWP.method590(var17 - 512).method589(field572);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new OQIGXOFQ(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field554[var20] != 0) {
					var10.method405(client.field444[var20][0], client.field444[var20][field554[var20]]);

					if (var20 == 1) {
						var10.method405(client.field380[0], client.field380[field554[var20]]);
					}
				}
			}

			var10.method398();
			var10.method408(64, 850, -30, -50, -30, true);
			field560.method508(var3, var10);
			field553 = var3;
		}

		if (field559) {
			return var10;
		}

		OQIGXOFQ var21 = OQIGXOFQ.field1029;
		var21.method393(var10, XZZTWOGF.method582(var5) & XZZTWOGF.method582(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method400(var5, VYCKCNXO.field1339[field736].field1345, var6);
		} else if (var5 != -1) {
			var21.method399(var5);
		}

		var21.method395();
		var21.field1066 = null;
		var21.field1065 = null;
		return var21;
	}

	@ObfuscatedName("EJJAKGTE.a(Z)LOQIGXOFQ;")
	public final OQIGXOFQ method171() {
		if (!field570) {
			return null;
		}

		OQIGXOFQ var1 = method170();
		if (var1 == null) {
			return null;
		}

		field754 = var1.field1467;
		var1.field1067 = true;

		if (field559) {
			return var1;
		}

		if (field756 != -1 && field757 != -1) {
			BYUDODIR var2 = BYUDODIR.field34[field756];
			OQIGXOFQ var3 = var2.method18();
			if (var3 != null) {
				OQIGXOFQ var4 = new OQIGXOFQ(XZZTWOGF.method582(field757), var3, false, true);
				var4.method404(0, -field760, 0);
				var4.method398();
				var4.method399(var2.field38.field1341[field757]);
				var4.field1066 = null;
				var4.field1065 = null;

				if (var2.field41 != 128 || var2.field42 != 128) {
					var4.method407(var2.field42, var2.field41, var2.field41);
				}

				var4.method408(var2.field44 + 64, var2.field45 + 850, -30, -50, -30, true);
				OQIGXOFQ[] var5 = new OQIGXOFQ[] { var1, var4 };
				var1 = new OQIGXOFQ(true, var5, 2);
			}
		}

		if (field558 != null) {
			if (client.field372 >= field567) {
				field558 = null;
			}

			if (client.field372 >= field566 && client.field372 < field567) {
				OQIGXOFQ var6 = field558;
				var6.method404(field555 - field741, field556 - field571, field557 - field742);

				if (field751 == 512) {
					var6.method402();
					var6.method402();
					var6.method402();
				} else if (field751 == 1024) {
					var6.method402();
					var6.method402();
				} else if (field751 == 1536) {
					var6.method402();
				}

				OQIGXOFQ[] var7 = new OQIGXOFQ[] { var1, var6 };
				var1 = new OQIGXOFQ(true, var7, 2);

				if (field751 == 512) {
					var6.method402();
				} else if (field751 == 1024) {
					var6.method402();
					var6.method402();
				} else if (field751 == 1536) {
					var6.method402();
					var6.method402();
					var6.method402();
				}

				var6.method404(field741 - field555, field571 - field556, field742 - field557);
			}
		}

		var1.field1067 = true;
		return var1;
	}

	@ObfuscatedName("EJJAKGTE.b(Z)LOQIGXOFQ;")
	public final OQIGXOFQ method172() {
		if (!field570) {
			return null;
		}

		if (field549 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field548[var2];
				if (var3 >= 256 && var3 < 512 && !FGIDBWCJ.field647[var3 - 256].method188()) {
					var1 = true;
				}

				if (var3 >= 512 && !ZKNJTNWP.method590(var3 - 512).method594(field572)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			OQIGXOFQ[] var4 = new OQIGXOFQ[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field548[var6];
				if (var7 >= 256 && var7 < 512) {
					OQIGXOFQ var8 = FGIDBWCJ.field647[var7 - 256].method189();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					OQIGXOFQ var9 = ZKNJTNWP.method590(var7 - 512).method598(field572);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			OQIGXOFQ var10 = new OQIGXOFQ(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field554[var11] != 0) {
					var10.method405(client.field444[var11][0], client.field444[var11][field554[var11]]);

					if (var11 == 1) {
						var10.method405(client.field380[0], client.field380[field554[var11]]);
					}
				}
			}

			return var10;
		}

		return field549.method163();
	}

	@ObfuscatedName("EJJAKGTE.a(ILGHHPHSRU;)V")
	public final void method173(GHHPHSRU arg0) {
		arg0.field667 = 0;
		field572 = arg0.method202();
		field565 = arg0.method203();
		field551 = arg0.method203();
		field549 = null;
		field550 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method202();
			if (var3 == 0) {
				field548[var2] = 0;
			} else {
				int var4 = arg0.method202();
				field548[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field548[0] == 0xFFFF) {
					field549 = DDJHHGTJ.method162(arg0.method204());
					break;
				}

				if (field548[var2] >= 512 && field548[var2] - 512 < ZKNJTNWP.field1475) {
					int var5 = ZKNJTNWP.method590(field548[var2] - 512).field1496;
					if (var5 != 0) {
						field550 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method202();
			if (var7 < 0 || var7 >= client.field444[var6].length) {
				var7 = 0;
			}

			field554[var6] = var7;
		}

		field765 = arg0.method204();
		if (field765 == 0xFFFF) {
			field765 = -1;
		}

		field766 = arg0.method204();
		if (field766 == 0xFFFF) {
			field766 = -1;
		}

		field776 = arg0.method204();
		if (field776 == 0xFFFF) {
			field776 = -1;
		}

		field777 = arg0.method204();
		if (field777 == 0xFFFF) {
			field777 = -1;
		}

		field778 = arg0.method204();
		if (field778 == 0xFFFF) {
			field778 = -1;
		}

		field779 = arg0.method204();
		if (field779 == 0xFFFF) {
			field779 = -1;
		}

		field735 = arg0.method204();
		if (field735 == 0xFFFF) {
			field735 = -1;
		}

		field552 = VSUIHULP.method514(VSUIHULP.method511(arg0.method208()));
		field568 = arg0.method202();
		field547 = arg0.method204();
		field570 = true;
		field569 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field569 <<= 4;
			if (field548[var8] >= 256) {
				field569 += field548[var8] - 256;
			}
		}

		if (field548[0] >= 256) {
			field569 += field548[0] - 256 >> 4;
		}

		if (field548[1] >= 256) {
			field569 += field548[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field569 <<= 3;
			field569 += field554[var9];
		}

		field569 <<= 1;
		field569 += field572;
	}
}
