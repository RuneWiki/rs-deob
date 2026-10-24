package deob;

@ObfuscatedName("NRKXAGEB")
public final class NRKXAGEB {

	@ObfuscatedName("NRKXAGEB.k")
	public int field996 = -1;

	@ObfuscatedName("NRKXAGEB.i")
	public static CSGBDGDY[] field994 = new CSGBDGDY[4];

	@ObfuscatedName("NRKXAGEB.O")
	public static ZPNSJLZE field1024 = new ZPNSJLZE(500);

	@ObfuscatedName("NRKXAGEB.S")
	public static ZPNSJLZE field1026 = new ZPNSJLZE(40);

	@ObfuscatedName("NRKXAGEB.B")
	public byte field1011;

	@ObfuscatedName("NRKXAGEB.m")
	public byte field997;

	@ObfuscatedName("NRKXAGEB.t")
	public int field1003;

	@ObfuscatedName("NRKXAGEB.w")
	public int field1006;

	@ObfuscatedName("NRKXAGEB.z")
	public int field1009;

	@ObfuscatedName("NRKXAGEB.A")
	public int field1010;

	@ObfuscatedName("NRKXAGEB.D")
	public int field1013;

	@ObfuscatedName("NRKXAGEB.E")
	public static int field1014;

	@ObfuscatedName("NRKXAGEB.H")
	public int field1017;

	@ObfuscatedName("NRKXAGEB.J")
	public int field1019;

	@ObfuscatedName("NRKXAGEB.M")
	public static int field1022;

	@ObfuscatedName("NRKXAGEB.P")
	public int field1025;

	@ObfuscatedName("NRKXAGEB.T")
	public int field1027;

	@ObfuscatedName("NRKXAGEB.X")
	public int field1031;

	@ObfuscatedName("NRKXAGEB.Y")
	public int field1032;

	@ObfuscatedName("NRKXAGEB.Z")
	public int field1033;

	@ObfuscatedName("NRKXAGEB.a")
	public int field987;

	@ObfuscatedName("NRKXAGEB.f")
	public int field991;

	@ObfuscatedName("NRKXAGEB.h")
	public int field993;

	@ObfuscatedName("NRKXAGEB.o")
	public int field998;

	@ObfuscatedName("NRKXAGEB.L")
	public static NHEPCMLW field1021;

	@ObfuscatedName("NRKXAGEB.c")
	public static client field989;

	@ObfuscatedName("NRKXAGEB.K")
	public String field1020;

	@ObfuscatedName("NRKXAGEB.q")
	public boolean field1000;

	@ObfuscatedName("NRKXAGEB.r")
	public boolean field1001;

	@ObfuscatedName("NRKXAGEB.s")
	public boolean field1002;

	@ObfuscatedName("NRKXAGEB.y")
	public boolean field1008;

	@ObfuscatedName("NRKXAGEB.C")
	public boolean field1012;

	@ObfuscatedName("NRKXAGEB.F")
	public boolean field1015;

	@ObfuscatedName("NRKXAGEB.I")
	public boolean field1018;

	@ObfuscatedName("NRKXAGEB.V")
	public boolean field1029;

	@ObfuscatedName("NRKXAGEB.d")
	public boolean field990;

	@ObfuscatedName("NRKXAGEB.j")
	public boolean field995;

	@ObfuscatedName("NRKXAGEB.p")
	public static boolean field999;

	@ObfuscatedName("NRKXAGEB.W")
	public byte[] field1030;

	@ObfuscatedName("NRKXAGEB.u")
	public int[] field1004;

	@ObfuscatedName("NRKXAGEB.v")
	public int[] field1005;

	@ObfuscatedName("NRKXAGEB.x")
	public int[] field1007;

	@ObfuscatedName("NRKXAGEB.G")
	public int[] field1016;

	@ObfuscatedName("NRKXAGEB.N")
	public static int[] field1023;

	@ObfuscatedName("NRKXAGEB.U")
	public int[] field1028;

	@ObfuscatedName("NRKXAGEB.b")
	public static NRKXAGEB[] field988;

	@ObfuscatedName("NRKXAGEB.g")
	public String[] field992;

	@ObfuscatedName("NRKXAGEB.a(I)LNRKXAGEB;")
	public static final NRKXAGEB method400(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field988[var1].field996 == arg0) {
				return field988[var1];
			}
		}

		field1022 = (field1022 + 1) % 20;
		NRKXAGEB var2 = field988[field1022];
		field1021.field965 = field1023[arg0];
		var2.field996 = arg0;
		var2.method406();
		var2.method404(field1021);
		return var2;
	}

	@ObfuscatedName("NRKXAGEB.a(IZ)Z")
	public final boolean method401(int arg0) {
		if (field1028 != null) {
			for (int var4 = 0; var4 < field1028.length; var4++) {
				if (field1028[var4] == arg0) {
					return CSGBDGDY.method161(field1004[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1004 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1004.length; var3++) {
				var2 &= CSGBDGDY.method161(field1004[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("NRKXAGEB.a(LINOFEYKQ;)V")
	public static final void method402(INOFEYKQ arg0) {
		field1021 = new NHEPCMLW(arg0.method277("loc.dat", null));
		NHEPCMLW var1 = new NHEPCMLW(arg0.method277("loc.idx", null));
		field1014 = var1.method351();
		field1023 = new int[field1014];
		int var2 = 2;
		for (int var3 = 0; var3 < field1014; var3++) {
			field1023[var3] = var2;
			var2 += var1.method351();
		}

		field988 = new NRKXAGEB[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field988[var4] = new NRKXAGEB();
		}
	}

	@ObfuscatedName("NRKXAGEB.a(Z)V")
	public static final void method403() {
		field1024 = null;
		field1026 = null;
		field1023 = null;
		field988 = null;
		field1021 = null;
	}

	@ObfuscatedName("NRKXAGEB.a(ZLNHEPCMLW;)V")
	public final void method404(NHEPCMLW arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method349();
					if (var3 == 0) {
						if (var2 == -1) {
							field1012 = false;
							if (field1004 != null && (field1028 == null || field1028[0] == 10)) {
								field1012 = true;
							}

							if (field992 != null) {
								field1012 = true;
							}
						}

						if (field1002) {
							field1000 = false;
							field1029 = false;
						}

						if (field1009 == -1) {
							field1009 = field1000 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1020 = arg0.method356();
					} else if (var3 == 3) {
						field1030 = arg0.method357();
					} else if (var3 == 5) {
						int var6 = arg0.method349();
						if (var6 > 0) {
							if (field1004 == null || field999) {
								field1028 = null;
								field1004 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1004[var7] = arg0.method351();
								}
							} else {
								arg0.field965 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field987 = arg0.method349();
					} else if (var3 == 15) {
						field1017 = arg0.method349();
					} else if (var3 == 17) {
						field1000 = false;
					} else if (var3 == 18) {
						field1029 = false;
					} else if (var3 == 19) {
						var2 = arg0.method349();
						if (var2 == 1) {
							field1012 = true;
						}
					} else if (var3 == 21) {
						field1018 = true;
					} else if (var3 == 22) {
						field1008 = true;
					} else if (var3 == 23) {
						field1001 = true;
					} else if (var3 == 24) {
						field1010 = arg0.method351();
						if (field1010 == 0xFFFF) {
							field1010 = -1;
						}
					} else if (var3 == 28) {
						field993 = arg0.method349();
					} else if (var3 == 29) {
						field997 = arg0.method350();
					} else if (var3 == 39) {
						field1011 = arg0.method350();
					} else if (var3 >= 30 && var3 < 39) {
						if (field992 == null) {
							field992 = new String[5];
						}

						field992[var3 - 30] = arg0.method356();
						if (field992[var3 - 30].equalsIgnoreCase("hidden")) {
							field992[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method349();
						field1016 = new int[var8];
						field1007 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1016[var9] = arg0.method351();
							field1007[var9] = arg0.method351();
						}
					} else if (var3 == 60) {
						field1031 = arg0.method351();
					} else if (var3 == 62) {
						field1015 = true;
					} else if (var3 == 64) {
						field995 = false;
					} else if (var3 == 65) {
						field1033 = arg0.method351();
					} else if (var3 == 66) {
						field1006 = arg0.method351();
					} else if (var3 == 67) {
						field1003 = arg0.method351();
					} else if (var3 == 68) {
						field1019 = arg0.method351();
					} else if (var3 == 69) {
						field1025 = arg0.method349();
					} else if (var3 == 70) {
						field1027 = arg0.method352();
					} else if (var3 == 71) {
						field1032 = arg0.method352();
					} else if (var3 == 72) {
						field998 = arg0.method352();
					} else if (var3 == 73) {
						field990 = true;
					} else if (var3 == 74) {
						field1002 = true;
					} else if (var3 == 75) {
						field1009 = arg0.method349();
					} else if (var3 == 77) {
						field1013 = arg0.method351();
						if (field1013 == 0xFFFF) {
							field1013 = -1;
						}

						field991 = arg0.method351();
						if (field991 == 0xFFFF) {
							field991 = -1;
						}

						int var10 = arg0.method349();
						field1005 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1005[var11] = arg0.method351();
							if (field1005[var11] == 0xFFFF) {
								field1005[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method349();
			} while (var4 <= 0);

			if (field1004 == null || field999) {
				field1028 = new int[var4];
				field1004 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1004[var5] = arg0.method351();
					field1028[var5] = arg0.method349();
				}
			} else {
				arg0.field965 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("NRKXAGEB.a(B)Z")
	public final boolean method405() {
		if (field1004 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1004.length; var2++) {
			var1 &= CSGBDGDY.method161(field1004[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("NRKXAGEB.a()V")
	public final void method406() {
		field1004 = null;
		field1028 = null;
		field1020 = null;
		field1030 = null;
		field1016 = null;
		field1007 = null;
		field987 = 1;
		field1017 = 1;
		field1000 = true;
		field1029 = true;
		field1012 = false;
		field1018 = false;
		field1008 = false;
		field1001 = false;
		field1010 = -1;
		field993 = 16;
		field997 = 0;
		field1011 = 0;
		field992 = null;
		field1031 = -1;
		field1019 = -1;
		field1015 = false;
		field995 = true;
		field1033 = 128;
		field1006 = 128;
		field1003 = 128;
		field1025 = 0;
		field1027 = 0;
		field1032 = 0;
		field998 = 0;
		field990 = false;
		field1002 = false;
		field1009 = -1;
		field1013 = -1;
		field991 = -1;
		field1005 = null;
	}

	@ObfuscatedName("NRKXAGEB.a(LVNVHYJAS;B)V")
	public final void method407(VNVHYJAS arg0) {
		if (field1004 != null) {
			for (int var2 = 0; var2 < field1004.length; var2++) {
				arg0.method523(field1004[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("NRKXAGEB.a(IIIIIII)LCSGBDGDY;")
	public final CSGBDGDY method408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		CSGBDGDY var8 = method409(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field1018 || field1008) {
			var8 = new CSGBDGDY(field1018, var8, field1008);
		}

		if (field1018) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field503; var10++) {
				int var11 = var8.field504[var10];
				int var12 = var8.field506[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field505[var10] += var15 - var9;
			}

			var8.method165();
		}

		return var8;
	}

	@ObfuscatedName("NRKXAGEB.a(IIBI)LCSGBDGDY;")
	public final CSGBDGDY method409(int arg0, int arg1, int arg2) {
		CSGBDGDY var4 = null;
		long var5;
		if (field1028 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field996 << 6) + arg0);
			CSGBDGDY var7 = (CSGBDGDY) field1026.method586(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1004 == null) {
				return null;
			}

			boolean var8 = field1015 ^ arg0 > 3;
			int var9 = field1004.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1004[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (CSGBDGDY) field1024.method586(var11);
				if (var4 == null) {
					var4 = CSGBDGDY.method160(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method175();
					}

					field1024.method587(var4, var11);
				}

				if (var9 > 1) {
					field994[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new CSGBDGDY(var9, field994);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1028.length; var13++) {
				if (field1028[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field996 << 6) + (var12 << 3) + arg0);
			CSGBDGDY var14 = (CSGBDGDY) field1026.method586(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1004[var12];
			boolean var16 = field1015 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (CSGBDGDY) field1024.method586(var15);
			if (var4 == null) {
				var4 = CSGBDGDY.method160(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method175();
				}

				field1024.method587(var4, var15);
			}
		}

		boolean var17;
		if (field1033 == 128 && field1006 == 128 && field1003 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1027 == 0 && field1032 == 0 && field998 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		CSGBDGDY var19 = new CSGBDGDY(field1016 == null, KDJQGGIG.method285(arg1), var4, arg0 == 0 && arg1 == -1 && !var17 && !var18);
		if (arg1 != -1) {
			var19.method167();
			var19.method168(arg1);
			var19.field535 = null;
			var19.field534 = null;
		}

		while (arg0-- > 0) {
			var19.method171();
		}

		if (field1016 != null) {
			for (int var20 = 0; var20 < field1016.length; var20++) {
				var19.method174(field1016[var20], field1007[var20]);
			}
		}

		if (var17) {
			var19.method176(field1003, field1006, field1033);
		}

		if (var18) {
			var19.method173(field1032, field1027, field998);
		}

		var19.method177(field997 + 64, field1011 * 5 + 768, -50, -10, -50, !field1008);

		if (field1009 == 1) {
			var19.field531 = var19.field1474;
		}

		field1026.method587(var19, var5);
		return var19;
	}

	@ObfuscatedName("NRKXAGEB.b(B)LNRKXAGEB;")
	public final NRKXAGEB method410() {
		int var1 = -1;
		if (field1013 != -1) {
			OHEMVFER var2 = OHEMVFER.field1037[field1013];
			int var3 = var2.field1039;
			int var4 = var2.field1040;
			int var5 = var2.field1041;
			int var6 = client.field362[var5 - var4];
			var1 = field989.field117[var3] >> var4 & var6;
		} else if (field991 != -1) {
			var1 = field989.field117[field991];
		}

		if (var1 >= 0 && var1 < field1005.length && field1005[var1] != -1) {
			return method400(field1005[var1]);
		}

		return null;
	}
}
