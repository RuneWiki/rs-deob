import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class194 extends class141 {

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)J")
    public final long method280(byte arg0) {
        return arg0 < 7 ? 116L : System.nanoTime();
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class194() {
        System.nanoTime();
    }
}
