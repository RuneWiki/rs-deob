import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class578 extends class142 {

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)J", line = 4)
    public final long method557(int arg0) {
        return arg0 == -1 ? System.nanoTime() : -73L;
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "()V", line = 12)
    public class578() {
        System.nanoTime();
    }
}
