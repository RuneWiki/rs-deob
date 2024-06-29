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

@OriginalClass("client!UCDUMMGN")
public class class58 extends class55 implements Runnable {

    @OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "[B")
    private byte[] field1484 = new byte[500];

    @OriginalMember(owner = "client!UCDUMMGN", name = "i", descriptor = "LWCVCMGLX;")
    private class62 field1491 = new class62(-388);

    @OriginalMember(owner = "client!UCDUMMGN", name = "j", descriptor = "LWCVCMGLX;")
    private class62 field1492 = new class62(-388);

    @OriginalMember(owner = "client!UCDUMMGN", name = "m", descriptor = "Z")
    private boolean field1495 = false;

    @OriginalMember(owner = "client!UCDUMMGN", name = "r", descriptor = "Z")
    private boolean field1500 = true;

    @OriginalMember(owner = "client!UCDUMMGN", name = "s", descriptor = "LWCVCMGLX;")
    private class62 field1501 = new class62(-388);

    @OriginalMember(owner = "client!UCDUMMGN", name = "t", descriptor = "[B")
    private byte[] field1502 = new byte[65000];

    @OriginalMember(owner = "client!UCDUMMGN", name = "v", descriptor = "LWCVCMGLX;")
    private class62 field1504 = new class62(-388);

    @OriginalMember(owner = "client!UCDUMMGN", name = "w", descriptor = "LABNYIQPF;")
    private class2 field1505 = new class2(8);

    @OriginalMember(owner = "client!UCDUMMGN", name = "z", descriptor = "Z")
    private boolean field1508 = true;

    @OriginalMember(owner = "client!UCDUMMGN", name = "A", descriptor = "[[I")
    private int[][] field1509 = new int[4][];

    @OriginalMember(owner = "client!UCDUMMGN", name = "D", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1512 = new CRC32();

    @OriginalMember(owner = "client!UCDUMMGN", name = "E", descriptor = "[[I")
    private int[][] field1513 = new int[4][];

    @OriginalMember(owner = "client!UCDUMMGN", name = "F", descriptor = "Ljava/lang/String;")
    public String field1514 = "";

    @OriginalMember(owner = "client!UCDUMMGN", name = "I", descriptor = "LWCVCMGLX;")
    private class62 field1517 = new class62(-388);

    @OriginalMember(owner = "client!UCDUMMGN", name = "K", descriptor = "[[B")
    private byte[][] field1519 = new byte[4][];

    @OriginalMember(owner = "client!UCDUMMGN", name = "N", descriptor = "Z")
    private boolean field1522 = true;

    @OriginalMember(owner = "client!UCDUMMGN", name = "M", descriptor = "I")
    private static int field1521 = 536;

    @OriginalMember(owner = "client!UCDUMMGN", name = "d", descriptor = "I")
    private int field1486;

    @OriginalMember(owner = "client!UCDUMMGN", name = "e", descriptor = "I")
    private int field1487;

    @OriginalMember(owner = "client!UCDUMMGN", name = "f", descriptor = "I")
    private int field1488;

    @OriginalMember(owner = "client!UCDUMMGN", name = "g", descriptor = "I")
    private int field1489;

    @OriginalMember(owner = "client!UCDUMMGN", name = "p", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!UCDUMMGN", name = "y", descriptor = "I")
    public int field1507;

    @OriginalMember(owner = "client!UCDUMMGN", name = "B", descriptor = "I")
    private int field1510;

    @OriginalMember(owner = "client!UCDUMMGN", name = "G", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "client!UCDUMMGN", name = "H", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "client!UCDUMMGN", name = "J", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!UCDUMMGN", name = "O", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!UCDUMMGN", name = "L", descriptor = "J")
    private long field1520;

    @OriginalMember(owner = "client!UCDUMMGN", name = "C", descriptor = "LHLJPLHON;")
    private class24 field1511;

    @OriginalMember(owner = "client!UCDUMMGN", name = "x", descriptor = "Lclient;")
    private client field1506;

    @OriginalMember(owner = "client!UCDUMMGN", name = "k", descriptor = "Ljava/io/InputStream;")
    private InputStream field1493;

    @OriginalMember(owner = "client!UCDUMMGN", name = "u", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1503;

    @OriginalMember(owner = "client!UCDUMMGN", name = "h", descriptor = "Ljava/net/Socket;")
    private Socket field1490;

    @OriginalMember(owner = "client!UCDUMMGN", name = "o", descriptor = "[B")
    private byte[] field1497;

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "[I")
    private int[] field1483;

    @OriginalMember(owner = "client!UCDUMMGN", name = "c", descriptor = "[I")
    private int[] field1485;

    @OriginalMember(owner = "client!UCDUMMGN", name = "l", descriptor = "[I")
    private int[] field1494;

    @OriginalMember(owner = "client!UCDUMMGN", name = "n", descriptor = "[I")
    private int[] field1496;

    @OriginalMember(owner = "client!UCDUMMGN", name = "q", descriptor = "[I")
    private int[] field1499;

    @OriginalMember(owner = "client!UCDUMMGN", name = "P", descriptor = "[I")
    private int[] field1524;

    @OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "(I)V")
    public final void method523(int arg0) {
        class62 var2 = this.field1492;
        synchronized (this.field1492) {
            this.field1492.method571();
        }
        if (arg0 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(IIZ[B)Z")
    private final boolean method524(int arg0, int arg1, boolean arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field1512.reset();
        if (arg2) {
            this.field1500 = !this.field1500;
        }
        this.field1512.update(arg3, 0, var5);
        int var7 = (int) this.field1512.getValue();
        if (arg0 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(Z)V")
    private final void method525(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field1493.available();
            if (this.field1516 == 0 && var3 >= 6) {
                this.field1495 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field1493.read(this.field1484, var4, 6 - var4)) {
                }
                int var5 = this.field1484[0] & 0xFF;
                int var6 = ((this.field1484[1] & 0xFF) << 8) + (this.field1484[2] & 0xFF);
                int var7 = ((this.field1484[3] & 0xFF) << 8) + (this.field1484[4] & 0xFF);
                int var8 = this.field1484[5] & 0xFF;
                this.field1511 = null;
                for (class24 var9 = (class24) this.field1517.method567(); var9 != null; var9 = (class24) this.field1517.method569(false)) {
                    if (var9.field884 == var5 && var9.field880 == var6) {
                        this.field1511 = var9;
                    }
                    if (this.field1511 != null) {
                        var9.field881 = 0;
                    }
                }
                if (this.field1511 != null) {
                    this.field1498 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field1511.field882 = null;
                        if (this.field1511.field883) {
                            class62 var10 = this.field1501;
                            synchronized (this.field1501) {
                                this.field1501.method564(this.field1511);
                            }
                        } else {
                            this.field1511.method1();
                        }
                        this.field1511 = null;
                    } else {
                        if (this.field1511.field882 == null && var8 == 0) {
                            this.field1511.field882 = new byte[var7];
                        }
                        if (this.field1511.field882 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1515 = var8 * 500;
                this.field1516 = 500;
                if (this.field1516 > var7 - var8 * 500) {
                    this.field1516 = var7 - var8 * 500;
                }
            }
            if (this.field1516 > 0 && var3 >= this.field1516) {
                this.field1495 = true;
                byte[] var11 = this.field1484;
                int var12 = 0;
                if (this.field1511 != null) {
                    var11 = this.field1511.field882;
                    var12 = this.field1515;
                }
                for (int var13 = 0; var13 < this.field1516; var13 += this.field1493.read(var11, var12 + var13, this.field1516 - var13)) {
                }
                if (this.field1516 + this.field1515 >= var11.length && this.field1511 != null) {
                    if (this.field1506.field607[0] != null) {
                        this.field1506.field607[this.field1511.field884 + 1].method334(this.field1511.field880, 0, var11, var11.length);
                    }
                    if (!this.field1511.field883 && this.field1511.field884 == 3) {
                        this.field1511.field883 = true;
                        this.field1511.field884 = 93;
                    }
                    if (this.field1511.field883) {
                        class62 var14 = this.field1501;
                        synchronized (this.field1501) {
                            this.field1501.method564(this.field1511);
                        }
                    } else {
                        this.field1511.method1();
                    }
                }
                this.field1516 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field1490.close();
            } catch (Exception var16) {
            }
            this.field1490 = null;
            this.field1493 = null;
            this.field1503 = null;
            this.field1516 = 0;
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(IZ)Z")
    public final boolean method526(int arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1485[arg0] == 1;
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(BIII)V")
    public final void method527(byte arg0, int arg1, int arg2, int arg3) {
        if (this.field1506.field607[0] == null || this.field1513[arg2][arg1] == 0) {
            return;
        }
        byte[] var5 = this.field1506.field607[arg2 + 1].method333(arg1, -593);
        if (this.method524(this.field1513[arg2][arg1], this.field1509[arg2][arg1], false, var5)) {
            return;
        }
        this.field1519[arg2][arg1] = arg0;
        if (arg3 < 0) {
            if (arg0 > this.field1488) {
                this.field1488 = arg0;
            }
            this.field1523++;
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(LHLJPLHON;I)V")
    private final void method528(class24 arg0, int arg1) {
        if (arg1 < 4 || arg1 > 4) {
            this.field1508 = !this.field1508;
        }
        try {
            if (this.field1490 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1520 < 4000L) {
                    return;
                }
                this.field1520 = var3;
                this.field1490 = this.field1506.method66(client.field291 + 43594);
                this.field1493 = this.field1490.getInputStream();
                this.field1503 = this.field1490.getOutputStream();
                this.field1503.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1493.read();
                }
                this.field1498 = 0;
            }
            this.field1484[0] = (byte) arg0.field884;
            this.field1484[1] = (byte) (arg0.field880 >> 8);
            this.field1484[2] = (byte) arg0.field880;
            if (arg0.field883) {
                this.field1484[3] = 2;
            } else if (this.field1506.field132) {
                this.field1484[3] = 0;
            } else {
                this.field1484[3] = 1;
            }
            this.field1503.write(this.field1484, 0, 4);
            this.field1489 = 0;
            this.field1507 = -10000;
        } catch (IOException var8) {
            try {
                this.field1490.close();
            } catch (Exception var7) {
            }
            this.field1490 = null;
            this.field1493 = null;
            this.field1503 = null;
            this.field1516 = 0;
            this.field1507++;
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "c", descriptor = "(I)V")
    private final void method529(int arg0) {
        this.field1486 = 0;
        this.field1487 = 0;
        class24 var2 = (class24) this.field1517.method567();
        while (arg0 >= 0) {
            this.field1508 = !this.field1508;
        }
        while (var2 != null) {
            if (var2.field883) {
                this.field1486++;
            } else {
                this.field1487++;
            }
            var2 = (class24) this.field1517.method569(false);
        }
        while (this.field1486 < 10) {
            class24 var3 = (class24) this.field1504.method566();
            if (var3 == null) {
                break;
            }
            if (this.field1519[var3.field884][var3.field880] != 0) {
                this.field1510++;
            }
            this.field1519[var3.field884][var3.field880] = 0;
            this.field1517.method564(var3);
            this.field1486++;
            this.method528(var3, 4);
            this.field1495 = true;
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "()I")
    public final int method530() {
        class2 var1 = this.field1505;
        synchronized (this.field1505) {
            return this.field1505.method6();
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1522) {
                this.field1518++;
                byte var1 = 20;
                if (this.field1488 == 0 && this.field1506.field607[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1495 = true;
                for (int var2 = 0; var2 < 100 && this.field1495; var2++) {
                    this.field1495 = false;
                    this.method534(false);
                    this.method529(-104);
                    if (this.field1486 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method539(-591);
                    if (this.field1493 != null) {
                        this.method525(true);
                    }
                }
                boolean var3 = false;
                for (class24 var4 = (class24) this.field1517.method567(); var4 != null; var4 = (class24) this.field1517.method569(false)) {
                    if (var4.field883) {
                        var3 = true;
                        var4.field881++;
                        if (var4.field881 > 50) {
                            var4.field881 = 0;
                            this.method528(var4, 4);
                        }
                    }
                }
                if (!var3) {
                    for (class24 var5 = (class24) this.field1517.method567(); var5 != null; var5 = (class24) this.field1517.method569(false)) {
                        var3 = true;
                        var5.field881++;
                        if (var5.field881 > 50) {
                            var5.field881 = 0;
                            this.method528(var5, 4);
                        }
                    }
                }
                if (var3) {
                    this.field1498++;
                    if (this.field1498 > 750) {
                        try {
                            this.field1490.close();
                        } catch (Exception var8) {
                        }
                        this.field1490 = null;
                        this.field1493 = null;
                        this.field1503 = null;
                        this.field1516 = 0;
                    }
                } else {
                    this.field1498 = 0;
                    this.field1514 = "";
                }
                if (this.field1506.field132 && this.field1490 != null && this.field1503 != null && (this.field1488 > 0 || this.field1506.field607[0] == null)) {
                    this.field1489++;
                    if (this.field1489 > 500) {
                        this.field1489 = 0;
                        this.field1484[0] = 0;
                        this.field1484[1] = 0;
                        this.field1484[2] = 0;
                        this.field1484[3] = 10;
                        try {
                            this.field1503.write(this.field1484, 0, 4);
                        } catch (IOException var7) {
                            this.field1498 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "()V")
    public final void method531() {
        this.field1522 = false;
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(LUUIGNTAD;Lclient;)V")
    public final void method532(class59 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method545(var3[var4], null);
            int var27 = var26.length / 2;
            class10 var28 = new class10(var26, field1521);
            this.field1513[var4] = new int[var27];
            this.field1519[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1513[var4][var29] = var28.method196();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method545(var5[var6], null);
            int var23 = var22.length / 4;
            class10 var24 = new class10(var22, field1521);
            this.field1509[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1509[var6][var25] = var24.method199();
            }
        }
        byte[] var7 = arg0.method545("model_index", null);
        int var8 = this.field1513[0].length;
        this.field1497 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1497[var9] = var7[var9];
            } else {
                this.field1497[var9] = 0;
            }
        }
        byte[] var10 = arg0.method545("map_index", null);
        class10 var11 = new class10(var10, field1521);
        int var12 = var10.length / 7;
        this.field1483 = new int[var12];
        this.field1499 = new int[var12];
        this.field1524 = new int[var12];
        this.field1496 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1483[var13] = var11.method196();
            this.field1499[var13] = var11.method196();
            this.field1524[var13] = var11.method196();
            this.field1496[var13] = var11.method194();
        }
        byte[] var14 = arg0.method545("anim_index", null);
        class10 var15 = new class10(var14, field1521);
        int var16 = var14.length / 2;
        this.field1494 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1494[var17] = var15.method196();
        }
        byte[] var18 = arg0.method545("midi_index", null);
        class10 var19 = new class10(var18, field1521);
        int var20 = var18.length;
        this.field1485 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1485[var21] = var19.method194();
        }
        this.field1506 = arg1;
        this.field1522 = true;
        this.field1506.method97(this, 2);
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "(IZ)V")
    public final void method533(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            return;
        }
        int var3 = this.field1483.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1496[var4] != 0) {
                this.method527((byte) 2, this.field1524[var4], 3, -447);
                this.method527((byte) 2, this.field1499[var4], 3, -447);
            }
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "(Z)V")
    private final void method534(boolean arg0) {
        class62 var2 = this.field1491;
        class24 var3;
        synchronized (this.field1491) {
            var3 = (class24) this.field1491.method566();
        }
        if (arg0) {
            return;
        }
        while (var3 != null) {
            this.field1495 = true;
            byte[] var4 = null;
            if (this.field1506.field607[0] != null) {
                var4 = this.field1506.field607[var3.field884 + 1].method333(var3.field880, -593);
            }
            if (!this.method524(this.field1513[var3.field884][var3.field880], this.field1509[var3.field884][var3.field880], false, var4)) {
                var4 = null;
            }
            class62 var5 = this.field1491;
            synchronized (this.field1491) {
                if (var4 == null) {
                    this.field1504.method564(var3);
                } else {
                    var3.field882 = var4;
                    class62 var6 = this.field1501;
                    synchronized (this.field1501) {
                        this.field1501.method564(var3);
                    }
                }
                var3 = (class24) this.field1491.method566();
            }
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(II)I")
    public final int method535(int arg0, int arg1) {
        return arg0 >= 3 && arg0 <= 3 ? this.field1497[arg1] & 0xFF : 1;
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "c", descriptor = "()LHLJPLHON;")
    public final class24 method536() {
        class62 var1 = this.field1501;
        class24 var2;
        synchronized (this.field1501) {
            var2 = (class24) this.field1501.method566();
        }
        if (var2 == null) {
            return null;
        }
        class2 var3 = this.field1505;
        synchronized (this.field1505) {
            var2.method304();
        }
        if (var2.field882 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field882));
            while (true) {
                if (this.field1502.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1502, var4, this.field1502.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field882 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field882[var7] = this.field1502[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(B)I")
    public final int method537(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            field1521 = 309;
        }
        return this.field1494.length;
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(I)V")
    public final void method501(int arg0) {
        this.method540(0, arg0);
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(IIII)I")
    public final int method538(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 0) {
            return 4;
        }
        int var5 = (arg1 << 8) + arg3;
        for (int var6 = 0; var6 < this.field1483.length; var6++) {
            if (this.field1483[var6] == var5) {
                if (arg2 == 0) {
                    return this.field1499[var6];
                }
                return this.field1524[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "d", descriptor = "(I)V")
    private final void method539(int arg0) {
        while (arg0 >= 0) {
            field1521 = 48;
        }
        while (this.field1486 == 0) {
            if (this.field1487 >= 10 || this.field1488 == 0) {
                return;
            }
            class62 var2 = this.field1492;
            class24 var3;
            synchronized (this.field1492) {
                var3 = (class24) this.field1492.method566();
            }
            while (var3 != null) {
                if (this.field1519[var3.field884][var3.field880] != 0) {
                    this.field1519[var3.field884][var3.field880] = 0;
                    this.field1517.method564(var3);
                    this.method528(var3, 4);
                    this.field1495 = true;
                    if (this.field1510 < this.field1523) {
                        this.field1510++;
                    }
                    this.field1514 = "Loading extra files - " + this.field1510 * 100 / this.field1523 + "%";
                    this.field1487++;
                    if (this.field1487 == 10) {
                        return;
                    }
                }
                class62 var4 = this.field1492;
                synchronized (this.field1492) {
                    var3 = (class24) this.field1492.method566();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1519[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1488) {
                        var6[var8] = 0;
                        class24 var9 = new class24();
                        var9.field884 = var5;
                        var9.field880 = var8;
                        var9.field883 = false;
                        this.field1517.method564(var9);
                        this.method528(var9, 4);
                        this.field1495 = true;
                        if (this.field1510 < this.field1523) {
                            this.field1510++;
                        }
                        this.field1514 = "Loading extra files - " + this.field1510 * 100 / this.field1523 + "%";
                        this.field1487++;
                        if (this.field1487 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1488--;
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "b", descriptor = "(II)V")
    public final void method540(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1513.length || arg1 < 0 || arg1 > this.field1513[arg0].length || this.field1513[arg0][arg1] == 0) {
            return;
        }
        class2 var3 = this.field1505;
        synchronized (this.field1505) {
            for (class24 var4 = (class24) this.field1505.method4(); var4 != null; var4 = (class24) this.field1505.method5(false)) {
                if (var4.field884 == arg0 && var4.field880 == arg1) {
                    return;
                }
            }
            class24 var5 = new class24();
            var5.field884 = arg0;
            var5.field880 = arg1;
            var5.field883 = true;
            class62 var6 = this.field1491;
            synchronized (this.field1491) {
                this.field1491.method564(var5);
            }
            this.field1505.method2(var5);
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(III)V")
    public final void method541(int arg0, int arg1, int arg2) {
        if (this.field1506.field607[0] == null || (this.field1513[arg2][arg0] == 0 || (this.field1519[arg2][arg0] == 0 || this.field1488 == 0))) {
            return;
        }
        class24 var4 = new class24();
        var4.field884 = arg2;
        var4.field880 = arg0;
        var4.field883 = false;
        class62 var5 = this.field1492;
        synchronized (this.field1492) {
            this.field1492.method564(var4);
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "c", descriptor = "(II)I")
    public final int method542(int arg0, int arg1) {
        if (arg1 != -20698) {
            this.field1508 = !this.field1508;
        }
        return this.field1513[arg0].length;
    }

    @OriginalMember(owner = "client!UCDUMMGN", name = "a", descriptor = "(IB)Z")
    public final boolean method543(int arg0, byte arg1) {
        if (arg1 != 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1483.length; var3++) {
            if (this.field1524[var3] == arg0) {
                return true;
            }
        }
        return false;
    }
}
