package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("ENNRILHF")
public final class ENNRILHF {

	@ObfuscatedName("ENNRILHF.f")
	public int field677 = 65000;

	@ObfuscatedName("ENNRILHF.e")
	public int field676;

	@ObfuscatedName("ENNRILHF.c")
	public RandomAccessFile field674;

	@ObfuscatedName("ENNRILHF.d")
	public RandomAccessFile field675;

	@ObfuscatedName("ENNRILHF.b")
	public static byte[] field673 = new byte[520];

	public ENNRILHF(RandomAccessFile arg0, int arg1, RandomAccessFile arg2, int arg3) {
		field676 = arg1;
		field674 = arg0;
		field675 = arg2;
		field677 = arg3;
	}

	@ObfuscatedName("ENNRILHF.a(BI)[B")
	public synchronized byte[] method223(int arg0) {
		try {
			method226(field675, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field675.read(field673, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field673[2] & 0xFF) + ((field673[0] & 0xFF) << 16) + ((field673[1] & 0xFF) << 8);
			int var5 = (field673[5] & 0xFF) + ((field673[3] & 0xFF) << 16) + ((field673[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field677) {
				if (var5 > 0 && var5 <= field674.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method226(field674, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field674.read(field673, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field673[0] & 0xFF) << 8) + (field673[1] & 0xFF);
						int var13 = ((field673[2] & 0xFF) << 8) + (field673[3] & 0xFF);
						int var14 = (field673[6] & 0xFF) + ((field673[4] & 0xFF) << 16) + ((field673[5] & 0xFF) << 8);
						int var15 = field673[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field676 == var15) {
							if (var14 >= 0 && var14 <= field674.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field673[var16 + 8];
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

	@ObfuscatedName("ENNRILHF.a(III[B)Z")
	public synchronized boolean method224(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method225(arg0, arg2, true, arg1);
		if (!var4) {
			var4 = method225(arg0, arg2, false, arg1);
		}

		return var4;
	}

	@ObfuscatedName("ENNRILHF.a(BI[BZI)Z")
	public synchronized boolean method225(int arg0, byte[] arg1, boolean arg2, int arg3) {
		try {
			int var7;
			if (arg2) {
				method226(field675, arg3 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field675.read(field673, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field673[5] & 0xFF) + ((field673[3] & 0xFF) << 16) + ((field673[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field674.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field674.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field673[0] = (byte) (arg0 >> 16);
			field673[1] = (byte) (arg0 >> 8);
			field673[2] = (byte) arg0;
			field673[3] = (byte) (var7 >> 16);
			field673[4] = (byte) (var7 >> 8);
			field673[5] = (byte) var7;
			method226(field675, arg3 * 6);
			field675.write(field673, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg2) {
					method226(field674, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field674.read(field673, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field673[0] & 0xFF) << 8) + (field673[1] & 0xFF);
						int var14 = ((field673[2] & 0xFF) << 8) + (field673[3] & 0xFF);
						var10 = (field673[6] & 0xFF) + ((field673[4] & 0xFF) << 16) + ((field673[5] & 0xFF) << 8);
						int var15 = field673[7] & 0xFF;
						if (arg3 != var13 || var9 != var14 || field676 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field674.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field674.length() + 519L) / 520L);
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

				field673[0] = (byte) (arg3 >> 8);
				field673[1] = (byte) arg3;
				field673[2] = (byte) (var9 >> 8);
				field673[3] = (byte) var9;
				field673[4] = (byte) (var10 >> 16);
				field673[5] = (byte) (var10 >> 8);
				field673[6] = (byte) var10;
				field673[7] = (byte) field676;
				method226(field674, var7 * 520);
				field674.write(field673, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field674.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("ENNRILHF.a(Ljava/io/RandomAccessFile;IB)V")
	public synchronized void method226(RandomAccessFile arg0, int arg1) throws IOException {
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
