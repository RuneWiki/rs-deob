import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class343 extends class110 {

    @OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V", line = 2)
    public class343() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z)J", line = 11)
    public final long method796(boolean arg0) {
        if (arg0) {
            this.method796(false);
        }
        return System.nanoTime();
    }
}
