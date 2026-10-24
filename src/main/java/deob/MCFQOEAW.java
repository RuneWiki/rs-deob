package deob;

@ObfuscatedName("MCFQOEAW")
public final class MCFQOEAW {

	@ObfuscatedName("MCFQOEAW.m")
	public int field925 = -1;

	@ObfuscatedName("MCFQOEAW.F")
	public String field944 = "null";

	@ObfuscatedName("MCFQOEAW.u")
	public static QASTZCLF field933 = new QASTZCLF(40);

	@ObfuscatedName("MCFQOEAW.v")
	public static QASTZCLF field934 = new QASTZCLF(500);

	@ObfuscatedName("MCFQOEAW.H")
	public static JJMVUSJJ[] field946 = new JJMVUSJJ[4];

	@ObfuscatedName("MCFQOEAW.h")
	public byte field920;

	@ObfuscatedName("MCFQOEAW.z")
	public byte field938;

	@ObfuscatedName("MCFQOEAW.b")
	public int field914;

	@ObfuscatedName("MCFQOEAW.c")
	public int field915;

	@ObfuscatedName("MCFQOEAW.e")
	public int field917;

	@ObfuscatedName("MCFQOEAW.g")
	public int field919;

	@ObfuscatedName("MCFQOEAW.k")
	public static int field923;

	@ObfuscatedName("MCFQOEAW.n")
	public int field926;

	@ObfuscatedName("MCFQOEAW.p")
	public int field928;

	@ObfuscatedName("MCFQOEAW.q")
	public int field929;

	@ObfuscatedName("MCFQOEAW.t")
	public int field932;

	@ObfuscatedName("MCFQOEAW.y")
	public int field937;

	@ObfuscatedName("MCFQOEAW.B")
	public int field940;

	@ObfuscatedName("MCFQOEAW.C")
	public int field941;

	@ObfuscatedName("MCFQOEAW.E")
	public static int field943;

	@ObfuscatedName("MCFQOEAW.G")
	public int field945;

	@ObfuscatedName("MCFQOEAW.I")
	public int field947;

	@ObfuscatedName("MCFQOEAW.P")
	public int field953;

	@ObfuscatedName("MCFQOEAW.S")
	public int field956;

	@ObfuscatedName("MCFQOEAW.U")
	public int field958;

	@ObfuscatedName("MCFQOEAW.R")
	public static IUVBENCV field955;

	@ObfuscatedName("MCFQOEAW.N")
	public static client field951;

	@ObfuscatedName("MCFQOEAW.a")
	public boolean field913;

	@ObfuscatedName("MCFQOEAW.d")
	public boolean field916;

	@ObfuscatedName("MCFQOEAW.f")
	public static boolean field918;

	@ObfuscatedName("MCFQOEAW.r")
	public boolean field930;

	@ObfuscatedName("MCFQOEAW.s")
	public boolean field931;

	@ObfuscatedName("MCFQOEAW.w")
	public boolean field935;

	@ObfuscatedName("MCFQOEAW.x")
	public boolean field936;

	@ObfuscatedName("MCFQOEAW.A")
	public boolean field939;

	@ObfuscatedName("MCFQOEAW.M")
	public boolean field950;

	@ObfuscatedName("MCFQOEAW.Q")
	public boolean field954;

	@ObfuscatedName("MCFQOEAW.V")
	public boolean field959;

	@ObfuscatedName("MCFQOEAW.i")
	public byte[] field921;

	@ObfuscatedName("MCFQOEAW.j")
	public int[] field922;

	@ObfuscatedName("MCFQOEAW.l")
	public int[] field924;

	@ObfuscatedName("MCFQOEAW.D")
	public int[] field942;

	@ObfuscatedName("MCFQOEAW.J")
	public int[] field948;

	@ObfuscatedName("MCFQOEAW.L")
	public static int[] field949;

	@ObfuscatedName("MCFQOEAW.O")
	public int[] field952;

	@ObfuscatedName("MCFQOEAW.o")
	public static MCFQOEAW[] field927;

	@ObfuscatedName("MCFQOEAW.T")
	public String[] field957;

	@ObfuscatedName("MCFQOEAW.a(B)LMCFQOEAW;")
	public final MCFQOEAW method332() {
		int var1 = -1;
		if (field940 != -1) {
			EHPXVLSO var2 = EHPXVLSO.field623[field940];
			int var3 = var2.field625;
			int var4 = var2.field626;
			int var5 = var2.field627;
			int var6 = client.field291[var5 - var4];
			var1 = field951.field142[var3] >> var4 & var6;
		} else if (field941 != -1) {
			var1 = field951.field142[field941];
		}

		if (var1 >= 0 && var1 < field922.length && field922[var1] != -1) {
			return method341(field922[var1]);
		}

		return null;
	}

	@ObfuscatedName("MCFQOEAW.a(LIUVBENCV;B)V")
	public final void method333(IUVBENCV arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method245();
					if (var3 == 0) {
						if (var2 == -1) {
							field936 = false;
							if (field948 != null && (field942 == null || field942[0] == 10)) {
								field936 = true;
							}

							if (field957 != null) {
								field936 = true;
							}
						}

						if (field931) {
							field935 = false;
							field913 = false;
						}

						if (field929 == -1) {
							field929 = field935 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field944 = arg0.method252();
					} else if (var3 == 3) {
						field921 = arg0.method253();
					} else if (var3 == 5) {
						int var6 = arg0.method245();
						if (var6 > 0) {
							if (field948 == null || field918) {
								field942 = null;
								field948 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field948[var7] = arg0.method247();
								}
							} else {
								arg0.field733 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field914 = arg0.method245();
					} else if (var3 == 15) {
						field947 = arg0.method245();
					} else if (var3 == 17) {
						field935 = false;
					} else if (var3 == 18) {
						field913 = false;
					} else if (var3 == 19) {
						var2 = arg0.method245();
						if (var2 == 1) {
							field936 = true;
						}
					} else if (var3 == 21) {
						field950 = true;
					} else if (var3 == 22) {
						field916 = true;
					} else if (var3 == 23) {
						field954 = true;
					} else if (var3 == 24) {
						field953 = arg0.method247();
						if (field953 == 0xFFFF) {
							field953 = -1;
						}
					} else if (var3 == 28) {
						field956 = arg0.method245();
					} else if (var3 == 29) {
						field920 = arg0.method246();
					} else if (var3 == 39) {
						field938 = arg0.method246();
					} else if (var3 >= 30 && var3 < 39) {
						if (field957 == null) {
							field957 = new String[5];
						}

						field957[var3 - 30] = arg0.method252();
						if (field957[var3 - 30].equalsIgnoreCase("hidden")) {
							field957[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method245();
						field952 = new int[var8];
						field924 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field952[var9] = arg0.method247();
							field924[var9] = arg0.method247();
						}
					} else if (var3 == 60) {
						field919 = arg0.method247();
					} else if (var3 == 62) {
						field939 = true;
					} else if (var3 == 64) {
						field930 = false;
					} else if (var3 == 65) {
						field937 = arg0.method247();
					} else if (var3 == 66) {
						field928 = arg0.method247();
					} else if (var3 == 67) {
						field926 = arg0.method247();
					} else if (var3 == 68) {
						field945 = arg0.method247();
					} else if (var3 == 69) {
						field932 = arg0.method245();
					} else if (var3 == 70) {
						field915 = arg0.method248();
					} else if (var3 == 71) {
						field917 = arg0.method248();
					} else if (var3 == 72) {
						field958 = arg0.method248();
					} else if (var3 == 73) {
						field959 = true;
					} else if (var3 == 74) {
						field931 = true;
					} else if (var3 == 75) {
						field929 = arg0.method245();
					} else if (var3 == 77) {
						field940 = arg0.method247();
						if (field940 == 0xFFFF) {
							field940 = -1;
						}

						field941 = arg0.method247();
						if (field941 == 0xFFFF) {
							field941 = -1;
						}

						int var10 = arg0.method245();
						field922 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field922[var11] = arg0.method247();
							if (field922[var11] == 0xFFFF) {
								field922[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method245();
			} while (var4 <= 0);

			if (field948 == null || field918) {
				field942 = new int[var4];
				field948 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field948[var5] = arg0.method247();
					field942[var5] = arg0.method245();
				}
			} else {
				arg0.field733 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("MCFQOEAW.a(Z)V")
	public static final void method334() {
		field934 = null;
		field933 = null;
		field949 = null;
		field927 = null;
		field955 = null;
	}

	@ObfuscatedName("MCFQOEAW.a(BLBISZONYZ;)V")
	public final void method335(BISZONYZ arg0) {
		if (field948 != null) {
			for (int var2 = 0; var2 < field948.length; var2++) {
				arg0.method26(field948[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("MCFQOEAW.a()V")
	public final void method336() {
		field948 = null;
		field942 = null;
		field944 = "null";
		field921 = null;
		field952 = null;
		field924 = null;
		field914 = 1;
		field947 = 1;
		field935 = true;
		field913 = true;
		field936 = false;
		field950 = false;
		field916 = false;
		field954 = false;
		field953 = -1;
		field956 = 16;
		field920 = 0;
		field938 = 0;
		field957 = null;
		field919 = -1;
		field945 = -1;
		field939 = false;
		field930 = true;
		field937 = 128;
		field928 = 128;
		field926 = 128;
		field932 = 0;
		field915 = 0;
		field917 = 0;
		field958 = 0;
		field959 = false;
		field931 = false;
		field929 = -1;
		field940 = -1;
		field941 = -1;
		field922 = null;
	}

	@ObfuscatedName("MCFQOEAW.a(BI)Z")
	public final boolean method337(int arg0) {
		if (field942 != null) {
			for (int var4 = 0; var4 < field942.length; var4++) {
				if (field942[var4] == arg0) {
					return JJMVUSJJ.method301(field948[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field948 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field948.length; var3++) {
				var2 &= JJMVUSJJ.method301(field948[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("MCFQOEAW.a(IIIIIII)LJJMVUSJJ;")
	public final JJMVUSJJ method338(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		JJMVUSJJ var8 = method340(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field950 || field916) {
			var8 = new JJMVUSJJ(var8, field950, field916);
		}

		if (field950) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field803; var10++) {
				int var11 = var8.field804[var10];
				int var12 = var8.field806[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field805[var10] += var15 - var9;
			}

			var8.method305();
		}

		return var8;
	}

	@ObfuscatedName("MCFQOEAW.a(LAWEEREDT;)V")
	public static final void method339(AWEEREDT arg0) {
		field955 = new IUVBENCV(arg0.method14("loc.dat", null));
		IUVBENCV var1 = new IUVBENCV(arg0.method14("loc.idx", null));
		field923 = var1.method247();
		field949 = new int[field923];
		int var2 = 2;
		for (int var3 = 0; var3 < field923; var3++) {
			field949[var3] = var2;
			var2 += var1.method247();
		}

		field927 = new MCFQOEAW[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field927[var4] = new MCFQOEAW();
		}
	}

	@ObfuscatedName("MCFQOEAW.a(IIII)LJJMVUSJJ;")
	public final JJMVUSJJ method340(int arg0, int arg1, int arg2) {
		JJMVUSJJ var4 = null;
		long var5;
		if (field942 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field925 << 6) + arg0);
			JJMVUSJJ var7 = (JJMVUSJJ) field933.method438(var5);
			if (var7 != null) {
				return var7;
			}

			if (field948 == null) {
				return null;
			}

			boolean var8 = field939 ^ arg0 > 3;
			int var9 = field948.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field948[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (JJMVUSJJ) field934.method438(var11);
				if (var4 == null) {
					var4 = JJMVUSJJ.method300(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method315();
					}

					field934.method439(var4, var11);
				}

				if (var9 > 1) {
					field946[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new JJMVUSJJ(field946, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field942.length; var13++) {
				if (field942[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field925 << 6) + (var12 << 3) + arg0);
			JJMVUSJJ var14 = (JJMVUSJJ) field933.method438(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field948[var12];
			boolean var16 = field939 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (JJMVUSJJ) field934.method438(var15);
			if (var4 == null) {
				var4 = JJMVUSJJ.method300(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method315();
				}

				field934.method439(var4, var15);
			}
		}

		boolean var17;
		if (field937 == 128 && field928 == 128 && field926 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field915 == 0 && field917 == 0 && field958 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		JJMVUSJJ var19 = new JJMVUSJJ(field952 == null, OJYMITMR.method382(arg1), arg0 == 0 && arg1 == -1 && !var17 && !var18, var4);
		if (arg1 != -1) {
			var19.method307();
			var19.method308(arg1);
			var19.field834 = null;
			var19.field833 = null;
		}

		while (arg0-- > 0) {
			var19.method311();
		}

		if (field952 != null) {
			for (int var20 = 0; var20 < field952.length; var20++) {
				var19.method314(field952[var20], field924[var20]);
			}
		}

		if (var17) {
			var19.method316(field928, field926, field937);
		}

		if (var18) {
			var19.method313(field915, field917, field958);
		}

		var19.method317(field920 + 64, field938 * 5 + 768, -50, -10, -50, !field916);

		if (field929 == 1) {
			var19.field830 = var19.field1343;
		}

		field933.method439(var19, var5);
		return var19;
	}

	@ObfuscatedName("MCFQOEAW.a(I)LMCFQOEAW;")
	public static final MCFQOEAW method341(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field927[var1].field925 == arg0) {
				return field927[var1];
			}
		}

		field943 = (field943 + 1) % 20;
		MCFQOEAW var2 = field927[field943];
		field955.field733 = field949[arg0];
		var2.field925 = arg0;
		var2.method336();
		var2.method333(field955);
		return var2;
	}

	@ObfuscatedName("MCFQOEAW.b(Z)Z")
	public final boolean method342() {
		if (field948 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field948.length; var2++) {
			var1 &= JJMVUSJJ.method301(field948[var2] & 0xFFFF);
		}

		return var1;
	}
}
