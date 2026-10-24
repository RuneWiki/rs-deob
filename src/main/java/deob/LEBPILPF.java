package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("LEBPILPF")
public final class LEBPILPF {

	@ObfuscatedName("LEBPILPF.i")
	public int field838 = 65000;

	@ObfuscatedName("LEBPILPF.h")
	public int field837;

	@ObfuscatedName("LEBPILPF.f")
	public RandomAccessFile field835;

	@ObfuscatedName("LEBPILPF.g")
	public RandomAccessFile field836;

	@ObfuscatedName("LEBPILPF.e")
	public static byte[] field834 = new byte[520];

	public LEBPILPF(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3) {
		field837 = arg3;
		field835 = arg1;
		field836 = arg2;
		field838 = arg0;
	}

	@ObfuscatedName("LEBPILPF.a(BI)[B")
	public synchronized byte[] method291(int arg0) {
		try {
			method294(field836, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field836.read(field834, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field834[2] & 0xFF) + ((field834[0] & 0xFF) << 16) + ((field834[1] & 0xFF) << 8);
			int var5 = (field834[5] & 0xFF) + ((field834[3] & 0xFF) << 16) + ((field834[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field838) {
				if (var5 > 0 && var5 <= field835.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method294(field835, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field835.read(field834, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field834[0] & 0xFF) << 8) + (field834[1] & 0xFF);
						int var13 = ((field834[2] & 0xFF) << 8) + (field834[3] & 0xFF);
						int var14 = (field834[6] & 0xFF) + ((field834[4] & 0xFF) << 16) + ((field834[5] & 0xFF) << 8);
						int var15 = field834[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field837 == var15) {
							if (var14 >= 0 && var14 <= field835.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field834[var16 + 8];
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

	@ObfuscatedName("LEBPILPF.a(I[BII)Z")
	public synchronized boolean method292(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method293(true, arg0, arg1, arg2);
		if (!var4) {
			var4 = method293(false, arg0, arg1, arg2);
		}

		return var4;
	}

	@ObfuscatedName("LEBPILPF.a(ZI[BII)Z")
	public synchronized boolean method293(boolean arg0, int arg1, byte[] arg2, int arg3) {
		try {
			int var7;
			if (arg0) {
				method294(field836, arg3 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field836.read(field834, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field834[5] & 0xFF) + ((field834[3] & 0xFF) << 16) + ((field834[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field835.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field835.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field834[0] = (byte) (arg1 >> 16);
			field834[1] = (byte) (arg1 >> 8);
			field834[2] = (byte) arg1;
			field834[3] = (byte) (var7 >> 16);
			field834[4] = (byte) (var7 >> 8);
			field834[5] = (byte) var7;
			method294(field836, arg3 * 6);
			field836.write(field834, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg1) {
				int var10 = 0;
				if (arg0) {
					method294(field835, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field835.read(field834, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field834[0] & 0xFF) << 8) + (field834[1] & 0xFF);
						int var14 = ((field834[2] & 0xFF) << 8) + (field834[3] & 0xFF);
						var10 = (field834[6] & 0xFF) + ((field834[4] & 0xFF) << 16) + ((field834[5] & 0xFF) << 8);
						int var15 = field834[7] & 0xFF;
						if (arg3 != var13 || var9 != var14 || field837 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field835.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((field835.length() + 519L) / 520L);
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

				field834[0] = (byte) (arg3 >> 8);
				field834[1] = (byte) arg3;
				field834[2] = (byte) (var9 >> 8);
				field834[3] = (byte) var9;
				field834[4] = (byte) (var10 >> 16);
				field834[5] = (byte) (var10 >> 8);
				field834[6] = (byte) var10;
				field834[7] = (byte) field837;
				method294(field835, var7 * 520);
				field835.write(field834, 0, 8);
				int var16 = arg1 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field835.write(arg2, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("LEBPILPF.a(Ljava/io/RandomAccessFile;IZ)V")
	public synchronized void method294(RandomAccessFile arg0, int arg1) throws IOException {
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
