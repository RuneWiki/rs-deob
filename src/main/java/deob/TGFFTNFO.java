package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("TGFFTNFO")
public final class TGFFTNFO {

	@ObfuscatedName("TGFFTNFO.h")
	public int field1262 = 65000;

	@ObfuscatedName("TGFFTNFO.g")
	public int field1261;

	@ObfuscatedName("TGFFTNFO.e")
	public RandomAccessFile field1259;

	@ObfuscatedName("TGFFTNFO.f")
	public RandomAccessFile field1260;

	@ObfuscatedName("TGFFTNFO.d")
	public static byte[] field1258 = new byte[520];

	public TGFFTNFO(int arg0, int arg1, RandomAccessFile arg2, RandomAccessFile arg3) {
		field1261 = arg0;
		field1259 = arg2;
		field1260 = arg3;
		field1262 = arg1;
	}

	@ObfuscatedName("TGFFTNFO.a(IB)[B")
	public synchronized byte[] method439(int arg0) {
		try {
			method442(field1260, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1260.read(field1258, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1258[2] & 0xFF) + ((field1258[0] & 0xFF) << 16) + ((field1258[1] & 0xFF) << 8);
			int var5 = (field1258[5] & 0xFF) + ((field1258[3] & 0xFF) << 16) + ((field1258[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1262) {
				if (var5 > 0 && var5 <= field1259.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method442(field1259, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1259.read(field1258, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1258[0] & 0xFF) << 8) + (field1258[1] & 0xFF);
						int var13 = ((field1258[2] & 0xFF) << 8) + (field1258[3] & 0xFF);
						int var14 = (field1258[6] & 0xFF) + ((field1258[4] & 0xFF) << 16) + ((field1258[5] & 0xFF) << 8);
						int var15 = field1258[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1261 == var15) {
							if (var14 >= 0 && var14 <= field1259.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1258[var16 + 8];
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

	@ObfuscatedName("TGFFTNFO.a(I[BII)Z")
	public synchronized boolean method440(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method441(arg1, arg2, true, arg0);
		if (!var4) {
			var4 = method441(arg1, arg2, false, arg0);
		}

		return var4;
	}

	@ObfuscatedName("TGFFTNFO.a(IIZ[BI)Z")
	public synchronized boolean method441(int arg0, int arg1, boolean arg2, byte[] arg3) {
		try {
			int var7;
			if (arg2) {
				method442(field1260, arg1 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1260.read(field1258, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1258[5] & 0xFF) + ((field1258[3] & 0xFF) << 16) + ((field1258[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1259.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1259.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1258[0] = (byte) (arg0 >> 16);
			field1258[1] = (byte) (arg0 >> 8);
			field1258[2] = (byte) arg0;
			field1258[3] = (byte) (var7 >> 16);
			field1258[4] = (byte) (var7 >> 8);
			field1258[5] = (byte) var7;
			method442(field1260, arg1 * 6);
			field1260.write(field1258, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg2) {
					method442(field1259, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1259.read(field1258, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1258[0] & 0xFF) << 8) + (field1258[1] & 0xFF);
						int var14 = ((field1258[2] & 0xFF) << 8) + (field1258[3] & 0xFF);
						var10 = (field1258[6] & 0xFF) + ((field1258[4] & 0xFF) << 16) + ((field1258[5] & 0xFF) << 8);
						int var15 = field1258[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field1261 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1259.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field1259.length() + 519L) / 520L);
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

				field1258[0] = (byte) (arg1 >> 8);
				field1258[1] = (byte) arg1;
				field1258[2] = (byte) (var9 >> 8);
				field1258[3] = (byte) var9;
				field1258[4] = (byte) (var10 >> 16);
				field1258[5] = (byte) (var10 >> 8);
				field1258[6] = (byte) var10;
				field1258[7] = (byte) field1261;
				method442(field1259, var7 * 520);
				field1259.write(field1258, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1259.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("TGFFTNFO.a(Ljava/io/RandomAccessFile;II)V")
	public synchronized void method442(RandomAccessFile arg0, int arg1) throws IOException {
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
