package deob;

@ObfuscatedName("PASMQFXV")
public final class PASMQFXV extends WAJZGBEE {

	@ObfuscatedName("PASMQFXV.tb")
	public int[] field939 = new int[12];

	@ObfuscatedName("PASMQFXV.Ab")
	public boolean field945 = false;

	@ObfuscatedName("PASMQFXV.Eb")
	public long field948 = -1L;

	@ObfuscatedName("PASMQFXV.Mb")
	public boolean field956 = false;

	@ObfuscatedName("PASMQFXV.Nb")
	public int[] field957 = new int[5];

	@ObfuscatedName("PASMQFXV.Rb")
	public static HGKRJZKS field960 = new HGKRJZKS(260);

	@ObfuscatedName("PASMQFXV.qb")
	public int field937;

	@ObfuscatedName("PASMQFXV.ub")
	public int field940;

	@ObfuscatedName("PASMQFXV.vb")
	public int field941;

	@ObfuscatedName("PASMQFXV.wb")
	public int field942;

	@ObfuscatedName("PASMQFXV.xb")
	public int field943;

	@ObfuscatedName("PASMQFXV.yb")
	public int field944;

	@ObfuscatedName("PASMQFXV.Bb")
	public int field946;

	@ObfuscatedName("PASMQFXV.Cb")
	public int field947;

	@ObfuscatedName("PASMQFXV.Gb")
	public int field950;

	@ObfuscatedName("PASMQFXV.Hb")
	public int field951;

	@ObfuscatedName("PASMQFXV.Ib")
	public int field952;

	@ObfuscatedName("PASMQFXV.Jb")
	public int field953;

	@ObfuscatedName("PASMQFXV.Kb")
	public int field954;

	@ObfuscatedName("PASMQFXV.Pb")
	public int field958;

	@ObfuscatedName("PASMQFXV.Qb")
	public int field959;

	@ObfuscatedName("PASMQFXV.rb")
	public long field938;

	@ObfuscatedName("PASMQFXV.Fb")
	public LPTCUHOU field949;

	@ObfuscatedName("PASMQFXV.Lb")
	public VHYCWIPJ field955;

	@ObfuscatedName("PASMQFXV.pb")
	public String field936;

	@ObfuscatedName("PASMQFXV.a(B)Z")
	public final boolean method404() {
		if (!field945) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("PASMQFXV.a(I)LVHYCWIPJ;")
	public final VHYCWIPJ method217() {
		if (!field945) {
			return null;
		}

		VHYCWIPJ var1 = method407();
		if (var1 == null) {
			return null;
		}

		field1269 = var1.field962;
		var1.field1211 = true;

		if (field956) {
			return var1;
		}

		if (field1277 != -1 && field1278 != -1) {
			XHDTVZNY var2 = XHDTVZNY.field1398[field1277];
			VHYCWIPJ var3 = var2.method579();
			if (var3 != null) {
				VHYCWIPJ var4 = new VHYCWIPJ(TTZHVWEG.method489(field1278), true, false, var3);
				var4.method513(0, 0, -field1281);
				var4.method507();
				var4.method508(var2.field1402.field1325[field1278]);
				var4.field1210 = null;
				var4.field1209 = null;

				if (var2.field1405 != 128 || var2.field1406 != 128) {
					var4.method516(var2.field1405, var2.field1405, var2.field1406);
				}

				var4.method517(var2.field1408 + 64, var2.field1409 + 850, -30, -50, -30, true);
				VHYCWIPJ[] var5 = new VHYCWIPJ[] { var1, var4 };
				var1 = new VHYCWIPJ(2, true, var5);
			}
		}

		if (field955 != null) {
			if (client.field307 >= field951) {
				field955 = null;
			}

			if (client.field307 >= field950 && client.field307 < field951) {
				VHYCWIPJ var6 = field955;
				var6.method513(field954 - field1293, field952 - field1292, field953 - field958);

				if (field1288 == 512) {
					var6.method511();
					var6.method511();
					var6.method511();
				} else if (field1288 == 1024) {
					var6.method511();
					var6.method511();
				} else if (field1288 == 1536) {
					var6.method511();
				}

				VHYCWIPJ[] var7 = new VHYCWIPJ[] { var1, var6 };
				var1 = new VHYCWIPJ(2, true, var7);

				if (field1288 == 512) {
					var6.method511();
				} else if (field1288 == 1024) {
					var6.method511();
					var6.method511();
				} else if (field1288 == 1536) {
					var6.method511();
					var6.method511();
					var6.method511();
				}

				var6.method513(field1293 - field954, field1292 - field952, field958 - field953);
			}
		}

		var1.field1211 = true;
		return var1;
	}

	@ObfuscatedName("PASMQFXV.a(ILGLMIQHJI;)V")
	public final void method405(GLMIQHJI arg0) {
		arg0.field709 = 0;
		field947 = arg0.method244();
		field946 = arg0.method244();
		field949 = null;
		field944 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method244();
			if (var3 == 0) {
				field939[var2] = 0;
			} else {
				int var4 = arg0.method244();
				field939[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field939[0] == 0xFFFF) {
					field949 = LPTCUHOU.method380(arg0.method246());
					break;
				}

				if (field939[var2] >= 512 && field939[var2] - 512 < AVSLDGMK.field5) {
					int var5 = AVSLDGMK.method4(field939[var2] - 512).field42;
					if (var5 != 0) {
						field944 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method244();
			if (var7 < 0 || var7 >= client.field382[var6].length) {
				var7 = 0;
			}

			field957[var6] = var7;
		}

		field1271 = arg0.method246();
		if (field1271 == 0xFFFF) {
			field1271 = -1;
		}

		field1272 = arg0.method246();
		if (field1272 == 0xFFFF) {
			field1272 = -1;
		}

		field1302 = arg0.method246();
		if (field1302 == 0xFFFF) {
			field1302 = -1;
		}

		field1303 = arg0.method246();
		if (field1303 == 0xFFFF) {
			field1303 = -1;
		}

		field1304 = arg0.method246();
		if (field1304 == 0xFFFF) {
			field1304 = -1;
		}

		field1305 = arg0.method246();
		if (field1305 == 0xFFFF) {
			field1305 = -1;
		}

		field1306 = arg0.method246();
		if (field1306 == 0xFFFF) {
			field1306 = -1;
		}

		field936 = YYRFHIVS.method587(YYRFHIVS.method584(arg0.method250()));
		field959 = arg0.method244();
		field937 = arg0.method246();
		field945 = true;
		field938 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field938 <<= 4;
			if (field939[var8] >= 256) {
				field938 += field939[var8] - 256;
			}
		}

		if (field939[0] >= 256) {
			field938 += field939[0] - 256 >> 4;
		}

		if (field939[1] >= 256) {
			field938 += field939[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field938 <<= 3;
			field938 += field957[var9];
		}

		field938 <<= 1;
		field938 += field947;
	}

	@ObfuscatedName("PASMQFXV.b(I)LVHYCWIPJ;")
	public final VHYCWIPJ method406() {
		if (!field945) {
			return null;
		}

		if (field949 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field939[var2];
				if (var3 >= 256 && var3 < 512 && !GCYXYCPV.field691[var3 - 256].method225()) {
					var1 = true;
				}

				if (var3 >= 512 && !AVSLDGMK.method4(var3 - 512).method8(field947)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			VHYCWIPJ[] var4 = new VHYCWIPJ[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field939[var6];
				if (var7 >= 256 && var7 < 512) {
					VHYCWIPJ var8 = GCYXYCPV.field691[var7 - 256].method226();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					VHYCWIPJ var9 = AVSLDGMK.method4(var7 - 512).method9(field947);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			VHYCWIPJ var10 = new VHYCWIPJ(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field957[var11] != 0) {
					var10.method514(client.field382[var11][0], client.field382[var11][field957[var11]]);

					if (var11 == 1) {
						var10.method514(client.field290[0], client.field290[field957[var11]]);
					}
				}
			}

			return var10;
		}

		return field949.method378();
	}

	@ObfuscatedName("PASMQFXV.c(I)LVHYCWIPJ;")
	public final VHYCWIPJ method407() {
		if (field949 != null) {
			int var1 = -1;
			if (field1310 >= 0 && field1313 == 0) {
				var1 = WLHKAARP.field1323[field1310].field1325[field1311];
			} else if (field1319 >= 0) {
				var1 = WLHKAARP.field1323[field1319].field1325[field1320];
			}

			return field949.method382(null, -1, var1);
		}

		long var3 = field938;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1310 >= 0 && field1313 == 0) {
			WLHKAARP var9 = WLHKAARP.field1323[field1310];
			var5 = var9.field1325[field1311];

			if (field1319 >= 0 && field1319 != field1271) {
				var6 = WLHKAARP.field1323[field1319].field1325[field1320];
			}

			if (var9.field1332 >= 0) {
				var7 = var9.field1332;
				var3 += var7 - field939[5] << 40;
			}

			if (var9.field1333 >= 0) {
				var8 = var9.field1333;
				var3 += var8 - field939[3] << 48;
			}
		} else if (field1319 >= 0) {
			var5 = WLHKAARP.field1323[field1319].field1325[field1320];
		}

		VHYCWIPJ var10 = (VHYCWIPJ) field960.method285(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field939[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !GCYXYCPV.field691[var13 - 256].method223()) {
					var11 = true;
				}

				if (var13 >= 512 && !AVSLDGMK.method4(var13 - 512).method10(field947)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field948 != -1L) {
					var10 = (VHYCWIPJ) field960.method285(field948);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			VHYCWIPJ[] var14 = new VHYCWIPJ[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field939[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					VHYCWIPJ var18 = GCYXYCPV.field691[var17 - 256].method224();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					VHYCWIPJ var19 = AVSLDGMK.method4(var17 - 512).method2(field947);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new VHYCWIPJ(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field957[var20] != 0) {
					var10.method514(client.field382[var20][0], client.field382[var20][field957[var20]]);

					if (var20 == 1) {
						var10.method514(client.field290[0], client.field290[field957[var20]]);
					}
				}
			}

			var10.method507();
			var10.method517(64, 850, -30, -50, -30, true);
			field960.method286(var3, var10);
			field948 = var3;
		}

		if (field956) {
			return var10;
		}

		VHYCWIPJ var21 = VHYCWIPJ.field1173;
		var21.method502(var10, TTZHVWEG.method489(var5) & TTZHVWEG.method489(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method509(var5, WLHKAARP.field1323[field1310].field1329, var6);
		} else if (var5 != -1) {
			var21.method508(var5);
		}

		var21.method504();
		var21.field1210 = null;
		var21.field1209 = null;
		return var21;
	}
}
