package deob;

@ObfuscatedName("KIHBVNFV")
public final class KIHBVNFV {

	@ObfuscatedName("KIHBVNFV.b")
	public int field839 = -1;

	@ObfuscatedName("KIHBVNFV.c")
	public static HARAZQMH field840 = new HARAZQMH(50);

	@ObfuscatedName("KIHBVNFV.f")
	public static boolean field842 = true;

	@ObfuscatedName("KIHBVNFV.K")
	public static HARAZQMH field870 = new HARAZQMH(100);

	@ObfuscatedName("KIHBVNFV.l")
	public byte field846;

	@ObfuscatedName("KIHBVNFV.X")
	public byte field880;

	@ObfuscatedName("KIHBVNFV.a")
	public int field838;

	@ObfuscatedName("KIHBVNFV.g")
	public int field843;

	@ObfuscatedName("KIHBVNFV.i")
	public int field844;

	@ObfuscatedName("KIHBVNFV.n")
	public static int field848;

	@ObfuscatedName("KIHBVNFV.o")
	public int field849;

	@ObfuscatedName("KIHBVNFV.p")
	public int field850;

	@ObfuscatedName("KIHBVNFV.q")
	public int field851;

	@ObfuscatedName("KIHBVNFV.r")
	public int field852;

	@ObfuscatedName("KIHBVNFV.t")
	public int field854;

	@ObfuscatedName("KIHBVNFV.u")
	public int field855;

	@ObfuscatedName("KIHBVNFV.v")
	public static int field856;

	@ObfuscatedName("KIHBVNFV.w")
	public int field857;

	@ObfuscatedName("KIHBVNFV.y")
	public int field859;

	@ObfuscatedName("KIHBVNFV.A")
	public int field861;

	@ObfuscatedName("KIHBVNFV.B")
	public int field862;

	@ObfuscatedName("KIHBVNFV.C")
	public int field863;

	@ObfuscatedName("KIHBVNFV.E")
	public int field865;

	@ObfuscatedName("KIHBVNFV.G")
	public int field866;

	@ObfuscatedName("KIHBVNFV.H")
	public int field867;

	@ObfuscatedName("KIHBVNFV.I")
	public int field868;

	@ObfuscatedName("KIHBVNFV.L")
	public int field871;

	@ObfuscatedName("KIHBVNFV.N")
	public int field872;

	@ObfuscatedName("KIHBVNFV.P")
	public int field873;

	@ObfuscatedName("KIHBVNFV.R")
	public int field875;

	@ObfuscatedName("KIHBVNFV.S")
	public int field876;

	@ObfuscatedName("KIHBVNFV.V")
	public int field878;

	@ObfuscatedName("KIHBVNFV.Y")
	public int field881;

	@ObfuscatedName("KIHBVNFV.bb")
	public int field884;

	@ObfuscatedName("KIHBVNFV.cb")
	public int field885;

	@ObfuscatedName("KIHBVNFV.Z")
	public static CMGGUSPR field882;

	@ObfuscatedName("KIHBVNFV.x")
	public String field858;

	@ObfuscatedName("KIHBVNFV.d")
	public boolean field841;

	@ObfuscatedName("KIHBVNFV.W")
	public boolean field879;

	@ObfuscatedName("KIHBVNFV.T")
	public byte[] field877;

	@ObfuscatedName("KIHBVNFV.j")
	public int[] field845;

	@ObfuscatedName("KIHBVNFV.m")
	public int[] field847;

	@ObfuscatedName("KIHBVNFV.D")
	public static int[] field864;

	@ObfuscatedName("KIHBVNFV.J")
	public int[] field869;

	@ObfuscatedName("KIHBVNFV.Q")
	public int[] field874;

	@ObfuscatedName("KIHBVNFV.s")
	public static KIHBVNFV[] field853;

	@ObfuscatedName("KIHBVNFV.z")
	public String[] field860;

	@ObfuscatedName("KIHBVNFV.ab")
	public String[] field883;

	@ObfuscatedName("KIHBVNFV.a(ZI)LGCSAWSJV;")
	public final GCSAWSJV method343(int arg0) {
		int var2 = field854;
		int var3 = field871;
		int var4 = field844;
		if (arg0 == 1) {
			var2 = field866;
			var3 = field857;
			var4 = field867;
		}

		if (var2 == -1) {
			return null;
		}

		GCSAWSJV var5 = GCSAWSJV.method260(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				GCSAWSJV var9 = GCSAWSJV.method260(var3);
				GCSAWSJV[] var10 = new GCSAWSJV[] { var5, var9 };
				var5 = new GCSAWSJV(var10, 2);
			} else {
				GCSAWSJV var6 = GCSAWSJV.method260(var3);
				GCSAWSJV var7 = GCSAWSJV.method260(var4);
				GCSAWSJV[] var8 = new GCSAWSJV[] { var5, var6, var7 };
				var5 = new GCSAWSJV(var8, 3);
			}
		}

		if (arg0 == 0 && field846 != 0) {
			var5.method273(field846, 0, 0);
		}

		if (arg0 == 1 && field880 != 0) {
			var5.method273(field880, 0, 0);
		}

		if (field869 != null) {
			for (int var11 = 0; var11 < field869.length; var11++) {
				var5.method274(field869[var11], field845[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("KIHBVNFV.a()V")
	public final void method344() {
		field868 = 0;
		field858 = null;
		field877 = null;
		field869 = null;
		field845 = null;
		field862 = 2000;
		field855 = 0;
		field885 = 0;
		field881 = 0;
		field859 = 0;
		field878 = 0;
		field865 = -1;
		field841 = false;
		field873 = 1;
		field879 = false;
		field860 = null;
		field883 = null;
		field854 = -1;
		field871 = -1;
		field846 = 0;
		field866 = -1;
		field857 = -1;
		field880 = 0;
		field844 = -1;
		field867 = -1;
		field861 = -1;
		field876 = -1;
		field852 = -1;
		field849 = -1;
		field847 = null;
		field874 = null;
		field843 = -1;
		field838 = -1;
		field875 = 128;
		field850 = 128;
		field872 = 128;
		field851 = 0;
		field884 = 0;
		field863 = 0;
	}

	@ObfuscatedName("KIHBVNFV.a(BI)Z")
	public final boolean method345(int arg0) {
		int var2 = field854;
		int var3 = field871;
		int var4 = field844;
		if (arg0 == 1) {
			var2 = field866;
			var3 = field857;
			var4 = field867;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!GCSAWSJV.method261(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !GCSAWSJV.method261(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !GCSAWSJV.method261(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("KIHBVNFV.a(I)LKIHBVNFV;")
	public static final KIHBVNFV method346(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field853[var1].field839 == arg0) {
				return field853[var1];
			}
		}

		field848 = (field848 + 1) % 10;
		KIHBVNFV var2 = field853[field848];
		field882.field540 = field864[arg0];
		var2.field839 = arg0;
		var2.method344();
		var2.method355(field882);

		if (var2.field838 != -1) {
			var2.method349();
		}

		if (!field842 && var2.field879) {
			var2.field858 = "Members Object";
			var2.field877 = "Login to a members' server to use this object.".getBytes();
			var2.field860 = null;
			var2.field883 = null;
			var2.field863 = 0;
		}

		return var2;
	}

	@ObfuscatedName("KIHBVNFV.b(ZI)Z")
	public final boolean method347(int arg0) {
		int var2 = field861;
		int var3 = field876;
		if (arg0 == 1) {
			var2 = field852;
			var3 = field849;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!GCSAWSJV.method261(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !GCSAWSJV.method261(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("KIHBVNFV.a(LUUIGNTAD;)V")
	public static final void method348(UUIGNTAD arg0) {
		field882 = new CMGGUSPR(arg0.method545("obj.dat", null));
		CMGGUSPR var1 = new CMGGUSPR(arg0.method545("obj.idx", null));
		field856 = var1.method196();
		field864 = new int[field856];
		int var2 = 2;
		for (int var3 = 0; var3 < field856; var3++) {
			field864[var3] = var2;
			var2 += var1.method196();
		}

		field853 = new KIHBVNFV[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field853[var4] = new KIHBVNFV();
		}
	}

	@ObfuscatedName("KIHBVNFV.a(B)V")
	public void method349() {
		KIHBVNFV var1 = method346(field838);
		field868 = var1.field868;
		field862 = var1.field862;
		field855 = var1.field855;
		field885 = var1.field885;
		field881 = var1.field881;
		field859 = var1.field859;
		field878 = var1.field878;
		field869 = var1.field869;
		field845 = var1.field845;
		KIHBVNFV var2 = method346(field843);
		field858 = var2.field858;
		field879 = var2.field879;
		field873 = var2.field873;
		String var3 = "a";
		char var4 = var2.field858.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field877 = ("Swap this note at any bank for " + var3 + " " + var2.field858 + ".").getBytes();
		field841 = true;
	}

	@ObfuscatedName("KIHBVNFV.b(I)LGCSAWSJV;")
	public final GCSAWSJV method350(int arg0) {
		if (field847 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field874[var3] && field874[var3] != 0) {
					var2 = field847[var3];
				}
			}

			if (var2 != -1) {
				return method346(var2).method350(1);
			}
		}

		GCSAWSJV var4 = (GCSAWSJV) field840.method299(field839);
		if (var4 != null) {
			return var4;
		}

		GCSAWSJV var5 = GCSAWSJV.method260(field868);
		if (var5 == null) {
			return null;
		}

		if (field875 != 128 || field850 != 128 || field872 != 128) {
			var5.method276(field875, field872, field850);
		}

		if (field869 != null) {
			for (int var6 = 0; var6 < field869.length; var6++) {
				var5.method274(field869[var6], field845[var6]);
			}
		}

		var5.method277(field851 + 64, field884 + 768, -50, -10, -50, true);
		var5.field625 = true;
		field840.method300(field839, var5);
		return var5;
	}

	@ObfuscatedName("KIHBVNFV.a(II)LGCSAWSJV;")
	public final GCSAWSJV method351(int arg0) {
		if (field847 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field874[var3] && field874[var3] != 0) {
					var2 = field847[var3];
				}
			}

			if (var2 != -1) {
				return method346(var2).method351(1);
			}
		}

		GCSAWSJV var4 = GCSAWSJV.method260(field868);
		if (var4 == null) {
			return null;
		}

		if (field869 != null) {
			for (int var5 = 0; var5 < field869.length; var5++) {
				var4.method274(field869[var5], field845[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("KIHBVNFV.a(IIII)LTPIBHECB;")
	public static final TPIBHECB method352(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			TPIBHECB var3 = (TPIBHECB) field870.method299(arg1);
			if (var3 != null && var3.field1225 != arg2 && var3.field1225 != -1) {
				var3.method1();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		KIHBVNFV var4 = method346(arg1);
		if (var4.field847 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field874[var6] && var4.field874[var6] != 0) {
					var5 = var4.field847[var6];
				}
			}

			if (var5 != -1) {
				var4 = method346(var5);
			}
		}

		GCSAWSJV var7 = var4.method350(1);
		if (var7 == null) {
			return null;
		}

		TPIBHECB var8 = null;
		if (var4.field838 != -1) {
			var8 = method352(-1, var4.field843, 10);
			if (var8 == null) {
				return null;
			}
		}

		TPIBHECB var9 = new TPIBHECB(32, 32);
		int var10 = NQTCRWWR.field964;
		int var11 = NQTCRWWR.field965;
		int[] var12 = NQTCRWWR.field970;
		int[] var13 = BAXODNVH.field31;
		int var14 = BAXODNVH.field32;
		int var15 = BAXODNVH.field33;
		int var16 = BAXODNVH.field36;
		int var17 = BAXODNVH.field37;
		int var18 = BAXODNVH.field34;
		int var19 = BAXODNVH.field35;
		NQTCRWWR.field962 = false;
		BAXODNVH.method17(32, var9.field1219, 32);
		BAXODNVH.method22(32, 0, 32, 0, 0);
		NQTCRWWR.method403();
		int var20 = var4.field862;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = NQTCRWWR.field968[var4.field855] * var20 >> 16;
		int var22 = NQTCRWWR.field969[var4.field855] * var20 >> 16;
		var7.method281(0, var4.field885, var4.field881, var4.field855, var4.field859, var7.field7 / 2 + var21 + var4.field878, var4.field878 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1219[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1219[var24 * 32 + var23 - 1] > 1) {
						var9.field1219[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1219[(var24 - 1) * 32 + var23] > 1) {
						var9.field1219[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1219[var24 * 32 + var23 + 1] > 1) {
						var9.field1219[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1219[(var24 + 1) * 32 + var23] > 1) {
						var9.field1219[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1219[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1219[var26 * 32 + var25 - 1] == 1) {
							var9.field1219[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field1219[(var26 - 1) * 32 + var25] == 1) {
							var9.field1219[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field1219[var26 * 32 + var25 + 1] == 1) {
							var9.field1219[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field1219[(var26 + 1) * 32 + var25] == 1) {
							var9.field1219[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1219[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1219[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1219[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field838 != -1) {
			int var29 = var8.field1224;
			int var30 = var8.field1225;
			var8.field1224 = 32;
			var8.field1225 = 32;
			var8.method507(0, 0);
			var8.field1224 = var29;
			var8.field1225 = var30;
		}

		if (arg0 == 0) {
			field870.method300(arg1, var9);
		}

		BAXODNVH.method17(var14, var13, var15);
		BAXODNVH.method19(var18, var19, var17, var16);
		NQTCRWWR.field964 = var10;
		NQTCRWWR.field965 = var11;
		NQTCRWWR.field970 = var12;
		NQTCRWWR.field962 = true;

		if (var4.field841) {
			var9.field1224 = 33;
		} else {
			var9.field1224 = 32;
		}

		var9.field1225 = arg2;
		return var9;
	}

	@ObfuscatedName("KIHBVNFV.b(II)LGCSAWSJV;")
	public final GCSAWSJV method353(int arg0) {
		int var2 = field861;
		int var3 = field876;
		if (arg0 == 1) {
			var2 = field852;
			var3 = field849;
		}

		if (var2 == -1) {
			return null;
		}

		GCSAWSJV var4 = GCSAWSJV.method260(var2);
		if (var3 != -1) {
			GCSAWSJV var5 = GCSAWSJV.method260(var3);
			GCSAWSJV[] var6 = new GCSAWSJV[] { var4, var5 };
			var4 = new GCSAWSJV(var6, 2);
		}

		if (field869 != null) {
			for (int var7 = 0; var7 < field869.length; var7++) {
				var4.method274(field869[var7], field845[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("KIHBVNFV.c(I)V")
	public static final void method354() {
		field840 = null;
		field870 = null;
		field864 = null;
		field853 = null;
		field882 = null;
	}

	@ObfuscatedName("KIHBVNFV.a(LCMGGUSPR;I)V")
	public final void method355(CMGGUSPR arg0) {
		while (true) {
			int var2 = arg0.method194();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field868 = arg0.method196();
			} else if (var2 == 2) {
				field858 = arg0.method201();
			} else if (var2 == 3) {
				field877 = arg0.method202();
			} else if (var2 == 4) {
				field862 = arg0.method196();
			} else if (var2 == 5) {
				field855 = arg0.method196();
			} else if (var2 == 6) {
				field885 = arg0.method196();
			} else if (var2 == 7) {
				field859 = arg0.method196();
				if (field859 > 32767) {
					field859 -= 0x10000;
				}
			} else if (var2 == 8) {
				field878 = arg0.method196();
				if (field878 > 32767) {
					field878 -= 0x10000;
				}
			} else if (var2 == 10) {
				field865 = arg0.method196();
			} else if (var2 == 11) {
				field841 = true;
			} else if (var2 == 12) {
				field873 = arg0.method199();
			} else if (var2 == 16) {
				field879 = true;
			} else if (var2 == 23) {
				field854 = arg0.method196();
				field846 = arg0.method195();
			} else if (var2 == 24) {
				field871 = arg0.method196();
			} else if (var2 == 25) {
				field866 = arg0.method196();
				field880 = arg0.method195();
			} else if (var2 == 26) {
				field857 = arg0.method196();
			} else if (var2 >= 30 && var2 < 35) {
				if (field860 == null) {
					field860 = new String[5];
				}

				field860[var2 - 30] = arg0.method201();
				if (field860[var2 - 30].equalsIgnoreCase("hidden")) {
					field860[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field883 == null) {
					field883 = new String[5];
				}

				field883[var2 - 35] = arg0.method201();
			} else if (var2 == 40) {
				int var3 = arg0.method194();
				field869 = new int[var3];
				field845 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field869[var4] = arg0.method196();
					field845[var4] = arg0.method196();
				}
			} else if (var2 == 78) {
				field844 = arg0.method196();
			} else if (var2 == 79) {
				field867 = arg0.method196();
			} else if (var2 == 90) {
				field861 = arg0.method196();
			} else if (var2 == 91) {
				field852 = arg0.method196();
			} else if (var2 == 92) {
				field876 = arg0.method196();
			} else if (var2 == 93) {
				field849 = arg0.method196();
			} else if (var2 == 95) {
				field881 = arg0.method196();
			} else if (var2 == 97) {
				field843 = arg0.method196();
			} else if (var2 == 98) {
				field838 = arg0.method196();
			} else if (var2 >= 100 && var2 < 110) {
				if (field847 == null) {
					field847 = new int[10];
					field874 = new int[10];
				}

				field847[var2 - 100] = arg0.method196();
				field874[var2 - 100] = arg0.method196();
			} else if (var2 == 110) {
				field875 = arg0.method196();
			} else if (var2 == 111) {
				field850 = arg0.method196();
			} else if (var2 == 112) {
				field872 = arg0.method196();
			} else if (var2 == 113) {
				field851 = arg0.method195();
			} else if (var2 == 114) {
				field884 = arg0.method195() * 5;
			} else if (var2 == 115) {
				field863 = arg0.method194();
			}
		}
	}
}
