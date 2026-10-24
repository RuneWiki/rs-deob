package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("EFVUNBHT")
public final class EFVUNBHT extends BDJXDJBP {

	@ObfuscatedName("EFVUNBHT.G")
	public int[] field666;

	@ObfuscatedName("EFVUNBHT.L")
	public int field671;

	@ObfuscatedName("EFVUNBHT.H")
	public int field667;

	@ObfuscatedName("EFVUNBHT.M")
	public int field672;

	@ObfuscatedName("EFVUNBHT.I")
	public int field668;

	@ObfuscatedName("EFVUNBHT.K")
	public int field670;

	@ObfuscatedName("EFVUNBHT.J")
	public int field669;

	public EFVUNBHT(int arg0, int arg1) {
		field666 = new int[arg0 * arg1];
		field667 = field671 = arg0;
		field668 = field672 = arg1;
		field669 = field670 = 0;
	}

	public EFVUNBHT(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field667 = var3.getWidth(arg1);
			field668 = var3.getHeight(arg1);
			field671 = field667;
			field672 = field668;
			field669 = 0;
			field670 = 0;
			field666 = new int[field668 * field667];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field667, field668, field666, 0, field667);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public EFVUNBHT(HBJEXSJX arg0, String arg1, int arg2) {
		EYMNCFMK var4 = new EYMNCFMK(arg0.method348(arg1 + ".dat", null));
		EYMNCFMK var5 = new EYMNCFMK(arg0.method348("index.dat", null));
		var5.field679 = var4.method241();
		field671 = var5.method241();
		field672 = var5.method241();
		int var6 = var5.method239();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method243();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field679 += 2;
			var4.field679 += var5.method241() * var5.method241();
			var5.field679++;
		}

		field669 = var5.method239();
		field670 = var5.method239();
		field667 = var5.method241();
		field668 = var5.method241();
		int var10 = var5.method239();
		int var11 = field668 * field667;
		field666 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field666[var12] = var7[var4.method239()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field667; var13++) {
				for (int var14 = 0; var14 < field668; var14++) {
					field666[field667 * var14 + var13] = var7[var4.method239()];
				}
			}
		}
	}

	@ObfuscatedName("EFVUNBHT.c(I)V")
	public void method210() {
		BDJXDJBP.method24(field667, field668, field666);
	}

	@ObfuscatedName("EFVUNBHT.a(IIIB)V")
	public void method211(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field666.length; var4++) {
			int var5 = field666[var4];
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

				field666[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("EFVUNBHT.d(I)V")
	public void method212() {
		int[] var1 = new int[field672 * field671];
		for (int var2 = 0; var2 < field668; var2++) {
			for (int var3 = 0; var3 < field667; var3++) {
				var1[(field670 + var2) * field671 + field669 + var3] = field666[field667 * var2 + var3];
			}
		}

		field666 = var1;
		field667 = field671;
		field668 = field672;
		field669 = 0;
		field670 = 0;
	}

	@ObfuscatedName("EFVUNBHT.a(III)V")
	public void method213(int arg0, int arg1) {
		arg1 += field669;
		arg0 += field670;
		int var3 = BDJXDJBP.field47 * arg0 + arg1;
		int var4 = 0;
		int var5 = field668;
		int var6 = field667;
		int var7 = BDJXDJBP.field47 - var6;
		int var8 = 0;

		if (arg0 < BDJXDJBP.field49) {
			int var9 = BDJXDJBP.field49 - arg0;
			var5 -= var9;
			arg0 = BDJXDJBP.field49;
			var4 += var6 * var9;
			var3 += BDJXDJBP.field47 * var9;
		}

		if (arg0 + var5 > BDJXDJBP.field50) {
			var5 -= arg0 + var5 - BDJXDJBP.field50;
		}

		if (arg1 < BDJXDJBP.field51) {
			int var10 = BDJXDJBP.field51 - arg1;
			var6 -= var10;
			arg1 = BDJXDJBP.field51;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > BDJXDJBP.field52) {
			int var11 = arg1 + var6 - BDJXDJBP.field52;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method214(var6, var4, var5, field666, var3, var7, BDJXDJBP.field46, var8);
		}
	}

	@ObfuscatedName("EFVUNBHT.a(III[IIII[II)V")
	public void method214(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg2; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg6[arg4++] = arg3[arg1++];
				arg6[arg4++] = arg3[arg1++];
				arg6[arg4++] = arg3[arg1++];
				arg6[arg4++] = arg3[arg1++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg6[arg4++] = arg3[arg1++];
			}

			arg4 += arg5;
			arg1 += arg7;
		}
	}

	@ObfuscatedName("EFVUNBHT.b(III)V")
	public void method215(int arg0, int arg1) {
		arg0 += field669;
		arg1 += field670;
		int var3 = BDJXDJBP.field47 * arg1 + arg0;
		int var4 = 0;
		int var5 = field668;
		int var6 = field667;
		int var7 = BDJXDJBP.field47 - var6;
		int var8 = 0;

		if (arg1 < BDJXDJBP.field49) {
			int var9 = BDJXDJBP.field49 - arg1;
			var5 -= var9;
			arg1 = BDJXDJBP.field49;
			var4 += var6 * var9;
			var3 += BDJXDJBP.field47 * var9;
		}

		if (arg1 + var5 > BDJXDJBP.field50) {
			var5 -= arg1 + var5 - BDJXDJBP.field50;
		}

		if (arg0 < BDJXDJBP.field51) {
			int var10 = BDJXDJBP.field51 - arg0;
			var6 -= var10;
			arg0 = BDJXDJBP.field51;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > BDJXDJBP.field52) {
			int var11 = arg0 + var6 - BDJXDJBP.field52;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method216(BDJXDJBP.field46, field666, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("EFVUNBHT.a([I[IIIIIIII)V")
	public void method216(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("EFVUNBHT.a(IIIZ)V")
	public void method217(int arg0, int arg1, int arg2) {
		arg1 += field669;
		arg0 += field670;
		int var4 = BDJXDJBP.field47 * arg0 + arg1;
		int var5 = 0;
		int var6 = field668;
		int var7 = field667;
		int var8 = BDJXDJBP.field47 - var7;
		int var9 = 0;

		if (arg0 < BDJXDJBP.field49) {
			int var10 = BDJXDJBP.field49 - arg0;
			var6 -= var10;
			arg0 = BDJXDJBP.field49;
			var5 += var7 * var10;
			var4 += BDJXDJBP.field47 * var10;
		}

		if (arg0 + var6 > BDJXDJBP.field50) {
			var6 -= arg0 + var6 - BDJXDJBP.field50;
		}

		if (arg1 < BDJXDJBP.field51) {
			int var11 = BDJXDJBP.field51 - arg1;
			var7 -= var11;
			arg1 = BDJXDJBP.field51;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > BDJXDJBP.field52) {
			int var12 = arg1 + var7 - BDJXDJBP.field52;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method218(var4, var5, 0, field666, var6, var8, var7, arg2, BDJXDJBP.field46, var9);
		}
	}

	@ObfuscatedName("EFVUNBHT.a(IIII[IIIII[II)V")
	public void method218(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		int var11 = 256 - arg7;
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = -arg6; var13 < 0; var13++) {
				int var14 = arg3[arg1++];
				if (var14 == 0) {
					arg0++;
				} else {
					int var15 = arg8[arg0];
					arg8[arg0++] = ((var14 & 0xFF00FF) * arg7 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg7 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg0 += arg5;
			arg1 += arg9;
		}
	}

	@ObfuscatedName("EFVUNBHT.a(I[IIII[IZIIII)V")
	public void method219(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg0 / 2;
			int var12 = -arg4 / 2;
			int var13 = (int) (Math.sin(arg8 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg8 / 326.11D) * 65536.0D);
			var13 = arg6 * var13 >> 8;
			var14 = arg6 * var14 >> 8;
			int var15 = (arg3 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg9 << 16) + var12 * var14 - var11 * var13;
			int var17 = BDJXDJBP.field47 * arg7 + arg2;
			for (int var18 = 0; var18 < arg4; var18++) {
				int var19 = arg5[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg1[var18]; var23 < 0; var23++) {
					BDJXDJBP.field46[var20++] = field666[(var21 >> 16) + (var22 >> 16) * field667];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += BDJXDJBP.field47;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("EFVUNBHT.a(IIIIIDIII)V")
	public void method220(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg1 / 2;
			int var11 = -arg2 / 2;
			int var12 = (int) (Math.sin(arg4) * 65536.0D);
			int var13 = (int) (Math.cos(arg4) * 65536.0D);
			var12 = arg5 * var12 >> 8;
			var13 = arg5 * var13 >> 8;
			int var14 = (arg0 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg3 << 16) + var11 * var13 - var10 * var12;
			int var16 = BDJXDJBP.field47 * arg6 + arg7;
			for (int var17 = 0; var17 < arg2; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg1; var21 < 0; var21++) {
					int var22 = field666[(var19 >> 16) + (var20 >> 16) * field667];
					if (var22 == 0) {
						var18++;
					} else {
						BDJXDJBP.field46[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += BDJXDJBP.field47;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("EFVUNBHT.a(LMRCVLIXG;IIB)V")
	public void method221(MRCVLIXG arg0, int arg1, int arg2) {
		arg1 += field669;
		arg2 += field670;
		int var4 = BDJXDJBP.field47 * arg2 + arg1;
		int var5 = 0;
		int var6 = field668;
		int var7 = field667;
		int var8 = BDJXDJBP.field47 - var7;
		int var9 = 0;

		if (arg2 < BDJXDJBP.field49) {
			int var10 = BDJXDJBP.field49 - arg2;
			var6 -= var10;
			arg2 = BDJXDJBP.field49;
			var5 += var7 * var10;
			var4 += BDJXDJBP.field47 * var10;
		}

		if (arg2 + var6 > BDJXDJBP.field50) {
			var6 -= arg2 + var6 - BDJXDJBP.field50;
		}

		if (arg1 < BDJXDJBP.field51) {
			int var11 = BDJXDJBP.field51 - arg1;
			var7 -= var11;
			arg1 = BDJXDJBP.field51;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > BDJXDJBP.field52) {
			int var12 = arg1 + var7 - BDJXDJBP.field52;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method222(var4, var9, var7, BDJXDJBP.field46, var8, 0, var6, field666, arg0.field979, var5);
		}
	}

	@ObfuscatedName("EFVUNBHT.a(III[IIIII[I[BI)V")
	public void method222(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, byte[] arg8, int arg9) {
		int var11 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg7[arg9++];
				if (var14 != 0 && arg8[arg0] == 0) {
					arg3[arg0++] = var14;
				} else {
					arg0++;
				}

				int var15 = arg7[arg9++];
				if (var15 != 0 && arg8[arg0] == 0) {
					arg3[arg0++] = var15;
				} else {
					arg0++;
				}

				int var16 = arg7[arg9++];
				if (var16 != 0 && arg8[arg0] == 0) {
					arg3[arg0++] = var16;
				} else {
					arg0++;
				}

				int var17 = arg7[arg9++];
				if (var17 != 0 && arg8[arg0] == 0) {
					arg3[arg0++] = var17;
				} else {
					arg0++;
				}
			}

			for (int var18 = arg2; var18 < 0; var18++) {
				int var19 = arg7[arg9++];
				if (var19 != 0 && arg8[arg0] == 0) {
					arg3[arg0++] = var19;
				} else {
					arg0++;
				}
			}

			arg0 += arg4;
			arg9 += arg1;
		}
	}
}
