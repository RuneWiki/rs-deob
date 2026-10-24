package deob;

@ObfuscatedName("LWJTLDAE")
public final class LWJTLDAE {

	@ObfuscatedName("LWJTLDAE.o")
	public int field895 = -1;

	@ObfuscatedName("LWJTLDAE.N")
	public static WIUIWDML field918 = new WIUIWDML(500);

	@ObfuscatedName("LWJTLDAE.W")
	public static PSGMMDJS[] field927 = new PSGMMDJS[4];

	@ObfuscatedName("LWJTLDAE.X")
	public static WIUIWDML field928 = new WIUIWDML(40);

	@ObfuscatedName("LWJTLDAE.g")
	public byte field888;

	@ObfuscatedName("LWJTLDAE.B")
	public byte field908;

	@ObfuscatedName("LWJTLDAE.d")
	public int field885;

	@ObfuscatedName("LWJTLDAE.f")
	public int field887;

	@ObfuscatedName("LWJTLDAE.h")
	public int field889;

	@ObfuscatedName("LWJTLDAE.i")
	public int field890;

	@ObfuscatedName("LWJTLDAE.n")
	public int field894;

	@ObfuscatedName("LWJTLDAE.s")
	public int field899;

	@ObfuscatedName("LWJTLDAE.t")
	public int field900;

	@ObfuscatedName("LWJTLDAE.v")
	public int field902;

	@ObfuscatedName("LWJTLDAE.A")
	public int field907;

	@ObfuscatedName("LWJTLDAE.E")
	public int field911;

	@ObfuscatedName("LWJTLDAE.F")
	public int field912;

	@ObfuscatedName("LWJTLDAE.G")
	public int field913;

	@ObfuscatedName("LWJTLDAE.L")
	public static int field916;

	@ObfuscatedName("LWJTLDAE.O")
	public int field919;

	@ObfuscatedName("LWJTLDAE.P")
	public int field920;

	@ObfuscatedName("LWJTLDAE.Q")
	public int field921;

	@ObfuscatedName("LWJTLDAE.R")
	public static int field922;

	@ObfuscatedName("LWJTLDAE.V")
	public int field926;

	@ObfuscatedName("LWJTLDAE.k")
	public static PKHWFJLM field892;

	@ObfuscatedName("LWJTLDAE.p")
	public static client field896;

	@ObfuscatedName("LWJTLDAE.K")
	public String field915;

	@ObfuscatedName("LWJTLDAE.a")
	public boolean field882;

	@ObfuscatedName("LWJTLDAE.b")
	public boolean field883;

	@ObfuscatedName("LWJTLDAE.j")
	public boolean field891;

	@ObfuscatedName("LWJTLDAE.m")
	public boolean field893;

	@ObfuscatedName("LWJTLDAE.q")
	public static boolean field897;

	@ObfuscatedName("LWJTLDAE.r")
	public boolean field898;

	@ObfuscatedName("LWJTLDAE.z")
	public boolean field906;

	@ObfuscatedName("LWJTLDAE.C")
	public boolean field909;

	@ObfuscatedName("LWJTLDAE.H")
	public boolean field914;

	@ObfuscatedName("LWJTLDAE.T")
	public boolean field924;

	@ObfuscatedName("LWJTLDAE.U")
	public boolean field925;

	@ObfuscatedName("LWJTLDAE.S")
	public byte[] field923;

	@ObfuscatedName("LWJTLDAE.c")
	public int[] field884;

	@ObfuscatedName("LWJTLDAE.e")
	public int[] field886;

	@ObfuscatedName("LWJTLDAE.u")
	public int[] field901;

	@ObfuscatedName("LWJTLDAE.w")
	public int[] field903;

	@ObfuscatedName("LWJTLDAE.y")
	public int[] field905;

	@ObfuscatedName("LWJTLDAE.D")
	public static int[] field910;

	@ObfuscatedName("LWJTLDAE.M")
	public static LWJTLDAE[] field917;

	@ObfuscatedName("LWJTLDAE.x")
	public String[] field904;

	@ObfuscatedName("LWJTLDAE.a(IIZI)LPSGMMDJS;")
	public final PSGMMDJS method289(int arg0, int arg1, int arg2) {
		PSGMMDJS var4 = null;
		long var5;
		if (field903 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field895 << 6) + arg0);
			PSGMMDJS var7 = (PSGMMDJS) field928.method519(var5);
			if (var7 != null) {
				return var7;
			}

			if (field905 == null) {
				return null;
			}

			boolean var8 = field883 ^ arg0 > 3;
			int var9 = field905.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field905[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (PSGMMDJS) field918.method519(var11);
				if (var4 == null) {
					var4 = PSGMMDJS.method410(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method425();
					}

					field918.method520(var11, var4);
				}

				if (var9 > 1) {
					field927[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new PSGMMDJS(var9, field927);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field903.length; var13++) {
				if (field903[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field895 << 6) + (var12 << 3) + arg0);
			PSGMMDJS var14 = (PSGMMDJS) field928.method519(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field905[var12];
			boolean var16 = field883 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (PSGMMDJS) field918.method519(var15);
			if (var4 == null) {
				var4 = PSGMMDJS.method410(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method425();
				}

				field918.method520(var15, var4);
			}
		}

		boolean var17;
		if (field890 == 128 && field926 == 128 && field920 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field911 == 0 && field885 == 0 && field900 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		PSGMMDJS var19 = new PSGMMDJS(var4, AOFTXYIM.method5(arg2), field886 == null, arg0 == 0 && arg2 == -1 && !var17 && !var18);
		if (arg2 != -1) {
			var19.method417();
			var19.method418(arg2);
			var19.field1028 = null;
			var19.field1027 = null;
		}

		while (arg0-- > 0) {
			var19.method421();
		}

		if (field886 != null) {
			for (int var20 = 0; var20 < field886.length; var20++) {
				var19.method424(field886[var20], field884[var20]);
			}
		}

		if (var17) {
			var19.method426(field926, field890, field920);
		}

		if (var18) {
			var19.method423(field885, field900, field911);
		}

		var19.method427(field908 + 64, field888 * 5 + 768, -50, -10, -50, !field909);

		if (field921 == 1) {
			var19.field1024 = var19.field1322;
		}

		field928.method520(var5, var19);
		return var19;
	}

	@ObfuscatedName("LWJTLDAE.a(I)LLWJTLDAE;")
	public static final LWJTLDAE method290(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field917[var1].field895 == arg0) {
				return field917[var1];
			}
		}

		field916 = (field916 + 1) % 20;
		LWJTLDAE var2 = field917[field916];
		field892.field971 = field910[arg0];
		var2.field895 = arg0;
		var2.method294();
		var2.method299(field892);
		return var2;
	}

	@ObfuscatedName("LWJTLDAE.b(I)LLWJTLDAE;")
	public final LWJTLDAE method291() {
		int var1 = -1;
		if (field907 != -1) {
			BCUFZZFO var2 = BCUFZZFO.field27[field907];
			int var3 = var2.field29;
			int var4 = var2.field30;
			int var5 = var2.field31;
			int var6 = client.field178[var5 - var4];
			var1 = field896.field165[var3] >> var4 & var6;
		} else if (field913 != -1) {
			var1 = field896.field165[field913];
		}

		if (var1 >= 0 && var1 < field901.length && field901[var1] != -1) {
			return method290(field901[var1]);
		}

		return null;
	}

	@ObfuscatedName("LWJTLDAE.a(B)V")
	public static final void method292() {
		field918 = null;
		field928 = null;
		field910 = null;
		field917 = null;
		field892 = null;
	}

	@ObfuscatedName("LWJTLDAE.a(ILJHGVYYQH;)V")
	public final void method293(JHGVYYQH arg0) {
		if (field905 != null) {
			for (int var2 = 0; var2 < field905.length; var2++) {
				arg0.method266(field905[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("LWJTLDAE.a()V")
	public final void method294() {
		field905 = null;
		field903 = null;
		field915 = null;
		field923 = null;
		field886 = null;
		field884 = null;
		field902 = 1;
		field894 = 1;
		field914 = true;
		field925 = true;
		field882 = false;
		field898 = false;
		field909 = false;
		field891 = false;
		field889 = -1;
		field887 = 16;
		field908 = 0;
		field888 = 0;
		field904 = null;
		field919 = -1;
		field912 = -1;
		field883 = false;
		field893 = true;
		field890 = 128;
		field926 = 128;
		field920 = 128;
		field899 = 0;
		field911 = 0;
		field885 = 0;
		field900 = 0;
		field924 = false;
		field906 = false;
		field921 = -1;
		field907 = -1;
		field913 = -1;
		field901 = null;
	}

	@ObfuscatedName("LWJTLDAE.a(IIIIIII)LPSGMMDJS;")
	public final PSGMMDJS method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		PSGMMDJS var8 = method289(arg1, arg0, arg6);
		if (var8 == null) {
			return null;
		}

		if (field898 || field909) {
			var8 = new PSGMMDJS(field898, var8, field909);
		}

		if (field898) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field996; var10++) {
				int var11 = var8.field997[var10];
				int var12 = var8.field999[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field998[var10] += var15 - var9;
			}

			var8.method415();
		}

		return var8;
	}

	@ObfuscatedName("LWJTLDAE.c(I)Z")
	public final boolean method296() {
		if (field905 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field905.length; var2++) {
			var1 &= PSGMMDJS.method411(field905[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("LWJTLDAE.a(LTXPLZUUI;)V")
	public static final void method297(TXPLZUUI arg0) {
		field892 = new PKHWFJLM(arg0.method506("loc.dat", null));
		PKHWFJLM var1 = new PKHWFJLM(arg0.method506("loc.idx", null));
		field922 = var1.method332();
		field910 = new int[field922];
		int var2 = 2;
		for (int var3 = 0; var3 < field922; var3++) {
			field910[var3] = var2;
			var2 += var1.method332();
		}

		field917 = new LWJTLDAE[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field917[var4] = new LWJTLDAE();
		}
	}

	@ObfuscatedName("LWJTLDAE.a(II)Z")
	public final boolean method298(int arg0) {
		if (field903 != null) {
			for (int var4 = 0; var4 < field903.length; var4++) {
				if (field903[var4] == arg0) {
					return PSGMMDJS.method411(field905[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field905 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field905.length; var3++) {
				var2 &= PSGMMDJS.method411(field905[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("LWJTLDAE.a(LPKHWFJLM;Z)V")
	public final void method299(PKHWFJLM arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method330();
					if (var3 == 0) {
						if (var2 == -1) {
							field882 = false;
							if (field905 != null && (field903 == null || field903[0] == 10)) {
								field882 = true;
							}

							if (field904 != null) {
								field882 = true;
							}
						}

						if (field906) {
							field914 = false;
							field925 = false;
						}

						if (field921 == -1) {
							field921 = field914 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field915 = arg0.method337();
					} else if (var3 == 3) {
						field923 = arg0.method338();
					} else if (var3 == 5) {
						int var6 = arg0.method330();
						if (var6 > 0) {
							if (field905 == null || field897) {
								field903 = null;
								field905 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field905[var7] = arg0.method332();
								}
							} else {
								arg0.field971 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field902 = arg0.method330();
					} else if (var3 == 15) {
						field894 = arg0.method330();
					} else if (var3 == 17) {
						field914 = false;
					} else if (var3 == 18) {
						field925 = false;
					} else if (var3 == 19) {
						var2 = arg0.method330();
						if (var2 == 1) {
							field882 = true;
						}
					} else if (var3 == 21) {
						field898 = true;
					} else if (var3 == 22) {
						field909 = true;
					} else if (var3 == 23) {
						field891 = true;
					} else if (var3 == 24) {
						field889 = arg0.method332();
						if (field889 == 0xFFFF) {
							field889 = -1;
						}
					} else if (var3 == 28) {
						field887 = arg0.method330();
					} else if (var3 == 29) {
						field908 = arg0.method331();
					} else if (var3 == 39) {
						field888 = arg0.method331();
					} else if (var3 >= 30 && var3 < 39) {
						if (field904 == null) {
							field904 = new String[5];
						}

						field904[var3 - 30] = arg0.method337();
						if (field904[var3 - 30].equalsIgnoreCase("hidden")) {
							field904[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method330();
						field886 = new int[var8];
						field884 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field886[var9] = arg0.method332();
							field884[var9] = arg0.method332();
						}
					} else if (var3 == 60) {
						field919 = arg0.method332();
					} else if (var3 == 62) {
						field883 = true;
					} else if (var3 == 64) {
						field893 = false;
					} else if (var3 == 65) {
						field890 = arg0.method332();
					} else if (var3 == 66) {
						field926 = arg0.method332();
					} else if (var3 == 67) {
						field920 = arg0.method332();
					} else if (var3 == 68) {
						field912 = arg0.method332();
					} else if (var3 == 69) {
						field899 = arg0.method330();
					} else if (var3 == 70) {
						field911 = arg0.method333();
					} else if (var3 == 71) {
						field885 = arg0.method333();
					} else if (var3 == 72) {
						field900 = arg0.method333();
					} else if (var3 == 73) {
						field924 = true;
					} else if (var3 == 74) {
						field906 = true;
					} else if (var3 == 75) {
						field921 = arg0.method330();
					} else if (var3 == 77) {
						field907 = arg0.method332();
						if (field907 == 0xFFFF) {
							field907 = -1;
						}

						field913 = arg0.method332();
						if (field913 == 0xFFFF) {
							field913 = -1;
						}

						int var10 = arg0.method330();
						field901 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field901[var11] = arg0.method332();
							if (field901[var11] == 0xFFFF) {
								field901[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method330();
			} while (var4 <= 0);

			if (field905 == null || field897) {
				field903 = new int[var4];
				field905 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field905[var5] = arg0.method332();
					field903[var5] = arg0.method330();
				}
			} else {
				arg0.field971 += var4 * 3;
			}
		}
	}
}
