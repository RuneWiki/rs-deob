package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("TPHBVXKD")
public final class TPHBVXKD {

	@ObfuscatedName("TPHBVXKD.e")
	public int field1288 = 65000;

	@ObfuscatedName("TPHBVXKD.d")
	public int field1287;

	@ObfuscatedName("TPHBVXKD.b")
	public RandomAccessFile field1285;

	@ObfuscatedName("TPHBVXKD.c")
	public RandomAccessFile field1286;

	@ObfuscatedName("TPHBVXKD.a")
	public static byte[] field1284 = new byte[520];

	public TPHBVXKD(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3) {
		field1287 = arg2;
		field1285 = arg3;
		field1286 = arg0;
		field1288 = arg1;
	}

	@ObfuscatedName("TPHBVXKD.a(II)[B")
	public synchronized byte[] method514(int arg0) {
		try {
			method517(field1286, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1286.read(field1284, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1284[2] & 0xFF) + ((field1284[0] & 0xFF) << 16) + ((field1284[1] & 0xFF) << 8);
			int var5 = (field1284[5] & 0xFF) + ((field1284[3] & 0xFF) << 16) + ((field1284[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1288) {
				if (var5 > 0 && var5 <= field1285.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method517(field1285, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1285.read(field1284, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1284[0] & 0xFF) << 8) + (field1284[1] & 0xFF);
						int var13 = ((field1284[2] & 0xFF) << 8) + (field1284[3] & 0xFF);
						int var14 = (field1284[6] & 0xFF) + ((field1284[4] & 0xFF) << 16) + ((field1284[5] & 0xFF) << 8);
						int var15 = field1284[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1287 == var15) {
							if (var14 >= 0 && var14 <= field1285.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1284[var16 + 8];
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

	@ObfuscatedName("TPHBVXKD.a(I[BIB)Z")
	public synchronized boolean method515(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method516(arg0, arg1, arg2, true);
		if (!var4) {
			var4 = method516(arg0, arg1, arg2, false);
		}

		return var4;
	}

	@ObfuscatedName("TPHBVXKD.a(II[BIZ)Z")
	public synchronized boolean method516(int arg0, byte[] arg1, int arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method517(field1286, arg0 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1286.read(field1284, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1284[5] & 0xFF) + ((field1284[3] & 0xFF) << 16) + ((field1284[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1285.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1285.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1284[0] = (byte) (arg2 >> 16);
			field1284[1] = (byte) (arg2 >> 8);
			field1284[2] = (byte) arg2;
			field1284[3] = (byte) (var7 >> 16);
			field1284[4] = (byte) (var7 >> 8);
			field1284[5] = (byte) var7;
			method517(field1286, arg0 * 6);
			field1286.write(field1284, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg3) {
					method517(field1285, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1285.read(field1284, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1284[0] & 0xFF) << 8) + (field1284[1] & 0xFF);
						int var14 = ((field1284[2] & 0xFF) << 8) + (field1284[3] & 0xFF);
						var10 = (field1284[6] & 0xFF) + ((field1284[4] & 0xFF) << 16) + ((field1284[5] & 0xFF) << 8);
						int var15 = field1284[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field1287 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1285.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field1285.length() + 519L) / 520L);
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

				field1284[0] = (byte) (arg0 >> 8);
				field1284[1] = (byte) arg0;
				field1284[2] = (byte) (var9 >> 8);
				field1284[3] = (byte) var9;
				field1284[4] = (byte) (var10 >> 16);
				field1284[5] = (byte) (var10 >> 8);
				field1284[6] = (byte) var10;
				field1284[7] = (byte) field1287;
				method517(field1285, var7 * 520);
				field1285.write(field1284, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1285.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("TPHBVXKD.a(ZLjava/io/RandomAccessFile;I)V")
	public synchronized void method517(RandomAccessFile arg0, int arg1) throws IOException {
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
