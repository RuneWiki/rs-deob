package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ICYHAEVI")
public final class ICYHAEVI {

	@ObfuscatedName("ICYHAEVI.h")
	public int field904 = 65000;

	@ObfuscatedName("ICYHAEVI.g")
	public int field903;

	@ObfuscatedName("ICYHAEVI.e")
	public RandomAccessFile field901;

	@ObfuscatedName("ICYHAEVI.f")
	public RandomAccessFile field902;

	@ObfuscatedName("ICYHAEVI.d")
	public static byte[] field900 = new byte[520];

	public ICYHAEVI(int arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3) {
		field903 = arg1;
		field901 = arg2;
		field902 = arg3;
		field904 = arg0;
	}

	@ObfuscatedName("ICYHAEVI.a(BI)[B")
	public synchronized byte[] method375(int arg0) {
		try {
			method378(arg0 * 6, field902);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field902.read(field900, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field900[2] & 0xFF) + ((field900[0] & 0xFF) << 16) + ((field900[1] & 0xFF) << 8);
			int var5 = (field900[5] & 0xFF) + ((field900[3] & 0xFF) << 16) + ((field900[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field904) {
				if (var5 > 0 && var5 <= field901.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method378(var5 * 520, field901);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field901.read(field900, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field900[0] & 0xFF) << 8) + (field900[1] & 0xFF);
						int var13 = ((field900[2] & 0xFF) << 8) + (field900[3] & 0xFF);
						int var14 = (field900[6] & 0xFF) + ((field900[4] & 0xFF) << 16) + ((field900[5] & 0xFF) << 8);
						int var15 = field900[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field903 == var15) {
							if (var14 >= 0 && var14 <= field901.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field900[var16 + 8];
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

	@ObfuscatedName("ICYHAEVI.a(II[BI)Z")
	public synchronized boolean method376(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method377(arg1, arg0, arg2, true);
		if (!var4) {
			var4 = method377(arg1, arg0, arg2, false);
		}

		return var4;
	}

	@ObfuscatedName("ICYHAEVI.a(II[BBZ)Z")
	public synchronized boolean method377(int arg0, int arg1, byte[] arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method378(arg0 * 6, field902);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field902.read(field900, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field900[5] & 0xFF) + ((field900[3] & 0xFF) << 16) + ((field900[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field901.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field901.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field900[0] = (byte) (arg1 >> 16);
			field900[1] = (byte) (arg1 >> 8);
			field900[2] = (byte) arg1;
			field900[3] = (byte) (var7 >> 16);
			field900[4] = (byte) (var7 >> 8);
			field900[5] = (byte) var7;
			method378(arg0 * 6, field902);
			field902.write(field900, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg1) {
				int var10 = 0;
				if (arg3) {
					method378(var7 * 520, field901);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field901.read(field900, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field900[0] & 0xFF) << 8) + (field900[1] & 0xFF);
						int var14 = ((field900[2] & 0xFF) << 8) + (field900[3] & 0xFF);
						var10 = (field900[6] & 0xFF) + ((field900[4] & 0xFF) << 16) + ((field900[5] & 0xFF) << 8);
						int var15 = field900[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field903 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field901.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field901.length() + 519L) / 520L);
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

				field900[0] = (byte) (arg0 >> 8);
				field900[1] = (byte) arg0;
				field900[2] = (byte) (var9 >> 8);
				field900[3] = (byte) var9;
				field900[4] = (byte) (var10 >> 16);
				field900[5] = (byte) (var10 >> 8);
				field900[6] = (byte) var10;
				field900[7] = (byte) field903;
				method378(var7 * 520, field901);
				field901.write(field900, 0, 8);
				int var16 = arg1 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field901.write(arg2, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("ICYHAEVI.a(IZLjava/io/RandomAccessFile;)V")
	public synchronized void method378(int arg0, RandomAccessFile arg1) throws IOException {
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
