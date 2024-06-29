import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class82 extends class157 {

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1362;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)[B")
    public final byte[] method568(int arg0) {
        byte[] var2 = new byte[this.field1362.capacity()];
        this.field1362.position(arg0);
        this.field1362.get(var2);
        return var2;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I[B)V")
    public final void method569(int arg0, byte[] arg1) {
        this.field1362 = ByteBuffer.allocateDirect(arg1.length);
        this.field1362.position(0);
        this.field1362.put(arg1);
        if (arg0 < 53) {
            this.method569(125, (byte[]) null);
        }
    }
}
