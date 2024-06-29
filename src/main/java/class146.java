import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class146 extends class23 {

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field2832;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[B)V")
    public final void method134(int arg0, byte[] arg1) {
        if (arg0 != 128) {
            this.field2832 = null;
        }
        this.field2832 = ByteBuffer.allocateDirect(arg1.length);
        this.field2832.position(0);
        this.field2832.put(arg1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)[B")
    public final byte[] method135(byte arg0) {
        byte[] var2 = new byte[this.field2832.capacity()];
        if (arg0 != 7) {
            this.field2832 = null;
        }
        this.field2832.position(0);
        this.field2832.get(var2);
        return var2;
    }
}
