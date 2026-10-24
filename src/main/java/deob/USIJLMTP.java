package deob;

@ObfuscatedName("USIJLMTP")
public final class USIJLMTP {

	@ObfuscatedName("USIJLMTP.N")
	public int field1266 = -1;

	@ObfuscatedName("USIJLMTP.b")
	public static CZWVRQJW field1231 = new CZWVRQJW(500);

	@ObfuscatedName("USIJLMTP.s")
	public static CZWVRQJW field1246 = new CZWVRQJW(30);

	@ObfuscatedName("USIJLMTP.K")
	public static HEQROJXW[] field1263 = new HEQROJXW[4];

	@ObfuscatedName("USIJLMTP.l")
	public byte field1239;

	@ObfuscatedName("USIJLMTP.U")
	public byte field1273;

	@ObfuscatedName("USIJLMTP.a")
	public int field1230;

	@ObfuscatedName("USIJLMTP.d")
	public int field1233;

	@ObfuscatedName("USIJLMTP.g")
	public int field1235;

	@ObfuscatedName("USIJLMTP.i")
	public int field1237;

	@ObfuscatedName("USIJLMTP.p")
	public int field1243;

	@ObfuscatedName("USIJLMTP.w")
	public int field1250;

	@ObfuscatedName("USIJLMTP.x")
	public int field1251;

	@ObfuscatedName("USIJLMTP.A")
	public int field1254;

	@ObfuscatedName("USIJLMTP.D")
	public int field1256;

	@ObfuscatedName("USIJLMTP.E")
	public static int field1257;

	@ObfuscatedName("USIJLMTP.G")
	public int field1259;

	@ObfuscatedName("USIJLMTP.I")
	public int field1261;

	@ObfuscatedName("USIJLMTP.L")
	public static int field1264;

	@ObfuscatedName("USIJLMTP.O")
	public int field1267;

	@ObfuscatedName("USIJLMTP.Q")
	public int field1269;

	@ObfuscatedName("USIJLMTP.R")
	public int field1270;

	@ObfuscatedName("USIJLMTP.V")
	public int field1274;

	@ObfuscatedName("USIJLMTP.X")
	public int field1276;

	@ObfuscatedName("USIJLMTP.j")
	public static LDILQFVA field1238;

	@ObfuscatedName("USIJLMTP.T")
	public static client field1272;

	@ObfuscatedName("USIJLMTP.H")
	public String field1260;

	@ObfuscatedName("USIJLMTP.e")
	public static boolean field1234;

	@ObfuscatedName("USIJLMTP.h")
	public boolean field1236;

	@ObfuscatedName("USIJLMTP.m")
	public boolean field1240;

	@ObfuscatedName("USIJLMTP.o")
	public boolean field1242;

	@ObfuscatedName("USIJLMTP.q")
	public boolean field1244;

	@ObfuscatedName("USIJLMTP.t")
	public boolean field1247;

	@ObfuscatedName("USIJLMTP.u")
	public boolean field1248;

	@ObfuscatedName("USIJLMTP.z")
	public boolean field1253;

	@ObfuscatedName("USIJLMTP.B")
	public boolean field1255;

	@ObfuscatedName("USIJLMTP.F")
	public boolean field1258;

	@ObfuscatedName("USIJLMTP.W")
	public boolean field1275;

	@ObfuscatedName("USIJLMTP.J")
	public byte[] field1262;

	@ObfuscatedName("USIJLMTP.c")
	public int[] field1232;

	@ObfuscatedName("USIJLMTP.n")
	public static int[] field1241;

	@ObfuscatedName("USIJLMTP.r")
	public int[] field1245;

	@ObfuscatedName("USIJLMTP.M")
	public int[] field1265;

	@ObfuscatedName("USIJLMTP.P")
	public int[] field1268;

	@ObfuscatedName("USIJLMTP.S")
	public int[] field1271;

	@ObfuscatedName("USIJLMTP.v")
	public static USIJLMTP[] field1249;

	@ObfuscatedName("USIJLMTP.y")
	public String[] field1252;

	@ObfuscatedName("USIJLMTP.a(LSPZBTZXL;)V")
	public static final void method546(SPZBTZXL arg0) {
		field1238 = new LDILQFVA(arg0.method515("loc.dat", null));
		LDILQFVA var1 = new LDILQFVA(arg0.method515("loc.idx", null));
		field1264 = var1.method404();
		field1241 = new int[field1264];
		int var2 = 2;
		for (int var3 = 0; var3 < field1264; var3++) {
			field1241[var3] = var2;
			var2 += var1.method404();
		}

		field1249 = new USIJLMTP[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1249[var4] = new USIJLMTP();
		}
	}

	@ObfuscatedName("USIJLMTP.a(B)LUSIJLMTP;")
	public final USIJLMTP method547() {
		int var1 = -1;
		if (field1230 != -1) {
			LPMARHLZ var2 = LPMARHLZ.field925[field1230];
			int var3 = var2.field927;
			int var4 = var2.field928;
			int var5 = var2.field929;
			int var6 = client.field160[var5 - var4];
			var1 = field1272.field405[var3] >> var4 & var6;
		} else if (field1256 != -1) {
			var1 = field1272.field405[field1256];
		}

		if (var1 >= 0 && var1 < field1265.length && field1265[var1] != -1) {
			return method555(field1265[var1]);
		}

		return null;
	}

	@ObfuscatedName("USIJLMTP.a(IIIIIII)LHEQROJXW;")
	public final HEQROJXW method548(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		HEQROJXW var8 = method549(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field1240 || field1248) {
			var8 = new HEQROJXW(field1248, field1240, var8);
		}

		if (field1240) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field717; var10++) {
				int var11 = var8.field718[var10];
				int var12 = var8.field720[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field719[var10] += var15 - var9;
			}

			var8.method327();
		}

		return var8;
	}

	@ObfuscatedName("USIJLMTP.a(IBII)LHEQROJXW;")
	public final HEQROJXW method549(int arg0, int arg1, int arg2) {
		HEQROJXW var4 = null;
		long var5;
		if (field1268 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1266 << 6) + arg1);
			HEQROJXW var7 = (HEQROJXW) field1246.method152(var5);
			if (var7 != null) {
				return var7;
			}

			if (field1245 == null) {
				return null;
			}

			boolean var8 = field1236 ^ arg1 > 3;
			int var9 = field1245.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field1245[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (HEQROJXW) field1231.method152(var11);
				if (var4 == null) {
					var4 = HEQROJXW.method322(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method337();
					}

					field1231.method153(var4, var11);
				}

				if (var9 > 1) {
					field1263[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new HEQROJXW(var9, field1263);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field1268.length; var13++) {
				if (field1268[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field1266 << 6) + (var12 << 3) + arg1);
			HEQROJXW var14 = (HEQROJXW) field1246.method152(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field1245[var12];
			boolean var16 = field1236 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (HEQROJXW) field1231.method152(var15);
			if (var4 == null) {
				var4 = HEQROJXW.method322(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method337();
				}

				field1231.method153(var4, var15);
			}
		}

		boolean var17;
		if (field1243 == 128 && field1235 == 128 && field1233 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field1254 == 0 && field1259 == 0 && field1274 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		HEQROJXW var19 = new HEQROJXW(arg1 == 0 && arg2 == -1 && !var17 && !var18, field1271 == null, UEUSJYYO.method536(arg2), var4);
		if (arg2 != -1) {
			var19.method329();
			var19.method330(arg2);
			var19.field749 = null;
			var19.field748 = null;
		}

		while (arg1-- > 0) {
			var19.method333();
		}

		if (field1271 != null) {
			for (int var20 = 0; var20 < field1271.length; var20++) {
				var19.method336(field1271[var20], field1232[var20]);
			}
		}

		if (var17) {
			var19.method338(field1235, field1233, field1243);
		}

		if (var18) {
			var19.method335(field1259, field1274, field1254);
		}

		var19.method339(field1239 + 64, field1273 * 5 + 768, -50, -10, -50, !field1248);

		if (field1276 == 1) {
			var19.field745 = var19.field627;
		}

		field1246.method153(var19, var5);
		return var19;
	}

	@ObfuscatedName("USIJLMTP.b(B)Z")
	public final boolean method550() {
		if (field1245 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1245.length; var2++) {
			var1 &= HEQROJXW.method323(field1245[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("USIJLMTP.a()V")
	public final void method551() {
		field1245 = null;
		field1268 = null;
		field1260 = null;
		field1262 = null;
		field1271 = null;
		field1232 = null;
		field1269 = 1;
		field1237 = 1;
		field1244 = true;
		field1253 = true;
		field1242 = false;
		field1240 = false;
		field1248 = false;
		field1258 = false;
		field1251 = -1;
		field1261 = 16;
		field1239 = 0;
		field1273 = 0;
		field1252 = null;
		field1250 = -1;
		field1267 = -1;
		field1236 = false;
		field1247 = true;
		field1243 = 128;
		field1235 = 128;
		field1233 = 128;
		field1270 = 0;
		field1254 = 0;
		field1259 = 0;
		field1274 = 0;
		field1275 = false;
		field1255 = false;
		field1276 = -1;
		field1230 = -1;
		field1256 = -1;
		field1265 = null;
	}

	@ObfuscatedName("USIJLMTP.a(ZLGLPUEKVZ;)V")
	public final void method552(GLPUEKVZ arg0) {
		if (field1245 != null) {
			for (int var2 = 0; var2 < field1245.length; var2++) {
				arg0.method296(0, field1245[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("USIJLMTP.a(I)V")
	public static final void method553() {
		field1231 = null;
		field1246 = null;
		field1241 = null;
		field1249 = null;
		field1238 = null;
	}

	@ObfuscatedName("USIJLMTP.a(II)Z")
	public final boolean method554(int arg0) {
		if (field1268 != null) {
			for (int var4 = 0; var4 < field1268.length; var4++) {
				if (field1268[var4] == arg0) {
					return HEQROJXW.method323(field1245[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field1245 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field1245.length; var3++) {
				var2 &= HEQROJXW.method323(field1245[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("USIJLMTP.b(I)LUSIJLMTP;")
	public static final USIJLMTP method555(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1249[var1].field1266 == arg0) {
				return field1249[var1];
			}
		}

		field1257 = (field1257 + 1) % 20;
		USIJLMTP var2 = field1249[field1257];
		field1238.field902 = field1241[arg0];
		var2.field1266 = arg0;
		var2.method551();
		var2.method556(field1238);
		return var2;
	}

	@ObfuscatedName("USIJLMTP.a(LLDILQFVA;I)V")
	public final void method556(LDILQFVA arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method402();
					if (var3 == 0) {
						if (var2 == -1) {
							field1242 = false;
							if (field1245 != null && (field1268 == null || field1268[0] == 10)) {
								field1242 = true;
							}

							if (field1252 != null) {
								field1242 = true;
							}
						}

						if (field1255) {
							field1244 = false;
							field1253 = false;
						}

						if (field1276 == -1) {
							field1276 = field1244 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field1260 = arg0.method409();
					} else if (var3 == 3) {
						field1262 = arg0.method410();
					} else if (var3 == 5) {
						int var6 = arg0.method402();
						if (var6 > 0) {
							if (field1245 == null || field1234) {
								field1268 = null;
								field1245 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field1245[var7] = arg0.method404();
								}
							} else {
								arg0.field902 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field1269 = arg0.method402();
					} else if (var3 == 15) {
						field1237 = arg0.method402();
					} else if (var3 == 17) {
						field1244 = false;
					} else if (var3 == 18) {
						field1253 = false;
					} else if (var3 == 19) {
						var2 = arg0.method402();
						if (var2 == 1) {
							field1242 = true;
						}
					} else if (var3 == 21) {
						field1240 = true;
					} else if (var3 == 22) {
						field1248 = true;
					} else if (var3 == 23) {
						field1258 = true;
					} else if (var3 == 24) {
						field1251 = arg0.method404();
						if (field1251 == 0xFFFF) {
							field1251 = -1;
						}
					} else if (var3 == 28) {
						field1261 = arg0.method402();
					} else if (var3 == 29) {
						field1239 = arg0.method403();
					} else if (var3 == 39) {
						field1273 = arg0.method403();
					} else if (var3 >= 30 && var3 < 39) {
						if (field1252 == null) {
							field1252 = new String[5];
						}

						field1252[var3 - 30] = arg0.method409();
						if (field1252[var3 - 30].equalsIgnoreCase("hidden")) {
							field1252[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method402();
						field1271 = new int[var8];
						field1232 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field1271[var9] = arg0.method404();
							field1232[var9] = arg0.method404();
						}
					} else if (var3 == 60) {
						field1250 = arg0.method404();
					} else if (var3 == 62) {
						field1236 = true;
					} else if (var3 == 64) {
						field1247 = false;
					} else if (var3 == 65) {
						field1243 = arg0.method404();
					} else if (var3 == 66) {
						field1235 = arg0.method404();
					} else if (var3 == 67) {
						field1233 = arg0.method404();
					} else if (var3 == 68) {
						field1267 = arg0.method404();
					} else if (var3 == 69) {
						field1270 = arg0.method402();
					} else if (var3 == 70) {
						field1254 = arg0.method405();
					} else if (var3 == 71) {
						field1259 = arg0.method405();
					} else if (var3 == 72) {
						field1274 = arg0.method405();
					} else if (var3 == 73) {
						field1275 = true;
					} else if (var3 == 74) {
						field1255 = true;
					} else if (var3 == 75) {
						field1276 = arg0.method402();
					} else if (var3 == 77) {
						field1230 = arg0.method404();
						if (field1230 == 0xFFFF) {
							field1230 = -1;
						}

						field1256 = arg0.method404();
						if (field1256 == 0xFFFF) {
							field1256 = -1;
						}

						int var10 = arg0.method402();
						field1265 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field1265[var11] = arg0.method404();
							if (field1265[var11] == 0xFFFF) {
								field1265[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method402();
			} while (var4 <= 0);

			if (field1245 == null || field1234) {
				field1268 = new int[var4];
				field1245 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field1245[var5] = arg0.method404();
					field1268[var5] = arg0.method402();
				}
			} else {
				arg0.field902 += var4 * 3;
			}
		}
	}
}
