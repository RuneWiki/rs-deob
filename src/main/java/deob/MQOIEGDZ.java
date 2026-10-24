package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("MQOIEGDZ")
public final class MQOIEGDZ {

	@ObfuscatedName("MQOIEGDZ.g")
	public int field943 = 65000;

	@ObfuscatedName("MQOIEGDZ.f")
	public int field942;

	@ObfuscatedName("MQOIEGDZ.d")
	public RandomAccessFile field940;

	@ObfuscatedName("MQOIEGDZ.e")
	public RandomAccessFile field941;

	@ObfuscatedName("MQOIEGDZ.c")
	public static byte[] field939 = new byte[520];

	public MQOIEGDZ(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3) {
		field942 = arg1;
		field940 = arg3;
		field941 = arg0;
		field943 = arg2;
	}

	@ObfuscatedName("MQOIEGDZ.a(II)[B")
	public synchronized byte[] method328(int arg0) {
		try {
			method331(arg0 * 6, field941);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field941.read(field939, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field939[2] & 0xFF) + ((field939[0] & 0xFF) << 16) + ((field939[1] & 0xFF) << 8);
			int var5 = (field939[5] & 0xFF) + ((field939[3] & 0xFF) << 16) + ((field939[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field943) {
				if (var5 > 0 && var5 <= field940.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method331(var5 * 520, field940);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field940.read(field939, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field939[0] & 0xFF) << 8) + (field939[1] & 0xFF);
						int var13 = ((field939[2] & 0xFF) << 8) + (field939[3] & 0xFF);
						int var14 = (field939[6] & 0xFF) + ((field939[4] & 0xFF) << 16) + ((field939[5] & 0xFF) << 8);
						int var15 = field939[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field942 == var15) {
							if (var14 >= 0 && var14 <= field940.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field939[var16 + 8];
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

	@ObfuscatedName("MQOIEGDZ.a(III[B)Z")
	public synchronized boolean method329(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method330(arg0, true, arg1, arg2);
		if (!var4) {
			var4 = method330(arg0, false, arg1, arg2);
		}

		return var4;
	}

	@ObfuscatedName("MQOIEGDZ.a(IBZI[B)Z")
	public synchronized boolean method330(int arg0, boolean arg1, int arg2, byte[] arg3) {
		try {
			int var7;
			if (arg1) {
				method331(arg0 * 6, field941);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field941.read(field939, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field939[5] & 0xFF) + ((field939[3] & 0xFF) << 16) + ((field939[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field940.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field940.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field939[0] = (byte) (arg2 >> 16);
			field939[1] = (byte) (arg2 >> 8);
			field939[2] = (byte) arg2;
			field939[3] = (byte) (var7 >> 16);
			field939[4] = (byte) (var7 >> 8);
			field939[5] = (byte) var7;
			method331(arg0 * 6, field941);
			field941.write(field939, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg1) {
					method331(var7 * 520, field940);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field940.read(field939, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field939[0] & 0xFF) << 8) + (field939[1] & 0xFF);
						int var14 = ((field939[2] & 0xFF) << 8) + (field939[3] & 0xFF);
						var10 = (field939[6] & 0xFF) + ((field939[4] & 0xFF) << 16) + ((field939[5] & 0xFF) << 8);
						int var15 = field939[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field942 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field940.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg1 = false;
					var10 = (int) ((field940.length() + 519L) / 520L);
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

				field939[0] = (byte) (arg0 >> 8);
				field939[1] = (byte) arg0;
				field939[2] = (byte) (var9 >> 8);
				field939[3] = (byte) var9;
				field939[4] = (byte) (var10 >> 16);
				field939[5] = (byte) (var10 >> 8);
				field939[6] = (byte) var10;
				field939[7] = (byte) field942;
				method331(var7 * 520, field940);
				field940.write(field939, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field940.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("MQOIEGDZ.a(ZILjava/io/RandomAccessFile;)V")
	public synchronized void method331(int arg0, RandomAccessFile arg1) throws IOException {
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
