package deob;

@ObfuscatedName("BPHJJPRI")
public final class BPHJJPRI extends CUSCNWAC {

	@ObfuscatedName("BPHJJPRI.wb")
	public int[] field62 = new int[12];

	@ObfuscatedName("BPHJJPRI.yb")
	public int field63 = -1;

	@ObfuscatedName("BPHJJPRI.Db")
	public long field66 = -1L;

	@ObfuscatedName("BPHJJPRI.Eb")
	public boolean field67 = false;

	@ObfuscatedName("BPHJJPRI.Lb")
	public int field72 = -1;

	@ObfuscatedName("BPHJJPRI.Tb")
	public int[] field80 = new int[5];

	@ObfuscatedName("BPHJJPRI.Vb")
	public boolean field81 = false;

	@ObfuscatedName("BPHJJPRI.zb")
	public static UNPPHFRC field64 = new UNPPHFRC(260);

	@ObfuscatedName("BPHJJPRI.sb")
	public int field58;

	@ObfuscatedName("BPHJJPRI.tb")
	public int field59;

	@ObfuscatedName("BPHJJPRI.ub")
	public int field60;

	@ObfuscatedName("BPHJJPRI.Gb")
	public int field68;

	@ObfuscatedName("BPHJJPRI.Hb")
	public int field69;

	@ObfuscatedName("BPHJJPRI.Ib")
	public int field70;

	@ObfuscatedName("BPHJJPRI.Jb")
	public int field71;

	@ObfuscatedName("BPHJJPRI.Mb")
	public int field73;

	@ObfuscatedName("BPHJJPRI.Nb")
	public int field74;

	@ObfuscatedName("BPHJJPRI.Ob")
	public int field75;

	@ObfuscatedName("BPHJJPRI.Pb")
	public int field76;

	@ObfuscatedName("BPHJJPRI.Rb")
	public int field78;

	@ObfuscatedName("BPHJJPRI.Wb")
	public int field82;

	@ObfuscatedName("BPHJJPRI.Xb")
	public int field83;

	@ObfuscatedName("BPHJJPRI.Cb")
	public long field65;

	@ObfuscatedName("BPHJJPRI.Qb")
	public OJGAHFXC field77;

	@ObfuscatedName("BPHJJPRI.vb")
	public QYNFXHXW field61;

	@ObfuscatedName("BPHJJPRI.Sb")
	public String field79;

	@ObfuscatedName("BPHJJPRI.c(I)LOJGAHFXC;")
	public final OJGAHFXC method38() {
		if (field61 != null) {
			int var1 = -1;
			if (field609 >= 0 && field612 == 0) {
				var1 = DVIZXFSW.field636[field609].field638[field610];
			} else if (field623 >= 0) {
				var1 = DVIZXFSW.field636[field623].field638[field624];
			}

			return field61.method513(null, var1, -1);
		}

		long var3 = field65;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field609 >= 0 && field612 == 0) {
			DVIZXFSW var9 = DVIZXFSW.field636[field609];
			var5 = var9.field638[field610];

			if (field623 >= 0 && field623 != field620) {
				var6 = DVIZXFSW.field636[field623].field638[field624];
			}

			if (var9.field645 >= 0) {
				var7 = var9.field645;
				var3 += var7 - field62[5] << 40;
			}

			if (var9.field646 >= 0) {
				var8 = var9.field646;
				var3 += var8 - field62[3] << 48;
			}
		} else if (field623 >= 0) {
			var5 = DVIZXFSW.field636[field623].field638[field624];
		}

		OJGAHFXC var10 = (OJGAHFXC) field64.method531(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field62[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !ZAYCIZYV.field1507[var13 - 256].method589()) {
					var11 = true;
				}

				if (var13 >= 512 && !LAMDVZMU.method376(var13 - 512).method378(field82)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field66 != -1L) {
					var10 = (OJGAHFXC) field64.method531(field66);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			OJGAHFXC[] var14 = new OJGAHFXC[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field62[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					OJGAHFXC var18 = ZAYCIZYV.field1507[var17 - 256].method590();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					OJGAHFXC var19 = LAMDVZMU.method376(var17 - 512).method377(field82);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new OJGAHFXC(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field80[var20] != 0) {
					var10.method427(client.field138[var20][0], client.field138[var20][field80[var20]]);

					if (var20 == 1) {
						var10.method427(client.field559[0], client.field559[field80[var20]]);
					}
				}
			}

			var10.method420();
			var10.method430(64, 850, -30, -50, -30, true);
			field64.method532(var3, var10);
			field66 = var3;
		}

		if (field81) {
			return var10;
		}

		OJGAHFXC var21 = OJGAHFXC.field1013;
		var21.method415(MOOJSKCU.method395(var5) & MOOJSKCU.method395(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method422(var5, DVIZXFSW.field636[field609].field642, var6);
		} else if (var5 != -1) {
			var21.method421(var5);
		}

		var21.method417();
		var21.field1049 = null;
		var21.field1048 = null;
		return var21;
	}

	@ObfuscatedName("BPHJJPRI.a(I)LOJGAHFXC;")
	public final OJGAHFXC method1() {
		if (!field67) {
			return null;
		}

		OJGAHFXC var1 = method38();
		if (var1 == null) {
			return null;
		}

		field628 = var1.field1265;
		var1.field1050 = true;

		if (field81) {
			return var1;
		}

		if (field578 != -1 && field579 != -1) {
			XYSJIYWF var2 = XYSJIYWF.field1477[field578];
			OJGAHFXC var3 = var2.method582();
			if (var3 != null) {
				OJGAHFXC var4 = new OJGAHFXC(MOOJSKCU.method395(field579), false, true, var3);
				var4.method426(-field582, 0, 0);
				var4.method420();
				var4.method421(var2.field1481.field638[field579]);
				var4.field1049 = null;
				var4.field1048 = null;

				if (var2.field1484 != 128 || var2.field1485 != 128) {
					var4.method429(var2.field1484, var2.field1485, var2.field1484);
				}

				var4.method430(var2.field1487 + 64, var2.field1488 + 850, -30, -50, -30, true);
				OJGAHFXC[] var5 = new OJGAHFXC[] { var1, var4 };
				var1 = new OJGAHFXC(true, var5, 2);
			}
		}

		if (field77 != null) {
			if (client.field531 >= field59) {
				field77 = null;
			}

			if (client.field531 >= field58 && client.field531 < field59) {
				OJGAHFXC var6 = field77;
				var6.method426(field75 - field83, field76 - field585, field74 - field584);

				if (field604 == 512) {
					var6.method424();
					var6.method424();
					var6.method424();
				} else if (field604 == 1024) {
					var6.method424();
					var6.method424();
				} else if (field604 == 1536) {
					var6.method424();
				}

				OJGAHFXC[] var7 = new OJGAHFXC[] { var1, var6 };
				var1 = new OJGAHFXC(true, var7, 2);

				if (field604 == 512) {
					var6.method424();
				} else if (field604 == 1024) {
					var6.method424();
					var6.method424();
				} else if (field604 == 1536) {
					var6.method424();
					var6.method424();
					var6.method424();
				}

				var6.method426(field83 - field75, field585 - field76, field584 - field74);
			}
		}

		var1.field1050 = true;
		return var1;
	}

	@ObfuscatedName("BPHJJPRI.a(ILEYMNCFMK;)V")
	public final void method39(EYMNCFMK arg0) {
		arg0.field679 = 0;
		field82 = arg0.method239();
		field63 = arg0.method240();
		field72 = arg0.method240();
		field61 = null;
		field78 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method239();
			if (var3 == 0) {
				field62[var2] = 0;
			} else {
				int var4 = arg0.method239();
				field62[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field62[0] == 0xFFFF) {
					field61 = QYNFXHXW.method512(arg0.method241());
					break;
				}

				if (field62[var2] >= 512 && field62[var2] - 512 < LAMDVZMU.field894) {
					int var5 = LAMDVZMU.method376(field62[var2] - 512).field884;
					if (var5 != 0) {
						field78 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method239();
			if (var7 < 0 || var7 >= client.field138[var6].length) {
				var7 = 0;
			}

			field80[var6] = var7;
		}

		field620 = arg0.method241();
		if (field620 == 0xFFFF) {
			field620 = -1;
		}

		field621 = arg0.method241();
		if (field621 == 0xFFFF) {
			field621 = -1;
		}

		field590 = arg0.method241();
		if (field590 == 0xFFFF) {
			field590 = -1;
		}

		field591 = arg0.method241();
		if (field591 == 0xFFFF) {
			field591 = -1;
		}

		field592 = arg0.method241();
		if (field592 == 0xFFFF) {
			field592 = -1;
		}

		field593 = arg0.method241();
		if (field593 == 0xFFFF) {
			field593 = -1;
		}

		field615 = arg0.method241();
		if (field615 == 0xFFFF) {
			field615 = -1;
		}

		field79 = LBMFERBT.method384(LBMFERBT.method381(arg0.method245()));
		field73 = arg0.method239();
		field60 = arg0.method241();
		field67 = true;
		field65 = 0L;
		int var8 = field62[5];
		int var9 = field62[9];
		field62[5] = var9;
		field62[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field65 <<= 4;
			if (field62[var10] >= 256) {
				field65 += field62[var10] - 256;
			}
		}

		if (field62[0] >= 256) {
			field65 += field62[0] - 256 >> 4;
		}

		if (field62[1] >= 256) {
			field65 += field62[1] - 256 >> 8;
		}

		field62[5] = var8;
		field62[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field65 <<= 3;
			field65 += field80[var11];
		}

		field65 <<= 1;
		field65 += field82;
	}

	@ObfuscatedName("BPHJJPRI.b(I)Z")
	public final boolean method40() {
		if (!field67) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("BPHJJPRI.d(I)LOJGAHFXC;")
	public final OJGAHFXC method41() {
		if (!field67) {
			return null;
		}

		if (field61 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field62[var2];
				if (var3 >= 256 && var3 < 512 && !ZAYCIZYV.field1507[var3 - 256].method591()) {
					var1 = true;
				}

				if (var3 >= 512 && !LAMDVZMU.method376(var3 - 512).method375(field82)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			OJGAHFXC[] var4 = new OJGAHFXC[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field62[var6];
				if (var7 >= 256 && var7 < 512) {
					OJGAHFXC var8 = ZAYCIZYV.field1507[var7 - 256].method592();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					OJGAHFXC var9 = LAMDVZMU.method376(var7 - 512).method371(field82);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			OJGAHFXC var10 = new OJGAHFXC(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field80[var11] != 0) {
					var10.method427(client.field138[var11][0], client.field138[var11][field80[var11]]);

					if (var11 == 1) {
						var10.method427(client.field559[0], client.field559[field80[var11]]);
					}
				}
			}

			return var10;
		}

		return field61.method514();
	}
}
