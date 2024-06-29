import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class481 extends class59 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)J")
    public final long method320(byte arg0) {
        if (arg0 != 56) {
            this.method320((byte) 22);
        }
        return System.nanoTime();
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class481() {
        System.nanoTime();
    }
}
