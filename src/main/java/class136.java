import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class136 extends class344 {

    @OriginalMember(owner = "client!ks", name = "J", descriptor = "I")
    private int field1928 = 0;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "Lsq;")
    private class454 field1918 = new class454(16);

    @OriginalMember(owner = "client!ks", name = "S", descriptor = "I")
    private int field1937 = 0;

    @OriginalMember(owner = "client!ks", name = "R", descriptor = "Lsm;")
    private class249 field1936 = new class249();

    @OriginalMember(owner = "client!ks", name = "W", descriptor = "J")
    private long field1941 = 0L;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "Lnk;")
    private class18 field1912;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    private int field1917;

    @OriginalMember(owner = "client!ks", name = "T", descriptor = "Z")
    private boolean field1938;

    @OriginalMember(owner = "client!ks", name = "Q", descriptor = "Lsm;")
    private class249 field1935;

    @OriginalMember(owner = "client!ks", name = "l", descriptor = "Lfb;")
    private class96 field1904;

    @OriginalMember(owner = "client!ks", name = "V", descriptor = "Z")
    private boolean field1940;

    @OriginalMember(owner = "client!ks", name = "h", descriptor = "Lbo;")
    private class471 field1900;

    @OriginalMember(owner = "client!ks", name = "B", descriptor = "I")
    private int field1920;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    private int field1911;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "Lnk;")
    private class18 field1908;

    @OriginalMember(owner = "client!ks", name = "D", descriptor = "Ldi;")
    private class239 field1922;

    @OriginalMember(owner = "client!ks", name = "I", descriptor = "Lfn;")
    public static class52 field1927 = new class52(52, 8);

    @OriginalMember(owner = "client!ks", name = "M", descriptor = "I")
    public static int field1931 = 0;

    @OriginalMember(owner = "client!ks", name = "K", descriptor = "I")
    public static int field1929 = -1;

    @OriginalMember(owner = "client!ks", name = "P", descriptor = "Z")
    public static boolean field1934 = false;

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ks", name = "i", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ks", name = "j", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ks", name = "k", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ks", name = "m", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ks", name = "o", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ks", name = "A", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!ks", name = "E", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ks", name = "H", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ks", name = "L", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ks", name = "O", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ks", name = "F", descriptor = "Lpo;")
    private class126 field1924;

    @OriginalMember(owner = "client!ks", name = "U", descriptor = "Z")
    private boolean field1939;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "[B")
    private byte[] field1913;

    @OriginalMember(owner = "client!ks", name = "N", descriptor = "[I")
    public static int[] field1932;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(BII)V")
    public static final void method821(byte arg0, int arg1, int arg2) {
        if (arg0 != -88) {
            field1932 = null;
        }
        field1902++;
        class265 var3 = class440.method2554(arg2, 2, 12);
        var3.method1675(false);
        var3.field3698 = arg1;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(III)Lwm;")
    public static final class242 method822(int arg0, int arg1, int arg2) {
        class406 var3 = class455.field6293[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class242 var4 = var3.field5614;
            var3.field5614 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(B)I")
    public final int method823(byte arg0) {
        field1907++;
        if (arg0 != 26) {
            method838(4);
        }
        if (this.method837((byte) 1) == null) {
            return this.field1922 == null ? 0 : this.field1922.method417((byte) 48);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)I")
    public final int method824(int arg0) {
        field1933++;
        if (this.field1924 == null) {
            return 0;
        } else if (this.field1938) {
            if (arg0 != 18301) {
                this.field1911 = -100;
            }
            class180 var2 = this.field1935.method1544(arg0 ^ 0xFFFFB8ED);
            return var2 == null ? 0 : (int) var2.field2608;
        } else {
            return this.field1924.field1724;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIIBZ)V")
    public static final void method825(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field1899++;
        if (arg5) {
            class242.method1512(0);
        }
        if (class90.field1344 != null && (arg3 != 3 || class221.field3111 != arg2 || class304.field4157 != arg1)) {
            class204.method1292(class343.field4703, class90.field1344, -2);
            class90.field1344 = null;
        }
        if (arg3 == 3 && class90.field1344 == null) {
            class90.field1344 = class147.method907(-13878, arg1, arg2, class343.field4703, 0, 0);
            if (class90.field1344 != null) {
                class221.field3111 = arg2;
                class304.field4157 = arg1;
                class155.method941(17201, class343.field4703);
            }
        }
        if (arg3 == 3 && class90.field1344 == null) {
            method825(arg0, -1, -1, class411.field5693, (byte) -51, true);
            return;
        }
        Container var6;
        if (class90.field1344 != null) {
            class77.field1166 = arg1;
            class3.field28 = arg2;
            var6 = class90.field1344;
        } else if (class240.field3384 == null) {
            var6 = class343.field4703.field234;
            class3.field28 = var6.getSize().width;
            class77.field1166 = var6.getSize().height;
        } else {
            Insets var7 = class240.field3384.getInsets();
            int var10001 = -var7.left;
            class3.field28 = class240.field3384.getSize().width + (var10001 - var7.right);
            class77.field1166 = class240.field3384.getSize().height - var7.top - var7.bottom;
            var6 = class240.field3384;
        }
        if (arg3 == 1) {
            class371.field5248 = class451.field6225;
            class67.field987 = class407.field5642;
            class335.field4600 = (class3.field28 - class407.field5642) / 2;
            class192.field2743 = 0;
        } else if (class154.field2227 < 96 && class221.field3118 == 0) {
            int var8 = class3.field28 <= 1024 ? class3.field28 : 1024;
            class67.field987 = var8;
            int var9 = class77.field1166 > 768 ? 768 : class77.field1166;
            class335.field4600 = (class3.field28 - var8) / 2;
            class192.field2743 = 0;
            class371.field5248 = var9;
        } else {
            class335.field4600 = 0;
            class192.field2743 = 0;
            class67.field987 = class3.field28;
            class371.field5248 = class77.field1166;
        }
        if (class96.field1373 != class396.field5558) {
            boolean var10000;
            if (class67.field987 < 1024 && class371.field5248 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg5) {
            class336.method2003(arg4 ^ 0xFFFFFFC8, class221.field3118);
        } else {
            class138.field1965.setSize(class67.field987, class371.field5248);
            if (class338.field4636 != null) {
                class338.field4636.method1101();
            }
            if (class240.field3384 == var6) {
                Insets var10 = class240.field3384.getInsets();
                class138.field1965.setLocation(class335.field4600 + var10.left, class192.field2743 + var10.top);
            } else {
                class138.field1965.setLocation(class335.field4600, class192.field2743);
            }
        }
        if (arg3 < 2) {
            class244.field3453 = false;
        } else {
            class244.field3453 = true;
        }
        if (class182.field2652 != -1) {
            class110.method688((byte) -30, true);
        }
        if (class237.field3339 != null && (class478.field6764 == 30 || class478.field6764 == 25)) {
            class233.method1470(1);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class127.field1809[var11] = true;
        }
        class280.field3857 = true;
        if (arg4 != -51) {
            method830((class425) null, 36);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)I")
    public final int method826(int arg0, int arg1) {
        field1914++;
        class239 var3 = (class239) this.field1918.method2614((long) arg1, -82);
        if (var3 == null) {
            if (arg0 != 29373) {
                this.method836(18, 101);
            }
            return 0;
        } else {
            return var3.method417((byte) 65);
        }
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(B)V")
    public final void method827(byte arg0) {
        field1906++;
        if (arg0 < 39) {
            this.field1938 = true;
        }
        if (this.field1912 != null) {
            this.field1939 = true;
            if (this.field1935 == null) {
                this.field1935 = new class249();
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIILcj;I)V")
    public static final void method828(int arg0, int arg1, int arg2, class475 arg3, int arg4) {
        field1910++;
        if (arg2 != 128) {
            field1925 = -76;
        }
        for (class462 var5 = (class462) class178.field2594.method1544(arg2 - 254); var5 != null; var5 = (class462) class178.field2594.method1546((byte) -42)) {
            if (var5.field6496 == arg0 && arg1 * 128 == var5.field6509 && (arg4 * 128) == var5.field6500 && var5.field6512.field6705 == arg3.field6705) {
                if (var5.field6507 != null) {
                    class386.field5445.method1313(var5.field6507);
                    var5.field6507 = null;
                }
                if (var5.field6508 != null) {
                    class386.field5445.method1313(var5.field6508);
                    var5.field6508 = null;
                }
                var5.method1182(28818);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(B)I")
    public final int method829(byte arg0) {
        field1901++;
        if (this.field1924 == null) {
            return 0;
        } else if (arg0 > -44) {
            return -51;
        } else {
            return this.field1924.field1724;
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Llk;I)Lng;")
    public static final class257 method830(class425 arg0, int arg1) {
        field1919++;
        if (arg1 != 0) {
            method833((byte) -22);
        }
        return new class257(arg0.method2514(9786), arg0.method2514(9786), arg0.method2514(9786), arg0.method2514(9786), arg0.method2498(3), arg0.method2503(true));
    }

    @OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
    public final void method831(int arg0) {
        if (arg0 < 107) {
            this.method835((byte) 96);
        }
        field1916++;
        if (this.field1935 != null) {
            if (this.method837((byte) 1) == null) {
                return;
            }
            if (this.field1938) {
                boolean var2 = true;
                for (class180 var3 = this.field1935.method1544(-118); var3 != null; var3 = this.field1935.method1546((byte) -42)) {
                    int var5 = (int) var3.field2608;
                    if (this.field1913[var5] == 0) {
                        this.method839(0, 1, var5);
                    }
                    if (this.field1913[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1182(28818);
                    }
                }
                while (this.field1924.field1720.length > this.field1937) {
                    if (this.field1924.field1720[this.field1937] == 0) {
                        this.field1937++;
                    } else {
                        if (this.field1904.field1380 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field1913[this.field1937] == 0) {
                            this.method839(0, 1, this.field1937);
                        }
                        if (this.field1913[this.field1937] == 0) {
                            class180 var4 = new class180();
                            var4.field2608 = (long) this.field1937;
                            this.field1935.method1553((byte) -128, var4);
                            var2 = false;
                        }
                        this.field1937++;
                    }
                }
                if (var2) {
                    this.field1937 = 0;
                    this.field1938 = false;
                }
            } else if (this.field1939) {
                boolean var6 = true;
                for (class180 var7 = this.field1935.method1544(-101); var7 != null; var7 = this.field1935.method1546((byte) -42)) {
                    int var9 = (int) var7.field2608;
                    if (this.field1913[var9] != 1) {
                        this.method839(0, 2, var9);
                    }
                    if (this.field1913[var9] == 1) {
                        var7.method1182(28818);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field1924.field1720.length > this.field1937) {
                    if (this.field1924.field1720[this.field1937] == 0) {
                        this.field1937++;
                    } else {
                        if (this.field1900.method2769(-11158)) {
                            var6 = false;
                            break;
                        }
                        if (this.field1913[this.field1937] != 1) {
                            this.method839(0, 2, this.field1937);
                        }
                        if (this.field1913[this.field1937] != 1) {
                            class180 var8 = new class180();
                            var8.field2608 = (long) this.field1937;
                            var6 = false;
                            this.field1935.method1553((byte) -121, var8);
                        }
                        this.field1937++;
                    }
                }
                if (var6) {
                    this.field1939 = false;
                    this.field1937 = 0;
                }
            } else {
                this.field1935 = null;
            }
        }
        if (!this.field1940 || class193.method1237(-9581) < this.field1941) {
            return;
        }
        for (class239 var10 = (class239) this.field1918.method2615((byte) -18); var10 != null; var10 = (class239) this.field1918.method2619((byte) -98)) {
            if (!var10.field3373) {
                if (var10.field3371) {
                    if (!var10.field3370) {
                        throw new RuntimeException();
                    }
                    var10.method1182(28818);
                } else {
                    var10.field3371 = true;
                }
            }
        }
        this.field1941 = class193.method1237(-9581) + 1000L;
    }

    @OriginalMember(owner = "client!ks", name = "c", descriptor = "(II)[B")
    public final byte[] method832(int arg0, int arg1) {
        if (arg0 != -27333) {
            this.method823((byte) 49);
        }
        field1903++;
        class239 var3 = this.method839(0, 0, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method414(0);
            var3.method1182(arg0 + 56151);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(B)V")
    public static final void method833(byte arg0) {
        class394.field5543 = null;
        class376.field5318 = null;
        class68.field1006 = null;
        if (arg0 <= 65) {
            method821((byte) 122, -6, 97);
        }
        class19.field304 = null;
        class154.field2225 = null;
        class490.field6912 = null;
        class37.field638 = null;
        class64.field976 = null;
        class308.field4210 = null;
        class262.field3662 = null;
        class388.field5462 = null;
        class211.field2981 = null;
        class154.field2221 = null;
        class145.field2027 = null;
        field1915++;
        class36.field626 = null;
        class289.field3971 = null;
        class96.field1381 = null;
        class128.field1818 = null;
    }

    @OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)V")
    public final void method834(int arg0) {
        field1921++;
        if (this.field1935 == null || this.method837((byte) 1) == null) {
            return;
        }
        class180 var2 = this.field1936.method1544(-123);
        if (arg0 > -32) {
            return;
        }
        while (var2 != null) {
            int var3 = (int) var2.field2608;
            if (var3 < 0 || this.field1924.field1727 <= var3 || this.field1924.field1720[var3] == 0) {
                var2.method1182(28818);
            } else {
                if (this.field1913[var3] == 0) {
                    this.method839(0, 1, var3);
                }
                if (this.field1913[var3] == -1) {
                    this.method839(0, 2, var3);
                }
                if (this.field1913[var3] == 1) {
                    var2.method1182(28818);
                }
            }
            var2 = this.field1936.method1546((byte) -42);
        }
    }

    @OriginalMember(owner = "client!ks", name = "g", descriptor = "(B)I")
    public final int method835(byte arg0) {
        if (arg0 != 75) {
            this.field1913 = null;
        }
        field1926++;
        return this.field1928;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(II)V")
    public final void method836(int arg0, int arg1) {
        field1905++;
        if (this.field1912 == null) {
            return;
        }
        if (arg1 != 255) {
            method822(40, -71, 69);
        }
        for (class180 var3 = this.field1936.method1544(arg1 - 359); var3 != null; var3 = this.field1936.method1546((byte) -42)) {
            if (((long) arg0) == var3.field2608) {
                return;
            }
        }
        class180 var4 = new class180();
        var4.field2608 = (long) arg0;
        this.field1936.method1553((byte) -122, var4);
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)Lpo;")
    public final class126 method837(byte arg0) {
        field1923++;
        if (this.field1924 != null) {
            return this.field1924;
        }
        if (this.field1922 == null) {
            if (this.field1900.method2757(20)) {
                return null;
            }
            this.field1922 = this.field1900.method2764(255, 77, true, this.field1917, (byte) 0);
        }
        if (this.field1922.field3373) {
            return null;
        } else if (arg0 == 1) {
            byte[] var2 = this.field1922.method414(0);
            if (this.field1922 instanceof class53) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field1924 = new class126(var2, this.field1911);
                    if (this.field1924.field1722 != this.field1920) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field1924 = null;
                    if (this.field1900.method2757(arg0 ^ 0x15)) {
                        this.field1922 = null;
                    } else {
                        this.field1922 = this.field1900.method2764(255, -128, true, this.field1917, (byte) 0);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field1924 = new class126(var2, this.field1911);
                } catch (RuntimeException var4) {
                    this.field1900.method2762(0);
                    this.field1924 = null;
                    if (this.field1900.method2757(20)) {
                        this.field1922 = null;
                    } else {
                        this.field1922 = this.field1900.method2764(255, -121, true, this.field1917, (byte) 0);
                    }
                    return null;
                }
                if (this.field1908 != null) {
                    this.field1904.method624((byte) 123, var2, this.field1917, this.field1908);
                }
            }
            if (this.field1912 != null) {
                this.field1913 = new byte[this.field1924.field1727];
                this.field1928 = 0;
            }
            this.field1922 = null;
            return this.field1924;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "f", descriptor = "(I)V")
    public static void method838(int arg0) {
        field1932 = null;
        if (arg0 != -4) {
            method828(36, 66, -116, (class475) null, -68);
        }
        field1927 = null;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(III)Ldi;")
    private final class239 method839(int arg0, int arg1, int arg2) {
        field1909++;
        class239 var4 = (class239) this.field1918.method2614((long) arg2, -119);
        if (var4 != null && arg1 == 0 && !var4.field3370 && var4.field3373) {
            var4.method1182(arg0 ^ 0x7092);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field1912 == null || this.field1913[arg2] == -1) {
                    if (this.field1900.method2757(20)) {
                        return null;
                    }
                    var4 = this.field1900.method2764(this.field1917, arg0 ^ 0x6C, true, arg2, (byte) 2);
                } else {
                    var4 = this.field1904.method623((byte) 113, arg2, this.field1912);
                }
            } else if (arg1 == 1) {
                if (this.field1912 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field1904.method622(this.field1912, arg2, 94);
            } else if (arg1 == 2) {
                if (this.field1912 == null) {
                    throw new RuntimeException();
                }
                if (this.field1913[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field1900.method2769(-11158)) {
                    return null;
                }
                var4 = this.field1900.method2764(this.field1917, -53, false, arg2, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field1918.method2620((long) arg2, var4, false);
        }
        if (var4.field3373) {
            return null;
        }
        byte[] var5 = var4.method414(arg0);
        if (!var4 instanceof class53) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class295.field4083.reset();
                class295.field4083.update(var5, 0, var5.length - 2);
                int var6 = (int) class295.field4083.getValue();
                if (this.field1924.field1738[arg2] != var6) {
                    throw new RuntimeException();
                }
                this.field1900.field6607 = 0;
                this.field1900.field6610 = 0;
            } catch (RuntimeException var12) {
                this.field1900.method2762(0);
                var4.method1182(28818);
                if (var4.field3370 && !this.field1900.method2757(20)) {
                    class183 var7 = this.field1900.method2764(this.field1917, -109, true, arg2, (byte) 2);
                    this.field1918.method2620((long) arg2, var7, false);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field1924.field1729[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field1924.field1729[arg2];
            if (this.field1912 != null) {
                this.field1904.method624((byte) 126, var5, arg2, this.field1912);
                if (this.field1913[arg2] != 1) {
                    this.field1928++;
                    this.field1913[arg2] = 1;
                }
            }
            if (!var4.field3370) {
                var4.method1182(28818);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class295.field4083.reset();
            class295.field4083.update(var5, 0, var5.length - 2);
            int var8 = (int) class295.field4083.getValue();
            if (this.field1924.field1738[arg2] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field1924.field1729[arg2] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field1913[arg2] != 1) {
                this.field1928++;
                this.field1913[arg2] = 1;
            }
            if (!var4.field3370) {
                var4.method1182(arg0 ^ 0x7092);
            }
            return var4;
        } catch (Exception var11) {
            this.field1913[arg2] = -1;
            var4.method1182(28818);
            if (var4.field3370 && !this.field1900.method2757(20)) {
                class183 var10 = this.field1900.method2764(this.field1917, 46, true, arg2, (byte) 2);
                this.field1918.method2620((long) arg2, var10, false);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(ILnk;Lnk;Lbo;Lfb;IIZ)V")
    public class136(int arg0, class18 arg1, class18 arg2, class471 arg3, class96 arg4, int arg5, int arg6, boolean arg7) {
        this.field1912 = arg1;
        this.field1917 = arg0;
        if (this.field1912 == null) {
            this.field1938 = false;
        } else {
            this.field1938 = true;
            this.field1935 = new class249();
        }
        this.field1904 = arg4;
        this.field1940 = arg7;
        this.field1900 = arg3;
        this.field1920 = arg6;
        this.field1911 = arg5;
        this.field1908 = arg2;
        if (this.field1908 != null) {
            this.field1922 = this.field1904.method623((byte) 114, this.field1917, this.field1908);
        }
    }

    static {
        new class112("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }
}
