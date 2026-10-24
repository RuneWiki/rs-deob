package deob;

@ObfuscatedName("WZSDIPBR")
public final class WZSDIPBR {

	@ObfuscatedName("WZSDIPBR.g")
	public int field1283 = -1;

	@ObfuscatedName("WZSDIPBR.h")
	public int field1284 = -1;

	@ObfuscatedName("WZSDIPBR.i")
	public int field1285 = 128;

	@ObfuscatedName("WZSDIPBR.j")
	public int field1286 = -1;

	@ObfuscatedName("WZSDIPBR.m")
	public int field1289 = -1;

	@ObfuscatedName("WZSDIPBR.n")
	public boolean field1290 = false;

	@ObfuscatedName("WZSDIPBR.o")
	public byte field1291 = 1;

	@ObfuscatedName("WZSDIPBR.t")
	public int field1295 = -1;

	@ObfuscatedName("WZSDIPBR.u")
	public int field1296 = -1;

	@ObfuscatedName("WZSDIPBR.v")
	public boolean field1297 = true;

	@ObfuscatedName("WZSDIPBR.w")
	public boolean field1298 = true;

	@ObfuscatedName("WZSDIPBR.x")
	public int field1299 = 128;

	@ObfuscatedName("WZSDIPBR.y")
	public int field1300 = -1;

	@ObfuscatedName("WZSDIPBR.A")
	public int field1302 = 32;

	@ObfuscatedName("WZSDIPBR.B")
	public int field1303 = -1;

	@ObfuscatedName("WZSDIPBR.C")
	public int field1304 = -1;

	@ObfuscatedName("WZSDIPBR.D")
	public int field1305 = -1;

	@ObfuscatedName("WZSDIPBR.E")
	public int field1306 = -1;

	@ObfuscatedName("WZSDIPBR.K")
	public long field1311 = -1L;

	@ObfuscatedName("WZSDIPBR.M")
	public int field1313 = -1;

	@ObfuscatedName("WZSDIPBR.c")
	public static ZYLCKQCD field1280 = new ZYLCKQCD(30);

	@ObfuscatedName("WZSDIPBR.d")
	public int field1281;

	@ObfuscatedName("WZSDIPBR.e")
	public static int field1282;

	@ObfuscatedName("WZSDIPBR.l")
	public int field1288;

	@ObfuscatedName("WZSDIPBR.J")
	public static int field1310;

	@ObfuscatedName("WZSDIPBR.O")
	public static PGNBHFUF field1314;

	@ObfuscatedName("WZSDIPBR.a")
	public static client field1278;

	@ObfuscatedName("WZSDIPBR.b")
	public String field1279;

	@ObfuscatedName("WZSDIPBR.z")
	public byte[] field1301;

	@ObfuscatedName("WZSDIPBR.k")
	public int[] field1287;

	@ObfuscatedName("WZSDIPBR.q")
	public int[] field1292;

	@ObfuscatedName("WZSDIPBR.r")
	public int[] field1293;

	@ObfuscatedName("WZSDIPBR.s")
	public static int[] field1294;

	@ObfuscatedName("WZSDIPBR.H")
	public int[] field1308;

	@ObfuscatedName("WZSDIPBR.I")
	public int[] field1309;

	@ObfuscatedName("WZSDIPBR.G")
	public static WZSDIPBR[] field1307;

	@ObfuscatedName("WZSDIPBR.L")
	public String[] field1312;

	@ObfuscatedName("WZSDIPBR.a(I)LWZSDIPBR;")
	public static final WZSDIPBR method525(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1307[var1].field1311) {
				return field1307[var1];
			}
		}

		field1310 = (field1310 + 1) % 20;
		WZSDIPBR var2 = field1307[field1310] = new WZSDIPBR();
		field1314.field1082 = field1294[arg0];
		var2.field1311 = arg0;
		var2.method529(field1314);
		return var2;
	}

	@ObfuscatedName("WZSDIPBR.a(B)LWZSDIPBR;")
	public final WZSDIPBR method526() {
		int var1 = -1;
		if (field1305 != -1) {
			GDBQCAOA var2 = GDBQCAOA.field701[field1305];
			int var3 = var2.field703;
			int var4 = var2.field704;
			int var5 = var2.field705;
			int var6 = client.field184[var5 - var4];
			var1 = field1278.field322[var3] >> var4 & var6;
		} else if (field1296 != -1) {
			var1 = field1278.field322[field1296];
		}

		if (var1 >= 0 && var1 < field1308.length && field1308[var1] != -1) {
			return method525(field1308[var1]);
		}

		return null;
	}

	@ObfuscatedName("WZSDIPBR.a(I[III)LPOJFANDE;")
	public final POJFANDE method527(int[] arg0, int arg1, int arg2) {
		if (field1308 != null) {
			WZSDIPBR var4 = method526();
			if (var4 == null) {
				return null;
			}

			return var4.method527(arg0, arg1, arg2);
		}

		POJFANDE var5 = (POJFANDE) field1280.method599(field1311);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1309.length; var7++) {
				if (!POJFANDE.method461(field1309[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			POJFANDE[] var8 = new POJFANDE[field1309.length];
			for (int var9 = 0; var9 < field1309.length; var9++) {
				var8[var9] = POJFANDE.method460(field1309[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new POJFANDE(var8.length, var8);
			}

			if (field1287 != null) {
				for (int var10 = 0; var10 < field1287.length; var10++) {
					var5.method474(field1287[var10], field1293[var10]);
				}
			}

			var5.method467();
			var5.method477(field1288 + 64, field1281 + 850, -30, -50, -30, true);
			field1280.method600(var5, field1311);
		}

		POJFANDE var11 = POJFANDE.field1095;
		var11.method462(var5, HVIFHYEW.method287(arg1) & HVIFHYEW.method287(arg2));

		if (arg1 != -1 && arg2 != -1) {
			var11.method469(arg0, arg1, arg2);
		} else if (arg1 != -1) {
			var11.method468(arg1);
		}

		if (field1285 != 128 || field1299 != 128) {
			var11.method476(field1299, field1285, field1285);
		}

		var11.method464();
		var11.field1131 = null;
		var11.field1130 = null;

		if (field1291 == 1) {
			var11.field1132 = true;
		}

		return var11;
	}

	@ObfuscatedName("WZSDIPBR.b(B)LPOJFANDE;")
	public final POJFANDE method528() {
		if (field1308 != null) {
			WZSDIPBR var1 = method526();
			if (var1 == null) {
				return null;
			}

			return var1.method528();
		} else if (field1292 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1292.length; var3++) {
				if (!POJFANDE.method461(field1292[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			POJFANDE[] var4 = new POJFANDE[field1292.length];
			for (int var5 = 0; var5 < field1292.length; var5++) {
				var4[var5] = POJFANDE.method460(field1292[var5]);
			}

			POJFANDE var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new POJFANDE(var4.length, var4);
			}

			if (field1287 != null) {
				for (int var7 = 0; var7 < field1287.length; var7++) {
					var6.method474(field1287[var7], field1293[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("WZSDIPBR.a(LPGNBHFUF;I)V")
	public final void method529(PGNBHFUF arg0) {
		while (true) {
			int var2 = arg0.method420();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method420();
				field1309 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1309[var4] = arg0.method422();
				}
			} else if (var2 == 2) {
				field1279 = arg0.method427();
			} else if (var2 == 3) {
				field1301 = arg0.method428();
			} else if (var2 == 12) {
				field1291 = arg0.method421();
			} else if (var2 == 13) {
				field1313 = arg0.method422();
			} else if (var2 == 14) {
				field1289 = arg0.method422();
			} else if (var2 == 17) {
				field1289 = arg0.method422();
				field1283 = arg0.method422();
				field1286 = arg0.method422();
				field1303 = arg0.method422();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1312 == null) {
					field1312 = new String[5];
				}

				field1312[var2 - 30] = arg0.method427();
				if (field1312[var2 - 30].equalsIgnoreCase("hidden")) {
					field1312[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method420();
				field1287 = new int[var5];
				field1293 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1287[var6] = arg0.method422();
					field1293[var6] = arg0.method422();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method420();
				field1292 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1292[var8] = arg0.method422();
				}
			} else if (var2 == 90) {
				field1295 = arg0.method422();
			} else if (var2 == 91) {
				field1284 = arg0.method422();
			} else if (var2 == 92) {
				field1300 = arg0.method422();
			} else if (var2 == 93) {
				field1297 = false;
			} else if (var2 == 95) {
				field1304 = arg0.method422();
			} else if (var2 == 97) {
				field1285 = arg0.method422();
			} else if (var2 == 98) {
				field1299 = arg0.method422();
			} else if (var2 == 99) {
				field1290 = true;
			} else if (var2 == 100) {
				field1288 = arg0.method421();
			} else if (var2 == 101) {
				field1281 = arg0.method421() * 5;
			} else if (var2 == 102) {
				field1306 = arg0.method422();
			} else if (var2 == 103) {
				field1302 = arg0.method422();
			} else if (var2 == 106) {
				field1305 = arg0.method422();
				if (field1305 == 0xFFFF) {
					field1305 = -1;
				}

				field1296 = arg0.method422();
				if (field1296 == 0xFFFF) {
					field1296 = -1;
				}

				int var9 = arg0.method420();
				field1308 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1308[var10] = arg0.method422();
					if (field1308[var10] == 0xFFFF) {
						field1308[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1298 = false;
			}
		}
	}

	@ObfuscatedName("WZSDIPBR.b(I)Z")
	public boolean method530() {
		if (field1308 == null) {
			return true;
		}

		int var1 = -1;
		if (field1305 != -1) {
			GDBQCAOA var2 = GDBQCAOA.field701[field1305];
			int var3 = var2.field703;
			int var4 = var2.field704;
			int var5 = var2.field705;
			int var6 = client.field184[var5 - var4];
			var1 = field1278.field322[var3] >> var4 & var6;
		} else if (field1296 != -1) {
			var1 = field1278.field322[field1296];
		}

		if (var1 >= 0 && var1 < field1308.length && field1308[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("WZSDIPBR.a(LQDHHNYHL;)V")
	public static final void method531(QDHHNYHL arg0) {
		field1314 = new PGNBHFUF(arg0.method488("npc.dat", null));
		PGNBHFUF var1 = new PGNBHFUF(arg0.method488("npc.idx", null));
		field1282 = var1.method422();
		field1294 = new int[field1282];
		int var2 = 2;
		for (int var3 = 0; var3 < field1282; var3++) {
			field1294[var3] = var2;
			var2 += var1.method422();
		}

		field1307 = new WZSDIPBR[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1307[var4] = new WZSDIPBR();
		}
	}

	@ObfuscatedName("WZSDIPBR.c(I)V")
	public static final void method532() {
		field1280 = null;
		field1294 = null;
		field1307 = null;
		field1314 = null;
	}
}
