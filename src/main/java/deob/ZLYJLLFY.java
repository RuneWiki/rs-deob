package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ZLYJLLFY")
public final class ZLYJLLFY {

	@ObfuscatedName("ZLYJLLFY.f")
	public int field1515 = 65000;

	@ObfuscatedName("ZLYJLLFY.e")
	public int field1514;

	@ObfuscatedName("ZLYJLLFY.c")
	public RandomAccessFile field1512;

	@ObfuscatedName("ZLYJLLFY.d")
	public RandomAccessFile field1513;

	@ObfuscatedName("ZLYJLLFY.b")
	public static byte[] field1511 = new byte[520];

	public ZLYJLLFY(RandomAccessFile arg0, RandomAccessFile arg1, int arg2, int arg3) {
		field1514 = arg2;
		field1512 = arg0;
		field1513 = arg1;
		field1515 = arg3;
	}

	@ObfuscatedName("ZLYJLLFY.a(IB)[B")
	public synchronized byte[] method601(int arg0) {
		try {
			method604(field1513, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1513.read(field1511, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1511[2] & 0xFF) + ((field1511[0] & 0xFF) << 16) + ((field1511[1] & 0xFF) << 8);
			int var5 = (field1511[5] & 0xFF) + ((field1511[3] & 0xFF) << 16) + ((field1511[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1515) {
				if (var5 > 0 && var5 <= field1512.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method604(field1512, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1512.read(field1511, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1511[0] & 0xFF) << 8) + (field1511[1] & 0xFF);
						int var13 = ((field1511[2] & 0xFF) << 8) + (field1511[3] & 0xFF);
						int var14 = (field1511[6] & 0xFF) + ((field1511[4] & 0xFF) << 16) + ((field1511[5] & 0xFF) << 8);
						int var15 = field1511[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1514 == var15) {
							if (var14 >= 0 && var14 <= field1512.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1511[var16 + 8];
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

	@ObfuscatedName("ZLYJLLFY.a([BIIZ)Z")
	public synchronized boolean method602(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method603(arg0, arg1, arg2, true);
		if (!var4) {
			var4 = method603(arg0, arg1, arg2, false);
		}

		return var4;
	}

	@ObfuscatedName("ZLYJLLFY.a([BIIZI)Z")
	public synchronized boolean method603(byte[] arg0, int arg1, int arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method604(field1513, arg2 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1513.read(field1511, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1511[5] & 0xFF) + ((field1511[3] & 0xFF) << 16) + ((field1511[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1512.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1512.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1511[0] = (byte) (arg1 >> 16);
			field1511[1] = (byte) (arg1 >> 8);
			field1511[2] = (byte) arg1;
			field1511[3] = (byte) (var7 >> 16);
			field1511[4] = (byte) (var7 >> 8);
			field1511[5] = (byte) var7;
			method604(field1513, arg2 * 6);
			field1513.write(field1511, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg1) {
				int var10 = 0;
				if (arg3) {
					method604(field1512, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1512.read(field1511, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1511[0] & 0xFF) << 8) + (field1511[1] & 0xFF);
						int var14 = ((field1511[2] & 0xFF) << 8) + (field1511[3] & 0xFF);
						var10 = (field1511[6] & 0xFF) + ((field1511[4] & 0xFF) << 16) + ((field1511[5] & 0xFF) << 8);
						int var15 = field1511[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || field1514 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1512.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field1512.length() + 519L) / 520L);
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

				field1511[0] = (byte) (arg2 >> 8);
				field1511[1] = (byte) arg2;
				field1511[2] = (byte) (var9 >> 8);
				field1511[3] = (byte) var9;
				field1511[4] = (byte) (var10 >> 16);
				field1511[5] = (byte) (var10 >> 8);
				field1511[6] = (byte) var10;
				field1511[7] = (byte) field1514;
				method604(field1512, var7 * 520);
				field1512.write(field1511, 0, 8);
				int var16 = arg1 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1512.write(arg0, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("ZLYJLLFY.a(BLjava/io/RandomAccessFile;I)V")
	public synchronized void method604(RandomAccessFile arg0, int arg1) throws IOException {
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
