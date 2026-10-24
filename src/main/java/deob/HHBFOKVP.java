package deob;

@ObfuscatedName("HHBFOKVP")
public final class HHBFOKVP {

	@ObfuscatedName("HHBFOKVP.O")
	public int field979 = -1;

	@ObfuscatedName("HHBFOKVP.n")
	public static boolean field953 = true;

	@ObfuscatedName("HHBFOKVP.v")
	public static LSUWSJDO field961 = new LSUWSJDO(50);

	@ObfuscatedName("HHBFOKVP.Q")
	public static LSUWSJDO field981 = new LSUWSJDO(100);

	@ObfuscatedName("HHBFOKVP.w")
	public byte field962;

	@ObfuscatedName("HHBFOKVP.N")
	public byte field978;

	@ObfuscatedName("HHBFOKVP.a")
	public static int field941;

	@ObfuscatedName("HHBFOKVP.d")
	public int field944;

	@ObfuscatedName("HHBFOKVP.e")
	public int field945;

	@ObfuscatedName("HHBFOKVP.g")
	public int field946;

	@ObfuscatedName("HHBFOKVP.j")
	public int field949;

	@ObfuscatedName("HHBFOKVP.k")
	public int field950;

	@ObfuscatedName("HHBFOKVP.m")
	public int field952;

	@ObfuscatedName("HHBFOKVP.o")
	public static int field954;

	@ObfuscatedName("HHBFOKVP.p")
	public int field955;

	@ObfuscatedName("HHBFOKVP.r")
	public int field957;

	@ObfuscatedName("HHBFOKVP.s")
	public int field958;

	@ObfuscatedName("HHBFOKVP.t")
	public int field959;

	@ObfuscatedName("HHBFOKVP.u")
	public int field960;

	@ObfuscatedName("HHBFOKVP.y")
	public int field964;

	@ObfuscatedName("HHBFOKVP.z")
	public int field965;

	@ObfuscatedName("HHBFOKVP.A")
	public int field966;

	@ObfuscatedName("HHBFOKVP.B")
	public int field967;

	@ObfuscatedName("HHBFOKVP.C")
	public int field968;

	@ObfuscatedName("HHBFOKVP.F")
	public int field971;

	@ObfuscatedName("HHBFOKVP.G")
	public int field972;

	@ObfuscatedName("HHBFOKVP.J")
	public int field974;

	@ObfuscatedName("HHBFOKVP.L")
	public int field976;

	@ObfuscatedName("HHBFOKVP.P")
	public int field980;

	@ObfuscatedName("HHBFOKVP.R")
	public int field982;

	@ObfuscatedName("HHBFOKVP.T")
	public int field983;

	@ObfuscatedName("HHBFOKVP.W")
	public int field984;

	@ObfuscatedName("HHBFOKVP.X")
	public int field985;

	@ObfuscatedName("HHBFOKVP.Y")
	public int field986;

	@ObfuscatedName("HHBFOKVP.ab")
	public int field988;

	@ObfuscatedName("HHBFOKVP.h")
	public static LZWRHABP field947;

	@ObfuscatedName("HHBFOKVP.q")
	public String field956;

	@ObfuscatedName("HHBFOKVP.b")
	public boolean field942;

	@ObfuscatedName("HHBFOKVP.c")
	public boolean field943;

	@ObfuscatedName("HHBFOKVP.E")
	public byte[] field970;

	@ObfuscatedName("HHBFOKVP.l")
	public int[] field951;

	@ObfuscatedName("HHBFOKVP.D")
	public int[] field969;

	@ObfuscatedName("HHBFOKVP.I")
	public static int[] field973;

	@ObfuscatedName("HHBFOKVP.K")
	public int[] field975;

	@ObfuscatedName("HHBFOKVP.Z")
	public int[] field987;

	@ObfuscatedName("HHBFOKVP.M")
	public static HHBFOKVP[] field977;

	@ObfuscatedName("HHBFOKVP.i")
	public String[] field948;

	@ObfuscatedName("HHBFOKVP.x")
	public String[] field963;

	@ObfuscatedName("HHBFOKVP.a(ZLLZWRHABP;)V")
	public final void method358(LZWRHABP arg0) {
		while (true) {
			int var2 = arg0.method463();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field980 = arg0.method465();
			} else if (var2 == 2) {
				field956 = arg0.method470();
			} else if (var2 == 3) {
				field970 = arg0.method471();
			} else if (var2 == 4) {
				field988 = arg0.method465();
			} else if (var2 == 5) {
				field965 = arg0.method465();
			} else if (var2 == 6) {
				field960 = arg0.method465();
			} else if (var2 == 7) {
				field958 = arg0.method465();
				if (field958 > 32767) {
					field958 -= 0x10000;
				}
			} else if (var2 == 8) {
				field945 = arg0.method465();
				if (field945 > 32767) {
					field945 -= 0x10000;
				}
			} else if (var2 == 10) {
				field976 = arg0.method465();
			} else if (var2 == 11) {
				field943 = true;
			} else if (var2 == 12) {
				field982 = arg0.method468();
			} else if (var2 == 16) {
				field942 = true;
			} else if (var2 == 23) {
				field968 = arg0.method465();
				field978 = arg0.method464();
			} else if (var2 == 24) {
				field983 = arg0.method465();
			} else if (var2 == 25) {
				field952 = arg0.method465();
				field962 = arg0.method464();
			} else if (var2 == 26) {
				field946 = arg0.method465();
			} else if (var2 >= 30 && var2 < 35) {
				if (field963 == null) {
					field963 = new String[5];
				}

				field963[var2 - 30] = arg0.method470();
				if (field963[var2 - 30].equalsIgnoreCase("hidden")) {
					field963[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field948 == null) {
					field948 = new String[5];
				}

				field948[var2 - 35] = arg0.method470();
			} else if (var2 == 40) {
				int var3 = arg0.method463();
				field975 = new int[var3];
				field969 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field975[var4] = arg0.method465();
					field969[var4] = arg0.method465();
				}
			} else if (var2 == 78) {
				field959 = arg0.method465();
			} else if (var2 == 79) {
				field971 = arg0.method465();
			} else if (var2 == 90) {
				field955 = arg0.method465();
			} else if (var2 == 91) {
				field966 = arg0.method465();
			} else if (var2 == 92) {
				field957 = arg0.method465();
			} else if (var2 == 93) {
				field964 = arg0.method465();
			} else if (var2 == 95) {
				field949 = arg0.method465();
			} else if (var2 == 97) {
				field984 = arg0.method465();
			} else if (var2 == 98) {
				field944 = arg0.method465();
			} else if (var2 >= 100 && var2 < 110) {
				if (field987 == null) {
					field987 = new int[10];
					field951 = new int[10];
				}

				field987[var2 - 100] = arg0.method465();
				field951[var2 - 100] = arg0.method465();
			} else if (var2 == 110) {
				field967 = arg0.method465();
			} else if (var2 == 111) {
				field972 = arg0.method465();
			} else if (var2 == 112) {
				field974 = arg0.method465();
			} else if (var2 == 113) {
				field986 = arg0.method464();
			} else if (var2 == 114) {
				field985 = arg0.method464() * 5;
			} else if (var2 == 115) {
				field950 = arg0.method463();
			}
		}
	}

	@ObfuscatedName("HHBFOKVP.a()V")
	public final void method359() {
		field980 = 0;
		field956 = null;
		field970 = null;
		field975 = null;
		field969 = null;
		field988 = 2000;
		field965 = 0;
		field960 = 0;
		field949 = 0;
		field958 = 0;
		field945 = 0;
		field976 = -1;
		field943 = false;
		field982 = 1;
		field942 = false;
		field963 = null;
		field948 = null;
		field968 = -1;
		field983 = -1;
		field978 = 0;
		field952 = -1;
		field946 = -1;
		field962 = 0;
		field959 = -1;
		field971 = -1;
		field955 = -1;
		field957 = -1;
		field966 = -1;
		field964 = -1;
		field987 = null;
		field951 = null;
		field984 = -1;
		field944 = -1;
		field967 = 128;
		field972 = 128;
		field974 = 128;
		field986 = 0;
		field985 = 0;
		field950 = 0;
	}

	@ObfuscatedName("HHBFOKVP.a(II)LLSSDQDBV;")
	public final LSSDQDBV method360(int arg0) {
		int var2 = field968;
		int var3 = field983;
		int var4 = field959;
		if (arg0 == 1) {
			var2 = field952;
			var3 = field946;
			var4 = field971;
		}

		if (var2 == -1) {
			return null;
		}

		LSSDQDBV var5 = LSSDQDBV.method423(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				LSSDQDBV var9 = LSSDQDBV.method423(var3);
				LSSDQDBV[] var10 = new LSSDQDBV[] { var5, var9 };
				var5 = new LSSDQDBV(var10, 2);
			} else {
				LSSDQDBV var6 = LSSDQDBV.method423(var3);
				LSSDQDBV var7 = LSSDQDBV.method423(var4);
				LSSDQDBV[] var8 = new LSSDQDBV[] { var5, var6, var7 };
				var5 = new LSSDQDBV(var8, 3);
			}
		}

		if (arg0 == 0 && field978 != 0) {
			var5.method436(0, 0, field978);
		}

		if (arg0 == 1 && field962 != 0) {
			var5.method436(0, 0, field962);
		}

		if (field975 != null) {
			for (int var11 = 0; var11 < field975.length; var11++) {
				var5.method437(field975[var11], field969[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("HHBFOKVP.a(BI)Z")
	public final boolean method361(int arg0) {
		int var2 = field968;
		int var3 = field983;
		int var4 = field959;
		if (arg0 == 1) {
			var2 = field952;
			var3 = field946;
			var4 = field971;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!LSSDQDBV.method424(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !LSSDQDBV.method424(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !LSSDQDBV.method424(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("HHBFOKVP.a(B)V")
	public static final void method362() {
		field961 = null;
		field981 = null;
		field973 = null;
		field977 = null;
		field947 = null;
	}

	@ObfuscatedName("HHBFOKVP.a(I)LLSSDQDBV;")
	public final LSSDQDBV method363(int arg0) {
		if (field987 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field951[var3] && field951[var3] != 0) {
					var2 = field987[var3];
				}
			}

			if (var2 != -1) {
				return method367(var2).method363(1);
			}
		}

		LSSDQDBV var4 = (LSSDQDBV) field961.method448(field979);
		if (var4 != null) {
			return var4;
		}

		LSSDQDBV var5 = LSSDQDBV.method423(field980);
		if (var5 == null) {
			return null;
		}

		if (field967 != 128 || field972 != 128 || field974 != 128) {
			var5.method439(field972, field974, field967);
		}

		if (field975 != null) {
			for (int var6 = 0; var6 < field975.length; var6++) {
				var5.method437(field975[var6], field969[var6]);
			}
		}

		var5.method440(field986 + 64, field985 + 768, -50, -10, -50, true);
		var5.field1097 = true;
		field961.method449(var5, field979);
		return var5;
	}

	@ObfuscatedName("HHBFOKVP.b(II)LLSSDQDBV;")
	public final LSSDQDBV method364(int arg0) {
		int var2 = field955;
		int var3 = field957;
		if (arg0 == 1) {
			var2 = field966;
			var3 = field964;
		}

		if (var2 == -1) {
			return null;
		}

		LSSDQDBV var4 = LSSDQDBV.method423(var2);
		if (var3 != -1) {
			LSSDQDBV var5 = LSSDQDBV.method423(var3);
			LSSDQDBV[] var6 = new LSSDQDBV[] { var4, var5 };
			var4 = new LSSDQDBV(var6, 2);
		}

		if (field975 != null) {
			for (int var7 = 0; var7 < field975.length; var7++) {
				var4.method437(field975[var7], field969[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("HHBFOKVP.b(BI)Z")
	public final boolean method365(int arg0) {
		int var2 = field955;
		int var3 = field957;
		if (arg0 == 1) {
			var2 = field966;
			var3 = field964;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!LSSDQDBV.method424(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !LSSDQDBV.method424(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("HHBFOKVP.b(B)V")
	public void method366() {
		HHBFOKVP var1 = method367(field944);
		field980 = var1.field980;
		field988 = var1.field988;
		field965 = var1.field965;
		field960 = var1.field960;
		field949 = var1.field949;
		field958 = var1.field958;
		field945 = var1.field945;
		field975 = var1.field975;
		field969 = var1.field969;
		HHBFOKVP var2 = method367(field984);
		field956 = var2.field956;
		field942 = var2.field942;
		field982 = var2.field982;
		String var3 = "a";
		char var4 = var2.field956.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field970 = ("Swap this note at any bank for " + var3 + " " + var2.field956 + ".").getBytes();
		field943 = true;
	}

	@ObfuscatedName("HHBFOKVP.b(I)LHHBFOKVP;")
	public static final HHBFOKVP method367(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field977[var1].field979 == arg0) {
				return field977[var1];
			}
		}

		field954 = (field954 + 1) % 10;
		HHBFOKVP var2 = field977[field954];
		field947.field1139 = field973[arg0];
		var2.field979 = arg0;
		var2.method359();
		var2.method358(field947);

		if (var2.field944 != -1) {
			var2.method366();
		}

		if (!field953 && var2.field942) {
			var2.field956 = "Members Object";
			var2.field970 = "Login to a members' server to use this object.".getBytes();
			var2.field963 = null;
			var2.field948 = null;
			var2.field950 = 0;
		}

		return var2;
	}

	@ObfuscatedName("HHBFOKVP.a(IIII)LINRTBCYJ;")
	public static final INRTBCYJ method368(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			INRTBCYJ var3 = (INRTBCYJ) field981.method448(arg1);
			if (var3 != null && var3.field1017 != arg2 && var3.field1017 != -1) {
				var3.method579();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		HHBFOKVP var4 = method367(arg1);
		if (var4.field987 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field951[var6] && var4.field951[var6] != 0) {
					var5 = var4.field987[var6];
				}
			}

			if (var5 != -1) {
				var4 = method367(var5);
			}
		}

		LSSDQDBV var7 = var4.method363(1);
		if (var7 == null) {
			return null;
		}

		INRTBCYJ var8 = null;
		if (var4.field944 != -1) {
			var8 = method368(-1, var4.field984, 10);
			if (var8 == null) {
				return null;
			}
		}

		INRTBCYJ var9 = new INRTBCYJ(32, 32);
		int var10 = GAGDRMEJ.field809;
		int var11 = GAGDRMEJ.field810;
		int[] var12 = GAGDRMEJ.field815;
		int[] var13 = CYEOWDOP.field638;
		int var14 = CYEOWDOP.field639;
		int var15 = CYEOWDOP.field640;
		int var16 = CYEOWDOP.field643;
		int var17 = CYEOWDOP.field644;
		int var18 = CYEOWDOP.field641;
		int var19 = CYEOWDOP.field642;
		GAGDRMEJ.field807 = false;
		CYEOWDOP.method224(32, 32, var9.field1011);
		CYEOWDOP.method229(0, 32, 0, 0, 32);
		GAGDRMEJ.method326();
		int var20 = var4.field988;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = GAGDRMEJ.field813[var4.field965] * var20 >> 16;
		int var22 = GAGDRMEJ.field814[var4.field965] * var20 >> 16;
		var7.method443(0, var4.field960, var4.field949, var4.field965, var4.field958, var7.field7 / 2 + var21 + var4.field945, var4.field945 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field1011[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field1011[var24 * 32 + var23 - 1] > 1) {
						var9.field1011[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field1011[(var24 - 1) * 32 + var23] > 1) {
						var9.field1011[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field1011[var24 * 32 + var23 + 1] > 1) {
						var9.field1011[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field1011[(var24 + 1) * 32 + var23] > 1) {
						var9.field1011[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field1011[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field1011[var26 * 32 + var25 - 1] == 1) {
							var9.field1011[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field1011[(var26 - 1) * 32 + var25] == 1) {
							var9.field1011[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field1011[var26 * 32 + var25 + 1] == 1) {
							var9.field1011[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field1011[(var26 + 1) * 32 + var25] == 1) {
							var9.field1011[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field1011[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field1011[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field1011[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field944 != -1) {
			int var29 = var8.field1016;
			int var30 = var8.field1017;
			var8.field1016 = 32;
			var8.field1017 = 32;
			var8.method387(0, 0);
			var8.field1016 = var29;
			var8.field1017 = var30;
		}

		if (arg0 == 0) {
			field981.method449(var9, arg1);
		}

		CYEOWDOP.method224(var15, var14, var13);
		CYEOWDOP.method226(var17, var18, var19, var16);
		GAGDRMEJ.field809 = var10;
		GAGDRMEJ.field810 = var11;
		GAGDRMEJ.field815 = var12;
		GAGDRMEJ.field807 = true;

		if (var4.field943) {
			var9.field1016 = 33;
		} else {
			var9.field1016 = 32;
		}

		var9.field1017 = arg2;
		return var9;
	}

	@ObfuscatedName("HHBFOKVP.a(LSRZUEVOD;)V")
	public static final void method369(SRZUEVOD arg0) {
		field947 = new LZWRHABP(arg0.method566("obj.dat", null));
		LZWRHABP var1 = new LZWRHABP(arg0.method566("obj.idx", null));
		field941 = var1.method465();
		field973 = new int[field941];
		int var2 = 2;
		for (int var3 = 0; var3 < field941; var3++) {
			field973[var3] = var2;
			var2 += var1.method465();
		}

		field977 = new HHBFOKVP[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field977[var4] = new HHBFOKVP();
		}
	}

	@ObfuscatedName("HHBFOKVP.c(II)LLSSDQDBV;")
	public final LSSDQDBV method370(int arg0) {
		if (field987 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field951[var3] && field951[var3] != 0) {
					var2 = field987[var3];
				}
			}

			if (var2 != -1) {
				return method367(var2).method370(1);
			}
		}

		LSSDQDBV var4 = LSSDQDBV.method423(field980);
		if (var4 == null) {
			return null;
		}

		if (field975 != null) {
			for (int var5 = 0; var5 < field975.length; var5++) {
				var4.method437(field975[var5], field969[var5]);
			}
		}

		return var4;
	}
}
