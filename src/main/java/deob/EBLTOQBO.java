package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("EBLTOQBO")
public class EBLTOQBO extends OGOBGXGT implements Runnable {

	@ObfuscatedName("EBLTOQBO.b")
	public CRC32 field657 = new CRC32();

	@ObfuscatedName("EBLTOQBO.d")
	public int[][] field659 = new int[4][];

	@ObfuscatedName("EBLTOQBO.e")
	public byte[] field660 = new byte[65000];

	@ObfuscatedName("EBLTOQBO.l")
	public PACANLMY field665 = new PACANLMY();

	@ObfuscatedName("EBLTOQBO.m")
	public byte[] field666 = new byte[500];

	@ObfuscatedName("EBLTOQBO.t")
	public PACANLMY field672 = new PACANLMY();

	@ObfuscatedName("EBLTOQBO.w")
	public boolean field674 = false;

	@ObfuscatedName("EBLTOQBO.x")
	public int[][] field675 = new int[4][];

	@ObfuscatedName("EBLTOQBO.C")
	public YAKFHRTY field679 = new YAKFHRTY();

	@ObfuscatedName("EBLTOQBO.D")
	public byte[][] field680 = new byte[4][];

	@ObfuscatedName("EBLTOQBO.E")
	public PACANLMY field681 = new PACANLMY();

	@ObfuscatedName("EBLTOQBO.G")
	public boolean field683 = true;

	@ObfuscatedName("EBLTOQBO.K")
	public PACANLMY field687 = new PACANLMY();

	@ObfuscatedName("EBLTOQBO.Q")
	public String field692 = "";

	@ObfuscatedName("EBLTOQBO.R")
	public PACANLMY field693 = new PACANLMY();

	@ObfuscatedName("EBLTOQBO.c")
	public int field658;

	@ObfuscatedName("EBLTOQBO.k")
	public int field664;

	@ObfuscatedName("EBLTOQBO.n")
	public int field667;

	@ObfuscatedName("EBLTOQBO.o")
	public int field668;

	@ObfuscatedName("EBLTOQBO.p")
	public int field669;

	@ObfuscatedName("EBLTOQBO.u")
	public int field673;

	@ObfuscatedName("EBLTOQBO.A")
	public int field677;

	@ObfuscatedName("EBLTOQBO.B")
	public int field678;

	@ObfuscatedName("EBLTOQBO.I")
	public int field685;

	@ObfuscatedName("EBLTOQBO.N")
	public int field690;

	@ObfuscatedName("EBLTOQBO.O")
	public int field691;

	@ObfuscatedName("EBLTOQBO.s")
	public long field671;

	@ObfuscatedName("EBLTOQBO.M")
	public ZUBZCVQN field689;

	@ObfuscatedName("EBLTOQBO.r")
	public client field670;

	@ObfuscatedName("EBLTOQBO.S")
	public InputStream field694;

	@ObfuscatedName("EBLTOQBO.i")
	public OutputStream field663;

	@ObfuscatedName("EBLTOQBO.g")
	public Socket field662;

	@ObfuscatedName("EBLTOQBO.f")
	public byte[] field661;

	@ObfuscatedName("EBLTOQBO.a")
	public int[] field656;

	@ObfuscatedName("EBLTOQBO.y")
	public int[] field676;

	@ObfuscatedName("EBLTOQBO.F")
	public int[] field682;

	@ObfuscatedName("EBLTOQBO.H")
	public int[] field684;

	@ObfuscatedName("EBLTOQBO.J")
	public int[] field686;

	@ObfuscatedName("EBLTOQBO.L")
	public int[] field688;

	@ObfuscatedName("EBLTOQBO.a(LFUZJMGZB;Lclient;)V")
	public final void method224(FUZJMGZB arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method277(var3[var4], null);
			int var6 = var5.length / 2;
			LBBVYYXO var7 = new LBBVYYXO(var5);
			field675[var4] = new int[var6];
			field680[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field675[var4][var8] = var7.method371();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method277(var9[var10], null);
			int var12 = var11.length / 4;
			LBBVYYXO var13 = new LBBVYYXO(var11);
			field659[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field659[var10][var14] = var13.method374();
			}
		}

		byte[] var15 = arg0.method277("model_index", null);
		int var16 = field675[0].length;
		field661 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field661[var17] = var15[var17];
			} else {
				field661[var17] = 0;
			}
		}

		byte[] var18 = arg0.method277("map_index", null);
		LBBVYYXO var19 = new LBBVYYXO(var18);
		int var20 = var18.length / 7;
		field686 = new int[var20];
		field676 = new int[var20];
		field684 = new int[var20];
		field682 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field686[var21] = var19.method371();
			field676[var21] = var19.method371();
			field684[var21] = var19.method371();
			field682[var21] = var19.method369();
		}

		byte[] var22 = arg0.method277("anim_index", null);
		LBBVYYXO var23 = new LBBVYYXO(var22);
		int var24 = var22.length / 2;
		field656 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field656[var25] = var23.method371();
		}

		byte[] var26 = arg0.method277("midi_index", null);
		LBBVYYXO var27 = new LBBVYYXO(var26);
		int var28 = var26.length;
		field688 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field688[var29] = var27.method369();
		}

		field670 = arg1;
		field683 = true;
		field670.method58(this, 2);
	}

	@ObfuscatedName("EBLTOQBO.a(BZ)V")
	public final void method225(boolean arg0) {
		int var2 = field686.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field682[var3] != 0) {
				method238((byte) 2, field684[var3], 3);
				method238((byte) 2, field676[var3], 3);
			}
		}
	}

	@ObfuscatedName("EBLTOQBO.b(I)V")
	public final void method226() {
		while (field677 == 0) {
			if (field678 >= 10 || field668 == 0) {
				return;
			}

			ZUBZCVQN var2;
			synchronized (field665) {
				var2 = (ZUBZCVQN) field665.method448();
			}

			while (var2 != null) {
				if (field680[var2.field1516][var2.field1517] != 0) {
					field680[var2.field1516][var2.field1517] = 0;
					field693.method446(var2);
					method231(var2);
					field674 = true;

					if (field673 < field658) {
						field673++;
					}

					field692 = "Loading extra files - " + field673 * 100 / field658 + "%";
					field678++;
					if (field678 == 10) {
						return;
					}
				}

				synchronized (field665) {
					var2 = (ZUBZCVQN) field665.method448();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field680[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field668) {
						var5[var7] = 0;
						ZUBZCVQN var8 = new ZUBZCVQN();
						var8.field1516 = var4;
						var8.field1517 = var7;
						var8.field1518 = false;
						field693.method446(var8);
						method231(var8);
						field674 = true;

						if (field673 < field658) {
							field673++;
						}

						field692 = "Loading extra files - " + field673 * 100 / field658 + "%";
						field678++;
						if (field678 == 10) {
							return;
						}
					}
				}
			}

			field668--;
		}
	}

	@ObfuscatedName("EBLTOQBO.a()V")
	public final void method227() {
		field683 = false;
	}

	@ObfuscatedName("EBLTOQBO.a(III)V")
	public final void method228(int arg0, int arg1) {
		if (field670.field305[0] != null && (field675[arg1][arg0] != 0 && (field680[arg1][arg0] != 0 && field668 != 0))) {
			ZUBZCVQN var3 = new ZUBZCVQN();
			var3.field1516 = arg1;
			var3.field1517 = arg0;
			var3.field1518 = false;

			synchronized (field665) {
				field665.method446(var3);
			}
		}
	}

	@ObfuscatedName("EBLTOQBO.a(BI)I")
	public final int method229(int arg0) {
		return field661[arg0] & 0xFF;
	}

	@ObfuscatedName("EBLTOQBO.a(Z)V")
	public final void method230() {
		try {
			int var1 = field694.available();
			if (field691 == 0 && var1 >= 6) {
				field674 = true;

				for (int var2 = 0; var2 < 6; var2 += field694.read(field666, var2, 6 - var2)) {
				}

				int var3 = field666[0] & 0xFF;
				int var4 = ((field666[1] & 0xFF) << 8) + (field666[2] & 0xFF);
				int var5 = ((field666[3] & 0xFF) << 8) + (field666[4] & 0xFF);
				int var6 = field666[5] & 0xFF;
				field689 = null;
				for (ZUBZCVQN var7 = (ZUBZCVQN) field693.method449(); var7 != null; var7 = (ZUBZCVQN) field693.method451()) {
					if (var7.field1516 == var3 && var7.field1517 == var4) {
						field689 = var7;
					}

					if (field689 != null) {
						var7.field1520 = 0;
					}
				}

				if (field689 != null) {
					field664 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field689.field1519 = null;

						if (field689.field1518) {
							synchronized (field687) {
								field687.method446(field689);
							}
						} else {
							field689.method464();
						}

						field689 = null;
					} else {
						if (field689.field1519 == null && var6 == 0) {
							field689.field1519 = new byte[var5];
						}

						if (field689.field1519 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field690 = var6 * 500;
				field691 = 500;
				if (field691 > var5 - var6 * 500) {
					field691 = var5 - var6 * 500;
				}
			}

			if (field691 > 0 && var1 >= field691) {
				field674 = true;
				byte[] var9 = field666;
				int var10 = 0;
				if (field689 != null) {
					var9 = field689.field1519;
					var10 = field690;
				}

				for (int var11 = 0; var11 < field691; var11 += field694.read(var9, var10 + var11, field691 - var11)) {
				}

				if (field691 + field690 >= var9.length && field689 != null) {
					if (field670.field305[0] != null) {
						field670.field305[field689.field1516 + 1].method421(var9, field689.field1517, var9.length);
					}

					if (!field689.field1518 && field689.field1516 == 3) {
						field689.field1518 = true;
						field689.field1516 = 93;
					}

					if (field689.field1518) {
						synchronized (field687) {
							field687.method446(field689);
						}
					} else {
						field689.method464();
					}
				}

				field691 = 0;
			}
		} catch (IOException var17) {
			try {
				field662.close();
			} catch (Exception var14) {
			}

			field662 = null;
			field694 = null;
			field663 = null;
			field691 = 0;
		}
	}

	@ObfuscatedName("EBLTOQBO.a(LZUBZCVQN;Z)V")
	public final void method231(ZUBZCVQN arg0) {
		try {
			if (field662 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field671 < 4000L) {
					return;
				}

				field671 = var2;
				field662 = field670.method131(client.field195 + 43594);
				field694 = field662.getInputStream();
				field663 = field662.getOutputStream();
				field663.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field694.read();
				}

				field664 = 0;
			}

			field666[0] = (byte) arg0.field1516;
			field666[1] = (byte) (arg0.field1517 >> 8);
			field666[2] = (byte) arg0.field1517;
			if (arg0.field1518) {
				field666[3] = 2;
			} else if (field670.field289) {
				field666[3] = 0;
			} else {
				field666[3] = 1;
			}

			field663.write(field666, 0, 4);
			field685 = 0;
			field669 = -10000;
		} catch (IOException var7) {
			try {
				field662.close();
			} catch (Exception var6) {
			}

			field662 = null;
			field694 = null;
			field663 = null;
			field691 = 0;
			field669++;
		}
	}

	@ObfuscatedName("EBLTOQBO.c(I)V")
	public final void method232() {
		field677 = 0;
		field678 = 0;
		for (ZUBZCVQN var1 = (ZUBZCVQN) field693.method449(); var1 != null; var1 = (ZUBZCVQN) field693.method451()) {
			if (var1.field1518) {
				field677++;
			} else {
				field678++;
			}
		}

		while (field677 < 10) {
			ZUBZCVQN var2 = (ZUBZCVQN) field672.method448();
			if (var2 == null) {
				break;
			}

			if (field680[var2.field1516][var2.field1517] != 0) {
				field673++;
			}

			field680[var2.field1516][var2.field1517] = 0;
			field693.method446(var2);
			field677++;
			method231(var2);
			field674 = true;
		}
	}

	@ObfuscatedName("EBLTOQBO.a(IB)Z")
	public final boolean method233(int arg0) {
		if (field688[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("EBLTOQBO.d(I)V")
	public final void method234() {
		synchronized (field665) {
			field665.method453();
		}
	}

	@ObfuscatedName("EBLTOQBO.a(IZ)I")
	public final int method235(int arg0) {
		return field675[arg0].length;
	}

	@ObfuscatedName("EBLTOQBO.a(IIII)I")
	public final int method236(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg0;
		for (int var5 = 0; var5 < field686.length; var5++) {
			if (field686[var5] == var4) {
				if (arg1 == 0) {
					return field676[var5];
				}

				return field684[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("EBLTOQBO.b()LZUBZCVQN;")
	public final ZUBZCVQN method237() {
		ZUBZCVQN var2;
		synchronized (field687) {
			var2 = (ZUBZCVQN) field687.method448();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field679) {
			var2.method352();
		}

		if (var2.field1519 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1519));
			while (true) {
				if (field660.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field660, var4, field660.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1519 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1519[var7] = field660[var7];
		}

		return var2;
	}

	@ObfuscatedName("EBLTOQBO.a(BIIZ)V")
	public final void method238(byte arg0, int arg1, int arg2) {
		if (field670.field305[0] != null && field675[arg2][arg1] != 0) {
			byte[] var4 = field670.field305[arg2 + 1].method420(arg1);
			if (!method242(var4, field659[arg2][arg1], field675[arg2][arg1])) {
				field680[arg2][arg1] = arg0;

				if (arg0 > field668) {
					field668 = arg0;
				}

				field658++;
			}
		}
	}

	@ObfuscatedName("EBLTOQBO.c()I")
	public final int method239() {
		synchronized (field679) {
			return field679.method566();
		}
	}

	@ObfuscatedName("EBLTOQBO.a(II)V")
	public final void method240(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field675.length && arg1 >= 0 && arg1 <= field675[arg0].length && field675[arg0][arg1] != 0) {
			synchronized (field679) {
				for (ZUBZCVQN var4 = (ZUBZCVQN) field679.method564(); var4 != null; var4 = (ZUBZCVQN) field679.method565()) {
					if (var4.field1516 == arg0 && var4.field1517 == arg1) {
						return;
					}
				}

				ZUBZCVQN var5 = new ZUBZCVQN();
				var5.field1516 = arg0;
				var5.field1517 = arg1;
				var5.field1518 = true;

				synchronized (field681) {
					field681.method446(var5);
				}

				field679.method562(var5);
			}
		}
	}

	@ObfuscatedName("EBLTOQBO.b(IB)Z")
	public final boolean method241(int arg0) {
		for (int var2 = 0; var2 < field686.length; var2++) {
			if (field684[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EBLTOQBO.a([BIII)Z")
	public final boolean method242(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field657.reset();
			field657.update(arg0, 0, var4);
			int var6 = (int) field657.getValue();

			if (arg2 != var5) {
				return false;
			}

			if (arg1 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("EBLTOQBO.a(I)V")
	public final void method243(int arg0) {
		method240(0, arg0);
	}

	public final void run() {
		try {
			while (field683) {
				field667++;
				byte var1 = 20;
				if (field668 == 0 && field670.field305[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field674 = true;
				for (int var2 = 0; var2 < 100 && field674; var2++) {
					field674 = false;
					method244();
					method232();

					if (field677 == 0 && var2 >= 5) {
						break;
					}

					method226();

					if (field694 != null) {
						method230();
					}
				}

				boolean var3 = false;
				for (ZUBZCVQN var4 = (ZUBZCVQN) field693.method449(); var4 != null; var4 = (ZUBZCVQN) field693.method451()) {
					if (var4.field1518) {
						var3 = true;
						var4.field1520++;
						if (var4.field1520 > 50) {
							var4.field1520 = 0;
							method231(var4);
						}
					}
				}

				if (!var3) {
					for (ZUBZCVQN var5 = (ZUBZCVQN) field693.method449(); var5 != null; var5 = (ZUBZCVQN) field693.method451()) {
						var3 = true;
						var5.field1520++;
						if (var5.field1520 > 50) {
							var5.field1520 = 0;
							method231(var5);
						}
					}
				}

				if (var3) {
					field664++;
					if (field664 > 750) {
						try {
							field662.close();
						} catch (Exception var8) {
						}

						field662 = null;
						field694 = null;
						field663 = null;
						field691 = 0;
					}
				} else {
					field664 = 0;
					field692 = "";
				}

				if (field670.field289 && field662 != null && field663 != null && (field668 > 0 || field670.field305[0] == null)) {
					field685++;
					if (field685 > 500) {
						field685 = 0;
						field666[0] = 0;
						field666[1] = 0;
						field666[2] = 0;
						field666[3] = 10;
						try {
							field663.write(field666, 0, 4);
						} catch (IOException var7) {
							field664 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("EBLTOQBO.e(I)V")
	public final void method244() {
		ZUBZCVQN var2;
		synchronized (field681) {
			var2 = (ZUBZCVQN) field681.method448();
		}

		while (var2 != null) {
			field674 = true;
			byte[] var3 = null;
			if (field670.field305[0] != null) {
				var3 = field670.field305[var2.field1516 + 1].method420(var2.field1517);
			}

			if (!method242(var3, field659[var2.field1516][var2.field1517], field675[var2.field1516][var2.field1517])) {
				var3 = null;
			}

			synchronized (field681) {
				if (var3 == null) {
					field672.method446(var2);
				} else {
					var2.field1519 = var3;

					synchronized (field687) {
						field687.method446(var2);
					}
				}

				var2 = (ZUBZCVQN) field681.method448();
			}
		}
	}

	@ObfuscatedName("EBLTOQBO.a(B)I")
	public final int method245() {
		return field656.length;
	}
}
