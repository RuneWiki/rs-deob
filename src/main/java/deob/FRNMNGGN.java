package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("FRNMNGGN")
public class FRNMNGGN extends GNZAMWHT implements Runnable {

	@ObfuscatedName("FRNMNGGN.b")
	public byte[] field600 = new byte[500];

	@ObfuscatedName("FRNMNGGN.e")
	public SWVPDERM field603 = new SWVPDERM();

	@ObfuscatedName("FRNMNGGN.j")
	public boolean field605 = false;

	@ObfuscatedName("FRNMNGGN.k")
	public byte[] field606 = new byte[65000];

	@ObfuscatedName("FRNMNGGN.n")
	public int[][] field609 = new int[4][];

	@ObfuscatedName("FRNMNGGN.p")
	public CRC32 field611 = new CRC32();

	@ObfuscatedName("FRNMNGGN.q")
	public String field612 = "";

	@ObfuscatedName("FRNMNGGN.s")
	public SWVPDERM field614 = new SWVPDERM();

	@ObfuscatedName("FRNMNGGN.A")
	public boolean field621 = true;

	@ObfuscatedName("FRNMNGGN.B")
	public JCEXAOBP field622 = new JCEXAOBP();

	@ObfuscatedName("FRNMNGGN.E")
	public SWVPDERM field625 = new SWVPDERM();

	@ObfuscatedName("FRNMNGGN.F")
	public int[][] field626 = new int[4][];

	@ObfuscatedName("FRNMNGGN.N")
	public SWVPDERM field633 = new SWVPDERM();

	@ObfuscatedName("FRNMNGGN.O")
	public byte[][] field634 = new byte[4][];

	@ObfuscatedName("FRNMNGGN.R")
	public SWVPDERM field637 = new SWVPDERM();

	@ObfuscatedName("FRNMNGGN.g")
	public int field604;

	@ObfuscatedName("FRNMNGGN.m")
	public int field608;

	@ObfuscatedName("FRNMNGGN.u")
	public int field615;

	@ObfuscatedName("FRNMNGGN.v")
	public int field616;

	@ObfuscatedName("FRNMNGGN.C")
	public int field623;

	@ObfuscatedName("FRNMNGGN.G")
	public int field627;

	@ObfuscatedName("FRNMNGGN.H")
	public int field628;

	@ObfuscatedName("FRNMNGGN.K")
	public int field630;

	@ObfuscatedName("FRNMNGGN.L")
	public int field631;

	@ObfuscatedName("FRNMNGGN.P")
	public int field635;

	@ObfuscatedName("FRNMNGGN.Q")
	public int field636;

	@ObfuscatedName("FRNMNGGN.w")
	public long field617;

	@ObfuscatedName("FRNMNGGN.z")
	public EGGOGKSD field620;

	@ObfuscatedName("FRNMNGGN.S")
	public client field638;

	@ObfuscatedName("FRNMNGGN.r")
	public InputStream field613;

	@ObfuscatedName("FRNMNGGN.y")
	public OutputStream field619;

	@ObfuscatedName("FRNMNGGN.x")
	public Socket field618;

	@ObfuscatedName("FRNMNGGN.c")
	public byte[] field601;

	@ObfuscatedName("FRNMNGGN.d")
	public int[] field602;

	@ObfuscatedName("FRNMNGGN.l")
	public int[] field607;

	@ObfuscatedName("FRNMNGGN.o")
	public int[] field610;

	@ObfuscatedName("FRNMNGGN.D")
	public int[] field624;

	@ObfuscatedName("FRNMNGGN.J")
	public int[] field629;

	@ObfuscatedName("FRNMNGGN.M")
	public int[] field632;

	@ObfuscatedName("FRNMNGGN.a(II)I")
	public final int method216(int arg0) {
		return field609[arg0].length;
	}

	@ObfuscatedName("FRNMNGGN.a(IBII)V")
	public final void method217(int arg0, byte arg1, int arg2) {
		if (field638.field287[0] != null && field609[arg0][arg2] != 0) {
			byte[] var4 = field638.field287[arg0 + 1].method184(arg2);
			if (!method224(field626[arg0][arg2], var4, field609[arg0][arg2])) {
				field634[arg0][arg2] = arg1;

				if (arg1 > field604) {
					field604 = arg1;
				}

				field627++;
			}
		}
	}

	@ObfuscatedName("FRNMNGGN.a(ZI)Z")
	public final boolean method218(int arg0) {
		if (field632[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("FRNMNGGN.a()I")
	public final int method219() {
		synchronized (field622) {
			return field622.method253();
		}
	}

	@ObfuscatedName("FRNMNGGN.b(II)I")
	public final int method220(int arg0) {
		return field601[arg0] & 0xFF;
	}

	@ObfuscatedName("FRNMNGGN.a(Z)V")
	public final void method221() {
		try {
			int var1 = field613.available();
			if (field616 == 0 && var1 >= 6) {
				field605 = true;

				for (int var2 = 0; var2 < 6; var2 += field613.read(field600, var2, 6 - var2)) {
				}

				int var3 = field600[0] & 0xFF;
				int var4 = ((field600[1] & 0xFF) << 8) + (field600[2] & 0xFF);
				int var5 = ((field600[3] & 0xFF) << 8) + (field600[4] & 0xFF);
				int var6 = field600[5] & 0xFF;
				field620 = null;
				for (EGGOGKSD var7 = (EGGOGKSD) field614.method482(); var7 != null; var7 = (EGGOGKSD) field614.method484()) {
					if (var7.field533 == var3 && var7.field537 == var4) {
						field620 = var7;
					}

					if (field620 != null) {
						var7.field534 = 0;
					}
				}

				if (field620 != null) {
					field631 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field620.field535 = null;

						if (field620.field536) {
							synchronized (field637) {
								field637.method479(field620);
							}
						} else {
							field620.method397();
						}

						field620 = null;
					} else {
						if (field620.field535 == null && var6 == 0) {
							field620.field535 = new byte[var5];
						}

						if (field620.field535 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field615 = var6 * 500;
				field616 = 500;
				if (field616 > var5 - var6 * 500) {
					field616 = var5 - var6 * 500;
				}
			}

			if (field616 > 0 && var1 >= field616) {
				field605 = true;
				byte[] var9 = field600;
				int var10 = 0;
				if (field620 != null) {
					var9 = field620.field535;
					var10 = field615;
				}

				for (int var11 = 0; var11 < field616; var11 += field613.read(var9, var10 + var11, field616 - var11)) {
				}

				if (field616 + field615 >= var9.length && field620 != null) {
					if (field638.field287[0] != null) {
						field638.field287[field620.field533 + 1].method185(field620.field537, var9, var9.length);
					}

					if (!field620.field536 && field620.field533 == 3) {
						field620.field536 = true;
						field620.field533 = 93;
					}

					if (field620.field536) {
						synchronized (field637) {
							field637.method479(field620);
						}
					} else {
						field620.method397();
					}
				}

				field616 = 0;
			}
		} catch (IOException var17) {
			try {
				field618.close();
			} catch (Exception var14) {
			}

			field618 = null;
			field613 = null;
			field619 = null;
			field616 = 0;
		}
	}

	@ObfuscatedName("FRNMNGGN.a(III)V")
	public final void method222(int arg0, int arg1) {
		if (field638.field287[0] != null && (field609[arg1][arg0] != 0 && (field634[arg1][arg0] != 0 && field604 != 0))) {
			EGGOGKSD var3 = new EGGOGKSD();
			var3.field533 = arg1;
			var3.field537 = arg0;
			var3.field536 = false;

			synchronized (field625) {
				field625.method479(var3);
			}
		}
	}

	@ObfuscatedName("FRNMNGGN.a(B)V")
	public final void method223() {
		while (field635 == 0) {
			if (field636 >= 10 || field604 == 0) {
				return;
			}

			EGGOGKSD var2;
			synchronized (field625) {
				var2 = (EGGOGKSD) field625.method481();
			}

			while (var2 != null) {
				if (field634[var2.field533][var2.field537] != 0) {
					field634[var2.field533][var2.field537] = 0;
					field614.method479(var2);
					method230(var2);
					field605 = true;

					if (field608 < field627) {
						field608++;
					}

					field612 = "Loading extra files - " + field608 * 100 / field627 + "%";
					field636++;
					if (field636 == 10) {
						return;
					}
				}

				synchronized (field625) {
					var2 = (EGGOGKSD) field625.method481();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field634[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field604) {
						var5[var7] = 0;
						EGGOGKSD var8 = new EGGOGKSD();
						var8.field533 = var4;
						var8.field537 = var7;
						var8.field536 = false;
						field614.method479(var8);
						method230(var8);
						field605 = true;

						if (field608 < field627) {
							field608++;
						}

						field612 = "Loading extra files - " + field608 * 100 / field627 + "%";
						field636++;
						if (field636 == 10) {
							return;
						}
					}
				}
			}

			field604--;
		}
	}

	@ObfuscatedName("FRNMNGGN.a(BI[BI)Z")
	public final boolean method224(int arg0, byte[] arg1, int arg2) {
		if (arg1 != null && arg1.length >= 2) {
			int var4 = arg1.length - 2;
			int var5 = ((arg1[var4] & 0xFF) << 8) + (arg1[var4 + 1] & 0xFF);
			field611.reset();
			field611.update(arg1, 0, var4);
			int var6 = (int) field611.getValue();

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

	@ObfuscatedName("FRNMNGGN.a(LFIGUVTWB;Lclient;)V")
	public final void method225(FIGUVTWB arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method209(var3[var4], null);
			int var6 = var5.length / 2;
			MUKVLYLC var7 = new MUKVLYLC(var5);
			field609[var4] = new int[var6];
			field634[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field609[var4][var8] = var7.method294();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method209(var9[var10], null);
			int var12 = var11.length / 4;
			MUKVLYLC var13 = new MUKVLYLC(var11);
			field626[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field626[var10][var14] = var13.method297();
			}
		}

		byte[] var15 = arg0.method209("model_index", null);
		int var16 = field609[0].length;
		field601 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field601[var17] = var15[var17];
			} else {
				field601[var17] = 0;
			}
		}

		byte[] var18 = arg0.method209("map_index", null);
		MUKVLYLC var19 = new MUKVLYLC(var18);
		int var20 = var18.length / 7;
		field624 = new int[var20];
		field610 = new int[var20];
		field629 = new int[var20];
		field607 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field624[var21] = var19.method294();
			field610[var21] = var19.method294();
			field629[var21] = var19.method294();
			field607[var21] = var19.method292();
		}

		byte[] var22 = arg0.method209("anim_index", null);
		MUKVLYLC var23 = new MUKVLYLC(var22);
		int var24 = var22.length / 2;
		field602 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field602[var25] = var23.method294();
		}

		byte[] var26 = arg0.method209("midi_index", null);
		MUKVLYLC var27 = new MUKVLYLC(var26);
		int var28 = var26.length;
		field632 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field632[var29] = var27.method292();
		}

		field638 = arg1;
		field621 = true;
		field638.method101(this, 2);
	}

	@ObfuscatedName("FRNMNGGN.b(Z)I")
	public final int method226() {
		return field602.length;
	}

	@ObfuscatedName("FRNMNGGN.b()V")
	public final void method227() {
		field621 = false;
	}

	@ObfuscatedName("FRNMNGGN.c(II)Z")
	public final boolean method228(int arg0) {
		for (int var2 = 0; var2 < field624.length; var2++) {
			if (field629[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("FRNMNGGN.d(II)V")
	public final void method229(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field609.length && arg1 >= 0 && arg1 <= field609[arg0].length && field609[arg0][arg1] != 0) {
			synchronized (field622) {
				for (EGGOGKSD var4 = (EGGOGKSD) field622.method251(); var4 != null; var4 = (EGGOGKSD) field622.method252()) {
					if (var4.field533 == arg0 && var4.field537 == arg1) {
						return;
					}
				}

				EGGOGKSD var5 = new EGGOGKSD();
				var5.field533 = arg0;
				var5.field537 = arg1;
				var5.field536 = true;

				synchronized (field603) {
					field603.method479(var5);
				}

				field622.method249(var5);
			}
		}
	}

	@ObfuscatedName("FRNMNGGN.a(BLEGGOGKSD;)V")
	public final void method230(EGGOGKSD arg0) {
		try {
			if (field618 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field617 < 4000L) {
					return;
				}

				field617 = var2;
				field618 = field638.method167(client.field342 + 43594);
				field613 = field618.getInputStream();
				field619 = field618.getOutputStream();
				field619.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field613.read();
				}

				field631 = 0;
			}

			field600[0] = (byte) arg0.field533;
			field600[1] = (byte) (arg0.field537 >> 8);
			field600[2] = (byte) arg0.field537;
			if (arg0.field536) {
				field600[3] = 2;
			} else if (field638.field115) {
				field600[3] = 0;
			} else {
				field600[3] = 1;
			}

			field619.write(field600, 0, 4);
			field623 = 0;
			field628 = -10000;
		} catch (IOException var7) {
			try {
				field618.close();
			} catch (Exception var6) {
			}

			field618 = null;
			field613 = null;
			field619 = null;
			field616 = 0;
			field628++;
		}
	}

	@ObfuscatedName("FRNMNGGN.b(B)V")
	public final void method231() {
		synchronized (field625) {
			field625.method486();
		}
	}

	@ObfuscatedName("FRNMNGGN.c()LEGGOGKSD;")
	public final EGGOGKSD method232() {
		EGGOGKSD var2;
		synchronized (field637) {
			var2 = (EGGOGKSD) field637.method481();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field622) {
			var2.method400();
		}

		if (var2.field535 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field535));
			while (true) {
				if (field606.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field606, var4, field606.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field535 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field535[var7] = field606[var7];
		}

		return var2;
	}

	@ObfuscatedName("FRNMNGGN.b(I)V")
	public final void method233() {
		EGGOGKSD var2;
		synchronized (field603) {
			var2 = (EGGOGKSD) field603.method481();
		}

		while (var2 != null) {
			field605 = true;
			byte[] var3 = null;
			if (field638.field287[0] != null) {
				var3 = field638.field287[var2.field533 + 1].method184(var2.field537);
			}

			if (!method224(field626[var2.field533][var2.field537], var3, field609[var2.field533][var2.field537])) {
				var3 = null;
			}

			synchronized (field603) {
				if (var3 == null) {
					field633.method479(var2);
				} else {
					var2.field535 = var3;

					synchronized (field637) {
						field637.method479(var2);
					}
				}

				var2 = (EGGOGKSD) field603.method481();
			}
		}
	}

	@ObfuscatedName("FRNMNGGN.a(ZZ)V")
	public final void method234(boolean arg0) {
		int var2 = field624.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field607[var3] != 0) {
				method217(3, (byte) 2, field629[var3]);
				method217(3, (byte) 2, field610[var3]);
			}
		}
	}

	@ObfuscatedName("FRNMNGGN.a(I)V")
	public final void method235(int arg0) {
		method229(0, arg0);
	}

	@ObfuscatedName("FRNMNGGN.a(IIZI)I")
	public final int method236(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg2;
		for (int var5 = 0; var5 < field624.length; var5++) {
			if (field624[var5] == var4) {
				if (arg0 == 0) {
					return field610[var5];
				}

				return field629[var5];
			}
		}

		return -1;
	}

	public final void run() {
		try {
			while (field621) {
				field630++;
				byte var1 = 20;
				if (field604 == 0 && field638.field287[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field605 = true;
				for (int var2 = 0; var2 < 100 && field605; var2++) {
					field605 = false;
					method233();
					method237();

					if (field635 == 0 && var2 >= 5) {
						break;
					}

					method223();

					if (field613 != null) {
						method221();
					}
				}

				boolean var3 = false;
				for (EGGOGKSD var4 = (EGGOGKSD) field614.method482(); var4 != null; var4 = (EGGOGKSD) field614.method484()) {
					if (var4.field536) {
						var3 = true;
						var4.field534++;
						if (var4.field534 > 50) {
							var4.field534 = 0;
							method230(var4);
						}
					}
				}

				if (!var3) {
					for (EGGOGKSD var5 = (EGGOGKSD) field614.method482(); var5 != null; var5 = (EGGOGKSD) field614.method484()) {
						var3 = true;
						var5.field534++;
						if (var5.field534 > 50) {
							var5.field534 = 0;
							method230(var5);
						}
					}
				}

				if (var3) {
					field631++;
					if (field631 > 750) {
						try {
							field618.close();
						} catch (Exception var8) {
						}

						field618 = null;
						field613 = null;
						field619 = null;
						field616 = 0;
					}
				} else {
					field631 = 0;
					field612 = "";
				}

				if (field638.field115 && field618 != null && field619 != null && (field604 > 0 || field638.field287[0] == null)) {
					field623++;
					if (field623 > 500) {
						field623 = 0;
						field600[0] = 0;
						field600[1] = 0;
						field600[2] = 0;
						field600[3] = 10;
						try {
							field619.write(field600, 0, 4);
						} catch (IOException var7) {
							field631 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("FRNMNGGN.c(I)V")
	public final void method237() {
		field635 = 0;
		field636 = 0;
		for (EGGOGKSD var1 = (EGGOGKSD) field614.method482(); var1 != null; var1 = (EGGOGKSD) field614.method484()) {
			if (var1.field536) {
				field635++;
			} else {
				field636++;
			}
		}

		while (field635 < 10) {
			EGGOGKSD var2 = (EGGOGKSD) field633.method481();
			if (var2 == null) {
				break;
			}

			if (field634[var2.field533][var2.field537] != 0) {
				field608++;
			}

			field634[var2.field533][var2.field537] = 0;
			field614.method479(var2);
			field635++;
			method230(var2);
			field605 = true;
		}
	}
}
