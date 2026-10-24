package deob;

@ObfuscatedName("PZZVQRQI")
public final class PZZVQRQI {

	@ObfuscatedName("PZZVQRQI.E")
	public int field927 = -1;

	@ObfuscatedName("PZZVQRQI.j")
	public static YABPKWWG[] field907 = new YABPKWWG[4];

	@ObfuscatedName("PZZVQRQI.v")
	public static WMYPWVZI field918 = new WMYPWVZI(500);

	@ObfuscatedName("PZZVQRQI.B")
	public static WMYPWVZI field924 = new WMYPWVZI(30);

	@ObfuscatedName("PZZVQRQI.f")
	public byte field903;

	@ObfuscatedName("PZZVQRQI.x")
	public byte field920;

	@ObfuscatedName("PZZVQRQI.a")
	public int field899;

	@ObfuscatedName("PZZVQRQI.g")
	public int field904;

	@ObfuscatedName("PZZVQRQI.i")
	public int field906;

	@ObfuscatedName("PZZVQRQI.m")
	public int field910;

	@ObfuscatedName("PZZVQRQI.n")
	public int field911;

	@ObfuscatedName("PZZVQRQI.p")
	public int field913;

	@ObfuscatedName("PZZVQRQI.q")
	public int field914;

	@ObfuscatedName("PZZVQRQI.y")
	public static int field921;

	@ObfuscatedName("PZZVQRQI.G")
	public int field929;

	@ObfuscatedName("PZZVQRQI.I")
	public int field931;

	@ObfuscatedName("PZZVQRQI.K")
	public static int field933;

	@ObfuscatedName("PZZVQRQI.L")
	public int field934;

	@ObfuscatedName("PZZVQRQI.M")
	public int field935;

	@ObfuscatedName("PZZVQRQI.Q")
	public int field939;

	@ObfuscatedName("PZZVQRQI.S")
	public int field941;

	@ObfuscatedName("PZZVQRQI.T")
	public int field942;

	@ObfuscatedName("PZZVQRQI.V")
	public int field944;

	@ObfuscatedName("PZZVQRQI.W")
	public int field945;

	@ObfuscatedName("PZZVQRQI.c")
	public static IMUIZRAF field901;

	@ObfuscatedName("PZZVQRQI.J")
	public static client field932;

	@ObfuscatedName("PZZVQRQI.H")
	public String field930;

	@ObfuscatedName("PZZVQRQI.b")
	public static boolean field900;

	@ObfuscatedName("PZZVQRQI.e")
	public boolean field902;

	@ObfuscatedName("PZZVQRQI.h")
	public boolean field905;

	@ObfuscatedName("PZZVQRQI.o")
	public boolean field912;

	@ObfuscatedName("PZZVQRQI.A")
	public boolean field923;

	@ObfuscatedName("PZZVQRQI.C")
	public boolean field925;

	@ObfuscatedName("PZZVQRQI.F")
	public boolean field928;

	@ObfuscatedName("PZZVQRQI.N")
	public boolean field936;

	@ObfuscatedName("PZZVQRQI.O")
	public boolean field937;

	@ObfuscatedName("PZZVQRQI.R")
	public boolean field940;

	@ObfuscatedName("PZZVQRQI.U")
	public boolean field943;

	@ObfuscatedName("PZZVQRQI.z")
	public byte[] field922;

	@ObfuscatedName("PZZVQRQI.k")
	public int[] field908;

	@ObfuscatedName("PZZVQRQI.l")
	public static int[] field909;

	@ObfuscatedName("PZZVQRQI.s")
	public int[] field915;

	@ObfuscatedName("PZZVQRQI.t")
	public int[] field916;

	@ObfuscatedName("PZZVQRQI.u")
	public int[] field917;

	@ObfuscatedName("PZZVQRQI.w")
	public int[] field919;

	@ObfuscatedName("PZZVQRQI.P")
	public static PZZVQRQI[] field938;

	@ObfuscatedName("PZZVQRQI.D")
	public String[] field926;

	@ObfuscatedName("PZZVQRQI.a()V")
	public final void method395() {
		field908 = null;
		field919 = null;
		field930 = null;
		field922 = null;
		field917 = null;
		field916 = null;
		field939 = 1;
		field913 = 1;
		field943 = true;
		field936 = true;
		field928 = false;
		field905 = false;
		field940 = false;
		field937 = false;
		field899 = -1;
		field911 = 16;
		field920 = 0;
		field903 = 0;
		field926 = null;
		field944 = -1;
		field935 = -1;
		field912 = false;
		field923 = true;
		field914 = 128;
		field942 = 128;
		field929 = 128;
		field910 = 0;
		field906 = 0;
		field941 = 0;
		field945 = 0;
		field925 = false;
		field902 = false;
		field931 = -1;
		field904 = -1;
		field934 = -1;
		field915 = null;
	}

	@ObfuscatedName("PZZVQRQI.a(LTDBJVJCU;B)V")
	public final void method396(TDBJVJCU arg0) {
		if (field908 != null) {
			for (int var2 = 0; var2 < field908.length; var2++) {
				arg0.method477(field908[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("PZZVQRQI.a(II)Z")
	public final boolean method397(int arg0) {
		if (field919 != null) {
			for (int var4 = 0; var4 < field919.length; var4++) {
				if (field919[var4] == arg0) {
					return YABPKWWG.method549(field908[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field908 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field908.length; var3++) {
				var2 &= YABPKWWG.method549(field908[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("PZZVQRQI.a(I)LPZZVQRQI;")
	public static final PZZVQRQI method398(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field938[var1].field927 == arg0) {
				return field938[var1];
			}
		}

		field921 = (field921 + 1) % 20;
		PZZVQRQI var2 = field938[field921];
		field901.field714 = field909[arg0];
		var2.field927 = arg0;
		var2.method395();
		var2.method404(field901);
		return var2;
	}

	@ObfuscatedName("PZZVQRQI.b(I)V")
	public static final void method399() {
		field918 = null;
		field924 = null;
		field909 = null;
		field938 = null;
		field901 = null;
	}

	@ObfuscatedName("PZZVQRQI.a(LBYZSQZUF;)V")
	public static final void method400(BYZSQZUF arg0) {
		field901 = new IMUIZRAF(arg0.method29("loc.dat", null));
		IMUIZRAF var1 = new IMUIZRAF(arg0.method29("loc.idx", null));
		field933 = var1.method240();
		field909 = new int[field933];
		int var2 = 2;
		for (int var3 = 0; var3 < field933; var3++) {
			field909[var3] = var2;
			var2 += var1.method240();
		}

		field938 = new PZZVQRQI[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field938[var4] = new PZZVQRQI();
		}
	}

	@ObfuscatedName("PZZVQRQI.a(Z)Z")
	public final boolean method401() {
		if (field908 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field908.length; var2++) {
			var1 &= YABPKWWG.method549(field908[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("PZZVQRQI.c(I)LPZZVQRQI;")
	public final PZZVQRQI method402() {
		int var1 = -1;
		if (field904 != -1) {
			AFWJXAMU var2 = AFWJXAMU.field10[field904];
			int var3 = var2.field12;
			int var4 = var2.field13;
			int var5 = var2.field14;
			int var6 = client.field259[var5 - var4];
			var1 = field932.field187[var3] >> var4 & var6;
		} else if (field934 != -1) {
			var1 = field932.field187[field934];
		}

		if (var1 >= 0 && var1 < field915.length && field915[var1] != -1) {
			return method398(field915[var1]);
		}

		return null;
	}

	@ObfuscatedName("PZZVQRQI.a(IIII)LYABPKWWG;")
	public final YABPKWWG method403(int arg0, int arg1, int arg2) {
		YABPKWWG var4 = null;
		long var5;
		if (field919 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field927 << 6) + arg1);
			YABPKWWG var7 = (YABPKWWG) field924.method525(var5);
			if (var7 != null) {
				return var7;
			}

			if (field908 == null) {
				return null;
			}

			boolean var8 = field912 ^ arg1 > 3;
			int var9 = field908.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field908[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (YABPKWWG) field918.method525(var11);
				if (var4 == null) {
					var4 = YABPKWWG.method548(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method563();
					}

					field918.method526(var11, var4);
				}

				if (var9 > 1) {
					field907[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new YABPKWWG(field907, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field919.length; var13++) {
				if (field919[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field927 << 6) + (var12 << 3) + arg1);
			YABPKWWG var14 = (YABPKWWG) field924.method525(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field908[var12];
			boolean var16 = field912 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (YABPKWWG) field918.method525(var15);
			if (var4 == null) {
				var4 = YABPKWWG.method548(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method563();
				}

				field918.method526(var15, var4);
			}
		}

		boolean var17;
		if (field914 == 128 && field942 == 128 && field929 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field906 == 0 && field941 == 0 && field945 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		YABPKWWG var19 = new YABPKWWG(var4, HQHBJEDA.method219(arg2), field917 == null, arg1 == 0 && arg2 == -1 && !var17 && !var18);
		if (arg2 != -1) {
			var19.method555();
			var19.method556(arg2);
			var19.field1415 = null;
			var19.field1414 = null;
		}

		while (arg1-- > 0) {
			var19.method559();
		}

		if (field917 != null) {
			for (int var20 = 0; var20 < field917.length; var20++) {
				var19.method562(field917[var20], field916[var20]);
			}
		}

		if (var17) {
			var19.method564(field942, field929, field914);
		}

		if (var18) {
			var19.method561(field945, field906, field941);
		}

		var19.method565(field920 + 64, field903 * 5 + 768, -50, -10, -50, !field940);

		if (field931 == 1) {
			var19.field1411 = var19.field28;
		}

		field924.method526(var5, var19);
		return var19;
	}

	@ObfuscatedName("PZZVQRQI.a(ILIMUIZRAF;)V")
	public final void method404(IMUIZRAF arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method238();
					if (var3 == 0) {
						if (var2 == -1) {
							field928 = false;
							if (field908 != null && (field919 == null || field919[0] == 10)) {
								field928 = true;
							}

							if (field926 != null) {
								field928 = true;
							}
						}

						if (field902) {
							field943 = false;
							field936 = false;
						}

						if (field931 == -1) {
							field931 = field943 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field930 = arg0.method245();
					} else if (var3 == 3) {
						field922 = arg0.method246();
					} else if (var3 == 5) {
						int var6 = arg0.method238();
						if (var6 > 0) {
							if (field908 == null || field900) {
								field919 = null;
								field908 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field908[var7] = arg0.method240();
								}
							} else {
								arg0.field714 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field939 = arg0.method238();
					} else if (var3 == 15) {
						field913 = arg0.method238();
					} else if (var3 == 17) {
						field943 = false;
					} else if (var3 == 18) {
						field936 = false;
					} else if (var3 == 19) {
						var2 = arg0.method238();
						if (var2 == 1) {
							field928 = true;
						}
					} else if (var3 == 21) {
						field905 = true;
					} else if (var3 == 22) {
						field940 = true;
					} else if (var3 == 23) {
						field937 = true;
					} else if (var3 == 24) {
						field899 = arg0.method240();
						if (field899 == 0xFFFF) {
							field899 = -1;
						}
					} else if (var3 == 28) {
						field911 = arg0.method238();
					} else if (var3 == 29) {
						field920 = arg0.method239();
					} else if (var3 == 39) {
						field903 = arg0.method239();
					} else if (var3 >= 30 && var3 < 39) {
						if (field926 == null) {
							field926 = new String[5];
						}

						field926[var3 - 30] = arg0.method245();
						if (field926[var3 - 30].equalsIgnoreCase("hidden")) {
							field926[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method238();
						field917 = new int[var8];
						field916 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field917[var9] = arg0.method240();
							field916[var9] = arg0.method240();
						}
					} else if (var3 == 60) {
						field944 = arg0.method240();
					} else if (var3 == 62) {
						field912 = true;
					} else if (var3 == 64) {
						field923 = false;
					} else if (var3 == 65) {
						field914 = arg0.method240();
					} else if (var3 == 66) {
						field942 = arg0.method240();
					} else if (var3 == 67) {
						field929 = arg0.method240();
					} else if (var3 == 68) {
						field935 = arg0.method240();
					} else if (var3 == 69) {
						field910 = arg0.method238();
					} else if (var3 == 70) {
						field906 = arg0.method241();
					} else if (var3 == 71) {
						field941 = arg0.method241();
					} else if (var3 == 72) {
						field945 = arg0.method241();
					} else if (var3 == 73) {
						field925 = true;
					} else if (var3 == 74) {
						field902 = true;
					} else if (var3 == 75) {
						field931 = arg0.method238();
					} else if (var3 == 77) {
						field904 = arg0.method240();
						if (field904 == 0xFFFF) {
							field904 = -1;
						}

						field934 = arg0.method240();
						if (field934 == 0xFFFF) {
							field934 = -1;
						}

						int var10 = arg0.method238();
						field915 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field915[var11] = arg0.method240();
							if (field915[var11] == 0xFFFF) {
								field915[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method238();
			} while (var4 <= 0);

			if (field908 == null || field900) {
				field919 = new int[var4];
				field908 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field908[var5] = arg0.method240();
					field919[var5] = arg0.method238();
				}
			} else {
				arg0.field714 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("PZZVQRQI.a(IIIIIII)LYABPKWWG;")
	public final YABPKWWG method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		YABPKWWG var8 = method403(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field905 || field940) {
			var8 = new YABPKWWG(field905, var8, field940);
		}

		if (field905) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1383; var10++) {
				int var11 = var8.field1384[var10];
				int var12 = var8.field1386[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1385[var10] += var15 - var9;
			}

			var8.method553();
		}

		return var8;
	}
}
