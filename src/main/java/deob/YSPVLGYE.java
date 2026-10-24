package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("YSPVLGYE")
public final class YSPVLGYE {

	@ObfuscatedName("YSPVLGYE.f")
	public int field1372 = 65000;

	@ObfuscatedName("YSPVLGYE.e")
	public int field1371;

	@ObfuscatedName("YSPVLGYE.c")
	public RandomAccessFile field1369;

	@ObfuscatedName("YSPVLGYE.d")
	public RandomAccessFile field1370;

	@ObfuscatedName("YSPVLGYE.b")
	public static byte[] field1368 = new byte[520];

	public YSPVLGYE(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3) {
		field1371 = arg3;
		field1369 = arg0;
		field1370 = arg2;
		field1372 = arg1;
	}

	@ObfuscatedName("YSPVLGYE.a(II)[B")
	public synchronized byte[] method500(int arg0) {
		try {
			method503(arg0 * 6, field1370);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1370.read(field1368, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1368[2] & 0xFF) + ((field1368[0] & 0xFF) << 16) + ((field1368[1] & 0xFF) << 8);
			int var5 = (field1368[5] & 0xFF) + ((field1368[3] & 0xFF) << 16) + ((field1368[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1372) {
				if (var5 > 0 && var5 <= field1369.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method503(var5 * 520, field1369);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1369.read(field1368, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1368[0] & 0xFF) << 8) + (field1368[1] & 0xFF);
						int var13 = ((field1368[2] & 0xFF) << 8) + (field1368[3] & 0xFF);
						int var14 = (field1368[6] & 0xFF) + ((field1368[4] & 0xFF) << 16) + ((field1368[5] & 0xFF) << 8);
						int var15 = field1368[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1371 == var15) {
							if (var14 >= 0 && var14 <= field1369.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1368[var16 + 8];
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

	@ObfuscatedName("YSPVLGYE.a([BIII)Z")
	public synchronized boolean method501(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method502(true, arg1, arg2, arg0);
		if (!var4) {
			var4 = method502(false, arg1, arg2, arg0);
		}

		return var4;
	}

	@ObfuscatedName("YSPVLGYE.a(IZII[B)Z")
	public synchronized boolean method502(boolean arg0, int arg1, int arg2, byte[] arg3) {
		try {
			int var7;
			if (arg0) {
				method503(arg2 * 6, field1370);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1370.read(field1368, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1368[5] & 0xFF) + ((field1368[3] & 0xFF) << 16) + ((field1368[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1369.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1369.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1368[0] = (byte) (arg1 >> 16);
			field1368[1] = (byte) (arg1 >> 8);
			field1368[2] = (byte) arg1;
			field1368[3] = (byte) (var7 >> 16);
			field1368[4] = (byte) (var7 >> 8);
			field1368[5] = (byte) var7;
			method503(arg2 * 6, field1370);
			field1370.write(field1368, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg1) {
				int var10 = 0;
				if (arg0) {
					method503(var7 * 520, field1369);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1369.read(field1368, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1368[0] & 0xFF) << 8) + (field1368[1] & 0xFF);
						int var14 = ((field1368[2] & 0xFF) << 8) + (field1368[3] & 0xFF);
						var10 = (field1368[6] & 0xFF) + ((field1368[4] & 0xFF) << 16) + ((field1368[5] & 0xFF) << 8);
						int var15 = field1368[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || field1371 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1369.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((field1369.length() + 519L) / 520L);
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

				field1368[0] = (byte) (arg2 >> 8);
				field1368[1] = (byte) arg2;
				field1368[2] = (byte) (var9 >> 8);
				field1368[3] = (byte) var9;
				field1368[4] = (byte) (var10 >> 16);
				field1368[5] = (byte) (var10 >> 8);
				field1368[6] = (byte) var10;
				field1368[7] = (byte) field1371;
				method503(var7 * 520, field1369);
				field1369.write(field1368, 0, 8);
				int var16 = arg1 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1369.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("YSPVLGYE.a(ILjava/io/RandomAccessFile;Z)V")
	public synchronized void method503(int arg0, RandomAccessFile arg1) throws IOException {
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
