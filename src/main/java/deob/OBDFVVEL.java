package deob;

@ObfuscatedName("OBDFVVEL")
public final class OBDFVVEL {

	@ObfuscatedName("OBDFVVEL.q")
	public int field952;

	@ObfuscatedName("OBDFVVEL.r")
	public int field953;

	@ObfuscatedName("OBDFVVEL.o")
	public int[][][] field950;

	@ObfuscatedName("OBDFVVEL.F")
	public byte[][][] field964;

	@ObfuscatedName("OBDFVVEL.b")
	public byte[][][] field941;

	@ObfuscatedName("OBDFVVEL.g")
	public byte[][][] field945;

	@ObfuscatedName("OBDFVVEL.j")
	public byte[][][] field947;

	@ObfuscatedName("OBDFVVEL.e")
	public byte[][][] field943;

	@ObfuscatedName("OBDFVVEL.y")
	public int[][][] field959;

	@ObfuscatedName("OBDFVVEL.h")
	public byte[][][] field946;

	@ObfuscatedName("OBDFVVEL.H")
	public int[][] field965;

	@ObfuscatedName("OBDFVVEL.s")
	public int[] field954;

	@ObfuscatedName("OBDFVVEL.t")
	public int[] field955;

	@ObfuscatedName("OBDFVVEL.u")
	public int[] field956;

	@ObfuscatedName("OBDFVVEL.v")
	public int[] field957;

	@ObfuscatedName("OBDFVVEL.w")
	public int[] field958;

	@ObfuscatedName("OBDFVVEL.f")
	public static final int[] field944 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("OBDFVVEL.l")
	public static final int[] field948 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("OBDFVVEL.m")
	public static final int[] field949 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("OBDFVVEL.p")
	public static int field951 = 99;

	@ObfuscatedName("OBDFVVEL.B")
	public static boolean field961 = true;

	@ObfuscatedName("OBDFVVEL.E")
	public static final int[] field963 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("OBDFVVEL.A")
	public static int field960 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("OBDFVVEL.D")
	public static int field962 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("OBDFVVEL.c")
	public static int field942;

	@ObfuscatedName("OBDFVVEL.a(LNQUAUMDT;BLNJYVZTLI;)V")
	public static final void method378(NQUAUMDT arg0, NJYVZTLI arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method353();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			KBTDMRWU var4 = KBTDMRWU.method249(var2);
			var4.method244(arg1);

			while (true) {
				int var5 = arg0.method353();
				if (var5 == 0) {
					break;
				}

				arg0.method339();
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.a(III)Z")
	public static final boolean method379(int arg0, int arg1) {
		KBTDMRWU var2 = KBTDMRWU.method249(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method252(arg1);
	}

	@ObfuscatedName("OBDFVVEL.a(IILUJWODGQS;LYCMSDYIA;IIIII)V")
	public final void method380(int arg0, int arg1, UJWODGQS arg2, YCMSDYIA arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field961 && (field964[0][arg4][arg6] & 0x2) == 0) {
			if ((field964[arg5][arg4][arg6] & 0x10) != 0) {
				return;
			}

			if (method387(arg6, arg5, arg4) != field942) {
				return;
			}
		}

		if (arg5 < field951) {
			field951 = arg5;
		}

		int var9 = field950[arg5][arg4][arg6];
		int var10 = field950[arg5][arg4 + 1][arg6];
		int var11 = field950[arg5][arg4 + 1][arg6 + 1];
		int var12 = field950[arg5][arg4][arg6 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		KBTDMRWU var14 = KBTDMRWU.method249(arg1);
		int var15 = (arg1 << 14) + (arg6 << 7) + arg4 + 0x40000000;
		if (!var14.field771) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg7 << 6) + arg0);
		if (arg0 == 22) {
			if (!field961 || var14.field771 || var14.field791) {
				RWIDPYKY var17;
				if (var14.field806 == -1 && var14.field782 == null) {
					var17 = var14.method247(22, arg7, var9, var10, var11, var12, -1);
				} else {
					var17 = new JSKMYDBH(arg1, var9, 22, var12, var10, var11, arg7, true, var14.field806);
				}

				arg2.method464(var17, var13, var16, arg6, var15, arg4, arg5);

				if (var14.field793 && var14.field771 && arg3 != null) {
					arg3.method564(arg4, arg6);
				}
			}
		} else if (arg0 == 10 || arg0 == 11) {
			RWIDPYKY var18;
			if (var14.field806 == -1 && var14.field782 == null) {
				var18 = var14.method247(10, arg7, var9, var10, var11, var12, -1);
			} else {
				var18 = new JSKMYDBH(arg1, var9, 10, var12, var10, var11, arg7, true, var14.field806);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg0 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg7 == 1 || arg7 == 3) {
					var20 = var14.field763;
					var21 = var14.field804;
				} else {
					var20 = var14.field804;
					var21 = var14.field763;
				}

				if (arg2.method468(var15, var19, var20, arg6, arg4, var21, var16, var13, var18, arg5) && var14.field779) {
					JUQSYEMB var22;
					if (var18 instanceof JUQSYEMB) {
						var22 = (JUQSYEMB) var18;
					} else {
						var22 = var14.method247(10, arg7, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field704 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field946[arg5][arg4 + var23][arg6 + var24]) {
									field946[arg5][arg4 + var23][arg6 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field793 && arg3 != null) {
				arg3.method563(var14.field774, arg4, arg7, var14.field804, arg6, var14.field763);
			}
		} else if (arg0 >= 12) {
			RWIDPYKY var26;
			if (var14.field806 == -1 && var14.field782 == null) {
				var26 = var14.method247(arg0, arg7, var9, var10, var11, var12, -1);
			} else {
				var26 = new JSKMYDBH(arg1, var9, arg0, var12, var10, var11, arg7, true, var14.field806);
			}

			arg2.method468(var15, 0, 1, arg6, arg4, 1, var16, var13, var26, arg5);

			if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg5 > 0) {
				field959[arg5][arg4][arg6] |= 0x924;
			}

			if (var14.field793 && arg3 != null) {
				arg3.method563(var14.field774, arg4, arg7, var14.field804, arg6, var14.field763);
			}
		} else if (arg0 == 0) {
			RWIDPYKY var27;
			if (var14.field806 == -1 && var14.field782 == null) {
				var27 = var14.method247(0, arg7, var9, var10, var11, var12, -1);
			} else {
				var27 = new JSKMYDBH(arg1, var9, 0, var12, var10, var11, arg7, true, var14.field806);
			}

			arg2.method466(field963[arg7], arg5, null, var16, arg6, var27, 0, var15, var13, arg4);

			if (arg7 == 0) {
				if (var14.field779) {
					field946[arg5][arg4][arg6] = 50;
					field946[arg5][arg4][arg6 + 1] = 50;
				}

				if (var14.field780) {
					field959[arg5][arg4][arg6] |= 0x249;
				}
			} else if (arg7 == 1) {
				if (var14.field779) {
					field946[arg5][arg4][arg6 + 1] = 50;
					field946[arg5][arg4 + 1][arg6 + 1] = 50;
				}

				if (var14.field780) {
					field959[arg5][arg4][arg6 + 1] |= 0x492;
				}
			} else if (arg7 == 2) {
				if (var14.field779) {
					field946[arg5][arg4 + 1][arg6] = 50;
					field946[arg5][arg4 + 1][arg6 + 1] = 50;
				}

				if (var14.field780) {
					field959[arg5][arg4 + 1][arg6] |= 0x249;
				}
			} else if (arg7 == 3) {
				if (var14.field779) {
					field946[arg5][arg4][arg6] = 50;
					field946[arg5][arg4 + 1][arg6] = 50;
				}

				if (var14.field780) {
					field959[arg5][arg4][arg6] |= 0x492;
				}
			}

			if (var14.field793 && arg3 != null) {
				arg3.method562(var14.field774, arg7, arg6, arg0, arg4);
			}

			if (var14.field802 != 16) {
				arg2.method474(var14.field802, arg4, arg5, arg6);
			}
		} else if (arg0 == 1) {
			RWIDPYKY var28;
			if (var14.field806 == -1 && var14.field782 == null) {
				var28 = var14.method247(1, arg7, var9, var10, var11, var12, -1);
			} else {
				var28 = new JSKMYDBH(arg1, var9, 1, var12, var10, var11, arg7, true, var14.field806);
			}

			arg2.method466(field948[arg7], arg5, null, var16, arg6, var28, 0, var15, var13, arg4);

			if (var14.field779) {
				if (arg7 == 0) {
					field946[arg5][arg4][arg6 + 1] = 50;
				} else if (arg7 == 1) {
					field946[arg5][arg4 + 1][arg6 + 1] = 50;
				} else if (arg7 == 2) {
					field946[arg5][arg4 + 1][arg6] = 50;
				} else if (arg7 == 3) {
					field946[arg5][arg4][arg6] = 50;
				}
			}

			if (var14.field793 && arg3 != null) {
				arg3.method562(var14.field774, arg7, arg6, arg0, arg4);
			}
		} else if (arg0 == 2) {
			int var29 = arg7 + 1 & 0x3;
			RWIDPYKY var30;
			RWIDPYKY var31;
			if (var14.field806 == -1 && var14.field782 == null) {
				var30 = var14.method247(2, arg7 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method247(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new JSKMYDBH(arg1, var9, 2, var12, var10, var11, arg7 + 4, true, var14.field806);
				var31 = new JSKMYDBH(arg1, var9, 2, var12, var10, var11, var29, true, var14.field806);
			}

			arg2.method466(field963[arg7], arg5, var31, var16, arg6, var30, field963[var29], var15, var13, arg4);

			if (var14.field780) {
				if (arg7 == 0) {
					field959[arg5][arg4][arg6] |= 0x249;
					field959[arg5][arg4][arg6 + 1] |= 0x492;
				} else if (arg7 == 1) {
					field959[arg5][arg4][arg6 + 1] |= 0x492;
					field959[arg5][arg4 + 1][arg6] |= 0x249;
				} else if (arg7 == 2) {
					field959[arg5][arg4 + 1][arg6] |= 0x249;
					field959[arg5][arg4][arg6] |= 0x492;
				} else if (arg7 == 3) {
					field959[arg5][arg4][arg6] |= 0x492;
					field959[arg5][arg4][arg6] |= 0x249;
				}
			}

			if (var14.field793 && arg3 != null) {
				arg3.method562(var14.field774, arg7, arg6, arg0, arg4);
			}

			if (var14.field802 != 16) {
				arg2.method474(var14.field802, arg4, arg5, arg6);
			}
		} else if (arg0 == 3) {
			RWIDPYKY var32;
			if (var14.field806 == -1 && var14.field782 == null) {
				var32 = var14.method247(3, arg7, var9, var10, var11, var12, -1);
			} else {
				var32 = new JSKMYDBH(arg1, var9, 3, var12, var10, var11, arg7, true, var14.field806);
			}

			arg2.method466(field948[arg7], arg5, null, var16, arg6, var32, 0, var15, var13, arg4);

			if (var14.field779) {
				if (arg7 == 0) {
					field946[arg5][arg4][arg6 + 1] = 50;
				} else if (arg7 == 1) {
					field946[arg5][arg4 + 1][arg6 + 1] = 50;
				} else if (arg7 == 2) {
					field946[arg5][arg4 + 1][arg6] = 50;
				} else if (arg7 == 3) {
					field946[arg5][arg4][arg6] = 50;
				}
			}

			if (var14.field793 && arg3 != null) {
				arg3.method562(var14.field774, arg7, arg6, arg0, arg4);
			}
		} else if (arg0 == 9) {
			RWIDPYKY var33;
			if (var14.field806 == -1 && var14.field782 == null) {
				var33 = var14.method247(arg0, arg7, var9, var10, var11, var12, -1);
			} else {
				var33 = new JSKMYDBH(arg1, var9, arg0, var12, var10, var11, arg7, true, var14.field806);
			}

			arg2.method468(var15, 0, 1, arg6, arg4, 1, var16, var13, var33, arg5);

			if (var14.field793 && arg3 != null) {
				arg3.method563(var14.field774, arg4, arg7, var14.field804, arg6, var14.field763);
			}
		} else {
			if (var14.field795) {
				if (arg7 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg7 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg7 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg0 == 4) {
				RWIDPYKY var38;
				if (var14.field806 == -1 && var14.field782 == null) {
					var38 = var14.method247(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new JSKMYDBH(arg1, var9, 4, var12, var10, var11, 0, true, var14.field806);
				}

				arg2.method467(var15, arg6, arg4, var16, 0, arg5, 0, var38, field963[arg7], arg7 * 512, var13);
			} else if (arg0 == 5) {
				int var39 = 16;
				int var40 = arg2.method484(arg5, arg4, arg6);
				if (var40 > 0) {
					var39 = KBTDMRWU.method249(var40 >> 14 & 0x7FFF).field802;
				}

				RWIDPYKY var41;
				if (var14.field806 == -1 && var14.field782 == null) {
					var41 = var14.method247(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new JSKMYDBH(arg1, var9, 4, var12, var10, var11, 0, true, var14.field806);
				}

				arg2.method467(var15, arg6, arg4, var16, field949[arg7] * var39, arg5, field944[arg7] * var39, var41, field963[arg7], arg7 * 512, var13);
			} else if (arg0 == 6) {
				RWIDPYKY var42;
				if (var14.field806 == -1 && var14.field782 == null) {
					var42 = var14.method247(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new JSKMYDBH(arg1, var9, 4, var12, var10, var11, 0, true, var14.field806);
				}

				arg2.method467(var15, arg6, arg4, var16, 0, arg5, 0, var42, 256, arg7, var13);
			} else if (arg0 == 7) {
				RWIDPYKY var43;
				if (var14.field806 == -1 && var14.field782 == null) {
					var43 = var14.method247(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new JSKMYDBH(arg1, var9, 4, var12, var10, var11, 0, true, var14.field806);
				}

				arg2.method467(var15, arg6, arg4, var16, 0, arg5, 0, var43, 512, arg7, var13);
			} else if (arg0 == 8) {
				RWIDPYKY var44;
				if (var14.field806 == -1 && var14.field782 == null) {
					var44 = var14.method247(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new JSKMYDBH(arg1, var9, 4, var12, var10, var11, 0, true, var14.field806);
				}

				arg2.method467(var15, arg6, arg4, var16, 0, arg5, 0, var44, 768, arg7, var13);
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.a(II[B[LYCMSDYIA;LUJWODGQS;I)V")
	public final void method381(int arg0, byte[] arg1, YCMSDYIA[] arg2, UJWODGQS arg3, int arg4) {
		NQUAUMDT var6 = new NQUAUMDT(arg1);
		int var7 = -1;
		while (true) {
			int var8 = var6.method353();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method353();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method339();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg4 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field964[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					YCMSDYIA var20 = null;
					if (var19 >= 0) {
						var20 = arg2[var19];
					}

					method380(var15, var7, arg3, var20, var17, var13, var18, var16);
				}
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.a(BIIILUJWODGQS;LYCMSDYIA;I[[[IIII)V")
	public static final void method382(int arg0, int arg1, int arg2, UJWODGQS arg3, YCMSDYIA arg4, int arg5, int[][][] arg6, int arg7, int arg8, int arg9) {
		int var10 = arg6[arg8][arg7][arg1];
		int var11 = arg6[arg8][arg7 + 1][arg1];
		int var12 = arg6[arg8][arg7 + 1][arg1 + 1];
		int var13 = arg6[arg8][arg7][arg1 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		KBTDMRWU var15 = KBTDMRWU.method249(arg0);
		int var16 = (arg0 << 14) + (arg1 << 7) + arg7 + 0x40000000;
		if (!var15.field771) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg5 << 6) + arg9);
		if (arg9 == 22) {
			RWIDPYKY var18;
			if (var15.field806 == -1 && var15.field782 == null) {
				var18 = var15.method247(22, arg5, var10, var11, var12, var13, -1);
			} else {
				var18 = new JSKMYDBH(arg0, var10, 22, var13, var11, var12, arg5, true, var15.field806);
			}

			arg3.method464(var18, var14, var17, arg1, var16, arg7, arg2);

			if (var15.field793 && var15.field771) {
				arg4.method564(arg7, arg1);
			}
		} else if (arg9 == 10 || arg9 == 11) {
			RWIDPYKY var19;
			if (var15.field806 == -1 && var15.field782 == null) {
				var19 = var15.method247(10, arg5, var10, var11, var12, var13, -1);
			} else {
				var19 = new JSKMYDBH(arg0, var10, 10, var13, var11, var12, arg5, true, var15.field806);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg9 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg5 == 1 || arg5 == 3) {
					var21 = var15.field763;
					var22 = var15.field804;
				} else {
					var21 = var15.field804;
					var22 = var15.field763;
				}

				arg3.method468(var16, var20, var21, arg1, arg7, var22, var17, var14, var19, arg2);
			}

			if (var15.field793) {
				arg4.method563(var15.field774, arg7, arg5, var15.field804, arg1, var15.field763);
			}
		} else if (arg9 >= 12) {
			RWIDPYKY var23;
			if (var15.field806 == -1 && var15.field782 == null) {
				var23 = var15.method247(arg9, arg5, var10, var11, var12, var13, -1);
			} else {
				var23 = new JSKMYDBH(arg0, var10, arg9, var13, var11, var12, arg5, true, var15.field806);
			}

			arg3.method468(var16, 0, 1, arg1, arg7, 1, var17, var14, var23, arg2);

			if (var15.field793) {
				arg4.method563(var15.field774, arg7, arg5, var15.field804, arg1, var15.field763);
			}
		} else if (arg9 == 0) {
			RWIDPYKY var24;
			if (var15.field806 == -1 && var15.field782 == null) {
				var24 = var15.method247(0, arg5, var10, var11, var12, var13, -1);
			} else {
				var24 = new JSKMYDBH(arg0, var10, 0, var13, var11, var12, arg5, true, var15.field806);
			}

			arg3.method466(field963[arg5], arg2, null, var17, arg1, var24, 0, var16, var14, arg7);

			if (var15.field793) {
				arg4.method562(var15.field774, arg5, arg1, arg9, arg7);
			}
		} else if (arg9 == 1) {
			RWIDPYKY var25;
			if (var15.field806 == -1 && var15.field782 == null) {
				var25 = var15.method247(1, arg5, var10, var11, var12, var13, -1);
			} else {
				var25 = new JSKMYDBH(arg0, var10, 1, var13, var11, var12, arg5, true, var15.field806);
			}

			arg3.method466(field948[arg5], arg2, null, var17, arg1, var25, 0, var16, var14, arg7);

			if (var15.field793) {
				arg4.method562(var15.field774, arg5, arg1, arg9, arg7);
			}
		} else if (arg9 == 2) {
			int var26 = arg5 + 1 & 0x3;
			RWIDPYKY var27;
			RWIDPYKY var28;
			if (var15.field806 == -1 && var15.field782 == null) {
				var27 = var15.method247(2, arg5 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method247(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new JSKMYDBH(arg0, var10, 2, var13, var11, var12, arg5 + 4, true, var15.field806);
				var28 = new JSKMYDBH(arg0, var10, 2, var13, var11, var12, var26, true, var15.field806);
			}

			arg3.method466(field963[arg5], arg2, var28, var17, arg1, var27, field963[var26], var16, var14, arg7);

			if (var15.field793) {
				arg4.method562(var15.field774, arg5, arg1, arg9, arg7);
			}
		} else if (arg9 == 3) {
			RWIDPYKY var29;
			if (var15.field806 == -1 && var15.field782 == null) {
				var29 = var15.method247(3, arg5, var10, var11, var12, var13, -1);
			} else {
				var29 = new JSKMYDBH(arg0, var10, 3, var13, var11, var12, arg5, true, var15.field806);
			}

			arg3.method466(field948[arg5], arg2, null, var17, arg1, var29, 0, var16, var14, arg7);

			if (var15.field793) {
				arg4.method562(var15.field774, arg5, arg1, arg9, arg7);
			}
		} else if (arg9 == 9) {
			RWIDPYKY var30;
			if (var15.field806 == -1 && var15.field782 == null) {
				var30 = var15.method247(arg9, arg5, var10, var11, var12, var13, -1);
			} else {
				var30 = new JSKMYDBH(arg0, var10, arg9, var13, var11, var12, arg5, true, var15.field806);
			}

			arg3.method468(var16, 0, 1, arg1, arg7, 1, var17, var14, var30, arg2);

			if (var15.field793) {
				arg4.method563(var15.field774, arg7, arg5, var15.field804, arg1, var15.field763);
			}
		} else {
			if (var15.field795) {
				if (arg5 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg5 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg5 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg9 == 4) {
				RWIDPYKY var35;
				if (var15.field806 == -1 && var15.field782 == null) {
					var35 = var15.method247(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new JSKMYDBH(arg0, var10, 4, var13, var11, var12, 0, true, var15.field806);
				}

				arg3.method467(var16, arg1, arg7, var17, 0, arg2, 0, var35, field963[arg5], arg5 * 512, var14);
			} else if (arg9 == 5) {
				int var36 = 16;
				int var37 = arg3.method484(arg2, arg7, arg1);
				if (var37 > 0) {
					var36 = KBTDMRWU.method249(var37 >> 14 & 0x7FFF).field802;
				}

				RWIDPYKY var38;
				if (var15.field806 == -1 && var15.field782 == null) {
					var38 = var15.method247(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new JSKMYDBH(arg0, var10, 4, var13, var11, var12, 0, true, var15.field806);
				}

				arg3.method467(var16, arg1, arg7, var17, field949[arg5] * var36, arg2, field944[arg5] * var36, var38, field963[arg5], arg5 * 512, var14);
			} else if (arg9 == 6) {
				RWIDPYKY var39;
				if (var15.field806 == -1 && var15.field782 == null) {
					var39 = var15.method247(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new JSKMYDBH(arg0, var10, 4, var13, var11, var12, 0, true, var15.field806);
				}

				arg3.method467(var16, arg1, arg7, var17, 0, arg2, 0, var39, 256, arg5, var14);
			} else if (arg9 == 7) {
				RWIDPYKY var40;
				if (var15.field806 == -1 && var15.field782 == null) {
					var40 = var15.method247(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new JSKMYDBH(arg0, var10, 4, var13, var11, var12, 0, true, var15.field806);
				}

				arg3.method467(var16, arg1, arg7, var17, 0, arg2, 0, var40, 512, arg5, var14);
			} else if (arg9 == 8) {
				RWIDPYKY var41;
				if (var15.field806 == -1 && var15.field782 == null) {
					var41 = var15.method247(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new JSKMYDBH(arg0, var10, 4, var13, var11, var12, 0, true, var15.field806);
				}

				arg3.method467(var16, arg1, arg7, var17, 0, arg2, 0, var41, 768, arg5, var14);
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.a(II[LYCMSDYIA;[BIII)V")
	public final void method383(int arg0, int arg1, YCMSDYIA[] arg2, byte[] arg3, int arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg1 + var8 > 0 && arg1 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
						arg2[var7].field1449[arg1 + var8][arg0 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		NQUAUMDT var10 = new NQUAUMDT(arg3);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method390(0, arg0 + var13, var10, arg4, var11, arg5, arg1 + var12);
				}
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.b(III)I")
	public static final int method384(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method398(var3, var5);
		int var8 = method398(var3 + 1, var5);
		int var9 = method398(var3, var5 + 1);
		int var10 = method398(var3 + 1, var5 + 1);
		int var11 = method399(var7, var8, var4, arg2);
		int var12 = method399(var9, var10, var4, arg2);
		return method399(var11, var12, var6, arg2);
	}

	@ObfuscatedName("OBDFVVEL.a(IIZI)V")
	public final void method385(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field950[arg1][arg0 + var4][arg2 + var5] = 0;
			}
		}

		if (arg0 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field950[arg1][arg0][arg2 + var6] = field950[arg1][arg0 - 1][arg2 + var6];
			}
		}

		if (arg2 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field950[arg1][arg0 + var7][arg2] = field950[arg1][arg0 + var7][arg2 - 1];
			}
		}

		if (arg0 > 0 && field950[arg1][arg0 - 1][arg2] != 0) {
			field950[arg1][arg0][arg2] = field950[arg1][arg0 - 1][arg2];
		} else if (arg2 > 0 && field950[arg1][arg0][arg2 - 1] != 0) {
			field950[arg1][arg0][arg2] = field950[arg1][arg0][arg2 - 1];
		} else if (arg0 > 0 && arg2 > 0 && field950[arg1][arg0 - 1][arg2 - 1] != 0) {
			field950[arg1][arg0][arg2] = field950[arg1][arg0 - 1][arg2 - 1];
		}
	}

	@ObfuscatedName("OBDFVVEL.a(IIBII)V")
	public final void method386(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg1; var5++) {
			for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
				if (var6 >= 0 && var6 < field952 && var5 >= 0 && var5 < field953) {
					field946[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field950[0][var6][var5] = field950[0][var6 - 1][var5];
					}

					if (arg2 + arg3 == var6 && var6 < field952 - 1) {
						field950[0][var6][var5] = field950[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field950[0][var6][var5] = field950[0][var6][var5 - 1];
					}

					if (arg0 + arg1 == var5 && var5 < field953 - 1) {
						field950[0][var6][var5] = field950[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.a(IIII)I")
	public int method387(int arg0, int arg1, int arg2) {
		if ((field964[arg1][arg2][arg0] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field964[1][arg2][arg0] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("OBDFVVEL.c(III)I")
	public final int method388(int arg0, int arg1, int arg2) {
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

	public OBDFVVEL(int arg0, int[][][] arg1, int arg2, byte[][][] arg3) {
		field951 = 99;
		field952 = arg2;
		field953 = arg0;
		field950 = arg1;
		field964 = arg3;
		field941 = new byte[4][field952][field953];
		field945 = new byte[4][field952][field953];
		field947 = new byte[4][field952][field953];
		field943 = new byte[4][field952][field953];
		field959 = new int[4][field952 + 1][field953 + 1];
		field946 = new byte[4][field952 + 1][field953 + 1];
		field965 = new int[field952 + 1][field953 + 1];
		field954 = new int[field953];
		field955 = new int[field953];
		field956 = new int[field953];
		field957 = new int[field953];
		field958 = new int[field953];
	}

	@ObfuscatedName("OBDFVVEL.a(II)I")
	public final int method389(int arg0, int arg1) {
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

	@ObfuscatedName("OBDFVVEL.a(IILNQUAUMDT;IIIZI)V")
	public final void method390(int arg0, int arg1, NQUAUMDT arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg6 >= 0 && arg6 < 104 && arg1 >= 0 && arg1 < 104) {
			field964[arg4][arg6][arg1] = 0;
			while (true) {
				int var8 = arg2.method339();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg2.method339();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg4 == 0) {
						field950[0][arg6][arg1] = -var9 * 8;
						return;
					}

					field950[arg4][arg6][arg1] = field950[arg4 - 1][arg6][arg1] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field945[arg4][arg6][arg1] = arg2.method340();
					field947[arg4][arg6][arg1] = (byte) ((var8 - 2) / 4);
					field943[arg4][arg6][arg1] = (byte) (var8 + arg0 - 2 & 0x3);
				} else if (var8 <= 81) {
					field964[arg4][arg6][arg1] = (byte) (var8 - 49);
				} else {
					field941[arg4][arg6][arg1] = (byte) (var8 - 81);
				}
			}

			if (arg4 == 0) {
				field950[0][arg6][arg1] = -method392(arg6 + arg5 + 932731, arg1 + 556238 + arg3) * 8;
			} else {
				field950[arg4][arg6][arg1] = field950[arg4 - 1][arg6][arg1] - 240;
			}
		} else {
			while (true) {
				int var10 = arg2.method339();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg2.method339();
					return;
				}

				if (var10 <= 49) {
					arg2.method339();
				}
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.a(I[BIB)Z")
	public static final boolean method391(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		NQUAUMDT var4 = new NQUAUMDT(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method353();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method353();
					if (var9 == 0) {
						break;
					}

					var4.method339();
				} else {
					int var10 = var4.method353();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method339() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						KBTDMRWU var16 = KBTDMRWU.method249(var5);
						if (var13 != 22 || !field961 || var16.field771 || var16.field791) {
							var3 &= var16.method245();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.b(II)I")
	public static final int method392(int arg0, int arg1) {
		int var2 = method384(arg0 + 45365, arg1 + 91923, 4) + (method384(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method384(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("OBDFVVEL.a(II[BII[LYCMSDYIA;IIII)V")
	public final void method393(int arg0, int arg1, byte[] arg2, int arg3, int arg4, YCMSDYIA[] arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg6 + var11 > 0 && arg6 + var11 < 103) {
					arg5[arg8].field1449[arg1 + var10][arg6 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		NQUAUMDT var12 = new NQUAUMDT(arg2);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg4 == var13 && var14 >= arg0 && var14 < arg0 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
						method390(arg7, arg6 + PFTTLTVY.method409(var14 & 0x7, var15 & 0x7, arg7), var12, 0, arg8, 0, arg1 + PFTTLTVY.method408(var15 & 0x7, var14 & 0x7, arg7));
					} else {
						method390(0, -1, var12, 0, 0, 0, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.a([LYCMSDYIA;LUJWODGQS;I)V")
	public final void method394(YCMSDYIA[] arg0, UJWODGQS arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field964[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field964[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method564(var4, var5);
						}
					}
				}
			}
		}

		field960 += (int) (Math.random() * 5.0D) - 2;
		if (field960 < -8) {
			field960 = -8;
		}

		if (field960 > 8) {
			field960 = 8;
		}

		field962 += (int) (Math.random() * 5.0D) - 2;
		if (field962 < -16) {
			field962 = -16;
		}

		if (field962 > 16) {
			field962 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field946[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field953 - 1; var16++) {
				for (int var17 = 1; var17 < field952 - 1; var17++) {
					int var18 = field950[var7][var17 + 1][var16] - field950[var7][var17 - 1][var16];
					int var19 = field950[var7][var17][var16 + 1] - field950[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field965[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field953; var26++) {
				field954[var26] = 0;
				field955[var26] = 0;
				field956[var26] = 0;
				field957[var26] = 0;
				field958[var26] = 0;
			}

			for (int var27 = -5; var27 < field952 + 5; var27++) {
				for (int var28 = 0; var28 < field953; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field952) {
						int var30 = field941[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							QFWUSXIS var31 = QFWUSXIS.field998[var30 - 1];
							field954[var28] += var31.field1007;
							field955[var28] += var31.field1005;
							field956[var28] += var31.field1006;
							field957[var28] += var31.field1008;
							field958[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field952) {
						int var33 = field941[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							QFWUSXIS var34 = QFWUSXIS.field998[var33 - 1];
							field954[var28] -= var34.field1007;
							field955[var28] -= var34.field1005;
							field956[var28] -= var34.field1006;
							field957[var28] -= var34.field1008;
							field958[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field952 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field953 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field953) {
							var35 += field954[var41];
							var36 += field955[var41];
							var37 += field956[var41];
							var38 += field957[var41];
							var39 += field958[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field953) {
							var35 -= field954[var42];
							var36 -= field955[var42];
							var37 -= field956[var42];
							var38 -= field957[var42];
							var39 -= field958[var42];
						}

						if (var40 >= 1 && var40 < field953 - 1 && (!field961 || (field964[0][var27][var40] & 0x2) != 0 || (field964[var7][var27][var40] & 0x10) == 0 && method387(var40, var7, var27) == field942)) {
							if (var7 < field951) {
								field951 = var7;
							}

							int var43 = field941[var7][var27][var40] & 0xFF;
							int var44 = field945[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field950[var7][var27][var40];
								int var46 = field950[var7][var27 + 1][var40];
								int var47 = field950[var7][var27 + 1][var40 + 1];
								int var48 = field950[var7][var27][var40 + 1];
								int var49 = field965[var27][var40];
								int var50 = field965[var27 + 1][var40];
								int var51 = field965[var27 + 1][var40 + 1];
								int var52 = field965[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method388(var55, var56, var57);
									var55 = field960 + var55 & 0xFF;
									var57 += field962;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method388(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field947[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !QFWUSXIS.field998[var44 - 1].field1003) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field959[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = ZVPDLSTW.field1515[method396(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method463(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method396(var53, var49), method396(var53, var50), method396(var53, var51), method396(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field947[var7][var27][var40] + 1;
									byte var61 = field943[var7][var27][var40];
									QFWUSXIS var62 = QFWUSXIS.field998[var44 - 1];
									int var63 = var62.field1001;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = ZVPDLSTW.method594(var63);
										var65 = -1;
									} else if (var62.field1000 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = ZVPDLSTW.field1515[method389(var62.field1009, 96)];
									} else {
										var65 = method388(var62.field1004, var62.field1005, var62.field1006);
										var64 = ZVPDLSTW.field1515[method389(var62.field1009, 96)];
									}

									arg1.method463(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method396(var53, var49), method396(var53, var50), method396(var53, var51), method396(var53, var52), method389(var65, var49), method389(var65, var50), method389(var65, var51), method389(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field953 - 1; var66++) {
				for (int var67 = 1; var67 < field952 - 1; var67++) {
					arg1.method462(var7, var67, var66, method387(var66, var7, var67));
				}
			}
		}

		arg1.method489(-50, -10, -50);

		for (int var68 = 0; var68 < field952; var68++) {
			for (int var69 = 0; var69 < field953; var69++) {
				if ((field964[1][var68][var69] & 0x2) == 2) {
					arg1.method460(var68, var69);
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
				for (int var75 = 0; var75 <= field953; var75++) {
					for (int var76 = 0; var76 <= field952; var76++) {
						if ((field959[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field959[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field953 && (field959[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field959[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field959[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field950[var80][var76][var77] - var84;
								int var86 = field950[var79][var76][var77];
								UJWODGQS.method461(var85, var73, var77 * 128, var76 * 128, var78 * 128 + 128, var86, 1, var76 * 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field959[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field959[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field959[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field952 && (field959[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field959[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field959[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field950[var92][var89][var75] - var96;
								int var98 = field950[var91][var89][var75];
								UJWODGQS.method461(var97, var73, var75 * 128, var90 * 128 + 128, var75 * 128, var98, 2, var89 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field959[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field959[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field959[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field953 && (field959[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field959[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field952) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field959[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field950[var74][var101][var103];
								UJWODGQS.method461(var107, var73, var103 * 128, var102 * 128 + 128, var104 * 128 + 128, var107, 4, var101 * 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field959[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.a(ILUJWODGQS;[LYCMSDYIA;Z[BIIIIII)V")
	public final void method395(int arg0, UJWODGQS arg1, YCMSDYIA[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		NQUAUMDT var11 = new NQUAUMDT(arg3);
		int var12 = -1;
		while (true) {
			int var13 = var11.method353();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method353();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method339();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg6 == var18 && var17 >= arg4 && var17 < arg4 + 8 && var16 >= arg7 && var16 < arg7 + 8) {
					KBTDMRWU var22 = KBTDMRWU.method249(var12);
					int var23 = arg5 + PFTTLTVY.method410(var21, var22.field804, var16 & 0x7, var22.field763, var17 & 0x7, arg0);
					int var24 = arg8 + PFTTLTVY.method411(arg0, var16 & 0x7, var21, var22.field804, var17 & 0x7, var22.field763);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg9;
						if ((field964[1][var23][var24] & 0x2) == 2) {
							var25 = arg9 - 1;
						}

						YCMSDYIA var26 = null;
						if (var25 >= 0) {
							var26 = arg2[var25];
						}

						method380(var20, var12, arg1, var26, var23, arg9, var24, arg0 + var21 & 0x3);
					}
				}
			}
		}
	}

	@ObfuscatedName("OBDFVVEL.c(II)I")
	public static final int method396(int arg0, int arg1) {
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

	@ObfuscatedName("OBDFVVEL.d(II)I")
	public static final int method397(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("OBDFVVEL.e(II)I")
	public static final int method398(int arg0, int arg1) {
		int var2 = method397(arg0 - 1, arg1 - 1) + method397(arg0 + 1, arg1 - 1) + method397(arg0 - 1, arg1 + 1) + method397(arg0 + 1, arg1 + 1);
		int var3 = method397(arg0 - 1, arg1) + method397(arg0 + 1, arg1) + method397(arg0, arg1 - 1) + method397(arg0, arg1 + 1);
		int var4 = method397(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("OBDFVVEL.b(IIII)I")
	public static final int method399(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - ZVPDLSTW.field1504[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}
}
