package deob;

@ObfuscatedName("IPCPGCKM")
public final class IPCPGCKM {

	@ObfuscatedName("IPCPGCKM.u")
	public int field776;

	@ObfuscatedName("IPCPGCKM.v")
	public int field777;

	@ObfuscatedName("IPCPGCKM.g")
	public int[][][] field767;

	@ObfuscatedName("IPCPGCKM.d")
	public byte[][][] field764;

	@ObfuscatedName("IPCPGCKM.r")
	public byte[][][] field773;

	@ObfuscatedName("IPCPGCKM.c")
	public byte[][][] field763;

	@ObfuscatedName("IPCPGCKM.s")
	public byte[][][] field774;

	@ObfuscatedName("IPCPGCKM.D")
	public byte[][][] field785;

	@ObfuscatedName("IPCPGCKM.x")
	public int[][][] field779;

	@ObfuscatedName("IPCPGCKM.q")
	public byte[][][] field772;

	@ObfuscatedName("IPCPGCKM.f")
	public int[][] field766;

	@ObfuscatedName("IPCPGCKM.y")
	public int[] field780;

	@ObfuscatedName("IPCPGCKM.z")
	public int[] field781;

	@ObfuscatedName("IPCPGCKM.A")
	public int[] field782;

	@ObfuscatedName("IPCPGCKM.B")
	public int[] field783;

	@ObfuscatedName("IPCPGCKM.C")
	public int[] field784;

	@ObfuscatedName("IPCPGCKM.b")
	public static final int[] field762 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("IPCPGCKM.j")
	public static final int[] field768 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("IPCPGCKM.l")
	public static boolean field769 = true;

	@ObfuscatedName("IPCPGCKM.m")
	public static final int[] field770 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("IPCPGCKM.o")
	public static final int[] field771 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("IPCPGCKM.t")
	public static int field775 = 99;

	@ObfuscatedName("IPCPGCKM.a")
	public static int field761 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("IPCPGCKM.w")
	public static int field778 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("IPCPGCKM.e")
	public static int field765;

	@ObfuscatedName("IPCPGCKM.a(IIII)I")
	public static final int method305(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - NQTCRWWR.field969[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("IPCPGCKM.a(BI[[[IILTCDQXHKB;IILVLOWRGUJ;III)V")
	public static final void method306(int arg0, int[][][] arg1, int arg2, TCDQXHKB arg3, int arg4, int arg5, VLOWRGUJ arg6, int arg7, int arg8, int arg9) {
		int var10 = arg1[arg2][arg4][arg0];
		int var11 = arg1[arg2][arg4 + 1][arg0];
		int var12 = arg1[arg2][arg4 + 1][arg0 + 1];
		int var13 = arg1[arg2][arg4][arg0 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		YJMLCFGC var15 = YJMLCFGC.method596(arg8);
		int var16 = (arg8 << 14) + (arg0 << 7) + arg4 + 0x40000000;
		if (!var15.field1475) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg9 << 6) + arg5);
		if (arg5 == 22) {
			ACEAAIDL var18;
			if (var15.field1453 == -1 && var15.field1478 == null) {
				var18 = var15.method587(22, arg9, var10, var11, var12, var13, -1);
			} else {
				var18 = new FDWERTGB(var10, arg9, var12, var11, true, 22, arg8, var13, var15.field1453);
			}

			arg3.method454(arg7, arg0, var14, var18, arg4, var16, var17);

			if (var15.field1459 && var15.field1475) {
				arg6.method555(arg0, arg4);
			}
		} else if (arg5 == 10 || arg5 == 11) {
			ACEAAIDL var19;
			if (var15.field1453 == -1 && var15.field1478 == null) {
				var19 = var15.method587(10, arg9, var10, var11, var12, var13, -1);
			} else {
				var19 = new FDWERTGB(var10, arg9, var12, var11, true, 10, arg8, var13, var15.field1453);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg5 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg9 == 1 || arg9 == 3) {
					var21 = var15.field1479;
					var22 = var15.field1469;
				} else {
					var21 = var15.field1469;
					var22 = var15.field1479;
				}

				arg3.method458(arg4, var22, var19, var17, var16, var21, var14, arg0, var20, arg7);
			}

			if (var15.field1459) {
				arg6.method554(var15.field1469, arg0, var15.field1479, arg9, arg4, var15.field1450);
			}
		} else if (arg5 >= 12) {
			ACEAAIDL var23;
			if (var15.field1453 == -1 && var15.field1478 == null) {
				var23 = var15.method587(arg5, arg9, var10, var11, var12, var13, -1);
			} else {
				var23 = new FDWERTGB(var10, arg9, var12, var11, true, arg5, arg8, var13, var15.field1453);
			}

			arg3.method458(arg4, 1, var23, var17, var16, 1, var14, arg0, 0, arg7);

			if (var15.field1459) {
				arg6.method554(var15.field1469, arg0, var15.field1479, arg9, arg4, var15.field1450);
			}
		} else if (arg5 == 0) {
			ACEAAIDL var24;
			if (var15.field1453 == -1 && var15.field1478 == null) {
				var24 = var15.method587(0, arg9, var10, var11, var12, var13, -1);
			} else {
				var24 = new FDWERTGB(var10, arg9, var12, var11, true, 0, arg8, var13, var15.field1453);
			}

			arg3.method456(field771[arg9], var24, arg4, null, arg0, var16, 0, arg7, var14, var17);

			if (var15.field1459) {
				arg6.method553(arg4, arg5, arg9, arg0, var15.field1450);
			}
		} else if (arg5 == 1) {
			ACEAAIDL var25;
			if (var15.field1453 == -1 && var15.field1478 == null) {
				var25 = var15.method587(1, arg9, var10, var11, var12, var13, -1);
			} else {
				var25 = new FDWERTGB(var10, arg9, var12, var11, true, 1, arg8, var13, var15.field1453);
			}

			arg3.method456(field762[arg9], var25, arg4, null, arg0, var16, 0, arg7, var14, var17);

			if (var15.field1459) {
				arg6.method553(arg4, arg5, arg9, arg0, var15.field1450);
			}
		} else if (arg5 == 2) {
			int var26 = arg9 + 1 & 0x3;
			ACEAAIDL var27;
			ACEAAIDL var28;
			if (var15.field1453 == -1 && var15.field1478 == null) {
				var27 = var15.method587(2, arg9 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method587(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new FDWERTGB(var10, arg9 + 4, var12, var11, true, 2, arg8, var13, var15.field1453);
				var28 = new FDWERTGB(var10, var26, var12, var11, true, 2, arg8, var13, var15.field1453);
			}

			arg3.method456(field771[arg9], var27, arg4, var28, arg0, var16, field771[var26], arg7, var14, var17);

			if (var15.field1459) {
				arg6.method553(arg4, arg5, arg9, arg0, var15.field1450);
			}
		} else if (arg5 == 3) {
			ACEAAIDL var29;
			if (var15.field1453 == -1 && var15.field1478 == null) {
				var29 = var15.method587(3, arg9, var10, var11, var12, var13, -1);
			} else {
				var29 = new FDWERTGB(var10, arg9, var12, var11, true, 3, arg8, var13, var15.field1453);
			}

			arg3.method456(field762[arg9], var29, arg4, null, arg0, var16, 0, arg7, var14, var17);

			if (var15.field1459) {
				arg6.method553(arg4, arg5, arg9, arg0, var15.field1450);
			}
		} else if (arg5 == 9) {
			ACEAAIDL var30;
			if (var15.field1453 == -1 && var15.field1478 == null) {
				var30 = var15.method587(arg5, arg9, var10, var11, var12, var13, -1);
			} else {
				var30 = new FDWERTGB(var10, arg9, var12, var11, true, arg5, arg8, var13, var15.field1453);
			}

			arg3.method458(arg4, 1, var30, var17, var16, 1, var14, arg0, 0, arg7);

			if (var15.field1459) {
				arg6.method554(var15.field1469, arg0, var15.field1479, arg9, arg4, var15.field1450);
			}
		} else {
			if (var15.field1471) {
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

			if (arg5 == 4) {
				ACEAAIDL var35;
				if (var15.field1453 == -1 && var15.field1478 == null) {
					var35 = var15.method587(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new FDWERTGB(var10, 0, var12, var11, true, 4, arg8, var13, var15.field1453);
				}

				arg3.method457(var16, var17, var35, 0, var14, arg7, 0, field771[arg9], arg4, arg0, arg9 * 512);
			} else if (arg5 == 5) {
				int var36 = 16;
				int var37 = arg3.method474(arg7, arg4, arg0);
				if (var37 > 0) {
					var36 = YJMLCFGC.method596(var37 >> 14 & 0x7FFF).field1490;
				}

				ACEAAIDL var38;
				if (var15.field1453 == -1 && var15.field1478 == null) {
					var38 = var15.method587(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new FDWERTGB(var10, 0, var12, var11, true, 4, arg8, var13, var15.field1453);
				}

				arg3.method457(var16, var17, var38, field768[arg9] * var36, var14, arg7, field770[arg9] * var36, field771[arg9], arg4, arg0, arg9 * 512);
			} else if (arg5 == 6) {
				ACEAAIDL var39;
				if (var15.field1453 == -1 && var15.field1478 == null) {
					var39 = var15.method587(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new FDWERTGB(var10, 0, var12, var11, true, 4, arg8, var13, var15.field1453);
				}

				arg3.method457(var16, var17, var39, 0, var14, arg7, 0, 256, arg4, arg0, arg9);
			} else if (arg5 == 7) {
				ACEAAIDL var40;
				if (var15.field1453 == -1 && var15.field1478 == null) {
					var40 = var15.method587(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new FDWERTGB(var10, 0, var12, var11, true, 4, arg8, var13, var15.field1453);
				}

				arg3.method457(var16, var17, var40, 0, var14, arg7, 0, 512, arg4, arg0, arg9);
			} else if (arg5 == 8) {
				ACEAAIDL var41;
				if (var15.field1453 == -1 && var15.field1478 == null) {
					var41 = var15.method587(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new FDWERTGB(var10, 0, var12, var11, true, 4, arg8, var13, var15.field1453);
				}

				arg3.method457(var16, var17, var41, 0, var14, arg7, 0, 768, arg4, arg0, arg9);
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.a(II)I")
	public static final int method307(int arg0, int arg1) {
		int var2 = method326(arg0 + 45365, arg1 + 91923, 4) + (method326(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method326(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("IPCPGCKM.a(IIILTCDQXHKB;IIILVLOWRGUJ;I)V")
	public final void method308(int arg0, int arg1, TCDQXHKB arg2, int arg3, int arg4, int arg5, VLOWRGUJ arg6, int arg7) {
		if (field769 && (field764[0][arg7][arg4] & 0x2) == 0) {
			if ((field764[arg1][arg7][arg4] & 0x10) != 0) {
				return;
			}

			if (method318(arg1, arg7, arg4) != field765) {
				return;
			}
		}

		if (arg1 < field775) {
			field775 = arg1;
		}

		int var9 = field767[arg1][arg7][arg4];
		int var10 = field767[arg1][arg7 + 1][arg4];
		int var11 = field767[arg1][arg7 + 1][arg4 + 1];
		int var12 = field767[arg1][arg7][arg4 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		YJMLCFGC var14 = YJMLCFGC.method596(arg3);
		int var15 = (arg3 << 14) + (arg4 << 7) + arg7 + 0x40000000;
		if (!var14.field1475) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg0 << 6) + arg5);
		if (arg5 == 22) {
			if (!field769 || var14.field1475 || var14.field1495) {
				ACEAAIDL var17;
				if (var14.field1453 == -1 && var14.field1478 == null) {
					var17 = var14.method587(22, arg0, var9, var10, var11, var12, -1);
				} else {
					var17 = new FDWERTGB(var9, arg0, var11, var10, true, 22, arg3, var12, var14.field1453);
				}

				arg2.method454(arg1, arg4, var13, var17, arg7, var15, var16);

				if (var14.field1459 && var14.field1475 && arg6 != null) {
					arg6.method555(arg4, arg7);
				}
			}
		} else if (arg5 == 10 || arg5 == 11) {
			ACEAAIDL var18;
			if (var14.field1453 == -1 && var14.field1478 == null) {
				var18 = var14.method587(10, arg0, var9, var10, var11, var12, -1);
			} else {
				var18 = new FDWERTGB(var9, arg0, var11, var10, true, 10, arg3, var12, var14.field1453);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg5 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg0 == 1 || arg0 == 3) {
					var20 = var14.field1479;
					var21 = var14.field1469;
				} else {
					var20 = var14.field1469;
					var21 = var14.field1479;
				}

				if (arg2.method458(arg7, var21, var18, var16, var15, var20, var13, arg4, var19, arg1) && var14.field1474) {
					GCSAWSJV var22;
					if (var18 instanceof GCSAWSJV) {
						var22 = (GCSAWSJV) var18;
					} else {
						var22 = var14.method587(10, arg0, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field616 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field772[arg1][arg7 + var23][arg4 + var24]) {
									field772[arg1][arg7 + var23][arg4 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field1459 && arg6 != null) {
				arg6.method554(var14.field1469, arg4, var14.field1479, arg0, arg7, var14.field1450);
			}
		} else if (arg5 >= 12) {
			ACEAAIDL var26;
			if (var14.field1453 == -1 && var14.field1478 == null) {
				var26 = var14.method587(arg5, arg0, var9, var10, var11, var12, -1);
			} else {
				var26 = new FDWERTGB(var9, arg0, var11, var10, true, arg5, arg3, var12, var14.field1453);
			}

			arg2.method458(arg7, 1, var26, var16, var15, 1, var13, arg4, 0, arg1);

			if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg1 > 0) {
				field779[arg1][arg7][arg4] |= 0x924;
			}

			if (var14.field1459 && arg6 != null) {
				arg6.method554(var14.field1469, arg4, var14.field1479, arg0, arg7, var14.field1450);
			}
		} else if (arg5 == 0) {
			ACEAAIDL var27;
			if (var14.field1453 == -1 && var14.field1478 == null) {
				var27 = var14.method587(0, arg0, var9, var10, var11, var12, -1);
			} else {
				var27 = new FDWERTGB(var9, arg0, var11, var10, true, 0, arg3, var12, var14.field1453);
			}

			arg2.method456(field771[arg0], var27, arg7, null, arg4, var15, 0, arg1, var13, var16);

			if (arg0 == 0) {
				if (var14.field1474) {
					field772[arg1][arg7][arg4] = 50;
					field772[arg1][arg7][arg4 + 1] = 50;
				}

				if (var14.field1494) {
					field779[arg1][arg7][arg4] |= 0x249;
				}
			} else if (arg0 == 1) {
				if (var14.field1474) {
					field772[arg1][arg7][arg4 + 1] = 50;
					field772[arg1][arg7 + 1][arg4 + 1] = 50;
				}

				if (var14.field1494) {
					field779[arg1][arg7][arg4 + 1] |= 0x492;
				}
			} else if (arg0 == 2) {
				if (var14.field1474) {
					field772[arg1][arg7 + 1][arg4] = 50;
					field772[arg1][arg7 + 1][arg4 + 1] = 50;
				}

				if (var14.field1494) {
					field779[arg1][arg7 + 1][arg4] |= 0x249;
				}
			} else if (arg0 == 3) {
				if (var14.field1474) {
					field772[arg1][arg7][arg4] = 50;
					field772[arg1][arg7 + 1][arg4] = 50;
				}

				if (var14.field1494) {
					field779[arg1][arg7][arg4] |= 0x492;
				}
			}

			if (var14.field1459 && arg6 != null) {
				arg6.method553(arg7, arg5, arg0, arg4, var14.field1450);
			}

			if (var14.field1490 != 16) {
				arg2.method464(arg1, var14.field1490, arg7, arg4);
			}
		} else if (arg5 == 1) {
			ACEAAIDL var28;
			if (var14.field1453 == -1 && var14.field1478 == null) {
				var28 = var14.method587(1, arg0, var9, var10, var11, var12, -1);
			} else {
				var28 = new FDWERTGB(var9, arg0, var11, var10, true, 1, arg3, var12, var14.field1453);
			}

			arg2.method456(field762[arg0], var28, arg7, null, arg4, var15, 0, arg1, var13, var16);

			if (var14.field1474) {
				if (arg0 == 0) {
					field772[arg1][arg7][arg4 + 1] = 50;
				} else if (arg0 == 1) {
					field772[arg1][arg7 + 1][arg4 + 1] = 50;
				} else if (arg0 == 2) {
					field772[arg1][arg7 + 1][arg4] = 50;
				} else if (arg0 == 3) {
					field772[arg1][arg7][arg4] = 50;
				}
			}

			if (var14.field1459 && arg6 != null) {
				arg6.method553(arg7, arg5, arg0, arg4, var14.field1450);
			}
		} else if (arg5 == 2) {
			int var29 = arg0 + 1 & 0x3;
			ACEAAIDL var30;
			ACEAAIDL var31;
			if (var14.field1453 == -1 && var14.field1478 == null) {
				var30 = var14.method587(2, arg0 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method587(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new FDWERTGB(var9, arg0 + 4, var11, var10, true, 2, arg3, var12, var14.field1453);
				var31 = new FDWERTGB(var9, var29, var11, var10, true, 2, arg3, var12, var14.field1453);
			}

			arg2.method456(field771[arg0], var30, arg7, var31, arg4, var15, field771[var29], arg1, var13, var16);

			if (var14.field1494) {
				if (arg0 == 0) {
					field779[arg1][arg7][arg4] |= 0x249;
					field779[arg1][arg7][arg4 + 1] |= 0x492;
				} else if (arg0 == 1) {
					field779[arg1][arg7][arg4 + 1] |= 0x492;
					field779[arg1][arg7 + 1][arg4] |= 0x249;
				} else if (arg0 == 2) {
					field779[arg1][arg7 + 1][arg4] |= 0x249;
					field779[arg1][arg7][arg4] |= 0x492;
				} else if (arg0 == 3) {
					field779[arg1][arg7][arg4] |= 0x492;
					field779[arg1][arg7][arg4] |= 0x249;
				}
			}

			if (var14.field1459 && arg6 != null) {
				arg6.method553(arg7, arg5, arg0, arg4, var14.field1450);
			}

			if (var14.field1490 != 16) {
				arg2.method464(arg1, var14.field1490, arg7, arg4);
			}
		} else if (arg5 == 3) {
			ACEAAIDL var32;
			if (var14.field1453 == -1 && var14.field1478 == null) {
				var32 = var14.method587(3, arg0, var9, var10, var11, var12, -1);
			} else {
				var32 = new FDWERTGB(var9, arg0, var11, var10, true, 3, arg3, var12, var14.field1453);
			}

			arg2.method456(field762[arg0], var32, arg7, null, arg4, var15, 0, arg1, var13, var16);

			if (var14.field1474) {
				if (arg0 == 0) {
					field772[arg1][arg7][arg4 + 1] = 50;
				} else if (arg0 == 1) {
					field772[arg1][arg7 + 1][arg4 + 1] = 50;
				} else if (arg0 == 2) {
					field772[arg1][arg7 + 1][arg4] = 50;
				} else if (arg0 == 3) {
					field772[arg1][arg7][arg4] = 50;
				}
			}

			if (var14.field1459 && arg6 != null) {
				arg6.method553(arg7, arg5, arg0, arg4, var14.field1450);
			}
		} else if (arg5 == 9) {
			ACEAAIDL var33;
			if (var14.field1453 == -1 && var14.field1478 == null) {
				var33 = var14.method587(arg5, arg0, var9, var10, var11, var12, -1);
			} else {
				var33 = new FDWERTGB(var9, arg0, var11, var10, true, arg5, arg3, var12, var14.field1453);
			}

			arg2.method458(arg7, 1, var33, var16, var15, 1, var13, arg4, 0, arg1);

			if (var14.field1459 && arg6 != null) {
				arg6.method554(var14.field1469, arg4, var14.field1479, arg0, arg7, var14.field1450);
			}
		} else {
			if (var14.field1471) {
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

			if (arg5 == 4) {
				ACEAAIDL var38;
				if (var14.field1453 == -1 && var14.field1478 == null) {
					var38 = var14.method587(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new FDWERTGB(var9, 0, var11, var10, true, 4, arg3, var12, var14.field1453);
				}

				arg2.method457(var15, var16, var38, 0, var13, arg1, 0, field771[arg0], arg7, arg4, arg0 * 512);
			} else if (arg5 == 5) {
				int var39 = 16;
				int var40 = arg2.method474(arg1, arg7, arg4);
				if (var40 > 0) {
					var39 = YJMLCFGC.method596(var40 >> 14 & 0x7FFF).field1490;
				}

				ACEAAIDL var41;
				if (var14.field1453 == -1 && var14.field1478 == null) {
					var41 = var14.method587(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new FDWERTGB(var9, 0, var11, var10, true, 4, arg3, var12, var14.field1453);
				}

				arg2.method457(var15, var16, var41, field768[arg0] * var39, var13, arg1, field770[arg0] * var39, field771[arg0], arg7, arg4, arg0 * 512);
			} else if (arg5 == 6) {
				ACEAAIDL var42;
				if (var14.field1453 == -1 && var14.field1478 == null) {
					var42 = var14.method587(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new FDWERTGB(var9, 0, var11, var10, true, 4, arg3, var12, var14.field1453);
				}

				arg2.method457(var15, var16, var42, 0, var13, arg1, 0, 256, arg7, arg4, arg0);
			} else if (arg5 == 7) {
				ACEAAIDL var43;
				if (var14.field1453 == -1 && var14.field1478 == null) {
					var43 = var14.method587(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new FDWERTGB(var9, 0, var11, var10, true, 4, arg3, var12, var14.field1453);
				}

				arg2.method457(var15, var16, var43, 0, var13, arg1, 0, 512, arg7, arg4, arg0);
			} else if (arg5 == 8) {
				ACEAAIDL var44;
				if (var14.field1453 == -1 && var14.field1478 == null) {
					var44 = var14.method587(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new FDWERTGB(var9, 0, var11, var10, true, 4, arg3, var12, var14.field1453);
				}

				arg2.method457(var15, var16, var44, 0, var13, arg1, 0, 768, arg7, arg4, arg0);
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.a([LVLOWRGUJ;LTCDQXHKB;I)V")
	public final void method309(VLOWRGUJ[] arg0, TCDQXHKB arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field764[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field764[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg0[var6].method555(var5, var4);
						}
					}
				}
			}
		}

		field778 += (int) (Math.random() * 5.0D) - 2;
		if (field778 < -8) {
			field778 = -8;
		}

		if (field778 > 8) {
			field778 = 8;
		}

		field761 += (int) (Math.random() * 5.0D) - 2;
		if (field761 < -16) {
			field761 = -16;
		}

		if (field761 > 16) {
			field761 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field772[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field777 - 1; var16++) {
				for (int var17 = 1; var17 < field776 - 1; var17++) {
					int var18 = field767[var7][var17 + 1][var16] - field767[var7][var17 - 1][var16];
					int var19 = field767[var7][var17][var16 + 1] - field767[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field766[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field777; var26++) {
				field780[var26] = 0;
				field781[var26] = 0;
				field782[var26] = 0;
				field783[var26] = 0;
				field784[var26] = 0;
			}

			for (int var27 = -5; var27 < field776 + 5; var27++) {
				for (int var28 = 0; var28 < field777; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field776) {
						int var30 = field773[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							GOLZJDMQ var31 = GOLZJDMQ.field722[var30 - 1];
							field780[var28] += var31.field731;
							field781[var28] += var31.field729;
							field782[var28] += var31.field730;
							field783[var28] += var31.field732;
							field784[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field776) {
						int var33 = field773[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							GOLZJDMQ var34 = GOLZJDMQ.field722[var33 - 1];
							field780[var28] -= var34.field731;
							field781[var28] -= var34.field729;
							field782[var28] -= var34.field730;
							field783[var28] -= var34.field732;
							field784[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field776 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field777 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field777) {
							var35 += field780[var41];
							var36 += field781[var41];
							var37 += field782[var41];
							var38 += field783[var41];
							var39 += field784[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field777) {
							var35 -= field780[var42];
							var36 -= field781[var42];
							var37 -= field782[var42];
							var38 -= field783[var42];
							var39 -= field784[var42];
						}

						if (var40 >= 1 && var40 < field777 - 1 && (!field769 || (field764[0][var27][var40] & 0x2) != 0 || (field764[var7][var27][var40] & 0x10) == 0 && method318(var7, var27, var40) == field765)) {
							if (var7 < field775) {
								field775 = var7;
							}

							int var43 = field773[var7][var27][var40] & 0xFF;
							int var44 = field763[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field767[var7][var27][var40];
								int var46 = field767[var7][var27 + 1][var40];
								int var47 = field767[var7][var27 + 1][var40 + 1];
								int var48 = field767[var7][var27][var40 + 1];
								int var49 = field766[var27][var40];
								int var50 = field766[var27 + 1][var40];
								int var51 = field766[var27 + 1][var40 + 1];
								int var52 = field766[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method313(var55, var56, var57);
									var55 = field778 + var55 & 0xFF;
									var57 += field761;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method313(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field774[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !GOLZJDMQ.field722[var44 - 1].field727) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field779[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = NQTCRWWR.field980[method323(var54, 96)];
								}

								if (var44 == 0) {
									arg1.method453(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method323(var53, var49), method323(var53, var50), method323(var53, var51), method323(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field774[var7][var27][var40] + 1;
									byte var61 = field785[var7][var27][var40];
									GOLZJDMQ var62 = GOLZJDMQ.field722[var44 - 1];
									int var63 = var62.field725;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = NQTCRWWR.method408(var63);
										var65 = -1;
									} else if (var62.field724 == 0xFF00FF) {
										var65 = -2;
										var63 = -1;
										var64 = NQTCRWWR.field980[method317(var62.field733, 96)];
									} else {
										var65 = method313(var62.field728, var62.field729, var62.field730);
										var64 = NQTCRWWR.field980[method317(var62.field733, 96)];
									}

									arg1.method453(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method323(var53, var49), method323(var53, var50), method323(var53, var51), method323(var53, var52), method317(var65, var49), method317(var65, var50), method317(var65, var51), method317(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field777 - 1; var66++) {
				for (int var67 = 1; var67 < field776 - 1; var67++) {
					arg1.method452(var7, var67, var66, method318(var7, var67, var66));
				}
			}
		}

		arg1.method479(-50, -50, -10);

		for (int var68 = 0; var68 < field776; var68++) {
			for (int var69 = 0; var69 < field777; var69++) {
				if ((field764[1][var68][var69] & 0x2) == 2) {
					arg1.method450(var68, var69);
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
				for (int var75 = 0; var75 <= field777; var75++) {
					for (int var76 = 0; var76 <= field776; var76++) {
						if ((field779[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field779[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field777 && (field779[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field779[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field779[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field767[var80][var76][var77] - var84;
								int var86 = field767[var79][var76][var77];
								TCDQXHKB.method451(var86, 1, var85, var73, var76 * 128, var77 * 128, var76 * 128, var78 * 128 + 128);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field779[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field779[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field779[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field776 && (field779[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field779[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field779[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field767[var92][var89][var75] - var96;
								int var98 = field767[var91][var89][var75];
								TCDQXHKB.method451(var98, 2, var97, var73, var89 * 128, var75 * 128, var90 * 128 + 128, var75 * 128);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field779[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field779[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field779[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field777 && (field779[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field779[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field776) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field779[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field767[var74][var101][var103];
								TCDQXHKB.method451(var107, 4, var107, var73, var101 * 128, var103 * 128, var102 * 128 + 128, var104 * 128 + 128);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field779[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.a(ZI[BI)Z")
	public static final boolean method310(int arg0, byte[] arg1, int arg2) {
		boolean var3 = true;
		CMGGUSPR var4 = new CMGGUSPR(arg1);
		int var5 = -1;
		while (true) {
			int var6 = var4.method208();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method208();
					if (var9 == 0) {
						break;
					}

					var4.method194();
				} else {
					int var10 = var4.method208();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method194() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg0 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						YJMLCFGC var16 = YJMLCFGC.method596(var5);
						if (var13 != 22 || !field769 || var16.field1475 || var16.field1495) {
							var3 &= var16.method590();
							var8 = true;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.a(IILCMGGUSPR;ZIIII)V")
	public final void method311(int arg0, int arg1, CMGGUSPR arg2, int arg3, int arg4, int arg5, int arg6) {
		if (arg1 >= 0 && arg1 < 104 && arg5 >= 0 && arg5 < 104) {
			field764[arg0][arg1][arg5] = 0;
			while (true) {
				int var8 = arg2.method194();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg2.method194();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg0 == 0) {
						field767[0][arg1][arg5] = -var9 * 8;
						return;
					}

					field767[arg0][arg1][arg5] = field767[arg0 - 1][arg1][arg5] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field763[arg0][arg1][arg5] = arg2.method195();
					field774[arg0][arg1][arg5] = (byte) ((var8 - 2) / 4);
					field785[arg0][arg1][arg5] = (byte) (var8 + arg6 - 2 & 0x3);
				} else if (var8 <= 81) {
					field764[arg0][arg1][arg5] = (byte) (var8 - 49);
				} else {
					field773[arg0][arg1][arg5] = (byte) (var8 - 81);
				}
			}

			if (arg0 == 0) {
				field767[0][arg1][arg5] = -method307(arg1 + arg3 + 932731, arg5 + 556238 + arg4) * 8;
			} else {
				field767[arg0][arg1][arg5] = field767[arg0 - 1][arg1][arg5] - 240;
			}
		} else {
			while (true) {
				int var10 = arg2.method194();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg2.method194();
					return;
				}

				if (var10 <= 49) {
					arg2.method194();
				}
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.b(II)I")
	public static final int method312(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("IPCPGCKM.a(III)I")
	public final int method313(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("IPCPGCKM.a(IIIILTCDQXHKB;II[LVLOWRGUJ;I[BI)V")
	public final void method314(int arg0, int arg1, int arg2, int arg3, TCDQXHKB arg4, int arg5, VLOWRGUJ[] arg6, int arg7, byte[] arg8, int arg9) {
		CMGGUSPR var11 = new CMGGUSPR(arg8);
		int var12 = -1;
		while (true) {
			int var13 = var11.method208();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method208();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method194();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg0 == var18 && var17 >= arg2 && var17 < arg2 + 8 && var16 >= arg5 && var16 < arg5 + 8) {
					YJMLCFGC var22 = YJMLCFGC.method596(var12);
					int var23 = arg7 + QMJXCCWI.method428(arg9, var17 & 0x7, var22.field1479, var22.field1469, var16 & 0x7, var21);
					int var24 = arg3 + QMJXCCWI.method429(var22.field1469, var17 & 0x7, arg9, var21, var16 & 0x7, var22.field1479);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = arg1;
						if ((field764[1][var23][var24] & 0x2) == 2) {
							var25 = arg1 - 1;
						}

						VLOWRGUJ var26 = null;
						if (var25 >= 0) {
							var26 = arg6[var25];
						}

						method308(arg9 + var21 & 0x3, arg1, arg4, var12, var24, var20, var26, var23);
					}
				}
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.c(II)I")
	public static final int method315(int arg0, int arg1) {
		int var2 = method312(arg0 - 1, arg1 - 1) + method312(arg0 + 1, arg1 - 1) + method312(arg0 - 1, arg1 + 1) + method312(arg0 + 1, arg1 + 1);
		int var3 = method312(arg0 - 1, arg1) + method312(arg0 + 1, arg1) + method312(arg0, arg1 - 1) + method312(arg0, arg1 + 1);
		int var4 = method312(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("IPCPGCKM.a(IIBLTCDQXHKB;[LVLOWRGUJ;[B)V")
	public final void method316(int arg0, int arg1, TCDQXHKB arg2, VLOWRGUJ[] arg3, byte[] arg4) {
		CMGGUSPR var6 = new CMGGUSPR(arg4);
		int var7 = -1;
		while (true) {
			int var8 = var6.method208();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method208();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method194();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg0 + var12;
				int var18 = arg1 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field764[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					VLOWRGUJ var20 = null;
					if (var19 >= 0) {
						var20 = arg3[var19];
					}

					method308(var16, var13, arg2, var7, var18, var15, var20, var17);
				}
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.d(II)I")
	public final int method317(int arg0, int arg1) {
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

	public IPCPGCKM(int arg0, byte[][][] arg1, int[][][] arg2, int arg3) {
		field775 = 99;
		field776 = arg0;
		field777 = arg3;
		field767 = arg2;
		field764 = arg1;
		field773 = new byte[4][field776][field777];
		field763 = new byte[4][field776][field777];
		field774 = new byte[4][field776][field777];
		field785 = new byte[4][field776][field777];
		field779 = new int[4][field776 + 1][field777 + 1];
		field772 = new byte[4][field776 + 1][field777 + 1];
		field766 = new int[field776 + 1][field777 + 1];
		field780 = new int[field777];
		field781 = new int[field777];
		field782 = new int[field777];
		field783 = new int[field777];
		field784 = new int[field777];
	}

	@ObfuscatedName("IPCPGCKM.b(IIII)I")
	public int method318(int arg0, int arg1, int arg2) {
		if ((field764[arg0][arg1][arg2] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field764[1][arg1][arg2] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("IPCPGCKM.a(I[LVLOWRGUJ;II[BIIIII)V")
	public final void method319(int arg0, VLOWRGUJ[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg0 + var10 > 0 && arg0 + var10 < 103 && arg8 + var11 > 0 && arg8 + var11 < 103) {
					arg1[arg6].field1323[arg0 + var10][arg8 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		CMGGUSPR var12 = new CMGGUSPR(arg4);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg7 == var13 && var14 >= arg5 && var14 < arg5 + 8 && var15 >= arg2 && var15 < arg2 + 8) {
						method311(arg6, arg0 + QMJXCCWI.method426(var14 & 0x7, arg3, var15 & 0x7), var12, 0, 0, arg8 + QMJXCCWI.method427(arg3, var15 & 0x7, var14 & 0x7), arg3);
					} else {
						method311(0, -1, var12, 0, 0, -1, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.a([LVLOWRGUJ;III[BII)V")
	public final void method320(VLOWRGUJ[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg1 + var8 > 0 && arg1 + var8 < 103 && arg2 + var9 > 0 && arg2 + var9 < 103) {
						arg0[var7].field1323[arg1 + var8][arg2 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		CMGGUSPR var10 = new CMGGUSPR(arg4);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method311(var11, arg1 + var12, var10, arg3, arg5, arg2 + var13, 0);
				}
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.a(IIIIZ)V")
	public final void method321(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg3; var5 <= arg0 + arg3; var5++) {
			for (int var6 = arg2; var6 <= arg1 + arg2; var6++) {
				if (var6 >= 0 && var6 < field776 && var5 >= 0 && var5 < field777) {
					field772[0][var6][var5] = 127;

					if (arg2 == var6 && var6 > 0) {
						field767[0][var6][var5] = field767[0][var6 - 1][var5];
					}

					if (arg1 + arg2 == var6 && var6 < field776 - 1) {
						field767[0][var6][var5] = field767[0][var6 + 1][var5];
					}

					if (arg3 == var5 && var5 > 0) {
						field767[0][var6][var5] = field767[0][var6][var5 - 1];
					}

					if (arg0 + arg3 == var5 && var5 < field777 - 1) {
						field767[0][var6][var5] = field767[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.c(IIII)V")
	public final void method322(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 8; var4++) {
			for (int var5 = 0; var5 < 8; var5++) {
				field767[arg1][arg2 + var4][arg0 + var5] = 0;
			}
		}

		if (arg2 > 0) {
			for (int var6 = 1; var6 < 8; var6++) {
				field767[arg1][arg2][arg0 + var6] = field767[arg1][arg2 - 1][arg0 + var6];
			}
		}

		if (arg0 > 0) {
			for (int var7 = 1; var7 < 8; var7++) {
				field767[arg1][arg2 + var7][arg0] = field767[arg1][arg2 + var7][arg0 - 1];
			}
		}

		if (arg2 > 0 && field767[arg1][arg2 - 1][arg0] != 0) {
			field767[arg1][arg2][arg0] = field767[arg1][arg2 - 1][arg0];
		} else if (arg0 > 0 && field767[arg1][arg2][arg0 - 1] != 0) {
			field767[arg1][arg2][arg0] = field767[arg1][arg2][arg0 - 1];
		} else if (arg2 > 0 && arg0 > 0 && field767[arg1][arg2 - 1][arg0 - 1] != 0) {
			field767[arg1][arg2][arg0] = field767[arg1][arg2 - 1][arg0 - 1];
		}
	}

	@ObfuscatedName("IPCPGCKM.e(II)I")
	public static final int method323(int arg0, int arg1) {
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

	@ObfuscatedName("IPCPGCKM.a(ZII)Z")
	public static final boolean method324(int arg0, int arg1) {
		YJMLCFGC var2 = YJMLCFGC.method596(arg1);

		if (arg0 == 11) {
			arg0 = 10;
		}

		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}

		return var2.method586(arg0);
	}

	@ObfuscatedName("IPCPGCKM.a(LCMGGUSPR;LUCDUMMGN;I)V")
	public static final void method325(CMGGUSPR arg0, UCDUMMGN arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method208();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			YJMLCFGC var4 = YJMLCFGC.method596(var2);
			var4.method589(arg1);

			while (true) {
				int var5 = arg0.method208();
				if (var5 == 0) {
					break;
				}

				arg0.method194();
			}
		}
	}

	@ObfuscatedName("IPCPGCKM.b(III)I")
	public static final int method326(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method315(var3, var5);
		int var8 = method315(var3 + 1, var5);
		int var9 = method315(var3, var5 + 1);
		int var10 = method315(var3 + 1, var5 + 1);
		int var11 = method305(var7, var8, var4, arg2);
		int var12 = method305(var9, var10, var4, arg2);
		return method305(var11, var12, var6, arg2);
	}
}
