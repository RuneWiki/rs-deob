package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("UEKAQTXH")
public final class UEKAQTXH {

	@ObfuscatedName("UEKAQTXH.e")
	public int field1285 = 65000;

	@ObfuscatedName("UEKAQTXH.d")
	public int field1284;

	@ObfuscatedName("UEKAQTXH.b")
	public RandomAccessFile field1282;

	@ObfuscatedName("UEKAQTXH.c")
	public RandomAccessFile field1283;

	@ObfuscatedName("UEKAQTXH.a")
	public static byte[] field1281 = new byte[520];

	public UEKAQTXH(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3) {
		field1284 = arg2;
		field1282 = arg3;
		field1283 = arg0;
		field1285 = arg1;
	}

	@ObfuscatedName("UEKAQTXH.a(II)[B")
	public synchronized byte[] method527(int arg0) {
		try {
			method530(arg0 * 6, field1283);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1283.read(field1281, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1281[2] & 0xFF) + ((field1281[0] & 0xFF) << 16) + ((field1281[1] & 0xFF) << 8);
			int var5 = (field1281[5] & 0xFF) + ((field1281[3] & 0xFF) << 16) + ((field1281[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1285) {
				if (var5 > 0 && var5 <= field1282.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method530(var5 * 520, field1282);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1282.read(field1281, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1281[0] & 0xFF) << 8) + (field1281[1] & 0xFF);
						int var13 = ((field1281[2] & 0xFF) << 8) + (field1281[3] & 0xFF);
						int var14 = (field1281[6] & 0xFF) + ((field1281[4] & 0xFF) << 16) + ((field1281[5] & 0xFF) << 8);
						int var15 = field1281[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1284 == var15) {
							if (var14 >= 0 && var14 <= field1282.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1281[var16 + 8];
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

	@ObfuscatedName("UEKAQTXH.a(IB[BI)Z")
	public synchronized boolean method528(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method529(arg2, arg1, arg0, true);
		if (!var4) {
			var4 = method529(arg2, arg1, arg0, false);
		}

		return var4;
	}

	@ObfuscatedName("UEKAQTXH.a(II[BIZ)Z")
	public synchronized boolean method529(int arg0, byte[] arg1, int arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method530(arg0 * 6, field1283);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1283.read(field1281, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1281[5] & 0xFF) + ((field1281[3] & 0xFF) << 16) + ((field1281[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1282.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1282.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1281[0] = (byte) (arg2 >> 16);
			field1281[1] = (byte) (arg2 >> 8);
			field1281[2] = (byte) arg2;
			field1281[3] = (byte) (var7 >> 16);
			field1281[4] = (byte) (var7 >> 8);
			field1281[5] = (byte) var7;
			method530(arg0 * 6, field1283);
			field1283.write(field1281, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg3) {
					method530(var7 * 520, field1282);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1282.read(field1281, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1281[0] & 0xFF) << 8) + (field1281[1] & 0xFF);
						int var14 = ((field1281[2] & 0xFF) << 8) + (field1281[3] & 0xFF);
						var10 = (field1281[6] & 0xFF) + ((field1281[4] & 0xFF) << 16) + ((field1281[5] & 0xFF) << 8);
						int var15 = field1281[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field1284 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1282.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field1282.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}

					if (var7 == var10) {
						var10++;
					}
				}

				if (arg2 - var8 <= 512) {
					var10 = 0;
				}

				field1281[0] = (byte) (arg0 >> 8);
				field1281[1] = (byte) arg0;
				field1281[2] = (byte) (var9 >> 8);
				field1281[3] = (byte) var9;
				field1281[4] = (byte) (var10 >> 16);
				field1281[5] = (byte) (var10 >> 8);
				field1281[6] = (byte) var10;
				field1281[7] = (byte) field1284;
				method530(var7 * 520, field1282);
				field1282.write(field1281, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1282.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("UEKAQTXH.a(ILjava/io/RandomAccessFile;Z)V")
	public synchronized void method530(int arg0, RandomAccessFile arg1) throws IOException {
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
