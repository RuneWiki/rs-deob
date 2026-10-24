package deob;

@ObfuscatedName("BSQIIHOT")
public final class BSQIIHOT extends JXGMYPJH {

	@ObfuscatedName("BSQIIHOT.pb")
	public int field75 = -1;

	@ObfuscatedName("BSQIIHOT.qb")
	public boolean field76 = false;

	@ObfuscatedName("BSQIIHOT.tb")
	public boolean field79 = false;

	@ObfuscatedName("BSQIIHOT.vb")
	public int[] field81 = new int[12];

	@ObfuscatedName("BSQIIHOT.xb")
	public int[] field83 = new int[5];

	@ObfuscatedName("BSQIIHOT.Ab")
	public int field85 = -1;

	@ObfuscatedName("BSQIIHOT.Jb")
	public long field93 = -1L;

	@ObfuscatedName("BSQIIHOT.rb")
	public static WUMSOEQS field77 = new WUMSOEQS(260);

	@ObfuscatedName("BSQIIHOT.sb")
	public int field78;

	@ObfuscatedName("BSQIIHOT.wb")
	public int field82;

	@ObfuscatedName("BSQIIHOT.Bb")
	public int field86;

	@ObfuscatedName("BSQIIHOT.Db")
	public int field87;

	@ObfuscatedName("BSQIIHOT.Eb")
	public int field88;

	@ObfuscatedName("BSQIIHOT.Fb")
	public int field89;

	@ObfuscatedName("BSQIIHOT.Hb")
	public int field91;

	@ObfuscatedName("BSQIIHOT.Ib")
	public int field92;

	@ObfuscatedName("BSQIIHOT.Kb")
	public int field94;

	@ObfuscatedName("BSQIIHOT.Mb")
	public int field95;

	@ObfuscatedName("BSQIIHOT.Nb")
	public int field96;

	@ObfuscatedName("BSQIIHOT.Ob")
	public int field97;

	@ObfuscatedName("BSQIIHOT.Pb")
	public int field98;

	@ObfuscatedName("BSQIIHOT.Qb")
	public int field99;

	@ObfuscatedName("BSQIIHOT.yb")
	public long field84;

	@ObfuscatedName("BSQIIHOT.Sb")
	public LQFHJGYA field100;

	@ObfuscatedName("BSQIIHOT.Gb")
	public PDVZPZLT field90;

	@ObfuscatedName("BSQIIHOT.ub")
	public String field80;

	@ObfuscatedName("BSQIIHOT.a(Z)LPDVZPZLT;")
	public final PDVZPZLT method40() {
		if (field100 != null) {
			int var1 = -1;
			if (field823 >= 0 && field826 == 0) {
				var1 = JZFUUSFN.field841[field823].field843[field824];
			} else if (field836 >= 0) {
				var1 = JZFUUSFN.field841[field836].field843[field837];
			}

			return field100.method317(null, var1, -1);
		}

		long var3 = field84;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field823 >= 0 && field826 == 0) {
			JZFUUSFN var9 = JZFUUSFN.field841[field823];
			var5 = var9.field843[field824];

			if (field836 >= 0 && field836 != field832) {
				var6 = JZFUUSFN.field841[field836].field843[field837];
			}

			if (var9.field850 >= 0) {
				var7 = var9.field850;
				var3 += var7 - field81[5] << 40;
			}

			if (var9.field851 >= 0) {
				var8 = var9.field851;
				var3 += var8 - field81[3] << 48;
			}
		} else if (field836 >= 0) {
			var5 = JZFUUSFN.field841[field836].field843[field837];
		}

		PDVZPZLT var10 = (PDVZPZLT) field77.method586(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field81[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !LXLAQKAC.field919[var13 - 256].method337()) {
					var11 = true;
				}

				if (var13 >= 512 && !AGZBBQJK.method11(var13 - 512).method15(field82)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field93 != -1L) {
					var10 = (PDVZPZLT) field77.method586(field93);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			PDVZPZLT[] var14 = new PDVZPZLT[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field81[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					PDVZPZLT var18 = LXLAQKAC.field919[var17 - 256].method338();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					PDVZPZLT var19 = AGZBBQJK.method11(var17 - 512).method6(field82);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new PDVZPZLT(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field83[var20] != 0) {
					var10.method428(client.field454[var20][0], client.field454[var20][field83[var20]]);

					if (var20 == 1) {
						var10.method428(client.field432[0], client.field432[field83[var20]]);
					}
				}
			}

			var10.method421();
			var10.method431(64, 850, -30, -50, -30, true);
			field77.method587(var3, var10);
			field93 = var3;
		}

		if (field79) {
			return var10;
		}

		PDVZPZLT var21 = PDVZPZLT.field1130;
		var21.method416(YPRWORMV.method602(var5) & YPRWORMV.method602(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method423(var5, var6, JZFUUSFN.field841[field823].field847);
		} else if (var5 != -1) {
			var21.method422(var5);
		}

		var21.method418();
		var21.field1166 = null;
		var21.field1165 = null;
		return var21;
	}

	@ObfuscatedName("BSQIIHOT.c(B)Z")
	public final boolean method1() {
		if (!field76) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("BSQIIHOT.a(I)LPDVZPZLT;")
	public final PDVZPZLT method41() {
		if (!field76) {
			return null;
		}

		if (field100 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field81[var2];
				if (var3 >= 256 && var3 < 512 && !LXLAQKAC.field919[var3 - 256].method339()) {
					var1 = true;
				}

				if (var3 >= 512 && !AGZBBQJK.method11(var3 - 512).method16(field82)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			PDVZPZLT[] var4 = new PDVZPZLT[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field81[var6];
				if (var7 >= 256 && var7 < 512) {
					PDVZPZLT var8 = LXLAQKAC.field919[var7 - 256].method340();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					PDVZPZLT var9 = AGZBBQJK.method11(var7 - 512).method9(field82);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			PDVZPZLT var10 = new PDVZPZLT(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field83[var11] != 0) {
					var10.method428(client.field454[var11][0], client.field454[var11][field83[var11]]);

					if (var11 == 1) {
						var10.method428(client.field432[0], client.field432[field83[var11]]);
					}
				}
			}

			return var10;
		}

		return field100.method321();
	}

	@ObfuscatedName("BSQIIHOT.a(LMVHXDWGI;I)V")
	public final void method42(MVHXDWGI arg0) {
		arg0.field1014 = 0;
		field82 = arg0.method357();
		field75 = arg0.method358();
		field85 = arg0.method358();
		field100 = null;
		field86 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method357();
			if (var3 == 0) {
				field81[var2] = 0;
			} else {
				int var4 = arg0.method357();
				field81[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field81[0] == 0xFFFF) {
					field100 = LQFHJGYA.method315(arg0.method359());
					break;
				}

				if (field81[var2] >= 512 && field81[var2] - 512 < AGZBBQJK.field44) {
					int var5 = AGZBBQJK.method11(field81[var2] - 512).field45;
					if (var5 != 0) {
						field86 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method357();
			if (var7 < 0 || var7 >= client.field454[var6].length) {
				var7 = 0;
			}

			field83[var6] = var7;
		}

		field832 = arg0.method359();
		if (field832 == 0xFFFF) {
			field832 = -1;
		}

		field833 = arg0.method359();
		if (field833 == 0xFFFF) {
			field833 = -1;
		}

		field805 = arg0.method359();
		if (field805 == 0xFFFF) {
			field805 = -1;
		}

		field806 = arg0.method359();
		if (field806 == 0xFFFF) {
			field806 = -1;
		}

		field807 = arg0.method359();
		if (field807 == 0xFFFF) {
			field807 = -1;
		}

		field808 = arg0.method359();
		if (field808 == 0xFFFF) {
			field808 = -1;
		}

		field818 = arg0.method359();
		if (field818 == 0xFFFF) {
			field818 = -1;
		}

		field80 = TGGPOZND.method551(TGGPOZND.method548(arg0.method363()));
		field94 = arg0.method357();
		field95 = arg0.method359();
		field76 = true;
		field84 = 0L;
		int var8 = field81[5];
		int var9 = field81[9];
		field81[5] = var9;
		field81[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field84 <<= 4;
			if (field81[var10] >= 256) {
				field84 += field81[var10] - 256;
			}
		}

		if (field81[0] >= 256) {
			field84 += field81[0] - 256 >> 4;
		}

		if (field81[1] >= 256) {
			field84 += field81[1] - 256 >> 8;
		}

		field81[5] = var8;
		field81[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field84 <<= 3;
			field84 += field83[var11];
		}

		field84 <<= 1;
		field84 += field82;
	}

	@ObfuscatedName("BSQIIHOT.a(B)LPDVZPZLT;")
	public final PDVZPZLT method3() {
		if (!field76) {
			return null;
		}

		PDVZPZLT var1 = method40();
		if (var1 == null) {
			return null;
		}

		field785 = var1.field1483;
		var1.field1167 = true;

		if (field79) {
			return var1;
		}

		if (field790 != -1 && field791 != -1) {
			MBSSGBHW var2 = MBSSGBHW.field927[field790];
			PDVZPZLT var3 = var2.method343();
			if (var3 != null) {
				PDVZPZLT var4 = new PDVZPZLT(var3, true, YPRWORMV.method602(field791), false);
				var4.method427(0, -field794, 0);
				var4.method421();
				var4.method422(var2.field931.field843[field791]);
				var4.field1166 = null;
				var4.field1165 = null;

				if (var2.field934 != 128 || var2.field935 != 128) {
					var4.method430(var2.field934, var2.field935, var2.field934);
				}

				var4.method431(var2.field937 + 64, var2.field938 + 850, -30, -50, -30, true);
				PDVZPZLT[] var5 = new PDVZPZLT[] { var1, var4 };
				var1 = new PDVZPZLT(var5, true, 2);
			}
		}

		if (field90 != null) {
			if (client.field443 >= field92) {
				field90 = null;
			}

			if (client.field443 >= field91 && client.field443 < field92) {
				PDVZPZLT var6 = field90;
				var6.method427(field89 - field829, field88 - field78, field87 - field828);

				if (field817 == 512) {
					var6.method425();
					var6.method425();
					var6.method425();
				} else if (field817 == 1024) {
					var6.method425();
					var6.method425();
				} else if (field817 == 1536) {
					var6.method425();
				}

				PDVZPZLT[] var7 = new PDVZPZLT[] { var1, var6 };
				var1 = new PDVZPZLT(var7, true, 2);

				if (field817 == 512) {
					var6.method425();
				} else if (field817 == 1024) {
					var6.method425();
					var6.method425();
				} else if (field817 == 1536) {
					var6.method425();
					var6.method425();
					var6.method425();
				}

				var6.method427(field829 - field89, field78 - field88, field828 - field87);
			}
		}

		var1.field1167 = true;
		return var1;
	}
}
