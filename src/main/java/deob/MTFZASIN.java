package deob;

@ObfuscatedName("MTFZASIN")
public final class MTFZASIN extends DSYLCNKR {

	@ObfuscatedName("MTFZASIN.vb")
	public int[] field1074 = new int[5];

	@ObfuscatedName("MTFZASIN.zb")
	public boolean field1077 = false;

	@ObfuscatedName("MTFZASIN.Hb")
	public boolean field1084 = false;

	@ObfuscatedName("MTFZASIN.Mb")
	public int[] field1089 = new int[12];

	@ObfuscatedName("MTFZASIN.Rb")
	public long field1092 = -1L;

	@ObfuscatedName("MTFZASIN.Ub")
	public int field1095 = -1;

	@ObfuscatedName("MTFZASIN.Vb")
	public int field1096 = -1;

	@ObfuscatedName("MTFZASIN.Nb")
	public static DMOAMUBS field1090 = new DMOAMUBS(260);

	@ObfuscatedName("MTFZASIN.rb")
	public int field1071;

	@ObfuscatedName("MTFZASIN.sb")
	public int field1072;

	@ObfuscatedName("MTFZASIN.xb")
	public int field1075;

	@ObfuscatedName("MTFZASIN.Ab")
	public int field1078;

	@ObfuscatedName("MTFZASIN.Bb")
	public int field1079;

	@ObfuscatedName("MTFZASIN.Cb")
	public int field1080;

	@ObfuscatedName("MTFZASIN.Db")
	public int field1081;

	@ObfuscatedName("MTFZASIN.Eb")
	public int field1082;

	@ObfuscatedName("MTFZASIN.Gb")
	public int field1083;

	@ObfuscatedName("MTFZASIN.Ib")
	public int field1085;

	@ObfuscatedName("MTFZASIN.Jb")
	public int field1086;

	@ObfuscatedName("MTFZASIN.Kb")
	public int field1087;

	@ObfuscatedName("MTFZASIN.Sb")
	public int field1093;

	@ObfuscatedName("MTFZASIN.Tb")
	public int field1094;

	@ObfuscatedName("MTFZASIN.ub")
	public long field1073;

	@ObfuscatedName("MTFZASIN.yb")
	public KFUEEJVZ field1076;

	@ObfuscatedName("MTFZASIN.Lb")
	public VYUQHOMO field1088;

	@ObfuscatedName("MTFZASIN.Pb")
	public String field1091;

	@ObfuscatedName("MTFZASIN.b(Z)LVYUQHOMO;")
	public final VYUQHOMO method321() {
		if (field1076 != null) {
			int var1 = -1;
			if (field611 >= 0 && field614 == 0) {
				var1 = MJVHTYCA.field1044[field611].field1046[field612];
			} else if (field646 >= 0) {
				var1 = MJVHTYCA.field1044[field646].field1046[field647];
			}

			return field1076.method264(var1, null, -1);
		}

		long var3 = field1073;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field611 >= 0 && field614 == 0) {
			MJVHTYCA var9 = MJVHTYCA.field1044[field611];
			var5 = var9.field1046[field612];

			if (field646 >= 0 && field659 != field646) {
				var6 = MJVHTYCA.field1044[field646].field1046[field647];
			}

			if (var9.field1053 >= 0) {
				var7 = var9.field1053;
				var3 += var7 - field1089[5] << 40;
			}

			if (var9.field1054 >= 0) {
				var8 = var9.field1054;
				var3 += var8 - field1089[3] << 48;
			}
		} else if (field646 >= 0) {
			var5 = MJVHTYCA.field1044[field646].field1046[field647];
		}

		VYUQHOMO var10 = (VYUQHOMO) field1090.method193(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1089[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !BLFCIBLQ.field67[var13 - 256].method19()) {
					var11 = true;
				}

				if (var13 >= 512 && !HJAQAKAW.method237(var13 - 512).method228(field1075)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1092 != -1L) {
					var10 = (VYUQHOMO) field1090.method193(field1092);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			VYUQHOMO[] var14 = new VYUQHOMO[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1089[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					VYUQHOMO var18 = BLFCIBLQ.field67[var17 - 256].method20();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					VYUQHOMO var19 = HJAQAKAW.method237(var17 - 512).method234(field1075);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new VYUQHOMO(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1074[var20] != 0) {
					var10.method421(client.field291[var20][0], client.field291[var20][field1074[var20]]);

					if (var20 == 1) {
						var10.method421(client.field344[0], client.field344[field1074[var20]]);
					}
				}
			}

			var10.method414();
			var10.method424(64, 850, -30, -50, -30, true);
			field1090.method194(var3, var10);
			field1092 = var3;
		}

		if (field1084) {
			return var10;
		}

		VYUQHOMO var21 = VYUQHOMO.field1286;
		var21.method409(var10, APJPJMYV.method11(var5) & APJPJMYV.method11(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method416(MJVHTYCA.field1044[field611].field1050, var6, var5);
		} else if (var5 != -1) {
			var21.method415(var5);
		}

		var21.method411();
		var21.field1323 = null;
		var21.field1322 = null;
		return var21;
	}

	@ObfuscatedName("MTFZASIN.a(BLXGRGMPUQ;)V")
	public final void method322(XGRGMPUQ arg0) {
		arg0.field1432 = 0;
		field1075 = arg0.method465();
		field1096 = arg0.method466();
		field1095 = arg0.method466();
		field1076 = null;
		field1071 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method465();
			if (var3 == 0) {
				field1089[var2] = 0;
			} else {
				int var4 = arg0.method465();
				field1089[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1089[0] == 0xFFFF) {
					field1076 = KFUEEJVZ.method267(arg0.method467());
					break;
				}

				if (field1089[var2] >= 512 && field1089[var2] - 512 < HJAQAKAW.field761) {
					int var5 = HJAQAKAW.method237(field1089[var2] - 512).field771;
					if (var5 != 0) {
						field1071 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method465();
			if (var7 < 0 || var7 >= client.field291[var6].length) {
				var7 = 0;
			}

			field1074[var6] = var7;
		}

		field659 = arg0.method467();
		if (field659 == 0xFFFF) {
			field659 = -1;
		}

		field660 = arg0.method467();
		if (field660 == 0xFFFF) {
			field660 = -1;
		}

		field623 = arg0.method467();
		if (field623 == 0xFFFF) {
			field623 = -1;
		}

		field624 = arg0.method467();
		if (field624 == 0xFFFF) {
			field624 = -1;
		}

		field625 = arg0.method467();
		if (field625 == 0xFFFF) {
			field625 = -1;
		}

		field626 = arg0.method467();
		if (field626 == 0xFFFF) {
			field626 = -1;
		}

		field658 = arg0.method467();
		if (field658 == 0xFFFF) {
			field658 = -1;
		}

		field1091 = CIRLBWBX.method41(CIRLBWBX.method38(arg0.method471()));
		field1082 = arg0.method465();
		field1072 = arg0.method467();
		field1077 = true;
		field1073 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1073 <<= 4;
			if (field1089[var8] >= 256) {
				field1073 += field1089[var8] - 256;
			}
		}

		if (field1089[0] >= 256) {
			field1073 += field1089[0] - 256 >> 4;
		}

		if (field1089[1] >= 256) {
			field1073 += field1089[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1073 <<= 3;
			field1073 += field1074[var9];
		}

		field1073 <<= 1;
		field1073 += field1075;
	}

	@ObfuscatedName("MTFZASIN.a(I)LVYUQHOMO;")
	public final VYUQHOMO method13() {
		if (!field1077) {
			return null;
		}

		VYUQHOMO var1 = method321();
		if (var1 == null) {
			return null;
		}

		field661 = var1.field827;
		var1.field1324 = true;

		if (field1084) {
			return var1;
		}

		if (field640 != -1 && field641 != -1) {
			BKJQHSVH var2 = BKJQHSVH.field53[field640];
			VYUQHOMO var3 = var2.method16();
			if (var3 != null) {
				VYUQHOMO var4 = new VYUQHOMO(true, APJPJMYV.method11(field641), var3, false);
				var4.method420(0, -field644, 0);
				var4.method414();
				var4.method415(var2.field57.field1046[field641]);
				var4.field1323 = null;
				var4.field1322 = null;

				if (var2.field60 != 128 || var2.field61 != 128) {
					var4.method423(var2.field60, var2.field61, var2.field60);
				}

				var4.method424(var2.field63 + 64, var2.field64 + 850, -30, -50, -30, true);
				VYUQHOMO[] var5 = new VYUQHOMO[] { var1, var4 };
				var1 = new VYUQHOMO(true, 2, var5);
			}
		}

		if (field1088 != null) {
			if (client.field512 >= field1094) {
				field1088 = null;
			}

			if (client.field512 >= field1093 && client.field512 < field1094) {
				VYUQHOMO var6 = field1088;
				var6.method420(field1087 - field655, field1086 - field1083, field1085 - field654);

				if (field639 == 512) {
					var6.method418();
					var6.method418();
					var6.method418();
				} else if (field639 == 1024) {
					var6.method418();
					var6.method418();
				} else if (field639 == 1536) {
					var6.method418();
				}

				VYUQHOMO[] var7 = new VYUQHOMO[] { var1, var6 };
				var1 = new VYUQHOMO(true, 2, var7);

				if (field639 == 512) {
					var6.method418();
				} else if (field639 == 1024) {
					var6.method418();
					var6.method418();
				} else if (field639 == 1536) {
					var6.method418();
					var6.method418();
					var6.method418();
				}

				var6.method420(field655 - field1087, field1083 - field1086, field654 - field1085);
			}
		}

		var1.field1324 = true;
		return var1;
	}

	@ObfuscatedName("MTFZASIN.b(I)Z")
	public final boolean method192() {
		if (!field1077) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("MTFZASIN.a(B)LVYUQHOMO;")
	public final VYUQHOMO method323() {
		if (!field1077) {
			return null;
		}

		if (field1076 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1089[var2];
				if (var3 >= 256 && var3 < 512 && !BLFCIBLQ.field67[var3 - 256].method21()) {
					var1 = true;
				}

				if (var3 >= 512 && !HJAQAKAW.method237(var3 - 512).method231(field1075)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			VYUQHOMO[] var4 = new VYUQHOMO[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1089[var6];
				if (var7 >= 256 && var7 < 512) {
					VYUQHOMO var8 = BLFCIBLQ.field67[var7 - 256].method22();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					VYUQHOMO var9 = HJAQAKAW.method237(var7 - 512).method233(field1075);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			VYUQHOMO var10 = new VYUQHOMO(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1074[var11] != 0) {
					var10.method421(client.field291[var11][0], client.field291[var11][field1074[var11]]);

					if (var11 == 1) {
						var10.method421(client.field344[0], client.field344[field1074[var11]]);
					}
				}
			}

			return var10;
		}

		return field1076.method263();
	}
}
