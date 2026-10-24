package deob;

import java.util.Random;

@ObfuscatedName("BKBLJVKV")
public final class BKBLJVKV extends CCFLBOBS {

	@ObfuscatedName("BKBLJVKV.C")
	public byte[][] field33 = new byte[256][];

	@ObfuscatedName("BKBLJVKV.D")
	public int[] field34 = new int[256];

	@ObfuscatedName("BKBLJVKV.E")
	public int[] field35 = new int[256];

	@ObfuscatedName("BKBLJVKV.F")
	public int[] field36 = new int[256];

	@ObfuscatedName("BKBLJVKV.G")
	public int[] field37 = new int[256];

	@ObfuscatedName("BKBLJVKV.H")
	public int[] field38 = new int[256];

	@ObfuscatedName("BKBLJVKV.J")
	public Random field40 = new Random();

	@ObfuscatedName("BKBLJVKV.K")
	public boolean field41 = false;

	@ObfuscatedName("BKBLJVKV.I")
	public int field39;

	public BKBLJVKV(String arg0, boolean arg1, VSQMPWOM arg2) {
		BFQIDHPO var4 = new BFQIDHPO(arg2.method526(arg0 + ".dat", null));
		BFQIDHPO var5 = new BFQIDHPO(arg2.method526("index.dat", null));
		boolean var6 = true;
		var5.field10 = var4.method56() + 4;
		int var7 = var5.method54();
		if (var7 > 0) {
			var5.field10 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field36[var8] = var5.method54();
			field37[var8] = var5.method54();
			int var10 = field34[var8] = var5.method56();
			int var11 = field35[var8] = var5.method56();
			int var12 = var5.method54();
			int var13 = var10 * var11;
			field33[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field33[var8][var14] = var4.method55();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field33[var8][var10 * var16 + var15] = var4.method55();
					}
				}
			}

			if (var11 > field39 && var8 < 128) {
				field39 = var11;
			}

			field36[var8] = 1;
			field38[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field33[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field38[var8]--;
				field36[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field33[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field38[var8]--;
			}
		}

		if (arg1) {
			field38[32] = field38[73];
		} else {
			field38[32] = field38[105];
		}
	}

	@ObfuscatedName("BKBLJVKV.a(IILjava/lang/String;II)V")
	public void method95(int arg0, String arg1, int arg2, int arg3) {
		method100(arg2, arg1, arg3 - method99(arg1), arg0);
	}

	@ObfuscatedName("BKBLJVKV.a(IBILjava/lang/String;I)V")
	public void method96(int arg0, int arg1, String arg2, int arg3) {
		method100(arg0, arg2, arg3 - method99(arg2) / 2, arg1);
	}

	@ObfuscatedName("BKBLJVKV.a(ZLjava/lang/String;IIII)V")
	public void method97(boolean arg0, String arg1, int arg2, int arg3, int arg4) {
		method104(arg0, arg3, arg4 - method98(arg1) / 2, arg2, arg1);
	}

	@ObfuscatedName("BKBLJVKV.a(Ljava/lang/String;I)I")
	public int method98(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field38[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("BKBLJVKV.b(Ljava/lang/String;I)I")
	public int method99(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field38[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("BKBLJVKV.a(ILjava/lang/String;III)V")
	public void method100(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg0 -= field39;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method107(field33[var6], field36[var6] + arg2, field37[var6] + arg0, field34[var6], field35[var6], arg3);
				}

				arg2 += field38[var6];
			}
		}
	}

	@ObfuscatedName("BKBLJVKV.a(ILjava/lang/String;IIII)V")
	public void method101(int arg0, String arg1, int arg2, int arg3, int arg4) {
		if (arg1 != null) {
			arg2 -= method99(arg1) / 2;
			arg0 -= field39;
			for (int var6 = 0; var6 < arg1.length(); var6++) {
				char var7 = arg1.charAt(var6);
				if (var7 != ' ') {
					method107(field33[var7], field36[var7] + arg2, field37[var7] + arg0 + (int) (Math.sin(arg3 / 5.0D + var6 / 2.0D) * 5.0D), field34[var7], field35[var7], arg4);
				}

				arg2 += field38[var7];
			}
		}
	}

	@ObfuscatedName("BKBLJVKV.a(IIIIILjava/lang/String;)V")
	public void method102(int arg0, int arg1, int arg2, int arg3, String arg4) {
		if (arg4 != null) {
			arg3 -= method99(arg4) / 2;
			arg1 -= field39;
			for (int var6 = 0; var6 < arg4.length(); var6++) {
				char var7 = arg4.charAt(var6);
				if (var7 != ' ') {
					method107(field33[var7], field36[var7] + arg3 + (int) (Math.sin(arg0 / 5.0D + var6 / 5.0D) * 5.0D), field37[var7] + arg1 + (int) (Math.sin(arg0 / 5.0D + var6 / 3.0D) * 5.0D), field34[var7], field35[var7], arg2);
				}

				arg3 += field38[var7];
			}
		}
	}

	@ObfuscatedName("BKBLJVKV.a(IIIIILjava/lang/String;I)V")
	public void method103(int arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
		if (arg4 != null) {
			double var7 = 7.0D - arg0 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg2 -= method99(arg4) / 2;
			arg3 -= field39;
			for (int var9 = 0; var9 < arg4.length(); var9++) {
				char var10 = arg4.charAt(var9);
				if (var10 != ' ') {
					method107(field33[var10], field36[var10] + arg2, field37[var10] + arg3 + (int) (Math.sin(var9 / 1.5D + arg5) * var7), field34[var10], field35[var10], arg1);
				}

				arg2 += field38[var10];
			}
		}
	}

	@ObfuscatedName("BKBLJVKV.a(ZIIILjava/lang/String;I)V")
	public void method104(boolean arg0, int arg1, int arg2, int arg3, String arg4) {
		field41 = false;
		int var6 = arg2;
		if (arg4 != null) {
			arg1 -= field39;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method106(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg3 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg0) {
							method107(field33[var9], field36[var9] + arg2 + 1, field37[var9] + arg1 + 1, field34[var9], field35[var9], 0);
						}

						method107(field33[var9], field36[var9] + arg2, field37[var9] + arg1, field34[var9], field35[var9], arg3);
					}

					arg2 += field38[var9];
				}
			}

			if (field41) {
				CCFLBOBS.method146(arg2 - var6, var6, 0x800000, (int) (field39 * 0.7D) + arg1);
			}
		}
	}

	@ObfuscatedName("BKBLJVKV.a(IIIIIZLjava/lang/String;)V")
	public void method105(int arg0, int arg1, int arg2, int arg3, boolean arg4, String arg5) {
		if (arg5 != null) {
			field40.setSeed(arg0);
			int var7 = (field40.nextInt() & 0x1F) + 192;
			arg1 -= field39;
			for (int var8 = 0; var8 < arg5.length(); var8++) {
				if (arg5.charAt(var8) == '@' && var8 + 4 < arg5.length() && arg5.charAt(var8 + 4) == '@') {
					int var9 = method106(arg5.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg2 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg5.charAt(var8);
					if (var10 != ' ') {
						if (arg4) {
							method109(field36[var10] + arg3 + 1, field35[var10], 0, field37[var10] + arg1 + 1, field34[var10], 192, field33[var10]);
						}

						method109(field36[var10] + arg3, field35[var10], arg2, field37[var10] + arg1, field34[var10], var7, field33[var10]);
					}

					arg3 += field38[var10];
					if ((field40.nextInt() & 0x3) == 0) {
						arg3++;
					}
				}
			}
		}
	}

	@ObfuscatedName("BKBLJVKV.c(Ljava/lang/String;I)I")
	public int method106(String arg0) {
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
				field41 = true;
			}

			if (arg0.equals("end")) {
				field41 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("BKBLJVKV.a([BIIIII)V")
	public void method107(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = CCFLBOBS.field91 * arg2 + arg1;
		int var8 = CCFLBOBS.field91 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < CCFLBOBS.field93) {
			int var11 = CCFLBOBS.field93 - arg2;
			arg4 -= var11;
			arg2 = CCFLBOBS.field93;
			var10 += arg3 * var11;
			var7 += CCFLBOBS.field91 * var11;
		}

		if (arg2 + arg4 >= CCFLBOBS.field94) {
			arg4 -= arg2 + arg4 + 1 - CCFLBOBS.field94;
		}

		if (arg1 < CCFLBOBS.field95) {
			int var12 = CCFLBOBS.field95 - arg1;
			arg3 -= var12;
			arg1 = CCFLBOBS.field95;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= CCFLBOBS.field96) {
			int var13 = arg1 + arg3 + 1 - CCFLBOBS.field96;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method108(CCFLBOBS.field90, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("BKBLJVKV.a([I[BIIIIIII)V")
	public void method108(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("BKBLJVKV.a(IIIIIBI[B)V")
	public void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
		int var8 = CCFLBOBS.field91 * arg3 + arg0;
		int var9 = CCFLBOBS.field91 - arg4;
		int var10 = 0;
		int var11 = 0;
		if (arg3 < CCFLBOBS.field93) {
			int var12 = CCFLBOBS.field93 - arg3;
			arg1 -= var12;
			arg3 = CCFLBOBS.field93;
			var11 += arg4 * var12;
			var8 += CCFLBOBS.field91 * var12;
		}

		if (arg1 + arg3 >= CCFLBOBS.field94) {
			arg1 -= arg1 + arg3 + 1 - CCFLBOBS.field94;
		}

		if (arg0 < CCFLBOBS.field95) {
			int var13 = CCFLBOBS.field95 - arg0;
			arg4 -= var13;
			arg0 = CCFLBOBS.field95;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg0 + arg4 >= CCFLBOBS.field96) {
			int var14 = arg0 + arg4 + 1 - CCFLBOBS.field96;
			arg4 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg4 > 0 && arg1 > 0) {
			method110(var10, arg6, var8, arg2, arg1, arg5, var9, CCFLBOBS.field90, var11, arg4);
		}
	}

	@ObfuscatedName("BKBLJVKV.a(I[BIIIIII[III)V")
	public void method110(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		arg3 = ((arg3 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((arg3 & 0xFF00) * arg5 & 0xFF0000) >> 8;
		arg5 = 256 - arg5;
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = -arg9; var12 < 0; var12++) {
				if (arg1[arg8++] == 0) {
					arg2++;
				} else {
					int var13 = arg7[arg2];
					arg7[arg2++] = (((var13 & 0xFF00FF) * arg5 & 0xFF00FF00) + ((var13 & 0xFF00) * arg5 & 0xFF0000) >> 8) + arg3;
				}
			}

			arg2 += arg6;
			arg8 += arg0;
		}
	}
}
