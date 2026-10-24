package deob;

@ObfuscatedName("EZWZJZNN")
public final class EZWZJZNN {

	@ObfuscatedName("EZWZJZNN.n")
	public static final String[] field607 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("EZWZJZNN.h")
	public static int[] field601;

	@ObfuscatedName("EZWZJZNN.m")
	public static int[] field606;

	@ObfuscatedName("EZWZJZNN.i")
	public static char[][] field602;

	@ObfuscatedName("EZWZJZNN.k")
	public static char[][] field604;

	@ObfuscatedName("EZWZJZNN.l")
	public static char[][] field605;

	@ObfuscatedName("EZWZJZNN.j")
	public static byte[][][] field603;

	@ObfuscatedName("EZWZJZNN.a(LQKFGLETG;)V")
	public static final void method206(QKFGLETG arg0) {
		XJCNBMKS var1 = new XJCNBMKS(arg0.method402("fragmentsenc.txt", null));
		XJCNBMKS var2 = new XJCNBMKS(arg0.method402("badenc.txt", null));
		XJCNBMKS var3 = new XJCNBMKS(arg0.method402("domainenc.txt", null));
		XJCNBMKS var4 = new XJCNBMKS(arg0.method402("tldlist.txt", null));
		method207(var1, var2, var3, var4);
	}

	@ObfuscatedName("EZWZJZNN.a(LXJCNBMKS;LXJCNBMKS;LXJCNBMKS;LXJCNBMKS;)V")
	public static final void method207(XJCNBMKS arg0, XJCNBMKS arg1, XJCNBMKS arg2, XJCNBMKS arg3) {
		method209(arg1);
		method210(arg2);
		method211(arg0);
		method208(arg3);
	}

	@ObfuscatedName("EZWZJZNN.a(ILXJCNBMKS;)V")
	public static final void method208(XJCNBMKS arg0) {
		int var1 = arg0.method539();
		field605 = new char[var1][];
		field606 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field606[var2] = arg0.method534();
			char[] var3 = new char[arg0.method534()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method534();
			}

			field605[var2] = var3;
		}
	}

	@ObfuscatedName("EZWZJZNN.a(ZLXJCNBMKS;)V")
	public static final void method209(XJCNBMKS arg0) {
		int var1 = arg0.method539();
		field602 = new char[var1][];
		field603 = new byte[var1][][];
		method212(field602, arg0, field603);
	}

	@ObfuscatedName("EZWZJZNN.b(ILXJCNBMKS;)V")
	public static final void method210(XJCNBMKS arg0) {
		int var1 = arg0.method539();
		field604 = new char[var1][];
		method213(field604, arg0);
	}

	@ObfuscatedName("EZWZJZNN.b(ZLXJCNBMKS;)V")
	public static final void method211(XJCNBMKS arg0) {
		field601 = new int[arg0.method539()];
		for (int var1 = 0; var1 < field601.length; var1++) {
			field601[var1] = arg0.method536();
		}
	}

	@ObfuscatedName("EZWZJZNN.a([[CLXJCNBMKS;[[[BB)V")
	public static final void method212(char[][] arg0, XJCNBMKS arg1, byte[][][] arg2) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char[] var4 = new char[arg1.method534()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg1.method534();
			}

			arg0[var3] = var4;
			byte[][] var6 = new byte[arg1.method534()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg1.method534();
				var6[var7][1] = (byte) arg1.method534();
			}

			if (var6.length > 0) {
				arg2[var3] = var6;
			}
		}
	}

	@ObfuscatedName("EZWZJZNN.a([[CLXJCNBMKS;I)V")
	public static final void method213(char[][] arg0, XJCNBMKS arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char[] var3 = new char[arg1.method534()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg1.method534();
			}

			arg0[var2] = var3;
		}
	}

	@ObfuscatedName("EZWZJZNN.a([CZ)V")
	public static final void method214(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method215(arg0[var2])) {
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

	@ObfuscatedName("EZWZJZNN.a(IC)Z")
	public static final boolean method215(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("EZWZJZNN.a(Ljava/lang/String;I)Ljava/lang/String;")
	public static final String method216(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method214(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method224(var5);
		method219(var5);
		method220(var5);
		method233(var5);

		for (int var7 = 0; var7 < field607.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field607[var7], var8 + 1)) != -1) {
				char[] var9 = field607[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method217(var5, var4.toCharArray());
		method218(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("EZWZJZNN.a([CI[C)V")
	public static final void method217(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method241(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("EZWZJZNN.a([CI)V")
	public static final void method218(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method238(var3)) {
				var1 = true;
			} else if (var1) {
				if (method240(var3)) {
					var1 = false;
				}
			} else if (method241(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("EZWZJZNN.b([CI)V")
	public static final void method219(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field602.length - 1; var2 >= 0; var2--) {
				method228(field603[var2], arg0, field602[var2]);
			}
		}
	}

	@ObfuscatedName("EZWZJZNN.a(I[C)V")
	public static final void method220(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method228(null, var1, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method228(null, var3, var4);

		for (int var5 = field604.length - 1; var5 >= 0; var5--) {
			method221(var1, arg0, var3, field604[var5]);
		}
	}

	@ObfuscatedName("EZWZJZNN.a([C[CZ[C[C)V")
	public static final void method221(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
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

					if (var7 < arg3.length && (var12 = method230(var10, var11, arg3[var7])) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method230(var10, var11, arg3[var7 - 1])) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg3.length || !method236(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg3.length) {
					boolean var14 = false;
					int var15 = method222(var5, arg0, arg1);
					int var16 = method223(arg2, var6 - 1, arg1);
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

	@ObfuscatedName("EZWZJZNN.a(I[CI[C)I")
	public static final int method222(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		for (int var3 = arg0 - 1; var3 >= 0 && method236(arg2[var3]); var3--) {
			if (arg2[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method236(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method236(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("EZWZJZNN.a([CII[C)I")
	public static final int method223(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg2.length && method236(arg2[var3])) {
			if (arg2[var3] != '.' && arg2[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg2.length && method236(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method236(arg2[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("EZWZJZNN.b(I[C)V")
	public static final void method224(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method228(null, var1, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method228(null, var3, var4);

		for (int var5 = 0; var5 < field605.length; var5++) {
			method225(field606[var5], arg0, var1, field605[var5], var3);
		}
	}

	@ObfuscatedName("EZWZJZNN.a(II[C[C[C[C)V")
	public static final void method225(int arg0, char[] arg1, char[] arg2, char[] arg3, char[] arg4) {
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

					if (var8 < arg3.length && (var13 = method230(var11, var12, arg3[var8])) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method230(var11, var12, arg3[var8 - 1])) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg3.length || !method236(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg3.length) {
					boolean var15 = false;
					int var16 = method226(arg1, var6, arg2);
					int var17 = method227(var7 - 1, arg4, arg1);
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
									if (method236(arg1[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method236(arg1[var23])) {
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
										if (arg4[var25] != '*') {
											break;
										}

										var19 = var25;
									} else if (arg4[var25] == '*') {
										var19 = var25;
										var24 = true;
									}
								}
							}

							boolean var26 = false;
							for (int var27 = var19 + 1; var27 < arg1.length; var27++) {
								if (var26) {
									if (method236(arg1[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method236(arg1[var27])) {
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

	@ObfuscatedName("EZWZJZNN.b([CII[C)I")
	public static final int method226(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		int var3 = arg1 - 1;
		while (var3 >= 0 && method236(arg0[var3])) {
			if (arg0[var3] != ',' && arg0[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method236(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method236(arg0[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("EZWZJZNN.a(II[C[C)I")
	public static final int method227(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg2.length && method236(arg2[var3])) {
			if (arg2[var3] != '\\' && arg2[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg2.length && method236(arg1[var5]); var5++) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method236(arg2[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("EZWZJZNN.a([[B[C[CB)V")
	public static final void method228(byte[][] arg0, char[] arg1, char[] arg2) {
		if (arg2.length <= arg1.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg1.length - arg2.length; var4 += var8) {
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

					if (var6 < arg2.length && (var15 = method231(var14, arg2[var6], var13)) > 0) {
						if (var15 == 1 && method239(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method239(var13) || method239(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method231(var14, arg2[var6 - 1], var13)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg2.length || !method237(var13)) {
								break;
							}

							if (method236(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method239(var13)) {
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

						if (var4 - 1 < 0 || method236(arg1[var4 - 1]) && arg1[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg1.length || method236(arg1[var5]) && arg1[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method236(arg1[var25]) || arg1[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg1.length && (!method236(arg1[var25 + var27]) || arg1[var25 + var27] == '\''); var27++) {
										var26[var27] = arg1[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method236(arg1[var25 - 1]) || arg1[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method242(var26)) {
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

						byte var20 = method232(var18);
						byte var21 = method232(var19);
						if (arg0 != null && method229(var20, var21, arg0)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method239(arg1[var32])) {
								var29++;
							} else if (method238(arg1[var32])) {
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

	@ObfuscatedName("EZWZJZNN.a(BBB[[B)Z")
	public static final boolean method229(byte arg0, byte arg1, byte[][] arg2) {
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

	@ObfuscatedName("EZWZJZNN.a(CCIC)I")
	public static final int method230(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("EZWZJZNN.a(ICCC)I")
	public static final int method231(char arg0, char arg1, char arg2) {
		if (arg1 == arg2) {
			return 1;
		}

		if (arg1 >= 'a' && arg1 <= 'm') {
			if (arg1 == 'a') {
				if (arg2 != '4' && arg2 != '@' && arg2 != '^') {
					if (arg2 == '/' && arg0 == '\\') {
						return 2;
					}

					return 0;
				}

				return 1;
			}

			if (arg1 == 'b') {
				if (arg2 != '6' && arg2 != '8') {
					if ((arg2 != '1' || arg0 != '3') && (arg2 != 'i' || arg0 != '3')) {
						return 0;
					}

					return 2;
				}

				return 1;
			}

			if (arg1 == 'c') {
				if (arg2 != '(' && arg2 != '<' && arg2 != '{' && arg2 != '[') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'd') {
				if ((arg2 != '[' || arg0 != ')') && (arg2 != 'i' || arg0 != ')')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'e') {
				if (arg2 != '3' && arg2 != '€') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'f') {
				if (arg2 == 'p' && arg0 == 'h') {
					return 2;
				}

				if (arg2 == '£') {
					return 1;
				}

				return 0;
			}

			if (arg1 == 'g') {
				if (arg2 != '9' && arg2 != '6' && arg2 != 'q') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'h') {
				if (arg2 == '#') {
					return 1;
				}

				return 0;
			}

			if (arg1 == 'i') {
				if (arg2 != 'y' && arg2 != 'l' && arg2 != 'j' && arg2 != '1' && arg2 != '!' && arg2 != ':' && arg2 != ';' && arg2 != '|') {
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
				if (arg2 != '1' && arg2 != '|' && arg2 != 'i') {
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
				if (arg2 != '0' && arg2 != '*') {
					if ((arg2 != '(' || arg0 != ')') && (arg2 != '[' || arg0 != ']') && (arg2 != '{' || arg0 != '}') && (arg2 != '<' || arg0 != '>')) {
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
				if (arg2 != '5' && arg2 != 'z' && arg2 != '$' && arg2 != '2') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 't') {
				if (arg2 != '7' && arg2 != '+') {
					return 0;
				}

				return 1;
			}

			if (arg1 == 'u') {
				if (arg2 == 'v') {
					return 1;
				}

				if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'v') {
				if ((arg2 != '\\' || arg0 != '/') && (arg2 != '\\' || arg0 != '|') && (arg2 != '|' || arg0 != '/')) {
					return 0;
				}

				return 2;
			}

			if (arg1 == 'w') {
				if (arg2 == 'v' && arg0 == 'v') {
					return 2;
				}

				return 0;
			}

			if (arg1 == 'x') {
				if ((arg2 != ')' || arg0 != '(') && (arg2 != '}' || arg0 != '{') && (arg2 != ']' || arg0 != '[') && (arg2 != '>' || arg0 != '<')) {
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
					if (arg2 == 'l') {
						return 1;
					}

					return 0;
				}

				return 0;
			}

			if (arg2 != 'o' && arg2 != 'O') {
				if ((arg2 != '(' || arg0 != ')') && (arg2 != '{' || arg0 != '}') && (arg2 != '[' || arg0 != ']')) {
					return 0;
				}

				return 2;
			}

			return 1;
		}

		if (arg1 == ',') {
			if (arg2 == '.') {
				return 1;
			}

			return 0;
		}

		if (arg1 == '.') {
			if (arg2 == ',') {
				return 1;
			}

			return 0;
		}

		if (arg1 == '!') {
			if (arg2 == 'i') {
				return 1;
			}

			return 0;
		}

		return 0;
	}

	@ObfuscatedName("EZWZJZNN.b(IC)B")
	public static final byte method232(char arg0) {
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

	@ObfuscatedName("EZWZJZNN.a([CB)V")
	public static final void method233(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method234(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method236(arg0[var6]) && !method237(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method235(arg0, var7);
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

	@ObfuscatedName("EZWZJZNN.a([CII)I")
	public static final int method234(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("EZWZJZNN.a([CIZ)I")
	public static final int method235(char[] arg0, int arg1) {
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

	@ObfuscatedName("EZWZJZNN.a(CI)Z")
	public static final boolean method236(char arg0) {
		if (!method238(arg0) && !method239(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("EZWZJZNN.a(ZC)Z")
	public static final boolean method237(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("EZWZJZNN.c(IC)Z")
	public static final boolean method238(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("EZWZJZNN.b(CI)Z")
	public static final boolean method239(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("EZWZJZNN.d(IC)Z")
	public static final boolean method240(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("EZWZJZNN.e(IC)Z")
	public static final boolean method241(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("EZWZJZNN.c(I[C)Z")
	public static final boolean method242(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method239(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method243(arg0);
		int var4 = 0;
		int var5 = field601.length - 1;
		if (field601[var4] != var3 && field601[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field601[var6] == var3) {
					return true;
				}

				if (var3 < field601[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("EZWZJZNN.b([CZ)I")
	public static final int method243(char[] arg0) {
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
