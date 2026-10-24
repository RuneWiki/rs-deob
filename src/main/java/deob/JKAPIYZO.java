package deob;

@ObfuscatedName("JKAPIYZO")
public final class JKAPIYZO {

	@ObfuscatedName("JKAPIYZO.a")
	public boolean field713 = true;

	@ObfuscatedName("JKAPIYZO.c")
	public long field715 = -1L;

	@ObfuscatedName("JKAPIYZO.j")
	public int field721 = -1;

	@ObfuscatedName("JKAPIYZO.k")
	public int field722 = -1;

	@ObfuscatedName("JKAPIYZO.l")
	public int field723 = -1;

	@ObfuscatedName("JKAPIYZO.m")
	public int field724 = -1;

	@ObfuscatedName("JKAPIYZO.n")
	public int field725 = -1;

	@ObfuscatedName("JKAPIYZO.o")
	public boolean field726 = true;

	@ObfuscatedName("JKAPIYZO.p")
	public int field727 = 128;

	@ObfuscatedName("JKAPIYZO.q")
	public int field728 = -1;

	@ObfuscatedName("JKAPIYZO.s")
	public int field729 = -1;

	@ObfuscatedName("JKAPIYZO.t")
	public int field730 = -1;

	@ObfuscatedName("JKAPIYZO.v")
	public int field732 = 128;

	@ObfuscatedName("JKAPIYZO.x")
	public int field734 = -1;

	@ObfuscatedName("JKAPIYZO.z")
	public byte field736 = 1;

	@ObfuscatedName("JKAPIYZO.C")
	public int field739 = -1;

	@ObfuscatedName("JKAPIYZO.E")
	public boolean field741 = false;

	@ObfuscatedName("JKAPIYZO.H")
	public int field743 = 32;

	@ObfuscatedName("JKAPIYZO.J")
	public int field745 = -1;

	@ObfuscatedName("JKAPIYZO.K")
	public int field746 = -1;

	@ObfuscatedName("JKAPIYZO.L")
	public static EOJHVRZF field747 = new EOJHVRZF(30);

	@ObfuscatedName("JKAPIYZO.u")
	public static int field731;

	@ObfuscatedName("JKAPIYZO.y")
	public static int field735;

	@ObfuscatedName("JKAPIYZO.D")
	public int field740;

	@ObfuscatedName("JKAPIYZO.M")
	public int field748;

	@ObfuscatedName("JKAPIYZO.e")
	public static UAWAYCTK field717;

	@ObfuscatedName("JKAPIYZO.I")
	public static client field744;

	@ObfuscatedName("JKAPIYZO.d")
	public String field716;

	@ObfuscatedName("JKAPIYZO.b")
	public byte[] field714;

	@ObfuscatedName("JKAPIYZO.f")
	public static int[] field718;

	@ObfuscatedName("JKAPIYZO.g")
	public int[] field719;

	@ObfuscatedName("JKAPIYZO.h")
	public int[] field720;

	@ObfuscatedName("JKAPIYZO.w")
	public int[] field733;

	@ObfuscatedName("JKAPIYZO.A")
	public int[] field737;

	@ObfuscatedName("JKAPIYZO.B")
	public int[] field738;

	@ObfuscatedName("JKAPIYZO.G")
	public static JKAPIYZO[] field742;

	@ObfuscatedName("JKAPIYZO.N")
	public String[] field749;

	@ObfuscatedName("JKAPIYZO.a(ZI[II)LWEVRTBOZ;")
	public final WEVRTBOZ method278(int arg0, int[] arg1, int arg2) {
		if (field720 != null) {
			JKAPIYZO var4 = method282();
			if (var4 == null) {
				return null;
			}

			return var4.method278(arg0, arg1, arg2);
		}

		WEVRTBOZ var5 = (WEVRTBOZ) field747.method206(field715);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field733.length; var7++) {
				if (!WEVRTBOZ.method526(field733[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			WEVRTBOZ[] var8 = new WEVRTBOZ[field733.length];
			for (int var9 = 0; var9 < field733.length; var9++) {
				var8[var9] = WEVRTBOZ.method525(field733[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new WEVRTBOZ(var8.length, var8);
			}

			if (field737 != null) {
				for (int var10 = 0; var10 < field737.length; var10++) {
					var5.method539(field737[var10], field719[var10]);
				}
			}

			var5.method532();
			var5.method542(field748 + 64, field740 + 850, -30, -50, -30, true);
			field747.method207(field715, var5);
		}

		WEVRTBOZ var11 = WEVRTBOZ.field1358;
		var11.method527(var5, HJEXDJAH.method218(arg0) & HJEXDJAH.method218(arg2));

		if (arg0 != -1 && arg2 != -1) {
			var11.method534(arg2, arg0, arg1);
		} else if (arg0 != -1) {
			var11.method533(arg0);
		}

		if (field727 != 128 || field732 != 128) {
			var11.method541(field727, field727, field732);
		}

		var11.method529();
		var11.field1395 = null;
		var11.field1394 = null;

		if (field736 == 1) {
			var11.field1396 = true;
		}

		return var11;
	}

	@ObfuscatedName("JKAPIYZO.a(Z)V")
	public static final void method279() {
		field747 = null;
		field718 = null;
		field742 = null;
		field717 = null;
	}

	@ObfuscatedName("JKAPIYZO.b(Z)Z")
	public boolean method280() {
		if (field720 == null) {
			return true;
		}

		int var1 = -1;
		if (field729 != -1) {
			UNSYPSHF var2 = UNSYPSHF.field1291[field729];
			int var3 = var2.field1293;
			int var4 = var2.field1294;
			int var5 = var2.field1295;
			int var6 = client.field158[var5 - var4];
			var1 = field744.field251[var3] >> var4 & var6;
		} else if (field734 != -1) {
			var1 = field744.field251[field734];
		}

		if (var1 >= 0 && var1 < field720.length && field720[var1] != -1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("JKAPIYZO.a(I)LWEVRTBOZ;")
	public final WEVRTBOZ method281() {
		if (field720 != null) {
			JKAPIYZO var1 = method282();
			if (var1 == null) {
				return null;
			}

			return var1.method281();
		} else if (field738 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field738.length; var3++) {
				if (!WEVRTBOZ.method526(field738[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			WEVRTBOZ[] var4 = new WEVRTBOZ[field738.length];
			for (int var5 = 0; var5 < field738.length; var5++) {
				var4[var5] = WEVRTBOZ.method525(field738[var5]);
			}

			WEVRTBOZ var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new WEVRTBOZ(var4.length, var4);
			}

			if (field737 != null) {
				for (int var7 = 0; var7 < field737.length; var7++) {
					var6.method539(field737[var7], field719[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("JKAPIYZO.b(I)LJKAPIYZO;")
	public final JKAPIYZO method282() {
		int var1 = -1;
		if (field729 != -1) {
			UNSYPSHF var2 = UNSYPSHF.field1291[field729];
			int var3 = var2.field1293;
			int var4 = var2.field1294;
			int var5 = var2.field1295;
			int var6 = client.field158[var5 - var4];
			var1 = field744.field251[var3] >> var4 & var6;
		} else if (field734 != -1) {
			var1 = field744.field251[field734];
		}

		if (var1 >= 0 && var1 < field720.length && field720[var1] != -1) {
			return method284(field720[var1]);
		}

		return null;
	}

	@ObfuscatedName("JKAPIYZO.a(ILUAWAYCTK;)V")
	public final void method283(UAWAYCTK arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method455();
				field733 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field733[var4] = arg0.method457();
				}
			} else if (var2 == 2) {
				field716 = arg0.method462();
			} else if (var2 == 3) {
				field714 = arg0.method463();
			} else if (var2 == 12) {
				field736 = arg0.method456();
			} else if (var2 == 13) {
				field722 = arg0.method457();
			} else if (var2 == 14) {
				field728 = arg0.method457();
			} else if (var2 == 17) {
				field728 = arg0.method457();
				field745 = arg0.method457();
				field724 = arg0.method457();
				field739 = arg0.method457();
			} else if (var2 >= 30 && var2 < 40) {
				if (field749 == null) {
					field749 = new String[5];
				}

				field749[var2 - 30] = arg0.method462();
				if (field749[var2 - 30].equalsIgnoreCase("hidden")) {
					field749[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method455();
				field737 = new int[var5];
				field719 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field737[var6] = arg0.method457();
					field719[var6] = arg0.method457();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method455();
				field738 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field738[var8] = arg0.method457();
				}
			} else if (var2 == 90) {
				field730 = arg0.method457();
			} else if (var2 == 91) {
				field721 = arg0.method457();
			} else if (var2 == 92) {
				field725 = arg0.method457();
			} else if (var2 == 93) {
				field726 = false;
			} else if (var2 == 95) {
				field723 = arg0.method457();
			} else if (var2 == 97) {
				field727 = arg0.method457();
			} else if (var2 == 98) {
				field732 = arg0.method457();
			} else if (var2 == 99) {
				field741 = true;
			} else if (var2 == 100) {
				field748 = arg0.method456();
			} else if (var2 == 101) {
				field740 = arg0.method456() * 5;
			} else if (var2 == 102) {
				field746 = arg0.method457();
			} else if (var2 == 103) {
				field743 = arg0.method457();
			} else if (var2 == 106) {
				field729 = arg0.method457();
				if (field729 == 0xFFFF) {
					field729 = -1;
				}

				field734 = arg0.method457();
				if (field734 == 0xFFFF) {
					field734 = -1;
				}

				int var9 = arg0.method455();
				field720 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field720[var10] = arg0.method457();
					if (field720[var10] == 0xFFFF) {
						field720[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field713 = false;
			}
		}
	}

	@ObfuscatedName("JKAPIYZO.c(I)LJKAPIYZO;")
	public static final JKAPIYZO method284(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field742[var1].field715) {
				return field742[var1];
			}
		}

		field735 = (field735 + 1) % 20;
		JKAPIYZO var2 = field742[field735] = new JKAPIYZO();
		field717.field1252 = field718[arg0];
		var2.field715 = arg0;
		var2.method283(field717);
		return var2;
	}

	@ObfuscatedName("JKAPIYZO.a(LRVLWVPJQ;)V")
	public static final void method285(RVLWVPJQ arg0) {
		field717 = new UAWAYCTK(arg0.method424("npc.dat", null));
		UAWAYCTK var1 = new UAWAYCTK(arg0.method424("npc.idx", null));
		field731 = var1.method457();
		field718 = new int[field731];
		int var2 = 2;
		for (int var3 = 0; var3 < field731; var3++) {
			field718[var3] = var2;
			var2 += var1.method457();
		}

		field742 = new JKAPIYZO[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field742[var4] = new JKAPIYZO();
		}
	}
}
