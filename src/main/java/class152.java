import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class152 {

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "Llc;")
    public static class143 field2758 = class66.method374("details", -1);

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2761 = 0;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(II)I")
    public static final int method1005(int arg0, int arg1) {
        field2756++;
        return arg0 > -113 ? 93 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)V")
    public static final void method1006(int arg0, int arg1, int arg2) {
        class166 var3 = class262.method1746(108, arg0, 6);
        var3.method1097((byte) -74);
        var3.field2978 = arg2;
        if (arg1 != -11335) {
            field2758 = null;
        }
        field2762++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIILgf;)Lek;")
    public static final class160 method1007(int arg0, int arg1, int arg2, class7 arg3) {
        field2760++;
        if (arg1 != 255) {
            field2758 = null;
        }
        return class189.method1223(arg3, arg0, 35, arg2) ? class192.method1304(1) : null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIB)V")
    public static final void method1008(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class188.field3398 = arg1;
        class239.field4321 = arg0;
        class9.field173 = arg3;
        class31.field481 = arg2;
        field2759++;
        if (arg4 != 1) {
            field2761 = -89;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method1009(int arg0) {
        field2758 = null;
        if (arg0 != 255) {
            field2761 = 45;
        }
    }
}
