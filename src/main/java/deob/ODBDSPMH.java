package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("ODBDSPMH")
public final class ODBDSPMH extends IFHRXNFO {

	@ObfuscatedName("ODBDSPMH.C")
	public int[] field1027;

	@ObfuscatedName("ODBDSPMH.H")
	public int field1032;

	@ObfuscatedName("ODBDSPMH.D")
	public int field1028;

	@ObfuscatedName("ODBDSPMH.I")
	public int field1033;

	@ObfuscatedName("ODBDSPMH.E")
	public int field1029;

	@ObfuscatedName("ODBDSPMH.G")
	public int field1031;

	@ObfuscatedName("ODBDSPMH.F")
	public int field1030;

	public ODBDSPMH(int arg0, int arg1) {
		field1027 = new int[arg0 * arg1];
		field1028 = field1032 = arg0;
		field1029 = field1033 = arg1;
		field1030 = field1031 = 0;
	}

	public ODBDSPMH(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1028 = var3.getWidth(arg1);
			field1029 = var3.getHeight(arg1);
			field1032 = field1028;
			field1033 = field1029;
			field1030 = 0;
			field1031 = 0;
			field1027 = new int[field1029 * field1028];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1028, field1029, field1027, 0, field1028);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public ODBDSPMH(BBMKAXRK arg0, String arg1, int arg2) {
		EILHLJCE var4 = new EILHLJCE(arg0.method30(arg1 + ".dat", null));
		EILHLJCE var5 = new EILHLJCE(arg0.method30("index.dat", null));
		var5.field684 = var4.method226();
		field1032 = var5.method226();
		field1033 = var5.method226();
		int var6 = var5.method224();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method228();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field684 += 2;
			var4.field684 += var5.method226() * var5.method226();
			var5.field684++;
		}

		field1030 = var5.method224();
		field1031 = var5.method224();
		field1028 = var5.method226();
		field1029 = var5.method226();
		int var10 = var5.method224();
		int var11 = field1029 * field1028;
		field1027 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1027[var12] = var7[var4.method224()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1028; var13++) {
				for (int var14 = 0; var14 < field1029; var14++) {
					field1027[field1028 * var14 + var13] = var7[var4.method224()];
				}
			}
		}
	}

	@ObfuscatedName("ODBDSPMH.b(B)V")
	public void method399() {
		IFHRXNFO.method310(field1029, field1027, field1028);
	}

	@ObfuscatedName("ODBDSPMH.a(IIII)V")
	public void method400(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1027.length; var4++) {
			int var5 = field1027[var4];
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

				field1027[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("ODBDSPMH.b(I)V")
	public void method401() {
		int[] var1 = new int[field1033 * field1032];
		for (int var2 = 0; var2 < field1029; var2++) {
			for (int var3 = 0; var3 < field1028; var3++) {
				var1[(field1031 + var2) * field1032 + field1030 + var3] = field1027[field1028 * var2 + var3];
			}
		}

		field1027 = var1;
		field1028 = field1032;
		field1029 = field1033;
		field1030 = 0;
		field1031 = 0;
	}

	@ObfuscatedName("ODBDSPMH.a(III)V")
	public void method402(int arg0, int arg1) {
		arg1 += field1030;
		arg0 += field1031;
		int var3 = IFHRXNFO.field760 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1029;
		int var6 = field1028;
		int var7 = IFHRXNFO.field760 - var6;
		int var8 = 0;

		if (arg0 < IFHRXNFO.field762) {
			int var9 = IFHRXNFO.field762 - arg0;
			var5 -= var9;
			arg0 = IFHRXNFO.field762;
			var4 += var6 * var9;
			var3 += IFHRXNFO.field760 * var9;
		}

		if (arg0 + var5 > IFHRXNFO.field763) {
			var5 -= arg0 + var5 - IFHRXNFO.field763;
		}

		if (arg1 < IFHRXNFO.field764) {
			int var10 = IFHRXNFO.field764 - arg1;
			var6 -= var10;
			arg1 = IFHRXNFO.field764;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > IFHRXNFO.field765) {
			int var11 = arg1 + var6 - IFHRXNFO.field765;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method403(field1027, var5, IFHRXNFO.field759, var3, var7, var4, var8, var6);
		}
	}

	@ObfuscatedName("ODBDSPMH.a([IIZ[IIIIII)V")
	public void method403(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var10 = -arg1; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg2[arg3++] = arg0[arg5++];
				arg2[arg3++] = arg0[arg5++];
				arg2[arg3++] = arg0[arg5++];
				arg2[arg3++] = arg0[arg5++];
			}

			for (int var12 = arg7; var12 < 0; var12++) {
				arg2[arg3++] = arg0[arg5++];
			}

			arg3 += arg4;
			arg5 += arg6;
		}
	}

	@ObfuscatedName("ODBDSPMH.b(III)V")
	public void method404(int arg0, int arg1) {
		arg0 += field1030;
		arg1 += field1031;
		int var3 = IFHRXNFO.field760 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1029;
		int var6 = field1028;
		int var7 = IFHRXNFO.field760 - var6;
		int var8 = 0;

		if (arg1 < IFHRXNFO.field762) {
			int var9 = IFHRXNFO.field762 - arg1;
			var5 -= var9;
			arg1 = IFHRXNFO.field762;
			var4 += var6 * var9;
			var3 += IFHRXNFO.field760 * var9;
		}

		if (arg1 + var5 > IFHRXNFO.field763) {
			var5 -= arg1 + var5 - IFHRXNFO.field763;
		}

		if (arg0 < IFHRXNFO.field764) {
			int var10 = IFHRXNFO.field764 - arg0;
			var6 -= var10;
			arg0 = IFHRXNFO.field764;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > IFHRXNFO.field765) {
			int var11 = arg0 + var6 - IFHRXNFO.field765;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method405(IFHRXNFO.field759, field1027, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("ODBDSPMH.a([I[IIIIIIII)V")
	public void method405(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("ODBDSPMH.b(IIII)V")
	public void method406(int arg0, int arg1, int arg2) {
		arg1 += field1030;
		arg2 += field1031;
		int var4 = IFHRXNFO.field760 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1029;
		int var7 = field1028;
		int var8 = IFHRXNFO.field760 - var7;
		int var9 = 0;

		if (arg2 < IFHRXNFO.field762) {
			int var10 = IFHRXNFO.field762 - arg2;
			var6 -= var10;
			arg2 = IFHRXNFO.field762;
			var5 += var7 * var10;
			var4 += IFHRXNFO.field760 * var10;
		}

		if (arg2 + var6 > IFHRXNFO.field763) {
			var6 -= arg2 + var6 - IFHRXNFO.field763;
		}

		if (arg1 < IFHRXNFO.field764) {
			int var11 = IFHRXNFO.field764 - arg1;
			var7 -= var11;
			arg1 = IFHRXNFO.field764;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > IFHRXNFO.field765) {
			int var12 = arg1 + var7 - IFHRXNFO.field765;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method407(var9, var4, 0, IFHRXNFO.field759, arg0, field1027, var7, var8, var6, var5);
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IBII[II[IIIII)V")
	public void method407(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg4;
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = -arg6; var13 < 0; var13++) {
				int var14 = arg5[arg9++];
				if (var14 == 0) {
					arg1++;
				} else {
					int var15 = arg3[arg1];
					arg3[arg1++] = ((var14 & 0xFF00FF) * arg4 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg4 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg1 += arg7;
			arg9 += arg0;
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IIIII[II[IIII)V")
	public void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		try {
			int var11 = -arg1 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin(arg2 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg2 / 326.11D) * 65536.0D);
			var13 = arg0 * var13 >> 8;
			var14 = arg0 * var14 >> 8;
			int var15 = (arg4 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg9 << 16) + var12 * var14 - var11 * var13;
			int var17 = IFHRXNFO.field760 * arg6 + arg8;
			for (int var18 = 0; var18 < arg3; var18++) {
				int var19 = arg5[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg7[var18]; var23 < 0; var23++) {
					IFHRXNFO.field759[var20++] = field1027[(var21 >> 16) + (var22 >> 16) * field1028];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += IFHRXNFO.field760;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IIIDIIIII)V")
	public void method409(int arg0, int arg1, int arg2, double arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg7 / 2;
			int var11 = -arg2 / 2;
			int var12 = (int) (Math.sin(arg3) * 65536.0D);
			int var13 = (int) (Math.cos(arg3) * 65536.0D);
			var12 = arg6 * var12 >> 8;
			var13 = arg6 * var13 >> 8;
			int var14 = (arg1 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = IFHRXNFO.field760 * arg5 + arg0;
			for (int var17 = 0; var17 < arg2; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg7; var21 < 0; var21++) {
					int var22 = field1027[(var19 >> 16) + (var20 >> 16) * field1028];
					if (var22 == 0) {
						var18++;
					} else {
						IFHRXNFO.field759[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += IFHRXNFO.field760;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IILFCRLGSQA;I)V")
	public void method410(int arg0, FCRLGSQA arg1, int arg2) {
		arg0 += field1030;
		arg2 += field1031;
		int var4 = IFHRXNFO.field760 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1029;
		int var7 = field1028;
		int var8 = IFHRXNFO.field760 - var7;
		int var9 = 0;

		if (arg2 < IFHRXNFO.field762) {
			int var10 = IFHRXNFO.field762 - arg2;
			var6 -= var10;
			arg2 = IFHRXNFO.field762;
			var5 += var7 * var10;
			var4 += IFHRXNFO.field760 * var10;
		}

		if (arg2 + var6 > IFHRXNFO.field763) {
			var6 -= arg2 + var6 - IFHRXNFO.field763;
		}

		if (arg0 < IFHRXNFO.field764) {
			int var11 = IFHRXNFO.field764 - arg0;
			var7 -= var11;
			arg0 = IFHRXNFO.field764;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > IFHRXNFO.field765) {
			int var12 = arg0 + var7 - IFHRXNFO.field765;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method411(var5, 0, var6, var4, arg1.field696, var8, var9, IFHRXNFO.field759, var7, field1027);
		}
	}

	@ObfuscatedName("ODBDSPMH.a(IIIII[BII[II[I)V")
	public void method411(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int[] arg7, int arg8, int[] arg9) {
		int var11 = -(arg8 >> 2);
		arg8 = -(arg8 & 0x3);
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg9[arg0++];
				if (var14 != 0 && arg4[arg3] == 0) {
					arg7[arg3++] = var14;
				} else {
					arg3++;
				}

				int var15 = arg9[arg0++];
				if (var15 != 0 && arg4[arg3] == 0) {
					arg7[arg3++] = var15;
				} else {
					arg3++;
				}

				int var16 = arg9[arg0++];
				if (var16 != 0 && arg4[arg3] == 0) {
					arg7[arg3++] = var16;
				} else {
					arg3++;
				}

				int var17 = arg9[arg0++];
				if (var17 != 0 && arg4[arg3] == 0) {
					arg7[arg3++] = var17;
				} else {
					arg3++;
				}
			}

			for (int var18 = arg8; var18 < 0; var18++) {
				int var19 = arg9[arg0++];
				if (var19 != 0 && arg4[arg3] == 0) {
					arg7[arg3++] = var19;
				} else {
					arg3++;
				}
			}

			arg3 += arg5;
			arg0 += arg6;
		}
	}
}
