package deob;

@ObfuscatedName("MIQWCPVG")
public final class MIQWCPVG {

	@ObfuscatedName("MIQWCPVG.s")
	public String field1024 = "null";

	@ObfuscatedName("MIQWCPVG.K")
	public int field1040 = -1;

	@ObfuscatedName("MIQWCPVG.f")
	public static NVDACYAH field1012 = new NVDACYAH(500);

	@ObfuscatedName("MIQWCPVG.t")
	public static NVDACYAH field1025 = new NVDACYAH(40);

	@ObfuscatedName("MIQWCPVG.D")
	public static IRLTEWJP[] field1035 = new IRLTEWJP[4];

	@ObfuscatedName("MIQWCPVG.E")
	public byte field1036;

	@ObfuscatedName("MIQWCPVG.L")
	public byte field1041;

	@ObfuscatedName("MIQWCPVG.c")
	public int field1009;

	@ObfuscatedName("MIQWCPVG.g")
	public int field1013;

	@ObfuscatedName("MIQWCPVG.k")
	public int field1017;

	@ObfuscatedName("MIQWCPVG.l")
	public int field1018;

	@ObfuscatedName("MIQWCPVG.n")
	public int field1019;

	@ObfuscatedName("MIQWCPVG.o")
	public int field1020;

	@ObfuscatedName("MIQWCPVG.p")
	public int field1021;

	@ObfuscatedName("MIQWCPVG.q")
	public int field1022;

	@ObfuscatedName("MIQWCPVG.x")
	public int field1029;

	@ObfuscatedName("MIQWCPVG.A")
	public int field1032;

	@ObfuscatedName("MIQWCPVG.C")
	public static int field1034;

	@ObfuscatedName("MIQWCPVG.G")
	public int field1037;

	@ObfuscatedName("MIQWCPVG.I")
	public int field1038;

	@ObfuscatedName("MIQWCPVG.J")
	public int field1039;

	@ObfuscatedName("MIQWCPVG.P")
	public int field1045;

	@ObfuscatedName("MIQWCPVG.S")
	public int field1047;

	@ObfuscatedName("MIQWCPVG.T")
	public int field1048;

	@ObfuscatedName("MIQWCPVG.X")
	public static int field1052;

	@ObfuscatedName("MIQWCPVG.v")
	public static MNKDCXXG field1027;

	@ObfuscatedName("MIQWCPVG.y")
	public static client field1030;

	@ObfuscatedName("MIQWCPVG.a")
	public boolean field1007;

	@ObfuscatedName("MIQWCPVG.d")
	public boolean field1010;

	@ObfuscatedName("MIQWCPVG.e")
	public boolean field1011;

	@ObfuscatedName("MIQWCPVG.h")
	public boolean field1014;

	@ObfuscatedName("MIQWCPVG.i")
	public boolean field1015;

	@ObfuscatedName("MIQWCPVG.j")
	public boolean field1016;

	@ObfuscatedName("MIQWCPVG.u")
	public boolean field1026;

	@ObfuscatedName("MIQWCPVG.w")
	public boolean field1028;

	@ObfuscatedName("MIQWCPVG.z")
	public boolean field1031;

	@ObfuscatedName("MIQWCPVG.M")
	public boolean field1042;

	@ObfuscatedName("MIQWCPVG.W")
	public static boolean field1051;

	@ObfuscatedName("MIQWCPVG.N")
	public byte[] field1043;

	@ObfuscatedName("MIQWCPVG.b")
	public int[] field1008;

	@ObfuscatedName("MIQWCPVG.r")
	public static int[] field1023;

	@ObfuscatedName("MIQWCPVG.B")
	public int[] field1033;

	@ObfuscatedName("MIQWCPVG.O")
	public int[] field1044;

	@ObfuscatedName("MIQWCPVG.Q")
	public int[] field1046;

	@ObfuscatedName("MIQWCPVG.U")
	public int[] field1049;

	@ObfuscatedName("MIQWCPVG.V")
	public static MIQWCPVG[] field1050;

	@ObfuscatedName("MIQWCPVG.Y")
	public String[] field1053;

	@ObfuscatedName("MIQWCPVG.a(I)LMIQWCPVG;")
	public static final MIQWCPVG method363(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1050[var1].field1040 == arg0) {
				return field1050[var1];
			}
		}

		field1034 = (field1034 + 1) % 20;
		MIQWCPVG var2 = field1050[field1034];
		field1027.field1055 = field1023[arg0];
		var2.field1040 = arg0;
		var2.method373();
		var2.method371(field1027);
		return var2;
	}

	@ObfuscatedName("MIQWCPVG.a(IBII)LIRLTEWJP;")
	public final IRLTEWJP method364(int arg0, int arg1, int arg2) {
		IRLTEWJP var4 = null;
		long var5;
		if (field1033 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1040 << 6) + arg1);
			IRLTEWJP var7 = (IRLTEWJP) field1025.method427(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1046 == null) {
				return null;
			}

			boolean var8 = field1011 ^ arg1 > 3;
			int var9 = field1046.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1046[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (IRLTEWJP) field1012.method427(var11);
				if (var4 == null) {
					var4 = IRLTEWJP.method281(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method296();
					}

					field1012.method428(var11, var4);
				}

				if (var9 > 1) {
					field1035[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new IRLTEWJP(var9, field1035);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1033.length; var13++) {
				if (field1033[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field1040 << 6) + (var12 << 3) + arg1);
			IRLTEWJP var14 = (IRLTEWJP) field1025.method427(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1046[var12];
			boolean var16 = field1011 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (IRLTEWJP) field1012.method427(var15);
			if (var4 == null) {
				var4 = IRLTEWJP.method281(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method296();
				}

				field1012.method428(var15, var4);
			}
		}

		boolean var17;
		if (field1037 == 128 && field1013 == 128 && field1021 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1038 == 0 && field1045 == 0 && field1032 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		IRLTEWJP var19 = new IRLTEWJP(var4, arg1 == 0 && arg0 == -1 && !var17 && !var18, FIYHSKKC.method211(arg0), field1044 == null);
		if (arg0 != -1) {
			var19.method288();
			var19.method289(arg0);
			var19.field910 = null;
			var19.field909 = null;
		}

		while (arg1-- > 0) {
			var19.method292();
		}

		if (field1044 != null) {
			for (int var20 = 0; var20 < field1044.length; var20++) {
				var19.method295(field1044[var20], field1049[var20]);
			}
		}

		if (var17) {
			var19.method297(field1021, field1013, field1037);
		}

		if (var18) {
			var19.method294(field1038, field1032, field1045);
		}

		var19.method298(field1036 + 64, field1041 * 5 + 768, -50, -10, -50, !field1028);

		if (field1009 == 1) {
			var19.field906 = var19.field702;
		}

		field1025.method428(var5, var19);
		return var19;
	}

	@ObfuscatedName("MIQWCPVG.a(IIIIIII)LIRLTEWJP;")
	public final IRLTEWJP method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		IRLTEWJP var8 = method364(arg6, arg1, arg0);
		if (var8 == null) {
			return null;
		}

		if (field1026 || field1028) {
			var8 = new IRLTEWJP(field1028, field1026, var8);
		}

		if (field1026) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field879; var10++) {
				int var11 = var8.field880[var10];
				int var12 = var8.field882[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field881[var10] += var15 - var9;
			}

			var8.method286();
		}

		return var8;
	}

	@ObfuscatedName("MIQWCPVG.a(ILUWINSVPX;)V")
	public final void method366(UWINSVPX arg0) {
		if (field1046 != null) {
			for (int var2 = 0; var2 < field1046.length; var2++) {
				arg0.method527(field1046[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("MIQWCPVG.b(I)Z")
	public final boolean method367() {
		if (field1046 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1046.length; var2++) {
			var1 &= IRLTEWJP.method282(field1046[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("MIQWCPVG.a(Z)LMIQWCPVG;")
	public final MIQWCPVG method368() {
		int var1 = -1;
		if (field1039 != -1) {
			NPQMEWIH var2 = NPQMEWIH.field1074[field1039];
			int var3 = var2.field1076;
			int var4 = var2.field1077;
			int var5 = var2.field1078;
			int var6 = client.field393[var5 - var4];
			var1 = field1030.field439[var3] >> var4 & var6;
		} else if (field1018 != -1) {
			var1 = field1030.field439[field1018];
		}

		if (var1 >= 0 && var1 < field1008.length && field1008[var1] != -1) {
			return method363(field1008[var1]);
		}

		return null;
	}

	@ObfuscatedName("MIQWCPVG.c(I)V")
	public static final void method369() {
		field1012 = null;
		field1025 = null;
		field1023 = null;
		field1050 = null;
		field1027 = null;
	}

	@ObfuscatedName("MIQWCPVG.a(LNXFIIFAD;)V")
	public static final void method370(NXFIIFAD arg0) {
		field1027 = new MNKDCXXG(arg0.method431("loc.dat", null));
		MNKDCXXG var1 = new MNKDCXXG(arg0.method431("loc.idx", null));
		field1052 = var1.method388();
		field1023 = new int[field1052];
		int var2 = 2;
		for (int var3 = 0; var3 < field1052; var3++) {
			field1023[var3] = var2;
			var2 += var1.method388();
		}

		field1050 = new MIQWCPVG[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1050[var4] = new MIQWCPVG();
		}
	}

	@ObfuscatedName("MIQWCPVG.a(LMNKDCXXG;I)V")
	public final void method371(MNKDCXXG arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method386();
					if (var3 == 0) {
						if (var2 == -1) {
							field1015 = false;
							if (field1046 != null && (field1033 == null || field1033[0] == 10)) {
								field1015 = true;
							}

							if (field1053 != null) {
								field1015 = true;
							}
						}

						if (field1016) {
							field1042 = false;
							field1007 = false;
						}

						if (field1009 == -1) {
							field1009 = field1042 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1024 = arg0.method393();
					} else if (var3 == 3) {
						field1043 = arg0.method394();
					} else if (var3 == 5) {
						int var6 = arg0.method386();
						if (var6 > 0) {
							if (field1046 == null || field1051) {
								field1033 = null;
								field1046 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1046[var7] = arg0.method388();
								}
							} else {
								arg0.field1055 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1017 = arg0.method386();
					} else if (var3 == 15) {
						field1019 = arg0.method386();
					} else if (var3 == 17) {
						field1042 = false;
					} else if (var3 == 18) {
						field1007 = false;
					} else if (var3 == 19) {
						var2 = arg0.method386();
						if (var2 == 1) {
							field1015 = true;
						}
					} else if (var3 == 21) {
						field1026 = true;
					} else if (var3 == 22) {
						field1028 = true;
					} else if (var3 == 23) {
						field1010 = true;
					} else if (var3 == 24) {
						field1047 = arg0.method388();
						if (field1047 == 0xFFFF) {
							field1047 = -1;
						}
					} else if (var3 == 28) {
						field1029 = arg0.method386();
					} else if (var3 == 29) {
						field1036 = arg0.method387();
					} else if (var3 == 39) {
						field1041 = arg0.method387();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1053 == null) {
							field1053 = new String[5];
						}

						field1053[var3 - 30] = arg0.method393();
						if (field1053[var3 - 30].equalsIgnoreCase("hidden")) {
							field1053[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method386();
						field1044 = new int[var8];
						field1049 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1044[var9] = arg0.method388();
							field1049[var9] = arg0.method388();
						}
					} else if (var3 == 60) {
						field1020 = arg0.method388();
					} else if (var3 == 62) {
						field1011 = true;
					} else if (var3 == 64) {
						field1014 = false;
					} else if (var3 == 65) {
						field1037 = arg0.method388();
					} else if (var3 == 66) {
						field1013 = arg0.method388();
					} else if (var3 == 67) {
						field1021 = arg0.method388();
					} else if (var3 == 68) {
						field1022 = arg0.method388();
					} else if (var3 == 69) {
						field1048 = arg0.method386();
					} else if (var3 == 70) {
						field1038 = arg0.method389();
					} else if (var3 == 71) {
						field1045 = arg0.method389();
					} else if (var3 == 72) {
						field1032 = arg0.method389();
					} else if (var3 == 73) {
						field1031 = true;
					} else if (var3 == 74) {
						field1016 = true;
					} else if (var3 == 75) {
						field1009 = arg0.method386();
					} else if (var3 == 77) {
						field1039 = arg0.method388();
						if (field1039 == 0xFFFF) {
							field1039 = -1;
						}

						field1018 = arg0.method388();
						if (field1018 == 0xFFFF) {
							field1018 = -1;
						}

						int var10 = arg0.method386();
						field1008 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1008[var11] = arg0.method388();
							if (field1008[var11] == 0xFFFF) {
								field1008[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method386();
			} while (var4 <= 0);

			if (field1046 == null || field1051) {
				field1033 = new int[var4];
				field1046 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1046[var5] = arg0.method388();
					field1033[var5] = arg0.method386();
				}
			} else {
				arg0.field1055 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("MIQWCPVG.a(II)Z")
	public final boolean method372(int arg0) {
		if (field1033 != null) {
			for (int var4 = 0; var4 < field1033.length; var4++) {
				if (field1033[var4] == arg0) {
					return IRLTEWJP.method282(field1046[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1046 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1046.length; var3++) {
				var2 &= IRLTEWJP.method282(field1046[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("MIQWCPVG.a()V")
	public final void method373() {
		field1046 = null;
		field1033 = null;
		field1024 = "null";
		field1043 = null;
		field1044 = null;
		field1049 = null;
		field1017 = 1;
		field1019 = 1;
		field1042 = true;
		field1007 = true;
		field1015 = false;
		field1026 = false;
		field1028 = false;
		field1010 = false;
		field1047 = -1;
		field1029 = 16;
		field1036 = 0;
		field1041 = 0;
		field1053 = null;
		field1020 = -1;
		field1022 = -1;
		field1011 = false;
		field1014 = true;
		field1037 = 128;
		field1013 = 128;
		field1021 = 128;
		field1048 = 0;
		field1038 = 0;
		field1045 = 0;
		field1032 = 0;
		field1031 = false;
		field1016 = false;
		field1009 = -1;
		field1039 = -1;
		field1018 = -1;
		field1008 = null;
	}
}
