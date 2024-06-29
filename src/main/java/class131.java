import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class131 extends class210 {

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1935;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B[B)V")
    public final void method812(byte arg0, byte[] arg1) {
        this.field1935 = ByteBuffer.allocateDirect(arg1.length);
        this.field1935.position(0);
        this.field1935.put(arg1);
        if (arg0 > -88) {
            this.method812((byte) -72, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)[B")
    public final byte[] method813(boolean arg0) {
        if (arg0) {
            this.field1935 = (ByteBuffer) null;
        }
        byte[] var2 = new byte[this.field1935.capacity()];
        this.field1935.position(0);
        this.field1935.get(var2);
        return var2;
    }
}
