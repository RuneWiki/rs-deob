package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("XZFDFADG")
public class XZFDFADG extends DEZPBSCS implements Runnable {

	@ObfuscatedName("XZFDFADG.b")
	public VYBZTNTY field1403 = new VYBZTNTY();

	@ObfuscatedName("XZFDFADG.f")
	public byte[] field1407 = new byte[65000];

	@ObfuscatedName("XZFDFADG.h")
	public int[][] field1409 = new int[4][];

	@ObfuscatedName("XZFDFADG.i")
	public VYBZTNTY field1410 = new VYBZTNTY();

	@ObfuscatedName("XZFDFADG.m")
	public VYBZTNTY field1414 = new VYBZTNTY();

	@ObfuscatedName("XZFDFADG.r")
	public byte[][] field1418 = new byte[4][];

	@ObfuscatedName("XZFDFADG.s")
	public byte[] field1419 = new byte[500];

	@ObfuscatedName("XZFDFADG.x")
	public String field1422 = "";

	@ObfuscatedName("XZFDFADG.A")
	public VYBZTNTY field1425 = new VYBZTNTY();

	@ObfuscatedName("XZFDFADG.C")
	public CRC32 field1427 = new CRC32();

	@ObfuscatedName("XZFDFADG.D")
	public boolean field1428 = false;

	@ObfuscatedName("XZFDFADG.K")
	public PNEYGONI field1434 = new PNEYGONI();

	@ObfuscatedName("XZFDFADG.M")
	public int[][] field1436 = new int[4][];

	@ObfuscatedName("XZFDFADG.N")
	public VYBZTNTY field1437 = new VYBZTNTY();

	@ObfuscatedName("XZFDFADG.Q")
	public boolean field1440 = true;

	@ObfuscatedName("XZFDFADG.c")
	public int field1404;

	@ObfuscatedName("XZFDFADG.d")
	public int field1405;

	@ObfuscatedName("XZFDFADG.k")
	public int field1412;

	@ObfuscatedName("XZFDFADG.l")
	public int field1413;

	@ObfuscatedName("XZFDFADG.n")
	public int field1415;

	@ObfuscatedName("XZFDFADG.t")
	public int field1420;

	@ObfuscatedName("XZFDFADG.y")
	public int field1423;

	@ObfuscatedName("XZFDFADG.B")
	public int field1426;

	@ObfuscatedName("XZFDFADG.E")
	public int field1429;

	@ObfuscatedName("XZFDFADG.I")
	public int field1432;

	@ObfuscatedName("XZFDFADG.J")
	public int field1433;

	@ObfuscatedName("XZFDFADG.o")
	public long field1416;

	@ObfuscatedName("XZFDFADG.z")
	public RPOURQXY field1424;

	@ObfuscatedName("XZFDFADG.a")
	public client field1402;

	@ObfuscatedName("XZFDFADG.O")
	public InputStream field1438;

	@ObfuscatedName("XZFDFADG.w")
	public OutputStream field1421;

	@ObfuscatedName("XZFDFADG.L")
	public Socket field1435;

	@ObfuscatedName("XZFDFADG.e")
	public byte[] field1406;

	@ObfuscatedName("XZFDFADG.g")
	public int[] field1408;

	@ObfuscatedName("XZFDFADG.j")
	public int[] field1411;

	@ObfuscatedName("XZFDFADG.p")
	public int[] field1417;

	@ObfuscatedName("XZFDFADG.F")
	public int[] field1430;

	@ObfuscatedName("XZFDFADG.H")
	public int[] field1431;

	@ObfuscatedName("XZFDFADG.P")
	public int[] field1439;

	@ObfuscatedName("XZFDFADG.a()LRPOURQXY;")
	public final RPOURQXY method557() {
		RPOURQXY var2;
		synchronized (field1410) {
			var2 = (RPOURQXY) field1410.method518();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1434) {
			var2.method384();
		}

		if (var2.field1228 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1228));
			while (true) {
				if (field1407.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1407, var4, field1407.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1228 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1228[var7] = field1407[var7];
		}

		return var2;
	}

	@ObfuscatedName("XZFDFADG.a(II)Z")
	public final boolean method558(int arg0) {
		if (field1439[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("XZFDFADG.b(I)V")
	public final void method559() {
		try {
			int var1 = field1438.available();
			if (field1413 == 0 && var1 >= 6) {
				field1428 = true;

				for (int var2 = 0; var2 < 6; var2 += field1438.read(field1419, var2, 6 - var2)) {
				}

				int var3 = field1419[0] & 0xFF;
				int var4 = ((field1419[1] & 0xFF) << 8) + (field1419[2] & 0xFF);
				int var5 = ((field1419[3] & 0xFF) << 8) + (field1419[4] & 0xFF);
				int var6 = field1419[5] & 0xFF;
				field1424 = null;
				for (RPOURQXY var7 = (RPOURQXY) field1403.method519(); var7 != null; var7 = (RPOURQXY) field1403.method521()) {
					if (var7.field1229 == var3 && var7.field1227 == var4) {
						field1424 = var7;
					}

					if (field1424 != null) {
						var7.field1226 = 0;
					}
				}

				if (field1424 != null) {
					field1433 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1424.field1228 = null;

						if (field1424.field1230) {
							synchronized (field1410) {
								field1410.method516(field1424);
							}
						} else {
							field1424.method19();
						}

						field1424 = null;
					} else {
						if (field1424.field1228 == null && var6 == 0) {
							field1424.field1228 = new byte[var5];
						}

						if (field1424.field1228 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1412 = var6 * 500;
				field1413 = 500;
				if (field1413 > var5 - var6 * 500) {
					field1413 = var5 - var6 * 500;
				}
			}

			if (field1413 > 0 && var1 >= field1413) {
				field1428 = true;
				byte[] var9 = field1419;
				int var10 = 0;
				if (field1424 != null) {
					var9 = field1424.field1228;
					var10 = field1412;
				}

				for (int var11 = 0; var11 < field1413; var11 += field1438.read(var9, var10 + var11, field1413 - var11)) {
				}

				if (field1413 + field1412 >= var9.length && field1424 != null) {
					if (field1402.field428[0] != null) {
						field1402.field428[field1424.field1229 + 1].method550(field1424.field1227, var9, var9.length);
					}

					if (!field1424.field1230 && field1424.field1229 == 3) {
						field1424.field1230 = true;
						field1424.field1229 = 93;
					}

					if (field1424.field1230) {
						synchronized (field1410) {
							field1410.method516(field1424);
						}
					} else {
						field1424.method19();
					}
				}

				field1413 = 0;
			}
		} catch (IOException var17) {
			try {
				field1435.close();
			} catch (Exception var14) {
			}

			field1435 = null;
			field1438 = null;
			field1421 = null;
			field1413 = 0;
		}
	}

	@ObfuscatedName("XZFDFADG.a(ZZ)V")
	public final void method560(boolean arg0) {
		int var2 = field1417.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1431[var3] != 0) {
				method569(3, (byte) 2, field1408[var3]);
				method569(3, (byte) 2, field1411[var3]);
			}
		}
	}

	@ObfuscatedName("XZFDFADG.a(IIII)I")
	public final int method561(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < field1417.length; var5++) {
			if (field1417[var5] == var4) {
				if (arg2 == 0) {
					return field1411[var5];
				}

				return field1408[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("XZFDFADG.b(II)I")
	public final int method562(int arg0) {
		return field1406[arg0] & 0xFF;
	}

	@ObfuscatedName("XZFDFADG.c(II)I")
	public final int method563(int arg0) {
		return field1409[arg0].length;
	}

	@ObfuscatedName("XZFDFADG.c(I)I")
	public final int method564() {
		return field1430.length;
	}

	@ObfuscatedName("XZFDFADG.a([BIII)Z")
	public final boolean method565(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field1427.reset();
			field1427.update(arg0, 0, var4);
			int var6 = (int) field1427.getValue();

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

	@ObfuscatedName("XZFDFADG.a(B)V")
	public final void method566() {
		while (field1404 == 0) {
			if (field1405 >= 10 || field1420 == 0) {
				return;
			}

			RPOURQXY var2;
			synchronized (field1437) {
				var2 = (RPOURQXY) field1437.method518();
			}

			while (var2 != null) {
				if (field1418[var2.field1229][var2.field1227] != 0) {
					field1418[var2.field1229][var2.field1227] = 0;
					field1403.method516(var2);
					method575(var2);
					field1428 = true;

					if (field1415 < field1426) {
						field1415++;
					}

					field1422 = "Loading extra files - " + field1415 * 100 / field1426 + "%";
					field1405++;
					if (field1405 == 10) {
						return;
					}
				}

				synchronized (field1437) {
					var2 = (RPOURQXY) field1437.method518();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1418[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1420) {
						var5[var7] = 0;
						RPOURQXY var8 = new RPOURQXY();
						var8.field1229 = var4;
						var8.field1227 = var7;
						var8.field1230 = false;
						field1403.method516(var8);
						method575(var8);
						field1428 = true;

						if (field1415 < field1426) {
							field1415++;
						}

						field1422 = "Loading extra files - " + field1415 * 100 / field1426 + "%";
						field1405++;
						if (field1405 == 10) {
							return;
						}
					}
				}
			}

			field1420--;
		}
	}

	@ObfuscatedName("XZFDFADG.d(II)Z")
	public final boolean method567(int arg0) {
		for (int var2 = 0; var2 < field1417.length; var2++) {
			if (field1408[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("XZFDFADG.b()I")
	public final int method568() {
		synchronized (field1434) {
			return field1434.method442();
		}
	}

	@ObfuscatedName("XZFDFADG.a(IBII)V")
	public final void method569(int arg0, byte arg1, int arg2) {
		if (field1402.field428[0] != null && field1409[arg0][arg2] != 0) {
			byte[] var4 = field1402.field428[arg0 + 1].method549(arg2);
			if (!method565(var4, field1409[arg0][arg2], field1436[arg0][arg2])) {
				field1418[arg0][arg2] = arg1;

				if (arg1 > field1420) {
					field1420 = arg1;
				}

				field1426++;
			}
		}
	}

	@ObfuscatedName("XZFDFADG.d(I)V")
	public final void method570() {
		synchronized (field1437) {
			field1437.method523();
		}
	}

	@ObfuscatedName("XZFDFADG.a(LDTIATKJO;Lclient;)V")
	public final void method571(DTIATKJO arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method168(var3[var4], null);
			int var6 = var5.length / 2;
			GHHPHSRU var7 = new GHHPHSRU(var5);
			field1409[var4] = new int[var6];
			field1418[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1409[var4][var8] = var7.method204();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method168(var9[var10], null);
			int var12 = var11.length / 4;
			GHHPHSRU var13 = new GHHPHSRU(var11);
			field1436[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1436[var10][var14] = var13.method207();
			}
		}

		byte[] var15 = arg0.method168("model_index", null);
		int var16 = field1409[0].length;
		field1406 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1406[var17] = var15[var17];
			} else {
				field1406[var17] = 0;
			}
		}

		byte[] var18 = arg0.method168("map_index", null);
		GHHPHSRU var19 = new GHHPHSRU(var18);
		int var20 = var18.length / 7;
		field1417 = new int[var20];
		field1411 = new int[var20];
		field1408 = new int[var20];
		field1431 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1417[var21] = var19.method204();
			field1411[var21] = var19.method204();
			field1408[var21] = var19.method204();
			field1431[var21] = var19.method202();
		}

		byte[] var22 = arg0.method168("anim_index", null);
		GHHPHSRU var23 = new GHHPHSRU(var22);
		int var24 = var22.length / 2;
		field1430 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1430[var25] = var23.method204();
		}

		byte[] var26 = arg0.method168("midi_index", null);
		GHHPHSRU var27 = new GHHPHSRU(var26);
		int var28 = var26.length;
		field1439 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1439[var29] = var27.method202();
		}

		field1402 = arg1;
		field1440 = true;
		field1402.method12(this, 2);
	}

	@ObfuscatedName("XZFDFADG.c()V")
	public final void method572() {
		field1440 = false;
	}

	@ObfuscatedName("XZFDFADG.e(I)V")
	public final void method573() {
		field1404 = 0;
		field1405 = 0;
		for (RPOURQXY var1 = (RPOURQXY) field1403.method519(); var1 != null; var1 = (RPOURQXY) field1403.method521()) {
			if (var1.field1230) {
				field1404++;
			} else {
				field1405++;
			}
		}

		while (field1404 < 10) {
			RPOURQXY var2 = (RPOURQXY) field1425.method518();
			if (var2 == null) {
				break;
			}

			if (field1418[var2.field1229][var2.field1227] != 0) {
				field1415++;
			}

			field1418[var2.field1229][var2.field1227] = 0;
			field1403.method516(var2);
			field1404++;
			method575(var2);
			field1428 = true;
		}
	}

	@ObfuscatedName("XZFDFADG.f(I)V")
	public final void method574() {
		RPOURQXY var2;
		synchronized (field1414) {
			var2 = (RPOURQXY) field1414.method518();
		}

		while (var2 != null) {
			field1428 = true;
			byte[] var3 = null;
			if (field1402.field428[0] != null) {
				var3 = field1402.field428[var2.field1229 + 1].method549(var2.field1227);
			}

			if (!method565(var3, field1409[var2.field1229][var2.field1227], field1436[var2.field1229][var2.field1227])) {
				var3 = null;
			}

			synchronized (field1414) {
				if (var3 == null) {
					field1425.method516(var2);
				} else {
					var2.field1228 = var3;

					synchronized (field1410) {
						field1410.method516(var2);
					}
				}

				var2 = (RPOURQXY) field1414.method518();
			}
		}
	}

	@ObfuscatedName("XZFDFADG.a(BLRPOURQXY;)V")
	public final void method575(RPOURQXY arg0) {
		try {
			if (field1435 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1416 < 4000L) {
					return;
				}

				field1416 = var2;
				field1435 = field1402.method119(client.field238 + 43594);
				field1438 = field1435.getInputStream();
				field1421 = field1435.getOutputStream();
				field1421.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1438.read();
				}

				field1433 = 0;
			}

			field1419[0] = (byte) arg0.field1229;
			field1419[1] = (byte) (arg0.field1227 >> 8);
			field1419[2] = (byte) arg0.field1227;
			if (arg0.field1230) {
				field1419[3] = 2;
			} else if (field1402.field206) {
				field1419[3] = 0;
			} else {
				field1419[3] = 1;
			}

			field1421.write(field1419, 0, 4);
			field1429 = 0;
			field1423 = -10000;
		} catch (IOException var7) {
			try {
				field1435.close();
			} catch (Exception var6) {
			}

			field1435 = null;
			field1438 = null;
			field1421 = null;
			field1413 = 0;
			field1423++;
		}
	}

	@ObfuscatedName("XZFDFADG.e(II)V")
	public final void method576(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1409.length && arg1 >= 0 && arg1 <= field1409[arg0].length && field1409[arg0][arg1] != 0) {
			synchronized (field1434) {
				for (RPOURQXY var4 = (RPOURQXY) field1434.method440(); var4 != null; var4 = (RPOURQXY) field1434.method441()) {
					if (var4.field1229 == arg0 && var4.field1227 == arg1) {
						return;
					}
				}

				RPOURQXY var5 = new RPOURQXY();
				var5.field1229 = arg0;
				var5.field1227 = arg1;
				var5.field1230 = true;

				synchronized (field1414) {
					field1414.method516(var5);
				}

				field1434.method438(var5);
			}
		}
	}

	@ObfuscatedName("XZFDFADG.a(III)V")
	public final void method577(int arg0, int arg1) {
		if (field1402.field428[0] != null && (field1409[arg1][arg0] != 0 && (field1418[arg1][arg0] != 0 && field1420 != 0))) {
			RPOURQXY var3 = new RPOURQXY();
			var3.field1229 = arg1;
			var3.field1227 = arg0;
			var3.field1230 = false;

			synchronized (field1437) {
				field1437.method516(var3);
			}
		}
	}

	public final void run() {
		try {
			while (field1440) {
				field1432++;
				byte var1 = 20;
				if (field1420 == 0 && field1402.field428[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1428 = true;
				for (int var2 = 0; var2 < 100 && field1428; var2++) {
					field1428 = false;
					method574();
					method573();

					if (field1404 == 0 && var2 >= 5) {
						break;
					}

					method566();

					if (field1438 != null) {
						method559();
					}
				}

				boolean var3 = false;
				for (RPOURQXY var4 = (RPOURQXY) field1403.method519(); var4 != null; var4 = (RPOURQXY) field1403.method521()) {
					if (var4.field1230) {
						var3 = true;
						var4.field1226++;
						if (var4.field1226 > 50) {
							var4.field1226 = 0;
							method575(var4);
						}
					}
				}

				if (!var3) {
					for (RPOURQXY var5 = (RPOURQXY) field1403.method519(); var5 != null; var5 = (RPOURQXY) field1403.method521()) {
						var3 = true;
						var5.field1226++;
						if (var5.field1226 > 50) {
							var5.field1226 = 0;
							method575(var5);
						}
					}
				}

				if (var3) {
					field1433++;
					if (field1433 > 750) {
						try {
							field1435.close();
						} catch (Exception var8) {
						}

						field1435 = null;
						field1438 = null;
						field1421 = null;
						field1413 = 0;
					}
				} else {
					field1433 = 0;
					field1422 = "";
				}

				if (field1402.field206 && field1435 != null && field1421 != null && (field1420 > 0 || field1402.field428[0] == null)) {
					field1429++;
					if (field1429 > 500) {
						field1429 = 0;
						field1419[0] = 0;
						field1419[1] = 0;
						field1419[2] = 0;
						field1419[3] = 10;
						try {
							field1421.write(field1419, 0, 4);
						} catch (IOException var7) {
							field1433 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("XZFDFADG.a(I)V")
	public final void method166(int arg0) {
		method576(0, arg0);
	}
}
