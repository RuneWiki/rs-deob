package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("EYTQJNEM")
public final class EYTQJNEM extends ACKHPAZA {

	@ObfuscatedName("EYTQJNEM.H")
	public int[] field552;

	@ObfuscatedName("EYTQJNEM.M")
	public int field557;

	@ObfuscatedName("EYTQJNEM.I")
	public int field553;

	@ObfuscatedName("EYTQJNEM.N")
	public int field558;

	@ObfuscatedName("EYTQJNEM.J")
	public int field554;

	@ObfuscatedName("EYTQJNEM.L")
	public int field556;

	@ObfuscatedName("EYTQJNEM.K")
	public int field555;

	public EYTQJNEM(int arg0, int arg1) {
		field552 = new int[arg0 * arg1];
		field553 = field557 = arg0;
		field554 = field558 = arg1;
		field555 = field556 = 0;
	}

	public EYTQJNEM(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field553 = var3.getWidth(arg1);
			field554 = var3.getHeight(arg1);
			field557 = field553;
			field558 = field554;
			field555 = 0;
			field556 = 0;
			field552 = new int[field554 * field553];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field553, field554, field552, 0, field553);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public EYTQJNEM(FIGUVTWB arg0, String arg1, int arg2) {
		MUKVLYLC var4 = new MUKVLYLC(arg0.method209(arg1 + ".dat", null));
		MUKVLYLC var5 = new MUKVLYLC(arg0.method209("index.dat", null));
		var5.field812 = var4.method294();
		field557 = var5.method294();
		field558 = var5.method294();
		int var6 = var5.method292();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method296();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field812 += 2;
			var4.field812 += var5.method294() * var5.method294();
			var5.field812++;
		}

		field555 = var5.method292();
		field556 = var5.method292();
		field553 = var5.method294();
		field554 = var5.method294();
		int var10 = var5.method292();
		int var11 = field554 * field553;
		field552 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field552[var12] = var7[var4.method292()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field553; var13++) {
				for (int var14 = 0; var14 < field554; var14++) {
					field552[field553 * var14 + var13] = var7[var4.method292()];
				}
			}
		}
	}

	@ObfuscatedName("EYTQJNEM.b(B)V")
	public void method188() {
		ACKHPAZA.method1(field554, field552, field553);
	}

	@ObfuscatedName("EYTQJNEM.a(IIZI)V")
	public void method189(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field552.length; var4++) {
			int var5 = field552[var4];
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

				field552[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("EYTQJNEM.b(I)V")
	public void method190() {
		int[] var1 = new int[field558 * field557];
		for (int var2 = 0; var2 < field554; var2++) {
			for (int var3 = 0; var3 < field553; var3++) {
				var1[(field556 + var2) * field557 + field555 + var3] = field552[field553 * var2 + var3];
			}
		}

		field552 = var1;
		field553 = field557;
		field554 = field558;
		field555 = 0;
		field556 = 0;
	}

	@ObfuscatedName("EYTQJNEM.a(III)V")
	public void method191(int arg0, int arg1) {
		arg1 += field555;
		arg0 += field556;
		int var3 = ACKHPAZA.field2 * arg0 + arg1;
		int var4 = 0;
		int var5 = field554;
		int var6 = field553;
		int var7 = ACKHPAZA.field2 - var6;
		int var8 = 0;

		if (arg0 < ACKHPAZA.field4) {
			int var9 = ACKHPAZA.field4 - arg0;
			var5 -= var9;
			arg0 = ACKHPAZA.field4;
			var4 += var6 * var9;
			var3 += ACKHPAZA.field2 * var9;
		}

		if (arg0 + var5 > ACKHPAZA.field5) {
			var5 -= arg0 + var5 - ACKHPAZA.field5;
		}

		if (arg1 < ACKHPAZA.field6) {
			int var10 = ACKHPAZA.field6 - arg1;
			var6 -= var10;
			arg1 = ACKHPAZA.field6;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > ACKHPAZA.field7) {
			int var11 = arg1 + var6 - ACKHPAZA.field7;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method192(var3, field552, ACKHPAZA.field1, var7, var5, var4, var6, var8);
		}
	}

	@ObfuscatedName("EYTQJNEM.a(I[I[IIIIIII)V")
	public void method192(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var10 = -arg4; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg2[arg0++] = arg1[arg5++];
				arg2[arg0++] = arg1[arg5++];
				arg2[arg0++] = arg1[arg5++];
				arg2[arg0++] = arg1[arg5++];
			}

			for (int var12 = arg6; var12 < 0; var12++) {
				arg2[arg0++] = arg1[arg5++];
			}

			arg0 += arg3;
			arg5 += arg7;
		}
	}

	@ObfuscatedName("EYTQJNEM.b(III)V")
	public void method193(int arg0, int arg1) {
		arg0 += field555;
		arg1 += field556;
		int var3 = ACKHPAZA.field2 * arg1 + arg0;
		int var4 = 0;
		int var5 = field554;
		int var6 = field553;
		int var7 = ACKHPAZA.field2 - var6;
		int var8 = 0;

		if (arg1 < ACKHPAZA.field4) {
			int var9 = ACKHPAZA.field4 - arg1;
			var5 -= var9;
			arg1 = ACKHPAZA.field4;
			var4 += var6 * var9;
			var3 += ACKHPAZA.field2 * var9;
		}

		if (arg1 + var5 > ACKHPAZA.field5) {
			var5 -= arg1 + var5 - ACKHPAZA.field5;
		}

		if (arg0 < ACKHPAZA.field6) {
			int var10 = ACKHPAZA.field6 - arg0;
			var6 -= var10;
			arg0 = ACKHPAZA.field6;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > ACKHPAZA.field7) {
			int var11 = arg0 + var6 - ACKHPAZA.field7;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method194(ACKHPAZA.field1, field552, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("EYTQJNEM.a([I[IIIIIIII)V")
	public void method194(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("EYTQJNEM.a(IIII)V")
	public void method195(int arg0, int arg1, int arg2) {
		arg0 += field555;
		arg1 += field556;
		int var4 = ACKHPAZA.field2 * arg1 + arg0;
		int var5 = 0;
		int var6 = field554;
		int var7 = field553;
		int var8 = ACKHPAZA.field2 - var7;
		int var9 = 0;

		if (arg1 < ACKHPAZA.field4) {
			int var10 = ACKHPAZA.field4 - arg1;
			var6 -= var10;
			arg1 = ACKHPAZA.field4;
			var5 += var7 * var10;
			var4 += ACKHPAZA.field2 * var10;
		}

		if (arg1 + var6 > ACKHPAZA.field5) {
			var6 -= arg1 + var6 - ACKHPAZA.field5;
		}

		if (arg0 < ACKHPAZA.field6) {
			int var11 = ACKHPAZA.field6 - arg0;
			var7 -= var11;
			arg0 = ACKHPAZA.field6;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > ACKHPAZA.field7) {
			int var12 = arg0 + var7 - ACKHPAZA.field7;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method196(arg2, ACKHPAZA.field1, 0, var4, var8, field552, var6, var5, var7, var9);
		}
	}

	@ObfuscatedName("EYTQJNEM.a(I[IIII[IBIIII)V")
	public void method196(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg0;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg8; var13 < 0; var13++) {
				int var14 = arg5[arg7++];
				if (var14 == 0) {
					arg3++;
				} else {
					int var15 = arg1[arg3];
					arg1[arg3++] = ((var14 & 0xFF00FF) * arg0 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg0 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg3 += arg4;
			arg7 += arg9;
		}
	}

	@ObfuscatedName("EYTQJNEM.a(I[III[IIIIIII)V")
	public void method197(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg2 / 2;
			int var12 = -arg9 / 2;
			int var13 = (int) (Math.sin(arg8 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg8 / 326.11D) * 65536.0D);
			var13 = arg6 * var13 >> 8;
			var14 = arg6 * var14 >> 8;
			int var15 = (arg7 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg4 << 16) + var12 * var14 - var11 * var13;
			int var17 = ACKHPAZA.field2 * arg1 + arg5;
			for (int var18 = 0; var18 < arg9; var18++) {
				int var19 = arg0[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg3[var18]; var23 < 0; var23++) {
					ACKHPAZA.field1[var20++] = field552[(var21 >> 16) + (var22 >> 16) * field553];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += ACKHPAZA.field2;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("EYTQJNEM.a(IIIDIIIII)V")
	public void method198(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg7 / 2;
			int var12 = (int) (Math.sin(arg3) * 65536.0D);
			int var13 = (int) (Math.cos(arg3) * 65536.0D);
			var12 = arg1 * var12 >> 8;
			var13 = arg1 * var13 >> 8;
			int var14 = (arg4 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg2 << 16) + var11 * var13 - var10 * var12;
			int var16 = ACKHPAZA.field2 * arg5 + arg0;
			for (int var17 = 0; var17 < arg7; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field552[(var19 >> 16) + (var20 >> 16) * field553];
					if (var22 == 0) {
						var18++;
					} else {
						ACKHPAZA.field1[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += ACKHPAZA.field2;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("EYTQJNEM.a(ILTOROBAKX;II)V")
	public void method199(TOROBAKX arg0, int arg1, int arg2) {
		arg1 += field555;
		arg2 += field556;
		int var4 = ACKHPAZA.field2 * arg2 + arg1;
		int var5 = 0;
		int var6 = field554;
		int var7 = field553;
		int var8 = ACKHPAZA.field2 - var7;
		int var9 = 0;

		if (arg2 < ACKHPAZA.field4) {
			int var10 = ACKHPAZA.field4 - arg2;
			var6 -= var10;
			arg2 = ACKHPAZA.field4;
			var5 += var7 * var10;
			var4 += ACKHPAZA.field2 * var10;
		}

		if (arg2 + var6 > ACKHPAZA.field5) {
			var6 -= arg2 + var6 - ACKHPAZA.field5;
		}

		if (arg1 < ACKHPAZA.field6) {
			int var11 = ACKHPAZA.field6 - arg1;
			var7 -= var11;
			arg1 = ACKHPAZA.field6;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > ACKHPAZA.field7) {
			int var12 = arg1 + var7 - ACKHPAZA.field7;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method200(var7, field552, 0, ACKHPAZA.field1, var5, var4, var8, var6, var9, arg0.field1258);
		}
	}

	@ObfuscatedName("EYTQJNEM.a(I[II[IIIIZII[B)V")
	public void method200(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte[] arg9) {
		int var11 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg1[arg4++];
				if (var14 != 0 && arg9[arg5] == 0) {
					arg3[arg5++] = var14;
				} else {
					arg5++;
				}

				int var15 = arg1[arg4++];
				if (var15 != 0 && arg9[arg5] == 0) {
					arg3[arg5++] = var15;
				} else {
					arg5++;
				}

				int var16 = arg1[arg4++];
				if (var16 != 0 && arg9[arg5] == 0) {
					arg3[arg5++] = var16;
				} else {
					arg5++;
				}

				int var17 = arg1[arg4++];
				if (var17 != 0 && arg9[arg5] == 0) {
					arg3[arg5++] = var17;
				} else {
					arg5++;
				}
			}

			for (int var18 = arg0; var18 < 0; var18++) {
				int var19 = arg1[arg4++];
				if (var19 != 0 && arg9[arg5] == 0) {
					arg3[arg5++] = var19;
				} else {
					arg5++;
				}
			}

			arg5 += arg6;
			arg4 += arg8;
		}
	}
}
