package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("JJRYTWDH")
public final class JJRYTWDH {

	@ObfuscatedName("JJRYTWDH.h")
	public int field824 = 65000;

	@ObfuscatedName("JJRYTWDH.g")
	public int field823;

	@ObfuscatedName("JJRYTWDH.e")
	public RandomAccessFile field821;

	@ObfuscatedName("JJRYTWDH.f")
	public RandomAccessFile field822;

	@ObfuscatedName("JJRYTWDH.d")
	public static byte[] field820 = new byte[520];

	public JJRYTWDH(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3) {
		field823 = arg3;
		field821 = arg2;
		field822 = arg0;
		field824 = arg1;
	}

	@ObfuscatedName("JJRYTWDH.a(II)[B")
	public synchronized byte[] method333(int arg0) {
		try {
			method336(field822, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field822.read(field820, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field820[2] & 0xFF) + ((field820[0] & 0xFF) << 16) + ((field820[1] & 0xFF) << 8);
			int var5 = (field820[5] & 0xFF) + ((field820[3] & 0xFF) << 16) + ((field820[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field824) {
				if (var5 > 0 && var5 <= field821.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method336(field821, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field821.read(field820, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field820[0] & 0xFF) << 8) + (field820[1] & 0xFF);
						int var13 = ((field820[2] & 0xFF) << 8) + (field820[3] & 0xFF);
						int var14 = (field820[6] & 0xFF) + ((field820[4] & 0xFF) << 16) + ((field820[5] & 0xFF) << 8);
						int var15 = field820[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field823 == var15) {
							if (var14 >= 0 && var14 <= field821.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field820[var16 + 8];
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

	@ObfuscatedName("JJRYTWDH.a(II[BI)Z")
	public synchronized boolean method334(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method335(true, arg2, arg0, arg1);
		if (!var4) {
			var4 = method335(false, arg2, arg0, arg1);
		}

		return var4;
	}

	@ObfuscatedName("JJRYTWDH.a(ZIII[B)Z")
	public synchronized boolean method335(boolean arg0, int arg1, int arg2, byte[] arg3) {
		try {
			int var7;
			if (arg0) {
				method336(field822, arg2 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field822.read(field820, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field820[5] & 0xFF) + ((field820[3] & 0xFF) << 16) + ((field820[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field821.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field821.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field820[0] = (byte) (arg1 >> 16);
			field820[1] = (byte) (arg1 >> 8);
			field820[2] = (byte) arg1;
			field820[3] = (byte) (var7 >> 16);
			field820[4] = (byte) (var7 >> 8);
			field820[5] = (byte) var7;
			method336(field822, arg2 * 6);
			field822.write(field820, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg1) {
				int var10 = 0;
				if (arg0) {
					method336(field821, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field821.read(field820, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field820[0] & 0xFF) << 8) + (field820[1] & 0xFF);
						int var14 = ((field820[2] & 0xFF) << 8) + (field820[3] & 0xFF);
						var10 = (field820[6] & 0xFF) + ((field820[4] & 0xFF) << 16) + ((field820[5] & 0xFF) << 8);
						int var15 = field820[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || field823 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field821.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg0 = false;
					var10 = (int) ((field821.length() + 519L) / 520L);
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

				field820[0] = (byte) (arg2 >> 8);
				field820[1] = (byte) arg2;
				field820[2] = (byte) (var9 >> 8);
				field820[3] = (byte) var9;
				field820[4] = (byte) (var10 >> 16);
				field820[5] = (byte) (var10 >> 8);
				field820[6] = (byte) var10;
				field820[7] = (byte) field823;
				method336(field821, var7 * 520);
				field821.write(field820, 0, 8);
				int var16 = arg1 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field821.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("JJRYTWDH.a(ZLjava/io/RandomAccessFile;I)V")
	public synchronized void method336(RandomAccessFile arg0, int arg1) throws IOException {
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
