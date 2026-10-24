package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("CXHZUTUD")
public class CXHZUTUD extends INTSRBNH implements Runnable {

	@ObfuscatedName("CXHZUTUD.a")
	public long field499;

	@ObfuscatedName("CXHZUTUD.b")
	public byte[] field500 = new byte[500];

	@ObfuscatedName("CXHZUTUD.i")
	public ROXEPOUC field507 = new ROXEPOUC();

	@ObfuscatedName("CXHZUTUD.n")
	public boolean field512 = true;

	@ObfuscatedName("CXHZUTUD.q")
	public boolean field514 = false;

	@ObfuscatedName("CXHZUTUD.t")
	public String field517 = "";

	@ObfuscatedName("CXHZUTUD.u")
	public int[][] field518 = new int[4][];

	@ObfuscatedName("CXHZUTUD.C")
	public int[][] field525 = new int[4][];

	@ObfuscatedName("CXHZUTUD.F")
	public ROXEPOUC field526 = new ROXEPOUC();

	@ObfuscatedName("CXHZUTUD.G")
	public byte[][] field527 = new byte[4][];

	@ObfuscatedName("CXHZUTUD.H")
	public KMFVYEKJ field528 = new KMFVYEKJ();

	@ObfuscatedName("CXHZUTUD.I")
	public ROXEPOUC field529 = new ROXEPOUC();

	@ObfuscatedName("CXHZUTUD.J")
	public byte[] field530 = new byte[65000];

	@ObfuscatedName("CXHZUTUD.K")
	public ROXEPOUC field531 = new ROXEPOUC();

	@ObfuscatedName("CXHZUTUD.L")
	public CRC32 field532 = new CRC32();

	@ObfuscatedName("CXHZUTUD.M")
	public ROXEPOUC field533 = new ROXEPOUC();

	@ObfuscatedName("CXHZUTUD.d")
	public int field502;

	@ObfuscatedName("CXHZUTUD.e")
	public int field503;

	@ObfuscatedName("CXHZUTUD.h")
	public int field506;

	@ObfuscatedName("CXHZUTUD.o")
	public int field513;

	@ObfuscatedName("CXHZUTUD.v")
	public int field519;

	@ObfuscatedName("CXHZUTUD.w")
	public int field520;

	@ObfuscatedName("CXHZUTUD.x")
	public int field521;

	@ObfuscatedName("CXHZUTUD.z")
	public int field522;

	@ObfuscatedName("CXHZUTUD.A")
	public int field523;

	@ObfuscatedName("CXHZUTUD.B")
	public int field524;

	@ObfuscatedName("CXHZUTUD.O")
	public int field535;

	@ObfuscatedName("CXHZUTUD.l")
	public CNNODYJR field510;

	@ObfuscatedName("CXHZUTUD.r")
	public client field515;

	@ObfuscatedName("CXHZUTUD.P")
	public InputStream field536;

	@ObfuscatedName("CXHZUTUD.s")
	public OutputStream field516;

	@ObfuscatedName("CXHZUTUD.f")
	public Socket field504;

	@ObfuscatedName("CXHZUTUD.R")
	public byte[] field537;

	@ObfuscatedName("CXHZUTUD.c")
	public int[] field501;

	@ObfuscatedName("CXHZUTUD.g")
	public int[] field505;

	@ObfuscatedName("CXHZUTUD.j")
	public int[] field508;

	@ObfuscatedName("CXHZUTUD.k")
	public int[] field509;

	@ObfuscatedName("CXHZUTUD.m")
	public int[] field511;

	@ObfuscatedName("CXHZUTUD.N")
	public int[] field534;

	@ObfuscatedName("CXHZUTUD.a(ZI)I")
	public final int method165(int arg0) {
		return field537[arg0] & 0xFF;
	}

	@ObfuscatedName("CXHZUTUD.a()V")
	public final void method166() {
		field512 = false;
	}

	@ObfuscatedName("CXHZUTUD.a(IIB[B)Z")
	public final boolean method167(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field532.reset();
			field532.update(arg2, 0, var4);
			int var6 = (int) field532.getValue();

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

	@ObfuscatedName("CXHZUTUD.a(IZ)V")
	public final void method168(boolean arg0) {
		int var2 = field534.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field501[var3] != 0) {
				method174(field508[var3], 3, (byte) 2);
				method174(field505[var3], 3, (byte) 2);
			}
		}
	}

	@ObfuscatedName("CXHZUTUD.a(IIII)I")
	public final int method169(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < field534.length; var5++) {
			if (field534[var5] == var4) {
				if (arg2 == 0) {
					return field505[var5];
				}

				return field508[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("CXHZUTUD.a(LDYBMLHQM;Lclient;)V")
	public final void method170(DYBMLHQM arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method248(var3[var4], null);
			int var6 = var5.length / 2;
			INLHDAGO var7 = new INLHDAGO(var5);
			field525[var4] = new int[var6];
			field527[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field525[var4][var8] = var7.method310();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method248(var9[var10], null);
			int var12 = var11.length / 4;
			INLHDAGO var13 = new INLHDAGO(var11);
			field518[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field518[var10][var14] = var13.method313();
			}
		}

		byte[] var15 = arg0.method248("model_index", null);
		int var16 = field525[0].length;
		field537 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field537[var17] = var15[var17];
			} else {
				field537[var17] = 0;
			}
		}

		byte[] var18 = arg0.method248("map_index", null);
		INLHDAGO var19 = new INLHDAGO(var18);
		int var20 = var18.length / 7;
		field534 = new int[var20];
		field505 = new int[var20];
		field508 = new int[var20];
		field501 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field534[var21] = var19.method310();
			field505[var21] = var19.method310();
			field508[var21] = var19.method310();
			field501[var21] = var19.method308();
		}

		byte[] var22 = arg0.method248("anim_index", null);
		INLHDAGO var23 = new INLHDAGO(var22);
		int var24 = var22.length / 2;
		field509 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field509[var25] = var23.method310();
		}

		byte[] var26 = arg0.method248("midi_index", null);
		INLHDAGO var27 = new INLHDAGO(var26);
		int var28 = var26.length;
		field511 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field511[var29] = var27.method308();
		}

		field515 = arg1;
		field512 = true;
		field515.method113(this, 2);
	}

	@ObfuscatedName("CXHZUTUD.a(II)V")
	public final void method171(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field525.length && arg1 >= 0 && arg1 <= field525[arg0].length && field525[arg0][arg1] != 0) {
			synchronized (field528) {
				for (CNNODYJR var4 = (CNNODYJR) field528.method373(); var4 != null; var4 = (CNNODYJR) field528.method374()) {
					if (var4.field469 == arg0 && var4.field470 == arg1) {
						return;
					}
				}

				CNNODYJR var5 = new CNNODYJR();
				var5.field469 = arg0;
				var5.field470 = arg1;
				var5.field468 = true;

				synchronized (field533) {
					field533.method424(var5);
				}

				field528.method371(var5);
			}
		}
	}

	@ObfuscatedName("CXHZUTUD.a(IBI)V")
	public final void method172(int arg0, int arg1) {
		if (field515.field52[0] != null && (field525[arg1][arg0] != 0 && (field527[arg1][arg0] != 0 && field502 != 0))) {
			CNNODYJR var3 = new CNNODYJR();
			var3.field469 = arg1;
			var3.field470 = arg0;
			var3.field468 = false;

			synchronized (field529) {
				field529.method424(var3);
			}
		}
	}

	@ObfuscatedName("CXHZUTUD.b(I)V")
	public final void method173() {
		field522 = 0;
		field523 = 0;
		for (CNNODYJR var1 = (CNNODYJR) field531.method427(); var1 != null; var1 = (CNNODYJR) field531.method429()) {
			if (var1.field468) {
				field522++;
			} else {
				field523++;
			}
		}

		while (field522 < 10) {
			CNNODYJR var2 = (CNNODYJR) field507.method426();
			if (var2 == null) {
				break;
			}

			if (field527[var2.field469][var2.field470] != 0) {
				field513++;
			}

			field527[var2.field469][var2.field470] = 0;
			field531.method424(var2);
			field522++;
			method183(var2);
			field514 = true;
		}
	}

	@ObfuscatedName("CXHZUTUD.a(IIBI)V")
	public final void method174(int arg0, int arg1, byte arg2) {
		if (field515.field52[0] != null && field525[arg1][arg0] != 0) {
			byte[] var4 = field515.field52[arg1 + 1].method351(arg0);
			if (!method167(field525[arg1][arg0], field518[arg1][arg0], var4)) {
				field527[arg1][arg0] = arg2;

				if (arg2 > field502) {
					field502 = arg2;
				}

				field524++;
			}
		}
	}

	@ObfuscatedName("CXHZUTUD.a(I)V")
	public final void method175(int arg0) {
		method171(0, arg0);
	}

	@ObfuscatedName("CXHZUTUD.a(IB)Z")
	public final boolean method176(int arg0) {
		for (int var2 = 0; var2 < field534.length; var2++) {
			if (field508[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("CXHZUTUD.a(Z)I")
	public final int method177() {
		return field509.length;
	}

	@ObfuscatedName("CXHZUTUD.a(B)V")
	public final void method178() {
		try {
			int var1 = field536.available();
			if (field521 == 0 && var1 >= 6) {
				field514 = true;

				for (int var2 = 0; var2 < 6; var2 += field536.read(field500, var2, 6 - var2)) {
				}

				int var3 = field500[0] & 0xFF;
				int var4 = ((field500[1] & 0xFF) << 8) + (field500[2] & 0xFF);
				int var5 = ((field500[3] & 0xFF) << 8) + (field500[4] & 0xFF);
				int var6 = field500[5] & 0xFF;
				field510 = null;
				for (CNNODYJR var7 = (CNNODYJR) field531.method427(); var7 != null; var7 = (CNNODYJR) field531.method429()) {
					if (var7.field469 == var3 && var7.field470 == var4) {
						field510 = var7;
					}

					if (field510 != null) {
						var7.field471 = 0;
					}
				}

				if (field510 != null) {
					field506 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field510.field472 = null;

						if (field510.field468) {
							synchronized (field526) {
								field526.method424(field510);
							}
						} else {
							field510.method234();
						}

						field510 = null;
					} else {
						if (field510.field472 == null && var6 == 0) {
							field510.field472 = new byte[var5];
						}

						if (field510.field472 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field520 = var6 * 500;
				field521 = 500;
				if (field521 > var5 - var6 * 500) {
					field521 = var5 - var6 * 500;
				}
			}

			if (field521 > 0 && var1 >= field521) {
				field514 = true;
				byte[] var9 = field500;
				int var10 = 0;
				if (field510 != null) {
					var9 = field510.field472;
					var10 = field520;
				}

				for (int var11 = 0; var11 < field521; var11 += field536.read(var9, var10 + var11, field521 - var11)) {
				}

				if (field521 + field520 >= var9.length && field510 != null) {
					if (field515.field52[0] != null) {
						field515.field52[field510.field469 + 1].method352(field510.field470, var9.length, var9);
					}

					if (!field510.field468 && field510.field469 == 3) {
						field510.field468 = true;
						field510.field469 = 93;
					}

					if (field510.field468) {
						synchronized (field526) {
							field526.method424(field510);
						}
					} else {
						field510.method234();
					}
				}

				field521 = 0;
			}
		} catch (IOException var17) {
			try {
				field504.close();
			} catch (Exception var14) {
			}

			field504 = null;
			field536 = null;
			field516 = null;
			field521 = 0;
		}
	}

	@ObfuscatedName("CXHZUTUD.b()I")
	public final int method179() {
		synchronized (field528) {
			return field528.method375();
		}
	}

	public final void run() {
		try {
			while (field512) {
				field535++;
				byte var1 = 20;
				if (field502 == 0 && field515.field52[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field514 = true;
				for (int var2 = 0; var2 < 100 && field514; var2++) {
					field514 = false;
					method181();
					method173();

					if (field522 == 0 && var2 >= 5) {
						break;
					}

					method180();

					if (field536 != null) {
						method178();
					}
				}

				boolean var3 = false;
				for (CNNODYJR var4 = (CNNODYJR) field531.method427(); var4 != null; var4 = (CNNODYJR) field531.method429()) {
					if (var4.field468) {
						var3 = true;
						var4.field471++;
						if (var4.field471 > 50) {
							var4.field471 = 0;
							method183(var4);
						}
					}
				}

				if (!var3) {
					for (CNNODYJR var5 = (CNNODYJR) field531.method427(); var5 != null; var5 = (CNNODYJR) field531.method429()) {
						var3 = true;
						var5.field471++;
						if (var5.field471 > 50) {
							var5.field471 = 0;
							method183(var5);
						}
					}
				}

				if (var3) {
					field506++;
					if (field506 > 750) {
						try {
							field504.close();
						} catch (Exception var8) {
						}

						field504 = null;
						field536 = null;
						field516 = null;
						field521 = 0;
					}
				} else {
					field506 = 0;
					field517 = "";
				}

				if (field515.field168 && field504 != null && field516 != null && (field502 > 0 || field515.field52[0] == null)) {
					field519++;
					if (field519 > 500) {
						field519 = 0;
						field500[0] = 0;
						field500[1] = 0;
						field500[2] = 0;
						field500[3] = 10;
						try {
							field516.write(field500, 0, 4);
						} catch (IOException var7) {
							field506 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("CXHZUTUD.c(I)V")
	public final void method180() {
		while (field522 == 0) {
			if (field523 >= 10 || field502 == 0) {
				return;
			}

			CNNODYJR var2;
			synchronized (field529) {
				var2 = (CNNODYJR) field529.method426();
			}

			while (var2 != null) {
				if (field527[var2.field469][var2.field470] != 0) {
					field527[var2.field469][var2.field470] = 0;
					field531.method424(var2);
					method183(var2);
					field514 = true;

					if (field513 < field524) {
						field513++;
					}

					field517 = "Loading extra files - " + field513 * 100 / field524 + "%";
					field523++;
					if (field523 == 10) {
						return;
					}
				}

				synchronized (field529) {
					var2 = (CNNODYJR) field529.method426();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field527[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field502) {
						var5[var7] = 0;
						CNNODYJR var8 = new CNNODYJR();
						var8.field469 = var4;
						var8.field470 = var7;
						var8.field468 = false;
						field531.method424(var8);
						method183(var8);
						field514 = true;

						if (field513 < field524) {
							field513++;
						}

						field517 = "Loading extra files - " + field513 * 100 / field524 + "%";
						field523++;
						if (field523 == 10) {
							return;
						}
					}
				}
			}

			field502--;
		}
	}

	@ObfuscatedName("CXHZUTUD.b(B)V")
	public final void method181() {
		CNNODYJR var2;
		synchronized (field533) {
			var2 = (CNNODYJR) field533.method426();
		}

		while (var2 != null) {
			field514 = true;
			byte[] var3 = null;
			if (field515.field52[0] != null) {
				var3 = field515.field52[var2.field469 + 1].method351(var2.field470);
			}

			if (!method167(field525[var2.field469][var2.field470], field518[var2.field469][var2.field470], var3)) {
				var3 = null;
			}

			synchronized (field533) {
				if (var3 == null) {
					field507.method424(var2);
				} else {
					var2.field472 = var3;

					synchronized (field526) {
						field526.method424(var2);
					}
				}

				var2 = (CNNODYJR) field533.method426();
			}
		}
	}

	@ObfuscatedName("CXHZUTUD.c()LCNNODYJR;")
	public final CNNODYJR method182() {
		CNNODYJR var2;
		synchronized (field526) {
			var2 = (CNNODYJR) field526.method426();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field528) {
			var2.method379();
		}

		if (var2.field472 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field472));
			while (true) {
				if (field530.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field530, var4, field530.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field472 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field472[var7] = field530[var7];
		}

		return var2;
	}

	@ObfuscatedName("CXHZUTUD.a(LCNNODYJR;I)V")
	public final void method183(CNNODYJR arg0) {
		try {
			if (field504 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field499 < 4000L) {
					return;
				}

				field499 = var2;
				field504 = field515.method112(client.field156 + 43594);
				field536 = field504.getInputStream();
				field516 = field504.getOutputStream();
				field516.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field536.read();
				}

				field506 = 0;
			}

			field500[0] = (byte) arg0.field469;
			field500[1] = (byte) (arg0.field470 >> 8);
			field500[2] = (byte) arg0.field470;
			if (arg0.field468) {
				field500[3] = 2;
			} else if (field515.field168) {
				field500[3] = 0;
			} else {
				field500[3] = 1;
			}

			field516.write(field500, 0, 4);
			field519 = 0;
			field503 = -10000;
		} catch (IOException var7) {
			try {
				field504.close();
			} catch (Exception var6) {
			}

			field504 = null;
			field536 = null;
			field516 = null;
			field521 = 0;
			field503++;
		}
	}

	@ObfuscatedName("CXHZUTUD.b(II)Z")
	public final boolean method184(int arg0) {
		if (field511[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("CXHZUTUD.d(I)V")
	public final void method185() {
		synchronized (field529) {
			field529.method431();
		}
	}

	@ObfuscatedName("CXHZUTUD.a(BI)I")
	public final int method186(int arg0) {
		return field525[arg0].length;
	}
}
