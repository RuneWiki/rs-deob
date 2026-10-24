package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("FJSXIAWX")
public class FJSXIAWX extends DIMAUSCJ implements Runnable {

	@ObfuscatedName("FJSXIAWX.h")
	public ZWZXPJNQ field676 = new ZWZXPJNQ();

	@ObfuscatedName("FJSXIAWX.j")
	public CRC32 field678 = new CRC32();

	@ObfuscatedName("FJSXIAWX.n")
	public ZLISRGEK field682 = new ZLISRGEK();

	@ObfuscatedName("FJSXIAWX.q")
	public boolean field685 = true;

	@ObfuscatedName("FJSXIAWX.s")
	public ZWZXPJNQ field687 = new ZWZXPJNQ();

	@ObfuscatedName("FJSXIAWX.t")
	public byte[] field688 = new byte[65000];

	@ObfuscatedName("FJSXIAWX.u")
	public ZWZXPJNQ field689 = new ZWZXPJNQ();

	@ObfuscatedName("FJSXIAWX.x")
	public byte[] field692 = new byte[500];

	@ObfuscatedName("FJSXIAWX.z")
	public byte[][] field694 = new byte[4][];

	@ObfuscatedName("FJSXIAWX.B")
	public String field696 = "";

	@ObfuscatedName("FJSXIAWX.H")
	public int[][] field699 = new int[4][];

	@ObfuscatedName("FJSXIAWX.J")
	public boolean field700 = false;

	@ObfuscatedName("FJSXIAWX.K")
	public int[][] field701 = new int[4][];

	@ObfuscatedName("FJSXIAWX.R")
	public ZWZXPJNQ field706 = new ZWZXPJNQ();

	@ObfuscatedName("FJSXIAWX.T")
	public ZWZXPJNQ field708 = new ZWZXPJNQ();

	@ObfuscatedName("FJSXIAWX.d")
	public int field672;

	@ObfuscatedName("FJSXIAWX.e")
	public int field673;

	@ObfuscatedName("FJSXIAWX.f")
	public int field674;

	@ObfuscatedName("FJSXIAWX.i")
	public int field677;

	@ObfuscatedName("FJSXIAWX.l")
	public int field680;

	@ObfuscatedName("FJSXIAWX.m")
	public int field681;

	@ObfuscatedName("FJSXIAWX.p")
	public int field684;

	@ObfuscatedName("FJSXIAWX.v")
	public int field690;

	@ObfuscatedName("FJSXIAWX.w")
	public int field691;

	@ObfuscatedName("FJSXIAWX.D")
	public int field697;

	@ObfuscatedName("FJSXIAWX.Q")
	public int field705;

	@ObfuscatedName("FJSXIAWX.S")
	public long field707;

	@ObfuscatedName("FJSXIAWX.r")
	public NCRHUMXM field686;

	@ObfuscatedName("FJSXIAWX.M")
	public client field702;

	@ObfuscatedName("FJSXIAWX.G")
	public InputStream field698;

	@ObfuscatedName("FJSXIAWX.A")
	public OutputStream field695;

	@ObfuscatedName("FJSXIAWX.c")
	public Socket field671;

	@ObfuscatedName("FJSXIAWX.b")
	public byte[] field670;

	@ObfuscatedName("FJSXIAWX.g")
	public int[] field675;

	@ObfuscatedName("FJSXIAWX.k")
	public int[] field679;

	@ObfuscatedName("FJSXIAWX.o")
	public int[] field683;

	@ObfuscatedName("FJSXIAWX.y")
	public int[] field693;

	@ObfuscatedName("FJSXIAWX.N")
	public int[] field703;

	@ObfuscatedName("FJSXIAWX.O")
	public int[] field704;

	@ObfuscatedName("FJSXIAWX.a(II[BI)Z")
	public final boolean method224(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field678.reset();
			field678.update(arg1, 0, var4);
			int var6 = (int) field678.getValue();

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

	@ObfuscatedName("FJSXIAWX.a()I")
	public final int method225() {
		synchronized (field682) {
			return field682.method596();
		}
	}

	@ObfuscatedName("FJSXIAWX.b(I)V")
	public final void method226() {
		field690 = 0;
		field691 = 0;
		for (NCRHUMXM var1 = (NCRHUMXM) field689.method600(); var1 != null; var1 = (NCRHUMXM) field689.method602()) {
			if (var1.field977) {
				field690++;
			} else {
				field691++;
			}
		}

		while (field690 < 10) {
			NCRHUMXM var2 = (NCRHUMXM) field706.method599();
			if (var2 == null) {
				break;
			}

			if (field694[var2.field975][var2.field976] != 0) {
				field672++;
			}

			field694[var2.field975][var2.field976] = 0;
			field689.method597(var2);
			field690++;
			method241(var2);
			field700 = true;
		}
	}

	@ObfuscatedName("FJSXIAWX.a(IIIB)V")
	public final void method227(int arg0, int arg1, byte arg2) {
		if (field702.field286[0] != null && field699[arg0][arg1] != 0) {
			byte[] var4 = field702.field286[arg0 + 1].method446(arg1);
			if (!method224(field699[arg0][arg1], var4, field701[arg0][arg1])) {
				field694[arg0][arg1] = arg2;

				if (arg2 > field684) {
					field684 = arg2;
				}

				field680++;
			}
		}
	}

	@ObfuscatedName("FJSXIAWX.a(BI)Z")
	public final boolean method228(int arg0) {
		for (int var2 = 0; var2 < field693.length; var2++) {
			if (field679[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("FJSXIAWX.c(I)V")
	public final void method229() {
		NCRHUMXM var2;
		synchronized (field687) {
			var2 = (NCRHUMXM) field687.method599();
		}

		while (var2 != null) {
			field700 = true;
			byte[] var3 = null;
			if (field702.field286[0] != null) {
				var3 = field702.field286[var2.field975 + 1].method446(var2.field976);
			}

			if (!method224(field699[var2.field975][var2.field976], var3, field701[var2.field975][var2.field976])) {
				var3 = null;
			}

			synchronized (field687) {
				if (var3 == null) {
					field706.method597(var2);
				} else {
					var2.field979 = var3;

					synchronized (field676) {
						field676.method597(var2);
					}
				}

				var2 = (NCRHUMXM) field687.method599();
			}
		}
	}

	@ObfuscatedName("FJSXIAWX.a(I)V")
	public final void method216(int arg0) {
		method237(0, arg0);
	}

	@ObfuscatedName("FJSXIAWX.a(IZI)V")
	public final void method230(int arg0, int arg1) {
		if (field702.field286[0] != null && (field699[arg0][arg1] != 0 && (field694[arg0][arg1] != 0 && field684 != 0))) {
			NCRHUMXM var3 = new NCRHUMXM();
			var3.field975 = arg0;
			var3.field976 = arg1;
			var3.field977 = false;

			synchronized (field708) {
				field708.method597(var3);
			}
		}
	}

	@ObfuscatedName("FJSXIAWX.b()V")
	public final void method231() {
		field685 = false;
	}

	@ObfuscatedName("FJSXIAWX.a(ZI)V")
	public final void method232(boolean arg0) {
		int var2 = field693.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field683[var3] != 0) {
				method227(3, field679[var3], (byte) 2);
				method227(3, field703[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("FJSXIAWX.a(LGWOEELWB;Lclient;)V")
	public final void method233(GWOEELWB arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method249(var3[var4], null);
			int var6 = var5.length / 2;
			MLYYHULT var7 = new MLYYHULT(var5);
			field699[var4] = new int[var6];
			field694[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field699[var4][var8] = var7.method298();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method249(var9[var10], null);
			int var12 = var11.length / 4;
			MLYYHULT var13 = new MLYYHULT(var11);
			field701[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field701[var10][var14] = var13.method301();
			}
		}

		byte[] var15 = arg0.method249("model_index", null);
		int var16 = field699[0].length;
		field670 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field670[var17] = var15[var17];
			} else {
				field670[var17] = 0;
			}
		}

		byte[] var18 = arg0.method249("map_index", null);
		MLYYHULT var19 = new MLYYHULT(var18);
		int var20 = var18.length / 7;
		field693 = new int[var20];
		field703 = new int[var20];
		field679 = new int[var20];
		field683 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field693[var21] = var19.method298();
			field703[var21] = var19.method298();
			field679[var21] = var19.method298();
			field683[var21] = var19.method296();
		}

		byte[] var22 = arg0.method249("anim_index", null);
		MLYYHULT var23 = new MLYYHULT(var22);
		int var24 = var22.length / 2;
		field675 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field675[var25] = var23.method298();
		}

		byte[] var26 = arg0.method249("midi_index", null);
		MLYYHULT var27 = new MLYYHULT(var26);
		int var28 = var26.length;
		field704 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field704[var29] = var27.method296();
		}

		field702 = arg1;
		field685 = true;
		field702.method131(this, 2);
	}

	@ObfuscatedName("FJSXIAWX.a(II)I")
	public final int method234(int arg0) {
		return field670[arg0] & 0xFF;
	}

	@ObfuscatedName("FJSXIAWX.a(IIII)I")
	public final int method235(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < field693.length; var5++) {
			if (field693[var5] == var4) {
				if (arg2 == 0) {
					return field703[var5];
				}

				return field679[var5];
			}
		}

		return -1;
	}

	public final void run() {
		try {
			while (field685) {
				field697++;
				byte var1 = 20;
				if (field684 == 0 && field702.field286[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field700 = true;
				for (int var2 = 0; var2 < 100 && field700; var2++) {
					field700 = false;
					method229();
					method226();

					if (field690 == 0 && var2 >= 5) {
						break;
					}

					method244();

					if (field698 != null) {
						method242();
					}
				}

				boolean var3 = false;
				for (NCRHUMXM var4 = (NCRHUMXM) field689.method600(); var4 != null; var4 = (NCRHUMXM) field689.method602()) {
					if (var4.field977) {
						var3 = true;
						var4.field978++;
						if (var4.field978 > 50) {
							var4.field978 = 0;
							method241(var4);
						}
					}
				}

				if (!var3) {
					for (NCRHUMXM var5 = (NCRHUMXM) field689.method600(); var5 != null; var5 = (NCRHUMXM) field689.method602()) {
						var3 = true;
						var5.field978++;
						if (var5.field978 > 50) {
							var5.field978 = 0;
							method241(var5);
						}
					}
				}

				if (var3) {
					field705++;
					if (field705 > 750) {
						try {
							field671.close();
						} catch (Exception var8) {
						}

						field671 = null;
						field698 = null;
						field695 = null;
						field674 = 0;
					}
				} else {
					field705 = 0;
					field696 = "";
				}

				if (field702.field288 && field671 != null && field695 != null && (field684 > 0 || field702.field286[0] == null)) {
					field681++;
					if (field681 > 500) {
						field681 = 0;
						field692[0] = 0;
						field692[1] = 0;
						field692[2] = 0;
						field692[3] = 10;
						try {
							field695.write(field692, 0, 4);
						} catch (IOException var7) {
							field705 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("FJSXIAWX.d(I)I")
	public final int method236() {
		return field675.length;
	}

	@ObfuscatedName("FJSXIAWX.b(II)V")
	public final void method237(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field699.length && arg1 >= 0 && arg1 <= field699[arg0].length && field699[arg0][arg1] != 0) {
			synchronized (field682) {
				for (NCRHUMXM var4 = (NCRHUMXM) field682.method594(); var4 != null; var4 = (NCRHUMXM) field682.method595()) {
					if (var4.field975 == arg0 && var4.field976 == arg1) {
						return;
					}
				}

				NCRHUMXM var5 = new NCRHUMXM();
				var5.field975 = arg0;
				var5.field976 = arg1;
				var5.field977 = true;

				synchronized (field687) {
					field687.method597(var5);
				}

				field682.method592(var5);
			}
		}
	}

	@ObfuscatedName("FJSXIAWX.e(I)V")
	public final void method238() {
		synchronized (field708) {
			field708.method604();
		}
	}

	@ObfuscatedName("FJSXIAWX.c(II)I")
	public final int method239(int arg0) {
		return field699[arg0].length;
	}

	@ObfuscatedName("FJSXIAWX.d(II)Z")
	public final boolean method240(int arg0) {
		if (field704[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("FJSXIAWX.a(ILNCRHUMXM;)V")
	public final void method241(NCRHUMXM arg0) {
		try {
			if (field671 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field707 < 4000L) {
					return;
				}

				field707 = var2;
				field671 = field702.method175(client.field317 + 43594);
				field698 = field671.getInputStream();
				field695 = field671.getOutputStream();
				field695.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field698.read();
				}

				field705 = 0;
			}

			field692[0] = (byte) arg0.field975;
			field692[1] = (byte) (arg0.field976 >> 8);
			field692[2] = (byte) arg0.field976;
			if (arg0.field977) {
				field692[3] = 2;
			} else if (field702.field288) {
				field692[3] = 0;
			} else {
				field692[3] = 1;
			}

			field695.write(field692, 0, 4);
			field681 = 0;
			field677 = -10000;
		} catch (IOException var7) {
			try {
				field671.close();
			} catch (Exception var6) {
			}

			field671 = null;
			field698 = null;
			field695 = null;
			field674 = 0;
			field677++;
		}
	}

	@ObfuscatedName("FJSXIAWX.f(I)V")
	public final void method242() {
		try {
			int var1 = field698.available();
			if (field674 == 0 && var1 >= 6) {
				field700 = true;

				for (int var2 = 0; var2 < 6; var2 += field698.read(field692, var2, 6 - var2)) {
				}

				int var3 = field692[0] & 0xFF;
				int var4 = ((field692[1] & 0xFF) << 8) + (field692[2] & 0xFF);
				int var5 = ((field692[3] & 0xFF) << 8) + (field692[4] & 0xFF);
				int var6 = field692[5] & 0xFF;
				field686 = null;
				for (NCRHUMXM var7 = (NCRHUMXM) field689.method600(); var7 != null; var7 = (NCRHUMXM) field689.method602()) {
					if (var7.field975 == var3 && var7.field976 == var4) {
						field686 = var7;
					}

					if (field686 != null) {
						var7.field978 = 0;
					}
				}

				if (field686 != null) {
					field705 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field686.field979 = null;

						if (field686.field977) {
							synchronized (field676) {
								field676.method597(field686);
							}
						} else {
							field686.method367();
						}

						field686 = null;
					} else {
						if (field686.field979 == null && var6 == 0) {
							field686.field979 = new byte[var5];
						}

						if (field686.field979 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field673 = var6 * 500;
				field674 = 500;
				if (field674 > var5 - var6 * 500) {
					field674 = var5 - var6 * 500;
				}
			}

			if (field674 > 0 && var1 >= field674) {
				field700 = true;
				byte[] var9 = field692;
				int var10 = 0;
				if (field686 != null) {
					var9 = field686.field979;
					var10 = field673;
				}

				for (int var11 = 0; var11 < field674; var11 += field698.read(var9, var10 + var11, field674 - var11)) {
				}

				if (field674 + field673 >= var9.length && field686 != null) {
					if (field702.field286[0] != null) {
						field702.field286[field686.field975 + 1].method447(field686.field976, var9, var9.length);
					}

					if (!field686.field977 && field686.field975 == 3) {
						field686.field977 = true;
						field686.field975 = 93;
					}

					if (field686.field977) {
						synchronized (field676) {
							field676.method597(field686);
						}
					} else {
						field686.method367();
					}
				}

				field674 = 0;
			}
		} catch (IOException var17) {
			try {
				field671.close();
			} catch (Exception var14) {
			}

			field671 = null;
			field698 = null;
			field695 = null;
			field674 = 0;
		}
	}

	@ObfuscatedName("FJSXIAWX.c()LNCRHUMXM;")
	public final NCRHUMXM method243() {
		NCRHUMXM var2;
		synchronized (field676) {
			var2 = (NCRHUMXM) field676.method599();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field682) {
			var2.method217();
		}

		if (var2.field979 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field979));
			while (true) {
				if (field688.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field688, var4, field688.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field979 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field979[var7] = field688[var7];
		}

		return var2;
	}

	@ObfuscatedName("FJSXIAWX.g(I)V")
	public final void method244() {
		while (field690 == 0) {
			if (field691 >= 10 || field684 == 0) {
				return;
			}

			NCRHUMXM var2;
			synchronized (field708) {
				var2 = (NCRHUMXM) field708.method599();
			}

			while (var2 != null) {
				if (field694[var2.field975][var2.field976] != 0) {
					field694[var2.field975][var2.field976] = 0;
					field689.method597(var2);
					method241(var2);
					field700 = true;

					if (field672 < field680) {
						field672++;
					}

					field696 = "Loading extra files - " + field672 * 100 / field680 + "%";
					field691++;
					if (field691 == 10) {
						return;
					}
				}

				synchronized (field708) {
					var2 = (NCRHUMXM) field708.method599();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field694[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field684) {
						var5[var7] = 0;
						NCRHUMXM var8 = new NCRHUMXM();
						var8.field975 = var4;
						var8.field976 = var7;
						var8.field977 = false;
						field689.method597(var8);
						method241(var8);
						field700 = true;

						if (field672 < field680) {
							field672++;
						}

						field696 = "Loading extra files - " + field672 * 100 / field680 + "%";
						field691++;
						if (field691 == 10) {
							return;
						}
					}
				}
			}

			field684--;
		}
	}
}
