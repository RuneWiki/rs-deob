package deob;

@ObfuscatedName("FWGUGZKU")
public final class FWGUGZKU {

	@ObfuscatedName("FWGUGZKU.c")
	public int field663 = -1;

	@ObfuscatedName("FWGUGZKU.e")
	public int field665 = -1;

	@ObfuscatedName("FWGUGZKU.h")
	public int field668 = -1;

	@ObfuscatedName("FWGUGZKU.j")
	public boolean field670 = false;

	@ObfuscatedName("FWGUGZKU.u")
	public int field679 = -1;

	@ObfuscatedName("FWGUGZKU.v")
	public int field680 = -1;

	@ObfuscatedName("FWGUGZKU.w")
	public byte field681 = 1;

	@ObfuscatedName("FWGUGZKU.x")
	public boolean field682 = true;

	@ObfuscatedName("FWGUGZKU.z")
	public int field684 = 128;

	@ObfuscatedName("FWGUGZKU.B")
	public int field685 = -1;

	@ObfuscatedName("FWGUGZKU.C")
	public int field686 = -1;

	@ObfuscatedName("FWGUGZKU.D")
	public int field687 = -1;

	@ObfuscatedName("FWGUGZKU.E")
	public int field688 = 32;

	@ObfuscatedName("FWGUGZKU.G")
	public int field689 = -1;

	@ObfuscatedName("FWGUGZKU.H")
	public int field690 = 128;

	@ObfuscatedName("FWGUGZKU.I")
	public int field691 = -1;

	@ObfuscatedName("FWGUGZKU.K")
	public boolean field693 = true;

	@ObfuscatedName("FWGUGZKU.L")
	public int field694 = -1;

	@ObfuscatedName("FWGUGZKU.M")
	public long field695 = -1L;

	@ObfuscatedName("FWGUGZKU.N")
	public int field696 = -1;

	@ObfuscatedName("FWGUGZKU.f")
	public static GOPFMRDJ field666 = new GOPFMRDJ(30);

	@ObfuscatedName("FWGUGZKU.d")
	public int field664;

	@ObfuscatedName("FWGUGZKU.k")
	public static int field671;

	@ObfuscatedName("FWGUGZKU.t")
	public int field678;

	@ObfuscatedName("FWGUGZKU.O")
	public static int field697;

	@ObfuscatedName("FWGUGZKU.m")
	public static XQPFGONL field673;

	@ObfuscatedName("FWGUGZKU.q")
	public static client field676;

	@ObfuscatedName("FWGUGZKU.P")
	public String field698;

	@ObfuscatedName("FWGUGZKU.i")
	public byte[] field669;

	@ObfuscatedName("FWGUGZKU.b")
	public int[] field662;

	@ObfuscatedName("FWGUGZKU.l")
	public int[] field672;

	@ObfuscatedName("FWGUGZKU.o")
	public int[] field675;

	@ObfuscatedName("FWGUGZKU.r")
	public int[] field677;

	@ObfuscatedName("FWGUGZKU.y")
	public int[] field683;

	@ObfuscatedName("FWGUGZKU.J")
	public static int[] field692;

	@ObfuscatedName("FWGUGZKU.g")
	public static FWGUGZKU[] field667;

	@ObfuscatedName("FWGUGZKU.n")
	public String[] field674;

	@ObfuscatedName("FWGUGZKU.a(LXQPFGONL;I)V")
	public final void method207(XQPFGONL arg0) {
		while (true) {
			int var2 = arg0.method478();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method478();
				field672 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field672[var4] = arg0.method480();
				}
			} else if (var2 == 2) {
				field698 = arg0.method485();
			} else if (var2 == 3) {
				field669 = arg0.method486();
			} else if (var2 == 12) {
				field681 = arg0.method479();
			} else if (var2 == 13) {
				field689 = arg0.method480();
			} else if (var2 == 14) {
				field679 = arg0.method480();
			} else if (var2 == 17) {
				field679 = arg0.method480();
				field691 = arg0.method480();
				field687 = arg0.method480();
				field694 = arg0.method480();
			} else if (var2 >= 30 && var2 < 40) {
				if (field674 == null) {
					field674 = new String[5];
				}

				field674[var2 - 30] = arg0.method485();
				if (field674[var2 - 30].equalsIgnoreCase("hidden")) {
					field674[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method478();
				field683 = new int[var5];
				field677 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field683[var6] = arg0.method480();
					field677[var6] = arg0.method480();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method478();
				field662 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field662[var8] = arg0.method480();
				}
			} else if (var2 == 90) {
				field686 = arg0.method480();
			} else if (var2 == 91) {
				field668 = arg0.method480();
			} else if (var2 == 92) {
				field696 = arg0.method480();
			} else if (var2 == 93) {
				field693 = false;
			} else if (var2 == 95) {
				field663 = arg0.method480();
			} else if (var2 == 97) {
				field690 = arg0.method480();
			} else if (var2 == 98) {
				field684 = arg0.method480();
			} else if (var2 == 99) {
				field670 = true;
			} else if (var2 == 100) {
				field664 = arg0.method479();
			} else if (var2 == 101) {
				field678 = arg0.method479() * 5;
			} else if (var2 == 102) {
				field680 = arg0.method480();
			} else if (var2 == 103) {
				field688 = arg0.method480();
			} else if (var2 == 106) {
				field665 = arg0.method480();
				if (field665 == 0xFFFF) {
					field665 = -1;
				}

				field685 = arg0.method480();
				if (field685 == 0xFFFF) {
					field685 = -1;
				}

				int var9 = arg0.method478();
				field675 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field675[var10] = arg0.method480();
					if (field675[var10] == 0xFFFF) {
						field675[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field682 = false;
			}
		}
	}

	@ObfuscatedName("FWGUGZKU.a(Z)LFWGUGZKU;")
	public final FWGUGZKU method208() {
		int var1 = -1;
		if (field665 != -1) {
			JHLQAAYP var2 = JHLQAAYP.field840[field665];
			int var3 = var2.field842;
			int var4 = var2.field843;
			int var5 = var2.field844;
			int var6 = client.field165[var5 - var4];
			var1 = field676.field327[var3] >> var4 & var6;
		} else if (field685 != -1) {
			var1 = field676.field327[field685];
		}

		if (var1 >= 0 && var1 < field675.length && field675[var1] != -1) {
			return method210(field675[var1]);
		}

		return null;
	}

	@ObfuscatedName("FWGUGZKU.a(I)V")
	public static final void method209() {
		field666 = null;
		field692 = null;
		field667 = null;
		field673 = null;
	}

	@ObfuscatedName("FWGUGZKU.b(I)LFWGUGZKU;")
	public static final FWGUGZKU method210(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field667[var1].field695) {
				return field667[var1];
			}
		}

		field697 = (field697 + 1) % 20;
		FWGUGZKU var2 = field667[field697] = new FWGUGZKU();
		field673.field1335 = field692[arg0];
		var2.field695 = arg0;
		var2.method207(field673);
		return var2;
	}

	@ObfuscatedName("FWGUGZKU.a(LXMRRKSSB;)V")
	public static final void method211(XMRRKSSB arg0) {
		field673 = new XQPFGONL(arg0.method465("npc.dat", null));
		XQPFGONL var1 = new XQPFGONL(arg0.method465("npc.idx", null));
		field671 = var1.method480();
		field692 = new int[field671];
		int var2 = 2;
		for (int var3 = 0; var3 < field671; var3++) {
			field692[var3] = var2;
			var2 += var1.method480();
		}

		field667 = new FWGUGZKU[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field667[var4] = new FWGUGZKU();
		}
	}

	@ObfuscatedName("FWGUGZKU.a(BI[II)LITSMSHJO;")
	public final ITSMSHJO method212(int arg0, int[] arg1, int arg2) {
		if (field675 != null) {
			FWGUGZKU var4 = method208();
			if (var4 == null) {
				return null;
			}

			return var4.method212(arg0, arg1, arg2);
		}

		ITSMSHJO var5 = (ITSMSHJO) field666.method220(field695);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field672.length; var7++) {
				if (!ITSMSHJO.method239(field672[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			ITSMSHJO[] var8 = new ITSMSHJO[field672.length];
			for (int var9 = 0; var9 < field672.length; var9++) {
				var8[var9] = ITSMSHJO.method238(field672[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new ITSMSHJO(var8, var8.length);
			}

			if (field683 != null) {
				for (int var10 = 0; var10 < field683.length; var10++) {
					var5.method252(field683[var10], field677[var10]);
				}
			}

			var5.method245();
			var5.method255(field664 + 64, field678 + 850, -30, -50, -30, true);
			field666.method221(field695, var5);
		}

		ITSMSHJO var11 = ITSMSHJO.field748;
		var11.method240(var5, SCIASJXX.method401(arg0) & SCIASJXX.method401(arg2));

		if (arg0 != -1 && arg2 != -1) {
			var11.method247(arg0, arg1, arg2);
		} else if (arg0 != -1) {
			var11.method246(arg0);
		}

		if (field690 != 128 || field684 != 128) {
			var11.method254(field690, field690, field684);
		}

		var11.method242();
		var11.field785 = null;
		var11.field784 = null;

		if (field681 == 1) {
			var11.field786 = true;
		}

		return var11;
	}

	@ObfuscatedName("FWGUGZKU.c(I)LITSMSHJO;")
	public final ITSMSHJO method213() {
		if (field675 != null) {
			FWGUGZKU var1 = method208();
			if (var1 == null) {
				return null;
			}

			return var1.method213();
		} else if (field662 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field662.length; var3++) {
				if (!ITSMSHJO.method239(field662[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			ITSMSHJO[] var4 = new ITSMSHJO[field662.length];
			for (int var5 = 0; var5 < field662.length; var5++) {
				var4[var5] = ITSMSHJO.method238(field662[var5]);
			}

			ITSMSHJO var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new ITSMSHJO(var4, var4.length);
			}

			if (field683 != null) {
				for (int var7 = 0; var7 < field683.length; var7++) {
					var6.method252(field683[var7], field677[var7]);
				}
			}

			return var6;
		}
	}
}
