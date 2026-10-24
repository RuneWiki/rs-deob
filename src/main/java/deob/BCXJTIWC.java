package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("BCXJTIWC")
public final class BCXJTIWC {

	@ObfuscatedName("BCXJTIWC.h")
	public int field17 = 65000;

	@ObfuscatedName("BCXJTIWC.g")
	public int field16;

	@ObfuscatedName("BCXJTIWC.e")
	public RandomAccessFile field14;

	@ObfuscatedName("BCXJTIWC.f")
	public RandomAccessFile field15;

	@ObfuscatedName("BCXJTIWC.d")
	public static byte[] field13 = new byte[520];

	public BCXJTIWC(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3) {
		field16 = arg2;
		field14 = arg1;
		field15 = arg3;
		field17 = arg0;
	}

	@ObfuscatedName("BCXJTIWC.a(IB)[B")
	public synchronized byte[] method15(int arg0) {
		try {
			method18(arg0 * 6, field15);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field15.read(field13, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field13[2] & 0xFF) + ((field13[0] & 0xFF) << 16) + ((field13[1] & 0xFF) << 8);
			int var5 = (field13[5] & 0xFF) + ((field13[3] & 0xFF) << 16) + ((field13[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field17) {
				if (var5 > 0 && var5 <= field14.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method18(var5 * 520, field14);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field14.read(field13, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field13[0] & 0xFF) << 8) + (field13[1] & 0xFF);
						int var13 = ((field13[2] & 0xFF) << 8) + (field13[3] & 0xFF);
						int var14 = (field13[6] & 0xFF) + ((field13[4] & 0xFF) << 16) + ((field13[5] & 0xFF) << 8);
						int var15 = field13[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field16 == var15) {
							if (var14 >= 0 && var14 <= field14.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field13[var16 + 8];
								}

								var5 = var14;
								var8++;
								continue;
							}

							return null;
						}

						return null;
					}

					return var6;
				}

				return null;
			}

			return null;
		} catch (IOException var17) {
			return null;
		}
	}

	@ObfuscatedName("BCXJTIWC.a([BIII)Z")
	public synchronized boolean method16(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method17(arg2, arg1, arg0, true);
		if (!var4) {
			var4 = method17(arg2, arg1, arg0, false);
		}

		return var4;
	}

	@ObfuscatedName("BCXJTIWC.a(IZI[BZ)Z")
	public synchronized boolean method17(int arg0, int arg1, byte[] arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method18(arg1 * 6, field15);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field15.read(field13, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field13[5] & 0xFF) + ((field13[3] & 0xFF) << 16) + ((field13[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field14.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field14.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field13[0] = (byte) (arg0 >> 16);
			field13[1] = (byte) (arg0 >> 8);
			field13[2] = (byte) arg0;
			field13[3] = (byte) (var7 >> 16);
			field13[4] = (byte) (var7 >> 8);
			field13[5] = (byte) var7;
			method18(arg1 * 6, field15);
			field15.write(field13, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg3) {
					method18(var7 * 520, field14);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field14.read(field13, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field13[0] & 0xFF) << 8) + (field13[1] & 0xFF);
						int var14 = ((field13[2] & 0xFF) << 8) + (field13[3] & 0xFF);
						var10 = (field13[6] & 0xFF) + ((field13[4] & 0xFF) << 16) + ((field13[5] & 0xFF) << 8);
						int var15 = field13[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field16 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field14.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field14.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}

					if (var7 == var10) {
						var10++;
					}
				}

				if (arg0 - var8 <= 512) {
					var10 = 0;
				}

				field13[0] = (byte) (arg1 >> 8);
				field13[1] = (byte) arg1;
				field13[2] = (byte) (var9 >> 8);
				field13[3] = (byte) var9;
				field13[4] = (byte) (var10 >> 16);
				field13[5] = (byte) (var10 >> 8);
				field13[6] = (byte) var10;
				field13[7] = (byte) field16;
				method18(var7 * 520, field14);
				field14.write(field13, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field14.write(arg2, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("BCXJTIWC.a(ILjava/io/RandomAccessFile;B)V")
	public synchronized void method18(int arg0, RandomAccessFile arg1) throws IOException {
		if (arg0 < 0 || arg0 > 62914560) {
			System.out.println("Badseek - pos:" + arg0 + " len:" + arg1.length());
			arg0 = 62914560;

			try {
				Thread.sleep(1000L);
			} catch (Exception var3) {
			}
		}

		arg1.seek(arg0);
	}
}
