package deob;

@ObfuscatedName("ZCOZUVWP")
public final class ZCOZUVWP {

	@ObfuscatedName("ZCOZUVWP.m")
	public static final String[] field1497 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("ZCOZUVWP.g")
	public static int[] field1491;

	@ObfuscatedName("ZCOZUVWP.l")
	public static int[] field1496;

	@ObfuscatedName("ZCOZUVWP.h")
	public static char[][] field1492;

	@ObfuscatedName("ZCOZUVWP.j")
	public static char[][] field1494;

	@ObfuscatedName("ZCOZUVWP.k")
	public static char[][] field1495;

	@ObfuscatedName("ZCOZUVWP.i")
	public static byte[][][] field1493;

	@ObfuscatedName("ZCOZUVWP.a(LRVLWVPJQ;)V")
	public static final void method557(RVLWVPJQ arg0) {
		UAWAYCTK var1 = new UAWAYCTK(arg0.method424("fragmentsenc.txt", null));
		UAWAYCTK var2 = new UAWAYCTK(arg0.method424("badenc.txt", null));
		UAWAYCTK var3 = new UAWAYCTK(arg0.method424("domainenc.txt", null));
		UAWAYCTK var4 = new UAWAYCTK(arg0.method424("tldlist.txt", null));
		method558(var1, var2, var3, var4);
	}

	@ObfuscatedName("ZCOZUVWP.a(LUAWAYCTK;LUAWAYCTK;LUAWAYCTK;LUAWAYCTK;)V")
	public static final void method558(UAWAYCTK arg0, UAWAYCTK arg1, UAWAYCTK arg2, UAWAYCTK arg3) {
		method560(arg1);
		method561(arg2);
		method562(arg0);
		method559(arg3);
	}

	@ObfuscatedName("ZCOZUVWP.a(LUAWAYCTK;I)V")
	public static final void method559(UAWAYCTK arg0) {
		int var1 = arg0.method460();
		field1495 = new char[var1][];
		field1496 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field1496[var2] = arg0.method455();
			char[] var3 = new char[arg0.method455()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method455();
			}

			field1495[var2] = var3;
		}
	}

	@ObfuscatedName("ZCOZUVWP.a(BLUAWAYCTK;)V")
	public static final void method560(UAWAYCTK arg0) {
		int var1 = arg0.method460();
		field1492 = new char[var1][];
		field1493 = new byte[var1][][];
		method563(arg0, field1492, field1493);
	}

	@ObfuscatedName("ZCOZUVWP.a(ILUAWAYCTK;)V")
	public static final void method561(UAWAYCTK arg0) {
		int var1 = arg0.method460();
		field1494 = new char[var1][];
		method564(arg0, field1494);
	}

	@ObfuscatedName("ZCOZUVWP.b(ILUAWAYCTK;)V")
	public static final void method562(UAWAYCTK arg0) {
		field1491 = new int[arg0.method460()];
		for (int var1 = 0; var1 < field1491.length; var1++) {
			field1491[var1] = arg0.method457();
		}
	}

	@ObfuscatedName("ZCOZUVWP.a(LUAWAYCTK;[[CI[[[B)V")
	public static final void method563(UAWAYCTK arg0, char[][] arg1, byte[][][] arg2) {
		for (int var3 = 0; var3 < arg1.length; var3++) {
			char[] var4 = new char[arg0.method455()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.method455();
			}

			arg1[var3] = var4;
			byte[][] var6 = new byte[arg0.method455()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg0.method455();
				var6[var7][1] = (byte) arg0.method455();
			}

			if (var6.length > 0) {
				arg2[var3] = var6;
			}
		}
	}

	@ObfuscatedName("ZCOZUVWP.a(LUAWAYCTK;Z[[C)V")
	public static final void method564(UAWAYCTK arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method455()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method455();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("ZCOZUVWP.a([CI)V")
	public static final void method565(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method566(arg0[var2])) {
				arg0[var1] = arg0[var2];
			} else {
				arg0[var1] = ' ';
			}

			if (var1 == 0 || arg0[var1] != ' ' || arg0[var1 - 1] != ' ') {
				var1++;
			}
		}

		for (int var3 = var1; var3 < arg0.length; var3++) {
			arg0[var3] = ' ';
		}
	}

	@ObfuscatedName("ZCOZUVWP.a(CZ)Z")
	public static final boolean method566(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("ZCOZUVWP.a(ILjava/lang/String;)Ljava/lang/String;")
	public static final String method567(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method565(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method575(var5);
		method570(var5);
		method571(var5);
		method584(var5);

		for (int var7 = 0; var7 < field1497.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field1497[var7], var8 + 1)) != -1) {
				char[] var9 = field1497[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method568(var4.toCharArray(), var5);
		method569(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("ZCOZUVWP.a([CI[C)V")
	public static final void method568(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg1[var2] != '*' && method592(arg0[var2])) {
				arg1[var2] = arg0[var2];
			}
		}
	}

	@ObfuscatedName("ZCOZUVWP.a(B[C)V")
	public static final void method569(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method589(var3)) {
				var1 = true;
			} else if (var1) {
				if (method591(var3)) {
					var1 = false;
				}
			} else if (method592(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("ZCOZUVWP.b(B[C)V")
	public static final void method570(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field1492.length - 1; var2 >= 0; var2--) {
				method579(field1492[var2], arg0, field1493[var2]);
			}
		}
	}

	@ObfuscatedName("ZCOZUVWP.b([CI)V")
	public static final void method571(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method579(var2, var1, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method579(var4, var3, null);

		for (int var5 = field1494.length - 1; var5 >= 0; var5--) {
			method572(field1494[var5], arg0, var1, var3);
		}
	}

	@ObfuscatedName("ZCOZUVWP.a([CZ[C[C[C)V")
	public static final void method572(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg0.length <= arg1.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg1.length - arg0.length; var5 += var8) {
				int var6 = var5;
				int var7 = 0;
				var8 = 1;
				while (var6 < arg1.length) {
					int var12;
					boolean var9 = false;
					char var10 = arg1[var6];
					char var11 = 0;
					if (var6 + 1 < arg1.length) {
						var11 = arg1[var6 + 1];
					}

					if (var7 < arg0.length && (var12 = method581(arg0[var7], var10, var11)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method581(arg0[var7 - 1], var10, var11)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg0.length || !method587(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg0.length) {
					boolean var14 = false;
					int var15 = method573(var5, arg2, arg1);
					int var16 = method574(arg1, var6 - 1, arg3);
					if (var15 > 2 || var16 > 2) {
						var14 = true;
					}

					if (var14) {
						for (int var17 = var5; var17 < var6; var17++) {
							arg1[var17] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ZCOZUVWP.a(BI[C[C)I")
	public static final int method573(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		for (int var3 = arg0 - 1; var3 >= 0 && method587(arg2[var3]); var3--) {
			if (arg2[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method587(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method587(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ZCOZUVWP.a([CI[CI)I")
	public static final int method574(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg0.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg0.length && method587(arg0[var3])) {
			if (arg0[var3] != '.' && arg0[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg0.length && method587(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method587(arg0[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ZCOZUVWP.a(I[C)V")
	public static final void method575(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method579(var2, var1, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method579(var4, var3, null);

		for (int var5 = 0; var5 < field1495.length; var5++) {
			method576(var3, var1, field1495[var5], arg0, field1496[var5]);
		}
	}

	@ObfuscatedName("ZCOZUVWP.a([CI[C[C[CI)V")
	public static final void method576(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
		if (arg2.length <= arg3.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg3.length - arg2.length; var6 += var9) {
				int var7 = var6;
				int var8 = 0;
				var9 = 1;
				while (var7 < arg3.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg3[var7];
					char var12 = 0;
					if (var7 + 1 < arg3.length) {
						var12 = arg3[var7 + 1];
					}

					if (var8 < arg2.length && (var13 = method581(arg2[var8], var11, var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method581(arg2[var8 - 1], var11, var12)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg2.length || !method587(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg2.length) {
					boolean var15 = false;
					int var16 = method577(var6, arg1, arg3);
					int var17 = method578(var7 - 1, arg0, arg3);
					if (arg4 == 1 && var16 > 0 && var17 > 0) {
						var15 = true;
					}

					if (arg4 == 2 && (var16 > 2 && var17 > 0 || var16 > 0 && var17 > 2)) {
						var15 = true;
					}

					if (arg4 == 3 && var16 > 0 && var17 > 2) {
						var15 = true;
					}

					if (var15) {
						int var18 = var6;
						int var19 = var7 - 1;

						if (var16 > 2) {
							if (var16 == 4) {
								boolean var20 = false;
								for (int var21 = var6 - 1; var21 >= 0; var21--) {
									if (var20) {
										if (arg1[var21] != '*') {
											break;
										}

										var18 = var21;
									} else if (arg1[var21] == '*') {
										var18 = var21;
										var20 = true;
									}
								}
							}

							boolean var22 = false;
							for (int var23 = var18 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (method587(arg3[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method587(arg3[var23])) {
									var22 = true;
									var18 = var23;
								}
							}
						}

						if (var17 > 2) {
							if (var17 == 4) {
								boolean var24 = false;
								for (int var25 = var19 + 1; var25 < arg3.length; var25++) {
									if (var24) {
										if (arg0[var25] != '*') {
											break;
										}

										var19 = var25;
									} else if (arg0[var25] == '*') {
										var19 = var25;
										var24 = true;
									}
								}
							}

							boolean var26 = false;
							for (int var27 = var19 + 1; var27 < arg3.length; var27++) {
								if (var26) {
									if (method587(arg3[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method587(arg3[var27])) {
									var26 = true;
									var19 = var27;
								}
							}
						}

						for (int var28 = var18; var28 <= var19; var28++) {
							arg3[var28] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ZCOZUVWP.a(I[CI[C)I")
	public static final int method577(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		int var3 = arg0 - 1;
		while (var3 >= 0 && method587(arg2[var3])) {
			if (arg2[var3] != ',' && arg2[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method587(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method587(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ZCOZUVWP.a(II[C[C)I")
	public static final int method578(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg2.length && method587(arg2[var3])) {
			if (arg2[var3] != '\\' && arg2[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg2.length && method587(arg1[var5]); var5++) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method587(arg2[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ZCOZUVWP.a([C[C[[BZ)V")
	public static final void method579(char[] arg0, char[] arg1, byte[][] arg2) {
		if (arg0.length <= arg1.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg1.length - arg0.length; var4 += var8) {
				int var5 = var4;
				int var6 = 0;
				int var7 = 0;
				var8 = 1;
				boolean var9 = false;
				boolean var10 = false;
				boolean var11 = false;
				while (var5 < arg1.length && (!var10 || !var11)) {
					char var13;
					char var14;
					int var15;
					boolean var12 = false;
					var13 = arg1[var5];
					var14 = 0;
					if (var5 + 1 < arg1.length) {
						var14 = arg1[var5 + 1];
					}

					if (var6 < arg0.length && (var15 = method582(arg0[var6], var13, var14)) > 0) {
						if (var15 == 1 && method590(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method590(var13) || method590(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method582(arg0[var6 - 1], var13, var14)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg0.length || !method588(var13)) {
								break;
							}

							if (method587(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method590(var13)) {
								var11 = true;
							}

							var5++;
							var7++;
							if (var7 * 100 / (var5 - var4) > 90) {
								break;
							}
						}
					}
				}

				if (var6 >= arg0.length && (!var10 || !var11)) {
					boolean var17 = true;
					if (var9) {
						boolean var22 = false;
						boolean var23 = false;

						if (var4 - 1 < 0 || method587(arg1[var4 - 1]) && arg1[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg1.length || method587(arg1[var5]) && arg1[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method587(arg1[var25]) || arg1[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg1.length && (!method587(arg1[var25 + var27]) || arg1[var25 + var27] == '\''); var27++) {
										var26[var27] = arg1[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method587(arg1[var25 - 1]) || arg1[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method593(var26)) {
										var24 = true;
									}
								}

								var25++;
							}

							if (!var24) {
								var17 = false;
							}
						}
					} else {
						char var18 = ' ';
						if (var4 - 1 >= 0) {
							var18 = arg1[var4 - 1];
						}

						char var19 = ' ';
						if (var5 < arg1.length) {
							var19 = arg1[var5];
						}

						byte var20 = method583(var18);
						byte var21 = method583(var19);
						if (arg2 != null && method580(var20, arg2, var21)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method590(arg1[var32])) {
								var29++;
							} else if (method589(arg1[var32])) {
								var30++;
								var31 = var32;
							}
						}

						if (var31 > -1) {
							var29 -= var5 - var31 - 1;
						}

						if (var29 <= var30) {
							for (int var33 = var4; var33 < var5; var33++) {
								arg1[var33] = '*';
							}
						} else {
							var8 = 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("ZCOZUVWP.a(BB[[BB)Z")
	public static final boolean method580(byte arg0, byte[][] arg1, byte arg2) {
		int var3 = 0;
		if (arg1[var3][0] == arg0 && arg1[var3][1] == arg2) {
			return true;
		}

		int var4 = arg1.length - 1;
		if (arg1[var4][0] == arg0 && arg1[var4][1] == arg2) {
			return true;
		}

		do {
			int var5 = (var3 + var4) / 2;
			if (arg1[var5][0] == arg0 && arg1[var5][1] == arg2) {
				return true;
			}

			if (arg0 < arg1[var5][0] || arg1[var5][0] == arg0 && arg2 < arg1[var5][1]) {
				var4 = var5;
			} else {
				var3 = var5;
			}
		} while (var3 != var4 && var3 + 1 != var4);

		return false;
	}

	@ObfuscatedName("ZCOZUVWP.a(CCZC)I")
	public static final int method581(char arg0, char arg1, char arg2) {
		if (arg0 == arg1) {
			return 1;
		}

		if (arg0 == 'o' && arg1 == '0') {
			return 1;
		}

		if (arg0 == 'o' && arg1 == '(' && arg2 == ')') {
			return 2;
		}

		if (arg0 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
			return 1;
		}

		if (arg0 == 'e' && arg1 == '€') {
			return 1;
		}

		if (arg0 == 's' && arg1 == '$') {
			return 1;
		}

		if (arg0 == 'l' && arg1 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ZCOZUVWP.a(ICCC)I")
	public static final int method582(char arg0, char arg1, char arg2) {
		if (arg0 == arg1) {
			return 1;
		}

		if (arg0 >= 'a' && arg0 <= 'm') {
			if (arg0 == 'a') {
				if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
					if (arg1 == '/' && arg2 == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg0 == 'b') {
				if (arg1 != '6' && arg1 != '8') {
					if ((arg1 != '1' || arg2 != '3') && (arg1 != 'i' || arg2 != '3')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg0 == 'c') {
				if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 'd') {
				if ((arg1 != '[' || arg2 != ')') && (arg1 != 'i' || arg2 != ')')) {
					return 0;
				}

				return 2;
			}

			if (arg0 == 'e') {
				if (arg1 != '3' && arg1 != '€') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 'f') {
				if (arg1 == 'p' && arg2 == 'h') {
					return 2;
				}

				if (arg1 == '£') {
					return 1;
				}

				return 0;
			}

			if (arg0 == 'g') {
				if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 'h') {
				if (arg1 == '#') {
					return 1;
				}

				return 0;
			}

			if (arg0 == 'i') {
				if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 'j') {
				return 0;
			}

			if (arg0 == 'k') {
				return 0;
			}

			if (arg0 == 'l') {
				if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 'm') {
				return 0;
			}
		}

		if (arg0 >= 'n' && arg0 <= 'z') {
			if (arg0 == 'n') {
				return 0;
			}

			if (arg0 == 'o') {
				if (arg1 != '0' && arg1 != '*') {
					if ((arg1 != '(' || arg2 != ')') && (arg1 != '[' || arg2 != ']') && (arg1 != '{' || arg2 != '}') && (arg1 != '<' || arg2 != '>')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg0 == 'p') {
				return 0;
			}

			if (arg0 == 'q') {
				return 0;
			}

			if (arg0 == 'r') {
				return 0;
			}

			if (arg0 == 's') {
				if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 't') {
				if (arg1 != '7' && arg1 != '+') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 'u') {
				if (arg1 == 'v') {
					return 1;
				}

				if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg0 == 'v') {
				if ((arg1 != '\\' || arg2 != '/') && (arg1 != '\\' || arg2 != '|') && (arg1 != '|' || arg2 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg0 == 'w') {
				if (arg1 == 'v' && arg2 == 'v') {
					return 2;
				}

				return 0;
			}

			if (arg0 == 'x') {
				if ((arg1 != ')' || arg2 != '(') && (arg1 != '}' || arg2 != '{') && (arg1 != ']' || arg2 != '[') && (arg1 != '>' || arg2 != '<')) {
					return 0;
				}

				return 2;
			}

			if (arg0 == 'y') {
				return 0;
			}

			if (arg0 == 'z') {
				return 0;
			}
		}

		if (arg0 >= '0' && arg0 <= '9') {
			if (arg0 != '0') {
				if (arg0 == '1') {
					if (arg1 == 'l') {
						return 1;
					}

					return 0;
				}

				return 0;
			}

			if (arg1 != 'o' && arg1 != 'O') {
				if ((arg1 != '(' || arg2 != ')') && (arg1 != '{' || arg2 != '}') && (arg1 != '[' || arg2 != ']')) {
					return 0;
				}

				return 2;
			}

			return 1;
		}

		if (arg0 == ',') {
			if (arg1 == '.') {
				return 1;
			}

			return 0;
		}

		if (arg0 == '.') {
			if (arg1 == ',') {
				return 1;
			}

			return 0;
		}

		if (arg0 == '!') {
			if (arg1 == 'i') {
				return 1;
			}

			return 0;
		}

		return 0;
	}

	@ObfuscatedName("ZCOZUVWP.a(IC)B")
	public static final byte method583(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return (byte) (arg0 + 1 - 'a');
		}

		if (arg0 == '\'') {
			return 28;
		}

		if (arg0 >= '0' && arg0 <= '9') {
			return (byte) (arg0 + 29 - '0');
		}

		return 27;
	}

	@ObfuscatedName("ZCOZUVWP.c([CI)V")
	public static final void method584(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method585(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method587(arg0[var6]) && !method588(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method586(var7, arg0);
				int var8 = 0;
				for (int var9 = var7; var9 < var2; var9++) {
					var8 = var8 * 10 + arg0[var9] - 48;
				}

				if (var8 <= 255 && var2 - var7 <= 8) {
					var3++;
				} else {
					var3 = 0;
				}
			} while (var3 != 4);

			for (int var10 = var4; var10 < var2; var10++) {
				arg0[var10] = '*';
			}

			var3 = 0;
		}
	}

	@ObfuscatedName("ZCOZUVWP.a(B[CI)I")
	public static final int method585(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("ZCOZUVWP.a(I[CI)I")
	public static final int method586(int arg0, char[] arg1) {
		int var2 = arg0;
		while (var2 < arg1.length && var2 >= 0) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				var2++;
				continue;
			}

			return var2;
		}

		return arg1.length;
	}

	@ObfuscatedName("ZCOZUVWP.a(BC)Z")
	public static final boolean method587(char arg0) {
		if (!method589(arg0) && !method590(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ZCOZUVWP.b(CZ)Z")
	public static final boolean method588(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("ZCOZUVWP.b(IC)Z")
	public static final boolean method589(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ZCOZUVWP.c(CZ)Z")
	public static final boolean method590(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ZCOZUVWP.c(IC)Z")
	public static final boolean method591(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ZCOZUVWP.d(IC)Z")
	public static final boolean method592(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ZCOZUVWP.c(B[C)Z")
	public static final boolean method593(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method590(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method594(arg0);
		int var4 = 0;
		int var5 = field1491.length - 1;
		if (field1491[var4] != var3 && field1491[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field1491[var6] == var3) {
					return true;
				}

				if (var3 < field1491[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("ZCOZUVWP.a([CZ)I")
	public static final int method594(char[] arg0) {
		if (arg0.length > 6) {
			return 0;
		}

		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[arg0.length - var2 - 1];
			if (var3 >= 'a' && var3 <= 'z') {
				var1 = var1 * 38 + var3 + 1 - 'a';
			} else if (var3 == '\'') {
				var1 = var1 * 38 + 27;
			} else if (var3 >= '0' && var3 <= '9') {
				var1 = var1 * 38 + var3 + 28 - '0';
			} else if (var3 != 0) {
				return 0;
			}
		}

		return var1;
	}
}
