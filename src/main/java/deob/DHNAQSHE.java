package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("DHNAQSHE")
public class DHNAQSHE extends FCSMGISD implements Runnable {

	@ObfuscatedName("DHNAQSHE.d")
	public byte[] field545 = new byte[65000];

	@ObfuscatedName("DHNAQSHE.k")
	public int[][] field551 = new int[4][];

	@ObfuscatedName("DHNAQSHE.s")
	public String field558 = "";

	@ObfuscatedName("DHNAQSHE.v")
	public JQSVNFRT field560 = new JQSVNFRT();

	@ObfuscatedName("DHNAQSHE.w")
	public JQSVNFRT field561 = new JQSVNFRT();

	@ObfuscatedName("DHNAQSHE.y")
	public JQSVNFRT field563 = new JQSVNFRT();

	@ObfuscatedName("DHNAQSHE.z")
	public boolean field564 = false;

	@ObfuscatedName("DHNAQSHE.B")
	public JQSVNFRT field566 = new JQSVNFRT();

	@ObfuscatedName("DHNAQSHE.E")
	public boolean field568 = true;

	@ObfuscatedName("DHNAQSHE.G")
	public byte[] field569 = new byte[500];

	@ObfuscatedName("DHNAQSHE.P")
	public CRC32 field574 = new CRC32();

	@ObfuscatedName("DHNAQSHE.Q")
	public byte[][] field575 = new byte[4][];

	@ObfuscatedName("DHNAQSHE.W")
	public int[][] field580 = new int[4][];

	@ObfuscatedName("DHNAQSHE.X")
	public FEBLELGD field581 = new FEBLELGD();

	@ObfuscatedName("DHNAQSHE.Y")
	public JQSVNFRT field582 = new JQSVNFRT();

	@ObfuscatedName("DHNAQSHE.i")
	public int field549;

	@ObfuscatedName("DHNAQSHE.j")
	public int field550;

	@ObfuscatedName("DHNAQSHE.n")
	public int field553;

	@ObfuscatedName("DHNAQSHE.p")
	public int field555;

	@ObfuscatedName("DHNAQSHE.q")
	public int field556;

	@ObfuscatedName("DHNAQSHE.u")
	public int field559;

	@ObfuscatedName("DHNAQSHE.A")
	public int field565;

	@ObfuscatedName("DHNAQSHE.D")
	public int field567;

	@ObfuscatedName("DHNAQSHE.J")
	public int field570;

	@ObfuscatedName("DHNAQSHE.S")
	public int field576;

	@ObfuscatedName("DHNAQSHE.T")
	public int field577;

	@ObfuscatedName("DHNAQSHE.O")
	public long field573;

	@ObfuscatedName("DHNAQSHE.e")
	public SGKWAMJX field546;

	@ObfuscatedName("DHNAQSHE.g")
	public client field547;

	@ObfuscatedName("DHNAQSHE.c")
	public InputStream field544;

	@ObfuscatedName("DHNAQSHE.V")
	public OutputStream field579;

	@ObfuscatedName("DHNAQSHE.U")
	public Socket field578;

	@ObfuscatedName("DHNAQSHE.o")
	public byte[] field554;

	@ObfuscatedName("DHNAQSHE.h")
	public int[] field548;

	@ObfuscatedName("DHNAQSHE.m")
	public int[] field552;

	@ObfuscatedName("DHNAQSHE.r")
	public int[] field557;

	@ObfuscatedName("DHNAQSHE.x")
	public int[] field562;

	@ObfuscatedName("DHNAQSHE.L")
	public int[] field571;

	@ObfuscatedName("DHNAQSHE.M")
	public int[] field572;

	@ObfuscatedName("DHNAQSHE.a()LSGKWAMJX;")
	public final SGKWAMJX method223() {
		SGKWAMJX var2;
		synchronized (field560) {
			var2 = (SGKWAMJX) field560.method394();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field581) {
			var2.method177();
		}

		if (var2.field1281 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1281));
			while (true) {
				if (field545.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field545, var4, field545.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1281 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1281[var7] = field545[var7];
		}

		return var2;
	}

	@ObfuscatedName("DHNAQSHE.b(I)I")
	public final int method224() {
		return field572.length;
	}

	@ObfuscatedName("DHNAQSHE.a(II)Z")
	public final boolean method225(int arg0) {
		if (field548[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("DHNAQSHE.a(I[BIZ)Z")
	public final boolean method226(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field574.reset();
			field574.update(arg1, 0, var4);
			int var6 = (int) field574.getValue();

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

	@ObfuscatedName("DHNAQSHE.a(BIII)I")
	public final int method227(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg1;
		for (int var5 = 0; var5 < field552.length; var5++) {
			if (field552[var5] == var4) {
				if (arg0 == 0) {
					return field571[var5];
				}

				return field557[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("DHNAQSHE.b(II)V")
	public final void method228(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field580.length && arg1 >= 0 && arg1 <= field580[arg0].length && field580[arg0][arg1] != 0) {
			synchronized (field581) {
				for (SGKWAMJX var4 = (SGKWAMJX) field581.method304(); var4 != null; var4 = (SGKWAMJX) field581.method305()) {
					if (var4.field1279 == arg0 && var4.field1280 == arg1) {
						return;
					}
				}

				SGKWAMJX var5 = new SGKWAMJX();
				var5.field1279 = arg0;
				var5.field1280 = arg1;
				var5.field1277 = true;

				synchronized (field566) {
					field566.method392(var5);
				}

				field581.method302(var5);
			}
		}
	}

	@ObfuscatedName("DHNAQSHE.a(I)V")
	public final void method229(int arg0) {
		method228(0, arg0);
	}

	@ObfuscatedName("DHNAQSHE.a(LTKEGJSFV;Lclient;)V")
	public final void method230(TKEGJSFV arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method542(var3[var4], null);
			int var6 = var5.length / 2;
			EGCCHUZS var7 = new EGCCHUZS(var5);
			field580[var4] = new int[var6];
			field575[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field580[var4][var8] = var7.method263();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method542(var9[var10], null);
			int var12 = var11.length / 4;
			EGCCHUZS var13 = new EGCCHUZS(var11);
			field551[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field551[var10][var14] = var13.method266();
			}
		}

		byte[] var15 = arg0.method542("model_index", null);
		int var16 = field580[0].length;
		field554 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field554[var17] = var15[var17];
			} else {
				field554[var17] = 0;
			}
		}

		byte[] var18 = arg0.method542("map_index", null);
		EGCCHUZS var19 = new EGCCHUZS(var18);
		int var20 = var18.length / 7;
		field552 = new int[var20];
		field571 = new int[var20];
		field557 = new int[var20];
		field562 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field552[var21] = var19.method263();
			field571[var21] = var19.method263();
			field557[var21] = var19.method263();
			field562[var21] = var19.method261();
		}

		byte[] var22 = arg0.method542("anim_index", null);
		EGCCHUZS var23 = new EGCCHUZS(var22);
		int var24 = var22.length / 2;
		field572 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field572[var25] = var23.method263();
		}

		byte[] var26 = arg0.method542("midi_index", null);
		EGCCHUZS var27 = new EGCCHUZS(var26);
		int var28 = var26.length;
		field548 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field548[var29] = var27.method261();
		}

		field547 = arg1;
		field568 = true;
		field547.method51(this, 2);
	}

	@ObfuscatedName("DHNAQSHE.a(IIIB)V")
	public final void method231(int arg0, int arg1, byte arg2) {
		if (field547.field486[0] != null && field580[arg0][arg1] != 0) {
			byte[] var4 = field547.field486[arg0 + 1].method245(arg1);
			if (!method226(field580[arg0][arg1], var4, field551[arg0][arg1])) {
				field575[arg0][arg1] = arg2;

				if (arg2 > field577) {
					field577 = arg2;
				}

				field559++;
			}
		}
	}

	@ObfuscatedName("DHNAQSHE.c(II)I")
	public final int method232(int arg0) {
		return field554[arg0] & 0xFF;
	}

	@ObfuscatedName("DHNAQSHE.b()I")
	public final int method233() {
		synchronized (field581) {
			return field581.method306();
		}
	}

	@ObfuscatedName("DHNAQSHE.a(IIZ)V")
	public final void method234(int arg0, int arg1) {
		if (field547.field486[0] != null && (field580[arg0][arg1] != 0 && (field575[arg0][arg1] != 0 && field577 != 0))) {
			SGKWAMJX var3 = new SGKWAMJX();
			var3.field1279 = arg0;
			var3.field1280 = arg1;
			var3.field1277 = false;

			synchronized (field582) {
				field582.method392(var3);
			}
		}
	}

	@ObfuscatedName("DHNAQSHE.a(LSGKWAMJX;I)V")
	public final void method235(SGKWAMJX arg0) {
		try {
			if (field578 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field573 < 4000L) {
					return;
				}

				field573 = var2;
				field578 = field547.method47(client.field106 + 43594);
				field544 = field578.getInputStream();
				field579 = field578.getOutputStream();
				field579.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field544.read();
				}

				field553 = 0;
			}

			field569[0] = (byte) arg0.field1279;
			field569[1] = (byte) (arg0.field1280 >> 8);
			field569[2] = (byte) arg0.field1280;
			if (arg0.field1277) {
				field569[3] = 2;
			} else if (field547.field470) {
				field569[3] = 0;
			} else {
				field569[3] = 1;
			}

			field579.write(field569, 0, 4);
			field567 = 0;
			field570 = -10000;
		} catch (IOException var7) {
			try {
				field578.close();
			} catch (Exception var6) {
			}

			field578 = null;
			field544 = null;
			field579 = null;
			field556 = 0;
			field570++;
		}
	}

	@ObfuscatedName("DHNAQSHE.d(II)Z")
	public final boolean method236(int arg0) {
		for (int var2 = 0; var2 < field552.length; var2++) {
			if (field557[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("DHNAQSHE.a(Z)V")
	public final void method237() {
		synchronized (field582) {
			field582.method399();
		}
	}

	@ObfuscatedName("DHNAQSHE.c(I)V")
	public final void method238() {
		SGKWAMJX var2;
		synchronized (field566) {
			var2 = (SGKWAMJX) field566.method394();
		}

		while (var2 != null) {
			field564 = true;
			byte[] var3 = null;
			if (field547.field486[0] != null) {
				var3 = field547.field486[var2.field1279 + 1].method245(var2.field1280);
			}

			if (!method226(field580[var2.field1279][var2.field1280], var3, field551[var2.field1279][var2.field1280])) {
				var3 = null;
			}

			synchronized (field566) {
				if (var3 == null) {
					field561.method392(var2);
				} else {
					var2.field1281 = var3;

					synchronized (field560) {
						field560.method392(var2);
					}
				}

				var2 = (SGKWAMJX) field566.method394();
			}
		}
	}

	@ObfuscatedName("DHNAQSHE.e(II)I")
	public final int method239(int arg0) {
		return field580[arg0].length;
	}

	public final void run() {
		try {
			while (field568) {
				field576++;
				byte var1 = 20;
				if (field577 == 0 && field547.field486[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field564 = true;
				for (int var2 = 0; var2 < 100 && field564; var2++) {
					field564 = false;
					method238();
					method242();

					if (field549 == 0 && var2 >= 5) {
						break;
					}

					method240();

					if (field544 != null) {
						method244();
					}
				}

				boolean var3 = false;
				for (SGKWAMJX var4 = (SGKWAMJX) field563.method395(); var4 != null; var4 = (SGKWAMJX) field563.method397()) {
					if (var4.field1277) {
						var3 = true;
						var4.field1278++;
						if (var4.field1278 > 50) {
							var4.field1278 = 0;
							method235(var4);
						}
					}
				}

				if (!var3) {
					for (SGKWAMJX var5 = (SGKWAMJX) field563.method395(); var5 != null; var5 = (SGKWAMJX) field563.method397()) {
						var3 = true;
						var5.field1278++;
						if (var5.field1278 > 50) {
							var5.field1278 = 0;
							method235(var5);
						}
					}
				}

				if (var3) {
					field553++;
					if (field553 > 750) {
						try {
							field578.close();
						} catch (Exception var8) {
						}

						field578 = null;
						field544 = null;
						field579 = null;
						field556 = 0;
					}
				} else {
					field553 = 0;
					field558 = "";
				}

				if (field547.field470 && field578 != null && field579 != null && (field577 > 0 || field547.field486[0] == null)) {
					field567++;
					if (field567 > 500) {
						field567 = 0;
						field569[0] = 0;
						field569[1] = 0;
						field569[2] = 0;
						field569[3] = 10;
						try {
							field579.write(field569, 0, 4);
						} catch (IOException var7) {
							field553 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("DHNAQSHE.b(Z)V")
	public final void method240() {
		while (field549 == 0) {
			if (field550 >= 10 || field577 == 0) {
				return;
			}

			SGKWAMJX var2;
			synchronized (field582) {
				var2 = (SGKWAMJX) field582.method394();
			}

			while (var2 != null) {
				if (field575[var2.field1279][var2.field1280] != 0) {
					field575[var2.field1279][var2.field1280] = 0;
					field563.method392(var2);
					method235(var2);
					field564 = true;

					if (field565 < field559) {
						field565++;
					}

					field558 = "Loading extra files - " + field565 * 100 / field559 + "%";
					field550++;
					if (field550 == 10) {
						return;
					}
				}

				synchronized (field582) {
					var2 = (SGKWAMJX) field582.method394();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field575[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field577) {
						var5[var7] = 0;
						SGKWAMJX var8 = new SGKWAMJX();
						var8.field1279 = var4;
						var8.field1280 = var7;
						var8.field1277 = false;
						field563.method392(var8);
						method235(var8);
						field564 = true;

						if (field565 < field559) {
							field565++;
						}

						field558 = "Loading extra files - " + field565 * 100 / field559 + "%";
						field550++;
						if (field550 == 10) {
							return;
						}
					}
				}
			}

			field577--;
		}
	}

	@ObfuscatedName("DHNAQSHE.a(IZ)V")
	public final void method241(boolean arg0) {
		int var2 = field552.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field562[var3] != 0) {
				method231(3, field557[var3], (byte) 2);
				method231(3, field571[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("DHNAQSHE.d(I)V")
	public final void method242() {
		field549 = 0;
		field550 = 0;
		for (SGKWAMJX var1 = (SGKWAMJX) field563.method395(); var1 != null; var1 = (SGKWAMJX) field563.method397()) {
			if (var1.field1277) {
				field549++;
			} else {
				field550++;
			}
		}

		while (field549 < 10) {
			SGKWAMJX var2 = (SGKWAMJX) field561.method394();
			if (var2 == null) {
				break;
			}

			if (field575[var2.field1279][var2.field1280] != 0) {
				field565++;
			}

			field575[var2.field1279][var2.field1280] = 0;
			field563.method392(var2);
			field549++;
			method235(var2);
			field564 = true;
		}
	}

	@ObfuscatedName("DHNAQSHE.c()V")
	public final void method243() {
		field568 = false;
	}

	@ObfuscatedName("DHNAQSHE.c(Z)V")
	public final void method244() {
		try {
			int var1 = field544.available();
			if (field556 == 0 && var1 >= 6) {
				field564 = true;

				for (int var2 = 0; var2 < 6; var2 += field544.read(field569, var2, 6 - var2)) {
				}

				int var3 = field569[0] & 0xFF;
				int var4 = ((field569[1] & 0xFF) << 8) + (field569[2] & 0xFF);
				int var5 = ((field569[3] & 0xFF) << 8) + (field569[4] & 0xFF);
				int var6 = field569[5] & 0xFF;
				field546 = null;
				for (SGKWAMJX var7 = (SGKWAMJX) field563.method395(); var7 != null; var7 = (SGKWAMJX) field563.method397()) {
					if (var7.field1279 == var3 && var7.field1280 == var4) {
						field546 = var7;
					}

					if (field546 != null) {
						var7.field1278 = 0;
					}
				}

				if (field546 != null) {
					field553 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field546.field1281 = null;

						if (field546.field1277) {
							synchronized (field560) {
								field560.method392(field546);
							}
						} else {
							field546.method379();
						}

						field546 = null;
					} else {
						if (field546.field1281 == null && var6 == 0) {
							field546.field1281 = new byte[var5];
						}

						if (field546.field1281 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field555 = var6 * 500;
				field556 = 500;
				if (field556 > var5 - var6 * 500) {
					field556 = var5 - var6 * 500;
				}
			}

			if (field556 > 0 && var1 >= field556) {
				field564 = true;
				byte[] var9 = field569;
				int var10 = 0;
				if (field546 != null) {
					var9 = field546.field1281;
					var10 = field555;
				}

				for (int var11 = 0; var11 < field556; var11 += field544.read(var9, var10 + var11, field556 - var11)) {
				}

				if (field556 + field555 >= var9.length && field546 != null) {
					if (field547.field486[0] != null) {
						field547.field486[field546.field1279 + 1].method246(var9, var9.length, field546.field1280);
					}

					if (!field546.field1277 && field546.field1279 == 3) {
						field546.field1277 = true;
						field546.field1279 = 93;
					}

					if (field546.field1277) {
						synchronized (field560) {
							field560.method392(field546);
						}
					} else {
						field546.method379();
					}
				}

				field556 = 0;
			}
		} catch (IOException var17) {
			try {
				field578.close();
			} catch (Exception var14) {
			}

			field578 = null;
			field544 = null;
			field579 = null;
			field556 = 0;
		}
	}
}
