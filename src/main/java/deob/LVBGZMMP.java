package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("LVBGZMMP")
public class LVBGZMMP extends RTVVOBZM implements Runnable {

	@ObfuscatedName("LVBGZMMP.b")
	public CRC32 field747 = new CRC32();

	@ObfuscatedName("LVBGZMMP.d")
	public boolean field749 = false;

	@ObfuscatedName("LVBGZMMP.f")
	public byte[] field751 = new byte[65000];

	@ObfuscatedName("LVBGZMMP.g")
	public boolean field752 = true;

	@ObfuscatedName("LVBGZMMP.l")
	public QGWIBVPG field756 = new QGWIBVPG();

	@ObfuscatedName("LVBGZMMP.v")
	public int[][] field765 = new int[4][];

	@ObfuscatedName("LVBGZMMP.x")
	public QGWIBVPG field767 = new QGWIBVPG();

	@ObfuscatedName("LVBGZMMP.z")
	public QGWIBVPG field769 = new QGWIBVPG();

	@ObfuscatedName("LVBGZMMP.D")
	public byte[] field773 = new byte[500];

	@ObfuscatedName("LVBGZMMP.G")
	public String field776 = "";

	@ObfuscatedName("LVBGZMMP.H")
	public AAITTAMV field777 = new AAITTAMV();

	@ObfuscatedName("LVBGZMMP.I")
	public QGWIBVPG field778 = new QGWIBVPG();

	@ObfuscatedName("LVBGZMMP.J")
	public byte[][] field779 = new byte[4][];

	@ObfuscatedName("LVBGZMMP.M")
	public QGWIBVPG field781 = new QGWIBVPG();

	@ObfuscatedName("LVBGZMMP.N")
	public int[][] field782 = new int[4][];

	@ObfuscatedName("LVBGZMMP.i")
	public int field753;

	@ObfuscatedName("LVBGZMMP.j")
	public int field754;

	@ObfuscatedName("LVBGZMMP.k")
	public int field755;

	@ObfuscatedName("LVBGZMMP.m")
	public int field757;

	@ObfuscatedName("LVBGZMMP.p")
	public int field760;

	@ObfuscatedName("LVBGZMMP.y")
	public int field768;

	@ObfuscatedName("LVBGZMMP.A")
	public int field770;

	@ObfuscatedName("LVBGZMMP.B")
	public int field771;

	@ObfuscatedName("LVBGZMMP.C")
	public int field772;

	@ObfuscatedName("LVBGZMMP.E")
	public int field774;

	@ObfuscatedName("LVBGZMMP.K")
	public int field780;

	@ObfuscatedName("LVBGZMMP.r")
	public long field762;

	@ObfuscatedName("LVBGZMMP.P")
	public WNUCRRKP field784;

	@ObfuscatedName("LVBGZMMP.w")
	public client field766;

	@ObfuscatedName("LVBGZMMP.a")
	public InputStream field746;

	@ObfuscatedName("LVBGZMMP.e")
	public OutputStream field750;

	@ObfuscatedName("LVBGZMMP.o")
	public Socket field759;

	@ObfuscatedName("LVBGZMMP.t")
	public byte[] field764;

	@ObfuscatedName("LVBGZMMP.c")
	public int[] field748;

	@ObfuscatedName("LVBGZMMP.n")
	public int[] field758;

	@ObfuscatedName("LVBGZMMP.q")
	public int[] field761;

	@ObfuscatedName("LVBGZMMP.s")
	public int[] field763;

	@ObfuscatedName("LVBGZMMP.F")
	public int[] field775;

	@ObfuscatedName("LVBGZMMP.O")
	public int[] field783;

	@ObfuscatedName("LVBGZMMP.b(I)V")
	public final void method357() {
		synchronized (field767) {
			field767.method426();
		}
	}

	@ObfuscatedName("LVBGZMMP.a(LWNUCRRKP;Z)V")
	public final void method358(WNUCRRKP arg0) {
		try {
			if (field759 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field762 < 4000L) {
					return;
				}

				field762 = var2;
				field759 = field766.method73(client.field89 + 43594);
				field746 = field759.getInputStream();
				field750 = field759.getOutputStream();
				field750.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field746.read();
				}

				field774 = 0;
			}

			field773[0] = (byte) arg0.field1310;
			field773[1] = (byte) (arg0.field1308 >> 8);
			field773[2] = (byte) arg0.field1308;
			if (arg0.field1309) {
				field773[3] = 2;
			} else if (field766.field230) {
				field773[3] = 0;
			} else {
				field773[3] = 1;
			}

			field750.write(field773, 0, 4);
			field768 = 0;
			field760 = -10000;
		} catch (IOException var7) {
			try {
				field759.close();
			} catch (Exception var6) {
			}

			field759 = null;
			field746 = null;
			field750 = null;
			field755 = 0;
			field760++;
		}
	}

	@ObfuscatedName("LVBGZMMP.a(BI)I")
	public final int method359(int arg0) {
		return field782[arg0].length;
	}

	@ObfuscatedName("LVBGZMMP.a(BZ)V")
	public final void method360(boolean arg0) {
		int var2 = field748.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field761[var3] != 0) {
				method365(3, (byte) 2, field763[var3]);
				method365(3, (byte) 2, field775[var3]);
			}
		}
	}

	@ObfuscatedName("LVBGZMMP.c(I)V")
	public final void method361() {
		field771 = 0;
		field772 = 0;
		for (WNUCRRKP var1 = (WNUCRRKP) field769.method422(); var1 != null; var1 = (WNUCRRKP) field769.method424()) {
			if (var1.field1309) {
				field771++;
			} else {
				field772++;
			}
		}

		while (field771 < 10) {
			WNUCRRKP var2 = (WNUCRRKP) field778.method421();
			if (var2 == null) {
				break;
			}

			if (field779[var2.field1310][var2.field1308] != 0) {
				field780++;
			}

			field779[var2.field1310][var2.field1308] = 0;
			field769.method419(var2);
			field771++;
			method358(var2);
			field749 = true;
		}
	}

	@ObfuscatedName("LVBGZMMP.a([BIIB)Z")
	public final boolean method362(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field747.reset();
			field747.update(arg0, 0, var4);
			int var6 = (int) field747.getValue();

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

	@ObfuscatedName("LVBGZMMP.a()V")
	public final void method363() {
		field752 = false;
	}

	@ObfuscatedName("LVBGZMMP.a(IB)Z")
	public final boolean method364(int arg0) {
		for (int var2 = 0; var2 < field748.length; var2++) {
			if (field763[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	public final void run() {
		try {
			while (field752) {
				field753++;
				byte var1 = 20;
				if (field770 == 0 && field766.field241[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field749 = true;
				for (int var2 = 0; var2 < 100 && field749; var2++) {
					field749 = false;
					method378();
					method361();

					if (field771 == 0 && var2 >= 5) {
						break;
					}

					method370();

					if (field746 != null) {
						method375();
					}
				}

				boolean var3 = false;
				for (WNUCRRKP var4 = (WNUCRRKP) field769.method422(); var4 != null; var4 = (WNUCRRKP) field769.method424()) {
					if (var4.field1309) {
						var3 = true;
						var4.field1312++;
						if (var4.field1312 > 50) {
							var4.field1312 = 0;
							method358(var4);
						}
					}
				}

				if (!var3) {
					for (WNUCRRKP var5 = (WNUCRRKP) field769.method422(); var5 != null; var5 = (WNUCRRKP) field769.method424()) {
						var3 = true;
						var5.field1312++;
						if (var5.field1312 > 50) {
							var5.field1312 = 0;
							method358(var5);
						}
					}
				}

				if (var3) {
					field774++;
					if (field774 > 750) {
						try {
							field759.close();
						} catch (Exception var8) {
						}

						field759 = null;
						field746 = null;
						field750 = null;
						field755 = 0;
					}
				} else {
					field774 = 0;
					field776 = "";
				}

				if (field766.field230 && field759 != null && field750 != null && (field770 > 0 || field766.field241[0] == null)) {
					field768++;
					if (field768 > 500) {
						field768 = 0;
						field773[0] = 0;
						field773[1] = 0;
						field773[2] = 0;
						field773[3] = 10;
						try {
							field750.write(field773, 0, 4);
						} catch (IOException var7) {
							field774 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("LVBGZMMP.a(IBII)V")
	public final void method365(int arg0, byte arg1, int arg2) {
		if (field766.field241[0] != null && field782[arg0][arg2] != 0) {
			byte[] var4 = field766.field241[arg0 + 1].method8(arg2);
			if (!method362(var4, field782[arg0][arg2], field765[arg0][arg2])) {
				field779[arg0][arg2] = arg1;

				if (arg1 > field770) {
					field770 = arg1;
				}

				field757++;
			}
		}
	}

	@ObfuscatedName("LVBGZMMP.a(II)V")
	public final void method366(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field782.length && arg1 >= 0 && arg1 <= field782[arg0].length && field782[arg0][arg1] != 0) {
			synchronized (field777) {
				for (WNUCRRKP var4 = (WNUCRRKP) field777.method3(); var4 != null; var4 = (WNUCRRKP) field777.method4()) {
					if (var4.field1310 == arg0 && var4.field1308 == arg1) {
						return;
					}
				}

				WNUCRRKP var5 = new WNUCRRKP();
				var5.field1310 = arg0;
				var5.field1308 = arg1;
				var5.field1309 = true;

				synchronized (field756) {
					field756.method419(var5);
				}

				field777.method1(var5);
			}
		}
	}

	@ObfuscatedName("LVBGZMMP.b(II)Z")
	public final boolean method367(int arg0) {
		if (field758[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("LVBGZMMP.a(III)V")
	public final void method368(int arg0, int arg1) {
		if (field766.field241[0] != null && (field782[arg1][arg0] != 0 && (field779[arg1][arg0] != 0 && field770 != 0))) {
			WNUCRRKP var3 = new WNUCRRKP();
			var3.field1310 = arg1;
			var3.field1308 = arg0;
			var3.field1309 = false;

			synchronized (field767) {
				field767.method419(var3);
			}
		}
	}

	@ObfuscatedName("LVBGZMMP.a(B)I")
	public final int method369() {
		return field783.length;
	}

	@ObfuscatedName("LVBGZMMP.a(Z)V")
	public final void method370() {
		while (field771 == 0) {
			if (field772 >= 10 || field770 == 0) {
				return;
			}

			WNUCRRKP var2;
			synchronized (field767) {
				var2 = (WNUCRRKP) field767.method421();
			}

			while (var2 != null) {
				if (field779[var2.field1310][var2.field1308] != 0) {
					field779[var2.field1310][var2.field1308] = 0;
					field769.method419(var2);
					method358(var2);
					field749 = true;

					if (field780 < field757) {
						field780++;
					}

					field776 = "Loading extra files - " + field780 * 100 / field757 + "%";
					field772++;
					if (field772 == 10) {
						return;
					}
				}

				synchronized (field767) {
					var2 = (WNUCRRKP) field767.method421();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field779[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field770) {
						var5[var7] = 0;
						WNUCRRKP var8 = new WNUCRRKP();
						var8.field1310 = var4;
						var8.field1308 = var7;
						var8.field1309 = false;
						field769.method419(var8);
						method358(var8);
						field749 = true;

						if (field780 < field757) {
							field780++;
						}

						field776 = "Loading extra files - " + field780 * 100 / field757 + "%";
						field772++;
						if (field772 == 10) {
							return;
						}
					}
				}
			}

			field770--;
		}
	}

	@ObfuscatedName("LVBGZMMP.a(IIII)I")
	public final int method371(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg0;
		for (int var5 = 0; var5 < field748.length; var5++) {
			if (field748[var5] == var4) {
				if (arg1 == 0) {
					return field775[var5];
				}

				return field763[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("LVBGZMMP.b()LWNUCRRKP;")
	public final WNUCRRKP method372() {
		WNUCRRKP var2;
		synchronized (field781) {
			var2 = (WNUCRRKP) field781.method421();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field777) {
			var2.method188();
		}

		if (var2.field1311 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1311));
			while (true) {
				if (field751.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field751, var4, field751.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1311 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1311[var7] = field751[var7];
		}

		return var2;
	}

	@ObfuscatedName("LVBGZMMP.a(LAKPFVPPG;Lclient;)V")
	public final void method373(AKPFVPPG arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method7(var3[var4], null);
			int var6 = var5.length / 2;
			FTMSICIZ var7 = new FTMSICIZ(var5);
			field782[var4] = new int[var6];
			field779[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field782[var4][var8] = var7.method215();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method7(var9[var10], null);
			int var12 = var11.length / 4;
			FTMSICIZ var13 = new FTMSICIZ(var11);
			field765[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field765[var10][var14] = var13.method218();
			}
		}

		byte[] var15 = arg0.method7("model_index", null);
		int var16 = field782[0].length;
		field764 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field764[var17] = var15[var17];
			} else {
				field764[var17] = 0;
			}
		}

		byte[] var18 = arg0.method7("map_index", null);
		FTMSICIZ var19 = new FTMSICIZ(var18);
		int var20 = var18.length / 7;
		field748 = new int[var20];
		field775 = new int[var20];
		field763 = new int[var20];
		field761 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field748[var21] = var19.method215();
			field775[var21] = var19.method215();
			field763[var21] = var19.method215();
			field761[var21] = var19.method213();
		}

		byte[] var22 = arg0.method7("anim_index", null);
		FTMSICIZ var23 = new FTMSICIZ(var22);
		int var24 = var22.length / 2;
		field783 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field783[var25] = var23.method215();
		}

		byte[] var26 = arg0.method7("midi_index", null);
		FTMSICIZ var27 = new FTMSICIZ(var26);
		int var28 = var26.length;
		field758 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field758[var29] = var27.method213();
		}

		field766 = arg1;
		field752 = true;
		field766.method107(this, 2);
	}

	@ObfuscatedName("LVBGZMMP.a(ZI)I")
	public final int method374(int arg0) {
		return field764[arg0] & 0xFF;
	}

	@ObfuscatedName("LVBGZMMP.b(Z)V")
	public final void method375() {
		try {
			int var1 = field746.available();
			if (field755 == 0 && var1 >= 6) {
				field749 = true;

				for (int var2 = 0; var2 < 6; var2 += field746.read(field773, var2, 6 - var2)) {
				}

				int var3 = field773[0] & 0xFF;
				int var4 = ((field773[1] & 0xFF) << 8) + (field773[2] & 0xFF);
				int var5 = ((field773[3] & 0xFF) << 8) + (field773[4] & 0xFF);
				int var6 = field773[5] & 0xFF;
				field784 = null;
				for (WNUCRRKP var7 = (WNUCRRKP) field769.method422(); var7 != null; var7 = (WNUCRRKP) field769.method424()) {
					if (var7.field1310 == var3 && var7.field1308 == var4) {
						field784 = var7;
					}

					if (field784 != null) {
						var7.field1312 = 0;
					}
				}

				if (field784 != null) {
					field774 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field784.field1311 = null;

						if (field784.field1309) {
							synchronized (field781) {
								field781.method419(field784);
							}
						} else {
							field784.method418();
						}

						field784 = null;
					} else {
						if (field784.field1311 == null && var6 == 0) {
							field784.field1311 = new byte[var5];
						}

						if (field784.field1311 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field754 = var6 * 500;
				field755 = 500;
				if (field755 > var5 - var6 * 500) {
					field755 = var5 - var6 * 500;
				}
			}

			if (field755 > 0 && var1 >= field755) {
				field749 = true;
				byte[] var9 = field773;
				int var10 = 0;
				if (field784 != null) {
					var9 = field784.field1311;
					var10 = field754;
				}

				for (int var11 = 0; var11 < field755; var11 += field746.read(var9, var10 + var11, field755 - var11)) {
				}

				if (field755 + field754 >= var9.length && field784 != null) {
					if (field766.field241[0] != null) {
						field766.field241[field784.field1310 + 1].method9(var9, var9.length, field784.field1308);
					}

					if (!field784.field1309 && field784.field1310 == 3) {
						field784.field1309 = true;
						field784.field1310 = 93;
					}

					if (field784.field1309) {
						synchronized (field781) {
							field781.method419(field784);
						}
					} else {
						field784.method418();
					}
				}

				field755 = 0;
			}
		} catch (IOException var17) {
			try {
				field759.close();
			} catch (Exception var14) {
			}

			field759 = null;
			field746 = null;
			field750 = null;
			field755 = 0;
		}
	}

	@ObfuscatedName("LVBGZMMP.a(I)V")
	public final void method376(int arg0) {
		method366(0, arg0);
	}

	@ObfuscatedName("LVBGZMMP.c()I")
	public final int method377() {
		synchronized (field777) {
			return field777.method5();
		}
	}

	@ObfuscatedName("LVBGZMMP.d(I)V")
	public final void method378() {
		WNUCRRKP var2;
		synchronized (field756) {
			var2 = (WNUCRRKP) field756.method421();
		}

		while (var2 != null) {
			field749 = true;
			byte[] var3 = null;
			if (field766.field241[0] != null) {
				var3 = field766.field241[var2.field1310 + 1].method8(var2.field1308);
			}

			if (!method362(var3, field782[var2.field1310][var2.field1308], field765[var2.field1310][var2.field1308])) {
				var3 = null;
			}

			synchronized (field756) {
				if (var3 == null) {
					field778.method419(var2);
				} else {
					var2.field1311 = var3;

					synchronized (field781) {
						field781.method419(var2);
					}
				}

				var2 = (WNUCRRKP) field756.method421();
			}
		}
	}
}
