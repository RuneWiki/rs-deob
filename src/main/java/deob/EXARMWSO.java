package deob;

import java.util.Random;

@ObfuscatedName("EXARMWSO")
public final class EXARMWSO extends OMVHXJFV {

	@ObfuscatedName("EXARMWSO.B")
	public byte[][] field633 = new byte[256][];

	@ObfuscatedName("EXARMWSO.C")
	public int[] field634 = new int[256];

	@ObfuscatedName("EXARMWSO.D")
	public int[] field635 = new int[256];

	@ObfuscatedName("EXARMWSO.E")
	public int[] field636 = new int[256];

	@ObfuscatedName("EXARMWSO.F")
	public int[] field637 = new int[256];

	@ObfuscatedName("EXARMWSO.G")
	public int[] field638 = new int[256];

	@ObfuscatedName("EXARMWSO.I")
	public Random field640 = new Random();

	@ObfuscatedName("EXARMWSO.J")
	public boolean field641 = false;

	@ObfuscatedName("EXARMWSO.H")
	public int field639;

	public EXARMWSO(boolean arg0, SYUGXMZF arg1, String arg2) {
		KHOMSBHW var4 = new KHOMSBHW(arg1.method551(arg2 + ".dat", null));
		KHOMSBHW var5 = new KHOMSBHW(arg1.method551("index.dat", null));
		boolean var6 = true;
		var5.field934 = var4.method351() + 4;
		int var7 = var5.method349();
		if (var7 > 0) {
			var5.field934 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field636[var8] = var5.method349();
			field637[var8] = var5.method349();
			int var10 = field634[var8] = var5.method351();
			int var11 = field635[var8] = var5.method351();
			int var12 = var5.method349();
			int var13 = var10 * var11;
			field633[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field633[var8][var14] = var4.method350();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field633[var8][var10 * var16 + var15] = var4.method350();
					}
				}
			}

			if (var11 > field639 && var8 < 128) {
				field639 = var11;
			}

			field636[var8] = 1;
			field638[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field633[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field638[var8]--;
				field636[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field633[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field638[var8]--;
			}
		}

		if (arg0) {
			field638[32] = field638[73];
		} else {
			field638[32] = field638[105];
		}
	}

	@ObfuscatedName("EXARMWSO.a(IIBLjava/lang/String;I)V")
	public void method247(int arg0, int arg1, String arg2, int arg3) {
		method252(arg1, arg3 - method251(arg2), arg2, arg0);
	}

	@ObfuscatedName("EXARMWSO.a(IILjava/lang/String;II)V")
	public void method248(int arg0, String arg1, int arg2, int arg3) {
		method252(arg3, arg2 - method251(arg1) / 2, arg1, arg0);
	}

	@ObfuscatedName("EXARMWSO.a(Ljava/lang/String;ZZIII)V")
	public void method249(String arg0, boolean arg1, int arg2, int arg3, int arg4) {
		method256(arg4, arg3, arg1, arg2 - method250(arg0) / 2, arg0);
	}

	@ObfuscatedName("EXARMWSO.a(Ljava/lang/String;I)I")
	public int method250(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field638[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("EXARMWSO.b(Ljava/lang/String;I)I")
	public int method251(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field638[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("EXARMWSO.a(IIILjava/lang/String;I)V")
	public void method252(int arg0, int arg1, String arg2, int arg3) {
		if (arg2 != null) {
			arg3 -= field639;
			for (int var5 = 0; var5 < arg2.length(); var5++) {
				char var6 = arg2.charAt(var5);
				if (var6 != ' ') {
					method259(field633[var6], field636[var6] + arg1, field637[var6] + arg3, field634[var6], field635[var6], arg0);
				}

				arg1 += field638[var6];
			}
		}
	}

	@ObfuscatedName("EXARMWSO.a(IIIIILjava/lang/String;)V")
	public void method253(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg2 -= method251(arg4) / 2;
			arg1 -= field639;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method259(field633[var7], field636[var7] + arg2, field637[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 2.0D) * 5.0D), field634[var7], field635[var7], arg3);
				}

				arg2 += field638[var7];
			}
		}
	}

	@ObfuscatedName("EXARMWSO.a(ILjava/lang/String;IIII)V")
	public void method254(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg0 -= method251(arg1) / 2;
			arg4 -= field639;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method259(field633[var7], field636[var7] + arg0 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field637[var7] + arg4 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field634[var7], field635[var7], arg3);
				}

				arg0 += field638[var7];
			}
		}
	}

	@ObfuscatedName("EXARMWSO.a(IZIIIILjava/lang/String;)V")
	public void method255(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			double var7 = 7.0D - arg1 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg4 -= method251(arg5) / 2;
			arg3 -= field639;
			for (int var9 = 0; var9 < arg5.length(); var9++) {
				char var10 = arg5.charAt(var9);
				if (var10 != ' ') {
					method259(field633[var10], field636[var10] + arg4, field637[var10] + arg3 + (int) (Math.sin(var9 / 1.5D + arg2) * var7), field634[var10], field635[var10], arg0);
				}

				arg4 += field638[var10];
			}
		}
	}

	@ObfuscatedName("EXARMWSO.a(IIZILjava/lang/String;B)V")
	public void method256(int arg0, int arg1, boolean arg2, int arg3, String arg4) {
		field641 = false;
		int var6 = arg3;
		if (arg4 != null) {
			arg1 -= field639;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method258(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method259(field633[var9], field636[var9] + arg3 + 1, field637[var9] + arg1 + 1, field634[var9], field635[var9], 0);
						}

						method259(field633[var9], field636[var9] + arg3, field637[var9] + arg1, field634[var9], field635[var9], arg0);
					}

					arg3 += field638[var9];
				}
			}

			if (field641) {
				OMVHXJFV.method423((int) (field639 * 0.7D) + arg1, arg3 - var6, var6, 0x800000);
			}
		}
	}

	@ObfuscatedName("EXARMWSO.a(IIZIILjava/lang/String;I)V")
	public void method257(int arg0, boolean arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			field640.setSeed(arg2);
			int var7 = (field640.nextInt() & 0x1F) + 192;
			arg3 -= field639;
			for (int var8 = 0; var8 < arg4.length(); var8++) {
				if (arg4.charAt(var8) == '@' && var8 + 4 < arg4.length() && arg4.charAt(var8 + 4) == '@') {
					int var9 = method258(arg4.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg0 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg4.charAt(var8);
					if (var10 != ' ') {
						if (arg1) {
							method261(192, field633[var10], field634[var10], field635[var10], field637[var10] + arg3 + 1, 0, field636[var10] + arg5 + 1);
						}

						method261(var7, field633[var10], field634[var10], field635[var10], field637[var10] + arg3, arg0, field636[var10] + arg5);
					}

					arg5 += field638[var10];
					if ((field640.nextInt() & 0x3) == 0) {
						arg5++;
					}
				}
			}
		}
	}

	@ObfuscatedName("EXARMWSO.a(Ljava/lang/String;Z)I")
	public int method258(String arg0) {
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
				field641 = true;
			}

			if (arg0.equals("end")) {
				field641 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("EXARMWSO.a([BIIIII)V")
	public void method259(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = OMVHXJFV.field1050 * arg2 + arg1;
		int var8 = OMVHXJFV.field1050 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < OMVHXJFV.field1052) {
			int var11 = OMVHXJFV.field1052 - arg2;
			arg4 -= var11;
			arg2 = OMVHXJFV.field1052;
			var10 += arg3 * var11;
			var7 += OMVHXJFV.field1050 * var11;
		}

		if (arg2 + arg4 >= OMVHXJFV.field1053) {
			arg4 -= arg2 + arg4 + 1 - OMVHXJFV.field1053;
		}

		if (arg1 < OMVHXJFV.field1054) {
			int var12 = OMVHXJFV.field1054 - arg1;
			arg3 -= var12;
			arg1 = OMVHXJFV.field1054;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= OMVHXJFV.field1055) {
			int var13 = arg1 + arg3 + 1 - OMVHXJFV.field1055;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method260(OMVHXJFV.field1049, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("EXARMWSO.a([I[BIIIIIII)V")
	public void method260(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("EXARMWSO.a(II[BIIIII)V")
	public void method261(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = OMVHXJFV.field1050 * arg4 + arg6;
		int var9 = OMVHXJFV.field1050 - arg2;
		int var10 = 0;
		int var11 = 0;
		if (arg4 < OMVHXJFV.field1052) {
			int var12 = OMVHXJFV.field1052 - arg4;
			arg3 -= var12;
			arg4 = OMVHXJFV.field1052;
			var11 += arg2 * var12;
			var8 += OMVHXJFV.field1050 * var12;
		}

		if (arg3 + arg4 >= OMVHXJFV.field1053) {
			arg3 -= arg3 + arg4 + 1 - OMVHXJFV.field1053;
		}

		if (arg6 < OMVHXJFV.field1054) {
			int var13 = OMVHXJFV.field1054 - arg6;
			arg2 -= var13;
			arg6 = OMVHXJFV.field1054;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg2 + arg6 >= OMVHXJFV.field1055) {
			int var14 = arg2 + arg6 + 1 - OMVHXJFV.field1055;
			arg2 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg2 > 0 && arg3 > 0) {
			method262(arg5, arg3, var9, var8, arg2, arg0, arg1, OMVHXJFV.field1049, var10, var11);
		}
	}

	@ObfuscatedName("EXARMWSO.a(IIIIIII[B[III)V")
	public void method262(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7, int arg8, int arg9) {
		arg0 = ((arg0 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		arg5 = 256 - arg5;
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = -arg4; var12 < 0; var12++) {
				if (arg6[arg9++] == 0) {
					arg3++;
				} else {
					int var13 = arg7[arg3];
					arg7[arg3++] = (((var13 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((var13 & 0xFF00) * arg5 & 0xFF0000) >> 8) + arg0;
				}
			}

			arg3 += arg2;
			arg9 += arg8;
		}
	}
}
