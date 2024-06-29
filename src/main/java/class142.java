import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public abstract class class142 {

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Laf;")
    public static class7 field3349 = class48.method406(40, "<br>(X");

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Laf;")
    private static class7 field3350 = class48.method406(40, "Jan");

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Laf;")
    private static class7 field3347 = class48.method406(40, "Feb");

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Laf;")
    private static class7 field3351 = class48.method406(40, "May");

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field3348 = 0;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "Laf;")
    public static class7 field3343 = class48.method406(40, ")4l");

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field3338 = 0;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Laf;")
    private static class7 field3355 = class48.method406(40, "Aug");

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Laf;")
    public static class7 field3362 = class48.method406(40, "Art");

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Laf;")
    private static class7 field3358 = class48.method406(40, "Apr");

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Laf;")
    private static class7 field3354 = class48.method406(40, "Mar");

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Laf;")
    private static class7 field3340 = class48.method406(40, "Sep");

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    public static int field3364 = 0;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Laf;")
    public static class7 field3359 = class48.method406(40, " <col=00ff80>");

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Laf;")
    private static class7 field3361 = class48.method406(40, "Nov");

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Laf;")
    public static class7 field3353 = class48.method406(40, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Laf;")
    public static class7 field3339 = class48.method406(40, ")2");

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field3366 = 0;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "Laf;")
    private static class7 field3369 = class48.method406(40, "Dec");

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "Laf;")
    public static class7 field3371 = class48.method406(40, "<br>");

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Laf;")
    private static class7 field3363 = class48.method406(40, "Jun");

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field3356 = 0;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Laf;")
    private static class7 field3368 = class48.method406(40, "Oct");

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "Laf;")
    private static class7 field3370 = class48.method406(40, "Jul");

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "[Laf;")
    public static class7[] field3341 = new class7[] { field3350, field3347, field3354, field3358, field3351, field3363, field3370, field3355, field3340, field3368, field3361, field3369 };

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Lr;")
    public static class118 field3373;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Lkb;")
    public static class71 field3352;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Lkb;")
    public static class71 field3360;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1154(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 >= -111) {
            return;
        }
        field3344++;
        if (arg7 < 1 || arg6 < 1 || arg7 > 102 || arg6 > 102) {
            return;
        }
        if (class91.field2106 && class8.field186 != arg0) {
            return;
        }
        boolean var8 = true;
        int var9 = 0;
        if (arg5 == 0) {
            var9 = class47.field1151.method1036(arg0, arg7, arg6);
        }
        if (arg5 == 1) {
            var9 = class47.field1151.method1030(arg0, arg7, arg6);
        }
        if (arg5 == 2) {
            var9 = class47.field1151.method1009(arg0, arg7, arg6);
        }
        boolean var10 = false;
        if (arg5 == 3) {
            var9 = class47.field1151.method1023(arg0, arg7, arg6);
        }
        boolean var11 = false;
        if (var9 != 0) {
            int var12 = var9 >> 14 & 0x7FFF;
            int var13 = class47.field1151.method1008(arg0, arg7, arg6, var9);
            int var14 = var13 & 0x1F;
            int var15 = var13 >> 6 & 0x3;
            if (arg5 == 0) {
                class47.field1151.method1003(arg0, arg7, arg6);
                class82 var16 = class155.method1214((byte) -75, var12);
                if (var16.field1897 != 0) {
                    class155.field3609[arg0].method725(arg6, var16.field1928, var14, arg7, var15, 64);
                }
            }
            if (arg5 == 1) {
                class47.field1151.method1026(arg0, arg7, arg6);
            }
            if (arg5 == 2) {
                class47.field1151.method1011(arg0, arg7, arg6);
                class82 var17 = class155.method1214((byte) -71, var12);
                if (arg7 + var17.field1917 > 103 || var17.field1917 + arg6 > 103 || var17.field1914 + arg7 > 103 || arg6 + var17.field1914 > 103) {
                    return;
                }
                if (var17.field1897 != 0) {
                    class155.field3609[arg0].method713(var17.field1914, arg7, var17.field1917, var15, arg6, var17.field1928, (byte) -125);
                }
            }
            if (arg5 == 3) {
                class47.field1151.method996(arg0, arg7, arg6);
                class82 var18 = class155.method1214((byte) -127, var12);
                if (var18.field1897 == 1) {
                    class155.field3609[arg0].method722(arg6, arg7, (byte) 81);
                }
            }
        }
        if (arg3 < 0) {
            return;
        }
        int var19 = arg0;
        if (arg0 < 3 && (class25.field670[1][arg7][arg6] & 0x2) == 2) {
            var19 = arg0 + 1;
        }
        class24.method226(arg0, class155.field3609[arg0], arg7, arg6, false, var19, arg1, class47.field1151, arg4, arg3);
        return;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public static final void method1155(int arg0) {
        if (arg0 != 103) {
            field3343 = null;
        }
        field3345++;
        class3.field22.method629(5530);
        class82.field1932 = null;
        class148.field3479 = 1;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method726(int arg0, Component arg1);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)I")
    public abstract int method727(boolean arg0);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Laf;II)V")
    public static final void method1156(class7 arg0, int arg1, int arg2) {
        field3367++;
        class7 var3 = arg0.method63(97).method96(65);
        boolean var4 = false;
        int var5 = 0;
        if (arg2 != 31) {
            return;
        }
        while (var5 < class130.field3088) {
            class92 var6 = class18.field425[class87.field2046[var5]];
            if (var6 != null && var6.field2121 != null && var6.field2121.method84(var3, 127)) {
                class57.method469(var6.field493[0], var6.field509[0], 10, 0, class21.field531.field493[0], 0, 1, 1, false, 2, 0, class21.field531.field509[0]);
                var4 = true;
                if (arg1 == 1) {
                    class51.field1220++;
                    class47.field1150.method1131(200, 2027385224);
                    class47.field1150.method939(arg2 ^ 0x1BC75D87, class87.field2046[var5]);
                }
                if (arg1 == 4) {
                    class47.field1150.method1131(84, arg2 ^ 0x78D77197);
                    class47.field1150.method933((byte) 89, class87.field2046[var5]);
                    class27.field725++;
                }
                break;
            }
            var5++;
        }
        if (!var4) {
            class53.method432(class116.method905(new class7[] { class77.field1784, var3 }, 1), 0, class52.field1243, -120);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Ldd;")
    public static final class26 method1157(int arg0, int arg1) {
        field3372++;
        class26 var2 = (class26) class49.field1184.method395(127, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class84.field1993.method572(8, false, arg1);
        class26 var4 = new class26();
        if (var3 != null) {
            var4.method238(0, new class122(var3));
        }
        class49.field1184.method388(var4, (long) arg1, arg0 ^ 0xFFFF9159);
        if (arg0 != -26970) {
            method1154(46, 19, (byte) -88, -114, -13, 127, -121, 111);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V")
    public static final void method1158(int arg0, int arg1, int arg2) {
        field3365++;
        if (class23.field622 != 2) {
            return;
        }
        class50.method418((class43.field1023 - class153.field3585 << 7) + class20.field524, false, (class135.field3176 - class32.field843 << 7) + class3.field33, class105.field2581 * 2);
        if (class77.field1767 > -1 && class155.field3611 % 20 < 10) {
            class111.field2687[0].method341(class77.field1767 + arg2 - 12, class13.field340 + -28 + arg1);
        }
        if (arg0 != -4) {
            field3354 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public static void method1159(int arg0) {
        field3371 = null;
        field3370 = null;
        field3354 = null;
        field3353 = null;
        field3341 = null;
        field3360 = null;
        field3351 = null;
        field3359 = null;
        field3349 = null;
        field3363 = null;
        field3362 = null;
        field3343 = null;
        field3339 = null;
        field3347 = null;
        field3358 = null;
        field3373 = null;
        field3368 = null;
        field3355 = null;
        field3361 = null;
        field3352 = null;
        field3340 = null;
        field3350 = null;
        field3369 = null;
        if (arg0 != 200) {
            method1156(null, -7, 0);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method728(byte arg0, Component arg1);
}
