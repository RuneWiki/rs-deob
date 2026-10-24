package deob;

@ObfuscatedName("HBDSGKGH")
public final class HBDSGKGH {

	@ObfuscatedName("HBDSGKGH.q")
	public static final String[] field720 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("HBDSGKGH.k")
	public static int[] field714;

	@ObfuscatedName("HBDSGKGH.p")
	public static int[] field719;

	@ObfuscatedName("HBDSGKGH.l")
	public static char[][] field715;

	@ObfuscatedName("HBDSGKGH.n")
	public static char[][] field717;

	@ObfuscatedName("HBDSGKGH.o")
	public static char[][] field718;

	@ObfuscatedName("HBDSGKGH.m")
	public static byte[][][] field716;

	@ObfuscatedName("HBDSGKGH.a(LRPFMUSNN;)V")
	public static final void method248(RPFMUSNN arg0) {
		WNCFPLWV var1 = new WNCFPLWV(arg0.method414("fragmentsenc.txt", null));
		WNCFPLWV var2 = new WNCFPLWV(arg0.method414("badenc.txt", null));
		WNCFPLWV var3 = new WNCFPLWV(arg0.method414("domainenc.txt", null));
		WNCFPLWV var4 = new WNCFPLWV(arg0.method414("tldlist.txt", null));
		method249(var1, var2, var3, var4);
	}

	@ObfuscatedName("HBDSGKGH.a(LWNCFPLWV;LWNCFPLWV;LWNCFPLWV;LWNCFPLWV;)V")
	public static final void method249(WNCFPLWV arg0, WNCFPLWV arg1, WNCFPLWV arg2, WNCFPLWV arg3) {
		method251(arg1);
		method252(arg2);
		method253(arg0);
		method250(arg3);
	}

	@ObfuscatedName("HBDSGKGH.a(BLWNCFPLWV;)V")
	public static final void method250(WNCFPLWV arg0) {
		int var1 = arg0.method507();
		field718 = new char[var1][];
		field719 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field719[var2] = arg0.method502();
			char[] var3 = new char[arg0.method502()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method502();
			}

			field718[var2] = var3;
		}
	}

	@ObfuscatedName("HBDSGKGH.b(BLWNCFPLWV;)V")
	public static final void method251(WNCFPLWV arg0) {
		int var1 = arg0.method507();
		field715 = new char[var1][];
		field716 = new byte[var1][][];
		method254(field715, field716, arg0);
	}

	@ObfuscatedName("HBDSGKGH.a(LWNCFPLWV;I)V")
	public static final void method252(WNCFPLWV arg0) {
		int var1 = arg0.method507();
		field717 = new char[var1][];
		method255(field717, arg0);
	}

	@ObfuscatedName("HBDSGKGH.b(LWNCFPLWV;I)V")
	public static final void method253(WNCFPLWV arg0) {
		field714 = new int[arg0.method507()];
		for (int var1 = 0; var1 < field714.length; var1++) {
			field714[var1] = arg0.method504();
		}
	}

	@ObfuscatedName("HBDSGKGH.a(I[[C[[[BLWNCFPLWV;)V")
	public static final void method254(char[][] arg0, byte[][][] arg1, WNCFPLWV arg2) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char[] var4 = new char[arg2.method502()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg2.method502();
			}

			arg0[var3] = var4;
			byte[][] var6 = new byte[arg2.method502()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg2.method502();
				var6[var7][1] = (byte) arg2.method502();
			}

			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("HBDSGKGH.a(Z[[CLWNCFPLWV;)V")
	public static final void method255(char[][] arg0, WNCFPLWV arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char[] var3 = new char[arg1.method502()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg1.method502();
			}

			arg0[var2] = var3;
		}
	}

	@ObfuscatedName("HBDSGKGH.a(B[C)V")
	public static final void method256(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method257(arg0[var2])) {
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

	@ObfuscatedName("HBDSGKGH.a(ZC)Z")
	public static final boolean method257(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("HBDSGKGH.a(Ljava/lang/String;Z)Ljava/lang/String;")
	public static final String method258(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method256(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method266(var5);
		method261(var5);
		method262(var5);
		method275(var5);

		for (int var7 = 0; var7 < field720.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field720[var7], var8 + 1)) != -1) {
				char[] var9 = field720[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method259(var4.toCharArray(), var5);
		method260(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("HBDSGKGH.a([CI[C)V")
	public static final void method259(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg1[var2] != '*' && method283(arg0[var2])) {
				arg1[var2] = arg0[var2];
			}
		}
	}

	@ObfuscatedName("HBDSGKGH.a(I[C)V")
	public static final void method260(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method280(var3)) {
				var1 = true;
			} else if (var1) {
				if (method282(var3)) {
					var1 = false;
				}
			} else if (method283(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("HBDSGKGH.b(B[C)V")
	public static final void method261(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field715.length - 1; var2 >= 0; var2--) {
				method270(field715[var2], field716[var2], arg0);
			}
		}
	}

	@ObfuscatedName("HBDSGKGH.b(I[C)V")
	public static final void method262(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method270(var2, null, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method270(var4, null, var3);

		for (int var5 = field717.length - 1; var5 >= 0; var5--) {
			method263(var3, arg0, field717[var5], var1);
		}
	}

	@ObfuscatedName("HBDSGKGH.a([C[CB[C[C)V")
	public static final void method263(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg2.length <= arg1.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg1.length - arg2.length; var5 += var8) {
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

					if (var7 < arg2.length && (var12 = method272(arg2[var7], var11, var10)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method272(arg2[var7 - 1], var11, var10)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg2.length || !method278(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg2.length) {
					boolean var14 = false;
					int var15 = method264(arg3, var5, arg1);
					int var16 = method265(var6 - 1, arg1, arg0);
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

	@ObfuscatedName("HBDSGKGH.a([CBI[C)I")
	public static final int method264(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		for (int var3 = arg1 - 1; var3 >= 0 && method278(arg2[var3]); var3--) {
			if (arg2[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method278(arg0[var5]); var5--) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method278(arg2[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("HBDSGKGH.a(I[C[CI)I")
	public static final int method265(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg1.length && method278(arg1[var3])) {
			if (arg1[var3] != '.' && arg1[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg1.length && method278(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method278(arg1[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("HBDSGKGH.a([CI)V")
	public static final void method266(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method270(var2, null, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method270(var4, null, var3);

		for (int var5 = 0; var5 < field718.length; var5++) {
			method267(field718[var5], var3, field719[var5], arg0, var1);
		}
	}

	@ObfuscatedName("HBDSGKGH.a([C[CBI[C[C)V")
	public static final void method267(char[] arg0, char[] arg1, int arg2, char[] arg3, char[] arg4) {
		if (arg0.length <= arg3.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg3.length - arg0.length; var6 += var9) {
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

					if (var8 < arg0.length && (var13 = method272(arg0[var8], var12, var11)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method272(arg0[var8 - 1], var12, var11)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg0.length || !method278(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg0.length) {
					boolean var15 = false;
					int var16 = method268(var6, arg3, arg4);
					int var17 = method269(arg1, arg3, var7 - 1);
					if (arg2 == 1 && var16 > 0 && var17 > 0) {
						var15 = true;
					}

					if (arg2 == 2 && (var16 > 2 && var17 > 0 || var16 > 0 && var17 > 2)) {
						var15 = true;
					}

					if (arg2 == 3 && var16 > 0 && var17 > 2) {
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
									if (method278(arg3[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method278(arg3[var23])) {
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
									if (method278(arg3[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method278(arg3[var27])) {
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

	@ObfuscatedName("HBDSGKGH.a(IB[C[C)I")
	public static final int method268(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		int var3 = arg0 - 1;
		while (var3 >= 0 && method278(arg1[var3])) {
			if (arg1[var3] != ',' && arg1[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method278(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method278(arg1[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("HBDSGKGH.a([CB[CI)I")
	public static final int method269(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg2 + 1;
		while (var3 < arg1.length && method278(arg1[var3])) {
			if (arg1[var3] != '\\' && arg1[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 + 1; var5 < arg1.length && method278(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method278(arg1[arg2 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("HBDSGKGH.a([C[[B[CI)V")
	public static final void method270(char[] arg0, byte[][] arg1, char[] arg2) {
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

					if (var6 < arg0.length && (var15 = method273(arg0[var6], var13, var14)) > 0) {
						if (var15 == 1 && method281(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method281(var13) || method281(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method273(arg0[var6 - 1], var13, var14)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg0.length || !method279(var13)) {
								break;
							}

							if (method278(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method281(var13)) {
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

						if (var4 - 1 < 0 || method278(arg2[var4 - 1]) && arg2[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg2.length || method278(arg2[var5]) && arg2[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method278(arg2[var25]) || arg2[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg2.length && (!method278(arg2[var25 + var27]) || arg2[var25 + var27] == '\''); var27++) {
										var26[var27] = arg2[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method278(arg2[var25 - 1]) || arg2[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method284(var26)) {
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

						byte var20 = method274(var18);
						byte var21 = method274(var19);
						if (arg1 != null && method271(var21, arg1, var20)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method281(arg2[var32])) {
								var29++;
							} else if (method280(arg2[var32])) {
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

	@ObfuscatedName("HBDSGKGH.a(BB[[BB)Z")
	public static final boolean method271(byte arg0, byte[][] arg1, byte arg2) {
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

	@ObfuscatedName("HBDSGKGH.a(CCIC)I")
	public static final int method272(char arg0, char arg1, char arg2) {
		if (arg0 == arg2) {
			return 1;
		}

		if (arg0 == 'o' && arg2 == '0') {
			return 1;
		}

		if (arg0 == 'o' && arg2 == '(' && arg1 == ')') {
			return 2;
		}

		if (arg0 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
			return 1;
		}

		if (arg0 == 'e' && arg2 == '€') {
			return 1;
		}

		if (arg0 == 's' && arg2 == '$') {
			return 1;
		}

		if (arg0 == 'l' && arg2 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("HBDSGKGH.b(CCIC)I")
	public static final int method273(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("HBDSGKGH.b(ZC)B")
	public static final byte method274(char arg0) {
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

	@ObfuscatedName("HBDSGKGH.a([CB)V")
	public static final void method275(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method276(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method278(arg0[var6]) && !method279(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method277(arg0, var7);
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

	@ObfuscatedName("HBDSGKGH.a(I[CI)I")
	public static final int method276(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("HBDSGKGH.a([CIB)I")
	public static final int method277(char[] arg0, int arg1) {
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

	@ObfuscatedName("HBDSGKGH.c(ZC)Z")
	public static final boolean method278(char arg0) {
		if (!method280(arg0) && !method281(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("HBDSGKGH.a(CZ)Z")
	public static final boolean method279(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("HBDSGKGH.a(BC)Z")
	public static final boolean method280(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("HBDSGKGH.b(CZ)Z")
	public static final boolean method281(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("HBDSGKGH.a(CI)Z")
	public static final boolean method282(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("HBDSGKGH.a(IC)Z")
	public static final boolean method283(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("HBDSGKGH.c(I[C)Z")
	public static final boolean method284(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method281(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method285(arg0);
		int var4 = 0;
		int var5 = field714.length - 1;
		if (field714[var4] != var3 && field714[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field714[var6] == var3) {
					return true;
				}

				if (var3 < field714[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("HBDSGKGH.b([CI)I")
	public static final int method285(char[] arg0) {
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
