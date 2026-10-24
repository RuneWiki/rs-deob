package deob;

@ObfuscatedName("UGDYQAXI")
public final class UGDYQAXI {

	@ObfuscatedName("UGDYQAXI.a")
	public int field1288 = -1;

	@ObfuscatedName("UGDYQAXI.b")
	public boolean field1289 = true;

	@ObfuscatedName("UGDYQAXI.f")
	public int field1293 = -1;

	@ObfuscatedName("UGDYQAXI.h")
	public int field1295 = -1;

	@ObfuscatedName("UGDYQAXI.i")
	public int field1296 = -1;

	@ObfuscatedName("UGDYQAXI.j")
	public int field1297 = -1;

	@ObfuscatedName("UGDYQAXI.l")
	public byte field1299 = 1;

	@ObfuscatedName("UGDYQAXI.m")
	public int field1300 = -1;

	@ObfuscatedName("UGDYQAXI.p")
	public boolean field1303 = true;

	@ObfuscatedName("UGDYQAXI.q")
	public int field1304 = -1;

	@ObfuscatedName("UGDYQAXI.r")
	public int field1305 = 128;

	@ObfuscatedName("UGDYQAXI.s")
	public int field1306 = -1;

	@ObfuscatedName("UGDYQAXI.u")
	public int field1307 = -1;

	@ObfuscatedName("UGDYQAXI.A")
	public int field1312 = -1;

	@ObfuscatedName("UGDYQAXI.B")
	public boolean field1313 = false;

	@ObfuscatedName("UGDYQAXI.D")
	public int field1315 = -1;

	@ObfuscatedName("UGDYQAXI.E")
	public int field1316 = 128;

	@ObfuscatedName("UGDYQAXI.F")
	public int field1317 = -1;

	@ObfuscatedName("UGDYQAXI.G")
	public int field1318 = 32;

	@ObfuscatedName("UGDYQAXI.J")
	public long field1321 = -1L;

	@ObfuscatedName("UGDYQAXI.I")
	public static TUCAQTOR field1320 = new TUCAQTOR(30);

	@ObfuscatedName("UGDYQAXI.c")
	public int field1290;

	@ObfuscatedName("UGDYQAXI.k")
	public static int field1298;

	@ObfuscatedName("UGDYQAXI.o")
	public static int field1302;

	@ObfuscatedName("UGDYQAXI.H")
	public int field1319;

	@ObfuscatedName("UGDYQAXI.K")
	public static KHOMSBHW field1322;

	@ObfuscatedName("UGDYQAXI.z")
	public static client field1311;

	@ObfuscatedName("UGDYQAXI.d")
	public String field1291;

	@ObfuscatedName("UGDYQAXI.C")
	public byte[] field1314;

	@ObfuscatedName("UGDYQAXI.e")
	public int[] field1292;

	@ObfuscatedName("UGDYQAXI.g")
	public int[] field1294;

	@ObfuscatedName("UGDYQAXI.n")
	public int[] field1301;

	@ObfuscatedName("UGDYQAXI.w")
	public int[] field1308;

	@ObfuscatedName("UGDYQAXI.y")
	public static int[] field1310;

	@ObfuscatedName("UGDYQAXI.M")
	public int[] field1323;

	@ObfuscatedName("UGDYQAXI.x")
	public static UGDYQAXI[] field1309;

	@ObfuscatedName("UGDYQAXI.N")
	public String[] field1324;

	@ObfuscatedName("UGDYQAXI.a(LSYUGXMZF;)V")
	public static final void method569(SYUGXMZF arg0) {
		field1322 = new KHOMSBHW(arg0.method551("npc.dat", null));
		KHOMSBHW var1 = new KHOMSBHW(arg0.method551("npc.idx", null));
		field1298 = var1.method351();
		field1310 = new int[field1298];
		int var2 = 2;
		for (int var3 = 0; var3 < field1298; var3++) {
			field1310[var3] = var2;
			var2 += var1.method351();
		}

		field1309 = new UGDYQAXI[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1309[var4] = new UGDYQAXI();
		}
	}

	@ObfuscatedName("UGDYQAXI.a(I)LUGDYQAXI;")
	public static final UGDYQAXI method570(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1309[var1].field1321) {
				return field1309[var1];
			}
		}

		field1302 = (field1302 + 1) % 20;
		UGDYQAXI var2 = field1309[field1302] = new UGDYQAXI();
		field1322.field934 = field1310[arg0];
		var2.field1321 = arg0;
		var2.method572(field1322);
		return var2;
	}

	@ObfuscatedName("UGDYQAXI.b(I)LGEUHTGZJ;")
	public final GEUHTGZJ method571() {
		if (field1301 != null) {
			UGDYQAXI var1 = method574();
			if (var1 == null) {
				return null;
			}

			return var1.method571();
		} else if (field1292 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1292.length; var3++) {
				if (!GEUHTGZJ.method286(field1292[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			GEUHTGZJ[] var4 = new GEUHTGZJ[field1292.length];
			for (int var5 = 0; var5 < field1292.length; var5++) {
				var4[var5] = GEUHTGZJ.method285(field1292[var5]);
			}

			GEUHTGZJ var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new GEUHTGZJ(var4, var4.length);
			}

			if (field1308 != null) {
				for (int var7 = 0; var7 < field1308.length; var7++) {
					var6.method299(field1308[var7], field1294[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("UGDYQAXI.a(LKHOMSBHW;I)V")
	public final void method572(KHOMSBHW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method349();
				field1323 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1323[var4] = arg0.method351();
				}
			} else if (var2 == 2) {
				field1291 = arg0.method356();
			} else if (var2 == 3) {
				field1314 = arg0.method357();
			} else if (var2 == 12) {
				field1299 = arg0.method350();
			} else if (var2 == 13) {
				field1295 = arg0.method351();
			} else if (var2 == 14) {
				field1306 = arg0.method351();
			} else if (var2 == 17) {
				field1306 = arg0.method351();
				field1307 = arg0.method351();
				field1315 = arg0.method351();
				field1297 = arg0.method351();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1324 == null) {
					field1324 = new String[5];
				}

				field1324[var2 - 30] = arg0.method356();
				if (field1324[var2 - 30].equalsIgnoreCase("hidden")) {
					field1324[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method349();
				field1308 = new int[var5];
				field1294 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1308[var6] = arg0.method351();
					field1294[var6] = arg0.method351();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method349();
				field1292 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1292[var8] = arg0.method351();
				}
			} else if (var2 == 90) {
				field1288 = arg0.method351();
			} else if (var2 == 91) {
				field1317 = arg0.method351();
			} else if (var2 == 92) {
				field1300 = arg0.method351();
			} else if (var2 == 93) {
				field1289 = false;
			} else if (var2 == 95) {
				field1293 = arg0.method351();
			} else if (var2 == 97) {
				field1316 = arg0.method351();
			} else if (var2 == 98) {
				field1305 = arg0.method351();
			} else if (var2 == 99) {
				field1313 = true;
			} else if (var2 == 100) {
				field1319 = arg0.method350();
			} else if (var2 == 101) {
				field1290 = arg0.method350() * 5;
			} else if (var2 == 102) {
				field1304 = arg0.method351();
			} else if (var2 == 103) {
				field1318 = arg0.method351();
			} else if (var2 == 106) {
				field1312 = arg0.method351();
				if (field1312 == 0xFFFF) {
					field1312 = -1;
				}

				field1296 = arg0.method351();
				if (field1296 == 0xFFFF) {
					field1296 = -1;
				}

				int var9 = arg0.method349();
				field1301 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1301[var10] = arg0.method351();
					if (field1301[var10] == 0xFFFF) {
						field1301[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1303 = false;
			}
		}
	}

	@ObfuscatedName("UGDYQAXI.c(I)V")
	public static final void method573() {
		field1320 = null;
		field1310 = null;
		field1309 = null;
		field1322 = null;
	}

	@ObfuscatedName("UGDYQAXI.a(B)LUGDYQAXI;")
	public final UGDYQAXI method574() {
		int var1 = -1;
		if (field1312 != -1) {
			GAQBLBTP var2 = GAQBLBTP.field700[field1312];
			int var3 = var2.field702;
			int var4 = var2.field703;
			int var5 = var2.field704;
			int var6 = client.field480[var5 - var4];
			var1 = field1311.field257[var3] >> var4 & var6;
		} else if (field1296 != -1) {
			var1 = field1311.field257[field1296];
		}

		if (var1 >= 0 && var1 < field1301.length && field1301[var1] != -1) {
			return method570(field1301[var1]);
		}

		return null;
	}

	@ObfuscatedName("UGDYQAXI.a(IIB[I)LGEUHTGZJ;")
	public final GEUHTGZJ method575(int arg0, int arg1, int[] arg2) {
		if (field1301 != null) {
			UGDYQAXI var4 = method574();
			if (var4 == null) {
				return null;
			}

			return var4.method575(arg0, arg1, arg2);
		}

		GEUHTGZJ var5 = (GEUHTGZJ) field1320.method566(field1321);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1323.length; var7++) {
				if (!GEUHTGZJ.method286(field1323[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			GEUHTGZJ[] var8 = new GEUHTGZJ[field1323.length];
			for (int var9 = 0; var9 < field1323.length; var9++) {
				var8[var9] = GEUHTGZJ.method285(field1323[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new GEUHTGZJ(var8, var8.length);
			}

			if (field1308 != null) {
				for (int var10 = 0; var10 < field1308.length; var10++) {
					var5.method299(field1308[var10], field1294[var10]);
				}
			}

			var5.method292();
			var5.method302(field1319 + 64, field1290 + 850, -30, -50, -30, true);
			field1320.method567(var5, field1321);
		}

		GEUHTGZJ var11 = GEUHTGZJ.field709;
		var11.method287(var5, QWCFKPFT.method504(arg1) & QWCFKPFT.method504(arg0));

		if (arg1 != -1 && arg0 != -1) {
			var11.method294(arg1, arg2, arg0);
		} else if (arg1 != -1) {
			var11.method293(arg1);
		}

		if (field1316 != 128 || field1305 != 128) {
			var11.method301(field1305, field1316, field1316);
		}

		var11.method289();
		var11.field746 = null;
		var11.field745 = null;

		if (field1299 == 1) {
			var11.field747 = true;
		}

		return var11;
	}
}
