package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("BDNJGDVN")
public final class BDNJGDVN {

	@ObfuscatedName("BDNJGDVN.f")
	public int field134 = 65000;

	@ObfuscatedName("BDNJGDVN.e")
	public int field133;

	@ObfuscatedName("BDNJGDVN.c")
	public RandomAccessFile field131;

	@ObfuscatedName("BDNJGDVN.d")
	public RandomAccessFile field132;

	@ObfuscatedName("BDNJGDVN.b")
	public static byte[] field130 = new byte[520];

	public BDNJGDVN(RandomAccessFile arg0, RandomAccessFile arg1, int arg2, int arg3) {
		field133 = arg2;
		field131 = arg0;
		field132 = arg1;
		field134 = arg3;
	}

	@ObfuscatedName("BDNJGDVN.a(IB)[B")
	public synchronized byte[] method31(int arg0) {
		try {
			method34(arg0 * 6, field132);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field132.read(field130, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field130[2] & 0xFF) + ((field130[0] & 0xFF) << 16) + ((field130[1] & 0xFF) << 8);
			int var5 = (field130[5] & 0xFF) + ((field130[3] & 0xFF) << 16) + ((field130[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field134) {
				if (var5 > 0 && var5 <= field131.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method34(var5 * 520, field131);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field131.read(field130, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field130[0] & 0xFF) << 8) + (field130[1] & 0xFF);
						int var13 = ((field130[2] & 0xFF) << 8) + (field130[3] & 0xFF);
						int var14 = (field130[6] & 0xFF) + ((field130[4] & 0xFF) << 16) + ((field130[5] & 0xFF) << 8);
						int var15 = field130[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field133 == var15) {
							if (var14 >= 0 && var14 <= field131.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field130[var16 + 8];
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

	@ObfuscatedName("BDNJGDVN.a(I[BBI)Z")
	public synchronized boolean method32(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method33(arg2, arg1, true, arg0);
		if (!var4) {
			var4 = method33(arg2, arg1, false, arg0);
		}

		return var4;
	}

	@ObfuscatedName("BDNJGDVN.a(ZI[BZI)Z")
	public synchronized boolean method33(int arg0, byte[] arg1, boolean arg2, int arg3) {
		try {
			int var7;
			if (arg2) {
				method34(arg0 * 6, field132);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field132.read(field130, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field130[5] & 0xFF) + ((field130[3] & 0xFF) << 16) + ((field130[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field131.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field131.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field130[0] = (byte) (arg3 >> 16);
			field130[1] = (byte) (arg3 >> 8);
			field130[2] = (byte) arg3;
			field130[3] = (byte) (var7 >> 16);
			field130[4] = (byte) (var7 >> 8);
			field130[5] = (byte) var7;
			method34(arg0 * 6, field132);
			field132.write(field130, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg2) {
					method34(var7 * 520, field131);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field131.read(field130, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field130[0] & 0xFF) << 8) + (field130[1] & 0xFF);
						int var14 = ((field130[2] & 0xFF) << 8) + (field130[3] & 0xFF);
						var10 = (field130[6] & 0xFF) + ((field130[4] & 0xFF) << 16) + ((field130[5] & 0xFF) << 8);
						int var15 = field130[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field133 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field131.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field131.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}

					if (var7 == var10) {
						var10++;
					}
				}

				if (arg3 - var8 <= 512) {
					var10 = 0;
				}

				field130[0] = (byte) (arg0 >> 8);
				field130[1] = (byte) arg0;
				field130[2] = (byte) (var9 >> 8);
				field130[3] = (byte) var9;
				field130[4] = (byte) (var10 >> 16);
				field130[5] = (byte) (var10 >> 8);
				field130[6] = (byte) var10;
				field130[7] = (byte) field133;
				method34(var7 * 520, field131);
				field131.write(field130, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field131.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("BDNJGDVN.a(IILjava/io/RandomAccessFile;)V")
	public synchronized void method34(int arg0, RandomAccessFile arg1) throws IOException {
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
