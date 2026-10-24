package deob;

@ObfuscatedName("DUHKBPRV")
public final class DUHKBPRV {

	@ObfuscatedName("DUHKBPRV.a")
	public int field648 = -1;

	@ObfuscatedName("DUHKBPRV.c")
	public int field650 = -1;

	@ObfuscatedName("DUHKBPRV.d")
	public boolean field651 = false;

	@ObfuscatedName("DUHKBPRV.e")
	public byte field652 = 1;

	@ObfuscatedName("DUHKBPRV.f")
	public int field653 = -1;

	@ObfuscatedName("DUHKBPRV.g")
	public int field654 = 128;

	@ObfuscatedName("DUHKBPRV.h")
	public int field655 = -1;

	@ObfuscatedName("DUHKBPRV.i")
	public boolean field656 = true;

	@ObfuscatedName("DUHKBPRV.k")
	public int field658 = -1;

	@ObfuscatedName("DUHKBPRV.l")
	public int field659 = -1;

	@ObfuscatedName("DUHKBPRV.o")
	public int field662 = -1;

	@ObfuscatedName("DUHKBPRV.q")
	public long field664 = -1L;

	@ObfuscatedName("DUHKBPRV.s")
	public int field666 = -1;

	@ObfuscatedName("DUHKBPRV.t")
	public boolean field667 = true;

	@ObfuscatedName("DUHKBPRV.v")
	public int field669 = 32;

	@ObfuscatedName("DUHKBPRV.F")
	public int field676 = 128;

	@ObfuscatedName("DUHKBPRV.I")
	public int field679 = -1;

	@ObfuscatedName("DUHKBPRV.J")
	public int field680 = -1;

	@ObfuscatedName("DUHKBPRV.L")
	public int field682 = -1;

	@ObfuscatedName("DUHKBPRV.M")
	public int field683 = -1;

	@ObfuscatedName("DUHKBPRV.r")
	public static LSUWSJDO field665 = new LSUWSJDO(30);

	@ObfuscatedName("DUHKBPRV.p")
	public static int field663;

	@ObfuscatedName("DUHKBPRV.u")
	public int field668;

	@ObfuscatedName("DUHKBPRV.z")
	public static int field673;

	@ObfuscatedName("DUHKBPRV.K")
	public int field681;

	@ObfuscatedName("DUHKBPRV.C")
	public static LZWRHABP field674;

	@ObfuscatedName("DUHKBPRV.y")
	public static client field672;

	@ObfuscatedName("DUHKBPRV.b")
	public String field649;

	@ObfuscatedName("DUHKBPRV.E")
	public byte[] field675;

	@ObfuscatedName("DUHKBPRV.j")
	public int[] field657;

	@ObfuscatedName("DUHKBPRV.m")
	public int[] field660;

	@ObfuscatedName("DUHKBPRV.n")
	public int[] field661;

	@ObfuscatedName("DUHKBPRV.x")
	public int[] field671;

	@ObfuscatedName("DUHKBPRV.G")
	public int[] field677;

	@ObfuscatedName("DUHKBPRV.H")
	public static int[] field678;

	@ObfuscatedName("DUHKBPRV.N")
	public static DUHKBPRV[] field684;

	@ObfuscatedName("DUHKBPRV.w")
	public String[] field670;

	@ObfuscatedName("DUHKBPRV.a(LSRZUEVOD;)V")
	public static final void method236(SRZUEVOD arg0) {
		field674 = new LZWRHABP(arg0.method566("npc.dat", null));
		LZWRHABP var1 = new LZWRHABP(arg0.method566("npc.idx", null));
		field663 = var1.method465();
		field678 = new int[field663];
		int var2 = 2;
		for (int var3 = 0; var3 < field663; var3++) {
			field678[var3] = var2;
			var2 += var1.method465();
		}

		field684 = new DUHKBPRV[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field684[var4] = new DUHKBPRV();
		}
	}

	@ObfuscatedName("DUHKBPRV.a(I)LDUHKBPRV;")
	public final DUHKBPRV method237() {
		int var1 = -1;
		if (field682 != -1) {
			RCLYPSZZ var2 = RCLYPSZZ.field1321[field682];
			int var3 = var2.field1323;
			int var4 = var2.field1324;
			int var5 = var2.field1325;
			int var6 = client.field267[var5 - var4];
			var1 = field672.field313[var3] >> var4 & var6;
		} else if (field653 != -1) {
			var1 = field672.field313[field653];
		}

		if (var1 >= 0 && var1 < field671.length && field671[var1] != -1) {
			return method242(field671[var1]);
		}

		return null;
	}

	@ObfuscatedName("DUHKBPRV.a(ZLLZWRHABP;)V")
	public final void method238(LZWRHABP arg0) {
		while (true) {
			int var2 = arg0.method463();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method463();
				field661 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field661[var4] = arg0.method465();
				}
			} else if (var2 == 2) {
				field649 = arg0.method470();
			} else if (var2 == 3) {
				field675 = arg0.method471();
			} else if (var2 == 12) {
				field652 = arg0.method464();
			} else if (var2 == 13) {
				field655 = arg0.method465();
			} else if (var2 == 14) {
				field666 = arg0.method465();
			} else if (var2 == 17) {
				field666 = arg0.method465();
				field679 = arg0.method465();
				field662 = arg0.method465();
				field680 = arg0.method465();
			} else if (var2 >= 30 && var2 < 40) {
				if (field670 == null) {
					field670 = new String[5];
				}

				field670[var2 - 30] = arg0.method470();
				if (field670[var2 - 30].equalsIgnoreCase("hidden")) {
					field670[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method463();
				field677 = new int[var5];
				field657 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field677[var6] = arg0.method465();
					field657[var6] = arg0.method465();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method463();
				field660 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field660[var8] = arg0.method465();
				}
			} else if (var2 == 90) {
				field683 = arg0.method465();
			} else if (var2 == 91) {
				field659 = arg0.method465();
			} else if (var2 == 92) {
				field648 = arg0.method465();
			} else if (var2 == 93) {
				field667 = false;
			} else if (var2 == 95) {
				field650 = arg0.method465();
			} else if (var2 == 97) {
				field654 = arg0.method465();
			} else if (var2 == 98) {
				field676 = arg0.method465();
			} else if (var2 == 99) {
				field651 = true;
			} else if (var2 == 100) {
				field681 = arg0.method464();
			} else if (var2 == 101) {
				field668 = arg0.method464() * 5;
			} else if (var2 == 102) {
				field658 = arg0.method465();
			} else if (var2 == 103) {
				field669 = arg0.method465();
			} else if (var2 == 106) {
				field682 = arg0.method465();
				if (field682 == 0xFFFF) {
					field682 = -1;
				}

				field653 = arg0.method465();
				if (field653 == 0xFFFF) {
					field653 = -1;
				}

				int var9 = arg0.method463();
				field671 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field671[var10] = arg0.method465();
					if (field671[var10] == 0xFFFF) {
						field671[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field656 = false;
			}
		}
	}

	@ObfuscatedName("DUHKBPRV.a(B)V")
	public static final void method239() {
		field665 = null;
		field678 = null;
		field684 = null;
		field674 = null;
	}

	@ObfuscatedName("DUHKBPRV.a([IIII)LLSSDQDBV;")
	public final LSSDQDBV method240(int[] arg0, int arg1, int arg2) {
		if (field671 != null) {
			DUHKBPRV var4 = method237();
			if (var4 == null) {
				return null;
			}

			return var4.method240(arg0, arg1, arg2);
		}

		LSSDQDBV var5 = (LSSDQDBV) field665.method448(field664);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field661.length; var7++) {
				if (!LSSDQDBV.method424(field661[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			LSSDQDBV[] var8 = new LSSDQDBV[field661.length];
			for (int var9 = 0; var9 < field661.length; var9++) {
				var8[var9] = LSSDQDBV.method423(field661[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new LSSDQDBV(var8, var8.length);
			}

			if (field677 != null) {
				for (int var10 = 0; var10 < field677.length; var10++) {
					var5.method437(field677[var10], field657[var10]);
				}
			}

			var5.method430();
			var5.method440(field681 + 64, field668 + 850, -30, -50, -30, true);
			field665.method449(var5, field664);
		}

		LSSDQDBV var11 = LSSDQDBV.field1059;
		var11.method425(var5, YGZNOIUP.method599(arg2) & YGZNOIUP.method599(arg1));

		if (arg2 != -1 && arg1 != -1) {
			var11.method432(arg2, arg0, arg1);
		} else if (arg2 != -1) {
			var11.method431(arg2);
		}

		if (field654 != 128 || field676 != 128) {
			var11.method439(field676, field654, field654);
		}

		var11.method427();
		var11.field1096 = null;
		var11.field1095 = null;

		if (field652 == 1) {
			var11.field1097 = true;
		}

		return var11;
	}

	@ObfuscatedName("DUHKBPRV.b(I)LLSSDQDBV;")
	public final LSSDQDBV method241() {
		if (field671 != null) {
			DUHKBPRV var1 = method237();
			if (var1 == null) {
				return null;
			}

			return var1.method241();
		} else if (field660 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field660.length; var3++) {
				if (!LSSDQDBV.method424(field660[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			LSSDQDBV[] var4 = new LSSDQDBV[field660.length];
			for (int var5 = 0; var5 < field660.length; var5++) {
				var4[var5] = LSSDQDBV.method423(field660[var5]);
			}

			LSSDQDBV var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new LSSDQDBV(var4, var4.length);
			}

			if (field677 != null) {
				for (int var7 = 0; var7 < field677.length; var7++) {
					var6.method437(field677[var7], field657[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("DUHKBPRV.c(I)LDUHKBPRV;")
	public static final DUHKBPRV method242(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field684[var1].field664) {
				return field684[var1];
			}
		}

		field673 = (field673 + 1) % 20;
		DUHKBPRV var2 = field684[field673] = new DUHKBPRV();
		field674.field1139 = field678[arg0];
		var2.field664 = arg0;
		var2.method238(field674);
		return var2;
	}

	@ObfuscatedName("DUHKBPRV.a(Z)Z")
	public boolean method243() {
		if (field671 == null) {
			return true;
		}

		int var1 = -1;
		if (field682 != -1) {
			RCLYPSZZ var2 = RCLYPSZZ.field1321[field682];
			int var3 = var2.field1323;
			int var4 = var2.field1324;
			int var5 = var2.field1325;
			int var6 = client.field267[var5 - var4];
			var1 = field672.field313[var3] >> var4 & var6;
		} else if (field653 != -1) {
			var1 = field672.field313[field653];
		}

		if (var1 >= 0 && var1 < field671.length && field671[var1] != -1) {
			return true;
		}

		return false;
	}
}
