package deob;

@ObfuscatedName("HHCKFJEO")
public final class HHCKFJEO extends BTOCNVPA {

	@ObfuscatedName("HHCKFJEO.sb")
	public int[] field673 = new int[5];

	@ObfuscatedName("HHCKFJEO.ub")
	public int field675 = -1;

	@ObfuscatedName("HHCKFJEO.vb")
	public long field676 = -1L;

	@ObfuscatedName("HHCKFJEO.wb")
	public boolean field677 = false;

	@ObfuscatedName("HHCKFJEO.Bb")
	public int field682 = -1;

	@ObfuscatedName("HHCKFJEO.Pb")
	public int[] field694 = new int[12];

	@ObfuscatedName("HHCKFJEO.Sb")
	public boolean field697 = false;

	@ObfuscatedName("HHCKFJEO.Eb")
	public static RPWOWYDL field685 = new RPWOWYDL(260);

	@ObfuscatedName("HHCKFJEO.tb")
	public int field674;

	@ObfuscatedName("HHCKFJEO.xb")
	public int field678;

	@ObfuscatedName("HHCKFJEO.yb")
	public int field679;

	@ObfuscatedName("HHCKFJEO.zb")
	public int field680;

	@ObfuscatedName("HHCKFJEO.Db")
	public int field684;

	@ObfuscatedName("HHCKFJEO.Hb")
	public int field686;

	@ObfuscatedName("HHCKFJEO.Ib")
	public int field687;

	@ObfuscatedName("HHCKFJEO.Jb")
	public int field688;

	@ObfuscatedName("HHCKFJEO.Kb")
	public int field689;

	@ObfuscatedName("HHCKFJEO.Lb")
	public int field690;

	@ObfuscatedName("HHCKFJEO.Mb")
	public int field691;

	@ObfuscatedName("HHCKFJEO.Nb")
	public int field692;

	@ObfuscatedName("HHCKFJEO.Ob")
	public int field693;

	@ObfuscatedName("HHCKFJEO.Qb")
	public int field695;

	@ObfuscatedName("HHCKFJEO.Cb")
	public long field683;

	@ObfuscatedName("HHCKFJEO.Rb")
	public HEKJNUPL field696;

	@ObfuscatedName("HHCKFJEO.Ab")
	public SNMMQNPZ field681;

	@ObfuscatedName("HHCKFJEO.Tb")
	public String field698;

	@ObfuscatedName("HHCKFJEO.a(I)LSNMMQNPZ;")
	public final SNMMQNPZ method275() {
		if (!field697) {
			return null;
		}

		if (field696 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field694[var2];
				if (var3 >= 256 && var3 < 512 && !CSHXCUHU.field554[var3 - 256].method173()) {
					var1 = true;
				}

				if (var3 >= 512 && !JKSNDEQS.method293(var3 - 512).method285(field695)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			SNMMQNPZ[] var4 = new SNMMQNPZ[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field694[var6];
				if (var7 >= 256 && var7 < 512) {
					SNMMQNPZ var8 = CSHXCUHU.field554[var7 - 256].method174();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					SNMMQNPZ var9 = JKSNDEQS.method293(var7 - 512).method294(field695);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			SNMMQNPZ var10 = new SNMMQNPZ(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field673[var11] != 0) {
					var10.method432(client.field344[var11][0], client.field344[var11][field673[var11]]);

					if (var11 == 1) {
						var10.method432(client.field465[0], client.field465[field673[var11]]);
					}
				}
			}

			return var10;
		}

		return field696.method270();
	}

	@ObfuscatedName("HHCKFJEO.a(Z)Z")
	public final boolean method20() {
		if (!field697) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("HHCKFJEO.a(B)LSNMMQNPZ;")
	public final SNMMQNPZ method175() {
		if (!field697) {
			return null;
		}

		SNMMQNPZ var1 = method276();
		if (var1 == null) {
			return null;
		}

		field78 = var1.field1400;
		var1.field1186 = true;

		if (field677) {
			return var1;
		}

		if (field55 != -1 && field56 != -1) {
			NGIGHQOG var2 = NGIGHQOG.field986[field55];
			SNMMQNPZ var3 = var2.method351();
			if (var3 != null) {
				SNMMQNPZ var4 = new SNMMQNPZ(var3, false, true, NLIOLBXV.method356(field56));
				var4.method431(0, -field59, 0);
				var4.method425();
				var4.method426(var2.field990.field1483[field56]);
				var4.field1185 = null;
				var4.field1184 = null;

				if (var2.field993 != 128 || var2.field994 != 128) {
					var4.method434(var2.field993, var2.field993, var2.field994);
				}

				var4.method435(var2.field996 + 64, var2.field997 + 850, -30, -50, -30, true);
				SNMMQNPZ[] var5 = new SNMMQNPZ[] { var1, var4 };
				var1 = new SNMMQNPZ(true, 2, var5);
			}
		}

		if (field681 != null) {
			if (client.field402 >= field692) {
				field681 = null;
			}

			if (client.field402 >= field691 && client.field402 < field692) {
				SNMMQNPZ var6 = field681;
				var6.method431(field678 - field96, field679 - field684, field680 - field97);

				if (field69 == 512) {
					var6.method429();
					var6.method429();
					var6.method429();
				} else if (field69 == 1024) {
					var6.method429();
					var6.method429();
				} else if (field69 == 1536) {
					var6.method429();
				}

				SNMMQNPZ[] var7 = new SNMMQNPZ[] { var1, var6 };
				var1 = new SNMMQNPZ(true, 2, var7);

				if (field69 == 512) {
					var6.method429();
				} else if (field69 == 1024) {
					var6.method429();
					var6.method429();
				} else if (field69 == 1536) {
					var6.method429();
					var6.method429();
					var6.method429();
				}

				var6.method431(field96 - field678, field684 - field679, field97 - field680);
			}
		}

		var1.field1186 = true;
		return var1;
	}

	@ObfuscatedName("HHCKFJEO.c(B)LSNMMQNPZ;")
	public final SNMMQNPZ method276() {
		if (field696 != null) {
			int var1 = -1;
			if (field84 >= 0 && field87 == 0) {
				var1 = ZGXCNUJM.field1481[field84].field1483[field85];
			} else if (field45 >= 0) {
				var1 = ZGXCNUJM.field1481[field45].field1483[field46];
			}

			return field696.method268(var1, null, -1);
		}

		long var3 = field683;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field84 >= 0 && field87 == 0) {
			ZGXCNUJM var9 = ZGXCNUJM.field1481[field84];
			var5 = var9.field1483[field85];

			if (field45 >= 0 && field62 != field45) {
				var6 = ZGXCNUJM.field1481[field45].field1483[field46];
			}

			if (var9.field1490 >= 0) {
				var7 = var9.field1490;
				var3 += var7 - field694[5] << 40;
			}

			if (var9.field1491 >= 0) {
				var8 = var9.field1491;
				var3 += var8 - field694[3] << 48;
			}
		} else if (field45 >= 0) {
			var5 = ZGXCNUJM.field1481[field45].field1483[field46];
		}

		SNMMQNPZ var10 = (SNMMQNPZ) field685.method401(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field694[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !CSHXCUHU.field554[var13 - 256].method171()) {
					var11 = true;
				}

				if (var13 >= 512 && !JKSNDEQS.method293(var13 - 512).method296(field695)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field676 != -1L) {
					var10 = (SNMMQNPZ) field685.method401(field676);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			SNMMQNPZ[] var14 = new SNMMQNPZ[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field694[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					SNMMQNPZ var18 = CSHXCUHU.field554[var17 - 256].method172();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					SNMMQNPZ var19 = JKSNDEQS.method293(var17 - 512).method291(field695);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new SNMMQNPZ(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field673[var20] != 0) {
					var10.method432(client.field344[var20][0], client.field344[var20][field673[var20]]);

					if (var20 == 1) {
						var10.method432(client.field465[0], client.field465[field673[var20]]);
					}
				}
			}

			var10.method425();
			var10.method435(64, 850, -30, -50, -30, true);
			field685.method402(var3, var10);
			field676 = var3;
		}

		if (field677) {
			return var10;
		}

		SNMMQNPZ var21 = SNMMQNPZ.field1148;
		var21.method420(var10, NLIOLBXV.method356(var5) & NLIOLBXV.method356(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method427(var6, ZGXCNUJM.field1481[field84].field1487, var5);
		} else if (var5 != -1) {
			var21.method426(var5);
		}

		var21.method422();
		var21.field1185 = null;
		var21.field1184 = null;
		return var21;
	}

	@ObfuscatedName("HHCKFJEO.a(LDNRIFKTO;I)V")
	public final void method277(DNRIFKTO arg0) {
		arg0.field563 = 0;
		field695 = arg0.method189();
		field682 = arg0.method190();
		field675 = arg0.method190();
		field696 = null;
		field674 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method189();
			if (var3 == 0) {
				field694[var2] = 0;
			} else {
				int var4 = arg0.method189();
				field694[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field694[0] == 0xFFFF) {
					field696 = HEKJNUPL.method273(arg0.method191());
					break;
				}

				if (field694[var2] >= 512 && field694[var2] - 512 < JKSNDEQS.field768) {
					int var5 = JKSNDEQS.method293(field694[var2] - 512).field734;
					if (var5 != 0) {
						field674 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method189();
			if (var7 < 0 || var7 >= client.field344[var6].length) {
				var7 = 0;
			}

			field673[var6] = var7;
		}

		field62 = arg0.method191();
		if (field62 == 0xFFFF) {
			field62 = -1;
		}

		field63 = arg0.method191();
		if (field63 == 0xFFFF) {
			field63 = -1;
		}

		field51 = arg0.method191();
		if (field51 == 0xFFFF) {
			field51 = -1;
		}

		field52 = arg0.method191();
		if (field52 == 0xFFFF) {
			field52 = -1;
		}

		field53 = arg0.method191();
		if (field53 == 0xFFFF) {
			field53 = -1;
		}

		field54 = arg0.method191();
		if (field54 == 0xFFFF) {
			field54 = -1;
		}

		field94 = arg0.method191();
		if (field94 == 0xFFFF) {
			field94 = -1;
		}

		field698 = JDMIWTSP.method282(JDMIWTSP.method279(arg0.method195()));
		field693 = arg0.method189();
		field686 = arg0.method191();
		field697 = true;
		field683 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field683 <<= 4;
			if (field694[var8] >= 256) {
				field683 += field694[var8] - 256;
			}
		}

		if (field694[0] >= 256) {
			field683 += field694[0] - 256 >> 4;
		}

		if (field694[1] >= 256) {
			field683 += field694[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field683 <<= 3;
			field683 += field673[var9];
		}

		field683 <<= 1;
		field683 += field695;
	}
}
