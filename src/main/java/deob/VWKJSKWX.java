package deob;

@ObfuscatedName("VWKJSKWX")
public final class VWKJSKWX {

	@ObfuscatedName("VWKJSKWX.b")
	public int field1385 = -1;

	@ObfuscatedName("VWKJSKWX.e")
	public boolean field1388 = true;

	@ObfuscatedName("VWKJSKWX.g")
	public int field1390 = 128;

	@ObfuscatedName("VWKJSKWX.i")
	public int field1392 = -1;

	@ObfuscatedName("VWKJSKWX.j")
	public int field1393 = -1;

	@ObfuscatedName("VWKJSKWX.k")
	public int field1394 = -1;

	@ObfuscatedName("VWKJSKWX.l")
	public long field1395 = -1L;

	@ObfuscatedName("VWKJSKWX.m")
	public boolean field1396 = true;

	@ObfuscatedName("VWKJSKWX.p")
	public int field1399 = -1;

	@ObfuscatedName("VWKJSKWX.r")
	public int field1401 = -1;

	@ObfuscatedName("VWKJSKWX.s")
	public int field1402 = -1;

	@ObfuscatedName("VWKJSKWX.u")
	public int field1404 = 32;

	@ObfuscatedName("VWKJSKWX.x")
	public int field1407 = -1;

	@ObfuscatedName("VWKJSKWX.y")
	public int field1408 = -1;

	@ObfuscatedName("VWKJSKWX.A")
	public byte field1409 = 1;

	@ObfuscatedName("VWKJSKWX.B")
	public boolean field1410 = false;

	@ObfuscatedName("VWKJSKWX.C")
	public int field1411 = -1;

	@ObfuscatedName("VWKJSKWX.D")
	public int field1412 = -1;

	@ObfuscatedName("VWKJSKWX.F")
	public int field1414 = -1;

	@ObfuscatedName("VWKJSKWX.K")
	public int field1419 = 128;

	@ObfuscatedName("VWKJSKWX.f")
	public static UECXVCCS field1389 = new UECXVCCS(30);

	@ObfuscatedName("VWKJSKWX.o")
	public int field1398;

	@ObfuscatedName("VWKJSKWX.t")
	public static int field1403;

	@ObfuscatedName("VWKJSKWX.H")
	public static int field1416;

	@ObfuscatedName("VWKJSKWX.I")
	public int field1417;

	@ObfuscatedName("VWKJSKWX.G")
	public static MLYYHULT field1415;

	@ObfuscatedName("VWKJSKWX.n")
	public static client field1397;

	@ObfuscatedName("VWKJSKWX.h")
	public String field1391;

	@ObfuscatedName("VWKJSKWX.E")
	public byte[] field1413;

	@ObfuscatedName("VWKJSKWX.a")
	public int[] field1384;

	@ObfuscatedName("VWKJSKWX.c")
	public static int[] field1386;

	@ObfuscatedName("VWKJSKWX.d")
	public int[] field1387;

	@ObfuscatedName("VWKJSKWX.q")
	public int[] field1400;

	@ObfuscatedName("VWKJSKWX.J")
	public int[] field1418;

	@ObfuscatedName("VWKJSKWX.L")
	public int[] field1420;

	@ObfuscatedName("VWKJSKWX.v")
	public static VWKJSKWX[] field1405;

	@ObfuscatedName("VWKJSKWX.w")
	public String[] field1406;

	@ObfuscatedName("VWKJSKWX.a(LMLYYHULT;B)V")
	public final void method568(MLYYHULT arg0) {
		while (true) {
			int var2 = arg0.method296();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method296();
				field1418 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1418[var4] = arg0.method298();
				}
			} else if (var2 == 2) {
				field1391 = arg0.method303();
			} else if (var2 == 3) {
				field1413 = arg0.method304();
			} else if (var2 == 12) {
				field1409 = arg0.method297();
			} else if (var2 == 13) {
				field1407 = arg0.method298();
			} else if (var2 == 14) {
				field1385 = arg0.method298();
			} else if (var2 == 17) {
				field1385 = arg0.method298();
				field1402 = arg0.method298();
				field1394 = arg0.method298();
				field1408 = arg0.method298();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1406 == null) {
					field1406 = new String[5];
				}

				field1406[var2 - 30] = arg0.method303();
				if (field1406[var2 - 30].equalsIgnoreCase("hidden")) {
					field1406[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method296();
				field1384 = new int[var5];
				field1420 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1384[var6] = arg0.method298();
					field1420[var6] = arg0.method298();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method296();
				field1387 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1387[var8] = arg0.method298();
				}
			} else if (var2 == 90) {
				field1401 = arg0.method298();
			} else if (var2 == 91) {
				field1393 = arg0.method298();
			} else if (var2 == 92) {
				field1399 = arg0.method298();
			} else if (var2 == 93) {
				field1388 = false;
			} else if (var2 == 95) {
				field1411 = arg0.method298();
			} else if (var2 == 97) {
				field1419 = arg0.method298();
			} else if (var2 == 98) {
				field1390 = arg0.method298();
			} else if (var2 == 99) {
				field1410 = true;
			} else if (var2 == 100) {
				field1417 = arg0.method297();
			} else if (var2 == 101) {
				field1398 = arg0.method297() * 5;
			} else if (var2 == 102) {
				field1392 = arg0.method298();
			} else if (var2 == 103) {
				field1404 = arg0.method298();
			} else if (var2 == 106) {
				field1414 = arg0.method298();
				if (field1414 == 0xFFFF) {
					field1414 = -1;
				}

				field1412 = arg0.method298();
				if (field1412 == 0xFFFF) {
					field1412 = -1;
				}

				int var9 = arg0.method296();
				field1400 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1400[var10] = arg0.method298();
					if (field1400[var10] == 0xFFFF) {
						field1400[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1396 = false;
			}
		}
	}

	@ObfuscatedName("VWKJSKWX.a(I)Z")
	public boolean method569() {
		if (field1400 == null) {
			return true;
		}

		int var1 = -1;
		if (field1414 != -1) {
			WOJPETNO var2 = WOJPETNO.field1422[field1414];
			int var3 = var2.field1424;
			int var4 = var2.field1425;
			int var5 = var2.field1426;
			int var6 = client.field144[var5 - var4];
			var1 = field1397.field262[var3] >> var4 & var6;
		} else if (field1412 != -1) {
			var1 = field1397.field262[field1412];
		}

		if (var1 >= 0 && var1 < field1400.length && field1400[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("VWKJSKWX.b(I)LVWKJSKWX;")
	public final VWKJSKWX method570() {
		int var1 = -1;
		if (field1414 != -1) {
			WOJPETNO var2 = WOJPETNO.field1422[field1414];
			int var3 = var2.field1424;
			int var4 = var2.field1425;
			int var5 = var2.field1426;
			int var6 = client.field144[var5 - var4];
			var1 = field1397.field262[var3] >> var4 & var6;
		} else if (field1412 != -1) {
			var1 = field1397.field262[field1412];
		}

		if (var1 >= 0 && var1 < field1400.length && field1400[var1] != -1) {
			return method574(field1400[var1]);
		}

		return null;
	}

	@ObfuscatedName("VWKJSKWX.c(I)V")
	public static final void method571() {
		field1389 = null;
		field1386 = null;
		field1405 = null;
		field1415 = null;
	}

	@ObfuscatedName("VWKJSKWX.a(III[I)LCADBNSXE;")
	public final CADBNSXE method572(int arg0, int arg1, int[] arg2) {
		if (field1400 != null) {
			VWKJSKWX var4 = method570();
			if (var4 == null) {
				return null;
			}

			return var4.method572(arg0, arg1, arg2);
		}

		CADBNSXE var5 = (CADBNSXE) field1389.method538(field1395);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1418.length; var7++) {
				if (!CADBNSXE.method12(field1418[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			CADBNSXE[] var8 = new CADBNSXE[field1418.length];
			for (int var9 = 0; var9 < field1418.length; var9++) {
				var8[var9] = CADBNSXE.method11(field1418[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new CADBNSXE(var8, var8.length);
			}

			if (field1384 != null) {
				for (int var10 = 0; var10 < field1384.length; var10++) {
					var5.method25(field1384[var10], field1420[var10]);
				}
			}

			var5.method18();
			var5.method28(field1417 + 64, field1398 + 850, -30, -50, -30, true);
			field1389.method539(var5, field1395);
		}

		CADBNSXE var11 = CADBNSXE.field12;
		var11.method13(var5, DFGNFGZH.method215(arg1) & DFGNFGZH.method215(arg0));

		if (arg1 != -1 && arg0 != -1) {
			var11.method20(arg1, arg0, arg2);
		} else if (arg1 != -1) {
			var11.method19(arg1);
		}

		if (field1419 != 128 || field1390 != 128) {
			var11.method27(field1419, field1390, field1419);
		}

		var11.method15();
		var11.field48 = null;
		var11.field47 = null;

		if (field1409 == 1) {
			var11.field49 = true;
		}

		return var11;
	}

	@ObfuscatedName("VWKJSKWX.a(LGWOEELWB;)V")
	public static final void method573(GWOEELWB arg0) {
		field1415 = new MLYYHULT(arg0.method249("npc.dat", null));
		MLYYHULT var1 = new MLYYHULT(arg0.method249("npc.idx", null));
		field1403 = var1.method298();
		field1386 = new int[field1403];
		int var2 = 2;
		for (int var3 = 0; var3 < field1403; var3++) {
			field1386[var3] = var2;
			var2 += var1.method298();
		}

		field1405 = new VWKJSKWX[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1405[var4] = new VWKJSKWX();
		}
	}

	@ObfuscatedName("VWKJSKWX.d(I)LVWKJSKWX;")
	public static final VWKJSKWX method574(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1405[var1].field1395) {
				return field1405[var1];
			}
		}

		field1416 = (field1416 + 1) % 20;
		VWKJSKWX var2 = field1405[field1416] = new VWKJSKWX();
		field1415.field963 = field1386[arg0];
		var2.field1395 = arg0;
		var2.method568(field1415);
		return var2;
	}

	@ObfuscatedName("VWKJSKWX.a(B)LCADBNSXE;")
	public final CADBNSXE method575() {
		if (field1400 != null) {
			VWKJSKWX var1 = method570();
			if (var1 == null) {
				return null;
			}

			return var1.method575();
		} else if (field1387 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1387.length; var3++) {
				if (!CADBNSXE.method12(field1387[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			CADBNSXE[] var4 = new CADBNSXE[field1387.length];
			for (int var5 = 0; var5 < field1387.length; var5++) {
				var4[var5] = CADBNSXE.method11(field1387[var5]);
			}

			CADBNSXE var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new CADBNSXE(var4, var4.length);
			}

			if (field1384 != null) {
				for (int var7 = 0; var7 < field1384.length; var7++) {
					var6.method25(field1384[var7], field1420[var7]);
				}
			}

			return var6;
		}
	}
}
