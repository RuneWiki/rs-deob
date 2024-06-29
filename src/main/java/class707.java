import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class707 {

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "Lsv;")
    public static class570 field9899 = new class570(75, -1);

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
    public static int field9903 = 0;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "I")
    public static int field9901;

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILmg;)Z", line = 6)
    public static final boolean method3947(int arg0, class248 arg1) {
        field9900++;
        if (arg0 > -85) {
            return true;
        } else if (arg1 == null) {
            return false;
        } else {
            return class372.method2219(0, arg1.field3559, arg1.field3567 - arg1.field3560, -arg1.field3559 + arg1.field3566, arg1.field3568 - arg1.field3562, arg1.field3560, arg1.field3562);
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V", line = 32)
    public static final void method3948(byte arg0) {
        field9901++;
        class453 var1 = (class453) class397.field5480.method3731((byte) -100);
        boolean var2 = class766.field10586 != null || class653.field9249 > 0;
        if (arg0 < 18) {
            method3949(-47);
        }
        int var3 = var1.method1873(-27);
        int var4 = var1.method1869((byte) 126);
        if (var2) {
            class17.field185 = 1;
        }
        if (var2) {
            class409.field5612 = class493.field6765;
        } else {
            class701.method3931(var3, var4, true, class493.field6765);
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V", line = 62)
    public static void method3949(int arg0) {
        if (arg0 != -1) {
            field9898 = -126;
        }
        field9899 = null;
    }
}
