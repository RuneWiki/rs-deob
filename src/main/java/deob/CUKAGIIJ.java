package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("CUKAGIIJ")
public final class CUKAGIIJ extends OKWPDMPE {

	@ObfuscatedName("CUKAGIIJ.I")
	public int[] field484;

	@ObfuscatedName("CUKAGIIJ.N")
	public int field489;

	@ObfuscatedName("CUKAGIIJ.J")
	public int field485;

	@ObfuscatedName("CUKAGIIJ.O")
	public int field490;

	@ObfuscatedName("CUKAGIIJ.K")
	public int field486;

	@ObfuscatedName("CUKAGIIJ.M")
	public int field488;

	@ObfuscatedName("CUKAGIIJ.L")
	public int field487;

	public CUKAGIIJ(int arg0, int arg1) {
		field484 = new int[arg0 * arg1];
		field485 = field489 = arg0;
		field486 = field490 = arg1;
		field487 = field488 = 0;
	}

	public CUKAGIIJ(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field485 = var3.getWidth(arg1);
			field486 = var3.getHeight(arg1);
			field489 = field485;
			field490 = field486;
			field487 = 0;
			field488 = 0;
			field484 = new int[field486 * field485];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field485, field486, field484, 0, field485);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public CUKAGIIJ(VSUYIIVA arg0, String arg1, int arg2) {
		CFARFRSG var4 = new CFARFRSG(arg0.method570(arg1 + ".dat", null));
		CFARFRSG var5 = new CFARFRSG(arg0.method570("index.dat", null));
		var5.field44 = var4.method32();
		field489 = var5.method32();
		field490 = var5.method32();
		int var6 = var5.method30();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method34();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field44 += 2;
			var4.field44 += var5.method32() * var5.method32();
			var5.field44++;
		}

		field487 = var5.method30();
		field488 = var5.method30();
		field485 = var5.method32();
		field486 = var5.method32();
		int var10 = var5.method30();
		int var11 = field486 * field485;
		field484 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field484[var12] = var7[var4.method30()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field485; var13++) {
				for (int var14 = 0; var14 < field486; var14++) {
					field484[field485 * var14 + var13] = var7[var4.method30()];
				}
			}
		}
	}

	@ObfuscatedName("CUKAGIIJ.b(I)V")
	public void method218() {
		OKWPDMPE.method431(field485, field486, field484);
	}

	@ObfuscatedName("CUKAGIIJ.a(IIBI)V")
	public void method219(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field484.length; var4++) {
			int var5 = field484[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg1;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 0xFF;
				var7 += arg2;
				if (var7 < 1) {
					var7 = 1;
				} else if (var7 > 255) {
					var7 = 255;
				}

				int var8 = var5 & 0xFF;
				var8 += arg0;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field484[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("CUKAGIIJ.c(I)V")
	public void method220() {
		int[] var1 = new int[field490 * field489];
		for (int var2 = 0; var2 < field486; var2++) {
			for (int var3 = 0; var3 < field485; var3++) {
				var1[(field488 + var2) * field489 + field487 + var3] = field484[field485 * var2 + var3];
			}
		}

		field484 = var1;
		field485 = field489;
		field486 = field490;
		field487 = 0;
		field488 = 0;
	}

	@ObfuscatedName("CUKAGIIJ.a(BII)V")
	public void method221(int arg0, int arg1) {
		arg1 += field487;
		arg0 += field488;
		int var3 = OKWPDMPE.field980 * arg0 + arg1;
		int var4 = 0;
		int var5 = field486;
		int var6 = field485;
		int var7 = OKWPDMPE.field980 - var6;
		int var8 = 0;

		if (arg0 < OKWPDMPE.field982) {
			int var9 = OKWPDMPE.field982 - arg0;
			var5 -= var9;
			arg0 = OKWPDMPE.field982;
			var4 += var6 * var9;
			var3 += OKWPDMPE.field980 * var9;
		}

		if (arg0 + var5 > OKWPDMPE.field983) {
			var5 -= arg0 + var5 - OKWPDMPE.field983;
		}

		if (arg1 < OKWPDMPE.field984) {
			int var10 = OKWPDMPE.field984 - arg1;
			var6 -= var10;
			arg1 = OKWPDMPE.field984;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > OKWPDMPE.field985) {
			int var11 = arg1 + var6 - OKWPDMPE.field985;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method222(var5, OKWPDMPE.field979, var8, field484, var7, var6, var4, var3);
		}
	}

	@ObfuscatedName("CUKAGIIJ.a(I[II[IIIIII)V")
	public void method222(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var10 = -arg0; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg7++] = arg3[arg6++];
				arg1[arg7++] = arg3[arg6++];
				arg1[arg7++] = arg3[arg6++];
				arg1[arg7++] = arg3[arg6++];
			}

			for (int var12 = arg5; var12 < 0; var12++) {
				arg1[arg7++] = arg3[arg6++];
			}

			arg7 += arg4;
			arg6 += arg2;
		}
	}

	@ObfuscatedName("CUKAGIIJ.a(III)V")
	public void method223(int arg0, int arg1) {
		arg0 += field487;
		arg1 += field488;
		int var3 = OKWPDMPE.field980 * arg1 + arg0;
		int var4 = 0;
		int var5 = field486;
		int var6 = field485;
		int var7 = OKWPDMPE.field980 - var6;
		int var8 = 0;

		if (arg1 < OKWPDMPE.field982) {
			int var9 = OKWPDMPE.field982 - arg1;
			var5 -= var9;
			arg1 = OKWPDMPE.field982;
			var4 += var6 * var9;
			var3 += OKWPDMPE.field980 * var9;
		}

		if (arg1 + var5 > OKWPDMPE.field983) {
			var5 -= arg1 + var5 - OKWPDMPE.field983;
		}

		if (arg0 < OKWPDMPE.field984) {
			int var10 = OKWPDMPE.field984 - arg0;
			var6 -= var10;
			arg0 = OKWPDMPE.field984;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > OKWPDMPE.field985) {
			int var11 = arg0 + var6 - OKWPDMPE.field985;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method224(OKWPDMPE.field979, field484, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("CUKAGIIJ.a([I[IIIIIIII)V")
	public void method224(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("CUKAGIIJ.a(IIII)V")
	public void method225(int arg0, int arg1, int arg2) {
		arg1 += field487;
		arg0 += field488;
		int var4 = OKWPDMPE.field980 * arg0 + arg1;
		int var5 = 0;
		int var6 = field486;
		int var7 = field485;
		int var8 = OKWPDMPE.field980 - var7;
		int var9 = 0;

		if (arg0 < OKWPDMPE.field982) {
			int var10 = OKWPDMPE.field982 - arg0;
			var6 -= var10;
			arg0 = OKWPDMPE.field982;
			var5 += var7 * var10;
			var4 += OKWPDMPE.field980 * var10;
		}

		if (arg0 + var6 > OKWPDMPE.field983) {
			var6 -= arg0 + var6 - OKWPDMPE.field983;
		}

		if (arg1 < OKWPDMPE.field984) {
			int var11 = OKWPDMPE.field984 - arg1;
			var7 -= var11;
			arg1 = OKWPDMPE.field984;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > OKWPDMPE.field985) {
			int var12 = arg1 + var7 - OKWPDMPE.field985;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method226(field484, var8, var7, 0, OKWPDMPE.field979, var4, arg2, var5, var9, var6);
		}
	}

	@ObfuscatedName("CUKAGIIJ.a([IIII[IIIIIII)V")
	public void method226(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg6;
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = arg0[arg7++];
				if (var14 == 0) {
					arg5++;
				} else {
					int var15 = arg4[arg5];
					arg4[arg5++] = ((var14 & 0xFF00FF) * arg6 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg6 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg5 += arg1;
			arg7 += arg8;
		}
	}

	@ObfuscatedName("CUKAGIIJ.a([III[IIIIIIII)V")
	public void method227(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg8 / 2;
			int var12 = -arg7 / 2;
			int var13 = (int) (Math.sin(arg5 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg5 / 326.11D) * 65536.0D);
			var13 = arg4 * var13 >> 8;
			var14 = arg4 * var14 >> 8;
			int var15 = (arg1 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg6 << 16) + var12 * var14 - var11 * var13;
			int var17 = OKWPDMPE.field980 * arg9 + arg3;
			for (int var18 = 0; var18 < arg7; var18++) {
				int var19 = arg2[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg0[var18]; var23 < 0; var23++) {
					OKWPDMPE.field979[var20++] = field484[(var21 >> 16) + (var22 >> 16) * field485];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += OKWPDMPE.field980;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("CUKAGIIJ.a(IIIDIIIII)V")
	public void method228(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg0 / 2;
			int var12 = (int) (Math.sin(arg3) * 65536.0D);
			int var13 = (int) (Math.cos(arg3) * 65536.0D);
			var12 = arg5 * var12 >> 8;
			var13 = arg5 * var13 >> 8;
			int var14 = (arg6 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = OKWPDMPE.field980 * arg1 + arg7;
			for (int var17 = 0; var17 < arg0; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg2; var21 < 0; var21++) {
					int var22 = field484[(var19 >> 16) + (var20 >> 16) * field485];
					if (var22 == 0) {
						var18++;
					} else {
						OKWPDMPE.field979[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += OKWPDMPE.field980;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("CUKAGIIJ.a(LFDCAWVRL;III)V")
	public void method229(FDCAWVRL arg0, int arg1, int arg2) {
		arg2 += field487;
		arg1 += field488;
		int var4 = OKWPDMPE.field980 * arg1 + arg2;
		int var5 = 0;
		int var6 = field486;
		int var7 = field485;
		int var8 = OKWPDMPE.field980 - var7;
		int var9 = 0;

		if (arg1 < OKWPDMPE.field982) {
			int var10 = OKWPDMPE.field982 - arg1;
			var6 -= var10;
			arg1 = OKWPDMPE.field982;
			var5 += var7 * var10;
			var4 += OKWPDMPE.field980 * var10;
		}

		if (arg1 + var6 > OKWPDMPE.field983) {
			var6 -= arg1 + var6 - OKWPDMPE.field983;
		}

		if (arg2 < OKWPDMPE.field984) {
			int var11 = OKWPDMPE.field984 - arg2;
			var7 -= var11;
			arg2 = OKWPDMPE.field984;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > OKWPDMPE.field985) {
			int var12 = arg2 + var7 - OKWPDMPE.field985;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method230(var7, 0, field484, arg0.field587, var6, var5, OKWPDMPE.field979, var8, var9, var4);
		}
	}

	@ObfuscatedName("CUKAGIIJ.a(II[I[BII[IIIII)V")
	public void method230(int arg0, int arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg2[arg5++];
				if (var14 != 0 && arg3[arg9] == 0) {
					arg6[arg9++] = var14;
				} else {
					arg9++;
				}

				int var15 = arg2[arg5++];
				if (var15 != 0 && arg3[arg9] == 0) {
					arg6[arg9++] = var15;
				} else {
					arg9++;
				}

				int var16 = arg2[arg5++];
				if (var16 != 0 && arg3[arg9] == 0) {
					arg6[arg9++] = var16;
				} else {
					arg9++;
				}

				int var17 = arg2[arg5++];
				if (var17 != 0 && arg3[arg9] == 0) {
					arg6[arg9++] = var17;
				} else {
					arg9++;
				}
			}

			for (int var18 = arg0; var18 < 0; var18++) {
				int var19 = arg2[arg5++];
				if (var19 != 0 && arg3[arg9] == 0) {
					arg6[arg9++] = var19;
				} else {
					arg9++;
				}
			}

			arg9 += arg7;
			arg5 += arg8;
		}
	}
}
