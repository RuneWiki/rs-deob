package deob;

@ObfuscatedName("NIJEYEOX")
public final class NIJEYEOX {

	@ObfuscatedName("NIJEYEOX.b")
	public byte field1075 = 1;

	@ObfuscatedName("NIJEYEOX.c")
	public int field1076 = -1;

	@ObfuscatedName("NIJEYEOX.d")
	public int field1077 = -1;

	@ObfuscatedName("NIJEYEOX.e")
	public int field1078 = -1;

	@ObfuscatedName("NIJEYEOX.f")
	public String field1079 = "null";

	@ObfuscatedName("NIJEYEOX.j")
	public long field1083 = -1L;

	@ObfuscatedName("NIJEYEOX.k")
	public int field1084 = -1;

	@ObfuscatedName("NIJEYEOX.l")
	public int field1085 = -1;

	@ObfuscatedName("NIJEYEOX.m")
	public int field1086 = -1;

	@ObfuscatedName("NIJEYEOX.n")
	public int field1087 = -1;

	@ObfuscatedName("NIJEYEOX.o")
	public int field1088 = -1;

	@ObfuscatedName("NIJEYEOX.r")
	public int field1090 = -1;

	@ObfuscatedName("NIJEYEOX.u")
	public int field1093 = -1;

	@ObfuscatedName("NIJEYEOX.z")
	public int field1097 = 128;

	@ObfuscatedName("NIJEYEOX.A")
	public int field1098 = -1;

	@ObfuscatedName("NIJEYEOX.D")
	public boolean field1101 = true;

	@ObfuscatedName("NIJEYEOX.E")
	public int field1102 = 128;

	@ObfuscatedName("NIJEYEOX.I")
	public boolean field1104 = false;

	@ObfuscatedName("NIJEYEOX.J")
	public int field1105 = -1;

	@ObfuscatedName("NIJEYEOX.K")
	public boolean field1106 = true;

	@ObfuscatedName("NIJEYEOX.N")
	public int field1109 = 32;

	@ObfuscatedName("NIJEYEOX.C")
	public static QASTZCLF field1100 = new QASTZCLF(30);

	@ObfuscatedName("NIJEYEOX.a")
	public int field1074;

	@ObfuscatedName("NIJEYEOX.t")
	public int field1092;

	@ObfuscatedName("NIJEYEOX.x")
	public static int field1096;

	@ObfuscatedName("NIJEYEOX.O")
	public static int field1110;

	@ObfuscatedName("NIJEYEOX.s")
	public static IUVBENCV field1091;

	@ObfuscatedName("NIJEYEOX.B")
	public static client field1099;

	@ObfuscatedName("NIJEYEOX.L")
	public byte[] field1107;

	@ObfuscatedName("NIJEYEOX.i")
	public int[] field1082;

	@ObfuscatedName("NIJEYEOX.p")
	public int[] field1089;

	@ObfuscatedName("NIJEYEOX.v")
	public int[] field1094;

	@ObfuscatedName("NIJEYEOX.w")
	public int[] field1095;

	@ObfuscatedName("NIJEYEOX.F")
	public static int[] field1103;

	@ObfuscatedName("NIJEYEOX.M")
	public int[] field1108;

	@ObfuscatedName("NIJEYEOX.h")
	public static NIJEYEOX[] field1081;

	@ObfuscatedName("NIJEYEOX.g")
	public String[] field1080;

	@ObfuscatedName("NIJEYEOX.a(I)LNIJEYEOX;")
	public final NIJEYEOX method362() {
		int var1 = -1;
		if (field1088 != -1) {
			EHPXVLSO var2 = EHPXVLSO.field623[field1088];
			int var3 = var2.field625;
			int var4 = var2.field626;
			int var5 = var2.field627;
			int var6 = client.field291[var5 - var4];
			var1 = field1099.field142[var3] >> var4 & var6;
		} else if (field1077 != -1) {
			var1 = field1099.field142[field1077];
		}

		if (var1 >= 0 && var1 < field1094.length && field1094[var1] != -1) {
			return method363(field1094[var1]);
		}

		return null;
	}

	@ObfuscatedName("NIJEYEOX.b(I)LNIJEYEOX;")
	public static final NIJEYEOX method363(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1081[var1].field1083) {
				return field1081[var1];
			}
		}

		field1110 = (field1110 + 1) % 20;
		NIJEYEOX var2 = field1081[field1110] = new NIJEYEOX();
		field1091.field733 = field1103[arg0];
		var2.field1083 = arg0;
		var2.method367(field1091);
		return var2;
	}

	@ObfuscatedName("NIJEYEOX.a(Z)LJJMVUSJJ;")
	public final JJMVUSJJ method364() {
		if (field1094 != null) {
			NIJEYEOX var1 = method362();
			if (var1 == null) {
				return null;
			}

			return var1.method364();
		} else if (field1089 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1089.length; var3++) {
				if (!JJMVUSJJ.method301(field1089[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			JJMVUSJJ[] var4 = new JJMVUSJJ[field1089.length];
			for (int var5 = 0; var5 < field1089.length; var5++) {
				var4[var5] = JJMVUSJJ.method300(field1089[var5]);
			}

			JJMVUSJJ var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new JJMVUSJJ(var4, var4.length);
			}

			if (field1108 != null) {
				for (int var7 = 0; var7 < field1108.length; var7++) {
					var6.method314(field1108[var7], field1082[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("NIJEYEOX.a(LAWEEREDT;)V")
	public static final void method365(AWEEREDT arg0) {
		field1091 = new IUVBENCV(arg0.method14("npc.dat", null));
		IUVBENCV var1 = new IUVBENCV(arg0.method14("npc.idx", null));
		field1096 = var1.method247();
		field1103 = new int[field1096];
		int var2 = 2;
		for (int var3 = 0; var3 < field1096; var3++) {
			field1103[var3] = var2;
			var2 += var1.method247();
		}

		field1081 = new NIJEYEOX[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1081[var4] = new NIJEYEOX();
		}
	}

	@ObfuscatedName("NIJEYEOX.b(Z)V")
	public static final void method366() {
		field1100 = null;
		field1103 = null;
		field1081 = null;
		field1091 = null;
	}

	@ObfuscatedName("NIJEYEOX.a(LIUVBENCV;B)V")
	public final void method367(IUVBENCV arg0) {
		while (true) {
			int var2 = arg0.method245();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method245();
				field1095 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1095[var4] = arg0.method247();
				}
			} else if (var2 == 2) {
				field1079 = arg0.method252();
			} else if (var2 == 3) {
				field1107 = arg0.method253();
			} else if (var2 == 12) {
				field1075 = arg0.method246();
			} else if (var2 == 13) {
				field1084 = arg0.method247();
			} else if (var2 == 14) {
				field1085 = arg0.method247();
			} else if (var2 == 17) {
				field1085 = arg0.method247();
				field1078 = arg0.method247();
				field1090 = arg0.method247();
				field1087 = arg0.method247();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1080 == null) {
					field1080 = new String[5];
				}

				field1080[var2 - 30] = arg0.method252();
				if (field1080[var2 - 30].equalsIgnoreCase("hidden")) {
					field1080[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method245();
				field1108 = new int[var5];
				field1082 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1108[var6] = arg0.method247();
					field1082[var6] = arg0.method247();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method245();
				field1089 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1089[var8] = arg0.method247();
				}
			} else if (var2 == 90) {
				field1098 = arg0.method247();
			} else if (var2 == 91) {
				field1086 = arg0.method247();
			} else if (var2 == 92) {
				field1076 = arg0.method247();
			} else if (var2 == 93) {
				field1106 = false;
			} else if (var2 == 95) {
				field1105 = arg0.method247();
			} else if (var2 == 97) {
				field1102 = arg0.method247();
			} else if (var2 == 98) {
				field1097 = arg0.method247();
			} else if (var2 == 99) {
				field1104 = true;
			} else if (var2 == 100) {
				field1074 = arg0.method246();
			} else if (var2 == 101) {
				field1092 = arg0.method246() * 5;
			} else if (var2 == 102) {
				field1093 = arg0.method247();
			} else if (var2 == 103) {
				field1109 = arg0.method247();
			} else if (var2 == 106) {
				field1088 = arg0.method247();
				if (field1088 == 0xFFFF) {
					field1088 = -1;
				}

				field1077 = arg0.method247();
				if (field1077 == 0xFFFF) {
					field1077 = -1;
				}

				int var9 = arg0.method245();
				field1094 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1094[var10] = arg0.method247();
					if (field1094[var10] == 0xFFFF) {
						field1094[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1101 = false;
			}
		}
	}

	@ObfuscatedName("NIJEYEOX.a(III[I)LJJMVUSJJ;")
	public final JJMVUSJJ method368(int arg0, int arg1, int[] arg2) {
		if (field1094 != null) {
			NIJEYEOX var4 = method362();
			if (var4 == null) {
				return null;
			}

			return var4.method368(arg0, arg1, arg2);
		}

		JJMVUSJJ var5 = (JJMVUSJJ) field1100.method438(field1083);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1095.length; var7++) {
				if (!JJMVUSJJ.method301(field1095[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			JJMVUSJJ[] var8 = new JJMVUSJJ[field1095.length];
			for (int var9 = 0; var9 < field1095.length; var9++) {
				var8[var9] = JJMVUSJJ.method300(field1095[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new JJMVUSJJ(var8, var8.length);
			}

			if (field1108 != null) {
				for (int var10 = 0; var10 < field1108.length; var10++) {
					var5.method314(field1108[var10], field1082[var10]);
				}
			}

			var5.method307();
			var5.method317(field1074 + 64, field1092 + 850, -30, -50, -30, true);
			field1100.method439(var5, field1083);
		}

		JJMVUSJJ var11 = JJMVUSJJ.field798;
		var11.method302(var5, OJYMITMR.method382(arg0) & OJYMITMR.method382(arg1));

		if (arg0 != -1 && arg1 != -1) {
			var11.method309(arg1, arg2, arg0);
		} else if (arg0 != -1) {
			var11.method308(arg0);
		}

		if (field1102 != 128 || field1097 != 128) {
			var11.method316(field1097, field1102, field1102);
		}

		var11.method304();
		var11.field834 = null;
		var11.field833 = null;

		if (field1075 == 1) {
			var11.field835 = true;
		}

		return var11;
	}

	@ObfuscatedName("NIJEYEOX.c(I)Z")
	public boolean method369() {
		if (field1094 == null) {
			return true;
		}

		int var1 = -1;
		if (field1088 != -1) {
			EHPXVLSO var2 = EHPXVLSO.field623[field1088];
			int var3 = var2.field625;
			int var4 = var2.field626;
			int var5 = var2.field627;
			int var6 = client.field291[var5 - var4];
			var1 = field1099.field142[var3] >> var4 & var6;
		} else if (field1077 != -1) {
			var1 = field1099.field142[field1077];
		}

		if (var1 >= 0 && var1 < field1094.length && field1094[var1] != -1) {
			return true;
		}

		return false;
	}
}
