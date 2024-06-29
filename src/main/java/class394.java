import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class394 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lks;")
    public class173 field5733;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field5732;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BI)V", line = 6)
    public final void method2472(byte[] arg0, int arg1) {
        if (this.field5732 == null || this.field5732.capacity() < arg1) {
            this.field5732 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field5732.clear();
        }
        this.field5732.put(arg0, 0, arg1);
        this.field5732.flip();
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lks;[BI)V", line = 19)
    public class394(class173 arg0, byte[] arg1, int arg2) {
        this.field5733 = arg0;
        this.field5732 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field5732.put(arg1, 0, arg2);
        }
        this.field5732.flip();
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lks;Ljava/nio/ByteBuffer;)V", line = 29)
    public class394(class173 arg0, ByteBuffer arg1) {
        this.field5733 = arg0;
        this.field5732 = arg1;
    }
}
