import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class530 {

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field7675 = -1;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "[Ljd;")
    public static class241[] field7673;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V", line = 3)
    public static void method3202(int arg0) {
        if (arg0 == -1) {
            field7673 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(BI)Llu;", line = 16)
    public static final class741 method3203(byte arg0, int arg1) {
        field7674++;
        class741 var2 = (class741) class694.field9690.method3742((byte) 67, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class597.field8401.method4339(arg1, 0, 0);
        class741 var4 = new class741();
        if (var3 != null) {
            var4.method4126(23325, new class494(var3));
        }
        if (arg0 <= 11) {
            method3202(59);
        }
        var4.method4123(false);
        class694.field9690.method3739((long) arg1, (byte) 45, var4);
        return var4;
    }
}
