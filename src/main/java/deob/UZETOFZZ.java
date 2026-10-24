package deob;

@ObfuscatedName("UZETOFZZ")
public final class UZETOFZZ extends VMBJKBNJ {

	@ObfuscatedName("UZETOFZZ.N")
	public int field1208;

	@ObfuscatedName("UZETOFZZ.O")
	public int field1209;

	@ObfuscatedName("UZETOFZZ.I")
	public int[] field1203;

	@ObfuscatedName("UZETOFZZ.L")
	public int field1206;

	@ObfuscatedName("UZETOFZZ.M")
	public int field1207;

	@ObfuscatedName("UZETOFZZ.J")
	public int field1204;

	@ObfuscatedName("UZETOFZZ.K")
	public int field1205;

	@ObfuscatedName("UZETOFZZ.H")
	public byte[] field1202;

	public UZETOFZZ(RSPRYUFS arg0, String arg1, int arg2) {
		NQUAUMDT var4 = new NQUAUMDT(arg0.method427(arg1 + ".dat", null));
		NQUAUMDT var5 = new NQUAUMDT(arg0.method427("index.dat", null));
		var5.field929 = var4.method341();
		field1208 = var5.method341();
		field1209 = var5.method341();
		int var6 = var5.method339();
		field1203 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1203[var7 + 1] = var5.method343();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field929 += 2;
			var4.field929 += var5.method341() * var5.method341();
			var5.field929++;
		}

		field1206 = var5.method339();
		field1207 = var5.method339();
		field1204 = var5.method341();
		field1205 = var5.method341();
		int var9 = var5.method339();
		int var10 = field1205 * field1204;
		field1202 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1202[var11] = var4.method340();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1204; var12++) {
				for (int var13 = 0; var13 < field1205; var13++) {
					field1202[field1204 * var13 + var12] = var4.method340();
				}
			}
		}
	}

	@ObfuscatedName("UZETOFZZ.b(I)V")
	public void method525() {
		field1208 /= 2;
		field1209 /= 2;
		byte[] var1 = new byte[field1209 * field1208];
		int var2 = 0;
		for (int var3 = 0; var3 < field1205; var3++) {
			for (int var4 = 0; var4 < field1204; var4++) {
				var1[(field1206 + var4 >> 1) + (field1207 + var3 >> 1) * field1208] = field1202[var2++];
			}
		}

		field1202 = var1;
		field1204 = field1208;
		field1205 = field1209;
		field1206 = 0;
		field1207 = 0;
	}

	@ObfuscatedName("UZETOFZZ.c(I)V")
	public void method526() {
		if (field1208 != field1204 || field1209 != field1205) {
			byte[] var1 = new byte[field1209 * field1208];
			int var2 = 0;
			for (int var3 = 0; var3 < field1205; var3++) {
				for (int var4 = 0; var4 < field1204; var4++) {
					var1[(field1207 + var3) * field1208 + field1206 + var4] = field1202[var2++];
				}
			}

			field1202 = var1;
			field1204 = field1208;
			field1205 = field1209;
			field1206 = 0;
			field1207 = 0;
		}
	}

	@ObfuscatedName("UZETOFZZ.a(Z)V")
	public void method527() {
		byte[] var1 = new byte[field1205 * field1204];
		int var2 = 0;
		for (int var3 = 0; var3 < field1205; var3++) {
			for (int var4 = field1204 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1202[field1204 * var3 + var4];
			}
		}

		field1202 = var1;
		field1206 = field1208 - field1204 - field1206;
	}

	@ObfuscatedName("UZETOFZZ.b(Z)V")
	public void method528() {
		byte[] var1 = new byte[field1205 * field1204];
		int var2 = 0;
		for (int var3 = field1205 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1204; var4++) {
				var1[var2++] = field1202[field1204 * var3 + var4];
			}
		}

		field1202 = var1;
		field1207 = field1209 - field1205 - field1207;
	}

	@ObfuscatedName("UZETOFZZ.a(IIII)V")
	public void method529(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1203.length; var4++) {
			int var5 = field1203[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1203[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1203[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1203[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("UZETOFZZ.a(III)V")
	public void method530(int arg0, int arg1) {
		arg1 += field1206;
		arg0 += field1207;
		int var3 = VMBJKBNJ.field1284 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1205;
		int var6 = field1204;
		int var7 = VMBJKBNJ.field1284 - var6;
		int var8 = 0;

		if (arg0 < VMBJKBNJ.field1286) {
			int var9 = VMBJKBNJ.field1286 - arg0;
			var5 -= var9;
			arg0 = VMBJKBNJ.field1286;
			var4 += var6 * var9;
			var3 += VMBJKBNJ.field1284 * var9;
		}

		if (arg0 + var5 > VMBJKBNJ.field1287) {
			var5 -= arg0 + var5 - VMBJKBNJ.field1287;
		}

		if (arg1 < VMBJKBNJ.field1288) {
			int var10 = VMBJKBNJ.field1288 - arg1;
			var6 -= var10;
			arg1 = VMBJKBNJ.field1288;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > VMBJKBNJ.field1289) {
			int var11 = arg1 + var6 - VMBJKBNJ.field1289;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method531(field1202, var8, var3, var5, var6, VMBJKBNJ.field1283, var7, field1203, var4);
		}
	}

	@ObfuscatedName("UZETOFZZ.a([BIBIII[II[II)V")
	public void method531(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8) {
		int var10 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var11 = -arg3; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg0[arg8++];
				if (var13 == 0) {
					arg2++;
				} else {
					arg5[arg2++] = arg7[var13 & 0xFF];
				}

				byte var14 = arg0[arg8++];
				if (var14 == 0) {
					arg2++;
				} else {
					arg5[arg2++] = arg7[var14 & 0xFF];
				}

				byte var15 = arg0[arg8++];
				if (var15 == 0) {
					arg2++;
				} else {
					arg5[arg2++] = arg7[var15 & 0xFF];
				}

				byte var16 = arg0[arg8++];
				if (var16 == 0) {
					arg2++;
				} else {
					arg5[arg2++] = arg7[var16 & 0xFF];
				}
			}

			for (int var17 = arg4; var17 < 0; var17++) {
				byte var18 = arg0[arg8++];
				if (var18 == 0) {
					arg2++;
				} else {
					arg5[arg2++] = arg7[var18 & 0xFF];
				}
			}

			arg2 += arg6;
			arg8 += arg1;
		}
	}
}
