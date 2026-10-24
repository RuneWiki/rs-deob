package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("NJYVZTLI")
public class NJYVZTLI extends MVRXIMMX implements Runnable {

	@ObfuscatedName("NJYVZTLI.c")
	public FYVRCFGT field886 = new FYVRCFGT();

	@ObfuscatedName("NJYVZTLI.h")
	public int[][] field890 = new int[4][];

	@ObfuscatedName("NJYVZTLI.i")
	public String field891 = "";

	@ObfuscatedName("NJYVZTLI.j")
	public CRC32 field892 = new CRC32();

	@ObfuscatedName("NJYVZTLI.n")
	public byte[] field896 = new byte[500];

	@ObfuscatedName("NJYVZTLI.o")
	public byte[][] field897 = new byte[4][];

	@ObfuscatedName("NJYVZTLI.r")
	public boolean field899 = false;

	@ObfuscatedName("NJYVZTLI.s")
	public FYVRCFGT field900 = new FYVRCFGT();

	@ObfuscatedName("NJYVZTLI.w")
	public int[][] field903 = new int[4][];

	@ObfuscatedName("NJYVZTLI.A")
	public FYVRCFGT field906 = new FYVRCFGT();

	@ObfuscatedName("NJYVZTLI.I")
	public byte[] field912 = new byte[65000];

	@ObfuscatedName("NJYVZTLI.J")
	public FYVRCFGT field913 = new FYVRCFGT();

	@ObfuscatedName("NJYVZTLI.K")
	public boolean field914 = true;

	@ObfuscatedName("NJYVZTLI.M")
	public BGTUCWCI field916 = new BGTUCWCI();

	@ObfuscatedName("NJYVZTLI.O")
	public FYVRCFGT field918 = new FYVRCFGT();

	@ObfuscatedName("NJYVZTLI.e")
	public int field888;

	@ObfuscatedName("NJYVZTLI.k")
	public int field893;

	@ObfuscatedName("NJYVZTLI.m")
	public int field895;

	@ObfuscatedName("NJYVZTLI.E")
	public int field908;

	@ObfuscatedName("NJYVZTLI.F")
	public int field909;

	@ObfuscatedName("NJYVZTLI.H")
	public int field911;

	@ObfuscatedName("NJYVZTLI.N")
	public int field917;

	@ObfuscatedName("NJYVZTLI.Q")
	public int field920;

	@ObfuscatedName("NJYVZTLI.R")
	public int field921;

	@ObfuscatedName("NJYVZTLI.S")
	public int field922;

	@ObfuscatedName("NJYVZTLI.T")
	public int field923;

	@ObfuscatedName("NJYVZTLI.G")
	public long field910;

	@ObfuscatedName("NJYVZTLI.l")
	public WIICVWRM field894;

	@ObfuscatedName("NJYVZTLI.C")
	public client field907;

	@ObfuscatedName("NJYVZTLI.P")
	public InputStream field919;

	@ObfuscatedName("NJYVZTLI.U")
	public OutputStream field924;

	@ObfuscatedName("NJYVZTLI.u")
	public Socket field902;

	@ObfuscatedName("NJYVZTLI.g")
	public byte[] field889;

	@ObfuscatedName("NJYVZTLI.d")
	public int[] field887;

	@ObfuscatedName("NJYVZTLI.q")
	public int[] field898;

	@ObfuscatedName("NJYVZTLI.t")
	public int[] field901;

	@ObfuscatedName("NJYVZTLI.y")
	public int[] field904;

	@ObfuscatedName("NJYVZTLI.z")
	public int[] field905;

	@ObfuscatedName("NJYVZTLI.L")
	public int[] field915;

	@ObfuscatedName("NJYVZTLI.a()I")
	public final int method305() {
		synchronized (field916) {
			return field916.method17();
		}
	}

	@ObfuscatedName("NJYVZTLI.a(II)V")
	public final void method306(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field890.length && arg1 >= 0 && arg1 <= field890[arg0].length && field890[arg0][arg1] != 0) {
			synchronized (field916) {
				for (WIICVWRM var4 = (WIICVWRM) field916.method15(); var4 != null; var4 = (WIICVWRM) field916.method16()) {
					if (var4.field1313 == arg0 && var4.field1312 == arg1) {
						return;
					}
				}

				WIICVWRM var5 = new WIICVWRM();
				var5.field1313 = arg0;
				var5.field1312 = arg1;
				var5.field1315 = true;

				synchronized (field906) {
					field906.method197(var5);
				}

				field916.method13(var5);
			}
		}
	}

	@ObfuscatedName("NJYVZTLI.b(II)I")
	public final int method307(int arg0) {
		return field889[arg0] & 0xFF;
	}

	@ObfuscatedName("NJYVZTLI.a(B)V")
	public final void method308() {
		try {
			int var1 = field919.available();
			if (field921 == 0 && var1 >= 6) {
				field899 = true;

				for (int var2 = 0; var2 < 6; var2 += field919.read(field896, var2, 6 - var2)) {
				}

				int var3 = field896[0] & 0xFF;
				int var4 = ((field896[1] & 0xFF) << 8) + (field896[2] & 0xFF);
				int var5 = ((field896[3] & 0xFF) << 8) + (field896[4] & 0xFF);
				int var6 = field896[5] & 0xFF;
				field894 = null;
				for (WIICVWRM var7 = (WIICVWRM) field886.method200(); var7 != null; var7 = (WIICVWRM) field886.method202()) {
					if (var7.field1313 == var3 && var7.field1312 == var4) {
						field894 = var7;
					}

					if (field894 != null) {
						var7.field1314 = 0;
					}
				}

				if (field894 != null) {
					field888 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field894.field1311 = null;

						if (field894.field1315) {
							synchronized (field918) {
								field918.method197(field894);
							}
						} else {
							field894.method326();
						}

						field894 = null;
					} else {
						if (field894.field1311 == null && var6 == 0) {
							field894.field1311 = new byte[var5];
						}

						if (field894.field1311 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field920 = var6 * 500;
				field921 = 500;
				if (field921 > var5 - var6 * 500) {
					field921 = var5 - var6 * 500;
				}
			}

			if (field921 > 0 && var1 >= field921) {
				field899 = true;
				byte[] var9 = field896;
				int var10 = 0;
				if (field894 != null) {
					var9 = field894.field1311;
					var10 = field920;
				}

				for (int var11 = 0; var11 < field921; var11 += field919.read(var9, var10 + var11, field921 - var11)) {
				}

				if (field921 + field920 >= var9.length && field894 != null) {
					if (field907.field159[0] != null) {
						field907.field159[field894.field1313 + 1].method2(var9, field894.field1312, var9.length);
					}

					if (!field894.field1315 && field894.field1313 == 3) {
						field894.field1315 = true;
						field894.field1313 = 93;
					}

					if (field894.field1315) {
						synchronized (field918) {
							field918.method197(field894);
						}
					} else {
						field894.method326();
					}
				}

				field921 = 0;
			}
		} catch (IOException var17) {
			try {
				field902.close();
			} catch (Exception var14) {
			}

			field902 = null;
			field919 = null;
			field924 = null;
			field921 = 0;
		}
	}

	@ObfuscatedName("NJYVZTLI.a(LWIICVWRM;B)V")
	public final void method309(WIICVWRM arg0) {
		try {
			if (field902 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field910 < 4000L) {
					return;
				}

				field910 = var2;
				field902 = field907.method22(client.field167 + 43594);
				field919 = field902.getInputStream();
				field924 = field902.getOutputStream();
				field924.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field919.read();
				}

				field888 = 0;
			}

			field896[0] = (byte) arg0.field1313;
			field896[1] = (byte) (arg0.field1312 >> 8);
			field896[2] = (byte) arg0.field1312;
			if (arg0.field1315) {
				field896[3] = 2;
			} else if (field907.field313) {
				field896[3] = 0;
			} else {
				field896[3] = 1;
			}

			field924.write(field896, 0, 4);
			field908 = 0;
			field893 = -10000;
		} catch (IOException var7) {
			try {
				field902.close();
			} catch (Exception var6) {
			}

			field902 = null;
			field919 = null;
			field924 = null;
			field921 = 0;
			field893++;
		}
	}

	@ObfuscatedName("NJYVZTLI.a(IIII)I")
	public final int method310(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg1;
		for (int var5 = 0; var5 < field904.length; var5++) {
			if (field904[var5] == var4) {
				if (arg0 == 0) {
					return field898[var5];
				}

				return field887[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("NJYVZTLI.c(II)Z")
	public final boolean method311(int arg0) {
		if (field905[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("NJYVZTLI.d(II)Z")
	public final boolean method312(int arg0) {
		for (int var2 = 0; var2 < field904.length; var2++) {
			if (field887[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("NJYVZTLI.b(B)V")
	public final void method313() {
		while (field922 == 0) {
			if (field923 >= 10 || field911 == 0) {
				return;
			}

			WIICVWRM var2;
			synchronized (field913) {
				var2 = (WIICVWRM) field913.method199();
			}

			while (var2 != null) {
				if (field897[var2.field1313][var2.field1312] != 0) {
					field897[var2.field1313][var2.field1312] = 0;
					field886.method197(var2);
					method309(var2);
					field899 = true;

					if (field917 < field895) {
						field917++;
					}

					field891 = "Loading extra files - " + field917 * 100 / field895 + "%";
					field923++;
					if (field923 == 10) {
						return;
					}
				}

				synchronized (field913) {
					var2 = (WIICVWRM) field913.method199();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field897[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field911) {
						var5[var7] = 0;
						WIICVWRM var8 = new WIICVWRM();
						var8.field1313 = var4;
						var8.field1312 = var7;
						var8.field1315 = false;
						field886.method197(var8);
						method309(var8);
						field899 = true;

						if (field917 < field895) {
							field917++;
						}

						field891 = "Loading extra files - " + field917 * 100 / field895 + "%";
						field923++;
						if (field923 == 10) {
							return;
						}
					}
				}
			}

			field911--;
		}
	}

	@ObfuscatedName("NJYVZTLI.b()V")
	public final void method314() {
		field914 = false;
	}

	@ObfuscatedName("NJYVZTLI.c(B)I")
	public final int method315() {
		return field901.length;
	}

	@ObfuscatedName("NJYVZTLI.a(LRSPRYUFS;Lclient;)V")
	public final void method316(RSPRYUFS arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method427(var3[var4], null);
			int var6 = var5.length / 2;
			NQUAUMDT var7 = new NQUAUMDT(var5);
			field890[var4] = new int[var6];
			field897[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field890[var4][var8] = var7.method341();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method427(var9[var10], null);
			int var12 = var11.length / 4;
			NQUAUMDT var13 = new NQUAUMDT(var11);
			field903[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field903[var10][var14] = var13.method344();
			}
		}

		byte[] var15 = arg0.method427("model_index", null);
		int var16 = field890[0].length;
		field889 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field889[var17] = var15[var17];
			} else {
				field889[var17] = 0;
			}
		}

		byte[] var18 = arg0.method427("map_index", null);
		NQUAUMDT var19 = new NQUAUMDT(var18);
		int var20 = var18.length / 7;
		field904 = new int[var20];
		field898 = new int[var20];
		field887 = new int[var20];
		field915 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field904[var21] = var19.method341();
			field898[var21] = var19.method341();
			field887[var21] = var19.method341();
			field915[var21] = var19.method339();
		}

		byte[] var22 = arg0.method427("anim_index", null);
		NQUAUMDT var23 = new NQUAUMDT(var22);
		int var24 = var22.length / 2;
		field901 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field901[var25] = var23.method341();
		}

		byte[] var26 = arg0.method427("midi_index", null);
		NQUAUMDT var27 = new NQUAUMDT(var26);
		int var28 = var26.length;
		field905 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field905[var29] = var27.method339();
		}

		field907 = arg1;
		field914 = true;
		field907.method142(this, 2);
	}

	@ObfuscatedName("NJYVZTLI.a(I[BIB)Z")
	public final boolean method317(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field892.reset();
			field892.update(arg1, 0, var4);
			int var6 = (int) field892.getValue();

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

	@ObfuscatedName("NJYVZTLI.a(Z)V")
	public final void method318() {
		field922 = 0;
		field923 = 0;
		for (WIICVWRM var1 = (WIICVWRM) field886.method200(); var1 != null; var1 = (WIICVWRM) field886.method202()) {
			if (var1.field1315) {
				field922++;
			} else {
				field923++;
			}
		}

		while (field922 < 10) {
			WIICVWRM var2 = (WIICVWRM) field900.method199();
			if (var2 == null) {
				break;
			}

			if (field897[var2.field1313][var2.field1312] != 0) {
				field917++;
			}

			field897[var2.field1313][var2.field1312] = 0;
			field886.method197(var2);
			field922++;
			method309(var2);
			field899 = true;
		}
	}

	@ObfuscatedName("NJYVZTLI.b(I)V")
	public final void method319() {
		synchronized (field913) {
			field913.method204();
		}
	}

	@ObfuscatedName("NJYVZTLI.a(ZZ)V")
	public final void method320(boolean arg0) {
		int var2 = field904.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field915[var3] != 0) {
				method322(3, (byte) 2, field887[var3]);
				method322(3, (byte) 2, field898[var3]);
			}
		}
	}

	@ObfuscatedName("NJYVZTLI.c()LWIICVWRM;")
	public final WIICVWRM method321() {
		WIICVWRM var2;
		synchronized (field918) {
			var2 = (WIICVWRM) field918.method199();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field916) {
			var2.method456();
		}

		if (var2.field1311 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1311));
			while (true) {
				if (field912.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field912, var4, field912.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1311 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1311[var7] = field912[var7];
		}

		return var2;
	}

	@ObfuscatedName("NJYVZTLI.a(I)V")
	public final void method266(int arg0) {
		method306(0, arg0);
	}

	@ObfuscatedName("NJYVZTLI.a(IBBI)V")
	public final void method322(int arg0, byte arg1, int arg2) {
		if (field907.field159[0] != null && field890[arg0][arg2] != 0) {
			byte[] var4 = field907.field159[arg0 + 1].method1(arg2);
			if (!method317(field903[arg0][arg2], var4, field890[arg0][arg2])) {
				field897[arg0][arg2] = arg1;

				if (arg1 > field911) {
					field911 = arg1;
				}

				field895++;
			}
		}
	}

	@ObfuscatedName("NJYVZTLI.b(Z)V")
	public final void method323() {
		WIICVWRM var2;
		synchronized (field906) {
			var2 = (WIICVWRM) field906.method199();
		}

		while (var2 != null) {
			field899 = true;
			byte[] var3 = null;
			if (field907.field159[0] != null) {
				var3 = field907.field159[var2.field1313 + 1].method1(var2.field1312);
			}

			if (!method317(field903[var2.field1313][var2.field1312], var3, field890[var2.field1313][var2.field1312])) {
				var3 = null;
			}

			synchronized (field906) {
				if (var3 == null) {
					field900.method197(var2);
				} else {
					var2.field1311 = var3;

					synchronized (field918) {
						field918.method197(var2);
					}
				}

				var2 = (WIICVWRM) field906.method199();
			}
		}
	}

	@ObfuscatedName("NJYVZTLI.a(III)V")
	public final void method324(int arg0, int arg1) {
		if (field907.field159[0] != null && (field890[arg1][arg0] != 0 && (field897[arg1][arg0] != 0 && field911 != 0))) {
			WIICVWRM var3 = new WIICVWRM();
			var3.field1313 = arg1;
			var3.field1312 = arg0;
			var3.field1315 = false;

			synchronized (field913) {
				field913.method197(var3);
			}
		}
	}

	@ObfuscatedName("NJYVZTLI.e(II)I")
	public final int method325(int arg0) {
		return field890[arg0].length;
	}

	public final void run() {
		try {
			while (field914) {
				field909++;
				byte var1 = 20;
				if (field911 == 0 && field907.field159[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field899 = true;
				for (int var2 = 0; var2 < 100 && field899; var2++) {
					field899 = false;
					method323();
					method318();

					if (field922 == 0 && var2 >= 5) {
						break;
					}

					method313();

					if (field919 != null) {
						method308();
					}
				}

				boolean var3 = false;
				for (WIICVWRM var4 = (WIICVWRM) field886.method200(); var4 != null; var4 = (WIICVWRM) field886.method202()) {
					if (var4.field1315) {
						var3 = true;
						var4.field1314++;
						if (var4.field1314 > 50) {
							var4.field1314 = 0;
							method309(var4);
						}
					}
				}

				if (!var3) {
					for (WIICVWRM var5 = (WIICVWRM) field886.method200(); var5 != null; var5 = (WIICVWRM) field886.method202()) {
						var3 = true;
						var5.field1314++;
						if (var5.field1314 > 50) {
							var5.field1314 = 0;
							method309(var5);
						}
					}
				}

				if (var3) {
					field888++;
					if (field888 > 750) {
						try {
							field902.close();
						} catch (Exception var8) {
						}

						field902 = null;
						field919 = null;
						field924 = null;
						field921 = 0;
					}
				} else {
					field888 = 0;
					field891 = "";
				}

				if (field907.field313 && field902 != null && field924 != null && (field911 > 0 || field907.field159[0] == null)) {
					field908++;
					if (field908 > 500) {
						field908 = 0;
						field896[0] = 0;
						field896[1] = 0;
						field896[2] = 0;
						field896[3] = 10;
						try {
							field924.write(field896, 0, 4);
						} catch (IOException var7) {
							field888 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}
}
