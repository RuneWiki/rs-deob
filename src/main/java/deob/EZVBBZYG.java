package deob;

@ObfuscatedName("EZVBBZYG")
public final class EZVBBZYG {

	@ObfuscatedName("EZVBBZYG.E")
	public int field782;

	@ObfuscatedName("EZVBBZYG.F")
	public int field783;

	@ObfuscatedName("EZVBBZYG.c")
	public int[][][] field761;

	@ObfuscatedName("EZVBBZYG.m")
	public byte[][][] field768;

	@ObfuscatedName("EZVBBZYG.f")
	public byte[][][] field763;

	@ObfuscatedName("EZVBBZYG.o")
	public byte[][][] field770;

	@ObfuscatedName("EZVBBZYG.z")
	public byte[][][] field779;

	@ObfuscatedName("EZVBBZYG.p")
	public byte[][][] field771;

	@ObfuscatedName("EZVBBZYG.A")
	public int[][][] field780;

	@ObfuscatedName("EZVBBZYG.e")
	public byte[][][] field762;

	@ObfuscatedName("EZVBBZYG.i")
	public int[][] field765;

	@ObfuscatedName("EZVBBZYG.t")
	public int[] field774;

	@ObfuscatedName("EZVBBZYG.u")
	public int[] field775;

	@ObfuscatedName("EZVBBZYG.v")
	public int[] field776;

	@ObfuscatedName("EZVBBZYG.w")
	public int[] field777;

	@ObfuscatedName("EZVBBZYG.x")
	public int[] field778;

	@ObfuscatedName("EZVBBZYG.b")
	public static final int[] field760 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("EZVBBZYG.h")
	public static final int[] field764 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("EZVBBZYG.l")
	public static boolean field767 = true;

	@ObfuscatedName("EZVBBZYG.s")
	public static final int[] field773 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("EZVBBZYG.D")
	public static int field781 = 99;

	@ObfuscatedName("EZVBBZYG.G")
	public static final int[] field784 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("EZVBBZYG.j")
	public static int field766 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("EZVBBZYG.r")
	public static int field772 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("EZVBBZYG.n")
	public static int field769;

	@ObfuscatedName("EZVBBZYG.a(II)I")
	public static final int method254(int arg0, int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}

		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}

		return (arg0 & 0xFF80) + arg1;
	}

	@ObfuscatedName("EZVBBZYG.a([LCRVZDSLK;IIIIIBI[BLRHXAQRFP;I)V")
	public final void method255(CRVZDSLK[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, RHXAQRFP arg8, int arg9) {
		LBBVYYXO var11 = new LBBVYYXO(arg7);
		int var12 = -1;
		while (true) {
			int var13 = var11.method383();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method383();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method369();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg4 == var18 && var17 >= arg2 && var17 < arg2 + 8 && var16 >= arg9 && var16 < arg9 + 8) {
					LXNLNZCU var22 = LXNLNZCU.method409(var12);
					int var23 = arg1 + KTWDNTZZ.method355(var17 & 0x7, var22.field950, var16 & 0x7, arg6, var22.field930, var21);
					int var24 = arg3 + KTWDNTZZ.method356(arg6, var16 & 0x7, var21, var17 & 0x7, var22.field950, var22.field930);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg5;
						if ((field768[1][var23][var24] & 0x2) == 2) {
							var25 = arg5 - 1;
						}

						CRVZDSLK var26 = null;
						if (var25 >= 0) {
							var26 = arg0[var25];
						}

						method256(arg6 + var21 & 0x3, var23, var12, var26, var24, arg5, arg8, var20);
					}
				}
			}
		}
	}

	@ObfuscatedName("EZVBBZYG.a(IBIILCRVZDSLK;IILRHXAQRFP;I)V")
	public final void method256(int arg0, int arg1, int arg2, CRVZDSLK arg3, int arg4, int arg5, RHXAQRFP arg6, int arg7) {
		if (field767 && (field768[0][arg1][arg4] & 0x2) == 0) {
			if ((field768[arg5][arg1][arg4] & 0x10) != 0) {
				return;
			}

			if (method274(arg1, arg4, arg5) != field769) {
				return;
			}
		}

		if (arg5 < field781) {
			field781 = arg5;
		}

		int var9 = field761[arg5][arg1][arg4];
		int var10 = field761[arg5][arg1 + 1][arg4];
		int var11 = field761[arg5][arg1 + 1][arg4 + 1];
		int var12 = field761[arg5][arg1][arg4 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		LXNLNZCU var14 = LXNLNZCU.method409(arg2);
		int var15 = (arg2 << 14) + (arg4 << 7) + arg1 + 0x40000000;
		if (!var14.field924) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg0 << 6) + arg7);
		if (arg7 == 22) {
			if (!field767 || var14.field924 || var14.field925) {
				TDBSBQNI var17;
				if (var14.field949 == -1 && var14.field927 == null) {
					var17 = var14.method419(22, arg0, var9, var10, var11, var12, -1);
				} else {
					var17 = new EAOLBHVU(var10, var14.field949, var12, arg0, var9, 22, true, arg2, var11);
				}

				arg6.method477(var17, arg4, arg5, var15, arg1, var16, var13);

				if (var14.field910 && var14.field924 && arg3 != null) {
					arg3.method160(arg1, arg4);
				}
			}
		} else if (arg7 == 10 || arg7 == 11) {
			TDBSBQNI var18;
			if (var14.field949 == -1 && var14.field927 == null) {
				var18 = var14.method419(10, arg0, var9, var10, var11, var12, -1);
			} else {
				var18 = new EAOLBHVU(var10, var14.field949, var12, arg0, var9, 10, true, arg2, var11);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg7 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg0 == 1 || arg0 == 3) {
					var20 = var14.field950;
					var21 = var14.field930;
				} else {
					var20 = var14.field930;
					var21 = var14.field950;
				}

				if (arg6.method481(var21, var18, var20, var15, var13, var19, var16, arg5, arg4, arg1) && var14.field915) {
					CYPZUKMB var22;
					if (var18 instanceof CYPZUKMB) {
						var22 = (CYPZUKMB) var18;
					} else {
						var22 = var14.method419(10, arg0, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field566 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field762[arg5][arg1 + var23][arg4 + var24]) {
									field762[arg5][arg1 + var23][arg4 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field910 && arg3 != null) {
				arg3.method159(arg1, arg0, var14.field930, var14.field950, var14.field923, arg4);
			}
		} else if (arg7 >= 12) {
			TDBSBQNI var26;
			if (var14.field949 == -1 && var14.field927 == null) {
				var26 = var14.method419(arg7, arg0, var9, var10, var11, var12, -1);
			} else {
				var26 = new EAOLBHVU(var10, var14.field949, var12, arg0, var9, arg7, true, arg2, var11);
			}

			arg6.method481(1, var26, 1, var15, var13, 0, var16, arg5, arg4, arg1);

			if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg5 > 0) {
				field780[arg5][arg1][arg4] |= 0x924;
			}

			if (var14.field910 && arg3 != null) {
				arg3.method159(arg1, arg0, var14.field930, var14.field950, var14.field923, arg4);
			}
		} else if (arg7 == 0) {
			TDBSBQNI var27;
			if (var14.field949 == -1 && var14.field927 == null) {
				var27 = var14.method419(0, arg0, var9, var10, var11, var12, -1);
			} else {
				var27 = new EAOLBHVU(var10, var14.field949, var12, arg0, var9, 0, true, arg2, var11);
			}

			arg6.method479(arg5, 0, arg4, null, field760[arg0], var13, var15, var27, var16, arg1);

			if (arg0 == 0) {
				if (var14.field915) {
					field762[arg5][arg1][arg4] = 50;
					field762[arg5][arg1][arg4 + 1] = 50;
				}

				if (var14.field943) {
					field780[arg5][arg1][arg4] |= 0x249;
				}
			} else if (arg0 == 1) {
				if (var14.field915) {
					field762[arg5][arg1][arg4 + 1] = 50;
					field762[arg5][arg1 + 1][arg4 + 1] = 50;
				}

				if (var14.field943) {
					field780[arg5][arg1][arg4 + 1] |= 0x492;
				}
			} else if (arg0 == 2) {
				if (var14.field915) {
					field762[arg5][arg1 + 1][arg4] = 50;
					field762[arg5][arg1 + 1][arg4 + 1] = 50;
				}

				if (var14.field943) {
					field780[arg5][arg1 + 1][arg4] |= 0x249;
				}
			} else if (arg0 == 3) {
				if (var14.field915) {
					field762[arg5][arg1][arg4] = 50;
					field762[arg5][arg1 + 1][arg4] = 50;
				}

				if (var14.field943) {
					field780[arg5][arg1][arg4] |= 0x492;
				}
			}

			if (var14.field910 && arg3 != null) {
				arg3.method158(arg0, var14.field923, arg4, arg7, arg1);
			}

			if (var14.field921 != 16) {
				arg6.method487(var14.field921, arg1, arg4, arg5);
			}
		} else if (arg7 == 1) {
			TDBSBQNI var28;
			if (var14.field949 == -1 && var14.field927 == null) {
				var28 = var14.method419(1, arg0, var9, var10, var11, var12, -1);
			} else {
				var28 = new EAOLBHVU(var10, var14.field949, var12, arg0, var9, 1, true, arg2, var11);
			}

			arg6.method479(arg5, 0, arg4, null, field773[arg0], var13, var15, var28, var16, arg1);

			if (var14.field915) {
				if (arg0 == 0) {
					field762[arg5][arg1][arg4 + 1] = 50;
				} else if (arg0 == 1) {
					field762[arg5][arg1 + 1][arg4 + 1] = 50;
				} else if (arg0 == 2) {
					field762[arg5][arg1 + 1][arg4] = 50;
				} else if (arg0 == 3) {
					field762[arg5][arg1][arg4] = 50;
				}
			}

			if (var14.field910 && arg3 != null) {
				arg3.method158(arg0, var14.field923, arg4, arg7, arg1);
			}
		} else if (arg7 == 2) {
			int var29 = arg0 + 1 & 0x3;
			TDBSBQNI var30;
			TDBSBQNI var31;
			if (var14.field949 == -1 && var14.field927 == null) {
				var30 = var14.method419(2, arg0 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method419(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new EAOLBHVU(var10, var14.field949, var12, arg0 + 4, var9, 2, true, arg2, var11);
				var31 = new EAOLBHVU(var10, var14.field949, var12, var29, var9, 2, true, arg2, var11);
			}

			arg6.method479(arg5, field760[var29], arg4, var31, field760[arg0], var13, var15, var30, var16, arg1);

			if (var14.field943) {
				if (arg0 == 0) {
					field780[arg5][arg1][arg4] |= 0x249;
					field780[arg5][arg1][arg4 + 1] |= 0x492;
				} else if (arg0 == 1) {
					field780[arg5][arg1][arg4 + 1] |= 0x492;
					field780[arg5][arg1 + 1][arg4] |= 0x249;
				} else if (arg0 == 2) {
					field780[arg5][arg1 + 1][arg4] |= 0x249;
					field780[arg5][arg1][arg4] |= 0x492;
				} else if (arg0 == 3) {
					field780[arg5][arg1][arg4] |= 0x492;
					field780[arg5][arg1][arg4] |= 0x249;
				}
			}

			if (var14.field910 && arg3 != null) {
				arg3.method158(arg0, var14.field923, arg4, arg7, arg1);
			}

			if (var14.field921 != 16) {
				arg6.method487(var14.field921, arg1, arg4, arg5);
			}
		} else if (arg7 == 3) {
			TDBSBQNI var32;
			if (var14.field949 == -1 && var14.field927 == null) {
				var32 = var14.method419(3, arg0, var9, var10, var11, var12, -1);
			} else {
				var32 = new EAOLBHVU(var10, var14.field949, var12, arg0, var9, 3, true, arg2, var11);
			}

			arg6.method479(arg5, 0, arg4, null, field773[arg0], var13, var15, var32, var16, arg1);

			if (var14.field915) {
				if (arg0 == 0) {
					field762[arg5][arg1][arg4 + 1] = 50;
				} else if (arg0 == 1) {
					field762[arg5][arg1 + 1][arg4 + 1] = 50;
				} else if (arg0 == 2) {
					field762[arg5][arg1 + 1][arg4] = 50;
				} else if (arg0 == 3) {
					field762[arg5][arg1][arg4] = 50;
				}
			}

			if (var14.field910 && arg3 != null) {
				arg3.method158(arg0, var14.field923, arg4, arg7, arg1);
			}
		} else if (arg7 == 9) {
			TDBSBQNI var33;
			if (var14.field949 == -1 && var14.field927 == null) {
				var33 = var14.method419(arg7, arg0, var9, var10, var11, var12, -1);
			} else {
				var33 = new EAOLBHVU(var10, var14.field949, var12, arg0, var9, arg7, true, arg2, var11);
			}

			arg6.method481(1, var33, 1, var15, var13, 0, var16, arg5, arg4, arg1);

			if (var14.field910 && arg3 != null) {
				arg3.method159(arg1, arg0, var14.field930, var14.field950, var14.field923, arg4);
			}
		} else {
			if (var14.field955) {
				if (arg0 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg0 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg0 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg7 == 4) {
				TDBSBQNI var38;
				if (var14.field949 == -1 && var14.field927 == null) {
					var38 = var14.method419(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new EAOLBHVU(var10, var14.field949, var12, 0, var9, 4, true, arg2, var11);
				}

				arg6.method480(var13, var38, 0, arg4, field760[arg0], var16, 0, var15, arg5, arg0 * 512, arg1);
			} else if (arg7 == 5) {
				int var39 = 16;
				int var40 = arg6.method497(arg5, arg1, arg4);
				if (var40 > 0) {
					var39 = LXNLNZCU.method409(var40 >> 14 & 0x7FFF).field921;
				}

				TDBSBQNI var41;
				if (var14.field949 == -1 && var14.field927 == null) {
					var41 = var14.method419(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new EAOLBHVU(var10, var14.field949, var12, 0, var9, 4, true, arg2, var11);
				}

				arg6.method480(var13, var41, field784[arg0] * var39, arg4, field760[arg0], var16, field764[arg0] * var39, var15, arg5, arg0 * 512, arg1);
			} else if (arg7 == 6) {
				TDBSBQNI var42;
				if (var14.field949 == -1 && var14.field927 == null) {
					var42 = var14.method419(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new EAOLBHVU(var10, var14.field949, var12, 0, var9, 4, true, arg2, var11);
				}

				arg6.method480(var13, var42, 0, arg4, 256, var16, 0, var15, arg5, arg0, arg1);
			} else if (arg7 == 7) {
				TDBSBQNI var43;
				if (var14.field949 == -1 && var14.field927 == null) {
					var43 = var14.method419(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new EAOLBHVU(var10, var14.field949, var12, 0, var9, 4, true, arg2, var11);
				}

				arg6.method480(var13, var43, 0, arg4, 512, var16, 0, var15, arg5, arg0, arg1);
			} else if (arg7 == 8) {
				TDBSBQNI var44;
				if (var14.field949 == -1 && var14.field927 == null) {
					var44 = var14.method419(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new EAOLBHVU(var10, var14.field949, var12, 0, var9, 4, true, arg2, var11);
				}

				arg6.method480(var13, var44, 0, arg4, 768, var16, 0, var15, arg5, arg0, arg1);
			}
		}
	}

	@ObfuscatedName("EZVBBZYG.a(I[[[IZIIILCRVZDSLK;IILRHXAQRFP;I)V")
	public static final void method257(int arg0, int[][][] arg1, int arg2, int arg3, int arg4, CRVZDSLK arg5, int arg6, int arg7, RHXAQRFP arg8, int arg9) {
		int var10 = arg1[arg3][arg9][arg6];
		int var11 = arg1[arg3][arg9 + 1][arg6];
		int var12 = arg1[arg3][arg9 + 1][arg6 + 1];
		int var13 = arg1[arg3][arg9][arg6 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		LXNLNZCU var15 = LXNLNZCU.method409(arg7);
		int var16 = (arg7 << 14) + (arg6 << 7) + arg9 + 0x40000000;
		if (!var15.field924) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg0 << 6) + arg4);
		if (arg4 == 22) {
			TDBSBQNI var18;
			if (var15.field949 == -1 && var15.field927 == null) {
				var18 = var15.method419(22, arg0, var10, var11, var12, var13, -1);
			} else {
				var18 = new EAOLBHVU(var11, var15.field949, var13, arg0, var10, 22, true, arg7, var12);
			}

			arg8.method477(var18, arg6, arg2, var16, arg9, var17, var14);

			if (var15.field910 && var15.field924) {
				arg5.method160(arg9, arg6);
			}
		} else if (arg4 == 10 || arg4 == 11) {
			TDBSBQNI var19;
			if (var15.field949 == -1 && var15.field927 == null) {
				var19 = var15.method419(10, arg0, var10, var11, var12, var13, -1);
			} else {
				var19 = new EAOLBHVU(var11, var15.field949, var13, arg0, var10, 10, true, arg7, var12);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg4 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg0 == 1 || arg0 == 3) {
					var21 = var15.field950;
					var22 = var15.field930;
				} else {
					var21 = var15.field930;
					var22 = var15.field950;
				}

				arg8.method481(var22, var19, var21, var16, var14, var20, var17, arg2, arg6, arg9);
			}

			if (var15.field910) {
				arg5.method159(arg9, arg0, var15.field930, var15.field950, var15.field923, arg6);
			}
		} else if (arg4 >= 12) {
			TDBSBQNI var23;
			if (var15.field949 == -1 && var15.field927 == null) {
				var23 = var15.method419(arg4, arg0, var10, var11, var12, var13, -1);
			} else {
				var23 = new EAOLBHVU(var11, var15.field949, var13, arg0, var10, arg4, true, arg7, var12);
			}

			arg8.method481(1, var23, 1, var16, var14, 0, var17, arg2, arg6, arg9);

			if (var15.field910) {
				arg5.method159(arg9, arg0, var15.field930, var15.field950, var15.field923, arg6);
			}
		} else if (arg4 == 0) {
			TDBSBQNI var24;
			if (var15.field949 == -1 && var15.field927 == null) {
				var24 = var15.method419(0, arg0, var10, var11, var12, var13, -1);
			} else {
				var24 = new EAOLBHVU(var11, var15.field949, var13, arg0, var10, 0, true, arg7, var12);
			}

			arg8.method479(arg2, 0, arg6, null, field760[arg0], var14, var16, var24, var17, arg9);

			if (var15.field910) {
				arg5.method158(arg0, var15.field923, arg6, arg4, arg9);
			}
		} else if (arg4 == 1) {
			TDBSBQNI var25;
			if (var15.field949 == -1 && var15.field927 == null) {
				var25 = var15.method419(1, arg0, var10, var11, var12, var13, -1);
			} else {
				var25 = new EAOLBHVU(var11, var15.field949, var13, arg0, var10, 1, true, arg7, var12);
			}

			arg8.method479(arg2, 0, arg6, null, field773[arg0], var14, var16, var25, var17, arg9);

			if (var15.field910) {
				arg5.method158(arg0, var15.field923, arg6, arg4, arg9);
			}
		} else if (arg4 == 2) {
			int var26 = arg0 + 1 & 0x3;
			TDBSBQNI var27;
			TDBSBQNI var28;
			if (var15.field949 == -1 && var15.field927 == null) {
				var27 = var15.method419(2, arg0 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method419(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new EAOLBHVU(var11, var15.field949, var13, arg0 + 4, var10, 2, true, arg7, var12);
				var28 = new EAOLBHVU(var11, var15.field949, var13, var26, var10, 2, true, arg7, var12);
			}

			arg8.method479(arg2, field760[var26], arg6, var28, field760[arg0], var14, var16, var27, var17, arg9);

			if (var15.field910) {
				arg5.method158(arg0, var15.field923, arg6, arg4, arg9);
			}
		} else if (arg4 == 3) {
			TDBSBQNI var29;
			if (var15.field949 == -1 && var15.field927 == null) {
				var29 = var15.method419(3, arg0, var10, var11, var12, var13, -1);
			} else {
				var29 = new EAOLBHVU(var11, var15.field949, var13, arg0, var10, 3, true, arg7, var12);
			}

			arg8.method479(arg2, 0, arg6, null, field773[arg0], var14, var16, var29, var17, arg9);

			if (var15.field910) {
				arg5.method158(arg0, var15.field923, arg6, arg4, arg9);
			}
		} else if (arg4 == 9) {
			TDBSBQNI var30;
			if (var15.field949 == -1 && var15.field927 == null) {
				var30 = var15.method419(arg4, arg0, var10, var11, var12, var13, -1);
			} else {
				var30 = new EAOLBHVU(var11, var15.field949, var13, arg0, var10, arg4, true, arg7, var12);
			}

			arg8.method481(1, var30, 1, var16, var14, 0, var17, arg2, arg6, arg9);

			if (var15.field910) {
				arg5.method159(arg9, arg0, var15.field930, var15.field950, var15.field923, arg6);
			}
		} else {
			if (var15.field955) {
				if (arg0 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg0 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg0 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg4 == 4) {
				TDBSBQNI var35;
				if (var15.field949 == -1 && var15.field927 == null) {
					var35 = var15.method419(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new EAOLBHVU(var11, var15.field949, var13, 0, var10, 4, true, arg7, var12);
				}

				arg8.method480(var14, var35, 0, arg6, field760[arg0], var17, 0, var16, arg2, arg0 * 512, arg9);
			} else if (arg4 == 5) {
				int var36 = 16;
				int var37 = arg8.method497(arg2, arg9, arg6);
				if (var37 > 0) {
					var36 = LXNLNZCU.method409(var37 >> 14 & 0x7FFF).field921;
				}

				TDBSBQNI var38;
				if (var15.field949 == -1 && var15.field927 == null) {
					var38 = var15.method419(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new EAOLBHVU(var11, var15.field949, var13, 0, var10, 4, true, arg7, var12);
				}

				arg8.method480(var14, var38, field784[arg0] * var36, arg6, field760[arg0], var17, field764[arg0] * var36, var16, arg2, arg0 * 512, arg9);
			} else if (arg4 == 6) {
				TDBSBQNI var39;
				if (var15.field949 == -1 && var15.field927 == null) {
					var39 = var15.method419(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new EAOLBHVU(var11, var15.field949, var13, 0, var10, 4, true, arg7, var12);
				}

				arg8.method480(var14, var39, 0, arg6, 256, var17, 0, var16, arg2, arg0, arg9);
			} else if (arg4 == 7) {
				TDBSBQNI var40;
				if (var15.field949 == -1 && var15.field927 == null) {
					var40 = var15.method419(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new EAOLBHVU(var11, var15.field949, var13, 0, var10, 4, true, arg7, var12);
				}

				arg8.method480(var14, var40, 0, arg6, 512, var17, 0, var16, arg2, arg0, arg9);
			} else if (arg4 == 8) {
				TDBSBQNI var41;
				if (var15.field949 == -1 && var15.field927 == null) {
					var41 = var15.method419(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new EAOLBHVU(var11, var15.field949, var13, 0, var10, 4, true, arg7, var12);
				}

				arg8.method480(var14, var41, 0, arg6, 768, var17, 0, var16, arg2, arg0, arg9);
			}
		}
	}

	@ObfuscatedName("EZVBBZYG.a(III)I")
	public static final int method258(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method262(var3, var5);
		int var8 = method262(var3 + 1, var5);
		int var9 = method262(var3, var5 + 1);
		int var10 = method262(var3 + 1, var5 + 1);
		int var11 = method263(var7, var8, var4, arg2);
		int var12 = method263(var9, var10, var4, arg2);
		return method263(var11, var12, var6, arg2);
	}

	@ObfuscatedName("EZVBBZYG.a(I[LCRVZDSLK;[BIIIIIII)V")
	public final void method259(int arg0, CRVZDSLK[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg8 + var10 > 0 && arg8 + var10 < 103 && arg5 + var11 > 0 && arg5 + var11 < 103) {
					arg1[arg7].field505[arg8 + var10][arg5 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		LBBVYYXO var12 = new LBBVYYXO(arg2);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg4 == var13 && var14 >= arg3 && var14 < arg3 + 8 && var15 >= arg0 && var15 < arg0 + 8) {
						method267(0, arg6, arg8 + KTWDNTZZ.method353(var15 & 0x7, arg6, var14 & 0x7), 0, var12, arg5 + KTWDNTZZ.method354(var14 & 0x7, arg6, var15 & 0x7), arg7);
					} else {
						method267(0, 0, -1, 0, var12, -1, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("EZVBBZYG.a(LEBLTOQBO;BLLBBVYYXO;)V")
	public static final void method260(EBLTOQBO arg0, LBBVYYXO arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method383();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			LXNLNZCU var4 = LXNLNZCU.method409(var2);
			var4.method418(arg0);

			while (true) {
				int var5 = arg1.method383();
				if (var5 == 0) {
					break;
				}

				arg1.method369();
			}
		}
	}

	@ObfuscatedName("EZVBBZYG.a(ZIII)V")
	public final void method261(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field761[arg0][arg2 + var4][arg1 + var5] = 0;
			}
		}

		if (arg2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field761[arg0][arg2][arg1 + var6] = field761[arg0][arg2 - 1][arg1 + var6];
			}
		}

		if (arg1 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field761[arg0][arg2 + var7][arg1] = field761[arg0][arg2 + var7][arg1 - 1];
			}
		}

		if (arg2 > 0 && field761[arg0][arg2 - 1][arg1] != 0) {
			field761[arg0][arg2][arg1] = field761[arg0][arg2 - 1][arg1];
		} else if (arg1 > 0 && field761[arg0][arg2][arg1 - 1] != 0) {
			field761[arg0][arg2][arg1] = field761[arg0][arg2][arg1 - 1];
		} else if (arg2 > 0 && arg1 > 0 && field761[arg0][arg2 - 1][arg1 - 1] != 0) {
			field761[arg0][arg2][arg1] = field761[arg0][arg2 - 1][arg1 - 1];
		}
	}

	@ObfuscatedName("EZVBBZYG.b(II)I")
	public static final int method262(int arg0, int arg1) {
		int var2 = method265(arg0 - 1, arg1 - 1) + method265(arg0 + 1, arg1 - 1) + method265(arg0 - 1, arg1 + 1) + method265(arg0 + 1, arg1 + 1);
		int var3 = method265(arg0 - 1, arg1) + method265(arg0 + 1, arg1) + method265(arg0, arg1 - 1) + method265(arg0, arg1 + 1);
		int var4 = method265(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("EZVBBZYG.a(IIII)I")
	public static final int method263(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - CUNPUNFW.field516[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("EZVBBZYG.b(III)Z")
	public static final boolean method264(int arg0, int arg1) {
		LXNLNZCU var2 = LXNLNZCU.method409(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method410(arg0);
	}

	@ObfuscatedName("EZVBBZYG.c(II)I")
	public static final int method265(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("EZVBBZYG.a(II[BI)Z")
	public static final boolean method266(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		LBBVYYXO var4 = new LBBVYYXO(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method383();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method383();
					if (var9 == 0) {
						break;
					}

					var4.method369();
				} else {
					int var10 = var4.method383();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method369() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						LXNLNZCU var16 = LXNLNZCU.method409(var5);
						if (var13 != 22 || !field767 || var16.field924 || var16.field925) {
							var3 &= var16.method417();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("EZVBBZYG.a(IIIIZLLBBVYYXO;II)V")
	public final void method267(int arg0, int arg1, int arg2, int arg3, LBBVYYXO arg4, int arg5, int arg6) {
		if (arg2 >= 0 && arg2 < 104 && arg5 >= 0 && arg5 < 104) {
			field768[arg6][arg2][arg5] = 0;
			while (true) {
				int var8 = arg4.method369();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg4.method369();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg6 == 0) {
						field761[0][arg2][arg5] = -var9 * 8;
						return;
					}

					field761[arg6][arg2][arg5] = field761[arg6 - 1][arg2][arg5] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field770[arg6][arg2][arg5] = arg4.method370();
					field779[arg6][arg2][arg5] = (byte) ((var8 - 2) / 4);
					field771[arg6][arg2][arg5] = (byte) (var8 + arg1 - 2 & 0x3);
				} else if (var8 <= 81) {
					field768[arg6][arg2][arg5] = (byte) (var8 - 49);
				} else {
					field763[arg6][arg2][arg5] = (byte) (var8 - 81);
				}
			}

			if (arg6 == 0) {
				field761[0][arg2][arg5] = -method269(arg2 + arg3 + 932731, arg5 + 556238 + arg0) * 8;
			} else {
				field761[arg6][arg2][arg5] = field761[arg6 - 1][arg2][arg5] - 240;
			}
		} else {
			while (true) {
				int var10 = arg4.method369();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg4.method369();
					return;
				}

				if (var10 <= 49) {
					arg4.method369();
				}
			}
		}
	}

	@ObfuscatedName("EZVBBZYG.a(IZILRHXAQRFP;[B[LCRVZDSLK;)V")
	public final void method268(int arg0, int arg1, RHXAQRFP arg2, byte[] arg3, CRVZDSLK[] arg4) {
		LBBVYYXO var6 = new LBBVYYXO(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method383();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method383();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method369();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg1 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field768[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					CRVZDSLK var20 = null;
					if (var19 >= 0) {
						var20 = arg4[var19];
					}

					method256(var16, var17, var7, var20, var18, var13, arg2, var15);
				}
			}
		}
	}

	public EZVBBZYG(byte[][][] arg0, int arg1, int[][][] arg2, int arg3) {
		field781 = 99;
		field782 = arg3;
		field783 = arg1;
		field761 = arg2;
		field768 = arg0;
		field763 = new byte[4][field782][field783];
		field770 = new byte[4][field782][field783];
		field779 = new byte[4][field782][field783];
		field771 = new byte[4][field782][field783];
		field780 = new int[4][field782 + 1][field783 + 1];
		field762 = new byte[4][field782 + 1][field783 + 1];
		field765 = new int[field782 + 1][field783 + 1];
		field774 = new int[field783];
		field775 = new int[field783];
		field776 = new int[field783];
		field777 = new int[field783];
		field778 = new int[field783];
	}

	@ObfuscatedName("EZVBBZYG.d(II)I")
	public static final int method269(int arg0, int arg1) {
		int var2 = method258(arg0 + 45365, arg1 + 91923, 4) + (method258(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method258(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("EZVBBZYG.c(III)I")
	public final int method270(int arg0, int arg1, int arg2) {
		if (arg2 > 179) {
			arg1 /= 2;
		}

		if (arg2 > 192) {
			arg1 /= 2;
		}

		if (arg2 > 217) {
			arg1 /= 2;
		}

		if (arg2 > 243) {
			arg1 /= 2;
		}

		return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
	}

	@ObfuscatedName("EZVBBZYG.a(IIIII)V")
	public final void method271(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg3; var5 <= arg2 + arg3; var5++) {
			for (int var6 = arg1; var6 <= arg0 + arg1; var6++) {
				if (var6 >= 0 && var6 < field782 && var5 >= 0 && var5 < field783) {
					field762[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field761[0][var6][var5] = field761[0][var6 - 1][var5];
					}

					if (arg0 + arg1 == var6 && var6 < field782 - 1) {
						field761[0][var6][var5] = field761[0][var6 + 1][var5];
					}

					if (arg3 == var5 && var5 > 0) {
						field761[0][var6][var5] = field761[0][var6][var5 - 1];
					}

					if (arg2 + arg3 == var5 && var5 < field783 - 1) {
						field761[0][var6][var5] = field761[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("EZVBBZYG.a(II[LCRVZDSLK;III[B)V")
	public final void method272(int arg0, int arg1, CRVZDSLK[] arg2, int arg3, int arg4, byte[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg4 + var8 > 0 && arg4 + var8 < 103 && arg1 + var9 > 0 && arg1 + var9 < 103) {
						arg2[var7].field505[arg4 + var8][arg1 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		LBBVYYXO var10 = new LBBVYYXO(arg5);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method267(arg0, 0, arg4 + var12, arg3, var10, arg1 + var13, var11);
				}
			}
		}
	}

	@ObfuscatedName("EZVBBZYG.a(LRHXAQRFP;[LCRVZDSLK;Z)V")
	public final void method273(RHXAQRFP arg0, CRVZDSLK[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field768[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field768[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method160(var4, var5);
						}
					}
				}
			}
		}

		field772 += (int) (Math.random() * 5.0D) - 2;
		if (field772 < -8) {
			field772 = -8;
		}

		if (field772 > 8) {
			field772 = 8;
		}

		field766 += (int) (Math.random() * 5.0D) - 2;
		if (field766 < -16) {
			field766 = -16;
		}

		if (field766 > 16) {
			field766 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field762[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field783 - 1; var16++) {
				for (int var17 = 1; var17 < field782 - 1; var17++) {
					int var18 = field761[var7][var17 + 1][var16] - field761[var7][var17 - 1][var16];
					int var19 = field761[var7][var17][var16 + 1] - field761[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field765[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field783; var26++) {
				field774[var26] = 0;
				field775[var26] = 0;
				field776[var26] = 0;
				field777[var26] = 0;
				field778[var26] = 0;
			}

			for (int var27 = -5; var27 < field782 + 5; var27++) {
				for (int var28 = 0; var28 < field783; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field782) {
						int var30 = field763[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							AKWMUTZI var31 = AKWMUTZI.field28[var30 - 1];
							field774[var28] += var31.field37;
							field775[var28] += var31.field35;
							field776[var28] += var31.field36;
							field777[var28] += var31.field38;
							field778[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field782) {
						int var33 = field763[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							AKWMUTZI var34 = AKWMUTZI.field28[var33 - 1];
							field774[var28] -= var34.field37;
							field775[var28] -= var34.field35;
							field776[var28] -= var34.field36;
							field777[var28] -= var34.field38;
							field778[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field782 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field783 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field783) {
							var35 += field774[var41];
							var36 += field775[var41];
							var37 += field776[var41];
							var38 += field777[var41];
							var39 += field778[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field783) {
							var35 -= field774[var42];
							var36 -= field775[var42];
							var37 -= field776[var42];
							var38 -= field777[var42];
							var39 -= field778[var42];
						}

						if (var40 >= 1 && var40 < field783 - 1 && (!field767 || (field768[0][var27][var40] & 0x2) != 0 || (field768[var7][var27][var40] & 0x10) == 0 && method274(var27, var40, var7) == field769)) {
							if (var7 < field781) {
								field781 = var7;
							}

							int var43 = field763[var7][var27][var40] & 0xFF;
							int var44 = field770[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field761[var7][var27][var40];
								int var46 = field761[var7][var27 + 1][var40];
								int var47 = field761[var7][var27 + 1][var40 + 1];
								int var48 = field761[var7][var27][var40 + 1];
								int var49 = field765[var27][var40];
								int var50 = field765[var27 + 1][var40];
								int var51 = field765[var27 + 1][var40 + 1];
								int var52 = field765[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method270(var55, var56, var57);
									var55 = field772 + var55 & 0xFF;
									var57 += field766;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method270(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field779[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !AKWMUTZI.field28[var44 - 1].field33) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field780[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = CUNPUNFW.field527[method254(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method476(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method254(var53, var49), method254(var53, var50), method254(var53, var51), method254(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field779[var7][var27][var40] + 1;
									byte var61 = field771[var7][var27][var40];
									AKWMUTZI var62 = AKWMUTZI.field28[var44 - 1];
									int var63 = var62.field31;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = CUNPUNFW.method175(var63);
										var65 = -1;
									} else if (var62.field30 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = CUNPUNFW.field527[method275(var62.field39, 96)];
									} else {
										var65 = method270(var62.field34, var62.field35, var62.field36);
										var64 = CUNPUNFW.field527[method275(var62.field39, 96)];
									}

									arg0.method476(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method254(var53, var49), method254(var53, var50), method254(var53, var51), method254(var53, var52), method275(var65, var49), method275(var65, var50), method275(var65, var51), method275(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field783 - 1; var66++) {
				for (int var67 = 1; var67 < field782 - 1; var67++) {
					arg0.method475(var7, var67, var66, method274(var67, var66, var7));
				}
			}
		}

		arg0.method502(-10, -50, -50);

		for (int var68 = 0; var68 < field782; var68++) {
			for (int var69 = 0; var69 < field783; var69++) {
				if ((field768[1][var68][var69] & 0x2) == 2) {
					arg0.method473(var68, var69);
				}
			}
		}

		int var70 = 1;
		int var71 = 2;
		int var72 = 4;
		for (int var73 = 0; var73 < 4; var73++) {
			if (var73 > 0) {
				var70 <<= 3;
				var71 <<= 3;
				var72 <<= 3;
			}

			for (int var74 = 0; var74 <= var73; var74++) {
				for (int var75 = 0; var75 <= field783; var75++) {
					for (int var76 = 0; var76 <= field782; var76++) {
						if ((field780[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field780[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field783 && (field780[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field780[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field780[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field761[var80][var76][var77] - var84;
								int var86 = field761[var79][var76][var77];
								RHXAQRFP.method474(var76 * 128, var86, var76 * 128, var78 * 128 + 128, var73, 1, var85, var77 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field780[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field780[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field780[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field782 && (field780[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field780[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field780[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field761[var92][var89][var75] - var96;
								int var98 = field761[var91][var89][var75];
								RHXAQRFP.method474(var90 * 128 + 128, var98, var89 * 128, var75 * 128, var73, 2, var97, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field780[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field780[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field780[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field783 && (field780[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field780[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field782) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field780[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field761[var74][var101][var103];
								RHXAQRFP.method474(var102 * 128 + 128, var107, var101 * 128, var104 * 128 + 128, var73, 4, var107, var103 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field780[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("EZVBBZYG.b(IIII)I")
	public int method274(int arg0, int arg1, int arg2) {
		if ((field768[arg2][arg0][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field768[1][arg0][arg1] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("EZVBBZYG.e(II)I")
	public final int method275(int arg0, int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}

			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}

			return (arg0 & 0xFF80) + arg1;
		}
	}
}
