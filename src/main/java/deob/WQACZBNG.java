package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("WQACZBNG")
public final class WQACZBNG extends NBXZFIDS {

	@ObfuscatedName("WQACZBNG.G")
	public int[] field1356;

	@ObfuscatedName("WQACZBNG.L")
	public int field1361;

	@ObfuscatedName("WQACZBNG.H")
	public int field1357;

	@ObfuscatedName("WQACZBNG.M")
	public int field1362;

	@ObfuscatedName("WQACZBNG.I")
	public int field1358;

	@ObfuscatedName("WQACZBNG.K")
	public int field1360;

	@ObfuscatedName("WQACZBNG.J")
	public int field1359;

	public WQACZBNG(int arg0, int arg1) {
		field1356 = new int[arg0 * arg1];
		field1357 = field1361 = arg0;
		field1358 = field1362 = arg1;
		field1359 = field1360 = 0;
	}

	public WQACZBNG(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1357 = var3.getWidth(arg1);
			field1358 = var3.getHeight(arg1);
			field1361 = field1357;
			field1362 = field1358;
			field1359 = 0;
			field1360 = 0;
			field1356 = new int[field1358 * field1357];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1357, field1358, field1356, 0, field1357);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public WQACZBNG(XOJZVVDK arg0, String arg1, int arg2) {
		PQBRPYKE var4 = new PQBRPYKE(arg0.method560(arg1 + ".dat", null));
		PQBRPYKE var5 = new PQBRPYKE(arg0.method560("index.dat", null));
		var5.field1091 = var4.method342();
		field1361 = var5.method342();
		field1362 = var5.method342();
		int var6 = var5.method340();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method344();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1091 += 2;
			var4.field1091 += var5.method342() * var5.method342();
			var5.field1091++;
		}

		field1359 = var5.method340();
		field1360 = var5.method340();
		field1357 = var5.method342();
		field1358 = var5.method342();
		int var10 = var5.method340();
		int var11 = field1358 * field1357;
		field1356 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1356[var12] = var7[var4.method340()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1357; var13++) {
				for (int var14 = 0; var14 < field1358; var14++) {
					field1356[field1357 * var14 + var13] = var7[var4.method340()];
				}
			}
		}
	}

	@ObfuscatedName("WQACZBNG.b(I)V")
	public void method543() {
		NBXZFIDS.method286(field1358, field1357, field1356);
	}

	@ObfuscatedName("WQACZBNG.a(ZIII)V")
	public void method544(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1356.length; var4++) {
			int var5 = field1356[var4];
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

				field1356[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("WQACZBNG.b(Z)V")
	public void method545() {
		int[] var1 = new int[field1362 * field1361];
		for (int var2 = 0; var2 < field1358; var2++) {
			for (int var3 = 0; var3 < field1357; var3++) {
				var1[(field1360 + var2) * field1361 + field1359 + var3] = field1356[field1357 * var2 + var3];
			}
		}

		field1356 = var1;
		field1357 = field1361;
		field1358 = field1362;
		field1359 = 0;
		field1360 = 0;
	}

	@ObfuscatedName("WQACZBNG.a(BII)V")
	public void method546(int arg0, int arg1) {
		arg0 += field1359;
		arg1 += field1360;
		int var3 = NBXZFIDS.field1027 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1358;
		int var6 = field1357;
		int var7 = NBXZFIDS.field1027 - var6;
		int var8 = 0;

		if (arg1 < NBXZFIDS.field1029) {
			int var9 = NBXZFIDS.field1029 - arg1;
			var5 -= var9;
			arg1 = NBXZFIDS.field1029;
			var4 += var6 * var9;
			var3 += NBXZFIDS.field1027 * var9;
		}

		if (arg1 + var5 > NBXZFIDS.field1030) {
			var5 -= arg1 + var5 - NBXZFIDS.field1030;
		}

		if (arg0 < NBXZFIDS.field1031) {
			int var10 = NBXZFIDS.field1031 - arg0;
			var6 -= var10;
			arg0 = NBXZFIDS.field1031;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > NBXZFIDS.field1032) {
			int var11 = arg0 + var6 - NBXZFIDS.field1032;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method547(var5, var3, var4, field1356, var7, var6, var8, NBXZFIDS.field1026);
		}
	}

	@ObfuscatedName("WQACZBNG.a(III[IIIBI[I)V")
	public void method547(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var10 = -arg0; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg7[arg1++] = arg3[arg2++];
				arg7[arg1++] = arg3[arg2++];
				arg7[arg1++] = arg3[arg2++];
				arg7[arg1++] = arg3[arg2++];
			}

			for (int var12 = arg5; var12 < 0; var12++) {
				arg7[arg1++] = arg3[arg2++];
			}

			arg1 += arg4;
			arg2 += arg6;
		}
	}

	@ObfuscatedName("WQACZBNG.a(III)V")
	public void method548(int arg0, int arg1) {
		arg1 += field1359;
		arg0 += field1360;
		int var3 = NBXZFIDS.field1027 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1358;
		int var6 = field1357;
		int var7 = NBXZFIDS.field1027 - var6;
		int var8 = 0;

		if (arg0 < NBXZFIDS.field1029) {
			int var9 = NBXZFIDS.field1029 - arg0;
			var5 -= var9;
			arg0 = NBXZFIDS.field1029;
			var4 += var6 * var9;
			var3 += NBXZFIDS.field1027 * var9;
		}

		if (arg0 + var5 > NBXZFIDS.field1030) {
			var5 -= arg0 + var5 - NBXZFIDS.field1030;
		}

		if (arg1 < NBXZFIDS.field1031) {
			int var10 = NBXZFIDS.field1031 - arg1;
			var6 -= var10;
			arg1 = NBXZFIDS.field1031;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > NBXZFIDS.field1032) {
			int var11 = arg1 + var6 - NBXZFIDS.field1032;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method549(NBXZFIDS.field1026, field1356, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("WQACZBNG.a([I[IIIIIIII)V")
	public void method549(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("WQACZBNG.a(IIIZ)V")
	public void method550(int arg0, int arg1, int arg2) {
		arg0 += field1359;
		arg2 += field1360;
		int var4 = NBXZFIDS.field1027 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1358;
		int var7 = field1357;
		int var8 = NBXZFIDS.field1027 - var7;
		int var9 = 0;

		if (arg2 < NBXZFIDS.field1029) {
			int var10 = NBXZFIDS.field1029 - arg2;
			var6 -= var10;
			arg2 = NBXZFIDS.field1029;
			var5 += var7 * var10;
			var4 += NBXZFIDS.field1027 * var10;
		}

		if (arg2 + var6 > NBXZFIDS.field1030) {
			var6 -= arg2 + var6 - NBXZFIDS.field1030;
		}

		if (arg0 < NBXZFIDS.field1031) {
			int var11 = NBXZFIDS.field1031 - arg0;
			var7 -= var11;
			arg0 = NBXZFIDS.field1031;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > NBXZFIDS.field1032) {
			int var12 = arg0 + var7 - NBXZFIDS.field1032;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method551(0, var6, NBXZFIDS.field1026, var4, var8, var9, var5, var7, field1356, arg1);
		}
	}

	@ObfuscatedName("WQACZBNG.a(II[IIIIIII[II)V")
	public void method551(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		int var11 = 256 - arg9;
		for (int var12 = -arg1; var12 < 0; var12++) {
			for (int var13 = -arg7; var13 < 0; var13++) {
				int var14 = arg8[arg6++];
				if (var14 == 0) {
					arg3++;
				} else {
					int var15 = arg2[arg3];
					arg2[arg3++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg3 += arg4;
			arg6 += arg5;
		}
	}

	@ObfuscatedName("WQACZBNG.a(II[IIIII[IIII)V")
	public void method552(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg4 / 2;
			int var12 = -arg7 / 2;
			int var13 = (int) (Math.sin(arg3 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg3 / 326.11D) * 65536.0D);
			var13 = arg1 * var13 >> 8;
			var14 = arg1 * var14 >> 8;
			int var15 = (arg5 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg9 << 16) + var12 * var14 - var11 * var13;
			int var17 = NBXZFIDS.field1027 * arg0 + arg8;
			for (int var18 = 0; var18 < arg7; var18++) {
				int var19 = arg2[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg6[var18]; var23 < 0; var23++) {
					NBXZFIDS.field1026[var20++] = field1356[(var21 >> 16) + (var22 >> 16) * field1357];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += NBXZFIDS.field1027;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("WQACZBNG.a(IIIIDIIII)V")
	public void method553(int arg0, int arg1, int arg2, int arg3, double arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg7 / 2;
			int var12 = (int) (Math.sin(arg4) * 65536.0D);
			int var13 = (int) (Math.cos(arg4) * 65536.0D);
			var12 = arg5 * var12 >> 8;
			var13 = arg5 * var13 >> 8;
			int var14 = (arg6 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg1 << 16) + var11 * var13 - var10 * var12;
			int var16 = NBXZFIDS.field1027 * arg0 + arg3;
			for (int var17 = 0; var17 < arg7; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg2; var21 < 0; var21++) {
					int var22 = field1356[(var19 >> 16) + (var20 >> 16) * field1357];
					if (var22 == 0) {
						var18++;
					} else {
						NBXZFIDS.field1026[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += NBXZFIDS.field1027;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("WQACZBNG.a(IZILVEIVHFHZ;)V")
	public void method554(int arg0, int arg1, VEIVHFHZ arg2) {
		arg1 += field1359;
		arg0 += field1360;
		int var4 = NBXZFIDS.field1027 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1358;
		int var7 = field1357;
		int var8 = NBXZFIDS.field1027 - var7;
		int var9 = 0;

		if (arg0 < NBXZFIDS.field1029) {
			int var10 = NBXZFIDS.field1029 - arg0;
			var6 -= var10;
			arg0 = NBXZFIDS.field1029;
			var5 += var7 * var10;
			var4 += NBXZFIDS.field1027 * var10;
		}

		if (arg0 + var6 > NBXZFIDS.field1030) {
			var6 -= arg0 + var6 - NBXZFIDS.field1030;
		}

		if (arg1 < NBXZFIDS.field1031) {
			int var11 = NBXZFIDS.field1031 - arg1;
			var7 -= var11;
			arg1 = NBXZFIDS.field1031;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > NBXZFIDS.field1032) {
			int var12 = arg1 + var7 - NBXZFIDS.field1032;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method555(var9, field1356, NBXZFIDS.field1026, arg2.field1343, 0, var5, var4, var7, var8, var6);
		}
	}

	@ObfuscatedName("WQACZBNG.a(I[I[I[BIIIIIII)V")
	public void method555(int arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg1[arg5++];
				if (var14 != 0 && arg3[arg6] == 0) {
					arg2[arg6++] = var14;
				} else {
					arg6++;
				}

				int var15 = arg1[arg5++];
				if (var15 != 0 && arg3[arg6] == 0) {
					arg2[arg6++] = var15;
				} else {
					arg6++;
				}

				int var16 = arg1[arg5++];
				if (var16 != 0 && arg3[arg6] == 0) {
					arg2[arg6++] = var16;
				} else {
					arg6++;
				}

				int var17 = arg1[arg5++];
				if (var17 != 0 && arg3[arg6] == 0) {
					arg2[arg6++] = var17;
				} else {
					arg6++;
				}
			}

			for (int var18 = arg7; var18 < 0; var18++) {
				int var19 = arg1[arg5++];
				if (var19 != 0 && arg3[arg6] == 0) {
					arg2[arg6++] = var19;
				} else {
					arg6++;
				}
			}

			arg6 += arg8;
			arg5 += arg0;
		}
	}
}
