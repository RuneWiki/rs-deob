package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("EWALAKUU")
public class EWALAKUU extends HCIJBYVR implements Runnable {

	@ObfuscatedName("EWALAKUU.b")
	public HMYWYVEI field716 = new HMYWYVEI();

	@ObfuscatedName("EWALAKUU.d")
	public JSAXNSIH field718 = new JSAXNSIH();

	@ObfuscatedName("EWALAKUU.j")
	public int[][] field723 = new int[4][];

	@ObfuscatedName("EWALAKUU.l")
	public JSAXNSIH field724 = new JSAXNSIH();

	@ObfuscatedName("EWALAKUU.p")
	public int[][] field727 = new int[4][];

	@ObfuscatedName("EWALAKUU.s")
	public JSAXNSIH field730 = new JSAXNSIH();

	@ObfuscatedName("EWALAKUU.x")
	public byte[] field735 = new byte[500];

	@ObfuscatedName("EWALAKUU.A")
	public String field738 = "";

	@ObfuscatedName("EWALAKUU.B")
	public byte[] field739 = new byte[65000];

	@ObfuscatedName("EWALAKUU.I")
	public CRC32 field743 = new CRC32();

	@ObfuscatedName("EWALAKUU.L")
	public JSAXNSIH field745 = new JSAXNSIH();

	@ObfuscatedName("EWALAKUU.M")
	public byte[][] field746 = new byte[4][];

	@ObfuscatedName("EWALAKUU.P")
	public boolean field749 = true;

	@ObfuscatedName("EWALAKUU.S")
	public JSAXNSIH field752 = new JSAXNSIH();

	@ObfuscatedName("EWALAKUU.T")
	public boolean field753 = false;

	@ObfuscatedName("EWALAKUU.a")
	public int field715;

	@ObfuscatedName("EWALAKUU.h")
	public int field721;

	@ObfuscatedName("EWALAKUU.m")
	public int field725;

	@ObfuscatedName("EWALAKUU.n")
	public int field726;

	@ObfuscatedName("EWALAKUU.q")
	public int field728;

	@ObfuscatedName("EWALAKUU.t")
	public int field731;

	@ObfuscatedName("EWALAKUU.v")
	public int field733;

	@ObfuscatedName("EWALAKUU.w")
	public int field734;

	@ObfuscatedName("EWALAKUU.K")
	public int field744;

	@ObfuscatedName("EWALAKUU.Q")
	public int field750;

	@ObfuscatedName("EWALAKUU.R")
	public int field751;

	@ObfuscatedName("EWALAKUU.E")
	public long field741;

	@ObfuscatedName("EWALAKUU.c")
	public WETSEMVU field717;

	@ObfuscatedName("EWALAKUU.r")
	public client field729;

	@ObfuscatedName("EWALAKUU.z")
	public InputStream field737;

	@ObfuscatedName("EWALAKUU.O")
	public OutputStream field748;

	@ObfuscatedName("EWALAKUU.H")
	public Socket field742;

	@ObfuscatedName("EWALAKUU.i")
	public byte[] field722;

	@ObfuscatedName("EWALAKUU.e")
	public int[] field719;

	@ObfuscatedName("EWALAKUU.g")
	public int[] field720;

	@ObfuscatedName("EWALAKUU.u")
	public int[] field732;

	@ObfuscatedName("EWALAKUU.y")
	public int[] field736;

	@ObfuscatedName("EWALAKUU.D")
	public int[] field740;

	@ObfuscatedName("EWALAKUU.N")
	public int[] field747;

	@ObfuscatedName("EWALAKUU.a(Z)I")
	public final int method286() {
		return field747.length;
	}

	@ObfuscatedName("EWALAKUU.b(I)V")
	public final void method287() {
		try {
			int var1 = field737.available();
			if (field734 == 0 && var1 >= 6) {
				field753 = true;

				for (int var2 = 0; var2 < 6; var2 += field737.read(field735, var2, 6 - var2)) {
				}

				int var3 = field735[0] & 0xFF;
				int var4 = ((field735[1] & 0xFF) << 8) + (field735[2] & 0xFF);
				int var5 = ((field735[3] & 0xFF) << 8) + (field735[4] & 0xFF);
				int var6 = field735[5] & 0xFF;
				field717 = null;
				for (WETSEMVU var7 = (WETSEMVU) field730.method402(); var7 != null; var7 = (WETSEMVU) field730.method404()) {
					if (var7.field1456 == var3 && var7.field1455 == var4) {
						field717 = var7;
					}

					if (field717 != null) {
						var7.field1454 = 0;
					}
				}

				if (field717 != null) {
					field721 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field717.field1452 = null;

						if (field717.field1453) {
							synchronized (field724) {
								field724.method399(field717);
							}
						} else {
							field717.method579();
						}

						field717 = null;
					} else {
						if (field717.field1452 == null && var6 == 0) {
							field717.field1452 = new byte[var5];
						}

						if (field717.field1452 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field733 = var6 * 500;
				field734 = 500;
				if (field734 > var5 - var6 * 500) {
					field734 = var5 - var6 * 500;
				}
			}

			if (field734 > 0 && var1 >= field734) {
				field753 = true;
				byte[] var9 = field735;
				int var10 = 0;
				if (field717 != null) {
					var9 = field717.field1452;
					var10 = field733;
				}

				for (int var11 = 0; var11 < field734; var11 += field737.read(var9, var10 + var11, field734 - var11)) {
				}

				if (field734 + field733 >= var9.length && field717 != null) {
					if (field729.field374[0] != null) {
						field729.field374[field717.field1456 + 1].method2(field717.field1455, var9, var9.length);
					}

					if (!field717.field1453 && field717.field1456 == 3) {
						field717.field1453 = true;
						field717.field1456 = 93;
					}

					if (field717.field1453) {
						synchronized (field724) {
							field724.method399(field717);
						}
					} else {
						field717.method579();
					}
				}

				field734 = 0;
			}
		} catch (IOException var17) {
			try {
				field742.close();
			} catch (Exception var14) {
			}

			field742 = null;
			field737 = null;
			field748 = null;
			field734 = 0;
		}
	}

	@ObfuscatedName("EWALAKUU.a(BIIZ)V")
	public final void method288(byte arg0, int arg1, int arg2) {
		if (field729.field374[0] != null && field723[arg1][arg2] != 0) {
			byte[] var4 = field729.field374[arg1 + 1].method1(arg2);
			if (!method305(var4, field723[arg1][arg2], field727[arg1][arg2])) {
				field746[arg1][arg2] = arg0;

				if (arg0 > field725) {
					field725 = arg0;
				}

				field726++;
			}
		}
	}

	public final void run() {
		try {
			while (field749) {
				field728++;
				byte var1 = 20;
				if (field725 == 0 && field729.field374[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field753 = true;
				for (int var2 = 0; var2 < 100 && field753; var2++) {
					field753 = false;
					method293();
					method298();

					if (field750 == 0 && var2 >= 5) {
						break;
					}

					method303();

					if (field737 != null) {
						method287();
					}
				}

				boolean var3 = false;
				for (WETSEMVU var4 = (WETSEMVU) field730.method402(); var4 != null; var4 = (WETSEMVU) field730.method404()) {
					if (var4.field1453) {
						var3 = true;
						var4.field1454++;
						if (var4.field1454 > 50) {
							var4.field1454 = 0;
							method299(var4);
						}
					}
				}

				if (!var3) {
					for (WETSEMVU var5 = (WETSEMVU) field730.method402(); var5 != null; var5 = (WETSEMVU) field730.method404()) {
						var3 = true;
						var5.field1454++;
						if (var5.field1454 > 50) {
							var5.field1454 = 0;
							method299(var5);
						}
					}
				}

				if (var3) {
					field721++;
					if (field721 > 750) {
						try {
							field742.close();
						} catch (Exception var8) {
						}

						field742 = null;
						field737 = null;
						field748 = null;
						field734 = 0;
					}
				} else {
					field721 = 0;
					field738 = "";
				}

				if (field729.field477 && field742 != null && field748 != null && (field725 > 0 || field729.field374[0] == null)) {
					field731++;
					if (field731 > 500) {
						field731 = 0;
						field735[0] = 0;
						field735[1] = 0;
						field735[2] = 0;
						field735[3] = 10;
						try {
							field748.write(field735, 0, 4);
						} catch (IOException var7) {
							field721 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("EWALAKUU.a()I")
	public final int method289() {
		synchronized (field716) {
			return field716.method375();
		}
	}

	@ObfuscatedName("EWALAKUU.a(ZI)V")
	public final void method290(boolean arg0) {
		int var2 = field736.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field732[var3] != 0) {
				method288((byte) 2, 3, field719[var3]);
				method288((byte) 2, 3, field740[var3]);
			}
		}
	}

	@ObfuscatedName("EWALAKUU.a(IIZ)V")
	public final void method291(int arg0, int arg1) {
		if (field729.field374[0] != null && (field723[arg0][arg1] != 0 && (field746[arg0][arg1] != 0 && field725 != 0))) {
			WETSEMVU var3 = new WETSEMVU();
			var3.field1456 = arg0;
			var3.field1455 = arg1;
			var3.field1453 = false;

			synchronized (field745) {
				field745.method399(var3);
			}
		}
	}

	@ObfuscatedName("EWALAKUU.b()LWETSEMVU;")
	public final WETSEMVU method292() {
		WETSEMVU var2;
		synchronized (field724) {
			var2 = (WETSEMVU) field724.method401();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field716) {
			var2.method512();
		}

		if (var2.field1452 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1452));
			while (true) {
				if (field739.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field739, var4, field739.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1452 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1452[var7] = field739[var7];
		}

		return var2;
	}

	@ObfuscatedName("EWALAKUU.c(I)V")
	public final void method293() {
		WETSEMVU var2;
		synchronized (field752) {
			var2 = (WETSEMVU) field752.method401();
		}

		while (var2 != null) {
			field753 = true;
			byte[] var3 = null;
			if (field729.field374[0] != null) {
				var3 = field729.field374[var2.field1456 + 1].method1(var2.field1455);
			}

			if (!method305(var3, field723[var2.field1456][var2.field1455], field727[var2.field1456][var2.field1455])) {
				var3 = null;
			}

			synchronized (field752) {
				if (var3 == null) {
					field718.method399(var2);
				} else {
					var2.field1452 = var3;

					synchronized (field724) {
						field724.method399(var2);
					}
				}

				var2 = (WETSEMVU) field752.method401();
			}
		}
	}

	@ObfuscatedName("EWALAKUU.b(Z)V")
	public final void method294() {
		synchronized (field745) {
			field745.method406();
		}
	}

	@ObfuscatedName("EWALAKUU.a(IB)Z")
	public final boolean method295(int arg0) {
		if (field720[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("EWALAKUU.a(I)V")
	public final void method296(int arg0) {
		method307(0, arg0);
	}

	@ObfuscatedName("EWALAKUU.a(IBII)I")
	public final int method297(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < field736.length; var5++) {
			if (field736[var5] == var4) {
				if (arg2 == 0) {
					return field740[var5];
				}

				return field719[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("EWALAKUU.c(Z)V")
	public final void method298() {
		field750 = 0;
		field751 = 0;
		for (WETSEMVU var1 = (WETSEMVU) field730.method402(); var1 != null; var1 = (WETSEMVU) field730.method404()) {
			if (var1.field1453) {
				field750++;
			} else {
				field751++;
			}
		}

		while (field750 < 10) {
			WETSEMVU var2 = (WETSEMVU) field718.method401();
			if (var2 == null) {
				break;
			}

			if (field746[var2.field1456][var2.field1455] != 0) {
				field744++;
			}

			field746[var2.field1456][var2.field1455] = 0;
			field730.method399(var2);
			field750++;
			method299(var2);
			field753 = true;
		}
	}

	@ObfuscatedName("EWALAKUU.a(BLWETSEMVU;)V")
	public final void method299(WETSEMVU arg0) {
		try {
			if (field742 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field741 < 4000L) {
					return;
				}

				field741 = var2;
				field742 = field729.method191(client.field486 + 43594);
				field737 = field742.getInputStream();
				field748 = field742.getOutputStream();
				field748.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field737.read();
				}

				field721 = 0;
			}

			field735[0] = (byte) arg0.field1456;
			field735[1] = (byte) (arg0.field1455 >> 8);
			field735[2] = (byte) arg0.field1455;
			if (arg0.field1453) {
				field735[3] = 2;
			} else if (field729.field477) {
				field735[3] = 0;
			} else {
				field735[3] = 1;
			}

			field748.write(field735, 0, 4);
			field731 = 0;
			field715 = -10000;
		} catch (IOException var7) {
			try {
				field742.close();
			} catch (Exception var6) {
			}

			field742 = null;
			field737 = null;
			field748 = null;
			field734 = 0;
			field715++;
		}
	}

	@ObfuscatedName("EWALAKUU.a(IZ)Z")
	public final boolean method300(int arg0) {
		for (int var2 = 0; var2 < field736.length; var2++) {
			if (field719[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EWALAKUU.a(II)I")
	public final int method301(int arg0) {
		return field723[arg0].length;
	}

	@ObfuscatedName("EWALAKUU.c()V")
	public final void method302() {
		field749 = false;
	}

	@ObfuscatedName("EWALAKUU.d(I)V")
	public final void method303() {
		while (field750 == 0) {
			if (field751 >= 10 || field725 == 0) {
				return;
			}

			WETSEMVU var2;
			synchronized (field745) {
				var2 = (WETSEMVU) field745.method401();
			}

			while (var2 != null) {
				if (field746[var2.field1456][var2.field1455] != 0) {
					field746[var2.field1456][var2.field1455] = 0;
					field730.method399(var2);
					method299(var2);
					field753 = true;

					if (field744 < field726) {
						field744++;
					}

					field738 = "Loading extra files - " + field744 * 100 / field726 + "%";
					field751++;
					if (field751 == 10) {
						return;
					}
				}

				synchronized (field745) {
					var2 = (WETSEMVU) field745.method401();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field746[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field725) {
						var5[var7] = 0;
						WETSEMVU var8 = new WETSEMVU();
						var8.field1456 = var4;
						var8.field1455 = var7;
						var8.field1453 = false;
						field730.method399(var8);
						method299(var8);
						field753 = true;

						if (field744 < field726) {
							field744++;
						}

						field738 = "Loading extra files - " + field744 * 100 / field726 + "%";
						field751++;
						if (field751 == 10) {
							return;
						}
					}
				}
			}

			field725--;
		}
	}

	@ObfuscatedName("EWALAKUU.b(II)I")
	public final int method304(int arg0) {
		return field722[arg0] & 0xFF;
	}

	@ObfuscatedName("EWALAKUU.a([BIII)Z")
	public final boolean method305(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field743.reset();
			field743.update(arg0, 0, var4);
			int var6 = (int) field743.getValue();

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

	@ObfuscatedName("EWALAKUU.a(LSRZUEVOD;Lclient;)V")
	public final void method306(SRZUEVOD arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method566(var3[var4], null);
			int var6 = var5.length / 2;
			LZWRHABP var7 = new LZWRHABP(var5);
			field723[var4] = new int[var6];
			field746[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field723[var4][var8] = var7.method465();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method566(var9[var10], null);
			int var12 = var11.length / 4;
			LZWRHABP var13 = new LZWRHABP(var11);
			field727[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field727[var10][var14] = var13.method468();
			}
		}

		byte[] var15 = arg0.method566("model_index", null);
		int var16 = field723[0].length;
		field722 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field722[var17] = var15[var17];
			} else {
				field722[var17] = 0;
			}
		}

		byte[] var18 = arg0.method566("map_index", null);
		LZWRHABP var19 = new LZWRHABP(var18);
		int var20 = var18.length / 7;
		field736 = new int[var20];
		field740 = new int[var20];
		field719 = new int[var20];
		field732 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field736[var21] = var19.method465();
			field740[var21] = var19.method465();
			field719[var21] = var19.method465();
			field732[var21] = var19.method463();
		}

		byte[] var22 = arg0.method566("anim_index", null);
		LZWRHABP var23 = new LZWRHABP(var22);
		int var24 = var22.length / 2;
		field747 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field747[var25] = var23.method465();
		}

		byte[] var26 = arg0.method566("midi_index", null);
		LZWRHABP var27 = new LZWRHABP(var26);
		int var28 = var26.length;
		field720 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field720[var29] = var27.method463();
		}

		field729 = arg1;
		field749 = true;
		field729.method18(this, 2);
	}

	@ObfuscatedName("EWALAKUU.c(II)V")
	public final void method307(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field723.length && arg1 >= 0 && arg1 <= field723[arg0].length && field723[arg0][arg1] != 0) {
			synchronized (field716) {
				for (WETSEMVU var4 = (WETSEMVU) field716.method373(); var4 != null; var4 = (WETSEMVU) field716.method374()) {
					if (var4.field1456 == arg0 && var4.field1455 == arg1) {
						return;
					}
				}

				WETSEMVU var5 = new WETSEMVU();
				var5.field1456 = arg0;
				var5.field1455 = arg1;
				var5.field1453 = true;

				synchronized (field752) {
					field752.method399(var5);
				}

				field716.method371(var5);
			}
		}
	}
}
