package deob;

@ObfuscatedName("AMVKCKZF")
public final class AMVKCKZF {

	@ObfuscatedName("AMVKCKZF.q")
	public String field16 = "null";

	@ObfuscatedName("AMVKCKZF.B")
	public int field26 = -1;

	@ObfuscatedName("AMVKCKZF.o")
	public static IEHKDFMR[] field14 = new IEHKDFMR[4];

	@ObfuscatedName("AMVKCKZF.x")
	public static BVBRKPZH field23 = new BVBRKPZH(500);

	@ObfuscatedName("AMVKCKZF.V")
	public static BVBRKPZH field44 = new BVBRKPZH(40);

	@ObfuscatedName("AMVKCKZF.g")
	public byte field6;

	@ObfuscatedName("AMVKCKZF.i")
	public byte field8;

	@ObfuscatedName("AMVKCKZF.m")
	public int field12;

	@ObfuscatedName("AMVKCKZF.n")
	public int field13;

	@ObfuscatedName("AMVKCKZF.t")
	public static int field19;

	@ObfuscatedName("AMVKCKZF.u")
	public int field20;

	@ObfuscatedName("AMVKCKZF.v")
	public int field21;

	@ObfuscatedName("AMVKCKZF.A")
	public int field25;

	@ObfuscatedName("AMVKCKZF.D")
	public int field28;

	@ObfuscatedName("AMVKCKZF.d")
	public int field3;

	@ObfuscatedName("AMVKCKZF.F")
	public int field30;

	@ObfuscatedName("AMVKCKZF.G")
	public int field31;

	@ObfuscatedName("AMVKCKZF.I")
	public int field32;

	@ObfuscatedName("AMVKCKZF.J")
	public int field33;

	@ObfuscatedName("AMVKCKZF.L")
	public int field35;

	@ObfuscatedName("AMVKCKZF.M")
	public static int field36;

	@ObfuscatedName("AMVKCKZF.O")
	public int field38;

	@ObfuscatedName("AMVKCKZF.P")
	public int field39;

	@ObfuscatedName("AMVKCKZF.X")
	public int field46;

	@ObfuscatedName("AMVKCKZF.f")
	public int field5;

	@ObfuscatedName("AMVKCKZF.N")
	public static EMWAMCXW field37;

	@ObfuscatedName("AMVKCKZF.U")
	public static client field43;

	@ObfuscatedName("AMVKCKZF.k")
	public boolean field10;

	@ObfuscatedName("AMVKCKZF.p")
	public boolean field15;

	@ObfuscatedName("AMVKCKZF.w")
	public boolean field22;

	@ObfuscatedName("AMVKCKZF.z")
	public boolean field24;

	@ObfuscatedName("AMVKCKZF.E")
	public boolean field29;

	@ObfuscatedName("AMVKCKZF.e")
	public boolean field4;

	@ObfuscatedName("AMVKCKZF.Q")
	public boolean field40;

	@ObfuscatedName("AMVKCKZF.S")
	public static boolean field42;

	@ObfuscatedName("AMVKCKZF.Z")
	public boolean field47;

	@ObfuscatedName("AMVKCKZF.h")
	public boolean field7;

	@ObfuscatedName("AMVKCKZF.j")
	public boolean field9;

	@ObfuscatedName("AMVKCKZF.a")
	public byte[] field1;

	@ObfuscatedName("AMVKCKZF.l")
	public int[] field11;

	@ObfuscatedName("AMVKCKZF.r")
	public int[] field17;

	@ObfuscatedName("AMVKCKZF.s")
	public int[] field18;

	@ObfuscatedName("AMVKCKZF.C")
	public int[] field27;

	@ObfuscatedName("AMVKCKZF.K")
	public int[] field34;

	@ObfuscatedName("AMVKCKZF.R")
	public static int[] field41;

	@ObfuscatedName("AMVKCKZF.b")
	public static AMVKCKZF[] field2;

	@ObfuscatedName("AMVKCKZF.W")
	public String[] field45;

	@ObfuscatedName("AMVKCKZF.a()V")
	public final void method1() {
		field27 = null;
		field18 = null;
		field16 = "null";
		field1 = null;
		field11 = null;
		field34 = null;
		field21 = 1;
		field30 = 1;
		field24 = true;
		field22 = true;
		field4 = false;
		field47 = false;
		field9 = false;
		field29 = false;
		field20 = -1;
		field35 = 16;
		field8 = 0;
		field6 = 0;
		field45 = null;
		field46 = -1;
		field33 = -1;
		field40 = false;
		field7 = true;
		field39 = 128;
		field5 = 128;
		field32 = 128;
		field3 = 0;
		field38 = 0;
		field31 = 0;
		field13 = 0;
		field10 = false;
		field15 = false;
		field28 = -1;
		field25 = -1;
		field12 = -1;
		field17 = null;
	}

	@ObfuscatedName("AMVKCKZF.a(I)LAMVKCKZF;")
	public final AMVKCKZF method2() {
		int var1 = -1;
		if (field25 != -1) {
			EFEPEUMF var2 = EFEPEUMF.field607[field25];
			int var3 = var2.field609;
			int var4 = var2.field610;
			int var5 = var2.field611;
			int var6 = client.field323[var5 - var4];
			var1 = field43.field286[var3] >> var4 & var6;
		} else if (field12 != -1) {
			var1 = field43.field286[field12];
		}

		if (var1 >= 0 && var1 < field17.length && field17[var1] != -1) {
			return method4(field17[var1]);
		}

		return null;
	}

	@ObfuscatedName("AMVKCKZF.a(ILEMWAMCXW;)V")
	public final void method3(EMWAMCXW arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method217();
					if (var3 == 0) {
						if (var2 == -1) {
							field4 = false;
							if (field27 != null && (field18 == null || field18[0] == 10)) {
								field4 = true;
							}

							if (field45 != null) {
								field4 = true;
							}
						}

						if (field15) {
							field24 = false;
							field22 = false;
						}

						if (field28 == -1) {
							field28 = field24 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field16 = arg0.method224();
					} else if (var3 == 3) {
						field1 = arg0.method225();
					} else if (var3 == 5) {
						int var6 = arg0.method217();
						if (var6 > 0) {
							if (field27 == null || field42) {
								field18 = null;
								field27 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field27[var7] = arg0.method219();
								}
							} else {
								arg0.field617 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field21 = arg0.method217();
					} else if (var3 == 15) {
						field30 = arg0.method217();
					} else if (var3 == 17) {
						field24 = false;
					} else if (var3 == 18) {
						field22 = false;
					} else if (var3 == 19) {
						var2 = arg0.method217();
						if (var2 == 1) {
							field4 = true;
						}
					} else if (var3 == 21) {
						field47 = true;
					} else if (var3 == 22) {
						field9 = true;
					} else if (var3 == 23) {
						field29 = true;
					} else if (var3 == 24) {
						field20 = arg0.method219();
						if (field20 == 0xFFFF) {
							field20 = -1;
						}
					} else if (var3 == 28) {
						field35 = arg0.method217();
					} else if (var3 == 29) {
						field8 = arg0.method218();
					} else if (var3 == 39) {
						field6 = arg0.method218();
					} else if (var3 >= 30 && var3 < 39) {
						if (field45 == null) {
							field45 = new String[5];
						}

						field45[var3 - 30] = arg0.method224();
						if (field45[var3 - 30].equalsIgnoreCase("hidden")) {
							field45[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method217();
						field11 = new int[var8];
						field34 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field11[var9] = arg0.method219();
							field34[var9] = arg0.method219();
						}
					} else if (var3 == 60) {
						field46 = arg0.method219();
					} else if (var3 == 62) {
						field40 = true;
					} else if (var3 == 64) {
						field7 = false;
					} else if (var3 == 65) {
						field39 = arg0.method219();
					} else if (var3 == 66) {
						field5 = arg0.method219();
					} else if (var3 == 67) {
						field32 = arg0.method219();
					} else if (var3 == 68) {
						field33 = arg0.method219();
					} else if (var3 == 69) {
						field3 = arg0.method217();
					} else if (var3 == 70) {
						field38 = arg0.method220();
					} else if (var3 == 71) {
						field31 = arg0.method220();
					} else if (var3 == 72) {
						field13 = arg0.method220();
					} else if (var3 == 73) {
						field10 = true;
					} else if (var3 == 74) {
						field15 = true;
					} else if (var3 == 75) {
						field28 = arg0.method217();
					} else if (var3 == 77) {
						field25 = arg0.method219();
						if (field25 == 0xFFFF) {
							field25 = -1;
						}

						field12 = arg0.method219();
						if (field12 == 0xFFFF) {
							field12 = -1;
						}

						int var10 = arg0.method217();
						field17 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field17[var11] = arg0.method219();
							if (field17[var11] == 0xFFFF) {
								field17[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method217();
			} while (var4 <= 0);

			if (field27 == null || field42) {
				field18 = new int[var4];
				field27 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field27[var5] = arg0.method219();
					field18[var5] = arg0.method217();
				}
			} else {
				arg0.field617 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("AMVKCKZF.b(I)LAMVKCKZF;")
	public static final AMVKCKZF method4(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field2[var1].field26 == arg0) {
				return field2[var1];
			}
		}

		field36 = (field36 + 1) % 20;
		AMVKCKZF var2 = field2[field36];
		field37.field617 = field41[arg0];
		var2.field26 = arg0;
		var2.method1();
		var2.method3(field37);
		return var2;
	}

	@ObfuscatedName("AMVKCKZF.a(IIIIIII)LIEHKDFMR;")
	public final IEHKDFMR method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		IEHKDFMR var8 = method11(arg0, arg6, arg1);
		if (var8 == null) {
			return null;
		}

		if (field47 || field9) {
			var8 = new IEHKDFMR(field9, field47, var8);
		}

		if (field47) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field663; var10++) {
				int var11 = var8.field664[var10];
				int var12 = var8.field666[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field665[var10] += var15 - var9;
			}

			var8.method272();
		}

		return var8;
	}

	@ObfuscatedName("AMVKCKZF.a(Z)Z")
	public final boolean method6() {
		if (field27 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field27.length; var2++) {
			var1 &= IEHKDFMR.method268(field27[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("AMVKCKZF.a(ZLKMIIMWED;)V")
	public final void method7(KMIIMWED arg0) {
		if (field27 != null) {
			for (int var2 = 0; var2 < field27.length; var2++) {
				arg0.method319(0, field27[var2] & 0xFFFF);
			}
		}
	}

	@ObfuscatedName("AMVKCKZF.b(Z)V")
	public static final void method8() {
		field23 = null;
		field44 = null;
		field41 = null;
		field2 = null;
		field37 = null;
	}

	@ObfuscatedName("AMVKCKZF.a(II)Z")
	public final boolean method9(int arg0) {
		if (field18 != null) {
			for (int var4 = 0; var4 < field18.length; var4++) {
				if (field18[var4] == arg0) {
					return IEHKDFMR.method268(field27[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field27 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field27.length; var3++) {
				var2 &= IEHKDFMR.method268(field27[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("AMVKCKZF.a(LMAARFNGV;)V")
	public static final void method10(MAARFNGV arg0) {
		field37 = new EMWAMCXW(arg0.method332("loc.dat", null));
		EMWAMCXW var1 = new EMWAMCXW(arg0.method332("loc.idx", null));
		field19 = var1.method219();
		field41 = new int[field19];
		int var2 = 2;
		for (int var3 = 0; var3 < field19; var3++) {
			field41[var3] = var2;
			var2 += var1.method219();
		}

		field2 = new AMVKCKZF[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field2[var4] = new AMVKCKZF();
		}
	}

	@ObfuscatedName("AMVKCKZF.a(IIII)LIEHKDFMR;")
	public final IEHKDFMR method11(int arg0, int arg1, int arg2) {
		IEHKDFMR var4 = null;
		long var5;
		if (field18 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field26 << 6) + arg2);
			IEHKDFMR var7 = (IEHKDFMR) field44.method25(var5);
			if (var7 != null) {
				return var7;
			}

			if (field27 == null) {
				return null;
			}

			boolean var8 = field40 ^ arg2 > 3;
			int var9 = field27.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field27[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (IEHKDFMR) field23.method25(var11);
				if (var4 == null) {
					var4 = IEHKDFMR.method267(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method282();
					}

					field23.method26(var11, var4);
				}

				if (var9 > 1) {
					field14[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new IEHKDFMR(field14, var9);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field18.length; var13++) {
				if (field18[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg1 + 1) << 32) + ((field26 << 6) + (var12 << 3) + arg2);
			IEHKDFMR var14 = (IEHKDFMR) field44.method25(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field27[var12];
			boolean var16 = field40 ^ arg2 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (IEHKDFMR) field23.method25(var15);
			if (var4 == null) {
				var4 = IEHKDFMR.method267(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method282();
				}

				field23.method26(var15, var4);
			}
		}

		boolean var17;
		if (field39 == 128 && field5 == 128 && field32 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field38 == 0 && field31 == 0 && field13 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		IEHKDFMR var19 = new IEHKDFMR(arg2 == 0 && arg1 == -1 && !var17 && !var18, NXEWQQJO.method337(arg1), var4, field11 == null);
		if (arg1 != -1) {
			var19.method274();
			var19.method275(arg1);
			var19.field694 = null;
			var19.field693 = null;
		}

		while (arg2-- > 0) {
			var19.method278();
		}

		if (field11 != null) {
			for (int var20 = 0; var20 < field11.length; var20++) {
				var19.method281(field11[var20], field34[var20]);
			}
		}

		if (var17) {
			var19.method283(field32, field5, field39);
		}

		if (var18) {
			var19.method280(field38, field13, field31);
		}

		var19.method284(field8 + 64, field6 * 5 + 768, -50, -10, -50, !field9);

		if (field28 == 1) {
			var19.field690 = var19.field605;
		}

		field44.method26(var5, var19);
		return var19;
	}
}
