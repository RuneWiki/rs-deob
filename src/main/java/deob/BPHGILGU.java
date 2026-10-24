package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("BPHGILGU")
public class BPHGILGU extends IPAGXAMQ implements Runnable {

	@ObfuscatedName("BPHGILGU.a")
	public ZXKMWHPZ field51 = new ZXKMWHPZ();

	@ObfuscatedName("BPHGILGU.e")
	public CRC32 field54 = new CRC32();

	@ObfuscatedName("BPHGILGU.f")
	public int[][] field55 = new int[4][];

	@ObfuscatedName("BPHGILGU.h")
	public ZXKMWHPZ field57 = new ZXKMWHPZ();

	@ObfuscatedName("BPHGILGU.l")
	public int[][] field60 = new int[4][];

	@ObfuscatedName("BPHGILGU.m")
	public String field61 = "";

	@ObfuscatedName("BPHGILGU.s")
	public byte[] field66 = new byte[65000];

	@ObfuscatedName("BPHGILGU.t")
	public byte[] field67 = new byte[500];

	@ObfuscatedName("BPHGILGU.u")
	public boolean field68 = true;

	@ObfuscatedName("BPHGILGU.w")
	public byte[][] field70 = new byte[4][];

	@ObfuscatedName("BPHGILGU.x")
	public ZXKMWHPZ field71 = new ZXKMWHPZ();

	@ObfuscatedName("BPHGILGU.z")
	public ZXKMWHPZ field72 = new ZXKMWHPZ();

	@ObfuscatedName("BPHGILGU.B")
	public KHIOJPOB field74 = new KHIOJPOB();

	@ObfuscatedName("BPHGILGU.I")
	public ZXKMWHPZ field81 = new ZXKMWHPZ();

	@ObfuscatedName("BPHGILGU.R")
	public boolean field87 = false;

	@ObfuscatedName("BPHGILGU.b")
	public int field52;

	@ObfuscatedName("BPHGILGU.n")
	public int field62;

	@ObfuscatedName("BPHGILGU.o")
	public int field63;

	@ObfuscatedName("BPHGILGU.p")
	public int field64;

	@ObfuscatedName("BPHGILGU.D")
	public int field76;

	@ObfuscatedName("BPHGILGU.F")
	public int field78;

	@ObfuscatedName("BPHGILGU.H")
	public int field80;

	@ObfuscatedName("BPHGILGU.J")
	public int field82;

	@ObfuscatedName("BPHGILGU.M")
	public int field84;

	@ObfuscatedName("BPHGILGU.N")
	public int field85;

	@ObfuscatedName("BPHGILGU.O")
	public int field86;

	@ObfuscatedName("BPHGILGU.E")
	public long field77;

	@ObfuscatedName("BPHGILGU.c")
	public QWHFLOAQ field53;

	@ObfuscatedName("BPHGILGU.S")
	public client field88;

	@ObfuscatedName("BPHGILGU.A")
	public InputStream field73;

	@ObfuscatedName("BPHGILGU.r")
	public OutputStream field65;

	@ObfuscatedName("BPHGILGU.k")
	public Socket field59;

	@ObfuscatedName("BPHGILGU.g")
	public byte[] field56;

	@ObfuscatedName("BPHGILGU.i")
	public int[] field58;

	@ObfuscatedName("BPHGILGU.v")
	public int[] field69;

	@ObfuscatedName("BPHGILGU.C")
	public int[] field75;

	@ObfuscatedName("BPHGILGU.G")
	public int[] field79;

	@ObfuscatedName("BPHGILGU.K")
	public int[] field83;

	@ObfuscatedName("BPHGILGU.T")
	public int[] field89;

	@ObfuscatedName("BPHGILGU.a()I")
	public final int method116() {
		synchronized (field74) {
			return field74.method335();
		}
	}

	@ObfuscatedName("BPHGILGU.a(II)Z")
	public final boolean method117(int arg0) {
		if (field89[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("BPHGILGU.b(II)V")
	public final void method118(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field55.length && arg1 >= 0 && arg1 <= field55[arg0].length && field55[arg0][arg1] != 0) {
			synchronized (field74) {
				for (QWHFLOAQ var4 = (QWHFLOAQ) field74.method333(); var4 != null; var4 = (QWHFLOAQ) field74.method334()) {
					if (var4.field1040 == arg0 && var4.field1042 == arg1) {
						return;
					}
				}

				QWHFLOAQ var5 = new QWHFLOAQ();
				var5.field1040 = arg0;
				var5.field1042 = arg1;
				var5.field1041 = true;

				synchronized (field71) {
					field71.method595(var5);
				}

				field74.method331(var5);
			}
		}
	}

	@ObfuscatedName("BPHGILGU.a(I)V")
	public final void method119(int arg0) {
		method118(0, arg0);
	}

	@ObfuscatedName("BPHGILGU.a(B)V")
	public final void method120() {
		QWHFLOAQ var2;
		synchronized (field71) {
			var2 = (QWHFLOAQ) field71.method597();
		}

		while (var2 != null) {
			field87 = true;
			byte[] var3 = null;
			if (field88.field522[0] != null) {
				var3 = field88.field522[var2.field1040 + 1].method529(var2.field1042);
			}

			if (!method125(field55[var2.field1040][var2.field1042], field60[var2.field1040][var2.field1042], var3)) {
				var3 = null;
			}

			synchronized (field71) {
				if (var3 == null) {
					field51.method595(var2);
				} else {
					var2.field1043 = var3;

					synchronized (field81) {
						field81.method595(var2);
					}
				}

				var2 = (QWHFLOAQ) field71.method597();
			}
		}
	}

	@ObfuscatedName("BPHGILGU.c(II)I")
	public final int method121(int arg0) {
		return field56[arg0] & 0xFF;
	}

	@ObfuscatedName("BPHGILGU.d(II)I")
	public final int method122(int arg0) {
		return field55[arg0].length;
	}

	@ObfuscatedName("BPHGILGU.a(BZ)V")
	public final void method123(boolean arg0) {
		int var2 = field69.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field79[var3] != 0) {
				method136(3, field58[var3], (byte) 2);
				method136(3, field83[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("BPHGILGU.b()V")
	public final void method124() {
		field68 = false;
	}

	@ObfuscatedName("BPHGILGU.a(BII[B)Z")
	public final boolean method125(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field54.reset();
			field54.update(arg2, 0, var4);
			int var6 = (int) field54.getValue();

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

	@ObfuscatedName("BPHGILGU.a(Z)V")
	public final void method126() {
		try {
			int var1 = field73.available();
			if (field86 == 0 && var1 >= 6) {
				field87 = true;

				for (int var2 = 0; var2 < 6; var2 += field73.read(field67, var2, 6 - var2)) {
				}

				int var3 = field67[0] & 0xFF;
				int var4 = ((field67[1] & 0xFF) << 8) + (field67[2] & 0xFF);
				int var5 = ((field67[3] & 0xFF) << 8) + (field67[4] & 0xFF);
				int var6 = field67[5] & 0xFF;
				field53 = null;
				for (QWHFLOAQ var7 = (QWHFLOAQ) field72.method598(); var7 != null; var7 = (QWHFLOAQ) field72.method600()) {
					if (var7.field1040 == var3 && var7.field1042 == var4) {
						field53 = var7;
					}

					if (field53 != null) {
						var7.field1044 = 0;
					}
				}

				if (field53 != null) {
					field84 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field53.field1043 = null;

						if (field53.field1041) {
							synchronized (field81) {
								field81.method595(field53);
							}
						} else {
							field53.method329();
						}

						field53 = null;
					} else {
						if (field53.field1043 == null && var6 == 0) {
							field53.field1043 = new byte[var5];
						}

						if (field53.field1043 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field85 = var6 * 500;
				field86 = 500;
				if (field86 > var5 - var6 * 500) {
					field86 = var5 - var6 * 500;
				}
			}

			if (field86 > 0 && var1 >= field86) {
				field87 = true;
				byte[] var9 = field67;
				int var10 = 0;
				if (field53 != null) {
					var9 = field53.field1043;
					var10 = field85;
				}

				for (int var11 = 0; var11 < field86; var11 += field73.read(var9, var10 + var11, field86 - var11)) {
				}

				if (field86 + field85 >= var9.length && field53 != null) {
					if (field88.field522[0] != null) {
						field88.field522[field53.field1040 + 1].method530(field53.field1042, var9.length, var9);
					}

					if (!field53.field1041 && field53.field1040 == 3) {
						field53.field1041 = true;
						field53.field1040 = 93;
					}

					if (field53.field1041) {
						synchronized (field81) {
							field81.method595(field53);
						}
					} else {
						field53.method329();
					}
				}

				field86 = 0;
			}
		} catch (IOException var17) {
			try {
				field59.close();
			} catch (Exception var14) {
			}

			field59 = null;
			field73 = null;
			field65 = null;
			field86 = 0;
		}
	}

	public final void run() {
		try {
			while (field68) {
				field78++;
				byte var1 = 20;
				if (field62 == 0 && field88.field522[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field87 = true;
				for (int var2 = 0; var2 < 100 && field87; var2++) {
					field87 = false;
					method120();
					method131();

					if (field63 == 0 && var2 >= 5) {
						break;
					}

					method134();

					if (field73 != null) {
						method126();
					}
				}

				boolean var3 = false;
				for (QWHFLOAQ var4 = (QWHFLOAQ) field72.method598(); var4 != null; var4 = (QWHFLOAQ) field72.method600()) {
					if (var4.field1041) {
						var3 = true;
						var4.field1044++;
						if (var4.field1044 > 50) {
							var4.field1044 = 0;
							method137(var4);
						}
					}
				}

				if (!var3) {
					for (QWHFLOAQ var5 = (QWHFLOAQ) field72.method598(); var5 != null; var5 = (QWHFLOAQ) field72.method600()) {
						var3 = true;
						var5.field1044++;
						if (var5.field1044 > 50) {
							var5.field1044 = 0;
							method137(var5);
						}
					}
				}

				if (var3) {
					field84++;
					if (field84 > 750) {
						try {
							field59.close();
						} catch (Exception var8) {
						}

						field59 = null;
						field73 = null;
						field65 = null;
						field86 = 0;
					}
				} else {
					field84 = 0;
					field61 = "";
				}

				if (field88.field180 && field59 != null && field65 != null && (field62 > 0 || field88.field522[0] == null)) {
					field52++;
					if (field52 > 500) {
						field52 = 0;
						field67[0] = 0;
						field67[1] = 0;
						field67[2] = 0;
						field67[3] = 10;
						try {
							field65.write(field67, 0, 4);
						} catch (IOException var7) {
							field84 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("BPHGILGU.c()LQWHFLOAQ;")
	public final QWHFLOAQ method127() {
		QWHFLOAQ var2;
		synchronized (field81) {
			var2 = (QWHFLOAQ) field81.method597();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field74) {
			var2.method300();
		}

		if (var2.field1043 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1043));
			while (true) {
				if (field66.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field66, var4, field66.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1043 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1043[var7] = field66[var7];
		}

		return var2;
	}

	@ObfuscatedName("BPHGILGU.a(IB)Z")
	public final boolean method128(int arg0) {
		for (int var2 = 0; var2 < field69.length; var2++) {
			if (field58[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("BPHGILGU.a(IIZI)I")
	public final int method129(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field69.length; var5++) {
			if (field69[var5] == var4) {
				if (arg1 == 0) {
					return field83[var5];
				}

				return field58[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("BPHGILGU.a(LVSQMPWOM;Lclient;)V")
	public final void method130(VSQMPWOM arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method526(var3[var4], null);
			int var6 = var5.length / 2;
			BFQIDHPO var7 = new BFQIDHPO(var5);
			field55[var4] = new int[var6];
			field70[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field55[var4][var8] = var7.method56();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method526(var9[var10], null);
			int var12 = var11.length / 4;
			BFQIDHPO var13 = new BFQIDHPO(var11);
			field60[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field60[var10][var14] = var13.method59();
			}
		}

		byte[] var15 = arg0.method526("model_index", null);
		int var16 = field55[0].length;
		field56 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field56[var17] = var15[var17];
			} else {
				field56[var17] = 0;
			}
		}

		byte[] var18 = arg0.method526("map_index", null);
		BFQIDHPO var19 = new BFQIDHPO(var18);
		int var20 = var18.length / 7;
		field69 = new int[var20];
		field83 = new int[var20];
		field58 = new int[var20];
		field79 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field69[var21] = var19.method56();
			field83[var21] = var19.method56();
			field58[var21] = var19.method56();
			field79[var21] = var19.method54();
		}

		byte[] var22 = arg0.method526("anim_index", null);
		BFQIDHPO var23 = new BFQIDHPO(var22);
		int var24 = var22.length / 2;
		field75 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field75[var25] = var23.method56();
		}

		byte[] var26 = arg0.method526("midi_index", null);
		BFQIDHPO var27 = new BFQIDHPO(var26);
		int var28 = var26.length;
		field89 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field89[var29] = var27.method54();
		}

		field88 = arg1;
		field68 = true;
		field88.method180(this, 2);
	}

	@ObfuscatedName("BPHGILGU.b(I)V")
	public final void method131() {
		field63 = 0;
		field64 = 0;
		for (QWHFLOAQ var1 = (QWHFLOAQ) field72.method598(); var1 != null; var1 = (QWHFLOAQ) field72.method600()) {
			if (var1.field1041) {
				field63++;
			} else {
				field64++;
			}
		}

		while (field63 < 10) {
			QWHFLOAQ var2 = (QWHFLOAQ) field51.method597();
			if (var2 == null) {
				break;
			}

			if (field70[var2.field1040][var2.field1042] != 0) {
				field76++;
			}

			field70[var2.field1040][var2.field1042] = 0;
			field72.method595(var2);
			field63++;
			method137(var2);
			field87 = true;
		}
	}

	@ObfuscatedName("BPHGILGU.b(B)V")
	public final void method132() {
		synchronized (field57) {
			field57.method602();
		}
	}

	@ObfuscatedName("BPHGILGU.a(IZI)V")
	public final void method133(int arg0, int arg1) {
		if (field88.field522[0] != null && (field55[arg0][arg1] != 0 && (field70[arg0][arg1] != 0 && field62 != 0))) {
			QWHFLOAQ var3 = new QWHFLOAQ();
			var3.field1040 = arg0;
			var3.field1042 = arg1;
			var3.field1041 = false;

			synchronized (field57) {
				field57.method595(var3);
			}
		}
	}

	@ObfuscatedName("BPHGILGU.c(I)V")
	public final void method134() {
		while (field63 == 0) {
			if (field64 >= 10 || field62 == 0) {
				return;
			}

			QWHFLOAQ var2;
			synchronized (field57) {
				var2 = (QWHFLOAQ) field57.method597();
			}

			while (var2 != null) {
				if (field70[var2.field1040][var2.field1042] != 0) {
					field70[var2.field1040][var2.field1042] = 0;
					field72.method595(var2);
					method137(var2);
					field87 = true;

					if (field76 < field80) {
						field76++;
					}

					field61 = "Loading extra files - " + field76 * 100 / field80 + "%";
					field64++;
					if (field64 == 10) {
						return;
					}
				}

				synchronized (field57) {
					var2 = (QWHFLOAQ) field57.method597();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field70[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field62) {
						var5[var7] = 0;
						QWHFLOAQ var8 = new QWHFLOAQ();
						var8.field1040 = var4;
						var8.field1042 = var7;
						var8.field1041 = false;
						field72.method595(var8);
						method137(var8);
						field87 = true;

						if (field76 < field80) {
							field76++;
						}

						field61 = "Loading extra files - " + field76 * 100 / field80 + "%";
						field64++;
						if (field64 == 10) {
							return;
						}
					}
				}
			}

			field62--;
		}
	}

	@ObfuscatedName("BPHGILGU.d(I)I")
	public final int method135() {
		return field75.length;
	}

	@ObfuscatedName("BPHGILGU.a(IIIB)V")
	public final void method136(int arg0, int arg1, byte arg2) {
		if (field88.field522[0] != null && field55[arg0][arg1] != 0) {
			byte[] var4 = field88.field522[arg0 + 1].method529(arg1);
			if (!method125(field55[arg0][arg1], field60[arg0][arg1], var4)) {
				field70[arg0][arg1] = arg2;

				if (arg2 > field62) {
					field62 = arg2;
				}

				field80++;
			}
		}
	}

	@ObfuscatedName("BPHGILGU.a(ZLQWHFLOAQ;)V")
	public final void method137(QWHFLOAQ arg0) {
		try {
			if (field59 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field77 < 4000L) {
					return;
				}

				field77 = var2;
				field59 = field88.method283(client.field286 + 43594);
				field73 = field59.getInputStream();
				field65 = field59.getOutputStream();
				field65.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field73.read();
				}

				field84 = 0;
			}

			field67[0] = (byte) arg0.field1040;
			field67[1] = (byte) (arg0.field1042 >> 8);
			field67[2] = (byte) arg0.field1042;
			if (arg0.field1041) {
				field67[3] = 2;
			} else if (field88.field180) {
				field67[3] = 0;
			} else {
				field67[3] = 1;
			}

			field65.write(field67, 0, 4);
			field52 = 0;
			field82 = -10000;
		} catch (IOException var7) {
			try {
				field59.close();
			} catch (Exception var6) {
			}

			field59 = null;
			field73 = null;
			field65 = null;
			field86 = 0;
			field82++;
		}
	}
}
