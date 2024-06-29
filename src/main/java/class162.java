import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class162 extends class34 {

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)J")
    public final long method517(byte arg0) {
        if (arg0 <= 65) {
            this.method517((byte) 34);
        }
        return System.nanoTime();
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class162() {
        System.nanoTime();
    }
}
