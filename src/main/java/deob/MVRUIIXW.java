package deob;

@ObfuscatedName("MVRUIIXW")
public final class MVRUIIXW extends ZJNNOVLJ {

	@ObfuscatedName("MVRUIIXW.tb")
	public boolean field862 = false;

	@ObfuscatedName("MVRUIIXW.Ab")
	public long field866 = -1L;

	@ObfuscatedName("MVRUIIXW.Hb")
	public int[] field871 = new int[5];

	@ObfuscatedName("MVRUIIXW.Ib")
	public int field872 = -1;

	@ObfuscatedName("MVRUIIXW.Kb")
	public int field873 = -1;

	@ObfuscatedName("MVRUIIXW.Qb")
	public boolean field879 = false;

	@ObfuscatedName("MVRUIIXW.Rb")
	public int[] field880 = new int[12];

	@ObfuscatedName("MVRUIIXW.zb")
	public static ACKKZISC field865 = new ACKKZISC(260);

	@ObfuscatedName("MVRUIIXW.ob")
	public int field857;

	@ObfuscatedName("MVRUIIXW.pb")
	public int field858;

	@ObfuscatedName("MVRUIIXW.qb")
	public int field859;

	@ObfuscatedName("MVRUIIXW.rb")
	public int field860;

	@ObfuscatedName("MVRUIIXW.wb")
	public int field864;

	@ObfuscatedName("MVRUIIXW.Cb")
	public int field867;

	@ObfuscatedName("MVRUIIXW.Db")
	public int field868;

	@ObfuscatedName("MVRUIIXW.Eb")
	public int field869;

	@ObfuscatedName("MVRUIIXW.Fb")
	public int field870;

	@ObfuscatedName("MVRUIIXW.Lb")
	public int field874;

	@ObfuscatedName("MVRUIIXW.Mb")
	public int field875;

	@ObfuscatedName("MVRUIIXW.Nb")
	public int field876;

	@ObfuscatedName("MVRUIIXW.Ob")
	public int field877;

	@ObfuscatedName("MVRUIIXW.Sb")
	public int field881;

	@ObfuscatedName("MVRUIIXW.Tb")
	public long field882;

	@ObfuscatedName("MVRUIIXW.Pb")
	public EKQCVRVG field878;

	@ObfuscatedName("MVRUIIXW.sb")
	public WRJMHIDY field861;

	@ObfuscatedName("MVRUIIXW.ub")
	public String field863;

	@ObfuscatedName("MVRUIIXW.b(I)LWRJMHIDY;")
	public final WRJMHIDY method309() {
		if (!field879) {
			return null;
		}

		if (field878 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field880[var2];
				if (var3 >= 256 && var3 < 512 && !MIIGCDHS.field850[var3 - 256].method307()) {
					var1 = true;
				}

				if (var3 >= 512 && !RXDLPXNX.method433(var3 - 512).method437(field864)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			WRJMHIDY[] var4 = new WRJMHIDY[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field880[var6];
				if (var7 >= 256 && var7 < 512) {
					WRJMHIDY var8 = MIIGCDHS.field850[var7 - 256].method308();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					WRJMHIDY var9 = RXDLPXNX.method433(var7 - 512).method428(field864);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			WRJMHIDY var10 = new WRJMHIDY(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field871[var11] != 0) {
					var10.method480(client.field131[var11][0], client.field131[var11][field871[var11]]);

					if (var11 == 1) {
						var10.method480(client.field476[0], client.field476[field871[var11]]);
					}
				}
			}

			return var10;
		}

		return field878.method200();
	}

	@ObfuscatedName("MVRUIIXW.a(Z)LWRJMHIDY;")
	public final WRJMHIDY method174() {
		if (!field879) {
			return null;
		}

		WRJMHIDY var1 = method310();
		if (var1 == null) {
			return null;
		}

		field1483 = var1.field635;
		var1.field1262 = true;

		if (field862) {
			return var1;
		}

		if (field1489 != -1 && field1490 != -1) {
			TGYZPJQJ var2 = TGYZPJQJ.field1121[field1489];
			WRJMHIDY var3 = var2.method444();
			if (var3 != null) {
				WRJMHIDY var4 = new WRJMHIDY(var3, true, false, OZAHMTPS.method338(field1490));
				var4.method479(0, 0, -field1493);
				var4.method473();
				var4.method474(var2.field1125.field834[field1490]);
				var4.field1261 = null;
				var4.field1260 = null;

				if (var2.field1128 != 128 || var2.field1129 != 128) {
					var4.method482(var2.field1128, var2.field1128, var2.field1129);
				}

				var4.method483(var2.field1131 + 64, var2.field1132 + 850, -30, -50, -30, true);
				WRJMHIDY[] var5 = new WRJMHIDY[] { var1, var4 };
				var1 = new WRJMHIDY(true, 2, var5);
			}
		}

		if (field861 != null) {
			if (client.field353 >= field877) {
				field861 = null;
			}

			if (client.field353 >= field876 && client.field353 < field877) {
				WRJMHIDY var6 = field861;
				var6.method479(field860 - field1456, field858 - field1455, field859 - field881);

				if (field1495 == 512) {
					var6.method477();
					var6.method477();
					var6.method477();
				} else if (field1495 == 1024) {
					var6.method477();
					var6.method477();
				} else if (field1495 == 1536) {
					var6.method477();
				}

				WRJMHIDY[] var7 = new WRJMHIDY[] { var1, var6 };
				var1 = new WRJMHIDY(true, 2, var7);

				if (field1495 == 512) {
					var6.method477();
				} else if (field1495 == 1024) {
					var6.method477();
					var6.method477();
				} else if (field1495 == 1536) {
					var6.method477();
					var6.method477();
					var6.method477();
				}

				var6.method479(field1456 - field860, field1455 - field858, field881 - field859);
			}
		}

		var1.field1262 = true;
		return var1;
	}

	@ObfuscatedName("MVRUIIXW.b(Z)LWRJMHIDY;")
	public final WRJMHIDY method310() {
		if (field878 != null) {
			int var1 = -1;
			if (field1496 >= 0 && field1499 == 0) {
				var1 = LZZHVUJR.field832[field1496].field834[field1497];
			} else if (field1484 >= 0) {
				var1 = LZZHVUJR.field832[field1484].field834[field1485];
			}

			return field878.method198(var1, -1, null);
		}

		long var3 = field882;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1496 >= 0 && field1499 == 0) {
			LZZHVUJR var9 = LZZHVUJR.field832[field1496];
			var5 = var9.field834[field1497];

			if (field1484 >= 0 && field1484 != field1464) {
				var6 = LZZHVUJR.field832[field1484].field834[field1485];
			}

			if (var9.field841 >= 0) {
				var7 = var9.field841;
				var3 += var7 - field880[5] << 40;
			}

			if (var9.field842 >= 0) {
				var8 = var9.field842;
				var3 += var8 - field880[3] << 48;
			}
		} else if (field1484 >= 0) {
			var5 = LZZHVUJR.field832[field1484].field834[field1485];
		}

		WRJMHIDY var10 = (WRJMHIDY) field865.method1(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field880[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !MIIGCDHS.field850[var13 - 256].method305()) {
					var11 = true;
				}

				if (var13 >= 512 && !RXDLPXNX.method433(var13 - 512).method431(field864)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field866 != -1L) {
					var10 = (WRJMHIDY) field865.method1(field866);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			WRJMHIDY[] var14 = new WRJMHIDY[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field880[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					WRJMHIDY var18 = MIIGCDHS.field850[var17 - 256].method306();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					WRJMHIDY var19 = RXDLPXNX.method433(var17 - 512).method438(field864);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new WRJMHIDY(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field871[var20] != 0) {
					var10.method480(client.field131[var20][0], client.field131[var20][field871[var20]]);

					if (var20 == 1) {
						var10.method480(client.field476[0], client.field476[field871[var20]]);
					}
				}
			}

			var10.method473();
			var10.method483(64, 850, -30, -50, -30, true);
			field865.method2(var3, var10);
			field866 = var3;
		}

		if (field862) {
			return var10;
		}

		WRJMHIDY var21 = WRJMHIDY.field1225;
		var21.method468(OZAHMTPS.method338(var5) & OZAHMTPS.method338(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method475(var5, LZZHVUJR.field832[field1496].field838, var6);
		} else if (var5 != -1) {
			var21.method474(var5);
		}

		var21.method470();
		var21.field1261 = null;
		var21.field1260 = null;
		return var21;
	}

	@ObfuscatedName("MVRUIIXW.a(B)Z")
	public final boolean method228() {
		if (!field879) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("MVRUIIXW.a(LRSWRPCHR;Z)V")
	public final void method311(RSWRPCHR arg0) {
		arg0.field1038 = 0;
		field864 = arg0.method388();
		field872 = arg0.method389();
		field873 = arg0.method389();
		field878 = null;
		field874 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method388();
			if (var3 == 0) {
				field880[var2] = 0;
			} else {
				int var4 = arg0.method388();
				field880[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field880[0] == 0xFFFF) {
					field878 = EKQCVRVG.method199(arg0.method390());
					break;
				}

				if (field880[var2] >= 512 && field880[var2] - 512 < RXDLPXNX.field1077) {
					int var5 = RXDLPXNX.method433(field880[var2] - 512).field1096;
					if (var5 != 0) {
						field874 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method388();
			if (var7 < 0 || var7 >= client.field131[var6].length) {
				var7 = 0;
			}

			field871[var6] = var7;
		}

		field1464 = arg0.method390();
		if (field1464 == 0xFFFF) {
			field1464 = -1;
		}

		field1465 = arg0.method390();
		if (field1465 == 0xFFFF) {
			field1465 = -1;
		}

		field1477 = arg0.method390();
		if (field1477 == 0xFFFF) {
			field1477 = -1;
		}

		field1478 = arg0.method390();
		if (field1478 == 0xFFFF) {
			field1478 = -1;
		}

		field1479 = arg0.method390();
		if (field1479 == 0xFFFF) {
			field1479 = -1;
		}

		field1480 = arg0.method390();
		if (field1480 == 0xFFFF) {
			field1480 = -1;
		}

		field1459 = arg0.method390();
		if (field1459 == 0xFFFF) {
			field1459 = -1;
		}

		field863 = DCKSLYWK.method172(DCKSLYWK.method169(arg0.method394()));
		field875 = arg0.method388();
		field857 = arg0.method390();
		field879 = true;
		field882 = 0L;
		int var8 = field880[5];
		int var9 = field880[9];
		field880[5] = var9;
		field880[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field882 <<= 4;
			if (field880[var10] >= 256) {
				field882 += field880[var10] - 256;
			}
		}

		if (field880[0] >= 256) {
			field882 += field880[0] - 256 >> 4;
		}

		if (field880[1] >= 256) {
			field882 += field880[1] - 256 >> 8;
		}

		field880[5] = var8;
		field880[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field882 <<= 3;
			field882 += field871[var11];
		}

		field882 <<= 1;
		field882 += field864;
	}
}
