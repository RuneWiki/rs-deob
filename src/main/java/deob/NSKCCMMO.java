package deob;

import java.util.Random;

@ObfuscatedName("NSKCCMMO")
public final class NSKCCMMO extends KVJNUKIT {

	@ObfuscatedName("NSKCCMMO.G")
	public byte[][] field1004 = new byte[256][];

	@ObfuscatedName("NSKCCMMO.H")
	public int[] field1005 = new int[256];

	@ObfuscatedName("NSKCCMMO.I")
	public int[] field1006 = new int[256];

	@ObfuscatedName("NSKCCMMO.J")
	public int[] field1007 = new int[256];

	@ObfuscatedName("NSKCCMMO.K")
	public int[] field1008 = new int[256];

	@ObfuscatedName("NSKCCMMO.L")
	public int[] field1009 = new int[256];

	@ObfuscatedName("NSKCCMMO.N")
	public Random field1011 = new Random();

	@ObfuscatedName("NSKCCMMO.O")
	public boolean field1012 = false;

	@ObfuscatedName("NSKCCMMO.M")
	public int field1010;

	public NSKCCMMO(String arg0, boolean arg1, XMRRKSSB arg2) {
		XQPFGONL var4 = new XQPFGONL(arg2.method465(arg0 + ".dat", null));
		XQPFGONL var5 = new XQPFGONL(arg2.method465("index.dat", null));
		boolean var6 = true;
		var5.field1335 = var4.method480() + 4;
		int var7 = var5.method478();
		if (var7 > 0) {
			var5.field1335 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1007[var8] = var5.method478();
			field1008[var8] = var5.method478();
			int var10 = field1005[var8] = var5.method480();
			int var11 = field1006[var8] = var5.method480();
			int var12 = var5.method478();
			int var13 = var10 * var11;
			field1004[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1004[var8][var14] = var4.method479();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1004[var8][var10 * var16 + var15] = var4.method479();
					}
				}
			}

			if (var11 > field1010 && var8 < 128) {
				field1010 = var11;
			}

			field1007[var8] = 1;
			field1009[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1004[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1009[var8]--;
				field1007[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1004[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1009[var8]--;
			}
		}

		if (arg1) {
			field1009[32] = field1009[73];
		} else {
			field1009[32] = field1009[105];
		}
	}

	@ObfuscatedName("NSKCCMMO.a(ILjava/lang/String;BII)V")
	public void method369(int arg0, String arg1, int arg2, int arg3) {
		method374(arg3, arg1, arg2 - method373(arg1), arg0);
	}

	@ObfuscatedName("NSKCCMMO.a(Ljava/lang/String;IZII)V")
	public void method370(String arg0, int arg1, int arg2, int arg3) {
		method374(arg3, arg0, arg1 - method373(arg0) / 2, arg2);
	}

	@ObfuscatedName("NSKCCMMO.a(IILjava/lang/String;IZI)V")
	public void method371(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		method378(arg2, arg4, arg1 - method372(arg2) / 2, arg3, arg0);
	}

	@ObfuscatedName("NSKCCMMO.a(Ljava/lang/String;I)I")
	public int method372(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1009[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("NSKCCMMO.a(Ljava/lang/String;B)I")
	public int method373(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1009[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("NSKCCMMO.a(IILjava/lang/String;II)V")
	public void method374(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg0 -= field1010;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method381(field1004[var6], field1007[var6] + arg2, field1008[var6] + arg0, field1005[var6], field1006[var6], arg3);
				}

				arg2 += field1009[var6];
			}
		}
	}

	@ObfuscatedName("NSKCCMMO.a(Ljava/lang/String;IIIIZ)V")
	public void method375(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg1 -= method373(arg0) / 2;
			arg4 -= field1010;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method381(field1004[var7], field1007[var7] + arg1, field1008[var7] + arg4 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field1005[var7], field1006[var7], arg3);
				}

				arg1 += field1009[var7];
			}
		}
	}

	@ObfuscatedName("NSKCCMMO.a(Ljava/lang/String;IBIII)V")
	public void method376(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg3 -= method373(arg0) / 2;
			arg4 -= field1010;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method381(field1004[var7], field1007[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field1008[var7] + arg4 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field1005[var7], field1006[var7], arg2);
				}

				arg3 += field1009[var7];
			}
		}
	}

	@ObfuscatedName("NSKCCMMO.a(Ljava/lang/String;IIIBII)V")
	public void method377(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			double var7 = 7.0D - arg2 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg3 -= method373(arg0) / 2;
			arg5 -= field1010;
			for (int var9 = 0; var9 < arg0.length(); var9++) {
				char var10 = arg0.charAt(var9);
				if (var10 != ' ') {
					method381(field1004[var10], field1007[var10] + arg3, field1008[var10] + arg5 + (int) (Math.sin(var9 / 1.5D + arg1) * var7), field1005[var10], field1006[var10], arg4);
				}

				arg3 += field1009[var10];
			}
		}
	}

	@ObfuscatedName("NSKCCMMO.a(Ljava/lang/String;ZIZII)V")
	public void method378(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
		field1012 = false;
		int var6 = arg2;
		if (arg0 != null) {
			arg3 -= field1010;
			for (int var7 = 0; var7 < arg0.length(); var7++) {
				if (arg0.charAt(var7) == '@' && var7 + 4 < arg0.length() && arg0.charAt(var7 + 4) == '@') {
					int var8 = method380(arg0.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg4 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg0.charAt(var7);
					if (var9 != ' ') {
						if (arg1) {
							method381(field1004[var9], field1007[var9] + arg2 + 1, field1008[var9] + arg3 + 1, field1005[var9], field1006[var9], 0);
						}

						method381(field1004[var9], field1007[var9] + arg2, field1008[var9] + arg3, field1005[var9], field1006[var9], arg4);
					}

					arg2 += field1009[var9];
				}
			}

			if (field1012) {
				KVJNUKIT.method347(arg2 - var6, (int) (field1010 * 0.7D) + arg3, 0x800000, var6);
			}
		}
	}

	@ObfuscatedName("NSKCCMMO.a(IZIIILjava/lang/String;I)V")
	public void method379(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			field1011.setSeed(arg3);
			int var7 = (field1011.nextInt() & 0x1F) + 192;
			arg2 -= field1010;
			for (int var8 = 0; var8 < arg4.length(); var8++) {
				if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
					int var9 = method380(arg4.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg0 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg4.charAt(var8);
					if (var10 != ' ') {
						if (arg1) {
							method383(field1008[var10] + arg2 + 1, field1004[var10], field1005[var10], 0, field1007[var10] + arg5 + 1, field1006[var10], 192);
						}

						method383(field1008[var10] + arg2, field1004[var10], field1005[var10], arg0, field1007[var10] + arg5, field1006[var10], var7);
					}

					arg5 += field1009[var10];
					if ((field1011.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("NSKCCMMO.a(ILjava/lang/String;)I")
	public int method380(String arg0) {
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
				field1012 = true;
			}

			if (arg0.equals("end")) {
				field1012 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("NSKCCMMO.a([BIIIII)V")
	public void method381(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = KVJNUKIT.field952 * arg2 + arg1;
		int var8 = KVJNUKIT.field952 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < KVJNUKIT.field954) {
			int var11 = KVJNUKIT.field954 - arg2;
			arg4 -= var11;
			arg2 = KVJNUKIT.field954;
			var10 += arg3 * var11;
			var7 += KVJNUKIT.field952 * var11;
		}

		if (arg2 + arg4 >= KVJNUKIT.field955) {
			arg4 -= arg2 + arg4 + 1 - KVJNUKIT.field955;
		}

		if (arg1 < KVJNUKIT.field956) {
			int var12 = KVJNUKIT.field956 - arg1;
			arg3 -= var12;
			arg1 = KVJNUKIT.field956;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= KVJNUKIT.field957) {
			int var13 = arg1 + arg3 + 1 - KVJNUKIT.field957;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method382(KVJNUKIT.field951, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("NSKCCMMO.a([I[BIIIIIII)V")
	public void method382(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("NSKCCMMO.a(IZ[BIIIII)V")
	public void method383(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = KVJNUKIT.field952 * arg0 + arg4;
		int var9 = KVJNUKIT.field952 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg0 < KVJNUKIT.field954) {
			int var12 = KVJNUKIT.field954 - arg0;
			arg5 -= var12;
			arg0 = KVJNUKIT.field954;
			var11 += arg2 * var12;
			var8 += KVJNUKIT.field952 * var12;
		}

		if (arg0 + arg5 >= KVJNUKIT.field955) {
			arg5 -= arg0 + arg5 + 1 - KVJNUKIT.field955;
		}

		if (arg4 < KVJNUKIT.field956) {
			int var13 = KVJNUKIT.field956 - arg4;
			arg2 -= var13;
			arg4 = KVJNUKIT.field956;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg4 >= KVJNUKIT.field957) {
			int var14 = arg2 + arg4 + 1 - KVJNUKIT.field957;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg5 > 0) {
			method384(arg1, var10, arg6, KVJNUKIT.field951, var8, var9, arg2, arg5, arg3, var11);
		}
	}

	@ObfuscatedName("NSKCCMMO.a([BII[IIIBIIII)V")
	public void method384(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg8 = ((arg8 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((arg8 & 0xFF00) * arg2 & 0xFF0000) >> 8;
		arg2 = 256 - arg2;
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = -arg6; var12 < 0; var12++) {
				if (arg0[arg9++] == 0) {
					arg4++;
				} else {
					int var13 = arg3[arg4];
					arg3[arg4++] = (((var13 & 0xFF00FF) * arg2 & 0xFF00FF00) + ((var13 & 0xFF00) * arg2 & 0xFF0000) >> 8) + arg8;
				}
			}

			arg4 += arg5;
			arg9 += arg1;
		}
	}
}
