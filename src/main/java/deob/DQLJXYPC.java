package deob;

@ObfuscatedName("DQLJXYPC")
public final class DQLJXYPC {

	@ObfuscatedName("DQLJXYPC.z")
	public int field647 = -1;

	@ObfuscatedName("DQLJXYPC.d")
	public static KBEXSZSN[] field626 = new KBEXSZSN[4];

	@ObfuscatedName("DQLJXYPC.K")
	public static DSMCVRKW field658 = new DSMCVRKW(40);

	@ObfuscatedName("DQLJXYPC.U")
	public static DSMCVRKW field668 = new DSMCVRKW(500);

	@ObfuscatedName("DQLJXYPC.e")
	public byte field627;

	@ObfuscatedName("DQLJXYPC.P")
	public byte field663;

	@ObfuscatedName("DQLJXYPC.f")
	public int field628;

	@ObfuscatedName("DQLJXYPC.g")
	public int field629;

	@ObfuscatedName("DQLJXYPC.i")
	public static int field630;

	@ObfuscatedName("DQLJXYPC.o")
	public int field636;

	@ObfuscatedName("DQLJXYPC.t")
	public int field641;

	@ObfuscatedName("DQLJXYPC.u")
	public int field642;

	@ObfuscatedName("DQLJXYPC.w")
	public int field644;

	@ObfuscatedName("DQLJXYPC.y")
	public int field646;

	@ObfuscatedName("DQLJXYPC.G")
	public int field654;

	@ObfuscatedName("DQLJXYPC.I")
	public int field656;

	@ObfuscatedName("DQLJXYPC.J")
	public static int field657;

	@ObfuscatedName("DQLJXYPC.M")
	public int field660;

	@ObfuscatedName("DQLJXYPC.Q")
	public int field664;

	@ObfuscatedName("DQLJXYPC.R")
	public int field665;

	@ObfuscatedName("DQLJXYPC.S")
	public int field666;

	@ObfuscatedName("DQLJXYPC.T")
	public int field667;

	@ObfuscatedName("DQLJXYPC.W")
	public int field669;

	@ObfuscatedName("DQLJXYPC.X")
	public int field670;

	@ObfuscatedName("DQLJXYPC.r")
	public static EILHLJCE field639;

	@ObfuscatedName("DQLJXYPC.l")
	public static client field633;

	@ObfuscatedName("DQLJXYPC.O")
	public String field662;

	@ObfuscatedName("DQLJXYPC.j")
	public boolean field631;

	@ObfuscatedName("DQLJXYPC.k")
	public boolean field632;

	@ObfuscatedName("DQLJXYPC.m")
	public boolean field634;

	@ObfuscatedName("DQLJXYPC.n")
	public boolean field635;

	@ObfuscatedName("DQLJXYPC.q")
	public boolean field638;

	@ObfuscatedName("DQLJXYPC.s")
	public boolean field640;

	@ObfuscatedName("DQLJXYPC.B")
	public boolean field649;

	@ObfuscatedName("DQLJXYPC.E")
	public boolean field652;

	@ObfuscatedName("DQLJXYPC.F")
	public boolean field653;

	@ObfuscatedName("DQLJXYPC.H")
	public static boolean field655;

	@ObfuscatedName("DQLJXYPC.N")
	public boolean field661;

	@ObfuscatedName("DQLJXYPC.a")
	public byte[] field624;

	@ObfuscatedName("DQLJXYPC.b")
	public static int[] field625;

	@ObfuscatedName("DQLJXYPC.v")
	public int[] field643;

	@ObfuscatedName("DQLJXYPC.x")
	public int[] field645;

	@ObfuscatedName("DQLJXYPC.A")
	public int[] field648;

	@ObfuscatedName("DQLJXYPC.C")
	public int[] field650;

	@ObfuscatedName("DQLJXYPC.L")
	public int[] field659;

	@ObfuscatedName("DQLJXYPC.p")
	public static DQLJXYPC[] field637;

	@ObfuscatedName("DQLJXYPC.D")
	public String[] field651;

	@ObfuscatedName("DQLJXYPC.a(IIII)LKBEXSZSN;")
	public final KBEXSZSN method186(int arg0, int arg1, int arg2) {
		KBEXSZSN var4 = null;
		long var5;
		if (field648 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field647 << 6) + arg1);
			KBEXSZSN var7 = (KBEXSZSN) field658.method197(var5);
			if (var7 != null) {
				return var7;
			}

			if (field643 == null) {
				return null;
			}

			boolean var8 = field653 ^ arg1 > 3;
			int var9 = field643.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field643[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (KBEXSZSN) field668.method197(var11);
				if (var4 == null) {
					var4 = KBEXSZSN.method339(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method354();
					}

					field668.method198(var11, var4);
				}

				if (var9 > 1) {
					field626[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new KBEXSZSN(var9, field626);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field648.length; var13++) {
				if (field648[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field647 << 6) + (var12 << 3) + arg1);
			KBEXSZSN var14 = (KBEXSZSN) field658.method197(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field643[var12];
			boolean var16 = field653 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (KBEXSZSN) field668.method197(var15);
			if (var4 == null) {
				var4 = KBEXSZSN.method339(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method354();
				}

				field668.method198(var15, var4);
			}
		}

		boolean var17;
		if (field646 == 128 && field660 == 128 && field629 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field670 == 0 && field667 == 0 && field656 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		KBEXSZSN var19 = new KBEXSZSN(arg1 == 0 && arg2 == -1 && !var17 && !var18, IBCKUTPD.method309(arg2), var4, field650 == null);
		if (arg2 != -1) {
			var19.method346();
			var19.method347(arg2);
			var19.field904 = null;
			var19.field903 = null;
		}

		while (arg1-- > 0) {
			var19.method350();
		}

		if (field650 != null) {
			for (int var20 = 0; var20 < field650.length; var20++) {
				var19.method353(field650[var20], field645[var20]);
			}
		}

		if (var17) {
			var19.method355(field629, field660, field646);
		}

		if (var18) {
			var19.method352(field667, field670, field656);
		}

		var19.method356(field627 + 64, field663 * 5 + 768, -50, -10, -50, !field649);

		if (field644 == 1) {
			var19.field900 = var19.field1299;
		}

		field658.method198(var5, var19);
		return var19;
	}

	@ObfuscatedName("DQLJXYPC.a(LBBMKAXRK;)V")
	public static final void method187(BBMKAXRK arg0) {
		field639 = new EILHLJCE(arg0.method30("loc.dat", null));
		EILHLJCE var1 = new EILHLJCE(arg0.method30("loc.idx", null));
		field657 = var1.method226();
		field625 = new int[field657];
		int var2 = 2;
		for (int var3 = 0; var3 < field657; var3++) {
			field625[var3] = var2;
			var2 += var1.method226();
		}

		field637 = new DQLJXYPC[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field637[var4] = new DQLJXYPC();
		}
	}

	@ObfuscatedName("DQLJXYPC.a(Z)Z")
	public final boolean method188() {
		if (field643 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field643.length; var2++) {
			var1 &= KBEXSZSN.method340(field643[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("DQLJXYPC.a(IIIIIII)LKBEXSZSN;")
	public final KBEXSZSN method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		KBEXSZSN var8 = method186(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field661 || field649) {
			var8 = new KBEXSZSN(var8, field661, field649);
		}

		if (field661) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field873; var10++) {
				int var11 = var8.field874[var10];
				int var12 = var8.field876[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field875[var10] += var15 - var9;
			}

			var8.method344();
		}

		return var8;
	}

	@ObfuscatedName("DQLJXYPC.a(II)Z")
	public final boolean method190(int arg0) {
		if (field648 != null) {
			for (int var4 = 0; var4 < field648.length; var4++) {
				if (field648[var4] == arg0) {
					return KBEXSZSN.method340(field643[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field643 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field643.length; var3++) {
				var2 &= KBEXSZSN.method340(field643[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("DQLJXYPC.a(LYSAVREBH;I)V")
	public final void method191(YSAVREBH arg0) {
		if (field643 != null) {
			for (int var2 = 0; var2 < field643.length; var2++) {
				arg0.method598(field643[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("DQLJXYPC.a(I)LDQLJXYPC;")
	public static final DQLJXYPC method192(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field637[var1].field647 == arg0) {
				return field637[var1];
			}
		}

		field630 = (field630 + 1) % 20;
		DQLJXYPC var2 = field637[field630];
		field639.field684 = field625[arg0];
		var2.field647 = arg0;
		var2.method196();
		var2.method195(field639);
		return var2;
	}

	@ObfuscatedName("DQLJXYPC.b(I)V")
	public static final void method193() {
		field668 = null;
		field658 = null;
		field625 = null;
		field637 = null;
		field639 = null;
	}

	@ObfuscatedName("DQLJXYPC.c(I)LDQLJXYPC;")
	public final DQLJXYPC method194() {
		int var1 = -1;
		if (field665 != -1) {
			SRLFLGUY var2 = SRLFLGUY.field1160[field665];
			int var3 = var2.field1162;
			int var4 = var2.field1163;
			int var5 = var2.field1164;
			int var6 = client.field476[var5 - var4];
			var1 = field633.field580[var3] >> var4 & var6;
		} else if (field642 != -1) {
			var1 = field633.field580[field642];
		}

		if (var1 >= 0 && var1 < field659.length && field659[var1] != -1) {
			return method192(field659[var1]);
		}

		return null;
	}

	@ObfuscatedName("DQLJXYPC.a(LEILHLJCE;B)V")
	public final void method195(EILHLJCE arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method224();
					if (var3 == 0) {
						if (var2 == -1) {
							field632 = false;
							if (field643 != null && (field648 == null || field648[0] == 10)) {
								field632 = true;
							}

							if (field651 != null) {
								field632 = true;
							}
						}

						if (field635) {
							field631 = false;
							field638 = false;
						}

						if (field644 == -1) {
							field644 = field631 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field662 = arg0.method231();
					} else if (var3 == 3) {
						field624 = arg0.method232();
					} else if (var3 == 5) {
						int var6 = arg0.method224();
						if (var6 > 0) {
							if (field643 == null || field655) {
								field648 = null;
								field643 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field643[var7] = arg0.method226();
								}
							} else {
								arg0.field684 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field641 = arg0.method224();
					} else if (var3 == 15) {
						field636 = arg0.method224();
					} else if (var3 == 17) {
						field631 = false;
					} else if (var3 == 18) {
						field638 = false;
					} else if (var3 == 19) {
						var2 = arg0.method224();
						if (var2 == 1) {
							field632 = true;
						}
					} else if (var3 == 21) {
						field661 = true;
					} else if (var3 == 22) {
						field649 = true;
					} else if (var3 == 23) {
						field640 = true;
					} else if (var3 == 24) {
						field628 = arg0.method226();
						if (field628 == 0xFFFF) {
							field628 = -1;
						}
					} else if (var3 == 28) {
						field664 = arg0.method224();
					} else if (var3 == 29) {
						field627 = arg0.method225();
					} else if (var3 == 39) {
						field663 = arg0.method225();
					} else if (var3 >= 30 && var3 < 39) {
						if (field651 == null) {
							field651 = new String[5];
						}

						field651[var3 - 30] = arg0.method231();
						if (field651[var3 - 30].equalsIgnoreCase("hidden")) {
							field651[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method224();
						field650 = new int[var8];
						field645 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field650[var9] = arg0.method226();
							field645[var9] = arg0.method226();
						}
					} else if (var3 == 60) {
						field654 = arg0.method226();
					} else if (var3 == 62) {
						field653 = true;
					} else if (var3 == 64) {
						field652 = false;
					} else if (var3 == 65) {
						field646 = arg0.method226();
					} else if (var3 == 66) {
						field660 = arg0.method226();
					} else if (var3 == 67) {
						field629 = arg0.method226();
					} else if (var3 == 68) {
						field666 = arg0.method226();
					} else if (var3 == 69) {
						field669 = arg0.method224();
					} else if (var3 == 70) {
						field670 = arg0.method227();
					} else if (var3 == 71) {
						field667 = arg0.method227();
					} else if (var3 == 72) {
						field656 = arg0.method227();
					} else if (var3 == 73) {
						field634 = true;
					} else if (var3 == 74) {
						field635 = true;
					} else if (var3 == 75) {
						field644 = arg0.method224();
					} else if (var3 == 77) {
						field665 = arg0.method226();
						if (field665 == 0xFFFF) {
							field665 = -1;
						}

						field642 = arg0.method226();
						if (field642 == 0xFFFF) {
							field642 = -1;
						}

						int var10 = arg0.method224();
						field659 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field659[var11] = arg0.method226();
							if (field659[var11] == 0xFFFF) {
								field659[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method224();
			} while (var4 <= 0);

			if (field643 == null || field655) {
				field648 = new int[var4];
				field643 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field643[var5] = arg0.method226();
					field648[var5] = arg0.method224();
				}
			} else {
				arg0.field684 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("DQLJXYPC.a()V")
	public final void method196() {
		field643 = null;
		field648 = null;
		field662 = null;
		field624 = null;
		field650 = null;
		field645 = null;
		field641 = 1;
		field636 = 1;
		field631 = true;
		field638 = true;
		field632 = false;
		field661 = false;
		field649 = false;
		field640 = false;
		field628 = -1;
		field664 = 16;
		field627 = 0;
		field663 = 0;
		field651 = null;
		field654 = -1;
		field666 = -1;
		field653 = false;
		field652 = true;
		field646 = 128;
		field660 = 128;
		field629 = 128;
		field669 = 0;
		field670 = 0;
		field667 = 0;
		field656 = 0;
		field634 = false;
		field635 = false;
		field644 = -1;
		field665 = -1;
		field642 = -1;
		field659 = null;
	}
}
