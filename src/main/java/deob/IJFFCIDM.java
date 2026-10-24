package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("IJFFCIDM")
public final class IJFFCIDM {

	@ObfuscatedName("IJFFCIDM.f")
	public int field809 = 65000;

	@ObfuscatedName("IJFFCIDM.e")
	public int field808;

	@ObfuscatedName("IJFFCIDM.c")
	public RandomAccessFile field806;

	@ObfuscatedName("IJFFCIDM.d")
	public RandomAccessFile field807;

	@ObfuscatedName("IJFFCIDM.b")
	public static byte[] field805 = new byte[520];

	public IJFFCIDM(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3) {
		field808 = arg3;
		field806 = arg2;
		field807 = arg1;
		field809 = arg0;
	}

	@ObfuscatedName("IJFFCIDM.a(ZI)[B")
	public synchronized byte[] method252(int arg0) {
		try {
			method255(arg0 * 6, field807);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field807.read(field805, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field805[2] & 0xFF) + ((field805[0] & 0xFF) << 16) + ((field805[1] & 0xFF) << 8);
			int var5 = (field805[5] & 0xFF) + ((field805[3] & 0xFF) << 16) + ((field805[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field809) {
				if (var5 > 0 && var5 <= field806.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method255(var5 * 520, field806);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field806.read(field805, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field805[0] & 0xFF) << 8) + (field805[1] & 0xFF);
						int var13 = ((field805[2] & 0xFF) << 8) + (field805[3] & 0xFF);
						int var14 = (field805[6] & 0xFF) + ((field805[4] & 0xFF) << 16) + ((field805[5] & 0xFF) << 8);
						int var15 = field805[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field808 == var15) {
							if (var14 >= 0 && var14 <= field806.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field805[var16 + 8];
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

	@ObfuscatedName("IJFFCIDM.a(IB[BI)Z")
	public synchronized boolean method253(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method254(arg2, arg1, true, arg0);
		if (!var4) {
			var4 = method254(arg2, arg1, false, arg0);
		}

		return var4;
	}

	@ObfuscatedName("IJFFCIDM.a(I[BZII)Z")
	public synchronized boolean method254(int arg0, byte[] arg1, boolean arg2, int arg3) {
		try {
			int var7;
			if (arg2) {
				method255(arg0 * 6, field807);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field807.read(field805, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field805[5] & 0xFF) + ((field805[3] & 0xFF) << 16) + ((field805[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field806.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field806.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field805[0] = (byte) (arg3 >> 16);
			field805[1] = (byte) (arg3 >> 8);
			field805[2] = (byte) arg3;
			field805[3] = (byte) (var7 >> 16);
			field805[4] = (byte) (var7 >> 8);
			field805[5] = (byte) var7;
			method255(arg0 * 6, field807);
			field807.write(field805, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg2) {
					method255(var7 * 520, field806);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field806.read(field805, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field805[0] & 0xFF) << 8) + (field805[1] & 0xFF);
						int var14 = ((field805[2] & 0xFF) << 8) + (field805[3] & 0xFF);
						var10 = (field805[6] & 0xFF) + ((field805[4] & 0xFF) << 16) + ((field805[5] & 0xFF) << 8);
						int var15 = field805[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field808 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field806.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field806.length() + 519L) / 520L);
					if (var10 == 0) {
						var10++;
					}

					if (var7 == var10) {
						var10++;
					}
				}

				if (arg3 - var8 <= 512) {
					var10 = 0;
				}

				field805[0] = (byte) (arg0 >> 8);
				field805[1] = (byte) arg0;
				field805[2] = (byte) (var9 >> 8);
				field805[3] = (byte) var9;
				field805[4] = (byte) (var10 >> 16);
				field805[5] = (byte) (var10 >> 8);
				field805[6] = (byte) var10;
				field805[7] = (byte) field808;
				method255(var7 * 520, field806);
				field806.write(field805, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field806.write(arg1, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("IJFFCIDM.a(IILjava/io/RandomAccessFile;)V")
	public synchronized void method255(int arg0, RandomAccessFile arg1) throws IOException {
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
