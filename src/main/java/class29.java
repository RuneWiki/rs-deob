import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 {

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
    public class29(int arg0) {
        this.field397 = arg0;
    }

    @OriginalMember(owner = "client!be", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field399++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIIII)V")
    public static final void method219(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 0) {
            field398++;
            for (int var6 = arg2; var6 <= arg3; var6++) {
                class184.method1160(class387.field5088[var6], -7, arg0, arg4, arg5);
            }
        }
    }
}
