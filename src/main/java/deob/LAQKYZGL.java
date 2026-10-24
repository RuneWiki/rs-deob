package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("LAQKYZGL")
public class LAQKYZGL extends LZZYACWA implements Runnable {

	@ObfuscatedName("LAQKYZGL.e")
	public byte[] field938 = new byte[65000];

	@ObfuscatedName("LAQKYZGL.f")
	public int[][] field939 = new int[4][];

	@ObfuscatedName("LAQKYZGL.j")
	public boolean field943 = false;

	@ObfuscatedName("LAQKYZGL.p")
	public VLUKUYNM field947 = new VLUKUYNM();

	@ObfuscatedName("LAQKYZGL.q")
	public TOAGRHDF field948 = new TOAGRHDF();

	@ObfuscatedName("LAQKYZGL.r")
	public boolean field949 = true;

	@ObfuscatedName("LAQKYZGL.s")
	public int[][] field950 = new int[4][];

	@ObfuscatedName("LAQKYZGL.t")
	public VLUKUYNM field951 = new VLUKUYNM();

	@ObfuscatedName("LAQKYZGL.u")
	public VLUKUYNM field952 = new VLUKUYNM();

	@ObfuscatedName("LAQKYZGL.B")
	public String field957 = "";

	@ObfuscatedName("LAQKYZGL.M")
	public VLUKUYNM field965 = new VLUKUYNM();

	@ObfuscatedName("LAQKYZGL.Q")
	public byte[][] field969 = new byte[4][];

	@ObfuscatedName("LAQKYZGL.R")
	public VLUKUYNM field970 = new VLUKUYNM();

	@ObfuscatedName("LAQKYZGL.S")
	public byte[] field971 = new byte[500];

	@ObfuscatedName("LAQKYZGL.T")
	public CRC32 field972 = new CRC32();

	@ObfuscatedName("LAQKYZGL.b")
	public int field935;

	@ObfuscatedName("LAQKYZGL.h")
	public int field941;

	@ObfuscatedName("LAQKYZGL.i")
	public int field942;

	@ObfuscatedName("LAQKYZGL.o")
	public int field946;

	@ObfuscatedName("LAQKYZGL.v")
	public int field953;

	@ObfuscatedName("LAQKYZGL.y")
	public int field955;

	@ObfuscatedName("LAQKYZGL.z")
	public int field956;

	@ObfuscatedName("LAQKYZGL.C")
	public int field958;

	@ObfuscatedName("LAQKYZGL.D")
	public int field959;

	@ObfuscatedName("LAQKYZGL.E")
	public int field960;

	@ObfuscatedName("LAQKYZGL.L")
	public int field964;

	@ObfuscatedName("LAQKYZGL.H")
	public long field962;

	@ObfuscatedName("LAQKYZGL.N")
	public SFALJUFQ field966;

	@ObfuscatedName("LAQKYZGL.O")
	public client field967;

	@ObfuscatedName("LAQKYZGL.n")
	public InputStream field945;

	@ObfuscatedName("LAQKYZGL.P")
	public OutputStream field968;

	@ObfuscatedName("LAQKYZGL.g")
	public Socket field940;

	@ObfuscatedName("LAQKYZGL.k")
	public byte[] field944;

	@ObfuscatedName("LAQKYZGL.a")
	public int[] field934;

	@ObfuscatedName("LAQKYZGL.c")
	public int[] field936;

	@ObfuscatedName("LAQKYZGL.d")
	public int[] field937;

	@ObfuscatedName("LAQKYZGL.w")
	public int[] field954;

	@ObfuscatedName("LAQKYZGL.F")
	public int[] field961;

	@ObfuscatedName("LAQKYZGL.J")
	public int[] field963;

	@ObfuscatedName("LAQKYZGL.b(I)V")
	public final void method288() {
		while (field955 == 0) {
			if (field956 >= 10 || field935 == 0) {
				return;
			}

			SFALJUFQ var2;
			synchronized (field970) {
				var2 = (SFALJUFQ) field970.method360();
			}

			while (var2 != null) {
				if (field969[var2.field1161][var2.field1164] != 0) {
					field969[var2.field1161][var2.field1164] = 0;
					field952.method358(var2);
					method289(var2);
					field943 = true;

					if (field946 < field959) {
						field946++;
					}

					field957 = "Loading extra files - " + field946 * 100 / field959 + "%";
					field956++;
					if (field956 == 10) {
						return;
					}
				}

				synchronized (field970) {
					var2 = (SFALJUFQ) field970.method360();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field969[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field935) {
						var5[var7] = 0;
						SFALJUFQ var8 = new SFALJUFQ();
						var8.field1161 = var4;
						var8.field1164 = var7;
						var8.field1163 = false;
						field952.method358(var8);
						method289(var8);
						field943 = true;

						if (field946 < field959) {
							field946++;
						}

						field957 = "Loading extra files - " + field946 * 100 / field959 + "%";
						field956++;
						if (field956 == 10) {
							return;
						}
					}
				}
			}

			field935--;
		}
	}

	@ObfuscatedName("LAQKYZGL.a(LSFALJUFQ;Z)V")
	public final void method289(SFALJUFQ arg0) {
		try {
			if (field940 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field962 < 4000L) {
					return;
				}

				field962 = var2;
				field940 = field967.method144(client.field418 + 43594);
				field945 = field940.getInputStream();
				field968 = field940.getOutputStream();
				field968.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field945.read();
				}

				field958 = 0;
			}

			field971[0] = (byte) arg0.field1161;
			field971[1] = (byte) (arg0.field1164 >> 8);
			field971[2] = (byte) arg0.field1164;
			if (arg0.field1163) {
				field971[3] = 2;
			} else if (field967.field289) {
				field971[3] = 0;
			} else {
				field971[3] = 1;
			}

			field968.write(field971, 0, 4);
			field960 = 0;
			field953 = -10000;
		} catch (IOException var7) {
			try {
				field940.close();
			} catch (Exception var6) {
			}

			field940 = null;
			field945 = null;
			field968 = null;
			field942 = 0;
			field953++;
		}
	}

	@ObfuscatedName("LAQKYZGL.a(Z)V")
	public final void method290() {
		field955 = 0;
		field956 = 0;
		for (SFALJUFQ var1 = (SFALJUFQ) field952.method361(); var1 != null; var1 = (SFALJUFQ) field952.method363()) {
			if (var1.field1163) {
				field955++;
			} else {
				field956++;
			}
		}

		while (field955 < 10) {
			SFALJUFQ var2 = (SFALJUFQ) field951.method360();
			if (var2 == null) {
				break;
			}

			if (field969[var2.field1161][var2.field1164] != 0) {
				field946++;
			}

			field969[var2.field1161][var2.field1164] = 0;
			field952.method358(var2);
			field955++;
			method289(var2);
			field943 = true;
		}
	}

	@ObfuscatedName("LAQKYZGL.a(IB)Z")
	public final boolean method291(int arg0) {
		if (field936[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("LAQKYZGL.a()LSFALJUFQ;")
	public final SFALJUFQ method292() {
		SFALJUFQ var2;
		synchronized (field965) {
			var2 = (SFALJUFQ) field965.method360();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field948) {
			var2.method256();
		}

		if (var2.field1160 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1160));
			while (true) {
				if (field938.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field938, var4, field938.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1160 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1160[var7] = field938[var7];
		}

		return var2;
	}

	@ObfuscatedName("LAQKYZGL.c(I)V")
	public final void method293() {
		SFALJUFQ var2;
		synchronized (field947) {
			var2 = (SFALJUFQ) field947.method360();
		}

		while (var2 != null) {
			field943 = true;
			byte[] var3 = null;
			if (field967.field565[0] != null) {
				var3 = field967.field565[var2.field1161 + 1].method252(var2.field1164);
			}

			if (!method298(field950[var2.field1161][var2.field1164], var3, field939[var2.field1161][var2.field1164])) {
				var3 = null;
			}

			synchronized (field947) {
				if (var3 == null) {
					field951.method358(var2);
				} else {
					var2.field1160 = var3;

					synchronized (field965) {
						field965.method358(var2);
					}
				}

				var2 = (SFALJUFQ) field947.method360();
			}
		}
	}

	@ObfuscatedName("LAQKYZGL.a(II)I")
	public final int method294(int arg0) {
		return field944[arg0] & 0xFF;
	}

	@ObfuscatedName("LAQKYZGL.b()V")
	public final void method295() {
		field949 = false;
	}

	@ObfuscatedName("LAQKYZGL.a(I)V")
	public final void method296(int arg0) {
		method297(0, arg0);
	}

	public final void run() {
		try {
			while (field949) {
				field964++;
				byte var1 = 20;
				if (field935 == 0 && field967.field565[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field943 = true;
				for (int var2 = 0; var2 < 100 && field943; var2++) {
					field943 = false;
					method293();
					method290();

					if (field955 == 0 && var2 >= 5) {
						break;
					}

					method288();

					if (field945 != null) {
						method309();
					}
				}

				boolean var3 = false;
				for (SFALJUFQ var4 = (SFALJUFQ) field952.method361(); var4 != null; var4 = (SFALJUFQ) field952.method363()) {
					if (var4.field1163) {
						var3 = true;
						var4.field1162++;
						if (var4.field1162 > 50) {
							var4.field1162 = 0;
							method289(var4);
						}
					}
				}

				if (!var3) {
					for (SFALJUFQ var5 = (SFALJUFQ) field952.method361(); var5 != null; var5 = (SFALJUFQ) field952.method363()) {
						var3 = true;
						var5.field1162++;
						if (var5.field1162 > 50) {
							var5.field1162 = 0;
							method289(var5);
						}
					}
				}

				if (var3) {
					field958++;
					if (field958 > 750) {
						try {
							field940.close();
						} catch (Exception var8) {
						}

						field940 = null;
						field945 = null;
						field968 = null;
						field942 = 0;
					}
				} else {
					field958 = 0;
					field957 = "";
				}

				if (field967.field289 && field940 != null && field968 != null && (field935 > 0 || field967.field565[0] == null)) {
					field960++;
					if (field960 > 500) {
						field960 = 0;
						field971[0] = 0;
						field971[1] = 0;
						field971[2] = 0;
						field971[3] = 10;
						try {
							field968.write(field971, 0, 4);
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

	@ObfuscatedName("LAQKYZGL.b(II)V")
	public final void method297(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field939.length && arg1 >= 0 && arg1 <= field939[arg0].length && field939[arg0][arg1] != 0) {
			synchronized (field948) {
				for (SFALJUFQ var4 = (SFALJUFQ) field948.method355(); var4 != null; var4 = (SFALJUFQ) field948.method356()) {
					if (var4.field1161 == arg0 && var4.field1164 == arg1) {
						return;
					}
				}

				SFALJUFQ var5 = new SFALJUFQ();
				var5.field1161 = arg0;
				var5.field1164 = arg1;
				var5.field1163 = true;

				synchronized (field947) {
					field947.method358(var5);
				}

				field948.method353(var5);
			}
		}
	}

	@ObfuscatedName("LAQKYZGL.a(I[BZI)Z")
	public final boolean method298(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field972.reset();
			field972.update(arg1, 0, var4);
			int var6 = (int) field972.getValue();

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

	@ObfuscatedName("LAQKYZGL.a(IIII)I")
	public final int method299(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg1;
		for (int var5 = 0; var5 < field934.length; var5++) {
			if (field934[var5] == var4) {
				if (arg2 == 0) {
					return field937[var5];
				}

				return field954[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("LAQKYZGL.a(IBII)V")
	public final void method300(int arg0, byte arg1, int arg2) {
		if (field967.field565[0] != null && field939[arg0][arg2] != 0) {
			byte[] var4 = field967.field565[arg0 + 1].method252(arg2);
			if (!method298(field950[arg0][arg2], var4, field939[arg0][arg2])) {
				field969[arg0][arg2] = arg1;

				if (arg1 > field935) {
					field935 = arg1;
				}

				field959++;
			}
		}
	}

	@ObfuscatedName("LAQKYZGL.a(III)V")
	public final void method301(int arg0, int arg1) {
		if (field967.field565[0] != null && (field939[arg1][arg0] != 0 && (field969[arg1][arg0] != 0 && field935 != 0))) {
			SFALJUFQ var3 = new SFALJUFQ();
			var3.field1161 = arg1;
			var3.field1164 = arg0;
			var3.field1163 = false;

			synchronized (field970) {
				field970.method358(var3);
			}
		}
	}

	@ObfuscatedName("LAQKYZGL.c()I")
	public final int method302() {
		synchronized (field948) {
			return field948.method357();
		}
	}

	@ObfuscatedName("LAQKYZGL.a(IZ)I")
	public final int method303(int arg0) {
		return field939[arg0].length;
	}

	@ObfuscatedName("LAQKYZGL.a(ZB)V")
	public final void method304(boolean arg0) {
		int var2 = field934.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field963[var3] != 0) {
				method300(3, (byte) 2, field954[var3]);
				method300(3, (byte) 2, field937[var3]);
			}
		}
	}

	@ObfuscatedName("LAQKYZGL.c(II)Z")
	public final boolean method305(int arg0) {
		for (int var2 = 0; var2 < field934.length; var2++) {
			if (field954[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("LAQKYZGL.a(LMJLXHQTQ;Lclient;)V")
	public final void method306(MJLXHQTQ arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method317(var3[var4], null);
			int var6 = var5.length / 2;
			XGRGMPUQ var7 = new XGRGMPUQ(var5);
			field939[var4] = new int[var6];
			field969[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field939[var4][var8] = var7.method467();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method317(var9[var10], null);
			int var12 = var11.length / 4;
			XGRGMPUQ var13 = new XGRGMPUQ(var11);
			field950[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field950[var10][var14] = var13.method470();
			}
		}

		byte[] var15 = arg0.method317("model_index", null);
		int var16 = field939[0].length;
		field944 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field944[var17] = var15[var17];
			} else {
				field944[var17] = 0;
			}
		}

		byte[] var18 = arg0.method317("map_index", null);
		XGRGMPUQ var19 = new XGRGMPUQ(var18);
		int var20 = var18.length / 7;
		field934 = new int[var20];
		field937 = new int[var20];
		field954 = new int[var20];
		field963 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field934[var21] = var19.method467();
			field937[var21] = var19.method467();
			field954[var21] = var19.method467();
			field963[var21] = var19.method465();
		}

		byte[] var22 = arg0.method317("anim_index", null);
		XGRGMPUQ var23 = new XGRGMPUQ(var22);
		int var24 = var22.length / 2;
		field961 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field961[var25] = var23.method467();
		}

		byte[] var26 = arg0.method317("midi_index", null);
		XGRGMPUQ var27 = new XGRGMPUQ(var26);
		int var28 = var26.length;
		field936 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field936[var29] = var27.method465();
		}

		field967 = arg1;
		field949 = true;
		field967.method47(this, 2);
	}

	@ObfuscatedName("LAQKYZGL.d(I)V")
	public final void method307() {
		synchronized (field970) {
			field970.method365();
		}
	}

	@ObfuscatedName("LAQKYZGL.b(Z)I")
	public final int method308() {
		return field961.length;
	}

	@ObfuscatedName("LAQKYZGL.e(I)V")
	public final void method309() {
		try {
			int var1 = field945.available();
			if (field942 == 0 && var1 >= 6) {
				field943 = true;

				for (int var2 = 0; var2 < 6; var2 += field945.read(field971, var2, 6 - var2)) {
				}

				int var3 = field971[0] & 0xFF;
				int var4 = ((field971[1] & 0xFF) << 8) + (field971[2] & 0xFF);
				int var5 = ((field971[3] & 0xFF) << 8) + (field971[4] & 0xFF);
				int var6 = field971[5] & 0xFF;
				field966 = null;
				for (SFALJUFQ var7 = (SFALJUFQ) field952.method361(); var7 != null; var7 = (SFALJUFQ) field952.method363()) {
					if (var7.field1161 == var3 && var7.field1164 == var4) {
						field966 = var7;
					}

					if (field966 != null) {
						var7.field1162 = 0;
					}
				}

				if (field966 != null) {
					field958 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field966.field1160 = null;

						if (field966.field1163) {
							synchronized (field965) {
								field965.method358(field966);
							}
						} else {
							field966.method334();
						}

						field966 = null;
					} else {
						if (field966.field1160 == null && var6 == 0) {
							field966.field1160 = new byte[var5];
						}

						if (field966.field1160 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field941 = var6 * 500;
				field942 = 500;
				if (field942 > var5 - var6 * 500) {
					field942 = var5 - var6 * 500;
				}
			}

			if (field942 > 0 && var1 >= field942) {
				field943 = true;
				byte[] var9 = field971;
				int var10 = 0;
				if (field966 != null) {
					var9 = field966.field1160;
					var10 = field941;
				}

				for (int var11 = 0; var11 < field942; var11 += field945.read(var9, var10 + var11, field942 - var11)) {
				}

				if (field942 + field941 >= var9.length && field966 != null) {
					if (field967.field565[0] != null) {
						field967.field565[field966.field1161 + 1].method253(var9.length, var9, field966.field1164);
					}

					if (!field966.field1163 && field966.field1161 == 3) {
						field966.field1163 = true;
						field966.field1161 = 93;
					}

					if (field966.field1163) {
						synchronized (field965) {
							field965.method358(field966);
						}
					} else {
						field966.method334();
					}
				}

				field942 = 0;
			}
		} catch (IOException var17) {
			try {
				field940.close();
			} catch (Exception var14) {
			}

			field940 = null;
			field945 = null;
			field968 = null;
			field942 = 0;
		}
	}
}
