package deob;

@ObfuscatedName("UCQYJOHJ")
public final class UCQYJOHJ {

	@ObfuscatedName("UCQYJOHJ.t")
	public static final String[] field1421 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("UCQYJOHJ.n")
	public static int[] field1415;

	@ObfuscatedName("UCQYJOHJ.s")
	public static int[] field1420;

	@ObfuscatedName("UCQYJOHJ.o")
	public static char[][] field1416;

	@ObfuscatedName("UCQYJOHJ.q")
	public static char[][] field1418;

	@ObfuscatedName("UCQYJOHJ.r")
	public static char[][] field1419;

	@ObfuscatedName("UCQYJOHJ.p")
	public static byte[][][] field1417;

	@ObfuscatedName("UCQYJOHJ.a(LESUFCMYV;)V")
	public static final void method514(ESUFCMYV arg0) {
		RGCGKKUR var1 = new RGCGKKUR(arg0.method205("fragmentsenc.txt", null));
		RGCGKKUR var2 = new RGCGKKUR(arg0.method205("badenc.txt", null));
		RGCGKKUR var3 = new RGCGKKUR(arg0.method205("domainenc.txt", null));
		RGCGKKUR var4 = new RGCGKKUR(arg0.method205("tldlist.txt", null));
		method515(var1, var2, var3, var4);
	}

	@ObfuscatedName("UCQYJOHJ.a(LRGCGKKUR;LRGCGKKUR;LRGCGKKUR;LRGCGKKUR;)V")
	public static final void method515(RGCGKKUR arg0, RGCGKKUR arg1, RGCGKKUR arg2, RGCGKKUR arg3) {
		method517(arg1);
		method518(arg2);
		method519(arg0);
		method516(arg3);
	}

	@ObfuscatedName("UCQYJOHJ.a(LRGCGKKUR;I)V")
	public static final void method516(RGCGKKUR arg0) {
		int var1 = arg0.method460();
		field1419 = new char[var1][];
		field1420 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field1420[var2] = arg0.method455();
			char[] var3 = new char[arg0.method455()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method455();
			}

			field1419[var2] = var3;
		}
	}

	@ObfuscatedName("UCQYJOHJ.a(ZLRGCGKKUR;)V")
	public static final void method517(RGCGKKUR arg0) {
		int var1 = arg0.method460();
		field1416 = new char[var1][];
		field1417 = new byte[var1][][];
		method520(arg0, field1417, field1416);
	}

	@ObfuscatedName("UCQYJOHJ.a(LRGCGKKUR;Z)V")
	public static final void method518(RGCGKKUR arg0) {
		int var1 = arg0.method460();
		field1418 = new char[var1][];
		method521(arg0, field1418);
	}

	@ObfuscatedName("UCQYJOHJ.b(ZLRGCGKKUR;)V")
	public static final void method519(RGCGKKUR arg0) {
		field1415 = new int[arg0.method460()];
		for (int var1 = 0; var1 < field1415.length; var1++) {
			field1415[var1] = arg0.method457();
		}
	}

	@ObfuscatedName("UCQYJOHJ.a(ZLRGCGKKUR;[[[B[[C)V")
	public static final void method520(RGCGKKUR arg0, byte[][][] arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var4 = new char[arg0.method455()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.method455();
			}

			arg2[var3] = var4;
			byte[][] var6 = new byte[arg0.method455()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg0.method455();
				var6[var7][1] = (byte) arg0.method455();
			}

			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("UCQYJOHJ.a(ILRGCGKKUR;[[C)V")
	public static final void method521(RGCGKKUR arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method455()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method455();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("UCQYJOHJ.a(I[C)V")
	public static final void method522(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method523(arg0[var2])) {
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

	@ObfuscatedName("UCQYJOHJ.a(ZC)Z")
	public static final boolean method523(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("UCQYJOHJ.a(Ljava/lang/String;Z)Ljava/lang/String;")
	public static final String method524(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method522(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method532(var5);
		method527(var5);
		method528(var5);
		method541(var5);

		for (int var7 = 0; var7 < field1421.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field1421[var7], var8 + 1)) != -1) {
				char[] var9 = field1421[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method525(var5, var4.toCharArray());
		method526(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("UCQYJOHJ.a(Z[C[C)V")
	public static final void method525(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method549(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("UCQYJOHJ.a(B[C)V")
	public static final void method526(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method546(var3)) {
				var1 = true;
			} else if (var1) {
				if (method548(var3)) {
					var1 = false;
				}
			} else if (method549(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("UCQYJOHJ.a([CB)V")
	public static final void method527(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field1416.length - 1; var2 >= 0; var2--) {
				method536(field1416[var2], field1417[var2], arg0);
			}
		}
	}

	@ObfuscatedName("UCQYJOHJ.b(B[C)V")
	public static final void method528(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method536(var2, null, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method536(var4, null, var3);

		for (int var5 = field1418.length - 1; var5 >= 0; var5--) {
			method529(field1418[var5], arg0, var1, var3);
		}
	}

	@ObfuscatedName("UCQYJOHJ.a([CB[C[C[C)V")
	public static final void method529(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
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

					if (var7 < arg0.length && (var12 = method538(arg0[var7], var10, var11)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method538(arg0[var7 - 1], var10, var11)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg0.length || !method544(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg0.length) {
					boolean var14 = false;
					int var15 = method530(arg1, var5, arg2);
					int var16 = method531(var6 - 1, arg3, arg1);
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

	@ObfuscatedName("UCQYJOHJ.a([CI[CI)I")
	public static final int method530(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		for (int var3 = arg1 - 1; var3 >= 0 && method544(arg0[var3]); var3--) {
			if (arg0[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method544(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method544(arg0[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("UCQYJOHJ.a(I[C[CB)I")
	public static final int method531(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg2.length && method544(arg2[var3])) {
			if (arg2[var3] != '.' && arg2[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg2.length && method544(arg1[var5]); var5++) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method544(arg2[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("UCQYJOHJ.a([CZ)V")
	public static final void method532(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method536(var2, null, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method536(var4, null, var3);

		for (int var5 = 0; var5 < field1419.length; var5++) {
			method533(var3, var1, arg0, field1420[var5], field1419[var5]);
		}
	}

	@ObfuscatedName("UCQYJOHJ.a(B[C[C[CI[C)V")
	public static final void method533(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
		if (arg4.length <= arg2.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg2.length - arg4.length; var6 += var9) {
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

					if (var8 < arg4.length && (var13 = method538(arg4[var8], var11, var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method538(arg4[var8 - 1], var11, var12)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg4.length || !method544(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg4.length) {
					boolean var15 = false;
					int var16 = method534(arg2, arg1, var6);
					int var17 = method535(arg0, arg2, var7 - 1);
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
									if (method544(arg2[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method544(arg2[var23])) {
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
							for (int var27 = var19 + 1; var27 < arg2.length; var27++) {
								if (var26) {
									if (method544(arg2[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method544(arg2[var27])) {
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

	@ObfuscatedName("UCQYJOHJ.a([C[CII)I")
	public static final int method534(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}

		int var3 = arg2 - 1;
		while (var3 >= 0 && method544(arg0[var3])) {
			if (arg0[var3] != ',' && arg0[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 - 1; var5 >= 0 && method544(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method544(arg0[arg2 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("UCQYJOHJ.a([CB[CI)I")
	public static final int method535(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg2 + 1;
		while (var3 < arg1.length && method544(arg1[var3])) {
			if (arg1[var3] != '\\' && arg1[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 + 1; var5 < arg1.length && method544(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method544(arg1[arg2 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("UCQYJOHJ.a(I[C[[B[C)V")
	public static final void method536(char[] arg0, byte[][] arg1, char[] arg2) {
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

					if (var6 < arg0.length && (var15 = method539(var13, arg0[var6], var14)) > 0) {
						if (var15 == 1 && method547(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method547(var13) || method547(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method539(var13, arg0[var6 - 1], var14)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg0.length || !method545(var13)) {
								break;
							}

							if (method544(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method547(var13)) {
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

						if (var4 - 1 < 0 || method544(arg2[var4 - 1]) && arg2[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg2.length || method544(arg2[var5]) && arg2[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method544(arg2[var25]) || arg2[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg2.length && (!method544(arg2[var25 + var27]) || arg2[var25 + var27] == '\''); var27++) {
										var26[var27] = arg2[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method544(arg2[var25 - 1]) || arg2[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method550(var26)) {
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

						byte var20 = method540(var18);
						byte var21 = method540(var19);
						if (arg1 != null && method537(var20, var21, arg1)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method547(arg2[var32])) {
								var29++;
							} else if (method546(arg2[var32])) {
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

	@ObfuscatedName("UCQYJOHJ.a(BB[[BZ)Z")
	public static final boolean method537(byte arg0, byte arg1, byte[][] arg2) {
		int var3 = 0;
		if (arg2[var3][0] == arg0 && arg2[var3][1] == arg1) {
			return true;
		}

		int var4 = arg2.length - 1;
		if (arg2[var4][0] == arg0 && arg2[var4][1] == arg1) {
			return true;
		}

		do {
			int var5 = (var3 + var4) / 2;
			if (arg2[var5][0] == arg0 && arg2[var5][1] == arg1) {
				return true;
			}

			if (arg0 < arg2[var5][0] || arg2[var5][0] == arg0 && arg1 < arg2[var5][1]) {
				var4 = var5;
			} else {
				var3 = var5;
			}
		} while (var3 != var4 && var3 + 1 != var4);

		return false;
	}

	@ObfuscatedName("UCQYJOHJ.a(CCBC)I")
	public static final int method538(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("UCQYJOHJ.a(CCCI)I")
	public static final int method539(char arg0, char arg1, char arg2) {
		if (arg0 == arg1) {
			return 1;
		}

		if (arg1 >= 'a' && arg1 <= 'm') {
			if (arg1 == 'a') {
				if (arg0 != '4' && arg0 != '@' && arg0 != '^') {
					if (arg0 == '/' && arg2 == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg1 == 'b') {
				if (arg0 != '6' && arg0 != '8') {
					if ((arg0 != '1' || arg2 != '3') && (arg0 != 'i' || arg2 != '3')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg1 == 'c') {
				if (arg0 != '(' && arg0 != '<' && arg0 != '{' && arg0 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'd') {
				if ((arg0 != '[' || arg2 != ')') && (arg0 != 'i' || arg2 != ')')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'e') {
				if (arg0 != '3' && arg0 != '€') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'f') {
				if (arg0 == 'p' && arg2 == 'h') {
					return 2;
				}

				if (arg0 == '£') {
					return 1;
				}

				return 0;
			}

			if (arg1 == 'g') {
				if (arg0 != '9' && arg0 != '6' && arg0 != 'q') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'h') {
				if (arg0 == '#') {
					return 1;
				}

				return 0;
			}

			if (arg1 == 'i') {
				if (arg0 != 'y' && arg0 != 'l' && arg0 != 'j' && arg0 != '1' && arg0 != '!' && arg0 != ':' && arg0 != ';' && arg0 != '|') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'j') {
				return 0;
			}

			if (arg1 == 'k') {
				return 0;
			}

			if (arg1 == 'l') {
				if (arg0 != '1' && arg0 != '|' && arg0 != 'i') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'm') {
				return 0;
			}
		}

		if (arg1 >= 'n' && arg1 <= 'z') {
			if (arg1 == 'n') {
				return 0;
			}

			if (arg1 == 'o') {
				if (arg0 != '0' && arg0 != '*') {
					if ((arg0 != '(' || arg2 != ')') && (arg0 != '[' || arg2 != ']') && (arg0 != '{' || arg2 != '}') && (arg0 != '<' || arg2 != '>')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg1 == 'p') {
				return 0;
			}

			if (arg1 == 'q') {
				return 0;
			}

			if (arg1 == 'r') {
				return 0;
			}

			if (arg1 == 's') {
				if (arg0 != '5' && arg0 != 'z' && arg0 != '$' && arg0 != '2') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 't') {
				if (arg0 != '7' && arg0 != '+') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'u') {
				if (arg0 == 'v') {
					return 1;
				}

				if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'v') {
				if ((arg0 != '\\' || arg2 != '/') && (arg0 != '\\' || arg2 != '|') && (arg0 != '|' || arg2 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'w') {
				if (arg0 == 'v' && arg2 == 'v') {
					return 2;
				}

				return 0;
			}

			if (arg1 == 'x') {
				if ((arg0 != ')' || arg2 != '(') && (arg0 != '}' || arg2 != '{') && (arg0 != ']' || arg2 != '[') && (arg0 != '>' || arg2 != '<')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'y') {
				return 0;
			}

			if (arg1 == 'z') {
				return 0;
			}
		}

		if (arg1 >= '0' && arg1 <= '9') {
			if (arg1 != '0') {
				if (arg1 == '1') {
					if (arg0 == 'l') {
						return 1;
					}

					return 0;
				}

				return 0;
			}

			if (arg0 != 'o' && arg0 != 'O') {
				if ((arg0 != '(' || arg2 != ')') && (arg0 != '{' || arg2 != '}') && (arg0 != '[' || arg2 != ']')) {
					return 0;
				}

				return 2;
			}

			return 1;
		}

		if (arg1 == ',') {
			if (arg0 == '.') {
				return 1;
			}

			return 0;
		}

		if (arg1 == '.') {
			if (arg0 == ',') {
				return 1;
			}

			return 0;
		}

		if (arg1 == '!') {
			if (arg0 == 'i') {
				return 1;
			}

			return 0;
		}

		return 0;
	}

	@ObfuscatedName("UCQYJOHJ.a(IC)B")
	public static final byte method540(char arg0) {
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

	@ObfuscatedName("UCQYJOHJ.a([CI)V")
	public static final void method541(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method542(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method544(arg0[var6]) && !method545(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method543(var7, arg0);
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

	@ObfuscatedName("UCQYJOHJ.a([CIZ)I")
	public static final int method542(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("UCQYJOHJ.a(BI[C)I")
	public static final int method543(int arg0, char[] arg1) {
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

	@ObfuscatedName("UCQYJOHJ.b(IC)Z")
	public static final boolean method544(char arg0) {
		if (!method546(arg0) && !method547(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UCQYJOHJ.a(CI)Z")
	public static final boolean method545(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("UCQYJOHJ.c(IC)Z")
	public static final boolean method546(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UCQYJOHJ.a(CZ)Z")
	public static final boolean method547(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UCQYJOHJ.d(IC)Z")
	public static final boolean method548(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UCQYJOHJ.b(ZC)Z")
	public static final boolean method549(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UCQYJOHJ.b([CB)Z")
	public static final boolean method550(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method547(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method551(arg0);
		int var4 = 0;
		int var5 = field1415.length - 1;
		if (field1415[var4] != var3 && field1415[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field1415[var6] == var3) {
					return true;
				}

				if (var3 < field1415[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("UCQYJOHJ.b([CI)I")
	public static final int method551(char[] arg0) {
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
