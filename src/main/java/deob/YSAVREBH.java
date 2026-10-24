package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("YSAVREBH")
public class YSAVREBH extends ETIUBBOA implements Runnable {

	@ObfuscatedName("YSAVREBH.b")
	public boolean field1426 = true;

	@ObfuscatedName("YSAVREBH.g")
	public byte[][] field1430 = new byte[4][];

	@ObfuscatedName("YSAVREBH.l")
	public FLJWGVEY field1434 = new FLJWGVEY();

	@ObfuscatedName("YSAVREBH.s")
	public FLJWGVEY field1440 = new FLJWGVEY();

	@ObfuscatedName("YSAVREBH.z")
	public boolean field1446 = false;

	@ObfuscatedName("YSAVREBH.A")
	public byte[] field1447 = new byte[500];

	@ObfuscatedName("YSAVREBH.B")
	public FLJWGVEY field1448 = new FLJWGVEY();

	@ObfuscatedName("YSAVREBH.F")
	public String field1452 = "";

	@ObfuscatedName("YSAVREBH.G")
	public FLJWGVEY field1453 = new FLJWGVEY();

	@ObfuscatedName("YSAVREBH.H")
	public int[][] field1454 = new int[4][];

	@ObfuscatedName("YSAVREBH.I")
	public int[][] field1455 = new int[4][];

	@ObfuscatedName("YSAVREBH.K")
	public UMTLOYSA field1456 = new UMTLOYSA();

	@ObfuscatedName("YSAVREBH.L")
	public byte[] field1457 = new byte[65000];

	@ObfuscatedName("YSAVREBH.U")
	public FLJWGVEY field1463 = new FLJWGVEY();

	@ObfuscatedName("YSAVREBH.V")
	public CRC32 field1464 = new CRC32();

	@ObfuscatedName("YSAVREBH.c")
	public int field1427;

	@ObfuscatedName("YSAVREBH.d")
	public int field1428;

	@ObfuscatedName("YSAVREBH.f")
	public int field1429;

	@ObfuscatedName("YSAVREBH.i")
	public int field1432;

	@ObfuscatedName("YSAVREBH.q")
	public int field1438;

	@ObfuscatedName("YSAVREBH.r")
	public int field1439;

	@ObfuscatedName("YSAVREBH.w")
	public int field1443;

	@ObfuscatedName("YSAVREBH.C")
	public int field1449;

	@ObfuscatedName("YSAVREBH.M")
	public int field1458;

	@ObfuscatedName("YSAVREBH.R")
	public int field1460;

	@ObfuscatedName("YSAVREBH.S")
	public int field1461;

	@ObfuscatedName("YSAVREBH.m")
	public long field1435;

	@ObfuscatedName("YSAVREBH.n")
	public CZKZHBFI field1436;

	@ObfuscatedName("YSAVREBH.x")
	public client field1444;

	@ObfuscatedName("YSAVREBH.y")
	public InputStream field1445;

	@ObfuscatedName("YSAVREBH.v")
	public OutputStream field1442;

	@ObfuscatedName("YSAVREBH.E")
	public Socket field1451;

	@ObfuscatedName("YSAVREBH.j")
	public byte[] field1433;

	@ObfuscatedName("YSAVREBH.h")
	public int[] field1431;

	@ObfuscatedName("YSAVREBH.p")
	public int[] field1437;

	@ObfuscatedName("YSAVREBH.t")
	public int[] field1441;

	@ObfuscatedName("YSAVREBH.D")
	public int[] field1450;

	@ObfuscatedName("YSAVREBH.Q")
	public int[] field1459;

	@ObfuscatedName("YSAVREBH.T")
	public int[] field1462;

	@ObfuscatedName("YSAVREBH.a(Z)V")
	public final void method583() {
		field1438 = 0;
		field1439 = 0;
		for (CZKZHBFI var1 = (CZKZHBFI) field1453.method275(); var1 != null; var1 = (CZKZHBFI) field1453.method277()) {
			if (var1.field612) {
				field1438++;
			} else {
				field1439++;
			}
		}

		while (field1438 < 10) {
			CZKZHBFI var2 = (CZKZHBFI) field1434.method274();
			if (var2 == null) {
				break;
			}

			if (field1430[var2.field614][var2.field615] != 0) {
				field1443++;
			}

			field1430[var2.field614][var2.field615] = 0;
			field1453.method272(var2);
			field1438++;
			method589(var2);
			field1446 = true;
		}
	}

	public final void run() {
		try {
			while (field1426) {
				field1429++;
				byte var1 = 20;
				if (field1449 == 0 && field1444.field500[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1446 = true;
				for (int var2 = 0; var2 < 100 && field1446; var2++) {
					field1446 = false;
					method602();
					method583();

					if (field1438 == 0 && var2 >= 5) {
						break;
					}

					method587();

					if (field1445 != null) {
						method596();
					}
				}

				boolean var3 = false;
				for (CZKZHBFI var4 = (CZKZHBFI) field1453.method275(); var4 != null; var4 = (CZKZHBFI) field1453.method277()) {
					if (var4.field612) {
						var3 = true;
						var4.field616++;
						if (var4.field616 > 50) {
							var4.field616 = 0;
							method589(var4);
						}
					}
				}

				if (!var3) {
					for (CZKZHBFI var5 = (CZKZHBFI) field1453.method275(); var5 != null; var5 = (CZKZHBFI) field1453.method277()) {
						var3 = true;
						var5.field616++;
						if (var5.field616 > 50) {
							var5.field616 = 0;
							method589(var5);
						}
					}
				}

				if (var3) {
					field1428++;
					if (field1428 > 750) {
						try {
							field1451.close();
						} catch (Exception var8) {
						}

						field1451 = null;
						field1445 = null;
						field1442 = null;
						field1461 = 0;
					}
				} else {
					field1428 = 0;
					field1452 = "";
				}

				if (field1444.field521 && field1451 != null && field1442 != null && (field1449 > 0 || field1444.field500[0] == null)) {
					field1432++;
					if (field1432 > 500) {
						field1432 = 0;
						field1447[0] = 0;
						field1447[1] = 0;
						field1447[2] = 0;
						field1447[3] = 10;
						try {
							field1442.write(field1447, 0, 4);
						} catch (IOException var7) {
							field1428 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("YSAVREBH.a(IIIB)V")
	public final void method584(int arg0, int arg1, byte arg2) {
		if (field1444.field500[0] != null && field1455[arg1][arg0] != 0) {
			byte[] var4 = field1444.field500[arg1 + 1].method31(arg0);
			if (!method591(field1455[arg1][arg0], var4, field1454[arg1][arg0])) {
				field1430[arg1][arg0] = arg2;

				if (arg2 > field1449) {
					field1449 = arg2;
				}

				field1427++;
			}
		}
	}

	@ObfuscatedName("YSAVREBH.a(II)V")
	public final void method585(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1455.length && arg1 >= 0 && arg1 <= field1455[arg0].length && field1455[arg0][arg1] != 0) {
			synchronized (field1456) {
				for (CZKZHBFI var4 = (CZKZHBFI) field1456.method468(); var4 != null; var4 = (CZKZHBFI) field1456.method469()) {
					if (var4.field614 == arg0 && var4.field615 == arg1) {
						return;
					}
				}

				CZKZHBFI var5 = new CZKZHBFI();
				var5.field614 = arg0;
				var5.field615 = arg1;
				var5.field612 = true;

				synchronized (field1463) {
					field1463.method272(var5);
				}

				field1456.method466(var5);
			}
		}
	}

	@ObfuscatedName("YSAVREBH.a(I)V")
	public final void method264(int arg0) {
		method585(0, arg0);
	}

	@ObfuscatedName("YSAVREBH.a(IZ)Z")
	public final boolean method586(int arg0) {
		if (field1441[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("YSAVREBH.b(I)V")
	public final void method587() {
		while (field1438 == 0) {
			if (field1439 >= 10 || field1449 == 0) {
				return;
			}

			CZKZHBFI var2;
			synchronized (field1440) {
				var2 = (CZKZHBFI) field1440.method274();
			}

			while (var2 != null) {
				if (field1430[var2.field614][var2.field615] != 0) {
					field1430[var2.field614][var2.field615] = 0;
					field1453.method272(var2);
					method589(var2);
					field1446 = true;

					if (field1443 < field1427) {
						field1443++;
					}

					field1452 = "Loading extra files - " + field1443 * 100 / field1427 + "%";
					field1439++;
					if (field1439 == 10) {
						return;
					}
				}

				synchronized (field1440) {
					var2 = (CZKZHBFI) field1440.method274();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1430[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1449) {
						var5[var7] = 0;
						CZKZHBFI var8 = new CZKZHBFI();
						var8.field614 = var4;
						var8.field615 = var7;
						var8.field612 = false;
						field1453.method272(var8);
						method589(var8);
						field1446 = true;

						if (field1443 < field1427) {
							field1443++;
						}

						field1452 = "Loading extra files - " + field1443 * 100 / field1427 + "%";
						field1439++;
						if (field1439 == 10) {
							return;
						}
					}
				}
			}

			field1449--;
		}
	}

	@ObfuscatedName("YSAVREBH.b(II)I")
	public final int method588(int arg0) {
		return field1455[arg0].length;
	}

	@ObfuscatedName("YSAVREBH.a(ZLCZKZHBFI;)V")
	public final void method589(CZKZHBFI arg0) {
		try {
			if (field1451 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1435 < 4000L) {
					return;
				}

				field1435 = var2;
				field1451 = field1444.method85(client.field213 + 43594);
				field1445 = field1451.getInputStream();
				field1442 = field1451.getOutputStream();
				field1442.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1445.read();
				}

				field1428 = 0;
			}

			field1447[0] = (byte) arg0.field614;
			field1447[1] = (byte) (arg0.field615 >> 8);
			field1447[2] = (byte) arg0.field615;
			if (arg0.field612) {
				field1447[3] = 2;
			} else if (field1444.field521) {
				field1447[3] = 0;
			} else {
				field1447[3] = 1;
			}

			field1442.write(field1447, 0, 4);
			field1432 = 0;
			field1458 = -10000;
		} catch (IOException var7) {
			try {
				field1451.close();
			} catch (Exception var6) {
			}

			field1451 = null;
			field1445 = null;
			field1442 = null;
			field1461 = 0;
			field1458++;
		}
	}

	@ObfuscatedName("YSAVREBH.a(BI)Z")
	public final boolean method590(int arg0) {
		for (int var2 = 0; var2 < field1437.length; var2++) {
			if (field1431[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("YSAVREBH.a(II[BI)Z")
	public final boolean method591(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field1464.reset();
			field1464.update(arg1, 0, var4);
			int var6 = (int) field1464.getValue();

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

	@ObfuscatedName("YSAVREBH.c(II)I")
	public final int method592(int arg0) {
		return field1433[arg0] & 0xFF;
	}

	@ObfuscatedName("YSAVREBH.a(LBBMKAXRK;Lclient;)V")
	public final void method593(BBMKAXRK arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method30(var3[var4], null);
			int var6 = var5.length / 2;
			EILHLJCE var7 = new EILHLJCE(var5);
			field1455[var4] = new int[var6];
			field1430[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1455[var4][var8] = var7.method226();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method30(var9[var10], null);
			int var12 = var11.length / 4;
			EILHLJCE var13 = new EILHLJCE(var11);
			field1454[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1454[var10][var14] = var13.method229();
			}
		}

		byte[] var15 = arg0.method30("model_index", null);
		int var16 = field1455[0].length;
		field1433 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1433[var17] = var15[var17];
			} else {
				field1433[var17] = 0;
			}
		}

		byte[] var18 = arg0.method30("map_index", null);
		EILHLJCE var19 = new EILHLJCE(var18);
		int var20 = var18.length / 7;
		field1437 = new int[var20];
		field1459 = new int[var20];
		field1431 = new int[var20];
		field1450 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1437[var21] = var19.method226();
			field1459[var21] = var19.method226();
			field1431[var21] = var19.method226();
			field1450[var21] = var19.method224();
		}

		byte[] var22 = arg0.method30("anim_index", null);
		EILHLJCE var23 = new EILHLJCE(var22);
		int var24 = var22.length / 2;
		field1462 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1462[var25] = var23.method226();
		}

		byte[] var26 = arg0.method30("midi_index", null);
		EILHLJCE var27 = new EILHLJCE(var26);
		int var28 = var26.length;
		field1441 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1441[var29] = var27.method224();
		}

		field1444 = arg1;
		field1426 = true;
		field1444.method23(this, 2);
	}

	@ObfuscatedName("YSAVREBH.a()I")
	public final int method594() {
		synchronized (field1456) {
			return field1456.method470();
		}
	}

	@ObfuscatedName("YSAVREBH.a(BZ)V")
	public final void method595(boolean arg0) {
		int var2 = field1437.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1450[var3] != 0) {
				method584(field1431[var3], 3, (byte) 2);
				method584(field1459[var3], 3, (byte) 2);
			}
		}
	}

	@ObfuscatedName("YSAVREBH.b(Z)V")
	public final void method596() {
		try {
			int var1 = field1445.available();
			if (field1461 == 0 && var1 >= 6) {
				field1446 = true;

				for (int var2 = 0; var2 < 6; var2 += field1445.read(field1447, var2, 6 - var2)) {
				}

				int var3 = field1447[0] & 0xFF;
				int var4 = ((field1447[1] & 0xFF) << 8) + (field1447[2] & 0xFF);
				int var5 = ((field1447[3] & 0xFF) << 8) + (field1447[4] & 0xFF);
				int var6 = field1447[5] & 0xFF;
				field1436 = null;
				for (CZKZHBFI var7 = (CZKZHBFI) field1453.method275(); var7 != null; var7 = (CZKZHBFI) field1453.method277()) {
					if (var7.field614 == var3 && var7.field615 == var4) {
						field1436 = var7;
					}

					if (field1436 != null) {
						var7.field616 = 0;
					}
				}

				if (field1436 != null) {
					field1428 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1436.field613 = null;

						if (field1436.field612) {
							synchronized (field1448) {
								field1448.method272(field1436);
							}
						} else {
							field1436.method334();
						}

						field1436 = null;
					} else {
						if (field1436.field613 == null && var6 == 0) {
							field1436.field613 = new byte[var5];
						}

						if (field1436.field613 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1460 = var6 * 500;
				field1461 = 500;
				if (field1461 > var5 - var6 * 500) {
					field1461 = var5 - var6 * 500;
				}
			}

			if (field1461 > 0 && var1 >= field1461) {
				field1446 = true;
				byte[] var9 = field1447;
				int var10 = 0;
				if (field1436 != null) {
					var9 = field1436.field613;
					var10 = field1460;
				}

				for (int var11 = 0; var11 < field1461; var11 += field1445.read(var9, var10 + var11, field1461 - var11)) {
				}

				if (field1461 + field1460 >= var9.length && field1436 != null) {
					if (field1444.field500[0] != null) {
						field1444.field500[field1436.field614 + 1].method32(var9.length, var9, field1436.field615);
					}

					if (!field1436.field612 && field1436.field614 == 3) {
						field1436.field612 = true;
						field1436.field614 = 93;
					}

					if (field1436.field612) {
						synchronized (field1448) {
							field1448.method272(field1436);
						}
					} else {
						field1436.method334();
					}
				}

				field1461 = 0;
			}
		} catch (IOException var17) {
			try {
				field1451.close();
			} catch (Exception var14) {
			}

			field1451 = null;
			field1445 = null;
			field1442 = null;
			field1461 = 0;
		}
	}

	@ObfuscatedName("YSAVREBH.c(I)I")
	public final int method597() {
		return field1462.length;
	}

	@ObfuscatedName("YSAVREBH.a(BII)V")
	public final void method598(int arg0, int arg1) {
		if (field1444.field500[0] != null && (field1455[arg1][arg0] != 0 && (field1430[arg1][arg0] != 0 && field1449 != 0))) {
			CZKZHBFI var3 = new CZKZHBFI();
			var3.field614 = arg1;
			var3.field615 = arg0;
			var3.field612 = false;

			synchronized (field1440) {
				field1440.method272(var3);
			}
		}
	}

	@ObfuscatedName("YSAVREBH.b()LCZKZHBFI;")
	public final CZKZHBFI method599() {
		CZKZHBFI var2;
		synchronized (field1448) {
			var2 = (CZKZHBFI) field1448.method274();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1456) {
			var2.method35();
		}

		if (var2.field613 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field613));
			while (true) {
				if (field1457.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1457, var4, field1457.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field613 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field613[var7] = field1457[var7];
		}

		return var2;
	}

	@ObfuscatedName("YSAVREBH.d(I)V")
	public final void method600() {
		synchronized (field1440) {
			field1440.method279();
		}
	}

	@ObfuscatedName("YSAVREBH.a(IIIZ)I")
	public final int method601(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < field1437.length; var5++) {
			if (field1437[var5] == var4) {
				if (arg2 == 0) {
					return field1459[var5];
				}

				return field1431[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("YSAVREBH.e(I)V")
	public final void method602() {
		CZKZHBFI var2;
		synchronized (field1463) {
			var2 = (CZKZHBFI) field1463.method274();
		}

		while (var2 != null) {
			field1446 = true;
			byte[] var3 = null;
			if (field1444.field500[0] != null) {
				var3 = field1444.field500[var2.field614 + 1].method31(var2.field615);
			}

			if (!method591(field1455[var2.field614][var2.field615], var3, field1454[var2.field614][var2.field615])) {
				var3 = null;
			}

			synchronized (field1463) {
				if (var3 == null) {
					field1434.method272(var2);
				} else {
					var2.field613 = var3;

					synchronized (field1448) {
						field1448.method272(var2);
					}
				}

				var2 = (CZKZHBFI) field1463.method274();
			}
		}
	}

	@ObfuscatedName("YSAVREBH.c()V")
	public final void method603() {
		field1426 = false;
	}
}
