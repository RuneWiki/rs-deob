package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("VZJVQLEE")
public final class VZJVQLEE extends GBJWVQAY {

	@ObfuscatedName("VZJVQLEE.D")
	public int[] field1293;

	@ObfuscatedName("VZJVQLEE.I")
	public int field1298;

	@ObfuscatedName("VZJVQLEE.E")
	public int field1294;

	@ObfuscatedName("VZJVQLEE.J")
	public int field1299;

	@ObfuscatedName("VZJVQLEE.F")
	public int field1295;

	@ObfuscatedName("VZJVQLEE.H")
	public int field1297;

	@ObfuscatedName("VZJVQLEE.G")
	public int field1296;

	public VZJVQLEE(int arg0, int arg1) {
		field1293 = new int[arg0 * arg1];
		field1294 = field1298 = arg0;
		field1295 = field1299 = arg1;
		field1296 = field1297 = 0;
	}

	public VZJVQLEE(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1294 = var3.getWidth(arg1);
			field1295 = var3.getHeight(arg1);
			field1298 = field1294;
			field1299 = field1295;
			field1296 = 0;
			field1297 = 0;
			field1293 = new int[field1295 * field1294];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1294, field1295, field1293, 0, field1294);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public VZJVQLEE(FUZJMGZB arg0, String arg1, int arg2) {
		LBBVYYXO var4 = new LBBVYYXO(arg0.method277(arg1 + ".dat", null));
		LBBVYYXO var5 = new LBBVYYXO(arg0.method277("index.dat", null));
		var5.field882 = var4.method371();
		field1298 = var5.method371();
		field1299 = var5.method371();
		int var6 = var5.method369();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method373();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field882 += 2;
			var4.field882 += var5.method371() * var5.method371();
			var5.field882++;
		}

		field1296 = var5.method369();
		field1297 = var5.method369();
		field1294 = var5.method371();
		field1295 = var5.method371();
		int var10 = var5.method369();
		int var11 = field1295 * field1294;
		field1293 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1293[var12] = var7[var4.method369()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1294; var13++) {
				for (int var14 = 0; var14 < field1295; var14++) {
					field1293[field1294 * var14 + var13] = var7[var4.method369()];
				}
			}
		}
	}

	@ObfuscatedName("VZJVQLEE.b(I)V")
	public void method536() {
		GBJWVQAY.method284(field1295, field1294, field1293);
	}

	@ObfuscatedName("VZJVQLEE.a(IBII)V")
	public void method537(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1293.length; var4++) {
			int var5 = field1293[var4];
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

				field1293[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("VZJVQLEE.c(I)V")
	public void method538() {
		int[] var1 = new int[field1299 * field1298];
		for (int var2 = 0; var2 < field1295; var2++) {
			for (int var3 = 0; var3 < field1294; var3++) {
				var1[(field1297 + var2) * field1298 + field1296 + var3] = field1293[field1294 * var2 + var3];
			}
		}

		field1293 = var1;
		field1294 = field1298;
		field1295 = field1299;
		field1296 = 0;
		field1297 = 0;
	}

	@ObfuscatedName("VZJVQLEE.a(III)V")
	public void method539(int arg0, int arg1) {
		arg0 += field1296;
		arg1 += field1297;
		int var3 = GBJWVQAY.field821 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1295;
		int var6 = field1294;
		int var7 = GBJWVQAY.field821 - var6;
		int var8 = 0;

		if (arg1 < GBJWVQAY.field823) {
			int var9 = GBJWVQAY.field823 - arg1;
			var5 -= var9;
			arg1 = GBJWVQAY.field823;
			var4 += var6 * var9;
			var3 += GBJWVQAY.field821 * var9;
		}

		if (arg1 + var5 > GBJWVQAY.field824) {
			var5 -= arg1 + var5 - GBJWVQAY.field824;
		}

		if (arg0 < GBJWVQAY.field825) {
			int var10 = GBJWVQAY.field825 - arg0;
			var6 -= var10;
			arg0 = GBJWVQAY.field825;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > GBJWVQAY.field826) {
			int var11 = arg0 + var6 - GBJWVQAY.field826;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method540(field1293, var8, var3, var5, GBJWVQAY.field820, var4, var6, var7);
		}
	}

	@ObfuscatedName("VZJVQLEE.a([IIIII[IIII)V")
	public void method540(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var10 = -arg3; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg4[arg2++] = arg0[arg5++];
				arg4[arg2++] = arg0[arg5++];
				arg4[arg2++] = arg0[arg5++];
				arg4[arg2++] = arg0[arg5++];
			}

			for (int var12 = arg6; var12 < 0; var12++) {
				arg4[arg2++] = arg0[arg5++];
			}

			arg2 += arg7;
			arg5 += arg1;
		}
	}

	@ObfuscatedName("VZJVQLEE.b(III)V")
	public void method541(int arg0, int arg1) {
		arg0 += field1296;
		arg1 += field1297;
		int var3 = GBJWVQAY.field821 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1295;
		int var6 = field1294;
		int var7 = GBJWVQAY.field821 - var6;
		int var8 = 0;

		if (arg1 < GBJWVQAY.field823) {
			int var9 = GBJWVQAY.field823 - arg1;
			var5 -= var9;
			arg1 = GBJWVQAY.field823;
			var4 += var6 * var9;
			var3 += GBJWVQAY.field821 * var9;
		}

		if (arg1 + var5 > GBJWVQAY.field824) {
			var5 -= arg1 + var5 - GBJWVQAY.field824;
		}

		if (arg0 < GBJWVQAY.field825) {
			int var10 = GBJWVQAY.field825 - arg0;
			var6 -= var10;
			arg0 = GBJWVQAY.field825;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > GBJWVQAY.field826) {
			int var11 = arg0 + var6 - GBJWVQAY.field826;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method542(GBJWVQAY.field820, field1293, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("VZJVQLEE.a([I[IIIIIIII)V")
	public void method542(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("VZJVQLEE.a(IIII)V")
	public void method543(int arg0, int arg1, int arg2) {
		arg1 += field1296;
		arg2 += field1297;
		int var4 = GBJWVQAY.field821 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1295;
		int var7 = field1294;
		int var8 = GBJWVQAY.field821 - var7;
		int var9 = 0;

		if (arg2 < GBJWVQAY.field823) {
			int var10 = GBJWVQAY.field823 - arg2;
			var6 -= var10;
			arg2 = GBJWVQAY.field823;
			var5 += var7 * var10;
			var4 += GBJWVQAY.field821 * var10;
		}

		if (arg2 + var6 > GBJWVQAY.field824) {
			var6 -= arg2 + var6 - GBJWVQAY.field824;
		}

		if (arg1 < GBJWVQAY.field825) {
			int var11 = GBJWVQAY.field825 - arg1;
			var7 -= var11;
			arg1 = GBJWVQAY.field825;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > GBJWVQAY.field826) {
			int var12 = arg1 + var7 - GBJWVQAY.field826;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method544(var5, var7, var4, GBJWVQAY.field820, var6, arg0, 0, var8, field1293, var9);
		}
	}

	@ObfuscatedName("VZJVQLEE.a(III[IIIII[IBI)V")
	public void method544(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		int var11 = 256 - arg5;
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = arg8[arg0++];
				if (var14 == 0) {
					arg2++;
				} else {
					int var15 = arg3[arg2];
					arg3[arg2++] = ((var14 & 0xFF00FF) * arg5 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg5 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg2 += arg7;
			arg0 += arg9;
		}
	}

	@ObfuscatedName("VZJVQLEE.a(IZIII[II[IIII)V")
	public void method545(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg7 / 2;
			int var12 = -arg2 / 2;
			int var13 = (int) (Math.sin(arg0 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg0 / 326.11D) * 65536.0D);
			var13 = arg3 * var13 >> 8;
			var14 = arg3 * var14 >> 8;
			int var15 = (arg8 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg1 << 16) + var12 * var14 - var11 * var13;
			int var17 = GBJWVQAY.field821 * arg5 + arg9;
			for (int var18 = 0; var18 < arg2; var18++) {
				int var19 = arg4[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg6[var18]; var23 < 0; var23++) {
					GBJWVQAY.field820[var20++] = field1293[(var21 >> 16) + (var22 >> 16) * field1294];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += GBJWVQAY.field821;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("VZJVQLEE.a(IIIIDIIII)V")
	public void method546(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg1 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg4) * 65536.0D);
			int var13 = (int) (Math.cos(arg4) * 65536.0D);
			var12 = arg5 * var12 >> 8;
			var13 = arg5 * var13 >> 8;
			int var14 = (arg2 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg0 << 16) + var11 * var13 - var10 * var12;
			int var16 = GBJWVQAY.field821 * arg6 + arg7;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg1; var21 < 0; var21++) {
					int var22 = field1293[(var19 >> 16) + (var20 >> 16) * field1294];
					if (var22 == 0) {
						var18++;
					} else {
						GBJWVQAY.field820[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += GBJWVQAY.field821;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("VZJVQLEE.a(IIBLZQSBFHWZ;)V")
	public void method547(int arg0, int arg1, ZQSBFHWZ arg2) {
		arg1 += field1296;
		arg0 += field1297;
		int var4 = GBJWVQAY.field821 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1295;
		int var7 = field1294;
		int var8 = GBJWVQAY.field821 - var7;
		int var9 = 0;

		if (arg0 < GBJWVQAY.field823) {
			int var10 = GBJWVQAY.field823 - arg0;
			var6 -= var10;
			arg0 = GBJWVQAY.field823;
			var5 += var7 * var10;
			var4 += GBJWVQAY.field821 * var10;
		}

		if (arg0 + var6 > GBJWVQAY.field824) {
			var6 -= arg0 + var6 - GBJWVQAY.field824;
		}

		if (arg1 < GBJWVQAY.field825) {
			int var11 = GBJWVQAY.field825 - arg1;
			var7 -= var11;
			arg1 = GBJWVQAY.field825;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > GBJWVQAY.field826) {
			int var12 = arg1 + var7 - GBJWVQAY.field826;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method548(var8, field1293, arg2.field1474, 0, var5, var9, GBJWVQAY.field820, var4, var6, var7);
		}
	}

	@ObfuscatedName("VZJVQLEE.a(I[I[BIIIZ[IIII)V")
	public void method548(int arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg9 >> 2);
		arg9 = -(arg9 & 0x3);
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg1[arg4++];
				if (var14 != 0 && arg2[arg7] == 0) {
					arg6[arg7++] = var14;
				} else {
					arg7++;
				}

				int var15 = arg1[arg4++];
				if (var15 != 0 && arg2[arg7] == 0) {
					arg6[arg7++] = var15;
				} else {
					arg7++;
				}

				int var16 = arg1[arg4++];
				if (var16 != 0 && arg2[arg7] == 0) {
					arg6[arg7++] = var16;
				} else {
					arg7++;
				}

				int var17 = arg1[arg4++];
				if (var17 != 0 && arg2[arg7] == 0) {
					arg6[arg7++] = var17;
				} else {
					arg7++;
				}
			}

			for (int var18 = arg9; var18 < 0; var18++) {
				int var19 = arg1[arg4++];
				if (var19 != 0 && arg2[arg7] == 0) {
					arg6[arg7++] = var19;
				} else {
					arg7++;
				}
			}

			arg7 += arg0;
			arg4 += arg5;
		}
	}
}
