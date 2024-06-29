import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class693 {

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field9762 = 2;

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lsv;")
    public static class570 field9760 = new class570(9, 3);

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Z")
    public static boolean field9764 = false;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "I")
    public static int field9758;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3891(int arg0) {
        if (class548.field7629 != null) {
            for (int var1 = 0; var1 < class548.field7629.length; var1++) {
                for (int var2 = 0; var2 < class548.field7629[var1].length; var2++) {
                    class548.field7629[var1][var2] = class252.field3618;
                }
            }
        }
        field9761++;
        if (arg0 < 82) {
            method3891(-92);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)V", line = 43)
    public static void method3892(byte arg0) {
        field9760 = null;
        if (arg0 >= -98) {
            method3894((byte) -86, 47);
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)I", line = 53)
    public static final int method3893(byte arg0) {
        field9758++;
        if (arg0 >= -88) {
            return -15;
        } else if (class40.field468 == null) {
            return 0;
        } else {
            return class40.field468.length * 2;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)Z", line = 70)
    public static final boolean method3894(byte arg0, int arg1) {
        if (arg0 == -124) {
            field9759++;
            return arg1 == 0 || arg1 == 2;
        } else {
            return true;
        }
    }
}
