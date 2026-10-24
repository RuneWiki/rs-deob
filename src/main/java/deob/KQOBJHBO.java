package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("KQOBJHBO")
public final class KQOBJHBO {

	@ObfuscatedName("KQOBJHBO.f")
	public int field791 = 65000;

	@ObfuscatedName("KQOBJHBO.e")
	public int field790;

	@ObfuscatedName("KQOBJHBO.c")
	public RandomAccessFile field788;

	@ObfuscatedName("KQOBJHBO.d")
	public RandomAccessFile field789;

	@ObfuscatedName("KQOBJHBO.b")
	public static byte[] field787 = new byte[520];

	public KQOBJHBO(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3) {
		field790 = arg0;
		field788 = arg1;
		field789 = arg2;
		field791 = arg3;
	}

	@ObfuscatedName("KQOBJHBO.a(II)[B")
	public synchronized byte[] method356(int arg0) {
		try {
			method359(field789, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field789.read(field787, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field787[2] & 0xFF) + ((field787[0] & 0xFF) << 16) + ((field787[1] & 0xFF) << 8);
			int var5 = (field787[5] & 0xFF) + ((field787[3] & 0xFF) << 16) + ((field787[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field791) {
				if (var5 > 0 && var5 <= field788.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method359(field788, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field788.read(field787, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field787[0] & 0xFF) << 8) + (field787[1] & 0xFF);
						int var13 = ((field787[2] & 0xFF) << 8) + (field787[3] & 0xFF);
						int var14 = (field787[6] & 0xFF) + ((field787[4] & 0xFF) << 16) + ((field787[5] & 0xFF) << 8);
						int var15 = field787[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field790 == var15) {
							if (var14 >= 0 && var14 <= field788.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field787[var16 + 8];
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

	@ObfuscatedName("KQOBJHBO.a([BIII)Z")
	public synchronized boolean method357(byte[] arg0, int arg1, int arg2) {
		boolean var4 = method358(arg1, arg2, arg0, true);
		if (!var4) {
			var4 = method358(arg1, arg2, arg0, false);
		}

		return var4;
	}

	@ObfuscatedName("KQOBJHBO.a(III[BZ)Z")
	public synchronized boolean method358(int arg0, int arg1, byte[] arg2, boolean arg3) {
		try {
			int var7;
			if (arg3) {
				method359(field789, arg0 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field789.read(field787, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field787[5] & 0xFF) + ((field787[3] & 0xFF) << 16) + ((field787[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field788.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field788.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field787[0] = (byte) (arg1 >> 16);
			field787[1] = (byte) (arg1 >> 8);
			field787[2] = (byte) arg1;
			field787[3] = (byte) (var7 >> 16);
			field787[4] = (byte) (var7 >> 8);
			field787[5] = (byte) var7;
			method359(field789, arg0 * 6);
			field789.write(field787, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg1) {
				int var10 = 0;
				if (arg3) {
					method359(field788, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field788.read(field787, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field787[0] & 0xFF) << 8) + (field787[1] & 0xFF);
						int var14 = ((field787[2] & 0xFF) << 8) + (field787[3] & 0xFF);
						var10 = (field787[6] & 0xFF) + ((field787[4] & 0xFF) << 16) + ((field787[5] & 0xFF) << 8);
						int var15 = field787[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field790 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field788.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg3 = false;
					var10 = (int) ((field788.length() + 519L) / 520L);
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

				field787[0] = (byte) (arg0 >> 8);
				field787[1] = (byte) arg0;
				field787[2] = (byte) (var9 >> 8);
				field787[3] = (byte) var9;
				field787[4] = (byte) (var10 >> 16);
				field787[5] = (byte) (var10 >> 8);
				field787[6] = (byte) var10;
				field787[7] = (byte) field790;
				method359(field788, var7 * 520);
				field788.write(field787, 0, 8);
				int var16 = arg1 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field788.write(arg2, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("KQOBJHBO.a(Ljava/io/RandomAccessFile;II)V")
	public synchronized void method359(RandomAccessFile arg0, int arg1) throws IOException {
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
