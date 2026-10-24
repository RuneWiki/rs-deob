package deob;

@ObfuscatedName("AUWOQLEO")
public final class AUWOQLEO {

	@ObfuscatedName("AUWOQLEO.a")
	public int field8 = 32;

	@ObfuscatedName("AUWOQLEO.c")
	public boolean field10 = true;

	@ObfuscatedName("AUWOQLEO.e")
	public int field12 = -1;

	@ObfuscatedName("AUWOQLEO.g")
	public int field14 = -1;

	@ObfuscatedName("AUWOQLEO.h")
	public int field15 = 128;

	@ObfuscatedName("AUWOQLEO.i")
	public byte field16 = 1;

	@ObfuscatedName("AUWOQLEO.l")
	public boolean field18 = false;

	@ObfuscatedName("AUWOQLEO.n")
	public int field20 = -1;

	@ObfuscatedName("AUWOQLEO.o")
	public int field21 = -1;

	@ObfuscatedName("AUWOQLEO.r")
	public int field23 = 128;

	@ObfuscatedName("AUWOQLEO.u")
	public int field26 = -1;

	@ObfuscatedName("AUWOQLEO.v")
	public int field27 = -1;

	@ObfuscatedName("AUWOQLEO.w")
	public int field28 = -1;

	@ObfuscatedName("AUWOQLEO.A")
	public int field31 = -1;

	@ObfuscatedName("AUWOQLEO.C")
	public int field32 = -1;

	@ObfuscatedName("AUWOQLEO.I")
	public int field37 = -1;

	@ObfuscatedName("AUWOQLEO.K")
	public boolean field39 = true;

	@ObfuscatedName("AUWOQLEO.L")
	public int field40 = -1;

	@ObfuscatedName("AUWOQLEO.M")
	public long field41 = -1L;

	@ObfuscatedName("AUWOQLEO.N")
	public int field42 = -1;

	@ObfuscatedName("AUWOQLEO.b")
	public static AKUDQPZE field9 = new AKUDQPZE(30);

	@ObfuscatedName("AUWOQLEO.j")
	public int field17;

	@ObfuscatedName("AUWOQLEO.p")
	public static int field22;

	@ObfuscatedName("AUWOQLEO.t")
	public static int field25;

	@ObfuscatedName("AUWOQLEO.P")
	public int field44;

	@ObfuscatedName("AUWOQLEO.y")
	public static EGCCHUZS field30;

	@ObfuscatedName("AUWOQLEO.x")
	public static client field29;

	@ObfuscatedName("AUWOQLEO.D")
	public String field33;

	@ObfuscatedName("AUWOQLEO.s")
	public byte[] field24;

	@ObfuscatedName("AUWOQLEO.d")
	public static int[] field11;

	@ObfuscatedName("AUWOQLEO.f")
	public int[] field13;

	@ObfuscatedName("AUWOQLEO.m")
	public int[] field19;

	@ObfuscatedName("AUWOQLEO.F")
	public int[] field34;

	@ObfuscatedName("AUWOQLEO.H")
	public int[] field36;

	@ObfuscatedName("AUWOQLEO.O")
	public int[] field43;

	@ObfuscatedName("AUWOQLEO.J")
	public static AUWOQLEO[] field38;

	@ObfuscatedName("AUWOQLEO.G")
	public String[] field35;

	@ObfuscatedName("AUWOQLEO.a(I)Z")
	public boolean method4() {
		if (field19 == null) {
			return true;
		}

		int var1 = -1;
		if (field28 != -1) {
			EMWMNDZQ var2 = EMWMNDZQ.field602[field28];
			int var3 = var2.field604;
			int var4 = var2.field605;
			int var5 = var2.field606;
			int var6 = client.field395[var5 - var4];
			var1 = field29.field95[var3] >> var4 & var6;
		} else if (field42 != -1) {
			var1 = field29.field95[field42];
		}

		if (var1 >= 0 && var1 < field19.length && field19[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("AUWOQLEO.a(LEGCCHUZS;Z)V")
	public final void method5(EGCCHUZS arg0) {
		while (true) {
			int var2 = arg0.method261();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method261();
				field36 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field36[var4] = arg0.method263();
				}
			} else if (var2 == 2) {
				field33 = arg0.method268();
			} else if (var2 == 3) {
				field24 = arg0.method269();
			} else if (var2 == 12) {
				field16 = arg0.method262();
			} else if (var2 == 13) {
				field27 = arg0.method263();
			} else if (var2 == 14) {
				field12 = arg0.method263();
			} else if (var2 == 17) {
				field12 = arg0.method263();
				field14 = arg0.method263();
				field31 = arg0.method263();
				field20 = arg0.method263();
			} else if (var2 >= 30 && var2 < 40) {
				if (field35 == null) {
					field35 = new String[5];
				}

				field35[var2 - 30] = arg0.method268();
				if (field35[var2 - 30].equalsIgnoreCase("hidden")) {
					field35[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method261();
				field13 = new int[var5];
				field43 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field13[var6] = arg0.method263();
					field43[var6] = arg0.method263();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method261();
				field34 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field34[var8] = arg0.method263();
				}
			} else if (var2 == 90) {
				field21 = arg0.method263();
			} else if (var2 == 91) {
				field32 = arg0.method263();
			} else if (var2 == 92) {
				field37 = arg0.method263();
			} else if (var2 == 93) {
				field39 = false;
			} else if (var2 == 95) {
				field40 = arg0.method263();
			} else if (var2 == 97) {
				field15 = arg0.method263();
			} else if (var2 == 98) {
				field23 = arg0.method263();
			} else if (var2 == 99) {
				field18 = true;
			} else if (var2 == 100) {
				field17 = arg0.method262();
			} else if (var2 == 101) {
				field44 = arg0.method262() * 5;
			} else if (var2 == 102) {
				field26 = arg0.method263();
			} else if (var2 == 103) {
				field8 = arg0.method263();
			} else if (var2 == 106) {
				field28 = arg0.method263();
				if (field28 == 0xFFFF) {
					field28 = -1;
				}

				field42 = arg0.method263();
				if (field42 == 0xFFFF) {
					field42 = -1;
				}

				int var9 = arg0.method261();
				field19 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field19[var10] = arg0.method263();
					if (field19[var10] == 0xFFFF) {
						field19[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field10 = false;
			}
		}
	}

	@ObfuscatedName("AUWOQLEO.a(B)LAUWOQLEO;")
	public final AUWOQLEO method6() {
		int var1 = -1;
		if (field28 != -1) {
			EMWMNDZQ var2 = EMWMNDZQ.field602[field28];
			int var3 = var2.field604;
			int var4 = var2.field605;
			int var5 = var2.field606;
			int var6 = client.field395[var5 - var4];
			var1 = field29.field95[var3] >> var4 & var6;
		} else if (field42 != -1) {
			var1 = field29.field95[field42];
		}

		if (var1 >= 0 && var1 < field19.length && field19[var1] != -1) {
			return method9(field19[var1]);
		}

		return null;
	}

	@ObfuscatedName("AUWOQLEO.a(BII[I)LIGXVZOHI;")
	public final IGXVZOHI method7(int arg0, int arg1, int[] arg2) {
		if (field19 != null) {
			AUWOQLEO var4 = method6();
			if (var4 == null) {
				return null;
			}

			return var4.method7(arg0, arg1, arg2);
		}

		IGXVZOHI var5 = (IGXVZOHI) field9.method1(field41);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field36.length; var7++) {
				if (!IGXVZOHI.method355(field36[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			IGXVZOHI[] var8 = new IGXVZOHI[field36.length];
			for (int var9 = 0; var9 < field36.length; var9++) {
				var8[var9] = IGXVZOHI.method354(field36[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new IGXVZOHI(var8.length, var8);
			}

			if (field13 != null) {
				for (int var10 = 0; var10 < field13.length; var10++) {
					var5.method368(field13[var10], field43[var10]);
				}
			}

			var5.method361();
			var5.method371(field17 + 64, field44 + 850, -30, -50, -30, true);
			field9.method2(var5, field41);
		}

		IGXVZOHI var11 = IGXVZOHI.field773;
		var11.method356(var5, ICYGYVTE.method349(arg1) & ICYGYVTE.method349(arg0));

		if (arg1 != -1 && arg0 != -1) {
			var11.method363(arg2, arg0, arg1);
		} else if (arg1 != -1) {
			var11.method362(arg1);
		}

		if (field15 != 128 || field23 != 128) {
			var11.method370(field15, field23, field15);
		}

		var11.method358();
		var11.field810 = null;
		var11.field809 = null;

		if (field16 == 1) {
			var11.field811 = true;
		}

		return var11;
	}

	@ObfuscatedName("AUWOQLEO.a(LTKEGJSFV;)V")
	public static final void method8(TKEGJSFV arg0) {
		field30 = new EGCCHUZS(arg0.method542("npc.dat", null));
		EGCCHUZS var1 = new EGCCHUZS(arg0.method542("npc.idx", null));
		field25 = var1.method263();
		field11 = new int[field25];
		int var2 = 2;
		for (int var3 = 0; var3 < field25; var3++) {
			field11[var3] = var2;
			var2 += var1.method263();
		}

		field38 = new AUWOQLEO[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field38[var4] = new AUWOQLEO();
		}
	}

	@ObfuscatedName("AUWOQLEO.b(I)LAUWOQLEO;")
	public static final AUWOQLEO method9(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field38[var1].field41) {
				return field38[var1];
			}
		}

		field22 = (field22 + 1) % 20;
		AUWOQLEO var2 = field38[field22] = new AUWOQLEO();
		field30.field589 = field11[arg0];
		var2.field41 = arg0;
		var2.method5(field30);
		return var2;
	}

	@ObfuscatedName("AUWOQLEO.b(B)V")
	public static final void method10() {
		field9 = null;
		field11 = null;
		field38 = null;
		field30 = null;
	}

	@ObfuscatedName("AUWOQLEO.c(B)LIGXVZOHI;")
	public final IGXVZOHI method11() {
		if (field19 != null) {
			AUWOQLEO var1 = method6();
			if (var1 == null) {
				return null;
			}

			return var1.method11();
		} else if (field34 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field34.length; var3++) {
				if (!IGXVZOHI.method355(field34[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			IGXVZOHI[] var4 = new IGXVZOHI[field34.length];
			for (int var5 = 0; var5 < field34.length; var5++) {
				var4[var5] = IGXVZOHI.method354(field34[var5]);
			}

			IGXVZOHI var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new IGXVZOHI(var4.length, var4);
			}

			if (field13 != null) {
				for (int var7 = 0; var7 < field13.length; var7++) {
					var6.method368(field13[var7], field43[var7]);
				}
			}

			return var6;
		}
	}
}
