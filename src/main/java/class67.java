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

@OriginalClass("YCBPJRVN")
public class class67 extends class5 implements Runnable {

    @OriginalMember(owner = "YCBPJRVN", name = "c", descriptor = "LPUBJBHOK;")
    private class42 field1499 = new class42(-591);

    @OriginalMember(owner = "YCBPJRVN", name = "e", descriptor = "LPUBJBHOK;")
    private class42 field1501 = new class42(-591);

    @OriginalMember(owner = "YCBPJRVN", name = "g", descriptor = "[[B")
    private byte[][] field1503 = new byte[4][];

    @OriginalMember(owner = "YCBPJRVN", name = "h", descriptor = "LPUBJBHOK;")
    private class42 field1504 = new class42(-591);

    @OriginalMember(owner = "YCBPJRVN", name = "i", descriptor = "[[I")
    private int[][] field1505 = new int[4][];

    @OriginalMember(owner = "YCBPJRVN", name = "j", descriptor = "Z")
    private boolean field1506 = true;

    @OriginalMember(owner = "YCBPJRVN", name = "l", descriptor = "Z")
    private boolean field1508 = false;

    @OriginalMember(owner = "YCBPJRVN", name = "n", descriptor = "[B")
    private byte[] field1510 = new byte[65000];

    @OriginalMember(owner = "YCBPJRVN", name = "p", descriptor = "LPUBJBHOK;")
    private class42 field1512 = new class42(-591);

    @OriginalMember(owner = "YCBPJRVN", name = "u", descriptor = "Z")
    private boolean field1517 = false;

    @OriginalMember(owner = "YCBPJRVN", name = "A", descriptor = "LPUBJBHOK;")
    private class42 field1523 = new class42(-591);

    @OriginalMember(owner = "YCBPJRVN", name = "B", descriptor = "LSYRXWHZM;")
    private class51 field1524 = new class51(false);

    @OriginalMember(owner = "YCBPJRVN", name = "C", descriptor = "Z")
    private boolean field1525 = false;

    @OriginalMember(owner = "YCBPJRVN", name = "D", descriptor = "I")
    private int field1526 = 8;

    @OriginalMember(owner = "YCBPJRVN", name = "F", descriptor = "I")
    private int field1528 = -929;

    @OriginalMember(owner = "YCBPJRVN", name = "H", descriptor = "[[I")
    private int[][] field1530 = new int[4][];

    @OriginalMember(owner = "YCBPJRVN", name = "M", descriptor = "[B")
    private byte[] field1535 = new byte[500];

    @OriginalMember(owner = "YCBPJRVN", name = "N", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1536 = new CRC32();

    @OriginalMember(owner = "YCBPJRVN", name = "R", descriptor = "Z")
    private boolean field1540 = true;

    @OriginalMember(owner = "YCBPJRVN", name = "S", descriptor = "Ljava/lang/String;")
    public String field1541 = "";

    @OriginalMember(owner = "YCBPJRVN", name = "T", descriptor = "Z")
    private boolean field1542 = true;

    @OriginalMember(owner = "YCBPJRVN", name = "f", descriptor = "I")
    private int field1502;

    @OriginalMember(owner = "YCBPJRVN", name = "k", descriptor = "I")
    private int field1507;

    @OriginalMember(owner = "YCBPJRVN", name = "q", descriptor = "I")
    public int field1513;

    @OriginalMember(owner = "YCBPJRVN", name = "t", descriptor = "I")
    private int field1516;

    @OriginalMember(owner = "YCBPJRVN", name = "v", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "YCBPJRVN", name = "w", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "YCBPJRVN", name = "z", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "YCBPJRVN", name = "G", descriptor = "I")
    private int field1529;

    @OriginalMember(owner = "YCBPJRVN", name = "I", descriptor = "I")
    private int field1531;

    @OriginalMember(owner = "YCBPJRVN", name = "O", descriptor = "I")
    private int field1537;

    @OriginalMember(owner = "YCBPJRVN", name = "P", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "YCBPJRVN", name = "Q", descriptor = "J")
    private long field1539;

    @OriginalMember(owner = "YCBPJRVN", name = "m", descriptor = "LJLWEKARN;")
    private class24 field1509;

    @OriginalMember(owner = "YCBPJRVN", name = "L", descriptor = "Lclient;")
    private client field1534;

    @OriginalMember(owner = "YCBPJRVN", name = "E", descriptor = "Ljava/io/InputStream;")
    private InputStream field1527;

    @OriginalMember(owner = "YCBPJRVN", name = "r", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1514;

    @OriginalMember(owner = "YCBPJRVN", name = "s", descriptor = "Ljava/net/Socket;")
    private Socket field1515;

    @OriginalMember(owner = "YCBPJRVN", name = "J", descriptor = "[B")
    private byte[] field1532;

    @OriginalMember(owner = "YCBPJRVN", name = "b", descriptor = "[I")
    private int[] field1498;

    @OriginalMember(owner = "YCBPJRVN", name = "d", descriptor = "[I")
    private int[] field1500;

    @OriginalMember(owner = "YCBPJRVN", name = "o", descriptor = "[I")
    private int[] field1511;

    @OriginalMember(owner = "YCBPJRVN", name = "x", descriptor = "[I")
    private int[] field1520;

    @OriginalMember(owner = "YCBPJRVN", name = "y", descriptor = "[I")
    private int[] field1521;

    @OriginalMember(owner = "YCBPJRVN", name = "K", descriptor = "[I")
    private int[] field1533;

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "(III)V")
    public final void method524(int arg0, int arg1, int arg2) {
        if (this.field1534.field539[0] == null || (this.field1505[arg1][arg0] == 0 || (this.field1503[arg1][arg0] == 0 || this.field1502 == 0))) {
            return;
        }
        class24 var4 = new class24();
        var4.field795 = arg1;
        var4.field797 = arg0;
        var4.field794 = false;
        class42 var5 = this.field1523;
        synchronized (this.field1523) {
            this.field1523.method373(var4);
        }
        if (arg2 == 1) {
            ;
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "(IBIB)V")
    public final void method525(int arg0, byte arg1, int arg2, byte arg3) {
        if (arg3 != 49) {
            this.field1528 = -420;
        }
        if (this.field1534.field539[0] == null || this.field1505[arg2][arg0] == 0) {
            return;
        }
        byte[] var5 = this.field1534.field539[arg2 + 1].method520(arg0, -261);
        if (this.method539(var5, this.field1530[arg2][arg0], this.field1505[arg2][arg0], -48374)) {
            return;
        }
        this.field1503[arg2][arg0] = arg1;
        if (arg1 > this.field1502) {
            this.field1502 = arg1;
        }
        this.field1507++;
    }

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "(IZ)V")
    public final void method526(int arg0, boolean arg1) {
        int var3 = this.field1511.length;
        if (arg0 != 0) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg1 || this.field1500[var4] != 0) {
                this.method525(this.field1533[var4], (byte) 2, 3, (byte) 49);
                this.method525(this.field1498[var4], (byte) 2, 3, (byte) 49);
            }
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "(Z)V")
    private final void method527(boolean arg0) {
        if (!arg0) {
            this.field1526 = -400;
        }
        try {
            int var2 = this.field1527.available();
            if (this.field1519 == 0 && var2 >= 6) {
                this.field1517 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1527.read(this.field1535, var3, 6 - var3)) {
                }
                int var4 = this.field1535[0] & 0xFF;
                int var5 = ((this.field1535[1] & 0xFF) << 8) + (this.field1535[2] & 0xFF);
                int var6 = ((this.field1535[3] & 0xFF) << 8) + (this.field1535[4] & 0xFF);
                int var7 = this.field1535[5] & 0xFF;
                this.field1509 = null;
                for (class24 var8 = (class24) this.field1512.method376(); var8 != null; var8 = (class24) this.field1512.method378(0)) {
                    if (var8.field795 == var4 && var8.field797 == var5) {
                        this.field1509 = var8;
                    }
                    if (this.field1509 != null) {
                        var8.field793 = 0;
                    }
                }
                if (this.field1509 != null) {
                    this.field1531 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1509.field796 = null;
                        if (this.field1509.field794) {
                            class42 var9 = this.field1504;
                            synchronized (this.field1504) {
                                this.field1504.method373(this.field1509);
                            }
                        } else {
                            this.field1509.method492();
                        }
                        this.field1509 = null;
                    } else {
                        if (this.field1509.field796 == null && var7 == 0) {
                            this.field1509.field796 = new byte[var6];
                        }
                        if (this.field1509.field796 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1518 = var7 * 500;
                this.field1519 = 500;
                if (this.field1519 > var6 - var7 * 500) {
                    this.field1519 = var6 - var7 * 500;
                }
            }
            if (this.field1519 > 0 && var2 >= this.field1519) {
                this.field1517 = true;
                byte[] var10 = this.field1535;
                int var11 = 0;
                if (this.field1509 != null) {
                    var10 = this.field1509.field796;
                    var11 = this.field1518;
                }
                for (int var12 = 0; var12 < this.field1519; var12 += this.field1527.read(var10, var11 + var12, this.field1519 - var12)) {
                }
                if (this.field1519 + this.field1518 >= var10.length && this.field1509 != null) {
                    if (this.field1534.field539[0] != null) {
                        this.field1534.field539[this.field1509.field795 + 1].method521(this.field1509.field797, 338, var10, var10.length);
                    }
                    if (!this.field1509.field794 && this.field1509.field795 == 3) {
                        this.field1509.field794 = true;
                        this.field1509.field795 = 93;
                    }
                    if (this.field1509.field794) {
                        class42 var13 = this.field1504;
                        synchronized (this.field1504) {
                            this.field1504.method373(this.field1509);
                        }
                    } else {
                        this.field1509.method492();
                    }
                }
                this.field1519 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1515.close();
            } catch (Exception var15) {
            }
            this.field1515 = null;
            this.field1527 = null;
            this.field1514 = null;
            this.field1519 = 0;
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "b", descriptor = "(IZ)Z")
    public final boolean method528(int arg0, boolean arg1) {
        if (arg1) {
            this.field1542 = !this.field1542;
        }
        return this.field1521[arg0] == 1;
    }

    @OriginalMember(owner = "YCBPJRVN", name = "b", descriptor = "(I)V")
    private final void method529(int arg0) {
        class42 var2 = this.field1501;
        class24 var3;
        synchronized (this.field1501) {
            var3 = (class24) this.field1501.method375();
        }
        if (arg0 < 7 || arg0 > 7) {
            return;
        }
        while (var3 != null) {
            this.field1517 = true;
            byte[] var4 = null;
            if (this.field1534.field539[0] != null) {
                var4 = this.field1534.field539[var3.field795 + 1].method520(var3.field797, -261);
            }
            if (!this.method539(var4, this.field1530[var3.field795][var3.field797], this.field1505[var3.field795][var3.field797], -48374)) {
                var4 = null;
            }
            class42 var5 = this.field1501;
            synchronized (this.field1501) {
                if (var4 == null) {
                    this.field1499.method373(var3);
                } else {
                    var3.field796 = var4;
                    class42 var6 = this.field1504;
                    synchronized (this.field1504) {
                        this.field1504.method373(var3);
                    }
                }
                var3 = (class24) this.field1501.method375();
            }
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "c", descriptor = "(I)V")
    private final void method530(int arg0) {
        if (arg0 >= 0) {
            return;
        }
        while (this.field1537 == 0) {
            if (this.field1538 >= 10 || this.field1502 == 0) {
                return;
            }
            class42 var2 = this.field1523;
            class24 var3;
            synchronized (this.field1523) {
                var3 = (class24) this.field1523.method375();
            }
            while (var3 != null) {
                if (this.field1503[var3.field795][var3.field797] != 0) {
                    this.field1503[var3.field795][var3.field797] = 0;
                    this.field1512.method373(var3);
                    this.method532(var3, false);
                    this.field1517 = true;
                    if (this.field1516 < this.field1507) {
                        this.field1516++;
                    }
                    this.field1541 = "Loading extra files - " + this.field1516 * 100 / this.field1507 + "%";
                    this.field1538++;
                    if (this.field1538 == 10) {
                        return;
                    }
                }
                class42 var4 = this.field1523;
                synchronized (this.field1523) {
                    var3 = (class24) this.field1523.method375();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1503[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1502) {
                        var6[var8] = 0;
                        class24 var9 = new class24();
                        var9.field795 = var5;
                        var9.field797 = var8;
                        var9.field794 = false;
                        this.field1512.method373(var9);
                        this.method532(var9, false);
                        this.field1517 = true;
                        if (this.field1516 < this.field1507) {
                            this.field1516++;
                        }
                        this.field1541 = "Loading extra files - " + this.field1516 * 100 / this.field1507 + "%";
                        this.field1538++;
                        if (this.field1538 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1502--;
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "(IIIB)I")
    public final int method531(int arg0, int arg1, int arg2, byte arg3) {
        int var5 = (arg0 << 8) + arg2;
        if (arg3 != -34) {
            this.field1506 = !this.field1506;
        }
        for (int var6 = 0; var6 < this.field1511.length; var6++) {
            if (this.field1511[var6] == var5) {
                if (arg1 == 0) {
                    return this.field1498[var6];
                }
                return this.field1533[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "(LJLWEKARN;Z)V")
    private final void method532(class24 arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        try {
            if (this.field1515 == null) {
                long var4 = System.currentTimeMillis();
                if (var4 - this.field1539 < 4000L) {
                    return;
                }
                this.field1539 = var4;
                this.field1515 = this.field1534.method57(client.field374 + 43594);
                this.field1527 = this.field1515.getInputStream();
                this.field1514 = this.field1515.getOutputStream();
                this.field1514.write(15);
                for (int var6 = 0; var6 < 8; var6++) {
                    this.field1527.read();
                }
                this.field1531 = 0;
            }
            this.field1535[0] = (byte) arg0.field795;
            this.field1535[1] = (byte) (arg0.field797 >> 8);
            this.field1535[2] = (byte) arg0.field797;
            if (arg0.field794) {
                this.field1535[3] = 2;
            } else if (this.field1534.field106) {
                this.field1535[3] = 0;
            } else {
                this.field1535[3] = 1;
            }
            this.field1514.write(this.field1535, 0, 4);
            this.field1529 = 0;
            this.field1522 = -10000;
        } catch (IOException var9) {
            try {
                this.field1515.close();
            } catch (Exception var8) {
            }
            this.field1515 = null;
            this.field1527 = null;
            this.field1514 = null;
            this.field1519 = 0;
            this.field1522++;
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1540) {
                this.field1513++;
                byte var1 = 20;
                if (this.field1502 == 0 && this.field1534.field539[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1517 = true;
                for (int var2 = 0; var2 < 100 && this.field1517; var2++) {
                    this.field1517 = false;
                    this.method529(7);
                    this.method544(-22772);
                    if (this.field1537 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method530(-300);
                    if (this.field1527 != null) {
                        this.method527(true);
                    }
                }
                boolean var3 = false;
                for (class24 var4 = (class24) this.field1512.method376(); var4 != null; var4 = (class24) this.field1512.method378(0)) {
                    if (var4.field794) {
                        var3 = true;
                        var4.field793++;
                        if (var4.field793 > 50) {
                            var4.field793 = 0;
                            this.method532(var4, false);
                        }
                    }
                }
                if (!var3) {
                    for (class24 var5 = (class24) this.field1512.method376(); var5 != null; var5 = (class24) this.field1512.method378(0)) {
                        var3 = true;
                        var5.field793++;
                        if (var5.field793 > 50) {
                            var5.field793 = 0;
                            this.method532(var5, false);
                        }
                    }
                }
                if (var3) {
                    this.field1531++;
                    if (this.field1531 > 750) {
                        try {
                            this.field1515.close();
                        } catch (Exception var8) {
                        }
                        this.field1515 = null;
                        this.field1527 = null;
                        this.field1514 = null;
                        this.field1519 = 0;
                    }
                } else {
                    this.field1531 = 0;
                    this.field1541 = "";
                }
                if (this.field1534.field106 && this.field1515 != null && this.field1514 != null && (this.field1502 > 0 || this.field1534.field539[0] == null)) {
                    this.field1529++;
                    if (this.field1529 > 500) {
                        this.field1529 = 0;
                        this.field1535[0] = 0;
                        this.field1535[1] = 0;
                        this.field1535[2] = 0;
                        this.field1535[3] = 10;
                        try {
                            this.field1514.write(this.field1535, 0, 4);
                        } catch (IOException var7) {
                            this.field1531 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "(I)V")
    public final void method164(int arg0) {
        this.method533(0, arg0);
    }

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "(II)V")
    public final void method533(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1505.length || arg1 < 0 || arg1 > this.field1505[arg0].length || this.field1505[arg0][arg1] == 0) {
            return;
        }
        class51 var3 = this.field1524;
        synchronized (this.field1524) {
            for (class24 var4 = (class24) this.field1524.method483(); var4 != null; var4 = (class24) this.field1524.method484(0)) {
                if (var4.field795 == arg0 && var4.field797 == arg1) {
                    return;
                }
            }
            class24 var5 = new class24();
            var5.field795 = arg0;
            var5.field797 = arg1;
            var5.field794 = true;
            class42 var6 = this.field1501;
            synchronized (this.field1501) {
                this.field1501.method373(var5);
            }
            this.field1524.method481(var5);
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "()LJLWEKARN;")
    public final class24 method534() {
        class42 var1 = this.field1504;
        class24 var2;
        synchronized (this.field1504) {
            var2 = (class24) this.field1504.method375();
        }
        if (var2 == null) {
            return null;
        }
        class51 var3 = this.field1524;
        synchronized (this.field1524) {
            var2.method545();
        }
        if (var2.field796 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field796));
            while (true) {
                if (this.field1510.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1510, var4, this.field1510.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field796 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field796[var7] = this.field1510[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "YCBPJRVN", name = "b", descriptor = "(II)I")
    public final int method535(int arg0, int arg1) {
        if (arg1 != 21089) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        return this.field1505[arg0].length;
    }

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "(LCXFTMSCH;Lclient;)V")
    public final void method536(class8 arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method176(var3[var4], null);
            int var27 = var26.length / 2;
            class33 var28 = new class33(true, var26);
            this.field1505[var4] = new int[var27];
            this.field1503[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1505[var4][var29] = var28.method327();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method176(var5[var6], null);
            int var23 = var22.length / 4;
            class33 var24 = new class33(true, var22);
            this.field1530[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1530[var6][var25] = var24.method330();
            }
        }
        byte[] var7 = arg0.method176("model_index", null);
        int var8 = this.field1505[0].length;
        this.field1532 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1532[var9] = var7[var9];
            } else {
                this.field1532[var9] = 0;
            }
        }
        byte[] var10 = arg0.method176("map_index", null);
        class33 var11 = new class33(true, var10);
        int var12 = var10.length / 7;
        this.field1511 = new int[var12];
        this.field1498 = new int[var12];
        this.field1533 = new int[var12];
        this.field1500 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1511[var13] = var11.method327();
            this.field1498[var13] = var11.method327();
            this.field1533[var13] = var11.method327();
            this.field1500[var13] = var11.method325();
        }
        byte[] var14 = arg0.method176("anim_index", null);
        class33 var15 = new class33(true, var14);
        int var16 = var14.length / 2;
        this.field1520 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1520[var17] = var15.method327();
        }
        byte[] var18 = arg0.method176("midi_index", null);
        class33 var19 = new class33(true, var18);
        int var20 = var18.length;
        this.field1521 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1521[var21] = var19.method325();
        }
        this.field1534 = arg1;
        this.field1540 = true;
        this.field1534.method97(this, 2);
    }

    @OriginalMember(owner = "YCBPJRVN", name = "d", descriptor = "(I)V")
    public final void method537(int arg0) {
        class42 var2 = this.field1523;
        synchronized (this.field1523) {
            this.field1523.method380();
        }
        if (arg0 != -23388) {
            this.field1525 = !this.field1525;
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "b", descriptor = "()V")
    public final void method538() {
        this.field1540 = false;
    }

    @OriginalMember(owner = "YCBPJRVN", name = "a", descriptor = "([BIII)Z")
    private final boolean method539(byte[] arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var5 = arg0.length - 2;
        int var6 = ((arg0[var5] & 0xFF) << 8) + (arg0[var5 + 1] & 0xFF);
        this.field1536.reset();
        this.field1536.update(arg0, 0, var5);
        int var7 = (int) this.field1536.getValue();
        if (arg3 != -48374) {
            throw new NullPointerException();
        } else if (arg2 == var6) {
            return arg1 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "c", descriptor = "(II)I")
    public final int method540(int arg0, int arg1) {
        if (arg1 != 1) {
            this.field1528 = 120;
        }
        return this.field1532[arg0] & 0xFF;
    }

    @OriginalMember(owner = "YCBPJRVN", name = "c", descriptor = "()I")
    public final int method541() {
        class51 var1 = this.field1524;
        synchronized (this.field1524) {
            return this.field1524.method485();
        }
    }

    @OriginalMember(owner = "YCBPJRVN", name = "c", descriptor = "(IZ)Z")
    public final boolean method542(int arg0, boolean arg1) {
        if (arg1) {
            this.field1542 = !this.field1542;
        }
        for (int var3 = 0; var3 < this.field1511.length; var3++) {
            if (this.field1533[var3] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "YCBPJRVN", name = "b", descriptor = "(Z)I")
    public final int method543(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return this.field1520.length;
    }

    @OriginalMember(owner = "YCBPJRVN", name = "e", descriptor = "(I)V")
    private final void method544(int arg0) {
        this.field1537 = 0;
        if (arg0 != -22772) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.field1538 = 0;
        for (class24 var3 = (class24) this.field1512.method376(); var3 != null; var3 = (class24) this.field1512.method378(0)) {
            if (var3.field794) {
                this.field1537++;
            } else {
                this.field1538++;
            }
        }
        while (this.field1537 < 10) {
            class24 var4 = (class24) this.field1499.method375();
            if (var4 == null) {
                break;
            }
            if (this.field1503[var4.field795][var4.field797] != 0) {
                this.field1516++;
            }
            this.field1503[var4.field795][var4.field797] = 0;
            this.field1512.method373(var4);
            this.field1537++;
            this.method532(var4, false);
            this.field1517 = true;
        }
    }
}
