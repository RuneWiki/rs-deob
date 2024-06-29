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

@OriginalClass("client!ZPGPWCCV")
public class OnDemand extends OnDemandProvider implements Runnable {

    @OriginalMember(owner = "client!ZPGPWCCV", name = "e", descriptor = "[[B")
    private byte[][] field1714 = new byte[4][];

    @OriginalMember(owner = "client!ZPGPWCCV", name = "f", descriptor = "Z")
    private boolean field1715 = false;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "g", descriptor = "Z")
    private boolean field1716 = true;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "h", descriptor = "LBOHLFXVX;")
    private LinkList field1717 = new LinkList(true);

    @OriginalMember(owner = "client!ZPGPWCCV", name = "l", descriptor = "[[I")
    private int[][] field1721 = new int[4][];

    @OriginalMember(owner = "client!ZPGPWCCV", name = "o", descriptor = "Ljava/lang/String;")
    public String field1724 = "";

    @OriginalMember(owner = "client!ZPGPWCCV", name = "s", descriptor = "LBOHLFXVX;")
    private LinkList field1728 = new LinkList(true);

    @OriginalMember(owner = "client!ZPGPWCCV", name = "t", descriptor = "Z")
    private boolean field1729 = false;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "v", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field1731 = new CRC32();

    @OriginalMember(owner = "client!ZPGPWCCV", name = "x", descriptor = "Z")
    private boolean field1733 = false;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "y", descriptor = "LBOHLFXVX;")
    private LinkList field1734 = new LinkList(true);

    @OriginalMember(owner = "client!ZPGPWCCV", name = "z", descriptor = "LBOHLFXVX;")
    private LinkList field1735 = new LinkList(true);

    @OriginalMember(owner = "client!ZPGPWCCV", name = "A", descriptor = "[B")
    private byte[] field1736 = new byte[65000];

    @OriginalMember(owner = "client!ZPGPWCCV", name = "F", descriptor = "[B")
    private byte[] field1741 = new byte[500];

    @OriginalMember(owner = "client!ZPGPWCCV", name = "I", descriptor = "I")
    private int field1744 = 591;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "K", descriptor = "LCZYJUOKA;")
    private DoublyLinkList field1746 = new DoublyLinkList(true);

    @OriginalMember(owner = "client!ZPGPWCCV", name = "M", descriptor = "B")
    private byte field1748 = 6;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "P", descriptor = "LBOHLFXVX;")
    private LinkList field1751 = new LinkList(true);

    @OriginalMember(owner = "client!ZPGPWCCV", name = "S", descriptor = "[[I")
    private int[][] field1754 = new int[4][];

    @OriginalMember(owner = "client!ZPGPWCCV", name = "V", descriptor = "Z")
    private boolean field1757 = false;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "i", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "j", descriptor = "I")
    private int field1719;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "k", descriptor = "I")
    private int field1720;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "m", descriptor = "I")
    private int field1722;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "p", descriptor = "I")
    public int field1725;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "r", descriptor = "I")
    public int field1727;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "u", descriptor = "I")
    private int field1730;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "C", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "D", descriptor = "I")
    private int field1739;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "E", descriptor = "I")
    private int field1740;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "J", descriptor = "I")
    private int field1745;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "Q", descriptor = "I")
    private int field1752;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "U", descriptor = "I")
    public int field1756;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "T", descriptor = "J")
    private long field1755;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "N", descriptor = "LQSLIGKQQ;")
    private OnDemandRequest field1749;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "O", descriptor = "Lclient;")
    private client field1750;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "L", descriptor = "Ljava/io/InputStream;")
    private InputStream field1747;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "q", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field1726;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "w", descriptor = "Ljava/net/Socket;")
    private Socket field1732;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "c", descriptor = "[B")
    private byte[] field1712;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "d", descriptor = "[I")
    private int[] field1713;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "n", descriptor = "[I")
    private int[] field1723;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "B", descriptor = "[I")
    private int[] field1737;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "G", descriptor = "[I")
    private int[] field1742;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "H", descriptor = "[I")
    private int[] field1743;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "R", descriptor = "[I")
    private int[] field1753;

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(Z)V")
    private final void method581(boolean arg0) {
        if (arg0) {
            this.field1745 = 138;
        }
        try {
            int var2 = this.field1747.available();
            if (this.field1739 == 0 && var2 >= 6) {
                this.field1715 = true;
                for (int var3 = 0; var3 < 6; var3 += this.field1747.read(this.field1741, var3, 6 - var3)) {
                }
                int var4 = this.field1741[0] & 0xFF;
                int var5 = ((this.field1741[1] & 0xFF) << 8) + (this.field1741[2] & 0xFF);
                int var6 = ((this.field1741[3] & 0xFF) << 8) + (this.field1741[4] & 0xFF);
                int var7 = this.field1741[5] & 0xFF;
                this.field1749 = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.field1751.method6(); var8 != null; var8 = (OnDemandRequest) this.field1751.method8(1)) {
                    if (var8.field1363 == var4 && var8.field1364 == var5) {
                        this.field1749 = var8;
                    }
                    if (this.field1749 != null) {
                        var8.field1365 = 0;
                    }
                }
                if (this.field1749 != null) {
                    this.field1730 = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.field1749.field1366 = null;
                        if (this.field1749.field1367) {
                            LinkList var9 = this.field1734;
                            synchronized (this.field1734) {
                                this.field1734.method3(this.field1749);
                            }
                        } else {
                            this.field1749.method604();
                        }
                        this.field1749 = null;
                    } else {
                        if (this.field1749.field1366 == null && var7 == 0) {
                            this.field1749.field1366 = new byte[var6];
                        }
                        if (this.field1749.field1366 == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.field1738 = var7 * 500;
                this.field1739 = 500;
                if (this.field1739 > var6 - var7 * 500) {
                    this.field1739 = var6 - var7 * 500;
                }
            }
            if (this.field1739 > 0 && var2 >= this.field1739) {
                this.field1715 = true;
                byte[] var10 = this.field1741;
                int var11 = 0;
                if (this.field1749 != null) {
                    var10 = this.field1749.field1366;
                    var11 = this.field1738;
                }
                for (int var12 = 0; var12 < this.field1739; var12 += this.field1747.read(var10, var11 + var12, this.field1739 - var12)) {
                }
                if (this.field1739 + this.field1738 >= var10.length && this.field1749 != null) {
                    if (this.field1750.field524[0] != null) {
                        this.field1750.field524[this.field1749.field1363 + 1].method326(var10.length, true, var10, this.field1749.field1364);
                    }
                    if (!this.field1749.field1367 && this.field1749.field1363 == 3) {
                        this.field1749.field1367 = true;
                        this.field1749.field1363 = 93;
                    }
                    if (this.field1749.field1367) {
                        LinkList var13 = this.field1734;
                        synchronized (this.field1734) {
                            this.field1734.method3(this.field1749);
                        }
                    } else {
                        this.field1749.method604();
                    }
                }
                this.field1739 = 0;
            }
        } catch (IOException var18) {
            try {
                this.field1732.close();
            } catch (Exception var15) {
            }
            this.field1732 = null;
            this.field1747 = null;
            this.field1726 = null;
            this.field1739 = 0;
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(II)I")
    public final int method582(int arg0, int arg1) {
        return arg1 < 0 ? this.field1712[arg0] & 0xFF : this.field1744;
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(I)V")
    public final void method456(int arg0) {
        this.method586(0, arg0);
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "(I)V")
    private final void method583(int arg0) {
        if (arg0 != 0) {
            return;
        }
        while (this.field1719 == 0) {
            if (this.field1720 >= 10 || this.field1718 == 0) {
                return;
            }
            LinkList var2 = this.field1735;
            OnDemandRequest var3;
            synchronized (this.field1735) {
                var3 = (OnDemandRequest) this.field1735.method5();
            }
            while (var3 != null) {
                if (this.field1714[var3.field1363][var3.field1364] != 0) {
                    this.field1714[var3.field1363][var3.field1364] = 0;
                    this.field1751.method3(var3);
                    this.method599(this.field1722, var3);
                    this.field1715 = true;
                    if (this.field1711 < this.field1727) {
                        this.field1711++;
                    }
                    this.field1724 = "Loading extra files - " + this.field1711 * 100 / this.field1727 + "%";
                    this.field1720++;
                    if (this.field1720 == 10) {
                        return;
                    }
                }
                LinkList var4 = this.field1735;
                synchronized (this.field1735) {
                    var3 = (OnDemandRequest) this.field1735.method5();
                }
            }
            for (int var5 = 0; var5 < 4; var5++) {
                byte[] var6 = this.field1714[var5];
                int var7 = var6.length;
                for (int var8 = 0; var8 < var7; var8++) {
                    if (var6[var8] == this.field1718) {
                        var6[var8] = 0;
                        OnDemandRequest var9 = new OnDemandRequest();
                        var9.field1363 = var5;
                        var9.field1364 = var8;
                        var9.field1367 = false;
                        this.field1751.method3(var9);
                        this.method599(this.field1722, var9);
                        this.field1715 = true;
                        if (this.field1711 < this.field1727) {
                            this.field1711++;
                        }
                        this.field1724 = "Loading extra files - " + this.field1711 * 100 / this.field1727 + "%";
                        this.field1720++;
                        if (this.field1720 == 10) {
                            return;
                        }
                    }
                }
            }
            this.field1718--;
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(IIBI)V")
    public final void method584(int arg0, int arg1, byte arg2, int arg3) {
        if (arg0 >= 0 || (this.field1750.field524[0] == null || this.field1754[arg1][arg3] == 0)) {
            return;
        }
        byte[] var5 = this.field1750.field524[arg1 + 1].method325(this.field1748, arg3);
        if (this.method598(var5, 764, this.field1754[arg1][arg3], this.field1721[arg1][arg3])) {
            return;
        }
        this.field1714[arg1][arg3] = arg2;
        if (arg2 > this.field1718) {
            this.field1718 = arg2;
        }
        this.field1727++;
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(IZ)Z")
    public final boolean method585(int arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        return this.field1743[arg0] == 1;
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "(II)V")
    public final void method586(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.field1754.length || arg1 < 0 || arg1 > this.field1754[arg0].length || this.field1754[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.field1746;
        synchronized (this.field1746) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.field1746.method182(); var4 != null; var4 = (OnDemandRequest) this.field1746.method183(1)) {
                if (var4.field1363 == arg0 && var4.field1364 == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.field1363 = arg0;
            var5.field1364 = arg1;
            var5.field1367 = true;
            LinkList var6 = this.field1717;
            synchronized (this.field1717) {
                this.field1717.method3(var5);
            }
            this.field1746.method180(var5);
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "()LQSLIGKQQ;")
    public final OnDemandRequest method587() {
        LinkList var1 = this.field1734;
        OnDemandRequest var2;
        synchronized (this.field1734) {
            var2 = (OnDemandRequest) this.field1734.method5();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.field1746;
        synchronized (this.field1746) {
            var2.method185();
        }
        if (var2.field1366 == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.field1366));
            while (true) {
                if (this.field1736.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.field1736, var4, this.field1736.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.field1366 = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.field1366[var7] = this.field1736[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.field1716) {
                this.field1725++;
                byte var1 = 20;
                if (this.field1718 == 0 && this.field1750.field524[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.field1715 = true;
                for (int var2 = 0; var2 < 100 && this.field1715; var2++) {
                    this.field1715 = false;
                    this.method595(true);
                    this.method588(0);
                    if (this.field1719 == 0 && var2 >= 5) {
                        break;
                    }
                    this.method583(0);
                    if (this.field1747 != null) {
                        this.method581(false);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.field1751.method6(); var4 != null; var4 = (OnDemandRequest) this.field1751.method8(1)) {
                    if (var4.field1367) {
                        var3 = true;
                        var4.field1365++;
                        if (var4.field1365 > 50) {
                            var4.field1365 = 0;
                            this.method599(this.field1722, var4);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.field1751.method6(); var5 != null; var5 = (OnDemandRequest) this.field1751.method8(1)) {
                        var3 = true;
                        var5.field1365++;
                        if (var5.field1365 > 50) {
                            var5.field1365 = 0;
                            this.method599(this.field1722, var5);
                        }
                    }
                }
                if (var3) {
                    this.field1730++;
                    if (this.field1730 > 750) {
                        try {
                            this.field1732.close();
                        } catch (Exception var8) {
                        }
                        this.field1732 = null;
                        this.field1747 = null;
                        this.field1726 = null;
                        this.field1739 = 0;
                    }
                } else {
                    this.field1730 = 0;
                    this.field1724 = "";
                }
                if (this.field1750.field433 && this.field1732 != null && this.field1726 != null && (this.field1718 > 0 || this.field1750.field524[0] == null)) {
                    this.field1752++;
                    if (this.field1752 > 500) {
                        this.field1752 = 0;
                        this.field1741[0] = 0;
                        this.field1741[1] = 0;
                        this.field1741[2] = 0;
                        this.field1741[3] = 10;
                        try {
                            this.field1726.write(this.field1741, 0, 4);
                        } catch (IOException var7) {
                            this.field1730 = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "c", descriptor = "(I)V")
    private final void method588(int arg0) {
        this.field1719 = 0;
        this.field1720 = 0;
        if (arg0 != 0) {
            return;
        }
        for (OnDemandRequest var2 = (OnDemandRequest) this.field1751.method6(); var2 != null; var2 = (OnDemandRequest) this.field1751.method8(1)) {
            if (var2.field1367) {
                this.field1719++;
            } else {
                this.field1720++;
            }
        }
        while (this.field1719 < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.field1728.method5();
            if (var3 == null) {
                break;
            }
            if (this.field1714[var3.field1363][var3.field1364] != 0) {
                this.field1711++;
            }
            this.field1714[var3.field1363][var3.field1364] = 0;
            this.field1751.method3(var3);
            this.field1719++;
            this.method599(this.field1722, var3);
            this.field1715 = true;
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(ZB)V")
    public final void method589(boolean arg0, byte arg1) {
        if (arg1 != 109) {
            this.field1729 = !this.field1729;
        }
        int var3 = this.field1723.length;
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.field1713[var4] != 0) {
                this.method584(-44, 3, (byte) 2, this.field1742[var4]);
                this.method584(-44, 3, (byte) 2, this.field1737[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "()I")
    public final int method590() {
        DoublyLinkList var1 = this.field1746;
        synchronized (this.field1746) {
            return this.field1746.method184();
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "(IZ)Z")
    public final boolean method591(int arg0, boolean arg1) {
        for (int var3 = 0; var3 < this.field1723.length; var3++) {
            if (this.field1742[var3] == arg0) {
                return true;
            }
        }
        if (arg1) {
            this.field1740 = -405;
        }
        return false;
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(LATJMVOZR;Lclient;)V")
    public final void method592(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.method2(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(true, var26);
            this.field1754[var4] = new int[var27];
            this.field1714[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.field1754[var4][var29] = var28.g2();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.method2(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(true, var22);
            this.field1721[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.field1721[var6][var25] = var24.g4();
            }
        }
        byte[] var7 = arg0.method2("model_index", null);
        int var8 = this.field1754[0].length;
        this.field1712 = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.field1712[var9] = var7[var9];
            } else {
                this.field1712[var9] = 0;
            }
        }
        byte[] var10 = arg0.method2("map_index", null);
        Packet var11 = new Packet(true, var10);
        int var12 = var10.length / 7;
        this.field1723 = new int[var12];
        this.field1737 = new int[var12];
        this.field1742 = new int[var12];
        this.field1713 = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.field1723[var13] = var11.g2();
            this.field1737[var13] = var11.g2();
            this.field1742[var13] = var11.g2();
            this.field1713[var13] = var11.g1();
        }
        byte[] var14 = arg0.method2("anim_index", null);
        Packet var15 = new Packet(true, var14);
        int var16 = var14.length / 2;
        this.field1753 = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.field1753[var17] = var15.g2();
        }
        byte[] var18 = arg0.method2("midi_index", null);
        Packet var19 = new Packet(true, var18);
        int var20 = var18.length;
        this.field1743 = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.field1743[var21] = var19.g1();
        }
        this.field1750 = arg1;
        this.field1716 = true;
        this.field1750.method142(this, 2);
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(B)V")
    public final void method593(byte arg0) {
        LinkList var2 = this.field1735;
        synchronized (this.field1735) {
            this.field1735.method10();
        }
        if (arg0 != -125) {
            this.field1729 = !this.field1729;
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(IIB)V")
    public final void method594(int arg0, int arg1, byte arg2) {
        if (this.field1750.field524[0] == null || (this.field1754[arg1][arg0] == 0 || (this.field1714[arg1][arg0] == 0 || this.field1718 == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        if (arg2 != -113) {
            this.field1744 = 244;
        }
        var4.field1363 = arg1;
        var4.field1364 = arg0;
        var4.field1367 = false;
        LinkList var5 = this.field1735;
        synchronized (this.field1735) {
            this.field1735.method3(var4);
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "b", descriptor = "(Z)V")
    private final void method595(boolean arg0) {
        LinkList var2 = this.field1717;
        OnDemandRequest var3;
        synchronized (this.field1717) {
            var3 = (OnDemandRequest) this.field1717.method5();
        }
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        while (var3 != null) {
            this.field1715 = true;
            byte[] var5 = null;
            if (this.field1750.field524[0] != null) {
                var5 = this.field1750.field524[var3.field1363 + 1].method325(this.field1748, var3.field1364);
            }
            if (!this.method598(var5, 764, this.field1754[var3.field1363][var3.field1364], this.field1721[var3.field1363][var3.field1364])) {
                var5 = null;
            }
            LinkList var6 = this.field1717;
            synchronized (this.field1717) {
                if (var5 == null) {
                    this.field1728.method3(var3);
                } else {
                    var3.field1366 = var5;
                    LinkList var7 = this.field1734;
                    synchronized (this.field1734) {
                        this.field1734.method3(var3);
                    }
                }
                var3 = (OnDemandRequest) this.field1717.method5();
            }
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "c", descriptor = "()V")
    public final void method596() {
        this.field1716 = false;
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "c", descriptor = "(II)I")
    public final int method597(int arg0, int arg1) {
        if (arg1 != -31140) {
            this.field1757 = !this.field1757;
        }
        return this.field1754[arg0].length;
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "([BIII)Z")
    private final boolean method598(byte[] arg0, int arg1, int arg2, int arg3) {
        int var5 = 22 / arg1;
        if (arg0 == null || arg0.length < 2) {
            return false;
        }
        int var6 = arg0.length - 2;
        int var7 = ((arg0[var6] & 0xFF) << 8) + (arg0[var6 + 1] & 0xFF);
        this.field1731.reset();
        this.field1731.update(arg0, 0, var6);
        int var8 = (int) this.field1731.getValue();
        if (arg2 == var7) {
            return arg3 == var8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(ILQSLIGKQQ;)V")
    private final void method599(int arg0, OnDemandRequest arg1) {
        if (arg0 != 0) {
            return;
        }
        try {
            if (this.field1732 == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.field1755 < 4000L) {
                    return;
                }
                this.field1755 = var3;
                this.field1732 = this.field1750.method52(client.field220 + 43594);
                this.field1747 = this.field1732.getInputStream();
                this.field1726 = this.field1732.getOutputStream();
                this.field1726.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.field1747.read();
                }
                this.field1730 = 0;
            }
            this.field1741[0] = (byte) arg1.field1363;
            this.field1741[1] = (byte) (arg1.field1364 >> 8);
            this.field1741[2] = (byte) arg1.field1364;
            if (arg1.field1367) {
                this.field1741[3] = 2;
            } else if (this.field1750.field433) {
                this.field1741[3] = 0;
            } else {
                this.field1741[3] = 1;
            }
            this.field1726.write(this.field1741, 0, 4);
            this.field1752 = 0;
            this.field1756 = -10000;
        } catch (IOException var8) {
            try {
                this.field1732.close();
            } catch (Exception var7) {
            }
            this.field1732 = null;
            this.field1747 = null;
            this.field1726 = null;
            this.field1739 = 0;
            this.field1756++;
        }
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "d", descriptor = "(I)I")
    public final int method600(int arg0) {
        int var2 = 0 / arg0;
        return this.field1753.length;
    }

    @OriginalMember(owner = "client!ZPGPWCCV", name = "a", descriptor = "(IIII)I")
    public final int method601(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 0) {
            return 1;
        }
        int var5 = (arg1 << 8) + arg2;
        for (int var6 = 0; var6 < this.field1723.length; var6++) {
            if (this.field1723[var6] == var5) {
                if (arg3 == 0) {
                    return this.field1737[var6];
                }
                return this.field1742[var6];
            }
        }
        return -1;
    }
}
