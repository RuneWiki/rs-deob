package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("RKMPVAZH")
public class RKMPVAZH extends NRTVRRZW implements Runnable {

	@ObfuscatedName("RKMPVAZH.b")
	public String field1284 = "";

	@ObfuscatedName("RKMPVAZH.e")
	public IHMCQRZY field1286 = new IHMCQRZY();

	@ObfuscatedName("RKMPVAZH.f")
	public IHMCQRZY field1287 = new IHMCQRZY();

	@ObfuscatedName("RKMPVAZH.i")
	public int[][] field1290 = new int[4][];

	@ObfuscatedName("RKMPVAZH.j")
	public IHMCQRZY field1291 = new IHMCQRZY();

	@ObfuscatedName("RKMPVAZH.m")
	public IHMCQRZY field1294 = new IHMCQRZY();

	@ObfuscatedName("RKMPVAZH.n")
	public byte[] field1295 = new byte[65000];

	@ObfuscatedName("RKMPVAZH.p")
	public IHMCQRZY field1297 = new IHMCQRZY();

	@ObfuscatedName("RKMPVAZH.q")
	public int[][] field1298 = new int[4][];

	@ObfuscatedName("RKMPVAZH.D")
	public KZFVEUEL field1309 = new KZFVEUEL();

	@ObfuscatedName("RKMPVAZH.E")
	public boolean field1310 = false;

	@ObfuscatedName("RKMPVAZH.H")
	public byte[] field1313 = new byte[500];

	@ObfuscatedName("RKMPVAZH.I")
	public byte[][] field1314 = new byte[4][];

	@ObfuscatedName("RKMPVAZH.K")
	public boolean field1316 = true;

	@ObfuscatedName("RKMPVAZH.O")
	public CRC32 field1319 = new CRC32();

	@ObfuscatedName("RKMPVAZH.c")
	public int field1285;

	@ObfuscatedName("RKMPVAZH.g")
	public int field1288;

	@ObfuscatedName("RKMPVAZH.o")
	public int field1296;

	@ObfuscatedName("RKMPVAZH.v")
	public int field1302;

	@ObfuscatedName("RKMPVAZH.w")
	public int field1303;

	@ObfuscatedName("RKMPVAZH.x")
	public int field1304;

	@ObfuscatedName("RKMPVAZH.y")
	public int field1305;

	@ObfuscatedName("RKMPVAZH.A")
	public int field1307;

	@ObfuscatedName("RKMPVAZH.M")
	public int field1317;

	@ObfuscatedName("RKMPVAZH.N")
	public int field1318;

	@ObfuscatedName("RKMPVAZH.R")
	public int field1321;

	@ObfuscatedName("RKMPVAZH.u")
	public long field1301;

	@ObfuscatedName("RKMPVAZH.G")
	public HSCHLCCN field1312;

	@ObfuscatedName("RKMPVAZH.k")
	public client field1292;

	@ObfuscatedName("RKMPVAZH.h")
	public InputStream field1289;

	@ObfuscatedName("RKMPVAZH.z")
	public OutputStream field1306;

	@ObfuscatedName("RKMPVAZH.J")
	public Socket field1315;

	@ObfuscatedName("RKMPVAZH.l")
	public byte[] field1293;

	@ObfuscatedName("RKMPVAZH.s")
	public int[] field1299;

	@ObfuscatedName("RKMPVAZH.t")
	public int[] field1300;

	@ObfuscatedName("RKMPVAZH.B")
	public int[] field1308;

	@ObfuscatedName("RKMPVAZH.F")
	public int[] field1311;

	@ObfuscatedName("RKMPVAZH.Q")
	public int[] field1320;

	@ObfuscatedName("RKMPVAZH.T")
	public int[] field1322;

	@ObfuscatedName("RKMPVAZH.a(I)V")
	public final void method404(int arg0) {
		method516(0, arg0);
	}

	@ObfuscatedName("RKMPVAZH.b(I)V")
	public final void method498() {
		while (field1304 == 0) {
			if (field1305 >= 10 || field1321 == 0) {
				return;
			}

			HSCHLCCN var2;
			synchronized (field1297) {
				var2 = (HSCHLCCN) field1297.method245();
			}

			while (var2 != null) {
				if (field1314[var2.field688][var2.field690] != 0) {
					field1314[var2.field688][var2.field690] = 0;
					field1291.method243(var2);
					method502(var2);
					field1310 = true;

					if (field1307 < field1296) {
						field1307++;
					}

					field1284 = "Loading extra files - " + field1307 * 100 / field1296 + "%";
					field1305++;
					if (field1305 == 10) {
						return;
					}
				}

				synchronized (field1297) {
					var2 = (HSCHLCCN) field1297.method245();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1314[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1321) {
						var5[var7] = 0;
						HSCHLCCN var8 = new HSCHLCCN();
						var8.field688 = var4;
						var8.field690 = var7;
						var8.field691 = false;
						field1291.method243(var8);
						method502(var8);
						field1310 = true;

						if (field1307 < field1296) {
							field1307++;
						}

						field1284 = "Loading extra files - " + field1307 * 100 / field1296 + "%";
						field1305++;
						if (field1305 == 10) {
							return;
						}
					}
				}
			}

			field1321--;
		}
	}

	@ObfuscatedName("RKMPVAZH.a()I")
	public final int method499() {
		synchronized (field1309) {
			return field1309.method314();
		}
	}

	public final void run() {
		try {
			while (field1316) {
				field1302++;
				byte var1 = 20;
				if (field1321 == 0 && field1292.field313[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1310 = true;
				for (int var2 = 0; var2 < 100 && field1310; var2++) {
					field1310 = false;
					method515();
					method508();

					if (field1304 == 0 && var2 >= 5) {
						break;
					}

					method498();

					if (field1289 != null) {
						method500();
					}
				}

				boolean var3 = false;
				for (HSCHLCCN var4 = (HSCHLCCN) field1291.method246(); var4 != null; var4 = (HSCHLCCN) field1291.method248()) {
					if (var4.field691) {
						var3 = true;
						var4.field687++;
						if (var4.field687 > 50) {
							var4.field687 = 0;
							method502(var4);
						}
					}
				}

				if (!var3) {
					for (HSCHLCCN var5 = (HSCHLCCN) field1291.method246(); var5 != null; var5 = (HSCHLCCN) field1291.method248()) {
						var3 = true;
						var5.field687++;
						if (var5.field687 > 50) {
							var5.field687 = 0;
							method502(var5);
						}
					}
				}

				if (var3) {
					field1285++;
					if (field1285 > 750) {
						try {
							field1315.close();
						} catch (Exception var8) {
						}

						field1315 = null;
						field1289 = null;
						field1306 = null;
						field1318 = 0;
					}
				} else {
					field1285 = 0;
					field1284 = "";
				}

				if (field1292.field182 && field1315 != null && field1306 != null && (field1321 > 0 || field1292.field313[0] == null)) {
					field1288++;
					if (field1288 > 500) {
						field1288 = 0;
						field1313[0] = 0;
						field1313[1] = 0;
						field1313[2] = 0;
						field1313[3] = 10;
						try {
							field1306.write(field1313, 0, 4);
						} catch (IOException var7) {
							field1285 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("RKMPVAZH.a(B)V")
	public final void method500() {
		try {
			int var1 = field1289.available();
			if (field1318 == 0 && var1 >= 6) {
				field1310 = true;

				for (int var2 = 0; var2 < 6; var2 += field1289.read(field1313, var2, 6 - var2)) {
				}

				int var3 = field1313[0] & 0xFF;
				int var4 = ((field1313[1] & 0xFF) << 8) + (field1313[2] & 0xFF);
				int var5 = ((field1313[3] & 0xFF) << 8) + (field1313[4] & 0xFF);
				int var6 = field1313[5] & 0xFF;
				field1312 = null;
				for (HSCHLCCN var7 = (HSCHLCCN) field1291.method246(); var7 != null; var7 = (HSCHLCCN) field1291.method248()) {
					if (var7.field688 == var3 && var7.field690 == var4) {
						field1312 = var7;
					}

					if (field1312 != null) {
						var7.field687 = 0;
					}
				}

				if (field1312 != null) {
					field1285 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1312.field689 = null;

						if (field1312.field691) {
							synchronized (field1287) {
								field1287.method243(field1312);
							}
						} else {
							field1312.method589();
						}

						field1312 = null;
					} else {
						if (field1312.field689 == null && var6 == 0) {
							field1312.field689 = new byte[var5];
						}

						if (field1312.field689 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1317 = var6 * 500;
				field1318 = 500;
				if (field1318 > var5 - var6 * 500) {
					field1318 = var5 - var6 * 500;
				}
			}

			if (field1318 > 0 && var1 >= field1318) {
				field1310 = true;
				byte[] var9 = field1313;
				int var10 = 0;
				if (field1312 != null) {
					var9 = field1312.field689;
					var10 = field1317;
				}

				for (int var11 = 0; var11 < field1318; var11 += field1289.read(var9, var10 + var11, field1318 - var11)) {
				}

				if (field1318 + field1317 >= var9.length && field1312 != null) {
					if (field1292.field313[0] != null) {
						field1292.field313[field1312.field688 + 1].method489(field1312.field690, var9.length, var9);
					}

					if (!field1312.field691 && field1312.field688 == 3) {
						field1312.field691 = true;
						field1312.field688 = 93;
					}

					if (field1312.field691) {
						synchronized (field1287) {
							field1287.method243(field1312);
						}
					} else {
						field1312.method589();
					}
				}

				field1318 = 0;
			}
		} catch (IOException var17) {
			try {
				field1315.close();
			} catch (Exception var14) {
			}

			field1315 = null;
			field1289 = null;
			field1306 = null;
			field1318 = 0;
		}
	}

	@ObfuscatedName("RKMPVAZH.a(IBIB)V")
	public final void method501(int arg0, byte arg1, int arg2) {
		if (field1292.field313[0] != null && field1290[arg0][arg2] != 0) {
			byte[] var4 = field1292.field313[arg0 + 1].method488(arg2);
			if (!method512(var4, field1290[arg0][arg2], field1298[arg0][arg2])) {
				field1314[arg0][arg2] = arg1;

				if (arg1 > field1321) {
					field1321 = arg1;
				}

				field1296++;
			}
		}
	}

	@ObfuscatedName("RKMPVAZH.a(ILHSCHLCCN;)V")
	public final void method502(HSCHLCCN arg0) {
		try {
			if (field1315 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1301 < 4000L) {
					return;
				}

				field1301 = var2;
				field1315 = field1292.method177(client.field327 + 43594);
				field1289 = field1315.getInputStream();
				field1306 = field1315.getOutputStream();
				field1306.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1289.read();
				}

				field1285 = 0;
			}

			field1313[0] = (byte) arg0.field688;
			field1313[1] = (byte) (arg0.field690 >> 8);
			field1313[2] = (byte) arg0.field690;
			if (arg0.field691) {
				field1313[3] = 2;
			} else if (field1292.field182) {
				field1313[3] = 0;
			} else {
				field1313[3] = 1;
			}

			field1306.write(field1313, 0, 4);
			field1288 = 0;
			field1303 = -10000;
		} catch (IOException var7) {
			try {
				field1315.close();
			} catch (Exception var6) {
			}

			field1315 = null;
			field1289 = null;
			field1306 = null;
			field1318 = 0;
			field1303++;
		}
	}

	@ObfuscatedName("RKMPVAZH.a(ZI)Z")
	public final boolean method503(int arg0) {
		if (field1300[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("RKMPVAZH.a(IB)I")
	public final int method504(int arg0) {
		return field1293[arg0] & 0xFF;
	}

	@ObfuscatedName("RKMPVAZH.a(LIEMHZJLX;Lclient;)V")
	public final void method505(IEMHZJLX arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method242(var3[var4], null);
			int var6 = var5.length / 2;
			MVHXDWGI var7 = new MVHXDWGI(var5);
			field1290[var4] = new int[var6];
			field1314[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1290[var4][var8] = var7.method359();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method242(var9[var10], null);
			int var12 = var11.length / 4;
			MVHXDWGI var13 = new MVHXDWGI(var11);
			field1298[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1298[var10][var14] = var13.method362();
			}
		}

		byte[] var15 = arg0.method242("model_index", null);
		int var16 = field1290[0].length;
		field1293 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1293[var17] = var15[var17];
			} else {
				field1293[var17] = 0;
			}
		}

		byte[] var18 = arg0.method242("map_index", null);
		MVHXDWGI var19 = new MVHXDWGI(var18);
		int var20 = var18.length / 7;
		field1320 = new int[var20];
		field1311 = new int[var20];
		field1299 = new int[var20];
		field1322 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1320[var21] = var19.method359();
			field1311[var21] = var19.method359();
			field1299[var21] = var19.method359();
			field1322[var21] = var19.method357();
		}

		byte[] var22 = arg0.method242("anim_index", null);
		MVHXDWGI var23 = new MVHXDWGI(var22);
		int var24 = var22.length / 2;
		field1308 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1308[var25] = var23.method359();
		}

		byte[] var26 = arg0.method242("midi_index", null);
		MVHXDWGI var27 = new MVHXDWGI(var26);
		int var28 = var26.length;
		field1300 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1300[var29] = var27.method357();
		}

		field1292 = arg1;
		field1316 = true;
		field1292.method169(this, 2);
	}

	@ObfuscatedName("RKMPVAZH.a(Z)I")
	public final int method506() {
		return field1308.length;
	}

	@ObfuscatedName("RKMPVAZH.a(IIIZ)I")
	public final int method507(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field1320.length; var5++) {
			if (field1320[var5] == var4) {
				if (arg0 == 0) {
					return field1311[var5];
				}

				return field1299[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("RKMPVAZH.b(B)V")
	public final void method508() {
		field1304 = 0;
		field1305 = 0;
		for (HSCHLCCN var1 = (HSCHLCCN) field1291.method246(); var1 != null; var1 = (HSCHLCCN) field1291.method248()) {
			if (var1.field691) {
				field1304++;
			} else {
				field1305++;
			}
		}

		while (field1304 < 10) {
			HSCHLCCN var2 = (HSCHLCCN) field1294.method245();
			if (var2 == null) {
				break;
			}

			if (field1314[var2.field688][var2.field690] != 0) {
				field1307++;
			}

			field1314[var2.field688][var2.field690] = 0;
			field1291.method243(var2);
			field1304++;
			method502(var2);
			field1310 = true;
		}
	}

	@ObfuscatedName("RKMPVAZH.b()LHSCHLCCN;")
	public final HSCHLCCN method509() {
		HSCHLCCN var2;
		synchronized (field1287) {
			var2 = (HSCHLCCN) field1287.method245();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1309) {
			var2.method344();
		}

		if (var2.field689 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field689));
			while (true) {
				if (field1295.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1295, var4, field1295.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field689 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field689[var7] = field1295[var7];
		}

		return var2;
	}

	@ObfuscatedName("RKMPVAZH.a(IZ)V")
	public final void method510(boolean arg0) {
		int var2 = field1320.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1322[var3] != 0) {
				method501(3, (byte) 2, field1299[var3]);
				method501(3, (byte) 2, field1311[var3]);
			}
		}
	}

	@ObfuscatedName("RKMPVAZH.c()V")
	public final void method511() {
		field1316 = false;
	}

	@ObfuscatedName("RKMPVAZH.a([BIII)Z")
	public final boolean method512(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field1319.reset();
			field1319.update(arg0, 0, var4);
			int var6 = (int) field1319.getValue();

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

	@ObfuscatedName("RKMPVAZH.a(II)Z")
	public final boolean method513(int arg0) {
		for (int var2 = 0; var2 < field1320.length; var2++) {
			if (field1299[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("RKMPVAZH.b(ZI)I")
	public final int method514(int arg0) {
		return field1290[arg0].length;
	}

	@ObfuscatedName("RKMPVAZH.c(I)V")
	public final void method515() {
		HSCHLCCN var2;
		synchronized (field1286) {
			var2 = (HSCHLCCN) field1286.method245();
		}

		while (var2 != null) {
			field1310 = true;
			byte[] var3 = null;
			if (field1292.field313[0] != null) {
				var3 = field1292.field313[var2.field688 + 1].method488(var2.field690);
			}

			if (!method512(var3, field1290[var2.field688][var2.field690], field1298[var2.field688][var2.field690])) {
				var3 = null;
			}

			synchronized (field1286) {
				if (var3 == null) {
					field1294.method243(var2);
				} else {
					var2.field689 = var3;

					synchronized (field1287) {
						field1287.method243(var2);
					}
				}

				var2 = (HSCHLCCN) field1286.method245();
			}
		}
	}

	@ObfuscatedName("RKMPVAZH.b(II)V")
	public final void method516(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1290.length && arg1 >= 0 && arg1 <= field1290[arg0].length && field1290[arg0][arg1] != 0) {
			synchronized (field1309) {
				for (HSCHLCCN var4 = (HSCHLCCN) field1309.method312(); var4 != null; var4 = (HSCHLCCN) field1309.method313()) {
					if (var4.field688 == arg0 && var4.field690 == arg1) {
						return;
					}
				}

				HSCHLCCN var5 = new HSCHLCCN();
				var5.field688 = arg0;
				var5.field690 = arg1;
				var5.field691 = true;

				synchronized (field1286) {
					field1286.method243(var5);
				}

				field1309.method310(var5);
			}
		}
	}

	@ObfuscatedName("RKMPVAZH.a(BII)V")
	public final void method517(int arg0, int arg1) {
		if (field1292.field313[0] != null && (field1290[arg1][arg0] != 0 && (field1314[arg1][arg0] != 0 && field1321 != 0))) {
			HSCHLCCN var3 = new HSCHLCCN();
			var3.field688 = arg1;
			var3.field690 = arg0;
			var3.field691 = false;

			synchronized (field1297) {
				field1297.method243(var3);
			}
		}
	}

	@ObfuscatedName("RKMPVAZH.b(Z)V")
	public final void method518() {
		synchronized (field1297) {
			field1297.method250();
		}
	}
}
