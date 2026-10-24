package deob;

@ObfuscatedName("RDFTXEYV")
public final class RDFTXEYV {

	@ObfuscatedName("RDFTXEYV.a")
	public int field1161 = -1;

	@ObfuscatedName("RDFTXEYV.b")
	public int field1162 = -1;

	@ObfuscatedName("RDFTXEYV.c")
	public int field1163 = -1;

	@ObfuscatedName("RDFTXEYV.e")
	public String field1165 = "null";

	@ObfuscatedName("RDFTXEYV.f")
	public boolean field1166 = true;

	@ObfuscatedName("RDFTXEYV.h")
	public int field1167 = -1;

	@ObfuscatedName("RDFTXEYV.k")
	public int field1170 = -1;

	@ObfuscatedName("RDFTXEYV.l")
	public int field1171 = 128;

	@ObfuscatedName("RDFTXEYV.m")
	public int field1172 = -1;

	@ObfuscatedName("RDFTXEYV.q")
	public int field1175 = -1;

	@ObfuscatedName("RDFTXEYV.r")
	public int field1176 = -1;

	@ObfuscatedName("RDFTXEYV.t")
	public int field1177 = -1;

	@ObfuscatedName("RDFTXEYV.u")
	public boolean field1178 = false;

	@ObfuscatedName("RDFTXEYV.v")
	public int field1179 = 128;

	@ObfuscatedName("RDFTXEYV.w")
	public int field1180 = -1;

	@ObfuscatedName("RDFTXEYV.A")
	public boolean field1183 = true;

	@ObfuscatedName("RDFTXEYV.D")
	public byte field1186 = 1;

	@ObfuscatedName("RDFTXEYV.F")
	public int field1188 = -1;

	@ObfuscatedName("RDFTXEYV.J")
	public int field1192 = 32;

	@ObfuscatedName("RDFTXEYV.K")
	public long field1193 = -1L;

	@ObfuscatedName("RDFTXEYV.L")
	public int field1194 = -1;

	@ObfuscatedName("RDFTXEYV.x")
	public static FFRFJBIR field1181 = new FFRFJBIR(30);

	@ObfuscatedName("RDFTXEYV.i")
	public int field1168;

	@ObfuscatedName("RDFTXEYV.C")
	public static int field1185;

	@ObfuscatedName("RDFTXEYV.G")
	public static int field1189;

	@ObfuscatedName("RDFTXEYV.O")
	public int field1197;

	@ObfuscatedName("RDFTXEYV.n")
	public static FTMSICIZ field1173;

	@ObfuscatedName("RDFTXEYV.H")
	public static client field1190;

	@ObfuscatedName("RDFTXEYV.B")
	public byte[] field1184;

	@ObfuscatedName("RDFTXEYV.d")
	public static int[] field1164;

	@ObfuscatedName("RDFTXEYV.o")
	public int[] field1174;

	@ObfuscatedName("RDFTXEYV.y")
	public int[] field1182;

	@ObfuscatedName("RDFTXEYV.E")
	public int[] field1187;

	@ObfuscatedName("RDFTXEYV.I")
	public int[] field1191;

	@ObfuscatedName("RDFTXEYV.M")
	public int[] field1195;

	@ObfuscatedName("RDFTXEYV.j")
	public static RDFTXEYV[] field1169;

	@ObfuscatedName("RDFTXEYV.N")
	public String[] field1196;

	@ObfuscatedName("RDFTXEYV.a(I)Z")
	public boolean method434() {
		if (field1191 == null) {
			return true;
		}

		int var1 = -1;
		if (field1180 != -1) {
			NSTEZBJV var2 = NSTEZBJV.field868[field1180];
			int var3 = var2.field870;
			int var4 = var2.field871;
			int var5 = var2.field872;
			int var6 = client.field430[var5 - var4];
			var1 = field1190.field470[var3] >> var4 & var6;
		} else if (field1188 != -1) {
			var1 = field1190.field470[field1188];
		}

		if (var1 >= 0 && var1 < field1191.length && field1191[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("RDFTXEYV.a(III[I)LKUGNQTGL;")
	public final KUGNQTGL method435(int arg0, int arg1, int[] arg2) {
		if (field1191 != null) {
			RDFTXEYV var4 = method436();
			if (var4 == null) {
				return null;
			}

			return var4.method435(arg0, arg1, arg2);
		}

		KUGNQTGL var5 = (KUGNQTGL) field1181.method198(field1193);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1182.length; var7++) {
				if (!KUGNQTGL.method331(field1182[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			KUGNQTGL[] var8 = new KUGNQTGL[field1182.length];
			for (int var9 = 0; var9 < field1182.length; var9++) {
				var8[var9] = KUGNQTGL.method330(field1182[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new KUGNQTGL(var8.length, var8);
			}

			if (field1174 != null) {
				for (int var10 = 0; var10 < field1174.length; var10++) {
					var5.method344(field1174[var10], field1195[var10]);
				}
			}

			var5.method337();
			var5.method347(field1197 + 64, field1168 + 850, -30, -50, -30, true);
			field1181.method199(field1193, var5);
		}

		KUGNQTGL var11 = KUGNQTGL.field666;
		var11.method332(SCWTQUFK.method455(arg0) & SCWTQUFK.method455(arg1), var5);

		if (arg0 != -1 && arg1 != -1) {
			var11.method339(arg0, arg1, arg2);
		} else if (arg0 != -1) {
			var11.method338(arg0);
		}

		if (field1179 != 128 || field1171 != 128) {
			var11.method346(field1179, field1179, field1171);
		}

		var11.method334();
		var11.field702 = null;
		var11.field701 = null;

		if (field1186 == 1) {
			var11.field703 = true;
		}

		return var11;
	}

	@ObfuscatedName("RDFTXEYV.a(B)LRDFTXEYV;")
	public final RDFTXEYV method436() {
		int var1 = -1;
		if (field1180 != -1) {
			NSTEZBJV var2 = NSTEZBJV.field868[field1180];
			int var3 = var2.field870;
			int var4 = var2.field871;
			int var5 = var2.field872;
			int var6 = client.field430[var5 - var4];
			var1 = field1190.field470[var3] >> var4 & var6;
		} else if (field1188 != -1) {
			var1 = field1190.field470[field1188];
		}

		if (var1 >= 0 && var1 < field1191.length && field1191[var1] != -1) {
			return method439(field1191[var1]);
		}

		return null;
	}

	@ObfuscatedName("RDFTXEYV.a(Z)LKUGNQTGL;")
	public final KUGNQTGL method437() {
		if (field1191 != null) {
			RDFTXEYV var1 = method436();
			if (var1 == null) {
				return null;
			}

			return var1.method437();
		} else if (field1187 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1187.length; var3++) {
				if (!KUGNQTGL.method331(field1187[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			KUGNQTGL[] var4 = new KUGNQTGL[field1187.length];
			for (int var5 = 0; var5 < field1187.length; var5++) {
				var4[var5] = KUGNQTGL.method330(field1187[var5]);
			}

			KUGNQTGL var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new KUGNQTGL(var4.length, var4);
			}

			if (field1174 != null) {
				for (int var7 = 0; var7 < field1174.length; var7++) {
					var6.method344(field1174[var7], field1195[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("RDFTXEYV.b(I)V")
	public static final void method438() {
		field1181 = null;
		field1164 = null;
		field1169 = null;
		field1173 = null;
	}

	@ObfuscatedName("RDFTXEYV.c(I)LRDFTXEYV;")
	public static final RDFTXEYV method439(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1169[var1].field1193) {
				return field1169[var1];
			}
		}

		field1185 = (field1185 + 1) % 20;
		RDFTXEYV var2 = field1169[field1185] = new RDFTXEYV();
		field1173.field535 = field1164[arg0];
		var2.field1193 = arg0;
		var2.method440(field1173);
		return var2;
	}

	@ObfuscatedName("RDFTXEYV.a(LFTMSICIZ;I)V")
	public final void method440(FTMSICIZ arg0) {
		while (true) {
			int var2 = arg0.method213();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method213();
				field1182 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1182[var4] = arg0.method215();
				}
			} else if (var2 == 2) {
				field1165 = arg0.method220();
			} else if (var2 == 3) {
				field1184 = arg0.method221();
			} else if (var2 == 12) {
				field1186 = arg0.method214();
			} else if (var2 == 13) {
				field1194 = arg0.method215();
			} else if (var2 == 14) {
				field1175 = arg0.method215();
			} else if (var2 == 17) {
				field1175 = arg0.method215();
				field1172 = arg0.method215();
				field1177 = arg0.method215();
				field1170 = arg0.method215();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1196 == null) {
					field1196 = new String[5];
				}

				field1196[var2 - 30] = arg0.method220();
				if (field1196[var2 - 30].equalsIgnoreCase("hidden")) {
					field1196[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method213();
				field1174 = new int[var5];
				field1195 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1174[var6] = arg0.method215();
					field1195[var6] = arg0.method215();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method213();
				field1187 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1187[var8] = arg0.method215();
				}
			} else if (var2 == 90) {
				field1162 = arg0.method215();
			} else if (var2 == 91) {
				field1167 = arg0.method215();
			} else if (var2 == 92) {
				field1163 = arg0.method215();
			} else if (var2 == 93) {
				field1166 = false;
			} else if (var2 == 95) {
				field1161 = arg0.method215();
			} else if (var2 == 97) {
				field1179 = arg0.method215();
			} else if (var2 == 98) {
				field1171 = arg0.method215();
			} else if (var2 == 99) {
				field1178 = true;
			} else if (var2 == 100) {
				field1197 = arg0.method214();
			} else if (var2 == 101) {
				field1168 = arg0.method214() * 5;
			} else if (var2 == 102) {
				field1176 = arg0.method215();
			} else if (var2 == 103) {
				field1192 = arg0.method215();
			} else if (var2 == 106) {
				field1180 = arg0.method215();
				if (field1180 == 0xFFFF) {
					field1180 = -1;
				}

				field1188 = arg0.method215();
				if (field1188 == 0xFFFF) {
					field1188 = -1;
				}

				int var9 = arg0.method213();
				field1191 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1191[var10] = arg0.method215();
					if (field1191[var10] == 0xFFFF) {
						field1191[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1183 = false;
			}
		}
	}

	@ObfuscatedName("RDFTXEYV.a(LAKPFVPPG;)V")
	public static final void method441(AKPFVPPG arg0) {
		field1173 = new FTMSICIZ(arg0.method7("npc.dat", null));
		FTMSICIZ var1 = new FTMSICIZ(arg0.method7("npc.idx", null));
		field1189 = var1.method215();
		field1164 = new int[field1189];
		int var2 = 2;
		for (int var3 = 0; var3 < field1189; var3++) {
			field1164[var3] = var2;
			var2 += var1.method215();
		}

		field1169 = new RDFTXEYV[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1169[var4] = new RDFTXEYV();
		}
	}
}
