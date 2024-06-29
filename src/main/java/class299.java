import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class299 extends class210 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)J", line = 5)
    public final long method1454(byte arg0) {
        return arg0 <= 34 ? 3L : class337.method2062(false) * 1000000L;
    }
}
