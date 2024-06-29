import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class30 extends class207 {

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field448;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)[B", line = 7)
    public final byte[] method215(int arg0) {
        byte[] var2 = new byte[this.field448.capacity()];
        this.field448.position(0);
        if (arg0 > -110) {
            return (byte[]) null;
        } else {
            this.field448.get(var2);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[B)V", line = 20)
    public final void method216(int arg0, byte[] arg1) {
        if (arg0 > -67) {
            this.method216(120, (byte[]) null);
        }
        this.field448 = ByteBuffer.allocateDirect(arg1.length);
        this.field448.position(0);
        this.field448.put(arg1);
    }
}
