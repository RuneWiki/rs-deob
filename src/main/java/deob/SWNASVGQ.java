package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("SWNASVGQ")
public final class SWNASVGQ extends UKUXLUWP {

	@ObfuscatedName("SWNASVGQ.E")
	public int[] field1245;

	@ObfuscatedName("SWNASVGQ.J")
	public int field1250;

	@ObfuscatedName("SWNASVGQ.F")
	public int field1246;

	@ObfuscatedName("SWNASVGQ.K")
	public int field1251;

	@ObfuscatedName("SWNASVGQ.G")
	public int field1247;

	@ObfuscatedName("SWNASVGQ.I")
	public int field1249;

	@ObfuscatedName("SWNASVGQ.H")
	public int field1248;

	public SWNASVGQ(int arg0, int arg1) {
		field1245 = new int[arg0 * arg1];
		field1246 = field1250 = arg0;
		field1247 = field1251 = arg1;
		field1248 = field1249 = 0;
	}

	public SWNASVGQ(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1246 = var3.getWidth(arg1);
			field1247 = var3.getHeight(arg1);
			field1250 = field1246;
			field1251 = field1247;
			field1248 = 0;
			field1249 = 0;
			field1245 = new int[field1247 * field1246];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1246, field1247, field1245, 0, field1246);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public SWNASVGQ(GWOEELWB arg0, String arg1, int arg2) {
		MLYYHULT var4 = new MLYYHULT(arg0.method249(arg1 + ".dat", null));
		MLYYHULT var5 = new MLYYHULT(arg0.method249("index.dat", null));
		var5.field963 = var4.method298();
		field1250 = var5.method298();
		field1251 = var5.method298();
		int var6 = var5.method296();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method300();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field963 += 2;
			var4.field963 += var5.method298() * var5.method298();
			var5.field963++;
		}

		field1248 = var5.method296();
		field1249 = var5.method296();
		field1246 = var5.method298();
		field1247 = var5.method298();
		int var10 = var5.method296();
		int var11 = field1247 * field1246;
		field1245 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1245[var12] = var7[var4.method296()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1246; var13++) {
				for (int var14 = 0; var14 < field1247; var14++) {
					field1245[field1246 * var14 + var13] = var7[var4.method296()];
				}
			}
		}
	}

	@ObfuscatedName("SWNASVGQ.b(I)V")
	public void method469() {
		UKUXLUWP.method541(field1246, field1245, field1247);
	}

	@ObfuscatedName("SWNASVGQ.a(IIII)V")
	public void method470(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1245.length; var4++) {
			int var5 = field1245[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg2;
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
				var8 += arg0;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field1245[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("SWNASVGQ.c(I)V")
	public void method471() {
		int[] var1 = new int[field1251 * field1250];
		for (int var2 = 0; var2 < field1247; var2++) {
			for (int var3 = 0; var3 < field1246; var3++) {
				var1[(field1249 + var2) * field1250 + field1248 + var3] = field1245[field1246 * var2 + var3];
			}
		}

		field1245 = var1;
		field1246 = field1250;
		field1247 = field1251;
		field1248 = 0;
		field1249 = 0;
	}

	@ObfuscatedName("SWNASVGQ.a(IIZ)V")
	public void method472(int arg0, int arg1) {
		arg0 += field1248;
		arg1 += field1249;
		int var3 = UKUXLUWP.field1346 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1247;
		int var6 = field1246;
		int var7 = UKUXLUWP.field1346 - var6;
		int var8 = 0;

		if (arg1 < UKUXLUWP.field1348) {
			int var9 = UKUXLUWP.field1348 - arg1;
			var5 -= var9;
			arg1 = UKUXLUWP.field1348;
			var4 += var6 * var9;
			var3 += UKUXLUWP.field1346 * var9;
		}

		if (arg1 + var5 > UKUXLUWP.field1349) {
			var5 -= arg1 + var5 - UKUXLUWP.field1349;
		}

		if (arg0 < UKUXLUWP.field1350) {
			int var10 = UKUXLUWP.field1350 - arg0;
			var6 -= var10;
			arg0 = UKUXLUWP.field1350;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > UKUXLUWP.field1351) {
			int var11 = arg0 + var6 - UKUXLUWP.field1351;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method473(var6, UKUXLUWP.field1345, var3, var7, field1245, var4, var5, var8);
		}
	}

	@ObfuscatedName("SWNASVGQ.a(I[III[IIIII)V")
	public void method473(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg2++] = arg4[arg5++];
				arg1[arg2++] = arg4[arg5++];
				arg1[arg2++] = arg4[arg5++];
				arg1[arg2++] = arg4[arg5++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg1[arg2++] = arg4[arg5++];
			}

			arg2 += arg3;
			arg5 += arg7;
		}
	}

	@ObfuscatedName("SWNASVGQ.a(IIB)V")
	public void method474(int arg0, int arg1) {
		arg0 += field1248;
		arg1 += field1249;
		int var3 = UKUXLUWP.field1346 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1247;
		int var6 = field1246;
		int var7 = UKUXLUWP.field1346 - var6;
		int var8 = 0;

		if (arg1 < UKUXLUWP.field1348) {
			int var9 = UKUXLUWP.field1348 - arg1;
			var5 -= var9;
			arg1 = UKUXLUWP.field1348;
			var4 += var6 * var9;
			var3 += UKUXLUWP.field1346 * var9;
		}

		if (arg1 + var5 > UKUXLUWP.field1349) {
			var5 -= arg1 + var5 - UKUXLUWP.field1349;
		}

		if (arg0 < UKUXLUWP.field1350) {
			int var10 = UKUXLUWP.field1350 - arg0;
			var6 -= var10;
			arg0 = UKUXLUWP.field1350;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > UKUXLUWP.field1351) {
			int var11 = arg0 + var6 - UKUXLUWP.field1351;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method475(UKUXLUWP.field1345, field1245, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("SWNASVGQ.a([I[IIIIIIII)V")
	public void method475(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("SWNASVGQ.b(IIII)V")
	public void method476(int arg0, int arg1, int arg2) {
		arg0 += field1248;
		arg1 += field1249;
		int var4 = UKUXLUWP.field1346 * arg1 + arg0;
		int var5 = 0;
		int var6 = field1247;
		int var7 = field1246;
		int var8 = UKUXLUWP.field1346 - var7;
		int var9 = 0;

		if (arg1 < UKUXLUWP.field1348) {
			int var10 = UKUXLUWP.field1348 - arg1;
			var6 -= var10;
			arg1 = UKUXLUWP.field1348;
			var5 += var7 * var10;
			var4 += UKUXLUWP.field1346 * var10;
		}

		if (arg1 + var6 > UKUXLUWP.field1349) {
			var6 -= arg1 + var6 - UKUXLUWP.field1349;
		}

		if (arg0 < UKUXLUWP.field1350) {
			int var11 = UKUXLUWP.field1350 - arg0;
			var7 -= var11;
			arg0 = UKUXLUWP.field1350;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > UKUXLUWP.field1351) {
			int var12 = arg0 + var7 - UKUXLUWP.field1351;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method477(UKUXLUWP.field1345, arg2, var5, var4, 0, var6, field1245, var7, var8, var9);
		}
	}

	@ObfuscatedName("SWNASVGQ.a([IIIIZII[IIII)V")
	public void method477(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg1;
		for (int var12 = -arg5; var12 < 0; var12++) {
			for (int var13 = -arg7; var13 < 0; var13++) {
				int var14 = arg6[arg2++];
				if (var14 == 0) {
					arg3++;
				} else {
					int var15 = arg0[arg3];
					arg0[arg3++] = ((var14 & 0xFF00FF) * arg1 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg1 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg3 += arg8;
			arg2 += arg9;
		}
	}

	@ObfuscatedName("SWNASVGQ.a([I[IIIIIIIIII)V")
	public void method478(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg7 / 2;
			int var12 = -arg9 / 2;
			int var13 = (int) (Math.sin(arg8 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg8 / 326.11D) * 65536.0D);
			var13 = arg3 * var13 >> 8;
			var14 = arg3 * var14 >> 8;
			int var15 = (arg5 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg6 << 16) + var12 * var14 - var11 * var13;
			int var17 = UKUXLUWP.field1346 * arg2 + arg4;
			for (int var18 = 0; var18 < arg9; var18++) {
				int var19 = arg0[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg1[var18]; var23 < 0; var23++) {
					UKUXLUWP.field1345[var20++] = field1245[(var21 >> 16) + (var22 >> 16) * field1246];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += UKUXLUWP.field1346;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("SWNASVGQ.a(IIDBIIIII)V")
	public void method479(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg3 / 2;
			int var11 = -arg1 / 2;
			int var12 = (int) (Math.sin(arg2) * 65536.0D);
			int var13 = (int) (Math.cos(arg2) * 65536.0D);
			var12 = arg5 * var12 >> 8;
			var13 = arg5 * var13 >> 8;
			int var14 = (arg6 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = UKUXLUWP.field1346 * arg7 + arg0;
			for (int var17 = 0; var17 < arg1; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg3; var21 < 0; var21++) {
					int var22 = field1245[(var19 >> 16) + (var20 >> 16) * field1246];
					if (var22 == 0) {
						var18++;
					} else {
						UKUXLUWP.field1345[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += UKUXLUWP.field1346;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("SWNASVGQ.a(IIILNUXLZYAZ;)V")
	public void method480(int arg0, int arg1, NUXLZYAZ arg2) {
		arg1 += field1248;
		arg0 += field1249;
		int var4 = UKUXLUWP.field1346 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1247;
		int var7 = field1246;
		int var8 = UKUXLUWP.field1346 - var7;
		int var9 = 0;

		if (arg0 < UKUXLUWP.field1348) {
			int var10 = UKUXLUWP.field1348 - arg0;
			var6 -= var10;
			arg0 = UKUXLUWP.field1348;
			var5 += var7 * var10;
			var4 += UKUXLUWP.field1346 * var10;
		}

		if (arg0 + var6 > UKUXLUWP.field1349) {
			var6 -= arg0 + var6 - UKUXLUWP.field1349;
		}

		if (arg1 < UKUXLUWP.field1350) {
			int var11 = UKUXLUWP.field1350 - arg1;
			var7 -= var11;
			arg1 = UKUXLUWP.field1350;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > UKUXLUWP.field1351) {
			int var12 = arg1 + var7 - UKUXLUWP.field1351;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method481(var6, var7, UKUXLUWP.field1345, var8, arg2.field988, field1245, 0, var4, var9, var5);
		}
	}

	@ObfuscatedName("SWNASVGQ.a(III[II[B[IIIII)V")
	public void method481(int arg0, int arg1, int[] arg2, int arg3, byte[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var12 = -arg0; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg5[arg9++];
				if (var14 != 0 && arg4[arg7] == 0) {
					arg2[arg7++] = var14;
				} else {
					arg7++;
				}

				int var15 = arg5[arg9++];
				if (var15 != 0 && arg4[arg7] == 0) {
					arg2[arg7++] = var15;
				} else {
					arg7++;
				}

				int var16 = arg5[arg9++];
				if (var16 != 0 && arg4[arg7] == 0) {
					arg2[arg7++] = var16;
				} else {
					arg7++;
				}

				int var17 = arg5[arg9++];
				if (var17 != 0 && arg4[arg7] == 0) {
					arg2[arg7++] = var17;
				} else {
					arg7++;
				}
			}

			for (int var18 = arg1; var18 < 0; var18++) {
				int var19 = arg5[arg9++];
				if (var19 != 0 && arg4[arg7] == 0) {
					arg2[arg7++] = var19;
				} else {
					arg7++;
				}
			}

			arg7 += arg3;
			arg9 += arg8;
		}
	}
}
