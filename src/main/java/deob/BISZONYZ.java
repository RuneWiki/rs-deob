package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("BISZONYZ")
public class BISZONYZ extends LIRZRNNH implements Runnable {

	@ObfuscatedName("BISZONYZ.b")
	public byte[] field18 = new byte[500];

	@ObfuscatedName("BISZONYZ.i")
	public CRC32 field24 = new CRC32();

	@ObfuscatedName("BISZONYZ.j")
	public ZEEWTYXI field25 = new ZEEWTYXI();

	@ObfuscatedName("BISZONYZ.m")
	public boolean field28 = true;

	@ObfuscatedName("BISZONYZ.n")
	public ZEEWTYXI field29 = new ZEEWTYXI();

	@ObfuscatedName("BISZONYZ.o")
	public QHOLWOGP field30 = new QHOLWOGP();

	@ObfuscatedName("BISZONYZ.t")
	public boolean field34 = false;

	@ObfuscatedName("BISZONYZ.u")
	public byte[][] field35 = new byte[4][];

	@ObfuscatedName("BISZONYZ.w")
	public String field37 = "";

	@ObfuscatedName("BISZONYZ.A")
	public ZEEWTYXI field41 = new ZEEWTYXI();

	@ObfuscatedName("BISZONYZ.B")
	public int[][] field42 = new int[4][];

	@ObfuscatedName("BISZONYZ.K")
	public byte[] field50 = new byte[65000];

	@ObfuscatedName("BISZONYZ.L")
	public int[][] field51 = new int[4][];

	@ObfuscatedName("BISZONYZ.M")
	public ZEEWTYXI field52 = new ZEEWTYXI();

	@ObfuscatedName("BISZONYZ.P")
	public ZEEWTYXI field55 = new ZEEWTYXI();

	@ObfuscatedName("BISZONYZ.d")
	public int field19;

	@ObfuscatedName("BISZONYZ.e")
	public int field20;

	@ObfuscatedName("BISZONYZ.f")
	public int field21;

	@ObfuscatedName("BISZONYZ.r")
	public int field32;

	@ObfuscatedName("BISZONYZ.x")
	public int field38;

	@ObfuscatedName("BISZONYZ.y")
	public int field39;

	@ObfuscatedName("BISZONYZ.C")
	public int field43;

	@ObfuscatedName("BISZONYZ.G")
	public int field47;

	@ObfuscatedName("BISZONYZ.J")
	public int field49;

	@ObfuscatedName("BISZONYZ.O")
	public int field54;

	@ObfuscatedName("BISZONYZ.Q")
	public int field56;

	@ObfuscatedName("BISZONYZ.g")
	public long field22;

	@ObfuscatedName("BISZONYZ.E")
	public OVHZHUGL field45;

	@ObfuscatedName("BISZONYZ.N")
	public client field53;

	@ObfuscatedName("BISZONYZ.k")
	public InputStream field26;

	@ObfuscatedName("BISZONYZ.D")
	public OutputStream field44;

	@ObfuscatedName("BISZONYZ.h")
	public Socket field23;

	@ObfuscatedName("BISZONYZ.l")
	public byte[] field27;

	@ObfuscatedName("BISZONYZ.q")
	public int[] field31;

	@ObfuscatedName("BISZONYZ.s")
	public int[] field33;

	@ObfuscatedName("BISZONYZ.v")
	public int[] field36;

	@ObfuscatedName("BISZONYZ.z")
	public int[] field40;

	@ObfuscatedName("BISZONYZ.F")
	public int[] field46;

	@ObfuscatedName("BISZONYZ.H")
	public int[] field48;

	@ObfuscatedName("BISZONYZ.a(I)V")
	public final void method19(int arg0) {
		method40(0, arg0);
	}

	@ObfuscatedName("BISZONYZ.a(II)Z")
	public final boolean method20(int arg0) {
		if (field33[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("BISZONYZ.a(Z)V")
	public final void method21() {
		while (field20 == 0) {
			if (field21 >= 10 || field43 == 0) {
				return;
			}

			OVHZHUGL var2;
			synchronized (field52) {
				var2 = (OVHZHUGL) field52.method579();
			}

			while (var2 != null) {
				if (field35[var2.field1170][var2.field1173] != 0) {
					field35[var2.field1170][var2.field1173] = 0;
					field55.method577(var2);
					method33(var2);
					field34 = true;

					if (field56 < field49) {
						field56++;
					}

					field37 = "Loading extra files - " + field56 * 100 / field49 + "%";
					field21++;
					if (field21 == 10) {
						return;
					}
				}

				synchronized (field52) {
					var2 = (OVHZHUGL) field52.method579();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field35[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field43) {
						var5[var7] = 0;
						OVHZHUGL var8 = new OVHZHUGL();
						var8.field1170 = var4;
						var8.field1173 = var7;
						var8.field1172 = false;
						field55.method577(var8);
						method33(var8);
						field34 = true;

						if (field56 < field49) {
							field56++;
						}

						field37 = "Loading extra files - " + field56 * 100 / field49 + "%";
						field21++;
						if (field21 == 10) {
							return;
						}
					}
				}
			}

			field43--;
		}
	}

	@ObfuscatedName("BISZONYZ.a()LOVHZHUGL;")
	public final OVHZHUGL method22() {
		OVHZHUGL var2;
		synchronized (field29) {
			var2 = (OVHZHUGL) field29.method579();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field30) {
			var2.method282();
		}

		if (var2.field1169 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1169));
			while (true) {
				if (field50.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field50, var4, field50.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1169 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1169[var7] = field50[var7];
		}

		return var2;
	}

	@ObfuscatedName("BISZONYZ.a(IBII)V")
	public final void method23(int arg0, byte arg1, int arg2) {
		if (field53.field196[0] != null && field51[arg2][arg0] != 0) {
			byte[] var4 = field53.field196[arg2 + 1].method15(arg0);
			if (!method32(field51[arg2][arg0], field42[arg2][arg0], var4)) {
				field35[arg2][arg0] = arg1;

				if (arg1 > field43) {
					field43 = arg1;
				}

				field49++;
			}
		}
	}

	@ObfuscatedName("BISZONYZ.b(Z)V")
	public final void method24() {
		OVHZHUGL var2;
		synchronized (field25) {
			var2 = (OVHZHUGL) field25.method579();
		}

		while (var2 != null) {
			field34 = true;
			byte[] var3 = null;
			if (field53.field196[0] != null) {
				var3 = field53.field196[var2.field1170 + 1].method15(var2.field1173);
			}

			if (!method32(field51[var2.field1170][var2.field1173], field42[var2.field1170][var2.field1173], var3)) {
				var3 = null;
			}

			synchronized (field25) {
				if (var3 == null) {
					field41.method577(var2);
				} else {
					var2.field1169 = var3;

					synchronized (field29) {
						field29.method577(var2);
					}
				}

				var2 = (OVHZHUGL) field25.method579();
			}
		}
	}

	@ObfuscatedName("BISZONYZ.b()V")
	public final void method25() {
		field28 = false;
	}

	@ObfuscatedName("BISZONYZ.a(IBI)V")
	public final void method26(int arg0, int arg1) {
		if (field53.field196[0] != null && (field51[arg1][arg0] != 0 && (field35[arg1][arg0] != 0 && field43 != 0))) {
			OVHZHUGL var3 = new OVHZHUGL();
			var3.field1170 = arg1;
			var3.field1173 = arg0;
			var3.field1172 = false;

			synchronized (field52) {
				field52.method577(var3);
			}
		}
	}

	@ObfuscatedName("BISZONYZ.b(II)I")
	public final int method27(int arg0) {
		return field51[arg0].length;
	}

	@ObfuscatedName("BISZONYZ.a(IIII)I")
	public final int method28(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field31.length; var5++) {
			if (field31[var5] == var4) {
				if (arg0 == 0) {
					return field36[var5];
				}

				return field48[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("BISZONYZ.c()I")
	public final int method29() {
		synchronized (field30) {
			return field30.method445();
		}
	}

	@ObfuscatedName("BISZONYZ.b(I)V")
	public final void method30() {
		try {
			int var1 = field26.available();
			if (field39 == 0 && var1 >= 6) {
				field34 = true;

				for (int var2 = 0; var2 < 6; var2 += field26.read(field18, var2, 6 - var2)) {
				}

				int var3 = field18[0] & 0xFF;
				int var4 = ((field18[1] & 0xFF) << 8) + (field18[2] & 0xFF);
				int var5 = ((field18[3] & 0xFF) << 8) + (field18[4] & 0xFF);
				int var6 = field18[5] & 0xFF;
				field45 = null;
				for (OVHZHUGL var7 = (OVHZHUGL) field55.method580(); var7 != null; var7 = (OVHZHUGL) field55.method582()) {
					if (var7.field1170 == var3 && var7.field1173 == var4) {
						field45 = var7;
					}

					if (field45 != null) {
						var7.field1171 = 0;
					}
				}

				if (field45 != null) {
					field19 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field45.field1169 = null;

						if (field45.field1172) {
							synchronized (field29) {
								field29.method577(field45);
							}
						} else {
							field45.method602();
						}

						field45 = null;
					} else {
						if (field45.field1169 == null && var6 == 0) {
							field45.field1169 = new byte[var5];
						}

						if (field45.field1169 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field38 = var6 * 500;
				field39 = 500;
				if (field39 > var5 - var6 * 500) {
					field39 = var5 - var6 * 500;
				}
			}

			if (field39 > 0 && var1 >= field39) {
				field34 = true;
				byte[] var9 = field18;
				int var10 = 0;
				if (field45 != null) {
					var9 = field45.field1169;
					var10 = field38;
				}

				for (int var11 = 0; var11 < field39; var11 += field26.read(var9, var10 + var11, field39 - var11)) {
				}

				if (field39 + field38 >= var9.length && field45 != null) {
					if (field53.field196[0] != null) {
						field53.field196[field45.field1170 + 1].method16(var9, field45.field1173, var9.length);
					}

					if (!field45.field1172 && field45.field1170 == 3) {
						field45.field1172 = true;
						field45.field1170 = 93;
					}

					if (field45.field1172) {
						synchronized (field29) {
							field29.method577(field45);
						}
					} else {
						field45.method602();
					}
				}

				field39 = 0;
			}
		} catch (IOException var17) {
			try {
				field23.close();
			} catch (Exception var14) {
			}

			field23 = null;
			field26 = null;
			field44 = null;
			field39 = 0;
		}
	}

	@ObfuscatedName("BISZONYZ.c(Z)I")
	public final int method31() {
		return field46.length;
	}

	@ObfuscatedName("BISZONYZ.a(III[B)Z")
	public final boolean method32(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field24.reset();
			field24.update(arg2, 0, var4);
			int var6 = (int) field24.getValue();

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

	@ObfuscatedName("BISZONYZ.a(ILOVHZHUGL;)V")
	public final void method33(OVHZHUGL arg0) {
		try {
			if (field23 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field22 < 4000L) {
					return;
				}

				field22 = var2;
				field23 = field53.method158(client.field485 + 43594);
				field26 = field23.getInputStream();
				field44 = field23.getOutputStream();
				field44.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field26.read();
				}

				field19 = 0;
			}

			field18[0] = (byte) arg0.field1170;
			field18[1] = (byte) (arg0.field1173 >> 8);
			field18[2] = (byte) arg0.field1173;
			if (arg0.field1172) {
				field18[3] = 2;
			} else if (field53.field286) {
				field18[3] = 0;
			} else {
				field18[3] = 1;
			}

			field44.write(field18, 0, 4);
			field54 = 0;
			field47 = -10000;
		} catch (IOException var7) {
			try {
				field23.close();
			} catch (Exception var6) {
			}

			field23 = null;
			field26 = null;
			field44 = null;
			field39 = 0;
			field47++;
		}
	}

	@ObfuscatedName("BISZONYZ.a(ZZ)V")
	public final void method34(boolean arg0) {
		int var2 = field31.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field40[var3] != 0) {
				method23(field48[var3], (byte) 2, 3);
				method23(field36[var3], (byte) 2, 3);
			}
		}
	}

	public final void run() {
		try {
			while (field28) {
				field32++;
				byte var1 = 20;
				if (field43 == 0 && field53.field196[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field34 = true;
				for (int var2 = 0; var2 < 100 && field34; var2++) {
					field34 = false;
					method24();
					method38();

					if (field20 == 0 && var2 >= 5) {
						break;
					}

					method21();

					if (field26 != null) {
						method30();
					}
				}

				boolean var3 = false;
				for (OVHZHUGL var4 = (OVHZHUGL) field55.method580(); var4 != null; var4 = (OVHZHUGL) field55.method582()) {
					if (var4.field1172) {
						var3 = true;
						var4.field1171++;
						if (var4.field1171 > 50) {
							var4.field1171 = 0;
							method33(var4);
						}
					}
				}

				if (!var3) {
					for (OVHZHUGL var5 = (OVHZHUGL) field55.method580(); var5 != null; var5 = (OVHZHUGL) field55.method582()) {
						var3 = true;
						var5.field1171++;
						if (var5.field1171 > 50) {
							var5.field1171 = 0;
							method33(var5);
						}
					}
				}

				if (var3) {
					field19++;
					if (field19 > 750) {
						try {
							field23.close();
						} catch (Exception var8) {
						}

						field23 = null;
						field26 = null;
						field44 = null;
						field39 = 0;
					}
				} else {
					field19 = 0;
					field37 = "";
				}

				if (field53.field286 && field23 != null && field44 != null && (field43 > 0 || field53.field196[0] == null)) {
					field54++;
					if (field54 > 500) {
						field54 = 0;
						field18[0] = 0;
						field18[1] = 0;
						field18[2] = 0;
						field18[3] = 10;
						try {
							field44.write(field18, 0, 4);
						} catch (IOException var7) {
							field19 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("BISZONYZ.a(IB)I")
	public final int method35(int arg0) {
		return field27[arg0] & 0xFF;
	}

	@ObfuscatedName("BISZONYZ.a(LAWEEREDT;Lclient;)V")
	public final void method36(AWEEREDT arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method14(var3[var4], null);
			int var6 = var5.length / 2;
			IUVBENCV var7 = new IUVBENCV(var5);
			field51[var4] = new int[var6];
			field35[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field51[var4][var8] = var7.method247();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method14(var9[var10], null);
			int var12 = var11.length / 4;
			IUVBENCV var13 = new IUVBENCV(var11);
			field42[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field42[var10][var14] = var13.method250();
			}
		}

		byte[] var15 = arg0.method14("model_index", null);
		int var16 = field51[0].length;
		field27 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field27[var17] = var15[var17];
			} else {
				field27[var17] = 0;
			}
		}

		byte[] var18 = arg0.method14("map_index", null);
		IUVBENCV var19 = new IUVBENCV(var18);
		int var20 = var18.length / 7;
		field31 = new int[var20];
		field36 = new int[var20];
		field48 = new int[var20];
		field40 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field31[var21] = var19.method247();
			field36[var21] = var19.method247();
			field48[var21] = var19.method247();
			field40[var21] = var19.method245();
		}

		byte[] var22 = arg0.method14("anim_index", null);
		IUVBENCV var23 = new IUVBENCV(var22);
		int var24 = var22.length / 2;
		field46 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field46[var25] = var23.method247();
		}

		byte[] var26 = arg0.method14("midi_index", null);
		IUVBENCV var27 = new IUVBENCV(var26);
		int var28 = var26.length;
		field33 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field33[var29] = var27.method245();
		}

		field53 = arg1;
		field28 = true;
		field53.method90(this, 2);
	}

	@ObfuscatedName("BISZONYZ.c(II)Z")
	public final boolean method37(int arg0) {
		for (int var2 = 0; var2 < field31.length; var2++) {
			if (field48[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("BISZONYZ.c(I)V")
	public final void method38() {
		field20 = 0;
		field21 = 0;
		for (OVHZHUGL var1 = (OVHZHUGL) field55.method580(); var1 != null; var1 = (OVHZHUGL) field55.method582()) {
			if (var1.field1172) {
				field20++;
			} else {
				field21++;
			}
		}

		while (field20 < 10) {
			OVHZHUGL var2 = (OVHZHUGL) field41.method579();
			if (var2 == null) {
				break;
			}

			if (field35[var2.field1170][var2.field1173] != 0) {
				field56++;
			}

			field35[var2.field1170][var2.field1173] = 0;
			field55.method577(var2);
			field20++;
			method33(var2);
			field34 = true;
		}
	}

	@ObfuscatedName("BISZONYZ.d(I)V")
	public final void method39() {
		synchronized (field52) {
			field52.method584();
		}
	}

	@ObfuscatedName("BISZONYZ.d(II)V")
	public final void method40(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field51.length && arg1 >= 0 && arg1 <= field51[arg0].length && field51[arg0][arg1] != 0) {
			synchronized (field30) {
				for (OVHZHUGL var4 = (OVHZHUGL) field30.method443(); var4 != null; var4 = (OVHZHUGL) field30.method444()) {
					if (var4.field1170 == arg0 && var4.field1173 == arg1) {
						return;
					}
				}

				OVHZHUGL var5 = new OVHZHUGL();
				var5.field1170 = arg0;
				var5.field1173 = arg1;
				var5.field1172 = true;

				synchronized (field25) {
					field25.method577(var5);
				}

				field30.method441(var5);
			}
		}
	}
}
