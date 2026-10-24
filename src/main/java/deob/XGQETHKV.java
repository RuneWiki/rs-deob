package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("XGQETHKV")
public final class XGQETHKV {

	@ObfuscatedName("XGQETHKV.h")
	public int field1414 = 65000;

	@ObfuscatedName("XGQETHKV.g")
	public int field1413;

	@ObfuscatedName("XGQETHKV.e")
	public RandomAccessFile field1411;

	@ObfuscatedName("XGQETHKV.f")
	public RandomAccessFile field1412;

	@ObfuscatedName("XGQETHKV.c")
	public static byte[] field1410 = new byte[520];

	public XGQETHKV(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3) {
		field1413 = arg1;
		field1411 = arg2;
		field1412 = arg0;
		field1414 = arg3;
	}

	@ObfuscatedName("XGQETHKV.a(ZI)[B")
	public synchronized byte[] method550(int arg0) {
		try {
			method553(field1412, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1412.read(field1410, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1410[2] & 0xFF) + ((field1410[0] & 0xFF) << 16) + ((field1410[1] & 0xFF) << 8);
			int var5 = (field1410[5] & 0xFF) + ((field1410[3] & 0xFF) << 16) + ((field1410[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1414) {
				if (var5 > 0 && var5 <= field1411.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method553(field1411, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1411.read(field1410, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1410[0] & 0xFF) << 8) + (field1410[1] & 0xFF);
						int var13 = ((field1410[2] & 0xFF) << 8) + (field1410[3] & 0xFF);
						int var14 = (field1410[6] & 0xFF) + ((field1410[4] & 0xFF) << 16) + ((field1410[5] & 0xFF) << 8);
						int var15 = field1410[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1413 == var15) {
							if (var14 >= 0 && var14 <= field1411.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1410[var16 + 8];
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

	@ObfuscatedName("XGQETHKV.a(IZ[BI)Z")
	public synchronized boolean method551(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method552(true, arg0, arg1, arg2);
		if (!var4) {
			var4 = method552(false, arg0, arg1, arg2);
		}

		return var4;
	}

	@ObfuscatedName("XGQETHKV.a(ZI[BII)Z")
	public synchronized boolean method552(boolean arg0, int arg1, byte[] arg2, int arg3) {
		try {
			int var7;
			if (arg0) {
				method553(field1412, arg3 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1412.read(field1410, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1410[5] & 0xFF) + ((field1410[3] & 0xFF) << 16) + ((field1410[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1411.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1411.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1410[0] = (byte) (arg1 >> 16);
			field1410[1] = (byte) (arg1 >> 8);
			field1410[2] = (byte) arg1;
			field1410[3] = (byte) (var7 >> 16);
			field1410[4] = (byte) (var7 >> 8);
			field1410[5] = (byte) var7;
			method553(field1412, arg3 * 6);
			field1412.write(field1410, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg1) {
				int var10 = 0;
				if (arg0) {
					method553(field1411, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1411.read(field1410, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1410[0] & 0xFF) << 8) + (field1410[1] & 0xFF);
						int var14 = ((field1410[2] & 0xFF) << 8) + (field1410[3] & 0xFF);
						var10 = (field1410[6] & 0xFF) + ((field1410[4] & 0xFF) << 16) + ((field1410[5] & 0xFF) << 8);
						int var15 = field1410[7] & 0xFF;
						if (arg3 != var13 || var9 != var14 || field1413 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1411.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((field1411.length() + 519L) / 520L);
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

				field1410[0] = (byte) (arg3 >> 8);
				field1410[1] = (byte) arg3;
				field1410[2] = (byte) (var9 >> 8);
				field1410[3] = (byte) var9;
				field1410[4] = (byte) (var10 >> 16);
				field1410[5] = (byte) (var10 >> 8);
				field1410[6] = (byte) var10;
				field1410[7] = (byte) field1413;
				method553(field1411, var7 * 520);
				field1411.write(field1410, 0, 8);
				int var16 = arg1 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1411.write(arg2, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("XGQETHKV.a(BLjava/io/RandomAccessFile;I)V")
	public synchronized void method553(RandomAccessFile arg0, int arg1) throws IOException {
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
