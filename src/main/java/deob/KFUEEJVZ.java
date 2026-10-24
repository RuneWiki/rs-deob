package deob;

@ObfuscatedName("KFUEEJVZ")
public final class KFUEEJVZ {

	@ObfuscatedName("KFUEEJVZ.a")
	public int field860 = -1;

	@ObfuscatedName("KFUEEJVZ.e")
	public int field863 = -1;

	@ObfuscatedName("KFUEEJVZ.g")
	public byte field865 = 1;

	@ObfuscatedName("KFUEEJVZ.i")
	public int field867 = -1;

	@ObfuscatedName("KFUEEJVZ.j")
	public int field868 = 128;

	@ObfuscatedName("KFUEEJVZ.m")
	public int field870 = -1;

	@ObfuscatedName("KFUEEJVZ.o")
	public boolean field872 = false;

	@ObfuscatedName("KFUEEJVZ.p")
	public int field873 = -1;

	@ObfuscatedName("KFUEEJVZ.q")
	public int field874 = -1;

	@ObfuscatedName("KFUEEJVZ.s")
	public int field876 = 32;

	@ObfuscatedName("KFUEEJVZ.u")
	public int field878 = -1;

	@ObfuscatedName("KFUEEJVZ.x")
	public boolean field880 = true;

	@ObfuscatedName("KFUEEJVZ.y")
	public int field881 = -1;

	@ObfuscatedName("KFUEEJVZ.B")
	public int field884 = -1;

	@ObfuscatedName("KFUEEJVZ.D")
	public int field886 = -1;

	@ObfuscatedName("KFUEEJVZ.F")
	public boolean field887 = true;

	@ObfuscatedName("KFUEEJVZ.G")
	public int field888 = -1;

	@ObfuscatedName("KFUEEJVZ.I")
	public int field890 = -1;

	@ObfuscatedName("KFUEEJVZ.J")
	public long field891 = -1L;

	@ObfuscatedName("KFUEEJVZ.P")
	public int field896 = 128;

	@ObfuscatedName("KFUEEJVZ.M")
	public static DMOAMUBS field893 = new DMOAMUBS(30);

	@ObfuscatedName("KFUEEJVZ.f")
	public int field864;

	@ObfuscatedName("KFUEEJVZ.C")
	public int field885;

	@ObfuscatedName("KFUEEJVZ.H")
	public static int field889;

	@ObfuscatedName("KFUEEJVZ.L")
	public static int field892;

	@ObfuscatedName("KFUEEJVZ.r")
	public static XGRGMPUQ field875;

	@ObfuscatedName("KFUEEJVZ.h")
	public static client field866;

	@ObfuscatedName("KFUEEJVZ.t")
	public String field877;

	@ObfuscatedName("KFUEEJVZ.N")
	public byte[] field894;

	@ObfuscatedName("KFUEEJVZ.c")
	public int[] field861;

	@ObfuscatedName("KFUEEJVZ.d")
	public static int[] field862;

	@ObfuscatedName("KFUEEJVZ.k")
	public int[] field869;

	@ObfuscatedName("KFUEEJVZ.z")
	public int[] field882;

	@ObfuscatedName("KFUEEJVZ.A")
	public int[] field883;

	@ObfuscatedName("KFUEEJVZ.O")
	public int[] field895;

	@ObfuscatedName("KFUEEJVZ.v")
	public static KFUEEJVZ[] field879;

	@ObfuscatedName("KFUEEJVZ.n")
	public String[] field871;

	@ObfuscatedName("KFUEEJVZ.a(B)LKFUEEJVZ;")
	public final KFUEEJVZ method262() {
		int var1 = -1;
		if (field863 != -1) {
			HUPZKMWH var2 = HUPZKMWH.field786[field863];
			int var3 = var2.field788;
			int var4 = var2.field789;
			int var5 = var2.field790;
			int var6 = client.field339[var5 - var4];
			var1 = field866.field275[var3] >> var4 & var6;
		} else if (field867 != -1) {
			var1 = field866.field275[field867];
		}

		if (var1 >= 0 && var1 < field861.length && field861[var1] != -1) {
			return method267(field861[var1]);
		}

		return null;
	}

	@ObfuscatedName("KFUEEJVZ.a(Z)LVYUQHOMO;")
	public final VYUQHOMO method263() {
		if (field861 != null) {
			KFUEEJVZ var1 = method262();
			if (var1 == null) {
				return null;
			}

			return var1.method263();
		} else if (field869 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field869.length; var3++) {
				if (!VYUQHOMO.method408(field869[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			VYUQHOMO[] var4 = new VYUQHOMO[field869.length];
			for (int var5 = 0; var5 < field869.length; var5++) {
				var4[var5] = VYUQHOMO.method407(field869[var5]);
			}

			VYUQHOMO var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new VYUQHOMO(var4, var4.length);
			}

			if (field882 != null) {
				for (int var7 = 0; var7 < field882.length; var7++) {
					var6.method421(field882[var7], field895[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("KFUEEJVZ.a(I[III)LVYUQHOMO;")
	public final VYUQHOMO method264(int arg0, int[] arg1, int arg2) {
		if (field861 != null) {
			KFUEEJVZ var4 = method262();
			if (var4 == null) {
				return null;
			}

			return var4.method264(arg0, arg1, arg2);
		}

		VYUQHOMO var5 = (VYUQHOMO) field893.method193(field891);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field883.length; var7++) {
				if (!VYUQHOMO.method408(field883[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			VYUQHOMO[] var8 = new VYUQHOMO[field883.length];
			for (int var9 = 0; var9 < field883.length; var9++) {
				var8[var9] = VYUQHOMO.method407(field883[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new VYUQHOMO(var8, var8.length);
			}

			if (field882 != null) {
				for (int var10 = 0; var10 < field882.length; var10++) {
					var5.method421(field882[var10], field895[var10]);
				}
			}

			var5.method414();
			var5.method424(field864 + 64, field885 + 850, -30, -50, -30, true);
			field893.method194(field891, var5);
		}

		VYUQHOMO var11 = VYUQHOMO.field1286;
		var11.method409(var5, APJPJMYV.method11(arg0) & APJPJMYV.method11(arg2));

		if (arg0 != -1 && arg2 != -1) {
			var11.method416(arg1, arg2, arg0);
		} else if (arg0 != -1) {
			var11.method415(arg0);
		}

		if (field896 != 128 || field868 != 128) {
			var11.method423(field896, field868, field896);
		}

		var11.method411();
		var11.field1323 = null;
		var11.field1322 = null;

		if (field865 == 1) {
			var11.field1324 = true;
		}

		return var11;
	}

	@ObfuscatedName("KFUEEJVZ.a(ZLXGRGMPUQ;)V")
	public final void method265(XGRGMPUQ arg0) {
		while (true) {
			int var2 = arg0.method465();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method465();
				field883 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field883[var4] = arg0.method467();
				}
			} else if (var2 == 2) {
				field877 = arg0.method472();
			} else if (var2 == 3) {
				field894 = arg0.method473();
			} else if (var2 == 12) {
				field865 = arg0.method466();
			} else if (var2 == 13) {
				field886 = arg0.method467();
			} else if (var2 == 14) {
				field888 = arg0.method467();
			} else if (var2 == 17) {
				field888 = arg0.method467();
				field878 = arg0.method467();
				field860 = arg0.method467();
				field874 = arg0.method467();
			} else if (var2 >= 30 && var2 < 40) {
				if (field871 == null) {
					field871 = new String[5];
				}

				field871[var2 - 30] = arg0.method472();
				if (field871[var2 - 30].equalsIgnoreCase("hidden")) {
					field871[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method465();
				field882 = new int[var5];
				field895 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field882[var6] = arg0.method467();
					field895[var6] = arg0.method467();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method465();
				field869 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field869[var8] = arg0.method467();
				}
			} else if (var2 == 90) {
				field873 = arg0.method467();
			} else if (var2 == 91) {
				field870 = arg0.method467();
			} else if (var2 == 92) {
				field881 = arg0.method467();
			} else if (var2 == 93) {
				field880 = false;
			} else if (var2 == 95) {
				field890 = arg0.method467();
			} else if (var2 == 97) {
				field896 = arg0.method467();
			} else if (var2 == 98) {
				field868 = arg0.method467();
			} else if (var2 == 99) {
				field872 = true;
			} else if (var2 == 100) {
				field864 = arg0.method466();
			} else if (var2 == 101) {
				field885 = arg0.method466() * 5;
			} else if (var2 == 102) {
				field884 = arg0.method467();
			} else if (var2 == 103) {
				field876 = arg0.method467();
			} else if (var2 == 106) {
				field863 = arg0.method467();
				if (field863 == 0xFFFF) {
					field863 = -1;
				}

				field867 = arg0.method467();
				if (field867 == 0xFFFF) {
					field867 = -1;
				}

				int var9 = arg0.method465();
				field861 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field861[var10] = arg0.method467();
					if (field861[var10] == 0xFFFF) {
						field861[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field887 = false;
			}
		}
	}

	@ObfuscatedName("KFUEEJVZ.a(LMJLXHQTQ;)V")
	public static final void method266(MJLXHQTQ arg0) {
		field875 = new XGRGMPUQ(arg0.method317("npc.dat", null));
		XGRGMPUQ var1 = new XGRGMPUQ(arg0.method317("npc.idx", null));
		field892 = var1.method467();
		field862 = new int[field892];
		int var2 = 2;
		for (int var3 = 0; var3 < field892; var3++) {
			field862[var3] = var2;
			var2 += var1.method467();
		}

		field879 = new KFUEEJVZ[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field879[var4] = new KFUEEJVZ();
		}
	}

	@ObfuscatedName("KFUEEJVZ.a(I)LKFUEEJVZ;")
	public static final KFUEEJVZ method267(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field879[var1].field891) {
				return field879[var1];
			}
		}

		field889 = (field889 + 1) % 20;
		KFUEEJVZ var2 = field879[field889] = new KFUEEJVZ();
		field875.field1432 = field862[arg0];
		var2.field891 = arg0;
		var2.method265(field875);
		return var2;
	}

	@ObfuscatedName("KFUEEJVZ.b(I)Z")
	public boolean method268() {
		if (field861 == null) {
			return true;
		}

		int var1 = -1;
		if (field863 != -1) {
			HUPZKMWH var2 = HUPZKMWH.field786[field863];
			int var3 = var2.field788;
			int var4 = var2.field789;
			int var5 = var2.field790;
			int var6 = client.field339[var5 - var4];
			var1 = field866.field275[var3] >> var4 & var6;
		} else if (field867 != -1) {
			var1 = field866.field275[field867];
		}

		if (var1 >= 0 && var1 < field861.length && field861[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("KFUEEJVZ.b(B)V")
	public static final void method269() {
		field893 = null;
		field862 = null;
		field879 = null;
		field875 = null;
	}
}
