package deob;

@ObfuscatedName("SNGUFYDX")
public final class SNGUFYDX {

	@ObfuscatedName("SNGUFYDX.B")
	public int field1212;

	@ObfuscatedName("SNGUFYDX.C")
	public int field1213;

	@ObfuscatedName("SNGUFYDX.d")
	public int[][][] field1193;

	@ObfuscatedName("SNGUFYDX.j")
	public byte[][][] field1196;

	@ObfuscatedName("SNGUFYDX.a")
	public byte[][][] field1191;

	@ObfuscatedName("SNGUFYDX.n")
	public byte[][][] field1199;

	@ObfuscatedName("SNGUFYDX.E")
	public byte[][][] field1215;

	@ObfuscatedName("SNGUFYDX.m")
	public byte[][][] field1198;

	@ObfuscatedName("SNGUFYDX.z")
	public int[][][] field1210;

	@ObfuscatedName("SNGUFYDX.b")
	public byte[][][] field1192;

	@ObfuscatedName("SNGUFYDX.v")
	public int[][] field1207;

	@ObfuscatedName("SNGUFYDX.p")
	public int[] field1201;

	@ObfuscatedName("SNGUFYDX.q")
	public int[] field1202;

	@ObfuscatedName("SNGUFYDX.r")
	public int[] field1203;

	@ObfuscatedName("SNGUFYDX.s")
	public int[] field1204;

	@ObfuscatedName("SNGUFYDX.t")
	public int[] field1205;

	@ObfuscatedName("SNGUFYDX.e")
	public static final int[] field1194 = new int[] { 0, -1, 0, 1 };

	@ObfuscatedName("SNGUFYDX.o")
	public static final int[] field1200 = new int[] { 1, 0, -1, 0 };

	@ObfuscatedName("SNGUFYDX.u")
	public static boolean field1206 = true;

	@ObfuscatedName("SNGUFYDX.x")
	public static final int[] field1208 = new int[] { 1, 2, 4, 8 };

	@ObfuscatedName("SNGUFYDX.y")
	public static final int[] field1209 = new int[] { 16, 32, 64, 128 };

	@ObfuscatedName("SNGUFYDX.A")
	public static int field1211 = 99;

	@ObfuscatedName("SNGUFYDX.f")
	public static int field1195 = (int) (Math.random() * 33.0D) - 16;

	@ObfuscatedName("SNGUFYDX.D")
	public static int field1214 = (int) (Math.random() * 17.0D) - 8;

	@ObfuscatedName("SNGUFYDX.l")
	public static int field1197;

	@ObfuscatedName("SNGUFYDX.a(I[LMNHXSMWL;III[BI)V")
	public final void method455(int arg0, MNHXSMWL[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
		for (int var7 = 0; var7 < 4; var7++) {
			for (int var8 = 0; var8 < 64; var8++) {
				for (int var9 = 0; var9 < 64; var9++) {
					if (arg5 + var8 > 0 && arg5 + var8 < 103 && arg0 + var9 > 0 && arg0 + var9 < 103) {
						arg1[var7].field793[arg5 + var8][arg0 + var9] &= 0xFEFFFFFF;
					}
				}
			}
		}

		MUKVLYLC var10 = new MUKVLYLC(arg4);
		for (int var11 = 0; var11 < 4; var11++) {
			for (int var12 = 0; var12 < 64; var12++) {
				for (int var13 = 0; var13 < 64; var13++) {
					method474(arg5 + var12, var11, arg0 + var13, var10, arg2, 0, arg3);
				}
			}
		}
	}

	@ObfuscatedName("SNGUFYDX.a(III)I")
	public final int method456(int arg0, int arg1, int arg2) {
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

	@ObfuscatedName("SNGUFYDX.a(ZIIII)V")
	public final void method457(int arg0, int arg1, int arg2, int arg3) {
		for (int var5 = arg2; var5 <= arg0 + arg2; var5++) {
			for (int var6 = arg1; var6 <= arg1 + arg3; var6++) {
				if (var6 >= 0 && var6 < field1212 && var5 >= 0 && var5 < field1213) {
					field1192[0][var6][var5] = 127;

					if (arg1 == var6 && var6 > 0) {
						field1193[0][var6][var5] = field1193[0][var6 - 1][var5];
					}

					if (arg1 + arg3 == var6 && var6 < field1212 - 1) {
						field1193[0][var6][var5] = field1193[0][var6 + 1][var5];
					}

					if (arg2 == var5 && var5 > 0) {
						field1193[0][var6][var5] = field1193[0][var6][var5 - 1];
					}

					if (arg0 + arg2 == var5 && var5 < field1213 - 1) {
						field1193[0][var6][var5] = field1193[0][var6][var5 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("SNGUFYDX.a(II)I")
	public static final int method458(int arg0, int arg1) {
		int var2 = method468(arg0 + 45365, arg1 + 91923, 4) + (method468(arg0 + 10294, arg1 + 37821, 2) - 128 >> 1) + (method468(arg0, arg1, 1) - 128 >> 2) - 128;
		var2 = (int) (var2 * 0.3D) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}

		return var2;
	}

	@ObfuscatedName("SNGUFYDX.b(II)I")
	public final int method459(int arg0, int arg1) {
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

	@ObfuscatedName("SNGUFYDX.a([BIBI)Z")
	public static final boolean method460(byte[] arg0, int arg1, int arg2) {
		boolean var3 = true;
		MUKVLYLC var4 = new MUKVLYLC(arg0);
		int var5 = -1;
		while (true) {
			int var6 = var4.method306();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;
			while (true) {
				if (var8) {
					int var9 = var4.method306();
					if (var9 == 0) {
						break;
					}

					var4.method292();
				} else {
					int var10 = var4.method306();
					if (var10 == 0) {
						break;
					}

					var7 += var10 - 1;
					int var11 = var7 & 0x3F;
					int var12 = var7 >> 6 & 0x3F;
					int var13 = var4.method292() >> 2;
					int var14 = arg2 + var12;
					int var15 = arg1 + var11;
					if (var14 > 0 && var15 > 0 && var14 < 103 && var15 < 103) {
						PFIKHQJO var16 = PFIKHQJO.method405(var5);
						if (var13 != 22 || !field1206 || var16.field983 || var16.field972) {
							var3 &= var16.method404();
							var8 = true;
						}
					}
				}
			}
		}
	}

	public SNGUFYDX(byte[][][] arg0, int arg1, int arg2, int[][][] arg3) {
		field1211 = 99;
		field1212 = arg2;
		field1213 = arg1;
		field1193 = arg3;
		field1196 = arg0;
		field1191 = new byte[4][field1212][field1213];
		field1199 = new byte[4][field1212][field1213];
		field1215 = new byte[4][field1212][field1213];
		field1198 = new byte[4][field1212][field1213];
		field1210 = new int[4][field1212 + 1][field1213 + 1];
		field1192 = new byte[4][field1212 + 1][field1213 + 1];
		field1207 = new int[field1212 + 1][field1213 + 1];
		field1201 = new int[field1213];
		field1202 = new int[field1213];
		field1203 = new int[field1213];
		field1204 = new int[field1213];
		field1205 = new int[field1213];
	}

	@ObfuscatedName("SNGUFYDX.a(ZLUWQNYVPL;[LMNHXSMWL;)V")
	public final void method461(UWQNYVPL arg0, MNHXSMWL[] arg1) {
		for (int var3 = 0; var3 < 4; var3++) {
			for (int var4 = 0; var4 < 104; var4++) {
				for (int var5 = 0; var5 < 104; var5++) {
					if ((field1196[var3][var4][var5] & 0x1) == 1) {
						int var6 = var3;
						if ((field1196[1][var4][var5] & 0x2) == 2) {
							var6 = var3 - 1;
						}

						if (var6 >= 0) {
							arg1[var6].method271(var5, var4);
						}
					}
				}
			}
		}

		field1214 += (int) (Math.random() * 5.0D) - 2;
		if (field1214 < -8) {
			field1214 = -8;
		}

		if (field1214 > 8) {
			field1214 = 8;
		}

		field1195 += (int) (Math.random() * 5.0D) - 2;
		if (field1195 < -16) {
			field1195 = -16;
		}

		if (field1195 > 16) {
			field1195 = 16;
		}

		for (int var7 = 0; var7 < 4; var7++) {
			byte[][] var8 = field1192[var7];
			byte var9 = 96;
			short var10 = 768;
			byte var11 = -50;
			byte var12 = -10;
			byte var13 = -50;
			int var14 = (int) Math.sqrt(var13 * var13 + var11 * var11 + var12 * var12);
			int var15 = var10 * var14 >> 8;
			for (int var16 = 1; var16 < field1213 - 1; var16++) {
				for (int var17 = 1; var17 < field1212 - 1; var17++) {
					int var18 = field1193[var7][var17 + 1][var16] - field1193[var7][var17 - 1][var16];
					int var19 = field1193[var7][var17][var16 + 1] - field1193[var7][var17][var16 - 1];
					int var20 = (int) Math.sqrt(var19 * var19 + var18 * var18 + 0x10000);
					int var21 = (var18 << 8) / var20;
					int var22 = 0x10000 / var20;
					int var23 = (var19 << 8) / var20;
					int var24 = (var13 * var23 + var11 * var21 + var12 * var22) / var15 + var9;
					int var25 = (var8[var17][var16] >> 1) + (var8[var17][var16 + 1] >> 3) + (var8[var17][var16 - 1] >> 2) + (var8[var17 - 1][var16] >> 2) + (var8[var17 + 1][var16] >> 3);
					field1207[var17][var16] = var24 - var25;
				}
			}

			for (int var26 = 0; var26 < field1213; var26++) {
				field1201[var26] = 0;
				field1202[var26] = 0;
				field1203[var26] = 0;
				field1204[var26] = 0;
				field1205[var26] = 0;
			}

			for (int var27 = -5; var27 < field1212 + 5; var27++) {
				for (int var28 = 0; var28 < field1213; var28++) {
					int var29 = var27 + 5;
					if (var29 >= 0 && var29 < field1212) {
						int var30 = field1191[var7][var29][var28] & 0xFF;
						if (var30 > 0) {
							YTVETJJL var31 = YTVETJJL.field1436[var30 - 1];
							field1201[var28] += var31.field1445;
							field1202[var28] += var31.field1443;
							field1203[var28] += var31.field1444;
							field1204[var28] += var31.field1446;
							field1205[var28]++;
						}
					}

					int var32 = var27 - 5;
					if (var32 >= 0 && var32 < field1212) {
						int var33 = field1191[var7][var32][var28] & 0xFF;
						if (var33 > 0) {
							YTVETJJL var34 = YTVETJJL.field1436[var33 - 1];
							field1201[var28] -= var34.field1445;
							field1202[var28] -= var34.field1443;
							field1203[var28] -= var34.field1444;
							field1204[var28] -= var34.field1446;
							field1205[var28]--;
						}
					}
				}

				if (var27 >= 1 && var27 < field1212 - 1) {
					int var35 = 0;
					int var36 = 0;
					int var37 = 0;
					int var38 = 0;
					int var39 = 0;
					for (int var40 = -5; var40 < field1213 + 5; var40++) {
						int var41 = var40 + 5;
						if (var41 >= 0 && var41 < field1213) {
							var35 += field1201[var41];
							var36 += field1202[var41];
							var37 += field1203[var41];
							var38 += field1204[var41];
							var39 += field1205[var41];
						}

						int var42 = var40 - 5;
						if (var42 >= 0 && var42 < field1213) {
							var35 -= field1201[var42];
							var36 -= field1202[var42];
							var37 -= field1203[var42];
							var38 -= field1204[var42];
							var39 -= field1205[var42];
						}

						if (var40 >= 1 && var40 < field1213 - 1 && (!field1206 || (field1196[0][var27][var40] & 0x2) != 0 || (field1196[var7][var27][var40] & 0x10) == 0 && method470(var7, var40, var27) == field1197)) {
							if (var7 < field1211) {
								field1211 = var7;
							}

							int var43 = field1191[var7][var27][var40] & 0xFF;
							int var44 = field1199[var7][var27][var40] & 0xFF;
							if (var43 > 0 || var44 > 0) {
								int var45 = field1193[var7][var27][var40];
								int var46 = field1193[var7][var27 + 1][var40];
								int var47 = field1193[var7][var27 + 1][var40 + 1];
								int var48 = field1193[var7][var27][var40 + 1];
								int var49 = field1207[var27][var40];
								int var50 = field1207[var27 + 1][var40];
								int var51 = field1207[var27 + 1][var40 + 1];
								int var52 = field1207[var27][var40 + 1];
								int var53 = -1;
								int var54 = -1;
								if (var43 > 0) {
									int var55 = var35 * 256 / var38;
									int var56 = var36 / var39;
									int var57 = var37 / var39;
									var53 = method456(var55, var56, var57);
									var55 = field1214 + var55 & 0xFF;
									var57 += field1195;
									if (var57 < 0) {
										var57 = 0;
									} else if (var57 > 255) {
										var57 = 255;
									}

									var54 = method456(var55, var56, var57);
								}

								if (var7 > 0) {
									boolean var58 = true;
									if (var43 == 0 && field1215[var7][var27][var40] != 0) {
										var58 = false;
									}

									if (var44 > 0 && !YTVETJJL.field1436[var44 - 1].field1441) {
										var58 = false;
									}

									if (var58 && var45 == var46 && var45 == var47 && var45 == var48) {
										field1210[var7][var27][var40] |= 0x924;
									}
								}

								int var59 = 0;
								if (var53 != -1) {
									var59 = QVVCPQSC.field1106[method466(var54, 96)];
								}

								if (var44 == 0) {
									arg0.method514(var7, var27, var40, 0, 0, -1, var45, var46, var47, var48, method466(var53, var49), method466(var53, var50), method466(var53, var51), method466(var53, var52), 0, 0, 0, 0, var59, 0);
								} else {
									int var60 = field1215[var7][var27][var40] + 1;
									byte var61 = field1198[var7][var27][var40];
									YTVETJJL var62 = YTVETJJL.field1436[var44 - 1];
									int var63 = var62.field1439;
									int var64;
									int var65;
									if (var63 >= 0) {
										var64 = QVVCPQSC.method439(var63);
										var65 = -1;
									} else if (var62.field1438 == 0xFF00FF) {
										var64 = 0;
										var65 = -2;
										var63 = -1;
									} else {
										var65 = method456(var62.field1442, var62.field1443, var62.field1444);
										var64 = QVVCPQSC.field1106[method459(var62.field1447, 96)];
									}

									arg0.method514(var7, var27, var40, var60, var61, var63, var45, var46, var47, var48, method466(var53, var49), method466(var53, var50), method466(var53, var51), method466(var53, var52), method459(var65, var49), method459(var65, var50), method459(var65, var51), method459(var65, var52), var59, var64);
								}
							}
						}
					}
				}
			}

			for (int var66 = 1; var66 < field1213 - 1; var66++) {
				for (int var67 = 1; var67 < field1212 - 1; var67++) {
					arg0.method513(var7, var67, var66, method470(var7, var66, var67));
				}
			}
		}

		arg0.method540(-10, 768, 64, -50, -50);

		for (int var68 = 0; var68 < field1212; var68++) {
			for (int var69 = 0; var69 < field1213; var69++) {
				if ((field1196[1][var68][var69] & 0x2) == 2) {
					arg0.method511(var68, var69);
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
				for (int var75 = 0; var75 <= field1213; var75++) {
					for (int var76 = 0; var76 <= field1212; var76++) {
						if ((field1210[var74][var76][var75] & var70) != 0) {
							int var77 = var75;
							int var78 = var75;
							int var79 = var74;
							int var80 = var74;

							while (var77 > 0 && (field1210[var74][var76][var77 - 1] & var70) != 0) {
								var77--;
							}

							while (var78 < field1213 && (field1210[var74][var76][var78 + 1] & var70) != 0) {
								var78++;
							}

							label325: while (var79 > 0) {
								for (int var81 = var77; var81 <= var78; var81++) {
									if ((field1210[var79 - 1][var76][var81] & var70) == 0) {
										break label325;
									}
								}

								var79--;
							}

							label314: while (var80 < var73) {
								for (int var82 = var77; var82 <= var78; var82++) {
									if ((field1210[var80 + 1][var76][var82] & var70) == 0) {
										break label314;
									}
								}

								var80++;
							}

							int var83 = (var80 + 1 - var79) * (var78 + 1 - var77);
							if (var83 >= 8) {
								short var84 = 240;
								int var85 = field1193[var80][var76][var77] - var84;
								int var86 = field1193[var79][var76][var77];
								UWQNYVPL.method512(var86, var76 * 128, var85, var78 * 128 + 128, var73, var76 * 128, var77 * 128, 1);

								for (int var87 = var79; var87 <= var80; var87++) {
									for (int var88 = var77; var88 <= var78; var88++) {
										field1210[var87][var76][var88] &= ~var70;
									}
								}
							}
						}

						if ((field1210[var74][var76][var75] & var71) != 0) {
							int var89 = var76;
							int var90 = var76;
							int var91 = var74;
							int var92 = var74;

							while (var89 > 0 && (field1210[var74][var89 - 1][var75] & var71) != 0) {
								var89--;
							}

							while (var90 < field1212 && (field1210[var74][var90 + 1][var75] & var71) != 0) {
								var90++;
							}

							label378: while (var91 > 0) {
								for (int var93 = var89; var93 <= var90; var93++) {
									if ((field1210[var91 - 1][var93][var75] & var71) == 0) {
										break label378;
									}
								}

								var91--;
							}

							label367: while (var92 < var73) {
								for (int var94 = var89; var94 <= var90; var94++) {
									if ((field1210[var92 + 1][var94][var75] & var71) == 0) {
										break label367;
									}
								}

								var92++;
							}

							int var95 = (var92 + 1 - var91) * (var90 + 1 - var89);
							if (var95 >= 8) {
								short var96 = 240;
								int var97 = field1193[var92][var89][var75] - var96;
								int var98 = field1193[var91][var89][var75];
								UWQNYVPL.method512(var98, var89 * 128, var97, var75 * 128, var73, var90 * 128 + 128, var75 * 128, 2);

								for (int var99 = var91; var99 <= var92; var99++) {
									for (int var100 = var89; var100 <= var90; var100++) {
										field1210[var99][var100][var75] &= ~var71;
									}
								}
							}
						}

						if ((field1210[var74][var76][var75] & var72) != 0) {
							int var101 = var76;
							int var102 = var76;
							int var103 = var75;
							int var104 = var75;

							while (var103 > 0 && (field1210[var74][var76][var103 - 1] & var72) != 0) {
								var103--;
							}

							while (var104 < field1213 && (field1210[var74][var76][var104 + 1] & var72) != 0) {
								var104++;
							}

							label431: while (var101 > 0) {
								for (int var105 = var103; var105 <= var104; var105++) {
									if ((field1210[var74][var101 - 1][var105] & var72) == 0) {
										break label431;
									}
								}

								var101--;
							}

							label420: while (var102 < field1212) {
								for (int var106 = var103; var106 <= var104; var106++) {
									if ((field1210[var74][var102 + 1][var106] & var72) == 0) {
										break label420;
									}
								}

								var102++;
							}

							if ((var102 - var101 + 1) * (var104 + 1 - var103) >= 4) {
								int var107 = field1193[var74][var101][var103];
								UWQNYVPL.method512(var107, var101 * 128, var107, var104 * 128 + 128, var73, var102 * 128 + 128, var103 * 128, 4);

								for (int var108 = var101; var108 <= var102; var108++) {
									for (int var109 = var103; var109 <= var104; var109++) {
										field1210[var74][var108][var109] &= ~var72;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("SNGUFYDX.c(II)I")
	public static final int method462(int arg0, int arg1) {
		int var2 = method473(arg0 - 1, arg1 - 1) + method473(arg0 + 1, arg1 - 1) + method473(arg0 - 1, arg1 + 1) + method473(arg0 + 1, arg1 + 1);
		int var3 = method473(arg0 - 1, arg1) + method473(arg0 + 1, arg1) + method473(arg0, arg1 - 1) + method473(arg0, arg1 + 1);
		int var4 = method473(arg0, arg1);
		return var4 / 4 + var2 / 16 + var3 / 8;
	}

	@ObfuscatedName("SNGUFYDX.a(IIII[LMNHXSMWL;LUWQNYVPL;IIII[B)V")
	public final void method463(int arg0, int arg1, int arg2, MNHXSMWL[] arg3, UWQNYVPL arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		MUKVLYLC var11 = new MUKVLYLC(arg9);
		int var12 = -1;
		while (true) {
			int var13 = var11.method306();
			if (var13 == 0) {
				return;
			}

			var12 += var13;
			int var14 = 0;
			while (true) {
				int var15 = var11.method306();
				if (var15 == 0) {
					break;
				}

				var14 += var15 - 1;
				int var16 = var14 & 0x3F;
				int var17 = var14 >> 6 & 0x3F;
				int var18 = var14 >> 12;
				int var19 = var11.method292();
				int var20 = var19 >> 2;
				int var21 = var19 & 0x3;
				if (arg7 == var18 && var17 >= arg1 && var17 < arg1 + 8 && var16 >= arg8 && var16 < arg8 + 8) {
					PFIKHQJO var22 = PFIKHQJO.method405(var12);
					int var23 = arg5 + FCKTYQCQ.method203(var22.field966, var22.field995, arg2, var17 & 0x7, var16 & 0x7);
					int var24 = arg0 + FCKTYQCQ.method204(var16 & 0x7, arg2, var17 & 0x7, var22.field966, var22.field995);
					if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
						int var25 = var18;
						if ((field1196[1][var23][var24] & 0x2) == 2) {
							var25 = var18 - 1;
						}

						MNHXSMWL var26 = null;
						if (var25 >= 0) {
							var26 = arg3[var25];
						}

						method467(var18, var24, arg4, var26, arg2 + var21 & 0x3, var20, var23, var12);
					}
				}
			}
		}
	}

	@ObfuscatedName("SNGUFYDX.a(ILMUKVLYLC;LFRNMNGGN;)V")
	public static final void method464(MUKVLYLC arg0, FRNMNGGN arg1) {
		int var2 = -1;
		while (true) {
			int var3 = arg0.method306();
			if (var3 == 0) {
				return;
			}

			var2 += var3;
			PFIKHQJO var4 = PFIKHQJO.method405(var2);
			var4.method411(arg1);

			while (true) {
				int var5 = arg0.method306();
				if (var5 == 0) {
					break;
				}

				arg0.method292();
			}
		}
	}

	@ObfuscatedName("SNGUFYDX.a([BIIIIIZ[LMNHXSMWL;II)V")
	public final void method465(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, MNHXSMWL[] arg6, int arg7, int arg8) {
		for (int var10 = 0; var10 < 8; var10++) {
			for (int var11 = 0; var11 < 8; var11++) {
				if (arg1 + var10 > 0 && arg1 + var10 < 103 && arg7 + var11 > 0 && arg7 + var11 < 103) {
					arg6[arg2].field793[arg1 + var10][arg7 + var11] &= 0xFEFFFFFF;
				}
			}
		}

		MUKVLYLC var12 = new MUKVLYLC(arg0);
		for (int var13 = 0; var13 < 4; var13++) {
			for (int var14 = 0; var14 < 64; var14++) {
				for (int var15 = 0; var15 < 64; var15++) {
					if (arg5 == var13 && var14 >= arg4 && var14 < arg4 + 8 && var15 >= arg3 && var15 < arg3 + 8) {
						method474(arg1 + FCKTYQCQ.method201(var14 & 0x7, arg8, var15 & 0x7), arg2, arg7 + FCKTYQCQ.method202(arg8, var14 & 0x7, var15 & 0x7), var12, 0, arg8, 0);
					} else {
						method474(-1, 0, -1, var12, 0, 0, 0);
					}
				}
			}
		}
	}

	@ObfuscatedName("SNGUFYDX.d(II)I")
	public static final int method466(int arg0, int arg1) {
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

	@ObfuscatedName("SNGUFYDX.a(IIILUWQNYVPL;LMNHXSMWL;IIII)V")
	public final void method467(int arg0, int arg1, UWQNYVPL arg2, MNHXSMWL arg3, int arg4, int arg5, int arg6, int arg7) {
		if (field1206 && (field1196[0][arg6][arg1] & 0x2) == 0) {
			if ((field1196[arg0][arg6][arg1] & 0x10) != 0) {
				return;
			}

			if (method470(arg0, arg1, arg6) != field1197) {
				return;
			}
		}

		if (arg0 < field1211) {
			field1211 = arg0;
		}

		int var9 = field1193[arg0][arg6][arg1];
		int var10 = field1193[arg0][arg6 + 1][arg1];
		int var11 = field1193[arg0][arg6 + 1][arg1 + 1];
		int var12 = field1193[arg0][arg6][arg1 + 1];
		int var13 = var9 + var10 + var11 + var12 >> 2;
		PFIKHQJO var14 = PFIKHQJO.method405(arg7);
		int var15 = (arg7 << 14) + (arg1 << 7) + arg6 + 0x40000000;
		if (!var14.field983) {
			var15 += Integer.MIN_VALUE;
		}

		byte var16 = (byte) ((arg4 << 6) + arg5);
		if (arg5 == 22) {
			if (!field1206 || var14.field983 || var14.field972) {
				LDWABQSV var17;
				if (var14.field977 == -1 && var14.field965 == null) {
					var17 = var14.method406(22, arg4, var9, var10, var11, var12, -1);
				} else {
					var17 = new HZQUFYDK(var14.field977, var12, var10, 22, var11, arg4, true, var9, arg7);
				}

				arg2.method515(var15, var16, arg6, var17, var13, arg1, arg0);

				if (var14.field974 && var14.field983 && arg3 != null) {
					arg3.method271(arg1, arg6);
				}
			}
		} else if (arg5 == 10 || arg5 == 11) {
			LDWABQSV var18;
			if (var14.field977 == -1 && var14.field965 == null) {
				var18 = var14.method406(10, arg4, var9, var10, var11, var12, -1);
			} else {
				var18 = new HZQUFYDK(var14.field977, var12, var10, 10, var11, arg4, true, var9, arg7);
			}

			if (var18 != null) {
				int var19 = 0;
				if (arg5 == 11) {
					var19 += 256;
				}

				int var20;
				int var21;
				if (arg4 == 1 || arg4 == 3) {
					var20 = var14.field995;
					var21 = var14.field966;
				} else {
					var20 = var14.field966;
					var21 = var14.field995;
				}

				if (arg2.method519(arg1, var15, var19, var13, var20, var18, var21, var16, arg0, arg6) && var14.field988) {
					NJPATAFL var22;
					if (var18 instanceof NJPATAFL) {
						var22 = (NJPATAFL) var18;
					} else {
						var22 = var14.method406(10, arg4, var9, var10, var11, var12, -1);
					}

					if (var22 != null) {
						for (int var23 = 0; var23 <= var20; var23++) {
							for (int var24 = 0; var24 <= var21; var24++) {
								int var25 = var22.field866 / 4;
								if (var25 > 30) {
									var25 = 30;
								}

								if (var25 > field1192[arg0][arg6 + var23][arg1 + var24]) {
									field1192[arg0][arg6 + var23][arg1 + var24] = (byte) var25;
								}
							}
						}
					}
				}
			}

			if (var14.field974 && arg3 != null) {
				arg3.method270(var14.field966, arg1, var14.field1001, var14.field995, arg4, arg6);
			}
		} else if (arg5 >= 12) {
			LDWABQSV var26;
			if (var14.field977 == -1 && var14.field965 == null) {
				var26 = var14.method406(arg5, arg4, var9, var10, var11, var12, -1);
			} else {
				var26 = new HZQUFYDK(var14.field977, var12, var10, arg5, var11, arg4, true, var9, arg7);
			}

			arg2.method519(arg1, var15, 0, var13, 1, var26, 1, var16, arg0, arg6);

			if (arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0) {
				field1210[arg0][arg6][arg1] |= 0x924;
			}

			if (var14.field974 && arg3 != null) {
				arg3.method270(var14.field966, arg1, var14.field1001, var14.field995, arg4, arg6);
			}
		} else if (arg5 == 0) {
			LDWABQSV var27;
			if (var14.field977 == -1 && var14.field965 == null) {
				var27 = var14.method406(0, arg4, var9, var10, var11, var12, -1);
			} else {
				var27 = new HZQUFYDK(var14.field977, var12, var10, 0, var11, arg4, true, var9, arg7);
			}

			arg2.method517(arg1, var15, field1208[arg4], arg0, arg6, 0, var16, var27, var13, null);

			if (arg4 == 0) {
				if (var14.field988) {
					field1192[arg0][arg6][arg1] = 50;
					field1192[arg0][arg6][arg1 + 1] = 50;
				}

				if (var14.field992) {
					field1210[arg0][arg6][arg1] |= 0x249;
				}
			} else if (arg4 == 1) {
				if (var14.field988) {
					field1192[arg0][arg6][arg1 + 1] = 50;
					field1192[arg0][arg6 + 1][arg1 + 1] = 50;
				}

				if (var14.field992) {
					field1210[arg0][arg6][arg1 + 1] |= 0x492;
				}
			} else if (arg4 == 2) {
				if (var14.field988) {
					field1192[arg0][arg6 + 1][arg1] = 50;
					field1192[arg0][arg6 + 1][arg1 + 1] = 50;
				}

				if (var14.field992) {
					field1210[arg0][arg6 + 1][arg1] |= 0x249;
				}
			} else if (arg4 == 3) {
				if (var14.field988) {
					field1192[arg0][arg6][arg1] = 50;
					field1192[arg0][arg6 + 1][arg1] = 50;
				}

				if (var14.field992) {
					field1210[arg0][arg6][arg1] |= 0x492;
				}
			}

			if (var14.field974 && arg3 != null) {
				arg3.method269(arg1, arg5, arg4, arg6, var14.field1001);
			}

			if (var14.field976 != 16) {
				arg2.method525(var14.field976, arg6, arg1, arg0);
			}
		} else if (arg5 == 1) {
			LDWABQSV var28;
			if (var14.field977 == -1 && var14.field965 == null) {
				var28 = var14.method406(1, arg4, var9, var10, var11, var12, -1);
			} else {
				var28 = new HZQUFYDK(var14.field977, var12, var10, 1, var11, arg4, true, var9, arg7);
			}

			arg2.method517(arg1, var15, field1209[arg4], arg0, arg6, 0, var16, var28, var13, null);

			if (var14.field988) {
				if (arg4 == 0) {
					field1192[arg0][arg6][arg1 + 1] = 50;
				} else if (arg4 == 1) {
					field1192[arg0][arg6 + 1][arg1 + 1] = 50;
				} else if (arg4 == 2) {
					field1192[arg0][arg6 + 1][arg1] = 50;
				} else if (arg4 == 3) {
					field1192[arg0][arg6][arg1] = 50;
				}
			}

			if (var14.field974 && arg3 != null) {
				arg3.method269(arg1, arg5, arg4, arg6, var14.field1001);
			}
		} else if (arg5 == 2) {
			int var29 = arg4 + 1 & 0x3;
			LDWABQSV var30;
			LDWABQSV var31;
			if (var14.field977 == -1 && var14.field965 == null) {
				var30 = var14.method406(2, arg4 + 4, var9, var10, var11, var12, -1);
				var31 = var14.method406(2, var29, var9, var10, var11, var12, -1);
			} else {
				var30 = new HZQUFYDK(var14.field977, var12, var10, 2, var11, arg4 + 4, true, var9, arg7);
				var31 = new HZQUFYDK(var14.field977, var12, var10, 2, var11, var29, true, var9, arg7);
			}

			arg2.method517(arg1, var15, field1208[arg4], arg0, arg6, field1208[var29], var16, var30, var13, var31);

			if (var14.field992) {
				if (arg4 == 0) {
					field1210[arg0][arg6][arg1] |= 0x249;
					field1210[arg0][arg6][arg1 + 1] |= 0x492;
				} else if (arg4 == 1) {
					field1210[arg0][arg6][arg1 + 1] |= 0x492;
					field1210[arg0][arg6 + 1][arg1] |= 0x249;
				} else if (arg4 == 2) {
					field1210[arg0][arg6 + 1][arg1] |= 0x249;
					field1210[arg0][arg6][arg1] |= 0x492;
				} else if (arg4 == 3) {
					field1210[arg0][arg6][arg1] |= 0x492;
					field1210[arg0][arg6][arg1] |= 0x249;
				}
			}

			if (var14.field974 && arg3 != null) {
				arg3.method269(arg1, arg5, arg4, arg6, var14.field1001);
			}

			if (var14.field976 != 16) {
				arg2.method525(var14.field976, arg6, arg1, arg0);
			}
		} else if (arg5 == 3) {
			LDWABQSV var32;
			if (var14.field977 == -1 && var14.field965 == null) {
				var32 = var14.method406(3, arg4, var9, var10, var11, var12, -1);
			} else {
				var32 = new HZQUFYDK(var14.field977, var12, var10, 3, var11, arg4, true, var9, arg7);
			}

			arg2.method517(arg1, var15, field1209[arg4], arg0, arg6, 0, var16, var32, var13, null);

			if (var14.field988) {
				if (arg4 == 0) {
					field1192[arg0][arg6][arg1 + 1] = 50;
				} else if (arg4 == 1) {
					field1192[arg0][arg6 + 1][arg1 + 1] = 50;
				} else if (arg4 == 2) {
					field1192[arg0][arg6 + 1][arg1] = 50;
				} else if (arg4 == 3) {
					field1192[arg0][arg6][arg1] = 50;
				}
			}

			if (var14.field974 && arg3 != null) {
				arg3.method269(arg1, arg5, arg4, arg6, var14.field1001);
			}
		} else if (arg5 == 9) {
			LDWABQSV var33;
			if (var14.field977 == -1 && var14.field965 == null) {
				var33 = var14.method406(arg5, arg4, var9, var10, var11, var12, -1);
			} else {
				var33 = new HZQUFYDK(var14.field977, var12, var10, arg5, var11, arg4, true, var9, arg7);
			}

			arg2.method519(arg1, var15, 0, var13, 1, var33, 1, var16, arg0, arg6);

			if (var14.field974 && arg3 != null) {
				arg3.method270(var14.field966, arg1, var14.field1001, var14.field995, arg4, arg6);
			}
		} else {
			if (var14.field970) {
				if (arg4 == 1) {
					int var34 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var9;
					var9 = var34;
				} else if (arg4 == 2) {
					int var35 = var12;
					var12 = var10;
					var10 = var35;
					int var36 = var11;
					var11 = var9;
					var9 = var36;
				} else if (arg4 == 3) {
					int var37 = var12;
					var12 = var9;
					var9 = var10;
					var10 = var11;
					var11 = var37;
				}
			}

			if (arg5 == 4) {
				LDWABQSV var38;
				if (var14.field977 == -1 && var14.field965 == null) {
					var38 = var14.method406(4, 0, var9, var10, var11, var12, -1);
				} else {
					var38 = new HZQUFYDK(var14.field977, var12, var10, 4, var11, 0, true, var9, arg7);
				}

				arg2.method518(var38, arg4 * 512, field1208[arg4], var15, arg6, 0, arg1, 0, var13, arg0, var16);
			} else if (arg5 == 5) {
				int var39 = 16;
				int var40 = arg2.method535(arg0, arg6, arg1);
				if (var40 > 0) {
					var39 = PFIKHQJO.method405(var40 >> 14 & 0x7FFF).field976;
				}

				LDWABQSV var41;
				if (var14.field977 == -1 && var14.field965 == null) {
					var41 = var14.method406(4, 0, var9, var10, var11, var12, -1);
				} else {
					var41 = new HZQUFYDK(var14.field977, var12, var10, 4, var11, 0, true, var9, arg7);
				}

				arg2.method518(var41, arg4 * 512, field1208[arg4], var15, arg6, field1200[arg4] * var39, arg1, field1194[arg4] * var39, var13, arg0, var16);
			} else if (arg5 == 6) {
				LDWABQSV var42;
				if (var14.field977 == -1 && var14.field965 == null) {
					var42 = var14.method406(4, 0, var9, var10, var11, var12, -1);
				} else {
					var42 = new HZQUFYDK(var14.field977, var12, var10, 4, var11, 0, true, var9, arg7);
				}

				arg2.method518(var42, arg4, 256, var15, arg6, 0, arg1, 0, var13, arg0, var16);
			} else if (arg5 == 7) {
				LDWABQSV var43;
				if (var14.field977 == -1 && var14.field965 == null) {
					var43 = var14.method406(4, 0, var9, var10, var11, var12, -1);
				} else {
					var43 = new HZQUFYDK(var14.field977, var12, var10, 4, var11, 0, true, var9, arg7);
				}

				arg2.method518(var43, arg4, 512, var15, arg6, 0, arg1, 0, var13, arg0, var16);
			} else if (arg5 == 8) {
				LDWABQSV var44;
				if (var14.field977 == -1 && var14.field965 == null) {
					var44 = var14.method406(4, 0, var9, var10, var11, var12, -1);
				} else {
					var44 = new HZQUFYDK(var14.field977, var12, var10, 4, var11, 0, true, var9, arg7);
				}

				arg2.method518(var44, arg4, 768, var15, arg6, 0, arg1, 0, var13, arg0, var16);
			}
		}
	}

	@ObfuscatedName("SNGUFYDX.b(III)I")
	public static final int method468(int arg0, int arg1, int arg2) {
		int var3 = arg0 / arg2;
		int var4 = arg0 & arg2 - 1;
		int var5 = arg1 / arg2;
		int var6 = arg1 & arg2 - 1;
		int var7 = method462(var3, var5);
		int var8 = method462(var3 + 1, var5);
		int var9 = method462(var3, var5 + 1);
		int var10 = method462(var3 + 1, var5 + 1);
		int var11 = method472(var7, var8, var4, arg2);
		int var12 = method472(var9, var10, var4, arg2);
		return method472(var11, var12, var6, arg2);
	}

	@ObfuscatedName("SNGUFYDX.a(I[LMNHXSMWL;[BBILUWQNYVPL;)V")
	public final void method469(int arg0, MNHXSMWL[] arg1, byte[] arg2, int arg3, UWQNYVPL arg4) {
		MUKVLYLC var6 = new MUKVLYLC(arg2);
		int var7 = -1;
		while (true) {
			int var8 = var6.method306();
			if (var8 == 0) {
				return;
			}

			var7 += var8;
			int var9 = 0;
			while (true) {
				int var10 = var6.method306();
				if (var10 == 0) {
					break;
				}

				var9 += var10 - 1;
				int var11 = var9 & 0x3F;
				int var12 = var9 >> 6 & 0x3F;
				int var13 = var9 >> 12;
				int var14 = var6.method292();
				int var15 = var14 >> 2;
				int var16 = var14 & 0x3;
				int var17 = arg3 + var12;
				int var18 = arg0 + var11;
				if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
					int var19 = var13;
					if ((field1196[1][var17][var18] & 0x2) == 2) {
						var19 = var13 - 1;
					}

					MNHXSMWL var20 = null;
					if (var19 >= 0) {
						var20 = arg1[var19];
					}

					method467(var13, var18, arg4, var20, var16, var15, var17, var7);
				}
			}
		}
	}

	@ObfuscatedName("SNGUFYDX.a(IIIB)I")
	public int method470(int arg0, int arg1, int arg2) {
		if ((field1196[arg0][arg2][arg1] & 0x8) != 0) {
			return 0;
		}

		if (arg0 > 0 && (field1196[1][arg2][arg1] & 0x2) != 0) {
			return arg0 - 1;
		}

		return arg0;
	}

	@ObfuscatedName("SNGUFYDX.c(III)Z")
	public static final boolean method471(int arg0, int arg1) {
		PFIKHQJO var2 = PFIKHQJO.method405(arg0);

		if (arg1 == 11) {
			arg1 = 10;
		}

		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}

		return var2.method401(arg1);
	}

	@ObfuscatedName("SNGUFYDX.a(IIII)I")
	public static final int method472(int arg0, int arg1, int arg2, int arg3) {
		int var4 = 0x10000 - QVVCPQSC.field1095[arg2 * 1024 / arg3] >> 1;
		return ((0x10000 - var4) * arg0 >> 16) + (arg1 * var4 >> 16);
	}

	@ObfuscatedName("SNGUFYDX.e(II)I")
	public static final int method473(int arg0, int arg1) {
		int var2 = arg1 * 57 + arg0;
		var2 ^= var2 << 13;
		int var3 = (var2 * var2 * 15731 + 789221) * var2 + 1376312589 & Integer.MAX_VALUE;
		return var3 >> 19 & 0xFF;
	}

	@ObfuscatedName("SNGUFYDX.a(IIIILMUKVLYLC;III)V")
	public final void method474(int arg0, int arg1, int arg2, MUKVLYLC arg3, int arg4, int arg5, int arg6) {
		if (arg0 >= 0 && arg0 < 104 && arg2 >= 0 && arg2 < 104) {
			field1196[arg1][arg0][arg2] = 0;
			while (true) {
				int var8 = arg3.method292();
				if (var8 == 0) {
					break;
				}

				if (var8 == 1) {
					int var9 = arg3.method292();
					if (var9 == 1) {
						var9 = 0;
					}

					if (arg1 == 0) {
						field1193[0][arg0][arg2] = -var9 * 8;
						return;
					}

					field1193[arg1][arg0][arg2] = field1193[arg1 - 1][arg0][arg2] - var9 * 8;
					return;
				}

				if (var8 <= 49) {
					field1199[arg1][arg0][arg2] = arg3.method293();
					field1215[arg1][arg0][arg2] = (byte) ((var8 - 2) / 4);
					field1198[arg1][arg0][arg2] = (byte) (var8 + arg5 - 2 & 0x3);
				} else if (var8 <= 81) {
					field1196[arg1][arg0][arg2] = (byte) (var8 - 49);
				} else {
					field1191[arg1][arg0][arg2] = (byte) (var8 - 81);
				}
			}

			if (arg1 == 0) {
				field1193[0][arg0][arg2] = -method458(arg0 + arg4 + 932731, arg2 + 556238 + arg6) * 8;
			} else {
				field1193[arg1][arg0][arg2] = field1193[arg1 - 1][arg0][arg2] - 240;
			}
		} else {
			while (true) {
				int var10 = arg3.method292();
				if (var10 == 0) {
					return;
				}

				if (var10 == 1) {
					arg3.method292();
					return;
				}

				if (var10 <= 49) {
					arg3.method292();
				}
			}
		}
	}

	@ObfuscatedName("SNGUFYDX.a(LUWQNYVPL;[[[IIIIIILMNHXSMWL;III)V")
	public static final void method475(UWQNYVPL arg0, int[][][] arg1, int arg2, int arg3, int arg4, int arg5, MNHXSMWL arg6, int arg7, int arg8, int arg9) {
		int var10 = arg1[arg7][arg9][arg5];
		int var11 = arg1[arg7][arg9 + 1][arg5];
		int var12 = arg1[arg7][arg9 + 1][arg5 + 1];
		int var13 = arg1[arg7][arg9][arg5 + 1];
		int var14 = var10 + var11 + var12 + var13 >> 2;
		PFIKHQJO var15 = PFIKHQJO.method405(arg8);
		int var16 = (arg8 << 14) + (arg5 << 7) + arg9 + 0x40000000;
		if (!var15.field983) {
			var16 += Integer.MIN_VALUE;
		}

		byte var17 = (byte) ((arg3 << 6) + arg2);
		if (arg2 == 22) {
			LDWABQSV var18;
			if (var15.field977 == -1 && var15.field965 == null) {
				var18 = var15.method406(22, arg3, var10, var11, var12, var13, -1);
			} else {
				var18 = new HZQUFYDK(var15.field977, var13, var11, 22, var12, arg3, true, var10, arg8);
			}

			arg0.method515(var16, var17, arg9, var18, var14, arg5, arg4);

			if (var15.field974 && var15.field983) {
				arg6.method271(arg5, arg9);
			}
		} else if (arg2 == 10 || arg2 == 11) {
			LDWABQSV var19;
			if (var15.field977 == -1 && var15.field965 == null) {
				var19 = var15.method406(10, arg3, var10, var11, var12, var13, -1);
			} else {
				var19 = new HZQUFYDK(var15.field977, var13, var11, 10, var12, arg3, true, var10, arg8);
			}

			if (var19 != null) {
				int var20 = 0;
				if (arg2 == 11) {
					var20 += 256;
				}

				int var21;
				int var22;
				if (arg3 == 1 || arg3 == 3) {
					var21 = var15.field995;
					var22 = var15.field966;
				} else {
					var21 = var15.field966;
					var22 = var15.field995;
				}

				arg0.method519(arg5, var16, var20, var14, var21, var19, var22, var17, arg4, arg9);
			}

			if (var15.field974) {
				arg6.method270(var15.field966, arg5, var15.field1001, var15.field995, arg3, arg9);
			}
		} else if (arg2 >= 12) {
			LDWABQSV var23;
			if (var15.field977 == -1 && var15.field965 == null) {
				var23 = var15.method406(arg2, arg3, var10, var11, var12, var13, -1);
			} else {
				var23 = new HZQUFYDK(var15.field977, var13, var11, arg2, var12, arg3, true, var10, arg8);
			}

			arg0.method519(arg5, var16, 0, var14, 1, var23, 1, var17, arg4, arg9);

			if (var15.field974) {
				arg6.method270(var15.field966, arg5, var15.field1001, var15.field995, arg3, arg9);
			}
		} else if (arg2 == 0) {
			LDWABQSV var24;
			if (var15.field977 == -1 && var15.field965 == null) {
				var24 = var15.method406(0, arg3, var10, var11, var12, var13, -1);
			} else {
				var24 = new HZQUFYDK(var15.field977, var13, var11, 0, var12, arg3, true, var10, arg8);
			}

			arg0.method517(arg5, var16, field1208[arg3], arg4, arg9, 0, var17, var24, var14, null);

			if (var15.field974) {
				arg6.method269(arg5, arg2, arg3, arg9, var15.field1001);
			}
		} else if (arg2 == 1) {
			LDWABQSV var25;
			if (var15.field977 == -1 && var15.field965 == null) {
				var25 = var15.method406(1, arg3, var10, var11, var12, var13, -1);
			} else {
				var25 = new HZQUFYDK(var15.field977, var13, var11, 1, var12, arg3, true, var10, arg8);
			}

			arg0.method517(arg5, var16, field1209[arg3], arg4, arg9, 0, var17, var25, var14, null);

			if (var15.field974) {
				arg6.method269(arg5, arg2, arg3, arg9, var15.field1001);
			}
		} else if (arg2 == 2) {
			int var26 = arg3 + 1 & 0x3;
			LDWABQSV var27;
			LDWABQSV var28;
			if (var15.field977 == -1 && var15.field965 == null) {
				var27 = var15.method406(2, arg3 + 4, var10, var11, var12, var13, -1);
				var28 = var15.method406(2, var26, var10, var11, var12, var13, -1);
			} else {
				var27 = new HZQUFYDK(var15.field977, var13, var11, 2, var12, arg3 + 4, true, var10, arg8);
				var28 = new HZQUFYDK(var15.field977, var13, var11, 2, var12, var26, true, var10, arg8);
			}

			arg0.method517(arg5, var16, field1208[arg3], arg4, arg9, field1208[var26], var17, var27, var14, var28);

			if (var15.field974) {
				arg6.method269(arg5, arg2, arg3, arg9, var15.field1001);
			}
		} else if (arg2 == 3) {
			LDWABQSV var29;
			if (var15.field977 == -1 && var15.field965 == null) {
				var29 = var15.method406(3, arg3, var10, var11, var12, var13, -1);
			} else {
				var29 = new HZQUFYDK(var15.field977, var13, var11, 3, var12, arg3, true, var10, arg8);
			}

			arg0.method517(arg5, var16, field1209[arg3], arg4, arg9, 0, var17, var29, var14, null);

			if (var15.field974) {
				arg6.method269(arg5, arg2, arg3, arg9, var15.field1001);
			}
		} else if (arg2 == 9) {
			LDWABQSV var30;
			if (var15.field977 == -1 && var15.field965 == null) {
				var30 = var15.method406(arg2, arg3, var10, var11, var12, var13, -1);
			} else {
				var30 = new HZQUFYDK(var15.field977, var13, var11, arg2, var12, arg3, true, var10, arg8);
			}

			arg0.method519(arg5, var16, 0, var14, 1, var30, 1, var17, arg4, arg9);

			if (var15.field974) {
				arg6.method270(var15.field966, arg5, var15.field1001, var15.field995, arg3, arg9);
			}
		} else {
			if (var15.field970) {
				if (arg3 == 1) {
					int var31 = var13;
					var13 = var12;
					var12 = var11;
					var11 = var10;
					var10 = var31;
				} else if (arg3 == 2) {
					int var32 = var13;
					var13 = var11;
					var11 = var32;
					int var33 = var12;
					var12 = var10;
					var10 = var33;
				} else if (arg3 == 3) {
					int var34 = var13;
					var13 = var10;
					var10 = var11;
					var11 = var12;
					var12 = var34;
				}
			}

			if (arg2 == 4) {
				LDWABQSV var35;
				if (var15.field977 == -1 && var15.field965 == null) {
					var35 = var15.method406(4, 0, var10, var11, var12, var13, -1);
				} else {
					var35 = new HZQUFYDK(var15.field977, var13, var11, 4, var12, 0, true, var10, arg8);
				}

				arg0.method518(var35, arg3 * 512, field1208[arg3], var16, arg9, 0, arg5, 0, var14, arg4, var17);
			} else if (arg2 == 5) {
				int var36 = 16;
				int var37 = arg0.method535(arg4, arg9, arg5);
				if (var37 > 0) {
					var36 = PFIKHQJO.method405(var37 >> 14 & 0x7FFF).field976;
				}

				LDWABQSV var38;
				if (var15.field977 == -1 && var15.field965 == null) {
					var38 = var15.method406(4, 0, var10, var11, var12, var13, -1);
				} else {
					var38 = new HZQUFYDK(var15.field977, var13, var11, 4, var12, 0, true, var10, arg8);
				}

				arg0.method518(var38, arg3 * 512, field1208[arg3], var16, arg9, field1200[arg3] * var36, arg5, field1194[arg3] * var36, var14, arg4, var17);
			} else if (arg2 == 6) {
				LDWABQSV var39;
				if (var15.field977 == -1 && var15.field965 == null) {
					var39 = var15.method406(4, 0, var10, var11, var12, var13, -1);
				} else {
					var39 = new HZQUFYDK(var15.field977, var13, var11, 4, var12, 0, true, var10, arg8);
				}

				arg0.method518(var39, arg3, 256, var16, arg9, 0, arg5, 0, var14, arg4, var17);
			} else if (arg2 == 7) {
				LDWABQSV var40;
				if (var15.field977 == -1 && var15.field965 == null) {
					var40 = var15.method406(4, 0, var10, var11, var12, var13, -1);
				} else {
					var40 = new HZQUFYDK(var15.field977, var13, var11, 4, var12, 0, true, var10, arg8);
				}

				arg0.method518(var40, arg3, 512, var16, arg9, 0, arg5, 0, var14, arg4, var17);
			} else if (arg2 == 8) {
				LDWABQSV var41;
				if (var15.field977 == -1 && var15.field965 == null) {
					var41 = var15.method406(4, 0, var10, var11, var12, var13, -1);
				} else {
					var41 = new HZQUFYDK(var15.field977, var13, var11, 4, var12, 0, true, var10, arg8);
				}

				arg0.method518(var41, arg3, 768, var16, arg9, 0, arg5, 0, var14, arg4, var17);
			}
		}
	}
}
