import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class521 extends class358 {

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V", line = 2)
    public class521() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)J", line = 11)
    public final long method2060(byte arg0) {
        if (arg0 != 69) {
            this.method2060((byte) -109);
        }
        return System.nanoTime();
    }
}
