import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class384 {

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "Lmi;")
    public class315 field5466;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field5465;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "([BI)V")
    public final void method2315(byte[] arg0, int arg1) {
        if (this.field5465 == null || this.field5465.capacity() < arg1) {
            this.field5465 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field5465.clear();
        }
        this.field5465.put(arg0, 0, arg1);
        this.field5465.flip();
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lmi;[BI)V")
    public class384(class315 arg0, byte[] arg1, int arg2) {
        this.field5466 = arg0;
        this.field5465 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field5465.put(arg1, 0, arg2);
        }
        this.field5465.flip();
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lmi;Ljava/nio/ByteBuffer;)V")
    public class384(class315 arg0, ByteBuffer arg1) {
        this.field5466 = arg0;
        this.field5465 = arg1;
    }
}
