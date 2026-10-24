package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("MACXPWDL")
public final class MACXPWDL {

	@ObfuscatedName("MACXPWDL.e")
	public int field961 = 65000;

	@ObfuscatedName("MACXPWDL.d")
	public int field960;

	@ObfuscatedName("MACXPWDL.b")
	public RandomAccessFile field958;

	@ObfuscatedName("MACXPWDL.c")
	public RandomAccessFile field959;

	@ObfuscatedName("MACXPWDL.a")
	public static byte[] field957 = new byte[520];

	public MACXPWDL(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3) {
		field960 = arg3;
		field958 = arg0;
		field959 = arg2;
		field961 = arg1;
	}

	@ObfuscatedName("MACXPWDL.a(IB)[B")
	public synchronized byte[] method420(int arg0) {
		try {
			method423(arg0 * 6, field959);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field959.read(field957, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field957[2] & 0xFF) + ((field957[0] & 0xFF) << 16) + ((field957[1] & 0xFF) << 8);
			int var5 = (field957[5] & 0xFF) + ((field957[3] & 0xFF) << 16) + ((field957[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field961) {
				if (var5 > 0 && var5 <= field958.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method423(var5 * 520, field958);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field958.read(field957, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field957[0] & 0xFF) << 8) + (field957[1] & 0xFF);
						int var13 = ((field957[2] & 0xFF) << 8) + (field957[3] & 0xFF);
						int var14 = (field957[6] & 0xFF) + ((field957[4] & 0xFF) << 16) + ((field957[5] & 0xFF) << 8);
						int var15 = field957[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field960 == var15) {
							if (var14 >= 0 && var14 <= field958.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field957[var16 + 8];
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

	@ObfuscatedName("MACXPWDL.a([BIZI)Z")
	public synchronized boolean method421(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method422(true, arg1, arg0, arg2);
		if (!var4) {
			var4 = method422(false, arg1, arg0, arg2);
		}

		return var4;
	}

	@ObfuscatedName("MACXPWDL.a(ZII[BI)Z")
	public synchronized boolean method422(boolean arg0, int arg1, byte[] arg2, int arg3) {
		try {
			int var7;
			if (arg0) {
				method423(arg1 * 6, field959);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field959.read(field957, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field957[5] & 0xFF) + ((field957[3] & 0xFF) << 16) + ((field957[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field958.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field958.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field957[0] = (byte) (arg3 >> 16);
			field957[1] = (byte) (arg3 >> 8);
			field957[2] = (byte) arg3;
			field957[3] = (byte) (var7 >> 16);
			field957[4] = (byte) (var7 >> 8);
			field957[5] = (byte) var7;
			method423(arg1 * 6, field959);
			field959.write(field957, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg0) {
					method423(var7 * 520, field958);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field958.read(field957, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field957[0] & 0xFF) << 8) + (field957[1] & 0xFF);
						int var14 = ((field957[2] & 0xFF) << 8) + (field957[3] & 0xFF);
						var10 = (field957[6] & 0xFF) + ((field957[4] & 0xFF) << 16) + ((field957[5] & 0xFF) << 8);
						int var15 = field957[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field960 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field958.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((field958.length() + 519L) / 520L);
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

				field957[0] = (byte) (arg1 >> 8);
				field957[1] = (byte) arg1;
				field957[2] = (byte) (var9 >> 8);
				field957[3] = (byte) var9;
				field957[4] = (byte) (var10 >> 16);
				field957[5] = (byte) (var10 >> 8);
				field957[6] = (byte) var10;
				field957[7] = (byte) field960;
				method423(var7 * 520, field958);
				field958.write(field957, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field958.write(arg2, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("MACXPWDL.a(ZILjava/io/RandomAccessFile;)V")
	public synchronized void method423(int arg0, RandomAccessFile arg1) throws IOException {
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
