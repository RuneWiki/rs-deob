package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("TFHGRYAS")
public final class TFHGRYAS extends ANTOHTCU {

	@ObfuscatedName("TFHGRYAS.E")
	public int[] field1183;

	@ObfuscatedName("TFHGRYAS.J")
	public int field1188;

	@ObfuscatedName("TFHGRYAS.F")
	public int field1184;

	@ObfuscatedName("TFHGRYAS.K")
	public int field1189;

	@ObfuscatedName("TFHGRYAS.G")
	public int field1185;

	@ObfuscatedName("TFHGRYAS.I")
	public int field1187;

	@ObfuscatedName("TFHGRYAS.H")
	public int field1186;

	public TFHGRYAS(int arg0, int arg1) {
		field1183 = new int[arg0 * arg1];
		field1184 = field1188 = arg0;
		field1185 = field1189 = arg1;
		field1186 = field1187 = 0;
	}

	public TFHGRYAS(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1184 = var3.getWidth(arg1);
			field1185 = var3.getHeight(arg1);
			field1188 = field1184;
			field1189 = field1185;
			field1186 = 0;
			field1187 = 0;
			field1183 = new int[field1185 * field1184];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1184, field1185, field1183, 0, field1184);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public TFHGRYAS(MAARFNGV arg0, String arg1, int arg2) {
		EMWAMCXW var4 = new EMWAMCXW(arg0.method332(arg1 + ".dat", null));
		EMWAMCXW var5 = new EMWAMCXW(arg0.method332("index.dat", null));
		var5.field617 = var4.method219();
		field1188 = var5.method219();
		field1189 = var5.method219();
		int var6 = var5.method217();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method221();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field617 += 2;
			var4.field617 += var5.method219() * var5.method219();
			var5.field617++;
		}

		field1186 = var5.method217();
		field1187 = var5.method217();
		field1184 = var5.method219();
		field1185 = var5.method219();
		int var10 = var5.method217();
		int var11 = field1185 * field1184;
		field1183 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1183[var12] = var7[var4.method217()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1184; var13++) {
				for (int var14 = 0; var14 < field1185; var14++) {
					field1183[field1184 * var14 + var13] = var7[var4.method217()];
				}
			}
		}
	}

	@ObfuscatedName("TFHGRYAS.b(I)V")
	public void method419() {
		ANTOHTCU.method12(field1184, field1185, field1183);
	}

	@ObfuscatedName("TFHGRYAS.a(IIZI)V")
	public void method420(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1183.length; var4++) {
			int var5 = field1183[var4];
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

				field1183[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("TFHGRYAS.a(B)V")
	public void method421() {
		int[] var1 = new int[field1189 * field1188];
		for (int var2 = 0; var2 < field1185; var2++) {
			for (int var3 = 0; var3 < field1184; var3++) {
				var1[(field1187 + var2) * field1188 + field1186 + var3] = field1183[field1184 * var2 + var3];
			}
		}

		field1183 = var1;
		field1184 = field1188;
		field1185 = field1189;
		field1186 = 0;
		field1187 = 0;
	}

	@ObfuscatedName("TFHGRYAS.a(III)V")
	public void method422(int arg0, int arg1) {
		arg0 += field1186;
		arg1 += field1187;
		int var3 = ANTOHTCU.field49 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1185;
		int var6 = field1184;
		int var7 = ANTOHTCU.field49 - var6;
		int var8 = 0;

		if (arg1 < ANTOHTCU.field51) {
			int var9 = ANTOHTCU.field51 - arg1;
			var5 -= var9;
			arg1 = ANTOHTCU.field51;
			var4 += var6 * var9;
			var3 += ANTOHTCU.field49 * var9;
		}

		if (arg1 + var5 > ANTOHTCU.field52) {
			var5 -= arg1 + var5 - ANTOHTCU.field52;
		}

		if (arg0 < ANTOHTCU.field53) {
			int var10 = ANTOHTCU.field53 - arg0;
			var6 -= var10;
			arg0 = ANTOHTCU.field53;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > ANTOHTCU.field54) {
			int var11 = arg0 + var6 - ANTOHTCU.field54;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method423(ANTOHTCU.field48, var6, var4, field1183, var5, var7, var8, var3);
		}
	}

	@ObfuscatedName("TFHGRYAS.a([III[IIIIII)V")
	public void method423(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var10 = -arg4; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg0[arg7++] = arg3[arg2++];
				arg0[arg7++] = arg3[arg2++];
				arg0[arg7++] = arg3[arg2++];
				arg0[arg7++] = arg3[arg2++];
			}

			for (int var12 = arg1; var12 < 0; var12++) {
				arg0[arg7++] = arg3[arg2++];
			}

			arg7 += arg5;
			arg2 += arg6;
		}
	}

	@ObfuscatedName("TFHGRYAS.b(III)V")
	public void method424(int arg0, int arg1) {
		arg0 += field1186;
		arg1 += field1187;
		int var3 = ANTOHTCU.field49 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1185;
		int var6 = field1184;
		int var7 = ANTOHTCU.field49 - var6;
		int var8 = 0;

		if (arg1 < ANTOHTCU.field51) {
			int var9 = ANTOHTCU.field51 - arg1;
			var5 -= var9;
			arg1 = ANTOHTCU.field51;
			var4 += var6 * var9;
			var3 += ANTOHTCU.field49 * var9;
		}

		if (arg1 + var5 > ANTOHTCU.field52) {
			var5 -= arg1 + var5 - ANTOHTCU.field52;
		}

		if (arg0 < ANTOHTCU.field53) {
			int var10 = ANTOHTCU.field53 - arg0;
			var6 -= var10;
			arg0 = ANTOHTCU.field53;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > ANTOHTCU.field54) {
			int var11 = arg0 + var6 - ANTOHTCU.field54;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method425(ANTOHTCU.field48, field1183, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("TFHGRYAS.a([I[IIIIIIII)V")
	public void method425(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("TFHGRYAS.a(IIBI)V")
	public void method426(int arg0, int arg1, int arg2) {
		arg0 += field1186;
		arg2 += field1187;
		int var4 = ANTOHTCU.field49 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1185;
		int var7 = field1184;
		int var8 = ANTOHTCU.field49 - var7;
		int var9 = 0;

		if (arg2 < ANTOHTCU.field51) {
			int var10 = ANTOHTCU.field51 - arg2;
			var6 -= var10;
			arg2 = ANTOHTCU.field51;
			var5 += var7 * var10;
			var4 += ANTOHTCU.field49 * var10;
		}

		if (arg2 + var6 > ANTOHTCU.field52) {
			var6 -= arg2 + var6 - ANTOHTCU.field52;
		}

		if (arg0 < ANTOHTCU.field53) {
			int var11 = ANTOHTCU.field53 - arg0;
			var7 -= var11;
			arg0 = ANTOHTCU.field53;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > ANTOHTCU.field54) {
			int var12 = arg0 + var7 - ANTOHTCU.field54;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method427(var5, 0, var6, arg1, field1183, var7, var4, ANTOHTCU.field48, var9, var8);
		}
	}

	@ObfuscatedName("TFHGRYAS.a(IIII[III[IIZI)V")
	public void method427(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg3;
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = arg4[arg0++];
				if (var14 == 0) {
					arg6++;
				} else {
					int var15 = arg7[arg6];
					arg7[arg6++] = ((var14 & 0xFF00FF) * arg3 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg3 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg6 += arg9;
			arg0 += arg8;
		}
	}

	@ObfuscatedName("TFHGRYAS.a(IIII[IIIIBI[I)V")
	public void method428(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		try {
			int var11 = -arg3 / 2;
			int var12 = -arg5 / 2;
			int var13 = (int) (Math.sin(arg0 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg0 / 326.11D) * 65536.0D);
			var13 = arg8 * var13 >> 8;
			var14 = arg8 * var14 >> 8;
			int var15 = (arg6 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg2 << 16) + var12 * var14 - var11 * var13;
			int var17 = ANTOHTCU.field49 * arg1 + arg7;
			for (int var18 = 0; var18 < arg5; var18++) {
				int var19 = arg4[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg9[var18]; var23 < 0; var23++) {
					ANTOHTCU.field48[var20++] = field1183[(var21 >> 16) + (var22 >> 16) * field1184];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += ANTOHTCU.field49;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("TFHGRYAS.a(IIIIIIIDI)V")
	public void method429(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg5 / 2;
			int var12 = (int) (Math.sin(arg6) * 65536.0D);
			int var13 = (int) (Math.cos(arg6) * 65536.0D);
			var12 = arg3 * var12 >> 8;
			var13 = arg3 * var13 >> 8;
			int var14 = (arg1 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg0 << 16) + var11 * var13 - var10 * var12;
			int var16 = ANTOHTCU.field49 * arg7 + arg4;
			for (int var17 = 0; var17 < arg5; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg2; var21 < 0; var21++) {
					int var22 = field1183[(var19 >> 16) + (var20 >> 16) * field1184];
					if (var22 == 0) {
						var18++;
					} else {
						ANTOHTCU.field48[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += ANTOHTCU.field49;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("TFHGRYAS.a(IILCMELCUKG;I)V")
	public void method430(int arg0, CMELCUKG arg1, int arg2) {
		arg0 += field1186;
		arg2 += field1187;
		int var4 = ANTOHTCU.field49 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1185;
		int var7 = field1184;
		int var8 = ANTOHTCU.field49 - var7;
		int var9 = 0;

		if (arg2 < ANTOHTCU.field51) {
			int var10 = ANTOHTCU.field51 - arg2;
			var6 -= var10;
			arg2 = ANTOHTCU.field51;
			var5 += var7 * var10;
			var4 += ANTOHTCU.field49 * var10;
		}

		if (arg2 + var6 > ANTOHTCU.field52) {
			var6 -= arg2 + var6 - ANTOHTCU.field52;
		}

		if (arg0 < ANTOHTCU.field53) {
			int var11 = ANTOHTCU.field53 - arg0;
			var7 -= var11;
			arg0 = ANTOHTCU.field53;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > ANTOHTCU.field54) {
			int var12 = arg0 + var7 - ANTOHTCU.field54;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method431(var5, var6, var7, var4, var8, ANTOHTCU.field48, 0, var9, arg1.field573, field1183);
		}
	}

	@ObfuscatedName("TFHGRYAS.a(IIIIII[III[B[I)V")
	public void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, byte[] arg8, int[] arg9) {
		int var11 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg9[arg0++];
				if (var14 != 0 && arg8[arg3] == 0) {
					arg5[arg3++] = var14;
				} else {
					arg3++;
				}

				int var15 = arg9[arg0++];
				if (var15 != 0 && arg8[arg3] == 0) {
					arg5[arg3++] = var15;
				} else {
					arg3++;
				}

				int var16 = arg9[arg0++];
				if (var16 != 0 && arg8[arg3] == 0) {
					arg5[arg3++] = var16;
				} else {
					arg3++;
				}

				int var17 = arg9[arg0++];
				if (var17 != 0 && arg8[arg3] == 0) {
					arg5[arg3++] = var17;
				} else {
					arg3++;
				}
			}

			for (int var18 = arg2; var18 < 0; var18++) {
				int var19 = arg9[arg0++];
				if (var19 != 0 && arg8[arg3] == 0) {
					arg5[arg3++] = var19;
				} else {
					arg3++;
				}
			}

			arg3 += arg4;
			arg0 += arg7;
		}
	}
}
