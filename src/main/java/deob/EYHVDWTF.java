package deob;

import java.util.Random;

@ObfuscatedName("EYHVDWTF")
public final class EYHVDWTF extends SXFSGYHA {

	@ObfuscatedName("EYHVDWTF.E")
	public byte[][] field616 = new byte[256][];

	@ObfuscatedName("EYHVDWTF.F")
	public int[] field617 = new int[256];

	@ObfuscatedName("EYHVDWTF.G")
	public int[] field618 = new int[256];

	@ObfuscatedName("EYHVDWTF.H")
	public int[] field619 = new int[256];

	@ObfuscatedName("EYHVDWTF.I")
	public int[] field620 = new int[256];

	@ObfuscatedName("EYHVDWTF.J")
	public int[] field621 = new int[256];

	@ObfuscatedName("EYHVDWTF.L")
	public Random field623 = new Random();

	@ObfuscatedName("EYHVDWTF.M")
	public boolean field624 = false;

	@ObfuscatedName("EYHVDWTF.K")
	public int field622;

	public EYHVDWTF(SPZBTZXL arg0, boolean arg1, String arg2) {
		LDILQFVA var4 = new LDILQFVA(arg0.method515(arg2 + ".dat", null));
		LDILQFVA var5 = new LDILQFVA(arg0.method515("index.dat", null));
		boolean var6 = true;
		var5.field902 = var4.method404() + 4;
		int var7 = var5.method402();
		if (var7 > 0) {
			var5.field902 += (var7 - 1) * 3;
		}

		for (int var8 = 0; var8 < 256; var8++) {
			field619[var8] = var5.method402();
			field620[var8] = var5.method402();
			int var10 = field617[var8] = var5.method404();
			int var11 = field618[var8] = var5.method404();
			int var12 = var5.method402();
			int var13 = var10 * var11;
			field616[var8] = new byte[var13];
			if (var12 == 0) {
				for (int var14 = 0; var14 < var13; var14++) {
					field616[var8][var14] = var4.method403();
				}
			} else if (var12 == 1) {
				for (int var15 = 0; var15 < var10; var15++) {
					for (int var16 = 0; var16 < var11; var16++) {
						field616[var8][var10 * var16 + var15] = var4.method403();
					}
				}
			}

			if (var11 > field622 && var8 < 128) {
				field622 = var11;
			}

			field619[var8] = 1;
			field621[var8] = var10 + 2;
			int var17 = 0;
			for (int var18 = var11 / 7; var18 < var11; var18++) {
				var17 += field616[var8][var10 * var18];
			}

			if (var17 <= var11 / 7) {
				field621[var8]--;
				field619[var8] = 0;
			}

			int var19 = 0;
			for (int var20 = var11 / 7; var20 < var11; var20++) {
				var19 += field616[var8][var10 * var20 + var10 - 1];
			}

			if (var19 <= var11 / 7) {
				field621[var8]--;
			}
		}

		if (arg1) {
			field621[32] = field621[73];
		} else {
			field621[32] = field621[105];
		}
	}

	@ObfuscatedName("EYHVDWTF.a(Ljava/lang/String;BIII)V")
	public void method252(String arg0, int arg1, int arg2, int arg3) {
		method257(arg1 - method256(arg0), arg0, arg3, arg2);
	}

	@ObfuscatedName("EYHVDWTF.a(Ljava/lang/String;IIII)V")
	public void method253(String arg0, int arg1, int arg2, int arg3) {
		method257(arg1 - method256(arg0) / 2, arg0, arg2, arg3);
	}

	@ObfuscatedName("EYHVDWTF.a(IIILjava/lang/String;ZZ)V")
	public void method254(int arg0, int arg1, int arg2, String arg3, boolean arg4) {
		method261(arg2, arg0 - method255(arg3) / 2, arg4, arg3, arg1);
	}

	@ObfuscatedName("EYHVDWTF.a(Ljava/lang/String;I)I")
	public int method255(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			if (arg0.charAt(var3) == '@' && var3 + 4 < arg0.length() && arg0.charAt(var3 + 4) == '@') {
				var3 += 4;
			} else {
				var2 += field621[arg0.charAt(var3)];
			}
		}

		return var2;
	}

	@ObfuscatedName("EYHVDWTF.a(ILjava/lang/String;)I")
	public int method256(String arg0) {
		if (arg0 == null) {
			return 0;
		}

		int var2 = 0;
		for (int var3 = 0; var3 < arg0.length(); var3++) {
			var2 += field621[arg0.charAt(var3)];
		}

		return var2;
	}

	@ObfuscatedName("EYHVDWTF.a(ILjava/lang/String;III)V")
	public void method257(int arg0, String arg1, int arg2, int arg3) {
		if (arg1 != null) {
			arg2 -= field622;
			for (int var5 = 0; var5 < arg1.length(); var5++) {
				char var6 = arg1.charAt(var5);
				if (var6 != ' ') {
					method264(field616[var6], field619[var6] + arg0, field620[var6] + arg2, field617[var6], field618[var6], arg3);
				}

				arg0 += field621[var6];
			}
		}
	}

	@ObfuscatedName("EYHVDWTF.a(Ljava/lang/String;IIIII)V")
	public void method258(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg4 -= method256(arg0) / 2;
			arg3 -= field622;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method264(field616[var7], field619[var7] + arg4, field620[var7] + arg3 + (int) (Math.sin(arg1 / 5.0D + var6 / 2.0D) * 5.0D), field617[var7], field618[var7], arg2);
				}

				arg4 += field621[var7];
			}
		}
	}

	@ObfuscatedName("EYHVDWTF.b(Ljava/lang/String;IIIII)V")
	public void method259(String arg0, int arg1, int arg2, int arg3, int arg4) {
		if (arg0 != null) {
			arg3 -= method256(arg0) / 2;
			arg4 -= field622;
			for (int var6 = 0; var6 < arg0.length(); var6++) {
				char var7 = arg0.charAt(var6);
				if (var7 != ' ') {
					method264(field616[var7], field619[var7] + arg3 + (int) (Math.sin(arg2 / 5.0D + var6 / 5.0D) * 5.0D), field620[var7] + arg4 + (int) (Math.sin(arg2 / 5.0D + var6 / 3.0D) * 5.0D), field617[var7], field618[var7], arg1);
				}

				arg3 += field621[var7];
			}
		}
	}

	@ObfuscatedName("EYHVDWTF.a(Ljava/lang/String;IIIZII)V")
	public void method260(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 != null) {
			double var7 = 7.0D - arg4 / 8.0D;
			if (var7 < 0.0D) {
				var7 = 0.0D;
			}

			arg2 -= method256(arg0) / 2;
			arg1 -= field622;
			for (int var9 = 0; var9 < arg0.length(); var9++) {
				char var10 = arg0.charAt(var9);
				if (var10 != ' ') {
					method264(field616[var10], field619[var10] + arg2, field620[var10] + arg1 + (int) (Math.sin(var9 / 1.5D + arg5) * var7), field617[var10], field618[var10], arg3);
				}

				arg2 += field621[var10];
			}
		}
	}

	@ObfuscatedName("EYHVDWTF.a(IIZZLjava/lang/String;I)V")
	public void method261(int arg0, int arg1, boolean arg2, String arg3, int arg4) {
		field624 = false;
		int var6 = arg1;
		if (arg3 != null) {
			arg4 -= field622;
			for (int var7 = 0; var7 < arg3.length(); var7++) {
				if (arg3.charAt(var7) == '@' && var7 + 4 < arg3.length() && arg3.charAt(var7 + 4) == '@') {
					int var8 = method263(arg3.substring(var7 + 1, var7 + 4));
					if (var8 != -1) {
						arg0 = var8;
					}

					var7 += 4;
				} else {
					char var9 = arg3.charAt(var7);
					if (var9 != ' ') {
						if (arg2) {
							method264(field616[var9], field619[var9] + arg1 + 1, field620[var9] + arg4 + 1, field617[var9], field618[var9], 0);
						}

						method264(field616[var9], field619[var9] + arg1, field620[var9] + arg4, field617[var9], field618[var9], arg0);
					}

					arg1 += field621[var9];
				}
			}

			if (field624) {
				SXFSGYHA.method524((int) (field622 * 0.7D) + arg4, var6, 0x800000, arg1 - var6);
			}
		}
	}

	@ObfuscatedName("EYHVDWTF.a(ILjava/lang/String;ZIIII)V")
	public void method262(int arg0, String arg1, boolean arg2, int arg3, int arg4, int arg5) {
		if (arg1 != null) {
			field623.setSeed(arg4);
			int var7 = (field623.nextInt() & 0x1F) + 192;
			arg5 -= field622;
			for (int var8 = 0; var8 < arg1.length(); var8++) {
				if (arg1.charAt(var8) == '@' && var8 + 4 < arg1.length() && arg1.charAt(var8 + 4) == '@') {
					int var9 = method263(arg1.substring(var8 + 1, var8 + 4));
					if (var9 != -1) {
						arg0 = var9;
					}

					var8 += 4;
				} else {
					char var10 = arg1.charAt(var8);
					if (var10 != ' ') {
						if (arg2) {
							method266(192, field619[var10] + arg3 + 1, field618[var10], field617[var10], field620[var10] + arg5 + 1, field616[var10], 0);
						}

						method266(var7, field619[var10] + arg3, field618[var10], field617[var10], field620[var10] + arg5, field616[var10], arg0);
					}

					arg3 += field621[var10];
					if ((field623.nextInt() & 0x3) == 0) {
						arg3++;
					}
				}
			}
		}
	}

	@ObfuscatedName("EYHVDWTF.b(Ljava/lang/String;I)I")
	public int method263(String arg0) {
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
				field624 = true;
			}

			if (arg0.equals("end")) {
				field624 = false;
			}

			return -1;
		}
	}

	@ObfuscatedName("EYHVDWTF.a([BIIIII)V")
	public void method264(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = SXFSGYHA.field1126 * arg2 + arg1;
		int var8 = SXFSGYHA.field1126 - arg3;
		int var9 = 0;
		int var10 = 0;
		if (arg2 < SXFSGYHA.field1128) {
			int var11 = SXFSGYHA.field1128 - arg2;
			arg4 -= var11;
			arg2 = SXFSGYHA.field1128;
			var10 += arg3 * var11;
			var7 += SXFSGYHA.field1126 * var11;
		}

		if (arg2 + arg4 >= SXFSGYHA.field1129) {
			arg4 -= arg2 + arg4 + 1 - SXFSGYHA.field1129;
		}

		if (arg1 < SXFSGYHA.field1130) {
			int var12 = SXFSGYHA.field1130 - arg1;
			arg3 -= var12;
			arg1 = SXFSGYHA.field1130;
			var10 += var12;
			var7 += var12;
			var9 += var12;
			var8 += var12;
		}

		if (arg1 + arg3 >= SXFSGYHA.field1131) {
			int var13 = arg1 + arg3 + 1 - SXFSGYHA.field1131;
			arg3 -= var13;
			var9 += var13;
			var8 += var13;
		}

		if (arg3 > 0 && arg4 > 0) {
			method265(SXFSGYHA.field1125, arg0, arg5, var10, var7, arg3, arg4, var8, var9);
		}
	}

	@ObfuscatedName("EYHVDWTF.a([I[BIIIIIII)V")
	public void method265(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("EYHVDWTF.a(BIIIII[BI)V")
	public void method266(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
		int var8 = SXFSGYHA.field1126 * arg4 + arg1;
		int var9 = SXFSGYHA.field1126 - arg3;
		int var10 = 0;
		int var11 = 0;
		if (arg4 < SXFSGYHA.field1128) {
			int var12 = SXFSGYHA.field1128 - arg4;
			arg2 -= var12;
			arg4 = SXFSGYHA.field1128;
			var11 += arg3 * var12;
			var8 += SXFSGYHA.field1126 * var12;
		}

		if (arg2 + arg4 >= SXFSGYHA.field1129) {
			arg2 -= arg2 + arg4 + 1 - SXFSGYHA.field1129;
		}

		if (arg1 < SXFSGYHA.field1130) {
			int var13 = SXFSGYHA.field1130 - arg1;
			arg3 -= var13;
			arg1 = SXFSGYHA.field1130;
			var11 += var13;
			var8 += var13;
			var10 += var13;
			var9 += var13;
		}

		if (arg1 + arg3 >= SXFSGYHA.field1131) {
			int var14 = arg1 + arg3 + 1 - SXFSGYHA.field1131;
			arg3 -= var14;
			var10 += var14;
			var9 += var14;
		}

		if (arg3 > 0 && arg2 > 0) {
			method267(var8, var9, arg2, arg3, arg6, var11, arg0, var10, SXFSGYHA.field1125, arg5);
		}
	}

	@ObfuscatedName("EYHVDWTF.a(IIIIIIIII[I[B)V")
	public void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, byte[] arg9) {
		arg4 = ((arg4 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((arg4 & 0xFF00) * arg6 & 0xFF0000) >> 8;
		arg6 = 256 - arg6;
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = -arg3; var12 < 0; var12++) {
				if (arg9[arg5++] == 0) {
					arg0++;
				} else {
					int var13 = arg8[arg0];
					arg8[arg0++] = (((var13 & 0xFF00FF) * arg6 & 0xFF00FF00) + ((var13 & 0xFF00) * arg6 & 0xFF0000) >> 8) + arg4;
				}
			}

			arg0 += arg1;
			arg5 += arg7;
		}
	}
}
