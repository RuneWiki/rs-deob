package deob;

@ObfuscatedName("LAMDVZMU")
public final class LAMDVZMU {

	@ObfuscatedName("LAMDVZMU.J")
	public int field888 = -1;

	@ObfuscatedName("LAMDVZMU.c")
	public static boolean field857 = true;

	@ObfuscatedName("LAMDVZMU.e")
	public static UNPPHFRC field859 = new UNPPHFRC(100);

	@ObfuscatedName("LAMDVZMU.z")
	public static UNPPHFRC field878 = new UNPPHFRC(50);

	@ObfuscatedName("LAMDVZMU.f")
	public byte field860;

	@ObfuscatedName("LAMDVZMU.C")
	public byte field881;

	@ObfuscatedName("LAMDVZMU.a")
	public int field855;

	@ObfuscatedName("LAMDVZMU.b")
	public int field856;

	@ObfuscatedName("LAMDVZMU.d")
	public int field858;

	@ObfuscatedName("LAMDVZMU.g")
	public int field861;

	@ObfuscatedName("LAMDVZMU.k")
	public int field864;

	@ObfuscatedName("LAMDVZMU.m")
	public int field866;

	@ObfuscatedName("LAMDVZMU.q")
	public int field869;

	@ObfuscatedName("LAMDVZMU.s")
	public int field871;

	@ObfuscatedName("LAMDVZMU.v")
	public int field874;

	@ObfuscatedName("LAMDVZMU.w")
	public int field875;

	@ObfuscatedName("LAMDVZMU.y")
	public int field877;

	@ObfuscatedName("LAMDVZMU.A")
	public int field879;

	@ObfuscatedName("LAMDVZMU.B")
	public int field880;

	@ObfuscatedName("LAMDVZMU.E")
	public int field883;

	@ObfuscatedName("LAMDVZMU.F")
	public int field884;

	@ObfuscatedName("LAMDVZMU.G")
	public static int field885;

	@ObfuscatedName("LAMDVZMU.H")
	public int field886;

	@ObfuscatedName("LAMDVZMU.L")
	public int field890;

	@ObfuscatedName("LAMDVZMU.M")
	public int field891;

	@ObfuscatedName("LAMDVZMU.N")
	public int field892;

	@ObfuscatedName("LAMDVZMU.O")
	public int field893;

	@ObfuscatedName("LAMDVZMU.P")
	public static int field894;

	@ObfuscatedName("LAMDVZMU.Q")
	public int field895;

	@ObfuscatedName("LAMDVZMU.T")
	public int field897;

	@ObfuscatedName("LAMDVZMU.U")
	public int field898;

	@ObfuscatedName("LAMDVZMU.V")
	public int field899;

	@ObfuscatedName("LAMDVZMU.W")
	public int field900;

	@ObfuscatedName("LAMDVZMU.Y")
	public int field901;

	@ObfuscatedName("LAMDVZMU.Z")
	public int field902;

	@ObfuscatedName("LAMDVZMU.l")
	public static EYMNCFMK field865;

	@ObfuscatedName("LAMDVZMU.j")
	public String field863;

	@ObfuscatedName("LAMDVZMU.x")
	public boolean field876;

	@ObfuscatedName("LAMDVZMU.R")
	public boolean field896;

	@ObfuscatedName("LAMDVZMU.u")
	public byte[] field873;

	@ObfuscatedName("LAMDVZMU.i")
	public static int[] field862;

	@ObfuscatedName("LAMDVZMU.p")
	public int[] field868;

	@ObfuscatedName("LAMDVZMU.t")
	public int[] field872;

	@ObfuscatedName("LAMDVZMU.D")
	public int[] field882;

	@ObfuscatedName("LAMDVZMU.K")
	public int[] field889;

	@ObfuscatedName("LAMDVZMU.n")
	public static LAMDVZMU[] field867;

	@ObfuscatedName("LAMDVZMU.r")
	public String[] field870;

	@ObfuscatedName("LAMDVZMU.I")
	public String[] field887;

	@ObfuscatedName("LAMDVZMU.a(II)LOJGAHFXC;")
	public final OJGAHFXC method367(int arg0) {
		if (field889 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field882[var3] && field882[var3] != 0) {
					var2 = field889[var3];
				}
			}

			if (var2 != -1) {
				return method376(var2).method367(1);
			}
		}

		OJGAHFXC var4 = OJGAHFXC.method413(field901);
		if (var4 == null) {
			return null;
		}

		if (field872 != null) {
			for (int var5 = 0; var5 < field872.length; var5++) {
				var4.method427(field872[var5], field868[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("LAMDVZMU.a()V")
	public final void method368() {
		field901 = 0;
		field863 = null;
		field873 = null;
		field872 = null;
		field868 = null;
		field864 = 2000;
		field897 = 0;
		field880 = 0;
		field866 = 0;
		field877 = 0;
		field879 = 0;
		field892 = -1;
		field876 = false;
		field871 = 1;
		field896 = false;
		field870 = null;
		field887 = null;
		field899 = -1;
		field900 = -1;
		field860 = 0;
		field890 = -1;
		field874 = -1;
		field881 = 0;
		field861 = -1;
		field898 = -1;
		field886 = -1;
		field855 = -1;
		field869 = -1;
		field883 = -1;
		field889 = null;
		field882 = null;
		field902 = -1;
		field875 = -1;
		field856 = 128;
		field858 = 128;
		field893 = 128;
		field895 = 0;
		field891 = 0;
		field884 = 0;
	}

	@ObfuscatedName("LAMDVZMU.a(I)V")
	public void method369() {
		LAMDVZMU var1 = method376(field875);
		field901 = var1.field901;
		field864 = var1.field864;
		field897 = var1.field897;
		field880 = var1.field880;
		field866 = var1.field866;
		field877 = var1.field877;
		field879 = var1.field879;
		field872 = var1.field872;
		field868 = var1.field868;
		LAMDVZMU var2 = method376(field902);
		field863 = var2.field863;
		field896 = var2.field896;
		field871 = var2.field871;
		String var3 = "a";
		char var4 = var2.field863.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field873 = ("Swap this note at any bank for " + var3 + " " + var2.field863 + ".").getBytes();
		field876 = true;
	}

	@ObfuscatedName("LAMDVZMU.b(I)LOJGAHFXC;")
	public final OJGAHFXC method370(int arg0) {
		if (field889 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field882[var3] && field882[var3] != 0) {
					var2 = field889[var3];
				}
			}

			if (var2 != -1) {
				return method376(var2).method370(1);
			}
		}

		OJGAHFXC var4 = (OJGAHFXC) field878.method531(field888);
		if (var4 != null) {
			return var4;
		}

		OJGAHFXC var5 = OJGAHFXC.method413(field901);
		if (var5 == null) {
			return null;
		}

		if (field856 != 128 || field858 != 128 || field893 != 128) {
			var5.method429(field893, field858, field856);
		}

		if (field872 != null) {
			for (int var6 = 0; var6 < field872.length; var6++) {
				var5.method427(field872[var6], field868[var6]);
			}
		}

		var5.method430(field895 + 64, field891 + 768, -50, -10, -50, true);
		var5.field1050 = true;
		field878.method532(field888, var5);
		return var5;
	}

	@ObfuscatedName("LAMDVZMU.b(II)LOJGAHFXC;")
	public final OJGAHFXC method371(int arg0) {
		int var2 = field886;
		int var3 = field855;
		if (arg0 == 1) {
			var2 = field869;
			var3 = field883;
		}

		if (var2 == -1) {
			return null;
		}

		OJGAHFXC var4 = OJGAHFXC.method413(var2);
		if (var3 != -1) {
			OJGAHFXC var5 = OJGAHFXC.method413(var3);
			OJGAHFXC[] var6 = new OJGAHFXC[] { var4, var5 };
			var4 = new OJGAHFXC(2, var6);
		}

		if (field872 != null) {
			for (int var7 = 0; var7 < field872.length; var7++) {
				var4.method427(field872[var7], field868[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("LAMDVZMU.a(BLEYMNCFMK;)V")
	public final void method372(EYMNCFMK arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field901 = arg0.method241();
			} else if (var2 == 2) {
				field863 = arg0.method246();
			} else if (var2 == 3) {
				field873 = arg0.method247();
			} else if (var2 == 4) {
				field864 = arg0.method241();
			} else if (var2 == 5) {
				field897 = arg0.method241();
			} else if (var2 == 6) {
				field880 = arg0.method241();
			} else if (var2 == 7) {
				field877 = arg0.method241();
				if (field877 > 32767) {
					field877 -= 0x10000;
				}
			} else if (var2 == 8) {
				field879 = arg0.method241();
				if (field879 > 32767) {
					field879 -= 0x10000;
				}
			} else if (var2 == 10) {
				field892 = arg0.method241();
			} else if (var2 == 11) {
				field876 = true;
			} else if (var2 == 12) {
				field871 = arg0.method244();
			} else if (var2 == 16) {
				field896 = true;
			} else if (var2 == 23) {
				field899 = arg0.method241();
				field860 = arg0.method240();
			} else if (var2 == 24) {
				field900 = arg0.method241();
			} else if (var2 == 25) {
				field890 = arg0.method241();
				field881 = arg0.method240();
			} else if (var2 == 26) {
				field874 = arg0.method241();
			} else if (var2 >= 30 && var2 < 35) {
				if (field870 == null) {
					field870 = new String[5];
				}

				field870[var2 - 30] = arg0.method246();
				if (field870[var2 - 30].equalsIgnoreCase("hidden")) {
					field870[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field887 == null) {
					field887 = new String[5];
				}

				field887[var2 - 35] = arg0.method246();
			} else if (var2 == 40) {
				int var3 = arg0.method239();
				field872 = new int[var3];
				field868 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field872[var4] = arg0.method241();
					field868[var4] = arg0.method241();
				}
			} else if (var2 == 78) {
				field861 = arg0.method241();
			} else if (var2 == 79) {
				field898 = arg0.method241();
			} else if (var2 == 90) {
				field886 = arg0.method241();
			} else if (var2 == 91) {
				field869 = arg0.method241();
			} else if (var2 == 92) {
				field855 = arg0.method241();
			} else if (var2 == 93) {
				field883 = arg0.method241();
			} else if (var2 == 95) {
				field866 = arg0.method241();
			} else if (var2 == 97) {
				field902 = arg0.method241();
			} else if (var2 == 98) {
				field875 = arg0.method241();
			} else if (var2 >= 100 && var2 < 110) {
				if (field889 == null) {
					field889 = new int[10];
					field882 = new int[10];
				}

				field889[var2 - 100] = arg0.method241();
				field882[var2 - 100] = arg0.method241();
			} else if (var2 == 110) {
				field856 = arg0.method241();
			} else if (var2 == 111) {
				field858 = arg0.method241();
			} else if (var2 == 112) {
				field893 = arg0.method241();
			} else if (var2 == 113) {
				field895 = arg0.method240();
			} else if (var2 == 114) {
				field891 = arg0.method240() * 5;
			} else if (var2 == 115) {
				field884 = arg0.method239();
			}
		}
	}

	@ObfuscatedName("LAMDVZMU.a(IIIZ)LEFVUNBHT;")
	public static final EFVUNBHT method373(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			EFVUNBHT var3 = (EFVUNBHT) field859.method531(arg2);
			if (var3 != null && var3.field672 != arg1 && var3.field672 != -1) {
				var3.method205();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		LAMDVZMU var4 = method376(arg2);
		if (var4.field889 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field882[var6] && var4.field882[var6] != 0) {
					var5 = var4.field889[var6];
				}
			}

			if (var5 != -1) {
				var4 = method376(var5);
			}
		}

		OJGAHFXC var7 = var4.method370(1);
		if (var7 == null) {
			return null;
		}

		EFVUNBHT var8 = null;
		if (var4.field875 != -1) {
			var8 = method373(-1, 10, var4.field902);
			if (var8 == null) {
				return null;
			}
		}

		EFVUNBHT var9 = new EFVUNBHT(32, 32);
		int var10 = AOGYQUKT.field26;
		int var11 = AOGYQUKT.field27;
		int[] var12 = AOGYQUKT.field32;
		int[] var13 = BDJXDJBP.field46;
		int var14 = BDJXDJBP.field47;
		int var15 = BDJXDJBP.field48;
		int var16 = BDJXDJBP.field51;
		int var17 = BDJXDJBP.field52;
		int var18 = BDJXDJBP.field49;
		int var19 = BDJXDJBP.field50;
		AOGYQUKT.field24 = false;
		BDJXDJBP.method24(32, 32, var9.field666);
		BDJXDJBP.method29(0, 32, 0, 0, 32);
		AOGYQUKT.method8();
		int var20 = var4.field864;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = AOGYQUKT.field30[var4.field897] * var20 >> 16;
		int var22 = AOGYQUKT.field31[var4.field897] * var20 >> 16;
		var7.method434(0, var4.field880, var4.field866, var4.field897, var4.field877, var7.field1265 / 2 + var21 + var4.field879, var4.field879 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field666[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field666[var24 * 32 + var23 - 1] > 1) {
						var9.field666[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field666[(var24 - 1) * 32 + var23] > 1) {
						var9.field666[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field666[var24 * 32 + var23 + 1] > 1) {
						var9.field666[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field666[(var24 + 1) * 32 + var23] > 1) {
						var9.field666[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field666[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field666[var26 * 32 + var25 - 1] == 1) {
							var9.field666[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field666[(var26 - 1) * 32 + var25] == 1) {
							var9.field666[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field666[var26 * 32 + var25 + 1] == 1) {
							var9.field666[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field666[(var26 + 1) * 32 + var25] == 1) {
							var9.field666[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field666[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field666[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field666[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field875 != -1) {
			int var29 = var8.field671;
			int var30 = var8.field672;
			var8.field671 = 32;
			var8.field672 = 32;
			var8.method215(0, 0);
			var8.field671 = var29;
			var8.field672 = var30;
		}

		if (arg0 == 0) {
			field859.method532(arg2, var9);
		}

		BDJXDJBP.method24(var14, var15, var13);
		BDJXDJBP.method26(var18, var17, var19, var16);
		AOGYQUKT.field26 = var10;
		AOGYQUKT.field27 = var11;
		AOGYQUKT.field32 = var12;
		AOGYQUKT.field24 = true;

		if (var4.field876) {
			var9.field671 = 33;
		} else {
			var9.field671 = 32;
		}

		var9.field672 = arg1;
		return var9;
	}

	@ObfuscatedName("LAMDVZMU.c(I)V")
	public static final void method374() {
		field878 = null;
		field859 = null;
		field862 = null;
		field867 = null;
		field865 = null;
	}

	@ObfuscatedName("LAMDVZMU.a(IZ)Z")
	public final boolean method375(int arg0) {
		int var2 = field886;
		int var3 = field855;
		if (arg0 == 1) {
			var2 = field869;
			var3 = field883;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!OJGAHFXC.method414(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !OJGAHFXC.method414(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("LAMDVZMU.d(I)LLAMDVZMU;")
	public static final LAMDVZMU method376(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field867[var1].field888 == arg0) {
				return field867[var1];
			}
		}

		field885 = (field885 + 1) % 10;
		LAMDVZMU var2 = field867[field885];
		field865.field679 = field862[arg0];
		var2.field888 = arg0;
		var2.method368();
		var2.method372(field865);

		if (var2.field875 != -1) {
			var2.method369();
		}

		if (!field857 && var2.field896) {
			var2.field863 = "Members Object";
			var2.field873 = "Login to a members' server to use this object.".getBytes();
			var2.field870 = null;
			var2.field887 = null;
			var2.field884 = 0;
		}

		return var2;
	}

	@ObfuscatedName("LAMDVZMU.a(IB)LOJGAHFXC;")
	public final OJGAHFXC method377(int arg0) {
		int var2 = field899;
		int var3 = field900;
		int var4 = field861;
		if (arg0 == 1) {
			var2 = field890;
			var3 = field874;
			var4 = field898;
		}

		if (var2 == -1) {
			return null;
		}

		OJGAHFXC var5 = OJGAHFXC.method413(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				OJGAHFXC var9 = OJGAHFXC.method413(var3);
				OJGAHFXC[] var10 = new OJGAHFXC[] { var5, var9 };
				var5 = new OJGAHFXC(2, var10);
			} else {
				OJGAHFXC var6 = OJGAHFXC.method413(var3);
				OJGAHFXC var7 = OJGAHFXC.method413(var4);
				OJGAHFXC[] var8 = new OJGAHFXC[] { var5, var6, var7 };
				var5 = new OJGAHFXC(3, var8);
			}
		}

		if (arg0 == 0 && field860 != 0) {
			var5.method426(field860, 0, 0);
		}

		if (arg0 == 1 && field881 != 0) {
			var5.method426(field881, 0, 0);
		}

		if (field872 != null) {
			for (int var11 = 0; var11 < field872.length; var11++) {
				var5.method427(field872[var11], field868[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("LAMDVZMU.c(II)Z")
	public final boolean method378(int arg0) {
		int var2 = field899;
		int var3 = field900;
		int var4 = field861;
		if (arg0 == 1) {
			var2 = field890;
			var3 = field874;
			var4 = field898;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!OJGAHFXC.method414(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !OJGAHFXC.method414(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !OJGAHFXC.method414(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("LAMDVZMU.a(LHBJEXSJX;)V")
	public static final void method379(HBJEXSJX arg0) {
		field865 = new EYMNCFMK(arg0.method348("obj.dat", null));
		EYMNCFMK var1 = new EYMNCFMK(arg0.method348("obj.idx", null));
		field894 = var1.method241();
		field862 = new int[field894];
		int var2 = 2;
		for (int var3 = 0; var3 < field894; var3++) {
			field862[var3] = var2;
			var2 += var1.method241();
		}

		field867 = new LAMDVZMU[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field867[var4] = new LAMDVZMU();
		}
	}
}
