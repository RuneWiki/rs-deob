package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("KMIIMWED")
public class KMIIMWED extends JFXVVBUO implements Runnable {

	@ObfuscatedName("KMIIMWED.a")
	public WTGHTNMN field813 = new WTGHTNMN();

	@ObfuscatedName("KMIIMWED.d")
	public OZVXYFRH field815 = new OZVXYFRH();

	@ObfuscatedName("KMIIMWED.g")
	public int[][] field818 = new int[4][];

	@ObfuscatedName("KMIIMWED.j")
	public WTGHTNMN field821 = new WTGHTNMN();

	@ObfuscatedName("KMIIMWED.p")
	public CRC32 field827 = new CRC32();

	@ObfuscatedName("KMIIMWED.r")
	public boolean field829 = false;

	@ObfuscatedName("KMIIMWED.t")
	public byte[] field831 = new byte[500];

	@ObfuscatedName("KMIIMWED.u")
	public WTGHTNMN field832 = new WTGHTNMN();

	@ObfuscatedName("KMIIMWED.w")
	public int[][] field833 = new int[4][];

	@ObfuscatedName("KMIIMWED.x")
	public WTGHTNMN field834 = new WTGHTNMN();

	@ObfuscatedName("KMIIMWED.z")
	public String field836 = "";

	@ObfuscatedName("KMIIMWED.D")
	public byte[] field840 = new byte[65000];

	@ObfuscatedName("KMIIMWED.E")
	public byte[][] field841 = new byte[4][];

	@ObfuscatedName("KMIIMWED.J")
	public boolean field843 = true;

	@ObfuscatedName("KMIIMWED.R")
	public WTGHTNMN field851 = new WTGHTNMN();

	@ObfuscatedName("KMIIMWED.e")
	public int field816;

	@ObfuscatedName("KMIIMWED.m")
	public int field824;

	@ObfuscatedName("KMIIMWED.y")
	public int field835;

	@ObfuscatedName("KMIIMWED.B")
	public int field838;

	@ObfuscatedName("KMIIMWED.C")
	public int field839;

	@ObfuscatedName("KMIIMWED.K")
	public int field844;

	@ObfuscatedName("KMIIMWED.L")
	public int field845;

	@ObfuscatedName("KMIIMWED.M")
	public int field846;

	@ObfuscatedName("KMIIMWED.N")
	public int field847;

	@ObfuscatedName("KMIIMWED.O")
	public int field848;

	@ObfuscatedName("KMIIMWED.P")
	public int field849;

	@ObfuscatedName("KMIIMWED.k")
	public long field822;

	@ObfuscatedName("KMIIMWED.H")
	public OKKEIIWQ field842;

	@ObfuscatedName("KMIIMWED.q")
	public client field828;

	@ObfuscatedName("KMIIMWED.c")
	public InputStream field814;

	@ObfuscatedName("KMIIMWED.A")
	public OutputStream field837;

	@ObfuscatedName("KMIIMWED.f")
	public Socket field817;

	@ObfuscatedName("KMIIMWED.l")
	public byte[] field823;

	@ObfuscatedName("KMIIMWED.h")
	public int[] field819;

	@ObfuscatedName("KMIIMWED.i")
	public int[] field820;

	@ObfuscatedName("KMIIMWED.n")
	public int[] field825;

	@ObfuscatedName("KMIIMWED.o")
	public int[] field826;

	@ObfuscatedName("KMIIMWED.s")
	public int[] field830;

	@ObfuscatedName("KMIIMWED.Q")
	public int[] field850;

	@ObfuscatedName("KMIIMWED.b(I)V")
	public final void method304() {
		field845 = 0;
		field846 = 0;
		for (OKKEIIWQ var1 = (OKKEIIWQ) field821.method470(); var1 != null; var1 = (OKKEIIWQ) field821.method472()) {
			if (var1.field908) {
				field845++;
			} else {
				field846++;
			}
		}

		while (field845 < 10) {
			OKKEIIWQ var2 = (OKKEIIWQ) field834.method469();
			if (var2 == null) {
				break;
			}

			if (field841[var2.field909][var2.field907] != 0) {
				field835++;
			}

			field841[var2.field909][var2.field907] = 0;
			field821.method467(var2);
			field845++;
			method309(var2);
			field829 = true;
		}
	}

	@ObfuscatedName("KMIIMWED.c(I)V")
	public final void method305() {
		OKKEIIWQ var2;
		synchronized (field813) {
			var2 = (OKKEIIWQ) field813.method469();
		}

		while (var2 != null) {
			field829 = true;
			byte[] var3 = null;
			if (field828.field220[0] != null) {
				var3 = field828.field220[var2.field909 + 1].method500(var2.field907);
			}

			if (!method324(var3, field833[var2.field909][var2.field907], field818[var2.field909][var2.field907])) {
				var3 = null;
			}

			synchronized (field813) {
				if (var3 == null) {
					field834.method467(var2);
				} else {
					var2.field910 = var3;

					synchronized (field832) {
						field832.method467(var2);
					}
				}

				var2 = (OKKEIIWQ) field813.method469();
			}
		}
	}

	@ObfuscatedName("KMIIMWED.a()I")
	public final int method306() {
		synchronized (field815) {
			return field815.method348();
		}
	}

	@ObfuscatedName("KMIIMWED.a(IZ)Z")
	public final boolean method307(int arg0) {
		if (field819[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("KMIIMWED.a(ZIII)I")
	public final int method308(int arg0, int arg1, int arg2) {
		int var4 = (arg0 << 8) + arg2;
		for (int var5 = 0; var5 < field830.length; var5++) {
			if (field830[var5] == var4) {
				if (arg1 == 0) {
					return field826[var5];
				}

				return field850[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("KMIIMWED.a(ZLOKKEIIWQ;)V")
	public final void method309(OKKEIIWQ arg0) {
		try {
			if (field817 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field822 < 4000L) {
					return;
				}

				field822 = var2;
				field817 = field828.method100(client.field239 + 43594);
				field814 = field817.getInputStream();
				field837 = field817.getOutputStream();
				field837.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field814.read();
				}

				field844 = 0;
			}

			field831[0] = (byte) arg0.field909;
			field831[1] = (byte) (arg0.field907 >> 8);
			field831[2] = (byte) arg0.field907;
			if (arg0.field908) {
				field831[3] = 2;
			} else if (field828.field418) {
				field831[3] = 0;
			} else {
				field831[3] = 1;
			}

			field837.write(field831, 0, 4);
			field824 = 0;
			field848 = -10000;
		} catch (IOException var7) {
			try {
				field817.close();
			} catch (Exception var6) {
			}

			field817 = null;
			field814 = null;
			field837 = null;
			field839 = 0;
			field848++;
		}
	}

	@ObfuscatedName("KMIIMWED.a(ZZ)V")
	public final void method310(boolean arg0) {
		int var2 = field830.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field820[var3] != 0) {
				method314(3, field850[var3], (byte) 2);
				method314(3, field826[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("KMIIMWED.a(B)V")
	public final void method311() {
		while (field845 == 0) {
			if (field846 >= 10 || field816 == 0) {
				return;
			}

			OKKEIIWQ var2;
			synchronized (field851) {
				var2 = (OKKEIIWQ) field851.method469();
			}

			while (var2 != null) {
				if (field841[var2.field909][var2.field907] != 0) {
					field841[var2.field909][var2.field907] = 0;
					field821.method467(var2);
					method309(var2);
					field829 = true;

					if (field835 < field849) {
						field835++;
					}

					field836 = "Loading extra files - " + field835 * 100 / field849 + "%";
					field846++;
					if (field846 == 10) {
						return;
					}
				}

				synchronized (field851) {
					var2 = (OKKEIIWQ) field851.method469();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field841[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field816) {
						var5[var7] = 0;
						OKKEIIWQ var8 = new OKKEIIWQ();
						var8.field909 = var4;
						var8.field907 = var7;
						var8.field908 = false;
						field821.method467(var8);
						method309(var8);
						field829 = true;

						if (field835 < field849) {
							field835++;
						}

						field836 = "Loading extra files - " + field835 * 100 / field849 + "%";
						field846++;
						if (field846 == 10) {
							return;
						}
					}
				}
			}

			field816--;
		}
	}

	@ObfuscatedName("KMIIMWED.b()LOKKEIIWQ;")
	public final OKKEIIWQ method312() {
		OKKEIIWQ var2;
		synchronized (field832) {
			var2 = (OKKEIIWQ) field832.method469();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field815) {
			var2.method499();
		}

		if (var2.field910 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field910));
			while (true) {
				if (field840.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field840, var4, field840.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field910 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field910[var7] = field840[var7];
		}

		return var2;
	}

	@ObfuscatedName("KMIIMWED.a(I)V")
	public final void method299(int arg0) {
		method321(0, arg0);
	}

	@ObfuscatedName("KMIIMWED.d(I)I")
	public final int method313() {
		return field825.length;
	}

	@ObfuscatedName("KMIIMWED.a(IIBB)V")
	public final void method314(int arg0, int arg1, byte arg2) {
		if (field828.field220[0] != null && field833[arg0][arg1] != 0) {
			byte[] var4 = field828.field220[arg0 + 1].method500(arg1);
			if (!method324(var4, field833[arg0][arg1], field818[arg0][arg1])) {
				field841[arg0][arg1] = arg2;

				if (arg2 > field816) {
					field816 = arg2;
				}

				field849++;
			}
		}
	}

	@ObfuscatedName("KMIIMWED.a(II)I")
	public final int method315(int arg0) {
		return field833[arg0].length;
	}

	@ObfuscatedName("KMIIMWED.e(I)V")
	public final void method316() {
		synchronized (field851) {
			field851.method474();
		}
	}

	@ObfuscatedName("KMIIMWED.a(LMAARFNGV;Lclient;)V")
	public final void method317(MAARFNGV arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method332(var3[var4], null);
			int var6 = var5.length / 2;
			EMWAMCXW var7 = new EMWAMCXW(var5);
			field833[var4] = new int[var6];
			field841[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field833[var4][var8] = var7.method219();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method332(var9[var10], null);
			int var12 = var11.length / 4;
			EMWAMCXW var13 = new EMWAMCXW(var11);
			field818[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field818[var10][var14] = var13.method222();
			}
		}

		byte[] var15 = arg0.method332("model_index", null);
		int var16 = field833[0].length;
		field823 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field823[var17] = var15[var17];
			} else {
				field823[var17] = 0;
			}
		}

		byte[] var18 = arg0.method332("map_index", null);
		EMWAMCXW var19 = new EMWAMCXW(var18);
		int var20 = var18.length / 7;
		field830 = new int[var20];
		field826 = new int[var20];
		field850 = new int[var20];
		field820 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field830[var21] = var19.method219();
			field826[var21] = var19.method219();
			field850[var21] = var19.method219();
			field820[var21] = var19.method217();
		}

		byte[] var22 = arg0.method332("anim_index", null);
		EMWAMCXW var23 = new EMWAMCXW(var22);
		int var24 = var22.length / 2;
		field825 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field825[var25] = var23.method219();
		}

		byte[] var26 = arg0.method332("midi_index", null);
		EMWAMCXW var27 = new EMWAMCXW(var26);
		int var28 = var26.length;
		field819 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field819[var29] = var27.method217();
		}

		field828 = arg1;
		field843 = true;
		field828.method185(this, 2);
	}

	public final void run() {
		try {
			while (field843) {
				field847++;
				byte var1 = 20;
				if (field816 == 0 && field828.field220[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field829 = true;
				for (int var2 = 0; var2 < 100 && field829; var2++) {
					field829 = false;
					method305();
					method304();

					if (field845 == 0 && var2 >= 5) {
						break;
					}

					method311();

					if (field814 != null) {
						method323();
					}
				}

				boolean var3 = false;
				for (OKKEIIWQ var4 = (OKKEIIWQ) field821.method470(); var4 != null; var4 = (OKKEIIWQ) field821.method472()) {
					if (var4.field908) {
						var3 = true;
						var4.field911++;
						if (var4.field911 > 50) {
							var4.field911 = 0;
							method309(var4);
						}
					}
				}

				if (!var3) {
					for (OKKEIIWQ var5 = (OKKEIIWQ) field821.method470(); var5 != null; var5 = (OKKEIIWQ) field821.method472()) {
						var3 = true;
						var5.field911++;
						if (var5.field911 > 50) {
							var5.field911 = 0;
							method309(var5);
						}
					}
				}

				if (var3) {
					field844++;
					if (field844 > 750) {
						try {
							field817.close();
						} catch (Exception var8) {
						}

						field817 = null;
						field814 = null;
						field837 = null;
						field839 = 0;
					}
				} else {
					field844 = 0;
					field836 = "";
				}

				if (field828.field418 && field817 != null && field837 != null && (field816 > 0 || field828.field220[0] == null)) {
					field824++;
					if (field824 > 500) {
						field824 = 0;
						field831[0] = 0;
						field831[1] = 0;
						field831[2] = 0;
						field831[3] = 10;
						try {
							field837.write(field831, 0, 4);
						} catch (IOException var7) {
							field844 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("KMIIMWED.a(IB)Z")
	public final boolean method318(int arg0) {
		for (int var2 = 0; var2 < field830.length; var2++) {
			if (field850[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("KMIIMWED.a(IZI)V")
	public final void method319(int arg0, int arg1) {
		if (field828.field220[0] != null && (field833[arg0][arg1] != 0 && (field841[arg0][arg1] != 0 && field816 != 0))) {
			OKKEIIWQ var3 = new OKKEIIWQ();
			var3.field909 = arg0;
			var3.field907 = arg1;
			var3.field908 = false;

			synchronized (field851) {
				field851.method467(var3);
			}
		}
	}

	@ObfuscatedName("KMIIMWED.c()V")
	public final void method320() {
		field843 = false;
	}

	@ObfuscatedName("KMIIMWED.b(II)V")
	public final void method321(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field833.length && arg1 >= 0 && arg1 <= field833[arg0].length && field833[arg0][arg1] != 0) {
			synchronized (field815) {
				for (OKKEIIWQ var4 = (OKKEIIWQ) field815.method346(); var4 != null; var4 = (OKKEIIWQ) field815.method347()) {
					if (var4.field909 == arg0 && var4.field907 == arg1) {
						return;
					}
				}

				OKKEIIWQ var5 = new OKKEIIWQ();
				var5.field909 = arg0;
				var5.field907 = arg1;
				var5.field908 = true;

				synchronized (field813) {
					field813.method467(var5);
				}

				field815.method344(var5);
			}
		}
	}

	@ObfuscatedName("KMIIMWED.c(II)I")
	public final int method322(int arg0) {
		return field823[arg0] & 0xFF;
	}

	@ObfuscatedName("KMIIMWED.a(Z)V")
	public final void method323() {
		try {
			int var1 = field814.available();
			if (field839 == 0 && var1 >= 6) {
				field829 = true;

				for (int var2 = 0; var2 < 6; var2 += field814.read(field831, var2, 6 - var2)) {
				}

				int var3 = field831[0] & 0xFF;
				int var4 = ((field831[1] & 0xFF) << 8) + (field831[2] & 0xFF);
				int var5 = ((field831[3] & 0xFF) << 8) + (field831[4] & 0xFF);
				int var6 = field831[5] & 0xFF;
				field842 = null;
				for (OKKEIIWQ var7 = (OKKEIIWQ) field821.method470(); var7 != null; var7 = (OKKEIIWQ) field821.method472()) {
					if (var7.field909 == var3 && var7.field907 == var4) {
						field842 = var7;
					}

					if (field842 != null) {
						var7.field911 = 0;
					}
				}

				if (field842 != null) {
					field844 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field842.field910 = null;

						if (field842.field908) {
							synchronized (field832) {
								field832.method467(field842);
							}
						} else {
							field842.method338();
						}

						field842 = null;
					} else {
						if (field842.field910 == null && var6 == 0) {
							field842.field910 = new byte[var5];
						}

						if (field842.field910 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field838 = var6 * 500;
				field839 = 500;
				if (field839 > var5 - var6 * 500) {
					field839 = var5 - var6 * 500;
				}
			}

			if (field839 > 0 && var1 >= field839) {
				field829 = true;
				byte[] var9 = field831;
				int var10 = 0;
				if (field842 != null) {
					var9 = field842.field910;
					var10 = field838;
				}

				for (int var11 = 0; var11 < field839; var11 += field814.read(var9, var10 + var11, field839 - var11)) {
				}

				if (field839 + field838 >= var9.length && field842 != null) {
					if (field828.field220[0] != null) {
						field828.field220[field842.field909 + 1].method501(var9, var9.length, field842.field907);
					}

					if (!field842.field908 && field842.field909 == 3) {
						field842.field908 = true;
						field842.field909 = 93;
					}

					if (field842.field908) {
						synchronized (field832) {
							field832.method467(field842);
						}
					} else {
						field842.method338();
					}
				}

				field839 = 0;
			}
		} catch (IOException var17) {
			try {
				field817.close();
			} catch (Exception var14) {
			}

			field817 = null;
			field814 = null;
			field837 = null;
			field839 = 0;
		}
	}

	@ObfuscatedName("KMIIMWED.a(I[BII)Z")
	public final boolean method324(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field827.reset();
			field827.update(arg0, 0, var4);
			int var6 = (int) field827.getValue();

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
}
