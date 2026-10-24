package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("ZWUMKFUX")
public final class ZWUMKFUX extends NQLGXPRA {

	@ObfuscatedName("ZWUMKFUX.A")
	public int[] field1505;

	@ObfuscatedName("ZWUMKFUX.F")
	public int field1510;

	@ObfuscatedName("ZWUMKFUX.B")
	public int field1506;

	@ObfuscatedName("ZWUMKFUX.G")
	public int field1511;

	@ObfuscatedName("ZWUMKFUX.C")
	public int field1507;

	@ObfuscatedName("ZWUMKFUX.E")
	public int field1509;

	@ObfuscatedName("ZWUMKFUX.D")
	public int field1508;

	public ZWUMKFUX(int arg0, int arg1) {
		field1505 = new int[arg0 * arg1];
		field1506 = field1510 = arg0;
		field1507 = field1511 = arg1;
		field1508 = field1509 = 0;
	}

	public ZWUMKFUX(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1506 = var3.getWidth(arg1);
			field1507 = var3.getHeight(arg1);
			field1510 = field1506;
			field1511 = field1507;
			field1508 = 0;
			field1509 = 0;
			field1505 = new int[field1507 * field1506];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1506, field1507, field1505, 0, field1506);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public ZWUMKFUX(INOFEYKQ arg0, String arg1, int arg2) {
		NHEPCMLW var4 = new NHEPCMLW(arg0.method277(arg1 + ".dat", null));
		NHEPCMLW var5 = new NHEPCMLW(arg0.method277("index.dat", null));
		var5.field965 = var4.method351();
		field1510 = var5.method351();
		field1511 = var5.method351();
		int var6 = var5.method349();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method353();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field965 += 2;
			var4.field965 += var5.method351() * var5.method351();
			var5.field965++;
		}

		field1508 = var5.method349();
		field1509 = var5.method349();
		field1506 = var5.method351();
		field1507 = var5.method351();
		int var10 = var5.method349();
		int var11 = field1507 * field1506;
		field1505 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1505[var12] = var7[var4.method349()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1506; var13++) {
				for (int var14 = 0; var14 < field1507; var14++) {
					field1505[field1506 * var14 + var13] = var7[var4.method349()];
				}
			}
		}
	}

	@ObfuscatedName("ZWUMKFUX.a(B)V")
	public void method589() {
		NQLGXPRA.method388(field1506, field1505, field1507);
	}

	@ObfuscatedName("ZWUMKFUX.a(IIIB)V")
	public void method590(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1505.length; var4++) {
			int var5 = field1505[var4];
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

				field1505[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("ZWUMKFUX.c(I)V")
	public void method591() {
		int[] var1 = new int[field1511 * field1510];
		for (int var2 = 0; var2 < field1507; var2++) {
			for (int var3 = 0; var3 < field1506; var3++) {
				var1[(field1509 + var2) * field1510 + field1508 + var3] = field1505[field1506 * var2 + var3];
			}
		}

		field1505 = var1;
		field1506 = field1510;
		field1507 = field1511;
		field1508 = 0;
		field1509 = 0;
	}

	@ObfuscatedName("ZWUMKFUX.a(III)V")
	public void method592(int arg0, int arg1) {
		arg0 += field1508;
		arg1 += field1509;
		int var3 = NQLGXPRA.field978 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1507;
		int var6 = field1506;
		int var7 = NQLGXPRA.field978 - var6;
		int var8 = 0;

		if (arg1 < NQLGXPRA.field980) {
			int var9 = NQLGXPRA.field980 - arg1;
			var5 -= var9;
			arg1 = NQLGXPRA.field980;
			var4 += var6 * var9;
			var3 += NQLGXPRA.field978 * var9;
		}

		if (arg1 + var5 > NQLGXPRA.field981) {
			var5 -= arg1 + var5 - NQLGXPRA.field981;
		}

		if (arg0 < NQLGXPRA.field982) {
			int var10 = NQLGXPRA.field982 - arg0;
			var6 -= var10;
			arg0 = NQLGXPRA.field982;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > NQLGXPRA.field983) {
			int var11 = arg0 + var6 - NQLGXPRA.field983;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method593(var4, var5, var6, NQLGXPRA.field977, var8, var3, field1505, var7);
		}
	}

	@ObfuscatedName("ZWUMKFUX.a(III[III[IIB)V")
	public void method593(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7) {
		int var9 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var10 = -arg1; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg3[arg5++] = arg6[arg0++];
				arg3[arg5++] = arg6[arg0++];
				arg3[arg5++] = arg6[arg0++];
				arg3[arg5++] = arg6[arg0++];
			}

			for (int var12 = arg2; var12 < 0; var12++) {
				arg3[arg5++] = arg6[arg0++];
			}

			arg5 += arg7;
			arg0 += arg4;
		}
	}

	@ObfuscatedName("ZWUMKFUX.a(IIB)V")
	public void method594(int arg0, int arg1) {
		arg0 += field1508;
		arg1 += field1509;
		int var3 = NQLGXPRA.field978 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1507;
		int var6 = field1506;
		int var7 = NQLGXPRA.field978 - var6;
		int var8 = 0;

		if (arg1 < NQLGXPRA.field980) {
			int var9 = NQLGXPRA.field980 - arg1;
			var5 -= var9;
			arg1 = NQLGXPRA.field980;
			var4 += var6 * var9;
			var3 += NQLGXPRA.field978 * var9;
		}

		if (arg1 + var5 > NQLGXPRA.field981) {
			var5 -= arg1 + var5 - NQLGXPRA.field981;
		}

		if (arg0 < NQLGXPRA.field982) {
			int var10 = NQLGXPRA.field982 - arg0;
			var6 -= var10;
			arg0 = NQLGXPRA.field982;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > NQLGXPRA.field983) {
			int var11 = arg0 + var6 - NQLGXPRA.field983;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method595(NQLGXPRA.field977, field1505, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("ZWUMKFUX.a([I[IIIIIIII)V")
	public void method595(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("ZWUMKFUX.a(IIII)V")
	public void method596(int arg0, int arg1, int arg2) {
		arg1 += field1508;
		arg0 += field1509;
		int var4 = NQLGXPRA.field978 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1507;
		int var7 = field1506;
		int var8 = NQLGXPRA.field978 - var7;
		int var9 = 0;

		if (arg0 < NQLGXPRA.field980) {
			int var10 = NQLGXPRA.field980 - arg0;
			var6 -= var10;
			arg0 = NQLGXPRA.field980;
			var5 += var7 * var10;
			var4 += NQLGXPRA.field978 * var10;
		}

		if (arg0 + var6 > NQLGXPRA.field981) {
			var6 -= arg0 + var6 - NQLGXPRA.field981;
		}

		if (arg1 < NQLGXPRA.field982) {
			int var11 = NQLGXPRA.field982 - arg1;
			var7 -= var11;
			arg1 = NQLGXPRA.field982;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > NQLGXPRA.field983) {
			int var12 = arg1 + var7 - NQLGXPRA.field983;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method597(var6, var5, arg2, var8, 0, var7, var4, NQLGXPRA.field977, var9, field1505);
		}
	}

	@ObfuscatedName("ZWUMKFUX.a(IIIIIIII[II[I)V")
	public void method597(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int[] arg9) {
		int var11 = 256 - arg2;
		for (int var12 = -arg0; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = arg9[arg1++];
				if (var14 == 0) {
					arg6++;
				} else {
					int var15 = arg7[arg6];
					arg7[arg6++] = ((var14 & 0xFF00FF) * arg2 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg2 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg6 += arg3;
			arg1 += arg8;
		}
	}

	@ObfuscatedName("ZWUMKFUX.a(BIIII[II[IIII)V")
	public void method598(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg0 / 2;
			int var12 = -arg5 / 2;
			int var13 = (int) (Math.sin(arg2 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg2 / 326.11D) * 65536.0D);
			var13 = arg1 * var13 >> 8;
			var14 = arg1 * var14 >> 8;
			int var15 = (arg9 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg8 << 16) + var12 * var14 - var11 * var13;
			int var17 = NQLGXPRA.field978 * arg7 + arg3;
			for (int var18 = 0; var18 < arg5; var18++) {
				int var19 = arg4[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg6[var18]; var23 < 0; var23++) {
					NQLGXPRA.field977[var20++] = field1505[(var21 >> 16) + (var22 >> 16) * field1506];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += NQLGXPRA.field978;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("ZWUMKFUX.a(IIDIIIIII)V")
	public void method599(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg0 / 2;
			int var12 = (int) (Math.sin(arg2) * 65536.0D);
			int var13 = (int) (Math.cos(arg2) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg5 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg1 << 16) + var11 * var13 - var10 * var12;
			int var16 = NQLGXPRA.field978 * arg7 + arg3;
			for (int var17 = 0; var17 < arg0; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field1505[(var19 >> 16) + (var20 >> 16) * field1506];
					if (var22 == 0) {
						var18++;
					} else {
						NQLGXPRA.field977[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += NQLGXPRA.field978;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("ZWUMKFUX.a(IBILRZWMPYWU;)V")
	public void method600(int arg0, int arg1, RZWMPYWU arg2) {
		arg0 += field1508;
		arg1 += field1509;
		int var4 = NQLGXPRA.field978 * arg1 + arg0;
		int var5 = 0;
		int var6 = field1507;
		int var7 = field1506;
		int var8 = NQLGXPRA.field978 - var7;
		int var9 = 0;

		if (arg1 < NQLGXPRA.field980) {
			int var10 = NQLGXPRA.field980 - arg1;
			var6 -= var10;
			arg1 = NQLGXPRA.field980;
			var5 += var7 * var10;
			var4 += NQLGXPRA.field978 * var10;
		}

		if (arg1 + var6 > NQLGXPRA.field981) {
			var6 -= arg1 + var6 - NQLGXPRA.field981;
		}

		if (arg0 < NQLGXPRA.field982) {
			int var11 = NQLGXPRA.field982 - arg0;
			var7 -= var11;
			arg0 = NQLGXPRA.field982;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > NQLGXPRA.field983) {
			int var12 = arg0 + var7 - NQLGXPRA.field983;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method601(0, var4, field1505, var6, var7, var9, NQLGXPRA.field977, arg2.field1179, var8, var5);
		}
	}

	@ObfuscatedName("ZWUMKFUX.a(II[IIII[I[BIII)V")
	public void method601(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, byte[] arg7, int arg8, int arg9) {
		int var11 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg2[arg9++];
				if (var14 != 0 && arg7[arg1] == 0) {
					arg6[arg1++] = var14;
				} else {
					arg1++;
				}

				int var15 = arg2[arg9++];
				if (var15 != 0 && arg7[arg1] == 0) {
					arg6[arg1++] = var15;
				} else {
					arg1++;
				}

				int var16 = arg2[arg9++];
				if (var16 != 0 && arg7[arg1] == 0) {
					arg6[arg1++] = var16;
				} else {
					arg1++;
				}

				int var17 = arg2[arg9++];
				if (var17 != 0 && arg7[arg1] == 0) {
					arg6[arg1++] = var17;
				} else {
					arg1++;
				}
			}

			for (int var18 = arg4; var18 < 0; var18++) {
				int var19 = arg2[arg9++];
				if (var19 != 0 && arg7[arg1] == 0) {
					arg6[arg1++] = var19;
				} else {
					arg1++;
				}
			}

			arg1 += arg8;
			arg9 += arg5;
		}
	}
}
