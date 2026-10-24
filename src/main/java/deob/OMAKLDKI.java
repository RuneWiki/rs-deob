package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("OMAKLDKI")
public final class OMAKLDKI extends DEVPLWNC {

	@ObfuscatedName("OMAKLDKI.H")
	public int[] field1027;

	@ObfuscatedName("OMAKLDKI.M")
	public int field1032;

	@ObfuscatedName("OMAKLDKI.I")
	public int field1028;

	@ObfuscatedName("OMAKLDKI.N")
	public int field1033;

	@ObfuscatedName("OMAKLDKI.J")
	public int field1029;

	@ObfuscatedName("OMAKLDKI.L")
	public int field1031;

	@ObfuscatedName("OMAKLDKI.K")
	public int field1030;

	public OMAKLDKI(int arg0, int arg1) {
		field1027 = new int[arg0 * arg1];
		field1028 = field1032 = arg0;
		field1029 = field1033 = arg1;
		field1030 = field1031 = 0;
	}

	public OMAKLDKI(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1028 = var3.getWidth(arg1);
			field1029 = var3.getHeight(arg1);
			field1032 = field1028;
			field1033 = field1029;
			field1030 = 0;
			field1031 = 0;
			field1027 = new int[field1029 * field1028];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1028, field1029, field1027, 0, field1028);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public OMAKLDKI(WEMOPWVJ arg0, String arg1, int arg2) {
		SVWJKJVI var4 = new SVWJKJVI(arg0.method559(arg1 + ".dat", null));
		SVWJKJVI var5 = new SVWJKJVI(arg0.method559("index.dat", null));
		var5.field1263 = var4.method463();
		field1032 = var5.method463();
		field1033 = var5.method463();
		int var6 = var5.method461();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method465();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1263 += 2;
			var4.field1263 += var5.method463() * var5.method463();
			var5.field1263++;
		}

		field1030 = var5.method461();
		field1031 = var5.method461();
		field1028 = var5.method463();
		field1029 = var5.method463();
		int var10 = var5.method461();
		int var11 = field1029 * field1028;
		field1027 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1027[var12] = var7[var4.method461()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1028; var13++) {
				for (int var14 = 0; var14 < field1029; var14++) {
					field1027[field1028 * var14 + var13] = var7[var4.method461()];
				}
			}
		}
	}

	@ObfuscatedName("OMAKLDKI.c(I)V")
	public void method346() {
		DEVPLWNC.method159(field1027, field1028, field1029);
	}

	@ObfuscatedName("OMAKLDKI.a(IIII)V")
	public void method347(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1027.length; var4++) {
			int var5 = field1027[var4];
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

				field1027[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("OMAKLDKI.d(I)V")
	public void method348() {
		int[] var1 = new int[field1033 * field1032];
		for (int var2 = 0; var2 < field1029; var2++) {
			for (int var3 = 0; var3 < field1028; var3++) {
				var1[(field1031 + var2) * field1032 + field1030 + var3] = field1027[field1028 * var2 + var3];
			}
		}

		field1027 = var1;
		field1028 = field1032;
		field1029 = field1033;
		field1030 = 0;
		field1031 = 0;
	}

	@ObfuscatedName("OMAKLDKI.a(III)V")
	public void method349(int arg0, int arg1) {
		arg0 += field1030;
		arg1 += field1031;
		int var3 = DEVPLWNC.field525 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1029;
		int var6 = field1028;
		int var7 = DEVPLWNC.field525 - var6;
		int var8 = 0;

		if (arg1 < DEVPLWNC.field527) {
			int var9 = DEVPLWNC.field527 - arg1;
			var5 -= var9;
			arg1 = DEVPLWNC.field527;
			var4 += var6 * var9;
			var3 += DEVPLWNC.field525 * var9;
		}

		if (arg1 + var5 > DEVPLWNC.field528) {
			var5 -= arg1 + var5 - DEVPLWNC.field528;
		}

		if (arg0 < DEVPLWNC.field529) {
			int var10 = DEVPLWNC.field529 - arg0;
			var6 -= var10;
			arg0 = DEVPLWNC.field529;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > DEVPLWNC.field530) {
			int var11 = arg0 + var6 - DEVPLWNC.field530;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method350(var3, var7, var4, var8, field1027, var5, var6, DEVPLWNC.field524);
		}
	}

	@ObfuscatedName("OMAKLDKI.a(IIII[IIII[I)V")
	public void method350(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg7[arg0++] = arg4[arg2++];
				arg7[arg0++] = arg4[arg2++];
				arg7[arg0++] = arg4[arg2++];
				arg7[arg0++] = arg4[arg2++];
			}

			for (int var12 = arg6; var12 < 0; var12++) {
				arg7[arg0++] = arg4[arg2++];
			}

			arg0 += arg1;
			arg2 += arg3;
		}
	}

	@ObfuscatedName("OMAKLDKI.a(IIB)V")
	public void method351(int arg0, int arg1) {
		arg1 += field1030;
		arg0 += field1031;
		int var3 = DEVPLWNC.field525 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1029;
		int var6 = field1028;
		int var7 = DEVPLWNC.field525 - var6;
		int var8 = 0;

		if (arg0 < DEVPLWNC.field527) {
			int var9 = DEVPLWNC.field527 - arg0;
			var5 -= var9;
			arg0 = DEVPLWNC.field527;
			var4 += var6 * var9;
			var3 += DEVPLWNC.field525 * var9;
		}

		if (arg0 + var5 > DEVPLWNC.field528) {
			var5 -= arg0 + var5 - DEVPLWNC.field528;
		}

		if (arg1 < DEVPLWNC.field529) {
			int var10 = DEVPLWNC.field529 - arg1;
			var6 -= var10;
			arg1 = DEVPLWNC.field529;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > DEVPLWNC.field530) {
			int var11 = arg1 + var6 - DEVPLWNC.field530;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method352(DEVPLWNC.field524, field1027, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("OMAKLDKI.a([I[IIIIIIII)V")
	public void method352(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("OMAKLDKI.b(IIII)V")
	public void method353(int arg0, int arg1, int arg2) {
		arg1 += field1030;
		arg0 += field1031;
		int var4 = DEVPLWNC.field525 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1029;
		int var7 = field1028;
		int var8 = DEVPLWNC.field525 - var7;
		int var9 = 0;

		if (arg0 < DEVPLWNC.field527) {
			int var10 = DEVPLWNC.field527 - arg0;
			var6 -= var10;
			arg0 = DEVPLWNC.field527;
			var5 += var7 * var10;
			var4 += DEVPLWNC.field525 * var10;
		}

		if (arg0 + var6 > DEVPLWNC.field528) {
			var6 -= arg0 + var6 - DEVPLWNC.field528;
		}

		if (arg1 < DEVPLWNC.field529) {
			int var11 = DEVPLWNC.field529 - arg1;
			var7 -= var11;
			arg1 = DEVPLWNC.field529;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > DEVPLWNC.field530) {
			int var12 = arg1 + var7 - DEVPLWNC.field530;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method354(var7, var4, DEVPLWNC.field524, 0, var5, var6, var9, arg2, var8, field1027);
		}
	}

	@ObfuscatedName("OMAKLDKI.a(II[IIIIIIII[I)V")
	public void method354(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		int var11 = 256 - arg7;
		for (int var12 = -arg5; var12 < 0; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = arg9[arg4++];
				if (var14 == 0) {
					arg1++;
				} else {
					int var15 = arg2[arg1];
					arg2[arg1++] = ((var14 & 0xFF00FF) * arg7 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg7 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg1 += arg8;
			arg4 += arg6;
		}
	}

	@ObfuscatedName("OMAKLDKI.a(III[IIII[IIII)V")
	public void method355(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg0 / 2;
			int var12 = -arg7 / 2;
			int var13 = (int) (Math.sin(arg5 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg5 / 326.11D) * 65536.0D);
			var13 = arg8 * var13 >> 8;
			var14 = arg8 * var14 >> 8;
			int var15 = (arg3 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg9 << 16) + var12 * var14 - var11 * var13;
			int var17 = DEVPLWNC.field525 * arg1 + arg4;
			for (int var18 = 0; var18 < arg7; var18++) {
				int var19 = arg6[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg2[var18]; var23 < 0; var23++) {
					DEVPLWNC.field524[var20++] = field1027[(var21 >> 16) + (var22 >> 16) * field1028];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += DEVPLWNC.field525;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("OMAKLDKI.a(ZIIIIIDII)V")
	public void method356(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7) {
		try {
			int var10 = -arg3 / 2;
			int var11 = -arg2 / 2;
			int var12 = (int) (Math.sin(arg5) * 65536.0D);
			int var13 = (int) (Math.cos(arg5) * 65536.0D);
			var12 = arg6 * var12 >> 8;
			var13 = arg6 * var13 >> 8;
			int var14 = (arg0 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = DEVPLWNC.field525 * arg7 + arg1;
			for (int var17 = 0; var17 < arg2; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg3; var21 < 0; var21++) {
					int var22 = field1027[(var19 >> 16) + (var20 >> 16) * field1028];
					if (var22 == 0) {
						var18++;
					} else {
						DEVPLWNC.field524[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += DEVPLWNC.field525;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("OMAKLDKI.a(ZIILZXDQRRNS;)V")
	public void method357(int arg0, int arg1, ZXDQRRNS arg2) {
		arg1 += field1030;
		arg0 += field1031;
		int var4 = DEVPLWNC.field525 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1029;
		int var7 = field1028;
		int var8 = DEVPLWNC.field525 - var7;
		int var9 = 0;

		if (arg0 < DEVPLWNC.field527) {
			int var10 = DEVPLWNC.field527 - arg0;
			var6 -= var10;
			arg0 = DEVPLWNC.field527;
			var5 += var7 * var10;
			var4 += DEVPLWNC.field525 * var10;
		}

		if (arg0 + var6 > DEVPLWNC.field528) {
			var6 -= arg0 + var6 - DEVPLWNC.field528;
		}

		if (arg1 < DEVPLWNC.field529) {
			int var11 = DEVPLWNC.field529 - arg1;
			var7 -= var11;
			arg1 = DEVPLWNC.field529;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > DEVPLWNC.field530) {
			int var12 = arg1 + var7 - DEVPLWNC.field530;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method358(DEVPLWNC.field524, 0, var4, var6, arg2.field1508, var7, var5, field1027, var9, var8);
		}
	}

	@ObfuscatedName("OMAKLDKI.a([IIBII[BII[III)V")
	public void method358(int[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg7[arg6++];
				if (var14 != 0 && arg4[arg2] == 0) {
					arg0[arg2++] = var14;
				} else {
					arg2++;
				}

				int var15 = arg7[arg6++];
				if (var15 != 0 && arg4[arg2] == 0) {
					arg0[arg2++] = var15;
				} else {
					arg2++;
				}

				int var16 = arg7[arg6++];
				if (var16 != 0 && arg4[arg2] == 0) {
					arg0[arg2++] = var16;
				} else {
					arg2++;
				}

				int var17 = arg7[arg6++];
				if (var17 != 0 && arg4[arg2] == 0) {
					arg0[arg2++] = var17;
				} else {
					arg2++;
				}
			}

			for (int var18 = arg5; var18 < 0; var18++) {
				int var19 = arg7[arg6++];
				if (var19 != 0 && arg4[arg2] == 0) {
					arg0[arg2++] = var19;
				} else {
					arg2++;
				}
			}

			arg2 += arg9;
			arg6 += arg8;
		}
	}
}
