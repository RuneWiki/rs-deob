import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class439 extends class205 {

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)J")
    public final long method1327(int arg0) {
        return arg0 > -125 ? 34L : class446.method2525(500) * 1000000L;
    }
}
