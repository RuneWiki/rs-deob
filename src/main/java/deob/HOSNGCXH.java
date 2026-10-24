package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("HOSNGCXH")
public final class HOSNGCXH extends JOVUNXBE {

	@ObfuscatedName("HOSNGCXH.I")
	public int[] field731;

	@ObfuscatedName("HOSNGCXH.N")
	public int field736;

	@ObfuscatedName("HOSNGCXH.J")
	public int field732;

	@ObfuscatedName("HOSNGCXH.O")
	public int field737;

	@ObfuscatedName("HOSNGCXH.K")
	public int field733;

	@ObfuscatedName("HOSNGCXH.M")
	public int field735;

	@ObfuscatedName("HOSNGCXH.L")
	public int field734;

	public HOSNGCXH(int arg0, int arg1) {
		field731 = new int[arg0 * arg1];
		field732 = field736 = arg0;
		field733 = field737 = arg1;
		field734 = field735 = 0;
	}

	public HOSNGCXH(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field732 = var3.getWidth(arg1);
			field733 = var3.getHeight(arg1);
			field736 = field732;
			field737 = field733;
			field734 = 0;
			field735 = 0;
			field731 = new int[field733 * field732];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field732, field733, field731, 0, field732);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public HOSNGCXH(TKEGJSFV arg0, String arg1, int arg2) {
		EGCCHUZS var4 = new EGCCHUZS(arg0.method542(arg1 + ".dat", null));
		EGCCHUZS var5 = new EGCCHUZS(arg0.method542("index.dat", null));
		var5.field589 = var4.method263();
		field736 = var5.method263();
		field737 = var5.method263();
		int var6 = var5.method261();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method265();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field589 += 2;
			var4.field589 += var5.method263() * var5.method263();
			var5.field589++;
		}

		field734 = var5.method261();
		field735 = var5.method261();
		field732 = var5.method263();
		field733 = var5.method263();
		int var10 = var5.method261();
		int var11 = field733 * field732;
		field731 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field731[var12] = var7[var4.method261()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field732; var13++) {
				for (int var14 = 0; var14 < field733; var14++) {
					field731[field732 * var14 + var13] = var7[var4.method261()];
				}
			}
		}
	}

	@ObfuscatedName("HOSNGCXH.a(Z)V")
	public void method330() {
		JOVUNXBE.method380(field731, field732, field733);
	}

	@ObfuscatedName("HOSNGCXH.a(IIBI)V")
	public void method331(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field731.length; var4++) {
			int var5 = field731[var4];
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

				field731[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("HOSNGCXH.a(I)V")
	public void method332() {
		int[] var1 = new int[field737 * field736];
		for (int var2 = 0; var2 < field733; var2++) {
			for (int var3 = 0; var3 < field732; var3++) {
				var1[(field735 + var2) * field736 + field734 + var3] = field731[field732 * var2 + var3];
			}
		}

		field731 = var1;
		field732 = field736;
		field733 = field737;
		field734 = 0;
		field735 = 0;
	}

	@ObfuscatedName("HOSNGCXH.a(ZII)V")
	public void method333(int arg0, int arg1) {
		arg0 += field734;
		arg1 += field735;
		int var3 = JOVUNXBE.field851 * arg1 + arg0;
		int var4 = 0;
		int var5 = field733;
		int var6 = field732;
		int var7 = JOVUNXBE.field851 - var6;
		int var8 = 0;

		if (arg1 < JOVUNXBE.field853) {
			int var9 = JOVUNXBE.field853 - arg1;
			var5 -= var9;
			arg1 = JOVUNXBE.field853;
			var4 += var6 * var9;
			var3 += JOVUNXBE.field851 * var9;
		}

		if (arg1 + var5 > JOVUNXBE.field854) {
			var5 -= arg1 + var5 - JOVUNXBE.field854;
		}

		if (arg0 < JOVUNXBE.field855) {
			int var10 = JOVUNXBE.field855 - arg0;
			var6 -= var10;
			arg0 = JOVUNXBE.field855;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > JOVUNXBE.field856) {
			int var11 = arg0 + var6 - JOVUNXBE.field856;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method334(var5, var7, field731, var6, var3, JOVUNXBE.field850, var4, var8);
		}
	}

	@ObfuscatedName("HOSNGCXH.a(II[IIII[III)V")
	public void method334(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
		int var9 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var10 = -arg0; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg5[arg4++] = arg2[arg6++];
				arg5[arg4++] = arg2[arg6++];
				arg5[arg4++] = arg2[arg6++];
				arg5[arg4++] = arg2[arg6++];
			}

			for (int var12 = arg3; var12 < 0; var12++) {
				arg5[arg4++] = arg2[arg6++];
			}

			arg4 += arg1;
			arg6 += arg7;
		}
	}

	@ObfuscatedName("HOSNGCXH.a(III)V")
	public void method335(int arg0, int arg1) {
		arg1 += field734;
		arg0 += field735;
		int var3 = JOVUNXBE.field851 * arg0 + arg1;
		int var4 = 0;
		int var5 = field733;
		int var6 = field732;
		int var7 = JOVUNXBE.field851 - var6;
		int var8 = 0;

		if (arg0 < JOVUNXBE.field853) {
			int var9 = JOVUNXBE.field853 - arg0;
			var5 -= var9;
			arg0 = JOVUNXBE.field853;
			var4 += var6 * var9;
			var3 += JOVUNXBE.field851 * var9;
		}

		if (arg0 + var5 > JOVUNXBE.field854) {
			var5 -= arg0 + var5 - JOVUNXBE.field854;
		}

		if (arg1 < JOVUNXBE.field855) {
			int var10 = JOVUNXBE.field855 - arg1;
			var6 -= var10;
			arg1 = JOVUNXBE.field855;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > JOVUNXBE.field856) {
			int var11 = arg1 + var6 - JOVUNXBE.field856;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method336(JOVUNXBE.field850, field731, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("HOSNGCXH.a([I[IIIIIIII)V")
	public void method336(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("HOSNGCXH.a(IIIB)V")
	public void method337(int arg0, int arg1, int arg2) {
		arg1 += field734;
		arg2 += field735;
		int var4 = JOVUNXBE.field851 * arg2 + arg1;
		int var5 = 0;
		int var6 = field733;
		int var7 = field732;
		int var8 = JOVUNXBE.field851 - var7;
		int var9 = 0;

		if (arg2 < JOVUNXBE.field853) {
			int var10 = JOVUNXBE.field853 - arg2;
			var6 -= var10;
			arg2 = JOVUNXBE.field853;
			var5 += var7 * var10;
			var4 += JOVUNXBE.field851 * var10;
		}

		if (arg2 + var6 > JOVUNXBE.field854) {
			var6 -= arg2 + var6 - JOVUNXBE.field854;
		}

		if (arg1 < JOVUNXBE.field855) {
			int var11 = JOVUNXBE.field855 - arg1;
			var7 -= var11;
			arg1 = JOVUNXBE.field855;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > JOVUNXBE.field856) {
			int var12 = arg1 + var7 - JOVUNXBE.field856;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method338(var9, JOVUNXBE.field850, arg0, 0, var7, var6, var5, field731, var8, var4);
		}
	}

	@ObfuscatedName("HOSNGCXH.a(I[IIIZIII[III)V")
	public void method338(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg2;
		for (int var12 = -arg5; var12 < 0; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = arg7[arg6++];
				if (var14 == 0) {
					arg9++;
				} else {
					int var15 = arg1[arg9];
					arg1[arg9++] = ((var14 & 0xFF00FF) * arg2 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg2 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg9 += arg8;
			arg6 += arg0;
		}
	}

	@ObfuscatedName("HOSNGCXH.a(I[IIII[IIIIII)V")
	public void method339(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg5 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg0 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg0 / 326.11D) * 65536.0D);
			var13 = arg8 * var13 >> 8;
			var14 = arg8 * var14 >> 8;
			int var15 = (arg2 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg3 << 16) + var12 * var14 - var11 * var13;
			int var17 = JOVUNXBE.field851 * arg9 + arg7;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg4[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg1[var18]; var23 < 0; var23++) {
					JOVUNXBE.field850[var20++] = field731[(var21 >> 16) + (var22 >> 16) * field732];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += JOVUNXBE.field851;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("HOSNGCXH.a(IIIDIBIII)V")
	public void method340(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg4 / 2;
			int var11 = -arg7 / 2;
			int var12 = (int) (Math.sin(arg3) * 65536.0D);
			int var13 = (int) (Math.cos(arg3) * 65536.0D);
			var12 = arg5 * var12 >> 8;
			var13 = arg5 * var13 >> 8;
			int var14 = (arg1 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg0 << 16) + var11 * var13 - var10 * var12;
			int var16 = JOVUNXBE.field851 * arg6 + arg2;
			for (int var17 = 0; var17 < arg7; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg4; var21 < 0; var21++) {
					int var22 = field731[(var19 >> 16) + (var20 >> 16) * field732];
					if (var22 == 0) {
						var18++;
					} else {
						JOVUNXBE.field850[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += JOVUNXBE.field851;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("HOSNGCXH.a(ILDGXCFOYI;BI)V")
	public void method341(int arg0, DGXCFOYI arg1, int arg2) {
		arg0 += field734;
		arg2 += field735;
		int var4 = JOVUNXBE.field851 * arg2 + arg0;
		int var5 = 0;
		int var6 = field733;
		int var7 = field732;
		int var8 = JOVUNXBE.field851 - var7;
		int var9 = 0;

		if (arg2 < JOVUNXBE.field853) {
			int var10 = JOVUNXBE.field853 - arg2;
			var6 -= var10;
			arg2 = JOVUNXBE.field853;
			var5 += var7 * var10;
			var4 += JOVUNXBE.field851 * var10;
		}

		if (arg2 + var6 > JOVUNXBE.field854) {
			var6 -= arg2 + var6 - JOVUNXBE.field854;
		}

		if (arg0 < JOVUNXBE.field855) {
			int var11 = JOVUNXBE.field855 - arg0;
			var7 -= var11;
			arg0 = JOVUNXBE.field855;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > JOVUNXBE.field856) {
			int var12 = arg0 + var7 - JOVUNXBE.field856;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method342(var7, var4, var9, var5, arg1.field529, field731, var8, JOVUNXBE.field850, 0, var6);
		}
	}

	@ObfuscatedName("HOSNGCXH.a(IIIII[B[II[III)V")
	public void method342(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg5[arg3++];
				if (var14 != 0 && arg4[arg1] == 0) {
					arg7[arg1++] = var14;
				} else {
					arg1++;
				}

				int var15 = arg5[arg3++];
				if (var15 != 0 && arg4[arg1] == 0) {
					arg7[arg1++] = var15;
				} else {
					arg1++;
				}

				int var16 = arg5[arg3++];
				if (var16 != 0 && arg4[arg1] == 0) {
					arg7[arg1++] = var16;
				} else {
					arg1++;
				}

				int var17 = arg5[arg3++];
				if (var17 != 0 && arg4[arg1] == 0) {
					arg7[arg1++] = var17;
				} else {
					arg1++;
				}
			}

			for (int var18 = arg0; var18 < 0; var18++) {
				int var19 = arg5[arg3++];
				if (var19 != 0 && arg4[arg1] == 0) {
					arg7[arg1++] = var19;
				} else {
					arg1++;
				}
			}

			arg1 += arg6;
			arg3 += arg2;
		}
	}
}
