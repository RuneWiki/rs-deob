package deob;

import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("RRDZGTNX")
public final class RRDZGTNX {

	@ObfuscatedName("RRDZGTNX.h")
	public int field1217 = 65000;

	@ObfuscatedName("RRDZGTNX.g")
	public int field1216;

	@ObfuscatedName("RRDZGTNX.e")
	public RandomAccessFile field1214;

	@ObfuscatedName("RRDZGTNX.f")
	public RandomAccessFile field1215;

	@ObfuscatedName("RRDZGTNX.d")
	public static byte[] field1213 = new byte[520];

	public RRDZGTNX(int arg0, RandomAccessFile arg1, RandomAccessFile arg2, int arg3) {
		field1216 = arg0;
		field1214 = arg1;
		field1215 = arg2;
		field1217 = arg3;
	}

	@ObfuscatedName("RRDZGTNX.a(IB)[B")
	public synchronized byte[] method446(int arg0) {
		try {
			method449(arg0 * 6, field1215);
			int var3;
			for (int var2 = 0; var2 < 6; var2 += var3) {
				var3 = field1215.read(field1213, var2, 6 - var2);
				if (var3 == -1) {
					return null;
				}
			}

			int var4 = (field1213[2] & 0xFF) + ((field1213[0] & 0xFF) << 16) + ((field1213[1] & 0xFF) << 8);
			int var5 = (field1213[5] & 0xFF) + ((field1213[3] & 0xFF) << 16) + ((field1213[4] & 0xFF) << 8);
			if (var4 >= 0 && var4 <= field1217) {
				if (var5 > 0 && var5 <= field1214.length() / 520L) {
					byte[] var6 = new byte[var4];
					int var7 = 0;
					int var8 = 0;
					while (var7 < var4) {
						if (var5 == 0) {
							return null;
						}

						method449(var5 * 520, field1214);
						int var9 = 0;
						int var10 = var4 - var7;
						if (var10 > 512) {
							var10 = 512;
						}

						while (var9 < var10 + 8) {
							int var11 = field1214.read(field1213, var9, var10 + 8 - var9);
							if (var11 == -1) {
								return null;
							}

							var9 += var11;
						}

						int var12 = ((field1213[0] & 0xFF) << 8) + (field1213[1] & 0xFF);
						int var13 = ((field1213[2] & 0xFF) << 8) + (field1213[3] & 0xFF);
						int var14 = (field1213[6] & 0xFF) + ((field1213[4] & 0xFF) << 16) + ((field1213[5] & 0xFF) << 8);
						int var15 = field1213[7] & 0xFF;
						if (arg0 == var12 && var8 == var13 && field1216 == var15) {
							if (var14 >= 0 && var14 <= field1214.length() / 520L) {
								for (int var16 = 0; var16 < var10; var16++) {
									var6[var7++] = field1213[var16 + 8];
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

	@ObfuscatedName("RRDZGTNX.a(IB[BI)Z")
	public synchronized boolean method447(int arg0, byte[] arg1, int arg2) {
		boolean var4 = method448(arg1, arg0, true, arg2);
		if (!var4) {
			var4 = method448(arg1, arg0, false, arg2);
		}

		return var4;
	}

	@ObfuscatedName("RRDZGTNX.a([BIZII)Z")
	public synchronized boolean method448(byte[] arg0, int arg1, boolean arg2, int arg3) {
		try {
			int var7;
			if (arg2) {
				method449(arg1 * 6, field1215);
				int var6;
				for (int var5 = 0; var5 < 6; var5 += var6) {
					var6 = field1215.read(field1213, var5, 6 - var5);
					if (var6 == -1) {
						return false;
					}
				}

				var7 = (field1213[5] & 0xFF) + ((field1213[3] & 0xFF) << 16) + ((field1213[4] & 0xFF) << 8);
				if (var7 <= 0 || var7 > field1214.length() / 520L) {
					return false;
				}
			} else {
				var7 = (int) ((field1214.length() + 519L) / 520L);
				if (var7 == 0) {
					var7 = 1;
				}
			}

			field1213[0] = (byte) (arg3 >> 16);
			field1213[1] = (byte) (arg3 >> 8);
			field1213[2] = (byte) arg3;
			field1213[3] = (byte) (var7 >> 16);
			field1213[4] = (byte) (var7 >> 8);
			field1213[5] = (byte) var7;
			method449(arg1 * 6, field1215);
			field1215.write(field1213, 0, 6);
			int var8 = 0;
			int var9 = 0;
			while (var8 < arg3) {
				int var10 = 0;
				if (arg2) {
					method449(var7 * 520, field1214);
					int var11;
					int var12;
					for (var11 = 0; var11 < 8; var11 += var12) {
						var12 = field1214.read(field1213, var11, 8 - var11);
						if (var12 == -1) {
							break;
						}
					}

					if (var11 == 8) {
						int var13 = ((field1213[0] & 0xFF) << 8) + (field1213[1] & 0xFF);
						int var14 = ((field1213[2] & 0xFF) << 8) + (field1213[3] & 0xFF);
						var10 = (field1213[6] & 0xFF) + ((field1213[4] & 0xFF) << 16) + ((field1213[5] & 0xFF) << 8);
						int var15 = field1213[7] & 0xFF;
						if (arg1 != var13 || var9 != var14 || field1216 != var15) {
							return false;
						}

						if (var10 < 0 || var10 > field1214.length() / 520L) {
							return false;
						}
					}
				}

				if (var10 == 0) {
					arg2 = false;
					var10 = (int) ((field1214.length() + 519L) / 520L);
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

				field1213[0] = (byte) (arg1 >> 8);
				field1213[1] = (byte) arg1;
				field1213[2] = (byte) (var9 >> 8);
				field1213[3] = (byte) var9;
				field1213[4] = (byte) (var10 >> 16);
				field1213[5] = (byte) (var10 >> 8);
				field1213[6] = (byte) var10;
				field1213[7] = (byte) field1216;
				method449(var7 * 520, field1214);
				field1214.write(field1213, 0, 8);
				int var16 = arg3 - var8;
				if (var16 > 512) {
					var16 = 512;
				}

				field1214.write(arg0, var8, var16);
				var8 += var16;
				var7 = var10;
				var9++;
			}

			return true;
		} catch (IOException var17) {
			return false;
		}
	}

	@ObfuscatedName("RRDZGTNX.a(BILjava/io/RandomAccessFile;)V")
	public synchronized void method449(int arg0, RandomAccessFile arg1) throws IOException {
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
