import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class16 {

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Lao;")
    public class157 field193;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field192;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([BI)V")
    public final void method109(byte[] arg0, int arg1) {
        if (this.field192 == null || this.field192.capacity() < arg1) {
            this.field192 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field192.clear();
        }
        this.field192.put(arg0, 0, arg1);
        this.field192.flip();
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lao;[BI)V")
    public class16(class157 arg0, byte[] arg1, int arg2) {
        this.field193 = arg0;
        this.field192 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field192.put(arg1, 0, arg2);
        }
        this.field192.flip();
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lao;Ljava/nio/ByteBuffer;)V")
    public class16(class157 arg0, ByteBuffer arg1) {
        this.field193 = arg0;
        this.field192 = arg1;
    }
}
