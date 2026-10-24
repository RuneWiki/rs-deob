package deob;

@ObfuscatedName("OMIIKHIV")
public final class OMIIKHIV {

	@ObfuscatedName("OMIIKHIV.a")
	public int field989 = 128;

	@ObfuscatedName("OMIIKHIV.b")
	public int field990 = -1;

	@ObfuscatedName("OMIIKHIV.c")
	public int field991 = -1;

	@ObfuscatedName("OMIIKHIV.g")
	public int field994 = 128;

	@ObfuscatedName("OMIIKHIV.j")
	public long field996 = -1L;

	@ObfuscatedName("OMIIKHIV.k")
	public int field997 = -1;

	@ObfuscatedName("OMIIKHIV.l")
	public int field998 = -1;

	@ObfuscatedName("OMIIKHIV.m")
	public int field999 = -1;

	@ObfuscatedName("OMIIKHIV.o")
	public int field1001 = -1;

	@ObfuscatedName("OMIIKHIV.q")
	public boolean field1002 = false;

	@ObfuscatedName("OMIIKHIV.s")
	public byte field1004 = 1;

	@ObfuscatedName("OMIIKHIV.t")
	public boolean field1005 = true;

	@ObfuscatedName("OMIIKHIV.v")
	public int field1007 = -1;

	@ObfuscatedName("OMIIKHIV.w")
	public int field1008 = -1;

	@ObfuscatedName("OMIIKHIV.z")
	public int field1011 = -1;

	@ObfuscatedName("OMIIKHIV.C")
	public int field1014 = -1;

	@ObfuscatedName("OMIIKHIV.I")
	public int field1019 = 32;

	@ObfuscatedName("OMIIKHIV.J")
	public int field1020 = -1;

	@ObfuscatedName("OMIIKHIV.M")
	public boolean field1023 = true;

	@ObfuscatedName("OMIIKHIV.O")
	public int field1025 = -1;

	@ObfuscatedName("OMIIKHIV.L")
	public static LSQNLJTA field1022 = new LSQNLJTA(30);

	@ObfuscatedName("OMIIKHIV.r")
	public static int field1003;

	@ObfuscatedName("OMIIKHIV.A")
	public int field1012;

	@ObfuscatedName("OMIIKHIV.H")
	public int field1018;

	@ObfuscatedName("OMIIKHIV.h")
	public static int field995;

	@ObfuscatedName("OMIIKHIV.x")
	public static CFARFRSG field1009;

	@ObfuscatedName("OMIIKHIV.y")
	public static client field1010;

	@ObfuscatedName("OMIIKHIV.B")
	public String field1013;

	@ObfuscatedName("OMIIKHIV.N")
	public byte[] field1024;

	@ObfuscatedName("OMIIKHIV.u")
	public int[] field1006;

	@ObfuscatedName("OMIIKHIV.D")
	public int[] field1015;

	@ObfuscatedName("OMIIKHIV.E")
	public static int[] field1016;

	@ObfuscatedName("OMIIKHIV.K")
	public int[] field1021;

	@ObfuscatedName("OMIIKHIV.d")
	public int[] field992;

	@ObfuscatedName("OMIIKHIV.e")
	public int[] field993;

	@ObfuscatedName("OMIIKHIV.n")
	public static OMIIKHIV[] field1000;

	@ObfuscatedName("OMIIKHIV.G")
	public String[] field1017;

	@ObfuscatedName("OMIIKHIV.a(LCFARFRSG;I)V")
	public final void method443(CFARFRSG arg0) {
		while (true) {
			int var2 = arg0.method30();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method30();
				field1006 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1006[var4] = arg0.method32();
				}
			} else if (var2 == 2) {
				field1013 = arg0.method37();
			} else if (var2 == 3) {
				field1024 = arg0.method38();
			} else if (var2 == 12) {
				field1004 = arg0.method31();
			} else if (var2 == 13) {
				field1011 = arg0.method32();
			} else if (var2 == 14) {
				field1001 = arg0.method32();
			} else if (var2 == 17) {
				field1001 = arg0.method32();
				field1025 = arg0.method32();
				field997 = arg0.method32();
				field1008 = arg0.method32();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1017 == null) {
					field1017 = new String[5];
				}

				field1017[var2 - 30] = arg0.method37();
				if (field1017[var2 - 30].equalsIgnoreCase("hidden")) {
					field1017[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method30();
				field1021 = new int[var5];
				field993 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1021[var6] = arg0.method32();
					field993[var6] = arg0.method32();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method30();
				field1015 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1015[var8] = arg0.method32();
				}
			} else if (var2 == 90) {
				field1020 = arg0.method32();
			} else if (var2 == 91) {
				field999 = arg0.method32();
			} else if (var2 == 92) {
				field998 = arg0.method32();
			} else if (var2 == 93) {
				field1005 = false;
			} else if (var2 == 95) {
				field991 = arg0.method32();
			} else if (var2 == 97) {
				field989 = arg0.method32();
			} else if (var2 == 98) {
				field994 = arg0.method32();
			} else if (var2 == 99) {
				field1002 = true;
			} else if (var2 == 100) {
				field1012 = arg0.method31();
			} else if (var2 == 101) {
				field1018 = arg0.method31() * 5;
			} else if (var2 == 102) {
				field1007 = arg0.method32();
			} else if (var2 == 103) {
				field1019 = arg0.method32();
			} else if (var2 == 106) {
				field1014 = arg0.method32();
				if (field1014 == 0xFFFF) {
					field1014 = -1;
				}

				field990 = arg0.method32();
				if (field990 == 0xFFFF) {
					field990 = -1;
				}

				int var9 = arg0.method30();
				field992 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field992[var10] = arg0.method32();
					if (field992[var10] == 0xFFFF) {
						field992[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1023 = false;
			}
		}
	}

	@ObfuscatedName("OMIIKHIV.a(I)LOMIIKHIV;")
	public static final OMIIKHIV method444(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1000[var1].field996) {
				return field1000[var1];
			}
		}

		field995 = (field995 + 1) % 20;
		OMIIKHIV var2 = field1000[field995] = new OMIIKHIV();
		field1009.field44 = field1016[arg0];
		var2.field996 = arg0;
		var2.method443(field1009);
		return var2;
	}

	@ObfuscatedName("OMIIKHIV.a([IZII)LLFTMDGKK;")
	public final LFTMDGKK method445(int[] arg0, int arg1, int arg2) {
		if (field992 != null) {
			OMIIKHIV var4 = method446();
			if (var4 == null) {
				return null;
			}

			return var4.method445(arg0, arg1, arg2);
		}

		LFTMDGKK var5 = (LFTMDGKK) field1022.method369(field996);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1006.length; var7++) {
				if (!LFTMDGKK.method342(field1006[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			LFTMDGKK[] var8 = new LFTMDGKK[field1006.length];
			for (int var9 = 0; var9 < field1006.length; var9++) {
				var8[var9] = LFTMDGKK.method341(field1006[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new LFTMDGKK(var8.length, var8);
			}

			if (field1021 != null) {
				for (int var10 = 0; var10 < field1021.length; var10++) {
					var5.method355(field1021[var10], field993[var10]);
				}
			}

			var5.method348();
			var5.method358(field1012 + 64, field1018 + 850, -30, -50, -30, true);
			field1022.method370(var5, field996);
		}

		LFTMDGKK var11 = LFTMDGKK.field815;
		var11.method343(var5, CANZHIOT.method17(arg2) & CANZHIOT.method17(arg1));

		if (arg2 != -1 && arg1 != -1) {
			var11.method350(arg0, arg1, arg2);
		} else if (arg2 != -1) {
			var11.method349(arg2);
		}

		if (field989 != 128 || field994 != 128) {
			var11.method357(field994, field989, field989);
		}

		var11.method345();
		var11.field852 = null;
		var11.field851 = null;

		if (field1004 == 1) {
			var11.field853 = true;
		}

		return var11;
	}

	@ObfuscatedName("OMIIKHIV.b(I)LOMIIKHIV;")
	public final OMIIKHIV method446() {
		int var1 = -1;
		if (field1014 != -1) {
			DDXRHBHP var2 = DDXRHBHP.field496[field1014];
			int var3 = var2.field498;
			int var4 = var2.field499;
			int var5 = var2.field500;
			int var6 = client.field461[var5 - var4];
			var1 = field1010.field351[var3] >> var4 & var6;
		} else if (field990 != -1) {
			var1 = field1010.field351[field990];
		}

		if (var1 >= 0 && var1 < field992.length && field992[var1] != -1) {
			return method444(field992[var1]);
		}

		return null;
	}

	@ObfuscatedName("OMIIKHIV.c(I)Z")
	public boolean method447() {
		if (field992 == null) {
			return true;
		}

		int var1 = -1;
		if (field1014 != -1) {
			DDXRHBHP var2 = DDXRHBHP.field496[field1014];
			int var3 = var2.field498;
			int var4 = var2.field499;
			int var5 = var2.field500;
			int var6 = client.field461[var5 - var4];
			var1 = field1010.field351[var3] >> var4 & var6;
		} else if (field990 != -1) {
			var1 = field1010.field351[field990];
		}

		if (var1 >= 0 && var1 < field992.length && field992[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("OMIIKHIV.a(LVSUYIIVA;)V")
	public static final void method448(VSUYIIVA arg0) {
		field1009 = new CFARFRSG(arg0.method570("npc.dat", null));
		CFARFRSG var1 = new CFARFRSG(arg0.method570("npc.idx", null));
		field1003 = var1.method32();
		field1016 = new int[field1003];
		int var2 = 2;
		for (int var3 = 0; var3 < field1003; var3++) {
			field1016[var3] = var2;
			var2 += var1.method32();
		}

		field1000 = new OMIIKHIV[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1000[var4] = new OMIIKHIV();
		}
	}

	@ObfuscatedName("OMIIKHIV.a(B)LLFTMDGKK;")
	public final LFTMDGKK method449() {
		if (field992 != null) {
			OMIIKHIV var1 = method446();
			if (var1 == null) {
				return null;
			}

			return var1.method449();
		} else if (field1015 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1015.length; var3++) {
				if (!LFTMDGKK.method342(field1015[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			LFTMDGKK[] var4 = new LFTMDGKK[field1015.length];
			for (int var5 = 0; var5 < field1015.length; var5++) {
				var4[var5] = LFTMDGKK.method341(field1015[var5]);
			}

			LFTMDGKK var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new LFTMDGKK(var4.length, var4);
			}

			if (field1021 != null) {
				for (int var7 = 0; var7 < field1021.length; var7++) {
					var6.method355(field1021[var7], field993[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("OMIIKHIV.a(Z)V")
	public static final void method450() {
		field1022 = null;
		field1016 = null;
		field1000 = null;
		field1009 = null;
	}
}
