package deob;

@ObfuscatedName("HFWXROSJ")
public final class HFWXROSJ {

	@ObfuscatedName("HFWXROSJ.O")
	public int field892 = -1;

	@ObfuscatedName("HFWXROSJ.m")
	public static boolean field865 = true;

	@ObfuscatedName("HFWXROSJ.o")
	public static QQBOAQZB field867 = new QQBOAQZB(100);

	@ObfuscatedName("HFWXROSJ.x")
	public static QQBOAQZB field876 = new QQBOAQZB(50);

	@ObfuscatedName("HFWXROSJ.h")
	public byte field861;

	@ObfuscatedName("HFWXROSJ.z")
	public byte field878;

	@ObfuscatedName("HFWXROSJ.d")
	public static int field857;

	@ObfuscatedName("HFWXROSJ.g")
	public int field860;

	@ObfuscatedName("HFWXROSJ.i")
	public int field862;

	@ObfuscatedName("HFWXROSJ.j")
	public int field863;

	@ObfuscatedName("HFWXROSJ.q")
	public int field869;

	@ObfuscatedName("HFWXROSJ.s")
	public int field871;

	@ObfuscatedName("HFWXROSJ.t")
	public int field872;

	@ObfuscatedName("HFWXROSJ.v")
	public int field874;

	@ObfuscatedName("HFWXROSJ.y")
	public int field877;

	@ObfuscatedName("HFWXROSJ.A")
	public int field879;

	@ObfuscatedName("HFWXROSJ.C")
	public int field880;

	@ObfuscatedName("HFWXROSJ.D")
	public int field881;

	@ObfuscatedName("HFWXROSJ.E")
	public int field882;

	@ObfuscatedName("HFWXROSJ.F")
	public int field883;

	@ObfuscatedName("HFWXROSJ.G")
	public int field884;

	@ObfuscatedName("HFWXROSJ.H")
	public int field885;

	@ObfuscatedName("HFWXROSJ.J")
	public int field887;

	@ObfuscatedName("HFWXROSJ.K")
	public int field888;

	@ObfuscatedName("HFWXROSJ.L")
	public int field889;

	@ObfuscatedName("HFWXROSJ.P")
	public int field893;

	@ObfuscatedName("HFWXROSJ.R")
	public int field894;

	@ObfuscatedName("HFWXROSJ.S")
	public static int field895;

	@ObfuscatedName("HFWXROSJ.T")
	public int field896;

	@ObfuscatedName("HFWXROSJ.U")
	public int field897;

	@ObfuscatedName("HFWXROSJ.V")
	public int field898;

	@ObfuscatedName("HFWXROSJ.X")
	public int field900;

	@ObfuscatedName("HFWXROSJ.Y")
	public int field901;

	@ObfuscatedName("HFWXROSJ.Z")
	public int field902;

	@ObfuscatedName("HFWXROSJ.ab")
	public int field903;

	@ObfuscatedName("HFWXROSJ.I")
	public static INLHDAGO field886;

	@ObfuscatedName("HFWXROSJ.M")
	public String field890;

	@ObfuscatedName("HFWXROSJ.c")
	public boolean field856;

	@ObfuscatedName("HFWXROSJ.u")
	public boolean field873;

	@ObfuscatedName("HFWXROSJ.W")
	public byte[] field899;

	@ObfuscatedName("HFWXROSJ.f")
	public int[] field859;

	@ObfuscatedName("HFWXROSJ.n")
	public static int[] field866;

	@ObfuscatedName("HFWXROSJ.p")
	public int[] field868;

	@ObfuscatedName("HFWXROSJ.w")
	public int[] field875;

	@ObfuscatedName("HFWXROSJ.N")
	public int[] field891;

	@ObfuscatedName("HFWXROSJ.l")
	public static HFWXROSJ[] field864;

	@ObfuscatedName("HFWXROSJ.e")
	public String[] field858;

	@ObfuscatedName("HFWXROSJ.r")
	public String[] field870;

	@ObfuscatedName("HFWXROSJ.a(ILINLHDAGO;)V")
	public final void method277(INLHDAGO arg0) {
		while (true) {
			int var2 = arg0.method308();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field883 = arg0.method310();
			} else if (var2 == 2) {
				field890 = arg0.method315();
			} else if (var2 == 3) {
				field899 = arg0.method316();
			} else if (var2 == 4) {
				field884 = arg0.method310();
			} else if (var2 == 5) {
				field869 = arg0.method310();
			} else if (var2 == 6) {
				field898 = arg0.method310();
			} else if (var2 == 7) {
				field879 = arg0.method310();
				if (field879 > 32767) {
					field879 -= 0x10000;
				}
			} else if (var2 == 8) {
				field863 = arg0.method310();
				if (field863 > 32767) {
					field863 -= 0x10000;
				}
			} else if (var2 == 10) {
				field881 = arg0.method310();
			} else if (var2 == 11) {
				field856 = true;
			} else if (var2 == 12) {
				field885 = arg0.method313();
			} else if (var2 == 16) {
				field873 = true;
			} else if (var2 == 23) {
				field894 = arg0.method310();
				field878 = arg0.method309();
			} else if (var2 == 24) {
				field874 = arg0.method310();
			} else if (var2 == 25) {
				field903 = arg0.method310();
				field861 = arg0.method309();
			} else if (var2 == 26) {
				field860 = arg0.method310();
			} else if (var2 >= 30 && var2 < 35) {
				if (field858 == null) {
					field858 = new String[5];
				}

				field858[var2 - 30] = arg0.method315();
				if (field858[var2 - 30].equalsIgnoreCase("hidden")) {
					field858[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field870 == null) {
					field870 = new String[5];
				}

				field870[var2 - 35] = arg0.method315();
			} else if (var2 == 40) {
				int var3 = arg0.method308();
				field859 = new int[var3];
				field891 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field859[var4] = arg0.method310();
					field891[var4] = arg0.method310();
				}
			} else if (var2 == 78) {
				field880 = arg0.method310();
			} else if (var2 == 79) {
				field887 = arg0.method310();
			} else if (var2 == 90) {
				field877 = arg0.method310();
			} else if (var2 == 91) {
				field897 = arg0.method310();
			} else if (var2 == 92) {
				field900 = arg0.method310();
			} else if (var2 == 93) {
				field889 = arg0.method310();
			} else if (var2 == 95) {
				field862 = arg0.method310();
			} else if (var2 == 97) {
				field902 = arg0.method310();
			} else if (var2 == 98) {
				field896 = arg0.method310();
			} else if (var2 >= 100 && var2 < 110) {
				if (field868 == null) {
					field868 = new int[10];
					field875 = new int[10];
				}

				field868[var2 - 100] = arg0.method310();
				field875[var2 - 100] = arg0.method310();
			} else if (var2 == 110) {
				field872 = arg0.method310();
			} else if (var2 == 111) {
				field901 = arg0.method310();
			} else if (var2 == 112) {
				field871 = arg0.method310();
			} else if (var2 == 113) {
				field882 = arg0.method309();
			} else if (var2 == 114) {
				field888 = arg0.method309() * 5;
			} else if (var2 == 115) {
				field893 = arg0.method308();
			}
		}
	}

	@ObfuscatedName("HFWXROSJ.a(Z)V")
	public static final void method278() {
		field876 = null;
		field867 = null;
		field866 = null;
		field864 = null;
		field886 = null;
	}

	@ObfuscatedName("HFWXROSJ.a(IZ)LDHUPIIUL;")
	public final DHUPIIUL method279(int arg0) {
		int var2 = field877;
		int var3 = field900;
		if (arg0 == 1) {
			var2 = field897;
			var3 = field889;
		}

		if (var2 == -1) {
			return null;
		}

		DHUPIIUL var4 = DHUPIIUL.method191(var2);
		if (var3 != -1) {
			DHUPIIUL var5 = DHUPIIUL.method191(var3);
			DHUPIIUL[] var6 = new DHUPIIUL[] { var4, var5 };
			var4 = new DHUPIIUL(var6, 2);
		}

		if (field859 != null) {
			for (int var7 = 0; var7 < field859.length; var7++) {
				var4.method205(field859[var7], field891[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("HFWXROSJ.a(II)LDHUPIIUL;")
	public final DHUPIIUL method280(int arg0) {
		if (field868 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field875[var3] && field875[var3] != 0) {
					var2 = field868[var3];
				}
			}

			if (var2 != -1) {
				return method286(var2).method280(1);
			}
		}

		DHUPIIUL var4 = DHUPIIUL.method191(field883);
		if (var4 == null) {
			return null;
		}

		if (field859 != null) {
			for (int var5 = 0; var5 < field859.length; var5++) {
				var4.method205(field859[var5], field891[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("HFWXROSJ.a(LDYBMLHQM;)V")
	public static final void method281(DYBMLHQM arg0) {
		field886 = new INLHDAGO(arg0.method248("obj.dat", null));
		INLHDAGO var1 = new INLHDAGO(arg0.method248("obj.idx", null));
		field895 = var1.method310();
		field866 = new int[field895];
		int var2 = 2;
		for (int var3 = 0; var3 < field895; var3++) {
			field866[var3] = var2;
			var2 += var1.method310();
		}

		field864 = new HFWXROSJ[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field864[var4] = new HFWXROSJ();
		}
	}

	@ObfuscatedName("HFWXROSJ.a(IIII)LXKULRNBA;")
	public static final XKULRNBA method282(int arg0, int arg1, int arg2) {
		if (arg1 == 0) {
			XKULRNBA var3 = (XKULRNBA) field867.method421(arg2);
			if (var3 != null && var3.field1366 != arg0 && var3.field1366 != -1) {
				var3.method234();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		HFWXROSJ var4 = method286(arg2);
		if (var4.field868 == null) {
			arg0 = -1;
		}

		if (arg0 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg0 >= var4.field875[var6] && var4.field875[var6] != 0) {
					var5 = var4.field868[var6];
				}
			}

			if (var5 != -1) {
				var4 = method286(var5);
			}
		}

		DHUPIIUL var7 = var4.method285(1);
		if (var7 == null) {
			return null;
		}

		XKULRNBA var8 = null;
		if (var4.field896 != -1) {
			var8 = method282(10, -1, var4.field902);
			if (var8 == null) {
				return null;
			}
		}

		XKULRNBA var9 = new XKULRNBA(32, 32);
		int var10 = DKTEWQXO.field624;
		int var11 = DKTEWQXO.field625;
		int[] var12 = DKTEWQXO.field630;
		int[] var13 = RSDCQVXF.field1192;
		int var14 = RSDCQVXF.field1193;
		int var15 = RSDCQVXF.field1194;
		int var16 = RSDCQVXF.field1197;
		int var17 = RSDCQVXF.field1198;
		int var18 = RSDCQVXF.field1195;
		int var19 = RSDCQVXF.field1196;
		DKTEWQXO.field622 = false;
		RSDCQVXF.method453(32, var9.field1360, 32);
		RSDCQVXF.method458(32, 0, 0, 0, 32);
		DKTEWQXO.method218();
		int var20 = var4.field884;
		if (arg1 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg1 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = DKTEWQXO.field628[var4.field869] * var20 >> 16;
		int var22 = DKTEWQXO.field629[var4.field869] * var20 >> 16;
		var7.method211(0, var4.field898, var4.field862, var4.field869, var4.field879, var7.field700 / 2 + var21 + var4.field863, var4.field863 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1360[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1360[var24 * 32 + var23 - 1] > 1) {
						var9.field1360[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1360[(var24 - 1) * 32 + var23] > 1) {
						var9.field1360[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1360[var24 * 32 + var23 + 1] > 1) {
						var9.field1360[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1360[(var24 + 1) * 32 + var23] > 1) {
						var9.field1360[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg1 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1360[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1360[var26 * 32 + var25 - 1] == 1) {
							var9.field1360[var26 * 32 + var25] = arg1;
						} else if (var26 > 0 && var9.field1360[(var26 - 1) * 32 + var25] == 1) {
							var9.field1360[var26 * 32 + var25] = arg1;
						} else if (var25 < 31 && var9.field1360[var26 * 32 + var25 + 1] == 1) {
							var9.field1360[var26 * 32 + var25] = arg1;
						} else if (var26 < 31 && var9.field1360[(var26 + 1) * 32 + var25] == 1) {
							var9.field1360[var26 * 32 + var25] = arg1;
						}
					}
				}
			}
		} else if (arg1 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1360[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1360[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1360[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field896 != -1) {
			int var29 = var8.field1365;
			int var30 = var8.field1366;
			var8.field1365 = 32;
			var8.field1366 = 32;
			var8.method514(0, 0);
			var8.field1365 = var29;
			var8.field1366 = var30;
		}

		if (arg1 == 0) {
			field867.method422(var9, arg2);
		}

		RSDCQVXF.method453(var14, var13, var15);
		RSDCQVXF.method455(var17, var19, var18, var16);
		DKTEWQXO.field624 = var10;
		DKTEWQXO.field625 = var11;
		DKTEWQXO.field630 = var12;
		DKTEWQXO.field622 = true;

		if (var4.field856) {
			var9.field1365 = 33;
		} else {
			var9.field1365 = 32;
		}

		var9.field1366 = arg0;
		return var9;
	}

	@ObfuscatedName("HFWXROSJ.a(IB)Z")
	public final boolean method283(int arg0) {
		int var2 = field894;
		int var3 = field874;
		int var4 = field880;
		if (arg0 == 1) {
			var2 = field903;
			var3 = field860;
			var4 = field887;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!DHUPIIUL.method192(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !DHUPIIUL.method192(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !DHUPIIUL.method192(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("HFWXROSJ.a()V")
	public final void method284() {
		field883 = 0;
		field890 = null;
		field899 = null;
		field859 = null;
		field891 = null;
		field884 = 2000;
		field869 = 0;
		field898 = 0;
		field862 = 0;
		field879 = 0;
		field863 = 0;
		field881 = -1;
		field856 = false;
		field885 = 1;
		field873 = false;
		field858 = null;
		field870 = null;
		field894 = -1;
		field874 = -1;
		field878 = 0;
		field903 = -1;
		field860 = -1;
		field861 = 0;
		field880 = -1;
		field887 = -1;
		field877 = -1;
		field900 = -1;
		field897 = -1;
		field889 = -1;
		field868 = null;
		field875 = null;
		field902 = -1;
		field896 = -1;
		field872 = 128;
		field901 = 128;
		field871 = 128;
		field882 = 0;
		field888 = 0;
		field893 = 0;
	}

	@ObfuscatedName("HFWXROSJ.a(I)LDHUPIIUL;")
	public final DHUPIIUL method285(int arg0) {
		if (field868 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field875[var3] && field875[var3] != 0) {
					var2 = field868[var3];
				}
			}

			if (var2 != -1) {
				return method286(var2).method285(1);
			}
		}

		DHUPIIUL var4 = (DHUPIIUL) field876.method421(field892);
		if (var4 != null) {
			return var4;
		}

		DHUPIIUL var5 = DHUPIIUL.method191(field883);
		if (var5 == null) {
			return null;
		}

		if (field872 != 128 || field901 != 128 || field871 != 128) {
			var5.method207(field871, field901, field872);
		}

		if (field859 != null) {
			for (int var6 = 0; var6 < field859.length; var6++) {
				var5.method205(field859[var6], field891[var6]);
			}
		}

		var5.method208(field882 + 64, field888 + 768, -50, -10, -50, true);
		var5.field577 = true;
		field876.method422(var5, field892);
		return var5;
	}

	@ObfuscatedName("HFWXROSJ.b(I)LHFWXROSJ;")
	public static final HFWXROSJ method286(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field864[var1].field892 == arg0) {
				return field864[var1];
			}
		}

		field857 = (field857 + 1) % 10;
		HFWXROSJ var2 = field864[field857];
		field886.field969 = field866[arg0];
		var2.field892 = arg0;
		var2.method284();
		var2.method277(field886);

		if (var2.field896 != -1) {
			var2.method288();
		}

		if (!field865 && var2.field873) {
			var2.field890 = "Members Object";
			var2.field899 = "Login to a members' server to use this object.".getBytes();
			var2.field858 = null;
			var2.field870 = null;
			var2.field893 = 0;
		}

		return var2;
	}

	@ObfuscatedName("HFWXROSJ.b(II)LDHUPIIUL;")
	public final DHUPIIUL method287(int arg0) {
		int var2 = field894;
		int var3 = field874;
		int var4 = field880;
		if (arg0 == 1) {
			var2 = field903;
			var3 = field860;
			var4 = field887;
		}

		if (var2 == -1) {
			return null;
		}

		DHUPIIUL var5 = DHUPIIUL.method191(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				DHUPIIUL var9 = DHUPIIUL.method191(var3);
				DHUPIIUL[] var10 = new DHUPIIUL[] { var5, var9 };
				var5 = new DHUPIIUL(var10, 2);
			} else {
				DHUPIIUL var6 = DHUPIIUL.method191(var3);
				DHUPIIUL var7 = DHUPIIUL.method191(var4);
				DHUPIIUL[] var8 = new DHUPIIUL[] { var5, var6, var7 };
				var5 = new DHUPIIUL(var8, 3);
			}
		}

		if (arg0 == 0 && field878 != 0) {
			var5.method204(0, 0, field878);
		}

		if (arg0 == 1 && field861 != 0) {
			var5.method204(0, 0, field861);
		}

		if (field859 != null) {
			for (int var11 = 0; var11 < field859.length; var11++) {
				var5.method205(field859[var11], field891[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("HFWXROSJ.c(I)V")
	public void method288() {
		HFWXROSJ var1 = method286(field896);
		field883 = var1.field883;
		field884 = var1.field884;
		field869 = var1.field869;
		field898 = var1.field898;
		field862 = var1.field862;
		field879 = var1.field879;
		field863 = var1.field863;
		field859 = var1.field859;
		field891 = var1.field891;
		HFWXROSJ var2 = method286(field902);
		field890 = var2.field890;
		field873 = var2.field873;
		field885 = var2.field885;
		String var3 = "a";
		char var4 = var2.field890.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field899 = ("Swap this note at any bank for " + var3 + " " + var2.field890 + ".").getBytes();
		field856 = true;
	}

	@ObfuscatedName("HFWXROSJ.b(IB)Z")
	public final boolean method289(int arg0) {
		int var2 = field877;
		int var3 = field900;
		if (arg0 == 1) {
			var2 = field897;
			var3 = field889;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!DHUPIIUL.method192(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !DHUPIIUL.method192(var3)) {
			var4 = false;
		}

		return var4;
	}
}
