package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("INRTBCYJ")
public final class INRTBCYJ extends CYEOWDOP {

	@ObfuscatedName("INRTBCYJ.H")
	public int[] field1011;

	@ObfuscatedName("INRTBCYJ.M")
	public int field1016;

	@ObfuscatedName("INRTBCYJ.I")
	public int field1012;

	@ObfuscatedName("INRTBCYJ.N")
	public int field1017;

	@ObfuscatedName("INRTBCYJ.J")
	public int field1013;

	@ObfuscatedName("INRTBCYJ.L")
	public int field1015;

	@ObfuscatedName("INRTBCYJ.K")
	public int field1014;

	public INRTBCYJ(int arg0, int arg1) {
		field1011 = new int[arg0 * arg1];
		field1012 = field1016 = arg0;
		field1013 = field1017 = arg1;
		field1014 = field1015 = 0;
	}

	public INRTBCYJ(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1012 = var3.getWidth(arg1);
			field1013 = var3.getHeight(arg1);
			field1016 = field1012;
			field1017 = field1013;
			field1014 = 0;
			field1015 = 0;
			field1011 = new int[field1013 * field1012];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1012, field1013, field1011, 0, field1012);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public INRTBCYJ(SRZUEVOD arg0, String arg1, int arg2) {
		LZWRHABP var4 = new LZWRHABP(arg0.method566(arg1 + ".dat", null));
		LZWRHABP var5 = new LZWRHABP(arg0.method566("index.dat", null));
		var5.field1139 = var4.method465();
		field1016 = var5.method465();
		field1017 = var5.method465();
		int var6 = var5.method463();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method467();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1139 += 2;
			var4.field1139 += var5.method465() * var5.method465();
			var5.field1139++;
		}

		field1014 = var5.method463();
		field1015 = var5.method463();
		field1012 = var5.method465();
		field1013 = var5.method465();
		int var10 = var5.method463();
		int var11 = field1013 * field1012;
		field1011 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1011[var12] = var7[var4.method463()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1012; var13++) {
				for (int var14 = 0; var14 < field1013; var14++) {
					field1011[field1012 * var14 + var13] = var7[var4.method463()];
				}
			}
		}
	}

	@ObfuscatedName("INRTBCYJ.b(B)V")
	public void method382() {
		CYEOWDOP.method224(field1013, field1012, field1011);
	}

	@ObfuscatedName("INRTBCYJ.a(BIII)V")
	public void method383(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1011.length; var4++) {
			int var5 = field1011[var4];
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

				field1011[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("INRTBCYJ.a(Z)V")
	public void method384() {
		int[] var1 = new int[field1017 * field1016];
		for (int var2 = 0; var2 < field1013; var2++) {
			for (int var3 = 0; var3 < field1012; var3++) {
				var1[(field1015 + var2) * field1016 + field1014 + var3] = field1011[field1012 * var2 + var3];
			}
		}

		field1011 = var1;
		field1012 = field1016;
		field1013 = field1017;
		field1014 = 0;
		field1015 = 0;
	}

	@ObfuscatedName("INRTBCYJ.a(IZI)V")
	public void method385(int arg0, int arg1) {
		arg0 += field1014;
		arg1 += field1015;
		int var3 = CYEOWDOP.field639 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1013;
		int var6 = field1012;
		int var7 = CYEOWDOP.field639 - var6;
		int var8 = 0;

		if (arg1 < CYEOWDOP.field641) {
			int var9 = CYEOWDOP.field641 - arg1;
			var5 -= var9;
			arg1 = CYEOWDOP.field641;
			var4 += var6 * var9;
			var3 += CYEOWDOP.field639 * var9;
		}

		if (arg1 + var5 > CYEOWDOP.field642) {
			var5 -= arg1 + var5 - CYEOWDOP.field642;
		}

		if (arg0 < CYEOWDOP.field643) {
			int var10 = CYEOWDOP.field643 - arg0;
			var6 -= var10;
			arg0 = CYEOWDOP.field643;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > CYEOWDOP.field644) {
			int var11 = arg0 + var6 - CYEOWDOP.field644;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method386(var6, var7, var5, field1011, var4, var8, CYEOWDOP.field638, var3);
		}
	}

	@ObfuscatedName("INRTBCYJ.a(III[IIZI[II)V")
	public void method386(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg2; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg6[arg7++] = arg3[arg4++];
				arg6[arg7++] = arg3[arg4++];
				arg6[arg7++] = arg3[arg4++];
				arg6[arg7++] = arg3[arg4++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg6[arg7++] = arg3[arg4++];
			}

			arg7 += arg1;
			arg4 += arg5;
		}
	}

	@ObfuscatedName("INRTBCYJ.b(IZI)V")
	public void method387(int arg0, int arg1) {
		arg0 += field1014;
		arg1 += field1015;
		int var3 = CYEOWDOP.field639 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1013;
		int var6 = field1012;
		int var7 = CYEOWDOP.field639 - var6;
		int var8 = 0;

		if (arg1 < CYEOWDOP.field641) {
			int var9 = CYEOWDOP.field641 - arg1;
			var5 -= var9;
			arg1 = CYEOWDOP.field641;
			var4 += var6 * var9;
			var3 += CYEOWDOP.field639 * var9;
		}

		if (arg1 + var5 > CYEOWDOP.field642) {
			var5 -= arg1 + var5 - CYEOWDOP.field642;
		}

		if (arg0 < CYEOWDOP.field643) {
			int var10 = CYEOWDOP.field643 - arg0;
			var6 -= var10;
			arg0 = CYEOWDOP.field643;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > CYEOWDOP.field644) {
			int var11 = arg0 + var6 - CYEOWDOP.field644;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method388(CYEOWDOP.field638, field1011, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("INRTBCYJ.a([I[IIIIIIII)V")
	public void method388(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("INRTBCYJ.a(IIII)V")
	public void method389(int arg0, int arg1, int arg2) {
		arg1 += field1014;
		arg2 += field1015;
		int var4 = CYEOWDOP.field639 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1013;
		int var7 = field1012;
		int var8 = CYEOWDOP.field639 - var7;
		int var9 = 0;

		if (arg2 < CYEOWDOP.field641) {
			int var10 = CYEOWDOP.field641 - arg2;
			var6 -= var10;
			arg2 = CYEOWDOP.field641;
			var5 += var7 * var10;
			var4 += CYEOWDOP.field639 * var10;
		}

		if (arg2 + var6 > CYEOWDOP.field642) {
			var6 -= arg2 + var6 - CYEOWDOP.field642;
		}

		if (arg1 < CYEOWDOP.field643) {
			int var11 = CYEOWDOP.field643 - arg1;
			var7 -= var11;
			arg1 = CYEOWDOP.field643;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > CYEOWDOP.field644) {
			int var12 = arg1 + var7 - CYEOWDOP.field644;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method390(var4, arg0, var5, var7, 0, CYEOWDOP.field638, var9, field1011, var6, var8);
		}
	}

	@ObfuscatedName("INRTBCYJ.a(IIIIII[II[III)V")
	public void method390(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg1;
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = arg7[arg2++];
				if (var14 == 0) {
					arg0++;
				} else {
					int var15 = arg5[arg0];
					arg5[arg0++] = ((var14 & 0xFF00FF) * arg1 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg1 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg0 += arg9;
			arg2 += arg6;
		}
	}

	@ObfuscatedName("INRTBCYJ.b(IIIIII[II[III)V")
	public void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		try {
			int var11 = -arg8 / 2;
			int var12 = -arg2 / 2;
			int var13 = (int) (Math.sin(arg9 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg9 / 326.11D) * 65536.0D);
			var13 = arg4 * var13 >> 8;
			var14 = arg4 * var14 >> 8;
			int var15 = (arg0 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg1 << 16) + var12 * var14 - var11 * var13;
			int var17 = CYEOWDOP.field639 * arg3 + arg6;
			for (int var18 = 0; var18 < arg2; var18++) {
				int var19 = arg7[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg5[var18]; var23 < 0; var23++) {
					CYEOWDOP.field638[var20++] = field1011[(var21 >> 16) + (var22 >> 16) * field1012];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += CYEOWDOP.field639;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("INRTBCYJ.a(IIIIIIIID)V")
	public void method392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg5 / 2;
			int var12 = (int) (Math.sin(arg7) * 65536.0D);
			int var13 = (int) (Math.cos(arg7) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg0 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg3 << 16) + var11 * var13 - var10 * var12;
			int var16 = CYEOWDOP.field639 * arg1 + arg2;
			for (int var17 = 0; var17 < arg5; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field1011[(var19 >> 16) + (var20 >> 16) * field1012];
					if (var22 == 0) {
						var18++;
					} else {
						CYEOWDOP.field638[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += CYEOWDOP.field639;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("INRTBCYJ.a(IILXRUIQOVM;I)V")
	public void method393(int arg0, int arg1, XRUIQOVM arg2) {
		arg0 += field1014;
		arg1 += field1015;
		int var4 = CYEOWDOP.field639 * arg1 + arg0;
		int var5 = 0;
		int var6 = field1013;
		int var7 = field1012;
		int var8 = CYEOWDOP.field639 - var7;
		int var9 = 0;

		if (arg1 < CYEOWDOP.field641) {
			int var10 = CYEOWDOP.field641 - arg1;
			var6 -= var10;
			arg1 = CYEOWDOP.field641;
			var5 += var7 * var10;
			var4 += CYEOWDOP.field639 * var10;
		}

		if (arg1 + var6 > CYEOWDOP.field642) {
			var6 -= arg1 + var6 - CYEOWDOP.field642;
		}

		if (arg0 < CYEOWDOP.field643) {
			int var11 = CYEOWDOP.field643 - arg0;
			var7 -= var11;
			arg0 = CYEOWDOP.field643;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > CYEOWDOP.field644) {
			int var12 = arg0 + var7 - CYEOWDOP.field644;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method394(CYEOWDOP.field638, var7, var4, arg2.field1495, var5, var6, 0, var9, var8, field1011);
		}
	}

	@ObfuscatedName("INRTBCYJ.a([IIZI[BIIIII[I)V")
	public void method394(int[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		int var11 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var12 = -arg5; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg9[arg4++];
				if (var14 != 0 && arg3[arg2] == 0) {
					arg0[arg2++] = var14;
				} else {
					arg2++;
				}

				int var15 = arg9[arg4++];
				if (var15 != 0 && arg3[arg2] == 0) {
					arg0[arg2++] = var15;
				} else {
					arg2++;
				}

				int var16 = arg9[arg4++];
				if (var16 != 0 && arg3[arg2] == 0) {
					arg0[arg2++] = var16;
				} else {
					arg2++;
				}

				int var17 = arg9[arg4++];
				if (var17 != 0 && arg3[arg2] == 0) {
					arg0[arg2++] = var17;
				} else {
					arg2++;
				}
			}

			for (int var18 = arg1; var18 < 0; var18++) {
				int var19 = arg9[arg4++];
				if (var19 != 0 && arg3[arg2] == 0) {
					arg0[arg2++] = var19;
				} else {
					arg2++;
				}
			}

			arg2 += arg8;
			arg4 += arg7;
		}
	}
}
