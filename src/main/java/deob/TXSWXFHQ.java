package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("TXSWXFHQ")
public class TXSWXFHQ extends XFAWLDDQ implements Runnable {

	@ObfuscatedName("TXSWXFHQ.b")
	public int[][] field1297 = new int[4][];

	@ObfuscatedName("TXSWXFHQ.d")
	public byte[] field1299 = new byte[65000];

	@ObfuscatedName("TXSWXFHQ.e")
	public boolean field1300 = false;

	@ObfuscatedName("TXSWXFHQ.f")
	public ILVDIPQT field1301 = new ILVDIPQT();

	@ObfuscatedName("TXSWXFHQ.g")
	public byte[][] field1302 = new byte[4][];

	@ObfuscatedName("TXSWXFHQ.h")
	public ILVDIPQT field1303 = new ILVDIPQT();

	@ObfuscatedName("TXSWXFHQ.j")
	public ILVDIPQT field1305 = new ILVDIPQT();

	@ObfuscatedName("TXSWXFHQ.l")
	public int[][] field1307 = new int[4][];

	@ObfuscatedName("TXSWXFHQ.m")
	public EOXICPMP field1308 = new EOXICPMP();

	@ObfuscatedName("TXSWXFHQ.x")
	public ILVDIPQT field1315 = new ILVDIPQT();

	@ObfuscatedName("TXSWXFHQ.D")
	public ILVDIPQT field1320 = new ILVDIPQT();

	@ObfuscatedName("TXSWXFHQ.G")
	public byte[] field1323 = new byte[500];

	@ObfuscatedName("TXSWXFHQ.K")
	public String field1327 = "";

	@ObfuscatedName("TXSWXFHQ.P")
	public boolean field1329 = true;

	@ObfuscatedName("TXSWXFHQ.R")
	public CRC32 field1331 = new CRC32();

	@ObfuscatedName("TXSWXFHQ.k")
	public int field1306;

	@ObfuscatedName("TXSWXFHQ.n")
	public int field1309;

	@ObfuscatedName("TXSWXFHQ.u")
	public int field1313;

	@ObfuscatedName("TXSWXFHQ.v")
	public int field1314;

	@ObfuscatedName("TXSWXFHQ.z")
	public int field1316;

	@ObfuscatedName("TXSWXFHQ.A")
	public int field1317;

	@ObfuscatedName("TXSWXFHQ.C")
	public int field1319;

	@ObfuscatedName("TXSWXFHQ.H")
	public int field1324;

	@ObfuscatedName("TXSWXFHQ.I")
	public int field1325;

	@ObfuscatedName("TXSWXFHQ.J")
	public int field1326;

	@ObfuscatedName("TXSWXFHQ.L")
	public int field1328;

	@ObfuscatedName("TXSWXFHQ.B")
	public long field1318;

	@ObfuscatedName("TXSWXFHQ.c")
	public EWBEDHEW field1298;

	@ObfuscatedName("TXSWXFHQ.E")
	public client field1321;

	@ObfuscatedName("TXSWXFHQ.i")
	public InputStream field1304;

	@ObfuscatedName("TXSWXFHQ.U")
	public OutputStream field1334;

	@ObfuscatedName("TXSWXFHQ.o")
	public Socket field1310;

	@ObfuscatedName("TXSWXFHQ.a")
	public byte[] field1296;

	@ObfuscatedName("TXSWXFHQ.q")
	public int[] field1311;

	@ObfuscatedName("TXSWXFHQ.s")
	public int[] field1312;

	@ObfuscatedName("TXSWXFHQ.F")
	public int[] field1322;

	@ObfuscatedName("TXSWXFHQ.Q")
	public int[] field1330;

	@ObfuscatedName("TXSWXFHQ.S")
	public int[] field1332;

	@ObfuscatedName("TXSWXFHQ.T")
	public int[] field1333;

	@ObfuscatedName("TXSWXFHQ.a(B)V")
	public final void method472() {
		EWBEDHEW var2;
		synchronized (field1305) {
			var2 = (EWBEDHEW) field1305.method331();
		}

		while (var2 != null) {
			field1300 = true;
			byte[] var3 = null;
			if (field1321.field196[0] != null) {
				var3 = field1321.field196[var2.field583 + 1].method559(var2.field584);
			}

			if (!method491(var3, field1307[var2.field583][var2.field584], field1297[var2.field583][var2.field584])) {
				var3 = null;
			}

			synchronized (field1305) {
				if (var3 == null) {
					field1301.method329(var2);
				} else {
					var2.field582 = var3;

					synchronized (field1315) {
						field1315.method329(var2);
					}
				}

				var2 = (EWBEDHEW) field1305.method331();
			}
		}
	}

	@ObfuscatedName("TXSWXFHQ.a(BBII)V")
	public final void method473(byte arg0, int arg1, int arg2) {
		if (field1321.field196[0] != null && field1307[arg1][arg2] != 0) {
			byte[] var4 = field1321.field196[arg1 + 1].method559(arg2);
			if (!method491(var4, field1307[arg1][arg2], field1297[arg1][arg2])) {
				field1302[arg1][arg2] = arg0;

				if (arg0 > field1328) {
					field1328 = arg0;
				}

				field1306++;
			}
		}
	}

	@ObfuscatedName("TXSWXFHQ.b(B)V")
	public final void method474() {
		field1324 = 0;
		field1325 = 0;
		for (EWBEDHEW var1 = (EWBEDHEW) field1320.method332(); var1 != null; var1 = (EWBEDHEW) field1320.method334()) {
			if (var1.field585) {
				field1324++;
			} else {
				field1325++;
			}
		}

		while (field1324 < 10) {
			EWBEDHEW var2 = (EWBEDHEW) field1301.method331();
			if (var2 == null) {
				break;
			}

			if (field1302[var2.field583][var2.field584] != 0) {
				field1309++;
			}

			field1302[var2.field583][var2.field584] = 0;
			field1320.method329(var2);
			field1324++;
			method490(var2);
			field1300 = true;
		}
	}

	@ObfuscatedName("TXSWXFHQ.a(BIII)I")
	public final int method475(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < field1330.length; var5++) {
			if (field1330[var5] == var4) {
				if (arg2 == 0) {
					return field1322[var5];
				}

				return field1333[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("TXSWXFHQ.a(III)V")
	public final void method476(int arg0, int arg1) {
		if (field1321.field196[0] != null && (field1307[arg0][arg1] != 0 && (field1302[arg0][arg1] != 0 && field1328 != 0))) {
			EWBEDHEW var3 = new EWBEDHEW();
			var3.field583 = arg0;
			var3.field584 = arg1;
			var3.field585 = false;

			synchronized (field1303) {
				field1303.method329(var3);
			}
		}
	}

	@ObfuscatedName("TXSWXFHQ.b(I)V")
	public final void method477() {
		try {
			int var1 = field1304.available();
			if (field1317 == 0 && var1 >= 6) {
				field1300 = true;

				for (int var2 = 0; var2 < 6; var2 += field1304.read(field1323, var2, 6 - var2)) {
				}

				int var3 = field1323[0] & 0xFF;
				int var4 = ((field1323[1] & 0xFF) << 8) + (field1323[2] & 0xFF);
				int var5 = ((field1323[3] & 0xFF) << 8) + (field1323[4] & 0xFF);
				int var6 = field1323[5] & 0xFF;
				field1298 = null;
				for (EWBEDHEW var7 = (EWBEDHEW) field1320.method332(); var7 != null; var7 = (EWBEDHEW) field1320.method334()) {
					if (var7.field583 == var3 && var7.field584 == var4) {
						field1298 = var7;
					}

					if (field1298 != null) {
						var7.field581 = 0;
					}
				}

				if (field1298 != null) {
					field1314 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1298.field582 = null;

						if (field1298.field585) {
							synchronized (field1315) {
								field1315.method329(field1298);
							}
						} else {
							field1298.method471();
						}

						field1298 = null;
					} else {
						if (field1298.field582 == null && var6 == 0) {
							field1298.field582 = new byte[var5];
						}

						if (field1298.field582 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1316 = var6 * 500;
				field1317 = 500;
				if (field1317 > var5 - var6 * 500) {
					field1317 = var5 - var6 * 500;
				}
			}

			if (field1317 > 0 && var1 >= field1317) {
				field1300 = true;
				byte[] var9 = field1323;
				int var10 = 0;
				if (field1298 != null) {
					var9 = field1298.field582;
					var10 = field1316;
				}

				for (int var11 = 0; var11 < field1317; var11 += field1304.read(var9, var10 + var11, field1317 - var11)) {
				}

				if (field1317 + field1316 >= var9.length && field1298 != null) {
					if (field1321.field196[0] != null) {
						field1321.field196[field1298.field583 + 1].method560(var9.length, var9, field1298.field584);
					}

					if (!field1298.field585 && field1298.field583 == 3) {
						field1298.field585 = true;
						field1298.field583 = 93;
					}

					if (field1298.field585) {
						synchronized (field1315) {
							field1315.method329(field1298);
						}
					} else {
						field1298.method471();
					}
				}

				field1317 = 0;
			}
		} catch (IOException var17) {
			try {
				field1310.close();
			} catch (Exception var14) {
			}

			field1310 = null;
			field1304 = null;
			field1334 = null;
			field1317 = 0;
		}
	}

	@ObfuscatedName("TXSWXFHQ.a(II)V")
	public final void method478(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1307.length && arg1 >= 0 && arg1 <= field1307[arg0].length && field1307[arg0][arg1] != 0) {
			synchronized (field1308) {
				for (EWBEDHEW var4 = (EWBEDHEW) field1308.method221(); var4 != null; var4 = (EWBEDHEW) field1308.method222()) {
					if (var4.field583 == arg0 && var4.field584 == arg1) {
						return;
					}
				}

				EWBEDHEW var5 = new EWBEDHEW();
				var5.field583 = arg0;
				var5.field584 = arg1;
				var5.field585 = true;

				synchronized (field1305) {
					field1305.method329(var5);
				}

				field1308.method219(var5);
			}
		}
	}

	@ObfuscatedName("TXSWXFHQ.a(ZI)I")
	public final int method479(int arg0) {
		return field1296[arg0] & 0xFF;
	}

	@ObfuscatedName("TXSWXFHQ.a(LCVNWKEAW;Lclient;)V")
	public final void method480(CVNWKEAW arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method180(var3[var4], null);
			int var6 = var5.length / 2;
			XOUQUKZW var7 = new XOUQUKZW(var5);
			field1307[var4] = new int[var6];
			field1302[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1307[var4][var8] = var7.method523();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method180(var9[var10], null);
			int var12 = var11.length / 4;
			XOUQUKZW var13 = new XOUQUKZW(var11);
			field1297[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1297[var10][var14] = var13.method526();
			}
		}

		byte[] var15 = arg0.method180("model_index", null);
		int var16 = field1307[0].length;
		field1296 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1296[var17] = var15[var17];
			} else {
				field1296[var17] = 0;
			}
		}

		byte[] var18 = arg0.method180("map_index", null);
		XOUQUKZW var19 = new XOUQUKZW(var18);
		int var20 = var18.length / 7;
		field1330 = new int[var20];
		field1322 = new int[var20];
		field1333 = new int[var20];
		field1311 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1330[var21] = var19.method523();
			field1322[var21] = var19.method523();
			field1333[var21] = var19.method523();
			field1311[var21] = var19.method521();
		}

		byte[] var22 = arg0.method180("anim_index", null);
		XOUQUKZW var23 = new XOUQUKZW(var22);
		int var24 = var22.length / 2;
		field1332 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1332[var25] = var23.method523();
		}

		byte[] var26 = arg0.method180("midi_index", null);
		XOUQUKZW var27 = new XOUQUKZW(var26);
		int var28 = var26.length;
		field1312 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1312[var29] = var27.method521();
		}

		field1321 = arg1;
		field1329 = true;
		field1321.method93(this, 2);
	}

	@ObfuscatedName("TXSWXFHQ.b(II)Z")
	public final boolean method481(int arg0) {
		for (int var2 = 0; var2 < field1330.length; var2++) {
			if (field1333[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("TXSWXFHQ.a()V")
	public final void method482() {
		field1329 = false;
	}

	@ObfuscatedName("TXSWXFHQ.b(ZI)V")
	public final void method483(boolean arg0) {
		int var2 = field1330.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1311[var3] != 0) {
				method473((byte) 2, 3, field1333[var3]);
				method473((byte) 2, 3, field1322[var3]);
			}
		}
	}

	@ObfuscatedName("TXSWXFHQ.a(Z)V")
	public final void method484() {
		synchronized (field1303) {
			field1303.method336();
		}
	}

	@ObfuscatedName("TXSWXFHQ.b()LEWBEDHEW;")
	public final EWBEDHEW method485() {
		EWBEDHEW var2;
		synchronized (field1315) {
			var2 = (EWBEDHEW) field1315.method331();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1308) {
			var2.method215();
		}

		if (var2.field582 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field582));
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

		var2.field582 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field582[var7] = field1299[var7];
		}

		return var2;
	}

	@ObfuscatedName("TXSWXFHQ.c(II)I")
	public final int method486(int arg0) {
		return field1307[arg0].length;
	}

	@ObfuscatedName("TXSWXFHQ.c()I")
	public final int method487() {
		synchronized (field1308) {
			return field1308.method223();
		}
	}

	@ObfuscatedName("TXSWXFHQ.c(B)I")
	public final int method488() {
		return field1332.length;
	}

	@ObfuscatedName("TXSWXFHQ.a(I)V")
	public final void method489(int arg0) {
		method478(0, arg0);
	}

	@ObfuscatedName("TXSWXFHQ.a(LEWBEDHEW;Z)V")
	public final void method490(EWBEDHEW arg0) {
		try {
			if (field1310 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1318 < 4000L) {
					return;
				}

				field1318 = var2;
				field1310 = field1321.method135(client.field158 + 43594);
				field1304 = field1310.getInputStream();
				field1334 = field1310.getOutputStream();
				field1334.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1304.read();
				}

				field1314 = 0;
			}

			field1323[0] = (byte) arg0.field583;
			field1323[1] = (byte) (arg0.field584 >> 8);
			field1323[2] = (byte) arg0.field584;
			if (arg0.field585) {
				field1323[3] = 2;
			} else if (field1321.field150) {
				field1323[3] = 0;
			} else {
				field1323[3] = 1;
			}

			field1334.write(field1323, 0, 4);
			field1313 = 0;
			field1319 = -10000;
		} catch (IOException var7) {
			try {
				field1310.close();
			} catch (Exception var6) {
			}

			field1310 = null;
			field1304 = null;
			field1334 = null;
			field1317 = 0;
			field1319++;
		}
	}

	public final void run() {
		try {
			while (field1329) {
				field1326++;
				byte var1 = 20;
				if (field1328 == 0 && field1321.field196[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1300 = true;
				for (int var2 = 0; var2 < 100 && field1300; var2++) {
					field1300 = false;
					method472();
					method474();

					if (field1324 == 0 && var2 >= 5) {
						break;
					}

					method493();

					if (field1304 != null) {
						method477();
					}
				}

				boolean var3 = false;
				for (EWBEDHEW var4 = (EWBEDHEW) field1320.method332(); var4 != null; var4 = (EWBEDHEW) field1320.method334()) {
					if (var4.field585) {
						var3 = true;
						var4.field581++;
						if (var4.field581 > 50) {
							var4.field581 = 0;
							method490(var4);
						}
					}
				}

				if (!var3) {
					for (EWBEDHEW var5 = (EWBEDHEW) field1320.method332(); var5 != null; var5 = (EWBEDHEW) field1320.method334()) {
						var3 = true;
						var5.field581++;
						if (var5.field581 > 50) {
							var5.field581 = 0;
							method490(var5);
						}
					}
				}

				if (var3) {
					field1314++;
					if (field1314 > 750) {
						try {
							field1310.close();
						} catch (Exception var8) {
						}

						field1310 = null;
						field1304 = null;
						field1334 = null;
						field1317 = 0;
					}
				} else {
					field1314 = 0;
					field1327 = "";
				}

				if (field1321.field150 && field1310 != null && field1334 != null && (field1328 > 0 || field1321.field196[0] == null)) {
					field1313++;
					if (field1313 > 500) {
						field1313 = 0;
						field1323[0] = 0;
						field1323[1] = 0;
						field1323[2] = 0;
						field1323[3] = 10;
						try {
							field1334.write(field1323, 0, 4);
						} catch (IOException var7) {
							field1314 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("TXSWXFHQ.a(I[BII)Z")
	public final boolean method491(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field1331.reset();
			field1331.update(arg0, 0, var4);
			int var6 = (int) field1331.getValue();

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

	@ObfuscatedName("TXSWXFHQ.d(II)Z")
	public final boolean method492(int arg0) {
		if (field1312[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("TXSWXFHQ.c(I)V")
	public final void method493() {
		while (field1324 == 0) {
			if (field1325 >= 10 || field1328 == 0) {
				return;
			}

			EWBEDHEW var2;
			synchronized (field1303) {
				var2 = (EWBEDHEW) field1303.method331();
			}

			while (var2 != null) {
				if (field1302[var2.field583][var2.field584] != 0) {
					field1302[var2.field583][var2.field584] = 0;
					field1320.method329(var2);
					method490(var2);
					field1300 = true;

					if (field1309 < field1306) {
						field1309++;
					}

					field1327 = "Loading extra files - " + field1309 * 100 / field1306 + "%";
					field1325++;
					if (field1325 == 10) {
						return;
					}
				}

				synchronized (field1303) {
					var2 = (EWBEDHEW) field1303.method331();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1302[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1328) {
						var5[var7] = 0;
						EWBEDHEW var8 = new EWBEDHEW();
						var8.field583 = var4;
						var8.field584 = var7;
						var8.field585 = false;
						field1320.method329(var8);
						method490(var8);
						field1300 = true;

						if (field1309 < field1306) {
							field1309++;
						}

						field1327 = "Loading extra files - " + field1309 * 100 / field1306 + "%";
						field1325++;
						if (field1325 == 10) {
							return;
						}
					}
				}
			}

			field1328--;
		}
	}
}
