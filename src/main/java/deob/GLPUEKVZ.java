package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("GLPUEKVZ")
public class GLPUEKVZ extends PBGKLTHZ implements Runnable {

	@ObfuscatedName("GLPUEKVZ.b")
	public LOISKKJJ field642 = new LOISKKJJ();

	@ObfuscatedName("GLPUEKVZ.d")
	public int[][] field643 = new int[4][];

	@ObfuscatedName("GLPUEKVZ.l")
	public DTFBSXNF field649 = new DTFBSXNF();

	@ObfuscatedName("GLPUEKVZ.m")
	public boolean field650 = true;

	@ObfuscatedName("GLPUEKVZ.o")
	public String field652 = "";

	@ObfuscatedName("GLPUEKVZ.s")
	public LOISKKJJ field655 = new LOISKKJJ();

	@ObfuscatedName("GLPUEKVZ.t")
	public LOISKKJJ field656 = new LOISKKJJ();

	@ObfuscatedName("GLPUEKVZ.w")
	public LOISKKJJ field659 = new LOISKKJJ();

	@ObfuscatedName("GLPUEKVZ.C")
	public byte[][] field665 = new byte[4][];

	@ObfuscatedName("GLPUEKVZ.I")
	public LOISKKJJ field670 = new LOISKKJJ();

	@ObfuscatedName("GLPUEKVZ.K")
	public byte[] field672 = new byte[65000];

	@ObfuscatedName("GLPUEKVZ.N")
	public CRC32 field674 = new CRC32();

	@ObfuscatedName("GLPUEKVZ.O")
	public int[][] field675 = new int[4][];

	@ObfuscatedName("GLPUEKVZ.P")
	public boolean field676 = false;

	@ObfuscatedName("GLPUEKVZ.T")
	public byte[] field680 = new byte[500];

	@ObfuscatedName("GLPUEKVZ.g")
	public int field646;

	@ObfuscatedName("GLPUEKVZ.k")
	public int field648;

	@ObfuscatedName("GLPUEKVZ.n")
	public int field651;

	@ObfuscatedName("GLPUEKVZ.u")
	public int field657;

	@ObfuscatedName("GLPUEKVZ.v")
	public int field658;

	@ObfuscatedName("GLPUEKVZ.B")
	public int field664;

	@ObfuscatedName("GLPUEKVZ.G")
	public int field668;

	@ObfuscatedName("GLPUEKVZ.H")
	public int field669;

	@ObfuscatedName("GLPUEKVZ.J")
	public int field671;

	@ObfuscatedName("GLPUEKVZ.Q")
	public int field677;

	@ObfuscatedName("GLPUEKVZ.S")
	public int field679;

	@ObfuscatedName("GLPUEKVZ.M")
	public long field673;

	@ObfuscatedName("GLPUEKVZ.j")
	public UWCGEJPY field647;

	@ObfuscatedName("GLPUEKVZ.f")
	public client field645;

	@ObfuscatedName("GLPUEKVZ.x")
	public InputStream field660;

	@ObfuscatedName("GLPUEKVZ.z")
	public OutputStream field662;

	@ObfuscatedName("GLPUEKVZ.q")
	public Socket field653;

	@ObfuscatedName("GLPUEKVZ.y")
	public byte[] field661;

	@ObfuscatedName("GLPUEKVZ.e")
	public int[] field644;

	@ObfuscatedName("GLPUEKVZ.r")
	public int[] field654;

	@ObfuscatedName("GLPUEKVZ.A")
	public int[] field663;

	@ObfuscatedName("GLPUEKVZ.D")
	public int[] field666;

	@ObfuscatedName("GLPUEKVZ.E")
	public int[] field667;

	@ObfuscatedName("GLPUEKVZ.R")
	public int[] field678;

	@ObfuscatedName("GLPUEKVZ.b(I)V")
	public final void method276() {
		try {
			int var1 = field660.available();
			if (field669 == 0 && var1 >= 6) {
				field676 = true;

				for (int var2 = 0; var2 < 6; var2 += field660.read(field680, var2, 6 - var2)) {
				}

				int var3 = field680[0] & 0xFF;
				int var4 = ((field680[1] & 0xFF) << 8) + (field680[2] & 0xFF);
				int var5 = ((field680[3] & 0xFF) << 8) + (field680[4] & 0xFF);
				int var6 = field680[5] & 0xFF;
				field647 = null;
				for (UWCGEJPY var7 = (UWCGEJPY) field659.method451(); var7 != null; var7 = (UWCGEJPY) field659.method453()) {
					if (var7.field1280 == var3 && var7.field1279 == var4) {
						field647 = var7;
					}

					if (field647 != null) {
						var7.field1277 = 0;
					}
				}

				if (field647 != null) {
					field679 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field647.field1278 = null;

						if (field647.field1281) {
							synchronized (field670) {
								field670.method448(field647);
							}
						} else {
							field647.method156();
						}

						field647 = null;
					} else {
						if (field647.field1278 == null && var6 == 0) {
							field647.field1278 = new byte[var5];
						}

						if (field647.field1278 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field668 = var6 * 500;
				field669 = 500;
				if (field669 > var5 - var6 * 500) {
					field669 = var5 - var6 * 500;
				}
			}

			if (field669 > 0 && var1 >= field669) {
				field676 = true;
				byte[] var9 = field680;
				int var10 = 0;
				if (field647 != null) {
					var9 = field647.field1278;
					var10 = field668;
				}

				for (int var11 = 0; var11 < field669; var11 += field660.read(var9, var10 + var11, field669 - var11)) {
				}

				if (field669 + field668 >= var9.length && field647 != null) {
					if (field645.field155[0] != null) {
						field645.field155[field647.field1280 + 1].method511(var9, field647.field1279, var9.length);
					}

					if (!field647.field1281 && field647.field1280 == 3) {
						field647.field1281 = true;
						field647.field1280 = 93;
					}

					if (field647.field1281) {
						synchronized (field670) {
							field670.method448(field647);
						}
					} else {
						field647.method156();
					}
				}

				field669 = 0;
			}
		} catch (IOException var17) {
			try {
				field653.close();
			} catch (Exception var14) {
			}

			field653 = null;
			field660 = null;
			field662 = null;
			field669 = 0;
		}
	}

	@ObfuscatedName("GLPUEKVZ.c(I)V")
	public final void method277() {
		UWCGEJPY var2;
		synchronized (field655) {
			var2 = (UWCGEJPY) field655.method450();
		}

		while (var2 != null) {
			field676 = true;
			byte[] var3 = null;
			if (field645.field155[0] != null) {
				var3 = field645.field155[var2.field1280 + 1].method510(var2.field1279);
			}

			if (!method286(field643[var2.field1280][var2.field1279], field675[var2.field1280][var2.field1279], var3)) {
				var3 = null;
			}

			synchronized (field655) {
				if (var3 == null) {
					field656.method448(var2);
				} else {
					var2.field1278 = var3;

					synchronized (field670) {
						field670.method448(var2);
					}
				}

				var2 = (UWCGEJPY) field655.method450();
			}
		}
	}

	@ObfuscatedName("GLPUEKVZ.a(I)V")
	public final void method278(int arg0) {
		method284(0, arg0);
	}

	@ObfuscatedName("GLPUEKVZ.a(II)I")
	public final int method279(int arg0) {
		return field661[arg0] & 0xFF;
	}

	@ObfuscatedName("GLPUEKVZ.a()I")
	public final int method280() {
		synchronized (field649) {
			return field649.method213();
		}
	}

	@ObfuscatedName("GLPUEKVZ.a(B)V")
	public final void method281() {
		while (field657 == 0) {
			if (field658 >= 10 || field651 == 0) {
				return;
			}

			UWCGEJPY var2;
			synchronized (field642) {
				var2 = (UWCGEJPY) field642.method450();
			}

			while (var2 != null) {
				if (field665[var2.field1280][var2.field1279] != 0) {
					field665[var2.field1280][var2.field1279] = 0;
					field659.method448(var2);
					method290(var2);
					field676 = true;

					if (field646 < field671) {
						field646++;
					}

					field652 = "Loading extra files - " + field646 * 100 / field671 + "%";
					field658++;
					if (field658 == 10) {
						return;
					}
				}

				synchronized (field642) {
					var2 = (UWCGEJPY) field642.method450();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field665[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field651) {
						var5[var7] = 0;
						UWCGEJPY var8 = new UWCGEJPY();
						var8.field1280 = var4;
						var8.field1279 = var7;
						var8.field1281 = false;
						field659.method448(var8);
						method290(var8);
						field676 = true;

						if (field646 < field671) {
							field646++;
						}

						field652 = "Loading extra files - " + field646 * 100 / field671 + "%";
						field658++;
						if (field658 == 10) {
							return;
						}
					}
				}
			}

			field651--;
		}
	}

	@ObfuscatedName("GLPUEKVZ.b()V")
	public final void method282() {
		field650 = false;
	}

	@ObfuscatedName("GLPUEKVZ.a(IBBI)V")
	public final void method283(int arg0, byte arg1, int arg2) {
		if (field645.field155[0] != null && field675[arg2][arg0] != 0) {
			byte[] var4 = field645.field155[arg2 + 1].method510(arg0);
			if (!method286(field643[arg2][arg0], field675[arg2][arg0], var4)) {
				field665[arg2][arg0] = arg1;

				if (arg1 > field651) {
					field651 = arg1;
				}

				field671++;
			}
		}
	}

	@ObfuscatedName("GLPUEKVZ.b(II)V")
	public final void method284(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field675.length && arg1 >= 0 && arg1 <= field675[arg0].length && field675[arg0][arg1] != 0) {
			synchronized (field649) {
				for (UWCGEJPY var4 = (UWCGEJPY) field649.method211(); var4 != null; var4 = (UWCGEJPY) field649.method212()) {
					if (var4.field1280 == arg0 && var4.field1279 == arg1) {
						return;
					}
				}

				UWCGEJPY var5 = new UWCGEJPY();
				var5.field1280 = arg0;
				var5.field1279 = arg1;
				var5.field1281 = true;

				synchronized (field655) {
					field655.method448(var5);
				}

				field649.method209(var5);
			}
		}
	}

	@ObfuscatedName("GLPUEKVZ.a(IIIZ)I")
	public final int method285(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg0;
		for (int var5 = 0; var5 < field678.length; var5++) {
			if (field678[var5] == var4) {
				if (arg1 == 0) {
					return field644[var5];
				}

				return field667[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("GLPUEKVZ.a(III[B)Z")
	public final boolean method286(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field674.reset();
			field674.update(arg2, 0, var4);
			int var6 = (int) field674.getValue();

			if (arg1 != var5) {
				return false;
			}

			if (arg0 != var6) {
				return false;
			}

			return true;
		}

		return false;
	}

	@ObfuscatedName("GLPUEKVZ.a(LSPZBTZXL;Lclient;)V")
	public final void method287(SPZBTZXL arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method515(var3[var4], null);
			int var6 = var5.length / 2;
			LDILQFVA var7 = new LDILQFVA(var5);
			field675[var4] = new int[var6];
			field665[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field675[var4][var8] = var7.method404();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method515(var9[var10], null);
			int var12 = var11.length / 4;
			LDILQFVA var13 = new LDILQFVA(var11);
			field643[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field643[var10][var14] = var13.method407();
			}
		}

		byte[] var15 = arg0.method515("model_index", null);
		int var16 = field675[0].length;
		field661 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field661[var17] = var15[var17];
			} else {
				field661[var17] = 0;
			}
		}

		byte[] var18 = arg0.method515("map_index", null);
		LDILQFVA var19 = new LDILQFVA(var18);
		int var20 = var18.length / 7;
		field678 = new int[var20];
		field644 = new int[var20];
		field667 = new int[var20];
		field654 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field678[var21] = var19.method404();
			field644[var21] = var19.method404();
			field667[var21] = var19.method404();
			field654[var21] = var19.method402();
		}

		byte[] var22 = arg0.method515("anim_index", null);
		LDILQFVA var23 = new LDILQFVA(var22);
		int var24 = var22.length / 2;
		field663 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field663[var25] = var23.method404();
		}

		byte[] var26 = arg0.method515("midi_index", null);
		LDILQFVA var27 = new LDILQFVA(var26);
		int var28 = var26.length;
		field666 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field666[var29] = var27.method402();
		}

		field645 = arg1;
		field650 = true;
		field645.method64(this, 2);
	}

	public final void run() {
		try {
			while (field650) {
				field664++;
				byte var1 = 20;
				if (field651 == 0 && field645.field155[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field676 = true;
				for (int var2 = 0; var2 < 100 && field676; var2++) {
					field676 = false;
					method277();
					method293();

					if (field657 == 0 && var2 >= 5) {
						break;
					}

					method281();

					if (field660 != null) {
						method276();
					}
				}

				boolean var3 = false;
				for (UWCGEJPY var4 = (UWCGEJPY) field659.method451(); var4 != null; var4 = (UWCGEJPY) field659.method453()) {
					if (var4.field1281) {
						var3 = true;
						var4.field1277++;
						if (var4.field1277 > 50) {
							var4.field1277 = 0;
							method290(var4);
						}
					}
				}

				if (!var3) {
					for (UWCGEJPY var5 = (UWCGEJPY) field659.method451(); var5 != null; var5 = (UWCGEJPY) field659.method453()) {
						var3 = true;
						var5.field1277++;
						if (var5.field1277 > 50) {
							var5.field1277 = 0;
							method290(var5);
						}
					}
				}

				if (var3) {
					field679++;
					if (field679 > 750) {
						try {
							field653.close();
						} catch (Exception var8) {
						}

						field653 = null;
						field660 = null;
						field662 = null;
						field669 = 0;
					}
				} else {
					field679 = 0;
					field652 = "";
				}

				if (field645.field285 && field653 != null && field662 != null && (field651 > 0 || field645.field155[0] == null)) {
					field677++;
					if (field677 > 500) {
						field677 = 0;
						field680[0] = 0;
						field680[1] = 0;
						field680[2] = 0;
						field680[3] = 10;
						try {
							field662.write(field680, 0, 4);
						} catch (IOException var7) {
							field679 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("GLPUEKVZ.a(ZI)Z")
	public final boolean method288(int arg0) {
		if (field666[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("GLPUEKVZ.b(ZI)Z")
	public final boolean method289(int arg0) {
		for (int var2 = 0; var2 < field678.length; var2++) {
			if (field667[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("GLPUEKVZ.a(LUWCGEJPY;I)V")
	public final void method290(UWCGEJPY arg0) {
		try {
			if (field653 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field673 < 4000L) {
					return;
				}

				field673 = var2;
				field653 = field645.method105(client.field363 + 43594);
				field660 = field653.getInputStream();
				field662 = field653.getOutputStream();
				field662.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field660.read();
				}

				field679 = 0;
			}

			field680[0] = (byte) arg0.field1280;
			field680[1] = (byte) (arg0.field1279 >> 8);
			field680[2] = (byte) arg0.field1279;
			if (arg0.field1281) {
				field680[3] = 2;
			} else if (field645.field285) {
				field680[3] = 0;
			} else {
				field680[3] = 1;
			}

			field662.write(field680, 0, 4);
			field677 = 0;
			field648 = -10000;
		} catch (IOException var7) {
			try {
				field653.close();
			} catch (Exception var6) {
			}

			field653 = null;
			field660 = null;
			field662 = null;
			field669 = 0;
			field648++;
		}
	}

	@ObfuscatedName("GLPUEKVZ.d(I)V")
	public final void method291() {
		synchronized (field642) {
			field642.method455();
		}
	}

	@ObfuscatedName("GLPUEKVZ.a(BZ)V")
	public final void method292(boolean arg0) {
		int var2 = field678.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field654[var3] != 0) {
				method283(field667[var3], (byte) 2, 3);
				method283(field644[var3], (byte) 2, 3);
			}
		}
	}

	@ObfuscatedName("GLPUEKVZ.b(B)V")
	public final void method293() {
		field657 = 0;
		field658 = 0;
		for (UWCGEJPY var1 = (UWCGEJPY) field659.method451(); var1 != null; var1 = (UWCGEJPY) field659.method453()) {
			if (var1.field1281) {
				field657++;
			} else {
				field658++;
			}
		}

		while (field657 < 10) {
			UWCGEJPY var2 = (UWCGEJPY) field656.method450();
			if (var2 == null) {
				break;
			}

			if (field665[var2.field1280][var2.field1279] != 0) {
				field646++;
			}

			field665[var2.field1280][var2.field1279] = 0;
			field659.method448(var2);
			field657++;
			method290(var2);
			field676 = true;
		}
	}

	@ObfuscatedName("GLPUEKVZ.c()LUWCGEJPY;")
	public final UWCGEJPY method294() {
		UWCGEJPY var2;
		synchronized (field670) {
			var2 = (UWCGEJPY) field670.method450();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field649) {
			var2.method373();
		}

		if (var2.field1278 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1278));
			while (true) {
				if (field672.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field672, var4, field672.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1278 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1278[var7] = field672[var7];
		}

		return var2;
	}

	@ObfuscatedName("GLPUEKVZ.a(BI)I")
	public final int method295(int arg0) {
		return field675[arg0].length;
	}

	@ObfuscatedName("GLPUEKVZ.a(IBI)V")
	public final void method296(int arg0, int arg1) {
		if (field645.field155[0] != null && (field675[arg0][arg1] != 0 && (field665[arg0][arg1] != 0 && field651 != 0))) {
			UWCGEJPY var3 = new UWCGEJPY();
			var3.field1280 = arg0;
			var3.field1279 = arg1;
			var3.field1281 = false;

			synchronized (field642) {
				field642.method448(var3);
			}
		}
	}

	@ObfuscatedName("GLPUEKVZ.e(I)I")
	public final int method297() {
		return field663.length;
	}
}
