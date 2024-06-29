import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class450 extends class310 {

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)J", line = 5)
    public final long method1934(byte arg0) {
        return arg0 == -60 ? class60.method371(false) * 1000000L : 101L;
    }
}
