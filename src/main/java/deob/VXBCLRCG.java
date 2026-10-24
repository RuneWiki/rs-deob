package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("VXBCLRCG")
public final class VXBCLRCG {

	@ObfuscatedName("VXBCLRCG.h")
	public int field1320 = 65000;

	@ObfuscatedName("VXBCLRCG.g")
	public int field1319;

	@ObfuscatedName("VXBCLRCG.e")
	public RandomAccessFile field1317;

	@ObfuscatedName("VXBCLRCG.f")
	public RandomAccessFile field1318;

	@ObfuscatedName("VXBCLRCG.c")
	public static byte[] field1316 = new byte[520];

	public VXBCLRCG(RandomAccessFile arg0, int arg1, int arg2, RandomAccessFile arg3) {
		field1319 = arg1;
		field1317 = arg3;
		field1318 = arg0;
		field1320 = arg2;
	}

	@ObfuscatedName("VXBCLRCG.a(BI)[B")
	public synchronized byte[] method529(int arg0) {
		try {
			method532(field1318, arg0 * 6);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1318.read(field1316, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1316[2] & 0xFF) + ((field1316[0] & 0xFF) << 16) + ((field1316[1] & 0xFF) << 8);
			int var5 = (field1316[5] & 0xFF) + ((field1316[3] & 0xFF) << 16) + ((field1316[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1320) {
				if (var5 > 0 && var5 <= field1317.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method532(field1317, var5 * 520);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1317.read(field1316, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1316[0] & 0xFF) << 8) + (field1316[1] & 0xFF);
						int var13 = ((field1316[2] & 0xFF) << 8) + (field1316[3] & 0xFF);
						int var14 = (field1316[6] & 0xFF) + ((field1316[4] & 0xFF) << 16) + ((field1316[5] & 0xFF) << 8);
						int var15 = field1316[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1319 == var15) {
							if (var14 >= 0 && var14 <= field1317.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1316[var16 + 8];
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

	@ObfuscatedName("VXBCLRCG.a(II[BI)Z")
	public synchronized boolean method530(int arg0, int arg1, byte[] arg2) {
		boolean var4 = method531(arg0, true, arg2, arg1);
		if (!var4) {
			var4 = method531(arg0, false, arg2, arg1);
		}

		return var4;
	}

	@ObfuscatedName("VXBCLRCG.a(IIZ[BI)Z")
	public synchronized boolean method531(int arg0, boolean arg1, byte[] arg2, int arg3) {
		try {
			int var7;
			if (arg1) {
				method532(field1318, arg0 * 6);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1318.read(field1316, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1316[5] & 0xFF) + ((field1316[3] & 0xFF) << 16) + ((field1316[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1317.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1317.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1316[0] = (byte) (arg3 >> 16);
			field1316[1] = (byte) (arg3 >> 8);
			field1316[2] = (byte) arg3;
			field1316[3] = (byte) (var7 >> 16);
			field1316[4] = (byte) (var7 >> 8);
			field1316[5] = (byte) var7;
			method532(field1318, arg0 * 6);
			field1318.write(field1316, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg1) {
					method532(field1317, var7 * 520);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1317.read(field1316, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1316[0] & 0xFF) << 8) + (field1316[1] & 0xFF);
						int var14 = ((field1316[2] & 0xFF) << 8) + (field1316[3] & 0xFF);
						var10 = (field1316[6] & 0xFF) + ((field1316[4] & 0xFF) << 16) + ((field1316[5] & 0xFF) << 8);
						int var15 = field1316[7] & 0xFF;
						if (arg0 != var13 || var9 != var14 || field1319 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1317.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg1 = false;
					var10 = (int) ((field1317.length() + 519L) / 520L);
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

				field1316[0] = (byte) (arg0 >> 8);
				field1316[1] = (byte) arg0;
				field1316[2] = (byte) (var9 >> 8);
				field1316[3] = (byte) var9;
				field1316[4] = (byte) (var10 >> 16);
				field1316[5] = (byte) (var10 >> 8);
				field1316[6] = (byte) var10;
				field1316[7] = (byte) field1319;
				method532(field1317, var7 * 520);
				field1317.write(field1316, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1317.write(arg2, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("VXBCLRCG.a(Ljava/io/RandomAccessFile;ZI)V")
	public synchronized void method532(RandomAccessFile arg0, int arg1) throws IOException {
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
