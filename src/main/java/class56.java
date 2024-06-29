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

@OriginalClass("client!UWINSVPX")
public class class56 extends class30 implements Runnable {

    @OriginalMember(owner = "client!UWINSVPX", name = "b", descriptor = "[[I")
    private int[][] field1492 = new int[4][];

    @OriginalMember(owner = "client!UWINSVPX", name = "e", descriptor = "Z")
    private boolean field1495 = false;

    @OriginalMember(owner = "client!UWINSVPX", name = "n", descriptor = "[B")
    private byte[] field1504 = new byte[65000];

    @OriginalMember(owner = "client!UWINSVPX", name = "r", descriptor = "LWOVRPCGT;")
    private class61 field1508 = new class61(-270);

    @OriginalMember(owner = "client!UWINSVPX", name = "s", descriptor = "[[B")
    private byte[][] field1509 = new byte[4][];

    @OriginalMember(owner = "client!UWINSVPX", name = "u", descriptor = "I")
    private int field1511 = 6;

    @OriginalMember(owner = "client!UWINSVPX", name = "v", descriptor = "Z")
    private boolean field1512 = false;

    @OriginalMember(owner = "client!UWINSVPX", name = "w", descriptor = "LWOVRPCGT;")
    private class61 field1513 = new class61(-270);

    @OriginalMember(owner = "client!UWINSVPX", name = "z", descriptor = "I")
    private int field1516 = 170;

    @OriginalMember(owner = "client!UWINSVPX", name = "C", descriptor = "[[I")
    private int[][] field1519 = new int[4][];

    @OriginalMember(owner = "client!UWINSVPX", name = "D", descriptor = "Z")
    private boolean field1520 = true;

    @OriginalMember(owner = "client!UWINSVPX", name = "H", descriptor = "Z")
    private boolean field1524 = true;

    @OriginalMember(owner = "client!UWINSVPX", name = "I", descriptor = "LWOVRPCGT;")
    private class61 field1525 = new class61(-270);

    @OriginalMember(owner = "client!UWINSVPX", name = "K", descriptor = "LWOVRPCGT;")
    private class61 field1527 = new class61(-270);

    @OriginalMember(owner = "client!UWINSVPX", name = "L", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1528 = new CRC32();

    @OriginalMember(owner = "client!UWINSVPX", name = "M", descriptor = "Ljava/lang/String;")
    public String field1529 = "";

    @OriginalMember(owner = "client!UWINSVPX", name = "O", descriptor = "LISCMIAJK;")
    private class27 field1531 = new class27(true);

    @OriginalMember(owner = "client!UWINSVPX", name = "Q", descriptor = "[B")
    private byte[] field1533 = new byte[500];

    @OriginalMember(owner = "client!UWINSVPX", name = "R", descriptor = "LWOVRPCGT;")
    private class61 field1534 = new class61(-270);

    @OriginalMember(owner = "client!UWINSVPX", name = "f", descriptor = "I")
    private int field1496;

    @OriginalMember(owner = "client!UWINSVPX", name = "g", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "client!UWINSVPX", name = "h", descriptor = "I")
    private int field1498;

    @OriginalMember(owner = "client!UWINSVPX", name = "j", descriptor = "I")
    private int field1500;

    @OriginalMember(owner = "client!UWINSVPX", name = "m", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "client!UWINSVPX", name = "p", descriptor = "I")
    private int field1506;

    @OriginalMember(owner = "client!UWINSVPX", name = "q", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "client!UWINSVPX", name = "x", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "client!UWINSVPX", name = "F", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!UWINSVPX", name = "J", descriptor = "I")
    private int field1526;

    @OriginalMember(owner = "client!UWINSVPX", name = "P", descriptor = "I")
    private int field1532;

    @OriginalMember(owner = "client!UWINSVPX", name = "B", descriptor = "J")
    private long field1518;

    @OriginalMember(owner = "client!UWINSVPX", name = "t", descriptor = "LVLOPFRWW;")
    private class59 field1510;

    @OriginalMember(owner = "client!UWINSVPX", name = "l", descriptor = "Lclient;")
    private client field1502;

    @OriginalMember(owner = "client!UWINSVPX", name = "o", descriptor = "Ljava/io/InputStream;")
    private InputStream field1505;

    @OriginalMember(owner = "client!UWINSVPX", name = "c", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1493;

    @OriginalMember(owner = "client!UWINSVPX", name = "E", descriptor = "Ljava/net/Socket;")
    private Socket field1521;

    @OriginalMember(owner = "client!UWINSVPX", name = "d", descriptor = "[B")
    private byte[] field1494;

    @OriginalMember(owner = "client!UWINSVPX", name = "i", descriptor = "[I")
    private int[] field1499;

    @OriginalMember(owner = "client!UWINSVPX", name = "k", descriptor = "[I")
    private int[] field1501;

    @OriginalMember(owner = "client!UWINSVPX", name = "y", descriptor = "[I")
    private int[] field1515;

    @OriginalMember(owner = "client!UWINSVPX", name = "A", descriptor = "[I")
    private int[] field1517;

    @OriginalMember(owner = "client!UWINSVPX", name = "G", descriptor = "[I")
    private int[] field1523;

    @OriginalMember(owner = "client!UWINSVPX", name = "N", descriptor = "[I")
    private int[] field1530;

    @OriginalMember(owner = "client!UWINSVPX", name = "b", descriptor = "(I)V")
    public final void method517(int arg0) {
        if (arg0 == 0) {
            class61 var2 = this.field1513;
            synchronized (this.field1513) {
                this.field1513.method547();
            }
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(ILVLOPFRWW;)V")
    private final void method518(int arg0, class59 arg1) {
        if (arg0 != 0) {
            this.field1516 = 102;
        }
        try {
            if (this.field1521 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1518 < 4000L) {
                    return;
                }
                this.field1518 = var3;
                this.field1521 = this.field1502.method29(client.field384 + 43594);
                this.field1505 = this.field1521.getInputStream();
                this.field1493 = this.field1521.getOutputStream();
                this.field1493.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1505.read();
                }
                this.field1498 = 0;
            }
            this.field1533[0] = (byte) arg1.field1564;
            this.field1533[1] = (byte) (arg1.field1562 >> 8);
            this.field1533[2] = (byte) arg1.field1562;
            if (arg1.field1565) {
                this.field1533[3] = 2;
            } else if (this.field1502.field405) {
                this.field1533[3] = 0;
            } else {
                this.field1533[3] = 1;
            }
            this.field1493.write(this.field1533, 0, 4);
            this.field1532 = 0;
            this.field1522 = -10000;
        } catch (IOException var8) {
            try {
                this.field1521.close();
            } catch (Exception var7) {
            }
            this.field1521 = null;
            this.field1505 = null;
            this.field1493 = null;
            this.field1507 = 0;
            this.field1522++;
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(IBII)I")
    public final int method519(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = (arg0 << 8) + arg2;
        if (arg1 != -105) {
            return 3;
        }
        for (int var6 = 0; var6 < this.field1523.length; var6++) {
            if (this.field1523[var6] == var5) {
                if (arg3 == 0) {
                    return this.field1530[var6];
                }
                return this.field1515[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "c", descriptor = "(I)V")
    private final void method520(int arg0) {
        class61 var2 = this.field1508;
        class59 var3;
        synchronized (this.field1508) {
            var3 = (class59) this.field1508.method542();
        }
        if (this.field1511 != arg0) {
            this.field1495 = !this.field1495;
        }
        while (var3 != null) {
            this.field1512 = true;
            byte[] var4 = null;
            if (this.field1502.field467[0] != null) {
                var4 = this.field1502.field467[var3.field1564 + 1].method548(var3.field1562, 0);
            }
            if (!this.method524(-98, this.field1519[var3.field1564][var3.field1562], this.field1492[var3.field1564][var3.field1562], var4)) {
                var4 = null;
            }
            class61 var5 = this.field1508;
            synchronized (this.field1508) {
                if (var4 == null) {
                    this.field1525.method540(var3);
                } else {
                    var3.field1563 = var4;
                    class61 var6 = this.field1527;
                    synchronized (this.field1527) {
                        this.field1527.method540(var3);
                    }
                }
                var3 = (class59) this.field1508.method542();
            }
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(II)Z")
    public final boolean method521(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1523.length; var3++) {
            if (this.field1515[var3] == arg1) {
                return true;
            }
        }
        if (arg0 != -13551) {
            this.field1516 = -356;
        }
        return false;
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "b", descriptor = "(II)Z")
    public final boolean method522(int arg0, int arg1) {
        if (arg1 != 8884) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1517[arg0] == 1;
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "d", descriptor = "(I)V")
    private final void method523(int arg0) {
        this.field1496 = 0;
        this.field1497 = 0;
        class59 var2 = (class59) this.field1534.method543();
        if (arg0 != 0) {
            this.field1524 = !this.field1524;
        }
        while (var2 != null) {
            if (var2.field1565) {
                this.field1496++;
            } else {
                this.field1497++;
            }
            var2 = (class59) this.field1534.method545(907);
        }
        while (this.field1496 < 10) {
            class59 var3 = (class59) this.field1525.method542();
            if (var3 == null) {
                break;
            }
            if (this.field1509[var3.field1564][var3.field1562] != 0) {
                this.field1500++;
            }
            this.field1509[var3.field1564][var3.field1562] = 0;
            this.field1534.method540(var3);
            this.field1496++;
            this.method518(0, var3);
            this.field1512 = true;
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(III[B)Z")
    private final boolean method524(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        this.field1528.reset();
        this.field1528.update(arg3, 0, var5);
        int var7 = (int) this.field1528.getValue();
        if (arg1 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(ZI)I")
    public final int method525(boolean arg0, int arg1) {
        return arg0 ? this.field1516 : this.field1494[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "()I")
    public final int method526() {
        class27 var1 = this.field1531;
        synchronized (this.field1531) {
            return this.field1531.method311();
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(III)V")
    public final void method527(int arg0, int arg1, int arg2) {
        if (arg2 != 1 || (this.field1502.field467[0] == null || (this.field1519[arg1][arg0] == 0 || (this.field1509[arg1][arg0] == 0 || this.field1526 == 0)))) {
            return;
        }
        class59 var4 = new class59();
        var4.field1564 = arg1;
        var4.field1562 = arg0;
        var4.field1565 = false;
        class61 var5 = this.field1513;
        synchronized (this.field1513) {
            this.field1513.method540(var4);
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "e", descriptor = "(I)I")
    public final int method528(int arg0) {
        int var2 = 71 / arg0;
        return this.field1499.length;
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "b", descriptor = "()V")
    public final void method529() {
        this.field1520 = false;
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(B)V")
    private final void method530(byte arg0) {
        if (arg0 != 7) {
            return;
        }
        boolean var2 = false;
        try {
            int var3 = this.field1505.available();
            if (this.field1507 == 0 && var3 >= 6) {
                this.field1512 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field1505.read(this.field1533, var4, 6 - var4)) {
                }
                int var5 = this.field1533[0] & 0xFF;
                int var6 = ((this.field1533[1] & 0xFF) << 8) + (this.field1533[2] & 0xFF);
                int var7 = ((this.field1533[3] & 0xFF) << 8) + (this.field1533[4] & 0xFF);
                int var8 = this.field1533[5] & 0xFF;
                this.field1510 = null;
                for (class59 var9 = (class59) this.field1534.method543(); var9 != null; var9 = (class59) this.field1534.method545(907)) {
                    if (var9.field1564 == var5 && var9.field1562 == var6) {
                        this.field1510 = var9;
                    }
                    if (this.field1510 != null) {
                        var9.field1566 = 0;
                    }
                }
                if (this.field1510 != null) {
                    this.field1498 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field1510.field1563 = null;
                        if (this.field1510.field1565) {
                            class61 var10 = this.field1527;
                            synchronized (this.field1527) {
                                this.field1527.method540(this.field1510);
                            }
                        } else {
                            this.field1510.method14();
                        }
                        this.field1510 = null;
                    } else {
                        if (this.field1510.field1563 == null && var8 == 0) {
                            this.field1510.field1563 = new byte[var7];
                        }
                        if (this.field1510.field1563 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1506 = var8 * 500;
                this.field1507 = 500;
                if (this.field1507 > var7 - var8 * 500) {
                    this.field1507 = var7 - var8 * 500;
                }
            }
            if (this.field1507 > 0 && var3 >= this.field1507) {
                this.field1512 = true;
                byte[] var11 = this.field1533;
                int var12 = 0;
                if (this.field1510 != null) {
                    var11 = this.field1510.field1563;
                    var12 = this.field1506;
                }
                for (int var13 = 0; var13 < this.field1507; var13 += this.field1505.read(var11, var12 + var13, this.field1507 - var13)) {
                }
                if (this.field1507 + this.field1506 >= var11.length && this.field1510 != null) {
                    if (this.field1502.field467[0] != null) {
                        this.field1502.field467[this.field1510.field1564 + 1].method549(var11, -27531, this.field1510.field1562, var11.length);
                    }
                    if (!this.field1510.field1565 && this.field1510.field1564 == 3) {
                        this.field1510.field1565 = true;
                        this.field1510.field1564 = 93;
                    }
                    if (this.field1510.field1565) {
                        class61 var14 = this.field1527;
                        synchronized (this.field1527) {
                            this.field1527.method540(this.field1510);
                        }
                    } else {
                        this.field1510.method14();
                    }
                }
                this.field1507 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field1521.close();
            } catch (Exception var16) {
            }
            this.field1521 = null;
            this.field1505 = null;
            this.field1493 = null;
            this.field1507 = 0;
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(BI)I")
    public final int method531(byte arg0, int arg1) {
        return arg0 == 69 ? this.field1519[arg1].length : 4;
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "b", descriptor = "(ZI)V")
    public final void method532(boolean arg0, int arg1) {
        if (arg1 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        int var4 = this.field1523.length;
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 || this.field1501[var5] != 0) {
                this.method536(3, this.field1515[var5], (byte) 0, (byte) 2);
                this.method536(3, this.field1530[var5], (byte) 0, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "c", descriptor = "(II)V")
    public final void method533(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1519.length || arg1 < 0 || arg1 > this.field1519[arg0].length || this.field1519[arg0][arg1] == 0) {
            return;
        }
        class27 var3 = this.field1531;
        synchronized (this.field1531) {
            for (class59 var4 = (class59) this.field1531.method309(); var4 != null; var4 = (class59) this.field1531.method310(907)) {
                if (var4.field1564 == arg0 && var4.field1562 == arg1) {
                    return;
                }
            }
            class59 var5 = new class59();
            var5.field1564 = arg0;
            var5.field1562 = arg1;
            var5.field1565 = true;
            class61 var6 = this.field1508;
            synchronized (this.field1508) {
                this.field1508.method540(var5);
            }
            this.field1531.method307(var5);
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "c", descriptor = "()LVLOPFRWW;")
    public final class59 method534() {
        class61 var1 = this.field1527;
        class59 var2;
        synchronized (this.field1527) {
            var2 = (class59) this.field1527.method542();
        }
        if (var2 == null) {
            return null;
        }
        class27 var3 = this.field1531;
        synchronized (this.field1531) {
            var2.method432();
        }
        if (var2.field1563 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1563));
            while (true) {
                if (this.field1504.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1504, var4, this.field1504.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1563 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1563[var7] = this.field1504[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1520) {
                this.field1503++;
                byte var1 = 20;
                if (this.field1526 == 0 && this.field1502.field467[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1512 = true;
                for (int var2 = 0; var2 < 100 && this.field1512; var2++) {
                    this.field1512 = false;
                    this.method520(6);
                    this.method523(0);
                    if (this.field1496 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method535(true);
                    if (this.field1505 != null) {
                        this.method530((byte) 7);
                    }
                }
                boolean var3 = false;
                for (class59 var4 = (class59) this.field1534.method543(); var4 != null; var4 = (class59) this.field1534.method545(907)) {
                    if (var4.field1565) {
                        var3 = true;
                        var4.field1566++;
                        if (var4.field1566 > 50) {
                            var4.field1566 = 0;
                            this.method518(0, var4);
                        }
                    }
                }
                if (!var3) {
                    for (class59 var5 = (class59) this.field1534.method543(); var5 != null; var5 = (class59) this.field1534.method545(907)) {
                        var3 = true;
                        var5.field1566++;
                        if (var5.field1566 > 50) {
                            var5.field1566 = 0;
                            this.method518(0, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1498++;
                    if (this.field1498 > 750) {
                        try {
                            this.field1521.close();
                        } catch (Exception var8) {
                        }
                        this.field1521 = null;
                        this.field1505 = null;
                        this.field1493 = null;
                        this.field1507 = 0;
                    }
                } else {
                    this.field1498 = 0;
                    this.field1529 = "";
                }
                if (this.field1502.field405 && this.field1521 != null && this.field1493 != null && (this.field1526 > 0 || this.field1502.field467[0] == null)) {
                    this.field1532++;
                    if (this.field1532 > 500) {
                        this.field1532 = 0;
                        this.field1533[0] = 0;
                        this.field1533[1] = 0;
                        this.field1533[2] = 0;
                        this.field1533[3] = 10;
                        try {
                            this.field1493.write(this.field1533, 0, 4);
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

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(Z)V")
    private final void method535(boolean arg0) {
        if (!arg0) {
            this.field1511 = -190;
        }
        while (this.field1496 == 0) {
            if (this.field1497 >= 10 || this.field1526 == 0) {
                return;
            }
            class61 var2 = this.field1513;
            class59 var3;
            synchronized (this.field1513) {
                var3 = (class59) this.field1513.method542();
            }
            while (var3 != null) {
                if (this.field1509[var3.field1564][var3.field1562] != 0) {
                    this.field1509[var3.field1564][var3.field1562] = 0;
                    this.field1534.method540(var3);
                    this.method518(0, var3);
                    this.field1512 = true;
                    if (this.field1500 < this.field1514) {
                        this.field1500++;
                    }
                    this.field1529 = "Loading extra files - " + this.field1500 * 100 / this.field1514 + "%";
                    this.field1497++;
                    if (this.field1497 == 10) {
                        return;
                    }
                }
                class61 var4 = this.field1513;
                synchronized (this.field1513) {
                    var3 = (class59) this.field1513.method542();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1509[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1526) {
                        var6[var8] = 0;
                        class59 var9 = new class59();
                        var9.field1564 = var5;
                        var9.field1562 = var8;
                        var9.field1565 = false;
                        this.field1534.method540(var9);
                        this.method518(0, var9);
                        this.field1512 = true;
                        if (this.field1500 < this.field1514) {
                            this.field1500++;
                        }
                        this.field1529 = "Loading extra files - " + this.field1500 * 100 / this.field1514 + "%";
                        this.field1497++;
                        if (this.field1497 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1526--;
        }
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(IIBB)V")
    public final void method536(int arg0, int arg1, byte arg2, byte arg3) {
        if (arg2 != 0) {
            return;
        }
        boolean var5 = false;
        if (this.field1502.field467[0] == null || this.field1519[arg0][arg1] == 0) {
            return;
        }
        byte[] var6 = this.field1502.field467[arg0 + 1].method548(arg1, 0);
        if (this.method524(-98, this.field1519[arg0][arg1], this.field1492[arg0][arg1], var6)) {
            return;
        }
        this.field1509[arg0][arg1] = arg3;
        if (arg3 > this.field1526) {
            this.field1526 = arg3;
        }
        this.field1514++;
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(LNXFIIFAD;Lclient;)V")
    public final void method537(class41 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method431(var3[var4], null);
            int var27 = var26.length / 2;
            class37 var28 = new class37(var26, -670);
            this.field1519[var4] = new int[var27];
            this.field1509[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1519[var4][var29] = var28.method388();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method431(var5[var6], null);
            int var23 = var22.length / 4;
            class37 var24 = new class37(var22, -670);
            this.field1492[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1492[var6][var25] = var24.method391();
            }
        }
        byte[] var7 = arg0.method431("model_index", null);
        int var8 = this.field1519[0].length;
        this.field1494 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1494[var9] = var7[var9];
            } else {
                this.field1494[var9] = 0;
            }
        }
        byte[] var10 = arg0.method431("map_index", null);
        class37 var11 = new class37(var10, -670);
        int var12 = var10.length / 7;
        this.field1523 = new int[var12];
        this.field1530 = new int[var12];
        this.field1515 = new int[var12];
        this.field1501 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1523[var13] = var11.method388();
            this.field1530[var13] = var11.method388();
            this.field1515[var13] = var11.method388();
            this.field1501[var13] = var11.method386();
        }
        byte[] var14 = arg0.method431("anim_index", null);
        class37 var15 = new class37(var14, -670);
        int var16 = var14.length / 2;
        this.field1499 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1499[var17] = var15.method388();
        }
        byte[] var18 = arg0.method431("midi_index", null);
        class37 var19 = new class37(var18, -670);
        int var20 = var18.length;
        this.field1517 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1517[var21] = var19.method386();
        }
        this.field1502 = arg1;
        this.field1520 = true;
        this.field1502.method12(this, 2);
    }

    @OriginalMember(owner = "client!UWINSVPX", name = "a", descriptor = "(I)V")
    public final void method316(int arg0) {
        this.method533(0, arg0);
    }
}
