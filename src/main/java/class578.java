import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class578 {

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "Lcq;")
    public static class110 field8183 = new class110(28, -2);

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "[Lbd;")
    public static class191[] field8187 = new class191[35];

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "Ldba;")
    public static class240 field8186 = new class240();

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field8182;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "[S")
    public static short[] field8185;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILoh;)V", line = 5)
    public static final void method3268(int arg0, class600 arg1) {
        field8184++;
        if (arg0 != 0) {
            method3270((byte) -124);
        }
        for (class273 var2 = (class273) class689.field9697.method3434((byte) 2); var2 != null; var2 = (class273) class689.field9697.method3430(true)) {
            if (var2.field3394 == arg1) {
                if (var2.field3406 != null) {
                    class209.field2471.method3885(var2.field3406);
                    var2.field3406 = null;
                }
                var2.method1922(91);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V", line = 42)
    public static void method3269(boolean arg0) {
        field8183 = null;
        if (!arg0) {
            field8185 = null;
        }
        field8186 = null;
        field8185 = null;
        field8187 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 55)
    public static final void method3270(byte arg0) {
        if (arg0 > 11) {
            field8182++;
            class698.field9800 = new class336(class198.field2289.method1195((byte) 62, class504.field7267), "", class178.field1992, 1009, -1, 0L, 0, 0, true, false);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(IZ)Z", line = 70)
    public static final boolean method3271(int arg0, boolean arg1) {
        if (!arg1) {
            field8187 = null;
        }
        field8181++;
        return arg0 == 10 || arg0 == 11 || arg0 == 12;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Lhfa;", line = 83)
    public static final class465 method3272(int arg0, int arg1, int arg2) {
        class499 var3 = class487.field7044[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7218;
    }
}
