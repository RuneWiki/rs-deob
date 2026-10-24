package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("OBRIXRSB")
public class OBRIXRSB extends IPZPBZYE implements Runnable {

	@ObfuscatedName("OBRIXRSB.c")
	public BGEXEDZG field941 = new BGEXEDZG();

	@ObfuscatedName("OBRIXRSB.e")
	public int[][] field943 = new int[4][];

	@ObfuscatedName("OBRIXRSB.f")
	public CRC32 field944 = new CRC32();

	@ObfuscatedName("OBRIXRSB.g")
	public int[][] field945 = new int[4][];

	@ObfuscatedName("OBRIXRSB.h")
	public byte[] field946 = new byte[500];

	@ObfuscatedName("OBRIXRSB.i")
	public String field947 = "";

	@ObfuscatedName("OBRIXRSB.t")
	public byte[] field955 = new byte[65000];

	@ObfuscatedName("OBRIXRSB.u")
	public CLCMCMIN field956 = new CLCMCMIN();

	@ObfuscatedName("OBRIXRSB.C")
	public CLCMCMIN field962 = new CLCMCMIN();

	@ObfuscatedName("OBRIXRSB.D")
	public CLCMCMIN field963 = new CLCMCMIN();

	@ObfuscatedName("OBRIXRSB.E")
	public CLCMCMIN field964 = new CLCMCMIN();

	@ObfuscatedName("OBRIXRSB.N")
	public byte[][] field970 = new byte[4][];

	@ObfuscatedName("OBRIXRSB.T")
	public boolean field975 = true;

	@ObfuscatedName("OBRIXRSB.W")
	public CLCMCMIN field977 = new CLCMCMIN();

	@ObfuscatedName("OBRIXRSB.X")
	public boolean field978 = false;

	@ObfuscatedName("OBRIXRSB.b")
	public int field940;

	@ObfuscatedName("OBRIXRSB.k")
	public int field948;

	@ObfuscatedName("OBRIXRSB.r")
	public int field953;

	@ObfuscatedName("OBRIXRSB.s")
	public int field954;

	@ObfuscatedName("OBRIXRSB.w")
	public int field957;

	@ObfuscatedName("OBRIXRSB.z")
	public int field960;

	@ObfuscatedName("OBRIXRSB.A")
	public int field961;

	@ObfuscatedName("OBRIXRSB.H")
	public int field966;

	@ObfuscatedName("OBRIXRSB.K")
	public int field967;

	@ObfuscatedName("OBRIXRSB.Q")
	public int field973;

	@ObfuscatedName("OBRIXRSB.R")
	public int field974;

	@ObfuscatedName("OBRIXRSB.O")
	public long field971;

	@ObfuscatedName("OBRIXRSB.q")
	public NDLPOBEC field952;

	@ObfuscatedName("OBRIXRSB.L")
	public client field968;

	@ObfuscatedName("OBRIXRSB.V")
	public InputStream field976;

	@ObfuscatedName("OBRIXRSB.P")
	public OutputStream field972;

	@ObfuscatedName("OBRIXRSB.m")
	public Socket field949;

	@ObfuscatedName("OBRIXRSB.p")
	public byte[] field951;

	@ObfuscatedName("OBRIXRSB.d")
	public int[] field942;

	@ObfuscatedName("OBRIXRSB.o")
	public int[] field950;

	@ObfuscatedName("OBRIXRSB.x")
	public int[] field958;

	@ObfuscatedName("OBRIXRSB.y")
	public int[] field959;

	@ObfuscatedName("OBRIXRSB.F")
	public int[] field965;

	@ObfuscatedName("OBRIXRSB.M")
	public int[] field969;

	@ObfuscatedName("OBRIXRSB.a()I")
	public final int method410() {
		synchronized (field941) {
			return field941.method8();
		}
	}

	@ObfuscatedName("OBRIXRSB.a(I)V")
	public final void method320(int arg0) {
		method426(0, arg0);
	}

	@ObfuscatedName("OBRIXRSB.b(I)V")
	public final void method411() {
		while (field973 == 0) {
			if (field974 >= 10 || field967 == 0) {
				return;
			}

			NDLPOBEC var2;
			synchronized (field977) {
				var2 = (NDLPOBEC) field977.method70();
			}

			while (var2 != null) {
				if (field970[var2.field938][var2.field939] != 0) {
					field970[var2.field938][var2.field939] = 0;
					field963.method68(var2);
					method430(var2);
					field978 = true;

					if (field940 < field948) {
						field940++;
					}

					field947 = "Loading extra files - " + field940 * 100 / field948 + "%";
					field974++;
					if (field974 == 10) {
						return;
					}
				}

				synchronized (field977) {
					var2 = (NDLPOBEC) field977.method70();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field970[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field967) {
						var5[var7] = 0;
						NDLPOBEC var8 = new NDLPOBEC();
						var8.field938 = var4;
						var8.field939 = var7;
						var8.field937 = false;
						field963.method68(var8);
						method430(var8);
						field978 = true;

						if (field940 < field948) {
							field940++;
						}

						field947 = "Loading extra files - " + field940 * 100 / field948 + "%";
						field974++;
						if (field974 == 10) {
							return;
						}
					}
				}
			}

			field967--;
		}
	}

	@ObfuscatedName("OBRIXRSB.c(I)V")
	public final void method412() {
		field973 = 0;
		field974 = 0;
		for (NDLPOBEC var1 = (NDLPOBEC) field963.method71(); var1 != null; var1 = (NDLPOBEC) field963.method73()) {
			if (var1.field937) {
				field973++;
			} else {
				field974++;
			}
		}

		while (field973 < 10) {
			NDLPOBEC var2 = (NDLPOBEC) field962.method70();
			if (var2 == null) {
				break;
			}

			if (field970[var2.field938][var2.field939] != 0) {
				field940++;
			}

			field970[var2.field938][var2.field939] = 0;
			field963.method68(var2);
			field973++;
			method430(var2);
			field978 = true;
		}
	}

	@ObfuscatedName("OBRIXRSB.a(ZBII)V")
	public final void method413(byte arg0, int arg1, int arg2) {
		if (field968.field268[0] != null && field943[arg1][arg2] != 0) {
			byte[] var4 = field968.field268[arg1 + 1].method459(arg2);
			if (!method416(field945[arg1][arg2], var4, field943[arg1][arg2])) {
				field970[arg1][arg2] = arg0;

				if (arg0 > field967) {
					field967 = arg0;
				}

				field948++;
			}
		}
	}

	@ObfuscatedName("OBRIXRSB.a(BI)Z")
	public final boolean method414(int arg0) {
		for (int var2 = 0; var2 < field950.length; var2++) {
			if (field969[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("OBRIXRSB.d(I)I")
	public final int method415() {
		return field959.length;
	}

	@ObfuscatedName("OBRIXRSB.a(I[BIZ)Z")
	public final boolean method416(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field944.reset();
			field944.update(arg1, 0, var4);
			int var6 = (int) field944.getValue();

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

	@ObfuscatedName("OBRIXRSB.b()LNDLPOBEC;")
	public final NDLPOBEC method417() {
		NDLPOBEC var2;
		synchronized (field964) {
			var2 = (NDLPOBEC) field964.method70();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field941) {
			var2.method564();
		}

		if (var2.field936 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field936));
			while (true) {
				if (field955.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field955, var4, field955.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field936 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field936[var7] = field955[var7];
		}

		return var2;
	}

	@ObfuscatedName("OBRIXRSB.c()V")
	public final void method418() {
		field975 = false;
	}

	@ObfuscatedName("OBRIXRSB.a(IZ)I")
	public final int method419(int arg0) {
		return field943[arg0].length;
	}

	@ObfuscatedName("OBRIXRSB.e(I)V")
	public final void method420() {
		NDLPOBEC var2;
		synchronized (field956) {
			var2 = (NDLPOBEC) field956.method70();
		}

		while (var2 != null) {
			field978 = true;
			byte[] var3 = null;
			if (field968.field268[0] != null) {
				var3 = field968.field268[var2.field938 + 1].method459(var2.field939);
			}

			if (!method416(field945[var2.field938][var2.field939], var3, field943[var2.field938][var2.field939])) {
				var3 = null;
			}

			synchronized (field956) {
				if (var3 == null) {
					field962.method68(var2);
				} else {
					var2.field936 = var3;

					synchronized (field964) {
						field964.method68(var2);
					}
				}

				var2 = (NDLPOBEC) field956.method70();
			}
		}
	}

	@ObfuscatedName("OBRIXRSB.a(III)V")
	public final void method421(int arg0, int arg1) {
		if (field968.field268[0] != null && (field943[arg1][arg0] != 0 && (field970[arg1][arg0] != 0 && field967 != 0))) {
			NDLPOBEC var3 = new NDLPOBEC();
			var3.field938 = arg1;
			var3.field939 = arg0;
			var3.field937 = false;

			synchronized (field977) {
				field977.method68(var3);
			}
		}
	}

	@ObfuscatedName("OBRIXRSB.a(II)I")
	public final int method422(int arg0) {
		return field951[arg0] & 0xFF;
	}

	@ObfuscatedName("OBRIXRSB.b(II)Z")
	public final boolean method423(int arg0) {
		if (field965[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("OBRIXRSB.a(IIIB)I")
	public final int method424(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg1;
		for (int var5 = 0; var5 < field950.length; var5++) {
			if (field950[var5] == var4) {
				if (arg0 == 0) {
					return field958[var5];
				}

				return field969[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("OBRIXRSB.a(B)V")
	public final void method425() {
		synchronized (field977) {
			field977.method75();
		}
	}

	@ObfuscatedName("OBRIXRSB.c(II)V")
	public final void method426(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field943.length && arg1 >= 0 && arg1 <= field943[arg0].length && field943[arg0][arg1] != 0) {
			synchronized (field941) {
				for (NDLPOBEC var4 = (NDLPOBEC) field941.method6(); var4 != null; var4 = (NDLPOBEC) field941.method7()) {
					if (var4.field938 == arg0 && var4.field939 == arg1) {
						return;
					}
				}

				NDLPOBEC var5 = new NDLPOBEC();
				var5.field938 = arg0;
				var5.field939 = arg1;
				var5.field937 = true;

				synchronized (field956) {
					field956.method68(var5);
				}

				field941.method4(var5);
			}
		}
	}

	@ObfuscatedName("OBRIXRSB.a(Z)V")
	public final void method427() {
		try {
			int var1 = field976.available();
			if (field961 == 0 && var1 >= 6) {
				field978 = true;

				for (int var2 = 0; var2 < 6; var2 += field976.read(field946, var2, 6 - var2)) {
				}

				int var3 = field946[0] & 0xFF;
				int var4 = ((field946[1] & 0xFF) << 8) + (field946[2] & 0xFF);
				int var5 = ((field946[3] & 0xFF) << 8) + (field946[4] & 0xFF);
				int var6 = field946[5] & 0xFF;
				field952 = null;
				for (NDLPOBEC var7 = (NDLPOBEC) field963.method71(); var7 != null; var7 = (NDLPOBEC) field963.method73()) {
					if (var7.field938 == var3 && var7.field939 == var4) {
						field952 = var7;
					}

					if (field952 != null) {
						var7.field935 = 0;
					}
				}

				if (field952 != null) {
					field953 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field952.field936 = null;

						if (field952.field937) {
							synchronized (field964) {
								field964.method68(field952);
							}
						} else {
							field952.method582();
						}

						field952 = null;
					} else {
						if (field952.field936 == null && var6 == 0) {
							field952.field936 = new byte[var5];
						}

						if (field952.field936 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field960 = var6 * 500;
				field961 = 500;
				if (field961 > var5 - var6 * 500) {
					field961 = var5 - var6 * 500;
				}
			}

			if (field961 > 0 && var1 >= field961) {
				field978 = true;
				byte[] var9 = field946;
				int var10 = 0;
				if (field952 != null) {
					var9 = field952.field936;
					var10 = field960;
				}

				for (int var11 = 0; var11 < field961; var11 += field976.read(var9, var10 + var11, field961 - var11)) {
				}

				if (field961 + field960 >= var9.length && field952 != null) {
					if (field968.field268[0] != null) {
						field968.field268[field952.field938 + 1].method460(field952.field939, var9.length, var9);
					}

					if (!field952.field937 && field952.field938 == 3) {
						field952.field937 = true;
						field952.field938 = 93;
					}

					if (field952.field937) {
						synchronized (field964) {
							field964.method68(field952);
						}
					} else {
						field952.method582();
					}
				}

				field961 = 0;
			}
		} catch (IOException var17) {
			try {
				field949.close();
			} catch (Exception var14) {
			}

			field949 = null;
			field976 = null;
			field972 = null;
			field961 = 0;
		}
	}

	@ObfuscatedName("OBRIXRSB.a(ZZ)V")
	public final void method428(boolean arg0) {
		int var2 = field950.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field942[var3] != 0) {
				method413((byte) 2, 3, field969[var3]);
				method413((byte) 2, 3, field958[var3]);
			}
		}
	}

	@ObfuscatedName("OBRIXRSB.a(LVSUYIIVA;Lclient;)V")
	public final void method429(VSUYIIVA arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method570(var3[var4], null);
			int var6 = var5.length / 2;
			CFARFRSG var7 = new CFARFRSG(var5);
			field943[var4] = new int[var6];
			field970[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field943[var4][var8] = var7.method32();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method570(var9[var10], null);
			int var12 = var11.length / 4;
			CFARFRSG var13 = new CFARFRSG(var11);
			field945[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field945[var10][var14] = var13.method35();
			}
		}

		byte[] var15 = arg0.method570("model_index", null);
		int var16 = field943[0].length;
		field951 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field951[var17] = var15[var17];
			} else {
				field951[var17] = 0;
			}
		}

		byte[] var18 = arg0.method570("map_index", null);
		CFARFRSG var19 = new CFARFRSG(var18);
		int var20 = var18.length / 7;
		field950 = new int[var20];
		field958 = new int[var20];
		field969 = new int[var20];
		field942 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field950[var21] = var19.method32();
			field958[var21] = var19.method32();
			field969[var21] = var19.method32();
			field942[var21] = var19.method30();
		}

		byte[] var22 = arg0.method570("anim_index", null);
		CFARFRSG var23 = new CFARFRSG(var22);
		int var24 = var22.length / 2;
		field959 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field959[var25] = var23.method32();
		}

		byte[] var26 = arg0.method570("midi_index", null);
		CFARFRSG var27 = new CFARFRSG(var26);
		int var28 = var26.length;
		field965 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field965[var29] = var27.method30();
		}

		field968 = arg1;
		field975 = true;
		field968.method129(this, 2);
	}

	@ObfuscatedName("OBRIXRSB.a(LNDLPOBEC;Z)V")
	public final void method430(NDLPOBEC arg0) {
		try {
			if (field949 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field971 < 4000L) {
					return;
				}

				field971 = var2;
				field949 = field968.method87(client.field270 + 43594);
				field976 = field949.getInputStream();
				field972 = field949.getOutputStream();
				field972.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field976.read();
				}

				field953 = 0;
			}

			field946[0] = (byte) arg0.field938;
			field946[1] = (byte) (arg0.field939 >> 8);
			field946[2] = (byte) arg0.field939;
			if (arg0.field937) {
				field946[3] = 2;
			} else if (field968.field430) {
				field946[3] = 0;
			} else {
				field946[3] = 1;
			}

			field972.write(field946, 0, 4);
			field954 = 0;
			field957 = -10000;
		} catch (IOException var7) {
			try {
				field949.close();
			} catch (Exception var6) {
			}

			field949 = null;
			field976 = null;
			field972 = null;
			field961 = 0;
			field957++;
		}
	}

	public final void run() {
		try {
			while (field975) {
				field966++;
				byte var1 = 20;
				if (field967 == 0 && field968.field268[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field978 = true;
				for (int var2 = 0; var2 < 100 && field978; var2++) {
					field978 = false;
					method420();
					method412();

					if (field973 == 0 && var2 >= 5) {
						break;
					}

					method411();

					if (field976 != null) {
						method427();
					}
				}

				boolean var3 = false;
				for (NDLPOBEC var4 = (NDLPOBEC) field963.method71(); var4 != null; var4 = (NDLPOBEC) field963.method73()) {
					if (var4.field937) {
						var3 = true;
						var4.field935++;
						if (var4.field935 > 50) {
							var4.field935 = 0;
							method430(var4);
						}
					}
				}

				if (!var3) {
					for (NDLPOBEC var5 = (NDLPOBEC) field963.method71(); var5 != null; var5 = (NDLPOBEC) field963.method73()) {
						var3 = true;
						var5.field935++;
						if (var5.field935 > 50) {
							var5.field935 = 0;
							method430(var5);
						}
					}
				}

				if (var3) {
					field953++;
					if (field953 > 750) {
						try {
							field949.close();
						} catch (Exception var8) {
						}

						field949 = null;
						field976 = null;
						field972 = null;
						field961 = 0;
					}
				} else {
					field953 = 0;
					field947 = "";
				}

				if (field968.field430 && field949 != null && field972 != null && (field967 > 0 || field968.field268[0] == null)) {
					field954++;
					if (field954 > 500) {
						field954 = 0;
						field946[0] = 0;
						field946[1] = 0;
						field946[2] = 0;
						field946[3] = 10;
						try {
							field972.write(field946, 0, 4);
						} catch (IOException var7) {
							field953 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}
}
