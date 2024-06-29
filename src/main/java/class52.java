import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class52 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lse;")
    public class282 field813;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field812;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BI)V")
    public final void method382(byte[] arg0, int arg1) {
        if (this.field812 == null || this.field812.capacity() < arg1) {
            this.field812 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field812.clear();
        }
        this.field812.put(arg0, 0, arg1);
        this.field812.flip();
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lse;[BI)V")
    public class52(class282 arg0, byte[] arg1, int arg2) {
        this.field813 = arg0;
        this.field812 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field812.put(arg1, 0, arg2);
        }
        this.field812.flip();
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lse;Ljava/nio/ByteBuffer;)V")
    public class52(class282 arg0, ByteBuffer arg1) {
        this.field813 = arg0;
        this.field812 = arg1;
    }
}
