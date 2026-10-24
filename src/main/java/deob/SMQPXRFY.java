package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("SMQPXRFY")
public class SMQPXRFY extends XUKKJTOL implements Runnable {

	@ObfuscatedName("SMQPXRFY.e")
	public byte[] field1158 = new byte[500];

	@ObfuscatedName("SMQPXRFY.o")
	public boolean field1168 = false;

	@ObfuscatedName("SMQPXRFY.r")
	public YSGENUJE field1171 = new YSGENUJE();

	@ObfuscatedName("SMQPXRFY.s")
	public YSGENUJE field1172 = new YSGENUJE();

	@ObfuscatedName("SMQPXRFY.w")
	public String field1176 = "";

	@ObfuscatedName("SMQPXRFY.y")
	public YSGENUJE field1177 = new YSGENUJE();

	@ObfuscatedName("SMQPXRFY.z")
	public boolean field1178 = true;

	@ObfuscatedName("SMQPXRFY.B")
	public byte[][] field1180 = new byte[4][];

	@ObfuscatedName("SMQPXRFY.C")
	public YSGENUJE field1181 = new YSGENUJE();

	@ObfuscatedName("SMQPXRFY.I")
	public CRC32 field1185 = new CRC32();

	@ObfuscatedName("SMQPXRFY.J")
	public int[][] field1186 = new int[4][];

	@ObfuscatedName("SMQPXRFY.L")
	public YSGENUJE field1187 = new YSGENUJE();

	@ObfuscatedName("SMQPXRFY.Q")
	public LOPREVUC field1192 = new LOPREVUC();

	@ObfuscatedName("SMQPXRFY.R")
	public byte[] field1193 = new byte[65000];

	@ObfuscatedName("SMQPXRFY.S")
	public int[][] field1194 = new int[4][];

	@ObfuscatedName("SMQPXRFY.g")
	public int field1160;

	@ObfuscatedName("SMQPXRFY.i")
	public int field1162;

	@ObfuscatedName("SMQPXRFY.j")
	public int field1163;

	@ObfuscatedName("SMQPXRFY.m")
	public int field1166;

	@ObfuscatedName("SMQPXRFY.n")
	public int field1167;

	@ObfuscatedName("SMQPXRFY.t")
	public int field1173;

	@ObfuscatedName("SMQPXRFY.A")
	public int field1179;

	@ObfuscatedName("SMQPXRFY.D")
	public int field1182;

	@ObfuscatedName("SMQPXRFY.F")
	public int field1183;

	@ObfuscatedName("SMQPXRFY.N")
	public int field1189;

	@ObfuscatedName("SMQPXRFY.O")
	public int field1190;

	@ObfuscatedName("SMQPXRFY.u")
	public long field1174;

	@ObfuscatedName("SMQPXRFY.c")
	public SMSHJBOZ field1156;

	@ObfuscatedName("SMQPXRFY.d")
	public client field1157;

	@ObfuscatedName("SMQPXRFY.H")
	public InputStream field1184;

	@ObfuscatedName("SMQPXRFY.p")
	public OutputStream field1169;

	@ObfuscatedName("SMQPXRFY.v")
	public Socket field1175;

	@ObfuscatedName("SMQPXRFY.q")
	public byte[] field1170;

	@ObfuscatedName("SMQPXRFY.f")
	public int[] field1159;

	@ObfuscatedName("SMQPXRFY.h")
	public int[] field1161;

	@ObfuscatedName("SMQPXRFY.k")
	public int[] field1164;

	@ObfuscatedName("SMQPXRFY.l")
	public int[] field1165;

	@ObfuscatedName("SMQPXRFY.M")
	public int[] field1188;

	@ObfuscatedName("SMQPXRFY.P")
	public int[] field1191;

	@ObfuscatedName("SMQPXRFY.a(IIII)I")
	public final int method388(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field1165.length; var5++) {
			if (field1165[var5] == var4) {
				if (arg0 == 0) {
					return field1164[var5];
				}

				return field1191[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("SMQPXRFY.a(ZIIB)V")
	public final void method389(int arg0, int arg1, byte arg2) {
		if (field1157.field412[0] != null && field1186[arg0][arg1] != 0) {
			byte[] var4 = field1157.field412[arg0 + 1].method439(arg1);
			if (!method401(var4, field1194[arg0][arg1], field1186[arg0][arg1])) {
				field1180[arg0][arg1] = arg2;

				if (arg2 > field1160) {
					field1160 = arg2;
				}

				field1173++;
			}
		}
	}

	@ObfuscatedName("SMQPXRFY.a(III)V")
	public final void method390(int arg0, int arg1) {
		if (field1157.field412[0] != null && (field1186[arg1][arg0] != 0 && (field1180[arg1][arg0] != 0 && field1160 != 0))) {
			SMSHJBOZ var3 = new SMSHJBOZ();
			var3.field1195 = arg1;
			var3.field1198 = arg0;
			var3.field1196 = false;

			synchronized (field1177) {
				field1177.method520(var3);
			}
		}
	}

	@ObfuscatedName("SMQPXRFY.a()LSMSHJBOZ;")
	public final SMSHJBOZ method391() {
		SMSHJBOZ var2;
		synchronized (field1181) {
			var2 = (SMSHJBOZ) field1181.method522();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1192) {
			var2.method37();
		}

		if (var2.field1199 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1199));
			while (true) {
				if (field1193.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1193, var4, field1193.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1199 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1199[var7] = field1193[var7];
		}

		return var2;
	}

	@ObfuscatedName("SMQPXRFY.b(I)V")
	public final void method392() {
		while (field1162 == 0) {
			if (field1163 >= 10 || field1160 == 0) {
				return;
			}

			SMSHJBOZ var2;
			synchronized (field1177) {
				var2 = (SMSHJBOZ) field1177.method522();
			}

			while (var2 != null) {
				if (field1180[var2.field1195][var2.field1198] != 0) {
					field1180[var2.field1195][var2.field1198] = 0;
					field1172.method520(var2);
					method404(var2);
					field1168 = true;

					if (field1190 < field1173) {
						field1190++;
					}

					field1176 = "Loading extra files - " + field1190 * 100 / field1173 + "%";
					field1163++;
					if (field1163 == 10) {
						return;
					}
				}

				synchronized (field1177) {
					var2 = (SMSHJBOZ) field1177.method522();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1180[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1160) {
						var5[var7] = 0;
						SMSHJBOZ var8 = new SMSHJBOZ();
						var8.field1195 = var4;
						var8.field1198 = var7;
						var8.field1196 = false;
						field1172.method520(var8);
						method404(var8);
						field1168 = true;

						if (field1190 < field1173) {
							field1190++;
						}

						field1176 = "Loading extra files - " + field1190 * 100 / field1173 + "%";
						field1163++;
						if (field1163 == 10) {
							return;
						}
					}
				}
			}

			field1160--;
		}
	}

	@ObfuscatedName("SMQPXRFY.a(Z)V")
	public final void method393() {
		synchronized (field1177) {
			field1177.method527();
		}
	}

	@ObfuscatedName("SMQPXRFY.b(Z)V")
	public final void method394() {
		try {
			int var1 = field1184.available();
			if (field1167 == 0 && var1 >= 6) {
				field1168 = true;

				for (int var2 = 0; var2 < 6; var2 += field1184.read(field1158, var2, 6 - var2)) {
				}

				int var3 = field1158[0] & 0xFF;
				int var4 = ((field1158[1] & 0xFF) << 8) + (field1158[2] & 0xFF);
				int var5 = ((field1158[3] & 0xFF) << 8) + (field1158[4] & 0xFF);
				int var6 = field1158[5] & 0xFF;
				field1156 = null;
				for (SMSHJBOZ var7 = (SMSHJBOZ) field1172.method523(); var7 != null; var7 = (SMSHJBOZ) field1172.method525()) {
					if (var7.field1195 == var3 && var7.field1198 == var4) {
						field1156 = var7;
					}

					if (field1156 != null) {
						var7.field1197 = 0;
					}
				}

				if (field1156 != null) {
					field1182 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1156.field1199 = null;

						if (field1156.field1196) {
							synchronized (field1181) {
								field1181.method520(field1156);
							}
						} else {
							field1156.method591();
						}

						field1156 = null;
					} else {
						if (field1156.field1199 == null && var6 == 0) {
							field1156.field1199 = new byte[var5];
						}

						if (field1156.field1199 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1166 = var6 * 500;
				field1167 = 500;
				if (field1167 > var5 - var6 * 500) {
					field1167 = var5 - var6 * 500;
				}
			}

			if (field1167 > 0 && var1 >= field1167) {
				field1168 = true;
				byte[] var9 = field1158;
				int var10 = 0;
				if (field1156 != null) {
					var9 = field1156.field1199;
					var10 = field1166;
				}

				for (int var11 = 0; var11 < field1167; var11 += field1184.read(var9, var10 + var11, field1167 - var11)) {
				}

				if (field1167 + field1166 >= var9.length && field1156 != null) {
					if (field1157.field412[0] != null) {
						field1157.field412[field1156.field1195 + 1].method440(var9, var9.length, field1156.field1198);
					}

					if (!field1156.field1196 && field1156.field1195 == 3) {
						field1156.field1196 = true;
						field1156.field1195 = 93;
					}

					if (field1156.field1196) {
						synchronized (field1181) {
							field1181.method520(field1156);
						}
					} else {
						field1156.method591();
					}
				}

				field1167 = 0;
			}
		} catch (IOException var17) {
			try {
				field1175.close();
			} catch (Exception var14) {
			}

			field1175 = null;
			field1184 = null;
			field1169 = null;
			field1167 = 0;
		}
	}

	@ObfuscatedName("SMQPXRFY.a(ZI)I")
	public final int method395(int arg0) {
		return field1170[arg0] & 0xFF;
	}

	@ObfuscatedName("SMQPXRFY.a(B)V")
	public final void method396() {
		field1162 = 0;
		field1163 = 0;
		for (SMSHJBOZ var1 = (SMSHJBOZ) field1172.method523(); var1 != null; var1 = (SMSHJBOZ) field1172.method525()) {
			if (var1.field1196) {
				field1162++;
			} else {
				field1163++;
			}
		}

		while (field1162 < 10) {
			SMSHJBOZ var2 = (SMSHJBOZ) field1171.method522();
			if (var2 == null) {
				break;
			}

			if (field1180[var2.field1195][var2.field1198] != 0) {
				field1190++;
			}

			field1180[var2.field1195][var2.field1198] = 0;
			field1172.method520(var2);
			field1162++;
			method404(var2);
			field1168 = true;
		}
	}

	public final void run() {
		try {
			while (field1178) {
				field1189++;
				byte var1 = 20;
				if (field1160 == 0 && field1157.field412[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1168 = true;
				for (int var2 = 0; var2 < 100 && field1168; var2++) {
					field1168 = false;
					method400();
					method396();

					if (field1162 == 0 && var2 >= 5) {
						break;
					}

					method392();

					if (field1184 != null) {
						method394();
					}
				}

				boolean var3 = false;
				for (SMSHJBOZ var4 = (SMSHJBOZ) field1172.method523(); var4 != null; var4 = (SMSHJBOZ) field1172.method525()) {
					if (var4.field1196) {
						var3 = true;
						var4.field1197++;
						if (var4.field1197 > 50) {
							var4.field1197 = 0;
							method404(var4);
						}
					}
				}

				if (!var3) {
					for (SMSHJBOZ var5 = (SMSHJBOZ) field1172.method523(); var5 != null; var5 = (SMSHJBOZ) field1172.method525()) {
						var3 = true;
						var5.field1197++;
						if (var5.field1197 > 50) {
							var5.field1197 = 0;
							method404(var5);
						}
					}
				}

				if (var3) {
					field1182++;
					if (field1182 > 750) {
						try {
							field1175.close();
						} catch (Exception var8) {
						}

						field1175 = null;
						field1184 = null;
						field1169 = null;
						field1167 = 0;
					}
				} else {
					field1182 = 0;
					field1176 = "";
				}

				if (field1157.field481 && field1175 != null && field1169 != null && (field1160 > 0 || field1157.field412[0] == null)) {
					field1179++;
					if (field1179 > 500) {
						field1179 = 0;
						field1158[0] = 0;
						field1158[1] = 0;
						field1158[2] = 0;
						field1158[3] = 10;
						try {
							field1169.write(field1158, 0, 4);
						} catch (IOException var7) {
							field1182 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("SMQPXRFY.b(ZI)Z")
	public final boolean method397(int arg0) {
		if (field1159[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("SMQPXRFY.b()V")
	public final void method398() {
		field1178 = false;
	}

	@ObfuscatedName("SMQPXRFY.a(LLYZBHNJP;Lclient;)V")
	public final void method399(LYZBHNJP arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method290(var3[var4], null);
			int var6 = var5.length / 2;
			ZOMNSJJM var7 = new ZOMNSJJM(var5);
			field1186[var4] = new int[var6];
			field1180[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1186[var4][var8] = var7.method549();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method290(var9[var10], null);
			int var12 = var11.length / 4;
			ZOMNSJJM var13 = new ZOMNSJJM(var11);
			field1194[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1194[var10][var14] = var13.method552();
			}
		}

		byte[] var15 = arg0.method290("model_index", null);
		int var16 = field1186[0].length;
		field1170 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1170[var17] = var15[var17];
			} else {
				field1170[var17] = 0;
			}
		}

		byte[] var18 = arg0.method290("map_index", null);
		ZOMNSJJM var19 = new ZOMNSJJM(var18);
		int var20 = var18.length / 7;
		field1165 = new int[var20];
		field1164 = new int[var20];
		field1191 = new int[var20];
		field1188 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1165[var21] = var19.method549();
			field1164[var21] = var19.method549();
			field1191[var21] = var19.method549();
			field1188[var21] = var19.method547();
		}

		byte[] var22 = arg0.method290("anim_index", null);
		ZOMNSJJM var23 = new ZOMNSJJM(var22);
		int var24 = var22.length / 2;
		field1161 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1161[var25] = var23.method549();
		}

		byte[] var26 = arg0.method290("midi_index", null);
		ZOMNSJJM var27 = new ZOMNSJJM(var26);
		int var28 = var26.length;
		field1159 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1159[var29] = var27.method547();
		}

		field1157 = arg1;
		field1178 = true;
		field1157.method124(this, 2);
	}

	@ObfuscatedName("SMQPXRFY.c(I)V")
	public final void method400() {
		SMSHJBOZ var2;
		synchronized (field1187) {
			var2 = (SMSHJBOZ) field1187.method522();
		}

		while (var2 != null) {
			field1168 = true;
			byte[] var3 = null;
			if (field1157.field412[0] != null) {
				var3 = field1157.field412[var2.field1195 + 1].method439(var2.field1198);
			}

			if (!method401(var3, field1194[var2.field1195][var2.field1198], field1186[var2.field1195][var2.field1198])) {
				var3 = null;
			}

			synchronized (field1187) {
				if (var3 == null) {
					field1171.method520(var2);
				} else {
					var2.field1199 = var3;

					synchronized (field1181) {
						field1181.method520(var2);
					}
				}

				var2 = (SMSHJBOZ) field1187.method522();
			}
		}
	}

	@ObfuscatedName("SMQPXRFY.a(Z[BII)Z")
	public final boolean method401(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field1185.reset();
			field1185.update(arg0, 0, var4);
			int var6 = (int) field1185.getValue();

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

	@ObfuscatedName("SMQPXRFY.a(II)I")
	public final int method402(int arg0) {
		return field1186[arg0].length;
	}

	@ObfuscatedName("SMQPXRFY.a(ZB)V")
	public final void method403(boolean arg0) {
		int var2 = field1165.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1188[var3] != 0) {
				method389(3, field1191[var3], (byte) 2);
				method389(3, field1164[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("SMQPXRFY.a(ILSMSHJBOZ;)V")
	public final void method404(SMSHJBOZ arg0) {
		try {
			if (field1175 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1174 < 4000L) {
					return;
				}

				field1174 = var2;
				field1175 = field1157.method162(client.field351 + 43594);
				field1184 = field1175.getInputStream();
				field1169 = field1175.getOutputStream();
				field1169.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1184.read();
				}

				field1182 = 0;
			}

			field1158[0] = (byte) arg0.field1195;
			field1158[1] = (byte) (arg0.field1198 >> 8);
			field1158[2] = (byte) arg0.field1198;
			if (arg0.field1196) {
				field1158[3] = 2;
			} else if (field1157.field481) {
				field1158[3] = 0;
			} else {
				field1158[3] = 1;
			}

			field1169.write(field1158, 0, 4);
			field1179 = 0;
			field1183 = -10000;
		} catch (IOException var7) {
			try {
				field1175.close();
			} catch (Exception var6) {
			}

			field1175 = null;
			field1184 = null;
			field1169 = null;
			field1167 = 0;
			field1183++;
		}
	}

	@ObfuscatedName("SMQPXRFY.c()I")
	public final int method405() {
		synchronized (field1192) {
			return field1192.method263();
		}
	}

	@ObfuscatedName("SMQPXRFY.a(I)V")
	public final void method406(int arg0) {
		method409(0, arg0);
	}

	@ObfuscatedName("SMQPXRFY.d(I)I")
	public final int method407() {
		return field1161.length;
	}

	@ObfuscatedName("SMQPXRFY.a(IZ)Z")
	public final boolean method408(int arg0) {
		for (int var2 = 0; var2 < field1165.length; var2++) {
			if (field1191[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("SMQPXRFY.b(II)V")
	public final void method409(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1186.length && arg1 >= 0 && arg1 <= field1186[arg0].length && field1186[arg0][arg1] != 0) {
			synchronized (field1192) {
				for (SMSHJBOZ var4 = (SMSHJBOZ) field1192.method261(); var4 != null; var4 = (SMSHJBOZ) field1192.method262()) {
					if (var4.field1195 == arg0 && var4.field1198 == arg1) {
						return;
					}
				}

				SMSHJBOZ var5 = new SMSHJBOZ();
				var5.field1195 = arg0;
				var5.field1198 = arg1;
				var5.field1196 = true;

				synchronized (field1187) {
					field1187.method520(var5);
				}

				field1192.method259(var5);
			}
		}
	}
}
