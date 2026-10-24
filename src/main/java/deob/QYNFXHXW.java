package deob;

@ObfuscatedName("QYNFXHXW")
public final class QYNFXHXW {

	@ObfuscatedName("QYNFXHXW.d")
	public int field1140 = -1;

	@ObfuscatedName("QYNFXHXW.e")
	public int field1141 = -1;

	@ObfuscatedName("QYNFXHXW.g")
	public boolean field1142 = true;

	@ObfuscatedName("QYNFXHXW.h")
	public int field1143 = -1;

	@ObfuscatedName("QYNFXHXW.j")
	public int field1145 = 128;

	@ObfuscatedName("QYNFXHXW.q")
	public int field1152 = -1;

	@ObfuscatedName("QYNFXHXW.s")
	public boolean field1154 = true;

	@ObfuscatedName("QYNFXHXW.t")
	public int field1155 = -1;

	@ObfuscatedName("QYNFXHXW.v")
	public byte field1157 = 1;

	@ObfuscatedName("QYNFXHXW.x")
	public int field1158 = -1;

	@ObfuscatedName("QYNFXHXW.y")
	public long field1159 = -1L;

	@ObfuscatedName("QYNFXHXW.z")
	public int field1160 = -1;

	@ObfuscatedName("QYNFXHXW.A")
	public int field1161 = -1;

	@ObfuscatedName("QYNFXHXW.B")
	public int field1162 = -1;

	@ObfuscatedName("QYNFXHXW.D")
	public String field1164 = "null";

	@ObfuscatedName("QYNFXHXW.F")
	public int field1166 = 32;

	@ObfuscatedName("QYNFXHXW.G")
	public int field1167 = -1;

	@ObfuscatedName("QYNFXHXW.H")
	public int field1168 = -1;

	@ObfuscatedName("QYNFXHXW.I")
	public int field1169 = 128;

	@ObfuscatedName("QYNFXHXW.J")
	public int field1170 = -1;

	@ObfuscatedName("QYNFXHXW.K")
	public boolean field1171 = false;

	@ObfuscatedName("QYNFXHXW.l")
	public static UNPPHFRC field1147 = new UNPPHFRC(30);

	@ObfuscatedName("QYNFXHXW.c")
	public static int field1139;

	@ObfuscatedName("QYNFXHXW.p")
	public static int field1151;

	@ObfuscatedName("QYNFXHXW.r")
	public int field1153;

	@ObfuscatedName("QYNFXHXW.C")
	public int field1163;

	@ObfuscatedName("QYNFXHXW.u")
	public static EYMNCFMK field1156;

	@ObfuscatedName("QYNFXHXW.b")
	public static client field1138;

	@ObfuscatedName("QYNFXHXW.E")
	public byte[] field1165;

	@ObfuscatedName("QYNFXHXW.i")
	public int[] field1144;

	@ObfuscatedName("QYNFXHXW.k")
	public int[] field1146;

	@ObfuscatedName("QYNFXHXW.m")
	public int[] field1148;

	@ObfuscatedName("QYNFXHXW.o")
	public static int[] field1150;

	@ObfuscatedName("QYNFXHXW.L")
	public int[] field1172;

	@ObfuscatedName("QYNFXHXW.M")
	public int[] field1173;

	@ObfuscatedName("QYNFXHXW.n")
	public static QYNFXHXW[] field1149;

	@ObfuscatedName("QYNFXHXW.a")
	public String[] field1137;

	@ObfuscatedName("QYNFXHXW.a(I)LQYNFXHXW;")
	public final QYNFXHXW method508() {
		int var1 = -1;
		if (field1158 != -1) {
			BVXCTZVJ var2 = BVXCTZVJ.field109[field1158];
			int var3 = var2.field111;
			int var4 = var2.field112;
			int var5 = var2.field113;
			int var6 = client.field131[var5 - var4];
			var1 = field1138.field307[var3] >> var4 & var6;
		} else if (field1152 != -1) {
			var1 = field1138.field307[field1152];
		}

		if (var1 >= 0 && var1 < field1172.length && field1172[var1] != -1) {
			return method512(field1172[var1]);
		}

		return null;
	}

	@ObfuscatedName("QYNFXHXW.a(LHBJEXSJX;)V")
	public static final void method509(HBJEXSJX arg0) {
		field1156 = new EYMNCFMK(arg0.method348("npc.dat", null));
		EYMNCFMK var1 = new EYMNCFMK(arg0.method348("npc.idx", null));
		field1151 = var1.method241();
		field1150 = new int[field1151];
		int var2 = 2;
		for (int var3 = 0; var3 < field1151; var3++) {
			field1150[var3] = var2;
			var2 += var1.method241();
		}

		field1149 = new QYNFXHXW[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1149[var4] = new QYNFXHXW();
		}
	}

	@ObfuscatedName("QYNFXHXW.b(I)V")
	public static final void method510() {
		field1147 = null;
		field1150 = null;
		field1149 = null;
		field1156 = null;
	}

	@ObfuscatedName("QYNFXHXW.a(BLEYMNCFMK;)V")
	public final void method511(EYMNCFMK arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method239();
				field1144 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1144[var4] = arg0.method241();
				}
			} else if (var2 == 2) {
				field1164 = arg0.method246();
			} else if (var2 == 3) {
				field1165 = arg0.method247();
			} else if (var2 == 12) {
				field1157 = arg0.method240();
			} else if (var2 == 13) {
				field1162 = arg0.method241();
			} else if (var2 == 14) {
				field1160 = arg0.method241();
			} else if (var2 == 17) {
				field1160 = arg0.method241();
				field1167 = arg0.method241();
				field1168 = arg0.method241();
				field1170 = arg0.method241();
			} else if (var2 >= 30 && var2 < 40) {
				if (field1137 == null) {
					field1137 = new String[5];
				}

				field1137[var2 - 30] = arg0.method246();
				if (field1137[var2 - 30].equalsIgnoreCase("hidden")) {
					field1137[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method239();
				field1146 = new int[var5];
				field1173 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field1146[var6] = arg0.method241();
					field1173[var6] = arg0.method241();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method239();
				field1148 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field1148[var8] = arg0.method241();
				}
			} else if (var2 == 90) {
				field1143 = arg0.method241();
			} else if (var2 == 91) {
				field1155 = arg0.method241();
			} else if (var2 == 92) {
				field1140 = arg0.method241();
			} else if (var2 == 93) {
				field1142 = false;
			} else if (var2 == 95) {
				field1141 = arg0.method241();
			} else if (var2 == 97) {
				field1145 = arg0.method241();
			} else if (var2 == 98) {
				field1169 = arg0.method241();
			} else if (var2 == 99) {
				field1171 = true;
			} else if (var2 == 100) {
				field1163 = arg0.method240();
			} else if (var2 == 101) {
				field1153 = arg0.method240() * 5;
			} else if (var2 == 102) {
				field1161 = arg0.method241();
			} else if (var2 == 103) {
				field1166 = arg0.method241();
			} else if (var2 == 106) {
				field1158 = arg0.method241();
				if (field1158 == 0xFFFF) {
					field1158 = -1;
				}

				field1152 = arg0.method241();
				if (field1152 == 0xFFFF) {
					field1152 = -1;
				}

				int var9 = arg0.method239();
				field1172 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field1172[var10] = arg0.method241();
					if (field1172[var10] == 0xFFFF) {
						field1172[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field1154 = false;
			}
		}
	}

	@ObfuscatedName("QYNFXHXW.c(I)LQYNFXHXW;")
	public static final QYNFXHXW method512(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field1149[var1].field1159) {
				return field1149[var1];
			}
		}

		field1139 = (field1139 + 1) % 20;
		QYNFXHXW var2 = field1149[field1139] = new QYNFXHXW();
		field1156.field679 = field1150[arg0];
		var2.field1159 = arg0;
		var2.method511(field1156);
		return var2;
	}

	@ObfuscatedName("QYNFXHXW.a([IIII)LOJGAHFXC;")
	public final OJGAHFXC method513(int[] arg0, int arg1, int arg2) {
		if (field1172 != null) {
			QYNFXHXW var4 = method508();
			if (var4 == null) {
				return null;
			}

			return var4.method513(arg0, arg1, arg2);
		}

		OJGAHFXC var5 = (OJGAHFXC) field1147.method531(field1159);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field1144.length; var7++) {
				if (!OJGAHFXC.method414(field1144[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			OJGAHFXC[] var8 = new OJGAHFXC[field1144.length];
			for (int var9 = 0; var9 < field1144.length; var9++) {
				var8[var9] = OJGAHFXC.method413(field1144[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new OJGAHFXC(var8.length, var8);
			}

			if (field1146 != null) {
				for (int var10 = 0; var10 < field1146.length; var10++) {
					var5.method427(field1146[var10], field1173[var10]);
				}
			}

			var5.method420();
			var5.method430(field1163 + 64, field1153 + 850, -30, -50, -30, true);
			field1147.method532(field1159, var5);
		}

		OJGAHFXC var11 = OJGAHFXC.field1013;
		var11.method415(MOOJSKCU.method395(arg1) & MOOJSKCU.method395(arg2), var5);

		if (arg1 != -1 && arg2 != -1) {
			var11.method422(arg1, arg0, arg2);
		} else if (arg1 != -1) {
			var11.method421(arg1);
		}

		if (field1145 != 128 || field1169 != 128) {
			var11.method429(field1145, field1169, field1145);
		}

		var11.method417();
		var11.field1049 = null;
		var11.field1048 = null;

		if (field1157 == 1) {
			var11.field1050 = true;
		}

		return var11;
	}

	@ObfuscatedName("QYNFXHXW.d(I)LOJGAHFXC;")
	public final OJGAHFXC method514() {
		if (field1172 != null) {
			QYNFXHXW var1 = method508();
			if (var1 == null) {
				return null;
			}

			return var1.method514();
		} else if (field1148 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field1148.length; var3++) {
				if (!OJGAHFXC.method414(field1148[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			OJGAHFXC[] var4 = new OJGAHFXC[field1148.length];
			for (int var5 = 0; var5 < field1148.length; var5++) {
				var4[var5] = OJGAHFXC.method413(field1148[var5]);
			}

			OJGAHFXC var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new OJGAHFXC(var4.length, var4);
			}

			if (field1146 != null) {
				for (int var7 = 0; var7 < field1146.length; var7++) {
					var6.method427(field1146[var7], field1173[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("QYNFXHXW.e(I)Z")
	public boolean method515() {
		if (field1172 == null) {
			return true;
		}

		int var1 = -1;
		if (field1158 != -1) {
			BVXCTZVJ var2 = BVXCTZVJ.field109[field1158];
			int var3 = var2.field111;
			int var4 = var2.field112;
			int var5 = var2.field113;
			int var6 = client.field131[var5 - var4];
			var1 = field1138.field307[var3] >> var4 & var6;
		} else if (field1152 != -1) {
			var1 = field1138.field307[field1152];
		}

		if (var1 >= 0 && var1 < field1172.length && field1172[var1] != -1) {
			return true;
		}

		return false;
	}
}
