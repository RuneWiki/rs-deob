package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("DGAWSPEW")
public class DGAWSPEW extends WCZVUZLV implements Runnable {

	@ObfuscatedName("DGAWSPEW.e")
	public byte[][] field541 = new byte[4][];

	@ObfuscatedName("DGAWSPEW.f")
	public String field542 = "";

	@ObfuscatedName("DGAWSPEW.m")
	public FEPBPONH field547 = new FEPBPONH();

	@ObfuscatedName("DGAWSPEW.n")
	public FEPBPONH field548 = new FEPBPONH();

	@ObfuscatedName("DGAWSPEW.q")
	public CRC32 field551 = new CRC32();

	@ObfuscatedName("DGAWSPEW.u")
	public NAZXUZWI field554 = new NAZXUZWI();

	@ObfuscatedName("DGAWSPEW.w")
	public int[][] field556 = new int[4][];

	@ObfuscatedName("DGAWSPEW.z")
	public boolean field558 = true;

	@ObfuscatedName("DGAWSPEW.F")
	public byte[] field562 = new byte[65000];

	@ObfuscatedName("DGAWSPEW.G")
	public FEPBPONH field563 = new FEPBPONH();

	@ObfuscatedName("DGAWSPEW.H")
	public byte[] field564 = new byte[500];

	@ObfuscatedName("DGAWSPEW.M")
	public int[][] field569 = new int[4][];

	@ObfuscatedName("DGAWSPEW.P")
	public FEPBPONH field572 = new FEPBPONH();

	@ObfuscatedName("DGAWSPEW.Q")
	public FEPBPONH field573 = new FEPBPONH();

	@ObfuscatedName("DGAWSPEW.U")
	public boolean field577 = false;

	@ObfuscatedName("DGAWSPEW.g")
	public int field543;

	@ObfuscatedName("DGAWSPEW.i")
	public int field544;

	@ObfuscatedName("DGAWSPEW.j")
	public int field545;

	@ObfuscatedName("DGAWSPEW.l")
	public int field546;

	@ObfuscatedName("DGAWSPEW.o")
	public int field549;

	@ObfuscatedName("DGAWSPEW.v")
	public int field555;

	@ObfuscatedName("DGAWSPEW.D")
	public int field560;

	@ObfuscatedName("DGAWSPEW.I")
	public int field565;

	@ObfuscatedName("DGAWSPEW.J")
	public int field566;

	@ObfuscatedName("DGAWSPEW.K")
	public int field567;

	@ObfuscatedName("DGAWSPEW.O")
	public int field571;

	@ObfuscatedName("DGAWSPEW.p")
	public long field550;

	@ObfuscatedName("DGAWSPEW.t")
	public DYWHHFEE field553;

	@ObfuscatedName("DGAWSPEW.T")
	public client field576;

	@ObfuscatedName("DGAWSPEW.N")
	public InputStream field570;

	@ObfuscatedName("DGAWSPEW.B")
	public OutputStream field559;

	@ObfuscatedName("DGAWSPEW.E")
	public Socket field561;

	@ObfuscatedName("DGAWSPEW.d")
	public byte[] field540;

	@ObfuscatedName("DGAWSPEW.b")
	public int[] field539;

	@ObfuscatedName("DGAWSPEW.r")
	public int[] field552;

	@ObfuscatedName("DGAWSPEW.x")
	public int[] field557;

	@ObfuscatedName("DGAWSPEW.L")
	public int[] field568;

	@ObfuscatedName("DGAWSPEW.R")
	public int[] field574;

	@ObfuscatedName("DGAWSPEW.S")
	public int[] field575;

	@ObfuscatedName("DGAWSPEW.a(I)V")
	public final void method222(int arg0) {
		method230(0, arg0);
	}

	@ObfuscatedName("DGAWSPEW.a(ZI)V")
	public final void method223(boolean arg0) {
		int var2 = field552.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field557[var3] != 0) {
				method224(field568[var3], 3, (byte) 2);
				method224(field574[var3], 3, (byte) 2);
			}
		}
	}

	@ObfuscatedName("DGAWSPEW.a(IIIB)V")
	public final void method224(int arg0, int arg1, byte arg2) {
		if (field576.field387[0] != null && field569[arg1][arg0] != 0) {
			byte[] var4 = field576.field387[arg1 + 1].method491(arg0);
			if (!method229(field556[arg1][arg0], var4, field569[arg1][arg0])) {
				field541[arg1][arg0] = arg2;

				if (arg2 > field565) {
					field565 = arg2;
				}

				field546++;
			}
		}
	}

	@ObfuscatedName("DGAWSPEW.a(IZI)V")
	public final void method225(int arg0, int arg1) {
		if (field576.field387[0] != null && (field569[arg1][arg0] != 0 && (field541[arg1][arg0] != 0 && field565 != 0))) {
			DYWHHFEE var3 = new DYWHHFEE();
			var3.field601 = arg1;
			var3.field602 = arg0;
			var3.field605 = false;

			synchronized (field573) {
				field573.method266(var3);
			}
		}
	}

	@ObfuscatedName("DGAWSPEW.a(LDYWHHFEE;B)V")
	public final void method226(DYWHHFEE arg0) {
		try {
			if (field561 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field550 < 4000L) {
					return;
				}

				field550 = var2;
				field561 = field576.method201(client.field98 + 43594);
				field570 = field561.getInputStream();
				field559 = field561.getOutputStream();
				field559.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field570.read();
				}

				field555 = 0;
			}

			field564[0] = (byte) arg0.field601;
			field564[1] = (byte) (arg0.field602 >> 8);
			field564[2] = (byte) arg0.field602;
			if (arg0.field605) {
				field564[3] = 2;
			} else if (field576.field340) {
				field564[3] = 0;
			} else {
				field564[3] = 1;
			}

			field559.write(field564, 0, 4);
			field560 = 0;
			field549 = -10000;
		} catch (IOException var7) {
			try {
				field561.close();
			} catch (Exception var6) {
			}

			field561 = null;
			field570 = null;
			field559 = null;
			field545 = 0;
			field549++;
		}
	}

	@ObfuscatedName("DGAWSPEW.a()LDYWHHFEE;")
	public final DYWHHFEE method227() {
		DYWHHFEE var2;
		synchronized (field547) {
			var2 = (DYWHHFEE) field547.method268();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field554) {
			var2.method495();
		}

		if (var2.field604 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field604));
			while (true) {
				if (field562.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field562, var4, field562.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field604 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field604[var7] = field562[var7];
		}

		return var2;
	}

	@ObfuscatedName("DGAWSPEW.a(IBII)I")
	public final int method228(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field552.length; var5++) {
			if (field552[var5] == var4) {
				if (arg2 == 0) {
					return field574[var5];
				}

				return field568[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("DGAWSPEW.a(I[BIB)Z")
	public final boolean method229(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field551.reset();
			field551.update(arg1, 0, var4);
			int var6 = (int) field551.getValue();

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

	@ObfuscatedName("DGAWSPEW.a(II)V")
	public final void method230(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field569.length && arg1 >= 0 && arg1 <= field569[arg0].length && field569[arg0][arg1] != 0) {
			synchronized (field554) {
				for (DYWHHFEE var4 = (DYWHHFEE) field554.method390(); var4 != null; var4 = (DYWHHFEE) field554.method391()) {
					if (var4.field601 == arg0 && var4.field602 == arg1) {
						return;
					}
				}

				DYWHHFEE var5 = new DYWHHFEE();
				var5.field601 = arg0;
				var5.field602 = arg1;
				var5.field605 = true;

				synchronized (field548) {
					field548.method266(var5);
				}

				field554.method388(var5);
			}
		}
	}

	@ObfuscatedName("DGAWSPEW.b(I)V")
	public final void method231() {
		try {
			int var1 = field570.available();
			if (field545 == 0 && var1 >= 6) {
				field577 = true;

				for (int var2 = 0; var2 < 6; var2 += field570.read(field564, var2, 6 - var2)) {
				}

				int var3 = field564[0] & 0xFF;
				int var4 = ((field564[1] & 0xFF) << 8) + (field564[2] & 0xFF);
				int var5 = ((field564[3] & 0xFF) << 8) + (field564[4] & 0xFF);
				int var6 = field564[5] & 0xFF;
				field553 = null;
				for (DYWHHFEE var7 = (DYWHHFEE) field563.method269(); var7 != null; var7 = (DYWHHFEE) field563.method271()) {
					if (var7.field601 == var3 && var7.field602 == var4) {
						field553 = var7;
					}

					if (field553 != null) {
						var7.field603 = 0;
					}
				}

				if (field553 != null) {
					field555 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field553.field604 = null;

						if (field553.field605) {
							synchronized (field547) {
								field547.method266(field553);
							}
						} else {
							field553.method221();
						}

						field553 = null;
					} else {
						if (field553.field604 == null && var6 == 0) {
							field553.field604 = new byte[var5];
						}

						if (field553.field604 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field544 = var6 * 500;
				field545 = 500;
				if (field545 > var5 - var6 * 500) {
					field545 = var5 - var6 * 500;
				}
			}

			if (field545 > 0 && var1 >= field545) {
				field577 = true;
				byte[] var9 = field564;
				int var10 = 0;
				if (field553 != null) {
					var9 = field553.field604;
					var10 = field544;
				}

				for (int var11 = 0; var11 < field545; var11 += field570.read(var9, var10 + var11, field545 - var11)) {
				}

				if (field545 + field544 >= var9.length && field553 != null) {
					if (field576.field387[0] != null) {
						field576.field387[field553.field601 + 1].method492(var9.length, var9, field553.field602);
					}

					if (!field553.field605 && field553.field601 == 3) {
						field553.field605 = true;
						field553.field601 = 93;
					}

					if (field553.field605) {
						synchronized (field547) {
							field547.method266(field553);
						}
					} else {
						field553.method221();
					}
				}

				field545 = 0;
			}
		} catch (IOException var17) {
			try {
				field561.close();
			} catch (Exception var14) {
			}

			field561 = null;
			field570 = null;
			field559 = null;
			field545 = 0;
		}
	}

	@ObfuscatedName("DGAWSPEW.a(LQDHHNYHL;Lclient;)V")
	public final void method232(QDHHNYHL arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method488(var3[var4], null);
			int var6 = var5.length / 2;
			PGNBHFUF var7 = new PGNBHFUF(var5);
			field569[var4] = new int[var6];
			field541[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field569[var4][var8] = var7.method422();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method488(var9[var10], null);
			int var12 = var11.length / 4;
			PGNBHFUF var13 = new PGNBHFUF(var11);
			field556[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field556[var10][var14] = var13.method425();
			}
		}

		byte[] var15 = arg0.method488("model_index", null);
		int var16 = field569[0].length;
		field540 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field540[var17] = var15[var17];
			} else {
				field540[var17] = 0;
			}
		}

		byte[] var18 = arg0.method488("map_index", null);
		PGNBHFUF var19 = new PGNBHFUF(var18);
		int var20 = var18.length / 7;
		field552 = new int[var20];
		field574 = new int[var20];
		field568 = new int[var20];
		field557 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field552[var21] = var19.method422();
			field574[var21] = var19.method422();
			field568[var21] = var19.method422();
			field557[var21] = var19.method420();
		}

		byte[] var22 = arg0.method488("anim_index", null);
		PGNBHFUF var23 = new PGNBHFUF(var22);
		int var24 = var22.length / 2;
		field575 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field575[var25] = var23.method422();
		}

		byte[] var26 = arg0.method488("midi_index", null);
		PGNBHFUF var27 = new PGNBHFUF(var26);
		int var28 = var26.length;
		field539 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field539[var29] = var27.method420();
		}

		field576 = arg1;
		field558 = true;
		field576.method164(this, 2);
	}

	@ObfuscatedName("DGAWSPEW.a(B)V")
	public final void method233() {
		synchronized (field573) {
			field573.method273();
		}
	}

	public final void run() {
		try {
			while (field558) {
				field571++;
				byte var1 = 20;
				if (field565 == 0 && field576.field387[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field577 = true;
				for (int var2 = 0; var2 < 100 && field577; var2++) {
					field577 = false;
					method243();
					method237();

					if (field566 == 0 && var2 >= 5) {
						break;
					}

					method238();

					if (field570 != null) {
						method231();
					}
				}

				boolean var3 = false;
				for (DYWHHFEE var4 = (DYWHHFEE) field563.method269(); var4 != null; var4 = (DYWHHFEE) field563.method271()) {
					if (var4.field605) {
						var3 = true;
						var4.field603++;
						if (var4.field603 > 50) {
							var4.field603 = 0;
							method226(var4);
						}
					}
				}

				if (!var3) {
					for (DYWHHFEE var5 = (DYWHHFEE) field563.method269(); var5 != null; var5 = (DYWHHFEE) field563.method271()) {
						var3 = true;
						var5.field603++;
						if (var5.field603 > 50) {
							var5.field603 = 0;
							method226(var5);
						}
					}
				}

				if (var3) {
					field555++;
					if (field555 > 750) {
						try {
							field561.close();
						} catch (Exception var8) {
						}

						field561 = null;
						field570 = null;
						field559 = null;
						field545 = 0;
					}
				} else {
					field555 = 0;
					field542 = "";
				}

				if (field576.field340 && field561 != null && field559 != null && (field565 > 0 || field576.field387[0] == null)) {
					field560++;
					if (field560 > 500) {
						field560 = 0;
						field564[0] = 0;
						field564[1] = 0;
						field564[2] = 0;
						field564[3] = 10;
						try {
							field559.write(field564, 0, 4);
						} catch (IOException var7) {
							field555 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("DGAWSPEW.b(II)Z")
	public final boolean method234(int arg0) {
		if (field539[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("DGAWSPEW.b(ZI)Z")
	public final boolean method235(int arg0) {
		for (int var2 = 0; var2 < field552.length; var2++) {
			if (field568[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("DGAWSPEW.a(IZ)I")
	public final int method236(int arg0) {
		return field540[arg0] & 0xFF;
	}

	@ObfuscatedName("DGAWSPEW.b(B)V")
	public final void method237() {
		field566 = 0;
		field567 = 0;
		for (DYWHHFEE var1 = (DYWHHFEE) field563.method269(); var1 != null; var1 = (DYWHHFEE) field563.method271()) {
			if (var1.field605) {
				field566++;
			} else {
				field567++;
			}
		}

		while (field566 < 10) {
			DYWHHFEE var2 = (DYWHHFEE) field572.method268();
			if (var2 == null) {
				break;
			}

			if (field541[var2.field601][var2.field602] != 0) {
				field543++;
			}

			field541[var2.field601][var2.field602] = 0;
			field563.method266(var2);
			field566++;
			method226(var2);
			field577 = true;
		}
	}

	@ObfuscatedName("DGAWSPEW.a(Z)V")
	public final void method238() {
		while (field566 == 0) {
			if (field567 >= 10 || field565 == 0) {
				return;
			}

			DYWHHFEE var2;
			synchronized (field573) {
				var2 = (DYWHHFEE) field573.method268();
			}

			while (var2 != null) {
				if (field541[var2.field601][var2.field602] != 0) {
					field541[var2.field601][var2.field602] = 0;
					field563.method266(var2);
					method226(var2);
					field577 = true;

					if (field543 < field546) {
						field543++;
					}

					field542 = "Loading extra files - " + field543 * 100 / field546 + "%";
					field567++;
					if (field567 == 10) {
						return;
					}
				}

				synchronized (field573) {
					var2 = (DYWHHFEE) field573.method268();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field541[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field565) {
						var5[var7] = 0;
						DYWHHFEE var8 = new DYWHHFEE();
						var8.field601 = var4;
						var8.field602 = var7;
						var8.field605 = false;
						field563.method266(var8);
						method226(var8);
						field577 = true;

						if (field543 < field546) {
							field543++;
						}

						field542 = "Loading extra files - " + field543 * 100 / field546 + "%";
						field567++;
						if (field567 == 10) {
							return;
						}
					}
				}
			}

			field565--;
		}
	}

	@ObfuscatedName("DGAWSPEW.c(I)I")
	public final int method239() {
		return field575.length;
	}

	@ObfuscatedName("DGAWSPEW.b()I")
	public final int method240() {
		synchronized (field554) {
			return field554.method392();
		}
	}

	@ObfuscatedName("DGAWSPEW.c(II)I")
	public final int method241(int arg0) {
		return field569[arg0].length;
	}

	@ObfuscatedName("DGAWSPEW.c()V")
	public final void method242() {
		field558 = false;
	}

	@ObfuscatedName("DGAWSPEW.d(I)V")
	public final void method243() {
		DYWHHFEE var2;
		synchronized (field548) {
			var2 = (DYWHHFEE) field548.method268();
		}

		while (var2 != null) {
			field577 = true;
			byte[] var3 = null;
			if (field576.field387[0] != null) {
				var3 = field576.field387[var2.field601 + 1].method491(var2.field602);
			}

			if (!method229(field556[var2.field601][var2.field602], var3, field569[var2.field601][var2.field602])) {
				var3 = null;
			}

			synchronized (field548) {
				if (var3 == null) {
					field572.method266(var2);
				} else {
					var2.field604 = var3;

					synchronized (field547) {
						field547.method266(var2);
					}
				}

				var2 = (DYWHHFEE) field548.method268();
			}
		}
	}
}
