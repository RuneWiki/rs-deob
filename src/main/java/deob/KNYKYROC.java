package deob;

@ObfuscatedName("KNYKYROC")
public final class KNYKYROC {

	@ObfuscatedName("KNYKYROC.O")
	public int field882 = -1;

	@ObfuscatedName("KNYKYROC.E")
	public static CZWVRQJW field874 = new CZWVRQJW(100);

	@ObfuscatedName("KNYKYROC.G")
	public static CZWVRQJW field876 = new CZWVRQJW(50);

	@ObfuscatedName("KNYKYROC.X")
	public static boolean field891 = true;

	@ObfuscatedName("KNYKYROC.e")
	public byte field851;

	@ObfuscatedName("KNYKYROC.ab")
	public byte field894;

	@ObfuscatedName("KNYKYROC.c")
	public int field849;

	@ObfuscatedName("KNYKYROC.d")
	public int field850;

	@ObfuscatedName("KNYKYROC.g")
	public static int field853;

	@ObfuscatedName("KNYKYROC.h")
	public int field854;

	@ObfuscatedName("KNYKYROC.j")
	public static int field855;

	@ObfuscatedName("KNYKYROC.l")
	public int field857;

	@ObfuscatedName("KNYKYROC.m")
	public int field858;

	@ObfuscatedName("KNYKYROC.n")
	public int field859;

	@ObfuscatedName("KNYKYROC.p")
	public int field861;

	@ObfuscatedName("KNYKYROC.q")
	public int field862;

	@ObfuscatedName("KNYKYROC.s")
	public int field863;

	@ObfuscatedName("KNYKYROC.t")
	public int field864;

	@ObfuscatedName("KNYKYROC.v")
	public int field866;

	@ObfuscatedName("KNYKYROC.w")
	public int field867;

	@ObfuscatedName("KNYKYROC.y")
	public int field869;

	@ObfuscatedName("KNYKYROC.z")
	public int field870;

	@ObfuscatedName("KNYKYROC.B")
	public int field872;

	@ObfuscatedName("KNYKYROC.D")
	public int field873;

	@ObfuscatedName("KNYKYROC.F")
	public int field875;

	@ObfuscatedName("KNYKYROC.H")
	public int field877;

	@ObfuscatedName("KNYKYROC.K")
	public int field879;

	@ObfuscatedName("KNYKYROC.L")
	public int field880;

	@ObfuscatedName("KNYKYROC.N")
	public int field881;

	@ObfuscatedName("KNYKYROC.Q")
	public int field884;

	@ObfuscatedName("KNYKYROC.R")
	public int field885;

	@ObfuscatedName("KNYKYROC.S")
	public int field886;

	@ObfuscatedName("KNYKYROC.U")
	public int field888;

	@ObfuscatedName("KNYKYROC.V")
	public int field889;

	@ObfuscatedName("KNYKYROC.Z")
	public int field893;

	@ObfuscatedName("KNYKYROC.x")
	public static LDILQFVA field868;

	@ObfuscatedName("KNYKYROC.u")
	public String field865;

	@ObfuscatedName("KNYKYROC.a")
	public boolean field847;

	@ObfuscatedName("KNYKYROC.Y")
	public boolean field892;

	@ObfuscatedName("KNYKYROC.T")
	public byte[] field887;

	@ObfuscatedName("KNYKYROC.b")
	public int[] field848;

	@ObfuscatedName("KNYKYROC.k")
	public int[] field856;

	@ObfuscatedName("KNYKYROC.o")
	public static int[] field860;

	@ObfuscatedName("KNYKYROC.J")
	public int[] field878;

	@ObfuscatedName("KNYKYROC.P")
	public int[] field883;

	@ObfuscatedName("KNYKYROC.f")
	public static KNYKYROC[] field852;

	@ObfuscatedName("KNYKYROC.A")
	public String[] field871;

	@ObfuscatedName("KNYKYROC.W")
	public String[] field890;

	@ObfuscatedName("KNYKYROC.a(I)V")
	public void method374() {
		KNYKYROC var1 = method380(field861);
		field873 = var1.field873;
		field881 = var1.field881;
		field858 = var1.field858;
		field879 = var1.field879;
		field857 = var1.field857;
		field888 = var1.field888;
		field872 = var1.field872;
		field883 = var1.field883;
		field856 = var1.field856;
		KNYKYROC var2 = method380(field849);
		field865 = var2.field865;
		field892 = var2.field892;
		field866 = var2.field866;
		String var3 = "a";
		char var4 = var2.field865.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field887 = ("Swap this note at any bank for " + var3 + " " + var2.field865 + ".").getBytes();
		field847 = true;
	}

	@ObfuscatedName("KNYKYROC.a(LLDILQFVA;I)V")
	public final void method375(LDILQFVA arg0) {
		while (true) {
			int var2 = arg0.method402();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field873 = arg0.method404();
			} else if (var2 == 2) {
				field865 = arg0.method409();
			} else if (var2 == 3) {
				field887 = arg0.method410();
			} else if (var2 == 4) {
				field881 = arg0.method404();
			} else if (var2 == 5) {
				field858 = arg0.method404();
			} else if (var2 == 6) {
				field879 = arg0.method404();
			} else if (var2 == 7) {
				field888 = arg0.method404();
				if (field888 > 32767) {
					field888 -= 0x10000;
				}
			} else if (var2 == 8) {
				field872 = arg0.method404();
				if (field872 > 32767) {
					field872 -= 0x10000;
				}
			} else if (var2 == 10) {
				field859 = arg0.method404();
			} else if (var2 == 11) {
				field847 = true;
			} else if (var2 == 12) {
				field866 = arg0.method407();
			} else if (var2 == 16) {
				field892 = true;
			} else if (var2 == 23) {
				field886 = arg0.method404();
				field894 = arg0.method403();
			} else if (var2 == 24) {
				field867 = arg0.method404();
			} else if (var2 == 25) {
				field854 = arg0.method404();
				field851 = arg0.method403();
			} else if (var2 == 26) {
				field864 = arg0.method404();
			} else if (var2 >= 30 && var2 < 35) {
				if (field871 == null) {
					field871 = new String[5];
				}

				field871[var2 - 30] = arg0.method409();
				if (field871[var2 - 30].equalsIgnoreCase("hidden")) {
					field871[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field890 == null) {
					field890 = new String[5];
				}

				field890[var2 - 35] = arg0.method409();
			} else if (var2 == 40) {
				int var3 = arg0.method402();
				field883 = new int[var3];
				field856 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field883[var4] = arg0.method404();
					field856[var4] = arg0.method404();
				}
			} else if (var2 == 78) {
				field880 = arg0.method404();
			} else if (var2 == 79) {
				field850 = arg0.method404();
			} else if (var2 == 90) {
				field893 = arg0.method404();
			} else if (var2 == 91) {
				field863 = arg0.method404();
			} else if (var2 == 92) {
				field885 = arg0.method404();
			} else if (var2 == 93) {
				field877 = arg0.method404();
			} else if (var2 == 95) {
				field857 = arg0.method404();
			} else if (var2 == 97) {
				field849 = arg0.method404();
			} else if (var2 == 98) {
				field861 = arg0.method404();
			} else if (var2 >= 100 && var2 < 110) {
				if (field848 == null) {
					field848 = new int[10];
					field878 = new int[10];
				}

				field848[var2 - 100] = arg0.method404();
				field878[var2 - 100] = arg0.method404();
			} else if (var2 == 110) {
				field862 = arg0.method404();
			} else if (var2 == 111) {
				field889 = arg0.method404();
			} else if (var2 == 112) {
				field875 = arg0.method404();
			} else if (var2 == 113) {
				field884 = arg0.method403();
			} else if (var2 == 114) {
				field869 = arg0.method403() * 5;
			} else if (var2 == 115) {
				field870 = arg0.method402();
			}
		}
	}

	@ObfuscatedName("KNYKYROC.a(II)LHEQROJXW;")
	public final HEQROJXW method376(int arg0) {
		int var2 = field886;
		int var3 = field867;
		int var4 = field880;
		if (arg0 == 1) {
			var2 = field854;
			var3 = field864;
			var4 = field850;
		}

		if (var2 == -1) {
			return null;
		}

		HEQROJXW var5 = HEQROJXW.method322(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				HEQROJXW var9 = HEQROJXW.method322(var3);
				HEQROJXW[] var10 = new HEQROJXW[] { var5, var9 };
				var5 = new HEQROJXW(2, var10);
			} else {
				HEQROJXW var6 = HEQROJXW.method322(var3);
				HEQROJXW var7 = HEQROJXW.method322(var4);
				HEQROJXW[] var8 = new HEQROJXW[] { var5, var6, var7 };
				var5 = new HEQROJXW(3, var8);
			}
		}

		if (arg0 == 0 && field894 != 0) {
			var5.method335(field894, 0, 0);
		}

		if (arg0 == 1 && field851 != 0) {
			var5.method335(field851, 0, 0);
		}

		if (field883 != null) {
			for (int var11 = 0; var11 < field883.length; var11++) {
				var5.method336(field883[var11], field856[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("KNYKYROC.a(IIII)LDUMEPGRH;")
	public static final DUMEPGRH method377(int arg0, int arg1, int arg2) {
		if (arg2 == 0) {
			DUMEPGRH var3 = (DUMEPGRH) field874.method152(arg1);
			if (var3 != null && var3.field549 != arg0 && var3.field549 != -1) {
				var3.method156();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		KNYKYROC var4 = method380(arg1);
		if (var4.field848 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field878[var6] && var4.field878[var6] != 0) {
					var5 = var4.field848[var6];
				}
			}

			if (var5 != -1) {
				var4 = method380(var5);
			}
		}

		HEQROJXW var7 = var4.method381(1);
		if (var7 == null) {
			return null;
		}

		DUMEPGRH var8 = null;
		if (var4.field861 != -1) {
			var8 = method377(10, var4.field849, -1);
			if (var8 == null) {
				return null;
			}
		}

		DUMEPGRH var9 = new DUMEPGRH(32, 32);
		int var10 = GSZOCBMU.field690;
		int var11 = GSZOCBMU.field691;
		int[] var12 = GSZOCBMU.field696;
		int[] var13 = SXFSGYHA.field1125;
		int var14 = SXFSGYHA.field1126;
		int var15 = SXFSGYHA.field1127;
		int var16 = SXFSGYHA.field1130;
		int var17 = SXFSGYHA.field1131;
		int var18 = SXFSGYHA.field1128;
		int var19 = SXFSGYHA.field1129;
		GSZOCBMU.field688 = false;
		SXFSGYHA.method516(32, var9.field543, 32);
		SXFSGYHA.method521(0, 32, 0, 0, 32);
		GSZOCBMU.method299();
		int var20 = var4.field881;
		if (arg2 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg2 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = GSZOCBMU.field694[var4.field858] * var20 >> 16;
		int var22 = GSZOCBMU.field695[var4.field858] * var20 >> 16;
		var7.method342(0, var4.field879, var4.field857, var4.field858, var4.field888, var7.field627 / 2 + var21 + var4.field872, var4.field872 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field543[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field543[var24 * 32 + var23 - 1] > 1) {
						var9.field543[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field543[(var24 - 1) * 32 + var23] > 1) {
						var9.field543[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field543[var24 * 32 + var23 + 1] > 1) {
						var9.field543[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field543[(var24 + 1) * 32 + var23] > 1) {
						var9.field543[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg2 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field543[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field543[var26 * 32 + var25 - 1] == 1) {
							var9.field543[var26 * 32 + var25] = arg2;
						} else if (var26 > 0 && var9.field543[(var26 - 1) * 32 + var25] == 1) {
							var9.field543[var26 * 32 + var25] = arg2;
						} else if (var25 < 31 && var9.field543[var26 * 32 + var25 + 1] == 1) {
							var9.field543[var26 * 32 + var25] = arg2;
						} else if (var26 < 31 && var9.field543[(var26 + 1) * 32 + var25] == 1) {
							var9.field543[var26 * 32 + var25] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field543[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field543[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field543[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field861 != -1) {
			int var29 = var8.field548;
			int var30 = var8.field549;
			var8.field548 = 32;
			var8.field549 = 32;
			var8.method219(0, 0);
			var8.field548 = var29;
			var8.field549 = var30;
		}

		if (arg2 == 0) {
			field874.method153(var9, arg1);
		}

		SXFSGYHA.method516(var14, var13, var15);
		SXFSGYHA.method518(var18, var17, var19, var16);
		GSZOCBMU.field690 = var10;
		GSZOCBMU.field691 = var11;
		GSZOCBMU.field696 = var12;
		GSZOCBMU.field688 = true;

		if (var4.field847) {
			var9.field548 = 33;
		} else {
			var9.field548 = 32;
		}

		var9.field549 = arg0;
		return var9;
	}

	@ObfuscatedName("KNYKYROC.a(IZ)LHEQROJXW;")
	public final HEQROJXW method378(int arg0) {
		int var2 = field893;
		int var3 = field885;
		if (arg0 == 1) {
			var2 = field863;
			var3 = field877;
		}

		if (var2 == -1) {
			return null;
		}

		HEQROJXW var4 = HEQROJXW.method322(var2);
		if (var3 != -1) {
			HEQROJXW var5 = HEQROJXW.method322(var3);
			HEQROJXW[] var6 = new HEQROJXW[] { var4, var5 };
			var4 = new HEQROJXW(2, var6);
		}

		if (field883 != null) {
			for (int var7 = 0; var7 < field883.length; var7++) {
				var4.method336(field883[var7], field856[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("KNYKYROC.a(ZI)LHEQROJXW;")
	public final HEQROJXW method379(int arg0) {
		if (field848 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field878[var3] && field878[var3] != 0) {
					var2 = field848[var3];
				}
			}

			if (var2 != -1) {
				return method380(var2).method379(1);
			}
		}

		HEQROJXW var4 = HEQROJXW.method322(field873);
		if (var4 == null) {
			return null;
		}

		if (field883 != null) {
			for (int var5 = 0; var5 < field883.length; var5++) {
				var4.method336(field883[var5], field856[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("KNYKYROC.b(I)LKNYKYROC;")
	public static final KNYKYROC method380(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field852[var1].field882 == arg0) {
				return field852[var1];
			}
		}

		field855 = (field855 + 1) % 10;
		KNYKYROC var2 = field852[field855];
		field868.field902 = field860[arg0];
		var2.field882 = arg0;
		var2.method382();
		var2.method375(field868);

		if (var2.field861 != -1) {
			var2.method374();
		}

		if (!field891 && var2.field892) {
			var2.field865 = "Members Object";
			var2.field887 = "Login to a members' server to use this object.".getBytes();
			var2.field871 = null;
			var2.field890 = null;
			var2.field870 = 0;
		}

		return var2;
	}

	@ObfuscatedName("KNYKYROC.c(I)LHEQROJXW;")
	public final HEQROJXW method381(int arg0) {
		if (field848 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field878[var3] && field878[var3] != 0) {
					var2 = field848[var3];
				}
			}

			if (var2 != -1) {
				return method380(var2).method381(1);
			}
		}

		HEQROJXW var4 = (HEQROJXW) field876.method152(field882);
		if (var4 != null) {
			return var4;
		}

		HEQROJXW var5 = HEQROJXW.method322(field873);
		if (var5 == null) {
			return null;
		}

		if (field862 != 128 || field889 != 128 || field875 != 128) {
			var5.method338(field889, field875, field862);
		}

		if (field883 != null) {
			for (int var6 = 0; var6 < field883.length; var6++) {
				var5.method336(field883[var6], field856[var6]);
			}
		}

		var5.method339(field884 + 64, field869 + 768, -50, -10, -50, true);
		var5.field750 = true;
		field876.method153(var5, field882);
		return var5;
	}

	@ObfuscatedName("KNYKYROC.a()V")
	public final void method382() {
		field873 = 0;
		field865 = null;
		field887 = null;
		field883 = null;
		field856 = null;
		field881 = 2000;
		field858 = 0;
		field879 = 0;
		field857 = 0;
		field888 = 0;
		field872 = 0;
		field859 = -1;
		field847 = false;
		field866 = 1;
		field892 = false;
		field871 = null;
		field890 = null;
		field886 = -1;
		field867 = -1;
		field894 = 0;
		field854 = -1;
		field864 = -1;
		field851 = 0;
		field880 = -1;
		field850 = -1;
		field893 = -1;
		field885 = -1;
		field863 = -1;
		field877 = -1;
		field848 = null;
		field878 = null;
		field849 = -1;
		field861 = -1;
		field862 = 128;
		field889 = 128;
		field875 = 128;
		field884 = 0;
		field869 = 0;
		field870 = 0;
	}

	@ObfuscatedName("KNYKYROC.a(LSPZBTZXL;)V")
	public static final void method383(SPZBTZXL arg0) {
		field868 = new LDILQFVA(arg0.method515("obj.dat", null));
		LDILQFVA var1 = new LDILQFVA(arg0.method515("obj.idx", null));
		field853 = var1.method404();
		field860 = new int[field853];
		int var2 = 2;
		for (int var3 = 0; var3 < field853; var3++) {
			field860[var3] = var2;
			var2 += var1.method404();
		}

		field852 = new KNYKYROC[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field852[var4] = new KNYKYROC();
		}
	}

	@ObfuscatedName("KNYKYROC.d(I)V")
	public static final void method384() {
		field876 = null;
		field874 = null;
		field860 = null;
		field852 = null;
		field868 = null;
	}

	@ObfuscatedName("KNYKYROC.b(IZ)Z")
	public final boolean method385(int arg0) {
		int var2 = field893;
		int var3 = field885;
		if (arg0 == 1) {
			var2 = field863;
			var3 = field877;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!HEQROJXW.method323(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !HEQROJXW.method323(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("KNYKYROC.a(IB)Z")
	public final boolean method386(int arg0) {
		int var2 = field886;
		int var3 = field867;
		int var4 = field880;
		if (arg0 == 1) {
			var2 = field854;
			var3 = field864;
			var4 = field850;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!HEQROJXW.method323(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !HEQROJXW.method323(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !HEQROJXW.method323(var4)) {
			var5 = false;
		}

		return var5;
	}
}
