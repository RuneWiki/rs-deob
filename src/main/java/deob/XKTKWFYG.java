package deob;

@ObfuscatedName("XKTKWFYG")
public final class XKTKWFYG {

	@ObfuscatedName("XKTKWFYG.a")
	public static CUBSCFMS field1419 = new CUBSCFMS();

	@ObfuscatedName("XKTKWFYG.a([BI[BII)I")
	public static int method567(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		synchronized (field1419) {
			field1419.field565 = arg2;
			field1419.field566 = arg4;
			field1419.field570 = arg0;
			field1419.field571 = 0;
			field1419.field567 = arg3;
			field1419.field572 = arg1;
			field1419.field579 = 0;
			field1419.field578 = 0;
			field1419.field568 = 0;
			field1419.field569 = 0;
			field1419.field573 = 0;
			field1419.field574 = 0;
			field1419.field581 = 0;
			method569(field1419);
			return arg1 - field1419.field572;
		}
	}

	@ObfuscatedName("XKTKWFYG.a(LCUBSCFMS;)V")
	public static void method568(CUBSCFMS arg0) {
		byte var1 = arg0.field575;
		int var2 = arg0.field576;
		int var3 = arg0.field586;
		int var4 = arg0.field584;
		int[] var5 = CUBSCFMS.field589;
		int var6 = arg0.field583;
		byte[] var7 = arg0.field570;
		int var8 = arg0.field571;
		int var9 = arg0.field572;
		int var10 = var9;
		int var11 = arg0.field603 + 1;
		label67: while (true) {
			if (var2 > 0) {
				while (true) {
					if (var9 == 0) {
						break label67;
					}

					if (var2 == 1) {
						break;
					}

					var7[var8] = var1;
					var2--;
					var8++;
					var9--;
				}

				if (var9 == 0) {
					var2 = 1;
					break;
				}

				var7[var8] = var1;
				var8++;
				var9--;
			}

			boolean var12 = true;
			while (var12) {
				var12 = false;

				if (var3 == var11) {
					var2 = 0;
					break label67;
				}

				var1 = (byte) var4;
				var6 = var5[var6];
				byte var13 = (byte) (var6 & 0xFF);
				var6 >>= 8;
				var3++;
				if (var4 != var13) {
					var4 = var13;

					if (var9 == 0) {
						var2 = 1;
						break label67;
					}

					var7[var8] = var1;
					var8++;
					var9--;
					var12 = true;
				} else if (var3 == var11) {
					if (var9 == 0) {
						var2 = 1;
						break label67;
					}

					var7[var8] = var1;
					var8++;
					var9--;
					var12 = true;
				}
			}

			var2 = 2;
			var6 = var5[var6];
			byte var14 = (byte) (var6 & 0xFF);
			var6 >>= 8;
			var3++;
			if (var3 != var11) {
				if (var4 == var14) {
					var2 = 3;
					var6 = var5[var6];
					byte var15 = (byte) (var6 & 0xFF);
					var6 >>= 8;
					var3++;
					if (var3 != var11) {
						if (var4 == var15) {
							var6 = var5[var6];
							byte var16 = (byte) (var6 & 0xFF);
							var6 >>= 8;
							var3++;
							var2 = (var16 & 0xFF) + 4;
							var6 = var5[var6];
							var4 = (byte) (var6 & 0xFF);
							var6 >>= 8;
							var3++;
						} else {
							var4 = var15;
						}
					}
				} else {
					var4 = var14;
				}
			}
		}

		int var17 = arg0.field573;
		arg0.field573 += var10 - var9;
		if (arg0.field573 < var17) {
			arg0.field574++;
		}

		arg0.field575 = var1;
		arg0.field576 = var2;
		arg0.field586 = var3;
		arg0.field584 = var4;
		CUBSCFMS.field589 = var5;
		arg0.field583 = var6;
		arg0.field570 = var7;
		arg0.field571 = var8;
		arg0.field572 = var9;
	}

	@ObfuscatedName("XKTKWFYG.b(LCUBSCFMS;)V")
	public static void method569(CUBSCFMS arg0) {
		boolean var1 = false;
		boolean var2 = false;
		boolean var3 = false;
		boolean var4 = false;
		boolean var5 = false;
		boolean var6 = false;
		boolean var7 = false;
		boolean var8 = false;
		boolean var9 = false;
		boolean var10 = false;
		boolean var11 = false;
		boolean var12 = false;
		boolean var13 = false;
		boolean var14 = false;
		boolean var15 = false;
		boolean var16 = false;
		boolean var17 = false;
		boolean var18 = false;
		boolean var19 = false;
		int var20 = 0;
		int[] var21 = null;
		int[] var22 = null;
		int[] var23 = null;
		arg0.field580 = 1;
		if (CUBSCFMS.field589 == null) {
			CUBSCFMS.field589 = new int[arg0.field580 * 100000];
		}

		boolean var24 = true;
		while (var24) {
			byte var25 = method570(arg0);
			if (var25 == 23) {
				return;
			}

			byte var26 = method570(arg0);
			byte var27 = method570(arg0);
			byte var28 = method570(arg0);
			byte var29 = method570(arg0);
			byte var30 = method570(arg0);
			arg0.field581++;
			byte var31 = method570(arg0);
			byte var32 = method570(arg0);
			byte var33 = method570(arg0);
			byte var34 = method570(arg0);
			byte var35 = method571(arg0);
			if (var35 == 0) {
				arg0.field577 = false;
			} else {
				arg0.field577 = true;
			}

			if (arg0.field577) {
				System.out.println("PANIC! RANDOMISED BLOCK!");
			}

			arg0.field582 = 0;
			byte var36 = method570(arg0);
			arg0.field582 = arg0.field582 << 8 | var36 & 0xFF;
			byte var37 = method570(arg0);
			arg0.field582 = arg0.field582 << 8 | var37 & 0xFF;
			byte var38 = method570(arg0);
			arg0.field582 = arg0.field582 << 8 | var38 & 0xFF;

			for (int var39 = 0; var39 < 16; var39++) {
				byte var40 = method571(arg0);
				if (var40 == 1) {
					arg0.field592[var39] = true;
				} else {
					arg0.field592[var39] = false;
				}
			}

			for (int var41 = 0; var41 < 256; var41++) {
				arg0.field591[var41] = false;
			}

			for (int var42 = 0; var42 < 16; var42++) {
				if (arg0.field592[var42]) {
					for (int var43 = 0; var43 < 16; var43++) {
						byte var44 = method571(arg0);
						if (var44 == 1) {
							arg0.field591[var42 * 16 + var43] = true;
						}
					}
				}
			}

			method573(arg0);
			int var45 = arg0.field590 + 2;
			int var46 = method572(3, arg0);
			int var47 = method572(15, arg0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = 0;
				while (true) {
					byte var50 = method571(arg0);
					if (var50 == 0) {
						break;
					}

					var49++;
				}

				arg0.field597[var48] = (byte) var49;
			}

			byte[] var51 = new byte[6];
			byte var52 = 0;
			while (var52 < var46) {
				var51[var52] = var52++;
			}

			for (int var53 = 0; var53 < var47; var53++) {
				byte var54 = arg0.field597[var53];
				byte var55 = var51[var54];

				while (var54 > 0) {
					var51[var54] = var51[var54 - 1];
					var54--;
				}

				var51[0] = var55;
				arg0.field596[var53] = var55;
			}

			for (int var56 = 0; var56 < var46; var56++) {
				int var57 = method572(5, arg0);
				for (int var58 = 0; var58 < var45; var58++) {
					while (true) {
						byte var59 = method571(arg0);
						if (var59 == 0) {
							break;
						}

						byte var60 = method571(arg0);
						if (var60 == 0) {
							var57++;
						} else {
							var57--;
						}
					}

					arg0.field598[var56][var58] = (byte) var57;
				}
			}

			for (int var61 = 0; var61 < var46; var61++) {
				byte var62 = 32;
				byte var63 = 0;
				for (int var64 = 0; var64 < var45; var64++) {
					if (arg0.field598[var61][var64] > var63) {
						var63 = arg0.field598[var61][var64];
					}

					if (arg0.field598[var61][var64] < var62) {
						var62 = arg0.field598[var61][var64];
					}
				}

				method574(arg0.field599[var61], arg0.field600[var61], arg0.field601[var61], arg0.field598[var61], var62, var63, var45);
				arg0.field602[var61] = var62;
			}

			int var65 = arg0.field590 + 1;
			int var66 = arg0.field580 * 100000;
			int var67 = -1;
			byte var68 = 0;

			for (int var69 = 0; var69 <= 255; var69++) {
				arg0.field585[var69] = 0;
			}

			int var70 = 4095;
			for (int var71 = 15; var71 >= 0; var71--) {
				for (int var72 = 15; var72 >= 0; var72--) {
					arg0.field594[var70] = (byte) (var71 * 16 + var72);
					var70--;
				}

				arg0.field595[var71] = var70 + 1;
			}

			int var73 = 0;

			if (var68 == 0) {
				var67++;
				var68 = 50;
				byte var74 = arg0.field596[var67];
				var20 = arg0.field602[var74];
				var21 = arg0.field599[var74];
				var23 = arg0.field601[var74];
				var22 = arg0.field600[var74];
			}

			int var104 = var68 - 1;
			int var75 = var20;
			int var76;
			byte var77;
			for (var76 = method572(var20, arg0); var76 > var21[var75]; var76 = var76 << 1 | var77) {
				var75++;
				var77 = method571(arg0);
			}

			int var78 = var23[var76 - var22[var75]];
			while (var65 != var78) {
				if (var78 == 0 || var78 == 1) {
					int var79 = -1;
					int var80 = 1;
					do {
						if (var78 == 0) {
							var79 += var80;
						} else if (var78 == 1) {
							var79 += var80 * 2;
						}

						var80 *= 2;

						if (var104 == 0) {
							var67++;
							var104 = 50;
							byte var81 = arg0.field596[var67];
							var20 = arg0.field602[var81];
							var21 = arg0.field599[var81];
							var23 = arg0.field601[var81];
							var22 = arg0.field600[var81];
						}

						var104--;
						int var82 = var20;
						int var83;
						byte var84;
						for (var83 = method572(var20, arg0); var83 > var21[var82]; var83 = var83 << 1 | var84) {
							var82++;
							var84 = method571(arg0);
						}

						var78 = var23[var83 - var22[var82]];
					} while (var78 == 0 || var78 == 1);

					var79++;
					byte var85 = arg0.field593[arg0.field594[arg0.field595[0]] & 0xFF];
					arg0.field585[var85 & 0xFF] += var79;

					while (var79 > 0) {
						CUBSCFMS.field589[var73] = var85 & 0xFF;
						var73++;
						var79--;
					}
				} else {
					int var86 = var78 - 1;
					byte var88;
					if (var86 < 16) {
						int var87 = arg0.field595[0];
						var88 = arg0.field594[var86 + var87];

						while (var86 > 3) {
							int var89 = var86 + var87;
							arg0.field594[var89] = arg0.field594[var89 - 1];
							arg0.field594[var89 - 1] = arg0.field594[var89 - 2];
							arg0.field594[var89 - 2] = arg0.field594[var89 - 3];
							arg0.field594[var89 - 3] = arg0.field594[var89 - 4];
							var86 -= 4;
						}

						while (var86 > 0) {
							arg0.field594[var86 + var87] = arg0.field594[var86 + var87 - 1];
							var86--;
						}

						arg0.field594[var87] = var88;
					} else {
						int var90 = var86 / 16;
						int var91 = var86 % 16;
						int var92 = arg0.field595[var90] + var91;
						var88 = arg0.field594[var92];

						while (var92 > arg0.field595[var90]) {
							arg0.field594[var92] = arg0.field594[var92 - 1];
							var92--;
						}

						arg0.field595[var90]++;
						while (var90 > 0) {
							arg0.field595[var90]--;
							arg0.field594[arg0.field595[var90]] = arg0.field594[arg0.field595[var90 - 1] + 16 - 1];
							var90--;
						}

						arg0.field595[0]--;
						arg0.field594[arg0.field595[0]] = var88;
						if (arg0.field595[0] == 0) {
							int var93 = 4095;
							for (int var94 = 15; var94 >= 0; var94--) {
								for (int var95 = 15; var95 >= 0; var95--) {
									arg0.field594[var93] = arg0.field594[arg0.field595[var94] + var95];
									var93--;
								}

								arg0.field595[var94] = var93 + 1;
							}
						}
					}

					arg0.field585[arg0.field593[var88 & 0xFF] & 0xFF]++;
					CUBSCFMS.field589[var73] = arg0.field593[var88 & 0xFF] & 0xFF;
					var73++;

					if (var104 == 0) {
						var67++;
						var104 = 50;
						byte var96 = arg0.field596[var67];
						var20 = arg0.field602[var96];
						var21 = arg0.field599[var96];
						var23 = arg0.field601[var96];
						var22 = arg0.field600[var96];
					}

					var104--;
					int var97 = var20;
					int var98;
					byte var99;
					for (var98 = method572(var20, arg0); var98 > var21[var97]; var98 = var98 << 1 | var99) {
						var97++;
						var99 = method571(arg0);
					}

					var78 = var23[var98 - var22[var97]];
				}
			}

			arg0.field576 = 0;
			arg0.field575 = 0;
			arg0.field587[0] = 0;
			for (int var100 = 1; var100 <= 256; var100++) {
				arg0.field587[var100] = arg0.field585[var100 - 1];
			}

			for (int var101 = 1; var101 <= 256; var101++) {
				arg0.field587[var101] += arg0.field587[var101 - 1];
			}

			for (int var102 = 0; var102 < var73; var102++) {
				byte var103 = (byte) (CUBSCFMS.field589[var102] & 0xFF);
				CUBSCFMS.field589[arg0.field587[var103 & 0xFF]] |= var102 << 8;
				arg0.field587[var103 & 0xFF]++;
			}

			arg0.field583 = CUBSCFMS.field589[arg0.field582] >> 8;
			arg0.field586 = 0;
			arg0.field583 = CUBSCFMS.field589[arg0.field583];
			arg0.field584 = (byte) (arg0.field583 & 0xFF);
			arg0.field583 >>= 8;
			arg0.field586++;
			arg0.field603 = var73;
			method568(arg0);

			if (arg0.field603 + 1 == arg0.field586 && arg0.field576 == 0) {
				var24 = true;
			} else {
				var24 = false;
			}
		}
	}

	@ObfuscatedName("XKTKWFYG.c(LCUBSCFMS;)B")
	public static byte method570(CUBSCFMS arg0) {
		return (byte) method572(8, arg0);
	}

	@ObfuscatedName("XKTKWFYG.d(LCUBSCFMS;)B")
	public static byte method571(CUBSCFMS arg0) {
		return (byte) method572(1, arg0);
	}

	@ObfuscatedName("XKTKWFYG.a(ILCUBSCFMS;)I")
	public static int method572(int arg0, CUBSCFMS arg1) {
		while (arg1.field579 < arg0) {
			arg1.field578 = arg1.field578 << 8 | arg1.field565[arg1.field566] & 0xFF;
			arg1.field579 += 8;
			arg1.field566++;
			arg1.field567--;
			arg1.field568++;
			if (arg1.field568 == 0) {
				arg1.field569++;
			}
		}

		int var2 = arg1.field578 >> arg1.field579 - arg0 & (1 << arg0) - 1;
		arg1.field579 -= arg0;
		return var2;
	}

	@ObfuscatedName("XKTKWFYG.e(LCUBSCFMS;)V")
	public static void method573(CUBSCFMS arg0) {
		arg0.field590 = 0;
		for (int var1 = 0; var1 < 256; var1++) {
			if (arg0.field591[var1]) {
				arg0.field593[arg0.field590] = (byte) var1;
				arg0.field590++;
			}
		}
	}

	@ObfuscatedName("XKTKWFYG.a([I[I[I[BIII)V")
	public static void method574(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var7 = 0;
		for (int var8 = arg4; var8 <= arg5; var8++) {
			for (int var9 = 0; var9 < arg6; var9++) {
				if (arg3[var9] == var8) {
					arg2[var7] = var9;
					var7++;
				}
			}
		}

		for (int var10 = 0; var10 < 23; var10++) {
			arg1[var10] = 0;
		}

		for (int var11 = 0; var11 < arg6; var11++) {
			arg1[arg3[var11] + 1]++;
		}

		for (int var12 = 1; var12 < 23; var12++) {
			arg1[var12] += arg1[var12 - 1];
		}

		for (int var13 = 0; var13 < 23; var13++) {
			arg0[var13] = 0;
		}

		int var14 = 0;
		for (int var15 = arg4; var15 <= arg5; var15++) {
			var14 += arg1[var15 + 1] - arg1[var15];
			arg0[var15] = var14 - 1;
			var14 <<= 1;
		}

		for (int var16 = arg4 + 1; var16 <= arg5; var16++) {
			arg1[var16] = (arg0[var16 - 1] + 1 << 1) - arg1[var16];
		}
	}
}
