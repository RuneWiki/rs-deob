package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("HJOZCGZH")
public class HJOZCGZH extends AGHORJOI implements Runnable {

	@ObfuscatedName("HJOZCGZH.a")
	public CRZPTUPR field626 = new CRZPTUPR();

	@ObfuscatedName("HJOZCGZH.b")
	public boolean field627 = false;

	@ObfuscatedName("HJOZCGZH.d")
	public JLOKOMHZ field629 = new JLOKOMHZ();

	@ObfuscatedName("HJOZCGZH.f")
	public CRZPTUPR field631 = new CRZPTUPR();

	@ObfuscatedName("HJOZCGZH.g")
	public int[][] field632 = new int[4][];

	@ObfuscatedName("HJOZCGZH.p")
	public CRZPTUPR field638 = new CRZPTUPR();

	@ObfuscatedName("HJOZCGZH.r")
	public boolean field640 = true;

	@ObfuscatedName("HJOZCGZH.w")
	public String field645 = "";

	@ObfuscatedName("HJOZCGZH.z")
	public byte[][] field648 = new byte[4][];

	@ObfuscatedName("HJOZCGZH.B")
	public CRZPTUPR field649 = new CRZPTUPR();

	@ObfuscatedName("HJOZCGZH.D")
	public byte[] field651 = new byte[500];

	@ObfuscatedName("HJOZCGZH.I")
	public byte[] field654 = new byte[65000];

	@ObfuscatedName("HJOZCGZH.M")
	public CRC32 field656 = new CRC32();

	@ObfuscatedName("HJOZCGZH.R")
	public CRZPTUPR field661 = new CRZPTUPR();

	@ObfuscatedName("HJOZCGZH.S")
	public int[][] field662 = new int[4][];

	@ObfuscatedName("HJOZCGZH.e")
	public int field630;

	@ObfuscatedName("HJOZCGZH.h")
	public int field633;

	@ObfuscatedName("HJOZCGZH.i")
	public int field634;

	@ObfuscatedName("HJOZCGZH.k")
	public int field636;

	@ObfuscatedName("HJOZCGZH.s")
	public int field641;

	@ObfuscatedName("HJOZCGZH.t")
	public int field642;

	@ObfuscatedName("HJOZCGZH.u")
	public int field643;

	@ObfuscatedName("HJOZCGZH.v")
	public int field644;

	@ObfuscatedName("HJOZCGZH.x")
	public int field646;

	@ObfuscatedName("HJOZCGZH.C")
	public int field650;

	@ObfuscatedName("HJOZCGZH.N")
	public int field657;

	@ObfuscatedName("HJOZCGZH.j")
	public long field635;

	@ObfuscatedName("HJOZCGZH.y")
	public VOTBAEIQ field647;

	@ObfuscatedName("HJOZCGZH.Q")
	public client field660;

	@ObfuscatedName("HJOZCGZH.P")
	public InputStream field659;

	@ObfuscatedName("HJOZCGZH.G")
	public OutputStream field653;

	@ObfuscatedName("HJOZCGZH.J")
	public Socket field655;

	@ObfuscatedName("HJOZCGZH.U")
	public byte[] field664;

	@ObfuscatedName("HJOZCGZH.c")
	public int[] field628;

	@ObfuscatedName("HJOZCGZH.n")
	public int[] field637;

	@ObfuscatedName("HJOZCGZH.q")
	public int[] field639;

	@ObfuscatedName("HJOZCGZH.F")
	public int[] field652;

	@ObfuscatedName("HJOZCGZH.O")
	public int[] field658;

	@ObfuscatedName("HJOZCGZH.T")
	public int[] field663;

	public final void run() {
		try {
			while (field640) {
				field657++;
				byte var1 = 20;
				if (field650 == 0 && field660.field413[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field627 = true;
				for (int var2 = 0; var2 < 100 && field627; var2++) {
					field627 = false;
					method219();
					method217();

					if (field641 == 0 && var2 >= 5) {
						break;
					}

					method216();

					if (field659 != null) {
						method204();
					}
				}

				boolean var3 = false;
				for (VOTBAEIQ var4 = (VOTBAEIQ) field631.method179(); var4 != null; var4 = (VOTBAEIQ) field631.method181()) {
					if (var4.field1328) {
						var3 = true;
						var4.field1326++;
						if (var4.field1326 > 50) {
							var4.field1326 = 0;
							method215(var4);
						}
					}
				}

				if (!var3) {
					for (VOTBAEIQ var5 = (VOTBAEIQ) field631.method179(); var5 != null; var5 = (VOTBAEIQ) field631.method181()) {
						var3 = true;
						var5.field1326++;
						if (var5.field1326 > 50) {
							var5.field1326 = 0;
							method215(var5);
						}
					}
				}

				if (var3) {
					field644++;
					if (field644 > 750) {
						try {
							field655.close();
						} catch (Exception var8) {
						}

						field655 = null;
						field659 = null;
						field653 = null;
						field634 = 0;
					}
				} else {
					field644 = 0;
					field645 = "";
				}

				if (field660.field305 && field655 != null && field653 != null && (field650 > 0 || field660.field413[0] == null)) {
					field636++;
					if (field636 > 500) {
						field636 = 0;
						field651[0] = 0;
						field651[1] = 0;
						field651[2] = 0;
						field651[3] = 10;
						try {
							field653.write(field651, 0, 4);
						} catch (IOException var7) {
							field644 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("HJOZCGZH.a(Z)V")
	public final void method200() {
		synchronized (field638) {
			field638.method183();
		}
	}

	@ObfuscatedName("HJOZCGZH.a(IB)Z")
	public final boolean method201(int arg0) {
		if (field637[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("HJOZCGZH.a()V")
	public final void method202() {
		field640 = false;
	}

	@ObfuscatedName("HJOZCGZH.a(III)V")
	public final void method203(int arg0, int arg1) {
		if (field660.field413[0] != null && (field632[arg1][arg0] != 0 && (field648[arg1][arg0] != 0 && field650 != 0))) {
			VOTBAEIQ var3 = new VOTBAEIQ();
			var3.field1327 = arg1;
			var3.field1330 = arg0;
			var3.field1328 = false;

			synchronized (field638) {
				field638.method176(var3);
			}
		}
	}

	@ObfuscatedName("HJOZCGZH.a(I)V")
	public final void method1(int arg0) {
		method213(0, arg0);
	}

	@ObfuscatedName("HJOZCGZH.b(I)V")
	public final void method204() {
		try {
			int var1 = field659.available();
			if (field634 == 0 && var1 >= 6) {
				field627 = true;

				for (int var2 = 0; var2 < 6; var2 += field659.read(field651, var2, 6 - var2)) {
				}

				int var3 = field651[0] & 0xFF;
				int var4 = ((field651[1] & 0xFF) << 8) + (field651[2] & 0xFF);
				int var5 = ((field651[3] & 0xFF) << 8) + (field651[4] & 0xFF);
				int var6 = field651[5] & 0xFF;
				field647 = null;
				for (VOTBAEIQ var7 = (VOTBAEIQ) field631.method179(); var7 != null; var7 = (VOTBAEIQ) field631.method181()) {
					if (var7.field1327 == var3 && var7.field1330 == var4) {
						field647 = var7;
					}

					if (field647 != null) {
						var7.field1326 = 0;
					}
				}

				if (field647 != null) {
					field644 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field647.field1329 = null;

						if (field647.field1328) {
							synchronized (field626) {
								field626.method176(field647);
							}
						} else {
							field647.method272();
						}

						field647 = null;
					} else {
						if (field647.field1329 == null && var6 == 0) {
							field647.field1329 = new byte[var5];
						}

						if (field647.field1329 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field633 = var6 * 500;
				field634 = 500;
				if (field634 > var5 - var6 * 500) {
					field634 = var5 - var6 * 500;
				}
			}

			if (field634 > 0 && var1 >= field634) {
				field627 = true;
				byte[] var9 = field651;
				int var10 = 0;
				if (field647 != null) {
					var9 = field647.field1329;
					var10 = field633;
				}

				for (int var11 = 0; var11 < field634; var11 += field659.read(var9, var10 + var11, field634 - var11)) {
				}

				if (field634 + field633 >= var9.length && field647 != null) {
					if (field660.field413[0] != null) {
						field660.field413[field647.field1327 + 1].method528(var9.length, var9, field647.field1330);
					}

					if (!field647.field1328 && field647.field1327 == 3) {
						field647.field1328 = true;
						field647.field1327 = 93;
					}

					if (field647.field1328) {
						synchronized (field626) {
							field626.method176(field647);
						}
					} else {
						field647.method272();
					}
				}

				field634 = 0;
			}
		} catch (IOException var17) {
			try {
				field655.close();
			} catch (Exception var14) {
			}

			field655 = null;
			field659 = null;
			field653 = null;
			field634 = 0;
		}
	}

	@ObfuscatedName("HJOZCGZH.a(II)Z")
	public final boolean method205(int arg0) {
		for (int var2 = 0; var2 < field628.length; var2++) {
			if (field639[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("HJOZCGZH.b(II)I")
	public final int method206(int arg0) {
		return field632[arg0].length;
	}

	@ObfuscatedName("HJOZCGZH.a(IIII)I")
	public final int method207(int arg0, int arg1, int arg2) {
		int var4 = (arg1 << 8) + arg0;
		for (int var5 = 0; var5 < field628.length; var5++) {
			if (field628[var5] == var4) {
				if (arg2 == 0) {
					return field663[var5];
				}

				return field639[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("HJOZCGZH.c(I)I")
	public final int method208() {
		return field652.length;
	}

	@ObfuscatedName("HJOZCGZH.a(LSXKKBWPU;Lclient;)V")
	public final void method209(SXKKBWPU arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method442(var3[var4], null);
			int var6 = var5.length / 2;
			TQYMAXSO var7 = new TQYMAXSO(var5);
			field632[var4] = new int[var6];
			field648[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field632[var4][var8] = var7.method470();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method442(var9[var10], null);
			int var12 = var11.length / 4;
			TQYMAXSO var13 = new TQYMAXSO(var11);
			field662[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field662[var10][var14] = var13.method473();
			}
		}

		byte[] var15 = arg0.method442("model_index", null);
		int var16 = field632[0].length;
		field664 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field664[var17] = var15[var17];
			} else {
				field664[var17] = 0;
			}
		}

		byte[] var18 = arg0.method442("map_index", null);
		TQYMAXSO var19 = new TQYMAXSO(var18);
		int var20 = var18.length / 7;
		field628 = new int[var20];
		field663 = new int[var20];
		field639 = new int[var20];
		field658 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field628[var21] = var19.method470();
			field663[var21] = var19.method470();
			field639[var21] = var19.method470();
			field658[var21] = var19.method468();
		}

		byte[] var22 = arg0.method442("anim_index", null);
		TQYMAXSO var23 = new TQYMAXSO(var22);
		int var24 = var22.length / 2;
		field652 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field652[var25] = var23.method470();
		}

		byte[] var26 = arg0.method442("midi_index", null);
		TQYMAXSO var27 = new TQYMAXSO(var26);
		int var28 = var26.length;
		field637 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field637[var29] = var27.method468();
		}

		field660 = arg1;
		field640 = true;
		field660.method108(this, 2);
	}

	@ObfuscatedName("HJOZCGZH.b()I")
	public final int method210() {
		synchronized (field629) {
			return field629.method237();
		}
	}

	@ObfuscatedName("HJOZCGZH.a(BIII)V")
	public final void method211(byte arg0, int arg1, int arg2) {
		if (field660.field413[0] != null && field632[arg2][arg1] != 0) {
			byte[] var4 = field660.field413[arg2 + 1].method527(arg1);
			if (!method212(var4, field632[arg2][arg1], field662[arg2][arg1])) {
				field648[arg2][arg1] = arg0;

				if (arg0 > field650) {
					field650 = arg0;
				}

				field646++;
			}
		}
	}

	@ObfuscatedName("HJOZCGZH.a([BIII)Z")
	public final boolean method212(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field656.reset();
			field656.update(arg0, 0, var4);
			int var6 = (int) field656.getValue();

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

	@ObfuscatedName("HJOZCGZH.c(II)V")
	public final void method213(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field632.length && arg1 >= 0 && arg1 <= field632[arg0].length && field632[arg0][arg1] != 0) {
			synchronized (field629) {
				for (VOTBAEIQ var4 = (VOTBAEIQ) field629.method235(); var4 != null; var4 = (VOTBAEIQ) field629.method236()) {
					if (var4.field1327 == arg0 && var4.field1330 == arg1) {
						return;
					}
				}

				VOTBAEIQ var5 = new VOTBAEIQ();
				var5.field1327 = arg0;
				var5.field1330 = arg1;
				var5.field1328 = true;

				synchronized (field649) {
					field649.method176(var5);
				}

				field629.method233(var5);
			}
		}
	}

	@ObfuscatedName("HJOZCGZH.c()LVOTBAEIQ;")
	public final VOTBAEIQ method214() {
		VOTBAEIQ var2;
		synchronized (field626) {
			var2 = (VOTBAEIQ) field626.method178();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field629) {
			var2.method531();
		}

		if (var2.field1329 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1329));
			while (true) {
				if (field654.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field654, var4, field654.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field1329 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field1329[var7] = field654[var7];
		}

		return var2;
	}

	@ObfuscatedName("HJOZCGZH.a(LVOTBAEIQ;I)V")
	public final void method215(VOTBAEIQ arg0) {
		try {
			if (field655 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field635 < 4000L) {
					return;
				}

				field635 = var2;
				field655 = field660.method161(client.field435 + 43594);
				field659 = field655.getInputStream();
				field653 = field655.getOutputStream();
				field653.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field659.read();
				}

				field644 = 0;
			}

			field651[0] = (byte) arg0.field1327;
			field651[1] = (byte) (arg0.field1330 >> 8);
			field651[2] = (byte) arg0.field1330;
			if (arg0.field1328) {
				field651[3] = 2;
			} else if (field660.field305) {
				field651[3] = 0;
			} else {
				field651[3] = 1;
			}

			field653.write(field651, 0, 4);
			field636 = 0;
			field630 = -10000;
		} catch (IOException var7) {
			try {
				field655.close();
			} catch (Exception var6) {
			}

			field655 = null;
			field659 = null;
			field653 = null;
			field634 = 0;
			field630++;
		}
	}

	@ObfuscatedName("HJOZCGZH.b(Z)V")
	public final void method216() {
		while (field641 == 0) {
			if (field642 >= 10 || field650 == 0) {
				return;
			}

			VOTBAEIQ var2;
			synchronized (field638) {
				var2 = (VOTBAEIQ) field638.method178();
			}

			while (var2 != null) {
				if (field648[var2.field1327][var2.field1330] != 0) {
					field648[var2.field1327][var2.field1330] = 0;
					field631.method176(var2);
					method215(var2);
					field627 = true;

					if (field643 < field646) {
						field643++;
					}

					field645 = "Loading extra files - " + field643 * 100 / field646 + "%";
					field642++;
					if (field642 == 10) {
						return;
					}
				}

				synchronized (field638) {
					var2 = (VOTBAEIQ) field638.method178();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field648[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field650) {
						var5[var7] = 0;
						VOTBAEIQ var8 = new VOTBAEIQ();
						var8.field1327 = var4;
						var8.field1330 = var7;
						var8.field1328 = false;
						field631.method176(var8);
						method215(var8);
						field627 = true;

						if (field643 < field646) {
							field643++;
						}

						field645 = "Loading extra files - " + field643 * 100 / field646 + "%";
						field642++;
						if (field642 == 10) {
							return;
						}
					}
				}
			}

			field650--;
		}
	}

	@ObfuscatedName("HJOZCGZH.c(Z)V")
	public final void method217() {
		field641 = 0;
		field642 = 0;
		for (VOTBAEIQ var1 = (VOTBAEIQ) field631.method179(); var1 != null; var1 = (VOTBAEIQ) field631.method181()) {
			if (var1.field1328) {
				field641++;
			} else {
				field642++;
			}
		}

		while (field641 < 10) {
			VOTBAEIQ var2 = (VOTBAEIQ) field661.method178();
			if (var2 == null) {
				break;
			}

			if (field648[var2.field1327][var2.field1330] != 0) {
				field643++;
			}

			field648[var2.field1327][var2.field1330] = 0;
			field631.method176(var2);
			field641++;
			method215(var2);
			field627 = true;
		}
	}

	@ObfuscatedName("HJOZCGZH.a(BZ)V")
	public final void method218(boolean arg0) {
		int var2 = field628.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field658[var3] != 0) {
				method211((byte) 2, field639[var3], 3);
				method211((byte) 2, field663[var3], 3);
			}
		}
	}

	@ObfuscatedName("HJOZCGZH.d(Z)V")
	public final void method219() {
		VOTBAEIQ var2;
		synchronized (field649) {
			var2 = (VOTBAEIQ) field649.method178();
		}

		while (var2 != null) {
			field627 = true;
			byte[] var3 = null;
			if (field660.field413[0] != null) {
				var3 = field660.field413[var2.field1327 + 1].method527(var2.field1330);
			}

			if (!method212(var3, field632[var2.field1327][var2.field1330], field662[var2.field1327][var2.field1330])) {
				var3 = null;
			}

			synchronized (field649) {
				if (var3 == null) {
					field661.method176(var2);
				} else {
					var2.field1329 = var3;

					synchronized (field626) {
						field626.method176(var2);
					}
				}

				var2 = (VOTBAEIQ) field649.method178();
			}
		}
	}

	@ObfuscatedName("HJOZCGZH.a(BI)I")
	public final int method220(int arg0) {
		return field664[arg0] & 0xFF;
	}
}
