package deob;

@ObfuscatedName("SHDUUMNW")
public final class SHDUUMNW {

	@ObfuscatedName("SHDUUMNW.K")
	public int field1117 = -1;

	@ObfuscatedName("SHDUUMNW.c")
	public static GOHJFVWE field1085 = new GOHJFVWE(500);

	@ObfuscatedName("SHDUUMNW.d")
	public static GOHJFVWE field1086 = new GOHJFVWE(30);

	@ObfuscatedName("SHDUUMNW.n")
	public static OIBEFFXI[] field1096 = new OIBEFFXI[4];

	@ObfuscatedName("SHDUUMNW.o")
	public byte field1097;

	@ObfuscatedName("SHDUUMNW.D")
	public byte field1111;

	@ObfuscatedName("SHDUUMNW.b")
	public int field1084;

	@ObfuscatedName("SHDUUMNW.e")
	public int field1087;

	@ObfuscatedName("SHDUUMNW.f")
	public int field1088;

	@ObfuscatedName("SHDUUMNW.i")
	public static int field1091;

	@ObfuscatedName("SHDUUMNW.l")
	public int field1094;

	@ObfuscatedName("SHDUUMNW.q")
	public int field1099;

	@ObfuscatedName("SHDUUMNW.s")
	public int field1101;

	@ObfuscatedName("SHDUUMNW.t")
	public int field1102;

	@ObfuscatedName("SHDUUMNW.y")
	public static int field1106;

	@ObfuscatedName("SHDUUMNW.z")
	public int field1107;

	@ObfuscatedName("SHDUUMNW.G")
	public int field1113;

	@ObfuscatedName("SHDUUMNW.I")
	public int field1115;

	@ObfuscatedName("SHDUUMNW.J")
	public int field1116;

	@ObfuscatedName("SHDUUMNW.O")
	public int field1121;

	@ObfuscatedName("SHDUUMNW.Q")
	public int field1123;

	@ObfuscatedName("SHDUUMNW.S")
	public int field1124;

	@ObfuscatedName("SHDUUMNW.T")
	public int field1125;

	@ObfuscatedName("SHDUUMNW.V")
	public int field1127;

	@ObfuscatedName("SHDUUMNW.v")
	public static YOXDZEVD field1104;

	@ObfuscatedName("SHDUUMNW.U")
	public static client field1126;

	@ObfuscatedName("SHDUUMNW.M")
	public String field1119;

	@ObfuscatedName("SHDUUMNW.j")
	public boolean field1092;

	@ObfuscatedName("SHDUUMNW.k")
	public boolean field1093;

	@ObfuscatedName("SHDUUMNW.r")
	public boolean field1100;

	@ObfuscatedName("SHDUUMNW.u")
	public boolean field1103;

	@ObfuscatedName("SHDUUMNW.B")
	public boolean field1109;

	@ObfuscatedName("SHDUUMNW.F")
	public boolean field1112;

	@ObfuscatedName("SHDUUMNW.H")
	public boolean field1114;

	@ObfuscatedName("SHDUUMNW.L")
	public boolean field1118;

	@ObfuscatedName("SHDUUMNW.N")
	public static boolean field1120;

	@ObfuscatedName("SHDUUMNW.X")
	public boolean field1128;

	@ObfuscatedName("SHDUUMNW.Z")
	public boolean field1129;

	@ObfuscatedName("SHDUUMNW.P")
	public byte[] field1122;

	@ObfuscatedName("SHDUUMNW.a")
	public int[] field1083;

	@ObfuscatedName("SHDUUMNW.g")
	public int[] field1089;

	@ObfuscatedName("SHDUUMNW.h")
	public int[] field1090;

	@ObfuscatedName("SHDUUMNW.p")
	public int[] field1098;

	@ObfuscatedName("SHDUUMNW.w")
	public int[] field1105;

	@ObfuscatedName("SHDUUMNW.C")
	public static int[] field1110;

	@ObfuscatedName("SHDUUMNW.m")
	public static SHDUUMNW[] field1095;

	@ObfuscatedName("SHDUUMNW.A")
	public String[] field1108;

	@ObfuscatedName("SHDUUMNW.a(LUUFZOKXH;Z)V")
	public final void method403(UUFZOKXH arg0) {
		if (field1089 != null) {
			for (int var2 = 0; var2 < field1089.length; var2++) {
				arg0.method441(field1089[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("SHDUUMNW.a(LOTSGNSQM;)V")
	public static final void method404(OTSGNSQM arg0) {
		field1104 = new YOXDZEVD(arg0.method376("loc.dat", null));
		YOXDZEVD var1 = new YOXDZEVD(arg0.method376("loc.idx", null));
		field1106 = var1.method551();
		field1110 = new int[field1106];
		int var2 = 2;
		for (int var3 = 0; var3 < field1106; var3++) {
			field1110[var3] = var2;
			var2 += var1.method551();
		}

		field1095 = new SHDUUMNW[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1095[var4] = new SHDUUMNW();
		}
	}

	@ObfuscatedName("SHDUUMNW.a(IIIIIII)LOIBEFFXI;")
	public final OIBEFFXI method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		OIBEFFXI var8 = method409(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field1118 || field1128) {
			var8 = new OIBEFFXI(field1118, var8, field1128);
		}

		if (field1118) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field953; var10++) {
				int var11 = var8.field954[var10];
				int var12 = var8.field956[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field955[var10] += var15 - var9;
			}

			var8.method351();
		}

		return var8;
	}

	@ObfuscatedName("SHDUUMNW.a(I)LSHDUUMNW;")
	public final SHDUUMNW method406() {
		int var1 = -1;
		if (field1102 != -1) {
			SXQCXZWK var2 = SXQCXZWK.field1133[field1102];
			int var3 = var2.field1135;
			int var4 = var2.field1136;
			int var5 = var2.field1137;
			int var6 = client.field385[var5 - var4];
			var1 = field1126.field572[var3] >> var4 & var6;
		} else if (field1099 != -1) {
			var1 = field1126.field572[field1099];
		}

		if (var1 >= 0 && var1 < field1090.length && field1090[var1] != -1) {
			return method410(field1090[var1]);
		}

		return null;
	}

	@ObfuscatedName("SHDUUMNW.a(Z)V")
	public static final void method407() {
		field1085 = null;
		field1086 = null;
		field1110 = null;
		field1095 = null;
		field1104 = null;
	}

	@ObfuscatedName("SHDUUMNW.a(BLYOXDZEVD;)V")
	public final void method408(YOXDZEVD arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method549();
					if (var3 == 0) {
						if (var2 == -1) {
							field1109 = false;
							if (field1089 != null && (field1105 == null || field1105[0] == 10)) {
								field1109 = true;
							}

							if (field1108 != null) {
								field1109 = true;
							}
						}

						if (field1114) {
							field1093 = false;
							field1129 = false;
						}

						if (field1107 == -1) {
							field1107 = field1093 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1119 = arg0.method556();
					} else if (var3 == 3) {
						field1122 = arg0.method557();
					} else if (var3 == 5) {
						int var6 = arg0.method549();
						if (var6 > 0) {
							if (field1089 == null || field1120) {
								field1105 = null;
								field1089 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1089[var7] = arg0.method551();
								}
							} else {
								arg0.field1393 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1125 = arg0.method549();
					} else if (var3 == 15) {
						field1094 = arg0.method549();
					} else if (var3 == 17) {
						field1093 = false;
					} else if (var3 == 18) {
						field1129 = false;
					} else if (var3 == 19) {
						var2 = arg0.method549();
						if (var2 == 1) {
							field1109 = true;
						}
					} else if (var3 == 21) {
						field1118 = true;
					} else if (var3 == 22) {
						field1128 = true;
					} else if (var3 == 23) {
						field1103 = true;
					} else if (var3 == 24) {
						field1088 = arg0.method551();
						if (field1088 == 0xFFFF) {
							field1088 = -1;
						}
					} else if (var3 == 28) {
						field1116 = arg0.method549();
					} else if (var3 == 29) {
						field1111 = arg0.method550();
					} else if (var3 == 39) {
						field1097 = arg0.method550();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1108 == null) {
							field1108 = new String[5];
						}

						field1108[var3 - 30] = arg0.method556();
						if (field1108[var3 - 30].equalsIgnoreCase("hidden")) {
							field1108[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method549();
						field1083 = new int[var8];
						field1098 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1083[var9] = arg0.method551();
							field1098[var9] = arg0.method551();
						}
					} else if (var3 == 60) {
						field1124 = arg0.method551();
					} else if (var3 == 62) {
						field1112 = true;
					} else if (var3 == 64) {
						field1100 = false;
					} else if (var3 == 65) {
						field1084 = arg0.method551();
					} else if (var3 == 66) {
						field1121 = arg0.method551();
					} else if (var3 == 67) {
						field1113 = arg0.method551();
					} else if (var3 == 68) {
						field1127 = arg0.method551();
					} else if (var3 == 69) {
						field1101 = arg0.method549();
					} else if (var3 == 70) {
						field1123 = arg0.method552();
					} else if (var3 == 71) {
						field1087 = arg0.method552();
					} else if (var3 == 72) {
						field1115 = arg0.method552();
					} else if (var3 == 73) {
						field1092 = true;
					} else if (var3 == 74) {
						field1114 = true;
					} else if (var3 == 75) {
						field1107 = arg0.method549();
					} else if (var3 == 77) {
						field1102 = arg0.method551();
						if (field1102 == 0xFFFF) {
							field1102 = -1;
						}

						field1099 = arg0.method551();
						if (field1099 == 0xFFFF) {
							field1099 = -1;
						}

						int var10 = arg0.method549();
						field1090 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1090[var11] = arg0.method551();
							if (field1090[var11] == 0xFFFF) {
								field1090[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method549();
			} while (var4 <= 0);

			if (field1089 == null || field1120) {
				field1105 = new int[var4];
				field1089 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1089[var5] = arg0.method551();
					field1105[var5] = arg0.method549();
				}
			} else {
				arg0.field1393 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("SHDUUMNW.a(IIII)LOIBEFFXI;")
	public final OIBEFFXI method409(int arg0, int arg1, int arg2) {
		OIBEFFXI var4 = null;
		long var5;
		if (field1105 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1117 << 6) + arg0);
			OIBEFFXI var7 = (OIBEFFXI) field1086.method227(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1089 == null) {
				return null;
			}

			boolean var8 = field1112 ^ arg0 > 3;
			int var9 = field1089.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1089[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (OIBEFFXI) field1085.method227(var11);
				if (var4 == null) {
					var4 = OIBEFFXI.method346(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method361();
					}

					field1085.method228(var4, var11);
				}

				if (var9 > 1) {
					field1096[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new OIBEFFXI(field1096, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1105.length; var13++) {
				if (field1105[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field1117 << 6) + (var12 << 3) + arg0);
			OIBEFFXI var14 = (OIBEFFXI) field1086.method227(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1089[var12];
			boolean var16 = field1112 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (OIBEFFXI) field1085.method227(var15);
			if (var4 == null) {
				var4 = OIBEFFXI.method346(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method361();
				}

				field1085.method228(var4, var15);
			}
		}

		boolean var17;
		if (field1084 == 128 && field1121 == 128 && field1113 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1123 == 0 && field1087 == 0 && field1115 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		OIBEFFXI var19 = new OIBEFFXI(arg0 == 0 && arg1 == -1 && !var17 && !var18, field1083 == null, var4, UXVWESOT.method455(arg1));
		if (arg1 != -1) {
			var19.method353();
			var19.method354(arg1);
			var19.field985 = null;
			var19.field984 = null;
		}

		while (arg0-- > 0) {
			var19.method357();
		}

		if (field1083 != null) {
			for (int var20 = 0; var20 < field1083.length; var20++) {
				var19.method360(field1083[var20], field1098[var20]);
			}
		}

		if (var17) {
			var19.method362(field1121, field1084, field1113);
		}

		if (var18) {
			var19.method359(field1115, field1123, field1087);
		}

		var19.method363(field1111 + 64, field1097 * 5 + 768, -50, -10, -50, !field1128);

		if (field1107 == 1) {
			var19.field981 = var19.field1333;
		}

		field1086.method228(var19, var5);
		return var19;
	}

	@ObfuscatedName("SHDUUMNW.b(I)LSHDUUMNW;")
	public static final SHDUUMNW method410(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1095[var1].field1117 == arg0) {
				return field1095[var1];
			}
		}

		field1091 = (field1091 + 1) % 20;
		SHDUUMNW var2 = field1095[field1091];
		field1104.field1393 = field1110[arg0];
		var2.field1117 = arg0;
		var2.method412();
		var2.method408(field1104);
		return var2;
	}

	@ObfuscatedName("SHDUUMNW.a(ZI)Z")
	public final boolean method411(int arg0) {
		if (field1105 != null) {
			for (int var4 = 0; var4 < field1105.length; var4++) {
				if (field1105[var4] == arg0) {
					return OIBEFFXI.method347(field1089[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1089 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1089.length; var3++) {
				var2 &= OIBEFFXI.method347(field1089[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("SHDUUMNW.a()V")
	public final void method412() {
		field1089 = null;
		field1105 = null;
		field1119 = null;
		field1122 = null;
		field1083 = null;
		field1098 = null;
		field1125 = 1;
		field1094 = 1;
		field1093 = true;
		field1129 = true;
		field1109 = false;
		field1118 = false;
		field1128 = false;
		field1103 = false;
		field1088 = -1;
		field1116 = 16;
		field1111 = 0;
		field1097 = 0;
		field1108 = null;
		field1124 = -1;
		field1127 = -1;
		field1112 = false;
		field1100 = true;
		field1084 = 128;
		field1121 = 128;
		field1113 = 128;
		field1101 = 0;
		field1123 = 0;
		field1087 = 0;
		field1115 = 0;
		field1092 = false;
		field1114 = false;
		field1107 = -1;
		field1102 = -1;
		field1099 = -1;
		field1090 = null;
	}

	@ObfuscatedName("SHDUUMNW.c(I)Z")
	public final boolean method413() {
		if (field1089 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1089.length; var2++) {
			var1 &= OIBEFFXI.method347(field1089[var2] & 0xFFFF);
		}

		return var1;
	}
}
