package deob;

@ObfuscatedName("AIEFUHUQ")
public final class AIEFUHUQ {

	@ObfuscatedName("AIEFUHUQ.n")
	public int field63 = -1;

	@ObfuscatedName("AIEFUHUQ.f")
	public static boolean field55 = true;

	@ObfuscatedName("AIEFUHUQ.K")
	public static GOHJFVWE field84 = new GOHJFVWE(50);

	@ObfuscatedName("AIEFUHUQ.O")
	public static GOHJFVWE field87 = new GOHJFVWE(100);

	@ObfuscatedName("AIEFUHUQ.A")
	public byte field74;

	@ObfuscatedName("AIEFUHUQ.T")
	public byte field92;

	@ObfuscatedName("AIEFUHUQ.a")
	public int field51;

	@ObfuscatedName("AIEFUHUQ.e")
	public static int field54;

	@ObfuscatedName("AIEFUHUQ.g")
	public int field56;

	@ObfuscatedName("AIEFUHUQ.h")
	public static int field57;

	@ObfuscatedName("AIEFUHUQ.i")
	public int field58;

	@ObfuscatedName("AIEFUHUQ.j")
	public int field59;

	@ObfuscatedName("AIEFUHUQ.k")
	public int field60;

	@ObfuscatedName("AIEFUHUQ.l")
	public int field61;

	@ObfuscatedName("AIEFUHUQ.o")
	public int field64;

	@ObfuscatedName("AIEFUHUQ.q")
	public int field65;

	@ObfuscatedName("AIEFUHUQ.r")
	public int field66;

	@ObfuscatedName("AIEFUHUQ.s")
	public int field67;

	@ObfuscatedName("AIEFUHUQ.t")
	public int field68;

	@ObfuscatedName("AIEFUHUQ.u")
	public int field69;

	@ObfuscatedName("AIEFUHUQ.v")
	public int field70;

	@ObfuscatedName("AIEFUHUQ.y")
	public int field72;

	@ObfuscatedName("AIEFUHUQ.z")
	public int field73;

	@ObfuscatedName("AIEFUHUQ.B")
	public int field75;

	@ObfuscatedName("AIEFUHUQ.C")
	public int field76;

	@ObfuscatedName("AIEFUHUQ.D")
	public int field77;

	@ObfuscatedName("AIEFUHUQ.E")
	public int field78;

	@ObfuscatedName("AIEFUHUQ.F")
	public int field79;

	@ObfuscatedName("AIEFUHUQ.G")
	public int field80;

	@ObfuscatedName("AIEFUHUQ.I")
	public int field82;

	@ObfuscatedName("AIEFUHUQ.Q")
	public int field89;

	@ObfuscatedName("AIEFUHUQ.R")
	public int field90;

	@ObfuscatedName("AIEFUHUQ.S")
	public int field91;

	@ObfuscatedName("AIEFUHUQ.W")
	public int field95;

	@ObfuscatedName("AIEFUHUQ.Y")
	public int field97;

	@ObfuscatedName("AIEFUHUQ.J")
	public static YOXDZEVD field83;

	@ObfuscatedName("AIEFUHUQ.b")
	public String field52;

	@ObfuscatedName("AIEFUHUQ.M")
	public boolean field86;

	@ObfuscatedName("AIEFUHUQ.U")
	public boolean field93;

	@ObfuscatedName("AIEFUHUQ.L")
	public byte[] field85;

	@ObfuscatedName("AIEFUHUQ.c")
	public int[] field53;

	@ObfuscatedName("AIEFUHUQ.m")
	public int[] field62;

	@ObfuscatedName("AIEFUHUQ.w")
	public int[] field71;

	@ObfuscatedName("AIEFUHUQ.V")
	public int[] field94;

	@ObfuscatedName("AIEFUHUQ.Z")
	public static int[] field98;

	@ObfuscatedName("AIEFUHUQ.X")
	public static AIEFUHUQ[] field96;

	@ObfuscatedName("AIEFUHUQ.H")
	public String[] field81;

	@ObfuscatedName("AIEFUHUQ.P")
	public String[] field88;

	@ObfuscatedName("AIEFUHUQ.a(I)LOIBEFFXI;")
	public final OIBEFFXI method6(int arg0) {
		if (field53 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field62[var3] && field62[var3] != 0) {
					var2 = field53[var3];
				}
			}

			if (var2 != -1) {
				return method13(var2).method6(1);
			}
		}

		OIBEFFXI var4 = (OIBEFFXI) field84.method227(field63);
		if (var4 != null) {
			return var4;
		}

		OIBEFFXI var5 = OIBEFFXI.method346(field89);
		if (var5 == null) {
			return null;
		}

		if (field76 != 128 || field79 != 128 || field59 != 128) {
			var5.method362(field79, field76, field59);
		}

		if (field71 != null) {
			for (int var6 = 0; var6 < field71.length; var6++) {
				var5.method360(field71[var6], field94[var6]);
			}
		}

		var5.method363(field70 + 64, field65 + 768, -50, -10, -50, true);
		var5.field986 = true;
		field84.method228(var5, field63);
		return var5;
	}

	@ObfuscatedName("AIEFUHUQ.a(Z)V")
	public static final void method7() {
		field84 = null;
		field87 = null;
		field98 = null;
		field96 = null;
		field83 = null;
	}

	@ObfuscatedName("AIEFUHUQ.a(BI)Z")
	public final boolean method8(int arg0) {
		int var2 = field67;
		int var3 = field60;
		if (arg0 == 1) {
			var2 = field78;
			var3 = field61;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!OIBEFFXI.method347(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !OIBEFFXI.method347(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("AIEFUHUQ.a(II)Z")
	public final boolean method9(int arg0) {
		int var2 = field91;
		int var3 = field56;
		int var4 = field80;
		if (arg0 == 1) {
			var2 = field51;
			var3 = field68;
			var4 = field95;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!OIBEFFXI.method347(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !OIBEFFXI.method347(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !OIBEFFXI.method347(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("AIEFUHUQ.a(BLYOXDZEVD;)V")
	public final void method10(YOXDZEVD arg0) {
		while (true) {
			int var2 = arg0.method549();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field89 = arg0.method551();
			} else if (var2 == 2) {
				field52 = arg0.method556();
			} else if (var2 == 3) {
				field85 = arg0.method557();
			} else if (var2 == 4) {
				field75 = arg0.method551();
			} else if (var2 == 5) {
				field73 = arg0.method551();
			} else if (var2 == 6) {
				field66 = arg0.method551();
			} else if (var2 == 7) {
				field77 = arg0.method551();
				if (field77 > 32767) {
					field77 -= 0x10000;
				}
			} else if (var2 == 8) {
				field58 = arg0.method551();
				if (field58 > 32767) {
					field58 -= 0x10000;
				}
			} else if (var2 == 10) {
				field69 = arg0.method551();
			} else if (var2 == 11) {
				field93 = true;
			} else if (var2 == 12) {
				field97 = arg0.method554();
			} else if (var2 == 16) {
				field86 = true;
			} else if (var2 == 23) {
				field91 = arg0.method551();
				field74 = arg0.method550();
			} else if (var2 == 24) {
				field56 = arg0.method551();
			} else if (var2 == 25) {
				field51 = arg0.method551();
				field92 = arg0.method550();
			} else if (var2 == 26) {
				field68 = arg0.method551();
			} else if (var2 >= 30 && var2 < 35) {
				if (field81 == null) {
					field81 = new String[5];
				}

				field81[var2 - 30] = arg0.method556();
				if (field81[var2 - 30].equalsIgnoreCase("hidden")) {
					field81[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field88 == null) {
					field88 = new String[5];
				}

				field88[var2 - 35] = arg0.method556();
			} else if (var2 == 40) {
				int var3 = arg0.method549();
				field71 = new int[var3];
				field94 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field71[var4] = arg0.method551();
					field94[var4] = arg0.method551();
				}
			} else if (var2 == 78) {
				field80 = arg0.method551();
			} else if (var2 == 79) {
				field95 = arg0.method551();
			} else if (var2 == 90) {
				field67 = arg0.method551();
			} else if (var2 == 91) {
				field78 = arg0.method551();
			} else if (var2 == 92) {
				field60 = arg0.method551();
			} else if (var2 == 93) {
				field61 = arg0.method551();
			} else if (var2 == 95) {
				field82 = arg0.method551();
			} else if (var2 == 97) {
				field64 = arg0.method551();
			} else if (var2 == 98) {
				field72 = arg0.method551();
			} else if (var2 >= 100 && var2 < 110) {
				if (field53 == null) {
					field53 = new int[10];
					field62 = new int[10];
				}

				field53[var2 - 100] = arg0.method551();
				field62[var2 - 100] = arg0.method551();
			} else if (var2 == 110) {
				field76 = arg0.method551();
			} else if (var2 == 111) {
				field79 = arg0.method551();
			} else if (var2 == 112) {
				field59 = arg0.method551();
			} else if (var2 == 113) {
				field70 = arg0.method550();
			} else if (var2 == 114) {
				field65 = arg0.method550() * 5;
			} else if (var2 == 115) {
				field90 = arg0.method549();
			}
		}
	}

	@ObfuscatedName("AIEFUHUQ.b(II)LOIBEFFXI;")
	public final OIBEFFXI method11(int arg0) {
		int var2 = field91;
		int var3 = field56;
		int var4 = field80;
		if (arg0 == 1) {
			var2 = field51;
			var3 = field68;
			var4 = field95;
		}

		if (var2 == -1) {
			return null;
		}

		OIBEFFXI var5 = OIBEFFXI.method346(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				OIBEFFXI var9 = OIBEFFXI.method346(var3);
				OIBEFFXI[] var10 = new OIBEFFXI[] { var5, var9 };
				var5 = new OIBEFFXI(var10, 2);
			} else {
				OIBEFFXI var6 = OIBEFFXI.method346(var3);
				OIBEFFXI var7 = OIBEFFXI.method346(var4);
				OIBEFFXI[] var8 = new OIBEFFXI[] { var5, var6, var7 };
				var5 = new OIBEFFXI(var8, 3);
			}
		}

		if (arg0 == 0 && field74 != 0) {
			var5.method359(0, 0, field74);
		}

		if (arg0 == 1 && field92 != 0) {
			var5.method359(0, 0, field92);
		}

		if (field71 != null) {
			for (int var11 = 0; var11 < field71.length; var11++) {
				var5.method360(field71[var11], field94[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("AIEFUHUQ.a()V")
	public final void method12() {
		field89 = 0;
		field52 = null;
		field85 = null;
		field71 = null;
		field94 = null;
		field75 = 2000;
		field73 = 0;
		field66 = 0;
		field82 = 0;
		field77 = 0;
		field58 = 0;
		field69 = -1;
		field93 = false;
		field97 = 1;
		field86 = false;
		field81 = null;
		field88 = null;
		field91 = -1;
		field56 = -1;
		field74 = 0;
		field51 = -1;
		field68 = -1;
		field92 = 0;
		field80 = -1;
		field95 = -1;
		field67 = -1;
		field60 = -1;
		field78 = -1;
		field61 = -1;
		field53 = null;
		field62 = null;
		field64 = -1;
		field72 = -1;
		field76 = 128;
		field79 = 128;
		field59 = 128;
		field70 = 0;
		field65 = 0;
		field90 = 0;
	}

	@ObfuscatedName("AIEFUHUQ.b(I)LAIEFUHUQ;")
	public static final AIEFUHUQ method13(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field96[var1].field63 == arg0) {
				return field96[var1];
			}
		}

		field54 = (field54 + 1) % 10;
		AIEFUHUQ var2 = field96[field54];
		field83.field1393 = field98[arg0];
		var2.field63 = arg0;
		var2.method12();
		var2.method10(field83);

		if (var2.field72 != -1) {
			var2.method16();
		}

		if (!field55 && var2.field86) {
			var2.field52 = "Members Object";
			var2.field85 = "Login to a members' server to use this object.".getBytes();
			var2.field81 = null;
			var2.field88 = null;
			var2.field90 = 0;
		}

		return var2;
	}

	@ObfuscatedName("AIEFUHUQ.a(IIII)LDYPVESKW;")
	public static final DYPVESKW method14(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			DYPVESKW var3 = (DYPVESKW) field87.method227(arg0);
			if (var3 != null && var3.field623 != arg1 && var3.field623 != -1) {
				var3.method589();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		AIEFUHUQ var4 = method13(arg0);
		if (var4.field53 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field62[var6] && var4.field62[var6] != 0) {
					var5 = var4.field53[var6];
				}
			}

			if (var5 != -1) {
				var4 = method13(var5);
			}
		}

		OIBEFFXI var7 = var4.method6(1);
		if (var7 == null) {
			return null;
		}

		DYPVESKW var8 = null;
		if (var4.field72 != -1) {
			var8 = method14(var4.field64, 10, -1);
			if (var8 == null) {
				return null;
			}
		}

		DYPVESKW var9 = new DYPVESKW(32, 32);
		int var10 = LLQSXMOX.field844;
		int var11 = LLQSXMOX.field845;
		int[] var12 = LLQSXMOX.field850;
		int[] var13 = KNERFXXY.field824;
		int var14 = KNERFXXY.field825;
		int var15 = KNERFXXY.field826;
		int var16 = KNERFXXY.field829;
		int var17 = KNERFXXY.field830;
		int var18 = KNERFXXY.field827;
		int var19 = KNERFXXY.field828;
		LLQSXMOX.field842 = false;
		KNERFXXY.method279(32, 32, var9.field617);
		KNERFXXY.method284(0, 0, 0, 32, 32);
		LLQSXMOX.method296();
		int var20 = var4.field75;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = LLQSXMOX.field848[var4.field73] * var20 >> 16;
		int var22 = LLQSXMOX.field849[var4.field73] * var20 >> 16;
		var7.method366(0, var4.field66, var4.field82, var4.field73, var4.field77, var7.field1333 / 2 + var21 + var4.field58, var4.field58 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field617[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field617[var24 * 32 + var23 - 1] > 1) {
						var9.field617[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field617[(var24 - 1) * 32 + var23] > 1) {
						var9.field617[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field617[var24 * 32 + var23 + 1] > 1) {
						var9.field617[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field617[(var24 + 1) * 32 + var23] > 1) {
						var9.field617[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field617[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field617[var26 * 32 + var25 - 1] == 1) {
							var9.field617[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field617[(var26 - 1) * 32 + var25] == 1) {
							var9.field617[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field617[var26 * 32 + var25 + 1] == 1) {
							var9.field617[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field617[(var26 + 1) * 32 + var25] == 1) {
							var9.field617[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field617[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field617[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field617[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field72 != -1) {
			int var29 = var8.field622;
			int var30 = var8.field623;
			var8.field622 = 32;
			var8.field623 = 32;
			var8.method179(0, 0);
			var8.field622 = var29;
			var8.field623 = var30;
		}

		if (arg2 == 0) {
			field87.method228(var9, arg0);
		}

		KNERFXXY.method279(var15, var14, var13);
		KNERFXXY.method281(var18, var19, var17, var16);
		LLQSXMOX.field844 = var10;
		LLQSXMOX.field845 = var11;
		LLQSXMOX.field850 = var12;
		LLQSXMOX.field842 = true;

		if (var4.field93) {
			var9.field622 = 33;
		} else {
			var9.field622 = 32;
		}

		var9.field623 = arg1;
		return var9;
	}

	@ObfuscatedName("AIEFUHUQ.a(LOTSGNSQM;)V")
	public static final void method15(OTSGNSQM arg0) {
		field83 = new YOXDZEVD(arg0.method376("obj.dat", null));
		YOXDZEVD var1 = new YOXDZEVD(arg0.method376("obj.idx", null));
		field57 = var1.method551();
		field98 = new int[field57];
		int var2 = 2;
		for (int var3 = 0; var3 < field57; var3++) {
			field98[var3] = var2;
			var2 += var1.method551();
		}

		field96 = new AIEFUHUQ[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field96[var4] = new AIEFUHUQ();
		}
	}

	@ObfuscatedName("AIEFUHUQ.b(Z)V")
	public void method16() {
		AIEFUHUQ var1 = method13(field72);
		field89 = var1.field89;
		field75 = var1.field75;
		field73 = var1.field73;
		field66 = var1.field66;
		field82 = var1.field82;
		field77 = var1.field77;
		field58 = var1.field58;
		field71 = var1.field71;
		field94 = var1.field94;
		AIEFUHUQ var2 = method13(field64);
		field52 = var2.field52;
		field86 = var2.field86;
		field97 = var2.field97;
		String var3 = "a";
		char var4 = var2.field52.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field85 = ("Swap this note at any bank for " + var3 + " " + var2.field52 + ".").getBytes();
		field93 = true;
	}

	@ObfuscatedName("AIEFUHUQ.c(II)LOIBEFFXI;")
	public final OIBEFFXI method17(int arg0) {
		if (field53 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field62[var3] && field62[var3] != 0) {
					var2 = field53[var3];
				}
			}

			if (var2 != -1) {
				return method13(var2).method17(1);
			}
		}

		OIBEFFXI var4 = OIBEFFXI.method346(field89);
		if (var4 == null) {
			return null;
		}

		if (field71 != null) {
			for (int var5 = 0; var5 < field71.length; var5++) {
				var4.method360(field71[var5], field94[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("AIEFUHUQ.a(ZI)LOIBEFFXI;")
	public final OIBEFFXI method18(int arg0) {
		int var2 = field67;
		int var3 = field60;
		if (arg0 == 1) {
			var2 = field78;
			var3 = field61;
		}

		if (var2 == -1) {
			return null;
		}

		OIBEFFXI var4 = OIBEFFXI.method346(var2);
		if (var3 != -1) {
			OIBEFFXI var5 = OIBEFFXI.method346(var3);
			OIBEFFXI[] var6 = new OIBEFFXI[] { var4, var5 };
			var4 = new OIBEFFXI(var6, 2);
		}

		if (field71 != null) {
			for (int var7 = 0; var7 < field71.length; var7++) {
				var4.method360(field71[var7], field94[var7]);
			}
		}

		return var4;
	}
}
