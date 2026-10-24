package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("TUZTEZTO")
public final class TUZTEZTO {

	@ObfuscatedName("TUZTEZTO.h")
	public int field1246 = 65000;

	@ObfuscatedName("TUZTEZTO.g")
	public int field1245;

	@ObfuscatedName("TUZTEZTO.e")
	public RandomAccessFile field1243;

	@ObfuscatedName("TUZTEZTO.f")
	public RandomAccessFile field1244;

	@ObfuscatedName("TUZTEZTO.c")
	public static byte[] field1242 = new byte[520];

	public TUZTEZTO(RandomAccessFile arg0, RandomAccessFile arg1, int arg2, int arg3) {
		field1245 = arg3;
		field1243 = arg0;
		field1244 = arg1;
		field1246 = arg2;
	}

	@ObfuscatedName("TUZTEZTO.a(II)[B")
	public synchronized byte[] method430(int arg0) {
		try {
			method433(arg0 * 6, field1244);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1244.read(field1242, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1242[2] & 0xFF) + ((field1242[0] & 0xFF) << 16) + ((field1242[1] & 0xFF) << 8);
			int var5 = (field1242[5] & 0xFF) + ((field1242[3] & 0xFF) << 16) + ((field1242[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1246) {
				if (var5 > 0 && var5 <= field1243.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method433(var5 * 520, field1243);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1243.read(field1242, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1242[0] & 0xFF) << 8) + (field1242[1] & 0xFF);
						int var13 = ((field1242[2] & 0xFF) << 8) + (field1242[3] & 0xFF);
						int var14 = (field1242[6] & 0xFF) + ((field1242[4] & 0xFF) << 16) + ((field1242[5] & 0xFF) << 8);
						int var15 = field1242[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1245 == var15) {
							if (var14 >= 0 && var14 <= field1243.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1242[var16 + 8];
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

	@ObfuscatedName("TUZTEZTO.a([BBII)Z")
	public synchronized boolean method431(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method432(arg1, arg2, arg0, true);
		if (!var4) {
			var4 = method432(arg1, arg2, arg0, false);
		}

		return var4;
	}

	@ObfuscatedName("TUZTEZTO.a(II[BIZ)Z")
	public synchronized boolean method432(int arg0, int arg1, byte[] arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method433(arg1 * 6, field1244);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1244.read(field1242, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1242[5] & 0xFF) + ((field1242[3] & 0xFF) << 16) + ((field1242[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1243.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1243.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1242[0] = (byte) (arg0 >> 16);
			field1242[1] = (byte) (arg0 >> 8);
			field1242[2] = (byte) arg0;
			field1242[3] = (byte) (var7 >> 16);
			field1242[4] = (byte) (var7 >> 8);
			field1242[5] = (byte) var7;
			method433(arg1 * 6, field1244);
			field1244.write(field1242, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg3) {
					method433(var7 * 520, field1243);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1243.read(field1242, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1242[0] & 0xFF) << 8) + (field1242[1] & 0xFF);
						int var14 = ((field1242[2] & 0xFF) << 8) + (field1242[3] & 0xFF);
						var10 = (field1242[6] & 0xFF) + ((field1242[4] & 0xFF) << 16) + ((field1242[5] & 0xFF) << 8);
						int var15 = field1242[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field1245 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1243.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field1243.length() + 519L) / 520L);
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

				field1242[0] = (byte) (arg1 >> 8);
				field1242[1] = (byte) arg1;
				field1242[2] = (byte) (var9 >> 8);
				field1242[3] = (byte) var9;
				field1242[4] = (byte) (var10 >> 16);
				field1242[5] = (byte) (var10 >> 8);
				field1242[6] = (byte) var10;
				field1242[7] = (byte) field1245;
				method433(var7 * 520, field1243);
				field1243.write(field1242, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1243.write(arg2, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("TUZTEZTO.a(IILjava/io/RandomAccessFile;)V")
	public synchronized void method433(int arg0, RandomAccessFile arg1) throws IOException {
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
