package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("ZSWNSCUQ")
public final class ZSWNSCUQ extends WNEQSCWL {

	@ObfuscatedName("ZSWNSCUQ.G")
	public int[] field1511;

	@ObfuscatedName("ZSWNSCUQ.L")
	public int field1516;

	@ObfuscatedName("ZSWNSCUQ.H")
	public int field1512;

	@ObfuscatedName("ZSWNSCUQ.M")
	public int field1517;

	@ObfuscatedName("ZSWNSCUQ.I")
	public int field1513;

	@ObfuscatedName("ZSWNSCUQ.K")
	public int field1515;

	@ObfuscatedName("ZSWNSCUQ.J")
	public int field1514;

	public ZSWNSCUQ(int arg0, int arg1) {
		field1511 = new int[arg0 * arg1];
		field1512 = field1516 = arg0;
		field1513 = field1517 = arg1;
		field1514 = field1515 = 0;
	}

	public ZSWNSCUQ(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1512 = var3.getWidth(arg1);
			field1513 = var3.getHeight(arg1);
			field1516 = field1512;
			field1517 = field1513;
			field1514 = 0;
			field1515 = 0;
			field1511 = new int[field1513 * field1512];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1512, field1513, field1511, 0, field1512);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public ZSWNSCUQ(ESUFCMYV arg0, String arg1, int arg2) {
		RGCGKKUR var4 = new RGCGKKUR(arg0.method205(arg1 + ".dat", null));
		RGCGKKUR var5 = new RGCGKKUR(arg0.method205("index.dat", null));
		var5.field1350 = var4.method457();
		field1516 = var5.method457();
		field1517 = var5.method457();
		int var6 = var5.method455();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method459();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1350 += 2;
			var4.field1350 += var5.method457() * var5.method457();
			var5.field1350++;
		}

		field1514 = var5.method455();
		field1515 = var5.method455();
		field1512 = var5.method457();
		field1513 = var5.method457();
		int var10 = var5.method455();
		int var11 = field1513 * field1512;
		field1511 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1511[var12] = var7[var4.method455()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1512; var13++) {
				for (int var14 = 0; var14 < field1513; var14++) {
					field1511[field1512 * var14 + var13] = var7[var4.method455()];
				}
			}
		}
	}

	@ObfuscatedName("ZSWNSCUQ.a(I)V")
	public void method591() {
		WNEQSCWL.method568(field1511, field1512, field1513);
	}

	@ObfuscatedName("ZSWNSCUQ.a(IIII)V")
	public void method592(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1511.length; var4++) {
			int var5 = field1511[var4];
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

				field1511[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("ZSWNSCUQ.b(I)V")
	public void method593() {
		int[] var1 = new int[field1517 * field1516];
		for (int var2 = 0; var2 < field1513; var2++) {
			for (int var3 = 0; var3 < field1512; var3++) {
				var1[(field1515 + var2) * field1516 + field1514 + var3] = field1511[field1512 * var2 + var3];
			}
		}

		field1511 = var1;
		field1512 = field1516;
		field1513 = field1517;
		field1514 = 0;
		field1515 = 0;
	}

	@ObfuscatedName("ZSWNSCUQ.a(III)V")
	public void method594(int arg0, int arg1) {
		arg0 += field1514;
		arg1 += field1515;
		int var3 = WNEQSCWL.field1453 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1513;
		int var6 = field1512;
		int var7 = WNEQSCWL.field1453 - var6;
		int var8 = 0;

		if (arg1 < WNEQSCWL.field1455) {
			int var9 = WNEQSCWL.field1455 - arg1;
			var5 -= var9;
			arg1 = WNEQSCWL.field1455;
			var4 += var6 * var9;
			var3 += WNEQSCWL.field1453 * var9;
		}

		if (arg1 + var5 > WNEQSCWL.field1456) {
			var5 -= arg1 + var5 - WNEQSCWL.field1456;
		}

		if (arg0 < WNEQSCWL.field1457) {
			int var10 = WNEQSCWL.field1457 - arg0;
			var6 -= var10;
			arg0 = WNEQSCWL.field1457;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > WNEQSCWL.field1458) {
			int var11 = arg0 + var6 - WNEQSCWL.field1458;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method595(var3, var8, var4, var7, var5, WNEQSCWL.field1452, var6, field1511);
		}
	}

	@ObfuscatedName("ZSWNSCUQ.a(IIIIIB[II[I)V")
	public void method595(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7) {
		int var9 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var10 = -arg4; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg5[arg0++] = arg7[arg2++];
				arg5[arg0++] = arg7[arg2++];
				arg5[arg0++] = arg7[arg2++];
				arg5[arg0++] = arg7[arg2++];
			}

			for (int var12 = arg6; var12 < 0; var12++) {
				arg5[arg0++] = arg7[arg2++];
			}

			arg0 += arg3;
			arg2 += arg1;
		}
	}

	@ObfuscatedName("ZSWNSCUQ.b(III)V")
	public void method596(int arg0, int arg1) {
		arg0 += field1514;
		arg1 += field1515;
		int var3 = WNEQSCWL.field1453 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1513;
		int var6 = field1512;
		int var7 = WNEQSCWL.field1453 - var6;
		int var8 = 0;

		if (arg1 < WNEQSCWL.field1455) {
			int var9 = WNEQSCWL.field1455 - arg1;
			var5 -= var9;
			arg1 = WNEQSCWL.field1455;
			var4 += var6 * var9;
			var3 += WNEQSCWL.field1453 * var9;
		}

		if (arg1 + var5 > WNEQSCWL.field1456) {
			var5 -= arg1 + var5 - WNEQSCWL.field1456;
		}

		if (arg0 < WNEQSCWL.field1457) {
			int var10 = WNEQSCWL.field1457 - arg0;
			var6 -= var10;
			arg0 = WNEQSCWL.field1457;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > WNEQSCWL.field1458) {
			int var11 = arg0 + var6 - WNEQSCWL.field1458;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method597(WNEQSCWL.field1452, field1511, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("ZSWNSCUQ.a([I[IIIIIIII)V")
	public void method597(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("ZSWNSCUQ.a(IZII)V")
	public void method598(int arg0, int arg1, int arg2) {
		arg2 += field1514;
		arg0 += field1515;
		int var4 = WNEQSCWL.field1453 * arg0 + arg2;
		int var5 = 0;
		int var6 = field1513;
		int var7 = field1512;
		int var8 = WNEQSCWL.field1453 - var7;
		int var9 = 0;

		if (arg0 < WNEQSCWL.field1455) {
			int var10 = WNEQSCWL.field1455 - arg0;
			var6 -= var10;
			arg0 = WNEQSCWL.field1455;
			var5 += var7 * var10;
			var4 += WNEQSCWL.field1453 * var10;
		}

		if (arg0 + var6 > WNEQSCWL.field1456) {
			var6 -= arg0 + var6 - WNEQSCWL.field1456;
		}

		if (arg2 < WNEQSCWL.field1457) {
			int var11 = WNEQSCWL.field1457 - arg2;
			var7 -= var11;
			arg2 = WNEQSCWL.field1457;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > WNEQSCWL.field1458) {
			int var12 = arg2 + var7 - WNEQSCWL.field1458;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method599(0, var5, field1511, var9, var4, var7, arg1, var8, var6, WNEQSCWL.field1452);
		}
	}

	@ObfuscatedName("ZSWNSCUQ.a(II[IZIIIIII[I)V")
	public void method599(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		int var11 = 256 - arg6;
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = arg2[arg1++];
				if (var14 == 0) {
					arg4++;
				} else {
					int var15 = arg9[arg4];
					arg9[arg4++] = ((var14 & 0xFF00FF) * arg6 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg6 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg4 += arg7;
			arg1 += arg3;
		}
	}

	@ObfuscatedName("ZSWNSCUQ.a(I[IIIIIIIII[I)V")
	public void method600(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -arg6 / 2;
			int var12 = -arg7 / 2;
			int var13 = (int) (Math.sin(arg8 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg8 / 326.11D) * 65536.0D);
			var13 = arg5 * var13 >> 8;
			var14 = arg5 * var14 >> 8;
			int var15 = (arg2 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg4 << 16) + var12 * var14 - var11 * var13;
			int var17 = WNEQSCWL.field1453 * arg0 + arg3;
			for (int var18 = 0; var18 < arg7; var18++) {
				int var19 = arg9[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg1[var18]; var23 < 0; var23++) {
					WNEQSCWL.field1452[var20++] = field1511[(var21 >> 16) + (var22 >> 16) * field1512];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += WNEQSCWL.field1453;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("ZSWNSCUQ.a(DIZIIIIII)V")
	public void method601(double arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg0) * 65536.0D);
			int var13 = (int) (Math.cos(arg0) * 65536.0D);
			var12 = arg5 * var12 >> 8;
			var13 = arg5 * var13 >> 8;
			int var14 = (arg7 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = WNEQSCWL.field1453 * arg1 + arg2;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field1511[(var19 >> 16) + (var20 >> 16) * field1512];
					if (var22 == 0) {
						var18++;
					} else {
						WNEQSCWL.field1452[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += WNEQSCWL.field1453;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("ZSWNSCUQ.a(ILWGRALUSQ;II)V")
	public void method602(WGRALUSQ arg0, int arg1, int arg2) {
		arg1 += field1514;
		arg2 += field1515;
		int var4 = WNEQSCWL.field1453 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1513;
		int var7 = field1512;
		int var8 = WNEQSCWL.field1453 - var7;
		int var9 = 0;

		if (arg2 < WNEQSCWL.field1455) {
			int var10 = WNEQSCWL.field1455 - arg2;
			var6 -= var10;
			arg2 = WNEQSCWL.field1455;
			var5 += var7 * var10;
			var4 += WNEQSCWL.field1453 * var10;
		}

		if (arg2 + var6 > WNEQSCWL.field1456) {
			var6 -= arg2 + var6 - WNEQSCWL.field1456;
		}

		if (arg1 < WNEQSCWL.field1457) {
			int var11 = WNEQSCWL.field1457 - arg1;
			var7 -= var11;
			arg1 = WNEQSCWL.field1457;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > WNEQSCWL.field1458) {
			int var12 = arg1 + var7 - WNEQSCWL.field1458;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method603(var7, var9, var5, field1511, 0, var8, WNEQSCWL.field1452, var4, var6, arg0.field1444);
		}
	}

	@ObfuscatedName("ZSWNSCUQ.a(III[IIIB[III[B)V")
	public void method603(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, byte[] arg9) {
		int var11 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg3[arg2++];
				if (var14 != 0 && arg9[arg7] == 0) {
					arg6[arg7++] = var14;
				} else {
					arg7++;
				}

				int var15 = arg3[arg2++];
				if (var15 != 0 && arg9[arg7] == 0) {
					arg6[arg7++] = var15;
				} else {
					arg7++;
				}

				int var16 = arg3[arg2++];
				if (var16 != 0 && arg9[arg7] == 0) {
					arg6[arg7++] = var16;
				} else {
					arg7++;
				}

				int var17 = arg3[arg2++];
				if (var17 != 0 && arg9[arg7] == 0) {
					arg6[arg7++] = var17;
				} else {
					arg7++;
				}
			}

			for (int var18 = arg0; var18 < 0; var18++) {
				int var19 = arg3[arg2++];
				if (var19 != 0 && arg9[arg7] == 0) {
					arg6[arg7++] = var19;
				} else {
					arg7++;
				}
			}

			arg7 += arg5;
			arg2 += arg1;
		}
	}
}
