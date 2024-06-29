import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class209 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[J")
    public static long[] field3570 = new long[200];

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Z")
    public static boolean field3575 = false;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Lme;")
    public class177 field3573;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Ldm;")
    public class273 field3572;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 15)
    public static void method1503(byte arg0) {
        if (arg0 < -116) {
            field3570 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLpb;)Lnl;", line = 30)
    public static final class29 method1504(byte arg0, class70 arg1) {
        if (arg0 >= 0) {
            method1505(-33, -38);
        }
        field3571++;
        return new class29(arg1.method454((byte) 84), arg1.method454((byte) 84), arg1.method454((byte) 84), arg1.method454((byte) 84), arg1.method465(true), arg1.method481(0));
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)V", line = 46)
    public static final void method1505(int arg0, int arg1) {
        field3578++;
        class53 var2 = class303.method2112(arg1 - 1155040163, arg0, arg1);
        var2.method326(arg1 + 76);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lrg;B)I", line = 61)
    public static final int method1506(class88 arg0, byte arg1) {
        field3574++;
        int var2 = 0;
        if (arg0.method634(-19044, class124.field2061)) {
            var2++;
        }
        if (arg0.method634(-19044, class128.field2111)) {
            var2++;
        }
        if (arg0.method634(-19044, class191.field3052)) {
            var2++;
        }
        if (arg0.method634(-19044, class208.field3564)) {
            var2++;
        }
        if (arg0.method634(-19044, class96.field1650)) {
            var2++;
        }
        if (arg0.method634(-19044, class280.field4790)) {
            var2++;
        }
        if (arg0.method634(-19044, class24.field361)) {
            var2++;
        }
        if (arg1 < 81) {
            method1507(125, -24, 94, (byte) 79, 39, 86);
        }
        if (arg0.method634(-19044, class58.field888)) {
            var2++;
        }
        if (arg0.method634(-19044, class56.field875)) {
            var2++;
        }
        if (arg0.method634(-19044, class30.field490)) {
            var2++;
        }
        if (arg0.method634(-19044, class190.field3037)) {
            var2++;
        }
        if (arg0.method634(-19044, class268.field4595)) {
            var2++;
        }
        if (arg0.method634(-19044, class123.field2048)) {
            var2++;
        }
        if (arg0.method634(-19044, class287.field4924)) {
            var2++;
        }
        if (arg0.method634(-19044, class90.field1538)) {
            var2++;
        }
        if (arg0.method634(-19044, class295.field5069)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIBII)V", line = 126)
    public static final void method1507(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3576++;
        if (arg3 > -85) {
            field3575 = false;
        }
        if (arg1 >= class125.field2082 && arg0 <= class30.field473 && arg2 >= class261.field4427 && class11.field156 >= arg5) {
            class74.method530(96, arg4, arg1, arg2, arg0, arg5);
        } else {
            class181.method1271(arg4, 3, arg5, arg1, arg0, arg2);
        }
    }
}
