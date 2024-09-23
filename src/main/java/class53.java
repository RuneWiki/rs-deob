import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("TDBJVJCU")
public class class53 extends class27 implements Runnable {

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "LPILILDKN;")
    private class38 field1365 = new class38(false);

    @OriginalMember(owner = "TDBJVJCU", name = "d", descriptor = "LPILILDKN;")
    private class38 field1368 = new class38(false);

    @OriginalMember(owner = "TDBJVJCU", name = "f", descriptor = "LPILILDKN;")
    private class38 field1370 = new class38(false);

    @OriginalMember(owner = "TDBJVJCU", name = "k", descriptor = "LVHKTMNAT;")
    private class57 field1375 = new class57(true);

    @OriginalMember(owner = "TDBJVJCU", name = "l", descriptor = "Z")
    private boolean field1376 = false;

    @OriginalMember(owner = "TDBJVJCU", name = "m", descriptor = "[[I")
    private int[][] field1377 = new int[4][];

    @OriginalMember(owner = "TDBJVJCU", name = "n", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1378 = new CRC32();

    @OriginalMember(owner = "TDBJVJCU", name = "s", descriptor = "[B")
    private byte[] field1383 = new byte[500];

    @OriginalMember(owner = "TDBJVJCU", name = "t", descriptor = "Z")
    private boolean field1384 = false;

    @OriginalMember(owner = "TDBJVJCU", name = "u", descriptor = "I")
    private int field1385 = 8;

    @OriginalMember(owner = "TDBJVJCU", name = "B", descriptor = "[B")
    private byte[] field1392 = new byte[65000];

    @OriginalMember(owner = "TDBJVJCU", name = "C", descriptor = "I")
    private int field1393 = 693;

    @OriginalMember(owner = "TDBJVJCU", name = "F", descriptor = "Ljava/lang/String;")
    public String field1396 = "";

    @OriginalMember(owner = "TDBJVJCU", name = "I", descriptor = "LPILILDKN;")
    private class38 field1399 = new class38(false);

    @OriginalMember(owner = "TDBJVJCU", name = "J", descriptor = "I")
    private int field1400 = 586;

    @OriginalMember(owner = "TDBJVJCU", name = "K", descriptor = "Z")
    private boolean field1401 = true;

    @OriginalMember(owner = "TDBJVJCU", name = "L", descriptor = "[[I")
    private int[][] field1402 = new int[4][];

    @OriginalMember(owner = "TDBJVJCU", name = "M", descriptor = "Z")
    private boolean field1403 = true;

    @OriginalMember(owner = "TDBJVJCU", name = "O", descriptor = "Z")
    private boolean field1405 = true;

    @OriginalMember(owner = "TDBJVJCU", name = "Q", descriptor = "[[B")
    private byte[][] field1407 = new byte[4][];

    @OriginalMember(owner = "TDBJVJCU", name = "U", descriptor = "LPILILDKN;")
    private class38 field1411 = new class38(false);

    @OriginalMember(owner = "TDBJVJCU", name = "V", descriptor = "B")
    private byte field1412 = 0;

    @OriginalMember(owner = "TDBJVJCU", name = "e", descriptor = "I")
    private int field1369;

    @OriginalMember(owner = "TDBJVJCU", name = "g", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "TDBJVJCU", name = "i", descriptor = "I")
    private int field1373;

    @OriginalMember(owner = "TDBJVJCU", name = "j", descriptor = "I")
    private int field1374;

    @OriginalMember(owner = "TDBJVJCU", name = "q", descriptor = "I")
    private int field1381;

    @OriginalMember(owner = "TDBJVJCU", name = "v", descriptor = "I")
    private int field1386;

    @OriginalMember(owner = "TDBJVJCU", name = "w", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "TDBJVJCU", name = "z", descriptor = "I")
    private int field1390;

    @OriginalMember(owner = "TDBJVJCU", name = "G", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "TDBJVJCU", name = "N", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "TDBJVJCU", name = "P", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "TDBJVJCU", name = "S", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "TDBJVJCU", name = "T", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "TDBJVJCU", name = "p", descriptor = "J")
    private long field1380;

    @OriginalMember(owner = "TDBJVJCU", name = "r", descriptor = "LKRPFBUJX;")
    private class33 field1382;

    @OriginalMember(owner = "TDBJVJCU", name = "E", descriptor = "Lclient;")
    private client field1395;

    @OriginalMember(owner = "TDBJVJCU", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field1372;

    @OriginalMember(owner = "TDBJVJCU", name = "o", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1379;

    @OriginalMember(owner = "TDBJVJCU", name = "x", descriptor = "Ljava/net/Socket;")
    private Socket field1388;

    @OriginalMember(owner = "TDBJVJCU", name = "H", descriptor = "[B")
    private byte[] field1398;

    @OriginalMember(owner = "TDBJVJCU", name = "b", descriptor = "[I")
    private int[] field1366;

    @OriginalMember(owner = "TDBJVJCU", name = "c", descriptor = "[I")
    private int[] field1367;

    @OriginalMember(owner = "TDBJVJCU", name = "y", descriptor = "[I")
    private int[] field1389;

    @OriginalMember(owner = "TDBJVJCU", name = "A", descriptor = "[I")
    private int[] field1391;

    @OriginalMember(owner = "TDBJVJCU", name = "D", descriptor = "[I")
    private int[] field1394;

    @OriginalMember(owner = "TDBJVJCU", name = "R", descriptor = "[I")
    private int[] field1408;

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "(LBYZSQZUF;Lclient;)V")
    public final void method464(class7 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method29(var3[var4], null);
            int var27 = var26.length / 2;
            class24 var28 = new class24(0, var26);
            this.field1377[var4] = new int[var27];
            this.field1407[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1377[var4][var29] = var28.method240();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method29(var5[var6], null);
            int var23 = var22.length / 4;
            class24 var24 = new class24(0, var22);
            this.field1402[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1402[var6][var25] = var24.method243();
            }
        }
        byte[] var7 = arg0.method29("model_index", null);
        int var8 = this.field1377[0].length;
        this.field1398 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1398[var9] = var7[var9];
            } else {
                this.field1398[var9] = 0;
            }
        }
        byte[] var10 = arg0.method29("map_index", null);
        class24 var11 = new class24(0, var10);
        int var12 = var10.length / 7;
        this.field1366 = new int[var12];
        this.field1408 = new int[var12];
        this.field1389 = new int[var12];
        this.field1367 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1366[var13] = var11.method240();
            this.field1408[var13] = var11.method240();
            this.field1389[var13] = var11.method240();
            this.field1367[var13] = var11.method238();
        }
        byte[] var14 = arg0.method29("anim_index", null);
        class24 var15 = new class24(0, var14);
        int var16 = var14.length / 2;
        this.field1391 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1391[var17] = var15.method240();
        }
        byte[] var18 = arg0.method29("midi_index", null);
        class24 var19 = new class24(0, var18);
        int var20 = var18.length;
        this.field1394 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1394[var21] = var19.method238();
        }
        this.field1395 = arg1;
        this.field1401 = true;
        this.field1395.method36(this, 2);
    }

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "(IIII)I")
    public final int method465(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg0 << 8) + arg1;
        for (int var6 = 0; var6 < this.field1366.length; var6++) {
            if (this.field1366[var6] == var5) {
                if (arg2 == 0) {
                    return this.field1408[var6];
                }
                return this.field1389[var6];
            }
        }
        if (arg3 != 0) {
            this.field1400 = -29;
        }
        return -1;
    }

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "([BZII)Z")
    private final boolean method466(byte[] arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        if (arg1) {
            this.field1405 = !this.field1405;
        }
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field1378.reset();
        this.field1378.update(arg0, 0, var5);
        int var7 = (int) this.field1378.getValue();
        if (arg2 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "(I)V")
    public final void method279(int arg0) {
        this.method469(0, arg0);
    }

    @OriginalMember(owner = "TDBJVJCU", name = "b", descriptor = "(I)I")
    public final int method467(int arg0) {
        if (arg0 != 0) {
            this.field1400 = 239;
        }
        return this.field1391.length;
    }

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "(BIIB)V")
    public final void method468(byte arg0, int arg1, int arg2, byte arg3) {
        if (arg0 != -65) {
            this.field1403 = !this.field1403;
        }
        if (this.field1395.field150[0] == null || this.field1377[arg1][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field1395.field150[arg1 + 1].method427(this.field1385, arg2);
        if (this.method466(var5, false, this.field1377[arg1][arg2], this.field1402[arg1][arg2])) {
            return;
        }
        this.field1407[arg1][arg2] = arg3;
        if (arg3 > this.field1410) {
            this.field1410 = arg3;
        }
        this.field1397++;
    }

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "(II)V")
    public final void method469(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1377.length || arg1 < 0 || arg1 > this.field1377[arg0].length || this.field1377[arg0][arg1] == 0) {
            return;
        }
        class57 var3 = this.field1375;
        synchronized (this.field1375) {
            for (class33 var4 = (class33) this.field1375.method491(); var4 != null; var4 = (class33) this.field1375.method492((byte) -96)) {
                if (var4.field934 == arg0 && var4.field935 == arg1) {
                    return;
                }
            }
            class33 var5 = new class33();
            var5.field934 = arg0;
            var5.field935 = arg1;
            var5.field933 = true;
            class38 var6 = this.field1368;
            synchronized (this.field1368) {
                this.field1368.method379(var5);
            }
            this.field1375.method489(var5);
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "()V")
    public final void method470() {
        this.field1401 = false;
    }

    @OriginalMember(owner = "TDBJVJCU", name = "c", descriptor = "(I)V")
    private final void method471(int arg0) {
        if (arg0 != 1) {
            return;
        }
        try {
            int var2 = this.field1372.available();
            if (this.field1374 == 0 && var2 >= 6) {
                this.field1376 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1372.read(this.field1383, var3, 6 - var3)) {
                }
                int var4 = this.field1383[0] & 0xFF;
                int var5 = ((this.field1383[1] & 0xFF) << 8) + (this.field1383[2] & 0xFF);
                int var6 = ((this.field1383[3] & 0xFF) << 8) + (this.field1383[4] & 0xFF);
                int var7 = this.field1383[5] & 0xFF;
                this.field1382 = null;
                for (class33 var8 = (class33) this.field1399.method382(); var8 != null; var8 = (class33) this.field1399.method384((byte) -96)) {
                    if (var8.field934 == var4 && var8.field935 == var5) {
                        this.field1382 = var8;
                    }
                    if (this.field1382 != null) {
                        var8.field936 = 0;
                    }
                }
                if (this.field1382 != null) {
                    this.field1406 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1382.field937 = null;
                        if (this.field1382.field933) {
                            class38 var9 = this.field1370;
                            synchronized (this.field1370) {
                                this.field1370.method379(this.field1382);
                            }
                        } else {
                            this.field1382.method540();
                        }
                        this.field1382 = null;
                    } else {
                        if (this.field1382.field937 == null && var7 == 0) {
                            this.field1382.field937 = new byte[var6];
                        }
                        if (this.field1382.field937 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1373 = var7 * 500;
                this.field1374 = 500;
                if (this.field1374 > var6 - var7 * 500) {
                    this.field1374 = var6 - var7 * 500;
                }
            }
            if (this.field1374 > 0 && var2 >= this.field1374) {
                this.field1376 = true;
                byte[] var10 = this.field1383;
                int var11 = 0;
                if (this.field1382 != null) {
                    var10 = this.field1382.field937;
                    var11 = this.field1373;
                }
                for (int var12 = 0; var12 < this.field1374; var12 += this.field1372.read(var10, var11 + var12, this.field1374 - var12)) {
                }
                if (this.field1374 + this.field1373 >= var10.length && this.field1382 != null) {
                    if (this.field1395.field150[0] != null) {
                        this.field1395.field150[this.field1382.field934 + 1].method428((byte) -43, this.field1382.field935, var10.length, var10);
                    }
                    if (!this.field1382.field933 && this.field1382.field934 == 3) {
                        this.field1382.field933 = true;
                        this.field1382.field934 = 93;
                    }
                    if (this.field1382.field933) {
                        class38 var13 = this.field1370;
                        synchronized (this.field1370) {
                            this.field1370.method379(this.field1382);
                        }
                    } else {
                        this.field1382.method540();
                    }
                }
                this.field1374 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1388.close();
            } catch (Exception var15) {
            }
            this.field1388 = null;
            this.field1372 = null;
            this.field1379 = null;
            this.field1374 = 0;
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "b", descriptor = "()I")
    public final int method472() {
        class57 var1 = this.field1375;
        synchronized (this.field1375) {
            return this.field1375.method493();
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "(LKRPFBUJX;I)V")
    private final void method473(class33 arg0, int arg1) {
        if (arg1 != 0) {
            this.field1369 = 426;
        }
        try {
            if (this.field1388 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1380 < 4000L) {
                    return;
                }
                this.field1380 = var3;
                this.field1388 = this.field1395.method111(client.field316 + 43594);
                this.field1372 = this.field1388.getInputStream();
                this.field1379 = this.field1388.getOutputStream();
                this.field1379.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1372.read();
                }
                this.field1406 = 0;
            }
            this.field1383[0] = (byte) arg0.field934;
            this.field1383[1] = (byte) (arg0.field935 >> 8);
            this.field1383[2] = (byte) arg0.field935;
            if (arg0.field933) {
                this.field1383[3] = 2;
            } else if (this.field1395.field254) {
                this.field1383[3] = 0;
            } else {
                this.field1383[3] = 1;
            }
            this.field1379.write(this.field1383, 0, 4);
            this.field1404 = 0;
            this.field1409 = -10000;
        } catch (IOException var8) {
            try {
                this.field1388.close();
            } catch (Exception var7) {
            }
            this.field1388 = null;
            this.field1372 = null;
            this.field1379 = null;
            this.field1374 = 0;
            this.field1409++;
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "b", descriptor = "(II)I")
    public final int method474(int arg0, int arg1) {
        int var3 = 40 / arg1;
        return this.field1377[arg0].length;
    }

    @OriginalMember(owner = "TDBJVJCU", name = "d", descriptor = "(I)V")
    public final void method475(int arg0) {
        class38 var2 = this.field1411;
        synchronized (this.field1411) {
            this.field1411.method386();
        }
        while (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "c", descriptor = "()LKRPFBUJX;")
    public final class33 method476() {
        class38 var1 = this.field1370;
        class33 var2;
        synchronized (this.field1370) {
            var2 = (class33) this.field1370.method381();
        }
        if (var2 == null) {
            return null;
        }
        class57 var3 = this.field1375;
        synchronized (this.field1375) {
            var2.method524();
        }
        if (var2.field937 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field937));
            while (true) {
                if (this.field1392.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1392, var4, this.field1392.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field937 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field937[var7] = this.field1392[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "(III)V")
    public final void method477(int arg0, int arg1, int arg2) {
        if (arg1 != 9 || (this.field1395.field150[0] == null || (this.field1377[arg2][arg0] == 0 || (this.field1407[arg2][arg0] == 0 || this.field1410 == 0)))) {
            return;
        }
        class33 var4 = new class33();
        var4.field934 = arg2;
        var4.field935 = arg0;
        var4.field933 = false;
        class38 var5 = this.field1411;
        synchronized (this.field1411) {
            this.field1411.method379(var4);
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "(ZI)V")
    public final void method478(boolean arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1366.length;
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 || this.field1367[var5] != 0) {
                this.method468((byte) -65, 3, this.field1389[var5], (byte) 2);
                this.method468((byte) -65, 3, this.field1408[var5], (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "a", descriptor = "(IB)Z")
    public final boolean method479(int arg0, byte arg1) {
        if (this.field1412 != arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1394[arg0] == 1;
    }

    @OriginalMember(owner = "TDBJVJCU", name = "c", descriptor = "(II)I")
    public final int method480(int arg0, int arg1) {
        return arg0 == 16165 ? this.field1398[arg1] & 0xFF : 2;
    }

    @OriginalMember(owner = "TDBJVJCU", name = "e", descriptor = "(I)V")
    private final void method481(int arg0) {
        if (arg0 <= 0) {
            return;
        }
        class38 var2 = this.field1368;
        class33 var3;
        synchronized (this.field1368) {
            var3 = (class33) this.field1368.method381();
        }
        while (var3 != null) {
            this.field1376 = true;
            byte[] var4 = null;
            if (this.field1395.field150[0] != null) {
                var4 = this.field1395.field150[var3.field934 + 1].method427(this.field1385, var3.field935);
            }
            if (!this.method466(var4, false, this.field1377[var3.field934][var3.field935], this.field1402[var3.field934][var3.field935])) {
                var4 = null;
            }
            class38 var5 = this.field1368;
            synchronized (this.field1368) {
                if (var4 == null) {
                    this.field1365.method379(var3);
                } else {
                    var3.field937 = var4;
                    class38 var6 = this.field1370;
                    synchronized (this.field1370) {
                        this.field1370.method379(var3);
                    }
                }
                var3 = (class33) this.field1368.method381();
            }
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "f", descriptor = "(I)V")
    private final void method482(int arg0) {
        this.field1386 = 0;
        this.field1387 = 0;
        if (arg0 <= 0) {
            this.field1400 = -473;
        }
        for (class33 var2 = (class33) this.field1399.method382(); var2 != null; var2 = (class33) this.field1399.method384((byte) -96)) {
            if (var2.field933) {
                this.field1386++;
            } else {
                this.field1387++;
            }
        }
        while (this.field1386 < 10) {
            class33 var3 = (class33) this.field1365.method381();
            if (var3 == null) {
                break;
            }
            if (this.field1407[var3.field934][var3.field935] != 0) {
                this.field1381++;
            }
            this.field1407[var3.field934][var3.field935] = 0;
            this.field1399.method379(var3);
            this.field1386++;
            this.method473(var3, this.field1390);
            this.field1376 = true;
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1401) {
                this.field1371++;
                byte var1 = 20;
                if (this.field1410 == 0 && this.field1395.field150[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1376 = true;
                for (int var2 = 0; var2 < 100 && this.field1376; var2++) {
                    this.field1376 = false;
                    this.method481(858);
                    this.method482(this.field1393);
                    if (this.field1386 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method484(793);
                    if (this.field1372 != null) {
                        this.method471(1);
                    }
                }
                boolean var3 = false;
                for (class33 var4 = (class33) this.field1399.method382(); var4 != null; var4 = (class33) this.field1399.method384((byte) -96)) {
                    if (var4.field933) {
                        var3 = true;
                        var4.field936++;
                        if (var4.field936 > 50) {
                            var4.field936 = 0;
                            this.method473(var4, this.field1390);
                        }
                    }
                }
                if (!var3) {
                    for (class33 var5 = (class33) this.field1399.method382(); var5 != null; var5 = (class33) this.field1399.method384((byte) -96)) {
                        var3 = true;
                        var5.field936++;
                        if (var5.field936 > 50) {
                            var5.field936 = 0;
                            this.method473(var5, this.field1390);
                        }
                    }
                }
                if (var3) {
                    this.field1406++;
                    if (this.field1406 > 750) {
                        try {
                            this.field1388.close();
                        } catch (Exception var8) {
                        }
                        this.field1388 = null;
                        this.field1372 = null;
                        this.field1379 = null;
                        this.field1374 = 0;
                    }
                } else {
                    this.field1406 = 0;
                    this.field1396 = "";
                }
                if (this.field1395.field254 && this.field1388 != null && this.field1379 != null && (this.field1410 > 0 || this.field1395.field150[0] == null)) {
                    this.field1404++;
                    if (this.field1404 > 500) {
                        this.field1404 = 0;
                        this.field1383[0] = 0;
                        this.field1383[1] = 0;
                        this.field1383[2] = 0;
                        this.field1383[3] = 10;
                        try {
                            this.field1379.write(this.field1383, 0, 4);
                        } catch (IOException var7) {
                            this.field1406 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "TDBJVJCU", name = "d", descriptor = "(II)Z")
    public final boolean method483(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1366.length; var3++) {
            if (this.field1389[var3] == arg1) {
                return true;
            }
        }
        int var4 = 31 / arg0;
        return false;
    }

    @OriginalMember(owner = "TDBJVJCU", name = "g", descriptor = "(I)V")
    private final void method484(int arg0) {
        if (arg0 <= 0) {
            return;
        }
        while (this.field1386 == 0) {
            if (this.field1387 >= 10 || this.field1410 == 0) {
                return;
            }
            class38 var2 = this.field1411;
            class33 var3;
            synchronized (this.field1411) {
                var3 = (class33) this.field1411.method381();
            }
            while (var3 != null) {
                if (this.field1407[var3.field934][var3.field935] != 0) {
                    this.field1407[var3.field934][var3.field935] = 0;
                    this.field1399.method379(var3);
                    this.method473(var3, this.field1390);
                    this.field1376 = true;
                    if (this.field1381 < this.field1397) {
                        this.field1381++;
                    }
                    this.field1396 = "Loading extra files - " + this.field1381 * 100 / this.field1397 + "%";
                    this.field1387++;
                    if (this.field1387 == 10) {
                        return;
                    }
                }
                class38 var4 = this.field1411;
                synchronized (this.field1411) {
                    var3 = (class33) this.field1411.method381();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1407[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1410) {
                        var6[var8] = 0;
                        class33 var9 = new class33();
                        var9.field934 = var5;
                        var9.field935 = var8;
                        var9.field933 = false;
                        this.field1399.method379(var9);
                        this.method473(var9, this.field1390);
                        this.field1376 = true;
                        if (this.field1381 < this.field1397) {
                            this.field1381++;
                        }
                        this.field1396 = "Loading extra files - " + this.field1381 * 100 / this.field1397 + "%";
                        this.field1387++;
                        if (this.field1387 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1410--;
        }
    }
}
