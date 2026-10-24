package deob;

@ObfuscatedName("OCOLATKS")
public final class OCOLATKS {

	@ObfuscatedName("OCOLATKS.r")
	public static final String[] field915 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("OCOLATKS.l")
	public static int[] field909;

	@ObfuscatedName("OCOLATKS.q")
	public static int[] field914;

	@ObfuscatedName("OCOLATKS.m")
	public static char[][] field910;

	@ObfuscatedName("OCOLATKS.o")
	public static char[][] field912;

	@ObfuscatedName("OCOLATKS.p")
	public static char[][] field913;

	@ObfuscatedName("OCOLATKS.n")
	public static byte[][][] field911;

	@ObfuscatedName("OCOLATKS.a(LFIGUVTWB;)V")
	public static final void method359(FIGUVTWB arg0) {
		MUKVLYLC var1 = new MUKVLYLC(arg0.method209("fragmentsenc.txt", null));
		MUKVLYLC var2 = new MUKVLYLC(arg0.method209("badenc.txt", null));
		MUKVLYLC var3 = new MUKVLYLC(arg0.method209("domainenc.txt", null));
		MUKVLYLC var4 = new MUKVLYLC(arg0.method209("tldlist.txt", null));
		method360(var1, var2, var3, var4);
	}

	@ObfuscatedName("OCOLATKS.a(LMUKVLYLC;LMUKVLYLC;LMUKVLYLC;LMUKVLYLC;)V")
	public static final void method360(MUKVLYLC arg0, MUKVLYLC arg1, MUKVLYLC arg2, MUKVLYLC arg3) {
		method362(arg1);
		method363(arg2);
		method364(arg0);
		method361(arg3);
	}

	@ObfuscatedName("OCOLATKS.a(ZLMUKVLYLC;)V")
	public static final void method361(MUKVLYLC arg0) {
		int var1 = arg0.method297();
		field913 = new char[var1][];
		field914 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field914[var2] = arg0.method292();
			char[] var3 = new char[arg0.method292()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method292();
			}

			field913[var2] = var3;
		}
	}

	@ObfuscatedName("OCOLATKS.b(ZLMUKVLYLC;)V")
	public static final void method362(MUKVLYLC arg0) {
		int var1 = arg0.method297();
		field910 = new char[var1][];
		field911 = new byte[var1][][];
		method365(arg0, field911, field910);
	}

	@ObfuscatedName("OCOLATKS.a(ILMUKVLYLC;)V")
	public static final void method363(MUKVLYLC arg0) {
		int var1 = arg0.method297();
		field912 = new char[var1][];
		method366(field912, arg0);
	}

	@ObfuscatedName("OCOLATKS.b(ILMUKVLYLC;)V")
	public static final void method364(MUKVLYLC arg0) {
		field909 = new int[arg0.method297()];
		for (int var1 = 0; var1 < field909.length; var1++) {
			field909[var1] = arg0.method294();
		}
	}

	@ObfuscatedName("OCOLATKS.a(ILMUKVLYLC;[[[B[[C)V")
	public static final void method365(MUKVLYLC arg0, byte[][][] arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var4 = new char[arg0.method292()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.method292();
			}

			arg2[var3] = var4;
			byte[][] var6 = new byte[arg0.method292()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg0.method292();
				var6[var7][1] = (byte) arg0.method292();
			}

			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("OCOLATKS.a([[CLMUKVLYLC;B)V")
	public static final void method366(char[][] arg0, MUKVLYLC arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char[] var3 = new char[arg1.method292()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg1.method292();
			}

			arg0[var2] = var3;
		}
	}

	@ObfuscatedName("OCOLATKS.a(Z[C)V")
	public static final void method367(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method368(arg0[var2])) {
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

	@ObfuscatedName("OCOLATKS.a(CI)Z")
	public static final boolean method368(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("OCOLATKS.a(Ljava/lang/String;Z)Ljava/lang/String;")
	public static final String method369(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method367(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method377(var5);
		method372(var5);
		method373(var5);
		method386(var5);

		for (int var7 = 0; var7 < field915.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field915[var7], var8 + 1)) != -1) {
				char[] var9 = field915[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method370(var5, var4.toCharArray());
		method371(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("OCOLATKS.a([CB[C)V")
	public static final void method370(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method394(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("OCOLATKS.a([CZ)V")
	public static final void method371(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method391(var3)) {
				var1 = true;
			} else if (var1) {
				if (method393(var3)) {
					var1 = false;
				}
			} else if (method394(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("OCOLATKS.a([CB)V")
	public static final void method372(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field910.length - 1; var2 >= 0; var2--) {
				method381(field910[var2], arg0, field911[var2]);
			}
		}
	}

	@ObfuscatedName("OCOLATKS.a(I[C)V")
	public static final void method373(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method381(var2, var1, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method381(var4, var3, null);

		for (int var5 = field912.length - 1; var5 >= 0; var5--) {
			method374(var1, var3, arg0, field912[var5]);
		}
	}

	@ObfuscatedName("OCOLATKS.a([C[CI[C[C)V")
	public static final void method374(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg3.length <= arg2.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg2.length - arg3.length; var5 += var8) {
				int var6 = var5;
				int var7 = 0;
				var8 = 1;
				while (var6 < arg2.length) {
					int var12;
					boolean var9 = false;
					char var10 = arg2[var6];
					char var11 = 0;
					if (var6 + 1 < arg2.length) {
						var11 = arg2[var6 + 1];
					}

					if (var7 < arg3.length && (var12 = method383(var10, var11, arg3[var7])) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method383(var10, var11, arg3[var7 - 1])) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg3.length || !method389(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg3.length) {
					boolean var14 = false;
					int var15 = method375(arg0, arg2, var5);
					int var16 = method376(arg2, var6 - 1, arg1);
					if (var15 > 2 || var16 > 2) {
						var14 = true;
					}

					if (var14) {
						for (int var17 = var5; var17 < var6; var17++) {
							arg2[var17] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("OCOLATKS.a([C[CII)I")
	public static final int method375(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}

		for (int var3 = arg2 - 1; var3 >= 0 && method389(arg1[var3]); var3--) {
			if (arg1[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg2 - 1; var5 >= 0 && method389(arg0[var5]); var5--) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method389(arg1[arg2 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("OCOLATKS.a([CII[C)I")
	public static final int method376(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg0.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg0.length && method389(arg0[var3])) {
			if (arg0[var3] != '.' && arg0[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg0.length && method389(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method389(arg0[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("OCOLATKS.b(Z[C)V")
	public static final void method377(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method381(var2, var1, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method381(var4, var3, null);

		for (int var5 = 0; var5 < field913.length; var5++) {
			method378(field914[var5], var3, var1, arg0, field913[var5]);
		}
	}

	@ObfuscatedName("OCOLATKS.a(I[C[CI[C[C)V")
	public static final void method378(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
		if (arg4.length <= arg3.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg3.length - arg4.length; var6 += var9) {
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

					if (var8 < arg4.length && (var13 = method383(var11, var12, arg4[var8])) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method383(var11, var12, arg4[var8 - 1])) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg4.length || !method389(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg4.length) {
					boolean var15 = false;
					int var16 = method379(arg3, arg2, var6);
					int var17 = method380(arg1, var7 - 1, arg3);
					if (arg0 == 1 && var16 > 0 && var17 > 0) {
						var15 = true;
					}

					if (arg0 == 2 && (var16 > 2 && var17 > 0 || var16 > 0 && var17 > 2)) {
						var15 = true;
					}

					if (arg0 == 3 && var16 > 0 && var17 > 2) {
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
										if (arg2[var21] != '*') {
											break;
										}

										var18 = var21;
									} else if (arg2[var21] == '*') {
										var18 = var21;
										var20 = true;
									}
								}
							}

							boolean var22 = false;
							for (int var23 = var18 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (method389(arg3[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method389(arg3[var23])) {
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
										if (arg1[var25] != '*') {
											break;
										}

										var19 = var25;
									} else if (arg1[var25] == '*') {
										var19 = var25;
										var24 = true;
									}
								}
							}

							boolean var26 = false;
							for (int var27 = var19 + 1; var27 < arg3.length; var27++) {
								if (var26) {
									if (method389(arg3[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method389(arg3[var27])) {
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

	@ObfuscatedName("OCOLATKS.a([C[CZI)I")
	public static final int method379(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}

		int var3 = arg2 - 1;
		while (var3 >= 0 && method389(arg0[var3])) {
			if (arg0[var3] != ',' && arg0[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 - 1; var5 >= 0 && method389(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method389(arg0[arg2 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("OCOLATKS.a(I[CI[C)I")
	public static final int method380(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg2.length && method389(arg2[var3])) {
			if (arg2[var3] != '\\' && arg2[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg2.length && method389(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method389(arg2[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("OCOLATKS.a([C[C[[BZ)V")
	public static final void method381(char[] arg0, char[] arg1, byte[][] arg2) {
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

					if (var6 < arg0.length && (var15 = method384(var13, var14, arg0[var6])) > 0) {
						if (var15 == 1 && method392(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method392(var13) || method392(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method384(var13, var14, arg0[var6 - 1])) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg0.length || !method390(var13)) {
								break;
							}

							if (method389(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method392(var13)) {
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

						if (var4 - 1 < 0 || method389(arg1[var4 - 1]) && arg1[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg1.length || method389(arg1[var5]) && arg1[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method389(arg1[var25]) || arg1[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg1.length && (!method389(arg1[var25 + var27]) || arg1[var25 + var27] == '\''); var27++) {
										var26[var27] = arg1[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method389(arg1[var25 - 1]) || arg1[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method395(var26)) {
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

						byte var20 = method385(var18);
						byte var21 = method385(var19);
						if (arg2 != null && method382(arg2, var21, var20)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method392(arg1[var32])) {
								var29++;
							} else if (method391(arg1[var32])) {
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

	@ObfuscatedName("OCOLATKS.a([[BBIB)Z")
	public static final boolean method382(byte[][] arg0, byte arg1, byte arg2) {
		int var3 = 0;
		if (arg0[var3][0] == arg2 && arg0[var3][1] == arg1) {
			return true;
		}

		int var4 = arg0.length - 1;
		if (arg0[var4][0] == arg2 && arg0[var4][1] == arg1) {
			return true;
		}

		do {
			int var5 = (var3 + var4) / 2;
			if (arg0[var5][0] == arg2 && arg0[var5][1] == arg1) {
				return true;
			}

			if (arg2 < arg0[var5][0] || arg0[var5][0] == arg2 && arg1 < arg0[var5][1]) {
				var4 = var5;
			} else {
				var3 = var5;
			}
		} while (var3 != var4 && var3 + 1 != var4);

		return false;
	}

	@ObfuscatedName("OCOLATKS.a(CCIC)I")
	public static final int method383(char arg0, char arg1, char arg2) {
		if (arg0 == arg2) {
			return 1;
		}

		if (arg2 == 'o' && arg0 == '0') {
			return 1;
		}

		if (arg2 == 'o' && arg0 == '(' && arg1 == ')') {
			return 2;
		}

		if (arg2 == 'c' && (arg0 == '(' || arg0 == '<' || arg0 == '[')) {
			return 1;
		}

		if (arg2 == 'e' && arg0 == '€') {
			return 1;
		}

		if (arg2 == 's' && arg0 == '$') {
			return 1;
		}

		if (arg2 == 'l' && arg0 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("OCOLATKS.a(ICCC)I")
	public static final int method384(char arg0, char arg1, char arg2) {
		if (arg0 == arg2) {
			return 1;
		}

		if (arg2 >= 'a' && arg2 <= 'm') {
			if (arg2 == 'a') {
				if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
					if (arg0 == '/' && arg1 == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg2 == 'b') {
				if (arg0 != '6' && arg0 != '8') {
					if ((arg0 != '1' || arg1 != '3') && (arg0 != 'i' || arg1 != '3')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg2 == 'c') {
				if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'd') {
				if ((arg0 != '[' || arg1 != ')') && (arg0 != 'i' || arg1 != ')')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'e') {
				if (arg0 != '3' && arg0 != '€') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'f') {
				if (arg0 == 'p' && arg1 == 'h') {
					return 2;
				}

				if (arg0 == '£') {
					return 1;
				}

				return 0;
			}

			if (arg2 == 'g') {
				if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'h') {
				if (arg0 == '#') {
					return 1;
				}

				return 0;
			}

			if (arg2 == 'i') {
				if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
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
				if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
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
				if (arg0 != '0' && arg0 != '*') {
					if ((arg0 != '(' || arg1 != ')') && (arg0 != '[' || arg1 != ']') && (arg0 != '{' || arg1 != '}') && (arg0 != '<' || arg1 != '>')) {
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
				if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 't') {
				if (arg0 != '7' && arg0 != '+') {
					return 0;
				}

				return 1;
			}

			if (arg2 == 'u') {
				if (arg0 == 'v') {
					return 1;
				}

				if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'v') {
				if ((arg0 != '\\' || arg1 != '/') && (arg0 != '\\' || arg1 != '|') && (arg0 != '|' || arg1 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg2 == 'w') {
				if (arg0 == 'v' && arg1 == 'v') {
					return 2;
				}

				return 0;
			}

			if (arg2 == 'x') {
				if ((arg0 != ')' || arg1 != '(') && (arg0 != '}' || arg1 != '{') && (arg0 != ']' || arg1 != '[') && (arg0 != '>' || arg1 != '<')) {
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
					if (arg0 == 'l') {
						return 1;
					}

					return 0;
				}

				return 0;
			}

			if (arg0 != 'o' && arg0 != 'O') {
				if ((arg0 != '(' || arg1 != ')') && (arg0 != '{' || arg1 != '}') && (arg0 != '[' || arg1 != ']')) {
					return 0;
				}

				return 2;
			}

			return 1;
		}

		if (arg2 == ',') {
			if (arg0 == '.') {
				return 1;
			}

			return 0;
		}

		if (arg2 == '.') {
			if (arg0 == ',') {
				return 1;
			}

			return 0;
		}

		if (arg2 == '!') {
			if (arg0 == 'i') {
				return 1;
			}

			return 0;
		}

		return 0;
	}

	@ObfuscatedName("OCOLATKS.a(CB)B")
	public static final byte method385(char arg0) {
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

	@ObfuscatedName("OCOLATKS.a([CI)V")
	public static final void method386(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method387(var2, arg0)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method389(arg0[var6]) && !method390(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method388(var7, arg0);
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

	@ObfuscatedName("OCOLATKS.a(BI[C)I")
	public static final int method387(int arg0, char[] arg1) {
		for (int var2 = arg0; var2 < arg1.length && var2 >= 0; var2++) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("OCOLATKS.a(IB[C)I")
	public static final int method388(int arg0, char[] arg1) {
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

	@ObfuscatedName("OCOLATKS.b(CB)Z")
	public static final boolean method389(char arg0) {
		if (!method391(arg0) && !method392(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("OCOLATKS.a(IC)Z")
	public static final boolean method390(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("OCOLATKS.b(IC)Z")
	public static final boolean method391(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("OCOLATKS.b(CI)Z")
	public static final boolean method392(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("OCOLATKS.c(CB)Z")
	public static final boolean method393(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("OCOLATKS.c(IC)Z")
	public static final boolean method394(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("OCOLATKS.b([CI)Z")
	public static final boolean method395(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method392(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method396(arg0);
		int var4 = 0;
		int var5 = field909.length - 1;
		if (field909[var4] != var3 && field909[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field909[var6] == var3) {
					return true;
				}

				if (var3 < field909[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("OCOLATKS.b(I[C)I")
	public static final int method396(char[] arg0) {
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
