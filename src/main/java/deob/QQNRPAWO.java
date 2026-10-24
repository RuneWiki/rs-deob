package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("QQNRPAWO")
public final class QQNRPAWO {

	@ObfuscatedName("QQNRPAWO.h")
	public int field1247 = 65000;

	@ObfuscatedName("QQNRPAWO.g")
	public int field1246;

	@ObfuscatedName("QQNRPAWO.e")
	public RandomAccessFile field1244;

	@ObfuscatedName("QQNRPAWO.f")
	public RandomAccessFile field1245;

	@ObfuscatedName("QQNRPAWO.c")
	public static byte[] field1243 = new byte[520];

	public QQNRPAWO(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3) {
		field1246 = arg1;
		field1244 = arg3;
		field1245 = arg0;
		field1247 = arg2;
	}

	@ObfuscatedName("QQNRPAWO.a(II)[B")
	public synchronized byte[] method488(int arg0) {
		try {
			method491(arg0 * 6, field1245);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1245.read(field1243, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1243[2] & 0xFF) + ((field1243[0] & 0xFF) << 16) + ((field1243[1] & 0xFF) << 8);
			int var5 = (field1243[5] & 0xFF) + ((field1243[3] & 0xFF) << 16) + ((field1243[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1247) {
				if (var5 > 0 && var5 <= field1244.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method491(var5 * 520, field1244);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1244.read(field1243, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1243[0] & 0xFF) << 8) + (field1243[1] & 0xFF);
						int var13 = ((field1243[2] & 0xFF) << 8) + (field1243[3] & 0xFF);
						int var14 = (field1243[6] & 0xFF) + ((field1243[4] & 0xFF) << 16) + ((field1243[5] & 0xFF) << 8);
						int var15 = field1243[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1246 == var15) {
							if (var14 >= 0 && var14 <= field1244.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1243[var16 + 8];
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

	@ObfuscatedName("QQNRPAWO.a(III[B)Z")
	public synchronized boolean method489(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method490(arg1, true, arg0, arg2);
		if (!var4) {
			var4 = method490(arg1, false, arg0, arg2);
		}

		return var4;
	}

	@ObfuscatedName("QQNRPAWO.a(IIZI[B)Z")
	public synchronized boolean method490(int arg0, boolean arg1, int arg2, byte[] arg3) {
		try {
			int var7;
			if (arg1) {
				method491(arg2 * 6, field1245);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1245.read(field1243, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1243[5] & 0xFF) + ((field1243[3] & 0xFF) << 16) + ((field1243[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1244.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1244.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1243[0] = (byte) (arg0 >> 16);
			field1243[1] = (byte) (arg0 >> 8);
			field1243[2] = (byte) arg0;
			field1243[3] = (byte) (var7 >> 16);
			field1243[4] = (byte) (var7 >> 8);
			field1243[5] = (byte) var7;
			method491(arg2 * 6, field1245);
			field1245.write(field1243, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg0) {
				int var10 = 0;
				if (arg1) {
					method491(var7 * 520, field1244);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1244.read(field1243, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1243[0] & 0xFF) << 8) + (field1243[1] & 0xFF);
						int var14 = ((field1243[2] & 0xFF) << 8) + (field1243[3] & 0xFF);
						var10 = (field1243[6] & 0xFF) + ((field1243[4] & 0xFF) << 16) + ((field1243[5] & 0xFF) << 8);
						int var15 = field1243[7] & 0xFF;
						if (arg2 != var13 || var9 != var14 || field1246 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1244.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg1 = false;
					var10 = (int) ((field1244.length() + 519L) / 520L);
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

				field1243[0] = (byte) (arg2 >> 8);
				field1243[1] = (byte) arg2;
				field1243[2] = (byte) (var9 >> 8);
				field1243[3] = (byte) var9;
				field1243[4] = (byte) (var10 >> 16);
				field1243[5] = (byte) (var10 >> 8);
				field1243[6] = (byte) var10;
				field1243[7] = (byte) field1246;
				method491(var7 * 520, field1244);
				field1244.write(field1243, 0, 8);
				int var16 = arg0 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1244.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("QQNRPAWO.a(IILjava/io/RandomAccessFile;)V")
	public synchronized void method491(int arg0, RandomAccessFile arg1) throws IOException {
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
