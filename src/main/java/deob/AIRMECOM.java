package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("AIRMECOM")
public final class AIRMECOM extends PGTLMTYR {

	@ObfuscatedName("AIRMECOM.D")
	public int[] field13;

	@ObfuscatedName("AIRMECOM.I")
	public int field18;

	@ObfuscatedName("AIRMECOM.E")
	public int field14;

	@ObfuscatedName("AIRMECOM.J")
	public int field19;

	@ObfuscatedName("AIRMECOM.F")
	public int field15;

	@ObfuscatedName("AIRMECOM.H")
	public int field17;

	@ObfuscatedName("AIRMECOM.G")
	public int field16;

	public AIRMECOM(int arg0, int arg1) {
		field13 = new int[arg0 * arg1];
		field14 = field18 = arg0;
		field15 = field19 = arg1;
		field16 = field17 = 0;
	}

	public AIRMECOM(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field14 = var3.getWidth(arg1);
			field15 = var3.getHeight(arg1);
			field18 = field14;
			field19 = field15;
			field16 = 0;
			field17 = 0;
			field13 = new int[field15 * field14];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field14, field15, field13, 0, field14);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public AIRMECOM(FXNTEMPE arg0, String arg1, int arg2) {
		RSWRPCHR var4 = new RSWRPCHR(arg0.method212(arg1 + ".dat", null));
		RSWRPCHR var5 = new RSWRPCHR(arg0.method212("index.dat", null));
		var5.field1038 = var4.method390();
		field18 = var5.method390();
		field19 = var5.method390();
		int var6 = var5.method388();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method392();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1038 += 2;
			var4.field1038 += var5.method390() * var5.method390();
			var5.field1038++;
		}

		field16 = var5.method388();
		field17 = var5.method388();
		field14 = var5.method390();
		field15 = var5.method390();
		int var10 = var5.method388();
		int var11 = field15 * field14;
		field13 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field13[var12] = var7[var4.method388()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field14; var13++) {
				for (int var14 = 0; var14 < field15; var14++) {
					field13[field14 * var14 + var13] = var7[var4.method388()];
				}
			}
		}
	}

	@ObfuscatedName("AIRMECOM.b(I)V")
	public void method4() {
		PGTLMTYR.method339(field14, field15, field13);
	}

	@ObfuscatedName("AIRMECOM.a(IIIZ)V")
	public void method5(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field13.length; var4++) {
			int var5 = field13[var4];
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

				field13[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("AIRMECOM.b(B)V")
	public void method6() {
		int[] var1 = new int[field19 * field18];
		for (int var2 = 0; var2 < field15; var2++) {
			for (int var3 = 0; var3 < field14; var3++) {
				var1[(field17 + var2) * field18 + field16 + var3] = field13[field14 * var2 + var3];
			}
		}

		field13 = var1;
		field14 = field18;
		field15 = field19;
		field16 = 0;
		field17 = 0;
	}

	@ObfuscatedName("AIRMECOM.a(BII)V")
	public void method7(int arg0, int arg1) {
		arg1 += field16;
		arg0 += field17;
		int var3 = PGTLMTYR.field951 * arg0 + arg1;
		int var4 = 0;
		int var5 = field15;
		int var6 = field14;
		int var7 = PGTLMTYR.field951 - var6;
		int var8 = 0;

		if (arg0 < PGTLMTYR.field953) {
			int var9 = PGTLMTYR.field953 - arg0;
			var5 -= var9;
			arg0 = PGTLMTYR.field953;
			var4 += var6 * var9;
			var3 += PGTLMTYR.field951 * var9;
		}

		if (arg0 + var5 > PGTLMTYR.field954) {
			var5 -= arg0 + var5 - PGTLMTYR.field954;
		}

		if (arg1 < PGTLMTYR.field955) {
			int var10 = PGTLMTYR.field955 - arg1;
			var6 -= var10;
			arg1 = PGTLMTYR.field955;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > PGTLMTYR.field956) {
			int var11 = arg1 + var6 - PGTLMTYR.field956;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method8(var5, var3, var7, field13, var6, var8, PGTLMTYR.field950, var4);
		}
	}

	@ObfuscatedName("AIRMECOM.a(III[IIII[II)V")
	public void method8(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7) {
		int var9 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var10 = -arg0; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg6[arg1++] = arg3[arg7++];
				arg6[arg1++] = arg3[arg7++];
				arg6[arg1++] = arg3[arg7++];
				arg6[arg1++] = arg3[arg7++];
			}

			for (int var12 = arg4; var12 < 0; var12++) {
				arg6[arg1++] = arg3[arg7++];
			}

			arg1 += arg2;
			arg7 += arg5;
		}
	}

	@ObfuscatedName("AIRMECOM.b(BII)V")
	public void method9(int arg0, int arg1) {
		arg0 += field16;
		arg1 += field17;
		int var3 = PGTLMTYR.field951 * arg1 + arg0;
		int var4 = 0;
		int var5 = field15;
		int var6 = field14;
		int var7 = PGTLMTYR.field951 - var6;
		int var8 = 0;

		if (arg1 < PGTLMTYR.field953) {
			int var9 = PGTLMTYR.field953 - arg1;
			var5 -= var9;
			arg1 = PGTLMTYR.field953;
			var4 += var6 * var9;
			var3 += PGTLMTYR.field951 * var9;
		}

		if (arg1 + var5 > PGTLMTYR.field954) {
			var5 -= arg1 + var5 - PGTLMTYR.field954;
		}

		if (arg0 < PGTLMTYR.field955) {
			int var10 = PGTLMTYR.field955 - arg0;
			var6 -= var10;
			arg0 = PGTLMTYR.field955;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > PGTLMTYR.field956) {
			int var11 = arg0 + var6 - PGTLMTYR.field956;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method10(PGTLMTYR.field950, field13, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("AIRMECOM.a([I[IIIIIIII)V")
	public void method10(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("AIRMECOM.a(IIII)V")
	public void method11(int arg0, int arg1, int arg2) {
		arg2 += field16;
		arg1 += field17;
		int var4 = PGTLMTYR.field951 * arg1 + arg2;
		int var5 = 0;
		int var6 = field15;
		int var7 = field14;
		int var8 = PGTLMTYR.field951 - var7;
		int var9 = 0;

		if (arg1 < PGTLMTYR.field953) {
			int var10 = PGTLMTYR.field953 - arg1;
			var6 -= var10;
			arg1 = PGTLMTYR.field953;
			var5 += var7 * var10;
			var4 += PGTLMTYR.field951 * var10;
		}

		if (arg1 + var6 > PGTLMTYR.field954) {
			var6 -= arg1 + var6 - PGTLMTYR.field954;
		}

		if (arg2 < PGTLMTYR.field955) {
			int var11 = PGTLMTYR.field955 - arg2;
			var7 -= var11;
			arg2 = PGTLMTYR.field955;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > PGTLMTYR.field956) {
			int var12 = arg2 + var7 - PGTLMTYR.field956;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method12(var9, var7, field13, var5, var4, arg0, PGTLMTYR.field950, var6, 0, var8);
		}
	}

	@ObfuscatedName("AIRMECOM.a(BII[IIII[IIII)V")
	public void method12(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg5;
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = arg2[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					int var15 = arg6[arg4];
					arg6[arg4++] = ((var14 & 0xFF00FF) * arg5 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg5 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg4 += arg9;
			arg3 += arg0;
		}
	}

	@ObfuscatedName("AIRMECOM.a(III[III[IIIII)V")
	public void method13(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg8 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg0 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg0 / 326.11D) * 65536.0D);
			var13 = arg4 * var13 >> 8;
			var14 = arg4 * var14 >> 8;
			int var15 = (arg9 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg7 << 16) + var12 * var14 - var11 * var13;
			int var17 = PGTLMTYR.field951 * arg1 + arg2;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg5[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg3[var18]; var23 < 0; var23++) {
					PGTLMTYR.field950[var20++] = field13[(var21 >> 16) + (var22 >> 16) * field14];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += PGTLMTYR.field951;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("AIRMECOM.a(IDIIIIIII)V")
	public void method14(int arg0, double arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg4 / 2;
			int var11 = -arg0 / 2;
			int var12 = (int) (Math.sin(arg1) * 65536.0D);
			int var13 = (int) (Math.cos(arg1) * 65536.0D);
			var12 = arg3 * var12 >> 8;
			var13 = arg3 * var13 >> 8;
			int var14 = (arg6 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg2 << 16) + var11 * var13 - var10 * var12;
			int var16 = PGTLMTYR.field951 * arg5 + arg7;
			for (int var17 = 0; var17 < arg0; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg4; var21 < 0; var21++) {
					int var22 = field13[(var19 >> 16) + (var20 >> 16) * field14];
					if (var22 == 0) {
						var18++;
					} else {
						PGTLMTYR.field950[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += PGTLMTYR.field951;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("AIRMECOM.a(IIILOJMMOVXV;)V")
	public void method15(int arg0, int arg1, OJMMOVXV arg2) {
		arg0 += field16;
		arg1 += field17;
		int var4 = PGTLMTYR.field951 * arg1 + arg0;
		int var5 = 0;
		int var6 = field15;
		int var7 = field14;
		int var8 = PGTLMTYR.field951 - var7;
		int var9 = 0;

		if (arg1 < PGTLMTYR.field953) {
			int var10 = PGTLMTYR.field953 - arg1;
			var6 -= var10;
			arg1 = PGTLMTYR.field953;
			var5 += var7 * var10;
			var4 += PGTLMTYR.field951 * var10;
		}

		if (arg1 + var6 > PGTLMTYR.field954) {
			var6 -= arg1 + var6 - PGTLMTYR.field954;
		}

		if (arg0 < PGTLMTYR.field955) {
			int var11 = PGTLMTYR.field955 - arg0;
			var7 -= var11;
			arg0 = PGTLMTYR.field955;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > PGTLMTYR.field956) {
			int var12 = arg0 + var7 - PGTLMTYR.field956;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method16(var9, var7, var6, PGTLMTYR.field950, arg2.field909, field13, var8, var4, var5, 0);
		}
	}

	@ObfuscatedName("AIRMECOM.a(III[I[B[IIIZII)V")
	public void method16(int arg0, int arg1, int arg2, int[] arg3, byte[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg5[arg8++];
				if (var14 != 0 && arg4[arg7] == 0) {
					arg3[arg7++] = var14;
				} else {
					arg7++;
				}

				int var15 = arg5[arg8++];
				if (var15 != 0 && arg4[arg7] == 0) {
					arg3[arg7++] = var15;
				} else {
					arg7++;
				}

				int var16 = arg5[arg8++];
				if (var16 != 0 && arg4[arg7] == 0) {
					arg3[arg7++] = var16;
				} else {
					arg7++;
				}

				int var17 = arg5[arg8++];
				if (var17 != 0 && arg4[arg7] == 0) {
					arg3[arg7++] = var17;
				} else {
					arg7++;
				}
			}

			for (int var18 = arg1; var18 < 0; var18++) {
				int var19 = arg5[arg8++];
				if (var19 != 0 && arg4[arg7] == 0) {
					arg3[arg7++] = var19;
				} else {
					arg7++;
				}
			}

			arg7 += arg6;
			arg8 += arg0;
		}
	}
}
