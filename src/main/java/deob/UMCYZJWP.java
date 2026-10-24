package deob;

import java.util.Random;

@ObfuscatedName("UMCYZJWP")
public final class UMCYZJWP extends HQRNTLRZ {

	@ObfuscatedName("UMCYZJWP.G")
	public byte[][] field1301 = new byte[256][];

	@ObfuscatedName("UMCYZJWP.H")
	public int[] field1302 = new int[256];

	@ObfuscatedName("UMCYZJWP.I")
	public int[] field1303 = new int[256];

	@ObfuscatedName("UMCYZJWP.J")
	public int[] field1304 = new int[256];

	@ObfuscatedName("UMCYZJWP.K")
	public int[] field1305 = new int[256];

	@ObfuscatedName("UMCYZJWP.L")
	public int[] field1306 = new int[256];

	@ObfuscatedName("UMCYZJWP.N")
	public Random field1308 = new Random();

	@ObfuscatedName("UMCYZJWP.O")
	public boolean field1309 = false;

	@ObfuscatedName("UMCYZJWP.M")
	public int field1307;

	public UMCYZJWP(String arg0, boolean arg1, QKFGLETG arg2) {
		XJCNBMKS var4 = new XJCNBMKS(arg2.method402(arg0 + ".dat", null));
		XJCNBMKS var5 = new XJCNBMKS(arg2.method402("index.dat", null));
		boolean var6 = true;
		var5.field1403 = var4.method536() + 4;
		int var7 = var5.method534();
		if (var7 > 0) {
			var5.field1403 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1304[var8] = var5.method534();
			field1305[var8] = var5.method534();
			int var10 = field1302[var8] = var5.method536();
			int var11 = field1303[var8] = var5.method536();
			int var12 = var5.method534();
			int var13 = var10 * var11;
			field1301[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1301[var8][var14] = var4.method535();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1301[var8][var10 * var16 + var15] = var4.method535();
					}
				}
			}

			if (var11 > field1307 && var8 < 128) {
				field1307 = var11;
			}

			field1304[var8] = 1;
			field1306[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1301[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1306[var8]--;
				field1304[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1301[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1306[var8]--;
			}
		}

		if (arg1) {
			field1306[32] = field1306[73];
		} else {
			field1306[32] = field1306[105];
		}
	}

	@ObfuscatedName("UMCYZJWP.a(IIIILjava/lang/String;)V")
	public void method465(int arg0, int arg1, int arg2, String arg3) {
		method470(arg0 - method469(arg3), arg3, arg1, arg2);
	}

	@ObfuscatedName("UMCYZJWP.a(ILjava/lang/String;III)V")
	public void method466(int arg0, String arg1, int arg2, int arg3) {
		method470(arg3 - method469(arg1) / 2, arg1, arg2, arg0);
	}

	@ObfuscatedName("UMCYZJWP.a(ILjava/lang/String;ZZII)V")
	public void method467(int arg0, String arg1, boolean arg2, int arg3, int arg4) {
		method474(arg4, arg3, arg1, arg2, arg0 - method468(arg1) / 2);
	}

	@ObfuscatedName("UMCYZJWP.a(Ljava/lang/String;B)I")
	public int method468(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1306[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("UMCYZJWP.a(ILjava/lang/String;)I")
	public int method469(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1306[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("UMCYZJWP.b(ILjava/lang/String;III)V")
	public void method470(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg3 -= field1307;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method477(field1301[var6], field1304[var6] + arg0, field1305[var6] + arg3, field1302[var6], field1303[var6], arg2);
				}

				arg0 += field1306[var6];
			}
		}
	}

	@ObfuscatedName("UMCYZJWP.a(ILjava/lang/String;IIII)V")
	public void method471(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg3 -= method469(arg1) / 2;
			arg4 -= field1307;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method477(field1301[var7], field1304[var7] + arg3, field1305[var7] + arg4 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field1302[var7], field1303[var7], arg0);
				}

				arg3 += field1306[var7];
			}
		}
	}

	@ObfuscatedName("UMCYZJWP.a(Ljava/lang/String;IIIII)V")
	public void method472(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg2 -= method469(arg0) / 2;
			arg1 -= field1307;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method477(field1301[var7], field1304[var7] + arg2 + (int) (Math.sin(arg3 / 5.0D + var6 / 5.0D) * 5.0D), field1305[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 3.0D) * 5.0D), field1302[var7], field1303[var7], arg4);
				}

				arg2 += field1306[var7];
			}
		}
	}

	@ObfuscatedName("UMCYZJWP.a(IIIIILjava/lang/String;I)V")
	public void method473(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg1 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg0 -= method469(arg4) / 2;
			arg5 -= field1307;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method477(field1301[var10], field1304[var10] + arg0, field1305[var10] + arg5 + (int) (Math.sin(var9 / 1.5D + arg2) * var7), field1302[var10], field1303[var10], arg3);
				}

				arg0 += field1306[var10];
			}
		}
	}

	@ObfuscatedName("UMCYZJWP.a(IILjava/lang/String;ZIB)V")
	public void method474(int arg0, int arg1, String arg2, boolean arg3, int arg4) {
		field1309 = false;
		int var6 = arg4;
		if (arg2 != null) {
			arg0 -= field1307;
			for (int var7 = 0; var7 < arg2.length(); var7++) {
				if (arg2.charAt(var7) == '@' && var7 + 4 < arg2.length() && arg2.charAt(var7 + 4) == '@') {
					int var8 = method476(arg2.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg1 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg2.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method477(field1301[var9], field1304[var9] + arg4 + 1, field1305[var9] + arg0 + 1, field1302[var9], field1303[var9], 0);
						}

						method477(field1301[var9], field1304[var9] + arg4, field1305[var9] + arg0, field1302[var9], field1303[var9], arg1);
					}

					arg4 += field1306[var9];
				}
			}

			if (field1309) {
				HQRNTLRZ.method287(0x800000, (int) (field1307 * 0.7D) + arg0, arg4 - var6, var6);
			}
		}
	}

	@ObfuscatedName("UMCYZJWP.a(Ljava/lang/String;IZIZII)V")
	public void method475(String arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			field1308.setSeed(arg4);
			int var7 = (field1308.nextInt() & 0x1F) + 192;
			arg5 -= field1307;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method476(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg1 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg2) {
							method479(field1303[var10], field1302[var10], field1301[var10], 192, 0, field1304[var10] + arg3 + 1, field1305[var10] + arg5 + 1);
						}

						method479(field1303[var10], field1302[var10], field1301[var10], var7, arg1, field1304[var10] + arg3, field1305[var10] + arg5);
					}

					arg3 += field1306[var10];
					if ((field1308.nextInt() & 0x3) == 0) {
						arg3++;
					}
				}
			}
		}
	}

	@ObfuscatedName("UMCYZJWP.a(Ljava/lang/String;I)I")
	public int method476(String arg0) {
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
				field1309 = true;
			}

			if (arg0.equals("end")) {
				field1309 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("UMCYZJWP.a([BIIIII)V")
	public void method477(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = HQRNTLRZ.field737 * arg2 + arg1;
		int var8 = HQRNTLRZ.field737 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < HQRNTLRZ.field739) {
			int var11 = HQRNTLRZ.field739 - arg2;
			arg4 -= var11;
			arg2 = HQRNTLRZ.field739;
			var10 += arg3 * var11;
			var7 += HQRNTLRZ.field737 * var11;
		}

		if (arg2 + arg4 >= HQRNTLRZ.field740) {
			arg4 -= arg2 + arg4 + 1 - HQRNTLRZ.field740;
		}

		if (arg1 < HQRNTLRZ.field741) {
			int var12 = HQRNTLRZ.field741 - arg1;
			arg3 -= var12;
			arg1 = HQRNTLRZ.field741;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= HQRNTLRZ.field742) {
			int var13 = arg1 + arg3 + 1 - HQRNTLRZ.field742;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method478(HQRNTLRZ.field736, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("UMCYZJWP.a([I[BIIIIIII)V")
	public void method478(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("UMCYZJWP.a(II[BIIIII)V")
	public void method479(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = HQRNTLRZ.field737 * arg6 + arg5;
		int var9 = HQRNTLRZ.field737 - arg1;
		int var10 = 0;
		int var11 = 0;
		if (arg6 < HQRNTLRZ.field739) {
			int var12 = HQRNTLRZ.field739 - arg6;
			arg0 -= var12;
			arg6 = HQRNTLRZ.field739;
			var11 += arg1 * var12;
			var8 += HQRNTLRZ.field737 * var12;
		}

		if (arg0 + arg6 >= HQRNTLRZ.field740) {
			arg0 -= arg0 + arg6 + 1 - HQRNTLRZ.field740;
		}

		if (arg5 < HQRNTLRZ.field741) {
			int var13 = HQRNTLRZ.field741 - arg5;
			arg1 -= var13;
			arg5 = HQRNTLRZ.field741;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg5 >= HQRNTLRZ.field742) {
			int var14 = arg1 + arg5 + 1 - HQRNTLRZ.field742;
			arg1 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg1 > 0 && arg0 > 0) {
			method480(var8, var9, arg0, arg2, arg4, HQRNTLRZ.field736, arg1, var11, var10, arg3);
		}
	}

	@ObfuscatedName("UMCYZJWP.a(III[BII[IIIII)V")
	public void method480(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		arg4 = ((arg4 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = -arg6; var12 < 0; var12++) {
				if (arg3[arg7++] == 0) {
					arg0++;
				} else {
					int var13 = arg5[arg0];
					arg5[arg0++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg4;
				}
			}

			arg0 += arg1;
			arg7 += arg8;
		}
	}
}
