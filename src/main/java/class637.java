import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class637 {

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field9308;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "Lkda;")
    public static class328 field9307;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)[B")
    public abstract byte[] method2937(int arg0, int arg1);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Luo;")
    public abstract class494 method2939(byte arg0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
    public abstract void method2938(int arg0, byte arg1);

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)Z")
    public static final boolean method3695(int arg0, int arg1) {
        if (arg1 != -4) {
            field9307 = null;
        }
        field9308++;
        return arg0 == 1 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method3696(int arg0) {
        if (arg0 == -6) {
            field9307 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)I")
    public abstract int method2941(int arg0, boolean arg1);
}
