package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("XFNDANMT")
public final class XFNDANMT {

	@ObfuscatedName("XFNDANMT.h")
	public int field1467 = 65000;

	@ObfuscatedName("XFNDANMT.g")
	public int field1466;

	@ObfuscatedName("XFNDANMT.e")
	public RandomAccessFile field1464;

	@ObfuscatedName("XFNDANMT.f")
	public RandomAccessFile field1465;

	@ObfuscatedName("XFNDANMT.c")
	public static byte[] field1463 = new byte[520];

	public XFNDANMT(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3) {
		field1466 = arg3;
		field1464 = arg2;
		field1465 = arg0;
		field1467 = arg1;
	}

	@ObfuscatedName("XFNDANMT.a(II)[B")
	public synchronized byte[] method582(int arg0) {
		try {
			method585(field1465, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1465.read(field1463, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1463[2] & 0xFF) + ((field1463[0] & 0xFF) << 16) + ((field1463[1] & 0xFF) << 8);
			int var5 = (field1463[5] & 0xFF) + ((field1463[3] & 0xFF) << 16) + ((field1463[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1467) {
				if (var5 > 0 && var5 <= field1464.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method585(field1464, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1464.read(field1463, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1463[0] & 0xFF) << 8) + (field1463[1] & 0xFF);
						int var13 = ((field1463[2] & 0xFF) << 8) + (field1463[3] & 0xFF);
						int var14 = (field1463[6] & 0xFF) + ((field1463[4] & 0xFF) << 16) + ((field1463[5] & 0xFF) << 8);
						int var15 = field1463[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1466 == var15) {
							if (var14 >= 0 && var14 <= field1464.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1463[var16 + 8];
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

	@ObfuscatedName("XFNDANMT.a(III[B)Z")
	public synchronized boolean method583(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method584(true, arg0, arg1, arg2);
		if (!var4) {
			var4 = method584(false, arg0, arg1, arg2);
		}

		return var4;
	}

	@ObfuscatedName("XFNDANMT.a(ZIII[B)Z")
	public synchronized boolean method584(boolean arg0, int arg1, int arg2, byte[] arg3) {
		try {
			int var7;
			if (arg0) {
				method585(field1465, arg1 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1465.read(field1463, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1463[5] & 0xFF) + ((field1463[3] & 0xFF) << 16) + ((field1463[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1464.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1464.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1463[0] = (byte) (arg2 >> 16);
			field1463[1] = (byte) (arg2 >> 8);
			field1463[2] = (byte) arg2;
			field1463[3] = (byte) (var7 >> 16);
			field1463[4] = (byte) (var7 >> 8);
			field1463[5] = (byte) var7;
			method585(field1465, arg1 * 6);
			field1465.write(field1463, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg0) {
					method585(field1464, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1464.read(field1463, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1463[0] & 0xFF) << 8) + (field1463[1] & 0xFF);
						int var14 = ((field1463[2] & 0xFF) << 8) + (field1463[3] & 0xFF);
						var10 = (field1463[6] & 0xFF) + ((field1463[4] & 0xFF) << 16) + ((field1463[5] & 0xFF) << 8);
						int var15 = field1463[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field1466 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1464.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((field1464.length() + 519L) / 520L);
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

				field1463[0] = (byte) (arg1 >> 8);
				field1463[1] = (byte) arg1;
				field1463[2] = (byte) (var9 >> 8);
				field1463[3] = (byte) var9;
				field1463[4] = (byte) (var10 >> 16);
				field1463[5] = (byte) (var10 >> 8);
				field1463[6] = (byte) var10;
				field1463[7] = (byte) field1466;
				method585(field1464, var7 * 520);
				field1464.write(field1463, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1464.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("XFNDANMT.a(BLjava/io/RandomAccessFile;I)V")
	public synchronized void method585(RandomAccessFile arg0, int arg1) throws IOException {
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
