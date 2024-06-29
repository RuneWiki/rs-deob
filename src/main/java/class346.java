import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class346 extends class170 {

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field5354;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)[B", line = 5)
    public final byte[] method1197(int arg0) {
        if (arg0 != 2) {
            this.field5354 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field5354.capacity()];
        this.field5354.position(0);
        this.field5354.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z[B)V", line = 20)
    public final void method1200(boolean arg0, byte[] arg1) {
        this.field5354 = ByteBuffer.allocateDirect(arg1.length);
        this.field5354.position(0);
        this.field5354.put(arg1);
        if (arg0) {
            this.field5354 = (ByteBuffer) null;
        }
    }
}
