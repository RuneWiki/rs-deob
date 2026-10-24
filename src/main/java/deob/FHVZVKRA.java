package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("FHVZVKRA")
public class FHVZVKRA extends WSMEEDOP implements Runnable {

	@ObfuscatedName("FHVZVKRA.a")
	public boolean field537 = false;

	@ObfuscatedName("FHVZVKRA.h")
	public CRC32 field542 = new CRC32();

	@ObfuscatedName("FHVZVKRA.l")
	public XBBVJJRK field546 = new XBBVJJRK();

	@ObfuscatedName("FHVZVKRA.m")
	public byte[][] field547 = new byte[4][];

	@ObfuscatedName("FHVZVKRA.o")
	public String field549 = "";

	@ObfuscatedName("FHVZVKRA.q")
	public RGZIHLRP field550 = new RGZIHLRP();

	@ObfuscatedName("FHVZVKRA.r")
	public byte[] field551 = new byte[65000];

	@ObfuscatedName("FHVZVKRA.v")
	public byte[] field555 = new byte[500];

	@ObfuscatedName("FHVZVKRA.y")
	public RGZIHLRP field557 = new RGZIHLRP();

	@ObfuscatedName("FHVZVKRA.C")
	public RGZIHLRP field561 = new RGZIHLRP();

	@ObfuscatedName("FHVZVKRA.E")
	public RGZIHLRP field563 = new RGZIHLRP();

	@ObfuscatedName("FHVZVKRA.G")
	public int[][] field565 = new int[4][];

	@ObfuscatedName("FHVZVKRA.J")
	public RGZIHLRP field568 = new RGZIHLRP();

	@ObfuscatedName("FHVZVKRA.N")
	public int[][] field572 = new int[4][];

	@ObfuscatedName("FHVZVKRA.Q")
	public boolean field575 = true;

	@ObfuscatedName("FHVZVKRA.f")
	public int field540;

	@ObfuscatedName("FHVZVKRA.g")
	public int field541;

	@ObfuscatedName("FHVZVKRA.i")
	public int field543;

	@ObfuscatedName("FHVZVKRA.j")
	public int field544;

	@ObfuscatedName("FHVZVKRA.k")
	public int field545;

	@ObfuscatedName("FHVZVKRA.n")
	public int field548;

	@ObfuscatedName("FHVZVKRA.t")
	public int field553;

	@ObfuscatedName("FHVZVKRA.u")
	public int field554;

	@ObfuscatedName("FHVZVKRA.D")
	public int field562;

	@ObfuscatedName("FHVZVKRA.K")
	public int field569;

	@ObfuscatedName("FHVZVKRA.P")
	public int field574;

	@ObfuscatedName("FHVZVKRA.s")
	public long field552;

	@ObfuscatedName("FHVZVKRA.H")
	public UUFPGSJG field566;

	@ObfuscatedName("FHVZVKRA.z")
	public client field558;

	@ObfuscatedName("FHVZVKRA.I")
	public InputStream field567;

	@ObfuscatedName("FHVZVKRA.M")
	public OutputStream field571;

	@ObfuscatedName("FHVZVKRA.c")
	public Socket field539;

	@ObfuscatedName("FHVZVKRA.b")
	public byte[] field538;

	@ObfuscatedName("FHVZVKRA.w")
	public int[] field556;

	@ObfuscatedName("FHVZVKRA.A")
	public int[] field559;

	@ObfuscatedName("FHVZVKRA.B")
	public int[] field560;

	@ObfuscatedName("FHVZVKRA.F")
	public int[] field564;

	@ObfuscatedName("FHVZVKRA.L")
	public int[] field570;

	@ObfuscatedName("FHVZVKRA.O")
	public int[] field573;

	@ObfuscatedName("FHVZVKRA.a(II[BI)Z")
	public final boolean method181(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field542.reset();
			field542.update(arg1, 0, var4);
			int var6 = (int) field542.getValue();

			if (arg2 != var5) {
				return false;
			}

			if (arg0 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("FHVZVKRA.b(I)I")
	public final int method182() {
		return field556.length;
	}

	public final void run() {
		try {
			while (field575) {
				field574++;
				byte var1 = 20;
				if (field569 == 0 && field558.field33[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field537 = true;
				for (int var2 = 0; var2 < 100 && field537; var2++) {
					field537 = false;
					method192();
					method193();

					if (field544 == 0 && var2 >= 5) {
						break;
					}

					method199();

					if (field567 != null) {
						method184();
					}
				}

				boolean var3 = false;
				for (UUFPGSJG var4 = (UUFPGSJG) field563.method471(); var4 != null; var4 = (UUFPGSJG) field563.method473()) {
					if (var4.field1412) {
						var3 = true;
						var4.field1409++;
						if (var4.field1409 > 50) {
							var4.field1409 = 0;
							method201(var4);
						}
					}
				}

				if (!var3) {
					for (UUFPGSJG var5 = (UUFPGSJG) field563.method471(); var5 != null; var5 = (UUFPGSJG) field563.method473()) {
						var3 = true;
						var5.field1409++;
						if (var5.field1409 > 50) {
							var5.field1409 = 0;
							method201(var5);
						}
					}
				}

				if (var3) {
					field540++;
					if (field540 > 750) {
						try {
							field539.close();
						} catch (Exception var8) {
						}

						field539 = null;
						field567 = null;
						field571 = null;
						field554 = 0;
					}
				} else {
					field540 = 0;
					field549 = "";
				}

				if (field558.field407 && field539 != null && field571 != null && (field569 > 0 || field558.field33[0] == null)) {
					field541++;
					if (field541 > 500) {
						field541 = 0;
						field555[0] = 0;
						field555[1] = 0;
						field555[2] = 0;
						field555[3] = 10;
						try {
							field571.write(field555, 0, 4);
						} catch (IOException var7) {
							field540 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("FHVZVKRA.a(IZI)V")
	public final void method183(int arg0, int arg1) {
		if (field558.field33[0] != null && (field572[arg1][arg0] != 0 && (field547[arg1][arg0] != 0 && field569 != 0))) {
			UUFPGSJG var3 = new UUFPGSJG();
			var3.field1408 = arg1;
			var3.field1410 = arg0;
			var3.field1412 = false;

			synchronized (field557) {
				field557.method468(var3);
			}
		}
	}

	@ObfuscatedName("FHVZVKRA.c(I)V")
	public final void method184() {
		try {
			int var1 = field567.available();
			if (field554 == 0 && var1 >= 6) {
				field537 = true;

				for (int var2 = 0; var2 < 6; var2 += field567.read(field555, var2, 6 - var2)) {
				}

				int var3 = field555[0] & 0xFF;
				int var4 = ((field555[1] & 0xFF) << 8) + (field555[2] & 0xFF);
				int var5 = ((field555[3] & 0xFF) << 8) + (field555[4] & 0xFF);
				int var6 = field555[5] & 0xFF;
				field566 = null;
				for (UUFPGSJG var7 = (UUFPGSJG) field563.method471(); var7 != null; var7 = (UUFPGSJG) field563.method473()) {
					if (var7.field1408 == var3 && var7.field1410 == var4) {
						field566 = var7;
					}

					if (field566 != null) {
						var7.field1409 = 0;
					}
				}

				if (field566 != null) {
					field540 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field566.field1411 = null;

						if (field566.field1412) {
							synchronized (field561) {
								field561.method468(field566);
							}
						} else {
							field566.method430();
						}

						field566 = null;
					} else {
						if (field566.field1411 == null && var6 == 0) {
							field566.field1411 = new byte[var5];
						}

						if (field566.field1411 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field553 = var6 * 500;
				field554 = 500;
				if (field554 > var5 - var6 * 500) {
					field554 = var5 - var6 * 500;
				}
			}

			if (field554 > 0 && var1 >= field554) {
				field537 = true;
				byte[] var9 = field555;
				int var10 = 0;
				if (field566 != null) {
					var9 = field566.field1411;
					var10 = field553;
				}

				for (int var11 = 0; var11 < field554; var11 += field567.read(var9, var10 + var11, field554 - var11)) {
				}

				if (field554 + field553 >= var9.length && field566 != null) {
					if (field558.field33[0] != null) {
						field558.field33[field566.field1408 + 1].method425(field566.field1410, var9.length, var9);
					}

					if (!field566.field1412 && field566.field1408 == 3) {
						field566.field1412 = true;
						field566.field1408 = 93;
					}

					if (field566.field1412) {
						synchronized (field561) {
							field561.method468(field566);
						}
					} else {
						field566.method430();
					}
				}

				field554 = 0;
			}
		} catch (IOException var17) {
			try {
				field539.close();
			} catch (Exception var14) {
			}

			field539 = null;
			field567 = null;
			field571 = null;
			field554 = 0;
		}
	}

	@ObfuscatedName("FHVZVKRA.a(II)I")
	public final int method185(int arg0) {
		return field538[arg0] & 0xFF;
	}

	@ObfuscatedName("FHVZVKRA.a(IB)I")
	public final int method186(int arg0) {
		return field572[arg0].length;
	}

	@ObfuscatedName("FHVZVKRA.b(II)Z")
	public final boolean method187(int arg0) {
		if (field560[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("FHVZVKRA.a(IZ)V")
	public final void method188(boolean arg0) {
		int var2 = field559.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field564[var3] != 0) {
				method200(3, (byte) 2, field570[var3]);
				method200(3, (byte) 2, field573[var3]);
			}
		}
	}

	@ObfuscatedName("FHVZVKRA.a(I)V")
	public final void method189(int arg0) {
		method190(0, arg0);
	}

	@ObfuscatedName("FHVZVKRA.c(II)V")
	public final void method190(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field572.length && arg1 >= 0 && arg1 <= field572[arg0].length && field572[arg0][arg1] != 0) {
			synchronized (field546) {
				for (UUFPGSJG var4 = (UUFPGSJG) field546.method535(); var4 != null; var4 = (UUFPGSJG) field546.method536()) {
					if (var4.field1408 == arg0 && var4.field1410 == arg1) {
						return;
					}
				}

				UUFPGSJG var5 = new UUFPGSJG();
				var5.field1408 = arg0;
				var5.field1410 = arg1;
				var5.field1412 = true;

				synchronized (field568) {
					field568.method468(var5);
				}

				field546.method533(var5);
			}
		}
	}

	@ObfuscatedName("FHVZVKRA.a(LMNPBQFWE;Lclient;)V")
	public final void method191(MNPBQFWE arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method429(var3[var4], null);
			int var6 = var5.length / 2;
			BJPWOXRJ var7 = new BJPWOXRJ(var5);
			field572[var4] = new int[var6];
			field547[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field572[var4][var8] = var7.method17();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method429(var9[var10], null);
			int var12 = var11.length / 4;
			BJPWOXRJ var13 = new BJPWOXRJ(var11);
			field565[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field565[var10][var14] = var13.method20();
			}
		}

		byte[] var15 = arg0.method429("model_index", null);
		int var16 = field572[0].length;
		field538 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field538[var17] = var15[var17];
			} else {
				field538[var17] = 0;
			}
		}

		byte[] var18 = arg0.method429("map_index", null);
		BJPWOXRJ var19 = new BJPWOXRJ(var18);
		int var20 = var18.length / 7;
		field559 = new int[var20];
		field573 = new int[var20];
		field570 = new int[var20];
		field564 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field559[var21] = var19.method17();
			field573[var21] = var19.method17();
			field570[var21] = var19.method17();
			field564[var21] = var19.method15();
		}

		byte[] var22 = arg0.method429("anim_index", null);
		BJPWOXRJ var23 = new BJPWOXRJ(var22);
		int var24 = var22.length / 2;
		field556 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field556[var25] = var23.method17();
		}

		byte[] var26 = arg0.method429("midi_index", null);
		BJPWOXRJ var27 = new BJPWOXRJ(var26);
		int var28 = var26.length;
		field560 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field560[var29] = var27.method15();
		}

		field558 = arg1;
		field575 = true;
		field558.method115(this, 2);
	}

	@ObfuscatedName("FHVZVKRA.d(I)V")
	public final void method192() {
		UUFPGSJG var2;
		synchronized (field568) {
			var2 = (UUFPGSJG) field568.method470();
		}

		while (var2 != null) {
			field537 = true;
			byte[] var3 = null;
			if (field558.field33[0] != null) {
				var3 = field558.field33[var2.field1408 + 1].method424(var2.field1410);
			}

			if (!method181(field565[var2.field1408][var2.field1410], var3, field572[var2.field1408][var2.field1410])) {
				var3 = null;
			}

			synchronized (field568) {
				if (var3 == null) {
					field550.method468(var2);
				} else {
					var2.field1411 = var3;

					synchronized (field561) {
						field561.method468(var2);
					}
				}

				var2 = (UUFPGSJG) field568.method470();
			}
		}
	}

	@ObfuscatedName("FHVZVKRA.a(B)V")
	public final void method193() {
		field544 = 0;
		field545 = 0;
		for (UUFPGSJG var1 = (UUFPGSJG) field563.method471(); var1 != null; var1 = (UUFPGSJG) field563.method473()) {
			if (var1.field1412) {
				field544++;
			} else {
				field545++;
			}
		}

		while (field544 < 10) {
			UUFPGSJG var2 = (UUFPGSJG) field550.method470();
			if (var2 == null) {
				break;
			}

			if (field547[var2.field1408][var2.field1410] != 0) {
				field548++;
			}

			field547[var2.field1408][var2.field1410] = 0;
			field563.method468(var2);
			field544++;
			method201(var2);
			field537 = true;
		}
	}

	@ObfuscatedName("FHVZVKRA.a()I")
	public final int method194() {
		synchronized (field546) {
			return field546.method537();
		}
	}

	@ObfuscatedName("FHVZVKRA.e(I)V")
	public final void method195() {
		synchronized (field557) {
			field557.method475();
		}
	}

	@ObfuscatedName("FHVZVKRA.b()V")
	public final void method196() {
		field575 = false;
	}

	@ObfuscatedName("FHVZVKRA.c()LUUFPGSJG;")
	public final UUFPGSJG method197() {
		UUFPGSJG var2;
		synchronized (field561) {
			var2 = (UUFPGSJG) field561.method470();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field546) {
			var2.method298();
		}

		if (var2.field1411 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1411));
			while (true) {
				if (field551.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field551, var4, field551.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1411 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1411[var7] = field551[var7];
		}

		return var2;
	}

	@ObfuscatedName("FHVZVKRA.d(II)Z")
	public final boolean method198(int arg0) {
		for (int var2 = 0; var2 < field559.length; var2++) {
			if (field570[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("FHVZVKRA.a(Z)V")
	public final void method199() {
		while (field544 == 0) {
			if (field545 >= 10 || field569 == 0) {
				return;
			}

			UUFPGSJG var2;
			synchronized (field557) {
				var2 = (UUFPGSJG) field557.method470();
			}

			while (var2 != null) {
				if (field547[var2.field1408][var2.field1410] != 0) {
					field547[var2.field1408][var2.field1410] = 0;
					field563.method468(var2);
					method201(var2);
					field537 = true;

					if (field548 < field562) {
						field548++;
					}

					field549 = "Loading extra files - " + field548 * 100 / field562 + "%";
					field545++;
					if (field545 == 10) {
						return;
					}
				}

				synchronized (field557) {
					var2 = (UUFPGSJG) field557.method470();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field547[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field569) {
						var5[var7] = 0;
						UUFPGSJG var8 = new UUFPGSJG();
						var8.field1408 = var4;
						var8.field1410 = var7;
						var8.field1412 = false;
						field563.method468(var8);
						method201(var8);
						field537 = true;

						if (field548 < field562) {
							field548++;
						}

						field549 = "Loading extra files - " + field548 * 100 / field562 + "%";
						field545++;
						if (field545 == 10) {
							return;
						}
					}
				}
			}

			field569--;
		}
	}

	@ObfuscatedName("FHVZVKRA.a(IZBI)V")
	public final void method200(int arg0, byte arg1, int arg2) {
		if (field558.field33[0] != null && field572[arg0][arg2] != 0) {
			byte[] var4 = field558.field33[arg0 + 1].method424(arg2);
			if (!method181(field565[arg0][arg2], var4, field572[arg0][arg2])) {
				field547[arg0][arg2] = arg1;

				if (arg1 > field569) {
					field569 = arg1;
				}

				field562++;
			}
		}
	}

	@ObfuscatedName("FHVZVKRA.a(LUUFPGSJG;I)V")
	public final void method201(UUFPGSJG arg0) {
		try {
			if (field539 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field552 < 4000L) {
					return;
				}

				field552 = var2;
				field539 = field558.method129(client.field335 + 43594);
				field567 = field539.getInputStream();
				field571 = field539.getOutputStream();
				field571.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field567.read();
				}

				field540 = 0;
			}

			field555[0] = (byte) arg0.field1408;
			field555[1] = (byte) (arg0.field1410 >> 8);
			field555[2] = (byte) arg0.field1410;
			if (arg0.field1412) {
				field555[3] = 2;
			} else if (field558.field407) {
				field555[3] = 0;
			} else {
				field555[3] = 1;
			}

			field571.write(field555, 0, 4);
			field541 = 0;
			field543 = -10000;
		} catch (IOException var7) {
			try {
				field539.close();
			} catch (Exception var6) {
			}

			field539 = null;
			field567 = null;
			field571 = null;
			field554 = 0;
			field543++;
		}
	}

	@ObfuscatedName("FHVZVKRA.a(IIII)I")
	public final int method202(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field559.length; var5++) {
			if (field559[var5] == var4) {
				if (arg2 == 0) {
					return field573[var5];
				}

				return field570[var5];
			}
		}

		return -1;
	}
}
