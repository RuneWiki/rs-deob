package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("IBHVCUAH")
public final class IBHVCUAH extends TTGPXKMD {

	@ObfuscatedName("IBHVCUAH.G")
	public int[] field652;

	@ObfuscatedName("IBHVCUAH.L")
	public int field657;

	@ObfuscatedName("IBHVCUAH.H")
	public int field653;

	@ObfuscatedName("IBHVCUAH.M")
	public int field658;

	@ObfuscatedName("IBHVCUAH.I")
	public int field654;

	@ObfuscatedName("IBHVCUAH.K")
	public int field656;

	@ObfuscatedName("IBHVCUAH.J")
	public int field655;

	public IBHVCUAH(int arg0, int arg1) {
		field652 = new int[arg0 * arg1];
		field653 = field657 = arg0;
		field654 = field658 = arg1;
		field655 = field656 = 0;
	}

	public IBHVCUAH(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field653 = var3.getWidth(arg1);
			field654 = var3.getHeight(arg1);
			field657 = field653;
			field658 = field654;
			field655 = 0;
			field656 = 0;
			field652 = new int[field654 * field653];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field653, field654, field652, 0, field653);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public IBHVCUAH(RVLWVPJQ arg0, String arg1, int arg2) {
		UAWAYCTK var4 = new UAWAYCTK(arg0.method424(arg1 + ".dat", null));
		UAWAYCTK var5 = new UAWAYCTK(arg0.method424("index.dat", null));
		var5.field1252 = var4.method457();
		field657 = var5.method457();
		field658 = var5.method457();
		int var6 = var5.method455();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method459();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1252 += 2;
			var4.field1252 += var5.method457() * var5.method457();
			var5.field1252++;
		}

		field655 = var5.method455();
		field656 = var5.method455();
		field653 = var5.method457();
		field654 = var5.method457();
		int var10 = var5.method455();
		int var11 = field654 * field653;
		field652 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field652[var12] = var7[var4.method455()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field653; var13++) {
				for (int var14 = 0; var14 < field654; var14++) {
					field652[field653 * var14 + var13] = var7[var4.method455()];
				}
			}
		}
	}

	@ObfuscatedName("IBHVCUAH.a(Z)V")
	public void method227() {
		TTGPXKMD.method427(field652, field654, field653);
	}

	@ObfuscatedName("IBHVCUAH.a(IBII)V")
	public void method228(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field652.length; var4++) {
			int var5 = field652[var4];
			if (var5 != 0) {
				int var6 = var5 >> 16 & 0xFF;
				var6 += arg2;
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
				var8 += arg1;
				if (var8 < 1) {
					var8 = 1;
				} else if (var8 > 255) {
					var8 = 255;
				}

				field652[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("IBHVCUAH.b(Z)V")
	public void method229() {
		int[] var1 = new int[field658 * field657];
		for (int var2 = 0; var2 < field654; var2++) {
			for (int var3 = 0; var3 < field653; var3++) {
				var1[(field656 + var2) * field657 + field655 + var3] = field652[field653 * var2 + var3];
			}
		}

		field652 = var1;
		field653 = field657;
		field654 = field658;
		field655 = 0;
		field656 = 0;
	}

	@ObfuscatedName("IBHVCUAH.a(IBI)V")
	public void method230(int arg0, int arg1) {
		arg0 += field655;
		arg1 += field656;
		int var3 = TTGPXKMD.field1187 * arg1 + arg0;
		int var4 = 0;
		int var5 = field654;
		int var6 = field653;
		int var7 = TTGPXKMD.field1187 - var6;
		int var8 = 0;

		if (arg1 < TTGPXKMD.field1189) {
			int var9 = TTGPXKMD.field1189 - arg1;
			var5 -= var9;
			arg1 = TTGPXKMD.field1189;
			var4 += var6 * var9;
			var3 += TTGPXKMD.field1187 * var9;
		}

		if (arg1 + var5 > TTGPXKMD.field1190) {
			var5 -= arg1 + var5 - TTGPXKMD.field1190;
		}

		if (arg0 < TTGPXKMD.field1191) {
			int var10 = TTGPXKMD.field1191 - arg0;
			var6 -= var10;
			arg0 = TTGPXKMD.field1191;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > TTGPXKMD.field1192) {
			int var11 = arg0 + var6 - TTGPXKMD.field1192;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method231(var4, var7, var3, TTGPXKMD.field1186, var5, var6, var8, field652);
		}
	}

	@ObfuscatedName("IBHVCUAH.a(IIZI[IIII[I)V")
	public void method231(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7) {
		int var9 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var10 = -arg4; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg3[arg2++] = arg7[arg0++];
				arg3[arg2++] = arg7[arg0++];
				arg3[arg2++] = arg7[arg0++];
				arg3[arg2++] = arg7[arg0++];
			}

			for (int var12 = arg5; var12 < 0; var12++) {
				arg3[arg2++] = arg7[arg0++];
			}

			arg2 += arg1;
			arg0 += arg6;
		}
	}

	@ObfuscatedName("IBHVCUAH.a(III)V")
	public void method232(int arg0, int arg1) {
		arg0 += field655;
		arg1 += field656;
		int var3 = TTGPXKMD.field1187 * arg1 + arg0;
		int var4 = 0;
		int var5 = field654;
		int var6 = field653;
		int var7 = TTGPXKMD.field1187 - var6;
		int var8 = 0;

		if (arg1 < TTGPXKMD.field1189) {
			int var9 = TTGPXKMD.field1189 - arg1;
			var5 -= var9;
			arg1 = TTGPXKMD.field1189;
			var4 += var6 * var9;
			var3 += TTGPXKMD.field1187 * var9;
		}

		if (arg1 + var5 > TTGPXKMD.field1190) {
			var5 -= arg1 + var5 - TTGPXKMD.field1190;
		}

		if (arg0 < TTGPXKMD.field1191) {
			int var10 = TTGPXKMD.field1191 - arg0;
			var6 -= var10;
			arg0 = TTGPXKMD.field1191;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > TTGPXKMD.field1192) {
			int var11 = arg0 + var6 - TTGPXKMD.field1192;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method233(TTGPXKMD.field1186, field652, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("IBHVCUAH.a([I[IIIIIIII)V")
	public void method233(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("IBHVCUAH.a(ZIII)V")
	public void method234(int arg0, int arg1, int arg2) {
		arg0 += field655;
		arg2 += field656;
		int var4 = TTGPXKMD.field1187 * arg2 + arg0;
		int var5 = 0;
		int var6 = field654;
		int var7 = field653;
		int var8 = TTGPXKMD.field1187 - var7;
		int var9 = 0;

		if (arg2 < TTGPXKMD.field1189) {
			int var10 = TTGPXKMD.field1189 - arg2;
			var6 -= var10;
			arg2 = TTGPXKMD.field1189;
			var5 += var7 * var10;
			var4 += TTGPXKMD.field1187 * var10;
		}

		if (arg2 + var6 > TTGPXKMD.field1190) {
			var6 -= arg2 + var6 - TTGPXKMD.field1190;
		}

		if (arg0 < TTGPXKMD.field1191) {
			int var11 = TTGPXKMD.field1191 - arg0;
			var7 -= var11;
			arg0 = TTGPXKMD.field1191;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg0 + var7 > TTGPXKMD.field1192) {
			int var12 = arg0 + var7 - TTGPXKMD.field1192;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method235(var5, var8, var4, var6, 0, TTGPXKMD.field1186, arg1, field652, var9, var7);
		}
	}

	@ObfuscatedName("IBHVCUAH.a(IIIII[III[III)V")
	public void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = 256 - arg6;
		for (int var12 = -arg3; var12 < 0; var12++) {
			for (int var13 = -arg9; var13 < 0; var13++) {
				int var14 = arg7[arg0++];
				if (var14 == 0) {
					arg2++;
				} else {
					int var15 = arg5[arg2];
					arg5[arg2++] = ((var14 & 0xFF00FF) * arg6 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg6 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg2 += arg1;
			arg0 += arg8;
		}
	}

	@ObfuscatedName("IBHVCUAH.a(III[IIB[IIIII)V")
	public void method236(int arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9) {
		try {
			int var11 = -arg0 / 2;
			int var12 = -arg1 / 2;
			int var13 = (int) (Math.sin(arg4 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg4 / 326.11D) * 65536.0D);
			var13 = arg8 * var13 >> 8;
			var14 = arg8 * var14 >> 8;
			int var15 = (arg2 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg6 << 16) + var12 * var14 - var11 * var13;
			int var17 = TTGPXKMD.field1187 * arg7 + arg9;
			for (int var18 = 0; var18 < arg1; var18++) {
				int var19 = arg5[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg3[var18]; var23 < 0; var23++) {
					TTGPXKMD.field1186[var20++] = field652[(var21 >> 16) + (var22 >> 16) * field653];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += TTGPXKMD.field1187;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("IBHVCUAH.a(DBIIIIIII)V")
	public void method237(double arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			int var10 = -arg7 / 2;
			int var11 = -arg5 / 2;
			int var12 = (int) (Math.sin(arg0) * 65536.0D);
			int var13 = (int) (Math.cos(arg0) * 65536.0D);
			var12 = arg3 * var12 >> 8;
			var13 = arg3 * var13 >> 8;
			int var14 = (arg1 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg4 << 16) + var11 * var13 - var10 * var12;
			int var16 = TTGPXKMD.field1187 * arg2 + arg6;
			for (int var17 = 0; var17 < arg5; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg7; var21 < 0; var21++) {
					int var22 = field652[(var19 >> 16) + (var20 >> 16) * field653];
					if (var22 == 0) {
						var18++;
					} else {
						TTGPXKMD.field1186[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += TTGPXKMD.field1187;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("IBHVCUAH.a(ZILXHDQQNIR;I)V")
	public void method238(int arg0, XHDQQNIR arg1, int arg2) {
		arg2 += field655;
		arg0 += field656;
		int var4 = TTGPXKMD.field1187 * arg0 + arg2;
		int var5 = 0;
		int var6 = field654;
		int var7 = field653;
		int var8 = TTGPXKMD.field1187 - var7;
		int var9 = 0;

		if (arg0 < TTGPXKMD.field1189) {
			int var10 = TTGPXKMD.field1189 - arg0;
			var6 -= var10;
			arg0 = TTGPXKMD.field1189;
			var5 += var7 * var10;
			var4 += TTGPXKMD.field1187 * var10;
		}

		if (arg0 + var6 > TTGPXKMD.field1190) {
			var6 -= arg0 + var6 - TTGPXKMD.field1190;
		}

		if (arg2 < TTGPXKMD.field1191) {
			int var11 = TTGPXKMD.field1191 - arg2;
			var7 -= var11;
			arg2 = TTGPXKMD.field1191;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg2 + var7 > TTGPXKMD.field1192) {
			int var12 = arg2 + var7 - TTGPXKMD.field1192;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method239(arg1.field1447, var4, var6, field652, var9, var8, TTGPXKMD.field1186, 0, var5, var7);
		}
	}

	@ObfuscatedName("IBHVCUAH.a(I[BII[III[IIII)V")
	public void method239(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8, int arg9) {
		int var11 = -(arg9 >> 2);
		arg9 = -(arg9 & 0x3);
		for (int var12 = -arg2; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg3[arg8++];
				if (var14 != 0 && arg0[arg1] == 0) {
					arg6[arg1++] = var14;
				} else {
					arg1++;
				}

				int var15 = arg3[arg8++];
				if (var15 != 0 && arg0[arg1] == 0) {
					arg6[arg1++] = var15;
				} else {
					arg1++;
				}

				int var16 = arg3[arg8++];
				if (var16 != 0 && arg0[arg1] == 0) {
					arg6[arg1++] = var16;
				} else {
					arg1++;
				}

				int var17 = arg3[arg8++];
				if (var17 != 0 && arg0[arg1] == 0) {
					arg6[arg1++] = var17;
				} else {
					arg1++;
				}
			}

			for (int var18 = arg9; var18 < 0; var18++) {
				int var19 = arg3[arg8++];
				if (var19 != 0 && arg0[arg1] == 0) {
					arg6[arg1++] = var19;
				} else {
					arg1++;
				}
			}

			arg1 += arg5;
			arg8 += arg4;
		}
	}
}
