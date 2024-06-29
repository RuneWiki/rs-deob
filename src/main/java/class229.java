import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class229 extends class64 {

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)J", line = 4)
    public final long method583(int arg0) {
        return arg0 < 23 ? -46L : System.nanoTime();
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "()V", line = 12)
    public class229() {
        System.nanoTime();
    }
}
