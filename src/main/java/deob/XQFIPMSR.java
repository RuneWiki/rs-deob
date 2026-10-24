package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("XQFIPMSR")
public class XQFIPMSR extends GXEJXMMH implements Runnable {

	@ObfuscatedName("XQFIPMSR.a")
	public byte[] field1437 = new byte[500];

	@ObfuscatedName("XQFIPMSR.d")
	public boolean field1440 = false;

	@ObfuscatedName("XQFIPMSR.g")
	public DMMTBJKZ field1442 = new DMMTBJKZ();

	@ObfuscatedName("XQFIPMSR.j")
	public int[][] field1445 = new int[4][];

	@ObfuscatedName("XQFIPMSR.k")
	public boolean field1446 = true;

	@ObfuscatedName("XQFIPMSR.p")
	public DMMTBJKZ field1451 = new DMMTBJKZ();

	@ObfuscatedName("XQFIPMSR.t")
	public byte[][] field1453 = new byte[4][];

	@ObfuscatedName("XQFIPMSR.u")
	public DMMTBJKZ field1454 = new DMMTBJKZ();

	@ObfuscatedName("XQFIPMSR.v")
	public HRSVWDNF field1455 = new HRSVWDNF();

	@ObfuscatedName("XQFIPMSR.y")
	public CRC32 field1456 = new CRC32();

	@ObfuscatedName("XQFIPMSR.E")
	public byte[] field1462 = new byte[65000];

	@ObfuscatedName("XQFIPMSR.G")
	public DMMTBJKZ field1464 = new DMMTBJKZ();

	@ObfuscatedName("XQFIPMSR.K")
	public DMMTBJKZ field1467 = new DMMTBJKZ();

	@ObfuscatedName("XQFIPMSR.M")
	public String field1469 = "";

	@ObfuscatedName("XQFIPMSR.O")
	public int[][] field1471 = new int[4][];

	@ObfuscatedName("XQFIPMSR.e")
	public int field1441;

	@ObfuscatedName("XQFIPMSR.i")
	public int field1444;

	@ObfuscatedName("XQFIPMSR.l")
	public int field1447;

	@ObfuscatedName("XQFIPMSR.m")
	public int field1448;

	@ObfuscatedName("XQFIPMSR.z")
	public int field1457;

	@ObfuscatedName("XQFIPMSR.H")
	public int field1465;

	@ObfuscatedName("XQFIPMSR.I")
	public int field1466;

	@ObfuscatedName("XQFIPMSR.L")
	public int field1468;

	@ObfuscatedName("XQFIPMSR.Q")
	public int field1473;

	@ObfuscatedName("XQFIPMSR.R")
	public int field1474;

	@ObfuscatedName("XQFIPMSR.S")
	public int field1475;

	@ObfuscatedName("XQFIPMSR.P")
	public long field1472;

	@ObfuscatedName("XQFIPMSR.D")
	public PKGIHVSX field1461;

	@ObfuscatedName("XQFIPMSR.F")
	public client field1463;

	@ObfuscatedName("XQFIPMSR.h")
	public InputStream field1443;

	@ObfuscatedName("XQFIPMSR.B")
	public OutputStream field1459;

	@ObfuscatedName("XQFIPMSR.N")
	public Socket field1470;

	@ObfuscatedName("XQFIPMSR.o")
	public byte[] field1450;

	@ObfuscatedName("XQFIPMSR.b")
	public int[] field1438;

	@ObfuscatedName("XQFIPMSR.c")
	public int[] field1439;

	@ObfuscatedName("XQFIPMSR.n")
	public int[] field1449;

	@ObfuscatedName("XQFIPMSR.s")
	public int[] field1452;

	@ObfuscatedName("XQFIPMSR.A")
	public int[] field1458;

	@ObfuscatedName("XQFIPMSR.C")
	public int[] field1460;

	@ObfuscatedName("XQFIPMSR.b(I)V")
	public final void method559() {
		synchronized (field1467) {
			field1467.method204();
		}
	}

	@ObfuscatedName("XQFIPMSR.a(IB)I")
	public final int method560(int arg0) {
		return field1445[arg0].length;
	}

	@ObfuscatedName("XQFIPMSR.a(IIB[B)Z")
	public final boolean method561(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field1456.reset();
			field1456.update(arg2, 0, var4);
			int var6 = (int) field1456.getValue();

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

	@ObfuscatedName("XQFIPMSR.a(B)V")
	public final void method562() {
		try {
			int var1 = field1443.available();
			if (field1466 == 0 && var1 >= 6) {
				field1440 = true;

				for (int var2 = 0; var2 < 6; var2 += field1443.read(field1437, var2, 6 - var2)) {
				}

				int var3 = field1437[0] & 0xFF;
				int var4 = ((field1437[1] & 0xFF) << 8) + (field1437[2] & 0xFF);
				int var5 = ((field1437[3] & 0xFF) << 8) + (field1437[4] & 0xFF);
				int var6 = field1437[5] & 0xFF;
				field1461 = null;
				for (PKGIHVSX var7 = (PKGIHVSX) field1454.method200(); var7 != null; var7 = (PKGIHVSX) field1454.method202()) {
					if (var7.field1104 == var3 && var7.field1100 == var4) {
						field1461 = var7;
					}

					if (field1461 != null) {
						var7.field1102 = 0;
					}
				}

				if (field1461 != null) {
					field1457 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1461.field1103 = null;

						if (field1461.field1101) {
							synchronized (field1442) {
								field1442.method197(field1461);
							}
						} else {
							field1461.method205();
						}

						field1461 = null;
					} else {
						if (field1461.field1103 == null && var6 == 0) {
							field1461.field1103 = new byte[var5];
						}

						if (field1461.field1103 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1465 = var6 * 500;
				field1466 = 500;
				if (field1466 > var5 - var6 * 500) {
					field1466 = var5 - var6 * 500;
				}
			}

			if (field1466 > 0 && var1 >= field1466) {
				field1440 = true;
				byte[] var9 = field1437;
				int var10 = 0;
				if (field1461 != null) {
					var9 = field1461.field1103;
					var10 = field1465;
				}

				for (int var11 = 0; var11 < field1466; var11 += field1443.read(var9, var10 + var11, field1466 - var11)) {
				}

				if (field1466 + field1465 >= var9.length && field1461 != null) {
					if (field1463.field370[0] != null) {
						field1463.field370[field1461.field1104 + 1].method224(var9.length, field1461.field1100, var9);
					}

					if (!field1461.field1101 && field1461.field1104 == 3) {
						field1461.field1101 = true;
						field1461.field1104 = 93;
					}

					if (field1461.field1101) {
						synchronized (field1442) {
							field1442.method197(field1461);
						}
					} else {
						field1461.method205();
					}
				}

				field1466 = 0;
			}
		} catch (IOException var17) {
			try {
				field1470.close();
			} catch (Exception var14) {
			}

			field1470 = null;
			field1443 = null;
			field1459 = null;
			field1466 = 0;
		}
	}

	@ObfuscatedName("XQFIPMSR.a(IBBI)V")
	public final void method563(int arg0, byte arg1, int arg2) {
		if (field1463.field370[0] != null && field1445[arg0][arg2] != 0) {
			byte[] var4 = field1463.field370[arg0 + 1].method223(arg2);
			if (!method561(field1471[arg0][arg2], field1445[arg0][arg2], var4)) {
				field1453[arg0][arg2] = arg1;

				if (arg1 > field1475) {
					field1475 = arg1;
				}

				field1447++;
			}
		}
	}

	@ObfuscatedName("XQFIPMSR.a()V")
	public final void method564() {
		field1446 = false;
	}

	@ObfuscatedName("XQFIPMSR.a(I)V")
	public final void method346(int arg0) {
		method577(0, arg0);
	}

	@ObfuscatedName("XQFIPMSR.a(II)Z")
	public final boolean method565(int arg0) {
		for (int var2 = 0; var2 < field1458.length; var2++) {
			if (field1439[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("XQFIPMSR.a(III)V")
	public final void method566(int arg0, int arg1) {
		if (field1463.field370[0] != null && (field1445[arg1][arg0] != 0 && (field1453[arg1][arg0] != 0 && field1475 != 0))) {
			PKGIHVSX var3 = new PKGIHVSX();
			var3.field1104 = arg1;
			var3.field1100 = arg0;
			var3.field1101 = false;

			synchronized (field1467) {
				field1467.method197(var3);
			}
		}
	}

	@ObfuscatedName("XQFIPMSR.c(I)V")
	public final void method567() {
		field1473 = 0;
		field1474 = 0;
		for (PKGIHVSX var1 = (PKGIHVSX) field1454.method200(); var1 != null; var1 = (PKGIHVSX) field1454.method202()) {
			if (var1.field1101) {
				field1473++;
			} else {
				field1474++;
			}
		}

		while (field1473 < 10) {
			PKGIHVSX var2 = (PKGIHVSX) field1464.method199();
			if (var2 == null) {
				break;
			}

			if (field1453[var2.field1104][var2.field1100] != 0) {
				field1444++;
			}

			field1453[var2.field1104][var2.field1100] = 0;
			field1454.method197(var2);
			field1473++;
			method578(var2);
			field1440 = true;
		}
	}

	@ObfuscatedName("XQFIPMSR.a(ZI)V")
	public final void method568(boolean arg0) {
		int var2 = field1458.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1449[var3] != 0) {
				method563(3, (byte) 2, field1439[var3]);
				method563(3, (byte) 2, field1460[var3]);
			}
		}
	}

	@ObfuscatedName("XQFIPMSR.a(LHBJEXSJX;Lclient;)V")
	public final void method569(HBJEXSJX arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method348(var3[var4], null);
			int var6 = var5.length / 2;
			EYMNCFMK var7 = new EYMNCFMK(var5);
			field1445[var4] = new int[var6];
			field1453[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1445[var4][var8] = var7.method241();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method348(var9[var10], null);
			int var12 = var11.length / 4;
			EYMNCFMK var13 = new EYMNCFMK(var11);
			field1471[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1471[var10][var14] = var13.method244();
			}
		}

		byte[] var15 = arg0.method348("model_index", null);
		int var16 = field1445[0].length;
		field1450 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1450[var17] = var15[var17];
			} else {
				field1450[var17] = 0;
			}
		}

		byte[] var18 = arg0.method348("map_index", null);
		EYMNCFMK var19 = new EYMNCFMK(var18);
		int var20 = var18.length / 7;
		field1458 = new int[var20];
		field1460 = new int[var20];
		field1439 = new int[var20];
		field1449 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1458[var21] = var19.method241();
			field1460[var21] = var19.method241();
			field1439[var21] = var19.method241();
			field1449[var21] = var19.method239();
		}

		byte[] var22 = arg0.method348("anim_index", null);
		EYMNCFMK var23 = new EYMNCFMK(var22);
		int var24 = var22.length / 2;
		field1452 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1452[var25] = var23.method241();
		}

		byte[] var26 = arg0.method348("midi_index", null);
		EYMNCFMK var27 = new EYMNCFMK(var26);
		int var28 = var26.length;
		field1438 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1438[var29] = var27.method239();
		}

		field1463 = arg1;
		field1446 = true;
		field1463.method139(this, 2);
	}

	@ObfuscatedName("XQFIPMSR.b(II)I")
	public final int method570(int arg0) {
		return field1450[arg0] & 0xFF;
	}

	@ObfuscatedName("XQFIPMSR.b()LPKGIHVSX;")
	public final PKGIHVSX method571() {
		PKGIHVSX var2;
		synchronized (field1442) {
			var2 = (PKGIHVSX) field1442.method199();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1455) {
			var2.method583();
		}

		if (var2.field1103 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1103));
			while (true) {
				if (field1462.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1462, var4, field1462.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1103 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1103[var7] = field1462[var7];
		}

		return var2;
	}

	@ObfuscatedName("XQFIPMSR.d(I)V")
	public final void method572() {
		while (field1473 == 0) {
			if (field1474 >= 10 || field1475 == 0) {
				return;
			}

			PKGIHVSX var2;
			synchronized (field1467) {
				var2 = (PKGIHVSX) field1467.method199();
			}

			while (var2 != null) {
				if (field1453[var2.field1104][var2.field1100] != 0) {
					field1453[var2.field1104][var2.field1100] = 0;
					field1454.method197(var2);
					method578(var2);
					field1440 = true;

					if (field1444 < field1447) {
						field1444++;
					}

					field1469 = "Loading extra files - " + field1444 * 100 / field1447 + "%";
					field1474++;
					if (field1474 == 10) {
						return;
					}
				}

				synchronized (field1467) {
					var2 = (PKGIHVSX) field1467.method199();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1453[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1475) {
						var5[var7] = 0;
						PKGIHVSX var8 = new PKGIHVSX();
						var8.field1104 = var4;
						var8.field1100 = var7;
						var8.field1101 = false;
						field1454.method197(var8);
						method578(var8);
						field1440 = true;

						if (field1444 < field1447) {
							field1444++;
						}

						field1469 = "Loading extra files - " + field1444 * 100 / field1447 + "%";
						field1474++;
						if (field1474 == 10) {
							return;
						}
					}
				}
			}

			field1475--;
		}
	}

	@ObfuscatedName("XQFIPMSR.a(Z)I")
	public final int method573() {
		return field1452.length;
	}

	@ObfuscatedName("XQFIPMSR.a(BIII)I")
	public final int method574(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg0;
		for (int var5 = 0; var5 < field1458.length; var5++) {
			if (field1458[var5] == var4) {
				if (arg1 == 0) {
					return field1460[var5];
				}

				return field1439[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("XQFIPMSR.c()I")
	public final int method575() {
		synchronized (field1455) {
			return field1455.method360();
		}
	}

	@ObfuscatedName("XQFIPMSR.e(I)V")
	public final void method576() {
		PKGIHVSX var2;
		synchronized (field1451) {
			var2 = (PKGIHVSX) field1451.method199();
		}

		while (var2 != null) {
			field1440 = true;
			byte[] var3 = null;
			if (field1463.field370[0] != null) {
				var3 = field1463.field370[var2.field1104 + 1].method223(var2.field1100);
			}

			if (!method561(field1471[var2.field1104][var2.field1100], field1445[var2.field1104][var2.field1100], var3)) {
				var3 = null;
			}

			synchronized (field1451) {
				if (var3 == null) {
					field1464.method197(var2);
				} else {
					var2.field1103 = var3;

					synchronized (field1442) {
						field1442.method197(var2);
					}
				}

				var2 = (PKGIHVSX) field1451.method199();
			}
		}
	}

	@ObfuscatedName("XQFIPMSR.c(II)V")
	public final void method577(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1445.length && arg1 >= 0 && arg1 <= field1445[arg0].length && field1445[arg0][arg1] != 0) {
			synchronized (field1455) {
				for (PKGIHVSX var4 = (PKGIHVSX) field1455.method358(); var4 != null; var4 = (PKGIHVSX) field1455.method359()) {
					if (var4.field1104 == arg0 && var4.field1100 == arg1) {
						return;
					}
				}

				PKGIHVSX var5 = new PKGIHVSX();
				var5.field1104 = arg0;
				var5.field1100 = arg1;
				var5.field1101 = true;

				synchronized (field1451) {
					field1451.method197(var5);
				}

				field1455.method356(var5);
			}
		}
	}

	@ObfuscatedName("XQFIPMSR.a(ZLPKGIHVSX;)V")
	public final void method578(PKGIHVSX arg0) {
		try {
			if (field1470 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1472 < 4000L) {
					return;
				}

				field1472 = var2;
				field1470 = field1463.method134(client.field179 + 43594);
				field1443 = field1470.getInputStream();
				field1459 = field1470.getOutputStream();
				field1459.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1443.read();
				}

				field1457 = 0;
			}

			field1437[0] = (byte) arg0.field1104;
			field1437[1] = (byte) (arg0.field1100 >> 8);
			field1437[2] = (byte) arg0.field1100;
			if (arg0.field1101) {
				field1437[3] = 2;
			} else if (field1463.field464) {
				field1437[3] = 0;
			} else {
				field1437[3] = 1;
			}

			field1459.write(field1437, 0, 4);
			field1448 = 0;
			field1441 = -10000;
		} catch (IOException var7) {
			try {
				field1470.close();
			} catch (Exception var6) {
			}

			field1470 = null;
			field1443 = null;
			field1459 = null;
			field1466 = 0;
			field1441++;
		}
	}

	public final void run() {
		try {
			while (field1446) {
				field1468++;
				byte var1 = 20;
				if (field1475 == 0 && field1463.field370[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1440 = true;
				for (int var2 = 0; var2 < 100 && field1440; var2++) {
					field1440 = false;
					method576();
					method567();

					if (field1473 == 0 && var2 >= 5) {
						break;
					}

					method572();

					if (field1443 != null) {
						method562();
					}
				}

				boolean var3 = false;
				for (PKGIHVSX var4 = (PKGIHVSX) field1454.method200(); var4 != null; var4 = (PKGIHVSX) field1454.method202()) {
					if (var4.field1101) {
						var3 = true;
						var4.field1102++;
						if (var4.field1102 > 50) {
							var4.field1102 = 0;
							method578(var4);
						}
					}
				}

				if (!var3) {
					for (PKGIHVSX var5 = (PKGIHVSX) field1454.method200(); var5 != null; var5 = (PKGIHVSX) field1454.method202()) {
						var3 = true;
						var5.field1102++;
						if (var5.field1102 > 50) {
							var5.field1102 = 0;
							method578(var5);
						}
					}
				}

				if (var3) {
					field1457++;
					if (field1457 > 750) {
						try {
							field1470.close();
						} catch (Exception var8) {
						}

						field1470 = null;
						field1443 = null;
						field1459 = null;
						field1466 = 0;
					}
				} else {
					field1457 = 0;
					field1469 = "";
				}

				if (field1463.field464 && field1470 != null && field1459 != null && (field1475 > 0 || field1463.field370[0] == null)) {
					field1448++;
					if (field1448 > 500) {
						field1448 = 0;
						field1437[0] = 0;
						field1437[1] = 0;
						field1437[2] = 0;
						field1437[3] = 10;
						try {
							field1459.write(field1437, 0, 4);
						} catch (IOException var7) {
							field1457 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("XQFIPMSR.d(II)Z")
	public final boolean method579(int arg0) {
		if (field1438[arg0] == 1) {
			return true;
		}

		return false;
	}
}
