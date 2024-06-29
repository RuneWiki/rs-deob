import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class247 extends class130 {

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public int field4389;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public int field4395;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "Lah;")
    public static class22 field4393 = new class22(260);

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "[Lic;")
    public static class134[] field4397 = new class134[2048];

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
    public static void method1683(byte arg0) {
        if (arg0 < -42) {
            field4393 = null;
            field4397 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIZIII)Lub;")
    public static final class43 method1684(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field4390++;
        if (arg4 >= -122) {
            field4393 = null;
        }
        long var6 = ((long) arg1 << 38) + ((long) arg3 << 16) + (long) arg5 + (arg2 ? 137438953472L : 0L) + ((long) arg0 << 40);
        class43 var8 = (class43) class256.field4497.method1537(var6, false);
        if (var8 != null) {
            return var8;
        }
        class15.field174 = false;
        class43 var9 = class143.method886(arg5, arg1, false, false, arg0, arg3, 0, arg2);
        if (var9 != null && !class15.field174) {
            class256.field4497.method1532(true, var6, var9);
        }
        return var9;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIILic;)V")
    public static final void method1685(int arg0, int arg1, int arg2, int arg3, class134 arg4) {
        field4394++;
        if (class102.field1477 == arg4 || class125.field1767 >= 400) {
            return;
        }
        class196 var5;
        if (arg4.field1914 == 0) {
            var5 = class93.method572(-92, new class196[] { arg4.field1924, class94.method582(arg4.field1939, class102.field1477.field1939, (byte) -2), class24.field302, class230.field4092, class163.method1029(arg4.field1939, false), class231.field4112 });
        } else {
            var5 = class93.method572(-92, new class196[] { arg4.field1924, class24.field302, class177.field2984, class163.method1029(arg4.field1914, false), class231.field4112 });
        }
        if (class34.field416 == 1) {
            class235.method1577(class93.method572(-77, new class196[] { class232.field4135, class118.field1722, var5 }), arg3, (short) 17, -1709, arg2, (long) arg0, class80.field1150);
            class143.field2189++;
        } else if (!class171.field2883) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class194.field3410[var6] != null) {
                    class33.field401++;
                    short var7 = 0;
                    boolean var8 = false;
                    if (class158.field2546 == 0 && class194.field3410[var6].method1320(false, class209.field3763)) {
                        if (class102.field1477.field1939 < arg4.field1939) {
                            var7 = 2000;
                        }
                        if (class102.field1477.field1917 != 0 && arg4.field1917 != 0) {
                            if (class102.field1477.field1917 == arg4.field1917) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class229.field4081[var6]) {
                        var7 = 2000;
                    }
                    short var9 = class48.field584[var6];
                    short var10 = (short) (var7 + var9);
                    class235.method1577(class93.method572(-65, new class196[] { class177.field2985, var5 }), arg3, var10, -1709, arg2, (long) arg0, class194.field3410[var6]);
                }
            }
        } else if ((class62.field848 & 0x8) == 8) {
            class132.field1877++;
            class235.method1577(class93.method572(-78, new class196[] { class206.field3706, class118.field1722, var5 }), arg3, (short) 38, -1709, arg2, (long) arg0, class57.field764);
        }
        for (int var11 = 0; var11 < class125.field1767; var11++) {
            if (class142.field2169[var11] == 13) {
                class52.field650[var11] = class93.method572(-119, new class196[] { class177.field2985, var5 });
                break;
            }
        }
        if (arg1 > -120) {
            method1683((byte) -13);
        }
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(II)V")
    public class247(int arg0, int arg1) {
        this.field4389 = arg0;
        this.field4395 = arg1;
    }
}
