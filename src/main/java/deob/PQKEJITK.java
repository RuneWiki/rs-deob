package deob;

@ObfuscatedName("PQKEJITK")
public final class PQKEJITK extends VDGJUQAS {

	@ObfuscatedName("PQKEJITK.H")
	public int field1100;

	@ObfuscatedName("PQKEJITK.I")
	public int field1101;

	@ObfuscatedName("PQKEJITK.C")
	public int[] field1095;

	@ObfuscatedName("PQKEJITK.F")
	public int field1098;

	@ObfuscatedName("PQKEJITK.G")
	public int field1099;

	@ObfuscatedName("PQKEJITK.D")
	public int field1096;

	@ObfuscatedName("PQKEJITK.E")
	public int field1097;

	@ObfuscatedName("PQKEJITK.B")
	public byte[] field1094;

	public PQKEJITK(FNOQZAYQ arg0, String arg1, int arg2) {
		DNRIFKTO var4 = new DNRIFKTO(arg0.method246(arg1 + ".dat", null));
		DNRIFKTO var5 = new DNRIFKTO(arg0.method246("index.dat", null));
		var5.field563 = var4.method191();
		field1100 = var5.method191();
		field1101 = var5.method191();
		int var6 = var5.method189();
		field1095 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1095[var7 + 1] = var5.method193();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field563 += 2;
			var4.field563 += var5.method191() * var5.method191();
			var5.field563++;
		}

		field1098 = var5.method189();
		field1099 = var5.method189();
		field1096 = var5.method191();
		field1097 = var5.method191();
		int var9 = var5.method189();
		int var10 = field1097 * field1096;
		field1094 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1094[var11] = var4.method190();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1096; var12++) {
				for (int var13 = 0; var13 < field1097; var13++) {
					field1094[field1096 * var13 + var12] = var4.method190();
				}
			}
		}
	}

	@ObfuscatedName("PQKEJITK.a(Z)V")
	public void method385() {
		field1100 /= 2;
		field1101 /= 2;
		byte[] var1 = new byte[field1101 * field1100];
		int var2 = 0;
		for (int var3 = 0; var3 < field1097; var3++) {
			for (int var4 = 0; var4 < field1096; var4++) {
				var1[(field1098 + var4 >> 1) + (field1099 + var3 >> 1) * field1100] = field1094[var2++];
			}
		}

		field1094 = var1;
		field1096 = field1100;
		field1097 = field1101;
		field1098 = 0;
		field1099 = 0;
	}

	@ObfuscatedName("PQKEJITK.b(B)V")
	public void method386() {
		if (field1100 != field1096 || field1101 != field1097) {
			byte[] var1 = new byte[field1101 * field1100];
			int var2 = 0;
			for (int var3 = 0; var3 < field1097; var3++) {
				for (int var4 = 0; var4 < field1096; var4++) {
					var1[(field1099 + var3) * field1100 + field1098 + var4] = field1094[var2++];
				}
			}

			field1094 = var1;
			field1096 = field1100;
			field1097 = field1101;
			field1098 = 0;
			field1099 = 0;
		}
	}

	@ObfuscatedName("PQKEJITK.b(I)V")
	public void method387() {
		byte[] var1 = new byte[field1097 * field1096];
		int var2 = 0;
		for (int var3 = 0; var3 < field1097; var3++) {
			for (int var4 = field1096 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1094[field1096 * var3 + var4];
			}
		}

		field1094 = var1;
		field1098 = field1100 - field1096 - field1098;
	}

	@ObfuscatedName("PQKEJITK.c(B)V")
	public void method388() {
		byte[] var1 = new byte[field1097 * field1096];
		int var2 = 0;
		for (int var3 = field1097 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1096; var4++) {
				var1[var2++] = field1094[field1096 * var3 + var4];
			}
		}

		field1094 = var1;
		field1099 = field1101 - field1097 - field1099;
	}

	@ObfuscatedName("PQKEJITK.a(IIII)V")
	public void method389(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1095.length; var4++) {
			int var5 = field1095[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1095[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1095[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1095[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("PQKEJITK.a(BII)V")
	public void method390(int arg0, int arg1) {
		arg0 += field1098;
		arg1 += field1099;
		int var3 = VDGJUQAS.field1312 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1097;
		int var6 = field1096;
		int var7 = VDGJUQAS.field1312 - var6;
		int var8 = 0;

		if (arg1 < VDGJUQAS.field1314) {
			int var9 = VDGJUQAS.field1314 - arg1;
			var5 -= var9;
			arg1 = VDGJUQAS.field1314;
			var4 += var6 * var9;
			var3 += VDGJUQAS.field1312 * var9;
		}

		if (arg1 + var5 > VDGJUQAS.field1315) {
			var5 -= arg1 + var5 - VDGJUQAS.field1315;
		}

		if (arg0 < VDGJUQAS.field1316) {
			int var10 = VDGJUQAS.field1316 - arg0;
			var6 -= var10;
			arg0 = VDGJUQAS.field1316;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > VDGJUQAS.field1317) {
			int var11 = arg0 + var6 - VDGJUQAS.field1317;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method391(var7, field1095, var3, var6, var5, VDGJUQAS.field1311, var4, field1094, var8);
		}
	}

	@ObfuscatedName("PQKEJITK.a(I[IIII[II[BIB)V")
	public void method391(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, byte[] arg7, int arg8) {
		int var10 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg7[arg6++];
				if (var13 == 0) {
					arg2++;
				} else {
					arg5[arg2++] = arg1[var13 & 0xFF];
				}

				byte var14 = arg7[arg6++];
				if (var14 == 0) {
					arg2++;
				} else {
					arg5[arg2++] = arg1[var14 & 0xFF];
				}

				byte var15 = arg7[arg6++];
				if (var15 == 0) {
					arg2++;
				} else {
					arg5[arg2++] = arg1[var15 & 0xFF];
				}

				byte var16 = arg7[arg6++];
				if (var16 == 0) {
					arg2++;
				} else {
					arg5[arg2++] = arg1[var16 & 0xFF];
				}
			}

			for (int var17 = arg3; var17 < 0; var17++) {
				byte var18 = arg7[arg6++];
				if (var18 == 0) {
					arg2++;
				} else {
					arg5[arg2++] = arg1[var18 & 0xFF];
				}
			}

			arg2 += arg0;
			arg6 += arg8;
		}
	}
}
