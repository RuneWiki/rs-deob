package deob;

@ObfuscatedName("LUUCVUQY")
public final class LUUCVUQY {

	@ObfuscatedName("LUUCVUQY.c")
	public int[] field785 = new int[256];

	@ObfuscatedName("LUUCVUQY.b")
	public int[] field784 = new int[256];

	@ObfuscatedName("LUUCVUQY.a")
	public int field783;

	@ObfuscatedName("LUUCVUQY.d")
	public int field786;

	@ObfuscatedName("LUUCVUQY.e")
	public int field787;

	@ObfuscatedName("LUUCVUQY.f")
	public int field788;

	public LUUCVUQY(int[] arg0) {
		for (int var2 = 0; var2 < arg0.length; var2++) {
			field784[var2] = arg0[var2];
		}

		method267();
	}

	@ObfuscatedName("LUUCVUQY.a()I")
	public final int method265() {
		if (field783-- == 0) {
			method266();
			field783 = 255;
		}

		return field784[field783];
	}

	@ObfuscatedName("LUUCVUQY.b()V")
	public final void method266() {
		field787 += ++field788;
		for (int var1 = 0; var1 < 256; var1++) {
			int var2 = field785[var1];

			if ((var1 & 0x3) == 0) {
				field786 ^= field786 << 13;
			} else if ((var1 & 0x3) == 1) {
				field786 ^= field786 >>> 6;
			} else if ((var1 & 0x3) == 2) {
				field786 ^= field786 << 2;
			} else if ((var1 & 0x3) == 3) {
				field786 ^= field786 >>> 16;
			}

			field786 += field785[var1 + 128 & 0xFF];
			int var3;
			field785[var1] = var3 = field785[var2 >> 2 & 0xFF] + field786 + field787;
			field784[var1] = field787 = field785[var3 >> 8 >> 2 & 0xFF] + var2;
		}
	}

	@ObfuscatedName("LUUCVUQY.c()V")
	public final void method267() {
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
			var8 += field784[var10];
			var7 += field784[var10 + 1];
			var6 += field784[var10 + 2];
			var5 += field784[var10 + 3];
			var4 += field784[var10 + 4];
			var3 += field784[var10 + 5];
			var2 += field784[var10 + 6];
			var1 += field784[var10 + 7];
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
			field785[var10] = var8;
			field785[var10 + 1] = var7;
			field785[var10 + 2] = var6;
			field785[var10 + 3] = var5;
			field785[var10 + 4] = var4;
			field785[var10 + 5] = var3;
			field785[var10 + 6] = var2;
			field785[var10 + 7] = var1;
		}

		for (int var11 = 0; var11 < 256; var11 += 8) {
			var8 += field785[var11];
			var7 += field785[var11 + 1];
			var6 += field785[var11 + 2];
			var5 += field785[var11 + 3];
			var4 += field785[var11 + 4];
			var3 += field785[var11 + 5];
			var2 += field785[var11 + 6];
			var1 += field785[var11 + 7];
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
			field785[var11] = var8;
			field785[var11 + 1] = var7;
			field785[var11 + 2] = var6;
			field785[var11 + 3] = var5;
			field785[var11 + 4] = var4;
			field785[var11 + 5] = var3;
			field785[var11 + 6] = var2;
			field785[var11 + 7] = var1;
		}

		method266();
		field783 = 256;
	}
}
