import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class450 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lqi;")
    public class458 field6190;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field6191;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([BI)V", line = 10)
    public final void method2608(byte[] arg0, int arg1) {
        if (this.field6191 == null || this.field6191.capacity() < arg1) {
            this.field6191 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field6191.clear();
        }
        this.field6191.put(arg0, 0, arg1);
        this.field6191.flip();
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lqi;[BI)V", line = 19)
    public class450(class458 arg0, byte[] arg1, int arg2) {
        this.field6190 = arg0;
        this.field6191 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field6191.put(arg1, 0, arg2);
        }
        this.field6191.flip();
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lqi;Ljava/nio/ByteBuffer;)V", line = 29)
    public class450(class458 arg0, ByteBuffer arg1) {
        this.field6190 = arg0;
        this.field6191 = arg1;
    }
}
