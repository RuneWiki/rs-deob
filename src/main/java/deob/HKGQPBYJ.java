package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("HKGQPBYJ")
public class HKGQPBYJ extends HCZRONNN implements Runnable {

	@ObfuscatedName("HKGQPBYJ.f")
	public byte[] field726 = new byte[500];

	@ObfuscatedName("HKGQPBYJ.g")
	public boolean field727 = false;

	@ObfuscatedName("HKGQPBYJ.h")
	public byte[] field728 = new byte[65000];

	@ObfuscatedName("HKGQPBYJ.i")
	public WAPMJSJO field729 = new WAPMJSJO();

	@ObfuscatedName("HKGQPBYJ.m")
	public boolean field733 = true;

	@ObfuscatedName("HKGQPBYJ.s")
	public WAPMJSJO field737 = new WAPMJSJO();

	@ObfuscatedName("HKGQPBYJ.w")
	public int[][] field741 = new int[4][];

	@ObfuscatedName("HKGQPBYJ.D")
	public WAPMJSJO field747 = new WAPMJSJO();

	@ObfuscatedName("HKGQPBYJ.E")
	public WAPMJSJO field748 = new WAPMJSJO();

	@ObfuscatedName("HKGQPBYJ.K")
	public byte[][] field752 = new byte[4][];

	@ObfuscatedName("HKGQPBYJ.N")
	public String field754 = "";

	@ObfuscatedName("HKGQPBYJ.P")
	public int[][] field755 = new int[4][];

	@ObfuscatedName("HKGQPBYJ.R")
	public EDMDOBNM field756 = new EDMDOBNM();

	@ObfuscatedName("HKGQPBYJ.T")
	public WAPMJSJO field758 = new WAPMJSJO();

	@ObfuscatedName("HKGQPBYJ.U")
	public CRC32 field759 = new CRC32();

	@ObfuscatedName("HKGQPBYJ.c")
	public int field723;

	@ObfuscatedName("HKGQPBYJ.d")
	public int field724;

	@ObfuscatedName("HKGQPBYJ.e")
	public int field725;

	@ObfuscatedName("HKGQPBYJ.l")
	public int field732;

	@ObfuscatedName("HKGQPBYJ.t")
	public int field738;

	@ObfuscatedName("HKGQPBYJ.u")
	public int field739;

	@ObfuscatedName("HKGQPBYJ.v")
	public int field740;

	@ObfuscatedName("HKGQPBYJ.y")
	public int field743;

	@ObfuscatedName("HKGQPBYJ.z")
	public int field744;

	@ObfuscatedName("HKGQPBYJ.C")
	public int field746;

	@ObfuscatedName("HKGQPBYJ.S")
	public int field757;

	@ObfuscatedName("HKGQPBYJ.B")
	public long field745;

	@ObfuscatedName("HKGQPBYJ.b")
	public LVCMGOBA field722;

	@ObfuscatedName("HKGQPBYJ.J")
	public client field751;

	@ObfuscatedName("HKGQPBYJ.o")
	public InputStream field735;

	@ObfuscatedName("HKGQPBYJ.k")
	public OutputStream field731;

	@ObfuscatedName("HKGQPBYJ.n")
	public Socket field734;

	@ObfuscatedName("HKGQPBYJ.V")
	public byte[] field760;

	@ObfuscatedName("HKGQPBYJ.j")
	public int[] field730;

	@ObfuscatedName("HKGQPBYJ.q")
	public int[] field736;

	@ObfuscatedName("HKGQPBYJ.x")
	public int[] field742;

	@ObfuscatedName("HKGQPBYJ.F")
	public int[] field749;

	@ObfuscatedName("HKGQPBYJ.G")
	public int[] field750;

	@ObfuscatedName("HKGQPBYJ.M")
	public int[] field753;

	@ObfuscatedName("HKGQPBYJ.a(II)I")
	public final int method293(int arg0) {
		return field755[arg0].length;
	}

	@ObfuscatedName("HKGQPBYJ.a(ZI)V")
	public final void method294(boolean arg0) {
		int var2 = field736.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field742[var3] != 0) {
				method306(field749[var3], 3, (byte) 2);
				method306(field753[var3], 3, (byte) 2);
			}
		}
	}

	@ObfuscatedName("HKGQPBYJ.b(II)I")
	public final int method295(int arg0) {
		return field760[arg0] & 0xFF;
	}

	@ObfuscatedName("HKGQPBYJ.a(III)V")
	public final void method296(int arg0, int arg1) {
		if (field751.field270[0] != null && (field755[arg0][arg1] != 0 && (field752[arg0][arg1] != 0 && field757 != 0))) {
			LVCMGOBA var3 = new LVCMGOBA();
			var3.field832 = arg0;
			var3.field835 = arg1;
			var3.field831 = false;

			synchronized (field747) {
				field747.method482(var3);
			}
		}
	}

	@ObfuscatedName("HKGQPBYJ.a()I")
	public final int method297() {
		synchronized (field756) {
			return field756.method197();
		}
	}

	@ObfuscatedName("HKGQPBYJ.a(IIII)I")
	public final int method298(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field736.length; var5++) {
			if (field736[var5] == var4) {
				if (arg1 == 0) {
					return field753[var5];
				}

				return field749[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("HKGQPBYJ.c(II)Z")
	public final boolean method299(int arg0) {
		if (field730[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("HKGQPBYJ.a(Z)V")
	public final void method300() {
		try {
			int var1 = field735.available();
			if (field740 == 0 && var1 >= 6) {
				field727 = true;

				for (int var2 = 0; var2 < 6; var2 += field735.read(field726, var2, 6 - var2)) {
				}

				int var3 = field726[0] & 0xFF;
				int var4 = ((field726[1] & 0xFF) << 8) + (field726[2] & 0xFF);
				int var5 = ((field726[3] & 0xFF) << 8) + (field726[4] & 0xFF);
				int var6 = field726[5] & 0xFF;
				field722 = null;
				for (LVCMGOBA var7 = (LVCMGOBA) field737.method485(); var7 != null; var7 = (LVCMGOBA) field737.method487()) {
					if (var7.field832 == var3 && var7.field835 == var4) {
						field722 = var7;
					}

					if (field722 != null) {
						var7.field834 = 0;
					}
				}

				if (field722 != null) {
					field746 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field722.field833 = null;

						if (field722.field831) {
							synchronized (field758) {
								field758.method482(field722);
							}
						} else {
							field722.method327();
						}

						field722 = null;
					} else {
						if (field722.field833 == null && var6 == 0) {
							field722.field833 = new byte[var5];
						}

						if (field722.field833 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field739 = var6 * 500;
				field740 = 500;
				if (field740 > var5 - var6 * 500) {
					field740 = var5 - var6 * 500;
				}
			}

			if (field740 > 0 && var1 >= field740) {
				field727 = true;
				byte[] var9 = field726;
				int var10 = 0;
				if (field722 != null) {
					var9 = field722.field833;
					var10 = field739;
				}

				for (int var11 = 0; var11 < field740; var11 += field735.read(var9, var10 + var11, field740 - var11)) {
				}

				if (field740 + field739 >= var9.length && field722 != null) {
					if (field751.field270[0] != null) {
						field751.field270[field722.field832 + 1].method431(var9, var9.length, field722.field835);
					}

					if (!field722.field831 && field722.field832 == 3) {
						field722.field831 = true;
						field722.field832 = 93;
					}

					if (field722.field831) {
						synchronized (field758) {
							field758.method482(field722);
						}
					} else {
						field722.method327();
					}
				}

				field740 = 0;
			}
		} catch (IOException var17) {
			try {
				field734.close();
			} catch (Exception var14) {
			}

			field734 = null;
			field735 = null;
			field731 = null;
			field740 = 0;
		}
	}

	@ObfuscatedName("HKGQPBYJ.a(LRPFMUSNN;Lclient;)V")
	public final void method301(RPFMUSNN arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method414(var3[var4], null);
			int var6 = var5.length / 2;
			WNCFPLWV var7 = new WNCFPLWV(var5);
			field755[var4] = new int[var6];
			field752[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field755[var4][var8] = var7.method504();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method414(var9[var10], null);
			int var12 = var11.length / 4;
			WNCFPLWV var13 = new WNCFPLWV(var11);
			field741[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field741[var10][var14] = var13.method507();
			}
		}

		byte[] var15 = arg0.method414("model_index", null);
		int var16 = field755[0].length;
		field760 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field760[var17] = var15[var17];
			} else {
				field760[var17] = 0;
			}
		}

		byte[] var18 = arg0.method414("map_index", null);
		WNCFPLWV var19 = new WNCFPLWV(var18);
		int var20 = var18.length / 7;
		field736 = new int[var20];
		field753 = new int[var20];
		field749 = new int[var20];
		field742 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field736[var21] = var19.method504();
			field753[var21] = var19.method504();
			field749[var21] = var19.method504();
			field742[var21] = var19.method502();
		}

		byte[] var22 = arg0.method414("anim_index", null);
		WNCFPLWV var23 = new WNCFPLWV(var22);
		int var24 = var22.length / 2;
		field750 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field750[var25] = var23.method504();
		}

		byte[] var26 = arg0.method414("midi_index", null);
		WNCFPLWV var27 = new WNCFPLWV(var26);
		int var28 = var26.length;
		field730 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field730[var29] = var27.method502();
		}

		field751 = arg1;
		field733 = true;
		field751.method31(this, 2);
	}

	public final void run() {
		try {
			while (field733) {
				field732++;
				byte var1 = 20;
				if (field757 == 0 && field751.field270[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field727 = true;
				for (int var2 = 0; var2 < 100 && field727; var2++) {
					field727 = false;
					method303();
					method307();

					if (field743 == 0 && var2 >= 5) {
						break;
					}

					method304();

					if (field735 != null) {
						method300();
					}
				}

				boolean var3 = false;
				for (LVCMGOBA var4 = (LVCMGOBA) field737.method485(); var4 != null; var4 = (LVCMGOBA) field737.method487()) {
					if (var4.field831) {
						var3 = true;
						var4.field834++;
						if (var4.field834 > 50) {
							var4.field834 = 0;
							method305(var4);
						}
					}
				}

				if (!var3) {
					for (LVCMGOBA var5 = (LVCMGOBA) field737.method485(); var5 != null; var5 = (LVCMGOBA) field737.method487()) {
						var3 = true;
						var5.field834++;
						if (var5.field834 > 50) {
							var5.field834 = 0;
							method305(var5);
						}
					}
				}

				if (var3) {
					field746++;
					if (field746 > 750) {
						try {
							field734.close();
						} catch (Exception var8) {
						}

						field734 = null;
						field735 = null;
						field731 = null;
						field740 = 0;
					}
				} else {
					field746 = 0;
					field754 = "";
				}

				if (field751.field159 && field734 != null && field731 != null && (field757 > 0 || field751.field270[0] == null)) {
					field723++;
					if (field723 > 500) {
						field723 = 0;
						field726[0] = 0;
						field726[1] = 0;
						field726[2] = 0;
						field726[3] = 10;
						try {
							field731.write(field726, 0, 4);
						} catch (IOException var7) {
							field746 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("HKGQPBYJ.a(IB)Z")
	public final boolean method302(int arg0) {
		for (int var2 = 0; var2 < field736.length; var2++) {
			if (field749[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("HKGQPBYJ.b(I)V")
	public final void method303() {
		LVCMGOBA var2;
		synchronized (field748) {
			var2 = (LVCMGOBA) field748.method484();
		}

		while (var2 != null) {
			field727 = true;
			byte[] var3 = null;
			if (field751.field270[0] != null) {
				var3 = field751.field270[var2.field832 + 1].method430(var2.field835);
			}

			if (!method313(field741[var2.field832][var2.field835], var3, field755[var2.field832][var2.field835])) {
				var3 = null;
			}

			synchronized (field748) {
				if (var3 == null) {
					field729.method482(var2);
				} else {
					var2.field833 = var3;

					synchronized (field758) {
						field758.method482(var2);
					}
				}

				var2 = (LVCMGOBA) field748.method484();
			}
		}
	}

	@ObfuscatedName("HKGQPBYJ.c(I)V")
	public final void method304() {
		while (field743 == 0) {
			if (field744 >= 10 || field757 == 0) {
				return;
			}

			LVCMGOBA var2;
			synchronized (field747) {
				var2 = (LVCMGOBA) field747.method484();
			}

			while (var2 != null) {
				if (field752[var2.field832][var2.field835] != 0) {
					field752[var2.field832][var2.field835] = 0;
					field737.method482(var2);
					method305(var2);
					field727 = true;

					if (field724 < field725) {
						field724++;
					}

					field754 = "Loading extra files - " + field724 * 100 / field725 + "%";
					field744++;
					if (field744 == 10) {
						return;
					}
				}

				synchronized (field747) {
					var2 = (LVCMGOBA) field747.method484();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field752[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field757) {
						var5[var7] = 0;
						LVCMGOBA var8 = new LVCMGOBA();
						var8.field832 = var4;
						var8.field835 = var7;
						var8.field831 = false;
						field737.method482(var8);
						method305(var8);
						field727 = true;

						if (field724 < field725) {
							field724++;
						}

						field754 = "Loading extra files - " + field724 * 100 / field725 + "%";
						field744++;
						if (field744 == 10) {
							return;
						}
					}
				}
			}

			field757--;
		}
	}

	@ObfuscatedName("HKGQPBYJ.a(LLVCMGOBA;Z)V")
	public final void method305(LVCMGOBA arg0) {
		try {
			if (field734 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field745 < 4000L) {
					return;
				}

				field745 = var2;
				field734 = field751.method63(client.field132 + 43594);
				field735 = field734.getInputStream();
				field731 = field734.getOutputStream();
				field731.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field735.read();
				}

				field746 = 0;
			}

			field726[0] = (byte) arg0.field832;
			field726[1] = (byte) (arg0.field835 >> 8);
			field726[2] = (byte) arg0.field835;
			if (arg0.field831) {
				field726[3] = 2;
			} else if (field751.field159) {
				field726[3] = 0;
			} else {
				field726[3] = 1;
			}

			field731.write(field726, 0, 4);
			field723 = 0;
			field738 = -10000;
		} catch (IOException var7) {
			try {
				field734.close();
			} catch (Exception var6) {
			}

			field734 = null;
			field735 = null;
			field731 = null;
			field740 = 0;
			field738++;
		}
	}

	@ObfuscatedName("HKGQPBYJ.a(IIBZ)V")
	public final void method306(int arg0, int arg1, byte arg2) {
		if (field751.field270[0] != null && field755[arg1][arg0] != 0) {
			byte[] var4 = field751.field270[arg1 + 1].method430(arg0);
			if (!method313(field741[arg1][arg0], var4, field755[arg1][arg0])) {
				field752[arg1][arg0] = arg2;

				if (arg2 > field757) {
					field757 = arg2;
				}

				field725++;
			}
		}
	}

	@ObfuscatedName("HKGQPBYJ.d(I)V")
	public final void method307() {
		field743 = 0;
		field744 = 0;
		for (LVCMGOBA var1 = (LVCMGOBA) field737.method485(); var1 != null; var1 = (LVCMGOBA) field737.method487()) {
			if (var1.field831) {
				field743++;
			} else {
				field744++;
			}
		}

		while (field743 < 10) {
			LVCMGOBA var2 = (LVCMGOBA) field729.method484();
			if (var2 == null) {
				break;
			}

			if (field752[var2.field832][var2.field835] != 0) {
				field724++;
			}

			field752[var2.field832][var2.field835] = 0;
			field737.method482(var2);
			field743++;
			method305(var2);
			field727 = true;
		}
	}

	@ObfuscatedName("HKGQPBYJ.b()V")
	public final void method308() {
		field733 = false;
	}

	@ObfuscatedName("HKGQPBYJ.d(II)V")
	public final void method309(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field755.length && arg1 >= 0 && arg1 <= field755[arg0].length && field755[arg0][arg1] != 0) {
			synchronized (field756) {
				for (LVCMGOBA var4 = (LVCMGOBA) field756.method195(); var4 != null; var4 = (LVCMGOBA) field756.method196()) {
					if (var4.field832 == arg0 && var4.field835 == arg1) {
						return;
					}
				}

				LVCMGOBA var5 = new LVCMGOBA();
				var5.field832 = arg0;
				var5.field835 = arg1;
				var5.field831 = true;

				synchronized (field748) {
					field748.method482(var5);
				}

				field756.method193(var5);
			}
		}
	}

	@ObfuscatedName("HKGQPBYJ.a(B)V")
	public final void method310() {
		synchronized (field747) {
			field747.method489();
		}
	}

	@ObfuscatedName("HKGQPBYJ.e(I)I")
	public final int method311() {
		return field750.length;
	}

	@ObfuscatedName("HKGQPBYJ.c()LLVCMGOBA;")
	public final LVCMGOBA method312() {
		LVCMGOBA var2;
		synchronized (field758) {
			var2 = (LVCMGOBA) field758.method484();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field756) {
			var2.method380();
		}

		if (var2.field833 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field833));
			while (true) {
				if (field728.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field728, var4, field728.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field833 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field833[var7] = field728[var7];
		}

		return var2;
	}

	@ObfuscatedName("HKGQPBYJ.a(I[BII)Z")
	public final boolean method313(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field759.reset();
			field759.update(arg1, 0, var4);
			int var6 = (int) field759.getValue();

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

	@ObfuscatedName("HKGQPBYJ.a(I)V")
	public final void method292(int arg0) {
		method309(0, arg0);
	}
}
