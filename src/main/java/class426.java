import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class426 {

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Lmm;")
    public class357 field5918;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field5919;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([BI)V", line = 6)
    public final void method2626(byte[] arg0, int arg1) {
        if (this.field5919 == null || this.field5919.capacity() < arg1) {
            this.field5919 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field5919.clear();
        }
        this.field5919.put(arg0, 0, arg1);
        this.field5919.flip();
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lmm;[BI)V", line = 18)
    public class426(class357 arg0, byte[] arg1, int arg2) {
        this.field5918 = arg0;
        this.field5919 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field5919.put(arg1, 0, arg2);
        }
        this.field5919.flip();
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lmm;Ljava/nio/ByteBuffer;)V", line = 29)
    public class426(class357 arg0, ByteBuffer arg1) {
        this.field5918 = arg0;
        this.field5919 = arg1;
    }
}
