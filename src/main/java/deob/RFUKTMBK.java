package deob;

@ObfuscatedName("RFUKTMBK")
public final class RFUKTMBK {

	@ObfuscatedName("RFUKTMBK.s")
	public int field1051 = -1;

	@ObfuscatedName("RFUKTMBK.o")
	public static VHYCWIPJ[] field1048 = new VHYCWIPJ[4];

	@ObfuscatedName("RFUKTMBK.p")
	public static HGKRJZKS field1049 = new HGKRJZKS(30);

	@ObfuscatedName("RFUKTMBK.Y")
	public static HGKRJZKS field1081 = new HGKRJZKS(500);

	@ObfuscatedName("RFUKTMBK.f")
	public byte field1040;

	@ObfuscatedName("RFUKTMBK.n")
	public byte field1047;

	@ObfuscatedName("RFUKTMBK.a")
	public int field1036;

	@ObfuscatedName("RFUKTMBK.b")
	public int field1037;

	@ObfuscatedName("RFUKTMBK.e")
	public int field1039;

	@ObfuscatedName("RFUKTMBK.g")
	public int field1041;

	@ObfuscatedName("RFUKTMBK.h")
	public static int field1042;

	@ObfuscatedName("RFUKTMBK.j")
	public int field1044;

	@ObfuscatedName("RFUKTMBK.m")
	public int field1046;

	@ObfuscatedName("RFUKTMBK.q")
	public int field1050;

	@ObfuscatedName("RFUKTMBK.t")
	public int field1052;

	@ObfuscatedName("RFUKTMBK.u")
	public int field1053;

	@ObfuscatedName("RFUKTMBK.v")
	public int field1054;

	@ObfuscatedName("RFUKTMBK.x")
	public int field1056;

	@ObfuscatedName("RFUKTMBK.y")
	public int field1057;

	@ObfuscatedName("RFUKTMBK.K")
	public static int field1067;

	@ObfuscatedName("RFUKTMBK.M")
	public int field1069;

	@ObfuscatedName("RFUKTMBK.N")
	public int field1070;

	@ObfuscatedName("RFUKTMBK.O")
	public int field1071;

	@ObfuscatedName("RFUKTMBK.ab")
	public int field1082;

	@ObfuscatedName("RFUKTMBK.J")
	public static GLMIQHJI field1066;

	@ObfuscatedName("RFUKTMBK.P")
	public static client field1072;

	@ObfuscatedName("RFUKTMBK.L")
	public String field1068;

	@ObfuscatedName("RFUKTMBK.c")
	public boolean field1038;

	@ObfuscatedName("RFUKTMBK.i")
	public boolean field1043;

	@ObfuscatedName("RFUKTMBK.k")
	public boolean field1045;

	@ObfuscatedName("RFUKTMBK.A")
	public boolean field1058;

	@ObfuscatedName("RFUKTMBK.G")
	public static boolean field1063;

	@ObfuscatedName("RFUKTMBK.H")
	public boolean field1064;

	@ObfuscatedName("RFUKTMBK.Q")
	public boolean field1073;

	@ObfuscatedName("RFUKTMBK.R")
	public boolean field1074;

	@ObfuscatedName("RFUKTMBK.S")
	public boolean field1075;

	@ObfuscatedName("RFUKTMBK.U")
	public boolean field1077;

	@ObfuscatedName("RFUKTMBK.X")
	public boolean field1080;

	@ObfuscatedName("RFUKTMBK.V")
	public byte[] field1078;

	@ObfuscatedName("RFUKTMBK.w")
	public int[] field1055;

	@ObfuscatedName("RFUKTMBK.D")
	public int[] field1061;

	@ObfuscatedName("RFUKTMBK.E")
	public int[] field1062;

	@ObfuscatedName("RFUKTMBK.I")
	public static int[] field1065;

	@ObfuscatedName("RFUKTMBK.T")
	public int[] field1076;

	@ObfuscatedName("RFUKTMBK.W")
	public int[] field1079;

	@ObfuscatedName("RFUKTMBK.C")
	public static RFUKTMBK[] field1060;

	@ObfuscatedName("RFUKTMBK.B")
	public String[] field1059;

	@ObfuscatedName("RFUKTMBK.a(IIIIIII)LVHYCWIPJ;")
	public final VHYCWIPJ method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		VHYCWIPJ var8 = method463(arg1, arg0, arg6);
		if (var8 == null) {
			return null;
		}

		if (field1080 || field1045) {
			var8 = new VHYCWIPJ(field1080, field1045, var8);
		}

		if (field1080) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1178; var10++) {
				int var11 = var8.field1179[var10];
				int var12 = var8.field1181[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1180[var10] += var15 - var9;
			}

			var8.method505();
		}

		return var8;
	}

	@ObfuscatedName("RFUKTMBK.a(IIII)LVHYCWIPJ;")
	public final VHYCWIPJ method463(int arg0, int arg1, int arg2) {
		VHYCWIPJ var4 = null;
		long var5;
		if (field1079 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1051 << 6) + arg0);
			VHYCWIPJ var7 = (VHYCWIPJ) field1049.method285(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1062 == null) {
				return null;
			}

			boolean var8 = field1073 ^ arg0 > 3;
			int var9 = field1062.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1062[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (VHYCWIPJ) field1081.method285(var11);
				if (var4 == null) {
					var4 = VHYCWIPJ.method500(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method515();
					}

					field1081.method286(var11, var4);
				}

				if (var9 > 1) {
					field1048[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new VHYCWIPJ(var9, field1048);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1079.length; var13++) {
				if (field1079[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1051 << 6) + (var12 << 3) + arg0);
			VHYCWIPJ var14 = (VHYCWIPJ) field1049.method285(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1062[var12];
			boolean var16 = field1073 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (VHYCWIPJ) field1081.method285(var15);
			if (var4 == null) {
				var4 = VHYCWIPJ.method500(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method515();
				}

				field1081.method286(var15, var4);
			}
		}

		boolean var17;
		if (field1056 == 128 && field1039 == 128 && field1044 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1070 == 0 && field1069 == 0 && field1046 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		VHYCWIPJ var19 = new VHYCWIPJ(TTZHVWEG.method489(arg2), field1061 == null, arg0 == 0 && arg2 == -1 && !var17 && !var18, var4);
		if (arg2 != -1) {
			var19.method507();
			var19.method508(arg2);
			var19.field1210 = null;
			var19.field1209 = null;
		}

		while (arg0-- > 0) {
			var19.method511();
		}

		if (field1061 != null) {
			for (int var20 = 0; var20 < field1061.length; var20++) {
				var19.method514(field1061[var20], field1076[var20]);
			}
		}

		if (var17) {
			var19.method516(field1056, field1044, field1039);
		}

		if (var18) {
			var19.method513(field1046, field1070, field1069);
		}

		var19.method517(field1040 + 64, field1047 * 5 + 768, -50, -10, -50, !field1045);

		if (field1052 == 1) {
			var19.field1206 = var19.field962;
		}

		field1049.method286(var5, var19);
		return var19;
	}

	@ObfuscatedName("RFUKTMBK.a(LLNOSHUMO;B)V")
	public final void method464(LNOSHUMO arg0) {
		if (field1062 != null) {
			for (int var2 = 0; var2 < field1062.length; var2++) {
				arg0.method360(field1062[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("RFUKTMBK.a(I)Z")
	public final boolean method465() {
		if (field1062 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1062.length; var2++) {
			var1 &= VHYCWIPJ.method501(field1062[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("RFUKTMBK.a(LXRWUKRPO;)V")
	public static final void method466(XRWUKRPO arg0) {
		field1066 = new GLMIQHJI(arg0.method581("loc.dat", null));
		GLMIQHJI var1 = new GLMIQHJI(arg0.method581("loc.idx", null));
		field1067 = var1.method246();
		field1065 = new int[field1067];
		int var2 = 2;
		for (int var3 = 0; var3 < field1067; var3++) {
			field1065[var3] = var2;
			var2 += var1.method246();
		}

		field1060 = new RFUKTMBK[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1060[var4] = new RFUKTMBK();
		}
	}

	@ObfuscatedName("RFUKTMBK.b(I)V")
	public static final void method467() {
		field1081 = null;
		field1049 = null;
		field1065 = null;
		field1060 = null;
		field1066 = null;
	}

	@ObfuscatedName("RFUKTMBK.c(I)LRFUKTMBK;")
	public final RFUKTMBK method468() {
		int var1 = -1;
		if (field1057 != -1) {
			ZIUDVZAI var2 = ZIUDVZAI.field1480[field1057];
			int var3 = var2.field1482;
			int var4 = var2.field1483;
			int var5 = var2.field1484;
			int var6 = client.field518[var5 - var4];
			var1 = field1072.field450[var3] >> var4 & var6;
		} else if (field1036 != -1) {
			var1 = field1072.field450[field1036];
		}

		if (var1 >= 0 && var1 < field1055.length && field1055[var1] != -1) {
			return method472(field1055[var1]);
		}

		return null;
	}

	@ObfuscatedName("RFUKTMBK.a(BLGLMIQHJI;)V")
	public final void method469(GLMIQHJI arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method244();
					if (var3 == 0) {
						if (var2 == -1) {
							field1038 = false;
							if (field1062 != null && (field1079 == null || field1079[0] == 10)) {
								field1038 = true;
							}

							if (field1059 != null) {
								field1038 = true;
							}
						}

						if (field1043) {
							field1058 = false;
							field1064 = false;
						}

						if (field1052 == -1) {
							field1052 = field1058 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1068 = arg0.method251();
					} else if (var3 == 3) {
						field1078 = arg0.method252();
					} else if (var3 == 5) {
						int var6 = arg0.method244();
						if (var6 > 0) {
							if (field1062 == null || field1063) {
								field1079 = null;
								field1062 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1062[var7] = arg0.method246();
								}
							} else {
								arg0.field709 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1082 = arg0.method244();
					} else if (var3 == 15) {
						field1053 = arg0.method244();
					} else if (var3 == 17) {
						field1058 = false;
					} else if (var3 == 18) {
						field1064 = false;
					} else if (var3 == 19) {
						var2 = arg0.method244();
						if (var2 == 1) {
							field1038 = true;
						}
					} else if (var3 == 21) {
						field1080 = true;
					} else if (var3 == 22) {
						field1045 = true;
					} else if (var3 == 23) {
						field1074 = true;
					} else if (var3 == 24) {
						field1037 = arg0.method246();
						if (field1037 == 0xFFFF) {
							field1037 = -1;
						}
					} else if (var3 == 28) {
						field1054 = arg0.method244();
					} else if (var3 == 29) {
						field1040 = arg0.method245();
					} else if (var3 == 39) {
						field1047 = arg0.method245();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1059 == null) {
							field1059 = new String[5];
						}

						field1059[var3 - 30] = arg0.method251();
						if (field1059[var3 - 30].equalsIgnoreCase("hidden")) {
							field1059[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method244();
						field1061 = new int[var8];
						field1076 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1061[var9] = arg0.method246();
							field1076[var9] = arg0.method246();
						}
					} else if (var3 == 60) {
						field1050 = arg0.method246();
					} else if (var3 == 62) {
						field1073 = true;
					} else if (var3 == 64) {
						field1075 = false;
					} else if (var3 == 65) {
						field1056 = arg0.method246();
					} else if (var3 == 66) {
						field1039 = arg0.method246();
					} else if (var3 == 67) {
						field1044 = arg0.method246();
					} else if (var3 == 68) {
						field1041 = arg0.method246();
					} else if (var3 == 69) {
						field1071 = arg0.method244();
					} else if (var3 == 70) {
						field1070 = arg0.method247();
					} else if (var3 == 71) {
						field1069 = arg0.method247();
					} else if (var3 == 72) {
						field1046 = arg0.method247();
					} else if (var3 == 73) {
						field1077 = true;
					} else if (var3 == 74) {
						field1043 = true;
					} else if (var3 == 75) {
						field1052 = arg0.method244();
					} else if (var3 == 77) {
						field1057 = arg0.method246();
						if (field1057 == 0xFFFF) {
							field1057 = -1;
						}

						field1036 = arg0.method246();
						if (field1036 == 0xFFFF) {
							field1036 = -1;
						}

						int var10 = arg0.method244();
						field1055 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1055[var11] = arg0.method246();
							if (field1055[var11] == 0xFFFF) {
								field1055[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method244();
			} while (var4 <= 0);

			if (field1062 == null || field1063) {
				field1079 = new int[var4];
				field1062 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1062[var5] = arg0.method246();
					field1079[var5] = arg0.method244();
				}
			} else {
				arg0.field709 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("RFUKTMBK.a(ZI)Z")
	public final boolean method470(int arg0) {
		if (field1079 != null) {
			for (int var4 = 0; var4 < field1079.length; var4++) {
				if (field1079[var4] == arg0) {
					return VHYCWIPJ.method501(field1062[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1062 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1062.length; var3++) {
				var2 &= VHYCWIPJ.method501(field1062[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("RFUKTMBK.a()V")
	public final void method471() {
		field1062 = null;
		field1079 = null;
		field1068 = null;
		field1078 = null;
		field1061 = null;
		field1076 = null;
		field1082 = 1;
		field1053 = 1;
		field1058 = true;
		field1064 = true;
		field1038 = false;
		field1080 = false;
		field1045 = false;
		field1074 = false;
		field1037 = -1;
		field1054 = 16;
		field1040 = 0;
		field1047 = 0;
		field1059 = null;
		field1050 = -1;
		field1041 = -1;
		field1073 = false;
		field1075 = true;
		field1056 = 128;
		field1039 = 128;
		field1044 = 128;
		field1071 = 0;
		field1070 = 0;
		field1069 = 0;
		field1046 = 0;
		field1077 = false;
		field1043 = false;
		field1052 = -1;
		field1057 = -1;
		field1036 = -1;
		field1055 = null;
	}

	@ObfuscatedName("RFUKTMBK.d(I)LRFUKTMBK;")
	public static final RFUKTMBK method472(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1060[var1].field1051 == arg0) {
				return field1060[var1];
			}
		}

		field1042 = (field1042 + 1) % 20;
		RFUKTMBK var2 = field1060[field1042];
		field1066.field709 = field1065[arg0];
		var2.field1051 = arg0;
		var2.method471();
		var2.method469(field1066);
		return var2;
	}
}
