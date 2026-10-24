package deob;

@ObfuscatedName("DYUQECMZ")
public final class DYUQECMZ {

	@ObfuscatedName("DYUQECMZ.w")
	public static final String[] field691 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("DYUQECMZ.q")
	public static int[] field685;

	@ObfuscatedName("DYUQECMZ.v")
	public static int[] field690;

	@ObfuscatedName("DYUQECMZ.r")
	public static char[][] field686;

	@ObfuscatedName("DYUQECMZ.t")
	public static char[][] field688;

	@ObfuscatedName("DYUQECMZ.u")
	public static char[][] field689;

	@ObfuscatedName("DYUQECMZ.s")
	public static byte[][][] field687;

	@ObfuscatedName("DYUQECMZ.a(LSRZUEVOD;)V")
	public static final void method244(SRZUEVOD arg0) {
		LZWRHABP var1 = new LZWRHABP(arg0.method566("fragmentsenc.txt", null));
		LZWRHABP var2 = new LZWRHABP(arg0.method566("badenc.txt", null));
		LZWRHABP var3 = new LZWRHABP(arg0.method566("domainenc.txt", null));
		LZWRHABP var4 = new LZWRHABP(arg0.method566("tldlist.txt", null));
		method245(var1, var2, var3, var4);
	}

	@ObfuscatedName("DYUQECMZ.a(LLZWRHABP;LLZWRHABP;LLZWRHABP;LLZWRHABP;)V")
	public static final void method245(LZWRHABP arg0, LZWRHABP arg1, LZWRHABP arg2, LZWRHABP arg3) {
		method247(arg1);
		method248(arg2);
		method249(arg0);
		method246(arg3);
	}

	@ObfuscatedName("DYUQECMZ.a(ILLZWRHABP;)V")
	public static final void method246(LZWRHABP arg0) {
		int var1 = arg0.method468();
		field689 = new char[var1][];
		field690 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field690[var2] = arg0.method463();
			char[] var3 = new char[arg0.method463()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method463();
			}

			field689[var2] = var3;
		}
	}

	@ObfuscatedName("DYUQECMZ.a(LLZWRHABP;I)V")
	public static final void method247(LZWRHABP arg0) {
		int var1 = arg0.method468();
		field686 = new char[var1][];
		field687 = new byte[var1][][];
		method250(arg0, field687, field686);
	}

	@ObfuscatedName("DYUQECMZ.b(ILLZWRHABP;)V")
	public static final void method248(LZWRHABP arg0) {
		int var1 = arg0.method468();
		field688 = new char[var1][];
		method251(arg0, field688);
	}

	@ObfuscatedName("DYUQECMZ.a(ZLLZWRHABP;)V")
	public static final void method249(LZWRHABP arg0) {
		field685 = new int[arg0.method468()];
		for (int var1 = 0; var1 < field685.length; var1++) {
			field685[var1] = arg0.method465();
		}
	}

	@ObfuscatedName("DYUQECMZ.a(BLLZWRHABP;[[[B[[C)V")
	public static final void method250(LZWRHABP arg0, byte[][][] arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var4 = new char[arg0.method463()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.method463();
			}

			arg2[var3] = var4;
			byte[][] var6 = new byte[arg0.method463()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg0.method463();
				var6[var7][1] = (byte) arg0.method463();
			}

			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("DYUQECMZ.a(LLZWRHABP;Z[[C)V")
	public static final void method251(LZWRHABP arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method463()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method463();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("DYUQECMZ.a([CI)V")
	public static final void method252(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method253(arg0[var2])) {
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

	@ObfuscatedName("DYUQECMZ.a(CB)Z")
	public static final boolean method253(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("DYUQECMZ.a(Ljava/lang/String;Z)Ljava/lang/String;")
	public static final String method254(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method252(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method262(var5);
		method257(var5);
		method258(var5);
		method271(var5);

		for (int var7 = 0; var7 < field691.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field691[var7], var8 + 1)) != -1) {
				char[] var9 = field691[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method255(var5, var4.toCharArray());
		method256(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("DYUQECMZ.a([CI[C)V")
	public static final void method255(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method279(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("DYUQECMZ.a(Z[C)V")
	public static final void method256(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method276(var3)) {
				var1 = true;
			} else if (var1) {
				if (method278(var3)) {
					var1 = false;
				}
			} else if (method279(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("DYUQECMZ.b([CI)V")
	public static final void method257(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field686.length - 1; var2 >= 0; var2--) {
				method266(arg0, field687[var2], field686[var2]);
			}
		}
	}

	@ObfuscatedName("DYUQECMZ.b(Z[C)V")
	public static final void method258(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method266(var1, null, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method266(var3, null, var4);

		for (int var5 = field688.length - 1; var5 >= 0; var5--) {
			method259(var1, arg0, var3, field688[var5]);
		}
	}

	@ObfuscatedName("DYUQECMZ.a([C[C[C[CB)V")
	public static final void method259(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg3.length <= arg1.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg1.length - arg3.length; var5 += var8) {
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

					if (var7 < arg3.length && (var12 = method268(var10, arg3[var7], var11)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method268(var10, arg3[var7 - 1], var11)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg3.length || !method274(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg3.length) {
					boolean var14 = false;
					int var15 = method260(arg0, arg1, var5);
					int var16 = method261(var6 - 1, arg1, arg2);
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

	@ObfuscatedName("DYUQECMZ.a(I[C[CI)I")
	public static final int method260(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}

		for (int var3 = arg2 - 1; var3 >= 0 && method274(arg1[var3]); var3--) {
			if (arg1[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg2 - 1; var5 >= 0 && method274(arg0[var5]); var5--) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method274(arg1[arg2 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("DYUQECMZ.a(II[C[C)I")
	public static final int method261(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg1.length && method274(arg1[var3])) {
			if (arg1[var3] != '.' && arg1[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg1.length && method274(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method274(arg1[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("DYUQECMZ.a(I[C)V")
	public static final void method262(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method266(var1, null, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method266(var3, null, var4);

		for (int var5 = 0; var5 < field689.length; var5++) {
			method263(field689[var5], var1, arg0, var3, field690[var5]);
		}
	}

	@ObfuscatedName("DYUQECMZ.a([C[CB[C[CI)V")
	public static final void method263(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
		if (arg0.length <= arg2.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg2.length - arg0.length; var6 += var9) {
				int var7 = var6;
				int var8 = 0;
				var9 = 1;
				while (var7 < arg2.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg2[var7];
					char var12 = 0;
					if (var7 + 1 < arg2.length) {
						var12 = arg2[var7 + 1];
					}

					if (var8 < arg0.length && (var13 = method268(var11, arg0[var8], var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method268(var11, arg0[var8 - 1], var12)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg0.length || !method274(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg0.length) {
					boolean var15 = false;
					int var16 = method264(var6, arg1, arg2);
					int var17 = method265(var7 - 1, arg2, arg3);
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
									if (method274(arg2[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method274(arg2[var23])) {
									var22 = true;
									var18 = var23;
								}
							}
						}

						if (var17 > 2) {
							if (var17 == 4) {
								boolean var24 = false;
								for (int var25 = var19 + 1; var25 < arg2.length; var25++) {
									if (var24) {
										if (arg3[var25] != '*') {
											break;
										}

										var19 = var25;
									} else if (arg3[var25] == '*') {
										var19 = var25;
										var24 = true;
									}
								}
							}

							boolean var26 = false;
							for (int var27 = var19 + 1; var27 < arg2.length; var27++) {
								if (var26) {
									if (method274(arg2[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method274(arg2[var27])) {
									var26 = true;
									var19 = var27;
								}
							}
						}

						for (int var28 = var18; var28 <= var19; var28++) {
							arg2[var28] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("DYUQECMZ.b(II[C[C)I")
	public static final int method264(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		int var3 = arg0 - 1;
		while (var3 >= 0 && method274(arg2[var3])) {
			if (arg2[var3] != ',' && arg2[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method274(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method274(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("DYUQECMZ.a(I[CI[C)I")
	public static final int method265(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg1.length && method274(arg1[var3])) {
			if (arg1[var3] != '\\' && arg1[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg1.length && method274(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method274(arg1[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("DYUQECMZ.a([CZ[[B[C)V")
	public static final void method266(char[] arg0, byte[][] arg1, char[] arg2) {
		if (arg2.length <= arg0.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg0.length - arg2.length; var4 += var8) {
				int var5 = var4;
				int var6 = 0;
				int var7 = 0;
				var8 = 1;
				boolean var9 = false;
				boolean var10 = false;
				boolean var11 = false;
				while (var5 < arg0.length && (!var10 || !var11)) {
					char var13;
					char var14;
					int var15;
					boolean var12 = false;
					var13 = arg0[var5];
					var14 = 0;
					if (var5 + 1 < arg0.length) {
						var14 = arg0[var5 + 1];
					}

					if (var6 < arg2.length && (var15 = method269(arg2[var6], var14, var13)) > 0) {
						if (var15 == 1 && method277(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method277(var13) || method277(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method269(arg2[var6 - 1], var14, var13)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg2.length || !method275(var13)) {
								break;
							}

							if (method274(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method277(var13)) {
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

				if (var6 >= arg2.length && (!var10 || !var11)) {
					boolean var17 = true;
					if (var9) {
						boolean var22 = false;
						boolean var23 = false;

						if (var4 - 1 < 0 || method274(arg0[var4 - 1]) && arg0[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg0.length || method274(arg0[var5]) && arg0[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method274(arg0[var25]) || arg0[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg0.length && (!method274(arg0[var25 + var27]) || arg0[var25 + var27] == '\''); var27++) {
										var26[var27] = arg0[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method274(arg0[var25 - 1]) || arg0[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method280(var26)) {
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
							var18 = arg0[var4 - 1];
						}

						char var19 = ' ';
						if (var5 < arg0.length) {
							var19 = arg0[var5];
						}

						byte var20 = method270(var18);
						byte var21 = method270(var19);
						if (arg1 != null && method267(var21, arg1, var20)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method277(arg0[var32])) {
								var29++;
							} else if (method276(arg0[var32])) {
								var30++;
								var31 = var32;
							}
						}

						if (var31 > -1) {
							var29 -= var5 - var31 - 1;
						}

						if (var29 <= var30) {
							for (int var33 = var4; var33 < var5; var33++) {
								arg0[var33] = '*';
							}
						} else {
							var8 = 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("DYUQECMZ.a(B[[BBI)Z")
	public static final boolean method267(byte arg0, byte[][] arg1, byte arg2) {
		int var3 = 0;
		if (arg1[var3][0] == arg2 && arg1[var3][1] == arg0) {
			return true;
		}

		int var4 = arg1.length - 1;
		if (arg1[var4][0] == arg2 && arg1[var4][1] == arg0) {
			return true;
		}

		do {
			int var5 = (var3 + var4) / 2;
			if (arg1[var5][0] == arg2 && arg1[var5][1] == arg0) {
				return true;
			}

			if (arg2 < arg1[var5][0] || arg1[var5][0] == arg2 && arg0 < arg1[var5][1]) {
				var4 = var5;
			} else {
				var3 = var5;
			}
		} while (var3 != var4 && var3 + 1 != var4);

		return false;
	}

	@ObfuscatedName("DYUQECMZ.a(CICC)I")
	public static final int method268(char arg0, char arg1, char arg2) {
		if (arg0 == arg1) {
			return 1;
		}

		if (arg1 == 'o' && arg0 == '0') {
			return 1;
		}

		if (arg1 == 'o' && arg0 == '(' && arg2 == ')') {
			return 2;
		}

		if (arg1 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
			return 1;
		}

		if (arg1 == 'e' && arg0 == '€') {
			return 1;
		}

		if (arg1 == 's' && arg0 == '$') {
			return 1;
		}

		if (arg1 == 'l' && arg0 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("DYUQECMZ.a(BCCC)I")
	public static final int method269(char arg0, char arg1, char arg2) {
		if (arg0 == arg2) {
			return 1;
		}

		if (arg0 >= 'a' && arg0 <= 'm') {
			if (arg0 == 'a') {
				if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
					if (arg2 == '/' && arg1 == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg0 == 'b') {
				if (arg2 != '6' && arg2 != '8') {
					if ((arg2 != '1' || arg1 != '3') && (arg2 != 'i' || arg1 != '3')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg0 == 'c') {
				if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 'd') {
				if ((arg2 != '[' || arg1 != ')') && (arg2 != 'i' || arg1 != ')')) {
					return 0;
				}

				return 2;
			}

			if (arg0 == 'e') {
				if (arg2 != '3' && arg2 != '€') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 'f') {
				if (arg2 == 'p' && arg1 == 'h') {
					return 2;
				}

				if (arg2 == '£') {
					return 1;
				}

				return 0;
			}

			if (arg0 == 'g') {
				if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 'h') {
				if (arg2 == '#') {
					return 1;
				}

				return 0;
			}

			if (arg0 == 'i') {
				if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
				if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
				if (arg2 != '0' && arg2 != '*') {
					if ((arg2 != '(' || arg1 != ')') && (arg2 != '[' || arg1 != ']') && (arg2 != '{' || arg1 != '}') && (arg2 != '<' || arg1 != '>')) {
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
				if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 't') {
				if (arg2 != '7' && arg2 != '+') {
					return 0;
				}

				return 1;
			}

			if (arg0 == 'u') {
				if (arg2 == 'v') {
					return 1;
				}

				if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg0 == 'v') {
				if ((arg2 != '\\' || arg1 != '/') && (arg2 != '\\' || arg1 != '|') && (arg2 != '|' || arg1 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg0 == 'w') {
				if (arg2 == 'v' && arg1 == 'v') {
					return 2;
				}

				return 0;
			}

			if (arg0 == 'x') {
				if ((arg2 != ')' || arg1 != '(') && (arg2 != '}' || arg1 != '{') && (arg2 != ']' || arg1 != '[') && (arg2 != '>' || arg1 != '<')) {
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
					if (arg2 == 'l') {
						return 1;
					}

					return 0;
				}

				return 0;
			}

			if (arg2 != 'o' && arg2 != 'O') {
				if ((arg2 != '(' || arg1 != ')') && (arg2 != '{' || arg1 != '}') && (arg2 != '[' || arg1 != ']')) {
					return 0;
				}

				return 2;
			}

			return 1;
		}

		if (arg0 == ',') {
			if (arg2 == '.') {
				return 1;
			}

			return 0;
		}

		if (arg0 == '.') {
			if (arg2 == ',') {
				return 1;
			}

			return 0;
		}

		if (arg0 == '!') {
			if (arg2 == 'i') {
				return 1;
			}

			return 0;
		}

		return 0;
	}

	@ObfuscatedName("DYUQECMZ.a(BC)B")
	public static final byte method270(char arg0) {
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

	@ObfuscatedName("DYUQECMZ.c([CI)V")
	public static final void method271(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method272(var2, arg0)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method274(arg0[var6]) && !method275(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method273(var7, arg0);
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

	@ObfuscatedName("DYUQECMZ.a(IZ[C)I")
	public static final int method272(int arg0, char[] arg1) {
		for (int var2 = arg0; var2 < arg1.length && var2 >= 0; var2++) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("DYUQECMZ.a(IB[C)I")
	public static final int method273(int arg0, char[] arg1) {
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

	@ObfuscatedName("DYUQECMZ.a(ZC)Z")
	public static final boolean method274(char arg0) {
		if (!method276(arg0) && !method277(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("DYUQECMZ.b(ZC)Z")
	public static final boolean method275(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("DYUQECMZ.a(CZ)Z")
	public static final boolean method276(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("DYUQECMZ.b(CB)Z")
	public static final boolean method277(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("DYUQECMZ.a(CI)Z")
	public static final boolean method278(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("DYUQECMZ.b(CI)Z")
	public static final boolean method279(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("DYUQECMZ.b(I[C)Z")
	public static final boolean method280(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method277(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method281(arg0);
		int var4 = 0;
		int var5 = field685.length - 1;
		if (field685[var4] != var3 && field685[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field685[var6] == var3) {
					return true;
				}

				if (var3 < field685[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("DYUQECMZ.a([CB)I")
	public static final int method281(char[] arg0) {
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
