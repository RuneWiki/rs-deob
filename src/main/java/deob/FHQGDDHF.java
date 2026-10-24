package deob;

@ObfuscatedName("FHQGDDHF")
public final class FHQGDDHF extends VNAWUDPP {

	@ObfuscatedName("FHQGDDHF.zb")
	public boolean field612 = false;

	@ObfuscatedName("FHQGDDHF.Bb")
	public long field613 = -1L;

	@ObfuscatedName("FHQGDDHF.Jb")
	public int[] field621 = new int[5];

	@ObfuscatedName("FHQGDDHF.Mb")
	public int[] field624 = new int[12];

	@ObfuscatedName("FHQGDDHF.Qb")
	public boolean field628 = false;

	@ObfuscatedName("FHQGDDHF.Pb")
	public static LSQNLJTA field627 = new LSQNLJTA(260);

	@ObfuscatedName("FHQGDDHF.rb")
	public int field604;

	@ObfuscatedName("FHQGDDHF.sb")
	public int field605;

	@ObfuscatedName("FHQGDDHF.tb")
	public int field606;

	@ObfuscatedName("FHQGDDHF.ub")
	public int field607;

	@ObfuscatedName("FHQGDDHF.vb")
	public int field608;

	@ObfuscatedName("FHQGDDHF.wb")
	public int field609;

	@ObfuscatedName("FHQGDDHF.Cb")
	public int field614;

	@ObfuscatedName("FHQGDDHF.Db")
	public int field615;

	@ObfuscatedName("FHQGDDHF.Eb")
	public int field616;

	@ObfuscatedName("FHQGDDHF.Fb")
	public int field617;

	@ObfuscatedName("FHQGDDHF.Gb")
	public int field618;

	@ObfuscatedName("FHQGDDHF.Ib")
	public int field620;

	@ObfuscatedName("FHQGDDHF.Kb")
	public int field622;

	@ObfuscatedName("FHQGDDHF.Lb")
	public int field623;

	@ObfuscatedName("FHQGDDHF.Ob")
	public int field626;

	@ObfuscatedName("FHQGDDHF.Hb")
	public long field619;

	@ObfuscatedName("FHQGDDHF.xb")
	public LFTMDGKK field610;

	@ObfuscatedName("FHQGDDHF.Nb")
	public OMIIKHIV field625;

	@ObfuscatedName("FHQGDDHF.yb")
	public String field611;

	@ObfuscatedName("FHQGDDHF.c(Z)LLFTMDGKK;")
	public final LFTMDGKK method293() {
		if (!field628) {
			return null;
		}

		if (field625 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field624[var2];
				if (var3 >= 256 && var3 < 512 && !PTMGRPAM.field1115[var3 - 256].method467()) {
					var1 = true;
				}

				if (var3 >= 512 && !JPUETSNB.method329(var3 - 512).method327(field605)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			LFTMDGKK[] var4 = new LFTMDGKK[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field624[var6];
				if (var7 >= 256 && var7 < 512) {
					LFTMDGKK var8 = PTMGRPAM.field1115[var7 - 256].method468();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					LFTMDGKK var9 = JPUETSNB.method329(var7 - 512).method325(field605);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			LFTMDGKK var10 = new LFTMDGKK(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field621[var11] != 0) {
					var10.method355(client.field382[var11][0], client.field382[var11][field621[var11]]);

					if (var11 == 1) {
						var10.method355(client.field309[0], client.field309[field621[var11]]);
					}
				}
			}

			return var10;
		}

		return field625.method449();
	}

	@ObfuscatedName("FHQGDDHF.d(Z)LLFTMDGKK;")
	public final LFTMDGKK method294() {
		if (field625 != null) {
			int var1 = -1;
			if (field1349 >= 0 && field1352 == 0) {
				var1 = IUTBNGPH.field682[field1349].field684[field1350];
			} else if (field1356 >= 0) {
				var1 = IUTBNGPH.field682[field1356].field684[field1357];
			}

			return field625.method445(null, -1, var1);
		}

		long var3 = field619;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1349 >= 0 && field1352 == 0) {
			IUTBNGPH var9 = IUTBNGPH.field682[field1349];
			var5 = var9.field684[field1350];

			if (field1356 >= 0 && field1356 != field1344) {
				var6 = IUTBNGPH.field682[field1356].field684[field1357];
			}

			if (var9.field691 >= 0) {
				var7 = var9.field691;
				var3 += var7 - field624[5] << 40;
			}

			if (var9.field692 >= 0) {
				var8 = var9.field692;
				var3 += var8 - field624[3] << 48;
			}
		} else if (field1356 >= 0) {
			var5 = IUTBNGPH.field682[field1356].field684[field1357];
		}

		LFTMDGKK var10 = (LFTMDGKK) field627.method369(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field624[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !PTMGRPAM.field1115[var13 - 256].method465()) {
					var11 = true;
				}

				if (var13 >= 512 && !JPUETSNB.method329(var13 - 512).method335(field605)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field613 != -1L) {
					var10 = (LFTMDGKK) field627.method369(field613);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			LFTMDGKK[] var14 = new LFTMDGKK[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field624[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					LFTMDGKK var18 = PTMGRPAM.field1115[var17 - 256].method466();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					LFTMDGKK var19 = JPUETSNB.method329(var17 - 512).method331(field605);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new LFTMDGKK(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field621[var20] != 0) {
					var10.method355(client.field382[var20][0], client.field382[var20][field621[var20]]);

					if (var20 == 1) {
						var10.method355(client.field309[0], client.field309[field621[var20]]);
					}
				}
			}

			var10.method348();
			var10.method358(64, 850, -30, -50, -30, true);
			field627.method370(var10, var3);
			field613 = var3;
		}

		if (field612) {
			return var10;
		}

		LFTMDGKK var21 = LFTMDGKK.field815;
		var21.method343(var10, CANZHIOT.method17(var5) & CANZHIOT.method17(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method350(IUTBNGPH.field682[field1349].field688, var6, var5);
		} else if (var5 != -1) {
			var21.method349(var5);
		}

		var21.method345();
		var21.field852 = null;
		var21.field851 = null;
		return var21;
	}

	@ObfuscatedName("FHQGDDHF.a(LCFARFRSG;I)V")
	public final void method295(CFARFRSG arg0) {
		arg0.field44 = 0;
		field605 = arg0.method30();
		field620 = arg0.method30();
		field625 = null;
		field626 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method30();
			if (var3 == 0) {
				field624[var2] = 0;
			} else {
				int var4 = arg0.method30();
				field624[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field624[0] == 0xFFFF) {
					field625 = OMIIKHIV.method444(arg0.method32());
					break;
				}

				if (field624[var2] >= 512 && field624[var2] - 512 < JPUETSNB.field758) {
					int var5 = JPUETSNB.method329(field624[var2] - 512).field755;
					if (var5 != 0) {
						field626 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method30();
			if (var7 < 0 || var7 >= client.field382[var6].length) {
				var7 = 0;
			}

			field621[var6] = var7;
		}

		field1344 = arg0.method32();
		if (field1344 == 0xFFFF) {
			field1344 = -1;
		}

		field1345 = arg0.method32();
		if (field1345 == 0xFFFF) {
			field1345 = -1;
		}

		field1317 = arg0.method32();
		if (field1317 == 0xFFFF) {
			field1317 = -1;
		}

		field1318 = arg0.method32();
		if (field1318 == 0xFFFF) {
			field1318 = -1;
		}

		field1319 = arg0.method32();
		if (field1319 == 0xFFFF) {
			field1319 = -1;
		}

		field1320 = arg0.method32();
		if (field1320 == 0xFFFF) {
			field1320 = -1;
		}

		field1321 = arg0.method32();
		if (field1321 == 0xFFFF) {
			field1321 = -1;
		}

		field611 = ZDHYRWCV.method591(ZDHYRWCV.method588(arg0.method36()));
		field604 = arg0.method30();
		field606 = arg0.method32();
		field628 = true;
		field619 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field619 <<= 4;
			if (field624[var8] >= 256) {
				field619 += field624[var8] - 256;
			}
		}

		if (field624[0] >= 256) {
			field619 += field624[0] - 256 >> 4;
		}

		if (field624[1] >= 256) {
			field619 += field624[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field619 <<= 3;
			field619 += field621[var9];
		}

		field619 <<= 1;
		field619 += field605;
	}

	@ObfuscatedName("FHQGDDHF.b(Z)Z")
	public final boolean method2() {
		if (!field628) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("FHQGDDHF.a(I)LLFTMDGKK;")
	public final LFTMDGKK method1() {
		if (!field628) {
			return null;
		}

		LFTMDGKK var1 = method294();
		if (var1 == null) {
			return null;
		}

		field1341 = var1.field494;
		var1.field853 = true;

		if (field612) {
			return var1;
		}

		if (field1306 != -1 && field1307 != -1) {
			BRGDZOWQ var2 = BRGDZOWQ.field8[field1306];
			LFTMDGKK var3 = var2.method11();
			if (var3 != null) {
				LFTMDGKK var4 = new LFTMDGKK(CANZHIOT.method17(field1307), true, var3, false);
				var4.method354(-field1310, 0, 0);
				var4.method348();
				var4.method349(var2.field12.field684[field1307]);
				var4.field852 = null;
				var4.field851 = null;

				if (var2.field15 != 128 || var2.field16 != 128) {
					var4.method357(var2.field16, var2.field15, var2.field15);
				}

				var4.method358(var2.field18 + 64, var2.field19 + 850, -30, -50, -30, true);
				LFTMDGKK[] var5 = new LFTMDGKK[] { var1, var4 };
				var1 = new LFTMDGKK(true, var5, 2);
			}
		}

		if (field610 != null) {
			if (client.field145 >= field623) {
				field610 = null;
			}

			if (client.field145 >= field622 && client.field145 < field623) {
				LFTMDGKK var6 = field610;
				var6.method354(field608 - field618, field607 - field1333, field609 - field1334);

				if (field1339 == 512) {
					var6.method352();
					var6.method352();
					var6.method352();
				} else if (field1339 == 1024) {
					var6.method352();
					var6.method352();
				} else if (field1339 == 1536) {
					var6.method352();
				}

				LFTMDGKK[] var7 = new LFTMDGKK[] { var1, var6 };
				var1 = new LFTMDGKK(true, var7, 2);

				if (field1339 == 512) {
					var6.method352();
				} else if (field1339 == 1024) {
					var6.method352();
					var6.method352();
				} else if (field1339 == 1536) {
					var6.method352();
					var6.method352();
					var6.method352();
				}

				var6.method354(field618 - field608, field1333 - field607, field1334 - field609);
			}
		}

		var1.field853 = true;
		return var1;
	}
}
