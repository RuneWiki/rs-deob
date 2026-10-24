package deob;

@ObfuscatedName("BQKZHFKO")
public final class BQKZHFKO {

	@ObfuscatedName("BQKZHFKO.x")
	public int field58 = -1;

	@ObfuscatedName("BQKZHFKO.j")
	public static EOJHVRZF field44 = new EOJHVRZF(40);

	@ObfuscatedName("BQKZHFKO.z")
	public static EOJHVRZF field60 = new EOJHVRZF(500);

	@ObfuscatedName("BQKZHFKO.V")
	public static WEVRTBOZ[] field78 = new WEVRTBOZ[4];

	@ObfuscatedName("BQKZHFKO.i")
	public byte field43;

	@ObfuscatedName("BQKZHFKO.w")
	public byte field57;

	@ObfuscatedName("BQKZHFKO.f")
	public int field40;

	@ObfuscatedName("BQKZHFKO.g")
	public int field41;

	@ObfuscatedName("BQKZHFKO.l")
	public int field46;

	@ObfuscatedName("BQKZHFKO.n")
	public int field48;

	@ObfuscatedName("BQKZHFKO.q")
	public int field51;

	@ObfuscatedName("BQKZHFKO.r")
	public int field52;

	@ObfuscatedName("BQKZHFKO.s")
	public int field53;

	@ObfuscatedName("BQKZHFKO.t")
	public int field54;

	@ObfuscatedName("BQKZHFKO.u")
	public int field55;

	@ObfuscatedName("BQKZHFKO.y")
	public int field59;

	@ObfuscatedName("BQKZHFKO.A")
	public int field61;

	@ObfuscatedName("BQKZHFKO.H")
	public int field65;

	@ObfuscatedName("BQKZHFKO.J")
	public int field66;

	@ObfuscatedName("BQKZHFKO.K")
	public int field67;

	@ObfuscatedName("BQKZHFKO.P")
	public static int field72;

	@ObfuscatedName("BQKZHFKO.T")
	public int field76;

	@ObfuscatedName("BQKZHFKO.W")
	public static int field79;

	@ObfuscatedName("BQKZHFKO.Y")
	public int field81;

	@ObfuscatedName("BQKZHFKO.R")
	public static UAWAYCTK field74;

	@ObfuscatedName("BQKZHFKO.N")
	public static client field70;

	@ObfuscatedName("BQKZHFKO.p")
	public String field50;

	@ObfuscatedName("BQKZHFKO.a")
	public boolean field35;

	@ObfuscatedName("BQKZHFKO.b")
	public boolean field36;

	@ObfuscatedName("BQKZHFKO.d")
	public boolean field38;

	@ObfuscatedName("BQKZHFKO.h")
	public boolean field42;

	@ObfuscatedName("BQKZHFKO.k")
	public boolean field45;

	@ObfuscatedName("BQKZHFKO.m")
	public static boolean field47;

	@ObfuscatedName("BQKZHFKO.v")
	public boolean field56;

	@ObfuscatedName("BQKZHFKO.O")
	public boolean field71;

	@ObfuscatedName("BQKZHFKO.Q")
	public boolean field73;

	@ObfuscatedName("BQKZHFKO.U")
	public boolean field77;

	@ObfuscatedName("BQKZHFKO.X")
	public boolean field80;

	@ObfuscatedName("BQKZHFKO.C")
	public byte[] field63;

	@ObfuscatedName("BQKZHFKO.c")
	public int[] field37;

	@ObfuscatedName("BQKZHFKO.e")
	public int[] field39;

	@ObfuscatedName("BQKZHFKO.o")
	public int[] field49;

	@ObfuscatedName("BQKZHFKO.G")
	public static int[] field64;

	@ObfuscatedName("BQKZHFKO.M")
	public int[] field69;

	@ObfuscatedName("BQKZHFKO.S")
	public int[] field75;

	@ObfuscatedName("BQKZHFKO.B")
	public static BQKZHFKO[] field62;

	@ObfuscatedName("BQKZHFKO.L")
	public String[] field68;

	@ObfuscatedName("BQKZHFKO.a(ILUAWAYCTK;)V")
	public final void method14(UAWAYCTK arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method455();
					if (var3 == 0) {
						if (var2 == -1) {
							field36 = false;
							if (field39 != null && (field69 == null || field69[0] == 10)) {
								field36 = true;
							}

							if (field68 != null) {
								field36 = true;
							}
						}

						if (field73) {
							field71 = false;
							field45 = false;
						}

						if (field81 == -1) {
							field81 = field71 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field50 = arg0.method462();
					} else if (var3 == 3) {
						field63 = arg0.method463();
					} else if (var3 == 5) {
						int var6 = arg0.method455();
						if (var6 > 0) {
							if (field39 == null || field47) {
								field69 = null;
								field39 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field39[var7] = arg0.method457();
								}
							} else {
								arg0.field1252 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field65 = arg0.method455();
					} else if (var3 == 15) {
						field53 = arg0.method455();
					} else if (var3 == 17) {
						field71 = false;
					} else if (var3 == 18) {
						field45 = false;
					} else if (var3 == 19) {
						var2 = arg0.method455();
						if (var2 == 1) {
							field36 = true;
						}
					} else if (var3 == 21) {
						field38 = true;
					} else if (var3 == 22) {
						field56 = true;
					} else if (var3 == 23) {
						field35 = true;
					} else if (var3 == 24) {
						field54 = arg0.method457();
						if (field54 == 0xFFFF) {
							field54 = -1;
						}
					} else if (var3 == 28) {
						field67 = arg0.method455();
					} else if (var3 == 29) {
						field43 = arg0.method456();
					} else if (var3 == 39) {
						field57 = arg0.method456();
					} else if (var3 >= 30 && var3 < 39) {
						if (field68 == null) {
							field68 = new String[5];
						}

						field68[var3 - 30] = arg0.method462();
						if (field68[var3 - 30].equalsIgnoreCase("hidden")) {
							field68[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method455();
						field75 = new int[var8];
						field49 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field75[var9] = arg0.method457();
							field49[var9] = arg0.method457();
						}
					} else if (var3 == 60) {
						field48 = arg0.method457();
					} else if (var3 == 62) {
						field77 = true;
					} else if (var3 == 64) {
						field80 = false;
					} else if (var3 == 65) {
						field76 = arg0.method457();
					} else if (var3 == 66) {
						field51 = arg0.method457();
					} else if (var3 == 67) {
						field46 = arg0.method457();
					} else if (var3 == 68) {
						field40 = arg0.method457();
					} else if (var3 == 69) {
						field41 = arg0.method455();
					} else if (var3 == 70) {
						field52 = arg0.method458();
					} else if (var3 == 71) {
						field66 = arg0.method458();
					} else if (var3 == 72) {
						field59 = arg0.method458();
					} else if (var3 == 73) {
						field42 = true;
					} else if (var3 == 74) {
						field73 = true;
					} else if (var3 == 75) {
						field81 = arg0.method455();
					} else if (var3 == 77) {
						field55 = arg0.method457();
						if (field55 == 0xFFFF) {
							field55 = -1;
						}

						field61 = arg0.method457();
						if (field61 == 0xFFFF) {
							field61 = -1;
						}

						int var10 = arg0.method455();
						field37 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field37[var11] = arg0.method457();
							if (field37[var11] == 0xFFFF) {
								field37[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method455();
			} while (var4 <= 0);

			if (field39 == null || field47) {
				field69 = new int[var4];
				field39 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field39[var5] = arg0.method457();
					field69[var5] = arg0.method455();
				}
			} else {
				arg0.field1252 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("BQKZHFKO.a(LRVLWVPJQ;)V")
	public static final void method15(RVLWVPJQ arg0) {
		field74 = new UAWAYCTK(arg0.method424("loc.dat", null));
		UAWAYCTK var1 = new UAWAYCTK(arg0.method424("loc.idx", null));
		field79 = var1.method457();
		field64 = new int[field79];
		int var2 = 2;
		for (int var3 = 0; var3 < field79; var3++) {
			field64[var3] = var2;
			var2 += var1.method457();
		}

		field62 = new BQKZHFKO[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field62[var4] = new BQKZHFKO();
		}
	}

	@ObfuscatedName("BQKZHFKO.a(I)Z")
	public final boolean method16() {
		if (field39 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field39.length; var2++) {
			var1 &= WEVRTBOZ.method526(field39[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("BQKZHFKO.b(I)LBQKZHFKO;")
	public final BQKZHFKO method17() {
		int var1 = -1;
		if (field55 != -1) {
			UNSYPSHF var2 = UNSYPSHF.field1291[field55];
			int var3 = var2.field1293;
			int var4 = var2.field1294;
			int var5 = var2.field1295;
			int var6 = client.field158[var5 - var4];
			var1 = field70.field251[var3] >> var4 & var6;
		} else if (field61 != -1) {
			var1 = field70.field251[field61];
		}

		if (var1 >= 0 && var1 < field37.length && field37[var1] != -1) {
			return method24(field37[var1]);
		}

		return null;
	}

	@ObfuscatedName("BQKZHFKO.a(Z)V")
	public static final void method18() {
		field60 = null;
		field44 = null;
		field64 = null;
		field62 = null;
		field74 = null;
	}

	@ObfuscatedName("BQKZHFKO.a(BI)Z")
	public final boolean method19(int arg0) {
		if (field69 != null) {
			for (int var4 = 0; var4 < field69.length; var4++) {
				if (field69[var4] == arg0) {
					return WEVRTBOZ.method526(field39[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field39 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field39.length; var3++) {
				var2 &= WEVRTBOZ.method526(field39[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("BQKZHFKO.a(IIIIIII)LWEVRTBOZ;")
	public final WEVRTBOZ method20(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		WEVRTBOZ var8 = method21(arg0, arg6, arg1);
		if (var8 == null) {
			return null;
		}

		if (field38 || field56) {
			var8 = new WEVRTBOZ(var8, field56, field38);
		}

		if (field38) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1363; var10++) {
				int var11 = var8.field1364[var10];
				int var12 = var8.field1366[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1365[var10] += var15 - var9;
			}

			var8.method530();
		}

		return var8;
	}

	@ObfuscatedName("BQKZHFKO.a(IIBI)LWEVRTBOZ;")
	public final WEVRTBOZ method21(int arg0, int arg1, int arg2) {
		WEVRTBOZ var4 = null;
		long var5;
		if (field69 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field58 << 6) + arg2);
			WEVRTBOZ var7 = (WEVRTBOZ) field44.method206(var5);
			if (var7 != null) {
				return var7;
			}

			if (field39 == null) {
				return null;
			}

			boolean var8 = field77 ^ arg2 > 3;
			int var9 = field39.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field39[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (WEVRTBOZ) field60.method206(var11);
				if (var4 == null) {
					var4 = WEVRTBOZ.method525(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method540();
					}

					field60.method207(var11, var4);
				}

				if (var9 > 1) {
					field78[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new WEVRTBOZ(var9, field78);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field69.length; var13++) {
				if (field69[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field58 << 6) + (var12 << 3) + arg2);
			WEVRTBOZ var14 = (WEVRTBOZ) field44.method206(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field39[var12];
			boolean var16 = field77 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (WEVRTBOZ) field60.method206(var15);
			if (var4 == null) {
				var4 = WEVRTBOZ.method525(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method540();
				}

				field60.method207(var15, var4);
			}
		}

		boolean var17;
		if (field76 == 128 && field51 == 128 && field46 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field52 == 0 && field66 == 0 && field59 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		WEVRTBOZ var19 = new WEVRTBOZ(var4, HJEXDJAH.method218(arg1), arg2 == 0 && arg1 == -1 && !var17 && !var18, field75 == null);
		if (arg1 != -1) {
			var19.method532();
			var19.method533(arg1);
			var19.field1395 = null;
			var19.field1394 = null;
		}

		while (arg2-- > 0) {
			var19.method536();
		}

		if (field75 != null) {
			for (int var20 = 0; var20 < field75.length; var20++) {
				var19.method539(field75[var20], field49[var20]);
			}
		}

		if (var17) {
			var19.method541(field76, field46, field51);
		}

		if (var18) {
			var19.method538(field66, field59, field52);
		}

		var19.method542(field43 + 64, field57 * 5 + 768, -50, -10, -50, !field56);

		if (field81 == 1) {
			var19.field1391 = var19.field945;
		}

		field44.method207(var5, var19);
		return var19;
	}

	@ObfuscatedName("BQKZHFKO.a(LELICEBAH;B)V")
	public final void method22(ELICEBAH arg0) {
		if (field39 != null) {
			for (int var2 = 0; var2 < field39.length; var2++) {
				arg0.method195(field39[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("BQKZHFKO.a()V")
	public final void method23() {
		field39 = null;
		field69 = null;
		field50 = null;
		field63 = null;
		field75 = null;
		field49 = null;
		field65 = 1;
		field53 = 1;
		field71 = true;
		field45 = true;
		field36 = false;
		field38 = false;
		field56 = false;
		field35 = false;
		field54 = -1;
		field67 = 16;
		field43 = 0;
		field57 = 0;
		field68 = null;
		field48 = -1;
		field40 = -1;
		field77 = false;
		field80 = true;
		field76 = 128;
		field51 = 128;
		field46 = 128;
		field41 = 0;
		field52 = 0;
		field66 = 0;
		field59 = 0;
		field42 = false;
		field73 = false;
		field81 = -1;
		field55 = -1;
		field61 = -1;
		field37 = null;
	}

	@ObfuscatedName("BQKZHFKO.c(I)LBQKZHFKO;")
	public static final BQKZHFKO method24(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field62[var1].field58 == arg0) {
				return field62[var1];
			}
		}

		field72 = (field72 + 1) % 20;
		BQKZHFKO var2 = field62[field72];
		field74.field1252 = field64[arg0];
		var2.field58 = arg0;
		var2.method23();
		var2.method14(field74);
		return var2;
	}
}
