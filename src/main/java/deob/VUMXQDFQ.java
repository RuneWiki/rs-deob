package deob;

@ObfuscatedName("VUMXQDFQ")
public final class VUMXQDFQ extends TQHEKXXC {

	@ObfuscatedName("VUMXQDFQ.N")
	public int field1265;

	@ObfuscatedName("VUMXQDFQ.O")
	public int field1266;

	@ObfuscatedName("VUMXQDFQ.I")
	public int[] field1260;

	@ObfuscatedName("VUMXQDFQ.L")
	public int field1263;

	@ObfuscatedName("VUMXQDFQ.M")
	public int field1264;

	@ObfuscatedName("VUMXQDFQ.J")
	public int field1261;

	@ObfuscatedName("VUMXQDFQ.K")
	public int field1262;

	@ObfuscatedName("VUMXQDFQ.H")
	public byte[] field1259;

	public VUMXQDFQ(XRWUKRPO arg0, String arg1, int arg2) {
		GLMIQHJI var4 = new GLMIQHJI(arg0.method581(arg1 + ".dat", null));
		GLMIQHJI var5 = new GLMIQHJI(arg0.method581("index.dat", null));
		var5.field709 = var4.method246();
		field1265 = var5.method246();
		field1266 = var5.method246();
		int var6 = var5.method244();
		field1260 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1260[var7 + 1] = var5.method248();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field709 += 2;
			var4.field709 += var5.method246() * var5.method246();
			var5.field709++;
		}

		field1263 = var5.method244();
		field1264 = var5.method244();
		field1261 = var5.method246();
		field1262 = var5.method246();
		int var9 = var5.method244();
		int var10 = field1262 * field1261;
		field1259 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1259[var11] = var4.method245();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1261; var12++) {
				for (int var13 = 0; var13 < field1262; var13++) {
					field1259[field1261 * var13 + var12] = var4.method245();
				}
			}
		}
	}

	@ObfuscatedName("VUMXQDFQ.c(I)V")
	public void method537() {
		field1265 /= 2;
		field1266 /= 2;
		byte[] var1 = new byte[field1266 * field1265];
		int var2 = 0;
		for (int var3 = 0; var3 < field1262; var3++) {
			for (int var4 = 0; var4 < field1261; var4++) {
				var1[(field1263 + var4 >> 1) + (field1264 + var3 >> 1) * field1265] = field1259[var2++];
			}
		}

		field1259 = var1;
		field1261 = field1265;
		field1262 = field1266;
		field1263 = 0;
		field1264 = 0;
	}

	@ObfuscatedName("VUMXQDFQ.d(I)V")
	public void method538() {
		if (field1265 != field1261 || field1266 != field1262) {
			byte[] var1 = new byte[field1266 * field1265];
			int var2 = 0;
			for (int var3 = 0; var3 < field1262; var3++) {
				for (int var4 = 0; var4 < field1261; var4++) {
					var1[(field1264 + var3) * field1265 + field1263 + var4] = field1259[var2++];
				}
			}

			field1259 = var1;
			field1261 = field1265;
			field1262 = field1266;
			field1263 = 0;
			field1264 = 0;
		}
	}

	@ObfuscatedName("VUMXQDFQ.e(I)V")
	public void method539() {
		byte[] var1 = new byte[field1262 * field1261];
		int var2 = 0;
		for (int var3 = 0; var3 < field1262; var3++) {
			for (int var4 = field1261 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1259[field1261 * var3 + var4];
			}
		}

		field1259 = var1;
		field1263 = field1265 - field1261 - field1263;
	}

	@ObfuscatedName("VUMXQDFQ.a(B)V")
	public void method540() {
		byte[] var1 = new byte[field1262 * field1261];
		int var2 = 0;
		for (int var3 = field1262 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1261; var4++) {
				var1[var2++] = field1259[field1261 * var3 + var4];
			}
		}

		field1259 = var1;
		field1264 = field1266 - field1262 - field1264;
	}

	@ObfuscatedName("VUMXQDFQ.a(IIIB)V")
	public void method541(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1260.length; var4++) {
			int var5 = field1260[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1260[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1260[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1260[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("VUMXQDFQ.a(III)V")
	public void method542(int arg0, int arg1) {
		arg0 += field1263;
		arg1 += field1264;
		int var3 = TQHEKXXC.field1090 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1262;
		int var6 = field1261;
		int var7 = TQHEKXXC.field1090 - var6;
		int var8 = 0;

		if (arg1 < TQHEKXXC.field1092) {
			int var9 = TQHEKXXC.field1092 - arg1;
			var5 -= var9;
			arg1 = TQHEKXXC.field1092;
			var4 += var6 * var9;
			var3 += TQHEKXXC.field1090 * var9;
		}

		if (arg1 + var5 > TQHEKXXC.field1093) {
			var5 -= arg1 + var5 - TQHEKXXC.field1093;
		}

		if (arg0 < TQHEKXXC.field1094) {
			int var10 = TQHEKXXC.field1094 - arg0;
			var6 -= var10;
			arg0 = TQHEKXXC.field1094;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > TQHEKXXC.field1095) {
			int var11 = arg0 + var6 - TQHEKXXC.field1095;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method543(var4, var3, var8, var5, var6, field1259, TQHEKXXC.field1089, var7, field1260);
		}
	}

	@ObfuscatedName("VUMXQDFQ.a(IIIII[B[II[II)V")
	public void method543(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int[] arg6, int arg7, int[] arg8) {
		int var10 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var11 = -arg3; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg5[arg0++];
				if (var13 == 0) {
					arg1++;
				} else {
					arg6[arg1++] = arg8[var13 & 0xFF];
				}

				byte var14 = arg5[arg0++];
				if (var14 == 0) {
					arg1++;
				} else {
					arg6[arg1++] = arg8[var14 & 0xFF];
				}

				byte var15 = arg5[arg0++];
				if (var15 == 0) {
					arg1++;
				} else {
					arg6[arg1++] = arg8[var15 & 0xFF];
				}

				byte var16 = arg5[arg0++];
				if (var16 == 0) {
					arg1++;
				} else {
					arg6[arg1++] = arg8[var16 & 0xFF];
				}
			}

			for (int var17 = arg4; var17 < 0; var17++) {
				byte var18 = arg5[arg0++];
				if (var18 == 0) {
					arg1++;
				} else {
					arg6[arg1++] = arg8[var18 & 0xFF];
				}
			}

			arg1 += arg7;
			arg0 += arg2;
		}
	}
}
