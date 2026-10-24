package deob;

@ObfuscatedName("OSRLSEOB")
public final class OSRLSEOB extends KPYGFVMA {

	@ObfuscatedName("OSRLSEOB.G")
	public int field1146;

	@ObfuscatedName("OSRLSEOB.H")
	public int field1147;

	@ObfuscatedName("OSRLSEOB.B")
	public int[] field1141;

	@ObfuscatedName("OSRLSEOB.E")
	public int field1144;

	@ObfuscatedName("OSRLSEOB.F")
	public int field1145;

	@ObfuscatedName("OSRLSEOB.C")
	public int field1142;

	@ObfuscatedName("OSRLSEOB.D")
	public int field1143;

	@ObfuscatedName("OSRLSEOB.A")
	public byte[] field1140;

	public OSRLSEOB(LKPVZAQN arg0, String arg1, int arg2) {
		WBEWPIXO var4 = new WBEWPIXO(arg0.method323(arg1 + ".dat", null));
		WBEWPIXO var5 = new WBEWPIXO(arg0.method323("index.dat", null));
		var5.field1401 = var4.method517();
		field1146 = var5.method517();
		field1147 = var5.method517();
		int var6 = var5.method515();
		field1141 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1141[var7 + 1] = var5.method519();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1401 += 2;
			var4.field1401 += var5.method517() * var5.method517();
			var5.field1401++;
		}

		field1144 = var5.method515();
		field1145 = var5.method515();
		field1142 = var5.method517();
		field1143 = var5.method517();
		int var9 = var5.method515();
		int var10 = field1143 * field1142;
		field1140 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1140[var11] = var4.method516();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1142; var12++) {
				for (int var13 = 0; var13 < field1143; var13++) {
					field1140[field1142 * var13 + var12] = var4.method516();
				}
			}
		}
	}

	@ObfuscatedName("OSRLSEOB.b(I)V")
	public void method364() {
		field1146 /= 2;
		field1147 /= 2;
		byte[] var1 = new byte[field1147 * field1146];
		int var2 = 0;
		for (int var3 = 0; var3 < field1143; var3++) {
			for (int var4 = 0; var4 < field1142; var4++) {
				var1[(field1144 + var4 >> 1) + (field1145 + var3 >> 1) * field1146] = field1140[var2++];
			}
		}

		field1140 = var1;
		field1142 = field1146;
		field1143 = field1147;
		field1144 = 0;
		field1145 = 0;
	}

	@ObfuscatedName("OSRLSEOB.c(I)V")
	public void method365() {
		if (field1146 != field1142 || field1147 != field1143) {
			byte[] var1 = new byte[field1147 * field1146];
			int var2 = 0;
			for (int var3 = 0; var3 < field1143; var3++) {
				for (int var4 = 0; var4 < field1142; var4++) {
					var1[(field1145 + var3) * field1146 + field1144 + var4] = field1140[var2++];
				}
			}

			field1140 = var1;
			field1142 = field1146;
			field1143 = field1147;
			field1144 = 0;
			field1145 = 0;
		}
	}

	@ObfuscatedName("OSRLSEOB.d(I)V")
	public void method366() {
		byte[] var1 = new byte[field1143 * field1142];
		int var2 = 0;
		for (int var3 = 0; var3 < field1143; var3++) {
			for (int var4 = field1142 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1140[field1142 * var3 + var4];
			}
		}

		field1140 = var1;
		field1144 = field1146 - field1142 - field1144;
	}

	@ObfuscatedName("OSRLSEOB.e(I)V")
	public void method367() {
		byte[] var1 = new byte[field1143 * field1142];
		int var2 = 0;
		for (int var3 = field1143 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1142; var4++) {
				var1[var2++] = field1140[field1142 * var3 + var4];
			}
		}

		field1140 = var1;
		field1145 = field1147 - field1143 - field1145;
	}

	@ObfuscatedName("OSRLSEOB.a(IIBI)V")
	public void method368(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1141.length; var4++) {
			int var5 = field1141[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1141[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1141[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1141[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("OSRLSEOB.a(III)V")
	public void method369(int arg0, int arg1) {
		arg0 += field1144;
		arg1 += field1145;
		int var3 = KPYGFVMA.field969 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1143;
		int var6 = field1142;
		int var7 = KPYGFVMA.field969 - var6;
		int var8 = 0;

		if (arg1 < KPYGFVMA.field971) {
			int var9 = KPYGFVMA.field971 - arg1;
			var5 -= var9;
			arg1 = KPYGFVMA.field971;
			var4 += var6 * var9;
			var3 += KPYGFVMA.field969 * var9;
		}

		if (arg1 + var5 > KPYGFVMA.field972) {
			var5 -= arg1 + var5 - KPYGFVMA.field972;
		}

		if (arg0 < KPYGFVMA.field973) {
			int var10 = KPYGFVMA.field973 - arg0;
			var6 -= var10;
			arg0 = KPYGFVMA.field973;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > KPYGFVMA.field974) {
			int var11 = arg0 + var6 - KPYGFVMA.field974;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method370(field1141, var4, var5, field1140, KPYGFVMA.field968, var8, var7, var3, var6);
		}
	}

	@ObfuscatedName("OSRLSEOB.a([III[B[IIIIBI)V")
	public void method370(int[] arg0, int arg1, int arg2, byte[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg8 >> 2);
		arg8 = -(arg8 & 0x3);
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg3[arg1++];
				if (var13 == 0) {
					arg7++;
				} else {
					arg4[arg7++] = arg0[var13 & 0xFF];
				}

				byte var14 = arg3[arg1++];
				if (var14 == 0) {
					arg7++;
				} else {
					arg4[arg7++] = arg0[var14 & 0xFF];
				}

				byte var15 = arg3[arg1++];
				if (var15 == 0) {
					arg7++;
				} else {
					arg4[arg7++] = arg0[var15 & 0xFF];
				}

				byte var16 = arg3[arg1++];
				if (var16 == 0) {
					arg7++;
				} else {
					arg4[arg7++] = arg0[var16 & 0xFF];
				}
			}

			for (int var17 = arg8; var17 < 0; var17++) {
				byte var18 = arg3[arg1++];
				if (var18 == 0) {
					arg7++;
				} else {
					arg4[arg7++] = arg0[var18 & 0xFF];
				}
			}

			arg7 += arg6;
			arg1 += arg5;
		}
	}
}
