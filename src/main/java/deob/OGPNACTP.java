package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("OGPNACTP")
public final class OGPNACTP extends KPYGFVMA {

	@ObfuscatedName("OGPNACTP.D")
	public int[] field1133;

	@ObfuscatedName("OGPNACTP.I")
	public int field1138;

	@ObfuscatedName("OGPNACTP.E")
	public int field1134;

	@ObfuscatedName("OGPNACTP.J")
	public int field1139;

	@ObfuscatedName("OGPNACTP.F")
	public int field1135;

	@ObfuscatedName("OGPNACTP.H")
	public int field1137;

	@ObfuscatedName("OGPNACTP.G")
	public int field1136;

	public OGPNACTP(int arg0, int arg1) {
		field1133 = new int[arg0 * arg1];
		field1134 = field1138 = arg0;
		field1135 = field1139 = arg1;
		field1136 = field1137 = 0;
	}

	public OGPNACTP(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1134 = var3.getWidth(arg1);
			field1135 = var3.getHeight(arg1);
			field1138 = field1134;
			field1139 = field1135;
			field1136 = 0;
			field1137 = 0;
			field1133 = new int[field1135 * field1134];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1134, field1135, field1133, 0, field1134);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public OGPNACTP(LKPVZAQN arg0, String arg1, int arg2) {
		WBEWPIXO var4 = new WBEWPIXO(arg0.method323(arg1 + ".dat", null));
		WBEWPIXO var5 = new WBEWPIXO(arg0.method323("index.dat", null));
		var5.field1401 = var4.method517();
		field1138 = var5.method517();
		field1139 = var5.method517();
		int var6 = var5.method515();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method519();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1401 += 2;
			var4.field1401 += var5.method517() * var5.method517();
			var5.field1401++;
		}

		field1136 = var5.method515();
		field1137 = var5.method515();
		field1134 = var5.method517();
		field1135 = var5.method517();
		int var10 = var5.method515();
		int var11 = field1135 * field1134;
		field1133 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1133[var12] = var7[var4.method515()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1134; var13++) {
				for (int var14 = 0; var14 < field1135; var14++) {
					field1133[field1134 * var14 + var13] = var7[var4.method515()];
				}
			}
		}
	}

	@ObfuscatedName("OGPNACTP.b(I)V")
	public void method351() {
		KPYGFVMA.method310(field1134, field1135, field1133);
	}

	@ObfuscatedName("OGPNACTP.a(IIBI)V")
	public void method352(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1133.length; var4++) {
			int var5 = field1133[var4];
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

				field1133[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("OGPNACTP.c(I)V")
	public void method353() {
		int[] var1 = new int[field1139 * field1138];
		for (int var2 = 0; var2 < field1135; var2++) {
			for (int var3 = 0; var3 < field1134; var3++) {
				var1[(field1137 + var2) * field1138 + field1136 + var3] = field1133[field1134 * var2 + var3];
			}
		}

		field1133 = var1;
		field1134 = field1138;
		field1135 = field1139;
		field1136 = 0;
		field1137 = 0;
	}

	@ObfuscatedName("OGPNACTP.a(III)V")
	public void method354(int arg0, int arg1) {
		arg0 += field1136;
		arg1 += field1137;
		int var3 = KPYGFVMA.field969 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1135;
		int var6 = field1134;
		int var7 = KPYGFVMA.field969 - var6;
		int var8 = 0;

		if (arg1 < KPYGFVMA.field971) {
			int var9 = KPYGFVMA.field971 - arg1;
			var5 -= var9;
			arg1 = KPYGFVMA.field971;
			var4 += var6 * var9;
			var3 += KPYGFVMA.field969 * var9;
		}

		if (arg1 + var5 > KPYGFVMA.field972) {
			var5 -= arg1 + var5 - KPYGFVMA.field972;
		}

		if (arg0 < KPYGFVMA.field973) {
			int var10 = KPYGFVMA.field973 - arg0;
			var6 -= var10;
			arg0 = KPYGFVMA.field973;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > KPYGFVMA.field974) {
			int var11 = arg0 + var6 - KPYGFVMA.field974;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method355(var3, var8, var6, var5, var7, field1133, var4, KPYGFVMA.field968);
		}
	}

	@ObfuscatedName("OGPNACTP.a(IIIIII[II[I)V")
	public void method355(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7) {
		int var9 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var10 = -arg3; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg7[arg0++] = arg5[arg6++];
				arg7[arg0++] = arg5[arg6++];
				arg7[arg0++] = arg5[arg6++];
				arg7[arg0++] = arg5[arg6++];
			}

			for (int var12 = arg2; var12 < 0; var12++) {
				arg7[arg0++] = arg5[arg6++];
			}

			arg0 += arg4;
			arg6 += arg1;
		}
	}

	@ObfuscatedName("OGPNACTP.b(III)V")
	public void method356(int arg0, int arg1) {
		arg0 += field1136;
		arg1 += field1137;
		int var3 = KPYGFVMA.field969 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1135;
		int var6 = field1134;
		int var7 = KPYGFVMA.field969 - var6;
		int var8 = 0;

		if (arg1 < KPYGFVMA.field971) {
			int var9 = KPYGFVMA.field971 - arg1;
			var5 -= var9;
			arg1 = KPYGFVMA.field971;
			var4 += var6 * var9;
			var3 += KPYGFVMA.field969 * var9;
		}

		if (arg1 + var5 > KPYGFVMA.field972) {
			var5 -= arg1 + var5 - KPYGFVMA.field972;
		}

		if (arg0 < KPYGFVMA.field973) {
			int var10 = KPYGFVMA.field973 - arg0;
			var6 -= var10;
			arg0 = KPYGFVMA.field973;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > KPYGFVMA.field974) {
			int var11 = arg0 + var6 - KPYGFVMA.field974;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method357(KPYGFVMA.field968, field1133, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("OGPNACTP.a([I[IIIIIIII)V")
	public void method357(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("OGPNACTP.a(IIIB)V")
	public void method358(int arg0, int arg1, int arg2) {
		arg2 += field1136;
		arg1 += field1137;
		int var4 = KPYGFVMA.field969 * arg1 + arg2;
		int var5 = 0;
		int var6 = field1135;
		int var7 = field1134;
		int var8 = KPYGFVMA.field969 - var7;
		int var9 = 0;

		if (arg1 < KPYGFVMA.field971) {
			int var10 = KPYGFVMA.field971 - arg1;
			var6 -= var10;
			arg1 = KPYGFVMA.field971;
			var5 += var7 * var10;
			var4 += KPYGFVMA.field969 * var10;
		}

		if (arg1 + var6 > KPYGFVMA.field972) {
			var6 -= arg1 + var6 - KPYGFVMA.field972;
		}

		if (arg2 < KPYGFVMA.field973) {
			int var11 = KPYGFVMA.field973 - arg2;
			var7 -= var11;
			arg2 = KPYGFVMA.field973;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > KPYGFVMA.field974) {
			int var12 = arg2 + var7 - KPYGFVMA.field974;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method359(field1133, 0, var4, var7, KPYGFVMA.field968, var5, var9, var8, var6, arg0);
		}
	}

	@ObfuscatedName("OGPNACTP.a([IIIIB[IIIIII)V")
	public void method359(int[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg9;
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = -arg3; var13 < 0; var13++) {
				int var14 = arg0[arg5++];
				if (var14 == 0) {
					arg2++;
				} else {
					int var15 = arg4[arg2];
					arg4[arg2++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg2 += arg7;
			arg5 += arg6;
		}
	}

	@ObfuscatedName("OGPNACTP.a(IIIII[I[IIIII)V")
	public void method360(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg3 / 2;
			int var12 = -arg8 / 2;
			int var13 = (int) (Math.sin(arg2 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg2 / 326.11D) * 65536.0D);
			var13 = arg0 * var13 >> 8;
			var14 = arg0 * var14 >> 8;
			int var15 = (arg7 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg4 << 16) + var12 * var14 - var11 * var13;
			int var17 = KPYGFVMA.field969 * arg9 + arg1;
			for (int var18 = 0; var18 < arg8; var18++) {
				int var19 = arg5[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg6[var18]; var23 < 0; var23++) {
					KPYGFVMA.field968[var20++] = field1133[(var21 >> 16) + (var22 >> 16) * field1134];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += KPYGFVMA.field969;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("OGPNACTP.a(IIIDIIIII)V")
	public void method361(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg5 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg2) * 65536.0D);
			int var13 = (int) (Math.cos(arg2) * 65536.0D);
			var12 = arg7 * var12 >> 8;
			var13 = arg7 * var13 >> 8;
			int var14 = (arg0 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = KPYGFVMA.field969 * arg6 + arg1;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg5; var21 < 0; var21++) {
					int var22 = field1133[(var19 >> 16) + (var20 >> 16) * field1134];
					if (var22 == 0) {
						var18++;
					} else {
						KPYGFVMA.field968[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += KPYGFVMA.field969;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("OGPNACTP.a(IILOSRLSEOB;Z)V")
	public void method362(int arg0, int arg1, OSRLSEOB arg2) {
		arg0 += field1136;
		arg1 += field1137;
		int var4 = KPYGFVMA.field969 * arg1 + arg0;
		int var5 = 0;
		int var6 = field1135;
		int var7 = field1134;
		int var8 = KPYGFVMA.field969 - var7;
		int var9 = 0;

		if (arg1 < KPYGFVMA.field971) {
			int var10 = KPYGFVMA.field971 - arg1;
			var6 -= var10;
			arg1 = KPYGFVMA.field971;
			var5 += var7 * var10;
			var4 += KPYGFVMA.field969 * var10;
		}

		if (arg1 + var6 > KPYGFVMA.field972) {
			var6 -= arg1 + var6 - KPYGFVMA.field972;
		}

		if (arg0 < KPYGFVMA.field973) {
			int var11 = KPYGFVMA.field973 - arg0;
			var7 -= var11;
			arg0 = KPYGFVMA.field973;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > KPYGFVMA.field974) {
			int var12 = arg0 + var7 - KPYGFVMA.field974;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method363(var8, var9, arg2.field1140, field1133, var4, var6, KPYGFVMA.field968, var5, var7, 0);
		}
	}

	@ObfuscatedName("OGPNACTP.a(III[B[III[IIII)V")
	public void method363(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg8 >> 2);
		arg8 = -(arg8 & 0x3);
		for (int var12 = -arg5; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg3[arg7++];
				if (var14 != 0 && arg2[arg4] == 0) {
					arg6[arg4++] = var14;
				} else {
					arg4++;
				}

				int var15 = arg3[arg7++];
				if (var15 != 0 && arg2[arg4] == 0) {
					arg6[arg4++] = var15;
				} else {
					arg4++;
				}

				int var16 = arg3[arg7++];
				if (var16 != 0 && arg2[arg4] == 0) {
					arg6[arg4++] = var16;
				} else {
					arg4++;
				}

				int var17 = arg3[arg7++];
				if (var17 != 0 && arg2[arg4] == 0) {
					arg6[arg4++] = var17;
				} else {
					arg4++;
				}
			}

			for (int var18 = arg8; var18 < 0; var18++) {
				int var19 = arg3[arg7++];
				if (var19 != 0 && arg2[arg4] == 0) {
					arg6[arg4++] = var19;
				} else {
					arg4++;
				}
			}

			arg4 += arg0;
			arg7 += arg1;
		}
	}
}
