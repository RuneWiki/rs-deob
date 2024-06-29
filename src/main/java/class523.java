import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class523 {

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "Lst;")
    public static class335 field7276 = new class335(32, -1);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method3112(int arg0, int arg1, int arg2) {
        field7272++;
        if (arg1 == -1) {
            return (arg2 & 0x84080) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V", line = 15)
    public static final void method3113(int arg0, int arg1) {
        field7275++;
        class346 var2 = class299.method1976(arg1 ^ arg1, 14, arg0);
        var2.method2208(-1719);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ID)V", line = 28)
    public static final void method3114(int arg0, double arg1) {
        field7271++;
        class513.field7094.method900(class515.field7152);
        class513.field7094.method882(0, arg0, (int) arg1);
        class496.field6948.method1444(class513.field7094);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 39)
    public static void method3115(int arg0) {
        field7276 = null;
        if (arg0 != 540800) {
            field7276 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)Z", line = 57)
    public static final boolean method3116(int arg0, boolean arg1) {
        field7274++;
        if (!arg1) {
            field7276 = null;
        }
        return arg0 == 0 || arg0 == 2;
    }
}
