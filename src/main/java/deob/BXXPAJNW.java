package deob;

@ObfuscatedName("BXXPAJNW")
public final class BXXPAJNW {

	@ObfuscatedName("BXXPAJNW.a")
	public boolean field55 = false;

	@ObfuscatedName("BXXPAJNW.b")
	public int field56 = -1;

	@ObfuscatedName("BXXPAJNW.d")
	public int field58 = -1;

	@ObfuscatedName("BXXPAJNW.e")
	public int field59 = 128;

	@ObfuscatedName("BXXPAJNW.h")
	public int field62 = -1;

	@ObfuscatedName("BXXPAJNW.i")
	public int field63 = -1;

	@ObfuscatedName("BXXPAJNW.k")
	public int field65 = -1;

	@ObfuscatedName("BXXPAJNW.n")
	public int field67 = -1;

	@ObfuscatedName("BXXPAJNW.o")
	public int field68 = -1;

	@ObfuscatedName("BXXPAJNW.q")
	public long field70 = -1L;

	@ObfuscatedName("BXXPAJNW.u")
	public int field74 = 32;

	@ObfuscatedName("BXXPAJNW.v")
	public int field75 = 128;

	@ObfuscatedName("BXXPAJNW.w")
	public int field76 = -1;

	@ObfuscatedName("BXXPAJNW.x")
	public byte field77 = 1;

	@ObfuscatedName("BXXPAJNW.F")
	public int field84 = -1;

	@ObfuscatedName("BXXPAJNW.G")
	public boolean field85 = true;

	@ObfuscatedName("BXXPAJNW.I")
	public int field87 = -1;

	@ObfuscatedName("BXXPAJNW.K")
	public int field89 = -1;

	@ObfuscatedName("BXXPAJNW.L")
	public int field90 = -1;

	@ObfuscatedName("BXXPAJNW.f")
	public static ASORKPAH field60 = new ASORKPAH(30);

	@ObfuscatedName("BXXPAJNW.g")
	public int field61;

	@ObfuscatedName("BXXPAJNW.j")
	public static int field64;

	@ObfuscatedName("BXXPAJNW.r")
	public static int field71;

	@ObfuscatedName("BXXPAJNW.y")
	public int field78;

	@ObfuscatedName("BXXPAJNW.t")
	public static CKBTFRZM field73;

	@ObfuscatedName("BXXPAJNW.s")
	public static client field72;

	@ObfuscatedName("BXXPAJNW.E")
	public String field83;

	@ObfuscatedName("BXXPAJNW.m")
	public byte[] field66;

	@ObfuscatedName("BXXPAJNW.p")
	public int[] field69;

	@ObfuscatedName("BXXPAJNW.z")
	public int[] field79;

	@ObfuscatedName("BXXPAJNW.A")
	public int[] field80;

	@ObfuscatedName("BXXPAJNW.B")
	public int[] field81;

	@ObfuscatedName("BXXPAJNW.H")
	public static int[] field86;

	@ObfuscatedName("BXXPAJNW.J")
	public int[] field88;

	@ObfuscatedName("BXXPAJNW.C")
	public static BXXPAJNW[] field82;

	@ObfuscatedName("BXXPAJNW.c")
	public String[] field57;

	@ObfuscatedName("BXXPAJNW.a(I)LGFYXEFQY;")
	public final GFYXEFQY method25() {
		if (field69 != null) {
			BXXPAJNW var1 = method27();
			if (var1 == null) {
				return null;
			}

			return var1.method25();
		} else if (field80 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field80.length; var3++) {
				if (!GFYXEFQY.method342(field80[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			GFYXEFQY[] var4 = new GFYXEFQY[field80.length];
			for (int var5 = 0; var5 < field80.length; var5++) {
				var4[var5] = GFYXEFQY.method341(field80[var5]);
			}

			GFYXEFQY var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new GFYXEFQY(var4, var4.length);
			}

			if (field88 != null) {
				for (int var7 = 0; var7 < field88.length; var7++) {
					var6.method355(field88[var7], field79[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("BXXPAJNW.a(BII[I)LGFYXEFQY;")
	public final GFYXEFQY method26(int arg0, int arg1, int[] arg2) {
		if (field69 != null) {
			BXXPAJNW var4 = method27();
			if (var4 == null) {
				return null;
			}

			return var4.method26(arg0, arg1, arg2);
		}

		GFYXEFQY var5 = (GFYXEFQY) field60.method1(field70);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field81.length; var7++) {
				if (!GFYXEFQY.method342(field81[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			GFYXEFQY[] var8 = new GFYXEFQY[field81.length];
			for (int var9 = 0; var9 < field81.length; var9++) {
				var8[var9] = GFYXEFQY.method341(field81[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new GFYXEFQY(var8, var8.length);
			}

			if (field88 != null) {
				for (int var10 = 0; var10 < field88.length; var10++) {
					var5.method355(field88[var10], field79[var10]);
				}
			}

			var5.method348();
			var5.method358(field78 + 64, field61 + 850, -30, -50, -30, true);
			field60.method2(field70, var5);
		}

		GFYXEFQY var11 = GFYXEFQY.field748;
		var11.method343(ERVJQNCY.method282(arg0) & ERVJQNCY.method282(arg1), var5);

		if (arg0 != -1 && arg1 != -1) {
			var11.method350(arg2, arg0, arg1);
		} else if (arg0 != -1) {
			var11.method349(arg0);
		}

		if (field75 != 128 || field59 != 128) {
			var11.method357(field75, field75, field59);
		}

		var11.method345();
		var11.field785 = null;
		var11.field784 = null;

		if (field77 == 1) {
			var11.field786 = true;
		}

		return var11;
	}

	@ObfuscatedName("BXXPAJNW.b(I)LBXXPAJNW;")
	public final BXXPAJNW method27() {
		int var1 = -1;
		if (field87 != -1) {
			ZESTMKXA var2 = ZESTMKXA.field1479[field87];
			int var3 = var2.field1481;
			int var4 = var2.field1482;
			int var5 = var2.field1483;
			int var6 = client.field174[var5 - var4];
			var1 = field72.field336[var3] >> var4 & var6;
		} else if (field58 != -1) {
			var1 = field72.field336[field58];
		}

		if (var1 >= 0 && var1 < field69.length && field69[var1] != -1) {
			return method31(field69[var1]);
		}

		return null;
	}

	@ObfuscatedName("BXXPAJNW.a(LEAXVDNXA;)V")
	public static final void method28(EAXVDNXA arg0) {
		field73 = new CKBTFRZM(arg0.method255("npc.dat", null));
		CKBTFRZM var1 = new CKBTFRZM(arg0.method255("npc.idx", null));
		field64 = var1.method46();
		field86 = new int[field64];
		int var2 = 2;
		for (int var3 = 0; var3 < field64; var3++) {
			field86[var3] = var2;
			var2 += var1.method46();
		}

		field82 = new BXXPAJNW[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field82[var4] = new BXXPAJNW();
		}
	}

	@ObfuscatedName("BXXPAJNW.a(BLCKBTFRZM;)V")
	public final void method29(CKBTFRZM arg0) {
		while (true) {
			int var2 = arg0.method44();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method44();
				field81 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field81[var4] = arg0.method46();
				}
			} else if (var2 == 2) {
				field83 = arg0.method51();
			} else if (var2 == 3) {
				field66 = arg0.method52();
			} else if (var2 == 12) {
				field77 = arg0.method45();
			} else if (var2 == 13) {
				field63 = arg0.method46();
			} else if (var2 == 14) {
				field65 = arg0.method46();
			} else if (var2 == 17) {
				field65 = arg0.method46();
				field56 = arg0.method46();
				field68 = arg0.method46();
				field76 = arg0.method46();
			} else if (var2 >= 30 && var2 < 40) {
				if (field57 == null) {
					field57 = new String[5];
				}

				field57[var2 - 30] = arg0.method51();
				if (field57[var2 - 30].equalsIgnoreCase("hidden")) {
					field57[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method44();
				field88 = new int[var5];
				field79 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field88[var6] = arg0.method46();
					field79[var6] = arg0.method46();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method44();
				field80 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field80[var8] = arg0.method46();
				}
			} else if (var2 == 90) {
				field89 = arg0.method46();
			} else if (var2 == 91) {
				field90 = arg0.method46();
			} else if (var2 == 92) {
				field84 = arg0.method46();
			} else if (var2 == 93) {
				field85 = false;
			} else if (var2 == 95) {
				field67 = arg0.method46();
			} else if (var2 == 97) {
				field75 = arg0.method46();
			} else if (var2 == 98) {
				field59 = arg0.method46();
			} else if (var2 == 99) {
				field55 = true;
			} else if (var2 == 100) {
				field78 = arg0.method45();
			} else if (var2 == 101) {
				field61 = arg0.method45() * 5;
			} else if (var2 == 102) {
				field62 = arg0.method46();
			} else if (var2 == 103) {
				field74 = arg0.method46();
			} else if (var2 == 106) {
				field87 = arg0.method46();
				if (field87 == 0xFFFF) {
					field87 = -1;
				}

				field58 = arg0.method46();
				if (field58 == 0xFFFF) {
					field58 = -1;
				}

				int var9 = arg0.method44();
				field69 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field69[var10] = arg0.method46();
					if (field69[var10] == 0xFFFF) {
						field69[var10] = -1;
					}
				}
			}
		}
	}

	@ObfuscatedName("BXXPAJNW.c(I)V")
	public static final void method30() {
		field60 = null;
		field86 = null;
		field82 = null;
		field73 = null;
	}

	@ObfuscatedName("BXXPAJNW.d(I)LBXXPAJNW;")
	public static final BXXPAJNW method31(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field82[var1].field70) {
				return field82[var1];
			}
		}

		field71 = (field71 + 1) % 20;
		BXXPAJNW var2 = field82[field71] = new BXXPAJNW();
		field73.field92 = field86[arg0];
		var2.field70 = arg0;
		var2.method29(field73);
		return var2;
	}
}
