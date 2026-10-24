package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("QUPTMIEH")
public class QUPTMIEH extends XXACLQCK implements Runnable {

	@ObfuscatedName("QUPTMIEH.a")
	public int[][] field1103 = new int[4][];

	@ObfuscatedName("QUPTMIEH.b")
	public VGFLNLXH field1104 = new VGFLNLXH();

	@ObfuscatedName("QUPTMIEH.c")
	public String field1105 = "";

	@ObfuscatedName("QUPTMIEH.d")
	public VGFLNLXH field1106 = new VGFLNLXH();

	@ObfuscatedName("QUPTMIEH.l")
	public VGFLNLXH field1112 = new VGFLNLXH();

	@ObfuscatedName("QUPTMIEH.p")
	public int[][] field1116 = new int[4][];

	@ObfuscatedName("QUPTMIEH.q")
	public VGFLNLXH field1117 = new VGFLNLXH();

	@ObfuscatedName("QUPTMIEH.u")
	public byte[][] field1120 = new byte[4][];

	@ObfuscatedName("QUPTMIEH.v")
	public byte[] field1121 = new byte[65000];

	@ObfuscatedName("QUPTMIEH.B")
	public boolean field1124 = true;

	@ObfuscatedName("QUPTMIEH.H")
	public boolean field1130 = false;

	@ObfuscatedName("QUPTMIEH.I")
	public TSCGUBKV field1131 = new TSCGUBKV();

	@ObfuscatedName("QUPTMIEH.J")
	public byte[] field1132 = new byte[500];

	@ObfuscatedName("QUPTMIEH.L")
	public CRC32 field1134 = new CRC32();

	@ObfuscatedName("QUPTMIEH.R")
	public VGFLNLXH field1140 = new VGFLNLXH();

	@ObfuscatedName("QUPTMIEH.e")
	public int field1107;

	@ObfuscatedName("QUPTMIEH.f")
	public int field1108;

	@ObfuscatedName("QUPTMIEH.g")
	public int field1109;

	@ObfuscatedName("QUPTMIEH.j")
	public int field1110;

	@ObfuscatedName("QUPTMIEH.k")
	public int field1111;

	@ObfuscatedName("QUPTMIEH.m")
	public int field1113;

	@ObfuscatedName("QUPTMIEH.n")
	public int field1114;

	@ObfuscatedName("QUPTMIEH.z")
	public int field1123;

	@ObfuscatedName("QUPTMIEH.M")
	public int field1135;

	@ObfuscatedName("QUPTMIEH.N")
	public int field1136;

	@ObfuscatedName("QUPTMIEH.P")
	public int field1138;

	@ObfuscatedName("QUPTMIEH.s")
	public long field1119;

	@ObfuscatedName("QUPTMIEH.G")
	public CPQQDQVK field1129;

	@ObfuscatedName("QUPTMIEH.y")
	public client field1122;

	@ObfuscatedName("QUPTMIEH.Q")
	public InputStream field1139;

	@ObfuscatedName("QUPTMIEH.r")
	public OutputStream field1118;

	@ObfuscatedName("QUPTMIEH.O")
	public Socket field1137;

	@ObfuscatedName("QUPTMIEH.C")
	public byte[] field1125;

	@ObfuscatedName("QUPTMIEH.o")
	public int[] field1115;

	@ObfuscatedName("QUPTMIEH.D")
	public int[] field1126;

	@ObfuscatedName("QUPTMIEH.E")
	public int[] field1127;

	@ObfuscatedName("QUPTMIEH.F")
	public int[] field1128;

	@ObfuscatedName("QUPTMIEH.K")
	public int[] field1133;

	@ObfuscatedName("QUPTMIEH.S")
	public int[] field1141;

	@ObfuscatedName("QUPTMIEH.a(LXOJZVVDK;Lclient;)V")
	public final void method377(XOJZVVDK arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method560(var3[var4], null);
			int var6 = var5.length / 2;
			PQBRPYKE var7 = new PQBRPYKE(var5);
			field1116[var4] = new int[var6];
			field1120[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field1116[var4][var8] = var7.method342();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method560(var9[var10], null);
			int var12 = var11.length / 4;
			PQBRPYKE var13 = new PQBRPYKE(var11);
			field1103[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field1103[var10][var14] = var13.method345();
			}
		}

		byte[] var15 = arg0.method560("model_index", null);
		int var16 = field1116[0].length;
		field1125 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field1125[var17] = var15[var17];
			} else {
				field1125[var17] = 0;
			}
		}

		byte[] var18 = arg0.method560("map_index", null);
		PQBRPYKE var19 = new PQBRPYKE(var18);
		int var20 = var18.length / 7;
		field1127 = new int[var20];
		field1115 = new int[var20];
		field1141 = new int[var20];
		field1126 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field1127[var21] = var19.method342();
			field1115[var21] = var19.method342();
			field1141[var21] = var19.method342();
			field1126[var21] = var19.method340();
		}

		byte[] var22 = arg0.method560("anim_index", null);
		PQBRPYKE var23 = new PQBRPYKE(var22);
		int var24 = var22.length / 2;
		field1128 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field1128[var25] = var23.method342();
		}

		byte[] var26 = arg0.method560("midi_index", null);
		PQBRPYKE var27 = new PQBRPYKE(var26);
		int var28 = var26.length;
		field1133 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field1133[var29] = var27.method340();
		}

		field1122 = arg1;
		field1124 = true;
		field1122.method139(this, 2);
	}

	@ObfuscatedName("QUPTMIEH.a(II)I")
	public final int method378(int arg0) {
		return field1125[arg0] & 0xFF;
	}

	@ObfuscatedName("QUPTMIEH.b(I)V")
	public final void method379() {
		try {
			int var1 = field1139.available();
			if (field1108 == 0 && var1 >= 6) {
				field1130 = true;

				for (int var2 = 0; var2 < 6; var2 += field1139.read(field1132, var2, 6 - var2)) {
				}

				int var3 = field1132[0] & 0xFF;
				int var4 = ((field1132[1] & 0xFF) << 8) + (field1132[2] & 0xFF);
				int var5 = ((field1132[3] & 0xFF) << 8) + (field1132[4] & 0xFF);
				int var6 = field1132[5] & 0xFF;
				field1129 = null;
				for (CPQQDQVK var7 = (CPQQDQVK) field1106.method532(); var7 != null; var7 = (CPQQDQVK) field1106.method534()) {
					if (var7.field559 == var3 && var7.field561 == var4) {
						field1129 = var7;
					}

					if (field1129 != null) {
						var7.field557 = 0;
					}
				}

				if (field1129 != null) {
					field1109 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field1129.field558 = null;

						if (field1129.field560) {
							synchronized (field1104) {
								field1104.method529(field1129);
							}
						} else {
							field1129.method163();
						}

						field1129 = null;
					} else {
						if (field1129.field558 == null && var6 == 0) {
							field1129.field558 = new byte[var5];
						}

						if (field1129.field558 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field1107 = var6 * 500;
				field1108 = 500;
				if (field1108 > var5 - var6 * 500) {
					field1108 = var5 - var6 * 500;
				}
			}

			if (field1108 > 0 && var1 >= field1108) {
				field1130 = true;
				byte[] var9 = field1132;
				int var10 = 0;
				if (field1129 != null) {
					var9 = field1129.field558;
					var10 = field1107;
				}

				for (int var11 = 0; var11 < field1108; var11 += field1139.read(var9, var10 + var11, field1108 - var11)) {
				}

				if (field1108 + field1107 >= var9.length && field1129 != null) {
					if (field1122.field115[0] != null) {
						field1122.field115[field1129.field559 + 1].method569(var9, var9.length, field1129.field561);
					}

					if (!field1129.field560 && field1129.field559 == 3) {
						field1129.field560 = true;
						field1129.field559 = 93;
					}

					if (field1129.field560) {
						synchronized (field1104) {
							field1104.method529(field1129);
						}
					} else {
						field1129.method163();
					}
				}

				field1108 = 0;
			}
		} catch (IOException var17) {
			try {
				field1137.close();
			} catch (Exception var14) {
			}

			field1137 = null;
			field1139 = null;
			field1118 = null;
			field1108 = 0;
		}
	}

	@ObfuscatedName("QUPTMIEH.b(II)Z")
	public final boolean method380(int arg0) {
		if (field1133[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("QUPTMIEH.a(I)V")
	public final void method381(int arg0) {
		method382(0, arg0);
	}

	@ObfuscatedName("QUPTMIEH.c(II)V")
	public final void method382(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field1116.length && arg1 >= 0 && arg1 <= field1116[arg0].length && field1116[arg0][arg1] != 0) {
			synchronized (field1131) {
				for (CPQQDQVK var4 = (CPQQDQVK) field1131.method461(); var4 != null; var4 = (CPQQDQVK) field1131.method462()) {
					if (var4.field559 == arg0 && var4.field561 == arg1) {
						return;
					}
				}

				CPQQDQVK var5 = new CPQQDQVK();
				var5.field559 = arg0;
				var5.field561 = arg1;
				var5.field560 = true;

				synchronized (field1112) {
					field1112.method529(var5);
				}

				field1131.method459(var5);
			}
		}
	}

	@ObfuscatedName("QUPTMIEH.a(III)V")
	public final void method383(int arg0, int arg1) {
		if (field1122.field115[0] != null && (field1116[arg1][arg0] != 0 && (field1120[arg1][arg0] != 0 && field1113 != 0))) {
			CPQQDQVK var3 = new CPQQDQVK();
			var3.field559 = arg1;
			var3.field561 = arg0;
			var3.field560 = false;

			synchronized (field1117) {
				field1117.method529(var3);
			}
		}
	}

	@ObfuscatedName("QUPTMIEH.a(IIIB)I")
	public final int method384(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field1127.length; var5++) {
			if (field1127[var5] == var4) {
				if (arg0 == 0) {
					return field1115[var5];
				}

				return field1141[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("QUPTMIEH.a()I")
	public final int method385() {
		synchronized (field1131) {
			return field1131.method463();
		}
	}

	@ObfuscatedName("QUPTMIEH.c(I)V")
	public final void method386() {
		while (field1110 == 0) {
			if (field1111 >= 10 || field1113 == 0) {
				return;
			}

			CPQQDQVK var2;
			synchronized (field1117) {
				var2 = (CPQQDQVK) field1117.method531();
			}

			while (var2 != null) {
				if (field1120[var2.field559][var2.field561] != 0) {
					field1120[var2.field559][var2.field561] = 0;
					field1106.method529(var2);
					method397(var2);
					field1130 = true;

					if (field1114 < field1136) {
						field1114++;
					}

					field1105 = "Loading extra files - " + field1114 * 100 / field1136 + "%";
					field1111++;
					if (field1111 == 10) {
						return;
					}
				}

				synchronized (field1117) {
					var2 = (CPQQDQVK) field1117.method531();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field1120[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field1113) {
						var5[var7] = 0;
						CPQQDQVK var8 = new CPQQDQVK();
						var8.field559 = var4;
						var8.field561 = var7;
						var8.field560 = false;
						field1106.method529(var8);
						method397(var8);
						field1130 = true;

						if (field1114 < field1136) {
							field1114++;
						}

						field1105 = "Loading extra files - " + field1114 * 100 / field1136 + "%";
						field1111++;
						if (field1111 == 10) {
							return;
						}
					}
				}
			}

			field1113--;
		}
	}

	@ObfuscatedName("QUPTMIEH.d(I)I")
	public final int method387() {
		return field1128.length;
	}

	@ObfuscatedName("QUPTMIEH.b()LCPQQDQVK;")
	public final CPQQDQVK method388() {
		CPQQDQVK var2;
		synchronized (field1104) {
			var2 = (CPQQDQVK) field1104.method531();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field1131) {
			var2.method567();
		}

		if (var2.field558 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field558));
			while (true) {
				if (field1121.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field1121, var4, field1121.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field558 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field558[var7] = field1121[var7];
		}

		return var2;
	}

	@ObfuscatedName("QUPTMIEH.a(IIBI)V")
	public final void method389(int arg0, byte arg1, int arg2) {
		if (field1122.field115[0] != null && field1116[arg0][arg2] != 0) {
			byte[] var4 = field1122.field115[arg0 + 1].method568(arg2);
			if (!method391(field1116[arg0][arg2], var4, field1103[arg0][arg2])) {
				field1120[arg0][arg2] = arg1;

				if (arg1 > field1113) {
					field1113 = arg1;
				}

				field1136++;
			}
		}
	}

	@ObfuscatedName("QUPTMIEH.d(II)Z")
	public final boolean method390(int arg0) {
		for (int var2 = 0; var2 < field1127.length; var2++) {
			if (field1141[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("QUPTMIEH.a(I[BII)Z")
	public final boolean method391(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field1134.reset();
			field1134.update(arg1, 0, var4);
			int var6 = (int) field1134.getValue();

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

	@ObfuscatedName("QUPTMIEH.e(I)V")
	public final void method392() {
		synchronized (field1117) {
			field1117.method536();
		}
	}

	@ObfuscatedName("QUPTMIEH.a(IZ)V")
	public final void method393(boolean arg0) {
		int var2 = field1127.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field1126[var3] != 0) {
				method389(3, (byte) 2, field1141[var3]);
				method389(3, (byte) 2, field1115[var3]);
			}
		}
	}

	@ObfuscatedName("QUPTMIEH.c()V")
	public final void method394() {
		field1124 = false;
	}

	public final void run() {
		try {
			while (field1124) {
				field1123++;
				byte var1 = 20;
				if (field1113 == 0 && field1122.field115[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field1130 = true;
				for (int var2 = 0; var2 < 100 && field1130; var2++) {
					field1130 = false;
					method398();
					method395();

					if (field1110 == 0 && var2 >= 5) {
						break;
					}

					method386();

					if (field1139 != null) {
						method379();
					}
				}

				boolean var3 = false;
				for (CPQQDQVK var4 = (CPQQDQVK) field1106.method532(); var4 != null; var4 = (CPQQDQVK) field1106.method534()) {
					if (var4.field560) {
						var3 = true;
						var4.field557++;
						if (var4.field557 > 50) {
							var4.field557 = 0;
							method397(var4);
						}
					}
				}

				if (!var3) {
					for (CPQQDQVK var5 = (CPQQDQVK) field1106.method532(); var5 != null; var5 = (CPQQDQVK) field1106.method534()) {
						var3 = true;
						var5.field557++;
						if (var5.field557 > 50) {
							var5.field557 = 0;
							method397(var5);
						}
					}
				}

				if (var3) {
					field1109++;
					if (field1109 > 750) {
						try {
							field1137.close();
						} catch (Exception var8) {
						}

						field1137 = null;
						field1139 = null;
						field1118 = null;
						field1108 = 0;
					}
				} else {
					field1109 = 0;
					field1105 = "";
				}

				if (field1122.field412 && field1137 != null && field1118 != null && (field1113 > 0 || field1122.field115[0] == null)) {
					field1135++;
					if (field1135 > 500) {
						field1135 = 0;
						field1132[0] = 0;
						field1132[1] = 0;
						field1132[2] = 0;
						field1132[3] = 10;
						try {
							field1118.write(field1132, 0, 4);
						} catch (IOException var7) {
							field1109 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("QUPTMIEH.a(B)V")
	public final void method395() {
		field1110 = 0;
		field1111 = 0;
		for (CPQQDQVK var1 = (CPQQDQVK) field1106.method532(); var1 != null; var1 = (CPQQDQVK) field1106.method534()) {
			if (var1.field560) {
				field1110++;
			} else {
				field1111++;
			}
		}

		while (field1110 < 10) {
			CPQQDQVK var2 = (CPQQDQVK) field1140.method531();
			if (var2 == null) {
				break;
			}

			if (field1120[var2.field559][var2.field561] != 0) {
				field1114++;
			}

			field1120[var2.field559][var2.field561] = 0;
			field1106.method529(var2);
			field1110++;
			method397(var2);
			field1130 = true;
		}
	}

	@ObfuscatedName("QUPTMIEH.e(II)I")
	public final int method396(int arg0) {
		return field1116[arg0].length;
	}

	@ObfuscatedName("QUPTMIEH.a(LCPQQDQVK;Z)V")
	public final void method397(CPQQDQVK arg0) {
		try {
			if (field1137 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field1119 < 4000L) {
					return;
				}

				field1119 = var2;
				field1137 = field1122.method85(client.field226 + 43594);
				field1139 = field1137.getInputStream();
				field1118 = field1137.getOutputStream();
				field1118.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field1139.read();
				}

				field1109 = 0;
			}

			field1132[0] = (byte) arg0.field559;
			field1132[1] = (byte) (arg0.field561 >> 8);
			field1132[2] = (byte) arg0.field561;
			if (arg0.field560) {
				field1132[3] = 2;
			} else if (field1122.field412) {
				field1132[3] = 0;
			} else {
				field1132[3] = 1;
			}

			field1118.write(field1132, 0, 4);
			field1135 = 0;
			field1138 = -10000;
		} catch (IOException var7) {
			try {
				field1137.close();
			} catch (Exception var6) {
			}

			field1137 = null;
			field1139 = null;
			field1118 = null;
			field1108 = 0;
			field1138++;
		}
	}

	@ObfuscatedName("QUPTMIEH.b(B)V")
	public final void method398() {
		CPQQDQVK var2;
		synchronized (field1112) {
			var2 = (CPQQDQVK) field1112.method531();
		}

		while (var2 != null) {
			field1130 = true;
			byte[] var3 = null;
			if (field1122.field115[0] != null) {
				var3 = field1122.field115[var2.field559 + 1].method568(var2.field561);
			}

			if (!method391(field1116[var2.field559][var2.field561], var3, field1103[var2.field559][var2.field561])) {
				var3 = null;
			}

			synchronized (field1112) {
				if (var3 == null) {
					field1140.method529(var2);
				} else {
					var2.field558 = var3;

					synchronized (field1104) {
						field1104.method529(var2);
					}
				}

				var2 = (CPQQDQVK) field1112.method531();
			}
		}
	}
}
