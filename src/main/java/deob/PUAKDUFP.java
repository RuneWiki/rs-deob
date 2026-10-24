package deob;

@ObfuscatedName("PUAKDUFP")
public final class PUAKDUFP {

	@ObfuscatedName("PUAKDUFP.a")
	public static JPBRSBFI field898 = new JPBRSBFI();

	@ObfuscatedName("PUAKDUFP.a([BI[BII)I")
	public static int method387(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
		synchronized (field898) {
			field898.field746 = arg2;
			field898.field747 = arg4;
			field898.field751 = arg0;
			field898.field752 = 0;
			field898.field748 = arg3;
			field898.field753 = arg1;
			field898.field760 = 0;
			field898.field759 = 0;
			field898.field749 = 0;
			field898.field750 = 0;
			field898.field754 = 0;
			field898.field755 = 0;
			field898.field762 = 0;
			method389(field898);
			return arg1 - field898.field753;
		}
	}

	@ObfuscatedName("PUAKDUFP.a(LJPBRSBFI;)V")
	public static void method388(JPBRSBFI arg0) {
		byte var1 = arg0.field756;
		int var2 = arg0.field757;
		int var3 = arg0.field767;
		int var4 = arg0.field765;
		int[] var5 = JPBRSBFI.field770;
		int var6 = arg0.field764;
		byte[] var7 = arg0.field751;
		int var8 = arg0.field752;
		int var9 = arg0.field753;
		int var10 = var9;
		int var11 = arg0.field784 + 1;
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

		int var17 = arg0.field754;
		arg0.field754 += var10 - var9;
		if (arg0.field754 < var17) {
			arg0.field755++;
		}

		arg0.field756 = var1;
		arg0.field757 = var2;
		arg0.field767 = var3;
		arg0.field765 = var4;
		JPBRSBFI.field770 = var5;
		arg0.field764 = var6;
		arg0.field751 = var7;
		arg0.field752 = var8;
		arg0.field753 = var9;
	}

	@ObfuscatedName("PUAKDUFP.b(LJPBRSBFI;)V")
	public static void method389(JPBRSBFI arg0) {
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
		arg0.field761 = 1;
		if (JPBRSBFI.field770 == null) {
			JPBRSBFI.field770 = new int[arg0.field761 * 100000];
		}

		boolean var24 = true;
		while (var24) {
			byte var25 = method390(arg0);
			if (var25 == 23) {
				return;
			}

			byte var26 = method390(arg0);
			byte var27 = method390(arg0);
			byte var28 = method390(arg0);
			byte var29 = method390(arg0);
			byte var30 = method390(arg0);
			arg0.field762++;
			byte var31 = method390(arg0);
			byte var32 = method390(arg0);
			byte var33 = method390(arg0);
			byte var34 = method390(arg0);
			byte var35 = method391(arg0);
			if (var35 == 0) {
				arg0.field758 = false;
			} else {
				arg0.field758 = true;
			}

			if (arg0.field758) {
				System.out.println("PANIC! RANDOMISED BLOCK!");
			}

			arg0.field763 = 0;
			byte var36 = method390(arg0);
			arg0.field763 = arg0.field763 << 8 | var36 & 0xFF;
			byte var37 = method390(arg0);
			arg0.field763 = arg0.field763 << 8 | var37 & 0xFF;
			byte var38 = method390(arg0);
			arg0.field763 = arg0.field763 << 8 | var38 & 0xFF;

			for (int var39 = 0; var39 < 16; var39++) {
				byte var40 = method391(arg0);
				if (var40 == 1) {
					arg0.field773[var39] = true;
				} else {
					arg0.field773[var39] = false;
				}
			}

			for (int var41 = 0; var41 < 256; var41++) {
				arg0.field772[var41] = false;
			}

			for (int var42 = 0; var42 < 16; var42++) {
				if (arg0.field773[var42]) {
					for (int var43 = 0; var43 < 16; var43++) {
						byte var44 = method391(arg0);
						if (var44 == 1) {
							arg0.field772[var42 * 16 + var43] = true;
						}
					}
				}
			}

			method393(arg0);
			int var45 = arg0.field771 + 2;
			int var46 = method392(3, arg0);
			int var47 = method392(15, arg0);
			for (int var48 = 0; var48 < var47; var48++) {
				int var49 = 0;
				while (true) {
					byte var50 = method391(arg0);
					if (var50 == 0) {
						break;
					}

					var49++;
				}

				arg0.field778[var48] = (byte) var49;
			}

			byte[] var51 = new byte[6];
			byte var52 = 0;
			while (var52 < var46) {
				var51[var52] = var52++;
			}

			for (int var53 = 0; var53 < var47; var53++) {
				byte var54 = arg0.field778[var53];
				byte var55 = var51[var54];

				while (var54 > 0) {
					var51[var54] = var51[var54 - 1];
					var54--;
				}

				var51[0] = var55;
				arg0.field777[var53] = var55;
			}

			for (int var56 = 0; var56 < var46; var56++) {
				int var57 = method392(5, arg0);
				for (int var58 = 0; var58 < var45; var58++) {
					while (true) {
						byte var59 = method391(arg0);
						if (var59 == 0) {
							break;
						}

						byte var60 = method391(arg0);
						if (var60 == 0) {
							var57++;
						} else {
							var57--;
						}
					}

					arg0.field779[var56][var58] = (byte) var57;
				}
			}

			for (int var61 = 0; var61 < var46; var61++) {
				byte var62 = 32;
				byte var63 = 0;
				for (int var64 = 0; var64 < var45; var64++) {
					if (arg0.field779[var61][var64] > var63) {
						var63 = arg0.field779[var61][var64];
					}

					if (arg0.field779[var61][var64] < var62) {
						var62 = arg0.field779[var61][var64];
					}
				}

				method394(arg0.field780[var61], arg0.field781[var61], arg0.field782[var61], arg0.field779[var61], var62, var63, var45);
				arg0.field783[var61] = var62;
			}

			int var65 = arg0.field771 + 1;
			int var66 = arg0.field761 * 100000;
			int var67 = -1;
			byte var68 = 0;

			for (int var69 = 0; var69 <= 255; var69++) {
				arg0.field766[var69] = 0;
			}

			int var70 = 4095;
			for (int var71 = 15; var71 >= 0; var71--) {
				for (int var72 = 15; var72 >= 0; var72--) {
					arg0.field775[var70] = (byte) (var71 * 16 + var72);
					var70--;
				}

				arg0.field776[var71] = var70 + 1;
			}

			int var73 = 0;

			if (var68 == 0) {
				var67++;
				var68 = 50;
				byte var74 = arg0.field777[var67];
				var20 = arg0.field783[var74];
				var21 = arg0.field780[var74];
				var23 = arg0.field782[var74];
				var22 = arg0.field781[var74];
			}

			int var104 = var68 - 1;
			int var75 = var20;
			int var76;
			byte var77;
			for (var76 = method392(var20, arg0); var76 > var21[var75]; var76 = var76 << 1 | var77) {
				var75++;
				var77 = method391(arg0);
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
							byte var81 = arg0.field777[var67];
							var20 = arg0.field783[var81];
							var21 = arg0.field780[var81];
							var23 = arg0.field782[var81];
							var22 = arg0.field781[var81];
						}

						var104--;
						int var82 = var20;
						int var83;
						byte var84;
						for (var83 = method392(var20, arg0); var83 > var21[var82]; var83 = var83 << 1 | var84) {
							var82++;
							var84 = method391(arg0);
						}

						var78 = var23[var83 - var22[var82]];
					} while (var78 == 0 || var78 == 1);

					var79++;
					byte var85 = arg0.field774[arg0.field775[arg0.field776[0]] & 0xFF];
					arg0.field766[var85 & 0xFF] += var79;

					while (var79 > 0) {
						JPBRSBFI.field770[var73] = var85 & 0xFF;
						var73++;
						var79--;
					}
				} else {
					int var86 = var78 - 1;
					byte var88;
					if (var86 < 16) {
						int var87 = arg0.field776[0];
						var88 = arg0.field775[var86 + var87];

						while (var86 > 3) {
							int var89 = var86 + var87;
							arg0.field775[var89] = arg0.field775[var89 - 1];
							arg0.field775[var89 - 1] = arg0.field775[var89 - 2];
							arg0.field775[var89 - 2] = arg0.field775[var89 - 3];
							arg0.field775[var89 - 3] = arg0.field775[var89 - 4];
							var86 -= 4;
						}

						while (var86 > 0) {
							arg0.field775[var86 + var87] = arg0.field775[var86 + var87 - 1];
							var86--;
						}

						arg0.field775[var87] = var88;
					} else {
						int var90 = var86 / 16;
						int var91 = var86 % 16;
						int var92 = arg0.field776[var90] + var91;
						var88 = arg0.field775[var92];

						while (var92 > arg0.field776[var90]) {
							arg0.field775[var92] = arg0.field775[var92 - 1];
							var92--;
						}

						arg0.field776[var90]++;
						while (var90 > 0) {
							arg0.field776[var90]--;
							arg0.field775[arg0.field776[var90]] = arg0.field775[arg0.field776[var90 - 1] + 16 - 1];
							var90--;
						}

						arg0.field776[0]--;
						arg0.field775[arg0.field776[0]] = var88;
						if (arg0.field776[0] == 0) {
							int var93 = 4095;
							for (int var94 = 15; var94 >= 0; var94--) {
								for (int var95 = 15; var95 >= 0; var95--) {
									arg0.field775[var93] = arg0.field775[arg0.field776[var94] + var95];
									var93--;
								}

								arg0.field776[var94] = var93 + 1;
							}
						}
					}

					arg0.field766[arg0.field774[var88 & 0xFF] & 0xFF]++;
					JPBRSBFI.field770[var73] = arg0.field774[var88 & 0xFF] & 0xFF;
					var73++;

					if (var104 == 0) {
						var67++;
						var104 = 50;
						byte var96 = arg0.field777[var67];
						var20 = arg0.field783[var96];
						var21 = arg0.field780[var96];
						var23 = arg0.field782[var96];
						var22 = arg0.field781[var96];
					}

					var104--;
					int var97 = var20;
					int var98;
					byte var99;
					for (var98 = method392(var20, arg0); var98 > var21[var97]; var98 = var98 << 1 | var99) {
						var97++;
						var99 = method391(arg0);
					}

					var78 = var23[var98 - var22[var97]];
				}
			}

			arg0.field757 = 0;
			arg0.field756 = 0;
			arg0.field768[0] = 0;
			for (int var100 = 1; var100 <= 256; var100++) {
				arg0.field768[var100] = arg0.field766[var100 - 1];
			}

			for (int var101 = 1; var101 <= 256; var101++) {
				arg0.field768[var101] += arg0.field768[var101 - 1];
			}

			for (int var102 = 0; var102 < var73; var102++) {
				byte var103 = (byte) (JPBRSBFI.field770[var102] & 0xFF);
				JPBRSBFI.field770[arg0.field768[var103 & 0xFF]] |= var102 << 8;
				arg0.field768[var103 & 0xFF]++;
			}

			arg0.field764 = JPBRSBFI.field770[arg0.field763] >> 8;
			arg0.field767 = 0;
			arg0.field764 = JPBRSBFI.field770[arg0.field764];
			arg0.field765 = (byte) (arg0.field764 & 0xFF);
			arg0.field764 >>= 8;
			arg0.field767++;
			arg0.field784 = var73;
			method388(arg0);

			if (arg0.field784 + 1 == arg0.field767 && arg0.field757 == 0) {
				var24 = true;
			} else {
				var24 = false;
			}
		}
	}

	@ObfuscatedName("PUAKDUFP.c(LJPBRSBFI;)B")
	public static byte method390(JPBRSBFI arg0) {
		return (byte) method392(8, arg0);
	}

	@ObfuscatedName("PUAKDUFP.d(LJPBRSBFI;)B")
	public static byte method391(JPBRSBFI arg0) {
		return (byte) method392(1, arg0);
	}

	@ObfuscatedName("PUAKDUFP.a(ILJPBRSBFI;)I")
	public static int method392(int arg0, JPBRSBFI arg1) {
		while (arg1.field760 < arg0) {
			arg1.field759 = arg1.field759 << 8 | arg1.field746[arg1.field747] & 0xFF;
			arg1.field760 += 8;
			arg1.field747++;
			arg1.field748--;
			arg1.field749++;
			if (arg1.field749 == 0) {
				arg1.field750++;
			}
		}

		int var2 = arg1.field759 >> arg1.field760 - arg0 & (1 << arg0) - 1;
		arg1.field760 -= arg0;
		return var2;
	}

	@ObfuscatedName("PUAKDUFP.e(LJPBRSBFI;)V")
	public static void method393(JPBRSBFI arg0) {
		arg0.field771 = 0;
		for (int var1 = 0; var1 < 256; var1++) {
			if (arg0.field772[var1]) {
				arg0.field774[arg0.field771] = (byte) var1;
				arg0.field771++;
			}
		}
	}

	@ObfuscatedName("PUAKDUFP.a([I[I[I[BIII)V")
	public static void method394(int[] arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6) {
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
