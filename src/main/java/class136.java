import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class136 extends class182 {

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
    public class136() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)J")
    public final long method784(boolean arg0) {
        return arg0 ? 122L : System.nanoTime();
    }
}
