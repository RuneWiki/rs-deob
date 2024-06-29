import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 extends class266 {

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lp;")
    private static class280 field592 = class18.method140((byte) -124, "Loaded world list data");

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "Lp;")
    public static class280 field595 = field592;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "[[S")
    public static short[][] field597 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Lp;")
    public static class280 field598 = class18.method140((byte) -123, "mapdots");

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Lp;")
    public static class280 field600 = class18.method140((byte) -122, "<br>");

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method275(int arg0) {
        field598 = null;
        field595 = null;
        if (arg0 != 3510) {
            field600 = null;
        }
        field592 = null;
        field600 = null;
        field597 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
    public static final void method276(int arg0, byte arg1) {
        field599++;
        if (arg1 <= 67) {
            method278(88, 27, -75, -58, -22);
        }
        class193.field3413.method1478(arg0, 105);
        class97.field1552.method1478(arg0, 80);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)Lob;")
    public static final class130 method277(byte arg0, int arg1) {
        field591++;
        class130 var2 = (class130) class248.field4343.method1480((byte) 50, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class46.field763.method1258(class24.method178(arg1, (byte) -121), class279.method1850(arg1, (byte) -66), (byte) 127);
        class130 var4 = new class130();
        var4.field2290 = arg1;
        if (var3 != null) {
            var4.method889((byte) -9, new class25(var3));
        }
        var4.method893((byte) -66);
        if (!class122.field2148 && var4.field2287) {
            var4.field2256 = null;
        }
        if (var4.field2253) {
            var4.field2249 = false;
            var4.field2281 = 0;
        }
        class248.field4343.method1483((byte) -105, (long) arg1, var4);
        if (arg0 > -59) {
            method279(51, 76);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(IIIII)V")
    public static final void method278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field594++;
        if (arg2 < 109) {
            method276(45, (byte) -10);
        }
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = class76.method564(class89.field1440, -124, arg3 + arg4, class12.field249);
        int var9 = -1;
        int var10 = class76.method564(class89.field1440, -116, arg4 - arg3, class12.field249);
        class162.method1151(var8, arg0, -102, var10, class91.field1484[arg1]);
        while (var6 > var5) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg1 + var6;
                int var12 = arg1 - var6;
                if (var11 >= class36.field654 && var12 <= class249.field4360) {
                    int var13 = class76.method564(class89.field1440, -111, arg4 + var5, class12.field249);
                    int var14 = class76.method564(class89.field1440, -121, arg4 - var5, class12.field249);
                    if (class249.field4360 >= var11) {
                        class162.method1151(var13, arg0, 115, var14, class91.field1484[var11]);
                    }
                    if (class36.field654 <= var12) {
                        class162.method1151(var13, arg0, -113, var14, class91.field1484[var12]);
                    }
                }
            }
            var5++;
            int var15 = arg1 + var5;
            int var16 = arg1 - var5;
            if (class36.field654 <= var15 && class249.field4360 >= var16) {
                int var17 = class76.method564(class89.field1440, -123, arg4 + var6, class12.field249);
                int var18 = class76.method564(class89.field1440, -118, arg4 - var6, class12.field249);
                if (class249.field4360 >= var15) {
                    class162.method1151(var17, arg0, 25, var18, class91.field1484[var15]);
                }
                if (class36.field654 <= var16) {
                    class162.method1151(var17, arg0, -41, var18, class91.field1484[var16]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)Z")
    public static final boolean method279(int arg0, int arg1) {
        field596++;
        if (~arg1 <= arg0 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }
}
