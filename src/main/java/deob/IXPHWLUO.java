package deob;

@ObfuscatedName("IXPHWLUO")
public final class IXPHWLUO {

	@ObfuscatedName("IXPHWLUO.o")
	public static final String[] field777 = new String[] { "cook", "cook's", "cooks", "seeks", "sheet", "woop", "woops", "faq", "noob", "noobs" };

	@ObfuscatedName("IXPHWLUO.i")
	public static int[] field771;

	@ObfuscatedName("IXPHWLUO.n")
	public static int[] field776;

	@ObfuscatedName("IXPHWLUO.j")
	public static char[][] field772;

	@ObfuscatedName("IXPHWLUO.l")
	public static char[][] field774;

	@ObfuscatedName("IXPHWLUO.m")
	public static char[][] field775;

	@ObfuscatedName("IXPHWLUO.k")
	public static byte[][][] field773;

	@ObfuscatedName("IXPHWLUO.a(LFXNTEMPE;)V")
	public static final void method230(FXNTEMPE arg0) {
		RSWRPCHR var1 = new RSWRPCHR(arg0.method212("fragmentsenc.txt", null));
		RSWRPCHR var2 = new RSWRPCHR(arg0.method212("badenc.txt", null));
		RSWRPCHR var3 = new RSWRPCHR(arg0.method212("domainenc.txt", null));
		RSWRPCHR var4 = new RSWRPCHR(arg0.method212("tldlist.txt", null));
		method231(var1, var2, var3, var4);
	}

	@ObfuscatedName("IXPHWLUO.a(LRSWRPCHR;LRSWRPCHR;LRSWRPCHR;LRSWRPCHR;)V")
	public static final void method231(RSWRPCHR arg0, RSWRPCHR arg1, RSWRPCHR arg2, RSWRPCHR arg3) {
		method233(arg1);
		method234(arg2);
		method235(arg0);
		method232(arg3);
	}

	@ObfuscatedName("IXPHWLUO.a(ILRSWRPCHR;)V")
	public static final void method232(RSWRPCHR arg0) {
		int var1 = arg0.method393();
		field775 = new char[var1][];
		field776 = new int[var1];
		for (int var2 = 0; var2 < var1; var2++) {
			field776[var2] = arg0.method388();
			char[] var3 = new char[arg0.method388()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method388();
			}

			field775[var2] = var3;
		}
	}

	@ObfuscatedName("IXPHWLUO.b(ILRSWRPCHR;)V")
	public static final void method233(RSWRPCHR arg0) {
		int var1 = arg0.method393();
		field772 = new char[var1][];
		field773 = new byte[var1][][];
		method236(arg0, field773, field772);
	}

	@ObfuscatedName("IXPHWLUO.a(LRSWRPCHR;I)V")
	public static final void method234(RSWRPCHR arg0) {
		int var1 = arg0.method393();
		field774 = new char[var1][];
		method237(arg0, field774);
	}

	@ObfuscatedName("IXPHWLUO.b(LRSWRPCHR;I)V")
	public static final void method235(RSWRPCHR arg0) {
		field771 = new int[arg0.method393()];
		for (int var1 = 0; var1 < field771.length; var1++) {
			field771[var1] = arg0.method390();
		}
	}

	@ObfuscatedName("IXPHWLUO.a(LRSWRPCHR;[[[BI[[C)V")
	public static final void method236(RSWRPCHR arg0, byte[][][] arg1, char[][] arg2) {
		for (int var3 = 0; var3 < arg2.length; var3++) {
			char[] var4 = new char[arg0.method388()];
			for (int var5 = 0; var5 < var4.length; var5++) {
				var4[var5] = (char) arg0.method388();
			}

			arg2[var3] = var4;
			byte[][] var6 = new byte[arg0.method388()][2];
			for (int var7 = 0; var7 < var6.length; var7++) {
				var6[var7][0] = (byte) arg0.method388();
				var6[var7][1] = (byte) arg0.method388();
			}

			if (var6.length > 0) {
				arg1[var3] = var6;
			}
		}
	}

	@ObfuscatedName("IXPHWLUO.a(ZLRSWRPCHR;[[C)V")
	public static final void method237(RSWRPCHR arg0, char[][] arg1) {
		for (int var2 = 0; var2 < arg1.length; var2++) {
			char[] var3 = new char[arg0.method388()];
			for (int var4 = 0; var4 < var3.length; var4++) {
				var3[var4] = (char) arg0.method388();
			}

			arg1[var2] = var3;
		}
	}

	@ObfuscatedName("IXPHWLUO.a([CB)V")
	public static final void method238(char[] arg0) {
		int var1 = 0;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (method239(arg0[var2])) {
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

	@ObfuscatedName("IXPHWLUO.a(ZC)Z")
	public static final boolean method239(char arg0) {
		if ((arg0 < ' ' || arg0 > 127) && arg0 != ' ' && arg0 != '\n' && arg0 != '\t' && arg0 != '£' && arg0 != '€') {
			return false;
		}

		return true;
	}

	@ObfuscatedName("IXPHWLUO.a(ZLjava/lang/String;)Ljava/lang/String;")
	public static final String method240(String arg0) {
		long var1 = System.currentTimeMillis();
		char[] var3 = arg0.toCharArray();
		method238(var3);
		String var4 = (new String(var3)).trim();
		char[] var5 = var4.toLowerCase().toCharArray();
		String var6 = var4.toLowerCase();
		method248(var5);
		method243(var5);
		method244(var5);
		method257(var5);

		for (int var7 = 0; var7 < field777.length; var7++) {
			int var8 = -1;
			while ((var8 = var6.indexOf(field777[var7], var8 + 1)) != -1) {
				char[] var9 = field777[var7].toCharArray();
				for (int var10 = 0; var10 < var9.length; var10++) {
					var5[var8 + var10] = var9[var10];
				}
			}
		}

		method241(var4.toCharArray(), var5);
		method242(var5);
		long var11 = System.currentTimeMillis();
		return (new String(var5)).trim();
	}

	@ObfuscatedName("IXPHWLUO.a([CI[C)V")
	public static final void method241(char[] arg0, char[] arg1) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (arg1[var2] != '*' && method265(arg0[var2])) {
				arg1[var2] = arg0[var2];
			}
		}
	}

	@ObfuscatedName("IXPHWLUO.a(I[C)V")
	public static final void method242(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			char var3 = arg0[var2];
			if (!method262(var3)) {
				var1 = true;
			} else if (var1) {
				if (method264(var3)) {
					var1 = false;
				}
			} else if (method265(var3)) {
				arg0[var2] = (char) (var3 + 'a' - 65);
			}
		}
	}

	@ObfuscatedName("IXPHWLUO.a(Z[C)V")
	public static final void method243(char[] arg0) {
		for (int var1 = 0; var1 < 2; var1++) {
			for (int var2 = field772.length - 1; var2 >= 0; var2--) {
				method252(field773[var2], field772[var2], arg0);
			}
		}
	}

	@ObfuscatedName("IXPHWLUO.b(I[C)V")
	public static final void method244(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { '(', 'a', ')' };
		method252(null, var2, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 'd', 'o', 't' };
		method252(null, var4, var3);

		for (int var5 = field774.length - 1; var5 >= 0; var5--) {
			method245(arg0, field774[var5], var1, var3);
		}
	}

	@ObfuscatedName("IXPHWLUO.a([C[C[C[CZ)V")
	public static final void method245(char[] arg0, char[] arg1, char[] arg2, char[] arg3) {
		if (arg1.length <= arg0.length) {
			boolean var4 = true;
			int var8;
			for (int var5 = 0; var5 <= arg0.length - arg1.length; var5 += var8) {
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

					if (var7 < arg1.length && (var12 = method254(var10, arg1[var7], var11)) > 0) {
						var6 += var12;
						var7++;
					} else {
						if (var7 == 0) {
							break;
						}

						int var13;
						if ((var13 = method254(var10, arg1[var7 - 1], var11)) > 0) {
							var6 += var13;

							if (var7 == 1) {
								var8++;
							}
						} else {
							if (var7 >= arg1.length || !method260(var10)) {
								break;
							}

							var6++;
						}
					}
				}

				if (var7 >= arg1.length) {
					boolean var14 = false;
					int var15 = method246(var5, arg2, arg0);
					int var16 = method247(arg3, arg0, var6 - 1);
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

	@ObfuscatedName("IXPHWLUO.a(I[C[CZ)I")
	public static final int method246(int arg0, char[] arg1, char[] arg2) {
		if (arg0 == 0) {
			return 2;
		}

		for (int var3 = arg0 - 1; var3 >= 0 && method260(arg2[var3]); var3--) {
			if (arg2[var3] == '@') {
				return 3;
			}
		}

		int var4 = 0;
		for (int var5 = arg0 - 1; var5 >= 0 && method260(arg1[var5]); var5--) {
			if (arg1[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method260(arg2[arg0 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IXPHWLUO.a([C[CII)I")
	public static final int method247(char[] arg0, char[] arg1, int arg2) {
		if (arg2 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg2 + 1;
		while (var3 < arg1.length && method260(arg1[var3])) {
			if (arg1[var3] != '.' && arg1[var3] != ',') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg2 + 1; var5 < arg1.length && method260(arg0[var5]); var5++) {
			if (arg0[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method260(arg1[arg2 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IXPHWLUO.b(Z[C)V")
	public static final void method248(char[] arg0) {
		char[] var1 = (char[]) arg0.clone();
		char[] var2 = new char[] { 'd', 'o', 't' };
		method252(null, var2, var1);
		char[] var3 = (char[]) arg0.clone();
		char[] var4 = new char[] { 's', 'l', 'a', 's', 'h' };
		method252(null, var4, var3);

		for (int var5 = 0; var5 < field775.length; var5++) {
			method249(arg0, var3, field775[var5], var1, field776[var5]);
		}
	}

	@ObfuscatedName("IXPHWLUO.a([C[CI[C[CI)V")
	public static final void method249(char[] arg0, char[] arg1, char[] arg2, char[] arg3, int arg4) {
		if (arg2.length <= arg0.length) {
			boolean var5 = true;
			int var9;
			for (int var6 = 0; var6 <= arg0.length - arg2.length; var6 += var9) {
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

					if (var8 < arg2.length && (var13 = method254(var11, arg2[var8], var12)) > 0) {
						var7 += var13;
						var8++;
					} else {
						if (var8 == 0) {
							break;
						}

						int var14;
						if ((var14 = method254(var11, arg2[var8 - 1], var12)) > 0) {
							var7 += var14;

							if (var8 == 1) {
								var9++;
							}
						} else {
							if (var8 >= arg2.length || !method260(var11)) {
								break;
							}

							var7++;
						}
					}
				}

				if (var8 >= arg2.length) {
					boolean var15 = false;
					int var16 = method250(arg0, var6, arg3);
					int var17 = method251(var7 - 1, arg0, arg1);
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
										if (arg3[var21] != '*') {
											break;
										}

										var18 = var21;
									} else if (arg3[var21] == '*') {
										var18 = var21;
										var20 = true;
									}
								}
							}

							boolean var22 = false;
							for (int var23 = var18 - 1; var23 >= 0; var23--) {
								if (var22) {
									if (method260(arg0[var23])) {
										break;
									}

									var18 = var23;
								} else if (!method260(arg0[var23])) {
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
							for (int var27 = var19 + 1; var27 < arg0.length; var27++) {
								if (var26) {
									if (method260(arg0[var27])) {
										break;
									}

									var19 = var27;
								} else if (!method260(arg0[var27])) {
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

	@ObfuscatedName("IXPHWLUO.a([CI[CI)I")
	public static final int method250(char[] arg0, int arg1, char[] arg2) {
		if (arg1 == 0) {
			return 2;
		}

		int var3 = arg1 - 1;
		while (var3 >= 0 && method260(arg0[var3])) {
			if (arg0[var3] != ',' && arg0[var3] != '.') {
				var3--;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg1 - 1; var5 >= 0 && method260(arg2[var5]); var5--) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 3) {
			return 4;
		}

		if (method260(arg0[arg1 - 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IXPHWLUO.a(II[C[C)I")
	public static final int method251(int arg0, char[] arg1, char[] arg2) {
		if (arg0 + 1 == arg1.length) {
			return 2;
		}

		int var3 = arg0 + 1;
		while (var3 < arg1.length && method260(arg1[var3])) {
			if (arg1[var3] != '\\' && arg1[var3] != '/') {
				var3++;
				continue;
			}

			return 3;
		}

		int var4 = 0;
		for (int var5 = arg0 + 1; var5 < arg1.length && method260(arg2[var5]); var5++) {
			if (arg2[var5] == '*') {
				var4++;
			}
		}

		if (var4 >= 5) {
			return 4;
		}

		if (method260(arg1[arg0 + 1])) {
			return 1;
		}

		return 0;
	}

	@ObfuscatedName("IXPHWLUO.a([[B[CI[C)V")
	public static final void method252(byte[][] arg0, char[] arg1, char[] arg2) {
		if (arg1.length <= arg2.length) {
			boolean var3 = true;
			int var8;
			for (int var4 = 0; var4 <= arg2.length - arg1.length; var4 += var8) {
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

					if (var6 < arg1.length && (var15 = method255(var14, arg1[var6], var13)) > 0) {
						if (var15 == 1 && method263(var13)) {
							var10 = true;
						}

						if (var15 == 2 && (method263(var13) || method263(var14))) {
							var10 = true;
						}

						var5 += var15;
						var6++;
					} else {
						if (var6 == 0) {
							break;
						}

						int var16;
						if ((var16 = method255(var14, arg1[var6 - 1], var13)) > 0) {
							var5 += var16;

							if (var6 == 1) {
								var8++;
							}
						} else {
							if (var6 >= arg1.length || !method261(var13)) {
								break;
							}

							if (method260(var13) && var13 != '\'') {
								var9 = true;
							}

							if (method263(var13)) {
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

						if (var4 - 1 < 0 || method260(arg2[var4 - 1]) && arg2[var4 - 1] != '\'') {
							var22 = true;
						}

						if (var5 >= arg2.length || method260(arg2[var5]) && arg2[var5] != '\'') {
							var23 = true;
						}

						if (!var22 || !var23) {
							boolean var24 = false;
							int var25 = var4 - 2;
							if (var22) {
								var25 = var4;
							}

							while (!var24 && var25 < var5) {
								if (var25 >= 0 && (!method260(arg2[var25]) || arg2[var25] == '\'')) {
									char[] var26 = new char[3];
									int var27;
									for (var27 = 0; var27 < 3 && var25 + var27 < arg2.length && (!method260(arg2[var25 + var27]) || arg2[var25 + var27] == '\''); var27++) {
										var26[var27] = arg2[var25 + var27];
									}

									boolean var28 = true;
									if (var27 == 0) {
										var28 = false;
									}

									if (var27 < 3 && var25 - 1 >= 0 && (!method260(arg2[var25 - 1]) || arg2[var25 - 1] == '\'')) {
										var28 = false;
									}

									if (var28 && !method266(var26)) {
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

						byte var20 = method256(var18);
						byte var21 = method256(var19);
						if (arg0 != null && method253(var21, arg0, var20)) {
							var17 = false;
						}
					}

					if (var17) {
						int var29 = 0;
						int var30 = 0;
						int var31 = -1;
						for (int var32 = var4; var32 < var5; var32++) {
							if (method263(arg2[var32])) {
								var29++;
							} else if (method262(arg2[var32])) {
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

	@ObfuscatedName("IXPHWLUO.a(BI[[BB)Z")
	public static final boolean method253(byte arg0, byte[][] arg1, byte arg2) {
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

	@ObfuscatedName("IXPHWLUO.a(CICC)I")
	public static final int method254(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("IXPHWLUO.a(CCIC)I")
	public static final int method255(char arg0, char arg1, char arg2) {
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

	@ObfuscatedName("IXPHWLUO.a(CI)B")
	public static final byte method256(char arg0) {
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

	@ObfuscatedName("IXPHWLUO.c(Z[C)V")
	public static final void method257(char[] arg0) {
		boolean var1 = false;
		int var2 = 0;
		int var3 = 0;
		int var4 = 0;
		while (true) {
			do {
				int var7;
				if ((var7 = method258(var2, arg0)) == -1) {
					return;
				}

				boolean var5 = false;
				for (int var6 = var2; var6 >= 0 && var6 < var7 && !var5; var6++) {
					if (!method260(arg0[var6]) && !method261(arg0[var6])) {
						var5 = true;
					}
				}

				if (var5) {
					var3 = 0;
				}

				if (var3 == 0) {
					var4 = var7;
				}

				var2 = method259(var7, arg0);
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

	@ObfuscatedName("IXPHWLUO.a(I[CZ)I")
	public static final int method258(int arg0, char[] arg1) {
		for (int var2 = arg0; var2 < arg1.length && var2 >= 0; var2++) {
			if (arg1[var2] >= '0' && arg1[var2] <= '9') {
				return var2;
			}
		}

		return -1;
	}

	@ObfuscatedName("IXPHWLUO.a(I[CI)I")
	public static final int method259(int arg0, char[] arg1) {
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

	@ObfuscatedName("IXPHWLUO.a(CZ)Z")
	public static final boolean method260(char arg0) {
		if (!method262(arg0) && !method263(arg0)) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IXPHWLUO.b(CI)Z")
	public static final boolean method261(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			if (arg0 != 'v' && arg0 != 'x' && arg0 != 'j' && arg0 != 'q' && arg0 != 'z') {
				return false;
			}

			return true;
		}

		return true;
	}

	@ObfuscatedName("IXPHWLUO.c(CI)Z")
	public static final boolean method262(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z' || arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IXPHWLUO.a(CB)Z")
	public static final boolean method263(char arg0) {
		if (arg0 >= '0' && arg0 <= '9') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IXPHWLUO.d(CI)Z")
	public static final boolean method264(char arg0) {
		if (arg0 >= 'a' && arg0 <= 'z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IXPHWLUO.b(CZ)Z")
	public static final boolean method265(char arg0) {
		if (arg0 >= 'A' && arg0 <= 'Z') {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IXPHWLUO.c(I[C)Z")
	public static final boolean method266(char[] arg0) {
		boolean var1 = true;
		for (int var2 = 0; var2 < arg0.length; var2++) {
			if (!method263(arg0[var2]) && arg0[var2] != 0) {
				var1 = false;
			}
		}

		if (var1) {
			return true;
		}

		int var3 = method267(arg0);
		int var4 = 0;
		int var5 = field771.length - 1;
		if (field771[var4] != var3 && field771[var5] != var3) {
			do {
				int var6 = (var4 + var5) / 2;
				if (field771[var6] == var3) {
					return true;
				}

				if (var3 < field771[var6]) {
					var5 = var6;
				} else {
					var4 = var6;
				}
			} while (var4 != var5 && var4 + 1 != var5);

			return false;
		}

		return true;
	}

	@ObfuscatedName("IXPHWLUO.d(Z[C)I")
	public static final int method267(char[] arg0) {
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
