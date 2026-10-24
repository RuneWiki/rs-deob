package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("JXARNXDE")
public final class JXARNXDE {

	@ObfuscatedName("JXARNXDE.i")
	public int field957 = 65000;

	@ObfuscatedName("JXARNXDE.h")
	public int field956;

	@ObfuscatedName("JXARNXDE.f")
	public RandomAccessFile field954;

	@ObfuscatedName("JXARNXDE.g")
	public RandomAccessFile field955;

	@ObfuscatedName("JXARNXDE.e")
	public static byte[] field953 = new byte[520];

	public JXARNXDE(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3) {
		field956 = arg2;
		field954 = arg3;
		field955 = arg1;
		field957 = arg0;
	}

	@ObfuscatedName("JXARNXDE.a(II)[B")
	public synchronized byte[] method300(int arg0) {
		try {
			method303(field955, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field955.read(field953, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field953[2] & 0xFF) + ((field953[0] & 0xFF) << 16) + ((field953[1] & 0xFF) << 8);
			int var5 = (field953[5] & 0xFF) + ((field953[3] & 0xFF) << 16) + ((field953[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field957) {
				if (var5 > 0 && var5 <= field954.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method303(field954, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field954.read(field953, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field953[0] & 0xFF) << 8) + (field953[1] & 0xFF);
						int var13 = ((field953[2] & 0xFF) << 8) + (field953[3] & 0xFF);
						int var14 = (field953[6] & 0xFF) + ((field953[4] & 0xFF) << 16) + ((field953[5] & 0xFF) << 8);
						int var15 = field953[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field956 == var15) {
							if (var14 >= 0 && var14 <= field954.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field953[var16 + 8];
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

	@ObfuscatedName("JXARNXDE.a(III[B)Z")
	public synchronized boolean method301(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method302(arg2, arg0, true, arg1);
		if (!var4) {
			var4 = method302(arg2, arg0, false, arg1);
		}

		return var4;
	}

	@ObfuscatedName("JXARNXDE.a(B[BIZI)Z")
	public synchronized boolean method302(byte[] arg0, int arg1, boolean arg2, int arg3) {
		try {
			int var7;
			if (arg2) {
				method303(field955, arg1 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field955.read(field953, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field953[5] & 0xFF) + ((field953[3] & 0xFF) << 16) + ((field953[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field954.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field954.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field953[0] = (byte) (arg3 >> 16);
			field953[1] = (byte) (arg3 >> 8);
			field953[2] = (byte) arg3;
			field953[3] = (byte) (var7 >> 16);
			field953[4] = (byte) (var7 >> 8);
			field953[5] = (byte) var7;
			method303(field955, arg1 * 6);
			field955.write(field953, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg2) {
					method303(field954, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field954.read(field953, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field953[0] & 0xFF) << 8) + (field953[1] & 0xFF);
						int var14 = ((field953[2] & 0xFF) << 8) + (field953[3] & 0xFF);
						var10 = (field953[6] & 0xFF) + ((field953[4] & 0xFF) << 16) + ((field953[5] & 0xFF) << 8);
						int var15 = field953[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field956 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field954.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field954.length() + 519L) / 520L);
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

				field953[0] = (byte) (arg1 >> 8);
				field953[1] = (byte) arg1;
				field953[2] = (byte) (var9 >> 8);
				field953[3] = (byte) var9;
				field953[4] = (byte) (var10 >> 16);
				field953[5] = (byte) (var10 >> 8);
				field953[6] = (byte) var10;
				field953[7] = (byte) field956;
				method303(field954, var7 * 520);
				field954.write(field953, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field954.write(arg0, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("JXARNXDE.a(Ljava/io/RandomAccessFile;IZ)V")
	public synchronized void method303(RandomAccessFile arg0, int arg1) throws IOException {
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
