package deob;

@ObfuscatedName("APPQAEOL")
public final class APPQAEOL {

	@ObfuscatedName("APPQAEOL.a")
	public int field6 = 32;

	@ObfuscatedName("APPQAEOL.c")
	public byte field8 = 1;

	@ObfuscatedName("APPQAEOL.d")
	public boolean field9 = true;

	@ObfuscatedName("APPQAEOL.e")
	public int field10 = -1;

	@ObfuscatedName("APPQAEOL.h")
	public int field13 = -1;

	@ObfuscatedName("APPQAEOL.l")
	public int field16 = 128;

	@ObfuscatedName("APPQAEOL.o")
	public boolean field19 = true;

	@ObfuscatedName("APPQAEOL.p")
	public int field20 = -1;

	@ObfuscatedName("APPQAEOL.s")
	public int field21 = -1;

	@ObfuscatedName("APPQAEOL.u")
	public int field23 = 128;

	@ObfuscatedName("APPQAEOL.v")
	public boolean field24 = false;

	@ObfuscatedName("APPQAEOL.w")
	public int field25 = -1;

	@ObfuscatedName("APPQAEOL.A")
	public int field29 = -1;

	@ObfuscatedName("APPQAEOL.B")
	public int field30 = -1;

	@ObfuscatedName("APPQAEOL.D")
	public int field32 = -1;

	@ObfuscatedName("APPQAEOL.E")
	public long field33 = -1L;

	@ObfuscatedName("APPQAEOL.F")
	public String field34 = "null";

	@ObfuscatedName("APPQAEOL.G")
	public int field35 = -1;

	@ObfuscatedName("APPQAEOL.K")
	public int field39 = -1;

	@ObfuscatedName("APPQAEOL.L")
	public int field40 = -1;

	@ObfuscatedName("APPQAEOL.N")
	public int field42 = -1;

	@ObfuscatedName("APPQAEOL.f")
	public static ULDYKUPK field11 = new ULDYKUPK(30);

	@ObfuscatedName("APPQAEOL.n")
	public int field18;

	@ObfuscatedName("APPQAEOL.z")
	public static int field28;

	@ObfuscatedName("APPQAEOL.H")
	public static int field36;

	@ObfuscatedName("APPQAEOL.M")
	public int field41;

	@ObfuscatedName("APPQAEOL.g")
	public static NQUAUMDT field12;

	@ObfuscatedName("APPQAEOL.b")
	public static client field7;

	@ObfuscatedName("APPQAEOL.k")
	public byte[] field15;

	@ObfuscatedName("APPQAEOL.j")
	public int[] field14;

	@ObfuscatedName("APPQAEOL.m")
	public int[] field17;

	@ObfuscatedName("APPQAEOL.y")
	public int[] field27;

	@ObfuscatedName("APPQAEOL.C")
	public int[] field31;

	@ObfuscatedName("APPQAEOL.I")
	public static int[] field37;

	@ObfuscatedName("APPQAEOL.J")
	public int[] field38;

	@ObfuscatedName("APPQAEOL.x")
	public static APPQAEOL[] field26;

	@ObfuscatedName("APPQAEOL.t")
	public String[] field22;

	@ObfuscatedName("APPQAEOL.a(I)LAPPQAEOL;")
	public final APPQAEOL method5() {
		int var1 = -1;
		if (field10 != -1) {
			JYNIYSOU var2 = JYNIYSOU.field748[field10];
			int var3 = var2.field750;
			int var4 = var2.field751;
			int var5 = var2.field752;
			int var6 = client.field492[var5 - var4];
			var1 = field7.field441[var3] >> var4 & var6;
		} else if (field20 != -1) {
			var1 = field7.field441[field20];
		}

		if (var1 >= 0 && var1 < field14.length && field14[var1] != -1) {
			return method10(field14[var1]);
		}

		return null;
	}

	@ObfuscatedName("APPQAEOL.b(I)Z")
	public boolean method6() {
		if (field14 == null) {
			return true;
		}

		int var1 = -1;
		if (field10 != -1) {
			JYNIYSOU var2 = JYNIYSOU.field748[field10];
			int var3 = var2.field750;
			int var4 = var2.field751;
			int var5 = var2.field752;
			int var6 = client.field492[var5 - var4];
			var1 = field7.field441[var3] >> var4 & var6;
		} else if (field20 != -1) {
			var1 = field7.field441[field20];
		}

		if (var1 >= 0 && var1 < field14.length && field14[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("APPQAEOL.a(IB[II)LJUQSYEMB;")
	public final JUQSYEMB method7(int arg0, int[] arg1, int arg2) {
		if (field14 != null) {
			APPQAEOL var4 = method5();
			if (var4 == null) {
				return null;
			}

			return var4.method7(arg0, arg1, arg2);
		}

		JUQSYEMB var5 = (JUQSYEMB) field11.method509(field33);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field27.length; var7++) {
				if (!JUQSYEMB.method213(field27[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			JUQSYEMB[] var8 = new JUQSYEMB[field27.length];
			for (int var9 = 0; var9 < field27.length; var9++) {
				var8[var9] = JUQSYEMB.method212(field27[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new JUQSYEMB(var8.length, var8);
			}

			if (field38 != null) {
				for (int var10 = 0; var10 < field38.length; var10++) {
					var5.method226(field38[var10], field17[var10]);
				}
			}

			var5.method219();
			var5.method229(field18 + 64, field41 + 850, -30, -50, -30, true);
			field11.method510(field33, var5);
		}

		JUQSYEMB var11 = JUQSYEMB.field676;
		var11.method214(YYYUATIU.method579(arg2) & YYYUATIU.method579(arg0), var5);

		if (arg2 != -1 && arg0 != -1) {
			var11.method221(arg2, arg0, arg1);
		} else if (arg2 != -1) {
			var11.method220(arg2);
		}

		if (field16 != 128 || field23 != 128) {
			var11.method228(field16, field23, field16);
		}

		var11.method216();
		var11.field712 = null;
		var11.field711 = null;

		if (field8 == 1) {
			var11.field713 = true;
		}

		return var11;
	}

	@ObfuscatedName("APPQAEOL.c(I)V")
	public static final void method8() {
		field11 = null;
		field37 = null;
		field26 = null;
		field12 = null;
	}

	@ObfuscatedName("APPQAEOL.a(LRSPRYUFS;)V")
	public static final void method9(RSPRYUFS arg0) {
		field12 = new NQUAUMDT(arg0.method427("npc.dat", null));
		NQUAUMDT var1 = new NQUAUMDT(arg0.method427("npc.idx", null));
		field28 = var1.method341();
		field37 = new int[field28];
		int var2 = 2;
		for (int var3 = 0; var3 < field28; var3++) {
			field37[var3] = var2;
			var2 += var1.method341();
		}

		field26 = new APPQAEOL[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field26[var4] = new APPQAEOL();
		}
	}

	@ObfuscatedName("APPQAEOL.d(I)LAPPQAEOL;")
	public static final APPQAEOL method10(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field26[var1].field33) {
				return field26[var1];
			}
		}

		field36 = (field36 + 1) % 20;
		APPQAEOL var2 = field26[field36] = new APPQAEOL();
		field12.field929 = field37[arg0];
		var2.field33 = arg0;
		var2.method11(field12);
		return var2;
	}

	@ObfuscatedName("APPQAEOL.a(BLNQUAUMDT;)V")
	public final void method11(NQUAUMDT arg0) {
		while (true) {
			int var2 = arg0.method339();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method339();
				field27 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field27[var4] = arg0.method341();
				}
			} else if (var2 == 2) {
				field34 = arg0.method346();
			} else if (var2 == 3) {
				field15 = arg0.method347();
			} else if (var2 == 12) {
				field8 = arg0.method340();
			} else if (var2 == 13) {
				field25 = arg0.method341();
			} else if (var2 == 14) {
				field32 = arg0.method341();
			} else if (var2 == 17) {
				field32 = arg0.method341();
				field42 = arg0.method341();
				field35 = arg0.method341();
				field21 = arg0.method341();
			} else if (var2 >= 30 && var2 < 40) {
				if (field22 == null) {
					field22 = new String[5];
				}

				field22[var2 - 30] = arg0.method346();
				if (field22[var2 - 30].equalsIgnoreCase("hidden")) {
					field22[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method339();
				field38 = new int[var5];
				field17 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field38[var6] = arg0.method341();
					field17[var6] = arg0.method341();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method339();
				field31 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field31[var8] = arg0.method341();
				}
			} else if (var2 == 90) {
				field30 = arg0.method341();
			} else if (var2 == 91) {
				field29 = arg0.method341();
			} else if (var2 == 92) {
				field39 = arg0.method341();
			} else if (var2 == 93) {
				field19 = false;
			} else if (var2 == 95) {
				field13 = arg0.method341();
			} else if (var2 == 97) {
				field16 = arg0.method341();
			} else if (var2 == 98) {
				field23 = arg0.method341();
			} else if (var2 == 99) {
				field24 = true;
			} else if (var2 == 100) {
				field18 = arg0.method340();
			} else if (var2 == 101) {
				field41 = arg0.method340() * 5;
			} else if (var2 == 102) {
				field40 = arg0.method341();
			} else if (var2 == 103) {
				field6 = arg0.method341();
			} else if (var2 == 106) {
				field10 = arg0.method341();
				if (field10 == 0xFFFF) {
					field10 = -1;
				}

				field20 = arg0.method341();
				if (field20 == 0xFFFF) {
					field20 = -1;
				}

				int var9 = arg0.method339();
				field14 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field14[var10] = arg0.method341();
					if (field14[var10] == 0xFFFF) {
						field14[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field9 = false;
			}
		}
	}

	@ObfuscatedName("APPQAEOL.e(I)LJUQSYEMB;")
	public final JUQSYEMB method12() {
		if (field14 != null) {
			APPQAEOL var1 = method5();
			if (var1 == null) {
				return null;
			}

			return var1.method12();
		} else if (field31 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field31.length; var3++) {
				if (!JUQSYEMB.method213(field31[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			JUQSYEMB[] var4 = new JUQSYEMB[field31.length];
			for (int var5 = 0; var5 < field31.length; var5++) {
				var4[var5] = JUQSYEMB.method212(field31[var5]);
			}

			JUQSYEMB var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new JUQSYEMB(var4.length, var4);
			}

			if (field38 != null) {
				for (int var7 = 0; var7 < field38.length; var7++) {
					var6.method226(field38[var7], field17[var7]);
				}
			}

			return var6;
		}
	}
}
