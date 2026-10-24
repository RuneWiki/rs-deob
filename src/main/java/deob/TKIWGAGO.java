package deob;

@ObfuscatedName("TKIWGAGO")
public final class TKIWGAGO extends DGZJCXBC {

	@ObfuscatedName("TKIWGAGO.qb")
	public boolean field1175 = false;

	@ObfuscatedName("TKIWGAGO.Cb")
	public int[] field1183 = new int[5];

	@ObfuscatedName("TKIWGAGO.Db")
	public long field1184 = -1L;

	@ObfuscatedName("TKIWGAGO.Lb")
	public boolean field1190 = false;

	@ObfuscatedName("TKIWGAGO.Rb")
	public int[] field1196 = new int[12];

	@ObfuscatedName("TKIWGAGO.Sb")
	public static GOPFMRDJ field1197 = new GOPFMRDJ(260);

	@ObfuscatedName("TKIWGAGO.tb")
	public int field1176;

	@ObfuscatedName("TKIWGAGO.ub")
	public int field1177;

	@ObfuscatedName("TKIWGAGO.vb")
	public int field1178;

	@ObfuscatedName("TKIWGAGO.wb")
	public int field1179;

	@ObfuscatedName("TKIWGAGO.xb")
	public int field1180;

	@ObfuscatedName("TKIWGAGO.yb")
	public int field1181;

	@ObfuscatedName("TKIWGAGO.zb")
	public int field1182;

	@ObfuscatedName("TKIWGAGO.Hb")
	public int field1186;

	@ObfuscatedName("TKIWGAGO.Jb")
	public int field1188;

	@ObfuscatedName("TKIWGAGO.Kb")
	public int field1189;

	@ObfuscatedName("TKIWGAGO.Mb")
	public int field1191;

	@ObfuscatedName("TKIWGAGO.Nb")
	public int field1192;

	@ObfuscatedName("TKIWGAGO.Ob")
	public int field1193;

	@ObfuscatedName("TKIWGAGO.Tb")
	public int field1198;

	@ObfuscatedName("TKIWGAGO.Ub")
	public int field1199;

	@ObfuscatedName("TKIWGAGO.Qb")
	public long field1195;

	@ObfuscatedName("TKIWGAGO.Eb")
	public FWGUGZKU field1185;

	@ObfuscatedName("TKIWGAGO.Pb")
	public ITSMSHJO field1194;

	@ObfuscatedName("TKIWGAGO.Ib")
	public String field1187;

	@ObfuscatedName("TKIWGAGO.b(Z)Z")
	public final boolean method1() {
		if (!field1175) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("TKIWGAGO.a(B)LITSMSHJO;")
	public final ITSMSHJO method423() {
		if (!field1175) {
			return null;
		}

		if (field1185 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1196[var2];
				if (var3 >= 256 && var3 < 512 && !BYTDRQNR.field37[var3 - 256].method25()) {
					var1 = true;
				}

				if (var3 >= 512 && !WKEFMNQD.method437(var3 - 512).method431(field1189)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			ITSMSHJO[] var4 = new ITSMSHJO[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1196[var6];
				if (var7 >= 256 && var7 < 512) {
					ITSMSHJO var8 = BYTDRQNR.field37[var7 - 256].method26();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					ITSMSHJO var9 = WKEFMNQD.method437(var7 - 512).method432(field1189);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			ITSMSHJO var10 = new ITSMSHJO(var4, var5);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1183[var11] != 0) {
					var10.method252(client.field357[var11][0], client.field357[var11][field1183[var11]]);

					if (var11 == 1) {
						var10.method252(client.field380[0], client.field380[field1183[var11]]);
					}
				}
			}

			return var10;
		}

		return field1185.method213();
	}

	@ObfuscatedName("TKIWGAGO.b(I)LITSMSHJO;")
	public final ITSMSHJO method424() {
		if (field1185 != null) {
			int var1 = -1;
			if (field532 >= 0 && field535 == 0) {
				var1 = HZCWGKOF.field712[field532].field714[field533];
			} else if (field537 >= 0) {
				var1 = HZCWGKOF.field712[field537].field714[field538];
			}

			return field1185.method212(var1, null, -1);
		}

		long var3 = field1195;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field532 >= 0 && field535 == 0) {
			HZCWGKOF var9 = HZCWGKOF.field712[field532];
			var5 = var9.field714[field533];

			if (field537 >= 0 && field541 != field537) {
				var6 = HZCWGKOF.field712[field537].field714[field538];
			}

			if (var9.field721 >= 0) {
				var7 = var9.field721;
				var3 += var7 - field1196[5] << 40;
			}

			if (var9.field722 >= 0) {
				var8 = var9.field722;
				var3 += var8 - field1196[3] << 48;
			}
		} else if (field537 >= 0) {
			var5 = HZCWGKOF.field712[field537].field714[field538];
		}

		ITSMSHJO var10 = (ITSMSHJO) field1197.method220(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1196[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !BYTDRQNR.field37[var13 - 256].method23()) {
					var11 = true;
				}

				if (var13 >= 512 && !WKEFMNQD.method437(var13 - 512).method430(field1189)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1184 != -1L) {
					var10 = (ITSMSHJO) field1197.method220(field1184);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			ITSMSHJO[] var14 = new ITSMSHJO[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1196[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					ITSMSHJO var18 = BYTDRQNR.field37[var17 - 256].method24();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					ITSMSHJO var19 = WKEFMNQD.method437(var17 - 512).method438(field1189);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new ITSMSHJO(var14, var15);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1183[var20] != 0) {
					var10.method252(client.field357[var20][0], client.field357[var20][field1183[var20]]);

					if (var20 == 1) {
						var10.method252(client.field380[0], client.field380[field1183[var20]]);
					}
				}
			}

			var10.method245();
			var10.method255(64, 850, -30, -50, -30, true);
			field1197.method221(var3, var10);
			field1184 = var3;
		}

		if (field1190) {
			return var10;
		}

		ITSMSHJO var21 = ITSMSHJO.field748;
		var21.method240(var10, SCIASJXX.method401(var5) & SCIASJXX.method401(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method247(var5, HZCWGKOF.field712[field532].field718, var6);
		} else if (var5 != -1) {
			var21.method246(var5);
		}

		var21.method242();
		var21.field785 = null;
		var21.field784 = null;
		return var21;
	}

	@ObfuscatedName("TKIWGAGO.a(Z)LITSMSHJO;")
	public final ITSMSHJO method2() {
		if (!field1175) {
			return null;
		}

		ITSMSHJO var1 = method424();
		if (var1 == null) {
			return null;
		}

		field530 = var1.field1174;
		var1.field786 = true;

		if (field1190) {
			return var1;
		}

		if (field557 != -1 && field558 != -1) {
			FPSNPMMW var2 = FPSNPMMW.field641[field557];
			ITSMSHJO var3 = var2.method206();
			if (var3 != null) {
				ITSMSHJO var4 = new ITSMSHJO(var3, SCIASJXX.method401(field558), false, true);
				var4.method251(0, 0, -field561);
				var4.method245();
				var4.method246(var2.field645.field714[field558]);
				var4.field785 = null;
				var4.field784 = null;

				if (var2.field648 != 128 || var2.field649 != 128) {
					var4.method254(var2.field648, var2.field648, var2.field649);
				}

				var4.method255(var2.field651 + 64, var2.field652 + 850, -30, -50, -30, true);
				ITSMSHJO[] var5 = new ITSMSHJO[] { var1, var4 };
				var1 = new ITSMSHJO(true, var5, 2);
			}
		}

		if (field1194 != null) {
			if (client.field287 >= field1199) {
				field1194 = null;
			}

			if (client.field287 >= field1198 && client.field287 < field1199) {
				ITSMSHJO var6 = field1194;
				var6.method251(field1191 - field514, field1193 - field515, field1192 - field1186);

				if (field529 == 512) {
					var6.method249();
					var6.method249();
					var6.method249();
				} else if (field529 == 1024) {
					var6.method249();
					var6.method249();
				} else if (field529 == 1536) {
					var6.method249();
				}

				ITSMSHJO[] var7 = new ITSMSHJO[] { var1, var6 };
				var1 = new ITSMSHJO(true, var7, 2);

				if (field529 == 512) {
					var6.method249();
				} else if (field529 == 1024) {
					var6.method249();
					var6.method249();
				} else if (field529 == 1536) {
					var6.method249();
					var6.method249();
					var6.method249();
				}

				var6.method251(field514 - field1191, field515 - field1193, field1186 - field1192);
			}
		}

		var1.field786 = true;
		return var1;
	}

	@ObfuscatedName("TKIWGAGO.a(LXQPFGONL;Z)V")
	public final void method425(XQPFGONL arg0) {
		arg0.field1335 = 0;
		field1189 = arg0.method478();
		field1178 = arg0.method478();
		field1185 = null;
		field1188 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method478();
			if (var3 == 0) {
				field1196[var2] = 0;
			} else {
				int var4 = arg0.method478();
				field1196[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1196[0] == 0xFFFF) {
					field1185 = FWGUGZKU.method210(arg0.method480());
					break;
				}

				if (field1196[var2] >= 512 && field1196[var2] - 512 < WKEFMNQD.field1247) {
					int var5 = WKEFMNQD.method437(field1196[var2] - 512).field1258;
					if (var5 != 0) {
						field1188 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method478();
			if (var7 < 0 || var7 >= client.field357[var6].length) {
				var7 = 0;
			}

			field1183[var6] = var7;
		}

		field541 = arg0.method480();
		if (field541 == 0xFFFF) {
			field541 = -1;
		}

		field542 = arg0.method480();
		if (field542 == 0xFFFF) {
			field542 = -1;
		}

		field519 = arg0.method480();
		if (field519 == 0xFFFF) {
			field519 = -1;
		}

		field520 = arg0.method480();
		if (field520 == 0xFFFF) {
			field520 = -1;
		}

		field521 = arg0.method480();
		if (field521 == 0xFFFF) {
			field521 = -1;
		}

		field522 = arg0.method480();
		if (field522 == 0xFFFF) {
			field522 = -1;
		}

		field531 = arg0.method480();
		if (field531 == 0xFFFF) {
			field531 = -1;
		}

		field1187 = FYSVECDN.method218(FYSVECDN.method215(arg0.method484()));
		field1177 = arg0.method478();
		field1176 = arg0.method480();
		field1175 = true;
		field1195 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1195 <<= 4;
			if (field1196[var8] >= 256) {
				field1195 += field1196[var8] - 256;
			}
		}

		if (field1196[0] >= 256) {
			field1195 += field1196[0] - 256 >> 4;
		}

		if (field1196[1] >= 256) {
			field1195 += field1196[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1195 <<= 3;
			field1195 += field1183[var9];
		}

		field1195 <<= 1;
		field1195 += field1189;
	}
}
