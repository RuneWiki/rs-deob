package deob;

@ObfuscatedName("ZLQCXMFK")
public final class ZLQCXMFK {

	@ObfuscatedName("ZLQCXMFK.b")
	public int field1399 = -1;

	@ObfuscatedName("ZLQCXMFK.c")
	public String field1400 = "null";

	@ObfuscatedName("ZLQCXMFK.d")
	public long field1401 = -1L;

	@ObfuscatedName("ZLQCXMFK.f")
	public int field1403 = -1;

	@ObfuscatedName("ZLQCXMFK.g")
	public int field1404 = 128;

	@ObfuscatedName("ZLQCXMFK.o")
	public int field1411 = -1;

	@ObfuscatedName("ZLQCXMFK.p")
	public int field1412 = -1;

	@ObfuscatedName("ZLQCXMFK.q")
	public int field1413 = -1;

	@ObfuscatedName("ZLQCXMFK.t")
	public boolean field1416 = true;

	@ObfuscatedName("ZLQCXMFK.u")
	public int field1417 = 128;

	@ObfuscatedName("ZLQCXMFK.v")
	public int field1418 = -1;

	@ObfuscatedName("ZLQCXMFK.w")
	public int field1419 = -1;

	@ObfuscatedName("ZLQCXMFK.y")
	public boolean field1421 = false;

	@ObfuscatedName("ZLQCXMFK.C")
	public int field1423 = 32;

	@ObfuscatedName("ZLQCXMFK.E")
	public int field1425 = -1;

	@ObfuscatedName("ZLQCXMFK.F")
	public boolean field1426 = true;

	@ObfuscatedName("ZLQCXMFK.I")
	public byte field1429 = 1;

	@ObfuscatedName("ZLQCXMFK.J")
	public int field1430 = -1;

	@ObfuscatedName("ZLQCXMFK.M")
	public int field1433 = -1;

	@ObfuscatedName("ZLQCXMFK.N")
	public int field1434 = -1;

	@ObfuscatedName("ZLQCXMFK.O")
	public int field1435 = -1;

	@ObfuscatedName("ZLQCXMFK.H")
	public static BVBRKPZH field1428 = new BVBRKPZH(30);

	@ObfuscatedName("ZLQCXMFK.i")
	public static int field1406;

	@ObfuscatedName("ZLQCXMFK.m")
	public static int field1409;

	@ObfuscatedName("ZLQCXMFK.r")
	public int field1414;

	@ObfuscatedName("ZLQCXMFK.s")
	public int field1415;

	@ObfuscatedName("ZLQCXMFK.x")
	public static EMWAMCXW field1420;

	@ObfuscatedName("ZLQCXMFK.j")
	public static client field1407;

	@ObfuscatedName("ZLQCXMFK.h")
	public byte[] field1405;

	@ObfuscatedName("ZLQCXMFK.e")
	public int[] field1402;

	@ObfuscatedName("ZLQCXMFK.k")
	public int[] field1408;

	@ObfuscatedName("ZLQCXMFK.n")
	public static int[] field1410;

	@ObfuscatedName("ZLQCXMFK.G")
	public int[] field1427;

	@ObfuscatedName("ZLQCXMFK.K")
	public int[] field1431;

	@ObfuscatedName("ZLQCXMFK.L")
	public int[] field1432;

	@ObfuscatedName("ZLQCXMFK.D")
	public static ZLQCXMFK[] field1424;

	@ObfuscatedName("ZLQCXMFK.B")
	public String[] field1422;

	@ObfuscatedName("ZLQCXMFK.a(I)LIEHKDFMR;")
	public final IEHKDFMR method507() {
		if (field1432 != null) {
			ZLQCXMFK var1 = method510();
			if (var1 == null) {
				return null;
			}

			return var1.method507();
		} else if (field1431 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1431.length; var3++) {
				if (!IEHKDFMR.method268(field1431[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			IEHKDFMR[] var4 = new IEHKDFMR[field1431.length];
			for (int var5 = 0; var5 < field1431.length; var5++) {
				var4[var5] = IEHKDFMR.method267(field1431[var5]);
			}

			IEHKDFMR var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new IEHKDFMR(var4, var4.length);
			}

			if (field1402 != null) {
				for (int var7 = 0; var7 < field1402.length; var7++) {
					var6.method281(field1402[var7], field1427[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("ZLQCXMFK.a(Z)V")
	public static final void method508() {
		field1428 = null;
		field1410 = null;
		field1424 = null;
		field1420 = null;
	}

	@ObfuscatedName("ZLQCXMFK.b(I)LZLQCXMFK;")
	public static final ZLQCXMFK method509(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1424[var1].field1401) {
				return field1424[var1];
			}
		}

		field1406 = (field1406 + 1) % 20;
		ZLQCXMFK var2 = field1424[field1406] = new ZLQCXMFK();
		field1420.field617 = field1410[arg0];
		var2.field1401 = arg0;
		var2.method514(field1420);
		return var2;
	}

	@ObfuscatedName("ZLQCXMFK.c(I)LZLQCXMFK;")
	public final ZLQCXMFK method510() {
		int var1 = -1;
		if (field1419 != -1) {
			EFEPEUMF var2 = EFEPEUMF.field607[field1419];
			int var3 = var2.field609;
			int var4 = var2.field610;
			int var5 = var2.field611;
			int var6 = client.field323[var5 - var4];
			var1 = field1407.field286[var3] >> var4 & var6;
		} else if (field1413 != -1) {
			var1 = field1407.field286[field1413];
		}

		if (var1 >= 0 && var1 < field1432.length && field1432[var1] != -1) {
			return method509(field1432[var1]);
		}

		return null;
	}

	@ObfuscatedName("ZLQCXMFK.a(LMAARFNGV;)V")
	public static final void method511(MAARFNGV arg0) {
		field1420 = new EMWAMCXW(arg0.method332("npc.dat", null));
		EMWAMCXW var1 = new EMWAMCXW(arg0.method332("npc.idx", null));
		field1409 = var1.method219();
		field1410 = new int[field1409];
		int var2 = 2;
		for (int var3 = 0; var3 < field1409; var3++) {
			field1410[var3] = var2;
			var2 += var1.method219();
		}

		field1424 = new ZLQCXMFK[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1424[var4] = new ZLQCXMFK();
		}
	}

	@ObfuscatedName("ZLQCXMFK.a(I[IIB)LIEHKDFMR;")
	public final IEHKDFMR method512(int arg0, int[] arg1, int arg2) {
		if (field1432 != null) {
			ZLQCXMFK var4 = method510();
			if (var4 == null) {
				return null;
			}

			return var4.method512(arg0, arg1, arg2);
		}

		IEHKDFMR var5 = (IEHKDFMR) field1428.method25(field1401);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1408.length; var7++) {
				if (!IEHKDFMR.method268(field1408[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			IEHKDFMR[] var8 = new IEHKDFMR[field1408.length];
			for (int var9 = 0; var9 < field1408.length; var9++) {
				var8[var9] = IEHKDFMR.method267(field1408[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new IEHKDFMR(var8, var8.length);
			}

			if (field1402 != null) {
				for (int var10 = 0; var10 < field1402.length; var10++) {
					var5.method281(field1402[var10], field1427[var10]);
				}
			}

			var5.method274();
			var5.method284(field1415 + 64, field1414 + 850, -30, -50, -30, true);
			field1428.method26(field1401, var5);
		}

		IEHKDFMR var11 = IEHKDFMR.field658;
		var11.method269(NXEWQQJO.method337(arg2) & NXEWQQJO.method337(arg0), var5);

		if (arg2 != -1 && arg0 != -1) {
			var11.method276(arg2, arg0, arg1);
		} else if (arg2 != -1) {
			var11.method275(arg2);
		}

		if (field1417 != 128 || field1404 != 128) {
			var11.method283(field1417, field1404, field1417);
		}

		var11.method271();
		var11.field694 = null;
		var11.field693 = null;

		if (field1429 == 1) {
			var11.field695 = true;
		}

		return var11;
	}

	@ObfuscatedName("ZLQCXMFK.a(B)Z")
	public boolean method513() {
		if (field1432 == null) {
			return true;
		}

		int var1 = -1;
		if (field1419 != -1) {
			EFEPEUMF var2 = EFEPEUMF.field607[field1419];
			int var3 = var2.field609;
			int var4 = var2.field610;
			int var5 = var2.field611;
			int var6 = client.field323[var5 - var4];
			var1 = field1407.field286[var3] >> var4 & var6;
		} else if (field1413 != -1) {
			var1 = field1407.field286[field1413];
		}

		if (var1 >= 0 && var1 < field1432.length && field1432[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ZLQCXMFK.a(ILEMWAMCXW;)V")
	public final void method514(EMWAMCXW arg0) {
		while (true) {
			int var2 = arg0.method217();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method217();
				field1408 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1408[var4] = arg0.method219();
				}
			} else if (var2 == 2) {
				field1400 = arg0.method224();
			} else if (var2 == 3) {
				field1405 = arg0.method225();
			} else if (var2 == 12) {
				field1429 = arg0.method218();
			} else if (var2 == 13) {
				field1399 = arg0.method219();
			} else if (var2 == 14) {
				field1434 = arg0.method219();
			} else if (var2 == 17) {
				field1434 = arg0.method219();
				field1430 = arg0.method219();
				field1418 = arg0.method219();
				field1433 = arg0.method219();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1422 == null) {
					field1422 = new String[5];
				}

				field1422[var2 - 30] = arg0.method224();
				if (field1422[var2 - 30].equalsIgnoreCase("hidden")) {
					field1422[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method217();
				field1402 = new int[var5];
				field1427 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1402[var6] = arg0.method219();
					field1427[var6] = arg0.method219();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method217();
				field1431 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1431[var8] = arg0.method219();
				}
			} else if (var2 == 90) {
				field1412 = arg0.method219();
			} else if (var2 == 91) {
				field1403 = arg0.method219();
			} else if (var2 == 92) {
				field1411 = arg0.method219();
			} else if (var2 == 93) {
				field1426 = false;
			} else if (var2 == 95) {
				field1435 = arg0.method219();
			} else if (var2 == 97) {
				field1417 = arg0.method219();
			} else if (var2 == 98) {
				field1404 = arg0.method219();
			} else if (var2 == 99) {
				field1421 = true;
			} else if (var2 == 100) {
				field1415 = arg0.method218();
			} else if (var2 == 101) {
				field1414 = arg0.method218() * 5;
			} else if (var2 == 102) {
				field1425 = arg0.method219();
			} else if (var2 == 103) {
				field1423 = arg0.method219();
			} else if (var2 == 106) {
				field1419 = arg0.method219();
				if (field1419 == 0xFFFF) {
					field1419 = -1;
				}

				field1413 = arg0.method219();
				if (field1413 == 0xFFFF) {
					field1413 = -1;
				}

				int var9 = arg0.method217();
				field1432 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1432[var10] = arg0.method219();
					if (field1432[var10] == 0xFFFF) {
						field1432[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1416 = false;
			}
		}
	}
}
