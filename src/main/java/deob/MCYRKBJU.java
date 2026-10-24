package deob;

import java.util.Random;

@ObfuscatedName("MCYRKBJU")
public final class MCYRKBJU extends IFHRXNFO {

	@ObfuscatedName("MCYRKBJU.C")
	public byte[][] field958 = new byte[256][];

	@ObfuscatedName("MCYRKBJU.D")
	public int[] field959 = new int[256];

	@ObfuscatedName("MCYRKBJU.E")
	public int[] field960 = new int[256];

	@ObfuscatedName("MCYRKBJU.F")
	public int[] field961 = new int[256];

	@ObfuscatedName("MCYRKBJU.G")
	public int[] field962 = new int[256];

	@ObfuscatedName("MCYRKBJU.H")
	public int[] field963 = new int[256];

	@ObfuscatedName("MCYRKBJU.J")
	public Random field965 = new Random();

	@ObfuscatedName("MCYRKBJU.K")
	public boolean field966 = false;

	@ObfuscatedName("MCYRKBJU.I")
	public int field964;

	public MCYRKBJU(BBMKAXRK arg0, String arg1, boolean arg2) {
		EILHLJCE var4 = new EILHLJCE(arg0.method30(arg1 + ".dat", null));
		EILHLJCE var5 = new EILHLJCE(arg0.method30("index.dat", null));
		boolean var6 = true;
		var5.field684 = var4.method226() + 4;
		int var7 = var5.method224();
		if (var7 > 0) {
			var5.field684 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field961[var8] = var5.method224();
			field962[var8] = var5.method224();
			int var10 = field959[var8] = var5.method226();
			int var11 = field960[var8] = var5.method226();
			int var12 = var5.method224();
			int var13 = var10 * var11;
			field958[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field958[var8][var14] = var4.method225();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field958[var8][var10 * var16 + var15] = var4.method225();
					}
				}
			}

			if (var11 > field964 && var8 < 128) {
				field964 = var11;
			}

			field961[var8] = 1;
			field963[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field958[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field963[var8]--;
				field961[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field958[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field963[var8]--;
			}
		}

		if (arg2) {
			field963[32] = field963[73];
		} else {
			field963[32] = field963[105];
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IIIILjava/lang/String;)V")
	public void method372(int arg0, int arg1, int arg2, String arg3) {
		method377(arg3, arg0, arg1 - method376(arg3), arg2);
	}

	@ObfuscatedName("MCYRKBJU.a(ILjava/lang/String;III)V")
	public void method373(int arg0, String arg1, int arg2, int arg3) {
		method377(arg1, arg3, arg2 - method376(arg1) / 2, arg0);
	}

	@ObfuscatedName("MCYRKBJU.a(IILjava/lang/String;IZI)V")
	public void method374(int arg0, String arg1, int arg2, boolean arg3, int arg4) {
		method381(arg0 - method375(arg1) / 2, arg2, arg3, arg4, arg1);
	}

	@ObfuscatedName("MCYRKBJU.a(Ljava/lang/String;Z)I")
	public int method375(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field963[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("MCYRKBJU.a(Ljava/lang/String;I)I")
	public int method376(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field963[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("MCYRKBJU.a(Ljava/lang/String;IIII)V")
	public void method377(String arg0, int arg1, int arg2, int arg3) {
		if (arg0 != null) {
			arg1 -= field964;
			for (int var5 = 0; var5 < arg0.length(); var5++) {
				char var6 = arg0.charAt(var5);
				if (var6 != ' ') {
					method384(field958[var6], field961[var6] + arg2, field962[var6] + arg1, field959[var6], field960[var6], arg3);
				}

				arg2 += field963[var6];
			}
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IIIIILjava/lang/String;)V")
	public void method378(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg1 -= method376(arg4) / 2;
			arg0 -= field964;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method384(field958[var7], field961[var7] + arg1, field962[var7] + arg0 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field959[var7], field960[var7], arg3);
				}

				arg1 += field963[var7];
			}
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IIILjava/lang/String;ZI)V")
	public void method379(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg1 -= method376(arg3) / 2;
			arg0 -= field964;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method384(field958[var7], field961[var7] + arg1 + (int) (Math.sin(arg4 / 5.0D + var6 / 5.0D) * 5.0D), field962[var7] + arg0 + (int) (Math.sin(arg4 / 5.0D + var6 / 3.0D) * 5.0D), field959[var7], field960[var7], arg2);
				}

				arg1 += field963[var7];
			}
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IBLjava/lang/String;IIII)V")
	public void method380(int arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			double var7 = 7.0D - arg0 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg4 -= method376(arg1) / 2;
			arg2 -= field964;
			for (int var9 = 0; var9 < arg1.length(); var9++) {
				char var10 = arg1.charAt(var9);
				if (var10 != ' ') {
					method384(field958[var10], field961[var10] + arg4, field962[var10] + arg2 + (int) (Math.sin(var9 / 1.5D + arg5) * var7), field959[var10], field960[var10], arg3);
				}

				arg4 += field963[var10];
			}
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IIZILjava/lang/String;I)V")
	public void method381(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		field966 = false;
		int var6 = arg0;
		if (arg4 != null) {
			arg1 -= field964;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method383(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method384(field958[var9], field961[var9] + arg0 + 1, field962[var9] + arg1 + 1, field959[var9], field960[var9], 0);
						}

						method384(field958[var9], field961[var9] + arg0, field962[var9] + arg1, field959[var9], field960[var9], arg3);
					}

					arg0 += field963[var9];
				}
			}

			if (field966) {
				IFHRXNFO.method318(arg0 - var6, (int) (field964 * 0.7D) + arg1, var6, 0x800000);
			}
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IZLjava/lang/String;IIII)V")
	public void method382(int arg0, boolean arg1, String arg2, int arg3, int arg4, int arg5) {
		if (arg2 != null) {
			field965.setSeed(arg4);
			int var7 = (field965.nextInt() & 0x1F) + 192;
			arg3 -= field964;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					int var9 = method383(arg2.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg0 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg2.charAt(var8);
					if (var10 != ' ') {
						if (arg1) {
							method386(field962[var10] + arg3 + 1, field961[var10] + arg5 + 1, field958[var10], 0, 192, field960[var10], field959[var10]);
						}

						method386(field962[var10] + arg3, field961[var10] + arg5, field958[var10], arg0, var7, field960[var10], field959[var10]);
					}

					arg5 += field963[var10];
					if ((field965.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("MCYRKBJU.a(ILjava/lang/String;)I")
	public int method383(String arg0) {
		if (arg0.equals("red")) {
			return 0xFF0000;
		} else if (arg0.equals("gre")) {
			return 0xFF00;
		} else if (arg0.equals("blu")) {
			return 255;
		} else if (arg0.equals("yel")) {
			return 0xFFFF00;
		} else if (arg0.equals("cya")) {
			return 0xFFFF;
		} else if (arg0.equals("mag")) {
			return 0xFF00FF;
		} else if (arg0.equals("whi")) {
			return 0xFFFFFF;
		} else if (arg0.equals("bla")) {
			return 0;
		} else if (arg0.equals("lre")) {
			return 0xFF9040;
		} else if (arg0.equals("dre")) {
			return 0x800000;
		} else if (arg0.equals("dbl")) {
			return 128;
		} else if (arg0.equals("or1")) {
			return 0xFFB000;
		} else if (arg0.equals("or2")) {
			return 0xFF7000;
		} else if (arg0.equals("or3")) {
			return 0xFF3000;
		} else if (arg0.equals("gr1")) {
			return 0xC0FF00;
		} else if (arg0.equals("gr2")) {
			return 0x80FF00;
		} else if (arg0.equals("gr3")) {
			return 0x40FF00;
		} else {
			if (arg0.equals("str")) {
				field966 = true;
			}

			if (arg0.equals("end")) {
				field966 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("MCYRKBJU.a([BIIIII)V")
	public void method384(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = IFHRXNFO.field760 * arg2 + arg1;
		int var8 = IFHRXNFO.field760 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < IFHRXNFO.field762) {
			int var11 = IFHRXNFO.field762 - arg2;
			arg4 -= var11;
			arg2 = IFHRXNFO.field762;
			var10 += arg3 * var11;
			var7 += IFHRXNFO.field760 * var11;
		}

		if (arg2 + arg4 >= IFHRXNFO.field763) {
			arg4 -= arg2 + arg4 + 1 - IFHRXNFO.field763;
		}

		if (arg1 < IFHRXNFO.field764) {
			int var12 = IFHRXNFO.field764 - arg1;
			arg3 -= var12;
			arg1 = IFHRXNFO.field764;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= IFHRXNFO.field765) {
			int var13 = arg1 + arg3 + 1 - IFHRXNFO.field765;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method385(IFHRXNFO.field759, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("MCYRKBJU.a([I[BIIIIIII)V")
	public void method385(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}

				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}

				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}

				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}

			for (int var13 = arg5; var13 < 0; var13++) {
				if (arg1[arg3++] == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg2;
				}
			}

			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("MCYRKBJU.a(II[BIIIII)V")
	public void method386(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = IFHRXNFO.field760 * arg0 + arg1;
		int var9 = IFHRXNFO.field760 - arg6;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < IFHRXNFO.field762) {
			int var12 = IFHRXNFO.field762 - arg0;
			arg5 -= var12;
			arg0 = IFHRXNFO.field762;
			var11 += arg6 * var12;
			var8 += IFHRXNFO.field760 * var12;
		}

		if (arg0 + arg5 >= IFHRXNFO.field763) {
			arg5 -= arg0 + arg5 + 1 - IFHRXNFO.field763;
		}

		if (arg1 < IFHRXNFO.field764) {
			int var13 = IFHRXNFO.field764 - arg1;
			arg6 -= var13;
			arg1 = IFHRXNFO.field764;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg6 >= IFHRXNFO.field765) {
			int var14 = arg1 + arg6 + 1 - IFHRXNFO.field765;
			arg6 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg6 > 0 && arg5 > 0) {
			method387(var11, var10, arg6, arg5, var8, arg2, IFHRXNFO.field759, arg3, arg4, var9);
		}
	}

	@ObfuscatedName("MCYRKBJU.a(IIIII[BZ[IIII)V")
	public void method387(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		arg7 = ((arg7 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg8 & 0xFF0000) >> 8;
		arg8 = 256 - arg8;
		for (int var11 = -arg3; var11 < 0; var11++) {
			for (int var12 = -arg2; var12 < 0; var12++) {
				if (arg5[arg0++] == 0) {
					arg4++;
				} else {
					int var13 = arg6[arg4];
					arg6[arg4++] = (((var13 & 0xFF00FF) * arg8 & 0xFF00FF00) + ((var13 & 0xFF00) * arg8 & 0xFF0000) >> 8) + arg7;
				}
			}

			arg4 += arg9;
			arg0 += arg1;
		}
	}
}
