package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("DLNMSHLT")
public final class DLNMSHLT extends FBOVVAQK {

	@ObfuscatedName("DLNMSHLT.F")
	public int[] field541;

	@ObfuscatedName("DLNMSHLT.K")
	public int field546;

	@ObfuscatedName("DLNMSHLT.G")
	public int field542;

	@ObfuscatedName("DLNMSHLT.L")
	public int field547;

	@ObfuscatedName("DLNMSHLT.H")
	public int field543;

	@ObfuscatedName("DLNMSHLT.J")
	public int field545;

	@ObfuscatedName("DLNMSHLT.I")
	public int field544;

	public DLNMSHLT(int arg0, int arg1) {
		field541 = new int[arg0 * arg1];
		field542 = field546 = arg0;
		field543 = field547 = arg1;
		field544 = field545 = 0;
	}

	public DLNMSHLT(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field542 = var3.getWidth(arg1);
			field543 = var3.getHeight(arg1);
			field546 = field542;
			field547 = field543;
			field544 = 0;
			field545 = 0;
			field541 = new int[field543 * field542];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field542, field543, field541, 0, field542);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public DLNMSHLT(HRXSNEYZ arg0, String arg1, int arg2) {
		JHKSAGUC var4 = new JHKSAGUC(arg0.method289(arg1 + ".dat", null));
		JHKSAGUC var5 = new JHKSAGUC(arg0.method289("index.dat", null));
		var5.field752 = var4.method308();
		field546 = var5.method308();
		field547 = var5.method308();
		int var6 = var5.method306();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method310();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field752 += 2;
			var4.field752 += var5.method308() * var5.method308();
			var5.field752++;
		}

		field544 = var5.method306();
		field545 = var5.method306();
		field542 = var5.method308();
		field543 = var5.method308();
		int var10 = var5.method306();
		int var11 = field543 * field542;
		field541 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field541[var12] = var7[var4.method306()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field542; var13++) {
				for (int var14 = 0; var14 < field543; var14++) {
					field541[field542 * var14 + var13] = var7[var4.method306()];
				}
			}
		}
	}

	@ObfuscatedName("DLNMSHLT.c(Z)V")
	public void method200() {
		FBOVVAQK.method230(field541, field542, field543);
	}

	@ObfuscatedName("DLNMSHLT.a(IIII)V")
	public void method201(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field541.length; var4++) {
			int var5 = field541[var4];
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

				field541[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("DLNMSHLT.d(Z)V")
	public void method202() {
		int[] var1 = new int[field547 * field546];
		for (int var2 = 0; var2 < field543; var2++) {
			for (int var3 = 0; var3 < field542; var3++) {
				var1[(field545 + var2) * field546 + field544 + var3] = field541[field542 * var2 + var3];
			}
		}

		field541 = var1;
		field542 = field546;
		field543 = field547;
		field544 = 0;
		field545 = 0;
	}

	@ObfuscatedName("DLNMSHLT.a(IIZ)V")
	public void method203(int arg0, int arg1) {
		arg0 += field544;
		arg1 += field545;
		int var3 = FBOVVAQK.field592 * arg1 + arg0;
		int var4 = 0;
		int var5 = field543;
		int var6 = field542;
		int var7 = FBOVVAQK.field592 - var6;
		int var8 = 0;

		if (arg1 < FBOVVAQK.field594) {
			int var9 = FBOVVAQK.field594 - arg1;
			var5 -= var9;
			arg1 = FBOVVAQK.field594;
			var4 += var6 * var9;
			var3 += FBOVVAQK.field592 * var9;
		}

		if (arg1 + var5 > FBOVVAQK.field595) {
			var5 -= arg1 + var5 - FBOVVAQK.field595;
		}

		if (arg0 < FBOVVAQK.field596) {
			int var10 = FBOVVAQK.field596 - arg0;
			var6 -= var10;
			arg0 = FBOVVAQK.field596;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > FBOVVAQK.field597) {
			int var11 = arg0 + var6 - FBOVVAQK.field597;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method204(var7, FBOVVAQK.field591, var8, var4, var3, var5, var6, field541);
		}
	}

	@ObfuscatedName("DLNMSHLT.a(I[IIIIIII[I)V")
	public void method204(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg4++] = arg7[arg3++];
				arg1[arg4++] = arg7[arg3++];
				arg1[arg4++] = arg7[arg3++];
				arg1[arg4++] = arg7[arg3++];
			}

			for (int var12 = arg6; var12 < 0; var12++) {
				arg1[arg4++] = arg7[arg3++];
			}

			arg4 += arg0;
			arg3 += arg2;
		}
	}

	@ObfuscatedName("DLNMSHLT.a(IIB)V")
	public void method205(int arg0, int arg1) {
		arg1 += field544;
		arg0 += field545;
		int var3 = FBOVVAQK.field592 * arg0 + arg1;
		int var4 = 0;
		int var5 = field543;
		int var6 = field542;
		int var7 = FBOVVAQK.field592 - var6;
		int var8 = 0;

		if (arg0 < FBOVVAQK.field594) {
			int var9 = FBOVVAQK.field594 - arg0;
			var5 -= var9;
			arg0 = FBOVVAQK.field594;
			var4 += var6 * var9;
			var3 += FBOVVAQK.field592 * var9;
		}

		if (arg0 + var5 > FBOVVAQK.field595) {
			var5 -= arg0 + var5 - FBOVVAQK.field595;
		}

		if (arg1 < FBOVVAQK.field596) {
			int var10 = FBOVVAQK.field596 - arg1;
			var6 -= var10;
			arg1 = FBOVVAQK.field596;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > FBOVVAQK.field597) {
			int var11 = arg1 + var6 - FBOVVAQK.field597;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method206(FBOVVAQK.field591, field541, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("DLNMSHLT.a([I[IIIIIIII)V")
	public void method206(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("DLNMSHLT.b(IIII)V")
	public void method207(int arg0, int arg1, int arg2) {
		arg0 += field544;
		arg1 += field545;
		int var4 = FBOVVAQK.field592 * arg1 + arg0;
		int var5 = 0;
		int var6 = field543;
		int var7 = field542;
		int var8 = FBOVVAQK.field592 - var7;
		int var9 = 0;

		if (arg1 < FBOVVAQK.field594) {
			int var10 = FBOVVAQK.field594 - arg1;
			var6 -= var10;
			arg1 = FBOVVAQK.field594;
			var5 += var7 * var10;
			var4 += FBOVVAQK.field592 * var10;
		}

		if (arg1 + var6 > FBOVVAQK.field595) {
			var6 -= arg1 + var6 - FBOVVAQK.field595;
		}

		if (arg0 < FBOVVAQK.field596) {
			int var11 = FBOVVAQK.field596 - arg0;
			var7 -= var11;
			arg0 = FBOVVAQK.field596;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > FBOVVAQK.field597) {
			int var12 = arg0 + var7 - FBOVVAQK.field597;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method208(FBOVVAQK.field591, 0, var6, var8, field541, arg2, var5, var4, var7, var9);
		}
	}

	@ObfuscatedName("DLNMSHLT.a([IIII[IIIIIII)V")
	public void method208(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg5;
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = -arg8; var13 < 0; var13++) {
				int var14 = arg4[arg6++];
				if (var14 == 0) {
					arg7++;
				} else {
					int var15 = arg0[arg7];
					arg0[arg7++] = ((var14 & 0xFF00FF) * arg5 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg5 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg7 += arg3;
			arg6 += arg9;
		}
	}

	@ObfuscatedName("DLNMSHLT.a(I[IIIIII[IIII)V")
	public void method209(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg7 / 2;
			int var12 = -arg2 / 2;
			int var13 = (int) (Math.sin(arg9 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg9 / 326.11D) * 65536.0D);
			var13 = arg5 * var13 >> 8;
			var14 = arg5 * var14 >> 8;
			int var15 = (arg0 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg4 << 16) + var12 * var14 - var11 * var13;
			int var17 = FBOVVAQK.field592 * arg3 + arg8;
			for (int var18 = 0; var18 < arg2; var18++) {
				int var19 = arg6[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg1[var18]; var23 < 0; var23++) {
					FBOVVAQK.field591[var20++] = field541[(var21 >> 16) + (var22 >> 16) * field542];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += FBOVVAQK.field592;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("DLNMSHLT.a(DIIIIIIII)V")
	public void method210(double arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg1 / 2;
			int var11 = -arg4 / 2;
			int var12 = (int) (Math.sin(arg0) * 65536.0D);
			int var13 = (int) (Math.cos(arg0) * 65536.0D);
			var12 = arg3 * var12 >> 8;
			var13 = arg3 * var13 >> 8;
			int var14 = (arg5 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg2 << 16) + var11 * var13 - var10 * var12;
			int var16 = FBOVVAQK.field592 * arg6 + arg7;
			for (int var17 = 0; var17 < arg4; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg1; var21 < 0; var21++) {
					int var22 = field541[(var19 >> 16) + (var20 >> 16) * field542];
					if (var22 == 0) {
						var18++;
					} else {
						FBOVVAQK.field591[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += FBOVVAQK.field592;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("DLNMSHLT.a(LYAPSNHGU;III)V")
	public void method211(YAPSNHGU arg0, int arg1, int arg2) {
		arg1 += field544;
		arg2 += field545;
		int var4 = FBOVVAQK.field592 * arg2 + arg1;
		int var5 = 0;
		int var6 = field543;
		int var7 = field542;
		int var8 = FBOVVAQK.field592 - var7;
		int var9 = 0;

		if (arg2 < FBOVVAQK.field594) {
			int var10 = FBOVVAQK.field594 - arg2;
			var6 -= var10;
			arg2 = FBOVVAQK.field594;
			var5 += var7 * var10;
			var4 += FBOVVAQK.field592 * var10;
		}

		if (arg2 + var6 > FBOVVAQK.field595) {
			var6 -= arg2 + var6 - FBOVVAQK.field595;
		}

		if (arg1 < FBOVVAQK.field596) {
			int var11 = FBOVVAQK.field596 - arg1;
			var7 -= var11;
			arg1 = FBOVVAQK.field596;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > FBOVVAQK.field597) {
			int var12 = arg1 + var7 - FBOVVAQK.field597;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method212(FBOVVAQK.field591, var7, 0, var5, var6, arg0.field1472, var8, field541, var4, var9);
		}
	}

	@ObfuscatedName("DLNMSHLT.a([IIIII[BIZ[III)V")
	public void method212(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg7[arg3++];
				if (var14 != 0 && arg5[arg8] == 0) {
					arg0[arg8++] = var14;
				} else {
					arg8++;
				}

				int var15 = arg7[arg3++];
				if (var15 != 0 && arg5[arg8] == 0) {
					arg0[arg8++] = var15;
				} else {
					arg8++;
				}

				int var16 = arg7[arg3++];
				if (var16 != 0 && arg5[arg8] == 0) {
					arg0[arg8++] = var16;
				} else {
					arg8++;
				}

				int var17 = arg7[arg3++];
				if (var17 != 0 && arg5[arg8] == 0) {
					arg0[arg8++] = var17;
				} else {
					arg8++;
				}
			}

			for (int var18 = arg1; var18 < 0; var18++) {
				int var19 = arg7[arg3++];
				if (var19 != 0 && arg5[arg8] == 0) {
					arg0[arg8++] = var19;
				} else {
					arg8++;
				}
			}

			arg8 += arg6;
			arg3 += arg9;
		}
	}
}
