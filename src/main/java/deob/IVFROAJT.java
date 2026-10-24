package deob;

@ObfuscatedName("IVFROAJT")
public final class IVFROAJT {

	@ObfuscatedName("IVFROAJT.r")
	public static final String[] field844 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("IVFROAJT.l")
	public static int[] field838;

	@ObfuscatedName("IVFROAJT.q")
	public static int[] field843;

	@ObfuscatedName("IVFROAJT.m")
	public static char[][] field839;

	@ObfuscatedName("IVFROAJT.o")
	public static char[][] field841;

	@ObfuscatedName("IVFROAJT.p")
	public static char[][] field842;

	@ObfuscatedName("IVFROAJT.n")
	public static byte[][][] field840;

	@ObfuscatedName("IVFROAJT.a(LCVNWKEAW;)V")
	public static final void method337(CVNWKEAW arg0) {
		XOUQUKZW var1 = new XOUQUKZW(arg0.method180("fragmentsenc.txt", null));
		XOUQUKZW var2 = new XOUQUKZW(arg0.method180("badenc.txt", null));
		XOUQUKZW var3 = new XOUQUKZW(arg0.method180("domainenc.txt", null));
		XOUQUKZW var4 = new XOUQUKZW(arg0.method180("tldlist.txt", null));
		method338(var1, var2, var3, var4);
	}

	@ObfuscatedName("IVFROAJT.a(LXOUQUKZW;LXOUQUKZW;LXOUQUKZW;LXOUQUKZW;)V")
	public static final void method338(XOUQUKZW arg0, XOUQUKZW arg1, XOUQUKZW arg2, XOUQUKZW arg3) {
		method340(arg1);
		method341(arg2);
		method342(arg0);
		method339(arg3);
	}

	@ObfuscatedName("IVFROAJT.a(LXOUQUKZW;I)V")
	public static final void method339(XOUQUKZW arg0) {
		int var1 = arg0.method526();
		field842 = new char[var1][];
		field843 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field843[var2] = arg0.method521();
			char[] var3 = new char[arg0.method521()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method521();
			}

			field842[var2] = var3;
		}
	}

	@ObfuscatedName("IVFROAJT.a(ILXOUQUKZW;)V")
	public static final void method340(XOUQUKZW arg0) {
		int var1 = arg0.method526();
		field839 = new char[var1][];
		field840 = new byte[var1][][];
		method343(field840, field839, arg0);
	}

	@ObfuscatedName("IVFROAJT.a(LXOUQUKZW;B)V")
	public static final void method341(XOUQUKZW arg0) {
		int var1 = arg0.method526();
		field841 = new char[var1][];
		method344(field841, arg0);
	}

	@ObfuscatedName("IVFROAJT.b(ILXOUQUKZW;)V")
	public static final void method342(XOUQUKZW arg0) {
		field838 = new int[arg0.method526()];
		for (int var1 = 0; var1 < field838.length; var1++) {
			field838[var1] = arg0.method523();
		}
	}

	@ObfuscatedName("IVFROAJT.a([[[B[[CILXOUQUKZW;)V")
	public static final void method343(byte[][][] arg0, char[][] arg1, XOUQUKZW arg2) {
		for (int var3 = 0; var3 < arg1.length; var3++) {
			char[] var4 = new char[arg2.method521()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg2.method521();
			}

			arg1[var3] = var4;
			byte[][] var6 = new byte[arg2.method521()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg2.method521();
				var6[var7][1] = (byte) arg2.method521();
			}

			if (var6.length > 0) {
				arg0[var3] = var6;
			}
		}
	}

	@ObfuscatedName("IVFROAJT.a(B[[CLXOUQUKZW;)V")
	public static final void method344(char[][] arg0, XOUQUKZW arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char[] var3 = new char[arg1.method521()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg1.method521();
			}

			arg0[var2] = var3;
		}
	}

	@ObfuscatedName("IVFROAJT.a(Z[C)V")
	public static final void method345(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method346(arg0[var2])) {
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

	@ObfuscatedName("IVFROAJT.a(IC)Z")
	public static final boolean method346(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("IVFROAJT.a(ZLjava/lang/String;)Ljava/lang/String;")
	public static final String method347(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method345(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method355(var5);
		method350(var5);
		method351(var5);
		method364(var5);

		for (int var7 = 0; var7 < field844.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field844[var7], var8 + 1)) != -1) {
				char[] var9 = field844[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method348(var5, var4.toCharArray());
		method349(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("IVFROAJT.a(Z[C[C)V")
	public static final void method348(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method372(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("IVFROAJT.b(Z[C)V")
	public static final void method349(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method369(var3)) {
				var1 = true;
			} else if (var1) {
				if (method371(var3)) {
					var1 = false;
				}
			} else if (method372(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("IVFROAJT.a([CI)V")
	public static final void method350(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field839.length - 1; var2 >= 0; var2--) {
				method359(field839[var2], arg0, field840[var2]);
			}
		}
	}

	@ObfuscatedName("IVFROAJT.a(I[C)V")
	public static final void method351(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method359(var2, var1, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method359(var4, var3, null);

		for (int var5 = field841.length - 1; var5 >= 0; var5--) {
			method352(field841[var5], arg0, var3, var1);
		}
	}

	@ObfuscatedName("IVFROAJT.a([C[C[C[CI)V")
	public static final void method352(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
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

					if (var7 < arg0.length && (var12 = method361(var10, arg0[var7], var11)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method361(var10, arg0[var7 - 1], var11)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg0.length || !method367(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg0.length) {
					boolean var14 = false;
					int var15 = method353(var5, arg1, arg3);
					int var16 = method354(arg1, var6 - 1, arg2);
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

	@ObfuscatedName("IVFROAJT.a(II[C[C)I")
	public static final int method353(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		for (int var3 = arg0 - 1; var3 >= 0 && method367(arg1[var3]); var3--) {
			if (arg1[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method367(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method367(arg1[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IVFROAJT.a([CII[C)I")
	public static final int method354(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg0.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg0.length && method367(arg0[var3])) {
			if (arg0[var3] != '.' && arg0[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg0.length && method367(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method367(arg0[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IVFROAJT.a([CB)V")
	public static final void method355(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method359(var2, var1, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method359(var4, var3, null);

		for (int var5 = 0; var5 < field842.length; var5++) {
			method356(var3, arg0, var1, field842[var5], field843[var5]);
		}
	}

	@ObfuscatedName("IVFROAJT.a(I[C[C[C[CI)V")
	public static final void method356(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
		if (arg3.length <= arg1.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg1.length - arg3.length; var6 += var9) {
				int var7 = var6;
				int var8 = 0;
				var9 = 1;
				while (var7 < arg1.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg1[var7];
					char var12 = 0;
					if (var7 + 1 < arg1.length) {
						var12 = arg1[var7 + 1];
					}

					if (var8 < arg3.length && (var13 = method361(var11, arg3[var8], var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method361(var11, arg3[var8 - 1], var12)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg3.length || !method367(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg3.length) {
					boolean var15 = false;
					int var16 = method357(var6, arg2, arg1);
					int var17 = method358(arg0, var7 - 1, arg1);
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
									if (method367(arg1[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method367(arg1[var23])) {
									var22 = true;
									var18 = var23;
								}
							}
						}

						if (var17 > 2) {
							if (var17 == 4) {
								boolean var24 = false;
								for (int var25 = var19 + 1; var25 < arg1.length; var25++) {
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
							for (int var27 = var19 + 1; var27 < arg1.length; var27++) {
								if (var26) {
									if (method367(arg1[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method367(arg1[var27])) {
									var26 = true;
									var19 = var27;
								}
							}
						}

						for (int var28 = var18; var28 <= var19; var28++) {
							arg1[var28] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("IVFROAJT.a(I[CI[C)I")
	public static final int method357(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		int var3 = arg0 - 1;
		while (var3 >= 0 && method367(arg2[var3])) {
			if (arg2[var3] != ',' && arg2[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method367(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method367(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IVFROAJT.b(I[CI[C)I")
	public static final int method358(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg2.length && method367(arg2[var3])) {
			if (arg2[var3] != '\\' && arg2[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg2.length && method367(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method367(arg2[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IVFROAJT.a([CI[C[[B)V")
	public static final void method359(char[] arg0, char[] arg1, byte[][] arg2) {
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

					if (var6 < arg0.length && (var15 = method362(arg0[var6], var14, var13)) > 0) {
						if (var15 == 1 && method370(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method370(var13) || method370(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method362(arg0[var6 - 1], var14, var13)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg0.length || !method368(var13)) {
								break;
							}

							if (method367(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method370(var13)) {
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

						if (var4 - 1 < 0 || method367(arg1[var4 - 1]) && arg1[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg1.length || method367(arg1[var5]) && arg1[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method367(arg1[var25]) || arg1[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg1.length && (!method367(arg1[var25 + var27]) || arg1[var25 + var27] == '\''); var27++) {
										var26[var27] = arg1[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method367(arg1[var25 - 1]) || arg1[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method373(var26)) {
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

						byte var20 = method363(var18);
						byte var21 = method363(var19);
						if (arg2 != null && method360(var21, var20, arg2)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method370(arg1[var32])) {
								var29++;
							} else if (method369(arg1[var32])) {
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

	@ObfuscatedName("IVFROAJT.a(BBI[[B)Z")
	public static final boolean method360(byte arg0, byte arg1, byte[][] arg2) {
		int var3 = 0;
		if (arg2[var3][0] == arg1 && arg2[var3][1] == arg0) {
			return true;
		}

		int var4 = arg2.length - 1;
		if (arg2[var4][0] == arg1 && arg2[var4][1] == arg0) {
			return true;
		}

		do {
			int var5 = (var3 + var4) / 2;
			if (arg2[var5][0] == arg1 && arg2[var5][1] == arg0) {
				return true;
			}

			if (arg1 < arg2[var5][0] || arg2[var5][0] == arg1 && arg0 < arg2[var5][1]) {
				var4 = var5;
			} else {
				var3 = var5;
			}
		} while (var3 != var4 && var3 + 1 != var4);

		return false;
	}

	@ObfuscatedName("IVFROAJT.a(CICC)I")
	public static final int method361(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("IVFROAJT.a(ICCC)I")
	public static final int method362(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("IVFROAJT.a(CI)B")
	public static final byte method363(char arg0) {
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

	@ObfuscatedName("IVFROAJT.b([CI)V")
	public static final void method364(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method365(var2, arg0)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method367(arg0[var6]) && !method368(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method366(var7, arg0);
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

	@ObfuscatedName("IVFROAJT.a(BI[C)I")
	public static final int method365(int arg0, char[] arg1) {
		for (int var2 = arg0; var2 < arg1.length && var2 >= 0; var2++) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("IVFROAJT.a(IZ[C)I")
	public static final int method366(int arg0, char[] arg1) {
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

	@ObfuscatedName("IVFROAJT.b(CI)Z")
	public static final boolean method367(char arg0) {
		if (!method369(arg0) && !method370(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IVFROAJT.a(CZ)Z")
	public static final boolean method368(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("IVFROAJT.a(ZC)Z")
	public static final boolean method369(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IVFROAJT.a(BC)Z")
	public static final boolean method370(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IVFROAJT.b(IC)Z")
	public static final boolean method371(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IVFROAJT.b(BC)Z")
	public static final boolean method372(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IVFROAJT.b(I[C)Z")
	public static final boolean method373(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method370(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method374(arg0);
		int var4 = 0;
		int var5 = field838.length - 1;
		if (field838[var4] != var3 && field838[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field838[var6] == var3) {
					return true;
				}

				if (var3 < field838[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("IVFROAJT.a(B[C)I")
	public static final int method374(char[] arg0) {
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
