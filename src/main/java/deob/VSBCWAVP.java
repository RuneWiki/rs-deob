package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("VSBCWAVP")
public final class VSBCWAVP {

	@ObfuscatedName("VSBCWAVP.g")
	public int field1258 = 65000;

	@ObfuscatedName("VSBCWAVP.f")
	public int field1257;

	@ObfuscatedName("VSBCWAVP.d")
	public RandomAccessFile field1255;

	@ObfuscatedName("VSBCWAVP.e")
	public RandomAccessFile field1256;

	@ObfuscatedName("VSBCWAVP.c")
	public static byte[] field1254 = new byte[520];

	public VSBCWAVP(int arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3) {
		field1257 = arg0;
		field1255 = arg2;
		field1256 = arg3;
		field1258 = arg1;
	}

	@ObfuscatedName("VSBCWAVP.a(BI)[B")
	public synchronized byte[] method533(int arg0) {
		try {
			method536(arg0 * 6, field1256);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1256.read(field1254, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1254[2] & 0xFF) + ((field1254[0] & 0xFF) << 16) + ((field1254[1] & 0xFF) << 8);
			int var5 = (field1254[5] & 0xFF) + ((field1254[3] & 0xFF) << 16) + ((field1254[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1258) {
				if (var5 > 0 && var5 <= field1255.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method536(var5 * 520, field1255);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1255.read(field1254, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1254[0] & 0xFF) << 8) + (field1254[1] & 0xFF);
						int var13 = ((field1254[2] & 0xFF) << 8) + (field1254[3] & 0xFF);
						int var14 = (field1254[6] & 0xFF) + ((field1254[4] & 0xFF) << 16) + ((field1254[5] & 0xFF) << 8);
						int var15 = field1254[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1257 == var15) {
							if (var14 >= 0 && var14 <= field1255.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1254[var16 + 8];
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

	@ObfuscatedName("VSBCWAVP.a(IB[BI)Z")
	public synchronized boolean method534(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method535(arg1, arg2, arg0, true);
		if (!var4) {
			var4 = method535(arg1, arg2, arg0, false);
		}

		return var4;
	}

	@ObfuscatedName("VSBCWAVP.a([BIIZZ)Z")
	public synchronized boolean method535(byte[] arg0, int arg1, int arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method536(arg1 * 6, field1256);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1256.read(field1254, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1254[5] & 0xFF) + ((field1254[3] & 0xFF) << 16) + ((field1254[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1255.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1255.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1254[0] = (byte) (arg2 >> 16);
			field1254[1] = (byte) (arg2 >> 8);
			field1254[2] = (byte) arg2;
			field1254[3] = (byte) (var7 >> 16);
			field1254[4] = (byte) (var7 >> 8);
			field1254[5] = (byte) var7;
			method536(arg1 * 6, field1256);
			field1256.write(field1254, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg3) {
					method536(var7 * 520, field1255);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1255.read(field1254, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1254[0] & 0xFF) << 8) + (field1254[1] & 0xFF);
						int var14 = ((field1254[2] & 0xFF) << 8) + (field1254[3] & 0xFF);
						var10 = (field1254[6] & 0xFF) + ((field1254[4] & 0xFF) << 16) + ((field1254[5] & 0xFF) << 8);
						int var15 = field1254[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field1257 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1255.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field1255.length() + 519L) / 520L);
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

				field1254[0] = (byte) (arg1 >> 8);
				field1254[1] = (byte) arg1;
				field1254[2] = (byte) (var9 >> 8);
				field1254[3] = (byte) var9;
				field1254[4] = (byte) (var10 >> 16);
				field1254[5] = (byte) (var10 >> 8);
				field1254[6] = (byte) var10;
				field1254[7] = (byte) field1257;
				method536(var7 * 520, field1255);
				field1255.write(field1254, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1255.write(arg0, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("VSBCWAVP.a(IZLjava/io/RandomAccessFile;)V")
	public synchronized void method536(int arg0, RandomAccessFile arg1) throws IOException {
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
