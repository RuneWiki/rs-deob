import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class134 {

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Lab;")
    public static class279 field2255 = new class279(64);

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2258 = "Connected to update server";

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field2259 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[I")
    public static int[] field2253;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V", line = 6)
    public static final void method875(int arg0, int arg1) {
        if (arg1 >= -42) {
            field2258 = (String) null;
        }
        field2256++;
        if (class215.field3438 == arg0 && arg0 != 0) {
            class323 var2 = class141.field2335[arg0];
            var2.method186(class285.field4414);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 25)
    public static void method876(byte arg0) {
        int var1 = 28 % ((-arg0 - 44) / 60);
        field2253 = null;
        field2255 = null;
        field2258 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lrg;I)V", line = 42)
    public static final void method877(class255 arg0, int arg1) {
        field2251++;
        for (class174 var2 = (class174) class264.field4094.method424(-46); var2 != null; var2 = (class174) class264.field4094.method425(-32547)) {
            if (var2.field2790 == arg0) {
                if (var2.field2789 != null) {
                    class11.field230.method1237(var2.field2789);
                    var2.field2789 = null;
                }
                var2.method278((byte) -105);
                return;
            }
        }
        if (arg1 != 6033) {
            field2257 = -98;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V", line = 75)
    public static final void method878(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -51) {
            field2257 = 103;
        }
        field2254++;
        if ((arg4 - arg0) >= class147.field2416 && arg0 + arg4 <= class259.field4024 && class59.field1162 <= arg2 - arg0 && (arg0 + arg2) <= class186.field3028) {
            class247.method1632(arg0, arg1, arg4, arg2, -127);
        } else {
            class244.method1620(arg0, arg1, -76, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(II)Z", line = 98)
    public static final boolean method879(int arg0, int arg1) {
        field2252++;
        if (arg1 != -27468) {
            field2258 = (String) null;
        }
        return (arg0 & -arg0) == arg0;
    }
}
