package deob;

@ObfuscatedName("PFIKHQJO")
public final class PFIKHQJO {

	@ObfuscatedName("PFIKHQJO.z")
	public int field980 = -1;

	@ObfuscatedName("PFIKHQJO.a")
	public static NJPATAFL[] field956 = new NJPATAFL[4];

	@ObfuscatedName("PFIKHQJO.e")
	public static RUNMBJUO field960 = new RUNMBJUO(500);

	@ObfuscatedName("PFIKHQJO.g")
	public static RUNMBJUO field962 = new RUNMBJUO(30);

	@ObfuscatedName("PFIKHQJO.O")
	public byte field993;

	@ObfuscatedName("PFIKHQJO.P")
	public byte field994;

	@ObfuscatedName("PFIKHQJO.V")
	public int field1000;

	@ObfuscatedName("PFIKHQJO.c")
	public int field958;

	@ObfuscatedName("PFIKHQJO.d")
	public int field959;

	@ObfuscatedName("PFIKHQJO.k")
	public int field966;

	@ObfuscatedName("PFIKHQJO.m")
	public int field968;

	@ObfuscatedName("PFIKHQJO.n")
	public static int field969;

	@ObfuscatedName("PFIKHQJO.p")
	public int field971;

	@ObfuscatedName("PFIKHQJO.u")
	public int field975;

	@ObfuscatedName("PFIKHQJO.v")
	public int field976;

	@ObfuscatedName("PFIKHQJO.w")
	public int field977;

	@ObfuscatedName("PFIKHQJO.F")
	public int field985;

	@ObfuscatedName("PFIKHQJO.J")
	public int field989;

	@ObfuscatedName("PFIKHQJO.K")
	public int field990;

	@ObfuscatedName("PFIKHQJO.L")
	public static int field991;

	@ObfuscatedName("PFIKHQJO.Q")
	public int field995;

	@ObfuscatedName("PFIKHQJO.S")
	public int field997;

	@ObfuscatedName("PFIKHQJO.T")
	public int field998;

	@ObfuscatedName("PFIKHQJO.U")
	public int field999;

	@ObfuscatedName("PFIKHQJO.x")
	public static MUKVLYLC field978;

	@ObfuscatedName("PFIKHQJO.H")
	public static client field987;

	@ObfuscatedName("PFIKHQJO.G")
	public String field986;

	@ObfuscatedName("PFIKHQJO.W")
	public boolean field1001;

	@ObfuscatedName("PFIKHQJO.i")
	public boolean field964;

	@ObfuscatedName("PFIKHQJO.o")
	public boolean field970;

	@ObfuscatedName("PFIKHQJO.q")
	public boolean field972;

	@ObfuscatedName("PFIKHQJO.r")
	public boolean field973;

	@ObfuscatedName("PFIKHQJO.t")
	public boolean field974;

	@ObfuscatedName("PFIKHQJO.B")
	public boolean field981;

	@ObfuscatedName("PFIKHQJO.C")
	public static boolean field982;

	@ObfuscatedName("PFIKHQJO.D")
	public boolean field983;

	@ObfuscatedName("PFIKHQJO.I")
	public boolean field988;

	@ObfuscatedName("PFIKHQJO.M")
	public boolean field992;

	@ObfuscatedName("PFIKHQJO.f")
	public byte[] field961;

	@ObfuscatedName("PFIKHQJO.Y")
	public static int[] field1002;

	@ObfuscatedName("PFIKHQJO.b")
	public int[] field957;

	@ObfuscatedName("PFIKHQJO.j")
	public int[] field965;

	@ObfuscatedName("PFIKHQJO.l")
	public int[] field967;

	@ObfuscatedName("PFIKHQJO.y")
	public int[] field979;

	@ObfuscatedName("PFIKHQJO.E")
	public int[] field984;

	@ObfuscatedName("PFIKHQJO.h")
	public static PFIKHQJO[] field963;

	@ObfuscatedName("PFIKHQJO.R")
	public String[] field996;

	@ObfuscatedName("PFIKHQJO.a(IB)Z")
	public final boolean method401(int arg0) {
		if (field979 != null) {
			for (int var4 = 0; var4 < field979.length; var4++) {
				if (field979[var4] == arg0) {
					return NJPATAFL.method335(field984[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field984 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field984.length; var3++) {
				var2 &= NJPATAFL.method335(field984[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("PFIKHQJO.a(IIII)LNJPATAFL;")
	public final NJPATAFL method402(int arg0, int arg1, int arg2) {
		NJPATAFL var4 = null;
		long var5;
		if (field979 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field980 << 6) + arg0);
			NJPATAFL var7 = (NJPATAFL) field962.method450(var5);
			if (var7 != null) {
				return var7;
			}

			if (field984 == null) {
				return null;
			}

			boolean var8 = field981 ^ arg0 > 3;
			int var9 = field984.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field984[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (NJPATAFL) field960.method450(var11);
				if (var4 == null) {
					var4 = NJPATAFL.method334(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method349();
					}

					field960.method451(var11, var4);
				}

				if (var9 > 1) {
					field956[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new NJPATAFL(field956, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field979.length; var13++) {
				if (field979[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field980 << 6) + (var12 << 3) + arg0);
			NJPATAFL var14 = (NJPATAFL) field962.method450(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field984[var12];
			boolean var16 = field981 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (NJPATAFL) field960.method450(var15);
			if (var4 == null) {
				var4 = NJPATAFL.method334(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method349();
				}

				field960.method451(var15, var4);
			}
		}

		boolean var17;
		if (field971 == 128 && field968 == 128 && field990 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field958 == 0 && field975 == 0 && field1000 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		NJPATAFL var19 = new NJPATAFL(TDFMBTLA.method491(arg1), arg0 == 0 && arg1 == -1 && !var17 && !var18, field957 == null, var4);
		if (arg1 != -1) {
			var19.method341();
			var19.method342(arg1);
			var19.field874 = null;
			var19.field873 = null;
		}

		while (arg0-- > 0) {
			var19.method345();
		}

		if (field957 != null) {
			for (int var20 = 0; var20 < field957.length; var20++) {
				var19.method348(field957[var20], field967[var20]);
			}
		}

		if (var17) {
			var19.method350(field971, field990, field968);
		}

		if (var18) {
			var19.method347(field1000, field958, field975);
		}

		var19.method351(field993 + 64, field994 * 5 + 768, -50, -10, -50, !field973);

		if (field998 == 1) {
			var19.field870 = var19.field771;
		}

		field962.method451(var5, var19);
		return var19;
	}

	@ObfuscatedName("PFIKHQJO.a(I)LPFIKHQJO;")
	public final PFIKHQJO method403() {
		int var1 = -1;
		if (field997 != -1) {
			FTZZSWCP var2 = FTZZSWCP.field640[field997];
			int var3 = var2.field642;
			int var4 = var2.field643;
			int var5 = var2.field644;
			int var6 = client.field114[var5 - var4];
			var1 = field987.field230[var3] >> var4 & var6;
		} else if (field989 != -1) {
			var1 = field987.field230[field989];
		}

		if (var1 >= 0 && var1 < field965.length && field965[var1] != -1) {
			return method405(field965[var1]);
		}

		return null;
	}

	@ObfuscatedName("PFIKHQJO.a(Z)Z")
	public final boolean method404() {
		if (field984 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field984.length; var2++) {
			var1 &= NJPATAFL.method335(field984[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("PFIKHQJO.b(I)LPFIKHQJO;")
	public static final PFIKHQJO method405(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field963[var1].field980 == arg0) {
				return field963[var1];
			}
		}

		field991 = (field991 + 1) % 20;
		PFIKHQJO var2 = field963[field991];
		field978.field812 = field1002[arg0];
		var2.field980 = arg0;
		var2.method408();
		var2.method409(field978);
		return var2;
	}

	@ObfuscatedName("PFIKHQJO.a(IIIIIII)LNJPATAFL;")
	public final NJPATAFL method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		NJPATAFL var8 = method402(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field970 || field973) {
			var8 = new NJPATAFL(field970, var8, field973);
		}

		if (field970) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field842; var10++) {
				int var11 = var8.field843[var10];
				int var12 = var8.field845[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field844[var10] += var15 - var9;
			}

			var8.method339();
		}

		return var8;
	}

	@ObfuscatedName("PFIKHQJO.a(LFIGUVTWB;)V")
	public static final void method407(FIGUVTWB arg0) {
		field978 = new MUKVLYLC(arg0.method209("loc.dat", null));
		MUKVLYLC var1 = new MUKVLYLC(arg0.method209("loc.idx", null));
		field969 = var1.method294();
		field1002 = new int[field969];
		int var2 = 2;
		for (int var3 = 0; var3 < field969; var3++) {
			field1002[var3] = var2;
			var2 += var1.method294();
		}

		field963 = new PFIKHQJO[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field963[var4] = new PFIKHQJO();
		}
	}

	@ObfuscatedName("PFIKHQJO.a()V")
	public final void method408() {
		field984 = null;
		field979 = null;
		field986 = null;
		field961 = null;
		field957 = null;
		field967 = null;
		field966 = 1;
		field995 = 1;
		field974 = true;
		field1001 = true;
		field983 = false;
		field970 = false;
		field973 = false;
		field992 = false;
		field977 = -1;
		field976 = 16;
		field993 = 0;
		field994 = 0;
		field996 = null;
		field985 = -1;
		field999 = -1;
		field981 = false;
		field988 = true;
		field971 = 128;
		field968 = 128;
		field990 = 128;
		field959 = 0;
		field958 = 0;
		field975 = 0;
		field1000 = 0;
		field972 = false;
		field964 = false;
		field998 = -1;
		field997 = -1;
		field989 = -1;
		field965 = null;
	}

	@ObfuscatedName("PFIKHQJO.a(LMUKVLYLC;Z)V")
	public final void method409(MUKVLYLC arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method292();
					if (var3 == 0) {
						if (var2 == -1) {
							field983 = false;
							if (field984 != null && (field979 == null || field979[0] == 10)) {
								field983 = true;
							}

							if (field996 != null) {
								field983 = true;
							}
						}

						if (field964) {
							field974 = false;
							field1001 = false;
						}

						if (field998 == -1) {
							field998 = field974 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field986 = arg0.method299();
					} else if (var3 == 3) {
						field961 = arg0.method300();
					} else if (var3 == 5) {
						int var6 = arg0.method292();
						if (var6 > 0) {
							if (field984 == null || field982) {
								field979 = null;
								field984 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field984[var7] = arg0.method294();
								}
							} else {
								arg0.field812 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field966 = arg0.method292();
					} else if (var3 == 15) {
						field995 = arg0.method292();
					} else if (var3 == 17) {
						field974 = false;
					} else if (var3 == 18) {
						field1001 = false;
					} else if (var3 == 19) {
						var2 = arg0.method292();
						if (var2 == 1) {
							field983 = true;
						}
					} else if (var3 == 21) {
						field970 = true;
					} else if (var3 == 22) {
						field973 = true;
					} else if (var3 == 23) {
						field992 = true;
					} else if (var3 == 24) {
						field977 = arg0.method294();
						if (field977 == 0xFFFF) {
							field977 = -1;
						}
					} else if (var3 == 28) {
						field976 = arg0.method292();
					} else if (var3 == 29) {
						field993 = arg0.method293();
					} else if (var3 == 39) {
						field994 = arg0.method293();
					} else if (var3 >= 30 && var3 < 39) {
						if (field996 == null) {
							field996 = new String[5];
						}

						field996[var3 - 30] = arg0.method299();
						if (field996[var3 - 30].equalsIgnoreCase("hidden")) {
							field996[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method292();
						field957 = new int[var8];
						field967 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field957[var9] = arg0.method294();
							field967[var9] = arg0.method294();
						}
					} else if (var3 == 60) {
						field985 = arg0.method294();
					} else if (var3 == 62) {
						field981 = true;
					} else if (var3 == 64) {
						field988 = false;
					} else if (var3 == 65) {
						field971 = arg0.method294();
					} else if (var3 == 66) {
						field968 = arg0.method294();
					} else if (var3 == 67) {
						field990 = arg0.method294();
					} else if (var3 == 68) {
						field999 = arg0.method294();
					} else if (var3 == 69) {
						field959 = arg0.method292();
					} else if (var3 == 70) {
						field958 = arg0.method295();
					} else if (var3 == 71) {
						field975 = arg0.method295();
					} else if (var3 == 72) {
						field1000 = arg0.method295();
					} else if (var3 == 73) {
						field972 = true;
					} else if (var3 == 74) {
						field964 = true;
					} else if (var3 == 75) {
						field998 = arg0.method292();
					} else if (var3 == 77) {
						field997 = arg0.method294();
						if (field997 == 0xFFFF) {
							field997 = -1;
						}

						field989 = arg0.method294();
						if (field989 == 0xFFFF) {
							field989 = -1;
						}

						int var10 = arg0.method292();
						field965 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field965[var11] = arg0.method294();
							if (field965[var11] == 0xFFFF) {
								field965[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method292();
			} while (var4 <= 0);

			if (field984 == null || field982) {
				field979 = new int[var4];
				field984 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field984[var5] = arg0.method294();
					field979[var5] = arg0.method292();
				}
			} else {
				arg0.field812 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("PFIKHQJO.c(I)V")
	public static final void method410() {
		field960 = null;
		field962 = null;
		field1002 = null;
		field963 = null;
		field978 = null;
	}

	@ObfuscatedName("PFIKHQJO.a(LFRNMNGGN;I)V")
	public final void method411(FRNMNGGN arg0) {
		if (field984 != null) {
			for (int var2 = 0; var2 < field984.length; var2++) {
				arg0.method222(field984[var2] & 0xFFFF, 0);
			}
		}
	}
}
