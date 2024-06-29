import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class29 implements class13 {

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "()V", line = 5)
    public final void method50() {
        if (class44.field539) {
            class90.method624(true);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V", line = 10)
    public final void method47(int arg0) {
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "()V", line = 12)
    public final void method49() {
        if (class44.field539) {
            class90.method624(false);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "()I", line = 17)
    public final int method48() {
        return 0;
    }
}
