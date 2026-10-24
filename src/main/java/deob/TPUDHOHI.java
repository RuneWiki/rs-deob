package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("TPUDHOHI")
public final class TPUDHOHI extends MVOWZCMY {

	@ObfuscatedName("TPUDHOHI.E")
	public int[] field1255;

	@ObfuscatedName("TPUDHOHI.J")
	public int field1260;

	@ObfuscatedName("TPUDHOHI.F")
	public int field1256;

	@ObfuscatedName("TPUDHOHI.K")
	public int field1261;

	@ObfuscatedName("TPUDHOHI.G")
	public int field1257;

	@ObfuscatedName("TPUDHOHI.I")
	public int field1259;

	@ObfuscatedName("TPUDHOHI.H")
	public int field1258;

	public TPUDHOHI(int arg0, int arg1) {
		field1255 = new int[arg0 * arg1];
		field1256 = field1260 = arg0;
		field1257 = field1261 = arg1;
		field1258 = field1259 = 0;
	}

	public TPUDHOHI(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1256 = var3.getWidth(arg1);
			field1257 = var3.getHeight(arg1);
			field1260 = field1256;
			field1261 = field1257;
			field1258 = 0;
			field1259 = 0;
			field1255 = new int[field1257 * field1256];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1256, field1257, field1255, 0, field1256);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public TPUDHOHI(SXKKBWPU arg0, String arg1, int arg2) {
		TQYMAXSO var4 = new TQYMAXSO(arg0.method442(arg1 + ".dat", null));
		TQYMAXSO var5 = new TQYMAXSO(arg0.method442("index.dat", null));
		var5.field1263 = var4.method470();
		field1260 = var5.method470();
		field1261 = var5.method470();
		int var6 = var5.method468();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method472();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1263 += 2;
			var4.field1263 += var5.method470() * var5.method470();
			var5.field1263++;
		}

		field1258 = var5.method468();
		field1259 = var5.method468();
		field1256 = var5.method470();
		field1257 = var5.method470();
		int var10 = var5.method468();
		int var11 = field1257 * field1256;
		field1255 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1255[var12] = var7[var4.method468()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1256; var13++) {
				for (int var14 = 0; var14 < field1257; var14++) {
					field1255[field1256 * var14 + var13] = var7[var4.method468()];
				}
			}
		}
	}

	@ObfuscatedName("TPUDHOHI.a(B)V")
	public void method443() {
		MVOWZCMY.method340(field1257, field1256, field1255);
	}

	@ObfuscatedName("TPUDHOHI.a(IIII)V")
	public void method444(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1255.length; var4++) {
			int var5 = field1255[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg2;
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
				var8 += arg1;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field1255[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("TPUDHOHI.c(I)V")
	public void method445() {
		int[] var1 = new int[field1261 * field1260];
		for (int var2 = 0; var2 < field1257; var2++) {
			for (int var3 = 0; var3 < field1256; var3++) {
				var1[(field1259 + var2) * field1260 + field1258 + var3] = field1255[field1256 * var2 + var3];
			}
		}

		field1255 = var1;
		field1256 = field1260;
		field1257 = field1261;
		field1258 = 0;
		field1259 = 0;
	}

	@ObfuscatedName("TPUDHOHI.a(III)V")
	public void method446(int arg0, int arg1) {
		arg1 += field1258;
		arg0 += field1259;
		int var3 = MVOWZCMY.field978 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1257;
		int var6 = field1256;
		int var7 = MVOWZCMY.field978 - var6;
		int var8 = 0;

		if (arg0 < MVOWZCMY.field980) {
			int var9 = MVOWZCMY.field980 - arg0;
			var5 -= var9;
			arg0 = MVOWZCMY.field980;
			var4 += var6 * var9;
			var3 += MVOWZCMY.field978 * var9;
		}

		if (arg0 + var5 > MVOWZCMY.field981) {
			var5 -= arg0 + var5 - MVOWZCMY.field981;
		}

		if (arg1 < MVOWZCMY.field982) {
			int var10 = MVOWZCMY.field982 - arg1;
			var6 -= var10;
			arg1 = MVOWZCMY.field982;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > MVOWZCMY.field983) {
			int var11 = arg1 + var6 - MVOWZCMY.field983;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method447(var5, MVOWZCMY.field977, field1255, var3, var7, var6, var4, var8);
		}
	}

	@ObfuscatedName("TPUDHOHI.a(I[I[IIIIIII)V")
	public void method447(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var10 = -arg0; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg3++] = arg2[arg6++];
				arg1[arg3++] = arg2[arg6++];
				arg1[arg3++] = arg2[arg6++];
				arg1[arg3++] = arg2[arg6++];
			}

			for (int var12 = arg5; var12 < 0; var12++) {
				arg1[arg3++] = arg2[arg6++];
			}

			arg3 += arg4;
			arg6 += arg7;
		}
	}

	@ObfuscatedName("TPUDHOHI.b(III)V")
	public void method448(int arg0, int arg1) {
		arg0 += field1258;
		arg1 += field1259;
		int var3 = MVOWZCMY.field978 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1257;
		int var6 = field1256;
		int var7 = MVOWZCMY.field978 - var6;
		int var8 = 0;

		if (arg1 < MVOWZCMY.field980) {
			int var9 = MVOWZCMY.field980 - arg1;
			var5 -= var9;
			arg1 = MVOWZCMY.field980;
			var4 += var6 * var9;
			var3 += MVOWZCMY.field978 * var9;
		}

		if (arg1 + var5 > MVOWZCMY.field981) {
			var5 -= arg1 + var5 - MVOWZCMY.field981;
		}

		if (arg0 < MVOWZCMY.field982) {
			int var10 = MVOWZCMY.field982 - arg0;
			var6 -= var10;
			arg0 = MVOWZCMY.field982;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > MVOWZCMY.field983) {
			int var11 = arg0 + var6 - MVOWZCMY.field983;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method449(MVOWZCMY.field977, field1255, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("TPUDHOHI.a([I[IIIIIIII)V")
	public void method449(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("TPUDHOHI.a(IIIZ)V")
	public void method450(int arg0, int arg1, int arg2) {
		arg1 += field1258;
		arg0 += field1259;
		int var4 = MVOWZCMY.field978 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1257;
		int var7 = field1256;
		int var8 = MVOWZCMY.field978 - var7;
		int var9 = 0;

		if (arg0 < MVOWZCMY.field980) {
			int var10 = MVOWZCMY.field980 - arg0;
			var6 -= var10;
			arg0 = MVOWZCMY.field980;
			var5 += var7 * var10;
			var4 += MVOWZCMY.field978 * var10;
		}

		if (arg0 + var6 > MVOWZCMY.field981) {
			var6 -= arg0 + var6 - MVOWZCMY.field981;
		}

		if (arg1 < MVOWZCMY.field982) {
			int var11 = MVOWZCMY.field982 - arg1;
			var7 -= var11;
			arg1 = MVOWZCMY.field982;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > MVOWZCMY.field983) {
			int var12 = arg1 + var7 - MVOWZCMY.field983;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method451(var8, var5, field1255, var6, MVOWZCMY.field977, arg2, var7, var9, 0, var4);
		}
	}

	@ObfuscatedName("TPUDHOHI.a(II[II[IIIIIII)V")
	public void method451(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg5;
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = -arg6; var13 < 0; var13++) {
				int var14 = arg2[arg1++];
				if (var14 == 0) {
					arg9++;
				} else {
					int var15 = arg4[arg9];
					arg4[arg9++] = ((var14 & 0xFF00FF) * arg5 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg5 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg9 += arg0;
			arg1 += arg7;
		}
	}

	@ObfuscatedName("TPUDHOHI.a(I[IIIIIIIB[II)V")
	public void method452(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		try {
			int var11 = -arg5 / 2;
			int var12 = -arg4 / 2;
			int var13 = (int) (Math.sin(arg9 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg9 / 326.11D) * 65536.0D);
			var13 = arg3 * var13 >> 8;
			var14 = arg3 * var14 >> 8;
			int var15 = (arg2 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg6 << 16) + var12 * var14 - var11 * var13;
			int var17 = MVOWZCMY.field978 * arg7 + arg0;
			for (int var18 = 0; var18 < arg4; var18++) {
				int var19 = arg1[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg8[var18]; var23 < 0; var23++) {
					MVOWZCMY.field977[var20++] = field1255[(var21 >> 16) + (var22 >> 16) * field1256];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += MVOWZCMY.field978;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("TPUDHOHI.a(IIIDIIIII)V")
	public void method453(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg0 / 2;
			int var11 = -arg4 / 2;
			int var12 = (int) (Math.sin(arg3) * 65536.0D);
			int var13 = (int) (Math.cos(arg3) * 65536.0D);
			var12 = arg1 * var12 >> 8;
			var13 = arg1 * var13 >> 8;
			int var14 = (arg7 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg2 << 16) + var11 * var13 - var10 * var12;
			int var16 = MVOWZCMY.field978 * arg6 + arg5;
			for (int var17 = 0; var17 < arg4; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg0; var21 < 0; var21++) {
					int var22 = field1255[(var19 >> 16) + (var20 >> 16) * field1256];
					if (var22 == 0) {
						var18++;
					} else {
						MVOWZCMY.field977[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += MVOWZCMY.field978;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("TPUDHOHI.a(IILVCTXURSE;B)V")
	public void method454(int arg0, int arg1, VCTXURSE arg2) {
		arg1 += field1258;
		arg0 += field1259;
		int var4 = MVOWZCMY.field978 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1257;
		int var7 = field1256;
		int var8 = MVOWZCMY.field978 - var7;
		int var9 = 0;

		if (arg0 < MVOWZCMY.field980) {
			int var10 = MVOWZCMY.field980 - arg0;
			var6 -= var10;
			arg0 = MVOWZCMY.field980;
			var5 += var7 * var10;
			var4 += MVOWZCMY.field978 * var10;
		}

		if (arg0 + var6 > MVOWZCMY.field981) {
			var6 -= arg0 + var6 - MVOWZCMY.field981;
		}

		if (arg1 < MVOWZCMY.field982) {
			int var11 = MVOWZCMY.field982 - arg1;
			var7 -= var11;
			arg1 = MVOWZCMY.field982;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > MVOWZCMY.field983) {
			int var12 = arg1 + var7 - MVOWZCMY.field983;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method455(var9, 0, var4, var8, var5, field1255, arg2.field1312, var7, var6, MVOWZCMY.field977);
		}
	}

	@ObfuscatedName("TPUDHOHI.a(IIIIII[I[BII[I)V")
	public void method455(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte[] arg6, int arg7, int arg8, int[] arg9) {
		int var11 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg5[arg4++];
				if (var14 != 0 && arg6[arg2] == 0) {
					arg9[arg2++] = var14;
				} else {
					arg2++;
				}

				int var15 = arg5[arg4++];
				if (var15 != 0 && arg6[arg2] == 0) {
					arg9[arg2++] = var15;
				} else {
					arg2++;
				}

				int var16 = arg5[arg4++];
				if (var16 != 0 && arg6[arg2] == 0) {
					arg9[arg2++] = var16;
				} else {
					arg2++;
				}

				int var17 = arg5[arg4++];
				if (var17 != 0 && arg6[arg2] == 0) {
					arg9[arg2++] = var17;
				} else {
					arg2++;
				}
			}

			for (int var18 = arg7; var18 < 0; var18++) {
				int var19 = arg5[arg4++];
				if (var19 != 0 && arg6[arg2] == 0) {
					arg9[arg2++] = var19;
				} else {
					arg2++;
				}
			}

			arg2 += arg3;
			arg4 += arg0;
		}
	}
}
