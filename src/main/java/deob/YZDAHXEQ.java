package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("YZDAHXEQ")
public final class YZDAHXEQ extends GEFFBGXP {

	@ObfuscatedName("YZDAHXEQ.D")
	public int[] field1474;

	@ObfuscatedName("YZDAHXEQ.I")
	public int field1479;

	@ObfuscatedName("YZDAHXEQ.E")
	public int field1475;

	@ObfuscatedName("YZDAHXEQ.J")
	public int field1480;

	@ObfuscatedName("YZDAHXEQ.F")
	public int field1476;

	@ObfuscatedName("YZDAHXEQ.H")
	public int field1478;

	@ObfuscatedName("YZDAHXEQ.G")
	public int field1477;

	public YZDAHXEQ(int arg0, int arg1) {
		field1474 = new int[arg0 * arg1];
		field1475 = field1479 = arg0;
		field1476 = field1480 = arg1;
		field1477 = field1478 = 0;
	}

	public YZDAHXEQ(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1475 = var3.getWidth(arg1);
			field1476 = var3.getHeight(arg1);
			field1479 = field1475;
			field1480 = field1476;
			field1477 = 0;
			field1478 = 0;
			field1474 = new int[field1476 * field1475];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1475, field1476, field1474, 0, field1475);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public YZDAHXEQ(MNPBQFWE arg0, String arg1, int arg2) {
		BJPWOXRJ var4 = new BJPWOXRJ(arg0.method429(arg1 + ".dat", null));
		BJPWOXRJ var5 = new BJPWOXRJ(arg0.method429("index.dat", null));
		var5.field5 = var4.method17();
		field1479 = var5.method17();
		field1480 = var5.method17();
		int var6 = var5.method15();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method19();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field5 += 2;
			var4.field5 += var5.method17() * var5.method17();
			var5.field5++;
		}

		field1477 = var5.method15();
		field1478 = var5.method15();
		field1475 = var5.method17();
		field1476 = var5.method17();
		int var10 = var5.method15();
		int var11 = field1476 * field1475;
		field1474 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1474[var12] = var7[var4.method15()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1475; var13++) {
				for (int var14 = 0; var14 < field1476; var14++) {
					field1474[field1475 * var14 + var13] = var7[var4.method15()];
				}
			}
		}
	}

	@ObfuscatedName("YZDAHXEQ.a(I)V")
	public void method548() {
		GEFFBGXP.method223(field1476, field1475, field1474);
	}

	@ObfuscatedName("YZDAHXEQ.a(IIII)V")
	public void method549(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1474.length; var4++) {
			int var5 = field1474[var4];
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

				field1474[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("YZDAHXEQ.c(Z)V")
	public void method550() {
		int[] var1 = new int[field1480 * field1479];
		for (int var2 = 0; var2 < field1476; var2++) {
			for (int var3 = 0; var3 < field1475; var3++) {
				var1[(field1478 + var2) * field1479 + field1477 + var3] = field1474[field1475 * var2 + var3];
			}
		}

		field1474 = var1;
		field1475 = field1479;
		field1476 = field1480;
		field1477 = 0;
		field1478 = 0;
	}

	@ObfuscatedName("YZDAHXEQ.a(ZII)V")
	public void method551(int arg0, int arg1) {
		arg1 += field1477;
		arg0 += field1478;
		int var3 = GEFFBGXP.field623 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1476;
		int var6 = field1475;
		int var7 = GEFFBGXP.field623 - var6;
		int var8 = 0;

		if (arg0 < GEFFBGXP.field625) {
			int var9 = GEFFBGXP.field625 - arg0;
			var5 -= var9;
			arg0 = GEFFBGXP.field625;
			var4 += var6 * var9;
			var3 += GEFFBGXP.field623 * var9;
		}

		if (arg0 + var5 > GEFFBGXP.field626) {
			var5 -= arg0 + var5 - GEFFBGXP.field626;
		}

		if (arg1 < GEFFBGXP.field627) {
			int var10 = GEFFBGXP.field627 - arg1;
			var6 -= var10;
			arg1 = GEFFBGXP.field627;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > GEFFBGXP.field628) {
			int var11 = arg1 + var6 - GEFFBGXP.field628;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method552(var5, var4, var6, var8, field1474, GEFFBGXP.field622, var3, var7);
		}
	}

	@ObfuscatedName("YZDAHXEQ.a(IIII[II[III)V")
	public void method552(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7) {
		int var9 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var10 = -arg0; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg5[arg6++] = arg4[arg1++];
				arg5[arg6++] = arg4[arg1++];
				arg5[arg6++] = arg4[arg1++];
				arg5[arg6++] = arg4[arg1++];
			}

			for (int var12 = arg2; var12 < 0; var12++) {
				arg5[arg6++] = arg4[arg1++];
			}

			arg6 += arg7;
			arg1 += arg3;
		}
	}

	@ObfuscatedName("YZDAHXEQ.a(IIZ)V")
	public void method553(int arg0, int arg1) {
		arg0 += field1477;
		arg1 += field1478;
		int var3 = GEFFBGXP.field623 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1476;
		int var6 = field1475;
		int var7 = GEFFBGXP.field623 - var6;
		int var8 = 0;

		if (arg1 < GEFFBGXP.field625) {
			int var9 = GEFFBGXP.field625 - arg1;
			var5 -= var9;
			arg1 = GEFFBGXP.field625;
			var4 += var6 * var9;
			var3 += GEFFBGXP.field623 * var9;
		}

		if (arg1 + var5 > GEFFBGXP.field626) {
			var5 -= arg1 + var5 - GEFFBGXP.field626;
		}

		if (arg0 < GEFFBGXP.field627) {
			int var10 = GEFFBGXP.field627 - arg0;
			var6 -= var10;
			arg0 = GEFFBGXP.field627;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > GEFFBGXP.field628) {
			int var11 = arg0 + var6 - GEFFBGXP.field628;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method554(GEFFBGXP.field622, field1474, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("YZDAHXEQ.a([I[IIIIIIII)V")
	public void method554(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("YZDAHXEQ.a(BIII)V")
	public void method555(int arg0, int arg1, int arg2) {
		arg0 += field1477;
		arg1 += field1478;
		int var4 = GEFFBGXP.field623 * arg1 + arg0;
		int var5 = 0;
		int var6 = field1476;
		int var7 = field1475;
		int var8 = GEFFBGXP.field623 - var7;
		int var9 = 0;

		if (arg1 < GEFFBGXP.field625) {
			int var10 = GEFFBGXP.field625 - arg1;
			var6 -= var10;
			arg1 = GEFFBGXP.field625;
			var5 += var7 * var10;
			var4 += GEFFBGXP.field623 * var10;
		}

		if (arg1 + var6 > GEFFBGXP.field626) {
			var6 -= arg1 + var6 - GEFFBGXP.field626;
		}

		if (arg0 < GEFFBGXP.field627) {
			int var11 = GEFFBGXP.field627 - arg0;
			var7 -= var11;
			arg0 = GEFFBGXP.field627;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > GEFFBGXP.field628) {
			int var12 = arg0 + var7 - GEFFBGXP.field628;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method556(field1474, 0, var4, arg2, var9, GEFFBGXP.field622, var7, var8, var5, var6);
		}
	}

	@ObfuscatedName("YZDAHXEQ.a([IIIZII[IIIII)V")
	public void method556(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg3;
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = -arg6; var13 < 0; var13++) {
				int var14 = arg0[arg8++];
				if (var14 == 0) {
					arg2++;
				} else {
					int var15 = arg5[arg2];
					arg5[arg2++] = ((var14 & 0xFF00FF) * arg3 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg3 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg2 += arg7;
			arg8 += arg4;
		}
	}

	@ObfuscatedName("YZDAHXEQ.a([IIIIIIBIII[I)V")
	public void method557(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -arg1 / 2;
			int var12 = -arg2 / 2;
			int var13 = (int) (Math.sin(arg5 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg5 / 326.11D) * 65536.0D);
			var13 = arg4 * var13 >> 8;
			var14 = arg4 * var14 >> 8;
			int var15 = (arg3 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg7 << 16) + var12 * var14 - var11 * var13;
			int var17 = GEFFBGXP.field623 * arg6 + arg8;
			for (int var18 = 0; var18 < arg2; var18++) {
				int var19 = arg0[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg9[var18]; var23 < 0; var23++) {
					GEFFBGXP.field622[var20++] = field1474[(var21 >> 16) + (var22 >> 16) * field1475];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += GEFFBGXP.field623;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("YZDAHXEQ.a(IIIIIIDII)V")
	public void method558(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg5) * 65536.0D);
			int var13 = (int) (Math.cos(arg5) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg2 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg0 << 16) + var11 * var13 - var10 * var12;
			int var16 = GEFFBGXP.field623 * arg7 + arg1;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field1474[(var19 >> 16) + (var20 >> 16) * field1475];
					if (var22 == 0) {
						var18++;
					} else {
						GEFFBGXP.field622[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += GEFFBGXP.field623;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("YZDAHXEQ.a(IILTKCVVLIT;I)V")
	public void method559(int arg0, TKCVVLIT arg1, int arg2) {
		arg0 += field1477;
		arg2 += field1478;
		int var4 = GEFFBGXP.field623 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1476;
		int var7 = field1475;
		int var8 = GEFFBGXP.field623 - var7;
		int var9 = 0;

		if (arg2 < GEFFBGXP.field625) {
			int var10 = GEFFBGXP.field625 - arg2;
			var6 -= var10;
			arg2 = GEFFBGXP.field625;
			var5 += var7 * var10;
			var4 += GEFFBGXP.field623 * var10;
		}

		if (arg2 + var6 > GEFFBGXP.field626) {
			var6 -= arg2 + var6 - GEFFBGXP.field626;
		}

		if (arg0 < GEFFBGXP.field627) {
			int var11 = GEFFBGXP.field627 - arg0;
			var7 -= var11;
			arg0 = GEFFBGXP.field627;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > GEFFBGXP.field628) {
			int var12 = arg0 + var7 - GEFFBGXP.field628;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method560(var8, var5, var7, var9, 0, arg1.field1383, var4, GEFFBGXP.field622, var6, field1474);
		}
	}

	@ObfuscatedName("YZDAHXEQ.a(IIIII[BII[II[I)V")
	public void method560(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int[] arg7, int arg8, int[] arg9) {
		int var11 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg9[arg1++];
				if (var14 != 0 && arg5[arg6] == 0) {
					arg7[arg6++] = var14;
				} else {
					arg6++;
				}

				int var15 = arg9[arg1++];
				if (var15 != 0 && arg5[arg6] == 0) {
					arg7[arg6++] = var15;
				} else {
					arg6++;
				}

				int var16 = arg9[arg1++];
				if (var16 != 0 && arg5[arg6] == 0) {
					arg7[arg6++] = var16;
				} else {
					arg6++;
				}

				int var17 = arg9[arg1++];
				if (var17 != 0 && arg5[arg6] == 0) {
					arg7[arg6++] = var17;
				} else {
					arg6++;
				}
			}

			for (int var18 = arg2; var18 < 0; var18++) {
				int var19 = arg9[arg1++];
				if (var19 != 0 && arg5[arg6] == 0) {
					arg7[arg6++] = var19;
				} else {
					arg6++;
				}
			}

			arg6 += arg0;
			arg1 += arg3;
		}
	}
}
