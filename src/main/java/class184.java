import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class184 extends class84 {

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3242;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z[B)V")
    public final void method557(boolean arg0, byte[] arg1) {
        if (!arg0) {
            this.method557(true, null);
        }
        this.field3242 = ByteBuffer.allocateDirect(arg1.length);
        this.field3242.position(0);
        this.field3242.put(arg1);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)[B")
    public final byte[] method554(int arg0) {
        if (arg0 == -21444) {
            byte[] var2 = new byte[this.field3242.capacity()];
            this.field3242.position(0);
            this.field3242.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }
}
