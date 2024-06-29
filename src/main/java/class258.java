import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class258 {

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Ljm;")
    public static class485 field3562 = new class485(79, -1);

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V", line = 8)
    public static void method1500(boolean arg0) {
        if (arg0) {
            field3562 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 19)
    public static final boolean method1501(int arg0, String arg1) {
        if (arg0 < 21) {
            method1502(-32, (char) 65412);
        }
        field3561++;
        return class167.method1031(true, 10, 43, arg1);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IC)Z", line = 39)
    public static final boolean method1502(int arg0, char arg1) {
        field3565++;
        if (arg0 != 95) {
            method1503(32, -17, true, (byte) 107);
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IIZB)I", line = 53)
    public static final int method1503(int arg0, int arg1, boolean arg2, byte arg3) {
        field3564++;
        class113 var4 = class223.method1313(arg2, arg3 - 2147483539, arg1);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            if (arg3 != -109) {
                field3562 = null;
            }
            for (int var6 = 0; var6 < var4.field1529.length; var6++) {
                if (var4.field1528[var6] == arg0) {
                    var5 += var4.field1529[var6];
                }
            }
            return var5;
        }
    }
}
