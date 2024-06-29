import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class76 extends class142 {

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)J")
    public final long method557(int arg0) {
        return arg0 == -1 ? class97.method654((byte) 124) * 1000000L : 109L;
    }
}
