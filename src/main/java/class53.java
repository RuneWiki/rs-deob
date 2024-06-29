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

@OriginalClass("client!RKMPVAZH")
public class class53 extends class40 implements Runnable {

    @OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "Ljava/lang/String;")
    public String field1459 = "";

    @OriginalMember(owner = "client!RKMPVAZH", name = "d", descriptor = "B")
    private byte field1461 = 9;

    @OriginalMember(owner = "client!RKMPVAZH", name = "e", descriptor = "LIHMCQRZY;")
    private class24 field1462 = new class24(field1504);

    @OriginalMember(owner = "client!RKMPVAZH", name = "f", descriptor = "LIHMCQRZY;")
    private class24 field1463 = new class24(field1504);

    @OriginalMember(owner = "client!RKMPVAZH", name = "i", descriptor = "[[I")
    private int[][] field1466 = new int[4][];

    @OriginalMember(owner = "client!RKMPVAZH", name = "j", descriptor = "LIHMCQRZY;")
    private class24 field1467 = new class24(field1504);

    @OriginalMember(owner = "client!RKMPVAZH", name = "m", descriptor = "LIHMCQRZY;")
    private class24 field1470 = new class24(field1504);

    @OriginalMember(owner = "client!RKMPVAZH", name = "n", descriptor = "[B")
    private byte[] field1471 = new byte[65000];

    @OriginalMember(owner = "client!RKMPVAZH", name = "p", descriptor = "LIHMCQRZY;")
    private class24 field1473 = new class24(field1504);

    @OriginalMember(owner = "client!RKMPVAZH", name = "q", descriptor = "[[I")
    private int[][] field1474 = new int[4][];

    @OriginalMember(owner = "client!RKMPVAZH", name = "r", descriptor = "Z")
    private boolean field1475 = false;

    @OriginalMember(owner = "client!RKMPVAZH", name = "C", descriptor = "Z")
    private boolean field1486 = true;

    @OriginalMember(owner = "client!RKMPVAZH", name = "D", descriptor = "LKZFVEUEL;")
    private class29 field1487 = new class29(9);

    @OriginalMember(owner = "client!RKMPVAZH", name = "E", descriptor = "Z")
    private boolean field1488 = false;

    @OriginalMember(owner = "client!RKMPVAZH", name = "H", descriptor = "[B")
    private byte[] field1491 = new byte[500];

    @OriginalMember(owner = "client!RKMPVAZH", name = "I", descriptor = "[[B")
    private byte[][] field1492 = new byte[4][];

    @OriginalMember(owner = "client!RKMPVAZH", name = "K", descriptor = "Z")
    private boolean field1494 = true;

    @OriginalMember(owner = "client!RKMPVAZH", name = "L", descriptor = "I")
    private int field1495 = 550;

    @OriginalMember(owner = "client!RKMPVAZH", name = "O", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1498 = new CRC32();

    @OriginalMember(owner = "client!RKMPVAZH", name = "P", descriptor = "I")
    private int field1499 = -6404;

    @OriginalMember(owner = "client!RKMPVAZH", name = "S", descriptor = "I")
    private int field1502 = -319;

    @OriginalMember(owner = "client!RKMPVAZH", name = "c", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client!RKMPVAZH", name = "g", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!RKMPVAZH", name = "o", descriptor = "I")
    private int field1472;

    @OriginalMember(owner = "client!RKMPVAZH", name = "v", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!RKMPVAZH", name = "w", descriptor = "I")
    public int field1480;

    @OriginalMember(owner = "client!RKMPVAZH", name = "x", descriptor = "I")
    private int field1481;

    @OriginalMember(owner = "client!RKMPVAZH", name = "y", descriptor = "I")
    private int field1482;

    @OriginalMember(owner = "client!RKMPVAZH", name = "A", descriptor = "I")
    private int field1484;

    @OriginalMember(owner = "client!RKMPVAZH", name = "M", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!RKMPVAZH", name = "N", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!RKMPVAZH", name = "R", descriptor = "I")
    private int field1501;

    @OriginalMember(owner = "client!RKMPVAZH", name = "u", descriptor = "J")
    private long field1478;

    @OriginalMember(owner = "client!RKMPVAZH", name = "G", descriptor = "LHSCHLCCN;")
    private class21 field1490;

    @OriginalMember(owner = "client!RKMPVAZH", name = "k", descriptor = "Lclient;")
    private client field1468;

    @OriginalMember(owner = "client!RKMPVAZH", name = "h", descriptor = "Ljava/io/InputStream;")
    private InputStream field1465;

    @OriginalMember(owner = "client!RKMPVAZH", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1483;

    @OriginalMember(owner = "client!RKMPVAZH", name = "J", descriptor = "Ljava/net/Socket;")
    private Socket field1493;

    @OriginalMember(owner = "client!RKMPVAZH", name = "U", descriptor = "Z")
    private static boolean field1504;

    @OriginalMember(owner = "client!RKMPVAZH", name = "l", descriptor = "[B")
    private byte[] field1469;

    @OriginalMember(owner = "client!RKMPVAZH", name = "s", descriptor = "[I")
    private int[] field1476;

    @OriginalMember(owner = "client!RKMPVAZH", name = "t", descriptor = "[I")
    private int[] field1477;

    @OriginalMember(owner = "client!RKMPVAZH", name = "B", descriptor = "[I")
    private int[] field1485;

    @OriginalMember(owner = "client!RKMPVAZH", name = "F", descriptor = "[I")
    private int[] field1489;

    @OriginalMember(owner = "client!RKMPVAZH", name = "Q", descriptor = "[I")
    private int[] field1500;

    @OriginalMember(owner = "client!RKMPVAZH", name = "T", descriptor = "[I")
    private int[] field1503;

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(I)V")
    public final void method404(int arg0) {
        this.method516(0, arg0);
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "(I)V")
    private final void method498(int arg0) {
        if (arg0 != -6404) {
            this.field1502 = 68;
        }
        while (this.field1481 == 0) {
            if (this.field1482 >= 10 || this.field1501 == 0) {
                return;
            }
            class24 var2 = this.field1473;
            class21 var3;
            synchronized (this.field1473) {
                var3 = (class21) this.field1473.method245();
            }
            while (var3 != null) {
                if (this.field1492[var3.field779][var3.field781] != 0) {
                    this.field1492[var3.field779][var3.field781] = 0;
                    this.field1467.method243(var3);
                    this.method502(550, var3);
                    this.field1488 = true;
                    if (this.field1484 < this.field1472) {
                        this.field1484++;
                    }
                    this.field1459 = "Loading extra files - " + this.field1484 * 100 / this.field1472 + "%";
                    this.field1482++;
                    if (this.field1482 == 10) {
                        return;
                    }
                }
                class24 var4 = this.field1473;
                synchronized (this.field1473) {
                    var3 = (class21) this.field1473.method245();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1492[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1501) {
                        var6[var8] = 0;
                        class21 var9 = new class21();
                        var9.field779 = var5;
                        var9.field781 = var8;
                        var9.field782 = false;
                        this.field1467.method243(var9);
                        this.method502(550, var9);
                        this.field1488 = true;
                        if (this.field1484 < this.field1472) {
                            this.field1484++;
                        }
                        this.field1459 = "Loading extra files - " + this.field1484 * 100 / this.field1472 + "%";
                        this.field1482++;
                        if (this.field1482 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1501--;
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "()I")
    public final int method499() {
        class29 var1 = this.field1487;
        synchronized (this.field1487) {
            return this.field1487.method314();
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1494) {
                this.field1479++;
                byte var1 = 20;
                if (this.field1501 == 0 && this.field1468.field361[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1488 = true;
                for (int var2 = 0; var2 < 100 && this.field1488; var2++) {
                    this.field1488 = false;
                    this.method515(-649);
                    this.method508((byte) -36);
                    if (this.field1481 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method498(this.field1499);
                    if (this.field1465 != null) {
                        this.method500((byte) 6);
                    }
                }
                boolean var3 = false;
                for (class21 var4 = (class21) this.field1467.method246(); var4 != null; var4 = (class21) this.field1467.method248(true)) {
                    if (var4.field782) {
                        var3 = true;
                        var4.field778++;
                        if (var4.field778 > 50) {
                            var4.field778 = 0;
                            this.method502(550, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class21 var5 = (class21) this.field1467.method246(); var5 != null; var5 = (class21) this.field1467.method248(true)) {
                        var3 = true;
                        var5.field778++;
                        if (var5.field778 > 50) {
                            var5.field778 = 0;
                            this.method502(550, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1460++;
                    if (this.field1460 > 750) {
                        try {
                            this.field1493.close();
                        } catch (Exception var8) {
                        }
                        this.field1493 = null;
                        this.field1465 = null;
                        this.field1483 = null;
                        this.field1497 = 0;
                    }
                } else {
                    this.field1460 = 0;
                    this.field1459 = "";
                }
                if (this.field1468.field210 && this.field1493 != null && this.field1483 != null && (this.field1501 > 0 || this.field1468.field361[0] == null)) {
                    this.field1464++;
                    if (this.field1464 > 500) {
                        this.field1464 = 0;
                        this.field1491[0] = 0;
                        this.field1491[1] = 0;
                        this.field1491[2] = 0;
                        this.field1491[3] = 10;
                        try {
                            this.field1483.write(this.field1491, 0, 4);
                        } catch (IOException var7) {
                            this.field1460 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(B)V")
    private final void method500(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field1499 = -384;
        }
        try {
            int var3 = this.field1465.available();
            if (this.field1497 == 0 && var3 >= 6) {
                this.field1488 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field1465.read(this.field1491, var4, 6 - var4)) {
                }
                int var5 = this.field1491[0] & 0xFF;
                int var6 = ((this.field1491[1] & 0xFF) << 8) + (this.field1491[2] & 0xFF);
                int var7 = ((this.field1491[3] & 0xFF) << 8) + (this.field1491[4] & 0xFF);
                int var8 = this.field1491[5] & 0xFF;
                this.field1490 = null;
                for (class21 var9 = (class21) this.field1467.method246(); var9 != null; var9 = (class21) this.field1467.method248(true)) {
                    if (var9.field779 == var5 && var9.field781 == var6) {
                        this.field1490 = var9;
                    }
                    if (this.field1490 != null) {
                        var9.field778 = 0;
                    }
                }
                if (this.field1490 != null) {
                    this.field1460 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field1490.field780 = null;
                        if (this.field1490.field782) {
                            class24 var10 = this.field1463;
                            synchronized (this.field1463) {
                                this.field1463.method243(this.field1490);
                            }
                        } else {
                            this.field1490.method589();
                        }
                        this.field1490 = null;
                    } else {
                        if (this.field1490.field780 == null && var8 == 0) {
                            this.field1490.field780 = new byte[var7];
                        }
                        if (this.field1490.field780 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1496 = var8 * 500;
                this.field1497 = 500;
                if (this.field1497 > var7 - var8 * 500) {
                    this.field1497 = var7 - var8 * 500;
                }
            }
            if (this.field1497 > 0 && var3 >= this.field1497) {
                this.field1488 = true;
                byte[] var11 = this.field1491;
                int var12 = 0;
                if (this.field1490 != null) {
                    var11 = this.field1490.field780;
                    var12 = this.field1496;
                }
                for (int var13 = 0; var13 < this.field1497; var13 += this.field1465.read(var11, var12 + var13, this.field1497 - var13)) {
                }
                if (this.field1497 + this.field1496 >= var11.length && this.field1490 != null) {
                    if (this.field1468.field361[0] != null) {
                        this.field1468.field361[this.field1490.field779 + 1].method489(this.field1490.field781, 192, var11.length, var11);
                    }
                    if (!this.field1490.field782 && this.field1490.field779 == 3) {
                        this.field1490.field782 = true;
                        this.field1490.field779 = 93;
                    }
                    if (this.field1490.field782) {
                        class24 var14 = this.field1463;
                        synchronized (this.field1463) {
                            this.field1463.method243(this.field1490);
                        }
                    } else {
                        this.field1490.method589();
                    }
                }
                this.field1497 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field1493.close();
            } catch (Exception var16) {
            }
            this.field1493 = null;
            this.field1465 = null;
            this.field1483 = null;
            this.field1497 = 0;
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(IBIB)V")
    public final void method501(int arg0, byte arg1, int arg2, byte arg3) {
        if (this.field1468.field361[0] == null || this.field1466[arg0][arg2] == 0) {
            return;
        }
        byte[] var5 = this.field1468.field361[arg0 + 1].method488(403, arg2);
        if (this.method512(var5, this.field1466[arg0][arg2], -250, this.field1474[arg0][arg2])) {
            return;
        }
        this.field1492[arg0][arg2] = arg1;
        if (arg3 != 9) {
            this.field1502 = -138;
        }
        if (arg1 > this.field1501) {
            this.field1501 = arg1;
        }
        this.field1472++;
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(ILHSCHLCCN;)V")
    private final void method502(int arg0, class21 arg1) {
        int var3 = 71 / arg0;
        try {
            if (this.field1493 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field1478 < 4000L) {
                    return;
                }
                this.field1478 = var4;
                this.field1493 = this.field1468.method177(client.field377 + 43594);
                this.field1465 = this.field1493.getInputStream();
                this.field1483 = this.field1493.getOutputStream();
                this.field1483.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field1465.read();
                }
                this.field1460 = 0;
            }
            this.field1491[0] = (byte) arg1.field779;
            this.field1491[1] = (byte) (arg1.field781 >> 8);
            this.field1491[2] = (byte) arg1.field781;
            if (arg1.field782) {
                this.field1491[3] = 2;
            } else if (this.field1468.field210) {
                this.field1491[3] = 0;
            } else {
                this.field1491[3] = 1;
            }
            this.field1483.write(this.field1491, 0, 4);
            this.field1464 = 0;
            this.field1480 = -10000;
        } catch (IOException var9) {
            try {
                this.field1493.close();
            } catch (Exception var8) {
            }
            this.field1493 = null;
            this.field1465 = null;
            this.field1483 = null;
            this.field1497 = 0;
            this.field1480++;
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(ZI)Z")
    public final boolean method503(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1477[arg1] == 1;
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(IB)I")
    public final int method504(int arg0, byte arg1) {
        if (arg1 != -98) {
            this.field1502 = 214;
        }
        return this.field1469[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(LIEMHZJLX;Lclient;)V")
    public final void method505(class23 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method242(var3[var4], null);
            int var27 = var26.length / 2;
            class38 var28 = new class38(0, var26);
            this.field1466[var4] = new int[var27];
            this.field1492[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1466[var4][var29] = var28.method359();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method242(var5[var6], null);
            int var23 = var22.length / 4;
            class38 var24 = new class38(0, var22);
            this.field1474[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1474[var6][var25] = var24.method362();
            }
        }
        byte[] var7 = arg0.method242("model_index", null);
        int var8 = this.field1466[0].length;
        this.field1469 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1469[var9] = var7[var9];
            } else {
                this.field1469[var9] = 0;
            }
        }
        byte[] var10 = arg0.method242("map_index", null);
        class38 var11 = new class38(0, var10);
        int var12 = var10.length / 7;
        this.field1500 = new int[var12];
        this.field1489 = new int[var12];
        this.field1476 = new int[var12];
        this.field1503 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1500[var13] = var11.method359();
            this.field1489[var13] = var11.method359();
            this.field1476[var13] = var11.method359();
            this.field1503[var13] = var11.method357();
        }
        byte[] var14 = arg0.method242("anim_index", null);
        class38 var15 = new class38(0, var14);
        int var16 = var14.length / 2;
        this.field1485 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1485[var17] = var15.method359();
        }
        byte[] var18 = arg0.method242("midi_index", null);
        class38 var19 = new class38(0, var18);
        int var20 = var18.length;
        this.field1477 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1477[var21] = var19.method357();
        }
        this.field1468 = arg1;
        this.field1494 = true;
        this.field1468.method169(this, 2);
        if (class66.field1692) {
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(Z)I")
    public final int method506(boolean arg0) {
        if (arg0) {
            this.field1475 = !this.field1475;
        }
        return this.field1485.length;
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(IIIZ)I")
    public final int method507(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            this.field1475 = !this.field1475;
        }
        int var5 = (arg1 << 8) + arg2;
        for (int var6 = 0; var6 < this.field1500.length; var6++) {
            if (this.field1500[var6] == var5) {
                if (arg0 == 0) {
                    return this.field1489[var6];
                }
                return this.field1476[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "(B)V")
    private final void method508(byte arg0) {
        this.field1481 = 0;
        if (arg0 != -36) {
            this.field1499 = -5;
        }
        this.field1482 = 0;
        for (class21 var2 = (class21) this.field1467.method246(); var2 != null; var2 = (class21) this.field1467.method248(true)) {
            if (var2.field782) {
                this.field1481++;
            } else {
                this.field1482++;
            }
        }
        while (this.field1481 < 10) {
            class21 var3 = (class21) this.field1470.method245();
            if (var3 == null) {
                break;
            }
            if (this.field1492[var3.field779][var3.field781] != 0) {
                this.field1484++;
            }
            this.field1492[var3.field779][var3.field781] = 0;
            this.field1467.method243(var3);
            this.field1481++;
            this.method502(550, var3);
            this.field1488 = true;
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "()LHSCHLCCN;")
    public final class21 method509() {
        class24 var1 = this.field1463;
        class21 var2;
        synchronized (this.field1463) {
            var2 = (class21) this.field1463.method245();
        }
        if (var2 == null) {
            return null;
        }
        class29 var3 = this.field1487;
        synchronized (this.field1487) {
            var2.method344();
        }
        if (var2.field780 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field780));
            while (true) {
                if (this.field1471.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1471, var4, this.field1471.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field780 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field780[var7] = this.field1471[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(IZ)V")
    public final void method510(int arg0, boolean arg1) {
        int var3 = this.field1500.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1503[var4] != 0) {
                this.method501(3, (byte) 2, this.field1476[var4], this.field1461);
                this.method501(3, (byte) 2, this.field1489[var4], this.field1461);
            }
        }
        if (arg0 == 3) {
            ;
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "c", descriptor = "()V")
    public final void method511() {
        this.field1494 = false;
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "([BIII)Z")
    private final boolean method512(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field1498.reset();
        this.field1498.update(arg0, 0, var5);
        int var7 = (int) this.field1498.getValue();
        if (arg2 >= 0) {
            throw new NullPointerException();
        } else if (arg1 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(II)Z")
    public final boolean method513(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1500.length; var3++) {
            if (this.field1476[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != 0) {
            this.field1486 = !this.field1486;
        }
        return false;
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "(ZI)I")
    public final int method514(boolean arg0, int arg1) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1466[arg1].length;
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "c", descriptor = "(I)V")
    private final void method515(int arg0) {
        class24 var2 = this.field1462;
        class21 var3;
        synchronized (this.field1462) {
            var3 = (class21) this.field1462.method245();
        }
        if (arg0 >= 0) {
            return;
        }
        while (var3 != null) {
            this.field1488 = true;
            byte[] var4 = null;
            if (this.field1468.field361[0] != null) {
                var4 = this.field1468.field361[var3.field779 + 1].method488(403, var3.field781);
            }
            if (!this.method512(var4, this.field1466[var3.field779][var3.field781], -250, this.field1474[var3.field779][var3.field781])) {
                var4 = null;
            }
            class24 var5 = this.field1462;
            synchronized (this.field1462) {
                if (var4 == null) {
                    this.field1470.method243(var3);
                } else {
                    var3.field780 = var4;
                    class24 var6 = this.field1463;
                    synchronized (this.field1463) {
                        this.field1463.method243(var3);
                    }
                }
                var3 = (class21) this.field1462.method245();
            }
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "(II)V")
    public final void method516(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1466.length || arg1 < 0 || arg1 > this.field1466[arg0].length || this.field1466[arg0][arg1] == 0) {
            return;
        }
        class29 var3 = this.field1487;
        synchronized (this.field1487) {
            for (class21 var4 = (class21) this.field1487.method312(); var4 != null; var4 = (class21) this.field1487.method313(true)) {
                if (var4.field779 == arg0 && var4.field781 == arg1) {
                    return;
                }
            }
            class21 var5 = new class21();
            var5.field779 = arg0;
            var5.field781 = arg1;
            var5.field782 = true;
            class24 var6 = this.field1462;
            synchronized (this.field1462) {
                this.field1462.method243(var5);
            }
            this.field1487.method310(var5);
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "a", descriptor = "(BII)V")
    public final void method517(byte arg0, int arg1, int arg2) {
        if (this.field1468.field361[0] == null || (this.field1466[arg2][arg1] == 0 || (this.field1492[arg2][arg1] == 0 || this.field1501 == 0))) {
            return;
        }
        class21 var4 = new class21();
        var4.field779 = arg2;
        var4.field781 = arg1;
        var4.field782 = false;
        class24 var5 = this.field1473;
        synchronized (this.field1473) {
            this.field1473.method243(var4);
        }
        if (arg0 == 4) {
            ;
        }
    }

    @OriginalMember(owner = "client!RKMPVAZH", name = "b", descriptor = "(Z)V")
    public final void method518(boolean arg0) {
        class24 var2 = this.field1473;
        synchronized (this.field1473) {
            this.field1473.method250();
        }
        if (arg0) {
            ;
        }
    }
}
