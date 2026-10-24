package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("TTWFVYGB")
public final class TTWFVYGB extends YYTDUXDR {

	@ObfuscatedName("TTWFVYGB.B")
	public int[] field1231;

	@ObfuscatedName("TTWFVYGB.G")
	public int field1236;

	@ObfuscatedName("TTWFVYGB.C")
	public int field1232;

	@ObfuscatedName("TTWFVYGB.H")
	public int field1237;

	@ObfuscatedName("TTWFVYGB.D")
	public int field1233;

	@ObfuscatedName("TTWFVYGB.F")
	public int field1235;

	@ObfuscatedName("TTWFVYGB.E")
	public int field1234;

	public TTWFVYGB(int arg0, int arg1) {
		field1231 = new int[arg0 * arg1];
		field1232 = field1236 = arg0;
		field1233 = field1237 = arg1;
		field1234 = field1235 = 0;
	}

	public TTWFVYGB(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1232 = var3.getWidth(arg1);
			field1233 = var3.getHeight(arg1);
			field1236 = field1232;
			field1237 = field1233;
			field1234 = 0;
			field1235 = 0;
			field1231 = new int[field1233 * field1232];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1232, field1233, field1231, 0, field1232);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public TTWFVYGB(QDHHNYHL arg0, String arg1, int arg2) {
		PGNBHFUF var4 = new PGNBHFUF(arg0.method488(arg1 + ".dat", null));
		PGNBHFUF var5 = new PGNBHFUF(arg0.method488("index.dat", null));
		var5.field1082 = var4.method422();
		field1236 = var5.method422();
		field1237 = var5.method422();
		int var6 = var5.method420();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method424();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1082 += 2;
			var4.field1082 += var5.method422() * var5.method422();
			var5.field1082++;
		}

		field1234 = var5.method420();
		field1235 = var5.method420();
		field1232 = var5.method422();
		field1233 = var5.method422();
		int var10 = var5.method420();
		int var11 = field1233 * field1232;
		field1231 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1231[var12] = var7[var4.method420()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1232; var13++) {
				for (int var14 = 0; var14 < field1233; var14++) {
					field1231[field1232 * var14 + var13] = var7[var4.method420()];
				}
			}
		}
	}

	@ObfuscatedName("TTWFVYGB.b(Z)V")
	public void method506() {
		YYTDUXDR.method576(field1231, field1233, field1232);
	}

	@ObfuscatedName("TTWFVYGB.a(IIIB)V")
	public void method507(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1231.length; var4++) {
			int var5 = field1231[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg0;
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
				var8 += arg1;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field1231[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("TTWFVYGB.c(Z)V")
	public void method508() {
		int[] var1 = new int[field1237 * field1236];
		for (int var2 = 0; var2 < field1233; var2++) {
			for (int var3 = 0; var3 < field1232; var3++) {
				var1[(field1235 + var2) * field1236 + field1234 + var3] = field1231[field1232 * var2 + var3];
			}
		}

		field1231 = var1;
		field1232 = field1236;
		field1233 = field1237;
		field1234 = 0;
		field1235 = 0;
	}

	@ObfuscatedName("TTWFVYGB.a(III)V")
	public void method509(int arg0, int arg1) {
		arg0 += field1234;
		arg1 += field1235;
		int var3 = YYTDUXDR.field1436 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1233;
		int var6 = field1232;
		int var7 = YYTDUXDR.field1436 - var6;
		int var8 = 0;

		if (arg1 < YYTDUXDR.field1438) {
			int var9 = YYTDUXDR.field1438 - arg1;
			var5 -= var9;
			arg1 = YYTDUXDR.field1438;
			var4 += var6 * var9;
			var3 += YYTDUXDR.field1436 * var9;
		}

		if (arg1 + var5 > YYTDUXDR.field1439) {
			var5 -= arg1 + var5 - YYTDUXDR.field1439;
		}

		if (arg0 < YYTDUXDR.field1440) {
			int var10 = YYTDUXDR.field1440 - arg0;
			var6 -= var10;
			arg0 = YYTDUXDR.field1440;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > YYTDUXDR.field1441) {
			int var11 = arg0 + var6 - YYTDUXDR.field1441;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method510(var8, var3, var4, YYTDUXDR.field1435, var7, var6, var5, field1231);
		}
	}

	@ObfuscatedName("TTWFVYGB.a(III[IIZII[I)V")
	public void method510(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg3[arg1++] = arg7[arg2++];
				arg3[arg1++] = arg7[arg2++];
				arg3[arg1++] = arg7[arg2++];
				arg3[arg1++] = arg7[arg2++];
			}

			for (int var12 = arg5; var12 < 0; var12++) {
				arg3[arg1++] = arg7[arg2++];
			}

			arg1 += arg4;
			arg2 += arg0;
		}
	}

	@ObfuscatedName("TTWFVYGB.a(IIZ)V")
	public void method511(int arg0, int arg1) {
		arg0 += field1234;
		arg1 += field1235;
		int var3 = YYTDUXDR.field1436 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1233;
		int var6 = field1232;
		int var7 = YYTDUXDR.field1436 - var6;
		int var8 = 0;

		if (arg1 < YYTDUXDR.field1438) {
			int var9 = YYTDUXDR.field1438 - arg1;
			var5 -= var9;
			arg1 = YYTDUXDR.field1438;
			var4 += var6 * var9;
			var3 += YYTDUXDR.field1436 * var9;
		}

		if (arg1 + var5 > YYTDUXDR.field1439) {
			var5 -= arg1 + var5 - YYTDUXDR.field1439;
		}

		if (arg0 < YYTDUXDR.field1440) {
			int var10 = YYTDUXDR.field1440 - arg0;
			var6 -= var10;
			arg0 = YYTDUXDR.field1440;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > YYTDUXDR.field1441) {
			int var11 = arg0 + var6 - YYTDUXDR.field1441;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method512(YYTDUXDR.field1435, field1231, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("TTWFVYGB.a([I[IIIIIIII)V")
	public void method512(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("TTWFVYGB.b(IIIB)V")
	public void method513(int arg0, int arg1, int arg2) {
		arg1 += field1234;
		arg2 += field1235;
		int var4 = YYTDUXDR.field1436 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1233;
		int var7 = field1232;
		int var8 = YYTDUXDR.field1436 - var7;
		int var9 = 0;

		if (arg2 < YYTDUXDR.field1438) {
			int var10 = YYTDUXDR.field1438 - arg2;
			var6 -= var10;
			arg2 = YYTDUXDR.field1438;
			var5 += var7 * var10;
			var4 += YYTDUXDR.field1436 * var10;
		}

		if (arg2 + var6 > YYTDUXDR.field1439) {
			var6 -= arg2 + var6 - YYTDUXDR.field1439;
		}

		if (arg1 < YYTDUXDR.field1440) {
			int var11 = YYTDUXDR.field1440 - arg1;
			var7 -= var11;
			arg1 = YYTDUXDR.field1440;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > YYTDUXDR.field1441) {
			int var12 = arg1 + var7 - YYTDUXDR.field1441;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method514(var4, var5, YYTDUXDR.field1435, field1231, arg0, var6, var9, var7, var8, 0);
		}
	}

	@ObfuscatedName("TTWFVYGB.a(II[I[IIIIIIII)V")
	public void method514(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg4;
		for (int var12 = -arg5; var12 < 0; var12++) {
			for (int var13 = -arg7; var13 < 0; var13++) {
				int var14 = arg3[arg1++];
				if (var14 == 0) {
					arg0++;
				} else {
					int var15 = arg2[arg0];
					arg2[arg0++] = ((var14 & 0xFF00FF) * arg4 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg4 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg0 += arg8;
			arg1 += arg6;
		}
	}

	@ObfuscatedName("TTWFVYGB.a(II[IIIIII[III)V")
	public void method515(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		try {
			int var11 = -arg8 / 2;
			int var12 = -arg5 / 2;
			int var13 = (int) (Math.sin(arg0 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg0 / 326.11D) * 65536.0D);
			var13 = arg6 * var13 >> 8;
			var14 = arg6 * var14 >> 8;
			int var15 = (arg3 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg1 << 16) + var12 * var14 - var11 * var13;
			int var17 = YYTDUXDR.field1436 * arg9 + arg4;
			for (int var18 = 0; var18 < arg5; var18++) {
				int var19 = arg2[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg7[var18]; var23 < 0; var23++) {
					YYTDUXDR.field1435[var20++] = field1231[(var21 >> 16) + (var22 >> 16) * field1232];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += YYTDUXDR.field1436;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("TTWFVYGB.a(IIIIDIZII)V")
	public void method516(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg4) * 65536.0D);
			int var13 = (int) (Math.cos(arg4) * 65536.0D);
			var12 = arg1 * var12 >> 8;
			var13 = arg1 * var13 >> 8;
			int var14 = (arg2 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg0 << 16) + var11 * var13 - var10 * var12;
			int var16 = YYTDUXDR.field1436 * arg7 + arg5;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field1231[(var19 >> 16) + (var20 >> 16) * field1232];
					if (var22 == 0) {
						var18++;
					} else {
						YYTDUXDR.field1435[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += YYTDUXDR.field1436;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("TTWFVYGB.a(IIILKWBPZBYX;)V")
	public void method517(int arg0, int arg1, KWBPZBYX arg2) {
		arg1 += field1234;
		arg0 += field1235;
		int var4 = YYTDUXDR.field1436 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1233;
		int var7 = field1232;
		int var8 = YYTDUXDR.field1436 - var7;
		int var9 = 0;

		if (arg0 < YYTDUXDR.field1438) {
			int var10 = YYTDUXDR.field1438 - arg0;
			var6 -= var10;
			arg0 = YYTDUXDR.field1438;
			var5 += var7 * var10;
			var4 += YYTDUXDR.field1436 * var10;
		}

		if (arg0 + var6 > YYTDUXDR.field1439) {
			var6 -= arg0 + var6 - YYTDUXDR.field1439;
		}

		if (arg1 < YYTDUXDR.field1440) {
			int var11 = YYTDUXDR.field1440 - arg1;
			var7 -= var11;
			arg1 = YYTDUXDR.field1440;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > YYTDUXDR.field1441) {
			int var12 = arg1 + var7 - YYTDUXDR.field1441;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method518(0, var6, var5, YYTDUXDR.field1435, var4, var7, arg2.field904, field1231, var8, var9);
		}
	}

	@ObfuscatedName("TTWFVYGB.a(III[III[B[IIII)V")
	public void method518(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, byte[] arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg7[arg2++];
				if (var14 != 0 && arg6[arg4] == 0) {
					arg3[arg4++] = var14;
				} else {
					arg4++;
				}

				int var15 = arg7[arg2++];
				if (var15 != 0 && arg6[arg4] == 0) {
					arg3[arg4++] = var15;
				} else {
					arg4++;
				}

				int var16 = arg7[arg2++];
				if (var16 != 0 && arg6[arg4] == 0) {
					arg3[arg4++] = var16;
				} else {
					arg4++;
				}

				int var17 = arg7[arg2++];
				if (var17 != 0 && arg6[arg4] == 0) {
					arg3[arg4++] = var17;
				} else {
					arg4++;
				}
			}

			for (int var18 = arg5; var18 < 0; var18++) {
				int var19 = arg7[arg2++];
				if (var19 != 0 && arg6[arg4] == 0) {
					arg3[arg4++] = var19;
				} else {
					arg4++;
				}
			}

			arg4 += arg8;
			arg2 += arg9;
		}
	}
}
