import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class213 extends class663 {

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "()V")
    public class213() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)J")
    public final long method1495(byte arg0) {
        if (arg0 != 99) {
            this.method1495((byte) 73);
        }
        return System.nanoTime();
    }
}
