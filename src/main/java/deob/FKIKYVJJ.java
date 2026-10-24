package deob;

@ObfuscatedName("FKIKYVJJ")
public final class FKIKYVJJ {

	@ObfuscatedName("FKIKYVJJ.a")
	public int field661 = -1;

	@ObfuscatedName("FKIKYVJJ.d")
	public int field664 = -1;

	@ObfuscatedName("FKIKYVJJ.i")
	public int field669 = -1;

	@ObfuscatedName("FKIKYVJJ.j")
	public boolean field670 = true;

	@ObfuscatedName("FKIKYVJJ.l")
	public byte field671 = 1;

	@ObfuscatedName("FKIKYVJJ.n")
	public int field673 = -1;

	@ObfuscatedName("FKIKYVJJ.o")
	public boolean field674 = true;

	@ObfuscatedName("FKIKYVJJ.q")
	public int field675 = 32;

	@ObfuscatedName("FKIKYVJJ.r")
	public boolean field676 = false;

	@ObfuscatedName("FKIKYVJJ.s")
	public int field677 = -1;

	@ObfuscatedName("FKIKYVJJ.t")
	public int field678 = -1;

	@ObfuscatedName("FKIKYVJJ.u")
	public int field679 = -1;

	@ObfuscatedName("FKIKYVJJ.z")
	public int field684 = 128;

	@ObfuscatedName("FKIKYVJJ.B")
	public int field686 = -1;

	@ObfuscatedName("FKIKYVJJ.C")
	public int field687 = 128;

	@ObfuscatedName("FKIKYVJJ.F")
	public int field690 = -1;

	@ObfuscatedName("FKIKYVJJ.H")
	public int field692 = -1;

	@ObfuscatedName("FKIKYVJJ.J")
	public long field693 = -1L;

	@ObfuscatedName("FKIKYVJJ.K")
	public int field694 = -1;

	@ObfuscatedName("FKIKYVJJ.N")
	public int field697 = -1;

	@ObfuscatedName("FKIKYVJJ.c")
	public static GOHJFVWE field663 = new GOHJFVWE(30);

	@ObfuscatedName("FKIKYVJJ.b")
	public int field662;

	@ObfuscatedName("FKIKYVJJ.x")
	public static int field682;

	@ObfuscatedName("FKIKYVJJ.y")
	public static int field683;

	@ObfuscatedName("FKIKYVJJ.E")
	public int field689;

	@ObfuscatedName("FKIKYVJJ.M")
	public static YOXDZEVD field696;

	@ObfuscatedName("FKIKYVJJ.f")
	public static client field666;

	@ObfuscatedName("FKIKYVJJ.G")
	public String field691;

	@ObfuscatedName("FKIKYVJJ.L")
	public byte[] field695;

	@ObfuscatedName("FKIKYVJJ.e")
	public int[] field665;

	@ObfuscatedName("FKIKYVJJ.g")
	public int[] field667;

	@ObfuscatedName("FKIKYVJJ.m")
	public int[] field672;

	@ObfuscatedName("FKIKYVJJ.w")
	public static int[] field681;

	@ObfuscatedName("FKIKYVJJ.A")
	public int[] field685;

	@ObfuscatedName("FKIKYVJJ.D")
	public int[] field688;

	@ObfuscatedName("FKIKYVJJ.v")
	public static FKIKYVJJ[] field680;

	@ObfuscatedName("FKIKYVJJ.h")
	public String[] field668;

	@ObfuscatedName("FKIKYVJJ.a(I)LFKIKYVJJ;")
	public static final FKIKYVJJ method202(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field680[var1].field693) {
				return field680[var1];
			}
		}

		field682 = (field682 + 1) % 20;
		FKIKYVJJ var2 = field680[field682] = new FKIKYVJJ();
		field696.field1393 = field681[arg0];
		var2.field693 = arg0;
		var2.method203(field696);
		return var2;
	}

	@ObfuscatedName("FKIKYVJJ.a(BLYOXDZEVD;)V")
	public final void method203(YOXDZEVD arg0) {
		while (true) {
			int var2 = arg0.method549();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method549();
				field685 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field685[var4] = arg0.method551();
				}
			} else if (var2 == 2) {
				field691 = arg0.method556();
			} else if (var2 == 3) {
				field695 = arg0.method557();
			} else if (var2 == 12) {
				field671 = arg0.method550();
			} else if (var2 == 13) {
				field661 = arg0.method551();
			} else if (var2 == 14) {
				field678 = arg0.method551();
			} else if (var2 == 17) {
				field678 = arg0.method551();
				field686 = arg0.method551();
				field664 = arg0.method551();
				field679 = arg0.method551();
			} else if (var2 >= 30 && var2 < 40) {
				if (field668 == null) {
					field668 = new String[5];
				}

				field668[var2 - 30] = arg0.method556();
				if (field668[var2 - 30].equalsIgnoreCase("hidden")) {
					field668[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method549();
				field667 = new int[var5];
				field672 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field667[var6] = arg0.method551();
					field672[var6] = arg0.method551();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method549();
				field665 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field665[var8] = arg0.method551();
				}
			} else if (var2 == 90) {
				field669 = arg0.method551();
			} else if (var2 == 91) {
				field677 = arg0.method551();
			} else if (var2 == 92) {
				field690 = arg0.method551();
			} else if (var2 == 93) {
				field670 = false;
			} else if (var2 == 95) {
				field692 = arg0.method551();
			} else if (var2 == 97) {
				field684 = arg0.method551();
			} else if (var2 == 98) {
				field687 = arg0.method551();
			} else if (var2 == 99) {
				field676 = true;
			} else if (var2 == 100) {
				field689 = arg0.method550();
			} else if (var2 == 101) {
				field662 = arg0.method550() * 5;
			} else if (var2 == 102) {
				field697 = arg0.method551();
			} else if (var2 == 103) {
				field675 = arg0.method551();
			} else if (var2 == 106) {
				field673 = arg0.method551();
				if (field673 == 0xFFFF) {
					field673 = -1;
				}

				field694 = arg0.method551();
				if (field694 == 0xFFFF) {
					field694 = -1;
				}

				int var9 = arg0.method549();
				field688 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field688[var10] = arg0.method551();
					if (field688[var10] == 0xFFFF) {
						field688[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field674 = false;
			}
		}
	}

	@ObfuscatedName("FKIKYVJJ.a(LOTSGNSQM;)V")
	public static final void method204(OTSGNSQM arg0) {
		field696 = new YOXDZEVD(arg0.method376("npc.dat", null));
		YOXDZEVD var1 = new YOXDZEVD(arg0.method376("npc.idx", null));
		field683 = var1.method551();
		field681 = new int[field683];
		int var2 = 2;
		for (int var3 = 0; var3 < field683; var3++) {
			field681[var3] = var2;
			var2 += var1.method551();
		}

		field680 = new FKIKYVJJ[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field680[var4] = new FKIKYVJJ();
		}
	}

	@ObfuscatedName("FKIKYVJJ.a(B)LOIBEFFXI;")
	public final OIBEFFXI method205() {
		if (field688 != null) {
			FKIKYVJJ var1 = method206();
			if (var1 == null) {
				return null;
			}

			return var1.method205();
		} else if (field665 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field665.length; var3++) {
				if (!OIBEFFXI.method347(field665[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			OIBEFFXI[] var4 = new OIBEFFXI[field665.length];
			for (int var5 = 0; var5 < field665.length; var5++) {
				var4[var5] = OIBEFFXI.method346(field665[var5]);
			}

			OIBEFFXI var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new OIBEFFXI(var4, var4.length);
			}

			if (field667 != null) {
				for (int var7 = 0; var7 < field667.length; var7++) {
					var6.method360(field667[var7], field672[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("FKIKYVJJ.a(Z)LFKIKYVJJ;")
	public final FKIKYVJJ method206() {
		int var1 = -1;
		if (field673 != -1) {
			SXQCXZWK var2 = SXQCXZWK.field1133[field673];
			int var3 = var2.field1135;
			int var4 = var2.field1136;
			int var5 = var2.field1137;
			int var6 = client.field385[var5 - var4];
			var1 = field666.field572[var3] >> var4 & var6;
		} else if (field694 != -1) {
			var1 = field666.field572[field694];
		}

		if (var1 >= 0 && var1 < field688.length && field688[var1] != -1) {
			return method202(field688[var1]);
		}

		return null;
	}

	@ObfuscatedName("FKIKYVJJ.b(Z)V")
	public static final void method207() {
		field663 = null;
		field681 = null;
		field680 = null;
		field696 = null;
	}

	@ObfuscatedName("FKIKYVJJ.a([IIII)LOIBEFFXI;")
	public final OIBEFFXI method208(int[] arg0, int arg1, int arg2) {
		if (field688 != null) {
			FKIKYVJJ var4 = method206();
			if (var4 == null) {
				return null;
			}

			return var4.method208(arg0, arg1, arg2);
		}

		OIBEFFXI var5 = (OIBEFFXI) field663.method227(field693);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field685.length; var7++) {
				if (!OIBEFFXI.method347(field685[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			OIBEFFXI[] var8 = new OIBEFFXI[field685.length];
			for (int var9 = 0; var9 < field685.length; var9++) {
				var8[var9] = OIBEFFXI.method346(field685[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new OIBEFFXI(var8, var8.length);
			}

			if (field667 != null) {
				for (int var10 = 0; var10 < field667.length; var10++) {
					var5.method360(field667[var10], field672[var10]);
				}
			}

			var5.method353();
			var5.method363(field689 + 64, field662 + 850, -30, -50, -30, true);
			field663.method228(var5, field693);
		}

		OIBEFFXI var11 = OIBEFFXI.field948;
		var11.method348(UXVWESOT.method455(arg1) & UXVWESOT.method455(arg2), var5);

		if (arg1 != -1 && arg2 != -1) {
			var11.method355(arg0, arg1, arg2);
		} else if (arg1 != -1) {
			var11.method354(arg1);
		}

		if (field684 != 128 || field687 != 128) {
			var11.method362(field687, field684, field684);
		}

		var11.method350();
		var11.field985 = null;
		var11.field984 = null;

		if (field671 == 1) {
			var11.field986 = true;
		}

		return var11;
	}
}
