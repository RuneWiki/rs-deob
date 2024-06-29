import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class95 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Lh;")
    public class327 field1114;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field1115;

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lh;[BI)V")
    public class95(class327 arg0, byte[] arg1, int arg2) {
        this.field1114 = arg0;
        this.field1115 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field1115.put(arg1, 0, arg2);
        }
        this.field1115.flip();
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([BI)V")
    public final void method593(byte[] arg0, int arg1) {
        if (this.field1115 == null || this.field1115.capacity() < arg1) {
            this.field1115 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field1115.clear();
        }
        this.field1115.put(arg0, 0, arg1);
        this.field1115.flip();
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lh;Ljava/nio/ByteBuffer;)V")
    public class95(class327 arg0, ByteBuffer arg1) {
        this.field1114 = arg0;
        this.field1115 = arg1;
    }
}
