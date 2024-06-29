import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class529 {

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field6872 = -1;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z")
    public static final boolean method2816(int arg0, int arg1) {
        field6870++;
        if (arg0 == 0) {
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZZI)Lhw;")
    public static final class270 method2817(int arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field6871++;
        class270 var5 = new class270();
        var5.field3588 = arg1;
        var5.field3591 = arg4;
        if (arg3) {
            field6872 = 80;
        }
        class700.field9763.method38(var5, 110, (long) arg0);
        class388.method2221(arg1, (byte) -50);
        class477 var6 = class600.method3268(-104, arg0);
        if (var6 != null) {
            class386.method2199(var6, false);
        }
        if (class357.field4636 != null) {
            class386.method2199(class357.field4636, false);
            class357.field4636 = null;
        }
        class459.method2583((byte) -121);
        if (var6 != null) {
            class133.method965(1900077296, !arg2, var6);
        }
        if (!arg2) {
            class709.method3890(arg1);
        }
        if (!arg2 && class196.field2562 != -1) {
            class491.method2685(1, 2626, class196.field2562);
        }
        return var5;
    }
}
