package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("NUXITFPR")
public final class NUXITFPR extends JNJDBENA {

	@ObfuscatedName("NUXITFPR.G")
	public int[] field995;

	@ObfuscatedName("NUXITFPR.L")
	public int field1000;

	@ObfuscatedName("NUXITFPR.H")
	public int field996;

	@ObfuscatedName("NUXITFPR.M")
	public int field1001;

	@ObfuscatedName("NUXITFPR.I")
	public int field997;

	@ObfuscatedName("NUXITFPR.K")
	public int field999;

	@ObfuscatedName("NUXITFPR.J")
	public int field998;

	public NUXITFPR(int arg0, int arg1) {
		field995 = new int[arg0 * arg1];
		field996 = field1000 = arg0;
		field997 = field1001 = arg1;
		field998 = field999 = 0;
	}

	public NUXITFPR(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field996 = var3.getWidth(arg1);
			field997 = var3.getHeight(arg1);
			field1000 = field996;
			field1001 = field997;
			field998 = 0;
			field999 = 0;
			field995 = new int[field997 * field996];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field996, field997, field995, 0, field996);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public NUXITFPR(DTIATKJO arg0, String arg1, int arg2) {
		GHHPHSRU var4 = new GHHPHSRU(arg0.method168(arg1 + ".dat", null));
		GHHPHSRU var5 = new GHHPHSRU(arg0.method168("index.dat", null));
		var5.field667 = var4.method204();
		field1000 = var5.method204();
		field1001 = var5.method204();
		int var6 = var5.method202();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method206();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field667 += 2;
			var4.field667 += var5.method204() * var5.method204();
			var5.field667++;
		}

		field998 = var5.method202();
		field999 = var5.method202();
		field996 = var5.method204();
		field997 = var5.method204();
		int var10 = var5.method202();
		int var11 = field997 * field996;
		field995 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field995[var12] = var7[var4.method202()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field996; var13++) {
				for (int var14 = 0; var14 < field997; var14++) {
					field995[field996 * var14 + var13] = var7[var4.method202()];
				}
			}
		}
	}

	@ObfuscatedName("NUXITFPR.a(B)V")
	public void method371() {
		JNJDBENA.method283(field996, field997, field995);
	}

	@ObfuscatedName("NUXITFPR.a(IIII)V")
	public void method372(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field995.length; var4++) {
			int var5 = field995[var4];
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

				field995[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("NUXITFPR.c(I)V")
	public void method373() {
		int[] var1 = new int[field1001 * field1000];
		for (int var2 = 0; var2 < field997; var2++) {
			for (int var3 = 0; var3 < field996; var3++) {
				var1[(field999 + var2) * field1000 + field998 + var3] = field995[field996 * var2 + var3];
			}
		}

		field995 = var1;
		field996 = field1000;
		field997 = field1001;
		field998 = 0;
		field999 = 0;
	}

	@ObfuscatedName("NUXITFPR.a(III)V")
	public void method374(int arg0, int arg1) {
		arg1 += field998;
		arg0 += field999;
		int var3 = JNJDBENA.field810 * arg0 + arg1;
		int var4 = 0;
		int var5 = field997;
		int var6 = field996;
		int var7 = JNJDBENA.field810 - var6;
		int var8 = 0;

		if (arg0 < JNJDBENA.field812) {
			int var9 = JNJDBENA.field812 - arg0;
			var5 -= var9;
			arg0 = JNJDBENA.field812;
			var4 += var6 * var9;
			var3 += JNJDBENA.field810 * var9;
		}

		if (arg0 + var5 > JNJDBENA.field813) {
			var5 -= arg0 + var5 - JNJDBENA.field813;
		}

		if (arg1 < JNJDBENA.field814) {
			int var10 = JNJDBENA.field814 - arg1;
			var6 -= var10;
			arg1 = JNJDBENA.field814;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > JNJDBENA.field815) {
			int var11 = arg1 + var6 - JNJDBENA.field815;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method375(var8, field995, JNJDBENA.field809, var6, var4, var3, var7, var5);
		}
	}

	@ObfuscatedName("NUXITFPR.a(I[I[IIIIIBI)V")
	public void method375(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var10 = -arg7; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg2[arg5++] = arg1[arg4++];
				arg2[arg5++] = arg1[arg4++];
				arg2[arg5++] = arg1[arg4++];
				arg2[arg5++] = arg1[arg4++];
			}

			for (int var12 = arg3; var12 < 0; var12++) {
				arg2[arg5++] = arg1[arg4++];
			}

			arg5 += arg6;
			arg4 += arg0;
		}
	}

	@ObfuscatedName("NUXITFPR.a(IZI)V")
	public void method376(int arg0, int arg1) {
		arg1 += field998;
		arg0 += field999;
		int var3 = JNJDBENA.field810 * arg0 + arg1;
		int var4 = 0;
		int var5 = field997;
		int var6 = field996;
		int var7 = JNJDBENA.field810 - var6;
		int var8 = 0;

		if (arg0 < JNJDBENA.field812) {
			int var9 = JNJDBENA.field812 - arg0;
			var5 -= var9;
			arg0 = JNJDBENA.field812;
			var4 += var6 * var9;
			var3 += JNJDBENA.field810 * var9;
		}

		if (arg0 + var5 > JNJDBENA.field813) {
			var5 -= arg0 + var5 - JNJDBENA.field813;
		}

		if (arg1 < JNJDBENA.field814) {
			int var10 = JNJDBENA.field814 - arg1;
			var6 -= var10;
			arg1 = JNJDBENA.field814;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > JNJDBENA.field815) {
			int var11 = arg1 + var6 - JNJDBENA.field815;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method377(JNJDBENA.field809, field995, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("NUXITFPR.a([I[IIIIIIII)V")
	public void method377(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("NUXITFPR.a(IIIZ)V")
	public void method378(int arg0, int arg1, int arg2) {
		arg0 += field998;
		arg2 += field999;
		int var4 = JNJDBENA.field810 * arg2 + arg0;
		int var5 = 0;
		int var6 = field997;
		int var7 = field996;
		int var8 = JNJDBENA.field810 - var7;
		int var9 = 0;

		if (arg2 < JNJDBENA.field812) {
			int var10 = JNJDBENA.field812 - arg2;
			var6 -= var10;
			arg2 = JNJDBENA.field812;
			var5 += var7 * var10;
			var4 += JNJDBENA.field810 * var10;
		}

		if (arg2 + var6 > JNJDBENA.field813) {
			var6 -= arg2 + var6 - JNJDBENA.field813;
		}

		if (arg0 < JNJDBENA.field814) {
			int var11 = JNJDBENA.field814 - arg0;
			var7 -= var11;
			arg0 = JNJDBENA.field814;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > JNJDBENA.field815) {
			int var12 = arg0 + var7 - JNJDBENA.field815;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method379(var9, JNJDBENA.field809, var7, var8, 0, arg1, var6, field995, var5, var4);
		}
	}

	@ObfuscatedName("NUXITFPR.a(IB[IIIIII[III)V")
	public void method379(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg5;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = arg7[arg8++];
				if (var14 == 0) {
					arg9++;
				} else {
					int var15 = arg1[arg9];
					arg1[arg9++] = ((var14 & 0xFF00FF) * arg5 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg5 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg9 += arg3;
			arg8 += arg0;
		}
	}

	@ObfuscatedName("NUXITFPR.a([IIIIIZIIII[I)V")
	public void method380(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -arg2 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg7 / 326.11D) * 65536.0D);
			var13 = arg8 * var13 >> 8;
			var14 = arg8 * var14 >> 8;
			int var15 = (arg1 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg3 << 16) + var12 * var14 - var11 * var13;
			int var17 = JNJDBENA.field810 * arg4 + arg5;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg9[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg0[var18]; var23 < 0; var23++) {
					JNJDBENA.field809[var20++] = field995[(var21 >> 16) + (var22 >> 16) * field996];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += JNJDBENA.field810;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("NUXITFPR.a(IIDIIIIII)V")
	public void method381(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg3 / 2;
			int var11 = -arg5 / 2;
			int var12 = (int) (Math.sin(arg2) * 65536.0D);
			int var13 = (int) (Math.cos(arg2) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg6 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg0 << 16) + var11 * var13 - var10 * var12;
			int var16 = JNJDBENA.field810 * arg1 + arg7;
			for (int var17 = 0; var17 < arg5; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg3; var21 < 0; var21++) {
					int var22 = field995[(var19 >> 16) + (var20 >> 16) * field996];
					if (var22 == 0) {
						var18++;
					} else {
						JNJDBENA.field809[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += JNJDBENA.field810;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("NUXITFPR.a(ILKZTQXFDC;ZI)V")
	public void method382(int arg0, KZTQXFDC arg1, int arg2) {
		arg0 += field998;
		arg2 += field999;
		int var4 = JNJDBENA.field810 * arg2 + arg0;
		int var5 = 0;
		int var6 = field997;
		int var7 = field996;
		int var8 = JNJDBENA.field810 - var7;
		int var9 = 0;

		if (arg2 < JNJDBENA.field812) {
			int var10 = JNJDBENA.field812 - arg2;
			var6 -= var10;
			arg2 = JNJDBENA.field812;
			var5 += var7 * var10;
			var4 += JNJDBENA.field810 * var10;
		}

		if (arg2 + var6 > JNJDBENA.field813) {
			var6 -= arg2 + var6 - JNJDBENA.field813;
		}

		if (arg0 < JNJDBENA.field814) {
			int var11 = JNJDBENA.field814 - arg0;
			var7 -= var11;
			arg0 = JNJDBENA.field814;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > JNJDBENA.field815) {
			int var12 = arg0 + var7 - JNJDBENA.field815;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method383(var8, var9, field995, var4, JNJDBENA.field809, var5, arg1.field848, var7, var6, 0);
		}
	}

	@ObfuscatedName("NUXITFPR.a(II[II[II[BIIII)V")
	public void method383(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg2[arg5++];
				if (var14 != 0 && arg6[arg3] == 0) {
					arg4[arg3++] = var14;
				} else {
					arg3++;
				}

				int var15 = arg2[arg5++];
				if (var15 != 0 && arg6[arg3] == 0) {
					arg4[arg3++] = var15;
				} else {
					arg3++;
				}

				int var16 = arg2[arg5++];
				if (var16 != 0 && arg6[arg3] == 0) {
					arg4[arg3++] = var16;
				} else {
					arg3++;
				}

				int var17 = arg2[arg5++];
				if (var17 != 0 && arg6[arg3] == 0) {
					arg4[arg3++] = var17;
				} else {
					arg3++;
				}
			}

			for (int var18 = arg7; var18 < 0; var18++) {
				int var19 = arg2[arg5++];
				if (var19 != 0 && arg6[arg3] == 0) {
					arg4[arg3++] = var19;
				} else {
					arg3++;
				}
			}

			arg3 += arg0;
			arg5 += arg1;
		}
	}
}
