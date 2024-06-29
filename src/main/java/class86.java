import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class86 extends class87 {

    @OriginalMember(owner = "client!ob", name = "xb", descriptor = "I")
    private int field1929;

    @OriginalMember(owner = "client!ob", name = "nb", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!ob", name = "zb", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!ob", name = "qb", descriptor = "I")
    private int field1922;

    @OriginalMember(owner = "client!ob", name = "hb", descriptor = "I")
    private int field1913;

    @OriginalMember(owner = "client!ob", name = "rb", descriptor = "I")
    private int field1923;

    @OriginalMember(owner = "client!ob", name = "jb", descriptor = "I")
    private int field1915;

    @OriginalMember(owner = "client!ob", name = "Ab", descriptor = "Lc;")
    private class13 field1932;

    @OriginalMember(owner = "client!ob", name = "gb", descriptor = "I")
    private int field1912;

    @OriginalMember(owner = "client!ob", name = "mb", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!ob", name = "kb", descriptor = "I")
    public static int field1916 = 0;

    @OriginalMember(owner = "client!ob", name = "lb", descriptor = "Lec;")
    public static class28 field1917 = class28.method210(-46, "Moderator option: Mute player for 48 hours: <OFF>");

    @OriginalMember(owner = "client!ob", name = "pb", descriptor = "Lec;")
    public static class28 field1921 = class28.method210(-46, "Sep");

    @OriginalMember(owner = "client!ob", name = "ib", descriptor = "Lec;")
    public static class28 field1914 = class28.method210(-46, "*6n*6nIf you do not remember making this request*6ncancel it immediately)1 and change your password)3");

    @OriginalMember(owner = "client!ob", name = "ub", descriptor = "[[I")
    public static int[][] field1926 = new int[104][104];

    @OriginalMember(owner = "client!ob", name = "fb", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!ob", name = "ob", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!ob", name = "tb", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ob", name = "vb", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ob", name = "wb", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ob", name = "eb", descriptor = "Lcc;")
    public static class16 field1910;

    @OriginalMember(owner = "client!ob", name = "sb", descriptor = "Z")
    public static boolean field1924;

    @OriginalMember(owner = "client!ob", name = "yb", descriptor = "[Lea;")
    public static class26[] field1930;

    @OriginalMember(owner = "client!ob", name = "db", descriptor = "[[I")
    public static int[][] field1909;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public static final void method639(int arg0) {
        for (class109 var1 = (class109) class37.field842.method326(0); var1 != null; var1 = (class109) class37.field842.method325((byte) 124)) {
            if (var1.field2285 > 0) {
                var1.field2285--;
            }
            if (var1.field2285 != 0) {
                if (var1.field2275 > 0) {
                    var1.field2275--;
                }
                if (var1.field2275 == 0 && var1.field2286 >= 1 && var1.field2296 >= 1 && var1.field2286 <= 102 && var1.field2296 <= 102 && (var1.field2306 < 0 || class64.method515(var1.field2306, var1.field2300, (byte) -113))) {
                    class83.method633(var1.field2296, var1.field2306, var1.field2300, var1.field2286, var1.field2295, var1.field2301, 10773, var1.field2308);
                    var1.field2275 = -1;
                    if (var1.field2306 == var1.field2281 && var1.field2281 == -1) {
                        var1.method319((byte) -126);
                    } else if (var1.field2306 == var1.field2281 && var1.field2310 == var1.field2308 && var1.field2304 == var1.field2300) {
                        var1.method319((byte) -51);
                    }
                }
            } else if (var1.field2281 < 0 || class64.method515(var1.field2281, var1.field2304, (byte) -84)) {
                class83.method633(var1.field2296, var1.field2281, var1.field2304, var1.field2286, var1.field2295, var1.field2301, 10773, var1.field2310);
                var1.method319((byte) -6);
            }
        }
        field1925++;
        if (arg0 > -67) {
            method642(83, -22, -21, -52, -88, -8, 2);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Lfb;")
    public final class33 method290(int arg0) {
        int var2 = 82 / ((-arg0 - 70) / 55);
        if (this.field1932 != null) {
            int var3 = class83.field1888 - this.field1912;
            if (var3 > 100 && this.field1932.field228 > 0) {
                var3 = 100;
            }
            label38: {
                do {
                    do {
                        if (this.field1932.field223[this.field1918] >= var3) {
                            break label38;
                        }
                        var3 -= this.field1932.field223[this.field1918];
                        this.field1918++;
                    } while (this.field1932.field245.length > this.field1918);
                    this.field1918 -= this.field1932.field228;
                } while (this.field1918 >= 0 && this.field1932.field245.length > this.field1918);
                this.field1932 = null;
            }
            this.field1912 = class83.field1888 - var3;
        }
        class45 var4 = class72.method566(this.field1923, 125);
        if (var4.field982 != null) {
            var4 = var4.method363(false);
        }
        field1920++;
        return var4 == null ? null : var4.method359(this.field1919, (byte) 122, this.field1918, this.field1929, this.field1915, this.field1922, this.field1931, this.field1932, this.field1913);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BIIIII)V")
    public static final void method640(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class21.field484[0].method977(arg2, arg4);
        int var6 = (arg5 - 32) * arg5 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        class21.field484[1].method977(arg2, arg4 + arg5 - 16);
        field1911++;
        int var7 = (arg5 - var6 - 32) * arg1 / (arg3 - arg5);
        if (arg0 > -80) {
            field1917 = null;
        }
        class120.method915(arg2, arg4 + 16, 16, arg5 - 32, class37.field836);
        class120.method915(arg2, arg4 + var7 + 16, 16, var6, class25.field559);
        class120.method914(arg2, arg4 + var7 + 16, var6, class110.field2320);
        class120.method914(arg2 + 1, arg4 + 16 + var7, var6, class110.field2320);
        class120.method909(arg2, var7 + arg4 + 16, 16, class110.field2320);
        class120.method909(arg2, var7 + arg4 + 17, 16, class110.field2320);
        class120.method914(arg2 + 15, var7 + 16 + arg4, var6, class61.field1363);
        class120.method914(arg2 + 14, arg4 + var7 - -17, var6 - 1, class61.field1363);
        class120.method909(arg2, arg4 + var6 + var7 + 15, 16, class61.field1363);
        class120.method909(arg2 + 1, arg4 - -14 + var6 + var7, 15, class61.field1363);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
    public static void method641(byte arg0) {
        field1909 = null;
        field1930 = null;
        field1921 = null;
        if (arg0 == -24) {
            field1917 = null;
            field1910 = null;
            field1914 = null;
            field1926 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)I")
    public static final int method642(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1928++;
        int var7 = arg4 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg5;
            arg5 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (arg3 == var7) {
            return arg0;
        } else if (var7 == 2) {
            return 1 + 7 - arg1 - arg6;
        } else {
            return 7 + 1 - arg0 - arg5;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(IIIIIIIIZ)V")
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        this.field1929 = arg1;
        this.field1919 = arg2;
        this.field1931 = arg3;
        this.field1922 = arg5;
        this.field1913 = arg4;
        this.field1923 = arg0;
        this.field1915 = arg6;
        if (arg7 != -1) {
            this.field1932 = class23.method166(0, arg7);
            this.field1912 = class83.field1888 - 1;
            this.field1918 = 0;
            if (arg8 && this.field1932.field228 != -1) {
                this.field1918 = (int) (Math.random() * (double) this.field1932.field245.length);
                this.field1912 -= (int) ((double) this.field1932.field223[this.field1918] * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    public static final void method643(int arg0) {
        field1927++;
        if (class14.field251 == null) {
            return;
        }
        class22.method164((byte) 115);
        if (class32.field689 > 0) {
            class14.field251.method174((byte) -50);
            class32.field689 = 0;
        }
        class14.field251.method177(arg0 + 31996);
        class14.field251 = null;
        if (arg0 != -31914) {
            field1921 = null;
        }
    }
}
