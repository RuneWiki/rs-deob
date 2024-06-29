import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class146 extends class237 {

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2365;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)[B", line = 10)
    public final byte[] method1136(int arg0) {
        byte[] var2 = new byte[this.field2365.capacity()];
        this.field2365.position(0);
        this.field2365.get(var2);
        if (arg0 != -12678) {
            this.field2365 = (ByteBuffer) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I[B)V", line = 23)
    public final void method1137(int arg0, byte[] arg1) {
        this.field2365 = ByteBuffer.allocateDirect(arg1.length);
        this.field2365.position(0);
        this.field2365.put(arg1);
        if (arg0 != -1) {
            this.method1136(86);
        }
    }
}
