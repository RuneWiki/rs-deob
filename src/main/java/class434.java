import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class434 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Lnm;")
    public class254 field6162;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field6161;

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lnm;[BI)V", line = 7)
    public class434(class254 arg0, byte[] arg1, int arg2) {
        this.field6162 = arg0;
        this.field6161 = ByteBuffer.allocateDirect(arg2);
        if (arg1 != null) {
            this.field6161.put(arg1, 0, arg2);
        }
        this.field6161.flip();
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lnm;Ljava/nio/ByteBuffer;)V", line = 18)
    public class434(class254 arg0, ByteBuffer arg1) {
        this.field6162 = arg0;
        this.field6161 = arg1;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "([BI)V", line = 27)
    public final void method2538(byte[] arg0, int arg1) {
        if (this.field6161 == null || this.field6161.capacity() < arg1) {
            this.field6161 = ByteBuffer.allocateDirect(arg1);
        } else {
            this.field6161.clear();
        }
        this.field6161.put(arg0, 0, arg1);
        this.field6161.flip();
    }
}
