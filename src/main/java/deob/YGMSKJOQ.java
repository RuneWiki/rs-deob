package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("YGMSKJOQ")
public final class YGMSKJOQ extends HQRNTLRZ {

	@ObfuscatedName("YGMSKJOQ.F")
	public int[] field1415;

	@ObfuscatedName("YGMSKJOQ.K")
	public int field1420;

	@ObfuscatedName("YGMSKJOQ.G")
	public int field1416;

	@ObfuscatedName("YGMSKJOQ.L")
	public int field1421;

	@ObfuscatedName("YGMSKJOQ.H")
	public int field1417;

	@ObfuscatedName("YGMSKJOQ.J")
	public int field1419;

	@ObfuscatedName("YGMSKJOQ.I")
	public int field1418;

	public YGMSKJOQ(int arg0, int arg1) {
		field1415 = new int[arg0 * arg1];
		field1416 = field1420 = arg0;
		field1417 = field1421 = arg1;
		field1418 = field1419 = 0;
	}

	public YGMSKJOQ(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1416 = var3.getWidth(arg1);
			field1417 = var3.getHeight(arg1);
			field1420 = field1416;
			field1421 = field1417;
			field1418 = 0;
			field1419 = 0;
			field1415 = new int[field1417 * field1416];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1416, field1417, field1415, 0, field1416);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public YGMSKJOQ(QKFGLETG arg0, String arg1, int arg2) {
		XJCNBMKS var4 = new XJCNBMKS(arg0.method402(arg1 + ".dat", null));
		XJCNBMKS var5 = new XJCNBMKS(arg0.method402("index.dat", null));
		var5.field1403 = var4.method536();
		field1420 = var5.method536();
		field1421 = var5.method536();
		int var6 = var5.method534();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method538();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1403 += 2;
			var4.field1403 += var5.method536() * var5.method536();
			var5.field1403++;
		}

		field1418 = var5.method534();
		field1419 = var5.method534();
		field1416 = var5.method536();
		field1417 = var5.method536();
		int var10 = var5.method534();
		int var11 = field1417 * field1416;
		field1415 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1415[var12] = var7[var4.method534()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1416; var13++) {
				for (int var14 = 0; var14 < field1417; var14++) {
					field1415[field1416 * var14 + var13] = var7[var4.method534()];
				}
			}
		}
	}

	@ObfuscatedName("YGMSKJOQ.c(I)V")
	public void method571() {
		HQRNTLRZ.method279(field1416, field1415, field1417);
	}

	@ObfuscatedName("YGMSKJOQ.a(IBII)V")
	public void method572(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1415.length; var4++) {
			int var5 = field1415[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg1;
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
				var8 += arg0;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field1415[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("YGMSKJOQ.d(I)V")
	public void method573() {
		int[] var1 = new int[field1421 * field1420];
		for (int var2 = 0; var2 < field1417; var2++) {
			for (int var3 = 0; var3 < field1416; var3++) {
				var1[(field1419 + var2) * field1420 + field1418 + var3] = field1415[field1416 * var2 + var3];
			}
		}

		field1415 = var1;
		field1416 = field1420;
		field1417 = field1421;
		field1418 = 0;
		field1419 = 0;
	}

	@ObfuscatedName("YGMSKJOQ.a(BII)V")
	public void method574(int arg0, int arg1) {
		arg0 += field1418;
		arg1 += field1419;
		int var3 = HQRNTLRZ.field737 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1417;
		int var6 = field1416;
		int var7 = HQRNTLRZ.field737 - var6;
		int var8 = 0;

		if (arg1 < HQRNTLRZ.field739) {
			int var9 = HQRNTLRZ.field739 - arg1;
			var5 -= var9;
			arg1 = HQRNTLRZ.field739;
			var4 += var6 * var9;
			var3 += HQRNTLRZ.field737 * var9;
		}

		if (arg1 + var5 > HQRNTLRZ.field740) {
			var5 -= arg1 + var5 - HQRNTLRZ.field740;
		}

		if (arg0 < HQRNTLRZ.field741) {
			int var10 = HQRNTLRZ.field741 - arg0;
			var6 -= var10;
			arg0 = HQRNTLRZ.field741;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > HQRNTLRZ.field742) {
			int var11 = arg0 + var6 - HQRNTLRZ.field742;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method575(var7, var5, HQRNTLRZ.field736, field1415, var3, var4, var6, var8);
		}
	}

	@ObfuscatedName("YGMSKJOQ.a(IIB[I[IIIII)V")
	public void method575(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var10 = -arg1; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg2[arg4++] = arg3[arg5++];
				arg2[arg4++] = arg3[arg5++];
				arg2[arg4++] = arg3[arg5++];
				arg2[arg4++] = arg3[arg5++];
			}

			for (int var12 = arg6; var12 < 0; var12++) {
				arg2[arg4++] = arg3[arg5++];
			}

			arg4 += arg0;
			arg5 += arg7;
		}
	}

	@ObfuscatedName("YGMSKJOQ.a(IIB)V")
	public void method576(int arg0, int arg1) {
		arg1 += field1418;
		arg0 += field1419;
		int var3 = HQRNTLRZ.field737 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1417;
		int var6 = field1416;
		int var7 = HQRNTLRZ.field737 - var6;
		int var8 = 0;

		if (arg0 < HQRNTLRZ.field739) {
			int var9 = HQRNTLRZ.field739 - arg0;
			var5 -= var9;
			arg0 = HQRNTLRZ.field739;
			var4 += var6 * var9;
			var3 += HQRNTLRZ.field737 * var9;
		}

		if (arg0 + var5 > HQRNTLRZ.field740) {
			var5 -= arg0 + var5 - HQRNTLRZ.field740;
		}

		if (arg1 < HQRNTLRZ.field741) {
			int var10 = HQRNTLRZ.field741 - arg1;
			var6 -= var10;
			arg1 = HQRNTLRZ.field741;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > HQRNTLRZ.field742) {
			int var11 = arg1 + var6 - HQRNTLRZ.field742;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method577(HQRNTLRZ.field736, field1415, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("YGMSKJOQ.a([I[IIIIIIII)V")
	public void method577(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("YGMSKJOQ.a(ZIII)V")
	public void method578(int arg0, int arg1, int arg2) {
		arg1 += field1418;
		arg0 += field1419;
		int var4 = HQRNTLRZ.field737 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1417;
		int var7 = field1416;
		int var8 = HQRNTLRZ.field737 - var7;
		int var9 = 0;

		if (arg0 < HQRNTLRZ.field739) {
			int var10 = HQRNTLRZ.field739 - arg0;
			var6 -= var10;
			arg0 = HQRNTLRZ.field739;
			var5 += var7 * var10;
			var4 += HQRNTLRZ.field737 * var10;
		}

		if (arg0 + var6 > HQRNTLRZ.field740) {
			var6 -= arg0 + var6 - HQRNTLRZ.field740;
		}

		if (arg1 < HQRNTLRZ.field741) {
			int var11 = HQRNTLRZ.field741 - arg1;
			var7 -= var11;
			arg1 = HQRNTLRZ.field741;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > HQRNTLRZ.field742) {
			int var12 = arg1 + var7 - HQRNTLRZ.field742;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method579(0, var5, var8, field1415, var6, var7, HQRNTLRZ.field736, var9, var4, arg2);
		}
	}

	@ObfuscatedName("YGMSKJOQ.a(IIII[III[IIII)V")
	public void method579(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg9;
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = arg3[arg1++];
				if (var14 == 0) {
					arg8++;
				} else {
					int var15 = arg6[arg8];
					arg6[arg8++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg8 += arg2;
			arg1 += arg7;
		}
	}

	@ObfuscatedName("YGMSKJOQ.a(I[IIIIII[IIII)V")
	public void method580(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg9 / 2;
			int var12 = -arg8 / 2;
			int var13 = (int) (Math.sin(arg7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg7 / 326.11D) * 65536.0D);
			var13 = arg2 * var13 >> 8;
			var14 = arg2 * var14 >> 8;
			int var15 = (arg5 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg0 << 16) + var12 * var14 - var11 * var13;
			int var17 = HQRNTLRZ.field737 * arg3 + arg4;
			for (int var18 = 0; var18 < arg8; var18++) {
				int var19 = arg1[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg6[var18]; var23 < 0; var23++) {
					HQRNTLRZ.field736[var20++] = field1415[(var21 >> 16) + (var22 >> 16) * field1416];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += HQRNTLRZ.field737;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("YGMSKJOQ.a(IDIIIBIII)V")
	public void method581(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg1) * 65536.0D);
			int var13 = (int) (Math.cos(arg1) * 65536.0D);
			var12 = arg7 * var12 >> 8;
			var13 = arg7 * var13 >> 8;
			int var14 = (arg0 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg6 << 16) + var11 * var13 - var10 * var12;
			int var16 = HQRNTLRZ.field737 * arg5 + arg4;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg2; var21 < 0; var21++) {
					int var22 = field1415[(var19 >> 16) + (var20 >> 16) * field1416];
					if (var22 == 0) {
						var18++;
					} else {
						HQRNTLRZ.field736[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += HQRNTLRZ.field737;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("YGMSKJOQ.a(LDEITBGVL;III)V")
	public void method582(DEITBGVL arg0, int arg1, int arg2) {
		arg2 += field1418;
		arg1 += field1419;
		int var4 = HQRNTLRZ.field737 * arg1 + arg2;
		int var5 = 0;
		int var6 = field1417;
		int var7 = field1416;
		int var8 = HQRNTLRZ.field737 - var7;
		int var9 = 0;

		if (arg1 < HQRNTLRZ.field739) {
			int var10 = HQRNTLRZ.field739 - arg1;
			var6 -= var10;
			arg1 = HQRNTLRZ.field739;
			var5 += var7 * var10;
			var4 += HQRNTLRZ.field737 * var10;
		}

		if (arg1 + var6 > HQRNTLRZ.field740) {
			var6 -= arg1 + var6 - HQRNTLRZ.field740;
		}

		if (arg2 < HQRNTLRZ.field741) {
			int var11 = HQRNTLRZ.field741 - arg2;
			var7 -= var11;
			arg2 = HQRNTLRZ.field741;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > HQRNTLRZ.field742) {
			int var12 = arg2 + var7 - HQRNTLRZ.field742;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method583(var8, var4, field1415, var5, var9, arg0.field541, var6, 0, var7, HQRNTLRZ.field736);
		}
	}

	@ObfuscatedName("YGMSKJOQ.a(IBI[III[BIII[I)V")
	public void method583(int arg0, int arg1, int[] arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8, int[] arg9) {
		int var11 = -(arg8 >> 2);
		arg8 = -(arg8 & 0x3);
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg2[arg3++];
				if (var14 != 0 && arg5[arg1] == 0) {
					arg9[arg1++] = var14;
				} else {
					arg1++;
				}

				int var15 = arg2[arg3++];
				if (var15 != 0 && arg5[arg1] == 0) {
					arg9[arg1++] = var15;
				} else {
					arg1++;
				}

				int var16 = arg2[arg3++];
				if (var16 != 0 && arg5[arg1] == 0) {
					arg9[arg1++] = var16;
				} else {
					arg1++;
				}

				int var17 = arg2[arg3++];
				if (var17 != 0 && arg5[arg1] == 0) {
					arg9[arg1++] = var17;
				} else {
					arg1++;
				}
			}

			for (int var18 = arg8; var18 < 0; var18++) {
				int var19 = arg2[arg3++];
				if (var19 != 0 && arg5[arg1] == 0) {
					arg9[arg1++] = var19;
				} else {
					arg1++;
				}
			}

			arg1 += arg0;
			arg3 += arg4;
		}
	}
}
