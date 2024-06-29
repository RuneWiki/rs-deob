import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class37 extends class297 {

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field389;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BZ)V")
    public final void method180(byte[] arg0, boolean arg1) {
        this.field389 = ByteBuffer.allocateDirect(arg0.length);
        if (arg1) {
            this.field389 = (ByteBuffer) null;
        }
        this.field389.position(0);
        this.field389.put(arg0);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)[B")
    public final byte[] method181(int arg0) {
        byte[] var2 = new byte[this.field389.capacity()];
        if (arg0 == -58) {
            this.field389.position(0);
            this.field389.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
