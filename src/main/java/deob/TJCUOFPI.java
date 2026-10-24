package deob;

import java.util.Random;

@ObfuscatedName("TJCUOFPI")
public final class TJCUOFPI extends VMBJKBNJ {

	@ObfuscatedName("TJCUOFPI.G")
	public byte[][] field1065 = new byte[256][];

	@ObfuscatedName("TJCUOFPI.H")
	public int[] field1066 = new int[256];

	@ObfuscatedName("TJCUOFPI.I")
	public int[] field1067 = new int[256];

	@ObfuscatedName("TJCUOFPI.J")
	public int[] field1068 = new int[256];

	@ObfuscatedName("TJCUOFPI.K")
	public int[] field1069 = new int[256];

	@ObfuscatedName("TJCUOFPI.L")
	public int[] field1070 = new int[256];

	@ObfuscatedName("TJCUOFPI.N")
	public Random field1072 = new Random();

	@ObfuscatedName("TJCUOFPI.O")
	public boolean field1073 = false;

	@ObfuscatedName("TJCUOFPI.M")
	public int field1071;

	public TJCUOFPI(RSPRYUFS arg0, boolean arg1, String arg2) {
		NQUAUMDT var4 = new NQUAUMDT(arg0.method427(arg2 + ".dat", null));
		NQUAUMDT var5 = new NQUAUMDT(arg0.method427("index.dat", null));
		boolean var6 = true;
		var5.field929 = var4.method341() + 4;
		int var7 = var5.method339();
		if (var7 > 0) {
			var5.field929 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1068[var8] = var5.method339();
			field1069[var8] = var5.method339();
			int var10 = field1066[var8] = var5.method341();
			int var11 = field1067[var8] = var5.method341();
			int var12 = var5.method339();
			int var13 = var10 * var11;
			field1065[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1065[var8][var14] = var4.method340();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1065[var8][var10 * var16 + var15] = var4.method340();
					}
				}
			}

			if (var11 > field1071 && var8 < 128) {
				field1071 = var11;
			}

			field1068[var8] = 1;
			field1070[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1065[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1070[var8]--;
				field1068[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1065[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1070[var8]--;
			}
		}

		if (arg1) {
			field1070[32] = field1070[73];
		} else {
			field1070[32] = field1070[105];
		}
	}

	@ObfuscatedName("TJCUOFPI.a(Ljava/lang/String;IIII)V")
	public void method434(String arg0, int arg1, int arg2, int arg3) {
		method439(arg3, arg0, arg2 - method438(arg0), arg1);
	}

	@ObfuscatedName("TJCUOFPI.a(IIILjava/lang/String;I)V")
	public void method435(int arg0, int arg1, String arg2, int arg3) {
		method439(arg0, arg2, arg3 - method438(arg2) / 2, arg1);
	}

	@ObfuscatedName("TJCUOFPI.a(IIILjava/lang/String;ZI)V")
	public void method436(int arg0, int arg1, String arg2, boolean arg3, int arg4) {
		method443(arg1, arg3, arg0, arg4 - method437(arg2) / 2, arg2);
	}

	@ObfuscatedName("TJCUOFPI.a(ILjava/lang/String;)I")
	public int method437(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1070[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("TJCUOFPI.a(BLjava/lang/String;)I")
	public int method438(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1070[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("TJCUOFPI.a(ILjava/lang/String;IIB)V")
	public void method439(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg3 -= field1071;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method446(field1065[var6], field1068[var6] + arg2, field1069[var6] + arg3, field1066[var6], field1067[var6], arg0);
				}

				arg2 += field1070[var6];
			}
		}
	}

	@ObfuscatedName("TJCUOFPI.a(IILjava/lang/String;III)V")
	public void method440(int arg0, int arg1, String arg2, int arg3, int arg4) {
		if (arg2 != null) {
			arg0 -= method438(arg2) / 2;
			arg1 -= field1071;
			for (int var6 = 0; var6 < arg2.length(); var6++) {
				char var7 = arg2.charAt(var6);
				if (var7 != ' ') {
					method446(field1065[var7], field1068[var7] + arg0, field1069[var7] + arg1 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field1066[var7], field1067[var7], arg4);
				}

				arg0 += field1070[var7];
			}
		}
	}

	@ObfuscatedName("TJCUOFPI.a(ILjava/lang/String;IZII)V")
	public void method441(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg2 -= method438(arg1) / 2;
			arg0 -= field1071;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method446(field1065[var7], field1068[var7] + arg2 + (int) (Math.sin(arg3 / 5.0D + var6 / 5.0D) * 5.0D), field1069[var7] + arg0 + (int) (Math.sin(arg3 / 5.0D + var6 / 3.0D) * 5.0D), field1066[var7], field1067[var7], arg4);
				}

				arg2 += field1070[var7];
			}
		}
	}

	@ObfuscatedName("TJCUOFPI.a(BIIILjava/lang/String;II)V")
	public void method442(int arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			double var7 = 7.0D - arg5 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg4 -= method438(arg3) / 2;
			arg0 -= field1071;
			for (int var9 = 0; var9 < arg3.length(); var9++) {
				char var10 = arg3.charAt(var9);
				if (var10 != ' ') {
					method446(field1065[var10], field1068[var10] + arg4, field1069[var10] + arg0 + (int) (Math.sin(var9 / 1.5D + arg1) * var7), field1066[var10], field1067[var10], arg2);
				}

				arg4 += field1070[var10];
			}
		}
	}

	@ObfuscatedName("TJCUOFPI.a(IZBIILjava/lang/String;)V")
	public void method443(int arg0, boolean arg1, int arg2, int arg3, String arg4) {
		field1073 = false;
		int var6 = arg3;
		if (arg4 != null) {
			arg2 -= field1071;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method445(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg1) {
							method446(field1065[var9], field1068[var9] + arg3 + 1, field1069[var9] + arg2 + 1, field1066[var9], field1067[var9], 0);
						}

						method446(field1065[var9], field1068[var9] + arg3, field1069[var9] + arg2, field1066[var9], field1067[var9], arg0);
					}

					arg3 += field1070[var9];
				}
			}

			if (field1073) {
				VMBJKBNJ.method550(0x800000, (int) (field1071 * 0.7D) + arg2, var6, arg3 - var6);
			}
		}
	}

	@ObfuscatedName("TJCUOFPI.a(ZIILjava/lang/String;III)V")
	public void method444(boolean arg0, int arg1, int arg2, String arg3, int arg4, int arg5) {
		if (arg3 != null) {
			field1072.setSeed(arg4);
			int var7 = (field1072.nextInt() & 0x1F) + 192;
			arg1 -= field1071;
			for (int var8 = 0; var8 < arg3.length(); var8++) {
				if (arg3.charAt(var8) == '@' && var8 + 4 < arg3.length() && arg3.charAt(var8 + 4) == '@') {
					int var9 = method445(arg3.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg3.charAt(var8);
					if (var10 != ' ') {
						if (arg0) {
							method448(field1067[var10], 0, field1069[var10] + arg1 + 1, field1065[var10], field1066[var10], field1068[var10] + arg5 + 1, 192);
						}

						method448(field1067[var10], arg2, field1069[var10] + arg1, field1065[var10], field1066[var10], field1068[var10] + arg5, var7);
					}

					arg5 += field1070[var10];
					if ((field1072.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("TJCUOFPI.a(Ljava/lang/String;I)I")
	public int method445(String arg0) {
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
				field1073 = true;
			}

			if (arg0.equals("end")) {
				field1073 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("TJCUOFPI.a([BIIIII)V")
	public void method446(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = VMBJKBNJ.field1284 * arg2 + arg1;
		int var8 = VMBJKBNJ.field1284 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < VMBJKBNJ.field1286) {
			int var11 = VMBJKBNJ.field1286 - arg2;
			arg4 -= var11;
			arg2 = VMBJKBNJ.field1286;
			var10 += arg3 * var11;
			var7 += VMBJKBNJ.field1284 * var11;
		}

		if (arg2 + arg4 >= VMBJKBNJ.field1287) {
			arg4 -= arg2 + arg4 + 1 - VMBJKBNJ.field1287;
		}

		if (arg1 < VMBJKBNJ.field1288) {
			int var12 = VMBJKBNJ.field1288 - arg1;
			arg3 -= var12;
			arg1 = VMBJKBNJ.field1288;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= VMBJKBNJ.field1289) {
			int var13 = arg1 + arg3 + 1 - VMBJKBNJ.field1289;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method447(VMBJKBNJ.field1283, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("TJCUOFPI.a([I[BIIIIIII)V")
	public void method447(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("TJCUOFPI.a(III[BIIBI)V")
	public void method448(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
		int var8 = VMBJKBNJ.field1284 * arg2 + arg5;
		int var9 = VMBJKBNJ.field1284 - arg4;
		int var10 = 0;
		int var11 = 0;
		if (arg2 < VMBJKBNJ.field1286) {
			int var12 = VMBJKBNJ.field1286 - arg2;
			arg0 -= var12;
			arg2 = VMBJKBNJ.field1286;
			var11 += arg4 * var12;
			var8 += VMBJKBNJ.field1284 * var12;
		}

		if (arg0 + arg2 >= VMBJKBNJ.field1287) {
			arg0 -= arg0 + arg2 + 1 - VMBJKBNJ.field1287;
		}

		if (arg5 < VMBJKBNJ.field1288) {
			int var13 = VMBJKBNJ.field1288 - arg5;
			arg4 -= var13;
			arg5 = VMBJKBNJ.field1288;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg4 + arg5 >= VMBJKBNJ.field1289) {
			int var14 = arg4 + arg5 + 1 - VMBJKBNJ.field1289;
			arg4 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg4 > 0 && arg0 > 0) {
			method449(arg0, arg6, var10, arg4, arg1, VMBJKBNJ.field1283, var8, var11, var9, arg3);
		}
	}

	@ObfuscatedName("TJCUOFPI.a(IIIII[IIIIZ[B)V")
	public void method449(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		arg4 = ((arg4 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg1 & 0xFF0000) >> 8;
		arg1 = 256 - arg1;
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = -arg3; var12 < 0; var12++) {
				if (arg9[arg7++] == 0) {
					arg6++;
				} else {
					int var13 = arg5[arg6];
					arg5[arg6++] = (((var13 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((var13 & 0xFF00) * arg1 & 0xFF0000) >> 8) + arg4;
				}
			}

			arg6 += arg8;
			arg7 += arg2;
		}
	}
}
