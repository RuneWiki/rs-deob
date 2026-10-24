package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("JFFVPFLB")
public final class JFFVPFLB {

	@ObfuscatedName("JFFVPFLB.f")
	public int field1043 = 65000;

	@ObfuscatedName("JFFVPFLB.e")
	public int field1042;

	@ObfuscatedName("JFFVPFLB.c")
	public RandomAccessFile field1040;

	@ObfuscatedName("JFFVPFLB.d")
	public RandomAccessFile field1041;

	@ObfuscatedName("JFFVPFLB.b")
	public static byte[] field1039 = new byte[520];

	public JFFVPFLB(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3) {
		field1042 = arg3;
		field1040 = arg1;
		field1041 = arg2;
		field1043 = arg0;
	}

	@ObfuscatedName("JFFVPFLB.a(II)[B")
	public synchronized byte[] method351(int arg0) {
		try {
			method354(field1041, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1041.read(field1039, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1039[2] & 0xFF) + ((field1039[0] & 0xFF) << 16) + ((field1039[1] & 0xFF) << 8);
			int var5 = (field1039[5] & 0xFF) + ((field1039[3] & 0xFF) << 16) + ((field1039[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1043) {
				if (var5 > 0 && var5 <= field1040.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method354(field1040, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1040.read(field1039, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1039[0] & 0xFF) << 8) + (field1039[1] & 0xFF);
						int var13 = ((field1039[2] & 0xFF) << 8) + (field1039[3] & 0xFF);
						int var14 = (field1039[6] & 0xFF) + ((field1039[4] & 0xFF) << 16) + ((field1039[5] & 0xFF) << 8);
						int var15 = field1039[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1042 == var15) {
							if (var14 >= 0 && var14 <= field1040.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1039[var16 + 8];
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

	@ObfuscatedName("JFFVPFLB.a(IIB[B)Z")
	public synchronized boolean method352(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method353(arg0, true, arg1, arg2);
		if (!var4) {
			var4 = method353(arg0, false, arg1, arg2);
		}

		return var4;
	}

	@ObfuscatedName("JFFVPFLB.a(IZIB[B)Z")
	public synchronized boolean method353(int arg0, boolean arg1, int arg2, byte[] arg3) {
		try {
			int var7;
			if (arg1) {
				method354(field1041, arg0 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1041.read(field1039, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1039[5] & 0xFF) + ((field1039[3] & 0xFF) << 16) + ((field1039[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1040.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1040.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1039[0] = (byte) (arg2 >> 16);
			field1039[1] = (byte) (arg2 >> 8);
			field1039[2] = (byte) arg2;
			field1039[3] = (byte) (var7 >> 16);
			field1039[4] = (byte) (var7 >> 8);
			field1039[5] = (byte) var7;
			method354(field1041, arg0 * 6);
			field1041.write(field1039, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg2) {
				int var10 = 0;
				if (arg1) {
					method354(field1040, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1040.read(field1039, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1039[0] & 0xFF) << 8) + (field1039[1] & 0xFF);
						int var14 = ((field1039[2] & 0xFF) << 8) + (field1039[3] & 0xFF);
						var10 = (field1039[6] & 0xFF) + ((field1039[4] & 0xFF) << 16) + ((field1039[5] & 0xFF) << 8);
						int var15 = field1039[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field1042 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1040.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg1 = false;
					var10 = (int) ((field1040.length() + 519L) / 520L);
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

				field1039[0] = (byte) (arg0 >> 8);
				field1039[1] = (byte) arg0;
				field1039[2] = (byte) (var9 >> 8);
				field1039[3] = (byte) var9;
				field1039[4] = (byte) (var10 >> 16);
				field1039[5] = (byte) (var10 >> 8);
				field1039[6] = (byte) var10;
				field1039[7] = (byte) field1042;
				method354(field1040, var7 * 520);
				field1040.write(field1039, 0, 8);
				int var16 = arg2 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1040.write(arg3, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("JFFVPFLB.a(Ljava/io/RandomAccessFile;II)V")
	public synchronized void method354(RandomAccessFile arg0, int arg1) throws IOException {
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
