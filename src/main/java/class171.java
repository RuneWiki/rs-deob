import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class171 extends class123 {

    @OriginalMember(owner = "client!cfa", name = "F", descriptor = "J")
    public static long field2368 = -1L;

    @OriginalMember(owner = "client!cfa", name = "E", descriptor = "F")
    public static float field2367;

    @OriginalMember(owner = "client!cfa", name = "A", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!cfa", name = "B", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!cfa", name = "C", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!cfa", name = "D", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!cfa", name = "<init>", descriptor = "(IIIIIF)V")
    public class171(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIBI)V")
    public final void method936(int arg0, int arg1, byte arg2, int arg3) {
        super.field1776 = arg1;
        super.field1774 = arg0;
        if (arg2 >= 54) {
            super.field1777 = arg3;
            ++field2366;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(BII)Z")
    public static final boolean method1184(byte arg0, int arg1, int arg2) {
        ++field2363;
        if (arg0 <= 117) {
            method1185(true);
        }
        return ~(arg2 & 34) != -1;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(FI)V")
    public final void method941(float arg0, int arg1) {
        if (arg1 != 34168) {
            method1185(false);
        }
        super.field1779 = arg0;
        ++field2365;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V")
    public static final void method1185(boolean arg0) {
        if (!arg0) {
            method1184((byte) 61, 20, -53);
        }
        ++field2364;
        ++class532.field7388;
        class589 var1 = class514.method2994(-29488, class760.field10605, class88.field1221);
        var1.field8251.method2578(0, -1221492240);
        class737.method4107(var1, 7);
    }
}
