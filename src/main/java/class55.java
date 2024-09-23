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

@OriginalClass("VNVHYJAS")
public class class55 extends class16 implements Runnable {

    @OriginalMember(owner = "VNVHYJAS", name = "c", descriptor = "I")
    private int field1498 = 12536;

    @OriginalMember(owner = "VNVHYJAS", name = "d", descriptor = "[[I")
    private int[][] field1499 = new int[4][];

    @OriginalMember(owner = "VNVHYJAS", name = "f", descriptor = "[[I")
    private int[][] field1501 = new int[4][];

    @OriginalMember(owner = "VNVHYJAS", name = "g", descriptor = "I")
    private int field1502 = -867;

    @OriginalMember(owner = "VNVHYJAS", name = "k", descriptor = "[B")
    private byte[] field1506 = new byte[65000];

    @OriginalMember(owner = "VNVHYJAS", name = "l", descriptor = "Z")
    private boolean field1507 = true;

    @OriginalMember(owner = "VNVHYJAS", name = "n", descriptor = "[B")
    private byte[] field1509 = new byte[500];

    @OriginalMember(owner = "VNVHYJAS", name = "o", descriptor = "LOCPYCLUF;")
    private class38 field1510 = new class38((byte) 118);

    @OriginalMember(owner = "VNVHYJAS", name = "q", descriptor = "LOCPYCLUF;")
    private class38 field1512 = new class38((byte) 118);

    @OriginalMember(owner = "VNVHYJAS", name = "r", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1513 = new CRC32();

    @OriginalMember(owner = "VNVHYJAS", name = "v", descriptor = "LOCPYCLUF;")
    private class38 field1517 = new class38((byte) 118);

    @OriginalMember(owner = "VNVHYJAS", name = "A", descriptor = "LOCPYCLUF;")
    private class38 field1522 = new class38((byte) 118);

    @OriginalMember(owner = "VNVHYJAS", name = "C", descriptor = "I")
    private int field1524 = 4559;

    @OriginalMember(owner = "VNVHYJAS", name = "D", descriptor = "Ljava/lang/String;")
    public String field1525 = "";

    @OriginalMember(owner = "VNVHYJAS", name = "E", descriptor = "LOCPYCLUF;")
    private class38 field1526 = new class38((byte) 118);

    @OriginalMember(owner = "VNVHYJAS", name = "I", descriptor = "[[B")
    private byte[][] field1530 = new byte[4][];

    @OriginalMember(owner = "VNVHYJAS", name = "K", descriptor = "LYGUBUIIU;")
    private class63 field1532 = new class63(false);

    @OriginalMember(owner = "VNVHYJAS", name = "M", descriptor = "Z")
    private boolean field1534 = false;

    @OriginalMember(owner = "VNVHYJAS", name = "P", descriptor = "Z")
    private boolean field1537 = false;

    @OriginalMember(owner = "VNVHYJAS", name = "Q", descriptor = "I")
    private int field1538 = 7;

    @OriginalMember(owner = "VNVHYJAS", name = "b", descriptor = "I")
    private int field1497;

    @OriginalMember(owner = "VNVHYJAS", name = "h", descriptor = "I")
    public int field1503;

    @OriginalMember(owner = "VNVHYJAS", name = "i", descriptor = "I")
    private int field1504;

    @OriginalMember(owner = "VNVHYJAS", name = "m", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "VNVHYJAS", name = "s", descriptor = "I")
    private int field1514;

    @OriginalMember(owner = "VNVHYJAS", name = "t", descriptor = "I")
    private int field1515;

    @OriginalMember(owner = "VNVHYJAS", name = "x", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "VNVHYJAS", name = "y", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "VNVHYJAS", name = "B", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "VNVHYJAS", name = "N", descriptor = "I")
    private int field1535;

    @OriginalMember(owner = "VNVHYJAS", name = "R", descriptor = "I")
    private int field1539;

    @OriginalMember(owner = "VNVHYJAS", name = "S", descriptor = "I")
    private int field1540;

    @OriginalMember(owner = "VNVHYJAS", name = "J", descriptor = "J")
    private long field1531;

    @OriginalMember(owner = "VNVHYJAS", name = "w", descriptor = "LZRGWPKYE;")
    private class70 field1518;

    @OriginalMember(owner = "VNVHYJAS", name = "O", descriptor = "Lclient;")
    private client field1536;

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "Ljava/io/InputStream;")
    private InputStream field1496;

    @OriginalMember(owner = "VNVHYJAS", name = "p", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1511;

    @OriginalMember(owner = "VNVHYJAS", name = "L", descriptor = "Ljava/net/Socket;")
    private Socket field1533;

    @OriginalMember(owner = "VNVHYJAS", name = "u", descriptor = "[B")
    private byte[] field1516;

    @OriginalMember(owner = "VNVHYJAS", name = "e", descriptor = "[I")
    private int[] field1500;

    @OriginalMember(owner = "VNVHYJAS", name = "j", descriptor = "[I")
    private int[] field1505;

    @OriginalMember(owner = "VNVHYJAS", name = "z", descriptor = "[I")
    private int[] field1521;

    @OriginalMember(owner = "VNVHYJAS", name = "F", descriptor = "[I")
    private int[] field1527;

    @OriginalMember(owner = "VNVHYJAS", name = "G", descriptor = "[I")
    private int[] field1528;

    @OriginalMember(owner = "VNVHYJAS", name = "H", descriptor = "[I")
    private int[] field1529;

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(II)Z")
    public final boolean method514(int arg0, int arg1) {
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        return this.field1500[arg1] == 1;
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(LINOFEYKQ;Lclient;)V")
    public final void method515(class21 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method277(var3[var4], null);
            int var27 = var26.length / 2;
            class35 var28 = new class35((byte) -103, var26);
            this.field1501[var4] = new int[var27];
            this.field1530[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1501[var4][var29] = var28.method351();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method277(var5[var6], null);
            int var23 = var22.length / 4;
            class35 var24 = new class35((byte) -103, var22);
            this.field1499[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1499[var6][var25] = var24.method354();
            }
        }
        byte[] var7 = arg0.method277("model_index", null);
        int var8 = this.field1501[0].length;
        this.field1516 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1516[var9] = var7[var9];
            } else {
                this.field1516[var9] = 0;
            }
        }
        byte[] var10 = arg0.method277("map_index", null);
        class35 var11 = new class35((byte) -103, var10);
        int var12 = var10.length / 7;
        this.field1521 = new int[var12];
        this.field1527 = new int[var12];
        this.field1528 = new int[var12];
        this.field1505 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1521[var13] = var11.method351();
            this.field1527[var13] = var11.method351();
            this.field1528[var13] = var11.method351();
            this.field1505[var13] = var11.method349();
        }
        byte[] var14 = arg0.method277("anim_index", null);
        class35 var15 = new class35((byte) -103, var14);
        int var16 = var14.length / 2;
        this.field1529 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1529[var17] = var15.method351();
        }
        byte[] var18 = arg0.method277("midi_index", null);
        class35 var19 = new class35((byte) -103, var18);
        int var20 = var18.length;
        this.field1500 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1500[var21] = var19.method349();
        }
        this.field1536 = arg1;
        this.field1507 = true;
        this.field1536.method74(this, 2);
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(Z)I")
    public final int method516(boolean arg0) {
        if (!arg0) {
            this.field1502 = 205;
        }
        return this.field1529.length;
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(IZ)V")
    public final void method517(int arg0, boolean arg1) {
        int var3 = this.field1521.length;
        if (arg0 >= 0) {
            this.field1537 = !this.field1537;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1505[var4] != 0) {
                this.method522(0, 3, this.field1528[var4], (byte) 2);
                this.method522(0, 3, this.field1527[var4], (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(B)V")
    private final void method518(byte arg0) {
        if (arg0 != 4) {
            return;
        }
        boolean var2 = false;
        while (this.field1539 == 0) {
            if (this.field1540 >= 10 || this.field1535 == 0) {
                return;
            }
            class38 var3 = this.field1512;
            class70 var4;
            synchronized (this.field1512) {
                var4 = (class70) this.field1512.method413();
            }
            while (var4 != null) {
                if (this.field1530[var4.field1707][var4.field1709] != 0) {
                    this.field1530[var4.field1707][var4.field1709] = 0;
                    this.field1526.method411(var4);
                    this.method519(var4, (byte) 123);
                    this.field1534 = true;
                    if (this.field1523 < this.field1497) {
                        this.field1523++;
                    }
                    this.field1525 = "Loading extra files - " + this.field1523 * 100 / this.field1497 + "%";
                    this.field1540++;
                    if (this.field1540 == 10) {
                        return;
                    }
                }
                class38 var5 = this.field1512;
                synchronized (this.field1512) {
                    var4 = (class70) this.field1512.method413();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.field1530[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.field1535) {
                        var7[var9] = 0;
                        class70 var10 = new class70();
                        var10.field1707 = var6;
                        var10.field1709 = var9;
                        var10.field1710 = false;
                        this.field1526.method411(var10);
                        this.method519(var10, (byte) 123);
                        this.field1534 = true;
                        if (this.field1523 < this.field1497) {
                            this.field1523++;
                        }
                        this.field1525 = "Loading extra files - " + this.field1523 * 100 / this.field1497 + "%";
                        this.field1540++;
                        if (this.field1540 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1535--;
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(LZRGWPKYE;B)V")
    private final void method519(class70 arg0, byte arg1) {
        if (arg1 != 123) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            if (this.field1533 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field1531 < 4000L) {
                    return;
                }
                this.field1531 = var4;
                this.field1533 = this.field1536.method139(client.field465 + 43594);
                this.field1496 = this.field1533.getInputStream();
                this.field1511 = this.field1533.getOutputStream();
                this.field1511.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field1496.read();
                }
                this.field1504 = 0;
            }
            this.field1509[0] = (byte) arg0.field1707;
            this.field1509[1] = (byte) (arg0.field1709 >> 8);
            this.field1509[2] = (byte) arg0.field1709;
            if (arg0.field1710) {
                this.field1509[3] = 2;
            } else if (this.field1536.field410) {
                this.field1509[3] = 0;
            } else {
                this.field1509[3] = 1;
            }
            this.field1511.write(this.field1509, 0, 4);
            this.field1520 = 0;
            this.field1503 = -10000;
        } catch (IOException var9) {
            try {
                this.field1533.close();
            } catch (Exception var8) {
            }
            this.field1533 = null;
            this.field1496 = null;
            this.field1511 = null;
            this.field1515 = 0;
            this.field1503++;
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(IIII)I")
    public final int method520(int arg0, int arg1, int arg2, int arg3) {
        int var5 = (arg0 << 8) + arg1;
        for (int var6 = 0; var6 < this.field1521.length; var6++) {
            if (this.field1521[var6] == var5) {
                if (arg2 == 0) {
                    return this.field1527[var6];
                }
                return this.field1528[var6];
            }
        }
        if (arg3 >= 0) {
            this.field1538 = -267;
        }
        return -1;
    }

    @OriginalMember(owner = "VNVHYJAS", name = "b", descriptor = "(II)Z")
    public final boolean method521(int arg0, int arg1) {
        for (int var3 = 0; var3 < this.field1521.length; var3++) {
            if (this.field1528[var3] == arg0) {
                return true;
            }
        }
        int var4 = 13 / arg1;
        return false;
    }

    @OriginalMember(owner = "VNVHYJAS", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1507) {
                this.field1519++;
                byte var1 = 20;
                if (this.field1535 == 0 && this.field1536.field99[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1534 = true;
                for (int var2 = 0; var2 < 100 && this.field1534; var2++) {
                    this.field1534 = false;
                    this.method531(true);
                    this.method525(12536);
                    if (this.field1539 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method518((byte) 4);
                    if (this.field1496 != null) {
                        this.method534(4559);
                    }
                }
                boolean var3 = false;
                for (class70 var4 = (class70) this.field1526.method414(); var4 != null; var4 = (class70) this.field1526.method416(this.field1508)) {
                    if (var4.field1710) {
                        var3 = true;
                        var4.field1708++;
                        if (var4.field1708 > 50) {
                            var4.field1708 = 0;
                            this.method519(var4, (byte) 123);
                        }
                    }
                }
                if (!var3) {
                    for (class70 var5 = (class70) this.field1526.method414(); var5 != null; var5 = (class70) this.field1526.method416(this.field1508)) {
                        var3 = true;
                        var5.field1708++;
                        if (var5.field1708 > 50) {
                            var5.field1708 = 0;
                            this.method519(var5, (byte) 123);
                        }
                    }
                }
                if (var3) {
                    this.field1504++;
                    if (this.field1504 > 750) {
                        try {
                            this.field1533.close();
                        } catch (Exception var8) {
                        }
                        this.field1533 = null;
                        this.field1496 = null;
                        this.field1511 = null;
                        this.field1515 = 0;
                    }
                } else {
                    this.field1504 = 0;
                    this.field1525 = "";
                }
                if (this.field1536.field410 && this.field1533 != null && this.field1511 != null && (this.field1535 > 0 || this.field1536.field99[0] == null)) {
                    this.field1520++;
                    if (this.field1520 > 500) {
                        this.field1520 = 0;
                        this.field1509[0] = 0;
                        this.field1509[1] = 0;
                        this.field1509[2] = 0;
                        this.field1509[3] = 10;
                        try {
                            this.field1511.write(this.field1509, 0, 4);
                        } catch (IOException var7) {
                            this.field1504 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(IIIB)V")
    public final void method522(int arg0, int arg1, int arg2, byte arg3) {
        if (arg0 != 0 || (this.field1536.field99[0] == null || this.field1501[arg1][arg2] == 0)) {
            return;
        }
        byte[] var5 = this.field1536.field99[arg1 + 1].method550(false, arg2);
        if (this.method528(250, var5, this.field1501[arg1][arg2], this.field1499[arg1][arg2])) {
            return;
        }
        this.field1530[arg1][arg2] = arg3;
        if (arg3 > this.field1535) {
            this.field1535 = arg3;
        }
        this.field1497++;
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(BII)V")
    public final void method523(byte arg0, int arg1, int arg2) {
        if (this.field1536.field99[0] == null || (this.field1501[arg2][arg1] == 0 || (this.field1530[arg2][arg1] == 0 || this.field1535 == 0))) {
            return;
        }
        class70 var4 = new class70();
        if (arg0 != 28) {
            return;
        }
        var4.field1707 = arg2;
        var4.field1709 = arg1;
        var4.field1710 = false;
        class38 var5 = this.field1512;
        synchronized (this.field1512) {
            this.field1512.method411(var4);
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "c", descriptor = "(II)I")
    public final int method524(int arg0, int arg1) {
        return arg1 == 9 ? this.field1516[arg0] & 0xFF : 3;
    }

    @OriginalMember(owner = "VNVHYJAS", name = "b", descriptor = "(I)V")
    private final void method525(int arg0) {
        this.field1539 = 0;
        if (this.field1498 != arg0) {
            this.field1537 = !this.field1537;
        }
        this.field1540 = 0;
        for (class70 var2 = (class70) this.field1526.method414(); var2 != null; var2 = (class70) this.field1526.method416(this.field1508)) {
            if (var2.field1710) {
                this.field1539++;
            } else {
                this.field1540++;
            }
        }
        while (this.field1539 < 10) {
            class70 var3 = (class70) this.field1522.method413();
            if (var3 == null) {
                break;
            }
            if (this.field1530[var3.field1707][var3.field1709] != 0) {
                this.field1523++;
            }
            this.field1530[var3.field1707][var3.field1709] = 0;
            this.field1526.method411(var3);
            this.field1539++;
            this.method519(var3, (byte) 123);
            this.field1534 = true;
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "()LZRGWPKYE;")
    public final class70 method526() {
        class38 var1 = this.field1517;
        class70 var2;
        synchronized (this.field1517) {
            var2 = (class70) this.field1517.method413();
        }
        if (var2 == null) {
            return null;
        }
        class63 var3 = this.field1532;
        synchronized (this.field1532) {
            var2.method330();
        }
        if (var2.field1706 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1706));
            while (true) {
                if (this.field1506.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1506, var4, this.field1506.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1706 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1706[var7] = this.field1506[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "VNVHYJAS", name = "b", descriptor = "(Z)V")
    public final void method527(boolean arg0) {
        class38 var2 = this.field1512;
        synchronized (this.field1512) {
            this.field1512.method418();
        }
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(I[BII)Z")
    private final boolean method528(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg1 == null || arg1.length < 2) {
            return false;
        }
        int var5 = arg1.length - 2;
        int var6 = ((arg1[var5] & 0xFF) << 8) + (arg1[var5 + 1] & 0xFF);
        this.field1513.reset();
        this.field1513.update(arg1, 0, var5);
        int var7 = (int) this.field1513.getValue();
        int var8 = 13 / arg0;
        if (arg2 == var6) {
            return arg3 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "b", descriptor = "()I")
    public final int method529() {
        class63 var1 = this.field1532;
        synchronized (this.field1532) {
            return this.field1532.method577();
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "c", descriptor = "()V")
    public final void method530() {
        this.field1507 = false;
    }

    @OriginalMember(owner = "VNVHYJAS", name = "c", descriptor = "(Z)V")
    private final void method531(boolean arg0) {
        class38 var2 = this.field1510;
        class70 var3;
        synchronized (this.field1510) {
            var3 = (class70) this.field1510.method413();
        }
        if (!arg0) {
            return;
        }
        while (var3 != null) {
            this.field1534 = true;
            byte[] var4 = null;
            if (this.field1536.field99[0] != null) {
                var4 = this.field1536.field99[var3.field1707 + 1].method550(false, var3.field1709);
            }
            if (!this.method528(250, var4, this.field1501[var3.field1707][var3.field1709], this.field1499[var3.field1707][var3.field1709])) {
                var4 = null;
            }
            class38 var5 = this.field1510;
            synchronized (this.field1510) {
                if (var4 == null) {
                    this.field1522.method411(var3);
                } else {
                    var3.field1706 = var4;
                    class38 var6 = this.field1517;
                    synchronized (this.field1517) {
                        this.field1517.method411(var3);
                    }
                }
                var3 = (class70) this.field1510.method413();
            }
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "a", descriptor = "(I)V")
    public final void method248(int arg0) {
        this.method532(0, arg0);
    }

    @OriginalMember(owner = "VNVHYJAS", name = "d", descriptor = "(II)V")
    public final void method532(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1501.length || arg1 < 0 || arg1 > this.field1501[arg0].length || this.field1501[arg0][arg1] == 0) {
            return;
        }
        class63 var3 = this.field1532;
        synchronized (this.field1532) {
            for (class70 var4 = (class70) this.field1532.method575(); var4 != null; var4 = (class70) this.field1532.method576(this.field1508)) {
                if (var4.field1707 == arg0 && var4.field1709 == arg1) {
                    return;
                }
            }
            class70 var5 = new class70();
            var5.field1707 = arg0;
            var5.field1709 = arg1;
            var5.field1710 = true;
            class38 var6 = this.field1510;
            synchronized (this.field1510) {
                this.field1510.method411(var5);
            }
            this.field1532.method573(var5);
        }
    }

    @OriginalMember(owner = "VNVHYJAS", name = "e", descriptor = "(II)I")
    public final int method533(int arg0, int arg1) {
        return arg0 < 0 ? this.field1501[arg1].length : 3;
    }

    @OriginalMember(owner = "VNVHYJAS", name = "c", descriptor = "(I)V")
    private final void method534(int arg0) {
        if (this.field1524 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        try {
            int var3 = this.field1496.available();
            if (this.field1515 == 0 && var3 >= 6) {
                this.field1534 = true;
                for (int var4 = 0; var4 < 6; var4 += this.field1496.read(this.field1509, var4, 6 - var4)) {
                }
                int var5 = this.field1509[0] & 0xFF;
                int var6 = ((this.field1509[1] & 0xFF) << 8) + (this.field1509[2] & 0xFF);
                int var7 = ((this.field1509[3] & 0xFF) << 8) + (this.field1509[4] & 0xFF);
                int var8 = this.field1509[5] & 0xFF;
                this.field1518 = null;
                for (class70 var9 = (class70) this.field1526.method414(); var9 != null; var9 = (class70) this.field1526.method416(this.field1508)) {
                    if (var9.field1707 == var5 && var9.field1709 == var6) {
                        this.field1518 = var9;
                    }
                    if (this.field1518 != null) {
                        var9.field1708 = 0;
                    }
                }
                if (this.field1518 != null) {
                    this.field1504 = 0;
                    if (var7 == 0) {
                        signlink.reporterror("Rej: " + var5 + "," + var6);
                        this.field1518.field1706 = null;
                        if (this.field1518.field1710) {
                            class38 var10 = this.field1517;
                            synchronized (this.field1517) {
                                this.field1517.method411(this.field1518);
                            }
                        } else {
                            this.field1518.method336();
                        }
                        this.field1518 = null;
                    } else {
                        if (this.field1518.field1706 == null && var8 == 0) {
                            this.field1518.field1706 = new byte[var7];
                        }
                        if (this.field1518.field1706 == null && var8 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1514 = var8 * 500;
                this.field1515 = 500;
                if (this.field1515 > var7 - var8 * 500) {
                    this.field1515 = var7 - var8 * 500;
                }
            }
            if (this.field1515 > 0 && var3 >= this.field1515) {
                this.field1534 = true;
                byte[] var11 = this.field1509;
                int var12 = 0;
                if (this.field1518 != null) {
                    var11 = this.field1518.field1706;
                    var12 = this.field1514;
                }
                for (int var13 = 0; var13 < this.field1515; var13 += this.field1496.read(var11, var12 + var13, this.field1515 - var13)) {
                }
                if (this.field1515 + this.field1514 >= var11.length && this.field1518 != null) {
                    if (this.field1536.field99[0] != null) {
                        this.field1536.field99[this.field1518.field1707 + 1].method551(var11.length, true, var11, this.field1518.field1709);
                    }
                    if (!this.field1518.field1710 && this.field1518.field1707 == 3) {
                        this.field1518.field1710 = true;
                        this.field1518.field1707 = 93;
                    }
                    if (this.field1518.field1710) {
                        class38 var14 = this.field1517;
                        synchronized (this.field1517) {
                            this.field1517.method411(this.field1518);
                        }
                    } else {
                        this.field1518.method336();
                    }
                }
                this.field1515 = 0;
            }
        } catch (IOException var19) {
            try {
                this.field1533.close();
            } catch (Exception var16) {
            }
            this.field1533 = null;
            this.field1496 = null;
            this.field1511 = null;
            this.field1515 = 0;
        }
    }
}
