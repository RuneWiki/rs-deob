package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("LNOSHUMO")
public class LNOSHUMO extends ITBJKTAT implements Runnable {

	@ObfuscatedName("LNOSHUMO.b")
	public int[][] field823 = new int[4][];

	@ObfuscatedName("LNOSHUMO.c")
	public byte[][] field824 = new byte[4][];

	@ObfuscatedName("LNOSHUMO.d")
	public CRC32 field825 = new CRC32();

	@ObfuscatedName("LNOSHUMO.f")
	public String field826 = "";

	@ObfuscatedName("LNOSHUMO.g")
	public VLLJSJTJ field827 = new VLLJSJTJ();

	@ObfuscatedName("LNOSHUMO.k")
	public int[][] field831 = new int[4][];

	@ObfuscatedName("LNOSHUMO.n")
	public VLLJSJTJ field834 = new VLLJSJTJ();

	@ObfuscatedName("LNOSHUMO.s")
	public byte[] field838 = new byte[65000];

	@ObfuscatedName("LNOSHUMO.v")
	public byte[] field840 = new byte[500];

	@ObfuscatedName("LNOSHUMO.C")
	public boolean field847 = true;

	@ObfuscatedName("LNOSHUMO.G")
	public LAPJVQGB field851 = new LAPJVQGB();

	@ObfuscatedName("LNOSHUMO.H")
	public boolean field852 = false;

	@ObfuscatedName("LNOSHUMO.M")
	public VLLJSJTJ field856 = new VLLJSJTJ();

	@ObfuscatedName("LNOSHUMO.N")
	public VLLJSJTJ field857 = new VLLJSJTJ();

	@ObfuscatedName("LNOSHUMO.P")
	public VLLJSJTJ field859 = new VLLJSJTJ();

	@ObfuscatedName("LNOSHUMO.i")
	public int field829;

	@ObfuscatedName("LNOSHUMO.j")
	public int field830;

	@ObfuscatedName("LNOSHUMO.q")
	public int field836;

	@ObfuscatedName("LNOSHUMO.t")
	public int field839;

	@ObfuscatedName("LNOSHUMO.x")
	public int field842;

	@ObfuscatedName("LNOSHUMO.A")
	public int field845;

	@ObfuscatedName("LNOSHUMO.B")
	public int field846;

	@ObfuscatedName("LNOSHUMO.F")
	public int field850;

	@ObfuscatedName("LNOSHUMO.J")
	public int field854;

	@ObfuscatedName("LNOSHUMO.K")
	public int field855;

	@ObfuscatedName("LNOSHUMO.O")
	public int field858;

	@ObfuscatedName("LNOSHUMO.E")
	public long field849;

	@ObfuscatedName("LNOSHUMO.p")
	public MFGDOVSO field835;

	@ObfuscatedName("LNOSHUMO.I")
	public client field853;

	@ObfuscatedName("LNOSHUMO.m")
	public InputStream field833;

	@ObfuscatedName("LNOSHUMO.w")
	public OutputStream field841;

	@ObfuscatedName("LNOSHUMO.D")
	public Socket field848;

	@ObfuscatedName("LNOSHUMO.r")
	public byte[] field837;

	@ObfuscatedName("LNOSHUMO.h")
	public int[] field828;

	@ObfuscatedName("LNOSHUMO.l")
	public int[] field832;

	@ObfuscatedName("LNOSHUMO.y")
	public int[] field843;

	@ObfuscatedName("LNOSHUMO.z")
	public int[] field844;

	@ObfuscatedName("LNOSHUMO.Q")
	public int[] field860;

	@ObfuscatedName("LNOSHUMO.R")
	public int[] field861;

	@ObfuscatedName("LNOSHUMO.a(ZB)V")
	public final void method357(boolean arg0) {
		int var2 = field860.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field832[var3] != 0) {
				method373(3, (byte) 2, field844[var3]);
				method373(3, (byte) 2, field828[var3]);
			}
		}
	}

	@ObfuscatedName("LNOSHUMO.a(II)I")
	public final int method358(int arg0) {
		return field837[arg0] & 0xFF;
	}

	@ObfuscatedName("LNOSHUMO.b(I)V")
	public final void method359() {
		try {
			int var1 = field833.available();
			if (field830 == 0 && var1 >= 6) {
				field852 = true;

				for (int var2 = 0; var2 < 6; var2 += field833.read(field840, var2, 6 - var2)) {
				}

				int var3 = field840[0] & 0xFF;
				int var4 = ((field840[1] & 0xFF) << 8) + (field840[2] & 0xFF);
				int var5 = ((field840[3] & 0xFF) << 8) + (field840[4] & 0xFF);
				int var6 = field840[5] & 0xFF;
				field835 = null;
				for (MFGDOVSO var7 = (MFGDOVSO) field859.method528(); var7 != null; var7 = (MFGDOVSO) field859.method530()) {
					if (var7.field909 == var3 && var7.field911 == var4) {
						field835 = var7;
					}

					if (field835 != null) {
						var7.field910 = 0;
					}
				}

				if (field835 != null) {
					field855 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field835.field913 = null;

						if (field835.field912) {
							synchronized (field827) {
								field827.method525(field835);
							}
						} else {
							field835.method555();
						}

						field835 = null;
					} else {
						if (field835.field913 == null && var6 == 0) {
							field835.field913 = new byte[var5];
						}

						if (field835.field913 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field829 = var6 * 500;
				field830 = 500;
				if (field830 > var5 - var6 * 500) {
					field830 = var5 - var6 * 500;
				}
			}

			if (field830 > 0 && var1 >= field830) {
				field852 = true;
				byte[] var9 = field840;
				int var10 = 0;
				if (field835 != null) {
					var9 = field835.field913;
					var10 = field829;
				}

				for (int var11 = 0; var11 < field830; var11 += field833.read(var9, var10 + var11, field830 - var11)) {
				}

				if (field830 + field829 >= var9.length && field835 != null) {
					if (field853.field541[0] != null) {
						field853.field541[field835.field909 + 1].method534(var9.length, var9, field835.field911);
					}

					if (!field835.field912 && field835.field909 == 3) {
						field835.field912 = true;
						field835.field909 = 93;
					}

					if (field835.field912) {
						synchronized (field827) {
							field827.method525(field835);
						}
					} else {
						field835.method555();
					}
				}

				field830 = 0;
			}
		} catch (IOException var17) {
			try {
				field848.close();
			} catch (Exception var14) {
			}

			field848 = null;
			field833 = null;
			field841 = null;
			field830 = 0;
		}
	}

	@ObfuscatedName("LNOSHUMO.a(III)V")
	public final void method360(int arg0, int arg1) {
		if (field853.field541[0] != null && (field831[arg1][arg0] != 0 && (field824[arg1][arg0] != 0 && field842 != 0))) {
			MFGDOVSO var3 = new MFGDOVSO();
			var3.field909 = arg1;
			var3.field911 = arg0;
			var3.field912 = false;

			synchronized (field857) {
				field857.method525(var3);
			}
		}
	}

	@ObfuscatedName("LNOSHUMO.a(Z)V")
	public final void method361() {
		synchronized (field857) {
			field857.method532();
		}
	}

	@ObfuscatedName("LNOSHUMO.a(IZ)Z")
	public final boolean method362(int arg0) {
		if (field861[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("LNOSHUMO.a(B)V")
	public final void method363() {
		while (field845 == 0) {
			if (field846 >= 10 || field842 == 0) {
				return;
			}

			MFGDOVSO var2;
			synchronized (field857) {
				var2 = (MFGDOVSO) field857.method527();
			}

			while (var2 != null) {
				if (field824[var2.field909][var2.field911] != 0) {
					field824[var2.field909][var2.field911] = 0;
					field859.method525(var2);
					method375(var2);
					field852 = true;

					if (field858 < field836) {
						field858++;
					}

					field826 = "Loading extra files - " + field858 * 100 / field836 + "%";
					field846++;
					if (field846 == 10) {
						return;
					}
				}

				synchronized (field857) {
					var2 = (MFGDOVSO) field857.method527();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field824[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field842) {
						var5[var7] = 0;
						MFGDOVSO var8 = new MFGDOVSO();
						var8.field909 = var4;
						var8.field911 = var7;
						var8.field912 = false;
						field859.method525(var8);
						method375(var8);
						field852 = true;

						if (field858 < field836) {
							field858++;
						}

						field826 = "Loading extra files - " + field858 * 100 / field836 + "%";
						field846++;
						if (field846 == 10) {
							return;
						}
					}
				}
			}

			field842--;
		}
	}

	@ObfuscatedName("LNOSHUMO.a([BIII)Z")
	public final boolean method364(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field825.reset();
			field825.update(arg0, 0, var4);
			int var6 = (int) field825.getValue();

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

	@ObfuscatedName("LNOSHUMO.b(II)V")
	public final void method365(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field831.length && arg1 >= 0 && arg1 <= field831[arg0].length && field831[arg0][arg1] != 0) {
			synchronized (field851) {
				for (MFGDOVSO var4 = (MFGDOVSO) field851.method348(); var4 != null; var4 = (MFGDOVSO) field851.method349()) {
					if (var4.field909 == arg0 && var4.field911 == arg1) {
						return;
					}
				}

				MFGDOVSO var5 = new MFGDOVSO();
				var5.field909 = arg0;
				var5.field911 = arg1;
				var5.field912 = true;

				synchronized (field834) {
					field834.method525(var5);
				}

				field851.method346(var5);
			}
		}
	}

	@ObfuscatedName("LNOSHUMO.a(I)V")
	public final void method341(int arg0) {
		method365(0, arg0);
	}

	@ObfuscatedName("LNOSHUMO.a()I")
	public final int method366() {
		synchronized (field851) {
			return field851.method350();
		}
	}

	@ObfuscatedName("LNOSHUMO.a(LXRWUKRPO;Lclient;)V")
	public final void method367(XRWUKRPO arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method581(var3[var4], null);
			int var6 = var5.length / 2;
			GLMIQHJI var7 = new GLMIQHJI(var5);
			field831[var4] = new int[var6];
			field824[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field831[var4][var8] = var7.method246();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method581(var9[var10], null);
			int var12 = var11.length / 4;
			GLMIQHJI var13 = new GLMIQHJI(var11);
			field823[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field823[var10][var14] = var13.method249();
			}
		}

		byte[] var15 = arg0.method581("model_index", null);
		int var16 = field831[0].length;
		field837 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field837[var17] = var15[var17];
			} else {
				field837[var17] = 0;
			}
		}

		byte[] var18 = arg0.method581("map_index", null);
		GLMIQHJI var19 = new GLMIQHJI(var18);
		int var20 = var18.length / 7;
		field860 = new int[var20];
		field828 = new int[var20];
		field844 = new int[var20];
		field832 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field860[var21] = var19.method246();
			field828[var21] = var19.method246();
			field844[var21] = var19.method246();
			field832[var21] = var19.method244();
		}

		byte[] var22 = arg0.method581("anim_index", null);
		GLMIQHJI var23 = new GLMIQHJI(var22);
		int var24 = var22.length / 2;
		field843 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field843[var25] = var23.method246();
		}

		byte[] var26 = arg0.method581("midi_index", null);
		GLMIQHJI var27 = new GLMIQHJI(var26);
		int var28 = var26.length;
		field861 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field861[var29] = var27.method244();
		}

		field853 = arg1;
		field847 = true;
		field853.method25(this, 2);
	}

	@ObfuscatedName("LNOSHUMO.b()V")
	public final void method368() {
		field847 = false;
	}

	@ObfuscatedName("LNOSHUMO.a(BI)Z")
	public final boolean method369(int arg0) {
		for (int var2 = 0; var2 < field860.length; var2++) {
			if (field844[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("LNOSHUMO.c(I)V")
	public final void method370() {
		MFGDOVSO var2;
		synchronized (field834) {
			var2 = (MFGDOVSO) field834.method527();
		}

		while (var2 != null) {
			field852 = true;
			byte[] var3 = null;
			if (field853.field541[0] != null) {
				var3 = field853.field541[var2.field909 + 1].method533(var2.field911);
			}

			if (!method364(var3, field823[var2.field909][var2.field911], field831[var2.field909][var2.field911])) {
				var3 = null;
			}

			synchronized (field834) {
				if (var3 == null) {
					field856.method525(var2);
				} else {
					var2.field913 = var3;

					synchronized (field827) {
						field827.method525(var2);
					}
				}

				var2 = (MFGDOVSO) field834.method527();
			}
		}
	}

	public final void run() {
		try {
			while (field847) {
				field850++;
				byte var1 = 20;
				if (field842 == 0 && field853.field541[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field852 = true;
				for (int var2 = 0; var2 < 100 && field852; var2++) {
					field852 = false;
					method370();
					method372();

					if (field845 == 0 && var2 >= 5) {
						break;
					}

					method363();

					if (field833 != null) {
						method359();
					}
				}

				boolean var3 = false;
				for (MFGDOVSO var4 = (MFGDOVSO) field859.method528(); var4 != null; var4 = (MFGDOVSO) field859.method530()) {
					if (var4.field912) {
						var3 = true;
						var4.field910++;
						if (var4.field910 > 50) {
							var4.field910 = 0;
							method375(var4);
						}
					}
				}

				if (!var3) {
					for (MFGDOVSO var5 = (MFGDOVSO) field859.method528(); var5 != null; var5 = (MFGDOVSO) field859.method530()) {
						var3 = true;
						var5.field910++;
						if (var5.field910 > 50) {
							var5.field910 = 0;
							method375(var5);
						}
					}
				}

				if (var3) {
					field855++;
					if (field855 > 750) {
						try {
							field848.close();
						} catch (Exception var8) {
						}

						field848 = null;
						field833 = null;
						field841 = null;
						field830 = 0;
					}
				} else {
					field855 = 0;
					field826 = "";
				}

				if (field853.field416 && field848 != null && field841 != null && (field842 > 0 || field853.field541[0] == null)) {
					field854++;
					if (field854 > 500) {
						field854 = 0;
						field840[0] = 0;
						field840[1] = 0;
						field840[2] = 0;
						field840[3] = 10;
						try {
							field841.write(field840, 0, 4);
						} catch (IOException var7) {
							field855 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("LNOSHUMO.c()LMFGDOVSO;")
	public final MFGDOVSO method371() {
		MFGDOVSO var2;
		synchronized (field827) {
			var2 = (MFGDOVSO) field827.method527();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field851) {
			var2.method342();
		}

		if (var2.field913 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field913));
			while (true) {
				if (field838.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field838, var4, field838.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field913 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field913[var7] = field838[var7];
		}

		return var2;
	}

	@ObfuscatedName("LNOSHUMO.b(Z)V")
	public final void method372() {
		field845 = 0;
		field846 = 0;
		for (MFGDOVSO var1 = (MFGDOVSO) field859.method528(); var1 != null; var1 = (MFGDOVSO) field859.method530()) {
			if (var1.field912) {
				field845++;
			} else {
				field846++;
			}
		}

		while (field845 < 10) {
			MFGDOVSO var2 = (MFGDOVSO) field856.method527();
			if (var2 == null) {
				break;
			}

			if (field824[var2.field909][var2.field911] != 0) {
				field858++;
			}

			field824[var2.field909][var2.field911] = 0;
			field859.method525(var2);
			field845++;
			method375(var2);
			field852 = true;
		}
	}

	@ObfuscatedName("LNOSHUMO.a(IIBI)V")
	public final void method373(int arg0, byte arg1, int arg2) {
		if (field853.field541[0] != null && field831[arg0][arg2] != 0) {
			byte[] var4 = field853.field541[arg0 + 1].method533(arg2);
			if (!method364(var4, field823[arg0][arg2], field831[arg0][arg2])) {
				field824[arg0][arg2] = arg1;

				if (arg1 > field842) {
					field842 = arg1;
				}

				field836++;
			}
		}
	}

	@ObfuscatedName("LNOSHUMO.b(IZ)I")
	public final int method374(int arg0) {
		return field831[arg0].length;
	}

	@ObfuscatedName("LNOSHUMO.a(ILMFGDOVSO;)V")
	public final void method375(MFGDOVSO arg0) {
		try {
			if (field848 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field849 < 4000L) {
					return;
				}

				field849 = var2;
				field848 = field853.method128(client.field212 + 43594);
				field833 = field848.getInputStream();
				field841 = field848.getOutputStream();
				field841.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field833.read();
				}

				field855 = 0;
			}

			field840[0] = (byte) arg0.field909;
			field840[1] = (byte) (arg0.field911 >> 8);
			field840[2] = (byte) arg0.field911;
			if (arg0.field912) {
				field840[3] = 2;
			} else if (field853.field416) {
				field840[3] = 0;
			} else {
				field840[3] = 1;
			}

			field841.write(field840, 0, 4);
			field854 = 0;
			field839 = -10000;
		} catch (IOException var7) {
			try {
				field848.close();
			} catch (Exception var6) {
			}

			field848 = null;
			field833 = null;
			field841 = null;
			field830 = 0;
			field839++;
		}
	}

	@ObfuscatedName("LNOSHUMO.a(IIII)I")
	public final int method376(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg0;
		for (int var5 = 0; var5 < field860.length; var5++) {
			if (field860[var5] == var4) {
				if (arg1 == 0) {
					return field828[var5];
				}

				return field844[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("LNOSHUMO.b(B)I")
	public final int method377() {
		return field843.length;
	}
}
