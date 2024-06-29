import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class748 extends class160 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)J")
    public final long method108(int arg0) {
        return arg0 == -2 ? System.nanoTime() : 55L;
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
    public class748() {
        System.nanoTime();
    }
}
