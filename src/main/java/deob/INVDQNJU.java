package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("INVDQNJU")
public final class INVDQNJU extends TQHEKXXC {

	@ObfuscatedName("INVDQNJU.K")
	public int[] field758;

	@ObfuscatedName("INVDQNJU.P")
	public int field763;

	@ObfuscatedName("INVDQNJU.L")
	public int field759;

	@ObfuscatedName("INVDQNJU.Q")
	public int field764;

	@ObfuscatedName("INVDQNJU.M")
	public int field760;

	@ObfuscatedName("INVDQNJU.O")
	public int field762;

	@ObfuscatedName("INVDQNJU.N")
	public int field761;

	public INVDQNJU(int arg0, int arg1) {
		field758 = new int[arg0 * arg1];
		field759 = field763 = arg0;
		field760 = field764 = arg1;
		field761 = field762 = 0;
	}

	public INVDQNJU(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field759 = var3.getWidth(arg1);
			field760 = var3.getHeight(arg1);
			field763 = field759;
			field764 = field760;
			field761 = 0;
			field762 = 0;
			field758 = new int[field760 * field759];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field759, field760, field758, 0, field759);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public INVDQNJU(XRWUKRPO arg0, String arg1, int arg2) {
		GLMIQHJI var4 = new GLMIQHJI(arg0.method581(arg1 + ".dat", null));
		GLMIQHJI var5 = new GLMIQHJI(arg0.method581("index.dat", null));
		var5.field709 = var4.method246();
		field763 = var5.method246();
		field764 = var5.method246();
		int var6 = var5.method244();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method248();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field709 += 2;
			var4.field709 += var5.method246() * var5.method246();
			var5.field709++;
		}

		field761 = var5.method244();
		field762 = var5.method244();
		field759 = var5.method246();
		field760 = var5.method246();
		int var10 = var5.method244();
		int var11 = field760 * field759;
		field758 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field758[var12] = var7[var4.method244()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field759; var13++) {
				for (int var14 = 0; var14 < field760; var14++) {
					field758[field759 * var14 + var13] = var7[var4.method244()];
				}
			}
		}
	}

	@ObfuscatedName("INVDQNJU.c(I)V")
	public void method326() {
		TQHEKXXC.method473(field760, field759, field758);
	}

	@ObfuscatedName("INVDQNJU.a(IIIB)V")
	public void method327(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field758.length; var4++) {
			int var5 = field758[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg2;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 0xFF;
				var7 += arg1;
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

				field758[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("INVDQNJU.a(Z)V")
	public void method328() {
		int[] var1 = new int[field764 * field763];
		for (int var2 = 0; var2 < field760; var2++) {
			for (int var3 = 0; var3 < field759; var3++) {
				var1[(field762 + var2) * field763 + field761 + var3] = field758[field759 * var2 + var3];
			}
		}

		field758 = var1;
		field759 = field763;
		field760 = field764;
		field761 = 0;
		field762 = 0;
	}

	@ObfuscatedName("INVDQNJU.a(IIB)V")
	public void method329(int arg0, int arg1) {
		arg0 += field761;
		arg1 += field762;
		int var3 = TQHEKXXC.field1090 * arg1 + arg0;
		int var4 = 0;
		int var5 = field760;
		int var6 = field759;
		int var7 = TQHEKXXC.field1090 - var6;
		int var8 = 0;

		if (arg1 < TQHEKXXC.field1092) {
			int var9 = TQHEKXXC.field1092 - arg1;
			var5 -= var9;
			arg1 = TQHEKXXC.field1092;
			var4 += var6 * var9;
			var3 += TQHEKXXC.field1090 * var9;
		}

		if (arg1 + var5 > TQHEKXXC.field1093) {
			var5 -= arg1 + var5 - TQHEKXXC.field1093;
		}

		if (arg0 < TQHEKXXC.field1094) {
			int var10 = TQHEKXXC.field1094 - arg0;
			var6 -= var10;
			arg0 = TQHEKXXC.field1094;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > TQHEKXXC.field1095) {
			int var11 = arg0 + var6 - TQHEKXXC.field1095;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method330(TQHEKXXC.field1089, field758, var4, var7, var3, var6, var8, var5);
		}
	}

	@ObfuscatedName("INVDQNJU.a([I[IIIIIIII)V")
	public void method330(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var10 = -arg7; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg0[arg4++] = arg1[arg2++];
				arg0[arg4++] = arg1[arg2++];
				arg0[arg4++] = arg1[arg2++];
				arg0[arg4++] = arg1[arg2++];
			}

			for (int var12 = arg5; var12 < 0; var12++) {
				arg0[arg4++] = arg1[arg2++];
			}

			arg4 += arg3;
			arg2 += arg6;
		}
	}

	@ObfuscatedName("INVDQNJU.a(III)V")
	public void method331(int arg0, int arg1) {
		arg0 += field761;
		arg1 += field762;
		int var3 = TQHEKXXC.field1090 * arg1 + arg0;
		int var4 = 0;
		int var5 = field760;
		int var6 = field759;
		int var7 = TQHEKXXC.field1090 - var6;
		int var8 = 0;

		if (arg1 < TQHEKXXC.field1092) {
			int var9 = TQHEKXXC.field1092 - arg1;
			var5 -= var9;
			arg1 = TQHEKXXC.field1092;
			var4 += var6 * var9;
			var3 += TQHEKXXC.field1090 * var9;
		}

		if (arg1 + var5 > TQHEKXXC.field1093) {
			var5 -= arg1 + var5 - TQHEKXXC.field1093;
		}

		if (arg0 < TQHEKXXC.field1094) {
			int var10 = TQHEKXXC.field1094 - arg0;
			var6 -= var10;
			arg0 = TQHEKXXC.field1094;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > TQHEKXXC.field1095) {
			int var11 = arg0 + var6 - TQHEKXXC.field1095;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method332(TQHEKXXC.field1089, field758, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("INVDQNJU.b([I[IIIIIIII)V")
	public void method332(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("INVDQNJU.a(IIZI)V")
	public void method333(int arg0, int arg1, int arg2) {
		arg1 += field761;
		arg2 += field762;
		int var4 = TQHEKXXC.field1090 * arg2 + arg1;
		int var5 = 0;
		int var6 = field760;
		int var7 = field759;
		int var8 = TQHEKXXC.field1090 - var7;
		int var9 = 0;

		if (arg2 < TQHEKXXC.field1092) {
			int var10 = TQHEKXXC.field1092 - arg2;
			var6 -= var10;
			arg2 = TQHEKXXC.field1092;
			var5 += var7 * var10;
			var4 += TQHEKXXC.field1090 * var10;
		}

		if (arg2 + var6 > TQHEKXXC.field1093) {
			var6 -= arg2 + var6 - TQHEKXXC.field1093;
		}

		if (arg1 < TQHEKXXC.field1094) {
			int var11 = TQHEKXXC.field1094 - arg1;
			var7 -= var11;
			arg1 = TQHEKXXC.field1094;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > TQHEKXXC.field1095) {
			int var12 = arg1 + var7 - TQHEKXXC.field1095;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method334(field758, TQHEKXXC.field1089, var9, var5, var7, 0, var4, var6, var8, arg0);
		}
	}

	@ObfuscatedName("INVDQNJU.a([I[IIIIIIIIII)V")
	public void method334(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg9;
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = -arg4; var13 < 0; var13++) {
				int var14 = arg0[arg3++];
				if (var14 == 0) {
					arg6++;
				} else {
					int var15 = arg1[arg6];
					arg1[arg6++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg6 += arg8;
			arg3 += arg2;
		}
	}

	@ObfuscatedName("INVDQNJU.a([IIIIII[IIIII)V")
	public void method335(int[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg9 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin(arg4 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg4 / 326.11D) * 65536.0D);
			var13 = arg6 * var13 >> 8;
			var14 = arg6 * var14 >> 8;
			int var15 = (arg2 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg7 << 16) + var12 * var14 - var11 * var13;
			int var17 = TQHEKXXC.field1090 * arg1 + arg8;
			for (int var18 = 0; var18 < arg3; var18++) {
				int var19 = arg0[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg5[var18]; var23 < 0; var23++) {
					TQHEKXXC.field1089[var20++] = field758[(var21 >> 16) + (var22 >> 16) * field759];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += TQHEKXXC.field1090;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("INVDQNJU.a(IIIIIDIII)V")
	public void method336(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg5 / 2;
			int var11 = -arg0 / 2;
			int var12 = (int) (Math.sin(arg4) * 65536.0D);
			int var13 = (int) (Math.cos(arg4) * 65536.0D);
			var12 = arg1 * var12 >> 8;
			var13 = arg1 * var13 >> 8;
			int var14 = (arg6 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg7 << 16) + var11 * var13 - var10 * var12;
			int var16 = TQHEKXXC.field1090 * arg3 + arg2;
			for (int var17 = 0; var17 < arg0; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg5; var21 < 0; var21++) {
					int var22 = field758[(var19 >> 16) + (var20 >> 16) * field759];
					if (var22 == 0) {
						var18++;
					} else {
						TQHEKXXC.field1089[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += TQHEKXXC.field1090;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("INVDQNJU.a(LVUMXQDFQ;IIZ)V")
	public void method337(VUMXQDFQ arg0, int arg1, int arg2) {
		arg1 += field761;
		arg2 += field762;
		int var4 = TQHEKXXC.field1090 * arg2 + arg1;
		int var5 = 0;
		int var6 = field760;
		int var7 = field759;
		int var8 = TQHEKXXC.field1090 - var7;
		int var9 = 0;

		if (arg2 < TQHEKXXC.field1092) {
			int var10 = TQHEKXXC.field1092 - arg2;
			var6 -= var10;
			arg2 = TQHEKXXC.field1092;
			var5 += var7 * var10;
			var4 += TQHEKXXC.field1090 * var10;
		}

		if (arg2 + var6 > TQHEKXXC.field1093) {
			var6 -= arg2 + var6 - TQHEKXXC.field1093;
		}

		if (arg1 < TQHEKXXC.field1094) {
			int var11 = TQHEKXXC.field1094 - arg1;
			var7 -= var11;
			arg1 = TQHEKXXC.field1094;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > TQHEKXXC.field1095) {
			int var12 = arg1 + var7 - TQHEKXXC.field1095;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method338(0, TQHEKXXC.field1089, var7, var6, arg0.field1259, var5, field758, var9, var4, var8);
		}
	}

	@ObfuscatedName("INVDQNJU.a(I[IIII[BI[IIII)V")
	public void method338(int arg0, int[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg6[arg5++];
				if (var14 != 0 && arg4[arg8] == 0) {
					arg1[arg8++] = var14;
				} else {
					arg8++;
				}

				int var15 = arg6[arg5++];
				if (var15 != 0 && arg4[arg8] == 0) {
					arg1[arg8++] = var15;
				} else {
					arg8++;
				}

				int var16 = arg6[arg5++];
				if (var16 != 0 && arg4[arg8] == 0) {
					arg1[arg8++] = var16;
				} else {
					arg8++;
				}

				int var17 = arg6[arg5++];
				if (var17 != 0 && arg4[arg8] == 0) {
					arg1[arg8++] = var17;
				} else {
					arg8++;
				}
			}

			for (int var18 = arg2; var18 < 0; var18++) {
				int var19 = arg6[arg5++];
				if (var19 != 0 && arg4[arg8] == 0) {
					arg1[arg8++] = var19;
				} else {
					arg8++;
				}
			}

			arg8 += arg9;
			arg5 += arg7;
		}
	}
}
