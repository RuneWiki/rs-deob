package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("WNPVPVVL")
public class WNPVPVVL extends YXDYQWQG implements Runnable {

	@ObfuscatedName("WNPVPVVL.a")
	public LVGEETWD field1259 = new LVGEETWD();

	@ObfuscatedName("WNPVPVVL.b")
	public FOKYUBQV field1260 = new FOKYUBQV();

	@ObfuscatedName("WNPVPVVL.d")
	public byte[][] field1262 = new byte[4][];

	@ObfuscatedName("WNPVPVVL.e")
	public byte[] field1263 = new byte[65000];

	@ObfuscatedName("WNPVPVVL.w")
	public FOKYUBQV field1278 = new FOKYUBQV();

	@ObfuscatedName("WNPVPVVL.x")
	public byte[] field1279 = new byte[500];

	@ObfuscatedName("WNPVPVVL.z")
	public FOKYUBQV field1281 = new FOKYUBQV();

	@ObfuscatedName("WNPVPVVL.A")
	public CRC32 field1282 = new CRC32();

	@ObfuscatedName("WNPVPVVL.B")
	public FOKYUBQV field1283 = new FOKYUBQV();

	@ObfuscatedName("WNPVPVVL.H")
	public boolean field1288 = true;

	@ObfuscatedName("WNPVPVVL.L")
	public int[][] field1291 = new int[4][];

	@ObfuscatedName("WNPVPVVL.N")
	public FOKYUBQV field1292 = new FOKYUBQV();

	@ObfuscatedName("WNPVPVVL.O")
	public int[][] field1293 = new int[4][];

	@ObfuscatedName("WNPVPVVL.Q")
	public boolean field1295 = false;

	@ObfuscatedName("WNPVPVVL.S")
	public String field1296 = "";

	@ObfuscatedName("WNPVPVVL.c")
	public int field1261;

	@ObfuscatedName("WNPVPVVL.k")
	public int field1267;

	@ObfuscatedName("WNPVPVVL.l")
	public int field1268;

	@ObfuscatedName("WNPVPVVL.m")
	public int field1269;

	@ObfuscatedName("WNPVPVVL.q")
	public int field1272;

	@ObfuscatedName("WNPVPVVL.t")
	public int field1275;

	@ObfuscatedName("WNPVPVVL.v")
	public int field1277;

	@ObfuscatedName("WNPVPVVL.D")
	public int field1285;

	@ObfuscatedName("WNPVPVVL.E")
	public int field1286;

	@ObfuscatedName("WNPVPVVL.I")
	public int field1289;

	@ObfuscatedName("WNPVPVVL.J")
	public int field1290;

	@ObfuscatedName("WNPVPVVL.f")
	public long field1264;

	@ObfuscatedName("WNPVPVVL.s")
	public WHTATTJS field1274;

	@ObfuscatedName("WNPVPVVL.T")
	public client field1297;

	@ObfuscatedName("WNPVPVVL.y")
	public InputStream field1280;

	@ObfuscatedName("WNPVPVVL.u")
	public OutputStream field1276;

	@ObfuscatedName("WNPVPVVL.h")
	public Socket field1266;

	@ObfuscatedName("WNPVPVVL.C")
	public byte[] field1284;

	@ObfuscatedName("WNPVPVVL.g")
	public int[] field1265;

	@ObfuscatedName("WNPVPVVL.n")
	public int[] field1270;

	@ObfuscatedName("WNPVPVVL.p")
	public int[] field1271;

	@ObfuscatedName("WNPVPVVL.r")
	public int[] field1273;

	@ObfuscatedName("WNPVPVVL.F")
	public int[] field1287;

	@ObfuscatedName("WNPVPVVL.P")
	public int[] field1294;

	@ObfuscatedName("WNPVPVVL.a(IB)I")
	public final int method439(int arg0) {
		return field1293[arg0].length;
	}

	@ObfuscatedName("WNPVPVVL.a(IIZ[B)Z")
	public final boolean method440(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field1282.reset();
			field1282.update(arg2, 0, var4);
			int var6 = (int) field1282.getValue();

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

	@ObfuscatedName("WNPVPVVL.a()LWHTATTJS;")
	public final WHTATTJS method441() {
		WHTATTJS var2;
		synchronized (field1260) {
			var2 = (WHTATTJS) field1260.method198();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1259) {
			var2.method537();
		}

		if (var2.field1210 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1210));
			while (true) {
				if (field1263.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1263, var4, field1263.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1210 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1210[var7] = field1263[var7];
		}

		return var2;
	}

	public final void run() {
		try {
			while (field1288) {
				field1272++;
				byte var1 = 20;
				if (field1261 == 0 && field1297.field173[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1295 = true;
				for (int var2 = 0; var2 < 100 && field1295; var2++) {
					field1295 = false;
					method446();
					method460();

					if (field1289 == 0 && var2 >= 5) {
						break;
					}

					method450();

					if (field1280 != null) {
						method457();
					}
				}

				boolean var3 = false;
				for (WHTATTJS var4 = (WHTATTJS) field1278.method199(); var4 != null; var4 = (WHTATTJS) field1278.method201()) {
					if (var4.field1208) {
						var3 = true;
						var4.field1207++;
						if (var4.field1207 > 50) {
							var4.field1207 = 0;
							method453(var4);
						}
					}
				}

				if (!var3) {
					for (WHTATTJS var5 = (WHTATTJS) field1278.method199(); var5 != null; var5 = (WHTATTJS) field1278.method201()) {
						var3 = true;
						var5.field1207++;
						if (var5.field1207 > 50) {
							var5.field1207 = 0;
							method453(var5);
						}
					}
				}

				if (var3) {
					field1268++;
					if (field1268 > 750) {
						try {
							field1266.close();
						} catch (Exception var8) {
						}

						field1266 = null;
						field1280 = null;
						field1276 = null;
						field1286 = 0;
					}
				} else {
					field1268 = 0;
					field1296 = "";
				}

				if (field1297.field307 && field1266 != null && field1276 != null && (field1261 > 0 || field1297.field173[0] == null)) {
					field1269++;
					if (field1269 > 500) {
						field1269 = 0;
						field1279[0] = 0;
						field1279[1] = 0;
						field1279[2] = 0;
						field1279[3] = 10;
						try {
							field1276.write(field1279, 0, 4);
						} catch (IOException var7) {
							field1268 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("WNPVPVVL.a(LXMRRKSSB;Lclient;)V")
	public final void method442(XMRRKSSB arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method465(var3[var4], null);
			int var6 = var5.length / 2;
			XQPFGONL var7 = new XQPFGONL(var5);
			field1293[var4] = new int[var6];
			field1262[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1293[var4][var8] = var7.method480();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method465(var9[var10], null);
			int var12 = var11.length / 4;
			XQPFGONL var13 = new XQPFGONL(var11);
			field1291[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1291[var10][var14] = var13.method483();
			}
		}

		byte[] var15 = arg0.method465("model_index", null);
		int var16 = field1293[0].length;
		field1284 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1284[var17] = var15[var17];
			} else {
				field1284[var17] = 0;
			}
		}

		byte[] var18 = arg0.method465("map_index", null);
		XQPFGONL var19 = new XQPFGONL(var18);
		int var20 = var18.length / 7;
		field1265 = new int[var20];
		field1294 = new int[var20];
		field1270 = new int[var20];
		field1271 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1265[var21] = var19.method480();
			field1294[var21] = var19.method480();
			field1270[var21] = var19.method480();
			field1271[var21] = var19.method478();
		}

		byte[] var22 = arg0.method465("anim_index", null);
		XQPFGONL var23 = new XQPFGONL(var22);
		int var24 = var22.length / 2;
		field1287 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1287[var25] = var23.method480();
		}

		byte[] var26 = arg0.method465("midi_index", null);
		XQPFGONL var27 = new XQPFGONL(var26);
		int var28 = var26.length;
		field1273 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1273[var29] = var27.method478();
		}

		field1297 = arg1;
		field1288 = true;
		field1297.method102(this, 2);
	}

	@ObfuscatedName("WNPVPVVL.a(B)I")
	public final int method443() {
		return field1287.length;
	}

	@ObfuscatedName("WNPVPVVL.a(I)V")
	public final void method444(int arg0) {
		method451(0, arg0);
	}

	@ObfuscatedName("WNPVPVVL.a(IZ)Z")
	public final boolean method445(int arg0) {
		for (int var2 = 0; var2 < field1265.length; var2++) {
			if (field1270[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("WNPVPVVL.b(I)V")
	public final void method446() {
		WHTATTJS var2;
		synchronized (field1292) {
			var2 = (WHTATTJS) field1292.method198();
		}

		while (var2 != null) {
			field1295 = true;
			byte[] var3 = null;
			if (field1297.field173[0] != null) {
				var3 = field1297.field173[var2.field1209 + 1].method229(var2.field1206);
			}

			if (!method440(field1293[var2.field1209][var2.field1206], field1291[var2.field1209][var2.field1206], var3)) {
				var3 = null;
			}

			synchronized (field1292) {
				if (var3 == null) {
					field1281.method196(var2);
				} else {
					var2.field1210 = var3;

					synchronized (field1260) {
						field1260.method196(var2);
					}
				}

				var2 = (WHTATTJS) field1292.method198();
			}
		}
	}

	@ObfuscatedName("WNPVPVVL.a(IIIB)V")
	public final void method447(int arg0, int arg1, byte arg2) {
		if (field1297.field173[0] != null && field1293[arg1][arg0] != 0) {
			byte[] var4 = field1297.field173[arg1 + 1].method229(arg0);
			if (!method440(field1293[arg1][arg0], field1291[arg1][arg0], var4)) {
				field1262[arg1][arg0] = arg2;

				if (arg2 > field1261) {
					field1261 = arg2;
				}

				field1275++;
			}
		}
	}

	@ObfuscatedName("WNPVPVVL.a(III)V")
	public final void method448(int arg0, int arg1) {
		if (field1297.field173[0] != null && (field1293[arg0][arg1] != 0 && (field1262[arg0][arg1] != 0 && field1261 != 0))) {
			WHTATTJS var3 = new WHTATTJS();
			var3.field1209 = arg0;
			var3.field1206 = arg1;
			var3.field1208 = false;

			synchronized (field1283) {
				field1283.method196(var3);
			}
		}
	}

	@ObfuscatedName("WNPVPVVL.a(IIII)I")
	public final int method449(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field1265.length; var5++) {
			if (field1265[var5] == var4) {
				if (arg1 == 0) {
					return field1294[var5];
				}

				return field1270[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("WNPVPVVL.c(I)V")
	public final void method450() {
		while (field1289 == 0) {
			if (field1290 >= 10 || field1261 == 0) {
				return;
			}

			WHTATTJS var2;
			synchronized (field1283) {
				var2 = (WHTATTJS) field1283.method198();
			}

			while (var2 != null) {
				if (field1262[var2.field1209][var2.field1206] != 0) {
					field1262[var2.field1209][var2.field1206] = 0;
					field1278.method196(var2);
					method453(var2);
					field1295 = true;

					if (field1267 < field1275) {
						field1267++;
					}

					field1296 = "Loading extra files - " + field1267 * 100 / field1275 + "%";
					field1290++;
					if (field1290 == 10) {
						return;
					}
				}

				synchronized (field1283) {
					var2 = (WHTATTJS) field1283.method198();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1262[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1261) {
						var5[var7] = 0;
						WHTATTJS var8 = new WHTATTJS();
						var8.field1209 = var4;
						var8.field1206 = var7;
						var8.field1208 = false;
						field1278.method196(var8);
						method453(var8);
						field1295 = true;

						if (field1267 < field1275) {
							field1267++;
						}

						field1296 = "Loading extra files - " + field1267 * 100 / field1275 + "%";
						field1290++;
						if (field1290 == 10) {
							return;
						}
					}
				}
			}

			field1261--;
		}
	}

	@ObfuscatedName("WNPVPVVL.a(II)V")
	public final void method451(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1293.length && arg1 >= 0 && arg1 <= field1293[arg0].length && field1293[arg0][arg1] != 0) {
			synchronized (field1259) {
				for (WHTATTJS var4 = (WHTATTJS) field1259.method359(); var4 != null; var4 = (WHTATTJS) field1259.method360()) {
					if (var4.field1209 == arg0 && var4.field1206 == arg1) {
						return;
					}
				}

				WHTATTJS var5 = new WHTATTJS();
				var5.field1209 = arg0;
				var5.field1206 = arg1;
				var5.field1208 = true;

				synchronized (field1292) {
					field1292.method196(var5);
				}

				field1259.method357(var5);
			}
		}
	}

	@ObfuscatedName("WNPVPVVL.b(II)Z")
	public final boolean method452(int arg0) {
		if (field1273[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("WNPVPVVL.a(ILWHTATTJS;)V")
	public final void method453(WHTATTJS arg0) {
		try {
			if (field1266 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1264 < 4000L) {
					return;
				}

				field1264 = var2;
				field1266 = field1297.method36(client.field199 + 43594);
				field1280 = field1266.getInputStream();
				field1276 = field1266.getOutputStream();
				field1276.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1280.read();
				}

				field1268 = 0;
			}

			field1279[0] = (byte) arg0.field1209;
			field1279[1] = (byte) (arg0.field1206 >> 8);
			field1279[2] = (byte) arg0.field1206;
			if (arg0.field1208) {
				field1279[3] = 2;
			} else if (field1297.field307) {
				field1279[3] = 0;
			} else {
				field1279[3] = 1;
			}

			field1276.write(field1279, 0, 4);
			field1269 = 0;
			field1277 = -10000;
		} catch (IOException var7) {
			try {
				field1266.close();
			} catch (Exception var6) {
			}

			field1266 = null;
			field1280 = null;
			field1276 = null;
			field1286 = 0;
			field1277++;
		}
	}

	@ObfuscatedName("WNPVPVVL.d(I)V")
	public final void method454() {
		synchronized (field1283) {
			field1283.method203();
		}
	}

	@ObfuscatedName("WNPVPVVL.a(ZZ)V")
	public final void method455(boolean arg0) {
		int var2 = field1265.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1271[var3] != 0) {
				method447(field1270[var3], 3, (byte) 2);
				method447(field1294[var3], 3, (byte) 2);
			}
		}
	}

	@ObfuscatedName("WNPVPVVL.b()I")
	public final int method456() {
		synchronized (field1259) {
			return field1259.method361();
		}
	}

	@ObfuscatedName("WNPVPVVL.e(I)V")
	public final void method457() {
		try {
			int var1 = field1280.available();
			if (field1286 == 0 && var1 >= 6) {
				field1295 = true;

				for (int var2 = 0; var2 < 6; var2 += field1280.read(field1279, var2, 6 - var2)) {
				}

				int var3 = field1279[0] & 0xFF;
				int var4 = ((field1279[1] & 0xFF) << 8) + (field1279[2] & 0xFF);
				int var5 = ((field1279[3] & 0xFF) << 8) + (field1279[4] & 0xFF);
				int var6 = field1279[5] & 0xFF;
				field1274 = null;
				for (WHTATTJS var7 = (WHTATTJS) field1278.method199(); var7 != null; var7 = (WHTATTJS) field1278.method201()) {
					if (var7.field1209 == var3 && var7.field1206 == var4) {
						field1274 = var7;
					}

					if (field1274 != null) {
						var7.field1207 = 0;
					}
				}

				if (field1274 != null) {
					field1268 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1274.field1210 = null;

						if (field1274.field1208) {
							synchronized (field1260) {
								field1260.method196(field1274);
							}
						} else {
							field1274.method195();
						}

						field1274 = null;
					} else {
						if (field1274.field1210 == null && var6 == 0) {
							field1274.field1210 = new byte[var5];
						}

						if (field1274.field1210 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1285 = var6 * 500;
				field1286 = 500;
				if (field1286 > var5 - var6 * 500) {
					field1286 = var5 - var6 * 500;
				}
			}

			if (field1286 > 0 && var1 >= field1286) {
				field1295 = true;
				byte[] var9 = field1279;
				int var10 = 0;
				if (field1274 != null) {
					var9 = field1274.field1210;
					var10 = field1285;
				}

				for (int var11 = 0; var11 < field1286; var11 += field1280.read(var9, var10 + var11, field1286 - var11)) {
				}

				if (field1286 + field1285 >= var9.length && field1274 != null) {
					if (field1297.field173[0] != null) {
						field1297.field173[field1274.field1209 + 1].method230(field1274.field1206, var9, var9.length);
					}

					if (!field1274.field1208 && field1274.field1209 == 3) {
						field1274.field1208 = true;
						field1274.field1209 = 93;
					}

					if (field1274.field1208) {
						synchronized (field1260) {
							field1260.method196(field1274);
						}
					} else {
						field1274.method195();
					}
				}

				field1286 = 0;
			}
		} catch (IOException var17) {
			try {
				field1266.close();
			} catch (Exception var14) {
			}

			field1266 = null;
			field1280 = null;
			field1276 = null;
			field1286 = 0;
		}
	}

	@ObfuscatedName("WNPVPVVL.c(II)I")
	public final int method458(int arg0) {
		return field1284[arg0] & 0xFF;
	}

	@ObfuscatedName("WNPVPVVL.c()V")
	public final void method459() {
		field1288 = false;
	}

	@ObfuscatedName("WNPVPVVL.f(I)V")
	public final void method460() {
		field1289 = 0;
		field1290 = 0;
		for (WHTATTJS var1 = (WHTATTJS) field1278.method199(); var1 != null; var1 = (WHTATTJS) field1278.method201()) {
			if (var1.field1208) {
				field1289++;
			} else {
				field1290++;
			}
		}

		while (field1289 < 10) {
			WHTATTJS var2 = (WHTATTJS) field1281.method198();
			if (var2 == null) {
				break;
			}

			if (field1262[var2.field1209][var2.field1206] != 0) {
				field1267++;
			}

			field1262[var2.field1209][var2.field1206] = 0;
			field1278.method196(var2);
			field1289++;
			method453(var2);
			field1295 = true;
		}
	}
}
