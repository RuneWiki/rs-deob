package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("DUMEPGRH")
public final class DUMEPGRH extends SXFSGYHA {

	@ObfuscatedName("DUMEPGRH.H")
	public int[] field543;

	@ObfuscatedName("DUMEPGRH.M")
	public int field548;

	@ObfuscatedName("DUMEPGRH.I")
	public int field544;

	@ObfuscatedName("DUMEPGRH.N")
	public int field549;

	@ObfuscatedName("DUMEPGRH.J")
	public int field545;

	@ObfuscatedName("DUMEPGRH.L")
	public int field547;

	@ObfuscatedName("DUMEPGRH.K")
	public int field546;

	public DUMEPGRH(int arg0, int arg1) {
		field543 = new int[arg0 * arg1];
		field544 = field548 = arg0;
		field545 = field549 = arg1;
		field546 = field547 = 0;
	}

	public DUMEPGRH(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field544 = var3.getWidth(arg1);
			field545 = var3.getHeight(arg1);
			field548 = field544;
			field549 = field545;
			field546 = 0;
			field547 = 0;
			field543 = new int[field545 * field544];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field544, field545, field543, 0, field544);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public DUMEPGRH(SPZBTZXL arg0, String arg1, int arg2) {
		LDILQFVA var4 = new LDILQFVA(arg0.method515(arg1 + ".dat", null));
		LDILQFVA var5 = new LDILQFVA(arg0.method515("index.dat", null));
		var5.field902 = var4.method404();
		field548 = var5.method404();
		field549 = var5.method404();
		int var6 = var5.method402();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method406();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field902 += 2;
			var4.field902 += var5.method404() * var5.method404();
			var5.field902++;
		}

		field546 = var5.method402();
		field547 = var5.method402();
		field544 = var5.method404();
		field545 = var5.method404();
		int var10 = var5.method402();
		int var11 = field545 * field544;
		field543 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field543[var12] = var7[var4.method402()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field544; var13++) {
				for (int var14 = 0; var14 < field545; var14++) {
					field543[field544 * var14 + var13] = var7[var4.method402()];
				}
			}
		}
	}

	@ObfuscatedName("DUMEPGRH.b(Z)V")
	public void method214() {
		SXFSGYHA.method516(field544, field543, field545);
	}

	@ObfuscatedName("DUMEPGRH.a(IIII)V")
	public void method215(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field543.length; var4++) {
			int var5 = field543[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg1;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 0xFF;
				var7 += arg0;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				int var8 = var5 & 0xFF;
				var8 += arg2;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field543[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("DUMEPGRH.b(I)V")
	public void method216() {
		int[] var1 = new int[field549 * field548];
		for (int var2 = 0; var2 < field545; var2++) {
			for (int var3 = 0; var3 < field544; var3++) {
				var1[(field547 + var2) * field548 + field546 + var3] = field543[field544 * var2 + var3];
			}
		}

		field543 = var1;
		field544 = field548;
		field545 = field549;
		field546 = 0;
		field547 = 0;
	}

	@ObfuscatedName("DUMEPGRH.a(ZII)V")
	public void method217(int arg0, int arg1) {
		arg0 += field546;
		arg1 += field547;
		int var3 = SXFSGYHA.field1126 * arg1 + arg0;
		int var4 = 0;
		int var5 = field545;
		int var6 = field544;
		int var7 = SXFSGYHA.field1126 - var6;
		int var8 = 0;

		if (arg1 < SXFSGYHA.field1128) {
			int var9 = SXFSGYHA.field1128 - arg1;
			var5 -= var9;
			arg1 = SXFSGYHA.field1128;
			var4 += var6 * var9;
			var3 += SXFSGYHA.field1126 * var9;
		}

		if (arg1 + var5 > SXFSGYHA.field1129) {
			var5 -= arg1 + var5 - SXFSGYHA.field1129;
		}

		if (arg0 < SXFSGYHA.field1130) {
			int var10 = SXFSGYHA.field1130 - arg0;
			var6 -= var10;
			arg0 = SXFSGYHA.field1130;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > SXFSGYHA.field1131) {
			int var11 = arg0 + var6 - SXFSGYHA.field1131;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method218(var8, var7, var4, var3, var6, var5, SXFSGYHA.field1125, field543);
		}
	}

	@ObfuscatedName("DUMEPGRH.a(ZIIIIII[I[I)V")
	public void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7) {
		int var9 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg6[arg3++] = arg7[arg2++];
				arg6[arg3++] = arg7[arg2++];
				arg6[arg3++] = arg7[arg2++];
				arg6[arg3++] = arg7[arg2++];
			}

			for (int var12 = arg4; var12 < 0; var12++) {
				arg6[arg3++] = arg7[arg2++];
			}

			arg3 += arg1;
			arg2 += arg0;
		}
	}

	@ObfuscatedName("DUMEPGRH.a(III)V")
	public void method219(int arg0, int arg1) {
		arg1 += field546;
		arg0 += field547;
		int var3 = SXFSGYHA.field1126 * arg0 + arg1;
		int var4 = 0;
		int var5 = field545;
		int var6 = field544;
		int var7 = SXFSGYHA.field1126 - var6;
		int var8 = 0;

		if (arg0 < SXFSGYHA.field1128) {
			int var9 = SXFSGYHA.field1128 - arg0;
			var5 -= var9;
			arg0 = SXFSGYHA.field1128;
			var4 += var6 * var9;
			var3 += SXFSGYHA.field1126 * var9;
		}

		if (arg0 + var5 > SXFSGYHA.field1129) {
			var5 -= arg0 + var5 - SXFSGYHA.field1129;
		}

		if (arg1 < SXFSGYHA.field1130) {
			int var10 = SXFSGYHA.field1130 - arg1;
			var6 -= var10;
			arg1 = SXFSGYHA.field1130;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > SXFSGYHA.field1131) {
			int var11 = arg1 + var6 - SXFSGYHA.field1131;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method220(SXFSGYHA.field1125, field543, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("DUMEPGRH.a([I[IIIIIIII)V")
	public void method220(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				int var13 = arg1[arg3++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var13;
				}

				int var14 = arg1[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var14;
				}

				int var15 = arg1[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var15;
				}

				int var16 = arg1[arg3++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var16;
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				int var18 = arg1[arg3++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = var18;
				}
			}

			arg4 += arg7;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("DUMEPGRH.b(IIII)V")
	public void method221(int arg0, int arg1, int arg2) {
		arg0 += field546;
		arg2 += field547;
		int var4 = SXFSGYHA.field1126 * arg2 + arg0;
		int var5 = 0;
		int var6 = field545;
		int var7 = field544;
		int var8 = SXFSGYHA.field1126 - var7;
		int var9 = 0;

		if (arg2 < SXFSGYHA.field1128) {
			int var10 = SXFSGYHA.field1128 - arg2;
			var6 -= var10;
			arg2 = SXFSGYHA.field1128;
			var5 += var7 * var10;
			var4 += SXFSGYHA.field1126 * var10;
		}

		if (arg2 + var6 > SXFSGYHA.field1129) {
			var6 -= arg2 + var6 - SXFSGYHA.field1129;
		}

		if (arg0 < SXFSGYHA.field1130) {
			int var11 = SXFSGYHA.field1130 - arg0;
			var7 -= var11;
			arg0 = SXFSGYHA.field1130;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > SXFSGYHA.field1131) {
			int var12 = arg0 + var7 - SXFSGYHA.field1131;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method222(field543, var4, var7, var5, var8, var9, var6, 0, arg1, SXFSGYHA.field1125);
		}
	}

	@ObfuscatedName("DUMEPGRH.a([IIIIIIIIII[I)V")
	public void method222(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		int var11 = 256 - arg8;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = arg0[arg3++];
				if (var14 == 0) {
					arg1++;
				} else {
					int var15 = arg9[arg1];
					arg9[arg1++] = ((var14 & 0xFF00FF) * arg8 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg8 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg1 += arg4;
			arg3 += arg5;
		}
	}

	@ObfuscatedName("DUMEPGRH.a(IIIIII[III[II)V")
	public void method223(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int[] arg8, int arg9) {
		try {
			int var11 = -arg6 / 2;
			int var12 = -arg2 / 2;
			int var13 = (int) (Math.sin(arg1 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg1 / 326.11D) * 65536.0D);
			var13 = arg9 * var13 >> 8;
			var14 = arg9 * var14 >> 8;
			int var15 = (arg3 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg4 << 16) + var12 * var14 - var11 * var13;
			int var17 = SXFSGYHA.field1126 * arg7 + arg0;
			for (int var18 = 0; var18 < arg2; var18++) {
				int var19 = arg5[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg8[var18]; var23 < 0; var23++) {
					SXFSGYHA.field1125[var20++] = field543[(var21 >> 16) + (var22 >> 16) * field544];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += SXFSGYHA.field1126;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("DUMEPGRH.a(IIIIIIDII)V")
	public void method224(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7) {
		try {
			int var10 = -arg7 / 2;
			int var11 = -arg1 / 2;
			int var12 = (int) (Math.sin(arg5) * 65536.0D);
			int var13 = (int) (Math.cos(arg5) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg0 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg6 << 16) + var11 * var13 - var10 * var12;
			int var16 = SXFSGYHA.field1126 * arg2 + arg3;
			for (int var17 = 0; var17 < arg1; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg7; var21 < 0; var21++) {
					int var22 = field543[(var19 >> 16) + (var20 >> 16) * field544];
					if (var22 == 0) {
						var18++;
					} else {
						SXFSGYHA.field1125[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += SXFSGYHA.field1126;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("DUMEPGRH.a(IILLKEIRLLI;Z)V")
	public void method225(int arg0, int arg1, LKEIRLLI arg2) {
		arg1 += field546;
		arg0 += field547;
		int var4 = SXFSGYHA.field1126 * arg0 + arg1;
		int var5 = 0;
		int var6 = field545;
		int var7 = field544;
		int var8 = SXFSGYHA.field1126 - var7;
		int var9 = 0;

		if (arg0 < SXFSGYHA.field1128) {
			int var10 = SXFSGYHA.field1128 - arg0;
			var6 -= var10;
			arg0 = SXFSGYHA.field1128;
			var5 += var7 * var10;
			var4 += SXFSGYHA.field1126 * var10;
		}

		if (arg0 + var6 > SXFSGYHA.field1129) {
			var6 -= arg0 + var6 - SXFSGYHA.field1129;
		}

		if (arg1 < SXFSGYHA.field1130) {
			int var11 = SXFSGYHA.field1130 - arg1;
			var7 -= var11;
			arg1 = SXFSGYHA.field1130;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > SXFSGYHA.field1131) {
			int var12 = arg1 + var7 - SXFSGYHA.field1131;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method226(0, var7, var5, var8, var4, field543, SXFSGYHA.field1125, var6, var9, arg2.field914);
		}
	}

	@ObfuscatedName("DUMEPGRH.a(ZIIIII[I[III[B)V")
	public void method226(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, byte[] arg9) {
		int var11 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg5[arg2++];
				if (var14 != 0 && arg9[arg4] == 0) {
					arg6[arg4++] = var14;
				} else {
					arg4++;
				}

				int var15 = arg5[arg2++];
				if (var15 != 0 && arg9[arg4] == 0) {
					arg6[arg4++] = var15;
				} else {
					arg4++;
				}

				int var16 = arg5[arg2++];
				if (var16 != 0 && arg9[arg4] == 0) {
					arg6[arg4++] = var16;
				} else {
					arg4++;
				}

				int var17 = arg5[arg2++];
				if (var17 != 0 && arg9[arg4] == 0) {
					arg6[arg4++] = var17;
				} else {
					arg4++;
				}
			}

			for (int var18 = arg1; var18 < 0; var18++) {
				int var19 = arg5[arg2++];
				if (var19 != 0 && arg9[arg4] == 0) {
					arg6[arg4++] = var19;
				} else {
					arg4++;
				}
			}

			arg4 += arg3;
			arg2 += arg8;
		}
	}
}
