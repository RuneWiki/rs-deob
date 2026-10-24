package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("IHBKBLZU")
public class IHBKBLZU extends CAVLIWWI implements Runnable {

	@ObfuscatedName("IHBKBLZU.a")
	public ETMNPRAF field658 = new ETMNPRAF();

	@ObfuscatedName("IHBKBLZU.b")
	public int[][] field659 = new int[4][];

	@ObfuscatedName("IHBKBLZU.g")
	public boolean field663 = true;

	@ObfuscatedName("IHBKBLZU.h")
	public boolean field664 = false;

	@ObfuscatedName("IHBKBLZU.i")
	public byte[][] field665 = new byte[4][];

	@ObfuscatedName("IHBKBLZU.k")
	public ETMNPRAF field667 = new ETMNPRAF();

	@ObfuscatedName("IHBKBLZU.n")
	public ETMNPRAF field670 = new ETMNPRAF();

	@ObfuscatedName("IHBKBLZU.w")
	public byte[] field678 = new byte[500];

	@ObfuscatedName("IHBKBLZU.z")
	public LKYWDMZN field681 = new LKYWDMZN();

	@ObfuscatedName("IHBKBLZU.C")
	public ETMNPRAF field684 = new ETMNPRAF();

	@ObfuscatedName("IHBKBLZU.F")
	public ETMNPRAF field687 = new ETMNPRAF();

	@ObfuscatedName("IHBKBLZU.I")
	public int[][] field689 = new int[4][];

	@ObfuscatedName("IHBKBLZU.J")
	public byte[] field690 = new byte[65000];

	@ObfuscatedName("IHBKBLZU.K")
	public String field691 = "";

	@ObfuscatedName("IHBKBLZU.M")
	public CRC32 field693 = new CRC32();

	@ObfuscatedName("IHBKBLZU.d")
	public int field660;

	@ObfuscatedName("IHBKBLZU.l")
	public int field668;

	@ObfuscatedName("IHBKBLZU.m")
	public int field669;

	@ObfuscatedName("IHBKBLZU.o")
	public int field671;

	@ObfuscatedName("IHBKBLZU.p")
	public int field672;

	@ObfuscatedName("IHBKBLZU.x")
	public int field679;

	@ObfuscatedName("IHBKBLZU.D")
	public int field685;

	@ObfuscatedName("IHBKBLZU.E")
	public int field686;

	@ObfuscatedName("IHBKBLZU.L")
	public int field692;

	@ObfuscatedName("IHBKBLZU.N")
	public int field694;

	@ObfuscatedName("IHBKBLZU.O")
	public int field695;

	@ObfuscatedName("IHBKBLZU.s")
	public long field675;

	@ObfuscatedName("IHBKBLZU.u")
	public NFBFXKHQ field677;

	@ObfuscatedName("IHBKBLZU.G")
	public client field688;

	@ObfuscatedName("IHBKBLZU.A")
	public InputStream field682;

	@ObfuscatedName("IHBKBLZU.q")
	public OutputStream field673;

	@ObfuscatedName("IHBKBLZU.f")
	public Socket field662;

	@ObfuscatedName("IHBKBLZU.P")
	public byte[] field696;

	@ObfuscatedName("IHBKBLZU.e")
	public int[] field661;

	@ObfuscatedName("IHBKBLZU.j")
	public int[] field666;

	@ObfuscatedName("IHBKBLZU.r")
	public int[] field674;

	@ObfuscatedName("IHBKBLZU.t")
	public int[] field676;

	@ObfuscatedName("IHBKBLZU.y")
	public int[] field680;

	@ObfuscatedName("IHBKBLZU.B")
	public int[] field683;

	@ObfuscatedName("IHBKBLZU.a(II)I")
	public final int method244(int arg0) {
		return field689[arg0].length;
	}

	@ObfuscatedName("IHBKBLZU.b(II)V")
	public final void method245(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field689.length && arg1 >= 0 && arg1 <= field689[arg0].length && field689[arg0][arg1] != 0) {
			synchronized (field681) {
				for (NFBFXKHQ var4 = (NFBFXKHQ) field681.method328(); var4 != null; var4 = (NFBFXKHQ) field681.method329()) {
					if (var4.field889 == arg0 && var4.field887 == arg1) {
						return;
					}
				}

				NFBFXKHQ var5 = new NFBFXKHQ();
				var5.field889 = arg0;
				var5.field887 = arg1;
				var5.field890 = true;

				synchronized (field658) {
					field658.method178(var5);
				}

				field681.method326(var5);
			}
		}
	}

	@ObfuscatedName("IHBKBLZU.a(B)V")
	public final void method246() {
		NFBFXKHQ var2;
		synchronized (field658) {
			var2 = (NFBFXKHQ) field658.method180();
		}

		while (var2 != null) {
			field664 = true;
			byte[] var3 = null;
			if (field688.field300[0] != null) {
				var3 = field688.field300[var2.field889 + 1].method582(var2.field887);
			}

			if (!method257(var3, field689[var2.field889][var2.field887], field659[var2.field889][var2.field887])) {
				var3 = null;
			}

			synchronized (field658) {
				if (var3 == null) {
					field687.method178(var2);
				} else {
					var2.field886 = var3;

					synchronized (field670) {
						field670.method178(var2);
					}
				}

				var2 = (NFBFXKHQ) field658.method180();
			}
		}
	}

	@ObfuscatedName("IHBKBLZU.a(LNFBFXKHQ;B)V")
	public final void method247(NFBFXKHQ arg0) {
		try {
			if (field662 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field675 < 4000L) {
					return;
				}

				field675 = var2;
				field662 = field688.method154(client.field456 + 43594);
				field682 = field662.getInputStream();
				field673 = field662.getOutputStream();
				field673.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field682.read();
				}

				field694 = 0;
			}

			field678[0] = (byte) arg0.field889;
			field678[1] = (byte) (arg0.field887 >> 8);
			field678[2] = (byte) arg0.field887;
			if (arg0.field890) {
				field678[3] = 2;
			} else if (field688.field323) {
				field678[3] = 0;
			} else {
				field678[3] = 1;
			}

			field673.write(field678, 0, 4);
			field695 = 0;
			field669 = -10000;
		} catch (IOException var7) {
			try {
				field662.close();
			} catch (Exception var6) {
			}

			field662 = null;
			field682 = null;
			field673 = null;
			field686 = 0;
			field669++;
		}
	}

	@ObfuscatedName("IHBKBLZU.a(ZI)I")
	public final int method248(int arg0) {
		return field696[arg0] & 0xFF;
	}

	public final void run() {
		try {
			while (field663) {
				field679++;
				byte var1 = 20;
				if (field692 == 0 && field688.field300[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field664 = true;
				for (int var2 = 0; var2 < 100 && field664; var2++) {
					field664 = false;
					method246();
					method250();

					if (field671 == 0 && var2 >= 5) {
						break;
					}

					method264();

					if (field682 != null) {
						method254();
					}
				}

				boolean var3 = false;
				for (NFBFXKHQ var4 = (NFBFXKHQ) field684.method181(); var4 != null; var4 = (NFBFXKHQ) field684.method183()) {
					if (var4.field890) {
						var3 = true;
						var4.field888++;
						if (var4.field888 > 50) {
							var4.field888 = 0;
							method247(var4);
						}
					}
				}

				if (!var3) {
					for (NFBFXKHQ var5 = (NFBFXKHQ) field684.method181(); var5 != null; var5 = (NFBFXKHQ) field684.method183()) {
						var3 = true;
						var5.field888++;
						if (var5.field888 > 50) {
							var5.field888 = 0;
							method247(var5);
						}
					}
				}

				if (var3) {
					field694++;
					if (field694 > 750) {
						try {
							field662.close();
						} catch (Exception var8) {
						}

						field662 = null;
						field682 = null;
						field673 = null;
						field686 = 0;
					}
				} else {
					field694 = 0;
					field691 = "";
				}

				if (field688.field323 && field662 != null && field673 != null && (field692 > 0 || field688.field300[0] == null)) {
					field695++;
					if (field695 > 500) {
						field695 = 0;
						field678[0] = 0;
						field678[1] = 0;
						field678[2] = 0;
						field678[3] = 10;
						try {
							field673.write(field678, 0, 4);
						} catch (IOException var7) {
							field694 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("IHBKBLZU.a()I")
	public final int method249() {
		synchronized (field681) {
			return field681.method330();
		}
	}

	@ObfuscatedName("IHBKBLZU.b(I)V")
	public final void method250() {
		field671 = 0;
		field672 = 0;
		for (NFBFXKHQ var1 = (NFBFXKHQ) field684.method181(); var1 != null; var1 = (NFBFXKHQ) field684.method183()) {
			if (var1.field890) {
				field671++;
			} else {
				field672++;
			}
		}

		while (field671 < 10) {
			NFBFXKHQ var2 = (NFBFXKHQ) field687.method180();
			if (var2 == null) {
				break;
			}

			if (field665[var2.field889][var2.field887] != 0) {
				field668++;
			}

			field665[var2.field889][var2.field887] = 0;
			field684.method178(var2);
			field671++;
			method247(var2);
			field664 = true;
		}
	}

	@ObfuscatedName("IHBKBLZU.a(I)V")
	public final void method11(int arg0) {
		method245(0, arg0);
	}

	@ObfuscatedName("IHBKBLZU.a(LWEMOPWVJ;Lclient;)V")
	public final void method251(WEMOPWVJ arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method559(var3[var4], null);
			int var6 = var5.length / 2;
			SVWJKJVI var7 = new SVWJKJVI(var5);
			field689[var4] = new int[var6];
			field665[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field689[var4][var8] = var7.method463();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method559(var9[var10], null);
			int var12 = var11.length / 4;
			SVWJKJVI var13 = new SVWJKJVI(var11);
			field659[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field659[var10][var14] = var13.method466();
			}
		}

		byte[] var15 = arg0.method559("model_index", null);
		int var16 = field689[0].length;
		field696 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field696[var17] = var15[var17];
			} else {
				field696[var17] = 0;
			}
		}

		byte[] var18 = arg0.method559("map_index", null);
		SVWJKJVI var19 = new SVWJKJVI(var18);
		int var20 = var18.length / 7;
		field680 = new int[var20];
		field683 = new int[var20];
		field661 = new int[var20];
		field676 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field680[var21] = var19.method463();
			field683[var21] = var19.method463();
			field661[var21] = var19.method463();
			field676[var21] = var19.method461();
		}

		byte[] var22 = arg0.method559("anim_index", null);
		SVWJKJVI var23 = new SVWJKJVI(var22);
		int var24 = var22.length / 2;
		field666 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field666[var25] = var23.method463();
		}

		byte[] var26 = arg0.method559("midi_index", null);
		SVWJKJVI var27 = new SVWJKJVI(var26);
		int var28 = var26.length;
		field674 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field674[var29] = var27.method461();
		}

		field688 = arg1;
		field663 = true;
		field688.method87(this, 2);
	}

	@ObfuscatedName("IHBKBLZU.b()V")
	public final void method252() {
		field663 = false;
	}

	@ObfuscatedName("IHBKBLZU.a(BBII)V")
	public final void method253(byte arg0, int arg1, int arg2) {
		if (field688.field300[0] != null && field689[arg1][arg2] != 0) {
			byte[] var4 = field688.field300[arg1 + 1].method582(arg2);
			if (!method257(var4, field689[arg1][arg2], field659[arg1][arg2])) {
				field665[arg1][arg2] = arg0;

				if (arg0 > field692) {
					field692 = arg0;
				}

				field660++;
			}
		}
	}

	@ObfuscatedName("IHBKBLZU.b(B)V")
	public final void method254() {
		try {
			int var1 = field682.available();
			if (field686 == 0 && var1 >= 6) {
				field664 = true;

				for (int var2 = 0; var2 < 6; var2 += field682.read(field678, var2, 6 - var2)) {
				}

				int var3 = field678[0] & 0xFF;
				int var4 = ((field678[1] & 0xFF) << 8) + (field678[2] & 0xFF);
				int var5 = ((field678[3] & 0xFF) << 8) + (field678[4] & 0xFF);
				int var6 = field678[5] & 0xFF;
				field677 = null;
				for (NFBFXKHQ var7 = (NFBFXKHQ) field684.method181(); var7 != null; var7 = (NFBFXKHQ) field684.method183()) {
					if (var7.field889 == var3 && var7.field887 == var4) {
						field677 = var7;
					}

					if (field677 != null) {
						var7.field888 = 0;
					}
				}

				if (field677 != null) {
					field694 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field677.field886 = null;

						if (field677.field890) {
							synchronized (field670) {
								field670.method178(field677);
							}
						} else {
							field677.method331();
						}

						field677 = null;
					} else {
						if (field677.field886 == null && var6 == 0) {
							field677.field886 = new byte[var5];
						}

						if (field677.field886 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field685 = var6 * 500;
				field686 = 500;
				if (field686 > var5 - var6 * 500) {
					field686 = var5 - var6 * 500;
				}
			}

			if (field686 > 0 && var1 >= field686) {
				field664 = true;
				byte[] var9 = field678;
				int var10 = 0;
				if (field677 != null) {
					var9 = field677.field886;
					var10 = field685;
				}

				for (int var11 = 0; var11 < field686; var11 += field682.read(var9, var10 + var11, field686 - var11)) {
				}

				if (field686 + field685 >= var9.length && field677 != null) {
					if (field688.field300[0] != null) {
						field688.field300[field677.field889 + 1].method583(field677.field887, var9.length, var9);
					}

					if (!field677.field890 && field677.field889 == 3) {
						field677.field890 = true;
						field677.field889 = 93;
					}

					if (field677.field890) {
						synchronized (field670) {
							field670.method178(field677);
						}
					} else {
						field677.method331();
					}
				}

				field686 = 0;
			}
		} catch (IOException var17) {
			try {
				field662.close();
			} catch (Exception var14) {
			}

			field662 = null;
			field682 = null;
			field673 = null;
			field686 = 0;
		}
	}

	@ObfuscatedName("IHBKBLZU.c(II)Z")
	public final boolean method255(int arg0) {
		if (field674[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("IHBKBLZU.a(Z)I")
	public final int method256() {
		return field666.length;
	}

	@ObfuscatedName("IHBKBLZU.a(Z[BII)Z")
	public final boolean method257(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field693.reset();
			field693.update(arg0, 0, var4);
			int var6 = (int) field693.getValue();

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

	@ObfuscatedName("IHBKBLZU.a(ZZ)V")
	public final void method258(boolean arg0) {
		int var2 = field680.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field676[var3] != 0) {
				method253((byte) 2, 3, field661[var3]);
				method253((byte) 2, 3, field683[var3]);
			}
		}
	}

	@ObfuscatedName("IHBKBLZU.a(IIZI)I")
	public final int method259(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field680.length; var5++) {
			if (field680[var5] == var4) {
				if (arg0 == 0) {
					return field683[var5];
				}

				return field661[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("IHBKBLZU.c(I)V")
	public final void method260() {
		synchronized (field667) {
			field667.method185();
		}
	}

	@ObfuscatedName("IHBKBLZU.c()LNFBFXKHQ;")
	public final NFBFXKHQ method261() {
		NFBFXKHQ var2;
		synchronized (field670) {
			var2 = (NFBFXKHQ) field670.method180();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field681) {
			var2.method4();
		}

		if (var2.field886 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field886));
			while (true) {
				if (field690.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field690, var4, field690.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field886 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field886[var7] = field690[var7];
		}

		return var2;
	}

	@ObfuscatedName("IHBKBLZU.a(III)V")
	public final void method262(int arg0, int arg1) {
		if (field688.field300[0] != null && (field689[arg1][arg0] != 0 && (field665[arg1][arg0] != 0 && field692 != 0))) {
			NFBFXKHQ var3 = new NFBFXKHQ();
			var3.field889 = arg1;
			var3.field887 = arg0;
			var3.field890 = false;

			synchronized (field667) {
				field667.method178(var3);
			}
		}
	}

	@ObfuscatedName("IHBKBLZU.a(IB)Z")
	public final boolean method263(int arg0) {
		for (int var2 = 0; var2 < field680.length; var2++) {
			if (field661[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("IHBKBLZU.c(B)V")
	public final void method264() {
		while (field671 == 0) {
			if (field672 >= 10 || field692 == 0) {
				return;
			}

			NFBFXKHQ var2;
			synchronized (field667) {
				var2 = (NFBFXKHQ) field667.method180();
			}

			while (var2 != null) {
				if (field665[var2.field889][var2.field887] != 0) {
					field665[var2.field889][var2.field887] = 0;
					field684.method178(var2);
					method247(var2);
					field664 = true;

					if (field668 < field660) {
						field668++;
					}

					field691 = "Loading extra files - " + field668 * 100 / field660 + "%";
					field672++;
					if (field672 == 10) {
						return;
					}
				}

				synchronized (field667) {
					var2 = (NFBFXKHQ) field667.method180();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field665[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field692) {
						var5[var7] = 0;
						NFBFXKHQ var8 = new NFBFXKHQ();
						var8.field889 = var4;
						var8.field887 = var7;
						var8.field890 = false;
						field684.method178(var8);
						method247(var8);
						field664 = true;

						if (field668 < field660) {
							field668++;
						}

						field691 = "Loading extra files - " + field668 * 100 / field660 + "%";
						field672++;
						if (field672 == 10) {
							return;
						}
					}
				}
			}

			field692--;
		}
	}
}
