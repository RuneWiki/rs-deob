package deob;

@ObfuscatedName("YANZSPIT")
public final class YANZSPIT {

	@ObfuscatedName("YANZSPIT.b")
	public byte field1393 = 1;

	@ObfuscatedName("YANZSPIT.d")
	public int field1395 = -1;

	@ObfuscatedName("YANZSPIT.e")
	public int field1396 = -1;

	@ObfuscatedName("YANZSPIT.f")
	public int field1397 = -1;

	@ObfuscatedName("YANZSPIT.g")
	public int field1398 = -1;

	@ObfuscatedName("YANZSPIT.i")
	public int field1400 = -1;

	@ObfuscatedName("YANZSPIT.j")
	public int field1401 = 128;

	@ObfuscatedName("YANZSPIT.n")
	public int field1404 = -1;

	@ObfuscatedName("YANZSPIT.o")
	public long field1405 = -1L;

	@ObfuscatedName("YANZSPIT.q")
	public int field1406 = 32;

	@ObfuscatedName("YANZSPIT.s")
	public boolean field1408 = true;

	@ObfuscatedName("YANZSPIT.t")
	public boolean field1409 = true;

	@ObfuscatedName("YANZSPIT.u")
	public int field1410 = -1;

	@ObfuscatedName("YANZSPIT.A")
	public int field1415 = -1;

	@ObfuscatedName("YANZSPIT.C")
	public int field1417 = -1;

	@ObfuscatedName("YANZSPIT.D")
	public String field1418 = "null";

	@ObfuscatedName("YANZSPIT.E")
	public int field1419 = -1;

	@ObfuscatedName("YANZSPIT.H")
	public boolean field1422 = false;

	@ObfuscatedName("YANZSPIT.K")
	public int field1424 = 128;

	@ObfuscatedName("YANZSPIT.L")
	public int field1425 = -1;

	@ObfuscatedName("YANZSPIT.P")
	public int field1429 = -1;

	@ObfuscatedName("YANZSPIT.h")
	public static JGECYJMS field1399 = new JGECYJMS(30);

	@ObfuscatedName("YANZSPIT.m")
	public static int field1403;

	@ObfuscatedName("YANZSPIT.v")
	public int field1411;

	@ObfuscatedName("YANZSPIT.G")
	public static int field1421;

	@ObfuscatedName("YANZSPIT.I")
	public int field1423;

	@ObfuscatedName("YANZSPIT.r")
	public static TQYMAXSO field1407;

	@ObfuscatedName("YANZSPIT.O")
	public static client field1428;

	@ObfuscatedName("YANZSPIT.F")
	public byte[] field1420;

	@ObfuscatedName("YANZSPIT.c")
	public int[] field1394;

	@ObfuscatedName("YANZSPIT.l")
	public int[] field1402;

	@ObfuscatedName("YANZSPIT.w")
	public int[] field1412;

	@ObfuscatedName("YANZSPIT.x")
	public int[] field1413;

	@ObfuscatedName("YANZSPIT.B")
	public int[] field1416;

	@ObfuscatedName("YANZSPIT.M")
	public static int[] field1426;

	@ObfuscatedName("YANZSPIT.N")
	public static YANZSPIT[] field1427;

	@ObfuscatedName("YANZSPIT.z")
	public String[] field1414;

	@ObfuscatedName("YANZSPIT.a([IIII)LKDWDYCIL;")
	public final KDWDYCIL method561(int[] arg0, int arg1, int arg2) {
		if (field1413 != null) {
			YANZSPIT var4 = method568();
			if (var4 == null) {
				return null;
			}

			return var4.method561(arg0, arg1, arg2);
		}

		KDWDYCIL var5 = (KDWDYCIL) field1399.method230(field1405);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1394.length; var7++) {
				if (!KDWDYCIL.method247(field1394[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			KDWDYCIL[] var8 = new KDWDYCIL[field1394.length];
			for (int var9 = 0; var9 < field1394.length; var9++) {
				var8[var9] = KDWDYCIL.method246(field1394[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new KDWDYCIL(var8, var8.length);
			}

			if (field1416 != null) {
				for (int var10 = 0; var10 < field1416.length; var10++) {
					var5.method260(field1416[var10], field1402[var10]);
				}
			}

			var5.method253();
			var5.method263(field1423 + 64, field1411 + 850, -30, -50, -30, true);
			field1399.method231(field1405, var5);
		}

		KDWDYCIL var11 = KDWDYCIL.field761;
		var11.method248(SGSYCWFB.method423(arg1) & SGSYCWFB.method423(arg2), var5);

		if (arg1 != -1 && arg2 != -1) {
			var11.method255(arg2, arg1, arg0);
		} else if (arg1 != -1) {
			var11.method254(arg1);
		}

		if (field1401 != 128 || field1424 != 128) {
			var11.method262(field1401, field1401, field1424);
		}

		var11.method250();
		var11.field797 = null;
		var11.field796 = null;

		if (field1393 == 1) {
			var11.field798 = true;
		}

		return var11;
	}

	@ObfuscatedName("YANZSPIT.a(I)V")
	public static final void method562() {
		field1399 = null;
		field1426 = null;
		field1427 = null;
		field1407 = null;
	}

	@ObfuscatedName("YANZSPIT.b(I)LYANZSPIT;")
	public static final YANZSPIT method563(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1427[var1].field1405) {
				return field1427[var1];
			}
		}

		field1421 = (field1421 + 1) % 20;
		YANZSPIT var2 = field1427[field1421] = new YANZSPIT();
		field1407.field1263 = field1426[arg0];
		var2.field1405 = arg0;
		var2.method566(field1407);
		return var2;
	}

	@ObfuscatedName("YANZSPIT.c(I)LKDWDYCIL;")
	public final KDWDYCIL method564() {
		if (field1413 != null) {
			YANZSPIT var1 = method568();
			if (var1 == null) {
				return null;
			}

			return var1.method564();
		} else if (field1412 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1412.length; var3++) {
				if (!KDWDYCIL.method247(field1412[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			KDWDYCIL[] var4 = new KDWDYCIL[field1412.length];
			for (int var5 = 0; var5 < field1412.length; var5++) {
				var4[var5] = KDWDYCIL.method246(field1412[var5]);
			}

			KDWDYCIL var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new KDWDYCIL(var4, var4.length);
			}

			if (field1416 != null) {
				for (int var7 = 0; var7 < field1416.length; var7++) {
					var6.method260(field1416[var7], field1402[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("YANZSPIT.a(LSXKKBWPU;)V")
	public static final void method565(SXKKBWPU arg0) {
		field1407 = new TQYMAXSO(arg0.method442("npc.dat", null));
		TQYMAXSO var1 = new TQYMAXSO(arg0.method442("npc.idx", null));
		field1403 = var1.method470();
		field1426 = new int[field1403];
		int var2 = 2;
		for (int var3 = 0; var3 < field1403; var3++) {
			field1426[var3] = var2;
			var2 += var1.method470();
		}

		field1427 = new YANZSPIT[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1427[var4] = new YANZSPIT();
		}
	}

	@ObfuscatedName("YANZSPIT.a(ILTQYMAXSO;)V")
	public final void method566(TQYMAXSO arg0) {
		while (true) {
			int var2 = arg0.method468();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method468();
				field1394 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1394[var4] = arg0.method470();
				}
			} else if (var2 == 2) {
				field1418 = arg0.method475();
			} else if (var2 == 3) {
				field1420 = arg0.method476();
			} else if (var2 == 12) {
				field1393 = arg0.method469();
			} else if (var2 == 13) {
				field1395 = arg0.method470();
			} else if (var2 == 14) {
				field1417 = arg0.method470();
			} else if (var2 == 17) {
				field1417 = arg0.method470();
				field1400 = arg0.method470();
				field1425 = arg0.method470();
				field1410 = arg0.method470();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1414 == null) {
					field1414 = new String[5];
				}

				field1414[var2 - 30] = arg0.method475();
				if (field1414[var2 - 30].equalsIgnoreCase("hidden")) {
					field1414[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method468();
				field1416 = new int[var5];
				field1402 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1416[var6] = arg0.method470();
					field1402[var6] = arg0.method470();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method468();
				field1412 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1412[var8] = arg0.method470();
				}
			} else if (var2 == 90) {
				field1415 = arg0.method470();
			} else if (var2 == 91) {
				field1398 = arg0.method470();
			} else if (var2 == 92) {
				field1404 = arg0.method470();
			} else if (var2 == 93) {
				field1408 = false;
			} else if (var2 == 95) {
				field1397 = arg0.method470();
			} else if (var2 == 97) {
				field1401 = arg0.method470();
			} else if (var2 == 98) {
				field1424 = arg0.method470();
			} else if (var2 == 99) {
				field1422 = true;
			} else if (var2 == 100) {
				field1423 = arg0.method469();
			} else if (var2 == 101) {
				field1411 = arg0.method469() * 5;
			} else if (var2 == 102) {
				field1419 = arg0.method470();
			} else if (var2 == 103) {
				field1406 = arg0.method470();
			} else if (var2 == 106) {
				field1396 = arg0.method470();
				if (field1396 == 0xFFFF) {
					field1396 = -1;
				}

				field1429 = arg0.method470();
				if (field1429 == 0xFFFF) {
					field1429 = -1;
				}

				int var9 = arg0.method468();
				field1413 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1413[var10] = arg0.method470();
					if (field1413[var10] == 0xFFFF) {
						field1413[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1409 = false;
			}
		}
	}

	@ObfuscatedName("YANZSPIT.d(I)Z")
	public boolean method567() {
		if (field1413 == null) {
			return true;
		}

		int var1 = -1;
		if (field1396 != -1) {
			ATLVWFDY var2 = ATLVWFDY.field69[field1396];
			int var3 = var2.field71;
			int var4 = var2.field72;
			int var5 = var2.field73;
			int var6 = client.field271[var5 - var4];
			var1 = field1428.field341[var3] >> var4 & var6;
		} else if (field1429 != -1) {
			var1 = field1428.field341[field1429];
		}

		if (var1 >= 0 && var1 < field1413.length && field1413[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("YANZSPIT.e(I)LYANZSPIT;")
	public final YANZSPIT method568() {
		int var1 = -1;
		if (field1396 != -1) {
			ATLVWFDY var2 = ATLVWFDY.field69[field1396];
			int var3 = var2.field71;
			int var4 = var2.field72;
			int var5 = var2.field73;
			int var6 = client.field271[var5 - var4];
			var1 = field1428.field341[var3] >> var4 & var6;
		} else if (field1429 != -1) {
			var1 = field1428.field341[field1429];
		}

		if (var1 >= 0 && var1 < field1413.length && field1413[var1] != -1) {
			return method563(field1413[var1]);
		}

		return null;
	}
}
