package deob;

@ObfuscatedName("NCBEIRPV")
public final class NCBEIRPV {

	@ObfuscatedName("NCBEIRPV.A")
	public int field841 = -1;

	@ObfuscatedName("NCBEIRPV.c")
	public static boolean field821 = true;

	@ObfuscatedName("NCBEIRPV.P")
	public static FFRFJBIR field856 = new FFRFJBIR(50);

	@ObfuscatedName("NCBEIRPV.ab")
	public static FFRFJBIR field866 = new FFRFJBIR(100);

	@ObfuscatedName("NCBEIRPV.j")
	public byte field826;

	@ObfuscatedName("NCBEIRPV.n")
	public byte field830;

	@ObfuscatedName("NCBEIRPV.a")
	public int field819;

	@ObfuscatedName("NCBEIRPV.b")
	public int field820;

	@ObfuscatedName("NCBEIRPV.e")
	public int field822;

	@ObfuscatedName("NCBEIRPV.g")
	public int field823;

	@ObfuscatedName("NCBEIRPV.h")
	public int field824;

	@ObfuscatedName("NCBEIRPV.i")
	public int field825;

	@ObfuscatedName("NCBEIRPV.k")
	public int field827;

	@ObfuscatedName("NCBEIRPV.l")
	public int field828;

	@ObfuscatedName("NCBEIRPV.o")
	public static int field831;

	@ObfuscatedName("NCBEIRPV.t")
	public int field835;

	@ObfuscatedName("NCBEIRPV.u")
	public int field836;

	@ObfuscatedName("NCBEIRPV.w")
	public int field837;

	@ObfuscatedName("NCBEIRPV.x")
	public static int field838;

	@ObfuscatedName("NCBEIRPV.y")
	public int field839;

	@ObfuscatedName("NCBEIRPV.z")
	public int field840;

	@ObfuscatedName("NCBEIRPV.B")
	public int field842;

	@ObfuscatedName("NCBEIRPV.C")
	public int field843;

	@ObfuscatedName("NCBEIRPV.D")
	public int field844;

	@ObfuscatedName("NCBEIRPV.F")
	public int field846;

	@ObfuscatedName("NCBEIRPV.H")
	public int field848;

	@ObfuscatedName("NCBEIRPV.K")
	public int field851;

	@ObfuscatedName("NCBEIRPV.L")
	public int field852;

	@ObfuscatedName("NCBEIRPV.Q")
	public int field857;

	@ObfuscatedName("NCBEIRPV.S")
	public int field859;

	@ObfuscatedName("NCBEIRPV.U")
	public int field860;

	@ObfuscatedName("NCBEIRPV.V")
	public int field861;

	@ObfuscatedName("NCBEIRPV.W")
	public int field862;

	@ObfuscatedName("NCBEIRPV.Y")
	public int field864;

	@ObfuscatedName("NCBEIRPV.Z")
	public int field865;

	@ObfuscatedName("NCBEIRPV.N")
	public static FTMSICIZ field854;

	@ObfuscatedName("NCBEIRPV.q")
	public String field833;

	@ObfuscatedName("NCBEIRPV.G")
	public boolean field847;

	@ObfuscatedName("NCBEIRPV.R")
	public boolean field858;

	@ObfuscatedName("NCBEIRPV.J")
	public byte[] field850;

	@ObfuscatedName("NCBEIRPV.m")
	public int[] field829;

	@ObfuscatedName("NCBEIRPV.p")
	public int[] field832;

	@ObfuscatedName("NCBEIRPV.I")
	public static int[] field849;

	@ObfuscatedName("NCBEIRPV.M")
	public int[] field853;

	@ObfuscatedName("NCBEIRPV.O")
	public int[] field855;

	@ObfuscatedName("NCBEIRPV.X")
	public static NCBEIRPV[] field863;

	@ObfuscatedName("NCBEIRPV.s")
	public String[] field834;

	@ObfuscatedName("NCBEIRPV.E")
	public String[] field845;

	@ObfuscatedName("NCBEIRPV.a(ZI)LKUGNQTGL;")
	public final KUGNQTGL method379(int arg0) {
		int var2 = field859;
		int var3 = field862;
		int var4 = field820;
		if (arg0 == 1) {
			var2 = field861;
			var3 = field864;
			var4 = field827;
		}

		if (var2 == -1) {
			return null;
		}

		KUGNQTGL var5 = KUGNQTGL.method330(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				KUGNQTGL var9 = KUGNQTGL.method330(var3);
				KUGNQTGL[] var10 = new KUGNQTGL[] { var5, var9 };
				var5 = new KUGNQTGL(2, var10);
			} else {
				KUGNQTGL var6 = KUGNQTGL.method330(var3);
				KUGNQTGL var7 = KUGNQTGL.method330(var4);
				KUGNQTGL[] var8 = new KUGNQTGL[] { var5, var6, var7 };
				var5 = new KUGNQTGL(3, var8);
			}
		}

		if (arg0 == 0 && field826 != 0) {
			var5.method343(0, 0, field826);
		}

		if (arg0 == 1 && field830 != 0) {
			var5.method343(0, 0, field830);
		}

		if (field853 != null) {
			for (int var11 = 0; var11 < field853.length; var11++) {
				var5.method344(field853[var11], field829[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("NCBEIRPV.a(LFTMSICIZ;I)V")
	public final void method380(FTMSICIZ arg0) {
		while (true) {
			int var2 = arg0.method213();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field823 = arg0.method215();
			} else if (var2 == 2) {
				field833 = arg0.method220();
			} else if (var2 == 3) {
				field850 = arg0.method221();
			} else if (var2 == 4) {
				field851 = arg0.method215();
			} else if (var2 == 5) {
				field852 = arg0.method215();
			} else if (var2 == 6) {
				field842 = arg0.method215();
			} else if (var2 == 7) {
				field824 = arg0.method215();
				if (field824 > 32767) {
					field824 -= 0x10000;
				}
			} else if (var2 == 8) {
				field825 = arg0.method215();
				if (field825 > 32767) {
					field825 -= 0x10000;
				}
			} else if (var2 == 10) {
				field846 = arg0.method215();
			} else if (var2 == 11) {
				field858 = true;
			} else if (var2 == 12) {
				field843 = arg0.method218();
			} else if (var2 == 16) {
				field847 = true;
			} else if (var2 == 23) {
				field859 = arg0.method215();
				field826 = arg0.method214();
			} else if (var2 == 24) {
				field862 = arg0.method215();
			} else if (var2 == 25) {
				field861 = arg0.method215();
				field830 = arg0.method214();
			} else if (var2 == 26) {
				field864 = arg0.method215();
			} else if (var2 >= 30 && var2 < 35) {
				if (field845 == null) {
					field845 = new String[5];
				}

				field845[var2 - 30] = arg0.method220();
				if (field845[var2 - 30].equalsIgnoreCase("hidden")) {
					field845[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field834 == null) {
					field834 = new String[5];
				}

				field834[var2 - 35] = arg0.method220();
			} else if (var2 == 40) {
				int var3 = arg0.method213();
				field853 = new int[var3];
				field829 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field853[var4] = arg0.method215();
					field829[var4] = arg0.method215();
				}
			} else if (var2 == 78) {
				field820 = arg0.method215();
			} else if (var2 == 79) {
				field827 = arg0.method215();
			} else if (var2 == 90) {
				field839 = arg0.method215();
			} else if (var2 == 91) {
				field848 = arg0.method215();
			} else if (var2 == 92) {
				field860 = arg0.method215();
			} else if (var2 == 93) {
				field835 = arg0.method215();
			} else if (var2 == 95) {
				field840 = arg0.method215();
			} else if (var2 == 97) {
				field837 = arg0.method215();
			} else if (var2 == 98) {
				field844 = arg0.method215();
			} else if (var2 >= 100 && var2 < 110) {
				if (field832 == null) {
					field832 = new int[10];
					field855 = new int[10];
				}

				field832[var2 - 100] = arg0.method215();
				field855[var2 - 100] = arg0.method215();
			} else if (var2 == 110) {
				field822 = arg0.method215();
			} else if (var2 == 111) {
				field836 = arg0.method215();
			} else if (var2 == 112) {
				field857 = arg0.method215();
			} else if (var2 == 113) {
				field828 = arg0.method214();
			} else if (var2 == 114) {
				field819 = arg0.method214() * 5;
			} else if (var2 == 115) {
				field865 = arg0.method213();
			}
		}
	}

	@ObfuscatedName("NCBEIRPV.a(I)LKUGNQTGL;")
	public final KUGNQTGL method381(int arg0) {
		if (field832 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field855[var3] && field855[var3] != 0) {
					var2 = field832[var3];
				}
			}

			if (var2 != -1) {
				return method390(var2).method381(1);
			}
		}

		KUGNQTGL var4 = (KUGNQTGL) field856.method198(field841);
		if (var4 != null) {
			return var4;
		}

		KUGNQTGL var5 = KUGNQTGL.method330(field823);
		if (var5 == null) {
			return null;
		}

		if (field822 != 128 || field836 != 128 || field857 != 128) {
			var5.method346(field857, field822, field836);
		}

		if (field853 != null) {
			for (int var6 = 0; var6 < field853.length; var6++) {
				var5.method344(field853[var6], field829[var6]);
			}
		}

		var5.method347(field828 + 64, field819 + 768, -50, -10, -50, true);
		var5.field703 = true;
		field856.method199(field841, var5);
		return var5;
	}

	@ObfuscatedName("NCBEIRPV.b(I)V")
	public static final void method382() {
		field856 = null;
		field866 = null;
		field849 = null;
		field863 = null;
		field854 = null;
	}

	@ObfuscatedName("NCBEIRPV.a(II)Z")
	public final boolean method383(int arg0) {
		int var2 = field839;
		int var3 = field860;
		if (arg0 == 1) {
			var2 = field848;
			var3 = field835;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!KUGNQTGL.method331(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !KUGNQTGL.method331(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("NCBEIRPV.a(IZ)LKUGNQTGL;")
	public final KUGNQTGL method384(int arg0) {
		int var2 = field839;
		int var3 = field860;
		if (arg0 == 1) {
			var2 = field848;
			var3 = field835;
		}

		if (var2 == -1) {
			return null;
		}

		KUGNQTGL var4 = KUGNQTGL.method330(var2);
		if (var3 != -1) {
			KUGNQTGL var5 = KUGNQTGL.method330(var3);
			KUGNQTGL[] var6 = new KUGNQTGL[] { var4, var5 };
			var4 = new KUGNQTGL(2, var6);
		}

		if (field853 != null) {
			for (int var7 = 0; var7 < field853.length; var7++) {
				var4.method344(field853[var7], field829[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("NCBEIRPV.a()V")
	public final void method385() {
		field823 = 0;
		field833 = null;
		field850 = null;
		field853 = null;
		field829 = null;
		field851 = 2000;
		field852 = 0;
		field842 = 0;
		field840 = 0;
		field824 = 0;
		field825 = 0;
		field846 = -1;
		field858 = false;
		field843 = 1;
		field847 = false;
		field845 = null;
		field834 = null;
		field859 = -1;
		field862 = -1;
		field826 = 0;
		field861 = -1;
		field864 = -1;
		field830 = 0;
		field820 = -1;
		field827 = -1;
		field839 = -1;
		field860 = -1;
		field848 = -1;
		field835 = -1;
		field832 = null;
		field855 = null;
		field837 = -1;
		field844 = -1;
		field822 = 128;
		field836 = 128;
		field857 = 128;
		field828 = 0;
		field819 = 0;
		field865 = 0;
	}

	@ObfuscatedName("NCBEIRPV.a(IIII)LKUDWIDHU;")
	public static final KUDWIDHU method386(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			KUDWIDHU var3 = (KUDWIDHU) field866.method198(arg0);
			if (var3 != null && var3.field664 != arg1 && var3.field664 != -1) {
				var3.method418();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		NCBEIRPV var4 = method390(arg0);
		if (var4.field832 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field855[var6] && var4.field855[var6] != 0) {
					var5 = var4.field832[var6];
				}
			}

			if (var5 != -1) {
				var4 = method390(var5);
			}
		}

		KUGNQTGL var7 = var4.method381(1);
		if (var7 == null) {
			return null;
		}

		KUDWIDHU var8 = null;
		if (var4.field844 != -1) {
			var8 = method386(var4.field837, 10, -1);
			if (var8 == null) {
				return null;
			}
		}

		KUDWIDHU var9 = new KUDWIDHU(32, 32);
		int var10 = ZUDKHAVN.field1486;
		int var11 = ZUDKHAVN.field1487;
		int[] var12 = ZUDKHAVN.field1492;
		int[] var13 = CBERHIHM.field24;
		int var14 = CBERHIHM.field25;
		int var15 = CBERHIHM.field26;
		int var16 = CBERHIHM.field29;
		int var17 = CBERHIHM.field30;
		int var18 = CBERHIHM.field27;
		int var19 = CBERHIHM.field28;
		ZUDKHAVN.field1484 = false;
		CBERHIHM.method28(var9.field658, 32, 32);
		CBERHIHM.method33(0, 0, 0, 32, 32);
		ZUDKHAVN.method589();
		int var20 = var4.field851;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = ZUDKHAVN.field1490[var4.field852] * var20 >> 16;
		int var22 = ZUDKHAVN.field1491[var4.field852] * var20 >> 16;
		var7.method351(0, var4.field842, var4.field840, var4.field852, var4.field824, var7.field1450 / 2 + var21 + var4.field825, var4.field825 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field658[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field658[var24 * 32 + var23 - 1] > 1) {
						var9.field658[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field658[(var24 - 1) * 32 + var23] > 1) {
						var9.field658[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field658[var24 * 32 + var23 + 1] > 1) {
						var9.field658[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field658[(var24 + 1) * 32 + var23] > 1) {
						var9.field658[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field658[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field658[var26 * 32 + var25 - 1] == 1) {
							var9.field658[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field658[(var26 - 1) * 32 + var25] == 1) {
							var9.field658[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field658[var26 * 32 + var25 + 1] == 1) {
							var9.field658[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field658[(var26 + 1) * 32 + var25] == 1) {
							var9.field658[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field658[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field658[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field658[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field844 != -1) {
			int var29 = var8.field663;
			int var30 = var8.field664;
			var8.field663 = 32;
			var8.field664 = 32;
			var8.method318(0, 0);
			var8.field663 = var29;
			var8.field664 = var30;
		}

		if (arg2 == 0) {
			field866.method199(arg0, var9);
		}

		CBERHIHM.method28(var13, var15, var14);
		CBERHIHM.method30(var19, var18, var16, var17);
		ZUDKHAVN.field1486 = var10;
		ZUDKHAVN.field1487 = var11;
		ZUDKHAVN.field1492 = var12;
		ZUDKHAVN.field1484 = true;

		if (var4.field858) {
			var9.field663 = 33;
		} else {
			var9.field663 = 32;
		}

		var9.field664 = arg1;
		return var9;
	}

	@ObfuscatedName("NCBEIRPV.a(IB)Z")
	public final boolean method387(int arg0) {
		int var2 = field859;
		int var3 = field862;
		int var4 = field820;
		if (arg0 == 1) {
			var2 = field861;
			var3 = field864;
			var4 = field827;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!KUGNQTGL.method331(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !KUGNQTGL.method331(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !KUGNQTGL.method331(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("NCBEIRPV.b(IB)LKUGNQTGL;")
	public final KUGNQTGL method388(int arg0) {
		if (field832 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field855[var3] && field855[var3] != 0) {
					var2 = field832[var3];
				}
			}

			if (var2 != -1) {
				return method390(var2).method388(1);
			}
		}

		KUGNQTGL var4 = KUGNQTGL.method330(field823);
		if (var4 == null) {
			return null;
		}

		if (field853 != null) {
			for (int var5 = 0; var5 < field853.length; var5++) {
				var4.method344(field853[var5], field829[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("NCBEIRPV.a(LAKPFVPPG;)V")
	public static final void method389(AKPFVPPG arg0) {
		field854 = new FTMSICIZ(arg0.method7("obj.dat", null));
		FTMSICIZ var1 = new FTMSICIZ(arg0.method7("obj.idx", null));
		field838 = var1.method215();
		field849 = new int[field838];
		int var2 = 2;
		for (int var3 = 0; var3 < field838; var3++) {
			field849[var3] = var2;
			var2 += var1.method215();
		}

		field863 = new NCBEIRPV[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field863[var4] = new NCBEIRPV();
		}
	}

	@ObfuscatedName("NCBEIRPV.c(I)LNCBEIRPV;")
	public static final NCBEIRPV method390(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field863[var1].field841 == arg0) {
				return field863[var1];
			}
		}

		field831 = (field831 + 1) % 10;
		NCBEIRPV var2 = field863[field831];
		field854.field535 = field849[arg0];
		var2.field841 = arg0;
		var2.method385();
		var2.method380(field854);

		if (var2.field844 != -1) {
			var2.method391();
		}

		if (!field821 && var2.field847) {
			var2.field833 = "Members Object";
			var2.field850 = "Login to a members' server to use this object.".getBytes();
			var2.field845 = null;
			var2.field834 = null;
			var2.field865 = 0;
		}

		return var2;
	}

	@ObfuscatedName("NCBEIRPV.a(B)V")
	public void method391() {
		NCBEIRPV var1 = method390(field844);
		field823 = var1.field823;
		field851 = var1.field851;
		field852 = var1.field852;
		field842 = var1.field842;
		field840 = var1.field840;
		field824 = var1.field824;
		field825 = var1.field825;
		field853 = var1.field853;
		field829 = var1.field829;
		NCBEIRPV var2 = method390(field837);
		field833 = var2.field833;
		field847 = var2.field847;
		field843 = var2.field843;
		String var3 = "a";
		char var4 = var2.field833.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field850 = ("Swap this note at any bank for " + var3 + " " + var2.field833 + ".").getBytes();
		field858 = true;
	}
}
