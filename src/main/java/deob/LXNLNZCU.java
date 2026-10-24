package deob;

@ObfuscatedName("LXNLNZCU")
public final class LXNLNZCU {

	@ObfuscatedName("LXNLNZCU.e")
	public int field913 = -1;

	@ObfuscatedName("LXNLNZCU.F")
	public static CYPZUKMB[] field939 = new CYPZUKMB[4];

	@ObfuscatedName("LXNLNZCU.P")
	public static THJKANXW field948 = new THJKANXW(40);

	@ObfuscatedName("LXNLNZCU.U")
	public static THJKANXW field953 = new THJKANXW(500);

	@ObfuscatedName("LXNLNZCU.h")
	public byte field916;

	@ObfuscatedName("LXNLNZCU.N")
	public byte field946;

	@ObfuscatedName("LXNLNZCU.c")
	public int field911;

	@ObfuscatedName("LXNLNZCU.f")
	public static int field914;

	@ObfuscatedName("LXNLNZCU.j")
	public int field918;

	@ObfuscatedName("LXNLNZCU.l")
	public int field920;

	@ObfuscatedName("LXNLNZCU.m")
	public int field921;

	@ObfuscatedName("LXNLNZCU.r")
	public int field926;

	@ObfuscatedName("LXNLNZCU.u")
	public int field928;

	@ObfuscatedName("LXNLNZCU.w")
	public int field930;

	@ObfuscatedName("LXNLNZCU.y")
	public int field932;

	@ObfuscatedName("LXNLNZCU.A")
	public int field934;

	@ObfuscatedName("LXNLNZCU.C")
	public int field936;

	@ObfuscatedName("LXNLNZCU.G")
	public int field940;

	@ObfuscatedName("LXNLNZCU.J")
	public int field942;

	@ObfuscatedName("LXNLNZCU.L")
	public int field944;

	@ObfuscatedName("LXNLNZCU.Q")
	public int field949;

	@ObfuscatedName("LXNLNZCU.R")
	public int field950;

	@ObfuscatedName("LXNLNZCU.S")
	public int field951;

	@ObfuscatedName("LXNLNZCU.T")
	public static int field952;

	@ObfuscatedName("LXNLNZCU.V")
	public static LBBVYYXO field954;

	@ObfuscatedName("LXNLNZCU.O")
	public static client field947;

	@ObfuscatedName("LXNLNZCU.E")
	public String field938;

	@ObfuscatedName("LXNLNZCU.b")
	public boolean field910;

	@ObfuscatedName("LXNLNZCU.g")
	public boolean field915;

	@ObfuscatedName("LXNLNZCU.i")
	public static boolean field917;

	@ObfuscatedName("LXNLNZCU.k")
	public boolean field919;

	@ObfuscatedName("LXNLNZCU.o")
	public boolean field923;

	@ObfuscatedName("LXNLNZCU.p")
	public boolean field924;

	@ObfuscatedName("LXNLNZCU.q")
	public boolean field925;

	@ObfuscatedName("LXNLNZCU.v")
	public boolean field929;

	@ObfuscatedName("LXNLNZCU.B")
	public boolean field935;

	@ObfuscatedName("LXNLNZCU.K")
	public boolean field943;

	@ObfuscatedName("LXNLNZCU.W")
	public boolean field955;

	@ObfuscatedName("LXNLNZCU.D")
	public byte[] field937;

	@ObfuscatedName("LXNLNZCU.n")
	public int[] field922;

	@ObfuscatedName("LXNLNZCU.t")
	public int[] field927;

	@ObfuscatedName("LXNLNZCU.x")
	public int[] field931;

	@ObfuscatedName("LXNLNZCU.z")
	public int[] field933;

	@ObfuscatedName("LXNLNZCU.H")
	public static int[] field941;

	@ObfuscatedName("LXNLNZCU.X")
	public int[] field956;

	@ObfuscatedName("LXNLNZCU.d")
	public static LXNLNZCU[] field912;

	@ObfuscatedName("LXNLNZCU.M")
	public String[] field945;

	@ObfuscatedName("LXNLNZCU.a(I)LLXNLNZCU;")
	public static final LXNLNZCU method409(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field912[var1].field913 == arg0) {
				return field912[var1];
			}
		}

		field914 = (field914 + 1) % 20;
		LXNLNZCU var2 = field912[field914];
		field954.field882 = field941[arg0];
		var2.field913 = arg0;
		var2.method416();
		var2.method415(field954);
		return var2;
	}

	@ObfuscatedName("LXNLNZCU.a(II)Z")
	public final boolean method410(int arg0) {
		if (field933 != null) {
			for (int var4 = 0; var4 < field933.length; var4++) {
				if (field933[var4] == arg0) {
					return CYPZUKMB.method197(field931[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field931 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field931.length; var3++) {
				var2 &= CYPZUKMB.method197(field931[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("LXNLNZCU.a(LFUZJMGZB;)V")
	public static final void method411(FUZJMGZB arg0) {
		field954 = new LBBVYYXO(arg0.method277("loc.dat", null));
		LBBVYYXO var1 = new LBBVYYXO(arg0.method277("loc.idx", null));
		field952 = var1.method371();
		field941 = new int[field952];
		int var2 = 2;
		for (int var3 = 0; var3 < field952; var3++) {
			field941[var3] = var2;
			var2 += var1.method371();
		}

		field912 = new LXNLNZCU[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field912[var4] = new LXNLNZCU();
		}
	}

	@ObfuscatedName("LXNLNZCU.b(I)LLXNLNZCU;")
	public final LXNLNZCU method412() {
		int var1 = -1;
		if (field932 != -1) {
			GJIMXWNM var2 = GJIMXWNM.field832[field932];
			int var3 = var2.field834;
			int var4 = var2.field835;
			int var5 = var2.field836;
			int var6 = client.field485[var5 - var4];
			var1 = field947.field316[var3] >> var4 & var6;
		} else if (field911 != -1) {
			var1 = field947.field316[field911];
		}

		if (var1 >= 0 && var1 < field927.length && field927[var1] != -1) {
			return method409(field927[var1]);
		}

		return null;
	}

	@ObfuscatedName("LXNLNZCU.a(Z)V")
	public static final void method413() {
		field953 = null;
		field948 = null;
		field941 = null;
		field912 = null;
		field954 = null;
	}

	@ObfuscatedName("LXNLNZCU.a(IIZI)LCYPZUKMB;")
	public final CYPZUKMB method414(int arg0, int arg1, int arg2) {
		CYPZUKMB var4 = null;
		long var5;
		if (field933 == null) {
			if (arg1 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field913 << 6) + arg0);
			CYPZUKMB var7 = (CYPZUKMB) field948.method529(var5);
			if (var7 != null) {
				return var7;
			}

			if (field931 == null) {
				return null;
			}

			boolean var8 = field935 ^ arg0 > 3;
			int var9 = field931.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field931[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (CYPZUKMB) field953.method529(var11);
				if (var4 == null) {
					var4 = CYPZUKMB.method196(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method211();
					}

					field953.method530(var11, var4);
				}

				if (var9 > 1) {
					field939[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new CYPZUKMB(field939, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field933.length; var13++) {
				if (field933[var13] == arg1) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field913 << 6) + (var12 << 3) + arg0);
			CYPZUKMB var14 = (CYPZUKMB) field948.method529(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field931[var12];
			boolean var16 = field935 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (CYPZUKMB) field953.method529(var15);
			if (var4 == null) {
				var4 = CYPZUKMB.method196(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method211();
				}

				field953.method530(var15, var4);
			}
		}

		boolean var17;
		if (field936 == 128 && field944 == 128 && field926 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field918 == 0 && field942 == 0 && field940 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		CYPZUKMB var19 = new CYPZUKMB(QGRLAQIF.method469(arg2), var4, arg0 == 0 && arg2 == -1 && !var17 && !var18, field922 == null);
		if (arg2 != -1) {
			var19.method203();
			var19.method204(arg2);
			var19.field574 = null;
			var19.field573 = null;
		}

		while (arg0-- > 0) {
			var19.method207();
		}

		if (field922 != null) {
			for (int var20 = 0; var20 < field922.length; var20++) {
				var19.method210(field922[var20], field956[var20]);
			}
		}

		if (var17) {
			var19.method212(field936, field944, field926);
		}

		if (var18) {
			var19.method209(field918, field942, field940);
		}

		var19.method213(field946 + 64, field916 * 5 + 768, -50, -10, -50, !field929);

		if (field928 == 1) {
			var19.field570 = var19.field1247;
		}

		field948.method530(var5, var19);
		return var19;
	}

	@ObfuscatedName("LXNLNZCU.a(LLBBVYYXO;B)V")
	public final void method415(LBBVYYXO arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method369();
					if (var3 == 0) {
						if (var2 == -1) {
							field924 = false;
							if (field931 != null && (field933 == null || field933[0] == 10)) {
								field924 = true;
							}

							if (field945 != null) {
								field924 = true;
							}
						}

						if (field919) {
							field910 = false;
							field923 = false;
						}

						if (field928 == -1) {
							field928 = field910 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field938 = arg0.method376();
					} else if (var3 == 3) {
						field937 = arg0.method377();
					} else if (var3 == 5) {
						int var6 = arg0.method369();
						if (var6 > 0) {
							if (field931 == null || field917) {
								field933 = null;
								field931 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field931[var7] = arg0.method371();
								}
							} else {
								arg0.field882 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field930 = arg0.method369();
					} else if (var3 == 15) {
						field950 = arg0.method369();
					} else if (var3 == 17) {
						field910 = false;
					} else if (var3 == 18) {
						field923 = false;
					} else if (var3 == 19) {
						var2 = arg0.method369();
						if (var2 == 1) {
							field924 = true;
						}
					} else if (var3 == 21) {
						field955 = true;
					} else if (var3 == 22) {
						field929 = true;
					} else if (var3 == 23) {
						field943 = true;
					} else if (var3 == 24) {
						field949 = arg0.method371();
						if (field949 == 0xFFFF) {
							field949 = -1;
						}
					} else if (var3 == 28) {
						field921 = arg0.method369();
					} else if (var3 == 29) {
						field946 = arg0.method370();
					} else if (var3 == 39) {
						field916 = arg0.method370();
					} else if (var3 >= 30 && var3 < 39) {
						if (field945 == null) {
							field945 = new String[5];
						}

						field945[var3 - 30] = arg0.method376();
						if (field945[var3 - 30].equalsIgnoreCase("hidden")) {
							field945[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method369();
						field922 = new int[var8];
						field956 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field922[var9] = arg0.method371();
							field956[var9] = arg0.method371();
						}
					} else if (var3 == 60) {
						field920 = arg0.method371();
					} else if (var3 == 62) {
						field935 = true;
					} else if (var3 == 64) {
						field915 = false;
					} else if (var3 == 65) {
						field936 = arg0.method371();
					} else if (var3 == 66) {
						field944 = arg0.method371();
					} else if (var3 == 67) {
						field926 = arg0.method371();
					} else if (var3 == 68) {
						field934 = arg0.method371();
					} else if (var3 == 69) {
						field951 = arg0.method369();
					} else if (var3 == 70) {
						field918 = arg0.method372();
					} else if (var3 == 71) {
						field942 = arg0.method372();
					} else if (var3 == 72) {
						field940 = arg0.method372();
					} else if (var3 == 73) {
						field925 = true;
					} else if (var3 == 74) {
						field919 = true;
					} else if (var3 == 75) {
						field928 = arg0.method369();
					} else if (var3 == 77) {
						field932 = arg0.method371();
						if (field932 == 0xFFFF) {
							field932 = -1;
						}

						field911 = arg0.method371();
						if (field911 == 0xFFFF) {
							field911 = -1;
						}

						int var10 = arg0.method369();
						field927 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field927[var11] = arg0.method371();
							if (field927[var11] == 0xFFFF) {
								field927[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method369();
			} while (var4 <= 0);

			if (field931 == null || field917) {
				field933 = new int[var4];
				field931 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field931[var5] = arg0.method371();
					field933[var5] = arg0.method369();
				}
			} else {
				arg0.field882 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("LXNLNZCU.a()V")
	public final void method416() {
		field931 = null;
		field933 = null;
		field938 = null;
		field937 = null;
		field922 = null;
		field956 = null;
		field930 = 1;
		field950 = 1;
		field910 = true;
		field923 = true;
		field924 = false;
		field955 = false;
		field929 = false;
		field943 = false;
		field949 = -1;
		field921 = 16;
		field946 = 0;
		field916 = 0;
		field945 = null;
		field920 = -1;
		field934 = -1;
		field935 = false;
		field915 = true;
		field936 = 128;
		field944 = 128;
		field926 = 128;
		field951 = 0;
		field918 = 0;
		field942 = 0;
		field940 = 0;
		field925 = false;
		field919 = false;
		field928 = -1;
		field932 = -1;
		field911 = -1;
		field927 = null;
	}

	@ObfuscatedName("LXNLNZCU.c(I)Z")
	public final boolean method417() {
		if (field931 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field931.length; var2++) {
			var1 &= CYPZUKMB.method197(field931[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("LXNLNZCU.a(BLEBLTOQBO;)V")
	public final void method418(EBLTOQBO arg0) {
		if (field931 != null) {
			for (int var2 = 0; var2 < field931.length; var2++) {
				arg0.method228(field931[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("LXNLNZCU.a(IIIIIII)LCYPZUKMB;")
	public final CYPZUKMB method419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		CYPZUKMB var8 = method414(arg1, arg0, arg6);
		if (var8 == null) {
			return null;
		}

		if (field955 || field929) {
			var8 = new CYPZUKMB(field929, field955, var8);
		}

		if (field955) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field543; var10++) {
				int var11 = var8.field544[var10];
				int var12 = var8.field546[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field545[var10] += var15 - var9;
			}

			var8.method201();
		}

		return var8;
	}
}
