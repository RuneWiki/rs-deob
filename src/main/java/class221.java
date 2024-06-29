import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class221 extends class617 {

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V")
    public class221() {
        System.nanoTime();
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)J")
    public final long method1445(byte arg0) {
        if (arg0 != -7) {
            this.method1445((byte) -99);
        }
        return System.nanoTime();
    }
}
