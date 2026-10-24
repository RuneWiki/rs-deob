package deob;

@ObfuscatedName("GOLMSHHL")
public final class GOLMSHHL {

	@ObfuscatedName("GOLMSHHL.c")
	public int[] field614 = new int[256];

	@ObfuscatedName("GOLMSHHL.b")
	public int[] field613 = new int[256];

	@ObfuscatedName("GOLMSHHL.a")
	public int field612;

	@ObfuscatedName("GOLMSHHL.d")
	public int field615;

	@ObfuscatedName("GOLMSHHL.e")
	public int field616;

	@ObfuscatedName("GOLMSHHL.f")
	public int field617;

	public GOLMSHHL(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field613[var2] = arg0[var2];
		}

		method258();
	}

	@ObfuscatedName("GOLMSHHL.a()I")
	public final int method256() {
		if (field612-- == 0) {
			method257();
			field612 = 255;
		}

		return field613[field612];
	}

	@ObfuscatedName("GOLMSHHL.b()V")
	public final void method257() {
		field616 += ++field617;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field614[var1];

			if ((var1 & 0x3) == 0) {
				field615 ^= field615 << 13;
			} else if ((var1 & 0x3) == 1) {
				field615 ^= field615 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field615 ^= field615 << 2;
			} else if ((var1 & 0x3) == 3) {
				field615 ^= field615 >>> 16;
			}

			field615 += field614[var1 + 128 & 0xFF];
			int var3;
			field614[var1] = var3 = field614[var2 >> 2 & 0xFF] + field615 + field616;
			field613[var1] = field616 = field614[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("GOLMSHHL.c()V")
	public final void method258() {
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
			var8 += field613[var10];
			var7 += field613[var10 + 1];
			var6 += field613[var10 + 2];
			var5 += field613[var10 + 3];
			var4 += field613[var10 + 4];
			var3 += field613[var10 + 5];
			var2 += field613[var10 + 6];
			var1 += field613[var10 + 7];
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
			field614[var10] = var8;
			field614[var10 + 1] = var7;
			field614[var10 + 2] = var6;
			field614[var10 + 3] = var5;
			field614[var10 + 4] = var4;
			field614[var10 + 5] = var3;
			field614[var10 + 6] = var2;
			field614[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field614[var11];
			var7 += field614[var11 + 1];
			var6 += field614[var11 + 2];
			var5 += field614[var11 + 3];
			var4 += field614[var11 + 4];
			var3 += field614[var11 + 5];
			var2 += field614[var11 + 6];
			var1 += field614[var11 + 7];
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
			field614[var11] = var8;
			field614[var11 + 1] = var7;
			field614[var11 + 2] = var6;
			field614[var11 + 3] = var5;
			field614[var11 + 4] = var4;
			field614[var11 + 5] = var3;
			field614[var11 + 6] = var2;
			field614[var11 + 7] = var1;
		}

		method257();
		field612 = 256;
	}
}
