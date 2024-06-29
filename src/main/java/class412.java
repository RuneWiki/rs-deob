import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class412 extends class333 {

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V")
    public class412() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)J")
    public final long method2129(boolean arg0) {
        return arg0 ? System.nanoTime() : 121L;
    }
}
