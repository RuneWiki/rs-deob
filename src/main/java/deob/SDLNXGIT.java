package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("SDLNXGIT")
public class SDLNXGIT extends PYBVVALT implements Runnable {

	@ObfuscatedName("SDLNXGIT.a")
	public int[][] field1215 = new int[4][];

	@ObfuscatedName("SDLNXGIT.b")
	public String field1216 = "";

	@ObfuscatedName("SDLNXGIT.c")
	public RKSMLTCN field1217 = new RKSMLTCN();

	@ObfuscatedName("SDLNXGIT.d")
	public byte[][] field1218 = new byte[4][];

	@ObfuscatedName("SDLNXGIT.e")
	public byte[] field1219 = new byte[65000];

	@ObfuscatedName("SDLNXGIT.o")
	public EWLVMFRK field1227 = new EWLVMFRK();

	@ObfuscatedName("SDLNXGIT.t")
	public boolean field1231 = true;

	@ObfuscatedName("SDLNXGIT.y")
	public byte[] field1236 = new byte[500];

	@ObfuscatedName("SDLNXGIT.B")
	public EWLVMFRK field1239 = new EWLVMFRK();

	@ObfuscatedName("SDLNXGIT.D")
	public EWLVMFRK field1241 = new EWLVMFRK();

	@ObfuscatedName("SDLNXGIT.E")
	public CRC32 field1242 = new CRC32();

	@ObfuscatedName("SDLNXGIT.I")
	public EWLVMFRK field1244 = new EWLVMFRK();

	@ObfuscatedName("SDLNXGIT.J")
	public int[][] field1245 = new int[4][];

	@ObfuscatedName("SDLNXGIT.L")
	public boolean field1247 = false;

	@ObfuscatedName("SDLNXGIT.S")
	public EWLVMFRK field1252 = new EWLVMFRK();

	@ObfuscatedName("SDLNXGIT.n")
	public int field1226;

	@ObfuscatedName("SDLNXGIT.p")
	public int field1228;

	@ObfuscatedName("SDLNXGIT.q")
	public int field1229;

	@ObfuscatedName("SDLNXGIT.v")
	public int field1233;

	@ObfuscatedName("SDLNXGIT.w")
	public int field1234;

	@ObfuscatedName("SDLNXGIT.x")
	public int field1235;

	@ObfuscatedName("SDLNXGIT.A")
	public int field1238;

	@ObfuscatedName("SDLNXGIT.H")
	public int field1243;

	@ObfuscatedName("SDLNXGIT.K")
	public int field1246;

	@ObfuscatedName("SDLNXGIT.N")
	public int field1248;

	@ObfuscatedName("SDLNXGIT.Q")
	public int field1250;

	@ObfuscatedName("SDLNXGIT.i")
	public long field1222;

	@ObfuscatedName("SDLNXGIT.j")
	public ZLBJQGSS field1223;

	@ObfuscatedName("SDLNXGIT.u")
	public client field1232;

	@ObfuscatedName("SDLNXGIT.z")
	public InputStream field1237;

	@ObfuscatedName("SDLNXGIT.R")
	public OutputStream field1251;

	@ObfuscatedName("SDLNXGIT.k")
	public Socket field1224;

	@ObfuscatedName("SDLNXGIT.T")
	public byte[] field1253;

	@ObfuscatedName("SDLNXGIT.f")
	public int[] field1220;

	@ObfuscatedName("SDLNXGIT.g")
	public int[] field1221;

	@ObfuscatedName("SDLNXGIT.l")
	public int[] field1225;

	@ObfuscatedName("SDLNXGIT.r")
	public int[] field1230;

	@ObfuscatedName("SDLNXGIT.C")
	public int[] field1240;

	@ObfuscatedName("SDLNXGIT.P")
	public int[] field1249;

	@ObfuscatedName("SDLNXGIT.a(II)I")
	public final int method429(int arg0) {
		return field1215[arg0].length;
	}

	@ObfuscatedName("SDLNXGIT.b(II)V")
	public final void method430(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1215.length && arg1 >= 0 && arg1 <= field1215[arg0].length && field1215[arg0][arg1] != 0) {
			synchronized (field1217) {
				for (ZLBJQGSS var4 = (ZLBJQGSS) field1217.method407(); var4 != null; var4 = (ZLBJQGSS) field1217.method408()) {
					if (var4.field1484 == arg0 && var4.field1485 == arg1) {
						return;
					}
				}

				ZLBJQGSS var5 = new ZLBJQGSS();
				var5.field1484 = arg0;
				var5.field1485 = arg1;
				var5.field1486 = true;

				synchronized (field1244) {
					field1244.method198(var5);
				}

				field1217.method405(var5);
			}
		}
	}

	@ObfuscatedName("SDLNXGIT.a(B)V")
	public final void method431() {
		while (field1228 == 0) {
			if (field1229 >= 10 || field1226 == 0) {
				return;
			}

			ZLBJQGSS var2;
			synchronized (field1227) {
				var2 = (ZLBJQGSS) field1227.method200();
			}

			while (var2 != null) {
				if (field1218[var2.field1484][var2.field1485] != 0) {
					field1218[var2.field1484][var2.field1485] = 0;
					field1239.method198(var2);
					method444(var2);
					field1247 = true;

					if (field1250 < field1238) {
						field1250++;
					}

					field1216 = "Loading extra files - " + field1250 * 100 / field1238 + "%";
					field1229++;
					if (field1229 == 10) {
						return;
					}
				}

				synchronized (field1227) {
					var2 = (ZLBJQGSS) field1227.method200();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1218[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1226) {
						var5[var7] = 0;
						ZLBJQGSS var8 = new ZLBJQGSS();
						var8.field1484 = var4;
						var8.field1485 = var7;
						var8.field1486 = false;
						field1239.method198(var8);
						method444(var8);
						field1247 = true;

						if (field1250 < field1238) {
							field1250++;
						}

						field1216 = "Loading extra files - " + field1250 * 100 / field1238 + "%";
						field1229++;
						if (field1229 == 10) {
							return;
						}
					}
				}
			}

			field1226--;
		}
	}

	@ObfuscatedName("SDLNXGIT.a(ZZ)V")
	public final void method432(boolean arg0) {
		int var2 = field1220.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1221[var3] != 0) {
				method446(3, field1249[var3], (byte) 2);
				method446(3, field1230[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("SDLNXGIT.b(I)I")
	public final int method433() {
		return field1225.length;
	}

	@ObfuscatedName("SDLNXGIT.a(ZII[B)Z")
	public final boolean method434(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field1242.reset();
			field1242.update(arg2, 0, var4);
			int var6 = (int) field1242.getValue();

			if (arg1 != var5) {
				return false;
			}

			if (arg0 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("SDLNXGIT.a(Z)V")
	public final void method435() {
		ZLBJQGSS var2;
		synchronized (field1244) {
			var2 = (ZLBJQGSS) field1244.method200();
		}

		while (var2 != null) {
			field1247 = true;
			byte[] var3 = null;
			if (field1232.field443[0] != null) {
				var3 = field1232.field443[var2.field1484 + 1].method392(var2.field1485);
			}

			if (!method434(field1245[var2.field1484][var2.field1485], field1215[var2.field1484][var2.field1485], var3)) {
				var3 = null;
			}

			synchronized (field1244) {
				if (var3 == null) {
					field1252.method198(var2);
				} else {
					var2.field1487 = var3;

					synchronized (field1241) {
						field1241.method198(var2);
					}
				}

				var2 = (ZLBJQGSS) field1244.method200();
			}
		}
	}

	@ObfuscatedName("SDLNXGIT.b(B)V")
	public final void method436() {
		field1228 = 0;
		field1229 = 0;
		for (ZLBJQGSS var1 = (ZLBJQGSS) field1239.method201(); var1 != null; var1 = (ZLBJQGSS) field1239.method203()) {
			if (var1.field1486) {
				field1228++;
			} else {
				field1229++;
			}
		}

		while (field1228 < 10) {
			ZLBJQGSS var2 = (ZLBJQGSS) field1252.method200();
			if (var2 == null) {
				break;
			}

			if (field1218[var2.field1484][var2.field1485] != 0) {
				field1250++;
			}

			field1218[var2.field1484][var2.field1485] = 0;
			field1239.method198(var2);
			field1228++;
			method444(var2);
			field1247 = true;
		}
	}

	@ObfuscatedName("SDLNXGIT.a()LZLBJQGSS;")
	public final ZLBJQGSS method437() {
		ZLBJQGSS var2;
		synchronized (field1241) {
			var2 = (ZLBJQGSS) field1241.method200();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1217) {
			var2.method357();
		}

		if (var2.field1487 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1487));
			while (true) {
				if (field1219.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1219, var4, field1219.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1487 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1487[var7] = field1219[var7];
		}

		return var2;
	}

	@ObfuscatedName("SDLNXGIT.a(IIZI)I")
	public final int method438(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field1220.length; var5++) {
			if (field1220[var5] == var4) {
				if (arg0 == 0) {
					return field1230[var5];
				}

				return field1249[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("SDLNXGIT.c(II)I")
	public final int method439(int arg0) {
		return field1253[arg0] & 0xFF;
	}

	@ObfuscatedName("SDLNXGIT.b()I")
	public final int method440() {
		synchronized (field1217) {
			return field1217.method409();
		}
	}

	@ObfuscatedName("SDLNXGIT.a(III)V")
	public final void method441(int arg0, int arg1) {
		if (field1232.field443[0] != null && (field1215[arg0][arg1] != 0 && (field1218[arg0][arg1] != 0 && field1226 != 0))) {
			ZLBJQGSS var3 = new ZLBJQGSS();
			var3.field1484 = arg0;
			var3.field1485 = arg1;
			var3.field1486 = false;

			synchronized (field1227) {
				field1227.method198(var3);
			}
		}
	}

	@ObfuscatedName("SDLNXGIT.c()V")
	public final void method442() {
		field1231 = false;
	}

	@ObfuscatedName("SDLNXGIT.d(II)Z")
	public final boolean method443(int arg0) {
		for (int var2 = 0; var2 < field1220.length; var2++) {
			if (field1249[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("SDLNXGIT.a(LZLBJQGSS;Z)V")
	public final void method444(ZLBJQGSS arg0) {
		try {
			if (field1224 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1222 < 4000L) {
					return;
				}

				field1222 = var2;
				field1224 = field1232.method85(client.field334 + 43594);
				field1237 = field1224.getInputStream();
				field1251 = field1224.getOutputStream();
				field1251.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1237.read();
				}

				field1243 = 0;
			}

			field1236[0] = (byte) arg0.field1484;
			field1236[1] = (byte) (arg0.field1485 >> 8);
			field1236[2] = (byte) arg0.field1485;
			if (arg0.field1486) {
				field1236[3] = 2;
			} else if (field1232.field404) {
				field1236[3] = 0;
			} else {
				field1236[3] = 1;
			}

			field1251.write(field1236, 0, 4);
			field1235 = 0;
			field1246 = -10000;
		} catch (IOException var7) {
			try {
				field1224.close();
			} catch (Exception var6) {
			}

			field1224 = null;
			field1237 = null;
			field1251 = null;
			field1234 = 0;
			field1246++;
		}
	}

	@ObfuscatedName("SDLNXGIT.a(I)V")
	public final void method400(int arg0) {
		method430(0, arg0);
	}

	@ObfuscatedName("SDLNXGIT.c(B)V")
	public final void method445() {
		synchronized (field1227) {
			field1227.method205();
		}
	}

	@ObfuscatedName("SDLNXGIT.a(IIIB)V")
	public final void method446(int arg0, int arg1, byte arg2) {
		if (field1232.field443[0] != null && field1215[arg0][arg1] != 0) {
			byte[] var4 = field1232.field443[arg0 + 1].method392(arg1);
			if (!method434(field1245[arg0][arg1], field1215[arg0][arg1], var4)) {
				field1218[arg0][arg1] = arg2;

				if (arg2 > field1226) {
					field1226 = arg2;
				}

				field1238++;
			}
		}
	}

	public final void run() {
		try {
			while (field1231) {
				field1248++;
				byte var1 = 20;
				if (field1226 == 0 && field1232.field443[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1247 = true;
				for (int var2 = 0; var2 < 100 && field1247; var2++) {
					field1247 = false;
					method435();
					method436();

					if (field1228 == 0 && var2 >= 5) {
						break;
					}

					method431();

					if (field1237 != null) {
						method447();
					}
				}

				boolean var3 = false;
				for (ZLBJQGSS var4 = (ZLBJQGSS) field1239.method201(); var4 != null; var4 = (ZLBJQGSS) field1239.method203()) {
					if (var4.field1486) {
						var3 = true;
						var4.field1483++;
						if (var4.field1483 > 50) {
							var4.field1483 = 0;
							method444(var4);
						}
					}
				}

				if (!var3) {
					for (ZLBJQGSS var5 = (ZLBJQGSS) field1239.method201(); var5 != null; var5 = (ZLBJQGSS) field1239.method203()) {
						var3 = true;
						var5.field1483++;
						if (var5.field1483 > 50) {
							var5.field1483 = 0;
							method444(var5);
						}
					}
				}

				if (var3) {
					field1243++;
					if (field1243 > 750) {
						try {
							field1224.close();
						} catch (Exception var8) {
						}

						field1224 = null;
						field1237 = null;
						field1251 = null;
						field1234 = 0;
					}
				} else {
					field1243 = 0;
					field1216 = "";
				}

				if (field1232.field404 && field1224 != null && field1251 != null && (field1226 > 0 || field1232.field443[0] == null)) {
					field1235++;
					if (field1235 > 500) {
						field1235 = 0;
						field1236[0] = 0;
						field1236[1] = 0;
						field1236[2] = 0;
						field1236[3] = 10;
						try {
							field1251.write(field1236, 0, 4);
						} catch (IOException var7) {
							field1243 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("SDLNXGIT.c(I)V")
	public final void method447() {
		try {
			int var1 = field1237.available();
			if (field1234 == 0 && var1 >= 6) {
				field1247 = true;

				for (int var2 = 0; var2 < 6; var2 += field1237.read(field1236, var2, 6 - var2)) {
				}

				int var3 = field1236[0] & 0xFF;
				int var4 = ((field1236[1] & 0xFF) << 8) + (field1236[2] & 0xFF);
				int var5 = ((field1236[3] & 0xFF) << 8) + (field1236[4] & 0xFF);
				int var6 = field1236[5] & 0xFF;
				field1223 = null;
				for (ZLBJQGSS var7 = (ZLBJQGSS) field1239.method201(); var7 != null; var7 = (ZLBJQGSS) field1239.method203()) {
					if (var7.field1484 == var3 && var7.field1485 == var4) {
						field1223 = var7;
					}

					if (field1223 != null) {
						var7.field1483 = 0;
					}
				}

				if (field1223 != null) {
					field1243 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1223.field1487 = null;

						if (field1223.field1486) {
							synchronized (field1241) {
								field1241.method198(field1223);
							}
						} else {
							field1223.method396();
						}

						field1223 = null;
					} else {
						if (field1223.field1487 == null && var6 == 0) {
							field1223.field1487 = new byte[var5];
						}

						if (field1223.field1487 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1233 = var6 * 500;
				field1234 = 500;
				if (field1234 > var5 - var6 * 500) {
					field1234 = var5 - var6 * 500;
				}
			}

			if (field1234 > 0 && var1 >= field1234) {
				field1247 = true;
				byte[] var9 = field1236;
				int var10 = 0;
				if (field1223 != null) {
					var9 = field1223.field1487;
					var10 = field1233;
				}

				for (int var11 = 0; var11 < field1234; var11 += field1237.read(var9, var10 + var11, field1234 - var11)) {
				}

				if (field1234 + field1233 >= var9.length && field1223 != null) {
					if (field1232.field443[0] != null) {
						field1232.field443[field1223.field1484 + 1].method393(var9, var9.length, field1223.field1485);
					}

					if (!field1223.field1486 && field1223.field1484 == 3) {
						field1223.field1486 = true;
						field1223.field1484 = 93;
					}

					if (field1223.field1486) {
						synchronized (field1241) {
							field1241.method198(field1223);
						}
					} else {
						field1223.method396();
					}
				}

				field1234 = 0;
			}
		} catch (IOException var17) {
			try {
				field1224.close();
			} catch (Exception var14) {
			}

			field1224 = null;
			field1237 = null;
			field1251 = null;
			field1234 = 0;
		}
	}

	@ObfuscatedName("SDLNXGIT.a(LQKFGLETG;Lclient;)V")
	public final void method448(QKFGLETG arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method402(var3[var4], null);
			int var6 = var5.length / 2;
			XJCNBMKS var7 = new XJCNBMKS(var5);
			field1215[var4] = new int[var6];
			field1218[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1215[var4][var8] = var7.method536();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method402(var9[var10], null);
			int var12 = var11.length / 4;
			XJCNBMKS var13 = new XJCNBMKS(var11);
			field1245[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1245[var10][var14] = var13.method539();
			}
		}

		byte[] var15 = arg0.method402("model_index", null);
		int var16 = field1215[0].length;
		field1253 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1253[var17] = var15[var17];
			} else {
				field1253[var17] = 0;
			}
		}

		byte[] var18 = arg0.method402("map_index", null);
		XJCNBMKS var19 = new XJCNBMKS(var18);
		int var20 = var18.length / 7;
		field1220 = new int[var20];
		field1230 = new int[var20];
		field1249 = new int[var20];
		field1221 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1220[var21] = var19.method536();
			field1230[var21] = var19.method536();
			field1249[var21] = var19.method536();
			field1221[var21] = var19.method534();
		}

		byte[] var22 = arg0.method402("anim_index", null);
		XJCNBMKS var23 = new XJCNBMKS(var22);
		int var24 = var22.length / 2;
		field1225 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1225[var25] = var23.method536();
		}

		byte[] var26 = arg0.method402("midi_index", null);
		XJCNBMKS var27 = new XJCNBMKS(var26);
		int var28 = var26.length;
		field1240 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1240[var29] = var27.method534();
		}

		field1232 = arg1;
		field1231 = true;
		field1232.method106(this, 2);
	}

	@ObfuscatedName("SDLNXGIT.e(II)Z")
	public final boolean method449(int arg0) {
		if (field1240[arg0] == 1) {
			return true;
		}

		return false;
	}
}
