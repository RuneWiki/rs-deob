import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class193 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lig;")
    public class132 field2789;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field2788;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BI)V", line = 7)
    public final void method1386(byte[] arg0, int arg1) {
        if (this.field2788 == null || this.field2788.capacity() < arg1) {
            this.field2788 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field2788.clear();
        }
        this.field2788.put(arg0, 0, arg1);
        this.field2788.flip();
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lig;[BI)V", line = 19)
    public class193(class132 arg0, byte[] arg1, int arg2) {
        this.field2789 = arg0;
        this.field2788 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field2788.put(arg1, 0, arg2);
        }
        this.field2788.flip();
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lig;Ljava/nio/ByteBuffer;)V", line = 29)
    public class193(class132 arg0, ByteBuffer arg1) {
        this.field2789 = arg0;
        this.field2788 = arg1;
    }
}
