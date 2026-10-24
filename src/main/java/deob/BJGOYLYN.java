package deob;

@ObfuscatedName("BJGOYLYN")
public final class BJGOYLYN {

	@ObfuscatedName("BJGOYLYN.c")
	public int field17 = 128;

	@ObfuscatedName("BJGOYLYN.d")
	public int field18 = -1;

	@ObfuscatedName("BJGOYLYN.e")
	public boolean field19 = false;

	@ObfuscatedName("BJGOYLYN.g")
	public int field21 = -1;

	@ObfuscatedName("BJGOYLYN.i")
	public boolean field23 = true;

	@ObfuscatedName("BJGOYLYN.j")
	public int field24 = -1;

	@ObfuscatedName("BJGOYLYN.l")
	public long field26 = -1L;

	@ObfuscatedName("BJGOYLYN.o")
	public byte field28 = 1;

	@ObfuscatedName("BJGOYLYN.p")
	public String field29 = "null";

	@ObfuscatedName("BJGOYLYN.q")
	public int field30 = -1;

	@ObfuscatedName("BJGOYLYN.s")
	public int field32 = -1;

	@ObfuscatedName("BJGOYLYN.u")
	public int field34 = -1;

	@ObfuscatedName("BJGOYLYN.y")
	public int field38 = -1;

	@ObfuscatedName("BJGOYLYN.z")
	public int field39 = -1;

	@ObfuscatedName("BJGOYLYN.B")
	public int field41 = -1;

	@ObfuscatedName("BJGOYLYN.C")
	public boolean field42 = true;

	@ObfuscatedName("BJGOYLYN.D")
	public int field43 = -1;

	@ObfuscatedName("BJGOYLYN.E")
	public int field44 = 128;

	@ObfuscatedName("BJGOYLYN.H")
	public int field46 = -1;

	@ObfuscatedName("BJGOYLYN.I")
	public int field47 = -1;

	@ObfuscatedName("BJGOYLYN.K")
	public int field49 = 32;

	@ObfuscatedName("BJGOYLYN.w")
	public static DSCQIAPU field36 = new DSCQIAPU(30);

	@ObfuscatedName("BJGOYLYN.h")
	public static int field22;

	@ObfuscatedName("BJGOYLYN.r")
	public int field31;

	@ObfuscatedName("BJGOYLYN.F")
	public int field45;

	@ObfuscatedName("BJGOYLYN.J")
	public static int field48;

	@ObfuscatedName("BJGOYLYN.n")
	public static WNCFPLWV field27;

	@ObfuscatedName("BJGOYLYN.b")
	public static client field16;

	@ObfuscatedName("BJGOYLYN.a")
	public byte[] field15;

	@ObfuscatedName("BJGOYLYN.f")
	public int[] field20;

	@ObfuscatedName("BJGOYLYN.v")
	public int[] field35;

	@ObfuscatedName("BJGOYLYN.x")
	public int[] field37;

	@ObfuscatedName("BJGOYLYN.A")
	public int[] field40;

	@ObfuscatedName("BJGOYLYN.L")
	public static int[] field50;

	@ObfuscatedName("BJGOYLYN.M")
	public int[] field51;

	@ObfuscatedName("BJGOYLYN.k")
	public static BJGOYLYN[] field25;

	@ObfuscatedName("BJGOYLYN.t")
	public String[] field33;

	@ObfuscatedName("BJGOYLYN.a(Z)Z")
	public boolean method1() {
		if (field37 == null) {
			return true;
		}

		int var1 = -1;
		if (field21 != -1) {
			VKMARKYY var2 = VKMARKYY.field1355[field21];
			int var3 = var2.field1357;
			int var4 = var2.field1358;
			int var5 = var2.field1359;
			int var6 = client.field99[var5 - var4];
			var1 = field16.field474[var3] >> var4 & var6;
		} else if (field34 != -1) {
			var1 = field16.field474[field34];
		}

		if (var1 >= 0 && var1 < field37.length && field37[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("BJGOYLYN.a(I[IIZ)LUNLYQRUD;")
	public final UNLYQRUD method2(int arg0, int[] arg1, int arg2) {
		if (field37 != null) {
			BJGOYLYN var4 = method6();
			if (var4 == null) {
				return null;
			}

			return var4.method2(arg0, arg1, arg2);
		}

		UNLYQRUD var5 = (UNLYQRUD) field36.method179(field26);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field40.length; var7++) {
				if (!UNLYQRUD.method443(field40[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			UNLYQRUD[] var8 = new UNLYQRUD[field40.length];
			for (int var9 = 0; var9 < field40.length; var9++) {
				var8[var9] = UNLYQRUD.method442(field40[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new UNLYQRUD(var8.length, var8);
			}

			if (field51 != null) {
				for (int var10 = 0; var10 < field51.length; var10++) {
					var5.method456(field51[var10], field20[var10]);
				}
			}

			var5.method449();
			var5.method459(field31 + 64, field45 + 850, -30, -50, -30, true);
			field36.method180(var5, field26);
		}

		UNLYQRUD var11 = UNLYQRUD.field1263;
		var11.method444(DHMWVSMI.method178(arg2) & DHMWVSMI.method178(arg0), var5);

		if (arg2 != -1 && arg0 != -1) {
			var11.method451(arg0, arg2, arg1);
		} else if (arg2 != -1) {
			var11.method450(arg2);
		}

		if (field17 != 128 || field44 != 128) {
			var11.method458(field17, field44, field17);
		}

		var11.method446();
		var11.field1299 = null;
		var11.field1298 = null;

		if (field28 == 1) {
			var11.field1300 = true;
		}

		return var11;
	}

	@ObfuscatedName("BJGOYLYN.a(I)V")
	public static final void method3() {
		field36 = null;
		field50 = null;
		field25 = null;
		field27 = null;
	}

	@ObfuscatedName("BJGOYLYN.b(I)LBJGOYLYN;")
	public static final BJGOYLYN method4(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field25[var1].field26) {
				return field25[var1];
			}
		}

		field48 = (field48 + 1) % 20;
		BJGOYLYN var2 = field25[field48] = new BJGOYLYN();
		field27.field1375 = field50[arg0];
		var2.field26 = arg0;
		var2.method5(field27);
		return var2;
	}

	@ObfuscatedName("BJGOYLYN.a(ILWNCFPLWV;)V")
	public final void method5(WNCFPLWV arg0) {
		while (true) {
			int var2 = arg0.method502();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method502();
				field40 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field40[var4] = arg0.method504();
				}
			} else if (var2 == 2) {
				field29 = arg0.method509();
			} else if (var2 == 3) {
				field15 = arg0.method510();
			} else if (var2 == 12) {
				field28 = arg0.method503();
			} else if (var2 == 13) {
				field39 = arg0.method504();
			} else if (var2 == 14) {
				field24 = arg0.method504();
			} else if (var2 == 17) {
				field24 = arg0.method504();
				field38 = arg0.method504();
				field18 = arg0.method504();
				field46 = arg0.method504();
			} else if (var2 >= 30 && var2 < 40) {
				if (field33 == null) {
					field33 = new String[5];
				}

				field33[var2 - 30] = arg0.method509();
				if (field33[var2 - 30].equalsIgnoreCase("hidden")) {
					field33[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method502();
				field51 = new int[var5];
				field20 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field51[var6] = arg0.method504();
					field20[var6] = arg0.method504();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method502();
				field35 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field35[var8] = arg0.method504();
				}
			} else if (var2 == 90) {
				field30 = arg0.method504();
			} else if (var2 == 91) {
				field47 = arg0.method504();
			} else if (var2 == 92) {
				field32 = arg0.method504();
			} else if (var2 == 93) {
				field42 = false;
			} else if (var2 == 95) {
				field41 = arg0.method504();
			} else if (var2 == 97) {
				field17 = arg0.method504();
			} else if (var2 == 98) {
				field44 = arg0.method504();
			} else if (var2 == 99) {
				field19 = true;
			} else if (var2 == 100) {
				field31 = arg0.method503();
			} else if (var2 == 101) {
				field45 = arg0.method503() * 5;
			} else if (var2 == 102) {
				field43 = arg0.method504();
			} else if (var2 == 103) {
				field49 = arg0.method504();
			} else if (var2 == 106) {
				field21 = arg0.method504();
				if (field21 == 0xFFFF) {
					field21 = -1;
				}

				field34 = arg0.method504();
				if (field34 == 0xFFFF) {
					field34 = -1;
				}

				int var9 = arg0.method502();
				field37 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field37[var10] = arg0.method504();
					if (field37[var10] == 0xFFFF) {
						field37[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field23 = false;
			}
		}
	}

	@ObfuscatedName("BJGOYLYN.c(I)LBJGOYLYN;")
	public final BJGOYLYN method6() {
		int var1 = -1;
		if (field21 != -1) {
			VKMARKYY var2 = VKMARKYY.field1355[field21];
			int var3 = var2.field1357;
			int var4 = var2.field1358;
			int var5 = var2.field1359;
			int var6 = client.field99[var5 - var4];
			var1 = field16.field474[var3] >> var4 & var6;
		} else if (field34 != -1) {
			var1 = field16.field474[field34];
		}

		if (var1 >= 0 && var1 < field37.length && field37[var1] != -1) {
			return method4(field37[var1]);
		}

		return null;
	}

	@ObfuscatedName("BJGOYLYN.d(I)LUNLYQRUD;")
	public final UNLYQRUD method7() {
		if (field37 != null) {
			BJGOYLYN var1 = method6();
			if (var1 == null) {
				return null;
			}

			return var1.method7();
		} else if (field35 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field35.length; var3++) {
				if (!UNLYQRUD.method443(field35[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			UNLYQRUD[] var4 = new UNLYQRUD[field35.length];
			for (int var5 = 0; var5 < field35.length; var5++) {
				var4[var5] = UNLYQRUD.method442(field35[var5]);
			}

			UNLYQRUD var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new UNLYQRUD(var4.length, var4);
			}

			if (field51 != null) {
				for (int var7 = 0; var7 < field51.length; var7++) {
					var6.method456(field51[var7], field20[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("BJGOYLYN.a(LRPFMUSNN;)V")
	public static final void method8(RPFMUSNN arg0) {
		field27 = new WNCFPLWV(arg0.method414("npc.dat", null));
		WNCFPLWV var1 = new WNCFPLWV(arg0.method414("npc.idx", null));
		field22 = var1.method504();
		field50 = new int[field22];
		int var2 = 2;
		for (int var3 = 0; var3 < field22; var3++) {
			field50[var3] = var2;
			var2 += var1.method504();
		}

		field25 = new BJGOYLYN[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field25[var4] = new BJGOYLYN();
		}
	}
}
