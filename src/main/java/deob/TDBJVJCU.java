package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("TDBJVJCU")
public class TDBJVJCU extends JJGBUTFD implements Runnable {

	@ObfuscatedName("TDBJVJCU.a")
	public PILILDKN field1174 = new PILILDKN();

	@ObfuscatedName("TDBJVJCU.d")
	public PILILDKN field1177 = new PILILDKN();

	@ObfuscatedName("TDBJVJCU.f")
	public PILILDKN field1178 = new PILILDKN();

	@ObfuscatedName("TDBJVJCU.k")
	public VHKTMNAT field1183 = new VHKTMNAT();

	@ObfuscatedName("TDBJVJCU.l")
	public boolean field1184 = false;

	@ObfuscatedName("TDBJVJCU.m")
	public int[][] field1185 = new int[4][];

	@ObfuscatedName("TDBJVJCU.n")
	public CRC32 field1186 = new CRC32();

	@ObfuscatedName("TDBJVJCU.s")
	public byte[] field1191 = new byte[500];

	@ObfuscatedName("TDBJVJCU.B")
	public byte[] field1197 = new byte[65000];

	@ObfuscatedName("TDBJVJCU.F")
	public String field1200 = "";

	@ObfuscatedName("TDBJVJCU.I")
	public PILILDKN field1203 = new PILILDKN();

	@ObfuscatedName("TDBJVJCU.K")
	public boolean field1204 = true;

	@ObfuscatedName("TDBJVJCU.L")
	public int[][] field1205 = new int[4][];

	@ObfuscatedName("TDBJVJCU.Q")
	public byte[][] field1208 = new byte[4][];

	@ObfuscatedName("TDBJVJCU.U")
	public PILILDKN field1212 = new PILILDKN();

	@ObfuscatedName("TDBJVJCU.g")
	public int field1179;

	@ObfuscatedName("TDBJVJCU.i")
	public int field1181;

	@ObfuscatedName("TDBJVJCU.j")
	public int field1182;

	@ObfuscatedName("TDBJVJCU.q")
	public int field1189;

	@ObfuscatedName("TDBJVJCU.v")
	public int field1192;

	@ObfuscatedName("TDBJVJCU.w")
	public int field1193;

	@ObfuscatedName("TDBJVJCU.G")
	public int field1201;

	@ObfuscatedName("TDBJVJCU.N")
	public int field1206;

	@ObfuscatedName("TDBJVJCU.P")
	public int field1207;

	@ObfuscatedName("TDBJVJCU.S")
	public int field1210;

	@ObfuscatedName("TDBJVJCU.T")
	public int field1211;

	@ObfuscatedName("TDBJVJCU.p")
	public long field1188;

	@ObfuscatedName("TDBJVJCU.r")
	public KRPFBUJX field1190;

	@ObfuscatedName("TDBJVJCU.E")
	public client field1199;

	@ObfuscatedName("TDBJVJCU.h")
	public InputStream field1180;

	@ObfuscatedName("TDBJVJCU.o")
	public OutputStream field1187;

	@ObfuscatedName("TDBJVJCU.x")
	public Socket field1194;

	@ObfuscatedName("TDBJVJCU.H")
	public byte[] field1202;

	@ObfuscatedName("TDBJVJCU.b")
	public int[] field1175;

	@ObfuscatedName("TDBJVJCU.c")
	public int[] field1176;

	@ObfuscatedName("TDBJVJCU.y")
	public int[] field1195;

	@ObfuscatedName("TDBJVJCU.A")
	public int[] field1196;

	@ObfuscatedName("TDBJVJCU.D")
	public int[] field1198;

	@ObfuscatedName("TDBJVJCU.R")
	public int[] field1209;

	@ObfuscatedName("TDBJVJCU.a(LBYZSQZUF;Lclient;)V")
	public final void method464(BYZSQZUF arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method29(var3[var4], null);
			int var6 = var5.length / 2;
			IMUIZRAF var7 = new IMUIZRAF(var5);
			field1185[var4] = new int[var6];
			field1208[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1185[var4][var8] = var7.method240();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method29(var9[var10], null);
			int var12 = var11.length / 4;
			IMUIZRAF var13 = new IMUIZRAF(var11);
			field1205[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1205[var10][var14] = var13.method243();
			}
		}

		byte[] var15 = arg0.method29("model_index", null);
		int var16 = field1185[0].length;
		field1202 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1202[var17] = var15[var17];
			} else {
				field1202[var17] = 0;
			}
		}

		byte[] var18 = arg0.method29("map_index", null);
		IMUIZRAF var19 = new IMUIZRAF(var18);
		int var20 = var18.length / 7;
		field1175 = new int[var20];
		field1209 = new int[var20];
		field1195 = new int[var20];
		field1176 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1175[var21] = var19.method240();
			field1209[var21] = var19.method240();
			field1195[var21] = var19.method240();
			field1176[var21] = var19.method238();
		}

		byte[] var22 = arg0.method29("anim_index", null);
		IMUIZRAF var23 = new IMUIZRAF(var22);
		int var24 = var22.length / 2;
		field1196 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1196[var25] = var23.method240();
		}

		byte[] var26 = arg0.method29("midi_index", null);
		IMUIZRAF var27 = new IMUIZRAF(var26);
		int var28 = var26.length;
		field1198 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1198[var29] = var27.method238();
		}

		field1199 = arg1;
		field1204 = true;
		field1199.method36(this, 2);
	}

	@ObfuscatedName("TDBJVJCU.a(IIII)I")
	public final int method465(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field1175.length; var5++) {
			if (field1175[var5] == var4) {
				if (arg2 == 0) {
					return field1209[var5];
				}

				return field1195[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("TDBJVJCU.a([BZII)Z")
	public final boolean method466(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field1186.reset();
			field1186.update(arg0, 0, var4);
			int var6 = (int) field1186.getValue();

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

	@ObfuscatedName("TDBJVJCU.a(I)V")
	public final void method279(int arg0) {
		method469(0, arg0);
	}

	@ObfuscatedName("TDBJVJCU.b(I)I")
	public final int method467() {
		return field1196.length;
	}

	@ObfuscatedName("TDBJVJCU.a(BIIB)V")
	public final void method468(int arg0, int arg1, byte arg2) {
		if (field1199.field128[0] != null && field1185[arg0][arg1] != 0) {
			byte[] var4 = field1199.field128[arg0 + 1].method427(arg1);
			if (!method466(var4, field1185[arg0][arg1], field1205[arg0][arg1])) {
				field1208[arg0][arg1] = arg2;

				if (arg2 > field1211) {
					field1211 = arg2;
				}

				field1201++;
			}
		}
	}

	@ObfuscatedName("TDBJVJCU.a(II)V")
	public final void method469(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1185.length && arg1 >= 0 && arg1 <= field1185[arg0].length && field1185[arg0][arg1] != 0) {
			synchronized (field1183) {
				for (KRPFBUJX var4 = (KRPFBUJX) field1183.method491(); var4 != null; var4 = (KRPFBUJX) field1183.method492()) {
					if (var4.field801 == arg0 && var4.field802 == arg1) {
						return;
					}
				}

				KRPFBUJX var5 = new KRPFBUJX();
				var5.field801 = arg0;
				var5.field802 = arg1;
				var5.field800 = true;

				synchronized (field1177) {
					field1177.method379(var5);
				}

				field1183.method489(var5);
			}
		}
	}

	@ObfuscatedName("TDBJVJCU.a()V")
	public final void method470() {
		field1204 = false;
	}

	@ObfuscatedName("TDBJVJCU.c(I)V")
	public final void method471() {
		try {
			int var1 = field1180.available();
			if (field1182 == 0 && var1 >= 6) {
				field1184 = true;

				for (int var2 = 0; var2 < 6; var2 += field1180.read(field1191, var2, 6 - var2)) {
				}

				int var3 = field1191[0] & 0xFF;
				int var4 = ((field1191[1] & 0xFF) << 8) + (field1191[2] & 0xFF);
				int var5 = ((field1191[3] & 0xFF) << 8) + (field1191[4] & 0xFF);
				int var6 = field1191[5] & 0xFF;
				field1190 = null;
				for (KRPFBUJX var7 = (KRPFBUJX) field1203.method382(); var7 != null; var7 = (KRPFBUJX) field1203.method384()) {
					if (var7.field801 == var3 && var7.field802 == var4) {
						field1190 = var7;
					}

					if (field1190 != null) {
						var7.field803 = 0;
					}
				}

				if (field1190 != null) {
					field1207 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1190.field804 = null;

						if (field1190.field800) {
							synchronized (field1178) {
								field1178.method379(field1190);
							}
						} else {
							field1190.method540();
						}

						field1190 = null;
					} else {
						if (field1190.field804 == null && var6 == 0) {
							field1190.field804 = new byte[var5];
						}

						if (field1190.field804 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1181 = var6 * 500;
				field1182 = 500;
				if (field1182 > var5 - var6 * 500) {
					field1182 = var5 - var6 * 500;
				}
			}

			if (field1182 > 0 && var1 >= field1182) {
				field1184 = true;
				byte[] var9 = field1191;
				int var10 = 0;
				if (field1190 != null) {
					var9 = field1190.field804;
					var10 = field1181;
				}

				for (int var11 = 0; var11 < field1182; var11 += field1180.read(var9, var10 + var11, field1182 - var11)) {
				}

				if (field1182 + field1181 >= var9.length && field1190 != null) {
					if (field1199.field128[0] != null) {
						field1199.field128[field1190.field801 + 1].method428(field1190.field802, var9.length, var9);
					}

					if (!field1190.field800 && field1190.field801 == 3) {
						field1190.field800 = true;
						field1190.field801 = 93;
					}

					if (field1190.field800) {
						synchronized (field1178) {
							field1178.method379(field1190);
						}
					} else {
						field1190.method540();
					}
				}

				field1182 = 0;
			}
		} catch (IOException var17) {
			try {
				field1194.close();
			} catch (Exception var14) {
			}

			field1194 = null;
			field1180 = null;
			field1187 = null;
			field1182 = 0;
		}
	}

	@ObfuscatedName("TDBJVJCU.b()I")
	public final int method472() {
		synchronized (field1183) {
			return field1183.method493();
		}
	}

	@ObfuscatedName("TDBJVJCU.a(LKRPFBUJX;I)V")
	public final void method473(KRPFBUJX arg0) {
		try {
			if (field1194 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1188 < 4000L) {
					return;
				}

				field1188 = var2;
				field1194 = field1199.method111(client.field276 + 43594);
				field1180 = field1194.getInputStream();
				field1187 = field1194.getOutputStream();
				field1187.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1180.read();
				}

				field1207 = 0;
			}

			field1191[0] = (byte) arg0.field801;
			field1191[1] = (byte) (arg0.field802 >> 8);
			field1191[2] = (byte) arg0.field802;
			if (arg0.field800) {
				field1191[3] = 2;
			} else if (field1199.field219) {
				field1191[3] = 0;
			} else {
				field1191[3] = 1;
			}

			field1187.write(field1191, 0, 4);
			field1206 = 0;
			field1210 = -10000;
		} catch (IOException var7) {
			try {
				field1194.close();
			} catch (Exception var6) {
			}

			field1194 = null;
			field1180 = null;
			field1187 = null;
			field1182 = 0;
			field1210++;
		}
	}

	@ObfuscatedName("TDBJVJCU.b(II)I")
	public final int method474(int arg0) {
		return field1185[arg0].length;
	}

	@ObfuscatedName("TDBJVJCU.d(I)V")
	public final void method475() {
		synchronized (field1212) {
			field1212.method386();
		}
	}

	@ObfuscatedName("TDBJVJCU.c()LKRPFBUJX;")
	public final KRPFBUJX method476() {
		KRPFBUJX var2;
		synchronized (field1178) {
			var2 = (KRPFBUJX) field1178.method381();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1183) {
			var2.method524();
		}

		if (var2.field804 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field804));
			while (true) {
				if (field1197.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1197, var4, field1197.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field804 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field804[var7] = field1197[var7];
		}

		return var2;
	}

	@ObfuscatedName("TDBJVJCU.a(III)V")
	public final void method477(int arg0, int arg1) {
		if (field1199.field128[0] != null && (field1185[arg1][arg0] != 0 && (field1208[arg1][arg0] != 0 && field1211 != 0))) {
			KRPFBUJX var3 = new KRPFBUJX();
			var3.field801 = arg1;
			var3.field802 = arg0;
			var3.field800 = false;

			synchronized (field1212) {
				field1212.method379(var3);
			}
		}
	}

	@ObfuscatedName("TDBJVJCU.a(ZI)V")
	public final void method478(boolean arg0) {
		int var2 = field1175.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1176[var3] != 0) {
				method468(3, field1195[var3], (byte) 2);
				method468(3, field1209[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("TDBJVJCU.a(IB)Z")
	public final boolean method479(int arg0) {
		if (field1198[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("TDBJVJCU.c(II)I")
	public final int method480(int arg0) {
		return field1202[arg0] & 0xFF;
	}

	@ObfuscatedName("TDBJVJCU.e(I)V")
	public final void method481() {
		KRPFBUJX var2;
		synchronized (field1177) {
			var2 = (KRPFBUJX) field1177.method381();
		}

		while (var2 != null) {
			field1184 = true;
			byte[] var3 = null;
			if (field1199.field128[0] != null) {
				var3 = field1199.field128[var2.field801 + 1].method427(var2.field802);
			}

			if (!method466(var3, field1185[var2.field801][var2.field802], field1205[var2.field801][var2.field802])) {
				var3 = null;
			}

			synchronized (field1177) {
				if (var3 == null) {
					field1174.method379(var2);
				} else {
					var2.field804 = var3;

					synchronized (field1178) {
						field1178.method379(var2);
					}
				}

				var2 = (KRPFBUJX) field1177.method381();
			}
		}
	}

	@ObfuscatedName("TDBJVJCU.f(I)V")
	public final void method482() {
		field1192 = 0;
		field1193 = 0;
		for (KRPFBUJX var1 = (KRPFBUJX) field1203.method382(); var1 != null; var1 = (KRPFBUJX) field1203.method384()) {
			if (var1.field800) {
				field1192++;
			} else {
				field1193++;
			}
		}

		while (field1192 < 10) {
			KRPFBUJX var2 = (KRPFBUJX) field1174.method381();
			if (var2 == null) {
				break;
			}

			if (field1208[var2.field801][var2.field802] != 0) {
				field1189++;
			}

			field1208[var2.field801][var2.field802] = 0;
			field1203.method379(var2);
			field1192++;
			method473(var2);
			field1184 = true;
		}
	}

	public final void run() {
		try {
			while (field1204) {
				field1179++;
				byte var1 = 20;
				if (field1211 == 0 && field1199.field128[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1184 = true;
				for (int var2 = 0; var2 < 100 && field1184; var2++) {
					field1184 = false;
					method481();
					method482();

					if (field1192 == 0 && var2 >= 5) {
						break;
					}

					method484();

					if (field1180 != null) {
						method471();
					}
				}

				boolean var3 = false;
				for (KRPFBUJX var4 = (KRPFBUJX) field1203.method382(); var4 != null; var4 = (KRPFBUJX) field1203.method384()) {
					if (var4.field800) {
						var3 = true;
						var4.field803++;
						if (var4.field803 > 50) {
							var4.field803 = 0;
							method473(var4);
						}
					}
				}

				if (!var3) {
					for (KRPFBUJX var5 = (KRPFBUJX) field1203.method382(); var5 != null; var5 = (KRPFBUJX) field1203.method384()) {
						var3 = true;
						var5.field803++;
						if (var5.field803 > 50) {
							var5.field803 = 0;
							method473(var5);
						}
					}
				}

				if (var3) {
					field1207++;
					if (field1207 > 750) {
						try {
							field1194.close();
						} catch (Exception var8) {
						}

						field1194 = null;
						field1180 = null;
						field1187 = null;
						field1182 = 0;
					}
				} else {
					field1207 = 0;
					field1200 = "";
				}

				if (field1199.field219 && field1194 != null && field1187 != null && (field1211 > 0 || field1199.field128[0] == null)) {
					field1206++;
					if (field1206 > 500) {
						field1206 = 0;
						field1191[0] = 0;
						field1191[1] = 0;
						field1191[2] = 0;
						field1191[3] = 10;
						try {
							field1187.write(field1191, 0, 4);
						} catch (IOException var7) {
							field1207 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("TDBJVJCU.d(II)Z")
	public final boolean method483(int arg0) {
		for (int var2 = 0; var2 < field1175.length; var2++) {
			if (field1195[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("TDBJVJCU.g(I)V")
	public final void method484() {
		while (field1192 == 0) {
			if (field1193 >= 10 || field1211 == 0) {
				return;
			}

			KRPFBUJX var2;
			synchronized (field1212) {
				var2 = (KRPFBUJX) field1212.method381();
			}

			while (var2 != null) {
				if (field1208[var2.field801][var2.field802] != 0) {
					field1208[var2.field801][var2.field802] = 0;
					field1203.method379(var2);
					method473(var2);
					field1184 = true;

					if (field1189 < field1201) {
						field1189++;
					}

					field1200 = "Loading extra files - " + field1189 * 100 / field1201 + "%";
					field1193++;
					if (field1193 == 10) {
						return;
					}
				}

				synchronized (field1212) {
					var2 = (KRPFBUJX) field1212.method381();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1208[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1211) {
						var5[var7] = 0;
						KRPFBUJX var8 = new KRPFBUJX();
						var8.field801 = var4;
						var8.field802 = var7;
						var8.field800 = false;
						field1203.method379(var8);
						method473(var8);
						field1184 = true;

						if (field1189 < field1201) {
							field1189++;
						}

						field1200 = "Loading extra files - " + field1189 * 100 / field1201 + "%";
						field1193++;
						if (field1193 == 10) {
							return;
						}
					}
				}
			}

			field1211--;
		}
	}
}
