package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("UWINSVPX")
public class UWINSVPX extends KQZMRVZQ implements Runnable {

	@ObfuscatedName("UWINSVPX.b")
	public int[][] field1288 = new int[4][];

	@ObfuscatedName("UWINSVPX.n")
	public byte[] field1299 = new byte[65000];

	@ObfuscatedName("UWINSVPX.r")
	public WOVRPCGT field1303 = new WOVRPCGT();

	@ObfuscatedName("UWINSVPX.s")
	public byte[][] field1304 = new byte[4][];

	@ObfuscatedName("UWINSVPX.v")
	public boolean field1306 = false;

	@ObfuscatedName("UWINSVPX.w")
	public WOVRPCGT field1307 = new WOVRPCGT();

	@ObfuscatedName("UWINSVPX.C")
	public int[][] field1312 = new int[4][];

	@ObfuscatedName("UWINSVPX.D")
	public boolean field1313 = true;

	@ObfuscatedName("UWINSVPX.I")
	public WOVRPCGT field1317 = new WOVRPCGT();

	@ObfuscatedName("UWINSVPX.K")
	public WOVRPCGT field1319 = new WOVRPCGT();

	@ObfuscatedName("UWINSVPX.L")
	public CRC32 field1320 = new CRC32();

	@ObfuscatedName("UWINSVPX.M")
	public String field1321 = "";

	@ObfuscatedName("UWINSVPX.O")
	public ISCMIAJK field1323 = new ISCMIAJK();

	@ObfuscatedName("UWINSVPX.Q")
	public byte[] field1325 = new byte[500];

	@ObfuscatedName("UWINSVPX.R")
	public WOVRPCGT field1326 = new WOVRPCGT();

	@ObfuscatedName("UWINSVPX.f")
	public int field1291;

	@ObfuscatedName("UWINSVPX.g")
	public int field1292;

	@ObfuscatedName("UWINSVPX.h")
	public int field1293;

	@ObfuscatedName("UWINSVPX.j")
	public int field1295;

	@ObfuscatedName("UWINSVPX.m")
	public int field1298;

	@ObfuscatedName("UWINSVPX.p")
	public int field1301;

	@ObfuscatedName("UWINSVPX.q")
	public int field1302;

	@ObfuscatedName("UWINSVPX.x")
	public int field1308;

	@ObfuscatedName("UWINSVPX.F")
	public int field1315;

	@ObfuscatedName("UWINSVPX.J")
	public int field1318;

	@ObfuscatedName("UWINSVPX.P")
	public int field1324;

	@ObfuscatedName("UWINSVPX.B")
	public long field1311;

	@ObfuscatedName("UWINSVPX.t")
	public VLOPFRWW field1305;

	@ObfuscatedName("UWINSVPX.l")
	public client field1297;

	@ObfuscatedName("UWINSVPX.o")
	public InputStream field1300;

	@ObfuscatedName("UWINSVPX.c")
	public OutputStream field1289;

	@ObfuscatedName("UWINSVPX.E")
	public Socket field1314;

	@ObfuscatedName("UWINSVPX.d")
	public byte[] field1290;

	@ObfuscatedName("UWINSVPX.i")
	public int[] field1294;

	@ObfuscatedName("UWINSVPX.k")
	public int[] field1296;

	@ObfuscatedName("UWINSVPX.y")
	public int[] field1309;

	@ObfuscatedName("UWINSVPX.A")
	public int[] field1310;

	@ObfuscatedName("UWINSVPX.G")
	public int[] field1316;

	@ObfuscatedName("UWINSVPX.N")
	public int[] field1322;

	@ObfuscatedName("UWINSVPX.b(I)V")
	public final void method517() {
		synchronized (field1307) {
			field1307.method547();
		}
	}

	@ObfuscatedName("UWINSVPX.a(ILVLOPFRWW;)V")
	public final void method518(VLOPFRWW arg0) {
		try {
			if (field1314 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1311 < 4000L) {
					return;
				}

				field1311 = var2;
				field1314 = field1297.method29(client.field331 + 43594);
				field1300 = field1314.getInputStream();
				field1289 = field1314.getOutputStream();
				field1289.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1300.read();
				}

				field1293 = 0;
			}

			field1325[0] = (byte) arg0.field1353;
			field1325[1] = (byte) (arg0.field1351 >> 8);
			field1325[2] = (byte) arg0.field1351;
			if (arg0.field1354) {
				field1325[3] = 2;
			} else if (field1297.field351) {
				field1325[3] = 0;
			} else {
				field1325[3] = 1;
			}

			field1289.write(field1325, 0, 4);
			field1324 = 0;
			field1315 = -10000;
		} catch (IOException var7) {
			try {
				field1314.close();
			} catch (Exception var6) {
			}

			field1314 = null;
			field1300 = null;
			field1289 = null;
			field1302 = 0;
			field1315++;
		}
	}

	@ObfuscatedName("UWINSVPX.a(IBII)I")
	public final int method519(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field1316.length; var5++) {
			if (field1316[var5] == var4) {
				if (arg2 == 0) {
					return field1322[var5];
				}

				return field1309[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("UWINSVPX.c(I)V")
	public final void method520() {
		VLOPFRWW var2;
		synchronized (field1303) {
			var2 = (VLOPFRWW) field1303.method542();
		}

		while (var2 != null) {
			field1306 = true;
			byte[] var3 = null;
			if (field1297.field412[0] != null) {
				var3 = field1297.field412[var2.field1353 + 1].method548(var2.field1351);
			}

			if (!method524(field1312[var2.field1353][var2.field1351], field1288[var2.field1353][var2.field1351], var3)) {
				var3 = null;
			}

			synchronized (field1303) {
				if (var3 == null) {
					field1317.method540(var2);
				} else {
					var2.field1352 = var3;

					synchronized (field1319) {
						field1319.method540(var2);
					}
				}

				var2 = (VLOPFRWW) field1303.method542();
			}
		}
	}

	@ObfuscatedName("UWINSVPX.a(II)Z")
	public final boolean method521(int arg0) {
		for (int var2 = 0; var2 < field1316.length; var2++) {
			if (field1309[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("UWINSVPX.b(II)Z")
	public final boolean method522(int arg0) {
		if (field1310[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UWINSVPX.d(I)V")
	public final void method523() {
		field1291 = 0;
		field1292 = 0;
		for (VLOPFRWW var1 = (VLOPFRWW) field1326.method543(); var1 != null; var1 = (VLOPFRWW) field1326.method545()) {
			if (var1.field1354) {
				field1291++;
			} else {
				field1292++;
			}
		}

		while (field1291 < 10) {
			VLOPFRWW var2 = (VLOPFRWW) field1317.method542();
			if (var2 == null) {
				break;
			}

			if (field1304[var2.field1353][var2.field1351] != 0) {
				field1295++;
			}

			field1304[var2.field1353][var2.field1351] = 0;
			field1326.method540(var2);
			field1291++;
			method518(var2);
			field1306 = true;
		}
	}

	@ObfuscatedName("UWINSVPX.a(III[B)Z")
	public final boolean method524(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field1320.reset();
			field1320.update(arg2, 0, var4);
			int var6 = (int) field1320.getValue();

			if (arg0 != var5) {
				return false;
			}

			if (arg1 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("UWINSVPX.a(ZI)I")
	public final int method525(int arg0) {
		return field1290[arg0] & 0xFF;
	}

	@ObfuscatedName("UWINSVPX.a()I")
	public final int method526() {
		synchronized (field1323) {
			return field1323.method311();
		}
	}

	@ObfuscatedName("UWINSVPX.a(III)V")
	public final void method527(int arg0, int arg1) {
		if (field1297.field412[0] != null && (field1312[arg1][arg0] != 0 && (field1304[arg1][arg0] != 0 && field1318 != 0))) {
			VLOPFRWW var3 = new VLOPFRWW();
			var3.field1353 = arg1;
			var3.field1351 = arg0;
			var3.field1354 = false;

			synchronized (field1307) {
				field1307.method540(var3);
			}
		}
	}

	@ObfuscatedName("UWINSVPX.e(I)I")
	public final int method528() {
		return field1294.length;
	}

	@ObfuscatedName("UWINSVPX.b()V")
	public final void method529() {
		field1313 = false;
	}

	@ObfuscatedName("UWINSVPX.a(B)V")
	public final void method530() {
		try {
			int var1 = field1300.available();
			if (field1302 == 0 && var1 >= 6) {
				field1306 = true;

				for (int var2 = 0; var2 < 6; var2 += field1300.read(field1325, var2, 6 - var2)) {
				}

				int var3 = field1325[0] & 0xFF;
				int var4 = ((field1325[1] & 0xFF) << 8) + (field1325[2] & 0xFF);
				int var5 = ((field1325[3] & 0xFF) << 8) + (field1325[4] & 0xFF);
				int var6 = field1325[5] & 0xFF;
				field1305 = null;
				for (VLOPFRWW var7 = (VLOPFRWW) field1326.method543(); var7 != null; var7 = (VLOPFRWW) field1326.method545()) {
					if (var7.field1353 == var3 && var7.field1351 == var4) {
						field1305 = var7;
					}

					if (field1305 != null) {
						var7.field1355 = 0;
					}
				}

				if (field1305 != null) {
					field1293 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1305.field1352 = null;

						if (field1305.field1354) {
							synchronized (field1319) {
								field1319.method540(field1305);
							}
						} else {
							field1305.method14();
						}

						field1305 = null;
					} else {
						if (field1305.field1352 == null && var6 == 0) {
							field1305.field1352 = new byte[var5];
						}

						if (field1305.field1352 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1301 = var6 * 500;
				field1302 = 500;
				if (field1302 > var5 - var6 * 500) {
					field1302 = var5 - var6 * 500;
				}
			}

			if (field1302 > 0 && var1 >= field1302) {
				field1306 = true;
				byte[] var9 = field1325;
				int var10 = 0;
				if (field1305 != null) {
					var9 = field1305.field1352;
					var10 = field1301;
				}

				for (int var11 = 0; var11 < field1302; var11 += field1300.read(var9, var10 + var11, field1302 - var11)) {
				}

				if (field1302 + field1301 >= var9.length && field1305 != null) {
					if (field1297.field412[0] != null) {
						field1297.field412[field1305.field1353 + 1].method549(var9, field1305.field1351, var9.length);
					}

					if (!field1305.field1354 && field1305.field1353 == 3) {
						field1305.field1354 = true;
						field1305.field1353 = 93;
					}

					if (field1305.field1354) {
						synchronized (field1319) {
							field1319.method540(field1305);
						}
					} else {
						field1305.method14();
					}
				}

				field1302 = 0;
			}
		} catch (IOException var17) {
			try {
				field1314.close();
			} catch (Exception var14) {
			}

			field1314 = null;
			field1300 = null;
			field1289 = null;
			field1302 = 0;
		}
	}

	@ObfuscatedName("UWINSVPX.a(BI)I")
	public final int method531(int arg0) {
		return field1312[arg0].length;
	}

	@ObfuscatedName("UWINSVPX.b(ZI)V")
	public final void method532(boolean arg0) {
		int var2 = field1316.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1296[var3] != 0) {
				method536(3, field1309[var3], (byte) 2);
				method536(3, field1322[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("UWINSVPX.c(II)V")
	public final void method533(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1312.length && arg1 >= 0 && arg1 <= field1312[arg0].length && field1312[arg0][arg1] != 0) {
			synchronized (field1323) {
				for (VLOPFRWW var4 = (VLOPFRWW) field1323.method309(); var4 != null; var4 = (VLOPFRWW) field1323.method310()) {
					if (var4.field1353 == arg0 && var4.field1351 == arg1) {
						return;
					}
				}

				VLOPFRWW var5 = new VLOPFRWW();
				var5.field1353 = arg0;
				var5.field1351 = arg1;
				var5.field1354 = true;

				synchronized (field1303) {
					field1303.method540(var5);
				}

				field1323.method307(var5);
			}
		}
	}

	@ObfuscatedName("UWINSVPX.c()LVLOPFRWW;")
	public final VLOPFRWW method534() {
		VLOPFRWW var2;
		synchronized (field1319) {
			var2 = (VLOPFRWW) field1319.method542();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1323) {
			var2.method432();
		}

		if (var2.field1352 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1352));
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

		var2.field1352 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1352[var7] = field1299[var7];
		}

		return var2;
	}

	public final void run() {
		try {
			while (field1313) {
				field1298++;
				byte var1 = 20;
				if (field1318 == 0 && field1297.field412[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1306 = true;
				for (int var2 = 0; var2 < 100 && field1306; var2++) {
					field1306 = false;
					method520();
					method523();

					if (field1291 == 0 && var2 >= 5) {
						break;
					}

					method535();

					if (field1300 != null) {
						method530();
					}
				}

				boolean var3 = false;
				for (VLOPFRWW var4 = (VLOPFRWW) field1326.method543(); var4 != null; var4 = (VLOPFRWW) field1326.method545()) {
					if (var4.field1354) {
						var3 = true;
						var4.field1355++;
						if (var4.field1355 > 50) {
							var4.field1355 = 0;
							method518(var4);
						}
					}
				}

				if (!var3) {
					for (VLOPFRWW var5 = (VLOPFRWW) field1326.method543(); var5 != null; var5 = (VLOPFRWW) field1326.method545()) {
						var3 = true;
						var5.field1355++;
						if (var5.field1355 > 50) {
							var5.field1355 = 0;
							method518(var5);
						}
					}
				}

				if (var3) {
					field1293++;
					if (field1293 > 750) {
						try {
							field1314.close();
						} catch (Exception var8) {
						}

						field1314 = null;
						field1300 = null;
						field1289 = null;
						field1302 = 0;
					}
				} else {
					field1293 = 0;
					field1321 = "";
				}

				if (field1297.field351 && field1314 != null && field1289 != null && (field1318 > 0 || field1297.field412[0] == null)) {
					field1324++;
					if (field1324 > 500) {
						field1324 = 0;
						field1325[0] = 0;
						field1325[1] = 0;
						field1325[2] = 0;
						field1325[3] = 10;
						try {
							field1289.write(field1325, 0, 4);
						} catch (IOException var7) {
							field1293 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("UWINSVPX.a(Z)V")
	public final void method535() {
		while (field1291 == 0) {
			if (field1292 >= 10 || field1318 == 0) {
				return;
			}

			VLOPFRWW var2;
			synchronized (field1307) {
				var2 = (VLOPFRWW) field1307.method542();
			}

			while (var2 != null) {
				if (field1304[var2.field1353][var2.field1351] != 0) {
					field1304[var2.field1353][var2.field1351] = 0;
					field1326.method540(var2);
					method518(var2);
					field1306 = true;

					if (field1295 < field1308) {
						field1295++;
					}

					field1321 = "Loading extra files - " + field1295 * 100 / field1308 + "%";
					field1292++;
					if (field1292 == 10) {
						return;
					}
				}

				synchronized (field1307) {
					var2 = (VLOPFRWW) field1307.method542();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1304[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1318) {
						var5[var7] = 0;
						VLOPFRWW var8 = new VLOPFRWW();
						var8.field1353 = var4;
						var8.field1351 = var7;
						var8.field1354 = false;
						field1326.method540(var8);
						method518(var8);
						field1306 = true;

						if (field1295 < field1308) {
							field1295++;
						}

						field1321 = "Loading extra files - " + field1295 * 100 / field1308 + "%";
						field1292++;
						if (field1292 == 10) {
							return;
						}
					}
				}
			}

			field1318--;
		}
	}

	@ObfuscatedName("UWINSVPX.a(IIBB)V")
	public final void method536(int arg0, int arg1, byte arg2) {
		if (field1297.field412[0] != null && field1312[arg0][arg1] != 0) {
			byte[] var4 = field1297.field412[arg0 + 1].method548(arg1);
			if (!method524(field1312[arg0][arg1], field1288[arg0][arg1], var4)) {
				field1304[arg0][arg1] = arg2;

				if (arg2 > field1318) {
					field1318 = arg2;
				}

				field1308++;
			}
		}
	}

	@ObfuscatedName("UWINSVPX.a(LNXFIIFAD;Lclient;)V")
	public final void method537(NXFIIFAD arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method431(var3[var4], null);
			int var6 = var5.length / 2;
			MNKDCXXG var7 = new MNKDCXXG(var5);
			field1312[var4] = new int[var6];
			field1304[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1312[var4][var8] = var7.method388();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method431(var9[var10], null);
			int var12 = var11.length / 4;
			MNKDCXXG var13 = new MNKDCXXG(var11);
			field1288[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1288[var10][var14] = var13.method391();
			}
		}

		byte[] var15 = arg0.method431("model_index", null);
		int var16 = field1312[0].length;
		field1290 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1290[var17] = var15[var17];
			} else {
				field1290[var17] = 0;
			}
		}

		byte[] var18 = arg0.method431("map_index", null);
		MNKDCXXG var19 = new MNKDCXXG(var18);
		int var20 = var18.length / 7;
		field1316 = new int[var20];
		field1322 = new int[var20];
		field1309 = new int[var20];
		field1296 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1316[var21] = var19.method388();
			field1322[var21] = var19.method388();
			field1309[var21] = var19.method388();
			field1296[var21] = var19.method386();
		}

		byte[] var22 = arg0.method431("anim_index", null);
		MNKDCXXG var23 = new MNKDCXXG(var22);
		int var24 = var22.length / 2;
		field1294 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1294[var25] = var23.method388();
		}

		byte[] var26 = arg0.method431("midi_index", null);
		MNKDCXXG var27 = new MNKDCXXG(var26);
		int var28 = var26.length;
		field1310 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1310[var29] = var27.method386();
		}

		field1297 = arg1;
		field1313 = true;
		field1297.method12(this, 2);
	}

	@ObfuscatedName("UWINSVPX.a(I)V")
	public final void method316(int arg0) {
		method533(0, arg0);
	}
}
