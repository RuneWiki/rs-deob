package deob;

@ObfuscatedName("NNGZIOFO")
public final class NNGZIOFO {

	@ObfuscatedName("NNGZIOFO.R")
	public int field1004 = -1;

	@ObfuscatedName("NNGZIOFO.g")
	public static ISXEOURU field971 = new ISXEOURU(30);

	@ObfuscatedName("NNGZIOFO.m")
	public static CCYECDYX[] field976 = new CCYECDYX[4];

	@ObfuscatedName("NNGZIOFO.Q")
	public static ISXEOURU field1003 = new ISXEOURU(500);

	@ObfuscatedName("NNGZIOFO.O")
	public byte field1001;

	@ObfuscatedName("NNGZIOFO.i")
	public byte field973;

	@ObfuscatedName("NNGZIOFO.S")
	public static int field1005;

	@ObfuscatedName("NNGZIOFO.T")
	public int field1006;

	@ObfuscatedName("NNGZIOFO.V")
	public int field1008;

	@ObfuscatedName("NNGZIOFO.Z")
	public int field1012;

	@ObfuscatedName("NNGZIOFO.a")
	public int field966;

	@ObfuscatedName("NNGZIOFO.c")
	public int field967;

	@ObfuscatedName("NNGZIOFO.d")
	public int field968;

	@ObfuscatedName("NNGZIOFO.e")
	public int field969;

	@ObfuscatedName("NNGZIOFO.o")
	public int field977;

	@ObfuscatedName("NNGZIOFO.p")
	public int field978;

	@ObfuscatedName("NNGZIOFO.s")
	public int field981;

	@ObfuscatedName("NNGZIOFO.u")
	public int field983;

	@ObfuscatedName("NNGZIOFO.v")
	public static int field984;

	@ObfuscatedName("NNGZIOFO.B")
	public int field989;

	@ObfuscatedName("NNGZIOFO.D")
	public int field991;

	@ObfuscatedName("NNGZIOFO.H")
	public int field995;

	@ObfuscatedName("NNGZIOFO.K")
	public int field997;

	@ObfuscatedName("NNGZIOFO.L")
	public int field998;

	@ObfuscatedName("NNGZIOFO.Y")
	public static ZOMNSJJM field1011;

	@ObfuscatedName("NNGZIOFO.E")
	public static client field992;

	@ObfuscatedName("NNGZIOFO.q")
	public String field979;

	@ObfuscatedName("NNGZIOFO.W")
	public boolean field1009;

	@ObfuscatedName("NNGZIOFO.X")
	public boolean field1010;

	@ObfuscatedName("NNGZIOFO.f")
	public boolean field970;

	@ObfuscatedName("NNGZIOFO.k")
	public boolean field974;

	@ObfuscatedName("NNGZIOFO.l")
	public boolean field975;

	@ObfuscatedName("NNGZIOFO.r")
	public boolean field980;

	@ObfuscatedName("NNGZIOFO.A")
	public boolean field988;

	@ObfuscatedName("NNGZIOFO.F")
	public static boolean field993;

	@ObfuscatedName("NNGZIOFO.G")
	public boolean field994;

	@ObfuscatedName("NNGZIOFO.J")
	public boolean field996;

	@ObfuscatedName("NNGZIOFO.M")
	public boolean field999;

	@ObfuscatedName("NNGZIOFO.w")
	public byte[] field985;

	@ObfuscatedName("NNGZIOFO.N")
	public int[] field1000;

	@ObfuscatedName("NNGZIOFO.U")
	public static int[] field1007;

	@ObfuscatedName("NNGZIOFO.h")
	public int[] field972;

	@ObfuscatedName("NNGZIOFO.t")
	public int[] field982;

	@ObfuscatedName("NNGZIOFO.y")
	public int[] field986;

	@ObfuscatedName("NNGZIOFO.z")
	public int[] field987;

	@ObfuscatedName("NNGZIOFO.P")
	public static NNGZIOFO[] field1002;

	@ObfuscatedName("NNGZIOFO.C")
	public String[] field990;

	@ObfuscatedName("NNGZIOFO.a(I)Z")
	public final boolean method343() {
		if (field986 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field986.length; var2++) {
			var1 &= CCYECDYX.method12(field986[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("NNGZIOFO.a(IIIIIII)LCCYECDYX;")
	public final CCYECDYX method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		CCYECDYX var8 = method353(arg1, arg0, arg6);
		if (var8 == null) {
			return null;
		}

		if (field996 || field999) {
			var8 = new CCYECDYX(field999, var8, field996);
		}

		if (field996) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field27; var10++) {
				int var11 = var8.field28[var10];
				int var12 = var8.field30[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field29[var10] += var15 - var9;
			}

			var8.method16();
		}

		return var8;
	}

	@ObfuscatedName("NNGZIOFO.b(I)LNNGZIOFO;")
	public final NNGZIOFO method345() {
		int var1 = -1;
		if (field991 != -1) {
			DUFZKGOK var2 = DUFZKGOK.field719[field991];
			int var3 = var2.field721;
			int var4 = var2.field722;
			int var5 = var2.field723;
			int var6 = client.field365[var5 - var4];
			var1 = field992.field476[var3] >> var4 & var6;
		} else if (field997 != -1) {
			var1 = field992.field476[field997];
		}

		if (var1 >= 0 && var1 < field1000.length && field1000[var1] != -1) {
			return method350(field1000[var1]);
		}

		return null;
	}

	@ObfuscatedName("NNGZIOFO.a(LLYZBHNJP;)V")
	public static final void method346(LYZBHNJP arg0) {
		field1011 = new ZOMNSJJM(arg0.method290("loc.dat", null));
		ZOMNSJJM var1 = new ZOMNSJJM(arg0.method290("loc.idx", null));
		field984 = var1.method549();
		field1007 = new int[field984];
		int var2 = 2;
		for (int var3 = 0; var3 < field984; var3++) {
			field1007[var3] = var2;
			var2 += var1.method549();
		}

		field1002 = new NNGZIOFO[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1002[var4] = new NNGZIOFO();
		}
	}

	@ObfuscatedName("NNGZIOFO.a(B)V")
	public static final void method347() {
		field1003 = null;
		field971 = null;
		field1007 = null;
		field1002 = null;
		field1011 = null;
	}

	@ObfuscatedName("NNGZIOFO.a(LZOMNSJJM;B)V")
	public final void method348(ZOMNSJJM arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method547();
					if (var3 == 0) {
						if (var2 == -1) {
							field994 = false;
							if (field986 != null && (field987 == null || field987[0] == 10)) {
								field994 = true;
							}

							if (field990 != null) {
								field994 = true;
							}
						}

						if (field974) {
							field975 = false;
							field1009 = false;
						}

						if (field978 == -1) {
							field978 = field975 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field979 = arg0.method554();
					} else if (var3 == 3) {
						field985 = arg0.method555();
					} else if (var3 == 5) {
						int var6 = arg0.method547();
						if (var6 > 0) {
							if (field986 == null || field993) {
								field987 = null;
								field986 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field986[var7] = arg0.method549();
								}
							} else {
								arg0.field1457 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field966 = arg0.method547();
					} else if (var3 == 15) {
						field983 = arg0.method547();
					} else if (var3 == 17) {
						field975 = false;
					} else if (var3 == 18) {
						field1009 = false;
					} else if (var3 == 19) {
						var2 = arg0.method547();
						if (var2 == 1) {
							field994 = true;
						}
					} else if (var3 == 21) {
						field996 = true;
					} else if (var3 == 22) {
						field999 = true;
					} else if (var3 == 23) {
						field1010 = true;
					} else if (var3 == 24) {
						field981 = arg0.method549();
						if (field981 == 0xFFFF) {
							field981 = -1;
						}
					} else if (var3 == 28) {
						field1012 = arg0.method547();
					} else if (var3 == 29) {
						field1001 = arg0.method548();
					} else if (var3 == 39) {
						field973 = arg0.method548();
					} else if (var3 >= 30 && var3 < 39) {
						if (field990 == null) {
							field990 = new String[5];
						}

						field990[var3 - 30] = arg0.method554();
						if (field990[var3 - 30].equalsIgnoreCase("hidden")) {
							field990[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method547();
						field972 = new int[var8];
						field982 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field972[var9] = arg0.method549();
							field982[var9] = arg0.method549();
						}
					} else if (var3 == 60) {
						field1006 = arg0.method549();
					} else if (var3 == 62) {
						field970 = true;
					} else if (var3 == 64) {
						field988 = false;
					} else if (var3 == 65) {
						field1008 = arg0.method549();
					} else if (var3 == 66) {
						field998 = arg0.method549();
					} else if (var3 == 67) {
						field977 = arg0.method549();
					} else if (var3 == 68) {
						field989 = arg0.method549();
					} else if (var3 == 69) {
						field969 = arg0.method547();
					} else if (var3 == 70) {
						field967 = arg0.method550();
					} else if (var3 == 71) {
						field995 = arg0.method550();
					} else if (var3 == 72) {
						field968 = arg0.method550();
					} else if (var3 == 73) {
						field980 = true;
					} else if (var3 == 74) {
						field974 = true;
					} else if (var3 == 75) {
						field978 = arg0.method547();
					} else if (var3 == 77) {
						field991 = arg0.method549();
						if (field991 == 0xFFFF) {
							field991 = -1;
						}

						field997 = arg0.method549();
						if (field997 == 0xFFFF) {
							field997 = -1;
						}

						int var10 = arg0.method547();
						field1000 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1000[var11] = arg0.method549();
							if (field1000[var11] == 0xFFFF) {
								field1000[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method547();
			} while (var4 <= 0);

			if (field986 == null || field993) {
				field987 = new int[var4];
				field986 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field986[var5] = arg0.method549();
					field987[var5] = arg0.method547();
				}
			} else {
				arg0.field1457 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("NNGZIOFO.a(IB)Z")
	public final boolean method349(int arg0) {
		if (field987 != null) {
			for (int var4 = 0; var4 < field987.length; var4++) {
				if (field987[var4] == arg0) {
					return CCYECDYX.method12(field986[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field986 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field986.length; var3++) {
				var2 &= CCYECDYX.method12(field986[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("NNGZIOFO.c(I)LNNGZIOFO;")
	public static final NNGZIOFO method350(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1002[var1].field1004 == arg0) {
				return field1002[var1];
			}
		}

		field1005 = (field1005 + 1) % 20;
		NNGZIOFO var2 = field1002[field1005];
		field1011.field1457 = field1007[arg0];
		var2.field1004 = arg0;
		var2.method351();
		var2.method348(field1011);
		return var2;
	}

	@ObfuscatedName("NNGZIOFO.a()V")
	public final void method351() {
		field986 = null;
		field987 = null;
		field979 = null;
		field985 = null;
		field972 = null;
		field982 = null;
		field966 = 1;
		field983 = 1;
		field975 = true;
		field1009 = true;
		field994 = false;
		field996 = false;
		field999 = false;
		field1010 = false;
		field981 = -1;
		field1012 = 16;
		field1001 = 0;
		field973 = 0;
		field990 = null;
		field1006 = -1;
		field989 = -1;
		field970 = false;
		field988 = true;
		field1008 = 128;
		field998 = 128;
		field977 = 128;
		field969 = 0;
		field967 = 0;
		field995 = 0;
		field968 = 0;
		field980 = false;
		field974 = false;
		field978 = -1;
		field991 = -1;
		field997 = -1;
		field1000 = null;
	}

	@ObfuscatedName("NNGZIOFO.a(LSMQPXRFY;B)V")
	public final void method352(SMQPXRFY arg0) {
		if (field986 != null) {
			for (int var2 = 0; var2 < field986.length; var2++) {
				arg0.method390(field986[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("NNGZIOFO.a(IIII)LCCYECDYX;")
	public final CCYECDYX method353(int arg0, int arg1, int arg2) {
		CCYECDYX var4 = null;
		long var5;
		if (field987 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1004 << 6) + arg0);
			CCYECDYX var7 = (CCYECDYX) field971.method228(var5);
			if (var7 != null) {
				return var7;
			}

			if (field986 == null) {
				return null;
			}

			boolean var8 = field970 ^ arg0 > 3;
			int var9 = field986.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field986[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (CCYECDYX) field1003.method228(var11);
				if (var4 == null) {
					var4 = CCYECDYX.method11(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method26();
					}

					field1003.method229(var11, var4);
				}

				if (var9 > 1) {
					field976[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new CCYECDYX(field976, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field987.length; var13++) {
				if (field987[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1004 << 6) + (var12 << 3) + arg0);
			CCYECDYX var14 = (CCYECDYX) field971.method228(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field986[var12];
			boolean var16 = field970 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (CCYECDYX) field1003.method228(var15);
			if (var4 == null) {
				var4 = CCYECDYX.method11(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method26();
				}

				field1003.method229(var15, var4);
			}
		}

		boolean var17;
		if (field1008 == 128 && field998 == 128 && field977 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field967 == 0 && field995 == 0 && field968 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		CCYECDYX var19 = new CCYECDYX(RKTGZGSS.method383(arg2), var4, arg0 == 0 && arg2 == -1 && !var17 && !var18, field972 == null);
		if (arg2 != -1) {
			var19.method18();
			var19.method19(arg2);
			var19.field59 = null;
			var19.field58 = null;
		}

		while (arg0-- > 0) {
			var19.method22();
		}

		if (field972 != null) {
			for (int var20 = 0; var20 < field972.length; var20++) {
				var19.method25(field972[var20], field982[var20]);
			}
		}

		if (var17) {
			var19.method27(field1008, field998, field977);
		}

		if (var18) {
			var19.method24(field967, field968, field995);
		}

		var19.method28(field1001 + 64, field973 * 5 + 768, -50, -10, -50, !field999);

		if (field978 == 1) {
			var19.field55 = var19.field1289;
		}

		field971.method229(var5, var19);
		return var19;
	}
}
