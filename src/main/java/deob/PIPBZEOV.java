package deob;

@ObfuscatedName("PIPBZEOV")
public final class PIPBZEOV {

	@ObfuscatedName("PIPBZEOV.d")
	public int field1068 = -1;

	@ObfuscatedName("PIPBZEOV.e")
	public int field1069 = -1;

	@ObfuscatedName("PIPBZEOV.f")
	public boolean field1070 = true;

	@ObfuscatedName("PIPBZEOV.g")
	public int field1071 = 128;

	@ObfuscatedName("PIPBZEOV.k")
	public int field1075 = -1;

	@ObfuscatedName("PIPBZEOV.l")
	public int field1076 = -1;

	@ObfuscatedName("PIPBZEOV.m")
	public int field1077 = 128;

	@ObfuscatedName("PIPBZEOV.p")
	public String field1080 = "null";

	@ObfuscatedName("PIPBZEOV.s")
	public boolean field1083 = true;

	@ObfuscatedName("PIPBZEOV.t")
	public int field1084 = -1;

	@ObfuscatedName("PIPBZEOV.u")
	public long field1085 = -1L;

	@ObfuscatedName("PIPBZEOV.x")
	public int field1087 = -1;

	@ObfuscatedName("PIPBZEOV.z")
	public int field1089 = -1;

	@ObfuscatedName("PIPBZEOV.A")
	public int field1090 = -1;

	@ObfuscatedName("PIPBZEOV.E")
	public int field1094 = -1;

	@ObfuscatedName("PIPBZEOV.F")
	public byte field1095 = 1;

	@ObfuscatedName("PIPBZEOV.H")
	public int field1097 = -1;

	@ObfuscatedName("PIPBZEOV.I")
	public int field1098 = -1;

	@ObfuscatedName("PIPBZEOV.K")
	public int field1100 = -1;

	@ObfuscatedName("PIPBZEOV.L")
	public boolean field1101 = false;

	@ObfuscatedName("PIPBZEOV.M")
	public int field1102 = 32;

	@ObfuscatedName("PIPBZEOV.J")
	public static EQSIBNHW field1099 = new EQSIBNHW(30);

	@ObfuscatedName("PIPBZEOV.a")
	public static int field1066;

	@ObfuscatedName("PIPBZEOV.o")
	public int field1079;

	@ObfuscatedName("PIPBZEOV.C")
	public static int field1092;

	@ObfuscatedName("PIPBZEOV.G")
	public int field1096;

	@ObfuscatedName("PIPBZEOV.y")
	public static SVWJKJVI field1088;

	@ObfuscatedName("PIPBZEOV.w")
	public static client field1086;

	@ObfuscatedName("PIPBZEOV.b")
	public byte[] field1067;

	@ObfuscatedName("PIPBZEOV.h")
	public int[] field1072;

	@ObfuscatedName("PIPBZEOV.j")
	public int[] field1074;

	@ObfuscatedName("PIPBZEOV.n")
	public int[] field1078;

	@ObfuscatedName("PIPBZEOV.q")
	public int[] field1081;

	@ObfuscatedName("PIPBZEOV.r")
	public int[] field1082;

	@ObfuscatedName("PIPBZEOV.D")
	public static int[] field1093;

	@ObfuscatedName("PIPBZEOV.i")
	public static PIPBZEOV[] field1073;

	@ObfuscatedName("PIPBZEOV.B")
	public String[] field1091;

	@ObfuscatedName("PIPBZEOV.a(Z)Z")
	public boolean method394() {
		if (field1082 == null) {
			return true;
		}

		int var1 = -1;
		if (field1090 != -1) {
			GQWQHTHS var2 = GQWQHTHS.field557[field1090];
			int var3 = var2.field559;
			int var4 = var2.field560;
			int var5 = var2.field561;
			int var6 = client.field191[var5 - var4];
			var1 = field1086.field178[var3] >> var4 & var6;
		} else if (field1097 != -1) {
			var1 = field1086.field178[field1097];
		}

		if (var1 >= 0 && var1 < field1082.length && field1082[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("PIPBZEOV.a(ILSVWJKJVI;)V")
	public final void method395(SVWJKJVI arg0) {
		while (true) {
			int var2 = arg0.method461();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method461();
				field1072 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1072[var4] = arg0.method463();
				}
			} else if (var2 == 2) {
				field1080 = arg0.method468();
			} else if (var2 == 3) {
				field1067 = arg0.method469();
			} else if (var2 == 12) {
				field1095 = arg0.method462();
			} else if (var2 == 13) {
				field1075 = arg0.method463();
			} else if (var2 == 14) {
				field1076 = arg0.method463();
			} else if (var2 == 17) {
				field1076 = arg0.method463();
				field1098 = arg0.method463();
				field1100 = arg0.method463();
				field1069 = arg0.method463();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1091 == null) {
					field1091 = new String[5];
				}

				field1091[var2 - 30] = arg0.method468();
				if (field1091[var2 - 30].equalsIgnoreCase("hidden")) {
					field1091[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method461();
				field1081 = new int[var5];
				field1078 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1081[var6] = arg0.method463();
					field1078[var6] = arg0.method463();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method461();
				field1074 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1074[var8] = arg0.method463();
				}
			} else if (var2 == 90) {
				field1084 = arg0.method463();
			} else if (var2 == 91) {
				field1068 = arg0.method463();
			} else if (var2 == 92) {
				field1087 = arg0.method463();
			} else if (var2 == 93) {
				field1083 = false;
			} else if (var2 == 95) {
				field1094 = arg0.method463();
			} else if (var2 == 97) {
				field1071 = arg0.method463();
			} else if (var2 == 98) {
				field1077 = arg0.method463();
			} else if (var2 == 99) {
				field1101 = true;
			} else if (var2 == 100) {
				field1096 = arg0.method462();
			} else if (var2 == 101) {
				field1079 = arg0.method462() * 5;
			} else if (var2 == 102) {
				field1089 = arg0.method463();
			} else if (var2 == 103) {
				field1102 = arg0.method463();
			} else if (var2 == 106) {
				field1090 = arg0.method463();
				if (field1090 == 0xFFFF) {
					field1090 = -1;
				}

				field1097 = arg0.method463();
				if (field1097 == 0xFFFF) {
					field1097 = -1;
				}

				int var9 = arg0.method461();
				field1082 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1082[var10] = arg0.method463();
					if (field1082[var10] == 0xFFFF) {
						field1082[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1070 = false;
			}
		}
	}

	@ObfuscatedName("PIPBZEOV.a(LWEMOPWVJ;)V")
	public static final void method396(WEMOPWVJ arg0) {
		field1088 = new SVWJKJVI(arg0.method559("npc.dat", null));
		SVWJKJVI var1 = new SVWJKJVI(arg0.method559("npc.idx", null));
		field1092 = var1.method463();
		field1093 = new int[field1092];
		int var2 = 2;
		for (int var3 = 0; var3 < field1092; var3++) {
			field1093[var3] = var2;
			var2 += var1.method463();
		}

		field1073 = new PIPBZEOV[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1073[var4] = new PIPBZEOV();
		}
	}

	@ObfuscatedName("PIPBZEOV.a(I)LPIPBZEOV;")
	public final PIPBZEOV method397() {
		int var1 = -1;
		if (field1090 != -1) {
			GQWQHTHS var2 = GQWQHTHS.field557[field1090];
			int var3 = var2.field559;
			int var4 = var2.field560;
			int var5 = var2.field561;
			int var6 = client.field191[var5 - var4];
			var1 = field1086.field178[var3] >> var4 & var6;
		} else if (field1097 != -1) {
			var1 = field1086.field178[field1097];
		}

		if (var1 >= 0 && var1 < field1082.length && field1082[var1] != -1) {
			return method398(field1082[var1]);
		}

		return null;
	}

	@ObfuscatedName("PIPBZEOV.b(I)LPIPBZEOV;")
	public static final PIPBZEOV method398(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1073[var1].field1085) {
				return field1073[var1];
			}
		}

		field1066 = (field1066 + 1) % 20;
		PIPBZEOV var2 = field1073[field1066] = new PIPBZEOV();
		field1088.field1263 = field1093[arg0];
		var2.field1085 = arg0;
		var2.method395(field1088);
		return var2;
	}

	@ObfuscatedName("PIPBZEOV.c(I)LIYSWJGDE;")
	public final IYSWJGDE method399() {
		if (field1082 != null) {
			PIPBZEOV var1 = method397();
			if (var1 == null) {
				return null;
			}

			return var1.method399();
		} else if (field1074 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1074.length; var3++) {
				if (!IYSWJGDE.method274(field1074[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			IYSWJGDE[] var4 = new IYSWJGDE[field1074.length];
			for (int var5 = 0; var5 < field1074.length; var5++) {
				var4[var5] = IYSWJGDE.method273(field1074[var5]);
			}

			IYSWJGDE var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new IYSWJGDE(var4.length, var4);
			}

			if (field1081 != null) {
				for (int var7 = 0; var7 < field1081.length; var7++) {
					var6.method287(field1081[var7], field1078[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("PIPBZEOV.d(I)V")
	public static final void method400() {
		field1099 = null;
		field1093 = null;
		field1073 = null;
		field1088 = null;
	}

	@ObfuscatedName("PIPBZEOV.a(I[III)LIYSWJGDE;")
	public final IYSWJGDE method401(int[] arg0, int arg1, int arg2) {
		if (field1082 != null) {
			PIPBZEOV var4 = method397();
			if (var4 == null) {
				return null;
			}

			return var4.method401(arg0, arg1, arg2);
		}

		IYSWJGDE var5 = (IYSWJGDE) field1099.method175(field1085);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1072.length; var7++) {
				if (!IYSWJGDE.method274(field1072[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			IYSWJGDE[] var8 = new IYSWJGDE[field1072.length];
			for (int var9 = 0; var9 < field1072.length; var9++) {
				var8[var9] = IYSWJGDE.method273(field1072[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new IYSWJGDE(var8.length, var8);
			}

			if (field1081 != null) {
				for (int var10 = 0; var10 < field1081.length; var10++) {
					var5.method287(field1081[var10], field1078[var10]);
				}
			}

			var5.method280();
			var5.method290(field1096 + 64, field1079 + 850, -30, -50, -30, true);
			field1099.method176(field1085, var5);
		}

		IYSWJGDE var11 = IYSWJGDE.field715;
		var11.method275(PLSPTEPI.method406(arg1) & PLSPTEPI.method406(arg2), var5);

		if (arg1 != -1 && arg2 != -1) {
			var11.method282(arg2, arg1, arg0);
		} else if (arg1 != -1) {
			var11.method281(arg1);
		}

		if (field1071 != 128 || field1077 != 128) {
			var11.method289(field1071, field1071, field1077);
		}

		var11.method277();
		var11.field751 = null;
		var11.field750 = null;

		if (field1095 == 1) {
			var11.field752 = true;
		}

		return var11;
	}
}
