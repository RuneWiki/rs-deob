package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("NTGEPOMK")
public class NTGEPOMK extends KHBPQVBK implements Runnable {

	@ObfuscatedName("NTGEPOMK.h")
	public int[][] field1018 = new int[4][];

	@ObfuscatedName("NTGEPOMK.j")
	public byte[][] field1020 = new byte[4][];

	@ObfuscatedName("NTGEPOMK.l")
	public String field1022 = "";

	@ObfuscatedName("NTGEPOMK.m")
	public CEEJCAVA field1023 = new CEEJCAVA();

	@ObfuscatedName("NTGEPOMK.o")
	public boolean field1024 = true;

	@ObfuscatedName("NTGEPOMK.p")
	public byte[] field1025 = new byte[500];

	@ObfuscatedName("NTGEPOMK.s")
	public CEEJCAVA field1028 = new CEEJCAVA();

	@ObfuscatedName("NTGEPOMK.x")
	public CEEJCAVA field1032 = new CEEJCAVA();

	@ObfuscatedName("NTGEPOMK.y")
	public CEEJCAVA field1033 = new CEEJCAVA();

	@ObfuscatedName("NTGEPOMK.F")
	public CEEJCAVA field1040 = new CEEJCAVA();

	@ObfuscatedName("NTGEPOMK.J")
	public LIHZBJAU field1044 = new LIHZBJAU();

	@ObfuscatedName("NTGEPOMK.K")
	public int[][] field1045 = new int[4][];

	@ObfuscatedName("NTGEPOMK.L")
	public boolean field1046 = false;

	@ObfuscatedName("NTGEPOMK.O")
	public byte[] field1048 = new byte[65000];

	@ObfuscatedName("NTGEPOMK.P")
	public CRC32 field1049 = new CRC32();

	@ObfuscatedName("NTGEPOMK.d")
	public int field1014;

	@ObfuscatedName("NTGEPOMK.e")
	public int field1015;

	@ObfuscatedName("NTGEPOMK.t")
	public int field1029;

	@ObfuscatedName("NTGEPOMK.u")
	public int field1030;

	@ObfuscatedName("NTGEPOMK.v")
	public int field1031;

	@ObfuscatedName("NTGEPOMK.A")
	public int field1035;

	@ObfuscatedName("NTGEPOMK.B")
	public int field1036;

	@ObfuscatedName("NTGEPOMK.D")
	public int field1038;

	@ObfuscatedName("NTGEPOMK.E")
	public int field1039;

	@ObfuscatedName("NTGEPOMK.G")
	public int field1041;

	@ObfuscatedName("NTGEPOMK.Q")
	public int field1050;

	@ObfuscatedName("NTGEPOMK.c")
	public long field1013;

	@ObfuscatedName("NTGEPOMK.C")
	public HEWLXUXO field1037;

	@ObfuscatedName("NTGEPOMK.i")
	public client field1019;

	@ObfuscatedName("NTGEPOMK.I")
	public InputStream field1043;

	@ObfuscatedName("NTGEPOMK.q")
	public OutputStream field1026;

	@ObfuscatedName("NTGEPOMK.k")
	public Socket field1021;

	@ObfuscatedName("NTGEPOMK.H")
	public byte[] field1042;

	@ObfuscatedName("NTGEPOMK.a")
	public int[] field1012;

	@ObfuscatedName("NTGEPOMK.f")
	public int[] field1016;

	@ObfuscatedName("NTGEPOMK.g")
	public int[] field1017;

	@ObfuscatedName("NTGEPOMK.r")
	public int[] field1027;

	@ObfuscatedName("NTGEPOMK.z")
	public int[] field1034;

	@ObfuscatedName("NTGEPOMK.N")
	public int[] field1047;

	@ObfuscatedName("NTGEPOMK.a()V")
	public final void method333() {
		field1024 = false;
	}

	@ObfuscatedName("NTGEPOMK.a(Z)V")
	public final void method334() {
		field1038 = 0;
		field1039 = 0;
		for (HEWLXUXO var1 = (HEWLXUXO) field1032.method33(); var1 != null; var1 = (HEWLXUXO) field1032.method35()) {
			if (var1.field650) {
				field1038++;
			} else {
				field1039++;
			}
		}

		while (field1038 < 10) {
			HEWLXUXO var2 = (HEWLXUXO) field1023.method32();
			if (var2 == null) {
				break;
			}

			if (field1020[var2.field647][var2.field648] != 0) {
				field1036++;
			}

			field1020[var2.field647][var2.field648] = 0;
			field1032.method30(var2);
			field1038++;
			method350(var2);
			field1046 = true;
		}
	}

	@ObfuscatedName("NTGEPOMK.a(I)V")
	public final void method242(int arg0) {
		method337(0, arg0);
	}

	@ObfuscatedName("NTGEPOMK.b(I)V")
	public final void method335() {
		HEWLXUXO var2;
		synchronized (field1040) {
			var2 = (HEWLXUXO) field1040.method32();
		}

		while (var2 != null) {
			field1046 = true;
			byte[] var3 = null;
			if (field1019.field258[0] != null) {
				var3 = field1019.field258[var2.field647 + 1].method219(var2.field648);
			}

			if (!method351(field1045[var2.field647][var2.field648], var3, field1018[var2.field647][var2.field648])) {
				var3 = null;
			}

			synchronized (field1040) {
				if (var3 == null) {
					field1023.method30(var2);
				} else {
					var2.field651 = var3;

					synchronized (field1033) {
						field1033.method30(var2);
					}
				}

				var2 = (HEWLXUXO) field1040.method32();
			}
		}
	}

	@ObfuscatedName("NTGEPOMK.a(ZI)V")
	public final void method336(boolean arg0) {
		int var2 = field1027.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1047[var3] != 0) {
				method345(3, (byte) 2, field1016[var3]);
				method345(3, (byte) 2, field1012[var3]);
			}
		}
	}

	@ObfuscatedName("NTGEPOMK.a(II)V")
	public final void method337(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1045.length && arg1 >= 0 && arg1 <= field1045[arg0].length && field1045[arg0][arg1] != 0) {
			synchronized (field1044) {
				for (HEWLXUXO var4 = (HEWLXUXO) field1044.method267(); var4 != null; var4 = (HEWLXUXO) field1044.method268()) {
					if (var4.field647 == arg0 && var4.field648 == arg1) {
						return;
					}
				}

				HEWLXUXO var5 = new HEWLXUXO();
				var5.field647 = arg0;
				var5.field648 = arg1;
				var5.field650 = true;

				synchronized (field1040) {
					field1040.method30(var5);
				}

				field1044.method265(var5);
			}
		}
	}

	@ObfuscatedName("NTGEPOMK.a(ZII)V")
	public final void method338(int arg0, int arg1) {
		if (field1019.field258[0] != null && (field1045[arg1][arg0] != 0 && (field1020[arg1][arg0] != 0 && field1015 != 0))) {
			HEWLXUXO var3 = new HEWLXUXO();
			var3.field647 = arg1;
			var3.field648 = arg0;
			var3.field650 = false;

			synchronized (field1028) {
				field1028.method30(var3);
			}
		}
	}

	@ObfuscatedName("NTGEPOMK.b()I")
	public final int method339() {
		synchronized (field1044) {
			return field1044.method269();
		}
	}

	@ObfuscatedName("NTGEPOMK.a(IZ)Z")
	public final boolean method340(int arg0) {
		if (field1017[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("NTGEPOMK.a(B)I")
	public final int method341() {
		return field1034.length;
	}

	@ObfuscatedName("NTGEPOMK.a(LESUFCMYV;Lclient;)V")
	public final void method342(ESUFCMYV arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method205(var3[var4], null);
			int var6 = var5.length / 2;
			RGCGKKUR var7 = new RGCGKKUR(var5);
			field1045[var4] = new int[var6];
			field1020[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1045[var4][var8] = var7.method457();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method205(var9[var10], null);
			int var12 = var11.length / 4;
			RGCGKKUR var13 = new RGCGKKUR(var11);
			field1018[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1018[var10][var14] = var13.method460();
			}
		}

		byte[] var15 = arg0.method205("model_index", null);
		int var16 = field1045[0].length;
		field1042 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1042[var17] = var15[var17];
			} else {
				field1042[var17] = 0;
			}
		}

		byte[] var18 = arg0.method205("map_index", null);
		RGCGKKUR var19 = new RGCGKKUR(var18);
		int var20 = var18.length / 7;
		field1027 = new int[var20];
		field1012 = new int[var20];
		field1016 = new int[var20];
		field1047 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1027[var21] = var19.method457();
			field1012[var21] = var19.method457();
			field1016[var21] = var19.method457();
			field1047[var21] = var19.method455();
		}

		byte[] var22 = arg0.method205("anim_index", null);
		RGCGKKUR var23 = new RGCGKKUR(var22);
		int var24 = var22.length / 2;
		field1034 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1034[var25] = var23.method457();
		}

		byte[] var26 = arg0.method205("midi_index", null);
		RGCGKKUR var27 = new RGCGKKUR(var26);
		int var28 = var26.length;
		field1017 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1017[var29] = var27.method455();
		}

		field1019 = arg1;
		field1024 = true;
		field1019.method123(this, 2);
	}

	@ObfuscatedName("NTGEPOMK.b(B)V")
	public final void method343() {
		synchronized (field1028) {
			field1028.method37();
		}
	}

	@ObfuscatedName("NTGEPOMK.b(Z)V")
	public final void method344() {
		while (field1038 == 0) {
			if (field1039 >= 10 || field1015 == 0) {
				return;
			}

			HEWLXUXO var2;
			synchronized (field1028) {
				var2 = (HEWLXUXO) field1028.method32();
			}

			while (var2 != null) {
				if (field1020[var2.field647][var2.field648] != 0) {
					field1020[var2.field647][var2.field648] = 0;
					field1032.method30(var2);
					method350(var2);
					field1046 = true;

					if (field1036 < field1031) {
						field1036++;
					}

					field1022 = "Loading extra files - " + field1036 * 100 / field1031 + "%";
					field1039++;
					if (field1039 == 10) {
						return;
					}
				}

				synchronized (field1028) {
					var2 = (HEWLXUXO) field1028.method32();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1020[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1015) {
						var5[var7] = 0;
						HEWLXUXO var8 = new HEWLXUXO();
						var8.field647 = var4;
						var8.field648 = var7;
						var8.field650 = false;
						field1032.method30(var8);
						method350(var8);
						field1046 = true;

						if (field1036 < field1031) {
							field1036++;
						}

						field1022 = "Loading extra files - " + field1036 * 100 / field1031 + "%";
						field1039++;
						if (field1039 == 10) {
							return;
						}
					}
				}
			}

			field1015--;
		}
	}

	@ObfuscatedName("NTGEPOMK.a(IBII)V")
	public final void method345(int arg0, byte arg1, int arg2) {
		if (field1019.field258[0] != null && field1045[arg0][arg2] != 0) {
			byte[] var4 = field1019.field258[arg0 + 1].method219(arg2);
			if (!method351(field1045[arg0][arg2], var4, field1018[arg0][arg2])) {
				field1020[arg0][arg2] = arg1;

				if (arg1 > field1015) {
					field1015 = arg1;
				}

				field1031++;
			}
		}
	}

	@ObfuscatedName("NTGEPOMK.c(I)V")
	public final void method346() {
		try {
			int var1 = field1043.available();
			if (field1030 == 0 && var1 >= 6) {
				field1046 = true;

				for (int var2 = 0; var2 < 6; var2 += field1043.read(field1025, var2, 6 - var2)) {
				}

				int var3 = field1025[0] & 0xFF;
				int var4 = ((field1025[1] & 0xFF) << 8) + (field1025[2] & 0xFF);
				int var5 = ((field1025[3] & 0xFF) << 8) + (field1025[4] & 0xFF);
				int var6 = field1025[5] & 0xFF;
				field1037 = null;
				for (HEWLXUXO var7 = (HEWLXUXO) field1032.method33(); var7 != null; var7 = (HEWLXUXO) field1032.method35()) {
					if (var7.field647 == var3 && var7.field648 == var4) {
						field1037 = var7;
					}

					if (field1037 != null) {
						var7.field649 = 0;
					}
				}

				if (field1037 != null) {
					field1035 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1037.field651 = null;

						if (field1037.field650) {
							synchronized (field1033) {
								field1033.method30(field1037);
							}
						} else {
							field1037.method505();
						}

						field1037 = null;
					} else {
						if (field1037.field651 == null && var6 == 0) {
							field1037.field651 = new byte[var5];
						}

						if (field1037.field651 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1029 = var6 * 500;
				field1030 = 500;
				if (field1030 > var5 - var6 * 500) {
					field1030 = var5 - var6 * 500;
				}
			}

			if (field1030 > 0 && var1 >= field1030) {
				field1046 = true;
				byte[] var9 = field1025;
				int var10 = 0;
				if (field1037 != null) {
					var9 = field1037.field651;
					var10 = field1029;
				}

				for (int var11 = 0; var11 < field1030; var11 += field1043.read(var9, var10 + var11, field1030 - var11)) {
				}

				if (field1030 + field1029 >= var9.length && field1037 != null) {
					if (field1019.field258[0] != null) {
						field1019.field258[field1037.field647 + 1].method220(var9.length, field1037.field648, var9);
					}

					if (!field1037.field650 && field1037.field647 == 3) {
						field1037.field650 = true;
						field1037.field647 = 93;
					}

					if (field1037.field650) {
						synchronized (field1033) {
							field1033.method30(field1037);
						}
					} else {
						field1037.method505();
					}
				}

				field1030 = 0;
			}
		} catch (IOException var17) {
			try {
				field1021.close();
			} catch (Exception var14) {
			}

			field1021 = null;
			field1043 = null;
			field1026 = null;
			field1030 = 0;
		}
	}

	@ObfuscatedName("NTGEPOMK.c()LHEWLXUXO;")
	public final HEWLXUXO method347() {
		HEWLXUXO var2;
		synchronized (field1033) {
			var2 = (HEWLXUXO) field1033.method32();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1044) {
			var2.method423();
		}

		if (var2.field651 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field651));
			while (true) {
				if (field1048.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1048, var4, field1048.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field651 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field651[var7] = field1048[var7];
		}

		return var2;
	}

	@ObfuscatedName("NTGEPOMK.b(IZ)I")
	public final int method348(int arg0) {
		return field1045[arg0].length;
	}

	public final void run() {
		try {
			while (field1024) {
				field1041++;
				byte var1 = 20;
				if (field1015 == 0 && field1019.field258[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1046 = true;
				for (int var2 = 0; var2 < 100 && field1046; var2++) {
					field1046 = false;
					method335();
					method334();

					if (field1038 == 0 && var2 >= 5) {
						break;
					}

					method344();

					if (field1043 != null) {
						method346();
					}
				}

				boolean var3 = false;
				for (HEWLXUXO var4 = (HEWLXUXO) field1032.method33(); var4 != null; var4 = (HEWLXUXO) field1032.method35()) {
					if (var4.field650) {
						var3 = true;
						var4.field649++;
						if (var4.field649 > 50) {
							var4.field649 = 0;
							method350(var4);
						}
					}
				}

				if (!var3) {
					for (HEWLXUXO var5 = (HEWLXUXO) field1032.method33(); var5 != null; var5 = (HEWLXUXO) field1032.method35()) {
						var3 = true;
						var5.field649++;
						if (var5.field649 > 50) {
							var5.field649 = 0;
							method350(var5);
						}
					}
				}

				if (var3) {
					field1035++;
					if (field1035 > 750) {
						try {
							field1021.close();
						} catch (Exception var8) {
						}

						field1021 = null;
						field1043 = null;
						field1026 = null;
						field1030 = 0;
					}
				} else {
					field1035 = 0;
					field1022 = "";
				}

				if (field1019.field162 && field1021 != null && field1026 != null && (field1015 > 0 || field1019.field258[0] == null)) {
					field1050++;
					if (field1050 > 500) {
						field1050 = 0;
						field1025[0] = 0;
						field1025[1] = 0;
						field1025[2] = 0;
						field1025[3] = 10;
						try {
							field1026.write(field1025, 0, 4);
						} catch (IOException var7) {
							field1035 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("NTGEPOMK.a(IB)Z")
	public final boolean method349(int arg0) {
		for (int var2 = 0; var2 < field1027.length; var2++) {
			if (field1016[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("NTGEPOMK.a(LHEWLXUXO;I)V")
	public final void method350(HEWLXUXO arg0) {
		try {
			if (field1021 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1013 < 4000L) {
					return;
				}

				field1013 = var2;
				field1021 = field1019.method38(client.field243 + 43594);
				field1043 = field1021.getInputStream();
				field1026 = field1021.getOutputStream();
				field1026.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1043.read();
				}

				field1035 = 0;
			}

			field1025[0] = (byte) arg0.field647;
			field1025[1] = (byte) (arg0.field648 >> 8);
			field1025[2] = (byte) arg0.field648;
			if (arg0.field650) {
				field1025[3] = 2;
			} else if (field1019.field162) {
				field1025[3] = 0;
			} else {
				field1025[3] = 1;
			}

			field1026.write(field1025, 0, 4);
			field1050 = 0;
			field1014 = -10000;
		} catch (IOException var7) {
			try {
				field1021.close();
			} catch (Exception var6) {
			}

			field1021 = null;
			field1043 = null;
			field1026 = null;
			field1030 = 0;
			field1014++;
		}
	}

	@ObfuscatedName("NTGEPOMK.a(II[BI)Z")
	public final boolean method351(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field1049.reset();
			field1049.update(arg1, 0, var4);
			int var6 = (int) field1049.getValue();

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

	@ObfuscatedName("NTGEPOMK.a(IIII)I")
	public final int method352(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < field1027.length; var5++) {
			if (field1027[var5] == var4) {
				if (arg2 == 0) {
					return field1012[var5];
				}

				return field1016[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("NTGEPOMK.b(ZI)I")
	public final int method353(int arg0) {
		return field1042[arg0] & 0xFF;
	}
}
