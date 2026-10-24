package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("MWSOISVX")
public class MWSOISVX extends ORTULIPP implements Runnable {

	@ObfuscatedName("MWSOISVX.c")
	public ZCVCEQHJ field946 = new ZCVCEQHJ();

	@ObfuscatedName("MWSOISVX.d")
	public ZCVCEQHJ field947 = new ZCVCEQHJ();

	@ObfuscatedName("MWSOISVX.e")
	public int[][] field948 = new int[4][];

	@ObfuscatedName("MWSOISVX.k")
	public boolean field953 = true;

	@ObfuscatedName("MWSOISVX.n")
	public ZCVCEQHJ field955 = new ZCVCEQHJ();

	@ObfuscatedName("MWSOISVX.o")
	public QUHNUHWS field956 = new QUHNUHWS();

	@ObfuscatedName("MWSOISVX.w")
	public byte[] field961 = new byte[65000];

	@ObfuscatedName("MWSOISVX.B")
	public String field966 = "";

	@ObfuscatedName("MWSOISVX.C")
	public int[][] field967 = new int[4][];

	@ObfuscatedName("MWSOISVX.D")
	public byte[][] field968 = new byte[4][];

	@ObfuscatedName("MWSOISVX.E")
	public ZCVCEQHJ field969 = new ZCVCEQHJ();

	@ObfuscatedName("MWSOISVX.F")
	public ZCVCEQHJ field970 = new ZCVCEQHJ();

	@ObfuscatedName("MWSOISVX.H")
	public CRC32 field972 = new CRC32();

	@ObfuscatedName("MWSOISVX.M")
	public boolean field977 = false;

	@ObfuscatedName("MWSOISVX.T")
	public byte[] field982 = new byte[500];

	@ObfuscatedName("MWSOISVX.g")
	public int field949;

	@ObfuscatedName("MWSOISVX.h")
	public int field950;

	@ObfuscatedName("MWSOISVX.i")
	public int field951;

	@ObfuscatedName("MWSOISVX.s")
	public int field958;

	@ObfuscatedName("MWSOISVX.v")
	public int field960;

	@ObfuscatedName("MWSOISVX.z")
	public int field964;

	@ObfuscatedName("MWSOISVX.J")
	public int field974;

	@ObfuscatedName("MWSOISVX.N")
	public int field978;

	@ObfuscatedName("MWSOISVX.O")
	public int field979;

	@ObfuscatedName("MWSOISVX.R")
	public int field980;

	@ObfuscatedName("MWSOISVX.S")
	public int field981;

	@ObfuscatedName("MWSOISVX.m")
	public long field954;

	@ObfuscatedName("MWSOISVX.G")
	public COEBDAGX field971;

	@ObfuscatedName("MWSOISVX.a")
	public client field944;

	@ObfuscatedName("MWSOISVX.t")
	public InputStream field959;

	@ObfuscatedName("MWSOISVX.y")
	public OutputStream field963;

	@ObfuscatedName("MWSOISVX.j")
	public Socket field952;

	@ObfuscatedName("MWSOISVX.A")
	public byte[] field965;

	@ObfuscatedName("MWSOISVX.b")
	public int[] field945;

	@ObfuscatedName("MWSOISVX.p")
	public int[] field957;

	@ObfuscatedName("MWSOISVX.x")
	public int[] field962;

	@ObfuscatedName("MWSOISVX.I")
	public int[] field973;

	@ObfuscatedName("MWSOISVX.K")
	public int[] field975;

	@ObfuscatedName("MWSOISVX.L")
	public int[] field976;

	@ObfuscatedName("MWSOISVX.b(I)V")
	public final void method326() {
		while (field978 == 0) {
			if (field979 >= 10 || field960 == 0) {
				return;
			}

			COEBDAGX var2;
			synchronized (field969) {
				var2 = (COEBDAGX) field969.method591();
			}

			while (var2 != null) {
				if (field968[var2.field552][var2.field549] != 0) {
					field968[var2.field552][var2.field549] = 0;
					field947.method589(var2);
					method346(var2);
					field977 = true;

					if (field981 < field949) {
						field981++;
					}

					field966 = "Loading extra files - " + field981 * 100 / field949 + "%";
					field979++;
					if (field979 == 10) {
						return;
					}
				}

				synchronized (field969) {
					var2 = (COEBDAGX) field969.method591();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field968[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field960) {
						var5[var7] = 0;
						COEBDAGX var8 = new COEBDAGX();
						var8.field552 = var4;
						var8.field549 = var7;
						var8.field551 = false;
						field947.method589(var8);
						method346(var8);
						field977 = true;

						if (field981 < field949) {
							field981++;
						}

						field966 = "Loading extra files - " + field981 * 100 / field949 + "%";
						field979++;
						if (field979 == 10) {
							return;
						}
					}
				}
			}

			field960--;
		}
	}

	@ObfuscatedName("MWSOISVX.a(II)Z")
	public final boolean method327(int arg0) {
		for (int var2 = 0; var2 < field957.length; var2++) {
			if (field975[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("MWSOISVX.b(II)V")
	public final void method328(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field967.length && arg1 >= 0 && arg1 <= field967[arg0].length && field967[arg0][arg1] != 0) {
			synchronized (field956) {
				for (COEBDAGX var4 = (COEBDAGX) field956.method395(); var4 != null; var4 = (COEBDAGX) field956.method396()) {
					if (var4.field552 == arg0 && var4.field549 == arg1) {
						return;
					}
				}

				COEBDAGX var5 = new COEBDAGX();
				var5.field552 = arg0;
				var5.field549 = arg1;
				var5.field551 = true;

				synchronized (field955) {
					field955.method589(var5);
				}

				field956.method393(var5);
			}
		}
	}

	@ObfuscatedName("MWSOISVX.a()V")
	public final void method329() {
		field953 = false;
	}

	@ObfuscatedName("MWSOISVX.a(ZII)V")
	public final void method330(int arg0, int arg1) {
		if (field944.field278[0] != null && (field967[arg1][arg0] != 0 && (field968[arg1][arg0] != 0 && field960 != 0))) {
			COEBDAGX var3 = new COEBDAGX();
			var3.field552 = arg1;
			var3.field549 = arg0;
			var3.field551 = false;

			synchronized (field969) {
				field969.method589(var3);
			}
		}
	}

	@ObfuscatedName("MWSOISVX.c(I)V")
	public final void method331() {
		synchronized (field969) {
			field969.method596();
		}
	}

	@ObfuscatedName("MWSOISVX.a(IBII)V")
	public final void method332(int arg0, byte arg1, int arg2) {
		if (field944.field278[0] != null && field967[arg0][arg2] != 0) {
			byte[] var4 = field944.field278[arg0 + 1].method259(arg2);
			if (!method344(var4, field967[arg0][arg2], field948[arg0][arg2])) {
				field968[arg0][arg2] = arg1;

				if (arg1 > field960) {
					field960 = arg1;
				}

				field949++;
			}
		}
	}

	@ObfuscatedName("MWSOISVX.b()LCOEBDAGX;")
	public final COEBDAGX method333() {
		COEBDAGX var2;
		synchronized (field946) {
			var2 = (COEBDAGX) field946.method591();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field956) {
			var2.method348();
		}

		if (var2.field550 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field550));
			while (true) {
				if (field961.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field961, var4, field961.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field550 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field550[var7] = field961[var7];
		}

		return var2;
	}

	@ObfuscatedName("MWSOISVX.a(ZZ)V")
	public final void method334(boolean arg0) {
		int var2 = field957.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field973[var3] != 0) {
				method332(3, (byte) 2, field975[var3]);
				method332(3, (byte) 2, field976[var3]);
			}
		}
	}

	@ObfuscatedName("MWSOISVX.d(I)I")
	public final int method335() {
		return field962.length;
	}

	@ObfuscatedName("MWSOISVX.e(I)V")
	public final void method336() {
		try {
			int var1 = field959.available();
			if (field951 == 0 && var1 >= 6) {
				field977 = true;

				for (int var2 = 0; var2 < 6; var2 += field959.read(field982, var2, 6 - var2)) {
				}

				int var3 = field982[0] & 0xFF;
				int var4 = ((field982[1] & 0xFF) << 8) + (field982[2] & 0xFF);
				int var5 = ((field982[3] & 0xFF) << 8) + (field982[4] & 0xFF);
				int var6 = field982[5] & 0xFF;
				field971 = null;
				for (COEBDAGX var7 = (COEBDAGX) field947.method592(); var7 != null; var7 = (COEBDAGX) field947.method594()) {
					if (var7.field552 == var3 && var7.field549 == var4) {
						field971 = var7;
					}

					if (field971 != null) {
						var7.field548 = 0;
					}
				}

				if (field971 != null) {
					field958 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field971.field550 = null;

						if (field971.field551) {
							synchronized (field946) {
								field946.method589(field971);
							}
						} else {
							field971.method1();
						}

						field971 = null;
					} else {
						if (field971.field550 == null && var6 == 0) {
							field971.field550 = new byte[var5];
						}

						if (field971.field550 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field950 = var6 * 500;
				field951 = 500;
				if (field951 > var5 - var6 * 500) {
					field951 = var5 - var6 * 500;
				}
			}

			if (field951 > 0 && var1 >= field951) {
				field977 = true;
				byte[] var9 = field982;
				int var10 = 0;
				if (field971 != null) {
					var9 = field971.field550;
					var10 = field950;
				}

				for (int var11 = 0; var11 < field951; var11 += field959.read(var9, var10 + var11, field951 - var11)) {
				}

				if (field951 + field950 >= var9.length && field971 != null) {
					if (field944.field278[0] != null) {
						field944.field278[field971.field552 + 1].method260(var9.length, var9, field971.field549);
					}

					if (!field971.field551 && field971.field552 == 3) {
						field971.field551 = true;
						field971.field552 = 93;
					}

					if (field971.field551) {
						synchronized (field946) {
							field946.method589(field971);
						}
					} else {
						field971.method1();
					}
				}

				field951 = 0;
			}
		} catch (IOException var17) {
			try {
				field952.close();
			} catch (Exception var14) {
			}

			field952 = null;
			field959 = null;
			field963 = null;
			field951 = 0;
		}
	}

	@ObfuscatedName("MWSOISVX.c()I")
	public final int method337() {
		synchronized (field956) {
			return field956.method397();
		}
	}

	public final void run() {
		try {
			while (field953) {
				field974++;
				byte var1 = 20;
				if (field960 == 0 && field944.field278[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field977 = true;
				for (int var2 = 0; var2 < 100 && field977; var2++) {
					field977 = false;
					method343();
					method345();

					if (field978 == 0 && var2 >= 5) {
						break;
					}

					method326();

					if (field959 != null) {
						method336();
					}
				}

				boolean var3 = false;
				for (COEBDAGX var4 = (COEBDAGX) field947.method592(); var4 != null; var4 = (COEBDAGX) field947.method594()) {
					if (var4.field551) {
						var3 = true;
						var4.field548++;
						if (var4.field548 > 50) {
							var4.field548 = 0;
							method346(var4);
						}
					}
				}

				if (!var3) {
					for (COEBDAGX var5 = (COEBDAGX) field947.method592(); var5 != null; var5 = (COEBDAGX) field947.method594()) {
						var3 = true;
						var5.field548++;
						if (var5.field548 > 50) {
							var5.field548 = 0;
							method346(var5);
						}
					}
				}

				if (var3) {
					field958++;
					if (field958 > 750) {
						try {
							field952.close();
						} catch (Exception var8) {
						}

						field952 = null;
						field959 = null;
						field963 = null;
						field951 = 0;
					}
				} else {
					field958 = 0;
					field966 = "";
				}

				if (field944.field480 && field952 != null && field963 != null && (field960 > 0 || field944.field278[0] == null)) {
					field980++;
					if (field980 > 500) {
						field980 = 0;
						field982[0] = 0;
						field982[1] = 0;
						field982[2] = 0;
						field982[3] = 10;
						try {
							field963.write(field982, 0, 4);
						} catch (IOException var7) {
							field958 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("MWSOISVX.c(II)I")
	public final int method338(int arg0) {
		return field965[arg0] & 0xFF;
	}

	@ObfuscatedName("MWSOISVX.a(IB)Z")
	public final boolean method339(int arg0) {
		if (field945[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("MWSOISVX.a(ZIII)I")
	public final int method340(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < field957.length; var5++) {
			if (field957[var5] == var4) {
				if (arg2 == 0) {
					return field976[var5];
				}

				return field975[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("MWSOISVX.a(I)V")
	public final void method341(int arg0) {
		method328(0, arg0);
	}

	@ObfuscatedName("MWSOISVX.a(IZ)I")
	public final int method342(int arg0) {
		return field967[arg0].length;
	}

	@ObfuscatedName("MWSOISVX.f(I)V")
	public final void method343() {
		COEBDAGX var2;
		synchronized (field955) {
			var2 = (COEBDAGX) field955.method591();
		}

		while (var2 != null) {
			field977 = true;
			byte[] var3 = null;
			if (field944.field278[0] != null) {
				var3 = field944.field278[var2.field552 + 1].method259(var2.field549);
			}

			if (!method344(var3, field967[var2.field552][var2.field549], field948[var2.field552][var2.field549])) {
				var3 = null;
			}

			synchronized (field955) {
				if (var3 == null) {
					field970.method589(var2);
				} else {
					var2.field550 = var3;

					synchronized (field946) {
						field946.method589(var2);
					}
				}

				var2 = (COEBDAGX) field955.method591();
			}
		}
	}

	@ObfuscatedName("MWSOISVX.a([BIIB)Z")
	public final boolean method344(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field972.reset();
			field972.update(arg0, 0, var4);
			int var6 = (int) field972.getValue();

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

	@ObfuscatedName("MWSOISVX.a(B)V")
	public final void method345() {
		field978 = 0;
		field979 = 0;
		for (COEBDAGX var1 = (COEBDAGX) field947.method592(); var1 != null; var1 = (COEBDAGX) field947.method594()) {
			if (var1.field551) {
				field978++;
			} else {
				field979++;
			}
		}

		while (field978 < 10) {
			COEBDAGX var2 = (COEBDAGX) field970.method591();
			if (var2 == null) {
				break;
			}

			if (field968[var2.field552][var2.field549] != 0) {
				field981++;
			}

			field968[var2.field552][var2.field549] = 0;
			field947.method589(var2);
			field978++;
			method346(var2);
			field977 = true;
		}
	}

	@ObfuscatedName("MWSOISVX.a(BLCOEBDAGX;)V")
	public final void method346(COEBDAGX arg0) {
		try {
			if (field952 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field954 < 4000L) {
					return;
				}

				field954 = var2;
				field952 = field944.method29(client.field257 + 43594);
				field959 = field952.getInputStream();
				field963 = field952.getOutputStream();
				field963.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field959.read();
				}

				field958 = 0;
			}

			field982[0] = (byte) arg0.field552;
			field982[1] = (byte) (arg0.field549 >> 8);
			field982[2] = (byte) arg0.field549;
			if (arg0.field551) {
				field982[3] = 2;
			} else if (field944.field480) {
				field982[3] = 0;
			} else {
				field982[3] = 1;
			}

			field963.write(field982, 0, 4);
			field980 = 0;
			field964 = -10000;
		} catch (IOException var7) {
			try {
				field952.close();
			} catch (Exception var6) {
			}

			field952 = null;
			field959 = null;
			field963 = null;
			field951 = 0;
			field964++;
		}
	}

	@ObfuscatedName("MWSOISVX.a(LFNOQZAYQ;Lclient;)V")
	public final void method347(FNOQZAYQ arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method246(var3[var4], null);
			int var6 = var5.length / 2;
			DNRIFKTO var7 = new DNRIFKTO(var5);
			field967[var4] = new int[var6];
			field968[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field967[var4][var8] = var7.method191();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method246(var9[var10], null);
			int var12 = var11.length / 4;
			DNRIFKTO var13 = new DNRIFKTO(var11);
			field948[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field948[var10][var14] = var13.method194();
			}
		}

		byte[] var15 = arg0.method246("model_index", null);
		int var16 = field967[0].length;
		field965 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field965[var17] = var15[var17];
			} else {
				field965[var17] = 0;
			}
		}

		byte[] var18 = arg0.method246("map_index", null);
		DNRIFKTO var19 = new DNRIFKTO(var18);
		int var20 = var18.length / 7;
		field957 = new int[var20];
		field976 = new int[var20];
		field975 = new int[var20];
		field973 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field957[var21] = var19.method191();
			field976[var21] = var19.method191();
			field975[var21] = var19.method191();
			field973[var21] = var19.method189();
		}

		byte[] var22 = arg0.method246("anim_index", null);
		DNRIFKTO var23 = new DNRIFKTO(var22);
		int var24 = var22.length / 2;
		field962 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field962[var25] = var23.method191();
		}

		byte[] var26 = arg0.method246("midi_index", null);
		DNRIFKTO var27 = new DNRIFKTO(var26);
		int var28 = var26.length;
		field945 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field945[var29] = var27.method189();
		}

		field944 = arg1;
		field953 = true;
		field944.method86(this, 2);
	}
}
