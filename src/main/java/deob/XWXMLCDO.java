package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("XWXMLCDO")
public final class XWXMLCDO {

	@ObfuscatedName("XWXMLCDO.g")
	public int field1288 = 65000;

	@ObfuscatedName("XWXMLCDO.f")
	public int field1287;

	@ObfuscatedName("XWXMLCDO.d")
	public RandomAccessFile field1285;

	@ObfuscatedName("XWXMLCDO.e")
	public RandomAccessFile field1286;

	@ObfuscatedName("XWXMLCDO.c")
	public static byte[] field1284 = new byte[520];

	public XWXMLCDO(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3) {
		field1287 = arg1;
		field1285 = arg3;
		field1286 = arg0;
		field1288 = arg2;
	}

	@ObfuscatedName("XWXMLCDO.a(II)[B")
	public synchronized byte[] method520(int arg0) {
		try {
			method523(field1286, arg0 * 6);
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

						method523(field1285, var5 * 520);
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

	@ObfuscatedName("XWXMLCDO.a(II[BI)Z")
	public synchronized boolean method521(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method522(arg2, arg1, true, arg0);
		if (!var4) {
			var4 = method522(arg2, arg1, false, arg0);
		}

		return var4;
	}

	@ObfuscatedName("XWXMLCDO.a(I[BZII)Z")
	public synchronized boolean method522(int arg0, byte[] arg1, boolean arg2, int arg3) {
		try {
			int var7;
			if (arg2) {
				method523(field1286, arg3 * 6);
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

			field1284[0] = (byte) (arg0 >> 16);
			field1284[1] = (byte) (arg0 >> 8);
			field1284[2] = (byte) arg0;
			field1284[3] = (byte) (var7 >> 16);
			field1284[4] = (byte) (var7 >> 8);
			field1284[5] = (byte) var7;
			method523(field1286, arg3 * 6);
			field1286.write(field1284, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg2) {
					method523(field1285, var7 * 520);
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
						if (arg3 != var13 || var9 != var14 || field1287 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1285.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field1285.length() + 519L) / 520L);
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

				field1284[0] = (byte) (arg3 >> 8);
				field1284[1] = (byte) arg3;
				field1284[2] = (byte) (var9 >> 8);
				field1284[3] = (byte) var9;
				field1284[4] = (byte) (var10 >> 16);
				field1284[5] = (byte) (var10 >> 8);
				field1284[6] = (byte) var10;
				field1284[7] = (byte) field1287;
				method523(field1285, var7 * 520);
				field1285.write(field1284, 0, 8);
				int var16 = arg0 - var8;
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

	@ObfuscatedName("XWXMLCDO.a(Ljava/io/RandomAccessFile;IZ)V")
	public synchronized void method523(RandomAccessFile arg0, int arg1) throws IOException {
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
