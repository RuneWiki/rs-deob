package deob;

import java.util.Random;

@ObfuscatedName("XUAWPLCH")
public final class XUAWPLCH extends YYTDUXDR {

	@ObfuscatedName("XUAWPLCH.C")
	public byte[][] field1370 = new byte[256][];

	@ObfuscatedName("XUAWPLCH.D")
	public int[] field1371 = new int[256];

	@ObfuscatedName("XUAWPLCH.E")
	public int[] field1372 = new int[256];

	@ObfuscatedName("XUAWPLCH.F")
	public int[] field1373 = new int[256];

	@ObfuscatedName("XUAWPLCH.G")
	public int[] field1374 = new int[256];

	@ObfuscatedName("XUAWPLCH.H")
	public int[] field1375 = new int[256];

	@ObfuscatedName("XUAWPLCH.J")
	public Random field1377 = new Random();

	@ObfuscatedName("XUAWPLCH.K")
	public boolean field1378 = false;

	@ObfuscatedName("XUAWPLCH.I")
	public int field1376;

	public XUAWPLCH(boolean arg0, QDHHNYHL arg1, String arg2) {
		PGNBHFUF var4 = new PGNBHFUF(arg1.method488(arg2 + ".dat", null));
		PGNBHFUF var5 = new PGNBHFUF(arg1.method488("index.dat", null));
		boolean var6 = true;
		var5.field1082 = var4.method422() + 4;
		int var7 = var5.method420();
		if (var7 > 0) {
			var5.field1082 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1373[var8] = var5.method420();
			field1374[var8] = var5.method420();
			int var10 = field1371[var8] = var5.method422();
			int var11 = field1372[var8] = var5.method422();
			int var12 = var5.method420();
			int var13 = var10 * var11;
			field1370[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1370[var8][var14] = var4.method421();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1370[var8][var10 * var16 + var15] = var4.method421();
					}
				}
			}

			if (var11 > field1376 && var8 < 128) {
				field1376 = var11;
			}

			field1373[var8] = 1;
			field1375[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1370[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1375[var8]--;
				field1373[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1370[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1375[var8]--;
			}
		}

		if (arg0) {
			field1375[32] = field1375[73];
		} else {
			field1375[32] = field1375[105];
		}
	}

	@ObfuscatedName("XUAWPLCH.a(IBILjava/lang/String;I)V")
	public void method533(int arg0, int arg1, String arg2, int arg3) {
		method538(arg3, arg1, arg0 - method537(arg2), arg2);
	}

	@ObfuscatedName("XUAWPLCH.a(IIILjava/lang/String;I)V")
	public void method534(int arg0, int arg1, String arg2, int arg3) {
		method538(arg3, arg1, arg0 - method537(arg2) / 2, arg2);
	}

	@ObfuscatedName("XUAWPLCH.a(Ljava/lang/String;IZIII)V")
	public void method535(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
		method542(arg3, arg1, arg4 - method536(arg0) / 2, arg2, arg0);
	}

	@ObfuscatedName("XUAWPLCH.a(ZLjava/lang/String;)I")
	public int method536(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1375[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("XUAWPLCH.a(Ljava/lang/String;B)I")
	public int method537(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1375[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("XUAWPLCH.a(IIIILjava/lang/String;)V")
	public void method538(int arg0, int arg1, int arg2, String arg3) {
		if (arg3 != null) {
			arg1 -= field1376;
			for (int var5 = 0; var5 < arg3.length(); var5++) {
				char var6 = arg3.charAt(var5);
				if (var6 != ' ') {
					method545(field1370[var6], field1373[var6] + arg2, field1374[var6] + arg1, field1371[var6], field1372[var6], arg0);
				}

				arg2 += field1375[var6];
			}
		}
	}

	@ObfuscatedName("XUAWPLCH.a(IIIIZLjava/lang/String;)V")
	public void method539(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg2 -= method537(arg4) / 2;
			arg0 -= field1376;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method545(field1370[var7], field1373[var7] + arg2, field1374[var7] + arg0 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field1371[var7], field1372[var7], arg1);
				}

				arg2 += field1375[var7];
			}
		}
	}

	@ObfuscatedName("XUAWPLCH.a(IBILjava/lang/String;II)V")
	public void method540(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg3 -= method537(arg2) / 2;
			arg0 -= field1376;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method545(field1370[var7], field1373[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field1374[var7] + arg0 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field1371[var7], field1372[var7], arg4);
				}

				arg3 += field1375[var7];
			}
		}
	}

	@ObfuscatedName("XUAWPLCH.a(IIILjava/lang/String;III)V")
	public void method541(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			double var7 = 7.0D - arg5 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg2 -= method537(arg3) / 2;
			arg4 -= field1376;
			for (int var9 = 0; var9 < arg3.length(); var9++) {
				char var10 = arg3.charAt(var9);
				if (var10 != ' ') {
					method545(field1370[var10], field1373[var10] + arg2, field1374[var10] + arg4 + (int) (Math.sin(var9 / 1.5D + arg0) * var7), field1371[var10], field1372[var10], arg1);
				}

				arg2 += field1375[var10];
			}
		}
	}

	@ObfuscatedName("XUAWPLCH.b(IIIIZLjava/lang/String;)V")
	public void method542(int arg0, int arg1, int arg2, boolean arg3, String arg4) {
		field1378 = false;
		int var6 = arg2;
		if (arg4 != null) {
			arg0 -= field1376;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method544(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg1 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method545(field1370[var9], field1373[var9] + arg2 + 1, field1374[var9] + arg0 + 1, field1371[var9], field1372[var9], 0);
						}

						method545(field1370[var9], field1373[var9] + arg2, field1374[var9] + arg0, field1371[var9], field1372[var9], arg1);
					}

					arg2 += field1375[var9];
				}
			}

			if (field1378) {
				YYTDUXDR.method584(0x800000, arg2 - var6, (int) (field1376 * 0.7D) + arg0, var6);
			}
		}
	}

	@ObfuscatedName("XUAWPLCH.a(ILjava/lang/String;IIIZB)V")
	public void method543(int arg0, String arg1, int arg2, int arg3, int arg4, boolean arg5) {
		if (arg1 != null) {
			field1377.setSeed(arg3);
			int var7 = (field1377.nextInt() & 0x1F) + 192;
			arg0 -= field1376;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method544(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg4 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg5) {
							method547(field1374[var10] + arg0 + 1, 192, field1373[var10] + arg2 + 1, field1372[var10], 0, field1370[var10], field1371[var10]);
						}

						method547(field1374[var10] + arg0, var7, field1373[var10] + arg2, field1372[var10], arg4, field1370[var10], field1371[var10]);
					}

					arg2 += field1375[var10];
					if ((field1377.nextInt() & 0x3) == 0) {
						arg2++;
					}
				}
			}
		}
	}

	@ObfuscatedName("XUAWPLCH.a(Ljava/lang/String;Z)I")
	public int method544(String arg0) {
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
				field1378 = true;
			}

			if (arg0.equals("end")) {
				field1378 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("XUAWPLCH.a([BIIIII)V")
	public void method545(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = YYTDUXDR.field1436 * arg2 + arg1;
		int var8 = YYTDUXDR.field1436 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < YYTDUXDR.field1438) {
			int var11 = YYTDUXDR.field1438 - arg2;
			arg4 -= var11;
			arg2 = YYTDUXDR.field1438;
			var10 += arg3 * var11;
			var7 += YYTDUXDR.field1436 * var11;
		}

		if (arg2 + arg4 >= YYTDUXDR.field1439) {
			arg4 -= arg2 + arg4 + 1 - YYTDUXDR.field1439;
		}

		if (arg1 < YYTDUXDR.field1440) {
			int var12 = YYTDUXDR.field1440 - arg1;
			arg3 -= var12;
			arg1 = YYTDUXDR.field1440;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= YYTDUXDR.field1441) {
			int var13 = arg1 + arg3 + 1 - YYTDUXDR.field1441;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method546(YYTDUXDR.field1435, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("XUAWPLCH.a([I[BIIIIIII)V")
	public void method546(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("XUAWPLCH.a(ZIIIII[BI)V")
	public void method547(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = YYTDUXDR.field1436 * arg0 + arg2;
		int var9 = YYTDUXDR.field1436 - arg6;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < YYTDUXDR.field1438) {
			int var12 = YYTDUXDR.field1438 - arg0;
			arg3 -= var12;
			arg0 = YYTDUXDR.field1438;
			var11 += arg6 * var12;
			var8 += YYTDUXDR.field1436 * var12;
		}

		if (arg0 + arg3 >= YYTDUXDR.field1439) {
			arg3 -= arg0 + arg3 + 1 - YYTDUXDR.field1439;
		}

		if (arg2 < YYTDUXDR.field1440) {
			int var13 = YYTDUXDR.field1440 - arg2;
			arg6 -= var13;
			arg2 = YYTDUXDR.field1440;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg6 >= YYTDUXDR.field1441) {
			int var14 = arg2 + arg6 + 1 - YYTDUXDR.field1441;
			arg6 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg6 > 0 && arg3 > 0) {
			method548(arg3, var8, arg6, arg5, var10, arg4, var9, var11, YYTDUXDR.field1435, arg1);
		}
	}

	@ObfuscatedName("XUAWPLCH.a(III[BIIII[III)V")
	public void method548(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		arg5 = ((arg5 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = -arg2; var12 < 0; var12++) {
				if (arg3[arg7++] == 0) {
					arg1++;
				} else {
					int var13 = arg8[arg1];
					arg8[arg1++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg5;
				}
			}

			arg1 += arg6;
			arg7 += arg4;
		}
	}
}
