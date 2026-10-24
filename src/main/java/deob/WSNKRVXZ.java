package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("WSNKRVXZ")
public final class WSNKRVXZ extends ZLDPKUPX {

	@ObfuscatedName("WSNKRVXZ.E")
	public int[] field1437;

	@ObfuscatedName("WSNKRVXZ.J")
	public int field1442;

	@ObfuscatedName("WSNKRVXZ.F")
	public int field1438;

	@ObfuscatedName("WSNKRVXZ.K")
	public int field1443;

	@ObfuscatedName("WSNKRVXZ.G")
	public int field1439;

	@ObfuscatedName("WSNKRVXZ.I")
	public int field1441;

	@ObfuscatedName("WSNKRVXZ.H")
	public int field1440;

	public WSNKRVXZ(int arg0, int arg1) {
		field1437 = new int[arg0 * arg1];
		field1438 = field1442 = arg0;
		field1439 = field1443 = arg1;
		field1440 = field1441 = 0;
	}

	public WSNKRVXZ(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1438 = var3.getWidth(arg1);
			field1439 = var3.getHeight(arg1);
			field1442 = field1438;
			field1443 = field1439;
			field1440 = 0;
			field1441 = 0;
			field1437 = new int[field1439 * field1438];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1438, field1439, field1437, 0, field1438);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public WSNKRVXZ(RPFMUSNN arg0, String arg1, int arg2) {
		WNCFPLWV var4 = new WNCFPLWV(arg0.method414(arg1 + ".dat", null));
		WNCFPLWV var5 = new WNCFPLWV(arg0.method414("index.dat", null));
		var5.field1375 = var4.method504();
		field1442 = var5.method504();
		field1443 = var5.method504();
		int var6 = var5.method502();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method506();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1375 += 2;
			var4.field1375 += var5.method504() * var5.method504();
			var5.field1375++;
		}

		field1440 = var5.method502();
		field1441 = var5.method502();
		field1438 = var5.method504();
		field1439 = var5.method504();
		int var10 = var5.method502();
		int var11 = field1439 * field1438;
		field1437 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1437[var12] = var7[var4.method502()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1438; var13++) {
				for (int var14 = 0; var14 < field1439; var14++) {
					field1437[field1438 * var14 + var13] = var7[var4.method502()];
				}
			}
		}
	}

	@ObfuscatedName("WSNKRVXZ.a(Z)V")
	public void method545() {
		ZLDPKUPX.method592(field1437, field1438, field1439);
	}

	@ObfuscatedName("WSNKRVXZ.a(IIII)V")
	public void method546(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1437.length; var4++) {
			int var5 = field1437[var4];
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

				field1437[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("WSNKRVXZ.c(I)V")
	public void method547() {
		int[] var1 = new int[field1443 * field1442];
		for (int var2 = 0; var2 < field1439; var2++) {
			for (int var3 = 0; var3 < field1438; var3++) {
				var1[(field1441 + var2) * field1442 + field1440 + var3] = field1437[field1438 * var2 + var3];
			}
		}

		field1437 = var1;
		field1438 = field1442;
		field1439 = field1443;
		field1440 = 0;
		field1441 = 0;
	}

	@ObfuscatedName("WSNKRVXZ.a(III)V")
	public void method548(int arg0, int arg1) {
		arg1 += field1440;
		arg0 += field1441;
		int var3 = ZLDPKUPX.field1506 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1439;
		int var6 = field1438;
		int var7 = ZLDPKUPX.field1506 - var6;
		int var8 = 0;

		if (arg0 < ZLDPKUPX.field1508) {
			int var9 = ZLDPKUPX.field1508 - arg0;
			var5 -= var9;
			arg0 = ZLDPKUPX.field1508;
			var4 += var6 * var9;
			var3 += ZLDPKUPX.field1506 * var9;
		}

		if (arg0 + var5 > ZLDPKUPX.field1509) {
			var5 -= arg0 + var5 - ZLDPKUPX.field1509;
		}

		if (arg1 < ZLDPKUPX.field1510) {
			int var10 = ZLDPKUPX.field1510 - arg1;
			var6 -= var10;
			arg1 = ZLDPKUPX.field1510;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > ZLDPKUPX.field1511) {
			int var11 = arg1 + var6 - ZLDPKUPX.field1511;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method549(field1437, ZLDPKUPX.field1505, var3, var4, var7, var8, var6, var5);
		}
	}

	@ObfuscatedName("WSNKRVXZ.a([II[IIIIIII)V")
	public void method549(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var10 = -arg7; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg2++] = arg0[arg3++];
				arg1[arg2++] = arg0[arg3++];
				arg1[arg2++] = arg0[arg3++];
				arg1[arg2++] = arg0[arg3++];
			}

			for (int var12 = arg6; var12 < 0; var12++) {
				arg1[arg2++] = arg0[arg3++];
			}

			arg2 += arg4;
			arg3 += arg5;
		}
	}

	@ObfuscatedName("WSNKRVXZ.a(ZII)V")
	public void method550(int arg0, int arg1) {
		arg0 += field1440;
		arg1 += field1441;
		int var3 = ZLDPKUPX.field1506 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1439;
		int var6 = field1438;
		int var7 = ZLDPKUPX.field1506 - var6;
		int var8 = 0;

		if (arg1 < ZLDPKUPX.field1508) {
			int var9 = ZLDPKUPX.field1508 - arg1;
			var5 -= var9;
			arg1 = ZLDPKUPX.field1508;
			var4 += var6 * var9;
			var3 += ZLDPKUPX.field1506 * var9;
		}

		if (arg1 + var5 > ZLDPKUPX.field1509) {
			var5 -= arg1 + var5 - ZLDPKUPX.field1509;
		}

		if (arg0 < ZLDPKUPX.field1510) {
			int var10 = ZLDPKUPX.field1510 - arg0;
			var6 -= var10;
			arg0 = ZLDPKUPX.field1510;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > ZLDPKUPX.field1511) {
			int var11 = arg0 + var6 - ZLDPKUPX.field1511;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method551(ZLDPKUPX.field1505, field1437, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("WSNKRVXZ.a([I[IIIIIIII)V")
	public void method551(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("WSNKRVXZ.a(IBII)V")
	public void method552(int arg0, int arg1, int arg2) {
		arg1 += field1440;
		arg2 += field1441;
		int var4 = ZLDPKUPX.field1506 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1439;
		int var7 = field1438;
		int var8 = ZLDPKUPX.field1506 - var7;
		int var9 = 0;

		if (arg2 < ZLDPKUPX.field1508) {
			int var10 = ZLDPKUPX.field1508 - arg2;
			var6 -= var10;
			arg2 = ZLDPKUPX.field1508;
			var5 += var7 * var10;
			var4 += ZLDPKUPX.field1506 * var10;
		}

		if (arg2 + var6 > ZLDPKUPX.field1509) {
			var6 -= arg2 + var6 - ZLDPKUPX.field1509;
		}

		if (arg1 < ZLDPKUPX.field1510) {
			int var11 = ZLDPKUPX.field1510 - arg1;
			var7 -= var11;
			arg1 = ZLDPKUPX.field1510;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > ZLDPKUPX.field1511) {
			int var12 = arg1 + var7 - ZLDPKUPX.field1511;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method553(arg0, var8, field1437, var5, var7, 0, var4, ZLDPKUPX.field1505, var9, var6);
		}
	}

	@ObfuscatedName("WSNKRVXZ.a(II[IIIII[IIII)V")
	public void method553(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg0;
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = arg2[arg3++];
				if (var14 == 0) {
					arg6++;
				} else {
					int var15 = arg7[arg6];
					arg7[arg6++] = ((var14 & 0xFF00FF) * arg0 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg0 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg6 += arg1;
			arg3 += arg8;
		}
	}

	@ObfuscatedName("WSNKRVXZ.a([IIIIIIIII[II)V")
	public void method554(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		try {
			int var11 = -arg6 / 2;
			int var12 = -arg7 / 2;
			int var13 = (int) (Math.sin(arg3 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg3 / 326.11D) * 65536.0D);
			var13 = arg4 * var13 >> 8;
			var14 = arg4 * var14 >> 8;
			int var15 = (arg9 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg1 << 16) + var12 * var14 - var11 * var13;
			int var17 = ZLDPKUPX.field1506 * arg5 + arg2;
			for (int var18 = 0; var18 < arg7; var18++) {
				int var19 = arg8[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg0[var18]; var23 < 0; var23++) {
					ZLDPKUPX.field1505[var20++] = field1437[(var21 >> 16) + (var22 >> 16) * field1438];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += ZLDPKUPX.field1506;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("WSNKRVXZ.a(IIIIIDIIZ)V")
	public void method555(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7) {
		try {
			int var10 = -arg1 / 2;
			int var11 = -arg2 / 2;
			int var12 = (int) (Math.sin(arg5) * 65536.0D);
			int var13 = (int) (Math.cos(arg5) * 65536.0D);
			var12 = arg7 * var12 >> 8;
			var13 = arg7 * var13 >> 8;
			int var14 = (arg0 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg3 << 16) + var11 * var13 - var10 * var12;
			int var16 = ZLDPKUPX.field1506 * arg6 + arg4;
			for (int var17 = 0; var17 < arg2; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg1; var21 < 0; var21++) {
					int var22 = field1437[(var19 >> 16) + (var20 >> 16) * field1438];
					if (var22 == 0) {
						var18++;
					} else {
						ZLDPKUPX.field1505[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += ZLDPKUPX.field1506;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("WSNKRVXZ.a(ILSSCICQYX;ZI)V")
	public void method556(int arg0, SSCICQYX arg1, int arg2) {
		arg0 += field1440;
		arg2 += field1441;
		int var4 = ZLDPKUPX.field1506 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1439;
		int var7 = field1438;
		int var8 = ZLDPKUPX.field1506 - var7;
		int var9 = 0;

		if (arg2 < ZLDPKUPX.field1508) {
			int var10 = ZLDPKUPX.field1508 - arg2;
			var6 -= var10;
			arg2 = ZLDPKUPX.field1508;
			var5 += var7 * var10;
			var4 += ZLDPKUPX.field1506 * var10;
		}

		if (arg2 + var6 > ZLDPKUPX.field1509) {
			var6 -= arg2 + var6 - ZLDPKUPX.field1509;
		}

		if (arg0 < ZLDPKUPX.field1510) {
			int var11 = ZLDPKUPX.field1510 - arg0;
			var7 -= var11;
			arg0 = ZLDPKUPX.field1510;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > ZLDPKUPX.field1511) {
			int var12 = arg0 + var7 - ZLDPKUPX.field1511;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method557(var5, 0, var7, field1437, arg1.field1234, var8, ZLDPKUPX.field1505, var6, var9, var4);
		}
	}

	@ObfuscatedName("WSNKRVXZ.a(IIIB[I[BI[IIII)V")
	public void method557(int arg0, int arg1, int arg2, int[] arg3, byte[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg3[arg0++];
				if (var14 != 0 && arg4[arg9] == 0) {
					arg6[arg9++] = var14;
				} else {
					arg9++;
				}

				int var15 = arg3[arg0++];
				if (var15 != 0 && arg4[arg9] == 0) {
					arg6[arg9++] = var15;
				} else {
					arg9++;
				}

				int var16 = arg3[arg0++];
				if (var16 != 0 && arg4[arg9] == 0) {
					arg6[arg9++] = var16;
				} else {
					arg9++;
				}

				int var17 = arg3[arg0++];
				if (var17 != 0 && arg4[arg9] == 0) {
					arg6[arg9++] = var17;
				} else {
					arg9++;
				}
			}

			for (int var18 = arg2; var18 < 0; var18++) {
				int var19 = arg3[arg0++];
				if (var19 != 0 && arg4[arg9] == 0) {
					arg6[arg9++] = var19;
				} else {
					arg9++;
				}
			}

			arg9 += arg5;
			arg0 += arg8;
		}
	}
}
