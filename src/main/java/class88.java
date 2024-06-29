import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class88 extends class51 {

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    private ByteBuffer field1376;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)[B")
    public final byte[] method374(byte arg0) {
        byte[] var2 = new byte[this.field1376.capacity()];
        this.field1376.position(0);
        this.field1376.get(var2);
        if (arg0 != 56) {
            this.field1376 = (ByteBuffer) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[B)V")
    public final void method377(int arg0, byte[] arg1) {
        this.field1376 = ByteBuffer.allocateDirect(arg1.length);
        if (arg0 != 9104) {
            this.method377(32, (byte[]) null);
        }
        this.field1376.position(0);
        this.field1376.put(arg1);
    }
}
