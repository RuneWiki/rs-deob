package deob;

@ObfuscatedName("SHKUIFHF")
public final class SHKUIFHF {

	@ObfuscatedName("SHKUIFHF.b")
	public boolean field1139 = true;

	@ObfuscatedName("SHKUIFHF.d")
	public int field1141 = -1;

	@ObfuscatedName("SHKUIFHF.h")
	public int field1145 = -1;

	@ObfuscatedName("SHKUIFHF.k")
	public int field1148 = 32;

	@ObfuscatedName("SHKUIFHF.l")
	public boolean field1149 = true;

	@ObfuscatedName("SHKUIFHF.p")
	public byte field1153 = 1;

	@ObfuscatedName("SHKUIFHF.q")
	public long field1154 = -1L;

	@ObfuscatedName("SHKUIFHF.s")
	public int field1155 = -1;

	@ObfuscatedName("SHKUIFHF.t")
	public int field1156 = 128;

	@ObfuscatedName("SHKUIFHF.u")
	public String field1157 = "null";

	@ObfuscatedName("SHKUIFHF.w")
	public int field1159 = -1;

	@ObfuscatedName("SHKUIFHF.A")
	public int field1162 = -1;

	@ObfuscatedName("SHKUIFHF.B")
	public int field1163 = -1;

	@ObfuscatedName("SHKUIFHF.C")
	public int field1164 = -1;

	@ObfuscatedName("SHKUIFHF.D")
	public int field1165 = -1;

	@ObfuscatedName("SHKUIFHF.H")
	public int field1168 = -1;

	@ObfuscatedName("SHKUIFHF.I")
	public int field1169 = -1;

	@ObfuscatedName("SHKUIFHF.J")
	public int field1170 = 128;

	@ObfuscatedName("SHKUIFHF.K")
	public int field1171 = -1;

	@ObfuscatedName("SHKUIFHF.M")
	public int field1172 = -1;

	@ObfuscatedName("SHKUIFHF.N")
	public boolean field1173 = false;

	@ObfuscatedName("SHKUIFHF.f")
	public static RYXFUVWJ field1143 = new RYXFUVWJ(30);

	@ObfuscatedName("SHKUIFHF.n")
	public static int field1151;

	@ObfuscatedName("SHKUIFHF.v")
	public static int field1158;

	@ObfuscatedName("SHKUIFHF.E")
	public int field1166;

	@ObfuscatedName("SHKUIFHF.O")
	public int field1174;

	@ObfuscatedName("SHKUIFHF.i")
	public static BFQIDHPO field1146;

	@ObfuscatedName("SHKUIFHF.m")
	public static client field1150;

	@ObfuscatedName("SHKUIFHF.e")
	public byte[] field1142;

	@ObfuscatedName("SHKUIFHF.c")
	public int[] field1140;

	@ObfuscatedName("SHKUIFHF.g")
	public int[] field1144;

	@ObfuscatedName("SHKUIFHF.j")
	public int[] field1147;

	@ObfuscatedName("SHKUIFHF.o")
	public static int[] field1152;

	@ObfuscatedName("SHKUIFHF.z")
	public int[] field1161;

	@ObfuscatedName("SHKUIFHF.F")
	public int[] field1167;

	@ObfuscatedName("SHKUIFHF.y")
	public static SHKUIFHF[] field1160;

	@ObfuscatedName("SHKUIFHF.a")
	public String[] field1138;

	@ObfuscatedName("SHKUIFHF.a(I)Z")
	public boolean method498() {
		if (field1167 == null) {
			return true;
		}

		int var1 = -1;
		if (field1145 != -1) {
			USQYPEQB var2 = USQYPEQB.field1259[field1145];
			int var3 = var2.field1261;
			int var4 = var2.field1262;
			int var5 = var2.field1263;
			int var6 = client.field226[var5 - var4];
			var1 = field1150.field493[var3] >> var4 & var6;
		} else if (field1155 != -1) {
			var1 = field1150.field493[field1155];
		}

		if (var1 >= 0 && var1 < field1167.length && field1167[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("SHKUIFHF.a(B)LXBVYIDUH;")
	public final XBVYIDUH method499() {
		if (field1167 != null) {
			SHKUIFHF var1 = method504();
			if (var1 == null) {
				return null;
			}

			return var1.method499();
		} else if (field1161 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1161.length; var3++) {
				if (!XBVYIDUH.method542(field1161[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			XBVYIDUH[] var4 = new XBVYIDUH[field1161.length];
			for (int var5 = 0; var5 < field1161.length; var5++) {
				var4[var5] = XBVYIDUH.method541(field1161[var5]);
			}

			XBVYIDUH var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new XBVYIDUH(var4, var4.length);
			}

			if (field1147 != null) {
				for (int var7 = 0; var7 < field1147.length; var7++) {
					var6.method555(field1147[var7], field1144[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("SHKUIFHF.b(I)V")
	public static final void method500() {
		field1143 = null;
		field1152 = null;
		field1160 = null;
		field1146 = null;
	}

	@ObfuscatedName("SHKUIFHF.c(I)LSHKUIFHF;")
	public static final SHKUIFHF method501(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1160[var1].field1154) {
				return field1160[var1];
			}
		}

		field1158 = (field1158 + 1) % 20;
		SHKUIFHF var2 = field1160[field1158] = new SHKUIFHF();
		field1146.field10 = field1152[arg0];
		var2.field1154 = arg0;
		var2.method505(field1146);
		return var2;
	}

	@ObfuscatedName("SHKUIFHF.a(III[I)LXBVYIDUH;")
	public final XBVYIDUH method502(int arg0, int arg1, int[] arg2) {
		if (field1167 != null) {
			SHKUIFHF var4 = method504();
			if (var4 == null) {
				return null;
			}

			return var4.method502(arg0, arg1, arg2);
		}

		XBVYIDUH var5 = (XBVYIDUH) field1143.method495(field1154);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1140.length; var7++) {
				if (!XBVYIDUH.method542(field1140[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			XBVYIDUH[] var8 = new XBVYIDUH[field1140.length];
			for (int var9 = 0; var9 < field1140.length; var9++) {
				var8[var9] = XBVYIDUH.method541(field1140[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new XBVYIDUH(var8, var8.length);
			}

			if (field1147 != null) {
				for (int var10 = 0; var10 < field1147.length; var10++) {
					var5.method555(field1147[var10], field1144[var10]);
				}
			}

			var5.method548();
			var5.method558(field1174 + 64, field1166 + 850, -30, -50, -30, true);
			field1143.method496(var5, field1154);
		}

		XBVYIDUH var11 = XBVYIDUH.field1348;
		var11.method543(var5, BKYAWERN.method115(arg1) & BKYAWERN.method115(arg0));

		if (arg1 != -1 && arg0 != -1) {
			var11.method550(arg0, arg1, arg2);
		} else if (arg1 != -1) {
			var11.method549(arg1);
		}

		if (field1170 != 128 || field1156 != 128) {
			var11.method557(field1156, field1170, field1170);
		}

		var11.method545();
		var11.field1384 = null;
		var11.field1383 = null;

		if (field1153 == 1) {
			var11.field1385 = true;
		}

		return var11;
	}

	@ObfuscatedName("SHKUIFHF.a(LVSQMPWOM;)V")
	public static final void method503(VSQMPWOM arg0) {
		field1146 = new BFQIDHPO(arg0.method526("npc.dat", null));
		BFQIDHPO var1 = new BFQIDHPO(arg0.method526("npc.idx", null));
		field1151 = var1.method56();
		field1152 = new int[field1151];
		int var2 = 2;
		for (int var3 = 0; var3 < field1151; var3++) {
			field1152[var3] = var2;
			var2 += var1.method56();
		}

		field1160 = new SHKUIFHF[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1160[var4] = new SHKUIFHF();
		}
	}

	@ObfuscatedName("SHKUIFHF.d(I)LSHKUIFHF;")
	public final SHKUIFHF method504() {
		int var1 = -1;
		if (field1145 != -1) {
			USQYPEQB var2 = USQYPEQB.field1259[field1145];
			int var3 = var2.field1261;
			int var4 = var2.field1262;
			int var5 = var2.field1263;
			int var6 = client.field226[var5 - var4];
			var1 = field1150.field493[var3] >> var4 & var6;
		} else if (field1155 != -1) {
			var1 = field1150.field493[field1155];
		}

		if (var1 >= 0 && var1 < field1167.length && field1167[var1] != -1) {
			return method501(field1167[var1]);
		}

		return null;
	}

	@ObfuscatedName("SHKUIFHF.a(BLBFQIDHPO;)V")
	public final void method505(BFQIDHPO arg0) {
		while (true) {
			int var2 = arg0.method54();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method54();
				field1140 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1140[var4] = arg0.method56();
				}
			} else if (var2 == 2) {
				field1157 = arg0.method61();
			} else if (var2 == 3) {
				field1142 = arg0.method62();
			} else if (var2 == 12) {
				field1153 = arg0.method55();
			} else if (var2 == 13) {
				field1172 = arg0.method56();
			} else if (var2 == 14) {
				field1163 = arg0.method56();
			} else if (var2 == 17) {
				field1163 = arg0.method56();
				field1165 = arg0.method56();
				field1141 = arg0.method56();
				field1168 = arg0.method56();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1138 == null) {
					field1138 = new String[5];
				}

				field1138[var2 - 30] = arg0.method61();
				if (field1138[var2 - 30].equalsIgnoreCase("hidden")) {
					field1138[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method54();
				field1147 = new int[var5];
				field1144 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1147[var6] = arg0.method56();
					field1144[var6] = arg0.method56();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method54();
				field1161 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1161[var8] = arg0.method56();
				}
			} else if (var2 == 90) {
				field1164 = arg0.method56();
			} else if (var2 == 91) {
				field1171 = arg0.method56();
			} else if (var2 == 92) {
				field1162 = arg0.method56();
			} else if (var2 == 93) {
				field1139 = false;
			} else if (var2 == 95) {
				field1159 = arg0.method56();
			} else if (var2 == 97) {
				field1170 = arg0.method56();
			} else if (var2 == 98) {
				field1156 = arg0.method56();
			} else if (var2 == 99) {
				field1173 = true;
			} else if (var2 == 100) {
				field1174 = arg0.method55();
			} else if (var2 == 101) {
				field1166 = arg0.method55() * 5;
			} else if (var2 == 102) {
				field1169 = arg0.method56();
			} else if (var2 == 103) {
				field1148 = arg0.method56();
			} else if (var2 == 106) {
				field1145 = arg0.method56();
				if (field1145 == 0xFFFF) {
					field1145 = -1;
				}

				field1155 = arg0.method56();
				if (field1155 == 0xFFFF) {
					field1155 = -1;
				}

				int var9 = arg0.method54();
				field1167 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1167[var10] = arg0.method56();
					if (field1167[var10] == 0xFFFF) {
						field1167[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1149 = false;
			}
		}
	}
}
