import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class90 {

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1651 = 0;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lke;")
    public static class256 field1654 = class316.method2202("k", 27626);

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Z")
    public static boolean field1647 = false;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[Z")
    public static boolean[] field1656;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V", line = 4)
    public static void method669(byte arg0) {
        if (arg0 != 98) {
            field1651 = -126;
        }
        field1656 = null;
        field1654 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[J[Ljava/lang/Object;)V", line = 24)
    public static final void method670(int arg0, long[] arg1, Object[] arg2) {
        field1648++;
        class311.method2155(2, arg2, arg1.length - 1, 0, arg1);
        if (arg0 != 29252) {
            method673((class188[]) null, 4, -8);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)V", line = 37)
    public static final void method671(int arg0, int arg1) {
        class271.field4645 = arg0;
        field1652++;
        class91.field1665 = -1;
        class91.field1665 = -1;
        class297.method2083(false);
        int var2 = -37 / ((64 - arg1) / 40);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)Lql;", line = 52)
    public static final class316 method672(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 29238) {
            field1656 = (boolean[]) null;
        }
        field1657++;
        class316 var4 = new class316();
        var4.field5453 = arg1;
        var4.field5456 = arg0;
        class62.field1098.method1749(true, var4, (long) arg2);
        class5.method40(arg3 ^ 0xFFFFA6B8, arg1);
        class188 var5 = class182.method1335((byte) 88, arg2);
        if (var5 != null) {
            class64.method500(var5, (byte) -117);
        }
        if (class278.field4815 != null) {
            class64.method500(class278.field4815, (byte) -117);
            class278.field4815 = null;
        }
        int var6 = class17.field244;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class256.method1801(43, class303.field5243[var7])) {
                class107.method757((byte) 109, var7);
            }
        }
        if (class17.field244 == 1) {
            class73.field1341 = false;
            class320.method2229(class137.field2389, class173.field3074, class85.field1538, class148.field2609, (byte) 90);
        } else {
            class320.method2229(class137.field2389, class173.field3074, class85.field1538, class148.field2609, (byte) 90);
            int var8 = class17.field215.method2045(class64.field1142);
            for (int var9 = 0; var9 < class17.field244; var9++) {
                int var10 = class17.field215.method2045(class191.method1387(var9, (byte) -104));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class173.field3074 = class17.field244 * 15 + (class36.field650 ? 26 : 22);
            class85.field1538 = var8 + 8;
        }
        if (var5 != null) {
            method675(false, var5, -1);
        }
        class269.method1859(arg1, (byte) 94);
        if (class211.field3803 != -1) {
            class281.method1965(class211.field3803, 24561, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([Lla;II)V", line = 144)
    public static final void method673(class188[] arg0, int arg1, int arg2) {
        field1649++;
        for (int var3 = arg1; var3 < arg0.length; var3++) {
            class188 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3467 == 0) {
                    if (var4.field3368 != null) {
                        method673(var4.field3368, 0, arg2);
                    }
                    class316 var5 = (class316) class62.field1098.method1744((byte) 126, (long) var4.field3342);
                    if (var5 != null) {
                        class281.method1965(var5.field5453, 24561, arg2);
                    }
                }
                if (arg2 == 0 && var4.field3363 != null) {
                    class119 var6 = new class119();
                    var6.field2116 = var4;
                    var6.field2114 = var4.field3363;
                    class91.method678((byte) -77, var6);
                }
                if (arg2 == 1 && var4.field3322 != null) {
                    if (var4.field3305 >= 0) {
                        class188 var7 = class182.method1335((byte) 125, var4.field3342);
                        if (var7 == null || var7.field3368 == null || var7.field3368.length <= var4.field3305 || var7.field3368[var4.field3305] != var4) {
                            continue;
                        }
                    }
                    class119 var8 = new class119();
                    var8.field2114 = var4.field3322;
                    var8.field2116 = var4;
                    class91.method678((byte) 121, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)I", line = 215)
    public static final int method674(int arg0, int arg1, int arg2) {
        field1653++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return arg1 > -42 ? -5 : (arg0 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLla;I)V", line = 251)
    public static final void method675(boolean arg0, class188 arg1, int arg2) {
        field1655++;
        int var3 = arg1.field3407 == 0 ? arg1.field3391 : arg1.field3407;
        int var4 = arg1.field3393 == 0 ? arg1.field3343 : arg1.field3393;
        class297.method2079(class50.field921[arg1.field3342 >> 16], var4, (byte) -116, arg0, var3, arg1.field3342);
        if (arg1.field3368 != null) {
            class297.method2079(arg1.field3368, var4, (byte) -125, arg0, var3, arg1.field3342);
        }
        if (arg2 == -1) {
            class316 var5 = (class316) class62.field1098.method1744((byte) 124, (long) arg1.field3342);
            if (var5 != null) {
                class254.method1741(var5.field5453, arg0, var3, -1, var4);
            }
        }
    }
}
