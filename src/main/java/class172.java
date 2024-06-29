import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class172 extends class70 {

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2715;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "([BI)V", line = 9)
    public final void method544(byte[] arg0, int arg1) {
        this.field2715 = ByteBuffer.allocateDirect(arg0.length);
        this.field2715.position(0);
        if (arg1 < 51) {
            this.field2715 = (ByteBuffer) null;
        }
        this.field2715.put(arg0);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)[B", line = 22)
    public final byte[] method542(byte arg0) {
        byte[] var2 = new byte[this.field2715.capacity()];
        this.field2715.position(0);
        if (arg0 != 117) {
            this.method542((byte) -8);
        }
        this.field2715.get(var2);
        return var2;
    }
}
