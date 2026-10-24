package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("TTFRDWZK")
public final class TTFRDWZK extends CXMSQZVC {

	@ObfuscatedName("TTFRDWZK.F")
	public int[] field1302;

	@ObfuscatedName("TTFRDWZK.K")
	public int field1307;

	@ObfuscatedName("TTFRDWZK.G")
	public int field1303;

	@ObfuscatedName("TTFRDWZK.L")
	public int field1308;

	@ObfuscatedName("TTFRDWZK.H")
	public int field1304;

	@ObfuscatedName("TTFRDWZK.J")
	public int field1306;

	@ObfuscatedName("TTFRDWZK.I")
	public int field1305;

	public TTFRDWZK(int arg0, int arg1) {
		field1302 = new int[arg0 * arg1];
		field1303 = field1307 = arg0;
		field1304 = field1308 = arg1;
		field1305 = field1306 = 0;
	}

	public TTFRDWZK(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1303 = var3.getWidth(arg1);
			field1304 = var3.getHeight(arg1);
			field1307 = field1303;
			field1308 = field1304;
			field1305 = 0;
			field1306 = 0;
			field1302 = new int[field1304 * field1303];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1303, field1304, field1302, 0, field1303);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public TTFRDWZK(TXPLZUUI arg0, String arg1, int arg2) {
		PKHWFJLM var4 = new PKHWFJLM(arg0.method506(arg1 + ".dat", null));
		PKHWFJLM var5 = new PKHWFJLM(arg0.method506("index.dat", null));
		var5.field971 = var4.method332();
		field1307 = var5.method332();
		field1308 = var5.method332();
		int var6 = var5.method330();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method334();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field971 += 2;
			var4.field971 += var5.method332() * var5.method332();
			var5.field971++;
		}

		field1305 = var5.method330();
		field1306 = var5.method330();
		field1303 = var5.method332();
		field1304 = var5.method332();
		int var10 = var5.method330();
		int var11 = field1304 * field1303;
		field1302 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1302[var12] = var7[var4.method330()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1303; var13++) {
				for (int var14 = 0; var14 < field1304; var14++) {
					field1302[field1303 * var14 + var13] = var7[var4.method330()];
				}
			}
		}
	}

	@ObfuscatedName("TTFRDWZK.c(I)V")
	public void method492() {
		CXMSQZVC.method197(field1304, field1303, field1302);
	}

	@ObfuscatedName("TTFRDWZK.a(ZIII)V")
	public void method493(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1302.length; var4++) {
			int var5 = field1302[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg0;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 0xFF;
				var7 += arg1;
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

				field1302[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("TTFRDWZK.d(I)V")
	public void method494() {
		int[] var1 = new int[field1308 * field1307];
		for (int var2 = 0; var2 < field1304; var2++) {
			for (int var3 = 0; var3 < field1303; var3++) {
				var1[(field1306 + var2) * field1307 + field1305 + var3] = field1302[field1303 * var2 + var3];
			}
		}

		field1302 = var1;
		field1303 = field1307;
		field1304 = field1308;
		field1305 = 0;
		field1306 = 0;
	}

	@ObfuscatedName("TTFRDWZK.a(III)V")
	public void method495(int arg0, int arg1) {
		arg1 += field1305;
		arg0 += field1306;
		int var3 = CXMSQZVC.field568 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1304;
		int var6 = field1303;
		int var7 = CXMSQZVC.field568 - var6;
		int var8 = 0;

		if (arg0 < CXMSQZVC.field570) {
			int var9 = CXMSQZVC.field570 - arg0;
			var5 -= var9;
			arg0 = CXMSQZVC.field570;
			var4 += var6 * var9;
			var3 += CXMSQZVC.field568 * var9;
		}

		if (arg0 + var5 > CXMSQZVC.field571) {
			var5 -= arg0 + var5 - CXMSQZVC.field571;
		}

		if (arg1 < CXMSQZVC.field572) {
			int var10 = CXMSQZVC.field572 - arg1;
			var6 -= var10;
			arg1 = CXMSQZVC.field572;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > CXMSQZVC.field573) {
			int var11 = arg1 + var6 - CXMSQZVC.field573;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method496(var7, var3, var4, CXMSQZVC.field567, var6, var8, var5, field1302);
		}
	}

	@ObfuscatedName("TTFRDWZK.a(III[IIIII[I)V")
	public void method496(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg3[arg1++] = arg7[arg2++];
				arg3[arg1++] = arg7[arg2++];
				arg3[arg1++] = arg7[arg2++];
				arg3[arg1++] = arg7[arg2++];
			}

			for (int var12 = arg4; var12 < 0; var12++) {
				arg3[arg1++] = arg7[arg2++];
			}

			arg1 += arg0;
			arg2 += arg5;
		}
	}

	@ObfuscatedName("TTFRDWZK.b(III)V")
	public void method497(int arg0, int arg1) {
		arg0 += field1305;
		arg1 += field1306;
		int var3 = CXMSQZVC.field568 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1304;
		int var6 = field1303;
		int var7 = CXMSQZVC.field568 - var6;
		int var8 = 0;

		if (arg1 < CXMSQZVC.field570) {
			int var9 = CXMSQZVC.field570 - arg1;
			var5 -= var9;
			arg1 = CXMSQZVC.field570;
			var4 += var6 * var9;
			var3 += CXMSQZVC.field568 * var9;
		}

		if (arg1 + var5 > CXMSQZVC.field571) {
			var5 -= arg1 + var5 - CXMSQZVC.field571;
		}

		if (arg0 < CXMSQZVC.field572) {
			int var10 = CXMSQZVC.field572 - arg0;
			var6 -= var10;
			arg0 = CXMSQZVC.field572;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > CXMSQZVC.field573) {
			int var11 = arg0 + var6 - CXMSQZVC.field573;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method498(CXMSQZVC.field567, field1302, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("TTFRDWZK.a([I[IIIIIIII)V")
	public void method498(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("TTFRDWZK.a(IIII)V")
	public void method499(int arg0, int arg1, int arg2) {
		arg0 += field1305;
		arg1 += field1306;
		int var4 = CXMSQZVC.field568 * arg1 + arg0;
		int var5 = 0;
		int var6 = field1304;
		int var7 = field1303;
		int var8 = CXMSQZVC.field568 - var7;
		int var9 = 0;

		if (arg1 < CXMSQZVC.field570) {
			int var10 = CXMSQZVC.field570 - arg1;
			var6 -= var10;
			arg1 = CXMSQZVC.field570;
			var5 += var7 * var10;
			var4 += CXMSQZVC.field568 * var10;
		}

		if (arg1 + var6 > CXMSQZVC.field571) {
			var6 -= arg1 + var6 - CXMSQZVC.field571;
		}

		if (arg0 < CXMSQZVC.field572) {
			int var11 = CXMSQZVC.field572 - arg0;
			var7 -= var11;
			arg0 = CXMSQZVC.field572;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > CXMSQZVC.field573) {
			int var12 = arg0 + var7 - CXMSQZVC.field573;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method500(var8, var6, 0, var4, var9, field1302, var7, var5, arg2, CXMSQZVC.field567);
		}
	}

	@ObfuscatedName("TTFRDWZK.a(IIIIII[IIII[I)V")
	public void method500(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int[] arg9) {
		int var11 = 256 - arg8;
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = -arg6; var13 < 0; var13++) {
				int var14 = arg5[arg7++];
				if (var14 == 0) {
					arg3++;
				} else {
					int var15 = arg9[arg3];
					arg9[arg3++] = ((var14 & 0xFF00FF) * arg8 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg8 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg3 += arg0;
			arg7 += arg4;
		}
	}

	@ObfuscatedName("TTFRDWZK.a(II[IIIII[IIZI)V")
	public void method501(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		try {
			int var11 = -arg1 / 2;
			int var12 = -arg8 / 2;
			int var13 = (int) (Math.sin(arg0 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg0 / 326.11D) * 65536.0D);
			var13 = arg9 * var13 >> 8;
			var14 = arg9 * var14 >> 8;
			int var15 = (arg4 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg3 << 16) + var12 * var14 - var11 * var13;
			int var17 = CXMSQZVC.field568 * arg5 + arg6;
			for (int var18 = 0; var18 < arg8; var18++) {
				int var19 = arg7[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg2[var18]; var23 < 0; var23++) {
					CXMSQZVC.field567[var20++] = field1302[(var21 >> 16) + (var22 >> 16) * field1303];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += CXMSQZVC.field568;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("TTFRDWZK.a(IIDIIIIII)V")
	public void method502(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg7 / 2;
			int var11 = -arg4 / 2;
			int var12 = (int) (Math.sin(arg2) * 65536.0D);
			int var13 = (int) (Math.cos(arg2) * 65536.0D);
			var12 = arg0 * var12 >> 8;
			var13 = arg0 * var13 >> 8;
			int var14 = (arg3 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg1 << 16) + var11 * var13 - var10 * var12;
			int var16 = CXMSQZVC.field568 * arg5 + arg6;
			for (int var17 = 0; var17 < arg4; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg7; var21 < 0; var21++) {
					int var22 = field1302[(var19 >> 16) + (var20 >> 16) * field1303];
					if (var22 == 0) {
						var18++;
					} else {
						CXMSQZVC.field567[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += CXMSQZVC.field568;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("TTFRDWZK.a(ZIILSFAIBATY;)V")
	public void method503(int arg0, int arg1, SFAIBATY arg2) {
		arg0 += field1305;
		arg1 += field1306;
		int var4 = CXMSQZVC.field568 * arg1 + arg0;
		int var5 = 0;
		int var6 = field1304;
		int var7 = field1303;
		int var8 = CXMSQZVC.field568 - var7;
		int var9 = 0;

		if (arg1 < CXMSQZVC.field570) {
			int var10 = CXMSQZVC.field570 - arg1;
			var6 -= var10;
			arg1 = CXMSQZVC.field570;
			var5 += var7 * var10;
			var4 += CXMSQZVC.field568 * var10;
		}

		if (arg1 + var6 > CXMSQZVC.field571) {
			var6 -= arg1 + var6 - CXMSQZVC.field571;
		}

		if (arg0 < CXMSQZVC.field572) {
			int var11 = CXMSQZVC.field572 - arg0;
			var7 -= var11;
			arg0 = CXMSQZVC.field572;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > CXMSQZVC.field573) {
			int var12 = arg0 + var7 - CXMSQZVC.field573;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method504(var8, arg2.field1214, CXMSQZVC.field567, var9, field1302, var6, var7, 0, var5, var4);
		}
	}

	@ObfuscatedName("TTFRDWZK.a(I[B[III[IIIIII)V")
	public void method504(int arg0, byte[] arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var12 = -arg5; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg4[arg8++];
				if (var14 != 0 && arg1[arg9] == 0) {
					arg2[arg9++] = var14;
				} else {
					arg9++;
				}

				int var15 = arg4[arg8++];
				if (var15 != 0 && arg1[arg9] == 0) {
					arg2[arg9++] = var15;
				} else {
					arg9++;
				}

				int var16 = arg4[arg8++];
				if (var16 != 0 && arg1[arg9] == 0) {
					arg2[arg9++] = var16;
				} else {
					arg9++;
				}

				int var17 = arg4[arg8++];
				if (var17 != 0 && arg1[arg9] == 0) {
					arg2[arg9++] = var17;
				} else {
					arg9++;
				}
			}

			for (int var18 = arg6; var18 < 0; var18++) {
				int var19 = arg4[arg8++];
				if (var19 != 0 && arg1[arg9] == 0) {
					arg2[arg9++] = var19;
				} else {
					arg9++;
				}
			}

			arg9 += arg0;
			arg8 += arg3;
		}
	}
}
