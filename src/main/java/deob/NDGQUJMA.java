package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("NDGQUJMA")
public final class NDGQUJMA extends CCFLBOBS {

	@ObfuscatedName("NDGQUJMA.D")
	public int[] field912;

	@ObfuscatedName("NDGQUJMA.I")
	public int field917;

	@ObfuscatedName("NDGQUJMA.E")
	public int field913;

	@ObfuscatedName("NDGQUJMA.J")
	public int field918;

	@ObfuscatedName("NDGQUJMA.F")
	public int field914;

	@ObfuscatedName("NDGQUJMA.H")
	public int field916;

	@ObfuscatedName("NDGQUJMA.G")
	public int field915;

	public NDGQUJMA(int arg0, int arg1) {
		field912 = new int[arg0 * arg1];
		field913 = field917 = arg0;
		field914 = field918 = arg1;
		field915 = field916 = 0;
	}

	public NDGQUJMA(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field913 = var3.getWidth(arg1);
			field914 = var3.getHeight(arg1);
			field917 = field913;
			field918 = field914;
			field915 = 0;
			field916 = 0;
			field912 = new int[field914 * field913];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field913, field914, field912, 0, field913);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public NDGQUJMA(VSQMPWOM arg0, String arg1, int arg2) {
		BFQIDHPO var4 = new BFQIDHPO(arg0.method526(arg1 + ".dat", null));
		BFQIDHPO var5 = new BFQIDHPO(arg0.method526("index.dat", null));
		var5.field10 = var4.method56();
		field917 = var5.method56();
		field918 = var5.method56();
		int var6 = var5.method54();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method58();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field10 += 2;
			var4.field10 += var5.method56() * var5.method56();
			var5.field10++;
		}

		field915 = var5.method54();
		field916 = var5.method54();
		field913 = var5.method56();
		field914 = var5.method56();
		int var10 = var5.method54();
		int var11 = field914 * field913;
		field912 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field912[var12] = var7[var4.method54()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field913; var13++) {
				for (int var14 = 0; var14 < field914; var14++) {
					field912[field913 * var14 + var13] = var7[var4.method54()];
				}
			}
		}
	}

	@ObfuscatedName("NDGQUJMA.b(I)V")
	public void method348() {
		CCFLBOBS.method138(field914, field912, field913);
	}

	@ObfuscatedName("NDGQUJMA.a(IIII)V")
	public void method349(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field912.length; var4++) {
			int var5 = field912[var4];
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

				field912[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("NDGQUJMA.c(I)V")
	public void method350() {
		int[] var1 = new int[field918 * field917];
		for (int var2 = 0; var2 < field914; var2++) {
			for (int var3 = 0; var3 < field913; var3++) {
				var1[(field916 + var2) * field917 + field915 + var3] = field912[field913 * var2 + var3];
			}
		}

		field912 = var1;
		field913 = field917;
		field914 = field918;
		field915 = 0;
		field916 = 0;
	}

	@ObfuscatedName("NDGQUJMA.a(III)V")
	public void method351(int arg0, int arg1) {
		arg1 += field915;
		arg0 += field916;
		int var3 = CCFLBOBS.field91 * arg0 + arg1;
		int var4 = 0;
		int var5 = field914;
		int var6 = field913;
		int var7 = CCFLBOBS.field91 - var6;
		int var8 = 0;

		if (arg0 < CCFLBOBS.field93) {
			int var9 = CCFLBOBS.field93 - arg0;
			var5 -= var9;
			arg0 = CCFLBOBS.field93;
			var4 += var6 * var9;
			var3 += CCFLBOBS.field91 * var9;
		}

		if (arg0 + var5 > CCFLBOBS.field94) {
			var5 -= arg0 + var5 - CCFLBOBS.field94;
		}

		if (arg1 < CCFLBOBS.field95) {
			int var10 = CCFLBOBS.field95 - arg1;
			var6 -= var10;
			arg1 = CCFLBOBS.field95;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > CCFLBOBS.field96) {
			int var11 = arg1 + var6 - CCFLBOBS.field96;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method352(var6, CCFLBOBS.field90, var5, field912, var7, var3, var4, var8);
		}
	}

	@ObfuscatedName("NDGQUJMA.a(I[II[IIIIII)V")
	public void method352(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg2; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg5++] = arg3[arg6++];
				arg1[arg5++] = arg3[arg6++];
				arg1[arg5++] = arg3[arg6++];
				arg1[arg5++] = arg3[arg6++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg1[arg5++] = arg3[arg6++];
			}

			arg5 += arg4;
			arg6 += arg7;
		}
	}

	@ObfuscatedName("NDGQUJMA.a(IBI)V")
	public void method353(int arg0, int arg1) {
		arg1 += field915;
		arg0 += field916;
		int var3 = CCFLBOBS.field91 * arg0 + arg1;
		int var4 = 0;
		int var5 = field914;
		int var6 = field913;
		int var7 = CCFLBOBS.field91 - var6;
		int var8 = 0;

		if (arg0 < CCFLBOBS.field93) {
			int var9 = CCFLBOBS.field93 - arg0;
			var5 -= var9;
			arg0 = CCFLBOBS.field93;
			var4 += var6 * var9;
			var3 += CCFLBOBS.field91 * var9;
		}

		if (arg0 + var5 > CCFLBOBS.field94) {
			var5 -= arg0 + var5 - CCFLBOBS.field94;
		}

		if (arg1 < CCFLBOBS.field95) {
			int var10 = CCFLBOBS.field95 - arg1;
			var6 -= var10;
			arg1 = CCFLBOBS.field95;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > CCFLBOBS.field96) {
			int var11 = arg1 + var6 - CCFLBOBS.field96;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method354(CCFLBOBS.field90, field912, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("NDGQUJMA.a([I[IIIIIIII)V")
	public void method354(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("NDGQUJMA.a(IIBI)V")
	public void method355(int arg0, int arg1, int arg2) {
		arg2 += field915;
		arg1 += field916;
		int var4 = CCFLBOBS.field91 * arg1 + arg2;
		int var5 = 0;
		int var6 = field914;
		int var7 = field913;
		int var8 = CCFLBOBS.field91 - var7;
		int var9 = 0;

		if (arg1 < CCFLBOBS.field93) {
			int var10 = CCFLBOBS.field93 - arg1;
			var6 -= var10;
			arg1 = CCFLBOBS.field93;
			var5 += var7 * var10;
			var4 += CCFLBOBS.field91 * var10;
		}

		if (arg1 + var6 > CCFLBOBS.field94) {
			var6 -= arg1 + var6 - CCFLBOBS.field94;
		}

		if (arg2 < CCFLBOBS.field95) {
			int var11 = CCFLBOBS.field95 - arg2;
			var7 -= var11;
			arg2 = CCFLBOBS.field95;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > CCFLBOBS.field96) {
			int var12 = arg2 + var7 - CCFLBOBS.field96;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method356(var6, 0, var5, arg0, var4, field912, CCFLBOBS.field90, var8, var9, var7);
		}
	}

	@ObfuscatedName("NDGQUJMA.a(IIIIII[I[IIII)V")
	public void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg3;
		for (int var12 = -arg0; var12 < 0; var12++) {
			for (int var13 = -arg9; var13 < 0; var13++) {
				int var14 = arg5[arg2++];
				if (var14 == 0) {
					arg4++;
				} else {
					int var15 = arg6[arg4];
					arg6[arg4++] = ((var14 & 0xFF00FF) * arg3 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg3 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg4 += arg7;
			arg2 += arg8;
		}
	}

	@ObfuscatedName("NDGQUJMA.a(I[IIIII[IIIII)V")
	public void method357(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg9 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg2 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg2 / 326.11D) * 65536.0D);
			var13 = arg4 * var13 >> 8;
			var14 = arg4 * var14 >> 8;
			int var15 = (arg1 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg8 << 16) + var12 * var14 - var11 * var13;
			int var17 = CCFLBOBS.field91 * arg3 + arg7;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg5[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg0[var18]; var23 < 0; var23++) {
					CCFLBOBS.field90[var20++] = field912[(var21 >> 16) + (var22 >> 16) * field913];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += CCFLBOBS.field91;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("NDGQUJMA.a(IIIDIIIII)V")
	public void method358(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg5 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg2) * 65536.0D);
			int var13 = (int) (Math.cos(arg2) * 65536.0D);
			var12 = arg6 * var12 >> 8;
			var13 = arg6 * var13 >> 8;
			int var14 = (arg1 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = CCFLBOBS.field91 * arg0 + arg7;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg5; var21 < 0; var21++) {
					int var22 = field912[(var19 >> 16) + (var20 >> 16) * field913];
					if (var22 == 0) {
						var18++;
					} else {
						CCFLBOBS.field90[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += CCFLBOBS.field91;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("NDGQUJMA.a(IIILRAOZRSKX;)V")
	public void method359(int arg0, int arg1, RAOZRSKX arg2) {
		arg0 += field915;
		arg1 += field916;
		int var4 = CCFLBOBS.field91 * arg1 + arg0;
		int var5 = 0;
		int var6 = field914;
		int var7 = field913;
		int var8 = CCFLBOBS.field91 - var7;
		int var9 = 0;

		if (arg1 < CCFLBOBS.field93) {
			int var10 = CCFLBOBS.field93 - arg1;
			var6 -= var10;
			arg1 = CCFLBOBS.field93;
			var5 += var7 * var10;
			var4 += CCFLBOBS.field91 * var10;
		}

		if (arg1 + var6 > CCFLBOBS.field94) {
			var6 -= arg1 + var6 - CCFLBOBS.field94;
		}

		if (arg0 < CCFLBOBS.field95) {
			int var11 = CCFLBOBS.field95 - arg0;
			var7 -= var11;
			arg0 = CCFLBOBS.field95;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > CCFLBOBS.field96) {
			int var12 = arg0 + var7 - CCFLBOBS.field96;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method360(var7, CCFLBOBS.field90, var4, field912, var8, var9, arg2.field1045, var6, var5, 0);
		}
	}

	@ObfuscatedName("NDGQUJMA.a(I[II[III[BIIII)V")
	public void method360(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg3[arg8++];
				if (var14 != 0 && arg6[arg2] == 0) {
					arg1[arg2++] = var14;
				} else {
					arg2++;
				}

				int var15 = arg3[arg8++];
				if (var15 != 0 && arg6[arg2] == 0) {
					arg1[arg2++] = var15;
				} else {
					arg2++;
				}

				int var16 = arg3[arg8++];
				if (var16 != 0 && arg6[arg2] == 0) {
					arg1[arg2++] = var16;
				} else {
					arg2++;
				}

				int var17 = arg3[arg8++];
				if (var17 != 0 && arg6[arg2] == 0) {
					arg1[arg2++] = var17;
				} else {
					arg2++;
				}
			}

			for (int var18 = arg0; var18 < 0; var18++) {
				int var19 = arg3[arg8++];
				if (var19 != 0 && arg6[arg2] == 0) {
					arg1[arg2++] = var19;
				} else {
					arg2++;
				}
			}

			arg2 += arg4;
			arg8 += arg5;
		}
	}
}
