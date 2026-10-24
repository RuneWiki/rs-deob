package deob;

@ObfuscatedName("HEKJNUPL")
public final class HEKJNUPL {

	@ObfuscatedName("HEKJNUPL.g")
	public int field642 = 128;

	@ObfuscatedName("HEKJNUPL.i")
	public int field643 = -1;

	@ObfuscatedName("HEKJNUPL.j")
	public int field644 = 32;

	@ObfuscatedName("HEKJNUPL.k")
	public int field645 = -1;

	@ObfuscatedName("HEKJNUPL.l")
	public int field646 = -1;

	@ObfuscatedName("HEKJNUPL.m")
	public int field647 = -1;

	@ObfuscatedName("HEKJNUPL.s")
	public byte field652 = 1;

	@ObfuscatedName("HEKJNUPL.t")
	public int field653 = -1;

	@ObfuscatedName("HEKJNUPL.v")
	public boolean field655 = false;

	@ObfuscatedName("HEKJNUPL.w")
	public boolean field656 = true;

	@ObfuscatedName("HEKJNUPL.A")
	public int field658 = -1;

	@ObfuscatedName("HEKJNUPL.B")
	public long field659 = -1L;

	@ObfuscatedName("HEKJNUPL.C")
	public int field660 = 128;

	@ObfuscatedName("HEKJNUPL.D")
	public boolean field661 = true;

	@ObfuscatedName("HEKJNUPL.H")
	public int field665 = -1;

	@ObfuscatedName("HEKJNUPL.J")
	public int field666 = -1;

	@ObfuscatedName("HEKJNUPL.K")
	public int field667 = -1;

	@ObfuscatedName("HEKJNUPL.L")
	public int field668 = -1;

	@ObfuscatedName("HEKJNUPL.N")
	public int field669 = -1;

	@ObfuscatedName("HEKJNUPL.Q")
	public int field672 = -1;

	@ObfuscatedName("HEKJNUPL.o")
	public static RPWOWYDL field649 = new RPWOWYDL(30);

	@ObfuscatedName("HEKJNUPL.d")
	public int field639;

	@ObfuscatedName("HEKJNUPL.f")
	public static int field641;

	@ObfuscatedName("HEKJNUPL.p")
	public static int field650;

	@ObfuscatedName("HEKJNUPL.E")
	public int field662;

	@ObfuscatedName("HEKJNUPL.x")
	public static DNRIFKTO field657;

	@ObfuscatedName("HEKJNUPL.O")
	public static client field670;

	@ObfuscatedName("HEKJNUPL.u")
	public String field654;

	@ObfuscatedName("HEKJNUPL.n")
	public byte[] field648;

	@ObfuscatedName("HEKJNUPL.a")
	public int[] field636;

	@ObfuscatedName("HEKJNUPL.b")
	public int[] field637;

	@ObfuscatedName("HEKJNUPL.q")
	public static int[] field651;

	@ObfuscatedName("HEKJNUPL.F")
	public int[] field663;

	@ObfuscatedName("HEKJNUPL.G")
	public int[] field664;

	@ObfuscatedName("HEKJNUPL.P")
	public int[] field671;

	@ObfuscatedName("HEKJNUPL.c")
	public static HEKJNUPL[] field638;

	@ObfuscatedName("HEKJNUPL.e")
	public String[] field640;

	@ObfuscatedName("HEKJNUPL.a(B)Z")
	public boolean method267() {
		if (field636 == null) {
			return true;
		}

		int var1 = -1;
		if (field643 != -1) {
			LVQCDTJA var2 = LVQCDTJA.field901[field643];
			int var3 = var2.field903;
			int var4 = var2.field904;
			int var5 = var2.field905;
			int var6 = client.field501[var5 - var4];
			var1 = field670.field532[var3] >> var4 & var6;
		} else if (field645 != -1) {
			var1 = field670.field532[field645];
		}

		if (var1 >= 0 && var1 < field636.length && field636[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("HEKJNUPL.a(ZI[II)LSNMMQNPZ;")
	public final SNMMQNPZ method268(int arg0, int[] arg1, int arg2) {
		if (field636 != null) {
			HEKJNUPL var4 = method272();
			if (var4 == null) {
				return null;
			}

			return var4.method268(arg0, arg1, arg2);
		}

		SNMMQNPZ var5 = (SNMMQNPZ) field649.method401(field659);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field671.length; var7++) {
				if (!SNMMQNPZ.method419(field671[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			SNMMQNPZ[] var8 = new SNMMQNPZ[field671.length];
			for (int var9 = 0; var9 < field671.length; var9++) {
				var8[var9] = SNMMQNPZ.method418(field671[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new SNMMQNPZ(var8.length, var8);
			}

			if (field664 != null) {
				for (int var10 = 0; var10 < field664.length; var10++) {
					var5.method432(field664[var10], field637[var10]);
				}
			}

			var5.method425();
			var5.method435(field639 + 64, field662 + 850, -30, -50, -30, true);
			field649.method402(field659, var5);
		}

		SNMMQNPZ var11 = SNMMQNPZ.field1148;
		var11.method420(var5, NLIOLBXV.method356(arg0) & NLIOLBXV.method356(arg2));

		if (arg0 != -1 && arg2 != -1) {
			var11.method427(arg2, arg1, arg0);
		} else if (arg0 != -1) {
			var11.method426(arg0);
		}

		if (field642 != 128 || field660 != 128) {
			var11.method434(field642, field642, field660);
		}

		var11.method422();
		var11.field1185 = null;
		var11.field1184 = null;

		if (field652 == 1) {
			var11.field1186 = true;
		}

		return var11;
	}

	@ObfuscatedName("HEKJNUPL.a(LDNRIFKTO;I)V")
	public final void method269(DNRIFKTO arg0) {
		while (true) {
			int var2 = arg0.method189();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method189();
				field671 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field671[var4] = arg0.method191();
				}
			} else if (var2 == 2) {
				field654 = arg0.method196();
			} else if (var2 == 3) {
				field648 = arg0.method197();
			} else if (var2 == 12) {
				field652 = arg0.method190();
			} else if (var2 == 13) {
				field666 = arg0.method191();
			} else if (var2 == 14) {
				field653 = arg0.method191();
			} else if (var2 == 17) {
				field653 = arg0.method191();
				field646 = arg0.method191();
				field647 = arg0.method191();
				field668 = arg0.method191();
			} else if (var2 >= 30 && var2 < 40) {
				if (field640 == null) {
					field640 = new String[5];
				}

				field640[var2 - 30] = arg0.method196();
				if (field640[var2 - 30].equalsIgnoreCase("hidden")) {
					field640[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method189();
				field664 = new int[var5];
				field637 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field664[var6] = arg0.method191();
					field637[var6] = arg0.method191();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method189();
				field663 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field663[var8] = arg0.method191();
				}
			} else if (var2 == 90) {
				field672 = arg0.method191();
			} else if (var2 == 91) {
				field667 = arg0.method191();
			} else if (var2 == 92) {
				field669 = arg0.method191();
			} else if (var2 == 93) {
				field656 = false;
			} else if (var2 == 95) {
				field658 = arg0.method191();
			} else if (var2 == 97) {
				field642 = arg0.method191();
			} else if (var2 == 98) {
				field660 = arg0.method191();
			} else if (var2 == 99) {
				field655 = true;
			} else if (var2 == 100) {
				field639 = arg0.method190();
			} else if (var2 == 101) {
				field662 = arg0.method190() * 5;
			} else if (var2 == 102) {
				field665 = arg0.method191();
			} else if (var2 == 103) {
				field644 = arg0.method191();
			} else if (var2 == 106) {
				field643 = arg0.method191();
				if (field643 == 0xFFFF) {
					field643 = -1;
				}

				field645 = arg0.method191();
				if (field645 == 0xFFFF) {
					field645 = -1;
				}

				int var9 = arg0.method189();
				field636 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field636[var10] = arg0.method191();
					if (field636[var10] == 0xFFFF) {
						field636[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field661 = false;
			}
		}
	}

	@ObfuscatedName("HEKJNUPL.a(Z)LSNMMQNPZ;")
	public final SNMMQNPZ method270() {
		if (field636 != null) {
			HEKJNUPL var1 = method272();
			if (var1 == null) {
				return null;
			}

			return var1.method270();
		} else if (field663 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field663.length; var3++) {
				if (!SNMMQNPZ.method419(field663[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			SNMMQNPZ[] var4 = new SNMMQNPZ[field663.length];
			for (int var5 = 0; var5 < field663.length; var5++) {
				var4[var5] = SNMMQNPZ.method418(field663[var5]);
			}

			SNMMQNPZ var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new SNMMQNPZ(var4.length, var4);
			}

			if (field664 != null) {
				for (int var7 = 0; var7 < field664.length; var7++) {
					var6.method432(field664[var7], field637[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("HEKJNUPL.a(LFNOQZAYQ;)V")
	public static final void method271(FNOQZAYQ arg0) {
		field657 = new DNRIFKTO(arg0.method246("npc.dat", null));
		DNRIFKTO var1 = new DNRIFKTO(arg0.method246("npc.idx", null));
		field650 = var1.method191();
		field651 = new int[field650];
		int var2 = 2;
		for (int var3 = 0; var3 < field650; var3++) {
			field651[var3] = var2;
			var2 += var1.method191();
		}

		field638 = new HEKJNUPL[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field638[var4] = new HEKJNUPL();
		}
	}

	@ObfuscatedName("HEKJNUPL.a(I)LHEKJNUPL;")
	public final HEKJNUPL method272() {
		int var1 = -1;
		if (field643 != -1) {
			LVQCDTJA var2 = LVQCDTJA.field901[field643];
			int var3 = var2.field903;
			int var4 = var2.field904;
			int var5 = var2.field905;
			int var6 = client.field501[var5 - var4];
			var1 = field670.field532[var3] >> var4 & var6;
		} else if (field645 != -1) {
			var1 = field670.field532[field645];
		}

		if (var1 >= 0 && var1 < field636.length && field636[var1] != -1) {
			return method273(field636[var1]);
		}

		return null;
	}

	@ObfuscatedName("HEKJNUPL.b(I)LHEKJNUPL;")
	public static final HEKJNUPL method273(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field638[var1].field659) {
				return field638[var1];
			}
		}

		field641 = (field641 + 1) % 20;
		HEKJNUPL var2 = field638[field641] = new HEKJNUPL();
		field657.field563 = field651[arg0];
		var2.field659 = arg0;
		var2.method269(field657);
		return var2;
	}

	@ObfuscatedName("HEKJNUPL.c(I)V")
	public static final void method274() {
		field649 = null;
		field651 = null;
		field638 = null;
		field657 = null;
	}
}
