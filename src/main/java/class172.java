import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class172 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "F")
    public static float field2519;

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1183(boolean arg0) {
        field2522++;
        class274.field4088 = new class477(class448.field6605.method2103(class30.field430, (byte) 34), "", class98.field1510, 1006, -1, 0L, 0, 0, arg0, false);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZI)V", line = 19)
    public static final void method1184(boolean arg0, int arg1) {
        field2521++;
        if (!arg0) {
            method1186(false);
        }
        if (class274.field4095 == 0) {
            class111.field1697.method3105(arg1, 16);
        } else {
            class210.field3032 = arg1;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIII)V", line = 37)
    public static final void method1185(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2520++;
        class506 var5 = class14.method185(arg1 ^ 0xB23D8A68, arg4, arg1);
        var5.method2992(arg1 - 8);
        var5.field7445 = arg0;
        var5.field7441 = arg2;
        var5.field7442 = arg3;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(Z)V", line = 50)
    public static final void method1186(boolean arg0) {
        if (!arg0) {
            method1184(true, -92);
        }
        class265.field3954 = null;
        field2524++;
        class39.method320(0, class155.field2347, -1, class413.field6241, 0, 0, class256.field3477, 0, 107);
        if (class265.field3954 != null) {
            class407.method2450(class311.field4834, -1412584499, class413.field6241, false, class155.field2347, 0, 0, class265.field3954, class146.field2193.field4688, class259.field3856);
            class265.field3954 = null;
        }
    }
}
