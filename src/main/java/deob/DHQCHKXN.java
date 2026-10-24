package deob;

@ObfuscatedName("DHQCHKXN")
public final class DHQCHKXN {

	@ObfuscatedName("DHQCHKXN.A")
	public int field587 = -1;

	@ObfuscatedName("DHQCHKXN.b")
	public static ITSMSHJO[] field564 = new ITSMSHJO[4];

	@ObfuscatedName("DHQCHKXN.K")
	public static GOPFMRDJ field596 = new GOPFMRDJ(30);

	@ObfuscatedName("DHQCHKXN.V")
	public static GOPFMRDJ field606 = new GOPFMRDJ(500);

	@ObfuscatedName("DHQCHKXN.v")
	public byte field582;

	@ObfuscatedName("DHQCHKXN.L")
	public byte field597;

	@ObfuscatedName("DHQCHKXN.a")
	public int field563;

	@ObfuscatedName("DHQCHKXN.e")
	public int field567;

	@ObfuscatedName("DHQCHKXN.g")
	public int field569;

	@ObfuscatedName("DHQCHKXN.i")
	public static int field571;

	@ObfuscatedName("DHQCHKXN.j")
	public int field572;

	@ObfuscatedName("DHQCHKXN.k")
	public int field573;

	@ObfuscatedName("DHQCHKXN.m")
	public int field575;

	@ObfuscatedName("DHQCHKXN.o")
	public int field577;

	@ObfuscatedName("DHQCHKXN.w")
	public int field583;

	@ObfuscatedName("DHQCHKXN.x")
	public int field584;

	@ObfuscatedName("DHQCHKXN.D")
	public static int field590;

	@ObfuscatedName("DHQCHKXN.H")
	public int field593;

	@ObfuscatedName("DHQCHKXN.I")
	public int field594;

	@ObfuscatedName("DHQCHKXN.J")
	public int field595;

	@ObfuscatedName("DHQCHKXN.M")
	public int field598;

	@ObfuscatedName("DHQCHKXN.N")
	public int field599;

	@ObfuscatedName("DHQCHKXN.R")
	public int field603;

	@ObfuscatedName("DHQCHKXN.Y")
	public int field609;

	@ObfuscatedName("DHQCHKXN.U")
	public static XQPFGONL field605;

	@ObfuscatedName("DHQCHKXN.t")
	public static client field580;

	@ObfuscatedName("DHQCHKXN.W")
	public String field607;

	@ObfuscatedName("DHQCHKXN.c")
	public boolean field565;

	@ObfuscatedName("DHQCHKXN.d")
	public boolean field566;

	@ObfuscatedName("DHQCHKXN.f")
	public boolean field568;

	@ObfuscatedName("DHQCHKXN.h")
	public boolean field570;

	@ObfuscatedName("DHQCHKXN.q")
	public boolean field578;

	@ObfuscatedName("DHQCHKXN.y")
	public boolean field585;

	@ObfuscatedName("DHQCHKXN.z")
	public boolean field586;

	@ObfuscatedName("DHQCHKXN.B")
	public boolean field588;

	@ObfuscatedName("DHQCHKXN.E")
	public static boolean field591;

	@ObfuscatedName("DHQCHKXN.P")
	public boolean field601;

	@ObfuscatedName("DHQCHKXN.X")
	public boolean field608;

	@ObfuscatedName("DHQCHKXN.C")
	public byte[] field589;

	@ObfuscatedName("DHQCHKXN.l")
	public int[] field574;

	@ObfuscatedName("DHQCHKXN.s")
	public int[] field579;

	@ObfuscatedName("DHQCHKXN.u")
	public int[] field581;

	@ObfuscatedName("DHQCHKXN.O")
	public int[] field600;

	@ObfuscatedName("DHQCHKXN.Q")
	public static int[] field602;

	@ObfuscatedName("DHQCHKXN.S")
	public int[] field604;

	@ObfuscatedName("DHQCHKXN.G")
	public static DHQCHKXN[] field592;

	@ObfuscatedName("DHQCHKXN.n")
	public String[] field576;

	@ObfuscatedName("DHQCHKXN.a(IIII)LITSMSHJO;")
	public final ITSMSHJO method184(int arg0, int arg1, int arg2) {
		ITSMSHJO var4 = null;
		long var5;
		if (field579 == null) {
			if (arg2 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field587 << 6) + arg0);
			ITSMSHJO var7 = (ITSMSHJO) field596.method220(var5);
			if (var7 != null) {
				return var7;
			}

			if (field574 == null) {
				return null;
			}

			boolean var8 = field588 ^ arg0 > 3;
			int var9 = field574.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field574[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (ITSMSHJO) field606.method220(var11);
				if (var4 == null) {
					var4 = ITSMSHJO.method238(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method253();
					}

					field606.method221(var11, var4);
				}

				if (var9 > 1) {
					field564[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new ITSMSHJO(field564, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field579.length; var13++) {
				if (field579[var13] == arg2) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field587 << 6) + (var12 << 3) + arg0);
			ITSMSHJO var14 = (ITSMSHJO) field596.method220(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field574[var12];
			boolean var16 = field588 ^ arg0 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (ITSMSHJO) field606.method220(var15);
			if (var4 == null) {
				var4 = ITSMSHJO.method238(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method253();
				}

				field606.method221(var15, var4);
			}
		}

		boolean var17;
		if (field595 == 128 && field569 == 128 && field583 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field573 == 0 && field563 == 0 && field599 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		ITSMSHJO var19 = new ITSMSHJO(var4, SCIASJXX.method401(arg1), arg0 == 0 && arg1 == -1 && !var17 && !var18, field600 == null);
		if (arg1 != -1) {
			var19.method245();
			var19.method246(arg1);
			var19.field785 = null;
			var19.field784 = null;
		}

		while (arg0-- > 0) {
			var19.method249();
		}

		if (field600 != null) {
			for (int var20 = 0; var20 < field600.length; var20++) {
				var19.method252(field600[var20], field581[var20]);
			}
		}

		if (var17) {
			var19.method254(field583, field595, field569);
		}

		if (var18) {
			var19.method251(field573, field599, field563);
		}

		var19.method255(field582 + 64, field597 * 5 + 768, -50, -10, -50, !field608);

		if (field572 == 1) {
			var19.field781 = var19.field1174;
		}

		field596.method221(var5, var19);
		return var19;
	}

	@ObfuscatedName("DHQCHKXN.a(I)V")
	public static final void method185() {
		field606 = null;
		field596 = null;
		field602 = null;
		field592 = null;
		field605 = null;
	}

	@ObfuscatedName("DHQCHKXN.a(LXQPFGONL;I)V")
	public final void method186(XQPFGONL arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method478();
					if (var3 == 0) {
						if (var2 == -1) {
							field585 = false;
							if (field574 != null && (field579 == null || field579[0] == 10)) {
								field585 = true;
							}

							if (field576 != null) {
								field585 = true;
							}
						}

						if (field578) {
							field566 = false;
							field586 = false;
						}

						if (field572 == -1) {
							field572 = field566 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field607 = arg0.method485();
					} else if (var3 == 3) {
						field589 = arg0.method486();
					} else if (var3 == 5) {
						int var6 = arg0.method478();
						if (var6 > 0) {
							if (field574 == null || field591) {
								field579 = null;
								field574 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field574[var7] = arg0.method480();
								}
							} else {
								arg0.field1335 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field598 = arg0.method478();
					} else if (var3 == 15) {
						field567 = arg0.method478();
					} else if (var3 == 17) {
						field566 = false;
					} else if (var3 == 18) {
						field586 = false;
					} else if (var3 == 19) {
						var2 = arg0.method478();
						if (var2 == 1) {
							field585 = true;
						}
					} else if (var3 == 21) {
						field568 = true;
					} else if (var3 == 22) {
						field608 = true;
					} else if (var3 == 23) {
						field570 = true;
					} else if (var3 == 24) {
						field584 = arg0.method480();
						if (field584 == 0xFFFF) {
							field584 = -1;
						}
					} else if (var3 == 28) {
						field603 = arg0.method478();
					} else if (var3 == 29) {
						field582 = arg0.method479();
					} else if (var3 == 39) {
						field597 = arg0.method479();
					} else if (var3 >= 30 && var3 < 39) {
						if (field576 == null) {
							field576 = new String[5];
						}

						field576[var3 - 30] = arg0.method485();
						if (field576[var3 - 30].equalsIgnoreCase("hidden")) {
							field576[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method478();
						field600 = new int[var8];
						field581 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field600[var9] = arg0.method480();
							field581[var9] = arg0.method480();
						}
					} else if (var3 == 60) {
						field609 = arg0.method480();
					} else if (var3 == 62) {
						field588 = true;
					} else if (var3 == 64) {
						field601 = false;
					} else if (var3 == 65) {
						field595 = arg0.method480();
					} else if (var3 == 66) {
						field569 = arg0.method480();
					} else if (var3 == 67) {
						field583 = arg0.method480();
					} else if (var3 == 68) {
						field577 = arg0.method480();
					} else if (var3 == 69) {
						field594 = arg0.method478();
					} else if (var3 == 70) {
						field573 = arg0.method481();
					} else if (var3 == 71) {
						field563 = arg0.method481();
					} else if (var3 == 72) {
						field599 = arg0.method481();
					} else if (var3 == 73) {
						field565 = true;
					} else if (var3 == 74) {
						field578 = true;
					} else if (var3 == 75) {
						field572 = arg0.method478();
					} else if (var3 == 77) {
						field575 = arg0.method480();
						if (field575 == 0xFFFF) {
							field575 = -1;
						}

						field593 = arg0.method480();
						if (field593 == 0xFFFF) {
							field593 = -1;
						}

						int var10 = arg0.method478();
						field604 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field604[var11] = arg0.method480();
							if (field604[var11] == 0xFFFF) {
								field604[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method478();
			} while (var4 <= 0);

			if (field574 == null || field591) {
				field579 = new int[var4];
				field574 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field574[var5] = arg0.method480();
					field579[var5] = arg0.method478();
				}
			} else {
				arg0.field1335 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("DHQCHKXN.a(LXMRRKSSB;)V")
	public static final void method187(XMRRKSSB arg0) {
		field605 = new XQPFGONL(arg0.method465("loc.dat", null));
		XQPFGONL var1 = new XQPFGONL(arg0.method465("loc.idx", null));
		field590 = var1.method480();
		field602 = new int[field590];
		int var2 = 2;
		for (int var3 = 0; var3 < field590; var3++) {
			field602[var3] = var2;
			var2 += var1.method480();
		}

		field592 = new DHQCHKXN[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field592[var4] = new DHQCHKXN();
		}
	}

	@ObfuscatedName("DHQCHKXN.a(IB)Z")
	public final boolean method188(int arg0) {
		if (field579 != null) {
			for (int var4 = 0; var4 < field579.length; var4++) {
				if (field579[var4] == arg0) {
					return ITSMSHJO.method239(field574[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field574 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field574.length; var3++) {
				var2 &= ITSMSHJO.method239(field574[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("DHQCHKXN.b(I)LDHQCHKXN;")
	public final DHQCHKXN method189() {
		int var1 = -1;
		if (field575 != -1) {
			JHLQAAYP var2 = JHLQAAYP.field840[field575];
			int var3 = var2.field842;
			int var4 = var2.field843;
			int var5 = var2.field844;
			int var6 = client.field165[var5 - var4];
			var1 = field580.field327[var3] >> var4 & var6;
		} else if (field593 != -1) {
			var1 = field580.field327[field593];
		}

		if (var1 >= 0 && var1 < field604.length && field604[var1] != -1) {
			return method194(field604[var1]);
		}

		return null;
	}

	@ObfuscatedName("DHQCHKXN.a(LWNPVPVVL;I)V")
	public final void method190(WNPVPVVL arg0) {
		if (field574 != null) {
			for (int var2 = 0; var2 < field574.length; var2++) {
				arg0.method448(0, field574[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("DHQCHKXN.a(IIIIIII)LITSMSHJO;")
	public final ITSMSHJO method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		ITSMSHJO var8 = method184(arg1, arg6, arg0);
		if (var8 == null) {
			return null;
		}

		if (field568 || field608) {
			var8 = new ITSMSHJO(field608, var8, field568);
		}

		if (field568) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field753; var10++) {
				int var11 = var8.field754[var10];
				int var12 = var8.field756[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field755[var10] += var15 - var9;
			}

			var8.method243();
		}

		return var8;
	}

	@ObfuscatedName("DHQCHKXN.a()V")
	public final void method192() {
		field574 = null;
		field579 = null;
		field607 = null;
		field589 = null;
		field600 = null;
		field581 = null;
		field598 = 1;
		field567 = 1;
		field566 = true;
		field586 = true;
		field585 = false;
		field568 = false;
		field608 = false;
		field570 = false;
		field584 = -1;
		field603 = 16;
		field582 = 0;
		field597 = 0;
		field576 = null;
		field609 = -1;
		field577 = -1;
		field588 = false;
		field601 = true;
		field595 = 128;
		field569 = 128;
		field583 = 128;
		field594 = 0;
		field573 = 0;
		field563 = 0;
		field599 = 0;
		field565 = false;
		field578 = false;
		field572 = -1;
		field575 = -1;
		field593 = -1;
		field604 = null;
	}

	@ObfuscatedName("DHQCHKXN.c(I)Z")
	public final boolean method193() {
		if (field574 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field574.length; var2++) {
			var1 &= ITSMSHJO.method239(field574[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("DHQCHKXN.d(I)LDHQCHKXN;")
	public static final DHQCHKXN method194(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field592[var1].field587 == arg0) {
				return field592[var1];
			}
		}

		field571 = (field571 + 1) % 20;
		DHQCHKXN var2 = field592[field571];
		field605.field1335 = field602[arg0];
		var2.field587 = arg0;
		var2.method192();
		var2.method186(field605);
		return var2;
	}
}
