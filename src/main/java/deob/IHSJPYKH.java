package deob;

@ObfuscatedName("IHSJPYKH")
public final class IHSJPYKH {

	@ObfuscatedName("IHSJPYKH.u")
	public static final String[] field832 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("IHSJPYKH.o")
	public static int[] field826;

	@ObfuscatedName("IHSJPYKH.t")
	public static int[] field831;

	@ObfuscatedName("IHSJPYKH.p")
	public static char[][] field827;

	@ObfuscatedName("IHSJPYKH.r")
	public static char[][] field829;

	@ObfuscatedName("IHSJPYKH.s")
	public static char[][] field830;

	@ObfuscatedName("IHSJPYKH.q")
	public static byte[][][] field828;

	@ObfuscatedName("IHSJPYKH.a(LJUPFHAZZ;)V")
	public static final void method271(JUPFHAZZ arg0) {
		TKPFKOXP var1 = new TKPFKOXP(arg0.method372("fragmentsenc.txt", null));
		TKPFKOXP var2 = new TKPFKOXP(arg0.method372("badenc.txt", null));
		TKPFKOXP var3 = new TKPFKOXP(arg0.method372("domainenc.txt", null));
		TKPFKOXP var4 = new TKPFKOXP(arg0.method372("tldlist.txt", null));
		method272(var1, var2, var3, var4);
	}

	@ObfuscatedName("IHSJPYKH.a(LTKPFKOXP;LTKPFKOXP;LTKPFKOXP;LTKPFKOXP;)V")
	public static final void method272(TKPFKOXP arg0, TKPFKOXP arg1, TKPFKOXP arg2, TKPFKOXP arg3) {
		method274(arg1);
		method275(arg2);
		method276(arg0);
		method273(arg3);
	}

	@ObfuscatedName("IHSJPYKH.a(LTKPFKOXP;I)V")
	public static final void method273(TKPFKOXP arg0) {
		int var1 = arg0.method534();
		field830 = new char[var1][];
		field831 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field831[var2] = arg0.method529();
			char[] var3 = new char[arg0.method529()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method529();
			}

			field830[var2] = var3;
		}
	}

	@ObfuscatedName("IHSJPYKH.a(ZLTKPFKOXP;)V")
	public static final void method274(TKPFKOXP arg0) {
		int var1 = arg0.method534();
		field827 = new char[var1][];
		field828 = new byte[var1][][];
		method277(field827, arg0, field828);
	}

	@ObfuscatedName("IHSJPYKH.b(LTKPFKOXP;I)V")
	public static final void method275(TKPFKOXP arg0) {
		int var1 = arg0.method534();
		field829 = new char[var1][];
		method278(arg0, field829);
	}

	@ObfuscatedName("IHSJPYKH.c(LTKPFKOXP;I)V")
	public static final void method276(TKPFKOXP arg0) {
		field826 = new int[arg0.method534()];
		for (int var1 = 0; var1 < field826.length; var1++) {
			field826[var1] = arg0.method531();
		}
	}

	@ObfuscatedName("IHSJPYKH.a([[CZLTKPFKOXP;[[[B)V")
	public static final void method277(char[][] arg0, TKPFKOXP arg1, byte[][][] arg2) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char[] var4 = new char[arg1.method529()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg1.method529();
			}

			arg0[var3] = var4;
			byte[][] var6 = new byte[arg1.method529()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg1.method529();
				var6[var7][1] = (byte) arg1.method529();
			}

			if (var6.length > 0) {
				arg2[var3] = var6;
			}
		}
	}

	@ObfuscatedName("IHSJPYKH.a(ILTKPFKOXP;[[C)V")
	public static final void method278(TKPFKOXP arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method529()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method529();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("IHSJPYKH.a([CZ)V")
	public static final void method279(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method280(arg0[var2])) {
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

	@ObfuscatedName("IHSJPYKH.a(CB)Z")
	public static final boolean method280(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("IHSJPYKH.a(Ljava/lang/String;Z)Ljava/lang/String;")
	public static final String method281(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method279(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method289(var5);
		method284(var5);
		method285(var5);
		method298(var5);

		for (int var7 = 0; var7 < field832.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field832[var7], var8 + 1)) != -1) {
				char[] var9 = field832[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method282(var5, var4.toCharArray());
		method283(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("IHSJPYKH.a([C[CI)V")
	public static final void method282(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method306(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("IHSJPYKH.a(I[C)V")
	public static final void method283(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method303(var3)) {
				var1 = true;
			} else if (var1) {
				if (method305(var3)) {
					var1 = false;
				}
			} else if (method306(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("IHSJPYKH.a([CI)V")
	public static final void method284(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field827.length - 1; var2 >= 0; var2--) {
				method293(arg0, field828[var2], field827[var2]);
			}
		}
	}

	@ObfuscatedName("IHSJPYKH.b([CI)V")
	public static final void method285(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method293(var1, null, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method293(var3, null, var4);

		for (int var5 = field829.length - 1; var5 >= 0; var5--) {
			method286(field829[var5], var3, arg0, var1);
		}
	}

	@ObfuscatedName("IHSJPYKH.a(Z[C[C[C[C)V")
	public static final void method286(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg0.length <= arg2.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg2.length - arg0.length; var5 += var8) {
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

					if (var7 < arg0.length && (var12 = method295(var11, var10, arg0[var7])) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method295(var11, var10, arg0[var7 - 1])) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg0.length || !method301(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg0.length) {
					boolean var14 = false;
					int var15 = method287(var5, arg2, arg3);
					int var16 = method288(arg1, arg2, var6 - 1);
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

	@ObfuscatedName("IHSJPYKH.a(IZ[C[C)I")
	public static final int method287(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		for (int var3 = arg0 - 1; var3 >= 0 && method301(arg1[var3]); var3--) {
			if (arg1[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method301(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method301(arg1[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IHSJPYKH.a([C[CII)I")
	public static final int method288(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg2 + 1;
		while (var3 < arg1.length && method301(arg1[var3])) {
			if (arg1[var3] != '.' && arg1[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 + 1; var5 < arg1.length && method301(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method301(arg1[arg2 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IHSJPYKH.c([CI)V")
	public static final void method289(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method293(var1, null, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method293(var3, null, var4);

		for (int var5 = 0; var5 < field830.length; var5++) {
			method290(var1, field830[var5], var3, field831[var5], arg0);
		}
	}

	@ObfuscatedName("IHSJPYKH.a([C[C[CIB[C)V")
	public static final void method290(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
		if (arg1.length <= arg4.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg4.length - arg1.length; var6 += var9) {
				int var7 = var6;
				int var8 = 0;
				var9 = 1;
				while (var7 < arg4.length) {
					int var13;
					boolean var10 = false;
					char var11 = arg4[var7];
					char var12 = 0;
					if (var7 + 1 < arg4.length) {
						var12 = arg4[var7 + 1];
					}

					if (var8 < arg1.length && (var13 = method295(var12, var11, arg1[var8])) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method295(var12, var11, arg1[var8 - 1])) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg1.length || !method301(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg1.length) {
					boolean var15 = false;
					int var16 = method291(var6, arg4, arg0);
					int var17 = method292(var7 - 1, arg4, arg2);
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
										if (arg0[var21] != '*') {
											break;
										}

										var18 = var21;
									} else if (arg0[var21] == '*') {
										var18 = var21;
										var20 = true;
									}
								}
							}

							boolean var22 = false;
							for (int var23 = var18 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (method301(arg4[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method301(arg4[var23])) {
									var22 = true;
									var18 = var23;
								}
							}
						}

						if (var17 > 2) {
							if (var17 == 4) {
								boolean var24 = false;
								for (int var25 = var19 + 1; var25 < arg4.length; var25++) {
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
							for (int var27 = var19 + 1; var27 < arg4.length; var27++) {
								if (var26) {
									if (method301(arg4[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method301(arg4[var27])) {
									var26 = true;
									var19 = var27;
								}
							}
						}

						for (int var28 = var18; var28 <= var19; var28++) {
							arg4[var28] = '*';
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("IHSJPYKH.a(IB[C[C)I")
	public static final int method291(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		int var3 = arg0 - 1;
		while (var3 >= 0 && method301(arg1[var3])) {
			if (arg1[var3] != ',' && arg1[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method301(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method301(arg1[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IHSJPYKH.a(I[CI[C)I")
	public static final int method292(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg1.length && method301(arg1[var3])) {
			if (arg1[var3] != '\\' && arg1[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg1.length && method301(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method301(arg1[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IHSJPYKH.a([CB[[B[C)V")
	public static final void method293(char[] arg0, byte[][] arg1, char[] arg2) {
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

					if (var6 < arg2.length && (var15 = method296(arg2[var6], var14, var13)) > 0) {
						if (var15 == 1 && method304(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method304(var13) || method304(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method296(arg2[var6 - 1], var14, var13)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg2.length || !method302(var13)) {
								break;
							}

							if (method301(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method304(var13)) {
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

						if (var4 - 1 < 0 || method301(arg0[var4 - 1]) && arg0[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg0.length || method301(arg0[var5]) && arg0[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method301(arg0[var25]) || arg0[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg0.length && (!method301(arg0[var25 + var27]) || arg0[var25 + var27] == '\''); var27++) {
										var26[var27] = arg0[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method301(arg0[var25 - 1]) || arg0[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method307(var26)) {
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

						byte var20 = method297(var18);
						byte var21 = method297(var19);
						if (arg1 != null && method294(var20, arg1, var21)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method304(arg0[var32])) {
								var29++;
							} else if (method303(arg0[var32])) {
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

	@ObfuscatedName("IHSJPYKH.a(B[[BBI)Z")
	public static final boolean method294(byte arg0, byte[][] arg1, byte arg2) {
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

	@ObfuscatedName("IHSJPYKH.a(CCIC)I")
	public static final int method295(char arg0, char arg1, char arg2) {
		if (arg1 == arg2) {
			return 1;
		}

		if (arg2 == 'o' && arg1 == '0') {
			return 1;
		}

		if (arg2 == 'o' && arg1 == '(' && arg0 == ')') {
			return 2;
		}

		if (arg2 == 'c' && (arg1 == '(' || arg1 == '<' || arg1 == '[')) {
			return 1;
		}

		if (arg2 == 'e' && arg1 == '€') {
			return 1;
		}

		if (arg2 == 's' && arg1 == '$') {
			return 1;
		}

		if (arg2 == 'l' && arg1 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IHSJPYKH.a(ICCC)I")
	public static final int method296(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("IHSJPYKH.a(BC)B")
	public static final byte method297(char arg0) {
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

	@ObfuscatedName("IHSJPYKH.a(Z[C)V")
	public static final void method298(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method299(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method301(arg0[var6]) && !method302(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method300(var7, arg0);
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

	@ObfuscatedName("IHSJPYKH.a([CBI)I")
	public static final int method299(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("IHSJPYKH.a(II[C)I")
	public static final int method300(int arg0, char[] arg1) {
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

	@ObfuscatedName("IHSJPYKH.a(IC)Z")
	public static final boolean method301(char arg0) {
		if (!method303(arg0) && !method304(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IHSJPYKH.b(CB)Z")
	public static final boolean method302(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("IHSJPYKH.a(CI)Z")
	public static final boolean method303(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IHSJPYKH.b(IC)Z")
	public static final boolean method304(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IHSJPYKH.b(CI)Z")
	public static final boolean method305(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IHSJPYKH.a(CZ)Z")
	public static final boolean method306(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IHSJPYKH.b([CZ)Z")
	public static final boolean method307(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method304(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method308(arg0);
		int var4 = 0;
		int var5 = field826.length - 1;
		if (field826[var4] != var3 && field826[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field826[var6] == var3) {
					return true;
				}

				if (var3 < field826[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("IHSJPYKH.d([CI)I")
	public static final int method308(char[] arg0) {
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
