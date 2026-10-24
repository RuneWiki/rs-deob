package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("EEVNVHNQ")
public final class EEVNVHNQ {

	@ObfuscatedName("EEVNVHNQ.h")
	public int field587 = 65000;

	@ObfuscatedName("EEVNVHNQ.g")
	public int field586;

	@ObfuscatedName("EEVNVHNQ.e")
	public RandomAccessFile field584;

	@ObfuscatedName("EEVNVHNQ.f")
	public RandomAccessFile field585;

	@ObfuscatedName("EEVNVHNQ.c")
	public static byte[] field583 = new byte[520];

	public EEVNVHNQ(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3) {
		field586 = arg0;
		field584 = arg2;
		field585 = arg1;
		field587 = arg3;
	}

	@ObfuscatedName("EEVNVHNQ.a(IZ)[B")
	public synchronized byte[] method245(int arg0) {
		try {
			method248(field585, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field585.read(field583, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field583[2] & 0xFF) + ((field583[0] & 0xFF) << 16) + ((field583[1] & 0xFF) << 8);
			int var5 = (field583[5] & 0xFF) + ((field583[3] & 0xFF) << 16) + ((field583[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field587) {
				if (var5 > 0 && var5 <= field584.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method248(field584, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field584.read(field583, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field583[0] & 0xFF) << 8) + (field583[1] & 0xFF);
						int var13 = ((field583[2] & 0xFF) << 8) + (field583[3] & 0xFF);
						int var14 = (field583[6] & 0xFF) + ((field583[4] & 0xFF) << 16) + ((field583[5] & 0xFF) << 8);
						int var15 = field583[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field586 == var15) {
							if (var14 >= 0 && var14 <= field584.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field583[var16 + 8];
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

	@ObfuscatedName("EEVNVHNQ.a(I[BII)Z")
	public synchronized boolean method246(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method247(arg2, true, arg1, arg0);
		if (!var4) {
			var4 = method247(arg2, false, arg1, arg0);
		}

		return var4;
	}

	@ObfuscatedName("EEVNVHNQ.a(BIZI[B)Z")
	public synchronized boolean method247(int arg0, boolean arg1, int arg2, byte[] arg3) {
		try {
			int var7;
			if (arg1) {
				method248(field585, arg0 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field585.read(field583, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field583[5] & 0xFF) + ((field583[3] & 0xFF) << 16) + ((field583[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field584.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field584.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field583[0] = (byte) (arg2 >> 16);
			field583[1] = (byte) (arg2 >> 8);
			field583[2] = (byte) arg2;
			field583[3] = (byte) (var7 >> 16);
			field583[4] = (byte) (var7 >> 8);
			field583[5] = (byte) var7;
			method248(field585, arg0 * 6);
			field585.write(field583, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg1) {
					method248(field584, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field584.read(field583, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field583[0] & 0xFF) << 8) + (field583[1] & 0xFF);
						int var14 = ((field583[2] & 0xFF) << 8) + (field583[3] & 0xFF);
						var10 = (field583[6] & 0xFF) + ((field583[4] & 0xFF) << 16) + ((field583[5] & 0xFF) << 8);
						int var15 = field583[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field586 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field584.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg1 = false;
					var10 = (int) ((field584.length() + 519L) / 520L);
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

				field583[0] = (byte) (arg0 >> 8);
				field583[1] = (byte) arg0;
				field583[2] = (byte) (var9 >> 8);
				field583[3] = (byte) var9;
				field583[4] = (byte) (var10 >> 16);
				field583[5] = (byte) (var10 >> 8);
				field583[6] = (byte) var10;
				field583[7] = (byte) field586;
				method248(field584, var7 * 520);
				field584.write(field583, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field584.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("EEVNVHNQ.a(Ljava/io/RandomAccessFile;IB)V")
	public synchronized void method248(RandomAccessFile arg0, int arg1) throws IOException {
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
