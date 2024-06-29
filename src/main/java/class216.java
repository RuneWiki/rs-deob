import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class216 implements class215 {

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 3)
    public final void method21(int arg0) {
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "()V", line = 7)
    public final void method23() {
        if (class249.field4166) {
            class56.method384(true);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "()I", line = 12)
    public final int method19() {
        return 0;
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "()V", line = 15)
    public final void method18() {
        if (class249.field4166) {
            class56.method384(false);
        }
    }
}
