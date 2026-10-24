package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("AIGFCJME")
public final class AIGFCJME {

	@ObfuscatedName("AIGFCJME.h")
	public int field5 = 65000;

	@ObfuscatedName("AIGFCJME.g")
	public int field4;

	@ObfuscatedName("AIGFCJME.e")
	public RandomAccessFile field2;

	@ObfuscatedName("AIGFCJME.f")
	public RandomAccessFile field3;

	@ObfuscatedName("AIGFCJME.c")
	public static byte[] field1 = new byte[520];

	public AIGFCJME(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3) {
		field4 = arg3;
		field2 = arg1;
		field3 = arg2;
		field5 = arg0;
	}

	@ObfuscatedName("AIGFCJME.a(ZI)[B")
	public synchronized byte[] method1(int arg0) {
		try {
			method4(field3, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field3.read(field1, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1[2] & 0xFF) + ((field1[0] & 0xFF) << 16) + ((field1[1] & 0xFF) << 8);
			int var5 = (field1[5] & 0xFF) + ((field1[3] & 0xFF) << 16) + ((field1[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field5) {
				if (var5 > 0 && var5 <= field2.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method4(field2, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field2.read(field1, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1[0] & 0xFF) << 8) + (field1[1] & 0xFF);
						int var13 = ((field1[2] & 0xFF) << 8) + (field1[3] & 0xFF);
						int var14 = (field1[6] & 0xFF) + ((field1[4] & 0xFF) << 16) + ((field1[5] & 0xFF) << 8);
						int var15 = field1[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field4 == var15) {
							if (var14 >= 0 && var14 <= field2.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1[var16 + 8];
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

	@ObfuscatedName("AIGFCJME.a(II[BI)Z")
	public synchronized boolean method2(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method3(arg1, arg0, true, arg2);
		if (!var4) {
			var4 = method3(arg1, arg0, false, arg2);
		}

		return var4;
	}

	@ObfuscatedName("AIGFCJME.a([BIZII)Z")
	public synchronized boolean method3(byte[] arg0, int arg1, boolean arg2, int arg3) {
		try {
			int var7;
			if (arg2) {
				method4(field3, arg1 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field3.read(field1, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1[5] & 0xFF) + ((field1[3] & 0xFF) << 16) + ((field1[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field2.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field2.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1[0] = (byte) (arg3 >> 16);
			field1[1] = (byte) (arg3 >> 8);
			field1[2] = (byte) arg3;
			field1[3] = (byte) (var7 >> 16);
			field1[4] = (byte) (var7 >> 8);
			field1[5] = (byte) var7;
			method4(field3, arg1 * 6);
			field3.write(field1, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg2) {
					method4(field2, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field2.read(field1, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1[0] & 0xFF) << 8) + (field1[1] & 0xFF);
						int var14 = ((field1[2] & 0xFF) << 8) + (field1[3] & 0xFF);
						var10 = (field1[6] & 0xFF) + ((field1[4] & 0xFF) << 16) + ((field1[5] & 0xFF) << 8);
						int var15 = field1[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field4 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field2.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field2.length() + 519L) / 520L);
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

				field1[0] = (byte) (arg1 >> 8);
				field1[1] = (byte) arg1;
				field1[2] = (byte) (var9 >> 8);
				field1[3] = (byte) var9;
				field1[4] = (byte) (var10 >> 16);
				field1[5] = (byte) (var10 >> 8);
				field1[6] = (byte) var10;
				field1[7] = (byte) field4;
				method4(field2, var7 * 520);
				field2.write(field1, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field2.write(arg0, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("AIGFCJME.a(Ljava/io/RandomAccessFile;II)V")
	public synchronized void method4(RandomAccessFile arg0, int arg1) throws IOException {
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
