package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("UCDUMMGN")
public class UCDUMMGN extends TIAIZSRH implements Runnable {

	@ObfuscatedName("UCDUMMGN.b")
	public byte[] field1264 = new byte[500];

	@ObfuscatedName("UCDUMMGN.i")
	public WCVCMGLX field1271 = new WCVCMGLX();

	@ObfuscatedName("UCDUMMGN.j")
	public WCVCMGLX field1272 = new WCVCMGLX();

	@ObfuscatedName("UCDUMMGN.m")
	public boolean field1275 = false;

	@ObfuscatedName("UCDUMMGN.s")
	public WCVCMGLX field1280 = new WCVCMGLX();

	@ObfuscatedName("UCDUMMGN.t")
	public byte[] field1281 = new byte[65000];

	@ObfuscatedName("UCDUMMGN.v")
	public WCVCMGLX field1283 = new WCVCMGLX();

	@ObfuscatedName("UCDUMMGN.w")
	public ABNYIQPF field1284 = new ABNYIQPF();

	@ObfuscatedName("UCDUMMGN.A")
	public int[][] field1287 = new int[4][];

	@ObfuscatedName("UCDUMMGN.D")
	public CRC32 field1290 = new CRC32();

	@ObfuscatedName("UCDUMMGN.E")
	public int[][] field1291 = new int[4][];

	@ObfuscatedName("UCDUMMGN.F")
	public String field1292 = "";

	@ObfuscatedName("UCDUMMGN.I")
	public WCVCMGLX field1295 = new WCVCMGLX();

	@ObfuscatedName("UCDUMMGN.K")
	public byte[][] field1297 = new byte[4][];

	@ObfuscatedName("UCDUMMGN.N")
	public boolean field1299 = true;

	@ObfuscatedName("UCDUMMGN.d")
	public int field1266;

	@ObfuscatedName("UCDUMMGN.e")
	public int field1267;

	@ObfuscatedName("UCDUMMGN.f")
	public int field1268;

	@ObfuscatedName("UCDUMMGN.g")
	public int field1269;

	@ObfuscatedName("UCDUMMGN.p")
	public int field1278;

	@ObfuscatedName("UCDUMMGN.y")
	public int field1286;

	@ObfuscatedName("UCDUMMGN.B")
	public int field1288;

	@ObfuscatedName("UCDUMMGN.G")
	public int field1293;

	@ObfuscatedName("UCDUMMGN.H")
	public int field1294;

	@ObfuscatedName("UCDUMMGN.J")
	public int field1296;

	@ObfuscatedName("UCDUMMGN.O")
	public int field1300;

	@ObfuscatedName("UCDUMMGN.L")
	public long field1298;

	@ObfuscatedName("UCDUMMGN.C")
	public HLJPLHON field1289;

	@ObfuscatedName("UCDUMMGN.x")
	public client field1285;

	@ObfuscatedName("UCDUMMGN.k")
	public InputStream field1273;

	@ObfuscatedName("UCDUMMGN.u")
	public OutputStream field1282;

	@ObfuscatedName("UCDUMMGN.h")
	public Socket field1270;

	@ObfuscatedName("UCDUMMGN.o")
	public byte[] field1277;

	@ObfuscatedName("UCDUMMGN.a")
	public int[] field1263;

	@ObfuscatedName("UCDUMMGN.c")
	public int[] field1265;

	@ObfuscatedName("UCDUMMGN.l")
	public int[] field1274;

	@ObfuscatedName("UCDUMMGN.n")
	public int[] field1276;

	@ObfuscatedName("UCDUMMGN.q")
	public int[] field1279;

	@ObfuscatedName("UCDUMMGN.P")
	public int[] field1301;

	@ObfuscatedName("UCDUMMGN.b(I)V")
	public final void method523() {
		synchronized (field1272) {
			field1272.method571();
		}
	}

	@ObfuscatedName("UCDUMMGN.a(IIZ[B)Z")
	public final boolean method524(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field1290.reset();
			field1290.update(arg2, 0, var4);
			int var6 = (int) field1290.getValue();

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

	@ObfuscatedName("UCDUMMGN.a(Z)V")
	public final void method525() {
		try {
			int var1 = field1273.available();
			if (field1294 == 0 && var1 >= 6) {
				field1275 = true;

				for (int var2 = 0; var2 < 6; var2 += field1273.read(field1264, var2, 6 - var2)) {
				}

				int var3 = field1264[0] & 0xFF;
				int var4 = ((field1264[1] & 0xFF) << 8) + (field1264[2] & 0xFF);
				int var5 = ((field1264[3] & 0xFF) << 8) + (field1264[4] & 0xFF);
				int var6 = field1264[5] & 0xFF;
				field1289 = null;
				for (HLJPLHON var7 = (HLJPLHON) field1295.method567(); var7 != null; var7 = (HLJPLHON) field1295.method569()) {
					if (var7.field757 == var3 && var7.field753 == var4) {
						field1289 = var7;
					}

					if (field1289 != null) {
						var7.field754 = 0;
					}
				}

				if (field1289 != null) {
					field1278 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1289.field755 = null;

						if (field1289.field756) {
							synchronized (field1280) {
								field1280.method564(field1289);
							}
						} else {
							field1289.method1();
						}

						field1289 = null;
					} else {
						if (field1289.field755 == null && var6 == 0) {
							field1289.field755 = new byte[var5];
						}

						if (field1289.field755 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1293 = var6 * 500;
				field1294 = 500;
				if (field1294 > var5 - var6 * 500) {
					field1294 = var5 - var6 * 500;
				}
			}

			if (field1294 > 0 && var1 >= field1294) {
				field1275 = true;
				byte[] var9 = field1264;
				int var10 = 0;
				if (field1289 != null) {
					var9 = field1289.field755;
					var10 = field1293;
				}

				for (int var11 = 0; var11 < field1294; var11 += field1273.read(var9, var10 + var11, field1294 - var11)) {
				}

				if (field1294 + field1293 >= var9.length && field1289 != null) {
					if (field1285.field522[0] != null) {
						field1285.field522[field1289.field757 + 1].method334(field1289.field753, var9, var9.length);
					}

					if (!field1289.field756 && field1289.field757 == 3) {
						field1289.field756 = true;
						field1289.field757 = 93;
					}

					if (field1289.field756) {
						synchronized (field1280) {
							field1280.method564(field1289);
						}
					} else {
						field1289.method1();
					}
				}

				field1294 = 0;
			}
		} catch (IOException var17) {
			try {
				field1270.close();
			} catch (Exception var14) {
			}

			field1270 = null;
			field1273 = null;
			field1282 = null;
			field1294 = 0;
		}
	}

	@ObfuscatedName("UCDUMMGN.a(IZ)Z")
	public final boolean method526(int arg0) {
		if (field1265[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UCDUMMGN.a(BIII)V")
	public final void method527(byte arg0, int arg1, int arg2) {
		if (field1285.field522[0] != null && field1291[arg2][arg1] != 0) {
			byte[] var4 = field1285.field522[arg2 + 1].method333(arg1);
			if (!method524(field1291[arg2][arg1], field1287[arg2][arg1], var4)) {
				field1297[arg2][arg1] = arg0;

				if (arg0 > field1268) {
					field1268 = arg0;
				}

				field1300++;
			}
		}
	}

	@ObfuscatedName("UCDUMMGN.a(LHLJPLHON;I)V")
	public final void method528(HLJPLHON arg0) {
		try {
			if (field1270 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1298 < 4000L) {
					return;
				}

				field1298 = var2;
				field1270 = field1285.method66(client.field245 + 43594);
				field1273 = field1270.getInputStream();
				field1282 = field1270.getOutputStream();
				field1282.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1273.read();
				}

				field1278 = 0;
			}

			field1264[0] = (byte) arg0.field757;
			field1264[1] = (byte) (arg0.field753 >> 8);
			field1264[2] = (byte) arg0.field753;
			if (arg0.field756) {
				field1264[3] = 2;
			} else if (field1285.field107) {
				field1264[3] = 0;
			} else {
				field1264[3] = 1;
			}

			field1282.write(field1264, 0, 4);
			field1269 = 0;
			field1286 = -10000;
		} catch (IOException var7) {
			try {
				field1270.close();
			} catch (Exception var6) {
			}

			field1270 = null;
			field1273 = null;
			field1282 = null;
			field1294 = 0;
			field1286++;
		}
	}

	@ObfuscatedName("UCDUMMGN.c(I)V")
	public final void method529() {
		field1266 = 0;
		field1267 = 0;
		for (HLJPLHON var1 = (HLJPLHON) field1295.method567(); var1 != null; var1 = (HLJPLHON) field1295.method569()) {
			if (var1.field756) {
				field1266++;
			} else {
				field1267++;
			}
		}

		while (field1266 < 10) {
			HLJPLHON var2 = (HLJPLHON) field1283.method566();
			if (var2 == null) {
				break;
			}

			if (field1297[var2.field757][var2.field753] != 0) {
				field1288++;
			}

			field1297[var2.field757][var2.field753] = 0;
			field1295.method564(var2);
			field1266++;
			method528(var2);
			field1275 = true;
		}
	}

	@ObfuscatedName("UCDUMMGN.a()I")
	public final int method530() {
		synchronized (field1284) {
			return field1284.method6();
		}
	}

	public final void run() {
		try {
			while (field1299) {
				field1296++;
				byte var1 = 20;
				if (field1268 == 0 && field1285.field522[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1275 = true;
				for (int var2 = 0; var2 < 100 && field1275; var2++) {
					field1275 = false;
					method534();
					method529();

					if (field1266 == 0 && var2 >= 5) {
						break;
					}

					method539();

					if (field1273 != null) {
						method525();
					}
				}

				boolean var3 = false;
				for (HLJPLHON var4 = (HLJPLHON) field1295.method567(); var4 != null; var4 = (HLJPLHON) field1295.method569()) {
					if (var4.field756) {
						var3 = true;
						var4.field754++;
						if (var4.field754 > 50) {
							var4.field754 = 0;
							method528(var4);
						}
					}
				}

				if (!var3) {
					for (HLJPLHON var5 = (HLJPLHON) field1295.method567(); var5 != null; var5 = (HLJPLHON) field1295.method569()) {
						var3 = true;
						var5.field754++;
						if (var5.field754 > 50) {
							var5.field754 = 0;
							method528(var5);
						}
					}
				}

				if (var3) {
					field1278++;
					if (field1278 > 750) {
						try {
							field1270.close();
						} catch (Exception var8) {
						}

						field1270 = null;
						field1273 = null;
						field1282 = null;
						field1294 = 0;
					}
				} else {
					field1278 = 0;
					field1292 = "";
				}

				if (field1285.field107 && field1270 != null && field1282 != null && (field1268 > 0 || field1285.field522[0] == null)) {
					field1269++;
					if (field1269 > 500) {
						field1269 = 0;
						field1264[0] = 0;
						field1264[1] = 0;
						field1264[2] = 0;
						field1264[3] = 10;
						try {
							field1282.write(field1264, 0, 4);
						} catch (IOException var7) {
							field1278 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("UCDUMMGN.b()V")
	public final void method531() {
		field1299 = false;
	}

	@ObfuscatedName("UCDUMMGN.a(LUUIGNTAD;Lclient;)V")
	public final void method532(UUIGNTAD arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method545(var3[var4], null);
			int var6 = var5.length / 2;
			CMGGUSPR var7 = new CMGGUSPR(var5);
			field1291[var4] = new int[var6];
			field1297[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1291[var4][var8] = var7.method196();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method545(var9[var10], null);
			int var12 = var11.length / 4;
			CMGGUSPR var13 = new CMGGUSPR(var11);
			field1287[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1287[var10][var14] = var13.method199();
			}
		}

		byte[] var15 = arg0.method545("model_index", null);
		int var16 = field1291[0].length;
		field1277 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1277[var17] = var15[var17];
			} else {
				field1277[var17] = 0;
			}
		}

		byte[] var18 = arg0.method545("map_index", null);
		CMGGUSPR var19 = new CMGGUSPR(var18);
		int var20 = var18.length / 7;
		field1263 = new int[var20];
		field1279 = new int[var20];
		field1301 = new int[var20];
		field1276 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1263[var21] = var19.method196();
			field1279[var21] = var19.method196();
			field1301[var21] = var19.method196();
			field1276[var21] = var19.method194();
		}

		byte[] var22 = arg0.method545("anim_index", null);
		CMGGUSPR var23 = new CMGGUSPR(var22);
		int var24 = var22.length / 2;
		field1274 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1274[var25] = var23.method196();
		}

		byte[] var26 = arg0.method545("midi_index", null);
		CMGGUSPR var27 = new CMGGUSPR(var26);
		int var28 = var26.length;
		field1265 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1265[var29] = var27.method194();
		}

		field1285 = arg1;
		field1299 = true;
		field1285.method97(this, 2);
	}

	@ObfuscatedName("UCDUMMGN.b(IZ)V")
	public final void method533(boolean arg0) {
		int var2 = field1263.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1276[var3] != 0) {
				method527((byte) 2, field1301[var3], 3);
				method527((byte) 2, field1279[var3], 3);
			}
		}
	}

	@ObfuscatedName("UCDUMMGN.b(Z)V")
	public final void method534() {
		HLJPLHON var2;
		synchronized (field1271) {
			var2 = (HLJPLHON) field1271.method566();
		}

		while (var2 != null) {
			field1275 = true;
			byte[] var3 = null;
			if (field1285.field522[0] != null) {
				var3 = field1285.field522[var2.field757 + 1].method333(var2.field753);
			}

			if (!method524(field1291[var2.field757][var2.field753], field1287[var2.field757][var2.field753], var3)) {
				var3 = null;
			}

			synchronized (field1271) {
				if (var3 == null) {
					field1283.method564(var2);
				} else {
					var2.field755 = var3;

					synchronized (field1280) {
						field1280.method564(var2);
					}
				}

				var2 = (HLJPLHON) field1271.method566();
			}
		}
	}

	@ObfuscatedName("UCDUMMGN.a(II)I")
	public final int method535(int arg0) {
		return field1277[arg0] & 0xFF;
	}

	@ObfuscatedName("UCDUMMGN.c()LHLJPLHON;")
	public final HLJPLHON method536() {
		HLJPLHON var2;
		synchronized (field1280) {
			var2 = (HLJPLHON) field1280.method566();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1284) {
			var2.method304();
		}

		if (var2.field755 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field755));
			while (true) {
				if (field1281.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1281, var4, field1281.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field755 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field755[var7] = field1281[var7];
		}

		return var2;
	}

	@ObfuscatedName("UCDUMMGN.a(B)I")
	public final int method537() {
		return field1274.length;
	}

	@ObfuscatedName("UCDUMMGN.a(I)V")
	public final void method501(int arg0) {
		method540(0, arg0);
	}

	@ObfuscatedName("UCDUMMGN.a(IIII)I")
	public final int method538(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field1263.length; var5++) {
			if (field1263[var5] == var4) {
				if (arg1 == 0) {
					return field1279[var5];
				}

				return field1301[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("UCDUMMGN.d(I)V")
	public final void method539() {
		while (field1266 == 0) {
			if (field1267 >= 10 || field1268 == 0) {
				return;
			}

			HLJPLHON var2;
			synchronized (field1272) {
				var2 = (HLJPLHON) field1272.method566();
			}

			while (var2 != null) {
				if (field1297[var2.field757][var2.field753] != 0) {
					field1297[var2.field757][var2.field753] = 0;
					field1295.method564(var2);
					method528(var2);
					field1275 = true;

					if (field1288 < field1300) {
						field1288++;
					}

					field1292 = "Loading extra files - " + field1288 * 100 / field1300 + "%";
					field1267++;
					if (field1267 == 10) {
						return;
					}
				}

				synchronized (field1272) {
					var2 = (HLJPLHON) field1272.method566();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1297[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1268) {
						var5[var7] = 0;
						HLJPLHON var8 = new HLJPLHON();
						var8.field757 = var4;
						var8.field753 = var7;
						var8.field756 = false;
						field1295.method564(var8);
						method528(var8);
						field1275 = true;

						if (field1288 < field1300) {
							field1288++;
						}

						field1292 = "Loading extra files - " + field1288 * 100 / field1300 + "%";
						field1267++;
						if (field1267 == 10) {
							return;
						}
					}
				}
			}

			field1268--;
		}
	}

	@ObfuscatedName("UCDUMMGN.b(II)V")
	public final void method540(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1291.length && arg1 >= 0 && arg1 <= field1291[arg0].length && field1291[arg0][arg1] != 0) {
			synchronized (field1284) {
				for (HLJPLHON var4 = (HLJPLHON) field1284.method4(); var4 != null; var4 = (HLJPLHON) field1284.method5()) {
					if (var4.field757 == arg0 && var4.field753 == arg1) {
						return;
					}
				}

				HLJPLHON var5 = new HLJPLHON();
				var5.field757 = arg0;
				var5.field753 = arg1;
				var5.field756 = true;

				synchronized (field1271) {
					field1271.method564(var5);
				}

				field1284.method2(var5);
			}
		}
	}

	@ObfuscatedName("UCDUMMGN.a(III)V")
	public final void method541(int arg0, int arg1) {
		if (field1285.field522[0] != null && (field1291[arg1][arg0] != 0 && (field1297[arg1][arg0] != 0 && field1268 != 0))) {
			HLJPLHON var3 = new HLJPLHON();
			var3.field757 = arg1;
			var3.field753 = arg0;
			var3.field756 = false;

			synchronized (field1272) {
				field1272.method564(var3);
			}
		}
	}

	@ObfuscatedName("UCDUMMGN.c(II)I")
	public final int method542(int arg0) {
		return field1291[arg0].length;
	}

	@ObfuscatedName("UCDUMMGN.a(IB)Z")
	public final boolean method543(int arg0) {
		for (int var2 = 0; var2 < field1263.length; var2++) {
			if (field1301[var2] == arg0) {
				return true;
			}
		}

		return false;
	}
}
