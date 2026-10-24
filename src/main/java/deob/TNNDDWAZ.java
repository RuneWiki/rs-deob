package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("TNNDDWAZ")
public final class TNNDDWAZ extends OMVHXJFV {

	@ObfuscatedName("TNNDDWAZ.G")
	public int[] field1274;

	@ObfuscatedName("TNNDDWAZ.L")
	public int field1279;

	@ObfuscatedName("TNNDDWAZ.H")
	public int field1275;

	@ObfuscatedName("TNNDDWAZ.M")
	public int field1280;

	@ObfuscatedName("TNNDDWAZ.I")
	public int field1276;

	@ObfuscatedName("TNNDDWAZ.K")
	public int field1278;

	@ObfuscatedName("TNNDDWAZ.J")
	public int field1277;

	public TNNDDWAZ(int arg0, int arg1) {
		field1274 = new int[arg0 * arg1];
		field1275 = field1279 = arg0;
		field1276 = field1280 = arg1;
		field1277 = field1278 = 0;
	}

	public TNNDDWAZ(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1275 = var3.getWidth(arg1);
			field1276 = var3.getHeight(arg1);
			field1279 = field1275;
			field1280 = field1276;
			field1277 = 0;
			field1278 = 0;
			field1274 = new int[field1276 * field1275];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1275, field1276, field1274, 0, field1275);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public TNNDDWAZ(SYUGXMZF arg0, String arg1, int arg2) {
		KHOMSBHW var4 = new KHOMSBHW(arg0.method551(arg1 + ".dat", null));
		KHOMSBHW var5 = new KHOMSBHW(arg0.method551("index.dat", null));
		var5.field934 = var4.method351();
		field1279 = var5.method351();
		field1280 = var5.method351();
		int var6 = var5.method349();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method353();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field934 += 2;
			var4.field934 += var5.method351() * var5.method351();
			var5.field934++;
		}

		field1277 = var5.method349();
		field1278 = var5.method349();
		field1275 = var5.method351();
		field1276 = var5.method351();
		int var10 = var5.method349();
		int var11 = field1276 * field1275;
		field1274 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1274[var12] = var7[var4.method349()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1275; var13++) {
				for (int var14 = 0; var14 < field1276; var14++) {
					field1274[field1275 * var14 + var13] = var7[var4.method349()];
				}
			}
		}
	}

	@ObfuscatedName("TNNDDWAZ.a(Z)V")
	public void method553() {
		OMVHXJFV.method415(field1274, field1276, field1275);
	}

	@ObfuscatedName("TNNDDWAZ.a(IIBI)V")
	public void method554(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1274.length; var4++) {
			int var5 = field1274[var4];
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

				field1274[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("TNNDDWAZ.c(I)V")
	public void method555() {
		int[] var1 = new int[field1280 * field1279];
		for (int var2 = 0; var2 < field1276; var2++) {
			for (int var3 = 0; var3 < field1275; var3++) {
				var1[(field1278 + var2) * field1279 + field1277 + var3] = field1274[field1275 * var2 + var3];
			}
		}

		field1274 = var1;
		field1275 = field1279;
		field1276 = field1280;
		field1277 = 0;
		field1278 = 0;
	}

	@ObfuscatedName("TNNDDWAZ.a(BII)V")
	public void method556(int arg0, int arg1) {
		arg0 += field1277;
		arg1 += field1278;
		int var3 = OMVHXJFV.field1050 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1276;
		int var6 = field1275;
		int var7 = OMVHXJFV.field1050 - var6;
		int var8 = 0;

		if (arg1 < OMVHXJFV.field1052) {
			int var9 = OMVHXJFV.field1052 - arg1;
			var5 -= var9;
			arg1 = OMVHXJFV.field1052;
			var4 += var6 * var9;
			var3 += OMVHXJFV.field1050 * var9;
		}

		if (arg1 + var5 > OMVHXJFV.field1053) {
			var5 -= arg1 + var5 - OMVHXJFV.field1053;
		}

		if (arg0 < OMVHXJFV.field1054) {
			int var10 = OMVHXJFV.field1054 - arg0;
			var6 -= var10;
			arg0 = OMVHXJFV.field1054;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > OMVHXJFV.field1055) {
			int var11 = arg0 + var6 - OMVHXJFV.field1055;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method557(var6, field1274, var4, var7, var5, OMVHXJFV.field1049, var3, var8);
		}
	}

	@ObfuscatedName("TNNDDWAZ.a(I[IIII[IIII)V")
	public void method557(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg4; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg5[arg6++] = arg1[arg2++];
				arg5[arg6++] = arg1[arg2++];
				arg5[arg6++] = arg1[arg2++];
				arg5[arg6++] = arg1[arg2++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg5[arg6++] = arg1[arg2++];
			}

			arg6 += arg3;
			arg2 += arg7;
		}
	}

	@ObfuscatedName("TNNDDWAZ.a(IIB)V")
	public void method558(int arg0, int arg1) {
		arg1 += field1277;
		arg0 += field1278;
		int var3 = OMVHXJFV.field1050 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1276;
		int var6 = field1275;
		int var7 = OMVHXJFV.field1050 - var6;
		int var8 = 0;

		if (arg0 < OMVHXJFV.field1052) {
			int var9 = OMVHXJFV.field1052 - arg0;
			var5 -= var9;
			arg0 = OMVHXJFV.field1052;
			var4 += var6 * var9;
			var3 += OMVHXJFV.field1050 * var9;
		}

		if (arg0 + var5 > OMVHXJFV.field1053) {
			var5 -= arg0 + var5 - OMVHXJFV.field1053;
		}

		if (arg1 < OMVHXJFV.field1054) {
			int var10 = OMVHXJFV.field1054 - arg1;
			var6 -= var10;
			arg1 = OMVHXJFV.field1054;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > OMVHXJFV.field1055) {
			int var11 = arg1 + var6 - OMVHXJFV.field1055;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method559(OMVHXJFV.field1049, field1274, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("TNNDDWAZ.a([I[IIIIIIII)V")
	public void method559(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("TNNDDWAZ.a(IIII)V")
	public void method560(int arg0, int arg1, int arg2) {
		arg1 += field1277;
		arg2 += field1278;
		int var4 = OMVHXJFV.field1050 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1276;
		int var7 = field1275;
		int var8 = OMVHXJFV.field1050 - var7;
		int var9 = 0;

		if (arg2 < OMVHXJFV.field1052) {
			int var10 = OMVHXJFV.field1052 - arg2;
			var6 -= var10;
			arg2 = OMVHXJFV.field1052;
			var5 += var7 * var10;
			var4 += OMVHXJFV.field1050 * var10;
		}

		if (arg2 + var6 > OMVHXJFV.field1053) {
			var6 -= arg2 + var6 - OMVHXJFV.field1053;
		}

		if (arg1 < OMVHXJFV.field1054) {
			int var11 = OMVHXJFV.field1054 - arg1;
			var7 -= var11;
			arg1 = OMVHXJFV.field1054;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > OMVHXJFV.field1055) {
			int var12 = arg1 + var7 - OMVHXJFV.field1055;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method561(OMVHXJFV.field1049, var4, var9, var5, var6, var7, field1274, 0, arg0, var8);
		}
	}

	@ObfuscatedName("TNNDDWAZ.a([IBIIIII[IIII)V")
	public void method561(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg8;
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = arg6[arg3++];
				if (var14 == 0) {
					arg1++;
				} else {
					int var15 = arg0[arg1];
					arg0[arg1++] = ((var14 & 0xFF00FF) * arg8 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg8 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg1 += arg9;
			arg3 += arg2;
		}
	}

	@ObfuscatedName("TNNDDWAZ.a(IIII[IIIIII[I)V")
	public void method562(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -arg1 / 2;
			int var12 = -arg2 / 2;
			int var13 = (int) (Math.sin(arg7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg7 / 326.11D) * 65536.0D);
			var13 = arg6 * var13 >> 8;
			var14 = arg6 * var14 >> 8;
			int var15 = (arg5 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg8 << 16) + var12 * var14 - var11 * var13;
			int var17 = OMVHXJFV.field1050 * arg0 + arg4;
			for (int var18 = 0; var18 < arg2; var18++) {
				int var19 = arg9[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg3[var18]; var23 < 0; var23++) {
					OMVHXJFV.field1049[var20++] = field1274[(var21 >> 16) + (var22 >> 16) * field1275];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += OMVHXJFV.field1050;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("TNNDDWAZ.a(DBIIIIIII)V")
	public void method563(double arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg4 / 2;
			int var12 = (int) (Math.sin(arg0) * 65536.0D);
			int var13 = (int) (Math.cos(arg0) * 65536.0D);
			var12 = arg3 * var12 >> 8;
			var13 = arg3 * var13 >> 8;
			int var14 = (arg6 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg7 << 16) + var11 * var13 - var10 * var12;
			int var16 = OMVHXJFV.field1050 * arg1 + arg5;
			for (int var17 = 0; var17 < arg4; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg2; var21 < 0; var21++) {
					int var22 = field1274[(var19 >> 16) + (var20 >> 16) * field1275];
					if (var22 == 0) {
						var18++;
					} else {
						OMVHXJFV.field1049[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += OMVHXJFV.field1050;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("TNNDDWAZ.a(LGLPEJJEY;III)V")
	public void method564(GLPEJJEY arg0, int arg1, int arg2) {
		arg2 += field1277;
		arg1 += field1278;
		int var4 = OMVHXJFV.field1050 * arg1 + arg2;
		int var5 = 0;
		int var6 = field1276;
		int var7 = field1275;
		int var8 = OMVHXJFV.field1050 - var7;
		int var9 = 0;

		if (arg1 < OMVHXJFV.field1052) {
			int var10 = OMVHXJFV.field1052 - arg1;
			var6 -= var10;
			arg1 = OMVHXJFV.field1052;
			var5 += var7 * var10;
			var4 += OMVHXJFV.field1050 * var10;
		}

		if (arg1 + var6 > OMVHXJFV.field1053) {
			var6 -= arg1 + var6 - OMVHXJFV.field1053;
		}

		if (arg2 < OMVHXJFV.field1054) {
			int var11 = OMVHXJFV.field1054 - arg2;
			var7 -= var11;
			arg2 = OMVHXJFV.field1054;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > OMVHXJFV.field1055) {
			int var12 = arg2 + var7 - OMVHXJFV.field1055;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method565(OMVHXJFV.field1049, var4, var6, var5, 0, arg0.field786, var9, var7, field1274, var8);
		}
	}

	@ObfuscatedName("TNNDDWAZ.a([IIIII[BII[III)V")
	public void method565(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int[] arg8, int arg9) {
		int var11 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg8[arg3++];
				if (var14 != 0 && arg5[arg1] == 0) {
					arg0[arg1++] = var14;
				} else {
					arg1++;
				}

				int var15 = arg8[arg3++];
				if (var15 != 0 && arg5[arg1] == 0) {
					arg0[arg1++] = var15;
				} else {
					arg1++;
				}

				int var16 = arg8[arg3++];
				if (var16 != 0 && arg5[arg1] == 0) {
					arg0[arg1++] = var16;
				} else {
					arg1++;
				}

				int var17 = arg8[arg3++];
				if (var17 != 0 && arg5[arg1] == 0) {
					arg0[arg1++] = var17;
				} else {
					arg1++;
				}
			}

			for (int var18 = arg7; var18 < 0; var18++) {
				int var19 = arg8[arg3++];
				if (var19 != 0 && arg5[arg1] == 0) {
					arg0[arg1++] = var19;
				} else {
					arg1++;
				}
			}

			arg1 += arg9;
			arg3 += arg6;
		}
	}
}
