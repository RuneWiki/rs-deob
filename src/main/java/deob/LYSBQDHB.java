package deob;

@ObfuscatedName("LYSBQDHB")
public final class LYSBQDHB {

	@ObfuscatedName("LYSBQDHB.J")
	public int field913 = -1;

	@ObfuscatedName("LYSBQDHB.j")
	public static UECXVCCS field887 = new UECXVCCS(500);

	@ObfuscatedName("LYSBQDHB.k")
	public static CADBNSXE[] field888 = new CADBNSXE[4];

	@ObfuscatedName("LYSBQDHB.q")
	public static UECXVCCS field894 = new UECXVCCS(40);

	@ObfuscatedName("LYSBQDHB.l")
	public byte field889;

	@ObfuscatedName("LYSBQDHB.S")
	public byte field920;

	@ObfuscatedName("LYSBQDHB.a")
	public static int field880;

	@ObfuscatedName("LYSBQDHB.c")
	public int field882;

	@ObfuscatedName("LYSBQDHB.d")
	public int field883;

	@ObfuscatedName("LYSBQDHB.h")
	public int field885;

	@ObfuscatedName("LYSBQDHB.i")
	public int field886;

	@ObfuscatedName("LYSBQDHB.m")
	public static int field890;

	@ObfuscatedName("LYSBQDHB.n")
	public int field891;

	@ObfuscatedName("LYSBQDHB.o")
	public int field892;

	@ObfuscatedName("LYSBQDHB.w")
	public int field900;

	@ObfuscatedName("LYSBQDHB.x")
	public int field901;

	@ObfuscatedName("LYSBQDHB.A")
	public int field904;

	@ObfuscatedName("LYSBQDHB.B")
	public int field905;

	@ObfuscatedName("LYSBQDHB.F")
	public int field909;

	@ObfuscatedName("LYSBQDHB.I")
	public int field912;

	@ObfuscatedName("LYSBQDHB.K")
	public int field914;

	@ObfuscatedName("LYSBQDHB.N")
	public int field917;

	@ObfuscatedName("LYSBQDHB.U")
	public int field922;

	@ObfuscatedName("LYSBQDHB.W")
	public int field924;

	@ObfuscatedName("LYSBQDHB.L")
	public static MLYYHULT field915;

	@ObfuscatedName("LYSBQDHB.G")
	public static client field910;

	@ObfuscatedName("LYSBQDHB.P")
	public String field918;

	@ObfuscatedName("LYSBQDHB.b")
	public boolean field881;

	@ObfuscatedName("LYSBQDHB.p")
	public static boolean field893;

	@ObfuscatedName("LYSBQDHB.t")
	public boolean field897;

	@ObfuscatedName("LYSBQDHB.y")
	public boolean field902;

	@ObfuscatedName("LYSBQDHB.C")
	public boolean field906;

	@ObfuscatedName("LYSBQDHB.D")
	public boolean field907;

	@ObfuscatedName("LYSBQDHB.E")
	public boolean field908;

	@ObfuscatedName("LYSBQDHB.M")
	public boolean field916;

	@ObfuscatedName("LYSBQDHB.T")
	public boolean field921;

	@ObfuscatedName("LYSBQDHB.V")
	public boolean field923;

	@ObfuscatedName("LYSBQDHB.X")
	public boolean field925;

	@ObfuscatedName("LYSBQDHB.z")
	public byte[] field903;

	@ObfuscatedName("LYSBQDHB.r")
	public int[] field895;

	@ObfuscatedName("LYSBQDHB.s")
	public static int[] field896;

	@ObfuscatedName("LYSBQDHB.v")
	public int[] field899;

	@ObfuscatedName("LYSBQDHB.H")
	public int[] field911;

	@ObfuscatedName("LYSBQDHB.R")
	public int[] field919;

	@ObfuscatedName("LYSBQDHB.Y")
	public int[] field926;

	@ObfuscatedName("LYSBQDHB.g")
	public static LYSBQDHB[] field884;

	@ObfuscatedName("LYSBQDHB.u")
	public String[] field898;

	@ObfuscatedName("LYSBQDHB.a(II)Z")
	public final boolean method273(int arg0) {
		if (field899 != null) {
			for (int var4 = 0; var4 < field899.length; var4++) {
				if (field899[var4] == arg0) {
					return CADBNSXE.method12(field926[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field926 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field926.length; var3++) {
				var2 &= CADBNSXE.method12(field926[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("LYSBQDHB.a(LGWOEELWB;)V")
	public static final void method274(GWOEELWB arg0) {
		field915 = new MLYYHULT(arg0.method249("loc.dat", null));
		MLYYHULT var1 = new MLYYHULT(arg0.method249("loc.idx", null));
		field890 = var1.method298();
		field896 = new int[field890];
		int var2 = 2;
		for (int var3 = 0; var3 < field890; var3++) {
			field896[var3] = var2;
			var2 += var1.method298();
		}

		field884 = new LYSBQDHB[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field884[var4] = new LYSBQDHB();
		}
	}

	@ObfuscatedName("LYSBQDHB.a()V")
	public final void method275() {
		field926 = null;
		field899 = null;
		field918 = null;
		field903 = null;
		field895 = null;
		field919 = null;
		field882 = 1;
		field891 = 1;
		field908 = true;
		field923 = true;
		field881 = false;
		field925 = false;
		field916 = false;
		field897 = false;
		field883 = -1;
		field900 = 16;
		field920 = 0;
		field889 = 0;
		field898 = null;
		field886 = -1;
		field917 = -1;
		field921 = false;
		field902 = true;
		field924 = 128;
		field905 = 128;
		field885 = 128;
		field892 = 0;
		field912 = 0;
		field914 = 0;
		field922 = 0;
		field906 = false;
		field907 = false;
		field904 = -1;
		field909 = -1;
		field901 = -1;
		field911 = null;
	}

	@ObfuscatedName("LYSBQDHB.a(Z)Z")
	public final boolean method276() {
		if (field926 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field926.length; var2++) {
			var1 &= CADBNSXE.method12(field926[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("LYSBQDHB.a(IIII)LCADBNSXE;")
	public final CADBNSXE method277(int arg0, int arg1, int arg2) {
		CADBNSXE var4 = null;
		long var5;
		if (field899 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field913 << 6) + arg2);
			CADBNSXE var7 = (CADBNSXE) field894.method538(var5);
			if (var7 != null) {
				return var7;
			}

			if (field926 == null) {
				return null;
			}

			boolean var8 = field921 ^ arg2 > 3;
			int var9 = field926.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field926[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (CADBNSXE) field887.method538(var11);
				if (var4 == null) {
					var4 = CADBNSXE.method11(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method26();
					}

					field887.method539(var4, var11);
				}

				if (var9 > 1) {
					field888[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new CADBNSXE(field888, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field899.length; var13++) {
				if (field899[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field913 << 6) + (var12 << 3) + arg2);
			CADBNSXE var14 = (CADBNSXE) field894.method538(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field926[var12];
			boolean var16 = field921 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (CADBNSXE) field887.method538(var15);
			if (var4 == null) {
				var4 = CADBNSXE.method11(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method26();
				}

				field887.method539(var4, var15);
			}
		}

		boolean var17;
		if (field924 == 128 && field905 == 128 && field885 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field912 == 0 && field914 == 0 && field922 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		CADBNSXE var19 = new CADBNSXE(arg2 == 0 && arg0 == -1 && !var17 && !var18, DFGNFGZH.method215(arg0), var4, field895 == null);
		if (arg0 != -1) {
			var19.method18();
			var19.method19(arg0);
			var19.field48 = null;
			var19.field47 = null;
		}

		while (arg2-- > 0) {
			var19.method22();
		}

		if (field895 != null) {
			for (int var20 = 0; var20 < field895.length; var20++) {
				var19.method25(field895[var20], field919[var20]);
			}
		}

		if (var17) {
			var19.method27(field885, field905, field924);
		}

		if (var18) {
			var19.method24(field914, field922, field912);
		}

		var19.method28(field920 + 64, field889 * 5 + 768, -50, -10, -50, !field916);

		if (field904 == 1) {
			var19.field44 = var19.field852;
		}

		field894.method539(var19, var5);
		return var19;
	}

	@ObfuscatedName("LYSBQDHB.a(B)LLYSBQDHB;")
	public final LYSBQDHB method278() {
		int var1 = -1;
		if (field909 != -1) {
			WOJPETNO var2 = WOJPETNO.field1422[field909];
			int var3 = var2.field1424;
			int var4 = var2.field1425;
			int var5 = var2.field1426;
			int var6 = client.field144[var5 - var4];
			var1 = field910.field262[var3] >> var4 & var6;
		} else if (field901 != -1) {
			var1 = field910.field262[field901];
		}

		if (var1 >= 0 && var1 < field911.length && field911[var1] != -1) {
			return method282(field911[var1]);
		}

		return null;
	}

	@ObfuscatedName("LYSBQDHB.a(LMLYYHULT;B)V")
	public final void method279(MLYYHULT arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method296();
					if (var3 == 0) {
						if (var2 == -1) {
							field881 = false;
							if (field926 != null && (field899 == null || field899[0] == 10)) {
								field881 = true;
							}

							if (field898 != null) {
								field881 = true;
							}
						}

						if (field907) {
							field908 = false;
							field923 = false;
						}

						if (field904 == -1) {
							field904 = field908 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field918 = arg0.method303();
					} else if (var3 == 3) {
						field903 = arg0.method304();
					} else if (var3 == 5) {
						int var6 = arg0.method296();
						if (var6 > 0) {
							if (field926 == null || field893) {
								field899 = null;
								field926 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field926[var7] = arg0.method298();
								}
							} else {
								arg0.field963 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field882 = arg0.method296();
					} else if (var3 == 15) {
						field891 = arg0.method296();
					} else if (var3 == 17) {
						field908 = false;
					} else if (var3 == 18) {
						field923 = false;
					} else if (var3 == 19) {
						var2 = arg0.method296();
						if (var2 == 1) {
							field881 = true;
						}
					} else if (var3 == 21) {
						field925 = true;
					} else if (var3 == 22) {
						field916 = true;
					} else if (var3 == 23) {
						field897 = true;
					} else if (var3 == 24) {
						field883 = arg0.method298();
						if (field883 == 0xFFFF) {
							field883 = -1;
						}
					} else if (var3 == 28) {
						field900 = arg0.method296();
					} else if (var3 == 29) {
						field920 = arg0.method297();
					} else if (var3 == 39) {
						field889 = arg0.method297();
					} else if (var3 >= 30 && var3 < 39) {
						if (field898 == null) {
							field898 = new String[5];
						}

						field898[var3 - 30] = arg0.method303();
						if (field898[var3 - 30].equalsIgnoreCase("hidden")) {
							field898[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method296();
						field895 = new int[var8];
						field919 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field895[var9] = arg0.method298();
							field919[var9] = arg0.method298();
						}
					} else if (var3 == 60) {
						field886 = arg0.method298();
					} else if (var3 == 62) {
						field921 = true;
					} else if (var3 == 64) {
						field902 = false;
					} else if (var3 == 65) {
						field924 = arg0.method298();
					} else if (var3 == 66) {
						field905 = arg0.method298();
					} else if (var3 == 67) {
						field885 = arg0.method298();
					} else if (var3 == 68) {
						field917 = arg0.method298();
					} else if (var3 == 69) {
						field892 = arg0.method296();
					} else if (var3 == 70) {
						field912 = arg0.method299();
					} else if (var3 == 71) {
						field914 = arg0.method299();
					} else if (var3 == 72) {
						field922 = arg0.method299();
					} else if (var3 == 73) {
						field906 = true;
					} else if (var3 == 74) {
						field907 = true;
					} else if (var3 == 75) {
						field904 = arg0.method296();
					} else if (var3 == 77) {
						field909 = arg0.method298();
						if (field909 == 0xFFFF) {
							field909 = -1;
						}

						field901 = arg0.method298();
						if (field901 == 0xFFFF) {
							field901 = -1;
						}

						int var10 = arg0.method296();
						field911 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field911[var11] = arg0.method298();
							if (field911[var11] == 0xFFFF) {
								field911[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method296();
			} while (var4 <= 0);

			if (field926 == null || field893) {
				field899 = new int[var4];
				field926 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field926[var5] = arg0.method298();
					field899[var5] = arg0.method296();
				}
			} else {
				arg0.field963 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("LYSBQDHB.a(LFJSXIAWX;I)V")
	public final void method280(FJSXIAWX arg0) {
		if (field926 != null) {
			for (int var2 = 0; var2 < field926.length; var2++) {
				arg0.method230(0, field926[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("LYSBQDHB.a(I)V")
	public static final void method281() {
		field887 = null;
		field894 = null;
		field896 = null;
		field884 = null;
		field915 = null;
	}

	@ObfuscatedName("LYSBQDHB.b(I)LLYSBQDHB;")
	public static final LYSBQDHB method282(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field884[var1].field913 == arg0) {
				return field884[var1];
			}
		}

		field880 = (field880 + 1) % 20;
		LYSBQDHB var2 = field884[field880];
		field915.field963 = field896[arg0];
		var2.field913 = arg0;
		var2.method275();
		var2.method279(field915);
		return var2;
	}

	@ObfuscatedName("LYSBQDHB.a(IIIIIII)LCADBNSXE;")
	public final CADBNSXE method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		CADBNSXE var8 = method277(arg6, arg0, arg1);
		if (var8 == null) {
			return null;
		}

		if (field925 || field916) {
			var8 = new CADBNSXE(field916, var8, field925);
		}

		if (field925) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field17; var10++) {
				int var11 = var8.field18[var10];
				int var12 = var8.field20[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field19[var10] += var15 - var9;
			}

			var8.method16();
		}

		return var8;
	}
}
