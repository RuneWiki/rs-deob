package deob;

@ObfuscatedName("ULPSDNZC")
public final class ULPSDNZC {

	@ObfuscatedName("ULPSDNZC.s")
	public static final String[] field1304 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("ULPSDNZC.m")
	public static int[] field1298;

	@ObfuscatedName("ULPSDNZC.r")
	public static int[] field1303;

	@ObfuscatedName("ULPSDNZC.n")
	public static char[][] field1299;

	@ObfuscatedName("ULPSDNZC.p")
	public static char[][] field1301;

	@ObfuscatedName("ULPSDNZC.q")
	public static char[][] field1302;

	@ObfuscatedName("ULPSDNZC.o")
	public static byte[][][] field1300;

	@ObfuscatedName("ULPSDNZC.a(LFNOQZAYQ;)V")
	public static final void method462(FNOQZAYQ arg0) {
		DNRIFKTO var1 = new DNRIFKTO(arg0.method246("fragmentsenc.txt", null));
		DNRIFKTO var2 = new DNRIFKTO(arg0.method246("badenc.txt", null));
		DNRIFKTO var3 = new DNRIFKTO(arg0.method246("domainenc.txt", null));
		DNRIFKTO var4 = new DNRIFKTO(arg0.method246("tldlist.txt", null));
		method463(var1, var2, var3, var4);
	}

	@ObfuscatedName("ULPSDNZC.a(LDNRIFKTO;LDNRIFKTO;LDNRIFKTO;LDNRIFKTO;)V")
	public static final void method463(DNRIFKTO arg0, DNRIFKTO arg1, DNRIFKTO arg2, DNRIFKTO arg3) {
		method465(arg1);
		method466(arg2);
		method467(arg0);
		method464(arg3);
	}

	@ObfuscatedName("ULPSDNZC.a(LDNRIFKTO;Z)V")
	public static final void method464(DNRIFKTO arg0) {
		int var1 = arg0.method194();
		field1302 = new char[var1][];
		field1303 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field1303[var2] = arg0.method189();
			char[] var3 = new char[arg0.method189()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method189();
			}

			field1302[var2] = var3;
		}
	}

	@ObfuscatedName("ULPSDNZC.a(LDNRIFKTO;I)V")
	public static final void method465(DNRIFKTO arg0) {
		int var1 = arg0.method194();
		field1299 = new char[var1][];
		field1300 = new byte[var1][][];
		method468(field1299, field1300, arg0);
	}

	@ObfuscatedName("ULPSDNZC.a(ILDNRIFKTO;)V")
	public static final void method466(DNRIFKTO arg0) {
		int var1 = arg0.method194();
		field1301 = new char[var1][];
		method469(field1301, arg0);
	}

	@ObfuscatedName("ULPSDNZC.b(LDNRIFKTO;Z)V")
	public static final void method467(DNRIFKTO arg0) {
		field1298 = new int[arg0.method194()];
		for (int var1 = 0; var1 < field1298.length; var1++) {
			field1298[var1] = arg0.method191();
		}
	}

	@ObfuscatedName("ULPSDNZC.a([[CZ[[[BLDNRIFKTO;)V")
	public static final void method468(char[][] arg0, byte[][][] arg1, DNRIFKTO arg2) {
		for (int var3 = 0; var3 < arg0.length; var3++) {
			char[] var4 = new char[arg2.method189()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg2.method189();
			}

			arg0[var3] = var4;
			byte[][] var6 = new byte[arg2.method189()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg2.method189();
				var6[var7][1] = (byte) arg2.method189();
			}

			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("ULPSDNZC.a([[CZLDNRIFKTO;)V")
	public static final void method469(char[][] arg0, DNRIFKTO arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char[] var3 = new char[arg1.method189()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg1.method189();
			}

			arg0[var2] = var3;
		}
	}

	@ObfuscatedName("ULPSDNZC.a([CI)V")
	public static final void method470(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method471(arg0[var2])) {
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

	@ObfuscatedName("ULPSDNZC.a(CI)Z")
	public static final boolean method471(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("ULPSDNZC.a(ZLjava/lang/String;)Ljava/lang/String;")
	public static final String method472(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method470(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method480(var5);
		method475(var5);
		method476(var5);
		method489(var5);

		for (int var7 = 0; var7 < field1304.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field1304[var7], var8 + 1)) != -1) {
				char[] var9 = field1304[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method473(var5, var4.toCharArray());
		method474(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("ULPSDNZC.a([C[CI)V")
	public static final void method473(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			if (arg0[var2] != '*' && method497(arg1[var2])) {
				arg0[var2] = arg1[var2];
			}
		}
	}

	@ObfuscatedName("ULPSDNZC.a([CZ)V")
	public static final void method474(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method494(var3)) {
				var1 = true;
			} else if (var1) {
				if (method496(var3)) {
					var1 = false;
				}
			} else if (method497(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("ULPSDNZC.a(Z[C)V")
	public static final void method475(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field1299.length - 1; var2 >= 0; var2--) {
				method484(field1300[var2], arg0, field1299[var2]);
			}
		}
	}

	@ObfuscatedName("ULPSDNZC.b([CZ)V")
	public static final void method476(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method484(null, var1, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method484(null, var3, var4);

		for (int var5 = field1301.length - 1; var5 >= 0; var5--) {
			method477(arg0, var3, field1301[var5], var1);
		}
	}

	@ObfuscatedName("ULPSDNZC.a([C[CI[C[C)V")
	public static final void method477(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg2.length <= arg0.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg0.length - arg2.length; var5 += var8) {
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

					if (var7 < arg2.length && (var12 = method486(var11, arg2[var7], var10)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method486(var11, arg2[var7 - 1], var10)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg2.length || !method492(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg2.length) {
					boolean var14 = false;
					int var15 = method478(arg0, arg3, var5);
					int var16 = method479(arg1, var6 - 1, arg0);
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

	@ObfuscatedName("ULPSDNZC.a([CZ[CI)I")
	public static final int method478(char[] arg0, char[] arg1, int arg2) {
		if (arg2 == 0) {
			return 2;
		}

		for (int var3 = arg2 - 1; var3 >= 0 && method492(arg0[var3]); var3--) {
			if (arg0[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg2 - 1; var5 >= 0 && method492(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method492(arg0[arg2 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ULPSDNZC.a([CII[C)I")
	public static final int method479(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg2.length && method492(arg2[var3])) {
			if (arg2[var3] != '.' && arg2[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg2.length && method492(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method492(arg2[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ULPSDNZC.a(I[C)V")
	public static final void method480(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method484(null, var1, var2);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method484(null, var3, var4);

		for (int var5 = 0; var5 < field1302.length; var5++) {
			method481(field1302[var5], var1, arg0, var3, field1303[var5]);
		}
	}

	@ObfuscatedName("ULPSDNZC.a([C[C[CI[CI)V")
	public static final void method481(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
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

					if (var8 < arg0.length && (var13 = method486(var12, arg0[var8], var11)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method486(var12, arg0[var8 - 1], var11)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg0.length || !method492(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg0.length) {
					boolean var15 = false;
					int var16 = method482(var6, arg1, arg2);
					int var17 = method483(arg3, var7 - 1, arg2);
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
									if (method492(arg2[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method492(arg2[var23])) {
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
									if (method492(arg2[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method492(arg2[var27])) {
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

	@ObfuscatedName("ULPSDNZC.a(IZ[C[C)I")
	public static final int method482(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		int var3 = arg0 - 1;
		while (var3 >= 0 && method492(arg2[var3])) {
			if (arg2[var3] != ',' && arg2[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method492(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method492(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ULPSDNZC.a(I[CI[C)I")
	public static final int method483(char[] arg0, int arg1, char[] arg2) {
		if (arg1 + 1 == arg2.length) {
			return 2;
		}

		int var3 = arg1 + 1;
		while (var3 < arg2.length && method492(arg2[var3])) {
			if (arg2[var3] != '\\' && arg2[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 + 1; var5 < arg2.length && method492(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method492(arg2[arg1 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ULPSDNZC.a([[B[C[CI)V")
	public static final void method484(byte[][] arg0, char[] arg1, char[] arg2) {
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

					if (var6 < arg2.length && (var15 = method487(var14, var13, arg2[var6])) > 0) {
						if (var15 == 1 && method495(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method495(var13) || method495(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method487(var14, var13, arg2[var6 - 1])) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg2.length || !method493(var13)) {
								break;
							}

							if (method492(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method495(var13)) {
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

						if (var4 - 1 < 0 || method492(arg1[var4 - 1]) && arg1[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg1.length || method492(arg1[var5]) && arg1[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method492(arg1[var25]) || arg1[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg1.length && (!method492(arg1[var25 + var27]) || arg1[var25 + var27] == '\''); var27++) {
										var26[var27] = arg1[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method492(arg1[var25 - 1]) || arg1[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method498(var26)) {
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

						byte var20 = method488(var18);
						byte var21 = method488(var19);
						if (arg0 != null && method485(var20, var21, arg0)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method495(arg1[var32])) {
								var29++;
							} else if (method494(arg1[var32])) {
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

	@ObfuscatedName("ULPSDNZC.a(BBI[[B)Z")
	public static final boolean method485(byte arg0, byte arg1, byte[][] arg2) {
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

	@ObfuscatedName("ULPSDNZC.a(CCIC)I")
	public static final int method486(char arg0, char arg1, char arg2) {
		if (arg1 == arg2) {
			return 1;
		}

		if (arg1 == 'o' && arg2 == '0') {
			return 1;
		}

		if (arg1 == 'o' && arg2 == '(' && arg0 == ')') {
			return 2;
		}

		if (arg1 == 'c' && (arg2 == '(' || arg2 == '<' || arg2 == '[')) {
			return 1;
		}

		if (arg1 == 'e' && arg2 == '€') {
			return 1;
		}

		if (arg1 == 's' && arg2 == '$') {
			return 1;
		}

		if (arg1 == 'l' && arg2 == 'i') {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("ULPSDNZC.a(ZCCC)I")
	public static final int method487(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("ULPSDNZC.b(CI)B")
	public static final byte method488(char arg0) {
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

	@ObfuscatedName("ULPSDNZC.c([CZ)V")
	public static final void method489(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method490(var2, arg0)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method492(arg0[var6]) && !method493(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method491(arg0, var7);
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

	@ObfuscatedName("ULPSDNZC.a(II[C)I")
	public static final int method490(int arg0, char[] arg1) {
		for (int var2 = arg0; var2 < arg1.length && var2 >= 0; var2++) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("ULPSDNZC.a([CIB)I")
	public static final int method491(char[] arg0, int arg1) {
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

	@ObfuscatedName("ULPSDNZC.a(CB)Z")
	public static final boolean method492(char arg0) {
		if (!method494(arg0) && !method495(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ULPSDNZC.c(CI)Z")
	public static final boolean method493(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("ULPSDNZC.d(CI)Z")
	public static final boolean method494(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ULPSDNZC.a(BC)Z")
	public static final boolean method495(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ULPSDNZC.a(CZ)Z")
	public static final boolean method496(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ULPSDNZC.a(ZC)Z")
	public static final boolean method497(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("ULPSDNZC.b([CI)Z")
	public static final boolean method498(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method495(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method499(arg0);
		int var4 = 0;
		int var5 = field1298.length - 1;
		if (field1298[var4] != var3 && field1298[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field1298[var6] == var3) {
					return true;
				}

				if (var3 < field1298[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("ULPSDNZC.a(B[C)I")
	public static final int method499(char[] arg0) {
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
