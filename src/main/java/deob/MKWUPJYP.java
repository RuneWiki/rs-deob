package deob;

@ObfuscatedName("MKWUPJYP")
public final class MKWUPJYP {

	@ObfuscatedName("MKWUPJYP.z")
	public int field955 = -1;

	@ObfuscatedName("MKWUPJYP.m")
	public static VNWSQIXW field945 = new VNWSQIXW(40);

	@ObfuscatedName("MKWUPJYP.y")
	public static VNWSQIXW field954 = new VNWSQIXW(500);

	@ObfuscatedName("MKWUPJYP.E")
	public static OQIGXOFQ[] field960 = new OQIGXOFQ[4];

	@ObfuscatedName("MKWUPJYP.c")
	public byte field937;

	@ObfuscatedName("MKWUPJYP.R")
	public byte field971;

	@ObfuscatedName("MKWUPJYP.g")
	public int field941;

	@ObfuscatedName("MKWUPJYP.j")
	public int field942;

	@ObfuscatedName("MKWUPJYP.l")
	public int field944;

	@ObfuscatedName("MKWUPJYP.n")
	public int field946;

	@ObfuscatedName("MKWUPJYP.q")
	public int field949;

	@ObfuscatedName("MKWUPJYP.D")
	public int field959;

	@ObfuscatedName("MKWUPJYP.H")
	public int field962;

	@ObfuscatedName("MKWUPJYP.I")
	public int field963;

	@ObfuscatedName("MKWUPJYP.L")
	public int field965;

	@ObfuscatedName("MKWUPJYP.N")
	public static int field967;

	@ObfuscatedName("MKWUPJYP.Q")
	public int field970;

	@ObfuscatedName("MKWUPJYP.S")
	public static int field972;

	@ObfuscatedName("MKWUPJYP.U")
	public int field974;

	@ObfuscatedName("MKWUPJYP.V")
	public int field975;

	@ObfuscatedName("MKWUPJYP.W")
	public int field976;

	@ObfuscatedName("MKWUPJYP.ab")
	public int field979;

	@ObfuscatedName("MKWUPJYP.bb")
	public int field980;

	@ObfuscatedName("MKWUPJYP.cb")
	public int field981;

	@ObfuscatedName("MKWUPJYP.a")
	public static GHHPHSRU field935;

	@ObfuscatedName("MKWUPJYP.Z")
	public static client field978;

	@ObfuscatedName("MKWUPJYP.J")
	public String field964;

	@ObfuscatedName("MKWUPJYP.e")
	public boolean field939;

	@ObfuscatedName("MKWUPJYP.f")
	public boolean field940;

	@ObfuscatedName("MKWUPJYP.p")
	public boolean field948;

	@ObfuscatedName("MKWUPJYP.s")
	public boolean field950;

	@ObfuscatedName("MKWUPJYP.t")
	public boolean field951;

	@ObfuscatedName("MKWUPJYP.A")
	public static boolean field956;

	@ObfuscatedName("MKWUPJYP.B")
	public boolean field957;

	@ObfuscatedName("MKWUPJYP.C")
	public boolean field958;

	@ObfuscatedName("MKWUPJYP.G")
	public boolean field961;

	@ObfuscatedName("MKWUPJYP.M")
	public boolean field966;

	@ObfuscatedName("MKWUPJYP.P")
	public boolean field969;

	@ObfuscatedName("MKWUPJYP.b")
	public byte[] field936;

	@ObfuscatedName("MKWUPJYP.d")
	public int[] field938;

	@ObfuscatedName("MKWUPJYP.k")
	public int[] field943;

	@ObfuscatedName("MKWUPJYP.o")
	public int[] field947;

	@ObfuscatedName("MKWUPJYP.O")
	public int[] field968;

	@ObfuscatedName("MKWUPJYP.T")
	public static int[] field973;

	@ObfuscatedName("MKWUPJYP.X")
	public int[] field977;

	@ObfuscatedName("MKWUPJYP.x")
	public static MKWUPJYP[] field953;

	@ObfuscatedName("MKWUPJYP.v")
	public String[] field952;

	@ObfuscatedName("MKWUPJYP.a(LXZFDFADG;Z)V")
	public final void method360(XZFDFADG arg0) {
		if (field943 != null) {
			for (int var2 = 0; var2 < field943.length; var2++) {
				arg0.method577(field943[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("MKWUPJYP.a(IIIIIII)LOQIGXOFQ;")
	public final OQIGXOFQ method361(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		OQIGXOFQ var8 = method366(arg1, arg0, arg6);
		if (var8 == null) {
			return null;
		}

		if (field950 || field966) {
			var8 = new OQIGXOFQ(field966, var8, field950);
		}

		if (field950) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1034; var10++) {
				int var11 = var8.field1035[var10];
				int var12 = var8.field1037[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1036[var10] += var15 - var9;
			}

			var8.method396();
		}

		return var8;
	}

	@ObfuscatedName("MKWUPJYP.a(B)Z")
	public final boolean method362() {
		if (field943 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field943.length; var2++) {
			var1 &= OQIGXOFQ.method392(field943[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("MKWUPJYP.a(LGHHPHSRU;I)V")
	public final void method363(GHHPHSRU arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method202();
					if (var3 == 0) {
						if (var2 == -1) {
							field948 = false;
							if (field943 != null && (field938 == null || field938[0] == 10)) {
								field948 = true;
							}

							if (field952 != null) {
								field948 = true;
							}
						}

						if (field951) {
							field940 = false;
							field957 = false;
						}

						if (field981 == -1) {
							field981 = field940 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field964 = arg0.method209();
					} else if (var3 == 3) {
						field936 = arg0.method210();
					} else if (var3 == 5) {
						int var6 = arg0.method202();
						if (var6 > 0) {
							if (field943 == null || field956) {
								field938 = null;
								field943 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field943[var7] = arg0.method204();
								}
							} else {
								arg0.field667 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field980 = arg0.method202();
					} else if (var3 == 15) {
						field975 = arg0.method202();
					} else if (var3 == 17) {
						field940 = false;
					} else if (var3 == 18) {
						field957 = false;
					} else if (var3 == 19) {
						var2 = arg0.method202();
						if (var2 == 1) {
							field948 = true;
						}
					} else if (var3 == 21) {
						field950 = true;
					} else if (var3 == 22) {
						field966 = true;
					} else if (var3 == 23) {
						field969 = true;
					} else if (var3 == 24) {
						field965 = arg0.method204();
						if (field965 == 0xFFFF) {
							field965 = -1;
						}
					} else if (var3 == 28) {
						field979 = arg0.method202();
					} else if (var3 == 29) {
						field971 = arg0.method203();
					} else if (var3 == 39) {
						field937 = arg0.method203();
					} else if (var3 >= 30 && var3 < 39) {
						if (field952 == null) {
							field952 = new String[5];
						}

						field952[var3 - 30] = arg0.method209();
						if (field952[var3 - 30].equalsIgnoreCase("hidden")) {
							field952[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method202();
						field977 = new int[var8];
						field947 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field977[var9] = arg0.method204();
							field947[var9] = arg0.method204();
						}
					} else if (var3 == 60) {
						field970 = arg0.method204();
					} else if (var3 == 62) {
						field961 = true;
					} else if (var3 == 64) {
						field958 = false;
					} else if (var3 == 65) {
						field949 = arg0.method204();
					} else if (var3 == 66) {
						field974 = arg0.method204();
					} else if (var3 == 67) {
						field944 = arg0.method204();
					} else if (var3 == 68) {
						field942 = arg0.method204();
					} else if (var3 == 69) {
						field941 = arg0.method202();
					} else if (var3 == 70) {
						field959 = arg0.method205();
					} else if (var3 == 71) {
						field962 = arg0.method205();
					} else if (var3 == 72) {
						field963 = arg0.method205();
					} else if (var3 == 73) {
						field939 = true;
					} else if (var3 == 74) {
						field951 = true;
					} else if (var3 == 75) {
						field981 = arg0.method202();
					} else if (var3 == 77) {
						field946 = arg0.method204();
						if (field946 == 0xFFFF) {
							field946 = -1;
						}

						field976 = arg0.method204();
						if (field976 == 0xFFFF) {
							field976 = -1;
						}

						int var10 = arg0.method202();
						field968 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field968[var11] = arg0.method204();
							if (field968[var11] == 0xFFFF) {
								field968[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method202();
			} while (var4 <= 0);

			if (field943 == null || field956) {
				field938 = new int[var4];
				field943 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field943[var5] = arg0.method204();
					field938[var5] = arg0.method202();
				}
			} else {
				arg0.field667 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("MKWUPJYP.a()V")
	public final void method364() {
		field943 = null;
		field938 = null;
		field964 = null;
		field936 = null;
		field977 = null;
		field947 = null;
		field980 = 1;
		field975 = 1;
		field940 = true;
		field957 = true;
		field948 = false;
		field950 = false;
		field966 = false;
		field969 = false;
		field965 = -1;
		field979 = 16;
		field971 = 0;
		field937 = 0;
		field952 = null;
		field970 = -1;
		field942 = -1;
		field961 = false;
		field958 = true;
		field949 = 128;
		field974 = 128;
		field944 = 128;
		field941 = 0;
		field959 = 0;
		field962 = 0;
		field963 = 0;
		field939 = false;
		field951 = false;
		field981 = -1;
		field946 = -1;
		field976 = -1;
		field968 = null;
	}

	@ObfuscatedName("MKWUPJYP.a(I)LMKWUPJYP;")
	public static final MKWUPJYP method365(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field953[var1].field955 == arg0) {
				return field953[var1];
			}
		}

		field972 = (field972 + 1) % 20;
		MKWUPJYP var2 = field953[field972];
		field935.field667 = field973[arg0];
		var2.field955 = arg0;
		var2.method364();
		var2.method363(field935);
		return var2;
	}

	@ObfuscatedName("MKWUPJYP.a(IIBI)LOQIGXOFQ;")
	public final OQIGXOFQ method366(int arg0, int arg1, int arg2) {
		OQIGXOFQ var4 = null;
		long var5;
		if (field938 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field955 << 6) + arg0);
			OQIGXOFQ var7 = (OQIGXOFQ) field945.method507(var5);
			if (var7 != null) {
				return var7;
			}

			if (field943 == null) {
				return null;
			}

			boolean var8 = field961 ^ arg0 > 3;
			int var9 = field943.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field943[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (OQIGXOFQ) field954.method507(var11);
				if (var4 == null) {
					var4 = OQIGXOFQ.method391(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method406();
					}

					field954.method508(var11, var4);
				}

				if (var9 > 1) {
					field960[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new OQIGXOFQ(var9, field960);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field938.length; var13++) {
				if (field938[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field955 << 6) + (var12 << 3) + arg0);
			OQIGXOFQ var14 = (OQIGXOFQ) field945.method507(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field943[var12];
			boolean var16 = field961 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (OQIGXOFQ) field954.method507(var15);
			if (var4 == null) {
				var4 = OQIGXOFQ.method391(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method406();
				}

				field954.method508(var15, var4);
			}
		}

		boolean var17;
		if (field949 == 128 && field974 == 128 && field944 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field959 == 0 && field962 == 0 && field963 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		OQIGXOFQ var19 = new OQIGXOFQ(XZZTWOGF.method582(arg2), var4, arg0 == 0 && arg2 == -1 && !var17 && !var18, field977 == null);
		if (arg2 != -1) {
			var19.method398();
			var19.method399(arg2);
			var19.field1066 = null;
			var19.field1065 = null;
		}

		while (arg0-- > 0) {
			var19.method402();
		}

		if (field977 != null) {
			for (int var20 = 0; var20 < field977.length; var20++) {
				var19.method405(field977[var20], field947[var20]);
			}
		}

		if (var17) {
			var19.method407(field974, field944, field949);
		}

		if (var18) {
			var19.method404(field959, field962, field963);
		}

		var19.method408(field971 + 64, field937 * 5 + 768, -50, -10, -50, !field966);

		if (field981 == 1) {
			var19.field1062 = var19.field1467;
		}

		field945.method508(var5, var19);
		return var19;
	}

	@ObfuscatedName("MKWUPJYP.a(II)Z")
	public final boolean method367(int arg0) {
		if (field938 != null) {
			for (int var4 = 0; var4 < field938.length; var4++) {
				if (field938[var4] == arg0) {
					return OQIGXOFQ.method392(field943[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field943 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field943.length; var3++) {
				var2 &= OQIGXOFQ.method392(field943[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("MKWUPJYP.b(I)V")
	public static final void method368() {
		field954 = null;
		field945 = null;
		field973 = null;
		field953 = null;
		field935 = null;
	}

	@ObfuscatedName("MKWUPJYP.a(LDTIATKJO;)V")
	public static final void method369(DTIATKJO arg0) {
		field935 = new GHHPHSRU(arg0.method168("loc.dat", null));
		GHHPHSRU var1 = new GHHPHSRU(arg0.method168("loc.idx", null));
		field967 = var1.method204();
		field973 = new int[field967];
		int var2 = 2;
		for (int var3 = 0; var3 < field967; var3++) {
			field973[var3] = var2;
			var2 += var1.method204();
		}

		field953 = new MKWUPJYP[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field953[var4] = new MKWUPJYP();
		}
	}

	@ObfuscatedName("MKWUPJYP.a(Z)LMKWUPJYP;")
	public final MKWUPJYP method370() {
		int var1 = -1;
		if (field946 != -1) {
			OIEBXCSN var2 = OIEBXCSN.field1019[field946];
			int var3 = var2.field1021;
			int var4 = var2.field1022;
			int var5 = var2.field1023;
			int var6 = client.field158[var5 - var4];
			var1 = field978.field477[var3] >> var4 & var6;
		} else if (field976 != -1) {
			var1 = field978.field477[field976];
		}

		if (var1 >= 0 && var1 < field968.length && field968[var1] != -1) {
			return method365(field968[var1]);
		}

		return null;
	}
}
