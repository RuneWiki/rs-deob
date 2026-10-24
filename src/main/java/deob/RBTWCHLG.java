package deob;

@ObfuscatedName("RBTWCHLG")
public final class RBTWCHLG {

	@ObfuscatedName("RBTWCHLG.c")
	public byte field1053 = 1;

	@ObfuscatedName("RBTWCHLG.d")
	public boolean field1054 = false;

	@ObfuscatedName("RBTWCHLG.i")
	public int field1059 = -1;

	@ObfuscatedName("RBTWCHLG.j")
	public int field1060 = 128;

	@ObfuscatedName("RBTWCHLG.k")
	public int field1061 = -1;

	@ObfuscatedName("RBTWCHLG.l")
	public long field1062 = -1L;

	@ObfuscatedName("RBTWCHLG.o")
	public int field1065 = -1;

	@ObfuscatedName("RBTWCHLG.s")
	public int field1068 = -1;

	@ObfuscatedName("RBTWCHLG.u")
	public boolean field1070 = true;

	@ObfuscatedName("RBTWCHLG.v")
	public int field1071 = 32;

	@ObfuscatedName("RBTWCHLG.w")
	public boolean field1072 = true;

	@ObfuscatedName("RBTWCHLG.z")
	public int field1074 = -1;

	@ObfuscatedName("RBTWCHLG.A")
	public int field1075 = 128;

	@ObfuscatedName("RBTWCHLG.E")
	public int field1079 = -1;

	@ObfuscatedName("RBTWCHLG.F")
	public int field1080 = -1;

	@ObfuscatedName("RBTWCHLG.G")
	public int field1081 = -1;

	@ObfuscatedName("RBTWCHLG.H")
	public int field1082 = -1;

	@ObfuscatedName("RBTWCHLG.J")
	public int field1083 = -1;

	@ObfuscatedName("RBTWCHLG.K")
	public int field1084 = -1;

	@ObfuscatedName("RBTWCHLG.N")
	public int field1085 = -1;

	@ObfuscatedName("RBTWCHLG.n")
	public static OOTLZHQB field1064 = new OOTLZHQB(30);

	@ObfuscatedName("RBTWCHLG.f")
	public int field1056;

	@ObfuscatedName("RBTWCHLG.g")
	public static int field1057;

	@ObfuscatedName("RBTWCHLG.h")
	public static int field1058;

	@ObfuscatedName("RBTWCHLG.q")
	public int field1066;

	@ObfuscatedName("RBTWCHLG.m")
	public static JHKSAGUC field1063;

	@ObfuscatedName("RBTWCHLG.D")
	public static client field1078;

	@ObfuscatedName("RBTWCHLG.e")
	public String field1055;

	@ObfuscatedName("RBTWCHLG.Q")
	public byte[] field1088;

	@ObfuscatedName("RBTWCHLG.t")
	public int[] field1069;

	@ObfuscatedName("RBTWCHLG.y")
	public int[] field1073;

	@ObfuscatedName("RBTWCHLG.B")
	public int[] field1076;

	@ObfuscatedName("RBTWCHLG.C")
	public int[] field1077;

	@ObfuscatedName("RBTWCHLG.O")
	public int[] field1086;

	@ObfuscatedName("RBTWCHLG.P")
	public static int[] field1087;

	@ObfuscatedName("RBTWCHLG.r")
	public static RBTWCHLG[] field1067;

	@ObfuscatedName("RBTWCHLG.a")
	public String[] field1052;

	@ObfuscatedName("RBTWCHLG.a([IIII)LRTQSBWRH;")
	public final RTQSBWRH method443(int[] arg0, int arg1, int arg2) {
		if (field1077 != null) {
			RBTWCHLG var4 = method448();
			if (var4 == null) {
				return null;
			}

			return var4.method443(arg0, arg1, arg2);
		}

		RTQSBWRH var5 = (RTQSBWRH) field1064.method386(field1062);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1069.length; var7++) {
				if (!RTQSBWRH.method455(field1069[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			RTQSBWRH[] var8 = new RTQSBWRH[field1069.length];
			for (int var9 = 0; var9 < field1069.length; var9++) {
				var8[var9] = RTQSBWRH.method454(field1069[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new RTQSBWRH(var8.length, var8);
			}

			if (field1076 != null) {
				for (int var10 = 0; var10 < field1076.length; var10++) {
					var5.method468(field1076[var10], field1086[var10]);
				}
			}

			var5.method461();
			var5.method471(field1066 + 64, field1056 + 850, -30, -50, -30, true);
			field1064.method387(field1062, var5);
		}

		RTQSBWRH var11 = RTQSBWRH.field1090;
		var11.method456(EMBMBPSC.method229(arg2) & EMBMBPSC.method229(arg1), var5);

		if (arg2 != -1 && arg1 != -1) {
			var11.method463(arg0, arg1, arg2);
		} else if (arg2 != -1) {
			var11.method462(arg2);
		}

		if (field1075 != 128 || field1060 != 128) {
			var11.method470(field1060, field1075, field1075);
		}

		var11.method458();
		var11.field1127 = null;
		var11.field1126 = null;

		if (field1053 == 1) {
			var11.field1128 = true;
		}

		return var11;
	}

	@ObfuscatedName("RBTWCHLG.a(LJHKSAGUC;I)V")
	public final void method444(JHKSAGUC arg0) {
		while (true) {
			int var2 = arg0.method306();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method306();
				field1069 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1069[var4] = arg0.method308();
				}
			} else if (var2 == 2) {
				field1055 = arg0.method313();
			} else if (var2 == 3) {
				field1088 = arg0.method314();
			} else if (var2 == 12) {
				field1053 = arg0.method307();
			} else if (var2 == 13) {
				field1081 = arg0.method308();
			} else if (var2 == 14) {
				field1084 = arg0.method308();
			} else if (var2 == 17) {
				field1084 = arg0.method308();
				field1079 = arg0.method308();
				field1074 = arg0.method308();
				field1061 = arg0.method308();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1052 == null) {
					field1052 = new String[5];
				}

				field1052[var2 - 30] = arg0.method313();
				if (field1052[var2 - 30].equalsIgnoreCase("hidden")) {
					field1052[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method306();
				field1076 = new int[var5];
				field1086 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1076[var6] = arg0.method308();
					field1086[var6] = arg0.method308();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method306();
				field1073 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1073[var8] = arg0.method308();
				}
			} else if (var2 == 90) {
				field1065 = arg0.method308();
			} else if (var2 == 91) {
				field1083 = arg0.method308();
			} else if (var2 == 92) {
				field1080 = arg0.method308();
			} else if (var2 == 93) {
				field1070 = false;
			} else if (var2 == 95) {
				field1059 = arg0.method308();
			} else if (var2 == 97) {
				field1075 = arg0.method308();
			} else if (var2 == 98) {
				field1060 = arg0.method308();
			} else if (var2 == 99) {
				field1054 = true;
			} else if (var2 == 100) {
				field1066 = arg0.method307();
			} else if (var2 == 101) {
				field1056 = arg0.method307() * 5;
			} else if (var2 == 102) {
				field1068 = arg0.method308();
			} else if (var2 == 103) {
				field1071 = arg0.method308();
			} else if (var2 == 106) {
				field1085 = arg0.method308();
				if (field1085 == 0xFFFF) {
					field1085 = -1;
				}

				field1082 = arg0.method308();
				if (field1082 == 0xFFFF) {
					field1082 = -1;
				}

				int var9 = arg0.method306();
				field1077 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1077[var10] = arg0.method308();
					if (field1077[var10] == 0xFFFF) {
						field1077[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1072 = false;
			}
		}
	}

	@ObfuscatedName("RBTWCHLG.a(LHRXSNEYZ;)V")
	public static final void method445(HRXSNEYZ arg0) {
		field1063 = new JHKSAGUC(arg0.method289("npc.dat", null));
		JHKSAGUC var1 = new JHKSAGUC(arg0.method289("npc.idx", null));
		field1058 = var1.method308();
		field1087 = new int[field1058];
		int var2 = 2;
		for (int var3 = 0; var3 < field1058; var3++) {
			field1087[var3] = var2;
			var2 += var1.method308();
		}

		field1067 = new RBTWCHLG[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1067[var4] = new RBTWCHLG();
		}
	}

	@ObfuscatedName("RBTWCHLG.a(I)V")
	public static final void method446() {
		field1064 = null;
		field1087 = null;
		field1067 = null;
		field1063 = null;
	}

	@ObfuscatedName("RBTWCHLG.a(B)LRTQSBWRH;")
	public final RTQSBWRH method447() {
		if (field1077 != null) {
			RBTWCHLG var1 = method448();
			if (var1 == null) {
				return null;
			}

			return var1.method447();
		} else if (field1073 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1073.length; var3++) {
				if (!RTQSBWRH.method455(field1073[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			RTQSBWRH[] var4 = new RTQSBWRH[field1073.length];
			for (int var5 = 0; var5 < field1073.length; var5++) {
				var4[var5] = RTQSBWRH.method454(field1073[var5]);
			}

			RTQSBWRH var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new RTQSBWRH(var4.length, var4);
			}

			if (field1076 != null) {
				for (int var7 = 0; var7 < field1076.length; var7++) {
					var6.method468(field1076[var7], field1086[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("RBTWCHLG.a(Z)LRBTWCHLG;")
	public final RBTWCHLG method448() {
		int var1 = -1;
		if (field1085 != -1) {
			AIRUOZLB var2 = AIRUOZLB.field4[field1085];
			int var3 = var2.field6;
			int var4 = var2.field7;
			int var5 = var2.field8;
			int var6 = client.field500[var5 - var4];
			var1 = field1078.field418[var3] >> var4 & var6;
		} else if (field1082 != -1) {
			var1 = field1078.field418[field1082];
		}

		if (var1 >= 0 && var1 < field1077.length && field1077[var1] != -1) {
			return method449(field1077[var1]);
		}

		return null;
	}

	@ObfuscatedName("RBTWCHLG.b(I)LRBTWCHLG;")
	public static final RBTWCHLG method449(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1067[var1].field1062) {
				return field1067[var1];
			}
		}

		field1057 = (field1057 + 1) % 20;
		RBTWCHLG var2 = field1067[field1057] = new RBTWCHLG();
		field1063.field752 = field1087[arg0];
		var2.field1062 = arg0;
		var2.method444(field1063);
		return var2;
	}
}
