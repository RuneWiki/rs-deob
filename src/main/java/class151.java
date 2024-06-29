import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class151 {

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lhj;")
    public class338 field2150;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2151;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "([BI)V", line = 7)
    public final void method1027(byte[] arg0, int arg1) {
        if (this.field2151 == null || this.field2151.capacity() < arg1) {
            this.field2151 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field2151.clear();
        }
        this.field2151.put(arg0, 0, arg1);
        this.field2151.flip();
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lhj;[BI)V", line = 18)
    public class151(class338 arg0, byte[] arg1, int arg2) {
        this.field2150 = arg0;
        this.field2151 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field2151.put(arg1, 0, arg2);
        }
        this.field2151.flip();
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lhj;Ljava/nio/ByteBuffer;)V", line = 29)
    public class151(class338 arg0, ByteBuffer arg1) {
        this.field2150 = arg0;
        this.field2151 = arg1;
    }
}
