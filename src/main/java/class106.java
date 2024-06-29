import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class106 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lta;")
    public static class251 field1758 = class184.method1279((byte) 108);

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lp;")
    public static class280 field1763 = class18.method140((byte) -123, "<)4col>");

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZB)Lp;")
    public static final class280 method741(int arg0, boolean arg1, byte arg2) {
        field1760++;
        if (arg2 < 93) {
            field1763 = null;
        }
        return class129.method885(10, arg1, -1, arg0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([Lp;[SI)V")
    public static final void method742(class280[] arg0, short[] arg1, int arg2) {
        field1761++;
        if (arg2 == 14073) {
            class214.method1433(true, arg0.length - 1, arg0, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method743(int arg0) {
        if (arg0 == 10) {
            field1763 = null;
            field1758 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ltg;Lwf;Ltg;BLtg;)Z")
    public static final boolean method744(class180 arg0, class1 arg1, class180 arg2, byte arg3, class180 arg4) {
        class154.field2659 = arg4;
        if (arg3 != 105) {
            return true;
        }
        class130.field2275 = arg2;
        field1759++;
        class232.field4055 = arg1;
        class181.field3169 = arg0;
        return true;
    }
}
