import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class194 {

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "Lpo;")
    public class332 field2643;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2644;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([BI)V", line = 6)
    public final void method1237(byte[] arg0, int arg1) {
        if (this.field2644 == null || this.field2644.capacity() < arg1) {
            this.field2644 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field2644.clear();
        }
        this.field2644.put(arg0, 0, arg1);
        this.field2644.flip();
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lpo;[BI)V", line = 17)
    public class194(class332 arg0, byte[] arg1, int arg2) {
        this.field2643 = arg0;
        this.field2644 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field2644.put(arg1, 0, arg2);
        }
        this.field2644.flip();
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lpo;Ljava/nio/ByteBuffer;)V", line = 28)
    public class194(class332 arg0, ByteBuffer arg1) {
        this.field2643 = arg0;
        this.field2644 = arg1;
    }
}
