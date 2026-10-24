package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("PDMJJHOP")
public final class PDMJJHOP extends IGZZCJOU {

	@ObfuscatedName("PDMJJHOP.C")
	public int[] field1145;

	@ObfuscatedName("PDMJJHOP.H")
	public int field1150;

	@ObfuscatedName("PDMJJHOP.D")
	public int field1146;

	@ObfuscatedName("PDMJJHOP.I")
	public int field1151;

	@ObfuscatedName("PDMJJHOP.E")
	public int field1147;

	@ObfuscatedName("PDMJJHOP.G")
	public int field1149;

	@ObfuscatedName("PDMJJHOP.F")
	public int field1148;

	public PDMJJHOP(int arg0, int arg1) {
		field1145 = new int[arg0 * arg1];
		field1146 = field1150 = arg0;
		field1147 = field1151 = arg1;
		field1148 = field1149 = 0;
	}

	public PDMJJHOP(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1146 = var3.getWidth(arg1);
			field1147 = var3.getHeight(arg1);
			field1150 = field1146;
			field1151 = field1147;
			field1148 = 0;
			field1149 = 0;
			field1145 = new int[field1147 * field1146];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1146, field1147, field1145, 0, field1146);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public PDMJJHOP(MJLXHQTQ arg0, String arg1, int arg2) {
		XGRGMPUQ var4 = new XGRGMPUQ(arg0.method317(arg1 + ".dat", null));
		XGRGMPUQ var5 = new XGRGMPUQ(arg0.method317("index.dat", null));
		var5.field1432 = var4.method467();
		field1150 = var5.method467();
		field1151 = var5.method467();
		int var6 = var5.method465();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method469();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1432 += 2;
			var4.field1432 += var5.method467() * var5.method467();
			var5.field1432++;
		}

		field1148 = var5.method465();
		field1149 = var5.method465();
		field1146 = var5.method467();
		field1147 = var5.method467();
		int var10 = var5.method465();
		int var11 = field1147 * field1146;
		field1145 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1145[var12] = var7[var4.method465()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1146; var13++) {
				for (int var14 = 0; var14 < field1147; var14++) {
					field1145[field1146 * var14 + var13] = var7[var4.method465()];
				}
			}
		}
	}

	@ObfuscatedName("PDMJJHOP.b(I)V")
	public void method335() {
		IGZZCJOU.method240(field1145, field1146, field1147);
	}

	@ObfuscatedName("PDMJJHOP.a(IZII)V")
	public void method336(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1145.length; var4++) {
			int var5 = field1145[var4];
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

				field1145[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("PDMJJHOP.c(I)V")
	public void method337() {
		int[] var1 = new int[field1151 * field1150];
		for (int var2 = 0; var2 < field1147; var2++) {
			for (int var3 = 0; var3 < field1146; var3++) {
				var1[(field1149 + var2) * field1150 + field1148 + var3] = field1145[field1146 * var2 + var3];
			}
		}

		field1145 = var1;
		field1146 = field1150;
		field1147 = field1151;
		field1148 = 0;
		field1149 = 0;
	}

	@ObfuscatedName("PDMJJHOP.a(III)V")
	public void method338(int arg0, int arg1) {
		arg1 += field1148;
		arg0 += field1149;
		int var3 = IGZZCJOU.field796 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1147;
		int var6 = field1146;
		int var7 = IGZZCJOU.field796 - var6;
		int var8 = 0;

		if (arg0 < IGZZCJOU.field798) {
			int var9 = IGZZCJOU.field798 - arg0;
			var5 -= var9;
			arg0 = IGZZCJOU.field798;
			var4 += var6 * var9;
			var3 += IGZZCJOU.field796 * var9;
		}

		if (arg0 + var5 > IGZZCJOU.field799) {
			var5 -= arg0 + var5 - IGZZCJOU.field799;
		}

		if (arg1 < IGZZCJOU.field800) {
			int var10 = IGZZCJOU.field800 - arg1;
			var6 -= var10;
			arg1 = IGZZCJOU.field800;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > IGZZCJOU.field801) {
			int var11 = arg1 + var6 - IGZZCJOU.field801;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method339(var3, var7, var5, var8, var4, IGZZCJOU.field795, field1145, var6);
		}
	}

	@ObfuscatedName("PDMJJHOP.a(IIIIBI[I[II)V")
	public void method339(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7) {
		int var9 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var10 = -arg2; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg5[arg0++] = arg6[arg4++];
				arg5[arg0++] = arg6[arg4++];
				arg5[arg0++] = arg6[arg4++];
				arg5[arg0++] = arg6[arg4++];
			}

			for (int var12 = arg7; var12 < 0; var12++) {
				arg5[arg0++] = arg6[arg4++];
			}

			arg0 += arg1;
			arg4 += arg3;
		}
	}

	@ObfuscatedName("PDMJJHOP.a(IZI)V")
	public void method340(int arg0, int arg1) {
		arg1 += field1148;
		arg0 += field1149;
		int var3 = IGZZCJOU.field796 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1147;
		int var6 = field1146;
		int var7 = IGZZCJOU.field796 - var6;
		int var8 = 0;

		if (arg0 < IGZZCJOU.field798) {
			int var9 = IGZZCJOU.field798 - arg0;
			var5 -= var9;
			arg0 = IGZZCJOU.field798;
			var4 += var6 * var9;
			var3 += IGZZCJOU.field796 * var9;
		}

		if (arg0 + var5 > IGZZCJOU.field799) {
			var5 -= arg0 + var5 - IGZZCJOU.field799;
		}

		if (arg1 < IGZZCJOU.field800) {
			int var10 = IGZZCJOU.field800 - arg1;
			var6 -= var10;
			arg1 = IGZZCJOU.field800;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > IGZZCJOU.field801) {
			int var11 = arg1 + var6 - IGZZCJOU.field801;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method341(IGZZCJOU.field795, field1145, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("PDMJJHOP.a([I[IIIIIIII)V")
	public void method341(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("PDMJJHOP.a(IIII)V")
	public void method342(int arg0, int arg1, int arg2) {
		arg1 += field1148;
		arg0 += field1149;
		int var4 = IGZZCJOU.field796 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1147;
		int var7 = field1146;
		int var8 = IGZZCJOU.field796 - var7;
		int var9 = 0;

		if (arg0 < IGZZCJOU.field798) {
			int var10 = IGZZCJOU.field798 - arg0;
			var6 -= var10;
			arg0 = IGZZCJOU.field798;
			var5 += var7 * var10;
			var4 += IGZZCJOU.field796 * var10;
		}

		if (arg0 + var6 > IGZZCJOU.field799) {
			var6 -= arg0 + var6 - IGZZCJOU.field799;
		}

		if (arg1 < IGZZCJOU.field800) {
			int var11 = IGZZCJOU.field800 - arg1;
			var7 -= var11;
			arg1 = IGZZCJOU.field800;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > IGZZCJOU.field801) {
			int var12 = arg1 + var7 - IGZZCJOU.field801;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method343(IGZZCJOU.field795, 0, var5, var6, var4, field1145, var7, var8, arg2, var9);
		}
	}

	@ObfuscatedName("PDMJJHOP.a([IIIII[IIIIIB)V")
	public void method343(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg8;
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = -arg6; var13 < 0; var13++) {
				int var14 = arg5[arg2++];
				if (var14 == 0) {
					arg4++;
				} else {
					int var15 = arg0[arg4];
					arg0[arg4++] = ((var14 & 0xFF00FF) * arg8 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg8 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg4 += arg7;
			arg2 += arg9;
		}
	}

	@ObfuscatedName("PDMJJHOP.a(III[IIIIIII[I)V")
	public void method344(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -arg5 / 2;
			int var12 = -arg0 / 2;
			int var13 = (int) (Math.sin(arg8 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg8 / 326.11D) * 65536.0D);
			var13 = arg7 * var13 >> 8;
			var14 = arg7 * var14 >> 8;
			int var15 = (arg2 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg1 << 16) + var12 * var14 - var11 * var13;
			int var17 = IGZZCJOU.field796 * arg6 + arg4;
			for (int var18 = 0; var18 < arg0; var18++) {
				int var19 = arg3[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg9[var18]; var23 < 0; var23++) {
					IGZZCJOU.field795[var20++] = field1145[(var21 >> 16) + (var22 >> 16) * field1146];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += IGZZCJOU.field796;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("PDMJJHOP.a(IIIIIZDII)V")
	public void method345(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5, int arg6, int arg7) {
		try {
			int var10 = -arg1 / 2;
			int var11 = -arg6 / 2;
			int var12 = (int) (Math.sin(arg5) * 65536.0D);
			int var13 = (int) (Math.cos(arg5) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg3 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg7 << 16) + var11 * var13 - var10 * var12;
			int var16 = IGZZCJOU.field796 * arg0 + arg2;
			for (int var17 = 0; var17 < arg6; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg1; var21 < 0; var21++) {
					int var22 = field1145[(var19 >> 16) + (var20 >> 16) * field1146];
					if (var22 == 0) {
						var18++;
					} else {
						IGZZCJOU.field795[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += IGZZCJOU.field796;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("PDMJJHOP.a(ILVSJQVIFL;II)V")
	public void method346(int arg0, VSJQVIFL arg1, int arg2) {
		arg2 += field1148;
		arg0 += field1149;
		int var4 = IGZZCJOU.field796 * arg0 + arg2;
		int var5 = 0;
		int var6 = field1147;
		int var7 = field1146;
		int var8 = IGZZCJOU.field796 - var7;
		int var9 = 0;

		if (arg0 < IGZZCJOU.field798) {
			int var10 = IGZZCJOU.field798 - arg0;
			var6 -= var10;
			arg0 = IGZZCJOU.field798;
			var5 += var7 * var10;
			var4 += IGZZCJOU.field796 * var10;
		}

		if (arg0 + var6 > IGZZCJOU.field799) {
			var6 -= arg0 + var6 - IGZZCJOU.field799;
		}

		if (arg2 < IGZZCJOU.field800) {
			int var11 = IGZZCJOU.field800 - arg2;
			var7 -= var11;
			arg2 = IGZZCJOU.field800;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > IGZZCJOU.field801) {
			int var12 = arg2 + var7 - IGZZCJOU.field801;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method347(var5, var6, var4, field1145, var9, IGZZCJOU.field795, var7, arg1.field1181, var8, 0);
		}
	}

	@ObfuscatedName("PDMJJHOP.a(III[II[II[BIIB)V")
	public void method347(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, byte[] arg7, int arg8, int arg9) {
		int var11 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg3[arg0++];
				if (var14 != 0 && arg7[arg2] == 0) {
					arg5[arg2++] = var14;
				} else {
					arg2++;
				}

				int var15 = arg3[arg0++];
				if (var15 != 0 && arg7[arg2] == 0) {
					arg5[arg2++] = var15;
				} else {
					arg2++;
				}

				int var16 = arg3[arg0++];
				if (var16 != 0 && arg7[arg2] == 0) {
					arg5[arg2++] = var16;
				} else {
					arg2++;
				}

				int var17 = arg3[arg0++];
				if (var17 != 0 && arg7[arg2] == 0) {
					arg5[arg2++] = var17;
				} else {
					arg2++;
				}
			}

			for (int var18 = arg6; var18 < 0; var18++) {
				int var19 = arg3[arg0++];
				if (var19 != 0 && arg7[arg2] == 0) {
					arg5[arg2++] = var19;
				} else {
					arg2++;
				}
			}

			arg2 += arg8;
			arg0 += arg4;
		}
	}
}
