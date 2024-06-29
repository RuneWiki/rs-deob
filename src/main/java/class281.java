import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class281 implements class145 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 3)
    public final void method321(int arg0) {
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "()V", line = 5)
    public final void method318() {
        if (class192.field2903) {
            class333.method2308(true);
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "()V", line = 12)
    public final void method315() {
        if (class192.field2903) {
            class333.method2308(false);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()I", line = 17)
    public final int method320() {
        return 0;
    }
}
