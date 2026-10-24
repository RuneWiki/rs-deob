package deob;

@ObfuscatedName("KVXZMJHR")
public final class KVXZMJHR extends NNWGJIGN {

	@ObfuscatedName("KVXZMJHR.xb")
	public int field847 = -1;

	@ObfuscatedName("KVXZMJHR.zb")
	public long field848 = -1L;

	@ObfuscatedName("KVXZMJHR.Bb")
	public int field850 = -1;

	@ObfuscatedName("KVXZMJHR.Db")
	public boolean field852 = false;

	@ObfuscatedName("KVXZMJHR.Hb")
	public boolean field856 = false;

	@ObfuscatedName("KVXZMJHR.Lb")
	public int[] field860 = new int[12];

	@ObfuscatedName("KVXZMJHR.Rb")
	public int[] field866 = new int[5];

	@ObfuscatedName("KVXZMJHR.Ib")
	public static EQSIBNHW field857 = new EQSIBNHW(260);

	@ObfuscatedName("KVXZMJHR.rb")
	public int field841;

	@ObfuscatedName("KVXZMJHR.sb")
	public int field842;

	@ObfuscatedName("KVXZMJHR.tb")
	public int field843;

	@ObfuscatedName("KVXZMJHR.ub")
	public int field844;

	@ObfuscatedName("KVXZMJHR.Ab")
	public int field849;

	@ObfuscatedName("KVXZMJHR.Cb")
	public int field851;

	@ObfuscatedName("KVXZMJHR.Gb")
	public int field855;

	@ObfuscatedName("KVXZMJHR.Jb")
	public int field858;

	@ObfuscatedName("KVXZMJHR.Kb")
	public int field859;

	@ObfuscatedName("KVXZMJHR.Mb")
	public int field861;

	@ObfuscatedName("KVXZMJHR.Nb")
	public int field862;

	@ObfuscatedName("KVXZMJHR.Ob")
	public int field863;

	@ObfuscatedName("KVXZMJHR.Pb")
	public int field864;

	@ObfuscatedName("KVXZMJHR.Qb")
	public int field865;

	@ObfuscatedName("KVXZMJHR.Fb")
	public long field854;

	@ObfuscatedName("KVXZMJHR.vb")
	public IYSWJGDE field845;

	@ObfuscatedName("KVXZMJHR.wb")
	public PIPBZEOV field846;

	@ObfuscatedName("KVXZMJHR.Eb")
	public String field853;

	@ObfuscatedName("KVXZMJHR.b(I)LIYSWJGDE;")
	public final IYSWJGDE method322() {
		if (!field856) {
			return null;
		}

		if (field846 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field860[var2];
				if (var3 >= 256 && var3 < 512 && !UGUHDANY.field1286[var3 - 256].method500()) {
					var1 = true;
				}

				if (var3 >= 512 && !VIWDEJKN.method544(var3 - 512).method549(field865)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			IYSWJGDE[] var4 = new IYSWJGDE[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field860[var6];
				if (var7 >= 256 && var7 < 512) {
					IYSWJGDE var8 = UGUHDANY.field1286[var7 - 256].method501();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					IYSWJGDE var9 = VIWDEJKN.method544(var7 - 512).method547(field865);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			IYSWJGDE var10 = new IYSWJGDE(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field866[var11] != 0) {
					var10.method287(client.field282[var11][0], client.field282[var11][field866[var11]]);

					if (var11 == 1) {
						var10.method287(client.field380[0], client.field380[field866[var11]]);
					}
				}
			}

			return var10;
		}

		return field846.method399();
	}

	@ObfuscatedName("KVXZMJHR.c(I)LIYSWJGDE;")
	public final IYSWJGDE method323() {
		if (field846 != null) {
			int var1 = -1;
			if (field1009 >= 0 && field1012 == 0) {
				var1 = KMWMLVIH.field825[field1009].field827[field1010];
			} else if (field988 >= 0) {
				var1 = KMWMLVIH.field825[field988].field827[field989];
			}

			return field846.method401(null, var1, -1);
		}

		long var3 = field854;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1009 >= 0 && field1012 == 0) {
			KMWMLVIH var9 = KMWMLVIH.field825[field1009];
			var5 = var9.field827[field1010];

			if (field988 >= 0 && field988 != field967) {
				var6 = KMWMLVIH.field825[field988].field827[field989];
			}

			if (var9.field834 >= 0) {
				var7 = var9.field834;
				var3 += var7 - field860[5] << 40;
			}

			if (var9.field835 >= 0) {
				var8 = var9.field835;
				var3 += var8 - field860[3] << 48;
			}
		} else if (field988 >= 0) {
			var5 = KMWMLVIH.field825[field988].field827[field989];
		}

		IYSWJGDE var10 = (IYSWJGDE) field857.method175(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field860[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !UGUHDANY.field1286[var13 - 256].method498()) {
					var11 = true;
				}

				if (var13 >= 512 && !VIWDEJKN.method544(var13 - 512).method552(field865)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field848 != -1L) {
					var10 = (IYSWJGDE) field857.method175(field848);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			IYSWJGDE[] var14 = new IYSWJGDE[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field860[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					IYSWJGDE var18 = UGUHDANY.field1286[var17 - 256].method499();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					IYSWJGDE var19 = VIWDEJKN.method544(var17 - 512).method542(field865);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new IYSWJGDE(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field866[var20] != 0) {
					var10.method287(client.field282[var20][0], client.field282[var20][field866[var20]]);

					if (var20 == 1) {
						var10.method287(client.field380[0], client.field380[field866[var20]]);
					}
				}
			}

			var10.method280();
			var10.method290(64, 850, -30, -50, -30, true);
			field857.method176(var3, var10);
			field848 = var3;
		}

		if (field852) {
			return var10;
		}

		IYSWJGDE var21 = IYSWJGDE.field715;
		var21.method275(PLSPTEPI.method406(var5) & PLSPTEPI.method406(var6), var10);

		if (var5 != -1 && var6 != -1) {
			var21.method282(var6, var5, KMWMLVIH.field825[field1009].field831);
		} else if (var5 != -1) {
			var21.method281(var5);
		}

		var21.method277();
		var21.field751 = null;
		var21.field750 = null;
		return var21;
	}

	@ObfuscatedName("KVXZMJHR.a(ILSVWJKJVI;)V")
	public final void method324(SVWJKJVI arg0) {
		arg0.field1263 = 0;
		field865 = arg0.method461();
		field847 = arg0.method462();
		field850 = arg0.method462();
		field846 = null;
		field841 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method461();
			if (var3 == 0) {
				field860[var2] = 0;
			} else {
				int var4 = arg0.method461();
				field860[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field860[0] == 0xFFFF) {
					field846 = PIPBZEOV.method398(arg0.method463());
					break;
				}

				if (field860[var2] >= 512 && field860[var2] - 512 < VIWDEJKN.field1323) {
					int var5 = VIWDEJKN.method544(field860[var2] - 512).field1335;
					if (var5 != 0) {
						field841 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method461();
			if (var7 < 0 || var7 >= client.field282[var6].length) {
				var7 = 0;
			}

			field866[var6] = var7;
		}

		field967 = arg0.method463();
		if (field967 == 0xFFFF) {
			field967 = -1;
		}

		field968 = arg0.method463();
		if (field968 == 0xFFFF) {
			field968 = -1;
		}

		field1005 = arg0.method463();
		if (field1005 == 0xFFFF) {
			field1005 = -1;
		}

		field1006 = arg0.method463();
		if (field1006 == 0xFFFF) {
			field1006 = -1;
		}

		field1007 = arg0.method463();
		if (field1007 == 0xFFFF) {
			field1007 = -1;
		}

		field1008 = arg0.method463();
		if (field1008 == 0xFFFF) {
			field1008 = -1;
		}

		field1016 = arg0.method463();
		if (field1016 == 0xFFFF) {
			field1016 = -1;
		}

		field853 = ASZHZJYZ.method9(ASZHZJYZ.method6(arg0.method467()));
		field851 = arg0.method461();
		field855 = arg0.method463();
		field856 = true;
		field854 = 0L;
		int var8 = field860[5];
		int var9 = field860[9];
		field860[5] = var9;
		field860[9] = var8;
		for (int var10 = 0; var10 < 12; var10++) {
			field854 <<= 4;
			if (field860[var10] >= 256) {
				field854 += field860[var10] - 256;
			}
		}

		if (field860[0] >= 256) {
			field854 += field860[0] - 256 >> 4;
		}

		if (field860[1] >= 256) {
			field854 += field860[1] - 256 >> 8;
		}

		field860[5] = var8;
		field860[9] = var9;

		for (int var11 = 0; var11 < 5; var11++) {
			field854 <<= 3;
			field854 += field866[var11];
		}

		field854 <<= 1;
		field854 += field865;
	}

	@ObfuscatedName("KVXZMJHR.a(Z)LIYSWJGDE;")
	public final IYSWJGDE method2() {
		if (!field856) {
			return null;
		}

		IYSWJGDE var1 = method323();
		if (var1 == null) {
			return null;
		}

		field965 = var1.field793;
		var1.field752 = true;

		if (field852) {
			return var1;
		}

		if (field995 != -1 && field996 != -1) {
			RTDMFIDA var2 = RTDMFIDA.field1201[field995];
			IYSWJGDE var3 = var2.method448();
			if (var3 != null) {
				IYSWJGDE var4 = new IYSWJGDE(PLSPTEPI.method406(field996), var3, true, false);
				var4.method286(-field999, 0, 0);
				var4.method280();
				var4.method281(var2.field1205.field827[field996]);
				var4.field751 = null;
				var4.field750 = null;

				if (var2.field1208 != 128 || var2.field1209 != 128) {
					var4.method289(var2.field1208, var2.field1208, var2.field1209);
				}

				var4.method290(var2.field1211 + 64, var2.field1212 + 850, -30, -50, -30, true);
				IYSWJGDE[] var5 = new IYSWJGDE[] { var1, var4 };
				var1 = new IYSWJGDE(var5, 2, true);
			}
		}

		if (field845 != null) {
			if (client.field316 >= field859) {
				field845 = null;
			}

			if (client.field316 >= field858 && client.field316 < field859) {
				IYSWJGDE var6 = field845;
				var6.method286(field843 - field849, field844 - field973, field842 - field972);

				if (field964 == 512) {
					var6.method284();
					var6.method284();
					var6.method284();
				} else if (field964 == 1024) {
					var6.method284();
					var6.method284();
				} else if (field964 == 1536) {
					var6.method284();
				}

				IYSWJGDE[] var7 = new IYSWJGDE[] { var1, var6 };
				var1 = new IYSWJGDE(var7, 2, true);

				if (field964 == 512) {
					var6.method284();
				} else if (field964 == 1024) {
					var6.method284();
					var6.method284();
				} else if (field964 == 1536) {
					var6.method284();
					var6.method284();
					var6.method284();
				}

				var6.method286(field849 - field843, field973 - field844, field972 - field842);
			}
		}

		var1.field752 = true;
		return var1;
	}

	@ObfuscatedName("KVXZMJHR.a(I)Z")
	public final boolean method325() {
		if (!field856) {
			return false;
		}

		return true;
	}
}
