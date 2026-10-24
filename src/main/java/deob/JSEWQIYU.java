package deob;

@ObfuscatedName("JSEWQIYU")
public final class JSEWQIYU {

	@ObfuscatedName("JSEWQIYU.p")
	public static final String[] field791 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("JSEWQIYU.j")
	public static int[] field785;

	@ObfuscatedName("JSEWQIYU.o")
	public static int[] field790;

	@ObfuscatedName("JSEWQIYU.k")
	public static char[][] field786;

	@ObfuscatedName("JSEWQIYU.m")
	public static char[][] field788;

	@ObfuscatedName("JSEWQIYU.n")
	public static char[][] field789;

	@ObfuscatedName("JSEWQIYU.l")
	public static byte[][][] field787;

	@ObfuscatedName("JSEWQIYU.a(LBYZSQZUF;)V")
	public static final void method280(BYZSQZUF arg0) {
		IMUIZRAF var1 = new IMUIZRAF(arg0.method29("fragmentsenc.txt", null));
		IMUIZRAF var2 = new IMUIZRAF(arg0.method29("badenc.txt", null));
		IMUIZRAF var3 = new IMUIZRAF(arg0.method29("domainenc.txt", null));
		IMUIZRAF var4 = new IMUIZRAF(arg0.method29("tldlist.txt", null));
		method281(var1, var2, var3, var4);
	}

	@ObfuscatedName("JSEWQIYU.a(LIMUIZRAF;LIMUIZRAF;LIMUIZRAF;LIMUIZRAF;)V")
	public static final void method281(IMUIZRAF arg0, IMUIZRAF arg1, IMUIZRAF arg2, IMUIZRAF arg3) {
		method283(arg1);
		method284(arg2);
		method285(arg0);
		method282(arg3);
	}

	@ObfuscatedName("JSEWQIYU.a(LIMUIZRAF;I)V")
	public static final void method282(IMUIZRAF arg0) {
		int var1 = arg0.method243();
		field789 = new char[var1][];
		field790 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field790[var2] = arg0.method238();
			char[] var3 = new char[arg0.method238()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method238();
			}

			field789[var2] = var3;
		}
	}

	@ObfuscatedName("JSEWQIYU.a(ILIMUIZRAF;)V")
	public static final void method283(IMUIZRAF arg0) {
		int var1 = arg0.method243();
		field786 = new char[var1][];
		field787 = new byte[var1][][];
		method286(field787, arg0, field786);
	}

	@ObfuscatedName("JSEWQIYU.b(ILIMUIZRAF;)V")
	public static final void method284(IMUIZRAF arg0) {
		int var1 = arg0.method243();
		field788 = new char[var1][];
		method287(arg0, field788);
	}

	@ObfuscatedName("JSEWQIYU.a(LIMUIZRAF;B)V")
	public static final void method285(IMUIZRAF arg0) {
		field785 = new int[arg0.method243()];
		for (int var1 = 0; var1 < field785.length; var1++) {
			field785[var1] = arg0.method240();
		}
	}

	@ObfuscatedName("JSEWQIYU.a(I[[[BLIMUIZRAF;[[C)V")
	public static final void method286(byte[][][] arg0, IMUIZRAF arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var4 = new char[arg1.method238()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg1.method238();
			}

			arg2[var3] = var4;
			byte[][] var6 = new byte[arg1.method238()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg1.method238();
				var6[var7][1] = (byte) arg1.method238();
			}

			if (var6.length > 0) {
				arg0[var3] = var6;
			}
		}
	}

	@ObfuscatedName("JSEWQIYU.a(LIMUIZRAF;[[CI)V")
	public static final void method287(IMUIZRAF arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method238()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method238();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("JSEWQIYU.a(I[C)V")
	public static final void method288(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method289(arg0[var2])) {
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

	@ObfuscatedName("JSEWQIYU.a(CI)Z")
	public static final boolean method289(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("JSEWQIYU.a(Ljava/lang/String;I)Ljava/lang/String;")
	public static final String method290(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method288(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method298(var5);
		method293(var5);
		method294(var5);
		method307(var5);

		for (int var7 = 0; var7 < field791.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field791[var7], var8 + 1)) != -1) {
				char[] var9 = field791[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method291(var4.toCharArray(), var5);
		method292(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("JSEWQIYU.a([C[CZ)V")
	public static final void method291(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg1[var2] != '*' && method315(arg0[var2])) {
				arg1[var2] = arg0[var2];
			}
		}
	}

	@ObfuscatedName("JSEWQIYU.b(I[C)V")
	public static final void method292(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method312(var3)) {
				var1 = true;
			} else if (var1) {
				if (method314(var3)) {
					var1 = false;
				}
			} else if (method315(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("JSEWQIYU.a(Z[C)V")
	public static final void method293(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field786.length - 1; var2 >= 0; var2--) {
				method302(arg0, field786[var2], field787[var2]);
			}
		}
	}

	@ObfuscatedName("JSEWQIYU.b(Z[C)V")
	public static final void method294(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method302(var1, var2, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method302(var3, var4, null);

		for (int var5 = field788.length - 1; var5 >= 0; var5--) {
			method295(field788[var5], var1, var3, arg0);
		}
	}

	@ObfuscatedName("JSEWQIYU.a([C[CI[C[C)V")
	public static final void method295(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg0.length <= arg3.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg3.length - arg0.length; var5 += var8) {
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

					if (var7 < arg0.length && (var12 = method304(var11, arg0[var7], var10)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method304(var11, arg0[var7 - 1], var10)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg0.length || !method310(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg0.length) {
					boolean var14 = false;
					int var15 = method296(var5, arg1, arg3);
					int var16 = method297(arg2, arg3, var6 - 1);
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

	@ObfuscatedName("JSEWQIYU.a(I[CI[C)I")
	public static final int method296(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		for (int var3 = arg0 - 1; var3 >= 0 && method310(arg2[var3]); var3--) {
			if (arg2[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method310(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method310(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("JSEWQIYU.a([CB[CI)I")
	public static final int method297(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg2 + 1;
		while (var3 < arg1.length && method310(arg1[var3])) {
			if (arg1[var3] != '.' && arg1[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 + 1; var5 < arg1.length && method310(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method310(arg1[arg2 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("JSEWQIYU.a(B[C)V")
	public static final void method298(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method302(var1, var2, null);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method302(var3, var4, null);

		for (int var5 = 0; var5 < field789.length; var5++) {
			method299(var1, var3, arg0, field790[var5], field789[var5]);
		}
	}

	@ObfuscatedName("JSEWQIYU.a([CI[C[CI[C)V")
	public static final void method299(char[] arg0, char[] arg1, char[] arg2, int arg3, char[] arg4) {
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

					if (var8 < arg4.length && (var13 = method304(var12, arg4[var8], var11)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method304(var12, arg4[var8 - 1], var11)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg4.length || !method310(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg4.length) {
					boolean var15 = false;
					int var16 = method300(var6, arg2, arg0);
					int var17 = method301(var7 - 1, arg2, arg1);
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
									if (method310(arg2[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method310(arg2[var23])) {
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
							for (int var27 = var19 + 1; var27 < arg2.length; var27++) {
								if (var26) {
									if (method310(arg2[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method310(arg2[var27])) {
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

	@ObfuscatedName("JSEWQIYU.b(I[CI[C)I")
	public static final int method300(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		int var3 = arg0 - 1;
		while (var3 >= 0 && method310(arg1[var3])) {
			if (arg1[var3] != ',' && arg1[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method310(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method310(arg1[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("JSEWQIYU.a(I[C[CB)I")
	public static final int method301(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg1.length && method310(arg1[var3])) {
			if (arg1[var3] != '\\' && arg1[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg1.length && method310(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method310(arg1[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("JSEWQIYU.a([CZ[C[[B)V")
	public static final void method302(char[] arg0, char[] arg1, byte[][] arg2) {
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

					if (var6 < arg1.length && (var15 = method305(arg1[var6], var13, var14)) > 0) {
						if (var15 == 1 && method313(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method313(var13) || method313(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method305(arg1[var6 - 1], var13, var14)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg1.length || !method311(var13)) {
								break;
							}

							if (method310(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method313(var13)) {
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

						if (var4 - 1 < 0 || method310(arg0[var4 - 1]) && arg0[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg0.length || method310(arg0[var5]) && arg0[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method310(arg0[var25]) || arg0[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg0.length && (!method310(arg0[var25 + var27]) || arg0[var25 + var27] == '\''); var27++) {
										var26[var27] = arg0[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method310(arg0[var25 - 1]) || arg0[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method316(var26)) {
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

						byte var20 = method306(var18);
						byte var21 = method306(var19);
						if (arg2 != null && method303(var21, arg2, var20)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method313(arg0[var32])) {
								var29++;
							} else if (method312(arg0[var32])) {
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

	@ObfuscatedName("JSEWQIYU.a(B[[BBZ)Z")
	public static final boolean method303(byte arg0, byte[][] arg1, byte arg2) {
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

	@ObfuscatedName("JSEWQIYU.a(CCZC)I")
	public static final int method304(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("JSEWQIYU.b(CCZC)I")
	public static final int method305(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("JSEWQIYU.a(IC)B")
	public static final byte method306(char arg0) {
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

	@ObfuscatedName("JSEWQIYU.c(I[C)V")
	public static final void method307(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method308(arg0, var2)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method310(arg0[var6]) && !method311(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method309(arg0, var7);
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

	@ObfuscatedName("JSEWQIYU.a([CBI)I")
	public static final int method308(char[] arg0, int arg1) {
		for (int var2 = arg1; var2 < arg0.length && var2 >= 0; var2++) {
			if (arg0[var2] >= '0' && arg0[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("JSEWQIYU.a(I[CI)I")
	public static final int method309(char[] arg0, int arg1) {
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

	@ObfuscatedName("JSEWQIYU.b(IC)Z")
	public static final boolean method310(char arg0) {
		if (!method312(arg0) && !method313(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("JSEWQIYU.b(CI)Z")
	public static final boolean method311(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("JSEWQIYU.a(BC)Z")
	public static final boolean method312(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("JSEWQIYU.a(CB)Z")
	public static final boolean method313(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("JSEWQIYU.c(CI)Z")
	public static final boolean method314(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("JSEWQIYU.c(IC)Z")
	public static final boolean method315(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("JSEWQIYU.a([CI)Z")
	public static final boolean method316(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method313(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method317(arg0);
		int var4 = 0;
		int var5 = field785.length - 1;
		if (field785[var4] != var3 && field785[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field785[var6] == var3) {
					return true;
				}

				if (var3 < field785[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("JSEWQIYU.a([CB)I")
	public static final int method317(char[] arg0) {
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
