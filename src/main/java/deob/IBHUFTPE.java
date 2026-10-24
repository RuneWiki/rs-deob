package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("IBHUFTPE")
public final class IBHUFTPE extends FVBHOYJF {

	@ObfuscatedName("IBHUFTPE.B")
	public int[] field692;

	@ObfuscatedName("IBHUFTPE.G")
	public int field697;

	@ObfuscatedName("IBHUFTPE.C")
	public int field693;

	@ObfuscatedName("IBHUFTPE.H")
	public int field698;

	@ObfuscatedName("IBHUFTPE.D")
	public int field694;

	@ObfuscatedName("IBHUFTPE.F")
	public int field696;

	@ObfuscatedName("IBHUFTPE.E")
	public int field695;

	public IBHUFTPE(int arg0, int arg1) {
		field692 = new int[arg0 * arg1];
		field693 = field697 = arg0;
		field694 = field698 = arg1;
		field695 = field696 = 0;
	}

	public IBHUFTPE(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field693 = var3.getWidth(arg1);
			field694 = var3.getHeight(arg1);
			field697 = field693;
			field698 = field694;
			field695 = 0;
			field696 = 0;
			field692 = new int[field694 * field693];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field693, field694, field692, 0, field693);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public IBHUFTPE(IEMHZJLX arg0, String arg1, int arg2) {
		MVHXDWGI var4 = new MVHXDWGI(arg0.method242(arg1 + ".dat", null));
		MVHXDWGI var5 = new MVHXDWGI(arg0.method242("index.dat", null));
		var5.field1014 = var4.method359();
		field697 = var5.method359();
		field698 = var5.method359();
		int var6 = var5.method357();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method361();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1014 += 2;
			var4.field1014 += var5.method359() * var5.method359();
			var5.field1014++;
		}

		field695 = var5.method357();
		field696 = var5.method357();
		field693 = var5.method359();
		field694 = var5.method359();
		int var10 = var5.method357();
		int var11 = field694 * field693;
		field692 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field692[var12] = var7[var4.method357()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field693; var13++) {
				for (int var14 = 0; var14 < field694; var14++) {
					field692[field693 * var14 + var13] = var7[var4.method357()];
				}
			}
		}
	}

	@ObfuscatedName("IBHUFTPE.b(B)V")
	public void method228() {
		FVBHOYJF.method209(field692, field694, field693);
	}

	@ObfuscatedName("IBHUFTPE.a(BIII)V")
	public void method229(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field692.length; var4++) {
			int var5 = field692[var4];
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

				field692[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("IBHUFTPE.b(I)V")
	public void method230() {
		int[] var1 = new int[field698 * field697];
		for (int var2 = 0; var2 < field694; var2++) {
			for (int var3 = 0; var3 < field693; var3++) {
				var1[(field696 + var2) * field697 + field695 + var3] = field692[field693 * var2 + var3];
			}
		}

		field692 = var1;
		field693 = field697;
		field694 = field698;
		field695 = 0;
		field696 = 0;
	}

	@ObfuscatedName("IBHUFTPE.a(ZII)V")
	public void method231(int arg0, int arg1) {
		arg0 += field695;
		arg1 += field696;
		int var3 = FVBHOYJF.field640 * arg1 + arg0;
		int var4 = 0;
		int var5 = field694;
		int var6 = field693;
		int var7 = FVBHOYJF.field640 - var6;
		int var8 = 0;

		if (arg1 < FVBHOYJF.field642) {
			int var9 = FVBHOYJF.field642 - arg1;
			var5 -= var9;
			arg1 = FVBHOYJF.field642;
			var4 += var6 * var9;
			var3 += FVBHOYJF.field640 * var9;
		}

		if (arg1 + var5 > FVBHOYJF.field643) {
			var5 -= arg1 + var5 - FVBHOYJF.field643;
		}

		if (arg0 < FVBHOYJF.field644) {
			int var10 = FVBHOYJF.field644 - arg0;
			var6 -= var10;
			arg0 = FVBHOYJF.field644;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > FVBHOYJF.field645) {
			int var11 = arg0 + var6 - FVBHOYJF.field645;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method232(var6, FVBHOYJF.field639, var7, var4, var8, var3, var5, field692);
		}
	}

	@ObfuscatedName("IBHUFTPE.a(II[IIIIII[I)V")
	public void method232(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg5++] = arg7[arg3++];
				arg1[arg5++] = arg7[arg3++];
				arg1[arg5++] = arg7[arg3++];
				arg1[arg5++] = arg7[arg3++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg1[arg5++] = arg7[arg3++];
			}

			arg5 += arg2;
			arg3 += arg4;
		}
	}

	@ObfuscatedName("IBHUFTPE.a(III)V")
	public void method233(int arg0, int arg1) {
		arg0 += field695;
		arg1 += field696;
		int var3 = FVBHOYJF.field640 * arg1 + arg0;
		int var4 = 0;
		int var5 = field694;
		int var6 = field693;
		int var7 = FVBHOYJF.field640 - var6;
		int var8 = 0;

		if (arg1 < FVBHOYJF.field642) {
			int var9 = FVBHOYJF.field642 - arg1;
			var5 -= var9;
			arg1 = FVBHOYJF.field642;
			var4 += var6 * var9;
			var3 += FVBHOYJF.field640 * var9;
		}

		if (arg1 + var5 > FVBHOYJF.field643) {
			var5 -= arg1 + var5 - FVBHOYJF.field643;
		}

		if (arg0 < FVBHOYJF.field644) {
			int var10 = FVBHOYJF.field644 - arg0;
			var6 -= var10;
			arg0 = FVBHOYJF.field644;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > FVBHOYJF.field645) {
			int var11 = arg0 + var6 - FVBHOYJF.field645;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method234(FVBHOYJF.field639, field692, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("IBHUFTPE.a([I[IIIIIIII)V")
	public void method234(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("IBHUFTPE.a(IIBI)V")
	public void method235(int arg0, int arg1, int arg2) {
		arg2 += field695;
		arg0 += field696;
		int var4 = FVBHOYJF.field640 * arg0 + arg2;
		int var5 = 0;
		int var6 = field694;
		int var7 = field693;
		int var8 = FVBHOYJF.field640 - var7;
		int var9 = 0;

		if (arg0 < FVBHOYJF.field642) {
			int var10 = FVBHOYJF.field642 - arg0;
			var6 -= var10;
			arg0 = FVBHOYJF.field642;
			var5 += var7 * var10;
			var4 += FVBHOYJF.field640 * var10;
		}

		if (arg0 + var6 > FVBHOYJF.field643) {
			var6 -= arg0 + var6 - FVBHOYJF.field643;
		}

		if (arg2 < FVBHOYJF.field644) {
			int var11 = FVBHOYJF.field644 - arg2;
			var7 -= var11;
			arg2 = FVBHOYJF.field644;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > FVBHOYJF.field645) {
			int var12 = arg2 + var7 - FVBHOYJF.field645;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method236(0, var5, var4, field692, var7, arg1, FVBHOYJF.field639, var9, var8, var6);
		}
	}

	@ObfuscatedName("IBHUFTPE.a(BIII[III[IIII)V")
	public void method236(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg5;
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = arg3[arg1++];
				if (var14 == 0) {
					arg2++;
				} else {
					int var15 = arg6[arg2];
					arg6[arg2++] = ((var14 & 0xFF00FF) * arg5 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg5 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg2 += arg8;
			arg1 += arg7;
		}
	}

	@ObfuscatedName("IBHUFTPE.a(IZ[III[IIIIII)V")
	public void method237(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg5 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin(arg9 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg9 / 326.11D) * 65536.0D);
			var13 = arg2 * var13 >> 8;
			var14 = arg2 * var14 >> 8;
			int var15 = (arg0 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg7 << 16) + var12 * var14 - var11 * var13;
			int var17 = FVBHOYJF.field640 * arg6 + arg8;
			for (int var18 = 0; var18 < arg3; var18++) {
				int var19 = arg1[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg4[var18]; var23 < 0; var23++) {
					FVBHOYJF.field639[var20++] = field692[(var21 >> 16) + (var22 >> 16) * field693];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += FVBHOYJF.field640;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("IBHUFTPE.a(IIIDIIIBI)V")
	public void method238(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg0 / 2;
			int var12 = (int) (Math.sin(arg3) * 65536.0D);
			int var13 = (int) (Math.cos(arg3) * 65536.0D);
			var12 = arg5 * var12 >> 8;
			var13 = arg5 * var13 >> 8;
			int var14 = (arg4 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg1 << 16) + var11 * var13 - var10 * var12;
			int var16 = FVBHOYJF.field640 * arg2 + arg7;
			for (int var17 = 0; var17 < arg0; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field692[(var19 >> 16) + (var20 >> 16) * field693];
					if (var22 == 0) {
						var18++;
					} else {
						FVBHOYJF.field639[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += FVBHOYJF.field640;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("IBHUFTPE.a(LBNGXLHWA;IIZ)V")
	public void method239(BNGXLHWA arg0, int arg1, int arg2) {
		arg2 += field695;
		arg1 += field696;
		int var4 = FVBHOYJF.field640 * arg1 + arg2;
		int var5 = 0;
		int var6 = field694;
		int var7 = field693;
		int var8 = FVBHOYJF.field640 - var7;
		int var9 = 0;

		if (arg1 < FVBHOYJF.field642) {
			int var10 = FVBHOYJF.field642 - arg1;
			var6 -= var10;
			arg1 = FVBHOYJF.field642;
			var5 += var7 * var10;
			var4 += FVBHOYJF.field640 * var10;
		}

		if (arg1 + var6 > FVBHOYJF.field643) {
			var6 -= arg1 + var6 - FVBHOYJF.field643;
		}

		if (arg2 < FVBHOYJF.field644) {
			int var11 = FVBHOYJF.field644 - arg2;
			var7 -= var11;
			arg2 = FVBHOYJF.field644;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > FVBHOYJF.field645) {
			int var12 = arg2 + var7 - FVBHOYJF.field645;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method240(var5, field692, var4, var6, var8, arg0.field67, FVBHOYJF.field639, var7, 0, var9);
		}
	}

	@ObfuscatedName("IBHUFTPE.a(I[IIII[B[IIIII)V")
	public void method240(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg1[arg0++];
				if (var14 != 0 && arg5[arg2] == 0) {
					arg6[arg2++] = var14;
				} else {
					arg2++;
				}

				int var15 = arg1[arg0++];
				if (var15 != 0 && arg5[arg2] == 0) {
					arg6[arg2++] = var15;
				} else {
					arg2++;
				}

				int var16 = arg1[arg0++];
				if (var16 != 0 && arg5[arg2] == 0) {
					arg6[arg2++] = var16;
				} else {
					arg2++;
				}

				int var17 = arg1[arg0++];
				if (var17 != 0 && arg5[arg2] == 0) {
					arg6[arg2++] = var17;
				} else {
					arg2++;
				}
			}

			for (int var18 = arg7; var18 < 0; var18++) {
				int var19 = arg1[arg0++];
				if (var19 != 0 && arg5[arg2] == 0) {
					arg6[arg2++] = var19;
				} else {
					arg2++;
				}
			}

			arg2 += arg4;
			arg0 += arg9;
		}
	}
}
