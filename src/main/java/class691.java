import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class691 {

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "Ljo;")
    public static class359 field9807 = null;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field9805;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field9806;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZI)I", line = 7)
    public static final int method3859(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return -24;
        }
        field9806++;
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V", line = 34)
    public static void method3860(int arg0) {
        field9807 = null;
        int var1 = -33 % ((-arg0 - 78) / 42);
    }
}
