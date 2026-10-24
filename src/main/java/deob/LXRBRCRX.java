package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("LXRBRCRX")
public final class LXRBRCRX extends LRYUPGSZ {

	@ObfuscatedName("LXRBRCRX.K")
	public int[] field889;

	@ObfuscatedName("LXRBRCRX.P")
	public int field894;

	@ObfuscatedName("LXRBRCRX.L")
	public int field890;

	@ObfuscatedName("LXRBRCRX.Q")
	public int field895;

	@ObfuscatedName("LXRBRCRX.M")
	public int field891;

	@ObfuscatedName("LXRBRCRX.O")
	public int field893;

	@ObfuscatedName("LXRBRCRX.N")
	public int field892;

	public LXRBRCRX(int arg0, int arg1) {
		field889 = new int[arg0 * arg1];
		field890 = field894 = arg0;
		field891 = field895 = arg1;
		field892 = field893 = 0;
	}

	public LXRBRCRX(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field890 = var3.getWidth(arg1);
			field891 = var3.getHeight(arg1);
			field894 = field890;
			field895 = field891;
			field892 = 0;
			field893 = 0;
			field889 = new int[field891 * field890];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field890, field891, field889, 0, field890);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public LXRBRCRX(LYZBHNJP arg0, String arg1, int arg2) {
		ZOMNSJJM var4 = new ZOMNSJJM(arg0.method290(arg1 + ".dat", null));
		ZOMNSJJM var5 = new ZOMNSJJM(arg0.method290("index.dat", null));
		var5.field1457 = var4.method549();
		field894 = var5.method549();
		field895 = var5.method549();
		int var6 = var5.method547();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method551();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1457 += 2;
			var4.field1457 += var5.method549() * var5.method549();
			var5.field1457++;
		}

		field892 = var5.method547();
		field893 = var5.method547();
		field890 = var5.method549();
		field891 = var5.method549();
		int var10 = var5.method547();
		int var11 = field891 * field890;
		field889 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field889[var12] = var7[var4.method547()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field890; var13++) {
				for (int var14 = 0; var14 < field891; var14++) {
					field889[field890 * var14 + var13] = var7[var4.method547()];
				}
			}
		}
	}

	@ObfuscatedName("LXRBRCRX.b(I)V")
	public void method276() {
		LRYUPGSZ.method264(field890, field889, field891);
	}

	@ObfuscatedName("LXRBRCRX.a(IZII)V")
	public void method277(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field889.length; var4++) {
			int var5 = field889[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg0;
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
				var8 += arg2;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field889[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("LXRBRCRX.c(I)V")
	public void method278() {
		int[] var1 = new int[field895 * field894];
		for (int var2 = 0; var2 < field891; var2++) {
			for (int var3 = 0; var3 < field890; var3++) {
				var1[(field893 + var2) * field894 + field892 + var3] = field889[field890 * var2 + var3];
			}
		}

		field889 = var1;
		field890 = field894;
		field891 = field895;
		field892 = 0;
		field893 = 0;
	}

	@ObfuscatedName("LXRBRCRX.a(III)V")
	public void method279(int arg0, int arg1) {
		arg0 += field892;
		arg1 += field893;
		int var3 = LRYUPGSZ.field880 * arg1 + arg0;
		int var4 = 0;
		int var5 = field891;
		int var6 = field890;
		int var7 = LRYUPGSZ.field880 - var6;
		int var8 = 0;

		if (arg1 < LRYUPGSZ.field882) {
			int var9 = LRYUPGSZ.field882 - arg1;
			var5 -= var9;
			arg1 = LRYUPGSZ.field882;
			var4 += var6 * var9;
			var3 += LRYUPGSZ.field880 * var9;
		}

		if (arg1 + var5 > LRYUPGSZ.field883) {
			var5 -= arg1 + var5 - LRYUPGSZ.field883;
		}

		if (arg0 < LRYUPGSZ.field884) {
			int var10 = LRYUPGSZ.field884 - arg0;
			var6 -= var10;
			arg0 = LRYUPGSZ.field884;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > LRYUPGSZ.field885) {
			int var11 = arg0 + var6 - LRYUPGSZ.field885;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method280(var7, field889, LRYUPGSZ.field879, var4, var3, var5, var6, var8);
		}
	}

	@ObfuscatedName("LXRBRCRX.a(I[I[IBIIIII)V")
	public void method280(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		int var9 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var10 = -arg5; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg2[arg4++] = arg1[arg3++];
				arg2[arg4++] = arg1[arg3++];
				arg2[arg4++] = arg1[arg3++];
				arg2[arg4++] = arg1[arg3++];
			}

			for (int var12 = arg6; var12 < 0; var12++) {
				arg2[arg4++] = arg1[arg3++];
			}

			arg4 += arg0;
			arg3 += arg7;
		}
	}

	@ObfuscatedName("LXRBRCRX.b(III)V")
	public void method281(int arg0, int arg1) {
		arg1 += field892;
		arg0 += field893;
		int var3 = LRYUPGSZ.field880 * arg0 + arg1;
		int var4 = 0;
		int var5 = field891;
		int var6 = field890;
		int var7 = LRYUPGSZ.field880 - var6;
		int var8 = 0;

		if (arg0 < LRYUPGSZ.field882) {
			int var9 = LRYUPGSZ.field882 - arg0;
			var5 -= var9;
			arg0 = LRYUPGSZ.field882;
			var4 += var6 * var9;
			var3 += LRYUPGSZ.field880 * var9;
		}

		if (arg0 + var5 > LRYUPGSZ.field883) {
			var5 -= arg0 + var5 - LRYUPGSZ.field883;
		}

		if (arg1 < LRYUPGSZ.field884) {
			int var10 = LRYUPGSZ.field884 - arg1;
			var6 -= var10;
			arg1 = LRYUPGSZ.field884;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > LRYUPGSZ.field885) {
			int var11 = arg1 + var6 - LRYUPGSZ.field885;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method282(LRYUPGSZ.field879, field889, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("LXRBRCRX.a([I[IIIIIIII)V")
	public void method282(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("LXRBRCRX.a(IIII)V")
	public void method283(int arg0, int arg1, int arg2) {
		arg2 += field892;
		arg1 += field893;
		int var4 = LRYUPGSZ.field880 * arg1 + arg2;
		int var5 = 0;
		int var6 = field891;
		int var7 = field890;
		int var8 = LRYUPGSZ.field880 - var7;
		int var9 = 0;

		if (arg1 < LRYUPGSZ.field882) {
			int var10 = LRYUPGSZ.field882 - arg1;
			var6 -= var10;
			arg1 = LRYUPGSZ.field882;
			var5 += var7 * var10;
			var4 += LRYUPGSZ.field880 * var10;
		}

		if (arg1 + var6 > LRYUPGSZ.field883) {
			var6 -= arg1 + var6 - LRYUPGSZ.field883;
		}

		if (arg2 < LRYUPGSZ.field884) {
			int var11 = LRYUPGSZ.field884 - arg2;
			var7 -= var11;
			arg2 = LRYUPGSZ.field884;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > LRYUPGSZ.field885) {
			int var12 = arg2 + var7 - LRYUPGSZ.field885;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method284(0, var8, var7, var4, var6, var5, field889, arg0, var9, LRYUPGSZ.field879);
		}
	}

	@ObfuscatedName("LXRBRCRX.a(IIIIIII[III[I)V")
	public void method284(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9) {
		int var11 = 256 - arg7;
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = arg6[arg5++];
				if (var14 == 0) {
					arg3++;
				} else {
					int var15 = arg9[arg3];
					arg9[arg3++] = ((var14 & 0xFF00FF) * arg7 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg7 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg3 += arg1;
			arg5 += arg8;
		}
	}

	@ObfuscatedName("LXRBRCRX.a(III[IIIIII[II)V")
	public void method285(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		try {
			int var11 = -arg1 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg4 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg4 / 326.11D) * 65536.0D);
			var13 = arg5 * var13 >> 8;
			var14 = arg5 * var14 >> 8;
			int var15 = (arg0 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg2 << 16) + var12 * var14 - var11 * var13;
			int var17 = LRYUPGSZ.field880 * arg7 + arg9;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg3[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg8[var18]; var23 < 0; var23++) {
					LRYUPGSZ.field879[var20++] = field889[(var21 >> 16) + (var22 >> 16) * field890];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += LRYUPGSZ.field880;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("LXRBRCRX.a(DIIIIIIII)V")
	public void method286(double arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg7 / 2;
			int var12 = (int) (Math.sin(arg0) * 65536.0D);
			int var13 = (int) (Math.cos(arg0) * 65536.0D);
			var12 = arg1 * var12 >> 8;
			var13 = arg1 * var13 >> 8;
			int var14 = (arg5 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = LRYUPGSZ.field880 * arg3 + arg2;
			for (int var17 = 0; var17 < arg7; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field889[(var19 >> 16) + (var20 >> 16) * field890];
					if (var22 == 0) {
						var18++;
					} else {
						LRYUPGSZ.field879[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += LRYUPGSZ.field880;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("LXRBRCRX.a(BLTAIXVIBM;II)V")
	public void method287(TAIXVIBM arg0, int arg1, int arg2) {
		arg1 += field892;
		arg2 += field893;
		int var4 = LRYUPGSZ.field880 * arg2 + arg1;
		int var5 = 0;
		int var6 = field891;
		int var7 = field890;
		int var8 = LRYUPGSZ.field880 - var7;
		int var9 = 0;

		if (arg2 < LRYUPGSZ.field882) {
			int var10 = LRYUPGSZ.field882 - arg2;
			var6 -= var10;
			arg2 = LRYUPGSZ.field882;
			var5 += var7 * var10;
			var4 += LRYUPGSZ.field880 * var10;
		}

		if (arg2 + var6 > LRYUPGSZ.field883) {
			var6 -= arg2 + var6 - LRYUPGSZ.field883;
		}

		if (arg1 < LRYUPGSZ.field884) {
			int var11 = LRYUPGSZ.field884 - arg1;
			var7 -= var11;
			arg1 = LRYUPGSZ.field884;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > LRYUPGSZ.field885) {
			int var12 = arg1 + var7 - LRYUPGSZ.field885;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method288(0, var9, var5, var7, var4, arg0.field1248, var8, var6, LRYUPGSZ.field879, field889);
		}
	}

	@ObfuscatedName("LXRBRCRX.a(IIIIIB[BII[I[I)V")
	public void method288(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		int var11 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg9[arg2++];
				if (var14 != 0 && arg5[arg4] == 0) {
					arg8[arg4++] = var14;
				} else {
					arg4++;
				}

				int var15 = arg9[arg2++];
				if (var15 != 0 && arg5[arg4] == 0) {
					arg8[arg4++] = var15;
				} else {
					arg4++;
				}

				int var16 = arg9[arg2++];
				if (var16 != 0 && arg5[arg4] == 0) {
					arg8[arg4++] = var16;
				} else {
					arg4++;
				}

				int var17 = arg9[arg2++];
				if (var17 != 0 && arg5[arg4] == 0) {
					arg8[arg4++] = var17;
				} else {
					arg4++;
				}
			}

			for (int var18 = arg3; var18 < 0; var18++) {
				int var19 = arg9[arg2++];
				if (var19 != 0 && arg5[arg4] == 0) {
					arg8[arg4++] = var19;
				} else {
					arg4++;
				}
			}

			arg4 += arg6;
			arg2 += arg1;
		}
	}
}
