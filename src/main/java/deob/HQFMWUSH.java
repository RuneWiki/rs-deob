package deob;

@ObfuscatedName("HQFMWUSH")
public final class HQFMWUSH {

	@ObfuscatedName("HQFMWUSH.b")
	public int field766 = -1;

	@ObfuscatedName("HQFMWUSH.c")
	public int field767 = 128;

	@ObfuscatedName("HQFMWUSH.e")
	public int field769 = -1;

	@ObfuscatedName("HQFMWUSH.f")
	public int field770 = -1;

	@ObfuscatedName("HQFMWUSH.g")
	public int field771 = -1;

	@ObfuscatedName("HQFMWUSH.j")
	public int field773 = -1;

	@ObfuscatedName("HQFMWUSH.m")
	public int field775 = -1;

	@ObfuscatedName("HQFMWUSH.o")
	public int field777 = -1;

	@ObfuscatedName("HQFMWUSH.r")
	public boolean field780 = true;

	@ObfuscatedName("HQFMWUSH.s")
	public long field781 = -1L;

	@ObfuscatedName("HQFMWUSH.u")
	public int field783 = 32;

	@ObfuscatedName("HQFMWUSH.y")
	public int field787 = -1;

	@ObfuscatedName("HQFMWUSH.C")
	public byte field791 = 1;

	@ObfuscatedName("HQFMWUSH.D")
	public int field792 = -1;

	@ObfuscatedName("HQFMWUSH.E")
	public boolean field793 = true;

	@ObfuscatedName("HQFMWUSH.F")
	public int field794 = -1;

	@ObfuscatedName("HQFMWUSH.I")
	public int field797 = -1;

	@ObfuscatedName("HQFMWUSH.K")
	public int field799 = -1;

	@ObfuscatedName("HQFMWUSH.L")
	public boolean field800 = false;

	@ObfuscatedName("HQFMWUSH.M")
	public int field801 = 128;

	@ObfuscatedName("HQFMWUSH.p")
	public static HPFNYARJ field778 = new HPFNYARJ(30);

	@ObfuscatedName("HQFMWUSH.k")
	public static int field774;

	@ObfuscatedName("HQFMWUSH.t")
	public static int field782;

	@ObfuscatedName("HQFMWUSH.B")
	public int field790;

	@ObfuscatedName("HQFMWUSH.G")
	public int field795;

	@ObfuscatedName("HQFMWUSH.x")
	public static XOUQUKZW field786;

	@ObfuscatedName("HQFMWUSH.h")
	public static client field772;

	@ObfuscatedName("HQFMWUSH.A")
	public String field789;

	@ObfuscatedName("HQFMWUSH.a")
	public byte[] field765;

	@ObfuscatedName("HQFMWUSH.d")
	public int[] field768;

	@ObfuscatedName("HQFMWUSH.n")
	public static int[] field776;

	@ObfuscatedName("HQFMWUSH.q")
	public int[] field779;

	@ObfuscatedName("HQFMWUSH.v")
	public int[] field784;

	@ObfuscatedName("HQFMWUSH.w")
	public int[] field785;

	@ObfuscatedName("HQFMWUSH.z")
	public int[] field788;

	@ObfuscatedName("HQFMWUSH.J")
	public static HQFMWUSH[] field798;

	@ObfuscatedName("HQFMWUSH.H")
	public String[] field796;

	@ObfuscatedName("HQFMWUSH.a(I[III)LKPUOCBCE;")
	public final KPUOCBCE method305(int arg0, int[] arg1, int arg2) {
		if (field779 != null) {
			HQFMWUSH var4 = method308();
			if (var4 == null) {
				return null;
			}

			return var4.method305(arg0, arg1, arg2);
		}

		KPUOCBCE var5 = (KPUOCBCE) field778.method302(field781);
		if (var5 == null) {
			boolean var6 = false;
			for (int var7 = 0; var7 < field768.length; var7++) {
				if (!KPUOCBCE.method380(field768[var7])) {
					var6 = true;
				}
			}

			if (var6) {
				return null;
			}

			KPUOCBCE[] var8 = new KPUOCBCE[field768.length];
			for (int var9 = 0; var9 < field768.length; var9++) {
				var8[var9] = KPUOCBCE.method379(field768[var9]);
			}

			if (var8.length == 1) {
				var5 = var8[0];
			} else {
				var5 = new KPUOCBCE(var8.length, var8);
			}

			if (field784 != null) {
				for (int var10 = 0; var10 < field784.length; var10++) {
					var5.method393(field784[var10], field785[var10]);
				}
			}

			var5.method386();
			var5.method396(field795 + 64, field790 + 850, -30, -50, -30, true);
			field778.method303(field781, var5);
		}

		KPUOCBCE var11 = KPUOCBCE.field852;
		var11.method381(ZNUJPBQV.method585(arg2) & ZNUJPBQV.method585(arg0), var5);

		if (arg2 != -1 && arg0 != -1) {
			var11.method388(arg1, arg2, arg0);
		} else if (arg2 != -1) {
			var11.method387(arg2);
		}

		if (field767 != 128 || field801 != 128) {
			var11.method395(field767, field801, field767);
		}

		var11.method383();
		var11.field889 = null;
		var11.field888 = null;

		if (field791 == 1) {
			var11.field890 = true;
		}

		return var11;
	}

	@ObfuscatedName("HQFMWUSH.a(BLXOUQUKZW;)V")
	public final void method306(XOUQUKZW arg0) {
		while (true) {
			int var2 = arg0.method521();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				int var3 = arg0.method521();
				field768 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field768[var4] = arg0.method523();
				}
			} else if (var2 == 2) {
				field789 = arg0.method528();
			} else if (var2 == 3) {
				field765 = arg0.method529();
			} else if (var2 == 12) {
				field791 = arg0.method522();
			} else if (var2 == 13) {
				field799 = arg0.method523();
			} else if (var2 == 14) {
				field777 = arg0.method523();
			} else if (var2 == 17) {
				field777 = arg0.method523();
				field770 = arg0.method523();
				field794 = arg0.method523();
				field797 = arg0.method523();
			} else if (var2 >= 30 && var2 < 40) {
				if (field796 == null) {
					field796 = new String[5];
				}

				field796[var2 - 30] = arg0.method528();
				if (field796[var2 - 30].equalsIgnoreCase("hidden")) {
					field796[var2 - 30] = null;
				}
			} else if (var2 == 40) {
				int var5 = arg0.method521();
				field784 = new int[var5];
				field785 = new int[var5];
				for (int var6 = 0; var6 < var5; var6++) {
					field784[var6] = arg0.method523();
					field785[var6] = arg0.method523();
				}
			} else if (var2 == 60) {
				int var7 = arg0.method521();
				field788 = new int[var7];
				for (int var8 = 0; var8 < var7; var8++) {
					field788[var8] = arg0.method523();
				}
			} else if (var2 == 90) {
				field769 = arg0.method523();
			} else if (var2 == 91) {
				field775 = arg0.method523();
			} else if (var2 == 92) {
				field787 = arg0.method523();
			} else if (var2 == 93) {
				field793 = false;
			} else if (var2 == 95) {
				field773 = arg0.method523();
			} else if (var2 == 97) {
				field767 = arg0.method523();
			} else if (var2 == 98) {
				field801 = arg0.method523();
			} else if (var2 == 99) {
				field800 = true;
			} else if (var2 == 100) {
				field795 = arg0.method522();
			} else if (var2 == 101) {
				field790 = arg0.method522() * 5;
			} else if (var2 == 102) {
				field771 = arg0.method523();
			} else if (var2 == 103) {
				field783 = arg0.method523();
			} else if (var2 == 106) {
				field792 = arg0.method523();
				if (field792 == 0xFFFF) {
					field792 = -1;
				}

				field766 = arg0.method523();
				if (field766 == 0xFFFF) {
					field766 = -1;
				}

				int var9 = arg0.method521();
				field779 = new int[var9 + 1];
				for (int var10 = 0; var10 <= var9; var10++) {
					field779[var10] = arg0.method523();
					if (field779[var10] == 0xFFFF) {
						field779[var10] = -1;
					}
				}
			} else if (var2 == 107) {
				field780 = false;
			}
		}
	}

	@ObfuscatedName("HQFMWUSH.a(Z)LKPUOCBCE;")
	public final KPUOCBCE method307() {
		if (field779 != null) {
			HQFMWUSH var1 = method308();
			if (var1 == null) {
				return null;
			}

			return var1.method307();
		} else if (field788 == null) {
			return null;
		} else {
			boolean var2 = false;
			for (int var3 = 0; var3 < field788.length; var3++) {
				if (!KPUOCBCE.method380(field788[var3])) {
					var2 = true;
				}
			}

			if (var2) {
				return null;
			}

			KPUOCBCE[] var4 = new KPUOCBCE[field788.length];
			for (int var5 = 0; var5 < field788.length; var5++) {
				var4[var5] = KPUOCBCE.method379(field788[var5]);
			}

			KPUOCBCE var6;
			if (var4.length == 1) {
				var6 = var4[0];
			} else {
				var6 = new KPUOCBCE(var4.length, var4);
			}

			if (field784 != null) {
				for (int var7 = 0; var7 < field784.length; var7++) {
					var6.method393(field784[var7], field785[var7]);
				}
			}

			return var6;
		}
	}

	@ObfuscatedName("HQFMWUSH.a(B)LHQFMWUSH;")
	public final HQFMWUSH method308() {
		int var1 = -1;
		if (field792 != -1) {
			XBHMGKWV var2 = XBHMGKWV.field1354[field792];
			int var3 = var2.field1356;
			int var4 = var2.field1357;
			int var5 = var2.field1358;
			int var6 = client.field378[var5 - var4];
			var1 = field772.field342[var3] >> var4 & var6;
		} else if (field766 != -1) {
			var1 = field772.field342[field766];
		}

		if (var1 >= 0 && var1 < field779.length && field779[var1] != -1) {
			return method309(field779[var1]);
		}

		return null;
	}

	@ObfuscatedName("HQFMWUSH.a(I)LHQFMWUSH;")
	public static final HQFMWUSH method309(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (arg0 == field798[var1].field781) {
				return field798[var1];
			}
		}

		field774 = (field774 + 1) % 20;
		HQFMWUSH var2 = field798[field774] = new HQFMWUSH();
		field786.field1367 = field776[arg0];
		var2.field781 = arg0;
		var2.method306(field786);
		return var2;
	}

	@ObfuscatedName("HQFMWUSH.b(I)V")
	public static final void method310() {
		field778 = null;
		field776 = null;
		field798 = null;
		field786 = null;
	}

	@ObfuscatedName("HQFMWUSH.a(LCVNWKEAW;)V")
	public static final void method311(CVNWKEAW arg0) {
		field786 = new XOUQUKZW(arg0.method180("npc.dat", null));
		XOUQUKZW var1 = new XOUQUKZW(arg0.method180("npc.idx", null));
		field782 = var1.method523();
		field776 = new int[field782];
		int var2 = 2;
		for (int var3 = 0; var3 < field782; var3++) {
			field776[var3] = var2;
			var2 += var1.method523();
		}

		field798 = new HQFMWUSH[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field798[var4] = new HQFMWUSH();
		}
	}
}
