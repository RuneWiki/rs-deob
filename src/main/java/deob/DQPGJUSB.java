package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("DQPGJUSB")
public final class DQPGJUSB {

	@ObfuscatedName("DQPGJUSB.f")
	public int field532 = 65000;

	@ObfuscatedName("DQPGJUSB.e")
	public int field531;

	@ObfuscatedName("DQPGJUSB.c")
	public RandomAccessFile field529;

	@ObfuscatedName("DQPGJUSB.d")
	public RandomAccessFile field530;

	@ObfuscatedName("DQPGJUSB.b")
	public static byte[] field528 = new byte[520];

	public DQPGJUSB(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3) {
		field531 = arg3;
		field529 = arg1;
		field530 = arg2;
		field532 = arg0;
	}

	@ObfuscatedName("DQPGJUSB.a(IZ)[B")
	public synchronized byte[] method184(int arg0) {
		try {
			method187(arg0 * 6, field530);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field530.read(field528, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field528[2] & 0xFF) + ((field528[0] & 0xFF) << 16) + ((field528[1] & 0xFF) << 8);
			int var5 = (field528[5] & 0xFF) + ((field528[3] & 0xFF) << 16) + ((field528[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field532) {
				if (var5 > 0 && var5 <= field529.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method187(var5 * 520, field529);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field529.read(field528, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field528[0] & 0xFF) << 8) + (field528[1] & 0xFF);
						int var13 = ((field528[2] & 0xFF) << 8) + (field528[3] & 0xFF);
						int var14 = (field528[6] & 0xFF) + ((field528[4] & 0xFF) << 16) + ((field528[5] & 0xFF) << 8);
						int var15 = field528[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field531 == var15) {
							if (var14 >= 0 && var14 <= field529.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field528[var16 + 8];
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

	@ObfuscatedName("DQPGJUSB.a(II[BI)Z")
	public synchronized boolean method185(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method186(arg0, true, arg2, arg1);
		if (!var4) {
			var4 = method186(arg0, false, arg2, arg1);
		}

		return var4;
	}

	@ObfuscatedName("DQPGJUSB.a(IZI[BI)Z")
	public synchronized boolean method186(int arg0, boolean arg1, int arg2, byte[] arg3) {
		try {
			int var7;
			if (arg1) {
				method187(arg0 * 6, field530);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field530.read(field528, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field528[5] & 0xFF) + ((field528[3] & 0xFF) << 16) + ((field528[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field529.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field529.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field528[0] = (byte) (arg2 >> 16);
			field528[1] = (byte) (arg2 >> 8);
			field528[2] = (byte) arg2;
			field528[3] = (byte) (var7 >> 16);
			field528[4] = (byte) (var7 >> 8);
			field528[5] = (byte) var7;
			method187(arg0 * 6, field530);
			field530.write(field528, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg1) {
					method187(var7 * 520, field529);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field529.read(field528, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field528[0] & 0xFF) << 8) + (field528[1] & 0xFF);
						int var14 = ((field528[2] & 0xFF) << 8) + (field528[3] & 0xFF);
						var10 = (field528[6] & 0xFF) + ((field528[4] & 0xFF) << 16) + ((field528[5] & 0xFF) << 8);
						int var15 = field528[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field531 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field529.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg1 = false;
					var10 = (int) ((field529.length() + 519L) / 520L);
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

				field528[0] = (byte) (arg0 >> 8);
				field528[1] = (byte) arg0;
				field528[2] = (byte) (var9 >> 8);
				field528[3] = (byte) var9;
				field528[4] = (byte) (var10 >> 16);
				field528[5] = (byte) (var10 >> 8);
				field528[6] = (byte) var10;
				field528[7] = (byte) field531;
				method187(var7 * 520, field529);
				field529.write(field528, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field529.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("DQPGJUSB.a(ILjava/io/RandomAccessFile;Z)V")
	public synchronized void method187(int arg0, RandomAccessFile arg1) throws IOException {
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
