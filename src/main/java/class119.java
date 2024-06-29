import java.applet.Applet;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class119 implements class141 {

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "Z")
    private boolean field1824 = true;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "[I")
    public static int[] field1818 = new int[25];

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field1822 = -1;

    @OriginalMember(owner = "client!ck", name = "A", descriptor = "Lck;")
    public static class119 field1839 = class298.method1987((byte) 49, "titlebg");

    @OriginalMember(owner = "client!ck", name = "B", descriptor = "Lck;")
    public static class119 field1840 = class298.method1987((byte) 57, "<br>");

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "I")
    public static int field1833 = 0;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field1862 = 0;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "Lck;")
    public static class119 field1828 = class298.method1987((byte) 31, "mobility");

    @OriginalMember(owner = "client!ck", name = "jb", descriptor = "Lck;")
    public static class119 field1874 = class298.method1987((byte) 61, "scape main");

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ck", name = "x", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!ck", name = "y", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ck", name = "N", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ck", name = "W", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ck", name = "eb", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ck", name = "fb", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ck", name = "gb", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ck", name = "hb", descriptor = "I")
    private int field1872;

    @OriginalMember(owner = "client!ck", name = "ib", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ck", name = "kb", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ck", name = "lb", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ck", name = "mb", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ck", name = "z", descriptor = "[B")
    public byte[] field1838;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)I", line = 12)
    public final int method748(int arg0) {
        field1870++;
        int var2 = 0;
        if (arg0 != 13677) {
            this.method756(false);
        }
        for (int var3 = 0; var3 < this.field1825; var3++) {
            var2 = (this.field1838[var3] & 0xFF) + ((var2 << 5) - var2);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)J", line = 34)
    private final long method749(int arg0) {
        if (arg0 != -1) {
            field1840 = (class119) null;
        }
        field1834++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1825; var4++) {
            var2 = (var2 << 5) + (long) (this.field1838[var4] & 0xFF) - var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILck;II)Lck;", line = 54)
    public final class119 method750(int arg0, class119 arg1, int arg2, int arg3) {
        field1821++;
        if (!this.field1824) {
            throw new IllegalArgumentException();
        } else if (arg2 <= arg3 && arg0 >= arg3 && arg0 <= arg1.field1825) {
            this.field1872 = 0;
            if ((this.field1825 + arg0 - arg3) > this.field1838.length) {
                int var5;
                for (var5 = 1; var5 < this.field1825 + arg1.field1825; var5 += var5) {
                }
                byte[] var6 = new byte[var5];
                class213.method1339(this.field1838, 0, var6, 0, this.field1825);
                this.field1838 = var6;
            }
            class213.method1339(arg1.field1838, arg3, this.field1838, this.field1825, arg0 - arg3);
            this.field1825 += arg0 - arg3;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLck;)I", line = 95)
    public final int method751(boolean arg0, class119 arg1) {
        field1864++;
        int var3;
        if (arg1.field1825 >= this.field1825) {
            var3 = this.field1825;
        } else {
            var3 = arg1.field1825;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if ((arg1.field1838[var4] & 0xFF) > (this.field1838[var4] & 0xFF)) {
                return -1;
            }
            if ((arg1.field1838[var4] & 0xFF) < (this.field1838[var4] & 0xFF)) {
                return 1;
            }
        }
        if (!arg0) {
            field1839 = (class119) null;
        }
        if (this.field1825 < arg1.field1825) {
            return -1;
        } else if (arg1.field1825 < this.field1825) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)Lck;", line = 140)
    public final class119 method752(int arg0) {
        field1853++;
        byte var2 = 2;
        class119 var3 = new class119();
        var3.field1825 = this.field1825;
        var3.field1838 = new byte[this.field1825];
        for (int var4 = 0; var4 < this.field1825; var4++) {
            byte var5 = this.field1838[var4];
            if (!(var5 < 97 || var5 > 122) || !(var5 < -32 || var5 > -2 || var5 == -9)) {
                if (var2 == 2) {
                    var5 = (byte) (var5 - 32);
                }
                var2 = 0;
            } else if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                if (var2 == 0) {
                    var5 = (byte) (var5 + 32);
                }
                var2 = 0;
            } else if (var5 == 46 || var5 == 33 || var5 == 63) {
                var2 = 2;
            } else if (var5 != 32) {
                var2 = 1;
            } else if (var2 != 2) {
                var2 = 1;
            }
            var3.field1838[var4] = var5;
        }
        if (arg0 != -11227) {
            field1818 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)Lck;", line = 203)
    public final class119 method753(int arg0) {
        field1823++;
        if (!this.field1824) {
            throw new IllegalArgumentException();
        }
        this.field1872 = arg0;
        if (this.field1838.length != this.field1825) {
            byte[] var2 = new byte[this.field1825];
            class213.method1339(this.field1838, 0, var2, 0, this.field1825);
            this.field1838 = var2;
        }
        return this;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)[B", line = 230)
    public final byte[] method754(byte arg0) {
        field1851++;
        if (this.field1825 == 0) {
            return new byte[0];
        }
        int var2 = this.field1825 + 3 & 0xFFFFFFFC;
        int var3 = var2 / 4 * 3;
        if (arg0 != -94) {
            this.field1825 = 78;
        }
        if (var2 - 2 >= this.field1825 || class263.method1704(16711935, this.field1838[var2 - 2]) == -1) {
            var3 -= 2;
        } else if (this.field1825 <= var2 - 1 || class263.method1704(16711935, this.field1838[var2 - 1]) == -1) {
            var3--;
        }
        byte[] var4 = new byte[var3];
        this.method760(0, var4, -770100542);
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BI)I", line = 260)
    public final int method755(byte arg0, int arg1) {
        if (arg0 > -25) {
            return -107;
        } else {
            field1816++;
            return this.field1838[arg1] & 0xFF;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)[B", line = 280)
    public final byte[] method756(boolean arg0) {
        if (arg0) {
            this.method772(-25, -44);
        }
        field1830++;
        byte[] var2 = new byte[this.field1825];
        class213.method1339(this.field1838, 0, var2, 0, this.field1825);
        return var2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/net/URL;B)Ljava/net/URL;", line = 295)
    public final URL method757(URL arg0, byte arg1) throws MalformedURLException {
        if (arg1 == -25) {
            field1827++;
            return new URL(arg0, new String(this.field1838, 0, this.field1825));
        } else {
            return (URL) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(II)I", line = 308)
    public final int method758(int arg0, int arg1) {
        if (arg1 == 13548) {
            field1829++;
            return this.method763(0, (byte) -116, arg0);
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lck;IB)I", line = 350)
    public final int method759(class119 arg0, int arg1, byte arg2) {
        field1814++;
        int[] var4 = new int[arg0.field1825];
        int[] var5 = new int[256];
        int[] var6 = new int[arg0.field1825];
        int var7 = 55 / ((arg2 - 27) / 60);
        for (int var8 = 0; var8 < var5.length; var8++) {
            var5[var8] = arg0.field1825;
        }
        for (int var9 = 1; var9 <= arg0.field1825; var9++) {
            var4[var9 - 1] = (arg0.field1825 << 1) - var9;
            var5[class19.method151(255, arg0.field1838[var9 - 1])] = arg0.field1825 - var9;
        }
        int var10 = arg0.field1825 + 1;
        int var11 = arg0.field1825;
        while (var11 > 0) {
            var6[var11 - 1] = var10;
            while (var10 <= arg0.field1825 && arg0.field1838[var10 - 1] != arg0.field1838[var11 - 1]) {
                if (var4[var10 - 1] >= arg0.field1825 - var11) {
                    var4[var10 - 1] = arg0.field1825 - var11;
                }
                var10 = var6[var10 - 1];
            }
            var11--;
            var10--;
        }
        int var12 = var10;
        int var13 = 0;
        int var14 = 1;
        int var15 = arg0.field1825 + 1 - var10;
        for (int var16 = 1; var16 <= var15; var16++) {
            var6[var16 - 1] = var13;
            while (var13 >= 1 && arg0.field1838[var13 - 1] != arg0.field1838[var16 - 1]) {
                var13 = var6[var13 - 1];
            }
            var13++;
        }
        while (var12 < arg0.field1825) {
            for (int var17 = var14; var17 <= var12; var17++) {
                if (var4[var17 - 1] >= var12 + arg0.field1825 - var17) {
                    var4[var17 - 1] = var12 + arg0.field1825 - var17;
                }
            }
            var14 = var12 + 1;
            var12 = var12 + var15 - var6[var15 - 1];
            var15 = var6[var15 - 1];
        }
        int var19;
        for (int var18 = arg1 - (1 - arg0.field1825); var18 < this.field1825; var18 += Math.max(var5[this.field1838[var18] & 0xFF], var4[var19])) {
            for (var19 = arg0.field1825 - 1; var19 >= 0 && this.field1838[var18] == arg0.field1838[var19]; var19--) {
                var18--;
            }
            if (var19 == -1) {
                return var18 + 1;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I[BI)I", line = 459)
    private final int method760(int arg0, byte[] arg1, int arg2) {
        if (arg2 != -770100542) {
            return -87;
        }
        field1852++;
        int var4 = arg0;
        for (int var5 = 0; var5 < this.field1825; var5 += 4) {
            int var6 = class263.method1704(16711935, this.field1838[var5]);
            int var7 = this.field1825 <= (var5 + 1) ? -1 : class263.method1704(16711935, this.field1838[var5 + 1]);
            int var8 = this.field1825 > (var5 + 2) ? class263.method1704(16711935, this.field1838[var5 + 2]) : -1;
            int var9 = this.field1825 <= var5 + 3 ? -1 : class263.method1704(arg2 + 786812477, this.field1838[var5 + 3]);
            arg1[arg0++] = (byte) class156.method998(var6 << 2, var7 >>> 4);
            if (var8 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class156.method998(var8 >>> 2, class19.method151(var7 << 4, 240));
            if (var9 == -1) {
                break;
            }
            arg1[arg0++] = (byte) class156.method998(var9, class19.method151(var8 << 6, 192));
        }
        return arg0 - var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILck;)Z", line = 505)
    public final boolean method761(int arg0, class119 arg1) {
        field1876++;
        if (arg1.field1825 > this.field1825) {
            return false;
        }
        for (int var3 = arg0; var3 < arg1.field1825; var3++) {
            if (this.field1838[var3] != arg1.field1838[var3]) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)Lck;", line = 527)
    public final class119 method762(int arg0, int arg1, int arg2) {
        field1866++;
        class119 var4 = new class119();
        var4.field1838 = new byte[arg0 - arg2];
        var4.field1825 = arg0 - arg2;
        class213.method1339(this.field1838, arg2, var4.field1838, arg1, var4.field1825);
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)I", line = 545)
    public final int method763(int arg0, byte arg1, int arg2) {
        field1815++;
        int var4 = -118 / ((arg1 + 30) / 42);
        byte var5 = (byte) arg2;
        for (int var6 = arg0; var6 < this.field1825; var6++) {
            if (this.field1838[var6] == var5) {
                return var6;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lva;BLva;)V", line = 569)
    public static final void method764(class36 arg0, byte arg1, class36 arg2) {
        field1848++;
        class29.field416 = arg0;
        class142.field2276 = arg2;
        if (arg1 < -69) {
            class86.field1307 = class142.field2276.method263(3, 100);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(BLck;)Z", line = 584)
    public final boolean method765(byte arg0, class119 arg1) {
        field1858++;
        if (arg1.field1825 > this.field1825) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field1825; var3++) {
            byte var4 = this.field1838[var3];
            byte var5 = arg1.field1838[var3];
            if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                var5 = (byte) (var5 + 32);
            }
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            if (var4 != var5) {
                return false;
            }
        }
        if (arg0 <= 52) {
            this.method768(53);
        }
        return true;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)Ljava/net/URL;", line = 620)
    public final URL method766(byte arg0) throws MalformedURLException {
        field1854++;
        if (arg0 != 37) {
            this.method794(-79, -109, (Graphics) null, 122);
        }
        return new URL(new String(this.field1838, 0, this.field1825));
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(II)Lck;", line = 637)
    public final class119 method767(int arg0, int arg1) {
        field1836++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException("invalid char");
        }
        class119 var3 = new class119();
        var3.field1838 = new byte[this.field1825 + 1];
        int var4 = -38 / ((arg1 + 59) / 55);
        var3.field1825 = this.field1825 + 1;
        class213.method1339(this.field1838, 0, var3.field1838, 0, this.field1825);
        var3.field1838[this.field1825] = (byte) arg0;
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(I)Lck;", line = 662)
    public final class119 method768(int arg0) {
        field1817++;
        long var2 = this.method749(arg0 - 4097);
        synchronized (ck.class) {
            if (arg0 != 4096) {
                return (class119) null;
            }
            if (class181.field2868 == null) {
                class181.field2868 = new class212(4096);
            } else {
                for (class99 var5 = (class99) class181.field2868.method1329((byte) 90, var2); var5 != null; var5 = (class99) class181.field2868.method1327((byte) -62)) {
                    if (this.method784(var5.field1510, 68)) {
                        return var5.field1510;
                    }
                }
            }
            class99 var6 = new class99();
            var6.field1510 = this;
            this.field1824 = false;
            class181.field2868.method1326(var2, (byte) -105, var6);
            return this;
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(II)Lck;", line = 701)
    public final class119 method769(int arg0, int arg1) {
        field1843++;
        if (arg0 > -50) {
            this.method795((class119) null, (byte) 83);
        }
        return this.method762(this.field1825, 0, arg1);
    }

    @OriginalMember(owner = "client!ck", name = "hashCode", descriptor = "()I", line = 721)
    public final int hashCode() {
        field1850++;
        return this.method748(13677);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III[[[BIBII)V", line = 730)
    public static final void method770(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class64.field1017++;
        class22.field304 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class146.field2343; var12 < class35.field481; var12++) {
            class104[][] var13 = class150.field2390[var12];
            for (int var14 = class10.field186; var14 < class75.field1167; var14++) {
                for (int var15 = class99.field1511; var15 < class114.field1724; var15++) {
                    class104 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (var16.field1604 <= class269.field4433 && class168.field2648[var14 + class153.field2442 - class257.field4121][var15 + class153.field2442 - class208.field3327] && arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5) {
                            var16.field1613 = true;
                            var16.field1611 = true;
                            if (var16.field1596 > 0) {
                                var16.field1616 = true;
                            } else {
                                var16.field1616 = false;
                            }
                            class22.field304++;
                        } else {
                            var16.field1613 = false;
                            var16.field1611 = false;
                            var16.field1597 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field1593 != null) {
                                    class146 var17 = var16.field1593;
                                    var17.field2348.method1415(var17.field2344, var17.field2340, var17.field2344, -10270, var17.field2340);
                                    if (var17.field2347 != null) {
                                        var17.field2347.method1415(var17.field2344, var17.field2340, var17.field2344, -10270, var17.field2340);
                                    }
                                }
                                if (var16.field1590 != null) {
                                    class106 var18 = var16.field1590;
                                    var18.field1627.method1415(var18.field1622, var18.field1621, var18.field1622, -10270, var18.field1621);
                                    if (var18.field1633 != null) {
                                        var18.field1633.method1415(var18.field1622, var18.field1621, var18.field1622, -10270, var18.field1621);
                                    }
                                }
                                if (var16.field1598 != null) {
                                    class199 var19 = var16.field1598;
                                    var19.field3178.method1415(var19.field3174, var19.field3179, var19.field3174, -10270, var19.field3179);
                                }
                                if (var16.field1610 != null) {
                                    for (int var20 = 0; var20 < var16.field1596; var20++) {
                                        class196 var21 = var16.field1610[var20];
                                        var21.field3140.method1415(var21.field3131, var21.field3146, var21.field3136, -10270, var21.field3137);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class57.field926 == class259.field4144;
        GL var23 = class264.field4313;
        var23.glPushMatrix();
        var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        if (var22) {
            class134.method882();
            class103.method677(-1, 30359, 3);
            class203.field3213 = true;
            class115.method728();
            class93.field1444 = -1;
            class238.field3821 = -1;
            for (int var24 = 0; var24 < class25.field376[0].length; var24++) {
                class145 var25 = class25.field376[0][var24];
                float var26 = 251.5F - (var25.field2311 ? 1.0F : 0.5F);
                if (class93.field1444 != var25.field2315) {
                    class93.field1444 = var25.field2315;
                    class176.method1126(var25.field2315, (byte) -9);
                    class178.method1142(class167.method1054(-23149));
                }
                var25.method947(class150.field2390, var26, false);
            }
            class115.method731();
        } else {
            for (int var27 = class146.field2343; var27 < class35.field481; var27++) {
                for (int var28 = 0; var28 < class25.field376[var27].length; var28++) {
                    class145 var29 = class25.field376[var27][var28];
                    float var30 = 201.5F - (float) var27 * 50.0F - (var29.field2311 ? 1.0F : 0.5F);
                    if (var29.field2322 != -1 && class284.field4692.method133(var29.field2322, true) == 4 && class10.field184) {
                        class176.method1126(var29.field2315, (byte) -93);
                    }
                    var29.method947(class150.field2390, var30, false);
                }
                if (var27 == 0 && class153.field2434 > 0) {
                    class264.method1740(101.5F);
                    class172.method1097(class257.field4121, class208.field3327, class153.field2442, arg1, class168.field2648, class57.field926[0]);
                }
            }
            class125.method832(class257.field4121, class208.field3327, class150.field2390, class269.field4433);
        }
        var23.glPopMatrix();
        for (int var31 = class146.field2343; var31 < class35.field481; var31++) {
            class104[][] var32 = class150.field2390[var31];
            for (int var33 = -class153.field2442; var33 <= 0; var33++) {
                int var34 = class257.field4121 + var33;
                int var35 = class257.field4121 - var33;
                if (var34 >= class10.field186 || var35 < class75.field1167) {
                    for (int var36 = -class153.field2442; var36 <= 0; var36++) {
                        int var37 = class208.field3327 + var36;
                        int var38 = class208.field3327 - var36;
                        if (var34 >= class10.field186) {
                            if (var37 >= class99.field1511) {
                                class104 var39 = var32[var34][var37];
                                if (var39 != null && var39.field1613) {
                                    class139.method913(var39, true);
                                }
                            }
                            if (var38 < class114.field1724) {
                                class104 var40 = var32[var34][var38];
                                if (var40 != null && var40.field1613) {
                                    class139.method913(var40, true);
                                }
                            }
                        }
                        if (var35 < class75.field1167) {
                            if (var37 >= class99.field1511) {
                                class104 var41 = var32[var35][var37];
                                if (var41 != null && var41.field1613) {
                                    class139.method913(var41, true);
                                }
                            }
                            if (var38 < class114.field1724) {
                                class104 var42 = var32[var35][var38];
                                if (var42 != null && var42.field1613) {
                                    class139.method913(var42, true);
                                }
                            }
                        }
                        if (class22.field304 == 0) {
                            if (!var22) {
                                class4.field121 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class146.field2343; var43 < class35.field481; var43++) {
            class104[][] var44 = class150.field2390[var43];
            for (int var45 = -class153.field2442; var45 <= 0; var45++) {
                int var46 = class257.field4121 + var45;
                int var47 = class257.field4121 - var45;
                if (var46 >= class10.field186 || var47 < class75.field1167) {
                    for (int var48 = -class153.field2442; var48 <= 0; var48++) {
                        int var49 = class208.field3327 + var48;
                        int var50 = class208.field3327 - var48;
                        if (var46 >= class10.field186) {
                            if (var49 >= class99.field1511) {
                                class104 var51 = var44[var46][var49];
                                if (var51 != null && var51.field1613) {
                                    class139.method913(var51, false);
                                }
                            }
                            if (var50 < class114.field1724) {
                                class104 var52 = var44[var46][var50];
                                if (var52 != null && var52.field1613) {
                                    class139.method913(var52, false);
                                }
                            }
                        }
                        if (var47 < class75.field1167) {
                            if (var49 >= class99.field1511) {
                                class104 var53 = var44[var47][var49];
                                if (var53 != null && var53.field1613) {
                                    class139.method913(var53, false);
                                }
                            }
                            if (var50 < class114.field1724) {
                                class104 var54 = var44[var47][var50];
                                if (var54 != null && var54.field1613) {
                                    class139.method913(var54, false);
                                }
                            }
                        }
                        if (class22.field304 == 0) {
                            if (!var22) {
                                class4.field121 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class4.field121 = false;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(II)[Lck;", line = 1099)
    public final class119[] method771(int arg0, int arg1) {
        field1820++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1825; var4++) {
            if (this.field1838[var4] == arg1) {
                var3++;
            }
        }
        class119[] var5 = new class119[var3 + 1];
        if (var3 == 0) {
            var5[0] = this;
            return var5;
        }
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        if (arg0 != -256) {
            field1828 = (class119) null;
        }
        while (var8 < var3) {
            int var9;
            for (var9 = 0; this.field1838[var7 + var9] != arg1; var9++) {
            }
            var5[var6++] = this.method762(var7 + var9, 0, var7);
            var7 += var9 + 1;
            var8++;
        }
        var5[var3] = this.method762(this.field1825, 0, var7);
        return var5;
    }

    @OriginalMember(owner = "client!ck", name = "toString", descriptor = "()Ljava/lang/String;", line = 1171)
    public final String toString() {
        field1819++;
        throw new RuntimeException();
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(II)Z", line = 1189)
    private final boolean method772(int arg0, int arg1) {
        field1869++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        if (arg0 >= -120) {
            return false;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < this.field1825; var6++) {
            int var7 = this.field1838[var6] & 0xFF;
            if (var6 == 0) {
                if (var7 == 45) {
                    var3 = true;
                    continue;
                }
                if (var7 == 43) {
                    continue;
                }
            }
            if (var7 >= 48 && var7 <= 57) {
                var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
                var7 -= 55;
            } else if (var7 >= 97 && var7 <= 122) {
                var7 -= 87;
            } else {
                return false;
            }
            if (var7 >= arg1) {
                return false;
            }
            if (var3) {
                var7 = -var7;
            }
            int var8 = arg1 * var5 + var7;
            if (var8 / arg1 != var5) {
                return false;
            }
            var4 = true;
            var5 = var8;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([BIIII)I", line = 1263)
    public final int method773(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        class213.method1339(this.field1838, arg4, arg0, arg3, arg2 - arg4);
        if (arg1 != -25361) {
            this.method794(23, 16, (Graphics) null, -1);
        }
        field1841++;
        return arg2 - arg4;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/applet/Applet;B)Ljava/lang/Object;", line = 1282)
    public final Object method774(Applet arg0, byte arg1) throws Throwable {
        String var3 = new String(this.field1838, 0, this.field1825);
        Object var4 = class107.method693((Object[]) null, (byte) -87, arg0, var3);
        if (var4 instanceof String) {
            byte[] var5 = ((String) var4).getBytes();
            var4 = class250.method1615(var5, var5.length, 0, -104);
        }
        field1847++;
        if (arg1 >= -100) {
            this.field1872 = -42;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 1303)
    public final boolean equals(Object arg0) {
        field1855++;
        if (!(arg0 instanceof class119)) {
            throw new IllegalArgumentException();
        }
        return this.method784((class119) arg0, 119);
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(BI)Lck;", line = 1321)
    public final class119 method775(byte arg0, int arg1) {
        field1846++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException("invalid char:" + arg1);
        } else if (this.field1824) {
            this.field1872 = 0;
            if (this.field1838.length == this.field1825) {
                int var3;
                for (var3 = 1; var3 <= this.field1825; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class213.method1339(this.field1838, 0, var4, 0, this.field1825);
                this.field1838 = var4;
            }
            if (arg0 <= 56) {
                this.method773((byte[]) null, -18, -45, -12, 24);
            }
            this.field1838[this.field1825++] = (byte) arg1;
            return this;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(B)I", line = 1362)
    public final int method776(byte arg0) {
        field1842++;
        if (arg0 > -13) {
            field1828 = (class119) null;
        }
        return this.field1825;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lck;I)Lck;", line = 1373)
    public final class119 method777(class119 arg0, int arg1) {
        field1867++;
        if (!this.field1824) {
            throw new IllegalArgumentException();
        }
        int var3 = -91 / ((arg1 + 63) / 38);
        this.field1872 = 0;
        if (this.field1838.length < (this.field1825 + arg0.field1825)) {
            int var4;
            for (var4 = 1; var4 < (this.field1825 + arg0.field1825); var4 += var4) {
            }
            byte[] var5 = new byte[var4];
            class213.method1339(this.field1838, 0, var5, 0, this.field1825);
            this.field1838 = var5;
        }
        class213.method1339(arg0.field1838, 0, this.field1838, this.field1825, arg0.field1825);
        this.field1825 += arg0.field1825;
        return this;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(ILck;)I", line = 1408)
    public final int method778(int arg0, class119 arg1) {
        field1865++;
        int var3 = -122 / ((-arg0 - 10) / 34);
        int var4;
        if (this.field1825 <= arg1.field1825) {
            var4 = this.field1825;
        } else {
            var4 = arg1.field1825;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            if (class106.field1625[arg1.field1838[var5] & 0xFF] > class106.field1625[this.field1838[var5] & 0xFF]) {
                return -1;
            }
            if (class106.field1625[arg1.field1838[var5] & 0xFF] < class106.field1625[this.field1838[var5] & 0xFF]) {
                return 1;
            }
        }
        if (this.field1825 < arg1.field1825) {
            return -1;
        } else if (arg1.field1825 < this.field1825) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Z)Lck;", line = 1453)
    public final class119 method779(boolean arg0) {
        field1832++;
        class119 var2 = new class119();
        var2.field1825 = this.field1825;
        var2.field1838 = new byte[this.field1825];
        for (int var3 = 0; var3 < this.field1825; var3++) {
            byte var4 = this.field1838[var3];
            if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                var4 = (byte) (var4 + 32);
            }
            var2.field1838[var3] = var4;
        }
        if (arg0) {
            return (class119) null;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/applet/Applet;)V", line = 1484)
    public final void method780(int arg0, Applet arg1) throws Throwable {
        int var3 = 117 / ((arg0 - 65) / 57);
        field1844++;
        String var4 = new String(this.field1838, 0, this.field1825);
        class107.method694(var4, -5201, arg1);
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(II)I", line = 1503)
    public final int method781(int arg0, int arg1) {
        field1875++;
        if (arg1 < 1 || arg1 > 36) {
            arg1 = 10;
        }
        boolean var3 = false;
        boolean var4 = false;
        int var5 = 0;
        int var6 = 0;
        int var7 = 89 / ((-arg0 - 24) / 60);
        while (var6 < this.field1825) {
            label82: {
                int var8 = this.field1838[var6] & 0xFF;
                if (var6 == 0) {
                    if (var8 == 45) {
                        var3 = true;
                        break label82;
                    }
                    if (var8 == 43) {
                        break label82;
                    }
                }
                if (var8 >= 48 && var8 <= 57) {
                    var8 -= 48;
                } else if (var8 >= 65 && var8 <= 90) {
                    var8 -= 55;
                } else if (var8 >= 97 && var8 <= 122) {
                    var8 -= 87;
                } else {
                    throw new NumberFormatException();
                }
                if (arg1 <= var8) {
                    throw new NumberFormatException();
                }
                if (var3) {
                    var8 = -var8;
                }
                int var9 = arg1 * var5 + var8;
                if ((var9 / arg1) != var5) {
                    throw new NumberFormatException();
                }
                var4 = true;
                var5 = var9;
            }
            var6++;
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var5;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(I)Lck;", line = 1587)
    public final class119 method782(int arg0) {
        field1835++;
        int var2 = 24 % ((arg0 - 22) / 62);
        class119 var3 = class147.method963((byte) 0, this.method786((byte) 112));
        return var3 == null ? class206.field3290 : var3;
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(B)I", line = 1609)
    public final int method783(byte arg0) {
        field1877++;
        return arg0 == 65 ? this.method781(-128, 10) : -8;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Lck;I)Z", line = 1620)
    public final boolean method784(class119 arg0, int arg1) {
        if (arg1 < 42) {
            this.method758(-70, 62);
        }
        field1849++;
        if (arg0 == null) {
            return false;
        } else if (this.field1825 == arg0.field1825) {
            if (!this.field1824 || !arg0.field1824) {
                if (this.field1872 == 0) {
                    this.field1872 = this.method748(13677);
                    if (this.field1872 == 0) {
                        this.field1872 = 1;
                    }
                }
                if (arg0.field1872 == 0) {
                    arg0.field1872 = arg0.method748(13677);
                    if (arg0.field1872 == 0) {
                        arg0.field1872 = 1;
                    }
                }
                if (this.field1872 != arg0.field1872) {
                    return false;
                }
            }
            for (int var3 = 0; var3 < this.field1825; var3++) {
                if (this.field1838[var3] != arg0.field1838[var3]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)Lck;", line = 1676)
    public final class119 method785(int arg0) {
        if (arg0 <= 53) {
            return (class119) null;
        }
        field1860++;
        boolean var2 = true;
        class119 var3 = new class119();
        var3.field1825 = this.field1825;
        var3.field1838 = new byte[this.field1825];
        for (int var4 = 0; var4 < this.field1825; var4++) {
            byte var5 = this.field1838[var4];
            if (var5 == 95) {
                var3.field1838[var4] = 32;
                var2 = true;
            } else if (var5 >= 97 && var5 <= 122 && var2) {
                var2 = false;
                var3.field1838[var4] = (byte) (var5 - 32);
            } else {
                var3.field1838[var4] = var5;
                var2 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)J", line = 1720)
    public final long method786(byte arg0) {
        if (arg0 != 112) {
            field1833 = 43;
        }
        field1868++;
        long var2 = 0L;
        for (int var4 = 0; var4 < this.field1825 && var4 < 12; var4++) {
            byte var5 = this.field1838[var4];
            var2 *= 37L;
            if (var5 >= 65 && var5 <= 90) {
                var2 += (long) (1 - (65 - var5));
            } else if (var5 >= 97 && var5 <= 122) {
                var2 += (long) (var5 + 1 - 97);
            } else if (var5 >= 48 && var5 <= 57) {
                var2 += (long) (var5 + 27 - 48);
            }
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "(B)Lck;", line = 1764)
    public final class119 method787(byte arg0) {
        int var2 = this.field1825;
        field1861++;
        int var3;
        for (var3 = 0; this.field1825 > var3 && (this.field1838[var3] >= 0 && this.field1838[var3] <= 32 || (this.field1838[var3] & 0xFF) == 160); var3++) {
        }
        while (var3 < var2 && (this.field1838[var2 - 1] >= 0 && this.field1838[var2 - 1] <= 32 || (this.field1838[var2 - 1] & 0xFF) == 160)) {
            var2--;
        }
        if (var3 == 0 && this.field1825 == var2) {
            return this;
        }
        class119 var4 = new class119();
        if (arg0 != 25) {
            return (class119) null;
        }
        var4.field1825 = var2 - var3;
        var4.field1838 = new byte[var4.field1825];
        for (int var5 = 0; var5 < var4.field1825; var5++) {
            var4.field1838[var5] = this.field1838[var3 + var5];
        }
        return var4;
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(ILck;)I", line = 1799)
    public final int method788(int arg0, class119 arg1) {
        field1873++;
        if (arg0 != 1) {
            this.method753(-34);
        }
        return this.method759(arg1, 0, (byte) 122);
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)V", line = 1810)
    public static void method789(int arg0) {
        if (arg0 != 8) {
            return;
        }
        field1818 = null;
        field1840 = null;
        field1828 = null;
        field1839 = null;
        field1874 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI)V", line = 1831)
    public final void method790(boolean arg0, int arg1) {
        field1857++;
        this.field1872 = 0;
        if (!arg0) {
            field1818 = (int[]) null;
        }
        if (!this.field1824) {
            throw new IllegalArgumentException();
        } else if (arg1 < 0) {
            throw new IllegalArgumentException();
        } else {
            if (arg1 > this.field1838.length) {
                int var3;
                for (var3 = 1; var3 < arg1; var3 += var3) {
                }
                byte[] var4 = new byte[var3];
                class213.method1339(this.field1838, 0, var4, 0, this.field1825);
                this.field1838 = var4;
            }
            for (int var5 = this.field1825; var5 < arg1; var5++) {
                this.field1838[var5] = 32;
            }
            this.field1825 = arg1;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(III)Lck;", line = 1883)
    public final class119 method791(int arg0, int arg1, int arg2) {
        if (arg2 != -16833) {
            field1818 = (int[]) null;
        }
        byte var4 = (byte) arg0;
        field1863++;
        class119 var5 = new class119();
        var5.field1825 = this.field1825;
        byte var6 = (byte) arg1;
        var5.field1838 = new byte[this.field1825];
        for (int var7 = 0; var7 < this.field1825; var7++) {
            byte var8 = this.field1838[var7];
            if (var4 == var8) {
                var5.field1838[var7] = var6;
            } else {
                var5.field1838[var7] = var8;
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/applet/Applet;I)Lck;", line = 1920)
    public final class119 method792(Applet arg0, int arg1) {
        String var3 = new String(this.field1838, arg1, this.field1825);
        String var4 = arg0.getParameter(var3);
        field1845++;
        return var4 == null ? null : class144.method943(var4, -6236);
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(Lck;I)Z", line = 1940)
    public final boolean method793(class119 arg0, int arg1) {
        field1859++;
        if (arg0 == null) {
            return false;
        } else if (this.field1825 == arg0.field1825) {
            if (arg1 != 40) {
                field1818 = (int[]) null;
            }
            for (int var3 = 0; var3 < this.field1825; var3++) {
                byte var4 = this.field1838[var3];
                if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
                    var4 = (byte) (var4 + 32);
                }
                byte var5 = arg0.field1838[var3];
                if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
                    var5 = (byte) (var5 + 32);
                }
                if (var4 != var5) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILjava/awt/Graphics;I)V", line = 1995)
    public final void method794(int arg0, int arg1, Graphics arg2, int arg3) {
        String var5;
        try {
            var5 = new String(this.field1838, 0, this.field1825, "ISO-8859-1");
        } catch (UnsupportedEncodingException var7) {
            var5 = new String(this.field1838, 0, this.field1825);
        }
        if (arg1 < 46) {
            field1818 = (int[]) null;
        }
        field1837++;
        arg2.drawString(var5, arg3, arg0);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lck;B)Z", line = 2014)
    public final boolean method795(class119 arg0, byte arg1) {
        field1826++;
        if (arg1 > -58) {
            return true;
        } else if (this.field1825 >= arg0.field1825) {
            int var3 = this.field1825 - arg0.field1825;
            for (int var4 = 0; var4 < arg0.field1825; var4++) {
                if (this.field1838[var4 + var3] != arg0.field1838[var4]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(B)Z", line = 2042)
    public final boolean method796(byte arg0) {
        field1871++;
        return arg0 == 95 ? this.method772(arg0 - 219, 10) : false;
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)V", line = 2062)
    public final void method797(int arg0) {
        field1856++;
        String var2;
        try {
            var2 = new String(this.field1838, 0, this.field1825, "ISO-8859-1");
        } catch (UnsupportedEncodingException var4) {
            var2 = new String(this.field1838, 0, this.field1825);
        }
        System.out.println(var2);
        if (arg0 != 7999) {
            field1828 = (class119) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 2081)
    public static final void method798(Component arg0, byte arg1) {
        if (arg1 < 9) {
            return;
        }
        Method var2 = class282.field4657;
        field1813++;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class242.field3888);
        arg0.addFocusListener(class242.field3888);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILjava/awt/FontMetrics;)I", line = 2110)
    public final int method799(int arg0, FontMetrics arg1) {
        String var3;
        try {
            var3 = new String(this.field1838, arg0, this.field1825, "ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var3 = new String(this.field1838, 0, this.field1825);
        }
        field1831++;
        return arg1.stringWidth(var3);
    }
}
