import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class46 extends class38 {

    @OriginalMember(owner = "client!cja", name = "<init>", descriptor = "()V", line = 2)
    public class46() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(B)J", line = 11)
    public final long method274(byte arg0) {
        return arg0 == 80 ? System.nanoTime() : 56L;
    }
}
