package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("SSXXGGTR")
public class SSXXGGTR extends FXLMBJDI implements Runnable {

	@ObfuscatedName("SSXXGGTR.a")
	public String field1214 = "";

	@ObfuscatedName("SSXXGGTR.c")
	public int[][] field1215 = new int[4][];

	@ObfuscatedName("SSXXGGTR.i")
	public byte[][] field1221 = new byte[4][];

	@ObfuscatedName("SSXXGGTR.k")
	public byte[] field1223 = new byte[65000];

	@ObfuscatedName("SSXXGGTR.m")
	public JQOEJEDB field1225 = new JQOEJEDB();

	@ObfuscatedName("SSXXGGTR.p")
	public boolean field1227 = true;

	@ObfuscatedName("SSXXGGTR.q")
	public JQOEJEDB field1228 = new JQOEJEDB();

	@ObfuscatedName("SSXXGGTR.u")
	public byte[] field1231 = new byte[500];

	@ObfuscatedName("SSXXGGTR.y")
	public JQOEJEDB field1232 = new JQOEJEDB();

	@ObfuscatedName("SSXXGGTR.B")
	public MMJBXXXO field1235 = new MMJBXXXO();

	@ObfuscatedName("SSXXGGTR.C")
	public JQOEJEDB field1236 = new JQOEJEDB();

	@ObfuscatedName("SSXXGGTR.P")
	public boolean field1248 = false;

	@ObfuscatedName("SSXXGGTR.Q")
	public JQOEJEDB field1249 = new JQOEJEDB();

	@ObfuscatedName("SSXXGGTR.R")
	public CRC32 field1250 = new CRC32();

	@ObfuscatedName("SSXXGGTR.T")
	public int[][] field1252 = new int[4][];

	@ObfuscatedName("SSXXGGTR.e")
	public int field1217;

	@ObfuscatedName("SSXXGGTR.f")
	public int field1218;

	@ObfuscatedName("SSXXGGTR.l")
	public int field1224;

	@ObfuscatedName("SSXXGGTR.r")
	public int field1229;

	@ObfuscatedName("SSXXGGTR.A")
	public int field1234;

	@ObfuscatedName("SSXXGGTR.E")
	public int field1238;

	@ObfuscatedName("SSXXGGTR.F")
	public int field1239;

	@ObfuscatedName("SSXXGGTR.G")
	public int field1240;

	@ObfuscatedName("SSXXGGTR.I")
	public int field1241;

	@ObfuscatedName("SSXXGGTR.J")
	public int field1242;

	@ObfuscatedName("SSXXGGTR.M")
	public int field1245;

	@ObfuscatedName("SSXXGGTR.z")
	public long field1233;

	@ObfuscatedName("SSXXGGTR.t")
	public LOBJUMRN field1230;

	@ObfuscatedName("SSXXGGTR.S")
	public client field1251;

	@ObfuscatedName("SSXXGGTR.n")
	public InputStream field1226;

	@ObfuscatedName("SSXXGGTR.O")
	public OutputStream field1247;

	@ObfuscatedName("SSXXGGTR.d")
	public Socket field1216;

	@ObfuscatedName("SSXXGGTR.g")
	public byte[] field1219;

	@ObfuscatedName("SSXXGGTR.h")
	public int[] field1220;

	@ObfuscatedName("SSXXGGTR.j")
	public int[] field1222;

	@ObfuscatedName("SSXXGGTR.D")
	public int[] field1237;

	@ObfuscatedName("SSXXGGTR.K")
	public int[] field1243;

	@ObfuscatedName("SSXXGGTR.L")
	public int[] field1244;

	@ObfuscatedName("SSXXGGTR.N")
	public int[] field1246;

	@ObfuscatedName("SSXXGGTR.b(I)V")
	public final void method529() {
		LOBJUMRN var2;
		synchronized (field1236) {
			var2 = (LOBJUMRN) field1236.method328();
		}

		while (var2 != null) {
			field1248 = true;
			byte[] var3 = null;
			if (field1251.field154[0] != null) {
				var3 = field1251.field154[var2.field992 + 1].method310(var2.field994);
			}

			if (!method546(field1252[var2.field992][var2.field994], field1215[var2.field992][var2.field994], var3)) {
				var3 = null;
			}

			synchronized (field1236) {
				if (var3 == null) {
					field1225.method326(var2);
				} else {
					var2.field996 = var3;

					synchronized (field1228) {
						field1228.method326(var2);
					}
				}

				var2 = (LOBJUMRN) field1236.method328();
			}
		}
	}

	@ObfuscatedName("SSXXGGTR.a(LSYUGXMZF;Lclient;)V")
	public final void method530(SYUGXMZF arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method551(var3[var4], null);
			int var6 = var5.length / 2;
			KHOMSBHW var7 = new KHOMSBHW(var5);
			field1252[var4] = new int[var6];
			field1221[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1252[var4][var8] = var7.method351();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method551(var9[var10], null);
			int var12 = var11.length / 4;
			KHOMSBHW var13 = new KHOMSBHW(var11);
			field1215[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1215[var10][var14] = var13.method354();
			}
		}

		byte[] var15 = arg0.method551("model_index", null);
		int var16 = field1252[0].length;
		field1219 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1219[var17] = var15[var17];
			} else {
				field1219[var17] = 0;
			}
		}

		byte[] var18 = arg0.method551("map_index", null);
		KHOMSBHW var19 = new KHOMSBHW(var18);
		int var20 = var18.length / 7;
		field1220 = new int[var20];
		field1237 = new int[var20];
		field1246 = new int[var20];
		field1222 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1220[var21] = var19.method351();
			field1237[var21] = var19.method351();
			field1246[var21] = var19.method351();
			field1222[var21] = var19.method349();
		}

		byte[] var22 = arg0.method551("anim_index", null);
		KHOMSBHW var23 = new KHOMSBHW(var22);
		int var24 = var22.length / 2;
		field1244 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1244[var25] = var23.method351();
		}

		byte[] var26 = arg0.method551("midi_index", null);
		KHOMSBHW var27 = new KHOMSBHW(var26);
		int var28 = var26.length;
		field1243 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1243[var29] = var27.method349();
		}

		field1251 = arg1;
		field1227 = true;
		field1251.method102(this, 2);
	}

	@ObfuscatedName("SSXXGGTR.a(II)V")
	public final void method531(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1252.length && arg1 >= 0 && arg1 <= field1252[arg0].length && field1252[arg0][arg1] != 0) {
			synchronized (field1235) {
				for (LOBJUMRN var4 = (LOBJUMRN) field1235.method406(); var4 != null; var4 = (LOBJUMRN) field1235.method407()) {
					if (var4.field992 == arg0 && var4.field994 == arg1) {
						return;
					}
				}

				LOBJUMRN var5 = new LOBJUMRN();
				var5.field992 = arg0;
				var5.field994 = arg1;
				var5.field993 = true;

				synchronized (field1236) {
					field1236.method326(var5);
				}

				field1235.method404(var5);
			}
		}
	}

	@ObfuscatedName("SSXXGGTR.a()LLOBJUMRN;")
	public final LOBJUMRN method532() {
		LOBJUMRN var2;
		synchronized (field1228) {
			var2 = (LOBJUMRN) field1228.method328();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1235) {
			var2.method409();
		}

		if (var2.field996 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field996));
			while (true) {
				if (field1223.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1223, var4, field1223.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field996 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field996[var7] = field1223[var7];
		}

		return var2;
	}

	@ObfuscatedName("SSXXGGTR.b(II)Z")
	public final boolean method533(int arg0) {
		for (int var2 = 0; var2 < field1220.length; var2++) {
			if (field1246[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("SSXXGGTR.c(II)Z")
	public final boolean method534(int arg0) {
		if (field1243[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("SSXXGGTR.a(B)V")
	public final void method535() {
		synchronized (field1249) {
			field1249.method333();
		}
	}

	@ObfuscatedName("SSXXGGTR.a(IZBI)V")
	public final void method536(int arg0, byte arg1, int arg2) {
		if (field1251.field154[0] != null && field1252[arg2][arg0] != 0) {
			byte[] var4 = field1251.field154[arg2 + 1].method310(arg0);
			if (!method546(field1252[arg2][arg0], field1215[arg2][arg0], var4)) {
				field1221[arg2][arg0] = arg1;

				if (arg1 > field1229) {
					field1229 = arg1;
				}

				field1234++;
			}
		}
	}

	@ObfuscatedName("SSXXGGTR.b()I")
	public final int method537() {
		synchronized (field1235) {
			return field1235.method408();
		}
	}

	@ObfuscatedName("SSXXGGTR.c(I)V")
	public final void method538() {
		field1217 = 0;
		field1218 = 0;
		for (LOBJUMRN var1 = (LOBJUMRN) field1232.method329(); var1 != null; var1 = (LOBJUMRN) field1232.method331()) {
			if (var1.field993) {
				field1217++;
			} else {
				field1218++;
			}
		}

		while (field1217 < 10) {
			LOBJUMRN var2 = (LOBJUMRN) field1225.method328();
			if (var2 == null) {
				break;
			}

			if (field1221[var2.field992][var2.field994] != 0) {
				field1242++;
			}

			field1221[var2.field992][var2.field994] = 0;
			field1232.method326(var2);
			field1217++;
			method547(var2);
			field1248 = true;
		}
	}

	@ObfuscatedName("SSXXGGTR.a(IZ)V")
	public final void method539(boolean arg0) {
		int var2 = field1220.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1222[var3] != 0) {
				method536(field1246[var3], (byte) 2, 3);
				method536(field1237[var3], (byte) 2, 3);
			}
		}
	}

	@ObfuscatedName("SSXXGGTR.d(II)I")
	public final int method540(int arg0) {
		return field1219[arg0] & 0xFF;
	}

	@ObfuscatedName("SSXXGGTR.a(IIIZ)I")
	public final int method541(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field1220.length; var5++) {
			if (field1220[var5] == var4) {
				if (arg0 == 0) {
					return field1237[var5];
				}

				return field1246[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("SSXXGGTR.d(I)I")
	public final int method542() {
		return field1244.length;
	}

	@ObfuscatedName("SSXXGGTR.a(IBI)V")
	public final void method543(int arg0, int arg1) {
		if (field1251.field154[0] != null && (field1252[arg1][arg0] != 0 && (field1221[arg1][arg0] != 0 && field1229 != 0))) {
			LOBJUMRN var3 = new LOBJUMRN();
			var3.field992 = arg1;
			var3.field994 = arg0;
			var3.field993 = false;

			synchronized (field1249) {
				field1249.method326(var3);
			}
		}
	}

	@ObfuscatedName("SSXXGGTR.b(B)V")
	public final void method544() {
		while (field1217 == 0) {
			if (field1218 >= 10 || field1229 == 0) {
				return;
			}

			LOBJUMRN var2;
			synchronized (field1249) {
				var2 = (LOBJUMRN) field1249.method328();
			}

			while (var2 != null) {
				if (field1221[var2.field992][var2.field994] != 0) {
					field1221[var2.field992][var2.field994] = 0;
					field1232.method326(var2);
					method547(var2);
					field1248 = true;

					if (field1242 < field1234) {
						field1242++;
					}

					field1214 = "Loading extra files - " + field1242 * 100 / field1234 + "%";
					field1218++;
					if (field1218 == 10) {
						return;
					}
				}

				synchronized (field1249) {
					var2 = (LOBJUMRN) field1249.method328();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1221[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1229) {
						var5[var7] = 0;
						LOBJUMRN var8 = new LOBJUMRN();
						var8.field992 = var4;
						var8.field994 = var7;
						var8.field993 = false;
						field1232.method326(var8);
						method547(var8);
						field1248 = true;

						if (field1242 < field1234) {
							field1242++;
						}

						field1214 = "Loading extra files - " + field1242 * 100 / field1234 + "%";
						field1218++;
						if (field1218 == 10) {
							return;
						}
					}
				}
			}

			field1229--;
		}
	}

	public final void run() {
		try {
			while (field1227) {
				field1241++;
				byte var1 = 20;
				if (field1229 == 0 && field1251.field154[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1248 = true;
				for (int var2 = 0; var2 < 100 && field1248; var2++) {
					field1248 = false;
					method529();
					method538();

					if (field1217 == 0 && var2 >= 5) {
						break;
					}

					method544();

					if (field1226 != null) {
						method549();
					}
				}

				boolean var3 = false;
				for (LOBJUMRN var4 = (LOBJUMRN) field1232.method329(); var4 != null; var4 = (LOBJUMRN) field1232.method331()) {
					if (var4.field993) {
						var3 = true;
						var4.field995++;
						if (var4.field995 > 50) {
							var4.field995 = 0;
							method547(var4);
						}
					}
				}

				if (!var3) {
					for (LOBJUMRN var5 = (LOBJUMRN) field1232.method329(); var5 != null; var5 = (LOBJUMRN) field1232.method331()) {
						var3 = true;
						var5.field995++;
						if (var5.field995 > 50) {
							var5.field995 = 0;
							method547(var5);
						}
					}
				}

				if (var3) {
					field1240++;
					if (field1240 > 750) {
						try {
							field1216.close();
						} catch (Exception var8) {
						}

						field1216 = null;
						field1226 = null;
						field1247 = null;
						field1239 = 0;
					}
				} else {
					field1240 = 0;
					field1214 = "";
				}

				if (field1251.field198 && field1216 != null && field1247 != null && (field1229 > 0 || field1251.field154[0] == null)) {
					field1245++;
					if (field1245 > 500) {
						field1245 = 0;
						field1231[0] = 0;
						field1231[1] = 0;
						field1231[2] = 0;
						field1231[3] = 10;
						try {
							field1247.write(field1231, 0, 4);
						} catch (IOException var7) {
							field1240 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("SSXXGGTR.c()V")
	public final void method545() {
		field1227 = false;
	}

	@ObfuscatedName("SSXXGGTR.a(III[B)Z")
	public final boolean method546(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field1250.reset();
			field1250.update(arg2, 0, var4);
			int var6 = (int) field1250.getValue();

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

	@ObfuscatedName("SSXXGGTR.a(I)V")
	public final void method265(int arg0) {
		method531(0, arg0);
	}

	@ObfuscatedName("SSXXGGTR.a(ILLOBJUMRN;)V")
	public final void method547(LOBJUMRN arg0) {
		try {
			if (field1216 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1233 < 4000L) {
					return;
				}

				field1233 = var2;
				field1216 = field1251.method184(client.field326 + 43594);
				field1226 = field1216.getInputStream();
				field1247 = field1216.getOutputStream();
				field1247.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1226.read();
				}

				field1240 = 0;
			}

			field1231[0] = (byte) arg0.field992;
			field1231[1] = (byte) (arg0.field994 >> 8);
			field1231[2] = (byte) arg0.field994;
			if (arg0.field993) {
				field1231[3] = 2;
			} else if (field1251.field198) {
				field1231[3] = 0;
			} else {
				field1231[3] = 1;
			}

			field1247.write(field1231, 0, 4);
			field1245 = 0;
			field1224 = -10000;
		} catch (IOException var7) {
			try {
				field1216.close();
			} catch (Exception var6) {
			}

			field1216 = null;
			field1226 = null;
			field1247 = null;
			field1239 = 0;
			field1224++;
		}
	}

	@ObfuscatedName("SSXXGGTR.e(II)I")
	public final int method548(int arg0) {
		return field1252[arg0].length;
	}

	@ObfuscatedName("SSXXGGTR.c(B)V")
	public final void method549() {
		try {
			int var1 = field1226.available();
			if (field1239 == 0 && var1 >= 6) {
				field1248 = true;

				for (int var2 = 0; var2 < 6; var2 += field1226.read(field1231, var2, 6 - var2)) {
				}

				int var3 = field1231[0] & 0xFF;
				int var4 = ((field1231[1] & 0xFF) << 8) + (field1231[2] & 0xFF);
				int var5 = ((field1231[3] & 0xFF) << 8) + (field1231[4] & 0xFF);
				int var6 = field1231[5] & 0xFF;
				field1230 = null;
				for (LOBJUMRN var7 = (LOBJUMRN) field1232.method329(); var7 != null; var7 = (LOBJUMRN) field1232.method331()) {
					if (var7.field992 == var3 && var7.field994 == var4) {
						field1230 = var7;
					}

					if (field1230 != null) {
						var7.field995 = 0;
					}
				}

				if (field1230 != null) {
					field1240 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1230.field996 = null;

						if (field1230.field993) {
							synchronized (field1228) {
								field1228.method326(field1230);
							}
						} else {
							field1230.method1();
						}

						field1230 = null;
					} else {
						if (field1230.field996 == null && var6 == 0) {
							field1230.field996 = new byte[var5];
						}

						if (field1230.field996 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1238 = var6 * 500;
				field1239 = 500;
				if (field1239 > var5 - var6 * 500) {
					field1239 = var5 - var6 * 500;
				}
			}

			if (field1239 > 0 && var1 >= field1239) {
				field1248 = true;
				byte[] var9 = field1231;
				int var10 = 0;
				if (field1230 != null) {
					var9 = field1230.field996;
					var10 = field1238;
				}

				for (int var11 = 0; var11 < field1239; var11 += field1226.read(var9, var10 + var11, field1239 - var11)) {
				}

				if (field1239 + field1238 >= var9.length && field1230 != null) {
					if (field1251.field154[0] != null) {
						field1251.field154[field1230.field992 + 1].method311(field1230.field994, var9.length, var9);
					}

					if (!field1230.field993 && field1230.field992 == 3) {
						field1230.field993 = true;
						field1230.field992 = 93;
					}

					if (field1230.field993) {
						synchronized (field1228) {
							field1228.method326(field1230);
						}
					} else {
						field1230.method1();
					}
				}

				field1239 = 0;
			}
		} catch (IOException var17) {
			try {
				field1216.close();
			} catch (Exception var14) {
			}

			field1216 = null;
			field1226 = null;
			field1247 = null;
			field1239 = 0;
		}
	}
}
