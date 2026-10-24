package deob;

@ObfuscatedName("NPWLDXJE")
public final class NPWLDXJE {

	@ObfuscatedName("NPWLDXJE.e")
	public long field982 = -1L;

	@ObfuscatedName("NPWLDXJE.f")
	public int field983 = -1;

	@ObfuscatedName("NPWLDXJE.g")
	public int field984 = 128;

	@ObfuscatedName("NPWLDXJE.j")
	public byte field987 = 1;

	@ObfuscatedName("NPWLDXJE.k")
	public boolean field988 = true;

	@ObfuscatedName("NPWLDXJE.m")
	public int field990 = -1;

	@ObfuscatedName("NPWLDXJE.n")
	public int field991 = -1;

	@ObfuscatedName("NPWLDXJE.o")
	public boolean field992 = true;

	@ObfuscatedName("NPWLDXJE.q")
	public int field994 = 128;

	@ObfuscatedName("NPWLDXJE.s")
	public int field995 = -1;

	@ObfuscatedName("NPWLDXJE.t")
	public int field996 = -1;

	@ObfuscatedName("NPWLDXJE.u")
	public int field997 = -1;

	@ObfuscatedName("NPWLDXJE.v")
	public int field998 = -1;

	@ObfuscatedName("NPWLDXJE.w")
	public int field999 = 32;

	@ObfuscatedName("NPWLDXJE.x")
	public int field1000 = -1;

	@ObfuscatedName("NPWLDXJE.A")
	public int field1003 = -1;

	@ObfuscatedName("NPWLDXJE.B")
	public boolean field1004 = false;

	@ObfuscatedName("NPWLDXJE.F")
	public int field1008 = -1;

	@ObfuscatedName("NPWLDXJE.H")
	public int field1010 = -1;

	@ObfuscatedName("NPWLDXJE.I")
	public int field1011 = -1;

	@ObfuscatedName("NPWLDXJE.a")
	public static DSMCVRKW field978 = new DSMCVRKW(30);

	@ObfuscatedName("NPWLDXJE.z")
	public static int field1002;

	@ObfuscatedName("NPWLDXJE.E")
	public static int field1007;

	@ObfuscatedName("NPWLDXJE.J")
	public int field1012;

	@ObfuscatedName("NPWLDXJE.h")
	public int field985;

	@ObfuscatedName("NPWLDXJE.C")
	public static EILHLJCE field1005;

	@ObfuscatedName("NPWLDXJE.d")
	public static client field981;

	@ObfuscatedName("NPWLDXJE.y")
	public String field1001;

	@ObfuscatedName("NPWLDXJE.D")
	public byte[] field1006;

	@ObfuscatedName("NPWLDXJE.K")
	public int[] field1013;

	@ObfuscatedName("NPWLDXJE.L")
	public int[] field1014;

	@ObfuscatedName("NPWLDXJE.b")
	public int[] field979;

	@ObfuscatedName("NPWLDXJE.c")
	public int[] field980;

	@ObfuscatedName("NPWLDXJE.i")
	public static int[] field986;

	@ObfuscatedName("NPWLDXJE.l")
	public int[] field989;

	@ObfuscatedName("NPWLDXJE.G")
	public static NPWLDXJE[] field1009;

	@ObfuscatedName("NPWLDXJE.p")
	public String[] field993;

	@ObfuscatedName("NPWLDXJE.a(II[IZ)LKBEXSZSN;")
	public final KBEXSZSN method388(int arg0, int arg1, int[] arg2) {
		if (field979 != null) {
			NPWLDXJE var4 = method389();
			if (var4 == null) {
				return null;
			}

			return var4.method388(arg0, arg1, arg2);
		}

		KBEXSZSN var5 = (KBEXSZSN) field978.method197(field982);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1013.length; var7++) {
				if (!KBEXSZSN.method340(field1013[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			KBEXSZSN[] var8 = new KBEXSZSN[field1013.length];
			for (int var9 = 0; var9 < field1013.length; var9++) {
				var8[var9] = KBEXSZSN.method339(field1013[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new KBEXSZSN(var8.length, var8);
			}

			if (field1014 != null) {
				for (int var10 = 0; var10 < field1014.length; var10++) {
					var5.method353(field1014[var10], field980[var10]);
				}
			}

			var5.method346();
			var5.method356(field985 + 64, field1012 + 850, -30, -50, -30, true);
			field978.method198(field982, var5);
		}

		KBEXSZSN var11 = KBEXSZSN.field868;
		var11.method341(var5, IBCKUTPD.method309(arg0) & IBCKUTPD.method309(arg1));

		if (arg0 != -1 && arg1 != -1) {
			var11.method348(arg2, arg1, arg0);
		} else if (arg0 != -1) {
			var11.method347(arg0);
		}

		if (field984 != 128 || field994 != 128) {
			var11.method355(field984, field994, field984);
		}

		var11.method343();
		var11.field904 = null;
		var11.field903 = null;

		if (field987 == 1) {
			var11.field905 = true;
		}

		return var11;
	}

	@ObfuscatedName("NPWLDXJE.a(B)LNPWLDXJE;")
	public final NPWLDXJE method389() {
		int var1 = -1;
		if (field991 != -1) {
			SRLFLGUY var2 = SRLFLGUY.field1160[field991];
			int var3 = var2.field1162;
			int var4 = var2.field1163;
			int var5 = var2.field1164;
			int var6 = client.field476[var5 - var4];
			var1 = field981.field580[var3] >> var4 & var6;
		} else if (field1011 != -1) {
			var1 = field981.field580[field1011];
		}

		if (var1 >= 0 && var1 < field979.length && field979[var1] != -1) {
			return method393(field979[var1]);
		}

		return null;
	}

	@ObfuscatedName("NPWLDXJE.a(Z)LKBEXSZSN;")
	public final KBEXSZSN method390() {
		if (field979 != null) {
			NPWLDXJE var1 = method389();
			if (var1 == null) {
				return null;
			}

			return var1.method390();
		} else if (field989 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field989.length; var3++) {
				if (!KBEXSZSN.method340(field989[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			KBEXSZSN[] var4 = new KBEXSZSN[field989.length];
			for (int var5 = 0; var5 < field989.length; var5++) {
				var4[var5] = KBEXSZSN.method339(field989[var5]);
			}

			KBEXSZSN var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new KBEXSZSN(var4.length, var4);
			}

			if (field1014 != null) {
				for (int var7 = 0; var7 < field1014.length; var7++) {
					var6.method353(field1014[var7], field980[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("NPWLDXJE.a(LBBMKAXRK;)V")
	public static final void method391(BBMKAXRK arg0) {
		field1005 = new EILHLJCE(arg0.method30("npc.dat", null));
		EILHLJCE var1 = new EILHLJCE(arg0.method30("npc.idx", null));
		field1002 = var1.method226();
		field986 = new int[field1002];
		int var2 = 2;
		for (int var3 = 0; var3 < field1002; var3++) {
			field986[var3] = var2;
			var2 += var1.method226();
		}

		field1009 = new NPWLDXJE[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1009[var4] = new NPWLDXJE();
		}
	}

	@ObfuscatedName("NPWLDXJE.a(I)Z")
	public boolean method392() {
		if (field979 == null) {
			return true;
		}

		int var1 = -1;
		if (field991 != -1) {
			SRLFLGUY var2 = SRLFLGUY.field1160[field991];
			int var3 = var2.field1162;
			int var4 = var2.field1163;
			int var5 = var2.field1164;
			int var6 = client.field476[var5 - var4];
			var1 = field981.field580[var3] >> var4 & var6;
		} else if (field1011 != -1) {
			var1 = field981.field580[field1011];
		}

		if (var1 >= 0 && var1 < field979.length && field979[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("NPWLDXJE.b(I)LNPWLDXJE;")
	public static final NPWLDXJE method393(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1009[var1].field982) {
				return field1009[var1];
			}
		}

		field1007 = (field1007 + 1) % 20;
		NPWLDXJE var2 = field1009[field1007] = new NPWLDXJE();
		field1005.field684 = field986[arg0];
		var2.field982 = arg0;
		var2.method395(field1005);
		return var2;
	}

	@ObfuscatedName("NPWLDXJE.c(I)V")
	public static final void method394() {
		field978 = null;
		field986 = null;
		field1009 = null;
		field1005 = null;
	}

	@ObfuscatedName("NPWLDXJE.a(LEILHLJCE;B)V")
	public final void method395(EILHLJCE arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method224();
				field1013 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1013[var4] = arg0.method226();
				}
			} else if (var2 == 2) {
				field1001 = arg0.method231();
			} else if (var2 == 3) {
				field1006 = arg0.method232();
			} else if (var2 == 12) {
				field987 = arg0.method225();
			} else if (var2 == 13) {
				field1000 = arg0.method226();
			} else if (var2 == 14) {
				field1010 = arg0.method226();
			} else if (var2 == 17) {
				field1010 = arg0.method226();
				field995 = arg0.method226();
				field983 = arg0.method226();
				field1008 = arg0.method226();
			} else if (var2 >= 30 && var2 < 40) {
				if (field993 == null) {
					field993 = new String[5];
				}

				field993[var2 - 30] = arg0.method231();
				if (field993[var2 - 30].equalsIgnoreCase("hidden")) {
					field993[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method224();
				field1014 = new int[var5];
				field980 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1014[var6] = arg0.method226();
					field980[var6] = arg0.method226();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method224();
				field989 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field989[var8] = arg0.method226();
				}
			} else if (var2 == 90) {
				field990 = arg0.method226();
			} else if (var2 == 91) {
				field1003 = arg0.method226();
			} else if (var2 == 92) {
				field998 = arg0.method226();
			} else if (var2 == 93) {
				field992 = false;
			} else if (var2 == 95) {
				field996 = arg0.method226();
			} else if (var2 == 97) {
				field984 = arg0.method226();
			} else if (var2 == 98) {
				field994 = arg0.method226();
			} else if (var2 == 99) {
				field1004 = true;
			} else if (var2 == 100) {
				field985 = arg0.method225();
			} else if (var2 == 101) {
				field1012 = arg0.method225() * 5;
			} else if (var2 == 102) {
				field997 = arg0.method226();
			} else if (var2 == 103) {
				field999 = arg0.method226();
			} else if (var2 == 106) {
				field991 = arg0.method226();
				if (field991 == 0xFFFF) {
					field991 = -1;
				}

				field1011 = arg0.method226();
				if (field1011 == 0xFFFF) {
					field1011 = -1;
				}

				int var9 = arg0.method224();
				field979 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field979[var10] = arg0.method226();
					if (field979[var10] == 0xFFFF) {
						field979[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field988 = false;
			}
		}
	}
}
