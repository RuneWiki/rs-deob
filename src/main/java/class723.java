import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class723 extends class748 {

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)J", line = 4)
    public final long method2683(int arg0) {
        return arg0 == 2 ? System.nanoTime() : -74L;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "()V", line = 12)
    public class723() {
        System.nanoTime();
    }
}
