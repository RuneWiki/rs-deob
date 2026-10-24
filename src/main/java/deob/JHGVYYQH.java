package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("JHGVYYQH")
public class JHGVYYQH extends CHIZDBQZ implements Runnable {

	@ObfuscatedName("JHGVYYQH.a")
	public boolean field832 = false;

	@ObfuscatedName("JHGVYYQH.b")
	public UEUHLQTT field833 = new UEUHLQTT();

	@ObfuscatedName("JHGVYYQH.e")
	public int[][] field836 = new int[4][];

	@ObfuscatedName("JHGVYYQH.f")
	public UEUHLQTT field837 = new UEUHLQTT();

	@ObfuscatedName("JHGVYYQH.h")
	public boolean field839 = true;

	@ObfuscatedName("JHGVYYQH.k")
	public UEUHLQTT field840 = new UEUHLQTT();

	@ObfuscatedName("JHGVYYQH.y")
	public byte[] field852 = new byte[500];

	@ObfuscatedName("JHGVYYQH.z")
	public HIGYXWXY field853 = new HIGYXWXY();

	@ObfuscatedName("JHGVYYQH.C")
	public byte[][] field856 = new byte[4][];

	@ObfuscatedName("JHGVYYQH.D")
	public CRC32 field857 = new CRC32();

	@ObfuscatedName("JHGVYYQH.E")
	public String field858 = "";

	@ObfuscatedName("JHGVYYQH.G")
	public UEUHLQTT field860 = new UEUHLQTT();

	@ObfuscatedName("JHGVYYQH.L")
	public int[][] field864 = new int[4][];

	@ObfuscatedName("JHGVYYQH.N")
	public UEUHLQTT field866 = new UEUHLQTT();

	@ObfuscatedName("JHGVYYQH.R")
	public byte[] field870 = new byte[65000];

	@ObfuscatedName("JHGVYYQH.m")
	public int field842;

	@ObfuscatedName("JHGVYYQH.n")
	public int field843;

	@ObfuscatedName("JHGVYYQH.o")
	public int field844;

	@ObfuscatedName("JHGVYYQH.w")
	public int field850;

	@ObfuscatedName("JHGVYYQH.x")
	public int field851;

	@ObfuscatedName("JHGVYYQH.A")
	public int field854;

	@ObfuscatedName("JHGVYYQH.B")
	public int field855;

	@ObfuscatedName("JHGVYYQH.I")
	public int field862;

	@ObfuscatedName("JHGVYYQH.K")
	public int field863;

	@ObfuscatedName("JHGVYYQH.O")
	public int field867;

	@ObfuscatedName("JHGVYYQH.P")
	public int field868;

	@ObfuscatedName("JHGVYYQH.v")
	public long field849;

	@ObfuscatedName("JHGVYYQH.H")
	public MNWUSGDU field861;

	@ObfuscatedName("JHGVYYQH.s")
	public client field847;

	@ObfuscatedName("JHGVYYQH.p")
	public InputStream field845;

	@ObfuscatedName("JHGVYYQH.M")
	public OutputStream field865;

	@ObfuscatedName("JHGVYYQH.F")
	public Socket field859;

	@ObfuscatedName("JHGVYYQH.g")
	public byte[] field838;

	@ObfuscatedName("JHGVYYQH.c")
	public int[] field834;

	@ObfuscatedName("JHGVYYQH.d")
	public int[] field835;

	@ObfuscatedName("JHGVYYQH.l")
	public int[] field841;

	@ObfuscatedName("JHGVYYQH.r")
	public int[] field846;

	@ObfuscatedName("JHGVYYQH.t")
	public int[] field848;

	@ObfuscatedName("JHGVYYQH.Q")
	public int[] field869;

	@ObfuscatedName("JHGVYYQH.b(I)I")
	public final int method255() {
		return field834.length;
	}

	@ObfuscatedName("JHGVYYQH.a(III[B)Z")
	public final boolean method256(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field857.reset();
			field857.update(arg2, 0, var4);
			int var6 = (int) field857.getValue();

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

	@ObfuscatedName("JHGVYYQH.a(IIII)I")
	public final int method257(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field848.length; var5++) {
			if (field848[var5] == var4) {
				if (arg1 == 0) {
					return field869[var5];
				}

				return field846[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("JHGVYYQH.a(B)V")
	public final void method258() {
		field843 = 0;
		field844 = 0;
		for (MNWUSGDU var1 = (MNWUSGDU) field866.method510(); var1 != null; var1 = (MNWUSGDU) field866.method512()) {
			if (var1.field941) {
				field843++;
			} else {
				field844++;
			}
		}

		while (field843 < 10) {
			MNWUSGDU var2 = (MNWUSGDU) field833.method509();
			if (var2 == null) {
				break;
			}

			if (field856[var2.field937][var2.field939] != 0) {
				field842++;
			}

			field856[var2.field937][var2.field939] = 0;
			field866.method507(var2);
			field843++;
			method269(var2);
			field832 = true;
		}
	}

	@ObfuscatedName("JHGVYYQH.a(Z)V")
	public final void method259() {
		while (field843 == 0) {
			if (field844 >= 10 || field862 == 0) {
				return;
			}

			MNWUSGDU var2;
			synchronized (field860) {
				var2 = (MNWUSGDU) field860.method509();
			}

			while (var2 != null) {
				if (field856[var2.field937][var2.field939] != 0) {
					field856[var2.field937][var2.field939] = 0;
					field866.method507(var2);
					method269(var2);
					field832 = true;

					if (field842 < field855) {
						field842++;
					}

					field858 = "Loading extra files - " + field842 * 100 / field855 + "%";
					field844++;
					if (field844 == 10) {
						return;
					}
				}

				synchronized (field860) {
					var2 = (MNWUSGDU) field860.method509();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field856[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field862) {
						var5[var7] = 0;
						MNWUSGDU var8 = new MNWUSGDU();
						var8.field937 = var4;
						var8.field939 = var7;
						var8.field941 = false;
						field866.method507(var8);
						method269(var8);
						field832 = true;

						if (field842 < field855) {
							field842++;
						}

						field858 = "Loading extra files - " + field842 * 100 / field855 + "%";
						field844++;
						if (field844 == 10) {
							return;
						}
					}
				}
			}

			field862--;
		}
	}

	@ObfuscatedName("JHGVYYQH.b(Z)V")
	public final void method260() {
		synchronized (field860) {
			field860.method514();
		}
	}

	@ObfuscatedName("JHGVYYQH.c(I)V")
	public final void method261() {
		MNWUSGDU var2;
		synchronized (field840) {
			var2 = (MNWUSGDU) field840.method509();
		}

		while (var2 != null) {
			field832 = true;
			byte[] var3 = null;
			if (field847.field478[0] != null) {
				var3 = field847.field478[var2.field937 + 1].method515(var2.field939);
			}

			if (!method256(field864[var2.field937][var2.field939], field836[var2.field937][var2.field939], var3)) {
				var3 = null;
			}

			synchronized (field840) {
				if (var3 == null) {
					field833.method507(var2);
				} else {
					var2.field940 = var3;

					synchronized (field837) {
						field837.method507(var2);
					}
				}

				var2 = (MNWUSGDU) field840.method509();
			}
		}
	}

	@ObfuscatedName("JHGVYYQH.a(II)I")
	public final int method262(int arg0) {
		return field864[arg0].length;
	}

	@ObfuscatedName("JHGVYYQH.d(I)V")
	public final void method263() {
		try {
			int var1 = field845.available();
			if (field868 == 0 && var1 >= 6) {
				field832 = true;

				for (int var2 = 0; var2 < 6; var2 += field845.read(field852, var2, 6 - var2)) {
				}

				int var3 = field852[0] & 0xFF;
				int var4 = ((field852[1] & 0xFF) << 8) + (field852[2] & 0xFF);
				int var5 = ((field852[3] & 0xFF) << 8) + (field852[4] & 0xFF);
				int var6 = field852[5] & 0xFF;
				field861 = null;
				for (MNWUSGDU var7 = (MNWUSGDU) field866.method510(); var7 != null; var7 = (MNWUSGDU) field866.method512()) {
					if (var7.field937 == var3 && var7.field939 == var4) {
						field861 = var7;
					}

					if (field861 != null) {
						var7.field938 = 0;
					}
				}

				if (field861 != null) {
					field854 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field861.field940 = null;

						if (field861.field941) {
							synchronized (field837) {
								field837.method507(field861);
							}
						} else {
							field861.method254();
						}

						field861 = null;
					} else {
						if (field861.field940 == null && var6 == 0) {
							field861.field940 = new byte[var5];
						}

						if (field861.field940 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field867 = var6 * 500;
				field868 = 500;
				if (field868 > var5 - var6 * 500) {
					field868 = var5 - var6 * 500;
				}
			}

			if (field868 > 0 && var1 >= field868) {
				field832 = true;
				byte[] var9 = field852;
				int var10 = 0;
				if (field861 != null) {
					var9 = field861.field940;
					var10 = field867;
				}

				for (int var11 = 0; var11 < field868; var11 += field845.read(var9, var10 + var11, field868 - var11)) {
				}

				if (field868 + field867 >= var9.length && field861 != null) {
					if (field847.field478[0] != null) {
						field847.field478[field861.field937 + 1].method516(var9, field861.field939, var9.length);
					}

					if (!field861.field941 && field861.field937 == 3) {
						field861.field941 = true;
						field861.field937 = 93;
					}

					if (field861.field941) {
						synchronized (field837) {
							field837.method507(field861);
						}
					} else {
						field861.method254();
					}
				}

				field868 = 0;
			}
		} catch (IOException var17) {
			try {
				field859.close();
			} catch (Exception var14) {
			}

			field859 = null;
			field845 = null;
			field865 = null;
			field868 = 0;
		}
	}

	@ObfuscatedName("JHGVYYQH.a(BI)Z")
	public final boolean method264(int arg0) {
		for (int var2 = 0; var2 < field848.length; var2++) {
			if (field846[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("JHGVYYQH.a(I)V")
	public final void method48(int arg0) {
		method265(0, arg0);
	}

	@ObfuscatedName("JHGVYYQH.b(II)V")
	public final void method265(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field864.length && arg1 >= 0 && arg1 <= field864[arg0].length && field864[arg0][arg1] != 0) {
			synchronized (field853) {
				for (MNWUSGDU var4 = (MNWUSGDU) field853.method246(); var4 != null; var4 = (MNWUSGDU) field853.method247()) {
					if (var4.field937 == arg0 && var4.field939 == arg1) {
						return;
					}
				}

				MNWUSGDU var5 = new MNWUSGDU();
				var5.field937 = arg0;
				var5.field939 = arg1;
				var5.field941 = true;

				synchronized (field840) {
					field840.method507(var5);
				}

				field853.method244(var5);
			}
		}
	}

	@ObfuscatedName("JHGVYYQH.a(III)V")
	public final void method266(int arg0, int arg1) {
		if (field847.field478[0] != null && (field864[arg1][arg0] != 0 && (field856[arg1][arg0] != 0 && field862 != 0))) {
			MNWUSGDU var3 = new MNWUSGDU();
			var3.field937 = arg1;
			var3.field939 = arg0;
			var3.field941 = false;

			synchronized (field860) {
				field860.method507(var3);
			}
		}
	}

	@ObfuscatedName("JHGVYYQH.a()LMNWUSGDU;")
	public final MNWUSGDU method267() {
		MNWUSGDU var2;
		synchronized (field837) {
			var2 = (MNWUSGDU) field837.method509();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field853) {
			var2.method312();
		}

		if (var2.field940 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field940));
			while (true) {
				if (field870.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field870, var4, field870.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field940 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field940[var7] = field870[var7];
		}

		return var2;
	}

	@ObfuscatedName("JHGVYYQH.b()I")
	public final int method268() {
		synchronized (field853) {
			return field853.method248();
		}
	}

	@ObfuscatedName("JHGVYYQH.a(LMNWUSGDU;Z)V")
	public final void method269(MNWUSGDU arg0) {
		try {
			if (field859 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field849 < 4000L) {
					return;
				}

				field849 = var2;
				field859 = field847.method133(client.field554 + 43594);
				field845 = field859.getInputStream();
				field865 = field859.getOutputStream();
				field865.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field845.read();
				}

				field854 = 0;
			}

			field852[0] = (byte) arg0.field937;
			field852[1] = (byte) (arg0.field939 >> 8);
			field852[2] = (byte) arg0.field939;
			if (arg0.field941) {
				field852[3] = 2;
			} else if (field847.field162) {
				field852[3] = 0;
			} else {
				field852[3] = 1;
			}

			field865.write(field852, 0, 4);
			field863 = 0;
			field851 = -10000;
		} catch (IOException var7) {
			try {
				field859.close();
			} catch (Exception var6) {
			}

			field859 = null;
			field845 = null;
			field865 = null;
			field868 = 0;
			field851++;
		}
	}

	@ObfuscatedName("JHGVYYQH.a(ZB)V")
	public final void method270(boolean arg0) {
		int var2 = field848.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field841[var3] != 0) {
				method275((byte) 2, field846[var3], 3);
				method275((byte) 2, field869[var3], 3);
			}
		}
	}

	@ObfuscatedName("JHGVYYQH.a(ZI)Z")
	public final boolean method271(int arg0) {
		if (field835[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("JHGVYYQH.a(LTXPLZUUI;Lclient;)V")
	public final void method272(TXPLZUUI arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method506(var3[var4], null);
			int var6 = var5.length / 2;
			PKHWFJLM var7 = new PKHWFJLM(var5);
			field864[var4] = new int[var6];
			field856[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field864[var4][var8] = var7.method332();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method506(var9[var10], null);
			int var12 = var11.length / 4;
			PKHWFJLM var13 = new PKHWFJLM(var11);
			field836[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field836[var10][var14] = var13.method335();
			}
		}

		byte[] var15 = arg0.method506("model_index", null);
		int var16 = field864[0].length;
		field838 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field838[var17] = var15[var17];
			} else {
				field838[var17] = 0;
			}
		}

		byte[] var18 = arg0.method506("map_index", null);
		PKHWFJLM var19 = new PKHWFJLM(var18);
		int var20 = var18.length / 7;
		field848 = new int[var20];
		field869 = new int[var20];
		field846 = new int[var20];
		field841 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field848[var21] = var19.method332();
			field869[var21] = var19.method332();
			field846[var21] = var19.method332();
			field841[var21] = var19.method330();
		}

		byte[] var22 = arg0.method506("anim_index", null);
		PKHWFJLM var23 = new PKHWFJLM(var22);
		int var24 = var22.length / 2;
		field834 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field834[var25] = var23.method332();
		}

		byte[] var26 = arg0.method506("midi_index", null);
		PKHWFJLM var27 = new PKHWFJLM(var26);
		int var28 = var26.length;
		field835 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field835[var29] = var27.method330();
		}

		field847 = arg1;
		field839 = true;
		field847.method135(this, 2);
	}

	@ObfuscatedName("JHGVYYQH.a(IB)I")
	public final int method273(int arg0) {
		return field838[arg0] & 0xFF;
	}

	public final void run() {
		try {
			while (field839) {
				field850++;
				byte var1 = 20;
				if (field862 == 0 && field847.field478[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field832 = true;
				for (int var2 = 0; var2 < 100 && field832; var2++) {
					field832 = false;
					method261();
					method258();

					if (field843 == 0 && var2 >= 5) {
						break;
					}

					method259();

					if (field845 != null) {
						method263();
					}
				}

				boolean var3 = false;
				for (MNWUSGDU var4 = (MNWUSGDU) field866.method510(); var4 != null; var4 = (MNWUSGDU) field866.method512()) {
					if (var4.field941) {
						var3 = true;
						var4.field938++;
						if (var4.field938 > 50) {
							var4.field938 = 0;
							method269(var4);
						}
					}
				}

				if (!var3) {
					for (MNWUSGDU var5 = (MNWUSGDU) field866.method510(); var5 != null; var5 = (MNWUSGDU) field866.method512()) {
						var3 = true;
						var5.field938++;
						if (var5.field938 > 50) {
							var5.field938 = 0;
							method269(var5);
						}
					}
				}

				if (var3) {
					field854++;
					if (field854 > 750) {
						try {
							field859.close();
						} catch (Exception var8) {
						}

						field859 = null;
						field845 = null;
						field865 = null;
						field868 = 0;
					}
				} else {
					field854 = 0;
					field858 = "";
				}

				if (field847.field162 && field859 != null && field865 != null && (field862 > 0 || field847.field478[0] == null)) {
					field863++;
					if (field863 > 500) {
						field863 = 0;
						field852[0] = 0;
						field852[1] = 0;
						field852[2] = 0;
						field852[3] = 10;
						try {
							field865.write(field852, 0, 4);
						} catch (IOException var7) {
							field854 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("JHGVYYQH.c()V")
	public final void method274() {
		field839 = false;
	}

	@ObfuscatedName("JHGVYYQH.a(IBII)V")
	public final void method275(byte arg0, int arg1, int arg2) {
		if (field847.field478[0] != null && field864[arg2][arg1] != 0) {
			byte[] var4 = field847.field478[arg2 + 1].method515(arg1);
			if (!method256(field864[arg2][arg1], field836[arg2][arg1], var4)) {
				field856[arg2][arg1] = arg0;

				if (arg0 > field862) {
					field862 = arg0;
				}

				field855++;
			}
		}
	}
}
