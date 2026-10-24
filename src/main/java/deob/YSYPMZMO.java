package deob;

@ObfuscatedName("YSYPMZMO")
public final class YSYPMZMO {

	@ObfuscatedName("YSYPMZMO.a")
	public int field1447 = -1;

	@ObfuscatedName("YSYPMZMO.c")
	public boolean field1448 = false;

	@ObfuscatedName("YSYPMZMO.e")
	public int field1449 = -1;

	@ObfuscatedName("YSYPMZMO.f")
	public int field1450 = -1;

	@ObfuscatedName("YSYPMZMO.g")
	public int field1451 = -1;

	@ObfuscatedName("YSYPMZMO.h")
	public int field1452 = -1;

	@ObfuscatedName("YSYPMZMO.j")
	public int field1454 = -1;

	@ObfuscatedName("YSYPMZMO.n")
	public byte field1457 = 1;

	@ObfuscatedName("YSYPMZMO.q")
	public String field1460 = "null";

	@ObfuscatedName("YSYPMZMO.u")
	public int field1464 = -1;

	@ObfuscatedName("YSYPMZMO.w")
	public boolean field1466 = true;

	@ObfuscatedName("YSYPMZMO.x")
	public boolean field1467 = true;

	@ObfuscatedName("YSYPMZMO.z")
	public long field1469 = -1L;

	@ObfuscatedName("YSYPMZMO.B")
	public int field1471 = 128;

	@ObfuscatedName("YSYPMZMO.C")
	public int field1472 = -1;

	@ObfuscatedName("YSYPMZMO.F")
	public int field1475 = -1;

	@ObfuscatedName("YSYPMZMO.G")
	public int field1476 = -1;

	@ObfuscatedName("YSYPMZMO.H")
	public int field1477 = 128;

	@ObfuscatedName("YSYPMZMO.I")
	public int field1478 = 32;

	@ObfuscatedName("YSYPMZMO.M")
	public int field1481 = -1;

	@ObfuscatedName("YSYPMZMO.O")
	public int field1483 = -1;

	@ObfuscatedName("YSYPMZMO.t")
	public static BMKJVFXV field1463 = new BMKJVFXV(30);

	@ObfuscatedName("YSYPMZMO.i")
	public int field1453;

	@ObfuscatedName("YSYPMZMO.m")
	public static int field1456;

	@ObfuscatedName("YSYPMZMO.v")
	public static int field1465;

	@ObfuscatedName("YSYPMZMO.A")
	public int field1470;

	@ObfuscatedName("YSYPMZMO.N")
	public static BSNPYLEV field1482;

	@ObfuscatedName("YSYPMZMO.l")
	public static client field1455;

	@ObfuscatedName("YSYPMZMO.y")
	public byte[] field1468;

	@ObfuscatedName("YSYPMZMO.o")
	public static int[] field1458;

	@ObfuscatedName("YSYPMZMO.p")
	public int[] field1459;

	@ObfuscatedName("YSYPMZMO.r")
	public int[] field1461;

	@ObfuscatedName("YSYPMZMO.s")
	public int[] field1462;

	@ObfuscatedName("YSYPMZMO.D")
	public int[] field1473;

	@ObfuscatedName("YSYPMZMO.L")
	public int[] field1480;

	@ObfuscatedName("YSYPMZMO.J")
	public static YSYPMZMO[] field1479;

	@ObfuscatedName("YSYPMZMO.E")
	public String[] field1474;

	@ObfuscatedName("YSYPMZMO.a(I[III)LRMLAXPMV;")
	public final RMLAXPMV method593(int[] arg0, int arg1, int arg2) {
		if (field1461 != null) {
			YSYPMZMO var4 = method599();
			if (var4 == null) {
				return null;
			}

			return var4.method593(arg0, arg1, arg2);
		}

		RMLAXPMV var5 = (RMLAXPMV) field1463.method32(field1469);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1473.length; var7++) {
				if (!RMLAXPMV.method467(field1473[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			RMLAXPMV[] var8 = new RMLAXPMV[field1473.length];
			for (int var9 = 0; var9 < field1473.length; var9++) {
				var8[var9] = RMLAXPMV.method466(field1473[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new RMLAXPMV(var8.length, var8);
			}

			if (field1480 != null) {
				for (int var10 = 0; var10 < field1480.length; var10++) {
					var5.method480(field1480[var10], field1462[var10]);
				}
			}

			var5.method473();
			var5.method483(field1470 + 64, field1453 + 850, -30, -50, -30, true);
			field1463.method33(field1469, var5);
		}

		RMLAXPMV var11 = RMLAXPMV.field1134;
		var11.method468(XMRZESBN.method586(arg1) & XMRZESBN.method586(arg2), var5);

		if (arg1 != -1 && arg2 != -1) {
			var11.method475(arg2, arg1, arg0);
		} else if (arg1 != -1) {
			var11.method474(arg1);
		}

		if (field1477 != 128 || field1471 != 128) {
			var11.method482(field1471, field1477, field1477);
		}

		var11.method470();
		var11.field1170 = null;
		var11.field1169 = null;

		if (field1457 == 1) {
			var11.field1171 = true;
		}

		return var11;
	}

	@ObfuscatedName("YSYPMZMO.a(ILBSNPYLEV;)V")
	public final void method594(BSNPYLEV arg0) {
		while (true) {
			int var2 = arg0.method47();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method47();
				field1473 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1473[var4] = arg0.method49();
				}
			} else if (var2 == 2) {
				field1460 = arg0.method54();
			} else if (var2 == 3) {
				field1468 = arg0.method55();
			} else if (var2 == 12) {
				field1457 = arg0.method48();
			} else if (var2 == 13) {
				field1447 = arg0.method49();
			} else if (var2 == 14) {
				field1451 = arg0.method49();
			} else if (var2 == 17) {
				field1451 = arg0.method49();
				field1454 = arg0.method49();
				field1472 = arg0.method49();
				field1475 = arg0.method49();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1474 == null) {
					field1474 = new String[5];
				}

				field1474[var2 - 30] = arg0.method54();
				if (field1474[var2 - 30].equalsIgnoreCase("hidden")) {
					field1474[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method47();
				field1480 = new int[var5];
				field1462 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1480[var6] = arg0.method49();
					field1462[var6] = arg0.method49();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method47();
				field1459 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1459[var8] = arg0.method49();
				}
			} else if (var2 == 90) {
				field1476 = arg0.method49();
			} else if (var2 == 91) {
				field1452 = arg0.method49();
			} else if (var2 == 92) {
				field1449 = arg0.method49();
			} else if (var2 == 93) {
				field1466 = false;
			} else if (var2 == 95) {
				field1464 = arg0.method49();
			} else if (var2 == 97) {
				field1477 = arg0.method49();
			} else if (var2 == 98) {
				field1471 = arg0.method49();
			} else if (var2 == 99) {
				field1448 = true;
			} else if (var2 == 100) {
				field1470 = arg0.method48();
			} else if (var2 == 101) {
				field1453 = arg0.method48() * 5;
			} else if (var2 == 102) {
				field1481 = arg0.method49();
			} else if (var2 == 103) {
				field1478 = arg0.method49();
			} else if (var2 == 106) {
				field1483 = arg0.method49();
				if (field1483 == 0xFFFF) {
					field1483 = -1;
				}

				field1450 = arg0.method49();
				if (field1450 == 0xFFFF) {
					field1450 = -1;
				}

				int var9 = arg0.method47();
				field1461 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1461[var10] = arg0.method49();
					if (field1461[var10] == 0xFFFF) {
						field1461[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1467 = false;
			}
		}
	}

	@ObfuscatedName("YSYPMZMO.a(I)V")
	public static final void method595() {
		field1463 = null;
		field1458 = null;
		field1479 = null;
		field1482 = null;
	}

	@ObfuscatedName("YSYPMZMO.b(I)Z")
	public boolean method596() {
		if (field1461 == null) {
			return true;
		}

		int var1 = -1;
		if (field1483 != -1) {
			DUEJVLYB var2 = DUEJVLYB.field550[field1483];
			int var3 = var2.field552;
			int var4 = var2.field553;
			int var5 = var2.field554;
			int var6 = client.field238[var5 - var4];
			var1 = field1455.field148[var3] >> var4 & var6;
		} else if (field1450 != -1) {
			var1 = field1455.field148[field1450];
		}

		if (var1 >= 0 && var1 < field1461.length && field1461[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("YSYPMZMO.c(I)LYSYPMZMO;")
	public static final YSYPMZMO method597(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1479[var1].field1469) {
				return field1479[var1];
			}
		}

		field1465 = (field1465 + 1) % 20;
		YSYPMZMO var2 = field1479[field1465] = new YSYPMZMO();
		field1482.field55 = field1458[arg0];
		var2.field1469 = arg0;
		var2.method594(field1482);
		return var2;
	}

	@ObfuscatedName("YSYPMZMO.a(LSMIVAFST;)V")
	public static final void method598(SMIVAFST arg0) {
		field1482 = new BSNPYLEV(arg0.method512("npc.dat", null));
		BSNPYLEV var1 = new BSNPYLEV(arg0.method512("npc.idx", null));
		field1456 = var1.method49();
		field1458 = new int[field1456];
		int var2 = 2;
		for (int var3 = 0; var3 < field1456; var3++) {
			field1458[var3] = var2;
			var2 += var1.method49();
		}

		field1479 = new YSYPMZMO[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1479[var4] = new YSYPMZMO();
		}
	}

	@ObfuscatedName("YSYPMZMO.a(B)LYSYPMZMO;")
	public final YSYPMZMO method599() {
		int var1 = -1;
		if (field1483 != -1) {
			DUEJVLYB var2 = DUEJVLYB.field550[field1483];
			int var3 = var2.field552;
			int var4 = var2.field553;
			int var5 = var2.field554;
			int var6 = client.field238[var5 - var4];
			var1 = field1455.field148[var3] >> var4 & var6;
		} else if (field1450 != -1) {
			var1 = field1455.field148[field1450];
		}

		if (var1 >= 0 && var1 < field1461.length && field1461[var1] != -1) {
			return method597(field1461[var1]);
		}

		return null;
	}

	@ObfuscatedName("YSYPMZMO.d(I)LRMLAXPMV;")
	public final RMLAXPMV method600() {
		if (field1461 != null) {
			YSYPMZMO var1 = method599();
			if (var1 == null) {
				return null;
			}

			return var1.method600();
		} else if (field1459 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1459.length; var3++) {
				if (!RMLAXPMV.method467(field1459[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			RMLAXPMV[] var4 = new RMLAXPMV[field1459.length];
			for (int var5 = 0; var5 < field1459.length; var5++) {
				var4[var5] = RMLAXPMV.method466(field1459[var5]);
			}

			RMLAXPMV var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new RMLAXPMV(var4.length, var4);
			}

			if (field1480 != null) {
				for (int var7 = 0; var7 < field1480.length; var7++) {
					var6.method480(field1480[var7], field1462[var7]);
				}
			}

			return var6;
		}
	}
}
