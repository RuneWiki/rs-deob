import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class2 extends class276 {

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field39;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z[B)V")
    public final void method6(boolean arg0, byte[] arg1) {
        this.field39 = ByteBuffer.allocateDirect(arg1.length);
        this.field39.position(0);
        this.field39.put(arg1);
        if (!arg0) {
            this.field39 = (ByteBuffer) null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)[B")
    public final byte[] method7(byte arg0) {
        if (arg0 != -86) {
            this.field39 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field39.capacity()];
        this.field39.position(0);
        this.field39.get(var2);
        return var2;
    }
}
