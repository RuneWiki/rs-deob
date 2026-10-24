package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("GPLGZASP")
public final class GPLGZASP extends TIJYBGAE {

	@ObfuscatedName("GPLGZASP.C")
	public int[] field693;

	@ObfuscatedName("GPLGZASP.H")
	public int field698;

	@ObfuscatedName("GPLGZASP.D")
	public int field694;

	@ObfuscatedName("GPLGZASP.I")
	public int field699;

	@ObfuscatedName("GPLGZASP.E")
	public int field695;

	@ObfuscatedName("GPLGZASP.G")
	public int field697;

	@ObfuscatedName("GPLGZASP.F")
	public int field696;

	public GPLGZASP(int arg0, int arg1) {
		field693 = new int[arg0 * arg1];
		field694 = field698 = arg0;
		field695 = field699 = arg1;
		field696 = field697 = 0;
	}

	public GPLGZASP(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field694 = var3.getWidth(arg1);
			field695 = var3.getHeight(arg1);
			field698 = field694;
			field699 = field695;
			field696 = 0;
			field697 = 0;
			field693 = new int[field695 * field694];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field694, field695, field693, 0, field694);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public GPLGZASP(AWEEREDT arg0, String arg1, int arg2) {
		IUVBENCV var4 = new IUVBENCV(arg0.method14(arg1 + ".dat", null));
		IUVBENCV var5 = new IUVBENCV(arg0.method14("index.dat", null));
		var5.field733 = var4.method247();
		field698 = var5.method247();
		field699 = var5.method247();
		int var6 = var5.method245();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method249();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field733 += 2;
			var4.field733 += var5.method247() * var5.method247();
			var5.field733++;
		}

		field696 = var5.method245();
		field697 = var5.method245();
		field694 = var5.method247();
		field695 = var5.method247();
		int var10 = var5.method245();
		int var11 = field695 * field694;
		field693 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field693[var12] = var7[var4.method245()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field694; var13++) {
				for (int var14 = 0; var14 < field695; var14++) {
					field693[field694 * var14 + var13] = var7[var4.method245()];
				}
			}
		}
	}

	@ObfuscatedName("GPLGZASP.c(I)V")
	public void method215() {
		TIJYBGAE.method487(field694, field695, field693);
	}

	@ObfuscatedName("GPLGZASP.a(IIII)V")
	public void method216(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field693.length; var4++) {
			int var5 = field693[var4];
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

				field693[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("GPLGZASP.a(Z)V")
	public void method217() {
		int[] var1 = new int[field699 * field698];
		for (int var2 = 0; var2 < field695; var2++) {
			for (int var3 = 0; var3 < field694; var3++) {
				var1[(field697 + var2) * field698 + field696 + var3] = field693[field694 * var2 + var3];
			}
		}

		field693 = var1;
		field694 = field698;
		field695 = field699;
		field696 = 0;
		field697 = 0;
	}

	@ObfuscatedName("GPLGZASP.a(IZI)V")
	public void method218(int arg0, int arg1) {
		arg0 += field696;
		arg1 += field697;
		int var3 = TIJYBGAE.field1345 * arg1 + arg0;
		int var4 = 0;
		int var5 = field695;
		int var6 = field694;
		int var7 = TIJYBGAE.field1345 - var6;
		int var8 = 0;

		if (arg1 < TIJYBGAE.field1347) {
			int var9 = TIJYBGAE.field1347 - arg1;
			var5 -= var9;
			arg1 = TIJYBGAE.field1347;
			var4 += var6 * var9;
			var3 += TIJYBGAE.field1345 * var9;
		}

		if (arg1 + var5 > TIJYBGAE.field1348) {
			var5 -= arg1 + var5 - TIJYBGAE.field1348;
		}

		if (arg0 < TIJYBGAE.field1349) {
			int var10 = TIJYBGAE.field1349 - arg0;
			var6 -= var10;
			arg0 = TIJYBGAE.field1349;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > TIJYBGAE.field1350) {
			int var11 = arg0 + var6 - TIJYBGAE.field1350;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method219(TIJYBGAE.field1344, var6, var5, var4, field693, var7, var8, var3);
		}
	}

	@ObfuscatedName("GPLGZASP.a([IIIII[IIII)V")
	public void method219(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var10 = -arg2; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg0[arg7++] = arg4[arg3++];
				arg0[arg7++] = arg4[arg3++];
				arg0[arg7++] = arg4[arg3++];
				arg0[arg7++] = arg4[arg3++];
			}

			for (int var12 = arg1; var12 < 0; var12++) {
				arg0[arg7++] = arg4[arg3++];
			}

			arg7 += arg5;
			arg3 += arg6;
		}
	}

	@ObfuscatedName("GPLGZASP.a(III)V")
	public void method220(int arg0, int arg1) {
		arg1 += field696;
		arg0 += field697;
		int var3 = TIJYBGAE.field1345 * arg0 + arg1;
		int var4 = 0;
		int var5 = field695;
		int var6 = field694;
		int var7 = TIJYBGAE.field1345 - var6;
		int var8 = 0;

		if (arg0 < TIJYBGAE.field1347) {
			int var9 = TIJYBGAE.field1347 - arg0;
			var5 -= var9;
			arg0 = TIJYBGAE.field1347;
			var4 += var6 * var9;
			var3 += TIJYBGAE.field1345 * var9;
		}

		if (arg0 + var5 > TIJYBGAE.field1348) {
			var5 -= arg0 + var5 - TIJYBGAE.field1348;
		}

		if (arg1 < TIJYBGAE.field1349) {
			int var10 = TIJYBGAE.field1349 - arg1;
			var6 -= var10;
			arg1 = TIJYBGAE.field1349;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > TIJYBGAE.field1350) {
			int var11 = arg1 + var6 - TIJYBGAE.field1350;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method221(TIJYBGAE.field1344, field693, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("GPLGZASP.a([I[IIIIIIII)V")
	public void method221(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("GPLGZASP.a(IIIZ)V")
	public void method222(int arg0, int arg1, int arg2) {
		arg1 += field696;
		arg0 += field697;
		int var4 = TIJYBGAE.field1345 * arg0 + arg1;
		int var5 = 0;
		int var6 = field695;
		int var7 = field694;
		int var8 = TIJYBGAE.field1345 - var7;
		int var9 = 0;

		if (arg0 < TIJYBGAE.field1347) {
			int var10 = TIJYBGAE.field1347 - arg0;
			var6 -= var10;
			arg0 = TIJYBGAE.field1347;
			var5 += var7 * var10;
			var4 += TIJYBGAE.field1345 * var10;
		}

		if (arg0 + var6 > TIJYBGAE.field1348) {
			var6 -= arg0 + var6 - TIJYBGAE.field1348;
		}

		if (arg1 < TIJYBGAE.field1349) {
			int var11 = TIJYBGAE.field1349 - arg1;
			var7 -= var11;
			arg1 = TIJYBGAE.field1349;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > TIJYBGAE.field1350) {
			int var12 = arg1 + var7 - TIJYBGAE.field1350;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method223(var4, arg2, var6, var9, var7, var5, var8, TIJYBGAE.field1344, field693, 0);
		}
	}

	@ObfuscatedName("GPLGZASP.a(IIIIIII[I[IIB)V")
	public void method223(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8, int arg9) {
		int var11 = 256 - arg1;
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = arg8[arg5++];
				if (var14 == 0) {
					arg0++;
				} else {
					int var15 = arg7[arg0];
					arg7[arg0++] = ((var14 & 0xFF00FF) * arg1 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg1 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg0 += arg6;
			arg5 += arg3;
		}
	}

	@ObfuscatedName("GPLGZASP.a(III[II[IIIIII)V")
	public void method224(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg5 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg9 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg9 / 326.11D) * 65536.0D);
			var13 = arg1 * var13 >> 8;
			var14 = arg1 * var14 >> 8;
			int var15 = (arg7 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg8 << 16) + var12 * var14 - var11 * var13;
			int var17 = TIJYBGAE.field1345 * arg3 + arg0;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg4[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg2[var18]; var23 < 0; var23++) {
					TIJYBGAE.field1344[var20++] = field693[(var21 >> 16) + (var22 >> 16) * field694];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += TIJYBGAE.field1345;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("GPLGZASP.a(IIIIZIDII)V")
	public void method225(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg5) * 65536.0D);
			int var13 = (int) (Math.cos(arg5) * 65536.0D);
			var12 = arg0 * var12 >> 8;
			var13 = arg0 * var13 >> 8;
			int var14 = (arg6 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg1 << 16) + var11 * var13 - var10 * var12;
			int var16 = TIJYBGAE.field1345 * arg7 + arg4;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg2; var21 < 0; var21++) {
					int var22 = field693[(var19 >> 16) + (var20 >> 16) * field694];
					if (var22 == 0) {
						var18++;
					} else {
						TIJYBGAE.field1344[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += TIJYBGAE.field1345;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("GPLGZASP.a(IBILSFVBUBEZ;)V")
	public void method226(int arg0, int arg1, SFVBUBEZ arg2) {
		arg0 += field696;
		arg1 += field697;
		int var4 = TIJYBGAE.field1345 * arg1 + arg0;
		int var5 = 0;
		int var6 = field695;
		int var7 = field694;
		int var8 = TIJYBGAE.field1345 - var7;
		int var9 = 0;

		if (arg1 < TIJYBGAE.field1347) {
			int var10 = TIJYBGAE.field1347 - arg1;
			var6 -= var10;
			arg1 = TIJYBGAE.field1347;
			var5 += var7 * var10;
			var4 += TIJYBGAE.field1345 * var10;
		}

		if (arg1 + var6 > TIJYBGAE.field1348) {
			var6 -= arg1 + var6 - TIJYBGAE.field1348;
		}

		if (arg0 < TIJYBGAE.field1349) {
			int var11 = TIJYBGAE.field1349 - arg0;
			var7 -= var11;
			arg0 = TIJYBGAE.field1349;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > TIJYBGAE.field1350) {
			int var12 = arg0 + var7 - TIJYBGAE.field1350;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method227(var7, var5, var4, var9, var8, field693, TIJYBGAE.field1344, var6, arg2.field1274, 0);
		}
	}

	@ObfuscatedName("GPLGZASP.a(IIIII[II[II[BI)V")
	public void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, byte[] arg8, int arg9) {
		int var11 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg5[arg1++];
				if (var14 != 0 && arg8[arg2] == 0) {
					arg6[arg2++] = var14;
				} else {
					arg2++;
				}

				int var15 = arg5[arg1++];
				if (var15 != 0 && arg8[arg2] == 0) {
					arg6[arg2++] = var15;
				} else {
					arg2++;
				}

				int var16 = arg5[arg1++];
				if (var16 != 0 && arg8[arg2] == 0) {
					arg6[arg2++] = var16;
				} else {
					arg2++;
				}

				int var17 = arg5[arg1++];
				if (var17 != 0 && arg8[arg2] == 0) {
					arg6[arg2++] = var17;
				} else {
					arg2++;
				}
			}

			for (int var18 = arg0; var18 < 0; var18++) {
				int var19 = arg5[arg1++];
				if (var19 != 0 && arg8[arg2] == 0) {
					arg6[arg2++] = var19;
				} else {
					arg2++;
				}
			}

			arg2 += arg4;
			arg1 += arg3;
		}
	}
}
