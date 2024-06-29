import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class136 {

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lic;")
    public class246 field1638;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field1639;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([BI)V")
    public final void method644(byte[] arg0, int arg1) {
        if (this.field1639 == null || this.field1639.capacity() < arg1) {
            this.field1639 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field1639.clear();
        }
        this.field1639.put(arg0, 0, arg1);
        this.field1639.flip();
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lic;[BI)V")
    public class136(class246 arg0, byte[] arg1, int arg2) {
        this.field1638 = arg0;
        this.field1639 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field1639.put(arg1, 0, arg2);
        }
        this.field1639.flip();
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lic;Ljava/nio/ByteBuffer;)V")
    public class136(class246 arg0, ByteBuffer arg1) {
        this.field1638 = arg0;
        this.field1639 = arg1;
    }
}
