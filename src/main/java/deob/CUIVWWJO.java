package deob;

@ObfuscatedName("CUIVWWJO")
public final class CUIVWWJO {

	@ObfuscatedName("CUIVWWJO.M")
	public int field585 = -1;

	@ObfuscatedName("CUIVWWJO.U")
	public String field593 = "null";

	@ObfuscatedName("CUIVWWJO.a")
	public static WUMSOEQS field550 = new WUMSOEQS(500);

	@ObfuscatedName("CUIVWWJO.s")
	public static PDVZPZLT[] field566 = new PDVZPZLT[4];

	@ObfuscatedName("CUIVWWJO.C")
	public static WUMSOEQS field576 = new WUMSOEQS(40);

	@ObfuscatedName("CUIVWWJO.z")
	public byte field573;

	@ObfuscatedName("CUIVWWJO.Y")
	public byte field596;

	@ObfuscatedName("CUIVWWJO.f")
	public int field554;

	@ObfuscatedName("CUIVWWJO.i")
	public int field557;

	@ObfuscatedName("CUIVWWJO.p")
	public int field563;

	@ObfuscatedName("CUIVWWJO.t")
	public int field567;

	@ObfuscatedName("CUIVWWJO.u")
	public static int field568;

	@ObfuscatedName("CUIVWWJO.v")
	public int field569;

	@ObfuscatedName("CUIVWWJO.y")
	public int field572;

	@ObfuscatedName("CUIVWWJO.A")
	public int field574;

	@ObfuscatedName("CUIVWWJO.E")
	public int field578;

	@ObfuscatedName("CUIVWWJO.F")
	public static int field579;

	@ObfuscatedName("CUIVWWJO.H")
	public int field581;

	@ObfuscatedName("CUIVWWJO.L")
	public int field584;

	@ObfuscatedName("CUIVWWJO.P")
	public int field588;

	@ObfuscatedName("CUIVWWJO.Q")
	public int field589;

	@ObfuscatedName("CUIVWWJO.S")
	public int field591;

	@ObfuscatedName("CUIVWWJO.T")
	public int field592;

	@ObfuscatedName("CUIVWWJO.V")
	public int field594;

	@ObfuscatedName("CUIVWWJO.W")
	public int field595;

	@ObfuscatedName("CUIVWWJO.h")
	public static MVHXDWGI field556;

	@ObfuscatedName("CUIVWWJO.J")
	public static client field583;

	@ObfuscatedName("CUIVWWJO.b")
	public boolean field551;

	@ObfuscatedName("CUIVWWJO.d")
	public boolean field553;

	@ObfuscatedName("CUIVWWJO.g")
	public static boolean field555;

	@ObfuscatedName("CUIVWWJO.k")
	public boolean field559;

	@ObfuscatedName("CUIVWWJO.m")
	public boolean field561;

	@ObfuscatedName("CUIVWWJO.q")
	public boolean field564;

	@ObfuscatedName("CUIVWWJO.w")
	public boolean field570;

	@ObfuscatedName("CUIVWWJO.B")
	public boolean field575;

	@ObfuscatedName("CUIVWWJO.I")
	public boolean field582;

	@ObfuscatedName("CUIVWWJO.N")
	public boolean field586;

	@ObfuscatedName("CUIVWWJO.R")
	public boolean field590;

	@ObfuscatedName("CUIVWWJO.r")
	public byte[] field565;

	@ObfuscatedName("CUIVWWJO.c")
	public int[] field552;

	@ObfuscatedName("CUIVWWJO.l")
	public int[] field560;

	@ObfuscatedName("CUIVWWJO.o")
	public int[] field562;

	@ObfuscatedName("CUIVWWJO.x")
	public static int[] field571;

	@ObfuscatedName("CUIVWWJO.D")
	public int[] field577;

	@ObfuscatedName("CUIVWWJO.O")
	public int[] field587;

	@ObfuscatedName("CUIVWWJO.G")
	public static CUIVWWJO[] field580;

	@ObfuscatedName("CUIVWWJO.j")
	public String[] field558;

	@ObfuscatedName("CUIVWWJO.a(I)LCUIVWWJO;")
	public final CUIVWWJO method195() {
		int var1 = -1;
		if (field581 != -1) {
			QMAVGSSV var2 = QMAVGSSV.field1234[field581];
			int var3 = var2.field1236;
			int var4 = var2.field1237;
			int var5 = var2.field1238;
			int var6 = client.field367[var5 - var4];
			var1 = field583.field467[var3] >> var4 & var6;
		} else if (field592 != -1) {
			var1 = field583.field467[field592];
		}

		if (var1 >= 0 && var1 < field562.length && field562[var1] != -1) {
			return method203(field562[var1]);
		}

		return null;
	}

	@ObfuscatedName("CUIVWWJO.a(LIEMHZJLX;)V")
	public static final void method196(IEMHZJLX arg0) {
		field556 = new MVHXDWGI(arg0.method242("loc.dat", null));
		MVHXDWGI var1 = new MVHXDWGI(arg0.method242("loc.idx", null));
		field568 = var1.method359();
		field571 = new int[field568];
		int var2 = 2;
		for (int var3 = 0; var3 < field568; var3++) {
			field571[var3] = var2;
			var2 += var1.method359();
		}

		field580 = new CUIVWWJO[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field580[var4] = new CUIVWWJO();
		}
	}

	@ObfuscatedName("CUIVWWJO.a(Z)V")
	public static final void method197() {
		field550 = null;
		field576 = null;
		field571 = null;
		field580 = null;
		field556 = null;
	}

	@ObfuscatedName("CUIVWWJO.a(II)Z")
	public final boolean method198(int arg0) {
		if (field560 != null) {
			for (int var4 = 0; var4 < field560.length; var4++) {
				if (field560[var4] == arg0) {
					return PDVZPZLT.method415(field552[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field552 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field552.length; var3++) {
				var2 &= PDVZPZLT.method415(field552[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("CUIVWWJO.b(Z)Z")
	public final boolean method199() {
		if (field552 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field552.length; var2++) {
			var1 &= PDVZPZLT.method415(field552[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("CUIVWWJO.a(IZII)LPDVZPZLT;")
	public final PDVZPZLT method200(int arg0, int arg1, int arg2) {
		PDVZPZLT var4 = null;
		long var5;
		if (field560 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field585 << 6) + arg1);
			PDVZPZLT var7 = (PDVZPZLT) field576.method586(var5);
			if (var7 != null) {
				return var7;
			}

			if (field552 == null) {
				return null;
			}

			boolean var8 = field561 ^ arg1 > 3;
			int var9 = field552.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field552[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (PDVZPZLT) field550.method586(var11);
				if (var4 == null) {
					var4 = PDVZPZLT.method414(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method429();
					}

					field550.method587(var11, var4);
				}

				if (var9 > 1) {
					field566[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new PDVZPZLT(field566, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field560.length; var13++) {
				if (field560[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field585 << 6) + (var12 << 3) + arg1);
			PDVZPZLT var14 = (PDVZPZLT) field576.method586(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field552[var12];
			boolean var16 = field561 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (PDVZPZLT) field550.method586(var15);
			if (var4 == null) {
				var4 = PDVZPZLT.method414(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method429();
				}

				field550.method587(var15, var4);
			}
		}

		boolean var17;
		if (field574 == 128 && field591 == 128 && field588 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field589 == 0 && field578 == 0 && field572 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		PDVZPZLT var19 = new PDVZPZLT(var4, field587 == null, YPRWORMV.method602(arg2), arg1 == 0 && arg2 == -1 && !var17 && !var18);
		if (arg2 != -1) {
			var19.method421();
			var19.method422(arg2);
			var19.field1166 = null;
			var19.field1165 = null;
		}

		while (arg1-- > 0) {
			var19.method425();
		}

		if (field587 != null) {
			for (int var20 = 0; var20 < field587.length; var20++) {
				var19.method428(field587[var20], field577[var20]);
			}
		}

		if (var17) {
			var19.method430(field574, field591, field588);
		}

		if (var18) {
			var19.method427(field572, field578, field589);
		}

		var19.method431(field573 + 64, field596 * 5 + 768, -50, -10, -50, !field575);

		if (field584 == 1) {
			var19.field1162 = var19.field1483;
		}

		field576.method587(var5, var19);
		return var19;
	}

	@ObfuscatedName("CUIVWWJO.a(ILMVHXDWGI;)V")
	public final void method201(MVHXDWGI arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method357();
					if (var3 == 0) {
						if (var2 == -1) {
							field586 = false;
							if (field552 != null && (field560 == null || field560[0] == 10)) {
								field586 = true;
							}

							if (field558 != null) {
								field586 = true;
							}
						}

						if (field564) {
							field570 = false;
							field553 = false;
						}

						if (field584 == -1) {
							field584 = field570 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field593 = arg0.method364();
					} else if (var3 == 3) {
						field565 = arg0.method365();
					} else if (var3 == 5) {
						int var6 = arg0.method357();
						if (var6 > 0) {
							if (field552 == null || field555) {
								field560 = null;
								field552 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field552[var7] = arg0.method359();
								}
							} else {
								arg0.field1014 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field554 = arg0.method357();
					} else if (var3 == 15) {
						field594 = arg0.method357();
					} else if (var3 == 17) {
						field570 = false;
					} else if (var3 == 18) {
						field553 = false;
					} else if (var3 == 19) {
						var2 = arg0.method357();
						if (var2 == 1) {
							field586 = true;
						}
					} else if (var3 == 21) {
						field559 = true;
					} else if (var3 == 22) {
						field575 = true;
					} else if (var3 == 23) {
						field582 = true;
					} else if (var3 == 24) {
						field563 = arg0.method359();
						if (field563 == 0xFFFF) {
							field563 = -1;
						}
					} else if (var3 == 28) {
						field557 = arg0.method357();
					} else if (var3 == 29) {
						field573 = arg0.method358();
					} else if (var3 == 39) {
						field596 = arg0.method358();
					} else if (var3 >= 30 && var3 < 39) {
						if (field558 == null) {
							field558 = new String[5];
						}

						field558[var3 - 30] = arg0.method364();
						if (field558[var3 - 30].equalsIgnoreCase("hidden")) {
							field558[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method357();
						field587 = new int[var8];
						field577 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field587[var9] = arg0.method359();
							field577[var9] = arg0.method359();
						}
					} else if (var3 == 60) {
						field569 = arg0.method359();
					} else if (var3 == 62) {
						field561 = true;
					} else if (var3 == 64) {
						field590 = false;
					} else if (var3 == 65) {
						field574 = arg0.method359();
					} else if (var3 == 66) {
						field591 = arg0.method359();
					} else if (var3 == 67) {
						field588 = arg0.method359();
					} else if (var3 == 68) {
						field567 = arg0.method359();
					} else if (var3 == 69) {
						field595 = arg0.method357();
					} else if (var3 == 70) {
						field589 = arg0.method360();
					} else if (var3 == 71) {
						field578 = arg0.method360();
					} else if (var3 == 72) {
						field572 = arg0.method360();
					} else if (var3 == 73) {
						field551 = true;
					} else if (var3 == 74) {
						field564 = true;
					} else if (var3 == 75) {
						field584 = arg0.method357();
					} else if (var3 == 77) {
						field581 = arg0.method359();
						if (field581 == 0xFFFF) {
							field581 = -1;
						}

						field592 = arg0.method359();
						if (field592 == 0xFFFF) {
							field592 = -1;
						}

						int var10 = arg0.method357();
						field562 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field562[var11] = arg0.method359();
							if (field562[var11] == 0xFFFF) {
								field562[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method357();
			} while (var4 <= 0);

			if (field552 == null || field555) {
				field560 = new int[var4];
				field552 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field552[var5] = arg0.method359();
					field560[var5] = arg0.method357();
				}
			} else {
				arg0.field1014 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("CUIVWWJO.a(BLRKMPVAZH;)V")
	public final void method202(RKMPVAZH arg0) {
		if (field552 != null) {
			for (int var2 = 0; var2 < field552.length; var2++) {
				arg0.method517(field552[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("CUIVWWJO.b(I)LCUIVWWJO;")
	public static final CUIVWWJO method203(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field580[var1].field585 == arg0) {
				return field580[var1];
			}
		}

		field579 = (field579 + 1) % 20;
		CUIVWWJO var2 = field580[field579];
		field556.field1014 = field571[arg0];
		var2.field585 = arg0;
		var2.method204();
		var2.method201(field556);
		return var2;
	}

	@ObfuscatedName("CUIVWWJO.a()V")
	public final void method204() {
		field552 = null;
		field560 = null;
		field593 = "null";
		field565 = null;
		field587 = null;
		field577 = null;
		field554 = 1;
		field594 = 1;
		field570 = true;
		field553 = true;
		field586 = false;
		field559 = false;
		field575 = false;
		field582 = false;
		field563 = -1;
		field557 = 16;
		field573 = 0;
		field596 = 0;
		field558 = null;
		field569 = -1;
		field567 = -1;
		field561 = false;
		field590 = true;
		field574 = 128;
		field591 = 128;
		field588 = 128;
		field595 = 0;
		field589 = 0;
		field578 = 0;
		field572 = 0;
		field551 = false;
		field564 = false;
		field584 = -1;
		field581 = -1;
		field592 = -1;
		field562 = null;
	}

	@ObfuscatedName("CUIVWWJO.a(IIIIIII)LPDVZPZLT;")
	public final PDVZPZLT method205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		PDVZPZLT var8 = method200(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field559 || field575) {
			var8 = new PDVZPZLT(var8, field575, field559);
		}

		if (field559) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1135; var10++) {
				int var11 = var8.field1136[var10];
				int var12 = var8.field1138[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1137[var10] += var15 - var9;
			}

			var8.method419();
		}

		return var8;
	}
}
