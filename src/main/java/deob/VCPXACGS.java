package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("VCPXACGS")
public class VCPXACGS extends ORAQTKDD implements Runnable {

	@ObfuscatedName("VCPXACGS.b")
	public OUZUCGGU field1415 = new OUZUCGGU();

	@ObfuscatedName("VCPXACGS.c")
	public boolean field1416 = false;

	@ObfuscatedName("VCPXACGS.e")
	public boolean field1418 = true;

	@ObfuscatedName("VCPXACGS.s")
	public int[][] field1428 = new int[4][];

	@ObfuscatedName("VCPXACGS.t")
	public byte[] field1429 = new byte[500];

	@ObfuscatedName("VCPXACGS.u")
	public OUZUCGGU field1430 = new OUZUCGGU();

	@ObfuscatedName("VCPXACGS.y")
	public CRC32 field1433 = new CRC32();

	@ObfuscatedName("VCPXACGS.z")
	public BOZWYCIO field1434 = new BOZWYCIO();

	@ObfuscatedName("VCPXACGS.B")
	public byte[][] field1436 = new byte[4][];

	@ObfuscatedName("VCPXACGS.C")
	public byte[] field1437 = new byte[65000];

	@ObfuscatedName("VCPXACGS.J")
	public int[][] field1443 = new int[4][];

	@ObfuscatedName("VCPXACGS.K")
	public OUZUCGGU field1444 = new OUZUCGGU();

	@ObfuscatedName("VCPXACGS.L")
	public OUZUCGGU field1445 = new OUZUCGGU();

	@ObfuscatedName("VCPXACGS.O")
	public String field1448 = "";

	@ObfuscatedName("VCPXACGS.T")
	public OUZUCGGU field1451 = new OUZUCGGU();

	@ObfuscatedName("VCPXACGS.m")
	public int field1423;

	@ObfuscatedName("VCPXACGS.o")
	public int field1424;

	@ObfuscatedName("VCPXACGS.p")
	public int field1425;

	@ObfuscatedName("VCPXACGS.q")
	public int field1426;

	@ObfuscatedName("VCPXACGS.r")
	public int field1427;

	@ObfuscatedName("VCPXACGS.v")
	public int field1431;

	@ObfuscatedName("VCPXACGS.w")
	public int field1432;

	@ObfuscatedName("VCPXACGS.D")
	public int field1438;

	@ObfuscatedName("VCPXACGS.F")
	public int field1440;

	@ObfuscatedName("VCPXACGS.P")
	public int field1449;

	@ObfuscatedName("VCPXACGS.Q")
	public int field1450;

	@ObfuscatedName("VCPXACGS.j")
	public long field1420;

	@ObfuscatedName("VCPXACGS.A")
	public LMSXRUPQ field1435;

	@ObfuscatedName("VCPXACGS.V")
	public client field1453;

	@ObfuscatedName("VCPXACGS.k")
	public InputStream field1421;

	@ObfuscatedName("VCPXACGS.l")
	public OutputStream field1422;

	@ObfuscatedName("VCPXACGS.G")
	public Socket field1441;

	@ObfuscatedName("VCPXACGS.d")
	public byte[] field1417;

	@ObfuscatedName("VCPXACGS.f")
	public int[] field1419;

	@ObfuscatedName("VCPXACGS.E")
	public int[] field1439;

	@ObfuscatedName("VCPXACGS.H")
	public int[] field1442;

	@ObfuscatedName("VCPXACGS.M")
	public int[] field1446;

	@ObfuscatedName("VCPXACGS.N")
	public int[] field1447;

	@ObfuscatedName("VCPXACGS.U")
	public int[] field1452;

	@ObfuscatedName("VCPXACGS.a(I)V")
	public final void method389(int arg0) {
		method567(0, arg0);
	}

	@ObfuscatedName("VCPXACGS.a(ILLMSXRUPQ;)V")
	public final void method555(LMSXRUPQ arg0) {
		try {
			if (field1441 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1420 < 4000L) {
					return;
				}

				field1420 = var2;
				field1441 = field1453.method143(client.field373 + 43594);
				field1421 = field1441.getInputStream();
				field1422 = field1441.getOutputStream();
				field1422.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1421.read();
				}

				field1425 = 0;
			}

			field1429[0] = (byte) arg0.field815;
			field1429[1] = (byte) (arg0.field811 >> 8);
			field1429[2] = (byte) arg0.field811;
			if (arg0.field812) {
				field1429[3] = 2;
			} else if (field1453.field256) {
				field1429[3] = 0;
			} else {
				field1429[3] = 1;
			}

			field1422.write(field1429, 0, 4);
			field1432 = 0;
			field1438 = -10000;
		} catch (IOException var7) {
			try {
				field1441.close();
			} catch (Exception var6) {
			}

			field1441 = null;
			field1421 = null;
			field1422 = null;
			field1427 = 0;
			field1438++;
		}
	}

	@ObfuscatedName("VCPXACGS.b(I)V")
	public final void method556() {
		LMSXRUPQ var2;
		synchronized (field1430) {
			var2 = (LMSXRUPQ) field1430.method392();
		}

		while (var2 != null) {
			field1416 = true;
			byte[] var3 = null;
			if (field1453.field302[0] != null) {
				var3 = field1453.field302[var2.field815 + 1].method356(var2.field811);
			}

			if (!method572(field1443[var2.field815][var2.field811], field1428[var2.field815][var2.field811], var3)) {
				var3 = null;
			}

			synchronized (field1430) {
				if (var3 == null) {
					field1445.method390(var2);
				} else {
					var2.field813 = var3;

					synchronized (field1415) {
						field1415.method390(var2);
					}
				}

				var2 = (LMSXRUPQ) field1430.method392();
			}
		}
	}

	@ObfuscatedName("VCPXACGS.a(ZI)I")
	public final int method557(int arg0) {
		return field1443[arg0].length;
	}

	@ObfuscatedName("VCPXACGS.a(BI)I")
	public final int method558(int arg0) {
		return field1417[arg0] & 0xFF;
	}

	@ObfuscatedName("VCPXACGS.a(B)V")
	public final void method559() {
		while (field1449 == 0) {
			if (field1450 >= 10 || field1423 == 0) {
				return;
			}

			LMSXRUPQ var2;
			synchronized (field1444) {
				var2 = (LMSXRUPQ) field1444.method392();
			}

			while (var2 != null) {
				if (field1436[var2.field815][var2.field811] != 0) {
					field1436[var2.field815][var2.field811] = 0;
					field1451.method390(var2);
					method555(var2);
					field1416 = true;

					if (field1440 < field1424) {
						field1440++;
					}

					field1448 = "Loading extra files - " + field1440 * 100 / field1424 + "%";
					field1450++;
					if (field1450 == 10) {
						return;
					}
				}

				synchronized (field1444) {
					var2 = (LMSXRUPQ) field1444.method392();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1436[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1423) {
						var5[var7] = 0;
						LMSXRUPQ var8 = new LMSXRUPQ();
						var8.field815 = var4;
						var8.field811 = var7;
						var8.field812 = false;
						field1451.method390(var8);
						method555(var8);
						field1416 = true;

						if (field1440 < field1424) {
							field1440++;
						}

						field1448 = "Loading extra files - " + field1440 * 100 / field1424 + "%";
						field1450++;
						if (field1450 == 10) {
							return;
						}
					}
				}
			}

			field1423--;
		}
	}

	@ObfuscatedName("VCPXACGS.a(LHRXSNEYZ;Lclient;)V")
	public final void method560(HRXSNEYZ arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method289(var3[var4], null);
			int var6 = var5.length / 2;
			JHKSAGUC var7 = new JHKSAGUC(var5);
			field1443[var4] = new int[var6];
			field1436[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1443[var4][var8] = var7.method308();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method289(var9[var10], null);
			int var12 = var11.length / 4;
			JHKSAGUC var13 = new JHKSAGUC(var11);
			field1428[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1428[var10][var14] = var13.method311();
			}
		}

		byte[] var15 = arg0.method289("model_index", null);
		int var16 = field1443[0].length;
		field1417 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1417[var17] = var15[var17];
			} else {
				field1417[var17] = 0;
			}
		}

		byte[] var18 = arg0.method289("map_index", null);
		JHKSAGUC var19 = new JHKSAGUC(var18);
		int var20 = var18.length / 7;
		field1446 = new int[var20];
		field1447 = new int[var20];
		field1442 = new int[var20];
		field1439 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1446[var21] = var19.method308();
			field1447[var21] = var19.method308();
			field1442[var21] = var19.method308();
			field1439[var21] = var19.method306();
		}

		byte[] var22 = arg0.method289("anim_index", null);
		JHKSAGUC var23 = new JHKSAGUC(var22);
		int var24 = var22.length / 2;
		field1419 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1419[var25] = var23.method308();
		}

		byte[] var26 = arg0.method289("midi_index", null);
		JHKSAGUC var27 = new JHKSAGUC(var26);
		int var28 = var26.length;
		field1452 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1452[var29] = var27.method306();
		}

		field1453 = arg1;
		field1418 = true;
		field1453.method58(this, 2);
	}

	@ObfuscatedName("VCPXACGS.c(I)I")
	public final int method561() {
		return field1419.length;
	}

	@ObfuscatedName("VCPXACGS.d(I)V")
	public final void method562() {
		try {
			int var1 = field1421.available();
			if (field1427 == 0 && var1 >= 6) {
				field1416 = true;

				for (int var2 = 0; var2 < 6; var2 += field1421.read(field1429, var2, 6 - var2)) {
				}

				int var3 = field1429[0] & 0xFF;
				int var4 = ((field1429[1] & 0xFF) << 8) + (field1429[2] & 0xFF);
				int var5 = ((field1429[3] & 0xFF) << 8) + (field1429[4] & 0xFF);
				int var6 = field1429[5] & 0xFF;
				field1435 = null;
				for (LMSXRUPQ var7 = (LMSXRUPQ) field1451.method393(); var7 != null; var7 = (LMSXRUPQ) field1451.method395()) {
					if (var7.field815 == var3 && var7.field811 == var4) {
						field1435 = var7;
					}

					if (field1435 != null) {
						var7.field814 = 0;
					}
				}

				if (field1435 != null) {
					field1425 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1435.field813 = null;

						if (field1435.field812) {
							synchronized (field1415) {
								field1415.method390(field1435);
							}
						} else {
							field1435.method290();
						}

						field1435 = null;
					} else {
						if (field1435.field813 == null && var6 == 0) {
							field1435.field813 = new byte[var5];
						}

						if (field1435.field813 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1426 = var6 * 500;
				field1427 = 500;
				if (field1427 > var5 - var6 * 500) {
					field1427 = var5 - var6 * 500;
				}
			}

			if (field1427 > 0 && var1 >= field1427) {
				field1416 = true;
				byte[] var9 = field1429;
				int var10 = 0;
				if (field1435 != null) {
					var9 = field1435.field813;
					var10 = field1426;
				}

				for (int var11 = 0; var11 < field1427; var11 += field1421.read(var9, var10 + var11, field1427 - var11)) {
				}

				if (field1427 + field1426 >= var9.length && field1435 != null) {
					if (field1453.field302[0] != null) {
						field1453.field302[field1435.field815 + 1].method357(var9, field1435.field811, var9.length);
					}

					if (!field1435.field812 && field1435.field815 == 3) {
						field1435.field812 = true;
						field1435.field815 = 93;
					}

					if (field1435.field812) {
						synchronized (field1415) {
							field1415.method390(field1435);
						}
					} else {
						field1435.method290();
					}
				}

				field1427 = 0;
			}
		} catch (IOException var17) {
			try {
				field1441.close();
			} catch (Exception var14) {
			}

			field1441 = null;
			field1421 = null;
			field1422 = null;
			field1427 = 0;
		}
	}

	@ObfuscatedName("VCPXACGS.a(IIIZ)I")
	public final int method563(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field1446.length; var5++) {
			if (field1446[var5] == var4) {
				if (arg0 == 0) {
					return field1447[var5];
				}

				return field1442[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("VCPXACGS.a(BIII)V")
	public final void method564(byte arg0, int arg1, int arg2) {
		if (field1453.field302[0] != null && field1443[arg2][arg1] != 0) {
			byte[] var4 = field1453.field302[arg2 + 1].method356(arg1);
			if (!method572(field1443[arg2][arg1], field1428[arg2][arg1], var4)) {
				field1436[arg2][arg1] = arg0;

				if (arg0 > field1423) {
					field1423 = arg0;
				}

				field1424++;
			}
		}
	}

	@ObfuscatedName("VCPXACGS.a(III)V")
	public final void method565(int arg0, int arg1) {
		if (field1453.field302[0] != null && (field1443[arg1][arg0] != 0 && (field1436[arg1][arg0] != 0 && field1423 != 0))) {
			LMSXRUPQ var3 = new LMSXRUPQ();
			var3.field815 = arg1;
			var3.field811 = arg0;
			var3.field812 = false;

			synchronized (field1444) {
				field1444.method390(var3);
			}
		}
	}

	@ObfuscatedName("VCPXACGS.b(BI)Z")
	public final boolean method566(int arg0) {
		if (field1452[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("VCPXACGS.a(II)V")
	public final void method567(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1443.length && arg1 >= 0 && arg1 <= field1443[arg0].length && field1443[arg0][arg1] != 0) {
			synchronized (field1434) {
				for (LMSXRUPQ var4 = (LMSXRUPQ) field1434.method44(); var4 != null; var4 = (LMSXRUPQ) field1434.method45()) {
					if (var4.field815 == arg0 && var4.field811 == arg1) {
						return;
					}
				}

				LMSXRUPQ var5 = new LMSXRUPQ();
				var5.field815 = arg0;
				var5.field811 = arg1;
				var5.field812 = true;

				synchronized (field1430) {
					field1430.method390(var5);
				}

				field1434.method42(var5);
			}
		}
	}

	@ObfuscatedName("VCPXACGS.a()LLMSXRUPQ;")
	public final LMSXRUPQ method568() {
		LMSXRUPQ var2;
		synchronized (field1415) {
			var2 = (LMSXRUPQ) field1415.method392();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1434) {
			var2.method1();
		}

		if (var2.field813 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field813));
			while (true) {
				if (field1437.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1437, var4, field1437.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field813 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field813[var7] = field1437[var7];
		}

		return var2;
	}

	@ObfuscatedName("VCPXACGS.e(I)V")
	public final void method569() {
		field1449 = 0;
		field1450 = 0;
		for (LMSXRUPQ var1 = (LMSXRUPQ) field1451.method393(); var1 != null; var1 = (LMSXRUPQ) field1451.method395()) {
			if (var1.field812) {
				field1449++;
			} else {
				field1450++;
			}
		}

		while (field1449 < 10) {
			LMSXRUPQ var2 = (LMSXRUPQ) field1445.method392();
			if (var2 == null) {
				break;
			}

			if (field1436[var2.field815][var2.field811] != 0) {
				field1440++;
			}

			field1436[var2.field815][var2.field811] = 0;
			field1451.method390(var2);
			field1449++;
			method555(var2);
			field1416 = true;
		}
	}

	@ObfuscatedName("VCPXACGS.a(IZ)V")
	public final void method570(boolean arg0) {
		int var2 = field1446.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1439[var3] != 0) {
				method564((byte) 2, field1442[var3], 3);
				method564((byte) 2, field1447[var3], 3);
			}
		}
	}

	@ObfuscatedName("VCPXACGS.b()I")
	public final int method571() {
		synchronized (field1434) {
			return field1434.method46();
		}
	}

	@ObfuscatedName("VCPXACGS.a(III[B)Z")
	public final boolean method572(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field1433.reset();
			field1433.update(arg2, 0, var4);
			int var6 = (int) field1433.getValue();

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

	@ObfuscatedName("VCPXACGS.f(I)V")
	public final void method573() {
		synchronized (field1444) {
			field1444.method397();
		}
	}

	public final void run() {
		try {
			while (field1418) {
				field1431++;
				byte var1 = 20;
				if (field1423 == 0 && field1453.field302[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1416 = true;
				for (int var2 = 0; var2 < 100 && field1416; var2++) {
					field1416 = false;
					method556();
					method569();

					if (field1449 == 0 && var2 >= 5) {
						break;
					}

					method559();

					if (field1421 != null) {
						method562();
					}
				}

				boolean var3 = false;
				for (LMSXRUPQ var4 = (LMSXRUPQ) field1451.method393(); var4 != null; var4 = (LMSXRUPQ) field1451.method395()) {
					if (var4.field812) {
						var3 = true;
						var4.field814++;
						if (var4.field814 > 50) {
							var4.field814 = 0;
							method555(var4);
						}
					}
				}

				if (!var3) {
					for (LMSXRUPQ var5 = (LMSXRUPQ) field1451.method393(); var5 != null; var5 = (LMSXRUPQ) field1451.method395()) {
						var3 = true;
						var5.field814++;
						if (var5.field814 > 50) {
							var5.field814 = 0;
							method555(var5);
						}
					}
				}

				if (var3) {
					field1425++;
					if (field1425 > 750) {
						try {
							field1441.close();
						} catch (Exception var8) {
						}

						field1441 = null;
						field1421 = null;
						field1422 = null;
						field1427 = 0;
					}
				} else {
					field1425 = 0;
					field1448 = "";
				}

				if (field1453.field256 && field1441 != null && field1422 != null && (field1423 > 0 || field1453.field302[0] == null)) {
					field1432++;
					if (field1432 > 500) {
						field1432 = 0;
						field1429[0] = 0;
						field1429[1] = 0;
						field1429[2] = 0;
						field1429[3] = 10;
						try {
							field1422.write(field1429, 0, 4);
						} catch (IOException var7) {
							field1425 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("VCPXACGS.c()V")
	public final void method574() {
		field1418 = false;
	}

	@ObfuscatedName("VCPXACGS.c(BI)Z")
	public final boolean method575(int arg0) {
		for (int var2 = 0; var2 < field1446.length; var2++) {
			if (field1442[var2] == arg0) {
				return true;
			}
		}

		return false;
	}
}
