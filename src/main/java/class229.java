import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class229 {

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3589 = "Loading title screen - ";

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field3592 = 0;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field3587 = 0;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "Lrm;")
    public static class184 field3586 = new class184(100);

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field3594 = 0;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field3595 = 0;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Ljava/lang/String;", line = 9)
    public static final String method1661(int arg0, int arg1) {
        field3588++;
        String var2 = Integer.toString(arg1);
        int var3 = var2.length() - 3;
        if (arg0 != 0) {
            method1662(false);
        }
        while (var3 > 0) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            var3 -= 3;
        }
        if (var2.length() <= 9) {
            return var2.length() <= 6 ? " <col=ffff00>" + var2 + "</col>" : " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class270.field4198 + " (" + var2 + ")</col>";
        } else {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class57.field791 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)V", line = 50)
    public static void method1662(boolean arg0) {
        field3589 = null;
        field3586 = null;
        if (arg0) {
            field3594 = 37;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IJI[I)Ljava/lang/String;", line = 65)
    public static final String method1663(int arg0, long arg1, int arg2, int[] arg3) {
        field3590++;
        if (arg2 >= -57) {
            field3595 = -3;
        }
        if (class318.field5032 != null) {
            String var5 = class318.field5032.method148(7824, arg3, arg0, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }
}
