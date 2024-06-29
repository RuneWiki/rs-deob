import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class159 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lsq;")
    public class96 field2525;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2526;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([BI)V", line = 11)
    public final void method1114(byte[] arg0, int arg1) {
        if (this.field2526 == null || this.field2526.capacity() < arg1) {
            this.field2526 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field2526.clear();
        }
        this.field2526.put(arg0, 0, arg1);
        this.field2526.flip();
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lsq;[BI)V", line = 19)
    public class159(class96 arg0, byte[] arg1, int arg2) {
        this.field2525 = arg0;
        this.field2526 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field2526.put(arg1, 0, arg2);
        }
        this.field2526.flip();
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lsq;Ljava/nio/ByteBuffer;)V", line = 29)
    public class159(class96 arg0, ByteBuffer arg1) {
        this.field2525 = arg0;
        this.field2526 = arg1;
    }
}
