package deob;

@ObfuscatedName("ULRRTYRQ")
public final class ULRRTYRQ {

	@ObfuscatedName("ULRRTYRQ.g")
	public int field1158 = -1;

	@ObfuscatedName("ULRRTYRQ.t")
	public static boolean field1170 = true;

	@ObfuscatedName("ULRRTYRQ.A")
	public static ULDYKUPK field1177 = new ULDYKUPK(100);

	@ObfuscatedName("ULRRTYRQ.L")
	public static ULDYKUPK field1187 = new ULDYKUPK(50);

	@ObfuscatedName("ULRRTYRQ.v")
	public byte field1172;

	@ObfuscatedName("ULRRTYRQ.T")
	public byte field1195;

	@ObfuscatedName("ULRRTYRQ.c")
	public int field1155;

	@ObfuscatedName("ULRRTYRQ.d")
	public int field1156;

	@ObfuscatedName("ULRRTYRQ.e")
	public int field1157;

	@ObfuscatedName("ULRRTYRQ.h")
	public int field1159;

	@ObfuscatedName("ULRRTYRQ.i")
	public static int field1160;

	@ObfuscatedName("ULRRTYRQ.j")
	public int field1161;

	@ObfuscatedName("ULRRTYRQ.k")
	public int field1162;

	@ObfuscatedName("ULRRTYRQ.l")
	public int field1163;

	@ObfuscatedName("ULRRTYRQ.m")
	public int field1164;

	@ObfuscatedName("ULRRTYRQ.n")
	public int field1165;

	@ObfuscatedName("ULRRTYRQ.o")
	public int field1166;

	@ObfuscatedName("ULRRTYRQ.p")
	public int field1167;

	@ObfuscatedName("ULRRTYRQ.q")
	public int field1168;

	@ObfuscatedName("ULRRTYRQ.r")
	public int field1169;

	@ObfuscatedName("ULRRTYRQ.u")
	public static int field1171;

	@ObfuscatedName("ULRRTYRQ.w")
	public int field1173;

	@ObfuscatedName("ULRRTYRQ.x")
	public int field1174;

	@ObfuscatedName("ULRRTYRQ.y")
	public int field1175;

	@ObfuscatedName("ULRRTYRQ.z")
	public int field1176;

	@ObfuscatedName("ULRRTYRQ.F")
	public int field1181;

	@ObfuscatedName("ULRRTYRQ.H")
	public int field1183;

	@ObfuscatedName("ULRRTYRQ.I")
	public int field1184;

	@ObfuscatedName("ULRRTYRQ.M")
	public int field1188;

	@ObfuscatedName("ULRRTYRQ.N")
	public int field1189;

	@ObfuscatedName("ULRRTYRQ.P")
	public int field1191;

	@ObfuscatedName("ULRRTYRQ.R")
	public int field1193;

	@ObfuscatedName("ULRRTYRQ.V")
	public int field1196;

	@ObfuscatedName("ULRRTYRQ.W")
	public int field1197;

	@ObfuscatedName("ULRRTYRQ.cb")
	public int field1201;

	@ObfuscatedName("ULRRTYRQ.S")
	public static NQUAUMDT field1194;

	@ObfuscatedName("ULRRTYRQ.G")
	public String field1182;

	@ObfuscatedName("ULRRTYRQ.O")
	public boolean field1190;

	@ObfuscatedName("ULRRTYRQ.Q")
	public boolean field1192;

	@ObfuscatedName("ULRRTYRQ.X")
	public byte[] field1198;

	@ObfuscatedName("ULRRTYRQ.B")
	public static int[] field1178;

	@ObfuscatedName("ULRRTYRQ.E")
	public int[] field1180;

	@ObfuscatedName("ULRRTYRQ.K")
	public int[] field1186;

	@ObfuscatedName("ULRRTYRQ.Z")
	public int[] field1199;

	@ObfuscatedName("ULRRTYRQ.ab")
	public int[] field1200;

	@ObfuscatedName("ULRRTYRQ.a")
	public static ULRRTYRQ[] field1154;

	@ObfuscatedName("ULRRTYRQ.C")
	public String[] field1179;

	@ObfuscatedName("ULRRTYRQ.J")
	public String[] field1185;

	@ObfuscatedName("ULRRTYRQ.a(II)LJUQSYEMB;")
	public final JUQSYEMB method512(int arg0) {
		if (field1200 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1180[var3] && field1180[var3] != 0) {
					var2 = field1200[var3];
				}
			}

			if (var2 != -1) {
				return method520(var2).method512(1);
			}
		}

		JUQSYEMB var4 = JUQSYEMB.method212(field1188);
		if (var4 == null) {
			return null;
		}

		if (field1186 != null) {
			for (int var5 = 0; var5 < field1186.length; var5++) {
				var4.method226(field1186[var5], field1199[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("ULRRTYRQ.b(II)LJUQSYEMB;")
	public final JUQSYEMB method513(int arg0) {
		int var2 = field1156;
		int var3 = field1189;
		if (arg0 == 1) {
			var2 = field1167;
			var3 = field1174;
		}

		if (var2 == -1) {
			return null;
		}

		JUQSYEMB var4 = JUQSYEMB.method212(var2);
		if (var3 != -1) {
			JUQSYEMB var5 = JUQSYEMB.method212(var3);
			JUQSYEMB[] var6 = new JUQSYEMB[] { var4, var5 };
			var4 = new JUQSYEMB(2, var6);
		}

		if (field1186 != null) {
			for (int var7 = 0; var7 < field1186.length; var7++) {
				var4.method226(field1186[var7], field1199[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("ULRRTYRQ.a(BLNQUAUMDT;)V")
	public final void method514(NQUAUMDT arg0) {
		while (true) {
			int var2 = arg0.method339();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1188 = arg0.method341();
			} else if (var2 == 2) {
				field1182 = arg0.method346();
			} else if (var2 == 3) {
				field1198 = arg0.method347();
			} else if (var2 == 4) {
				field1201 = arg0.method341();
			} else if (var2 == 5) {
				field1159 = arg0.method341();
			} else if (var2 == 6) {
				field1163 = arg0.method341();
			} else if (var2 == 7) {
				field1157 = arg0.method341();
				if (field1157 > 32767) {
					field1157 -= 0x10000;
				}
			} else if (var2 == 8) {
				field1164 = arg0.method341();
				if (field1164 > 32767) {
					field1164 -= 0x10000;
				}
			} else if (var2 == 10) {
				field1155 = arg0.method341();
			} else if (var2 == 11) {
				field1192 = true;
			} else if (var2 == 12) {
				field1176 = arg0.method344();
			} else if (var2 == 16) {
				field1190 = true;
			} else if (var2 == 23) {
				field1169 = arg0.method341();
				field1195 = arg0.method340();
			} else if (var2 == 24) {
				field1168 = arg0.method341();
			} else if (var2 == 25) {
				field1183 = arg0.method341();
				field1172 = arg0.method340();
			} else if (var2 == 26) {
				field1165 = arg0.method341();
			} else if (var2 >= 30 && var2 < 35) {
				if (field1185 == null) {
					field1185 = new String[5];
				}

				field1185[var2 - 30] = arg0.method346();
				if (field1185[var2 - 30].equalsIgnoreCase("hidden")) {
					field1185[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field1179 == null) {
					field1179 = new String[5];
				}

				field1179[var2 - 35] = arg0.method346();
			} else if (var2 == 40) {
				int var3 = arg0.method339();
				field1186 = new int[var3];
				field1199 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1186[var4] = arg0.method341();
					field1199[var4] = arg0.method341();
				}
			} else if (var2 == 78) {
				field1181 = arg0.method341();
			} else if (var2 == 79) {
				field1162 = arg0.method341();
			} else if (var2 == 90) {
				field1156 = arg0.method341();
			} else if (var2 == 91) {
				field1167 = arg0.method341();
			} else if (var2 == 92) {
				field1189 = arg0.method341();
			} else if (var2 == 93) {
				field1174 = arg0.method341();
			} else if (var2 == 95) {
				field1175 = arg0.method341();
			} else if (var2 == 97) {
				field1193 = arg0.method341();
			} else if (var2 == 98) {
				field1166 = arg0.method341();
			} else if (var2 >= 100 && var2 < 110) {
				if (field1200 == null) {
					field1200 = new int[10];
					field1180 = new int[10];
				}

				field1200[var2 - 100] = arg0.method341();
				field1180[var2 - 100] = arg0.method341();
			} else if (var2 == 110) {
				field1196 = arg0.method341();
			} else if (var2 == 111) {
				field1191 = arg0.method341();
			} else if (var2 == 112) {
				field1197 = arg0.method341();
			} else if (var2 == 113) {
				field1161 = arg0.method340();
			} else if (var2 == 114) {
				field1184 = arg0.method340() * 5;
			} else if (var2 == 115) {
				field1173 = arg0.method339();
			}
		}
	}

	@ObfuscatedName("ULRRTYRQ.a(I)LJUQSYEMB;")
	public final JUQSYEMB method515(int arg0) {
		if (field1200 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field1180[var3] && field1180[var3] != 0) {
					var2 = field1200[var3];
				}
			}

			if (var2 != -1) {
				return method520(var2).method515(1);
			}
		}

		JUQSYEMB var4 = (JUQSYEMB) field1187.method509(field1158);
		if (var4 != null) {
			return var4;
		}

		JUQSYEMB var5 = JUQSYEMB.method212(field1188);
		if (var5 == null) {
			return null;
		}

		if (field1196 != 128 || field1191 != 128 || field1197 != 128) {
			var5.method228(field1196, field1191, field1197);
		}

		if (field1186 != null) {
			for (int var6 = 0; var6 < field1186.length; var6++) {
				var5.method226(field1186[var6], field1199[var6]);
			}
		}

		var5.method229(field1161 + 64, field1184 + 768, -50, -10, -50, true);
		var5.field713 = true;
		field1187.method510(field1158, var5);
		return var5;
	}

	@ObfuscatedName("ULRRTYRQ.a(ZI)Z")
	public final boolean method516(int arg0) {
		int var2 = field1156;
		int var3 = field1189;
		if (arg0 == 1) {
			var2 = field1167;
			var3 = field1174;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!JUQSYEMB.method213(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !JUQSYEMB.method213(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("ULRRTYRQ.c(II)LJUQSYEMB;")
	public final JUQSYEMB method517(int arg0) {
		int var2 = field1169;
		int var3 = field1168;
		int var4 = field1181;
		if (arg0 == 1) {
			var2 = field1183;
			var3 = field1165;
			var4 = field1162;
		}

		if (var2 == -1) {
			return null;
		}

		JUQSYEMB var5 = JUQSYEMB.method212(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				JUQSYEMB var9 = JUQSYEMB.method212(var3);
				JUQSYEMB[] var10 = new JUQSYEMB[] { var5, var9 };
				var5 = new JUQSYEMB(2, var10);
			} else {
				JUQSYEMB var6 = JUQSYEMB.method212(var3);
				JUQSYEMB var7 = JUQSYEMB.method212(var4);
				JUQSYEMB[] var8 = new JUQSYEMB[] { var5, var6, var7 };
				var5 = new JUQSYEMB(3, var8);
			}
		}

		if (arg0 == 0 && field1195 != 0) {
			var5.method225(0, 0, field1195);
		}

		if (arg0 == 1 && field1172 != 0) {
			var5.method225(0, 0, field1172);
		}

		if (field1186 != null) {
			for (int var11 = 0; var11 < field1186.length; var11++) {
				var5.method226(field1186[var11], field1199[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("ULRRTYRQ.a(LRSPRYUFS;)V")
	public static final void method518(RSPRYUFS arg0) {
		field1194 = new NQUAUMDT(arg0.method427("obj.dat", null));
		NQUAUMDT var1 = new NQUAUMDT(arg0.method427("obj.idx", null));
		field1160 = var1.method341();
		field1178 = new int[field1160];
		int var2 = 2;
		for (int var3 = 0; var3 < field1160; var3++) {
			field1178[var3] = var2;
			var2 += var1.method341();
		}

		field1154 = new ULRRTYRQ[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field1154[var4] = new ULRRTYRQ();
		}
	}

	@ObfuscatedName("ULRRTYRQ.a(Z)V")
	public void method519() {
		ULRRTYRQ var1 = method520(field1166);
		field1188 = var1.field1188;
		field1201 = var1.field1201;
		field1159 = var1.field1159;
		field1163 = var1.field1163;
		field1175 = var1.field1175;
		field1157 = var1.field1157;
		field1164 = var1.field1164;
		field1186 = var1.field1186;
		field1199 = var1.field1199;
		ULRRTYRQ var2 = method520(field1193);
		field1182 = var2.field1182;
		field1190 = var2.field1190;
		field1176 = var2.field1176;
		String var3 = "a";
		char var4 = var2.field1182.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field1198 = ("Swap this note at any bank for " + var3 + " " + var2.field1182 + ".").getBytes();
		field1192 = true;
	}

	@ObfuscatedName("ULRRTYRQ.b(I)LULRRTYRQ;")
	public static final ULRRTYRQ method520(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field1154[var1].field1158 == arg0) {
				return field1154[var1];
			}
		}

		field1171 = (field1171 + 1) % 10;
		ULRRTYRQ var2 = field1154[field1171];
		field1194.field929 = field1178[arg0];
		var2.field1158 = arg0;
		var2.method521();
		var2.method514(field1194);

		if (var2.field1166 != -1) {
			var2.method519();
		}

		if (!field1170 && var2.field1190) {
			var2.field1182 = "Members Object";
			var2.field1198 = "Login to a members' server to use this object.".getBytes();
			var2.field1185 = null;
			var2.field1179 = null;
			var2.field1173 = 0;
		}

		return var2;
	}

	@ObfuscatedName("ULRRTYRQ.a()V")
	public final void method521() {
		field1188 = 0;
		field1182 = null;
		field1198 = null;
		field1186 = null;
		field1199 = null;
		field1201 = 2000;
		field1159 = 0;
		field1163 = 0;
		field1175 = 0;
		field1157 = 0;
		field1164 = 0;
		field1155 = -1;
		field1192 = false;
		field1176 = 1;
		field1190 = false;
		field1185 = null;
		field1179 = null;
		field1169 = -1;
		field1168 = -1;
		field1195 = 0;
		field1183 = -1;
		field1165 = -1;
		field1172 = 0;
		field1181 = -1;
		field1162 = -1;
		field1156 = -1;
		field1189 = -1;
		field1167 = -1;
		field1174 = -1;
		field1200 = null;
		field1180 = null;
		field1193 = -1;
		field1166 = -1;
		field1196 = 128;
		field1191 = 128;
		field1197 = 128;
		field1161 = 0;
		field1184 = 0;
		field1173 = 0;
	}

	@ObfuscatedName("ULRRTYRQ.a(BI)Z")
	public final boolean method522(int arg0) {
		int var2 = field1169;
		int var3 = field1168;
		int var4 = field1181;
		if (arg0 == 1) {
			var2 = field1183;
			var3 = field1165;
			var4 = field1162;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!JUQSYEMB.method213(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !JUQSYEMB.method213(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !JUQSYEMB.method213(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("ULRRTYRQ.c(I)V")
	public static final void method523() {
		field1187 = null;
		field1177 = null;
		field1178 = null;
		field1154 = null;
		field1194 = null;
	}

	@ObfuscatedName("ULRRTYRQ.a(IIBI)LFKNRMZJV;")
	public static final FKNRMZJV method524(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			FKNRMZJV var3 = (FKNRMZJV) field1177.method509(arg2);
			if (var3 != null && var3.field596 != arg1 && var3.field596 != -1) {
				var3.method326();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		ULRRTYRQ var4 = method520(arg2);
		if (var4.field1200 == null) {
			arg1 = -1;
		}

		if (arg1 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg1 >= var4.field1180[var6] && var4.field1180[var6] != 0) {
					var5 = var4.field1200[var6];
				}
			}

			if (var5 != -1) {
				var4 = method520(var5);
			}
		}

		JUQSYEMB var7 = var4.method515(1);
		if (var7 == null) {
			return null;
		}

		FKNRMZJV var8 = null;
		if (var4.field1166 != -1) {
			var8 = method524(-1, 10, var4.field1193);
			if (var8 == null) {
				return null;
			}
		}

		FKNRMZJV var9 = new FKNRMZJV(32, 32);
		int var10 = ZVPDLSTW.field1499;
		int var11 = ZVPDLSTW.field1500;
		int[] var12 = ZVPDLSTW.field1505;
		int[] var13 = VMBJKBNJ.field1283;
		int var14 = VMBJKBNJ.field1284;
		int var15 = VMBJKBNJ.field1285;
		int var16 = VMBJKBNJ.field1288;
		int var17 = VMBJKBNJ.field1289;
		int var18 = VMBJKBNJ.field1286;
		int var19 = VMBJKBNJ.field1287;
		ZVPDLSTW.field1497 = false;
		VMBJKBNJ.method542(32, 32, var9.field590);
		VMBJKBNJ.method547(32, 0, 32, 0, 0);
		ZVPDLSTW.method589();
		int var20 = var4.field1201;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = ZVPDLSTW.field1503[var4.field1159] * var20 >> 16;
		int var22 = ZVPDLSTW.field1504[var4.field1159] * var20 >> 16;
		var7.method233(0, var4.field1163, var4.field1175, var4.field1159, var4.field1157, var7.field1049 / 2 + var21 + var4.field1164, var4.field1164 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field590[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field590[var24 * 32 + var23 - 1] > 1) {
						var9.field590[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field590[(var24 - 1) * 32 + var23] > 1) {
						var9.field590[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field590[var24 * 32 + var23 + 1] > 1) {
						var9.field590[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field590[(var24 + 1) * 32 + var23] > 1) {
						var9.field590[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field590[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field590[var26 * 32 + var25 - 1] == 1) {
							var9.field590[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field590[(var26 - 1) * 32 + var25] == 1) {
							var9.field590[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field590[var26 * 32 + var25 + 1] == 1) {
							var9.field590[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field590[(var26 + 1) * 32 + var25] == 1) {
							var9.field590[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field590[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field590[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field590[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field1166 != -1) {
			int var29 = var8.field595;
			int var30 = var8.field596;
			var8.field595 = 32;
			var8.field596 = 32;
			var8.method185(0, 0);
			var8.field595 = var29;
			var8.field596 = var30;
		}

		if (arg0 == 0) {
			field1177.method510(arg2, var9);
		}

		VMBJKBNJ.method542(var15, var14, var13);
		VMBJKBNJ.method544(var18, var17, var16, var19);
		ZVPDLSTW.field1499 = var10;
		ZVPDLSTW.field1500 = var11;
		ZVPDLSTW.field1505 = var12;
		ZVPDLSTW.field1497 = true;

		if (var4.field1192) {
			var9.field595 = 33;
		} else {
			var9.field595 = 32;
		}

		var9.field596 = arg1;
		return var9;
	}
}
