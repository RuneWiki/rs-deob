package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("BFUTXOBU")
public final class BFUTXOBU extends KVJNUKIT {

	@ObfuscatedName("BFUTXOBU.H")
	public int[] field29;

	@ObfuscatedName("BFUTXOBU.M")
	public int field34;

	@ObfuscatedName("BFUTXOBU.I")
	public int field30;

	@ObfuscatedName("BFUTXOBU.N")
	public int field35;

	@ObfuscatedName("BFUTXOBU.J")
	public int field31;

	@ObfuscatedName("BFUTXOBU.L")
	public int field33;

	@ObfuscatedName("BFUTXOBU.K")
	public int field32;

	public BFUTXOBU(int arg0, int arg1) {
		field29 = new int[arg0 * arg1];
		field30 = field34 = arg0;
		field31 = field35 = arg1;
		field32 = field33 = 0;
	}

	public BFUTXOBU(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field30 = var3.getWidth(arg1);
			field31 = var3.getHeight(arg1);
			field34 = field30;
			field35 = field31;
			field32 = 0;
			field33 = 0;
			field29 = new int[field31 * field30];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field30, field31, field29, 0, field30);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public BFUTXOBU(XMRRKSSB arg0, String arg1, int arg2) {
		XQPFGONL var4 = new XQPFGONL(arg0.method465(arg1 + ".dat", null));
		XQPFGONL var5 = new XQPFGONL(arg0.method465("index.dat", null));
		var5.field1335 = var4.method480();
		field34 = var5.method480();
		field35 = var5.method480();
		int var6 = var5.method478();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method482();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1335 += 2;
			var4.field1335 += var5.method480() * var5.method480();
			var5.field1335++;
		}

		field32 = var5.method478();
		field33 = var5.method478();
		field30 = var5.method480();
		field31 = var5.method480();
		int var10 = var5.method478();
		int var11 = field31 * field30;
		field29 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field29[var12] = var7[var4.method478()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field30; var13++) {
				for (int var14 = 0; var14 < field31; var14++) {
					field29[field30 * var14 + var13] = var7[var4.method478()];
				}
			}
		}
	}

	@ObfuscatedName("BFUTXOBU.b(Z)V")
	public void method8() {
		KVJNUKIT.method339(field31, field30, field29);
	}

	@ObfuscatedName("BFUTXOBU.a(IIII)V")
	public void method9(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field29.length; var4++) {
			int var5 = field29[var4];
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

				field29[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("BFUTXOBU.b(B)V")
	public void method10() {
		int[] var1 = new int[field35 * field34];
		for (int var2 = 0; var2 < field31; var2++) {
			for (int var3 = 0; var3 < field30; var3++) {
				var1[(field33 + var2) * field34 + field32 + var3] = field29[field30 * var2 + var3];
			}
		}

		field29 = var1;
		field30 = field34;
		field31 = field35;
		field32 = 0;
		field33 = 0;
	}

	@ObfuscatedName("BFUTXOBU.a(III)V")
	public void method11(int arg0, int arg1) {
		arg0 += field32;
		arg1 += field33;
		int var3 = KVJNUKIT.field952 * arg1 + arg0;
		int var4 = 0;
		int var5 = field31;
		int var6 = field30;
		int var7 = KVJNUKIT.field952 - var6;
		int var8 = 0;

		if (arg1 < KVJNUKIT.field954) {
			int var9 = KVJNUKIT.field954 - arg1;
			var5 -= var9;
			arg1 = KVJNUKIT.field954;
			var4 += var6 * var9;
			var3 += KVJNUKIT.field952 * var9;
		}

		if (arg1 + var5 > KVJNUKIT.field955) {
			var5 -= arg1 + var5 - KVJNUKIT.field955;
		}

		if (arg0 < KVJNUKIT.field956) {
			int var10 = KVJNUKIT.field956 - arg0;
			var6 -= var10;
			arg0 = KVJNUKIT.field956;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > KVJNUKIT.field957) {
			int var11 = arg0 + var6 - KVJNUKIT.field957;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method12(KVJNUKIT.field951, field29, var4, var6, var7, var8, var5, var3);
		}
	}

	@ObfuscatedName("BFUTXOBU.a([I[IIIIIBII)V")
	public void method12(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var10 = -arg6; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg0[arg7++] = arg1[arg2++];
				arg0[arg7++] = arg1[arg2++];
				arg0[arg7++] = arg1[arg2++];
				arg0[arg7++] = arg1[arg2++];
			}

			for (int var12 = arg3; var12 < 0; var12++) {
				arg0[arg7++] = arg1[arg2++];
			}

			arg7 += arg4;
			arg2 += arg5;
		}
	}

	@ObfuscatedName("BFUTXOBU.b(III)V")
	public void method13(int arg0, int arg1) {
		arg1 += field32;
		arg0 += field33;
		int var3 = KVJNUKIT.field952 * arg0 + arg1;
		int var4 = 0;
		int var5 = field31;
		int var6 = field30;
		int var7 = KVJNUKIT.field952 - var6;
		int var8 = 0;

		if (arg0 < KVJNUKIT.field954) {
			int var9 = KVJNUKIT.field954 - arg0;
			var5 -= var9;
			arg0 = KVJNUKIT.field954;
			var4 += var6 * var9;
			var3 += KVJNUKIT.field952 * var9;
		}

		if (arg0 + var5 > KVJNUKIT.field955) {
			var5 -= arg0 + var5 - KVJNUKIT.field955;
		}

		if (arg1 < KVJNUKIT.field956) {
			int var10 = KVJNUKIT.field956 - arg1;
			var6 -= var10;
			arg1 = KVJNUKIT.field956;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > KVJNUKIT.field957) {
			int var11 = arg1 + var6 - KVJNUKIT.field957;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method14(KVJNUKIT.field951, field29, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("BFUTXOBU.a([I[IIIIIIII)V")
	public void method14(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("BFUTXOBU.a(IIIZ)V")
	public void method15(int arg0, int arg1, int arg2) {
		arg1 += field32;
		arg2 += field33;
		int var4 = KVJNUKIT.field952 * arg2 + arg1;
		int var5 = 0;
		int var6 = field31;
		int var7 = field30;
		int var8 = KVJNUKIT.field952 - var7;
		int var9 = 0;

		if (arg2 < KVJNUKIT.field954) {
			int var10 = KVJNUKIT.field954 - arg2;
			var6 -= var10;
			arg2 = KVJNUKIT.field954;
			var5 += var7 * var10;
			var4 += KVJNUKIT.field952 * var10;
		}

		if (arg2 + var6 > KVJNUKIT.field955) {
			var6 -= arg2 + var6 - KVJNUKIT.field955;
		}

		if (arg1 < KVJNUKIT.field956) {
			int var11 = KVJNUKIT.field956 - arg1;
			var7 -= var11;
			arg1 = KVJNUKIT.field956;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > KVJNUKIT.field957) {
			int var12 = arg1 + var7 - KVJNUKIT.field957;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method16(var9, var7, var6, field29, var5, 0, arg0, KVJNUKIT.field951, var8, var4);
		}
	}

	@ObfuscatedName("BFUTXOBU.a(IIII[IIII[III)V")
	public void method16(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg6;
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = arg3[arg4++];
				if (var14 == 0) {
					arg9++;
				} else {
					int var15 = arg7[arg9];
					arg7[arg9++] = ((var14 & 0xFF00FF) * arg6 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg6 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg9 += arg8;
			arg4 += arg0;
		}
	}

	@ObfuscatedName("BFUTXOBU.a([I[IIIIIIIIII)V")
	public void method17(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg9 / 2;
			int var12 = -arg2 / 2;
			int var13 = (int) (Math.sin(arg5 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg5 / 326.11D) * 65536.0D);
			var13 = arg8 * var13 >> 8;
			var14 = arg8 * var14 >> 8;
			int var15 = (arg4 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg7 << 16) + var12 * var14 - var11 * var13;
			int var17 = KVJNUKIT.field952 * arg3 + arg6;
			for (int var18 = 0; var18 < arg2; var18++) {
				int var19 = arg0[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg1[var18]; var23 < 0; var23++) {
					KVJNUKIT.field951[var20++] = field29[(var21 >> 16) + (var22 >> 16) * field30];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += KVJNUKIT.field952;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("BFUTXOBU.a(IIIDIIIII)V")
	public void method18(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg4 / 2;
			int var11 = -arg1 / 2;
			int var12 = (int) (Math.sin(arg2) * 65536.0D);
			int var13 = (int) (Math.cos(arg2) * 65536.0D);
			var12 = arg3 * var12 >> 8;
			var13 = arg3 * var13 >> 8;
			int var14 = (arg5 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg6 << 16) + var11 * var13 - var10 * var12;
			int var16 = KVJNUKIT.field952 * arg7 + arg0;
			for (int var17 = 0; var17 < arg1; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg4; var21 < 0; var21++) {
					int var22 = field29[(var19 >> 16) + (var20 >> 16) * field30];
					if (var22 == 0) {
						var18++;
					} else {
						KVJNUKIT.field951[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += KVJNUKIT.field952;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("BFUTXOBU.a(ILYPWLUGYN;II)V")
	public void method19(YPWLUGYN arg0, int arg1, int arg2) {
		arg2 += field32;
		arg1 += field33;
		int var4 = KVJNUKIT.field952 * arg1 + arg2;
		int var5 = 0;
		int var6 = field31;
		int var7 = field30;
		int var8 = KVJNUKIT.field952 - var7;
		int var9 = 0;

		if (arg1 < KVJNUKIT.field954) {
			int var10 = KVJNUKIT.field954 - arg1;
			var6 -= var10;
			arg1 = KVJNUKIT.field954;
			var5 += var7 * var10;
			var4 += KVJNUKIT.field952 * var10;
		}

		if (arg1 + var6 > KVJNUKIT.field955) {
			var6 -= arg1 + var6 - KVJNUKIT.field955;
		}

		if (arg2 < KVJNUKIT.field956) {
			int var11 = KVJNUKIT.field956 - arg2;
			var7 -= var11;
			arg2 = KVJNUKIT.field956;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > KVJNUKIT.field957) {
			int var12 = arg2 + var7 - KVJNUKIT.field957;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method20(var4, var6, arg0.field1374, 0, KVJNUKIT.field951, var7, var9, var8, var5, field29);
		}
	}

	@ObfuscatedName("BFUTXOBU.a(III[BI[IIIII[I)V")
	public void method20(int arg0, int arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		int var11 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg9[arg8++];
				if (var14 != 0 && arg2[arg0] == 0) {
					arg4[arg0++] = var14;
				} else {
					arg0++;
				}

				int var15 = arg9[arg8++];
				if (var15 != 0 && arg2[arg0] == 0) {
					arg4[arg0++] = var15;
				} else {
					arg0++;
				}

				int var16 = arg9[arg8++];
				if (var16 != 0 && arg2[arg0] == 0) {
					arg4[arg0++] = var16;
				} else {
					arg0++;
				}

				int var17 = arg9[arg8++];
				if (var17 != 0 && arg2[arg0] == 0) {
					arg4[arg0++] = var17;
				} else {
					arg0++;
				}
			}

			for (int var18 = arg5; var18 < 0; var18++) {
				int var19 = arg9[arg8++];
				if (var19 != 0 && arg2[arg0] == 0) {
					arg4[arg0++] = var19;
				} else {
					arg0++;
				}
			}

			arg0 += arg7;
			arg8 += arg6;
		}
	}
}
