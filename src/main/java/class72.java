import java.awt.Component;
import java.awt.Graphics;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class72 {

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "[B")
    private byte[] field1833 = new byte[4];

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "Ljc;")
    private class65 field1835;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    private int field1831;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "J")
    private long field1827;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lkd;")
    public static class73 field1817 = class126.method1070((byte) -66, "sl_back");

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "Lkd;")
    private static class73 field1839 = class126.method1070((byte) -66, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "Lkd;")
    public static class73 field1828 = class126.method1070((byte) -66, "");

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field1837 = 0;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lkd;")
    private static class73 field1825 = class126.method1070((byte) -66, "Moderator option: Mute player for 48 hours: <OFF>");

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Lkd;")
    public static class73 field1820 = field1825;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Lkd;")
    public static class73 field1841 = field1839;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "Lkd;")
    private static class73 field1842 = class126.method1070((byte) -66, "Username: ");

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "Lkd;")
    public static class73 field1843 = class126.method1070((byte) -66, "compass");

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Lkd;")
    public static class73 field1844 = field1842;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    private int field1818;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    private int field1821;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1823;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "[B")
    private byte[] field1829;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
    public static int[] field1819;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public static final void method598(byte arg0) {
        int var1 = 114 / ((81 - arg0) / 38);
        Object var2 = class53.field1401;
        synchronized (class53.field1401) {
            if (class49.field1309 == 0) {
                class107.field2637.method1176(5, new class153(), (byte) 78);
            }
            class49.field1309 = 600;
        }
        field1832++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Lkd;")
    public static final class73 method599(int arg0, int arg1, int arg2) {
        field1830++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class123.field3137;
        } else if (var3 < -6) {
            return class42.field1126;
        } else if (var3 < -3) {
            return class18.field526;
        } else if (var3 < 0) {
            return class13.field414;
        } else if (var3 > 9) {
            return class84.field2126;
        } else if (var3 > 6) {
            return class82.field2066;
        } else if (var3 > 3) {
            return class151.field3751;
        } else if (arg1 > ~var3) {
            return class145.field3594;
        } else {
            return class5.field189;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;III)Lbc;")
    public static final class11 method600(Component arg0, int arg1, int arg2, int arg3) {
        field1838++;
        try {
            if (arg3 == -30723) {
                Class var4 = Class.forName("vb");
                class11 var5 = (class11) var4.getDeclaredConstructor().newInstance();
                var5.method96(arg1, arg0, (byte) -99, arg2);
                return var5;
            } else {
                return null;
            }
        } catch (Throwable var7) {
            class15 var6 = new class15();
            var6.method96(arg1, arg0, (byte) -104, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static final void method601(int arg0) {
        field1840++;
        try {
            Graphics var1 = class18.field519.getGraphics();
            class142.field3542.method98(553, arg0, arg0 - 17166, var1);
        } catch (Exception var2) {
            class18.field519.repaint();
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)[B")
    public final byte[] method602(byte arg0) throws IOException {
        field1834++;
        if (class146.method1168(-99) > this.field1827) {
            throw new IOException("fdt");
        }
        if (this.field1831 == 0) {
            if (this.field1835.field1695 == 2) {
                throw new IOException("fds");
            }
            if (this.field1835.field1695 == 1) {
                this.field1823 = (DataInputStream) this.field1835.field1693;
                this.field1831 = 1;
            }
        }
        if (this.field1831 == 1) {
            int var2 = this.field1823.available();
            if (var2 > 0) {
                if (this.field1821 + var2 > 4) {
                    var2 = 4 - this.field1821;
                }
                this.field1821 += this.field1823.read(this.field1833, this.field1821, var2);
                if (this.field1821 == 4) {
                    int var3 = (new class114(this.field1833)).method973(-127);
                    this.field1831 = 2;
                    this.field1829 = new byte[var3];
                }
            }
        }
        if (this.field1831 == 2) {
            int var4 = this.field1823.available();
            if (var4 > 0) {
                if (this.field1829.length < this.field1818 + var4) {
                    var4 = this.field1829.length - this.field1818;
                }
                this.field1818 += this.field1823.read(this.field1829, this.field1818, var4);
                if (this.field1829.length == this.field1818) {
                    return this.field1829;
                }
            }
        }
        if (arg0 > -27) {
            field1817 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)Lrc;")
    public static final class121 method603(int arg0, int arg1) {
        field1836++;
        class121 var2 = (class121) class26.field760.method538(arg1 + 1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class11.field334.method898((byte) -92, arg0, 13);
        class121 var4 = new class121();
        var4.field3091 = arg0;
        if (var3 != null) {
            var4.method1034(new class114(var3), 128);
        }
        if (arg1 != -1) {
            method600(null, -12, 116, -117);
        }
        class26.field760.method542(var4, -901, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static void method604(int arg0) {
        field1844 = null;
        field1843 = null;
        if (arg0 >= -58) {
            field1842 = null;
        }
        field1828 = null;
        field1825 = null;
        field1817 = null;
        field1841 = null;
        field1842 = null;
        field1819 = null;
        field1820 = null;
        field1839 = null;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lw;Ljava/net/URL;)V")
    public class72(class148 arg0, URL arg1) {
        this.field1835 = arg0.method1183(-6884, arg1);
        this.field1831 = 0;
        this.field1827 = class146.method1168(-101) + 30000L;
    }
}
