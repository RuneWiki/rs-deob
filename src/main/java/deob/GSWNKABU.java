package deob;

@ObfuscatedName("GSWNKABU")
public final class GSWNKABU {

	@ObfuscatedName("GSWNKABU.o")
	public static final String[] field576 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("GSWNKABU.i")
	public static int[] field570;

	@ObfuscatedName("GSWNKABU.n")
	public static int[] field575;

	@ObfuscatedName("GSWNKABU.j")
	public static char[][] field571;

	@ObfuscatedName("GSWNKABU.l")
	public static char[][] field573;

	@ObfuscatedName("GSWNKABU.m")
	public static char[][] field574;

	@ObfuscatedName("GSWNKABU.k")
	public static byte[][][] field572;

	@ObfuscatedName("GSWNKABU.a(LAKPFVPPG;)V")
	public static final void method254(AKPFVPPG arg0) {
		FTMSICIZ var1 = new FTMSICIZ(arg0.method7("fragmentsenc.txt", null));
		FTMSICIZ var2 = new FTMSICIZ(arg0.method7("badenc.txt", null));
		FTMSICIZ var3 = new FTMSICIZ(arg0.method7("domainenc.txt", null));
		FTMSICIZ var4 = new FTMSICIZ(arg0.method7("tldlist.txt", null));
		method255(var1, var2, var3, var4);
	}

	@ObfuscatedName("GSWNKABU.a(LFTMSICIZ;LFTMSICIZ;LFTMSICIZ;LFTMSICIZ;)V")
	public static final void method255(FTMSICIZ arg0, FTMSICIZ arg1, FTMSICIZ arg2, FTMSICIZ arg3) {
		method257(arg1);
		method258(arg2);
		method259(arg0);
		method256(arg3);
	}

	@ObfuscatedName("GSWNKABU.a(LFTMSICIZ;I)V")
	public static final void method256(FTMSICIZ arg0) {
		int var1 = arg0.method218();
		field574 = new char[var1][];
		field575 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field575[var2] = arg0.method213();
			char[] var3 = new char[arg0.method213()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method213();
			}

			field574[var2] = var3;
		}
	}

	@ObfuscatedName("GSWNKABU.b(LFTMSICIZ;I)V")
	public static final void method257(FTMSICIZ arg0) {
		int var1 = arg0.method218();
		field571 = new char[var1][];
		field572 = new byte[var1][][];
		method260(field571, arg0, field572);
	}

	@ObfuscatedName("GSWNKABU.a(LFTMSICIZ;B)V")
	public static final void method258(FTMSICIZ arg0) {
		int var1 = arg0.method218();
		field573 = new char[var1][];
		method261(arg0, field573);
	}

	@ObfuscatedName("GSWNKABU.a(ILFTMSICIZ;)V")
	public static final void method259(FTMSICIZ arg0) {
		field570 = new int[arg0.method218()];
		for (int var1 = 0; var1 < field570.length; var1++) {
			field570[var1] = arg0.method215();
		}
	}

	@ObfuscatedName("GSWNKABU.a([[CLFTMSICIZ;B[[[B)V")
	public static final void method260(char[][] arg0, FTMSICIZ arg1, byte[][][] arg2) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char[] var4 = new char[arg1.method213()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg1.method213();
			}

			arg0[var3] = var4;
			byte[][] var6 = new byte[arg1.method213()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg1.method213();
				var6[var7][1] = (byte) arg1.method213();
			}

			if (var6.length > 0) {
				arg2[var3] = var6;
			}
		}
	}

	@ObfuscatedName("GSWNKABU.a(BLFTMSICIZ;[[C)V")
	public static final void method261(FTMSICIZ arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method213()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method213();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("GSWNKABU.a(I[C)V")
	public static final void method262(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method263(arg0[var2])) {
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

	@ObfuscatedName("GSWNKABU.a(CI)Z")
	public static final boolean method263(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("GSWNKABU.a(Ljava/lang/String;Z)Ljava/lang/String;")
	public static final String method264(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method262(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method272(var5);
		method267(var5);
		method268(var5);
		method281(var5);

		for (int var7 = 0; var7 < field576.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field576[var7], var8 + 1)) != -1) {
				char[] var9 = field576[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method265(var4.toCharArray(), var5);
		method266(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("GSWNKABU.a([C[CI)V")
	public static final void method265(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg1[var2] != '*' && method289(arg0[var2])) {
				arg1[var2] = arg0[var2];
			}
		}
	}

	@ObfuscatedName("GSWNKABU.a([CB)V")
	public static final void method266(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method286(var3)) {
				var1 = true;
			} else if (var1) {
				if (method288(var3)) {
					var1 = false;
				}
			} else if (method289(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("GSWNKABU.a(Z[C)V")
	public static final void method267(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field571.length - 1; var2 >= 0; var2--) {
				method276(arg0, field571[var2], field572[var2]);
			}
		}
	}

	@ObfuscatedName("GSWNKABU.b(Z[C)V")
	public static final void method268(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method276(var1, var2, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method276(var3, var4, null);

		for (int var5 = field573.length - 1; var5 >= 0; var5--) {
			method269(var3, field573[var5], var1, arg0);
		}
	}

	@ObfuscatedName("GSWNKABU.a([CB[C[C[C)V")
	public static final void method269(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg1.length <= arg3.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg3.length - arg1.length; var5 += var8) {
				int var6 = var5;
				int var7 = 0;
				var8 = 1;
				while (var6 < arg3.length) {
					int var12;
					boolean var9 = false;
					char var10 = arg3[var6];
					char var11 = 0;
					if (var6 + 1 < arg3.length) {
						var11 = arg3[var6 + 1];
					}

					if (var7 < arg1.length && (var12 = method278(arg1[var7], var10, var11)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method278(arg1[var7 - 1], var10, var11)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg1.length || !method284(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg1.length) {
					boolean var14 = false;
					int var15 = method270(var5, arg3, arg2);
					int var16 = method271(arg0, var6 - 1, arg3);
					if (var15 > 2 || var16 > 2) {
						var14 = true;
					}

					if (var14) {
						for (int var17 = var5; var17 < var6; var17++) {
							arg3[var17] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("GSWNKABU.a(I[CI[C)I")
	public static final int method270(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		for (int var3 = arg0 - 1; var3 >= 0 && method284(arg1[var3]); var3--) {
			if (arg1[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method284(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method284(arg1[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("GSWNKABU.a(B[CI[C)I")
	public static final int method271(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg2.length && method284(arg2[var3])) {
			if (arg2[var3] != '.' && arg2[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg2.length && method284(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method284(arg2[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("GSWNKABU.b(I[C)V")
	public static final void method272(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method276(var1, var2, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method276(var3, var4, null);

		for (int var5 = 0; var5 < field574.length; var5++) {
			method273(arg0, var1, var3, field574[var5], field575[var5]);
		}
	}

	@ObfuscatedName("GSWNKABU.a([C[C[C[CBI)V")
	public static final void method273(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
		if (arg3.length <= arg0.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg0.length - arg3.length; var6 += var9) {
				int var7 = var6;
				int var8 = 0;
				var9 = 1;
				while (var7 < arg0.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg0[var7];
					char var12 = 0;
					if (var7 + 1 < arg0.length) {
						var12 = arg0[var7 + 1];
					}

					if (var8 < arg3.length && (var13 = method278(arg3[var8], var11, var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method278(arg3[var8 - 1], var11, var12)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg3.length || !method284(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg3.length) {
					boolean var15 = false;
					int var16 = method274(arg0, var6, arg1);
					int var17 = method275(arg2, var7 - 1, arg0);
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
									if (method284(arg0[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method284(arg0[var23])) {
									var22 = true;
									var18 = var23;
								}
							}
						}

						if (var17 > 2) {
							if (var17 == 4) {
								boolean var24 = false;
								for (int var25 = var19 + 1; var25 < arg0.length; var25++) {
									if (var24) {
										if (arg2[var25] != '*') {
											break;
										}

										var19 = var25;
									} else if (arg2[var25] == '*') {
										var19 = var25;
										var24 = true;
									}
								}
							}

							boolean var26 = false;
							for (int var27 = var19 + 1; var27 < arg0.length; var27++) {
								if (var26) {
									if (method284(arg0[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method284(arg0[var27])) {
									var26 = true;
									var19 = var27;
								}
							}
						}

						for (int var28 = var18; var28 <= var19; var28++) {
							arg0[var28] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("GSWNKABU.a([CII[C)I")
	public static final int method274(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		int var3 = arg1 - 1;
		while (var3 >= 0 && method284(arg0[var3])) {
			if (arg0[var3] != ',' && arg0[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method284(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method284(arg0[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("GSWNKABU.a([CI[CZ)I")
	public static final int method275(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg2.length && method284(arg2[var3])) {
			if (arg2[var3] != '\\' && arg2[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg2.length && method284(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method284(arg2[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("GSWNKABU.a([C[CI[[B)V")
	public static final void method276(char[] arg0, char[] arg1, byte[][] arg2) {
		if (arg1.length <= arg0.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg0.length - arg1.length; var4 += var8) {
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

					if (var6 < arg1.length && (var15 = method279(var14, var13, arg1[var6])) > 0) {
						if (var15 == 1 && method287(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method287(var13) || method287(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method279(var14, var13, arg1[var6 - 1])) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg1.length || !method285(var13)) {
								break;
							}

							if (method284(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method287(var13)) {
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

				if (var6 >= arg1.length && (!var10 || !var11)) {
					boolean var17 = true;
					if (var9) {
						boolean var22 = false;
						boolean var23 = false;

						if (var4 - 1 < 0 || method284(arg0[var4 - 1]) && arg0[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg0.length || method284(arg0[var5]) && arg0[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method284(arg0[var25]) || arg0[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg0.length && (!method284(arg0[var25 + var27]) || arg0[var25 + var27] == '\''); var27++) {
										var26[var27] = arg0[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method284(arg0[var25 - 1]) || arg0[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method290(var26)) {
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

						byte var20 = method280(var18);
						byte var21 = method280(var19);
						if (arg2 != null && method277(var21, arg2, var20)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method287(arg0[var32])) {
								var29++;
							} else if (method286(arg0[var32])) {
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

	@ObfuscatedName("GSWNKABU.a(IB[[BB)Z")
	public static final boolean method277(byte arg0, byte[][] arg1, byte arg2) {
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

	@ObfuscatedName("GSWNKABU.a(ICCC)I")
	public static final int method278(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("GSWNKABU.a(CCIC)I")
	public static final int method279(char arg0, char arg1, char arg2) {
		if (arg1 == arg2) {
			return 1;
		}

		if (arg2 >= 'a' && arg2 <= 'm') {
			if (arg2 == 'a') {
				if (arg1 != '4' && arg1 != '@' && arg1 != '^') {
					if (arg1 == '/' && arg0 == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg2 == 'b') {
				if (arg1 != '6' && arg1 != '8') {
					if ((arg1 != '1' || arg0 != '3') && (arg1 != 'i' || arg0 != '3')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg2 == 'c') {
				if (arg1 != '(' && arg1 != '<' && arg1 != '{' && arg1 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'd') {
				if ((arg1 != '[' || arg0 != ')') && (arg1 != 'i' || arg0 != ')')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'e') {
				if (arg1 != '3' && arg1 != '€') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'f') {
				if (arg1 == 'p' && arg0 == 'h') {
					return 2;
				}

				if (arg1 == '£') {
					return 1;
				}

				return 0;
			}

			if (arg2 == 'g') {
				if (arg1 != '9' && arg1 != '6' && arg1 != 'q') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'h') {
				if (arg1 == '#') {
					return 1;
				}

				return 0;
			}

			if (arg2 == 'i') {
				if (arg1 != 'y' && arg1 != 'l' && arg1 != 'j' && arg1 != '1' && arg1 != '!' && arg1 != ':' && arg1 != ';' && arg1 != '|') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'j') {
				return 0;
			}

			if (arg2 == 'k') {
				return 0;
			}

			if (arg2 == 'l') {
				if (arg1 != '1' && arg1 != '|' && arg1 != 'i') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'm') {
				return 0;
			}
		}

		if (arg2 >= 'n' && arg2 <= 'z') {
			if (arg2 == 'n') {
				return 0;
			}

			if (arg2 == 'o') {
				if (arg1 != '0' && arg1 != '*') {
					if ((arg1 != '(' || arg0 != ')') && (arg1 != '[' || arg0 != ']') && (arg1 != '{' || arg0 != '}') && (arg1 != '<' || arg0 != '>')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg2 == 'p') {
				return 0;
			}

			if (arg2 == 'q') {
				return 0;
			}

			if (arg2 == 'r') {
				return 0;
			}

			if (arg2 == 's') {
				if (arg1 != '5' && arg1 != 'z' && arg1 != '$' && arg1 != '2') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 't') {
				if (arg1 != '7' && arg1 != '+') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'u') {
				if (arg1 == 'v') {
					return 1;
				}

				if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'v') {
				if ((arg1 != '\\' || arg0 != '/') && (arg1 != '\\' || arg0 != '|') && (arg1 != '|' || arg0 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'w') {
				if (arg1 == 'v' && arg0 == 'v') {
					return 2;
				}

				return 0;
			}

			if (arg2 == 'x') {
				if ((arg1 != ')' || arg0 != '(') && (arg1 != '}' || arg0 != '{') && (arg1 != ']' || arg0 != '[') && (arg1 != '>' || arg0 != '<')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'y') {
				return 0;
			}

			if (arg2 == 'z') {
				return 0;
			}
		}

		if (arg2 >= '0' && arg2 <= '9') {
			if (arg2 != '0') {
				if (arg2 == '1') {
					if (arg1 == 'l') {
						return 1;
					}

					return 0;
				}

				return 0;
			}

			if (arg1 != 'o' && arg1 != 'O') {
				if ((arg1 != '(' || arg0 != ')') && (arg1 != '{' || arg0 != '}') && (arg1 != '[' || arg0 != ']')) {
					return 0;
				}

				return 2;
			}

			return 1;
		}

		if (arg2 == ',') {
			if (arg1 == '.') {
				return 1;
			}

			return 0;
		}

		if (arg2 == '.') {
			if (arg1 == ',') {
				return 1;
			}

			return 0;
		}

		if (arg2 == '!') {
			if (arg1 == 'i') {
				return 1;
			}

			return 0;
		}

		return 0;
	}

	@ObfuscatedName("GSWNKABU.a(ZC)B")
	public static final byte method280(char arg0) {
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

	@ObfuscatedName("GSWNKABU.c(I[C)V")
	public static final void method281(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method282(var2, arg0)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method284(arg0[var6]) && !method285(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method283(arg0, var7);
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

	@ObfuscatedName("GSWNKABU.a(ZI[C)I")
	public static final int method282(int arg0, char[] arg1) {
		for (int var2 = arg0; var2 < arg1.length && var2 >= 0; var2++) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("GSWNKABU.a(Z[CI)I")
	public static final int method283(char[] arg0, int arg1) {
		int var2 = arg1;
		while (var2 < arg0.length && var2 >= 0) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				var2++;
				continue;
			}

			return var2;
		}

		return arg0.length;
	}

	@ObfuscatedName("GSWNKABU.b(CI)Z")
	public static final boolean method284(char arg0) {
		if (!method286(arg0) && !method287(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("GSWNKABU.a(IC)Z")
	public static final boolean method285(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("GSWNKABU.a(CZ)Z")
	public static final boolean method286(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("GSWNKABU.b(IC)Z")
	public static final boolean method287(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("GSWNKABU.c(CI)Z")
	public static final boolean method288(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("GSWNKABU.a(CB)Z")
	public static final boolean method289(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("GSWNKABU.a([CZ)Z")
	public static final boolean method290(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method287(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method291(arg0);
		int var4 = 0;
		int var5 = field570.length - 1;
		if (field570[var4] != var3 && field570[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field570[var6] == var3) {
					return true;
				}

				if (var3 < field570[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("GSWNKABU.b([CB)I")
	public static final int method291(char[] arg0) {
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
