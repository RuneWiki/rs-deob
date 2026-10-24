package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("JONKABPT")
public final class JONKABPT extends JJXDTORW {

	@ObfuscatedName("JONKABPT.H")
	public int[] field999;

	@ObfuscatedName("JONKABPT.M")
	public int field1004;

	@ObfuscatedName("JONKABPT.I")
	public int field1000;

	@ObfuscatedName("JONKABPT.N")
	public int field1005;

	@ObfuscatedName("JONKABPT.J")
	public int field1001;

	@ObfuscatedName("JONKABPT.L")
	public int field1003;

	@ObfuscatedName("JONKABPT.K")
	public int field1002;

	public JONKABPT(int arg0, int arg1) {
		field999 = new int[arg0 * arg1];
		field1000 = field1004 = arg0;
		field1001 = field1005 = arg1;
		field1002 = field1003 = 0;
	}

	public JONKABPT(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1000 = var3.getWidth(arg1);
			field1001 = var3.getHeight(arg1);
			field1004 = field1000;
			field1005 = field1001;
			field1002 = 0;
			field1003 = 0;
			field999 = new int[field1001 * field1000];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1000, field1001, field999, 0, field1000);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public JONKABPT(EAXVDNXA arg0, String arg1, int arg2) {
		CKBTFRZM var4 = new CKBTFRZM(arg0.method255(arg1 + ".dat", null));
		CKBTFRZM var5 = new CKBTFRZM(arg0.method255("index.dat", null));
		var5.field92 = var4.method46();
		field1004 = var5.method46();
		field1005 = var5.method46();
		int var6 = var5.method44();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method48();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field92 += 2;
			var4.field92 += var5.method46() * var5.method46();
			var5.field92++;
		}

		field1002 = var5.method44();
		field1003 = var5.method44();
		field1000 = var5.method46();
		field1001 = var5.method46();
		int var10 = var5.method44();
		int var11 = field1001 * field1000;
		field999 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field999[var12] = var7[var4.method44()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1000; var13++) {
				for (int var14 = 0; var14 < field1001; var14++) {
					field999[field1000 * var14 + var13] = var7[var4.method44()];
				}
			}
		}
	}

	@ObfuscatedName("JONKABPT.a(Z)V")
	public void method424() {
		JJXDTORW.method412(field1001, field1000, field999);
	}

	@ObfuscatedName("JONKABPT.a(IIII)V")
	public void method425(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field999.length; var4++) {
			int var5 = field999[var4];
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

				field999[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("JONKABPT.b(I)V")
	public void method426() {
		int[] var1 = new int[field1005 * field1004];
		for (int var2 = 0; var2 < field1001; var2++) {
			for (int var3 = 0; var3 < field1000; var3++) {
				var1[(field1003 + var2) * field1004 + field1002 + var3] = field999[field1000 * var2 + var3];
			}
		}

		field999 = var1;
		field1000 = field1004;
		field1001 = field1005;
		field1002 = 0;
		field1003 = 0;
	}

	@ObfuscatedName("JONKABPT.a(III)V")
	public void method427(int arg0, int arg1) {
		arg1 += field1002;
		arg0 += field1003;
		int var3 = JJXDTORW.field965 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1001;
		int var6 = field1000;
		int var7 = JJXDTORW.field965 - var6;
		int var8 = 0;

		if (arg0 < JJXDTORW.field967) {
			int var9 = JJXDTORW.field967 - arg0;
			var5 -= var9;
			arg0 = JJXDTORW.field967;
			var4 += var6 * var9;
			var3 += JJXDTORW.field965 * var9;
		}

		if (arg0 + var5 > JJXDTORW.field968) {
			var5 -= arg0 + var5 - JJXDTORW.field968;
		}

		if (arg1 < JJXDTORW.field969) {
			int var10 = JJXDTORW.field969 - arg1;
			var6 -= var10;
			arg1 = JJXDTORW.field969;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > JJXDTORW.field970) {
			int var11 = arg1 + var6 - JJXDTORW.field970;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method428(var6, JJXDTORW.field964, var4, field999, var7, var5, var8, var3);
		}
	}

	@ObfuscatedName("JONKABPT.a(I[III[IIIII)V")
	public void method428(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg7++] = arg3[arg2++];
				arg1[arg7++] = arg3[arg2++];
				arg1[arg7++] = arg3[arg2++];
				arg1[arg7++] = arg3[arg2++];
			}

			for (int var12 = arg0; var12 < 0; var12++) {
				arg1[arg7++] = arg3[arg2++];
			}

			arg7 += arg4;
			arg2 += arg6;
		}
	}

	@ObfuscatedName("JONKABPT.a(IIZ)V")
	public void method429(int arg0, int arg1) {
		arg1 += field1002;
		arg0 += field1003;
		int var3 = JJXDTORW.field965 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1001;
		int var6 = field1000;
		int var7 = JJXDTORW.field965 - var6;
		int var8 = 0;

		if (arg0 < JJXDTORW.field967) {
			int var9 = JJXDTORW.field967 - arg0;
			var5 -= var9;
			arg0 = JJXDTORW.field967;
			var4 += var6 * var9;
			var3 += JJXDTORW.field965 * var9;
		}

		if (arg0 + var5 > JJXDTORW.field968) {
			var5 -= arg0 + var5 - JJXDTORW.field968;
		}

		if (arg1 < JJXDTORW.field969) {
			int var10 = JJXDTORW.field969 - arg1;
			var6 -= var10;
			arg1 = JJXDTORW.field969;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > JJXDTORW.field970) {
			int var11 = arg1 + var6 - JJXDTORW.field970;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method430(JJXDTORW.field964, field999, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("JONKABPT.a([I[IIIIIIII)V")
	public void method430(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("JONKABPT.a(IBII)V")
	public void method431(int arg0, int arg1, int arg2) {
		arg1 += field1002;
		arg0 += field1003;
		int var4 = JJXDTORW.field965 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1001;
		int var7 = field1000;
		int var8 = JJXDTORW.field965 - var7;
		int var9 = 0;

		if (arg0 < JJXDTORW.field967) {
			int var10 = JJXDTORW.field967 - arg0;
			var6 -= var10;
			arg0 = JJXDTORW.field967;
			var5 += var7 * var10;
			var4 += JJXDTORW.field965 * var10;
		}

		if (arg0 + var6 > JJXDTORW.field968) {
			var6 -= arg0 + var6 - JJXDTORW.field968;
		}

		if (arg1 < JJXDTORW.field969) {
			int var11 = JJXDTORW.field969 - arg1;
			var7 -= var11;
			arg1 = JJXDTORW.field969;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > JJXDTORW.field970) {
			int var12 = arg1 + var7 - JJXDTORW.field970;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method432(var5, var9, 0, var7, arg2, JJXDTORW.field964, var6, field999, var8, var4);
		}
	}

	@ObfuscatedName("JONKABPT.a(IIIII[II[IIII)V")
	public void method432(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg4;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = arg7[arg0++];
				if (var14 == 0) {
					arg9++;
				} else {
					int var15 = arg5[arg9];
					arg5[arg9++] = ((var14 & 0xFF00FF) * arg4 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg4 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg9 += arg8;
			arg0 += arg1;
		}
	}

	@ObfuscatedName("JONKABPT.a([II[IIIBIIIII)V")
	public void method433(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg6 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin(arg8 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg8 / 326.11D) * 65536.0D);
			var13 = arg1 * var13 >> 8;
			var14 = arg1 * var14 >> 8;
			int var15 = (arg4 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg9 << 16) + var12 * var14 - var11 * var13;
			int var17 = JJXDTORW.field965 * arg7 + arg5;
			for (int var18 = 0; var18 < arg3; var18++) {
				int var19 = arg0[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg2[var18]; var23 < 0; var23++) {
					JJXDTORW.field964[var20++] = field999[(var21 >> 16) + (var22 >> 16) * field1000];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += JJXDTORW.field965;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("JONKABPT.a(IIIIIIIDI)V")
	public void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7) {
		try {
			int var10 = -arg1 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg7) * 65536.0D);
			int var13 = (int) (Math.cos(arg7) * 65536.0D);
			var12 = arg4 * var12 >> 8;
			var13 = arg4 * var13 >> 8;
			int var14 = (arg5 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg2 << 16) + var11 * var13 - var10 * var12;
			int var16 = JJXDTORW.field965 * arg0 + arg6;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg1; var21 < 0; var21++) {
					int var22 = field999[(var19 >> 16) + (var20 >> 16) * field1000];
					if (var22 == 0) {
						var18++;
					} else {
						JJXDTORW.field964[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += JJXDTORW.field965;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("JONKABPT.a(LJQZFCGYF;III)V")
	public void method435(JQZFCGYF arg0, int arg1, int arg2) {
		arg1 += field1002;
		arg2 += field1003;
		int var4 = JJXDTORW.field965 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1001;
		int var7 = field1000;
		int var8 = JJXDTORW.field965 - var7;
		int var9 = 0;

		if (arg2 < JJXDTORW.field967) {
			int var10 = JJXDTORW.field967 - arg2;
			var6 -= var10;
			arg2 = JJXDTORW.field967;
			var5 += var7 * var10;
			var4 += JJXDTORW.field965 * var10;
		}

		if (arg2 + var6 > JJXDTORW.field968) {
			var6 -= arg2 + var6 - JJXDTORW.field968;
		}

		if (arg1 < JJXDTORW.field969) {
			int var11 = JJXDTORW.field969 - arg1;
			var7 -= var11;
			arg1 = JJXDTORW.field969;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > JJXDTORW.field970) {
			int var12 = arg1 + var7 - JJXDTORW.field970;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method436(var4, arg0.field1006, 0, var6, field999, JJXDTORW.field964, var7, var5, var9, var8);
		}
	}

	@ObfuscatedName("JONKABPT.a(I[BII[I[IBIIII)V")
	public void method436(int arg0, byte[] arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg4[arg7++];
				if (var14 != 0 && arg1[arg0] == 0) {
					arg5[arg0++] = var14;
				} else {
					arg0++;
				}

				int var15 = arg4[arg7++];
				if (var15 != 0 && arg1[arg0] == 0) {
					arg5[arg0++] = var15;
				} else {
					arg0++;
				}

				int var16 = arg4[arg7++];
				if (var16 != 0 && arg1[arg0] == 0) {
					arg5[arg0++] = var16;
				} else {
					arg0++;
				}

				int var17 = arg4[arg7++];
				if (var17 != 0 && arg1[arg0] == 0) {
					arg5[arg0++] = var17;
				} else {
					arg0++;
				}
			}

			for (int var18 = arg6; var18 < 0; var18++) {
				int var19 = arg4[arg7++];
				if (var19 != 0 && arg1[arg0] == 0) {
					arg5[arg0++] = var19;
				} else {
					arg0++;
				}
			}

			arg0 += arg9;
			arg7 += arg8;
		}
	}
}
