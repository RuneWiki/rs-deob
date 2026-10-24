package deob;

@ObfuscatedName("AHUILQJH")
public final class AHUILQJH extends ZGJLFNLC {

	@ObfuscatedName("AHUILQJH.sb")
	public long field2 = -1L;

	@ObfuscatedName("AHUILQJH.tb")
	public int[] field3 = new int[5];

	@ObfuscatedName("AHUILQJH.Db")
	public boolean field12 = false;

	@ObfuscatedName("AHUILQJH.Fb")
	public int[] field14 = new int[12];

	@ObfuscatedName("AHUILQJH.Gb")
	public boolean field15 = false;

	@ObfuscatedName("AHUILQJH.qb")
	public static CZWVRQJW field1 = new CZWVRQJW(260);

	@ObfuscatedName("AHUILQJH.Bb")
	public int field10;

	@ObfuscatedName("AHUILQJH.Cb")
	public int field11;

	@ObfuscatedName("AHUILQJH.Eb")
	public int field13;

	@ObfuscatedName("AHUILQJH.Kb")
	public int field18;

	@ObfuscatedName("AHUILQJH.Mb")
	public int field20;

	@ObfuscatedName("AHUILQJH.Nb")
	public int field21;

	@ObfuscatedName("AHUILQJH.Ob")
	public int field22;

	@ObfuscatedName("AHUILQJH.Pb")
	public int field23;

	@ObfuscatedName("AHUILQJH.Qb")
	public int field24;

	@ObfuscatedName("AHUILQJH.Rb")
	public int field25;

	@ObfuscatedName("AHUILQJH.ub")
	public int field4;

	@ObfuscatedName("AHUILQJH.vb")
	public int field5;

	@ObfuscatedName("AHUILQJH.wb")
	public int field6;

	@ObfuscatedName("AHUILQJH.zb")
	public int field8;

	@ObfuscatedName("AHUILQJH.Ab")
	public int field9;

	@ObfuscatedName("AHUILQJH.Lb")
	public long field19;

	@ObfuscatedName("AHUILQJH.xb")
	public HEQROJXW field7;

	@ObfuscatedName("AHUILQJH.Jb")
	public ZNUYRYPY field17;

	@ObfuscatedName("AHUILQJH.Ib")
	public String field16;

	@ObfuscatedName("AHUILQJH.a(I)LHEQROJXW;")
	public final HEQROJXW method1() {
		if (!field15) {
			return null;
		}

		HEQROJXW var1 = method2();
		if (var1 == null) {
			return null;
		}

		field1404 = var1.field627;
		var1.field750 = true;

		if (field12) {
			return var1;
		}

		if (field1409 != -1 && field1410 != -1) {
			UIVLSYQW var2 = UIVLSYQW.field1152[field1409];
			HEQROJXW var3 = var2.method539();
			if (var3 != null) {
				HEQROJXW var4 = new HEQROJXW(false, true, UEUSJYYO.method536(field1410), var3);
				var4.method335(-field1413, 0, 0);
				var4.method329();
				var4.method330(var2.field1156.field1364[field1410]);
				var4.field749 = null;
				var4.field748 = null;

				if (var2.field1159 != 128 || var2.field1160 != 128) {
					var4.method338(var2.field1160, var2.field1159, var2.field1159);
				}

				var4.method339(var2.field1162 + 64, var2.field1163 + 850, -30, -50, -30, true);
				HEQROJXW[] var5 = new HEQROJXW[] { var1, var4 };
				var1 = new HEQROJXW(true, 2, var5);
			}
		}

		if (field7 != null) {
			if (client.field221 >= field9) {
				field7 = null;
			}

			if (client.field221 >= field8 && client.field221 < field9) {
				HEQROJXW var6 = field7;
				var6.method335(field5 - field13, field6 - field1392, field4 - field1391);

				if (field1434 == 512) {
					var6.method333();
					var6.method333();
					var6.method333();
				} else if (field1434 == 1024) {
					var6.method333();
					var6.method333();
				} else if (field1434 == 1536) {
					var6.method333();
				}

				HEQROJXW[] var7 = new HEQROJXW[] { var1, var6 };
				var1 = new HEQROJXW(true, 2, var7);

				if (field1434 == 512) {
					var6.method333();
				} else if (field1434 == 1024) {
					var6.method333();
					var6.method333();
				} else if (field1434 == 1536) {
					var6.method333();
					var6.method333();
					var6.method333();
				}

				var6.method335(field13 - field5, field1392 - field6, field1391 - field4);
			}
		}

		var1.field750 = true;
		return var1;
	}

	@ObfuscatedName("AHUILQJH.a(B)LHEQROJXW;")
	public final HEQROJXW method2() {
		if (field17 != null) {
			int var1 = -1;
			if (field1436 >= 0 && field1439 == 0) {
				var1 = XKEHWKFH.field1362[field1436].field1364[field1437];
			} else if (field1395 >= 0) {
				var1 = XKEHWKFH.field1362[field1395].field1364[field1396];
			}

			return field17.method586(null, -1, var1);
		}

		long var3 = field19;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1436 >= 0 && field1439 == 0) {
			XKEHWKFH var9 = XKEHWKFH.field1362[field1436];
			var5 = var9.field1364[field1437];

			if (field1395 >= 0 && field1402 != field1395) {
				var6 = XKEHWKFH.field1362[field1395].field1364[field1396];
			}

			if (var9.field1371 >= 0) {
				var7 = var9.field1371;
				var3 += var7 - field14[5] << 40;
			}

			if (var9.field1372 >= 0) {
				var8 = var9.field1372;
				var3 += var8 - field14[3] << 48;
			}
		} else if (field1395 >= 0) {
			var5 = XKEHWKFH.field1362[field1395].field1364[field1396];
		}

		HEQROJXW var10 = (HEQROJXW) field1.method152(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field14[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !YMQGRGSI.field1381[var13 - 256].method570()) {
					var11 = true;
				}

				if (var13 >= 512 && !KNYKYROC.method380(var13 - 512).method386(field24)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field2 != -1L) {
					var10 = (HEQROJXW) field1.method152(field2);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			HEQROJXW[] var14 = new HEQROJXW[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field14[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					HEQROJXW var18 = YMQGRGSI.field1381[var17 - 256].method571();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					HEQROJXW var19 = KNYKYROC.method380(var17 - 512).method376(field24);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new HEQROJXW(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field3[var20] != 0) {
					var10.method336(client.field220[var20][0], client.field220[var20][field3[var20]]);

					if (var20 == 1) {
						var10.method336(client.field376[0], client.field376[field3[var20]]);
					}
				}
			}

			var10.method329();
			var10.method339(64, 850, -30, -50, -30, true);
			field1.method153(var10, var3);
			field2 = var3;
		}

		if (field12) {
			return var10;
		}

		HEQROJXW var21 = HEQROJXW.field712;
		var21.method324(UEUSJYYO.method536(var5) & UEUSJYYO.method536(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method331(var5, XKEHWKFH.field1362[field1436].field1368, var6);
		} else if (var5 != -1) {
			var21.method330(var5);
		}

		var21.method326();
		var21.field749 = null;
		var21.field748 = null;
		return var21;
	}

	@ObfuscatedName("AHUILQJH.a(Z)Z")
	public final boolean method3() {
		if (!field15) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("AHUILQJH.a(LLDILQFVA;I)V")
	public final void method4(LDILQFVA arg0) {
		arg0.field902 = 0;
		field24 = arg0.method402();
		field18 = arg0.method402();
		field17 = null;
		field11 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method402();
			if (var3 == 0) {
				field14[var2] = 0;
			} else {
				int var4 = arg0.method402();
				field14[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field14[0] == 0xFFFF) {
					field17 = ZNUYRYPY.method589(arg0.method404());
					break;
				}

				if (field14[var2] >= 512 && field14[var2] - 512 < KNYKYROC.field853) {
					int var5 = KNYKYROC.method380(field14[var2] - 512).field870;
					if (var5 != 0) {
						field11 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method402();
			if (var7 < 0 || var7 >= client.field220[var6].length) {
				var7 = 0;
			}

			field3[var6] = var7;
		}

		field1402 = arg0.method404();
		if (field1402 == 0xFFFF) {
			field1402 = -1;
		}

		field1403 = arg0.method404();
		if (field1403 == 0xFFFF) {
			field1403 = -1;
		}

		field1423 = arg0.method404();
		if (field1423 == 0xFFFF) {
			field1423 = -1;
		}

		field1424 = arg0.method404();
		if (field1424 == 0xFFFF) {
			field1424 = -1;
		}

		field1425 = arg0.method404();
		if (field1425 == 0xFFFF) {
			field1425 = -1;
		}

		field1426 = arg0.method404();
		if (field1426 == 0xFFFF) {
			field1426 = -1;
		}

		field1427 = arg0.method404();
		if (field1427 == 0xFFFF) {
			field1427 = -1;
		}

		field16 = FBIFPAXF.method272(FBIFPAXF.method269(arg0.method408()));
		field10 = arg0.method402();
		field25 = arg0.method404();
		field15 = true;
		field19 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field19 <<= 4;
			if (field14[var8] >= 256) {
				field19 += field14[var8] - 256;
			}
		}

		if (field14[0] >= 256) {
			field19 += field14[0] - 256 >> 4;
		}

		if (field14[1] >= 256) {
			field19 += field14[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field19 <<= 3;
			field19 += field3[var9];
		}

		field19 <<= 1;
		field19 += field24;
	}

	@ObfuscatedName("AHUILQJH.b(B)LHEQROJXW;")
	public final HEQROJXW method5() {
		if (!field15) {
			return null;
		}

		if (field17 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field14[var2];
				if (var3 >= 256 && var3 < 512 && !YMQGRGSI.field1381[var3 - 256].method572()) {
					var1 = true;
				}

				if (var3 >= 512 && !KNYKYROC.method380(var3 - 512).method385(field24)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			HEQROJXW[] var4 = new HEQROJXW[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field14[var6];
				if (var7 >= 256 && var7 < 512) {
					HEQROJXW var8 = YMQGRGSI.field1381[var7 - 256].method573();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					HEQROJXW var9 = KNYKYROC.method380(var7 - 512).method378(field24);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			HEQROJXW var10 = new HEQROJXW(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field3[var11] != 0) {
					var10.method336(client.field220[var11][0], client.field220[var11][field3[var11]]);

					if (var11 == 1) {
						var10.method336(client.field376[0], client.field376[field3[var11]]);
					}
				}
			}

			return var10;
		}

		return field17.method590();
	}
}
