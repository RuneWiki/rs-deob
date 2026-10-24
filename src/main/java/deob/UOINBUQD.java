package deob;

import java.util.Random;

@ObfuscatedName("UOINBUQD")
public final class UOINBUQD extends TIJYBGAE {

	@ObfuscatedName("UOINBUQD.A")
	public byte[][] field1374 = new byte[256][];

	@ObfuscatedName("UOINBUQD.B")
	public int[] field1375 = new int[256];

	@ObfuscatedName("UOINBUQD.C")
	public int[] field1376 = new int[256];

	@ObfuscatedName("UOINBUQD.D")
	public int[] field1377 = new int[256];

	@ObfuscatedName("UOINBUQD.E")
	public int[] field1378 = new int[256];

	@ObfuscatedName("UOINBUQD.F")
	public int[] field1379 = new int[256];

	@ObfuscatedName("UOINBUQD.H")
	public Random field1381 = new Random();

	@ObfuscatedName("UOINBUQD.I")
	public boolean field1382 = false;

	@ObfuscatedName("UOINBUQD.G")
	public int field1380;

	public UOINBUQD(boolean arg0, AWEEREDT arg1, String arg2) {
		IUVBENCV var4 = new IUVBENCV(arg1.method14(arg2 + ".dat", null));
		IUVBENCV var5 = new IUVBENCV(arg1.method14("index.dat", null));
		boolean var6 = true;
		var5.field733 = var4.method247() + 4;
		int var7 = var5.method245();
		if (var7 > 0) {
			var5.field733 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1377[var8] = var5.method245();
			field1378[var8] = var5.method245();
			int var10 = field1375[var8] = var5.method247();
			int var11 = field1376[var8] = var5.method247();
			int var12 = var5.method245();
			int var13 = var10 * var11;
			field1374[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1374[var8][var14] = var4.method246();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1374[var8][var10 * var16 + var15] = var4.method246();
					}
				}
			}

			if (var11 > field1380 && var8 < 128) {
				field1380 = var11;
			}

			field1377[var8] = 1;
			field1379[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1374[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1379[var8]--;
				field1377[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1374[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1379[var8]--;
			}
		}

		if (arg0) {
			field1379[32] = field1379[73];
		} else {
			field1379[32] = field1379[105];
		}
	}

	@ObfuscatedName("UOINBUQD.a(ILjava/lang/String;III)V")
	public void method501(int arg0, String arg1, int arg2, int arg3) {
		method506(arg0, arg1, arg2 - method505(arg1), arg3);
	}

	@ObfuscatedName("UOINBUQD.a(IILjava/lang/String;II)V")
	public void method502(int arg0, int arg1, String arg2, int arg3) {
		method506(arg0, arg2, arg1 - method505(arg2) / 2, arg3);
	}

	@ObfuscatedName("UOINBUQD.a(Ljava/lang/String;IIIIZ)V")
	public void method503(String arg0, int arg1, int arg2, int arg3, boolean arg4) {
		method510(arg0, arg4, arg2 - method504(arg0) / 2, arg1, arg3);
	}

	@ObfuscatedName("UOINBUQD.a(Ljava/lang/String;I)I")
	public int method504(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1379[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("UOINBUQD.b(Ljava/lang/String;I)I")
	public int method505(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1379[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("UOINBUQD.a(ILjava/lang/String;IZI)V")
	public void method506(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg3 -= field1380;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method513(field1374[var6], field1377[var6] + arg2, field1378[var6] + arg3, field1375[var6], field1376[var6], arg0);
				}

				arg2 += field1379[var6];
			}
		}
	}

	@ObfuscatedName("UOINBUQD.a(ILjava/lang/String;IIII)V")
	public void method507(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg0 -= method505(arg1) / 2;
			arg4 -= field1380;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method513(field1374[var7], field1377[var7] + arg0, field1378[var7] + arg4 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field1375[var7], field1376[var7], arg3);
				}

				arg0 += field1379[var7];
			}
		}
	}

	@ObfuscatedName("UOINBUQD.a(IIIILjava/lang/String;B)V")
	public void method508(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg0 -= method505(arg4) / 2;
			arg3 -= field1380;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method513(field1374[var7], field1377[var7] + arg0 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field1378[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field1375[var7], field1376[var7], arg1);
				}

				arg0 += field1379[var7];
			}
		}
	}

	@ObfuscatedName("UOINBUQD.a(IIIIILjava/lang/String;I)V")
	public void method509(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg3 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg2 -= method505(arg4) / 2;
			arg1 -= field1380;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method513(field1374[var10], field1377[var10] + arg2, field1378[var10] + arg1 + (int) (Math.sin(var9 / 1.5D + arg5) * var7), field1375[var10], field1376[var10], arg0);
				}

				arg2 += field1379[var10];
			}
		}
	}

	@ObfuscatedName("UOINBUQD.a(Ljava/lang/String;ZIIII)V")
	public void method510(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
		field1382 = false;
		int var6 = arg2;
		if (arg0 != null) {
			arg4 -= field1380;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method512(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg1) {
							method513(field1374[var9], field1377[var9] + arg2 + 1, field1378[var9] + arg4 + 1, field1375[var9], field1376[var9], 0);
						}

						method513(field1374[var9], field1377[var9] + arg2, field1378[var9] + arg4, field1375[var9], field1376[var9], arg3);
					}

					arg2 += field1379[var9];
				}
			}

			if (field1382) {
				TIJYBGAE.method495((int) (field1380 * 0.7D) + arg4, 0x800000, var6, arg2 - var6);
			}
		}
	}

	@ObfuscatedName("UOINBUQD.a(IIZLjava/lang/String;BII)V")
	public void method511(int arg0, int arg1, boolean arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			field1381.setSeed(arg0);
			int var7 = (field1381.nextInt() & 0x1F) + 192;
			arg5 -= field1380;
			for (int var8 = 0; var8 < arg3.length(); var8++) {
				if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
					int var9 = method512(arg3.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg4 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg3.charAt(var8);
					if (var10 != ' ') {
						if (arg2) {
							method515(field1377[var10] + arg1 + 1, field1374[var10], 192, field1375[var10], field1378[var10] + arg5 + 1, field1376[var10], 0);
						}

						method515(field1377[var10] + arg1, field1374[var10], var7, field1375[var10], field1378[var10] + arg5, field1376[var10], arg4);
					}

					arg1 += field1379[var10];
					if ((field1381.nextInt() & 0x3) == 0) {
						arg1++;
					}
				}
			}
		}
	}

	@ObfuscatedName("UOINBUQD.a(ILjava/lang/String;)I")
	public int method512(String arg0) {
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
				field1382 = true;
			}

			if (arg0.equals("end")) {
				field1382 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("UOINBUQD.a([BIIIII)V")
	public void method513(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = TIJYBGAE.field1345 * arg2 + arg1;
		int var8 = TIJYBGAE.field1345 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < TIJYBGAE.field1347) {
			int var11 = TIJYBGAE.field1347 - arg2;
			arg4 -= var11;
			arg2 = TIJYBGAE.field1347;
			var10 += arg3 * var11;
			var7 += TIJYBGAE.field1345 * var11;
		}

		if (arg2 + arg4 >= TIJYBGAE.field1348) {
			arg4 -= arg2 + arg4 + 1 - TIJYBGAE.field1348;
		}

		if (arg1 < TIJYBGAE.field1349) {
			int var12 = TIJYBGAE.field1349 - arg1;
			arg3 -= var12;
			arg1 = TIJYBGAE.field1349;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= TIJYBGAE.field1350) {
			int var13 = arg1 + arg3 + 1 - TIJYBGAE.field1350;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method514(TIJYBGAE.field1344, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("UOINBUQD.a([I[BIIIIIII)V")
	public void method514(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("UOINBUQD.a(II[BIIIII)V")
	public void method515(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = TIJYBGAE.field1345 * arg4 + arg0;
		int var9 = TIJYBGAE.field1345 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg4 < TIJYBGAE.field1347) {
			int var12 = TIJYBGAE.field1347 - arg4;
			arg5 -= var12;
			arg4 = TIJYBGAE.field1347;
			var11 += arg3 * var12;
			var8 += TIJYBGAE.field1345 * var12;
		}

		if (arg4 + arg5 >= TIJYBGAE.field1348) {
			arg5 -= arg4 + arg5 + 1 - TIJYBGAE.field1348;
		}

		if (arg0 < TIJYBGAE.field1349) {
			int var13 = TIJYBGAE.field1349 - arg0;
			arg3 -= var13;
			arg0 = TIJYBGAE.field1349;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg3 >= TIJYBGAE.field1350) {
			int var14 = arg0 + arg3 + 1 - TIJYBGAE.field1350;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg3 > 0 && arg5 > 0) {
			method516(arg2, arg5, arg1, TIJYBGAE.field1344, var9, var10, var8, arg6, var11, arg3);
		}
	}

	@ObfuscatedName("UOINBUQD.a(II[B[IIIIIIII)V")
	public void method516(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg7 = ((arg7 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((arg7 & 0xFF00) * arg0 & 0xFF0000) >> 8;
		arg0 = 256 - arg0;
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = -arg9; var12 < 0; var12++) {
				if (arg2[arg8++] == 0) {
					arg6++;
				} else {
					int var13 = arg3[arg6];
					arg3[arg6++] = (((var13 & 0xFF00FF) * arg0 & 0xFF00FF00) + ((var13 & 0xFF00) * arg0 & 0xFF0000) >> 8) + arg7;
				}
			}

			arg6 += arg4;
			arg8 += arg5;
		}
	}
}
