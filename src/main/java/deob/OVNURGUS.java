package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("OVNURGUS")
public final class OVNURGUS {

	@ObfuscatedName("OVNURGUS.h")
	public int field1052 = 65000;

	@ObfuscatedName("OVNURGUS.g")
	public int field1051;

	@ObfuscatedName("OVNURGUS.e")
	public RandomAccessFile field1049;

	@ObfuscatedName("OVNURGUS.f")
	public RandomAccessFile field1050;

	@ObfuscatedName("OVNURGUS.d")
	public static byte[] field1048 = new byte[520];

	public OVNURGUS(RandomAccessFile arg0, RandomAccessFile arg1, int arg2, int arg3) {
		field1051 = arg2;
		field1049 = arg1;
		field1050 = arg0;
		field1052 = arg3;
	}

	@ObfuscatedName("OVNURGUS.a(BI)[B")
	public synchronized byte[] method392(int arg0) {
		try {
			method395(field1050, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1050.read(field1048, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1048[2] & 0xFF) + ((field1048[0] & 0xFF) << 16) + ((field1048[1] & 0xFF) << 8);
			int var5 = (field1048[5] & 0xFF) + ((field1048[3] & 0xFF) << 16) + ((field1048[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1052) {
				if (var5 > 0 && var5 <= field1049.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method395(field1049, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1049.read(field1048, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1048[0] & 0xFF) << 8) + (field1048[1] & 0xFF);
						int var13 = ((field1048[2] & 0xFF) << 8) + (field1048[3] & 0xFF);
						int var14 = (field1048[6] & 0xFF) + ((field1048[4] & 0xFF) << 16) + ((field1048[5] & 0xFF) << 8);
						int var15 = field1048[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1051 == var15) {
							if (var14 >= 0 && var14 <= field1049.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1048[var16 + 8];
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

	@ObfuscatedName("OVNURGUS.a([BIII)Z")
	public synchronized boolean method393(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method394(arg1, arg0, arg2, true);
		if (!var4) {
			var4 = method394(arg1, arg0, arg2, false);
		}

		return var4;
	}

	@ObfuscatedName("OVNURGUS.a(IB[BIZ)Z")
	public synchronized boolean method394(int arg0, byte[] arg1, int arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method395(field1050, arg2 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1050.read(field1048, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1048[5] & 0xFF) + ((field1048[3] & 0xFF) << 16) + ((field1048[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1049.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1049.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1048[0] = (byte) (arg0 >> 16);
			field1048[1] = (byte) (arg0 >> 8);
			field1048[2] = (byte) arg0;
			field1048[3] = (byte) (var7 >> 16);
			field1048[4] = (byte) (var7 >> 8);
			field1048[5] = (byte) var7;
			method395(field1050, arg2 * 6);
			field1050.write(field1048, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg3) {
					method395(field1049, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1049.read(field1048, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1048[0] & 0xFF) << 8) + (field1048[1] & 0xFF);
						int var14 = ((field1048[2] & 0xFF) << 8) + (field1048[3] & 0xFF);
						var10 = (field1048[6] & 0xFF) + ((field1048[4] & 0xFF) << 16) + ((field1048[5] & 0xFF) << 8);
						int var15 = field1048[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || field1051 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1049.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field1049.length() + 519L) / 520L);
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

				field1048[0] = (byte) (arg2 >> 8);
				field1048[1] = (byte) arg2;
				field1048[2] = (byte) (var9 >> 8);
				field1048[3] = (byte) var9;
				field1048[4] = (byte) (var10 >> 16);
				field1048[5] = (byte) (var10 >> 8);
				field1048[6] = (byte) var10;
				field1048[7] = (byte) field1051;
				method395(field1049, var7 * 520);
				field1049.write(field1048, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1049.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("OVNURGUS.a(Ljava/io/RandomAccessFile;II)V")
	public synchronized void method395(RandomAccessFile arg0, int arg1) throws IOException {
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
