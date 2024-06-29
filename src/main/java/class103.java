import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class103 extends class13 {

    @OriginalMember(owner = "client!me", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1869;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)[B", line = 5)
    public final byte[] method111(int arg0) {
        if (arg0 != 1132255303) {
            this.method112(66, (byte[]) null);
        }
        byte[] var2 = new byte[this.field1869.capacity()];
        this.field1869.position(0);
        this.field1869.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I[B)V", line = 21)
    public final void method112(int arg0, byte[] arg1) {
        this.field1869 = ByteBuffer.allocateDirect(arg1.length);
        this.field1869.position(0);
        if (arg0 > 75) {
            this.field1869.put(arg1);
        }
    }
}
