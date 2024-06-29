import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class641 extends class619 {

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "()V")
    public class641() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)J")
    public final long method2001(boolean arg0) {
        if (arg0) {
            this.method2001(false);
        }
        return System.nanoTime();
    }
}
