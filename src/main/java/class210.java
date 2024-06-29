import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class210 extends class94 {

    @OriginalMember(owner = "client!vc", name = "j", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field4070;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)[B")
    public final byte[] method594(boolean arg0) {
        byte[] var2 = new byte[this.field4070.capacity()];
        this.field4070.position(0);
        this.field4070.get(var2);
        if (!arg0) {
            this.method590((byte) -33, null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(B[B)V")
    public final void method590(byte arg0, byte[] arg1) {
        if (arg0 != 52) {
            this.field4070 = null;
        }
        this.field4070 = ByteBuffer.allocateDirect(arg1.length);
        this.field4070.position(0);
        this.field4070.put(arg1);
    }
}
