package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("IBVXWOKK")
public class IBVXWOKK extends DDQOOZDX implements Runnable {

	@ObfuscatedName("IBVXWOKK.d")
	public NYZQPNXB field914 = new NYZQPNXB();

	@ObfuscatedName("IBVXWOKK.e")
	public byte[][] field915 = new byte[4][];

	@ObfuscatedName("IBVXWOKK.g")
	public NYZQPNXB field916 = new NYZQPNXB();

	@ObfuscatedName("IBVXWOKK.k")
	public int[][] field919 = new int[4][];

	@ObfuscatedName("IBVXWOKK.n")
	public byte[] field922 = new byte[65000];

	@ObfuscatedName("IBVXWOKK.o")
	public EZRJDJYN field923 = new EZRJDJYN();

	@ObfuscatedName("IBVXWOKK.p")
	public boolean field924 = false;

	@ObfuscatedName("IBVXWOKK.t")
	public NYZQPNXB field927 = new NYZQPNXB();

	@ObfuscatedName("IBVXWOKK.w")
	public NYZQPNXB field930 = new NYZQPNXB();

	@ObfuscatedName("IBVXWOKK.B")
	public CRC32 field935 = new CRC32();

	@ObfuscatedName("IBVXWOKK.F")
	public int[][] field939 = new int[4][];

	@ObfuscatedName("IBVXWOKK.J")
	public boolean field942 = true;

	@ObfuscatedName("IBVXWOKK.K")
	public String field943 = "";

	@ObfuscatedName("IBVXWOKK.M")
	public byte[] field944 = new byte[500];

	@ObfuscatedName("IBVXWOKK.S")
	public NYZQPNXB field949 = new NYZQPNXB();

	@ObfuscatedName("IBVXWOKK.b")
	public int field912;

	@ObfuscatedName("IBVXWOKK.c")
	public int field913;

	@ObfuscatedName("IBVXWOKK.h")
	public int field917;

	@ObfuscatedName("IBVXWOKK.i")
	public int field918;

	@ObfuscatedName("IBVXWOKK.l")
	public int field920;

	@ObfuscatedName("IBVXWOKK.q")
	public int field925;

	@ObfuscatedName("IBVXWOKK.y")
	public int field932;

	@ObfuscatedName("IBVXWOKK.z")
	public int field933;

	@ObfuscatedName("IBVXWOKK.E")
	public int field938;

	@ObfuscatedName("IBVXWOKK.O")
	public int field945;

	@ObfuscatedName("IBVXWOKK.P")
	public int field946;

	@ObfuscatedName("IBVXWOKK.r")
	public long field926;

	@ObfuscatedName("IBVXWOKK.G")
	public BYVCZVKG field940;

	@ObfuscatedName("IBVXWOKK.R")
	public client field948;

	@ObfuscatedName("IBVXWOKK.v")
	public InputStream field929;

	@ObfuscatedName("IBVXWOKK.D")
	public OutputStream field937;

	@ObfuscatedName("IBVXWOKK.C")
	public Socket field936;

	@ObfuscatedName("IBVXWOKK.a")
	public byte[] field911;

	@ObfuscatedName("IBVXWOKK.m")
	public int[] field921;

	@ObfuscatedName("IBVXWOKK.u")
	public int[] field928;

	@ObfuscatedName("IBVXWOKK.x")
	public int[] field931;

	@ObfuscatedName("IBVXWOKK.A")
	public int[] field934;

	@ObfuscatedName("IBVXWOKK.H")
	public int[] field941;

	@ObfuscatedName("IBVXWOKK.Q")
	public int[] field947;

	@ObfuscatedName("IBVXWOKK.a(ZI)Z")
	public final boolean method276(int arg0) {
		for (int var2 = 0; var2 < field928.length; var2++) {
			if (field931[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("IBVXWOKK.a(IIII)I")
	public final int method277(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field928.length; var5++) {
			if (field928[var5] == var4) {
				if (arg2 == 0) {
					return field934[var5];
				}

				return field931[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("IBVXWOKK.a(IZ)V")
	public final void method278(boolean arg0) {
		int var2 = field928.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field921[var3] != 0) {
				method284(3, field931[var3], (byte) 2);
				method284(3, field934[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("IBVXWOKK.a(BII[B)Z")
	public final boolean method279(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field935.reset();
			field935.update(arg2, 0, var4);
			int var6 = (int) field935.getValue();

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

	@ObfuscatedName("IBVXWOKK.a(III)V")
	public final void method280(int arg0, int arg1) {
		if (field948.field615[0] != null && (field919[arg0][arg1] != 0 && (field915[arg0][arg1] != 0 && field938 != 0))) {
			BYVCZVKG var3 = new BYVCZVKG();
			var3.field140 = arg0;
			var3.field139 = arg1;
			var3.field138 = false;

			synchronized (field914) {
				field914.method337(var3);
			}
		}
	}

	@ObfuscatedName("IBVXWOKK.b(I)I")
	public final int method281() {
		return field947.length;
	}

	@ObfuscatedName("IBVXWOKK.c(I)V")
	public final void method282() {
		field945 = 0;
		field946 = 0;
		for (BYVCZVKG var1 = (BYVCZVKG) field916.method340(); var1 != null; var1 = (BYVCZVKG) field916.method342()) {
			if (var1.field138) {
				field945++;
			} else {
				field946++;
			}
		}

		while (field945 < 10) {
			BYVCZVKG var2 = (BYVCZVKG) field930.method339();
			if (var2 == null) {
				break;
			}

			if (field915[var2.field140][var2.field139] != 0) {
				field913++;
			}

			field915[var2.field140][var2.field139] = 0;
			field916.method337(var2);
			field945++;
			method289(var2);
			field924 = true;
		}
	}

	@ObfuscatedName("IBVXWOKK.a()LBYVCZVKG;")
	public final BYVCZVKG method283() {
		BYVCZVKG var2;
		synchronized (field927) {
			var2 = (BYVCZVKG) field927.method339();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field923) {
			var2.method371();
		}

		if (var2.field142 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field142));
			while (true) {
				if (field922.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field922, var4, field922.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field142 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field142[var7] = field922[var7];
		}

		return var2;
	}

	@ObfuscatedName("IBVXWOKK.a(IIIB)V")
	public final void method284(int arg0, int arg1, byte arg2) {
		if (field948.field615[0] != null && field919[arg0][arg1] != 0) {
			byte[] var4 = field948.field615[arg0 + 1].method300(arg1);
			if (!method279(field919[arg0][arg1], field939[arg0][arg1], var4)) {
				field915[arg0][arg1] = arg2;

				if (arg2 > field938) {
					field938 = arg2;
				}

				field920++;
			}
		}
	}

	@ObfuscatedName("IBVXWOKK.d(I)V")
	public final void method285() {
		synchronized (field914) {
			field914.method344();
		}
	}

	@ObfuscatedName("IBVXWOKK.b()V")
	public final void method286() {
		field942 = false;
	}

	@ObfuscatedName("IBVXWOKK.b(ZI)I")
	public final int method287(int arg0) {
		return field911[arg0] & 0xFF;
	}

	@ObfuscatedName("IBVXWOKK.e(I)V")
	public final void method288() {
		while (field945 == 0) {
			if (field946 >= 10 || field938 == 0) {
				return;
			}

			BYVCZVKG var2;
			synchronized (field914) {
				var2 = (BYVCZVKG) field914.method339();
			}

			while (var2 != null) {
				if (field915[var2.field140][var2.field139] != 0) {
					field915[var2.field140][var2.field139] = 0;
					field916.method337(var2);
					method289(var2);
					field924 = true;

					if (field913 < field920) {
						field913++;
					}

					field943 = "Loading extra files - " + field913 * 100 / field920 + "%";
					field946++;
					if (field946 == 10) {
						return;
					}
				}

				synchronized (field914) {
					var2 = (BYVCZVKG) field914.method339();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field915[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field938) {
						var5[var7] = 0;
						BYVCZVKG var8 = new BYVCZVKG();
						var8.field140 = var4;
						var8.field139 = var7;
						var8.field138 = false;
						field916.method337(var8);
						method289(var8);
						field924 = true;

						if (field913 < field920) {
							field913++;
						}

						field943 = "Loading extra files - " + field913 * 100 / field920 + "%";
						field946++;
						if (field946 == 10) {
							return;
						}
					}
				}
			}

			field938--;
		}
	}

	@ObfuscatedName("IBVXWOKK.a(LBYVCZVKG;Z)V")
	public final void method289(BYVCZVKG arg0) {
		try {
			if (field936 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field926 < 4000L) {
					return;
				}

				field926 = var2;
				field936 = field948.method145(client.field367 + 43594);
				field929 = field936.getInputStream();
				field937 = field936.getOutputStream();
				field937.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field929.read();
				}

				field912 = 0;
			}

			field944[0] = (byte) arg0.field140;
			field944[1] = (byte) (arg0.field139 >> 8);
			field944[2] = (byte) arg0.field139;
			if (arg0.field138) {
				field944[3] = 2;
			} else if (field948.field613) {
				field944[3] = 0;
			} else {
				field944[3] = 1;
			}

			field937.write(field944, 0, 4);
			field925 = 0;
			field918 = -10000;
		} catch (IOException var7) {
			try {
				field936.close();
			} catch (Exception var6) {
			}

			field936 = null;
			field929 = null;
			field937 = null;
			field933 = 0;
			field918++;
		}
	}

	@ObfuscatedName("IBVXWOKK.a(Z)V")
	public final void method290() {
		BYVCZVKG var2;
		synchronized (field949) {
			var2 = (BYVCZVKG) field949.method339();
		}

		while (var2 != null) {
			field924 = true;
			byte[] var3 = null;
			if (field948.field615[0] != null) {
				var3 = field948.field615[var2.field140 + 1].method300(var2.field139);
			}

			if (!method279(field919[var2.field140][var2.field139], field939[var2.field140][var2.field139], var3)) {
				var3 = null;
			}

			synchronized (field949) {
				if (var3 == null) {
					field930.method337(var2);
				} else {
					var2.field142 = var3;

					synchronized (field927) {
						field927.method337(var2);
					}
				}

				var2 = (BYVCZVKG) field949.method339();
			}
		}
	}

	@ObfuscatedName("IBVXWOKK.c()I")
	public final int method291() {
		synchronized (field923) {
			return field923.method194();
		}
	}

	@ObfuscatedName("IBVXWOKK.a(II)V")
	public final void method292(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field919.length && arg1 >= 0 && arg1 <= field919[arg0].length && field919[arg0][arg1] != 0) {
			synchronized (field923) {
				for (BYVCZVKG var4 = (BYVCZVKG) field923.method192(); var4 != null; var4 = (BYVCZVKG) field923.method193()) {
					if (var4.field140 == arg0 && var4.field139 == arg1) {
						return;
					}
				}

				BYVCZVKG var5 = new BYVCZVKG();
				var5.field140 = arg0;
				var5.field139 = arg1;
				var5.field138 = true;

				synchronized (field949) {
					field949.method337(var5);
				}

				field923.method190(var5);
			}
		}
	}

	@ObfuscatedName("IBVXWOKK.a(BI)I")
	public final int method293(int arg0) {
		return field919[arg0].length;
	}

	@ObfuscatedName("IBVXWOKK.b(Z)V")
	public final void method294() {
		try {
			int var1 = field929.available();
			if (field933 == 0 && var1 >= 6) {
				field924 = true;

				for (int var2 = 0; var2 < 6; var2 += field929.read(field944, var2, 6 - var2)) {
				}

				int var3 = field944[0] & 0xFF;
				int var4 = ((field944[1] & 0xFF) << 8) + (field944[2] & 0xFF);
				int var5 = ((field944[3] & 0xFF) << 8) + (field944[4] & 0xFF);
				int var6 = field944[5] & 0xFF;
				field940 = null;
				for (BYVCZVKG var7 = (BYVCZVKG) field916.method340(); var7 != null; var7 = (BYVCZVKG) field916.method342()) {
					if (var7.field140 == var3 && var7.field139 == var4) {
						field940 = var7;
					}

					if (field940 != null) {
						var7.field141 = 0;
					}
				}

				if (field940 != null) {
					field912 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field940.field142 = null;

						if (field940.field138) {
							synchronized (field927) {
								field927.method337(field940);
							}
						} else {
							field940.method41();
						}

						field940 = null;
					} else {
						if (field940.field142 == null && var6 == 0) {
							field940.field142 = new byte[var5];
						}

						if (field940.field142 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field932 = var6 * 500;
				field933 = 500;
				if (field933 > var5 - var6 * 500) {
					field933 = var5 - var6 * 500;
				}
			}

			if (field933 > 0 && var1 >= field933) {
				field924 = true;
				byte[] var9 = field944;
				int var10 = 0;
				if (field940 != null) {
					var9 = field940.field142;
					var10 = field932;
				}

				for (int var11 = 0; var11 < field933; var11 += field929.read(var9, var10 + var11, field933 - var11)) {
				}

				if (field933 + field932 >= var9.length && field940 != null) {
					if (field948.field615[0] != null) {
						field948.field615[field940.field140 + 1].method301(field940.field139, var9.length, var9);
					}

					if (!field940.field138 && field940.field140 == 3) {
						field940.field138 = true;
						field940.field140 = 93;
					}

					if (field940.field138) {
						synchronized (field927) {
							field927.method337(field940);
						}
					} else {
						field940.method41();
					}
				}

				field933 = 0;
			}
		} catch (IOException var17) {
			try {
				field936.close();
			} catch (Exception var14) {
			}

			field936 = null;
			field929 = null;
			field937 = null;
			field933 = 0;
		}
	}

	@ObfuscatedName("IBVXWOKK.a(LLKPVZAQN;Lclient;)V")
	public final void method295(LKPVZAQN arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method323(var3[var4], null);
			int var6 = var5.length / 2;
			WBEWPIXO var7 = new WBEWPIXO(var5);
			field919[var4] = new int[var6];
			field915[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field919[var4][var8] = var7.method517();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method323(var9[var10], null);
			int var12 = var11.length / 4;
			WBEWPIXO var13 = new WBEWPIXO(var11);
			field939[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field939[var10][var14] = var13.method520();
			}
		}

		byte[] var15 = arg0.method323("model_index", null);
		int var16 = field919[0].length;
		field911 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field911[var17] = var15[var17];
			} else {
				field911[var17] = 0;
			}
		}

		byte[] var18 = arg0.method323("map_index", null);
		WBEWPIXO var19 = new WBEWPIXO(var18);
		int var20 = var18.length / 7;
		field928 = new int[var20];
		field934 = new int[var20];
		field931 = new int[var20];
		field921 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field928[var21] = var19.method517();
			field934[var21] = var19.method517();
			field931[var21] = var19.method517();
			field921[var21] = var19.method515();
		}

		byte[] var22 = arg0.method323("anim_index", null);
		WBEWPIXO var23 = new WBEWPIXO(var22);
		int var24 = var22.length / 2;
		field947 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field947[var25] = var23.method517();
		}

		byte[] var26 = arg0.method323("midi_index", null);
		WBEWPIXO var27 = new WBEWPIXO(var26);
		int var28 = var26.length;
		field941 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field941[var29] = var27.method515();
		}

		field948 = arg1;
		field942 = true;
		field948.method25(this, 2);
	}

	public final void run() {
		try {
			while (field942) {
				field917++;
				byte var1 = 20;
				if (field938 == 0 && field948.field615[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field924 = true;
				for (int var2 = 0; var2 < 100 && field924; var2++) {
					field924 = false;
					method290();
					method282();

					if (field945 == 0 && var2 >= 5) {
						break;
					}

					method288();

					if (field929 != null) {
						method294();
					}
				}

				boolean var3 = false;
				for (BYVCZVKG var4 = (BYVCZVKG) field916.method340(); var4 != null; var4 = (BYVCZVKG) field916.method342()) {
					if (var4.field138) {
						var3 = true;
						var4.field141++;
						if (var4.field141 > 50) {
							var4.field141 = 0;
							method289(var4);
						}
					}
				}

				if (!var3) {
					for (BYVCZVKG var5 = (BYVCZVKG) field916.method340(); var5 != null; var5 = (BYVCZVKG) field916.method342()) {
						var3 = true;
						var5.field141++;
						if (var5.field141 > 50) {
							var5.field141 = 0;
							method289(var5);
						}
					}
				}

				if (var3) {
					field912++;
					if (field912 > 750) {
						try {
							field936.close();
						} catch (Exception var8) {
						}

						field936 = null;
						field929 = null;
						field937 = null;
						field933 = 0;
					}
				} else {
					field912 = 0;
					field943 = "";
				}

				if (field948.field613 && field936 != null && field937 != null && (field938 > 0 || field948.field615[0] == null)) {
					field925++;
					if (field925 > 500) {
						field925 = 0;
						field944[0] = 0;
						field944[1] = 0;
						field944[2] = 0;
						field944[3] = 10;
						try {
							field937.write(field944, 0, 4);
						} catch (IOException var7) {
							field912 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("IBVXWOKK.a(I)V")
	public final void method188(int arg0) {
		method292(0, arg0);
	}

	@ObfuscatedName("IBVXWOKK.b(II)Z")
	public final boolean method296(int arg0) {
		if (field941[arg0] == 1) {
			return true;
		}

		return false;
	}
}
