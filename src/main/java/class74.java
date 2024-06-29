import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class74 {

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    private int field1855 = 0;

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    private int field1839;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "[Llc;")
    private class69[] field1843;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[[[B")
    public static byte[][][] field1836 = new byte[4][104][104];

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Ljava/lang/Object;")
    public static Object field1831 = new Object();

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lmc;")
    private static class75 field1845 = class30.method234(true, "Choose Option");

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
    public static int field1849 = 0;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field1848 = 0;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "Lmc;")
    private static class75 field1857 = class30.method234(true, "On");

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lmc;")
    public static class75 field1846 = class30.method234(true, "System)2Update in: ");

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "Lmc;")
    public static class75 field1847 = class30.method234(true, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "Lmc;")
    public static class75 field1852 = field1845;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "Lmc;")
    public static class75 field1858 = class30.method234(true, "Icons redrawn");

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Lmc;")
    public static class75 field1850 = field1857;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "[[B")
    public static byte[][] field1859 = new byte[50][];

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field1853 = 0;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "Lmc;")
    public static class75 field1844 = class30.method234(true, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "J")
    private long field1829;

    @OriginalMember(owner = "client!mb", name = "w", descriptor = "Llc;")
    private class69 field1851;

    @OriginalMember(owner = "client!mb", name = "B", descriptor = "Llc;")
    private class69 field1856;

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "[[Lqc;")
    public static class99[][] field1854;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 7)
    public static final void method610(int arg0, int arg1) {
        field1835++;
        if (!class129.method1013(arg0, -1)) {
            return;
        }
        class99[] var2 = field1854[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class99 var4 = var2[var3];
            if (var4 != null) {
                var4.field2499 = 0;
                var4.field2487 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Llc;", line = 36)
    public final class69 method611(int arg0) {
        field1840++;
        if (this.field1851 == null) {
            return null;
        }
        class69 var2 = this.field1843[(int) (this.field1829 & (long) (this.field1839 + arg0))];
        while (this.field1851 != var2) {
            if (this.field1851.field1765 == this.field1829) {
                class69 var3 = this.field1851;
                this.field1851 = this.field1851.field1760;
                return var3;
            }
            this.field1851 = this.field1851.field1760;
        }
        this.field1851 = null;
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 66)
    public static void method612(byte arg0) {
        field1847 = null;
        field1846 = null;
        field1858 = null;
        field1845 = null;
        field1859 = null;
        field1850 = null;
        field1854 = null;
        field1836 = null;
        field1857 = null;
        field1844 = null;
        int var1 = -27 % ((arg0 + 72) / 37);
        field1852 = null;
        field1831 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJLlc;)V", line = 88)
    public final void method613(int arg0, long arg1, class69 arg2) {
        if (arg2.field1771 != null) {
            arg2.method589(true);
        }
        class69 var5 = this.field1843[(int) ((long) (this.field1839 + arg0) & arg1)];
        arg2.field1771 = var5.field1771;
        arg2.field1760 = var5;
        arg2.field1771.field1760 = arg2;
        field1841++;
        arg2.field1765 = arg1;
        arg2.field1760.field1771 = arg2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJ)Llc;", line = 107)
    public final class69 method614(int arg0, long arg1) {
        if (arg0 > -29) {
            this.field1851 = null;
        }
        field1830++;
        this.field1829 = arg1;
        class69 var4 = this.field1843[(int) ((long) (this.field1839 - 1) & arg1)];
        for (this.field1851 = var4.field1760; this.field1851 != var4; this.field1851 = this.field1851.field1760) {
            if (this.field1851.field1765 == arg1) {
                class69 var5 = this.field1851;
                this.field1851 = this.field1851.field1760;
                return var5;
            }
        }
        this.field1851 = null;
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLib;)V", line = 144)
    public static final void method615(byte arg0, class50 arg1) {
        field1832++;
        if (arg0 < 113) {
            method612((byte) 70);
        }
        arg1.field1208 = false;
        if (arg1.field1219 != -1) {
            class107 var2 = class37.method289(arg1.field1219, (byte) -126);
            arg1.field1239++;
            if (arg1.field1264 < var2.field2662.length && var2.field2675[arg1.field1264] < arg1.field1239) {
                arg1.field1239 = 1;
                arg1.field1264++;
            }
            if (var2.field2662.length <= arg1.field1264) {
                arg1.field1239 = 0;
                arg1.field1264 = 0;
            }
        }
        if (arg1.field1216 != -1 && arg1.field1229 <= class34.field781) {
            if (arg1.field1255 < 0) {
                arg1.field1255 = 0;
            }
            int var3 = class64.method564(97, arg1.field1216).field2124;
            if (var3 == -1) {
                arg1.field1216 = -1;
            } else {
                class107 var4 = class37.method289(var3, (byte) -125);
                arg1.field1214++;
                if (var4.field2662.length > arg1.field1255 && arg1.field1214 > var4.field2675[arg1.field1255]) {
                    arg1.field1255++;
                    arg1.field1214 = 1;
                }
                if (var4.field2662.length <= arg1.field1255 && (arg1.field1255 < 0 || var4.field2662.length <= arg1.field1255)) {
                    arg1.field1216 = -1;
                }
            }
        }
        if (arg1.field1265 != -1 && arg1.field1227 <= 1) {
            class107 var5 = class37.method289(arg1.field1265, (byte) -125);
            if (var5.field2674 == 1 && arg1.field1226 > 0 && class34.field781 >= arg1.field1200 && arg1.field1247 < class34.field781) {
                arg1.field1227 = 1;
                return;
            }
        }
        if (arg1.field1265 != -1 && arg1.field1227 == 0) {
            class107 var6 = class37.method289(arg1.field1265, (byte) -125);
            arg1.field1268++;
            if (var6.field2662.length > arg1.field1273 && var6.field2675[arg1.field1273] < arg1.field1268) {
                arg1.field1273++;
                arg1.field1268 = 1;
            }
            if (var6.field2662.length <= arg1.field1273) {
                arg1.field1273 -= var6.field2666;
                arg1.field1258++;
                if (arg1.field1258 >= var6.field2682) {
                    arg1.field1265 = -1;
                }
                if (arg1.field1273 < 0 || arg1.field1273 >= var6.field2662.length) {
                    arg1.field1265 = -1;
                }
            }
            arg1.field1208 = var6.field2685;
        }
        if (arg1.field1227 > 0) {
            arg1.field1227--;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/awt/Component;BII)Lpb;", line = 270)
    public static final class92 method616(Component arg0, byte arg1, int arg2, int arg3) {
        int var4 = 121 / ((arg1 - 38) / 37);
        field1834++;
        try {
            Class var5 = Class.forName("la");
            class92 var6 = (class92) var5.getDeclaredConstructor().newInstance();
            var6.method399(arg2, -26, arg3, arg0);
            return var6;
        } catch (Throwable var8) {
            class52 var7 = new class52();
            var7.method399(arg2, -27, arg3, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Llc;", line = 300)
    private final class69 method617(byte arg0) {
        field1842++;
        if (this.field1855 > 0 && this.field1843[this.field1855 - 1] != this.field1856) {
            class69 var2 = this.field1856;
            this.field1856 = var2.field1760;
            return var2;
        }
        int var3 = -49 % ((-arg0 - 24) / 34);
        while (this.field1839 > this.field1855) {
            class69 var4 = this.field1843[this.field1855++].field1760;
            if (this.field1843[this.field1855 - 1] != var4) {
                this.field1856 = var4.field1760;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)Llc;", line = 332)
    public final class69 method618(byte arg0) {
        int var2 = -36 % ((arg0 - 61) / 46);
        field1838++;
        this.field1855 = 0;
        return this.method617((byte) -93);
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(B)V", line = 343)
    public static final void method619(byte arg0) {
        field1833++;
        if (arg0 < 3) {
            field1848 = -63;
        }
        for (int var1 = 0; var1 < class76.field1921; var1++) {
            int var2 = class94.field2369[var1];
            class97 var3 = class12.field231[var2];
            int var4 = class97.field2448.method494(20471);
            if ((var4 & 0x80) != 0) {
                var3.field1246 = class97.field2448.method516(false);
                var3.field1209 = class97.field2448.method524(255);
            }
            if ((var4 & 0x4) != 0) {
                var3.field1213 = class97.field2448.method509((byte) 78);
                var3.field1212 = 100;
            }
            if ((var4 & 0x10) != 0) {
                var3.field1252 = class97.field2448.method507((byte) -65);
                if (var3.field1252 == 65535) {
                    var3.field1252 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var5 = class97.field2448.method528(-129);
                int var6 = class97.field2448.method528(-129);
                var3.method389(var6, class34.field781, var5, (byte) 110);
                var3.field1245 = class34.field781 + 300;
                var3.field1279 = class97.field2448.method519((byte) 104);
                var3.field1199 = class97.field2448.method519((byte) -29);
            }
            if ((var4 & 0x1) != 0) {
                var3.field1216 = class97.field2448.method516(false);
                int var7 = class97.field2448.method511((byte) -98);
                if (var3.field1216 == 65535) {
                    var3.field1216 = -1;
                }
                var3.field1269 = var7 >> 16;
                var3.field1229 = (var7 & 0xFFFF) + class34.field781;
                var3.field1255 = 0;
                var3.field1214 = 0;
                if (class34.field781 < var3.field1229) {
                    var3.field1255 = -1;
                }
            }
            if ((var4 & 0x8) != 0) {
                int var8 = class97.field2448.method528(-129);
                int var9 = class97.field2448.method494(20471);
                var3.method389(var9, class34.field781, var8, (byte) -127);
                var3.field1245 = class34.field781 + 300;
                var3.field1279 = class97.field2448.method515((byte) -127);
                var3.field1199 = class97.field2448.method494(20471);
            }
            if ((var4 & 0x40) != 0) {
                var3.field2447 = class52.method400(class97.field2448.method514(-25530), -13673);
                var3.field1204 = var3.field2447.field771;
                var3.field1235 = var3.field2447.field803;
                var3.field1244 = var3.field2447.field776;
                var3.field1237 = var3.field2447.field797;
                var3.field1263 = var3.field2447.field767;
                var3.field1211 = var3.field2447.field801;
                var3.field1217 = var3.field2447.field787;
                var3.field1234 = var3.field2447.field780;
                var3.field1223 = var3.field2447.field782;
            }
            if ((var4 & 0x2) != 0) {
                int var10 = class97.field2448.method524(255);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class97.field2448.method515((byte) -125);
                if (var3.field1265 == var10 && var10 != -1) {
                    int var12 = class37.method289(var10, (byte) -127).field2698;
                    if (var12 == 1) {
                        var3.field1268 = 0;
                        var3.field1258 = 0;
                        var3.field1273 = 0;
                        var3.field1227 = var11;
                    }
                    if (var12 == 2) {
                        var3.field1258 = 0;
                    }
                } else if (var10 == -1 || var3.field1265 == -1 || class37.method289(var10, (byte) -127).field2673 >= class37.method289(var3.field1265, (byte) -128).field2673) {
                    var3.field1273 = 0;
                    var3.field1227 = var11;
                    var3.field1258 = 0;
                    var3.field1265 = var10;
                    var3.field1226 = var3.field1267;
                    var3.field1268 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V", line = 523)
    public class74(int arg0) {
        this.field1839 = arg0;
        this.field1843 = new class69[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class69 var3 = this.field1843[var2] = new class69();
            var3.field1771 = var3;
            var3.field1760 = var3;
        }
    }
}
