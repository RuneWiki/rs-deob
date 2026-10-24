package deob;

@ObfuscatedName("BYABUZFP")
public final class BYABUZFP {

	@ObfuscatedName("BYABUZFP.c")
	public int field30 = -1;

	@ObfuscatedName("BYABUZFP.e")
	public int field32 = -1;

	@ObfuscatedName("BYABUZFP.f")
	public boolean field33 = true;

	@ObfuscatedName("BYABUZFP.k")
	public int field38 = -1;

	@ObfuscatedName("BYABUZFP.n")
	public int field40 = -1;

	@ObfuscatedName("BYABUZFP.o")
	public byte field41 = 1;

	@ObfuscatedName("BYABUZFP.p")
	public int field42 = -1;

	@ObfuscatedName("BYABUZFP.r")
	public int field44 = -1;

	@ObfuscatedName("BYABUZFP.s")
	public int field45 = -1;

	@ObfuscatedName("BYABUZFP.t")
	public int field46 = 128;

	@ObfuscatedName("BYABUZFP.w")
	public int field49 = 32;

	@ObfuscatedName("BYABUZFP.x")
	public long field50 = -1L;

	@ObfuscatedName("BYABUZFP.y")
	public int field51 = -1;

	@ObfuscatedName("BYABUZFP.z")
	public boolean field52 = true;

	@ObfuscatedName("BYABUZFP.C")
	public int field55 = 128;

	@ObfuscatedName("BYABUZFP.E")
	public int field57 = -1;

	@ObfuscatedName("BYABUZFP.F")
	public int field58 = -1;

	@ObfuscatedName("BYABUZFP.I")
	public boolean field60 = false;

	@ObfuscatedName("BYABUZFP.L")
	public int field63 = -1;

	@ObfuscatedName("BYABUZFP.M")
	public int field64 = -1;

	@ObfuscatedName("BYABUZFP.v")
	public static RUNMBJUO field48 = new RUNMBJUO(30);

	@ObfuscatedName("BYABUZFP.d")
	public static int field31;

	@ObfuscatedName("BYABUZFP.u")
	public int field47;

	@ObfuscatedName("BYABUZFP.H")
	public static int field59;

	@ObfuscatedName("BYABUZFP.K")
	public int field62;

	@ObfuscatedName("BYABUZFP.a")
	public static MUKVLYLC field28;

	@ObfuscatedName("BYABUZFP.B")
	public static client field54;

	@ObfuscatedName("BYABUZFP.A")
	public String field53;

	@ObfuscatedName("BYABUZFP.j")
	public byte[] field37;

	@ObfuscatedName("BYABUZFP.b")
	public int[] field29;

	@ObfuscatedName("BYABUZFP.g")
	public int[] field34;

	@ObfuscatedName("BYABUZFP.h")
	public int[] field35;

	@ObfuscatedName("BYABUZFP.i")
	public static int[] field36;

	@ObfuscatedName("BYABUZFP.m")
	public int[] field39;

	@ObfuscatedName("BYABUZFP.q")
	public int[] field43;

	@ObfuscatedName("BYABUZFP.J")
	public static BYABUZFP[] field61;

	@ObfuscatedName("BYABUZFP.D")
	public String[] field56;

	@ObfuscatedName("BYABUZFP.a(I)LBYABUZFP;")
	public static final BYABUZFP method24(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field61[var1].field50) {
				return field61[var1];
			}
		}

		field31 = (field31 + 1) % 20;
		BYABUZFP var2 = field61[field31] = new BYABUZFP();
		field28.field812 = field36[arg0];
		var2.field50 = arg0;
		var2.method25(field28);
		return var2;
	}

	@ObfuscatedName("BYABUZFP.a(LMUKVLYLC;Z)V")
	public final void method25(MUKVLYLC arg0) {
		while (true) {
			int var2 = arg0.method292();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method292();
				field29 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field29[var4] = arg0.method294();
				}
			} else if (var2 == 2) {
				field53 = arg0.method299();
			} else if (var2 == 3) {
				field37 = arg0.method300();
			} else if (var2 == 12) {
				field41 = arg0.method293();
			} else if (var2 == 13) {
				field38 = arg0.method294();
			} else if (var2 == 14) {
				field57 = arg0.method294();
			} else if (var2 == 17) {
				field57 = arg0.method294();
				field42 = arg0.method294();
				field44 = arg0.method294();
				field45 = arg0.method294();
			} else if (var2 >= 30 && var2 < 40) {
				if (field56 == null) {
					field56 = new String[5];
				}

				field56[var2 - 30] = arg0.method299();
				if (field56[var2 - 30].equalsIgnoreCase("hidden")) {
					field56[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method292();
				field43 = new int[var5];
				field34 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field43[var6] = arg0.method294();
					field34[var6] = arg0.method294();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method292();
				field39 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field39[var8] = arg0.method294();
				}
			} else if (var2 == 90) {
				field63 = arg0.method294();
			} else if (var2 == 91) {
				field58 = arg0.method294();
			} else if (var2 == 92) {
				field64 = arg0.method294();
			} else if (var2 == 93) {
				field52 = false;
			} else if (var2 == 95) {
				field32 = arg0.method294();
			} else if (var2 == 97) {
				field55 = arg0.method294();
			} else if (var2 == 98) {
				field46 = arg0.method294();
			} else if (var2 == 99) {
				field60 = true;
			} else if (var2 == 100) {
				field62 = arg0.method293();
			} else if (var2 == 101) {
				field47 = arg0.method293() * 5;
			} else if (var2 == 102) {
				field30 = arg0.method294();
			} else if (var2 == 103) {
				field49 = arg0.method294();
			} else if (var2 == 106) {
				field51 = arg0.method294();
				if (field51 == 0xFFFF) {
					field51 = -1;
				}

				field40 = arg0.method294();
				if (field40 == 0xFFFF) {
					field40 = -1;
				}

				int var9 = arg0.method292();
				field35 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field35[var10] = arg0.method294();
					if (field35[var10] == 0xFFFF) {
						field35[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field33 = false;
			}
		}
	}

	@ObfuscatedName("BYABUZFP.a(B)LBYABUZFP;")
	public final BYABUZFP method26() {
		int var1 = -1;
		if (field51 != -1) {
			FTZZSWCP var2 = FTZZSWCP.field640[field51];
			int var3 = var2.field642;
			int var4 = var2.field643;
			int var5 = var2.field644;
			int var6 = client.field114[var5 - var4];
			var1 = field54.field230[var3] >> var4 & var6;
		} else if (field40 != -1) {
			var1 = field54.field230[field40];
		}

		if (var1 >= 0 && var1 < field35.length && field35[var1] != -1) {
			return method24(field35[var1]);
		}

		return null;
	}

	@ObfuscatedName("BYABUZFP.b(I)V")
	public static final void method27() {
		field48 = null;
		field36 = null;
		field61 = null;
		field28 = null;
	}

	@ObfuscatedName("BYABUZFP.a([IIII)LNJPATAFL;")
	public final NJPATAFL method28(int[] arg0, int arg1, int arg2) {
		if (field35 != null) {
			BYABUZFP var4 = method26();
			if (var4 == null) {
				return null;
			}

			return var4.method28(arg0, arg1, arg2);
		}

		NJPATAFL var5 = (NJPATAFL) field48.method450(field50);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field29.length; var7++) {
				if (!NJPATAFL.method335(field29[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			NJPATAFL[] var8 = new NJPATAFL[field29.length];
			for (int var9 = 0; var9 < field29.length; var9++) {
				var8[var9] = NJPATAFL.method334(field29[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new NJPATAFL(var8, var8.length);
			}

			if (field43 != null) {
				for (int var10 = 0; var10 < field43.length; var10++) {
					var5.method348(field43[var10], field34[var10]);
				}
			}

			var5.method341();
			var5.method351(field62 + 64, field47 + 850, -30, -50, -30, true);
			field48.method451(field50, var5);
		}

		NJPATAFL var11 = NJPATAFL.field837;
		var11.method336(var5, TDFMBTLA.method491(arg2) & TDFMBTLA.method491(arg1));

		if (arg2 != -1 && arg1 != -1) {
			var11.method343(arg0, arg1, arg2);
		} else if (arg2 != -1) {
			var11.method342(arg2);
		}

		if (field55 != 128 || field46 != 128) {
			var11.method350(field55, field55, field46);
		}

		var11.method338();
		var11.field874 = null;
		var11.field873 = null;

		if (field41 == 1) {
			var11.field875 = true;
		}

		return var11;
	}

	@ObfuscatedName("BYABUZFP.a(LFIGUVTWB;)V")
	public static final void method29(FIGUVTWB arg0) {
		field28 = new MUKVLYLC(arg0.method209("npc.dat", null));
		MUKVLYLC var1 = new MUKVLYLC(arg0.method209("npc.idx", null));
		field59 = var1.method294();
		field36 = new int[field59];
		int var2 = 2;
		for (int var3 = 0; var3 < field59; var3++) {
			field36[var3] = var2;
			var2 += var1.method294();
		}

		field61 = new BYABUZFP[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field61[var4] = new BYABUZFP();
		}
	}

	@ObfuscatedName("BYABUZFP.b(B)LNJPATAFL;")
	public final NJPATAFL method30() {
		if (field35 != null) {
			BYABUZFP var1 = method26();
			if (var1 == null) {
				return null;
			}

			return var1.method30();
		} else if (field39 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field39.length; var3++) {
				if (!NJPATAFL.method335(field39[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			NJPATAFL[] var4 = new NJPATAFL[field39.length];
			for (int var5 = 0; var5 < field39.length; var5++) {
				var4[var5] = NJPATAFL.method334(field39[var5]);
			}

			NJPATAFL var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new NJPATAFL(var4, var4.length);
			}

			if (field43 != null) {
				for (int var7 = 0; var7 < field43.length; var7++) {
					var6.method348(field43[var7], field34[var7]);
				}
			}

			return var6;
		}
	}
}
