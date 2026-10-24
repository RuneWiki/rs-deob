package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("LOVQYTIZ")
public final class LOVQYTIZ extends IBBQNXJX {

	@ObfuscatedName("LOVQYTIZ.G")
	public int[] field1052;

	@ObfuscatedName("LOVQYTIZ.L")
	public int field1057;

	@ObfuscatedName("LOVQYTIZ.H")
	public int field1053;

	@ObfuscatedName("LOVQYTIZ.M")
	public int field1058;

	@ObfuscatedName("LOVQYTIZ.I")
	public int field1054;

	@ObfuscatedName("LOVQYTIZ.K")
	public int field1056;

	@ObfuscatedName("LOVQYTIZ.J")
	public int field1055;

	public LOVQYTIZ(int arg0, int arg1) {
		field1052 = new int[arg0 * arg1];
		field1053 = field1057 = arg0;
		field1054 = field1058 = arg1;
		field1055 = field1056 = 0;
	}

	public LOVQYTIZ(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1053 = var3.getWidth(arg1);
			field1054 = var3.getHeight(arg1);
			field1057 = field1053;
			field1058 = field1054;
			field1055 = 0;
			field1056 = 0;
			field1052 = new int[field1054 * field1053];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1053, field1054, field1052, 0, field1053);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public LOVQYTIZ(JUPFHAZZ arg0, String arg1, int arg2) {
		TKPFKOXP var4 = new TKPFKOXP(arg0.method372(arg1 + ".dat", null));
		TKPFKOXP var5 = new TKPFKOXP(arg0.method372("index.dat", null));
		var5.field1382 = var4.method531();
		field1057 = var5.method531();
		field1058 = var5.method531();
		int var6 = var5.method529();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method533();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1382 += 2;
			var4.field1382 += var5.method531() * var5.method531();
			var5.field1382++;
		}

		field1055 = var5.method529();
		field1056 = var5.method529();
		field1053 = var5.method531();
		field1054 = var5.method531();
		int var10 = var5.method529();
		int var11 = field1054 * field1053;
		field1052 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1052[var12] = var7[var4.method529()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1053; var13++) {
				for (int var14 = 0; var14 < field1054; var14++) {
					field1052[field1053 * var14 + var13] = var7[var4.method529()];
				}
			}
		}
	}

	@ObfuscatedName("LOVQYTIZ.a(B)V")
	public void method395() {
		IBBQNXJX.method251(field1052, field1053, field1054);
	}

	@ObfuscatedName("LOVQYTIZ.a(IIII)V")
	public void method396(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1052.length; var4++) {
			int var5 = field1052[var4];
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

				field1052[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("LOVQYTIZ.c(I)V")
	public void method397() {
		int[] var1 = new int[field1058 * field1057];
		for (int var2 = 0; var2 < field1054; var2++) {
			for (int var3 = 0; var3 < field1053; var3++) {
				var1[(field1056 + var2) * field1057 + field1055 + var3] = field1052[field1053 * var2 + var3];
			}
		}

		field1052 = var1;
		field1053 = field1057;
		field1054 = field1058;
		field1055 = 0;
		field1056 = 0;
	}

	@ObfuscatedName("LOVQYTIZ.a(III)V")
	public void method398(int arg0, int arg1) {
		arg0 += field1055;
		arg1 += field1056;
		int var3 = IBBQNXJX.field816 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1054;
		int var6 = field1053;
		int var7 = IBBQNXJX.field816 - var6;
		int var8 = 0;

		if (arg1 < IBBQNXJX.field818) {
			int var9 = IBBQNXJX.field818 - arg1;
			var5 -= var9;
			arg1 = IBBQNXJX.field818;
			var4 += var6 * var9;
			var3 += IBBQNXJX.field816 * var9;
		}

		if (arg1 + var5 > IBBQNXJX.field819) {
			var5 -= arg1 + var5 - IBBQNXJX.field819;
		}

		if (arg0 < IBBQNXJX.field820) {
			int var10 = IBBQNXJX.field820 - arg0;
			var6 -= var10;
			arg0 = IBBQNXJX.field820;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > IBBQNXJX.field821) {
			int var11 = arg0 + var6 - IBBQNXJX.field821;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method399(var8, var5, var6, var4, field1052, IBBQNXJX.field815, var7, var3);
		}
	}

	@ObfuscatedName("LOVQYTIZ.a(IIIII[I[III)V")
	public void method399(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7) {
		int var9 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var10 = -arg1; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg5[arg7++] = arg4[arg3++];
				arg5[arg7++] = arg4[arg3++];
				arg5[arg7++] = arg4[arg3++];
				arg5[arg7++] = arg4[arg3++];
			}

			for (int var12 = arg2; var12 < 0; var12++) {
				arg5[arg7++] = arg4[arg3++];
			}

			arg7 += arg6;
			arg3 += arg0;
		}
	}

	@ObfuscatedName("LOVQYTIZ.b(III)V")
	public void method400(int arg0, int arg1) {
		arg1 += field1055;
		arg0 += field1056;
		int var3 = IBBQNXJX.field816 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1054;
		int var6 = field1053;
		int var7 = IBBQNXJX.field816 - var6;
		int var8 = 0;

		if (arg0 < IBBQNXJX.field818) {
			int var9 = IBBQNXJX.field818 - arg0;
			var5 -= var9;
			arg0 = IBBQNXJX.field818;
			var4 += var6 * var9;
			var3 += IBBQNXJX.field816 * var9;
		}

		if (arg0 + var5 > IBBQNXJX.field819) {
			var5 -= arg0 + var5 - IBBQNXJX.field819;
		}

		if (arg1 < IBBQNXJX.field820) {
			int var10 = IBBQNXJX.field820 - arg1;
			var6 -= var10;
			arg1 = IBBQNXJX.field820;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > IBBQNXJX.field821) {
			int var11 = arg1 + var6 - IBBQNXJX.field821;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method401(IBBQNXJX.field815, field1052, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("LOVQYTIZ.a([I[IIIIIIII)V")
	public void method401(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("LOVQYTIZ.b(IIII)V")
	public void method402(int arg0, int arg1, int arg2) {
		arg0 += field1055;
		arg1 += field1056;
		int var4 = IBBQNXJX.field816 * arg1 + arg0;
		int var5 = 0;
		int var6 = field1054;
		int var7 = field1053;
		int var8 = IBBQNXJX.field816 - var7;
		int var9 = 0;

		if (arg1 < IBBQNXJX.field818) {
			int var10 = IBBQNXJX.field818 - arg1;
			var6 -= var10;
			arg1 = IBBQNXJX.field818;
			var5 += var7 * var10;
			var4 += IBBQNXJX.field816 * var10;
		}

		if (arg1 + var6 > IBBQNXJX.field819) {
			var6 -= arg1 + var6 - IBBQNXJX.field819;
		}

		if (arg0 < IBBQNXJX.field820) {
			int var11 = IBBQNXJX.field820 - arg0;
			var7 -= var11;
			arg0 = IBBQNXJX.field820;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > IBBQNXJX.field821) {
			int var12 = arg0 + var7 - IBBQNXJX.field821;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method403(var5, var6, var8, field1052, arg2, 0, var4, IBBQNXJX.field815, var9, var7);
		}
	}

	@ObfuscatedName("LOVQYTIZ.a(III[IIIII[III)V")
	public void method403(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg4;
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = -arg9; var13 < 0; var13++) {
				int var14 = arg3[arg0++];
				if (var14 == 0) {
					arg6++;
				} else {
					int var15 = arg7[arg6];
					arg7[arg6++] = ((var14 & 0xFF00FF) * arg4 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg4 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg6 += arg2;
			arg0 += arg8;
		}
	}

	@ObfuscatedName("LOVQYTIZ.a(IIII[II[IIIII)V")
	public void method404(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg7 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg4 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg4 / 326.11D) * 65536.0D);
			var13 = arg1 * var13 >> 8;
			var14 = arg1 * var14 >> 8;
			int var15 = (arg9 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg8 << 16) + var12 * var14 - var11 * var13;
			int var17 = IBBQNXJX.field816 * arg0 + arg2;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg3[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg5[var18]; var23 < 0; var23++) {
					IBBQNXJX.field815[var20++] = field1052[(var21 >> 16) + (var22 >> 16) * field1053];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += IBBQNXJX.field816;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("LOVQYTIZ.a(IDIIIIIBI)V")
	public void method405(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg0 / 2;
			int var11 = -arg4 / 2;
			int var12 = (int) (Math.sin(arg1) * 65536.0D);
			int var13 = (int) (Math.cos(arg1) * 65536.0D);
			var12 = arg7 * var12 >> 8;
			var13 = arg7 * var13 >> 8;
			int var14 = (arg2 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg3 << 16) + var11 * var13 - var10 * var12;
			int var16 = IBBQNXJX.field816 * arg5 + arg6;
			for (int var17 = 0; var17 < arg4; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg0; var21 < 0; var21++) {
					int var22 = field1052[(var19 >> 16) + (var20 >> 16) * field1053];
					if (var22 == 0) {
						var18++;
					} else {
						IBBQNXJX.field815[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += IBBQNXJX.field816;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("LOVQYTIZ.a(ZLNPZZPPRD;II)V")
	public void method406(NPZZPPRD arg0, int arg1, int arg2) {
		arg2 += field1055;
		arg1 += field1056;
		int var4 = IBBQNXJX.field816 * arg1 + arg2;
		int var5 = 0;
		int var6 = field1054;
		int var7 = field1053;
		int var8 = IBBQNXJX.field816 - var7;
		int var9 = 0;

		if (arg1 < IBBQNXJX.field818) {
			int var10 = IBBQNXJX.field818 - arg1;
			var6 -= var10;
			arg1 = IBBQNXJX.field818;
			var5 += var7 * var10;
			var4 += IBBQNXJX.field816 * var10;
		}

		if (arg1 + var6 > IBBQNXJX.field819) {
			var6 -= arg1 + var6 - IBBQNXJX.field819;
		}

		if (arg2 < IBBQNXJX.field820) {
			int var11 = IBBQNXJX.field820 - arg2;
			var7 -= var11;
			arg2 = IBBQNXJX.field820;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > IBBQNXJX.field821) {
			int var12 = arg2 + var7 - IBBQNXJX.field821;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method407(IBBQNXJX.field815, var4, 0, var8, field1052, var5, var9, var7, arg0.field1087, var6);
		}
	}

	@ObfuscatedName("LOVQYTIZ.a([IIII[IIBII[BI)V")
	public void method407(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
		int var11 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg4[arg5++];
				if (var14 != 0 && arg8[arg1] == 0) {
					arg0[arg1++] = var14;
				} else {
					arg1++;
				}

				int var15 = arg4[arg5++];
				if (var15 != 0 && arg8[arg1] == 0) {
					arg0[arg1++] = var15;
				} else {
					arg1++;
				}

				int var16 = arg4[arg5++];
				if (var16 != 0 && arg8[arg1] == 0) {
					arg0[arg1++] = var16;
				} else {
					arg1++;
				}

				int var17 = arg4[arg5++];
				if (var17 != 0 && arg8[arg1] == 0) {
					arg0[arg1++] = var17;
				} else {
					arg1++;
				}
			}

			for (int var18 = arg7; var18 < 0; var18++) {
				int var19 = arg4[arg5++];
				if (var19 != 0 && arg8[arg1] == 0) {
					arg0[arg1++] = var19;
				} else {
					arg1++;
				}
			}

			arg1 += arg3;
			arg5 += arg6;
		}
	}
}
