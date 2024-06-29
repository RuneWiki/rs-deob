import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class272 extends class159 {

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4192;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([BZ)V", line = 5)
    public final void method1025(byte[] arg0, boolean arg1) {
        if (arg1) {
            this.field4192 = (ByteBuffer) null;
        }
        this.field4192 = ByteBuffer.allocateDirect(arg0.length);
        this.field4192.position(0);
        this.field4192.put(arg0);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)[B", line = 22)
    public final byte[] method1026(int arg0) {
        byte[] var2 = new byte[this.field4192.capacity()];
        this.field4192.position(0);
        if (arg0 == 1) {
            this.field4192.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
