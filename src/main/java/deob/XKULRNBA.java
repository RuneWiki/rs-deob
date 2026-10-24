package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("XKULRNBA")
public final class XKULRNBA extends RSDCQVXF {

	@ObfuscatedName("XKULRNBA.J")
	public int[] field1360;

	@ObfuscatedName("XKULRNBA.O")
	public int field1365;

	@ObfuscatedName("XKULRNBA.K")
	public int field1361;

	@ObfuscatedName("XKULRNBA.P")
	public int field1366;

	@ObfuscatedName("XKULRNBA.L")
	public int field1362;

	@ObfuscatedName("XKULRNBA.N")
	public int field1364;

	@ObfuscatedName("XKULRNBA.M")
	public int field1363;

	public XKULRNBA(int arg0, int arg1) {
		field1360 = new int[arg0 * arg1];
		field1361 = field1365 = arg0;
		field1362 = field1366 = arg1;
		field1363 = field1364 = 0;
	}

	public XKULRNBA(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1361 = var3.getWidth(arg1);
			field1362 = var3.getHeight(arg1);
			field1365 = field1361;
			field1366 = field1362;
			field1363 = 0;
			field1364 = 0;
			field1360 = new int[field1362 * field1361];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1361, field1362, field1360, 0, field1361);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public XKULRNBA(DYBMLHQM arg0, String arg1, int arg2) {
		INLHDAGO var4 = new INLHDAGO(arg0.method248(arg1 + ".dat", null));
		INLHDAGO var5 = new INLHDAGO(arg0.method248("index.dat", null));
		var5.field969 = var4.method310();
		field1365 = var5.method310();
		field1366 = var5.method310();
		int var6 = var5.method308();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method312();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field969 += 2;
			var4.field969 += var5.method310() * var5.method310();
			var5.field969++;
		}

		field1363 = var5.method308();
		field1364 = var5.method308();
		field1361 = var5.method310();
		field1362 = var5.method310();
		int var10 = var5.method308();
		int var11 = field1362 * field1361;
		field1360 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1360[var12] = var7[var4.method308()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1361; var13++) {
				for (int var14 = 0; var14 < field1362; var14++) {
					field1360[field1361 * var14 + var13] = var7[var4.method308()];
				}
			}
		}
	}

	@ObfuscatedName("XKULRNBA.a(I)V")
	public void method509() {
		RSDCQVXF.method453(field1361, field1360, field1362);
	}

	@ObfuscatedName("XKULRNBA.a(IIII)V")
	public void method510(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1360.length; var4++) {
			int var5 = field1360[var4];
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

				field1360[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("XKULRNBA.b(I)V")
	public void method511() {
		int[] var1 = new int[field1366 * field1365];
		for (int var2 = 0; var2 < field1362; var2++) {
			for (int var3 = 0; var3 < field1361; var3++) {
				var1[(field1364 + var2) * field1365 + field1363 + var3] = field1360[field1361 * var2 + var3];
			}
		}

		field1360 = var1;
		field1361 = field1365;
		field1362 = field1366;
		field1363 = 0;
		field1364 = 0;
	}

	@ObfuscatedName("XKULRNBA.a(III)V")
	public void method512(int arg0, int arg1) {
		arg1 += field1363;
		arg0 += field1364;
		int var3 = RSDCQVXF.field1193 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1362;
		int var6 = field1361;
		int var7 = RSDCQVXF.field1193 - var6;
		int var8 = 0;

		if (arg0 < RSDCQVXF.field1195) {
			int var9 = RSDCQVXF.field1195 - arg0;
			var5 -= var9;
			arg0 = RSDCQVXF.field1195;
			var4 += var6 * var9;
			var3 += RSDCQVXF.field1193 * var9;
		}

		if (arg0 + var5 > RSDCQVXF.field1196) {
			var5 -= arg0 + var5 - RSDCQVXF.field1196;
		}

		if (arg1 < RSDCQVXF.field1197) {
			int var10 = RSDCQVXF.field1197 - arg1;
			var6 -= var10;
			arg1 = RSDCQVXF.field1197;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > RSDCQVXF.field1198) {
			int var11 = arg1 + var6 - RSDCQVXF.field1198;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method513(var3, var4, field1360, var8, RSDCQVXF.field1192, var6, var5, var7);
		}
	}

	@ObfuscatedName("XKULRNBA.a(II[II[IIIII)V")
	public void method513(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg4[arg0++] = arg2[arg1++];
				arg4[arg0++] = arg2[arg1++];
				arg4[arg0++] = arg2[arg1++];
				arg4[arg0++] = arg2[arg1++];
			}

			for (int var12 = arg5; var12 < 0; var12++) {
				arg4[arg0++] = arg2[arg1++];
			}

			arg0 += arg7;
			arg1 += arg3;
		}
	}

	@ObfuscatedName("XKULRNBA.a(IZI)V")
	public void method514(int arg0, int arg1) {
		arg1 += field1363;
		arg0 += field1364;
		int var3 = RSDCQVXF.field1193 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1362;
		int var6 = field1361;
		int var7 = RSDCQVXF.field1193 - var6;
		int var8 = 0;

		if (arg0 < RSDCQVXF.field1195) {
			int var9 = RSDCQVXF.field1195 - arg0;
			var5 -= var9;
			arg0 = RSDCQVXF.field1195;
			var4 += var6 * var9;
			var3 += RSDCQVXF.field1193 * var9;
		}

		if (arg0 + var5 > RSDCQVXF.field1196) {
			var5 -= arg0 + var5 - RSDCQVXF.field1196;
		}

		if (arg1 < RSDCQVXF.field1197) {
			int var10 = RSDCQVXF.field1197 - arg1;
			var6 -= var10;
			arg1 = RSDCQVXF.field1197;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > RSDCQVXF.field1198) {
			int var11 = arg1 + var6 - RSDCQVXF.field1198;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method515(RSDCQVXF.field1192, field1360, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("XKULRNBA.a([I[IIIIIIII)V")
	public void method515(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("XKULRNBA.a(BIII)V")
	public void method516(int arg0, int arg1, int arg2) {
		arg1 += field1363;
		arg0 += field1364;
		int var4 = RSDCQVXF.field1193 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1362;
		int var7 = field1361;
		int var8 = RSDCQVXF.field1193 - var7;
		int var9 = 0;

		if (arg0 < RSDCQVXF.field1195) {
			int var10 = RSDCQVXF.field1195 - arg0;
			var6 -= var10;
			arg0 = RSDCQVXF.field1195;
			var5 += var7 * var10;
			var4 += RSDCQVXF.field1193 * var10;
		}

		if (arg0 + var6 > RSDCQVXF.field1196) {
			var6 -= arg0 + var6 - RSDCQVXF.field1196;
		}

		if (arg1 < RSDCQVXF.field1197) {
			int var11 = RSDCQVXF.field1197 - arg1;
			var7 -= var11;
			arg1 = RSDCQVXF.field1197;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > RSDCQVXF.field1198) {
			int var12 = arg1 + var7 - RSDCQVXF.field1198;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method517(var6, var5, var8, var7, RSDCQVXF.field1192, 0, var9, field1360, arg2, var4);
		}
	}

	@ObfuscatedName("XKULRNBA.a(IIIII[III[III)V")
	public void method517(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg8;
		for (int var12 = -arg0; var12 < 0; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = arg7[arg1++];
				if (var14 == 0) {
					arg9++;
				} else {
					int var15 = arg4[arg9];
					arg4[arg9++] = ((var14 & 0xFF00FF) * arg8 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg8 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg9 += arg2;
			arg1 += arg6;
		}
	}

	@ObfuscatedName("XKULRNBA.a(IIIIII[IIZI[I)V")
	public void method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -arg1 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin(arg0 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg0 / 326.11D) * 65536.0D);
			var13 = arg7 * var13 >> 8;
			var14 = arg7 * var14 >> 8;
			int var15 = (arg8 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg5 << 16) + var12 * var14 - var11 * var13;
			int var17 = RSDCQVXF.field1193 * arg2 + arg4;
			for (int var18 = 0; var18 < arg3; var18++) {
				int var19 = arg9[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg6[var18]; var23 < 0; var23++) {
					RSDCQVXF.field1192[var20++] = field1360[(var21 >> 16) + (var22 >> 16) * field1361];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += RSDCQVXF.field1193;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("XKULRNBA.a(IIIDIIBII)V")
	public void method519(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg1 / 2;
			int var11 = -arg0 / 2;
			int var12 = (int) (Math.sin(arg3) * 65536.0D);
			int var13 = (int) (Math.cos(arg3) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg5 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg2 << 16) + var11 * var13 - var10 * var12;
			int var16 = RSDCQVXF.field1193 * arg7 + arg6;
			for (int var17 = 0; var17 < arg0; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg1; var21 < 0; var21++) {
					int var22 = field1360[(var19 >> 16) + (var20 >> 16) * field1361];
					if (var22 == 0) {
						var18++;
					} else {
						RSDCQVXF.field1192[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += RSDCQVXF.field1193;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("XKULRNBA.a(IILBKYZHYRW;I)V")
	public void method520(int arg0, BKYZHYRW arg1, int arg2) {
		arg0 += field1363;
		arg2 += field1364;
		int var4 = RSDCQVXF.field1193 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1362;
		int var7 = field1361;
		int var8 = RSDCQVXF.field1193 - var7;
		int var9 = 0;

		if (arg2 < RSDCQVXF.field1195) {
			int var10 = RSDCQVXF.field1195 - arg2;
			var6 -= var10;
			arg2 = RSDCQVXF.field1195;
			var5 += var7 * var10;
			var4 += RSDCQVXF.field1193 * var10;
		}

		if (arg2 + var6 > RSDCQVXF.field1196) {
			var6 -= arg2 + var6 - RSDCQVXF.field1196;
		}

		if (arg0 < RSDCQVXF.field1197) {
			int var11 = RSDCQVXF.field1197 - arg0;
			var7 -= var11;
			arg0 = RSDCQVXF.field1197;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > RSDCQVXF.field1198) {
			int var12 = arg0 + var7 - RSDCQVXF.field1198;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method521(var5, var9, 0, arg1.field27, var6, RSDCQVXF.field1192, field1360, var8, var4, var7);
		}
	}

	@ObfuscatedName("XKULRNBA.a(IIIB[BI[I[IIII)V")
	public void method521(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg9 >> 2);
		arg9 = -(arg9 & 0x3);
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg6[arg0++];
				if (var14 != 0 && arg3[arg8] == 0) {
					arg5[arg8++] = var14;
				} else {
					arg8++;
				}

				int var15 = arg6[arg0++];
				if (var15 != 0 && arg3[arg8] == 0) {
					arg5[arg8++] = var15;
				} else {
					arg8++;
				}

				int var16 = arg6[arg0++];
				if (var16 != 0 && arg3[arg8] == 0) {
					arg5[arg8++] = var16;
				} else {
					arg8++;
				}

				int var17 = arg6[arg0++];
				if (var17 != 0 && arg3[arg8] == 0) {
					arg5[arg8++] = var17;
				} else {
					arg8++;
				}
			}

			for (int var18 = arg9; var18 < 0; var18++) {
				int var19 = arg6[arg0++];
				if (var19 != 0 && arg3[arg8] == 0) {
					arg5[arg8++] = var19;
				} else {
					arg8++;
				}
			}

			arg8 += arg7;
			arg0 += arg1;
		}
	}
}
