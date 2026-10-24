package deob;

@ObfuscatedName("XRUIQOVM")
public final class XRUIQOVM extends CYEOWDOP {

	@ObfuscatedName("XRUIQOVM.J")
	public int field1501;

	@ObfuscatedName("XRUIQOVM.K")
	public int field1502;

	@ObfuscatedName("XRUIQOVM.E")
	public int[] field1496;

	@ObfuscatedName("XRUIQOVM.H")
	public int field1499;

	@ObfuscatedName("XRUIQOVM.I")
	public int field1500;

	@ObfuscatedName("XRUIQOVM.F")
	public int field1497;

	@ObfuscatedName("XRUIQOVM.G")
	public int field1498;

	@ObfuscatedName("XRUIQOVM.D")
	public byte[] field1495;

	public XRUIQOVM(SRZUEVOD arg0, String arg1, int arg2) {
		LZWRHABP var4 = new LZWRHABP(arg0.method566(arg1 + ".dat", null));
		LZWRHABP var5 = new LZWRHABP(arg0.method566("index.dat", null));
		var5.field1139 = var4.method465();
		field1501 = var5.method465();
		field1502 = var5.method465();
		int var6 = var5.method463();
		field1496 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1496[var7 + 1] = var5.method467();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1139 += 2;
			var4.field1139 += var5.method465() * var5.method465();
			var5.field1139++;
		}

		field1499 = var5.method463();
		field1500 = var5.method463();
		field1497 = var5.method465();
		field1498 = var5.method465();
		int var9 = var5.method463();
		int var10 = field1498 * field1497;
		field1495 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1495[var11] = var4.method464();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1497; var12++) {
				for (int var13 = 0; var13 < field1498; var13++) {
					field1495[field1497 * var13 + var12] = var4.method464();
				}
			}
		}
	}

	@ObfuscatedName("XRUIQOVM.b(I)V")
	public void method584() {
		field1501 /= 2;
		field1502 /= 2;
		byte[] var1 = new byte[field1502 * field1501];
		int var2 = 0;
		for (int var3 = 0; var3 < field1498; var3++) {
			for (int var4 = 0; var4 < field1497; var4++) {
				var1[(field1499 + var4 >> 1) + (field1500 + var3 >> 1) * field1501] = field1495[var2++];
			}
		}

		field1495 = var1;
		field1497 = field1501;
		field1498 = field1502;
		field1499 = 0;
		field1500 = 0;
	}

	@ObfuscatedName("XRUIQOVM.a(Z)V")
	public void method585() {
		if (field1501 != field1497 || field1502 != field1498) {
			byte[] var1 = new byte[field1502 * field1501];
			int var2 = 0;
			for (int var3 = 0; var3 < field1498; var3++) {
				for (int var4 = 0; var4 < field1497; var4++) {
					var1[(field1500 + var3) * field1501 + field1499 + var4] = field1495[var2++];
				}
			}

			field1495 = var1;
			field1497 = field1501;
			field1498 = field1502;
			field1499 = 0;
			field1500 = 0;
		}
	}

	@ObfuscatedName("XRUIQOVM.c(I)V")
	public void method586() {
		byte[] var1 = new byte[field1498 * field1497];
		int var2 = 0;
		for (int var3 = 0; var3 < field1498; var3++) {
			for (int var4 = field1497 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1495[field1497 * var3 + var4];
			}
		}

		field1495 = var1;
		field1499 = field1501 - field1497 - field1499;
	}

	@ObfuscatedName("XRUIQOVM.b(Z)V")
	public void method587() {
		byte[] var1 = new byte[field1498 * field1497];
		int var2 = 0;
		for (int var3 = field1498 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1497; var4++) {
				var1[var2++] = field1495[field1497 * var3 + var4];
			}
		}

		field1495 = var1;
		field1500 = field1502 - field1498 - field1500;
	}

	@ObfuscatedName("XRUIQOVM.a(BIII)V")
	public void method588(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1496.length; var4++) {
			int var5 = field1496[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1496[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1496[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1496[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("XRUIQOVM.a(IZI)V")
	public void method589(int arg0, int arg1) {
		arg0 += field1499;
		arg1 += field1500;
		int var3 = CYEOWDOP.field639 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1498;
		int var6 = field1497;
		int var7 = CYEOWDOP.field639 - var6;
		int var8 = 0;

		if (arg1 < CYEOWDOP.field641) {
			int var9 = CYEOWDOP.field641 - arg1;
			var5 -= var9;
			arg1 = CYEOWDOP.field641;
			var4 += var6 * var9;
			var3 += CYEOWDOP.field639 * var9;
		}

		if (arg1 + var5 > CYEOWDOP.field642) {
			var5 -= arg1 + var5 - CYEOWDOP.field642;
		}

		if (arg0 < CYEOWDOP.field643) {
			int var10 = CYEOWDOP.field643 - arg0;
			var6 -= var10;
			arg0 = CYEOWDOP.field643;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > CYEOWDOP.field644) {
			int var11 = arg0 + var6 - CYEOWDOP.field644;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method590(CYEOWDOP.field638, var8, var5, field1495, var3, var6, var7, field1496, var4);
		}
	}

	@ObfuscatedName("XRUIQOVM.a([III[BIII[IZI)V")
	public void method590(int[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg3[arg8++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg7[var13 & 0xFF];
				}

				byte var14 = arg3[arg8++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg7[var14 & 0xFF];
				}

				byte var15 = arg3[arg8++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg7[var15 & 0xFF];
				}

				byte var16 = arg3[arg8++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg7[var16 & 0xFF];
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				byte var18 = arg3[arg8++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg7[var18 & 0xFF];
				}
			}

			arg4 += arg6;
			arg8 += arg1;
		}
	}
}
