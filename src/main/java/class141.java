import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class141 {

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lud;")
    private static class279 field2556 = class130.method1024("Cancel", 255);

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lud;")
    public static class279 field2562 = class130.method1024("::wm0", 255);

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Lud;")
    public static class279 field2560 = class130.method1024(" s(West connect-B)3", 255);

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lud;")
    public static class279 field2564 = null;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Lud;")
    public static class279 field2565 = field2556;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field2557 = 0;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field2566 = 0;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "[I")
    public static int[] field2570 = new int[2500];

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lue;")
    public static class15 field2558;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lgf;")
    public static class8 field2563;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 15)
    public static final void method1084(int arg0) {
        field2569++;
        if (class243.field4315 > arg0) {
            class63.method551(-47);
        } else {
            class312.field5522 = class202.field3603;
            class202.field3603 = null;
            class172.method1343(40, -29401);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIZLga;)Lga;", line = 34)
    public static final class19 method1085(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class19 arg6) {
        field2561++;
        long var7 = (long) arg3;
        class19 var9 = (class19) class73.field1437.method1336(var7, 0);
        if (var9 == null) {
            class148 var10 = class148.method1157(class44.field923, arg3, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1144(64, 768, -50, -10, -50);
            class73.field1437.method1331(var9, 30237, var7);
        }
        if (arg5) {
            return (class19) null;
        }
        int var11 = arg6.method180();
        int var12 = arg6.method160();
        int var13 = arg6.method173();
        int var14 = arg6.method175();
        class19 var15 = var9.method187(true, true, true);
        if (arg0 != 0) {
            var15.method182(arg0);
        }
        if (class97.field1824) {
            class299 var16 = (class299) var15;
            if (arg1 != class130.method1025(arg4 + var11, 1008652135, class287.field5134, arg2 + var13) || arg1 != class130.method1025(arg4 + var12, 1008652135, class287.field5134, arg2 + var14)) {
                for (int var17 = 0; var17 < var16.field5323; var17++) {
                    var16.field5330[var17] += class130.method1025(var16.field5317[var17] + arg4, 1008652135, class287.field5134, var16.field5299[var17] + arg2) - arg1;
                }
                var16.field5302.field967 = false;
                var16.field5295.field2475 = false;
            }
        } else {
            class242 var18 = (class242) var15;
            if (arg1 != class130.method1025(arg4 + var11, 1008652135, class287.field5134, arg2 + var13) || class130.method1025(arg4 + var12, 1008652135, class287.field5134, arg2 + var14) != arg1) {
                for (int var19 = 0; var19 < var18.field4236; var19++) {
                    var18.field4248[var19] += class130.method1025(var18.field4245[var19] + arg4, 1008652135, class287.field5134, var18.field4234[var19] + arg2) - arg1;
                }
                var18.field4229 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIIIII)V", line = 122)
    public static final void method1086(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2559++;
        if (arg3 - arg0 >= class249.field4449 && class44.field929 >= (arg3 + arg0) && (arg6 - arg0) >= class135.field2463 && class108.field2002 >= arg0 + arg6) {
            class63.method555(arg6, arg2, arg4, 0, arg0, arg3, arg5);
        } else {
            class74.method639(arg6, arg0, arg5, arg2, 0, arg4, arg3);
        }
        if (!arg1) {
            method1087(-15);
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 156)
    public static void method1087(int arg0) {
        field2565 = null;
        field2562 = null;
        field2556 = null;
        field2558 = null;
        if (arg0 != 64) {
            field2557 = -122;
        }
        field2564 = null;
        field2560 = null;
        field2570 = null;
        field2563 = null;
    }
}
