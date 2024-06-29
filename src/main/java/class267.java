import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class267 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Z")
    public static boolean field3757 = false;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V", line = 10)
    public static final void method1752(int arg0, int arg1) {
        field3759++;
        class678 var2 = class630.method3597(arg0 ^ 0x73CE, arg0, (long) arg1);
        var2.method3836((byte) -98);
    }

    @OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;", line = 22)
    public final String toString() {
        field3758++;
        throw new IllegalStateException();
    }
}
