package deob;

@ObfuscatedName("GALAVQEJ")
public final class GALAVQEJ {

	@ObfuscatedName("GALAVQEJ.c")
	public int field635 = -1;

	@ObfuscatedName("GALAVQEJ.d")
	public int field636 = -1;

	@ObfuscatedName("GALAVQEJ.e")
	public boolean field637 = false;

	@ObfuscatedName("GALAVQEJ.g")
	public int field639 = -1;

	@ObfuscatedName("GALAVQEJ.o")
	public int field646 = -1;

	@ObfuscatedName("GALAVQEJ.p")
	public int field647 = 128;

	@ObfuscatedName("GALAVQEJ.r")
	public int field649 = 32;

	@ObfuscatedName("GALAVQEJ.u")
	public boolean field651 = true;

	@ObfuscatedName("GALAVQEJ.v")
	public int field652 = -1;

	@ObfuscatedName("GALAVQEJ.x")
	public long field654 = -1L;

	@ObfuscatedName("GALAVQEJ.y")
	public int field655 = -1;

	@ObfuscatedName("GALAVQEJ.z")
	public byte field656 = 1;

	@ObfuscatedName("GALAVQEJ.C")
	public int field659 = -1;

	@ObfuscatedName("GALAVQEJ.E")
	public int field661 = -1;

	@ObfuscatedName("GALAVQEJ.H")
	public boolean field663 = true;

	@ObfuscatedName("GALAVQEJ.I")
	public int field664 = -1;

	@ObfuscatedName("GALAVQEJ.J")
	public int field665 = 128;

	@ObfuscatedName("GALAVQEJ.K")
	public int field666 = -1;

	@ObfuscatedName("GALAVQEJ.L")
	public int field667 = -1;

	@ObfuscatedName("GALAVQEJ.M")
	public int field668 = -1;

	@ObfuscatedName("GALAVQEJ.b")
	public static ZPNSJLZE field634 = new ZPNSJLZE(30);

	@ObfuscatedName("GALAVQEJ.i")
	public int field641;

	@ObfuscatedName("GALAVQEJ.m")
	public static int field644;

	@ObfuscatedName("GALAVQEJ.D")
	public int field660;

	@ObfuscatedName("GALAVQEJ.N")
	public static int field669;

	@ObfuscatedName("GALAVQEJ.j")
	public static NHEPCMLW field642;

	@ObfuscatedName("GALAVQEJ.n")
	public static client field645;

	@ObfuscatedName("GALAVQEJ.A")
	public String field657;

	@ObfuscatedName("GALAVQEJ.a")
	public byte[] field633;

	@ObfuscatedName("GALAVQEJ.f")
	public static int[] field638;

	@ObfuscatedName("GALAVQEJ.h")
	public int[] field640;

	@ObfuscatedName("GALAVQEJ.l")
	public int[] field643;

	@ObfuscatedName("GALAVQEJ.w")
	public int[] field653;

	@ObfuscatedName("GALAVQEJ.B")
	public int[] field658;

	@ObfuscatedName("GALAVQEJ.G")
	public int[] field662;

	@ObfuscatedName("GALAVQEJ.q")
	public static GALAVQEJ[] field648;

	@ObfuscatedName("GALAVQEJ.s")
	public String[] field650;

	@ObfuscatedName("GALAVQEJ.a(I)LGALAVQEJ;")
	public static final GALAVQEJ method203(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field648[var1].field654) {
				return field648[var1];
			}
		}

		field644 = (field644 + 1) % 20;
		GALAVQEJ var2 = field648[field644] = new GALAVQEJ();
		field642.field965 = field638[arg0];
		var2.field654 = arg0;
		var2.method207(field642);
		return var2;
	}

	@ObfuscatedName("GALAVQEJ.b(I)LCSGBDGDY;")
	public final CSGBDGDY method204() {
		if (field658 != null) {
			GALAVQEJ var1 = method206();
			if (var1 == null) {
				return null;
			}

			return var1.method204();
		} else if (field640 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field640.length; var3++) {
				if (!CSGBDGDY.method161(field640[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			CSGBDGDY[] var4 = new CSGBDGDY[field640.length];
			for (int var5 = 0; var5 < field640.length; var5++) {
				var4[var5] = CSGBDGDY.method160(field640[var5]);
			}

			CSGBDGDY var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new CSGBDGDY(var4.length, var4);
			}

			if (field662 != null) {
				for (int var7 = 0; var7 < field662.length; var7++) {
					var6.method174(field662[var7], field643[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("GALAVQEJ.a(II[II)LCSGBDGDY;")
	public final CSGBDGDY method205(int arg0, int[] arg1, int arg2) {
		if (field658 != null) {
			GALAVQEJ var4 = method206();
			if (var4 == null) {
				return null;
			}

			return var4.method205(arg0, arg1, arg2);
		}

		CSGBDGDY var5 = (CSGBDGDY) field634.method586(field654);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field653.length; var7++) {
				if (!CSGBDGDY.method161(field653[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			CSGBDGDY[] var8 = new CSGBDGDY[field653.length];
			for (int var9 = 0; var9 < field653.length; var9++) {
				var8[var9] = CSGBDGDY.method160(field653[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new CSGBDGDY(var8.length, var8);
			}

			if (field662 != null) {
				for (int var10 = 0; var10 < field662.length; var10++) {
					var5.method174(field662[var10], field643[var10]);
				}
			}

			var5.method167();
			var5.method177(field660 + 64, field641 + 850, -30, -50, -30, true);
			field634.method587(var5, field654);
		}

		CSGBDGDY var11 = CSGBDGDY.field498;
		var11.method162(var5, KDJQGGIG.method285(arg0) & KDJQGGIG.method285(arg2));

		if (arg0 != -1 && arg2 != -1) {
			var11.method169(arg0, arg1, arg2);
		} else if (arg0 != -1) {
			var11.method168(arg0);
		}

		if (field647 != 128 || field665 != 128) {
			var11.method176(field647, field665, field647);
		}

		var11.method164();
		var11.field535 = null;
		var11.field534 = null;

		if (field656 == 1) {
			var11.field536 = true;
		}

		return var11;
	}

	@ObfuscatedName("GALAVQEJ.c(I)LGALAVQEJ;")
	public final GALAVQEJ method206() {
		int var1 = -1;
		if (field639 != -1) {
			OHEMVFER var2 = OHEMVFER.field1037[field639];
			int var3 = var2.field1039;
			int var4 = var2.field1040;
			int var5 = var2.field1041;
			int var6 = client.field362[var5 - var4];
			var1 = field645.field117[var3] >> var4 & var6;
		} else if (field655 != -1) {
			var1 = field645.field117[field655];
		}

		if (var1 >= 0 && var1 < field658.length && field658[var1] != -1) {
			return method203(field658[var1]);
		}

		return null;
	}

	@ObfuscatedName("GALAVQEJ.a(ZLNHEPCMLW;)V")
	public final void method207(NHEPCMLW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method349();
				field653 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field653[var4] = arg0.method351();
				}
			} else if (var2 == 2) {
				field657 = arg0.method356();
			} else if (var2 == 3) {
				field633 = arg0.method357();
			} else if (var2 == 12) {
				field656 = arg0.method350();
			} else if (var2 == 13) {
				field666 = arg0.method351();
			} else if (var2 == 14) {
				field636 = arg0.method351();
			} else if (var2 == 17) {
				field636 = arg0.method351();
				field659 = arg0.method351();
				field635 = arg0.method351();
				field646 = arg0.method351();
			} else if (var2 >= 30 && var2 < 40) {
				if (field650 == null) {
					field650 = new String[5];
				}

				field650[var2 - 30] = arg0.method356();
				if (field650[var2 - 30].equalsIgnoreCase("hidden")) {
					field650[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method349();
				field662 = new int[var5];
				field643 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field662[var6] = arg0.method351();
					field643[var6] = arg0.method351();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method349();
				field640 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field640[var8] = arg0.method351();
				}
			} else if (var2 == 90) {
				field667 = arg0.method351();
			} else if (var2 == 91) {
				field661 = arg0.method351();
			} else if (var2 == 92) {
				field668 = arg0.method351();
			} else if (var2 == 93) {
				field651 = false;
			} else if (var2 == 95) {
				field652 = arg0.method351();
			} else if (var2 == 97) {
				field647 = arg0.method351();
			} else if (var2 == 98) {
				field665 = arg0.method351();
			} else if (var2 == 99) {
				field637 = true;
			} else if (var2 == 100) {
				field660 = arg0.method350();
			} else if (var2 == 101) {
				field641 = arg0.method350() * 5;
			} else if (var2 == 102) {
				field664 = arg0.method351();
			} else if (var2 == 103) {
				field649 = arg0.method351();
			} else if (var2 == 106) {
				field639 = arg0.method351();
				if (field639 == 0xFFFF) {
					field639 = -1;
				}

				field655 = arg0.method351();
				if (field655 == 0xFFFF) {
					field655 = -1;
				}

				int var9 = arg0.method349();
				field658 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field658[var10] = arg0.method351();
					if (field658[var10] == 0xFFFF) {
						field658[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field663 = false;
			}
		}
	}

	@ObfuscatedName("GALAVQEJ.a(Z)Z")
	public boolean method208() {
		if (field658 == null) {
			return true;
		}

		int var1 = -1;
		if (field639 != -1) {
			OHEMVFER var2 = OHEMVFER.field1037[field639];
			int var3 = var2.field1039;
			int var4 = var2.field1040;
			int var5 = var2.field1041;
			int var6 = client.field362[var5 - var4];
			var1 = field645.field117[var3] >> var4 & var6;
		} else if (field655 != -1) {
			var1 = field645.field117[field655];
		}

		if (var1 >= 0 && var1 < field658.length && field658[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("GALAVQEJ.b(Z)V")
	public static final void method209() {
		field634 = null;
		field638 = null;
		field648 = null;
		field642 = null;
	}

	@ObfuscatedName("GALAVQEJ.a(LINOFEYKQ;)V")
	public static final void method210(INOFEYKQ arg0) {
		field642 = new NHEPCMLW(arg0.method277("npc.dat", null));
		NHEPCMLW var1 = new NHEPCMLW(arg0.method277("npc.idx", null));
		field669 = var1.method351();
		field638 = new int[field669];
		int var2 = 2;
		for (int var3 = 0; var3 < field669; var3++) {
			field638[var3] = var2;
			var2 += var1.method351();
		}

		field648 = new GALAVQEJ[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field648[var4] = new GALAVQEJ();
		}
	}
}
