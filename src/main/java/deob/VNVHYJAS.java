package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("VNVHYJAS")
public class VNVHYJAS extends HCDGMSST implements Runnable {

	@ObfuscatedName("VNVHYJAS.d")
	public int[][] field1311 = new int[4][];

	@ObfuscatedName("VNVHYJAS.f")
	public int[][] field1313 = new int[4][];

	@ObfuscatedName("VNVHYJAS.k")
	public byte[] field1317 = new byte[65000];

	@ObfuscatedName("VNVHYJAS.l")
	public boolean field1318 = true;

	@ObfuscatedName("VNVHYJAS.n")
	public byte[] field1319 = new byte[500];

	@ObfuscatedName("VNVHYJAS.o")
	public OCPYCLUF field1320 = new OCPYCLUF();

	@ObfuscatedName("VNVHYJAS.q")
	public OCPYCLUF field1322 = new OCPYCLUF();

	@ObfuscatedName("VNVHYJAS.r")
	public CRC32 field1323 = new CRC32();

	@ObfuscatedName("VNVHYJAS.v")
	public OCPYCLUF field1327 = new OCPYCLUF();

	@ObfuscatedName("VNVHYJAS.A")
	public OCPYCLUF field1332 = new OCPYCLUF();

	@ObfuscatedName("VNVHYJAS.D")
	public String field1334 = "";

	@ObfuscatedName("VNVHYJAS.E")
	public OCPYCLUF field1335 = new OCPYCLUF();

	@ObfuscatedName("VNVHYJAS.I")
	public byte[][] field1339 = new byte[4][];

	@ObfuscatedName("VNVHYJAS.K")
	public YGUBUIIU field1341 = new YGUBUIIU();

	@ObfuscatedName("VNVHYJAS.M")
	public boolean field1343 = false;

	@ObfuscatedName("VNVHYJAS.b")
	public int field1310;

	@ObfuscatedName("VNVHYJAS.h")
	public int field1314;

	@ObfuscatedName("VNVHYJAS.i")
	public int field1315;

	@ObfuscatedName("VNVHYJAS.s")
	public int field1324;

	@ObfuscatedName("VNVHYJAS.t")
	public int field1325;

	@ObfuscatedName("VNVHYJAS.x")
	public int field1329;

	@ObfuscatedName("VNVHYJAS.y")
	public int field1330;

	@ObfuscatedName("VNVHYJAS.B")
	public int field1333;

	@ObfuscatedName("VNVHYJAS.N")
	public int field1344;

	@ObfuscatedName("VNVHYJAS.R")
	public int field1346;

	@ObfuscatedName("VNVHYJAS.S")
	public int field1347;

	@ObfuscatedName("VNVHYJAS.J")
	public long field1340;

	@ObfuscatedName("VNVHYJAS.w")
	public ZRGWPKYE field1328;

	@ObfuscatedName("VNVHYJAS.O")
	public client field1345;

	@ObfuscatedName("VNVHYJAS.a")
	public InputStream field1309;

	@ObfuscatedName("VNVHYJAS.p")
	public OutputStream field1321;

	@ObfuscatedName("VNVHYJAS.L")
	public Socket field1342;

	@ObfuscatedName("VNVHYJAS.u")
	public byte[] field1326;

	@ObfuscatedName("VNVHYJAS.e")
	public int[] field1312;

	@ObfuscatedName("VNVHYJAS.j")
	public int[] field1316;

	@ObfuscatedName("VNVHYJAS.z")
	public int[] field1331;

	@ObfuscatedName("VNVHYJAS.F")
	public int[] field1336;

	@ObfuscatedName("VNVHYJAS.G")
	public int[] field1337;

	@ObfuscatedName("VNVHYJAS.H")
	public int[] field1338;

	@ObfuscatedName("VNVHYJAS.a(II)Z")
	public final boolean method514(int arg0) {
		if (field1312[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("VNVHYJAS.a(LINOFEYKQ;Lclient;)V")
	public final void method515(INOFEYKQ arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method277(var3[var4], null);
			int var6 = var5.length / 2;
			NHEPCMLW var7 = new NHEPCMLW(var5);
			field1313[var4] = new int[var6];
			field1339[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1313[var4][var8] = var7.method351();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method277(var9[var10], null);
			int var12 = var11.length / 4;
			NHEPCMLW var13 = new NHEPCMLW(var11);
			field1311[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1311[var10][var14] = var13.method354();
			}
		}

		byte[] var15 = arg0.method277("model_index", null);
		int var16 = field1313[0].length;
		field1326 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1326[var17] = var15[var17];
			} else {
				field1326[var17] = 0;
			}
		}

		byte[] var18 = arg0.method277("map_index", null);
		NHEPCMLW var19 = new NHEPCMLW(var18);
		int var20 = var18.length / 7;
		field1331 = new int[var20];
		field1336 = new int[var20];
		field1337 = new int[var20];
		field1316 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1331[var21] = var19.method351();
			field1336[var21] = var19.method351();
			field1337[var21] = var19.method351();
			field1316[var21] = var19.method349();
		}

		byte[] var22 = arg0.method277("anim_index", null);
		NHEPCMLW var23 = new NHEPCMLW(var22);
		int var24 = var22.length / 2;
		field1338 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1338[var25] = var23.method351();
		}

		byte[] var26 = arg0.method277("midi_index", null);
		NHEPCMLW var27 = new NHEPCMLW(var26);
		int var28 = var26.length;
		field1312 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1312[var29] = var27.method349();
		}

		field1345 = arg1;
		field1318 = true;
		field1345.method74(this, 2);
	}

	@ObfuscatedName("VNVHYJAS.a(Z)I")
	public final int method516() {
		return field1338.length;
	}

	@ObfuscatedName("VNVHYJAS.a(IZ)V")
	public final void method517(boolean arg0) {
		int var2 = field1331.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1316[var3] != 0) {
				method522(3, field1337[var3], (byte) 2);
				method522(3, field1336[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("VNVHYJAS.a(B)V")
	public final void method518() {
		while (field1346 == 0) {
			if (field1347 >= 10 || field1344 == 0) {
				return;
			}

			ZRGWPKYE var2;
			synchronized (field1322) {
				var2 = (ZRGWPKYE) field1322.method413();
			}

			while (var2 != null) {
				if (field1339[var2.field1492][var2.field1494] != 0) {
					field1339[var2.field1492][var2.field1494] = 0;
					field1335.method411(var2);
					method519(var2);
					field1343 = true;

					if (field1333 < field1310) {
						field1333++;
					}

					field1334 = "Loading extra files - " + field1333 * 100 / field1310 + "%";
					field1347++;
					if (field1347 == 10) {
						return;
					}
				}

				synchronized (field1322) {
					var2 = (ZRGWPKYE) field1322.method413();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1339[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1344) {
						var5[var7] = 0;
						ZRGWPKYE var8 = new ZRGWPKYE();
						var8.field1492 = var4;
						var8.field1494 = var7;
						var8.field1495 = false;
						field1335.method411(var8);
						method519(var8);
						field1343 = true;

						if (field1333 < field1310) {
							field1333++;
						}

						field1334 = "Loading extra files - " + field1333 * 100 / field1310 + "%";
						field1347++;
						if (field1347 == 10) {
							return;
						}
					}
				}
			}

			field1344--;
		}
	}

	@ObfuscatedName("VNVHYJAS.a(LZRGWPKYE;B)V")
	public final void method519(ZRGWPKYE arg0) {
		try {
			if (field1342 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1340 < 4000L) {
					return;
				}

				field1340 = var2;
				field1342 = field1345.method139(client.field416 + 43594);
				field1309 = field1342.getInputStream();
				field1321 = field1342.getOutputStream();
				field1321.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1309.read();
				}

				field1315 = 0;
			}

			field1319[0] = (byte) arg0.field1492;
			field1319[1] = (byte) (arg0.field1494 >> 8);
			field1319[2] = (byte) arg0.field1494;
			if (arg0.field1495) {
				field1319[3] = 2;
			} else if (field1345.field366) {
				field1319[3] = 0;
			} else {
				field1319[3] = 1;
			}

			field1321.write(field1319, 0, 4);
			field1330 = 0;
			field1314 = -10000;
		} catch (IOException var7) {
			try {
				field1342.close();
			} catch (Exception var6) {
			}

			field1342 = null;
			field1309 = null;
			field1321 = null;
			field1325 = 0;
			field1314++;
		}
	}

	@ObfuscatedName("VNVHYJAS.a(IIII)I")
	public final int method520(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field1331.length; var5++) {
			if (field1331[var5] == var4) {
				if (arg2 == 0) {
					return field1336[var5];
				}

				return field1337[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("VNVHYJAS.b(II)Z")
	public final boolean method521(int arg0) {
		for (int var2 = 0; var2 < field1331.length; var2++) {
			if (field1337[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	public final void run() {
		try {
			while (field1318) {
				field1329++;
				byte var1 = 20;
				if (field1344 == 0 && field1345.field85[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1343 = true;
				for (int var2 = 0; var2 < 100 && field1343; var2++) {
					field1343 = false;
					method531();
					method525();

					if (field1346 == 0 && var2 >= 5) {
						break;
					}

					method518();

					if (field1309 != null) {
						method534();
					}
				}

				boolean var3 = false;
				for (ZRGWPKYE var4 = (ZRGWPKYE) field1335.method414(); var4 != null; var4 = (ZRGWPKYE) field1335.method416()) {
					if (var4.field1495) {
						var3 = true;
						var4.field1493++;
						if (var4.field1493 > 50) {
							var4.field1493 = 0;
							method519(var4);
						}
					}
				}

				if (!var3) {
					for (ZRGWPKYE var5 = (ZRGWPKYE) field1335.method414(); var5 != null; var5 = (ZRGWPKYE) field1335.method416()) {
						var3 = true;
						var5.field1493++;
						if (var5.field1493 > 50) {
							var5.field1493 = 0;
							method519(var5);
						}
					}
				}

				if (var3) {
					field1315++;
					if (field1315 > 750) {
						try {
							field1342.close();
						} catch (Exception var8) {
						}

						field1342 = null;
						field1309 = null;
						field1321 = null;
						field1325 = 0;
					}
				} else {
					field1315 = 0;
					field1334 = "";
				}

				if (field1345.field366 && field1342 != null && field1321 != null && (field1344 > 0 || field1345.field85[0] == null)) {
					field1330++;
					if (field1330 > 500) {
						field1330 = 0;
						field1319[0] = 0;
						field1319[1] = 0;
						field1319[2] = 0;
						field1319[3] = 10;
						try {
							field1321.write(field1319, 0, 4);
						} catch (IOException var7) {
							field1315 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("VNVHYJAS.a(IIIB)V")
	public final void method522(int arg0, int arg1, byte arg2) {
		if (field1345.field85[0] != null && field1313[arg0][arg1] != 0) {
			byte[] var4 = field1345.field85[arg0 + 1].method550(arg1);
			if (!method528(var4, field1313[arg0][arg1], field1311[arg0][arg1])) {
				field1339[arg0][arg1] = arg2;

				if (arg2 > field1344) {
					field1344 = arg2;
				}

				field1310++;
			}
		}
	}

	@ObfuscatedName("VNVHYJAS.a(BII)V")
	public final void method523(int arg0, int arg1) {
		if (field1345.field85[0] != null && (field1313[arg1][arg0] != 0 && (field1339[arg1][arg0] != 0 && field1344 != 0))) {
			ZRGWPKYE var3 = new ZRGWPKYE();
			var3.field1492 = arg1;
			var3.field1494 = arg0;
			var3.field1495 = false;

			synchronized (field1322) {
				field1322.method411(var3);
			}
		}
	}

	@ObfuscatedName("VNVHYJAS.c(II)I")
	public final int method524(int arg0) {
		return field1326[arg0] & 0xFF;
	}

	@ObfuscatedName("VNVHYJAS.b(I)V")
	public final void method525() {
		field1346 = 0;
		field1347 = 0;
		for (ZRGWPKYE var1 = (ZRGWPKYE) field1335.method414(); var1 != null; var1 = (ZRGWPKYE) field1335.method416()) {
			if (var1.field1495) {
				field1346++;
			} else {
				field1347++;
			}
		}

		while (field1346 < 10) {
			ZRGWPKYE var2 = (ZRGWPKYE) field1332.method413();
			if (var2 == null) {
				break;
			}

			if (field1339[var2.field1492][var2.field1494] != 0) {
				field1333++;
			}

			field1339[var2.field1492][var2.field1494] = 0;
			field1335.method411(var2);
			field1346++;
			method519(var2);
			field1343 = true;
		}
	}

	@ObfuscatedName("VNVHYJAS.a()LZRGWPKYE;")
	public final ZRGWPKYE method526() {
		ZRGWPKYE var2;
		synchronized (field1327) {
			var2 = (ZRGWPKYE) field1327.method413();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1341) {
			var2.method330();
		}

		if (var2.field1491 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1491));
			while (true) {
				if (field1317.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1317, var4, field1317.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1491 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1491[var7] = field1317[var7];
		}

		return var2;
	}

	@ObfuscatedName("VNVHYJAS.b(Z)V")
	public final void method527() {
		synchronized (field1322) {
			field1322.method418();
		}
	}

	@ObfuscatedName("VNVHYJAS.a(I[BII)Z")
	public final boolean method528(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field1323.reset();
			field1323.update(arg0, 0, var4);
			int var6 = (int) field1323.getValue();

			if (arg1 != var5) {
				return false;
			}

			if (arg2 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("VNVHYJAS.b()I")
	public final int method529() {
		synchronized (field1341) {
			return field1341.method577();
		}
	}

	@ObfuscatedName("VNVHYJAS.c()V")
	public final void method530() {
		field1318 = false;
	}

	@ObfuscatedName("VNVHYJAS.c(Z)V")
	public final void method531() {
		ZRGWPKYE var2;
		synchronized (field1320) {
			var2 = (ZRGWPKYE) field1320.method413();
		}

		while (var2 != null) {
			field1343 = true;
			byte[] var3 = null;
			if (field1345.field85[0] != null) {
				var3 = field1345.field85[var2.field1492 + 1].method550(var2.field1494);
			}

			if (!method528(var3, field1313[var2.field1492][var2.field1494], field1311[var2.field1492][var2.field1494])) {
				var3 = null;
			}

			synchronized (field1320) {
				if (var3 == null) {
					field1332.method411(var2);
				} else {
					var2.field1491 = var3;

					synchronized (field1327) {
						field1327.method411(var2);
					}
				}

				var2 = (ZRGWPKYE) field1320.method413();
			}
		}
	}

	@ObfuscatedName("VNVHYJAS.a(I)V")
	public final void method248(int arg0) {
		method532(0, arg0);
	}

	@ObfuscatedName("VNVHYJAS.d(II)V")
	public final void method532(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1313.length && arg1 >= 0 && arg1 <= field1313[arg0].length && field1313[arg0][arg1] != 0) {
			synchronized (field1341) {
				for (ZRGWPKYE var4 = (ZRGWPKYE) field1341.method575(); var4 != null; var4 = (ZRGWPKYE) field1341.method576()) {
					if (var4.field1492 == arg0 && var4.field1494 == arg1) {
						return;
					}
				}

				ZRGWPKYE var5 = new ZRGWPKYE();
				var5.field1492 = arg0;
				var5.field1494 = arg1;
				var5.field1495 = true;

				synchronized (field1320) {
					field1320.method411(var5);
				}

				field1341.method573(var5);
			}
		}
	}

	@ObfuscatedName("VNVHYJAS.e(II)I")
	public final int method533(int arg0) {
		return field1313[arg0].length;
	}

	@ObfuscatedName("VNVHYJAS.c(I)V")
	public final void method534() {
		try {
			int var1 = field1309.available();
			if (field1325 == 0 && var1 >= 6) {
				field1343 = true;

				for (int var2 = 0; var2 < 6; var2 += field1309.read(field1319, var2, 6 - var2)) {
				}

				int var3 = field1319[0] & 0xFF;
				int var4 = ((field1319[1] & 0xFF) << 8) + (field1319[2] & 0xFF);
				int var5 = ((field1319[3] & 0xFF) << 8) + (field1319[4] & 0xFF);
				int var6 = field1319[5] & 0xFF;
				field1328 = null;
				for (ZRGWPKYE var7 = (ZRGWPKYE) field1335.method414(); var7 != null; var7 = (ZRGWPKYE) field1335.method416()) {
					if (var7.field1492 == var3 && var7.field1494 == var4) {
						field1328 = var7;
					}

					if (field1328 != null) {
						var7.field1493 = 0;
					}
				}

				if (field1328 != null) {
					field1315 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1328.field1491 = null;

						if (field1328.field1495) {
							synchronized (field1327) {
								field1327.method411(field1328);
							}
						} else {
							field1328.method336();
						}

						field1328 = null;
					} else {
						if (field1328.field1491 == null && var6 == 0) {
							field1328.field1491 = new byte[var5];
						}

						if (field1328.field1491 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1324 = var6 * 500;
				field1325 = 500;
				if (field1325 > var5 - var6 * 500) {
					field1325 = var5 - var6 * 500;
				}
			}

			if (field1325 > 0 && var1 >= field1325) {
				field1343 = true;
				byte[] var9 = field1319;
				int var10 = 0;
				if (field1328 != null) {
					var9 = field1328.field1491;
					var10 = field1324;
				}

				for (int var11 = 0; var11 < field1325; var11 += field1309.read(var9, var10 + var11, field1325 - var11)) {
				}

				if (field1325 + field1324 >= var9.length && field1328 != null) {
					if (field1345.field85[0] != null) {
						field1345.field85[field1328.field1492 + 1].method551(var9.length, var9, field1328.field1494);
					}

					if (!field1328.field1495 && field1328.field1492 == 3) {
						field1328.field1495 = true;
						field1328.field1492 = 93;
					}

					if (field1328.field1495) {
						synchronized (field1327) {
							field1327.method411(field1328);
						}
					} else {
						field1328.method336();
					}
				}

				field1325 = 0;
			}
		} catch (IOException var17) {
			try {
				field1342.close();
			} catch (Exception var14) {
			}

			field1342 = null;
			field1309 = null;
			field1321 = null;
			field1325 = 0;
		}
	}
}
