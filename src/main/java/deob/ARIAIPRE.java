package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ARIAIPRE")
public final class ARIAIPRE {

	@ObfuscatedName("ARIAIPRE.j")
	public int field14 = 65000;

	@ObfuscatedName("ARIAIPRE.i")
	public int field13;

	@ObfuscatedName("ARIAIPRE.g")
	public RandomAccessFile field11;

	@ObfuscatedName("ARIAIPRE.h")
	public RandomAccessFile field12;

	@ObfuscatedName("ARIAIPRE.f")
	public static byte[] field10 = new byte[520];

	public ARIAIPRE(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3) {
		field13 = arg0;
		field11 = arg1;
		field12 = arg2;
		field14 = arg3;
	}

	@ObfuscatedName("ARIAIPRE.a(II)[B")
	public synchronized byte[] method8(int arg0) {
		try {
			method11(arg0 * 6, field12);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field12.read(field10, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field10[2] & 0xFF) + ((field10[0] & 0xFF) << 16) + ((field10[1] & 0xFF) << 8);
			int var5 = (field10[5] & 0xFF) + ((field10[3] & 0xFF) << 16) + ((field10[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field14) {
				if (var5 > 0 && var5 <= field11.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method11(var5 * 520, field11);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field11.read(field10, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field10[0] & 0xFF) << 8) + (field10[1] & 0xFF);
						int var13 = ((field10[2] & 0xFF) << 8) + (field10[3] & 0xFF);
						int var14 = (field10[6] & 0xFF) + ((field10[4] & 0xFF) << 16) + ((field10[5] & 0xFF) << 8);
						int var15 = field10[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field13 == var15) {
							if (var14 >= 0 && var14 <= field11.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field10[var16 + 8];
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

	@ObfuscatedName("ARIAIPRE.a(B[BII)Z")
	public synchronized boolean method9(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method10(arg0, true, arg2, arg1);
		if (!var4) {
			var4 = method10(arg0, false, arg2, arg1);
		}

		return var4;
	}

	@ObfuscatedName("ARIAIPRE.a([BZIII)Z")
	public synchronized boolean method10(byte[] arg0, boolean arg1, int arg2, int arg3) {
		try {
			int var7;
			if (arg1) {
				method11(arg2 * 6, field12);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field12.read(field10, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field10[5] & 0xFF) + ((field10[3] & 0xFF) << 16) + ((field10[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field11.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field11.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field10[0] = (byte) (arg3 >> 16);
			field10[1] = (byte) (arg3 >> 8);
			field10[2] = (byte) arg3;
			field10[3] = (byte) (var7 >> 16);
			field10[4] = (byte) (var7 >> 8);
			field10[5] = (byte) var7;
			method11(arg2 * 6, field12);
			field12.write(field10, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg1) {
					method11(var7 * 520, field11);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field11.read(field10, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field10[0] & 0xFF) << 8) + (field10[1] & 0xFF);
						int var14 = ((field10[2] & 0xFF) << 8) + (field10[3] & 0xFF);
						var10 = (field10[6] & 0xFF) + ((field10[4] & 0xFF) << 16) + ((field10[5] & 0xFF) << 8);
						int var15 = field10[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || field13 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field11.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg1 = false;
					var10 = (int) ((field11.length() + 519L) / 520L);
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

				field10[0] = (byte) (arg2 >> 8);
				field10[1] = (byte) arg2;
				field10[2] = (byte) (var9 >> 8);
				field10[3] = (byte) var9;
				field10[4] = (byte) (var10 >> 16);
				field10[5] = (byte) (var10 >> 8);
				field10[6] = (byte) var10;
				field10[7] = (byte) field13;
				method11(var7 * 520, field11);
				field11.write(field10, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field11.write(arg0, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("ARIAIPRE.a(ILjava/io/RandomAccessFile;I)V")
	public synchronized void method11(int arg0, RandomAccessFile arg1) throws IOException {
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
