package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("UUFZOKXH")
public class UUFZOKXH extends PPNFFXQR implements Runnable {

	@ObfuscatedName("UUFZOKXH.a")
	public boolean field1151 = true;

	@ObfuscatedName("UUFZOKXH.b")
	public byte[][] field1152 = new byte[4][];

	@ObfuscatedName("UUFZOKXH.g")
	public boolean field1156 = false;

	@ObfuscatedName("UUFZOKXH.k")
	public CRC32 field1158 = new CRC32();

	@ObfuscatedName("UUFZOKXH.l")
	public YLURZVWU field1159 = new YLURZVWU();

	@ObfuscatedName("UUFZOKXH.n")
	public String field1161 = "";

	@ObfuscatedName("UUFZOKXH.q")
	public YLURZVWU field1164 = new YLURZVWU();

	@ObfuscatedName("UUFZOKXH.v")
	public byte[] field1169 = new byte[500];

	@ObfuscatedName("UUFZOKXH.C")
	public XWKFKQRL field1175 = new XWKFKQRL();

	@ObfuscatedName("UUFZOKXH.F")
	public int[][] field1178 = new int[4][];

	@ObfuscatedName("UUFZOKXH.I")
	public YLURZVWU field1180 = new YLURZVWU();

	@ObfuscatedName("UUFZOKXH.J")
	public byte[] field1181 = new byte[65000];

	@ObfuscatedName("UUFZOKXH.L")
	public YLURZVWU field1183 = new YLURZVWU();

	@ObfuscatedName("UUFZOKXH.M")
	public int[][] field1184 = new int[4][];

	@ObfuscatedName("UUFZOKXH.P")
	public YLURZVWU field1187 = new YLURZVWU();

	@ObfuscatedName("UUFZOKXH.e")
	public int field1154;

	@ObfuscatedName("UUFZOKXH.f")
	public int field1155;

	@ObfuscatedName("UUFZOKXH.h")
	public int field1157;

	@ObfuscatedName("UUFZOKXH.m")
	public int field1160;

	@ObfuscatedName("UUFZOKXH.o")
	public int field1162;

	@ObfuscatedName("UUFZOKXH.p")
	public int field1163;

	@ObfuscatedName("UUFZOKXH.t")
	public int field1167;

	@ObfuscatedName("UUFZOKXH.u")
	public int field1168;

	@ObfuscatedName("UUFZOKXH.A")
	public int field1173;

	@ObfuscatedName("UUFZOKXH.E")
	public int field1177;

	@ObfuscatedName("UUFZOKXH.K")
	public int field1182;

	@ObfuscatedName("UUFZOKXH.B")
	public long field1174;

	@ObfuscatedName("UUFZOKXH.c")
	public NCZPZCRJ field1153;

	@ObfuscatedName("UUFZOKXH.x")
	public client field1171;

	@ObfuscatedName("UUFZOKXH.s")
	public InputStream field1166;

	@ObfuscatedName("UUFZOKXH.G")
	public OutputStream field1179;

	@ObfuscatedName("UUFZOKXH.N")
	public Socket field1185;

	@ObfuscatedName("UUFZOKXH.r")
	public byte[] field1165;

	@ObfuscatedName("UUFZOKXH.w")
	public int[] field1170;

	@ObfuscatedName("UUFZOKXH.y")
	public int[] field1172;

	@ObfuscatedName("UUFZOKXH.D")
	public int[] field1176;

	@ObfuscatedName("UUFZOKXH.O")
	public int[] field1186;

	@ObfuscatedName("UUFZOKXH.Q")
	public int[] field1188;

	@ObfuscatedName("UUFZOKXH.R")
	public int[] field1189;

	@ObfuscatedName("UUFZOKXH.a(Z)V")
	public final void method430() {
		NCZPZCRJ var2;
		synchronized (field1164) {
			var2 = (NCZPZCRJ) field1164.method527();
		}

		while (var2 != null) {
			field1156 = true;
			byte[] var3 = null;
			if (field1171.field206[0] != null) {
				var3 = field1171.field206[var2.field921 + 1].method291(var2.field918);
			}

			if (!method448(field1178[var2.field921][var2.field918], var3, field1184[var2.field921][var2.field918])) {
				var3 = null;
			}

			synchronized (field1164) {
				if (var3 == null) {
					field1180.method525(var2);
				} else {
					var2.field919 = var3;

					synchronized (field1159) {
						field1159.method525(var2);
					}
				}

				var2 = (NCZPZCRJ) field1164.method527();
			}
		}
	}

	@ObfuscatedName("UUFZOKXH.a()I")
	public final int method431() {
		synchronized (field1175) {
			return field1175.method524();
		}
	}

	@ObfuscatedName("UUFZOKXH.b(Z)V")
	public final void method432() {
		field1154 = 0;
		field1155 = 0;
		for (NCZPZCRJ var1 = (NCZPZCRJ) field1187.method528(); var1 != null; var1 = (NCZPZCRJ) field1187.method530()) {
			if (var1.field917) {
				field1154++;
			} else {
				field1155++;
			}
		}

		while (field1154 < 10) {
			NCZPZCRJ var2 = (NCZPZCRJ) field1180.method527();
			if (var2 == null) {
				break;
			}

			if (field1152[var2.field921][var2.field918] != 0) {
				field1163++;
			}

			field1152[var2.field921][var2.field918] = 0;
			field1187.method525(var2);
			field1154++;
			method447(var2);
			field1156 = true;
		}
	}

	@ObfuscatedName("UUFZOKXH.a(IIII)I")
	public final int method433(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field1186.length; var5++) {
			if (field1186[var5] == var4) {
				if (arg1 == 0) {
					return field1189[var5];
				}

				return field1170[var5];
			}
		}

		return -1;
	}

	public final void run() {
		try {
			while (field1151) {
				field1162++;
				byte var1 = 20;
				if (field1173 == 0 && field1171.field206[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1156 = true;
				for (int var2 = 0; var2 < 100 && field1156; var2++) {
					field1156 = false;
					method430();
					method432();

					if (field1154 == 0 && var2 >= 5) {
						break;
					}

					method442();

					if (field1166 != null) {
						method437();
					}
				}

				boolean var3 = false;
				for (NCZPZCRJ var4 = (NCZPZCRJ) field1187.method528(); var4 != null; var4 = (NCZPZCRJ) field1187.method530()) {
					if (var4.field917) {
						var3 = true;
						var4.field920++;
						if (var4.field920 > 50) {
							var4.field920 = 0;
							method447(var4);
						}
					}
				}

				if (!var3) {
					for (NCZPZCRJ var5 = (NCZPZCRJ) field1187.method528(); var5 != null; var5 = (NCZPZCRJ) field1187.method530()) {
						var3 = true;
						var5.field920++;
						if (var5.field920 > 50) {
							var5.field920 = 0;
							method447(var5);
						}
					}
				}

				if (var3) {
					field1177++;
					if (field1177 > 750) {
						try {
							field1185.close();
						} catch (Exception var8) {
						}

						field1185 = null;
						field1166 = null;
						field1179 = null;
						field1168 = 0;
					}
				} else {
					field1177 = 0;
					field1161 = "";
				}

				if (field1171.field560 && field1185 != null && field1179 != null && (field1173 > 0 || field1171.field206[0] == null)) {
					field1160++;
					if (field1160 > 500) {
						field1160 = 0;
						field1169[0] = 0;
						field1169[1] = 0;
						field1169[2] = 0;
						field1169[3] = 10;
						try {
							field1179.write(field1169, 0, 4);
						} catch (IOException var7) {
							field1177 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("UUFZOKXH.a(II)Z")
	public final boolean method434(int arg0) {
		for (int var2 = 0; var2 < field1186.length; var2++) {
			if (field1170[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("UUFZOKXH.a(I)V")
	public final void method380(int arg0) {
		method450(0, arg0);
	}

	@ObfuscatedName("UUFZOKXH.a(IZ)I")
	public final int method435(int arg0) {
		return field1184[arg0].length;
	}

	@ObfuscatedName("UUFZOKXH.b(II)I")
	public final int method436(int arg0) {
		return field1165[arg0] & 0xFF;
	}

	@ObfuscatedName("UUFZOKXH.b(I)V")
	public final void method437() {
		try {
			int var1 = field1166.available();
			if (field1168 == 0 && var1 >= 6) {
				field1156 = true;

				for (int var2 = 0; var2 < 6; var2 += field1166.read(field1169, var2, 6 - var2)) {
				}

				int var3 = field1169[0] & 0xFF;
				int var4 = ((field1169[1] & 0xFF) << 8) + (field1169[2] & 0xFF);
				int var5 = ((field1169[3] & 0xFF) << 8) + (field1169[4] & 0xFF);
				int var6 = field1169[5] & 0xFF;
				field1153 = null;
				for (NCZPZCRJ var7 = (NCZPZCRJ) field1187.method528(); var7 != null; var7 = (NCZPZCRJ) field1187.method530()) {
					if (var7.field921 == var3 && var7.field918 == var4) {
						field1153 = var7;
					}

					if (field1153 != null) {
						var7.field920 = 0;
					}
				}

				if (field1153 != null) {
					field1177 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1153.field919 = null;

						if (field1153.field917) {
							synchronized (field1159) {
								field1159.method525(field1153);
							}
						} else {
							field1153.method589();
						}

						field1153 = null;
					} else {
						if (field1153.field919 == null && var6 == 0) {
							field1153.field919 = new byte[var5];
						}

						if (field1153.field919 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1167 = var6 * 500;
				field1168 = 500;
				if (field1168 > var5 - var6 * 500) {
					field1168 = var5 - var6 * 500;
				}
			}

			if (field1168 > 0 && var1 >= field1168) {
				field1156 = true;
				byte[] var9 = field1169;
				int var10 = 0;
				if (field1153 != null) {
					var9 = field1153.field919;
					var10 = field1167;
				}

				for (int var11 = 0; var11 < field1168; var11 += field1166.read(var9, var10 + var11, field1168 - var11)) {
				}

				if (field1168 + field1167 >= var9.length && field1153 != null) {
					if (field1171.field206[0] != null) {
						field1171.field206[field1153.field921 + 1].method292(var9.length, var9, field1153.field918);
					}

					if (!field1153.field917 && field1153.field921 == 3) {
						field1153.field917 = true;
						field1153.field921 = 93;
					}

					if (field1153.field917) {
						synchronized (field1159) {
							field1159.method525(field1153);
						}
					} else {
						field1153.method589();
					}
				}

				field1168 = 0;
			}
		} catch (IOException var17) {
			try {
				field1185.close();
			} catch (Exception var14) {
			}

			field1185 = null;
			field1166 = null;
			field1179 = null;
			field1168 = 0;
		}
	}

	@ObfuscatedName("UUFZOKXH.c(I)I")
	public final int method438() {
		return field1176.length;
	}

	@ObfuscatedName("UUFZOKXH.a(ZI)V")
	public final void method439(boolean arg0) {
		int var2 = field1186.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1188[var3] != 0) {
				method443((byte) 2, field1170[var3], 3);
				method443((byte) 2, field1189[var3], 3);
			}
		}
	}

	@ObfuscatedName("UUFZOKXH.b()V")
	public final void method440() {
		field1151 = false;
	}

	@ObfuscatedName("UUFZOKXH.a(IIZ)V")
	public final void method441(int arg0, int arg1) {
		if (field1171.field206[0] != null && (field1184[arg1][arg0] != 0 && (field1152[arg1][arg0] != 0 && field1173 != 0))) {
			NCZPZCRJ var3 = new NCZPZCRJ();
			var3.field921 = arg1;
			var3.field918 = arg0;
			var3.field917 = false;

			synchronized (field1183) {
				field1183.method525(var3);
			}
		}
	}

	@ObfuscatedName("UUFZOKXH.d(I)V")
	public final void method442() {
		while (field1154 == 0) {
			if (field1155 >= 10 || field1173 == 0) {
				return;
			}

			NCZPZCRJ var2;
			synchronized (field1183) {
				var2 = (NCZPZCRJ) field1183.method527();
			}

			while (var2 != null) {
				if (field1152[var2.field921][var2.field918] != 0) {
					field1152[var2.field921][var2.field918] = 0;
					field1187.method525(var2);
					method447(var2);
					field1156 = true;

					if (field1163 < field1182) {
						field1163++;
					}

					field1161 = "Loading extra files - " + field1163 * 100 / field1182 + "%";
					field1155++;
					if (field1155 == 10) {
						return;
					}
				}

				synchronized (field1183) {
					var2 = (NCZPZCRJ) field1183.method527();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1152[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1173) {
						var5[var7] = 0;
						NCZPZCRJ var8 = new NCZPZCRJ();
						var8.field921 = var4;
						var8.field918 = var7;
						var8.field917 = false;
						field1187.method525(var8);
						method447(var8);
						field1156 = true;

						if (field1163 < field1182) {
							field1163++;
						}

						field1161 = "Loading extra files - " + field1163 * 100 / field1182 + "%";
						field1155++;
						if (field1155 == 10) {
							return;
						}
					}
				}
			}

			field1173--;
		}
	}

	@ObfuscatedName("UUFZOKXH.a(IBII)V")
	public final void method443(byte arg0, int arg1, int arg2) {
		if (field1171.field206[0] != null && field1184[arg2][arg1] != 0) {
			byte[] var4 = field1171.field206[arg2 + 1].method291(arg1);
			if (!method448(field1178[arg2][arg1], var4, field1184[arg2][arg1])) {
				field1152[arg2][arg1] = arg0;

				if (arg0 > field1173) {
					field1173 = arg0;
				}

				field1182++;
			}
		}
	}

	@ObfuscatedName("UUFZOKXH.c(Z)V")
	public final void method444() {
		synchronized (field1183) {
			field1183.method532();
		}
	}

	@ObfuscatedName("UUFZOKXH.a(IB)Z")
	public final boolean method445(int arg0) {
		if (field1172[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("UUFZOKXH.c()LNCZPZCRJ;")
	public final NCZPZCRJ method446() {
		NCZPZCRJ var2;
		synchronized (field1159) {
			var2 = (NCZPZCRJ) field1159.method527();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1175) {
			var2.method278();
		}

		if (var2.field919 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field919));
			while (true) {
				if (field1181.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1181, var4, field1181.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field919 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field919[var7] = field1181[var7];
		}

		return var2;
	}

	@ObfuscatedName("UUFZOKXH.a(ILNCZPZCRJ;)V")
	public final void method447(NCZPZCRJ arg0) {
		try {
			if (field1185 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1174 < 4000L) {
					return;
				}

				field1174 = var2;
				field1185 = field1171.method121(client.field213 + 43594);
				field1166 = field1185.getInputStream();
				field1179 = field1185.getOutputStream();
				field1179.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1166.read();
				}

				field1177 = 0;
			}

			field1169[0] = (byte) arg0.field921;
			field1169[1] = (byte) (arg0.field918 >> 8);
			field1169[2] = (byte) arg0.field918;
			if (arg0.field917) {
				field1169[3] = 2;
			} else if (field1171.field560) {
				field1169[3] = 0;
			} else {
				field1169[3] = 1;
			}

			field1179.write(field1169, 0, 4);
			field1160 = 0;
			field1157 = -10000;
		} catch (IOException var7) {
			try {
				field1185.close();
			} catch (Exception var6) {
			}

			field1185 = null;
			field1166 = null;
			field1179 = null;
			field1168 = 0;
			field1157++;
		}
	}

	@ObfuscatedName("UUFZOKXH.a(I[BII)Z")
	public final boolean method448(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field1158.reset();
			field1158.update(arg1, 0, var4);
			int var6 = (int) field1158.getValue();

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

	@ObfuscatedName("UUFZOKXH.a(LOTSGNSQM;Lclient;)V")
	public final void method449(OTSGNSQM arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method376(var3[var4], null);
			int var6 = var5.length / 2;
			YOXDZEVD var7 = new YOXDZEVD(var5);
			field1184[var4] = new int[var6];
			field1152[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1184[var4][var8] = var7.method551();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method376(var9[var10], null);
			int var12 = var11.length / 4;
			YOXDZEVD var13 = new YOXDZEVD(var11);
			field1178[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1178[var10][var14] = var13.method554();
			}
		}

		byte[] var15 = arg0.method376("model_index", null);
		int var16 = field1184[0].length;
		field1165 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1165[var17] = var15[var17];
			} else {
				field1165[var17] = 0;
			}
		}

		byte[] var18 = arg0.method376("map_index", null);
		YOXDZEVD var19 = new YOXDZEVD(var18);
		int var20 = var18.length / 7;
		field1186 = new int[var20];
		field1189 = new int[var20];
		field1170 = new int[var20];
		field1188 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1186[var21] = var19.method551();
			field1189[var21] = var19.method551();
			field1170[var21] = var19.method551();
			field1188[var21] = var19.method549();
		}

		byte[] var22 = arg0.method376("anim_index", null);
		YOXDZEVD var23 = new YOXDZEVD(var22);
		int var24 = var22.length / 2;
		field1176 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1176[var25] = var23.method551();
		}

		byte[] var26 = arg0.method376("midi_index", null);
		YOXDZEVD var27 = new YOXDZEVD(var26);
		int var28 = var26.length;
		field1172 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1172[var29] = var27.method549();
		}

		field1171 = arg1;
		field1151 = true;
		field1171.method141(this, 2);
	}

	@ObfuscatedName("UUFZOKXH.c(II)V")
	public final void method450(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1184.length && arg1 >= 0 && arg1 <= field1184[arg0].length && field1184[arg0][arg1] != 0) {
			synchronized (field1175) {
				for (NCZPZCRJ var4 = (NCZPZCRJ) field1175.method522(); var4 != null; var4 = (NCZPZCRJ) field1175.method523()) {
					if (var4.field921 == arg0 && var4.field918 == arg1) {
						return;
					}
				}

				NCZPZCRJ var5 = new NCZPZCRJ();
				var5.field921 = arg0;
				var5.field918 = arg1;
				var5.field917 = true;

				synchronized (field1164) {
					field1164.method525(var5);
				}

				field1175.method520(var5);
			}
		}
	}
}
