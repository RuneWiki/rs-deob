import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class320 extends class439 {

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class320() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)J")
    public final long method2053(int arg0) {
        return arg0 == 1 ? System.nanoTime() : -111L;
    }
}
