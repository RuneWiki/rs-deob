package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("HOAULYFF")
public final class HOAULYFF {

	@ObfuscatedName("HOAULYFF.h")
	public int field668 = 65000;

	@ObfuscatedName("HOAULYFF.g")
	public int field667;

	@ObfuscatedName("HOAULYFF.e")
	public RandomAccessFile field665;

	@ObfuscatedName("HOAULYFF.f")
	public RandomAccessFile field666;

	@ObfuscatedName("HOAULYFF.d")
	public static byte[] field664 = new byte[520];

	public HOAULYFF(int arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3) {
		field667 = arg1;
		field665 = arg2;
		field666 = arg3;
		field668 = arg0;
	}

	@ObfuscatedName("HOAULYFF.a(II)[B")
	public synchronized byte[] method219(int arg0) {
		try {
			method222(field666, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field666.read(field664, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field664[2] & 0xFF) + ((field664[0] & 0xFF) << 16) + ((field664[1] & 0xFF) << 8);
			int var5 = (field664[5] & 0xFF) + ((field664[3] & 0xFF) << 16) + ((field664[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field668) {
				if (var5 > 0 && var5 <= field665.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method222(field665, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field665.read(field664, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field664[0] & 0xFF) << 8) + (field664[1] & 0xFF);
						int var13 = ((field664[2] & 0xFF) << 8) + (field664[3] & 0xFF);
						int var14 = (field664[6] & 0xFF) + ((field664[4] & 0xFF) << 16) + ((field664[5] & 0xFF) << 8);
						int var15 = field664[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field667 == var15) {
							if (var14 >= 0 && var14 <= field665.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field664[var16 + 8];
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

	@ObfuscatedName("HOAULYFF.a(ZII[B)Z")
	public synchronized boolean method220(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method221(arg0, arg2, arg1, true);
		if (!var4) {
			var4 = method221(arg0, arg2, arg1, false);
		}

		return var4;
	}

	@ObfuscatedName("HOAULYFF.a(I[BIIZ)Z")
	public synchronized boolean method221(int arg0, byte[] arg1, int arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method222(field666, arg2 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field666.read(field664, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field664[5] & 0xFF) + ((field664[3] & 0xFF) << 16) + ((field664[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field665.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field665.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field664[0] = (byte) (arg0 >> 16);
			field664[1] = (byte) (arg0 >> 8);
			field664[2] = (byte) arg0;
			field664[3] = (byte) (var7 >> 16);
			field664[4] = (byte) (var7 >> 8);
			field664[5] = (byte) var7;
			method222(field666, arg2 * 6);
			field666.write(field664, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg3) {
					method222(field665, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field665.read(field664, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field664[0] & 0xFF) << 8) + (field664[1] & 0xFF);
						int var14 = ((field664[2] & 0xFF) << 8) + (field664[3] & 0xFF);
						var10 = (field664[6] & 0xFF) + ((field664[4] & 0xFF) << 16) + ((field664[5] & 0xFF) << 8);
						int var15 = field664[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || field667 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field665.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field665.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}

					if (var7 == var10) {
						var10++;
					}
				}

				if (arg0 - var8 <= 512) {
					var10 = 0;
				}

				field664[0] = (byte) (arg2 >> 8);
				field664[1] = (byte) arg2;
				field664[2] = (byte) (var9 >> 8);
				field664[3] = (byte) var9;
				field664[4] = (byte) (var10 >> 16);
				field664[5] = (byte) (var10 >> 8);
				field664[6] = (byte) var10;
				field664[7] = (byte) field667;
				method222(field665, var7 * 520);
				field665.write(field664, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field665.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("HOAULYFF.a(Ljava/io/RandomAccessFile;BI)V")
	public synchronized void method222(RandomAccessFile arg0, int arg1) throws IOException {
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
