import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class371 {

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Lbf;")
    public class344 field5069;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field5070;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([BI)V", line = 6)
    public final void method2285(byte[] arg0, int arg1) {
        if (this.field5070 == null || this.field5070.capacity() < arg1) {
            this.field5070 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field5070.clear();
        }
        this.field5070.put(arg0, 0, arg1);
        this.field5070.flip();
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lbf;[BI)V", line = 18)
    public class371(class344 arg0, byte[] arg1, int arg2) {
        this.field5069 = arg0;
        this.field5070 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field5070.put(arg1, 0, arg2);
        }
        this.field5070.flip();
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lbf;Ljava/nio/ByteBuffer;)V", line = 28)
    public class371(class344 arg0, ByteBuffer arg1) {
        this.field5069 = arg0;
        this.field5070 = arg1;
    }
}
