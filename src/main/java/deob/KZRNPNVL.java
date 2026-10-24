package deob;

@ObfuscatedName("KZRNPNVL")
public final class KZRNPNVL {

	@ObfuscatedName("KZRNPNVL.s")
	public int field962 = -1;

	@ObfuscatedName("KZRNPNVL.n")
	public static JETHVCIV field957 = new JETHVCIV(30);

	@ObfuscatedName("KZRNPNVL.q")
	public static JLNSJQDR[] field960 = new JLNSJQDR[4];

	@ObfuscatedName("KZRNPNVL.L")
	public static JETHVCIV field980 = new JETHVCIV(500);

	@ObfuscatedName("KZRNPNVL.M")
	public byte field981;

	@ObfuscatedName("KZRNPNVL.N")
	public byte field982;

	@ObfuscatedName("KZRNPNVL.b")
	public int field946;

	@ObfuscatedName("KZRNPNVL.h")
	public int field951;

	@ObfuscatedName("KZRNPNVL.i")
	public int field952;

	@ObfuscatedName("KZRNPNVL.j")
	public int field953;

	@ObfuscatedName("KZRNPNVL.p")
	public int field959;

	@ObfuscatedName("KZRNPNVL.r")
	public int field961;

	@ObfuscatedName("KZRNPNVL.u")
	public int field963;

	@ObfuscatedName("KZRNPNVL.v")
	public int field964;

	@ObfuscatedName("KZRNPNVL.y")
	public int field967;

	@ObfuscatedName("KZRNPNVL.z")
	public int field968;

	@ObfuscatedName("KZRNPNVL.A")
	public int field969;

	@ObfuscatedName("KZRNPNVL.F")
	public int field974;

	@ObfuscatedName("KZRNPNVL.H")
	public static int field976;

	@ObfuscatedName("KZRNPNVL.O")
	public int field983;

	@ObfuscatedName("KZRNPNVL.Q")
	public int field985;

	@ObfuscatedName("KZRNPNVL.R")
	public int field986;

	@ObfuscatedName("KZRNPNVL.S")
	public int field987;

	@ObfuscatedName("KZRNPNVL.V")
	public static int field990;

	@ObfuscatedName("KZRNPNVL.G")
	public static BJPWOXRJ field975;

	@ObfuscatedName("KZRNPNVL.K")
	public static client field979;

	@ObfuscatedName("KZRNPNVL.D")
	public String field972;

	@ObfuscatedName("KZRNPNVL.d")
	public boolean field947;

	@ObfuscatedName("KZRNPNVL.e")
	public boolean field948;

	@ObfuscatedName("KZRNPNVL.k")
	public boolean field954;

	@ObfuscatedName("KZRNPNVL.l")
	public boolean field955;

	@ObfuscatedName("KZRNPNVL.m")
	public boolean field956;

	@ObfuscatedName("KZRNPNVL.w")
	public boolean field965;

	@ObfuscatedName("KZRNPNVL.x")
	public boolean field966;

	@ObfuscatedName("KZRNPNVL.E")
	public static boolean field973;

	@ObfuscatedName("KZRNPNVL.I")
	public boolean field977;

	@ObfuscatedName("KZRNPNVL.J")
	public boolean field978;

	@ObfuscatedName("KZRNPNVL.W")
	public boolean field991;

	@ObfuscatedName("KZRNPNVL.C")
	public byte[] field971;

	@ObfuscatedName("KZRNPNVL.a")
	public int[] field945;

	@ObfuscatedName("KZRNPNVL.f")
	public int[] field949;

	@ObfuscatedName("KZRNPNVL.o")
	public static int[] field958;

	@ObfuscatedName("KZRNPNVL.B")
	public int[] field970;

	@ObfuscatedName("KZRNPNVL.P")
	public int[] field984;

	@ObfuscatedName("KZRNPNVL.U")
	public int[] field989;

	@ObfuscatedName("KZRNPNVL.T")
	public static KZRNPNVL[] field988;

	@ObfuscatedName("KZRNPNVL.g")
	public String[] field950;

	@ObfuscatedName("KZRNPNVL.a(I)LKZRNPNVL;")
	public final KZRNPNVL method397() {
		int var1 = -1;
		if (field963 != -1) {
			BUYMNSFH var2 = BUYMNSFH.field20[field963];
			int var3 = var2.field22;
			int var4 = var2.field23;
			int var5 = var2.field24;
			int var6 = client.field123[var5 - var4];
			var1 = field979.field41[var3] >> var4 & var6;
		} else if (field951 != -1) {
			var1 = field979.field41[field951];
		}

		if (var1 >= 0 && var1 < field945.length && field945[var1] != -1) {
			return method401(field945[var1]);
		}

		return null;
	}

	@ObfuscatedName("KZRNPNVL.a(BIII)LJLNSJQDR;")
	public final JLNSJQDR method398(int arg0, int arg1, int arg2) {
		JLNSJQDR var4 = null;
		long var5;
		if (field984 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field962 << 6) + arg1);
			JLNSJQDR var7 = (JLNSJQDR) field957.method315(var5);
			if (var7 != null) {
				return var7;
			}

			if (field970 == null) {
				return null;
			}

			boolean var8 = field947 ^ arg1 > 3;
			int var9 = field970.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field970[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (JLNSJQDR) field980.method315(var11);
				if (var4 == null) {
					var4 = JLNSJQDR.method328(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method343();
					}

					field980.method316(var4, var11);
				}

				if (var9 > 1) {
					field960[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new JLNSJQDR(var9, field960);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field984.length; var13++) {
				if (field984[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field962 << 6) + (var12 << 3) + arg1);
			JLNSJQDR var14 = (JLNSJQDR) field957.method315(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field970[var12];
			boolean var16 = field947 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (JLNSJQDR) field980.method315(var15);
			if (var4 == null) {
				var4 = JLNSJQDR.method328(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method343();
				}

				field980.method316(var4, var15);
			}
		}

		boolean var17;
		if (field952 == 128 && field985 == 128 && field959 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field961 == 0 && field969 == 0 && field953 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		JLNSJQDR var19 = new JLNSJQDR(UIZESDZR.method524(arg2), arg1 == 0 && arg2 == -1 && !var17 && !var18, field989 == null, var4);
		if (arg2 != -1) {
			var19.method335();
			var19.method336(arg2);
			var19.field854 = null;
			var19.field853 = null;
		}

		while (arg1-- > 0) {
			var19.method339();
		}

		if (field989 != null) {
			for (int var20 = 0; var20 < field989.length; var20++) {
				var19.method342(field989[var20], field949[var20]);
			}
		}

		if (var17) {
			var19.method344(field959, field985, field952);
		}

		if (var18) {
			var19.method341(field969, field953, field961);
		}

		var19.method345(field982 + 64, field981 * 5 + 768, -50, -10, -50, !field978);

		if (field986 == 1) {
			var19.field850 = var19.field3;
		}

		field957.method316(var19, var5);
		return var19;
	}

	@ObfuscatedName("KZRNPNVL.a(B)V")
	public static final void method399() {
		field980 = null;
		field957 = null;
		field958 = null;
		field988 = null;
		field975 = null;
	}

	@ObfuscatedName("KZRNPNVL.a(ILBJPWOXRJ;)V")
	public final void method400(BJPWOXRJ arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method15();
					if (var3 == 0) {
						if (var2 == -1) {
							field955 = false;
							if (field970 != null && (field984 == null || field984[0] == 10)) {
								field955 = true;
							}

							if (field950 != null) {
								field955 = true;
							}
						}

						if (field956) {
							field965 = false;
							field966 = false;
						}

						if (field986 == -1) {
							field986 = field965 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field972 = arg0.method22();
					} else if (var3 == 3) {
						field971 = arg0.method23();
					} else if (var3 == 5) {
						int var6 = arg0.method15();
						if (var6 > 0) {
							if (field970 == null || field973) {
								field984 = null;
								field970 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field970[var7] = arg0.method17();
								}
							} else {
								arg0.field5 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field946 = arg0.method15();
					} else if (var3 == 15) {
						field974 = arg0.method15();
					} else if (var3 == 17) {
						field965 = false;
					} else if (var3 == 18) {
						field966 = false;
					} else if (var3 == 19) {
						var2 = arg0.method15();
						if (var2 == 1) {
							field955 = true;
						}
					} else if (var3 == 21) {
						field948 = true;
					} else if (var3 == 22) {
						field978 = true;
					} else if (var3 == 23) {
						field977 = true;
					} else if (var3 == 24) {
						field967 = arg0.method17();
						if (field967 == 0xFFFF) {
							field967 = -1;
						}
					} else if (var3 == 28) {
						field987 = arg0.method15();
					} else if (var3 == 29) {
						field982 = arg0.method16();
					} else if (var3 == 39) {
						field981 = arg0.method16();
					} else if (var3 >= 30 && var3 < 39) {
						if (field950 == null) {
							field950 = new String[5];
						}

						field950[var3 - 30] = arg0.method22();
						if (field950[var3 - 30].equalsIgnoreCase("hidden")) {
							field950[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method15();
						field989 = new int[var8];
						field949 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field989[var9] = arg0.method17();
							field949[var9] = arg0.method17();
						}
					} else if (var3 == 60) {
						field968 = arg0.method17();
					} else if (var3 == 62) {
						field947 = true;
					} else if (var3 == 64) {
						field991 = false;
					} else if (var3 == 65) {
						field952 = arg0.method17();
					} else if (var3 == 66) {
						field985 = arg0.method17();
					} else if (var3 == 67) {
						field959 = arg0.method17();
					} else if (var3 == 68) {
						field983 = arg0.method17();
					} else if (var3 == 69) {
						field964 = arg0.method15();
					} else if (var3 == 70) {
						field961 = arg0.method18();
					} else if (var3 == 71) {
						field969 = arg0.method18();
					} else if (var3 == 72) {
						field953 = arg0.method18();
					} else if (var3 == 73) {
						field954 = true;
					} else if (var3 == 74) {
						field956 = true;
					} else if (var3 == 75) {
						field986 = arg0.method15();
					} else if (var3 == 77) {
						field963 = arg0.method17();
						if (field963 == 0xFFFF) {
							field963 = -1;
						}

						field951 = arg0.method17();
						if (field951 == 0xFFFF) {
							field951 = -1;
						}

						int var10 = arg0.method15();
						field945 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field945[var11] = arg0.method17();
							if (field945[var11] == 0xFFFF) {
								field945[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method15();
			} while (var4 <= 0);

			if (field970 == null || field973) {
				field984 = new int[var4];
				field970 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field970[var5] = arg0.method17();
					field984[var5] = arg0.method15();
				}
			} else {
				arg0.field5 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("KZRNPNVL.b(I)LKZRNPNVL;")
	public static final KZRNPNVL method401(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field988[var1].field962 == arg0) {
				return field988[var1];
			}
		}

		field990 = (field990 + 1) % 20;
		KZRNPNVL var2 = field988[field990];
		field975.field5 = field958[arg0];
		var2.field962 = arg0;
		var2.method407();
		var2.method400(field975);
		return var2;
	}

	@ObfuscatedName("KZRNPNVL.a(LFHVZVKRA;Z)V")
	public final void method402(FHVZVKRA arg0) {
		if (field970 != null) {
			for (int var2 = 0; var2 < field970.length; var2++) {
				arg0.method183(field970[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("KZRNPNVL.a(II)Z")
	public final boolean method403(int arg0) {
		if (field984 != null) {
			for (int var4 = 0; var4 < field984.length; var4++) {
				if (field984[var4] == arg0) {
					return JLNSJQDR.method329(field970[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field970 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field970.length; var3++) {
				var2 &= JLNSJQDR.method329(field970[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("KZRNPNVL.a(LMNPBQFWE;)V")
	public static final void method404(MNPBQFWE arg0) {
		field975 = new BJPWOXRJ(arg0.method429("loc.dat", null));
		BJPWOXRJ var1 = new BJPWOXRJ(arg0.method429("loc.idx", null));
		field976 = var1.method17();
		field958 = new int[field976];
		int var2 = 2;
		for (int var3 = 0; var3 < field976; var3++) {
			field958[var3] = var2;
			var2 += var1.method17();
		}

		field988 = new KZRNPNVL[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field988[var4] = new KZRNPNVL();
		}
	}

	@ObfuscatedName("KZRNPNVL.c(I)Z")
	public final boolean method405() {
		if (field970 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field970.length; var2++) {
			var1 &= JLNSJQDR.method329(field970[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("KZRNPNVL.a(IIIIIII)LJLNSJQDR;")
	public final JLNSJQDR method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		JLNSJQDR var8 = method398(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field948 || field978) {
			var8 = new JLNSJQDR(field978, var8, field948);
		}

		if (field948) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field822; var10++) {
				int var11 = var8.field823[var10];
				int var12 = var8.field825[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field824[var10] += var15 - var9;
			}

			var8.method333();
		}

		return var8;
	}

	@ObfuscatedName("KZRNPNVL.a()V")
	public final void method407() {
		field970 = null;
		field984 = null;
		field972 = null;
		field971 = null;
		field989 = null;
		field949 = null;
		field946 = 1;
		field974 = 1;
		field965 = true;
		field966 = true;
		field955 = false;
		field948 = false;
		field978 = false;
		field977 = false;
		field967 = -1;
		field987 = 16;
		field982 = 0;
		field981 = 0;
		field950 = null;
		field968 = -1;
		field983 = -1;
		field947 = false;
		field991 = true;
		field952 = 128;
		field985 = 128;
		field959 = 128;
		field964 = 0;
		field961 = 0;
		field969 = 0;
		field953 = 0;
		field954 = false;
		field956 = false;
		field986 = -1;
		field963 = -1;
		field951 = -1;
		field945 = null;
	}
}
