package deob;

@ObfuscatedName("SOKVSBIO")
public final class SOKVSBIO extends NQXGETKS {

	@ObfuscatedName("SOKVSBIO.ob")
	public boolean field1218 = false;

	@ObfuscatedName("SOKVSBIO.rb")
	public boolean field1221 = false;

	@ObfuscatedName("SOKVSBIO.sb")
	public int[] field1222 = new int[12];

	@ObfuscatedName("SOKVSBIO.yb")
	public int field1228 = -1;

	@ObfuscatedName("SOKVSBIO.Db")
	public int[] field1233 = new int[5];

	@ObfuscatedName("SOKVSBIO.Eb")
	public long field1234 = -1L;

	@ObfuscatedName("SOKVSBIO.Nb")
	public int field1243 = -1;

	@ObfuscatedName("SOKVSBIO.xb")
	public static THJKANXW field1227 = new THJKANXW(260);

	@ObfuscatedName("SOKVSBIO.qb")
	public int field1220;

	@ObfuscatedName("SOKVSBIO.tb")
	public int field1223;

	@ObfuscatedName("SOKVSBIO.ub")
	public int field1224;

	@ObfuscatedName("SOKVSBIO.vb")
	public int field1225;

	@ObfuscatedName("SOKVSBIO.zb")
	public int field1229;

	@ObfuscatedName("SOKVSBIO.Ab")
	public int field1230;

	@ObfuscatedName("SOKVSBIO.Bb")
	public int field1231;

	@ObfuscatedName("SOKVSBIO.Cb")
	public int field1232;

	@ObfuscatedName("SOKVSBIO.Gb")
	public int field1236;

	@ObfuscatedName("SOKVSBIO.Ib")
	public int field1238;

	@ObfuscatedName("SOKVSBIO.Jb")
	public int field1239;

	@ObfuscatedName("SOKVSBIO.Kb")
	public int field1240;

	@ObfuscatedName("SOKVSBIO.Lb")
	public int field1241;

	@ObfuscatedName("SOKVSBIO.Mb")
	public int field1242;

	@ObfuscatedName("SOKVSBIO.pb")
	public long field1219;

	@ObfuscatedName("SOKVSBIO.wb")
	public CYPZUKMB field1226;

	@ObfuscatedName("SOKVSBIO.Hb")
	public YGGALXYD field1237;

	@ObfuscatedName("SOKVSBIO.Fb")
	public String field1235;

	@ObfuscatedName("SOKVSBIO.a(LLBBVYYXO;I)V")
	public final void method526(LBBVYYXO arg0) {
		arg0.field882 = 0;
		field1229 = arg0.method369();
		field1243 = arg0.method370();
		field1228 = arg0.method370();
		field1237 = null;
		field1236 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method369();
			if (var3 == 0) {
				field1222[var2] = 0;
			} else {
				int var4 = arg0.method369();
				field1222[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1222[0] == 0xFFFF) {
					field1237 = YGGALXYD.method575(arg0.method371());
					break;
				}

				if (field1222[var2] >= 512 && field1222[var2] - 512 < WGKWQDPM.field1308) {
					int var5 = WGKWQDPM.method554(field1222[var2] - 512).field1302;
					if (var5 != 0) {
						field1236 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method369();
			if (var7 < 0 || var7 >= client.field135[var6].length) {
				var7 = 0;
			}

			field1233[var6] = var7;
		}

		field989 = arg0.method371();
		if (field989 == 0xFFFF) {
			field989 = -1;
		}

		field990 = arg0.method371();
		if (field990 == 0xFFFF) {
			field990 = -1;
		}

		field981 = arg0.method371();
		if (field981 == 0xFFFF) {
			field981 = -1;
		}

		field982 = arg0.method371();
		if (field982 == 0xFFFF) {
			field982 = -1;
		}

		field983 = arg0.method371();
		if (field983 == 0xFFFF) {
			field983 = -1;
		}

		field984 = arg0.method371();
		if (field984 == 0xFFFF) {
			field984 = -1;
		}

		field999 = arg0.method371();
		if (field999 == 0xFFFF) {
			field999 = -1;
		}

		field1235 = OERTMYQW.method444(OERTMYQW.method441(arg0.method375()));
		field1220 = arg0.method369();
		field1242 = arg0.method371();
		field1218 = true;
		field1219 = 0L;
		int var8 = field1222[5];
		int var9 = field1222[9];
		field1222[5] = var9;
		field1222[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field1219 <<= 4;
			if (field1222[var10] >= 256) {
				field1219 += field1222[var10] - 256;
			}
		}

		if (field1222[0] >= 256) {
			field1219 += field1222[0] - 256 >> 4;
		}

		if (field1222[1] >= 256) {
			field1219 += field1222[1] - 256 >> 8;
		}

		field1222[5] = var8;
		field1222[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field1219 <<= 3;
			field1219 += field1233[var11];
		}

		field1219 <<= 1;
		field1219 += field1229;
	}

	@ObfuscatedName("SOKVSBIO.a(I)Z")
	public final boolean method429() {
		if (!field1218) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("SOKVSBIO.a(Z)LCYPZUKMB;")
	public final CYPZUKMB method527() {
		if (field1237 != null) {
			int var1 = -1;
			if (field1015 >= 0 && field1018 == 0) {
				var1 = EHYLCNJX.field744[field1015].field746[field1016];
			} else if (field1002 >= 0) {
				var1 = EHYLCNJX.field744[field1002].field746[field1003];
			}

			return field1237.method569(-1, var1, null);
		}

		long var3 = field1219;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1015 >= 0 && field1018 == 0) {
			EHYLCNJX var9 = EHYLCNJX.field744[field1015];
			var5 = var9.field746[field1016];

			if (field1002 >= 0 && field989 != field1002) {
				var6 = EHYLCNJX.field744[field1002].field746[field1003];
			}

			if (var9.field753 >= 0) {
				var7 = var9.field753;
				var3 += var7 - field1222[5] << 40;
			}

			if (var9.field754 >= 0) {
				var8 = var9.field754;
				var3 += var8 - field1222[3] << 48;
			}
		} else if (field1002 >= 0) {
			var5 = EHYLCNJX.field744[field1002].field746[field1003];
		}

		CYPZUKMB var10 = (CYPZUKMB) field1227.method529(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1222[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !CWNXCHDT.field530[var13 - 256].method188()) {
					var11 = true;
				}

				if (var13 >= 512 && !WGKWQDPM.method554(var13 - 512).method550(field1229)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1234 != -1L) {
					var10 = (CYPZUKMB) field1227.method529(field1234);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			CYPZUKMB[] var14 = new CYPZUKMB[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1222[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					CYPZUKMB var18 = CWNXCHDT.field530[var17 - 256].method189();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					CYPZUKMB var19 = WGKWQDPM.method554(var17 - 512).method559(field1229);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new CYPZUKMB(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1233[var20] != 0) {
					var10.method210(client.field135[var20][0], client.field135[var20][field1233[var20]]);

					if (var20 == 1) {
						var10.method210(client.field271[0], client.field271[field1233[var20]]);
					}
				}
			}

			var10.method203();
			var10.method213(64, 850, -30, -50, -30, true);
			field1227.method530(var3, var10);
			field1234 = var3;
		}

		if (field1221) {
			return var10;
		}

		CYPZUKMB var21 = CYPZUKMB.field538;
		var21.method198(QGRLAQIF.method469(var5) & QGRLAQIF.method469(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method205(var5, var6, EHYLCNJX.field744[field1015].field750);
		} else if (var5 != -1) {
			var21.method204(var5);
		}

		var21.method200();
		var21.field574 = null;
		var21.field573 = null;
		return var21;
	}

	@ObfuscatedName("SOKVSBIO.b(Z)LCYPZUKMB;")
	public final CYPZUKMB method528() {
		if (!field1218) {
			return null;
		}

		if (field1237 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1222[var2];
				if (var3 >= 256 && var3 < 512 && !CWNXCHDT.field530[var3 - 256].method190()) {
					var1 = true;
				}

				if (var3 >= 512 && !WGKWQDPM.method554(var3 - 512).method561(field1229)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			CYPZUKMB[] var4 = new CYPZUKMB[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1222[var6];
				if (var7 >= 256 && var7 < 512) {
					CYPZUKMB var8 = CWNXCHDT.field530[var7 - 256].method191();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					CYPZUKMB var9 = WGKWQDPM.method554(var7 - 512).method549(field1229);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			CYPZUKMB var10 = new CYPZUKMB(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1233[var11] != 0) {
					var10.method210(client.field135[var11][0], client.field135[var11][field1233[var11]]);

					if (var11 == 1) {
						var10.method210(client.field271[0], client.field271[field1233[var11]]);
					}
				}
			}

			return var10;
		}

		return field1237.method571();
	}

	@ObfuscatedName("SOKVSBIO.a(B)LCYPZUKMB;")
	public final CYPZUKMB method2() {
		if (!field1218) {
			return null;
		}

		CYPZUKMB var1 = method527();
		if (var1 == null) {
			return null;
		}

		field994 = var1.field1247;
		var1.field575 = true;

		if (field1221) {
			return var1;
		}

		if (field969 != -1 && field970 != -1) {
			BZLQCUPI var2 = BZLQCUPI.field41[field969];
			CYPZUKMB var3 = var2.method9();
			if (var3 != null) {
				CYPZUKMB var4 = new CYPZUKMB(QGRLAQIF.method469(field970), var3, false, true);
				var4.method209(0, -field973, 0);
				var4.method203();
				var4.method204(var2.field45.field746[field970]);
				var4.field574 = null;
				var4.field573 = null;

				if (var2.field48 != 128 || var2.field49 != 128) {
					var4.method212(var2.field48, var2.field49, var2.field48);
				}

				var4.method213(var2.field51 + 64, var2.field52 + 850, -30, -50, -30, true);
				CYPZUKMB[] var5 = new CYPZUKMB[] { var1, var4 };
				var1 = new CYPZUKMB(true, 2, var5);
			}
		}

		if (field1226 != null) {
			if (client.field155 >= field1232) {
				field1226 = null;
			}

			if (client.field155 >= field1231 && client.field155 < field1232) {
				CYPZUKMB var6 = field1226;
				var6.method209(field1223 - field977, field1224 - field1230, field1225 - field978);

				if (field991 == 512) {
					var6.method207();
					var6.method207();
					var6.method207();
				} else if (field991 == 1024) {
					var6.method207();
					var6.method207();
				} else if (field991 == 1536) {
					var6.method207();
				}

				CYPZUKMB[] var7 = new CYPZUKMB[] { var1, var6 };
				var1 = new CYPZUKMB(true, 2, var7);

				if (field991 == 512) {
					var6.method207();
				} else if (field991 == 1024) {
					var6.method207();
					var6.method207();
				} else if (field991 == 1536) {
					var6.method207();
					var6.method207();
					var6.method207();
				}

				var6.method209(field977 - field1223, field1230 - field1224, field978 - field1225);
			}
		}

		var1.field575 = true;
		return var1;
	}
}
