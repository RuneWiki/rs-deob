package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("KUDWIDHU")
public final class KUDWIDHU extends CBERHIHM {

	@ObfuscatedName("KUDWIDHU.H")
	public int[] field658;

	@ObfuscatedName("KUDWIDHU.M")
	public int field663;

	@ObfuscatedName("KUDWIDHU.I")
	public int field659;

	@ObfuscatedName("KUDWIDHU.N")
	public int field664;

	@ObfuscatedName("KUDWIDHU.J")
	public int field660;

	@ObfuscatedName("KUDWIDHU.L")
	public int field662;

	@ObfuscatedName("KUDWIDHU.K")
	public int field661;

	public KUDWIDHU(int arg0, int arg1) {
		field658 = new int[arg0 * arg1];
		field659 = field663 = arg0;
		field660 = field664 = arg1;
		field661 = field662 = 0;
	}

	public KUDWIDHU(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field659 = var3.getWidth(arg1);
			field660 = var3.getHeight(arg1);
			field663 = field659;
			field664 = field660;
			field661 = 0;
			field662 = 0;
			field658 = new int[field660 * field659];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field659, field660, field658, 0, field659);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public KUDWIDHU(AKPFVPPG arg0, String arg1, int arg2) {
		FTMSICIZ var4 = new FTMSICIZ(arg0.method7(arg1 + ".dat", null));
		FTMSICIZ var5 = new FTMSICIZ(arg0.method7("index.dat", null));
		var5.field535 = var4.method215();
		field663 = var5.method215();
		field664 = var5.method215();
		int var6 = var5.method213();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method217();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field535 += 2;
			var4.field535 += var5.method215() * var5.method215();
			var5.field535++;
		}

		field661 = var5.method213();
		field662 = var5.method213();
		field659 = var5.method215();
		field660 = var5.method215();
		int var10 = var5.method213();
		int var11 = field660 * field659;
		field658 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field658[var12] = var7[var4.method213()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field659; var13++) {
				for (int var14 = 0; var14 < field660; var14++) {
					field658[field659 * var14 + var13] = var7[var4.method213()];
				}
			}
		}
	}

	@ObfuscatedName("KUDWIDHU.a(I)V")
	public void method313() {
		CBERHIHM.method28(field658, field660, field659);
	}

	@ObfuscatedName("KUDWIDHU.a(ZIII)V")
	public void method314(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field658.length; var4++) {
			int var5 = field658[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg2;
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
				var8 += arg1;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field658[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("KUDWIDHU.b(Z)V")
	public void method315() {
		int[] var1 = new int[field664 * field663];
		for (int var2 = 0; var2 < field660; var2++) {
			for (int var3 = 0; var3 < field659; var3++) {
				var1[(field662 + var2) * field663 + field661 + var3] = field658[field659 * var2 + var3];
			}
		}

		field658 = var1;
		field659 = field663;
		field660 = field664;
		field661 = 0;
		field662 = 0;
	}

	@ObfuscatedName("KUDWIDHU.a(III)V")
	public void method316(int arg0, int arg1) {
		arg0 += field661;
		arg1 += field662;
		int var3 = CBERHIHM.field25 * arg1 + arg0;
		int var4 = 0;
		int var5 = field660;
		int var6 = field659;
		int var7 = CBERHIHM.field25 - var6;
		int var8 = 0;

		if (arg1 < CBERHIHM.field27) {
			int var9 = CBERHIHM.field27 - arg1;
			var5 -= var9;
			arg1 = CBERHIHM.field27;
			var4 += var6 * var9;
			var3 += CBERHIHM.field25 * var9;
		}

		if (arg1 + var5 > CBERHIHM.field28) {
			var5 -= arg1 + var5 - CBERHIHM.field28;
		}

		if (arg0 < CBERHIHM.field29) {
			int var10 = CBERHIHM.field29 - arg0;
			var6 -= var10;
			arg0 = CBERHIHM.field29;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > CBERHIHM.field30) {
			int var11 = arg0 + var6 - CBERHIHM.field30;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method317(var7, var5, field658, var3, CBERHIHM.field24, var4, var8, var6);
		}
	}

	@ObfuscatedName("KUDWIDHU.a(II[II[IIBII)V")
	public void method317(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var10 = -arg1; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg4[arg3++] = arg2[arg5++];
				arg4[arg3++] = arg2[arg5++];
				arg4[arg3++] = arg2[arg5++];
				arg4[arg3++] = arg2[arg5++];
			}

			for (int var12 = arg7; var12 < 0; var12++) {
				arg4[arg3++] = arg2[arg5++];
			}

			arg3 += arg0;
			arg5 += arg6;
		}
	}

	@ObfuscatedName("KUDWIDHU.b(III)V")
	public void method318(int arg0, int arg1) {
		arg0 += field661;
		arg1 += field662;
		int var3 = CBERHIHM.field25 * arg1 + arg0;
		int var4 = 0;
		int var5 = field660;
		int var6 = field659;
		int var7 = CBERHIHM.field25 - var6;
		int var8 = 0;

		if (arg1 < CBERHIHM.field27) {
			int var9 = CBERHIHM.field27 - arg1;
			var5 -= var9;
			arg1 = CBERHIHM.field27;
			var4 += var6 * var9;
			var3 += CBERHIHM.field25 * var9;
		}

		if (arg1 + var5 > CBERHIHM.field28) {
			var5 -= arg1 + var5 - CBERHIHM.field28;
		}

		if (arg0 < CBERHIHM.field29) {
			int var10 = CBERHIHM.field29 - arg0;
			var6 -= var10;
			arg0 = CBERHIHM.field29;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > CBERHIHM.field30) {
			int var11 = arg0 + var6 - CBERHIHM.field30;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method319(CBERHIHM.field24, field658, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("KUDWIDHU.a([I[IIIIIIII)V")
	public void method319(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("KUDWIDHU.a(IIII)V")
	public void method320(int arg0, int arg1, int arg2) {
		arg2 += field661;
		arg1 += field662;
		int var4 = CBERHIHM.field25 * arg1 + arg2;
		int var5 = 0;
		int var6 = field660;
		int var7 = field659;
		int var8 = CBERHIHM.field25 - var7;
		int var9 = 0;

		if (arg1 < CBERHIHM.field27) {
			int var10 = CBERHIHM.field27 - arg1;
			var6 -= var10;
			arg1 = CBERHIHM.field27;
			var5 += var7 * var10;
			var4 += CBERHIHM.field25 * var10;
		}

		if (arg1 + var6 > CBERHIHM.field28) {
			var6 -= arg1 + var6 - CBERHIHM.field28;
		}

		if (arg2 < CBERHIHM.field29) {
			int var11 = CBERHIHM.field29 - arg2;
			var7 -= var11;
			arg2 = CBERHIHM.field29;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > CBERHIHM.field30) {
			int var12 = arg2 + var7 - CBERHIHM.field30;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method321(var8, arg0, var7, var9, 0, var4, CBERHIHM.field24, field658, var5, var6);
		}
	}

	@ObfuscatedName("KUDWIDHU.a(IIIIII[II[III)V")
	public void method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg1;
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = arg7[arg8++];
				if (var14 == 0) {
					arg5++;
				} else {
					int var15 = arg6[arg5];
					arg6[arg5++] = ((var14 & 0xFF00FF) * arg1 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg1 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg5 += arg0;
			arg8 += arg3;
		}
	}

	@ObfuscatedName("KUDWIDHU.a(III[II[IIIIII)V")
	public void method322(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg4 / 2;
			int var12 = -arg0 / 2;
			int var13 = (int) (Math.sin(arg1 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg1 / 326.11D) * 65536.0D);
			var13 = arg2 * var13 >> 8;
			var14 = arg2 * var14 >> 8;
			int var15 = (arg7 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg8 << 16) + var12 * var14 - var11 * var13;
			int var17 = CBERHIHM.field25 * arg6 + arg9;
			for (int var18 = 0; var18 < arg0; var18++) {
				int var19 = arg3[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg5[var18]; var23 < 0; var23++) {
					CBERHIHM.field24[var20++] = field658[(var21 >> 16) + (var22 >> 16) * field659];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += CBERHIHM.field25;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("KUDWIDHU.a(IIIIDIIII)V")
	public void method323(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg0 / 2;
			int var11 = -arg6 / 2;
			int var12 = (int) (Math.sin(arg4) * 65536.0D);
			int var13 = (int) (Math.cos(arg4) * 65536.0D);
			var12 = arg2 * var12 >> 8;
			var13 = arg2 * var13 >> 8;
			int var14 = (arg5 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg7 << 16) + var11 * var13 - var10 * var12;
			int var16 = CBERHIHM.field25 * arg1 + arg3;
			for (int var17 = 0; var17 < arg6; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg0; var21 < 0; var21++) {
					int var22 = field658[(var19 >> 16) + (var20 >> 16) * field659];
					if (var22 == 0) {
						var18++;
					} else {
						CBERHIHM.field24[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += CBERHIHM.field25;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("KUDWIDHU.a(LITVAFKCK;III)V")
	public void method324(ITVAFKCK arg0, int arg1, int arg2) {
		arg2 += field661;
		arg1 += field662;
		int var4 = CBERHIHM.field25 * arg1 + arg2;
		int var5 = 0;
		int var6 = field660;
		int var7 = field659;
		int var8 = CBERHIHM.field25 - var7;
		int var9 = 0;

		if (arg1 < CBERHIHM.field27) {
			int var10 = CBERHIHM.field27 - arg1;
			var6 -= var10;
			arg1 = CBERHIHM.field27;
			var5 += var7 * var10;
			var4 += CBERHIHM.field25 * var10;
		}

		if (arg1 + var6 > CBERHIHM.field28) {
			var6 -= arg1 + var6 - CBERHIHM.field28;
		}

		if (arg2 < CBERHIHM.field29) {
			int var11 = CBERHIHM.field29 - arg2;
			var7 -= var11;
			arg2 = CBERHIHM.field29;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > CBERHIHM.field30) {
			int var12 = arg2 + var7 - CBERHIHM.field30;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method325(var9, var5, var7, arg0.field605, CBERHIHM.field24, var8, var4, field658, 0, var6);
		}
	}

	@ObfuscatedName("KUDWIDHU.a(III[B[III[IIII)V")
	public void method325(int arg0, int arg1, int arg2, byte[] arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg7[arg1++];
				if (var14 != 0 && arg3[arg6] == 0) {
					arg4[arg6++] = var14;
				} else {
					arg6++;
				}

				int var15 = arg7[arg1++];
				if (var15 != 0 && arg3[arg6] == 0) {
					arg4[arg6++] = var15;
				} else {
					arg6++;
				}

				int var16 = arg7[arg1++];
				if (var16 != 0 && arg3[arg6] == 0) {
					arg4[arg6++] = var16;
				} else {
					arg6++;
				}

				int var17 = arg7[arg1++];
				if (var17 != 0 && arg3[arg6] == 0) {
					arg4[arg6++] = var17;
				} else {
					arg6++;
				}
			}

			for (int var18 = arg2; var18 < 0; var18++) {
				int var19 = arg7[arg1++];
				if (var19 != 0 && arg3[arg6] == 0) {
					arg4[arg6++] = var19;
				} else {
					arg6++;
				}
			}

			arg6 += arg5;
			arg1 += arg0;
		}
	}
}
