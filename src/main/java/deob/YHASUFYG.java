package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("YHASUFYG")
public final class YHASUFYG extends DSAVPBJG {

	@ObfuscatedName("YHASUFYG.H")
	public int[] field1450;

	@ObfuscatedName("YHASUFYG.M")
	public int field1455;

	@ObfuscatedName("YHASUFYG.I")
	public int field1451;

	@ObfuscatedName("YHASUFYG.N")
	public int field1456;

	@ObfuscatedName("YHASUFYG.J")
	public int field1452;

	@ObfuscatedName("YHASUFYG.L")
	public int field1454;

	@ObfuscatedName("YHASUFYG.K")
	public int field1453;

	public YHASUFYG(int arg0, int arg1) {
		field1450 = new int[arg0 * arg1];
		field1451 = field1455 = arg0;
		field1452 = field1456 = arg1;
		field1453 = field1454 = 0;
	}

	public YHASUFYG(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1451 = var3.getWidth(arg1);
			field1452 = var3.getHeight(arg1);
			field1455 = field1451;
			field1456 = field1452;
			field1453 = 0;
			field1454 = 0;
			field1450 = new int[field1452 * field1451];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1451, field1452, field1450, 0, field1451);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public YHASUFYG(BYZSQZUF arg0, String arg1, int arg2) {
		IMUIZRAF var4 = new IMUIZRAF(arg0.method29(arg1 + ".dat", null));
		IMUIZRAF var5 = new IMUIZRAF(arg0.method29("index.dat", null));
		var5.field714 = var4.method240();
		field1455 = var5.method240();
		field1456 = var5.method240();
		int var6 = var5.method238();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method242();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field714 += 2;
			var4.field714 += var5.method240() * var5.method240();
			var5.field714++;
		}

		field1453 = var5.method238();
		field1454 = var5.method238();
		field1451 = var5.method240();
		field1452 = var5.method240();
		int var10 = var5.method238();
		int var11 = field1452 * field1451;
		field1450 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1450[var12] = var7[var4.method238()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1451; var13++) {
				for (int var14 = 0; var14 < field1452; var14++) {
					field1450[field1451 * var14 + var13] = var7[var4.method238()];
				}
			}
		}
	}

	@ObfuscatedName("YHASUFYG.b(I)V")
	public void method573() {
		DSAVPBJG.method191(field1450, field1451, field1452);
	}

	@ObfuscatedName("YHASUFYG.a(IIII)V")
	public void method574(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1450.length; var4++) {
			int var5 = field1450[var4];
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

				field1450[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("YHASUFYG.c(I)V")
	public void method575() {
		int[] var1 = new int[field1456 * field1455];
		for (int var2 = 0; var2 < field1452; var2++) {
			for (int var3 = 0; var3 < field1451; var3++) {
				var1[(field1454 + var2) * field1455 + field1453 + var3] = field1450[field1451 * var2 + var3];
			}
		}

		field1450 = var1;
		field1451 = field1455;
		field1452 = field1456;
		field1453 = 0;
		field1454 = 0;
	}

	@ObfuscatedName("YHASUFYG.a(III)V")
	public void method576(int arg0, int arg1) {
		arg0 += field1453;
		arg1 += field1454;
		int var3 = DSAVPBJG.field563 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1452;
		int var6 = field1451;
		int var7 = DSAVPBJG.field563 - var6;
		int var8 = 0;

		if (arg1 < DSAVPBJG.field565) {
			int var9 = DSAVPBJG.field565 - arg1;
			var5 -= var9;
			arg1 = DSAVPBJG.field565;
			var4 += var6 * var9;
			var3 += DSAVPBJG.field563 * var9;
		}

		if (arg1 + var5 > DSAVPBJG.field566) {
			var5 -= arg1 + var5 - DSAVPBJG.field566;
		}

		if (arg0 < DSAVPBJG.field567) {
			int var10 = DSAVPBJG.field567 - arg0;
			var6 -= var10;
			arg0 = DSAVPBJG.field567;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > DSAVPBJG.field568) {
			int var11 = arg0 + var6 - DSAVPBJG.field568;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method577(var4, field1450, var8, var6, var3, DSAVPBJG.field562, var7, var5);
		}
	}

	@ObfuscatedName("YHASUFYG.a(I[IIIII[III)V")
	public void method577(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
		int var9 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var10 = -arg7; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg5[arg4++] = arg1[arg0++];
				arg5[arg4++] = arg1[arg0++];
				arg5[arg4++] = arg1[arg0++];
				arg5[arg4++] = arg1[arg0++];
			}

			for (int var12 = arg3; var12 < 0; var12++) {
				arg5[arg4++] = arg1[arg0++];
			}

			arg4 += arg6;
			arg0 += arg2;
		}
	}

	@ObfuscatedName("YHASUFYG.b(III)V")
	public void method578(int arg0, int arg1) {
		arg0 += field1453;
		arg1 += field1454;
		int var3 = DSAVPBJG.field563 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1452;
		int var6 = field1451;
		int var7 = DSAVPBJG.field563 - var6;
		int var8 = 0;

		if (arg1 < DSAVPBJG.field565) {
			int var9 = DSAVPBJG.field565 - arg1;
			var5 -= var9;
			arg1 = DSAVPBJG.field565;
			var4 += var6 * var9;
			var3 += DSAVPBJG.field563 * var9;
		}

		if (arg1 + var5 > DSAVPBJG.field566) {
			var5 -= arg1 + var5 - DSAVPBJG.field566;
		}

		if (arg0 < DSAVPBJG.field567) {
			int var10 = DSAVPBJG.field567 - arg0;
			var6 -= var10;
			arg0 = DSAVPBJG.field567;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > DSAVPBJG.field568) {
			int var11 = arg0 + var6 - DSAVPBJG.field568;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method579(DSAVPBJG.field562, field1450, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("YHASUFYG.a([I[IIIIIIII)V")
	public void method579(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("YHASUFYG.a(IIIB)V")
	public void method580(int arg0, int arg1, int arg2) {
		arg1 += field1453;
		arg0 += field1454;
		int var4 = DSAVPBJG.field563 * arg0 + arg1;
		int var5 = 0;
		int var6 = field1452;
		int var7 = field1451;
		int var8 = DSAVPBJG.field563 - var7;
		int var9 = 0;

		if (arg0 < DSAVPBJG.field565) {
			int var10 = DSAVPBJG.field565 - arg0;
			var6 -= var10;
			arg0 = DSAVPBJG.field565;
			var5 += var7 * var10;
			var4 += DSAVPBJG.field563 * var10;
		}

		if (arg0 + var6 > DSAVPBJG.field566) {
			var6 -= arg0 + var6 - DSAVPBJG.field566;
		}

		if (arg1 < DSAVPBJG.field567) {
			int var11 = DSAVPBJG.field567 - arg1;
			var7 -= var11;
			arg1 = DSAVPBJG.field567;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > DSAVPBJG.field568) {
			int var12 = arg1 + var7 - DSAVPBJG.field568;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method581(var5, var4, arg2, DSAVPBJG.field562, var8, var6, 0, var9, var7, field1450);
		}
	}

	@ObfuscatedName("YHASUFYG.a(IIII[IIIIII[I)V")
	public void method581(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		int var11 = 256 - arg2;
		for (int var12 = -arg5; var12 < 0; var12++) {
			for (int var13 = -arg8; var13 < 0; var13++) {
				int var14 = arg9[arg0++];
				if (var14 == 0) {
					arg1++;
				} else {
					int var15 = arg3[arg1];
					arg3[arg1++] = ((var14 & 0xFF00FF) * arg2 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg2 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg1 += arg4;
			arg0 += arg7;
		}
	}

	@ObfuscatedName("YHASUFYG.a(III[IIIIII[II)V")
	public void method582(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int arg9) {
		try {
			int var11 = -arg6 / 2;
			int var12 = -arg1 / 2;
			int var13 = (int) (Math.sin(arg0 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg0 / 326.11D) * 65536.0D);
			var13 = arg7 * var13 >> 8;
			var14 = arg7 * var14 >> 8;
			int var15 = (arg3 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg9 << 16) + var12 * var14 - var11 * var13;
			int var17 = DSAVPBJG.field563 * arg4 + arg5;
			for (int var18 = 0; var18 < arg1; var18++) {
				int var19 = arg8[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg2[var18]; var23 < 0; var23++) {
					DSAVPBJG.field562[var20++] = field1450[(var21 >> 16) + (var22 >> 16) * field1451];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += DSAVPBJG.field563;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("YHASUFYG.a(IIDIIIIII)V")
	public void method583(int arg0, int arg1, double arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg6 / 2;
			int var11 = -arg1 / 2;
			int var12 = (int) (Math.sin(arg2) * 65536.0D);
			int var13 = (int) (Math.cos(arg2) * 65536.0D);
			var12 = arg5 * var12 >> 8;
			var13 = arg5 * var13 >> 8;
			int var14 = (arg3 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = DSAVPBJG.field563 * arg7 + arg0;
			for (int var17 = 0; var17 < arg1; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg6; var21 < 0; var21++) {
					int var22 = field1450[(var19 >> 16) + (var20 >> 16) * field1451];
					if (var22 == 0) {
						var18++;
					} else {
						DSAVPBJG.field562[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += DSAVPBJG.field563;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("YHASUFYG.a(ILAGTHLVTI;IB)V")
	public void method584(int arg0, AGTHLVTI arg1, int arg2) {
		arg2 += field1453;
		arg0 += field1454;
		int var4 = DSAVPBJG.field563 * arg0 + arg2;
		int var5 = 0;
		int var6 = field1452;
		int var7 = field1451;
		int var8 = DSAVPBJG.field563 - var7;
		int var9 = 0;

		if (arg0 < DSAVPBJG.field565) {
			int var10 = DSAVPBJG.field565 - arg0;
			var6 -= var10;
			arg0 = DSAVPBJG.field565;
			var5 += var7 * var10;
			var4 += DSAVPBJG.field563 * var10;
		}

		if (arg0 + var6 > DSAVPBJG.field566) {
			var6 -= arg0 + var6 - DSAVPBJG.field566;
		}

		if (arg2 < DSAVPBJG.field567) {
			int var11 = DSAVPBJG.field567 - arg2;
			var7 -= var11;
			arg2 = DSAVPBJG.field567;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > DSAVPBJG.field568) {
			int var12 = arg2 + var7 - DSAVPBJG.field568;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method585(field1450, var5, var6, var7, var9, var8, 0, DSAVPBJG.field562, arg1.field19, var4);
		}
	}

	@ObfuscatedName("YHASUFYG.a([IIIIIIII[I[BI)V")
	public void method585(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, byte[] arg8, int arg9) {
		int var11 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg0[arg1++];
				if (var14 != 0 && arg8[arg9] == 0) {
					arg7[arg9++] = var14;
				} else {
					arg9++;
				}

				int var15 = arg0[arg1++];
				if (var15 != 0 && arg8[arg9] == 0) {
					arg7[arg9++] = var15;
				} else {
					arg9++;
				}

				int var16 = arg0[arg1++];
				if (var16 != 0 && arg8[arg9] == 0) {
					arg7[arg9++] = var16;
				} else {
					arg9++;
				}

				int var17 = arg0[arg1++];
				if (var17 != 0 && arg8[arg9] == 0) {
					arg7[arg9++] = var17;
				} else {
					arg9++;
				}
			}

			for (int var18 = arg3; var18 < 0; var18++) {
				int var19 = arg0[arg1++];
				if (var19 != 0 && arg8[arg9] == 0) {
					arg7[arg9++] = var19;
				} else {
					arg9++;
				}
			}

			arg9 += arg5;
			arg1 += arg4;
		}
	}
}
