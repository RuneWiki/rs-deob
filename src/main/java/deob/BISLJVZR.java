package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("BISLJVZR")
public final class BISLJVZR extends TYMHEFTS {

	@ObfuscatedName("BISLJVZR.H")
	public int[] field40;

	@ObfuscatedName("BISLJVZR.M")
	public int field45;

	@ObfuscatedName("BISLJVZR.I")
	public int field41;

	@ObfuscatedName("BISLJVZR.N")
	public int field46;

	@ObfuscatedName("BISLJVZR.J")
	public int field42;

	@ObfuscatedName("BISLJVZR.L")
	public int field44;

	@ObfuscatedName("BISLJVZR.K")
	public int field43;

	public BISLJVZR(int arg0, int arg1) {
		field40 = new int[arg0 * arg1];
		field41 = field45 = arg0;
		field42 = field46 = arg1;
		field43 = field44 = 0;
	}

	public BISLJVZR(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field41 = var3.getWidth(arg1);
			field42 = var3.getHeight(arg1);
			field45 = field41;
			field46 = field42;
			field43 = 0;
			field44 = 0;
			field40 = new int[field42 * field41];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field41, field42, field40, 0, field41);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public BISLJVZR(SMIVAFST arg0, String arg1, int arg2) {
		BSNPYLEV var4 = new BSNPYLEV(arg0.method512(arg1 + ".dat", null));
		BSNPYLEV var5 = new BSNPYLEV(arg0.method512("index.dat", null));
		var5.field55 = var4.method49();
		field45 = var5.method49();
		field46 = var5.method49();
		int var6 = var5.method47();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method51();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field55 += 2;
			var4.field55 += var5.method49() * var5.method49();
			var5.field55++;
		}

		field43 = var5.method47();
		field44 = var5.method47();
		field41 = var5.method49();
		field42 = var5.method49();
		int var10 = var5.method47();
		int var11 = field42 * field41;
		field40 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field40[var12] = var7[var4.method47()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field41; var13++) {
				for (int var14 = 0; var14 < field42; var14++) {
					field40[field41 * var14 + var13] = var7[var4.method47()];
				}
			}
		}
	}

	@ObfuscatedName("BISLJVZR.b(I)V")
	public void method19() {
		TYMHEFTS.method523(field40, field42, field41);
	}

	@ObfuscatedName("BISLJVZR.a(IIIZ)V")
	public void method20(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field40.length; var4++) {
			int var5 = field40[var4];
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

				field40[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("BISLJVZR.c(I)V")
	public void method21() {
		int[] var1 = new int[field46 * field45];
		for (int var2 = 0; var2 < field42; var2++) {
			for (int var3 = 0; var3 < field41; var3++) {
				var1[(field44 + var2) * field45 + field43 + var3] = field40[field41 * var2 + var3];
			}
		}

		field40 = var1;
		field41 = field45;
		field42 = field46;
		field43 = 0;
		field44 = 0;
	}

	@ObfuscatedName("BISLJVZR.a(III)V")
	public void method22(int arg0, int arg1) {
		arg1 += field43;
		arg0 += field44;
		int var3 = TYMHEFTS.field1310 * arg0 + arg1;
		int var4 = 0;
		int var5 = field42;
		int var6 = field41;
		int var7 = TYMHEFTS.field1310 - var6;
		int var8 = 0;

		if (arg0 < TYMHEFTS.field1312) {
			int var9 = TYMHEFTS.field1312 - arg0;
			var5 -= var9;
			arg0 = TYMHEFTS.field1312;
			var4 += var6 * var9;
			var3 += TYMHEFTS.field1310 * var9;
		}

		if (arg0 + var5 > TYMHEFTS.field1313) {
			var5 -= arg0 + var5 - TYMHEFTS.field1313;
		}

		if (arg1 < TYMHEFTS.field1314) {
			int var10 = TYMHEFTS.field1314 - arg1;
			var6 -= var10;
			arg1 = TYMHEFTS.field1314;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > TYMHEFTS.field1315) {
			int var11 = arg1 + var6 - TYMHEFTS.field1315;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method23(var7, var8, var6, var4, var3, field40, var5, TYMHEFTS.field1309);
		}
	}

	@ObfuscatedName("BISLJVZR.a(IIIIII[II[I)V")
	public void method23(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7) {
		int var9 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg7[arg4++] = arg5[arg3++];
				arg7[arg4++] = arg5[arg3++];
				arg7[arg4++] = arg5[arg3++];
				arg7[arg4++] = arg5[arg3++];
			}

			for (int var12 = arg2; var12 < 0; var12++) {
				arg7[arg4++] = arg5[arg3++];
			}

			arg4 += arg0;
			arg3 += arg1;
		}
	}

	@ObfuscatedName("BISLJVZR.a(IBI)V")
	public void method24(int arg0, int arg1) {
		arg1 += field43;
		arg0 += field44;
		int var3 = TYMHEFTS.field1310 * arg0 + arg1;
		int var4 = 0;
		int var5 = field42;
		int var6 = field41;
		int var7 = TYMHEFTS.field1310 - var6;
		int var8 = 0;

		if (arg0 < TYMHEFTS.field1312) {
			int var9 = TYMHEFTS.field1312 - arg0;
			var5 -= var9;
			arg0 = TYMHEFTS.field1312;
			var4 += var6 * var9;
			var3 += TYMHEFTS.field1310 * var9;
		}

		if (arg0 + var5 > TYMHEFTS.field1313) {
			var5 -= arg0 + var5 - TYMHEFTS.field1313;
		}

		if (arg1 < TYMHEFTS.field1314) {
			int var10 = TYMHEFTS.field1314 - arg1;
			var6 -= var10;
			arg1 = TYMHEFTS.field1314;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > TYMHEFTS.field1315) {
			int var11 = arg1 + var6 - TYMHEFTS.field1315;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method25(TYMHEFTS.field1309, field40, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("BISLJVZR.a([I[IIIIIIII)V")
	public void method25(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("BISLJVZR.a(IIZI)V")
	public void method26(int arg0, int arg1, int arg2) {
		arg2 += field43;
		arg0 += field44;
		int var4 = TYMHEFTS.field1310 * arg0 + arg2;
		int var5 = 0;
		int var6 = field42;
		int var7 = field41;
		int var8 = TYMHEFTS.field1310 - var7;
		int var9 = 0;

		if (arg0 < TYMHEFTS.field1312) {
			int var10 = TYMHEFTS.field1312 - arg0;
			var6 -= var10;
			arg0 = TYMHEFTS.field1312;
			var5 += var7 * var10;
			var4 += TYMHEFTS.field1310 * var10;
		}

		if (arg0 + var6 > TYMHEFTS.field1313) {
			var6 -= arg0 + var6 - TYMHEFTS.field1313;
		}

		if (arg2 < TYMHEFTS.field1314) {
			int var11 = TYMHEFTS.field1314 - arg2;
			var7 -= var11;
			arg2 = TYMHEFTS.field1314;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > TYMHEFTS.field1315) {
			int var12 = arg2 + var7 - TYMHEFTS.field1315;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method27(var4, var5, TYMHEFTS.field1309, var7, var9, var8, field40, arg1, 0, var6);
		}
	}

	@ObfuscatedName("BISLJVZR.a(III[IIII[IIII)V")
	public void method27(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg7;
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = arg6[arg1++];
				if (var14 == 0) {
					arg0++;
				} else {
					int var15 = arg2[arg0];
					arg2[arg0++] = ((var14 & 0xFF00FF) * arg7 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg7 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg0 += arg5;
			arg1 += arg4;
		}
	}

	@ObfuscatedName("BISLJVZR.a(IZ[IIIIII[III)V")
	public void method28(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		try {
			int var11 = -arg9 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg4 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg4 / 326.11D) * 65536.0D);
			var13 = arg0 * var13 >> 8;
			var14 = arg0 * var14 >> 8;
			int var15 = (arg8 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg2 << 16) + var12 * var14 - var11 * var13;
			int var17 = TYMHEFTS.field1310 * arg3 + arg5;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg7[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg1[var18]; var23 < 0; var23++) {
					TYMHEFTS.field1309[var20++] = field40[(var21 >> 16) + (var22 >> 16) * field41];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += TYMHEFTS.field1310;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("BISLJVZR.a(IIIIIIIDI)V")
	public void method29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
		try {
			int var10 = -arg7 / 2;
			int var11 = -arg4 / 2;
			int var12 = (int) (Math.sin(arg6) * 65536.0D);
			int var13 = (int) (Math.cos(arg6) * 65536.0D);
			var12 = arg5 * var12 >> 8;
			var13 = arg5 * var13 >> 8;
			int var14 = (arg2 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg0 << 16) + var11 * var13 - var10 * var12;
			int var16 = TYMHEFTS.field1310 * arg1 + arg3;
			for (int var17 = 0; var17 < arg4; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg7; var21 < 0; var21++) {
					int var22 = field40[(var19 >> 16) + (var20 >> 16) * field41];
					if (var22 == 0) {
						var18++;
					} else {
						TYMHEFTS.field1309[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += TYMHEFTS.field1310;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("BISLJVZR.a(IBLKYEPSAQL;I)V")
	public void method30(int arg0, KYEPSAQL arg1, int arg2) {
		arg0 += field43;
		arg2 += field44;
		int var4 = TYMHEFTS.field1310 * arg2 + arg0;
		int var5 = 0;
		int var6 = field42;
		int var7 = field41;
		int var8 = TYMHEFTS.field1310 - var7;
		int var9 = 0;

		if (arg2 < TYMHEFTS.field1312) {
			int var10 = TYMHEFTS.field1312 - arg2;
			var6 -= var10;
			arg2 = TYMHEFTS.field1312;
			var5 += var7 * var10;
			var4 += TYMHEFTS.field1310 * var10;
		}

		if (arg2 + var6 > TYMHEFTS.field1313) {
			var6 -= arg2 + var6 - TYMHEFTS.field1313;
		}

		if (arg0 < TYMHEFTS.field1314) {
			int var11 = TYMHEFTS.field1314 - arg0;
			var7 -= var11;
			arg0 = TYMHEFTS.field1314;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > TYMHEFTS.field1315) {
			int var12 = arg0 + var7 - TYMHEFTS.field1315;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method31(var8, var4, TYMHEFTS.field1309, field40, var7, var5, 0, var9, arg1.field775, var6);
		}
	}

	@ObfuscatedName("BISLJVZR.a(II[II[IIIII[BI)V")
	public void method31(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
		int var11 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg3[arg5++];
				if (var14 != 0 && arg8[arg1] == 0) {
					arg2[arg1++] = var14;
				} else {
					arg1++;
				}

				int var15 = arg3[arg5++];
				if (var15 != 0 && arg8[arg1] == 0) {
					arg2[arg1++] = var15;
				} else {
					arg1++;
				}

				int var16 = arg3[arg5++];
				if (var16 != 0 && arg8[arg1] == 0) {
					arg2[arg1++] = var16;
				} else {
					arg1++;
				}

				int var17 = arg3[arg5++];
				if (var17 != 0 && arg8[arg1] == 0) {
					arg2[arg1++] = var17;
				} else {
					arg1++;
				}
			}

			for (int var18 = arg4; var18 < 0; var18++) {
				int var19 = arg3[arg5++];
				if (var19 != 0 && arg8[arg1] == 0) {
					arg2[arg1++] = var19;
				} else {
					arg1++;
				}
			}

			arg1 += arg0;
			arg5 += arg7;
		}
	}
}
