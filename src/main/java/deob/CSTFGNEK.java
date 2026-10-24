package deob;

@ObfuscatedName("CSTFGNEK")
public final class CSTFGNEK {

	@ObfuscatedName("CSTFGNEK.t")
	public int field506 = -1;

	@ObfuscatedName("CSTFGNEK.p")
	public static ZYLCKQCD field503 = new ZYLCKQCD(500);

	@ObfuscatedName("CSTFGNEK.w")
	public static POJFANDE[] field509 = new POJFANDE[4];

	@ObfuscatedName("CSTFGNEK.y")
	public static ZYLCKQCD field511 = new ZYLCKQCD(40);

	@ObfuscatedName("CSTFGNEK.b")
	public byte field489;

	@ObfuscatedName("CSTFGNEK.Z")
	public byte field534;

	@ObfuscatedName("CSTFGNEK.c")
	public int field490;

	@ObfuscatedName("CSTFGNEK.f")
	public int field493;

	@ObfuscatedName("CSTFGNEK.h")
	public int field495;

	@ObfuscatedName("CSTFGNEK.i")
	public int field496;

	@ObfuscatedName("CSTFGNEK.m")
	public int field500;

	@ObfuscatedName("CSTFGNEK.r")
	public int field505;

	@ObfuscatedName("CSTFGNEK.z")
	public int field512;

	@ObfuscatedName("CSTFGNEK.A")
	public int field513;

	@ObfuscatedName("CSTFGNEK.C")
	public int field514;

	@ObfuscatedName("CSTFGNEK.D")
	public int field515;

	@ObfuscatedName("CSTFGNEK.E")
	public static int field516;

	@ObfuscatedName("CSTFGNEK.F")
	public int field517;

	@ObfuscatedName("CSTFGNEK.G")
	public int field518;

	@ObfuscatedName("CSTFGNEK.N")
	public static int field525;

	@ObfuscatedName("CSTFGNEK.S")
	public int field527;

	@ObfuscatedName("CSTFGNEK.T")
	public int field528;

	@ObfuscatedName("CSTFGNEK.U")
	public int field529;

	@ObfuscatedName("CSTFGNEK.Y")
	public int field533;

	@ObfuscatedName("CSTFGNEK.V")
	public static PGNBHFUF field530;

	@ObfuscatedName("CSTFGNEK.o")
	public static client field502;

	@ObfuscatedName("CSTFGNEK.n")
	public String field501;

	@ObfuscatedName("CSTFGNEK.d")
	public boolean field491;

	@ObfuscatedName("CSTFGNEK.g")
	public boolean field494;

	@ObfuscatedName("CSTFGNEK.l")
	public boolean field499;

	@ObfuscatedName("CSTFGNEK.q")
	public boolean field504;

	@ObfuscatedName("CSTFGNEK.x")
	public boolean field510;

	@ObfuscatedName("CSTFGNEK.I")
	public boolean field520;

	@ObfuscatedName("CSTFGNEK.J")
	public boolean field521;

	@ObfuscatedName("CSTFGNEK.K")
	public static boolean field522;

	@ObfuscatedName("CSTFGNEK.M")
	public boolean field524;

	@ObfuscatedName("CSTFGNEK.O")
	public boolean field526;

	@ObfuscatedName("CSTFGNEK.ab")
	public boolean field535;

	@ObfuscatedName("CSTFGNEK.v")
	public byte[] field508;

	@ObfuscatedName("CSTFGNEK.j")
	public static int[] field497;

	@ObfuscatedName("CSTFGNEK.k")
	public int[] field498;

	@ObfuscatedName("CSTFGNEK.u")
	public int[] field507;

	@ObfuscatedName("CSTFGNEK.H")
	public int[] field519;

	@ObfuscatedName("CSTFGNEK.L")
	public int[] field523;

	@ObfuscatedName("CSTFGNEK.W")
	public int[] field531;

	@ObfuscatedName("CSTFGNEK.X")
	public static CSTFGNEK[] field532;

	@ObfuscatedName("CSTFGNEK.e")
	public String[] field492;

	@ObfuscatedName("CSTFGNEK.a(I)Z")
	public final boolean method210() {
		if (field507 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field507.length; var2++) {
			var1 &= POJFANDE.method461(field507[var2] & 0xFFFF);
		}

		return var1;
	}

	@ObfuscatedName("CSTFGNEK.a(LPGNBHFUF;I)V")
	public final void method211(PGNBHFUF arg0) {
		int var2 = -1;
		while (true) {
			int var4;
			do {
				while (true) {
					int var3 = arg0.method420();
					if (var3 == 0) {
						if (var2 == -1) {
							field524 = false;
							if (field507 != null && (field519 == null || field519[0] == 10)) {
								field524 = true;
							}

							if (field492 != null) {
								field524 = true;
							}
						}

						if (field504) {
							field491 = false;
							field499 = false;
						}

						if (field515 == -1) {
							field515 = field491 ? 1 : 0;
							return;
						}

						return;
					}

					if (var3 == 1) {
						break;
					}

					if (var3 == 2) {
						field501 = arg0.method427();
					} else if (var3 == 3) {
						field508 = arg0.method428();
					} else if (var3 == 5) {
						int var6 = arg0.method420();
						if (var6 > 0) {
							if (field507 == null || field522) {
								field519 = null;
								field507 = new int[var6];
								for (int var7 = 0; var7 < var6; var7++) {
									field507[var7] = arg0.method422();
								}
							} else {
								arg0.field1082 += var6 * 2;
							}
						}
					} else if (var3 == 14) {
						field527 = arg0.method420();
					} else if (var3 == 15) {
						field533 = arg0.method420();
					} else if (var3 == 17) {
						field491 = false;
					} else if (var3 == 18) {
						field499 = false;
					} else if (var3 == 19) {
						var2 = arg0.method420();
						if (var2 == 1) {
							field524 = true;
						}
					} else if (var3 == 21) {
						field510 = true;
					} else if (var3 == 22) {
						field526 = true;
					} else if (var3 == 23) {
						field520 = true;
					} else if (var3 == 24) {
						field505 = arg0.method422();
						if (field505 == 0xFFFF) {
							field505 = -1;
						}
					} else if (var3 == 28) {
						field512 = arg0.method420();
					} else if (var3 == 29) {
						field534 = arg0.method421();
					} else if (var3 == 39) {
						field489 = arg0.method421();
					} else if (var3 >= 30 && var3 < 39) {
						if (field492 == null) {
							field492 = new String[5];
						}

						field492[var3 - 30] = arg0.method427();
						if (field492[var3 - 30].equalsIgnoreCase("hidden")) {
							field492[var3 - 30] = null;
						}
					} else if (var3 == 40) {
						int var8 = arg0.method420();
						field523 = new int[var8];
						field498 = new int[var8];
						for (int var9 = 0; var9 < var8; var9++) {
							field523[var9] = arg0.method422();
							field498[var9] = arg0.method422();
						}
					} else if (var3 == 60) {
						field496 = arg0.method422();
					} else if (var3 == 62) {
						field521 = true;
					} else if (var3 == 64) {
						field494 = false;
					} else if (var3 == 65) {
						field517 = arg0.method422();
					} else if (var3 == 66) {
						field500 = arg0.method422();
					} else if (var3 == 67) {
						field490 = arg0.method422();
					} else if (var3 == 68) {
						field529 = arg0.method422();
					} else if (var3 == 69) {
						field518 = arg0.method420();
					} else if (var3 == 70) {
						field514 = arg0.method423();
					} else if (var3 == 71) {
						field513 = arg0.method423();
					} else if (var3 == 72) {
						field495 = arg0.method423();
					} else if (var3 == 73) {
						field535 = true;
					} else if (var3 == 74) {
						field504 = true;
					} else if (var3 == 75) {
						field515 = arg0.method420();
					} else if (var3 == 77) {
						field493 = arg0.method422();
						if (field493 == 0xFFFF) {
							field493 = -1;
						}

						field528 = arg0.method422();
						if (field528 == 0xFFFF) {
							field528 = -1;
						}

						int var10 = arg0.method420();
						field531 = new int[var10 + 1];
						for (int var11 = 0; var11 <= var10; var11++) {
							field531[var11] = arg0.method422();
							if (field531[var11] == 0xFFFF) {
								field531[var11] = -1;
							}
						}
					}
				}

				var4 = arg0.method420();
			} while (var4 <= 0);

			if (field507 == null || field522) {
				field519 = new int[var4];
				field507 = new int[var4];
				for (int var5 = 0; var5 < var4; var5++) {
					field507[var5] = arg0.method422();
					field519[var5] = arg0.method420();
				}
			} else {
				arg0.field1082 += var4 * 3;
			}
		}
	}

	@ObfuscatedName("CSTFGNEK.a(Z)LCSTFGNEK;")
	public final CSTFGNEK method212() {
		int var1 = -1;
		if (field493 != -1) {
			GDBQCAOA var2 = GDBQCAOA.field701[field493];
			int var3 = var2.field703;
			int var4 = var2.field704;
			int var5 = var2.field705;
			int var6 = client.field184[var5 - var4];
			var1 = field502.field322[var3] >> var4 & var6;
		} else if (field528 != -1) {
			var1 = field502.field322[field528];
		}

		if (var1 >= 0 && var1 < field531.length && field531[var1] != -1) {
			return method219(field531[var1]);
		}

		return null;
	}

	@ObfuscatedName("CSTFGNEK.a(IIBI)LPOJFANDE;")
	public final POJFANDE method213(int arg0, int arg1, int arg2) {
		POJFANDE var4 = null;
		long var5;
		if (field519 == null) {
			if (arg0 != 10) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field506 << 6) + arg1);
			POJFANDE var7 = (POJFANDE) field511.method599(var5);
			if (var7 != null) {
				return var7;
			}

			if (field507 == null) {
				return null;
			}

			boolean var8 = field521 ^ arg1 > 3;
			int var9 = field507.length;
			for (int var10 = 0; var10 < var9; var10++) {
				int var11 = field507[var10];
				if (var8) {
					var11 += 0x10000;
				}

				var4 = (POJFANDE) field503.method599(var11);
				if (var4 == null) {
					var4 = POJFANDE.method460(var11 & 0xFFFF);
					if (var4 == null) {
						return null;
					}

					if (var8) {
						var4.method475();
					}

					field503.method600(var4, var11);
				}

				if (var9 > 1) {
					field509[var10] = var4;
				}
			}

			if (var9 > 1) {
				var4 = new POJFANDE(var9, field509);
			}
		} else {
			int var12 = -1;
			for (int var13 = 0; var13 < field519.length; var13++) {
				if (field519[var13] == arg0) {
					var12 = var13;
					break;
				}
			}

			if (var12 == -1) {
				return null;
			}

			var5 = ((long) (arg2 + 1) << 32) + ((field506 << 6) + (var12 << 3) + arg1);
			POJFANDE var14 = (POJFANDE) field511.method599(var5);
			if (var14 != null) {
				return var14;
			}

			int var15 = field507[var12];
			boolean var16 = field521 ^ arg1 > 3;
			if (var16) {
				var15 += 0x10000;
			}

			var4 = (POJFANDE) field503.method599(var15);
			if (var4 == null) {
				var4 = POJFANDE.method460(var15 & 0xFFFF);
				if (var4 == null) {
					return null;
				}

				if (var16) {
					var4.method475();
				}

				field503.method600(var4, var15);
			}
		}

		boolean var17;
		if (field517 == 128 && field500 == 128 && field490 == 128) {
			var17 = false;
		} else {
			var17 = true;
		}

		boolean var18;
		if (field514 == 0 && field513 == 0 && field495 == 0) {
			var18 = false;
		} else {
			var18 = true;
		}

		POJFANDE var19 = new POJFANDE(HVIFHYEW.method287(arg2), field523 == null, arg1 == 0 && arg2 == -1 && !var17 && !var18, var4);
		if (arg2 != -1) {
			var19.method467();
			var19.method468(arg2);
			var19.field1131 = null;
			var19.field1130 = null;
		}

		while (arg1-- > 0) {
			var19.method471();
		}

		if (field523 != null) {
			for (int var20 = 0; var20 < field523.length; var20++) {
				var19.method474(field523[var20], field498[var20]);
			}
		}

		if (var17) {
			var19.method476(field500, field490, field517);
		}

		if (var18) {
			var19.method473(field513, field514, field495);
		}

		var19.method477(field534 + 64, field489 * 5 + 768, -50, -10, -50, !field526);

		if (field515 == 1) {
			var19.field1127 = var19.field1277;
		}

		field511.method600(var19, var5);
		return var19;
	}

	@ObfuscatedName("CSTFGNEK.a()V")
	public final void method214() {
		field507 = null;
		field519 = null;
		field501 = null;
		field508 = null;
		field523 = null;
		field498 = null;
		field527 = 1;
		field533 = 1;
		field491 = true;
		field499 = true;
		field524 = false;
		field510 = false;
		field526 = false;
		field520 = false;
		field505 = -1;
		field512 = 16;
		field534 = 0;
		field489 = 0;
		field492 = null;
		field496 = -1;
		field529 = -1;
		field521 = false;
		field494 = true;
		field517 = 128;
		field500 = 128;
		field490 = 128;
		field518 = 0;
		field514 = 0;
		field513 = 0;
		field495 = 0;
		field535 = false;
		field504 = false;
		field515 = -1;
		field493 = -1;
		field528 = -1;
		field531 = null;
	}

	@ObfuscatedName("CSTFGNEK.a(IB)Z")
	public final boolean method215(int arg0) {
		if (field519 != null) {
			for (int var4 = 0; var4 < field519.length; var4++) {
				if (field519[var4] == arg0) {
					return POJFANDE.method461(field507[var4] & 0xFFFF);
				}
			}

			return true;
		}

		if (field507 == null) {
			return true;
		}

		if (arg0 == 10) {
			boolean var2 = true;
			for (int var3 = 0; var3 < field507.length; var3++) {
				var2 &= POJFANDE.method461(field507[var3] & 0xFFFF);
			}

			return var2;
		}

		return true;
	}

	@ObfuscatedName("CSTFGNEK.b(I)V")
	public static final void method216() {
		field503 = null;
		field511 = null;
		field497 = null;
		field532 = null;
		field530 = null;
	}

	@ObfuscatedName("CSTFGNEK.a(IIIIIII)LPOJFANDE;")
	public final POJFANDE method217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		POJFANDE var8 = method213(arg0, arg1, arg6);
		if (var8 == null) {
			return null;
		}

		if (field510 || field526) {
			var8 = new POJFANDE(field526, var8, field510);
		}

		if (field510) {
			int var9 = (arg2 + arg3 + arg4 + arg5) / 4;
			for (int var10 = 0; var10 < var8.field1100; var10++) {
				int var11 = var8.field1101[var10];
				int var12 = var8.field1103[var10];
				int var13 = (arg3 - arg2) * (var11 + 64) / 128 + arg2;
				int var14 = (arg4 - arg5) * (var11 + 64) / 128 + arg5;
				int var15 = (var14 - var13) * (var12 + 64) / 128 + var13;
				var8.field1102[var10] += var15 - var9;
			}

			var8.method465();
		}

		return var8;
	}

	@ObfuscatedName("CSTFGNEK.a(ILDGAWSPEW;)V")
	public final void method218(DGAWSPEW arg0) {
		if (field507 != null) {
			for (int var2 = 0; var2 < field507.length; var2++) {
				arg0.method225(field507[var2] & 0xFFFF, 0);
			}
		}
	}

	@ObfuscatedName("CSTFGNEK.c(I)LCSTFGNEK;")
	public static final CSTFGNEK method219(int arg0) {
		for (int var1 = 0; var1 < 20; var1++) {
			if (field532[var1].field506 == arg0) {
				return field532[var1];
			}
		}

		field516 = (field516 + 1) % 20;
		CSTFGNEK var2 = field532[field516];
		field530.field1082 = field497[arg0];
		var2.field506 = arg0;
		var2.method214();
		var2.method211(field530);
		return var2;
	}

	@ObfuscatedName("CSTFGNEK.a(LQDHHNYHL;)V")
	public static final void method220(QDHHNYHL arg0) {
		field530 = new PGNBHFUF(arg0.method488("loc.dat", null));
		PGNBHFUF var1 = new PGNBHFUF(arg0.method488("loc.idx", null));
		field525 = var1.method422();
		field497 = new int[field525];
		int var2 = 2;
		for (int var3 = 0; var3 < field525; var3++) {
			field497[var3] = var2;
			var2 += var1.method422();
		}

		field532 = new CSTFGNEK[20];
		for (int var4 = 0; var4 < 20; var4++) {
			field532[var4] = new CSTFGNEK();
		}
	}
}
