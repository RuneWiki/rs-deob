package deob;

@ObfuscatedName("HGKOLOPU")
public final class HGKOLOPU {

	@ObfuscatedName("HGKOLOPU.h")
	public int field690 = -1;

	@ObfuscatedName("HGKOLOPU.c")
	public static IGXVZOHI[] field685 = new IGXVZOHI[4];

	@ObfuscatedName("HGKOLOPU.e")
	public static AKUDQPZE field687 = new AKUDQPZE(40);

	@ObfuscatedName("HGKOLOPU.f")
	public static AKUDQPZE field688 = new AKUDQPZE(500);

	@ObfuscatedName("HGKOLOPU.H")
	public byte field714;

	@ObfuscatedName("HGKOLOPU.J")
	public byte field716;

	@ObfuscatedName("HGKOLOPU.j")
	public int field692;

	@ObfuscatedName("HGKOLOPU.k")
	public int field693;

	@ObfuscatedName("HGKOLOPU.l")
	public static int field694;

	@ObfuscatedName("HGKOLOPU.n")
	public static int field696;

	@ObfuscatedName("HGKOLOPU.p")
	public int field697;

	@ObfuscatedName("HGKOLOPU.r")
	public int field699;

	@ObfuscatedName("HGKOLOPU.s")
	public int field700;

	@ObfuscatedName("HGKOLOPU.x")
	public int field704;

	@ObfuscatedName("HGKOLOPU.z")
	public int field706;

	@ObfuscatedName("HGKOLOPU.B")
	public int field708;

	@ObfuscatedName("HGKOLOPU.C")
	public int field709;

	@ObfuscatedName("HGKOLOPU.F")
	public int field712;

	@ObfuscatedName("HGKOLOPU.I")
	public int field715;

	@ObfuscatedName("HGKOLOPU.K")
	public int field717;

	@ObfuscatedName("HGKOLOPU.N")
	public int field720;

	@ObfuscatedName("HGKOLOPU.Q")
	public int field723;

	@ObfuscatedName("HGKOLOPU.R")
	public int field724;

	@ObfuscatedName("HGKOLOPU.ab")
	public int field730;

	@ObfuscatedName("HGKOLOPU.v")
	public static EGCCHUZS field702;

	@ObfuscatedName("HGKOLOPU.w")
	public static client field703;

	@ObfuscatedName("HGKOLOPU.q")
	public String field698;

	@ObfuscatedName("HGKOLOPU.b")
	public boolean field684;

	@ObfuscatedName("HGKOLOPU.t")
	public boolean field701;

	@ObfuscatedName("HGKOLOPU.y")
	public boolean field705;

	@ObfuscatedName("HGKOLOPU.E")
	public static boolean field711;

	@ObfuscatedName("HGKOLOPU.G")
	public boolean field713;

	@ObfuscatedName("HGKOLOPU.L")
	public boolean field718;

	@ObfuscatedName("HGKOLOPU.M")
	public boolean field719;

	@ObfuscatedName("HGKOLOPU.P")
	public boolean field722;

	@ObfuscatedName("HGKOLOPU.U")
	public boolean field726;

	@ObfuscatedName("HGKOLOPU.X")
	public boolean field728;

	@ObfuscatedName("HGKOLOPU.Z")
	public boolean field729;

	@ObfuscatedName("HGKOLOPU.O")
	public byte[] field721;

	@ObfuscatedName("HGKOLOPU.d")
	public int[] field686;

	@ObfuscatedName("HGKOLOPU.g")
	public int[] field689;

	@ObfuscatedName("HGKOLOPU.i")
	public int[] field691;

	@ObfuscatedName("HGKOLOPU.A")
	public static int[] field707;

	@ObfuscatedName("HGKOLOPU.D")
	public int[] field710;

	@ObfuscatedName("HGKOLOPU.W")
	public int[] field727;

	@ObfuscatedName("HGKOLOPU.m")
	public static HGKOLOPU[] field695;

	@ObfuscatedName("HGKOLOPU.T")
	public String[] field725;

	@ObfuscatedName("HGKOLOPU.a(LEGCCHUZS;Z)V")
	public final void method319(EGCCHUZS arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method261();
					if (var3 == 0) {
						if (var2 == -1) {
							field705 = false;
							if (field727 != null && (field710 == null || field710[0] == 10)) {
								field705 = true;
							}

							if (field725 != null) {
								field705 = true;
							}
						}

						if (field718) {
							field719 = false;
							field726 = false;
						}

						if (field692 == -1) {
							field692 = field719 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field698 = arg0.method268();
					} else if (var3 == 3) {
						field721 = arg0.method269();
					} else if (var3 == 5) {
						int var6 = arg0.method261();
						if (var6 > 0) {
							if (field727 == null || field711) {
								field710 = null;
								field727 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field727[var7] = arg0.method263();
								}
							} else {
								arg0.field589 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field715 = arg0.method261();
					} else if (var3 == 15) {
						field697 = arg0.method261();
					} else if (var3 == 17) {
						field719 = false;
					} else if (var3 == 18) {
						field726 = false;
					} else if (var3 == 19) {
						var2 = arg0.method261();
						if (var2 == 1) {
							field705 = true;
						}
					} else if (var3 == 21) {
						field729 = true;
					} else if (var3 == 22) {
						field728 = true;
					} else if (var3 == 23) {
						field713 = true;
					} else if (var3 == 24) {
						field708 = arg0.method263();
						if (field708 == 0xFFFF) {
							field708 = -1;
						}
					} else if (var3 == 28) {
						field724 = arg0.method261();
					} else if (var3 == 29) {
						field716 = arg0.method262();
					} else if (var3 == 39) {
						field714 = arg0.method262();
					} else if (var3 >= 30 && var3 < 39) {
						if (field725 == null) {
							field725 = new String[5];
						}

						field725[var3 - 30] = arg0.method268();
						if (field725[var3 - 30].equalsIgnoreCase("hidden")) {
							field725[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method261();
						field689 = new int[var8];
						field686 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field689[var9] = arg0.method263();
							field686[var9] = arg0.method263();
						}
					} else if (var3 == 60) {
						field717 = arg0.method263();
					} else if (var3 == 62) {
						field722 = true;
					} else if (var3 == 64) {
						field701 = false;
					} else if (var3 == 65) {
						field723 = arg0.method263();
					} else if (var3 == 66) {
						field699 = arg0.method263();
					} else if (var3 == 67) {
						field709 = arg0.method263();
					} else if (var3 == 68) {
						field700 = arg0.method263();
					} else if (var3 == 69) {
						field706 = arg0.method261();
					} else if (var3 == 70) {
						field693 = arg0.method264();
					} else if (var3 == 71) {
						field730 = arg0.method264();
					} else if (var3 == 72) {
						field712 = arg0.method264();
					} else if (var3 == 73) {
						field684 = true;
					} else if (var3 == 74) {
						field718 = true;
					} else if (var3 == 75) {
						field692 = arg0.method261();
					} else if (var3 == 77) {
						field704 = arg0.method263();
						if (field704 == 0xFFFF) {
							field704 = -1;
						}

						field720 = arg0.method263();
						if (field720 == 0xFFFF) {
							field720 = -1;
						}

						int var10 = arg0.method261();
						field691 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field691[var11] = arg0.method263();
							if (field691[var11] == 0xFFFF) {
								field691[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method261();
			} while (var4 <= 0);

			if (field727 == null || field711) {
				field710 = new int[var4];
				field727 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field727[var5] = arg0.method263();
					field710[var5] = arg0.method261();
				}
			} else {
				arg0.field589 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("HGKOLOPU.a(ILDHNAQSHE;)V")
	public final void method320(DHNAQSHE arg0) {
		if (field727 != null) {
			for (int var2 = 0; var2 < field727.length; var2++) {
				arg0.method234(0, field727[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("HGKOLOPU.a(IIIIIII)LIGXVZOHI;")
	public final IGXVZOHI method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		IGXVZOHI var8 = method324(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field729 || field728) {
			var8 = new IGXVZOHI(field729, var8, field728);
		}

		if (field729) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field778; var10++) {
				int var11 = var8.field779[var10];
				int var12 = var8.field781[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field780[var10] += var15 - var9;
			}

			var8.method359();
		}

		return var8;
	}

	@ObfuscatedName("HGKOLOPU.a(Z)Z")
	public final boolean method322() {
		if (field727 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field727.length; var2++) {
			var1 &= IGXVZOHI.method355(field727[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("HGKOLOPU.a(LTKEGJSFV;)V")
	public static final void method323(TKEGJSFV arg0) {
		field702 = new EGCCHUZS(arg0.method542("loc.dat", null));
		EGCCHUZS var1 = new EGCCHUZS(arg0.method542("loc.idx", null));
		field696 = var1.method263();
		field707 = new int[field696];
		int var2 = 2;
		for (int var3 = 0; var3 < field696; var3++) {
			field707[var3] = var2;
			var2 += var1.method263();
		}

		field695 = new HGKOLOPU[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field695[var4] = new HGKOLOPU();
		}
	}

	@ObfuscatedName("HGKOLOPU.a(IIBI)LIGXVZOHI;")
	public final IGXVZOHI method324(int arg0, int arg1, int arg2) {
		IGXVZOHI var4 = null;
		long var5;
		if (field710 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field690 << 6) + arg1);
			IGXVZOHI var7 = (IGXVZOHI) field687.method1(var5);
			if (var7 != null) {
				return var7;
			}

			if (field727 == null) {
				return null;
			}

			boolean var8 = field722 ^ arg1 > 3;
			int var9 = field727.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field727[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (IGXVZOHI) field688.method1(var11);
				if (var4 == null) {
					var4 = IGXVZOHI.method354(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method369();
					}

					field688.method2(var4, var11);
				}

				if (var9 > 1) {
					field685[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new IGXVZOHI(var9, field685);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field710.length; var13++) {
				if (field710[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field690 << 6) + (var12 << 3) + arg1);
			IGXVZOHI var14 = (IGXVZOHI) field687.method1(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field727[var12];
			boolean var16 = field722 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (IGXVZOHI) field688.method1(var15);
			if (var4 == null) {
				var4 = IGXVZOHI.method354(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method369();
				}

				field688.method2(var4, var15);
			}
		}

		boolean var17;
		if (field723 == 128 && field699 == 128 && field709 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field693 == 0 && field730 == 0 && field712 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		IGXVZOHI var19 = new IGXVZOHI(field689 == null, var4, arg1 == 0 && arg2 == -1 && !var17 && !var18, ICYGYVTE.method349(arg2));
		if (arg2 != -1) {
			var19.method361();
			var19.method362(arg2);
			var19.field810 = null;
			var19.field809 = null;
		}

		while (arg1-- > 0) {
			var19.method365();
		}

		if (field689 != null) {
			for (int var20 = 0; var20 < field689.length; var20++) {
				var19.method368(field689[var20], field686[var20]);
			}
		}

		if (var17) {
			var19.method370(field723, field699, field709);
		}

		if (var18) {
			var19.method367(field693, field712, field730);
		}

		var19.method371(field716 + 64, field714 * 5 + 768, -50, -10, -50, !field728);

		if (field692 == 1) {
			var19.field806 = var19.field51;
		}

		field687.method2(var19, var5);
		return var19;
	}

	@ObfuscatedName("HGKOLOPU.a()V")
	public final void method325() {
		field727 = null;
		field710 = null;
		field698 = null;
		field721 = null;
		field689 = null;
		field686 = null;
		field715 = 1;
		field697 = 1;
		field719 = true;
		field726 = true;
		field705 = false;
		field729 = false;
		field728 = false;
		field713 = false;
		field708 = -1;
		field724 = 16;
		field716 = 0;
		field714 = 0;
		field725 = null;
		field717 = -1;
		field700 = -1;
		field722 = false;
		field701 = true;
		field723 = 128;
		field699 = 128;
		field709 = 128;
		field706 = 0;
		field693 = 0;
		field730 = 0;
		field712 = 0;
		field684 = false;
		field718 = false;
		field692 = -1;
		field704 = -1;
		field720 = -1;
		field691 = null;
	}

	@ObfuscatedName("HGKOLOPU.a(I)LHGKOLOPU;")
	public static final HGKOLOPU method326(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field695[var1].field690 == arg0) {
				return field695[var1];
			}
		}

		field694 = (field694 + 1) % 20;
		HGKOLOPU var2 = field695[field694];
		field702.field589 = field707[arg0];
		var2.field690 = arg0;
		var2.method325();
		var2.method319(field702);
		return var2;
	}

	@ObfuscatedName("HGKOLOPU.a(B)V")
	public static final void method327() {
		field688 = null;
		field687 = null;
		field707 = null;
		field695 = null;
		field702 = null;
	}

	@ObfuscatedName("HGKOLOPU.a(II)Z")
	public final boolean method328(int arg0) {
		if (field710 != null) {
			for (int var4 = 0; var4 < field710.length; var4++) {
				if (field710[var4] == arg0) {
					return IGXVZOHI.method355(field727[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field727 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field727.length; var3++) {
				var2 &= IGXVZOHI.method355(field727[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("HGKOLOPU.b(I)LHGKOLOPU;")
	public final HGKOLOPU method329() {
		int var1 = -1;
		if (field704 != -1) {
			EMWMNDZQ var2 = EMWMNDZQ.field602[field704];
			int var3 = var2.field604;
			int var4 = var2.field605;
			int var5 = var2.field606;
			int var6 = client.field395[var5 - var4];
			var1 = field703.field95[var3] >> var4 & var6;
		} else if (field720 != -1) {
			var1 = field703.field95[field720];
		}

		if (var1 >= 0 && var1 < field691.length && field691[var1] != -1) {
			return method326(field691[var1]);
		}

		return null;
	}
}
