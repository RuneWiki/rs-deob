package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("FOFQGQZJ")
public class FOFQGQZJ extends FXZBKICD implements Runnable {

	@ObfuscatedName("FOFQGQZJ.a")
	public int[][] field701 = new int[4][];

	@ObfuscatedName("FOFQGQZJ.b")
	public byte[] field702 = new byte[65000];

	@ObfuscatedName("FOFQGQZJ.c")
	public byte[][] field703 = new byte[4][];

	@ObfuscatedName("FOFQGQZJ.e")
	public String field705 = "";

	@ObfuscatedName("FOFQGQZJ.i")
	public boolean field708 = false;

	@ObfuscatedName("FOFQGQZJ.j")
	public SXQMCHPP field709 = new SXQMCHPP();

	@ObfuscatedName("FOFQGQZJ.k")
	public CRC32 field710 = new CRC32();

	@ObfuscatedName("FOFQGQZJ.n")
	public SXQMCHPP field713 = new SXQMCHPP();

	@ObfuscatedName("FOFQGQZJ.r")
	public byte[] field717 = new byte[500];

	@ObfuscatedName("FOFQGQZJ.w")
	public LXCATFEF field721 = new LXCATFEF();

	@ObfuscatedName("FOFQGQZJ.A")
	public boolean field725 = true;

	@ObfuscatedName("FOFQGQZJ.B")
	public int[][] field726 = new int[4][];

	@ObfuscatedName("FOFQGQZJ.F")
	public SXQMCHPP field729 = new SXQMCHPP();

	@ObfuscatedName("FOFQGQZJ.H")
	public SXQMCHPP field731 = new SXQMCHPP();

	@ObfuscatedName("FOFQGQZJ.L")
	public SXQMCHPP field735 = new SXQMCHPP();

	@ObfuscatedName("FOFQGQZJ.d")
	public int field704;

	@ObfuscatedName("FOFQGQZJ.s")
	public int field718;

	@ObfuscatedName("FOFQGQZJ.t")
	public int field719;

	@ObfuscatedName("FOFQGQZJ.v")
	public int field720;

	@ObfuscatedName("FOFQGQZJ.C")
	public int field727;

	@ObfuscatedName("FOFQGQZJ.E")
	public int field728;

	@ObfuscatedName("FOFQGQZJ.G")
	public int field730;

	@ObfuscatedName("FOFQGQZJ.I")
	public int field732;

	@ObfuscatedName("FOFQGQZJ.J")
	public int field733;

	@ObfuscatedName("FOFQGQZJ.K")
	public int field734;

	@ObfuscatedName("FOFQGQZJ.N")
	public int field737;

	@ObfuscatedName("FOFQGQZJ.h")
	public long field707;

	@ObfuscatedName("FOFQGQZJ.M")
	public BJSSVIRC field736;

	@ObfuscatedName("FOFQGQZJ.m")
	public client field712;

	@ObfuscatedName("FOFQGQZJ.y")
	public InputStream field723;

	@ObfuscatedName("FOFQGQZJ.z")
	public OutputStream field724;

	@ObfuscatedName("FOFQGQZJ.l")
	public Socket field711;

	@ObfuscatedName("FOFQGQZJ.g")
	public byte[] field706;

	@ObfuscatedName("FOFQGQZJ.o")
	public int[] field714;

	@ObfuscatedName("FOFQGQZJ.p")
	public int[] field715;

	@ObfuscatedName("FOFQGQZJ.q")
	public int[] field716;

	@ObfuscatedName("FOFQGQZJ.x")
	public int[] field722;

	@ObfuscatedName("FOFQGQZJ.O")
	public int[] field738;

	@ObfuscatedName("FOFQGQZJ.R")
	public int[] field739;

	@ObfuscatedName("FOFQGQZJ.a()LBJSSVIRC;")
	public final BJSSVIRC method204() {
		BJSSVIRC var2;
		synchronized (field713) {
			var2 = (BJSSVIRC) field713.method508();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field721) {
			var2.method373();
		}

		if (var2.field87 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field87));
			while (true) {
				if (field702.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field702, var4, field702.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field87 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field87[var7] = field702[var7];
		}

		return var2;
	}

	@ObfuscatedName("FOFQGQZJ.b(I)V")
	public final void method205() {
		while (field733 == 0) {
			if (field734 >= 10 || field730 == 0) {
				return;
			}

			BJSSVIRC var2;
			synchronized (field709) {
				var2 = (BJSSVIRC) field709.method508();
			}

			while (var2 != null) {
				if (field703[var2.field83][var2.field86] != 0) {
					field703[var2.field83][var2.field86] = 0;
					field735.method506(var2);
					method218(var2);
					field708 = true;

					if (field720 < field727) {
						field720++;
					}

					field705 = "Loading extra files - " + field720 * 100 / field727 + "%";
					field734++;
					if (field734 == 10) {
						return;
					}
				}

				synchronized (field709) {
					var2 = (BJSSVIRC) field709.method508();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field703[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field730) {
						var5[var7] = 0;
						BJSSVIRC var8 = new BJSSVIRC();
						var8.field83 = var4;
						var8.field86 = var7;
						var8.field85 = false;
						field735.method506(var8);
						method218(var8);
						field708 = true;

						if (field720 < field727) {
							field720++;
						}

						field705 = "Loading extra files - " + field720 * 100 / field727 + "%";
						field734++;
						if (field734 == 10) {
							return;
						}
					}
				}
			}

			field730--;
		}
	}

	@ObfuscatedName("FOFQGQZJ.a(LJUPFHAZZ;Lclient;)V")
	public final void method206(JUPFHAZZ arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method372(var3[var4], null);
			int var6 = var5.length / 2;
			TKPFKOXP var7 = new TKPFKOXP(var5);
			field726[var4] = new int[var6];
			field703[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field726[var4][var8] = var7.method531();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method372(var9[var10], null);
			int var12 = var11.length / 4;
			TKPFKOXP var13 = new TKPFKOXP(var11);
			field701[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field701[var10][var14] = var13.method534();
			}
		}

		byte[] var15 = arg0.method372("model_index", null);
		int var16 = field726[0].length;
		field706 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field706[var17] = var15[var17];
			} else {
				field706[var17] = 0;
			}
		}

		byte[] var18 = arg0.method372("map_index", null);
		TKPFKOXP var19 = new TKPFKOXP(var18);
		int var20 = var18.length / 7;
		field722 = new int[var20];
		field739 = new int[var20];
		field715 = new int[var20];
		field738 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field722[var21] = var19.method531();
			field739[var21] = var19.method531();
			field715[var21] = var19.method531();
			field738[var21] = var19.method529();
		}

		byte[] var22 = arg0.method372("anim_index", null);
		TKPFKOXP var23 = new TKPFKOXP(var22);
		int var24 = var22.length / 2;
		field716 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field716[var25] = var23.method531();
		}

		byte[] var26 = arg0.method372("midi_index", null);
		TKPFKOXP var27 = new TKPFKOXP(var26);
		int var28 = var26.length;
		field714 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field714[var29] = var27.method529();
		}

		field712 = arg1;
		field725 = true;
		field712.method154(this, 2);
	}

	@ObfuscatedName("FOFQGQZJ.b()I")
	public final int method207() {
		synchronized (field721) {
			return field721.method412();
		}
	}

	@ObfuscatedName("FOFQGQZJ.a(II)V")
	public final void method208(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field726.length && arg1 >= 0 && arg1 <= field726[arg0].length && field726[arg0][arg1] != 0) {
			synchronized (field721) {
				for (BJSSVIRC var4 = (BJSSVIRC) field721.method410(); var4 != null; var4 = (BJSSVIRC) field721.method411()) {
					if (var4.field83 == arg0 && var4.field86 == arg1) {
						return;
					}
				}

				BJSSVIRC var5 = new BJSSVIRC();
				var5.field83 = arg0;
				var5.field86 = arg1;
				var5.field85 = true;

				synchronized (field731) {
					field731.method506(var5);
				}

				field721.method408(var5);
			}
		}
	}

	@ObfuscatedName("FOFQGQZJ.c(I)I")
	public final int method209() {
		return field716.length;
	}

	@ObfuscatedName("FOFQGQZJ.c()V")
	public final void method210() {
		field725 = false;
	}

	@ObfuscatedName("FOFQGQZJ.a(Z)V")
	public final void method211() {
		BJSSVIRC var2;
		synchronized (field731) {
			var2 = (BJSSVIRC) field731.method508();
		}

		while (var2 != null) {
			field708 = true;
			byte[] var3 = null;
			if (field712.field203[0] != null) {
				var3 = field712.field203[var2.field83 + 1].method601(var2.field86);
			}

			if (!method223(var3, field701[var2.field83][var2.field86], field726[var2.field83][var2.field86])) {
				var3 = null;
			}

			synchronized (field731) {
				if (var3 == null) {
					field729.method506(var2);
				} else {
					var2.field87 = var3;

					synchronized (field713) {
						field713.method506(var2);
					}
				}

				var2 = (BJSSVIRC) field731.method508();
			}
		}
	}

	@ObfuscatedName("FOFQGQZJ.b(II)I")
	public final int method212(int arg0) {
		return field706[arg0] & 0xFF;
	}

	@ObfuscatedName("FOFQGQZJ.a(BIZI)V")
	public final void method213(byte arg0, int arg1, int arg2) {
		if (field712.field203[0] != null && field726[arg2][arg1] != 0) {
			byte[] var4 = field712.field203[arg2 + 1].method601(arg1);
			if (!method223(var4, field701[arg2][arg1], field726[arg2][arg1])) {
				field703[arg2][arg1] = arg0;

				if (arg0 > field730) {
					field730 = arg0;
				}

				field727++;
			}
		}
	}

	public final void run() {
		try {
			while (field725) {
				field737++;
				byte var1 = 20;
				if (field730 == 0 && field712.field203[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field708 = true;
				for (int var2 = 0; var2 < 100 && field708; var2++) {
					field708 = false;
					method211();
					method214();

					if (field733 == 0 && var2 >= 5) {
						break;
					}

					method205();

					if (field723 != null) {
						method224();
					}
				}

				boolean var3 = false;
				for (BJSSVIRC var4 = (BJSSVIRC) field735.method509(); var4 != null; var4 = (BJSSVIRC) field735.method511()) {
					if (var4.field85) {
						var3 = true;
						var4.field84++;
						if (var4.field84 > 50) {
							var4.field84 = 0;
							method218(var4);
						}
					}
				}

				if (!var3) {
					for (BJSSVIRC var5 = (BJSSVIRC) field735.method509(); var5 != null; var5 = (BJSSVIRC) field735.method511()) {
						var3 = true;
						var5.field84++;
						if (var5.field84 > 50) {
							var5.field84 = 0;
							method218(var5);
						}
					}
				}

				if (var3) {
					field732++;
					if (field732 > 750) {
						try {
							field711.close();
						} catch (Exception var8) {
						}

						field711 = null;
						field723 = null;
						field724 = null;
						field719 = 0;
					}
				} else {
					field732 = 0;
					field705 = "";
				}

				if (field712.field395 && field711 != null && field724 != null && (field730 > 0 || field712.field203[0] == null)) {
					field704++;
					if (field704 > 500) {
						field704 = 0;
						field717[0] = 0;
						field717[1] = 0;
						field717[2] = 0;
						field717[3] = 10;
						try {
							field724.write(field717, 0, 4);
						} catch (IOException var7) {
							field732 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("FOFQGQZJ.d(I)V")
	public final void method214() {
		field733 = 0;
		field734 = 0;
		for (BJSSVIRC var1 = (BJSSVIRC) field735.method509(); var1 != null; var1 = (BJSSVIRC) field735.method511()) {
			if (var1.field85) {
				field733++;
			} else {
				field734++;
			}
		}

		while (field733 < 10) {
			BJSSVIRC var2 = (BJSSVIRC) field729.method508();
			if (var2 == null) {
				break;
			}

			if (field703[var2.field83][var2.field86] != 0) {
				field720++;
			}

			field703[var2.field83][var2.field86] = 0;
			field735.method506(var2);
			field733++;
			method218(var2);
			field708 = true;
		}
	}

	@ObfuscatedName("FOFQGQZJ.a(III)V")
	public final void method215(int arg0, int arg1) {
		if (field712.field203[0] != null && (field726[arg0][arg1] != 0 && (field703[arg0][arg1] != 0 && field730 != 0))) {
			BJSSVIRC var3 = new BJSSVIRC();
			var3.field83 = arg0;
			var3.field86 = arg1;
			var3.field85 = false;

			synchronized (field709) {
				field709.method506(var3);
			}
		}
	}

	@ObfuscatedName("FOFQGQZJ.a(IZ)V")
	public final void method216(boolean arg0) {
		int var2 = field722.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field738[var3] != 0) {
				method213((byte) 2, field715[var3], 3);
				method213((byte) 2, field739[var3], 3);
			}
		}
	}

	@ObfuscatedName("FOFQGQZJ.a(IZII)I")
	public final int method217(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg1;
		for (int var5 = 0; var5 < field722.length; var5++) {
			if (field722[var5] == var4) {
				if (arg0 == 0) {
					return field739[var5];
				}

				return field715[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("FOFQGQZJ.a(BLBJSSVIRC;)V")
	public final void method218(BJSSVIRC arg0) {
		try {
			if (field711 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field707 < 4000L) {
					return;
				}

				field707 = var2;
				field711 = field712.method120(client.field501 + 43594);
				field723 = field711.getInputStream();
				field724 = field711.getOutputStream();
				field724.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field723.read();
				}

				field732 = 0;
			}

			field717[0] = (byte) arg0.field83;
			field717[1] = (byte) (arg0.field86 >> 8);
			field717[2] = (byte) arg0.field86;
			if (arg0.field85) {
				field717[3] = 2;
			} else if (field712.field395) {
				field717[3] = 0;
			} else {
				field717[3] = 1;
			}

			field724.write(field717, 0, 4);
			field704 = 0;
			field728 = -10000;
		} catch (IOException var7) {
			try {
				field711.close();
			} catch (Exception var6) {
			}

			field711 = null;
			field723 = null;
			field724 = null;
			field719 = 0;
			field728++;
		}
	}

	@ObfuscatedName("FOFQGQZJ.c(II)Z")
	public final boolean method219(int arg0) {
		for (int var2 = 0; var2 < field722.length; var2++) {
			if (field715[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("FOFQGQZJ.a(B)V")
	public final void method220() {
		synchronized (field709) {
			field709.method513();
		}
	}

	@ObfuscatedName("FOFQGQZJ.d(II)I")
	public final int method221(int arg0) {
		return field726[arg0].length;
	}

	@ObfuscatedName("FOFQGQZJ.b(IZ)Z")
	public final boolean method222(int arg0) {
		if (field714[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("FOFQGQZJ.a(I[BII)Z")
	public final boolean method223(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field710.reset();
			field710.update(arg0, 0, var4);
			int var6 = (int) field710.getValue();

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

	@ObfuscatedName("FOFQGQZJ.e(I)V")
	public final void method224() {
		try {
			int var1 = field723.available();
			if (field719 == 0 && var1 >= 6) {
				field708 = true;

				for (int var2 = 0; var2 < 6; var2 += field723.read(field717, var2, 6 - var2)) {
				}

				int var3 = field717[0] & 0xFF;
				int var4 = ((field717[1] & 0xFF) << 8) + (field717[2] & 0xFF);
				int var5 = ((field717[3] & 0xFF) << 8) + (field717[4] & 0xFF);
				int var6 = field717[5] & 0xFF;
				field736 = null;
				for (BJSSVIRC var7 = (BJSSVIRC) field735.method509(); var7 != null; var7 = (BJSSVIRC) field735.method511()) {
					if (var7.field83 == var3 && var7.field86 == var4) {
						field736 = var7;
					}

					if (field736 != null) {
						var7.field84 = 0;
					}
				}

				if (field736 != null) {
					field732 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field736.field87 = null;

						if (field736.field85) {
							synchronized (field713) {
								field713.method506(field736);
							}
						} else {
							field736.method588();
						}

						field736 = null;
					} else {
						if (field736.field87 == null && var6 == 0) {
							field736.field87 = new byte[var5];
						}

						if (field736.field87 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field718 = var6 * 500;
				field719 = 500;
				if (field719 > var5 - var6 * 500) {
					field719 = var5 - var6 * 500;
				}
			}

			if (field719 > 0 && var1 >= field719) {
				field708 = true;
				byte[] var9 = field717;
				int var10 = 0;
				if (field736 != null) {
					var9 = field736.field87;
					var10 = field718;
				}

				for (int var11 = 0; var11 < field719; var11 += field723.read(var9, var10 + var11, field719 - var11)) {
				}

				if (field719 + field718 >= var9.length && field736 != null) {
					if (field712.field203[0] != null) {
						field712.field203[field736.field83 + 1].method602(var9, var9.length, field736.field86);
					}

					if (!field736.field85 && field736.field83 == 3) {
						field736.field85 = true;
						field736.field83 = 93;
					}

					if (field736.field85) {
						synchronized (field713) {
							field713.method506(field736);
						}
					} else {
						field736.method588();
					}
				}

				field719 = 0;
			}
		} catch (IOException var17) {
			try {
				field711.close();
			} catch (Exception var14) {
			}

			field711 = null;
			field723 = null;
			field724 = null;
			field719 = 0;
		}
	}

	@ObfuscatedName("FOFQGQZJ.a(I)V")
	public final void method225(int arg0) {
		method208(0, arg0);
	}
}
