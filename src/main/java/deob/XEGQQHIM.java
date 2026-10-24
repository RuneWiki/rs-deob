package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("XEGQQHIM")
public final class XEGQQHIM {

	@ObfuscatedName("XEGQQHIM.h")
	public int field1399 = 65000;

	@ObfuscatedName("XEGQQHIM.g")
	public int field1398;

	@ObfuscatedName("XEGQQHIM.e")
	public RandomAccessFile field1396;

	@ObfuscatedName("XEGQQHIM.f")
	public RandomAccessFile field1397;

	@ObfuscatedName("XEGQQHIM.c")
	public static byte[] field1395 = new byte[520];

	public XEGQQHIM(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3) {
		field1398 = arg0;
		field1396 = arg3;
		field1397 = arg1;
		field1399 = arg2;
	}

	@ObfuscatedName("XEGQQHIM.a(II)[B")
	public synchronized byte[] method549(int arg0) {
		try {
			method552(field1397, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1397.read(field1395, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1395[2] & 0xFF) + ((field1395[0] & 0xFF) << 16) + ((field1395[1] & 0xFF) << 8);
			int var5 = (field1395[5] & 0xFF) + ((field1395[3] & 0xFF) << 16) + ((field1395[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1399) {
				if (var5 > 0 && var5 <= field1396.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method552(field1396, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1396.read(field1395, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1395[0] & 0xFF) << 8) + (field1395[1] & 0xFF);
						int var13 = ((field1395[2] & 0xFF) << 8) + (field1395[3] & 0xFF);
						int var14 = (field1395[6] & 0xFF) + ((field1395[4] & 0xFF) << 16) + ((field1395[5] & 0xFF) << 8);
						int var15 = field1395[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1398 == var15) {
							if (var14 >= 0 && var14 <= field1396.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1395[var16 + 8];
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

	@ObfuscatedName("XEGQQHIM.a(I[BBI)Z")
	public synchronized boolean method550(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method551(arg0, arg1, arg2, true);
		if (!var4) {
			var4 = method551(arg0, arg1, arg2, false);
		}

		return var4;
	}

	@ObfuscatedName("XEGQQHIM.a(I[BIBZ)Z")
	public synchronized boolean method551(int arg0, byte[] arg1, int arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method552(field1397, arg0 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1397.read(field1395, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1395[5] & 0xFF) + ((field1395[3] & 0xFF) << 16) + ((field1395[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1396.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1396.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1395[0] = (byte) (arg2 >> 16);
			field1395[1] = (byte) (arg2 >> 8);
			field1395[2] = (byte) arg2;
			field1395[3] = (byte) (var7 >> 16);
			field1395[4] = (byte) (var7 >> 8);
			field1395[5] = (byte) var7;
			method552(field1397, arg0 * 6);
			field1397.write(field1395, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg3) {
					method552(field1396, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1396.read(field1395, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1395[0] & 0xFF) << 8) + (field1395[1] & 0xFF);
						int var14 = ((field1395[2] & 0xFF) << 8) + (field1395[3] & 0xFF);
						var10 = (field1395[6] & 0xFF) + ((field1395[4] & 0xFF) << 16) + ((field1395[5] & 0xFF) << 8);
						int var15 = field1395[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field1398 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1396.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field1396.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}

					if (var7 == var10) {
						var10++;
					}
				}

				if (arg2 - var8 <= 512) {
					var10 = 0;
				}

				field1395[0] = (byte) (arg0 >> 8);
				field1395[1] = (byte) arg0;
				field1395[2] = (byte) (var9 >> 8);
				field1395[3] = (byte) var9;
				field1395[4] = (byte) (var10 >> 16);
				field1395[5] = (byte) (var10 >> 8);
				field1395[6] = (byte) var10;
				field1395[7] = (byte) field1398;
				method552(field1396, var7 * 520);
				field1396.write(field1395, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1396.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("XEGQQHIM.a(Ljava/io/RandomAccessFile;IB)V")
	public synchronized void method552(RandomAccessFile arg0, int arg1) throws IOException {
		if (arg1 < 0 || arg1 > 62914560) {
			System.out.println("Badseek - pos:" + arg1 + " len:" + arg0.length());
			arg1 = 62914560;

			try {
				Thread.sleep(1000L);
			} catch (Exception var3) {
			}
		}

		arg0.seek(arg1);
	}
}
