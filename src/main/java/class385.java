import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class385 extends class310 {

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "()V", line = 2)
    public class385() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)J", line = 11)
    public final long method1934(byte arg0) {
        if (arg0 != -60) {
            this.method1934((byte) -100);
        }
        return System.nanoTime();
    }
}
