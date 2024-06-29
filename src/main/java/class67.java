import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class67 {

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Lge;")
    public class104 field1118;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field1117;

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lge;[BI)V", line = 5)
    public class67(class104 arg0, byte[] arg1, int arg2) {
        this.field1118 = arg0;
        this.field1117 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field1117.put(arg1, 0, arg2);
        }
        this.field1117.flip();
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "([BI)V", line = 19)
    public final void method507(byte[] arg0, int arg1) {
        if (this.field1117 == null || this.field1117.capacity() < arg1) {
            this.field1117 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field1117.clear();
        }
        this.field1117.put(arg0, 0, arg1);
        this.field1117.flip();
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lge;Ljava/nio/ByteBuffer;)V", line = 28)
    public class67(class104 arg0, ByteBuffer arg1) {
        this.field1118 = arg0;
        this.field1117 = arg1;
    }
}
