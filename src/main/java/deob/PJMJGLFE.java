package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("PJMJGLFE")
public final class PJMJGLFE {

	@ObfuscatedName("PJMJGLFE.g")
	public int field1113 = 65000;

	@ObfuscatedName("PJMJGLFE.f")
	public int field1112;

	@ObfuscatedName("PJMJGLFE.d")
	public RandomAccessFile field1110;

	@ObfuscatedName("PJMJGLFE.e")
	public RandomAccessFile field1111;

	@ObfuscatedName("PJMJGLFE.c")
	public static byte[] field1109 = new byte[520];

	public PJMJGLFE(int arg0, RandomAccessFile arg1, int arg2, RandomAccessFile arg3) {
		field1112 = arg2;
		field1110 = arg3;
		field1111 = arg1;
		field1113 = arg0;
	}

	@ObfuscatedName("PJMJGLFE.a(II)[B")
	public synchronized byte[] method459(int arg0) {
		try {
			method462(arg0 * 6, field1111);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1111.read(field1109, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1109[2] & 0xFF) + ((field1109[0] & 0xFF) << 16) + ((field1109[1] & 0xFF) << 8);
			int var5 = (field1109[5] & 0xFF) + ((field1109[3] & 0xFF) << 16) + ((field1109[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1113) {
				if (var5 > 0 && var5 <= field1110.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method462(var5 * 520, field1110);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1110.read(field1109, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1109[0] & 0xFF) << 8) + (field1109[1] & 0xFF);
						int var13 = ((field1109[2] & 0xFF) << 8) + (field1109[3] & 0xFF);
						int var14 = (field1109[6] & 0xFF) + ((field1109[4] & 0xFF) << 16) + ((field1109[5] & 0xFF) << 8);
						int var15 = field1109[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1112 == var15) {
							if (var14 >= 0 && var14 <= field1110.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1109[var16 + 8];
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

	@ObfuscatedName("PJMJGLFE.a(II[BZ)Z")
	public synchronized boolean method460(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method461(arg1, arg0, true, arg2);
		if (!var4) {
			var4 = method461(arg1, arg0, false, arg2);
		}

		return var4;
	}

	@ObfuscatedName("PJMJGLFE.a(IIIZ[B)Z")
	public synchronized boolean method461(int arg0, int arg1, boolean arg2, byte[] arg3) {
		try {
			int var7;
			if (arg2) {
				method462(arg1 * 6, field1111);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1111.read(field1109, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1109[5] & 0xFF) + ((field1109[3] & 0xFF) << 16) + ((field1109[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1110.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1110.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1109[0] = (byte) (arg0 >> 16);
			field1109[1] = (byte) (arg0 >> 8);
			field1109[2] = (byte) arg0;
			field1109[3] = (byte) (var7 >> 16);
			field1109[4] = (byte) (var7 >> 8);
			field1109[5] = (byte) var7;
			method462(arg1 * 6, field1111);
			field1111.write(field1109, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg2) {
					method462(var7 * 520, field1110);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1110.read(field1109, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1109[0] & 0xFF) << 8) + (field1109[1] & 0xFF);
						int var14 = ((field1109[2] & 0xFF) << 8) + (field1109[3] & 0xFF);
						var10 = (field1109[6] & 0xFF) + ((field1109[4] & 0xFF) << 16) + ((field1109[5] & 0xFF) << 8);
						int var15 = field1109[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field1112 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1110.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field1110.length() + 519L) / 520L);
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

				field1109[0] = (byte) (arg1 >> 8);
				field1109[1] = (byte) arg1;
				field1109[2] = (byte) (var9 >> 8);
				field1109[3] = (byte) var9;
				field1109[4] = (byte) (var10 >> 16);
				field1109[5] = (byte) (var10 >> 8);
				field1109[6] = (byte) var10;
				field1109[7] = (byte) field1112;
				method462(var7 * 520, field1110);
				field1110.write(field1109, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1110.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("PJMJGLFE.a(ILjava/io/RandomAccessFile;I)V")
	public synchronized void method462(int arg0, RandomAccessFile arg1) throws IOException {
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
