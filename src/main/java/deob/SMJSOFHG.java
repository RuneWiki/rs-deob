package deob;

@ObfuscatedName("SMJSOFHG")
public final class SMJSOFHG {

	@ObfuscatedName("SMJSOFHG.n")
	public int field1336;

	@ObfuscatedName("SMJSOFHG.o")
	public int field1337;

	@ObfuscatedName("SMJSOFHG.u")
	public int[][][] field1343;

	@ObfuscatedName("SMJSOFHG.h")
	public byte[][][] field1332;

	@ObfuscatedName("SMJSOFHG.q")
	public byte[][][] field1339;

	@ObfuscatedName("SMJSOFHG.a")
	public byte[][][] field1325;

	@ObfuscatedName("SMJSOFHG.z")
	public byte[][][] field1348;

	@ObfuscatedName("SMJSOFHG.i")
	public byte[][][] field1333;

	@ObfuscatedName("SMJSOFHG.y")
	public int[][][] field1347;

	@ObfuscatedName("SMJSOFHG.k")
	public byte[][][] field1334;

	@ObfuscatedName("SMJSOFHG.g")
	public int[][] field1331;

	@ObfuscatedName("SMJSOFHG.b")
	public int[] field1326;

	@ObfuscatedName("SMJSOFHG.c")
	public int[] field1327;

	@ObfuscatedName("SMJSOFHG.d")
	public int[] field1328;

	@ObfuscatedName("SMJSOFHG.e")
	public int[] field1329;

	@ObfuscatedName("SMJSOFHG.f")
	public int[] field1330;

	@ObfuscatedName("SMJSOFHG.m")
	public static final int[] field1335 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("SMJSOFHG.p")
	public static boolean field1338 = true;

	@ObfuscatedName("SMJSOFHG.v")
	public static final int[] field1344 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("SMJSOFHG.w")
	public static final int[] field1345 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("SMJSOFHG.x")
	public static final int[] field1346 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("SMJSOFHG.r")
	public static int field1340 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("SMJSOFHG.s")
	public static int field1341 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("SMJSOFHG.t")
	public static int field1342;

	@ObfuscatedName("SMJSOFHG.a(III)I")
	public static final int method490(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method504(var3, var5);
		int var8 = method504(var3 + 1, var5);
		int var9 = method504(var3, var5 + 1);
		int var10 = method504(var3 + 1, var5 + 1);
		int var11 = method494(var7, var8, var4, arg2);
		int var12 = method494(var9, var10, var4, arg2);
		return method494(var11, var12, var6, arg2);
	}

	@ObfuscatedName("SMJSOFHG.a(II[BZ)Z")
	public static final boolean method491(int arg0, int arg1, byte[] arg2) {
		boolean var3 = true;
		BJPWOXRJ var4 = new BJPWOXRJ(arg2);
		int var5 = -1;
		while (true) {
			int var6 = var4.method29();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method29();
					if (var9 == 0) {
						break;
					}

					var4.method15();
				} else {
					int var10 = var4.method29();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method15() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						KZRNPNVL var16 = KZRNPNVL.method401(var5);
						if (var13 != 22 || !field1338 || var16.field955 || var16.field954) {
							var3 &= var16.method405();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("SMJSOFHG.a(II)I")
	public static final int method492(int arg0, int arg1) {
		int var2 = method490(arg0 + 45365, arg1 + 91923, 4) + (method490(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method490(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("SMJSOFHG.a(LFHVZVKRA;ZLBJPWOXRJ;)V")
	public static final void method493(FHVZVKRA arg0, BJPWOXRJ arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg1.method29();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			KZRNPNVL var4 = KZRNPNVL.method401(var2);
			var4.method402(arg0);

			while (true) {
				int var5 = arg1.method29();
				if (var5 == 0) {
					break;
				}

				arg1.method15();
			}
		}
	}

	@ObfuscatedName("SMJSOFHG.a(IIII)I")
	public static final int method494(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - FWQLREOO.field609[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("SMJSOFHG.b(III)Z")
	public static final boolean method495(int arg0, int arg1) {
		KZRNPNVL var2 = KZRNPNVL.method401(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method403(arg1);
	}

	@ObfuscatedName("SMJSOFHG.a(I[BII[LHUQCCBIO;LHFOJZUJK;)V")
	public final void method496(int arg0, byte[] arg1, int arg2, HUQCCBIO[] arg3, HFOJZUJK arg4) {
		BJPWOXRJ var6 = new BJPWOXRJ(arg1);
		int var7 = -1;
		while (true) {
			int var8 = var6.method29();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method29();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method15();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg2 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1332[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					HUQCCBIO var20 = null;
					if (var19 >= 0) {
						var20 = arg3[var19];
					}

					method498(var17, var7, var16, var13, var15, arg4, var18, var20);
				}
			}
		}
	}

	@ObfuscatedName("SMJSOFHG.a(ZIII)I")
	public int method497(int arg0, int arg1, int arg2) {
		if ((field1332[arg2][arg0][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg2 > 0 && (field1332[1][arg0][arg1] & 0x2) != 0) {
			return arg2 - 1;
		}

		return arg2;
	}

	@ObfuscatedName("SMJSOFHG.a(IIZIIILHFOJZUJK;ILHUQCCBIO;)V")
	public final void method498(int arg0, int arg1, int arg2, int arg3, int arg4, HFOJZUJK arg5, int arg6, HUQCCBIO arg7) {
		if (field1338) {
			if ((field1332[arg3][arg0][arg6] & 0x10) != 0) {
				return;
			}

			if (method497(arg0, arg6, arg3) != field1342) {
				return;
			}
		}

		int var9 = field1343[arg3][arg0][arg6];
		int var10 = field1343[arg3][arg0 + 1][arg6];
		int var11 = field1343[arg3][arg0 + 1][arg6 + 1];
		int var12 = field1343[arg3][arg0][arg6 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		KZRNPNVL var14 = KZRNPNVL.method401(arg1);
		int var15 = (arg1 << 14) + (arg6 << 7) + arg0 + 0x40000000;
		if (!var14.field955) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg2 << 6) + arg4);
		if (arg4 == 22) {
			if (!field1338 || var14.field955 || var14.field954) {
				BBIXHJOC var17;
				if (var14.field967 == -1 && var14.field945 == null) {
					var17 = var14.method406(22, arg2, var9, var10, var11, var12, -1);
				} else {
					var17 = new SIDDBHEA(var9, var12, var14.field967, 22, arg2, true, arg1, var10, var11);
				}

				arg5.method251(var16, var13, var15, arg3, arg6, var17, arg0);

				if (var14.field965 && var14.field955 && arg7 != null) {
					arg7.method302(arg0, arg6);
				}
			}
		} else if (arg4 == 10 || arg4 == 11) {
			BBIXHJOC var18;
			if (var14.field967 == -1 && var14.field945 == null) {
				var18 = var14.method406(10, arg2, var9, var10, var11, var12, -1);
			} else {
				var18 = new SIDDBHEA(var9, var12, var14.field967, 10, arg2, true, arg1, var10, var11);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg4 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg2 == 1 || arg2 == 3) {
					var20 = var14.field974;
					var21 = var14.field946;
				} else {
					var20 = var14.field946;
					var21 = var14.field974;
				}

				if (arg5.method255(var20, arg3, var18, var19, var13, arg0, var16, var15, arg6, var21) && var14.field991) {
					JLNSJQDR var22;
					if (var18 instanceof JLNSJQDR) {
						var22 = (JLNSJQDR) var18;
					} else {
						var22 = var14.method406(10, arg2, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field846 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1334[arg3][arg0 + var23][arg6 + var24]) {
									field1334[arg3][arg0 + var23][arg6 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field965 && arg7 != null) {
				arg7.method301(arg6, var14.field946, var14.field974, var14.field966, arg2, arg0);
			}
		} else if (arg4 >= 12) {
			BBIXHJOC var26;
			if (var14.field967 == -1 && var14.field945 == null) {
				var26 = var14.method406(arg4, arg2, var9, var10, var11, var12, -1);
			} else {
				var26 = new SIDDBHEA(var9, var12, var14.field967, arg4, arg2, true, arg1, var10, var11);
			}

			arg5.method255(1, arg3, var26, 0, var13, arg0, var16, var15, arg6, 1);

			if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg3 > 0) {
				field1347[arg3][arg0][arg6] |= 0x924;
			}

			if (var14.field965 && arg7 != null) {
				arg7.method301(arg6, var14.field946, var14.field974, var14.field966, arg2, arg0);
			}
		} else if (arg4 == 0) {
			BBIXHJOC var27;
			if (var14.field967 == -1 && var14.field945 == null) {
				var27 = var14.method406(0, arg2, var9, var10, var11, var12, -1);
			} else {
				var27 = new SIDDBHEA(var9, var12, var14.field967, 0, arg2, true, arg1, var10, var11);
			}

			arg5.method253(var27, var13, var16, null, arg3, field1344[arg2], arg0, var15, arg6, 0);

			if (arg2 == 0) {
				if (var14.field991) {
					field1334[arg3][arg0][arg6] = 50;
					field1334[arg3][arg0][arg6 + 1] = 50;
				}

				if (var14.field977) {
					field1347[arg3][arg0][arg6] |= 0x249;
				}
			} else if (arg2 == 1) {
				if (var14.field991) {
					field1334[arg3][arg0][arg6 + 1] = 50;
					field1334[arg3][arg0 + 1][arg6 + 1] = 50;
				}

				if (var14.field977) {
					field1347[arg3][arg0][arg6 + 1] |= 0x492;
				}
			} else if (arg2 == 2) {
				if (var14.field991) {
					field1334[arg3][arg0 + 1][arg6] = 50;
					field1334[arg3][arg0 + 1][arg6 + 1] = 50;
				}

				if (var14.field977) {
					field1347[arg3][arg0 + 1][arg6] |= 0x249;
				}
			} else if (arg2 == 3) {
				if (var14.field991) {
					field1334[arg3][arg0][arg6] = 50;
					field1334[arg3][arg0 + 1][arg6] = 50;
				}

				if (var14.field977) {
					field1347[arg3][arg0][arg6] |= 0x492;
				}
			}

			if (var14.field965 && arg7 != null) {
				arg7.method300(arg6, arg0, var14.field966, arg2, arg4);
			}

			if (var14.field987 != 16) {
				arg5.method261(arg0, arg6, var14.field987, arg3);
			}
		} else if (arg4 == 1) {
			BBIXHJOC var28;
			if (var14.field967 == -1 && var14.field945 == null) {
				var28 = var14.method406(1, arg2, var9, var10, var11, var12, -1);
			} else {
				var28 = new SIDDBHEA(var9, var12, var14.field967, 1, arg2, true, arg1, var10, var11);
			}

			arg5.method253(var28, var13, var16, null, arg3, field1346[arg2], arg0, var15, arg6, 0);

			if (var14.field991) {
				if (arg2 == 0) {
					field1334[arg3][arg0][arg6 + 1] = 50;
				} else if (arg2 == 1) {
					field1334[arg3][arg0 + 1][arg6 + 1] = 50;
				} else if (arg2 == 2) {
					field1334[arg3][arg0 + 1][arg6] = 50;
				} else if (arg2 == 3) {
					field1334[arg3][arg0][arg6] = 50;
				}
			}

			if (var14.field965 && arg7 != null) {
				arg7.method300(arg6, arg0, var14.field966, arg2, arg4);
			}
		} else if (arg4 == 2) {
			int var29 = arg2 + 1 & 0x3;
			BBIXHJOC var30;
			BBIXHJOC var31;
			if (var14.field967 == -1 && var14.field945 == null) {
				var30 = var14.method406(2, arg2 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method406(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new SIDDBHEA(var9, var12, var14.field967, 2, arg2 + 4, true, arg1, var10, var11);
				var31 = new SIDDBHEA(var9, var12, var14.field967, 2, var29, true, arg1, var10, var11);
			}

			arg5.method253(var30, var13, var16, var31, arg3, field1344[arg2], arg0, var15, arg6, field1344[var29]);

			if (var14.field977) {
				if (arg2 == 0) {
					field1347[arg3][arg0][arg6] |= 0x249;
					field1347[arg3][arg0][arg6 + 1] |= 0x492;
				} else if (arg2 == 1) {
					field1347[arg3][arg0][arg6 + 1] |= 0x492;
					field1347[arg3][arg0 + 1][arg6] |= 0x249;
				} else if (arg2 == 2) {
					field1347[arg3][arg0 + 1][arg6] |= 0x249;
					field1347[arg3][arg0][arg6] |= 0x492;
				} else if (arg2 == 3) {
					field1347[arg3][arg0][arg6] |= 0x492;
					field1347[arg3][arg0][arg6] |= 0x249;
				}
			}

			if (var14.field965 && arg7 != null) {
				arg7.method300(arg6, arg0, var14.field966, arg2, arg4);
			}

			if (var14.field987 != 16) {
				arg5.method261(arg0, arg6, var14.field987, arg3);
			}
		} else if (arg4 == 3) {
			BBIXHJOC var32;
			if (var14.field967 == -1 && var14.field945 == null) {
				var32 = var14.method406(3, arg2, var9, var10, var11, var12, -1);
			} else {
				var32 = new SIDDBHEA(var9, var12, var14.field967, 3, arg2, true, arg1, var10, var11);
			}

			arg5.method253(var32, var13, var16, null, arg3, field1346[arg2], arg0, var15, arg6, 0);

			if (var14.field991) {
				if (arg2 == 0) {
					field1334[arg3][arg0][arg6 + 1] = 50;
				} else if (arg2 == 1) {
					field1334[arg3][arg0 + 1][arg6 + 1] = 50;
				} else if (arg2 == 2) {
					field1334[arg3][arg0 + 1][arg6] = 50;
				} else if (arg2 == 3) {
					field1334[arg3][arg0][arg6] = 50;
				}
			}

			if (var14.field965 && arg7 != null) {
				arg7.method300(arg6, arg0, var14.field966, arg2, arg4);
			}
		} else if (arg4 == 9) {
			BBIXHJOC var33;
			if (var14.field967 == -1 && var14.field945 == null) {
				var33 = var14.method406(arg4, arg2, var9, var10, var11, var12, -1);
			} else {
				var33 = new SIDDBHEA(var9, var12, var14.field967, arg4, arg2, true, arg1, var10, var11);
			}

			arg5.method255(1, arg3, var33, 0, var13, arg0, var16, var15, arg6, 1);

			if (var14.field965 && arg7 != null) {
				arg7.method301(arg6, var14.field946, var14.field974, var14.field966, arg2, arg0);
			}
		} else {
			if (var14.field948) {
				if (arg2 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg2 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg2 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg4 == 4) {
				BBIXHJOC var38;
				if (var14.field967 == -1 && var14.field945 == null) {
					var38 = var14.method406(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new SIDDBHEA(var9, var12, var14.field967, 4, 0, true, arg1, var10, var11);
				}

				arg5.method254(0, var16, arg6, var38, 0, var13, arg0, var15, arg2 * 512, field1344[arg2], arg3);
			} else if (arg4 == 5) {
				int var39 = 16;
				int var40 = arg5.method271(arg3, arg0, arg6);
				if (var40 > 0) {
					var39 = KZRNPNVL.method401(var40 >> 14 & 0x7FFF).field987;
				}

				BBIXHJOC var41;
				if (var14.field967 == -1 && var14.field945 == null) {
					var41 = var14.method406(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new SIDDBHEA(var9, var12, var14.field967, 4, 0, true, arg1, var10, var11);
				}

				arg5.method254(field1335[arg2] * var39, var16, arg6, var41, field1345[arg2] * var39, var13, arg0, var15, arg2 * 512, field1344[arg2], arg3);
			} else if (arg4 == 6) {
				BBIXHJOC var42;
				if (var14.field967 == -1 && var14.field945 == null) {
					var42 = var14.method406(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new SIDDBHEA(var9, var12, var14.field967, 4, 0, true, arg1, var10, var11);
				}

				arg5.method254(0, var16, arg6, var42, 0, var13, arg0, var15, arg2, 256, arg3);
			} else if (arg4 == 7) {
				BBIXHJOC var43;
				if (var14.field967 == -1 && var14.field945 == null) {
					var43 = var14.method406(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new SIDDBHEA(var9, var12, var14.field967, 4, 0, true, arg1, var10, var11);
				}

				arg5.method254(0, var16, arg6, var43, 0, var13, arg0, var15, arg2, 512, arg3);
			} else if (arg4 == 8) {
				BBIXHJOC var44;
				if (var14.field967 == -1 && var14.field945 == null) {
					var44 = var14.method406(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new SIDDBHEA(var9, var12, var14.field967, 4, 0, true, arg1, var10, var11);
				}

				arg5.method254(0, var16, arg6, var44, 0, var13, arg0, var15, arg2, 768, arg3);
			}
		}
	}

	@ObfuscatedName("SMJSOFHG.b(II)I")
	public static final int method499(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("SMJSOFHG.c(II)I")
	public final int method500(int arg0, int arg1) {
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

	@ObfuscatedName("SMJSOFHG.c(III)I")
	public final int method501(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("SMJSOFHG.d(II)I")
	public static final int method502(int arg0, int arg1) {
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

	@ObfuscatedName("SMJSOFHG.a(I[BIZII)V")
	public final void method503(int arg0, byte[] arg1, int arg2, int arg3, int arg4) {
		BJPWOXRJ var6 = new BJPWOXRJ(arg1);
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					int var10 = arg3 + var8;
					int var11 = arg4 + var9;
					if (var10 >= 0 && var10 < 104 && var11 >= 0 && var11 < 104) {
						field1332[var7][var10][var11] = 0;
						while (true) {
							int var12 = var6.method15();
							if (var12 == 0) {
								break;
							}

							if (var12 == 1) {
								break;
							}

							if (var12 <= 49) {
								field1325[var7][var10][var11] = var6.method16();
								field1348[var7][var10][var11] = (byte) ((var12 - 2) / 4);
								field1333[var7][var10][var11] = (byte) (var12 - 2 & 0x3);
							} else if (var12 <= 81) {
								field1332[var7][var10][var11] = (byte) (var12 - 49);
							} else {
								field1339[var7][var10][var11] = (byte) (var12 - 81);
							}
						}

						int var13 = var6.method15();
						if (var13 == 1) {
							var13 = 0;
						}

						if (var7 == 0) {
							field1343[0][var10][var11] = -var13 * 8;
						} else {
							field1343[var7][var10][var11] = field1343[var7 - 1][var10][var11] - var13 * 8;
						}

						if (var7 == 0) {
							field1343[0][var10][var11] = -method492(var10 + arg0 + 932731, var11 + 556238 + arg2) * 8;
						} else {
							field1343[var7][var10][var11] = field1343[var7 - 1][var10][var11] - 240;
						}
					} else {
						while (true) {
							int var14 = var6.method15();
							if (var14 == 0) {
								break;
							}

							if (var14 == 1) {
								break;
							}

							if (var14 <= 49) {
								var6.method15();
							}
						}

						var6.method15();
					}
				}
			}
		}
	}

	@ObfuscatedName("SMJSOFHG.e(II)I")
	public static final int method504(int arg0, int arg1) {
		int var2 = method499(arg0 - 1, arg1 - 1) + method499(arg0 + 1, arg1 - 1) + method499(arg0 - 1, arg1 + 1) + method499(arg0 + 1, arg1 + 1);
		int var3 = method499(arg0 - 1, arg1) + method499(arg0 + 1, arg1) + method499(arg0, arg1 - 1) + method499(arg0, arg1 + 1);
		int var4 = method499(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("SMJSOFHG.a(IIILHUQCCBIO;IIIZ[[[ILHFOJZUJK;I)V")
	public static final void method505(int arg0, int arg1, int arg2, HUQCCBIO arg3, int arg4, int arg5, int arg6, int[][][] arg7, HFOJZUJK arg8, int arg9) {
		int var10 = arg7[arg9][arg1][arg6];
		int var11 = arg7[arg9][arg1 + 1][arg6];
		int var12 = arg7[arg9][arg1 + 1][arg6 + 1];
		int var13 = arg7[arg9][arg1][arg6 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		KZRNPNVL var15 = KZRNPNVL.method401(arg4);
		int var16 = (arg4 << 14) + (arg6 << 7) + arg1 + 0x40000000;
		if (!var15.field955) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg0 << 6) + arg2);
		if (arg2 == 22) {
			BBIXHJOC var18;
			if (var15.field967 == -1 && var15.field945 == null) {
				var18 = var15.method406(22, arg0, var10, var11, var12, var13, -1);
			} else {
				var18 = new SIDDBHEA(var10, var13, var15.field967, 22, arg0, true, arg4, var11, var12);
			}

			arg8.method251(var17, var14, var16, arg5, arg6, var18, arg1);

			if (var15.field965 && var15.field955) {
				arg3.method302(arg1, arg6);
			}
		} else if (arg2 == 10 || arg2 == 11) {
			BBIXHJOC var19;
			if (var15.field967 == -1 && var15.field945 == null) {
				var19 = var15.method406(10, arg0, var10, var11, var12, var13, -1);
			} else {
				var19 = new SIDDBHEA(var10, var13, var15.field967, 10, arg0, true, arg4, var11, var12);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg2 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg0 == 1 || arg0 == 3) {
					var21 = var15.field974;
					var22 = var15.field946;
				} else {
					var21 = var15.field946;
					var22 = var15.field974;
				}

				arg8.method255(var21, arg5, var19, var20, var14, arg1, var17, var16, arg6, var22);
			}

			if (var15.field965) {
				arg3.method301(arg6, var15.field946, var15.field974, var15.field966, arg0, arg1);
			}
		} else if (arg2 >= 12) {
			BBIXHJOC var23;
			if (var15.field967 == -1 && var15.field945 == null) {
				var23 = var15.method406(arg2, arg0, var10, var11, var12, var13, -1);
			} else {
				var23 = new SIDDBHEA(var10, var13, var15.field967, arg2, arg0, true, arg4, var11, var12);
			}

			arg8.method255(1, arg5, var23, 0, var14, arg1, var17, var16, arg6, 1);

			if (var15.field965) {
				arg3.method301(arg6, var15.field946, var15.field974, var15.field966, arg0, arg1);
			}
		} else if (arg2 == 0) {
			BBIXHJOC var24;
			if (var15.field967 == -1 && var15.field945 == null) {
				var24 = var15.method406(0, arg0, var10, var11, var12, var13, -1);
			} else {
				var24 = new SIDDBHEA(var10, var13, var15.field967, 0, arg0, true, arg4, var11, var12);
			}

			arg8.method253(var24, var14, var17, null, arg5, field1344[arg0], arg1, var16, arg6, 0);

			if (var15.field965) {
				arg3.method300(arg6, arg1, var15.field966, arg0, arg2);
			}
		} else if (arg2 == 1) {
			BBIXHJOC var25;
			if (var15.field967 == -1 && var15.field945 == null) {
				var25 = var15.method406(1, arg0, var10, var11, var12, var13, -1);
			} else {
				var25 = new SIDDBHEA(var10, var13, var15.field967, 1, arg0, true, arg4, var11, var12);
			}

			arg8.method253(var25, var14, var17, null, arg5, field1346[arg0], arg1, var16, arg6, 0);

			if (var15.field965) {
				arg3.method300(arg6, arg1, var15.field966, arg0, arg2);
			}
		} else if (arg2 == 2) {
			int var26 = arg0 + 1 & 0x3;
			BBIXHJOC var27;
			BBIXHJOC var28;
			if (var15.field967 == -1 && var15.field945 == null) {
				var27 = var15.method406(2, arg0 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method406(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new SIDDBHEA(var10, var13, var15.field967, 2, arg0 + 4, true, arg4, var11, var12);
				var28 = new SIDDBHEA(var10, var13, var15.field967, 2, var26, true, arg4, var11, var12);
			}

			arg8.method253(var27, var14, var17, var28, arg5, field1344[arg0], arg1, var16, arg6, field1344[var26]);

			if (var15.field965) {
				arg3.method300(arg6, arg1, var15.field966, arg0, arg2);
			}
		} else if (arg2 == 3) {
			BBIXHJOC var29;
			if (var15.field967 == -1 && var15.field945 == null) {
				var29 = var15.method406(3, arg0, var10, var11, var12, var13, -1);
			} else {
				var29 = new SIDDBHEA(var10, var13, var15.field967, 3, arg0, true, arg4, var11, var12);
			}

			arg8.method253(var29, var14, var17, null, arg5, field1346[arg0], arg1, var16, arg6, 0);

			if (var15.field965) {
				arg3.method300(arg6, arg1, var15.field966, arg0, arg2);
			}
		} else if (arg2 == 9) {
			BBIXHJOC var30;
			if (var15.field967 == -1 && var15.field945 == null) {
				var30 = var15.method406(arg2, arg0, var10, var11, var12, var13, -1);
			} else {
				var30 = new SIDDBHEA(var10, var13, var15.field967, arg2, arg0, true, arg4, var11, var12);
			}

			arg8.method255(1, arg5, var30, 0, var14, arg1, var17, var16, arg6, 1);

			if (var15.field965) {
				arg3.method301(arg6, var15.field946, var15.field974, var15.field966, arg0, arg1);
			}
		} else {
			if (var15.field948) {
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

			if (arg2 == 4) {
				BBIXHJOC var35;
				if (var15.field967 == -1 && var15.field945 == null) {
					var35 = var15.method406(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new SIDDBHEA(var10, var13, var15.field967, 4, 0, true, arg4, var11, var12);
				}

				arg8.method254(0, var17, arg6, var35, 0, var14, arg1, var16, arg0 * 512, field1344[arg0], arg5);
			} else if (arg2 == 5) {
				int var36 = 16;
				int var37 = arg8.method271(arg5, arg1, arg6);
				if (var37 > 0) {
					var36 = KZRNPNVL.method401(var37 >> 14 & 0x7FFF).field987;
				}

				BBIXHJOC var38;
				if (var15.field967 == -1 && var15.field945 == null) {
					var38 = var15.method406(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new SIDDBHEA(var10, var13, var15.field967, 4, 0, true, arg4, var11, var12);
				}

				arg8.method254(field1335[arg0] * var36, var17, arg6, var38, field1345[arg0] * var36, var14, arg1, var16, arg0 * 512, field1344[arg0], arg5);
			} else if (arg2 == 6) {
				BBIXHJOC var39;
				if (var15.field967 == -1 && var15.field945 == null) {
					var39 = var15.method406(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new SIDDBHEA(var10, var13, var15.field967, 4, 0, true, arg4, var11, var12);
				}

				arg8.method254(0, var17, arg6, var39, 0, var14, arg1, var16, arg0, 256, arg5);
			} else if (arg2 == 7) {
				BBIXHJOC var40;
				if (var15.field967 == -1 && var15.field945 == null) {
					var40 = var15.method406(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new SIDDBHEA(var10, var13, var15.field967, 4, 0, true, arg4, var11, var12);
				}

				arg8.method254(0, var17, arg6, var40, 0, var14, arg1, var16, arg0, 512, arg5);
			} else if (arg2 == 8) {
				BBIXHJOC var41;
				if (var15.field967 == -1 && var15.field945 == null) {
					var41 = var15.method406(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new SIDDBHEA(var10, var13, var15.field967, 4, 0, true, arg4, var11, var12);
				}

				arg8.method254(0, var17, arg6, var41, 0, var14, arg1, var16, arg0, 768, arg5);
			}
		}
	}

	@ObfuscatedName("SMJSOFHG.a(LHFOJZUJK;I[LHUQCCBIO;)V")
	public final void method506(HFOJZUJK arg0, HUQCCBIO[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1332[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1332[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method302(var4, var5);
						}
					}
				}
			}
		}

		field1341 += (int) (Math.random() * 5.0D) - 2;
		if (field1341 < -8) {
			field1341 = -8;
		}

		if (field1341 > 8) {
			field1341 = 8;
		}

		field1340 += (int) (Math.random() * 5.0D) - 2;
		if (field1340 < -16) {
			field1340 = -16;
		}

		if (field1340 > 16) {
			field1340 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1334[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1337 - 1; var16++) {
				for (int var17 = 1; var17 < field1336 - 1; var17++) {
					int var18 = field1343[var7][var17 + 1][var16] - field1343[var7][var17 - 1][var16];
					int var19 = field1343[var7][var17][var16 + 1] - field1343[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1331[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1337; var26++) {
				field1326[var26] = 0;
				field1327[var26] = 0;
				field1328[var26] = 0;
				field1329[var26] = 0;
				field1330[var26] = 0;
			}

			for (int var27 = -5; var27 < field1336 + 5; var27++) {
				for (int var28 = 0; var28 < field1337; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1336) {
						int var30 = field1339[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							KJOXMCRE var31 = KJOXMCRE.field905[var30 - 1];
							field1326[var28] += var31.field914;
							field1327[var28] += var31.field912;
							field1328[var28] += var31.field913;
							field1329[var28] += var31.field915;
							field1330[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1336) {
						int var33 = field1339[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							KJOXMCRE var34 = KJOXMCRE.field905[var33 - 1];
							field1326[var28] -= var34.field914;
							field1327[var28] -= var34.field912;
							field1328[var28] -= var34.field913;
							field1329[var28] -= var34.field915;
							field1330[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1336 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1337 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1337) {
							var35 += field1326[var41];
							var36 += field1327[var41];
							var37 += field1328[var41];
							var38 += field1329[var41];
							var39 += field1330[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1337) {
							var35 -= field1326[var42];
							var36 -= field1327[var42];
							var37 -= field1328[var42];
							var38 -= field1329[var42];
							var39 -= field1330[var42];
						}

						if (var40 >= 1 && var40 < field1337 - 1 && (!field1338 || (field1332[var7][var27][var40] & 0x10) == 0 && method497(var27, var40, var7) == field1342)) {
							int var43 = field1339[var7][var27][var40] & 0xFF;
							int var44 = field1325[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1343[var7][var27][var40];
								int var46 = field1343[var7][var27 + 1][var40];
								int var47 = field1343[var7][var27 + 1][var40 + 1];
								int var48 = field1343[var7][var27][var40 + 1];
								int var49 = field1331[var27][var40];
								int var50 = field1331[var27 + 1][var40];
								int var51 = field1331[var27 + 1][var40 + 1];
								int var52 = field1331[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method501(var55, var56, var57);
									var55 = field1341 + var55 & 0xFF;
									var57 += field1340;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method501(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1348[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !KJOXMCRE.field905[var44 - 1].field910) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1347[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = FWQLREOO.field620[method502(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method250(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method502(var53, var49), method502(var53, var50), method502(var53, var51), method502(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1348[var7][var27][var40] + 1;
									byte var61 = field1333[var7][var27][var40];
									KJOXMCRE var62 = KJOXMCRE.field905[var44 - 1];
									int var63 = var62.field908;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = FWQLREOO.method212(var63);
										var65 = -1;
									} else if (var62.field907 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method501(var62.field911, var62.field912, var62.field913);
										var64 = FWQLREOO.field620[method500(var62.field916, 96)];
									}

									arg0.method250(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method502(var53, var49), method502(var53, var50), method502(var53, var51), method502(var53, var52), method500(var65, var49), method500(var65, var50), method500(var65, var51), method500(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1337 - 1; var66++) {
				for (int var67 = 1; var67 < field1336 - 1; var67++) {
					arg0.method249(var7, var67, var66, method497(var67, var66, var7));
				}
			}
		}

		arg0.method276(-10, -50, -50, 64, 768);

		for (int var68 = 0; var68 < field1336; var68++) {
			for (int var69 = 0; var69 < field1337; var69++) {
				if ((field1332[1][var68][var69] & 0x2) == 2) {
					arg0.method247(var69, var68);
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
				for (int var75 = 0; var75 <= field1337; var75++) {
					for (int var76 = 0; var76 <= field1336; var76++) {
						if ((field1347[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1347[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1337 && (field1347[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label321: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1347[var79 - 1][var76][var81] & var70) == 0) {
										break label321;
									}
								}

								var79--;
							}

							label310: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1347[var80 + 1][var76][var82] & var70) == 0) {
										break label310;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1343[var80][var76][var77] - var84;
								int var86 = field1343[var79][var76][var77];
								HFOJZUJK.method248(var86, 1, var73, var76 * 128, var77 * 128, var78 * 128 + 128, var76 * 128, var85);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1347[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1347[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1347[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1336 && (field1347[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label374: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1347[var91 - 1][var93][var75] & var71) == 0) {
										break label374;
									}
								}

								var91--;
							}

							label363: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1347[var92 + 1][var94][var75] & var71) == 0) {
										break label363;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1343[var92][var89][var75] - var96;
								int var98 = field1343[var91][var89][var75];
								HFOJZUJK.method248(var98, 2, var73, var89 * 128, var75 * 128, var75 * 128, var90 * 128 + 128, var97);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1347[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1347[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1347[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1337 && (field1347[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label427: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1347[var74][var101 - 1][var105] & var72) == 0) {
										break label427;
									}
								}

								var101--;
							}

							label416: while (var102 < field1336) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1347[var74][var102 + 1][var106] & var72) == 0) {
										break label416;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1343[var74][var101][var103];
								HFOJZUJK.method248(var107, 4, var73, var101 * 128, var103 * 128, var104 * 128 + 128, var102 * 128 + 128, var107);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1347[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("SMJSOFHG.a(IIIIZ)V")
	public final void method507(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg0; var5 <= arg0 + arg1; var5++) {
			for (int var6 = arg3; var6 <= arg2 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1336 && var5 >= 0 && var5 < field1337) {
					field1334[0][var6][var5] = 127;

					if (arg3 == var6 && var6 > 0) {
						field1343[0][var6][var5] = field1343[0][var6 - 1][var5];
					}

					if (arg2 + arg3 == var6 && var6 < field1336 - 1) {
						field1343[0][var6][var5] = field1343[0][var6 + 1][var5];
					}

					if (arg0 == var5 && var5 > 0) {
						field1343[0][var6][var5] = field1343[0][var6][var5 - 1];
					}

					if (arg0 + arg1 == var5 && var5 < field1337 - 1) {
						field1343[0][var6][var5] = field1343[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	public SMJSOFHG(byte[][][] arg0, int arg1, int[][][] arg2, int arg3) {
		field1336 = arg3;
		field1337 = arg1;
		field1343 = arg2;
		field1332 = arg0;
		field1339 = new byte[4][field1336][field1337];
		field1325 = new byte[4][field1336][field1337];
		field1348 = new byte[4][field1336][field1337];
		field1333 = new byte[4][field1336][field1337];
		field1347 = new int[4][field1336 + 1][field1337 + 1];
		field1334 = new byte[4][field1336 + 1][field1337 + 1];
		field1331 = new int[field1336 + 1][field1337 + 1];
		field1326 = new int[field1337];
		field1327 = new int[field1337];
		field1328 = new int[field1337];
		field1329 = new int[field1337];
		field1330 = new int[field1337];
	}
}
