import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class145 extends class139 {

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2235;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)[B", line = 6)
    public final byte[] method1004(int arg0) {
        byte[] var2 = new byte[this.field2235.capacity()];
        this.field2235.position(arg0);
        this.field2235.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I[B)V", line = 20)
    public final void method1006(int arg0, byte[] arg1) {
        this.field2235 = ByteBuffer.allocateDirect(arg1.length);
        this.field2235.position(0);
        this.field2235.put(arg1);
        if (arg0 != 14) {
            this.method1004(89);
        }
    }
}
