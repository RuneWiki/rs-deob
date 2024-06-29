import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class147 {

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "I")
    public static int field2558 = 0;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!ej", name = "h", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "[[Z")
    public static boolean[][] field2554;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lpj;III)V", line = 9)
    public static final void method1131(class171 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class150.field2573) {
            class242 var4 = class271.field4681[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4092 != null && var4.field4092.field3707.method420()) {
                arg0.method447(var4.field4092.field3707, 128, 0, 0, true);
            }
        }
        if (arg3 < class150.field2573) {
            class242 var5 = class271.field4681[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4092 != null && var5.field4092.field3707.method420()) {
                arg0.method447(var5.field4092.field3707, 0, 0, 128, true);
            }
        }
        if (arg2 < class150.field2573 && arg3 < class262.field4440) {
            class242 var6 = class271.field4681[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4092 != null && var6.field4092.field3707.method420()) {
                arg0.method447(var6.field4092.field3707, 128, 0, 128, true);
            }
        }
        if (arg2 < class150.field2573 && arg3 > 0) {
            class242 var7 = class271.field4681[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4092 != null && var7.field4092.field3707.method420()) {
                arg0.method447(var7.field4092.field3707, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 58)
    public static void method1132(int arg0) {
        if (arg0 != -12787) {
            method1132(19);
        }
        field2554 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(BIIILwc;)V", line = 84)
    public static final void method1133(byte arg0, int arg1, int arg2, int arg3, class96 arg4) {
        field2559++;
        if (class279.field4831 == arg4 || class126.field2188 >= 400) {
            return;
        }
        class75 var5;
        if (arg4.field1583 == 0) {
            var5 = class66.method562((byte) 126, new class75[] { arg4.method738((byte) -128), class282.method2000(0, arg4.field1576, class279.field4831.field1576), class13.field180, class120.field2018, class67.method565(60, arg4.field1576), class130.field2249 });
        } else {
            var5 = class66.method562((byte) -125, new class75[] { arg4.method738((byte) -128), class13.field180, class113.field1913, class67.method565(66, arg4.field1583), class130.field2249 });
        }
        if (class13.field176 == 1) {
            class232.method1694(-501, class244.field4110, (short) 46, arg2, class66.method562((byte) 114, new class75[] { class237.field3994, class221.field3768, var5 }), arg1, (long) arg3);
            class240.field4062++;
        } else if (!class161.field2738) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class134.field2308[var6] != null) {
                    class311.field5300++;
                    short var7 = 0;
                    if (class230.field3907 == 0 && class134.field2308[var6].method614(class116.field1962, -66)) {
                        if (arg4.field1576 > class279.field4831.field1576) {
                            var7 = 2000;
                        }
                        if (class279.field4831.field1560 != 0 && arg4.field1560 != 0) {
                            if (class279.field4831.field1560 == arg4.field1560) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class218.field3723[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    short var9 = class32.field459[var6];
                    short var10 = (short) (var7 + var9);
                    class232.method1694(-501, class134.field2308[var6], var10, arg2, class66.method562((byte) -86, new class75[] { class216.field3702, var5 }), arg1, (long) arg3);
                }
            }
        } else if ((class123.field2056 & 0x8) == 8) {
            class232.method1694(-501, class197.field3307, (short) 19, arg2, class66.method562((byte) -30, new class75[] { class215.field3673, class221.field3768, var5 }), arg1, (long) arg3);
            class98.field1634++;
        }
        if (arg0 <= 124) {
            field2558 = -23;
        }
        for (int var11 = 0; var11 < class126.field2188; var11++) {
            if (class99.field1646[var11] == 36) {
                class94.field1521[var11] = class66.method562((byte) 121, new class75[] { class216.field3702, var5 });
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(IB)Lwa;", line = 187)
    public static final class75 method1134(int arg0, byte arg1) {
        field2560++;
        if (arg1 == -90) {
            return class94.field1521[arg0].method640(1) > 0 ? class66.method562((byte) 122, new class75[] { class272.field4692[arg0], class10.field128, class94.field1521[arg0] }) : class272.field4692[arg0];
        } else {
            return (class75) null;
        }
    }
}
