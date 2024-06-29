import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class362 extends class36 {

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class362() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)J")
    public final long method426(boolean arg0) {
        if (arg0) {
            this.method426(false);
        }
        return System.nanoTime();
    }
}
