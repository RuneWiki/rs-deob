import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class377 extends class190 {

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(B)J")
    public final long method1313(byte arg0) {
        return arg0 < 7 ? 54L : System.nanoTime();
    }

    @OriginalMember(owner = "client!du", name = "<init>", descriptor = "()V")
    public class377() {
        System.nanoTime();
    }
}
