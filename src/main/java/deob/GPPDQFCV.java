package deob;

@ObfuscatedName("GPPDQFCV")
public final class GPPDQFCV extends UKYMLOIC {

	@ObfuscatedName("GPPDQFCV.Cb")
	public boolean field830 = false;

	@ObfuscatedName("GPPDQFCV.Ib")
	public boolean field836 = false;

	@ObfuscatedName("GPPDQFCV.Jb")
	public long field837 = -1L;

	@ObfuscatedName("GPPDQFCV.Mb")
	public int[] field840 = new int[5];

	@ObfuscatedName("GPPDQFCV.Nb")
	public int[] field841 = new int[12];

	@ObfuscatedName("GPPDQFCV.Kb")
	public static ASORKPAH field838 = new ASORKPAH(260);

	@ObfuscatedName("GPPDQFCV.qb")
	public int field820;

	@ObfuscatedName("GPPDQFCV.ub")
	public int field823;

	@ObfuscatedName("GPPDQFCV.vb")
	public int field824;

	@ObfuscatedName("GPPDQFCV.wb")
	public int field825;

	@ObfuscatedName("GPPDQFCV.xb")
	public int field826;

	@ObfuscatedName("GPPDQFCV.yb")
	public int field827;

	@ObfuscatedName("GPPDQFCV.zb")
	public int field828;

	@ObfuscatedName("GPPDQFCV.Ab")
	public int field829;

	@ObfuscatedName("GPPDQFCV.Db")
	public int field831;

	@ObfuscatedName("GPPDQFCV.Eb")
	public int field832;

	@ObfuscatedName("GPPDQFCV.Fb")
	public int field833;

	@ObfuscatedName("GPPDQFCV.Gb")
	public int field834;

	@ObfuscatedName("GPPDQFCV.Ob")
	public int field842;

	@ObfuscatedName("GPPDQFCV.Pb")
	public int field843;

	@ObfuscatedName("GPPDQFCV.Qb")
	public int field844;

	@ObfuscatedName("GPPDQFCV.tb")
	public long field822;

	@ObfuscatedName("GPPDQFCV.rb")
	public BXXPAJNW field821;

	@ObfuscatedName("GPPDQFCV.Hb")
	public GFYXEFQY field835;

	@ObfuscatedName("GPPDQFCV.Lb")
	public String field839;

	@ObfuscatedName("GPPDQFCV.a(B)LGFYXEFQY;")
	public final GFYXEFQY method366() {
		if (!field836) {
			return null;
		}

		if (field821 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field841[var2];
				if (var3 >= 256 && var3 < 512 && !IDSYSMIG.field909[var3 - 256].method386()) {
					var1 = true;
				}

				if (var3 >= 512 && !PTCSWKBP.method489(var3 - 512).method488(field827)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			GFYXEFQY[] var4 = new GFYXEFQY[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field841[var6];
				if (var7 >= 256 && var7 < 512) {
					GFYXEFQY var8 = IDSYSMIG.field909[var7 - 256].method387();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					GFYXEFQY var9 = PTCSWKBP.method489(var7 - 512).method497(field827);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			GFYXEFQY var10 = new GFYXEFQY(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field840[var11] != 0) {
					var10.method355(client.field458[var11][0], client.field458[var11][field840[var11]]);

					if (var11 == 1) {
						var10.method355(client.field352[0], client.field352[field840[var11]]);
					}
				}
			}

			return var10;
		}

		return field821.method25();
	}

	@ObfuscatedName("GPPDQFCV.a(I)LGFYXEFQY;")
	public final GFYXEFQY method294() {
		if (!field836) {
			return null;
		}

		GFYXEFQY var1 = method369();
		if (var1 == null) {
			return null;
		}

		field1346 = var1.field739;
		var1.field786 = true;

		if (field830) {
			return var1;
		}

		if (field1314 != -1 && field1315 != -1) {
			UYLUCQNM var2 = UYLUCQNM.field1364[field1314];
			GFYXEFQY var3 = var2.method564();
			if (var3 != null) {
				GFYXEFQY var4 = new GFYXEFQY(ERVJQNCY.method282(field1315), var3, true, false);
				var4.method354(0, -field1318, 0);
				var4.method348();
				var4.method349(var2.field1368.field1017[field1315]);
				var4.field785 = null;
				var4.field784 = null;

				if (var2.field1371 != 128 || var2.field1372 != 128) {
					var4.method357(var2.field1371, var2.field1371, var2.field1372);
				}

				var4.method358(var2.field1374 + 64, var2.field1375 + 850, -30, -50, -30, true);
				GFYXEFQY[] var5 = new GFYXEFQY[] { var1, var4 };
				var1 = new GFYXEFQY(true, 2, var5);
			}
		}

		if (field835 != null) {
			if (client.field277 >= field843) {
				field835 = null;
			}

			if (client.field277 >= field842 && client.field277 < field843) {
				GFYXEFQY var6 = field835;
				var6.method354(field832 - field1347, field833 - field828, field834 - field1348);

				if (field1328 == 512) {
					var6.method352();
					var6.method352();
					var6.method352();
				} else if (field1328 == 1024) {
					var6.method352();
					var6.method352();
				} else if (field1328 == 1536) {
					var6.method352();
				}

				GFYXEFQY[] var7 = new GFYXEFQY[] { var1, var6 };
				var1 = new GFYXEFQY(true, 2, var7);

				if (field1328 == 512) {
					var6.method352();
				} else if (field1328 == 1024) {
					var6.method352();
					var6.method352();
				} else if (field1328 == 1536) {
					var6.method352();
					var6.method352();
					var6.method352();
				}

				var6.method354(field1347 - field832, field828 - field833, field1348 - field834);
			}
		}

		var1.field786 = true;
		return var1;
	}

	@ObfuscatedName("GPPDQFCV.a(LCKBTFRZM;I)V")
	public final void method367(CKBTFRZM arg0) {
		arg0.field92 = 0;
		field827 = arg0.method44();
		field820 = arg0.method44();
		field821 = null;
		field844 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method44();
			if (var3 == 0) {
				field841[var2] = 0;
			} else {
				int var4 = arg0.method44();
				field841[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field841[0] == 0xFFFF) {
					field821 = BXXPAJNW.method31(arg0.method46());
					break;
				}

				if (field841[var2] >= 512 && field841[var2] - 512 < PTCSWKBP.field1120) {
					int var5 = PTCSWKBP.method489(field841[var2] - 512).field1124;
					if (var5 != 0) {
						field844 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method44();
			if (var7 < 0 || var7 >= client.field458[var6].length) {
				var7 = 0;
			}

			field840[var6] = var7;
		}

		field1303 = arg0.method46();
		if (field1303 == 0xFFFF) {
			field1303 = -1;
		}

		field1304 = arg0.method46();
		if (field1304 == 0xFFFF) {
			field1304 = -1;
		}

		field1353 = arg0.method46();
		if (field1353 == 0xFFFF) {
			field1353 = -1;
		}

		field1354 = arg0.method46();
		if (field1354 == 0xFFFF) {
			field1354 = -1;
		}

		field1355 = arg0.method46();
		if (field1355 == 0xFFFF) {
			field1355 = -1;
		}

		field1356 = arg0.method46();
		if (field1356 == 0xFFFF) {
			field1356 = -1;
		}

		field1333 = arg0.method46();
		if (field1333 == 0xFFFF) {
			field1333 = -1;
		}

		field839 = IGDXKDJL.method392(IGDXKDJL.method389(arg0.method50()));
		field829 = arg0.method44();
		field831 = arg0.method46();
		field836 = true;
		field822 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field822 <<= 4;
			if (field841[var8] >= 256) {
				field822 += field841[var8] - 256;
			}
		}

		if (field841[0] >= 256) {
			field822 += field841[0] - 256 >> 4;
		}

		if (field841[1] >= 256) {
			field822 += field841[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field822 <<= 3;
			field822 += field840[var9];
		}

		field822 <<= 1;
		field822 += field827;
	}

	@ObfuscatedName("GPPDQFCV.b(I)Z")
	public final boolean method368() {
		if (!field836) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("GPPDQFCV.d(I)LGFYXEFQY;")
	public final GFYXEFQY method369() {
		if (field821 != null) {
			int var1 = -1;
			if (field1320 >= 0 && field1323 == 0) {
				var1 = KIRTNGZJ.field1015[field1320].field1017[field1321];
			} else if (field1350 >= 0) {
				var1 = KIRTNGZJ.field1015[field1350].field1017[field1351];
			}

			return field821.method26(var1, -1, null);
		}

		long var3 = field822;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1320 >= 0 && field1323 == 0) {
			KIRTNGZJ var9 = KIRTNGZJ.field1015[field1320];
			var5 = var9.field1017[field1321];

			if (field1350 >= 0 && field1350 != field1303) {
				var6 = KIRTNGZJ.field1015[field1350].field1017[field1351];
			}

			if (var9.field1024 >= 0) {
				var7 = var9.field1024;
				var3 += var7 - field841[5] << 40;
			}

			if (var9.field1025 >= 0) {
				var8 = var9.field1025;
				var3 += var8 - field841[3] << 48;
			}
		} else if (field1350 >= 0) {
			var5 = KIRTNGZJ.field1015[field1350].field1017[field1351];
		}

		GFYXEFQY var10 = (GFYXEFQY) field838.method1(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field841[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !IDSYSMIG.field909[var13 - 256].method384()) {
					var11 = true;
				}

				if (var13 >= 512 && !PTCSWKBP.method489(var13 - 512).method500(field827)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field837 != -1L) {
					var10 = (GFYXEFQY) field838.method1(field837);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			GFYXEFQY[] var14 = new GFYXEFQY[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field841[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					GFYXEFQY var18 = IDSYSMIG.field909[var17 - 256].method385();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					GFYXEFQY var19 = PTCSWKBP.method489(var17 - 512).method495(field827);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new GFYXEFQY(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field840[var20] != 0) {
					var10.method355(client.field458[var20][0], client.field458[var20][field840[var20]]);

					if (var20 == 1) {
						var10.method355(client.field352[0], client.field352[field840[var20]]);
					}
				}
			}

			var10.method348();
			var10.method358(64, 850, -30, -50, -30, true);
			field838.method2(var3, var10);
			field837 = var3;
		}

		if (field830) {
			return var10;
		}

		GFYXEFQY var21 = GFYXEFQY.field748;
		var21.method343(ERVJQNCY.method282(var5) & ERVJQNCY.method282(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method350(KIRTNGZJ.field1015[field1320].field1021, var5, var6);
		} else if (var5 != -1) {
			var21.method349(var5);
		}

		var21.method345();
		var21.field785 = null;
		var21.field784 = null;
		return var21;
	}
}
