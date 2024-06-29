import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class148 extends class70 {

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field3002;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)[B")
    public final byte[] method509(int arg0) {
        if (arg0 == -16) {
            byte[] var2 = new byte[this.field3002.capacity()];
            this.field3002.position(0);
            this.field3002.get(var2);
            return var2;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[B)V")
    public final void method506(int arg0, byte[] arg1) {
        this.field3002 = ByteBuffer.allocateDirect(arg1.length);
        this.field3002.position(arg0);
        this.field3002.put(arg1);
    }
}
