package deob;

@ObfuscatedName("ZATRZGAA")
public final class ZATRZGAA extends OKXNBSEJ {

	@ObfuscatedName("ZATRZGAA.sb")
	public int[] field1373 = new int[12];

	@ObfuscatedName("ZATRZGAA.Gb")
	public long field1386 = -1L;

	@ObfuscatedName("ZATRZGAA.Mb")
	public int[] field1391 = new int[5];

	@ObfuscatedName("ZATRZGAA.Ob")
	public int field1393 = -1;

	@ObfuscatedName("ZATRZGAA.Rb")
	public boolean field1395 = false;

	@ObfuscatedName("ZATRZGAA.Tb")
	public int field1397 = -1;

	@ObfuscatedName("ZATRZGAA.Ub")
	public boolean field1398 = false;

	@ObfuscatedName("ZATRZGAA.Bb")
	public static BVBRKPZH field1381 = new BVBRKPZH(260);

	@ObfuscatedName("ZATRZGAA.tb")
	public int field1374;

	@ObfuscatedName("ZATRZGAA.ub")
	public int field1375;

	@ObfuscatedName("ZATRZGAA.vb")
	public int field1376;

	@ObfuscatedName("ZATRZGAA.wb")
	public int field1377;

	@ObfuscatedName("ZATRZGAA.xb")
	public int field1378;

	@ObfuscatedName("ZATRZGAA.yb")
	public int field1379;

	@ObfuscatedName("ZATRZGAA.Cb")
	public int field1382;

	@ObfuscatedName("ZATRZGAA.Db")
	public int field1383;

	@ObfuscatedName("ZATRZGAA.Eb")
	public int field1384;

	@ObfuscatedName("ZATRZGAA.Fb")
	public int field1385;

	@ObfuscatedName("ZATRZGAA.Hb")
	public int field1387;

	@ObfuscatedName("ZATRZGAA.Ib")
	public int field1388;

	@ObfuscatedName("ZATRZGAA.Jb")
	public int field1389;

	@ObfuscatedName("ZATRZGAA.Pb")
	public int field1394;

	@ObfuscatedName("ZATRZGAA.Nb")
	public long field1392;

	@ObfuscatedName("ZATRZGAA.Kb")
	public IEHKDFMR field1390;

	@ObfuscatedName("ZATRZGAA.zb")
	public ZLQCXMFK field1380;

	@ObfuscatedName("ZATRZGAA.Sb")
	public String field1396;

	@ObfuscatedName("ZATRZGAA.a(I)LIEHKDFMR;")
	public final IEHKDFMR method24() {
		if (!field1398) {
			return null;
		}

		IEHKDFMR var1 = method506();
		if (var1 == null) {
			return null;
		}

		field912 = var1.field605;
		var1.field695 = true;

		if (field1395) {
			return var1;
		}

		if (field921 != -1 && field922 != -1) {
			SDNQJNMP var2 = SDNQJNMP.field1127[field921];
			IEHKDFMR var3 = var2.method396();
			if (var3 != null) {
				IEHKDFMR var4 = new IEHKDFMR(false, NXEWQQJO.method337(field922), var3, true);
				var4.method280(0, 0, -field925);
				var4.method274();
				var4.method275(var2.field1131.field1275[field922]);
				var4.field694 = null;
				var4.field693 = null;

				if (var2.field1134 != 128 || var2.field1135 != 128) {
					var4.method283(var2.field1134, var2.field1135, var2.field1134);
				}

				var4.method284(var2.field1137 + 64, var2.field1138 + 850, -30, -50, -30, true);
				IEHKDFMR[] var5 = new IEHKDFMR[] { var1, var4 };
				var1 = new IEHKDFMR(true, 2, var5);
			}
		}

		if (field1390 != null) {
			if (client.field228 >= field1383) {
				field1390 = null;
			}

			if (client.field228 >= field1382 && client.field228 < field1383) {
				IEHKDFMR var6 = field1390;
				var6.method280(field1387 - field937, field1389 - field938, field1388 - field1384);

				if (field933 == 512) {
					var6.method278();
					var6.method278();
					var6.method278();
				} else if (field933 == 1024) {
					var6.method278();
					var6.method278();
				} else if (field933 == 1536) {
					var6.method278();
				}

				IEHKDFMR[] var7 = new IEHKDFMR[] { var1, var6 };
				var1 = new IEHKDFMR(true, 2, var7);

				if (field933 == 512) {
					var6.method278();
				} else if (field933 == 1024) {
					var6.method278();
					var6.method278();
				} else if (field933 == 1536) {
					var6.method278();
					var6.method278();
					var6.method278();
				}

				var6.method280(field937 - field1387, field938 - field1389, field1384 - field1388);
			}
		}

		var1.field695 = true;
		return var1;
	}

	@ObfuscatedName("ZATRZGAA.c(I)LIEHKDFMR;")
	public final IEHKDFMR method504() {
		if (!field1398) {
			return null;
		}

		if (field1380 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1373[var2];
				if (var3 >= 256 && var3 < 512 && !QRYQWAHS.field1032[var3 - 256].method377()) {
					var1 = true;
				}

				if (var3 >= 512 && !VXCJHHIE.method447(var3 - 512).method449(field1394)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			IEHKDFMR[] var4 = new IEHKDFMR[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1373[var6];
				if (var7 >= 256 && var7 < 512) {
					IEHKDFMR var8 = QRYQWAHS.field1032[var7 - 256].method378();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					IEHKDFMR var9 = VXCJHHIE.method447(var7 - 512).method452(field1394);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			IEHKDFMR var10 = new IEHKDFMR(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1391[var11] != 0) {
					var10.method281(client.field219[var11][0], client.field219[var11][field1391[var11]]);

					if (var11 == 1) {
						var10.method281(client.field407[0], client.field407[field1391[var11]]);
					}
				}
			}

			return var10;
		}

		return field1380.method507();
	}

	@ObfuscatedName("ZATRZGAA.a(LEMWAMCXW;I)V")
	public final void method505(EMWAMCXW arg0) {
		arg0.field617 = 0;
		field1394 = arg0.method217();
		field1397 = arg0.method218();
		field1393 = arg0.method218();
		field1380 = null;
		field1379 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method217();
			if (var3 == 0) {
				field1373[var2] = 0;
			} else {
				int var4 = arg0.method217();
				field1373[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1373[0] == 0xFFFF) {
					field1380 = ZLQCXMFK.method509(arg0.method219());
					break;
				}

				if (field1373[var2] >= 512 && field1373[var2] - 512 < VXCJHHIE.field1269) {
					int var5 = VXCJHHIE.method447(field1373[var2] - 512).field1271;
					if (var5 != 0) {
						field1379 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method217();
			if (var7 < 0 || var7 >= client.field219[var6].length) {
				var7 = 0;
			}

			field1391[var6] = var7;
		}

		field919 = arg0.method219();
		if (field919 == 0xFFFF) {
			field919 = -1;
		}

		field920 = arg0.method219();
		if (field920 == 0xFFFF) {
			field920 = -1;
		}

		field915 = arg0.method219();
		if (field915 == 0xFFFF) {
			field915 = -1;
		}

		field916 = arg0.method219();
		if (field916 == 0xFFFF) {
			field916 = -1;
		}

		field917 = arg0.method219();
		if (field917 == 0xFFFF) {
			field917 = -1;
		}

		field918 = arg0.method219();
		if (field918 == 0xFFFF) {
			field918 = -1;
		}

		field935 = arg0.method219();
		if (field935 == 0xFFFF) {
			field935 = -1;
		}

		field1396 = WAQVJSXE.method465(WAQVJSXE.method462(arg0.method223()));
		field1385 = arg0.method217();
		field1378 = arg0.method219();
		field1398 = true;
		field1392 = 0L;
		int var8 = field1373[5];
		int var9 = field1373[9];
		field1373[5] = var9;
		field1373[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1392 <<= 4;
			if (field1373[var10] >= 256) {
				field1392 += field1373[var10] - 256;
			}
		}

		if (field1373[0] >= 256) {
			field1392 += field1373[0] - 256 >> 4;
		}

		if (field1373[1] >= 256) {
			field1392 += field1373[1] - 256 >> 8;
		}

		field1373[5] = var8;
		field1373[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1392 <<= 3;
			field1392 += field1391[var11];
		}

		field1392 <<= 1;
		field1392 += field1394;
	}

	@ObfuscatedName("ZATRZGAA.d(I)LIEHKDFMR;")
	public final IEHKDFMR method506() {
		if (field1380 != null) {
			int var1 = -1;
			if (field942 >= 0 && field945 == 0) {
				var1 = VYXELYSX.field1273[field942].field1275[field943];
			} else if (field955 >= 0) {
				var1 = VYXELYSX.field1273[field955].field1275[field956];
			}

			return field1380.method512(-1, null, var1);
		}

		long var3 = field1392;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field942 >= 0 && field945 == 0) {
			VYXELYSX var9 = VYXELYSX.field1273[field942];
			var5 = var9.field1275[field943];

			if (field955 >= 0 && field955 != field919) {
				var6 = VYXELYSX.field1273[field955].field1275[field956];
			}

			if (var9.field1282 >= 0) {
				var7 = var9.field1282;
				var3 += var7 - field1373[5] << 40;
			}

			if (var9.field1283 >= 0) {
				var8 = var9.field1283;
				var3 += var8 - field1373[3] << 48;
			}
		} else if (field955 >= 0) {
			var5 = VYXELYSX.field1273[field955].field1275[field956];
		}

		IEHKDFMR var10 = (IEHKDFMR) field1381.method25(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1373[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !QRYQWAHS.field1032[var13 - 256].method375()) {
					var11 = true;
				}

				if (var13 >= 512 && !VXCJHHIE.method447(var13 - 512).method445(field1394)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1386 != -1L) {
					var10 = (IEHKDFMR) field1381.method25(field1386);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			IEHKDFMR[] var14 = new IEHKDFMR[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1373[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					IEHKDFMR var18 = QRYQWAHS.field1032[var17 - 256].method376();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					IEHKDFMR var19 = VXCJHHIE.method447(var17 - 512).method450(field1394);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new IEHKDFMR(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1391[var20] != 0) {
					var10.method281(client.field219[var20][0], client.field219[var20][field1391[var20]]);

					if (var20 == 1) {
						var10.method281(client.field407[0], client.field407[field1391[var20]]);
					}
				}
			}

			var10.method274();
			var10.method284(64, 850, -30, -50, -30, true);
			field1381.method26(var3, var10);
			field1386 = var3;
		}

		if (field1395) {
			return var10;
		}

		IEHKDFMR var21 = IEHKDFMR.field658;
		var21.method269(NXEWQQJO.method337(var5) & NXEWQQJO.method337(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method276(var5, var6, VYXELYSX.field1273[field942].field1279);
		} else if (var5 != -1) {
			var21.method275(var5);
		}

		var21.method271();
		var21.field694 = null;
		var21.field693 = null;
		return var21;
	}

	@ObfuscatedName("ZATRZGAA.a(Z)Z")
	public final boolean method342() {
		if (!field1398) {
			return false;
		}

		return true;
	}
}
