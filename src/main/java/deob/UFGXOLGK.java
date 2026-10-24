package deob;

@ObfuscatedName("UFGXOLGK")
public final class UFGXOLGK extends TTYUWHXI {

	@ObfuscatedName("UFGXOLGK.rb")
	public int[] field1266 = new int[12];

	@ObfuscatedName("UFGXOLGK.tb")
	public boolean field1268 = false;

	@ObfuscatedName("UFGXOLGK.vb")
	public int field1270 = -1;

	@ObfuscatedName("UFGXOLGK.wb")
	public int[] field1271 = new int[5];

	@ObfuscatedName("UFGXOLGK.yb")
	public int field1273 = -1;

	@ObfuscatedName("UFGXOLGK.zb")
	public long field1274 = -1L;

	@ObfuscatedName("UFGXOLGK.Gb")
	public boolean field1281 = false;

	@ObfuscatedName("UFGXOLGK.pb")
	public static EOJHVRZF field1264 = new EOJHVRZF(260);

	@ObfuscatedName("UFGXOLGK.qb")
	public int field1265;

	@ObfuscatedName("UFGXOLGK.sb")
	public int field1267;

	@ObfuscatedName("UFGXOLGK.ub")
	public int field1269;

	@ObfuscatedName("UFGXOLGK.xb")
	public int field1272;

	@ObfuscatedName("UFGXOLGK.Ab")
	public int field1275;

	@ObfuscatedName("UFGXOLGK.Cb")
	public int field1277;

	@ObfuscatedName("UFGXOLGK.Db")
	public int field1278;

	@ObfuscatedName("UFGXOLGK.Eb")
	public int field1279;

	@ObfuscatedName("UFGXOLGK.Jb")
	public int field1284;

	@ObfuscatedName("UFGXOLGK.Kb")
	public int field1285;

	@ObfuscatedName("UFGXOLGK.Lb")
	public int field1286;

	@ObfuscatedName("UFGXOLGK.Mb")
	public int field1287;

	@ObfuscatedName("UFGXOLGK.Nb")
	public int field1288;

	@ObfuscatedName("UFGXOLGK.Ob")
	public int field1289;

	@ObfuscatedName("UFGXOLGK.Hb")
	public long field1282;

	@ObfuscatedName("UFGXOLGK.Bb")
	public JKAPIYZO field1276;

	@ObfuscatedName("UFGXOLGK.Fb")
	public WEVRTBOZ field1280;

	@ObfuscatedName("UFGXOLGK.Ib")
	public String field1283;

	@ObfuscatedName("UFGXOLGK.a(I)LWEVRTBOZ;")
	public final WEVRTBOZ method495() {
		if (!field1268) {
			return null;
		}

		if (field1276 == null) {
			boolean var1 = false;
			for (int var2 = 0; var2 < 12; var2++) {
				int var3 = field1266[var2];
				if (var3 >= 256 && var3 < 512 && !NRLTHETF.field954[var3 - 256].method337()) {
					var1 = true;
				}

				if (var3 >= 512 && !MHOZCPTF.method322(var3 - 512).method315(field1265)) {
					var1 = true;
				}
			}

			if (var1) {
				return null;
			}

			WEVRTBOZ[] var4 = new WEVRTBOZ[12];
			int var5 = 0;
			for (int var6 = 0; var6 < 12; var6++) {
				int var7 = field1266[var6];
				if (var7 >= 256 && var7 < 512) {
					WEVRTBOZ var8 = NRLTHETF.field954[var7 - 256].method338();
					if (var8 != null) {
						var4[var5++] = var8;
					}
				}

				if (var7 >= 512) {
					WEVRTBOZ var9 = MHOZCPTF.method322(var7 - 512).method321(field1265);
					if (var9 != null) {
						var4[var5++] = var9;
					}
				}
			}

			WEVRTBOZ var10 = new WEVRTBOZ(var5, var4);
			for (int var11 = 0; var11 < 5; var11++) {
				if (field1271[var11] != 0) {
					var10.method539(client.field266[var11][0], client.field266[var11][field1271[var11]]);

					if (var11 == 1) {
						var10.method539(client.field98[0], client.field98[field1271[var11]]);
					}
				}
			}

			return var10;
		}

		return field1276.method281();
	}

	@ObfuscatedName("UFGXOLGK.a(Z)LWEVRTBOZ;")
	public final WEVRTBOZ method225() {
		if (!field1268) {
			return null;
		}

		WEVRTBOZ var1 = method497();
		if (var1 == null) {
			return null;
		}

		field1246 = var1.field945;
		var1.field1396 = true;

		if (field1281) {
			return var1;
		}

		if (field1210 != -1 && field1211 != -1) {
			PMDEXOWJ var2 = PMDEXOWJ.field1086[field1210];
			WEVRTBOZ var3 = var2.method404();
			if (var3 != null) {
				WEVRTBOZ var4 = new WEVRTBOZ(var3, HJEXDJAH.method218(field1211), false, true);
				var4.method538(-field1214, 0, 0);
				var4.method532();
				var4.method533(var2.field1090.field1114[field1211]);
				var4.field1395 = null;
				var4.field1394 = null;

				if (var2.field1093 != 128 || var2.field1094 != 128) {
					var4.method541(var2.field1093, var2.field1093, var2.field1094);
				}

				var4.method542(var2.field1096 + 64, var2.field1097 + 850, -30, -50, -30, true);
				WEVRTBOZ[] var5 = new WEVRTBOZ[] { var1, var4 };
				var1 = new WEVRTBOZ(var5, true, 2);
			}
		}

		if (field1280 != null) {
			if (client.field306 >= field1285) {
				field1280 = null;
			}

			if (client.field306 >= field1284 && client.field306 < field1285) {
				WEVRTBOZ var6 = field1280;
				var6.method538(field1278 - field1267, field1279 - field1236, field1277 - field1235);

				if (field1247 == 512) {
					var6.method536();
					var6.method536();
					var6.method536();
				} else if (field1247 == 1024) {
					var6.method536();
					var6.method536();
				} else if (field1247 == 1536) {
					var6.method536();
				}

				WEVRTBOZ[] var7 = new WEVRTBOZ[] { var1, var6 };
				var1 = new WEVRTBOZ(var7, true, 2);

				if (field1247 == 512) {
					var6.method536();
				} else if (field1247 == 1024) {
					var6.method536();
					var6.method536();
				} else if (field1247 == 1536) {
					var6.method536();
					var6.method536();
					var6.method536();
				}

				var6.method538(field1267 - field1278, field1236 - field1279, field1235 - field1277);
			}
		}

		var1.field1396 = true;
		return var1;
	}

	@ObfuscatedName("UFGXOLGK.a(BLUAWAYCTK;)V")
	public final void method496(UAWAYCTK arg0) {
		arg0.field1252 = 0;
		field1265 = arg0.method455();
		field1270 = arg0.method456();
		field1273 = arg0.method456();
		field1276 = null;
		field1269 = 0;
		for (int var2 = 0; var2 < 12; var2++) {
			int var3 = arg0.method455();
			if (var3 == 0) {
				field1266[var2] = 0;
			} else {
				int var4 = arg0.method455();
				field1266[var2] = (var3 << 8) + var4;
				if (var2 == 0 && field1266[0] == 0xFFFF) {
					field1276 = JKAPIYZO.method284(arg0.method457());
					break;
				}

				if (field1266[var2] >= 512 && field1266[var2] - 512 < MHOZCPTF.field922) {
					int var5 = MHOZCPTF.method322(field1266[var2] - 512).field927;
					if (var5 != 0) {
						field1269 = var5;
					}
				}
			}
		}

		for (int var6 = 0; var6 < 5; var6++) {
			int var7 = arg0.method455();
			if (var7 < 0 || var7 >= client.field266[var6].length) {
				var7 = 0;
			}

			field1271[var6] = var7;
		}

		field1220 = arg0.method457();
		if (field1220 == 0xFFFF) {
			field1220 = -1;
		}

		field1221 = arg0.method457();
		if (field1221 == 0xFFFF) {
			field1221 = -1;
		}

		field1223 = arg0.method457();
		if (field1223 == 0xFFFF) {
			field1223 = -1;
		}

		field1224 = arg0.method457();
		if (field1224 == 0xFFFF) {
			field1224 = -1;
		}

		field1225 = arg0.method457();
		if (field1225 == 0xFFFF) {
			field1225 = -1;
		}

		field1226 = arg0.method457();
		if (field1226 == 0xFFFF) {
			field1226 = -1;
		}

		field1227 = arg0.method457();
		if (field1227 == 0xFFFF) {
			field1227 = -1;
		}

		field1283 = VTCTQQUO.method512(VTCTQQUO.method509(arg0.method461()));
		field1275 = arg0.method455();
		field1272 = arg0.method457();
		field1268 = true;
		field1282 = 0L;
		for (int var8 = 0; var8 < 12; var8++) {
			field1282 <<= 4;
			if (field1266[var8] >= 256) {
				field1282 += field1266[var8] - 256;
			}
		}

		if (field1266[0] >= 256) {
			field1282 += field1266[0] - 256 >> 4;
		}

		if (field1266[1] >= 256) {
			field1282 += field1266[1] - 256 >> 8;
		}

		for (int var9 = 0; var9 < 5; var9++) {
			field1282 <<= 3;
			field1282 += field1271[var9];
		}

		field1282 <<= 1;
		field1282 += field1265;
	}

	@ObfuscatedName("UFGXOLGK.b(B)LWEVRTBOZ;")
	public final WEVRTBOZ method497() {
		if (field1276 != null) {
			int var1 = -1;
			if (field1196 >= 0 && field1199 == 0) {
				var1 = RIUJHZLL.field1112[field1196].field1114[field1197];
			} else if (field1238 >= 0) {
				var1 = RIUJHZLL.field1112[field1238].field1114[field1239];
			}

			return field1276.method278(var1, null, -1);
		}

		long var3 = field1282;
		int var5 = -1;
		int var6 = -1;
		int var7 = -1;
		int var8 = -1;
		if (field1196 >= 0 && field1199 == 0) {
			RIUJHZLL var9 = RIUJHZLL.field1112[field1196];
			var5 = var9.field1114[field1197];

			if (field1238 >= 0 && field1238 != field1220) {
				var6 = RIUJHZLL.field1112[field1238].field1114[field1239];
			}

			if (var9.field1121 >= 0) {
				var7 = var9.field1121;
				var3 += var7 - field1266[5] << 40;
			}

			if (var9.field1122 >= 0) {
				var8 = var9.field1122;
				var3 += var8 - field1266[3] << 48;
			}
		} else if (field1238 >= 0) {
			var5 = RIUJHZLL.field1112[field1238].field1114[field1239];
		}

		WEVRTBOZ var10 = (WEVRTBOZ) field1264.method206(var3);
		if (var10 == null) {
			boolean var11 = false;
			for (int var12 = 0; var12 < 12; var12++) {
				int var13 = field1266[var12];
				if (var8 >= 0 && var12 == 3) {
					var13 = var8;
				}

				if (var7 >= 0 && var12 == 5) {
					var13 = var7;
				}

				if (var13 >= 256 && var13 < 512 && !NRLTHETF.field954[var13 - 256].method335()) {
					var11 = true;
				}

				if (var13 >= 512 && !MHOZCPTF.method322(var13 - 512).method318(field1265)) {
					var11 = true;
				}
			}

			if (var11) {
				if (field1274 != -1L) {
					var10 = (WEVRTBOZ) field1264.method206(field1274);
				}

				if (var10 == null) {
					return null;
				}
			}
		}

		if (var10 == null) {
			WEVRTBOZ[] var14 = new WEVRTBOZ[12];
			int var15 = 0;
			for (int var16 = 0; var16 < 12; var16++) {
				int var17 = field1266[var16];
				if (var8 >= 0 && var16 == 3) {
					var17 = var8;
				}

				if (var7 >= 0 && var16 == 5) {
					var17 = var7;
				}

				if (var17 >= 256 && var17 < 512) {
					WEVRTBOZ var18 = NRLTHETF.field954[var17 - 256].method336();
					if (var18 != null) {
						var14[var15++] = var18;
					}
				}

				if (var17 >= 512) {
					WEVRTBOZ var19 = MHOZCPTF.method322(var17 - 512).method311(field1265);
					if (var19 != null) {
						var14[var15++] = var19;
					}
				}
			}

			var10 = new WEVRTBOZ(var15, var14);
			for (int var20 = 0; var20 < 5; var20++) {
				if (field1271[var20] != 0) {
					var10.method539(client.field266[var20][0], client.field266[var20][field1271[var20]]);

					if (var20 == 1) {
						var10.method539(client.field98[0], client.field98[field1271[var20]]);
					}
				}
			}

			var10.method532();
			var10.method542(64, 850, -30, -50, -30, true);
			field1264.method207(var3, var10);
			field1274 = var3;
		}

		if (field1281) {
			return var10;
		}

		WEVRTBOZ var21 = WEVRTBOZ.field1358;
		var21.method527(var10, HJEXDJAH.method218(var5) & HJEXDJAH.method218(var6));

		if (var5 != -1 && var6 != -1) {
			var21.method534(var6, var5, RIUJHZLL.field1112[field1196].field1118);
		} else if (var5 != -1) {
			var21.method533(var5);
		}

		var21.method529();
		var21.field1395 = null;
		var21.field1394 = null;
		return var21;
	}

	@ObfuscatedName("UFGXOLGK.b(Z)Z")
	public final boolean method287() {
		if (!field1268) {
			return false;
		}

		return true;
	}
}
