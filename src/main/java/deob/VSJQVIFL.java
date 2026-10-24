package deob;

@ObfuscatedName("VSJQVIFL")
public final class VSJQVIFL extends IGZZCJOU {

	@ObfuscatedName("VSJQVIFL.I")
	public int field1187;

	@ObfuscatedName("VSJQVIFL.J")
	public int field1188;

	@ObfuscatedName("VSJQVIFL.D")
	public int[] field1182;

	@ObfuscatedName("VSJQVIFL.G")
	public int field1185;

	@ObfuscatedName("VSJQVIFL.H")
	public int field1186;

	@ObfuscatedName("VSJQVIFL.E")
	public int field1183;

	@ObfuscatedName("VSJQVIFL.F")
	public int field1184;

	@ObfuscatedName("VSJQVIFL.C")
	public byte[] field1181;

	public VSJQVIFL(MJLXHQTQ arg0, String arg1, int arg2) {
		XGRGMPUQ var4 = new XGRGMPUQ(arg0.method317(arg1 + ".dat", null));
		XGRGMPUQ var5 = new XGRGMPUQ(arg0.method317("index.dat", null));
		var5.field1432 = var4.method467();
		field1187 = var5.method467();
		field1188 = var5.method467();
		int var6 = var5.method465();
		field1182 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1182[var7 + 1] = var5.method469();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1432 += 2;
			var4.field1432 += var5.method467() * var5.method467();
			var5.field1432++;
		}

		field1185 = var5.method465();
		field1186 = var5.method465();
		field1183 = var5.method467();
		field1184 = var5.method467();
		int var9 = var5.method465();
		int var10 = field1184 * field1183;
		field1181 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1181[var11] = var4.method466();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1183; var12++) {
				for (int var13 = 0; var13 < field1184; var13++) {
					field1181[field1183 * var13 + var12] = var4.method466();
				}
			}
		}
	}

	@ObfuscatedName("VSJQVIFL.b(I)V")
	public void method369() {
		field1187 /= 2;
		field1188 /= 2;
		byte[] var1 = new byte[field1188 * field1187];
		int var2 = 0;
		for (int var3 = 0; var3 < field1184; var3++) {
			for (int var4 = 0; var4 < field1183; var4++) {
				var1[(field1185 + var4 >> 1) + (field1186 + var3 >> 1) * field1187] = field1181[var2++];
			}
		}

		field1181 = var1;
		field1183 = field1187;
		field1184 = field1188;
		field1185 = 0;
		field1186 = 0;
	}

	@ObfuscatedName("VSJQVIFL.c(I)V")
	public void method370() {
		if (field1187 != field1183 || field1188 != field1184) {
			byte[] var1 = new byte[field1188 * field1187];
			int var2 = 0;
			for (int var3 = 0; var3 < field1184; var3++) {
				for (int var4 = 0; var4 < field1183; var4++) {
					var1[(field1186 + var3) * field1187 + field1185 + var4] = field1181[var2++];
				}
			}

			field1181 = var1;
			field1183 = field1187;
			field1184 = field1188;
			field1185 = 0;
			field1186 = 0;
		}
	}

	@ObfuscatedName("VSJQVIFL.d(I)V")
	public void method371() {
		byte[] var1 = new byte[field1184 * field1183];
		int var2 = 0;
		for (int var3 = 0; var3 < field1184; var3++) {
			for (int var4 = field1183 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1181[field1183 * var3 + var4];
			}
		}

		field1181 = var1;
		field1185 = field1187 - field1183 - field1185;
	}

	@ObfuscatedName("VSJQVIFL.b(B)V")
	public void method372() {
		byte[] var1 = new byte[field1184 * field1183];
		int var2 = 0;
		for (int var3 = field1184 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1183; var4++) {
				var1[var2++] = field1181[field1183 * var3 + var4];
			}
		}

		field1181 = var1;
		field1186 = field1188 - field1184 - field1186;
	}

	@ObfuscatedName("VSJQVIFL.a(IZII)V")
	public void method373(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1182.length; var4++) {
			int var5 = field1182[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1182[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1182[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1182[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("VSJQVIFL.a(IZI)V")
	public void method374(int arg0, int arg1) {
		arg1 += field1185;
		arg0 += field1186;
		int var3 = IGZZCJOU.field796 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1184;
		int var6 = field1183;
		int var7 = IGZZCJOU.field796 - var6;
		int var8 = 0;

		if (arg0 < IGZZCJOU.field798) {
			int var9 = IGZZCJOU.field798 - arg0;
			var5 -= var9;
			arg0 = IGZZCJOU.field798;
			var4 += var6 * var9;
			var3 += IGZZCJOU.field796 * var9;
		}

		if (arg0 + var5 > IGZZCJOU.field799) {
			var5 -= arg0 + var5 - IGZZCJOU.field799;
		}

		if (arg1 < IGZZCJOU.field800) {
			int var10 = IGZZCJOU.field800 - arg1;
			var6 -= var10;
			arg1 = IGZZCJOU.field800;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > IGZZCJOU.field801) {
			int var11 = arg1 + var6 - IGZZCJOU.field801;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method375(field1182, var6, IGZZCJOU.field795, var7, var5, var3, var8, field1181, var4);
		}
	}

	@ObfuscatedName("VSJQVIFL.a([II[IIIIII[BI)V")
	public void method375(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8) {
		int var10 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg7[arg8++];
				if (var13 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg0[var13 & 0xFF];
				}

				byte var14 = arg7[arg8++];
				if (var14 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg0[var14 & 0xFF];
				}

				byte var15 = arg7[arg8++];
				if (var15 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg0[var15 & 0xFF];
				}

				byte var16 = arg7[arg8++];
				if (var16 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg0[var16 & 0xFF];
				}
			}

			for (int var17 = arg1; var17 < 0; var17++) {
				byte var18 = arg7[arg8++];
				if (var18 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg0[var18 & 0xFF];
				}
			}

			arg5 += arg3;
			arg8 += arg6;
		}
	}
}
