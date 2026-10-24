package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("ELICEBAH")
public class ELICEBAH extends HRLSVDLX implements Runnable {

	@ObfuscatedName("ELICEBAH.j")
	public boolean field584 = true;

	@ObfuscatedName("ELICEBAH.k")
	public byte[][] field585 = new byte[4][];

	@ObfuscatedName("ELICEBAH.m")
	public URASIGRB field587 = new URASIGRB();

	@ObfuscatedName("ELICEBAH.n")
	public URASIGRB field588 = new URASIGRB();

	@ObfuscatedName("ELICEBAH.o")
	public boolean field589 = false;

	@ObfuscatedName("ELICEBAH.p")
	public String field590 = "";

	@ObfuscatedName("ELICEBAH.s")
	public ODYOEFFK field592 = new ODYOEFFK();

	@ObfuscatedName("ELICEBAH.u")
	public URASIGRB field594 = new URASIGRB();

	@ObfuscatedName("ELICEBAH.x")
	public CRC32 field597 = new CRC32();

	@ObfuscatedName("ELICEBAH.y")
	public int[][] field598 = new int[4][];

	@ObfuscatedName("ELICEBAH.z")
	public URASIGRB field599 = new URASIGRB();

	@ObfuscatedName("ELICEBAH.I")
	public URASIGRB field608 = new URASIGRB();

	@ObfuscatedName("ELICEBAH.L")
	public byte[] field611 = new byte[500];

	@ObfuscatedName("ELICEBAH.N")
	public int[][] field613 = new int[4][];

	@ObfuscatedName("ELICEBAH.Q")
	public byte[] field616 = new byte[65000];

	@ObfuscatedName("ELICEBAH.b")
	public int field579;

	@ObfuscatedName("ELICEBAH.e")
	public int field582;

	@ObfuscatedName("ELICEBAH.t")
	public int field593;

	@ObfuscatedName("ELICEBAH.v")
	public int field595;

	@ObfuscatedName("ELICEBAH.w")
	public int field596;

	@ObfuscatedName("ELICEBAH.B")
	public int field601;

	@ObfuscatedName("ELICEBAH.E")
	public int field604;

	@ObfuscatedName("ELICEBAH.F")
	public int field605;

	@ObfuscatedName("ELICEBAH.K")
	public int field610;

	@ObfuscatedName("ELICEBAH.O")
	public int field614;

	@ObfuscatedName("ELICEBAH.P")
	public int field615;

	@ObfuscatedName("ELICEBAH.D")
	public long field603;

	@ObfuscatedName("ELICEBAH.A")
	public VVUONHHF field600;

	@ObfuscatedName("ELICEBAH.R")
	public client field617;

	@ObfuscatedName("ELICEBAH.H")
	public InputStream field607;

	@ObfuscatedName("ELICEBAH.C")
	public OutputStream field602;

	@ObfuscatedName("ELICEBAH.g")
	public Socket field583;

	@ObfuscatedName("ELICEBAH.M")
	public byte[] field612;

	@ObfuscatedName("ELICEBAH.c")
	public int[] field580;

	@ObfuscatedName("ELICEBAH.d")
	public int[] field581;

	@ObfuscatedName("ELICEBAH.l")
	public int[] field586;

	@ObfuscatedName("ELICEBAH.r")
	public int[] field591;

	@ObfuscatedName("ELICEBAH.G")
	public int[] field606;

	@ObfuscatedName("ELICEBAH.J")
	public int[] field609;

	@ObfuscatedName("ELICEBAH.a(II)V")
	public final void method184(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field598.length && arg1 >= 0 && arg1 <= field598[arg0].length && field598[arg0][arg1] != 0) {
			synchronized (field592) {
				for (VVUONHHF var4 = (VVUONHHF) field592.method395(); var4 != null; var4 = (VVUONHHF) field592.method396()) {
					if (var4.field1340 == arg0 && var4.field1341 == arg1) {
						return;
					}
				}

				VVUONHHF var5 = new VVUONHHF();
				var5.field1340 = arg0;
				var5.field1341 = arg1;
				var5.field1344 = true;

				synchronized (field588) {
					field588.method500(var5);
				}

				field592.method393(var5);
			}
		}
	}

	@ObfuscatedName("ELICEBAH.a(B)V")
	public final void method185() {
		synchronized (field587) {
			field587.method507();
		}
	}

	@ObfuscatedName("ELICEBAH.a(ZI)Z")
	public final boolean method186(int arg0) {
		if (field609[arg0] == 1) {
			return true;
		}

		return false;
	}

	public final void run() {
		try {
			while (field584) {
				field579++;
				byte var1 = 20;
				if (field610 == 0 && field617.field385[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field589 = true;
				for (int var2 = 0; var2 < 100 && field589; var2++) {
					field589 = false;
					method190();
					method205();

					if (field604 == 0 && var2 >= 5) {
						break;
					}

					method192();

					if (field607 != null) {
						method193();
					}
				}

				boolean var3 = false;
				for (VVUONHHF var4 = (VVUONHHF) field594.method503(); var4 != null; var4 = (VVUONHHF) field594.method505()) {
					if (var4.field1344) {
						var3 = true;
						var4.field1343++;
						if (var4.field1343 > 50) {
							var4.field1343 = 0;
							method189(var4);
						}
					}
				}

				if (!var3) {
					for (VVUONHHF var5 = (VVUONHHF) field594.method503(); var5 != null; var5 = (VVUONHHF) field594.method505()) {
						var3 = true;
						var5.field1343++;
						if (var5.field1343 > 50) {
							var5.field1343 = 0;
							method189(var5);
						}
					}
				}

				if (var3) {
					field614++;
					if (field614 > 750) {
						try {
							field583.close();
						} catch (Exception var8) {
						}

						field583 = null;
						field607 = null;
						field602 = null;
						field596 = 0;
					}
				} else {
					field614 = 0;
					field590 = "";
				}

				if (field617.field217 && field583 != null && field602 != null && (field610 > 0 || field617.field385[0] == null)) {
					field615++;
					if (field615 > 500) {
						field615 = 0;
						field611[0] = 0;
						field611[1] = 0;
						field611[2] = 0;
						field611[3] = 10;
						try {
							field602.write(field611, 0, 4);
						} catch (IOException var7) {
							field614 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("ELICEBAH.b(ZI)Z")
	public final boolean method187(int arg0) {
		for (int var2 = 0; var2 < field586.length; var2++) {
			if (field580[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("ELICEBAH.a()V")
	public final void method188() {
		field584 = false;
	}

	@ObfuscatedName("ELICEBAH.a(ILVVUONHHF;)V")
	public final void method189(VVUONHHF arg0) {
		try {
			if (field583 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field603 < 4000L) {
					return;
				}

				field603 = var2;
				field583 = field617.method99(client.field167 + 43594);
				field607 = field583.getInputStream();
				field602 = field583.getOutputStream();
				field602.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field607.read();
				}

				field614 = 0;
			}

			field611[0] = (byte) arg0.field1340;
			field611[1] = (byte) (arg0.field1341 >> 8);
			field611[2] = (byte) arg0.field1341;
			if (arg0.field1344) {
				field611[3] = 2;
			} else if (field617.field217) {
				field611[3] = 0;
			} else {
				field611[3] = 1;
			}

			field602.write(field611, 0, 4);
			field615 = 0;
			field601 = -10000;
		} catch (IOException var7) {
			try {
				field583.close();
			} catch (Exception var6) {
			}

			field583 = null;
			field607 = null;
			field602 = null;
			field596 = 0;
			field601++;
		}
	}

	@ObfuscatedName("ELICEBAH.b(B)V")
	public final void method190() {
		VVUONHHF var2;
		synchronized (field588) {
			var2 = (VVUONHHF) field588.method502();
		}

		while (var2 != null) {
			field589 = true;
			byte[] var3 = null;
			if (field617.field385[0] != null) {
				var3 = field617.field385[var2.field1340 + 1].method328(var2.field1341);
			}

			if (!method203(field598[var2.field1340][var2.field1341], field613[var2.field1340][var2.field1341], var3)) {
				var3 = null;
			}

			synchronized (field588) {
				if (var3 == null) {
					field599.method500(var2);
				} else {
					var2.field1342 = var3;

					synchronized (field608) {
						field608.method500(var2);
					}
				}

				var2 = (VVUONHHF) field588.method502();
			}
		}
	}

	@ObfuscatedName("ELICEBAH.c(ZI)I")
	public final int method191(int arg0) {
		return field598[arg0].length;
	}

	@ObfuscatedName("ELICEBAH.b(I)V")
	public final void method192() {
		while (field604 == 0) {
			if (field605 >= 10 || field610 == 0) {
				return;
			}

			VVUONHHF var2;
			synchronized (field587) {
				var2 = (VVUONHHF) field587.method502();
			}

			while (var2 != null) {
				if (field585[var2.field1340][var2.field1341] != 0) {
					field585[var2.field1340][var2.field1341] = 0;
					field594.method500(var2);
					method189(var2);
					field589 = true;

					if (field593 < field582) {
						field593++;
					}

					field590 = "Loading extra files - " + field593 * 100 / field582 + "%";
					field605++;
					if (field605 == 10) {
						return;
					}
				}

				synchronized (field587) {
					var2 = (VVUONHHF) field587.method502();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field585[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field610) {
						var5[var7] = 0;
						VVUONHHF var8 = new VVUONHHF();
						var8.field1340 = var4;
						var8.field1341 = var7;
						var8.field1344 = false;
						field594.method500(var8);
						method189(var8);
						field589 = true;

						if (field593 < field582) {
							field593++;
						}

						field590 = "Loading extra files - " + field593 * 100 / field582 + "%";
						field605++;
						if (field605 == 10) {
							return;
						}
					}
				}
			}

			field610--;
		}
	}

	@ObfuscatedName("ELICEBAH.c(I)V")
	public final void method193() {
		try {
			int var1 = field607.available();
			if (field596 == 0 && var1 >= 6) {
				field589 = true;

				for (int var2 = 0; var2 < 6; var2 += field607.read(field611, var2, 6 - var2)) {
				}

				int var3 = field611[0] & 0xFF;
				int var4 = ((field611[1] & 0xFF) << 8) + (field611[2] & 0xFF);
				int var5 = ((field611[3] & 0xFF) << 8) + (field611[4] & 0xFF);
				int var6 = field611[5] & 0xFF;
				field600 = null;
				for (VVUONHHF var7 = (VVUONHHF) field594.method503(); var7 != null; var7 = (VVUONHHF) field594.method505()) {
					if (var7.field1340 == var3 && var7.field1341 == var4) {
						field600 = var7;
					}

					if (field600 != null) {
						var7.field1343 = 0;
					}
				}

				if (field600 != null) {
					field614 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field600.field1342 = null;

						if (field600.field1344) {
							synchronized (field608) {
								field608.method500(field600);
							}
						} else {
							field600.method398();
						}

						field600 = null;
					} else {
						if (field600.field1342 == null && var6 == 0) {
							field600.field1342 = new byte[var5];
						}

						if (field600.field1342 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field595 = var6 * 500;
				field596 = 500;
				if (field596 > var5 - var6 * 500) {
					field596 = var5 - var6 * 500;
				}
			}

			if (field596 > 0 && var1 >= field596) {
				field589 = true;
				byte[] var9 = field611;
				int var10 = 0;
				if (field600 != null) {
					var9 = field600.field1342;
					var10 = field595;
				}

				for (int var11 = 0; var11 < field596; var11 += field607.read(var9, var10 + var11, field596 - var11)) {
				}

				if (field596 + field595 >= var9.length && field600 != null) {
					if (field617.field385[0] != null) {
						field617.field385[field600.field1340 + 1].method329(field600.field1341, var9.length, var9);
					}

					if (!field600.field1344 && field600.field1340 == 3) {
						field600.field1344 = true;
						field600.field1340 = 93;
					}

					if (field600.field1344) {
						synchronized (field608) {
							field608.method500(field600);
						}
					} else {
						field600.method398();
					}
				}

				field596 = 0;
			}
		} catch (IOException var17) {
			try {
				field583.close();
			} catch (Exception var14) {
			}

			field583 = null;
			field607 = null;
			field602 = null;
			field596 = 0;
		}
	}

	@ObfuscatedName("ELICEBAH.a(Z)I")
	public final int method194() {
		return field606.length;
	}

	@ObfuscatedName("ELICEBAH.a(III)V")
	public final void method195(int arg0, int arg1) {
		if (field617.field385[0] != null && (field598[arg1][arg0] != 0 && (field585[arg1][arg0] != 0 && field610 != 0))) {
			VVUONHHF var3 = new VVUONHHF();
			var3.field1340 = arg1;
			var3.field1341 = arg0;
			var3.field1344 = false;

			synchronized (field587) {
				field587.method500(var3);
			}
		}
	}

	@ObfuscatedName("ELICEBAH.a(LRVLWVPJQ;Lclient;)V")
	public final void method196(RVLWVPJQ arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method424(var3[var4], null);
			int var6 = var5.length / 2;
			UAWAYCTK var7 = new UAWAYCTK(var5);
			field598[var4] = new int[var6];
			field585[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field598[var4][var8] = var7.method457();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method424(var9[var10], null);
			int var12 = var11.length / 4;
			UAWAYCTK var13 = new UAWAYCTK(var11);
			field613[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field613[var10][var14] = var13.method460();
			}
		}

		byte[] var15 = arg0.method424("model_index", null);
		int var16 = field598[0].length;
		field612 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field612[var17] = var15[var17];
			} else {
				field612[var17] = 0;
			}
		}

		byte[] var18 = arg0.method424("map_index", null);
		UAWAYCTK var19 = new UAWAYCTK(var18);
		int var20 = var18.length / 7;
		field586 = new int[var20];
		field591 = new int[var20];
		field580 = new int[var20];
		field581 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field586[var21] = var19.method457();
			field591[var21] = var19.method457();
			field580[var21] = var19.method457();
			field581[var21] = var19.method455();
		}

		byte[] var22 = arg0.method424("anim_index", null);
		UAWAYCTK var23 = new UAWAYCTK(var22);
		int var24 = var22.length / 2;
		field606 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field606[var25] = var23.method457();
		}

		byte[] var26 = arg0.method424("midi_index", null);
		UAWAYCTK var27 = new UAWAYCTK(var26);
		int var28 = var26.length;
		field609 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field609[var29] = var27.method455();
		}

		field617 = arg1;
		field584 = true;
		field617.method12(this, 2);
	}

	@ObfuscatedName("ELICEBAH.b()LVVUONHHF;")
	public final VVUONHHF method197() {
		VVUONHHF var2;
		synchronized (field608) {
			var2 = (VVUONHHF) field608.method502();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field592) {
			var2.method209();
		}

		if (var2.field1342 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1342));
			while (true) {
				if (field616.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field616, var4, field616.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1342 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1342[var7] = field616[var7];
		}

		return var2;
	}

	@ObfuscatedName("ELICEBAH.a(I)V")
	public final void method198(int arg0) {
		method184(0, arg0);
	}

	@ObfuscatedName("ELICEBAH.a(IIII)I")
	public final int method199(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg0;
		for (int var5 = 0; var5 < field586.length; var5++) {
			if (field586[var5] == var4) {
				if (arg1 == 0) {
					return field591[var5];
				}

				return field580[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("ELICEBAH.b(II)I")
	public final int method200(int arg0) {
		return field612[arg0] & 0xFF;
	}

	@ObfuscatedName("ELICEBAH.a(IIBI)V")
	public final void method201(int arg0, byte arg1, int arg2) {
		if (field617.field385[0] != null && field598[arg0][arg2] != 0) {
			byte[] var4 = field617.field385[arg0 + 1].method328(arg2);
			if (!method203(field598[arg0][arg2], field613[arg0][arg2], var4)) {
				field585[arg0][arg2] = arg1;

				if (arg1 > field610) {
					field610 = arg1;
				}

				field582++;
			}
		}
	}

	@ObfuscatedName("ELICEBAH.a(IZ)V")
	public final void method202(boolean arg0) {
		int var2 = field586.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field581[var3] != 0) {
				method201(3, (byte) 2, field580[var3]);
				method201(3, (byte) 2, field591[var3]);
			}
		}
	}

	@ObfuscatedName("ELICEBAH.a(ZII[B)Z")
	public final boolean method203(int arg0, int arg1, byte[] arg2) {
		if (arg2 != null && arg2.length >= 2) {
			int var4 = arg2.length - 2;
			int var5 = ((arg2[var4] & 0xFF) << 8) + (arg2[var4 + 1] & 0xFF);
			field597.reset();
			field597.update(arg2, 0, var4);
			int var6 = (int) field597.getValue();

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

	@ObfuscatedName("ELICEBAH.c()I")
	public final int method204() {
		synchronized (field592) {
			return field592.method397();
		}
	}

	@ObfuscatedName("ELICEBAH.d(I)V")
	public final void method205() {
		field604 = 0;
		field605 = 0;
		for (VVUONHHF var1 = (VVUONHHF) field594.method503(); var1 != null; var1 = (VVUONHHF) field594.method505()) {
			if (var1.field1344) {
				field604++;
			} else {
				field605++;
			}
		}

		while (field604 < 10) {
			VVUONHHF var2 = (VVUONHHF) field599.method502();
			if (var2 == null) {
				break;
			}

			if (field585[var2.field1340][var2.field1341] != 0) {
				field593++;
			}

			field585[var2.field1340][var2.field1341] = 0;
			field594.method500(var2);
			field604++;
			method189(var2);
			field589 = true;
		}
	}
}
