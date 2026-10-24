package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("IEGUBMVC")
public final class IEGUBMVC {

	@ObfuscatedName("IEGUBMVC.f")
	public int field732 = 65000;

	@ObfuscatedName("IEGUBMVC.e")
	public int field731;

	@ObfuscatedName("IEGUBMVC.c")
	public RandomAccessFile field729;

	@ObfuscatedName("IEGUBMVC.d")
	public RandomAccessFile field730;

	@ObfuscatedName("IEGUBMVC.b")
	public static byte[] field728 = new byte[520];

	public IEGUBMVC(RandomAccessFile arg0, RandomAccessFile arg1, int arg2, int arg3) {
		field731 = arg2;
		field729 = arg1;
		field730 = arg0;
		field732 = arg3;
	}

	@ObfuscatedName("IEGUBMVC.a(II)[B")
	public synchronized byte[] method229(int arg0) {
		try {
			method232(field730, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field730.read(field728, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field728[2] & 0xFF) + ((field728[0] & 0xFF) << 16) + ((field728[1] & 0xFF) << 8);
			int var5 = (field728[5] & 0xFF) + ((field728[3] & 0xFF) << 16) + ((field728[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field732) {
				if (var5 > 0 && var5 <= field729.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method232(field729, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field729.read(field728, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field728[0] & 0xFF) << 8) + (field728[1] & 0xFF);
						int var13 = ((field728[2] & 0xFF) << 8) + (field728[3] & 0xFF);
						int var14 = (field728[6] & 0xFF) + ((field728[4] & 0xFF) << 16) + ((field728[5] & 0xFF) << 8);
						int var15 = field728[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field731 == var15) {
							if (var14 >= 0 && var14 <= field729.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field728[var16 + 8];
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

	@ObfuscatedName("IEGUBMVC.a(IB[BI)Z")
	public synchronized boolean method230(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method231(arg1, arg0, true, arg2);
		if (!var4) {
			var4 = method231(arg1, arg0, false, arg2);
		}

		return var4;
	}

	@ObfuscatedName("IEGUBMVC.a([BIZII)Z")
	public synchronized boolean method231(byte[] arg0, int arg1, boolean arg2, int arg3) {
		try {
			int var7;
			if (arg2) {
				method232(field730, arg1 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field730.read(field728, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field728[5] & 0xFF) + ((field728[3] & 0xFF) << 16) + ((field728[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field729.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field729.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field728[0] = (byte) (arg3 >> 16);
			field728[1] = (byte) (arg3 >> 8);
			field728[2] = (byte) arg3;
			field728[3] = (byte) (var7 >> 16);
			field728[4] = (byte) (var7 >> 8);
			field728[5] = (byte) var7;
			method232(field730, arg1 * 6);
			field730.write(field728, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg2) {
					method232(field729, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field729.read(field728, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field728[0] & 0xFF) << 8) + (field728[1] & 0xFF);
						int var14 = ((field728[2] & 0xFF) << 8) + (field728[3] & 0xFF);
						var10 = (field728[6] & 0xFF) + ((field728[4] & 0xFF) << 16) + ((field728[5] & 0xFF) << 8);
						int var15 = field728[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field731 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field729.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field729.length() + 519L) / 520L);
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

				field728[0] = (byte) (arg1 >> 8);
				field728[1] = (byte) arg1;
				field728[2] = (byte) (var9 >> 8);
				field728[3] = (byte) var9;
				field728[4] = (byte) (var10 >> 16);
				field728[5] = (byte) (var10 >> 8);
				field728[6] = (byte) var10;
				field728[7] = (byte) field731;
				method232(field729, var7 * 520);
				field729.write(field728, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field729.write(arg0, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("IEGUBMVC.a(Ljava/io/RandomAccessFile;II)V")
	public synchronized void method232(RandomAccessFile arg0, int arg1) throws IOException {
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
