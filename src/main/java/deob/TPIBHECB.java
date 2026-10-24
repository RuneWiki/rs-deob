package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("TPIBHECB")
public final class TPIBHECB extends BAXODNVH {

	@ObfuscatedName("TPIBHECB.F")
	public int[] field1219;

	@ObfuscatedName("TPIBHECB.K")
	public int field1224;

	@ObfuscatedName("TPIBHECB.G")
	public int field1220;

	@ObfuscatedName("TPIBHECB.L")
	public int field1225;

	@ObfuscatedName("TPIBHECB.H")
	public int field1221;

	@ObfuscatedName("TPIBHECB.J")
	public int field1223;

	@ObfuscatedName("TPIBHECB.I")
	public int field1222;

	public TPIBHECB(int arg0, int arg1) {
		field1219 = new int[arg0 * arg1];
		field1220 = field1224 = arg0;
		field1221 = field1225 = arg1;
		field1222 = field1223 = 0;
	}

	public TPIBHECB(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1220 = var3.getWidth(arg1);
			field1221 = var3.getHeight(arg1);
			field1224 = field1220;
			field1225 = field1221;
			field1222 = 0;
			field1223 = 0;
			field1219 = new int[field1221 * field1220];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1220, field1221, field1219, 0, field1220);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public TPIBHECB(UUIGNTAD arg0, String arg1, int arg2) {
		CMGGUSPR var4 = new CMGGUSPR(arg0.method545(arg1 + ".dat", null));
		CMGGUSPR var5 = new CMGGUSPR(arg0.method545("index.dat", null));
		var5.field540 = var4.method196();
		field1224 = var5.method196();
		field1225 = var5.method196();
		int var6 = var5.method194();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method198();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field540 += 2;
			var4.field540 += var5.method196() * var5.method196();
			var5.field540++;
		}

		field1222 = var5.method194();
		field1223 = var5.method194();
		field1220 = var5.method196();
		field1221 = var5.method196();
		int var10 = var5.method194();
		int var11 = field1221 * field1220;
		field1219 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1219[var12] = var7[var4.method194()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1220; var13++) {
				for (int var14 = 0; var14 < field1221; var14++) {
					field1219[field1220 * var14 + var13] = var7[var4.method194()];
				}
			}
		}
	}

	@ObfuscatedName("TPIBHECB.a(B)V")
	public void method502() {
		BAXODNVH.method17(field1220, field1219, field1221);
	}

	@ObfuscatedName("TPIBHECB.a(IZII)V")
	public void method503(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1219.length; var4++) {
			int var5 = field1219[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg1;
				if (var6 < 1) {
					var6 = 1;
				} else if (var6 > 255) {
					var6 = 255;
				}

				int var7 = var5 >> 8 & 0xFF;
				var7 += arg0;
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

				field1219[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("TPIBHECB.a(Z)V")
	public void method504() {
		int[] var1 = new int[field1225 * field1224];
		for (int var2 = 0; var2 < field1221; var2++) {
			for (int var3 = 0; var3 < field1220; var3++) {
				var1[(field1223 + var2) * field1224 + field1222 + var3] = field1219[field1220 * var2 + var3];
			}
		}

		field1219 = var1;
		field1220 = field1224;
		field1221 = field1225;
		field1222 = 0;
		field1223 = 0;
	}

	@ObfuscatedName("TPIBHECB.a(III)V")
	public void method505(int arg0, int arg1) {
		arg1 += field1222;
		arg0 += field1223;
		int var3 = BAXODNVH.field32 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1221;
		int var6 = field1220;
		int var7 = BAXODNVH.field32 - var6;
		int var8 = 0;

		if (arg0 < BAXODNVH.field34) {
			int var9 = BAXODNVH.field34 - arg0;
			var5 -= var9;
			arg0 = BAXODNVH.field34;
			var4 += var6 * var9;
			var3 += BAXODNVH.field32 * var9;
		}

		if (arg0 + var5 > BAXODNVH.field35) {
			var5 -= arg0 + var5 - BAXODNVH.field35;
		}

		if (arg1 < BAXODNVH.field36) {
			int var10 = BAXODNVH.field36 - arg1;
			var6 -= var10;
			arg1 = BAXODNVH.field36;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > BAXODNVH.field37) {
			int var11 = arg1 + var6 - BAXODNVH.field37;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method506(field1219, var3, var8, var5, var4, var6, var7, BAXODNVH.field31);
		}
	}

	@ObfuscatedName("TPIBHECB.a([IIIIIIII[I)V")
	public void method506(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var10 = -arg3; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg7[arg1++] = arg0[arg4++];
				arg7[arg1++] = arg0[arg4++];
				arg7[arg1++] = arg0[arg4++];
				arg7[arg1++] = arg0[arg4++];
			}

			for (int var12 = arg5; var12 < 0; var12++) {
				arg7[arg1++] = arg0[arg4++];
			}

			arg1 += arg6;
			arg4 += arg2;
		}
	}

	@ObfuscatedName("TPIBHECB.a(IBI)V")
	public void method507(int arg0, int arg1) {
		arg0 += field1222;
		arg1 += field1223;
		int var3 = BAXODNVH.field32 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1221;
		int var6 = field1220;
		int var7 = BAXODNVH.field32 - var6;
		int var8 = 0;

		if (arg1 < BAXODNVH.field34) {
			int var9 = BAXODNVH.field34 - arg1;
			var5 -= var9;
			arg1 = BAXODNVH.field34;
			var4 += var6 * var9;
			var3 += BAXODNVH.field32 * var9;
		}

		if (arg1 + var5 > BAXODNVH.field35) {
			var5 -= arg1 + var5 - BAXODNVH.field35;
		}

		if (arg0 < BAXODNVH.field36) {
			int var10 = BAXODNVH.field36 - arg0;
			var6 -= var10;
			arg0 = BAXODNVH.field36;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > BAXODNVH.field37) {
			int var11 = arg0 + var6 - BAXODNVH.field37;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method508(BAXODNVH.field31, field1219, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("TPIBHECB.a([I[IIIIIIII)V")
	public void method508(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("TPIBHECB.a(IIBI)V")
	public void method509(int arg0, int arg1, int arg2) {
		arg0 += field1222;
		arg2 += field1223;
		int var4 = BAXODNVH.field32 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1221;
		int var7 = field1220;
		int var8 = BAXODNVH.field32 - var7;
		int var9 = 0;

		if (arg2 < BAXODNVH.field34) {
			int var10 = BAXODNVH.field34 - arg2;
			var6 -= var10;
			arg2 = BAXODNVH.field34;
			var5 += var7 * var10;
			var4 += BAXODNVH.field32 * var10;
		}

		if (arg2 + var6 > BAXODNVH.field35) {
			var6 -= arg2 + var6 - BAXODNVH.field35;
		}

		if (arg0 < BAXODNVH.field36) {
			int var11 = BAXODNVH.field36 - arg0;
			var7 -= var11;
			arg0 = BAXODNVH.field36;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > BAXODNVH.field37) {
			int var12 = arg0 + var7 - BAXODNVH.field37;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method510(field1219, var8, var5, BAXODNVH.field31, arg1, var7, var4, var6, 0, var9);
		}
	}

	@ObfuscatedName("TPIBHECB.a([IIBI[IIIIIII)V")
	public void method510(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = 256 - arg4;
		for (int var12 = -arg7; var12 < 0; var12++) {
			for (int var13 = -arg5; var13 < 0; var13++) {
				int var14 = arg0[arg2++];
				if (var14 == 0) {
					arg6++;
				} else {
					int var15 = arg3[arg6];
					arg3[arg6++] = ((var14 & 0xFF00FF) * arg4 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg4 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg6 += arg1;
			arg2 += arg9;
		}
	}

	@ObfuscatedName("TPIBHECB.a(II[II[IIIIIII)V")
	public void method511(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg1 / 2;
			int var12 = -arg6 / 2;
			int var13 = (int) (Math.sin(arg0 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg0 / 326.11D) * 65536.0D);
			var13 = arg3 * var13 >> 8;
			var14 = arg3 * var14 >> 8;
			int var15 = (arg9 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg5 << 16) + var12 * var14 - var11 * var13;
			int var17 = BAXODNVH.field32 * arg7 + arg8;
			for (int var18 = 0; var18 < arg6; var18++) {
				int var19 = arg2[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg4[var18]; var23 < 0; var23++) {
					BAXODNVH.field31[var20++] = field1219[(var21 >> 16) + (var22 >> 16) * field1220];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += BAXODNVH.field32;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("TPIBHECB.a(IDIIIIIII)V")
	public void method512(double arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg1 / 2;
			int var11 = -arg5 / 2;
			int var12 = (int) (Math.sin(arg0) * 65536.0D);
			int var13 = (int) (Math.cos(arg0) * 65536.0D);
			var12 = arg2 * var12 >> 8;
			var13 = arg2 * var13 >> 8;
			int var14 = (arg7 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg3 << 16) + var11 * var13 - var10 * var12;
			int var16 = BAXODNVH.field32 * arg4 + arg6;
			for (int var17 = 0; var17 < arg5; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg1; var21 < 0; var21++) {
					int var22 = field1219[(var19 >> 16) + (var20 >> 16) * field1220];
					if (var22 == 0) {
						var18++;
					} else {
						BAXODNVH.field31[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += BAXODNVH.field32;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("TPIBHECB.a(IIILOCPHNIUN;)V")
	public void method513(int arg0, int arg1, OCPHNIUN arg2) {
		arg0 += field1222;
		arg1 += field1223;
		int var4 = BAXODNVH.field32 * arg1 + arg0;
		int var5 = 0;
		int var6 = field1221;
		int var7 = field1220;
		int var8 = BAXODNVH.field32 - var7;
		int var9 = 0;

		if (arg1 < BAXODNVH.field34) {
			int var10 = BAXODNVH.field34 - arg1;
			var6 -= var10;
			arg1 = BAXODNVH.field34;
			var5 += var7 * var10;
			var4 += BAXODNVH.field32 * var10;
		}

		if (arg1 + var6 > BAXODNVH.field35) {
			var6 -= arg1 + var6 - BAXODNVH.field35;
		}

		if (arg0 < BAXODNVH.field36) {
			int var11 = BAXODNVH.field36 - arg0;
			var7 -= var11;
			arg0 = BAXODNVH.field36;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > BAXODNVH.field37) {
			int var12 = arg0 + var7 - BAXODNVH.field37;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method514(var4, var8, var6, BAXODNVH.field31, var7, var9, 0, field1219, arg2.field982, var5);
		}
	}

	@ObfuscatedName("TPIBHECB.a(III[IIIII[I[BI)V")
	public void method514(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, byte[] arg8, int arg9) {
		int var11 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg7[arg9++];
				if (var14 != 0 && arg8[arg0] == 0) {
					arg3[arg0++] = var14;
				} else {
					arg0++;
				}

				int var15 = arg7[arg9++];
				if (var15 != 0 && arg8[arg0] == 0) {
					arg3[arg0++] = var15;
				} else {
					arg0++;
				}

				int var16 = arg7[arg9++];
				if (var16 != 0 && arg8[arg0] == 0) {
					arg3[arg0++] = var16;
				} else {
					arg0++;
				}

				int var17 = arg7[arg9++];
				if (var17 != 0 && arg8[arg0] == 0) {
					arg3[arg0++] = var17;
				} else {
					arg0++;
				}
			}

			for (int var18 = arg4; var18 < 0; var18++) {
				int var19 = arg7[arg9++];
				if (var19 != 0 && arg8[arg0] == 0) {
					arg3[arg0++] = var19;
				} else {
					arg0++;
				}
			}

			arg0 += arg1;
			arg9 += arg5;
		}
	}
}
