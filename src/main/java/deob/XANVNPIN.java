package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("XANVNPIN")
public final class XANVNPIN extends VDGJUQAS {

	@ObfuscatedName("XANVNPIN.H")
	public int[] field1392;

	@ObfuscatedName("XANVNPIN.M")
	public int field1397;

	@ObfuscatedName("XANVNPIN.I")
	public int field1393;

	@ObfuscatedName("XANVNPIN.N")
	public int field1398;

	@ObfuscatedName("XANVNPIN.J")
	public int field1394;

	@ObfuscatedName("XANVNPIN.L")
	public int field1396;

	@ObfuscatedName("XANVNPIN.K")
	public int field1395;

	public XANVNPIN(int arg0, int arg1) {
		field1392 = new int[arg0 * arg1];
		field1393 = field1397 = arg0;
		field1394 = field1398 = arg1;
		field1395 = field1396 = 0;
	}

	public XANVNPIN(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1393 = var3.getWidth(arg1);
			field1394 = var3.getHeight(arg1);
			field1397 = field1393;
			field1398 = field1394;
			field1395 = 0;
			field1396 = 0;
			field1392 = new int[field1394 * field1393];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1393, field1394, field1392, 0, field1393);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public XANVNPIN(FNOQZAYQ arg0, String arg1, int arg2) {
		DNRIFKTO var4 = new DNRIFKTO(arg0.method246(arg1 + ".dat", null));
		DNRIFKTO var5 = new DNRIFKTO(arg0.method246("index.dat", null));
		var5.field563 = var4.method191();
		field1397 = var5.method191();
		field1398 = var5.method191();
		int var6 = var5.method189();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method193();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field563 += 2;
			var4.field563 += var5.method191() * var5.method191();
			var5.field563++;
		}

		field1395 = var5.method189();
		field1396 = var5.method189();
		field1393 = var5.method191();
		field1394 = var5.method191();
		int var10 = var5.method189();
		int var11 = field1394 * field1393;
		field1392 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1392[var12] = var7[var4.method189()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1393; var13++) {
				for (int var14 = 0; var14 < field1394; var14++) {
					field1392[field1393 * var14 + var13] = var7[var4.method189()];
				}
			}
		}
	}

	@ObfuscatedName("XANVNPIN.b(I)V")
	public void method524() {
		VDGJUQAS.method512(field1392, field1394, field1393);
	}

	@ObfuscatedName("XANVNPIN.a(IIII)V")
	public void method525(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1392.length; var4++) {
			int var5 = field1392[var4];
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

				field1392[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("XANVNPIN.c(I)V")
	public void method526() {
		int[] var1 = new int[field1398 * field1397];
		for (int var2 = 0; var2 < field1394; var2++) {
			for (int var3 = 0; var3 < field1393; var3++) {
				var1[(field1396 + var2) * field1397 + field1395 + var3] = field1392[field1393 * var2 + var3];
			}
		}

		field1392 = var1;
		field1393 = field1397;
		field1394 = field1398;
		field1395 = 0;
		field1396 = 0;
	}

	@ObfuscatedName("XANVNPIN.a(BII)V")
	public void method527(int arg0, int arg1) {
		arg0 += field1395;
		arg1 += field1396;
		int var3 = VDGJUQAS.field1312 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1394;
		int var6 = field1393;
		int var7 = VDGJUQAS.field1312 - var6;
		int var8 = 0;

		if (arg1 < VDGJUQAS.field1314) {
			int var9 = VDGJUQAS.field1314 - arg1;
			var5 -= var9;
			arg1 = VDGJUQAS.field1314;
			var4 += var6 * var9;
			var3 += VDGJUQAS.field1312 * var9;
		}

		if (arg1 + var5 > VDGJUQAS.field1315) {
			var5 -= arg1 + var5 - VDGJUQAS.field1315;
		}

		if (arg0 < VDGJUQAS.field1316) {
			int var10 = VDGJUQAS.field1316 - arg0;
			var6 -= var10;
			arg0 = VDGJUQAS.field1316;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > VDGJUQAS.field1317) {
			int var11 = arg0 + var6 - VDGJUQAS.field1317;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method528(var7, VDGJUQAS.field1311, var5, var8, var4, field1392, var3, var6);
		}
	}

	@ObfuscatedName("XANVNPIN.a(I[IIII[IIIB)V")
	public void method528(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
		int var9 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var10 = -arg2; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg6++] = arg5[arg4++];
				arg1[arg6++] = arg5[arg4++];
				arg1[arg6++] = arg5[arg4++];
				arg1[arg6++] = arg5[arg4++];
			}

			for (int var12 = arg7; var12 < 0; var12++) {
				arg1[arg6++] = arg5[arg4++];
			}

			arg6 += arg0;
			arg4 += arg3;
		}
	}

	@ObfuscatedName("XANVNPIN.b(BII)V")
	public void method529(int arg0, int arg1) {
		arg0 += field1395;
		arg1 += field1396;
		int var3 = VDGJUQAS.field1312 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1394;
		int var6 = field1393;
		int var7 = VDGJUQAS.field1312 - var6;
		int var8 = 0;

		if (arg1 < VDGJUQAS.field1314) {
			int var9 = VDGJUQAS.field1314 - arg1;
			var5 -= var9;
			arg1 = VDGJUQAS.field1314;
			var4 += var6 * var9;
			var3 += VDGJUQAS.field1312 * var9;
		}

		if (arg1 + var5 > VDGJUQAS.field1315) {
			var5 -= arg1 + var5 - VDGJUQAS.field1315;
		}

		if (arg0 < VDGJUQAS.field1316) {
			int var10 = VDGJUQAS.field1316 - arg0;
			var6 -= var10;
			arg0 = VDGJUQAS.field1316;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > VDGJUQAS.field1317) {
			int var11 = arg0 + var6 - VDGJUQAS.field1317;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method530(VDGJUQAS.field1311, field1392, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("XANVNPIN.a([I[IIIIIIII)V")
	public void method530(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("XANVNPIN.a(ZIII)V")
	public void method531(int arg0, int arg1, int arg2) {
		arg0 += field1395;
		arg1 += field1396;
		int var4 = VDGJUQAS.field1312 * arg1 + arg0;
		int var5 = 0;
		int var6 = field1394;
		int var7 = field1393;
		int var8 = VDGJUQAS.field1312 - var7;
		int var9 = 0;

		if (arg1 < VDGJUQAS.field1314) {
			int var10 = VDGJUQAS.field1314 - arg1;
			var6 -= var10;
			arg1 = VDGJUQAS.field1314;
			var5 += var7 * var10;
			var4 += VDGJUQAS.field1312 * var10;
		}

		if (arg1 + var6 > VDGJUQAS.field1315) {
			var6 -= arg1 + var6 - VDGJUQAS.field1315;
		}

		if (arg0 < VDGJUQAS.field1316) {
			int var11 = VDGJUQAS.field1316 - arg0;
			var7 -= var11;
			arg0 = VDGJUQAS.field1316;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > VDGJUQAS.field1317) {
			int var12 = arg0 + var7 - VDGJUQAS.field1317;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method532(var6, var8, var7, field1392, arg2, var4, var5, var9, VDGJUQAS.field1311, 0);
		}
	}

	@ObfuscatedName("XANVNPIN.a(III[IIBIII[II)V")
	public void method532(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		int var11 = 256 - arg4;
		for (int var12 = -arg0; var12 < 0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = arg3[arg6++];
				if (var14 == 0) {
					arg5++;
				} else {
					int var15 = arg8[arg5];
					arg8[arg5++] = ((var14 & 0xFF00FF) * arg4 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg4 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg5 += arg1;
			arg6 += arg7;
		}
	}

	@ObfuscatedName("XANVNPIN.a(IIIII[I[IIIII)V")
	public void method533(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg0 / 2;
			int var12 = -arg9 / 2;
			int var13 = (int) (Math.sin(arg3 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg3 / 326.11D) * 65536.0D);
			var13 = arg2 * var13 >> 8;
			var14 = arg2 * var14 >> 8;
			int var15 = (arg4 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg1 << 16) + var12 * var14 - var11 * var13;
			int var17 = VDGJUQAS.field1312 * arg8 + arg7;
			for (int var18 = 0; var18 < arg9; var18++) {
				int var19 = arg6[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg5[var18]; var23 < 0; var23++) {
					VDGJUQAS.field1311[var20++] = field1392[(var21 >> 16) + (var22 >> 16) * field1393];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += VDGJUQAS.field1312;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("XANVNPIN.a(IIIIIBDII)V")
	public void method534(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg7 / 2;
			int var12 = (int) (Math.sin(arg5) * 65536.0D);
			int var13 = (int) (Math.cos(arg5) * 65536.0D);
			var12 = arg0 * var12 >> 8;
			var13 = arg0 * var13 >> 8;
			int var14 = (arg2 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg1 << 16) + var11 * var13 - var10 * var12;
			int var16 = VDGJUQAS.field1312 * arg4 + arg3;
			for (int var17 = 0; var17 < arg7; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field1392[(var19 >> 16) + (var20 >> 16) * field1393];
					if (var22 == 0) {
						var18++;
					} else {
						VDGJUQAS.field1311[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += VDGJUQAS.field1312;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("XANVNPIN.a(LPQKEJITK;III)V")
	public void method535(PQKEJITK arg0, int arg1, int arg2) {
		arg2 += field1395;
		arg1 += field1396;
		int var4 = VDGJUQAS.field1312 * arg1 + arg2;
		int var5 = 0;
		int var6 = field1394;
		int var7 = field1393;
		int var8 = VDGJUQAS.field1312 - var7;
		int var9 = 0;

		if (arg1 < VDGJUQAS.field1314) {
			int var10 = VDGJUQAS.field1314 - arg1;
			var6 -= var10;
			arg1 = VDGJUQAS.field1314;
			var5 += var7 * var10;
			var4 += VDGJUQAS.field1312 * var10;
		}

		if (arg1 + var6 > VDGJUQAS.field1315) {
			var6 -= arg1 + var6 - VDGJUQAS.field1315;
		}

		if (arg2 < VDGJUQAS.field1316) {
			int var11 = VDGJUQAS.field1316 - arg2;
			var7 -= var11;
			arg2 = VDGJUQAS.field1316;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > VDGJUQAS.field1317) {
			int var12 = arg2 + var7 - VDGJUQAS.field1317;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method536(0, var6, var7, arg0.field1094, VDGJUQAS.field1311, var5, var4, var9, field1392, var8);
		}
	}

	@ObfuscatedName("XANVNPIN.a(IIII[B[IIII[II)V")
	public void method536(int arg0, int arg1, int arg2, byte[] arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		int var11 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg8[arg5++];
				if (var14 != 0 && arg3[arg6] == 0) {
					arg4[arg6++] = var14;
				} else {
					arg6++;
				}

				int var15 = arg8[arg5++];
				if (var15 != 0 && arg3[arg6] == 0) {
					arg4[arg6++] = var15;
				} else {
					arg6++;
				}

				int var16 = arg8[arg5++];
				if (var16 != 0 && arg3[arg6] == 0) {
					arg4[arg6++] = var16;
				} else {
					arg6++;
				}

				int var17 = arg8[arg5++];
				if (var17 != 0 && arg3[arg6] == 0) {
					arg4[arg6++] = var17;
				} else {
					arg6++;
				}
			}

			for (int var18 = arg2; var18 < 0; var18++) {
				int var19 = arg8[arg5++];
				if (var19 != 0 && arg3[arg6] == 0) {
					arg4[arg6++] = var19;
				} else {
					arg6++;
				}
			}

			arg6 += arg9;
			arg5 += arg7;
		}
	}
}
