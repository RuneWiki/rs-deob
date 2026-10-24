package deob;

@ObfuscatedName("MHOZCPTF")
public final class MHOZCPTF {

	@ObfuscatedName("MHOZCPTF.j")
	public int field888 = -1;

	@ObfuscatedName("MHOZCPTF.m")
	public static boolean field889 = true;

	@ObfuscatedName("MHOZCPTF.p")
	public static EOJHVRZF field892 = new EOJHVRZF(50);

	@ObfuscatedName("MHOZCPTF.D")
	public static EOJHVRZF field904 = new EOJHVRZF(100);

	@ObfuscatedName("MHOZCPTF.t")
	public byte field896;

	@ObfuscatedName("MHOZCPTF.W")
	public byte field921;

	@ObfuscatedName("MHOZCPTF.a")
	public int field880;

	@ObfuscatedName("MHOZCPTF.b")
	public int field881;

	@ObfuscatedName("MHOZCPTF.c")
	public int field882;

	@ObfuscatedName("MHOZCPTF.d")
	public int field883;

	@ObfuscatedName("MHOZCPTF.f")
	public int field884;

	@ObfuscatedName("MHOZCPTF.g")
	public int field885;

	@ObfuscatedName("MHOZCPTF.i")
	public int field887;

	@ObfuscatedName("MHOZCPTF.n")
	public int field890;

	@ObfuscatedName("MHOZCPTF.r")
	public static int field894;

	@ObfuscatedName("MHOZCPTF.u")
	public int field897;

	@ObfuscatedName("MHOZCPTF.v")
	public int field898;

	@ObfuscatedName("MHOZCPTF.x")
	public int field899;

	@ObfuscatedName("MHOZCPTF.y")
	public int field900;

	@ObfuscatedName("MHOZCPTF.A")
	public int field902;

	@ObfuscatedName("MHOZCPTF.B")
	public int field903;

	@ObfuscatedName("MHOZCPTF.E")
	public int field905;

	@ObfuscatedName("MHOZCPTF.H")
	public int field907;

	@ObfuscatedName("MHOZCPTF.I")
	public int field908;

	@ObfuscatedName("MHOZCPTF.K")
	public int field910;

	@ObfuscatedName("MHOZCPTF.N")
	public int field912;

	@ObfuscatedName("MHOZCPTF.O")
	public int field913;

	@ObfuscatedName("MHOZCPTF.Q")
	public int field915;

	@ObfuscatedName("MHOZCPTF.R")
	public int field916;

	@ObfuscatedName("MHOZCPTF.U")
	public int field919;

	@ObfuscatedName("MHOZCPTF.X")
	public static int field922;

	@ObfuscatedName("MHOZCPTF.Z")
	public int field924;

	@ObfuscatedName("MHOZCPTF.ab")
	public int field925;

	@ObfuscatedName("MHOZCPTF.bb")
	public int field926;

	@ObfuscatedName("MHOZCPTF.cb")
	public int field927;

	@ObfuscatedName("MHOZCPTF.z")
	public static UAWAYCTK field901;

	@ObfuscatedName("MHOZCPTF.h")
	public String field886;

	@ObfuscatedName("MHOZCPTF.P")
	public boolean field914;

	@ObfuscatedName("MHOZCPTF.S")
	public boolean field917;

	@ObfuscatedName("MHOZCPTF.L")
	public byte[] field911;

	@ObfuscatedName("MHOZCPTF.o")
	public int[] field891;

	@ObfuscatedName("MHOZCPTF.q")
	public int[] field893;

	@ObfuscatedName("MHOZCPTF.s")
	public int[] field895;

	@ObfuscatedName("MHOZCPTF.T")
	public int[] field918;

	@ObfuscatedName("MHOZCPTF.Y")
	public static int[] field923;

	@ObfuscatedName("MHOZCPTF.V")
	public static MHOZCPTF[] field920;

	@ObfuscatedName("MHOZCPTF.F")
	public String[] field906;

	@ObfuscatedName("MHOZCPTF.J")
	public String[] field909;

	@ObfuscatedName("MHOZCPTF.a(II)LWEVRTBOZ;")
	public final WEVRTBOZ method311(int arg0) {
		int var2 = field926;
		int var3 = field882;
		int var4 = field912;
		if (arg0 == 1) {
			var2 = field899;
			var3 = field907;
			var4 = field924;
		}

		if (var2 == -1) {
			return null;
		}

		WEVRTBOZ var5 = WEVRTBOZ.method525(var2);
		if (var3 != -1) {
			if (var4 == -1) {
				WEVRTBOZ var9 = WEVRTBOZ.method525(var3);
				WEVRTBOZ[] var10 = new WEVRTBOZ[] { var5, var9 };
				var5 = new WEVRTBOZ(2, var10);
			} else {
				WEVRTBOZ var6 = WEVRTBOZ.method525(var3);
				WEVRTBOZ var7 = WEVRTBOZ.method525(var4);
				WEVRTBOZ[] var8 = new WEVRTBOZ[] { var5, var6, var7 };
				var5 = new WEVRTBOZ(3, var8);
			}
		}

		if (arg0 == 0 && field921 != 0) {
			var5.method538(field921, 0, 0);
		}

		if (arg0 == 1 && field896 != 0) {
			var5.method538(field896, 0, 0);
		}

		if (field893 != null) {
			for (int var11 = 0; var11 < field893.length; var11++) {
				var5.method539(field893[var11], field895[var11]);
			}
		}

		return var5;
	}

	@ObfuscatedName("MHOZCPTF.a(ILUAWAYCTK;)V")
	public final void method312(UAWAYCTK arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field897 = arg0.method457();
			} else if (var2 == 2) {
				field886 = arg0.method462();
			} else if (var2 == 3) {
				field911 = arg0.method463();
			} else if (var2 == 4) {
				field905 = arg0.method457();
			} else if (var2 == 5) {
				field884 = arg0.method457();
			} else if (var2 == 6) {
				field881 = arg0.method457();
			} else if (var2 == 7) {
				field915 = arg0.method457();
				if (field915 > 32767) {
					field915 -= 0x10000;
				}
			} else if (var2 == 8) {
				field898 = arg0.method457();
				if (field898 > 32767) {
					field898 -= 0x10000;
				}
			} else if (var2 == 10) {
				field880 = arg0.method457();
			} else if (var2 == 11) {
				field914 = true;
			} else if (var2 == 12) {
				field902 = arg0.method460();
			} else if (var2 == 16) {
				field917 = true;
			} else if (var2 == 23) {
				field926 = arg0.method457();
				field921 = arg0.method456();
			} else if (var2 == 24) {
				field882 = arg0.method457();
			} else if (var2 == 25) {
				field899 = arg0.method457();
				field896 = arg0.method456();
			} else if (var2 == 26) {
				field907 = arg0.method457();
			} else if (var2 >= 30 && var2 < 35) {
				if (field906 == null) {
					field906 = new String[5];
				}

				field906[var2 - 30] = arg0.method462();
				if (field906[var2 - 30].equalsIgnoreCase("hidden")) {
					field906[var2 - 30] = null;
				}
			} else if (var2 >= 35 && var2 < 40) {
				if (field909 == null) {
					field909 = new String[5];
				}

				field909[var2 - 35] = arg0.method462();
			} else if (var2 == 40) {
				int var3 = arg0.method455();
				field893 = new int[var3];
				field895 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field893[var4] = arg0.method457();
					field895[var4] = arg0.method457();
				}
			} else if (var2 == 78) {
				field912 = arg0.method457();
			} else if (var2 == 79) {
				field924 = arg0.method457();
			} else if (var2 == 90) {
				field900 = arg0.method457();
			} else if (var2 == 91) {
				field887 = arg0.method457();
			} else if (var2 == 92) {
				field883 = arg0.method457();
			} else if (var2 == 93) {
				field903 = arg0.method457();
			} else if (var2 == 95) {
				field925 = arg0.method457();
			} else if (var2 == 97) {
				field916 = arg0.method457();
			} else if (var2 == 98) {
				field908 = arg0.method457();
			} else if (var2 >= 100 && var2 < 110) {
				if (field891 == null) {
					field891 = new int[10];
					field918 = new int[10];
				}

				field891[var2 - 100] = arg0.method457();
				field918[var2 - 100] = arg0.method457();
			} else if (var2 == 110) {
				field919 = arg0.method457();
			} else if (var2 == 111) {
				field890 = arg0.method457();
			} else if (var2 == 112) {
				field913 = arg0.method457();
			} else if (var2 == 113) {
				field885 = arg0.method456();
			} else if (var2 == 114) {
				field910 = arg0.method456() * 5;
			} else if (var2 == 115) {
				field927 = arg0.method455();
			}
		}
	}

	@ObfuscatedName("MHOZCPTF.a()V")
	public final void method313() {
		field897 = 0;
		field886 = null;
		field911 = null;
		field893 = null;
		field895 = null;
		field905 = 2000;
		field884 = 0;
		field881 = 0;
		field925 = 0;
		field915 = 0;
		field898 = 0;
		field880 = -1;
		field914 = false;
		field902 = 1;
		field917 = false;
		field906 = null;
		field909 = null;
		field926 = -1;
		field882 = -1;
		field921 = 0;
		field899 = -1;
		field907 = -1;
		field896 = 0;
		field912 = -1;
		field924 = -1;
		field900 = -1;
		field883 = -1;
		field887 = -1;
		field903 = -1;
		field891 = null;
		field918 = null;
		field916 = -1;
		field908 = -1;
		field919 = 128;
		field890 = 128;
		field913 = 128;
		field885 = 0;
		field910 = 0;
		field927 = 0;
	}

	@ObfuscatedName("MHOZCPTF.a(IIII)LIBHVCUAH;")
	public static final IBHVCUAH method314(int arg0, int arg1, int arg2) {
		if (arg0 == 0) {
			IBHVCUAH var3 = (IBHVCUAH) field904.method206(arg1);
			if (var3 != null && var3.field658 != arg2 && var3.field658 != -1) {
				var3.method398();
				var3 = null;
			}

			if (var3 != null) {
				return var3;
			}
		}

		MHOZCPTF var4 = method322(arg1);
		if (var4.field891 == null) {
			arg2 = -1;
		}

		if (arg2 > 1) {
			int var5 = -1;
			for (int var6 = 0; var6 < 10; var6++) {
				if (arg2 >= var4.field918[var6] && var4.field918[var6] != 0) {
					var5 = var4.field891[var6];
				}
			}

			if (var5 != -1) {
				var4 = method322(var5);
			}
		}

		WEVRTBOZ var7 = var4.method320(1);
		if (var7 == null) {
			return null;
		}

		IBHVCUAH var8 = null;
		if (var4.field908 != -1) {
			var8 = method314(-1, var4.field916, 10);
			if (var8 == null) {
				return null;
			}
		}

		IBHVCUAH var9 = new IBHVCUAH(32, 32);
		int var10 = JXPUZKMY.field756;
		int var11 = JXPUZKMY.field757;
		int[] var12 = JXPUZKMY.field762;
		int[] var13 = TTGPXKMD.field1186;
		int var14 = TTGPXKMD.field1187;
		int var15 = TTGPXKMD.field1188;
		int var16 = TTGPXKMD.field1191;
		int var17 = TTGPXKMD.field1192;
		int var18 = TTGPXKMD.field1189;
		int var19 = TTGPXKMD.field1190;
		JXPUZKMY.field754 = false;
		TTGPXKMD.method427(var9.field652, 32, 32);
		TTGPXKMD.method432(0, 0, 32, 0, 32);
		JXPUZKMY.method289();
		int var20 = var4.field905;
		if (arg0 == -1) {
			var20 = (int) (var20 * 1.5D);
		}

		if (arg0 > 0) {
			var20 = (int) (var20 * 1.04D);
		}

		int var21 = JXPUZKMY.field760[var4.field884] * var20 >> 16;
		int var22 = JXPUZKMY.field761[var4.field884] * var20 >> 16;
		var7.method545(0, var4.field881, var4.field925, var4.field884, var4.field915, var7.field945 / 2 + var21 + var4.field898, var4.field898 + var22);

		for (int var23 = 31; var23 >= 0; var23--) {
			for (int var24 = 31; var24 >= 0; var24--) {
				if (var9.field652[var24 * 32 + var23] == 0) {
					if (var23 > 0 && var9.field652[var24 * 32 + var23 - 1] > 1) {
						var9.field652[var24 * 32 + var23] = 1;
					} else if (var24 > 0 && var9.field652[(var24 - 1) * 32 + var23] > 1) {
						var9.field652[var24 * 32 + var23] = 1;
					} else if (var23 < 31 && var9.field652[var24 * 32 + var23 + 1] > 1) {
						var9.field652[var24 * 32 + var23] = 1;
					} else if (var24 < 31 && var9.field652[(var24 + 1) * 32 + var23] > 1) {
						var9.field652[var24 * 32 + var23] = 1;
					}
				}
			}
		}

		if (arg0 > 0) {
			for (int var25 = 31; var25 >= 0; var25--) {
				for (int var26 = 31; var26 >= 0; var26--) {
					if (var9.field652[var26 * 32 + var25] == 0) {
						if (var25 > 0 && var9.field652[var26 * 32 + var25 - 1] == 1) {
							var9.field652[var26 * 32 + var25] = arg0;
						} else if (var26 > 0 && var9.field652[(var26 - 1) * 32 + var25] == 1) {
							var9.field652[var26 * 32 + var25] = arg0;
						} else if (var25 < 31 && var9.field652[var26 * 32 + var25 + 1] == 1) {
							var9.field652[var26 * 32 + var25] = arg0;
						} else if (var26 < 31 && var9.field652[(var26 + 1) * 32 + var25] == 1) {
							var9.field652[var26 * 32 + var25] = arg0;
						}
					}
				}
			}
		} else if (arg0 == 0) {
			for (int var27 = 31; var27 >= 0; var27--) {
				for (int var28 = 31; var28 >= 0; var28--) {
					if (var9.field652[var28 * 32 + var27] == 0 && var27 > 0 && var28 > 0 && var9.field652[(var28 - 1) * 32 + var27 - 1] > 0) {
						var9.field652[var28 * 32 + var27] = 0x302020;
					}
				}
			}
		}

		if (var4.field908 != -1) {
			int var29 = var8.field657;
			int var30 = var8.field658;
			var8.field657 = 32;
			var8.field658 = 32;
			var8.method232(0, 0);
			var8.field657 = var29;
			var8.field658 = var30;
		}

		if (arg0 == 0) {
			field904.method207(arg1, var9);
		}

		TTGPXKMD.method427(var13, var15, var14);
		TTGPXKMD.method429(var18, var17, var19, var16);
		JXPUZKMY.field756 = var10;
		JXPUZKMY.field757 = var11;
		JXPUZKMY.field762 = var12;
		JXPUZKMY.field754 = true;

		if (var4.field914) {
			var9.field657 = 33;
		} else {
			var9.field657 = 32;
		}

		var9.field658 = arg2;
		return var9;
	}

	@ObfuscatedName("MHOZCPTF.a(IB)Z")
	public final boolean method315(int arg0) {
		int var2 = field900;
		int var3 = field883;
		if (arg0 == 1) {
			var2 = field887;
			var3 = field903;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var4 = true;
		if (!WEVRTBOZ.method526(var2)) {
			var4 = false;
		}

		if (var3 != -1 && !WEVRTBOZ.method526(var3)) {
			var4 = false;
		}

		return var4;
	}

	@ObfuscatedName("MHOZCPTF.a(LRVLWVPJQ;)V")
	public static final void method316(RVLWVPJQ arg0) {
		field901 = new UAWAYCTK(arg0.method424("obj.dat", null));
		UAWAYCTK var1 = new UAWAYCTK(arg0.method424("obj.idx", null));
		field922 = var1.method457();
		field923 = new int[field922];
		int var2 = 2;
		for (int var3 = 0; var3 < field922; var3++) {
			field923[var3] = var2;
			var2 += var1.method457();
		}

		field920 = new MHOZCPTF[10];
		for (int var4 = 0; var4 < 10; var4++) {
			field920[var4] = new MHOZCPTF();
		}
	}

	@ObfuscatedName("MHOZCPTF.a(IZ)LWEVRTBOZ;")
	public final WEVRTBOZ method317(int arg0) {
		if (field891 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field918[var3] && field918[var3] != 0) {
					var2 = field891[var3];
				}
			}

			if (var2 != -1) {
				return method322(var2).method317(1);
			}
		}

		WEVRTBOZ var4 = WEVRTBOZ.method525(field897);
		if (var4 == null) {
			return null;
		}

		if (field893 != null) {
			for (int var5 = 0; var5 < field893.length; var5++) {
				var4.method539(field893[var5], field895[var5]);
			}
		}

		return var4;
	}

	@ObfuscatedName("MHOZCPTF.b(IB)Z")
	public final boolean method318(int arg0) {
		int var2 = field926;
		int var3 = field882;
		int var4 = field912;
		if (arg0 == 1) {
			var2 = field899;
			var3 = field907;
			var4 = field924;
		}

		if (var2 == -1) {
			return true;
		}

		boolean var5 = true;
		if (!WEVRTBOZ.method526(var2)) {
			var5 = false;
		}

		if (var3 != -1 && !WEVRTBOZ.method526(var3)) {
			var5 = false;
		}

		if (var4 != -1 && !WEVRTBOZ.method526(var4)) {
			var5 = false;
		}

		return var5;
	}

	@ObfuscatedName("MHOZCPTF.a(B)V")
	public void method319() {
		MHOZCPTF var1 = method322(field908);
		field897 = var1.field897;
		field905 = var1.field905;
		field884 = var1.field884;
		field881 = var1.field881;
		field925 = var1.field925;
		field915 = var1.field915;
		field898 = var1.field898;
		field893 = var1.field893;
		field895 = var1.field895;
		MHOZCPTF var2 = method322(field916);
		field886 = var2.field886;
		field917 = var2.field917;
		field902 = var2.field902;
		String var3 = "a";
		char var4 = var2.field886.charAt(0);
		if (var4 == 'A' || var4 == 'E' || var4 == 'I' || var4 == 'O' || var4 == 'U') {
			var3 = "an";
		}

		field911 = ("Swap this note at any bank for " + var3 + " " + var2.field886 + ".").getBytes();
		field914 = true;
	}

	@ObfuscatedName("MHOZCPTF.a(I)LWEVRTBOZ;")
	public final WEVRTBOZ method320(int arg0) {
		if (field891 != null && arg0 > 1) {
			int var2 = -1;
			for (int var3 = 0; var3 < 10; var3++) {
				if (arg0 >= field918[var3] && field918[var3] != 0) {
					var2 = field891[var3];
				}
			}

			if (var2 != -1) {
				return method322(var2).method320(1);
			}
		}

		WEVRTBOZ var4 = (WEVRTBOZ) field892.method206(field888);
		if (var4 != null) {
			return var4;
		}

		WEVRTBOZ var5 = WEVRTBOZ.method525(field897);
		if (var5 == null) {
			return null;
		}

		if (field919 != 128 || field890 != 128 || field913 != 128) {
			var5.method541(field919, field913, field890);
		}

		if (field893 != null) {
			for (int var6 = 0; var6 < field893.length; var6++) {
				var5.method539(field893[var6], field895[var6]);
			}
		}

		var5.method542(field885 + 64, field910 + 768, -50, -10, -50, true);
		var5.field1396 = true;
		field892.method207(field888, var5);
		return var5;
	}

	@ObfuscatedName("MHOZCPTF.b(IZ)LWEVRTBOZ;")
	public final WEVRTBOZ method321(int arg0) {
		int var2 = field900;
		int var3 = field883;
		if (arg0 == 1) {
			var2 = field887;
			var3 = field903;
		}

		if (var2 == -1) {
			return null;
		}

		WEVRTBOZ var4 = WEVRTBOZ.method525(var2);
		if (var3 != -1) {
			WEVRTBOZ var5 = WEVRTBOZ.method525(var3);
			WEVRTBOZ[] var6 = new WEVRTBOZ[] { var4, var5 };
			var4 = new WEVRTBOZ(2, var6);
		}

		if (field893 != null) {
			for (int var7 = 0; var7 < field893.length; var7++) {
				var4.method539(field893[var7], field895[var7]);
			}
		}

		return var4;
	}

	@ObfuscatedName("MHOZCPTF.b(I)LMHOZCPTF;")
	public static final MHOZCPTF method322(int arg0) {
		for (int var1 = 0; var1 < 10; var1++) {
			if (field920[var1].field888 == arg0) {
				return field920[var1];
			}
		}

		field894 = (field894 + 1) % 10;
		MHOZCPTF var2 = field920[field894];
		field901.field1252 = field923[arg0];
		var2.field888 = arg0;
		var2.method313();
		var2.method312(field901);

		if (var2.field908 != -1) {
			var2.method319();
		}

		if (!field889 && var2.field917) {
			var2.field886 = "Members Object";
			var2.field911 = "Login to a members' server to use this object.".getBytes();
			var2.field906 = null;
			var2.field909 = null;
			var2.field927 = 0;
		}

		return var2;
	}

	@ObfuscatedName("MHOZCPTF.a(Z)V")
	public static final void method323() {
		field892 = null;
		field904 = null;
		field923 = null;
		field920 = null;
		field901 = null;
	}
}
