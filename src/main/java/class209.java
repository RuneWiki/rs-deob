import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class209 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field2843 = -2;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Z")
    public static boolean field2846 = false;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([J[Ljava/lang/Object;I)V", line = 19)
    public static final void method1368(long[] arg0, Object[] arg1, int arg2) {
        class119.method866(arg0.length + arg2, 0, 45, arg1, arg0);
        field2842++;
    }
}
