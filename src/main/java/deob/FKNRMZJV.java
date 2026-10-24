package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("FKNRMZJV")
public final class FKNRMZJV extends VMBJKBNJ {

	@ObfuscatedName("FKNRMZJV.H")
	public int[] field590;

	@ObfuscatedName("FKNRMZJV.M")
	public int field595;

	@ObfuscatedName("FKNRMZJV.I")
	public int field591;

	@ObfuscatedName("FKNRMZJV.N")
	public int field596;

	@ObfuscatedName("FKNRMZJV.J")
	public int field592;

	@ObfuscatedName("FKNRMZJV.L")
	public int field594;

	@ObfuscatedName("FKNRMZJV.K")
	public int field593;

	public FKNRMZJV(int arg0, int arg1) {
		field590 = new int[arg0 * arg1];
		field591 = field595 = arg0;
		field592 = field596 = arg1;
		field593 = field594 = 0;
	}

	public FKNRMZJV(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field591 = var3.getWidth(arg1);
			field592 = var3.getHeight(arg1);
			field595 = field591;
			field596 = field592;
			field593 = 0;
			field594 = 0;
			field590 = new int[field592 * field591];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field591, field592, field590, 0, field591);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public FKNRMZJV(RSPRYUFS arg0, String arg1, int arg2) {
		NQUAUMDT var4 = new NQUAUMDT(arg0.method427(arg1 + ".dat", null));
		NQUAUMDT var5 = new NQUAUMDT(arg0.method427("index.dat", null));
		var5.field929 = var4.method341();
		field595 = var5.method341();
		field596 = var5.method341();
		int var6 = var5.method339();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method343();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field929 += 2;
			var4.field929 += var5.method341() * var5.method341();
			var5.field929++;
		}

		field593 = var5.method339();
		field594 = var5.method339();
		field591 = var5.method341();
		field592 = var5.method341();
		int var10 = var5.method339();
		int var11 = field592 * field591;
		field590 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field590[var12] = var7[var4.method339()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field591; var13++) {
				for (int var14 = 0; var14 < field592; var14++) {
					field590[field591 * var14 + var13] = var7[var4.method339()];
				}
			}
		}
	}

	@ObfuscatedName("FKNRMZJV.a(Z)V")
	public void method180() {
		VMBJKBNJ.method542(field592, field591, field590);
	}

	@ObfuscatedName("FKNRMZJV.a(IIII)V")
	public void method181(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field590.length; var4++) {
			int var5 = field590[var4];
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

				field590[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("FKNRMZJV.b(I)V")
	public void method182() {
		int[] var1 = new int[field596 * field595];
		for (int var2 = 0; var2 < field592; var2++) {
			for (int var3 = 0; var3 < field591; var3++) {
				var1[(field594 + var2) * field595 + field593 + var3] = field590[field591 * var2 + var3];
			}
		}

		field590 = var1;
		field591 = field595;
		field592 = field596;
		field593 = 0;
		field594 = 0;
	}

	@ObfuscatedName("FKNRMZJV.a(IBI)V")
	public void method183(int arg0, int arg1) {
		arg0 += field593;
		arg1 += field594;
		int var3 = VMBJKBNJ.field1284 * arg1 + arg0;
		int var4 = 0;
		int var5 = field592;
		int var6 = field591;
		int var7 = VMBJKBNJ.field1284 - var6;
		int var8 = 0;

		if (arg1 < VMBJKBNJ.field1286) {
			int var9 = VMBJKBNJ.field1286 - arg1;
			var5 -= var9;
			arg1 = VMBJKBNJ.field1286;
			var4 += var6 * var9;
			var3 += VMBJKBNJ.field1284 * var9;
		}

		if (arg1 + var5 > VMBJKBNJ.field1287) {
			var5 -= arg1 + var5 - VMBJKBNJ.field1287;
		}

		if (arg0 < VMBJKBNJ.field1288) {
			int var10 = VMBJKBNJ.field1288 - arg0;
			var6 -= var10;
			arg0 = VMBJKBNJ.field1288;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > VMBJKBNJ.field1289) {
			int var11 = arg0 + var6 - VMBJKBNJ.field1289;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method184(var5, VMBJKBNJ.field1283, var8, field590, var4, var3, var7, var6);
		}
	}

	@ObfuscatedName("FKNRMZJV.a(I[III[IIIII)V")
	public void method184(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var10 = -arg0; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg1[arg5++] = arg3[arg4++];
				arg1[arg5++] = arg3[arg4++];
				arg1[arg5++] = arg3[arg4++];
				arg1[arg5++] = arg3[arg4++];
			}

			for (int var12 = arg7; var12 < 0; var12++) {
				arg1[arg5++] = arg3[arg4++];
			}

			arg5 += arg6;
			arg4 += arg2;
		}
	}

	@ObfuscatedName("FKNRMZJV.a(III)V")
	public void method185(int arg0, int arg1) {
		arg1 += field593;
		arg0 += field594;
		int var3 = VMBJKBNJ.field1284 * arg0 + arg1;
		int var4 = 0;
		int var5 = field592;
		int var6 = field591;
		int var7 = VMBJKBNJ.field1284 - var6;
		int var8 = 0;

		if (arg0 < VMBJKBNJ.field1286) {
			int var9 = VMBJKBNJ.field1286 - arg0;
			var5 -= var9;
			arg0 = VMBJKBNJ.field1286;
			var4 += var6 * var9;
			var3 += VMBJKBNJ.field1284 * var9;
		}

		if (arg0 + var5 > VMBJKBNJ.field1287) {
			var5 -= arg0 + var5 - VMBJKBNJ.field1287;
		}

		if (arg1 < VMBJKBNJ.field1288) {
			int var10 = VMBJKBNJ.field1288 - arg1;
			var6 -= var10;
			arg1 = VMBJKBNJ.field1288;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > VMBJKBNJ.field1289) {
			int var11 = arg1 + var6 - VMBJKBNJ.field1289;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method186(VMBJKBNJ.field1283, field590, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("FKNRMZJV.a([I[IIIIIIII)V")
	public void method186(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("FKNRMZJV.b(IIII)V")
	public void method187(int arg0, int arg1, int arg2) {
		arg0 += field593;
		arg1 += field594;
		int var4 = VMBJKBNJ.field1284 * arg1 + arg0;
		int var5 = 0;
		int var6 = field592;
		int var7 = field591;
		int var8 = VMBJKBNJ.field1284 - var7;
		int var9 = 0;

		if (arg1 < VMBJKBNJ.field1286) {
			int var10 = VMBJKBNJ.field1286 - arg1;
			var6 -= var10;
			arg1 = VMBJKBNJ.field1286;
			var5 += var7 * var10;
			var4 += VMBJKBNJ.field1284 * var10;
		}

		if (arg1 + var6 > VMBJKBNJ.field1287) {
			var6 -= arg1 + var6 - VMBJKBNJ.field1287;
		}

		if (arg0 < VMBJKBNJ.field1288) {
			int var11 = VMBJKBNJ.field1288 - arg0;
			var7 -= var11;
			arg0 = VMBJKBNJ.field1288;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > VMBJKBNJ.field1289) {
			int var12 = arg0 + var7 - VMBJKBNJ.field1289;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method188(var7, 0, arg2, var5, var8, var4, var6, var9, VMBJKBNJ.field1283, field590);
		}
	}

	@ObfuscatedName("FKNRMZJV.a(IIIIIIIII[I[I)V")
	public void method188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		int var11 = 256 - arg2;
		for (int var12 = -arg6; var12 < 0; var12++) {
			for (int var13 = -arg0; var13 < 0; var13++) {
				int var14 = arg9[arg3++];
				if (var14 == 0) {
					arg5++;
				} else {
					int var15 = arg8[arg5];
					arg8[arg5++] = ((var14 & 0xFF00FF) * arg2 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg2 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg5 += arg4;
			arg3 += arg7;
		}
	}

	@ObfuscatedName("FKNRMZJV.b(IIIIIIIII[I[I)V")
	public void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		try {
			int var11 = -arg3 / 2;
			int var12 = -arg1 / 2;
			int var13 = (int) (Math.sin(arg7 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg7 / 326.11D) * 65536.0D);
			var13 = arg6 * var13 >> 8;
			var14 = arg6 * var14 >> 8;
			int var15 = (arg2 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg4 << 16) + var12 * var14 - var11 * var13;
			int var17 = VMBJKBNJ.field1284 * arg0 + arg5;
			for (int var18 = 0; var18 < arg1; var18++) {
				int var19 = arg9[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg8[var18]; var23 < 0; var23++) {
					VMBJKBNJ.field1283[var20++] = field590[(var21 >> 16) + (var22 >> 16) * field591];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += VMBJKBNJ.field1284;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("FKNRMZJV.a(IIIIIIIID)V")
	public void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg3 / 2;
			int var12 = (int) (Math.sin(arg7) * 65536.0D);
			int var13 = (int) (Math.cos(arg7) * 65536.0D);
			var12 = arg1 * var12 >> 8;
			var13 = arg1 * var13 >> 8;
			int var14 = (arg4 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg5 << 16) + var11 * var13 - var10 * var12;
			int var16 = VMBJKBNJ.field1284 * arg0 + arg6;
			for (int var17 = 0; var17 < arg3; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg2; var21 < 0; var21++) {
					int var22 = field590[(var19 >> 16) + (var20 >> 16) * field591];
					if (var22 == 0) {
						var18++;
					} else {
						VMBJKBNJ.field1283[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += VMBJKBNJ.field1284;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("FKNRMZJV.a(IIBLUZETOFZZ;)V")
	public void method191(int arg0, int arg1, UZETOFZZ arg2) {
		arg0 += field593;
		arg1 += field594;
		int var4 = VMBJKBNJ.field1284 * arg1 + arg0;
		int var5 = 0;
		int var6 = field592;
		int var7 = field591;
		int var8 = VMBJKBNJ.field1284 - var7;
		int var9 = 0;

		if (arg1 < VMBJKBNJ.field1286) {
			int var10 = VMBJKBNJ.field1286 - arg1;
			var6 -= var10;
			arg1 = VMBJKBNJ.field1286;
			var5 += var7 * var10;
			var4 += VMBJKBNJ.field1284 * var10;
		}

		if (arg1 + var6 > VMBJKBNJ.field1287) {
			var6 -= arg1 + var6 - VMBJKBNJ.field1287;
		}

		if (arg0 < VMBJKBNJ.field1288) {
			int var11 = VMBJKBNJ.field1288 - arg0;
			var7 -= var11;
			arg0 = VMBJKBNJ.field1288;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > VMBJKBNJ.field1289) {
			int var12 = arg0 + var7 - VMBJKBNJ.field1289;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method192(VMBJKBNJ.field1283, var6, var8, var5, 0, var4, field590, arg2.field1202, var9, var7);
		}
	}

	@ObfuscatedName("FKNRMZJV.a([IZIIIII[I[BII)V")
	public void method192(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, byte[] arg7, int arg8, int arg9) {
		int var11 = -(arg9 >> 2);
		arg9 = -(arg9 & 0x3);
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg6[arg3++];
				if (var14 != 0 && arg7[arg5] == 0) {
					arg0[arg5++] = var14;
				} else {
					arg5++;
				}

				int var15 = arg6[arg3++];
				if (var15 != 0 && arg7[arg5] == 0) {
					arg0[arg5++] = var15;
				} else {
					arg5++;
				}

				int var16 = arg6[arg3++];
				if (var16 != 0 && arg7[arg5] == 0) {
					arg0[arg5++] = var16;
				} else {
					arg5++;
				}

				int var17 = arg6[arg3++];
				if (var17 != 0 && arg7[arg5] == 0) {
					arg0[arg5++] = var17;
				} else {
					arg5++;
				}
			}

			for (int var18 = arg9; var18 < 0; var18++) {
				int var19 = arg6[arg3++];
				if (var19 != 0 && arg7[arg5] == 0) {
					arg0[arg5++] = var19;
				} else {
					arg5++;
				}
			}

			arg5 += arg2;
			arg3 += arg8;
		}
	}
}
