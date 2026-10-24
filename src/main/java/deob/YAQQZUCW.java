package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("YAQQZUCW")
public final class YAQQZUCW {

	@ObfuscatedName("YAQQZUCW.g")
	public int field1410 = 65000;

	@ObfuscatedName("YAQQZUCW.f")
	public int field1409;

	@ObfuscatedName("YAQQZUCW.d")
	public RandomAccessFile field1407;

	@ObfuscatedName("YAQQZUCW.e")
	public RandomAccessFile field1408;

	@ObfuscatedName("YAQQZUCW.c")
	public static byte[] field1406 = new byte[520];

	public YAQQZUCW(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3) {
		field1409 = arg2;
		field1407 = arg3;
		field1408 = arg0;
		field1410 = arg1;
	}

	@ObfuscatedName("YAQQZUCW.a(BI)[B")
	public synchronized byte[] method559(int arg0) {
		try {
			method562(arg0 * 6, field1408);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1408.read(field1406, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1406[2] & 0xFF) + ((field1406[0] & 0xFF) << 16) + ((field1406[1] & 0xFF) << 8);
			int var5 = (field1406[5] & 0xFF) + ((field1406[3] & 0xFF) << 16) + ((field1406[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1410) {
				if (var5 > 0 && var5 <= field1407.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method562(var5 * 520, field1407);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1407.read(field1406, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1406[0] & 0xFF) << 8) + (field1406[1] & 0xFF);
						int var13 = ((field1406[2] & 0xFF) << 8) + (field1406[3] & 0xFF);
						int var14 = (field1406[6] & 0xFF) + ((field1406[4] & 0xFF) << 16) + ((field1406[5] & 0xFF) << 8);
						int var15 = field1406[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1409 == var15) {
							if (var14 >= 0 && var14 <= field1407.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1406[var16 + 8];
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

	@ObfuscatedName("YAQQZUCW.a(I[BII)Z")
	public synchronized boolean method560(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method561(arg1, arg0, arg2, true);
		if (!var4) {
			var4 = method561(arg1, arg0, arg2, false);
		}

		return var4;
	}

	@ObfuscatedName("YAQQZUCW.a(I[BIIZ)Z")
	public synchronized boolean method561(byte[] arg0, int arg1, int arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method562(arg2 * 6, field1408);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1408.read(field1406, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1406[5] & 0xFF) + ((field1406[3] & 0xFF) << 16) + ((field1406[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1407.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1407.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1406[0] = (byte) (arg1 >> 16);
			field1406[1] = (byte) (arg1 >> 8);
			field1406[2] = (byte) arg1;
			field1406[3] = (byte) (var7 >> 16);
			field1406[4] = (byte) (var7 >> 8);
			field1406[5] = (byte) var7;
			method562(arg2 * 6, field1408);
			field1408.write(field1406, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg1) {
				int var10 = 0;
				if (arg3) {
					method562(var7 * 520, field1407);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1407.read(field1406, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1406[0] & 0xFF) << 8) + (field1406[1] & 0xFF);
						int var14 = ((field1406[2] & 0xFF) << 8) + (field1406[3] & 0xFF);
						var10 = (field1406[6] & 0xFF) + ((field1406[4] & 0xFF) << 16) + ((field1406[5] & 0xFF) << 8);
						int var15 = field1406[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || field1409 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1407.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field1407.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}

					if (var7 == var10) {
						var10++;
					}
				}

				if (arg1 - var8 <= 512) {
					var10 = 0;
				}

				field1406[0] = (byte) (arg2 >> 8);
				field1406[1] = (byte) arg2;
				field1406[2] = (byte) (var9 >> 8);
				field1406[3] = (byte) var9;
				field1406[4] = (byte) (var10 >> 16);
				field1406[5] = (byte) (var10 >> 8);
				field1406[6] = (byte) var10;
				field1406[7] = (byte) field1409;
				method562(var7 * 520, field1407);
				field1407.write(field1406, 0, 8);
				int var16 = arg1 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1407.write(arg0, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("YAQQZUCW.a(IILjava/io/RandomAccessFile;)V")
	public synchronized void method562(int arg0, RandomAccessFile arg1) throws IOException {
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
