package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("UFHMHWIH")
public final class UFHMHWIH extends JJCVVTJN {

	@ObfuscatedName("UFHMHWIH.B")
	public int[] field1148;

	@ObfuscatedName("UFHMHWIH.G")
	public int field1153;

	@ObfuscatedName("UFHMHWIH.C")
	public int field1149;

	@ObfuscatedName("UFHMHWIH.H")
	public int field1154;

	@ObfuscatedName("UFHMHWIH.D")
	public int field1150;

	@ObfuscatedName("UFHMHWIH.F")
	public int field1152;

	@ObfuscatedName("UFHMHWIH.E")
	public int field1151;

	public UFHMHWIH(int arg0, int arg1) {
		field1148 = new int[arg0 * arg1];
		field1149 = field1153 = arg0;
		field1150 = field1154 = arg1;
		field1151 = field1152 = 0;
	}

	public UFHMHWIH(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1149 = var3.getWidth(arg1);
			field1150 = var3.getHeight(arg1);
			field1153 = field1149;
			field1154 = field1150;
			field1151 = 0;
			field1152 = 0;
			field1148 = new int[field1150 * field1149];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1149, field1150, field1148, 0, field1149);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public UFHMHWIH(CXFTMSCH arg0, String arg1, int arg2) {
		MQZHAILV var4 = new MQZHAILV(arg0.method176(arg1 + ".dat", null));
		MQZHAILV var5 = new MQZHAILV(arg0.method176("index.dat", null));
		var5.field797 = var4.method327();
		field1153 = var5.method327();
		field1154 = var5.method327();
		int var6 = var5.method325();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method329();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field797 += 2;
			var4.field797 += var5.method327() * var5.method327();
			var5.field797++;
		}

		field1151 = var5.method325();
		field1152 = var5.method325();
		field1149 = var5.method327();
		field1150 = var5.method327();
		int var10 = var5.method325();
		int var11 = field1150 * field1149;
		field1148 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1148[var12] = var7[var4.method325()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1149; var13++) {
				for (int var14 = 0; var14 < field1150; var14++) {
					field1148[field1149 * var14 + var13] = var7[var4.method325()];
				}
			}
		}
	}

	@ObfuscatedName("UFHMHWIH.b(I)V")
	public void method493() {
		JJCVVTJN.method253(field1150, field1149, field1148);
	}

	@ObfuscatedName("UFHMHWIH.a(IIIB)V")
	public void method494(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1148.length; var4++) {
			int var5 = field1148[var4];
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

				field1148[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("UFHMHWIH.c(I)V")
	public void method495() {
		int[] var1 = new int[field1154 * field1153];
		for (int var2 = 0; var2 < field1150; var2++) {
			for (int var3 = 0; var3 < field1149; var3++) {
				var1[(field1152 + var2) * field1153 + field1151 + var3] = field1148[field1149 * var2 + var3];
			}
		}

		field1148 = var1;
		field1149 = field1153;
		field1150 = field1154;
		field1151 = 0;
		field1152 = 0;
	}

	@ObfuscatedName("UFHMHWIH.a(IIZ)V")
	public void method496(int arg0, int arg1) {
		arg1 += field1151;
		arg0 += field1152;
		int var3 = JJCVVTJN.field676 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1150;
		int var6 = field1149;
		int var7 = JJCVVTJN.field676 - var6;
		int var8 = 0;

		if (arg0 < JJCVVTJN.field678) {
			int var9 = JJCVVTJN.field678 - arg0;
			var5 -= var9;
			arg0 = JJCVVTJN.field678;
			var4 += var6 * var9;
			var3 += JJCVVTJN.field676 * var9;
		}

		if (arg0 + var5 > JJCVVTJN.field679) {
			var5 -= arg0 + var5 - JJCVVTJN.field679;
		}

		if (arg1 < JJCVVTJN.field680) {
			int var10 = JJCVVTJN.field680 - arg1;
			var6 -= var10;
			arg1 = JJCVVTJN.field680;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > JJCVVTJN.field681) {
			int var11 = arg1 + var6 - JJCVVTJN.field681;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method497(var7, var6, var3, var5, JJCVVTJN.field675, var4, var8, field1148);
		}
	}

	@ObfuscatedName("UFHMHWIH.a(IIIII[III[I)V")
	public void method497(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var10 = -arg3; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg4[arg2++] = arg7[arg5++];
				arg4[arg2++] = arg7[arg5++];
				arg4[arg2++] = arg7[arg5++];
				arg4[arg2++] = arg7[arg5++];
			}

			for (int var12 = arg1; var12 < 0; var12++) {
				arg4[arg2++] = arg7[arg5++];
			}

			arg2 += arg0;
			arg5 += arg6;
		}
	}

	@ObfuscatedName("UFHMHWIH.a(III)V")
	public void method498(int arg0, int arg1) {
		arg0 += field1151;
		arg1 += field1152;
		int var3 = JJCVVTJN.field676 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1150;
		int var6 = field1149;
		int var7 = JJCVVTJN.field676 - var6;
		int var8 = 0;

		if (arg1 < JJCVVTJN.field678) {
			int var9 = JJCVVTJN.field678 - arg1;
			var5 -= var9;
			arg1 = JJCVVTJN.field678;
			var4 += var6 * var9;
			var3 += JJCVVTJN.field676 * var9;
		}

		if (arg1 + var5 > JJCVVTJN.field679) {
			var5 -= arg1 + var5 - JJCVVTJN.field679;
		}

		if (arg0 < JJCVVTJN.field680) {
			int var10 = JJCVVTJN.field680 - arg0;
			var6 -= var10;
			arg0 = JJCVVTJN.field680;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > JJCVVTJN.field681) {
			int var11 = arg0 + var6 - JJCVVTJN.field681;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method499(JJCVVTJN.field675, field1148, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("UFHMHWIH.a([I[IIIIIIII)V")
	public void method499(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("UFHMHWIH.a(IIII)V")
	public void method500(int arg0, int arg1, int arg2) {
		arg1 += field1151;
		arg2 += field1152;
		int var4 = JJCVVTJN.field676 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1150;
		int var7 = field1149;
		int var8 = JJCVVTJN.field676 - var7;
		int var9 = 0;

		if (arg2 < JJCVVTJN.field678) {
			int var10 = JJCVVTJN.field678 - arg2;
			var6 -= var10;
			arg2 = JJCVVTJN.field678;
			var5 += var7 * var10;
			var4 += JJCVVTJN.field676 * var10;
		}

		if (arg2 + var6 > JJCVVTJN.field679) {
			var6 -= arg2 + var6 - JJCVVTJN.field679;
		}

		if (arg1 < JJCVVTJN.field680) {
			int var11 = JJCVVTJN.field680 - arg1;
			var7 -= var11;
			arg1 = JJCVVTJN.field680;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > JJCVVTJN.field681) {
			int var12 = arg1 + var7 - JJCVVTJN.field681;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method501(field1148, var6, var7, 0, JJCVVTJN.field675, var8, arg0, var5, var4, var9);
		}
	}

	@ObfuscatedName("UFHMHWIH.a([IIIII[IIIIII)V")
	public void method501(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg6;
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = arg0[arg7++];
				if (var14 == 0) {
					arg8++;
				} else {
					int var15 = arg4[arg8];
					arg4[arg8++] = ((var14 & 0xFF00FF) * arg6 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg6 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg8 += arg5;
			arg7 += arg9;
		}
	}

	@ObfuscatedName("UFHMHWIH.a(I[III[IIIIIII)V")
	public void method502(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg4 / 2;
			int var12 = -arg5 / 2;
			int var13 = (int) (Math.sin(arg9 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg9 / 326.11D) * 65536.0D);
			var13 = arg2 * var13 >> 8;
			var14 = arg2 * var14 >> 8;
			int var15 = (arg0 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg6 << 16) + var12 * var14 - var11 * var13;
			int var17 = JJCVVTJN.field676 * arg7 + arg8;
			for (int var18 = 0; var18 < arg5; var18++) {
				int var19 = arg3[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg1[var18]; var23 < 0; var23++) {
					JJCVVTJN.field675[var20++] = field1148[(var21 >> 16) + (var22 >> 16) * field1149];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += JJCVVTJN.field676;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("UFHMHWIH.a(IIIIIIDII)V")
	public void method503(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7) {
		try {
			int var10 = -arg3 / 2;
			int var11 = -arg0 / 2;
			int var12 = (int) (Math.sin(arg5) * 65536.0D);
			int var13 = (int) (Math.cos(arg5) * 65536.0D);
			var12 = arg6 * var12 >> 8;
			var13 = arg6 * var13 >> 8;
			int var14 = (arg7 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg2 << 16) + var11 * var13 - var10 * var12;
			int var16 = JJCVVTJN.field676 * arg4 + arg1;
			for (int var17 = 0; var17 < arg0; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg3; var21 < 0; var21++) {
					int var22 = field1148[(var19 >> 16) + (var20 >> 16) * field1149];
					if (var22 == 0) {
						var18++;
					} else {
						JJCVVTJN.field675[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += JJCVVTJN.field676;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("UFHMHWIH.a(IZLHQETDHHW;I)V")
	public void method504(int arg0, HQETDHHW arg1, int arg2) {
		arg0 += field1151;
		arg2 += field1152;
		int var4 = JJCVVTJN.field676 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1150;
		int var7 = field1149;
		int var8 = JJCVVTJN.field676 - var7;
		int var9 = 0;

		if (arg2 < JJCVVTJN.field678) {
			int var10 = JJCVVTJN.field678 - arg2;
			var6 -= var10;
			arg2 = JJCVVTJN.field678;
			var5 += var7 * var10;
			var4 += JJCVVTJN.field676 * var10;
		}

		if (arg2 + var6 > JJCVVTJN.field679) {
			var6 -= arg2 + var6 - JJCVVTJN.field679;
		}

		if (arg0 < JJCVVTJN.field680) {
			int var11 = JJCVVTJN.field680 - arg0;
			var7 -= var11;
			arg0 = JJCVVTJN.field680;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > JJCVVTJN.field681) {
			int var12 = arg0 + var7 - JJCVVTJN.field681;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method505(0, var6, field1148, JJCVVTJN.field675, var9, arg1.field648, var4, var7, var8, var5);
		}
	}

	@ObfuscatedName("UFHMHWIH.a(III[I[II[BIIII)V")
	public void method505(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg2[arg9++];
				if (var14 != 0 && arg5[arg6] == 0) {
					arg3[arg6++] = var14;
				} else {
					arg6++;
				}

				int var15 = arg2[arg9++];
				if (var15 != 0 && arg5[arg6] == 0) {
					arg3[arg6++] = var15;
				} else {
					arg6++;
				}

				int var16 = arg2[arg9++];
				if (var16 != 0 && arg5[arg6] == 0) {
					arg3[arg6++] = var16;
				} else {
					arg6++;
				}

				int var17 = arg2[arg9++];
				if (var17 != 0 && arg5[arg6] == 0) {
					arg3[arg6++] = var17;
				} else {
					arg6++;
				}
			}

			for (int var18 = arg7; var18 < 0; var18++) {
				int var19 = arg2[arg9++];
				if (var19 != 0 && arg5[arg6] == 0) {
					arg3[arg6++] = var19;
				} else {
					arg6++;
				}
			}

			arg6 += arg8;
			arg9 += arg4;
		}
	}
}
