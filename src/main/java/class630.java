import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class630 {

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "[C")
    public static char[] field8902 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field8899;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIJ)Lfk;")
    public static final class678 method3597(int arg0, int arg1, long arg2) {
        if (arg0 != 29636) {
            field8899 = null;
        }
        field8900++;
        class678 var4 = (class678) class737.field10289.method380((byte) -3, arg2 | (long) arg1 << 56);
        if (var4 == null) {
            var4 = new class678(arg1, arg2);
            class737.field10289.method384(var4.field7577, var4, false);
        }
        return var4;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)Z")
    public static final boolean method3598(byte arg0) {
        field8901++;
        if (arg0 <= 68) {
            method3599(102);
        }
        return class291.method1971("jaclib", 0) ? class291.method1971("hw3d", 0) : false;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method3599(int arg0) {
        field8902 = null;
        if (arg0 >= -31) {
            field8899 = null;
        }
        field8899 = null;
    }
}
