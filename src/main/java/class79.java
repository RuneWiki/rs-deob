import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class79 extends class64 {

    @OriginalMember(owner = "client!le", name = "fb", descriptor = "I")
    public int field1793 = 0;

    @OriginalMember(owner = "client!le", name = "ab", descriptor = "Lrd;")
    public static class114 field1788 = class84.method656("@cr2@", (byte) 120);

    @OriginalMember(owner = "client!le", name = "hb", descriptor = "Lrd;")
    public static class114 field1795 = class84.method656("(Z", (byte) 121);

    @OriginalMember(owner = "client!le", name = "db", descriptor = "I")
    public static int field1791 = 0;

    @OriginalMember(owner = "client!le", name = "cb", descriptor = "Ldd;")
    public static class26 field1790 = new class26(64);

    @OriginalMember(owner = "client!le", name = "ob", descriptor = "Lrd;")
    private static class114 field1802 = class84.method656("RuneScape is loading )2 please wait)3)3)3", (byte) 119);

    @OriginalMember(owner = "client!le", name = "rb", descriptor = "I")
    public static int field1805 = 0;

    @OriginalMember(owner = "client!le", name = "qb", descriptor = "Lrd;")
    public static class114 field1804 = class84.method656("scrollen:", (byte) 123);

    @OriginalMember(owner = "client!le", name = "lb", descriptor = "[I")
    public static int[] field1799 = new int[2000];

    @OriginalMember(owner = "client!le", name = "sb", descriptor = "Lrd;")
    public static class114 field1806 = field1802;

    @OriginalMember(owner = "client!le", name = "Z", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!le", name = "bb", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!le", name = "gb", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!le", name = "ib", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!le", name = "jb", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!le", name = "kb", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!le", name = "mb", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!le", name = "nb", descriptor = "Ljd;")
    public static class66 field1801;

    @OriginalMember(owner = "client!le", name = "pb", descriptor = "Loa;")
    public static class93 field1803;

    @OriginalMember(owner = "client!le", name = "eb", descriptor = "[I")
    public static int[] field1792;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)V")
    public static void method627(byte arg0) {
        if (arg0 != 12) {
            field1802 = null;
        }
        field1788 = null;
        field1806 = null;
        field1799 = null;
        field1795 = null;
        field1803 = null;
        field1790 = null;
        field1804 = null;
        field1802 = null;
        field1792 = null;
        field1801 = null;
    }

    @OriginalMember(owner = "client!le", name = "f", descriptor = "(I)V")
    public static final void method628(int arg0) {
        if (arg0 != 2000) {
            field1799 = null;
        }
        field1797++;
        class110.field2561.method200(arg0 ^ 0xFFFFF857);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BILid;)V")
    private final void method629(byte arg0, int arg1, class60 arg2) {
        if (arg1 == 2) {
            this.field1793 = arg2.method467(255);
        }
        if (arg0 != -113) {
            method627((byte) -60);
        }
        field1796++;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lid;B)V")
    public final void method630(class60 arg0, byte arg1) {
        int var3 = -23 % ((9 - arg1) / 43);
        while (true) {
            int var4 = arg0.method462((byte) 116);
            if (var4 == 0) {
                field1787++;
                return;
            }
            this.method629((byte) -113, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BLp;)V")
    public static final void method631(byte arg0, class98 arg1) {
        field1789++;
        int var2 = 0;
        if (arg1.field2220 == 0) {
            var2 = class101.field2325.method1034(arg1.field2233, arg1.field2237, arg1.field2225);
        }
        if (arg1.field2220 == 1) {
            var2 = class101.field2325.method1001(arg1.field2233, arg1.field2237, arg1.field2225);
        }
        int var3 = -1;
        if (arg1.field2220 == 2) {
            var2 = class101.field2325.method1028(arg1.field2233, arg1.field2237, arg1.field2225);
        }
        if (arg0 != 103) {
            field1802 = null;
        }
        int var4 = 0;
        if (arg1.field2220 == 3) {
            var2 = class101.field2325.method1035(arg1.field2233, arg1.field2237, arg1.field2225);
        }
        int var5 = 0;
        if (var2 != 0) {
            var3 = var2 >> 14 & 0x7FFF;
            int var6 = class101.field2325.method1009(arg1.field2233, arg1.field2237, arg1.field2225, var2);
            var5 = var6 & 0x1F;
            var4 = var6 >> 6 & 0x3;
        }
        arg1.field2231 = var5;
        arg1.field2239 = var3;
        arg1.field2222 = var4;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(Z)V")
    public static final void method632(boolean arg0) {
        field1798++;
        if (class26.field532 == 0) {
            return;
        }
        if (arg0) {
            field1791 = 46;
        }
        int var1 = 0;
        if (field1805 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class144.field3425[var2] != null) {
                int var3 = class28.field557[var2];
                class114 var4 = class28.field563[var2];
                if (var4 != null && var4.method864(27, class50.field1035)) {
                    var4 = var4.method866(arg0, 5);
                }
                if (var4 != null && var4.method864(27, field1788)) {
                    var4 = var4.method866(false, 5);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class130.field3149 == 0 || class130.field3149 == 1 && class24.method175((byte) 32, var4))) {
                    int var5 = 329 - var1 * 13;
                    var1++;
                    if (class100.field2289 > 4 && class75.field1741 - 4 > var5 - 10 && class75.field1741 - 4 <= var5 + 3) {
                        int var6 = class5.field54.method326(class101.method786((byte) 127, new class114[] { class70.field1537, class103.field2408, var4, class144.field3425[var2] })) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (var6 + 4 > class100.field2289) {
                            if (class58.field1205 >= 1) {
                                class75.field1739++;
                                class3.method10(0, class101.method786((byte) 125, new class114[] { class128.field3073, var4 }), 0, (byte) 125, 2017, class82.field1831, 0);
                            }
                            class3.method10(0, class101.method786((byte) 125, new class114[] { class128.field3073, var4 }), 0, (byte) 125, 2002, class135.field3297, 0);
                            class101.field2321++;
                            class3.method10(0, class101.method786((byte) 125, new class114[] { class128.field3073, var4 }), 0, (byte) 121, 2007, class51.field1062, 0);
                            class28.field551++;
                        }
                    }
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class130.field3149 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
    }
}
