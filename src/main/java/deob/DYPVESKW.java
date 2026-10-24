package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("DYPVESKW")
public final class DYPVESKW extends KNERFXXY {

	@ObfuscatedName("DYPVESKW.G")
	public int[] field617;

	@ObfuscatedName("DYPVESKW.L")
	public int field622;

	@ObfuscatedName("DYPVESKW.H")
	public int field618;

	@ObfuscatedName("DYPVESKW.M")
	public int field623;

	@ObfuscatedName("DYPVESKW.I")
	public int field619;

	@ObfuscatedName("DYPVESKW.K")
	public int field621;

	@ObfuscatedName("DYPVESKW.J")
	public int field620;

	public DYPVESKW(int arg0, int arg1) {
		field617 = new int[arg0 * arg1];
		field618 = field622 = arg0;
		field619 = field623 = arg1;
		field620 = field621 = 0;
	}

	public DYPVESKW(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field618 = var3.getWidth(arg1);
			field619 = var3.getHeight(arg1);
			field622 = field618;
			field623 = field619;
			field620 = 0;
			field621 = 0;
			field617 = new int[field619 * field618];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field618, field619, field617, 0, field618);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public DYPVESKW(OTSGNSQM arg0, String arg1, int arg2) {
		YOXDZEVD var4 = new YOXDZEVD(arg0.method376(arg1 + ".dat", null));
		YOXDZEVD var5 = new YOXDZEVD(arg0.method376("index.dat", null));
		var5.field1393 = var4.method551();
		field622 = var5.method551();
		field623 = var5.method551();
		int var6 = var5.method549();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method553();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1393 += 2;
			var4.field1393 += var5.method551() * var5.method551();
			var5.field1393++;
		}

		field620 = var5.method549();
		field621 = var5.method549();
		field618 = var5.method551();
		field619 = var5.method551();
		int var10 = var5.method549();
		int var11 = field619 * field618;
		field617 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field617[var12] = var7[var4.method549()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field618; var13++) {
				for (int var14 = 0; var14 < field619; var14++) {
					field617[field618 * var14 + var13] = var7[var4.method549()];
				}
			}
		}
	}

	@ObfuscatedName("DYPVESKW.b(I)V")
	public void method174() {
		KNERFXXY.method279(field619, field618, field617);
	}

	@ObfuscatedName("DYPVESKW.a(IIII)V")
	public void method175(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field617.length; var4++) {
			int var5 = field617[var4];
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

				field617[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("DYPVESKW.a(B)V")
	public void method176() {
		int[] var1 = new int[field623 * field622];
		for (int var2 = 0; var2 < field619; var2++) {
			for (int var3 = 0; var3 < field618; var3++) {
				var1[(field621 + var2) * field622 + field620 + var3] = field617[field618 * var2 + var3];
			}
		}

		field617 = var1;
		field618 = field622;
		field619 = field623;
		field620 = 0;
		field621 = 0;
	}

	@ObfuscatedName("DYPVESKW.a(IIB)V")
	public void method177(int arg0, int arg1) {
		arg1 += field620;
		arg0 += field621;
		int var3 = KNERFXXY.field825 * arg0 + arg1;
		int var4 = 0;
		int var5 = field619;
		int var6 = field618;
		int var7 = KNERFXXY.field825 - var6;
		int var8 = 0;

		if (arg0 < KNERFXXY.field827) {
			int var9 = KNERFXXY.field827 - arg0;
			var5 -= var9;
			arg0 = KNERFXXY.field827;
			var4 += var6 * var9;
			var3 += KNERFXXY.field825 * var9;
		}

		if (arg0 + var5 > KNERFXXY.field828) {
			var5 -= arg0 + var5 - KNERFXXY.field828;
		}

		if (arg1 < KNERFXXY.field829) {
			int var10 = KNERFXXY.field829 - arg1;
			var6 -= var10;
			arg1 = KNERFXXY.field829;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > KNERFXXY.field830) {
			int var11 = arg1 + var6 - KNERFXXY.field830;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method178(var6, var4, KNERFXXY.field824, field617, var7, var3, var8, var5);
		}
	}

	@ObfuscatedName("DYPVESKW.a(II[IB[IIIII)V")
	public void method178(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg7; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg2[arg5++] = arg3[arg1++];
				arg2[arg5++] = arg3[arg1++];
				arg2[arg5++] = arg3[arg1++];
				arg2[arg5++] = arg3[arg1++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg2[arg5++] = arg3[arg1++];
			}

			arg5 += arg4;
			arg1 += arg6;
		}
	}

	@ObfuscatedName("DYPVESKW.a(III)V")
	public void method179(int arg0, int arg1) {
		arg1 += field620;
		arg0 += field621;
		int var3 = KNERFXXY.field825 * arg0 + arg1;
		int var4 = 0;
		int var5 = field619;
		int var6 = field618;
		int var7 = KNERFXXY.field825 - var6;
		int var8 = 0;

		if (arg0 < KNERFXXY.field827) {
			int var9 = KNERFXXY.field827 - arg0;
			var5 -= var9;
			arg0 = KNERFXXY.field827;
			var4 += var6 * var9;
			var3 += KNERFXXY.field825 * var9;
		}

		if (arg0 + var5 > KNERFXXY.field828) {
			var5 -= arg0 + var5 - KNERFXXY.field828;
		}

		if (arg1 < KNERFXXY.field829) {
			int var10 = KNERFXXY.field829 - arg1;
			var6 -= var10;
			arg1 = KNERFXXY.field829;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > KNERFXXY.field830) {
			int var11 = arg1 + var6 - KNERFXXY.field830;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method180(KNERFXXY.field824, field617, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("DYPVESKW.a([I[IIIIIIII)V")
	public void method180(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("DYPVESKW.b(IIII)V")
	public void method181(int arg0, int arg1, int arg2) {
		arg2 += field620;
		arg0 += field621;
		int var4 = KNERFXXY.field825 * arg0 + arg2;
		int var5 = 0;
		int var6 = field619;
		int var7 = field618;
		int var8 = KNERFXXY.field825 - var7;
		int var9 = 0;

		if (arg0 < KNERFXXY.field827) {
			int var10 = KNERFXXY.field827 - arg0;
			var6 -= var10;
			arg0 = KNERFXXY.field827;
			var5 += var7 * var10;
			var4 += KNERFXXY.field825 * var10;
		}

		if (arg0 + var6 > KNERFXXY.field828) {
			var6 -= arg0 + var6 - KNERFXXY.field828;
		}

		if (arg2 < KNERFXXY.field829) {
			int var11 = KNERFXXY.field829 - arg2;
			var7 -= var11;
			arg2 = KNERFXXY.field829;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > KNERFXXY.field830) {
			int var12 = arg2 + var7 - KNERFXXY.field830;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method182(0, var9, var6, var5, var4, field617, var7, KNERFXXY.field824, var8, arg1);
		}
	}

	@ObfuscatedName("DYPVESKW.a(IIIIII[II[III)V")
	public void method182(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg9;
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = -arg6; var13 < 0; var13++) {
				int var14 = arg5[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					int var15 = arg7[arg4];
					arg7[arg4++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg4 += arg8;
			arg3 += arg1;
		}
	}

	@ObfuscatedName("DYPVESKW.a(IIIIII[IIIB[I)V")
	public void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -arg7 / 2;
			int var12 = -arg4 / 2;
			int var13 = (int) (Math.sin(arg2 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg2 / 326.11D) * 65536.0D);
			var13 = arg0 * var13 >> 8;
			var14 = arg0 * var14 >> 8;
			int var15 = (arg8 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg3 << 16) + var12 * var14 - var11 * var13;
			int var17 = KNERFXXY.field825 * arg1 + arg5;
			for (int var18 = 0; var18 < arg4; var18++) {
				int var19 = arg6[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg9[var18]; var23 < 0; var23++) {
					KNERFXXY.field824[var20++] = field617[(var21 >> 16) + (var22 >> 16) * field618];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += KNERFXXY.field825;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("DYPVESKW.a(IIIIIIIID)V")
	public void method184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7) {
		try {
			int var10 = -arg0 / 2;
			int var11 = -arg1 / 2;
			int var12 = (int) (Math.sin(arg7) * 65536.0D);
			int var13 = (int) (Math.cos(arg7) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg2 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg3 << 16) + var11 * var13 - var10 * var12;
			int var16 = KNERFXXY.field825 * arg5 + arg6;
			for (int var17 = 0; var17 < arg1; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg0; var21 < 0; var21++) {
					int var22 = field617[(var19 >> 16) + (var20 >> 16) * field618];
					if (var22 == 0) {
						var18++;
					} else {
						KNERFXXY.field824[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += KNERFXXY.field825;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("DYPVESKW.a(IZILDZSIRBWX;)V")
	public void method185(int arg0, int arg1, DZSIRBWX arg2) {
		arg1 += field620;
		arg0 += field621;
		int var4 = KNERFXXY.field825 * arg0 + arg1;
		int var5 = 0;
		int var6 = field619;
		int var7 = field618;
		int var8 = KNERFXXY.field825 - var7;
		int var9 = 0;

		if (arg0 < KNERFXXY.field827) {
			int var10 = KNERFXXY.field827 - arg0;
			var6 -= var10;
			arg0 = KNERFXXY.field827;
			var5 += var7 * var10;
			var4 += KNERFXXY.field825 * var10;
		}

		if (arg0 + var6 > KNERFXXY.field828) {
			var6 -= arg0 + var6 - KNERFXXY.field828;
		}

		if (arg1 < KNERFXXY.field829) {
			int var11 = KNERFXXY.field829 - arg1;
			var7 -= var11;
			arg1 = KNERFXXY.field829;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > KNERFXXY.field830) {
			int var12 = arg1 + var7 - KNERFXXY.field830;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method186(var5, 0, arg2.field624, var9, var4, field617, var7, KNERFXXY.field824, var6, var8);
		}
	}

	@ObfuscatedName("DYPVESKW.a(II[BII[II[IIZI)V")
	public void method186(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg5[arg0++];
				if (var14 != 0 && arg2[arg4] == 0) {
					arg7[arg4++] = var14;
				} else {
					arg4++;
				}

				int var15 = arg5[arg0++];
				if (var15 != 0 && arg2[arg4] == 0) {
					arg7[arg4++] = var15;
				} else {
					arg4++;
				}

				int var16 = arg5[arg0++];
				if (var16 != 0 && arg2[arg4] == 0) {
					arg7[arg4++] = var16;
				} else {
					arg4++;
				}

				int var17 = arg5[arg0++];
				if (var17 != 0 && arg2[arg4] == 0) {
					arg7[arg4++] = var17;
				} else {
					arg4++;
				}
			}

			for (int var18 = arg6; var18 < 0; var18++) {
				int var19 = arg5[arg0++];
				if (var19 != 0 && arg2[arg4] == 0) {
					arg7[arg4++] = var19;
				} else {
					arg4++;
				}
			}

			arg4 += arg9;
			arg0 += arg3;
		}
	}
}
