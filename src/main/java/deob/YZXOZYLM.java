package deob;

import java.util.Random;

@ObfuscatedName("YZXOZYLM")
public final class YZXOZYLM extends ACKHPAZA {

	@ObfuscatedName("YZXOZYLM.K")
	public byte[][] field1448 = new byte[256][];

	@ObfuscatedName("YZXOZYLM.L")
	public int[] field1449 = new int[256];

	@ObfuscatedName("YZXOZYLM.M")
	public int[] field1450 = new int[256];

	@ObfuscatedName("YZXOZYLM.N")
	public int[] field1451 = new int[256];

	@ObfuscatedName("YZXOZYLM.O")
	public int[] field1452 = new int[256];

	@ObfuscatedName("YZXOZYLM.P")
	public int[] field1453 = new int[256];

	@ObfuscatedName("YZXOZYLM.R")
	public Random field1455 = new Random();

	@ObfuscatedName("YZXOZYLM.S")
	public boolean field1456 = false;

	@ObfuscatedName("YZXOZYLM.Q")
	public int field1454;

	public YZXOZYLM(FIGUVTWB arg0, String arg1, boolean arg2) {
		MUKVLYLC var4 = new MUKVLYLC(arg0.method209(arg1 + ".dat", null));
		MUKVLYLC var5 = new MUKVLYLC(arg0.method209("index.dat", null));
		boolean var6 = true;
		var5.field812 = var4.method294() + 4;
		int var7 = var5.method292();
		if (var7 > 0) {
			var5.field812 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field1451[var8] = var5.method292();
			field1452[var8] = var5.method292();
			int var10 = field1449[var8] = var5.method294();
			int var11 = field1450[var8] = var5.method294();
			int var12 = var5.method292();
			int var13 = var10 * var11;
			field1448[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field1448[var8][var14] = var4.method293();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field1448[var8][var10 * var16 + var15] = var4.method293();
					}
				}
			}

			if (var11 > field1454 && var8 < 128) {
				field1454 = var11;
			}

			field1451[var8] = 1;
			field1453[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field1448[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field1453[var8]--;
				field1451[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field1448[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field1453[var8]--;
			}
		}

		if (arg2) {
			field1453[32] = field1453[73];
		} else {
			field1453[32] = field1453[105];
		}
	}

	@ObfuscatedName("YZXOZYLM.a(IILjava/lang/String;II)V")
	public void method572(int arg0, int arg1, String arg2, int arg3) {
		method577(arg3, arg2, arg0 - method576(arg2), arg1);
	}

	@ObfuscatedName("YZXOZYLM.a(Ljava/lang/String;IIII)V")
	public void method573(String arg0, int arg1, int arg2, int arg3) {
		method577(arg1, arg0, arg2 - method576(arg0) / 2, arg3);
	}

	@ObfuscatedName("YZXOZYLM.a(IILjava/lang/String;IIZ)V")
	public void method574(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
		method581(arg3, arg1 - method575(arg2) / 2, arg0, arg4, arg2);
	}

	@ObfuscatedName("YZXOZYLM.a(ZLjava/lang/String;)I")
	public int method575(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field1453[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("YZXOZYLM.a(ILjava/lang/String;)I")
	public int method576(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field1453[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("YZXOZYLM.a(ILjava/lang/String;IIZ)V")
	public void method577(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg0 -= field1454;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method584(field1448[var6], field1451[var6] + arg2, field1452[var6] + arg0, field1449[var6], field1450[var6], arg3);
				}

				arg2 += field1453[var6];
			}
		}
	}

	@ObfuscatedName("YZXOZYLM.a(IIIILjava/lang/String;I)V")
	public void method578(int arg0, int arg1, int arg2, String arg3, int arg4) {
		if (arg3 != null) {
			arg1 -= method576(arg3) / 2;
			arg4 -= field1454;
			for (int var6 = 0; var6 < arg3.length(); var6++) {
				char var7 = arg3.charAt(var6);
				if (var7 != ' ') {
					method584(field1448[var7], field1451[var7] + arg1, field1452[var7] + arg4 + (int) (Math.sin(arg2 / 5.0D + var6 / 2.0D) * 5.0D), field1449[var7], field1450[var7], arg0);
				}

				arg1 += field1453[var7];
			}
		}
	}

	@ObfuscatedName("YZXOZYLM.a(Ljava/lang/String;IIIZI)V")
	public void method579(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg4 -= method576(arg0) / 2;
			arg3 -= field1454;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method584(field1448[var7], field1451[var7] + arg4 + (int) (Math.sin(arg1 / 5.0D + var6 / 5.0D) * 5.0D), field1452[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 3.0D) * 5.0D), field1449[var7], field1450[var7], arg2);
				}

				arg4 += field1453[var7];
			}
		}
	}

	@ObfuscatedName("YZXOZYLM.a(IIIIIBLjava/lang/String;)V")
	public void method580(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5) {
		if (arg5 != null) {
			double var7 = 7.0D - arg4 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg2 -= method576(arg5) / 2;
			arg3 -= field1454;
			for (int var9 = 0; var9 < arg5.length(); var9++) {
				char var10 = arg5.charAt(var9);
				if (var10 != ' ') {
					method584(field1448[var10], field1451[var10] + arg2, field1452[var10] + arg3 + (int) (Math.sin(var9 / 1.5D + arg0) * var7), field1449[var10], field1450[var10], arg1);
				}

				arg2 += field1453[var10];
			}
		}
	}

	@ObfuscatedName("YZXOZYLM.a(IIIIZLjava/lang/String;)V")
	public void method581(int arg0, int arg1, int arg2, boolean arg3, String arg4) {
		field1456 = false;
		int var6 = arg1;
		if (arg4 != null) {
			arg0 -= field1454;
			for (int var7 = 0; var7 < arg4.length(); var7++) {
				if (arg4.charAt(var7) == '@' && var7 + 4 < arg4.length() && arg4.charAt(var7 + 4) == '@') {
					int var8 = method583(arg4.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg2 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg4.charAt(var7);
					if (var9 != ' ') {
						if (arg3) {
							method584(field1448[var9], field1451[var9] + arg1 + 1, field1452[var9] + arg0 + 1, field1449[var9], field1450[var9], 0);
						}

						method584(field1448[var9], field1451[var9] + arg1, field1452[var9] + arg0, field1449[var9], field1450[var9], arg2);
					}

					arg1 += field1453[var9];
				}
			}

			if (field1456) {
				ACKHPAZA.method9(0x800000, var6, (int) (field1454 * 0.7D) + arg0, arg1 - var6);
			}
		}
	}

	@ObfuscatedName("YZXOZYLM.a(IILjava/lang/String;IBIZ)V")
	public void method582(int arg0, int arg1, String arg2, int arg3, int arg4, boolean arg5) {
		if (arg2 != null) {
			field1455.setSeed(arg0);
			int var7 = (field1455.nextInt() & 0x1F) + 192;
			arg4 -= field1454;
			for (int var8 = 0; var8 < arg2.length(); var8++) {
				if (arg2.charAt(var8) == '@' && var8 + 4 < arg2.length() && arg2.charAt(var8 + 4) == '@') {
					int var9 = method583(arg2.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg1 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg2.charAt(var8);
					if (var10 != ' ') {
						if (arg5) {
							method586(192, 0, field1450[var10], field1451[var10] + arg3 + 1, field1452[var10] + arg4 + 1, field1449[var10], field1448[var10]);
						}

						method586(var7, arg1, field1450[var10], field1451[var10] + arg3, field1452[var10] + arg4, field1449[var10], field1448[var10]);
					}

					arg3 += field1453[var10];
					if ((field1455.nextInt() & 0x3) == 0) {
						arg3++;
					}
				}
			}
		}
	}

	@ObfuscatedName("YZXOZYLM.a(Ljava/lang/String;Z)I")
	public int method583(String arg0) {
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
				field1456 = true;
			}

			if (arg0.equals("end")) {
				field1456 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("YZXOZYLM.a([BIIIII)V")
	public void method584(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = ACKHPAZA.field2 * arg2 + arg1;
		int var8 = ACKHPAZA.field2 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < ACKHPAZA.field4) {
			int var11 = ACKHPAZA.field4 - arg2;
			arg4 -= var11;
			arg2 = ACKHPAZA.field4;
			var10 += arg3 * var11;
			var7 += ACKHPAZA.field2 * var11;
		}

		if (arg2 + arg4 >= ACKHPAZA.field5) {
			arg4 -= arg2 + arg4 + 1 - ACKHPAZA.field5;
		}

		if (arg1 < ACKHPAZA.field6) {
			int var12 = ACKHPAZA.field6 - arg1;
			arg3 -= var12;
			arg1 = ACKHPAZA.field6;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= ACKHPAZA.field7) {
			int var13 = arg1 + arg3 + 1 - ACKHPAZA.field7;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method585(ACKHPAZA.field1, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("YZXOZYLM.a([I[BIIIIIII)V")
	public void method585(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("YZXOZYLM.a(IIIIIII[B)V")
	public void method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
		int var8 = ACKHPAZA.field2 * arg4 + arg3;
		int var9 = ACKHPAZA.field2 - arg5;
		int var10 = 0;
		int var11 = 0;
		if (arg4 < ACKHPAZA.field4) {
			int var12 = ACKHPAZA.field4 - arg4;
			arg2 -= var12;
			arg4 = ACKHPAZA.field4;
			var11 += arg5 * var12;
			var8 += ACKHPAZA.field2 * var12;
		}

		if (arg2 + arg4 >= ACKHPAZA.field5) {
			arg2 -= arg2 + arg4 + 1 - ACKHPAZA.field5;
		}

		if (arg3 < ACKHPAZA.field6) {
			int var13 = ACKHPAZA.field6 - arg3;
			arg5 -= var13;
			arg3 = ACKHPAZA.field6;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg3 + arg5 >= ACKHPAZA.field7) {
			int var14 = arg3 + arg5 + 1 - ACKHPAZA.field7;
			arg5 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg5 > 0 && arg2 > 0) {
			method587(arg6, var8, arg1, var9, ACKHPAZA.field1, arg5, arg2, arg0, var11, var10);
		}
	}

	@ObfuscatedName("YZXOZYLM.a([BIIIZ[IIIIII)V")
	public void method587(byte[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		arg2 = ((arg2 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg7 & 0xFF0000) >> 8;
		arg7 = 256 - arg7;
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = -arg5; var12 < 0; var12++) {
				if (arg0[arg8++] == 0) {
					arg1++;
				} else {
					int var13 = arg4[arg1];
					arg4[arg1++] = (((var13 & 0xFF00FF) * arg7 & 0xFF00FF00) + ((var13 & 0xFF00) * arg7 & 0xFF0000) >> 8) + arg2;
				}
			}

			arg1 += arg3;
			arg8 += arg9;
		}
	}
}
