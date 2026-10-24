package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("VYNRIVYZ")
public class VYNRIVYZ extends DHLBKEZC implements Runnable {

	@ObfuscatedName("VYNRIVYZ.b")
	public ELLPUVEP field1337 = new ELLPUVEP();

	@ObfuscatedName("VYNRIVYZ.d")
	public boolean field1339 = true;

	@ObfuscatedName("VYNRIVYZ.i")
	public FEIPMYNH field1344 = new FEIPMYNH();

	@ObfuscatedName("VYNRIVYZ.l")
	public String field1346 = "";

	@ObfuscatedName("VYNRIVYZ.p")
	public FEIPMYNH field1350 = new FEIPMYNH();

	@ObfuscatedName("VYNRIVYZ.s")
	public int[][] field1352 = new int[4][];

	@ObfuscatedName("VYNRIVYZ.w")
	public FEIPMYNH field1355 = new FEIPMYNH();

	@ObfuscatedName("VYNRIVYZ.y")
	public byte[] field1357 = new byte[500];

	@ObfuscatedName("VYNRIVYZ.A")
	public FEIPMYNH field1358 = new FEIPMYNH();

	@ObfuscatedName("VYNRIVYZ.H")
	public byte[][] field1364 = new byte[4][];

	@ObfuscatedName("VYNRIVYZ.I")
	public int[][] field1365 = new int[4][];

	@ObfuscatedName("VYNRIVYZ.J")
	public boolean field1366 = false;

	@ObfuscatedName("VYNRIVYZ.K")
	public CRC32 field1367 = new CRC32();

	@ObfuscatedName("VYNRIVYZ.L")
	public byte[] field1368 = new byte[65000];

	@ObfuscatedName("VYNRIVYZ.V")
	public FEIPMYNH field1375 = new FEIPMYNH();

	@ObfuscatedName("VYNRIVYZ.f")
	public int field1341;

	@ObfuscatedName("VYNRIVYZ.g")
	public int field1342;

	@ObfuscatedName("VYNRIVYZ.m")
	public int field1347;

	@ObfuscatedName("VYNRIVYZ.o")
	public int field1349;

	@ObfuscatedName("VYNRIVYZ.v")
	public int field1354;

	@ObfuscatedName("VYNRIVYZ.B")
	public int field1359;

	@ObfuscatedName("VYNRIVYZ.E")
	public int field1361;

	@ObfuscatedName("VYNRIVYZ.F")
	public int field1362;

	@ObfuscatedName("VYNRIVYZ.G")
	public int field1363;

	@ObfuscatedName("VYNRIVYZ.R")
	public int field1373;

	@ObfuscatedName("VYNRIVYZ.T")
	public int field1374;

	@ObfuscatedName("VYNRIVYZ.Q")
	public long field1372;

	@ObfuscatedName("VYNRIVYZ.n")
	public IIWNEACY field1348;

	@ObfuscatedName("VYNRIVYZ.e")
	public client field1340;

	@ObfuscatedName("VYNRIVYZ.c")
	public InputStream field1338;

	@ObfuscatedName("VYNRIVYZ.C")
	public OutputStream field1360;

	@ObfuscatedName("VYNRIVYZ.r")
	public Socket field1351;

	@ObfuscatedName("VYNRIVYZ.h")
	public byte[] field1343;

	@ObfuscatedName("VYNRIVYZ.k")
	public int[] field1345;

	@ObfuscatedName("VYNRIVYZ.t")
	public int[] field1353;

	@ObfuscatedName("VYNRIVYZ.x")
	public int[] field1356;

	@ObfuscatedName("VYNRIVYZ.N")
	public int[] field1369;

	@ObfuscatedName("VYNRIVYZ.O")
	public int[] field1370;

	@ObfuscatedName("VYNRIVYZ.P")
	public int[] field1371;

	public final void run() {
		try {
			while (field1339) {
				field1361++;
				byte var1 = 20;
				if (field1373 == 0 && field1340.field219[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1366 = true;
				for (int var2 = 0; var2 < 100 && field1366; var2++) {
					field1366 = false;
					method540();
					method547();

					if (field1341 == 0 && var2 >= 5) {
						break;
					}

					method550();

					if (field1338 != null) {
						method545();
					}
				}

				boolean var3 = false;
				for (IIWNEACY var4 = (IIWNEACY) field1375.method300(); var4 != null; var4 = (IIWNEACY) field1375.method302()) {
					if (var4.field715) {
						var3 = true;
						var4.field714++;
						if (var4.field714 > 50) {
							var4.field714 = 0;
							method557(var4);
						}
					}
				}

				if (!var3) {
					for (IIWNEACY var5 = (IIWNEACY) field1375.method300(); var5 != null; var5 = (IIWNEACY) field1375.method302()) {
						var3 = true;
						var5.field714++;
						if (var5.field714 > 50) {
							var5.field714 = 0;
							method557(var5);
						}
					}
				}

				if (var3) {
					field1354++;
					if (field1354 > 750) {
						try {
							field1351.close();
						} catch (Exception var8) {
						}

						field1351 = null;
						field1338 = null;
						field1360 = null;
						field1363 = 0;
					}
				} else {
					field1354 = 0;
					field1346 = "";
				}

				if (field1340.field256 && field1351 != null && field1360 != null && (field1373 > 0 || field1340.field219[0] == null)) {
					field1374++;
					if (field1374 > 500) {
						field1374 = 0;
						field1357[0] = 0;
						field1357[1] = 0;
						field1357[2] = 0;
						field1357[3] = 10;
						try {
							field1360.write(field1357, 0, 4);
						} catch (IOException var7) {
							field1354 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("VYNRIVYZ.a(I)V")
	public final void method277(int arg0) {
		method556(0, arg0);
	}

	@ObfuscatedName("VYNRIVYZ.a(II)I")
	public final int method539(int arg0) {
		return field1343[arg0] & 0xFF;
	}

	@ObfuscatedName("VYNRIVYZ.a(Z)V")
	public final void method540() {
		IIWNEACY var2;
		synchronized (field1350) {
			var2 = (IIWNEACY) field1350.method299();
		}

		while (var2 != null) {
			field1366 = true;
			byte[] var3 = null;
			if (field1340.field219[0] != null) {
				var3 = field1340.field219[var2.field716 + 1].method514(var2.field717);
			}

			if (!method555(field1352[var2.field716][var2.field717], var3, field1365[var2.field716][var2.field717])) {
				var3 = null;
			}

			synchronized (field1350) {
				if (var3 == null) {
					field1355.method297(var2);
				} else {
					var2.field713 = var3;

					synchronized (field1358) {
						field1358.method297(var2);
					}
				}

				var2 = (IIWNEACY) field1350.method299();
			}
		}
	}

	@ObfuscatedName("VYNRIVYZ.a(IZII)I")
	public final int method541(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field1371.length; var5++) {
			if (field1371[var5] == var4) {
				if (arg0 == 0) {
					return field1353[var5];
				}

				return field1370[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("VYNRIVYZ.a(B)I")
	public final int method542() {
		return field1356.length;
	}

	@ObfuscatedName("VYNRIVYZ.b(II)Z")
	public final boolean method543(int arg0) {
		if (field1345[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("VYNRIVYZ.c(II)I")
	public final int method544(int arg0) {
		return field1352[arg0].length;
	}

	@ObfuscatedName("VYNRIVYZ.b(Z)V")
	public final void method545() {
		try {
			int var1 = field1338.available();
			if (field1363 == 0 && var1 >= 6) {
				field1366 = true;

				for (int var2 = 0; var2 < 6; var2 += field1338.read(field1357, var2, 6 - var2)) {
				}

				int var3 = field1357[0] & 0xFF;
				int var4 = ((field1357[1] & 0xFF) << 8) + (field1357[2] & 0xFF);
				int var5 = ((field1357[3] & 0xFF) << 8) + (field1357[4] & 0xFF);
				int var6 = field1357[5] & 0xFF;
				field1348 = null;
				for (IIWNEACY var7 = (IIWNEACY) field1375.method300(); var7 != null; var7 = (IIWNEACY) field1375.method302()) {
					if (var7.field716 == var3 && var7.field717 == var4) {
						field1348 = var7;
					}

					if (field1348 != null) {
						var7.field714 = 0;
					}
				}

				if (field1348 != null) {
					field1354 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1348.field713 = null;

						if (field1348.field715) {
							synchronized (field1358) {
								field1358.method297(field1348);
							}
						} else {
							field1348.method518();
						}

						field1348 = null;
					} else {
						if (field1348.field713 == null && var6 == 0) {
							field1348.field713 = new byte[var5];
						}

						if (field1348.field713 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1362 = var6 * 500;
				field1363 = 500;
				if (field1363 > var5 - var6 * 500) {
					field1363 = var5 - var6 * 500;
				}
			}

			if (field1363 > 0 && var1 >= field1363) {
				field1366 = true;
				byte[] var9 = field1357;
				int var10 = 0;
				if (field1348 != null) {
					var9 = field1348.field713;
					var10 = field1362;
				}

				for (int var11 = 0; var11 < field1363; var11 += field1338.read(var9, var10 + var11, field1363 - var11)) {
				}

				if (field1363 + field1362 >= var9.length && field1348 != null) {
					if (field1340.field219[0] != null) {
						field1340.field219[field1348.field716 + 1].method515(field1348.field717, var9, var9.length);
					}

					if (!field1348.field715 && field1348.field716 == 3) {
						field1348.field715 = true;
						field1348.field716 = 93;
					}

					if (field1348.field715) {
						synchronized (field1358) {
							field1358.method297(field1348);
						}
					} else {
						field1348.method518();
					}
				}

				field1363 = 0;
			}
		} catch (IOException var17) {
			try {
				field1351.close();
			} catch (Exception var14) {
			}

			field1351 = null;
			field1338 = null;
			field1360 = null;
			field1363 = 0;
		}
	}

	@ObfuscatedName("VYNRIVYZ.d(II)Z")
	public final boolean method546(int arg0) {
		for (int var2 = 0; var2 < field1371.length; var2++) {
			if (field1370[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("VYNRIVYZ.b(I)V")
	public final void method547() {
		field1341 = 0;
		field1342 = 0;
		for (IIWNEACY var1 = (IIWNEACY) field1375.method300(); var1 != null; var1 = (IIWNEACY) field1375.method302()) {
			if (var1.field715) {
				field1341++;
			} else {
				field1342++;
			}
		}

		while (field1341 < 10) {
			IIWNEACY var2 = (IIWNEACY) field1355.method299();
			if (var2 == null) {
				break;
			}

			if (field1364[var2.field716][var2.field717] != 0) {
				field1347++;
			}

			field1364[var2.field716][var2.field717] = 0;
			field1375.method297(var2);
			field1341++;
			method557(var2);
			field1366 = true;
		}
	}

	@ObfuscatedName("VYNRIVYZ.a(IBII)V")
	public final void method548(int arg0, byte arg1, int arg2) {
		if (field1340.field219[0] != null && field1352[arg2][arg0] != 0) {
			byte[] var4 = field1340.field219[arg2 + 1].method514(arg0);
			if (!method555(field1352[arg2][arg0], var4, field1365[arg2][arg0])) {
				field1364[arg2][arg0] = arg1;

				if (arg1 > field1373) {
					field1373 = arg1;
				}

				field1359++;
			}
		}
	}

	@ObfuscatedName("VYNRIVYZ.a(IIB)V")
	public final void method549(int arg0, int arg1) {
		if (field1340.field219[0] != null && (field1352[arg0][arg1] != 0 && (field1364[arg0][arg1] != 0 && field1373 != 0))) {
			IIWNEACY var3 = new IIWNEACY();
			var3.field716 = arg0;
			var3.field717 = arg1;
			var3.field715 = false;

			synchronized (field1344) {
				field1344.method297(var3);
			}
		}
	}

	@ObfuscatedName("VYNRIVYZ.c(Z)V")
	public final void method550() {
		while (field1341 == 0) {
			if (field1342 >= 10 || field1373 == 0) {
				return;
			}

			IIWNEACY var2;
			synchronized (field1344) {
				var2 = (IIWNEACY) field1344.method299();
			}

			while (var2 != null) {
				if (field1364[var2.field716][var2.field717] != 0) {
					field1364[var2.field716][var2.field717] = 0;
					field1375.method297(var2);
					method557(var2);
					field1366 = true;

					if (field1347 < field1359) {
						field1347++;
					}

					field1346 = "Loading extra files - " + field1347 * 100 / field1359 + "%";
					field1342++;
					if (field1342 == 10) {
						return;
					}
				}

				synchronized (field1344) {
					var2 = (IIWNEACY) field1344.method299();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1364[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1373) {
						var5[var7] = 0;
						IIWNEACY var8 = new IIWNEACY();
						var8.field716 = var4;
						var8.field717 = var7;
						var8.field715 = false;
						field1375.method297(var8);
						method557(var8);
						field1366 = true;

						if (field1347 < field1359) {
							field1347++;
						}

						field1346 = "Loading extra files - " + field1347 * 100 / field1359 + "%";
						field1342++;
						if (field1342 == 10) {
							return;
						}
					}
				}
			}

			field1373--;
		}
	}

	@ObfuscatedName("VYNRIVYZ.a()LIIWNEACY;")
	public final IIWNEACY method551() {
		IIWNEACY var2;
		synchronized (field1358) {
			var2 = (IIWNEACY) field1358.method299();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1337) {
			var2.method320();
		}

		if (var2.field713 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field713));
			while (true) {
				if (field1368.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1368, var4, field1368.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field713 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field713[var7] = field1368[var7];
		}

		return var2;
	}

	@ObfuscatedName("VYNRIVYZ.b()I")
	public final int method552() {
		synchronized (field1337) {
			return field1337.method284();
		}
	}

	@ObfuscatedName("VYNRIVYZ.a(LSMIVAFST;Lclient;)V")
	public final void method553(SMIVAFST arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method512(var3[var4], null);
			int var6 = var5.length / 2;
			BSNPYLEV var7 = new BSNPYLEV(var5);
			field1352[var4] = new int[var6];
			field1364[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1352[var4][var8] = var7.method49();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method512(var9[var10], null);
			int var12 = var11.length / 4;
			BSNPYLEV var13 = new BSNPYLEV(var11);
			field1365[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1365[var10][var14] = var13.method52();
			}
		}

		byte[] var15 = arg0.method512("model_index", null);
		int var16 = field1352[0].length;
		field1343 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1343[var17] = var15[var17];
			} else {
				field1343[var17] = 0;
			}
		}

		byte[] var18 = arg0.method512("map_index", null);
		BSNPYLEV var19 = new BSNPYLEV(var18);
		int var20 = var18.length / 7;
		field1371 = new int[var20];
		field1353 = new int[var20];
		field1370 = new int[var20];
		field1369 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1371[var21] = var19.method49();
			field1353[var21] = var19.method49();
			field1370[var21] = var19.method49();
			field1369[var21] = var19.method47();
		}

		byte[] var22 = arg0.method512("anim_index", null);
		BSNPYLEV var23 = new BSNPYLEV(var22);
		int var24 = var22.length / 2;
		field1356 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1356[var25] = var23.method49();
		}

		byte[] var26 = arg0.method512("midi_index", null);
		BSNPYLEV var27 = new BSNPYLEV(var26);
		int var28 = var26.length;
		field1345 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1345[var29] = var27.method47();
		}

		field1340 = arg1;
		field1339 = true;
		field1340.method164(this, 2);
	}

	@ObfuscatedName("VYNRIVYZ.c(I)V")
	public final void method554() {
		synchronized (field1344) {
			field1344.method304();
		}
	}

	@ObfuscatedName("VYNRIVYZ.a(I[BIZ)Z")
	public final boolean method555(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field1367.reset();
			field1367.update(arg1, 0, var4);
			int var6 = (int) field1367.getValue();

			if (arg0 != var5) {
				return false;
			}

			if (arg2 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("VYNRIVYZ.e(II)V")
	public final void method556(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1352.length && arg1 >= 0 && arg1 <= field1352[arg0].length && field1352[arg0][arg1] != 0) {
			synchronized (field1337) {
				for (IIWNEACY var4 = (IIWNEACY) field1337.method282(); var4 != null; var4 = (IIWNEACY) field1337.method283()) {
					if (var4.field716 == arg0 && var4.field717 == arg1) {
						return;
					}
				}

				IIWNEACY var5 = new IIWNEACY();
				var5.field716 = arg0;
				var5.field717 = arg1;
				var5.field715 = true;

				synchronized (field1350) {
					field1350.method297(var5);
				}

				field1337.method280(var5);
			}
		}
	}

	@ObfuscatedName("VYNRIVYZ.a(LIIWNEACY;I)V")
	public final void method557(IIWNEACY arg0) {
		try {
			if (field1351 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1372 < 4000L) {
					return;
				}

				field1372 = var2;
				field1351 = field1340.method176(client.field514 + 43594);
				field1338 = field1351.getInputStream();
				field1360 = field1351.getOutputStream();
				field1360.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1338.read();
				}

				field1354 = 0;
			}

			field1357[0] = (byte) arg0.field716;
			field1357[1] = (byte) (arg0.field717 >> 8);
			field1357[2] = (byte) arg0.field717;
			if (arg0.field715) {
				field1357[3] = 2;
			} else if (field1340.field256) {
				field1357[3] = 0;
			} else {
				field1357[3] = 1;
			}

			field1360.write(field1357, 0, 4);
			field1374 = 0;
			field1349 = -10000;
		} catch (IOException var7) {
			try {
				field1351.close();
			} catch (Exception var6) {
			}

			field1351 = null;
			field1338 = null;
			field1360 = null;
			field1363 = 0;
			field1349++;
		}
	}

	@ObfuscatedName("VYNRIVYZ.a(IZ)V")
	public final void method558(boolean arg0) {
		int var2 = field1371.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1369[var3] != 0) {
				method548(field1370[var3], (byte) 2, 3);
				method548(field1353[var3], (byte) 2, 3);
			}
		}
	}

	@ObfuscatedName("VYNRIVYZ.c()V")
	public final void method559() {
		field1339 = false;
	}
}
