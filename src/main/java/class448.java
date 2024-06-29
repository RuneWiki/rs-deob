import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public abstract class class448 {

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Lpi;")
    public static class342 field6721 = new class342("K", "T", "K", "K");

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field6718;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "Len;")
    public static class208 field6722;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "[Lpl;")
    public static class459[] field6723;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method2677(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6719++;
        if (arg3 >= 1 && arg2 >= 1 && (class33.field662 - 2) >= arg3 && class121.field1966 - 2 >= arg2) {
            int var9 = arg8;
            if (arg8 < 3 && class389.method2400(arg3, arg2, 2)) {
                var9 = arg8 + 1;
            }
            if (!class443.field6623.method2840(255, class169.field2624) && !class114.method850(arg2, arg3, var9, class430.field6392, 108)) {
                return;
            }
            if (class380.field5761 == null) {
                return;
            }
            class471.field7072.method653(arg8, class141.field2244[arg8], class4.field109, arg5, arg2, (byte) 87, arg3);
            if (arg7 >= 0) {
                boolean var10 = class443.field6623.field593;
                class443.field6623.field593 = true;
                class471.field7072.method659(arg2, class4.field109, 5, arg4, arg6, arg1, class141.field2244[arg8], arg3, var9, arg7, arg8);
                class443.field6623.field593 = var10;
            }
        }
        int var11 = 38 % ((-arg0 - 43) / 63);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
    public static void method2678(byte arg0) {
        field6723 = null;
        field6722 = null;
        if (arg0 != -125) {
            method2677((byte) 10, 52, 40, -40, 22, -43, 14, -79, 51);
        }
        field6721 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIII)V")
    public static final void method2679(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6718++;
        class54 var5 = class442.method2651(arg2, 8, -13208);
        var5.method480(0);
        var5.field930 = arg1;
        if (arg4 == -2) {
            var5.field934 = arg3;
            var5.field933 = arg0;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lwm;B)Lwm;")
    public abstract class394 method320(class394 arg0, byte arg1);

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lqa;I)V")
    public static final void method2680(class162 arg0, int arg1) {
        field6720++;
        if (class295.field4199) {
            class455.method2713(true, arg0);
        } else {
            class155.method1166(arg0, -16777216);
        }
        if (arg1 != -2) {
            field6723 = null;
        }
    }
}
