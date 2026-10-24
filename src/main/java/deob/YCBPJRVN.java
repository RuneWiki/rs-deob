package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("YCBPJRVN")
public class YCBPJRVN extends COHBYAZD implements Runnable {

	@ObfuscatedName("YCBPJRVN.c")
	public PUBJBHOK field1290 = new PUBJBHOK();

	@ObfuscatedName("YCBPJRVN.e")
	public PUBJBHOK field1292 = new PUBJBHOK();

	@ObfuscatedName("YCBPJRVN.g")
	public byte[][] field1294 = new byte[4][];

	@ObfuscatedName("YCBPJRVN.h")
	public PUBJBHOK field1295 = new PUBJBHOK();

	@ObfuscatedName("YCBPJRVN.i")
	public int[][] field1296 = new int[4][];

	@ObfuscatedName("YCBPJRVN.n")
	public byte[] field1299 = new byte[65000];

	@ObfuscatedName("YCBPJRVN.p")
	public PUBJBHOK field1301 = new PUBJBHOK();

	@ObfuscatedName("YCBPJRVN.u")
	public boolean field1306 = false;

	@ObfuscatedName("YCBPJRVN.A")
	public PUBJBHOK field1312 = new PUBJBHOK();

	@ObfuscatedName("YCBPJRVN.B")
	public SYRXWHZM field1313 = new SYRXWHZM();

	@ObfuscatedName("YCBPJRVN.H")
	public int[][] field1316 = new int[4][];

	@ObfuscatedName("YCBPJRVN.M")
	public byte[] field1321 = new byte[500];

	@ObfuscatedName("YCBPJRVN.N")
	public CRC32 field1322 = new CRC32();

	@ObfuscatedName("YCBPJRVN.R")
	public boolean field1326 = true;

	@ObfuscatedName("YCBPJRVN.S")
	public String field1327 = "";

	@ObfuscatedName("YCBPJRVN.f")
	public int field1293;

	@ObfuscatedName("YCBPJRVN.k")
	public int field1297;

	@ObfuscatedName("YCBPJRVN.q")
	public int field1302;

	@ObfuscatedName("YCBPJRVN.t")
	public int field1305;

	@ObfuscatedName("YCBPJRVN.v")
	public int field1307;

	@ObfuscatedName("YCBPJRVN.w")
	public int field1308;

	@ObfuscatedName("YCBPJRVN.z")
	public int field1311;

	@ObfuscatedName("YCBPJRVN.G")
	public int field1315;

	@ObfuscatedName("YCBPJRVN.I")
	public int field1317;

	@ObfuscatedName("YCBPJRVN.O")
	public int field1323;

	@ObfuscatedName("YCBPJRVN.P")
	public int field1324;

	@ObfuscatedName("YCBPJRVN.Q")
	public long field1325;

	@ObfuscatedName("YCBPJRVN.m")
	public JLWEKARN field1298;

	@ObfuscatedName("YCBPJRVN.L")
	public client field1320;

	@ObfuscatedName("YCBPJRVN.E")
	public InputStream field1314;

	@ObfuscatedName("YCBPJRVN.r")
	public OutputStream field1303;

	@ObfuscatedName("YCBPJRVN.s")
	public Socket field1304;

	@ObfuscatedName("YCBPJRVN.J")
	public byte[] field1318;

	@ObfuscatedName("YCBPJRVN.b")
	public int[] field1289;

	@ObfuscatedName("YCBPJRVN.d")
	public int[] field1291;

	@ObfuscatedName("YCBPJRVN.o")
	public int[] field1300;

	@ObfuscatedName("YCBPJRVN.x")
	public int[] field1309;

	@ObfuscatedName("YCBPJRVN.y")
	public int[] field1310;

	@ObfuscatedName("YCBPJRVN.K")
	public int[] field1319;

	@ObfuscatedName("YCBPJRVN.a(III)V")
	public final void method524(int arg0, int arg1) {
		if (field1320.field480[0] != null && (field1296[arg1][arg0] != 0 && (field1294[arg1][arg0] != 0 && field1293 != 0))) {
			JLWEKARN var3 = new JLWEKARN();
			var3.field687 = arg1;
			var3.field689 = arg0;
			var3.field686 = false;

			synchronized (field1312) {
				field1312.method373(var3);
			}
		}
	}

	@ObfuscatedName("YCBPJRVN.a(IBIB)V")
	public final void method525(int arg0, byte arg1, int arg2) {
		if (field1320.field480[0] != null && field1296[arg2][arg0] != 0) {
			byte[] var4 = field1320.field480[arg2 + 1].method520(arg0);
			if (!method539(var4, field1316[arg2][arg0], field1296[arg2][arg0])) {
				field1294[arg2][arg0] = arg1;

				if (arg1 > field1293) {
					field1293 = arg1;
				}

				field1297++;
			}
		}
	}

	@ObfuscatedName("YCBPJRVN.a(IZ)V")
	public final void method526(boolean arg0) {
		int var2 = field1300.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1291[var3] != 0) {
				method525(field1319[var3], (byte) 2, 3);
				method525(field1289[var3], (byte) 2, 3);
			}
		}
	}

	@ObfuscatedName("YCBPJRVN.a(Z)V")
	public final void method527() {
		try {
			int var1 = field1314.available();
			if (field1308 == 0 && var1 >= 6) {
				field1306 = true;

				for (int var2 = 0; var2 < 6; var2 += field1314.read(field1321, var2, 6 - var2)) {
				}

				int var3 = field1321[0] & 0xFF;
				int var4 = ((field1321[1] & 0xFF) << 8) + (field1321[2] & 0xFF);
				int var5 = ((field1321[3] & 0xFF) << 8) + (field1321[4] & 0xFF);
				int var6 = field1321[5] & 0xFF;
				field1298 = null;
				for (JLWEKARN var7 = (JLWEKARN) field1301.method376(); var7 != null; var7 = (JLWEKARN) field1301.method378()) {
					if (var7.field687 == var3 && var7.field689 == var4) {
						field1298 = var7;
					}

					if (field1298 != null) {
						var7.field685 = 0;
					}
				}

				if (field1298 != null) {
					field1317 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1298.field688 = null;

						if (field1298.field686) {
							synchronized (field1295) {
								field1295.method373(field1298);
							}
						} else {
							field1298.method492();
						}

						field1298 = null;
					} else {
						if (field1298.field688 == null && var6 == 0) {
							field1298.field688 = new byte[var5];
						}

						if (field1298.field688 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1307 = var6 * 500;
				field1308 = 500;
				if (field1308 > var5 - var6 * 500) {
					field1308 = var5 - var6 * 500;
				}
			}

			if (field1308 > 0 && var1 >= field1308) {
				field1306 = true;
				byte[] var9 = field1321;
				int var10 = 0;
				if (field1298 != null) {
					var9 = field1298.field688;
					var10 = field1307;
				}

				for (int var11 = 0; var11 < field1308; var11 += field1314.read(var9, var10 + var11, field1308 - var11)) {
				}

				if (field1308 + field1307 >= var9.length && field1298 != null) {
					if (field1320.field480[0] != null) {
						field1320.field480[field1298.field687 + 1].method521(field1298.field689, var9, var9.length);
					}

					if (!field1298.field686 && field1298.field687 == 3) {
						field1298.field686 = true;
						field1298.field687 = 93;
					}

					if (field1298.field686) {
						synchronized (field1295) {
							field1295.method373(field1298);
						}
					} else {
						field1298.method492();
					}
				}

				field1308 = 0;
			}
		} catch (IOException var17) {
			try {
				field1304.close();
			} catch (Exception var14) {
			}

			field1304 = null;
			field1314 = null;
			field1303 = null;
			field1308 = 0;
		}
	}

	@ObfuscatedName("YCBPJRVN.b(IZ)Z")
	public final boolean method528(int arg0) {
		if (field1310[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("YCBPJRVN.b(I)V")
	public final void method529() {
		JLWEKARN var2;
		synchronized (field1292) {
			var2 = (JLWEKARN) field1292.method375();
		}

		while (var2 != null) {
			field1306 = true;
			byte[] var3 = null;
			if (field1320.field480[0] != null) {
				var3 = field1320.field480[var2.field687 + 1].method520(var2.field689);
			}

			if (!method539(var3, field1316[var2.field687][var2.field689], field1296[var2.field687][var2.field689])) {
				var3 = null;
			}

			synchronized (field1292) {
				if (var3 == null) {
					field1290.method373(var2);
				} else {
					var2.field688 = var3;

					synchronized (field1295) {
						field1295.method373(var2);
					}
				}

				var2 = (JLWEKARN) field1292.method375();
			}
		}
	}

	@ObfuscatedName("YCBPJRVN.c(I)V")
	public final void method530() {
		while (field1323 == 0) {
			if (field1324 >= 10 || field1293 == 0) {
				return;
			}

			JLWEKARN var2;
			synchronized (field1312) {
				var2 = (JLWEKARN) field1312.method375();
			}

			while (var2 != null) {
				if (field1294[var2.field687][var2.field689] != 0) {
					field1294[var2.field687][var2.field689] = 0;
					field1301.method373(var2);
					method532(var2);
					field1306 = true;

					if (field1305 < field1297) {
						field1305++;
					}

					field1327 = "Loading extra files - " + field1305 * 100 / field1297 + "%";
					field1324++;
					if (field1324 == 10) {
						return;
					}
				}

				synchronized (field1312) {
					var2 = (JLWEKARN) field1312.method375();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1294[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1293) {
						var5[var7] = 0;
						JLWEKARN var8 = new JLWEKARN();
						var8.field687 = var4;
						var8.field689 = var7;
						var8.field686 = false;
						field1301.method373(var8);
						method532(var8);
						field1306 = true;

						if (field1305 < field1297) {
							field1305++;
						}

						field1327 = "Loading extra files - " + field1305 * 100 / field1297 + "%";
						field1324++;
						if (field1324 == 10) {
							return;
						}
					}
				}
			}

			field1293--;
		}
	}

	@ObfuscatedName("YCBPJRVN.a(IIIB)I")
	public final int method531(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field1300.length; var5++) {
			if (field1300[var5] == var4) {
				if (arg1 == 0) {
					return field1289[var5];
				}

				return field1319[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("YCBPJRVN.a(LJLWEKARN;Z)V")
	public final void method532(JLWEKARN arg0) {
		try {
			if (field1304 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1325 < 4000L) {
					return;
				}

				field1325 = var2;
				field1304 = field1320.method57(client.field338 + 43594);
				field1314 = field1304.getInputStream();
				field1303 = field1304.getOutputStream();
				field1303.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1314.read();
				}

				field1317 = 0;
			}

			field1321[0] = (byte) arg0.field687;
			field1321[1] = (byte) (arg0.field689 >> 8);
			field1321[2] = (byte) arg0.field689;
			if (arg0.field686) {
				field1321[3] = 2;
			} else if (field1320.field95) {
				field1321[3] = 0;
			} else {
				field1321[3] = 1;
			}

			field1303.write(field1321, 0, 4);
			field1315 = 0;
			field1311 = -10000;
		} catch (IOException var7) {
			try {
				field1304.close();
			} catch (Exception var6) {
			}

			field1304 = null;
			field1314 = null;
			field1303 = null;
			field1308 = 0;
			field1311++;
		}
	}

	public final void run() {
		try {
			while (field1326) {
				field1302++;
				byte var1 = 20;
				if (field1293 == 0 && field1320.field480[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1306 = true;
				for (int var2 = 0; var2 < 100 && field1306; var2++) {
					field1306 = false;
					method529();
					method544();

					if (field1323 == 0 && var2 >= 5) {
						break;
					}

					method530();

					if (field1314 != null) {
						method527();
					}
				}

				boolean var3 = false;
				for (JLWEKARN var4 = (JLWEKARN) field1301.method376(); var4 != null; var4 = (JLWEKARN) field1301.method378()) {
					if (var4.field686) {
						var3 = true;
						var4.field685++;
						if (var4.field685 > 50) {
							var4.field685 = 0;
							method532(var4);
						}
					}
				}

				if (!var3) {
					for (JLWEKARN var5 = (JLWEKARN) field1301.method376(); var5 != null; var5 = (JLWEKARN) field1301.method378()) {
						var3 = true;
						var5.field685++;
						if (var5.field685 > 50) {
							var5.field685 = 0;
							method532(var5);
						}
					}
				}

				if (var3) {
					field1317++;
					if (field1317 > 750) {
						try {
							field1304.close();
						} catch (Exception var8) {
						}

						field1304 = null;
						field1314 = null;
						field1303 = null;
						field1308 = 0;
					}
				} else {
					field1317 = 0;
					field1327 = "";
				}

				if (field1320.field95 && field1304 != null && field1303 != null && (field1293 > 0 || field1320.field480[0] == null)) {
					field1315++;
					if (field1315 > 500) {
						field1315 = 0;
						field1321[0] = 0;
						field1321[1] = 0;
						field1321[2] = 0;
						field1321[3] = 10;
						try {
							field1303.write(field1321, 0, 4);
						} catch (IOException var7) {
							field1317 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("YCBPJRVN.a(I)V")
	public final void method164(int arg0) {
		method533(0, arg0);
	}

	@ObfuscatedName("YCBPJRVN.a(II)V")
	public final void method533(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1296.length && arg1 >= 0 && arg1 <= field1296[arg0].length && field1296[arg0][arg1] != 0) {
			synchronized (field1313) {
				for (JLWEKARN var4 = (JLWEKARN) field1313.method483(); var4 != null; var4 = (JLWEKARN) field1313.method484()) {
					if (var4.field687 == arg0 && var4.field689 == arg1) {
						return;
					}
				}

				JLWEKARN var5 = new JLWEKARN();
				var5.field687 = arg0;
				var5.field689 = arg1;
				var5.field686 = true;

				synchronized (field1292) {
					field1292.method373(var5);
				}

				field1313.method481(var5);
			}
		}
	}

	@ObfuscatedName("YCBPJRVN.a()LJLWEKARN;")
	public final JLWEKARN method534() {
		JLWEKARN var2;
		synchronized (field1295) {
			var2 = (JLWEKARN) field1295.method375();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1313) {
			var2.method545();
		}

		if (var2.field688 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field688));
			while (true) {
				if (field1299.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1299, var4, field1299.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field688 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field688[var7] = field1299[var7];
		}

		return var2;
	}

	@ObfuscatedName("YCBPJRVN.b(II)I")
	public final int method535(int arg0) {
		return field1296[arg0].length;
	}

	@ObfuscatedName("YCBPJRVN.a(LCXFTMSCH;Lclient;)V")
	public final void method536(CXFTMSCH arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method176(var3[var4], null);
			int var6 = var5.length / 2;
			MQZHAILV var7 = new MQZHAILV(var5);
			field1296[var4] = new int[var6];
			field1294[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1296[var4][var8] = var7.method327();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method176(var9[var10], null);
			int var12 = var11.length / 4;
			MQZHAILV var13 = new MQZHAILV(var11);
			field1316[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1316[var10][var14] = var13.method330();
			}
		}

		byte[] var15 = arg0.method176("model_index", null);
		int var16 = field1296[0].length;
		field1318 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1318[var17] = var15[var17];
			} else {
				field1318[var17] = 0;
			}
		}

		byte[] var18 = arg0.method176("map_index", null);
		MQZHAILV var19 = new MQZHAILV(var18);
		int var20 = var18.length / 7;
		field1300 = new int[var20];
		field1289 = new int[var20];
		field1319 = new int[var20];
		field1291 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1300[var21] = var19.method327();
			field1289[var21] = var19.method327();
			field1319[var21] = var19.method327();
			field1291[var21] = var19.method325();
		}

		byte[] var22 = arg0.method176("anim_index", null);
		MQZHAILV var23 = new MQZHAILV(var22);
		int var24 = var22.length / 2;
		field1309 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1309[var25] = var23.method327();
		}

		byte[] var26 = arg0.method176("midi_index", null);
		MQZHAILV var27 = new MQZHAILV(var26);
		int var28 = var26.length;
		field1310 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1310[var29] = var27.method325();
		}

		field1320 = arg1;
		field1326 = true;
		field1320.method97(this, 2);
	}

	@ObfuscatedName("YCBPJRVN.d(I)V")
	public final void method537() {
		synchronized (field1312) {
			field1312.method380();
		}
	}

	@ObfuscatedName("YCBPJRVN.b()V")
	public final void method538() {
		field1326 = false;
	}

	@ObfuscatedName("YCBPJRVN.a([BIII)Z")
	public final boolean method539(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field1322.reset();
			field1322.update(arg0, 0, var4);
			int var6 = (int) field1322.getValue();

			if (arg2 != var5) {
				return false;
			}

			if (arg1 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("YCBPJRVN.c(II)I")
	public final int method540(int arg0) {
		return field1318[arg0] & 0xFF;
	}

	@ObfuscatedName("YCBPJRVN.c()I")
	public final int method541() {
		synchronized (field1313) {
			return field1313.method485();
		}
	}

	@ObfuscatedName("YCBPJRVN.c(IZ)Z")
	public final boolean method542(int arg0) {
		for (int var2 = 0; var2 < field1300.length; var2++) {
			if (field1319[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("YCBPJRVN.b(Z)I")
	public final int method543() {
		return field1309.length;
	}

	@ObfuscatedName("YCBPJRVN.e(I)V")
	public final void method544() {
		field1323 = 0;
		field1324 = 0;
		for (JLWEKARN var1 = (JLWEKARN) field1301.method376(); var1 != null; var1 = (JLWEKARN) field1301.method378()) {
			if (var1.field686) {
				field1323++;
			} else {
				field1324++;
			}
		}

		while (field1323 < 10) {
			JLWEKARN var2 = (JLWEKARN) field1290.method375();
			if (var2 == null) {
				break;
			}

			if (field1294[var2.field687][var2.field689] != 0) {
				field1305++;
			}

			field1294[var2.field687][var2.field689] = 0;
			field1301.method373(var2);
			field1323++;
			method532(var2);
			field1306 = true;
		}
	}
}
