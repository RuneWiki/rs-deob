package deob;

import java.util.Random;

@ObfuscatedName("FUOSCRKP")
public final class FUOSCRKP extends CYEOWDOP {

	@ObfuscatedName("FUOSCRKP.H")
	public byte[][] field770 = new byte[256][];

	@ObfuscatedName("FUOSCRKP.I")
	public int[] field771 = new int[256];

	@ObfuscatedName("FUOSCRKP.J")
	public int[] field772 = new int[256];

	@ObfuscatedName("FUOSCRKP.K")
	public int[] field773 = new int[256];

	@ObfuscatedName("FUOSCRKP.L")
	public int[] field774 = new int[256];

	@ObfuscatedName("FUOSCRKP.M")
	public int[] field775 = new int[256];

	@ObfuscatedName("FUOSCRKP.O")
	public Random field777 = new Random();

	@ObfuscatedName("FUOSCRKP.P")
	public boolean field778 = false;

	@ObfuscatedName("FUOSCRKP.N")
	public int field776;

	public FUOSCRKP(boolean arg0, String arg1, SRZUEVOD arg2) {
		LZWRHABP var4 = new LZWRHABP(arg2.method566(arg1 + ".dat", null));
		LZWRHABP var5 = new LZWRHABP(arg2.method566("index.dat", null));
		boolean var6 = true;
		var5.field1139 = var4.method465() + 4;
		int var7 = var5.method463();
		if (var7 > 0) {
			var5.field1139 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field773[var8] = var5.method463();
			field774[var8] = var5.method463();
			int var10 = field771[var8] = var5.method465();
			int var11 = field772[var8] = var5.method465();
			int var12 = var5.method463();
			int var13 = var10 * var11;
			field770[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field770[var8][var14] = var4.method464();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field770[var8][var10 * var16 + var15] = var4.method464();
					}
				}
			}

			if (var11 > field776 && var8 < 128) {
				field776 = var11;
			}

			field773[var8] = 1;
			field775[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field770[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field775[var8]--;
				field773[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field770[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field775[var8]--;
			}
		}

		if (arg0) {
			field775[32] = field775[73];
		} else {
			field775[32] = field775[105];
		}
	}

	@ObfuscatedName("FUOSCRKP.a(ILjava/lang/String;BII)V")
	public void method309(int arg0, String arg1, int arg2, int arg3) {
		method314(arg3, arg1, arg2 - method313(arg1), arg0);
	}

	@ObfuscatedName("FUOSCRKP.a(IIIILjava/lang/String;)V")
	public void method310(int arg0, int arg1, int arg2, String arg3) {
		method314(arg1, arg3, arg0 - method313(arg3) / 2, arg2);
	}

	@ObfuscatedName("FUOSCRKP.a(ZIIILjava/lang/String;I)V")
	public void method311(boolean arg0, int arg1, int arg2, String arg3, int arg4) {
		method318(arg1, arg4, arg0, arg2 - method312(arg3) / 2, arg3);
	}

	@ObfuscatedName("FUOSCRKP.a(ILjava/lang/String;)I")
	public int method312(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field775[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("FUOSCRKP.a(ZLjava/lang/String;)I")
	public int method313(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field775[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("FUOSCRKP.a(ILjava/lang/String;IIB)V")
	public void method314(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg0 -= field776;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method321(field770[var6], field773[var6] + arg2, field774[var6] + arg0, field771[var6], field772[var6], arg3);
				}

				arg2 += field775[var6];
			}
		}
	}

	@ObfuscatedName("FUOSCRKP.a(ILjava/lang/String;IIII)V")
	public void method315(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg3 -= method313(arg1) / 2;
			arg0 -= field776;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method321(field770[var7], field773[var7] + arg3, field774[var7] + arg0 + (int) (Math.sin(arg4 / 5.0D + var6 / 2.0D) * 5.0D), field771[var7], field772[var7], arg2);
				}

				arg3 += field775[var7];
			}
		}
	}

	@ObfuscatedName("FUOSCRKP.a(IIILjava/lang/String;II)V")
	public void method316(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg0 -= method313(arg2) / 2;
			arg3 -= field776;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method321(field770[var7], field773[var7] + arg0 + (int) (Math.sin(arg4 / 5.0D + var6 / 5.0D) * 5.0D), field774[var7] + arg3 + (int) (Math.sin(arg4 / 5.0D + var6 / 3.0D) * 5.0D), field771[var7], field772[var7], arg1);
				}

				arg0 += field775[var7];
			}
		}
	}

	@ObfuscatedName("FUOSCRKP.a(Ljava/lang/String;IIIIII)V")
	public void method317(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			double var7 = 7.0D - arg2 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg4 -= method313(arg0) / 2;
			arg5 -= field776;
			for (int var9 = 0; var9 < arg0.length(); var9++) {
				char var10 = arg0.charAt(var9);
				if (var10 != ' ') {
					method321(field770[var10], field773[var10] + arg4, field774[var10] + arg5 + (int) (Math.sin(var9 / 1.5D + arg3) * var7), field771[var10], field772[var10], arg1);
				}

				arg4 += field775[var10];
			}
		}
	}

	@ObfuscatedName("FUOSCRKP.a(IIZIILjava/lang/String;)V")
	public void method318(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		field778 = false;
		int var6 = arg3;
		if (arg4 != null) {
			arg0 -= field776;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method320(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg1 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method321(field770[var9], field773[var9] + arg3 + 1, field774[var9] + arg0 + 1, field771[var9], field772[var9], 0);
						}

						method321(field770[var9], field773[var9] + arg3, field774[var9] + arg0, field771[var9], field772[var9], arg1);
					}

					arg3 += field775[var9];
				}
			}

			if (field778) {
				CYEOWDOP.method232(0x800000, arg3 - var6, var6, (int) (field776 * 0.7D) + arg0);
			}
		}
	}

	@ObfuscatedName("FUOSCRKP.a(Ljava/lang/String;IIZIII)V")
	public void method319(String arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
		if (arg0 != null) {
			field777.setSeed(arg4);
			int var7 = (field777.nextInt() & 0x1F) + 192;
			arg5 -= field776;
			for (int var8 = 0; var8 < arg0.length(); var8++) {
				if (arg0.charAt(var8) == '@' && var8 + 4 < arg0.length() && arg0.charAt(var8 + 4) == '@') {
					int var9 = method320(arg0.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg0.charAt(var8);
					if (var10 != ' ') {
						if (arg3) {
							method323(192, field774[var10] + arg5 + 1, 0, field771[var10], field772[var10], field770[var10], field773[var10] + arg1 + 1);
						}

						method323(var7, field774[var10] + arg5, arg2, field771[var10], field772[var10], field770[var10], field773[var10] + arg1);
					}

					arg1 += field775[var10];
					if ((field777.nextInt() & 0x3) == 0) {
						arg1++;
					}
				}
			}
		}
	}

	@ObfuscatedName("FUOSCRKP.b(ILjava/lang/String;)I")
	public int method320(String arg0) {
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
				field778 = true;
			}

			if (arg0.equals("end")) {
				field778 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("FUOSCRKP.a([BIIIII)V")
	public void method321(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = CYEOWDOP.field639 * arg2 + arg1;
		int var8 = CYEOWDOP.field639 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < CYEOWDOP.field641) {
			int var11 = CYEOWDOP.field641 - arg2;
			arg4 -= var11;
			arg2 = CYEOWDOP.field641;
			var10 += arg3 * var11;
			var7 += CYEOWDOP.field639 * var11;
		}

		if (arg2 + arg4 >= CYEOWDOP.field642) {
			arg4 -= arg2 + arg4 + 1 - CYEOWDOP.field642;
		}

		if (arg1 < CYEOWDOP.field643) {
			int var12 = CYEOWDOP.field643 - arg1;
			arg3 -= var12;
			arg1 = CYEOWDOP.field643;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= CYEOWDOP.field644) {
			int var13 = arg1 + arg3 + 1 - CYEOWDOP.field644;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method322(CYEOWDOP.field638, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("FUOSCRKP.a([I[BIIIIIII)V")
	public void method322(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("FUOSCRKP.a(IIIIII[BI)V")
	public void method323(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = CYEOWDOP.field639 * arg1 + arg6;
		int var9 = CYEOWDOP.field639 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg1 < CYEOWDOP.field641) {
			int var12 = CYEOWDOP.field641 - arg1;
			arg4 -= var12;
			arg1 = CYEOWDOP.field641;
			var11 += arg3 * var12;
			var8 += CYEOWDOP.field639 * var12;
		}

		if (arg1 + arg4 >= CYEOWDOP.field642) {
			arg4 -= arg1 + arg4 + 1 - CYEOWDOP.field642;
		}

		if (arg6 < CYEOWDOP.field643) {
			int var13 = CYEOWDOP.field643 - arg6;
			arg3 -= var13;
			arg6 = CYEOWDOP.field643;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg3 + arg6 >= CYEOWDOP.field644) {
			int var14 = arg3 + arg6 + 1 - CYEOWDOP.field644;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg3 > 0 && arg4 > 0) {
			method324(var11, CYEOWDOP.field638, arg3, var9, arg2, arg4, var10, arg5, var8, arg0);
		}
	}

	@ObfuscatedName("FUOSCRKP.a(II[IIIIII[BII)V")
	public void method324(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, int arg9) {
		arg4 = ((arg4 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg9 & 0xFF0000) >> 8;
		arg9 = 256 - arg9;
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = -arg2; var12 < 0; var12++) {
				if (arg7[arg0++] == 0) {
					arg8++;
				} else {
					int var13 = arg1[arg8];
					arg1[arg8++] = (((var13 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((var13 & 0xFF00) * arg9 & 0xFF0000) >> 8) + arg4;
				}
			}

			arg8 += arg3;
			arg0 += arg6;
		}
	}
}
