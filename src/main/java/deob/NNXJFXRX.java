package deob;

@ObfuscatedName("NNXJFXRX")
public final class NNXJFXRX {

	@ObfuscatedName("NNXJFXRX.g")
	public int field961 = -1;

	@ObfuscatedName("NNXJFXRX.H")
	public String field984 = "null";

	@ObfuscatedName("NNXJFXRX.k")
	public static NGYJLUVS[] field965 = new NGYJLUVS[4];

	@ObfuscatedName("NNXJFXRX.G")
	public static QXKQGEKL field983 = new QXKQGEKL(40);

	@ObfuscatedName("NNXJFXRX.T")
	public static QXKQGEKL field996 = new QXKQGEKL(500);

	@ObfuscatedName("NNXJFXRX.X")
	public byte field1000;

	@ObfuscatedName("NNXJFXRX.a")
	public byte field956;

	@ObfuscatedName("NNXJFXRX.e")
	public int field960;

	@ObfuscatedName("NNXJFXRX.h")
	public int field962;

	@ObfuscatedName("NNXJFXRX.j")
	public int field964;

	@ObfuscatedName("NNXJFXRX.n")
	public static int field968;

	@ObfuscatedName("NNXJFXRX.r")
	public int field972;

	@ObfuscatedName("NNXJFXRX.y")
	public int field978;

	@ObfuscatedName("NNXJFXRX.A")
	public static int field979;

	@ObfuscatedName("NNXJFXRX.C")
	public int field980;

	@ObfuscatedName("NNXJFXRX.D")
	public int field981;

	@ObfuscatedName("NNXJFXRX.I")
	public int field985;

	@ObfuscatedName("NNXJFXRX.J")
	public int field986;

	@ObfuscatedName("NNXJFXRX.K")
	public int field987;

	@ObfuscatedName("NNXJFXRX.M")
	public int field989;

	@ObfuscatedName("NNXJFXRX.N")
	public int field990;

	@ObfuscatedName("NNXJFXRX.O")
	public int field991;

	@ObfuscatedName("NNXJFXRX.R")
	public int field994;

	@ObfuscatedName("NNXJFXRX.S")
	public int field995;

	@ObfuscatedName("NNXJFXRX.U")
	public int field997;

	@ObfuscatedName("NNXJFXRX.l")
	public static RGCGKKUR field966;

	@ObfuscatedName("NNXJFXRX.m")
	public static client field967;

	@ObfuscatedName("NNXJFXRX.Z")
	public boolean field1002;

	@ObfuscatedName("NNXJFXRX.b")
	public boolean field957;

	@ObfuscatedName("NNXJFXRX.c")
	public boolean field958;

	@ObfuscatedName("NNXJFXRX.d")
	public boolean field959;

	@ObfuscatedName("NNXJFXRX.p")
	public boolean field970;

	@ObfuscatedName("NNXJFXRX.q")
	public static boolean field971;

	@ObfuscatedName("NNXJFXRX.s")
	public boolean field973;

	@ObfuscatedName("NNXJFXRX.t")
	public boolean field974;

	@ObfuscatedName("NNXJFXRX.x")
	public boolean field977;

	@ObfuscatedName("NNXJFXRX.F")
	public boolean field982;

	@ObfuscatedName("NNXJFXRX.L")
	public boolean field988;

	@ObfuscatedName("NNXJFXRX.V")
	public byte[] field998;

	@ObfuscatedName("NNXJFXRX.i")
	public int[] field963;

	@ObfuscatedName("NNXJFXRX.o")
	public int[] field969;

	@ObfuscatedName("NNXJFXRX.u")
	public int[] field975;

	@ObfuscatedName("NNXJFXRX.P")
	public int[] field992;

	@ObfuscatedName("NNXJFXRX.Q")
	public static int[] field993;

	@ObfuscatedName("NNXJFXRX.W")
	public int[] field999;

	@ObfuscatedName("NNXJFXRX.Y")
	public static NNXJFXRX[] field1001;

	@ObfuscatedName("NNXJFXRX.v")
	public String[] field976;

	@ObfuscatedName("NNXJFXRX.a(LESUFCMYV;)V")
	public static final void method322(ESUFCMYV arg0) {
		field966 = new RGCGKKUR(arg0.method205("loc.dat", null));
		RGCGKKUR var1 = new RGCGKKUR(arg0.method205("loc.idx", null));
		field979 = var1.method457();
		field993 = new int[field979];
		int var2 = 2;
		for (int var3 = 0; var3 < field979; var3++) {
			field993[var3] = var2;
			var2 += var1.method457();
		}

		field1001 = new NNXJFXRX[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field1001[var4] = new NNXJFXRX();
		}
	}

	@ObfuscatedName("NNXJFXRX.a(I)LNNXJFXRX;")
	public static final NNXJFXRX method323(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field1001[var1].field961 == arg0) {
				return field1001[var1];
			}
		}

		field968 = (field968 + 1) % 20;
		NNXJFXRX var2 = field1001[field968];
		field966.field1350 = field993[arg0];
		var2.field961 = arg0;
		var2.method325();
		var2.method327(field966);
		return var2;
	}

	@ObfuscatedName("NNXJFXRX.a(BLNTGEPOMK;)V")
	public final void method324(NTGEPOMK arg0) {
		if (field992 != null) {
			for (int var2 = 0; var2 < field992.length; var2++) {
				arg0.method338(field992[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("NNXJFXRX.a()V")
	public final void method325() {
		field992 = null;
		field999 = null;
		field984 = "null";
		field998 = null;
		field975 = null;
		field969 = null;
		field997 = 1;
		field987 = 1;
		field982 = true;
		field959 = true;
		field973 = false;
		field970 = false;
		field974 = false;
		field958 = false;
		field964 = -1;
		field972 = 16;
		field1000 = 0;
		field956 = 0;
		field976 = null;
		field990 = -1;
		field986 = -1;
		field977 = false;
		field1002 = true;
		field978 = 128;
		field989 = 128;
		field985 = 128;
		field991 = 0;
		field981 = 0;
		field994 = 0;
		field980 = 0;
		field957 = false;
		field988 = false;
		field962 = -1;
		field960 = -1;
		field995 = -1;
		field963 = null;
	}

	@ObfuscatedName("NNXJFXRX.a(IIIB)LNGYJLUVS;")
	public final NGYJLUVS method326(int arg0, int arg1, int arg2) {
		NGYJLUVS var4 = null;
		long var5;
		if (field999 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field961 << 6) + arg2);
			NGYJLUVS var7 = (NGYJLUVS) field983.method440(var5);
			if (var7 != null) {
				return var7;
			}

			if (field992 == null) {
				return null;
			}

			boolean var8 = field977 ^ arg2 > 3;
			int var9 = field992.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field992[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (NGYJLUVS) field996.method440(var11);
				if (var4 == null) {
					var4 = NGYJLUVS.method291(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method306();
					}

					field996.method441(var11, var4);
				}

				if (var9 > 1) {
					field965[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new NGYJLUVS(field965, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field999.length; var13++) {
				if (field999[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg0 + 1) << 32) + ((field961 << 6) + (var12 << 3) + arg2);
			NGYJLUVS var14 = (NGYJLUVS) field983.method440(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field992[var12];
			boolean var16 = field977 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (NGYJLUVS) field996.method440(var15);
			if (var4 == null) {
				var4 = NGYJLUVS.method291(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method306();
				}

				field996.method441(var15, var4);
			}
		}

		boolean var17;
		if (field978 == 128 && field989 == 128 && field985 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field981 == 0 && field994 == 0 && field980 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		NGYJLUVS var19 = new NGYJLUVS(PHDJZMLE.method428(arg0), field975 == null, var4, arg2 == 0 && arg0 == -1 && !var17 && !var18);
		if (arg0 != -1) {
			var19.method298();
			var19.method299(arg0);
			var19.field891 = null;
			var19.field890 = null;
		}

		while (arg2-- > 0) {
			var19.method302();
		}

		if (field975 != null) {
			for (int var20 = 0; var20 < field975.length; var20++) {
				var19.method305(field975[var20], field969[var20]);
			}
		}

		if (var17) {
			var19.method307(field985, field978, field989);
		}

		if (var18) {
			var19.method304(field981, field994, field980);
		}

		var19.method308(field1000 + 64, field956 * 5 + 768, -50, -10, -50, !field974);

		if (field962 == 1) {
			var19.field887 = var19.field845;
		}

		field983.method441(var5, var19);
		return var19;
	}

	@ObfuscatedName("NNXJFXRX.a(ILRGCGKKUR;)V")
	public final void method327(RGCGKKUR arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method455();
					if (var3 == 0) {
						if (var2 == -1) {
							field973 = false;
							if (field992 != null && (field999 == null || field999[0] == 10)) {
								field973 = true;
							}

							if (field976 != null) {
								field973 = true;
							}
						}

						if (field988) {
							field982 = false;
							field959 = false;
						}

						if (field962 == -1) {
							field962 = field982 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field984 = arg0.method462();
					} else if (var3 == 3) {
						field998 = arg0.method463();
					} else if (var3 == 5) {
						int var6 = arg0.method455();
						if (var6 > 0) {
							if (field992 == null || field971) {
								field999 = null;
								field992 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field992[var7] = arg0.method457();
								}
							} else {
								arg0.field1350 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field997 = arg0.method455();
					} else if (var3 == 15) {
						field987 = arg0.method455();
					} else if (var3 == 17) {
						field982 = false;
					} else if (var3 == 18) {
						field959 = false;
					} else if (var3 == 19) {
						var2 = arg0.method455();
						if (var2 == 1) {
							field973 = true;
						}
					} else if (var3 == 21) {
						field970 = true;
					} else if (var3 == 22) {
						field974 = true;
					} else if (var3 == 23) {
						field958 = true;
					} else if (var3 == 24) {
						field964 = arg0.method457();
						if (field964 == 0xFFFF) {
							field964 = -1;
						}
					} else if (var3 == 28) {
						field972 = arg0.method455();
					} else if (var3 == 29) {
						field1000 = arg0.method456();
					} else if (var3 == 39) {
						field956 = arg0.method456();
					} else if (var3 >= 30 && var3 < 39) {
						if (field976 == null) {
							field976 = new String[5];
						}

						field976[var3 - 30] = arg0.method462();
						if (field976[var3 - 30].equalsIgnoreCase("hidden")) {
							field976[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method455();
						field975 = new int[var8];
						field969 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field975[var9] = arg0.method457();
							field969[var9] = arg0.method457();
						}
					} else if (var3 == 60) {
						field990 = arg0.method457();
					} else if (var3 == 62) {
						field977 = true;
					} else if (var3 == 64) {
						field1002 = false;
					} else if (var3 == 65) {
						field978 = arg0.method457();
					} else if (var3 == 66) {
						field989 = arg0.method457();
					} else if (var3 == 67) {
						field985 = arg0.method457();
					} else if (var3 == 68) {
						field986 = arg0.method457();
					} else if (var3 == 69) {
						field991 = arg0.method455();
					} else if (var3 == 70) {
						field981 = arg0.method458();
					} else if (var3 == 71) {
						field994 = arg0.method458();
					} else if (var3 == 72) {
						field980 = arg0.method458();
					} else if (var3 == 73) {
						field957 = true;
					} else if (var3 == 74) {
						field988 = true;
					} else if (var3 == 75) {
						field962 = arg0.method455();
					} else if (var3 == 77) {
						field960 = arg0.method457();
						if (field960 == 0xFFFF) {
							field960 = -1;
						}

						field995 = arg0.method457();
						if (field995 == 0xFFFF) {
							field995 = -1;
						}

						int var10 = arg0.method455();
						field963 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field963[var11] = arg0.method457();
							if (field963[var11] == 0xFFFF) {
								field963[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method455();
			} while (var4 <= 0);

			if (field992 == null || field971) {
				field999 = new int[var4];
				field992 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field992[var5] = arg0.method457();
					field999[var5] = arg0.method455();
				}
			} else {
				arg0.field1350 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("NNXJFXRX.a(IIIIIII)LNGYJLUVS;")
	public final NGYJLUVS method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		NGYJLUVS var8 = method326(arg6, arg0, arg1);
		if (var8 == null) {
			return null;
		}

		if (field970 || field974) {
			var8 = new NGYJLUVS(field970, field974, var8);
		}

		if (field970) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field860; var10++) {
				int var11 = var8.field861[var10];
				int var12 = var8.field863[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field862[var10] += var15 - var9;
			}

			var8.method296();
		}

		return var8;
	}

	@ObfuscatedName("NNXJFXRX.a(BI)Z")
	public final boolean method329(int arg0) {
		if (field999 != null) {
			for (int var4 = 0; var4 < field999.length; var4++) {
				if (field999[var4] == arg0) {
					return NGYJLUVS.method292(field992[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field992 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field992.length; var3++) {
				var2 &= NGYJLUVS.method292(field992[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("NNXJFXRX.a(Z)LNNXJFXRX;")
	public final NNXJFXRX method330() {
		int var1 = -1;
		if (field960 != -1) {
			DPQEBGAZ var2 = DPQEBGAZ.field532[field960];
			int var3 = var2.field534;
			int var4 = var2.field535;
			int var5 = var2.field536;
			int var6 = client.field103[var5 - var4];
			var1 = field967.field154[var3] >> var4 & var6;
		} else if (field995 != -1) {
			var1 = field967.field154[field995];
		}

		if (var1 >= 0 && var1 < field963.length && field963[var1] != -1) {
			return method323(field963[var1]);
		}

		return null;
	}

	@ObfuscatedName("NNXJFXRX.b(I)V")
	public static final void method331() {
		field996 = null;
		field983 = null;
		field993 = null;
		field1001 = null;
		field966 = null;
	}

	@ObfuscatedName("NNXJFXRX.b(Z)Z")
	public final boolean method332() {
		if (field992 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field992.length; var2++) {
			var1 &= NGYJLUVS.method292(field992[var2] & 0xFFFF);
		}

		return var1;
	}
}
