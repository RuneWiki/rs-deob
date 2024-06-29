import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class699 {

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "[I")
    public static int[] field9915;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V", line = 4)
    public static void method3917(boolean arg0) {
        if (!arg0) {
            field9915 = null;
        }
        field9915 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILsea;)Lvn;", line = 15)
    public static final class283 method3918(int arg0, int arg1, class648 arg2) {
        field9916++;
        int var3 = 91 % ((arg1 - 42) / 38);
        byte[] var4 = arg2.method3632(true, arg0);
        return var4 == null ? null : new class283(var4);
    }
}
