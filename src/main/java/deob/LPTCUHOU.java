package deob;

@ObfuscatedName("LPTCUHOU")
public final class LPTCUHOU {

	@ObfuscatedName("LPTCUHOU.a")
	public int field862 = -1;

	@ObfuscatedName("LPTCUHOU.b")
	public boolean field863 = true;

	@ObfuscatedName("LPTCUHOU.d")
	public int field865 = -1;

	@ObfuscatedName("LPTCUHOU.e")
	public int field866 = -1;

	@ObfuscatedName("LPTCUHOU.h")
	public int field869 = 128;

	@ObfuscatedName("LPTCUHOU.i")
	public int field870 = -1;

	@ObfuscatedName("LPTCUHOU.j")
	public int field871 = -1;

	@ObfuscatedName("LPTCUHOU.m")
	public int field874 = -1;

	@ObfuscatedName("LPTCUHOU.o")
	public int field876 = 32;

	@ObfuscatedName("LPTCUHOU.p")
	public boolean field877 = false;

	@ObfuscatedName("LPTCUHOU.q")
	public int field878 = -1;

	@ObfuscatedName("LPTCUHOU.w")
	public int field884 = -1;

	@ObfuscatedName("LPTCUHOU.z")
	public byte field886 = 1;

	@ObfuscatedName("LPTCUHOU.A")
	public int field887 = -1;

	@ObfuscatedName("LPTCUHOU.D")
	public int field890 = -1;

	@ObfuscatedName("LPTCUHOU.F")
	public long field892 = -1L;

	@ObfuscatedName("LPTCUHOU.H")
	public int field893 = -1;

	@ObfuscatedName("LPTCUHOU.I")
	public int field894 = -1;

	@ObfuscatedName("LPTCUHOU.L")
	public int field897 = 128;

	@ObfuscatedName("LPTCUHOU.t")
	public static HGKRJZKS field881 = new HGKRJZKS(30);

	@ObfuscatedName("LPTCUHOU.l")
	public int field873;

	@ObfuscatedName("LPTCUHOU.v")
	public static int field883;

	@ObfuscatedName("LPTCUHOU.C")
	public int field889;

	@ObfuscatedName("LPTCUHOU.K")
	public static int field896;

	@ObfuscatedName("LPTCUHOU.n")
	public static GLMIQHJI field875;

	@ObfuscatedName("LPTCUHOU.s")
	public static client field880;

	@ObfuscatedName("LPTCUHOU.c")
	public String field864;

	@ObfuscatedName("LPTCUHOU.J")
	public byte[] field895;

	@ObfuscatedName("LPTCUHOU.f")
	public int[] field867;

	@ObfuscatedName("LPTCUHOU.g")
	public int[] field868;

	@ObfuscatedName("LPTCUHOU.k")
	public static int[] field872;

	@ObfuscatedName("LPTCUHOU.u")
	public int[] field882;

	@ObfuscatedName("LPTCUHOU.x")
	public int[] field885;

	@ObfuscatedName("LPTCUHOU.B")
	public int[] field888;

	@ObfuscatedName("LPTCUHOU.r")
	public static LPTCUHOU[] field879;

	@ObfuscatedName("LPTCUHOU.E")
	public String[] field891;

	@ObfuscatedName("LPTCUHOU.a(I)LVHYCWIPJ;")
	public final VHYCWIPJ method378() {
		if (field888 != null) {
			LPTCUHOU var1 = method383();
			if (var1 == null) {
				return null;
			}

			return var1.method378();
		} else if (field868 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field868.length; var3++) {
				if (!VHYCWIPJ.method501(field868[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			VHYCWIPJ[] var4 = new VHYCWIPJ[field868.length];
			for (int var5 = 0; var5 < field868.length; var5++) {
				var4[var5] = VHYCWIPJ.method500(field868[var5]);
			}

			VHYCWIPJ var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new VHYCWIPJ(var4.length, var4);
			}

			if (field885 != null) {
				for (int var7 = 0; var7 < field885.length; var7++) {
					var6.method514(field885[var7], field882[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("LPTCUHOU.a(BLGLMIQHJI;)V")
	public final void method379(GLMIQHJI arg0) {
		while (true) {
			int var2 = arg0.method244();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method244();
				field867 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field867[var4] = arg0.method246();
				}
			} else if (var2 == 2) {
				field864 = arg0.method251();
			} else if (var2 == 3) {
				field895 = arg0.method252();
			} else if (var2 == 12) {
				field886 = arg0.method245();
			} else if (var2 == 13) {
				field887 = arg0.method246();
			} else if (var2 == 14) {
				field862 = arg0.method246();
			} else if (var2 == 17) {
				field862 = arg0.method246();
				field890 = arg0.method246();
				field894 = arg0.method246();
				field871 = arg0.method246();
			} else if (var2 >= 30 && var2 < 40) {
				if (field891 == null) {
					field891 = new String[5];
				}

				field891[var2 - 30] = arg0.method251();
				if (field891[var2 - 30].equalsIgnoreCase("hidden")) {
					field891[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method244();
				field885 = new int[var5];
				field882 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field885[var6] = arg0.method246();
					field882[var6] = arg0.method246();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method244();
				field868 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field868[var8] = arg0.method246();
				}
			} else if (var2 == 90) {
				field874 = arg0.method246();
			} else if (var2 == 91) {
				field866 = arg0.method246();
			} else if (var2 == 92) {
				field893 = arg0.method246();
			} else if (var2 == 93) {
				field863 = false;
			} else if (var2 == 95) {
				field865 = arg0.method246();
			} else if (var2 == 97) {
				field869 = arg0.method246();
			} else if (var2 == 98) {
				field897 = arg0.method246();
			} else if (var2 == 99) {
				field877 = true;
			} else if (var2 == 100) {
				field873 = arg0.method245();
			} else if (var2 == 101) {
				field889 = arg0.method245() * 5;
			} else if (var2 == 102) {
				field870 = arg0.method246();
			} else if (var2 == 103) {
				field876 = arg0.method246();
			} else if (var2 == 106) {
				field878 = arg0.method246();
				if (field878 == 0xFFFF) {
					field878 = -1;
				}

				field884 = arg0.method246();
				if (field884 == 0xFFFF) {
					field884 = -1;
				}

				int var9 = arg0.method244();
				field888 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field888[var10] = arg0.method246();
					if (field888[var10] == 0xFFFF) {
						field888[var10] = -1;
					}
				}
			}
		}
	}

	@ObfuscatedName("LPTCUHOU.b(I)LLPTCUHOU;")
	public static final LPTCUHOU method380(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field879[var1].field892) {
				return field879[var1];
			}
		}

		field896 = (field896 + 1) % 20;
		LPTCUHOU var2 = field879[field896] = new LPTCUHOU();
		field875.field709 = field872[arg0];
		var2.field892 = arg0;
		var2.method379(field875);
		return var2;
	}

	@ObfuscatedName("LPTCUHOU.a(LXRWUKRPO;)V")
	public static final void method381(XRWUKRPO arg0) {
		field875 = new GLMIQHJI(arg0.method581("npc.dat", null));
		GLMIQHJI var1 = new GLMIQHJI(arg0.method581("npc.idx", null));
		field883 = var1.method246();
		field872 = new int[field883];
		int var2 = 2;
		for (int var3 = 0; var3 < field883; var3++) {
			field872[var3] = var2;
			var2 += var1.method246();
		}

		field879 = new LPTCUHOU[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field879[var4] = new LPTCUHOU();
		}
	}

	@ObfuscatedName("LPTCUHOU.a([IIII)LVHYCWIPJ;")
	public final VHYCWIPJ method382(int[] arg0, int arg1, int arg2) {
		if (field888 != null) {
			LPTCUHOU var4 = method383();
			if (var4 == null) {
				return null;
			}

			return var4.method382(arg0, arg1, arg2);
		}

		VHYCWIPJ var5 = (VHYCWIPJ) field881.method285(field892);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field867.length; var7++) {
				if (!VHYCWIPJ.method501(field867[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			VHYCWIPJ[] var8 = new VHYCWIPJ[field867.length];
			for (int var9 = 0; var9 < field867.length; var9++) {
				var8[var9] = VHYCWIPJ.method500(field867[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new VHYCWIPJ(var8.length, var8);
			}

			if (field885 != null) {
				for (int var10 = 0; var10 < field885.length; var10++) {
					var5.method514(field885[var10], field882[var10]);
				}
			}

			var5.method507();
			var5.method517(field873 + 64, field889 + 850, -30, -50, -30, true);
			field881.method286(field892, var5);
		}

		VHYCWIPJ var11 = VHYCWIPJ.field1173;
		var11.method502(var5, TTZHVWEG.method489(arg2) & TTZHVWEG.method489(arg1));

		if (arg2 != -1 && arg1 != -1) {
			var11.method509(arg2, arg0, arg1);
		} else if (arg2 != -1) {
			var11.method508(arg2);
		}

		if (field869 != 128 || field897 != 128) {
			var11.method516(field869, field869, field897);
		}

		var11.method504();
		var11.field1210 = null;
		var11.field1209 = null;

		if (field886 == 1) {
			var11.field1211 = true;
		}

		return var11;
	}

	@ObfuscatedName("LPTCUHOU.c(I)LLPTCUHOU;")
	public final LPTCUHOU method383() {
		int var1 = -1;
		if (field878 != -1) {
			ZIUDVZAI var2 = ZIUDVZAI.field1480[field878];
			int var3 = var2.field1482;
			int var4 = var2.field1483;
			int var5 = var2.field1484;
			int var6 = client.field518[var5 - var4];
			var1 = field880.field450[var3] >> var4 & var6;
		} else if (field884 != -1) {
			var1 = field880.field450[field884];
		}

		if (var1 >= 0 && var1 < field888.length && field888[var1] != -1) {
			return method380(field888[var1]);
		}

		return null;
	}

	@ObfuscatedName("LPTCUHOU.d(I)V")
	public static final void method384() {
		field881 = null;
		field872 = null;
		field879 = null;
		field875 = null;
	}
}
