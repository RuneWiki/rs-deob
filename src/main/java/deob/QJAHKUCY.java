package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("QJAHKUCY")
public class QJAHKUCY extends DVDSOJFB implements Runnable {

	@ObfuscatedName("QJAHKUCY.e")
	public String field968 = "";

	@ObfuscatedName("QJAHKUCY.f")
	public EZXKBAZY field969 = new EZXKBAZY();

	@ObfuscatedName("QJAHKUCY.h")
	public int[][] field971 = new int[4][];

	@ObfuscatedName("QJAHKUCY.k")
	public int[][] field974 = new int[4][];

	@ObfuscatedName("QJAHKUCY.m")
	public EZXKBAZY field976 = new EZXKBAZY();

	@ObfuscatedName("QJAHKUCY.o")
	public byte[] field978 = new byte[65000];

	@ObfuscatedName("QJAHKUCY.q")
	public JTFJPMGL field979 = new JTFJPMGL();

	@ObfuscatedName("QJAHKUCY.u")
	public EZXKBAZY field983 = new EZXKBAZY();

	@ObfuscatedName("QJAHKUCY.z")
	public EZXKBAZY field987 = new EZXKBAZY();

	@ObfuscatedName("QJAHKUCY.A")
	public CRC32 field988 = new CRC32();

	@ObfuscatedName("QJAHKUCY.H")
	public byte[] field995 = new byte[500];

	@ObfuscatedName("QJAHKUCY.I")
	public boolean field996 = false;

	@ObfuscatedName("QJAHKUCY.K")
	public byte[][] field998 = new byte[4][];

	@ObfuscatedName("QJAHKUCY.L")
	public boolean field999 = true;

	@ObfuscatedName("QJAHKUCY.R")
	public EZXKBAZY field1003 = new EZXKBAZY();

	@ObfuscatedName("QJAHKUCY.Q")
	public int field1002;

	@ObfuscatedName("QJAHKUCY.c")
	public int field966;

	@ObfuscatedName("QJAHKUCY.g")
	public int field970;

	@ObfuscatedName("QJAHKUCY.r")
	public int field980;

	@ObfuscatedName("QJAHKUCY.s")
	public int field981;

	@ObfuscatedName("QJAHKUCY.t")
	public int field982;

	@ObfuscatedName("QJAHKUCY.D")
	public int field991;

	@ObfuscatedName("QJAHKUCY.E")
	public int field992;

	@ObfuscatedName("QJAHKUCY.F")
	public int field993;

	@ObfuscatedName("QJAHKUCY.G")
	public int field994;

	@ObfuscatedName("QJAHKUCY.J")
	public int field997;

	@ObfuscatedName("QJAHKUCY.P")
	public long field1001;

	@ObfuscatedName("QJAHKUCY.d")
	public ACXEOGCN field967;

	@ObfuscatedName("QJAHKUCY.B")
	public client field989;

	@ObfuscatedName("QJAHKUCY.v")
	public InputStream field984;

	@ObfuscatedName("QJAHKUCY.y")
	public OutputStream field986;

	@ObfuscatedName("QJAHKUCY.i")
	public Socket field972;

	@ObfuscatedName("QJAHKUCY.l")
	public byte[] field975;

	@ObfuscatedName("QJAHKUCY.N")
	public int[] field1000;

	@ObfuscatedName("QJAHKUCY.S")
	public int[] field1004;

	@ObfuscatedName("QJAHKUCY.j")
	public int[] field973;

	@ObfuscatedName("QJAHKUCY.n")
	public int[] field977;

	@ObfuscatedName("QJAHKUCY.x")
	public int[] field985;

	@ObfuscatedName("QJAHKUCY.C")
	public int[] field990;

	@ObfuscatedName("QJAHKUCY.b(I)I")
	public final int method354() {
		return field985.length;
	}

	@ObfuscatedName("QJAHKUCY.a(ZI)V")
	public final void method355(boolean arg0) {
		int var2 = field977.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1000[var3] != 0) {
				method361(field1004[var3], (byte) 2, 3);
				method361(field990[var3], (byte) 2, 3);
			}
		}
	}

	@ObfuscatedName("QJAHKUCY.a(ILACXEOGCN;)V")
	public final void method356(ACXEOGCN arg0) {
		try {
			if (field972 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1001 < 4000L) {
					return;
				}

				field1001 = var2;
				field972 = field989.method111(client.field461 + 43594);
				field984 = field972.getInputStream();
				field986 = field972.getOutputStream();
				field986.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field984.read();
				}

				field970 = 0;
			}

			field995[0] = (byte) arg0.field9;
			field995[1] = (byte) (arg0.field8 >> 8);
			field995[2] = (byte) arg0.field8;
			if (arg0.field10) {
				field995[3] = 2;
			} else if (field989.field240) {
				field995[3] = 0;
			} else {
				field995[3] = 1;
			}

			field986.write(field995, 0, 4);
			field966 = 0;
			field997 = -10000;
		} catch (IOException var7) {
			try {
				field972.close();
			} catch (Exception var6) {
			}

			field972 = null;
			field984 = null;
			field986 = null;
			field992 = 0;
			field997++;
		}
	}

	@ObfuscatedName("QJAHKUCY.a(LFXNTEMPE;Lclient;)V")
	public final void method357(FXNTEMPE arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method212(var3[var4], null);
			int var6 = var5.length / 2;
			RSWRPCHR var7 = new RSWRPCHR(var5);
			field974[var4] = new int[var6];
			field998[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field974[var4][var8] = var7.method390();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method212(var9[var10], null);
			int var12 = var11.length / 4;
			RSWRPCHR var13 = new RSWRPCHR(var11);
			field971[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field971[var10][var14] = var13.method393();
			}
		}

		byte[] var15 = arg0.method212("model_index", null);
		int var16 = field974[0].length;
		field975 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field975[var17] = var15[var17];
			} else {
				field975[var17] = 0;
			}
		}

		byte[] var18 = arg0.method212("map_index", null);
		RSWRPCHR var19 = new RSWRPCHR(var18);
		int var20 = var18.length / 7;
		field977 = new int[var20];
		field990 = new int[var20];
		field1004 = new int[var20];
		field1000 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field977[var21] = var19.method390();
			field990[var21] = var19.method390();
			field1004[var21] = var19.method390();
			field1000[var21] = var19.method388();
		}

		byte[] var22 = arg0.method212("anim_index", null);
		RSWRPCHR var23 = new RSWRPCHR(var22);
		int var24 = var22.length / 2;
		field985 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field985[var25] = var23.method390();
		}

		byte[] var26 = arg0.method212("midi_index", null);
		RSWRPCHR var27 = new RSWRPCHR(var26);
		int var28 = var26.length;
		field973 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field973[var29] = var27.method388();
		}

		field989 = arg1;
		field999 = true;
		field989.method54(this, 2);
	}

	public final void run() {
		try {
			while (field999) {
				field982++;
				byte var1 = 20;
				if (field994 == 0 && field989.field333[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field996 = true;
				for (int var2 = 0; var2 < 100 && field996; var2++) {
					field996 = false;
					method362();
					method369();

					if (field980 == 0 && var2 >= 5) {
						break;
					}

					method363();

					if (field984 != null) {
						method371();
					}
				}

				boolean var3 = false;
				for (ACXEOGCN var4 = (ACXEOGCN) field987.method206(); var4 != null; var4 = (ACXEOGCN) field987.method208()) {
					if (var4.field10) {
						var3 = true;
						var4.field11++;
						if (var4.field11 > 50) {
							var4.field11 = 0;
							method356(var4);
						}
					}
				}

				if (!var3) {
					for (ACXEOGCN var5 = (ACXEOGCN) field987.method206(); var5 != null; var5 = (ACXEOGCN) field987.method208()) {
						var3 = true;
						var5.field11++;
						if (var5.field11 > 50) {
							var5.field11 = 0;
							method356(var5);
						}
					}
				}

				if (var3) {
					field970++;
					if (field970 > 750) {
						try {
							field972.close();
						} catch (Exception var8) {
						}

						field972 = null;
						field984 = null;
						field986 = null;
						field992 = 0;
					}
				} else {
					field970 = 0;
					field968 = "";
				}

				if (field989.field240 && field972 != null && field986 != null && (field994 > 0 || field989.field333[0] == null)) {
					field966++;
					if (field966 > 500) {
						field966 = 0;
						field995[0] = 0;
						field995[1] = 0;
						field995[2] = 0;
						field995[3] = 10;
						try {
							field986.write(field995, 0, 4);
						} catch (IOException var7) {
							field970 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("QJAHKUCY.a(I)V")
	public final void method177(int arg0) {
		method370(0, arg0);
	}

	@ObfuscatedName("QJAHKUCY.a(IB)Z")
	public final boolean method358(int arg0) {
		for (int var2 = 0; var2 < field977.length; var2++) {
			if (field1004[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("QJAHKUCY.c(I)V")
	public final void method359() {
		synchronized (field969) {
			field969.method210();
		}
	}

	@ObfuscatedName("QJAHKUCY.a(II)I")
	public final int method360(int arg0) {
		return field974[arg0].length;
	}

	@ObfuscatedName("QJAHKUCY.a(IIBI)V")
	public final void method361(int arg0, byte arg1, int arg2) {
		if (field989.field333[0] != null && field974[arg2][arg0] != 0) {
			byte[] var4 = field989.field333[arg2 + 1].method593(arg0);
			if (!method374(var4, field971[arg2][arg0], field974[arg2][arg0])) {
				field998[arg2][arg0] = arg1;

				if (arg1 > field994) {
					field994 = arg1;
				}

				field1002++;
			}
		}
	}

	@ObfuscatedName("QJAHKUCY.d(I)V")
	public final void method362() {
		ACXEOGCN var2;
		synchronized (field1003) {
			var2 = (ACXEOGCN) field1003.method205();
		}

		while (var2 != null) {
			field996 = true;
			byte[] var3 = null;
			if (field989.field333[0] != null) {
				var3 = field989.field333[var2.field9 + 1].method593(var2.field8);
			}

			if (!method374(var3, field971[var2.field9][var2.field8], field974[var2.field9][var2.field8])) {
				var3 = null;
			}

			synchronized (field1003) {
				if (var3 == null) {
					field983.method203(var2);
				} else {
					var2.field12 = var3;

					synchronized (field976) {
						field976.method203(var2);
					}
				}

				var2 = (ACXEOGCN) field1003.method205();
			}
		}
	}

	@ObfuscatedName("QJAHKUCY.a(B)V")
	public final void method363() {
		while (field980 == 0) {
			if (field981 >= 10 || field994 == 0) {
				return;
			}

			ACXEOGCN var2;
			synchronized (field969) {
				var2 = (ACXEOGCN) field969.method205();
			}

			while (var2 != null) {
				if (field998[var2.field9][var2.field8] != 0) {
					field998[var2.field9][var2.field8] = 0;
					field987.method203(var2);
					method356(var2);
					field996 = true;

					if (field993 < field1002) {
						field993++;
					}

					field968 = "Loading extra files - " + field993 * 100 / field1002 + "%";
					field981++;
					if (field981 == 10) {
						return;
					}
				}

				synchronized (field969) {
					var2 = (ACXEOGCN) field969.method205();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field998[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field994) {
						var5[var7] = 0;
						ACXEOGCN var8 = new ACXEOGCN();
						var8.field9 = var4;
						var8.field8 = var7;
						var8.field10 = false;
						field987.method203(var8);
						method356(var8);
						field996 = true;

						if (field993 < field1002) {
							field993++;
						}

						field968 = "Loading extra files - " + field993 * 100 / field1002 + "%";
						field981++;
						if (field981 == 10) {
							return;
						}
					}
				}
			}

			field994--;
		}
	}

	@ObfuscatedName("QJAHKUCY.a(BI)I")
	public final int method364(int arg0) {
		return field975[arg0] & 0xFF;
	}

	@ObfuscatedName("QJAHKUCY.b(IIBI)I")
	public final int method365(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field977.length; var5++) {
			if (field977[var5] == var4) {
				if (arg1 == 0) {
					return field990[var5];
				}

				return field1004[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("QJAHKUCY.a()V")
	public final void method366() {
		field999 = false;
	}

	@ObfuscatedName("QJAHKUCY.b()I")
	public final int method367() {
		synchronized (field979) {
			return field979.method274();
		}
	}

	@ObfuscatedName("QJAHKUCY.c()LACXEOGCN;")
	public final ACXEOGCN method368() {
		ACXEOGCN var2;
		synchronized (field976) {
			var2 = (ACXEOGCN) field976.method205();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field979) {
			var2.method213();
		}

		if (var2.field12 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field12));
			while (true) {
				if (field978.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field978, var4, field978.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field12 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field12[var7] = field978[var7];
		}

		return var2;
	}

	@ObfuscatedName("QJAHKUCY.e(I)V")
	public final void method369() {
		field980 = 0;
		field981 = 0;
		for (ACXEOGCN var1 = (ACXEOGCN) field987.method206(); var1 != null; var1 = (ACXEOGCN) field987.method208()) {
			if (var1.field10) {
				field980++;
			} else {
				field981++;
			}
		}

		while (field980 < 10) {
			ACXEOGCN var2 = (ACXEOGCN) field983.method205();
			if (var2 == null) {
				break;
			}

			if (field998[var2.field9][var2.field8] != 0) {
				field993++;
			}

			field998[var2.field9][var2.field8] = 0;
			field987.method203(var2);
			field980++;
			method356(var2);
			field996 = true;
		}
	}

	@ObfuscatedName("QJAHKUCY.b(II)V")
	public final void method370(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field974.length && arg1 >= 0 && arg1 <= field974[arg0].length && field974[arg0][arg1] != 0) {
			synchronized (field979) {
				for (ACXEOGCN var4 = (ACXEOGCN) field979.method272(); var4 != null; var4 = (ACXEOGCN) field979.method273()) {
					if (var4.field9 == arg0 && var4.field8 == arg1) {
						return;
					}
				}

				ACXEOGCN var5 = new ACXEOGCN();
				var5.field9 = arg0;
				var5.field8 = arg1;
				var5.field10 = true;

				synchronized (field1003) {
					field1003.method203(var5);
				}

				field979.method270(var5);
			}
		}
	}

	@ObfuscatedName("QJAHKUCY.f(I)V")
	public final void method371() {
		try {
			int var1 = field984.available();
			if (field992 == 0 && var1 >= 6) {
				field996 = true;

				for (int var2 = 0; var2 < 6; var2 += field984.read(field995, var2, 6 - var2)) {
				}

				int var3 = field995[0] & 0xFF;
				int var4 = ((field995[1] & 0xFF) << 8) + (field995[2] & 0xFF);
				int var5 = ((field995[3] & 0xFF) << 8) + (field995[4] & 0xFF);
				int var6 = field995[5] & 0xFF;
				field967 = null;
				for (ACXEOGCN var7 = (ACXEOGCN) field987.method206(); var7 != null; var7 = (ACXEOGCN) field987.method208()) {
					if (var7.field9 == var3 && var7.field8 == var4) {
						field967 = var7;
					}

					if (field967 != null) {
						var7.field11 = 0;
					}
				}

				if (field967 != null) {
					field970 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field967.field12 = null;

						if (field967.field10) {
							synchronized (field976) {
								field976.method203(field967);
							}
						} else {
							field967.method20();
						}

						field967 = null;
					} else {
						if (field967.field12 == null && var6 == 0) {
							field967.field12 = new byte[var5];
						}

						if (field967.field12 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field991 = var6 * 500;
				field992 = 500;
				if (field992 > var5 - var6 * 500) {
					field992 = var5 - var6 * 500;
				}
			}

			if (field992 > 0 && var1 >= field992) {
				field996 = true;
				byte[] var9 = field995;
				int var10 = 0;
				if (field967 != null) {
					var9 = field967.field12;
					var10 = field991;
				}

				for (int var11 = 0; var11 < field992; var11 += field984.read(var9, var10 + var11, field992 - var11)) {
				}

				if (field992 + field991 >= var9.length && field967 != null) {
					if (field989.field333[0] != null) {
						field989.field333[field967.field9 + 1].method594(var9, var9.length, field967.field8);
					}

					if (!field967.field10 && field967.field9 == 3) {
						field967.field10 = true;
						field967.field9 = 93;
					}

					if (field967.field10) {
						synchronized (field976) {
							field976.method203(field967);
						}
					} else {
						field967.method20();
					}
				}

				field992 = 0;
			}
		} catch (IOException var17) {
			try {
				field972.close();
			} catch (Exception var14) {
			}

			field972 = null;
			field984 = null;
			field986 = null;
			field992 = 0;
		}
	}

	@ObfuscatedName("QJAHKUCY.b(BI)Z")
	public final boolean method372(int arg0) {
		if (field973[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("QJAHKUCY.a(III)V")
	public final void method373(int arg0, int arg1) {
		if (field989.field333[0] != null && (field974[arg1][arg0] != 0 && (field998[arg1][arg0] != 0 && field994 != 0))) {
			ACXEOGCN var3 = new ACXEOGCN();
			var3.field9 = arg1;
			var3.field8 = arg0;
			var3.field10 = false;

			synchronized (field969) {
				field969.method203(var3);
			}
		}
	}

	@ObfuscatedName("QJAHKUCY.a([BIII)Z")
	public final boolean method374(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field988.reset();
			field988.update(arg0, 0, var4);
			int var6 = (int) field988.getValue();

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
}
