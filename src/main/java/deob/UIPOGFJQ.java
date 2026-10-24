package deob;

@ObfuscatedName("UIPOGFJQ")
public final class UIPOGFJQ {

	@ObfuscatedName("UIPOGFJQ.o")
	public static final String[] field1299 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("UIPOGFJQ.i")
	public static int[] field1293;

	@ObfuscatedName("UIPOGFJQ.n")
	public static int[] field1298;

	@ObfuscatedName("UIPOGFJQ.j")
	public static char[][] field1294;

	@ObfuscatedName("UIPOGFJQ.l")
	public static char[][] field1296;

	@ObfuscatedName("UIPOGFJQ.m")
	public static char[][] field1297;

	@ObfuscatedName("UIPOGFJQ.k")
	public static byte[][][] field1295;

	@ObfuscatedName("UIPOGFJQ.a(LWEMOPWVJ;)V")
	public static final void method502(WEMOPWVJ arg0) {
		SVWJKJVI var1 = new SVWJKJVI(arg0.method559("fragmentsenc.txt", null));
		SVWJKJVI var2 = new SVWJKJVI(arg0.method559("badenc.txt", null));
		SVWJKJVI var3 = new SVWJKJVI(arg0.method559("domainenc.txt", null));
		SVWJKJVI var4 = new SVWJKJVI(arg0.method559("tldlist.txt", null));
		method503(var1, var2, var3, var4);
	}

	@ObfuscatedName("UIPOGFJQ.a(LSVWJKJVI;LSVWJKJVI;LSVWJKJVI;LSVWJKJVI;)V")
	public static final void method503(SVWJKJVI arg0, SVWJKJVI arg1, SVWJKJVI arg2, SVWJKJVI arg3) {
		method505(arg1);
		method506(arg2);
		method507(arg0);
		method504(arg3);
	}

	@ObfuscatedName("UIPOGFJQ.a(ILSVWJKJVI;)V")
	public static final void method504(SVWJKJVI arg0) {
		int var1 = arg0.method466();
		field1297 = new char[var1][];
		field1298 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field1298[var2] = arg0.method461();
			char[] var3 = new char[arg0.method461()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method461();
			}

			field1297[var2] = var3;
		}
	}

	@ObfuscatedName("UIPOGFJQ.b(ILSVWJKJVI;)V")
	public static final void method505(SVWJKJVI arg0) {
		int var1 = arg0.method466();
		field1294 = new char[var1][];
		field1295 = new byte[var1][][];
		method508(arg0, field1294, field1295);
	}

	@ObfuscatedName("UIPOGFJQ.a(LSVWJKJVI;I)V")
	public static final void method506(SVWJKJVI arg0) {
		int var1 = arg0.method466();
		field1296 = new char[var1][];
		method509(arg0, field1296);
	}

	@ObfuscatedName("UIPOGFJQ.a(LSVWJKJVI;Z)V")
	public static final void method507(SVWJKJVI arg0) {
		field1293 = new int[arg0.method466()];
		for (int var1 = 0; var1 < field1293.length; var1++) {
			field1293[var1] = arg0.method463();
		}
	}

	@ObfuscatedName("UIPOGFJQ.a(LSVWJKJVI;[[CI[[[B)V")
	public static final void method508(SVWJKJVI arg0, char[][] arg1, byte[][][] arg2) {
		for (int var3 = 0; var3 < arg1.length; var3++) {
			char[] var4 = new char[arg0.method461()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.method461();
			}

			arg1[var3] = var4;
			byte[][] var6 = new byte[arg0.method461()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg0.method461();
				var6[var7][1] = (byte) arg0.method461();
			}

			if (var6.length > 0) {
				arg2[var3] = var6;
			}
		}
	}

	@ObfuscatedName("UIPOGFJQ.a(LSVWJKJVI;Z[[C)V")
	public static final void method509(SVWJKJVI arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method461()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method461();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("UIPOGFJQ.a(B[C)V")
	public static final void method510(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method511(arg0[var2])) {
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

	@ObfuscatedName("UIPOGFJQ.a(CI)Z")
	public static final boolean method511(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("UIPOGFJQ.a(ZLjava/lang/String;)Ljava/lang/String;")
	public static final String method512(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method510(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method520(var5);
		method515(var5);
		method516(var5);
		method529(var5);

		for (int var7 = 0; var7 < field1299.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field1299[var7], var8 + 1)) != -1) {
				char[] var9 = field1299[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method513(var4.toCharArray(), var5);
		method514(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("UIPOGFJQ.a([C[CI)V")
	public static final void method513(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg1[var2] != '*' && method537(arg0[var2])) {
				arg1[var2] = arg0[var2];
			}
		}
	}

	@ObfuscatedName("UIPOGFJQ.a([CZ)V")
	public static final void method514(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method534(var3)) {
				var1 = true;
			} else if (var1) {
				if (method536(var3)) {
					var1 = false;
				}
			} else if (method537(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("UIPOGFJQ.a([CI)V")
	public static final void method515(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field1294.length - 1; var2 >= 0; var2--) {
				method524(field1294[var2], field1295[var2], arg0);
			}
		}
	}

	@ObfuscatedName("UIPOGFJQ.b([CZ)V")
	public static final void method516(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method524(var2, null, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method524(var4, null, var3);

		for (int var5 = field1296.length - 1; var5 >= 0; var5--) {
			method517(arg0, var1, var3, field1296[var5]);
		}
	}

	@ObfuscatedName("UIPOGFJQ.a(B[C[C[C[C)V")
	public static final void method517(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg3.length <= arg0.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg0.length - arg3.length; var5 += var8) {
				int var6 = var5;
				int var7 = 0;
				var8 = 1;
				while (var6 < arg0.length) {
					int var12;
					boolean var9 = false;
					char var10 = arg0[var6];
					char var11 = 0;
					if (var6 + 1 < arg0.length) {
						var11 = arg0[var6 + 1];
					}

					if (var7 < arg3.length && (var12 = method526(var10, arg3[var7], var11)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method526(var10, arg3[var7 - 1], var11)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg3.length || !method532(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg3.length) {
					boolean var14 = false;
					int var15 = method518(arg0, arg1, var5);
					int var16 = method519(var6 - 1, arg0, arg2);
					if (var15 > 2 || var16 > 2) {
						var14 = true;
					}

					if (var14) {
						for (int var17 = var5; var17 < var6; var17++) {
							arg0[var17] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("UIPOGFJQ.a([C[CII)I")
	public static final int method518(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}

		for (int var3 = arg2 - 1; var3 >= 0 && method532(arg0[var3]); var3--) {
			if (arg0[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg2 - 1; var5 >= 0 && method532(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method532(arg0[arg2 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("UIPOGFJQ.a(I[CI[C)I")
	public static final int method519(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg1.length && method532(arg1[var3])) {
			if (arg1[var3] != '.' && arg1[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg1.length && method532(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method532(arg1[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("UIPOGFJQ.a(I[C)V")
	public static final void method520(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method524(var2, null, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method524(var4, null, var3);

		for (int var5 = 0; var5 < field1297.length; var5++) {
			method521(field1297[var5], arg0, var3, field1298[var5], var1);
		}
	}

	@ObfuscatedName("UIPOGFJQ.a([C[C[CI[CB)V")
	public static final void method521(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
		if (arg0.length <= arg1.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg1.length - arg0.length; var6 += var9) {
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

					if (var8 < arg0.length && (var13 = method526(var11, arg0[var8], var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method526(var11, arg0[var8 - 1], var12)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg0.length || !method532(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg0.length) {
					boolean var15 = false;
					int var16 = method522(var6, arg1, arg4);
					int var17 = method523(var7 - 1, arg2, arg1);
					if (arg3 == 1 && var16 > 0 && var17 > 0) {
						var15 = true;
					}

					if (arg3 == 2 && (var16 > 2 && var17 > 0 || var16 > 0 && var17 > 2)) {
						var15 = true;
					}

					if (arg3 == 3 && var16 > 0 && var17 > 2) {
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
										if (arg4[var21] != '*') {
											break;
										}

										var18 = var21;
									} else if (arg4[var21] == '*') {
										var18 = var21;
										var20 = true;
									}
								}
							}

							boolean var22 = false;
							for (int var23 = var18 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (method532(arg1[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method532(arg1[var23])) {
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
							for (int var27 = var19 + 1; var27 < arg1.length; var27++) {
								if (var26) {
									if (method532(arg1[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method532(arg1[var27])) {
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

	@ObfuscatedName("UIPOGFJQ.a(I[C[CI)I")
	public static final int method522(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		int var3 = arg0 - 1;
		while (var3 >= 0 && method532(arg1[var3])) {
			if (arg1[var3] != ',' && arg1[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method532(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method532(arg1[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("UIPOGFJQ.a(II[C[C)I")
	public static final int method523(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg2.length && method532(arg2[var3])) {
			if (arg2[var3] != '\\' && arg2[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg2.length && method532(arg1[var5]); var5++) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method532(arg2[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("UIPOGFJQ.a([C[[B[CI)V")
	public static final void method524(char[] arg0, byte[][] arg1, char[] arg2) {
		if (arg0.length <= arg2.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg2.length - arg0.length; var4 += var8) {
				int var5 = var4;
				int var6 = 0;
				int var7 = 0;
				var8 = 1;
				boolean var9 = false;
				boolean var10 = false;
				boolean var11 = false;
				while (var5 < arg2.length && (!var10 || !var11)) {
					char var13;
					char var14;
					int var15;
					boolean var12 = false;
					var13 = arg2[var5];
					var14 = 0;
					if (var5 + 1 < arg2.length) {
						var14 = arg2[var5 + 1];
					}

					if (var6 < arg0.length && (var15 = method527(arg0[var6], var14, var13)) > 0) {
						if (var15 == 1 && method535(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method535(var13) || method535(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method527(arg0[var6 - 1], var14, var13)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg0.length || !method533(var13)) {
								break;
							}

							if (method532(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method535(var13)) {
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

						if (var4 - 1 < 0 || method532(arg2[var4 - 1]) && arg2[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg2.length || method532(arg2[var5]) && arg2[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method532(arg2[var25]) || arg2[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg2.length && (!method532(arg2[var25 + var27]) || arg2[var25 + var27] == '\''); var27++) {
										var26[var27] = arg2[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method532(arg2[var25 - 1]) || arg2[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method538(var26)) {
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
							var18 = arg2[var4 - 1];
						}

						char var19 = ' ';
						if (var5 < arg2.length) {
							var19 = arg2[var5];
						}

						byte var20 = method528(var18);
						byte var21 = method528(var19);
						if (arg1 != null && method525(var20, arg1, var21)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method535(arg2[var32])) {
								var29++;
							} else if (method534(arg2[var32])) {
								var30++;
								var31 = var32;
							}
						}

						if (var31 > -1) {
							var29 -= var5 - var31 - 1;
						}

						if (var29 <= var30) {
							for (int var33 = var4; var33 < var5; var33++) {
								arg2[var33] = '*';
							}
						} else {
							var8 = 1;
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("UIPOGFJQ.a(B[[BBI)Z")
	public static final boolean method525(byte arg0, byte[][] arg1, byte arg2) {
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

	@ObfuscatedName("UIPOGFJQ.a(ZCCC)I")
	public static final int method526(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("UIPOGFJQ.a(CCBC)I")
	public static final int method527(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("UIPOGFJQ.a(BC)B")
	public static final byte method528(char arg0) {
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

	@ObfuscatedName("UIPOGFJQ.a([CB)V")
	public static final void method529(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method530(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method532(arg0[var6]) && !method533(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method531(var7, arg0);
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

	@ObfuscatedName("UIPOGFJQ.a([CBI)I")
	public static final int method530(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("UIPOGFJQ.a(II[C)I")
	public static final int method531(int arg0, char[] arg1) {
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

	@ObfuscatedName("UIPOGFJQ.a(IC)Z")
	public static final boolean method532(char arg0) {
		if (!method534(arg0) && !method535(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UIPOGFJQ.b(IC)Z")
	public static final boolean method533(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("UIPOGFJQ.c(IC)Z")
	public static final boolean method534(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UIPOGFJQ.b(BC)Z")
	public static final boolean method535(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UIPOGFJQ.b(CI)Z")
	public static final boolean method536(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UIPOGFJQ.d(IC)Z")
	public static final boolean method537(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UIPOGFJQ.c([CZ)Z")
	public static final boolean method538(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method535(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method539(arg0);
		int var4 = 0;
		int var5 = field1293.length - 1;
		if (field1293[var4] != var3 && field1293[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field1293[var6] == var3) {
					return true;
				}

				if (var3 < field1293[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("UIPOGFJQ.b(I[C)I")
	public static final int method539(char[] arg0) {
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
