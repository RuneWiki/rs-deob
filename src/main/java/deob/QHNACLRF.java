package deob;

@ObfuscatedName("QHNACLRF")
public final class QHNACLRF {

	@ObfuscatedName("QHNACLRF.c")
	public int[] field1264 = new int[256];

	@ObfuscatedName("QHNACLRF.b")
	public int[] field1263 = new int[256];

	@ObfuscatedName("QHNACLRF.a")
	public int field1262;

	@ObfuscatedName("QHNACLRF.d")
	public int field1265;

	@ObfuscatedName("QHNACLRF.e")
	public int field1266;

	@ObfuscatedName("QHNACLRF.f")
	public int field1267;

	public QHNACLRF(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field1263[var2] = arg0[var2];
		}

		method524();
	}

	@ObfuscatedName("QHNACLRF.a()I")
	public final int method522() {
		if (field1262-- == 0) {
			method523();
			field1262 = 255;
		}

		return field1263[field1262];
	}

	@ObfuscatedName("QHNACLRF.b()V")
	public final void method523() {
		field1266 += ++field1267;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field1264[var1];

			if ((var1 & 0x3) == 0) {
				field1265 ^= field1265 << 13;
			} else if ((var1 & 0x3) == 1) {
				field1265 ^= field1265 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field1265 ^= field1265 << 2;
			} else if ((var1 & 0x3) == 3) {
				field1265 ^= field1265 >>> 16;
			}

			field1265 += field1264[var1 + 128 & 0xFF];
			int var3;
			field1264[var1] = var3 = field1264[var2 >> 2 & 0xFF] + field1265 + field1266;
			field1263[var1] = field1266 = field1264[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("QHNACLRF.c()V")
	public final void method524() {
		int var1 = 0x9E3779B9;
		int var2 = 0x9E3779B9;
		int var3 = 0x9E3779B9;
		int var4 = 0x9E3779B9;
		int var5 = 0x9E3779B9;
		int var6 = 0x9E3779B9;
		int var7 = 0x9E3779B9;
		int var8 = 0x9E3779B9;
		for (int var9 = 0; var9 < 4; var9++) {
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
		}

		for (int var10 = 0; var10 < 256; var10 += 8) {
			var8 += field1263[var10];
			var7 += field1263[var10 + 1];
			var6 += field1263[var10 + 2];
			var5 += field1263[var10 + 3];
			var4 += field1263[var10 + 4];
			var3 += field1263[var10 + 5];
			var2 += field1263[var10 + 6];
			var1 += field1263[var10 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
			field1264[var10] = var8;
			field1264[var10 + 1] = var7;
			field1264[var10 + 2] = var6;
			field1264[var10 + 3] = var5;
			field1264[var10 + 4] = var4;
			field1264[var10 + 5] = var3;
			field1264[var10 + 6] = var2;
			field1264[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field1264[var11];
			var7 += field1264[var11 + 1];
			var6 += field1264[var11 + 2];
			var5 += field1264[var11 + 3];
			var4 += field1264[var11 + 4];
			var3 += field1264[var11 + 5];
			var2 += field1264[var11 + 6];
			var1 += field1264[var11 + 7];
			var8 ^= var7 << 11;
			var5 += var8;
			var7 += var6;
			var7 ^= var6 >>> 2;
			var4 += var7;
			var6 += var5;
			var6 ^= var5 << 8;
			var3 += var6;
			var5 += var4;
			var5 ^= var4 >>> 16;
			var2 += var5;
			var4 += var3;
			var4 ^= var3 << 10;
			var1 += var4;
			var3 += var2;
			var3 ^= var2 >>> 4;
			var8 += var3;
			var2 += var1;
			var2 ^= var1 << 8;
			var7 += var2;
			var1 += var8;
			var1 ^= var8 >>> 9;
			var6 += var1;
			var8 += var7;
			field1264[var11] = var8;
			field1264[var11 + 1] = var7;
			field1264[var11 + 2] = var6;
			field1264[var11 + 3] = var5;
			field1264[var11 + 4] = var4;
			field1264[var11 + 5] = var3;
			field1264[var11 + 6] = var2;
			field1264[var11 + 7] = var1;
		}

		method523();
		field1262 = 256;
	}
}
