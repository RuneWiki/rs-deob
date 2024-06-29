import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class314 extends class190 {

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4583;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)[B", line = 6)
    public final byte[] method1472(boolean arg0) {
        if (arg0) {
            this.field4583 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field4583.capacity()];
        this.field4583.position(0);
        this.field4583.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([BI)V", line = 19)
    public final void method1473(byte[] arg0, int arg1) {
        this.field4583 = ByteBuffer.allocateDirect(arg0.length);
        this.field4583.position(0);
        this.field4583.put(arg0);
        if (arg1 != 16) {
            this.field4583 = (ByteBuffer) null;
        }
    }
}
