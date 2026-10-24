package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("GYSQYVEV")
public final class GYSQYVEV {

	@ObfuscatedName("GYSQYVEV.h")
	public int field622 = 65000;

	@ObfuscatedName("GYSQYVEV.g")
	public int field621;

	@ObfuscatedName("GYSQYVEV.e")
	public RandomAccessFile field619;

	@ObfuscatedName("GYSQYVEV.f")
	public RandomAccessFile field620;

	@ObfuscatedName("GYSQYVEV.d")
	public static byte[] field618 = new byte[520];

	public GYSQYVEV(int arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3) {
		field621 = arg0;
		field619 = arg3;
		field620 = arg2;
		field622 = arg1;
	}

	@ObfuscatedName("GYSQYVEV.a(II)[B")
	public synchronized byte[] method259(int arg0) {
		try {
			method262(arg0 * 6, field620);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field620.read(field618, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field618[2] & 0xFF) + ((field618[0] & 0xFF) << 16) + ((field618[1] & 0xFF) << 8);
			int var5 = (field618[5] & 0xFF) + ((field618[3] & 0xFF) << 16) + ((field618[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field622) {
				if (var5 > 0 && var5 <= field619.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method262(var5 * 520, field619);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field619.read(field618, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field618[0] & 0xFF) << 8) + (field618[1] & 0xFF);
						int var13 = ((field618[2] & 0xFF) << 8) + (field618[3] & 0xFF);
						int var14 = (field618[6] & 0xFF) + ((field618[4] & 0xFF) << 16) + ((field618[5] & 0xFF) << 8);
						int var15 = field618[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field621 == var15) {
							if (var14 >= 0 && var14 <= field619.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field618[var16 + 8];
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

	@ObfuscatedName("GYSQYVEV.a(I[BII)Z")
	public synchronized boolean method260(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method261(arg2, arg1, true, arg0);
		if (!var4) {
			var4 = method261(arg2, arg1, false, arg0);
		}

		return var4;
	}

	@ObfuscatedName("GYSQYVEV.a(I[BZII)Z")
	public synchronized boolean method261(int arg0, byte[] arg1, boolean arg2, int arg3) {
		try {
			int var7;
			if (arg2) {
				method262(arg0 * 6, field620);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field620.read(field618, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field618[5] & 0xFF) + ((field618[3] & 0xFF) << 16) + ((field618[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field619.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field619.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field618[0] = (byte) (arg3 >> 16);
			field618[1] = (byte) (arg3 >> 8);
			field618[2] = (byte) arg3;
			field618[3] = (byte) (var7 >> 16);
			field618[4] = (byte) (var7 >> 8);
			field618[5] = (byte) var7;
			method262(arg0 * 6, field620);
			field620.write(field618, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg2) {
					method262(var7 * 520, field619);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field619.read(field618, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field618[0] & 0xFF) << 8) + (field618[1] & 0xFF);
						int var14 = ((field618[2] & 0xFF) << 8) + (field618[3] & 0xFF);
						var10 = (field618[6] & 0xFF) + ((field618[4] & 0xFF) << 16) + ((field618[5] & 0xFF) << 8);
						int var15 = field618[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field621 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field619.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field619.length() + 519L) / 520L);
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

				field618[0] = (byte) (arg0 >> 8);
				field618[1] = (byte) arg0;
				field618[2] = (byte) (var9 >> 8);
				field618[3] = (byte) var9;
				field618[4] = (byte) (var10 >> 16);
				field618[5] = (byte) (var10 >> 8);
				field618[6] = (byte) var10;
				field618[7] = (byte) field621;
				method262(var7 * 520, field619);
				field619.write(field618, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field619.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("GYSQYVEV.a(IILjava/io/RandomAccessFile;)V")
	public synchronized void method262(int arg0, RandomAccessFile arg1) throws IOException {
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
