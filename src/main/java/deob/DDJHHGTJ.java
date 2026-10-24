package deob;

@ObfuscatedName("DDJHHGTJ")
public final class DDJHHGTJ {

	@ObfuscatedName("DDJHHGTJ.a")
	public int field495 = -1;

	@ObfuscatedName("DDJHHGTJ.c")
	public boolean field497 = true;

	@ObfuscatedName("DDJHHGTJ.d")
	public int field498 = -1;

	@ObfuscatedName("DDJHHGTJ.h")
	public int field502 = -1;

	@ObfuscatedName("DDJHHGTJ.i")
	public byte field503 = 1;

	@ObfuscatedName("DDJHHGTJ.k")
	public int field504 = 32;

	@ObfuscatedName("DDJHHGTJ.o")
	public int field508 = 128;

	@ObfuscatedName("DDJHHGTJ.p")
	public int field509 = 128;

	@ObfuscatedName("DDJHHGTJ.s")
	public int field511 = -1;

	@ObfuscatedName("DDJHHGTJ.u")
	public int field513 = -1;

	@ObfuscatedName("DDJHHGTJ.v")
	public boolean field514 = true;

	@ObfuscatedName("DDJHHGTJ.w")
	public int field515 = -1;

	@ObfuscatedName("DDJHHGTJ.x")
	public int field516 = -1;

	@ObfuscatedName("DDJHHGTJ.y")
	public int field517 = -1;

	@ObfuscatedName("DDJHHGTJ.C")
	public int field521 = -1;

	@ObfuscatedName("DDJHHGTJ.E")
	public int field523 = -1;

	@ObfuscatedName("DDJHHGTJ.F")
	public boolean field524 = false;

	@ObfuscatedName("DDJHHGTJ.G")
	public int field525 = -1;

	@ObfuscatedName("DDJHHGTJ.I")
	public long field527 = -1L;

	@ObfuscatedName("DDJHHGTJ.M")
	public int field531 = -1;

	@ObfuscatedName("DDJHHGTJ.m")
	public static VNWSQIXW field506 = new VNWSQIXW(30);

	@ObfuscatedName("DDJHHGTJ.e")
	public int field499;

	@ObfuscatedName("DDJHHGTJ.r")
	public static int field510;

	@ObfuscatedName("DDJHHGTJ.D")
	public int field522;

	@ObfuscatedName("DDJHHGTJ.J")
	public static int field528;

	@ObfuscatedName("DDJHHGTJ.g")
	public static GHHPHSRU field501;

	@ObfuscatedName("DDJHHGTJ.L")
	public static client field530;

	@ObfuscatedName("DDJHHGTJ.H")
	public String field526;

	@ObfuscatedName("DDJHHGTJ.l")
	public byte[] field505;

	@ObfuscatedName("DDJHHGTJ.n")
	public static int[] field507;

	@ObfuscatedName("DDJHHGTJ.t")
	public int[] field512;

	@ObfuscatedName("DDJHHGTJ.z")
	public int[] field518;

	@ObfuscatedName("DDJHHGTJ.A")
	public int[] field519;

	@ObfuscatedName("DDJHHGTJ.B")
	public int[] field520;

	@ObfuscatedName("DDJHHGTJ.K")
	public int[] field529;

	@ObfuscatedName("DDJHHGTJ.f")
	public static DDJHHGTJ[] field500;

	@ObfuscatedName("DDJHHGTJ.b")
	public String[] field496;

	@ObfuscatedName("DDJHHGTJ.a([IIII)LOQIGXOFQ;")
	public final OQIGXOFQ method158(int[] arg0, int arg1, int arg2) {
		if (field518 != null) {
			DDJHHGTJ var4 = method164();
			if (var4 == null) {
				return null;
			}

			return var4.method158(arg0, arg1, arg2);
		}

		OQIGXOFQ var5 = (OQIGXOFQ) field506.method507(field527);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field529.length; var7++) {
				if (!OQIGXOFQ.method392(field529[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			OQIGXOFQ[] var8 = new OQIGXOFQ[field529.length];
			for (int var9 = 0; var9 < field529.length; var9++) {
				var8[var9] = OQIGXOFQ.method391(field529[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new OQIGXOFQ(var8.length, var8);
			}

			if (field519 != null) {
				for (int var10 = 0; var10 < field519.length; var10++) {
					var5.method405(field519[var10], field520[var10]);
				}
			}

			var5.method398();
			var5.method408(field522 + 64, field499 + 850, -30, -50, -30, true);
			field506.method508(field527, var5);
		}

		OQIGXOFQ var11 = OQIGXOFQ.field1029;
		var11.method393(var5, XZZTWOGF.method582(arg1) & XZZTWOGF.method582(arg2));

		if (arg1 != -1 && arg2 != -1) {
			var11.method400(arg1, arg0, arg2);
		} else if (arg1 != -1) {
			var11.method399(arg1);
		}

		if (field508 != 128 || field509 != 128) {
			var11.method407(field509, field508, field508);
		}

		var11.method395();
		var11.field1066 = null;
		var11.field1065 = null;

		if (field503 == 1) {
			var11.field1067 = true;
		}

		return var11;
	}

	@ObfuscatedName("DDJHHGTJ.a(LGHHPHSRU;I)V")
	public final void method159(GHHPHSRU arg0) {
		while (true) {
			int var2 = arg0.method202();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method202();
				field529 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field529[var4] = arg0.method204();
				}
			} else if (var2 == 2) {
				field526 = arg0.method209();
			} else if (var2 == 3) {
				field505 = arg0.method210();
			} else if (var2 == 12) {
				field503 = arg0.method203();
			} else if (var2 == 13) {
				field531 = arg0.method204();
			} else if (var2 == 14) {
				field511 = arg0.method204();
			} else if (var2 == 17) {
				field511 = arg0.method204();
				field525 = arg0.method204();
				field516 = arg0.method204();
				field513 = arg0.method204();
			} else if (var2 >= 30 && var2 < 40) {
				if (field496 == null) {
					field496 = new String[5];
				}

				field496[var2 - 30] = arg0.method209();
				if (field496[var2 - 30].equalsIgnoreCase("hidden")) {
					field496[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method202();
				field519 = new int[var5];
				field520 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field519[var6] = arg0.method204();
					field520[var6] = arg0.method204();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method202();
				field512 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field512[var8] = arg0.method204();
				}
			} else if (var2 == 90) {
				field498 = arg0.method204();
			} else if (var2 == 91) {
				field495 = arg0.method204();
			} else if (var2 == 92) {
				field517 = arg0.method204();
			} else if (var2 == 93) {
				field514 = false;
			} else if (var2 == 95) {
				field521 = arg0.method204();
			} else if (var2 == 97) {
				field508 = arg0.method204();
			} else if (var2 == 98) {
				field509 = arg0.method204();
			} else if (var2 == 99) {
				field524 = true;
			} else if (var2 == 100) {
				field522 = arg0.method203();
			} else if (var2 == 101) {
				field499 = arg0.method203() * 5;
			} else if (var2 == 102) {
				field502 = arg0.method204();
			} else if (var2 == 103) {
				field504 = arg0.method204();
			} else if (var2 == 106) {
				field515 = arg0.method204();
				if (field515 == 0xFFFF) {
					field515 = -1;
				}

				field523 = arg0.method204();
				if (field523 == 0xFFFF) {
					field523 = -1;
				}

				int var9 = arg0.method202();
				field518 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field518[var10] = arg0.method204();
					if (field518[var10] == 0xFFFF) {
						field518[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field497 = false;
			}
		}
	}

	@ObfuscatedName("DDJHHGTJ.a(I)V")
	public static final void method160() {
		field506 = null;
		field507 = null;
		field500 = null;
		field501 = null;
	}

	@ObfuscatedName("DDJHHGTJ.b(I)Z")
	public boolean method161() {
		if (field518 == null) {
			return true;
		}

		int var1 = -1;
		if (field515 != -1) {
			OIEBXCSN var2 = OIEBXCSN.field1019[field515];
			int var3 = var2.field1021;
			int var4 = var2.field1022;
			int var5 = var2.field1023;
			int var6 = client.field158[var5 - var4];
			var1 = field530.field477[var3] >> var4 & var6;
		} else if (field523 != -1) {
			var1 = field530.field477[field523];
		}

		if (var1 >= 0 && var1 < field518.length && field518[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("DDJHHGTJ.c(I)LDDJHHGTJ;")
	public static final DDJHHGTJ method162(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field500[var1].field527) {
				return field500[var1];
			}
		}

		field510 = (field510 + 1) % 20;
		DDJHHGTJ var2 = field500[field510] = new DDJHHGTJ();
		field501.field667 = field507[arg0];
		var2.field527 = arg0;
		var2.method159(field501);
		return var2;
	}

	@ObfuscatedName("DDJHHGTJ.d(I)LOQIGXOFQ;")
	public final OQIGXOFQ method163() {
		if (field518 != null) {
			DDJHHGTJ var1 = method164();
			if (var1 == null) {
				return null;
			}

			return var1.method163();
		} else if (field512 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field512.length; var3++) {
				if (!OQIGXOFQ.method392(field512[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			OQIGXOFQ[] var4 = new OQIGXOFQ[field512.length];
			for (int var5 = 0; var5 < field512.length; var5++) {
				var4[var5] = OQIGXOFQ.method391(field512[var5]);
			}

			OQIGXOFQ var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new OQIGXOFQ(var4.length, var4);
			}

			if (field519 != null) {
				for (int var7 = 0; var7 < field519.length; var7++) {
					var6.method405(field519[var7], field520[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("DDJHHGTJ.e(I)LDDJHHGTJ;")
	public final DDJHHGTJ method164() {
		int var1 = -1;
		if (field515 != -1) {
			OIEBXCSN var2 = OIEBXCSN.field1019[field515];
			int var3 = var2.field1021;
			int var4 = var2.field1022;
			int var5 = var2.field1023;
			int var6 = client.field158[var5 - var4];
			var1 = field530.field477[var3] >> var4 & var6;
		} else if (field523 != -1) {
			var1 = field530.field477[field523];
		}

		if (var1 >= 0 && var1 < field518.length && field518[var1] != -1) {
			return method162(field518[var1]);
		}

		return null;
	}

	@ObfuscatedName("DDJHHGTJ.a(LDTIATKJO;)V")
	public static final void method165(DTIATKJO arg0) {
		field501 = new GHHPHSRU(arg0.method168("npc.dat", null));
		GHHPHSRU var1 = new GHHPHSRU(arg0.method168("npc.idx", null));
		field528 = var1.method204();
		field507 = new int[field528];
		int var2 = 2;
		for (int var3 = 0; var3 < field528; var3++) {
			field507[var3] = var2;
			var2 += var1.method204();
		}

		field500 = new DDJHHGTJ[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field500[var4] = new DDJHHGTJ();
		}
	}
}
