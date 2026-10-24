package deob;

@ObfuscatedName("BVXAXAEI")
public final class BVXAXAEI extends UJSJLLWF {

	@ObfuscatedName("BVXAXAEI.J")
	public int field52;

	@ObfuscatedName("BVXAXAEI.K")
	public int field53;

	@ObfuscatedName("BVXAXAEI.E")
	public int[] field47;

	@ObfuscatedName("BVXAXAEI.H")
	public int field50;

	@ObfuscatedName("BVXAXAEI.I")
	public int field51;

	@ObfuscatedName("BVXAXAEI.F")
	public int field48;

	@ObfuscatedName("BVXAXAEI.G")
	public int field49;

	@ObfuscatedName("BVXAXAEI.D")
	public byte[] field46;

	public BVXAXAEI(NXFIIFAD arg0, String arg1, int arg2) {
		MNKDCXXG var4 = new MNKDCXXG(arg0.method431(arg1 + ".dat", null));
		MNKDCXXG var5 = new MNKDCXXG(arg0.method431("index.dat", null));
		var5.field1055 = var4.method388();
		field52 = var5.method388();
		field53 = var5.method388();
		int var6 = var5.method386();
		field47 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field47[var7 + 1] = var5.method390();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1055 += 2;
			var4.field1055 += var5.method388() * var5.method388();
			var5.field1055++;
		}

		field50 = var5.method386();
		field51 = var5.method386();
		field48 = var5.method388();
		field49 = var5.method388();
		int var9 = var5.method386();
		int var10 = field49 * field48;
		field46 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field46[var11] = var4.method387();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field48; var12++) {
				for (int var13 = 0; var13 < field49; var13++) {
					field46[field48 * var13 + var12] = var4.method387();
				}
			}
		}
	}

	@ObfuscatedName("BVXAXAEI.b(I)V")
	public void method15() {
		field52 /= 2;
		field53 /= 2;
		byte[] var1 = new byte[field53 * field52];
		int var2 = 0;
		for (int var3 = 0; var3 < field49; var3++) {
			for (int var4 = 0; var4 < field48; var4++) {
				var1[(field50 + var4 >> 1) + (field51 + var3 >> 1) * field52] = field46[var2++];
			}
		}

		field46 = var1;
		field48 = field52;
		field49 = field53;
		field50 = 0;
		field51 = 0;
	}

	@ObfuscatedName("BVXAXAEI.a(Z)V")
	public void method16() {
		if (field52 != field48 || field53 != field49) {
			byte[] var1 = new byte[field53 * field52];
			int var2 = 0;
			for (int var3 = 0; var3 < field49; var3++) {
				for (int var4 = 0; var4 < field48; var4++) {
					var1[(field51 + var3) * field52 + field50 + var4] = field46[var2++];
				}
			}

			field46 = var1;
			field48 = field52;
			field49 = field53;
			field50 = 0;
			field51 = 0;
		}
	}

	@ObfuscatedName("BVXAXAEI.b(B)V")
	public void method17() {
		byte[] var1 = new byte[field49 * field48];
		int var2 = 0;
		for (int var3 = 0; var3 < field49; var3++) {
			for (int var4 = field48 - 1; var4 >= 0; var4--) {
				var1[var2++] = field46[field48 * var3 + var4];
			}
		}

		field46 = var1;
		field50 = field52 - field48 - field50;
	}

	@ObfuscatedName("BVXAXAEI.b(Z)V")
	public void method18() {
		byte[] var1 = new byte[field49 * field48];
		int var2 = 0;
		for (int var3 = field49 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field48; var4++) {
				var1[var2++] = field46[field48 * var3 + var4];
			}
		}

		field46 = var1;
		field51 = field53 - field49 - field51;
	}

	@ObfuscatedName("BVXAXAEI.a(IIIZ)V")
	public void method19(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field47.length; var4++) {
			int var5 = field47[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field47[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field47[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field47[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("BVXAXAEI.a(III)V")
	public void method20(int arg0, int arg1) {
		arg1 += field50;
		arg0 += field51;
		int var3 = UJSJLLWF.field1249 * arg0 + arg1;
		int var4 = 0;
		int var5 = field49;
		int var6 = field48;
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
			method21(var3, var7, field47, var8, UJSJLLWF.field1248, var6, var4, var5, field46);
		}
	}

	@ObfuscatedName("BVXAXAEI.a(II[II[IIIII[B)V")
	public void method21(int arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, byte[] arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg8[arg6++];
				if (var13 == 0) {
					arg0++;
				} else {
					arg4[arg0++] = arg2[var13 & 0xFF];
				}

				byte var14 = arg8[arg6++];
				if (var14 == 0) {
					arg0++;
				} else {
					arg4[arg0++] = arg2[var14 & 0xFF];
				}

				byte var15 = arg8[arg6++];
				if (var15 == 0) {
					arg0++;
				} else {
					arg4[arg0++] = arg2[var15 & 0xFF];
				}

				byte var16 = arg8[arg6++];
				if (var16 == 0) {
					arg0++;
				} else {
					arg4[arg0++] = arg2[var16 & 0xFF];
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				byte var18 = arg8[arg6++];
				if (var18 == 0) {
					arg0++;
				} else {
					arg4[arg0++] = arg2[var18 & 0xFF];
				}
			}

			arg0 += arg1;
			arg6 += arg3;
		}
	}
}
