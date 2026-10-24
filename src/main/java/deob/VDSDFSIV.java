package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("VDSDFSIV")
public final class VDSDFSIV extends IIPNJDNO {

	@ObfuscatedName("VDSDFSIV.B")
	public int[] field1338;

	@ObfuscatedName("VDSDFSIV.G")
	public int field1343;

	@ObfuscatedName("VDSDFSIV.C")
	public int field1339;

	@ObfuscatedName("VDSDFSIV.H")
	public int field1344;

	@ObfuscatedName("VDSDFSIV.D")
	public int field1340;

	@ObfuscatedName("VDSDFSIV.F")
	public int field1342;

	@ObfuscatedName("VDSDFSIV.E")
	public int field1341;

	public VDSDFSIV(int arg0, int arg1) {
		field1338 = new int[arg0 * arg1];
		field1339 = field1343 = arg0;
		field1340 = field1344 = arg1;
		field1341 = field1342 = 0;
	}

	public VDSDFSIV(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1339 = var3.getWidth(arg1);
			field1340 = var3.getHeight(arg1);
			field1343 = field1339;
			field1344 = field1340;
			field1341 = 0;
			field1342 = 0;
			field1338 = new int[field1340 * field1339];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1339, field1340, field1338, 0, field1339);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public VDSDFSIV(CVNWKEAW arg0, String arg1, int arg2) {
		XOUQUKZW var4 = new XOUQUKZW(arg0.method180(arg1 + ".dat", null));
		XOUQUKZW var5 = new XOUQUKZW(arg0.method180("index.dat", null));
		var5.field1367 = var4.method523();
		field1343 = var5.method523();
		field1344 = var5.method523();
		int var6 = var5.method521();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method525();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1367 += 2;
			var4.field1367 += var5.method523() * var5.method523();
			var5.field1367++;
		}

		field1341 = var5.method521();
		field1342 = var5.method521();
		field1339 = var5.method523();
		field1340 = var5.method523();
		int var10 = var5.method521();
		int var11 = field1340 * field1339;
		field1338 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1338[var12] = var7[var4.method521()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1339; var13++) {
				for (int var14 = 0; var14 < field1340; var14++) {
					field1338[field1339 * var14 + var13] = var7[var4.method521()];
				}
			}
		}
	}

	@ObfuscatedName("VDSDFSIV.c(I)V")
	public void method494() {
		IIPNJDNO.method317(field1338, field1340, field1339);
	}

	@ObfuscatedName("VDSDFSIV.a(ZIII)V")
	public void method495(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1338.length; var4++) {
			int var5 = field1338[var4];
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

				field1338[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("VDSDFSIV.d(I)V")
	public void method496() {
		int[] var1 = new int[field1344 * field1343];
		for (int var2 = 0; var2 < field1340; var2++) {
			for (int var3 = 0; var3 < field1339; var3++) {
				var1[(field1342 + var2) * field1343 + field1341 + var3] = field1338[field1339 * var2 + var3];
			}
		}

		field1338 = var1;
		field1339 = field1343;
		field1340 = field1344;
		field1341 = 0;
		field1342 = 0;
	}

	@ObfuscatedName("VDSDFSIV.a(IIB)V")
	public void method497(int arg0, int arg1) {
		arg0 += field1341;
		arg1 += field1342;
		int var3 = IIPNJDNO.field812 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1340;
		int var6 = field1339;
		int var7 = IIPNJDNO.field812 - var6;
		int var8 = 0;

		if (arg1 < IIPNJDNO.field814) {
			int var9 = IIPNJDNO.field814 - arg1;
			var5 -= var9;
			arg1 = IIPNJDNO.field814;
			var4 += var6 * var9;
			var3 += IIPNJDNO.field812 * var9;
		}

		if (arg1 + var5 > IIPNJDNO.field815) {
			var5 -= arg1 + var5 - IIPNJDNO.field815;
		}

		if (arg0 < IIPNJDNO.field816) {
			int var10 = IIPNJDNO.field816 - arg0;
			var6 -= var10;
			arg0 = IIPNJDNO.field816;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > IIPNJDNO.field817) {
			int var11 = arg0 + var6 - IIPNJDNO.field817;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method498(var5, field1338, var3, var7, var6, var8, var4, IIPNJDNO.field811);
		}
	}

	@ObfuscatedName("VDSDFSIV.a(I[IIIIIII[I)V")
	public void method498(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var10 = -arg0; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg7[arg2++] = arg1[arg6++];
				arg7[arg2++] = arg1[arg6++];
				arg7[arg2++] = arg1[arg6++];
				arg7[arg2++] = arg1[arg6++];
			}

			for (int var12 = arg4; var12 < 0; var12++) {
				arg7[arg2++] = arg1[arg6++];
			}

			arg2 += arg3;
			arg6 += arg5;
		}
	}

	@ObfuscatedName("VDSDFSIV.a(III)V")
	public void method499(int arg0, int arg1) {
		arg1 += field1341;
		arg0 += field1342;
		int var3 = IIPNJDNO.field812 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1340;
		int var6 = field1339;
		int var7 = IIPNJDNO.field812 - var6;
		int var8 = 0;

		if (arg0 < IIPNJDNO.field814) {
			int var9 = IIPNJDNO.field814 - arg0;
			var5 -= var9;
			arg0 = IIPNJDNO.field814;
			var4 += var6 * var9;
			var3 += IIPNJDNO.field812 * var9;
		}

		if (arg0 + var5 > IIPNJDNO.field815) {
			var5 -= arg0 + var5 - IIPNJDNO.field815;
		}

		if (arg1 < IIPNJDNO.field816) {
			int var10 = IIPNJDNO.field816 - arg1;
			var6 -= var10;
			arg1 = IIPNJDNO.field816;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > IIPNJDNO.field817) {
			int var11 = arg1 + var6 - IIPNJDNO.field817;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method500(IIPNJDNO.field811, field1338, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("VDSDFSIV.a([I[IIIIIIII)V")
	public void method500(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("VDSDFSIV.a(IIII)V")
	public void method501(int arg0, int arg1, int arg2) {
		arg0 += field1341;
		arg2 += field1342;
		int var4 = IIPNJDNO.field812 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1340;
		int var7 = field1339;
		int var8 = IIPNJDNO.field812 - var7;
		int var9 = 0;

		if (arg2 < IIPNJDNO.field814) {
			int var10 = IIPNJDNO.field814 - arg2;
			var6 -= var10;
			arg2 = IIPNJDNO.field814;
			var5 += var7 * var10;
			var4 += IIPNJDNO.field812 * var10;
		}

		if (arg2 + var6 > IIPNJDNO.field815) {
			var6 -= arg2 + var6 - IIPNJDNO.field815;
		}

		if (arg0 < IIPNJDNO.field816) {
			int var11 = IIPNJDNO.field816 - arg0;
			var7 -= var11;
			arg0 = IIPNJDNO.field816;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > IIPNJDNO.field817) {
			int var12 = arg0 + var7 - IIPNJDNO.field817;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method502(var6, var7, var4, IIPNJDNO.field811, var5, var9, var8, 0, arg1, field1338);
		}
	}

	@ObfuscatedName("VDSDFSIV.a(III[IIIIIBI[I)V")
	public void method502(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int[] arg9) {
		int var11 = 256 - arg8;
		for (int var12 = -arg0; var12 < 0; var12++) {
			for (int var13 = -arg1; var13 < 0; var13++) {
				int var14 = arg9[arg4++];
				if (var14 == 0) {
					arg2++;
				} else {
					int var15 = arg3[arg2];
					arg3[arg2++] = ((var14 & 0xFF00FF) * arg8 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg8 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg2 += arg6;
			arg4 += arg5;
		}
	}

	@ObfuscatedName("VDSDFSIV.a(IIIIIIIII[I[I)V")
	public void method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8, int[] arg9) {
		try {
			int var11 = -arg0 / 2;
			int var12 = -arg3 / 2;
			int var13 = (int) (Math.sin(arg2 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg2 / 326.11D) * 65536.0D);
			var13 = arg6 * var13 >> 8;
			var14 = arg6 * var14 >> 8;
			int var15 = (arg4 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg5 << 16) + var12 * var14 - var11 * var13;
			int var17 = IIPNJDNO.field812 * arg1 + arg7;
			for (int var18 = 0; var18 < arg3; var18++) {
				int var19 = arg8[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg9[var18]; var23 < 0; var23++) {
					IIPNJDNO.field811[var20++] = field1338[(var21 >> 16) + (var22 >> 16) * field1339];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += IIPNJDNO.field812;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("VDSDFSIV.a(IIIIIIIID)V")
	public void method504(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, double arg7) {
		try {
			int var10 = -arg2 / 2;
			int var11 = -arg4 / 2;
			int var12 = (int) (Math.sin(arg7) * 65536.0D);
			int var13 = (int) (Math.cos(arg7) * 65536.0D);
			var12 = arg1 * var12 >> 8;
			var13 = arg1 * var13 >> 8;
			int var14 = (arg0 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg5 << 16) + var11 * var13 - var10 * var12;
			int var16 = IIPNJDNO.field812 * arg3 + arg6;
			for (int var17 = 0; var17 < arg4; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg2; var21 < 0; var21++) {
					int var22 = field1338[(var19 >> 16) + (var20 >> 16) * field1339];
					if (var22 == 0) {
						var18++;
					} else {
						IIPNJDNO.field811[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += IIPNJDNO.field812;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("VDSDFSIV.a(ILDNACUOZQ;II)V")
	public void method505(int arg0, DNACUOZQ arg1, int arg2) {
		arg0 += field1341;
		arg2 += field1342;
		int var4 = IIPNJDNO.field812 * arg2 + arg0;
		int var5 = 0;
		int var6 = field1340;
		int var7 = field1339;
		int var8 = IIPNJDNO.field812 - var7;
		int var9 = 0;

		if (arg2 < IIPNJDNO.field814) {
			int var10 = IIPNJDNO.field814 - arg2;
			var6 -= var10;
			arg2 = IIPNJDNO.field814;
			var5 += var7 * var10;
			var4 += IIPNJDNO.field812 * var10;
		}

		if (arg2 + var6 > IIPNJDNO.field815) {
			var6 -= arg2 + var6 - IIPNJDNO.field815;
		}

		if (arg0 < IIPNJDNO.field816) {
			int var11 = IIPNJDNO.field816 - arg0;
			var7 -= var11;
			arg0 = IIPNJDNO.field816;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > IIPNJDNO.field817) {
			int var12 = arg0 + var7 - IIPNJDNO.field817;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method506(var7, 0, var8, var5, arg1.field516, var4, field1338, var9, var6, IIPNJDNO.field811);
		}
	}

	@ObfuscatedName("VDSDFSIV.a(IIIII[BI[III[I)V")
	public void method506(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int[] arg6, int arg7, int arg8, int[] arg9) {
		int var11 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var12 = -arg8; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg6[arg3++];
				if (var14 != 0 && arg4[arg5] == 0) {
					arg9[arg5++] = var14;
				} else {
					arg5++;
				}

				int var15 = arg6[arg3++];
				if (var15 != 0 && arg4[arg5] == 0) {
					arg9[arg5++] = var15;
				} else {
					arg5++;
				}

				int var16 = arg6[arg3++];
				if (var16 != 0 && arg4[arg5] == 0) {
					arg9[arg5++] = var16;
				} else {
					arg5++;
				}

				int var17 = arg6[arg3++];
				if (var17 != 0 && arg4[arg5] == 0) {
					arg9[arg5++] = var17;
				} else {
					arg5++;
				}
			}

			for (int var18 = arg0; var18 < 0; var18++) {
				int var19 = arg6[arg3++];
				if (var19 != 0 && arg4[arg5] == 0) {
					arg9[arg5++] = var19;
				} else {
					arg5++;
				}
			}

			arg5 += arg2;
			arg3 += arg7;
		}
	}
}
