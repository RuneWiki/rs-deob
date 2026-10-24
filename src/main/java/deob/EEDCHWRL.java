package deob;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import sign.signlink;

@ObfuscatedName("EEDCHWRL")
public class EEDCHWRL extends GRHIOFLC implements Runnable {

	@ObfuscatedName("EEDCHWRL.c")
	public boolean field619 = true;

	@ObfuscatedName("EEDCHWRL.h")
	public boolean field623 = false;

	@ObfuscatedName("EEDCHWRL.i")
	public byte[][] field624 = new byte[4][];

	@ObfuscatedName("EEDCHWRL.j")
	public WUVIEXOA field625 = new WUVIEXOA();

	@ObfuscatedName("EEDCHWRL.l")
	public HASAJOKP field627 = new HASAJOKP();

	@ObfuscatedName("EEDCHWRL.n")
	public WUVIEXOA field628 = new WUVIEXOA();

	@ObfuscatedName("EEDCHWRL.p")
	public int[][] field630 = new int[4][];

	@ObfuscatedName("EEDCHWRL.q")
	public WUVIEXOA field631 = new WUVIEXOA();

	@ObfuscatedName("EEDCHWRL.s")
	public int[][] field633 = new int[4][];

	@ObfuscatedName("EEDCHWRL.v")
	public WUVIEXOA field636 = new WUVIEXOA();

	@ObfuscatedName("EEDCHWRL.w")
	public WUVIEXOA field637 = new WUVIEXOA();

	@ObfuscatedName("EEDCHWRL.z")
	public byte[] field639 = new byte[65000];

	@ObfuscatedName("EEDCHWRL.D")
	public String field642 = "";

	@ObfuscatedName("EEDCHWRL.F")
	public byte[] field643 = new byte[500];

	@ObfuscatedName("EEDCHWRL.L")
	public CRC32 field649 = new CRC32();

	@ObfuscatedName("EEDCHWRL.d")
	public int field620;

	@ObfuscatedName("EEDCHWRL.u")
	public int field635;

	@ObfuscatedName("EEDCHWRL.x")
	public int field638;

	@ObfuscatedName("EEDCHWRL.A")
	public int field640;

	@ObfuscatedName("EEDCHWRL.C")
	public int field641;

	@ObfuscatedName("EEDCHWRL.G")
	public int field644;

	@ObfuscatedName("EEDCHWRL.H")
	public int field645;

	@ObfuscatedName("EEDCHWRL.I")
	public int field646;

	@ObfuscatedName("EEDCHWRL.P")
	public int field653;

	@ObfuscatedName("EEDCHWRL.Q")
	public int field654;

	@ObfuscatedName("EEDCHWRL.T")
	public int field655;

	@ObfuscatedName("EEDCHWRL.t")
	public long field634;

	@ObfuscatedName("EEDCHWRL.o")
	public GVYJCWHX field629;

	@ObfuscatedName("EEDCHWRL.f")
	public client field621;

	@ObfuscatedName("EEDCHWRL.N")
	public InputStream field651;

	@ObfuscatedName("EEDCHWRL.b")
	public OutputStream field618;

	@ObfuscatedName("EEDCHWRL.J")
	public Socket field647;

	@ObfuscatedName("EEDCHWRL.r")
	public byte[] field632;

	@ObfuscatedName("EEDCHWRL.g")
	public int[] field622;

	@ObfuscatedName("EEDCHWRL.k")
	public int[] field626;

	@ObfuscatedName("EEDCHWRL.K")
	public int[] field648;

	@ObfuscatedName("EEDCHWRL.M")
	public int[] field650;

	@ObfuscatedName("EEDCHWRL.O")
	public int[] field652;

	@ObfuscatedName("EEDCHWRL.U")
	public int[] field656;

	@ObfuscatedName("EEDCHWRL.a(B)V")
	public final void method256() {
		synchronized (field631) {
			field631.method589();
		}
	}

	public final void run() {
		try {
			while (field619) {
				field638++;
				byte var1 = 20;
				if (field641 == 0 && field621.field292[0] != null) {
					var1 = 50;
				}

				try {
					Thread.sleep(var1);
				} catch (Exception var9) {
				}

				field623 = true;
				for (int var2 = 0; var2 < 100 && field623; var2++) {
					field623 = false;
					method263();
					method264();

					if (field653 == 0 && var2 >= 5) {
						break;
					}

					method266();

					if (field651 != null) {
						method269();
					}
				}

				boolean var3 = false;
				for (GVYJCWHX var4 = (GVYJCWHX) field625.method585(); var4 != null; var4 = (GVYJCWHX) field625.method587()) {
					if (var4.field849) {
						var3 = true;
						var4.field845++;
						if (var4.field845 > 50) {
							var4.field845 = 0;
							method265(var4);
						}
					}
				}

				if (!var3) {
					for (GVYJCWHX var5 = (GVYJCWHX) field625.method585(); var5 != null; var5 = (GVYJCWHX) field625.method587()) {
						var3 = true;
						var5.field845++;
						if (var5.field845 > 50) {
							var5.field845 = 0;
							method265(var5);
						}
					}
				}

				if (var3) {
					field640++;
					if (field640 > 750) {
						try {
							field647.close();
						} catch (Exception var8) {
						}

						field647 = null;
						field651 = null;
						field618 = null;
						field646 = 0;
					}
				} else {
					field640 = 0;
					field642 = "";
				}

				if (field621.field439 && field647 != null && field618 != null && (field641 > 0 || field621.field292[0] == null)) {
					field655++;
					if (field655 > 500) {
						field655 = 0;
						field643[0] = 0;
						field643[1] = 0;
						field643[2] = 0;
						field643[3] = 10;
						try {
							field618.write(field643, 0, 4);
						} catch (IOException var7) {
							field640 = 5000;
						}
					}
				}
			}
		} catch (Exception var10) {
			signlink.reporterror("od_ex " + var10.getMessage());
		}
	}

	@ObfuscatedName("EEDCHWRL.a()LGVYJCWHX;")
	public final GVYJCWHX method257() {
		GVYJCWHX var2;
		synchronized (field636) {
			var2 = (GVYJCWHX) field636.method584();
		}

		if (var2 == null) {
			return null;
		}

		synchronized (field627) {
			var2.method292();
		}

		if (var2.field848 == null) {
			return var2;
		}

		int var4 = 0;
		try {
			GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field848));
			while (true) {
				if (field639.length == var4) {
					throw new RuntimeException("buffer overflow!");
				}

				int var6 = var5.read(field639, var4, field639.length - var4);
				if (var6 == -1) {
					break;
				}

				var4 += var6;
			}
		} catch (IOException var10) {
			throw new RuntimeException("error unzipping");
		}

		var2.field848 = new byte[var4];
		for (int var7 = 0; var7 < var4; var7++) {
			var2.field848[var7] = field639[var7];
		}

		return var2;
	}

	@ObfuscatedName("EEDCHWRL.a(ZI)I")
	public final int method258(int arg0) {
		return field632[arg0] & 0xFF;
	}

	@ObfuscatedName("EEDCHWRL.a(II)V")
	public final void method259(int arg0, int arg1) {
		if (arg0 >= 0 && arg0 <= field630.length && arg1 >= 0 && arg1 <= field630[arg0].length && field630[arg0][arg1] != 0) {
			synchronized (field627) {
				for (GVYJCWHX var4 = (GVYJCWHX) field627.method372(); var4 != null; var4 = (GVYJCWHX) field627.method373()) {
					if (var4.field847 == arg0 && var4.field846 == arg1) {
						return;
					}
				}

				GVYJCWHX var5 = new GVYJCWHX();
				var5.field847 = arg0;
				var5.field846 = arg1;
				var5.field849 = true;

				synchronized (field628) {
					field628.method582(var5);
				}

				field627.method370(var5);
			}
		}
	}

	@ObfuscatedName("EEDCHWRL.a(IZII)I")
	public final int method260(int arg0, int arg1, int arg2) {
		int var4 = (arg2 << 8) + arg1;
		for (int var5 = 0; var5 < field648.length; var5++) {
			if (field648[var5] == var4) {
				if (arg0 == 0) {
					return field626[var5];
				}

				return field622[var5];
			}
		}

		return -1;
	}

	@ObfuscatedName("EEDCHWRL.b(II)Z")
	public final boolean method261(int arg0) {
		if (field652[arg0] == 1) {
			return true;
		}

		return false;
	}

	@ObfuscatedName("EEDCHWRL.a(ZZ)V")
	public final void method262(boolean arg0) {
		int var2 = field648.length;
		for (int var3 = 0; var3 < var2; var3++) {
			if (arg0 || field656[var3] != 0) {
				method271(3, field622[var3], (byte) 2);
				method271(3, field626[var3], (byte) 2);
			}
		}
	}

	@ObfuscatedName("EEDCHWRL.b(I)V")
	public final void method263() {
		GVYJCWHX var2;
		synchronized (field628) {
			var2 = (GVYJCWHX) field628.method584();
		}

		while (var2 != null) {
			field623 = true;
			byte[] var3 = null;
			if (field621.field292[0] != null) {
				var3 = field621.field292[var2.field847 + 1].method375(var2.field846);
			}

			if (!method274(var3, field630[var2.field847][var2.field846], field633[var2.field847][var2.field846])) {
				var3 = null;
			}

			synchronized (field628) {
				if (var3 == null) {
					field637.method582(var2);
				} else {
					var2.field848 = var3;

					synchronized (field636) {
						field636.method582(var2);
					}
				}

				var2 = (GVYJCWHX) field628.method584();
			}
		}
	}

	@ObfuscatedName("EEDCHWRL.b(B)V")
	public final void method264() {
		field653 = 0;
		field654 = 0;
		for (GVYJCWHX var1 = (GVYJCWHX) field625.method585(); var1 != null; var1 = (GVYJCWHX) field625.method587()) {
			if (var1.field849) {
				field653++;
			} else {
				field654++;
			}
		}

		while (field653 < 10) {
			GVYJCWHX var2 = (GVYJCWHX) field637.method584();
			if (var2 == null) {
				break;
			}

			if (field624[var2.field847][var2.field846] != 0) {
				field620++;
			}

			field624[var2.field847][var2.field846] = 0;
			field625.method582(var2);
			field653++;
			method265(var2);
			field623 = true;
		}
	}

	@ObfuscatedName("EEDCHWRL.a(LGVYJCWHX;I)V")
	public final void method265(GVYJCWHX arg0) {
		try {
			if (field647 == null) {
				long var2 = System.currentTimeMillis();
				if (var2 - field634 < 4000L) {
					return;
				}

				field634 = var2;
				field647 = field621.method168(client.field224 + 43594);
				field651 = field647.getInputStream();
				field618 = field647.getOutputStream();
				field618.write(15);

				for (int var4 = 0; var4 < 8; var4++) {
					field651.read();
				}

				field640 = 0;
			}

			field643[0] = (byte) arg0.field847;
			field643[1] = (byte) (arg0.field846 >> 8);
			field643[2] = (byte) arg0.field846;
			if (arg0.field849) {
				field643[3] = 2;
			} else if (field621.field439) {
				field643[3] = 0;
			} else {
				field643[3] = 1;
			}

			field618.write(field643, 0, 4);
			field655 = 0;
			field635 = -10000;
		} catch (IOException var7) {
			try {
				field647.close();
			} catch (Exception var6) {
			}

			field647 = null;
			field651 = null;
			field618 = null;
			field646 = 0;
			field635++;
		}
	}

	@ObfuscatedName("EEDCHWRL.c(I)V")
	public final void method266() {
		while (field653 == 0) {
			if (field654 >= 10 || field641 == 0) {
				return;
			}

			GVYJCWHX var2;
			synchronized (field631) {
				var2 = (GVYJCWHX) field631.method584();
			}

			while (var2 != null) {
				if (field624[var2.field847][var2.field846] != 0) {
					field624[var2.field847][var2.field846] = 0;
					field625.method582(var2);
					method265(var2);
					field623 = true;

					if (field620 < field644) {
						field620++;
					}

					field642 = "Loading extra files - " + field620 * 100 / field644 + "%";
					field654++;
					if (field654 == 10) {
						return;
					}
				}

				synchronized (field631) {
					var2 = (GVYJCWHX) field631.method584();
				}
			}

			for (int var4 = 0; var4 < 4; var4++) {
				byte[] var5 = field624[var4];
				int var6 = var5.length;
				for (int var7 = 0; var7 < var6; var7++) {
					if (var5[var7] == field641) {
						var5[var7] = 0;
						GVYJCWHX var8 = new GVYJCWHX();
						var8.field847 = var4;
						var8.field846 = var7;
						var8.field849 = false;
						field625.method582(var8);
						method265(var8);
						field623 = true;

						if (field620 < field644) {
							field620++;
						}

						field642 = "Loading extra files - " + field620 * 100 / field644 + "%";
						field654++;
						if (field654 == 10) {
							return;
						}
					}
				}
			}

			field641--;
		}
	}

	@ObfuscatedName("EEDCHWRL.a(LEAXVDNXA;Lclient;)V")
	public final void method267(EAXVDNXA arg0, client arg1) {
		String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		for (int var4 = 0; var4 < 4; var4++) {
			byte[] var5 = arg0.method255(var3[var4], null);
			int var6 = var5.length / 2;
			CKBTFRZM var7 = new CKBTFRZM(var5);
			field630[var4] = new int[var6];
			field624[var4] = new byte[var6];

			for (int var8 = 0; var8 < var6; var8++) {
				field630[var4][var8] = var7.method46();
			}
		}

		String[] var9 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		for (int var10 = 0; var10 < 4; var10++) {
			byte[] var11 = arg0.method255(var9[var10], null);
			int var12 = var11.length / 4;
			CKBTFRZM var13 = new CKBTFRZM(var11);
			field633[var10] = new int[var12];
			for (int var14 = 0; var14 < var12; var14++) {
				field633[var10][var14] = var13.method49();
			}
		}

		byte[] var15 = arg0.method255("model_index", null);
		int var16 = field630[0].length;
		field632 = new byte[var16];
		for (int var17 = 0; var17 < var16; var17++) {
			if (var17 < var15.length) {
				field632[var17] = var15[var17];
			} else {
				field632[var17] = 0;
			}
		}

		byte[] var18 = arg0.method255("map_index", null);
		CKBTFRZM var19 = new CKBTFRZM(var18);
		int var20 = var18.length / 7;
		field648 = new int[var20];
		field626 = new int[var20];
		field622 = new int[var20];
		field656 = new int[var20];
		for (int var21 = 0; var21 < var20; var21++) {
			field648[var21] = var19.method46();
			field626[var21] = var19.method46();
			field622[var21] = var19.method46();
			field656[var21] = var19.method44();
		}

		byte[] var22 = arg0.method255("anim_index", null);
		CKBTFRZM var23 = new CKBTFRZM(var22);
		int var24 = var22.length / 2;
		field650 = new int[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			field650[var25] = var23.method46();
		}

		byte[] var26 = arg0.method255("midi_index", null);
		CKBTFRZM var27 = new CKBTFRZM(var26);
		int var28 = var26.length;
		field652 = new int[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			field652[var29] = var27.method44();
		}

		field621 = arg1;
		field619 = true;
		field621.method117(this, 2);
	}

	@ObfuscatedName("EEDCHWRL.b()I")
	public final int method268() {
		synchronized (field627) {
			return field627.method374();
		}
	}

	@ObfuscatedName("EEDCHWRL.a(Z)V")
	public final void method269() {
		try {
			int var1 = field651.available();
			if (field646 == 0 && var1 >= 6) {
				field623 = true;

				for (int var2 = 0; var2 < 6; var2 += field651.read(field643, var2, 6 - var2)) {
				}

				int var3 = field643[0] & 0xFF;
				int var4 = ((field643[1] & 0xFF) << 8) + (field643[2] & 0xFF);
				int var5 = ((field643[3] & 0xFF) << 8) + (field643[4] & 0xFF);
				int var6 = field643[5] & 0xFF;
				field629 = null;
				for (GVYJCWHX var7 = (GVYJCWHX) field625.method585(); var7 != null; var7 = (GVYJCWHX) field625.method587()) {
					if (var7.field847 == var3 && var7.field846 == var4) {
						field629 = var7;
					}

					if (field629 != null) {
						var7.field845 = 0;
					}
				}

				if (field629 != null) {
					field640 = 0;

					if (var5 == 0) {
						signlink.reporterror("Rej: " + var3 + "," + var4);
						field629.field848 = null;

						if (field629.field849) {
							synchronized (field636) {
								field636.method582(field629);
							}
						} else {
							field629.method450();
						}

						field629 = null;
					} else {
						if (field629.field848 == null && var6 == 0) {
							field629.field848 = new byte[var5];
						}

						if (field629.field848 == null && var6 != 0) {
							throw new IOException("missing start of file");
						}
					}
				}

				field645 = var6 * 500;
				field646 = 500;
				if (field646 > var5 - var6 * 500) {
					field646 = var5 - var6 * 500;
				}
			}

			if (field646 > 0 && var1 >= field646) {
				field623 = true;
				byte[] var9 = field643;
				int var10 = 0;
				if (field629 != null) {
					var9 = field629.field848;
					var10 = field645;
				}

				for (int var11 = 0; var11 < field646; var11 += field651.read(var9, var10 + var11, field646 - var11)) {
				}

				if (field646 + field645 >= var9.length && field629 != null) {
					if (field621.field292[0] != null) {
						field621.field292[field629.field847 + 1].method376(var9.length, field629.field846, var9);
					}

					if (!field629.field849 && field629.field847 == 3) {
						field629.field849 = true;
						field629.field847 = 93;
					}

					if (field629.field849) {
						synchronized (field636) {
							field636.method582(field629);
						}
					} else {
						field629.method450();
					}
				}

				field646 = 0;
			}
		} catch (IOException var17) {
			try {
				field647.close();
			} catch (Exception var14) {
			}

			field647 = null;
			field651 = null;
			field618 = null;
			field646 = 0;
		}
	}

	@ObfuscatedName("EEDCHWRL.c()V")
	public final void method270() {
		field619 = false;
	}

	@ObfuscatedName("EEDCHWRL.a(IIIB)V")
	public final void method271(int arg0, int arg1, byte arg2) {
		if (field621.field292[0] != null && field630[arg0][arg1] != 0) {
			byte[] var4 = field621.field292[arg0 + 1].method375(arg1);
			if (!method274(var4, field630[arg0][arg1], field633[arg0][arg1])) {
				field624[arg0][arg1] = arg2;

				if (arg2 > field641) {
					field641 = arg2;
				}

				field644++;
			}
		}
	}

	@ObfuscatedName("EEDCHWRL.d(I)I")
	public final int method272() {
		return field650.length;
	}

	@ObfuscatedName("EEDCHWRL.a(I)V")
	public final void method273(int arg0) {
		method259(0, arg0);
	}

	@ObfuscatedName("EEDCHWRL.a(Z[BII)Z")
	public final boolean method274(byte[] arg0, int arg1, int arg2) {
		if (arg0 != null && arg0.length >= 2) {
			int var4 = arg0.length - 2;
			int var5 = ((arg0[var4] & 0xFF) << 8) + (arg0[var4 + 1] & 0xFF);
			field649.reset();
			field649.update(arg0, 0, var4);
			int var6 = (int) field649.getValue();

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

	@ObfuscatedName("EEDCHWRL.a(BI)Z")
	public final boolean method275(int arg0) {
		for (int var2 = 0; var2 < field648.length; var2++) {
			if (field622[var2] == arg0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("EEDCHWRL.a(IB)I")
	public final int method276(int arg0) {
		return field630[arg0].length;
	}

	@ObfuscatedName("EEDCHWRL.a(BII)V")
	public final void method277(int arg0, int arg1) {
		if (field621.field292[0] != null && (field630[arg0][arg1] != 0 && (field624[arg0][arg1] != 0 && field641 != 0))) {
			GVYJCWHX var3 = new GVYJCWHX();
			var3.field847 = arg0;
			var3.field846 = arg1;
			var3.field849 = false;

			synchronized (field631) {
				field631.method582(var3);
			}
		}
	}
}
