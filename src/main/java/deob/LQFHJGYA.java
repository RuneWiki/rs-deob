package deob;

@ObfuscatedName("LQFHJGYA")
public final class LQFHJGYA {

	@ObfuscatedName("LQFHJGYA.a")
	public String field859 = "null";

	@ObfuscatedName("LQFHJGYA.c")
	public int field860 = -1;

	@ObfuscatedName("LQFHJGYA.d")
	public int field861 = -1;

	@ObfuscatedName("LQFHJGYA.e")
	public boolean field862 = true;

	@ObfuscatedName("LQFHJGYA.f")
	public int field863 = -1;

	@ObfuscatedName("LQFHJGYA.g")
	public int field864 = -1;

	@ObfuscatedName("LQFHJGYA.h")
	public int field865 = 128;

	@ObfuscatedName("LQFHJGYA.i")
	public int field866 = -1;

	@ObfuscatedName("LQFHJGYA.j")
	public int field867 = -1;

	@ObfuscatedName("LQFHJGYA.l")
	public int field869 = -1;

	@ObfuscatedName("LQFHJGYA.x")
	public long field880 = -1L;

	@ObfuscatedName("LQFHJGYA.z")
	public int field881 = 128;

	@ObfuscatedName("LQFHJGYA.B")
	public boolean field883 = false;

	@ObfuscatedName("LQFHJGYA.C")
	public int field884 = -1;

	@ObfuscatedName("LQFHJGYA.F")
	public int field887 = 32;

	@ObfuscatedName("LQFHJGYA.G")
	public byte field888 = 1;

	@ObfuscatedName("LQFHJGYA.H")
	public int field889 = -1;

	@ObfuscatedName("LQFHJGYA.J")
	public int field891 = -1;

	@ObfuscatedName("LQFHJGYA.L")
	public boolean field893 = true;

	@ObfuscatedName("LQFHJGYA.M")
	public int field894 = -1;

	@ObfuscatedName("LQFHJGYA.N")
	public int field895 = -1;

	@ObfuscatedName("LQFHJGYA.t")
	public static WUMSOEQS field876 = new WUMSOEQS(30);

	@ObfuscatedName("LQFHJGYA.n")
	public int field870;

	@ObfuscatedName("LQFHJGYA.o")
	public int field871;

	@ObfuscatedName("LQFHJGYA.I")
	public static int field890;

	@ObfuscatedName("LQFHJGYA.K")
	public static int field892;

	@ObfuscatedName("LQFHJGYA.D")
	public static MVHXDWGI field885;

	@ObfuscatedName("LQFHJGYA.u")
	public static client field877;

	@ObfuscatedName("LQFHJGYA.k")
	public byte[] field868;

	@ObfuscatedName("LQFHJGYA.p")
	public int[] field872;

	@ObfuscatedName("LQFHJGYA.q")
	public int[] field873;

	@ObfuscatedName("LQFHJGYA.v")
	public int[] field878;

	@ObfuscatedName("LQFHJGYA.w")
	public int[] field879;

	@ObfuscatedName("LQFHJGYA.A")
	public static int[] field882;

	@ObfuscatedName("LQFHJGYA.E")
	public int[] field886;

	@ObfuscatedName("LQFHJGYA.r")
	public static LQFHJGYA[] field874;

	@ObfuscatedName("LQFHJGYA.s")
	public String[] field875;

	@ObfuscatedName("LQFHJGYA.a(I)LLQFHJGYA;")
	public static final LQFHJGYA method315(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field874[var1].field880) {
				return field874[var1];
			}
		}

		field892 = (field892 + 1) % 20;
		LQFHJGYA var2 = field874[field892] = new LQFHJGYA();
		field885.field1014 = field882[arg0];
		var2.field880 = arg0;
		var2.method322(field885);
		return var2;
	}

	@ObfuscatedName("LQFHJGYA.a(Z)LLQFHJGYA;")
	public final LQFHJGYA method316() {
		int var1 = -1;
		if (field891 != -1) {
			QMAVGSSV var2 = QMAVGSSV.field1234[field891];
			int var3 = var2.field1236;
			int var4 = var2.field1237;
			int var5 = var2.field1238;
			int var6 = client.field367[var5 - var4];
			var1 = field877.field467[var3] >> var4 & var6;
		} else if (field895 != -1) {
			var1 = field877.field467[field895];
		}

		if (var1 >= 0 && var1 < field872.length && field872[var1] != -1) {
			return method315(field872[var1]);
		}

		return null;
	}

	@ObfuscatedName("LQFHJGYA.a([IBII)LPDVZPZLT;")
	public final PDVZPZLT method317(int[] arg0, int arg1, int arg2) {
		if (field872 != null) {
			LQFHJGYA var4 = method316();
			if (var4 == null) {
				return null;
			}

			return var4.method317(arg0, arg1, arg2);
		}

		PDVZPZLT var5 = (PDVZPZLT) field876.method586(field880);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field879.length; var7++) {
				if (!PDVZPZLT.method415(field879[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			PDVZPZLT[] var8 = new PDVZPZLT[field879.length];
			for (int var9 = 0; var9 < field879.length; var9++) {
				var8[var9] = PDVZPZLT.method414(field879[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new PDVZPZLT(var8, var8.length);
			}

			if (field878 != null) {
				for (int var10 = 0; var10 < field878.length; var10++) {
					var5.method428(field878[var10], field886[var10]);
				}
			}

			var5.method421();
			var5.method431(field870 + 64, field871 + 850, -30, -50, -30, true);
			field876.method587(field880, var5);
		}

		PDVZPZLT var11 = PDVZPZLT.field1130;
		var11.method416(YPRWORMV.method602(arg1) & YPRWORMV.method602(arg2), var5);

		if (arg1 != -1 && arg2 != -1) {
			var11.method423(arg1, arg2, arg0);
		} else if (arg1 != -1) {
			var11.method422(arg1);
		}

		if (field865 != 128 || field881 != 128) {
			var11.method430(field865, field881, field865);
		}

		var11.method418();
		var11.field1166 = null;
		var11.field1165 = null;

		if (field888 == 1) {
			var11.field1167 = true;
		}

		return var11;
	}

	@ObfuscatedName("LQFHJGYA.a(B)Z")
	public boolean method318() {
		if (field872 == null) {
			return true;
		}

		int var1 = -1;
		if (field891 != -1) {
			QMAVGSSV var2 = QMAVGSSV.field1234[field891];
			int var3 = var2.field1236;
			int var4 = var2.field1237;
			int var5 = var2.field1238;
			int var6 = client.field367[var5 - var4];
			var1 = field877.field467[var3] >> var4 & var6;
		} else if (field895 != -1) {
			var1 = field877.field467[field895];
		}

		if (var1 >= 0 && var1 < field872.length && field872[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("LQFHJGYA.b(Z)V")
	public static final void method319() {
		field876 = null;
		field882 = null;
		field874 = null;
		field885 = null;
	}

	@ObfuscatedName("LQFHJGYA.a(LIEMHZJLX;)V")
	public static final void method320(IEMHZJLX arg0) {
		field885 = new MVHXDWGI(arg0.method242("npc.dat", null));
		MVHXDWGI var1 = new MVHXDWGI(arg0.method242("npc.idx", null));
		field890 = var1.method359();
		field882 = new int[field890];
		int var2 = 2;
		for (int var3 = 0; var3 < field890; var3++) {
			field882[var3] = var2;
			var2 += var1.method359();
		}

		field874 = new LQFHJGYA[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field874[var4] = new LQFHJGYA();
		}
	}

	@ObfuscatedName("LQFHJGYA.b(I)LPDVZPZLT;")
	public final PDVZPZLT method321() {
		if (field872 != null) {
			LQFHJGYA var1 = method316();
			if (var1 == null) {
				return null;
			}

			return var1.method321();
		} else if (field873 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field873.length; var3++) {
				if (!PDVZPZLT.method415(field873[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			PDVZPZLT[] var4 = new PDVZPZLT[field873.length];
			for (int var5 = 0; var5 < field873.length; var5++) {
				var4[var5] = PDVZPZLT.method414(field873[var5]);
			}

			PDVZPZLT var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new PDVZPZLT(var4, var4.length);
			}

			if (field878 != null) {
				for (int var7 = 0; var7 < field878.length; var7++) {
					var6.method428(field878[var7], field886[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("LQFHJGYA.a(ILMVHXDWGI;)V")
	public final void method322(MVHXDWGI arg0) {
		while (true) {
			int var2 = arg0.method357();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method357();
				field879 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field879[var4] = arg0.method359();
				}
			} else if (var2 == 2) {
				field859 = arg0.method364();
			} else if (var2 == 3) {
				field868 = arg0.method365();
			} else if (var2 == 12) {
				field888 = arg0.method358();
			} else if (var2 == 13) {
				field894 = arg0.method359();
			} else if (var2 == 14) {
				field884 = arg0.method359();
			} else if (var2 == 17) {
				field884 = arg0.method359();
				field869 = arg0.method359();
				field889 = arg0.method359();
				field863 = arg0.method359();
			} else if (var2 >= 30 && var2 < 40) {
				if (field875 == null) {
					field875 = new String[5];
				}

				field875[var2 - 30] = arg0.method364();
				if (field875[var2 - 30].equalsIgnoreCase("hidden")) {
					field875[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method357();
				field878 = new int[var5];
				field886 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field878[var6] = arg0.method359();
					field886[var6] = arg0.method359();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method357();
				field873 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field873[var8] = arg0.method359();
				}
			} else if (var2 == 90) {
				field861 = arg0.method359();
			} else if (var2 == 91) {
				field864 = arg0.method359();
			} else if (var2 == 92) {
				field867 = arg0.method359();
			} else if (var2 == 93) {
				field893 = false;
			} else if (var2 == 95) {
				field866 = arg0.method359();
			} else if (var2 == 97) {
				field865 = arg0.method359();
			} else if (var2 == 98) {
				field881 = arg0.method359();
			} else if (var2 == 99) {
				field883 = true;
			} else if (var2 == 100) {
				field870 = arg0.method358();
			} else if (var2 == 101) {
				field871 = arg0.method358() * 5;
			} else if (var2 == 102) {
				field860 = arg0.method359();
			} else if (var2 == 103) {
				field887 = arg0.method359();
			} else if (var2 == 106) {
				field891 = arg0.method359();
				if (field891 == 0xFFFF) {
					field891 = -1;
				}

				field895 = arg0.method359();
				if (field895 == 0xFFFF) {
					field895 = -1;
				}

				int var9 = arg0.method357();
				field872 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field872[var10] = arg0.method359();
					if (field872[var10] == 0xFFFF) {
						field872[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field862 = false;
			}
		}
	}
}
