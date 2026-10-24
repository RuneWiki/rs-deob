package deob;

@ObfuscatedName("XDDMQHDR")
public final class XDDMQHDR {

	@ObfuscatedName("XDDMQHDR.c")
	public long field1463 = -1L;

	@ObfuscatedName("XDDMQHDR.g")
	public int field1465 = -1;

	@ObfuscatedName("XDDMQHDR.i")
	public boolean field1467 = true;

	@ObfuscatedName("XDDMQHDR.j")
	public int field1468 = -1;

	@ObfuscatedName("XDDMQHDR.k")
	public int field1469 = -1;

	@ObfuscatedName("XDDMQHDR.n")
	public boolean field1472 = false;

	@ObfuscatedName("XDDMQHDR.p")
	public int field1474 = 128;

	@ObfuscatedName("XDDMQHDR.q")
	public int field1475 = -1;

	@ObfuscatedName("XDDMQHDR.s")
	public int field1477 = 128;

	@ObfuscatedName("XDDMQHDR.u")
	public int field1478 = -1;

	@ObfuscatedName("XDDMQHDR.v")
	public int field1479 = -1;

	@ObfuscatedName("XDDMQHDR.z")
	public int field1483 = 32;

	@ObfuscatedName("XDDMQHDR.B")
	public int field1485 = -1;

	@ObfuscatedName("XDDMQHDR.D")
	public int field1487 = -1;

	@ObfuscatedName("XDDMQHDR.H")
	public int field1489 = -1;

	@ObfuscatedName("XDDMQHDR.I")
	public int field1490 = -1;

	@ObfuscatedName("XDDMQHDR.J")
	public int field1491 = -1;

	@ObfuscatedName("XDDMQHDR.N")
	public int field1495 = -1;

	@ObfuscatedName("XDDMQHDR.O")
	public boolean field1496 = true;

	@ObfuscatedName("XDDMQHDR.Q")
	public byte field1497 = 1;

	@ObfuscatedName("XDDMQHDR.R")
	public String field1498 = "null";

	@ObfuscatedName("XDDMQHDR.M")
	public static QXKQGEKL field1494 = new QXKQGEKL(30);

	@ObfuscatedName("XDDMQHDR.b")
	public int field1462;

	@ObfuscatedName("XDDMQHDR.f")
	public static int field1464;

	@ObfuscatedName("XDDMQHDR.o")
	public int field1473;

	@ObfuscatedName("XDDMQHDR.w")
	public static int field1480;

	@ObfuscatedName("XDDMQHDR.K")
	public static RGCGKKUR field1492;

	@ObfuscatedName("XDDMQHDR.L")
	public static client field1493;

	@ObfuscatedName("XDDMQHDR.l")
	public byte[] field1470;

	@ObfuscatedName("XDDMQHDR.h")
	public int[] field1466;

	@ObfuscatedName("XDDMQHDR.x")
	public static int[] field1481;

	@ObfuscatedName("XDDMQHDR.y")
	public int[] field1482;

	@ObfuscatedName("XDDMQHDR.A")
	public int[] field1484;

	@ObfuscatedName("XDDMQHDR.C")
	public int[] field1486;

	@ObfuscatedName("XDDMQHDR.F")
	public int[] field1488;

	@ObfuscatedName("XDDMQHDR.r")
	public static XDDMQHDR[] field1476;

	@ObfuscatedName("XDDMQHDR.m")
	public String[] field1471;

	@ObfuscatedName("XDDMQHDR.a(I)LXDDMQHDR;")
	public final XDDMQHDR method580() {
		int var1 = -1;
		if (field1478 != -1) {
			DPQEBGAZ var2 = DPQEBGAZ.field532[field1478];
			int var3 = var2.field534;
			int var4 = var2.field535;
			int var5 = var2.field536;
			int var6 = client.field103[var5 - var4];
			var1 = field1493.field154[var3] >> var4 & var6;
		} else if (field1465 != -1) {
			var1 = field1493.field154[field1465];
		}

		if (var1 >= 0 && var1 < field1466.length && field1466[var1] != -1) {
			return method585(field1466[var1]);
		}

		return null;
	}

	@ObfuscatedName("XDDMQHDR.a(ILRGCGKKUR;)V")
	public final void method581(RGCGKKUR arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method455();
				field1486 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1486[var4] = arg0.method457();
				}
			} else if (var2 == 2) {
				field1498 = arg0.method462();
			} else if (var2 == 3) {
				field1470 = arg0.method463();
			} else if (var2 == 12) {
				field1497 = arg0.method456();
			} else if (var2 == 13) {
				field1495 = arg0.method457();
			} else if (var2 == 14) {
				field1491 = arg0.method457();
			} else if (var2 == 17) {
				field1491 = arg0.method457();
				field1468 = arg0.method457();
				field1489 = arg0.method457();
				field1487 = arg0.method457();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1471 == null) {
					field1471 = new String[5];
				}

				field1471[var2 - 30] = arg0.method462();
				if (field1471[var2 - 30].equalsIgnoreCase("hidden")) {
					field1471[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method455();
				field1484 = new int[var5];
				field1482 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1484[var6] = arg0.method457();
					field1482[var6] = arg0.method457();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method455();
				field1488 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1488[var8] = arg0.method457();
				}
			} else if (var2 == 90) {
				field1475 = arg0.method457();
			} else if (var2 == 91) {
				field1490 = arg0.method457();
			} else if (var2 == 92) {
				field1469 = arg0.method457();
			} else if (var2 == 93) {
				field1496 = false;
			} else if (var2 == 95) {
				field1485 = arg0.method457();
			} else if (var2 == 97) {
				field1477 = arg0.method457();
			} else if (var2 == 98) {
				field1474 = arg0.method457();
			} else if (var2 == 99) {
				field1472 = true;
			} else if (var2 == 100) {
				field1462 = arg0.method456();
			} else if (var2 == 101) {
				field1473 = arg0.method456() * 5;
			} else if (var2 == 102) {
				field1479 = arg0.method457();
			} else if (var2 == 103) {
				field1483 = arg0.method457();
			} else if (var2 == 106) {
				field1478 = arg0.method457();
				if (field1478 == 0xFFFF) {
					field1478 = -1;
				}

				field1465 = arg0.method457();
				if (field1465 == 0xFFFF) {
					field1465 = -1;
				}

				int var9 = arg0.method455();
				field1466 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1466[var10] = arg0.method457();
					if (field1466[var10] == 0xFFFF) {
						field1466[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1467 = false;
			}
		}
	}

	@ObfuscatedName("XDDMQHDR.b(I)V")
	public static final void method582() {
		field1494 = null;
		field1481 = null;
		field1476 = null;
		field1492 = null;
	}

	@ObfuscatedName("XDDMQHDR.a(LESUFCMYV;)V")
	public static final void method583(ESUFCMYV arg0) {
		field1492 = new RGCGKKUR(arg0.method205("npc.dat", null));
		RGCGKKUR var1 = new RGCGKKUR(arg0.method205("npc.idx", null));
		field1480 = var1.method457();
		field1481 = new int[field1480];
		int var2 = 2;
		for (int var3 = 0; var3 < field1480; var3++) {
			field1481[var3] = var2;
			var2 += var1.method457();
		}

		field1476 = new XDDMQHDR[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1476[var4] = new XDDMQHDR();
		}
	}

	@ObfuscatedName("XDDMQHDR.a(III[I)LNGYJLUVS;")
	public final NGYJLUVS method584(int arg0, int arg1, int[] arg2) {
		if (field1466 != null) {
			XDDMQHDR var4 = method580();
			if (var4 == null) {
				return null;
			}

			return var4.method584(arg0, arg1, arg2);
		}

		NGYJLUVS var5 = (NGYJLUVS) field1494.method440(field1463);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1486.length; var7++) {
				if (!NGYJLUVS.method292(field1486[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			NGYJLUVS[] var8 = new NGYJLUVS[field1486.length];
			for (int var9 = 0; var9 < field1486.length; var9++) {
				var8[var9] = NGYJLUVS.method291(field1486[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new NGYJLUVS(var8, var8.length);
			}

			if (field1484 != null) {
				for (int var10 = 0; var10 < field1484.length; var10++) {
					var5.method305(field1484[var10], field1482[var10]);
				}
			}

			var5.method298();
			var5.method308(field1462 + 64, field1473 + 850, -30, -50, -30, true);
			field1494.method441(field1463, var5);
		}

		NGYJLUVS var11 = NGYJLUVS.field855;
		var11.method293(PHDJZMLE.method428(arg1) & PHDJZMLE.method428(arg0), var5);

		if (arg1 != -1 && arg0 != -1) {
			var11.method300(arg0, arg1, arg2);
		} else if (arg1 != -1) {
			var11.method299(arg1);
		}

		if (field1477 != 128 || field1474 != 128) {
			var11.method307(field1477, field1477, field1474);
		}

		var11.method295();
		var11.field891 = null;
		var11.field890 = null;

		if (field1497 == 1) {
			var11.field892 = true;
		}

		return var11;
	}

	@ObfuscatedName("XDDMQHDR.c(I)LXDDMQHDR;")
	public static final XDDMQHDR method585(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1476[var1].field1463) {
				return field1476[var1];
			}
		}

		field1464 = (field1464 + 1) % 20;
		XDDMQHDR var2 = field1476[field1464] = new XDDMQHDR();
		field1492.field1350 = field1481[arg0];
		var2.field1463 = arg0;
		var2.method581(field1492);
		return var2;
	}

	@ObfuscatedName("XDDMQHDR.a(B)Z")
	public boolean method586() {
		if (field1466 == null) {
			return true;
		}

		int var1 = -1;
		if (field1478 != -1) {
			DPQEBGAZ var2 = DPQEBGAZ.field532[field1478];
			int var3 = var2.field534;
			int var4 = var2.field535;
			int var5 = var2.field536;
			int var6 = client.field103[var5 - var4];
			var1 = field1493.field154[var3] >> var4 & var6;
		} else if (field1465 != -1) {
			var1 = field1493.field154[field1465];
		}

		if (var1 >= 0 && var1 < field1466.length && field1466[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("XDDMQHDR.d(I)LNGYJLUVS;")
	public final NGYJLUVS method587() {
		if (field1466 != null) {
			XDDMQHDR var1 = method580();
			if (var1 == null) {
				return null;
			}

			return var1.method587();
		} else if (field1488 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1488.length; var3++) {
				if (!NGYJLUVS.method292(field1488[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			NGYJLUVS[] var4 = new NGYJLUVS[field1488.length];
			for (int var5 = 0; var5 < field1488.length; var5++) {
				var4[var5] = NGYJLUVS.method291(field1488[var5]);
			}

			NGYJLUVS var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new NGYJLUVS(var4, var4.length);
			}

			if (field1484 != null) {
				for (int var7 = 0; var7 < field1484.length; var7++) {
					var6.method305(field1484[var7], field1482[var7]);
				}
			}

			return var6;
		}
	}
}
