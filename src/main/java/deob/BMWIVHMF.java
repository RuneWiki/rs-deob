package deob;

@ObfuscatedName("BMWIVHMF")
public final class BMWIVHMF {

	@ObfuscatedName("BMWIVHMF.V")
	public int field116 = -1;

	@ObfuscatedName("BMWIVHMF.v")
	public static DMOAMUBS field93 = new DMOAMUBS(40);

	@ObfuscatedName("BMWIVHMF.K")
	public static DMOAMUBS field106 = new DMOAMUBS(500);

	@ObfuscatedName("BMWIVHMF.L")
	public static VYUQHOMO[] field107 = new VYUQHOMO[4];

	@ObfuscatedName("BMWIVHMF.Z")
	public byte field119;

	@ObfuscatedName("BMWIVHMF.k")
	public byte field84;

	@ObfuscatedName("BMWIVHMF.G")
	public int field102;

	@ObfuscatedName("BMWIVHMF.Q")
	public int field112;

	@ObfuscatedName("BMWIVHMF.R")
	public int field113;

	@ObfuscatedName("BMWIVHMF.S")
	public static int field114;

	@ObfuscatedName("BMWIVHMF.X")
	public int field118;

	@ObfuscatedName("BMWIVHMF.ab")
	public int field120;

	@ObfuscatedName("BMWIVHMF.d")
	public int field77;

	@ObfuscatedName("BMWIVHMF.f")
	public int field79;

	@ObfuscatedName("BMWIVHMF.g")
	public int field80;

	@ObfuscatedName("BMWIVHMF.i")
	public int field82;

	@ObfuscatedName("BMWIVHMF.j")
	public int field83;

	@ObfuscatedName("BMWIVHMF.l")
	public int field85;

	@ObfuscatedName("BMWIVHMF.n")
	public int field87;

	@ObfuscatedName("BMWIVHMF.r")
	public int field89;

	@ObfuscatedName("BMWIVHMF.s")
	public int field90;

	@ObfuscatedName("BMWIVHMF.w")
	public int field94;

	@ObfuscatedName("BMWIVHMF.A")
	public static int field96;

	@ObfuscatedName("BMWIVHMF.D")
	public int field99;

	@ObfuscatedName("BMWIVHMF.N")
	public static XGRGMPUQ field109;

	@ObfuscatedName("BMWIVHMF.c")
	public static client field76;

	@ObfuscatedName("BMWIVHMF.H")
	public String field103;

	@ObfuscatedName("BMWIVHMF.E")
	public boolean field100;

	@ObfuscatedName("BMWIVHMF.F")
	public boolean field101;

	@ObfuscatedName("BMWIVHMF.M")
	public boolean field108;

	@ObfuscatedName("BMWIVHMF.O")
	public boolean field110;

	@ObfuscatedName("BMWIVHMF.P")
	public boolean field111;

	@ObfuscatedName("BMWIVHMF.a")
	public boolean field74;

	@ObfuscatedName("BMWIVHMF.h")
	public boolean field81;

	@ObfuscatedName("BMWIVHMF.o")
	public boolean field88;

	@ObfuscatedName("BMWIVHMF.t")
	public boolean field91;

	@ObfuscatedName("BMWIVHMF.u")
	public static boolean field92;

	@ObfuscatedName("BMWIVHMF.x")
	public boolean field95;

	@ObfuscatedName("BMWIVHMF.U")
	public byte[] field115;

	@ObfuscatedName("BMWIVHMF.W")
	public int[] field117;

	@ObfuscatedName("BMWIVHMF.b")
	public int[] field75;

	@ObfuscatedName("BMWIVHMF.e")
	public int[] field78;

	@ObfuscatedName("BMWIVHMF.m")
	public static int[] field86;

	@ObfuscatedName("BMWIVHMF.B")
	public int[] field97;

	@ObfuscatedName("BMWIVHMF.C")
	public int[] field98;

	@ObfuscatedName("BMWIVHMF.J")
	public static BMWIVHMF[] field105;

	@ObfuscatedName("BMWIVHMF.I")
	public String[] field104;

	@ObfuscatedName("BMWIVHMF.a(Z)LBMWIVHMF;")
	public final BMWIVHMF method23() {
		int var1 = -1;
		if (field118 != -1) {
			HUPZKMWH var2 = HUPZKMWH.field786[field118];
			int var3 = var2.field788;
			int var4 = var2.field789;
			int var5 = var2.field790;
			int var6 = client.field339[var5 - var4];
			var1 = field76.field275[var3] >> var4 & var6;
		} else if (field120 != -1) {
			var1 = field76.field275[field120];
		}

		if (var1 >= 0 && var1 < field78.length && field78[var1] != -1) {
			return method30(field78[var1]);
		}

		return null;
	}

	@ObfuscatedName("BMWIVHMF.a(BI)Z")
	public final boolean method24(int arg0) {
		if (field98 != null) {
			for (int var4 = 0; var4 < field98.length; var4++) {
				if (field98[var4] == arg0) {
					return VYUQHOMO.method408(field97[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field97 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field97.length; var3++) {
				var2 &= VYUQHOMO.method408(field97[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("BMWIVHMF.a(I)Z")
	public final boolean method25() {
		if (field97 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field97.length; var2++) {
			var1 &= VYUQHOMO.method408(field97[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("BMWIVHMF.a(LMJLXHQTQ;)V")
	public static final void method26(MJLXHQTQ arg0) {
		field109 = new XGRGMPUQ(arg0.method317("loc.dat", null));
		XGRGMPUQ var1 = new XGRGMPUQ(arg0.method317("loc.idx", null));
		field114 = var1.method467();
		field86 = new int[field114];
		int var2 = 2;
		for (int var3 = 0; var3 < field114; var3++) {
			field86[var3] = var2;
			var2 += var1.method467();
		}

		field105 = new BMWIVHMF[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field105[var4] = new BMWIVHMF();
		}
	}

	@ObfuscatedName("BMWIVHMF.a(IIIIIII)LVYUQHOMO;")
	public final VYUQHOMO method27(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		VYUQHOMO var8 = method29(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field111 || field88) {
			var8 = new VYUQHOMO(field88, field111, var8);
		}

		if (field111) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1291; var10++) {
				int var11 = var8.field1292[var10];
				int var12 = var8.field1294[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1293[var10] += var15 - var9;
			}

			var8.method412();
		}

		return var8;
	}

	@ObfuscatedName("BMWIVHMF.a()V")
	public final void method28() {
		field97 = null;
		field98 = null;
		field103 = null;
		field115 = null;
		field117 = null;
		field75 = null;
		field85 = 1;
		field102 = 1;
		field95 = true;
		field101 = true;
		field91 = false;
		field111 = false;
		field88 = false;
		field74 = false;
		field77 = -1;
		field112 = 16;
		field119 = 0;
		field84 = 0;
		field104 = null;
		field90 = -1;
		field89 = -1;
		field100 = false;
		field108 = true;
		field94 = 128;
		field113 = 128;
		field79 = 128;
		field80 = 0;
		field83 = 0;
		field87 = 0;
		field82 = 0;
		field81 = false;
		field110 = false;
		field99 = -1;
		field118 = -1;
		field120 = -1;
		field78 = null;
	}

	@ObfuscatedName("BMWIVHMF.a(IIIB)LVYUQHOMO;")
	public final VYUQHOMO method29(int arg0, int arg1, int arg2) {
		VYUQHOMO var4 = null;
		long var5;
		if (field98 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field116 << 6) + arg0);
			VYUQHOMO var7 = (VYUQHOMO) field93.method193(var5);
			if (var7 != null) {
				return var7;
			}

			if (field97 == null) {
				return null;
			}

			boolean var8 = field100 ^ arg0 > 3;
			int var9 = field97.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field97[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (VYUQHOMO) field106.method193(var11);
				if (var4 == null) {
					var4 = VYUQHOMO.method407(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method422();
					}

					field106.method194(var11, var4);
				}

				if (var9 > 1) {
					field107[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new VYUQHOMO(field107, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field98.length; var13++) {
				if (field98[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field116 << 6) + (var12 << 3) + arg0);
			VYUQHOMO var14 = (VYUQHOMO) field93.method193(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field97[var12];
			boolean var16 = field100 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (VYUQHOMO) field106.method193(var15);
			if (var4 == null) {
				var4 = VYUQHOMO.method407(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method422();
				}

				field106.method194(var15, var4);
			}
		}

		boolean var17;
		if (field94 == 128 && field113 == 128 && field79 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field83 == 0 && field87 == 0 && field82 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		VYUQHOMO var19 = new VYUQHOMO(field117 == null, APJPJMYV.method11(arg1), var4, arg0 == 0 && arg1 == -1 && !var17 && !var18);
		if (arg1 != -1) {
			var19.method414();
			var19.method415(arg1);
			var19.field1323 = null;
			var19.field1322 = null;
		}

		while (arg0-- > 0) {
			var19.method418();
		}

		if (field117 != null) {
			for (int var20 = 0; var20 < field117.length; var20++) {
				var19.method421(field117[var20], field75[var20]);
			}
		}

		if (var17) {
			var19.method423(field79, field113, field94);
		}

		if (var18) {
			var19.method420(field82, field87, field83);
		}

		var19.method424(field119 + 64, field84 * 5 + 768, -50, -10, -50, !field88);

		if (field99 == 1) {
			var19.field1319 = var19.field827;
		}

		field93.method194(var5, var19);
		return var19;
	}

	@ObfuscatedName("BMWIVHMF.b(I)LBMWIVHMF;")
	public static final BMWIVHMF method30(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field105[var1].field116 == arg0) {
				return field105[var1];
			}
		}

		field96 = (field96 + 1) % 20;
		BMWIVHMF var2 = field105[field96];
		field109.field1432 = field86[arg0];
		var2.field116 = arg0;
		var2.method28();
		var2.method33(field109);
		return var2;
	}

	@ObfuscatedName("BMWIVHMF.a(B)V")
	public static final void method31() {
		field106 = null;
		field93 = null;
		field86 = null;
		field105 = null;
		field109 = null;
	}

	@ObfuscatedName("BMWIVHMF.a(LLAQKYZGL;Z)V")
	public final void method32(LAQKYZGL arg0) {
		if (field97 != null) {
			for (int var2 = 0; var2 < field97.length; var2++) {
				arg0.method301(field97[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("BMWIVHMF.a(ZLXGRGMPUQ;)V")
	public final void method33(XGRGMPUQ arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method465();
					if (var3 == 0) {
						if (var2 == -1) {
							field91 = false;
							if (field97 != null && (field98 == null || field98[0] == 10)) {
								field91 = true;
							}

							if (field104 != null) {
								field91 = true;
							}
						}

						if (field110) {
							field95 = false;
							field101 = false;
						}

						if (field99 == -1) {
							field99 = field95 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field103 = arg0.method472();
					} else if (var3 == 3) {
						field115 = arg0.method473();
					} else if (var3 == 5) {
						int var6 = arg0.method465();
						if (var6 > 0) {
							if (field97 == null || field92) {
								field98 = null;
								field97 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field97[var7] = arg0.method467();
								}
							} else {
								arg0.field1432 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field85 = arg0.method465();
					} else if (var3 == 15) {
						field102 = arg0.method465();
					} else if (var3 == 17) {
						field95 = false;
					} else if (var3 == 18) {
						field101 = false;
					} else if (var3 == 19) {
						var2 = arg0.method465();
						if (var2 == 1) {
							field91 = true;
						}
					} else if (var3 == 21) {
						field111 = true;
					} else if (var3 == 22) {
						field88 = true;
					} else if (var3 == 23) {
						field74 = true;
					} else if (var3 == 24) {
						field77 = arg0.method467();
						if (field77 == 0xFFFF) {
							field77 = -1;
						}
					} else if (var3 == 28) {
						field112 = arg0.method465();
					} else if (var3 == 29) {
						field119 = arg0.method466();
					} else if (var3 == 39) {
						field84 = arg0.method466();
					} else if (var3 >= 30 && var3 < 39) {
						if (field104 == null) {
							field104 = new String[5];
						}

						field104[var3 - 30] = arg0.method472();
						if (field104[var3 - 30].equalsIgnoreCase("hidden")) {
							field104[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method465();
						field117 = new int[var8];
						field75 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field117[var9] = arg0.method467();
							field75[var9] = arg0.method467();
						}
					} else if (var3 == 60) {
						field90 = arg0.method467();
					} else if (var3 == 62) {
						field100 = true;
					} else if (var3 == 64) {
						field108 = false;
					} else if (var3 == 65) {
						field94 = arg0.method467();
					} else if (var3 == 66) {
						field113 = arg0.method467();
					} else if (var3 == 67) {
						field79 = arg0.method467();
					} else if (var3 == 68) {
						field89 = arg0.method467();
					} else if (var3 == 69) {
						field80 = arg0.method465();
					} else if (var3 == 70) {
						field83 = arg0.method468();
					} else if (var3 == 71) {
						field87 = arg0.method468();
					} else if (var3 == 72) {
						field82 = arg0.method468();
					} else if (var3 == 73) {
						field81 = true;
					} else if (var3 == 74) {
						field110 = true;
					} else if (var3 == 75) {
						field99 = arg0.method465();
					} else if (var3 == 77) {
						field118 = arg0.method467();
						if (field118 == 0xFFFF) {
							field118 = -1;
						}

						field120 = arg0.method467();
						if (field120 == 0xFFFF) {
							field120 = -1;
						}

						int var10 = arg0.method465();
						field78 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field78[var11] = arg0.method467();
							if (field78[var11] == 0xFFFF) {
								field78[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method465();
			} while (var4 <= 0);

			if (field97 == null || field92) {
				field98 = new int[var4];
				field97 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field97[var5] = arg0.method467();
					field98[var5] = arg0.method465();
				}
			} else {
				arg0.field1432 += var4 * 3;
			}
		}
	}
}
