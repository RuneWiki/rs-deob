package deob;

@ObfuscatedName("BRNLHXCU")
public final class BRNLHXCU {

	@ObfuscatedName("BRNLHXCU.p")
	public int field44;

	@ObfuscatedName("BRNLHXCU.q")
	public int field45;

	@ObfuscatedName("BRNLHXCU.t")
	public int[][][] field48;

	@ObfuscatedName("BRNLHXCU.n")
	public byte[][][] field42;

	@ObfuscatedName("BRNLHXCU.a")
	public byte[][][] field31;

	@ObfuscatedName("BRNLHXCU.v")
	public byte[][][] field49;

	@ObfuscatedName("BRNLHXCU.r")
	public byte[][][] field46;

	@ObfuscatedName("BRNLHXCU.s")
	public byte[][][] field47;

	@ObfuscatedName("BRNLHXCU.b")
	public int[][][] field32;

	@ObfuscatedName("BRNLHXCU.B")
	public byte[][][] field53;

	@ObfuscatedName("BRNLHXCU.m")
	public int[][] field41;

	@ObfuscatedName("BRNLHXCU.h")
	public int[] field36;

	@ObfuscatedName("BRNLHXCU.i")
	public int[] field37;

	@ObfuscatedName("BRNLHXCU.j")
	public int[] field38;

	@ObfuscatedName("BRNLHXCU.k")
	public int[] field39;

	@ObfuscatedName("BRNLHXCU.l")
	public int[] field40;

	@ObfuscatedName("BRNLHXCU.f")
	public static final int[] field35 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("BRNLHXCU.o")
	public static final int[] field43 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("BRNLHXCU.w")
	public static final int[] field50 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("BRNLHXCU.A")
	public static final int[] field52 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("BRNLHXCU.F")
	public static boolean field54 = true;

	@ObfuscatedName("BRNLHXCU.c")
	public static int field33 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("BRNLHXCU.e")
	public static int field34 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("BRNLHXCU.y")
	public static int field51;

	@ObfuscatedName("BRNLHXCU.a(IIIIIIILUGKPKMOJ;LONADPAJP;)V")
	public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, UGKPKMOJ arg6, ONADPAJP arg7) {
		if (field54) {
			if ((field42[arg1][arg2][arg4] & 0x10) != 0) {
				return;
			}

			if (method23(arg2, arg1, arg4) != field51) {
				return;
			}
		}

		int var9 = field48[arg1][arg2][arg4];
		int var10 = field48[arg1][arg2 + 1][arg4];
		int var11 = field48[arg1][arg2 + 1][arg4 + 1];
		int var12 = field48[arg1][arg2][arg4 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		VCGOMUBN var14 = VCGOMUBN.method568(arg0);
		int var15 = (arg0 << 14) + (arg4 << 7) + arg2 + 0x40000000;
		if (!var14.field1389) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg5 << 6) + arg3);
		if (arg3 == 22) {
			if (!field54 || var14.field1389 || var14.field1423) {
				FRPXDCME var17;
				if (var14.field1384 == -1 && var14.field1412 == null) {
					var17 = var14.method569(22, arg5, var9, var10, var11, var12, -1);
				} else {
					var17 = new MSKEMKWR(var10, var12, arg0, arg5, var11, var9, true, var14.field1384, 22);
				}

				arg6.method513(var17, arg2, arg4, var15, var13, arg1, var16);

				if (var14.field1396 && var14.field1389 && arg7 != null) {
					arg7.method454(arg2, arg4);
				}
			}
		} else if (arg3 == 10 || arg3 == 11) {
			FRPXDCME var18;
			if (var14.field1384 == -1 && var14.field1412 == null) {
				var18 = var14.method569(10, arg5, var9, var10, var11, var12, -1);
			} else {
				var18 = new MSKEMKWR(var10, var12, arg0, arg5, var11, var9, true, var14.field1384, 10);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg3 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg5 == 1 || arg5 == 3) {
					var20 = var14.field1392;
					var21 = var14.field1420;
				} else {
					var20 = var14.field1420;
					var21 = var14.field1392;
				}

				if (arg6.method517(var13, arg4, var19, var18, arg1, var16, arg2, var21, var20, var15) && var14.field1383) {
					GFYXEFQY var22;
					if (var18 instanceof GFYXEFQY) {
						var22 = (GFYXEFQY) var18;
					} else {
						var22 = var14.method569(10, arg5, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field777 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field53[arg1][arg2 + var23][arg4 + var24]) {
									field53[arg1][arg2 + var23][arg4 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1396 && arg7 != null) {
				arg7.method453(var14.field1420, var14.field1419, var14.field1392, arg2, arg4, arg5);
			}
		} else if (arg3 >= 12) {
			FRPXDCME var26;
			if (var14.field1384 == -1 && var14.field1412 == null) {
				var26 = var14.method569(arg3, arg5, var9, var10, var11, var12, -1);
			} else {
				var26 = new MSKEMKWR(var10, var12, arg0, arg5, var11, var9, true, var14.field1384, arg3);
			}

			arg6.method517(var13, arg4, 0, var26, arg1, var16, arg2, 1, 1, var15);

			if (arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0) {
				field32[arg1][arg2][arg4] |= 0x924;
			}

			if (var14.field1396 && arg7 != null) {
				arg7.method453(var14.field1420, var14.field1419, var14.field1392, arg2, arg4, arg5);
			}
		} else if (arg3 == 0) {
			FRPXDCME var27;
			if (var14.field1384 == -1 && var14.field1412 == null) {
				var27 = var14.method569(0, arg5, var9, var10, var11, var12, -1);
			} else {
				var27 = new MSKEMKWR(var10, var12, arg0, arg5, var11, var9, true, var14.field1384, 0);
			}

			arg6.method515(var15, arg2, field43[arg5], var27, 0, arg4, var13, var16, arg1, null);

			if (arg5 == 0) {
				if (var14.field1383) {
					field53[arg1][arg2][arg4] = 50;
					field53[arg1][arg2][arg4 + 1] = 50;
				}

				if (var14.field1406) {
					field32[arg1][arg2][arg4] |= 0x249;
				}
			} else if (arg5 == 1) {
				if (var14.field1383) {
					field53[arg1][arg2][arg4 + 1] = 50;
					field53[arg1][arg2 + 1][arg4 + 1] = 50;
				}

				if (var14.field1406) {
					field32[arg1][arg2][arg4 + 1] |= 0x492;
				}
			} else if (arg5 == 2) {
				if (var14.field1383) {
					field53[arg1][arg2 + 1][arg4] = 50;
					field53[arg1][arg2 + 1][arg4 + 1] = 50;
				}

				if (var14.field1406) {
					field32[arg1][arg2 + 1][arg4] |= 0x249;
				}
			} else if (arg5 == 3) {
				if (var14.field1383) {
					field53[arg1][arg2][arg4] = 50;
					field53[arg1][arg2 + 1][arg4] = 50;
				}

				if (var14.field1406) {
					field32[arg1][arg2][arg4] |= 0x492;
				}
			}

			if (var14.field1396 && arg7 != null) {
				arg7.method452(arg2, var14.field1419, arg4, arg5, arg3);
			}

			if (var14.field1385 != 16) {
				arg6.method523(arg4, var14.field1385, arg2, arg1);
			}
		} else if (arg3 == 1) {
			FRPXDCME var28;
			if (var14.field1384 == -1 && var14.field1412 == null) {
				var28 = var14.method569(1, arg5, var9, var10, var11, var12, -1);
			} else {
				var28 = new MSKEMKWR(var10, var12, arg0, arg5, var11, var9, true, var14.field1384, 1);
			}

			arg6.method515(var15, arg2, field52[arg5], var28, 0, arg4, var13, var16, arg1, null);

			if (var14.field1383) {
				if (arg5 == 0) {
					field53[arg1][arg2][arg4 + 1] = 50;
				} else if (arg5 == 1) {
					field53[arg1][arg2 + 1][arg4 + 1] = 50;
				} else if (arg5 == 2) {
					field53[arg1][arg2 + 1][arg4] = 50;
				} else if (arg5 == 3) {
					field53[arg1][arg2][arg4] = 50;
				}
			}

			if (var14.field1396 && arg7 != null) {
				arg7.method452(arg2, var14.field1419, arg4, arg5, arg3);
			}
		} else if (arg3 == 2) {
			int var29 = arg5 + 1 & 0x3;
			FRPXDCME var30;
			FRPXDCME var31;
			if (var14.field1384 == -1 && var14.field1412 == null) {
				var30 = var14.method569(2, arg5 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method569(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new MSKEMKWR(var10, var12, arg0, arg5 + 4, var11, var9, true, var14.field1384, 2);
				var31 = new MSKEMKWR(var10, var12, arg0, var29, var11, var9, true, var14.field1384, 2);
			}

			arg6.method515(var15, arg2, field43[arg5], var30, field43[var29], arg4, var13, var16, arg1, var31);

			if (var14.field1406) {
				if (arg5 == 0) {
					field32[arg1][arg2][arg4] |= 0x249;
					field32[arg1][arg2][arg4 + 1] |= 0x492;
				} else if (arg5 == 1) {
					field32[arg1][arg2][arg4 + 1] |= 0x492;
					field32[arg1][arg2 + 1][arg4] |= 0x249;
				} else if (arg5 == 2) {
					field32[arg1][arg2 + 1][arg4] |= 0x249;
					field32[arg1][arg2][arg4] |= 0x492;
				} else if (arg5 == 3) {
					field32[arg1][arg2][arg4] |= 0x492;
					field32[arg1][arg2][arg4] |= 0x249;
				}
			}

			if (var14.field1396 && arg7 != null) {
				arg7.method452(arg2, var14.field1419, arg4, arg5, arg3);
			}

			if (var14.field1385 != 16) {
				arg6.method523(arg4, var14.field1385, arg2, arg1);
			}
		} else if (arg3 == 3) {
			FRPXDCME var32;
			if (var14.field1384 == -1 && var14.field1412 == null) {
				var32 = var14.method569(3, arg5, var9, var10, var11, var12, -1);
			} else {
				var32 = new MSKEMKWR(var10, var12, arg0, arg5, var11, var9, true, var14.field1384, 3);
			}

			arg6.method515(var15, arg2, field52[arg5], var32, 0, arg4, var13, var16, arg1, null);

			if (var14.field1383) {
				if (arg5 == 0) {
					field53[arg1][arg2][arg4 + 1] = 50;
				} else if (arg5 == 1) {
					field53[arg1][arg2 + 1][arg4 + 1] = 50;
				} else if (arg5 == 2) {
					field53[arg1][arg2 + 1][arg4] = 50;
				} else if (arg5 == 3) {
					field53[arg1][arg2][arg4] = 50;
				}
			}

			if (var14.field1396 && arg7 != null) {
				arg7.method452(arg2, var14.field1419, arg4, arg5, arg3);
			}
		} else if (arg3 == 9) {
			FRPXDCME var33;
			if (var14.field1384 == -1 && var14.field1412 == null) {
				var33 = var14.method569(arg3, arg5, var9, var10, var11, var12, -1);
			} else {
				var33 = new MSKEMKWR(var10, var12, arg0, arg5, var11, var9, true, var14.field1384, arg3);
			}

			arg6.method517(var13, arg4, 0, var33, arg1, var16, arg2, 1, 1, var15);

			if (var14.field1396 && arg7 != null) {
				arg7.method453(var14.field1420, var14.field1419, var14.field1392, arg2, arg4, arg5);
			}
		} else {
			if (var14.field1380) {
				if (arg5 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg5 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg5 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg3 == 4) {
				FRPXDCME var38;
				if (var14.field1384 == -1 && var14.field1412 == null) {
					var38 = var14.method569(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new MSKEMKWR(var10, var12, arg0, 0, var11, var9, true, var14.field1384, 4);
				}

				arg6.method516(var13, arg2, arg1, 0, var38, arg4, 0, var15, var16, arg5 * 512, field43[arg5]);
			} else if (arg3 == 5) {
				int var39 = 16;
				int var40 = arg6.method533(arg1, arg2, arg4);
				if (var40 > 0) {
					var39 = VCGOMUBN.method568(var40 >> 14 & 0x7FFF).field1385;
				}

				FRPXDCME var41;
				if (var14.field1384 == -1 && var14.field1412 == null) {
					var41 = var14.method569(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new MSKEMKWR(var10, var12, arg0, 0, var11, var9, true, var14.field1384, 4);
				}

				arg6.method516(var13, arg2, arg1, field50[arg5] * var39, var41, arg4, field35[arg5] * var39, var15, var16, arg5 * 512, field43[arg5]);
			} else if (arg3 == 6) {
				FRPXDCME var42;
				if (var14.field1384 == -1 && var14.field1412 == null) {
					var42 = var14.method569(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new MSKEMKWR(var10, var12, arg0, 0, var11, var9, true, var14.field1384, 4);
				}

				arg6.method516(var13, arg2, arg1, 0, var42, arg4, 0, var15, var16, arg5, 256);
			} else if (arg3 == 7) {
				FRPXDCME var43;
				if (var14.field1384 == -1 && var14.field1412 == null) {
					var43 = var14.method569(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new MSKEMKWR(var10, var12, arg0, 0, var11, var9, true, var14.field1384, 4);
				}

				arg6.method516(var13, arg2, arg1, 0, var43, arg4, 0, var15, var16, arg5, 512);
			} else if (arg3 == 8) {
				FRPXDCME var44;
				if (var14.field1384 == -1 && var14.field1412 == null) {
					var44 = var14.method569(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new MSKEMKWR(var10, var12, arg0, 0, var11, var9, true, var14.field1384, 4);
				}

				arg6.method516(var13, arg2, arg1, 0, var44, arg4, 0, var15, var16, arg5, 768);
			}
		}
	}

	@ObfuscatedName("BRNLHXCU.a(III)Z")
	public static final boolean method5(int arg0, int arg1) {
		VCGOMUBN var2 = VCGOMUBN.method568(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method566(arg1);
	}

	@ObfuscatedName("BRNLHXCU.a(II)I")
	public static final int method6(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("BRNLHXCU.b(II)I")
	public static final int method7(int arg0, int arg1) {
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

	@ObfuscatedName("BRNLHXCU.a(IIIIILCKBTFRZM;II)V")
	public final void method8(int arg0, int arg1, int arg2, int arg3, CKBTFRZM arg4, int arg5, int arg6) {
		if (arg0 >= 0 && arg0 < 104 && arg6 >= 0 && arg6 < 104) {
			field42[arg3][arg0][arg6] = 0;
			while (true) {
				int var8 = arg4.method44();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg4.method44();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg3 == 0) {
						field48[0][arg0][arg6] = -var9 * 8;
						return;
					}

					field48[arg3][arg0][arg6] = field48[arg3 - 1][arg0][arg6] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field49[arg3][arg0][arg6] = arg4.method45();
					field46[arg3][arg0][arg6] = (byte) ((var8 - 2) / 4);
					field47[arg3][arg0][arg6] = (byte) (var8 + arg5 - 2 & 0x3);
				} else if (var8 <= 81) {
					field42[arg3][arg0][arg6] = (byte) (var8 - 49);
				} else {
					field31[arg3][arg0][arg6] = (byte) (var8 - 81);
				}
			}

			if (arg3 == 0) {
				field48[0][arg0][arg6] = -method11(arg0 + arg1 + 932731, arg6 + 556238 + arg2) * 8;
			} else {
				field48[arg3][arg0][arg6] = field48[arg3 - 1][arg0][arg6] - 240;
			}
		} else {
			while (true) {
				int var10 = arg4.method44();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg4.method44();
					return;
				}

				if (var10 <= 49) {
					arg4.method44();
				}
			}
		}
	}

	@ObfuscatedName("BRNLHXCU.c(II)I")
	public final int method9(int arg0, int arg1) {
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

	@ObfuscatedName("BRNLHXCU.d(II)I")
	public static final int method10(int arg0, int arg1) {
		int var2 = method6(arg0 - 1, arg1 - 1) + method6(arg0 + 1, arg1 - 1) + method6(arg0 - 1, arg1 + 1) + method6(arg0 + 1, arg1 + 1);
		int var3 = method6(arg0 - 1, arg1) + method6(arg0 + 1, arg1) + method6(arg0, arg1 - 1) + method6(arg0, arg1 + 1);
		int var4 = method6(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("BRNLHXCU.e(II)I")
	public static final int method11(int arg0, int arg1) {
		int var2 = method15(arg0 + 45365, arg1 + 91923, 4) + (method15(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method15(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("BRNLHXCU.a(III[[[ILUGKPKMOJ;LONADPAJP;ZIIII)V")
	public static final void method12(int arg0, int arg1, int arg2, int[][][] arg3, UGKPKMOJ arg4, ONADPAJP arg5, int arg6, int arg7, int arg8, int arg9) {
		int var10 = arg3[arg8][arg0][arg2];
		int var11 = arg3[arg8][arg0 + 1][arg2];
		int var12 = arg3[arg8][arg0 + 1][arg2 + 1];
		int var13 = arg3[arg8][arg0][arg2 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		VCGOMUBN var15 = VCGOMUBN.method568(arg1);
		int var16 = (arg1 << 14) + (arg2 << 7) + arg0 + 0x40000000;
		if (!var15.field1389) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg9 << 6) + arg6);
		if (arg6 == 22) {
			FRPXDCME var18;
			if (var15.field1384 == -1 && var15.field1412 == null) {
				var18 = var15.method569(22, arg9, var10, var11, var12, var13, -1);
			} else {
				var18 = new MSKEMKWR(var11, var13, arg1, arg9, var12, var10, true, var15.field1384, 22);
			}

			arg4.method513(var18, arg0, arg2, var16, var14, arg7, var17);

			if (var15.field1396 && var15.field1389) {
				arg5.method454(arg0, arg2);
			}
		} else if (arg6 == 10 || arg6 == 11) {
			FRPXDCME var19;
			if (var15.field1384 == -1 && var15.field1412 == null) {
				var19 = var15.method569(10, arg9, var10, var11, var12, var13, -1);
			} else {
				var19 = new MSKEMKWR(var11, var13, arg1, arg9, var12, var10, true, var15.field1384, 10);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg6 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg9 == 1 || arg9 == 3) {
					var21 = var15.field1392;
					var22 = var15.field1420;
				} else {
					var21 = var15.field1420;
					var22 = var15.field1392;
				}

				arg4.method517(var14, arg2, var20, var19, arg7, var17, arg0, var22, var21, var16);
			}

			if (var15.field1396) {
				arg5.method453(var15.field1420, var15.field1419, var15.field1392, arg0, arg2, arg9);
			}
		} else if (arg6 >= 12) {
			FRPXDCME var23;
			if (var15.field1384 == -1 && var15.field1412 == null) {
				var23 = var15.method569(arg6, arg9, var10, var11, var12, var13, -1);
			} else {
				var23 = new MSKEMKWR(var11, var13, arg1, arg9, var12, var10, true, var15.field1384, arg6);
			}

			arg4.method517(var14, arg2, 0, var23, arg7, var17, arg0, 1, 1, var16);

			if (var15.field1396) {
				arg5.method453(var15.field1420, var15.field1419, var15.field1392, arg0, arg2, arg9);
			}
		} else if (arg6 == 0) {
			FRPXDCME var24;
			if (var15.field1384 == -1 && var15.field1412 == null) {
				var24 = var15.method569(0, arg9, var10, var11, var12, var13, -1);
			} else {
				var24 = new MSKEMKWR(var11, var13, arg1, arg9, var12, var10, true, var15.field1384, 0);
			}

			arg4.method515(var16, arg0, field43[arg9], var24, 0, arg2, var14, var17, arg7, null);

			if (var15.field1396) {
				arg5.method452(arg0, var15.field1419, arg2, arg9, arg6);
			}
		} else if (arg6 == 1) {
			FRPXDCME var25;
			if (var15.field1384 == -1 && var15.field1412 == null) {
				var25 = var15.method569(1, arg9, var10, var11, var12, var13, -1);
			} else {
				var25 = new MSKEMKWR(var11, var13, arg1, arg9, var12, var10, true, var15.field1384, 1);
			}

			arg4.method515(var16, arg0, field52[arg9], var25, 0, arg2, var14, var17, arg7, null);

			if (var15.field1396) {
				arg5.method452(arg0, var15.field1419, arg2, arg9, arg6);
			}
		} else if (arg6 == 2) {
			int var26 = arg9 + 1 & 0x3;
			FRPXDCME var27;
			FRPXDCME var28;
			if (var15.field1384 == -1 && var15.field1412 == null) {
				var27 = var15.method569(2, arg9 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method569(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new MSKEMKWR(var11, var13, arg1, arg9 + 4, var12, var10, true, var15.field1384, 2);
				var28 = new MSKEMKWR(var11, var13, arg1, var26, var12, var10, true, var15.field1384, 2);
			}

			arg4.method515(var16, arg0, field43[arg9], var27, field43[var26], arg2, var14, var17, arg7, var28);

			if (var15.field1396) {
				arg5.method452(arg0, var15.field1419, arg2, arg9, arg6);
			}
		} else if (arg6 == 3) {
			FRPXDCME var29;
			if (var15.field1384 == -1 && var15.field1412 == null) {
				var29 = var15.method569(3, arg9, var10, var11, var12, var13, -1);
			} else {
				var29 = new MSKEMKWR(var11, var13, arg1, arg9, var12, var10, true, var15.field1384, 3);
			}

			arg4.method515(var16, arg0, field52[arg9], var29, 0, arg2, var14, var17, arg7, null);

			if (var15.field1396) {
				arg5.method452(arg0, var15.field1419, arg2, arg9, arg6);
			}
		} else if (arg6 == 9) {
			FRPXDCME var30;
			if (var15.field1384 == -1 && var15.field1412 == null) {
				var30 = var15.method569(arg6, arg9, var10, var11, var12, var13, -1);
			} else {
				var30 = new MSKEMKWR(var11, var13, arg1, arg9, var12, var10, true, var15.field1384, arg6);
			}

			arg4.method517(var14, arg2, 0, var30, arg7, var17, arg0, 1, 1, var16);

			if (var15.field1396) {
				arg5.method453(var15.field1420, var15.field1419, var15.field1392, arg0, arg2, arg9);
			}
		} else {
			if (var15.field1380) {
				if (arg9 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg9 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg9 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg6 == 4) {
				FRPXDCME var35;
				if (var15.field1384 == -1 && var15.field1412 == null) {
					var35 = var15.method569(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new MSKEMKWR(var11, var13, arg1, 0, var12, var10, true, var15.field1384, 4);
				}

				arg4.method516(var14, arg0, arg7, 0, var35, arg2, 0, var16, var17, arg9 * 512, field43[arg9]);
			} else if (arg6 == 5) {
				int var36 = 16;
				int var37 = arg4.method533(arg7, arg0, arg2);
				if (var37 > 0) {
					var36 = VCGOMUBN.method568(var37 >> 14 & 0x7FFF).field1385;
				}

				FRPXDCME var38;
				if (var15.field1384 == -1 && var15.field1412 == null) {
					var38 = var15.method569(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new MSKEMKWR(var11, var13, arg1, 0, var12, var10, true, var15.field1384, 4);
				}

				arg4.method516(var14, arg0, arg7, field50[arg9] * var36, var38, arg2, field35[arg9] * var36, var16, var17, arg9 * 512, field43[arg9]);
			} else if (arg6 == 6) {
				FRPXDCME var39;
				if (var15.field1384 == -1 && var15.field1412 == null) {
					var39 = var15.method569(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new MSKEMKWR(var11, var13, arg1, 0, var12, var10, true, var15.field1384, 4);
				}

				arg4.method516(var14, arg0, arg7, 0, var39, arg2, 0, var16, var17, arg9, 256);
			} else if (arg6 == 7) {
				FRPXDCME var40;
				if (var15.field1384 == -1 && var15.field1412 == null) {
					var40 = var15.method569(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new MSKEMKWR(var11, var13, arg1, 0, var12, var10, true, var15.field1384, 4);
				}

				arg4.method516(var14, arg0, arg7, 0, var40, arg2, 0, var16, var17, arg9, 512);
			} else if (arg6 == 8) {
				FRPXDCME var41;
				if (var15.field1384 == -1 && var15.field1412 == null) {
					var41 = var15.method569(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new MSKEMKWR(var11, var13, arg1, 0, var12, var10, true, var15.field1384, 4);
				}

				arg4.method516(var14, arg0, arg7, 0, var41, arg2, 0, var16, var17, arg9, 768);
			}
		}
	}

	@ObfuscatedName("BRNLHXCU.a(ZIIII)V")
	public final void method13(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg0 + arg2; var5++) {
			for (int var6 = arg1; var6 <= arg1 + arg3; var6++) {
				if (var6 >= 0 && var6 < field44 && var5 >= 0 && var5 < field45) {
					field53[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field48[0][var6][var5] = field48[0][var6 - 1][var5];
					}

					if (arg1 + arg3 == var6 && var6 < field44 - 1) {
						field48[0][var6][var5] = field48[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field48[0][var6][var5] = field48[0][var6][var5 - 1];
					}

					if (arg0 + arg2 == var5 && var5 < field45 - 1) {
						field48[0][var6][var5] = field48[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("BRNLHXCU.a(I[BIIII[LONADPAJP;)V")
	public final void method14(int arg0, byte[] arg1, int arg2, int arg3, int arg4, ONADPAJP[] arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg0 + var8 > 0 && arg0 + var8 < 103 && arg3 + var9 > 0 && arg3 + var9 < 103) {
						arg5[var7].field1092[arg0 + var8][arg3 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		CKBTFRZM var10 = new CKBTFRZM(arg1);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method8(arg0 + var12, arg2, arg4, var11, var10, 0, arg3 + var13);
				}
			}
		}
	}

	@ObfuscatedName("BRNLHXCU.b(III)I")
	public static final int method15(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method10(var3, var5);
		int var8 = method10(var3 + 1, var5);
		int var9 = method10(var3, var5 + 1);
		int var10 = method10(var3 + 1, var5 + 1);
		int var11 = method22(var7, var8, var4, arg2);
		int var12 = method22(var9, var10, var4, arg2);
		return method22(var11, var12, var6, arg2);
	}

	@ObfuscatedName("BRNLHXCU.a(ILUGKPKMOJ;[BIIIBII[LONADPAJP;I)V")
	public final void method16(int arg0, UGKPKMOJ arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, ONADPAJP[] arg8, int arg9) {
		CKBTFRZM var11 = new CKBTFRZM(arg2);
		int var12 = -1;
		while (true) {
			int var13 = var11.method58();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method58();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method44();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg3 == var18 && var17 >= arg7 && var17 < arg7 + 8 && var16 >= arg5 && var16 < arg5 + 8) {
					VCGOMUBN var22 = VCGOMUBN.method568(var12);
					int var23 = arg0 + GDGWLQOM.method335(var22.field1420, var22.field1392, var16 & 0x7, arg6, var17 & 0x7);
					int var24 = arg9 + GDGWLQOM.method336(var22.field1420, arg6, var17 & 0x7, var22.field1392, var16 & 0x7);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = var18;
						if ((field42[1][var23][var24] & 0x2) == 2) {
							var25 = var18 - 1;
						}

						ONADPAJP var26 = null;
						if (var25 >= 0) {
							var26 = arg8[var25];
						}

						method4(var12, var18, var23, var20, var24, arg6 + var21 & 0x3, arg1, var26);
					}
				}
			}
		}
	}

	@ObfuscatedName("BRNLHXCU.a(LUGKPKMOJ;[LONADPAJP;I)V")
	public final void method17(UGKPKMOJ arg0, ONADPAJP[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field42[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field42[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method454(var4, var5);
						}
					}
				}
			}
		}

		field33 += (int) (Math.random() * 5.0D) - 2;
		if (field33 < -8) {
			field33 = -8;
		}

		if (field33 > 8) {
			field33 = 8;
		}

		field34 += (int) (Math.random() * 5.0D) - 2;
		if (field34 < -16) {
			field34 = -16;
		}

		if (field34 > 16) {
			field34 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field53[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field45 - 1; var16++) {
				for (int var17 = 1; var17 < field44 - 1; var17++) {
					int var18 = field48[var7][var17 + 1][var16] - field48[var7][var17 - 1][var16];
					int var19 = field48[var7][var17][var16 + 1] - field48[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field41[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field45; var26++) {
				field36[var26] = 0;
				field37[var26] = 0;
				field38[var26] = 0;
				field39[var26] = 0;
				field40[var26] = 0;
			}

			for (int var27 = -5; var27 < field44 + 5; var27++) {
				for (int var28 = 0; var28 < field45; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field44) {
						int var30 = field31[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							CMUBOYNL var31 = CMUBOYNL.field531[var30 - 1];
							field36[var28] += var31.field540;
							field37[var28] += var31.field538;
							field38[var28] += var31.field539;
							field39[var28] += var31.field541;
							field40[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field44) {
						int var33 = field31[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							CMUBOYNL var34 = CMUBOYNL.field531[var33 - 1];
							field36[var28] -= var34.field540;
							field37[var28] -= var34.field538;
							field38[var28] -= var34.field539;
							field39[var28] -= var34.field541;
							field40[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field44 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field45 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field45) {
							var35 += field36[var41];
							var36 += field37[var41];
							var37 += field38[var41];
							var38 += field39[var41];
							var39 += field40[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field45) {
							var35 -= field36[var42];
							var36 -= field37[var42];
							var37 -= field38[var42];
							var38 -= field39[var42];
							var39 -= field40[var42];
						}

						if (var40 >= 1 && var40 < field45 - 1 && (!field54 || (field42[var7][var27][var40] & 0x10) == 0 && method23(var27, var7, var40) == field51)) {
							int var43 = field31[var7][var27][var40] & 0xFF;
							int var44 = field49[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field48[var7][var27][var40];
								int var46 = field48[var7][var27 + 1][var40];
								int var47 = field48[var7][var27 + 1][var40 + 1];
								int var48 = field48[var7][var27][var40 + 1];
								int var49 = field41[var27][var40];
								int var50 = field41[var27 + 1][var40];
								int var51 = field41[var27 + 1][var40 + 1];
								int var52 = field41[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method24(var55, var56, var57);
									var55 = field33 + var55 & 0xFF;
									var57 += field34;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method24(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field46[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !CMUBOYNL.field531[var44 - 1].field536) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field32[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = DMXMSPET.field591[method7(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method512(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method7(var53, var49), method7(var53, var50), method7(var53, var51), method7(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field46[var7][var27][var40] + 1;
									byte var61 = field47[var7][var27][var40];
									CMUBOYNL var62 = CMUBOYNL.field531[var44 - 1];
									int var63 = var62.field534;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = DMXMSPET.method243(var63);
										var65 = -1;
									} else if (var62.field533 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method24(var62.field537, var62.field538, var62.field539);
										var64 = DMXMSPET.field591[method9(var62.field542, 96)];
									}

									arg0.method512(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method7(var53, var49), method7(var53, var50), method7(var53, var51), method7(var53, var52), method9(var65, var49), method9(var65, var50), method9(var65, var51), method9(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field45 - 1; var66++) {
				for (int var67 = 1; var67 < field44 - 1; var67++) {
					arg0.method511(var7, var67, var66, method23(var67, var7, var66));
				}
			}
		}

		arg0.method538(-50, -50, 768, -10, 64);

		for (int var68 = 0; var68 < field44; var68++) {
			for (int var69 = 0; var69 < field45; var69++) {
				if ((field42[1][var68][var69] & 0x2) == 2) {
					arg0.method509(var68, var69);
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
				for (int var75 = 0; var75 <= field45; var75++) {
					for (int var76 = 0; var76 <= field44; var76++) {
						if ((field32[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field32[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field45 && (field32[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label321: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field32[var79 - 1][var76][var81] & var70) == 0) {
										break label321;
									}
								}

								var79--;
							}

							label310: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field32[var80 + 1][var76][var82] & var70) == 0) {
										break label310;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field48[var80][var76][var77] - var84;
								int var86 = field48[var79][var76][var77];
								UGKPKMOJ.method510(var85, var73, var77 * 128, 1, var78 * 128 + 128, var76 * 128, var76 * 128, var86);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field32[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field32[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field32[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field44 && (field32[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label374: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field32[var91 - 1][var93][var75] & var71) == 0) {
										break label374;
									}
								}

								var91--;
							}

							label363: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field32[var92 + 1][var94][var75] & var71) == 0) {
										break label363;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field48[var92][var89][var75] - var96;
								int var98 = field48[var91][var89][var75];
								UGKPKMOJ.method510(var97, var73, var75 * 128, 2, var75 * 128, var90 * 128 + 128, var89 * 128, var98);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field32[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field32[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field32[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field45 && (field32[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label427: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field32[var74][var101 - 1][var105] & var72) == 0) {
										break label427;
									}
								}

								var101--;
							}

							label416: while (var102 < field44) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field32[var74][var102 + 1][var106] & var72) == 0) {
										break label416;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field48[var74][var101][var103];
								UGKPKMOJ.method510(var107, var73, var103 * 128, 4, var104 * 128 + 128, var102 * 128 + 128, var101 * 128, var107);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field32[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("BRNLHXCU.a(LCKBTFRZM;LEEDCHWRL;I)V")
	public static final void method18(CKBTFRZM arg0, EEDCHWRL arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method58();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			VCGOMUBN var4 = VCGOMUBN.method568(var2);
			var4.method571(arg1);

			while (true) {
				int var5 = arg0.method58();
				if (var5 == 0) {
					break;
				}

				arg0.method44();
			}
		}
	}

	@ObfuscatedName("BRNLHXCU.a(IIII[LONADPAJP;III[BI)V")
	public final void method19(int arg0, int arg1, int arg2, ONADPAJP[] arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg0 + var10 > 0 && arg0 + var10 < 103 && arg5 + var11 > 0 && arg5 + var11 < 103) {
					arg3[arg4].field1092[arg0 + var10][arg5 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		CKBTFRZM var12 = new CKBTFRZM(arg7);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg6 == var13 && var14 >= arg2 && var14 < arg2 + 8 && var15 >= arg1 && var15 < arg1 + 8) {
						method8(arg0 + GDGWLQOM.method333(var15 & 0x7, var14 & 0x7, arg8), 0, 0, arg4, var12, arg8, arg5 + GDGWLQOM.method334(var14 & 0x7, var15 & 0x7, arg8));
					} else {
						method8(-1, 0, 0, 0, var12, 0, -1);
					}
				}
			}
		}
	}

	@ObfuscatedName("BRNLHXCU.a(IB[BI)Z")
	public static final boolean method20(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		CKBTFRZM var4 = new CKBTFRZM(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method58();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method58();
					if (var9 == 0) {
						break;
					}

					var4.method44();
				} else {
					int var10 = var4.method58();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method44() >> 2;
					int var14 = arg0 + var12;
					int var15 = arg2 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						VCGOMUBN var16 = VCGOMUBN.method568(var5);
						if (var13 != 22 || !field54 || var16.field1389 || var16.field1423) {
							var3 &= var16.method572();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("BRNLHXCU.a(II[LONADPAJP;LUGKPKMOJ;[BI)V")
	public final void method21(int arg0, ONADPAJP[] arg1, UGKPKMOJ arg2, byte[] arg3, int arg4) {
		CKBTFRZM var6 = new CKBTFRZM(arg3);
		int var7 = -1;
		while (true) {
			int var8 = var6.method58();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method58();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method44();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg4 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field42[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					ONADPAJP var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method4(var7, var13, var17, var15, var18, var16, arg2, var20);
				}
			}
		}
	}

	public BRNLHXCU(int arg0, int[][][] arg1, byte[][][] arg2, int arg3) {
		field44 = arg0;
		field45 = arg3;
		field48 = arg1;
		field42 = arg2;
		field31 = new byte[4][field44][field45];
		field49 = new byte[4][field44][field45];
		field46 = new byte[4][field44][field45];
		field47 = new byte[4][field44][field45];
		field32 = new int[4][field44 + 1][field45 + 1];
		field53 = new byte[4][field44 + 1][field45 + 1];
		field41 = new int[field44 + 1][field45 + 1];
		field36 = new int[field45];
		field37 = new int[field45];
		field38 = new int[field45];
		field39 = new int[field45];
		field40 = new int[field45];
	}

	@ObfuscatedName("BRNLHXCU.a(IIII)I")
	public static final int method22(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - DMXMSPET.field580[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("BRNLHXCU.b(IIII)I")
	public int method23(int arg0, int arg1, int arg2) {
		if ((field42[arg1][arg0][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg1 > 0 && (field42[1][arg0][arg2] & 0x2) != 0) {
			return arg1 - 1;
		}

		return arg1;
	}

	@ObfuscatedName("BRNLHXCU.c(III)I")
	public final int method24(int arg0, int arg1, int arg2) {
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
}
