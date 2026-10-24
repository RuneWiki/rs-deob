package deob;

@ObfuscatedName("ZNUYRYPY")
public final class ZNUYRYPY {

	@ObfuscatedName("ZNUYRYPY.b")
	public int field1445 = -1;

	@ObfuscatedName("ZNUYRYPY.c")
	public int field1446 = 128;

	@ObfuscatedName("ZNUYRYPY.g")
	public int field1450 = -1;

	@ObfuscatedName("ZNUYRYPY.h")
	public int field1451 = 128;

	@ObfuscatedName("ZNUYRYPY.k")
	public int field1453 = -1;

	@ObfuscatedName("ZNUYRYPY.l")
	public boolean field1454 = true;

	@ObfuscatedName("ZNUYRYPY.m")
	public byte field1455 = 1;

	@ObfuscatedName("ZNUYRYPY.n")
	public long field1456 = -1L;

	@ObfuscatedName("ZNUYRYPY.q")
	public int field1459 = -1;

	@ObfuscatedName("ZNUYRYPY.s")
	public int field1461 = -1;

	@ObfuscatedName("ZNUYRYPY.t")
	public int field1462 = -1;

	@ObfuscatedName("ZNUYRYPY.v")
	public int field1463 = -1;

	@ObfuscatedName("ZNUYRYPY.B")
	public int field1468 = -1;

	@ObfuscatedName("ZNUYRYPY.C")
	public int field1469 = -1;

	@ObfuscatedName("ZNUYRYPY.D")
	public boolean field1470 = true;

	@ObfuscatedName("ZNUYRYPY.F")
	public int field1472 = -1;

	@ObfuscatedName("ZNUYRYPY.G")
	public int field1473 = -1;

	@ObfuscatedName("ZNUYRYPY.K")
	public int field1477 = 32;

	@ObfuscatedName("ZNUYRYPY.L")
	public int field1478 = -1;

	@ObfuscatedName("ZNUYRYPY.M")
	public boolean field1479 = false;

	@ObfuscatedName("ZNUYRYPY.p")
	public static CZWVRQJW field1458 = new CZWVRQJW(30);

	@ObfuscatedName("ZNUYRYPY.f")
	public static int field1449;

	@ObfuscatedName("ZNUYRYPY.o")
	public int field1457;

	@ObfuscatedName("ZNUYRYPY.H")
	public int field1474;

	@ObfuscatedName("ZNUYRYPY.I")
	public static int field1475;

	@ObfuscatedName("ZNUYRYPY.J")
	public static LDILQFVA field1476;

	@ObfuscatedName("ZNUYRYPY.i")
	public static client field1452;

	@ObfuscatedName("ZNUYRYPY.E")
	public String field1471;

	@ObfuscatedName("ZNUYRYPY.d")
	public byte[] field1447;

	@ObfuscatedName("ZNUYRYPY.a")
	public int[] field1444;

	@ObfuscatedName("ZNUYRYPY.e")
	public int[] field1448;

	@ObfuscatedName("ZNUYRYPY.r")
	public int[] field1460;

	@ObfuscatedName("ZNUYRYPY.w")
	public int[] field1464;

	@ObfuscatedName("ZNUYRYPY.y")
	public int[] field1466;

	@ObfuscatedName("ZNUYRYPY.A")
	public static int[] field1467;

	@ObfuscatedName("ZNUYRYPY.N")
	public static ZNUYRYPY[] field1480;

	@ObfuscatedName("ZNUYRYPY.x")
	public String[] field1465;

	@ObfuscatedName("ZNUYRYPY.a(I[III)LHEQROJXW;")
	public final HEQROJXW method586(int[] arg0, int arg1, int arg2) {
		if (field1464 != null) {
			ZNUYRYPY var4 = method591();
			if (var4 == null) {
				return null;
			}

			return var4.method586(arg0, arg1, arg2);
		}

		HEQROJXW var5 = (HEQROJXW) field1458.method152(field1456);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1444.length; var7++) {
				if (!HEQROJXW.method323(field1444[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			HEQROJXW[] var8 = new HEQROJXW[field1444.length];
			for (int var9 = 0; var9 < field1444.length; var9++) {
				var8[var9] = HEQROJXW.method322(field1444[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new HEQROJXW(var8.length, var8);
			}

			if (field1448 != null) {
				for (int var10 = 0; var10 < field1448.length; var10++) {
					var5.method336(field1448[var10], field1466[var10]);
				}
			}

			var5.method329();
			var5.method339(field1457 + 64, field1474 + 850, -30, -50, -30, true);
			field1458.method153(var5, field1456);
		}

		HEQROJXW var11 = HEQROJXW.field712;
		var11.method324(UEUSJYYO.method536(arg2) & UEUSJYYO.method536(arg1), var5);

		if (arg2 != -1 && arg1 != -1) {
			var11.method331(arg2, arg0, arg1);
		} else if (arg2 != -1) {
			var11.method330(arg2);
		}

		if (field1451 != 128 || field1446 != 128) {
			var11.method338(field1446, field1451, field1451);
		}

		var11.method326();
		var11.field749 = null;
		var11.field748 = null;

		if (field1455 == 1) {
			var11.field750 = true;
		}

		return var11;
	}

	@ObfuscatedName("ZNUYRYPY.a(LLDILQFVA;I)V")
	public final void method587(LDILQFVA arg0) {
		while (true) {
			int var2 = arg0.method402();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method402();
				field1444 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1444[var4] = arg0.method404();
				}
			} else if (var2 == 2) {
				field1471 = arg0.method409();
			} else if (var2 == 3) {
				field1447 = arg0.method410();
			} else if (var2 == 12) {
				field1455 = arg0.method403();
			} else if (var2 == 13) {
				field1463 = arg0.method404();
			} else if (var2 == 14) {
				field1462 = arg0.method404();
			} else if (var2 == 17) {
				field1462 = arg0.method404();
				field1473 = arg0.method404();
				field1459 = arg0.method404();
				field1450 = arg0.method404();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1465 == null) {
					field1465 = new String[5];
				}

				field1465[var2 - 30] = arg0.method409();
				if (field1465[var2 - 30].equalsIgnoreCase("hidden")) {
					field1465[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method402();
				field1448 = new int[var5];
				field1466 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1448[var6] = arg0.method404();
					field1466[var6] = arg0.method404();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method402();
				field1460 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1460[var8] = arg0.method404();
				}
			} else if (var2 == 90) {
				field1468 = arg0.method404();
			} else if (var2 == 91) {
				field1453 = arg0.method404();
			} else if (var2 == 92) {
				field1472 = arg0.method404();
			} else if (var2 == 93) {
				field1470 = false;
			} else if (var2 == 95) {
				field1478 = arg0.method404();
			} else if (var2 == 97) {
				field1451 = arg0.method404();
			} else if (var2 == 98) {
				field1446 = arg0.method404();
			} else if (var2 == 99) {
				field1479 = true;
			} else if (var2 == 100) {
				field1457 = arg0.method403();
			} else if (var2 == 101) {
				field1474 = arg0.method403() * 5;
			} else if (var2 == 102) {
				field1461 = arg0.method404();
			} else if (var2 == 103) {
				field1477 = arg0.method404();
			} else if (var2 == 106) {
				field1469 = arg0.method404();
				if (field1469 == 0xFFFF) {
					field1469 = -1;
				}

				field1445 = arg0.method404();
				if (field1445 == 0xFFFF) {
					field1445 = -1;
				}

				int var9 = arg0.method402();
				field1464 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1464[var10] = arg0.method404();
					if (field1464[var10] == 0xFFFF) {
						field1464[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1454 = false;
			}
		}
	}

	@ObfuscatedName("ZNUYRYPY.a(LSPZBTZXL;)V")
	public static final void method588(SPZBTZXL arg0) {
		field1476 = new LDILQFVA(arg0.method515("npc.dat", null));
		LDILQFVA var1 = new LDILQFVA(arg0.method515("npc.idx", null));
		field1449 = var1.method404();
		field1467 = new int[field1449];
		int var2 = 2;
		for (int var3 = 0; var3 < field1449; var3++) {
			field1467[var3] = var2;
			var2 += var1.method404();
		}

		field1480 = new ZNUYRYPY[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1480[var4] = new ZNUYRYPY();
		}
	}

	@ObfuscatedName("ZNUYRYPY.a(I)LZNUYRYPY;")
	public static final ZNUYRYPY method589(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1480[var1].field1456) {
				return field1480[var1];
			}
		}

		field1475 = (field1475 + 1) % 20;
		ZNUYRYPY var2 = field1480[field1475] = new ZNUYRYPY();
		field1476.field902 = field1467[arg0];
		var2.field1456 = arg0;
		var2.method587(field1476);
		return var2;
	}

	@ObfuscatedName("ZNUYRYPY.b(I)LHEQROJXW;")
	public final HEQROJXW method590() {
		if (field1464 != null) {
			ZNUYRYPY var1 = method591();
			if (var1 == null) {
				return null;
			}

			return var1.method590();
		} else if (field1460 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1460.length; var3++) {
				if (!HEQROJXW.method323(field1460[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			HEQROJXW[] var4 = new HEQROJXW[field1460.length];
			for (int var5 = 0; var5 < field1460.length; var5++) {
				var4[var5] = HEQROJXW.method322(field1460[var5]);
			}

			HEQROJXW var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new HEQROJXW(var4.length, var4);
			}

			if (field1448 != null) {
				for (int var7 = 0; var7 < field1448.length; var7++) {
					var6.method336(field1448[var7], field1466[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("ZNUYRYPY.c(I)LZNUYRYPY;")
	public final ZNUYRYPY method591() {
		int var1 = -1;
		if (field1469 != -1) {
			LPMARHLZ var2 = LPMARHLZ.field925[field1469];
			int var3 = var2.field927;
			int var4 = var2.field928;
			int var5 = var2.field929;
			int var6 = client.field160[var5 - var4];
			var1 = field1452.field405[var3] >> var4 & var6;
		} else if (field1445 != -1) {
			var1 = field1452.field405[field1445];
		}

		if (var1 >= 0 && var1 < field1464.length && field1464[var1] != -1) {
			return method589(field1464[var1]);
		}

		return null;
	}

	@ObfuscatedName("ZNUYRYPY.d(I)V")
	public static final void method592() {
		field1458 = null;
		field1467 = null;
		field1480 = null;
		field1476 = null;
	}
}
