package deob;

import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;

@ObfuscatedName("QEHNWGKD")
public final class QEHNWGKD extends UJSJLLWF {

	@ObfuscatedName("QEHNWGKD.F")
	public int[] field1181;

	@ObfuscatedName("QEHNWGKD.K")
	public int field1186;

	@ObfuscatedName("QEHNWGKD.G")
	public int field1182;

	@ObfuscatedName("QEHNWGKD.L")
	public int field1187;

	@ObfuscatedName("QEHNWGKD.H")
	public int field1183;

	@ObfuscatedName("QEHNWGKD.J")
	public int field1185;

	@ObfuscatedName("QEHNWGKD.I")
	public int field1184;

	public QEHNWGKD(int arg0, int arg1) {
		field1181 = new int[arg0 * arg1];
		field1182 = field1186 = arg0;
		field1183 = field1187 = arg1;
		field1184 = field1185 = 0;
	}

	public QEHNWGKD(byte[] arg0, Component arg1) {
		try {
			Image var3 = Toolkit.getDefaultToolkit().createImage(arg0);
			MediaTracker var4 = new MediaTracker(arg1);
			var4.addImage(var3, 0);
			var4.waitForAll();
			field1182 = var3.getWidth(arg1);
			field1183 = var3.getHeight(arg1);
			field1186 = field1182;
			field1187 = field1183;
			field1184 = 0;
			field1185 = 0;
			field1181 = new int[field1183 * field1182];
			PixelGrabber var5 = new PixelGrabber(var3, 0, 0, field1182, field1183, field1181, 0, field1182);
			var5.grabPixels();
		} catch (Exception var6) {
			System.out.println("Error converting jpg");
		}
	}

	public QEHNWGKD(NXFIIFAD arg0, String arg1, int arg2) {
		MNKDCXXG var4 = new MNKDCXXG(arg0.method431(arg1 + ".dat", null));
		MNKDCXXG var5 = new MNKDCXXG(arg0.method431("index.dat", null));
		var5.field1055 = var4.method388();
		field1186 = var5.method388();
		field1187 = var5.method388();
		int var6 = var5.method386();
		int[] var7 = new int[var6];
		for (int var8 = 0; var8 < var6 - 1; var8++) {
			var7[var8 + 1] = var5.method390();
			if (var7[var8 + 1] == 0) {
				var7[var8 + 1] = 1;
			}
		}

		for (int var9 = 0; var9 < arg2; var9++) {
			var5.field1055 += 2;
			var4.field1055 += var5.method388() * var5.method388();
			var5.field1055++;
		}

		field1184 = var5.method386();
		field1185 = var5.method386();
		field1182 = var5.method388();
		field1183 = var5.method388();
		int var10 = var5.method386();
		int var11 = field1183 * field1182;
		field1181 = new int[var11];
		if (var10 == 0) {
			for (int var12 = 0; var12 < var11; var12++) {
				field1181[var12] = var7[var4.method386()];
			}
		} else if (var10 == 1) {
			for (int var13 = 0; var13 < field1182; var13++) {
				for (int var14 = 0; var14 < field1183; var14++) {
					field1181[field1182 * var14 + var13] = var7[var4.method386()];
				}
			}
		}
	}

	@ObfuscatedName("QEHNWGKD.b(I)V")
	public void method453() {
		UJSJLLWF.method479(field1181, field1182, field1183);
	}

	@ObfuscatedName("QEHNWGKD.a(IIIZ)V")
	public void method454(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1181.length; var4++) {
			int var5 = field1181[var4];
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

				field1181[var4] = (var6 << 16) + (var7 << 8) + var8;
			}
		}
	}

	@ObfuscatedName("QEHNWGKD.a(Z)V")
	public void method455() {
		int[] var1 = new int[field1187 * field1186];
		for (int var2 = 0; var2 < field1183; var2++) {
			for (int var3 = 0; var3 < field1182; var3++) {
				var1[(field1185 + var2) * field1186 + field1184 + var3] = field1181[field1182 * var2 + var3];
			}
		}

		field1181 = var1;
		field1182 = field1186;
		field1183 = field1187;
		field1184 = 0;
		field1185 = 0;
	}

	@ObfuscatedName("QEHNWGKD.a(BII)V")
	public void method456(int arg0, int arg1) {
		arg0 += field1184;
		arg1 += field1185;
		int var3 = UJSJLLWF.field1249 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1183;
		int var6 = field1182;
		int var7 = UJSJLLWF.field1249 - var6;
		int var8 = 0;

		if (arg1 < UJSJLLWF.field1251) {
			int var9 = UJSJLLWF.field1251 - arg1;
			var5 -= var9;
			arg1 = UJSJLLWF.field1251;
			var4 += var6 * var9;
			var3 += UJSJLLWF.field1249 * var9;
		}

		if (arg1 + var5 > UJSJLLWF.field1252) {
			var5 -= arg1 + var5 - UJSJLLWF.field1252;
		}

		if (arg0 < UJSJLLWF.field1253) {
			int var10 = UJSJLLWF.field1253 - arg0;
			var6 -= var10;
			arg0 = UJSJLLWF.field1253;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > UJSJLLWF.field1254) {
			int var11 = arg0 + var6 - UJSJLLWF.field1254;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method457(var5, var8, var4, var7, field1181, UJSJLLWF.field1248, var6, var3);
		}
	}

	@ObfuscatedName("QEHNWGKD.a(IIIBI[I[III)V")
	public void method457(int arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7) {
		int var9 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var10 = -arg0; var10 < 0; var10++) {
			for (int var11 = var9; var11 < 0; var11++) {
				arg5[arg7++] = arg4[arg2++];
				arg5[arg7++] = arg4[arg2++];
				arg5[arg7++] = arg4[arg2++];
				arg5[arg7++] = arg4[arg2++];
			}

			for (int var12 = arg6; var12 < 0; var12++) {
				arg5[arg7++] = arg4[arg2++];
			}

			arg7 += arg3;
			arg2 += arg1;
		}
	}

	@ObfuscatedName("QEHNWGKD.a(III)V")
	public void method458(int arg0, int arg1) {
		arg1 += field1184;
		arg0 += field1185;
		int var3 = UJSJLLWF.field1249 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1183;
		int var6 = field1182;
		int var7 = UJSJLLWF.field1249 - var6;
		int var8 = 0;

		if (arg0 < UJSJLLWF.field1251) {
			int var9 = UJSJLLWF.field1251 - arg0;
			var5 -= var9;
			arg0 = UJSJLLWF.field1251;
			var4 += var6 * var9;
			var3 += UJSJLLWF.field1249 * var9;
		}

		if (arg0 + var5 > UJSJLLWF.field1252) {
			var5 -= arg0 + var5 - UJSJLLWF.field1252;
		}

		if (arg1 < UJSJLLWF.field1253) {
			int var10 = UJSJLLWF.field1253 - arg1;
			var6 -= var10;
			arg1 = UJSJLLWF.field1253;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > UJSJLLWF.field1254) {
			int var11 = arg1 + var6 - UJSJLLWF.field1254;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method459(UJSJLLWF.field1248, field1181, 0, var4, var3, var6, var5, var7, var8);
		}
	}

	@ObfuscatedName("QEHNWGKD.a([I[IIIIIIII)V")
	public void method459(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

	@ObfuscatedName("QEHNWGKD.a(ZIII)V")
	public void method460(int arg0, int arg1, int arg2) {
		arg1 += field1184;
		arg2 += field1185;
		int var4 = UJSJLLWF.field1249 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1183;
		int var7 = field1182;
		int var8 = UJSJLLWF.field1249 - var7;
		int var9 = 0;

		if (arg2 < UJSJLLWF.field1251) {
			int var10 = UJSJLLWF.field1251 - arg2;
			var6 -= var10;
			arg2 = UJSJLLWF.field1251;
			var5 += var7 * var10;
			var4 += UJSJLLWF.field1249 * var10;
		}

		if (arg2 + var6 > UJSJLLWF.field1252) {
			var6 -= arg2 + var6 - UJSJLLWF.field1252;
		}

		if (arg1 < UJSJLLWF.field1253) {
			int var11 = UJSJLLWF.field1253 - arg1;
			var7 -= var11;
			arg1 = UJSJLLWF.field1253;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > UJSJLLWF.field1254) {
			int var12 = arg1 + var7 - UJSJLLWF.field1254;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method461(var8, arg0, var7, var9, var6, UJSJLLWF.field1248, var4, var5, 0, field1181);
		}
	}

	@ObfuscatedName("QEHNWGKD.a(IIIIII[IIII[I)V")
	public void method461(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int[] arg9) {
		int var11 = 256 - arg1;
		for (int var12 = -arg4; var12 < 0; var12++) {
			for (int var13 = -arg2; var13 < 0; var13++) {
				int var14 = arg9[arg7++];
				if (var14 == 0) {
					arg6++;
				} else {
					int var15 = arg5[arg6];
					arg5[arg6++] = ((var14 & 0xFF00FF) * arg1 + (var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * arg1 + (var15 & 0xFF00) * var11 & 0xFF0000) >> 8;
				}
			}

			arg6 += arg0;
			arg7 += arg3;
		}
	}

	@ObfuscatedName("QEHNWGKD.a(IIIZII[II[III)V")
	public void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, int arg9) {
		try {
			int var11 = -arg0 / 2;
			int var12 = -arg8 / 2;
			int var13 = (int) (Math.sin(arg6 / 326.11D) * 65536.0D);
			int var14 = (int) (Math.cos(arg6 / 326.11D) * 65536.0D);
			var13 = arg3 * var13 >> 8;
			var14 = arg3 * var14 >> 8;
			int var15 = (arg1 << 16) + var11 * var14 + var12 * var13;
			int var16 = (arg2 << 16) + var12 * var14 - var11 * var13;
			int var17 = UJSJLLWF.field1249 * arg4 + arg9;
			for (int var18 = 0; var18 < arg8; var18++) {
				int var19 = arg5[var18];
				int var20 = var17 + var19;
				int var21 = var14 * var19 + var15;
				int var22 = var16 - var13 * var19;
				for (int var23 = -arg7[var18]; var23 < 0; var23++) {
					UJSJLLWF.field1248[var20++] = field1181[(var21 >> 16) + (var22 >> 16) * field1182];
					var21 += var14;
					var22 -= var13;
				}

				var15 += var13;
				var16 += var14;
				var17 += UJSJLLWF.field1249;
			}
		} catch (Exception var24) {
		}
	}

	@ObfuscatedName("QEHNWGKD.a(IIIIIIDII)V")
	public void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, double arg6, int arg7) {
		try {
			int var10 = -arg5 / 2;
			int var11 = -arg1 / 2;
			int var12 = (int) (Math.sin(arg6) * 65536.0D);
			int var13 = (int) (Math.cos(arg6) * 65536.0D);
			var12 = arg2 * var12 >> 8;
			var13 = arg2 * var13 >> 8;
			int var14 = (arg4 << 16) + var10 * var13 + var11 * var12;
			int var15 = (arg7 << 16) + var11 * var13 - var10 * var12;
			int var16 = UJSJLLWF.field1249 * arg0 + arg3;
			for (int var17 = 0; var17 < arg1; var17++) {
				int var18 = var16;
				int var19 = var14;
				int var20 = var15;
				for (int var21 = -arg5; var21 < 0; var21++) {
					int var22 = field1181[(var19 >> 16) + (var20 >> 16) * field1182];
					if (var22 == 0) {
						var18++;
					} else {
						UJSJLLWF.field1248[var18++] = var22;
					}

					var19 += var13;
					var20 -= var12;
				}

				var14 += var12;
				var15 += var13;
				var16 += UJSJLLWF.field1249;
			}
		} catch (Exception var23) {
		}
	}

	@ObfuscatedName("QEHNWGKD.a(LBVXAXAEI;IIZ)V")
	public void method464(BVXAXAEI arg0, int arg1, int arg2) {
		arg1 += field1184;
		arg2 += field1185;
		int var4 = UJSJLLWF.field1249 * arg2 + arg1;
		int var5 = 0;
		int var6 = field1183;
		int var7 = field1182;
		int var8 = UJSJLLWF.field1249 - var7;
		int var9 = 0;

		if (arg2 < UJSJLLWF.field1251) {
			int var10 = UJSJLLWF.field1251 - arg2;
			var6 -= var10;
			arg2 = UJSJLLWF.field1251;
			var5 += var7 * var10;
			var4 += UJSJLLWF.field1249 * var10;
		}

		if (arg2 + var6 > UJSJLLWF.field1252) {
			var6 -= arg2 + var6 - UJSJLLWF.field1252;
		}

		if (arg1 < UJSJLLWF.field1253) {
			int var11 = UJSJLLWF.field1253 - arg1;
			var7 -= var11;
			arg1 = UJSJLLWF.field1253;
			var5 += var11;
			var4 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (arg1 + var7 > UJSJLLWF.field1254) {
			int var12 = arg1 + var7 - UJSJLLWF.field1254;
			var7 -= var12;
			var9 += var12;
			var8 += var12;
		}

		if (var7 > 0 && var6 > 0) {
			method465(arg0.field46, var5, 0, UJSJLLWF.field1248, var7, var4, var9, field1181, var8, var6);
		}
	}

	@ObfuscatedName("QEHNWGKD.a([BII[IIIII[III)V")
	public void method465(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9) {
		int var11 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var12 = -arg9; var12 < 0; var12++) {
			for (int var13 = var11; var13 < 0; var13++) {
				int var14 = arg7[arg1++];
				if (var14 != 0 && arg0[arg5] == 0) {
					arg3[arg5++] = var14;
				} else {
					arg5++;
				}

				int var15 = arg7[arg1++];
				if (var15 != 0 && arg0[arg5] == 0) {
					arg3[arg5++] = var15;
				} else {
					arg5++;
				}

				int var16 = arg7[arg1++];
				if (var16 != 0 && arg0[arg5] == 0) {
					arg3[arg5++] = var16;
				} else {
					arg5++;
				}

				int var17 = arg7[arg1++];
				if (var17 != 0 && arg0[arg5] == 0) {
					arg3[arg5++] = var17;
				} else {
					arg5++;
				}
			}

			for (int var18 = arg4; var18 < 0; var18++) {
				int var19 = arg7[arg1++];
				if (var19 != 0 && arg0[arg5] == 0) {
					arg3[arg5++] = var19;
				} else {
					arg5++;
				}
			}

			arg5 += arg8;
			arg1 += arg6;
		}
	}
}
